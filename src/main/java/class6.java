import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class6 extends class314 {

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "[Ldm;")
    public class680[] field209;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "[I")
    public static int[] field207;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIBIIIII)V")
    public static final void method36(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 < 11) {
            return;
        }
        if (arg6 == arg8 && arg2 == arg5 && arg3 == arg9 && arg0 == arg1) {
            class381.method2358(arg7, arg8, true, arg2, arg1, arg3);
        } else {
            int var10 = arg8;
            int var11 = arg2;
            int var12 = arg8 * 3;
            int var13 = arg2 * 3;
            int var14 = arg6 * 3;
            int var15 = arg5 * 3;
            int var16 = arg9 * 3;
            int var17 = arg0 * 3;
            int var18 = arg3 + var14 - var16 - arg8;
            int var19 = arg1 + var15 - (arg2 + var17);
            int var20 = var16 + var12 - (var14 + var14);
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg8 + (var27 + var29 + var31 >> 12);
                int var34 = arg2 + (var28 + var32 + var30 >> 12);
                class381.method2358(arg7, var10, true, var11, var34, var33);
                var11 = var34;
                var10 = var33;
            }
        }
        field210++;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "([Ldm;)V")
    public class6(class680[] arg0) {
        this.field209 = arg0;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public static void method37(byte arg0) {
        if (arg0 < 8) {
            method36(-108, 27, -14, 23, (byte) 52, 91, -123, -127, 31, 68);
        }
        field207 = null;
    }
}
