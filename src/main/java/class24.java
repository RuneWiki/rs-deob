import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class24 extends class99 {

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    private int field309 = 1;

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "I")
    private int field316 = 1;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "S")
    public static short field308 = 32767;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "Lr;")
    public static class66 field310 = class93.method641(43, " x ");

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "F")
    public static float field314;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!mh", name = "ab", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "Ltf;")
    public static class54 field313;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "[I")
    public static int[] field307;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(B)V")
    public static void method105(byte arg0) {
        field310 = null;
        field307 = null;
        field313 = null;
        if (arg0 <= 10) {
            method106(31, -36, 15);
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class24() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field308 = -91;
        }
        ++field315;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field1938 = arg0.method1677(arg2 ^ 6676) == 1;
                }
            } else {
                this.field309 = arg0.method1677(-6677);
            }
        } else {
            this.field316 = arg0.method1677(-6677);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method37(int arg0, boolean arg1) {
        if (!arg1) {
            method107(123, -69, -104);
        }
        ++field317;
        int[][] var3 = super.field1946.method823(arg0, (byte) -5);
        if (super.field1946.field2297) {
            int var4 = this.field309 - -1 + this.field309;
            int var5 = 65536 / var4;
            int var6 = this.field316 - -this.field316 + 1;
            int[][][] var7 = new int[var4][][];
            int var8 = 65536 / var6;
            for (int var9 = -this.field309 + arg0; ~(this.field309 + arg0) <= ~var9; ++var9) {
                int[][] var19 = this.method683(-53, 0, var9 & class45.field833);
                int[][] var20 = new int[3][class199.field3432];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[2];
                int[] var25 = var19[0];
                int[] var26 = var19[1];
                for (int var27 = -this.field316; var27 <= this.field316; ++var27) {
                    int var37 = var27 & class98.field1914;
                    var22 += var24[var37];
                    var23 += var26[var37];
                    var21 += var25[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~var31 > ~class199.field3432) {
                    var28[var31] = var8 * var21 >> 16;
                    var29[var31] = var8 * var23 >> 16;
                    var30[var31] = var8 * var22 >> 16;
                    int var32 = var31 - this.field316 & class98.field1914;
                    int var33 = var22 - var24[var32];
                    int var34 = var21 - var25[var32];
                    ++var31;
                    int var35 = var23 - var26[var32];
                    int var36 = class98.field1914 & this.field316 + var31;
                    var21 = var25[var36] + var34;
                    var22 = var24[var36] + var33;
                    var23 = var26[var36] + var35;
                }
                var7[-arg0 + var9 - -this.field309] = var20;
            }
            int[] var10 = var3[1];
            int[] var11 = var3[0];
            int[] var12 = var3[2];
            for (int var13 = 0; class199.field3432 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var17 > ~var4; ++var17) {
                    int[][] var18 = var7[var17];
                    var15 += var18[1][var13];
                    var16 += var18[2][var13];
                    var14 += var18[0][var13];
                }
                var11[var13] = var5 * var14 >> 16;
                var10[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(III)Lje;")
    public static final class140 method106(int arg0, int arg1, int arg2) {
        class16 var3 = class110.field2124[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class140 var4 = var3.field207;
            var3.field207 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(III)Lhd;")
    public static final class90 method107(int arg0, int arg1, int arg2) {
        class16 var3 = class110.field2124[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class90 var4 = var3.field225;
            var3.field225 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        int[] var3 = super.field1943.method749(false, arg1);
        if (arg0 != -61) {
            return null;
        } else {
            if (super.field1943.field2147) {
                int var4 = this.field316 + this.field316 + 1;
                int var5 = this.field309 + 1 + this.field309;
                int var6 = 65536 / var4;
                int[][] var7 = new int[var5][];
                for (int var8 = -this.field309 + arg1; ~var8 >= ~(arg1 - -this.field309); ++var8) {
                    int[] var13 = this.method682(0, class45.field833 & var8, 29149);
                    int var14 = 0;
                    for (int var15 = -this.field316; ~var15 >= ~this.field316; ++var15) {
                        var14 += var13[class98.field1914 & var15];
                    }
                    int[] var16 = new int[class199.field3432];
                    int var17 = 0;
                    while (var17 < class199.field3432) {
                        var16[var17] = var6 * var14 >> 16;
                        int var18 = var14 - var13[class98.field1914 & -this.field316 + var17];
                        ++var17;
                        var14 = var13[class98.field1914 & this.field316 + var17] + var18;
                    }
                    var7[-arg1 + this.field309 + var8] = var16;
                }
                int var9 = 65536 / var5;
                for (int var10 = 0; class199.field3432 > var10; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; var5 > var12; ++var12) {
                        var11 += var7[var12][var10];
                    }
                    var3[var10] = var9 * var11 >> 16;
                }
            }
            ++field311;
            return var3;
        }
    }
}
