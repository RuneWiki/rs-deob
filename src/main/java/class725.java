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

@OriginalClass("client!lga")
public class class725 extends class304 {

    @OriginalMember(owner = "client!lga", name = "j", descriptor = "Ljava/net/ProxySelector;")
    private ProxySelector field10206 = ProxySelector.getDefault();

    @OriginalMember(owner = "client!lga", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field10207;

    @OriginalMember(owner = "client!lga", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field10208;

    @OriginalMember(owner = "client!lga", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;", line = 14)
    private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
        Socket var4 = new Socket(arg0, arg1);
        var4.setSoTimeout(10000);
        OutputStream var5 = var4.getOutputStream();
        if (arg2 == null) {
            var5.write(("CONNECT " + this.field3959 + ":" + this.field3953 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
        } else {
            var5.write(("CONNECT " + this.field3959 + ":" + this.field3953 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
                String var9 = var6.readLine();
                String var10 = "proxy-authenticate: ";
                while (var9 != null && var8 < 50) {
                    if (var9.toLowerCase().startsWith(var10)) {
                        String var11 = var9.substring(var10.length()).trim();
                        int var12 = var11.indexOf(32);
                        if (var12 != -1) {
                            var11 = var11.substring(0, var12);
                        }
                        throw new class260(var11);
                    }
                    var9 = var6.readLine();
                    var8++;
                }
                throw new class260("");
            }
        }
        var5.close();
        var6.close();
        var4.close();
        return null;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(BLjava/net/Proxy;)Ljava/net/Socket;", line = 85)
    private final Socket method4059(byte arg0, Proxy arg1) throws IOException {
        if (arg1.type() == Type.DIRECT) {
            return this.method1785(8883);
        }
        SocketAddress var3 = arg1.address();
        if (!var3 instanceof InetSocketAddress) {
            return null;
        }
        int var4 = 83 % ((16 - arg0) / 62);
        InetSocketAddress var5 = (InetSocketAddress) var3;
        if (arg1.type() == Type.HTTP) {
            String var7 = null;
            try {
                Class var8 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                Method var9 = var8.getDeclaredMethod("getProxyAuth", field10207 == null ? (field10207 = method4060("java.lang.String")) : field10207, Integer.TYPE);
                var9.setAccessible(true);
                Object var10 = var9.invoke(null, var5.getHostName(), Integer.valueOf(var5.getPort()));
                if (var10 != null) {
                    Method var11 = var8.getDeclaredMethod("supportsPreemptiveAuthorization");
                    var11.setAccessible(true);
                    if ((Boolean) var11.invoke(var10)) {
                        Method var12 = var8.getDeclaredMethod("getHeaderName");
                        var12.setAccessible(true);
                        Method var13 = var8.getDeclaredMethod("getHeaderValue", field10208 == null ? (field10208 = method4060("java.net.URL")) : field10208, field10207 == null ? (field10207 = method4060("java.lang.String")) : field10207);
                        var13.setAccessible(true);
                        String var14 = (String) var12.invoke(var10);
                        String var15 = (String) var13.invoke(var10, new URL("https://" + this.field3959 + "/"), "https");
                        var7 = var14 + ": " + var15;
                    }
                }
            } catch (Exception var17) {
            }
            return this.httpProxyConnect(var5.getHostName(), var5.getPort(), var7);
        } else if (arg1.type() == Type.SOCKS) {
            Socket var6 = new Socket(arg1);
            var6.connect(new InetSocketAddress(this.field3959, this.field3953));
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 119)
    public static Class method4060(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(B)Ljava/net/Socket;", line = 164)
    public final Socket method1099(byte arg0) throws IOException {
        boolean var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (!var2) {
            System.setProperty("java.net.useSystemProxies", "true");
        }
        int var3 = -9 / ((55 - arg0) / 39);
        boolean var4 = this.field3953 == 443;
        List var5;
        List var6;
        try {
            var5 = this.field10206.select(new URI((var4 ? "https" : "http") + "://" + this.field3959));
            var6 = this.field10206.select(new URI((var4 ? "http" : "https") + "://" + this.field3959));
        } catch (URISyntaxException var19) {
            return this.method1785(8883);
        }
        var5.addAll(var6);
        Object[] var8 = var5.toArray();
        class260 var9 = null;
        Object[] var10 = var8;
        for (int var11 = 0; var11 < var10.length; var11++) {
            Object var12 = var10[var11];
            Proxy var13 = (Proxy) var12;
            try {
                Socket var14 = this.method4059((byte) 80, var13);
                if (var14 != null) {
                    return var14;
                }
            } catch (class260 var17) {
                var9 = var17;
            } catch (IOException var18) {
            }
        }
        if (var9 != null) {
            throw var9;
        }
        return this.method1785(8883);
    }
}
