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

@OriginalClass("client!dl")
public class class279 extends class240 {

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Ljava/net/ProxySelector;")
    private ProxySelector field3770 = ProxySelector.getDefault();

    @OriginalMember(owner = "client!dl", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;I)Ljava/net/Socket;", line = 13)
    private final Socket httpProxyConnect(String arg0, int arg1) throws IOException {
        Socket var3 = new Socket(arg0, arg1);
        var3.setSoTimeout(10000);
        OutputStream var4 = var3.getOutputStream();
        var4.write(("CONNECT " + this.field3152 + ":" + this.field3148 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
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

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)Ljava/net/Socket;", line = 45)
    public final Socket method458(int arg0) throws IOException {
        if (arg0 != 21974) {
            return (Socket) null;
        }
        boolean var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (!var2) {
            System.setProperty("java.net.useSystemProxies", "true");
        }
        boolean var3 = this.field3148 == 443;
        List var4;
        List var5;
        try {
            var4 = this.field3770.select(new URI((var3 ? "https" : "http") + "://" + this.field3152));
            var5 = this.field3770.select(new URI((var3 ? "http" : "https") + "://" + this.field3152));
        } catch (URISyntaxException var15) {
            return this.method1484((byte) 71);
        }
        var4.addAll(var5);
        Object[] var7 = var4.toArray();
        Object[] var8 = var7;
        for (int var9 = 0; var9 < var8.length; var9++) {
            Object var10 = var8[var9];
            Proxy var11 = (Proxy) var10;
            try {
                Socket var12 = this.method1690(var11, (byte) -63);
                if (var12 != null) {
                    return var12;
                }
            } catch (IOException var14) {
            }
        }
        return this.method1484((byte) 92);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/net/Proxy;B)Ljava/net/Socket;", line = 113)
    private final Socket method1690(Proxy arg0, byte arg1) throws IOException {
        if (arg0.type() == Type.DIRECT) {
            return this.method1484((byte) 88);
        }
        SocketAddress var3 = arg0.address();
        if (!(var3 instanceof InetSocketAddress)) {
            return null;
        } else if (arg1 == -63) {
            InetSocketAddress var4 = (InetSocketAddress) var3;
            if (arg0.type() == Type.HTTP) {
                return this.httpProxyConnect(var4.getHostName(), var4.getPort());
            } else if (arg0.type() == Type.SOCKS) {
                Socket var5 = new Socket(arg0);
                var5.connect(new InetSocketAddress(this.field3152, this.field3148));
                return var5;
            } else {
                return null;
            }
        } else {
            return (Socket) null;
        }
    }
}
