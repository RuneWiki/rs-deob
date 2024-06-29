import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class249 {

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3184 = "";

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field3177 = -1;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "I")
    public int field3173;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
    public int field3174;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "I")
    public int field3175;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
    public int field3176;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public int field3178;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
    public int field3179;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
    public int field3180;

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "I")
    public int field3181;

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
    public int field3182;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
    public int field3185;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
    public int field3186;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
    public int field3187;

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
    public int field3188;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
    public int field3189;

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
    public int field3190;

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "I")
    public int field3191;

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "I")
    public int field3192;

    @OriginalMember(owner = "client!mu", name = "u", descriptor = "I")
    public int field3193;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIIZII)V", line = 8)
    public static final void method1396(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field3183++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg2 - arg4;
        int var12 = arg3 - arg4;
        int var13 = arg2 * arg2;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg3 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class328.field4287[arg0];
        class62.method363(arg6 - var11, -128, arg7, var39, arg6 - arg2);
        class62.method363(arg6 + var11, -128, arg1, var39, arg6 - var11);
        class62.method363(arg6 + arg2, -127, arg7, var39, arg6 + var11);
        if (arg5) {
            field3184 = null;
        }
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var10++;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var10++;
                    var37 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    var35 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var36 -= var27;
            var9--;
            int var41 = arg0 - var9;
            int var42 = arg0 + var9;
            int var43 = arg6 + var8;
            int var44 = arg6 - var8;
            if (var40) {
                int var45 = arg6 + var10;
                int var46 = arg6 - var10;
                class62.method363(var46, -127, arg7, class328.field4287[var41], var44);
                class62.method363(var45, -127, arg1, class328.field4287[var41], var46);
                class62.method363(var43, -127, arg7, class328.field4287[var41], var45);
                class62.method363(var46, -128, arg7, class328.field4287[var42], var44);
                class62.method363(var45, -128, arg1, class328.field4287[var42], var46);
                class62.method363(var43, -128, arg7, class328.field4287[var42], var45);
            } else {
                class62.method363(var43, -128, arg7, class328.field4287[var41], var44);
                class62.method363(var43, -127, arg7, class328.field4287[var42], var44);
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)V", line = 180)
    public static void method1397(boolean arg0) {
        field3184 = null;
        if (arg0) {
            field3184 = null;
        }
    }
}
