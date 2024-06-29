import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class183 extends class694 {

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "I")
    private int field2695 = 1;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
    private int field2697 = 1;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "[Z")
    public static boolean[] field2696 = new boolean[100];

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(III)Z")
    public static final boolean method1233(int arg0, int arg1, int arg2) {
        ++field2702;
        if (arg1 != 8192) {
            field2696 = null;
        }
        return class179.method1214(arg2, arg0, 3351159) & (class138.method977(arg2, 544, arg0) | (8192 & arg0) != 0 | class245.method1519(arg2, arg0, 0));
    }

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "(I)V")
    public static void method1234(int arg0) {
        field2696 = null;
        if (arg0 != 0) {
            field2696 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(III)Z")
    public static final boolean method1235(int arg0, int arg1, int arg2) {
        if (arg1 < 21) {
            field2696 = null;
        }
        ++field2699;
        return (52 & arg0) != 0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILjr;B)V")
    public final void method19(int arg0, class96 arg1, byte arg2) {
        ++field2700;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field9744 = arg1.method718(-62) == 1;
                }
            } else {
                this.field2695 = arg1.method718(123);
            }
        } else {
            this.field2697 = arg1.method718(-68);
        }
        int var5 = 113 % ((arg2 - 58) / 63);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field2701;
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (arg0 <= 112) {
            return null;
        } else {
            if (super.field9751.field6674) {
                int var4 = this.field2695 - -this.field2695 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field2697 - (-this.field2697 - 1);
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = -this.field2695 + arg1; this.field2695 + arg1 >= var9; ++var9) {
                    int[] var13 = this.method3809(0, class384.field5383 & var9, (byte) 35);
                    int[] var14 = new int[class465.field6544];
                    int var15 = 0;
                    for (int var16 = -this.field2697; var16 <= this.field2697; ++var16) {
                        var15 += var13[var16 & class168.field2537];
                    }
                    int var17 = 0;
                    while (~class465.field6544 < ~var17) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[class168.field2537 & var17 - this.field2697];
                        ++var17;
                        var15 = var13[class168.field2537 & this.field2697 + var17] + var18;
                    }
                    var8[-arg1 + var9 + this.field2695] = var14;
                }
                for (int var10 = 0; ~var10 > ~class465.field6544; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; ~var12 > ~var4; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class183() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field2698;
        int[][] var3 = super.field9740.method3483(arg1, true);
        if (super.field9740.field8738) {
            int var4 = this.field2695 + 1 + this.field2695;
            int var5 = 65536 / var4;
            int var6 = this.field2697 - -1 + this.field2697;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field2695 + arg1; var9 <= this.field2695 + arg1; ++var9) {
                int[][] var19 = this.method3812(var9 & class384.field5383, 0, -14032);
                int[][] var20 = new int[3][class465.field6544];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field2697; ~var27 >= ~this.field2697; ++var27) {
                    int var37 = class168.field2537 & var27;
                    var22 += var25[var37];
                    var21 += var24[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class465.field6544 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class168.field2537 & var31 - this.field2697;
                    ++var31;
                    int var33 = var23 - var26[var32];
                    int var34 = var21 - var24[var32];
                    int var35 = var22 - var25[var32];
                    int var36 = class168.field2537 & this.field2697 + var31;
                    var22 = var25[var36] + var35;
                    var23 = var26[var36] + var33;
                    var21 = var24[var36] + var34;
                }
                var8[-arg1 + var9 + this.field2695] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class465.field6544; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var17 > ~var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var14 += var18[0][var13];
                    var15 += var18[1][var13];
                    var16 += var18[2][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        if (arg0 != -22151) {
            field2696 = null;
        }
        return var3;
    }
}
