import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class133 extends class433 {

    @OriginalMember(owner = "client!nj", name = "Sc", descriptor = "I")
    public int field1825 = 0;

    @OriginalMember(owner = "client!nj", name = "Mc", descriptor = "B")
    private byte field1819 = 0;

    @OriginalMember(owner = "client!nj", name = "gd", descriptor = "I")
    public int field1839 = -1;

    @OriginalMember(owner = "client!nj", name = "Kc", descriptor = "B")
    private byte field1817 = 0;

    @OriginalMember(owner = "client!nj", name = "Wc", descriptor = "I")
    public int field1829 = 255;

    @OriginalMember(owner = "client!nj", name = "fd", descriptor = "I")
    public int field1838 = -1;

    @OriginalMember(owner = "client!nj", name = "dd", descriptor = "I")
    public int field1836 = 0;

    @OriginalMember(owner = "client!nj", name = "Rc", descriptor = "I")
    public int field1824 = -1;

    @OriginalMember(owner = "client!nj", name = "bd", descriptor = "I")
    public int field1834 = 0;

    @OriginalMember(owner = "client!nj", name = "Nc", descriptor = "I")
    public int field1820 = -1;

    @OriginalMember(owner = "client!nj", name = "rd", descriptor = "I")
    public int field1850 = 0;

    @OriginalMember(owner = "client!nj", name = "ld", descriptor = "I")
    public int field1844 = -1;

    @OriginalMember(owner = "client!nj", name = "Qc", descriptor = "I")
    public int field1823 = -1;

    @OriginalMember(owner = "client!nj", name = "Uc", descriptor = "I")
    public int field1827 = 0;

    @OriginalMember(owner = "client!nj", name = "xd", descriptor = "I")
    public int field1856 = -1;

    @OriginalMember(owner = "client!nj", name = "vd", descriptor = "Z")
    public boolean field1854 = false;

    @OriginalMember(owner = "client!nj", name = "hd", descriptor = "Ljf;")
    public static class119 field1840 = null;

    @OriginalMember(owner = "client!nj", name = "qd", descriptor = "[I")
    public static int[] field1849 = new int[3];

    @OriginalMember(owner = "client!nj", name = "Jc", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!nj", name = "Lc", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!nj", name = "Oc", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!nj", name = "Pc", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!nj", name = "Tc", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!nj", name = "Vc", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!nj", name = "Xc", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!nj", name = "Yc", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!nj", name = "Zc", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!nj", name = "ad", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!nj", name = "cd", descriptor = "I")
    private int field1835;

    @OriginalMember(owner = "client!nj", name = "ed", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!nj", name = "id", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!nj", name = "jd", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!nj", name = "md", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!nj", name = "nd", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!nj", name = "pd", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!nj", name = "sd", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!nj", name = "td", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!nj", name = "ud", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!nj", name = "zd", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!nj", name = "kd", descriptor = "Leq;")
    public class116 field1843;

    @OriginalMember(owner = "client!nj", name = "od", descriptor = "Ljava/lang/String;")
    public String field1847;

    @OriginalMember(owner = "client!nj", name = "wd", descriptor = "Ljava/lang/String;")
    public String field1855;

    @OriginalMember(owner = "client!nj", name = "yd", descriptor = "[Ljava/lang/String;")
    public static String[] field1857;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(IZ)Ljava/lang/String;")
    public final String method785(int arg0, boolean arg1) {
        if (arg0 >= -66) {
            this.field1855 = null;
        }
        ++field1830;
        return !arg1 ? this.field1847 : this.field1855;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)I")
    public final int method786(byte arg0) {
        ++field1848;
        if (arg0 != 70) {
            this.field1820 = 33;
        }
        return this.field1843 != null && this.field1843.field1375 != -1 ? class282.method1806(127, this.field1843.field1375).field4982 : super.method786((byte) 70);
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(IZ)Ljava/lang/String;")
    public final String method787(int arg0, boolean arg1) {
        ++field1822;
        if (arg0 != -1) {
            this.method789(107, 102, (class174) null);
        }
        String var3 = "";
        if (class305.field4360 != null) {
            var3 = var3 + class305.field4360[this.field1817];
        }
        if (class428.field6222 != null && ~class428.field6222[this.field1817] != 0) {
            class450 var4 = class372.method2339(-1, class428.field6222[this.field1817]);
            if (~var4.field6557 == -116) {
                var3 = var3 + var4.method2800((byte) 43, this.field1819 & 255);
            } else {
                class411.method2578(new Throwable(), "gdn1", (byte) -68);
                class428.field6222[this.field1817] = -1;
            }
        }
        String var5;
        if (!arg1) {
            var5 = var3 + this.field1847;
        } else {
            var5 = var3 + this.field1855;
        }
        if (class267.field3736 != null) {
            var5 = var5 + class267.field3736[this.field1817];
        }
        return var5;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILen;I)V")
    public static final void method788(int arg0, class174 arg1, int arg2) {
        ++field1852;
        class38.method228(arg1);
        if (arg0 > 1) {
            for (int var3 = 0; var3 < class279.field3935; ++var3) {
                for (int var4 = 0; ~var4 > ~class164.field2287; ++var4) {
                    if (~(2 & class166.field2327[1][var3][var4]) == -3) {
                        class262.method1675(var3, var4);
                    }
                }
            }
        }
        int var5 = 0;
        if (arg2 >= 2) {
            while (~var5 > ~arg0) {
                for (int var6 = 0; var6 <= class164.field2287; ++var6) {
                    for (int var7 = 0; var7 <= class279.field3935; ++var7) {
                        if ((class275.field3883[var5][var7][var6] & 1) != 0) {
                            int var8 = var6;
                            int var9 = var6;
                            int var10 = var5;
                            while (~var8 < -1 && (1 & class275.field3883[var5][var7][var8 + -1]) != 0) {
                                --var8;
                            }
                            while (~class164.field2287 < ~var9 && ~(class275.field3883[var5][var7][var9 + 1] & 1) != -1) {
                                ++var9;
                            }
                            int var11 = var5;
                            label168: while (var10 > 0) {
                                for (int var12 = var8; ~var9 <= ~var12; ++var12) {
                                    if (~(class275.field3883[var10 - 1][var7][var12] & 1) == -1) {
                                        break label168;
                                    }
                                }
                                --var10;
                            }
                            label157: while (~var11 > -4) {
                                for (int var13 = var8; var9 >= var13; ++var13) {
                                    if (~(1 & class275.field3883[var11 + 1][var7][var13]) == -1) {
                                        break label157;
                                    }
                                }
                                ++var11;
                            }
                            int var14 = (var9 - (var8 - 1)) * (-var10 + 1 + var11);
                            if (var14 >= 2) {
                                short var15 = 240;
                                int var16 = class30.field278[var11][var7][var8] + -var15;
                                int var17 = class30.field278[var10][var7][var8];
                                class310.method1942(1, var7 * 128, var7 * 128, var8 * 128, var9 * 128 + 128, var16, var17);
                                for (int var18 = var10; var11 >= var18; ++var18) {
                                    for (int var19 = var8; var19 <= var9; ++var19) {
                                        class275.field3883[var18][var7][var19] = (byte) class40.method253(class275.field3883[var18][var7][var19], -2);
                                    }
                                }
                            }
                        }
                        if ((2 & class275.field3883[var5][var7][var6]) != 0) {
                            int var20 = var7;
                            int var21 = var7;
                            int var22 = var5;
                            int var23 = var5;
                            while (var20 > 0 && ~(class275.field3883[var5][var20 + -1][var6] & 2) != -1) {
                                --var20;
                            }
                            while (~var21 > ~class279.field3935 && ~(class275.field3883[var5][var21 + 1][var6] & 2) != -1) {
                                ++var21;
                            }
                            label222: while (var22 > 0) {
                                for (int var24 = var20; var21 >= var24; ++var24) {
                                    if (~(2 & class275.field3883[var22 + -1][var24][var6]) == -1) {
                                        break label222;
                                    }
                                }
                                --var22;
                            }
                            label211: while (var23 < 3) {
                                for (int var25 = var20; ~var25 >= ~var21; ++var25) {
                                    if ((class275.field3883[var23 + 1][var25][var6] & 2) == 0) {
                                        break label211;
                                    }
                                }
                                ++var23;
                            }
                            int var26 = (var23 - -1 - var22) * (-var20 + 1 + var21);
                            if (var26 >= 2) {
                                short var27 = 240;
                                int var28 = class30.field278[var23][var20][var6] - var27;
                                int var29 = class30.field278[var22][var20][var6];
                                class310.method1942(2, var20 * 128, var21 * 128 - -128, var6 * 128, var6 * 128, var28, var29);
                                for (int var30 = var22; ~var30 >= ~var23; ++var30) {
                                    for (int var31 = var20; ~var31 >= ~var21; ++var31) {
                                        class275.field3883[var30][var31][var6] = (byte) class40.method253(class275.field3883[var30][var31][var6], -3);
                                    }
                                }
                            }
                        }
                        if (~(4 & class275.field3883[var5][var7][var6]) != -1) {
                            int var32 = var7;
                            int var33 = var7;
                            int var34 = var6;
                            int var35 = var6;
                            while (~var34 < -1 && ~(4 & class275.field3883[var5][var7][var34 + -1]) != -1) {
                                --var34;
                            }
                            while (class164.field2287 > var35 && ~(class275.field3883[var5][var7][var35 - -1] & 4) != -1) {
                                ++var35;
                            }
                            label275: while (~var32 < -1) {
                                for (int var36 = var34; ~var35 <= ~var36; ++var36) {
                                    if (~(class275.field3883[var5][var32 + -1][var36] & 4) == -1) {
                                        break label275;
                                    }
                                }
                                --var32;
                            }
                            label264: while (~class279.field3935 < ~var33) {
                                for (int var37 = var34; ~var37 >= ~var35; ++var37) {
                                    if (~(class275.field3883[var5][var33 - -1][var37] & 4) == -1) {
                                        break label264;
                                    }
                                }
                                ++var33;
                            }
                            if (~((-var32 + var33 - -1) * (var35 + 1 + -var34)) <= -5) {
                                int var38 = class30.field278[var5][var32][var34];
                                class310.method1942(4, var32 * 128, var33 * 128 + 128, var34 * 128, var35 * 128 + 128, var38, var38);
                                for (int var39 = var32; ~var33 <= ~var39; ++var39) {
                                    for (int var40 = var34; ~var35 <= ~var40; ++var40) {
                                        class275.field3883[var5][var39][var40] = (byte) class40.method253(class275.field3883[var5][var39][var40], -5);
                                    }
                                }
                            }
                        }
                    }
                }
                ++var5;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILen;)Z")
    private final boolean method789(int arg0, int arg1, class174 arg2) {
        ++field1828;
        int var4 = arg1;
        class270 var5 = this.method2697((byte) 93);
        class182 var6 = super.field6312 != arg0 && super.field6250 == 0 ? class437.method2717(super.field6312, (byte) -103) : null;
        class182 var7 = super.field6265 == -1 || this.field1854 || super.field6335 && var6 != null ? null : class437.method2717(super.field6265, (byte) -103);
        int var8 = var5.field3830;
        int var9 = var5.field3820;
        if (~var8 != -1 || ~var9 != -1 || var5.field3819 != 0 || var5.field3840 != 0) {
            arg1 |= 7;
        }
        super.field6340[0] = this.field1843.method648(var6, super.field6272, super.field6322, super.field6269, super.field6296, arg1, super.field6255, super.field6277, var7, super.field6295, true, (byte) -121, arg2);
        int var10 = class386.method2468(24484);
        if (class343.field5053 < 96 && var10 > 50) {
            class236.method1507(true);
        }
        if (class228.field3117 != 0 && var10 < 50) {
            int var11 = -var10 + 50;
            while (~class102.field1150 > ~var11) {
                class99.field1114[class102.field1150] = new byte[102400];
                ++class102.field1150;
            }
            while (class102.field1150 > var11) {
                --class102.field1150;
                class99.field1114[class102.field1150] = null;
            }
        } else if (class228.field3117 != 0) {
            class99.field1114 = new byte[50][];
            class102.field1150 = 0;
        }
        if (super.field6340[0] == null) {
            return false;
        } else {
            super.field6263 = super.field6340[0].method731();
            this.method2690(-1, super.field6340[0]);
            int var12 = super.field6289.method2776(-28);
            super.field6247 = 0;
            super.field6333 = 0;
            super.field6252 = 0;
            if (var8 == 0 && ~var9 == -1) {
                this.method2682(this.method786((byte) 70) << 7, var12, this.method786((byte) 70) << 7, 1280);
            } else {
                this.method2682(var8, var12, var9, 1280);
                if (super.field6333 != 0) {
                    super.field6340[0].method737(super.field6333);
                }
                if (~super.field6252 != -1) {
                    super.field6340[0].method767(super.field6252);
                }
                if (~super.field6247 != -1) {
                    super.field6340[0].method758(0, super.field6247, 0);
                }
            }
            super.field6340[1] = null;
            if (!this.field1854 && ~super.field6256 != 0 && super.field6315 != -1) {
                class377 var13 = class251.method1571(super.field6256, (byte) 90);
                class393 var14 = var13.method2375((var13.field5522 ? 7 : 2) | var4, arg2, super.field6332, super.field6270, (byte) 96, super.field6315);
                if (var14 != null) {
                    var14.method758(0, -super.field6319, 0);
                    if (var13.field5522 && (~var8 != -1 || ~var9 != -1)) {
                        if (~super.field6333 != -1) {
                            var14.method737(super.field6333);
                        }
                        if (~super.field6252 != -1) {
                            var14.method767(super.field6252);
                        }
                        if (~super.field6247 != -1) {
                            var14.method758(0, super.field6247, 0);
                        }
                    }
                    super.field6340[1] = var14;
                }
            }
            super.field6340[2] = null;
            if (!this.field1854 && super.field6343 != null) {
                if (~super.field6346 >= ~class221.field3033) {
                    super.field6343 = null;
                }
                if (super.field6341 <= class221.field3033 && ~super.field6346 < ~class221.field3033) {
                    class393 var15 = super.field6343.method209((byte) 58, 7 | var4, arg2);
                    if (var15 != null) {
                        var15.method758(-super.field1304 + super.field6357, super.field6354 - super.field1310, -super.field1311 + super.field6356);
                        if (~var12 != -1) {
                            var15.method723(16383 & -var12);
                        }
                        super.field6340[2] = var15;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "(I)V")
    public static final void method790(int arg0) {
        class435.field6384 = arg0;
        class114.field1318 = 0;
        ++field1858;
        class450.field6576 = -1;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILen;)Lir;")
    public final class19 method213(int arg0, class174 arg1) {
        ++field1816;
        if (this.field1843 != null && this.method789(-1, 1024, arg1)) {
            class71 var3 = arg1.method1015();
            int var4 = super.field6289.method2776(-36);
            var3.method117(var4);
            var3.method124(super.field1304, super.field1310, super.field1311);
            float var5 = arg1.method936();
            float var6 = arg1.method1019();
            if (class41.field487) {
                class270 var7 = this.method2697((byte) 93);
                if (var7.field3791 && (~this.field1843.field1375 == 0 || class282.method1806(108, this.field1843.field1375).field4954)) {
                    class182 var8 = super.field6312 != -1 && super.field6250 == 0 ? class437.method2717(super.field6312, (byte) -103) : null;
                    class182 var9 = super.field6265 == -1 || this.field1854 || super.field6335 && var8 != null ? null : class437.method2717(super.field6265, (byte) -103);
                    class393 var10 = class63.method384(super.field6252, var4, 1, (byte) -109, var9 == null ? var8 : var9, 160, super.field6300, 0, arg1, super.field6333, 0, 240, var9 == null ? super.field6277 : super.field6255, super.field6247, super.field6340[0]);
                    if (var10 != null) {
                        arg1.method1017(var5, var6 - 128.0F);
                        arg1.method956(false);
                        var10.method775(var3, (class127) null, 0);
                        arg1.method956(true);
                    }
                }
            }
            if (class390.field5715 == this) {
                arg1.method1017(var5, var6 + -144.0F);
                var3.method123(super.field1304, super.field1310, super.field1311);
                for (int var11 = class286.field4039.length + -1; ~var11 <= -1; --var11) {
                    class58 var12 = class286.field4039[var11];
                    if (var12 != null && ~var12.field692 != 0) {
                        if (~var12.field708 == -2 && var12.field697 >= 0 && ~class81.field917.length < ~var12.field697) {
                            class358 var13 = class81.field917[var12.field697];
                            if (var13 != null) {
                                int var14 = var13.field1304 / 32 - class390.field5715.field1304 / 32;
                                int var15 = var13.field1311 / 32 - class390.field5715.field1311 / 32;
                                this.method797(var12.field692, var15, var14, false, super.field6340[0], var3, arg1, 360000);
                            }
                        }
                        if (~var12.field708 == -3) {
                            int var16 = (-class40.field427 + var12.field707) * 4 + -(class390.field5715.field1304 / 32) - -2;
                            int var17 = (-class217.field2975 + var12.field702) * 4 + 2 + -(class390.field5715.field1311 / 32);
                            int var18 = var12.field698 * 4;
                            int var19 = var18 * var18;
                            this.method797(var12.field692, var17, var16, false, super.field6340[0], var3, arg1, var19);
                        }
                        if (~var12.field708 == -11 && var12.field697 >= 0 && ~var12.field697 > ~class375.field5473.length) {
                            class133 var20 = class375.field5473[var12.field697];
                            if (var20 != null) {
                                int var21 = var20.field1304 / 32 - class390.field5715.field1304 / 32;
                                int var22 = var20.field1311 / 32 + -(class390.field5715.field1311 / 32);
                                this.method797(var12.field692, var22, var21, false, super.field6340[0], var3, arg1, 360000);
                            }
                        }
                    }
                }
                var3.method117(var4);
                var3.method124(super.field1304, super.field1310, super.field1311);
            }
            arg1.method1017(var5, var6);
            if (arg0 >= -5) {
                return null;
            } else {
                class19 var23 = class358.method2286(true, super.field6340.length);
                if (super.field6349 == null) {
                    arg1.method984(super.field6340, var3, var23.field197, class390.field5715 != this ? 0 : 1);
                } else {
                    class271 var24 = super.field6349.method2492();
                    arg1.method943(super.field6340, var24, var3, var23.field197, class390.field5715 == this ? 1 : 0);
                }
                this.method2693(super.field6340, arg1, false, 1);
                if (super.field6340[2] != null) {
                    if (~var4 != -1) {
                        super.field6340[2].method723(var4);
                    }
                    super.field6340[2].method758(-super.field6357 + super.field1304, -super.field6354 + super.field1310, -super.field6356 + super.field1311);
                }
                return var23;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
    public final int method791(int arg0) {
        if (arg0 >= -32) {
            this.field1838 = 101;
        }
        ++field1818;
        return -1;
    }

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)V")
    public final void method224(int arg0) {
        ++field1833;
        int var2 = 4 / ((52 - arg0) / 46);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(Z)I")
    public final int method792(boolean arg0) {
        ++field1841;
        if (arg0) {
            this.field1854 = true;
        }
        return this.field1835;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Len;I)V")
    public final void method211(class174 arg0, int arg1) {
        ++field1853;
        if (this.field1843 != null) {
            if (arg1 != 0) {
                this.field1820 = -39;
            }
            if (super.field6344 || this.method789(-1, 0, arg0)) {
                this.method2693(super.field6340, arg0, super.field6344, 1);
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "(I)Z")
    public final boolean method793(int arg0) {
        if (arg0 != 255) {
            method788(-19, (class174) null, 78);
        }
        ++field1831;
        return this.field1843 != null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BIZII)V")
    public final void method794(byte arg0, int arg1, boolean arg2, int arg3, int arg4) {
        super.method2696(arg3, arg4, arg1, this.method786((byte) 70), arg2, -29874);
        if (arg0 > 0) {
            this.method797(5, 73, -108, true, (class393) null, (class71) null, (class174) null, 53);
        }
        ++field1832;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(IB)V")
    public static final void method795(int arg0, byte arg1) {
        class139.field1976 = new class331(arg0);
        ++field1845;
        if (arg1 != 29) {
            field1840 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "(I)I")
    public final int method222(int arg0) {
        ++field1837;
        return arg0 != 26841 ? 26 : super.field6263;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILen;IBLfs;IZ)V")
    public final void method206(int arg0, class174 arg1, int arg2, byte arg3, class330 arg4, int arg5, boolean arg6) {
        if (arg3 != -42) {
            this.field1824 = 57;
        }
        ++field1826;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)Z")
    public final boolean method217(int arg0) {
        ++field1846;
        int var2 = 81 % ((-60 - arg0) / 37);
        return false;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILbk;)V")
    public final void method796(int arg0, class211 arg1) {
        arg1.field2888 = 0;
        ++field1851;
        int var3 = arg1.method1342((byte) -128);
        int var4 = 1 & var3;
        boolean var5 = (2 & var3) != 0;
        boolean var6 = ~(var3 & 4) != -1;
        int var7 = super.method786((byte) 70);
        this.method2684((7 & var3 >> 3) + 1, (byte) -91);
        this.field1817 = (byte) ((var3 & 246) >> 6);
        if (arg0 > -22) {
            this.field1820 = -108;
        }
        super.field1304 += (-var7 + this.method786((byte) 70)) * 64;
        super.field1311 += 64 * (-var7 + this.method786((byte) 70));
        this.field1819 = arg1.method1373((byte) 30);
        this.field1838 = arg1.method1373((byte) 30);
        this.field1824 = arg1.method1373((byte) 30);
        this.field1825 = 0;
        int var8 = -1;
        int[] var9 = new int[12];
        for (int var10 = 0; var10 < 12; ++var10) {
            int var11 = arg1.method1342((byte) -126);
            if (var11 == 0) {
                var9[var10] = 0;
            } else {
                int var12 = arg1.method1342((byte) -127);
                int var13 = (var11 << 8) + var12;
                if (var10 == 0 && ~var13 == -65536) {
                    var8 = arg1.method1355(32136);
                    this.field1825 = arg1.method1342((byte) -127);
                    break;
                }
                if (~var13 <= -32769) {
                    int var27 = class306.field4387[var13 + -32768];
                    var9[var10] = class164.method1059(1073741824, var27);
                    int var28 = class392.method2498(var27, -113).field3582;
                    if (var28 != 0) {
                        this.field1825 = var28;
                    }
                } else {
                    var9[var10] = class164.method1059(Integer.MIN_VALUE, var13 + -256);
                }
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; ~var15 > -6; ++var15) {
            int var26 = arg1.method1342((byte) -128);
            if (var26 < 0 || var26 >= class198.field2693[var15].length) {
                var26 = 0;
            }
            var14[var15] = var26;
        }
        this.field1835 = arg1.method1355(32136);
        this.field1855 = arg1.method1350(126);
        if (!var5) {
            this.field1847 = this.field1855;
        } else {
            this.field1847 = arg1.method1350(52);
        }
        this.field1827 = arg1.method1342((byte) -126);
        if (!var6) {
            this.field1850 = 0;
            this.field1834 = arg1.method1342((byte) -126);
            this.field1820 = arg1.method1342((byte) -128);
            if (~this.field1820 == -256) {
                this.field1820 = -1;
            }
        } else {
            this.field1850 = arg1.method1355(32136);
            this.field1820 = -1;
            this.field1834 = this.field1827;
        }
        int var16 = this.field1836;
        this.field1836 = arg1.method1342((byte) -127);
        if (this.field1836 != 0) {
            int var17 = this.field1856;
            int var18 = this.field1823;
            int var19 = this.field1844;
            int var20 = this.field1839;
            int var21 = this.field1829;
            this.field1856 = arg1.method1355(32136);
            this.field1823 = arg1.method1355(32136);
            this.field1844 = arg1.method1355(32136);
            this.field1839 = arg1.method1355(32136);
            this.field1829 = arg1.method1342((byte) -127);
            if (this.field1836 != var16 || ~this.field1856 != ~var17 || ~this.field1823 != ~var18 || ~this.field1844 != ~var19 || this.field1839 != var20 || ~this.field1829 != ~var21) {
                class326.method2007(this, false);
            }
        } else {
            class275.method1739(this, 2);
        }
        if (this.field1843 == null) {
            this.field1843 = new class116();
        }
        int var22 = this.field1843.field1375;
        int[] var23 = this.field1843.field1374;
        this.field1843.method650(~var4 == -2, var9, var8, var14, this.method792(false), 0);
        if (var8 != var22) {
            super.field1304 = super.field6351[0] * 128 - -(64 * this.method786((byte) 70));
            super.field1311 = super.field6350[0] * 128 - -(64 * this.method786((byte) 70));
        }
        if (~super.field6279 == -2048 && var23 != null) {
            for (int var24 = 0; ~var14.length < ~var24; ++var24) {
                if (var14[var24] != var23[var24]) {
                    class27.method161(-1);
                    break;
                }
            }
        }
        if (super.field6349 != null) {
            super.field6349.method2488();
        }
        if (~super.field6265 != 0 && super.field6335) {
            class270 var25 = this.method2697((byte) 93);
            if (!var25.method1718(super.field6265, true)) {
                super.field6335 = false;
                super.field6265 = -1;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIZLmj;Lvr;Len;I)V")
    private final void method797(int arg0, int arg1, int arg2, boolean arg3, class393 arg4, class71 arg5, class174 arg6, int arg7) {
        if (arg3) {
            this.method224(105);
        }
        ++field1842;
        int var9 = arg1 * arg1 + arg2 * arg2;
        if (~var9 <= -17 && ~var9 >= ~arg7) {
            int var10 = (int) (2607.5945876176133D * Math.atan2((double) arg2, (double) arg1)) & 16383;
            class393 var11 = class272.method1724(arg0, (byte) -126, super.field1304, super.field6252, super.field1310, super.field1311, arg4, super.field6333, var10, arg6, super.field6247);
            if (var11 != null) {
                arg6.method956(false);
                var11.method775(arg5, (class127) null, 0);
                arg6.method956(true);
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIZLen;)Z")
    public final boolean method208(int arg0, int arg1, boolean arg2, class174 arg3) {
        ++field1821;
        if (this.field1843 != null && this.method789(-1, 65536, arg3)) {
            class71 var5 = arg3.method1015();
            int var6 = super.field6289.method2776(114);
            var5.method117(var6);
            if (!arg2) {
                field1840 = null;
            }
            var5.method123(super.field1304, super.field1310, super.field1311);
            for (int var7 = 0; var7 < super.field6340.length; ++var7) {
                if (super.field6340[var7] != null) {
                    return super.field6340[var7].method724(arg0, arg1, var5, true);
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "(I)V")
    public static void method798(int arg0) {
        if (arg0 > 47) {
            field1849 = null;
            field1857 = null;
            field1840 = null;
        }
    }
}
