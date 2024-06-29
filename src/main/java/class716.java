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

@OriginalClass("client!bs")
public class class716 extends class360 {

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "Ljava/net/ProxySelector;")
    private ProxySelector field9850 = ProxySelector.getDefault();

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field9851;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field9852;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)Ljava/net/Socket;", line = 13)
    public final Socket method912(byte arg0) throws IOException {
        boolean var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (!var2) {
            System.setProperty("java.net.useSystemProxies", "true");
        }
        boolean var3 = this.field4915 == 443;
        List var4;
        List var5;
        try {
            if (arg0 <= 98) {
                return (Socket) null;
            }
            var4 = this.field9850.select(new URI((var3 ? "https" : "http") + "://" + this.field4918));
            var5 = this.field9850.select(new URI((var3 ? "http" : "https") + "://" + this.field4918));
        } catch (URISyntaxException var18) {
            return this.method2216((byte) 97);
        }
        var4.addAll(var5);
        Object[] var7 = var4.toArray();
        class565 var8 = null;
        Object[] var9 = var7;
        for (int var10 = 0; var10 < var9.length; var10++) {
            Object var11 = var9[var10];
            Proxy var12 = (Proxy) var11;
            try {
                Socket var13 = this.method3983((byte) 99, var12);
                if (var13 != null) {
                    return var13;
                }
            } catch (class565 var16) {
                var8 = var16;
            } catch (IOException var17) {
            }
        }
        if (var8 != null) {
            throw var8;
        }
        return this.method2216((byte) 97);
    }

    @OriginalMember(owner = "client!bs", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;", line = 86)
    private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
        Socket var4 = new Socket(arg0, arg1);
        var4.setSoTimeout(10000);
        OutputStream var5 = var4.getOutputStream();
        if (arg2 == null) {
            var5.write(("CONNECT " + this.field4918 + ":" + this.field4915 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
        } else {
            var5.write(("CONNECT " + this.field4918 + ":" + this.field4915 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
                for (String var10 = var6.readLine(); var10 != null && var8 < 50; var10 = var6.readLine()) {
                    if (var10.toLowerCase().startsWith(var9)) {
                        String var11 = var10.substring(var9.length()).trim();
                        int var12 = var11.indexOf(32);
                        if (var12 != -1) {
                            var11 = var11.substring(0, var12);
                        }
                        throw new class565(var11);
                    }
                    var8++;
                }
                throw new class565("");
            }
        }
        var5.close();
        var6.close();
        var4.close();
        return null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BLjava/net/Proxy;)Ljava/net/Socket;", line = 160)
    private final Socket method3983(byte arg0, Proxy arg1) throws IOException {
        if (arg1.type() == Type.DIRECT) {
            return this.method2216((byte) 97);
        }
        SocketAddress var3 = arg1.address();
        if (!(var3 instanceof InetSocketAddress)) {
            return null;
        }
        int var4 = -35 % ((30 - arg0) / 60);
        InetSocketAddress var5 = (InetSocketAddress) var3;
        if (arg1.type() == Type.HTTP) {
            String var7 = null;
            try {
                Class var8 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                Method var9 = var8.getDeclaredMethod("getProxyAuth", field9851 == null ? (field9851 = method3984("java.lang.String")) : field9851, Integer.TYPE);
                var9.setAccessible(true);
                Object var10 = var9.invoke(null, var5.getHostName(), Integer.valueOf(var5.getPort()));
                if (var10 != null) {
                    Method var11 = var8.getDeclaredMethod("supportsPreemptiveAuthorization");
                    var11.setAccessible(true);
                    if ((Boolean) var11.invoke(var10)) {
                        Method var12 = var8.getDeclaredMethod("getHeaderName");
                        var12.setAccessible(true);
                        Method var13 = var8.getDeclaredMethod("getHeaderValue", field9852 == null ? (field9852 = method3984("java.net.URL")) : field9852, field9851 == null ? (field9851 = method3984("java.lang.String")) : field9851);
                        var13.setAccessible(true);
                        String var14 = (String) var12.invoke(var10);
                        String var15 = (String) var13.invoke(var10, new URL("https://" + this.field4918 + "/"), "https");
                        var7 = var14 + ": " + var15;
                    }
                }
            } catch (Exception var17) {
            }
            return this.httpProxyConnect(var5.getHostName(), var5.getPort(), var7);
        } else if (arg1.type() == Type.SOCKS) {
            Socket var6 = new Socket(arg1);
            var6.connect(new InetSocketAddress(this.field4918, this.field4915));
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 190)
    public static Class method3984(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
