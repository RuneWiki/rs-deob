import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class193 extends class41 {

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field3072 = -1;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "Lob;")
    public static class292 field3076;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "[[[B")
    public static byte[][][] field3069;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V", line = 15)
    public static void method1420(int arg0) {
        field3076 = null;
        if (arg0 != 10797) {
            field3072 = -33;
        }
        field3069 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIIIIII)V", line = 31)
    public static final void method1421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 != 3) {
            method1421(-55, -46, 124, 83, -14, 92, -41, 16, 72, -49);
        }
        if (arg2 == arg8 && arg6 == arg7 && arg0 == arg9 && arg3 == arg4) {
            class84.method603(arg6, arg8, -122, arg9, arg5, arg3);
        } else {
            int var10 = arg6;
            int var11 = arg8;
            int var12 = arg8 * 3;
            int var13 = arg2 * 3;
            int var14 = arg6 * 3;
            int var15 = arg7 * 3;
            int var16 = arg0 * 3;
            int var17 = arg9 + var13 - arg8 - var16;
            int var18 = arg4 * 3;
            int var19 = var15 + arg3 - arg6 - var18;
            int var20 = var16 + var12 - var13 - var13;
            int var21 = var18 - (var15 - var14) - var15;
            int var22 = var15 - var14;
            int var23 = var13 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var17 * var26;
                int var28 = var19 * var26;
                int var29 = var21 * var25;
                int var30 = var20 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var28 + var29 + var31 >> 12) + arg6;
                int var34 = (var27 + var30 + var32 >> 12) + arg8;
                class84.method603(var10, var11, arg1 ^ 0xFFFFFF81, var34, arg5, var33);
                var11 = var34;
                var10 = var33;
            }
        }
        field3073++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIBII)V", line = 108)
    public static final void method1422(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3074++;
        class4 var5 = class67.method510(1, 8, arg0);
        var5.method14(24710);
        var5.field15 = arg3;
        var5.field20 = arg1;
        var5.field21 = arg4;
        int var6 = -8 % ((-arg2 - 64) / 38);
    }
}
