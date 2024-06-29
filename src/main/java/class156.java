import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class156 extends class297 {

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    private int field2562 = 1;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    private int field2566 = 1;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "J")
    public static volatile long field2556 = 0L;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "F")
    public static float field2561;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "Lcm;")
    public static class205 field2560;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "Lub;")
    public static class23 field2564;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILaj;)V", line = 17)
    public final void method169(int arg0, int arg1, class1 arg2) {
        if (arg0 == 0) {
            this.field2566 = arg2.method15((byte) -25);
        } else if (arg0 == 1) {
            this.field2562 = arg2.method15((byte) -93);
        } else if (arg0 == 2) {
            this.field4762 = arg2.method15((byte) -39) == 1;
        }
        if (arg1 != 255) {
            this.method173(7, false);
        }
        field2565++;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 50)
    public class156() {
        super(1, false);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(III)V", line = 58)
    public static final void method1162(int arg0, int arg1, int arg2) {
        field2555++;
        class18 var3 = class151.method1139(arg0, arg2 ^ arg2);
        int var4 = var3.field346;
        int var5 = var3.field345;
        int var6 = var3.field341;
        int var7 = class169.field2720[var5 - var4];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var4;
        class8.method143((byte) -59, var6, var8 & arg1 << var4 | ~var8 & class123.field1998[var6]);
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)V", line = 80)
    public static void method1163(int arg0) {
        field2564 = null;
        field2560 = null;
        if (arg0 != 0) {
            method1163(103);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)[I", line = 92)
    public final int[] method173(int arg0, boolean arg1) {
        field2557++;
        if (!arg1) {
            this.field2566 = -11;
        }
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (this.field4760.field388) {
            int var4 = this.field2562 + this.field2562 + 1;
            int var5 = this.field2566 + this.field2566 + 1;
            int[][] var6 = new int[var4][];
            int var7 = 65536 / var5;
            for (int var8 = arg0 - this.field2562; var8 <= (this.field2562 + arg0); var8++) {
                int[] var9 = this.method2109(var8 & class175.field2801, (byte) 33, 0);
                int[] var10 = new int[class31.field491];
                int var11 = 0;
                for (int var12 = -this.field2566; var12 <= this.field2566; var12++) {
                    var11 += var9[class257.field3813 & var12];
                }
                int var13 = 0;
                while (var13 < class31.field491) {
                    var10[var13] = var7 * var11 >> 16;
                    int var14 = var11 - var9[var13 - this.field2566 & class257.field3813];
                    var13++;
                    var11 = var9[class257.field3813 & var13 + this.field2566] + var14;
                }
                var6[var8 + this.field2562 - arg0] = var10;
            }
            int var15 = 65536 / var4;
            for (int var16 = 0; var16 < class31.field491; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var6[var18][var16];
                }
                var3[var16] = var15 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)[[I", line = 188)
    public final int[][] method172(int arg0, byte arg1) {
        field2558++;
        if (arg1 != 63) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field4767.method1141(-1677, arg0);
        if (this.field4767.field2480) {
            int var4 = this.field2562 + this.field2562 + 1;
            int var5 = 65536 / var4;
            int[][][] var6 = new int[var4][][];
            int var7 = this.field2566 + this.field2566 + 1;
            int var8 = 65536 / var7;
            for (int var9 = arg0 - this.field2562; var9 <= this.field2562 + arg0; var9++) {
                int[][] var10 = this.method2105(var9 & class175.field2801, 2, 0);
                int var11 = 0;
                int[][] var12 = new int[3][class31.field491];
                int var13 = 0;
                int var14 = 0;
                int[] var15 = var10[0];
                int[] var16 = var10[1];
                int[] var17 = var10[2];
                for (int var18 = -this.field2566; var18 <= this.field2566; var18++) {
                    int var19 = class257.field3813 & var18;
                    var14 += var16[var19];
                    var13 += var17[var19];
                    var11 += var15[var19];
                }
                int[] var20 = var12[1];
                int[] var21 = var12[2];
                int[] var22 = var12[0];
                int var23 = 0;
                while (var23 < class31.field491) {
                    var22[var23] = var8 * var11 >> 16;
                    var20[var23] = var8 * var14 >> 16;
                    var21[var23] = var8 * var13 >> 16;
                    int var24 = class257.field3813 & var23 - this.field2566;
                    var23++;
                    int var25 = var13 - var17[var24];
                    int var26 = var11 - var15[var24];
                    int var27 = var14 - var16[var24];
                    int var28 = this.field2566 + var23 & class257.field3813;
                    var14 = var16[var28] + var27;
                    var11 = var15[var28] + var26;
                    var13 = var17[var28] + var25;
                }
                var6[var9 + this.field2562 - arg0] = var12;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[1];
            int[] var31 = var3[2];
            for (int var32 = 0; var32 < class31.field491; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var6[var36];
                    var34 += var37[1][var32];
                    var33 += var37[0][var32];
                    var35 += var37[2][var32];
                }
                var29[var32] = var5 * var33 >> 16;
                var30[var32] = var5 * var34 >> 16;
                var31[var32] = var5 * var35 >> 16;
            }
        }
        return var3;
    }
}
