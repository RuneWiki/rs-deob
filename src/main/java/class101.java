import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class101 {

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1471 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field1476 = 0;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field1470 = 0;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "[Ltj;")
    public static class258[] field1474 = new class258[50];

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field1478 = 99;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "Z")
    public static boolean field1469;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B[Ljava/lang/String;[S)V", line = 12)
    public static final void method695(byte arg0, String[] arg1, short[] arg2) {
        class173.method1307(2047, arg1, arg1.length - 1, arg2, 0);
        field1472++;
        int var3 = -109 % ((arg0 - 29) / 56);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZIIIIII)V", line = 23)
    public static final void method696(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class198.field3231 = arg1;
        class89.field1235 = arg3;
        class200.field3257 = arg6;
        class205.field3368 = arg2;
        field1477++;
        class196.field3198 = arg5;
        if (arg0 && class198.field3231 >= 100) {
            class260.field4150 = class196.field3198 * 128 + 64;
            class120.field1825 = class89.field1235 * 128 + 64;
            class83.field1173 = class123.method889(1, class49.field698, class120.field1825, class260.field4150) - class205.field3368;
        }
        class31.field423 = 2;
        if (arg4 != -10335) {
            method699(-88, -34, 64, -100);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)Lka;", line = 49)
    public static final class235 method697(int arg0) {
        field1475++;
        try {
            return arg0 == -23994 ? (class235) Class.forName("qe").getDeclaredConstructor().newInstance() : (class235) null;
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V", line = 68)
    public static void method698(boolean arg0) {
        if (arg0) {
            field1471 = null;
            field1474 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIII)Z", line = 88)
    public static final boolean method699(int arg0, int arg1, int arg2, int arg3) {
        if (class13.method77(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class66.method442(var4 + 1, class110.field1642[arg0][arg1][arg2] + arg3, var5 + 1) && class66.method442(var4 + 128 - 1, class110.field1642[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class66.method442(var4 + 128 - 1, class110.field1642[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class66.method442(var4 + 1, class110.field1642[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }
}
