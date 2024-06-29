import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class300 {

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lkh;")
    private class172 field4825 = new class172();

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Lmg;")
    private class116 field4838 = new class116();

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    private int field4837;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    private int field4836;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "Lvl;")
    private class164 field4839;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "Lci;")
    public static class327 field4829 = new class327();

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4841 = "Mechscape is loading - please wait...";

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "Lth;")
    public static class57 field4840;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "[[I")
    public static int[][] field4827;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)Lec;", line = 12)
    public final class45 method2144(int arg0) {
        field4826++;
        return arg0 == 32767 ? this.field4839.method1277((byte) -108) : (class45) null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I", line = 32)
    public static final int method2145(int arg0, int arg1) {
        field4830++;
        int var2 = 90 / ((-arg0 - 52) / 48);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)Lqm;", line = 43)
    public static final class227 method2146(int arg0) {
        field4835++;
        class227 var1 = new class227(34);
        var1.method1712(11, -98);
        var1.method1712(class166.field2649, -60);
        var1.method1712(class264.field4429 ? 1 : 0, -111);
        var1.method1712(class160.field2561 ? 1 : 0, -99);
        var1.method1712(class292.field4726 ? 1 : 0, -74);
        var1.method1712(class44.field690 ? 1 : 0, -122);
        var1.method1712(class241.field3979 ? 1 : 0, -64);
        var1.method1712(class243.field4004 ? 1 : 0, -106);
        var1.method1712(class75.field1272 ? 1 : 0, -117);
        var1.method1712(client.field717 ? 1 : 0, arg0 ^ 0xFFFF8CC4);
        var1.method1712(class131.field2214, -122);
        var1.method1712(class3.field36 ? 1 : 0, -59);
        var1.method1712(class193.field3083 ? 1 : 0, arg0 - 29622);
        var1.method1712(class198.field3165 ? 1 : 0, -104);
        var1.method1712(class340.field5436, arg0 ^ 0xFFFF8CE9);
        var1.method1712(class248.field4052 ? 1 : 0, -109);
        var1.method1712(class45.field704, arg0 ^ 0xFFFF8CE7);
        var1.method1712(class235.field3899, -109);
        var1.method1712(class272.field4520, -68);
        var1.method1729(class137.field2274, 206);
        var1.method1729(class231.field3837, arg0 ^ 0x7387);
        var1.method1712(class158.method1219(), -76);
        var1.method1757(class237.field3923, -120);
        var1.method1712(class267.field4462, -78);
        var1.method1712(class257.field4304 ? 1 : 0, -77);
        var1.method1712(class336.field5314 ? 1 : 0, -66);
        var1.method1712(class127.field2147, arg0 ^ 0xFFFF8CF7);
        var1.method1712(class238.field3932 ? 1 : 0, -105);
        var1.method1712(class14.field152 ? 1 : 0, -114);
        return arg0 == 29513 ? var1 : (class227) null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BJ)Lkh;", line = 88)
    public final class172 method2147(byte arg0, long arg1) {
        class172 var4 = (class172) this.field4839.method1268(-105, arg1);
        if (var4 != null) {
            this.field4838.method911(500, var4);
        }
        int var5 = -2 / ((-arg0 - 34) / 56);
        field4833++;
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(CI)Z", line = 117)
    public static final boolean method2148(char arg0, int arg1) {
        if (arg1 != -1) {
            field4841 = (String) null;
        }
        field4824++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lkh;IJ)V", line = 139)
    public final void method2149(class172 arg0, int arg1, long arg2) {
        if (this.field4836 == 0) {
            class172 var5 = this.field4838.method914(-20217);
            var5.method330(15);
            var5.method1352(-85);
            if (this.field4825 == var5) {
                class172 var6 = this.field4838.method914(arg1 ^ 0x31CA);
                var6.method330(arg1 + 32578);
                var6.method1352(-36);
            }
        } else {
            this.field4836--;
        }
        field4831++;
        this.field4839.method1273(1, arg2, arg0);
        if (arg1 == -32563) {
            this.field4838.method911(500, arg0);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V", line = 168)
    public final void method2150(byte arg0) {
        if (arg0 < 96) {
            this.field4837 = 127;
        }
        field4834++;
        this.field4838.method915((byte) 63);
        this.field4839.method1266(0);
        this.field4825 = new class172();
        this.field4836 = this.field4837;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)Lec;", line = 182)
    public final class45 method2151(int arg0) {
        field4832++;
        if (arg0 != -12417) {
            this.field4838 = (class116) null;
        }
        return this.field4839.method1265(arg0 ^ 0xFFFFCF12);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V", line = 193)
    public static void method2152(byte arg0) {
        field4829 = null;
        field4841 = null;
        field4840 = null;
        field4827 = (int[][]) null;
        if (arg0 != -84) {
            field4841 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)Z", line = 207)
    public static final boolean method2153(int arg0) throws IOException {
        field4828++;
        if (class342.field5449 == null) {
            return false;
        }
        int var1 = class342.field5449.method926(0);
        if (var1 == 0) {
            return false;
        }
        if (class220.field3497 == arg0) {
            var1--;
            class342.field5449.method919(class29.field383.field3793, 0, 1, true);
            class29.field383.field3760 = 0;
            class220.field3497 = class29.field383.method2237(255);
            class223.field3706 = class352.field5578[class220.field3497];
        }
        if (class223.field3706 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class342.field5449.method919(class29.field383.field3793, 0, 1, true);
            class223.field3706 = class29.field383.field3793[0] & 0xFF;
            var1--;
        }
        if (class223.field3706 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class342.field5449.method919(class29.field383.field3793, 0, 2, true);
            var1 -= 2;
            class29.field383.field3760 = 0;
            class223.field3706 = class29.field383.method1765(true);
        }
        if (var1 < class223.field3706) {
            return false;
        }
        class29.field383.field3760 = 0;
        class342.field5449.method919(class29.field383.field3793, 0, class223.field3706, true);
        class116.field1950 = 0;
        class124.field2125 = class340.field5442;
        class340.field5442 = class239.field3934;
        class239.field3934 = class220.field3497;
        if (class220.field3497 == 201) {
            int var366 = class29.field383.method1765(true);
            int var367 = class29.field383.method1715((byte) -95);
            int var368 = class29.field383.method1759(-26608);
            int var369 = class29.field383.method1770(-54);
            if (var368 == 65535) {
                var368 = -1;
            }
            if (class214.method1619(127, var366)) {
                class250 var370 = class13.method74(arg0 ^ 0x76, var367);
                if (var370.field4205) {
                    class240.method1829(var368, 119, var369, var367);
                    class52 var372 = class6.method22(var368, 16430);
                    class233.method1802(var367, (byte) 13, var372.field859, var372.field840, var372.field844);
                    class353.method2495(10, var367, var372.field827, var372.field870, var372.field841);
                } else if (var368 == -1) {
                    var370.field4197 = 0;
                    class220.field3497 = -1;
                    return true;
                } else {
                    class52 var371 = class6.method22(var368, 16430);
                    var370.field4084 = var371.field859;
                    var370.field4240 = var371.field844 * 100 / var369;
                    var370.field4197 = 4;
                    var370.field4238 = var368;
                    var370.field4139 = var371.field840;
                    class205.method1568(var370, (byte) 120);
                }
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 28) {
            class195.field3101 = class29.field383.method1720((byte) -8);
            class221.field3591 = class29.field383.method1720((byte) -124);
            class198.field3159 = class29.field383.method1720((byte) -125);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 27) {
            int var2 = class29.field383.method1765(true);
            class282.method2074(var2, arg0 + 22779);
            class94.field1592[class343.method2418(31, class49.field778++)] = class343.method2418(var2, 32767);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 212) {
            int var3 = class29.field383.method1770(-82);
            class250 var4 = class13.method74(-123, var3);
            for (int var5 = 0; var5 < var4.field4233.length; var5++) {
                var4.field4233[var5] = -1;
                var4.field4233[var5] = 0;
            }
            class205.method1568(var4, (byte) 125);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 114) {
            String var6 = class29.field383.method1758((byte) 62);
            int var7 = class29.field383.method1765(true);
            String var8 = class326.method2298(4575, var7).method1012(class29.field383, (byte) -46);
            class291.method2104(var6, -110, var8, (String) null, var6, 19, var7, 0);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 222) {
            int var361 = class29.field383.method1765(true);
            String var362 = class29.field383.method1758((byte) 64);
            Object[] var363 = new Object[var362.length() + 1];
            for (int var364 = var362.length() - 1; var364 >= 0; var364--) {
                if (var362.charAt(var364) == 's') {
                    var363[var364 + 1] = class29.field383.method1758((byte) 116);
                } else {
                    var363[var364 + 1] = Integer.valueOf(class29.field383.method1715((byte) 99));
                }
            }
            var363[0] = Integer.valueOf(class29.field383.method1715((byte) -97));
            if (class214.method1619(127, var361)) {
                class40 var365 = new class40();
                var365.field581 = var363;
                class29.method183((byte) 122, var365);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 116) {
            int var356 = class29.field383.method1759(-26608);
            int var357 = class29.field383.method1765(true);
            int var358 = class29.field383.method1763((byte) 63);
            int var359 = class29.field383.method1724(79);
            int var360 = class29.field383.method1763((byte) 105);
            if (class214.method1619(127, var358)) {
                class302.method2158(7, var357 | var356 << 16, (byte) -27, var359, var360);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 188) {
            class241.method1835((byte) 120);
            class86.method693(-110);
            class335.field5300 += 32;
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 29) {
            String var343 = class29.field383.method1758((byte) 121);
            boolean var344 = class29.field383.method1720((byte) -70) == 1;
            String var345;
            if (var344) {
                var345 = class29.field383.method1758((byte) 74);
            } else {
                var345 = var343;
            }
            int var346 = class29.field383.method1765(true);
            byte var347 = class29.field383.method1733(0);
            boolean var348 = false;
            if (var347 == -128) {
                var348 = true;
            }
            if (var348) {
                if (class313.field4980 == 0) {
                    class220.field3497 = -1;
                    return true;
                }
                boolean var349 = false;
                int var350;
                for (var350 = 0; class313.field4980 > var350 && (!class306.field4891[var350].field1813.equals(var345) || class306.field4891[var350].field1814 != var346); var350++) {
                }
                if (class313.field4980 > var350) {
                    while ((class313.field4980 - 1) > var350) {
                        class306.field4891[var350] = class306.field4891[var350 + 1];
                        var350++;
                    }
                    class313.field4980--;
                    class306.field4891[class313.field4980] = null;
                }
            } else {
                String var351 = class29.field383.method1758((byte) 125);
                class111 var352 = new class111();
                var352.field1814 = var346;
                var352.field1817 = var343;
                var352.field1819 = var351;
                var352.field1815 = var347;
                var352.field1813 = var345;
                int var353;
                for (var353 = class313.field4980 - 1; var353 >= 0; var353--) {
                    int var354 = class306.field4891[var353].field1813.compareTo(var352.field1813);
                    if (var354 == 0) {
                        class306.field4891[var353].field1814 = var346;
                        class306.field4891[var353].field1815 = var347;
                        class306.field4891[var353].field1819 = var351;
                        if (var345.equals(class6.field55.field4349)) {
                            class296.field4757 = var347;
                        }
                        class220.field3497 = -1;
                        class264.field4426 = class55.field908;
                        return true;
                    }
                    if (var354 < 0) {
                        break;
                    }
                }
                if (class313.field4980 >= class306.field4891.length) {
                    class220.field3497 = -1;
                    return true;
                }
                for (int var355 = class313.field4980 - 1; var355 > var353; var355--) {
                    class306.field4891[var355 + 1] = class306.field4891[var355];
                }
                if (class313.field4980 == 0) {
                    class306.field4891 = new class111[100];
                }
                class306.field4891[var353 + 1] = var352;
                class313.field4980++;
                if (var345.equals(class6.field55.field4349)) {
                    class296.field4757 = var347;
                }
            }
            class264.field4426 = class55.field908;
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 249) {
            int var9 = class29.field383.method1765(true);
            int var10 = class29.field383.method1764(128);
            int var11 = class29.field383.method1766(92);
            int var12 = class29.field383.method1763((byte) 121);
            if ((var11 >> 30) != 0) {
                int var37 = (var11 & 0x35FE3FDD) >> 28;
                int var38 = (var11 & 0x3FFF) - class275.field4546;
                int var39 = (var11 >> 14 & 0x3FFF) - class93.field1562;
                if (var39 >= 0 && var38 >= 0 && var39 < 104 && var38 < 104) {
                    int var40 = var39 * 128 + 64;
                    int var41 = var38 * 128 + 64;
                    class83 var42 = new class83(var9, var37, var40, var41, class271.method2034(-1, var41, var40, var37) - var12, var10, class332.field5261);
                    class189.field3039.method2302((byte) -46, new class231(var42));
                }
            } else if (var11 >> 29 != 0) {
                int var13 = var11 & 0xFFFF;
                class288 var14 = class165.field2621[var13];
                if (var14 != null) {
                    if (var9 == 65535) {
                        var9 = -1;
                    }
                    boolean var15 = true;
                    if (var9 != -1 && var14.field3552 != -1) {
                        if (var14.field3552 == var9) {
                            class94 var16 = class282.method2071(var9, 0);
                            if (var16.field1591 && var16.field1594 != -1) {
                                class43 var17 = class198.method1524(var16.field1594, -68);
                                int var18 = var17.field668;
                                if (var18 == 1) {
                                    var14.field3500 = class332.field5261 + var10;
                                    var14.field3527 = 0;
                                    var15 = false;
                                    var14.field3566 = 0;
                                    var14.field3537 = 0;
                                    var14.field3499 = 1;
                                    class334.method2338(false, var14.field3577, var14.field3511, var14.field3566, (byte) -13, var17);
                                } else if (var18 == 2) {
                                    var14.field3531 = 0;
                                    var15 = false;
                                }
                            }
                        } else {
                            class94 var19 = class282.method2071(var9, arg0 + 1);
                            class94 var20 = class282.method2071(var14.field3552, 0);
                            if (var19.field1594 != -1 && var20.field1594 != -1) {
                                class43 var21 = class198.method1524(var19.field1594, -58);
                                class43 var22 = class198.method1524(var20.field1594, arg0 ^ 0xFFFFFFBC);
                                if (var21.field660 < var22.field660) {
                                    var15 = false;
                                }
                            }
                        }
                    }
                    if (var15) {
                        var14.field3527 = 0;
                        var14.field3552 = var9;
                        var14.field3500 = class332.field5261 + var10;
                        var14.field3499 = 1;
                        var14.field3566 = 0;
                        if (var14.field3500 > class332.field5261) {
                            var14.field3566 = -1;
                        }
                        var14.field3509 = var12;
                        if (var14.field3552 != -1 && class332.field5261 == var14.field3500) {
                            int var23 = class282.method2071(var14.field3552, ~arg0).field1594;
                            if (var23 != -1) {
                                class43 var24 = class198.method1524(var23, -107);
                                if (var24 != null && var24.field677 != null) {
                                    class334.method2338(false, var14.field3577, var14.field3511, 0, (byte) -13, var24);
                                }
                            }
                        }
                    }
                }
            } else if ((var11 >> 28) != 0) {
                int var25 = var11 & 0xFFFF;
                class258 var26;
                if (class261.field4399 == var25) {
                    var26 = class6.field55;
                } else {
                    var26 = class56.field924[var25];
                }
                if (var26 != null) {
                    if (var9 == 65535) {
                        var9 = -1;
                    }
                    boolean var27 = true;
                    if (var9 != -1 && var26.field3552 != -1) {
                        if (var26.field3552 == var9) {
                            class94 var28 = class282.method2071(var9, 0);
                            if (var28.field1591 && var28.field1594 != -1) {
                                class43 var29 = class198.method1524(var28.field1594, 69);
                                int var30 = var29.field668;
                                if (var30 == 1) {
                                    var26.field3527 = 0;
                                    var27 = false;
                                    var26.field3499 = 1;
                                    var26.field3500 = class332.field5261 + var10;
                                    var26.field3566 = 0;
                                    var26.field3537 = 0;
                                    class334.method2338(false, var26.field3577, var26.field3511, var26.field3566, (byte) -13, var29);
                                } else if (var30 == 2) {
                                    var27 = false;
                                    var26.field3531 = 0;
                                }
                            }
                        } else {
                            class94 var31 = class282.method2071(var9, 0);
                            class94 var32 = class282.method2071(var26.field3552, 0);
                            if (var31.field1594 != -1 && var32.field1594 != -1) {
                                class43 var33 = class198.method1524(var31.field1594, arg0 ^ 0xFFFFFF89);
                                class43 var34 = class198.method1524(var32.field1594, 123);
                                if (var33.field660 < var34.field660) {
                                    var27 = false;
                                }
                            }
                        }
                    }
                    if (var27) {
                        var26.field3500 = class332.field5261 + var10;
                        var26.field3552 = var9;
                        var26.field3499 = 1;
                        var26.field3509 = var12;
                        var26.field3566 = 0;
                        var26.field3527 = 0;
                        if (class332.field5261 < var26.field3500) {
                            var26.field3566 = -1;
                        }
                        if (var26.field3552 == 65535) {
                            var26.field3552 = -1;
                        }
                        if (var26.field3552 != -1 && class332.field5261 == var26.field3500) {
                            int var35 = class282.method2071(var26.field3552, 0).field1594;
                            if (var35 != -1) {
                                class43 var36 = class198.method1524(var35, arg0 - 85);
                                if (var36 != null && var36.field677 != null) {
                                    class334.method2338(class6.field55 == var26, var26.field3577, var26.field3511, 0, (byte) -13, var36);
                                }
                            }
                        }
                    }
                }
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 17) {
            int var43 = class29.field383.method1759(-26608);
            int var44 = class29.field383.method1762((byte) 17);
            int var45 = class29.field383.method1759(-26608);
            if (class214.method1619(127, var43)) {
                if (var44 == 2) {
                    class109.method837(true);
                }
                class304.field4870 = var45;
                class336.method2343(false, var45);
                class14.method83((byte) 53, false);
                class240.method1828(-13043, class304.field4870);
                for (int var46 = 0; var46 < 100; var46++) {
                    class270.field4498[var46] = true;
                }
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 195) {
            class264.field4426 = class55.field908;
            if (class223.field3706 == 0) {
                class220.field3497 = -1;
                class321.field5114 = null;
                class313.field4980 = 0;
                class306.field4891 = null;
                class352.field5586 = null;
                return true;
            }
            class321.field5114 = class29.field383.method1758((byte) 83);
            boolean var47 = class29.field383.method1720((byte) -83) == 1;
            if (var47) {
                class29.field383.method1758((byte) -65);
            }
            long var48 = class29.field383.method1734((byte) -7);
            class352.field5586 = class25.method164((byte) -47, var48);
            class135.field2265 = class29.field383.method1733(0);
            int var50 = class29.field383.method1720((byte) -111);
            if (var50 == 255) {
                class220.field3497 = -1;
                return true;
            }
            class313.field4980 = var50;
            class111[] var51 = new class111[100];
            for (int var52 = 0; var52 < class313.field4980; var52++) {
                var51[var52] = new class111();
                var51[var52].field1817 = class29.field383.method1758((byte) 45);
                boolean var53 = class29.field383.method1720((byte) -69) == 1;
                if (var53) {
                    var51[var52].field1813 = class29.field383.method1758((byte) 76);
                } else {
                    var51[var52].field1813 = var51[var52].field1817;
                }
                var51[var52].field1814 = class29.field383.method1765(true);
                var51[var52].field1815 = class29.field383.method1733(0);
                var51[var52].field1819 = class29.field383.method1758((byte) 106);
                if (var51[var52].field1813.equals(class6.field55.field4349)) {
                    class296.field4757 = var51[var52].field1815;
                }
            }
            boolean var54 = false;
            int var55 = class313.field4980;
            while (var55 > 0) {
                boolean var56 = true;
                var55--;
                for (int var57 = 0; var57 < var55; var57++) {
                    if (var51[var57].field1817.compareTo(var51[var57 + 1].field1817) > 0) {
                        class111 var58 = var51[var57];
                        var51[var57] = var51[var57 + 1];
                        var56 = false;
                        var51[var57 + 1] = var58;
                    }
                }
                if (var56) {
                    break;
                }
            }
            class306.field4891 = var51;
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 123) {
            int var59 = class29.field383.method1762((byte) 17);
            int var60 = class29.field383.method1765(true);
            class151.method1162(0, var60, var59);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 241) {
            int var337 = class29.field383.method1708((byte) 103);
            int var338 = class29.field383.method1715((byte) -123);
            String var339 = "";
            String var340 = var339;
            int var341 = class29.field383.method1720((byte) -108);
            if ((var341 & 0x1) != 0) {
                var339 = class29.field383.method1758((byte) -46);
                if ((var341 & 0x2) == 0) {
                    var340 = var339;
                } else {
                    var340 = class29.field383.method1758((byte) 62);
                }
            }
            String var342 = class29.field383.method1758((byte) 109);
            if (!var340.equals("") && class57.method481(true, var340)) {
                class220.field3497 = -1;
                return true;
            } else {
                class35.method241(arg0 + 2, var338, var342, var337, var339, var340);
                class220.field3497 = -1;
                return true;
            }
        } else if (class220.field3497 == 235) {
            class130.method994(30925);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 196) {
            class103.field1675 = class29.field383.method1720((byte) -126);
            class336.field5308 = class29.field383.method1762((byte) 17);
            while (class223.field3706 > class29.field383.field3760) {
                class220.field3497 = class29.field383.method1720((byte) -117);
                class229.method1777(0);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 61) {
            int var61 = class29.field383.method1765(true);
            int var62 = class29.field383.method1724(103);
            if (class214.method1619(arg0 + 128, var61)) {
                int var63 = 0;
                if (class6.field55.field4316 != null) {
                    var63 = class6.field55.field4316.method907(1073741824);
                }
                class302.method2158(3, var63, (byte) 121, var62, -1);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 239) {
            for (int var64 = 0; var64 < class56.field924.length; var64++) {
                if (class56.field924[var64] != null) {
                    class56.field924[var64].field3547 = -1;
                }
            }
            for (int var65 = 0; var65 < class165.field2621.length; var65++) {
                if (class165.field2621[var65] != null) {
                    class165.field2621[var65].field3547 = -1;
                }
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 41) {
            class338.field5387 = class29.field383.method1720((byte) -19);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 185) {
            class74.method620((byte) -114);
            class220.field3497 = -1;
            return false;
        } else if (class220.field3497 == 237 || class220.field3497 == 173 || class220.field3497 == 54 || class220.field3497 == 38 || class220.field3497 == 236 || class220.field3497 == 168 || class220.field3497 == 36 || class220.field3497 == 209 || class220.field3497 == 7 || class220.field3497 == 97 || class220.field3497 == 88 || class220.field3497 == 244 || class220.field3497 == 208 || class220.field3497 == 81) {
            class229.method1777(0);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 189) {
            class332.method2330(121, class223.field3706, class29.field383, class128.field2163);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 107) {
            int var66 = class29.field383.method1766(113);
            int var67 = class29.field383.method1764(128);
            if (var67 == 65535) {
                var67 = -1;
            }
            int var68 = class29.field383.method1759(-26608);
            if (var68 == 65535) {
                var68 = -1;
            }
            int var69 = class29.field383.method1766(81);
            int var70 = class29.field383.method1765(true);
            if (class214.method1619(127, var70)) {
                for (int var71 = var67; var71 <= var68; var71++) {
                    long var72 = ((long) var66 << 32) + ((long) var71);
                    class105 var74 = (class105) class344.field5473.method1268(-119, var72);
                    class105 var75;
                    if (var74 != null) {
                        var75 = new class105(var69, var74.field1705);
                        var74.method330(15);
                    } else if (var71 == -1) {
                        var75 = new class105(var69, class13.method74(-64, var66).field4155.field1705);
                    } else {
                        var75 = new class105(var69, -1);
                    }
                    class344.field5473.method1273(1, var72, var75);
                }
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 23) {
            int var76 = class29.field383.method1759(-26608);
            int var77 = class29.field383.method1724(121);
            int var78 = class29.field383.method1759(-26608);
            if (class214.method1619(127, var76)) {
                class117.method925(var77, arg0 + 15, var78);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 9) {
            int var333 = class29.field383.method1770(-108);
            int var334 = class29.field383.method1759(-26608);
            int var335 = class29.field383.method1769(-30726);
            int var336 = class29.field383.method1737((byte) -125);
            if (class214.method1619(127, var334)) {
                class354.method2505(arg0 ^ 0xFFFFB226, var335, var333, var336);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 2) {
            int var79 = class29.field383.method1765(true);
            int var80 = class29.field383.method1764(arg0 + 129);
            int var81 = class29.field383.method1748(arg0 + 4);
            class288 var82 = class165.field2621[var79];
            if (var82 != null) {
                class339.method2385(var81, var82, var80, 89);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 229) {
            int var83 = class29.field383.method1763((byte) 127);
            int var84 = class29.field383.method1763((byte) 65);
            int var85 = class29.field383.method1763((byte) 99);
            int var86 = class29.field383.method1715((byte) -113);
            if (class214.method1619(127, var84)) {
                class141.method1088((var83 << 16) + var85, true, var86);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 52) {
            int var87 = class29.field383.method1720((byte) -100);
            String var88 = class29.field383.method1758((byte) -123);
            boolean var89 = (var87 & 0x1) == 1;
            String var90 = class29.field383.method1758((byte) 101);
            String var91 = class29.field383.method1758((byte) 49);
            String var92 = class29.field383.method1758((byte) 122);
            if (var89) {
                for (int var93 = 0; var93 < class93.field1561; var93++) {
                    if (class210.field3364[var93].equals(var92)) {
                        class239.field3946[var93] = var88;
                        if (var90.equals("")) {
                            class210.field3364[var93] = var88;
                        } else {
                            class210.field3364[var93] = var90;
                        }
                        class92.field1553[var93] = var91;
                        if (var92.equals("")) {
                            class330.field5238[var93] = var91;
                        } else {
                            class330.field5238[var93] = var92;
                        }
                        break;
                    }
                }
            } else {
                class239.field3946[class93.field1561] = var88;
                if (var90.equals("")) {
                    class210.field3364[class93.field1561] = var88;
                } else {
                    class210.field3364[class93.field1561] = var90;
                }
                class92.field1553[class93.field1561] = var91;
                if (var92.equals("")) {
                    class330.field5238[class93.field1561] = var91;
                } else {
                    class330.field5238[class93.field1561] = var92;
                }
                class362.field5745[class93.field1561] = class343.method2418(2, var87) == 2;
                class93.field1561++;
            }
            class44.field683 = class55.field908;
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 117) {
            int var94 = class29.field383.method1715((byte) -110);
            int var95 = class29.field383.method1759(-26608);
            int var96 = class29.field383.method1759(-26608);
            if (var96 == 65535) {
                var96 = -1;
            }
            if (class214.method1619(127, var95)) {
                class302.method2158(2, var96, (byte) -45, var94, -1);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 148) {
            class163.method1260(1);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 26) {
            if (class89.field1502 != null) {
                class272.method2043(class267.field4462, -1, -1, false, -1);
            }
            byte[] var97 = new byte[class223.field3706];
            class29.field383.method2236((byte) -115, var97, class223.field3706, 0);
            String var98 = class166.method1289(0, var97, class223.field3706, arg0 ^ 0x7C);
            if (class241.field3994 == null && class145.field2343 == 3 || !class145.field2360.startsWith("win") || class247.field4046) {
                class342.method2413(var98, true, 4940);
            } else {
                class25.field305 = true;
                class311.field4955 = var98;
                class66.field1176 = class128.field2163.method1117((byte) 44, var98);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 73) {
            int var99 = class29.field383.method1759(-26608);
            byte var100 = class29.field383.method1760(-14224);
            int var101 = class29.field383.method1759(-26608);
            if (class214.method1619(arg0 ^ 0xFFFFFF80, var99)) {
                class339.method2383(var101, var100, (byte) 25);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 167) {
            int var332 = class29.field383.method1715((byte) 76);
            class195.field3102 = class128.field2163.method1122(-40, var332);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 78) {
            class86.method693(-90);
            class220.field3512 = class29.field383.method1769(-30726);
            class200.field3182 = class55.field908;
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 112) {
            if (class304.field4870 != -1) {
                class32.method221(class304.field4870, -32471, 0);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 40) {
            int var329 = class29.field383.method1765(true);
            int var330 = class29.field383.method1765(true);
            int var331 = class29.field383.method1766(arg0 ^ 0xFFFFFFAC);
            if (class214.method1619(127, var330)) {
                class272.method2042(var331, false, var329);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 233) {
            int var326 = class29.field383.method1770(arg0 ^ 0x7F);
            int var327 = class29.field383.method1765(true);
            int var328 = class29.field383.method1765(true);
            if (var328 == 65535) {
                var328 = -1;
            }
            if (class214.method1619(127, var327)) {
                class302.method2158(1, var328, (byte) -109, var326, -1);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 144) {
            int var323 = class29.field383.method1765(true);
            int var324 = class29.field383.method1770(-57);
            int var325 = class29.field383.method1764(128);
            if (class214.method1619(arg0 + 128, var325)) {
                class3.method14(var324, arg0 + 13, var323);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 183) {
            int var102 = class29.field383.method1763((byte) 86);
            int var103 = class29.field383.method1759(arg0 - 26607);
            String var104 = class29.field383.method1758((byte) -72);
            if (class214.method1619(arg0 ^ 0xFFFFFF80, var102)) {
                class305.method2177(var104, var103, 100);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 160) {
            int var319 = class29.field383.method1720((byte) -81);
            String var320 = class29.field383.method1758((byte) 97);
            int var321 = class29.field383.method1763((byte) 111);
            int var322 = class29.field383.method1762((byte) 17);
            if (var321 == 65535) {
                var321 = -1;
            }
            if (var319 >= 1 && var319 <= 8) {
                if (var320.equalsIgnoreCase("null")) {
                    var320 = null;
                }
                class187.field3001[var319 - 1] = var320;
                class352.field5576[var319 - 1] = var321;
                class215.field3443[var319 - 1] = var322 == 0;
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 199) {
            int var314 = class29.field383.method1763((byte) 109);
            int var315 = class29.field383.method1724(arg0 + 104);
            int var316 = class29.field383.method1759(-26608);
            int var317 = class29.field383.method1763((byte) 61);
            int var318 = class29.field383.method1764(128);
            if (class214.method1619(arg0 + 128, var318)) {
                class233.method1802(var315, (byte) 13, var317, var316, var314);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 143) {
            int var105 = class29.field383.method1765(true);
            if (class214.method1619(127, var105)) {
                class194.method1503((byte) -49);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 13) {
            int var307 = class29.field383.method1770(arg0 ^ 0x43);
            int var308 = class29.field383.method1765(true);
            int var309 = class29.field383.method1766(107);
            if (class214.method1619(127, var308)) {
                class259 var310 = (class259) class226.field3723.method1268(112, (long) var307);
                class259 var311 = (class259) class226.field3723.method1268(-128, (long) var309);
                if (var311 != null) {
                    class237.method1815(var310 == null || var310.field4358 != var311.field4358, var311, (byte) 57);
                }
                if (var310 != null) {
                    var310.method330(15);
                    class226.field3723.method1273(1, (long) var309, var310);
                }
                class250 var312 = class13.method74(-70, var307);
                if (var312 != null) {
                    class205.method1568(var312, (byte) 119);
                }
                class250 var313 = class13.method74(arg0 - 30, var309);
                if (var313 != null) {
                    class205.method1568(var313, (byte) 121);
                    class278.method2057(var313, true, -121);
                }
                if (class304.field4870 != -1) {
                    class32.method221(class304.field4870, -32471, 1);
                }
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 72) {
            boolean var289 = class29.field383.method1720((byte) -48) == 1;
            String var290 = class29.field383.method1758((byte) 104);
            String var291 = class29.field383.method1758((byte) -48);
            int var292 = class29.field383.method1765(true);
            int var293 = class29.field383.method1720((byte) -71);
            boolean var294 = false;
            String var295 = "";
            if (var292 > 0) {
                var295 = class29.field383.method1758((byte) -98);
                var294 = class29.field383.method1720((byte) -70) == 1;
            }
            for (int var296 = 0; var296 < class38.field570; var296++) {
                if (var289) {
                    if (var291.equals(class241.field3986[var296])) {
                        class241.field3986[var296] = var290;
                        class121.field2021[var296] = var291;
                        var290 = null;
                        break;
                    }
                } else if (var290.equals(class241.field3986[var296])) {
                    if (class65.field1147[var296] != var292) {
                        class65.field1147[var296] = var292;
                        if (var292 > 0) {
                            class35.method241(arg0 + 2, 0, var290 + class298.field4789, 5, "", "");
                        }
                        if (var292 == 0) {
                            class35.method241(arg0 ^ 0xFFFFFFFE, 0, var290 + class253.field4272, 5, "", "");
                        }
                    }
                    var290 = null;
                    class121.field2021[var296] = var291;
                    class128.field2169[var296] = var295;
                    class162.field2570[var296] = var293;
                    class92.field1560[var296] = var294;
                    break;
                }
            }
            boolean var297 = false;
            if (var290 != null && class38.field570 < 200) {
                class241.field3986[class38.field570] = var290;
                class121.field2021[class38.field570] = var291;
                class65.field1147[class38.field570] = var292;
                class128.field2169[class38.field570] = var295;
                class162.field2570[class38.field570] = var293;
                class92.field1560[class38.field570] = var294;
                class38.field570++;
            }
            int var298 = class38.field570;
            class44.field683 = class55.field908;
            while (var298 > 0) {
                boolean var299 = true;
                var298--;
                for (int var300 = 0; var300 < var298; var300++) {
                    if (class65.field1147[var300] != class259.field4360 && class65.field1147[var300 + 1] == class259.field4360 || class65.field1147[var300] == 0 && class65.field1147[var300 + 1] != 0) {
                        var299 = false;
                        int var301 = class65.field1147[var300];
                        class65.field1147[var300] = class65.field1147[var300 + 1];
                        class65.field1147[var300 + 1] = var301;
                        String var302 = class128.field2169[var300];
                        class128.field2169[var300] = class128.field2169[var300 + 1];
                        class128.field2169[var300 + 1] = var302;
                        String var303 = class241.field3986[var300];
                        class241.field3986[var300] = class241.field3986[var300 + 1];
                        class241.field3986[var300 + 1] = var303;
                        String var304 = class121.field2021[var300];
                        class121.field2021[var300] = class121.field2021[var300 + 1];
                        class121.field2021[var300 + 1] = var304;
                        int var305 = class162.field2570[var300];
                        class162.field2570[var300] = class162.field2570[var300 + 1];
                        class162.field2570[var300 + 1] = var305;
                        boolean var306 = class92.field1560[var300];
                        class92.field1560[var300] = class92.field1560[var300 + 1];
                        class92.field1560[var300 + 1] = var306;
                    }
                }
                if (var299) {
                    break;
                }
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 122) {
            class293.field4740 = class29.field383.method1720((byte) -9);
            class220.field3497 = -1;
            class44.field683 = class55.field908;
            return true;
        } else if (class220.field3497 == 22) {
            int var106 = class29.field383.method1765(true);
            int var107 = class29.field383.method1720((byte) -102);
            int var108 = class29.field383.method1720((byte) -111);
            int var109 = class29.field383.method1765(true);
            int var110 = class29.field383.method1720((byte) -50);
            int var111 = class29.field383.method1720((byte) -108);
            if (class214.method1619(127, var106)) {
                class19.method105(var109, var108, -129, var111, var110, var107);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 214) {
            int var112 = class29.field383.method1715((byte) 78);
            int var113 = class29.field383.method1763((byte) 115);
            class151.method1162(0, var113, var112);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 182) {
            int var287 = class29.field383.method1764(arg0 ^ 0xFFFFFF7F);
            byte var288 = class29.field383.method1733(0);
            class245.method1875((byte) -124, var288, var287);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 30) {
            class86.method693(-118);
            int var283 = class29.field383.method1748(3);
            int var284 = class29.field383.method1750(17852);
            int var285 = class29.field383.method1724(92);
            class320.field5094[var284] = var285;
            class57.field980[var284] = var283;
            class12.field119[var284] = 1;
            for (int var286 = 0; var286 < 98; var286++) {
                if (class354.field5616[var286] <= var285) {
                    class12.field119[var284] = var286 + 2;
                }
            }
            class231.field3841[class343.method2418(class25.field314++, 31)] = var284;
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 108) {
            int var114 = class29.field383.method1763((byte) 75);
            if (var114 == 65535) {
                var114 = -1;
            }
            int var115 = class29.field383.method1762((byte) 17);
            int var116 = var115 >> 2;
            int var117 = var115 & 0x3;
            int var118 = class285.field4651[var116];
            int var119 = class29.field383.method1770(-45);
            int var120 = (var119 & 0x3D987D67) >> 28;
            int var121 = var119 & 0x3FFF;
            int var122 = var119 >> 14 & 0x3FFF;
            int var123 = var122 - class93.field1562;
            int var124 = var121 - class275.field4546;
            class334.method2337(var123, var117, (byte) 120, var118, var120, var124, var116, var114);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 181) {
            class296.method2125((byte) -105, false);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 155) {
            int var281 = class29.field383.method1724(76);
            int var282 = class29.field383.method1765(true);
            if (class214.method1619(arg0 ^ 0xFFFFFF80, var282)) {
                class302.method2158(5, 2047, (byte) -57, var281, 0);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 119) {
            int var279 = class29.field383.method1750(17852);
            int var280 = class29.field383.method1763((byte) 88);
            if (class214.method1619(arg0 ^ 0xFFFFFF80, var280)) {
                class342.field5454 = var279;
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 49) {
            class29.field383.field3760 += 28;
            if (class29.field383.method1756(-50)) {
                class311.method2209(class29.field383.field3760 - 28, class29.field383, 0);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 153) {
            int var125 = class29.field383.method1715((byte) 50);
            int var126 = class29.field383.method1765(true);
            class250 var127;
            if (var125 < 0) {
                var127 = null;
            } else {
                var127 = class13.method74(-94, var125);
            }
            if (var127 != null) {
                for (int var128 = 0; var128 < var127.field4233.length; var128++) {
                    var127.field4233[var128] = 0;
                    var127.field4177[var128] = 0;
                }
            }
            if (var125 < -70000) {
                var126 += 32768;
            }
            class142.method1097(-14113, var126);
            int var129 = class29.field383.method1765(true);
            for (int var130 = 0; var130 < var129; var130++) {
                int var131 = class29.field383.method1748(3);
                if (var131 == 255) {
                    var131 = class29.field383.method1715((byte) -123);
                }
                int var132 = class29.field383.method1763((byte) 118);
                if (var127 != null && var127.field4233.length > var130) {
                    var127.field4233[var130] = var132;
                    var127.field4177[var130] = var131;
                }
                class350.method2465(var130, var132 - 1, var131, (byte) 109, var126);
            }
            if (var127 != null) {
                class205.method1568(var127, (byte) 118);
            }
            class86.method693(-102);
            class94.field1592[class343.method2418(31, class49.field778++)] = class343.method2418(var126, 32767);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 70) {
            int var276 = class29.field383.method1715((byte) -124);
            int var277 = class29.field383.method1764(arg0 + 129);
            int var278 = class29.field383.method1759(-26608);
            if (class214.method1619(arg0 + 128, var277)) {
                class339.method2383(var278, var276, (byte) 25);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 33) {
            boolean var263 = class29.field383.method1720((byte) -123) == 1;
            String var264 = class29.field383.method1758((byte) 76);
            String var265 = var264;
            if (var263) {
                var265 = class29.field383.method1758((byte) 46);
            }
            boolean var266 = false;
            long var267 = (long) class29.field383.method1765(true);
            long var269 = (long) class29.field383.method1736(255);
            long var271 = (var267 << 32) + var269;
            int var273 = class29.field383.method1720((byte) -121);
            int var274 = 0;
            while (true) {
                if (var274 < 100) {
                    if (class4.field40[var274] != var271) {
                        var274++;
                        continue;
                    }
                    var266 = true;
                    break;
                }
                if (var273 <= 1) {
                    if (!(!class322.field5124 || class93.field1568) || class314.field4991) {
                        var266 = true;
                    } else if (class57.method481(true, var265)) {
                        var266 = true;
                    }
                }
                break;
            }
            if (!var266 && class272.field4518 == 0) {
                class4.field40[class339.field5411] = var271;
                class339.field5411 = (class339.field5411 + 1) % 100;
                String var275 = class171.method1348(class123.method970(false, class254.method1961(249, class29.field383)));
                if (var273 == 2) {
                    class291.method2104("<img=1>" + var264, arg0 - 88, var275, (String) null, "<img=1>" + var265, 7, -1, 0);
                } else if (var273 == 1) {
                    class291.method2104("<img=0>" + var264, -115, var275, (String) null, "<img=0>" + var265, 7, -1, 0);
                } else {
                    class291.method2104(var264, arg0 - 95, var275, (String) null, var265, 3, -1, 0);
                }
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 60) {
            class282.method2072(class29.field383.method1758((byte) 83), arg0 + 7876);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 51) {
            int var259 = class29.field383.method1766(arg0 + 82);
            int var260 = class29.field383.method1763((byte) 117);
            int var261 = class29.field383.method1770(arg0 ^ 0x3C);
            int var262 = class29.field383.method1765(true);
            if (class214.method1619(127, var262)) {
                class302.method2158(5, var260, (byte) -37, var259, var261);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 149) {
            int var133 = class29.field383.method1765(true);
            int var134 = class29.field383.method1759(-26608);
            int var135 = class29.field383.method1764(arg0 ^ 0xFFFFFF7F);
            if (class214.method1619(arg0 ^ 0xFFFFFF80, var135)) {
                class38.method248(var134, var133, -3);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 76) {
            if (class223.field3706 == 0) {
                class51.field800 = class74.field1260;
            } else {
                class51.field800 = class29.field383.method1758((byte) -105);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 0) {
            int var256 = class29.field383.method1759(-26608);
            String var257 = class29.field383.method1758((byte) -109);
            int var258 = class29.field383.method1770(-41);
            if (class214.method1619(arg0 + 128, var256)) {
                class229.method1775(var257, var258, (byte) 65);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 98) {
            int var136 = class29.field383.method1765(true);
            int var137 = class29.field383.method1715((byte) -92);
            if (class214.method1619(127, var136)) {
                class259 var138 = (class259) class226.field3723.method1268(arg0 ^ 0xFFFFFF99, (long) var137);
                if (var138 != null) {
                    class237.method1815(true, var138, (byte) 57);
                }
                if (class187.field3005 != null) {
                    class205.method1568(class187.field3005, (byte) 121);
                    class187.field3005 = null;
                }
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 228) {
            class103.field1675 = class29.field383.method1748(3);
            class336.field5308 = class29.field383.method1748(3);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 166) {
            int var139 = class29.field383.method1715((byte) 64);
            int var140 = class29.field383.method1765(true);
            if (var139 < -70000) {
                var140 += 32768;
            }
            class250 var141;
            if (var139 >= 0) {
                var141 = class13.method74(-111, var139);
            } else {
                var141 = null;
            }
            while (class29.field383.field3760 < class223.field3706) {
                int var142 = class29.field383.method1708((byte) 103);
                int var143 = class29.field383.method1765(true);
                int var144 = 0;
                if (var143 != 0) {
                    var144 = class29.field383.method1720((byte) -68);
                    if (var144 == 255) {
                        var144 = class29.field383.method1715((byte) -99);
                    }
                }
                if (var141 != null && var142 >= 0 && var142 < var141.field4233.length) {
                    var141.field4233[var142] = var143;
                    var141.field4177[var142] = var144;
                }
                class350.method2465(var142, var143 - 1, var144, (byte) 113, var140);
            }
            if (var141 != null) {
                class205.method1568(var141, (byte) 126);
            }
            class86.method693(-101);
            class94.field1592[class343.method2418(class49.field778++, 31)] = class343.method2418(var140, 32767);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 120) {
            class86.method693(-110);
            class122.field2098 = class29.field383.method1720((byte) -67);
            class200.field3182 = class55.field908;
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 34) {
            class247.field4042 = class29.field383.method1763((byte) 101) * 30;
            class220.field3497 = -1;
            class200.field3182 = class55.field908;
            return true;
        } else if (class220.field3497 == 162) {
            boolean var145 = class29.field383.method1720((byte) -59) == 1;
            String var146 = class29.field383.method1758((byte) -97);
            String var147 = var146;
            if (var145) {
                var147 = class29.field383.method1758((byte) -50);
            }
            boolean var148 = false;
            long var149 = class29.field383.method1734((byte) -107);
            long var151 = (long) class29.field383.method1765(true);
            long var153 = (long) class29.field383.method1736(arg0 + 256);
            int var155 = class29.field383.method1720((byte) -28);
            long var156 = (var151 << 32) + var153;
            int var158 = 0;
            while (true) {
                if (var158 < 100) {
                    if (class4.field40[var158] != var156) {
                        var158++;
                        continue;
                    }
                    var148 = true;
                    break;
                }
                if (var155 <= 1) {
                    if (!(!class322.field5124 || class93.field1568) || class314.field4991) {
                        var148 = true;
                    } else if (class57.method481(true, var147)) {
                        var148 = true;
                    }
                }
                break;
            }
            if (!var148 && class272.field4518 == 0) {
                class4.field40[class339.field5411] = var156;
                class339.field5411 = (class339.field5411 + 1) % 100;
                String var159 = class171.method1348(class123.method970(false, class254.method1961(249, class29.field383)));
                if (var155 == 2 || var155 == 3) {
                    class291.method2104("<img=1>" + var146, arg0 ^ 0x66, var159, class111.method841(37, var149), "<img=1>" + var147, 9, -1, 0);
                } else if (var155 == 1) {
                    class291.method2104("<img=0>" + var146, -117, var159, class111.method841(arg0 ^ 0xFFFFFFDA, var149), "<img=0>" + var147, 9, -1, 0);
                } else {
                    class291.method2104(var146, arg0 ^ 0x5C, var159, class111.method841(37, var149), var147, 9, -1, 0);
                }
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 145) {
            class296.method2125((byte) -105, true);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 31) {
            for (int var255 = 0; var255 < class66.field1178.length; var255++) {
                if (class66.field1178[var255] != class273.field4527[var255]) {
                    class66.field1178[var255] = class273.field4527[var255];
                    class190.method1495(var255, (byte) 19);
                    class19.field214[class343.method2418(class335.field5300++, 31)] = var255;
                }
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 95) {
            int var160 = class29.field383.method1720((byte) -25);
            if (class29.field383.method1720((byte) -26) == 0) {
                class61.field1025[var160] = new class205();
            } else {
                class29.field383.field3760--;
                class61.field1025[var160] = new class205(class29.field383);
            }
            class332.field5271 = class55.field908;
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 96) {
            int var254 = class29.field383.method1765(true);
            if (class214.method1619(127, var254)) {
                class317.method2243(0);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 24) {
            class93.field1561 = class29.field383.method1720((byte) -101);
            for (int var253 = 0; var253 < class93.field1561; var253++) {
                class239.field3946[var253] = class29.field383.method1758((byte) 93);
                class210.field3364[var253] = class29.field383.method1758((byte) -108);
                if (class210.field3364[var253].equals("")) {
                    class210.field3364[var253] = class239.field3946[var253];
                }
                class92.field1553[var253] = class29.field383.method1758((byte) 67);
                class330.field5238[var253] = class29.field383.method1758((byte) 117);
                if (class330.field5238[var253].equals("")) {
                    class330.field5238[var253] = class92.field1553[var253];
                }
                class362.field5745[var253] = false;
            }
            class220.field3497 = -1;
            class44.field683 = class55.field908;
            return true;
        } else if (class220.field3497 == 77) {
            int var251 = class29.field383.method1720((byte) -24);
            int var252 = class29.field383.method1759(arg0 - 26607);
            if (var252 == 65535) {
                var252 = -1;
            }
            class235.method1806(var251, var252, (byte) -109);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 80) {
            int var248 = class29.field383.method1764(arg0 ^ 0xFFFFFF7F);
            int var249 = class29.field383.method1723(120);
            if (var248 == 65535) {
                var248 = -1;
            }
            int var250 = class29.field383.method1762((byte) 17);
            class302.method2161(var249, (byte) -126, var250, var248);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 75) {
            boolean var161 = class29.field383.method1720((byte) -59) == 1;
            String var162 = class29.field383.method1758((byte) 115);
            String var163 = var162;
            if (var161) {
                var163 = class29.field383.method1758((byte) -115);
            }
            long var164 = class29.field383.method1734((byte) 109);
            long var166 = (long) class29.field383.method1765(true);
            long var168 = (long) class29.field383.method1736(arg0 ^ 0xFFFFFF00);
            int var170 = class29.field383.method1720((byte) -49);
            long var171 = (var166 << 32) + var168;
            boolean var173 = false;
            int var174 = class29.field383.method1765(true);
            int var175 = 0;
            while (true) {
                if (var175 >= 100) {
                    if (var170 <= 1 && class57.method481(true, var163)) {
                        var173 = true;
                    }
                    break;
                }
                if (class4.field40[var175] == var171) {
                    var173 = true;
                    break;
                }
                var175++;
            }
            if (!var173 && class272.field4518 == 0) {
                class4.field40[class339.field5411] = var171;
                class339.field5411 = (class339.field5411 + 1) % 100;
                String var176 = class326.method2298(4575, var174).method1012(class29.field383, (byte) -46);
                if (var170 == 2) {
                    class291.method2104("<img=1>" + var162, -89, var176, class111.method841(arg0 ^ 0xFFFFFFDA, var164), "<img=1>" + var163, 20, var174, 0);
                } else if (var170 == 1) {
                    class291.method2104("<img=0>" + var162, arg0 - 110, var176, class111.method841(37, var164), "<img=0>" + var163, 20, var174, 0);
                } else {
                    class291.method2104(var162, arg0 ^ 0x5B, var176, class111.method841(arg0 ^ 0xFFFFFFDA, var164), var163, 20, var174, 0);
                }
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 58) {
            class336.field5308 = class29.field383.method1720((byte) -91);
            class103.field1675 = class29.field383.method1748(3);
            for (int var245 = class336.field5308; var245 < (class336.field5308 + 8); var245++) {
                for (int var246 = class103.field1675; var246 < (class103.field1675 + 8); var246++) {
                    if (class211.field3372[class186.field2991][var245][var246] != null) {
                        class211.field3372[class186.field2991][var245][var246] = null;
                        class352.method2483(var245, var246, (byte) -105);
                    }
                }
            }
            for (class304 var247 = (class304) class156.field2468.method2300((byte) 110); var247 != null; var247 = (class304) class156.field2468.method2306(-23)) {
                if (class336.field5308 <= var247.field4871 && (class336.field5308 + 8) > var247.field4871 && class103.field1675 <= var247.field4885 && class103.field1675 + 8 > var247.field4885 && class186.field2991 == var247.field4876) {
                    var247.field4877 = 0;
                }
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 127) {
            int var242 = class29.field383.method1766(109);
            int var243 = class29.field383.method1764(128);
            int var244 = class29.field383.method1720((byte) -21);
            if (class214.method1619(127, var243)) {
                class274.method2049(var244, arg0 ^ 0xFFFFFFF4, var242);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 245) {
            String var177 = class29.field383.method1758((byte) 55);
            String var178 = class171.method1348(class123.method970(false, class254.method1961(249, class29.field383)));
            class35.method241(1, 0, var178, 6, var177, var177);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 16) {
            int var179 = class29.field383.method1762((byte) 17);
            int var180 = class29.field383.method1750(17852);
            int var181 = class29.field383.method1748(3);
            class186.field2991 = var180 >> 1;
            class6.field55.method1981(var179, var181, (var180 & 0x1) == 1, (byte) -67);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 138) {
            int var232 = class29.field383.method1763((byte) 114);
            if (var232 == 65535) {
                var232 = -1;
            }
            int var233 = class29.field383.method1759(-26608);
            int var234 = class29.field383.method1763((byte) 49);
            if (var233 == 65535) {
                var233 = -1;
            }
            int var235 = class29.field383.method1724(107);
            int var236 = class29.field383.method1763((byte) 69);
            if (class214.method1619(127, var234)) {
                for (int var237 = var233; var237 <= var232; var237++) {
                    long var238 = ((long) var235 << 32) + (long) var237;
                    class105 var240 = (class105) class344.field5473.method1268(-20, var238);
                    class105 var241;
                    if (var240 != null) {
                        var241 = new class105(var240.field1710, var236);
                        var240.method330(15);
                    } else if (var237 == -1) {
                        var241 = new class105(class13.method74(-10, var235).field4155.field1710, var236);
                    } else {
                        var241 = new class105(0, var236);
                    }
                    class344.field5473.method1273(1, var238, var241);
                }
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 15) {
            int var182 = class29.field383.method1724(124);
            int var183 = class29.field383.method1763((byte) 120);
            class245.method1875((byte) -124, var182, var183);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 225) {
            int var229 = class29.field383.method1720((byte) -53);
            int var230 = class29.field383.method1720((byte) -18);
            byte var231 = class29.field383.method1733(0);
            if (class277.field4565 != var231) {
                class220.field3497 = -1;
                return true;
            }
            if (var229 == 255) {
                class335.field5305 = 0;
                class241.field3988 = 0;
                class326.field5182 = false;
            } else {
                class335.field5305 = var230;
                class326.field5182 = true;
                class241.field3988 = var229;
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 219) {
            int var184 = class29.field383.method1765(true);
            int var185 = class29.field383.method1720((byte) -72);
            int var186 = class29.field383.method1720((byte) -50);
            int var187 = class29.field383.method1720((byte) -33);
            int var188 = class29.field383.method1720((byte) -94);
            int var189 = class29.field383.method1765(true);
            if (class214.method1619(127, var184)) {
                class78.field1353[var185] = true;
                class336.field5313[var185] = var186;
                class34.field505[var185] = var187;
                class338.field5389[var185] = var188;
                class194.field3094[var185] = var189;
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 129) {
            boolean var190 = class29.field383.method1720((byte) -23) == 1;
            String var191 = class29.field383.method1758((byte) 99);
            String var192 = var191;
            if (var190) {
                var192 = class29.field383.method1758((byte) -57);
            }
            long var193 = (long) class29.field383.method1765(true);
            long var195 = (long) class29.field383.method1736(255);
            int var197 = class29.field383.method1720((byte) -53);
            int var198 = class29.field383.method1765(true);
            long var199 = (var193 << 32) + var195;
            boolean var201 = false;
            int var202 = 0;
            while (true) {
                if (var202 < 100) {
                    if (class4.field40[var202] != var199) {
                        var202++;
                        continue;
                    }
                    var201 = true;
                    break;
                }
                if (var197 <= 1 && class57.method481(true, var192)) {
                    var201 = true;
                }
                break;
            }
            if (!var201 && class272.field4518 == 0) {
                class4.field40[class339.field5411] = var199;
                class339.field5411 = (class339.field5411 + 1) % 100;
                String var203 = class326.method2298(4575, var198).method1012(class29.field383, (byte) -46);
                if (var197 == 2) {
                    class291.method2104("<img=1>" + var191, -115, var203, (String) null, "<img=1>" + var192, 18, var198, 0);
                } else if (var197 == 1) {
                    class291.method2104("<img=0>" + var191, -106, var203, (String) null, "<img=0>" + var192, 18, var198, 0);
                } else {
                    class291.method2104(var191, arg0 - 96, var203, (String) null, var192, 18, var198, 0);
                }
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 179) {
            int var225 = class29.field383.method1765(true);
            int var226 = class29.field383.method1720((byte) -103);
            int var227 = class29.field383.method1765(true);
            if (var225 == 65535) {
                var225 = -1;
            }
            int var228 = class29.field383.method1720((byte) -86);
            class309.method2195(var225, var227, (byte) -125, var228, var226);
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 125) {
            int var204 = class29.field383.method1765(true);
            int var205 = class29.field383.method1720((byte) -18);
            int var206 = class29.field383.method1720((byte) -106);
            int var207 = class29.field383.method1765(true);
            int var208 = class29.field383.method1720((byte) -40);
            int var209 = class29.field383.method1720((byte) -125);
            if (class214.method1619(127, var204)) {
                class19.method110(var206, var209, var205, true, var208, var207, (byte) -63);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 135) {
            int var210 = class29.field383.method1759(-26608);
            int var211 = class29.field383.method1765(true);
            String var212 = class29.field383.method1758((byte) 96);
            if (class214.method1619(arg0 ^ 0xFFFFFF80, var211)) {
                class305.method2177(var212, var210, 112);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 203) {
            int var220 = class29.field383.method1770(-102);
            int var221 = class29.field383.method1765(true);
            int var222 = class29.field383.method1750(arg0 + 17853);
            int var223 = class29.field383.method1759(-26608);
            if (class214.method1619(127, var221)) {
                class259 var224 = (class259) class226.field3723.method1268(-52, (long) var220);
                if (var224 != null) {
                    class237.method1815(var224.field4358 != var223, var224, (byte) 57);
                }
                class112.method852(var223, arg0 - 10239, var222, var220);
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 240) {
            int var213 = class29.field383.method1720((byte) -39);
            int var214 = var213 >> 5;
            int var215 = var213 & 0x1F;
            if (var215 == 0) {
                class74.field1261[var214] = null;
                class220.field3497 = -1;
                return true;
            }
            class273 var216 = new class273();
            var216.field4529 = var215;
            var216.field4531 = class29.field383.method1720((byte) -86);
            if (var216.field4531 >= 0 && var216.field4531 < class32.field458.length) {
                if (var216.field4529 == 1 || var216.field4529 == 10) {
                    var216.field4525 = class29.field383.method1765(true);
                    class29.field383.field3760 += 5;
                } else if (var216.field4529 >= 2 && var216.field4529 <= 6) {
                    if (var216.field4529 == 2) {
                        var216.field4535 = 64;
                        var216.field4536 = 64;
                    }
                    if (var216.field4529 == 3) {
                        var216.field4536 = 0;
                        var216.field4535 = 64;
                    }
                    if (var216.field4529 == 4) {
                        var216.field4536 = 128;
                        var216.field4535 = 64;
                    }
                    if (var216.field4529 == 5) {
                        var216.field4535 = 0;
                        var216.field4536 = 64;
                    }
                    if (var216.field4529 == 6) {
                        var216.field4535 = 128;
                        var216.field4536 = 64;
                    }
                    var216.field4529 = 2;
                    var216.field4534 = class29.field383.method1765(true);
                    var216.field4532 = class29.field383.method1765(true);
                    var216.field4521 = class29.field383.method1720((byte) -120);
                    var216.field4530 = class29.field383.method1765(true);
                }
                var216.field4523 = class29.field383.method1765(true);
                if (var216.field4523 == 65535) {
                    var216.field4523 = -1;
                }
                class74.field1261[var214] = var216;
            }
            class220.field3497 = -1;
            return true;
        } else if (class220.field3497 == 124) {
            int var217 = class29.field383.method1764(128);
            int var218 = class29.field383.method1737((byte) -95);
            int var219 = class29.field383.method1766(76);
            if (class214.method1619(127, var217)) {
                class21.method123(false, var219, var218);
            }
            class220.field3497 = -1;
            return true;
        } else {
            class285.method2079((Throwable) null, (byte) -16, "T1 - " + class220.field3497 + "," + class340.field5442 + "," + class124.field2125 + " - " + class223.field3706);
            class74.method620((byte) -123);
            return true;
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(I)V", line = 3074)
    public class300(int arg0) {
        this.field4837 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field4836 = arg0;
        this.field4839 = new class164(var2);
    }
}
