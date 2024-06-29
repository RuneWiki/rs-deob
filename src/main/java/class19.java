import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class19 {

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field257 = 0;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field260 = 0;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field265 = 0;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field259 = -1;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "[Z")
    public static boolean[] field267 = new boolean[100];

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "Lwf;")
    public static class306 field266;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Ljava/lang/String;")
    public static String field261;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIILab;II)V", line = 5)
    public static final void method147(int arg0, int arg1, int arg2, class229 arg3, int arg4, int arg5) {
        field263++;
        if (arg3.field3681 == -1 && arg3.field3686 == null) {
            return;
        }
        int var6 = class274.field4219 * arg3.field3679 >> 8;
        int var7 = 0;
        if (arg5 > arg3.field3685) {
            var7 += arg5 - arg3.field3685;
        } else if (arg3.field3675 > arg5) {
            var7 += arg3.field3675 - arg5;
        }
        if (arg3.field3693 < arg4) {
            var7 += arg4 - arg3.field3693;
        } else if (arg4 < arg3.field3672) {
            var7 += arg3.field3672 - arg4;
        }
        if (arg3.field3680 == 0 || arg3.field3680 < (var7 - 64) || class274.field4219 == 0 || arg3.field3671 != arg2) {
            if (arg3.field3690 != null) {
                class74.field1102.method221(arg3.field3690);
                arg3.field3690 = null;
            }
            if (arg3.field3694 != null) {
                class74.field1102.method221(arg3.field3694);
                arg3.field3694 = null;
            }
            return;
        }
        var7 -= 64;
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = (arg3.field3680 - var7) * var6 / arg3.field3680;
        if (arg1 < 102) {
            field265 = -50;
        }
        if (arg3.field3690 != null) {
            arg3.field3690.method2244(var8);
        } else if (arg3.field3681 >= 0) {
            class300 var9 = class300.method1973(class311.field4935, arg3.field3681, 0);
            if (var9 != null) {
                class73 var10 = var9.method1974().method520(class203.field3068);
                class331 var11 = class331.method2265(var10, 100, var8);
                var11.method2262(-1);
                class74.field1102.method214(var11);
                arg3.field3690 = var11;
            }
        }
        if (arg3.field3694 != null) {
            arg3.field3694.method2244(var8);
            if (!arg3.field3694.method1280(true)) {
                arg3.field3694 = null;
            }
        } else if (arg3.field3686 != null && (arg3.field3697 -= arg0) <= 0) {
            int var12 = (int) (Math.random() * (double) arg3.field3686.length);
            class300 var13 = class300.method1973(class311.field4935, arg3.field3686[var12], 0);
            if (var13 != null) {
                class73 var14 = var13.method1974().method520(class203.field3068);
                class331 var15 = class331.method2265(var14, 100, var8);
                var15.method2262(0);
                class74.field1102.method214(var15);
                arg3.field3697 = (int) ((double) (arg3.field3683 - arg3.field3677) * Math.random()) + arg3.field3677;
                arg3.field3694 = var15;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 132)
    public static void method148(int arg0) {
        field266 = null;
        field261 = null;
        field267 = null;
        if (arg0 != -11043) {
            method150(-45);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V", line = 150)
    public static final void method149(int arg0, int arg1) {
        class221.field3513.method1287(arg1, arg0 ^ 0xB);
        field262++;
        if (arg0 != 0) {
            field266 = (class306) null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V", line = 178)
    public static final void method150(int arg0) {
        class276.field4262.method1298((byte) 110);
        class56.field781.method1298((byte) 110);
        int var1 = -113 / ((77 - arg0) / 41);
        class109.field1685.method1298((byte) 110);
        field264++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)I", line = 195)
    public static final int method151(int arg0, byte arg1) {
        field256++;
        if (arg1 != 55) {
            method149(47, -47);
        }
        return arg0 >>> 8;
    }
}
