import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class38 extends class145 {

    @OriginalMember(owner = "client!bt", name = "F", descriptor = "I")
    private int field412 = 1;

    @OriginalMember(owner = "client!bt", name = "J", descriptor = "I")
    private int field416 = 1;

    @OriginalMember(owner = "client!bt", name = "I", descriptor = "S")
    public static short field415 = 256;

    @OriginalMember(owner = "client!bt", name = "E", descriptor = "Lsd;")
    public static class80 field411 = new class80(16);

    @OriginalMember(owner = "client!bt", name = "L", descriptor = "[I")
    public static int[] field418 = new int[] { 4, 4, 1, 2, 6, 4, 2, 45, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!bt", name = "M", descriptor = "Z")
    public static boolean field419 = true;

    @OriginalMember(owner = "client!bt", name = "G", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!bt", name = "H", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!bt", name = "K", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!bt", name = "N", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "(I)V", line = 3)
    public static void method204(int arg0) {
        field411 = null;
        if (arg0 != 1) {
            method204(-124);
        }
        field418 = null;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZI)[I", line = 20)
    public final int[] method27(boolean arg0, int arg1) {
        if (arg0) {
            field418 = null;
        }
        ++field414;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (super.field1779.field4602) {
            int var4 = this.field412 + this.field412 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field416 + 1 + this.field416;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field412 + arg1; ~(this.field412 + arg1) <= ~var9; ++var9) {
                int[] var13 = this.method865(0, class444.field6649 & var9, (byte) -46);
                int[] var14 = new int[class647.field9368];
                int var15 = 0;
                for (int var16 = -this.field416; this.field416 >= var16; ++var16) {
                    var15 += var13[class619.field8980 & var16];
                }
                int var17 = 0;
                while (~var17 > ~class647.field9368) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class619.field8980 & -this.field416 + var17];
                    ++var17;
                    var15 = var13[class619.field8980 & this.field416 + var17] + var18;
                }
                var8[-arg1 + var9 + this.field412] = var14;
            }
            for (int var10 = 0; class647.field9368 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILrt;)V", line = 109)
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field1790 = arg2.method1177(255) == 1;
                }
            } else {
                this.field412 = arg2.method1177(255);
            }
        } else {
            this.field416 = arg2.method1177(255);
        }
        ++field417;
        if (arg1 > -67) {
            field420 = -116;
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V", line = 155)
    public class38() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BI)[[I", line = 160)
    public final int[][] method75(byte arg0, int arg1) {
        ++field413;
        int[][] var3 = super.field1792.method1826(arg1, -16486);
        if (arg0 > -28) {
            this.method28(-121, 50, (class194) null);
        }
        if (super.field1792.field3917) {
            int var4 = this.field412 + this.field412 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field416 + this.field416 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field412 + arg1; var9 <= this.field412 + arg1; ++var9) {
                int[][] var19 = this.method866(0, var9 & class444.field6649, (byte) -98);
                int[][] var20 = new int[3][class647.field9368];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field416; this.field416 >= var27; ++var27) {
                    int var37 = class619.field8980 & var27;
                    var22 += var25[var37];
                    var21 += var24[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~var31 > ~class647.field9368) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class619.field8980 & var31 - this.field416;
                    int var33 = var23 - var26[var32];
                    int var34 = var21 - var24[var32];
                    int var35 = var22 - var25[var32];
                    ++var31;
                    int var36 = class619.field8980 & this.field416 + var31;
                    var23 = var26[var36] + var33;
                    var21 = var24[var36] + var34;
                    var22 = var25[var36] + var35;
                }
                var8[-arg1 + this.field412 + var9] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class647.field9368; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }
}
