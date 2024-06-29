import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class199 extends class177 {

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
    private int field3154 = 1;

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "I")
    private int field3160 = 1;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "Z")
    public static boolean field3147 = false;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "Z")
    public static boolean field3143 = false;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "[I")
    public static int[] field3152 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "Ljava/lang/String;")
    public static String field3150 = "yellow:";

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
    public static int field3153 = 0;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "[I")
    public static int[] field3158 = new int[2500];

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "[I")
    public static int[] field3148;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lhb;II)V", line = 14)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3154 = arg0.method273(65280);
        } else if (arg2 == 1) {
            this.field3160 = arg0.method273(65280);
        } else if (arg2 == 2) {
            this.field2649 = arg0.method273(65280) == 1;
        }
        field3149++;
        if (arg1 != -18061) {
            field3152 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(III)I", line = 50)
    public static final int method1444(int arg0, int arg1, int arg2) {
        field3156++;
        if (arg2 > arg1) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        if (arg0 <= 109) {
            return -49;
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)[[I", line = 83)
    public final int[][] method99(int arg0, int arg1) {
        if (arg1 != -23387) {
            this.method95(85, -127);
        }
        field3144++;
        int[][] var3 = this.field2645.method1456(arg0, (byte) -113);
        if (this.field2645.field3203) {
            int var4 = this.field3160 + this.field3160 + 1;
            int var5 = this.field3154 + this.field3154 + 1;
            int var6 = 65536 / var5;
            int var7 = 65536 / var4;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg0 - this.field3160; var9 <= this.field3160 + arg0; var9++) {
                int var10 = 0;
                int[][] var11 = this.method1285(0, var9 & class11.field120, 27847);
                int var12 = 0;
                int[][] var13 = new int[3][class287.field4415];
                int[] var14 = var11[0];
                int var15 = 0;
                int[] var16 = var11[1];
                int[] var17 = var11[2];
                for (int var18 = -this.field3154; var18 <= this.field3154; var18++) {
                    int var19 = class133.field2090 & var18;
                    var10 += var14[var19];
                    var15 += var16[var19];
                    var12 += var17[var19];
                }
                int[] var20 = var13[0];
                int[] var21 = var13[1];
                int[] var22 = var13[2];
                int var23 = 0;
                while (class287.field4415 > var23) {
                    var20[var23] = var6 * var10 >> 16;
                    var21[var23] = var6 * var15 >> 16;
                    var22[var23] = var6 * var12 >> 16;
                    int var24 = var23 - this.field3154 & class133.field2090;
                    int var25 = var12 - var17[var24];
                    var23++;
                    int var26 = var10 - var14[var24];
                    int var27 = var15 - var16[var24];
                    int var28 = this.field3154 + var23 & class133.field2090;
                    var10 = var14[var28] + var26;
                    var15 = var16[var28] + var27;
                    var12 = var17[var28] + var25;
                }
                var8[this.field3160 + var9 - arg0] = var13;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[1];
            int[] var31 = var3[2];
            for (int var32 = 0; var32 < class287.field4415; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var8[var36];
                    var34 += var37[1][var32];
                    var33 += var37[0][var32];
                    var35 += var37[2][var32];
                }
                var29[var32] = var7 * var33 >> 16;
                var30[var32] = var7 * var34 >> 16;
                var31[var32] = var7 * var35 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)[I", line = 231)
    public final int[] method95(int arg0, int arg1) {
        field3146++;
        int[] var3 = this.field2652.method1481(arg1, (byte) -115);
        if (arg0 >= -52) {
            method1444(-30, 20, 33);
        }
        if (this.field2652.field3287) {
            int var4 = this.field3160 + this.field3160 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field3154 - (-this.field3154 - 1);
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field3160; var9 <= (arg1 + this.field3160); var9++) {
                int[] var10 = this.method1280(var9 & class11.field120, 0, false);
                int[] var11 = new int[class287.field4415];
                int var12 = 0;
                for (int var13 = -this.field3154; var13 <= this.field3154; var13++) {
                    var12 += var10[class133.field2090 & var13];
                }
                int var14 = 0;
                while (var14 < class287.field4415) {
                    var11[var14] = var7 * var12 >> 16;
                    int var15 = var12 - var10[var14 - this.field3154 & class133.field2090];
                    var14++;
                    var12 = var10[var14 + this.field3154 & class133.field2090] + var15;
                }
                var8[var9 + this.field3160 - arg1] = var11;
            }
            for (int var16 = 0; var16 < class287.field4415; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V", line = 329)
    public static void method1445(int arg0) {
        field3152 = null;
        if (arg0 != -25367) {
            field3150 = (String) null;
        }
        field3158 = null;
        field3148 = null;
        field3150 = null;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V", line = 356)
    public class199() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BZ)V", line = 364)
    public static final void method1446(byte arg0, boolean arg1) {
        field3145++;
        if (class200.field3180 == arg1) {
            return;
        }
        if (arg0 != 105) {
            field3151 = -93;
        }
        class200.field3180 = arg1;
        class267.method1857(arg0 - 25693);
    }
}
