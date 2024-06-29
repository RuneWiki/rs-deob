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

@OriginalClass("client!ij")
public class class618 extends class353 {

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "Ljava/net/ProxySelector;")
    private ProxySelector field8649 = ProxySelector.getDefault();

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field8650;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field8651;

    @OriginalMember(owner = "client!ij", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;", line = 13)
    private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
        Socket var4 = new Socket(arg0, arg1);
        var4.setSoTimeout(10000);
        OutputStream var5 = var4.getOutputStream();
        if (arg2 == null) {
            var5.write(("CONNECT " + this.field4500 + ":" + this.field4502 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
        } else {
            var5.write(("CONNECT " + this.field4500 + ":" + this.field4502 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
                        throw new class406(var11);
                    }
                    var9 = var6.readLine();
                    var8++;
                }
                throw new class406("");
            }
        }
        var5.close();
        var6.close();
        var4.close();
        return null;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)Ljava/net/Socket;", line = 88)
    public final Socket method1909(int arg0) throws IOException {
        boolean var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (arg0 >= -116) {
            return (Socket) null;
        }
        if (!var2) {
            System.setProperty("java.net.useSystemProxies", "true");
        }
        boolean var3 = this.field4502 == 443;
        List var4;
        List var5;
        try {
            var4 = this.field8649.select(new URI((var3 ? "https" : "http") + "://" + this.field4500));
            var5 = this.field8649.select(new URI((var3 ? "http" : "https") + "://" + this.field4500));
        } catch (URISyntaxException var18) {
            return this.method1936(false);
        }
        var4.addAll(var5);
        Object[] var7 = var4.toArray();
        class406 var8 = null;
        Object[] var9 = var7;
        for (int var10 = 0; var10 < var9.length; var10++) {
            Object var11 = var9[var10];
            Proxy var12 = (Proxy) var11;
            try {
                Socket var13 = this.method3398((byte) -11, var12);
                if (var13 != null) {
                    return var13;
                }
            } catch (class406 var16) {
                var8 = var16;
            } catch (IOException var17) {
            }
        }
        if (var8 != null) {
            throw var8;
        }
        return this.method1936(false);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLjava/net/Proxy;)Ljava/net/Socket;", line = 159)
    private final Socket method3398(byte arg0, Proxy arg1) throws IOException {
        if (arg1.type() == Type.DIRECT) {
            return this.method1936(false);
        }
        SocketAddress var3 = arg1.address();
        if (!(var3 instanceof InetSocketAddress)) {
            return null;
        }
        int var4 = -73 % ((-arg0 - 62) / 48);
        InetSocketAddress var5 = (InetSocketAddress) var3;
        if (arg1.type() == Type.HTTP) {
            String var7 = null;
            try {
                Class var8 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                Method var9 = var8.getDeclaredMethod("getProxyAuth", field8650 == null ? (field8650 = method3399("java.lang.String")) : field8650, Integer.TYPE);
                var9.setAccessible(true);
                Object var10 = var9.invoke(null, var5.getHostName(), Integer.valueOf(var5.getPort()));
                if (var10 != null) {
                    Method var11 = var8.getDeclaredMethod("supportsPreemptiveAuthorization");
                    var11.setAccessible(true);
                    if ((Boolean) var11.invoke(var10)) {
                        Method var12 = var8.getDeclaredMethod("getHeaderName");
                        var12.setAccessible(true);
                        Method var13 = var8.getDeclaredMethod("getHeaderValue", field8651 == null ? (field8651 = method3399("java.net.URL")) : field8651, field8650 == null ? (field8650 = method3399("java.lang.String")) : field8650);
                        var13.setAccessible(true);
                        String var14 = (String) var12.invoke(var10);
                        String var15 = (String) var13.invoke(var10, new URL("https://" + this.field4500 + "/"), "https");
                        var7 = var14 + ": " + var15;
                    }
                }
            } catch (Exception var17) {
            }
            return this.httpProxyConnect(var5.getHostName(), var5.getPort(), var7);
        } else if (arg1.type() == Type.SOCKS) {
            Socket var6 = new Socket(arg1);
            var6.connect(new InetSocketAddress(this.field4500, this.field4502));
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 189)
    public static Class method3399(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
