import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class139 {

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field2459 = 0;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2460;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2458;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "Lf;")
    public static class702 field2462;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method1136(int arg0) {
        int var1 = 61 % ((10 - arg0) / 51);
        field2458 = null;
        field2462 = null;
        field2460 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
    public static final void method1137(int arg0, int arg1, int arg2) {
        class370 var3 = class257.field3792[arg0][arg1][arg2];
        if (var3 != null) {
            class104.method965(var3.field5494);
            if (var3.field5494 != null) {
                var3.field5494 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public static final void method1138(byte arg0) {
        if (class199.field3098 == 9) {
            class118.method1038(5, arg0 ^ 0x29);
        } else if (class199.field3098 == 5 || class199.field3098 == 6) {
            class118.method1038(3, 1);
        } else if (class199.field3098 == 12) {
            class118.method1038(3, 1);
        }
        field2457++;
        if (arg0 != 40) {
            method1137(-111, 55, -37);
        }
    }

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
        field2460 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field2458 = var3.toLowerCase();
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
        field2461 = -1;
    }
}
