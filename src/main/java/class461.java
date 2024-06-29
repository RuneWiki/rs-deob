import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class461 extends class14 {

    @OriginalMember(owner = "client!rs", name = "N", descriptor = "I")
    private int field6369 = 1;

    @OriginalMember(owner = "client!rs", name = "V", descriptor = "I")
    private int field6377 = 1;

    @OriginalMember(owner = "client!rs", name = "M", descriptor = "I")
    public static int field6368 = 0;

    @OriginalMember(owner = "client!rs", name = "O", descriptor = "[I")
    public static int[] field6370 = new int[2048];

    @OriginalMember(owner = "client!rs", name = "K", descriptor = "[J")
    public static long[] field6366 = new long[32];

    @OriginalMember(owner = "client!rs", name = "L", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!rs", name = "Q", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!rs", name = "R", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!rs", name = "S", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!rs", name = "U", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!rs", name = "W", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!rs", name = "T", descriptor = "Lpc;")
    public static class473 field6375;

    @OriginalMember(owner = "client!rs", name = "P", descriptor = "Lf;")
    public static class529 field6371;

    @OriginalMember(owner = "client!rs", name = "J", descriptor = "[[Z")
    public static boolean[][] field6365;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IBLmd;)V")
    public final void method147(int arg0, byte arg1, class379 arg2) {
        ++field6378;
        int var4 = -20 / ((arg1 - -51) / 37);
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field263 = ~arg2.method2238(255) == -2;
                }
            } else {
                this.field6377 = arg2.method2238(255);
            }
        } else {
            this.field6369 = arg2.method2238(255);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IB)[I")
    public final int[] method140(int arg0, byte arg1) {
        ++field6374;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (arg1 >= -2) {
            method2624(-84);
        }
        if (super.field270.field5222) {
            int var4 = this.field6377 - (-this.field6377 + -1);
            int var5 = 65536 / var4;
            int var6 = this.field6369 - -this.field6369 - -1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field6377 + arg0; this.field6377 + arg0 >= var9; ++var9) {
                int[] var13 = this.method145(var9 & class511.field7361, 0, -18596);
                int[] var14 = new int[class115.field1637];
                int var15 = 0;
                for (int var16 = -this.field6369; ~this.field6369 <= ~var16; ++var16) {
                    var15 += var13[var16 & class305.field4023];
                }
                int var17 = 0;
                while (var17 < class115.field1637) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class305.field4023 & var17 - this.field6369];
                    ++var17;
                    var15 = var13[class305.field4023 & this.field6369 + var17] + var18;
                }
                var8[var9 - -this.field6377 - arg0] = var14;
            }
            for (int var10 = 0; ~var10 > ~class115.field1637; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)[[I")
    public final int[][] method141(int arg0, int arg1) {
        ++field6373;
        int[][] var3 = super.field268.method2561(arg1, 0);
        if (super.field268.field6091) {
            int var4 = this.field6377 - (-this.field6377 - 1);
            int var5 = 65536 / var4;
            int var6 = this.field6369 - -this.field6369 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field6377 + arg1; arg1 - -this.field6377 >= var9; ++var9) {
                int[][] var19 = this.method139(0, 2, class511.field7361 & var9);
                int[][] var20 = new int[3][class115.field1637];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field6369; ~this.field6369 <= ~var27; ++var27) {
                    int var37 = class305.field4023 & var27;
                    var21 += var24[var37];
                    var23 += var26[var37];
                    var22 += var25[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class115.field1637 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field6369 + var31 & class305.field4023;
                    int var33 = var21 - var24[var32];
                    int var34 = var22 - var25[var32];
                    ++var31;
                    int var35 = var23 - var26[var32];
                    int var36 = class305.field4023 & this.field6369 + var31;
                    var23 = var26[var36] + var35;
                    var22 = var25[var36] + var34;
                    var21 = var24[var36] + var33;
                }
                var8[var9 - arg1 + this.field6377] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; class115.field1637 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
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
        return arg0 != -30909 ? null : var3;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2623(int arg0, byte arg1, int arg2) {
        ++field6372;
        if (arg1 != -11) {
            field6365 = null;
        }
        return ((arg2 & 8192) != 0 | class425.method2447(arg2, arg0, (byte) -100) | class326.method1885(arg2, -1, arg0)) & class294.method1721(arg0, -15363, arg2);
    }

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "(I)V")
    public static void method2624(int arg0) {
        field6375 = null;
        if (arg0 == 8341) {
            field6366 = null;
            field6365 = null;
            field6371 = null;
            field6370 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V")
    public class461() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "(B)Z")
    public static final boolean method2625(byte arg0) {
        if (arg0 <= 38) {
            method2624(97);
        }
        ++field6376;
        return class289.field3785;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(II)I")
    public static final int method2626(int arg0, int arg1) {
        return class209.field2863 != null ? class209.field2863[arg0][arg1] & 16777215 : 0;
    }

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "(I)V")
    public static final void method2627(int arg0) {
        class302.field3987.method559(((float) class154.field2244.field7746 * 0.1F + 0.7F) * class155.field2275);
        ++field6367;
        if (arg0 == 0) {
            class302.field3987.method592(class374.field5068, class372.field5008, class326.field4287, (float) (class348.field4704 << 0), (float) (class95.field1422 << 0), (float) (class380.field5197 << 0));
            class302.field3987.method527(class97.field1468);
        }
    }
}
