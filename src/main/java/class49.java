import java.io.UnsupportedEncodingException;
import java.util.Date;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class49 extends class117 {

    @OriginalMember(owner = "client!fh", name = "Y", descriptor = "I")
    private int field820 = 3216;

    @OriginalMember(owner = "client!fh", name = "ab", descriptor = "I")
    private int field822 = 3216;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "I")
    private int field815 = 4096;

    @OriginalMember(owner = "client!fh", name = "nb", descriptor = "[I")
    private int[] field835 = new int[3];

    @OriginalMember(owner = "client!fh", name = "W", descriptor = "I")
    public static int field818 = -1;

    @OriginalMember(owner = "client!fh", name = "db", descriptor = "[Lhh;")
    public static class163[] field825 = new class163[1000];

    @OriginalMember(owner = "client!fh", name = "jb", descriptor = "I")
    public static int field831 = 0;

    @OriginalMember(owner = "client!fh", name = "cb", descriptor = "[[I")
    private static int[][] field824 = new int[5][5000];

    @OriginalMember(owner = "client!fh", name = "mb", descriptor = "[I")
    public static int[] field834 = new int[2000];

    @OriginalMember(owner = "client!fh", name = "bb", descriptor = "I")
    public static int field823 = 0;

    @OriginalMember(owner = "client!fh", name = "gb", descriptor = "Z")
    public static boolean field828 = false;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!fh", name = "X", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!fh", name = "Z", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!fh", name = "eb", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!fh", name = "fb", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!fh", name = "hb", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!fh", name = "ib", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!fh", name = "kb", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!fh", name = "lb", descriptor = "Lpa;")
    public static class123 field833;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        int[] var3 = super.field2218.method1044(arg1, arg0 + 21393);
        if (arg0 != -21393) {
            method353(-78);
        }
        ++field821;
        if (super.field2218.field2587) {
            int var4 = class172.field3147 * this.field815 >> 12;
            int[] var5 = this.method932(arg1 + -1 & class258.field4520, false, 0);
            int[] var6 = this.method932(arg1, false, 0);
            int[] var7 = this.method932(arg1 + 1 & class258.field4520, false, 0);
            for (int var8 = 0; var8 < class143.field2702; ++var8) {
                int var9 = (var6[var8 - 1 & class54.field884] + -var6[class54.field884 & var8 - -1]) * var4 >> 12;
                int var10 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var11 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = 255 & class65.field1103[var11 - -((var12 + 1) * var12 >> 1)];
                int var14 = var10 * var13 >> 8;
                int var15 = this.field835[1] * var14 >> 12;
                int var16 = var9 * var13 >> 8;
                int var17 = var13 * 4096 >> 8;
                int var18 = this.field835[2] * var17 >> 12;
                int var19 = this.field835[0] * var16 >> 12;
                var3[var8] = var19 - -var15 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "(I)V")
    private final void method347(int arg0) {
        ++field832;
        double var2 = Math.cos((double) ((float) this.field822 / 4096.0F));
        this.field835[0] = (int) (Math.sin((double) ((float) this.field820 / 4096.0F)) * var2 * 4096.0D);
        this.field835[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field820 / 4096.0F)));
        this.field835[2] = (int) (Math.sin((double) ((float) this.field822 / 4096.0F)) * 4096.0D);
        int var4 = this.field835[0] * this.field835[0] >> 12;
        int var5 = this.field835[arg0] * this.field835[2] >> 12;
        int var6 = this.field835[1] * this.field835[1] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var6 + var5 >> 12)));
        if (~var7 != -1) {
            this.field835[2] = (this.field835[2] << 12) / var7;
            this.field835[1] = (this.field835[1] << 12) / var7;
            this.field835[0] = (this.field835[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(III)V")
    public static final void method348(int arg0, int arg1, int arg2) {
        class55.field908 = true;
        class135.field2604 = arg0;
        class59.field974 = arg1;
        class8.field138 = arg2;
        class13.field211 = -1;
        field818 = -1;
    }

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "(I)V")
    public static final void method349(int arg0) {
        class100.field1930.method111((byte) -52);
        if (arg0 != -1102) {
            field823 = -41;
        }
        ++field830;
        class18.field278.method111((byte) -52);
        class29.field466.method111((byte) -52);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        ++field826;
        if (arg0 != 0) {
            this.field815 = 94;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field822 = arg2.method658(80);
                }
            } else {
                this.field820 = arg2.method658(66);
            }
        } else {
            this.field815 = arg2.method658(arg0 ^ 97);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILpa;Lpa;)V")
    public static final void method350(int arg0, class123 arg1, class123 arg2) {
        class117.field2214 = arg2;
        class217.field3957 = arg1;
        if (arg0 != -61) {
            method353(-16);
        }
        ++field814;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BZ)V")
    public static final void method351(byte arg0, boolean arg1) {
        ++field816;
        class50.field840 = arg1;
        if (class50.field840) {
            int var2 = class33.field502.method658(127);
            class33.field502.method82(arg0 ^ 9);
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var22 = 0; var22 < 13; ++var22) {
                    for (int var23 = 0; var23 < 13; ++var23) {
                        int var24 = class33.field502.method74((byte) -96, 1);
                        if (~var24 == -2) {
                            class170.field3108[var3][var22][var23] = class33.field502.method74((byte) -101, 26);
                        } else {
                            class170.field3108[var3][var22][var23] = -1;
                        }
                    }
                }
            }
            class33.field502.method81(7);
            int var4 = (class125.field2415 - class33.field502.field1541) / 16;
            class119.field2243 = new int[var4][4];
            for (int var5 = 0; ~var4 < ~var5; ++var5) {
                for (int var21 = 0; var21 < 4; ++var21) {
                    class119.field2243[var5][var21] = class33.field502.method603(-1);
                }
            }
            int var6 = class33.field502.method658(125);
            int var7 = class33.field502.method658(96);
            int var8 = class33.field502.method611(true);
            int var9 = class33.field502.method608(-8);
            class199.field3572 = new int[var4];
            class264.field4593 = null;
            class219.field3984 = new byte[var4][];
            class160.field2943 = new byte[var4][];
            class152.field2847 = new int[var4];
            class68.field1150 = null;
            class120.field2262 = new int[var4];
            int var10 = 0;
            for (int var11 = 0; ~var11 > -5; ++var11) {
                for (int var12 = 0; var12 < 13; ++var12) {
                    for (int var13 = 0; var13 < 13; ++var13) {
                        int var14 = class170.field3108[var11][var12][var13];
                        if (~var14 != 0) {
                            int var15 = var14 >> 14 & 1023;
                            int var16 = 2047 & var14 >> 3;
                            int var17 = (var15 / 8 << 8) + var16 / 8;
                            for (int var18 = 0; ~var10 < ~var18; ++var18) {
                                if (~class199.field3572[var18] == ~var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (var17 != -1) {
                                class199.field3572[var10] = var17;
                                int var19 = 255 & var17 >> 8;
                                int var20 = 255 & var17;
                                class152.field2847[var10] = class139.field2667.method983(24108, class145.method1101(0, new class163[] { class55.field921, class136.method1061(var19, (byte) 103), class21.field342, class136.method1061(var20, (byte) 116) }));
                                class120.field2262[var10] = class139.field2667.method983(arg0 + 24107, class145.method1101(0, new class163[] { class99.field1901, class136.method1061(var19, (byte) 121), class21.field342, class136.method1061(var20, (byte) 104) }));
                                ++var10;
                            }
                        }
                    }
                }
            }
            class31.method188(false, var7, arg0 + -2, var2, var8, var9, var6);
        } else {
            int var25 = class33.field502.method614((byte) -122);
            int var26 = (-class33.field502.field1541 + class125.field2415) / 16;
            class119.field2243 = new int[var26][4];
            for (int var27 = 0; var26 > var27; ++var27) {
                for (int var37 = 0; var37 < 4; ++var37) {
                    class119.field2243[var27][var37] = class33.field502.method639(arg0 + 1);
                }
            }
            int var28 = class33.field502.method658(70);
            int var29 = class33.field502.method609((byte) 118);
            int var30 = class33.field502.method611(true);
            int var31 = class33.field502.method614((byte) -127);
            class160.field2943 = new byte[var26][];
            class152.field2847 = new int[var26];
            class68.field1150 = null;
            class219.field3984 = new byte[var26][];
            class199.field3572 = new int[var26];
            class264.field4593 = null;
            class120.field2262 = new int[var26];
            boolean var32 = false;
            int var33 = 0;
            if ((~(var30 / 8) == -49 || var30 / 8 == 49) && ~(var25 / 8) == -49) {
                var32 = true;
            }
            if (~(var30 / 8) == -49 && ~(var25 / 8) == -149) {
                var32 = true;
            }
            for (int var34 = (var30 + -6) / 8; (var30 - -6) / 8 >= var34; ++var34) {
                for (int var35 = (var25 - 6) / 8; ~var35 >= ~((var25 + 6) / 8); ++var35) {
                    int var36 = (var34 << 8) + var35;
                    if (!var32 || var35 != 49 && var35 != 149 && var35 != 147 && var34 != 50 && (~var34 != -50 || var35 != 47)) {
                        class199.field3572[var33] = var36;
                        class152.field2847[var33] = class139.field2667.method983(24108, class145.method1101(0, new class163[] { class55.field921, class136.method1061(var34, (byte) 120), class21.field342, class136.method1061(var35, (byte) 113) }));
                        class120.field2262[var33] = class139.field2667.method983(arg0 + 24107, class145.method1101(0, new class163[] { class99.field1901, class136.method1061(var34, (byte) 127), class21.field342, class136.method1061(var35, (byte) 103) }));
                    } else {
                        class199.field3572[var33] = var36;
                        class152.field2847[var33] = -1;
                        class120.field2262[var33] = -1;
                    }
                    ++var33;
                }
            }
            class31.method188(false, var31, -1, var25, var28, var29, var30);
        }
        if (arg0 != 1) {
            method351((byte) 96, true);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lwb;IZ)V")
    public static final void method352(class225 arg0, int arg1, boolean arg2) {
        Object[] var3 = arg0.field4079;
        ++field827;
        int var4 = (Integer) var3[0];
        class114 var5 = class174.method1291(0, var4);
        if (var5 != null) {
            int var6 = 0;
            class265.field4597 = 0;
            int var7 = 0;
            int[] var8 = var5.field2142;
            int var9 = -1;
            int[] var10 = var5.field2144;
            byte var11 = -1;
            try {
                class13.field200 = new int[var5.field2135];
                class133.field2571 = new class163[var5.field2137];
                int var12 = 0;
                int var13 = 0;
                for (int var14 = 1; var14 < var3.length; ++var14) {
                    if (var3[var14] instanceof Integer) {
                        int var15 = (Integer) var3[var14];
                        if (var15 == -2147483647) {
                            var15 = arg0.field4075;
                        }
                        if (~var15 == 2147483645) {
                            var15 = arg0.field4084;
                        }
                        if (var15 == -2147483645) {
                            var15 = arg0.field4076 != null ? arg0.field4076.field1188 : -1;
                        }
                        if (~var15 == 2147483643) {
                            var15 = arg0.field4071;
                        }
                        if (~var15 == 2147483642) {
                            var15 = arg0.field4076 == null ? -1 : arg0.field4076.field1205;
                        }
                        if (~var15 == 2147483641) {
                            var15 = arg0.field4081 == null ? -1 : arg0.field4081.field1188;
                        }
                        if (var15 == -2147483641) {
                            var15 = arg0.field4081 != null ? arg0.field4081.field1205 : -1;
                        }
                        if (~var15 == 2147483639) {
                            var15 = arg0.field4083;
                        }
                        if (var15 == -2147483639) {
                            var15 = arg0.field4078;
                        }
                        class13.field200[var13++] = var15;
                    } else if (var3[var14] instanceof class163) {
                        class163 var16 = (class163) var3[var14];
                        if (var16.method1208(class103.field1982, (byte) -110)) {
                            var16 = arg0.field4082;
                        }
                        class133.field2571[var12++] = var16;
                    }
                }
                if (!arg2) {
                    int var17 = 0;
                    label3402: while (true) {
                        ++var17;
                        if (~arg1 > ~var17) {
                            throw new RuntimeException("slow");
                        }
                        ++var9;
                        int var451 = var8[var9];
                        if (~var451 > -101) {
                            if (var451 == 0) {
                                class51.field861[var6++] = var10[var9];
                                continue;
                            }
                            if (var451 == 1) {
                                int var18 = var10[var9];
                                class51.field861[var6++] = class119.field2252[var18];
                                continue;
                            }
                            if (var451 == 2) {
                                int var19 = var10[var9];
                                --var6;
                                class11.method70(class51.field861[var6], var19, 1);
                                continue;
                            }
                            if (var451 == 3) {
                                class89.field1645[var7++] = var5.field2138[var9];
                                continue;
                            }
                            if (~var451 == -7) {
                                var9 += var10[var9];
                                continue;
                            }
                            if (var451 == 7) {
                                var6 -= 2;
                                if (~class51.field861[var6 - -1] != ~class51.field861[var6]) {
                                    var9 += var10[var9];
                                }
                                continue;
                            }
                            if (var451 == 8) {
                                var6 -= 2;
                                if (~class51.field861[var6 + 1] == ~class51.field861[var6]) {
                                    var9 += var10[var9];
                                }
                                continue;
                            }
                            if (~var451 == -10) {
                                var6 -= 2;
                                if (class51.field861[var6 - -1] > class51.field861[var6]) {
                                    var9 += var10[var9];
                                }
                                continue;
                            }
                            if (~var451 == -11) {
                                var6 -= 2;
                                if (class51.field861[var6] > class51.field861[var6 + 1]) {
                                    var9 += var10[var9];
                                }
                                continue;
                            }
                            if (~var451 == -22) {
                                if (class265.field4597 == 0) {
                                    return;
                                }
                                class178 var20 = class235.field4202[--class265.field4597];
                                var9 = var20.field3236;
                                class13.field200 = var20.field3244;
                                var5 = var20.field3237;
                                class133.field2571 = var20.field3240;
                                var8 = var5.field2142;
                                var10 = var5.field2144;
                                continue;
                            }
                            if (var451 == 25) {
                                int var21 = var10[var9];
                                class51.field861[var6++] = class144.method1095(var21, (byte) 109);
                                continue;
                            }
                            if (var451 == 27) {
                                int var22 = var10[var9];
                                --var6;
                                class181.method1333(var22, class51.field861[var6], 0);
                                continue;
                            }
                            if (var451 == 31) {
                                var6 -= 2;
                                if (class51.field861[var6 - -1] >= class51.field861[var6]) {
                                    var9 += var10[var9];
                                }
                                continue;
                            }
                            if (var451 == 32) {
                                var6 -= 2;
                                if (class51.field861[var6] >= class51.field861[var6 + 1]) {
                                    var9 += var10[var9];
                                }
                                continue;
                            }
                            if (~var451 == -34) {
                                class51.field861[var6++] = class13.field200[var10[var9]];
                                continue;
                            }
                            int var10001;
                            if (~var451 == -35) {
                                var10001 = var10[var9];
                                --var6;
                                class13.field200[var10001] = class51.field861[var6];
                                continue;
                            }
                            if (var451 == 35) {
                                class89.field1645[var7++] = class133.field2571[var10[var9]];
                                continue;
                            }
                            if (var451 == 36) {
                                var10001 = var10[var9];
                                --var7;
                                class133.field2571[var10001] = class89.field1645[var7];
                                continue;
                            }
                            if (var451 == 37) {
                                int var23 = var10[var9];
                                var7 -= var23;
                                class163 var24 = class182.method1349(var7, class89.field1645, -97, var23);
                                class89.field1645[var7++] = var24;
                                continue;
                            }
                            if (~var451 == -39) {
                                --var6;
                                continue;
                            }
                            if (~var451 == -40) {
                                --var7;
                                continue;
                            }
                            if (~var451 == -41) {
                                int var25 = var10[var9];
                                class114 var26 = class174.method1291(0, var25);
                                class163[] var27 = new class163[var26.field2137];
                                int[] var28 = new int[var26.field2135];
                                for (int var29 = 0; ~var29 > ~var26.field2139; ++var29) {
                                    var28[var29] = class51.field861[-var26.field2139 + var6 - -var29];
                                }
                                for (int var30 = 0; ~var30 > ~var26.field2133; ++var30) {
                                    var27[var30] = class89.field1645[var7 - -var30 + -var26.field2133];
                                }
                                var7 -= var26.field2133;
                                var6 -= var26.field2139;
                                class178 var31 = new class178();
                                var31.field3237 = var5;
                                var31.field3244 = class13.field200;
                                var31.field3240 = class133.field2571;
                                var31.field3236 = var9;
                                if (class235.field4202.length <= class265.field4597) {
                                    throw new RuntimeException();
                                }
                                class235.field4202[class265.field4597++] = var31;
                                class13.field200 = var28;
                                class133.field2571 = var27;
                                var9 = -1;
                                var5 = var26;
                                var10 = var26.field2144;
                                var8 = var26.field2142;
                                continue;
                            }
                            if (~var451 == -43) {
                                class51.field861[var6++] = field834[var10[var9]];
                                continue;
                            }
                            if (~var451 == -44) {
                                int var32 = var10[var9];
                                --var6;
                                field834[var32] = class51.field861[var6];
                                class81.method610(var32, (byte) -51);
                                continue;
                            }
                            if (~var451 == -45) {
                                int var33 = var10[var9] >> 16;
                                --var6;
                                int var34 = class51.field861[var6];
                                int var35 = 65535 & var10[var9];
                                if (~var34 <= -1 && var34 <= 5000) {
                                    class32.field496[var33] = var34;
                                    byte var36 = -1;
                                    if (~var35 == -106) {
                                        var36 = 0;
                                    }
                                    int var37 = 0;
                                    while (true) {
                                        if (var34 <= var37) {
                                            continue label3402;
                                        }
                                        field824[var33][var37] = var36;
                                        ++var37;
                                    }
                                }
                                throw new RuntimeException();
                            }
                            if (~var451 == -46) {
                                int var38 = var10[var9];
                                --var6;
                                int var39 = class51.field861[var6];
                                if (var39 >= 0 && class32.field496[var38] > var39) {
                                    class51.field861[var6++] = field824[var38][var39];
                                    continue;
                                }
                                throw new RuntimeException();
                            }
                            if (~var451 == -47) {
                                int var40 = var10[var9];
                                var6 -= 2;
                                int var41 = class51.field861[var6];
                                if (var41 >= 0 && class32.field496[var40] > var41) {
                                    field824[var40][var41] = class51.field861[var6 - -1];
                                    continue;
                                }
                                throw new RuntimeException();
                            }
                            if (~var451 == -48) {
                                class163 var42 = field825[var10[var9]];
                                if (var42 == null) {
                                    var42 = class120.field2265;
                                }
                                class89.field1645[var7++] = var42;
                                continue;
                            }
                            if (~var451 == -49) {
                                int var43 = var10[var9];
                                --var7;
                                field825[var43] = class89.field1645[var7];
                                class248.method1704((byte) 127, var43);
                                continue;
                            }
                            if (~var451 == -52) {
                                class258 var44 = var5.field2136[var10[var9]];
                                --var6;
                                class129 var45 = (class129) var44.method1743((long) class51.field861[var6], arg2);
                                if (var45 != null) {
                                    var9 += var45.field2503;
                                }
                                continue;
                            }
                        }
                        boolean var46;
                        if (var10[var9] == 1) {
                            var46 = true;
                        } else {
                            var46 = false;
                        }
                        if (~var451 <= -301) {
                            if (~var451 > -501) {
                                if (var451 == 403) {
                                    var6 -= 2;
                                    int var424 = class51.field861[var6];
                                    if (var424 >= 7) {
                                        var424 -= 7;
                                    }
                                    int var425 = class51.field861[var6 + 1];
                                    class235.field4203.field2444.method1336(Integer.MIN_VALUE, var425, var424);
                                    continue;
                                }
                                if (var451 == 404) {
                                    var6 -= 2;
                                    int var426 = class51.field861[var6 + 1];
                                    int var427 = class51.field861[var6];
                                    class235.field4203.field2444.method1345(var427, 11, var426);
                                    continue;
                                }
                                if (var451 == 410) {
                                    --var6;
                                    boolean var428 = ~class51.field861[var6] != -1;
                                    class235.field4203.field2444.method1342(2172, var428);
                                    continue;
                                }
                            } else if (var451 >= 1000 && ~var451 > -1101 || var451 >= 2000 && ~var451 > -2101) {
                                class69 var47;
                                if (~var451 > -2001) {
                                    var47 = !var46 ? class180.field3261 : class160.field2944;
                                } else {
                                    --var6;
                                    var47 = class124.method989((byte) 108, class51.field861[var6]);
                                    var451 -= 1000;
                                }
                                if (~var451 == -1001) {
                                    var6 -= 4;
                                    var47.field1298 = class51.field861[var6];
                                    var47.field1167 = class51.field861[var6 + 1];
                                    int var48 = class51.field861[var6 + 2];
                                    int var49 = class51.field861[var6 + 3];
                                    if (var49 < 0) {
                                        var49 = 0;
                                    } else if (var49 > 5) {
                                        var49 = 5;
                                    }
                                    if (~var48 <= -1) {
                                        if (var48 > 5) {
                                            var48 = 5;
                                        }
                                    } else {
                                        var48 = 0;
                                    }
                                    var47.field1231 = (byte) var49;
                                    var47.field1214 = (byte) var48;
                                    class213.method1517((byte) 11, var47);
                                    class264.method1781(99, var47);
                                    continue;
                                }
                                if (~var451 == -1002) {
                                    var6 -= 4;
                                    var47.field1320 = class51.field861[var6];
                                    var47.field1259 = class51.field861[var6 + 1];
                                    var47.field1309 = 0;
                                    var47.field1189 = 0;
                                    int var50 = class51.field861[var6 + 2];
                                    if (~var50 <= -1) {
                                        if (var50 > 4) {
                                            var50 = 4;
                                        }
                                    } else {
                                        var50 = 0;
                                    }
                                    int var51 = class51.field861[var6 + 3];
                                    if (var51 >= 0) {
                                        if (var51 > 4) {
                                            var51 = 4;
                                        }
                                    } else {
                                        var51 = 0;
                                    }
                                    var47.field1204 = (byte) var50;
                                    var47.field1225 = (byte) var51;
                                    class213.method1517((byte) 11, var47);
                                    if (~var47.field1294 == -1) {
                                        class171.method1278((byte) -13, var47, false);
                                    }
                                    class264.method1781(99, var47);
                                    continue;
                                }
                                if (~var451 == -1004) {
                                    --var6;
                                    boolean var52 = class51.field861[var6] == 1;
                                    if (!var47.field1312 == var52) {
                                        var47.field1312 = var52;
                                        class213.method1517((byte) 11, var47);
                                    }
                                    continue;
                                }
                                if (var451 == 1004) {
                                    var6 -= 2;
                                    var47.field1178 = class51.field861[var6];
                                    var47.field1314 = class51.field861[var6 - -1];
                                    class213.method1517((byte) 11, var47);
                                    if (var47.field1294 == 0) {
                                        class171.method1278((byte) -72, var47, false);
                                    }
                                    class264.method1781(99, var47);
                                    continue;
                                }
                            } else if (~var451 <= -1101 && var451 < 1200 || var451 >= 2100 && var451 < 2200) {
                                class69 var53;
                                if (var451 >= 2000) {
                                    var451 -= 1000;
                                    --var6;
                                    var53 = class124.method989((byte) 117, class51.field861[var6]);
                                } else {
                                    var53 = !var46 ? class180.field3261 : class160.field2944;
                                }
                                if (~var451 == -1101) {
                                    var6 -= 2;
                                    var53.field1287 = class51.field861[var6];
                                    if (var53.field1287 > -var53.field1183 + var53.field1236) {
                                        var53.field1287 = -var53.field1183 + var53.field1236;
                                    }
                                    if (var53.field1287 < 0) {
                                        var53.field1287 = 0;
                                    }
                                    var53.field1196 = class51.field861[var6 + 1];
                                    if (var53.field1196 > -var53.field1220 + var53.field1160) {
                                        var53.field1196 = -var53.field1220 + var53.field1160;
                                    }
                                    if (var53.field1196 < 0) {
                                        var53.field1196 = 0;
                                    }
                                    class213.method1517((byte) 11, var53);
                                    continue;
                                }
                                if (~var451 == -1102) {
                                    --var6;
                                    var53.field1170 = class51.field861[var6];
                                    class213.method1517((byte) 11, var53);
                                    continue;
                                }
                                if (~var451 == -1103) {
                                    --var6;
                                    var53.field1311 = ~class51.field861[var6] == -2;
                                    class213.method1517((byte) 11, var53);
                                    continue;
                                }
                                if (~var451 == -1104) {
                                    --var6;
                                    var53.field1199 = class51.field861[var6];
                                    class213.method1517((byte) 11, var53);
                                    continue;
                                }
                                if (~var451 == -1105) {
                                    --var6;
                                    var53.field1328 = class51.field861[var6];
                                    class213.method1517((byte) 11, var53);
                                    continue;
                                }
                                if (~var451 == -1106) {
                                    --var6;
                                    var53.field1329 = class51.field861[var6];
                                    class213.method1517((byte) 11, var53);
                                    continue;
                                }
                                if (var451 == 1106) {
                                    --var6;
                                    var53.field1283 = class51.field861[var6];
                                    class213.method1517((byte) 11, var53);
                                    continue;
                                }
                                if (~var451 == -1108) {
                                    --var6;
                                    var53.field1279 = class51.field861[var6] == 1;
                                    class213.method1517((byte) 11, var53);
                                    continue;
                                }
                                if (var451 == 1108) {
                                    var53.field1208 = 1;
                                    --var6;
                                    var53.field1245 = class51.field861[var6];
                                    class213.method1517((byte) 11, var53);
                                    continue;
                                }
                                if (~var451 == -1110) {
                                    var6 -= 6;
                                    var53.field1202 = class51.field861[var6];
                                    var53.field1310 = class51.field861[var6 + 1];
                                    var53.field1193 = class51.field861[var6 + 2];
                                    var53.field1227 = class51.field861[var6 + 3];
                                    var53.field1327 = class51.field861[var6 + 4];
                                    var53.field1234 = class51.field861[var6 + 5];
                                    class213.method1517((byte) 11, var53);
                                    continue;
                                }
                                if (var451 == 1110) {
                                    --var6;
                                    int var54 = class51.field861[var6];
                                    if (var53.field1192 != var54) {
                                        var53.field1252 = 0;
                                        var53.field1288 = 0;
                                        var53.field1192 = var54;
                                        class213.method1517((byte) 11, var53);
                                    }
                                    continue;
                                }
                                if (var451 == 1111) {
                                    --var6;
                                    var53.field1263 = ~class51.field861[var6] == -2;
                                    class213.method1517((byte) 11, var53);
                                    continue;
                                }
                                if (var451 == 1112) {
                                    --var7;
                                    class163 var55 = class89.field1645[var7];
                                    if (!var55.method1208(var53.field1171, (byte) 26)) {
                                        var53.field1171 = var55;
                                        class213.method1517((byte) 11, var53);
                                    }
                                    continue;
                                }
                                if (~var451 == -1114) {
                                    --var6;
                                    var53.field1258 = class51.field861[var6];
                                    class213.method1517((byte) 11, var53);
                                    continue;
                                }
                                if (var451 == 1114) {
                                    var6 -= 3;
                                    var53.field1211 = class51.field861[var6];
                                    var53.field1216 = class51.field861[var6 + 1];
                                    var53.field1229 = class51.field861[var6 - -2];
                                    class213.method1517((byte) 11, var53);
                                    continue;
                                }
                                if (var451 == 1115) {
                                    --var6;
                                    var53.field1249 = class51.field861[var6] == 1;
                                    class213.method1517((byte) 11, var53);
                                    continue;
                                }
                                if (var451 == 1116) {
                                    --var6;
                                    var53.field1280 = class51.field861[var6];
                                    class213.method1517((byte) 11, var53);
                                    continue;
                                }
                                if (var451 == 1117) {
                                    --var6;
                                    var53.field1301 = class51.field861[var6];
                                    class213.method1517((byte) 11, var53);
                                    continue;
                                }
                                if (var451 == 1118) {
                                    --var6;
                                    var53.field1317 = ~class51.field861[var6] == -2;
                                    class213.method1517((byte) 11, var53);
                                    continue;
                                }
                                if (var451 == 1119) {
                                    --var6;
                                    var53.field1318 = class51.field861[var6] == 1;
                                    class213.method1517((byte) 11, var53);
                                    continue;
                                }
                                if (var451 == 1120) {
                                    var6 -= 2;
                                    var53.field1236 = class51.field861[var6];
                                    var53.field1160 = class51.field861[var6 + 1];
                                    class213.method1517((byte) 11, var53);
                                    if (~var53.field1294 == -1) {
                                        class171.method1278((byte) 96, var53, false);
                                    }
                                    continue;
                                }
                                if (var451 == 1121) {
                                    class213.method1517((byte) 11, var53);
                                    var6 -= 2;
                                    continue;
                                }
                                if (~var451 == -1123) {
                                    --var6;
                                    var53.field1295 = class51.field861[var6] == 1;
                                    class213.method1517((byte) 11, var53);
                                    continue;
                                }
                            } else if ((~var451 > -1201 || var451 >= 1300) && (var451 < 2200 || var451 >= 2300)) {
                                if ((var451 < 1300 || ~var451 <= -1401) && (~var451 > -2301 || var451 >= 2400)) {
                                    if (~var451 <= -1401 && ~var451 > -1501 || ~var451 <= -2401 && ~var451 > -2501) {
                                        class69 var60;
                                        if (var451 < 2000) {
                                            var60 = !var46 ? class180.field3261 : class160.field2944;
                                        } else {
                                            var451 -= 1000;
                                            --var6;
                                            var60 = class124.method989((byte) 109, class51.field861[var6]);
                                        }
                                        int[] var61 = null;
                                        --var7;
                                        class163 var62 = class89.field1645[var7];
                                        if (~var62.method1221(-23096) < -1 && var62.method1213(0, -1 + var62.method1221(-23096)) == 89) {
                                            --var6;
                                            int var63 = class51.field861[var6];
                                            if (~var63 < -1) {
                                                var61 = new int[var63];
                                                while (~(var63--) < -1) {
                                                    --var6;
                                                    var61[var63] = class51.field861[var6];
                                                }
                                            }
                                            var62 = var62.method1188(true, -1 + var62.method1221(-23096), 0);
                                        }
                                        Object[] var64 = new Object[1 + var62.method1221(-23096)];
                                        for (int var65 = var64.length + -1; var65 >= 1; --var65) {
                                            if (~var62.method1213(0, var65 - 1) != -116) {
                                                --var6;
                                                var64[var65] = new Integer(class51.field861[var6]);
                                            } else {
                                                --var7;
                                                var64[var65] = class89.field1645[var7];
                                            }
                                        }
                                        --var6;
                                        int var66 = class51.field861[var6];
                                        if (var66 != -1) {
                                            var64[0] = new Integer(var66);
                                        } else {
                                            var64 = null;
                                        }
                                        var60.field1233 = true;
                                        if (var451 != 1400) {
                                            if (var451 == 1401) {
                                                var60.field1181 = var64;
                                            } else if (var451 != 1402) {
                                                if (var451 != 1403) {
                                                    if (var451 == 1404) {
                                                        var60.field1323 = var64;
                                                    } else if (~var451 == -1406) {
                                                        var60.field1175 = var64;
                                                    } else if (~var451 == -1407) {
                                                        var60.field1209 = var64;
                                                    } else if (~var451 != -1408) {
                                                        if (~var451 == -1409) {
                                                            var60.field1297 = var64;
                                                        } else if (var451 == 1409) {
                                                            var60.field1212 = var64;
                                                        } else if (~var451 != -1411) {
                                                            if (~var451 == -1412) {
                                                                var60.field1235 = var64;
                                                            } else if (var451 == 1412) {
                                                                var60.field1256 = var64;
                                                            } else if (var451 == 1414) {
                                                                var60.field1269 = var64;
                                                                var60.field1187 = var61;
                                                            } else if (var451 != 1415) {
                                                                if (~var451 != -1417) {
                                                                    if (var451 != 1417) {
                                                                        if (~var451 != -1419) {
                                                                            if (var451 == 1419) {
                                                                                var60.field1277 = var64;
                                                                            } else if (var451 == 1420) {
                                                                                var60.field1308 = var64;
                                                                            } else if (~var451 == -1422) {
                                                                                var60.field1268 = var64;
                                                                            } else if (~var451 == -1423) {
                                                                                var60.field1238 = var64;
                                                                            } else if (~var451 == -1424) {
                                                                                var60.field1201 = var64;
                                                                            } else if (~var451 != -1425) {
                                                                                if (var451 != 1425) {
                                                                                    if (var451 == 1426) {
                                                                                        var60.field1224 = var64;
                                                                                    } else if (~var451 == -1428) {
                                                                                        var60.field1244 = var64;
                                                                                    } else if (var451 == 1428) {
                                                                                        var60.field1213 = var61;
                                                                                        var60.field1174 = var64;
                                                                                    } else if (~var451 == -1430) {
                                                                                        var60.field1221 = var61;
                                                                                        var60.field1237 = var64;
                                                                                    }
                                                                                } else {
                                                                                    var60.field1286 = var64;
                                                                                }
                                                                            } else {
                                                                                var60.field1285 = var64;
                                                                            }
                                                                        } else {
                                                                            var60.field1254 = var64;
                                                                        }
                                                                    } else {
                                                                        var60.field1168 = var64;
                                                                    }
                                                                } else {
                                                                    var60.field1210 = var64;
                                                                }
                                                            } else {
                                                                var60.field1315 = var61;
                                                                var60.field1267 = var64;
                                                            }
                                                        } else {
                                                            var60.field1232 = var64;
                                                        }
                                                    } else {
                                                        var60.field1257 = var64;
                                                        var60.field1161 = var61;
                                                    }
                                                } else {
                                                    var60.field1194 = var64;
                                                }
                                            } else {
                                                var60.field1163 = var64;
                                            }
                                        } else {
                                            var60.field1195 = var64;
                                        }
                                        continue;
                                    }
                                    if (var451 < 1600) {
                                        class69 var67 = !var46 ? class180.field3261 : class160.field2944;
                                        if (var451 == 1500) {
                                            class51.field861[var6++] = var67.field1243;
                                            continue;
                                        }
                                        if (var451 == 1501) {
                                            class51.field861[var6++] = var67.field1218;
                                            continue;
                                        }
                                        if (var451 == 1502) {
                                            class51.field861[var6++] = var67.field1183;
                                            continue;
                                        }
                                        if (~var451 == -1504) {
                                            class51.field861[var6++] = var67.field1220;
                                            continue;
                                        }
                                        if (~var451 == -1505) {
                                            class51.field861[var6++] = var67.field1312 ? 1 : 0;
                                            continue;
                                        }
                                        if (var451 == 1505) {
                                            class51.field861[var6++] = var67.field1302;
                                            continue;
                                        }
                                    } else if (var451 < 1700) {
                                        class69 var68 = !var46 ? class180.field3261 : class160.field2944;
                                        if (var451 == 1600) {
                                            class51.field861[var6++] = var68.field1287;
                                            continue;
                                        }
                                        if (~var451 == -1602) {
                                            class51.field861[var6++] = var68.field1196;
                                            continue;
                                        }
                                        if (~var451 == -1603) {
                                            class89.field1645[var7++] = var68.field1171;
                                            continue;
                                        }
                                        if (~var451 == -1604) {
                                            class51.field861[var6++] = var68.field1236;
                                            continue;
                                        }
                                        if (var451 == 1604) {
                                            class51.field861[var6++] = var68.field1160;
                                            continue;
                                        }
                                        if (~var451 == -1606) {
                                            class51.field861[var6++] = var68.field1234;
                                            continue;
                                        }
                                        if (var451 == 1606) {
                                            class51.field861[var6++] = var68.field1193;
                                            continue;
                                        }
                                        if (var451 == 1607) {
                                            class51.field861[var6++] = var68.field1327;
                                            continue;
                                        }
                                        if (~var451 == -1609) {
                                            class51.field861[var6++] = var68.field1227;
                                            continue;
                                        }
                                        if (var451 == 1609) {
                                            class51.field861[var6++] = var68.field1199;
                                            continue;
                                        }
                                    } else if (var451 >= 1800) {
                                        if (var451 >= 1900) {
                                            if (~var451 > -2601) {
                                                --var6;
                                                class69 var69 = class124.method989((byte) 108, class51.field861[var6]);
                                                if (~var451 == -2501) {
                                                    class51.field861[var6++] = var69.field1243;
                                                    continue;
                                                }
                                                if (~var451 == -2502) {
                                                    class51.field861[var6++] = var69.field1218;
                                                    continue;
                                                }
                                                if (var451 == 2502) {
                                                    class51.field861[var6++] = var69.field1183;
                                                    continue;
                                                }
                                                if (~var451 == -2504) {
                                                    class51.field861[var6++] = var69.field1220;
                                                    continue;
                                                }
                                                if (~var451 == -2505) {
                                                    class51.field861[var6++] = !var69.field1312 ? 0 : 1;
                                                    continue;
                                                }
                                                if (~var451 == -2506) {
                                                    class51.field861[var6++] = var69.field1302;
                                                    continue;
                                                }
                                            } else if (var451 < 2700) {
                                                --var6;
                                                class69 var70 = class124.method989((byte) 116, class51.field861[var6]);
                                                if (~var451 == -2601) {
                                                    class51.field861[var6++] = var70.field1287;
                                                    continue;
                                                }
                                                if (var451 == 2601) {
                                                    class51.field861[var6++] = var70.field1196;
                                                    continue;
                                                }
                                                if (~var451 == -2603) {
                                                    class89.field1645[var7++] = var70.field1171;
                                                    continue;
                                                }
                                                if (~var451 == -2604) {
                                                    class51.field861[var6++] = var70.field1236;
                                                    continue;
                                                }
                                                if (~var451 == -2605) {
                                                    class51.field861[var6++] = var70.field1160;
                                                    continue;
                                                }
                                                if (var451 == 2605) {
                                                    class51.field861[var6++] = var70.field1234;
                                                    continue;
                                                }
                                                if (~var451 == -2607) {
                                                    class51.field861[var6++] = var70.field1193;
                                                    continue;
                                                }
                                                if (~var451 == -2608) {
                                                    class51.field861[var6++] = var70.field1327;
                                                    continue;
                                                }
                                                if (~var451 == -2609) {
                                                    class51.field861[var6++] = var70.field1227;
                                                    continue;
                                                }
                                                if (~var451 == -2610) {
                                                    class51.field861[var6++] = var70.field1199;
                                                    continue;
                                                }
                                            } else if (var451 < 2800) {
                                                if (~var451 == -2701) {
                                                    --var6;
                                                    class69 var71 = class124.method989((byte) 126, class51.field861[var6]);
                                                    class51.field861[var6++] = var71.field1177;
                                                    continue;
                                                }
                                                if (var451 == 2701) {
                                                    --var6;
                                                    class69 var72 = class124.method989((byte) 119, class51.field861[var6]);
                                                    if (~var72.field1177 == 0) {
                                                        class51.field861[var6++] = 0;
                                                    } else {
                                                        class51.field861[var6++] = var72.field1226;
                                                    }
                                                    continue;
                                                }
                                                if (var451 == 2702) {
                                                    --var6;
                                                    int var73 = class51.field861[var6];
                                                    class222 var74 = (class222) class92.field1739.method1743((long) var73, arg2);
                                                    if (var74 == null) {
                                                        class51.field861[var6++] = 0;
                                                    } else {
                                                        class51.field861[var6++] = 1;
                                                    }
                                                    continue;
                                                }
                                                if (~var451 == -2704) {
                                                    --var6;
                                                    class69 var75 = class124.method989((byte) 124, class51.field861[var6]);
                                                    if (var75.field1291 == null) {
                                                        class51.field861[var6++] = 0;
                                                        continue;
                                                    }
                                                    int var76 = var75.field1291.length;
                                                    for (int var77 = 0; var75.field1291.length > var77; ++var77) {
                                                        if (var75.field1291[var77] == null) {
                                                            var76 = var77;
                                                            break;
                                                        }
                                                    }
                                                    class51.field861[var6++] = var76;
                                                    continue;
                                                }
                                                if (var451 == 2704 || var451 == 2705) {
                                                    var6 -= 2;
                                                    int var78 = class51.field861[var6 + 1];
                                                    int var79 = class51.field861[var6];
                                                    class222 var80 = (class222) class92.field1739.method1743((long) var79, arg2);
                                                    if (var80 != null && var80.field4049 == var78) {
                                                        class51.field861[var6++] = 1;
                                                        continue;
                                                    }
                                                    class51.field861[var6++] = 0;
                                                    continue;
                                                }
                                            } else if (~var451 <= -2901) {
                                                if (~var451 <= -3201) {
                                                    if (var451 < 3300) {
                                                        if (var451 == 3200) {
                                                            var6 -= 3;
                                                            class199.method1426(class51.field861[var6 + 1], class51.field861[var6], 69, class51.field861[var6 + 2]);
                                                            continue;
                                                        }
                                                        if (~var451 == -3202) {
                                                            --var6;
                                                            class199.method1429(class51.field861[var6], (byte) -120);
                                                            continue;
                                                        }
                                                        if (~var451 == -3203) {
                                                            var6 -= 2;
                                                            class216.method1534(class51.field861[var6], class51.field861[var6 - -1], 0);
                                                            continue;
                                                        }
                                                    } else if (~var451 > -3401) {
                                                        if (~var451 == -3301) {
                                                            class51.field861[var6++] = class227.field4092;
                                                            continue;
                                                        }
                                                        if (var451 == 3301) {
                                                            var6 -= 2;
                                                            int var81 = class51.field861[var6];
                                                            int var82 = class51.field861[var6 + 1];
                                                            class51.field861[var6++] = class33.method198(12421, var81, var82);
                                                            continue;
                                                        }
                                                        if (var451 == 3302) {
                                                            var6 -= 2;
                                                            int var83 = class51.field861[var6 + 1];
                                                            int var84 = class51.field861[var6];
                                                            class51.field861[var6++] = class5.method40(true, var84, var83);
                                                            continue;
                                                        }
                                                        if (var451 == 3303) {
                                                            var6 -= 2;
                                                            int var85 = class51.field861[var6];
                                                            int var86 = class51.field861[var6 + 1];
                                                            class51.field861[var6++] = class75.method549(var86, var85, (byte) -99);
                                                            continue;
                                                        }
                                                        if (var451 == 3304) {
                                                            --var6;
                                                            int var87 = class51.field861[var6];
                                                            class51.field861[var6++] = class164.method1234(var87, (byte) 90).field222;
                                                            continue;
                                                        }
                                                        if (~var451 == -3306) {
                                                            --var6;
                                                            int var88 = class51.field861[var6];
                                                            class51.field861[var6++] = class190.field3480[var88];
                                                            continue;
                                                        }
                                                        if (var451 == 3306) {
                                                            --var6;
                                                            int var89 = class51.field861[var6];
                                                            class51.field861[var6++] = class13.field210[var89];
                                                            continue;
                                                        }
                                                        if (var451 == 3307) {
                                                            --var6;
                                                            int var90 = class51.field861[var6];
                                                            class51.field861[var6++] = class50.field841[var90];
                                                            continue;
                                                        }
                                                        if (var451 == 3308) {
                                                            int var91 = class20.field323;
                                                            int var92 = (class235.field4203.field3633 >> 7) - -class62.field1035;
                                                            int var93 = (class235.field4203.field3615 >> 7) + class257.field4500;
                                                            class51.field861[var6++] = (var92 << 14) + ((var91 << 28) - -var93);
                                                            continue;
                                                        }
                                                        if (~var451 == -3310) {
                                                            --var6;
                                                            int var94 = class51.field861[var6];
                                                            class51.field861[var6++] = class7.method50(var94 >> 14, 16383);
                                                            continue;
                                                        }
                                                        if (~var451 == -3311) {
                                                            --var6;
                                                            int var95 = class51.field861[var6];
                                                            class51.field861[var6++] = var95 >> 28;
                                                            continue;
                                                        }
                                                        if (var451 == 3311) {
                                                            --var6;
                                                            int var96 = class51.field861[var6];
                                                            class51.field861[var6++] = class7.method50(var96, 16383);
                                                            continue;
                                                        }
                                                        if (var451 == 3312) {
                                                            class51.field861[var6++] = !class161.field2956 ? 0 : 1;
                                                            continue;
                                                        }
                                                        if (var451 == 3313) {
                                                            var6 -= 2;
                                                            int var97 = class51.field861[var6] + 32768;
                                                            int var98 = class51.field861[var6 + 1];
                                                            class51.field861[var6++] = class33.method198(12421, var97, var98);
                                                            continue;
                                                        }
                                                        if (var451 == 3314) {
                                                            var6 -= 2;
                                                            int var99 = class51.field861[var6 + 1];
                                                            int var100 = class51.field861[var6] - -32768;
                                                            class51.field861[var6++] = class5.method40(true, var100, var99);
                                                            continue;
                                                        }
                                                        if (var451 == 3315) {
                                                            var6 -= 2;
                                                            int var101 = class51.field861[var6] + 32768;
                                                            int var102 = class51.field861[var6 + 1];
                                                            class51.field861[var6++] = class75.method549(var102, var101, (byte) -98);
                                                            continue;
                                                        }
                                                        if (~var451 == -3317) {
                                                            if (class99.field1920 >= 2) {
                                                                class51.field861[var6++] = class99.field1920;
                                                            } else {
                                                                class51.field861[var6++] = 0;
                                                            }
                                                            continue;
                                                        }
                                                        if (var451 == 3317) {
                                                            class51.field861[var6++] = class71.field1349;
                                                            continue;
                                                        }
                                                        if (var451 == 3318) {
                                                            class51.field861[var6++] = class142.field2696;
                                                            continue;
                                                        }
                                                        if (~var451 == -3322) {
                                                            class51.field861[var6++] = class102.field1962;
                                                            continue;
                                                        }
                                                        if (~var451 == -3323) {
                                                            class51.field861[var6++] = class262.field4587;
                                                            continue;
                                                        }
                                                        if (var451 == 3323) {
                                                            if (~class43.field736 <= -6 && class43.field736 <= 9) {
                                                                class51.field861[var6++] = 1;
                                                                continue;
                                                            }
                                                            class51.field861[var6++] = 0;
                                                            continue;
                                                        }
                                                        if (var451 == 3324) {
                                                            if (~class43.field736 <= -6 && ~class43.field736 >= -10) {
                                                                class51.field861[var6++] = class43.field736;
                                                                continue;
                                                            }
                                                            class51.field861[var6++] = 0;
                                                            continue;
                                                        }
                                                        if (~var451 == -3326) {
                                                            if (~class90.field1654 >= -1) {
                                                                class51.field861[var6++] = 0;
                                                            } else {
                                                                class51.field861[var6++] = 1;
                                                            }
                                                            continue;
                                                        }
                                                        if (~var451 == -3327) {
                                                            class51.field861[var6++] = class235.field4203.field2437;
                                                            continue;
                                                        }
                                                        if (~var451 == -3328) {
                                                            class51.field861[var6++] = class235.field4203.field2444.field3337 ? 1 : 0;
                                                            continue;
                                                        }
                                                        if (var451 == 3328) {
                                                            class51.field861[var6++] = class97.field1837;
                                                            continue;
                                                        }
                                                        if (~var451 == -3330) {
                                                            class51.field861[var6++] = class209.field3789;
                                                            continue;
                                                        }
                                                        if (var451 == 3330) {
                                                            --var6;
                                                            int var103 = class51.field861[var6];
                                                            class51.field861[var6++] = class229.method1596(-16145, var103);
                                                            continue;
                                                        }
                                                        if (var451 == 3331) {
                                                            var6 -= 2;
                                                            int var104 = class51.field861[var6 - -1];
                                                            int var105 = class51.field861[var6];
                                                            class51.field861[var6++] = class93.method744(false, var104, var105, false);
                                                            continue;
                                                        }
                                                        if (~var451 == -3333) {
                                                            var6 -= 2;
                                                            int var106 = class51.field861[var6];
                                                            int var107 = class51.field861[var6 + 1];
                                                            class51.field861[var6++] = class93.method744(false, var107, var106, true);
                                                            continue;
                                                        }
                                                        if (~var451 == -3334) {
                                                            class51.field861[var6++] = class140.field2683;
                                                            continue;
                                                        }
                                                    } else if (~var451 <= -3501) {
                                                        if (~var451 > -3701) {
                                                            if (~var451 == -3601) {
                                                                if (~class259.field4536 == -1) {
                                                                    class51.field861[var6++] = -2;
                                                                } else if (class259.field4536 == 1) {
                                                                    class51.field861[var6++] = -1;
                                                                } else {
                                                                    class51.field861[var6++] = class155.field2889;
                                                                }
                                                                continue;
                                                            }
                                                            if (~var451 == -3602) {
                                                                --var6;
                                                                int var108 = class51.field861[var6];
                                                                if (~class259.field4536 == -3 && var108 < class155.field2889) {
                                                                    class89.field1645[var7++] = class46.field769[var108];
                                                                    continue;
                                                                }
                                                                class89.field1645[var7++] = class139.field2665;
                                                                continue;
                                                            }
                                                            if (var451 == 3602) {
                                                                --var6;
                                                                int var109 = class51.field861[var6];
                                                                if (class259.field4536 == 2 && ~var109 > ~class155.field2889) {
                                                                    class51.field861[var6++] = class196.field3543[var109];
                                                                    continue;
                                                                }
                                                                class51.field861[var6++] = 0;
                                                                continue;
                                                            }
                                                            if (~var451 == -3604) {
                                                                --var6;
                                                                int var110 = class51.field861[var6];
                                                                if (class259.field4536 == 2 && class155.field2889 > var110) {
                                                                    class51.field861[var6++] = class146.field2780[var110];
                                                                    continue;
                                                                }
                                                                class51.field861[var6++] = 0;
                                                                continue;
                                                            }
                                                            if (var451 == 3604) {
                                                                --var6;
                                                                int var111 = class51.field861[var6];
                                                                --var7;
                                                                class163 var112 = class89.field1645[var7];
                                                                class7.method56((byte) 126, var111, var112);
                                                                continue;
                                                            }
                                                            if (~var451 == -3606) {
                                                                --var7;
                                                                class163 var113 = class89.field1645[var7];
                                                                class58.method402(true, var113.method1193((byte) 74));
                                                                continue;
                                                            }
                                                            if (var451 == 3606) {
                                                                --var7;
                                                                class163 var114 = class89.field1645[var7];
                                                                class2.method25(var114.method1193((byte) 70), -29159);
                                                                continue;
                                                            }
                                                            if (~var451 == -3608) {
                                                                --var7;
                                                                class163 var115 = class89.field1645[var7];
                                                                class247.method1698(22248, var115.method1193((byte) 126));
                                                                continue;
                                                            }
                                                            if (var451 == 3608) {
                                                                --var7;
                                                                class163 var116 = class89.field1645[var7];
                                                                class218.method1548(var116.method1193((byte) 64), -1607);
                                                                continue;
                                                            }
                                                            if (~var451 == -3610) {
                                                                --var7;
                                                                class163 var117 = class89.field1645[var7];
                                                                if (var117.method1212(class64.field1094, 0) || var117.method1212(class52.field873, 0)) {
                                                                    var117 = var117.method1216(7, (byte) -128);
                                                                }
                                                                class51.field861[var6++] = !class211.method1510(var117, 23269) ? 0 : 1;
                                                                continue;
                                                            }
                                                            if (~var451 == -3611) {
                                                                --var6;
                                                                int var118 = class51.field861[var6];
                                                                if (~class259.field4536 == -3 && ~var118 > ~class155.field2889) {
                                                                    class89.field1645[var7++] = class127.field2479[var118];
                                                                    continue;
                                                                }
                                                                class89.field1645[var7++] = class139.field2665;
                                                                continue;
                                                            }
                                                            if (~var451 == -3612) {
                                                                if (class38.field634 == null) {
                                                                    class89.field1645[var7++] = class139.field2665;
                                                                } else {
                                                                    class89.field1645[var7++] = class38.field634.method1190((byte) 73);
                                                                }
                                                                continue;
                                                            }
                                                            if (~var451 == -3613) {
                                                                if (class38.field634 == null) {
                                                                    class51.field861[var6++] = 0;
                                                                } else {
                                                                    class51.field861[var6++] = class16.field235;
                                                                }
                                                                continue;
                                                            }
                                                            if (var451 == 3613) {
                                                                --var6;
                                                                int var119 = class51.field861[var6];
                                                                if (class38.field634 != null && var119 < class16.field235) {
                                                                    class89.field1645[var7++] = class20.field328[var119].field425.method1190((byte) 73);
                                                                    continue;
                                                                }
                                                                class89.field1645[var7++] = class139.field2665;
                                                                continue;
                                                            }
                                                            if (~var451 == -3615) {
                                                                --var6;
                                                                int var120 = class51.field861[var6];
                                                                if (class38.field634 != null && var120 < class16.field235) {
                                                                    class51.field861[var6++] = class20.field328[var120].field417;
                                                                    continue;
                                                                }
                                                                class51.field861[var6++] = 0;
                                                                continue;
                                                            }
                                                            if (~var451 == -3616) {
                                                                --var6;
                                                                int var121 = class51.field861[var6];
                                                                if (class38.field634 != null && class16.field235 > var121) {
                                                                    class51.field861[var6++] = class20.field328[var121].field416;
                                                                    continue;
                                                                }
                                                                class51.field861[var6++] = 0;
                                                                continue;
                                                            }
                                                            if (~var451 == -3617) {
                                                                class51.field861[var6++] = class196.field3537;
                                                                continue;
                                                            }
                                                            if (var451 == 3617) {
                                                                --var7;
                                                                class163 var122 = class89.field1645[var7];
                                                                class67.method466(227, var122);
                                                                continue;
                                                            }
                                                            if (~var451 == -3619) {
                                                                class51.field861[var6++] = class2.field35;
                                                                continue;
                                                            }
                                                            if (~var451 == -3620) {
                                                                --var7;
                                                                class163 var123 = class89.field1645[var7];
                                                                class74.method541(var123.method1193((byte) 60), 5778);
                                                                continue;
                                                            }
                                                            if (~var451 == -3621) {
                                                                class37.method267((byte) 12);
                                                                continue;
                                                            }
                                                            if (var451 == 3621) {
                                                                if (~class259.field4536 != -1) {
                                                                    class51.field861[var6++] = class29.field465;
                                                                } else {
                                                                    class51.field861[var6++] = -1;
                                                                }
                                                                continue;
                                                            }
                                                            if (var451 == 3622) {
                                                                --var6;
                                                                int var124 = class51.field861[var6];
                                                                if (~class259.field4536 != -1 && var124 < class29.field465) {
                                                                    class89.field1645[var7++] = class12.method76(class116.field2207[var124], (byte) 25).method1190((byte) 73);
                                                                    continue;
                                                                }
                                                                class89.field1645[var7++] = class139.field2665;
                                                                continue;
                                                            }
                                                            if (~var451 == -3624) {
                                                                --var7;
                                                                class163 var125 = class89.field1645[var7];
                                                                if (var125.method1212(class64.field1094, 0) || var125.method1212(class52.field873, 0)) {
                                                                    var125 = var125.method1216(7, (byte) -128);
                                                                }
                                                                class51.field861[var6++] = !class248.method1706(var125, 25) ? 0 : 1;
                                                                continue;
                                                            }
                                                            if (~var451 == -3625) {
                                                                --var6;
                                                                int var126 = class51.field861[var6];
                                                                if (class20.field328 != null && ~class16.field235 < ~var126 && class20.field328[var126].field425.method1228(class235.field4203.field2424, 107)) {
                                                                    class51.field861[var6++] = 1;
                                                                    continue;
                                                                }
                                                                class51.field861[var6++] = 0;
                                                                continue;
                                                            }
                                                            if (~var451 == -3626) {
                                                                if (class71.field1334 != null) {
                                                                    class89.field1645[var7++] = class71.field1334.method1190((byte) 73);
                                                                } else {
                                                                    class89.field1645[var7++] = class139.field2665;
                                                                }
                                                                continue;
                                                            }
                                                            if (var451 == 3626) {
                                                                --var6;
                                                                int var127 = class51.field861[var6];
                                                                if (class38.field634 != null && class16.field235 > var127) {
                                                                    class89.field1645[var7++] = class20.field328[var127].field421;
                                                                    continue;
                                                                }
                                                                class89.field1645[var7++] = class139.field2665;
                                                                continue;
                                                            }
                                                            if (~var451 == -3628) {
                                                                --var6;
                                                                int var128 = class51.field861[var6];
                                                                if (~class259.field4536 == -3 && var128 >= 0 && ~class155.field2889 < ~var128) {
                                                                    class51.field861[var6++] = !class102.field1964[var128] ? 0 : 1;
                                                                    continue;
                                                                }
                                                                class51.field861[var6++] = 0;
                                                                continue;
                                                            }
                                                            if (~var451 == -3629) {
                                                                --var7;
                                                                class163 var129 = class89.field1645[var7];
                                                                if (var129.method1212(class64.field1094, 0) || var129.method1212(class52.field873, 0)) {
                                                                    var129 = var129.method1216(7, (byte) -126);
                                                                }
                                                                class51.field861[var6++] = class134.method1054(var129, (byte) -74);
                                                                continue;
                                                            }
                                                        } else if (var451 < 4000) {
                                                            if (~var451 == -3904) {
                                                                --var6;
                                                                int var130 = class51.field861[var6];
                                                                class51.field861[var6++] = client.field2004[var130].method382((byte) 118);
                                                                continue;
                                                            }
                                                            if (var451 == 3904) {
                                                                --var6;
                                                                int var131 = class51.field861[var6];
                                                                class51.field861[var6++] = client.field2004[var131].field917;
                                                                continue;
                                                            }
                                                            if (~var451 == -3906) {
                                                                --var6;
                                                                int var132 = class51.field861[var6];
                                                                class51.field861[var6++] = client.field2004[var132].field907;
                                                                continue;
                                                            }
                                                            if (~var451 == -3907) {
                                                                --var6;
                                                                int var133 = class51.field861[var6];
                                                                class51.field861[var6++] = client.field2004[var133].field925;
                                                                continue;
                                                            }
                                                            if (var451 == 3907) {
                                                                --var6;
                                                                int var134 = class51.field861[var6];
                                                                class51.field861[var6++] = client.field2004[var134].field910;
                                                                continue;
                                                            }
                                                            if (~var451 == -3909) {
                                                                --var6;
                                                                int var135 = class51.field861[var6];
                                                                class51.field861[var6++] = client.field2004[var135].field912;
                                                                continue;
                                                            }
                                                            if (~var451 == -3911) {
                                                                --var6;
                                                                int var136 = class51.field861[var6];
                                                                int var137 = client.field2004[var136].method384((byte) 75);
                                                                class51.field861[var6++] = ~var137 == -1 ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (~var451 == -3912) {
                                                                --var6;
                                                                int var138 = class51.field861[var6];
                                                                int var139 = client.field2004[var138].method384((byte) 75);
                                                                class51.field861[var6++] = var139 != 2 ? 0 : 1;
                                                                continue;
                                                            }
                                                            if (~var451 == -3913) {
                                                                --var6;
                                                                int var140 = class51.field861[var6];
                                                                int var141 = client.field2004[var140].method384((byte) 75);
                                                                class51.field861[var6++] = ~var141 != -6 ? 0 : 1;
                                                                continue;
                                                            }
                                                            if (var451 == 3913) {
                                                                --var6;
                                                                int var142 = class51.field861[var6];
                                                                int var143 = client.field2004[var142].method384((byte) 75);
                                                                class51.field861[var6++] = ~var143 == -2 ? 1 : 0;
                                                                continue;
                                                            }
                                                        } else if (~var451 > -4101) {
                                                            if (var451 == 4000) {
                                                                var6 -= 2;
                                                                int var144 = class51.field861[var6];
                                                                int var145 = class51.field861[var6 + 1];
                                                                class51.field861[var6++] = var144 + var145;
                                                                continue;
                                                            }
                                                            if (var451 == 4001) {
                                                                var6 -= 2;
                                                                int var146 = class51.field861[var6];
                                                                int var147 = class51.field861[var6 + 1];
                                                                class51.field861[var6++] = -var147 + var146;
                                                                continue;
                                                            }
                                                            if (~var451 == -4003) {
                                                                var6 -= 2;
                                                                int var148 = class51.field861[var6 - -1];
                                                                int var149 = class51.field861[var6];
                                                                class51.field861[var6++] = var148 * var149;
                                                                continue;
                                                            }
                                                            if (var451 == 4003) {
                                                                var6 -= 2;
                                                                int var150 = class51.field861[var6];
                                                                int var151 = class51.field861[var6 - -1];
                                                                class51.field861[var6++] = var150 / var151;
                                                                continue;
                                                            }
                                                            if (~var451 == -4005) {
                                                                --var6;
                                                                int var152 = class51.field861[var6];
                                                                class51.field861[var6++] = (int) (Math.random() * (double) var152);
                                                                continue;
                                                            }
                                                            if (var451 == 4005) {
                                                                --var6;
                                                                int var153 = class51.field861[var6];
                                                                class51.field861[var6++] = (int) ((double) (var153 + 1) * Math.random());
                                                                continue;
                                                            }
                                                            if (~var451 == -4007) {
                                                                var6 -= 5;
                                                                int var154 = class51.field861[var6];
                                                                int var155 = class51.field861[var6 + 1];
                                                                int var156 = class51.field861[var6 + 2];
                                                                int var157 = class51.field861[var6 + 3];
                                                                int var158 = class51.field861[var6 + 4];
                                                                class51.field861[var6++] = (var155 - var154) * (-var156 + var158) / (-var156 + var157) + var154;
                                                                continue;
                                                            }
                                                            if (~var451 == -4008) {
                                                                var6 -= 2;
                                                                long var159 = (long) class51.field861[var6 + 1];
                                                                long var161 = (long) class51.field861[var6];
                                                                class51.field861[var6++] = (int) (var161 - -(var159 * var161 / 100L));
                                                                continue;
                                                            }
                                                            if (~var451 == -4009) {
                                                                var6 -= 2;
                                                                int var163 = class51.field861[var6 + 1];
                                                                int var164 = class51.field861[var6];
                                                                class51.field861[var6++] = class3.method27(1 << var163, var164);
                                                                continue;
                                                            }
                                                            if (~var451 == -4010) {
                                                                var6 -= 2;
                                                                int var165 = class51.field861[var6 + 1];
                                                                int var166 = class51.field861[var6];
                                                                class51.field861[var6++] = class7.method50(-(1 << var165) + -1, var166);
                                                                continue;
                                                            }
                                                            if (~var451 == -4011) {
                                                                var6 -= 2;
                                                                int var167 = class51.field861[var6];
                                                                int var168 = class51.field861[var6 + 1];
                                                                class51.field861[var6++] = ~class7.method50(1 << var168, var167) == -1 ? 0 : 1;
                                                                continue;
                                                            }
                                                            if (var451 == 4011) {
                                                                var6 -= 2;
                                                                int var169 = class51.field861[var6 + 1];
                                                                int var170 = class51.field861[var6];
                                                                class51.field861[var6++] = var170 % var169;
                                                                continue;
                                                            }
                                                            if (var451 == 4012) {
                                                                var6 -= 2;
                                                                int var171 = class51.field861[var6];
                                                                int var172 = class51.field861[var6 + 1];
                                                                if (~var171 != -1) {
                                                                    class51.field861[var6++] = (int) Math.pow((double) var171, (double) var172);
                                                                } else {
                                                                    class51.field861[var6++] = 0;
                                                                }
                                                                continue;
                                                            }
                                                            if (~var451 == -4014) {
                                                                var6 -= 2;
                                                                int var173 = class51.field861[var6];
                                                                int var174 = class51.field861[var6 - -1];
                                                                if (var173 == 0) {
                                                                    class51.field861[var6++] = 0;
                                                                } else if (~var174 == -1) {
                                                                    class51.field861[var6++] = Integer.MAX_VALUE;
                                                                } else {
                                                                    class51.field861[var6++] = (int) Math.pow((double) var173, 1.0D / (double) var174);
                                                                }
                                                                continue;
                                                            }
                                                            if (var451 == 4014) {
                                                                var6 -= 2;
                                                                int var175 = class51.field861[var6];
                                                                int var176 = class51.field861[var6 - -1];
                                                                class51.field861[var6++] = class7.method50(var175, var176);
                                                                continue;
                                                            }
                                                            if (~var451 == -4016) {
                                                                var6 -= 2;
                                                                int var177 = class51.field861[var6 + 1];
                                                                int var178 = class51.field861[var6];
                                                                class51.field861[var6++] = class3.method27(var177, var178);
                                                                continue;
                                                            }
                                                            if (var451 == 4016) {
                                                                var6 -= 2;
                                                                int var179 = class51.field861[var6];
                                                                int var180 = class51.field861[var6 + 1];
                                                                class51.field861[var6++] = ~var179 > ~var180 ? var179 : var180;
                                                                continue;
                                                            }
                                                            if (var451 == 4017) {
                                                                var6 -= 2;
                                                                int var181 = class51.field861[var6];
                                                                int var182 = class51.field861[var6 - -1];
                                                                class51.field861[var6++] = var182 >= var181 ? var182 : var181;
                                                                continue;
                                                            }
                                                            if (var451 == 4018) {
                                                                var6 -= 3;
                                                                long var183 = (long) class51.field861[var6];
                                                                long var185 = (long) class51.field861[var6 + 1];
                                                                long var187 = (long) class51.field861[var6 + 2];
                                                                class51.field861[var6++] = (int) (var183 * var187 / var185);
                                                                continue;
                                                            }
                                                        } else if (var451 >= 4200) {
                                                            if (var451 < 4300) {
                                                                if (var451 == 4200) {
                                                                    --var6;
                                                                    int var189 = class51.field861[var6];
                                                                    class89.field1645[var7++] = class120.method939(22952, var189).field1903;
                                                                    continue;
                                                                }
                                                                if (~var451 == -4202) {
                                                                    var6 -= 2;
                                                                    int var190 = class51.field861[var6 + 1];
                                                                    int var191 = class51.field861[var6];
                                                                    class99 var192 = class120.method939(22952, var191);
                                                                    if (~var190 <= -2 && var190 <= 5 && var192.field1884[var190 + -1] != null) {
                                                                        class89.field1645[var7++] = var192.field1884[var190 + -1];
                                                                        continue;
                                                                    }
                                                                    class89.field1645[var7++] = class139.field2665;
                                                                    continue;
                                                                }
                                                                if (~var451 == -4203) {
                                                                    var6 -= 2;
                                                                    int var193 = class51.field861[var6];
                                                                    int var194 = class51.field861[var6 + 1];
                                                                    class99 var195 = class120.method939(22952, var193);
                                                                    if (~var194 <= -2 && var194 <= 5 && var195.field1907[var194 + -1] != null) {
                                                                        class89.field1645[var7++] = var195.field1907[var194 + -1];
                                                                        continue;
                                                                    }
                                                                    class89.field1645[var7++] = class139.field2665;
                                                                    continue;
                                                                }
                                                                if (~var451 == -4204) {
                                                                    --var6;
                                                                    int var196 = class51.field861[var6];
                                                                    class51.field861[var6++] = class120.method939(22952, var196).field1908;
                                                                    continue;
                                                                }
                                                                if (~var451 == -4205) {
                                                                    --var6;
                                                                    int var197 = class51.field861[var6];
                                                                    class51.field861[var6++] = ~class120.method939(22952, var197).field1892 == -2 ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (var451 == 4205) {
                                                                    --var6;
                                                                    int var198 = class51.field861[var6];
                                                                    class99 var199 = class120.method939(22952, var198);
                                                                    if (var199.field1858 == -1 && ~var199.field1891 <= -1) {
                                                                        class51.field861[var6++] = var199.field1891;
                                                                        continue;
                                                                    }
                                                                    class51.field861[var6++] = var198;
                                                                    continue;
                                                                }
                                                                if (~var451 == -4207) {
                                                                    --var6;
                                                                    int var200 = class51.field861[var6];
                                                                    class99 var201 = class120.method939(22952, var200);
                                                                    if (var201.field1858 >= 0 && var201.field1891 >= 0) {
                                                                        class51.field861[var6++] = var201.field1891;
                                                                        continue;
                                                                    }
                                                                    class51.field861[var6++] = var200;
                                                                    continue;
                                                                }
                                                                if (var451 == 4207) {
                                                                    --var6;
                                                                    int var202 = class51.field861[var6];
                                                                    class51.field861[var6++] = class120.method939(22952, var202).field1866 ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (var451 == 4208) {
                                                                    var6 -= 2;
                                                                    int var203 = class51.field861[var6];
                                                                    int var204 = class51.field861[var6 + 1];
                                                                    class54 var205 = class35.method249(var204, 11);
                                                                    if (!var205.method379(115)) {
                                                                        class51.field861[var6++] = class120.method939(22952, var203).method800((byte) 127, var205.field887, var204);
                                                                    } else {
                                                                        class89.field1645[var7++] = class120.method939(22952, var203).method794(var205.field897, var204, 0);
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var451 == 4210) {
                                                                    --var7;
                                                                    class163 var206 = class89.field1645[var7];
                                                                    --var6;
                                                                    int var207 = class51.field861[var6];
                                                                    class95.method754((byte) -124, var207 == 1, var206);
                                                                    class51.field861[var6++] = class256.field4473;
                                                                    continue;
                                                                }
                                                                if (~var451 == -4212) {
                                                                    if (class259.field4544 != null && ~class258.field4525 > ~class256.field4473) {
                                                                        class51.field861[var6++] = class7.method50(class259.field4544[class258.field4525++], 65535);
                                                                        continue;
                                                                    }
                                                                    class51.field861[var6++] = -1;
                                                                    continue;
                                                                }
                                                                if (var451 == 4212) {
                                                                    class258.field4525 = 0;
                                                                    continue;
                                                                }
                                                            } else if (~var451 <= -4401) {
                                                                if (var451 < 4500) {
                                                                    if (var451 == 4400) {
                                                                        var6 -= 2;
                                                                        int var208 = class51.field861[var6];
                                                                        int var209 = class51.field861[var6 - -1];
                                                                        class54 var210 = class35.method249(var209, 11);
                                                                        if (var210.method379(115)) {
                                                                            class89.field1645[var7++] = class9.method64(false, var208).method257((byte) -126, var210.field897, var209);
                                                                        } else {
                                                                            class51.field861[var6++] = class9.method64(false, var208).method260(100, var209, var210.field887);
                                                                        }
                                                                        continue;
                                                                    }
                                                                } else if (var451 >= 4600) {
                                                                    if (var451 < 5100) {
                                                                        if (~var451 == -5001) {
                                                                            class51.field861[var6++] = class186.field3414;
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5001) {
                                                                            var6 -= 3;
                                                                            class186.field3414 = class51.field861[var6];
                                                                            ++class252.field4420;
                                                                            class114.field2146 = class51.field861[var6 - -1];
                                                                            class50.field854 = class51.field861[var6 + 2];
                                                                            class191.field3499.method75(43, 65);
                                                                            class191.field3499.method655(0, class186.field3414);
                                                                            class191.field3499.method655(0, class114.field2146);
                                                                            class191.field3499.method655(0, class50.field854);
                                                                            continue;
                                                                        }
                                                                        if (~var451 == -5003) {
                                                                            var6 -= 2;
                                                                            ++class4.field84;
                                                                            --var7;
                                                                            class163 var211 = class89.field1645[var7];
                                                                            int var212 = class51.field861[var6];
                                                                            int var213 = class51.field861[var6 - -1];
                                                                            class191.field3499.method75(53, 76);
                                                                            class191.field3499.method651(-645765520, var211.method1193((byte) 84));
                                                                            class191.field3499.method655(0, var212 + -1);
                                                                            class191.field3499.method655(0, var213);
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5003) {
                                                                            --var6;
                                                                            int var214 = class51.field861[var6];
                                                                            class163 var215 = null;
                                                                            if (var214 < 100) {
                                                                                var215 = class256.field4491[var214];
                                                                            }
                                                                            if (var215 == null) {
                                                                                var215 = class139.field2665;
                                                                            }
                                                                            class89.field1645[var7++] = var215;
                                                                            continue;
                                                                        }
                                                                        if (~var451 == -5005) {
                                                                            --var6;
                                                                            int var216 = class51.field861[var6];
                                                                            int var217 = -1;
                                                                            if (var216 < 100 && class256.field4491[var216] != null) {
                                                                                var217 = class57.field945[var216];
                                                                            }
                                                                            class51.field861[var6++] = var217;
                                                                            continue;
                                                                        }
                                                                        if (~var451 == -5006) {
                                                                            class51.field861[var6++] = class114.field2146;
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5008) {
                                                                            --var7;
                                                                            class163 var218 = class89.field1645[var7];
                                                                            if (var218.method1212(class256.field4493, 0)) {
                                                                                class13.method91(var218, 4080);
                                                                                continue;
                                                                            }
                                                                            if (~class99.field1920 == -1 && (class97.field1837 == 1 || class209.field3789 == 1)) {
                                                                                continue;
                                                                            }
                                                                            ++class159.field2925;
                                                                            class163 var219 = var218.method1205(33);
                                                                            byte var220 = 0;
                                                                            byte var221 = 0;
                                                                            if (!var219.method1212(class97.field1819, 0)) {
                                                                                if (!var219.method1212(class253.field4436, 0)) {
                                                                                    if (var219.method1212(class188.field3442, 0)) {
                                                                                        var220 = 2;
                                                                                        var218 = var218.method1216(class188.field3442.method1221(-23096), (byte) -126);
                                                                                    } else if (!var219.method1212(class213.field3879, 0)) {
                                                                                        if (!var219.method1212(class233.field4168, 0)) {
                                                                                            if (var219.method1212(class50.field850, 0)) {
                                                                                                var220 = 5;
                                                                                                var218 = var218.method1216(class50.field850.method1221(-23096), (byte) -125);
                                                                                            } else if (var219.method1212(class12.field183, 0)) {
                                                                                                var220 = 6;
                                                                                                var218 = var218.method1216(class12.field183.method1221(-23096), (byte) -125);
                                                                                            } else if (!var219.method1212(class59.field966, 0)) {
                                                                                                if (!var219.method1212(class239.field4265, 0)) {
                                                                                                    if (var219.method1212(class69.field1326, 0)) {
                                                                                                        var220 = 9;
                                                                                                        var218 = var218.method1216(class69.field1326.method1221(-23096), (byte) -127);
                                                                                                    } else if (var219.method1212(class64.field1090, 0)) {
                                                                                                        var218 = var218.method1216(class64.field1090.method1221(-23096), (byte) -125);
                                                                                                        var220 = 10;
                                                                                                    } else if (var219.method1212(class141.field2691, 0)) {
                                                                                                        var218 = var218.method1216(class141.field2691.method1221(-23096), (byte) -128);
                                                                                                        var220 = 11;
                                                                                                    } else if (~class218.field3968 != -1) {
                                                                                                        if (!var219.method1212(class97.field1827, 0)) {
                                                                                                            if (!var219.method1212(class253.field4438, 0)) {
                                                                                                                if (var219.method1212(class188.field3440, 0)) {
                                                                                                                    var220 = 2;
                                                                                                                    var218 = var218.method1216(class188.field3440.method1221(-23096), (byte) -125);
                                                                                                                } else if (!var219.method1212(class213.field3890, 0)) {
                                                                                                                    if (var219.method1212(class233.field4157, 0)) {
                                                                                                                        var218 = var218.method1216(class233.field4157.method1221(-23096), (byte) -125);
                                                                                                                        var220 = 4;
                                                                                                                    } else if (!var219.method1212(class50.field845, 0)) {
                                                                                                                        if (!var219.method1212(class12.field185, 0)) {
                                                                                                                            if (var219.method1212(class59.field979, 0)) {
                                                                                                                                var218 = var218.method1216(class59.field979.method1221(-23096), (byte) -127);
                                                                                                                                var220 = 7;
                                                                                                                            } else if (!var219.method1212(class239.field4260, 0)) {
                                                                                                                                if (var219.method1212(class69.field1207, 0)) {
                                                                                                                                    var220 = 9;
                                                                                                                                    var218 = var218.method1216(class69.field1207.method1221(-23096), (byte) -128);
                                                                                                                                } else if (var219.method1212(class64.field1091, 0)) {
                                                                                                                                    var220 = 10;
                                                                                                                                    var218 = var218.method1216(class64.field1091.method1221(-23096), (byte) -128);
                                                                                                                                } else if (var219.method1212(class141.field2692, 0)) {
                                                                                                                                    var218 = var218.method1216(class141.field2692.method1221(-23096), (byte) -127);
                                                                                                                                    var220 = 11;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var220 = 8;
                                                                                                                                var218 = var218.method1216(class239.field4260.method1221(-23096), (byte) -127);
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var218 = var218.method1216(class12.field185.method1221(-23096), (byte) -128);
                                                                                                                            var220 = 6;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var220 = 5;
                                                                                                                        var218 = var218.method1216(class50.field845.method1221(-23096), (byte) -126);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    var220 = 3;
                                                                                                                    var218 = var218.method1216(class213.field3890.method1221(-23096), (byte) -127);
                                                                                                                }
                                                                                                            } else {
                                                                                                                var218 = var218.method1216(class253.field4438.method1221(-23096), (byte) -128);
                                                                                                                var220 = 1;
                                                                                                            }
                                                                                                        } else {
                                                                                                            var220 = 0;
                                                                                                            var218 = var218.method1216(class97.field1827.method1221(-23096), (byte) -128);
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    var218 = var218.method1216(class239.field4265.method1221(-23096), (byte) -125);
                                                                                                    var220 = 8;
                                                                                                }
                                                                                            } else {
                                                                                                var220 = 7;
                                                                                                var218 = var218.method1216(class59.field966.method1221(-23096), (byte) -126);
                                                                                            }
                                                                                        } else {
                                                                                            var220 = 4;
                                                                                            var218 = var218.method1216(class233.field4168.method1221(-23096), (byte) -128);
                                                                                        }
                                                                                    } else {
                                                                                        var220 = 3;
                                                                                        var218 = var218.method1216(class213.field3879.method1221(-23096), (byte) -127);
                                                                                    }
                                                                                } else {
                                                                                    var218 = var218.method1216(class253.field4436.method1221(-23096), (byte) -128);
                                                                                    var220 = 1;
                                                                                }
                                                                            } else {
                                                                                var218 = var218.method1216(class97.field1819.method1221(-23096), (byte) -126);
                                                                                var220 = 0;
                                                                            }
                                                                            class163 var222 = var218.method1205(33);
                                                                            if (var222.method1212(class66.field1119, 0)) {
                                                                                var221 = 1;
                                                                                var218 = var218.method1216(class66.field1119.method1221(-23096), (byte) -128);
                                                                            } else if (var222.method1212(class36.field615, 0)) {
                                                                                var218 = var218.method1216(class36.field615.method1221(-23096), (byte) -126);
                                                                                var221 = 2;
                                                                            } else if (!var222.method1212(class29.field453, 0)) {
                                                                                if (var222.method1212(class122.field2334, 0)) {
                                                                                    var218 = var218.method1216(class122.field2334.method1221(-23096), (byte) -125);
                                                                                    var221 = 4;
                                                                                } else if (!var222.method1212(class115.field2170, 0)) {
                                                                                    if (class218.field3968 != 0) {
                                                                                        if (var222.method1212(class66.field1113, 0)) {
                                                                                            var221 = 1;
                                                                                            var218 = var218.method1216(class66.field1113.method1221(-23096), (byte) -127);
                                                                                        } else if (var222.method1212(class36.field616, 0)) {
                                                                                            var218 = var218.method1216(class36.field616.method1221(-23096), (byte) -128);
                                                                                            var221 = 2;
                                                                                        } else if (var222.method1212(class29.field459, 0)) {
                                                                                            var221 = 3;
                                                                                            var218 = var218.method1216(class29.field459.method1221(-23096), (byte) -125);
                                                                                        } else if (!var222.method1212(class122.field2332, 0)) {
                                                                                            if (var222.method1212(class115.field2187, 0)) {
                                                                                                var218 = var218.method1216(class115.field2187.method1221(-23096), (byte) -127);
                                                                                                var221 = 5;
                                                                                            }
                                                                                        } else {
                                                                                            var218 = var218.method1216(class122.field2332.method1221(-23096), (byte) -126);
                                                                                            var221 = 4;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    var218 = var218.method1216(class115.field2170.method1221(-23096), (byte) -126);
                                                                                    var221 = 5;
                                                                                }
                                                                            } else {
                                                                                var221 = 3;
                                                                                var218 = var218.method1216(class29.field453.method1221(-23096), (byte) -128);
                                                                            }
                                                                            class191.field3499.method75(247, 62);
                                                                            class191.field3499.method655(0, 0);
                                                                            int var223 = class191.field3499.field1541;
                                                                            class191.field3499.method655(0, var220);
                                                                            class191.field3499.method655(0, var221);
                                                                            class71.method525(class191.field3499, var218, (byte) -37);
                                                                            class191.field3499.method659(-var223 + class191.field3499.field1541, 65);
                                                                            continue;
                                                                        }
                                                                        if (~var451 == -5010) {
                                                                            var7 -= 2;
                                                                            class163 var224 = class89.field1645[var7];
                                                                            class163 var225 = class89.field1645[var7 + 1];
                                                                            if (class99.field1920 != 0 || class97.field1837 != 1 && class209.field3789 != 1) {
                                                                                ++class239.field4274;
                                                                                class191.field3499.method75(64, 116);
                                                                                class191.field3499.method655(0, 0);
                                                                                int var226 = class191.field3499.field1541;
                                                                                class191.field3499.method651(-645765520, var224.method1193((byte) 104));
                                                                                class71.method525(class191.field3499, var225, (byte) -37);
                                                                                class191.field3499.method659(-var226 + class191.field3499.field1541, 90);
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5010) {
                                                                            --var6;
                                                                            int var227 = class51.field861[var6];
                                                                            class163 var228 = null;
                                                                            if (~var227 > -101) {
                                                                                var228 = class216.field3929[var227];
                                                                            }
                                                                            if (var228 == null) {
                                                                                var228 = class139.field2665;
                                                                            }
                                                                            class89.field1645[var7++] = var228;
                                                                            continue;
                                                                        }
                                                                        if (~var451 == -5012) {
                                                                            --var6;
                                                                            int var229 = class51.field861[var6];
                                                                            class163 var230 = null;
                                                                            if (~var229 > -101) {
                                                                                var230 = class253.field4432[var229];
                                                                            }
                                                                            if (var230 == null) {
                                                                                var230 = class139.field2665;
                                                                            }
                                                                            class89.field1645[var7++] = var230;
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5012) {
                                                                            --var6;
                                                                            int var231 = class51.field861[var6];
                                                                            int var232 = -1;
                                                                            if (var231 < 100) {
                                                                                var232 = class18.field286[var231];
                                                                            }
                                                                            class51.field861[var6++] = var232;
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5015) {
                                                                            class163 var233;
                                                                            if (class235.field4203 != null && class235.field4203.field2424 != null) {
                                                                                var233 = class235.field4203.method997(10);
                                                                            } else {
                                                                                var233 = class170.field3115;
                                                                            }
                                                                            class89.field1645[var7++] = var233;
                                                                            continue;
                                                                        }
                                                                        if (~var451 == -5017) {
                                                                            class51.field861[var6++] = class50.field854;
                                                                            continue;
                                                                        }
                                                                        if (~var451 == -5018) {
                                                                            class51.field861[var6++] = class245.field4324;
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5050) {
                                                                            --var6;
                                                                            int var234 = class51.field861[var6];
                                                                            class89.field1645[var7++] = class77.method563(var234, -86).field4259;
                                                                            continue;
                                                                        }
                                                                        if (~var451 == -5052) {
                                                                            --var6;
                                                                            int var235 = class51.field861[var6];
                                                                            class239 var236 = class77.method563(var235, -119);
                                                                            if (var236.field4246 != null) {
                                                                                class51.field861[var6++] = var236.field4246.length;
                                                                            } else {
                                                                                class51.field861[var6++] = 0;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5052) {
                                                                            var6 -= 2;
                                                                            int var237 = class51.field861[var6];
                                                                            int var238 = class51.field861[var6 + 1];
                                                                            class239 var239 = class77.method563(var237, -97);
                                                                            int var240 = var239.field4246[var238];
                                                                            class51.field861[var6++] = var240;
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5053) {
                                                                            --var6;
                                                                            int var241 = class51.field861[var6];
                                                                            class239 var242 = class77.method563(var241, -51);
                                                                            if (var242.field4262 == null) {
                                                                                class51.field861[var6++] = 0;
                                                                            } else {
                                                                                class51.field861[var6++] = var242.field4262.length;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5054) {
                                                                            var6 -= 2;
                                                                            int var243 = class51.field861[var6];
                                                                            int var244 = class51.field861[var6 - -1];
                                                                            class51.field861[var6++] = class77.method563(var243, -47).field4262[var244];
                                                                            continue;
                                                                        }
                                                                        if (~var451 == -5056) {
                                                                            --var6;
                                                                            int var245 = class51.field861[var6];
                                                                            class89.field1645[var7++] = class71.method517(0, var245).method1623(110);
                                                                            continue;
                                                                        }
                                                                        if (~var451 == -5057) {
                                                                            --var6;
                                                                            int var246 = class51.field861[var6];
                                                                            class234 var247 = class71.method517(0, var246);
                                                                            if (var247.field4177 == null) {
                                                                                class51.field861[var6++] = 0;
                                                                            } else {
                                                                                class51.field861[var6++] = var247.field4177.length;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (~var451 == -5058) {
                                                                            var6 -= 2;
                                                                            int var248 = class51.field861[var6];
                                                                            int var249 = class51.field861[var6 + 1];
                                                                            class51.field861[var6++] = class71.method517(0, var248).field4177[var249];
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5058) {
                                                                            class235.field4200 = new class186();
                                                                            --var6;
                                                                            class235.field4200.field3415 = class51.field861[var6];
                                                                            class235.field4200.field3413 = class71.method517(0, class235.field4200.field3415);
                                                                            class235.field4200.field3411 = new int[class235.field4200.field3413.method1625(128)];
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5059) {
                                                                            ++class252.field4427;
                                                                            class191.field3499.method75(120, 103);
                                                                            class191.field3499.method655(0, 0);
                                                                            int var250 = class191.field3499.field1541;
                                                                            class191.field3499.method655(0, 0);
                                                                            class191.field3499.method631(class235.field4200.field3415, -1);
                                                                            class235.field4200.field3413.method1631(0, class235.field4200.field3411, class191.field3499);
                                                                            class191.field3499.method659(-var250 + class191.field3499.field1541, 86);
                                                                            continue;
                                                                        }
                                                                        if (~var451 == -5061) {
                                                                            ++class17.field240;
                                                                            --var7;
                                                                            class163 var251 = class89.field1645[var7];
                                                                            class191.field3499.method75(200, 81);
                                                                            class191.field3499.method655(0, 0);
                                                                            int var252 = class191.field3499.field1541;
                                                                            class191.field3499.method651(-645765520, var251.method1193((byte) 110));
                                                                            class191.field3499.method631(class235.field4200.field3415, -1);
                                                                            class235.field4200.field3413.method1631(0, class235.field4200.field3411, class191.field3499);
                                                                            class191.field3499.method659(-var252 + class191.field3499.field1541, 73);
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5061) {
                                                                            class191.field3499.method75(120, 47);
                                                                            ++class252.field4427;
                                                                            class191.field3499.method655(0, 0);
                                                                            int var253 = class191.field3499.field1541;
                                                                            class191.field3499.method655(0, 1);
                                                                            class191.field3499.method631(class235.field4200.field3415, -1);
                                                                            class235.field4200.field3413.method1631(0, class235.field4200.field3411, class191.field3499);
                                                                            class191.field3499.method659(-var253 + class191.field3499.field1541, 67);
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5062) {
                                                                            var6 -= 2;
                                                                            int var254 = class51.field861[var6];
                                                                            int var255 = class51.field861[var6 + 1];
                                                                            class51.field861[var6++] = class77.method563(var254, -66).field4255[var255];
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5063) {
                                                                            var6 -= 2;
                                                                            int var256 = class51.field861[var6];
                                                                            int var257 = class51.field861[var6 + 1];
                                                                            class51.field861[var6++] = class77.method563(var256, -122).field4253[var257];
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5064) {
                                                                            var6 -= 2;
                                                                            int var258 = class51.field861[var6];
                                                                            int var259 = class51.field861[var6 - -1];
                                                                            if (~var259 != 0) {
                                                                                class51.field861[var6++] = class77.method563(var258, -91).method1658(-11507, var259);
                                                                            } else {
                                                                                class51.field861[var6++] = -1;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5065) {
                                                                            var6 -= 2;
                                                                            int var260 = class51.field861[var6];
                                                                            int var261 = class51.field861[var6 - -1];
                                                                            if (~var261 == 0) {
                                                                                class51.field861[var6++] = -1;
                                                                            } else {
                                                                                class51.field861[var6++] = class77.method563(var260, -66).method1653(var261, (byte) 110);
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5066) {
                                                                            --var6;
                                                                            int var262 = class51.field861[var6];
                                                                            class51.field861[var6++] = class71.method517(0, var262).method1625(128);
                                                                            continue;
                                                                        }
                                                                        if (~var451 == -5068) {
                                                                            var6 -= 2;
                                                                            int var263 = class51.field861[var6 + 1];
                                                                            int var264 = class51.field861[var6];
                                                                            int var265 = class71.method517(0, var264).method1629(56, var263);
                                                                            class51.field861[var6++] = var265;
                                                                            continue;
                                                                        }
                                                                        if (~var451 == -5069) {
                                                                            var6 -= 2;
                                                                            int var266 = class51.field861[var6];
                                                                            int var267 = class51.field861[var6 + 1];
                                                                            class235.field4200.field3411[var266] = var267;
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5069) {
                                                                            var6 -= 2;
                                                                            int var268 = class51.field861[var6];
                                                                            int var269 = class51.field861[var6 + 1];
                                                                            class235.field4200.field3411[var268] = var269;
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5070) {
                                                                            var6 -= 3;
                                                                            int var270 = class51.field861[var6 + 2];
                                                                            int var271 = class51.field861[var6];
                                                                            int var272 = class51.field861[var6 + 1];
                                                                            class234 var273 = class71.method517(0, var271);
                                                                            if (~var273.method1629(48, var272) != -1) {
                                                                                throw new RuntimeException("bad command");
                                                                            }
                                                                            class51.field861[var6++] = var273.method1630(var272, var270, (byte) 106);
                                                                            continue;
                                                                        }
                                                                    } else if (~var451 > -5201) {
                                                                        if (~var451 == -5101) {
                                                                            if (!class217.field3942[86]) {
                                                                                class51.field861[var6++] = 0;
                                                                            } else {
                                                                                class51.field861[var6++] = 1;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (~var451 == -5102) {
                                                                            if (!class217.field3942[82]) {
                                                                                class51.field861[var6++] = 0;
                                                                            } else {
                                                                                class51.field861[var6++] = 1;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5102) {
                                                                            if (class217.field3942[81]) {
                                                                                class51.field861[var6++] = 1;
                                                                            } else {
                                                                                class51.field861[var6++] = 0;
                                                                            }
                                                                            continue;
                                                                        }
                                                                    } else if (var451 < 5300) {
                                                                        if (var451 == 5200) {
                                                                            --var6;
                                                                            class65.method454(0, class51.field861[var6]);
                                                                            continue;
                                                                        }
                                                                        if (~var451 == -5202) {
                                                                            class51.field861[var6++] = class69.method488((byte) -93);
                                                                            continue;
                                                                        }
                                                                        if (~var451 == -5203) {
                                                                            --var6;
                                                                            class102.method814(class51.field861[var6], !arg2);
                                                                            continue;
                                                                        }
                                                                        if (~var451 == -5204) {
                                                                            --var7;
                                                                            class33.method196(false, class89.field1645[var7]);
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5204) {
                                                                            class89.field1645[var7 + -1] = class246.method1692(class89.field1645[var7 + -1], 42);
                                                                            continue;
                                                                        }
                                                                        if (~var451 == -5206) {
                                                                            --var7;
                                                                            class257.method1736(class89.field1645[var7], -122);
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5206) {
                                                                            --var6;
                                                                            int var274 = class51.field861[var6];
                                                                            class76 var275 = class93.method740(16383 & var274, -18094, (var274 & 268429085) >> 14);
                                                                            if (var275 == null) {
                                                                                class89.field1645[var7++] = class139.field2665;
                                                                            } else {
                                                                                class89.field1645[var7++] = var275.field1438;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var451 == 5207) {
                                                                            --var7;
                                                                            class76 var276 = class175.method1301(16, class89.field1645[var7]);
                                                                            if (var276 != null && var276.field1441 != null) {
                                                                                class89.field1645[var7++] = var276.field1441;
                                                                                continue;
                                                                            }
                                                                            class89.field1645[var7++] = class139.field2665;
                                                                            continue;
                                                                        }
                                                                    } else if (var451 >= 5400) {
                                                                        if (var451 >= 5500) {
                                                                            if (~var451 > -5601) {
                                                                                if (var451 == 5500) {
                                                                                    var6 -= 4;
                                                                                    int var277 = class51.field861[var6];
                                                                                    int var278 = class51.field861[var6 + 2];
                                                                                    int var279 = class51.field861[var6 - -3];
                                                                                    int var280 = class51.field861[var6 + 1];
                                                                                    class28.method174(var280, var278, false, (var277 >> 14 & 16383) + -class62.field1035, var279, 2, (var277 & 16383) - class257.field4500);
                                                                                    continue;
                                                                                }
                                                                                if (~var451 == -5502) {
                                                                                    var6 -= 4;
                                                                                    int var281 = class51.field861[var6];
                                                                                    int var282 = class51.field861[var6 + 1];
                                                                                    int var283 = class51.field861[var6 + 2];
                                                                                    int var284 = class51.field861[var6 + 3];
                                                                                    class141.method1081(var283, var284, (byte) -38, (var281 & 16383) - class257.field4500, var282, ((var281 & 268432530) >> 14) + -class62.field1035);
                                                                                    continue;
                                                                                }
                                                                                if (var451 == 5502) {
                                                                                    var6 -= 6;
                                                                                    int var285 = class51.field861[var6];
                                                                                    if (~var285 <= -3) {
                                                                                        throw new RuntimeException();
                                                                                    }
                                                                                    class125.field2414 = var285;
                                                                                    int var286 = class51.field861[var6 + 1];
                                                                                    if (class262.field4575[class125.field2414].length >> 1 <= var286 + 1) {
                                                                                        throw new RuntimeException();
                                                                                    }
                                                                                    class160.field2945 = 0;
                                                                                    class48.field799 = var286;
                                                                                    class122.field2331 = class51.field861[var6 + 2];
                                                                                    class140.field2673 = class51.field861[var6 - -3];
                                                                                    int var287 = class51.field861[var6 - -4];
                                                                                    if (var287 >= 2) {
                                                                                        throw new RuntimeException();
                                                                                    }
                                                                                    class192.field3513 = var287;
                                                                                    int var288 = class51.field861[var6 + 5];
                                                                                    if (~(var288 - -1) <= ~(class262.field4575[class192.field3513].length >> 1)) {
                                                                                        throw new RuntimeException();
                                                                                    }
                                                                                    class66.field1117 = var288;
                                                                                    class5.field99 = 3;
                                                                                    continue;
                                                                                }
                                                                                if (var451 == 5503) {
                                                                                    class52.method360((byte) 36);
                                                                                    continue;
                                                                                }
                                                                                if (~var451 == -5505) {
                                                                                    var6 -= 2;
                                                                                    class132.field2560 = class51.field861[var6];
                                                                                    class93.field1750 = class51.field861[var6 + 1];
                                                                                    class259.method1755((byte) 122);
                                                                                    continue;
                                                                                }
                                                                                if (var451 == 5505) {
                                                                                    class51.field861[var6++] = class132.field2560;
                                                                                    continue;
                                                                                }
                                                                                if (~var451 == -5507) {
                                                                                    class51.field861[var6++] = class93.field1750;
                                                                                    continue;
                                                                                }
                                                                            } else if (~var451 > -5701) {
                                                                                if (~var451 == -5601) {
                                                                                    var7 -= 2;
                                                                                    class163 var289 = class89.field1645[var7 - -1];
                                                                                    class163 var290 = class89.field1645[var7];
                                                                                    --var6;
                                                                                    int var291 = class51.field861[var6];
                                                                                    if (~class262.field4583 == -11 && ~class225.field4072 == -1 && ~class31.field481 == -1) {
                                                                                        class76.method559(var289, var290, var291, 3);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (var451 == 5601) {
                                                                                    class117.method936(10735);
                                                                                    continue;
                                                                                }
                                                                                if (var451 == 5602) {
                                                                                    if (class225.field4072 == 0) {
                                                                                        class128.field2492 = -2;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (~var451 == -5604) {
                                                                                    var6 -= 4;
                                                                                    if (~class262.field4583 == -11 && ~class225.field4072 == -1 && class31.field481 == 0) {
                                                                                        class143.method1089(class51.field861[var6 + 3], -106, class51.field861[var6], class51.field861[var6 + 1], class51.field861[var6 + 2]);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (~var451 == -5605) {
                                                                                    --var7;
                                                                                    if (~class262.field4583 == -11 && class225.field4072 == 0 && class31.field481 == 0) {
                                                                                        class259.method1752(class89.field1645[var7].method1193((byte) 80), 119);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (var451 == 5605) {
                                                                                    var7 -= 2;
                                                                                    var6 -= 4;
                                                                                    if (~class262.field4583 == -11 && class225.field4072 == 0 && class31.field481 == 0) {
                                                                                        class45.method331(class51.field861[var6 + 3], arg2, class51.field861[var6 + 1], class51.field861[var6 + 2], class89.field1645[var7].method1193((byte) 36), class51.field861[var6], class89.field1645[var7 - -1]);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (var451 == 5606) {
                                                                                    if (class31.field481 == 0) {
                                                                                        class244.field4321 = -2;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (~var451 == -5608) {
                                                                                    class51.field861[var6++] = class128.field2492;
                                                                                    continue;
                                                                                }
                                                                                if (var451 == 5608) {
                                                                                    class51.field861[var6++] = class202.field3676;
                                                                                    continue;
                                                                                }
                                                                                if (~var451 == -5610) {
                                                                                    class51.field861[var6++] = class244.field4321;
                                                                                    continue;
                                                                                }
                                                                                if (~var451 == -5611) {
                                                                                    for (int var292 = 0; ~var292 > -6; ++var292) {
                                                                                        class89.field1645[var7++] = class254.field4447.length > var292 ? class254.field4447[var292] : class139.field2665;
                                                                                    }
                                                                                    class254.field4447 = null;
                                                                                    continue;
                                                                                }
                                                                            } else if (var451 >= 6100) {
                                                                                if (var451 < 6200) {
                                                                                    if (~var451 == -6102) {
                                                                                        class51.field861[var6++] = class211.field3824;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var451 == -6103) {
                                                                                        class51.field861[var6++] = class177.method1310(4643) ? 1 : 0;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var451 == -6104) {
                                                                                        class51.field861[var6++] = !class73.field1368 ? 0 : 1;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var451 == -6106) {
                                                                                        class51.field861[var6++] = !class119.field2247 ? 0 : 1;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var451 == -6107) {
                                                                                        class51.field861[var6++] = class208.field3781 ? 1 : 0;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var451 == -6108) {
                                                                                        class51.field861[var6++] = class210.field3801 ? 1 : 0;
                                                                                        continue;
                                                                                    }
                                                                                    if (var451 == 6108) {
                                                                                        class51.field861[var6++] = class126.field2438 ? 1 : 0;
                                                                                        continue;
                                                                                    }
                                                                                    if (var451 == 6109) {
                                                                                        class51.field861[var6++] = !class9.field154 ? 0 : 1;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var451 == -6111) {
                                                                                        class51.field861[var6++] = client.field2006 ? 1 : 0;
                                                                                        continue;
                                                                                    }
                                                                                    if (var451 == 6111) {
                                                                                        class51.field861[var6++] = class22.field353;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var451 == -6113) {
                                                                                        class51.field861[var6++] = !class48.field804 ? 0 : 1;
                                                                                        continue;
                                                                                    }
                                                                                    if (var451 == 6114) {
                                                                                        class51.field861[var6++] = !class84.field1593 ? 0 : 1;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var451 == -6116) {
                                                                                        class51.field861[var6++] = !class88.field1633 ? 0 : 1;
                                                                                        continue;
                                                                                    }
                                                                                    if (var451 == 6116) {
                                                                                        class51.field861[var6++] = class103.field1975;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var451 == -6118) {
                                                                                        class51.field861[var6++] = class244.field4306 ? 1 : 0;
                                                                                        continue;
                                                                                    }
                                                                                    if (var451 == 6118) {
                                                                                        class51.field861[var6++] = class215.field3928;
                                                                                        continue;
                                                                                    }
                                                                                    if (var451 == 6119) {
                                                                                        class51.field861[var6++] = class77.field1453;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var451 == -6121) {
                                                                                        class51.field861[var6++] = class2.field46;
                                                                                        continue;
                                                                                    }
                                                                                    if (var451 == 6121) {
                                                                                        class51.field861[var6++] = 0;
                                                                                        continue;
                                                                                    }
                                                                                } else if (~var451 <= -6301) {
                                                                                    if (~var451 > -6401) {
                                                                                        if (var451 == 6300) {
                                                                                            class51.field861[var6++] = (int) (class7.method55(0) / 60000L);
                                                                                            continue;
                                                                                        }
                                                                                        if (var451 == 6301) {
                                                                                            class51.field861[var6++] = (int) (class7.method55(0) / 86400000L) - 11745;
                                                                                            continue;
                                                                                        }
                                                                                        if (var451 == 6302) {
                                                                                            var6 -= 3;
                                                                                            int var293 = class51.field861[var6 - -2];
                                                                                            int var294 = class51.field861[var6];
                                                                                            int var295 = class51.field861[var6 + 1];
                                                                                            class134.field2589.clear();
                                                                                            class134.field2589.set(11, 12);
                                                                                            class134.field2589.set(var293, var295, var294);
                                                                                            class51.field861[var6++] = -11745 + (int) (class134.field2589.getTime().getTime() / 86400000L);
                                                                                            continue;
                                                                                        }
                                                                                        if (var451 == 6303) {
                                                                                            class134.field2589.clear();
                                                                                            class134.field2589.setTime(new Date(class7.method55(0)));
                                                                                            class51.field861[var6++] = class134.field2589.get(1);
                                                                                            continue;
                                                                                        }
                                                                                        if (~var451 == -6305) {
                                                                                            boolean var296 = true;
                                                                                            --var6;
                                                                                            int var297 = class51.field861[var6];
                                                                                            if (~var297 <= -1) {
                                                                                                if (~var297 > -1583) {
                                                                                                    var296 = ~(var297 % 4) == -1;
                                                                                                } else if (~(var297 % 4) != -1) {
                                                                                                    var296 = false;
                                                                                                } else if (~(var297 % 100) != -1) {
                                                                                                    var296 = true;
                                                                                                } else if (var297 % 400 != 0) {
                                                                                                    var296 = false;
                                                                                                }
                                                                                            } else {
                                                                                                var296 = ~((var297 + 1) % 4) == -1;
                                                                                            }
                                                                                            class51.field861[var6++] = !var296 ? 0 : 1;
                                                                                            continue;
                                                                                        }
                                                                                    } else if (~var451 > -6501) {
                                                                                        if (var451 == 6400) {
                                                                                            class51.field861[var6++] = !class95.field1793 ? 0 : 1;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var451 == -6402) {
                                                                                            --var7;
                                                                                            class163 var298 = class89.field1645[var7];
                                                                                            --var6;
                                                                                            int var299 = class51.field861[var6];
                                                                                            String var300;
                                                                                            try {
                                                                                                var300 = new String(var298.method1202(4639), "ISO-8859-1");
                                                                                            } catch (UnsupportedEncodingException var449) {
                                                                                                var300 = new String(var298.method1202(4639));
                                                                                            }
                                                                                            if (class95.field1793) {
                                                                                                if (class250.field4402 == null) {
                                                                                                    class250.field4402 = new browsercontrol("about:blank");
                                                                                                }
                                                                                                class76.field1428 = var299;
                                                                                                class250.field4402.navigate(var300);
                                                                                                class99.field1857 = true;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (var451 == 6402) {
                                                                                            if (class250.field4402 != null) {
                                                                                                class250.field4402.navigate("about:blank");
                                                                                                class99.field1857 = true;
                                                                                                class76.field1428 = 0;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (~var451 == -6404) {
                                                                                            class89.field1645[var7++] = class169.field3091;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var451 == -6405) {
                                                                                            class89.field1645[var7++] = class179.field3251;
                                                                                            continue;
                                                                                        }
                                                                                        if (var451 == 6405) {
                                                                                            class51.field861[var6++] = class186.method1374((byte) -125) ? 1 : 0;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var451 == -6407) {
                                                                                            class51.field861[var6++] = !class190.method1398((byte) -127) ? 0 : 1;
                                                                                            continue;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (~var451 == -6201) {
                                                                                        var6 -= 2;
                                                                                        class213.field3892 = (short) class51.field861[var6];
                                                                                        if (class213.field3892 <= 0) {
                                                                                            class213.field3892 = 256;
                                                                                        }
                                                                                        class191.field3497 = (short) class51.field861[var6 + 1];
                                                                                        if (~class191.field3497 >= -1) {
                                                                                            class191.field3497 = 205;
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    if (~var451 == -6202) {
                                                                                        var6 -= 2;
                                                                                        class222.field4047 = (short) class51.field861[var6];
                                                                                        if (class222.field4047 <= 0) {
                                                                                            class222.field4047 = 256;
                                                                                        }
                                                                                        class104.field2008 = (short) class51.field861[var6 + 1];
                                                                                        if (~class104.field2008 >= -1) {
                                                                                            class104.field2008 = 320;
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    if (~var451 == -6203) {
                                                                                        var6 -= 4;
                                                                                        class39.field654 = (short) class51.field861[var6];
                                                                                        if (~class39.field654 >= -1) {
                                                                                            class39.field654 = 1;
                                                                                        }
                                                                                        class191.field3500 = (short) class51.field861[var6 + 1];
                                                                                        if (~class191.field3500 < -1) {
                                                                                            if (~class39.field654 < ~class191.field3500) {
                                                                                                class191.field3500 = class39.field654;
                                                                                            }
                                                                                        } else {
                                                                                            class191.field3500 = 32767;
                                                                                        }
                                                                                        class74.field1390 = (short) class51.field861[var6 + 2];
                                                                                        if (class74.field1390 <= 0) {
                                                                                            class74.field1390 = 1;
                                                                                        }
                                                                                        class126.field2449 = (short) class51.field861[var6 - -3];
                                                                                        if (~class126.field2449 >= -1) {
                                                                                            class126.field2449 = 32767;
                                                                                        } else if (~class74.field1390 < ~class126.field2449) {
                                                                                            class126.field2449 = class74.field1390;
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    if (var451 == 6203) {
                                                                                        class71.method523(class137.field2646.field1183, false, class137.field2646.field1220, 0, 0, !arg2);
                                                                                        class51.field861[var6++] = class33.field506;
                                                                                        class51.field861[var6++] = class103.field1983;
                                                                                        continue;
                                                                                    }
                                                                                    if (var451 == 6204) {
                                                                                        class51.field861[var6++] = class222.field4047;
                                                                                        class51.field861[var6++] = class104.field2008;
                                                                                        continue;
                                                                                    }
                                                                                    if (var451 == 6205) {
                                                                                        class51.field861[var6++] = class213.field3892;
                                                                                        class51.field861[var6++] = class191.field3497;
                                                                                        continue;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                if (var451 == 6001) {
                                                                                    --var6;
                                                                                    int var301 = class51.field861[var6];
                                                                                    if (var301 < 1) {
                                                                                        var301 = 1;
                                                                                    }
                                                                                    if (var301 > 4) {
                                                                                        var301 = 4;
                                                                                    }
                                                                                    class211.field3824 = var301;
                                                                                    if (class211.field3824 == 1) {
                                                                                        class98.method781(0.9F);
                                                                                    }
                                                                                    if (~class211.field3824 == -3) {
                                                                                        class98.method781(0.8F);
                                                                                    }
                                                                                    if (class211.field3824 == 3) {
                                                                                        class98.method781(0.7F);
                                                                                    }
                                                                                    if (class211.field3824 == 4) {
                                                                                        class98.method781(0.6F);
                                                                                    }
                                                                                    class237.method1644(0);
                                                                                    class177.method1311(class169.field3090, (byte) 55);
                                                                                    class62.field1053 = false;
                                                                                    continue;
                                                                                }
                                                                                if (var451 == 6002) {
                                                                                    --var6;
                                                                                    class243.method1679(-1, ~class51.field861[var6] == -2);
                                                                                    class74.method543(0);
                                                                                    class197.method1419(-1024);
                                                                                    class182.method1337(false);
                                                                                    class177.method1311(class169.field3090, (byte) 55);
                                                                                    class62.field1053 = false;
                                                                                    continue;
                                                                                }
                                                                                if (var451 == 6003) {
                                                                                    --var6;
                                                                                    class73.field1368 = ~class51.field861[var6] == -2;
                                                                                    class182.method1337(arg2);
                                                                                    class177.method1311(class169.field3090, (byte) 55);
                                                                                    class62.field1053 = false;
                                                                                    continue;
                                                                                }
                                                                                if (var451 == 6005) {
                                                                                    --var6;
                                                                                    class119.field2247 = class51.field861[var6] == 1;
                                                                                    class197.method1419(-1024);
                                                                                    class177.method1311(class169.field3090, (byte) 55);
                                                                                    class62.field1053 = false;
                                                                                    continue;
                                                                                }
                                                                                if (~var451 == -6007) {
                                                                                    --var6;
                                                                                    class208.field3781 = class51.field861[var6] == 1;
                                                                                    ((class122) class98.field1852).method952(255, !class208.field3781);
                                                                                    class177.method1311(class169.field3090, (byte) 55);
                                                                                    class62.field1053 = false;
                                                                                    continue;
                                                                                }
                                                                                if (~var451 == -6008) {
                                                                                    --var6;
                                                                                    class210.field3801 = class51.field861[var6] == 1;
                                                                                    class177.method1311(class169.field3090, (byte) 55);
                                                                                    class62.field1053 = false;
                                                                                    continue;
                                                                                }
                                                                                if (var451 == 6008) {
                                                                                    --var6;
                                                                                    class126.field2438 = ~class51.field861[var6] == -2;
                                                                                    class177.method1311(class169.field3090, (byte) 55);
                                                                                    class62.field1053 = false;
                                                                                    continue;
                                                                                }
                                                                                if (~var451 == -6010) {
                                                                                    --var6;
                                                                                    class9.field154 = ~class51.field861[var6] == -2;
                                                                                    class177.method1311(class169.field3090, (byte) 55);
                                                                                    class62.field1053 = false;
                                                                                    continue;
                                                                                }
                                                                                if (~var451 == -6011) {
                                                                                    --var6;
                                                                                    client.field2006 = class51.field861[var6] == 1;
                                                                                    class177.method1311(class169.field3090, (byte) 55);
                                                                                    class62.field1053 = false;
                                                                                    continue;
                                                                                }
                                                                                if (var451 == 6011) {
                                                                                    --var6;
                                                                                    int var302 = class51.field861[var6];
                                                                                    if (var302 < 0 || var302 > 2) {
                                                                                        var302 = 0;
                                                                                    }
                                                                                    class22.field353 = var302;
                                                                                    class177.method1311(class169.field3090, (byte) 55);
                                                                                    class62.field1053 = false;
                                                                                    continue;
                                                                                }
                                                                                if (var451 == 6012) {
                                                                                    --var6;
                                                                                    class48.field804 = class51.field861[var6] == 1;
                                                                                    if (class211.field3824 == 1) {
                                                                                        class98.method781(0.9F);
                                                                                    }
                                                                                    if (~class211.field3824 == -3) {
                                                                                        class98.method781(0.8F);
                                                                                    }
                                                                                    if (class211.field3824 == 3) {
                                                                                        class98.method781(0.7F);
                                                                                    }
                                                                                    if (class211.field3824 == 4) {
                                                                                        class98.method781(0.6F);
                                                                                    }
                                                                                    class197.method1419(-1024);
                                                                                    class177.method1311(class169.field3090, (byte) 55);
                                                                                    class62.field1053 = false;
                                                                                    continue;
                                                                                }
                                                                                if (var451 == 6014) {
                                                                                    --var6;
                                                                                    class84.field1593 = class51.field861[var6] == 1;
                                                                                    class177.method1311(class169.field3090, (byte) 55);
                                                                                    class62.field1053 = false;
                                                                                    continue;
                                                                                }
                                                                                if (~var451 == -6016) {
                                                                                    --var6;
                                                                                    class88.field1633 = class51.field861[var6] == 1;
                                                                                    class177.method1311(class169.field3090, (byte) 55);
                                                                                    class62.field1053 = false;
                                                                                    continue;
                                                                                }
                                                                                if (var451 == 6016) {
                                                                                    --var6;
                                                                                    int var303 = class51.field861[var6];
                                                                                    if (var303 < 0 || var303 > 2) {
                                                                                        var303 = 0;
                                                                                    }
                                                                                    class103.field1975 = var303;
                                                                                    class177.method1311(class169.field3090, (byte) 55);
                                                                                    class62.field1053 = false;
                                                                                    continue;
                                                                                }
                                                                                if (~var451 == -6018) {
                                                                                    --var6;
                                                                                    class244.field4306 = class51.field861[var6] == 1;
                                                                                    class197.method1425((byte) 61);
                                                                                    class177.method1311(class169.field3090, (byte) 55);
                                                                                    class62.field1053 = false;
                                                                                    continue;
                                                                                }
                                                                                if (var451 == 6018) {
                                                                                    --var6;
                                                                                    int var304 = class51.field861[var6];
                                                                                    if (~var304 > -1) {
                                                                                        var304 = 0;
                                                                                    }
                                                                                    if (~var304 < -128) {
                                                                                        var304 = 127;
                                                                                    }
                                                                                    class215.field3928 = var304;
                                                                                    class177.method1311(class169.field3090, (byte) 55);
                                                                                    class62.field1053 = false;
                                                                                    continue;
                                                                                }
                                                                                if (var451 == 6019) {
                                                                                    --var6;
                                                                                    int var305 = class51.field861[var6];
                                                                                    if (var305 < 0) {
                                                                                        var305 = 0;
                                                                                    }
                                                                                    if (var305 > 255) {
                                                                                        var305 = 255;
                                                                                    }
                                                                                    if (class77.field1453 != var305) {
                                                                                        if (~class77.field1453 == -1 && ~client.field1987 != 0) {
                                                                                            class212.method1512((byte) -126, false, var305, 0, client.field1987, class59.field969);
                                                                                            class123.field2360 = false;
                                                                                        } else if (~var305 != -1) {
                                                                                            class168.method1258(0, var305);
                                                                                        } else {
                                                                                            class192.method1405(1);
                                                                                            class123.field2360 = false;
                                                                                        }
                                                                                        class77.field1453 = var305;
                                                                                    }
                                                                                    class177.method1311(class169.field3090, (byte) 55);
                                                                                    class62.field1053 = false;
                                                                                    continue;
                                                                                }
                                                                                if (var451 == 6020) {
                                                                                    --var6;
                                                                                    int var306 = class51.field861[var6];
                                                                                    if (~var306 > -1) {
                                                                                        var306 = 0;
                                                                                    }
                                                                                    if (~var306 < -128) {
                                                                                        var306 = 127;
                                                                                    }
                                                                                    class2.field46 = var306;
                                                                                    class177.method1311(class169.field3090, (byte) 55);
                                                                                    class62.field1053 = false;
                                                                                    continue;
                                                                                }
                                                                                if (~var451 == -6022) {
                                                                                    --var6;
                                                                                    class122.field2321 = class51.field861[var6] == 1;
                                                                                    class182.method1337(false);
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (var451 == 5400) {
                                                                                ++class265.field4606;
                                                                                var7 -= 2;
                                                                                class163 var307 = class89.field1645[var7 - -1];
                                                                                class163 var308 = class89.field1645[var7];
                                                                                --var6;
                                                                                int var309 = class51.field861[var6];
                                                                                class191.field3499.method75(96, 118);
                                                                                class191.field3499.method655(0, 1 + class54.method372(var308, -1) - -class54.method372(var307, -1));
                                                                                class191.field3499.method654(17048, var308);
                                                                                class191.field3499.method654(17048, var307);
                                                                                class191.field3499.method655(0, var309);
                                                                                continue;
                                                                            }
                                                                            if (var451 == 5401) {
                                                                                var6 -= 2;
                                                                                class58.field963[class51.field861[var6]] = (short) class106.method863(-193, class51.field861[var6 - -1]);
                                                                                client.method825(-72);
                                                                                class237.method1644(0);
                                                                                class96.method759((byte) 113);
                                                                                class197.method1424((byte) 86);
                                                                                class217.method1541(true);
                                                                                continue;
                                                                            }
                                                                            if (~var451 == -5406) {
                                                                                var6 -= 2;
                                                                                int var310 = class51.field861[var6 + 1];
                                                                                int var311 = class51.field861[var6];
                                                                                if (var311 >= 0 && var311 < 2) {
                                                                                    class262.field4575[var311] = new int[var310 << 1][4];
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (var451 == 5406) {
                                                                                var6 -= 7;
                                                                                int var312 = class51.field861[var6];
                                                                                int var313 = class51.field861[var6 + 1] << 1;
                                                                                int var314 = class51.field861[var6 + 4];
                                                                                int var315 = class51.field861[var6 - -5];
                                                                                int var316 = class51.field861[var6 + 2];
                                                                                int var317 = class51.field861[var6 + 3];
                                                                                int var318 = class51.field861[var6 + 6];
                                                                                if (var312 >= 0 && var312 < 2 && class262.field4575[var312] != null && var313 >= 0 && ~class262.field4575[var312].length < ~var313) {
                                                                                    class262.field4575[var312][var313] = new int[] { 128 * class7.method50(16383, var316 >> 14), var317, class7.method50(var316, 16383) * 128, var318 };
                                                                                    class262.field4575[var312][var313 + 1] = new int[] { (class7.method50(268432226, var314) >> 14) * 128, var315, 128 * class7.method50(var314, 16383) };
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (var451 == 5407) {
                                                                                --var6;
                                                                                int var319 = class262.field4575[class51.field861[var6]].length >> 1;
                                                                                class51.field861[var6++] = var319;
                                                                                continue;
                                                                            }
                                                                            if (~var451 == -5409) {
                                                                                class51.field861[var6++] = 0;
                                                                                continue;
                                                                            }
                                                                            if (~var451 == -5410) {
                                                                                class214.method1521(-64);
                                                                                continue;
                                                                            }
                                                                            if (var451 == 5411) {
                                                                                if (class45.field754 == null) {
                                                                                    class87.method684(class43.method325((byte) 103), false, true);
                                                                                } else {
                                                                                    System.exit(0);
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (var451 == 5419) {
                                                                                class163 var320 = class139.field2665;
                                                                                if (class7.field120 != null) {
                                                                                    var320 = class210.method1502(false, class7.field120.field3561);
                                                                                    try {
                                                                                        if (class7.field120.field3563 != null) {
                                                                                            byte[] var321 = ((String) class7.field120.field3563).getBytes("ISO-8859-1");
                                                                                            var320 = class129.method1025(var321.length, 77, 0, var321);
                                                                                        }
                                                                                    } catch (UnsupportedEncodingException var448) {
                                                                                    }
                                                                                }
                                                                                class89.field1645[var7++] = var320;
                                                                                continue;
                                                                            }
                                                                            if (~var451 == -5421) {
                                                                                class51.field861[var6++] = class29.field449 == 2 ? 1 : 0;
                                                                                continue;
                                                                            }
                                                                            if (~var451 == -5422) {
                                                                                --var7;
                                                                                class163 var322 = class89.field1645[var7];
                                                                                --var6;
                                                                                boolean var323 = ~class51.field861[var6] == -2;
                                                                                class87.method684(class145.method1101(0, new class163[] { class43.method325((byte) 127), var322 }), var323, true);
                                                                                continue;
                                                                            }
                                                                            if (~var451 == -5423) {
                                                                                var7 -= 2;
                                                                                class163 var324 = class89.field1645[var7 + 1];
                                                                                class163 var325 = class89.field1645[var7];
                                                                                --var6;
                                                                                int var326 = class51.field861[var6];
                                                                                if (~var325.method1221(-23096) < -1) {
                                                                                    if (class89.field1643 == null) {
                                                                                        class89.field1643 = new class163[class187.field3436[class137.field2651]];
                                                                                    }
                                                                                    class89.field1643[var326] = var325;
                                                                                }
                                                                                if (var324.method1221(-23096) > 0) {
                                                                                    if (class233.field4173 == null) {
                                                                                        class233.field4173 = new class163[class187.field3436[class137.field2651]];
                                                                                    }
                                                                                    class233.field4173[var326] = var324;
                                                                                }
                                                                                continue;
                                                                            }
                                                                        }
                                                                    } else if (var451 == 5304) {
                                                                        class51.field861[var6++] = 0;
                                                                        continue;
                                                                    }
                                                                } else if (var451 == 4500) {
                                                                    var6 -= 2;
                                                                    int var327 = class51.field861[var6];
                                                                    int var328 = class51.field861[var6 + 1];
                                                                    class54 var329 = class35.method249(var328, 11);
                                                                    if (var329.method379(115)) {
                                                                        class89.field1645[var7++] = class174.method1288(26, var327).method1385(var329.field897, (byte) -122, var328);
                                                                    } else {
                                                                        class51.field861[var6++] = class174.method1288(26, var327).method1386(var328, var329.field887, false);
                                                                    }
                                                                    continue;
                                                                }
                                                            } else if (var451 == 4300) {
                                                                var6 -= 2;
                                                                int var330 = class51.field861[var6];
                                                                int var331 = class51.field861[var6 + 1];
                                                                class54 var332 = class35.method249(var331, 11);
                                                                if (!var332.method379(115)) {
                                                                    class51.field861[var6++] = class220.method1556(var330, true).method1329(true, var331, var332.field887);
                                                                } else {
                                                                    class89.field1645[var7++] = class220.method1556(var330, true).method1321(var332.field897, var331, (byte) 79);
                                                                }
                                                                continue;
                                                            }
                                                        } else {
                                                            if (var451 == 4100) {
                                                                --var7;
                                                                class163 var333 = class89.field1645[var7];
                                                                --var6;
                                                                int var334 = class51.field861[var6];
                                                                class89.field1645[var7++] = class145.method1101(0, new class163[] { var333, class136.method1061(var334, (byte) 116) });
                                                                continue;
                                                            }
                                                            if (var451 == 4101) {
                                                                var7 -= 2;
                                                                class163 var335 = class89.field1645[var7 + 1];
                                                                class163 var336 = class89.field1645[var7];
                                                                class89.field1645[var7++] = class145.method1101(0, new class163[] { var336, var335 });
                                                                continue;
                                                            }
                                                            if (var451 == 4102) {
                                                                --var7;
                                                                class163 var337 = class89.field1645[var7];
                                                                --var6;
                                                                int var338 = class51.field861[var6];
                                                                class89.field1645[var7++] = class145.method1101(0, new class163[] { var337, class248.method1705(var338, false, true) });
                                                                continue;
                                                            }
                                                            if (var451 == 4103) {
                                                                --var7;
                                                                class163 var339 = class89.field1645[var7];
                                                                class89.field1645[var7++] = var339.method1205(33);
                                                                continue;
                                                            }
                                                            if (var451 == 4104) {
                                                                --var6;
                                                                int var340 = class51.field861[var6];
                                                                long var341 = ((long) var340 + 11745L) * 86400000L;
                                                                class134.field2589.setTime(new Date(var341));
                                                                int var343 = class134.field2589.get(5);
                                                                int var344 = class134.field2589.get(2);
                                                                int var345 = class134.field2589.get(1);
                                                                class89.field1645[var7++] = class145.method1101(0, new class163[] { class136.method1061(var343, (byte) 123), class153.field2875, class117.field2233[var344], class153.field2875, class136.method1061(var345, (byte) 111) });
                                                                continue;
                                                            }
                                                            if (var451 == 4105) {
                                                                var7 -= 2;
                                                                class163 var346 = class89.field1645[var7 + 1];
                                                                class163 var347 = class89.field1645[var7];
                                                                if (class235.field4203.field2444 != null && class235.field4203.field2444.field3337) {
                                                                    class89.field1645[var7++] = var346;
                                                                    continue;
                                                                }
                                                                class89.field1645[var7++] = var347;
                                                                continue;
                                                            }
                                                            if (var451 == 4106) {
                                                                --var6;
                                                                int var348 = class51.field861[var6];
                                                                class89.field1645[var7++] = class136.method1061(var348, (byte) 123);
                                                                continue;
                                                            }
                                                            if (var451 == 4107) {
                                                                var7 -= 2;
                                                                class51.field861[var6++] = class89.field1645[var7].method1225(class89.field1645[var7 + 1], 1);
                                                                continue;
                                                            }
                                                            if (var451 == 4108) {
                                                                var6 -= 2;
                                                                int var349 = class51.field861[var6];
                                                                --var7;
                                                                class163 var350 = class89.field1645[var7];
                                                                int var351 = class51.field861[var6 - -1];
                                                                byte[] var352 = class28.field426.method973(var351, !arg2, 0);
                                                                class184 var353 = new class184(var352);
                                                                var353.method590(class72.field1354, (int[]) null);
                                                                class51.field861[var6++] = var353.method587(var350, var349);
                                                                continue;
                                                            }
                                                            if (var451 == 4109) {
                                                                var6 -= 2;
                                                                --var7;
                                                                class163 var354 = class89.field1645[var7];
                                                                int var355 = class51.field861[var6];
                                                                int var356 = class51.field861[var6 - -1];
                                                                byte[] var357 = class28.field426.method973(var356, true, 0);
                                                                class184 var358 = new class184(var357);
                                                                var358.method590(class72.field1354, (int[]) null);
                                                                class51.field861[var6++] = var358.method580(var354, var355);
                                                                continue;
                                                            }
                                                            if (~var451 == -4111) {
                                                                var7 -= 2;
                                                                class163 var359 = class89.field1645[var7];
                                                                class163 var360 = class89.field1645[var7 + 1];
                                                                --var6;
                                                                if (~class51.field861[var6] != -2) {
                                                                    class89.field1645[var7++] = var360;
                                                                } else {
                                                                    class89.field1645[var7++] = var359;
                                                                }
                                                                continue;
                                                            }
                                                            if (var451 == 4111) {
                                                                --var7;
                                                                class163 var361 = class89.field1645[var7];
                                                                class89.field1645[var7++] = class79.method582(var361);
                                                                continue;
                                                            }
                                                            if (var451 == 4112) {
                                                                --var7;
                                                                class163 var362 = class89.field1645[var7];
                                                                --var6;
                                                                int var363 = class51.field861[var6];
                                                                if (var363 == -1) {
                                                                    throw new RuntimeException("null char");
                                                                }
                                                                class89.field1645[var7++] = var362.method1191(var363, 36);
                                                                continue;
                                                            }
                                                            if (var451 == 4113) {
                                                                --var6;
                                                                int var364 = class51.field861[var6];
                                                                class51.field861[var6++] = !class29.method180((byte) -72, var364) ? 0 : 1;
                                                                continue;
                                                            }
                                                            if (~var451 == -4115) {
                                                                --var6;
                                                                int var365 = class51.field861[var6];
                                                                class51.field861[var6++] = !class197.method1422(var365, 35) ? 0 : 1;
                                                                continue;
                                                            }
                                                            if (var451 == 4115) {
                                                                --var6;
                                                                int var366 = class51.field861[var6];
                                                                class51.field861[var6++] = class245.method1689(var366, (byte) -108) ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (var451 == 4116) {
                                                                --var6;
                                                                int var367 = class51.field861[var6];
                                                                class51.field861[var6++] = class85.method680(var367, 14213) ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (~var451 == -4118) {
                                                                --var7;
                                                                class163 var368 = class89.field1645[var7];
                                                                if (var368 != null) {
                                                                    class51.field861[var6++] = var368.method1221(-23096);
                                                                } else {
                                                                    class51.field861[var6++] = 0;
                                                                }
                                                                continue;
                                                            }
                                                            if (var451 == 4118) {
                                                                var6 -= 2;
                                                                --var7;
                                                                class163 var369 = class89.field1645[var7];
                                                                int var370 = class51.field861[var6];
                                                                int var371 = class51.field861[var6 + 1];
                                                                class89.field1645[var7++] = var369.method1188(true, var371, var370);
                                                                continue;
                                                            }
                                                            if (var451 == 4119) {
                                                                --var7;
                                                                class163 var372 = class89.field1645[var7];
                                                                boolean var373 = false;
                                                                class163 var374 = class187.method1383((byte) -122, var372.method1221(-23096));
                                                                for (int var375 = 0; ~var375 > ~var372.method1221(-23096); ++var375) {
                                                                    int var376 = var372.method1213(0, var375);
                                                                    if (~var376 == -61) {
                                                                        var373 = true;
                                                                    } else if (~var376 != -63) {
                                                                        if (!var373) {
                                                                            var374.method1227((byte) 111, var376);
                                                                        }
                                                                    } else {
                                                                        var373 = false;
                                                                    }
                                                                }
                                                                var374.method1187((byte) -100);
                                                                class89.field1645[var7++] = var374;
                                                                continue;
                                                            }
                                                            if (var451 == 4120) {
                                                                --var7;
                                                                class163 var377 = class89.field1645[var7];
                                                                var6 -= 2;
                                                                int var378 = class51.field861[var6];
                                                                int var379 = class51.field861[var6 + 1];
                                                                class51.field861[var6++] = var377.method1211(var379, var378, (byte) -104);
                                                                continue;
                                                            }
                                                            if (~var451 == -4122) {
                                                                var7 -= 2;
                                                                class163 var380 = class89.field1645[var7];
                                                                class163 var381 = class89.field1645[var7 + 1];
                                                                --var6;
                                                                int var382 = class51.field861[var6];
                                                                class51.field861[var6++] = var380.method1209((byte) -120, var382, var381);
                                                                continue;
                                                            }
                                                            if (var451 == 4122) {
                                                                --var6;
                                                                int var383 = class51.field861[var6];
                                                                class51.field861[var6++] = class246.method1693(-118, var383);
                                                                continue;
                                                            }
                                                            if (~var451 == -4124) {
                                                                --var6;
                                                                int var384 = class51.field861[var6];
                                                                class51.field861[var6++] = class216.method1536(var384, -51);
                                                                continue;
                                                            }
                                                        }
                                                    } else {
                                                        if (~var451 == -3401) {
                                                            var6 -= 2;
                                                            int var385 = class51.field861[var6];
                                                            int var386 = class51.field861[var6 + 1];
                                                            class157 var387 = class123.method964(!arg2, var385);
                                                            class89.field1645[var7++] = var387.method1155((byte) 124, var386);
                                                            continue;
                                                        }
                                                        if (var451 == 3408) {
                                                            var6 -= 4;
                                                            int var388 = class51.field861[var6];
                                                            int var389 = class51.field861[var6 + 1];
                                                            int var390 = class51.field861[var6 + 2];
                                                            int var391 = class51.field861[var6 + 3];
                                                            class157 var392 = class123.method964(true, var390);
                                                            if (var392.field2905 == var388 && var392.field2899 == var389) {
                                                                if (~var389 == -116) {
                                                                    class89.field1645[var7++] = var392.method1155((byte) 124, var391);
                                                                } else {
                                                                    class51.field861[var6++] = var392.method1154((byte) 125, var391);
                                                                }
                                                                continue;
                                                            }
                                                            throw new RuntimeException("C3408-1");
                                                        }
                                                        if (var451 == 3409) {
                                                            var6 -= 3;
                                                            int var393 = class51.field861[var6];
                                                            int var394 = class51.field861[var6 + 1];
                                                            int var395 = class51.field861[var6 - -2];
                                                            class157 var396 = class123.method964(true, var394);
                                                            if (var396.field2899 != var393) {
                                                                throw new RuntimeException("C3409-1");
                                                            }
                                                            class51.field861[var6++] = var396.method1158(var395, 32605) ? 1 : 0;
                                                            continue;
                                                        }
                                                        if (~var451 == -3411) {
                                                            --var7;
                                                            class163 var397 = class89.field1645[var7];
                                                            --var6;
                                                            int var398 = class51.field861[var6];
                                                            class157 var399 = class123.method964(true, var398);
                                                            if (var399.field2899 != 115) {
                                                                throw new RuntimeException("C3410-1");
                                                            }
                                                            class51.field861[var6++] = var399.method1162(var397, 0) ? 1 : 0;
                                                            continue;
                                                        }
                                                    }
                                                } else {
                                                    if (var451 == 3100) {
                                                        --var7;
                                                        class163 var400 = class89.field1645[var7];
                                                        class56.method396(var400, 121, class139.field2665, 0);
                                                        continue;
                                                    }
                                                    if (var451 == 3101) {
                                                        var6 -= 2;
                                                        class100.method811(-1, class51.field861[var6], class235.field4203, class51.field861[var6 - -1]);
                                                        continue;
                                                    }
                                                    if (var451 == 3103) {
                                                        class175.method1302(3);
                                                        continue;
                                                    }
                                                    if (var451 == 3104) {
                                                        int var401 = 0;
                                                        ++class76.field1422;
                                                        --var7;
                                                        class163 var402 = class89.field1645[var7];
                                                        if (var402.method1206(-29422)) {
                                                            var401 = var402.method1207((byte) 108);
                                                        }
                                                        class191.field3499.method75(201, 27);
                                                        class191.field3499.method604(var401, 1543219568);
                                                        continue;
                                                    }
                                                    if (var451 == 3105) {
                                                        ++class258.field4521;
                                                        --var7;
                                                        class163 var403 = class89.field1645[var7];
                                                        class191.field3499.method75(225, 25);
                                                        class191.field3499.method651(-645765520, var403.method1193((byte) 52));
                                                        continue;
                                                    }
                                                    if (~var451 == -3107) {
                                                        ++class91.field1665;
                                                        --var7;
                                                        class163 var404 = class89.field1645[var7];
                                                        class191.field3499.method75(243, 124);
                                                        class191.field3499.method655(0, var404.method1221(-23096) + 1);
                                                        class191.field3499.method654(17048, var404);
                                                        continue;
                                                    }
                                                    if (var451 == 3107) {
                                                        --var6;
                                                        int var405 = class51.field861[var6];
                                                        --var7;
                                                        class163 var406 = class89.field1645[var7];
                                                        class31.method189(var405, (byte) 20, var406);
                                                        continue;
                                                    }
                                                    if (var451 == 3108) {
                                                        var6 -= 3;
                                                        int var407 = class51.field861[var6 - -1];
                                                        int var408 = class51.field861[var6 + 2];
                                                        int var409 = class51.field861[var6];
                                                        class69 var410 = class124.method989((byte) 126, var408);
                                                        class94.method752(true, var407, var409, var410);
                                                        continue;
                                                    }
                                                    if (~var451 == -3110) {
                                                        var6 -= 2;
                                                        int var411 = class51.field861[var6 + 1];
                                                        int var412 = class51.field861[var6];
                                                        class69 var413 = var46 ? class160.field2944 : class180.field3261;
                                                        class94.method752(true, var411, var412, var413);
                                                        continue;
                                                    }
                                                    if (var451 == 3110) {
                                                        --var6;
                                                        int var414 = class51.field861[var6];
                                                        class191.field3499.method75(223, 30);
                                                        ++class94.field1774;
                                                        class191.field3499.method631(var414, -1);
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                --var6;
                                                class69 var415 = class124.method989((byte) 125, class51.field861[var6]);
                                                if (var451 == 2800) {
                                                    class51.field861[var6++] = class100.method807(4096, client.method826(var415));
                                                    continue;
                                                }
                                                if (var451 == 2801) {
                                                    --var6;
                                                    int var416 = class51.field861[var6];
                                                    int var452 = var416 - 1;
                                                    if (var415.field1296 != null && ~var415.field1296.length < ~var452 && var415.field1296[var452] != null) {
                                                        class89.field1645[var7++] = var415.field1296[var452];
                                                        continue;
                                                    }
                                                    class89.field1645[var7++] = class139.field2665;
                                                    continue;
                                                }
                                                if (~var451 == -2803) {
                                                    if (var415.field1290 == null) {
                                                        class89.field1645[var7++] = class139.field2665;
                                                    } else {
                                                        class89.field1645[var7++] = var415.field1290;
                                                    }
                                                    continue;
                                                }
                                            }
                                        } else {
                                            class69 var417 = var46 ? class160.field2944 : class180.field3261;
                                            if (var451 == 1800) {
                                                class51.field861[var6++] = class100.method807(4096, client.method826(var417));
                                                continue;
                                            }
                                            if (~var451 == -1802) {
                                                --var6;
                                                int var418 = class51.field861[var6];
                                                int var453 = var418 - 1;
                                                if (var417.field1296 != null && var453 < var417.field1296.length && var417.field1296[var453] != null) {
                                                    class89.field1645[var7++] = var417.field1296[var453];
                                                    continue;
                                                }
                                                class89.field1645[var7++] = class139.field2665;
                                                continue;
                                            }
                                            if (~var451 == -1803) {
                                                if (var417.field1290 != null) {
                                                    class89.field1645[var7++] = var417.field1290;
                                                } else {
                                                    class89.field1645[var7++] = class139.field2665;
                                                }
                                                continue;
                                            }
                                        }
                                    } else {
                                        class69 var419 = !var46 ? class180.field3261 : class160.field2944;
                                        if (var451 == 1700) {
                                            class51.field861[var6++] = var419.field1177;
                                            continue;
                                        }
                                        if (var451 == 1701) {
                                            if (~var419.field1177 != 0) {
                                                class51.field861[var6++] = var419.field1226;
                                            } else {
                                                class51.field861[var6++] = 0;
                                            }
                                            continue;
                                        }
                                        if (~var451 == -1703) {
                                            class51.field861[var6++] = var419.field1205;
                                            continue;
                                        }
                                    }
                                } else {
                                    class69 var420;
                                    if (~var451 <= -2001) {
                                        --var6;
                                        var420 = class124.method989((byte) 122, class51.field861[var6]);
                                        var451 -= 1000;
                                    } else {
                                        var420 = !var46 ? class180.field3261 : class160.field2944;
                                    }
                                    if (var451 == 1300) {
                                        --var6;
                                        int var421 = -1 + class51.field861[var6];
                                        if (var421 >= 0 && var421 <= 9) {
                                            --var7;
                                            var420.method484(class89.field1645[var7], -1, var421);
                                            continue;
                                        }
                                        --var7;
                                        continue;
                                    }
                                    if (~var451 == -1302) {
                                        var6 -= 2;
                                        int var422 = class51.field861[var6];
                                        int var423 = class51.field861[var6 - -1];
                                        var420.field1158 = class137.method1062(var423, 1, var422);
                                        continue;
                                    }
                                    if (var451 == 1302) {
                                        --var6;
                                        var420.field1251 = class51.field861[var6] == 1;
                                        continue;
                                    }
                                    if (var451 == 1303) {
                                        --var6;
                                        var420.field1275 = class51.field861[var6];
                                        continue;
                                    }
                                    if (var451 == 1304) {
                                        --var6;
                                        var420.field1242 = class51.field861[var6];
                                        continue;
                                    }
                                    if (var451 == 1305) {
                                        --var7;
                                        var420.field1290 = class89.field1645[var7];
                                        continue;
                                    }
                                    if (~var451 == -1307) {
                                        --var7;
                                        var420.field1206 = class89.field1645[var7];
                                        continue;
                                    }
                                    if (var451 == 1307) {
                                        var420.field1296 = null;
                                        continue;
                                    }
                                }
                            } else {
                                class69 var56;
                                if (var451 >= 2000) {
                                    var451 -= 1000;
                                    --var6;
                                    var56 = class124.method989((byte) 111, class51.field861[var6]);
                                } else {
                                    var56 = !var46 ? class180.field3261 : class160.field2944;
                                }
                                class213.method1517((byte) 11, var56);
                                if (var451 == 1200 || var451 == 1205) {
                                    var6 -= 2;
                                    int var57 = class51.field861[var6 - -1];
                                    int var58 = class51.field861[var6];
                                    if (~var58 == 0) {
                                        var56.field1245 = -1;
                                        var56.field1208 = 1;
                                        var56.field1177 = -1;
                                    } else {
                                        var56.field1177 = var58;
                                        var56.field1226 = var57;
                                        class99 var59 = class120.method939(22952, var58);
                                        if (var451 != 1205) {
                                            var56.field1270 = true;
                                        } else {
                                            var56.field1270 = false;
                                        }
                                        var56.field1193 = var59.field1918;
                                        var56.field1202 = var59.field1904;
                                        var56.field1327 = var59.field1926;
                                        var56.field1227 = var59.field1868;
                                        var56.field1234 = var59.field1925;
                                        if (var56.field1189 <= 0) {
                                            if (~var56.field1320 < -1) {
                                                var56.field1234 = var56.field1234 * 32 / var56.field1320;
                                            }
                                        } else {
                                            var56.field1234 = var56.field1234 * 32 / var56.field1189;
                                        }
                                        var56.field1310 = var59.field1889;
                                    }
                                    continue;
                                }
                                if (var451 == 1201) {
                                    var56.field1208 = 2;
                                    --var6;
                                    var56.field1245 = class51.field861[var6];
                                    continue;
                                }
                                if (~var451 == -1203) {
                                    var56.field1208 = 3;
                                    var56.field1245 = class235.field4203.field2444.method1346(false);
                                    continue;
                                }
                                if (~var451 == -1204) {
                                    var56.field1208 = 6;
                                    --var6;
                                    var56.field1245 = class51.field861[var6];
                                    continue;
                                }
                                if (var451 == 1204) {
                                    var56.field1208 = 5;
                                    --var6;
                                    var56.field1245 = class51.field861[var6];
                                    continue;
                                }
                            }
                        } else {
                            if (~var451 == -101) {
                                var6 -= 3;
                                int var429 = class51.field861[var6];
                                int var430 = class51.field861[var6 + 1];
                                int var431 = class51.field861[var6 - -2];
                                if (var430 == 0) {
                                    throw new RuntimeException();
                                }
                                class69 var432 = class124.method989((byte) 125, var429);
                                if (var432.field1291 == null) {
                                    var432.field1291 = new class69[var431 - -1];
                                }
                                if (var431 >= var432.field1291.length) {
                                    class69[] var433 = new class69[var431 + 1];
                                    for (int var434 = 0; ~var432.field1291.length < ~var434; ++var434) {
                                        var433[var434] = var432.field1291[var434];
                                    }
                                    var432.field1291 = var433;
                                }
                                if (~var431 < -1 && var432.field1291[var431 - 1] == null) {
                                    throw new RuntimeException("Gap at:" + (var431 + -1));
                                }
                                class69 var435 = new class69();
                                var435.field1302 = var435.field1188 = var432.field1188;
                                var435.field1240 = true;
                                var435.field1294 = var430;
                                var435.field1205 = var431;
                                var432.field1291[var431] = var435;
                                if (!var46) {
                                    class180.field3261 = var435;
                                } else {
                                    class160.field2944 = var435;
                                }
                                class213.method1517((byte) 11, var432);
                                continue;
                            }
                            if (~var451 == -102) {
                                class69 var436 = !var46 ? class180.field3261 : class160.field2944;
                                if (~var436.field1205 == 0) {
                                    if (var46) {
                                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                                    }
                                    throw new RuntimeException("Tried to cc_delete static active-component!");
                                }
                                class69 var437 = class124.method989((byte) 127, var436.field1188);
                                var437.field1291[var436.field1205] = null;
                                class213.method1517((byte) 11, var437);
                                continue;
                            }
                            if (~var451 == -103) {
                                --var6;
                                class69 var438 = class124.method989((byte) 111, class51.field861[var6]);
                                var438.field1291 = null;
                                class213.method1517((byte) 11, var438);
                                continue;
                            }
                            if (~var451 == -201) {
                                var6 -= 2;
                                int var439 = class51.field861[var6];
                                int var440 = class51.field861[var6 + 1];
                                class69 var441 = class137.method1062(var440, 1, var439);
                                if (var441 != null && ~var440 != 0) {
                                    class51.field861[var6++] = 1;
                                    if (var46) {
                                        class160.field2944 = var441;
                                    } else {
                                        class180.field3261 = var441;
                                    }
                                    continue;
                                }
                                class51.field861[var6++] = 0;
                                continue;
                            }
                            if (var451 == 201) {
                                --var6;
                                int var442 = class51.field861[var6];
                                class69 var443 = class124.method989((byte) 110, var442);
                                if (var443 != null) {
                                    class51.field861[var6++] = 1;
                                    if (!var46) {
                                        class180.field3261 = var443;
                                    } else {
                                        class160.field2944 = var443;
                                    }
                                } else {
                                    class51.field861[var6++] = 0;
                                }
                                continue;
                            }
                        }
                        throw new IllegalStateException();
                    }
                }
            } catch (Exception var450) {
                if (var5.field2140 == null) {
                    if (~class147.field2794 != -1) {
                        class56.method396(class19.field292, 104, class139.field2665, 0);
                    }
                    class107.method865(-122, var450, "CS2 - scr:" + var5.field2641 + " op:" + var11);
                } else {
                    class163 var445 = class187.method1383((byte) -116, 30);
                    var445.method1231(class161.field2955, -40).method1231(var5.field2140, -107);
                    for (int var446 = class265.field4597 - 1; var446 >= 0; --var446) {
                        var445.method1231(class129.field2507, -111).method1231(class235.field4202[var446].field3237.field2140, -128);
                    }
                    if (~var11 == -41) {
                        int var447 = var10[var9];
                        var445.method1231(class144.field2716, -105).method1231(class136.method1061(var447, (byte) 121), -64);
                    }
                    if (class147.field2794 != 0) {
                        class56.method396(class145.method1101(0, new class163[] { class13.field209, var5.field2140 }), 125, class139.field2665, 0);
                    }
                    class107.method865(-111, var450, "CS2 - scr:" + var5.field2641 + " op:" + var11 + new String(var445.method1202(4639)));
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class49() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "(I)V")
    public static void method353(int arg0) {
        field824 = null;
        field834 = null;
        if (arg0 != -4010) {
            method351((byte) 18, false);
        }
        field825 = null;
        field833 = null;
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(B)V")
    public final void method57(byte arg0) {
        ++field813;
        this.method347(2);
        if (arg0 >= -92) {
            this.method347(-44);
        }
    }
}
