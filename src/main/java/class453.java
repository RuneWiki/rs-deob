import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class453 {

    @OriginalMember(owner = "client!jea", name = "k", descriptor = "[I")
    public static int[] field5999 = new int[1];

    @OriginalMember(owner = "client!jea", name = "i", descriptor = "I")
    public static int field5997 = 0;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!jea", name = "j", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!jea", name = "h", descriptor = "[I")
    public static int[] field5996;

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "[[[S")
    public static short[][][] field5994;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)I", line = 6)
    public static final int method2540(int arg0) {
        if (arg0 >= -51) {
            field5997 = -110;
        }
        field5989++;
        return class259.field3281 == 1 ? class480.field6536 : 0;
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)[Liv;", line = 25)
    public static final class100[] method2541(int arg0) {
        field5993++;
        return arg0 == 2 ? new class100[] { class315.field4105, class26.field469, class542.field7497 } : null;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIIFIIZI)[I", line = 36)
    public static final int[] method2542(int arg0, int arg1, int arg2, float arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field5990++;
        int[] var8 = new int[arg5];
        class503 var9 = new class503();
        var9.field7102 = arg7;
        var9.field7105 = arg2;
        var9.field7106 = (int) (arg3 * 4096.0F);
        var9.field7107 = arg6;
        var9.field7108 = arg0;
        var9.field7111 = arg1;
        var9.method216(-21773);
        class611.method3430((byte) -121, 1, arg5);
        var9.method2942(arg4 - 8346, var8, arg4);
        return var8;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(BIIIIII)V", line = 58)
    public static final void method2543(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5998++;
        class630.method3539(-121, arg6);
        int var7 = 0;
        int var8 = arg6 - arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        if (arg0 < 104) {
            method2543((byte) 96, -115, -92, -85, -48, 42, 13);
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class432.field5765[arg5];
        int var16 = arg2 - var8;
        int var17 = arg2 + var8;
        class636.method3569(var16, arg3, arg2 - arg6, 347845800, var15);
        class636.method3569(var17, arg4, var16, 347845800, var15);
        class636.method3569(arg2 + arg6, arg3, var17, 347845800, var15);
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class80.field1108[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 <= var9) {
                    int[] var18 = class432.field5765[arg5 + var9];
                    int[] var19 = class432.field5765[arg5 - var9];
                    int var20 = arg2 + var7;
                    int var21 = arg2 - var7;
                    class636.method3569(var20, arg3, var21, 347845800, var18);
                    class636.method3569(var20, arg3, var21, 347845800, var19);
                } else {
                    int[] var22 = class432.field5765[arg5 + var9];
                    int[] var23 = class432.field5765[arg5 - var9];
                    int var24 = class80.field1108[var9];
                    int var25 = arg2 + var7;
                    int var26 = arg2 - var7;
                    int var27 = arg2 + var24;
                    int var28 = arg2 - var24;
                    class636.method3569(var28, arg3, var26, 347845800, var22);
                    class636.method3569(var27, arg4, var28, 347845800, var22);
                    class636.method3569(var25, arg3, var27, 347845800, var22);
                    class636.method3569(var28, arg3, var26, 347845800, var23);
                    class636.method3569(var27, arg4, var28, 347845800, var23);
                    class636.method3569(var25, arg3, var27, 347845800, var23);
                }
            }
            int[] var29 = class432.field5765[arg5 + var7];
            int[] var30 = class432.field5765[arg5 - var7];
            int var31 = arg2 + var9;
            int var32 = arg2 - var9;
            if (var7 >= var8) {
                class636.method3569(var31, arg3, var32, 347845800, var29);
                class636.method3569(var31, arg3, var32, 347845800, var30);
            } else {
                int var33 = var11 < var7 ? class80.field1108[var7] : var11;
                int var34 = arg2 + var33;
                int var35 = arg2 - var33;
                class636.method3569(var35, arg3, var32, 347845800, var29);
                class636.method3569(var34, arg4, var35, 347845800, var29);
                class636.method3569(var31, arg3, var34, 347845800, var29);
                class636.method3569(var35, arg3, var32, 347845800, var30);
                class636.method3569(var34, arg4, var35, 347845800, var30);
                class636.method3569(var31, arg3, var34, 347845800, var30);
            }
        }
    }

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)V", line = 189)
    public static final void method2544(int arg0) {
        field5991++;
        int var1 = arg0;
        for (int var2 = 0; var2 < class409.field5183; var2++) {
            for (int var3 = 0; var3 < class543.field7597; var3++) {
                if (class358.method2079(class197.field2689, true, var2, var3, var1, arg0 ^ 0x520000)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "(I)V", line = 225)
    public static void method2545(int arg0) {
        field5999 = null;
        if (arg0 != 1) {
            field5999 = null;
        }
        field5994 = null;
        field5996 = null;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)Z", line = 248)
    public static final boolean method2546(byte arg0) {
        field5995++;
        if (class514.field7217 == 0) {
            if (arg0 != 69) {
                method2542(99, -63, 126, -0.18831147F, -76, 118, false, 82);
            }
            return class126.field1799.method1404((byte) 78);
        } else {
            return true;
        }
    }
}
