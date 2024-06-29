import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class205 extends class160 {

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "I")
    private int field3199 = 1;

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "I")
    private int field3201 = 1;

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "I")
    public static int field3197 = -1;

    @OriginalMember(owner = "client!bf", name = "eb", descriptor = "[I")
    public static int[] field3206 = new int[128];

    @OriginalMember(owner = "client!bf", name = "fb", descriptor = "I")
    public static int field3207 = 0;

    @OriginalMember(owner = "client!bf", name = "db", descriptor = "Lre;")
    public static class228 field3205 = null;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!bf", name = "Y", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!bf", name = "ab", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!bf", name = "bb", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!bf", name = "gb", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "Lhc;")
    public static class235 field3198;

    @OriginalMember(owner = "client!bf", name = "cb", descriptor = "Lhc;")
    public static class235 field3204;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "[[Z")
    public static boolean[][] field3196;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field2494 = ~arg0.method633(66) == -2;
                }
            } else {
                this.field3199 = arg0.method633(110);
            }
        } else {
            this.field3201 = arg0.method633(63);
        }
        ++field3195;
        if (arg1 <= 11) {
            this.method1(21, (byte) 106);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZLvl;Z)V")
    public static final void method1381(boolean arg0, class242 arg1, boolean arg2) {
        ++field3208;
        if (arg2) {
            int var3 = class79.field1310;
            int var4 = var3 * 956 / 503;
            class45.field642.method845((class29.field409 - var4) / 2, 0, var4, var3);
            class170.field2646.method1296(class29.field409 / 2 + -(class170.field2646.field2985 / 2), 18);
        }
        arg1.method1671(class263.field4187, class29.field409 / 2, class79.field1310 / 2 + -26, 16777215, -1);
        int var5 = class79.field1310 / 2 + -18;
        class211.method1411(class29.field409 / 2 + -152, var5, 304, 34, 9179409);
        class211.method1411(class29.field409 / 2 + -151, var5 + 1, 302, 32, 0);
        class211.method1424(class29.field409 / 2 + -150, var5 - -2, class121.field1949 * 3, 30, 9179409);
        class211.method1424(class29.field409 / 2 + class121.field1949 * 3 + -150, var5 + 2, -(class121.field1949 * 3) + 300, 30, 0);
        if (arg0) {
            method1382(true, (byte) -72);
        }
        arg1.method1671(class60.field1025, class29.field409 / 2, class79.field1310 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZB)V")
    public static final void method1382(boolean arg0, byte arg1) {
        ++field3202;
        class230.method1534(false);
        if (~class39.field551 == -31 || class39.field551 == 25) {
            if (arg1 <= 123) {
                method1381(true, (class242) null, false);
            }
            ++class29.field403;
            if (~class29.field403 <= -51 || arg0) {
                class29.field403 = 0;
                if (!client.field2438 && class249.field4022 != null) {
                    client.field2435.method536((byte) -104, 132);
                    try {
                        class249.field4022.method897(client.field2435.field1535, client.field2435.field1471, 0, 5000);
                        client.field2435.field1535 = 0;
                    } catch (IOException var2) {
                        client.field2438 = true;
                    }
                    ++class27.field373;
                }
                class230.method1534(false);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    public static void method1383(boolean arg0) {
        if (!arg0) {
            field3207 = 71;
        }
        field3196 = null;
        field3198 = null;
        field3205 = null;
        field3204 = null;
        field3206 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method3(int arg0, boolean arg1) {
        ++field3200;
        int[][] var3 = super.field2476.method839(false, arg0);
        if (super.field2476.field1950) {
            int var4 = this.field3199 + this.field3199 + 1;
            int var5 = 65536 / var4;
            int[][][] var6 = new int[var4][][];
            int var7 = this.field3201 + 1 + this.field3201;
            int var8 = 65536 / var7;
            for (int var9 = -this.field3199 + arg0; ~(this.field3199 + arg0) <= ~var9; ++var9) {
                int[][] var19 = this.method1079(class53.field811 & var9, 90, 0);
                int[][] var20 = new int[3][class240.field3896];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[2];
                int[] var25 = var19[0];
                int[] var26 = var19[1];
                for (int var27 = -this.field3201; ~var27 >= ~this.field3201; ++var27) {
                    int var37 = var27 & class189.field2929;
                    var22 += var24[var37];
                    var21 += var25[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~var31 > ~class240.field3896) {
                    var28[var31] = var8 * var21 >> 16;
                    var29[var31] = var8 * var23 >> 16;
                    var30[var31] = var8 * var22 >> 16;
                    int var32 = -this.field3201 + var31 & class189.field2929;
                    int var33 = var22 - var24[var32];
                    ++var31;
                    int var34 = var23 - var26[var32];
                    int var35 = var21 - var25[var32];
                    int var36 = class189.field2929 & this.field3201 + var31;
                    var21 = var25[var36] + var35;
                    var22 = var24[var36] + var33;
                    var23 = var26[var36] + var34;
                }
                var6[this.field3199 + var9 + -arg0] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[2];
            int[] var12 = var3[1];
            for (int var13 = 0; ~class240.field3896 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
                    int[][] var18 = var6[var17];
                    var14 += var18[0][var13];
                    var15 += var18[1][var13];
                    var16 += var18[2][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var12[var13] = var5 * var15 >> 16;
                var11[var13] = var5 * var16 >> 16;
            }
        }
        if (!arg1) {
            this.method2((class88) null, -82, 99);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    public class205() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        if (arg1 != 57) {
            this.method2((class88) null, 127, 86);
        }
        ++field3203;
        int[] var3 = super.field2488.method15((byte) 127, arg0);
        if (super.field2488.field42) {
            int var4 = this.field3201 + this.field3201 + 1;
            int var5 = this.field3199 - (-this.field3199 - 1);
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][] var8 = new int[var5][];
            for (int var9 = arg0 - this.field3199; ~(arg0 - -this.field3199) <= ~var9; ++var9) {
                int[] var13 = this.method1085(0, var9 & class53.field811, (byte) 65);
                int[] var14 = new int[class240.field3896];
                int var15 = 0;
                for (int var16 = -this.field3201; ~this.field3201 <= ~var16; ++var16) {
                    var15 += var13[class189.field2929 & var16];
                }
                int var17 = 0;
                while (var17 < class240.field3896) {
                    var14[var17] = var6 * var15 >> 16;
                    int var18 = var15 - var13[-this.field3201 + var17 & class189.field2929];
                    ++var17;
                    var15 = var13[class189.field2929 & this.field3201 + var17] + var18;
                }
                var8[-arg0 + var9 + this.field3199] = var14;
            }
            for (int var10 = 0; var10 < class240.field3896; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var5 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var7 * var11 >> 16;
            }
        }
        return var3;
    }
}
