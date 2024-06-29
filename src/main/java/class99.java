import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class99 {

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "[Laj;")
    private class199[] field1573;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "[I")
    public static int[] field1576;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZIIII)I", line = 11)
    public static final int method730(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg1 & 0xF;
        int var6 = var5 >= 8 ? arg4 : arg2;
        if (arg0) {
            field1572++;
            int var7 = var5 < 4 ? arg4 : (var5 == 12 || var5 == 14 ? arg2 : arg3);
            return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
        } else {
            return 73;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "([[FB[ILmh;I[[FII[[I[[FLri;)V", line = 29)
    public static final void method731(float[][] arg0, byte arg1, int[] arg2, class72 arg3, int arg4, float[][] arg5, int arg6, int arg7, int[][] arg8, float[][] arg9, class204 arg10) {
        field1574++;
        int[] var11 = new int[arg2.length / 2];
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg2[var12 + var12];
            int var14 = arg2[var12 + var12 + 1];
            if (arg6 == 1) {
                int var15 = var13;
                var13 = var14;
                var14 = 128 - var15;
            } else if (arg6 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg6 == 3) {
                int var16 = var13;
                var13 = 128 - var14;
                var14 = var16;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg0[arg7][arg4];
                var18 = arg5[arg7][arg4];
                var19 = arg9[arg7][arg4];
            } else if (var13 == 128 && var14 == 0) {
                var19 = arg9[arg7 + 1][arg4];
                var17 = arg0[arg7 + 1][arg4];
                var18 = arg5[arg7 + 1][arg4];
            } else if (var13 == 128 && var14 == 128) {
                var18 = arg5[arg7 + 1][arg4 + 1];
                var17 = arg0[arg7 + 1][arg4 + 1];
                var19 = arg9[arg7 + 1][arg4 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var19 = arg9[arg7][arg4 + 1];
                var18 = arg5[arg7][arg4 + 1];
                var17 = arg0[arg7][arg4 + 1];
            } else {
                float var20 = arg9[arg7][arg4];
                float var21 = arg0[arg7][arg4];
                float var22 = (float) var14 / 128.0F;
                float var23 = (float) var13 / 128.0F;
                float var24 = arg5[arg7][arg4];
                float var25 = arg9[arg7][arg4 + 1];
                float var26 = (arg9[arg7 + 1][arg4 + 1] - var25) * var23 + var25;
                float var27 = (arg0[arg7 + 1][arg4] - var21) * var23 + var21;
                float var28 = (arg5[arg7 + 1][arg4] - var24) * var23 + var24;
                float var29 = arg5[arg7][arg4 + 1];
                float var30 = arg0[arg7][arg4 + 1];
                float var31 = (arg0[arg7 + 1][arg4 + 1] - var30) * var23 + var30;
                float var32 = (arg9[arg7 + 1][arg4] - var20) * var23 + var20;
                float var33 = (arg5[arg7 + 1][arg4 + 1] - var29) * var23 + var29;
                var18 = (var33 - var28) * var22 + var28;
                var19 = (var26 - var32) * var22 + var32;
                var17 = (var31 - var27) * var22 + var27;
            }
            int var34 = (arg7 << 7) + var13;
            int var35 = (arg4 << 7) + var14;
            int var36 = class158.method1072(arg4, var14, var13, arg7, true, arg8);
            var11[var12] = arg3.method542(arg10, var34, var36, var35, var19, var18, var17);
        }
        if (arg1 != -128) {
            method732(-66);
        }
        arg3.method544(var11);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 160)
    public static void method732(int arg0) {
        int var1 = 9 % ((-arg0 - 39) / 40);
        field1576 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)I", line = 176)
    public static final int method733(int arg0, int arg1) {
        field1575++;
        return arg1 == 255 ? arg0 & 0xFF : 80;
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(I)V", line = 187)
    public class99(int arg0) {
        this.field1573 = new class199[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class199 var3 = this.field1573[var2] = new class199();
            var3.field2982 = var3;
            var3.field2979 = var3;
        }
    }
}
