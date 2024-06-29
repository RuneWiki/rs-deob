import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class66 {

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "[[I")
    public static int[][] field909 = new int[6][];

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "Ljava/lang/String;")
    public static String field910;

    @OriginalMember(owner = "client!vha", name = "c", descriptor = "Ljava/lang/String;")
    public static String field911;

    @OriginalMember(owner = "client!vha", name = "e", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!vha", name = "f", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!vha", name = "d", descriptor = "[Lvca;")
    public static class270[] field912;

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
        field910 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field911 = var3.toLowerCase();
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

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(ILvj;)Ljava/lang/String;", line = 5)
    public static final String method431(int arg0, class26 arg1) {
        if (arg0 <= 80) {
            return null;
        } else {
            field913++;
            return class625.method3655(32767, (byte) 66, arg1);
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(BI)Z", line = 20)
    public static final boolean method432(byte arg0, int arg1) {
        field914++;
        if (arg0 <= 95) {
            return true;
        } else {
            return arg1 == 3 || arg1 == 4 || arg1 == 5 || arg1 == 6;
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(I)V", line = 36)
    public static void method433(int arg0) {
        if (arg0 == 4) {
            field911 = null;
            field909 = null;
            field912 = null;
            field910 = null;
        }
    }
}
