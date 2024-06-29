import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class137 extends class154 {

    @OriginalMember(owner = "client!ll", name = "Z", descriptor = "I")
    private int field2340 = 1;

    @OriginalMember(owner = "client!ll", name = "gb", descriptor = "I")
    private int field2347 = 1;

    @OriginalMember(owner = "client!ll", name = "bb", descriptor = "[I")
    public static int[] field2342 = new int[2];

    @OriginalMember(owner = "client!ll", name = "eb", descriptor = "Leg;")
    private static class37 field2345 = class174.method1167("Loading interfaces )2 ", 121);

    @OriginalMember(owner = "client!ll", name = "db", descriptor = "I")
    public static int field2344 = -1;

    @OriginalMember(owner = "client!ll", name = "jb", descriptor = "I")
    public static int field2350 = 0;

    @OriginalMember(owner = "client!ll", name = "lb", descriptor = "Leg;")
    public static class37 field2352 = field2345;

    @OriginalMember(owner = "client!ll", name = "mb", descriptor = "I")
    public static int field2353 = 0;

    @OriginalMember(owner = "client!ll", name = "X", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!ll", name = "Y", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!ll", name = "ab", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!ll", name = "cb", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!ll", name = "fb", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!ll", name = "hb", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!ll", name = "ib", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!ll", name = "kb", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!ll", name = "nb", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(BI)V")
    public static final void method970(byte arg0, int arg1) {
        ++field2346;
        class274 var2 = class166.method1116(10, arg1, true);
        int var3 = -34 % ((12 - arg0) / 53);
        var2.method1840(10000);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field2579 = arg0.method1268(arg1 + 14270) == 1;
                }
            } else {
                this.field2347 = arg0.method1268(255);
            }
        } else {
            this.field2340 = arg0.method1268(255);
        }
        if (arg1 != -14015) {
            this.method143(95, -49);
        }
        ++field2343;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
    public class137() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "(I)V")
    public static final void method971(int arg0) {
        ++field2349;
        if (class9.field156 > arg0) {
            class241.method1658(arg0);
        } else {
            class279.field4928 = class187.field3190;
            class187.field3190 = null;
            class102.method683(40, false);
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        int[] var3 = super.field2574.method206(arg0, 10232);
        if (super.field2574.field536) {
            int var4 = this.field2347 - (-this.field2347 + -1);
            int var5 = 65536 / var4;
            int[][] var6 = new int[var4][];
            int var7 = this.field2340 + 1 + this.field2340;
            int var8 = 65536 / var7;
            for (int var9 = -this.field2347 + arg0; ~(this.field2347 + arg0) <= ~var9; ++var9) {
                int[] var13 = this.method1052(0, var9 & class239.field4260, (byte) -69);
                int[] var14 = new int[class227.field3898];
                int var15 = 0;
                for (int var16 = -this.field2340; this.field2340 >= var16; ++var16) {
                    var15 += var13[var16 & class109.field1786];
                }
                int var17 = 0;
                while (~class227.field3898 < ~var17) {
                    var14[var17] = var8 * var15 >> 16;
                    int var18 = var15 - var13[-this.field2340 + var17 & class109.field1786];
                    ++var17;
                    var15 = var13[class109.field1786 & this.field2340 + var17] + var18;
                }
                var6[this.field2347 + var9 + -arg0] = var14;
            }
            for (int var10 = 0; class227.field3898 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var6[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        ++field2354;
        if (arg1 != 1075962732) {
            field2338 = -90;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(BI)[[I")
    public final int[][] method193(byte arg0, int arg1) {
        ++field2339;
        if (arg0 != 115) {
            field2350 = -104;
        }
        int[][] var3 = super.field2585.method1532(arg1, arg0 + -167);
        if (super.field2585.field3761) {
            int var4 = this.field2347 + 1 + this.field2347;
            int var5 = 65536 / var4;
            int var6 = this.field2340 + this.field2340 - -1;
            int[][][] var7 = new int[var4][][];
            int var8 = 65536 / var6;
            for (int var9 = -this.field2347 + arg1; ~var9 >= ~(this.field2347 + arg1); ++var9) {
                int[][] var19 = this.method1054(0, 0, var9 & class239.field4260);
                int[][] var20 = new int[3][class227.field3898];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field2340; ~this.field2340 <= ~var27; ++var27) {
                    int var37 = class109.field1786 & var27;
                    var22 += var26[var37];
                    var23 += var25[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (class227.field3898 > var31) {
                    var28[var31] = var8 * var21 >> 16;
                    var29[var31] = var8 * var23 >> 16;
                    var30[var31] = var8 * var22 >> 16;
                    int var32 = -this.field2340 + var31 & class109.field1786;
                    int var33 = var23 - var25[var32];
                    int var34 = var22 - var26[var32];
                    ++var31;
                    int var35 = var21 - var24[var32];
                    int var36 = this.field2340 + var31 & class109.field1786;
                    var23 = var25[var36] + var33;
                    var21 = var24[var36] + var35;
                    var22 = var26[var36] + var34;
                }
                var7[this.field2347 + var9 + -arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class227.field3898 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
                    int[][] var18 = var7[var17];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(B)V")
    public static void method972(byte arg0) {
        field2345 = null;
        field2342 = null;
        if (arg0 != 44) {
            field2344 = -64;
        }
        field2352 = null;
    }
}
