import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class394 extends class634 {

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    private int field5407 = 32768;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "J")
    public static long field5408 = 0L;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "Loh;")
    public static class404 field5410;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "[I")
    public static int[] field5413;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V")
    public final void method87(byte arg0) {
        ++field5409;
        class581.method3345((byte) 89);
        if (arg0 < 65) {
            field5413 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BI)[[I")
    public final int[][] method7(byte arg0, int arg1) {
        int var3 = -8 % ((-56 - arg0) / 53);
        ++field5412;
        int[][] var4 = super.field9126.method132(0, arg1);
        if (super.field9126.field295) {
            int[] var5 = this.method3641(arg1, 20604, 1);
            int[] var6 = this.method3641(arg1, 20604, 2);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            for (int var10 = 0; class635.field9139 > var10; ++var10) {
                int var11 = 255 & var5[var10] * 255 >> 12;
                int var12 = var6[var10] * this.field5407 >> 12;
                int var13 = class412.field5620[var11] * var12 >> 12;
                int var14 = class230.field2686[var11] * var12 >> 12;
                int var15 = (var13 >> 12) + var10 & class110.field1162;
                int var16 = class312.field3870 & (var14 >> 12) + arg1;
                int[][] var17 = this.method3642(0, var16, true);
                var7[var10] = var17[0][var15];
                var8[var10] = var17[1][var15];
                var9[var10] = var17[2][var15];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field9121 = ~arg1.method1423(-76) == -2;
            }
        } else {
            this.field5407 = arg1.method1476(-112) << 4;
        }
        if (arg2) {
            this.method13((byte) 98, -125);
        }
        ++field5406;
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(B)V")
    public static void method2418(byte arg0) {
        if (arg0 != -71) {
            method2419(44, 26, -20, 10);
        }
        field5410 = null;
        field5413 = null;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        if (arg0 >= -55) {
            method2419(0, 79, -2, -39);
        }
        ++field5405;
        int[] var3 = super.field9114.method1858(100, arg1);
        if (super.field9114.field3897) {
            int[] var4 = this.method3641(arg1, 20604, 1);
            int[] var5 = this.method3641(arg1, 20604, 2);
            for (int var6 = 0; var6 < class635.field9139; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field5407 >> 12;
                int var9 = class412.field5620[var7] * var8 >> 12;
                int var10 = class230.field2686[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class110.field1162;
                int var12 = class312.field3870 & arg1 - -(var10 >> 12);
                int[] var13 = this.method3641(var12, 20604, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII)I")
    public static final int method2419(int arg0, int arg1, int arg2, int arg3) {
        if (~arg2 >= -244) {
            if (arg2 <= 217) {
                if (arg2 > 192) {
                    arg1 >>= 2;
                } else if (~arg2 < -180) {
                    arg1 >>= 1;
                }
            } else {
                arg1 >>= 3;
            }
        } else {
            arg1 >>= 4;
        }
        if (arg0 != -1575722079) {
            return 3;
        } else {
            ++field5411;
            return (arg2 >> 1) + (((255 & arg3) >> 2 << 10) - -(arg1 >> 5 << 7));
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
    public class394() {
        super(3, false);
    }
}
