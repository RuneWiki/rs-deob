import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class113 extends class8 {

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "[S")
    private short[] field1879 = new short[257];

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
    private int field1882 = 0;

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "I")
    public static int field1876 = 0;

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "Ljava/lang/String;")
    public static String field1886 = "red:";

    @OriginalMember(owner = "client!mj", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field1890 = "glow3:";

    @OriginalMember(owner = "client!mj", name = "bb", descriptor = "[I")
    public static int[] field1892 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!mj", name = "cb", descriptor = "[Ljava/lang/String;")
    public static String[] field1893 = new String[500];

    @OriginalMember(owner = "client!mj", name = "db", descriptor = "Lvj;")
    public static class115 field1894 = new class115();

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!mj", name = "ab", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "Lf;")
    public static class36 field1887;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "[I")
    private int[] field1881;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "[I")
    private int[] field1883;

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "[[I")
    private int[][] field1885;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(Z)V")
    public final void method66(boolean arg0) {
        if (arg0) {
            field1894 = null;
        }
        ++field1884;
        if (this.field1885 == null) {
            this.field1885 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field1885.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field1882 == 2) {
                this.method829(1);
            }
            class78.method547(14764);
            this.method831(-22038);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method828(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1873;
        class7.field80 = 0;
        for (int var7 = -1; class155.field2514 + class141.field2287 > var7; ++var7) {
            class207 var23;
            if (~var7 == 0) {
                var23 = class167.field2655;
            } else if (class155.field2514 > var7) {
                var23 = class35.field548[class57.field973[var7]];
            } else {
                var23 = class137.field2260[class221.field3648[-class155.field2514 + var7]];
            }
            if (var23 != null && var23.method118((byte) 125)) {
                if (var23 instanceof class15) {
                    class107 var24 = ((class15) var23).field258;
                    if (var24.field1716 != null) {
                        var24 = var24.method775(false);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (~var7 <= ~class155.field2514) {
                    class107 var25 = ((class15) var23).field258;
                    if (var25.field1716 != null) {
                        var25 = var25.method775(false);
                    }
                    if (~var25.field1708 <= -1 && var25.field1708 < class129.field2092.length) {
                        int var26;
                        if (var25.field1733 == -1) {
                            var26 = 15 + var23.method1432(arg4 ^ -17442);
                        } else {
                            var26 = var25.field1733 + 15;
                        }
                        class247.method1692(arg5 >> 1, (byte) 102, arg6, var23, arg2, arg3 >> 1, var26);
                        if (class133.field2124 > -1) {
                            class129.field2092[var25.field1708].method332(class133.field2124 + arg0 - 12, class233.field3814 + arg1 + -30);
                        }
                    }
                    class60[] var27 = class156.field2539;
                    for (int var28 = 0; var28 < var27.length; ++var28) {
                        class60 var29 = var27[var28];
                        if (var29 != null && ~var29.field981 == -2 && ~class221.field3648[var7 - class155.field2514] == ~var29.field994 && ~(class222.field3682 % 20) > -11) {
                            int var30;
                            if (var25.field1733 == -1) {
                                var30 = var23.method1432(-17442) + 15;
                            } else {
                                var30 = var25.field1733 + 15;
                            }
                            class247.method1692(arg5 >> 1, (byte) 123, arg6, var23, arg2, arg3 >> 1, var30);
                            if (~class133.field2124 < 0) {
                                class278.field4377[var29.field988].method332(class133.field2124 + arg0 + -12, arg1 - 28 + class233.field3814);
                            }
                        }
                    }
                } else {
                    int var31 = 30;
                    class33 var32 = (class33) var23;
                    if (var32.field526 != -1 || var32.field531 != -1) {
                        class247.method1692(arg5 >> 1, (byte) 89, arg6, var23, arg2, arg3 >> 1, var23.method1432(arg4 + -17442) - -15);
                        if (class133.field2124 > -1) {
                            if (~var32.field526 != 0) {
                                class115.field1916[var32.field526].method332(class133.field2124 + -12 + arg0, arg1 - -class233.field3814 - var31);
                                var31 += 25;
                            }
                            if (var32.field531 != -1) {
                                class129.field2092[var32.field531].method332(class133.field2124 + -12 + arg0, -var31 + arg1 + class233.field3814);
                                var31 += 25;
                            }
                        }
                    }
                    if (~var7 <= -1) {
                        class60[] var33 = class156.field2539;
                        for (int var34 = 0; var34 < var33.length; ++var34) {
                            class60 var35 = var33[var34];
                            if (var35 != null && var35.field981 == 10 && class57.field973[var7] == var35.field994) {
                                class247.method1692(arg5 >> 1, (byte) -39, arg6, var23, arg2, arg3 >> 1, 15 + var23.method1432(-17442));
                                if (~class133.field2124 < 0) {
                                    class278.field4377[var35.field988].method332(class133.field2124 + arg0 + -12, arg1 - (-class233.field3814 - -var31));
                                }
                            }
                        }
                    }
                }
                if (var23.field3401 != null && (var7 >= class155.field2514 || class154.field2483 == 0 || ~class154.field2483 == -4 || class154.field2483 == 1 && class133.method936(2513, ((class33) var23).field525))) {
                    class247.method1692(arg5 >> 1, (byte) -33, arg6, var23, arg2, arg3 >> 1, var23.method1432(-17442));
                    if (class133.field2124 > -1 && class220.field3600 > class7.field80) {
                        class220.field3596[class7.field80] = class262.field4165.method1822(var23.field3401) / 2;
                        class220.field3604[class7.field80] = class262.field4165.field4233;
                        class220.field3594[class7.field80] = class133.field2124;
                        class220.field3607[class7.field80] = class233.field3814;
                        class220.field3598[class7.field80] = var23.field3395;
                        class220.field3602[class7.field80] = var23.field3343;
                        class220.field3597[class7.field80] = var23.field3403;
                        class220.field3608[class7.field80] = var23.field3401;
                        ++class7.field80;
                    }
                }
                if (~var23.field3390 < ~class222.field3682) {
                    class238 var36 = class257.field4098[0];
                    class238 var37 = class257.field4098[1];
                    int var38;
                    if (!(var23 instanceof class15)) {
                        var38 = var23.method1432(-17442);
                    } else {
                        class15 var39 = (class15) var23;
                        class238[] var40 = (class238[]) class70.field1158.method480((long) var39.field258.field1735, arg4 ^ 94);
                        if (var40 == null) {
                            var40 = class146.method999(var39.field258.field1735, class222.field3687, -12640, 0);
                            if (var40 != null) {
                                class70.field1158.method474((long) var39.field258.field1735, (byte) 46, var40);
                            }
                        }
                        class107 var41 = var39.field258;
                        if (var40 != null && var40.length == 2) {
                            var37 = var40[1];
                            var36 = var40[0];
                        }
                        if (~var41.field1733 == 0) {
                            var38 = var23.method1432(arg4 ^ -17442);
                        } else {
                            var38 = var41.field1733;
                        }
                    }
                    class247.method1692(arg5 >> 1, (byte) 108, arg6, var23, arg2, arg3 >> 1, var38 - -var36.field3864 + 10);
                    if (~class133.field2124 < 0) {
                        int var42 = class233.field3814 + -3 + arg1;
                        int var43 = class133.field2124 + arg0 + -(var36.field3873 >> 1);
                        var36.method332(var43, var42);
                        int var44 = var36.field3864;
                        int var45 = var23.field3345 * var36.field3873 / 255;
                        class2.method30(var43, var42, var43 + var45, var42 + var44);
                        var37.method332(var43, var42);
                        class2.method28(arg0, arg1, arg0 + arg3, arg1 + arg5);
                    }
                }
                for (int var46 = 0; var46 < 4; ++var46) {
                    if (class222.field3682 < var23.field3367[var46]) {
                        int var49;
                        if (var23 instanceof class15) {
                            class15 var47 = (class15) var23;
                            class107 var48 = var47.field258;
                            if (var48.field1733 != -1) {
                                var49 = var48.field1733 / 2;
                            } else {
                                var49 = var23.method1432(-17442) / 2;
                            }
                        } else {
                            var49 = var23.method1432(arg4 + -17442) / 2;
                        }
                        class247.method1692(arg5 >> 1, (byte) 92, arg6, var23, arg2, arg3 >> 1, var49);
                        if (class133.field2124 > -1) {
                            if (var46 == 1) {
                                class233.field3814 -= 20;
                            }
                            if (~var46 == -3) {
                                class233.field3814 -= 10;
                                class133.field2124 -= 15;
                            }
                            if (var46 == 3) {
                                class133.field2124 += 15;
                                class233.field3814 -= 10;
                            }
                            class7.field87[var23.field3335[var46]].method332(class133.field2124 + arg0 + -12, class233.field3814 + arg1 + -12);
                            class158.field2555.method1797(Integer.toString(var23.field3353[var46]), class133.field2124 + arg0 + -1, arg1 - -class233.field3814 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var8 = arg4; class7.field80 > var8; ++var8) {
            int var9 = class220.field3596[var8];
            int var10 = class220.field3594[var8];
            int var11 = class220.field3604[var8];
            int var12 = class220.field3607[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; var8 > var22; ++var22) {
                    if (~(var12 + 2) < ~(class220.field3607[var22] + -class220.field3604[var22]) && class220.field3607[var22] + 2 > -var11 + var12 && -var9 + var10 < class220.field3596[var22] + class220.field3594[var22] && class220.field3594[var22] + -class220.field3596[var22] < var9 + var10 && ~var12 < ~(class220.field3607[var22] + -class220.field3604[var22])) {
                        var12 = class220.field3607[var22] + -class220.field3604[var22];
                        var13 = true;
                    }
                }
            }
            class133.field2124 = class220.field3594[var8];
            class233.field3814 = class220.field3607[var8] = var12;
            String var14 = class220.field3608[var8];
            if (class5.field65 == 0) {
                int var15 = 16776960;
                if (~class220.field3598[var8] > -7) {
                    var15 = class47.field848[class220.field3598[var8]];
                }
                if (class220.field3598[var8] == 6) {
                    var15 = class209.field3423 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class220.field3598[var8] == 7) {
                    var15 = ~(class209.field3423 % 20) <= -11 ? 65535 : 255;
                }
                if (class220.field3598[var8] == 8) {
                    var15 = ~(class209.field3423 % 20) > -11 ? 45056 : 8454016;
                }
                if (class220.field3598[var8] == 9) {
                    int var16 = -class220.field3597[var8] + 150;
                    if (~var16 <= -51) {
                        if (~var16 > -101) {
                            var15 = -((var16 - 50) * 327680) + 16776960;
                        } else if (var16 < 150) {
                            var15 = 64780 - -(var16 * 5);
                        }
                    } else {
                        var15 = var16 * 1280 + 16711680;
                    }
                }
                if (~class220.field3598[var8] == -11) {
                    int var17 = -class220.field3597[var8] + 150;
                    if (~var17 <= -51) {
                        if (var17 >= 100) {
                            if (~var17 > -151) {
                                var15 = -32768000 - -(var17 * 327680) + 755 + -(var17 * 5);
                            }
                        } else {
                            var15 = -((var17 + -50) * 327680) + 16711935;
                        }
                    } else {
                        var15 = var17 * 5 + 16711680;
                    }
                }
                if (class220.field3598[var8] == 11) {
                    int var18 = -class220.field3597[var8] + 150;
                    if (~var18 <= -51) {
                        if (~var18 > -101) {
                            var15 = -16318970 - -(var18 * 327685);
                        } else if (var18 < 150) {
                            var15 = -(var18 * 327680) + 32768000 + 16777215;
                        }
                    } else {
                        var15 = -(var18 * 327685) + 16777215;
                    }
                }
                if (class220.field3602[var8] == 0) {
                    class262.field4165.method1797(var14, class133.field2124 + arg0, class233.field3814 + arg1, var15, 0);
                }
                if (~class220.field3602[var8] == -2) {
                    class262.field4165.method1816(var14, arg0 - -class133.field2124, class233.field3814 + arg1, var15, 0, class209.field3423);
                }
                if (class220.field3602[var8] == 2) {
                    class262.field4165.method1817(var14, class133.field2124 + arg0, class233.field3814 + arg1, var15, 0, class209.field3423);
                }
                if (~class220.field3602[var8] == -4) {
                    class262.field4165.method1821(var14, class133.field2124 + arg0, class233.field3814 + arg1, var15, 0, class209.field3423, -class220.field3597[var8] + 150);
                }
                if (~class220.field3602[var8] == -5) {
                    int var19 = (-class220.field3597[var8] + 150) * (100 + class262.field4165.method1822(var14)) / 150;
                    class2.method30(arg0 - 50 + class133.field2124, arg1, class133.field2124 + 50 + arg0, arg1 + arg5);
                    class262.field4165.method1811(var14, class133.field2124 + arg0 + 50 - var19, arg1 - -class233.field3814, var15, 0);
                    class2.method28(arg0, arg1, arg0 + arg3, arg1 + arg5);
                }
                if (class220.field3602[var8] == 5) {
                    int var20 = -class220.field3597[var8] + 150;
                    int var21 = 0;
                    class2.method30(arg0, class233.field3814 + arg1 - class262.field4165.field4233 - 1, arg0 + arg3, class233.field3814 + 5 + arg1);
                    if (var20 < 25) {
                        var21 = var20 + -25;
                    } else if (~var20 < -126) {
                        var21 = var20 - 125;
                    }
                    class262.field4165.method1797(var14, class133.field2124 + arg0, class233.field3814 + arg1 - -var21, var15, 0);
                    class2.method28(arg0, arg1, arg0 - -arg3, arg1 + arg5);
                }
            } else {
                class262.field4165.method1797(var14, arg0 - -class133.field2124, class233.field3814 + arg1, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field1878;
        int[] var3 = super.field110.method1585(arg0 + -3, arg1);
        if (super.field110.field3734) {
            int[] var4 = this.method61(arg1, 127, 0);
            for (int var5 = 0; class231.field3798 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field1879[var6];
            }
        }
        if (arg0 != 3) {
            field1894 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V")
    private final void method829(int arg0) {
        ++field1891;
        int[] var2 = this.field1885[0];
        int[] var3 = this.field1885[1];
        int[] var4 = this.field1885[this.field1885.length + -1];
        int[] var5 = this.field1885[this.field1885.length - 2];
        this.field1881 = new int[] { var5[0] - var4[0] - -var5[0], var5[arg0] + var5[1] + -var4[1] };
        this.field1883 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] + -var3[1] + var2[1] };
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)V")
    public static void method830(byte arg0) {
        field1893 = null;
        field1890 = null;
        field1886 = null;
        field1887 = null;
        if (arg0 == 18) {
            field1892 = null;
            field1894 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)V")
    private final void method831(int arg0) {
        ++field1875;
        int var2 = this.field1882;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field1885.length - 1 > var5 && var4 >= this.field1885[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field1885[var5];
                    int[] var7 = this.field1885[var5 - 1];
                    int var8 = (-var7[0] + var4 << 12) / (var6[0] + -var7[0]);
                    int var9 = -class84.field1319[(var8 & 8183) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var7[1] * var10 - -(var6[1] * var9) >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field1879[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field1885.length + -1 > var14 && ~var13 <= ~this.field1885[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field1885[var14 + -1];
                    int[] var16 = this.field1885[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] - var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field1879[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field1885.length - 1 > var22 && var21 >= this.field1885[var22][0]; ++var22) {
                }
                int[] var23 = this.field1885[var22];
                int[] var24 = this.field1885[var22 + -1];
                int var25 = this.method833(true, var22 - 2)[1];
                int var26 = var24[1];
                int var28 = var23[1];
                int var29 = this.method833(true, var22 + 1)[1];
                int var30 = -var28 - var25 + var26 + var29;
                int var31 = -var25 + var28;
                int var32 = -var26 + var25 - var30;
                int var33 = (-var24[0] + var21 << 12) / (var23[0] + -var24[0]);
                int var34 = var31 * var33 >> 12;
                int var35 = var33 * var33 >> 12;
                int var36 = var32 * var35 >> 12;
                int var37 = (var30 * var33 >> 12) * var35 >> 12;
                int var38 = var26 + var34 + var36 + var37;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field1879[var20] = (short) var38;
            }
        }
        if (arg0 != -22038) {
            this.field1882 = 59;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        ++field1880;
        if (arg2 == 0) {
            this.field1882 = arg1.method1517((byte) -96);
            this.field1885 = new int[arg1.method1517((byte) -96)][2];
            for (int var4 = 0; ~var4 > ~this.field1885.length; ++var4) {
                this.field1885[var4][0] = arg1.method1521((byte) 113);
                this.field1885[var4][1] = arg1.method1521((byte) 113);
            }
        }
        if (arg0 <= 62) {
            method834(-60, -127, 119, -45, -59);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIB)V")
    public static final void method832(int arg0, int arg1, byte arg2) {
        class43.field794[arg0] = arg1;
        int var3 = -99 / ((arg2 - 45) / 46);
        class117 var4 = (class117) class148.field2357.method1400((long) arg0, true);
        ++field1888;
        if (var4 != null) {
            if (~var4.field1933 != -4611686018427387906L) {
                var4.field1933 = 500L + class276.method1861((byte) 122) | 4611686018427387904L;
                return;
            }
        } else {
            class117 var5 = new class117(4611686018427387905L);
            class148.field2357.method1399(7292, var5, (long) arg0);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)[I")
    private final int[] method833(boolean arg0, int arg1) {
        ++field1874;
        if (!arg0) {
            this.method831(2);
        }
        if (~arg1 > -1) {
            return this.field1883;
        } else {
            return ~arg1 <= ~this.field1885.length ? this.field1881 : this.field1885[arg1];
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII)V")
    public static final void method834(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class126.field2046 = class210.field3428 * arg4 / arg2;
        if (arg0 == 29419) {
            class182.field2866 = -1;
            class28.field448 = class1.field17 * arg3 / arg1;
            ++field1877;
            class129.field2090 = -1;
            class6.method47(-127);
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
    public class113() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(II)V")
    public static final void method835(int arg0, int arg1) {
        class39.field741 = new int[arg0];
        if (arg1 != -5260) {
            method835(32, -122);
        }
        class5.field67 = new int[arg0];
        class129.field2083 = new int[arg0];
        class32.field501 = new int[arg0];
        class29.field471 = new int[arg0];
        ++field1889;
    }
}
