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

@OriginalClass("client!wf")
public class class39 extends class155 {

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "Ljava/net/ProxySelector;")
    private ProxySelector field599 = ProxySelector.getDefault();

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field602 = new String[] { method451(method450("\u001aJ<Az\u001bK?ag\fZ!Aa\u0000I)p`\u001dW#C|\u0013^8Xz\u0007")), method451(method450("S\u001f")), method451(method450("\u0003^:P;\u0005^\"V;:K>X{\u000e")), method451(method450("\u000eZ8ag\u0006G5p`\u001dW")), method451(method450("\u0001K8AfS\u0010c")), method451(method450("\u001aJ\"\u001f{\fKbFb\u001e\u0011<Cz\u001dP/^yGW8EeG~9E}\fQ8Xv\bK%^{ Q*^")), method451(method450("\u0001K8Af")), method451(method450("\u000eZ8yp\b[)C[\bR)")), method451(method450("\u000eZ8yp\b[)CC\bS9T")), method451(method450("\u0003^:P;\u0007Z8\u001f@;s")), method451(method450("\u0019M#IlD^9E}\fQ8Xv\bK)\u000b5")), method451(method450("!k\u0018a:X\u0011|\u0011!Y\b")), method451(method450("*p\u0002\u007fP*kl")), method451(method450(" l\u0003\u001c-Q\nu\u001c$")), method451(method450("!k\u0018a:X\u0011}\u0011!Y\b")), method451(method450("Iw\u0018eEF\u000eb\u0001\u001f")), method451(method450("c5")), method451(method450("!k\u0018a:X\u0011}\u0011'Y\u000f")), method451(method450("!k\u0018a:X\u0011|\u0011'Y\u000f")), method451(method450("Iw\u0018eEF\u000eb\u0001\u001fc")), method451(method450("\u001dM9T")), method451(method450("\u0003^:P;\u0007Z8\u001f`\u001aZ\u001fHf\u001dZ!ag\u0006G%Tf")), method451(method450("S\u0010c")), method451(method450("\u0001K8A")) };

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field600;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field601;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)Ljava/net/Socket;")
    public final Socket method447(byte arg0) throws IOException {
        boolean var2 = Boolean.parseBoolean(System.getProperty(field602[21]));
        if (!var2) {
            System.setProperty(field602[21], field602[20]);
        }
        boolean var3 = this.field1966 == 443;
        List var4;
        List var5;
        try {
            var4 = this.field599.select(new URI((var3 ? field602[6] : field602[23]) + field602[22] + this.field1969));
            var5 = this.field599.select(new URI((var3 ? field602[23] : field602[6]) + field602[22] + this.field1969));
        } catch (URISyntaxException var18) {
            return this.method1304((byte) -124);
        }
        var4.addAll(var5);
        Object[] var7 = var4.toArray();
        class132 var8 = null;
        Object[] var9 = var7;
        for (int var10 = 0; var10 < var9.length; var10++) {
            Object var11 = var9[var10];
            Proxy var12 = (Proxy) var11;
            try {
                Socket var13 = this.method448(-23087, var12);
                if (var13 != null) {
                    return var13;
                }
            } catch (class132 var16) {
                var8 = var16;
            } catch (IOException var17) {
            }
        }
        if (arg0 != -77) {
            return (Socket) null;
        } else if (var8 == null) {
            return this.method1304((byte) -120);
        } else {
            throw var8;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;")
    private final Socket method448(int arg0, Proxy arg1) throws IOException {
        if (arg1.type() == Type.DIRECT) {
            return this.method1304((byte) -128);
        } else if (arg0 == -23087) {
            SocketAddress var3 = arg1.address();
            if (!(var3 instanceof InetSocketAddress)) {
                return null;
            }
            InetSocketAddress var4 = (InetSocketAddress) var3;
            if (arg1.type() == Type.HTTP) {
                String var5 = null;
                try {
                    Class var6 = Class.forName(field602[5]);
                    Method var7 = var6.getDeclaredMethod(field602[3], field600 == null ? (field600 = method449(field602[2])) : field600, Integer.TYPE);
                    var7.setAccessible(true);
                    Object var8 = var7.invoke(null, var4.getHostName(), Integer.valueOf(var4.getPort()));
                    if (var8 != null) {
                        Method var9 = var6.getDeclaredMethod(field602[0]);
                        var9.setAccessible(true);
                        if ((Boolean) var9.invoke(var8)) {
                            Method var10 = var6.getDeclaredMethod(field602[7]);
                            var10.setAccessible(true);
                            Method var11 = var6.getDeclaredMethod(field602[8], field601 == null ? (field601 = method449(field602[9])) : field601, field600 == null ? (field600 = method449(field602[2])) : field600);
                            var11.setAccessible(true);
                            String var12 = (String) var10.invoke(var8);
                            String var13 = (String) var11.invoke(var8, new URL(field602[4] + this.field1969 + "/"), field602[6]);
                            var5 = var12 + field602[1] + var13;
                        }
                    }
                } catch (Exception var16) {
                }
                return this.httpProxyConnect(var4.getHostName(), var4.getPort(), var5);
            } else if (arg1.type() == Type.SOCKS) {
                Socket var15 = new Socket(arg1);
                var15.connect(new InetSocketAddress(this.field1969, this.field1966));
                return var15;
            } else {
                return null;
            }
        } else {
            return (Socket) null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
    private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
        Socket var4 = new Socket(arg0, arg1);
        var4.setSoTimeout(10000);
        OutputStream var5 = var4.getOutputStream();
        if (arg2 == null) {
            var5.write((field602[12] + this.field1969 + ":" + this.field1966 + field602[19]).getBytes(Charset.forName(field602[13])));
        } else {
            var5.write((field602[12] + this.field1969 + ":" + this.field1966 + field602[15] + arg2 + field602[16]).getBytes(Charset.forName(field602[13])));
        }
        var5.flush();
        BufferedReader var6 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
        String var7 = var6.readLine();
        if (var7 != null) {
            if (var7.startsWith(field602[18]) || var7.startsWith(field602[17])) {
                return var4;
            }
            if (var7.startsWith(field602[11]) || var7.startsWith(field602[14])) {
                int var8 = 0;
                String var9 = var6.readLine();
                String var10 = field602[10];
                while (var9 != null && var8 < 50) {
                    if (var9.toLowerCase().startsWith(var10)) {
                        String var11 = var9.substring(var10.length()).trim();
                        int var12 = var11.indexOf(32);
                        if (var12 != -1) {
                            var11 = var11.substring(0, var12);
                        }
                        throw new class132(var11);
                    }
                    var8++;
                    var9 = var6.readLine();
                }
                throw new class132("");
            }
        }
        var5.close();
        var6.close();
        var4.close();
        return null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method449(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method450(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x15);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method451(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 105;
                    break;
                case 1:
                    var10005 = 63;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 49;
                    break;
                default:
                    var10005 = 21;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
