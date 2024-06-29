import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class500 {

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "F")
    public static float field6943;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "I")
    public static int field6942;

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
    public static int field6946;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
    public static final void method2794(int arg0) {
        field6946++;
        for (int var1 = arg0; var1 < class257.field3197.length; var1++) {
            for (int var2 = 0; var2 < class257.field3197[var1].length; var2++) {
                class257.field3197[var1][var2] = class597.field8614;
            }
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2795(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6945++;
        class520.method2898(arg0, arg4 - 40131);
        int var7 = 0;
        int var8 = arg0 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class256.field3173[arg1];
        int var16 = arg3 - var8;
        if (arg4 != 13371) {
            return;
        }
        int var17 = arg3 + var8;
        class373.method2275((byte) -9, var16, arg5, arg3 - arg0, var15);
        class373.method2275((byte) -9, var17, arg2, var16, var15);
        class373.method2275((byte) -9, arg3 + arg0, arg5, var17, var15);
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class317.field4377[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 < var8) {
                    int[] var18 = class256.field3173[arg1 + var9];
                    int[] var19 = class256.field3173[arg1 - var9];
                    int var20 = class317.field4377[var9];
                    int var21 = arg3 + var7;
                    int var22 = arg3 - var7;
                    int var23 = arg3 + var20;
                    int var24 = arg3 - var20;
                    class373.method2275((byte) -9, var24, arg5, var22, var18);
                    class373.method2275((byte) -9, var23, arg2, var24, var18);
                    class373.method2275((byte) -9, var21, arg5, var23, var18);
                    class373.method2275((byte) -9, var24, arg5, var22, var19);
                    class373.method2275((byte) -9, var23, arg2, var24, var19);
                    class373.method2275((byte) -9, var21, arg5, var23, var19);
                } else {
                    int[] var25 = class256.field3173[arg1 + var9];
                    int[] var26 = class256.field3173[arg1 - var9];
                    int var27 = arg3 + var7;
                    int var28 = arg3 - var7;
                    class373.method2275((byte) -9, var27, arg5, var28, var25);
                    class373.method2275((byte) -9, var27, arg5, var28, var26);
                }
            }
            int[] var29 = class256.field3173[arg1 + var7];
            int[] var30 = class256.field3173[arg1 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var8 <= var7) {
                class373.method2275((byte) -9, var31, arg5, var32, var29);
                class373.method2275((byte) -9, var31, arg5, var32, var30);
            } else {
                int var33 = var7 > var11 ? class317.field4377[var7] : var11;
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class373.method2275((byte) -9, var35, arg5, var32, var29);
                class373.method2275((byte) -9, var34, arg2, var35, var29);
                class373.method2275((byte) -9, var31, arg5, var34, var29);
                class373.method2275((byte) -9, var35, arg5, var32, var30);
                class373.method2275((byte) -9, var34, arg2, var35, var30);
                class373.method2275((byte) -9, var31, arg5, var34, var30);
            }
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(III)Z")
    public static final boolean method2796(int arg0, int arg1, int arg2) {
        field6942++;
        if (arg2 != 55) {
            method2794(-92);
        }
        if ((class359.method2229(arg0, (byte) -96, arg1) | (arg1 & 0x10000) != 0) || class270.method1649(arg1, arg0, 91)) {
            return true;
        } else {
            return (arg0 & 0x37) == 0 && class105.method578(arg0, true, arg1);
        }
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(III)Z")
    public static final boolean method2797(int arg0, int arg1, int arg2) {
        field6944++;
        if (arg0 != 29908) {
            method2795(27, -39, -28, -4, -14, -127, 37);
        }
        return (arg1 & 0x8000) != 0;
    }
}
