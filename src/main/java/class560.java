import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class560 extends class281 {

    @OriginalMember(owner = "client!si", name = "J", descriptor = "F")
    private float field7900 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "F")
    private float field7907 = -3.4028235E38F;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "Lkba;")
    private class108 field7885 = new class108();

    @OriginalMember(owner = "client!si", name = "l", descriptor = "Luv;")
    public class367 field7876;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    private int field7882;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "[[B")
    private byte[][] field7892;

    @OriginalMember(owner = "client!si", name = "P", descriptor = "[[[I")
    private int[][][] field7906;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "I")
    private int field7887;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "I")
    public int field7890;

    @OriginalMember(owner = "client!si", name = "N", descriptor = "[[[I")
    public int[][][] field7904;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "[[[Lli;")
    private class431[][][] field7897;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "[[S")
    public short[][] field7883;

    @OriginalMember(owner = "client!si", name = "W", descriptor = "[[F")
    private float[][] field7913;

    @OriginalMember(owner = "client!si", name = "Z", descriptor = "[[F")
    private float[][] field7916;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "[[[I")
    private int[][][] field7881;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "[[[I")
    public int[][][] field7878;

    @OriginalMember(owner = "client!si", name = "bb", descriptor = "[[B")
    private byte[][] field7918;

    @OriginalMember(owner = "client!si", name = "O", descriptor = "[[[I")
    public int[][][] field7905;

    @OriginalMember(owner = "client!si", name = "cb", descriptor = "[[F")
    private float[][] field7919;

    @OriginalMember(owner = "client!si", name = "U", descriptor = "Lwr;")
    private class459 field7911;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "Lbba;")
    private class116 field7896;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field7875;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field7877;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    private int field7880;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "I")
    public static int field7884;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "I")
    public static int field7886;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "I")
    public static int field7888;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "I")
    public static int field7889;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "I")
    public static int field7891;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "I")
    public static int field7893;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "I")
    public static int field7894;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "I")
    public static int field7895;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "I")
    private int field7898;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "I")
    public static int field7899;

    @OriginalMember(owner = "client!si", name = "L", descriptor = "I")
    public static int field7902;

    @OriginalMember(owner = "client!si", name = "M", descriptor = "I")
    public static int field7903;

    @OriginalMember(owner = "client!si", name = "R", descriptor = "I")
    private int field7908;

    @OriginalMember(owner = "client!si", name = "V", descriptor = "I")
    public static int field7912;

    @OriginalMember(owner = "client!si", name = "Y", descriptor = "I")
    private int field7915;

    @OriginalMember(owner = "client!si", name = "S", descriptor = "Ltea;")
    private class241 field7909;

    @OriginalMember(owner = "client!si", name = "X", descriptor = "Ltea;")
    private class241 field7914;

    @OriginalMember(owner = "client!si", name = "ab", descriptor = "Lqa;")
    public class251 field7917;

    @OriginalMember(owner = "client!si", name = "T", descriptor = "[Lli;")
    private class431[] field7910;

    @OriginalMember(owner = "client!si", name = "K", descriptor = "[[[I")
    private int[][][] field7901;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIZ[[ZIIB)V")
    private final void method3161(int arg0, int arg1, int arg2, boolean arg3, boolean[][] arg4, int arg5, int arg6, byte arg7) {
        if (this.field7910 != null) {
            int var9 = arg5 + arg5 + 1;
            int var10 = var9 * var9;
            if (~class716.field10007.length > ~var10) {
                class716.field10007 = new int[var10];
            }
            int var11 = -arg5 + arg1;
            int var12 = var11;
            if (~var11 > -1) {
                var11 = 0;
            }
            int var13 = arg2 - arg5;
            int var14 = var13;
            if (var13 < 0) {
                var13 = 0;
            }
            int var15 = arg1 + arg5;
            if (~var15 < ~(super.field3727 - 1)) {
                var15 = super.field3727 + -1;
            }
            int var16 = arg2 - -arg5;
            class263.field3445 = 0;
            if (super.field3728 + -1 < var16) {
                var16 = super.field3728 + -1;
            }
            for (int var17 = var11; var15 >= var17; ++var17) {
                boolean[] var24 = arg4[-var12 + var17];
                for (int var25 = var13; var16 >= var25; ++var25) {
                    if (var24[-var14 + var25]) {
                        class716.field10007[class263.field3445++] = super.field3727 * var25 - -var17;
                    }
                }
            }
            if (arg6 != -1) {
                this.field7876.method2179(117, (float) arg6);
                this.field7876.method2104(4);
            } else {
                this.field7876.method2129(-65);
            }
            this.field7876.method2120(13951);
            this.field7876.method2131((7 & this.field7890) != 0, -126);
            this.field7876.method2167(false, 0, -1, false);
            this.field7876.method1325(0, true, this.field7914);
            for (int var18 = 0; this.field7910.length > var18; ++var18) {
                this.field7910[var18].method2460(class716.field10007, class263.field3445, 32736);
            }
            class648 var19 = this.field7876.method2130((byte) 121);
            var19.method33(0, -1, 0);
            this.field7876.method2103(1);
            if (!this.field7885.method726(-124)) {
                int var20 = this.field7876.field5128;
                int var21 = this.field7876.field5073;
                this.field7876.method442(0, var21, this.field7876.field5093);
                this.field7876.method2131(false, -105);
                this.field7876.method2142(0, false);
                this.field7876.method2145(128, 70);
                this.field7876.method2167(false, 0, -2, false);
                this.field7876.method2148(this.field7876.field5078, -115);
                this.field7876.method2156(class365.field4838, class199.field2365, 22831);
                this.field7876.method2174(0, -126, class421.field5897);
                this.field7876.method2116(-91, class293.field3928, 0);
                for (class55 var22 = this.field7885.method724(32); var22 != null; var22 = this.field7885.method723(119)) {
                    class512 var23 = (class512) var22;
                    var23.method2835(0, arg4, arg1, arg2, arg5);
                }
                this.field7876.method2174(0, -76, class71.field769);
                this.field7876.method2116(-103, class71.field769, 0);
                this.field7876.method2148((class649) null, 69);
                this.field7876.method442(var20, var21, this.field7876.field5093);
            }
            if (this.field7896 != null) {
                this.field7876.method1325(0, true, this.field7914);
                this.field7876.method1325(1, true, this.field7909);
                this.field7876.method1330(this.field7917, (byte) 100);
                this.field7896.method763(arg1, arg3, arg4, arg2, arg5, 119);
            }
        }
        if (arg7 >= -55) {
            this.field7913 = null;
        }
        ++field7903;
    }

    @OriginalMember(owner = "client!si", name = "YA", descriptor = "()V")
    public final void method1542() {
        if (this.field7915 <= 0) {
            this.field7896 = null;
        } else {
            byte[][] var1 = new byte[super.field3727 - -1][super.field3728 - -1];
            for (int var2 = 1; ~var2 > ~super.field3727; ++var2) {
                for (int var107 = 1; ~super.field3728 < ~var107; ++var107) {
                    var1[var2][var107] = (byte) ((this.field7918[var2 + 1][var107] >> 3) + (this.field7918[var2][var107] >> 1) + (this.field7918[var2][var107 - -1] >> 3) + (this.field7918[var2][var107 + -1] >> 2) + (this.field7918[var2 + -1][var107] >> 2));
                }
            }
            class431[] var3 = new class431[this.field7911.method2561((byte) -6)];
            this.field7911.method2554(var3, (byte) 74);
            for (int var4 = 0; var3.length > var4; ++var4) {
                var3[var4].method2462(this.field7915, 4);
            }
            int var5 = 20;
            if (this.field7901 != null) {
                var5 += 4;
            }
            if (~(7 & this.field7890) != -1) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field7876.field4851.method3778(this.field7915 * 4, false);
            NativeHeapBuffer var7 = this.field7876.field4851.method3778(this.field7915 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class431[] var10 = new class431[this.field7915];
            int var11 = class115.method761(68, this.field7915 / 4);
            if (var11 < 1) {
                var11 = 1;
            }
            class459 var12 = new class459(var11);
            class431[] var13 = new class431[this.field7908];
            for (int var14 = 0; super.field3727 > var14; ++var14) {
                for (int var34 = 0; ~var34 > ~super.field3728; ++var34) {
                    if (this.field7905[var14][var34] != null) {
                        class431[] var35 = this.field7897[var14][var34];
                        int[] var36 = this.field7878[var14][var34];
                        int[] var37 = this.field7904[var14][var34];
                        int[] var38 = this.field7906[var14][var34];
                        int[] var39 = this.field7905[var14][var34];
                        int[] var40 = this.field7881 != null ? this.field7881[var14][var34] : null;
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field7901 == null ? null : this.field7901[var14][var34];
                        float var42 = this.field7916[var14][var34];
                        float var43 = this.field7913[var14][var34];
                        float var44 = this.field7919[var14][var34];
                        float var45 = this.field7916[var14][var34 - -1];
                        float var46 = this.field7913[var14][var34 + 1];
                        float var47 = this.field7919[var14][var34 + 1];
                        float var48 = this.field7916[var14 + 1][var34 - -1];
                        float var49 = this.field7913[var14 + 1][var34 + 1];
                        float var50 = this.field7919[var14 + 1][var34 + 1];
                        float var51 = this.field7916[var14 + 1][var34];
                        float var52 = this.field7913[var14 + 1][var34];
                        float var53 = this.field7919[var14 - -1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = var1[var14][var34 + 1] & 255;
                        int var56 = 255 & var1[var14 - -1][var34 - -1];
                        int var57 = var1[var14 + 1][var34] & 255;
                        int var58 = 0;
                        label359: for (int var59 = 0; var39.length > var59; ++var59) {
                            class431 var105 = var35[var59];
                            for (int var106 = 0; ~var106 > ~var58; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label359;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field7883[super.field3727 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; ~var39.length < ~var61; ++var61) {
                            int var62 = (var14 << super.field3722) - -var36[var61];
                            int var63 = (var34 << super.field3722) + var37[var61];
                            int var64 = var62 >> this.field7882;
                            int var65 = var63 >> this.field7882;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 == null ? 0 : var40[var61];
                            long var69 = (long) var67 << 48 | (long) var66 << 32 | (long) (var64 << 16) | (long) var65;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75 = 1.0F;
                            float var76;
                            int var77;
                            float var78;
                            float var79;
                            if (~var71 == -1 && ~var72 == -1) {
                                var76 = var42;
                                var77 = var73 - var54;
                                var78 = var44;
                                var79 = var43;
                            } else if (~var71 == -1 && ~super.field3730 == ~var72) {
                                var77 = var73 - var55;
                                var79 = var46;
                                var78 = var47;
                                var76 = var45;
                            } else if (~super.field3730 == ~var71 && ~super.field3730 == ~var72) {
                                var79 = var49;
                                var76 = var48;
                                var77 = var73 - var56;
                                var78 = var50;
                            } else if (~super.field3730 == ~var71 && var72 == 0) {
                                var79 = var52;
                                var78 = var53;
                                var77 = var73 - var57;
                                var76 = var51;
                            } else {
                                float var80 = (float) var71 / (float) super.field3730;
                                float var81 = (float) var72 / (float) super.field3730;
                                float var82 = (var51 - var42) * var80 + var42;
                                float var83 = (-var43 + var52) * var80 + var43;
                                float var84 = (-var44 + var53) * var80 + var44;
                                float var85 = (-var45 + var48) * var80 + var45;
                                float var86 = (var49 - var46) * var80 + var46;
                                var79 = (var86 - var83) * var81 + var83;
                                float var87 = (-var47 + var50) * var80 + var47;
                                var76 = (-var82 + var85) * var81 + var82;
                                var78 = (-var84 + var87) * var81 + var84;
                                int var88 = ((var57 - var54) * var71 >> super.field3722) + var54;
                                int var89 = ((-var55 + var56) * var71 >> super.field3722) + var55;
                                var77 = var73 - (((var89 - var88) * var72 >> super.field3722) + var88);
                            }
                            if (var66 != -1) {
                                int var90 = (127 & var66) * var77 >> 7;
                                if (var90 < 2) {
                                    var90 = 2;
                                } else if (~var90 < -127) {
                                    var90 = 126;
                                }
                                if (~(7 & this.field7890) == -1) {
                                    float var91 = this.field7876.field5088[2] * var78 + this.field7876.field5088[0] * var76 + this.field7876.field5088[1] * var79;
                                    var75 = this.field7876.field5068 + var91 * (!(var91 > 0.0F) ? this.field7876.field5086 : this.field7876.field5122);
                                }
                                var74 = class645.field8982[var90 | 65408 & var66];
                            }
                            class55 var92 = null;
                            if ((var62 & this.field7887 + -1) == 0 && ~(this.field7887 + -1 & var63) == -1) {
                                var92 = var12.method2552(var69, -1);
                            }
                            int var103;
                            if (var92 == null) {
                                int var94;
                                if (~var66 != ~var67) {
                                    int var93 = (var67 & 127) * var77 >> 7;
                                    if (var93 < 2) {
                                        var93 = 2;
                                    } else if (~var93 < -127) {
                                        var93 = 126;
                                    }
                                    var94 = class645.field8982[var93 | var67 & 65408];
                                    if ((7 & this.field7890) == 0) {
                                        float var95 = this.field7876.field5088[2] * var78 + this.field7876.field5088[1] * var79 + this.field7876.field5088[0] * var76;
                                        float var96 = (!(var75 > 0.0F) ? this.field7876.field5086 : this.field7876.field5122) * var75 + this.field7876.field5068;
                                        int var97 = (16745905 & var94) >> 16;
                                        int var98 = (var94 & 65515) >> 8;
                                        int var99 = var94 & 255;
                                        int var100 = (int) ((float) var97 * var96);
                                        int var101 = (int) ((float) var98 * var96);
                                        if (var100 >= 0) {
                                            if (var100 > 255) {
                                                var100 = 255;
                                            }
                                        } else {
                                            var100 = 0;
                                        }
                                        if (~var101 <= -1) {
                                            if (var101 > 255) {
                                                var101 = 255;
                                            }
                                        } else {
                                            var101 = 0;
                                        }
                                        int var102 = (int) ((float) var99 * var96);
                                        if (var102 >= 0) {
                                            if (var102 > 255) {
                                                var102 = 255;
                                            }
                                        } else {
                                            var102 = 0;
                                        }
                                        var94 = var101 << 8 | var100 << 16 | var102;
                                    }
                                } else {
                                    var94 = var74;
                                }
                                if (!Stream.method3786()) {
                                    var8.method3781((float) var62);
                                    var8.method3781((float) (var68 + this.method1683(var62, var63, true)));
                                    var8.method3781((float) var63);
                                    var8.method3781((float) var62);
                                    var8.method3781((float) var63);
                                    if (this.field7901 != null) {
                                        var8.method3781((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if ((this.field7890 & 7) != 0) {
                                        var8.method3781(var76);
                                        var8.method3781(var79);
                                        var8.method3781(var78);
                                    }
                                } else {
                                    var8.method3784((float) var62);
                                    var8.method3784((float) (var68 + this.method1683(var62, var63, true)));
                                    var8.method3784((float) var63);
                                    var8.method3784((float) var62);
                                    var8.method3784((float) var63);
                                    if (this.field7901 != null) {
                                        var8.method3784((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if ((this.field7890 & 7) != 0) {
                                        var8.method3784(var76);
                                        var8.method3784(var79);
                                        var8.method3784(var78);
                                    }
                                }
                                if (this.field7876.field5072 == 0) {
                                    var9.method3794(-16777216 | var94);
                                } else {
                                    var9.method3782(var94 | -16777216);
                                }
                                var103 = this.field7898++;
                                var60[var61] = (short) var103;
                                if (~var66 != 0) {
                                    var10[var103] = var35[var61];
                                }
                                var12.method2558(new class450(var60[var61]), var69, -1);
                            } else {
                                var60[var61] = ((class450) var92).field6288;
                                var103 = 65535 & var60[var61];
                                if (~var66 != 0 && var35[var61].field556 < var10[var103].field556) {
                                    var10[var103] = var35[var61];
                                }
                            }
                            for (int var104 = 0; var58 > var104; ++var104) {
                                var13[var104].method2463(var103, var77, -1, var74, var75);
                            }
                            ++this.field7880;
                        }
                    }
                }
            }
            for (int var15 = 0; var15 < this.field7898; ++var15) {
                class431 var33 = var10[var15];
                if (var33 != null) {
                    var33.method2458(var15, true);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field3727; ++var16) {
                for (int var22 = 0; ~var22 > ~super.field3728; ++var22) {
                    short[] var23 = this.field7883[super.field3727 * var22 - -var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var23.length > var25) {
                            int var26 = 65535 & var23[var25++];
                            int var27 = 65535 & var23[var25++];
                            int var28 = 65535 & var23[var25++];
                            class431 var29 = var10[var26];
                            class431 var30 = var10[var27];
                            class431 var31 = var10[var28];
                            class431 var32 = null;
                            if (var29 != null) {
                                var29.method2461(var24, -20787, var16, var22);
                                var32 = var29;
                            }
                            if (var30 != null) {
                                var30.method2461(var24, -20787, var16, var22);
                                if (var32 == null || var30.field556 < var32.field556) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method2461(var24, -20787, var16, var22);
                                if (var32 == null || var31.field556 < var32.field556) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method2458(var26, true);
                                }
                                if (var30 != null) {
                                    var32.method2458(var27, true);
                                }
                                if (var31 != null) {
                                    var32.method2458(var28, true);
                                }
                                var32.method2461(var24, -20787, var16, var22);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3795();
            var9.method3795();
            this.field7909 = this.field7876.method1292(false, 44);
            this.field7909.method1449((byte) -123, this.field7898 * 4, 4, var6);
            this.field7914 = this.field7876.method1292(false, 71);
            this.field7914.method1449((byte) -89, this.field7898 * var5, var5, var7);
            if ((7 & this.field7890) != 0) {
                if (this.field7901 == null) {
                    this.field7917 = this.field7876.method1316(new class235[] { new class235(new class239[] { class239.field3118, class239.field3127, class239.field3123 }), new class235(class239.field3124) }, 6);
                } else {
                    this.field7917 = this.field7876.method1316(new class235[] { new class235(new class239[] { class239.field3118, class239.field3127, class239.field3125, class239.field3123 }), new class235(class239.field3124) }, 6);
                }
            } else if (this.field7901 != null) {
                this.field7917 = this.field7876.method1316(new class235[] { new class235(new class239[] { class239.field3118, class239.field3127, class239.field3125 }), new class235(class239.field3124) }, 6);
            } else {
                this.field7917 = this.field7876.method1316(new class235[] { new class235(new class239[] { class239.field3118, class239.field3127 }), new class235(class239.field3124) }, 6);
            }
            int var17 = 0;
            for (int var18 = 0; ~var3.length < ~var18; ++var18) {
                if (~var3[var18].field6083 < -1) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field7910 = new class431[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; ~var20 > ~var17; ++var20) {
                class431 var21 = var3[var20];
                var19[var20] = var21.field556;
                this.field7910[var20] = var21;
                var21.method2459(this.field7898, (byte) 97);
            }
            class403.method2332(this.field7910, false, var19);
            if (this.field7896 != null) {
                this.field7896.method765((byte) -23);
            }
        }
        ++field7884;
        this.field7901 = null;
        this.field7881 = null;
        this.field7911 = null;
        this.field7905 = null;
        this.field7918 = null;
        this.field7916 = this.field7913 = this.field7919 = null;
        this.field7897 = null;
        this.field7906 = null;
        this.field7878 = this.field7904 = null;
    }

    @OriginalMember(owner = "client!si", name = "ka", descriptor = "(III)V")
    public final void method1528(int arg0, int arg1, int arg2) {
        ++field7886;
        if (arg2 > (255 & this.field7918[arg0][arg1])) {
            this.field7918[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!si", name = "fa", descriptor = "(IILr;)Lr;")
    public final class184 method1540(int arg0, int arg1, class184 arg2) {
        ++field7899;
        if ((1 & this.field7892[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field3730 >> this.field7876.field5065;
            class601 var5 = (class601) arg2;
            class601 var6;
            if (var5 != null && var5.method3328(var4, var4, 22657)) {
                var6 = var5;
                var5.method3330(105);
            } else {
                var6 = new class601(this.field7876, var4, var4);
            }
            var6.method3327(var4, 0, 0, 0, var4);
            this.method3162(true, arg0, arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1530(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field7891;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; var28 < var18; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            ++var27;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            ++var27;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method1544(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!si", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1535(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7889;
        if (this.field7896 != null && arg0 != null) {
            int var7 = arg1 - (this.field7876.field5056 * arg2 >> 8) >> this.field7876.field5065;
            int var8 = arg3 - (this.field7876.field5044 * arg2 >> 8) >> this.field7876.field5065;
            this.field7896.method767(arg0, var7, (byte) 60, var8);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field7888;
        if (this.field7915 > 0) {
            class562 var9 = this.field7876.method2123(71, this.field7880);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; var13 < 4; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method179(true, -123);
                if (var14 != null) {
                    Stream var15 = this.field7876.method2170(24022, var14);
                    if (Stream.method3786()) {
                        for (int var16 = arg4; var16 < arg6; ++var16) {
                            int var17 = super.field3727 * var16 + arg3;
                            for (int var18 = arg3; ~arg5 < ~var18; ++var18) {
                                if (arg7[var18 - arg3][-arg4 + var16]) {
                                    short[] var19 = this.field7883[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; var20 < var19.length; ++var20) {
                                            int var21 = 65535 & var19[var20];
                                            ++var10;
                                            if (~var12 > ~var21) {
                                                var12 = var21;
                                            }
                                            var15.method3791(var21);
                                            if (~var21 > ~var11) {
                                                var11 = var21;
                                            }
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; var22 < arg6; ++var22) {
                            int var25 = super.field3727 * var22 + arg3;
                            for (int var26 = arg3; arg5 > var26; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field7883[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; ~var27.length < ~var28; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            if (~var12 > ~var29) {
                                                var12 = var29;
                                            }
                                            if (~var11 < ~var29) {
                                                var11 = var29;
                                            }
                                            var15.method3792(var29);
                                            ++var10;
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3795();
                    if (var9.method178((byte) 109)) {
                        break;
                    }
                }
            }
            if (~var10 < -1) {
                this.field7876.method2138((byte) 125);
                this.field7876.method2162(false, (byte) -101);
                this.field7876.method2131(false, -85);
                this.field7876.method2151(false, 2103);
                this.field7876.method2142(0, false);
                this.field7876.method2145(0, 74);
                this.field7876.method2167(false, 0, -2, false);
                this.field7876.method2148((class649) null, 24);
                class648 var23 = this.field7876.method2130((byte) -6);
                float[] var24 = this.field7876.method2165(-113);
                var24[0] = (float) arg2 / ((float) super.field3730 * 128.0F * (float) this.field7876.field4913);
                var24[5] = (float) arg2 / ((float) super.field3730 * 128.0F * (float) this.field7876.field4959);
                var24[9] = 0.0F;
                var24[6] = 0.0F;
                var24[10] = 1.0F / (this.field7907 - this.field7900);
                var24[14] = -this.field7900 / (this.field7907 - this.field7900);
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field7876.field4959;
                var24[7] = 0.0F;
                var24[2] = 0.0F;
                var24[8] = 0.0F;
                var24[11] = 0.0F;
                var24[1] = 0.0F;
                var24[15] = 1.0F;
                var24[4] = 0.0F;
                var24[3] = 0.0F;
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field7876.field4913;
                var23.method3651(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, (byte) -110);
                this.field7876.method2107((byte) -99);
                this.field7876.method2103(1);
                if (~(7 & this.field7890) == -1) {
                    this.field7876.method2131(false, -91);
                } else {
                    this.field7876.method2131(true, -116);
                    this.field7876.method1312((byte) 80);
                }
                this.field7876.method1338(false, false);
                this.field7876.method1325(0, true, this.field7914);
                this.field7876.method1325(1, true, this.field7909);
                this.field7876.method1330(this.field7917, (byte) -101);
                this.field7876.method1304(class387.field5460, var12 + 1 + -var11, 0, 26810, var9, var11, var10 / 3);
                this.field7876.method1338(true, false);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1529(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7894;
        if (this.field7896 != null && arg0 != null) {
            int var7 = -(this.field7876.field5056 * arg2 >> 8) + arg1 >> this.field7876.field5065;
            int var8 = arg3 - (this.field7876.field5044 * arg2 >> 8) >> this.field7876.field5065;
            this.field7896.method768(arg0, (byte) -102, var7, var8);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1534(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7895;
        if (this.field7896 != null && arg0 != null) {
            int var7 = -(this.field7876.field5056 * arg2 >> 8) + arg1 >> this.field7876.field5065;
            int var8 = -(this.field7876.field5044 * arg2 >> 8) + arg3 >> this.field7876.field5065;
            return this.field7896.method770(var8, arg0, 8, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZIILgl;)V")
    private final void method3162(boolean arg0, int arg1, int arg2, class601 arg3) {
        ++field7875;
        int[] var5 = this.field7878[arg1][arg2];
        if (!arg0) {
            this.method1538((class551) null, (int[]) null);
        }
        int[] var6 = this.field7904[arg1][arg2];
        int var7 = var5.length;
        if (var7 > class723.field10092.length) {
            class182.field2228 = new int[var7];
            class723.field10092 = new int[var7];
        }
        for (int var8 = 0; var8 < var7; ++var8) {
            class723.field10092[var8] = var5[var8] >> this.field7876.field5065;
            class182.field2228[var8] = var6[var8] >> this.field7876.field5065;
        }
        int var9 = 0;
        while (var9 < var7) {
            int var10 = class723.field10092[var9];
            int var11 = class182.field2228[var9++];
            int var12 = class723.field10092[var9];
            int var13 = class182.field2228[var9++];
            int var14 = class723.field10092[var9];
            int var15 = class182.field2228[var9++];
            if ((var10 - var12) * (-var15 + var13) + -((-var11 + var13) * (-var12 + var14)) > 0) {
                arg3.method3329(var11, var10, var12, var14, var15, (byte) -69, var13);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lcba;[I)V")
    public final void method1538(class551 arg0, int[] arg1) {
        this.field7885.method725(new class512(this.field7876, this, arg0, arg1), -20911);
        ++field7893;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Luv;IIII[[I[[II)V")
    public class560(class367 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field7876 = arg0;
        this.field7882 = super.field3722 + -2;
        this.field7892 = new byte[arg3][arg4];
        this.field7906 = new int[arg3][arg4][];
        this.field7887 = 1 << this.field7882;
        this.field7890 = arg2;
        this.field7904 = new int[arg3][arg4][];
        this.field7897 = new class431[arg3][arg4][];
        this.field7883 = new short[arg3 * arg4][];
        this.field7913 = new float[super.field3727 - -1][super.field3728 + 1];
        this.field7916 = new float[super.field3727 + 1][super.field3728 + 1];
        this.field7881 = new int[arg3][arg4][];
        this.field7878 = new int[arg3][arg4][];
        this.field7918 = new byte[arg3 + 1][arg4 - -1];
        this.field7905 = new int[arg3][arg4][];
        this.field7919 = new float[super.field3727 - -1][super.field3728 - -1];
        for (int var9 = 0; ~var9 >= ~super.field3728; ++var9) {
            for (int var10 = 0; ~var10 >= ~super.field3727; ++var10) {
                int var11 = super.field3723[var10][var9];
                if (this.field7907 < (float) var11) {
                    this.field7907 = (float) var11;
                }
                if ((float) var11 < this.field7900) {
                    this.field7900 = (float) var11;
                }
                if (var10 > 0 && ~var9 < -1 && var10 < super.field3727 && var9 < super.field3728) {
                    int var12 = arg6[var10 + 1][var9] - arg6[var10 - 1][var9];
                    int var13 = arg6[var10][var9 - -1] + -arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var13 * var13)));
                    this.field7916[var10][var9] = (float) var12 * var14;
                    this.field7913[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field7919[var10][var9] = (float) var13 * var14;
                }
            }
        }
        --this.field7900;
        ++this.field7907;
        this.field7911 = new class459(128);
        if ((16 & this.field7890) != 0) {
            this.field7896 = new class116(this.field7876, this);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1548(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method3161(arg5, arg0, arg1, arg4, arg3, arg2, -1, (byte) -127);
        ++field7879;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II)V")
    public final void method1543(int arg0, int arg1) {
        ++field7877;
    }

    @OriginalMember(owner = "client!si", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1544(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field7902;
        class152 var15 = this.field7876.field636;
        if (arg5 != null && this.field7901 == null) {
            this.field7901 = new int[super.field3727][super.field3728][];
        }
        if (arg3 != null && this.field7881 == null) {
            this.field7881 = new int[super.field3727][super.field3728][];
        }
        this.field7878[arg0][arg1] = arg2;
        this.field7904[arg0][arg1] = arg4;
        this.field7905[arg0][arg1] = arg6;
        this.field7906[arg0][arg1] = arg7;
        if (this.field7901 != null) {
            this.field7901[arg0][arg1] = arg5;
        }
        if (this.field7881 != null) {
            this.field7881[arg0][arg1] = arg3;
        }
        class431[] var16 = this.field7897[arg0][arg1] = new class431[arg6.length];
        for (int var17 = 0; var17 < arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(this.field7890 & 32) != -1 && ~var18 != 0 && var15.method925(var18, -28755).field4527) {
                var19 = 128;
                var18 = -1;
            }
            long var20 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (var19 << 14) | (long) var18;
            class55 var22;
            for (var22 = this.field7911.method2552(var20, -1); var22 != null; var22 = this.field7911.method2555(-95)) {
                class431 var23 = (class431) var22;
                if (~var23.field6061 == ~var18 && (float) var19 == var23.field6072 && ~var23.field6071 == ~arg10 && var23.field6070 == arg11 && var23.field6064 == arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class431(this, var18, var19, arg10, arg11, arg12);
                this.field7911.method2558(var16[var17], var20, -1);
            } else {
                var16[var17] = (class431) var22;
            }
        }
        if (arg13) {
            this.field7892[arg0][arg1] = (byte) class344.method2020(this.field7892[arg0][arg1], 1);
        }
        if (arg6.length > this.field7908) {
            this.field7908 = arg6.length;
        }
        this.field7915 += arg6.length;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1541(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        ++field7912;
        this.method3161(arg6, arg0, arg1, arg4, arg3, arg2, arg5, (byte) -98);
    }
}
