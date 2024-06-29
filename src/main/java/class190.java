import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class190 extends class47 {

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "Llh;")
    public class235 field2847;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "Lcu;")
    public class184 field2849;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    public static int field2851 = -50;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "J")
    public static long field2856 = 0L;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
    public static int field2859 = 0;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "I")
    public static int field2860 = 1;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
    public int field2848;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
    public int field2850;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public int field2854;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
    public int field2855;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    public int field2857;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "Z")
    public static boolean field2853;

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "[Lij;")
    public static class241[] field2858;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public static void method1336(boolean arg0) {
        if (arg0) {
            method1338((byte) 114);
        }
        field2858 = null;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
    public final void method1337(int arg0) {
        field2846++;
        this.field2855 = this.field2847.field3413;
        this.field2857 = this.field2847.field3416;
        this.field2848 = this.field2847.field3411;
        if (this.field2847.field3417 != null) {
            this.field2847.field3417.method108(this.field2849.field2779, this.field2849.field2772, this.field2849.field2762, class301.field4262);
        }
        this.field2854 = class301.field4262[0];
        this.field2850 = class301.field4262[2];
        int var2 = -122 % ((-arg0 - 43) / 32);
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)V")
    public static final void method1338(byte arg0) {
        field2845++;
        if (arg0 != -101) {
            field2853 = false;
        }
        for (class265 var1 = (class265) class422.field5849.method775(1); var1 != null; var1 = (class265) class422.field5849.method763(0)) {
            class222 var2 = var1.field3817;
            if (var2.field3214) {
                var1.method2714(-88);
                var2.method1524(-83);
            } else if (class364.field5010 >= var2.field3216) {
                var2.method1525(class385.field5283, -17634);
                if (var2.field3214) {
                    var1.method2714(41);
                } else {
                    class363.method2230(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1339(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2852++;
        if ((class372.field5120[arg0][arg4][arg1] & 0x2) != 0) {
            return true;
        } else if ((class372.field5120[arg3][arg4][arg1] & 0x10) == 0) {
            return class374.method2289(arg1, 115, arg3, arg4) == arg2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Llh;Lan;)V")
    public class190(class235 arg0, class113 arg1) {
        this.field2847 = arg0;
        this.field2849 = class389.method2361(arg0.field3414, (byte) -72);
        this.method1337(-88);
    }
}
