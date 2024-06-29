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

@OriginalClass("client!nj")
public class class221 extends class351 {

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "Ljava/net/ProxySelector;")
    private ProxySelector field3197 = ProxySelector.getDefault();

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method1408(int arg0) throws IOException {
        boolean var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (!var2) {
            System.setProperty("java.net.useSystemProxies", "true");
        }
        boolean var3 = this.field5050 == 443;
        List var4;
        List var5;
        try {
            var4 = this.field3197.select(new URI((var3 ? "https" : "http") + "://" + this.field5053));
            var5 = this.field3197.select(new URI((var3 ? "http" : "https") + "://" + this.field5053));
        } catch (URISyntaxException var18) {
            return this.method2083((byte) 118);
        }
        var4.addAll(var5);
        Object[] var7 = var4.toArray();
        class83 var8 = null;
        Object[] var9 = var7;
        for (int var10 = arg0; var10 < var9.length; var10++) {
            Object var11 = var9[var10];
            Proxy var12 = (Proxy) var11;
            try {
                Socket var13 = this.method1421(23642, var12);
                if (var13 != null) {
                    return var13;
                }
            } catch (class83 var16) {
                var8 = var16;
            } catch (IOException var17) {
            }
        }
        if (var8 != null) {
            throw var8;
        }
        return this.method2083((byte) 126);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;")
    private final Socket method1421(int arg0, Proxy arg1) throws IOException {
        if (arg0 != 23642) {
            return (Socket) null;
        } else if (arg1.type() == Type.DIRECT) {
            return this.method2083((byte) -128);
        } else {
            SocketAddress var3 = arg1.address();
            if (!(var3 instanceof InetSocketAddress)) {
                return null;
            }
            InetSocketAddress var4 = (InetSocketAddress) var3;
            if (arg1.type() == Type.HTTP) {
                return this.httpProxyConnect(var4.getHostName(), var4.getPort());
            } else if (arg1.type() == Type.SOCKS) {
                Socket var5 = new Socket(arg1);
                var5.connect(new InetSocketAddress(this.field5053, this.field5050));
                return var5;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;I)Ljava/net/Socket;")
    private final Socket httpProxyConnect(String arg0, int arg1) throws IOException {
        Socket var3 = new Socket(arg0, arg1);
        var3.setSoTimeout(10000);
        OutputStream var4 = var3.getOutputStream();
        var4.write(("CONNECT " + this.field5053 + ":" + this.field5050 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
        var4.flush();
        BufferedReader var5 = new BufferedReader(new InputStreamReader(var3.getInputStream()));
        String var6 = var5.readLine();
        if (var6 != null) {
            if (var6.startsWith("HTTP/1.0 200") || var6.startsWith("HTTP/1.1 200")) {
                return var3;
            }
            if (var6.startsWith("HTTP/1.0 407") || var6.startsWith("HTTP/1.1 407")) {
                int var7 = 0;
                String var8 = var5.readLine();
                String var9 = "Proxy-Authenticate: ";
                while (var8 != null && var7 < 50) {
                    if (var8.startsWith(var9)) {
                        String var10 = var8.substring(var9.length()).trim();
                        int var11 = var10.indexOf(32);
                        if (var11 != -1) {
                            var10 = var10.substring(0, var11);
                        }
                        throw new class83(var10);
                    }
                    var7++;
                    var8 = var5.readLine();
                }
                throw new class83("");
            }
        }
        var4.close();
        var5.close();
        var3.close();
        return null;
    }
}
