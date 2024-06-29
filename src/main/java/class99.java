import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class99 extends class119 {

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
    public int field1836 = 0;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "[Lbd;")
    public class15[] field1840 = new class15[5];

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "[I")
    public int[] field1825 = new int[5];

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public int field1826;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
    public int field1842;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
    public int field1824;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    public int field1849;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "Lai;")
    public static class10 field1833 = class44.method278("RuneScape wird geladen )2 bitte warten)3)3)3", -45);

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "Lai;")
    public static class10 field1830 = class44.method278("leuchten3:", 126);

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "Ldd;")
    public static class34 field1823 = new class34(64);

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
    public int field1831;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
    public int field1839;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
    public int field1841;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    public int field1845;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
    public int field1847;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "I")
    public int field1848;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "J")
    public static long field1820;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "Lla;")
    public class101 field1846;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "Llc;")
    public class103 field1844;

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "Log;")
    public class134 field1832;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "Lsb;")
    public class165 field1843;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "Lue;")
    public class186 field1838;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "Lc;")
    public static class21 field1821;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "Lha;")
    public class66 field1837;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "Lkh;")
    public class99 field1829;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "Z")
    public boolean field1827;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "Z")
    public boolean field1828;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "Z")
    public boolean field1835;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
    public static void method646(int arg0) {
        field1833 = null;
        field1823 = null;
        field1830 = null;
        if (arg0 != 31179) {
            method647((byte) -87, null, -112);
        }
        field1821 = null;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(III)V")
    public class99(int arg0, int arg1, int arg2) {
        this.field1842 = this.field1826 = arg0;
        this.field1824 = arg2;
        this.field1849 = arg1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLmb;I)V")
    public static final void method647(byte arg0, class111 arg1, int arg2) {
        field1834++;
        if (class117.field2266 != null) {
            class117.field2266.field2170 = arg2 * 8 + 5;
            int var3 = class117.field2266.method761(255);
            int var4 = class117.field2266.method761(255);
            arg1.method714(var3, 115, var4);
            return;
        }
        class96.method633(0, 255, -1469261520, true, (byte) 0, null, 255);
        if (arg0 <= 57) {
            method646(-65);
        }
        class2.field9[arg2] = arg1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lwa;III)V")
    public static final void method648(class200 arg0, int arg1, int arg2, int arg3) {
        field1822++;
        if (arg0.field3895 == 1) {
            class180.field3433++;
            class107.method692(class10.field119, 44, arg0.field3833, 0, 0, arg0.field3791, -117);
        }
        if (arg0.field3895 == 2 && !class32.field482) {
            class10 var4 = class106.method688(arg0, false);
            if (var4 != null) {
                class107.method692(class67.method440(0, new class10[] { class1.field3, arg0.field3854 }), 47, arg0.field3833, 0, -1, var4, arg2 - 127);
                class108.field1994++;
            }
        }
        if (arg0.field3895 == 3) {
            class107.method692(class10.field119, 38, arg0.field3833, 0, 0, class39.field660, -124);
            class158.field3045++;
        }
        if (arg0.field3895 == arg2) {
            client.field453++;
            class107.method692(class10.field119, 50, arg0.field3833, 0, 0, arg0.field3791, -116);
        }
        if (arg0.field3895 == 5) {
            class76.field1312++;
            class107.method692(class10.field119, 31, arg0.field3833, 0, 0, arg0.field3791, arg2 ^ 0xFFFFFF86);
        }
        if (arg0.field3895 == 6 && class137.field2569 == null) {
            class107.method692(class10.field119, 41, arg0.field3833, 0, -1, arg0.field3791, -126);
            class84.field1468++;
        }
        if (arg0.field3888 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field3925; var6++) {
                for (int var7 = 0; var7 < arg0.field3845; var7++) {
                    int var8 = (arg0.field3828 + 32) * var6;
                    int var9 = (arg0.field3880 + 32) * var7;
                    if (var5 < 20) {
                        var9 += arg0.field3787[var5];
                        var8 += arg0.field3901[var5];
                    }
                    if (var9 <= arg3 && var8 <= arg1 && arg3 < var9 + 32 && arg1 < var8 + 32) {
                        class207.field4039 = arg0;
                        class95.field1751 = var5;
                        if (arg0.field3883[var5] > 0) {
                            class94 var10 = class104.method678(500, arg0.field3883[var5] - 1);
                            if (class135.field2539 == 1 && class84.method515(-2033267842, class203.method1318(arg2 - 4, arg0))) {
                                if (class185.field3520 != arg0.field3833 || class184.field3506 != var5) {
                                    class55.field984++;
                                    class107.method692(class67.method440(0, new class10[] { class141.field2660, class42.field700, var10.field1718 }), 15, arg0.field3833, var10.field1707, var5, class34.field528, arg2 ^ 0xFFFFFF85);
                                }
                            } else if (!class32.field482 || !class84.method515(-2033267842, class203.method1318(arg2 ^ 0x4, arg0))) {
                                class106.field1973++;
                                class10[] var11 = var10.field1705;
                                if (class189.field3603) {
                                    var11 = class129.method905(var11, 0);
                                }
                                if (class84.method515(-2033267842, class203.method1318(0, arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 18;
                                            } else {
                                                var13 = 21;
                                            }
                                            class119.field2293++;
                                            class107.method692(class67.method440(0, new class10[] { class116.field2220, var10.field1718 }), var13, arg0.field3833, var10.field1707, var5, var11[var12], -119);
                                        } else if (var12 == 4) {
                                            class190.field3618++;
                                            class107.method692(class67.method440(arg2 ^ 0x4, new class10[] { class116.field2220, var10.field1718 }), 21, arg0.field3833, var10.field1707, var5, class123.field2357, -120);
                                        }
                                    }
                                }
                                if (class207.method1339(122, class203.method1318(arg2 ^ 0x4, arg0))) {
                                    class107.method692(class67.method440(0, new class10[] { class116.field2220, var10.field1718 }), 20, arg0.field3833, var10.field1707, var5, class34.field528, -123);
                                    class67.field1164++;
                                }
                                if (class84.method515(-2033267842, class203.method1318(0, arg0)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class36.field575++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 8;
                                            }
                                            if (var14 == 1) {
                                                var15 = 24;
                                            }
                                            if (var14 == 2) {
                                                var15 = 43;
                                            }
                                            class107.method692(class67.method440(0, new class10[] { class116.field2220, var10.field1718 }), var15, arg0.field3833, var10.field1707, var5, var11[var14], -120);
                                        }
                                    }
                                }
                                class10[] var16 = arg0.field3904;
                                if (class189.field3603) {
                                    var16 = class129.method905(var16, arg2 - 4);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class70.field1202++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 12;
                                            }
                                            if (var17 == 1) {
                                                var18 = 17;
                                            }
                                            if (var17 == 2) {
                                                var18 = 45;
                                            }
                                            if (var17 == 3) {
                                                var18 = 22;
                                            }
                                            if (var17 == 4) {
                                                var18 = 10;
                                            }
                                            class107.method692(class67.method440(0, new class10[] { class116.field2220, var10.field1718 }), var18, arg0.field3833, var10.field1707, var5, var16[var17], arg2 ^ 0xFFFFFF87);
                                        }
                                    }
                                }
                                class107.method692(class67.method440(0, new class10[] { class116.field2220, var10.field1718 }), 1004, arg0.field3833, var10.field1707, var5, class36.field580, -128);
                            } else if ((class49.field871 & 0x10) == 16) {
                                class119.field2300++;
                                class107.method692(class67.method440(0, new class10[] { class33.field501, class42.field700, var10.field1718 }), 42, arg0.field3833, var10.field1707, var5, class3.field30, -118);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field3927) {
            return;
        }
        if (!class32.field482) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class10 var23 = class205.method1322(var19, arg0, 0);
                if (var23 != null) {
                    class67.field1170++;
                    class107.method692(arg0.field3792, 1002, arg0.field3833, var19 + 1, arg0.field3871, var23, -118);
                }
            }
            class10 var20 = class106.method688(arg0, false);
            if (var20 != null) {
                class108.field1994++;
                class107.method692(arg0.field3792, 47, arg0.field3833, 0, arg0.field3871, var20, -116);
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class10 var22 = class205.method1322(var21, arg0, 0);
                if (var22 != null) {
                    class67.field1170++;
                    class107.method692(arg0.field3792, 9, arg0.field3833, var21 + 1, arg0.field3871, var22, -118);
                }
            }
            if (class153.method1037(class203.method1318(0, arg0), (byte) 125)) {
                class84.field1468++;
                class107.method692(class10.field119, 41, arg0.field3833, 0, arg0.field3871, class4.field35, -122);
                return;
            }
            return;
        }
        if (class137.method933(0, class203.method1318(0, arg0)) && (class49.field871 & 0x20) == 32) {
            class160.field3075++;
            class107.method692(class67.method440(0, new class10[] { class33.field501, class101.field1897, arg0.field3792 }), 19, arg0.field3833, 0, arg0.field3871, class3.field30, -127);
            return;
        }
    }
}
