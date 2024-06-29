import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class110 {

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public int field1915 = -1;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public int field1921 = 0;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Z")
    public boolean field1919 = true;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public int field1931 = -1;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Led;")
    public static class252 field1922 = new class252(0, 0);

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "[Lvf;")
    public static class265[] field1928 = new class265[100];

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "J")
    public static volatile long field1930 = 0L;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Z")
    public static boolean field1924 = true;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "Lfl;")
    public static class192 field1927;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lvf;Lng;I)I")
    public static final int method723(class265 arg0, class135 arg1, int arg2) {
        int var3 = arg1.field2449;
        if (arg2 <= 89) {
            field1924 = true;
        }
        arg1.method938((byte) 118, arg0.field4640);
        arg1.field2449 += class265.field4656.method1240(arg0.field4643, 0, -124, arg0.field4640, arg1.field2483, arg1.field2449);
        field1917++;
        return arg1.field2449 - var3;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static void method724(int arg0) {
        if (arg0 == 0) {
            field1928 = null;
            field1927 = null;
            field1922 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lng;III)V")
    private final void method725(class135 arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field1921 = class4.method30(arg0.method909(-917770352), -61);
        } else if (arg2 == 2) {
            this.field1931 = arg0.method920((byte) 104);
        } else if (arg2 == 3) {
            this.field1931 = arg0.method927(126);
            if (this.field1931 == 65535) {
                this.field1931 = -1;
            }
        } else if (arg2 == 5) {
            this.field1919 = false;
        } else if (arg2 == 7) {
            this.field1915 = class4.method30(arg0.method909(arg1 - 917770343), -88);
        } else if (arg2 == 8) {
            class149.field2773 = arg3;
        } else if (arg2 == 9) {
            arg0.method927(125);
        } else if (arg2 != 10) {
            if (arg2 == 11) {
                arg0.method920((byte) 123);
            } else if (arg2 != 12) {
                if (arg2 == 13) {
                    arg0.method909(-917770352);
                } else if (arg2 == 14) {
                    arg0.method920((byte) 96);
                }
            }
        }
        if (arg1 == -9) {
            field1920++;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)V")
    public static final void method726(int arg0, byte arg1) {
        field1932++;
        if (arg1 > -44) {
            method726(-14, (byte) -123);
        }
        class43.field957.method1891(-23549, arg0);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILng;I)V")
    public final void method727(int arg0, class135 arg1, int arg2) {
        if (arg2 != 13) {
            field1928 = null;
        }
        while (true) {
            int var4 = arg1.method920((byte) 40);
            if (var4 == 0) {
                field1925++;
                return;
            }
            this.method725(arg1, -9, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)I")
    public static final int method728(int arg0, int arg1, int arg2) {
        field1929++;
        if (arg0 != 1) {
            field1927 = null;
        }
        int var3 = arg2 >> 31 & arg1 - 1;
        return (arg2 + (arg2 >>> 31)) % arg1 + var3;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lvf;IB)V")
    public static final void method729(class265 arg0, int arg1, byte arg2) {
        if (arg2 != -108) {
            method730((class137) null, false);
        }
        field1923++;
        class178 var3 = class188.method1282(arg1, 3, 261360480);
        var3.method1162(true);
        var3.field3181 = arg0;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lac;Z)V")
    public static final void method730(class137 arg0, boolean arg1) {
        class48.field1034.method785(arg0, -29);
        while (true) {
            class137 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class137[][] var7;
            class137 var66;
            do {
                class137 var65;
                do {
                    class137 var64;
                    do {
                        class137 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class137) class48.field1034.method793(37);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2517);
                                            var3 = var2.field2504;
                                            var4 = var2.field2498;
                                            var5 = var2.field2519;
                                            var6 = var2.field2509;
                                            var7 = class200.field3577[var5];
                                            if (!var2.field2507) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class137 var8 = class200.field3577[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field2517) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class233.field4110 && var3 > class164.field2984) {
                                                    class137 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field2517 && (var9.field2507 || (var2.field2520 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class233.field4110 && var3 < class243.field4249 - 1) {
                                                    class137 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field2517 && (var10.field2507 || (var2.field2520 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class281.field4961 && var4 > class118.field2084) {
                                                    class137 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field2517 && (var11.field2507 || (var2.field2520 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class281.field4961 && var4 < class267.field4701 - 1) {
                                                    class137 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field2517 && (var12.field2507 || (var2.field2520 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2507 = false;
                                            if (var2.field2512 != null) {
                                                class137 var13 = var2.field2512;
                                                if (var13.field2505 == null) {
                                                    if (var13.field2497 != null) {
                                                        if (class124.method834(0, var3, var4)) {
                                                            class81.method560(var13.field2497, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var3, var4, true);
                                                        } else {
                                                            class81.method560(var13.field2497, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class124.method834(0, var3, var4)) {
                                                    class273.method1868(var13.field2505, 0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var3, var4, true);
                                                } else {
                                                    class273.method1868(var13.field2505, 0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var3, var4, false);
                                                }
                                                class144 var14 = var13.field2518;
                                                if (var14 != null) {
                                                    var14.field2682.method164(0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var14.field2697 - class65.field1254, var14.field2692 - class248.field4309, var14.field2691 - class204.field3647, var14.field2683, var5, (class255) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field2502; var15++) {
                                                    class146 var16 = var13.field2506[var15];
                                                    if (var16 != null) {
                                                        var16.field2737.method164(var16.field2724, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var16.field2738 - class65.field1254, var16.field2725 - class248.field4309, var16.field2739 - class204.field3647, var16.field2720, var5, (class255) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field2505 == null) {
                                                if (var2.field2497 != null) {
                                                    if (class124.method834(var6, var3, var4)) {
                                                        class81.method560(var2.field2497, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class81.method560(var2.field2497, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var3, var4, false);
                                                    }
                                                }
                                            } else if (class124.method834(var6, var3, var4)) {
                                                class273.method1868(var2.field2505, var6, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field2505.field4923 != 12345678 || class193.field3478 && var5 <= class134.field2411) {
                                                    class273.method1868(var2.field2505, var6, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class8 var18 = var2.field2501;
                                                if (var18 != null && (var18.field266 & 0x80000000L) != 0L) {
                                                    var18.field270.method164(0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var18.field280 - class65.field1254, var18.field269 - class248.field4309, var18.field277 - class204.field3647, var18.field266, var5, (class255) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class144 var21 = var2.field2518;
                                            class200 var22 = var2.field2510;
                                            if (var21 != null || var22 != null) {
                                                if (class233.field4110 == var3) {
                                                    var19++;
                                                } else if (class233.field4110 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class281.field4961 == var4) {
                                                    var19 += 3;
                                                } else if (class281.field4961 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class16.field456[var19];
                                                var2.field2521 = class261.field4562[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field2681 & class98.field1739[var19]) == 0) {
                                                    var2.field2515 = 0;
                                                } else if (var21.field2681 == 16) {
                                                    var2.field2515 = 3;
                                                    var2.field2516 = class268.field4712[var19];
                                                    var2.field2513 = 3 - var2.field2516;
                                                } else if (var21.field2681 == 32) {
                                                    var2.field2515 = 6;
                                                    var2.field2516 = class67.field1276[var19];
                                                    var2.field2513 = 6 - var2.field2516;
                                                } else if (var21.field2681 == 64) {
                                                    var2.field2515 = 12;
                                                    var2.field2516 = class172.field3110[var19];
                                                    var2.field2513 = 12 - var2.field2516;
                                                } else {
                                                    var2.field2515 = 9;
                                                    var2.field2516 = class201.field3610[var19];
                                                    var2.field2513 = 9 - var2.field2516;
                                                }
                                                if ((var21.field2681 & var20) != 0 && !class218.method1498(var6, var3, var4, var21.field2681)) {
                                                    var21.field2682.method164(0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var21.field2697 - class65.field1254, var21.field2692 - class248.field4309, var21.field2691 - class204.field3647, var21.field2683, var5, (class255) null);
                                                }
                                                if ((var21.field2684 & var20) != 0 && !class218.method1498(var6, var3, var4, var21.field2684)) {
                                                    var21.field2694.method164(0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var21.field2697 - class65.field1254, var21.field2692 - class248.field4309, var21.field2691 - class204.field3647, var21.field2683, var5, (class255) null);
                                                }
                                            }
                                            if (var22 != null && !class16.method117(var6, var3, var4, var22.field3572.method141())) {
                                                if ((var22.field3580 & var20) != 0) {
                                                    var22.field3572.method164(0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var22.field3581 + var22.field3566 - class65.field1254, var22.field3576 - class248.field4309, var22.field3578 + var22.field3575 - class204.field3647, var22.field3565, var5, (class255) null);
                                                } else if (var22.field3580 == 256) {
                                                    int var23 = var22.field3581 - class65.field1254;
                                                    int var24 = var22.field3576 - class248.field4309;
                                                    int var25 = var22.field3578 - class204.field3647;
                                                    int var26 = var22.field3574;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field3572.method164(0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var22.field3566 + var23, var24, var22.field3575 + var25, var22.field3565, var5, (class255) null);
                                                    } else if (var22.field3567 != null) {
                                                        var22.field3567.method164(0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var23, var24, var25, var22.field3565, var5, (class255) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class8 var29 = var2.field2501;
                                                if (var29 != null && (var29.field266 & 0x80000000L) == 0L) {
                                                    var29.field270.method164(0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var29.field280 - class65.field1254, var29.field269 - class248.field4309, var29.field277 - class204.field3647, var29.field266, var5, (class255) null);
                                                }
                                                class212 var30 = var2.field2511;
                                                if (var30 != null && var30.field3807 == 0) {
                                                    if (var30.field3809 != null) {
                                                        var30.field3809.method164(0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var30.field3811 - class65.field1254, var30.field3808 - class248.field4309, var30.field3815 - class204.field3647, var30.field3802, var5, (class255) null);
                                                    }
                                                    if (var30.field3814 != null) {
                                                        var30.field3814.method164(0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var30.field3811 - class65.field1254, var30.field3808 - class248.field4309, var30.field3815 - class204.field3647, var30.field3802, var5, (class255) null);
                                                    }
                                                    if (var30.field3805 != null) {
                                                        var30.field3805.method164(0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var30.field3811 - class65.field1254, var30.field3808 - class248.field4309, var30.field3815 - class204.field3647, var30.field3802, var5, (class255) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field2520;
                                            if (var31 != 0) {
                                                if (var3 < class233.field4110 && (var31 & 0x4) != 0) {
                                                    class137 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field2517) {
                                                        class48.field1034.method785(var32, -29);
                                                    }
                                                }
                                                if (var4 < class281.field4961 && (var31 & 0x2) != 0) {
                                                    class137 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field2517) {
                                                        class48.field1034.method785(var33, -29);
                                                    }
                                                }
                                                if (var3 > class233.field4110 && (var31 & 0x1) != 0) {
                                                    class137 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field2517) {
                                                        class48.field1034.method785(var34, -29);
                                                    }
                                                }
                                                if (var4 > class281.field4961 && (var31 & 0x8) != 0) {
                                                    class137 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field2517) {
                                                        class48.field1034.method785(var35, -29);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2515 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field2502; var37++) {
                                                if (class68.field1296 != var2.field2506[var37].field2731 && (var2.field2514[var37] & var2.field2515) == var2.field2516) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class144 var38 = var2.field2518;
                                                if (!class218.method1498(var6, var3, var4, var38.field2681)) {
                                                    var38.field2682.method164(0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var38.field2697 - class65.field1254, var38.field2692 - class248.field4309, var38.field2691 - class204.field3647, var38.field2683, var5, (class255) null);
                                                }
                                                var2.field2515 = 0;
                                            }
                                        }
                                        if (!var2.field2503) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field2502;
                                            var2.field2503 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class146 var42 = var2.field2506[var41];
                                                if (class68.field1296 != var42.field2731) {
                                                    for (int var43 = var42.field2728; var43 <= var42.field2733; var43++) {
                                                        for (int var44 = var42.field2719; var44 <= var42.field2721; var44++) {
                                                            class137 var45 = var7[var43][var44];
                                                            if (var45.field2507) {
                                                                var2.field2503 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field2515 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field2728) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field2733) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field2719) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field2721) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field2515) == var2.field2513) {
                                                                    var2.field2503 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class179.field3194[var40++] = var42;
                                                    int var47 = class233.field4110 - var42.field2728;
                                                    int var48 = var42.field2733 - class233.field4110;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class281.field4961 - var42.field2719;
                                                    int var50 = var42.field2721 - class281.field4961;
                                                    if (var50 > var49) {
                                                        var42.field2730 = var47 + var50;
                                                    } else {
                                                        var42.field2730 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class146 var54 = class179.field3194[var53];
                                                    if (class68.field1296 != var54.field2731) {
                                                        if (var54.field2730 > var51) {
                                                            var51 = var54.field2730;
                                                            var52 = var53;
                                                        } else if (var54.field2730 == var51) {
                                                            int var55 = var54.field2738 - class65.field1254;
                                                            int var56 = var54.field2739 - class204.field3647;
                                                            int var57 = class179.field3194[var52].field2738 - class65.field1254;
                                                            int var58 = class179.field3194[var52].field2739 - class204.field3647;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class146 var59 = class179.field3194[var52];
                                                var59.field2731 = class68.field1296;
                                                if (!class6.method40(var6, var59.field2728, var59.field2733, var59.field2719, var59.field2721, var59.field2737.method141())) {
                                                    var59.field2737.method164(var59.field2724, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var59.field2738 - class65.field1254, var59.field2725 - class248.field4309, var59.field2739 - class204.field3647, var59.field2720, var5, (class255) null);
                                                }
                                                for (int var60 = var59.field2728; var60 <= var59.field2733; var60++) {
                                                    for (int var61 = var59.field2719; var61 <= var59.field2721; var61++) {
                                                        class137 var62 = var7[var60][var61];
                                                        if (var62.field2515 != 0) {
                                                            class48.field1034.method785(var62, -29);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field2517) {
                                                            class48.field1034.method785(var62, -29);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2503) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field2503 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field2517);
                            } while (var2.field2515 != 0);
                            if (var3 > class233.field4110 || var3 <= class164.field2984) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field2517);
                        if (var3 < class233.field4110 || var3 >= class243.field4249 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field2517);
                    if (var4 > class281.field4961 || var4 <= class118.field2084) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field2517);
                if (var4 < class281.field4961 || var4 >= class267.field4701 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field2517);
            var2.field2517 = false;
            class25.field694--;
            class212 var67 = var2.field2511;
            if (var67 != null && var67.field3807 != 0) {
                if (var67.field3809 != null) {
                    var67.field3809.method164(0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var67.field3811 - class65.field1254, var67.field3808 - class248.field4309 - var67.field3807, var67.field3815 - class204.field3647, var67.field3802, var5, (class255) null);
                }
                if (var67.field3814 != null) {
                    var67.field3814.method164(0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var67.field3811 - class65.field1254, var67.field3808 - class248.field4309 - var67.field3807, var67.field3815 - class204.field3647, var67.field3802, var5, (class255) null);
                }
                if (var67.field3805 != null) {
                    var67.field3805.method164(0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var67.field3811 - class65.field1254, var67.field3808 - class248.field4309 - var67.field3807, var67.field3815 - class204.field3647, var67.field3802, var5, (class255) null);
                }
            }
            if (var2.field2521 != 0) {
                class200 var68 = var2.field2510;
                if (var68 != null && !class16.method117(var6, var3, var4, var68.field3572.method141())) {
                    if ((var68.field3580 & var2.field2521) != 0) {
                        var68.field3572.method164(0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var68.field3581 + var68.field3566 - class65.field1254, var68.field3576 - class248.field4309, var68.field3578 + var68.field3575 - class204.field3647, var68.field3565, var5, (class255) null);
                    } else if (var68.field3580 == 256) {
                        int var69 = var68.field3581 - class65.field1254;
                        int var70 = var68.field3576 - class248.field4309;
                        int var71 = var68.field3578 - class204.field3647;
                        int var72 = var68.field3574;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field3572.method164(0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var68.field3566 + var69, var70, var68.field3575 + var71, var68.field3565, var5, (class255) null);
                        } else if (var68.field3567 != null) {
                            var68.field3567.method164(0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var69, var70, var71, var68.field3565, var5, (class255) null);
                        }
                    }
                }
                class144 var75 = var2.field2518;
                if (var75 != null) {
                    if ((var75.field2684 & var2.field2521) != 0 && !class218.method1498(var6, var3, var4, var75.field2684)) {
                        var75.field2694.method164(0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var75.field2697 - class65.field1254, var75.field2692 - class248.field4309, var75.field2691 - class204.field3647, var75.field2683, var5, (class255) null);
                    }
                    if ((var75.field2681 & var2.field2521) != 0 && !class218.method1498(var6, var3, var4, var75.field2681)) {
                        var75.field2682.method164(0, class140.field2572, class232.field4101, class186.field3371, class218.field3929, var75.field2697 - class65.field1254, var75.field2692 - class248.field4309, var75.field2691 - class204.field3647, var75.field2683, var5, (class255) null);
                    }
                }
            }
            if (var5 < class64.field1244 - 1) {
                class137 var76 = class200.field3577[var5 + 1][var3][var4];
                if (var76 != null && var76.field2517) {
                    class48.field1034.method785(var76, -29);
                }
            }
            if (var3 < class233.field4110) {
                class137 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field2517) {
                    class48.field1034.method785(var77, -29);
                }
            }
            if (var4 < class281.field4961) {
                class137 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field2517) {
                    class48.field1034.method785(var78, -29);
                }
            }
            if (var3 > class233.field4110) {
                class137 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field2517) {
                    class48.field1034.method785(var79, -29);
                }
            }
            if (var4 > class281.field4961) {
                class137 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field2517) {
                    class48.field1034.method785(var80, -29);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
    public static final void method731(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 < 62) {
            return;
        }
        if ((arg6 - arg1) >= class107.field1890 && (arg6 + arg1) <= class79.field1510 && arg5 - arg1 >= class81.field1521 && class205.field3681 >= (arg1 + arg5)) {
            class143.method980(arg4, arg2, arg6, arg0, arg1, arg5, (byte) -105);
        } else {
            class73.method512(arg4, arg1, arg0, arg2, arg5, 0, arg6);
        }
        field1916++;
    }
}
