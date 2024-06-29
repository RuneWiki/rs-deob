import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class18 extends class288 {

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    private int field210 = 1;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    private int field218 = 1;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public static int field213 = 0;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "Ljava/lang/String;")
    public static String field215 = "K";

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "[I")
    public static int[] field216;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)V")
    public static void method123(byte arg0) {
        if (arg0 != -70) {
            field215 = null;
        }
        field215 = null;
        field216 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)I")
    public static final int method124(boolean arg0, int arg1) {
        if (arg0) {
            field213 = -55;
        }
        ++field207;
        return arg1 & 1023;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)I")
    public static final int method125(int arg0, int arg1, int arg2, int arg3) {
        ++field211;
        if (arg0 != -24914) {
            field216 = null;
        }
        if (~arg1 > ~arg3) {
            return arg3;
        } else {
            return ~arg1 >= ~arg2 ? arg1 : arg2;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class18() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)V")
    public static final void method126(byte arg0, int arg1) {
        class110.field1899 = null;
        class130.field2178 = 1;
        class230.field3657 = -1;
        ++field206;
        class20.field236 = 0;
        class52.field745 = -1;
        class86.field1179 = false;
        class111.field1919 = arg1;
        if (arg0 != 13) {
            method125(47, 111, 37, -18);
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)V")
    public static final void method127(int arg0, int arg1) {
        class207.field3335.method1832(arg1, (byte) 90);
        if (arg0 != 0) {
            field215 = null;
        }
        ++field217;
        class7.field105.method1832(arg1, (byte) 125);
        class111.field1908.method1832(arg1, (byte) -90);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        ++field205;
        if (arg0 != 0) {
            field213 = 23;
        }
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            int var4 = this.field210 - -1 + this.field210;
            int var5 = 65536 / var4;
            int var6 = this.field218 + this.field218 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field210 + arg1; ~(arg1 - -this.field210) <= ~var9; ++var9) {
                int[] var13 = this.method1931((byte) -116, 0, class144.field2332 & var9);
                int[] var14 = new int[class186.field2986];
                int var15 = 0;
                for (int var16 = -this.field218; ~this.field218 <= ~var16; ++var16) {
                    var15 += var13[var16 & class34.field422];
                }
                int var17 = 0;
                while (~class186.field2986 < ~var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class34.field422 & -this.field218 + var17];
                    ++var17;
                    var15 = var13[var17 - -this.field218 & class34.field422] + var18;
                }
                var8[-arg1 + var9 + this.field210] = var14;
            }
            for (int var10 = 0; class186.field2986 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        if (arg1 != -19) {
            field216 = null;
        }
        ++field208;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field4612 = arg0.method1779(arg1 + -72) == 1;
                }
            } else {
                this.field210 = arg0.method1779(-74);
            }
        } else {
            this.field218 = arg0.method1779(-116);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)[[I")
    public final int[][] method34(int arg0, int arg1) {
        if (arg0 != 1) {
            field213 = 93;
        }
        ++field209;
        int[][] var3 = super.field4598.method812(arg1, 65535);
        if (super.field4598.field1954) {
            int var4 = this.field210 + this.field210 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field218 + this.field218 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field210 + arg1; var9 <= arg1 - -this.field210; ++var9) {
                int[][] var19 = this.method1930(0, class144.field2332 & var9, (byte) 107);
                int[][] var20 = new int[3][class186.field2986];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[2];
                int[] var26 = var19[1];
                for (int var27 = -this.field218; ~this.field218 <= ~var27; ++var27) {
                    int var37 = var27 & class34.field422;
                    var23 += var25[var37];
                    var21 += var26[var37];
                    var22 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~var31 > ~class186.field2986) {
                    var28[var31] = var7 * var22 >> 16;
                    var29[var31] = var7 * var21 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class34.field422 & -this.field218 + var31;
                    int var33 = var22 - var24[var32];
                    ++var31;
                    int var34 = var23 - var25[var32];
                    int var35 = var21 - var26[var32];
                    int var36 = class34.field422 & this.field218 + var31;
                    var22 = var24[var36] + var33;
                    var23 = var25[var36] + var34;
                    var21 = var26[var36] + var35;
                }
                var8[this.field210 + var9 + -arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[2];
            int[] var12 = var3[1];
            for (int var13 = 0; ~class186.field2986 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var17 > ~var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var15 += var18[0][var13];
                    var14 += var18[1][var13];
                }
                var10[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIZ)V")
    public static final void method128(int arg0, int arg1, boolean arg2) {
        class283 var3 = class46.method360(6, -66, arg1);
        var3.method1893(0);
        if (arg2) {
            field213 = 60;
        }
        var3.field4528 = arg0;
        ++field212;
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(II)Luf;")
    public static final class19 method129(int arg0, int arg1) {
        ++field214;
        class19 var2 = (class19) class54.field765.method1579((long) arg1, arg0 + -11);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class16.field188.method940((byte) 103, arg1, arg0);
            class19 var4 = new class19();
            if (var3 != null) {
                var4.method132(new class264(var3), (byte) -56);
            }
            class54.field765.method1578(var4, (long) arg1, 50);
            return var4;
        }
    }
}
