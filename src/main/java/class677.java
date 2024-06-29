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

@OriginalClass("client!fh")
public class class677 extends class74 {

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Ljava/net/ProxySelector;")
    private ProxySelector field9423 = ProxySelector.getDefault();

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field9424;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field9425;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method588(int arg0) throws IOException {
        if (arg0 <= 28) {
            return (Socket) null;
        }
        boolean var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (!var2) {
            System.setProperty("java.net.useSystemProxies", "true");
        }
        boolean var3 = this.field848 == 443;
        List var4;
        List var5;
        try {
            var4 = this.field9423.select(new URI((var3 ? "https" : "http") + "://" + this.field849));
            var5 = this.field9423.select(new URI((var3 ? "http" : "https") + "://" + this.field849));
        } catch (URISyntaxException var18) {
            return this.method585(0);
        }
        var4.addAll(var5);
        Object[] var7 = var4.toArray();
        class328 var8 = null;
        Object[] var9 = var7;
        for (int var10 = 0; var10 < var9.length; var10++) {
            Object var11 = var9[var10];
            Proxy var12 = (Proxy) var11;
            try {
                Socket var13 = this.method3842((byte) 84, var12);
                if (var13 != null) {
                    return var13;
                }
            } catch (class328 var16) {
                var8 = var16;
            } catch (IOException var17) {
            }
        }
        if (var8 != null) {
            throw var8;
        }
        return this.method585(0);
    }

    @OriginalMember(owner = "client!fh", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
    private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
        Socket var4 = new Socket(arg0, arg1);
        var4.setSoTimeout(10000);
        OutputStream var5 = var4.getOutputStream();
        if (arg2 == null) {
            var5.write(("CONNECT " + this.field849 + ":" + this.field848 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
        } else {
            var5.write(("CONNECT " + this.field849 + ":" + this.field848 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
                        throw new class328(var11);
                    }
                    var8++;
                }
                throw new class328("");
            }
        }
        var5.close();
        var6.close();
        var4.close();
        return null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLjava/net/Proxy;)Ljava/net/Socket;")
    private final Socket method3842(byte arg0, Proxy arg1) throws IOException {
        if (arg1.type() == Type.DIRECT) {
            return this.method585(0);
        }
        if (arg0 != 84) {
            this.field9423 = null;
        }
        SocketAddress var3 = arg1.address();
        if (!(var3 instanceof InetSocketAddress)) {
            return null;
        }
        InetSocketAddress var4 = (InetSocketAddress) var3;
        if (arg1.type() == Type.HTTP) {
            String var6 = null;
            try {
                Class var7 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                Method var8 = var7.getDeclaredMethod("getProxyAuth", field9424 == null ? (field9424 = method3843("java.lang.String")) : field9424, Integer.TYPE);
                var8.setAccessible(true);
                Object var9 = var8.invoke(null, var4.getHostName(), Integer.valueOf(var4.getPort()));
                if (var9 != null) {
                    Method var10 = var7.getDeclaredMethod("supportsPreemptiveAuthorization");
                    var10.setAccessible(true);
                    if ((Boolean) var10.invoke(var9)) {
                        Method var11 = var7.getDeclaredMethod("getHeaderName");
                        var11.setAccessible(true);
                        Method var12 = var7.getDeclaredMethod("getHeaderValue", field9425 == null ? (field9425 = method3843("java.net.URL")) : field9425, field9424 == null ? (field9424 = method3843("java.lang.String")) : field9424);
                        var12.setAccessible(true);
                        String var13 = (String) var11.invoke(var9);
                        String var14 = (String) var12.invoke(var9, new URL("https://" + this.field849 + "/"), "https");
                        var6 = var13 + ": " + var14;
                    }
                }
            } catch (Exception var16) {
            }
            return this.httpProxyConnect(var4.getHostName(), var4.getPort(), var6);
        } else if (arg1.type() == Type.SOCKS) {
            Socket var5 = new Socket(arg1);
            var5.connect(new InetSocketAddress(this.field849, this.field848));
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3843(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
