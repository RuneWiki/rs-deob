import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.Proxy.Type;
import java.nio.charset.Charset;
import java.util.List;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class360 extends class388 {

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "Ljava/net/ProxySelector;")
    private ProxySelector field5458 = ProxySelector.getDefault();

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field5459;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field5460;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method2296(int arg0) throws IOException {
        boolean var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (!var2) {
            System.setProperty("java.net.useSystemProxies", "true");
        }
        boolean var3 = this.field5819 == 443;
        List var4;
        List var5;
        try {
            var4 = this.field5458.select(new URI((var3 ? "https" : "http") + "://" + this.field5820));
            if (arg0 != 32) {
                this.field5458 = null;
            }
            var5 = this.field5458.select(new URI((var3 ? "http" : "https") + "://" + this.field5820));
        } catch (URISyntaxException var18) {
            return this.method2426(29265);
        }
        var4.addAll(var5);
        Object[] var7 = var4.toArray();
        class500 var8 = null;
        Object[] var9 = var7;
        for (int var10 = 0; var10 < var9.length; var10++) {
            Object var11 = var9[var10];
            Proxy var12 = (Proxy) var11;
            try {
                Socket var13 = this.method2297(true, var12);
                if (var13 != null) {
                    return var13;
                }
            } catch (class500 var16) {
                var8 = var16;
            } catch (IOException var17) {
            }
        }
        if (var8 != null) {
            throw var8;
        }
        return this.method2426(29265);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZLjava/net/Proxy;)Ljava/net/Socket;")
    private final Socket method2297(boolean arg0, Proxy arg1) throws IOException {
        if (arg1.type() == Type.DIRECT) {
            return this.method2426(29265);
        }
        SocketAddress var3 = arg1.address();
        if (!arg0) {
            return (Socket) null;
        } else if (var3 instanceof InetSocketAddress) {
            InetSocketAddress var4 = (InetSocketAddress) var3;
            if (arg1.type() == Type.HTTP) {
                String var5 = null;
                try {
                    Class var6 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                    Method var7 = var6.getDeclaredMethod("getProxyAuth", field5459 == null ? (field5459 = method2298("java.lang.String")) : field5459, Integer.TYPE);
                    var7.setAccessible(true);
                    Object var8 = var7.invoke(null, var4.getHostName(), Integer.valueOf(var4.getPort()));
                    if (var8 != null) {
                        Method var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization");
                        var9.setAccessible(true);
                        if ((Boolean) var9.invoke(var8)) {
                            Method var10 = var6.getDeclaredMethod("getHeaderName");
                            var10.setAccessible(true);
                            Method var11 = var6.getDeclaredMethod("getHeaderValue", field5460 == null ? (field5460 = method2298("java.net.URL")) : field5460, field5459 == null ? (field5459 = method2298("java.lang.String")) : field5459);
                            var11.setAccessible(true);
                            String var12 = (String) var10.invoke(var8);
                            String var13 = (String) var11.invoke(var8, new URL("https://" + this.field5820 + "/"), "https");
                            var5 = var12 + ": " + var13;
                        }
                    }
                } catch (Exception var16) {
                }
                return this.httpProxyConnect(var4.getHostName(), var4.getPort(), var5);
            } else if (arg1.type() == Type.SOCKS) {
                Socket var15 = new Socket(arg1);
                var15.connect(new InetSocketAddress(this.field5820, this.field5819));
                return var15;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
    private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
        Socket var4 = new Socket(arg0, arg1);
        var4.setSoTimeout(10000);
        OutputStream var5 = var4.getOutputStream();
        if (arg2 == null) {
            var5.write(("CONNECT " + this.field5820 + ":" + this.field5819 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
        } else {
            var5.write(("CONNECT " + this.field5820 + ":" + this.field5819 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
        }
        var5.flush();
        BufferedReader var6 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
        String var7 = var6.readLine();
        if (var7 != null) {
            if (var7.startsWith("HTTP/1.0 200") || var7.startsWith("HTTP/1.1 200")) {
                return var4;
            }
            if (var7.startsWith("HTTP/1.0 407") || var7.startsWith("HTTP/1.1 407")) {
                int var8 = 0;
                String var9 = "proxy-authenticate: ";
                String var10 = var6.readLine();
                while (var10 != null && var8 < 50) {
                    if (var10.toLowerCase().startsWith(var9)) {
                        String var11 = var10.substring(var9.length()).trim();
                        int var12 = var11.indexOf(32);
                        if (var12 != -1) {
                            var11 = var11.substring(0, var12);
                        }
                        throw new class500(var11);
                    }
                    var10 = var6.readLine();
                    var8++;
                }
                throw new class500("");
            }
        }
        var5.close();
        var6.close();
        var4.close();
        return null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2298(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
