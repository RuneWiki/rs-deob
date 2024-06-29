import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class113 {

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field2779 = 0;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "La;")
    private static class1 field2792 = method934(-11538, "Message");

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Z")
    public static boolean field2776 = false;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "La;")
    public static class1 field2781 = field2792;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "[I")
    public static int[] field2785 = new int[5];

    @OriginalMember(owner = "client!se", name = "k", descriptor = "La;")
    public static class1 field2786 = method934(-11538, "::clientdrop");

    @OriginalMember(owner = "client!se", name = "p", descriptor = "Lcb;")
    public static class15 field2791 = new class15(64);

    @OriginalMember(owner = "client!se", name = "z", descriptor = "La;")
    public static class1 field2801 = method934(-11538, "backvmid1");

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field2800 = 0;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field2803 = -1;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "La;")
    public static class1 field2805 = method934(-11538, "Chat panel redrawn");

    @OriginalMember(owner = "client!se", name = "C", descriptor = "[[B")
    public static byte[][] field2804 = new byte[1000][];

    @OriginalMember(owner = "client!se", name = "E", descriptor = "[I")
    public static int[] field2806 = new int[2000];

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public int field2782;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public int field2788;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public int field2798;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public int field2799;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "Lbd;")
    public static class11 field2802;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lvb;")
    public class128 field2780;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Lvb;")
    public class128 field2789;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Lvb;")
    public class128 field2790;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "[[B")
    public static byte[][] field2797;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLqd;)V", line = 18)
    public static final void method932(byte arg0, class100 arg1) {
        field2777++;
        int var2 = arg1.field2448;
        if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
            if (var2 == 1 && class23.field702 == 0) {
                arg1.field2477 = class24.field727;
                arg1.field2523 = 0;
            } else if (var2 == 1 && class23.field702 == 1) {
                arg1.field2477 = class132.field3222;
                arg1.field2523 = 0;
            } else if (var2 == 2 && class23.field702 != 2) {
                arg1.field2523 = 0;
                arg1.field2477 = class36.field958;
            } else {
                int var3 = class59.field1495;
                if (var2 > 700) {
                    var2 -= 601;
                } else {
                    var2--;
                }
                if (class23.field702 != 2) {
                    var3 = 0;
                }
                if (var3 <= var2) {
                    arg1.field2477 = class132.field3237;
                    arg1.field2523 = 0;
                } else {
                    arg1.field2477 = class119.field2954[var2];
                    arg1.field2523 = 1;
                }
            }
        } else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
            if (var2 <= 800) {
                var2 -= 101;
            } else {
                var2 -= 701;
            }
            int var4 = class59.field1495;
            if (class23.field702 != 2) {
                var4 = 0;
            }
            if (var2 >= var4) {
                arg1.field2477 = class132.field3237;
                arg1.field2523 = 0;
            } else {
                if (class73.field1791[var2] == 0) {
                    arg1.field2477 = class116.method959(104, new class1[] { class52.field1386, class63.field1596 });
                } else if (class73.field1791[var2] < 5000) {
                    if (class73.field1791[var2] == class24.field724) {
                        arg1.field2477 = class116.method959(86, new class1[] { class102.field2567, class53.field1410, class48.method504(class73.field1791[var2], -1) });
                    } else {
                        arg1.field2477 = class116.method959(86, new class1[] { class107.field2702, class53.field1410, class48.method504(class73.field1791[var2], -1) });
                    }
                } else if (class73.field1791[var2] == class24.field724) {
                    arg1.field2477 = class116.method959(-111, new class1[] { class102.field2567, class15.field508, class48.method504(class73.field1791[var2] - 5000, -1) });
                } else {
                    arg1.field2477 = class116.method959(53, new class1[] { class107.field2702, class15.field508, class48.method504(class73.field1791[var2] - 5000, -1) });
                }
                arg1.field2523 = 1;
            }
        } else {
            int var5 = 88 / ((arg0 - 13) / 53);
            if (var2 == 203) {
                int var6 = class59.field1495;
                if (class23.field702 != 2) {
                    var6 = 0;
                }
                arg1.field2529 = var6 * 15 + 20;
                if (arg1.field2452 >= arg1.field2529) {
                    arg1.field2529 = arg1.field2452 + 1;
                }
            } else if (var2 >= 401 && var2 <= 500) {
                var2 -= 401;
                if (var2 == 0 && class23.field702 == 0) {
                    arg1.field2477 = class99.field2434;
                    arg1.field2523 = 0;
                } else if (var2 == 1 && class23.field702 == 0) {
                    arg1.field2477 = class36.field958;
                    arg1.field2523 = 0;
                } else {
                    int var7 = class85.field2149;
                    if (class23.field702 == 0) {
                        var7 = 0;
                    }
                    if (var7 <= var2) {
                        arg1.field2523 = 0;
                        arg1.field2477 = class132.field3237;
                    } else {
                        arg1.field2477 = class118.method972(-111, class106.field2686[var2]).method36(-4305);
                        arg1.field2523 = 1;
                    }
                }
            } else if (var2 == 503) {
                arg1.field2529 = class85.field2149 * 15 + 20;
                if (arg1.field2452 >= arg1.field2529) {
                    arg1.field2529 = arg1.field2452 + 1;
                }
            } else if (var2 == 324) {
                if (class129.field3160 == -1) {
                    class129.field3160 = arg1.field2553;
                    client.field591 = arg1.field2479;
                }
                if (class92.field2305.field1661) {
                    arg1.field2553 = class129.field3160;
                } else {
                    arg1.field2553 = client.field591;
                }
            } else if (var2 == 325) {
                if (class129.field3160 == -1) {
                    client.field591 = arg1.field2479;
                    class129.field3160 = arg1.field2553;
                }
                if (class92.field2305.field1661) {
                    arg1.field2553 = client.field591;
                } else {
                    arg1.field2553 = class129.field3160;
                }
            } else if (var2 == 327) {
                arg1.field2499 = 150;
                arg1.field2466 = (int) (Math.sin((double) class82.field2066 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field2482 = 0;
                arg1.field2496 = 5;
            } else if (var2 == 328) {
                arg1.field2499 = 150;
                arg1.field2466 = (int) (Math.sin((double) class82.field2066 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field2482 = 1;
                arg1.field2496 = 5;
            } else if (var2 == 600) {
                arg1.field2477 = class116.method959(-128, new class1[] { class132.field3220, class123.field3062 });
            } else if (var2 == 620) {
                if (class37.field1005 < 1) {
                    arg1.field2477 = class132.field3237;
                } else if (class133.field3271) {
                    arg1.field2456 = 16711680;
                    arg1.field2477 = class42.field1095;
                } else {
                    arg1.field2456 = 16777215;
                    arg1.field2477 = class93.field2311;
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILbd;Lbd;)V", line = 279)
    public static final void method933(int arg0, class11 arg1, class11 arg2) {
        class63.field1586 = arg2;
        if (arg0 == 3) {
            field2787++;
            class99.field2436 = arg1;
            class36.field975 = class99.field2436.method236(3, (byte) 8);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjava/lang/String;)La;", line = 306)
    public static final class1 method934(int arg0, String arg1) {
        if (arg0 != -11538) {
            method934(45, null);
        }
        field2794++;
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        class1 var4 = new class1();
        int var5 = 0;
        var4.field38 = new byte[var3];
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field38[var4.field26++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field38[var4.field26++] = (byte) var6;
            }
        }
        var4.method28((byte) -73);
        return var4.method17(arg0 ^ 0xFFFFFE84);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V", line = 349)
    public static final void method935(boolean arg0) {
        class11.field411 = arg0;
        class45.method475((byte) 124);
        if (class37.field1002) {
            class116.field2905.method210(class132.field3233, 239, 40, 0);
            class116.field2905.method210(class116.method959(-117, new class1[] { class132.field3235, class37.field990 }), 239, 60, 128);
        } else if (class114.field2814 == 1) {
            class116.field2905.method210(class102.field2579, 239, 40, 0);
            class116.field2905.method210(class116.method959(73, new class1[] { class132.field3213, class37.field990 }), 239, 60, 128);
        } else if (class114.field2814 == 2) {
            class116.field2905.method210(class46.field1205, 239, 40, 0);
            class116.field2905.method210(class116.method959(-50, new class1[] { class132.field3213, class37.field990 }), 239, 60, 128);
        } else if (class114.field2814 == 3) {
            if (class132.field3213 != class132.field3212) {
                class54.method540((byte) -96, class132.field3213);
                class132.field3212 = class132.field3213;
            }
            class10 var17 = class106.field2687;
            class111.method915(0, 0, 463, 77);
            for (int var18 = 0; var18 < class93.field2333; var18++) {
                int var19 = var18 * 14 + 18 - class53.field1393;
                if (var19 > 0 && var19 < 110) {
                    var17.method210(class38.field1018[var18], 239, var19, 0);
                }
            }
            class111.method922();
            if (class93.field2333 > 5) {
                class63.method604(0, class53.field1393, class93.field2333 * 14 + 7, 463, 77, 0);
            }
            if (class132.field3213.method10(-3136) == 0) {
                class116.field2905.method210(class75.field1877, 239, 40, 255);
            } else if (class93.field2333 == 0) {
                class116.field2905.method210(class57.field1452, 239, 40, 0);
            }
            var17.method210(class116.method959(-122, new class1[] { class132.field3213, class37.field990 }), 239, 90, 0);
            class111.method919(0, 77, 479, 0);
        } else if (class64.field1608 != null) {
            class116.field2905.method210(class64.field1608, 239, 40, 0);
            class116.field2905.method210(class74.field1822, 239, 60, 128);
        } else if (class86.field2169 != -1) {
            boolean var16 = class46.method480(0, class86.field2169, 96, (byte) -5, 0, 2, 479);
            if (!var16) {
                class105.field2640 = true;
            }
        } else if (class98.field2424 == -1) {
            int var2 = 0;
            class10 var3 = class106.field2687;
            class111.method915(0, 0, 463, 77);
            for (int var4 = 0; var4 < 100; var4++) {
                if (class80.field2037[var4] != null) {
                    int var6 = class132.field3239[var4];
                    class1 var7 = class128.field3133[var4];
                    int var8 = class49.field1342 + 70 - var2 * 14;
                    byte var9 = 0;
                    if (var7 != null && var7.method26((byte) 116, class103.field2615)) {
                        var7 = var7.method1((byte) 95, 5);
                        var9 = 1;
                    }
                    if (var7 != null && var7.method26((byte) 116, class100.field2538)) {
                        var7 = var7.method1((byte) 95, 5);
                        var9 = 2;
                    }
                    if (var6 == 0) {
                        var2++;
                        if (var8 > 0 && var8 < 110) {
                            var3.method214(class80.field2037[var4], 4, var8, 0);
                        }
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || class75.field1867 == 0 || class75.field1867 == 1 && class12.method243(var7, -32624))) {
                        if (var8 > 0 && var8 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                class104.field2617[0].method330(var10, var8 - 12);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                class104.field2617[1].method330(var10, var8 - 12);
                                var10 += 14;
                            }
                            var3.method214(class116.method959(53, new class1[] { var7, class86.field2168 }), var10, var8, 0);
                            int var11 = var10 + var3.method209(var7) + 8;
                            var3.method214(class80.field2037[var4], var11, var8, 255);
                        }
                        var2++;
                    }
                    if ((var6 == 3 || var6 == 7) && class5.field217 == 0 && (var6 == 7 || class6.field237 == 0 || class6.field237 == 1 && class12.method243(var7, -32624))) {
                        var2++;
                        if (var8 > 0 && var8 < 110) {
                            byte var12 = 4;
                            var3.method214(class46.field1217, var12, var8, 0);
                            int var13 = var12 + var3.method209(class46.field1217);
                            int var14 = var13 + var3.method213(32);
                            if (var9 == 1) {
                                class104.field2617[0].method330(var14, var8 - 12);
                                var14 += 14;
                            }
                            if (var9 == 2) {
                                class104.field2617[1].method330(var14, var8 - 12);
                                var14 += 14;
                            }
                            var3.method214(class116.method959(103, new class1[] { var7, class86.field2168 }), var14, var8, 0);
                            int var15 = var14 + var3.method209(var7) + 8;
                            var3.method214(class80.field2037[var4], var15, var8, 8388608);
                        }
                    }
                    if (var6 == 4 && (class115.field2831 == 0 || class115.field2831 == 1 && class12.method243(var7, -32624))) {
                        var2++;
                        if (var8 > 0 && var8 < 110) {
                            var3.method214(class116.method959(-65, new class1[] { var7, class98.field2409, class80.field2037[var4] }), 4, var8, 8388736);
                        }
                    }
                    if (var6 == 5 && class5.field217 == 0 && class6.field237 < 2) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method214(class80.field2037[var4], 4, var8, 8388608);
                        }
                        var2++;
                    }
                    if (var6 == 6 && class5.field217 == 0 && class6.field237 < 2) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method214(class116.method959(-108, new class1[] { class16.field522, class98.field2409, var7, class86.field2168 }), 4, var8, 0);
                            var3.method214(class80.field2037[var4], var3.method209(class116.method959(-98, new class1[] { class16.field522, class98.field2409, var7 })) + 12, var8, 8388608);
                        }
                        var2++;
                    }
                    if (var6 == 8 && (class115.field2831 == 0 || class115.field2831 == 1 && class12.method243(var7, -32624))) {
                        var2++;
                        if (var8 > 0 && var8 < 110) {
                            var3.method214(class116.method959(-105, new class1[] { var7, class98.field2409, class80.field2037[var4] }), 4, var8, 8270336);
                        }
                    }
                }
            }
            class111.method922();
            class122.field3055 = var2 * 14 + 7;
            if (class122.field3055 < 78) {
                class122.field3055 = 78;
            }
            class63.method604(0, class122.field3055 - class49.field1342 - 77, class122.field3055, 463, 77, 0);
            class1 var5;
            if (class104.field2624 == null || class104.field2624.field87 == null) {
                var5 = class123.field3074;
            } else {
                var5 = class104.field2624.field87;
            }
            var3.method214(class116.method959(-62, new class1[] { var5, class86.field2168 }), 4, 90, 0);
            var3.method214(class116.method959(71, new class1[] { class132.field3226, class37.field990 }), var3.method209(class116.method959(-99, new class1[] { var5, class39.field1066 })) + 6, 90, 255);
            class111.method919(0, 77, 479, 0);
        } else {
            boolean var1 = class46.method480(0, class98.field2424, 96, (byte) -5, 0, 3, 479);
            if (!var1) {
                class105.field2640 = true;
            }
        }
        field2784++;
        if (class6.field225 && class19.field641 == 2) {
            class46.method485(-1);
        }
        class92.method811((byte) 122);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILbd;ZLbd;)V", line = 684)
    public static final void method936(int arg0, class11 arg1, boolean arg2, class11 arg3) {
        class22.field699 = arg3;
        class75.field1864 = arg2;
        field2778++;
        if (arg0 == 28987) {
            class1.field51 = arg1;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V", line = 700)
    public static void method937(byte arg0) {
        field2781 = null;
        field2806 = null;
        field2804 = null;
        field2792 = null;
        field2801 = null;
        field2791 = null;
        field2785 = null;
        if (arg0 == -120) {
            field2797 = null;
            field2805 = null;
            field2786 = null;
            field2802 = null;
        }
    }
}
