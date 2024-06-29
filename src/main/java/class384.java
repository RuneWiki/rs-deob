import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class384 {

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5205;

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5206;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!uia", name = "d", descriptor = "[I")
    public static int[] field5207;

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field5205 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field5206 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)V", line = 4)
    public static void method2328(int arg0) {
        if (arg0 != 34037) {
            field5207 = null;
        }
        field5205 = null;
        field5206 = null;
        field5207 = null;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(IIZILhk;IB[B)Lvq;", line = 20)
    public static final class488 method2329(int arg0, int arg1, boolean arg2, int arg3, class111 arg4, int arg5, byte arg6, byte[] arg7) {
        if (arg6 != 113) {
            method2329(-106, -78, true, 114, null, 38, (byte) -66, null);
        }
        field5204++;
        if (!arg4.field1979 && (!class461.method2656(0, arg1) || !class461.method2656(0, arg3))) {
            return arg4.field1989 ? new class488(arg4, 34037, arg5, arg1, arg3, arg2, arg7, arg0) : new class488(arg4, arg5, arg1, arg3, class241.method1609((byte) -109, arg1), class241.method1609((byte) -77, arg3), arg7, arg0);
        } else {
            return new class488(arg4, 3553, arg5, arg1, arg3, arg2, arg7, arg0);
        }
    }
}
