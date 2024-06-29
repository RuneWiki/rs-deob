import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class114 extends class222 {

    @OriginalMember(owner = "client!rd", name = "bb", descriptor = "I")
    private int field2022 = 204;

    @OriginalMember(owner = "client!rd", name = "ib", descriptor = "I")
    private int field2029 = 81;

    @OriginalMember(owner = "client!rd", name = "nb", descriptor = "I")
    private int field2034 = 1024;

    @OriginalMember(owner = "client!rd", name = "fb", descriptor = "I")
    private int field2026 = 409;

    @OriginalMember(owner = "client!rd", name = "vb", descriptor = "I")
    private int field2042 = 8;

    @OriginalMember(owner = "client!rd", name = "pb", descriptor = "I")
    private int field2036 = 0;

    @OriginalMember(owner = "client!rd", name = "xb", descriptor = "I")
    private int field2044 = 1024;

    @OriginalMember(owner = "client!rd", name = "tb", descriptor = "I")
    private int field2040 = 4;

    @OriginalMember(owner = "client!rd", name = "eb", descriptor = "I")
    public static int field2025 = 0;

    @OriginalMember(owner = "client!rd", name = "ob", descriptor = "Lsb;")
    public static class98 field2035 = class47.method368(")4a=", 0);

    @OriginalMember(owner = "client!rd", name = "zb", descriptor = "Lsb;")
    public static class98 field2046 = class47.method368("<col=00ffff>", 0);

    @OriginalMember(owner = "client!rd", name = "yb", descriptor = "I")
    public static int field2045 = -16 + (int) (33.0D * Math.random());

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!rd", name = "cb", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!rd", name = "db", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!rd", name = "hb", descriptor = "I")
    private int field2028;

    @OriginalMember(owner = "client!rd", name = "kb", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!rd", name = "mb", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!rd", name = "qb", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!rd", name = "rb", descriptor = "I")
    private int field2038;

    @OriginalMember(owner = "client!rd", name = "sb", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!rd", name = "ub", descriptor = "I")
    private int field2041;

    @OriginalMember(owner = "client!rd", name = "wb", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!rd", name = "jb", descriptor = "Lhh;")
    public static class38 field2030;

    @OriginalMember(owner = "client!rd", name = "lb", descriptor = "[I")
    private int[] field2032;

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "[[I")
    private int[][] field2021;

    @OriginalMember(owner = "client!rd", name = "gb", descriptor = "[[I")
    private int[][] field2027;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZIIILje;I)V")
    public static final void method850(boolean arg0, int arg1, int arg2, int arg3, class138 arg4, int arg5) {
        ++field2024;
        if (class105.field1866 < 50) {
            if (arg4.field2433 != null && ~arg3 > ~arg4.field2433.length && arg4.field2433[arg3] != null) {
                if (arg5 != 4096) {
                    method854(-9, 1);
                }
                int var6 = arg4.field2433[arg3][0];
                int var7 = var6 >> 8;
                int var8 = 7 & var6 >> 4;
                if (~arg4.field2433[arg3].length < -2) {
                    int var9 = (int) ((double) arg4.field2433[arg3].length * Math.random());
                    if (~var9 < -1) {
                        var7 = arg4.field2433[arg3][var9];
                    }
                }
                int var10 = 15 & var6;
                if (var10 == 0) {
                    if (arg0) {
                        class131.method990(arg5 ^ 968, var7, 0, var8);
                    }
                } else if (~class90.field1585 != -1) {
                    class181.field3120[class105.field1866] = var7;
                    int var11 = (arg1 - 64) / 128;
                    int var12 = (arg2 + -64) / 128;
                    class226.field3898[class105.field1866] = var8;
                    class211.field3617[class105.field1866] = 0;
                    class75.field1320[class105.field1866] = null;
                    class148.field2706[class105.field1866] = (var11 << 16) + var10 - -(var12 << 8);
                    ++class105.field1866;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(II)Lfb;")
    public static final class242 method851(int arg0, int arg1) {
        ++field2031;
        class242 var2 = (class242) class113.field2010.method1564((long) arg0, 0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class189.field3268.method571(4, arg0, 123);
            class242 var4 = new class242();
            if (var3 != null) {
                var4.method1668(-108, arg0, new class216(var3));
            }
            if (arg1 != 1) {
                return null;
            } else {
                class113.field2010.method1563((long) arg0, 21771, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)V")
    public static final void method852(byte arg0) {
        int var1 = -76 % ((arg0 - -51) / 58);
        ++field2023;
        if (class64.field1052 != null) {
            if (~class226.field3903 > -11) {
                if (!class2.field15.method566(class64.field1052.field2763, -5384) || !class2.field15.method566(class186.method1288(new class98[] { class64.field1052.field2763, class192.field3344 }, 31618), -5384)) {
                    class226.field3903 = class113.field1999.method567(class64.field1052.field2763, 12914) / 10;
                    return;
                }
                class113.method849(4);
                class226.field3903 = 10;
            }
            if (~class226.field3903 != -11) {
                if (class226.field3903 == 20) {
                    class48.method377(-69, new class216(class2.field15.method574(25784, class163.field2939, class64.field1052.field2763)));
                    class226.field3903 = 30;
                    class84.method630(3, true);
                    class111.method836(41);
                } else if (~class226.field3903 == -31) {
                    class106.method813(new class216(class2.field15.method574(25784, class232.field3993, class64.field1052.field2763)), (byte) -117);
                    class226.field3903 = 40;
                    class111.method836(49);
                } else if (class226.field3903 == 40) {
                    class199.method1357(1, new class216(class2.field15.method574(25784, class23.field475, class64.field1052.field2763)));
                    class226.field3903 = 50;
                    class111.method836(122);
                } else if (class226.field3903 == 50) {
                    class219.method1509(8, new class216(class2.field15.method574(25784, class49.field815, class64.field1052.field2763)));
                    class226.field3903 = 60;
                    class84.method630(3, true);
                    class111.method836(109);
                } else if (class226.field3903 == 60) {
                    class31.field552 = class54.method402(false, class2.field15, class186.method1288(new class98[] { class64.field1052.field2763, class192.field3344 }, 31618));
                    class226.field3903 = 70;
                    class111.method836(94);
                } else if (~class226.field3903 == -71) {
                    class44.field734 = new class38(11, true, class85.field1504);
                    class226.field3903 = 73;
                    class84.method630(3, true);
                    class111.method836(61);
                } else if (class226.field3903 == 73) {
                    class115.field2053 = new class38(12, true, class85.field1504);
                    class226.field3903 = 76;
                    class84.method630(3, true);
                    class111.method836(32);
                } else if (~class226.field3903 == -77) {
                    class137.field2415 = new class38(14, true, class85.field1504);
                    class226.field3903 = 79;
                    class84.method630(3, true);
                    class111.method836(44);
                } else if (class226.field3903 == 79) {
                    field2030 = new class38(17, true, class85.field1504);
                    class226.field3903 = 82;
                    class84.method630(3, true);
                    class111.method836(99);
                } else if (~class226.field3903 == -83) {
                    class166.field2972 = new class38(19, true, class85.field1504);
                    class226.field3903 = 85;
                    class84.method630(3, true);
                    class111.method836(71);
                } else if (class226.field3903 == 85) {
                    class60.field1002 = new class38(22, true, class85.field1504);
                    class226.field3903 = 88;
                    class84.method630(3, true);
                    class111.method836(21);
                } else if (~class226.field3903 == -89) {
                    class183.field3156 = new class38(26, true, class85.field1504);
                    class226.field3903 = 91;
                    class84.method630(3, true);
                    class111.method836(110);
                } else {
                    class219.field3767 = new class38(30, true, class85.field1504);
                    class226.field3903 = 100;
                    class84.method630(3, true);
                    class111.method836(49);
                    class192.field3354 = -1;
                    class70.field1121 = -1;
                    System.gc();
                }
            } else {
                class255.field4470 = class64.field1052.field2771 >> 6 << 6;
                class51.field830 = class64.field1052.field2767 >> 6 << 6;
                class140.field2488 = (class64.field1052.field2764 >> 6 << 6) + -class51.field830 + 64;
                class148.field2743 = (class64.field1052.field2759 >> 6 << 6) - -64 + -class255.field4470;
                int var2 = -class182.field3143 + -1 + class148.field2743 + -(class163.field2943.field4466 >> 7) + class255.field4470;
                int var3 = (class163.field2943.field4492 >> 7) + class189.field3277 + -class51.field830;
                int var4 = var3 + ((int) (Math.random() * 10.0D) - 5);
                int var5 = var2 + ((int) (Math.random() * 10.0D) - 5);
                class4.field42 = 8.0F;
                class148.field2726 = 8.0F;
                if (var4 >= 0 && ~class140.field2488 < ~var4 && ~var5 <= -1 && ~var5 > ~class148.field2743) {
                    class211.field3612 = var4;
                    class211.field3613 = var5;
                } else {
                    class211.field3612 = class64.field1052.field2770 * 64 + -class51.field830;
                    class211.field3613 = class148.field2743 - (1 - -(class64.field1052.field2766 * 64)) + class255.field4470;
                }
                class225.method1553(117);
                int var6 = class148.field2743 >> 6;
                int var7 = class140.field2488 >> 6;
                class91.field1608 = new byte[var7][var6][];
                class233.field4018 = new int[var7][var6][];
                class166.field2975 = new byte[var7][var6][];
                class108.field1939 = new int[class158.field2881 - -1];
                class25.field489 = new int[var7][var6][];
                class206.field3516 = new short[var7][var6][];
                class15.field293 = new byte[var7][var6][];
                class75.field1330 = new byte[var7][var6][];
                int var8 = class118.field2125 >> 1;
                class102.field1805 = new byte[var7][var6][];
                int var9 = class158.field2872 >> 2 << 10;
                class34.method294((byte) 116, var9, var8);
                class226.field3903 = 20;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V")
    public static void method853(int arg0) {
        field2030 = null;
        field2046 = null;
        int var1 = -22 % ((arg0 - 62) / 49);
        field2035 = null;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class114() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        if (arg0 < 35) {
            this.field2032 = null;
        }
        ++field2020;
        int[] var3 = super.field3844.method22(0, arg1);
        if (super.field3844.field61) {
            int var4 = class214.field3639[arg1] + this.field2036;
            int var5 = 0;
            while (~var4 > -1) {
                var4 += 4096;
            }
            while (var4 > 4096) {
                var4 -= 4096;
            }
            while (~var5 > ~this.field2042 && ~this.field2032[var5] >= ~var4) {
                ++var5;
            }
            boolean var6 = ~(1 & var5) == -1;
            int var7 = var5 + -1;
            int var8 = this.field2032[var5];
            int var9 = this.field2032[var5 + -1];
            if (var4 > this.field2028 + var9 && var8 - this.field2028 > var4) {
                for (int var10 = 0; class13.field253 > var10; ++var10) {
                    int var11 = 0;
                    int var12 = var6 ? this.field2034 : -this.field2034;
                    int var13;
                    for (var13 = (this.field2041 * var12 >> 12) + class261.field4577[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field2040 && ~var13 <= ~this.field2021[var7][var11]) {
                        ++var11;
                    }
                    int var14 = this.field2021[var7][var11];
                    int var15 = var11 + -1;
                    int var16 = this.field2021[var7][var15];
                    if (this.field2028 + var16 < var13 && ~var13 > ~(var14 - this.field2028)) {
                        var3[var10] = this.field2027[var7][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class66.method465(var3, 0, class13.field253, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (arg2 != 2) {
                        if (arg2 != 3) {
                            if (~arg2 != -5) {
                                if (~arg2 != -6) {
                                    if (arg2 != 6) {
                                        if (~arg2 == -8) {
                                            this.field2044 = arg0.method1487(118);
                                        }
                                    } else {
                                        this.field2029 = arg0.method1487(2);
                                    }
                                } else {
                                    this.field2036 = arg0.method1487(48);
                                }
                            } else {
                                this.field2034 = arg0.method1487(43);
                            }
                        } else {
                            this.field2022 = arg0.method1487(121);
                        }
                    } else {
                        this.field2026 = arg0.method1487(11);
                    }
                } else {
                    this.field2042 = arg0.method1446(5350);
                }
            } else {
                this.field2040 = arg0.method1446(5350);
            }
            ++field2037;
        }
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(II)I")
    public static final int method854(int arg0, int arg1) {
        ++field2039;
        int var2 = (-715827883 & arg1 >>> 1) + (1431655765 & arg1);
        if (arg0 != -26613) {
            return 60;
        } else {
            int var3 = ((-858993459 & var2) >>> 2) + (858993459 & var2);
            int var4 = (var3 >>> 4) + var3 & 252645135;
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return var6 & 255;
        }
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V")
    private final void method855(int arg0) {
        ++field2019;
        Random var2 = new Random((long) this.field2042);
        this.field2041 = 4096 / this.field2040;
        this.field2038 = 4096 / this.field2042;
        this.field2028 = this.field2029 / 2;
        this.field2032 = new int[this.field2042 + 1];
        this.field2032[0] = 0;
        int var3 = this.field2041 / 2;
        this.field2021 = new int[this.field2042][this.field2040 - -1];
        this.field2027 = new int[this.field2042][this.field2040];
        int var4 = this.field2038 / 2;
        for (int var5 = 0; ~this.field2042 < ~var5; ++var5) {
            if (var5 > 0) {
                int var6 = this.field2038;
                int var7 = (-2048 + class124.method926(121, 4096, var2)) * this.field2022 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field2032[var5] = this.field2032[var5 + -1] - -var8;
            }
            this.field2021[var5][0] = 0;
            for (int var9 = 0; ~this.field2040 < ~var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field2041;
                    int var11 = (class124.method926(83, 4096, var2) - 2048) * this.field2026 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field2021[var5][var9] = this.field2021[var5][var9 + -1] + var12;
                }
                this.field2027[var5][var9] = this.field2044 <= 0 ? 4096 : -class124.method926(-82, this.field2044, var2) + 4096;
            }
            this.field2021[var5][this.field2040] = 4096;
        }
        if (arg0 != 2495) {
            method850(false, -1, -122, -20, (class138) null, -120);
        }
        this.field2032[this.field2042] = 4096;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public final void method288(int arg0) {
        ++field2033;
        int var2 = -32 % ((arg0 - 57) / 51);
        this.method855(2495);
    }
}
