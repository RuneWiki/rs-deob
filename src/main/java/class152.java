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

@OriginalClass("client!aba")
public class class152 extends class440 {

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "Ljava/net/ProxySelector;")
    private ProxySelector field1861 = ProxySelector.getDefault();

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)Ljava/net/Socket;", line = 13)
    public final Socket method893(byte arg0) throws IOException {
        boolean var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (!var2) {
            System.setProperty("java.net.useSystemProxies", "true");
        }
        boolean var3 = this.field6572 == 443;
        List var4;
        List var5;
        try {
            var4 = this.field1861.select(new URI((var3 ? "https" : "http") + "://" + this.field6567));
            var5 = this.field1861.select(new URI((var3 ? "http" : "https") + "://" + this.field6567));
        } catch (URISyntaxException var15) {
            return this.method2740(-2001);
        }
        var4.addAll(var5);
        Object[] var7 = var4.toArray();
        if (arg0 != -68) {
            this.field1861 = null;
        }
        Object[] var8 = var7;
        for (int var9 = 0; var9 < var8.length; var9++) {
            Object var10 = var8[var9];
            Proxy var11 = (Proxy) var10;
            try {
                Socket var12 = this.method894(117, var11);
                if (var12 != null) {
                    return var12;
                }
            } catch (IOException var14) {
            }
        }
        return this.method2740(arg0 ^ 0x793);
    }

    @OriginalMember(owner = "client!aba", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;I)Ljava/net/Socket;", line = 77)
    private final Socket httpProxyConnect(String arg0, int arg1) throws IOException {
        Socket var3 = new Socket(arg0, arg1);
        var3.setSoTimeout(10000);
        OutputStream var4 = var3.getOutputStream();
        var4.write(("CONNECT " + this.field6567 + ":" + this.field6572 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
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

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;", line = 107)
    private final Socket method894(int arg0, Proxy arg1) throws IOException {
        if (arg0 < 110) {
            this.field1861 = null;
        }
        if (arg1.type() == Type.DIRECT) {
            return this.method2740(-2001);
        }
        SocketAddress var3 = arg1.address();
        if (!var3 instanceof InetSocketAddress) {
            return null;
        }
        InetSocketAddress var4 = (InetSocketAddress) var3;
        if (arg1.type() == Type.HTTP) {
            return this.httpProxyConnect(var4.getHostName(), var4.getPort());
        } else if (arg1.type() == Type.SOCKS) {
            Socket var5 = new Socket(arg1);
            var5.connect(new InetSocketAddress(this.field6567, this.field6572));
            return var5;
        } else {
            return null;
        }
    }
}
