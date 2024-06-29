import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.Proxy.Type;
import java.nio.charset.Charset;
import java.util.List;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class540 extends class551 {

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "Ljava/net/ProxySelector;")
    private ProxySelector field7760 = ProxySelector.getDefault();

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)Ljava/net/Socket;", line = 15)
    public final Socket method1022(byte arg0) throws IOException {
        boolean var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (!var2) {
            System.setProperty("java.net.useSystemProxies", "true");
        }
        boolean var3 = this.field7863 == 443;
        List var4;
        List var5;
        try {
            var4 = this.field7760.select(new URI((var3 ? "https" : "http") + "://" + this.field7864));
            var5 = this.field7760.select(new URI((var3 ? "http" : "https") + "://" + this.field7864));
        } catch (URISyntaxException var15) {
            return this.method3108((byte) -92);
        }
        var4.addAll(var5);
        Object[] var7 = var4.toArray();
        if (arg0 < 119) {
            this.field7760 = null;
        }
        Object[] var8 = var7;
        for (int var9 = 0; var9 < var8.length; var9++) {
            Object var10 = var8[var9];
            Proxy var11 = (Proxy) var10;
            try {
                Socket var12 = this.method3073((byte) -68, var11);
                if (var12 != null) {
                    return var12;
                }
            } catch (IOException var14) {
            }
        }
        return this.method3108((byte) -74);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(BLjava/net/Proxy;)Ljava/net/Socket;", line = 77)
    private final Socket method3073(byte arg0, Proxy arg1) throws IOException {
        if (arg1.type() == Type.DIRECT) {
            return this.method3108((byte) -36);
        }
        SocketAddress var3 = arg1.address();
        if (!(var3 instanceof InetSocketAddress)) {
            return null;
        } else if (arg0 >= -25) {
            return (Socket) null;
        } else {
            InetSocketAddress var4 = (InetSocketAddress) var3;
            if (arg1.type() == Type.HTTP) {
                return this.httpProxyConnect(var4.getHostName(), var4.getPort());
            } else if (arg1.type() == Type.SOCKS) {
                Socket var5 = new Socket(arg1);
                var5.connect(new InetSocketAddress(this.field7864, this.field7863));
                return var5;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;I)Ljava/net/Socket;", line = 113)
    private final Socket httpProxyConnect(String arg0, int arg1) throws IOException {
        Socket var3 = new Socket(arg0, arg1);
        var3.setSoTimeout(10000);
        OutputStream var4 = var3.getOutputStream();
        var4.write(("CONNECT " + this.field7864 + ":" + this.field7863 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
        var4.flush();
        BufferedReader var5 = new BufferedReader(new InputStreamReader(var3.getInputStream()));
        String var6 = var5.readLine();
        if (var6 != null && var6.startsWith("HTTP/1.0 200")) {
            return var3;
        } else {
            var4.close();
            var5.close();
            var3.close();
            return null;
        }
    }
}
