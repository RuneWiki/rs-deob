import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class91 {

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "J")
    private long field2057 = -1L;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    private int field2065 = 0;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "J")
    private long field2049 = -1L;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Ltc;")
    private class116 field2056;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "J")
    private long field2072;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "J")
    private long field2067;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "[B")
    private byte[] field2070;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "J")
    private long field2053;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "[B")
    private byte[] field2059;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lmd;")
    public static class76 field2054 = new class76();

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "Lgd;")
    private static class40 field2075 = class14.method90(false, "Accept trade");

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "Lgd;")
    public static class40 field2076 = field2075;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
    public static int field2079 = 0;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "Lgd;")
    private static class40 field2078 = class14.method90(false, "Unexpected server response");

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "Lgd;")
    public static class40 field2082 = class14.method90(false, "Ausw-=hlen");

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "Lgd;")
    public static class40 field2084 = field2078;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    private int field2073;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "J")
    private long field2052;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "J")
    public static long field2080;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "Lmb;")
    public static class73 field2083;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Loc;")
    public static class86 field2058;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "[Lmb;")
    public static class73[] field2081;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "[[B")
    public static byte[][] field2077;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)I", line = 3)
    private static final int method604(byte arg0) {
        int var1 = -57 / ((arg0 - 26) / 57);
        field2060++;
        return class106.field2575++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 15)
    private final void method605(boolean arg0) throws IOException {
        if (arg0) {
            return;
        }
        field2050++;
        this.field2073 = 0;
        if (this.field2053 != this.field2052) {
            this.field2056.method894(this.field2053, 89);
            this.field2052 = this.field2053;
        }
        this.field2049 = this.field2053;
        while (this.field2070.length > this.field2073) {
            int var2 = this.field2056.method893(-1, this.field2070, this.field2070.length - this.field2073, this.field2073);
            if (var2 == -1) {
                break;
            }
            this.field2073 += var2;
            this.field2052 += var2;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Lhe;", line = 53)
    public static final class47 method606(byte arg0) {
        if (arg0 > -21) {
            method608(-38, -28, 113, null, -10, 37);
        }
        class47 var1 = new class47(class120.field2842, class134.field3271, class30.field754, class96.field2229, class129.field3086);
        field2055++;
        class107.method825(-13254);
        return var1;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)J", line = 73)
    public final long method607(byte arg0) {
        if (arg0 >= -24) {
            return 58L;
        } else {
            field2069++;
            return this.field2067;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIILcb;II)V", line = 96)
    public static final void method608(int arg0, int arg1, int arg2, class14 arg3, int arg4, int arg5) {
        class101 var6 = new class101();
        var6.field2389 = arg3.field357;
        if (arg2 != -1) {
            field2084 = null;
        }
        var6.field2405 = arg0;
        int var7 = arg3.field370;
        var6.field2399 = arg3.field399 * 128;
        var6.field2398 = arg3.field356;
        field2071++;
        var6.field2392 = arg4 * 128;
        var6.field2385 = arg3.field366;
        var6.field2403 = arg5 * 128;
        int var8 = arg3.field363;
        var6.field2384 = arg3.field350;
        if (arg1 == 1 || arg1 == 3) {
            var7 = arg3.field363;
            var8 = arg3.field370;
        }
        var6.field2394 = (arg5 + var7) * 128;
        var6.field2404 = (arg4 + var8) * 128;
        if (arg3.field361 != null) {
            var6.field2387 = arg3;
            var6.method710((byte) 95);
        }
        class136.field3314.method589(var6, arg2 ^ 0xFFFFFFA7);
        if (var6.field2384 != null) {
            var6.field2395 = (int) (Math.random() * (double) (var6.field2389 - var6.field2385)) + var6.field2385;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 142)
    public static final void method609(int arg0) {
        if (class82.field1856 > 1) {
            class82.field1856--;
        }
        if (class70.field1675 > 0) {
            class70.field1675--;
        }
        field2064++;
        if (class65.field1601) {
            class65.field1601 = false;
            class4.method27((byte) -109);
            return;
        }
        for (int var1 = 0; var1 < 100 && class126.method1001(true); var1++) {
        }
        if (class115.field2769 != 30 && class115.field2769 != 35) {
            return;
        }
        if (class83.field1879 && class115.field2769 == 30) {
            class106.field2572 = 0;
            class80.field1841 = 0;
            while (class24.method143(507)) {
            }
            for (int var2 = 0; var2 < class107.field2617.length; var2++) {
                class107.field2617[var2] = false;
            }
        }
        class135.method1053(arg0 ^ 0xFFFFB7C7, class92.field2094, 145);
        Object var3 = class66.field1608.field1810;
        synchronized (class66.field1608.field1810) {
            if (!class41.field1020) {
                class66.field1608.field1823 = 0;
            } else if (class80.field1841 != 0 || class66.field1608.field1823 >= 40) {
                class99.field2344++;
                class92.field2094.method290((byte) 0, 149);
                int var4 = 0;
                class92.field2094.method756(0, 1);
                int var5 = class92.field2094.field2563;
                for (int var6 = 0; var6 < class66.field1608.field1823 && class92.field2094.field2563 - var5 < 240; var6++) {
                    var4++;
                    int var7 = class66.field1608.field1821[var6];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var8 = class66.field1608.field1822[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    int var9 = var7 * 765 + var8;
                    if (class66.field1608.field1821[var6] == -1 && class66.field1608.field1822[var6] == -1) {
                        var8 = -1;
                        var7 = -1;
                        var9 = 524287;
                    }
                    if (class63.field1540 != var8 || class132.field3200 != var7) {
                        int var10 = var8 - class63.field1540;
                        class63.field1540 = var8;
                        int var11 = var7 - class132.field3200;
                        class132.field3200 = var7;
                        if (class18.field441 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var10 += 32;
                            var11 += 32;
                            class92.field2094.method768((class18.field441 << 12) + (var10 << 6) + var11, 89);
                            class18.field441 = 0;
                        } else if (class18.field441 < 8) {
                            class92.field2094.method762((class18.field441 << 19) + var9 + 8388608, 93);
                            class18.field441 = 0;
                        } else {
                            class92.field2094.method761((class18.field441 << 19) + var9 - 1073741824, -23644);
                            class18.field441 = 0;
                        }
                    } else if (class18.field441 < 2047) {
                        class18.field441++;
                    }
                }
                class92.field2094.method766(class92.field2094.field2563 - var5, 116);
                if (class66.field1608.field1823 <= var4) {
                    class66.field1608.field1823 = 0;
                } else {
                    class66.field1608.field1823 -= var4;
                    for (int var12 = 0; var12 < class66.field1608.field1823; var12++) {
                        class66.field1608.field1822[var12] = class66.field1608.field1822[var4 + var12];
                        class66.field1608.field1821[var12] = class66.field1608.field1821[var4 + var12];
                    }
                }
            }
        }
        if (class80.field1841 != 0) {
            class2.field41++;
            long var13 = (class38.field941 - class54.field1366) / 50L;
            class54.field1366 = class38.field941;
            int var15 = class132.field3191;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var16 = class90.field2041;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 502) {
                var16 = 502;
            }
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            int var17 = var16 * 765 + var15;
            int var18 = (int) var13;
            byte var19 = 0;
            if (class80.field1841 == 2) {
                var19 = 1;
            }
            class92.field2094.method290((byte) 0, 64);
            class92.field2094.method777((var18 << 20) - (-(var19 << 19) - var17), -944783368);
        }
        if (class112.field2700 > 0) {
            class112.field2700--;
        }
        if (class107.field2617[96] || class107.field2617[97] || class107.field2617[98] || class107.field2617[99]) {
            class94.field2166 = true;
        }
        if (class94.field2166 && class112.field2700 <= 0) {
            class94.field2166 = false;
            class112.field2700 = 20;
            class92.field2094.method290((byte) 0, 49);
            class118.field2791++;
            class92.field2094.method776(class2.field43, 91);
            class92.field2094.method768(class16.field419, 121);
        }
        if (class89.field2014 && !class50.field1268) {
            class50.field1268 = true;
            class79.field1795++;
            class92.field2094.method290((byte) 0, 67);
            class92.field2094.method756(1, arg0 ^ 0x4806);
        }
        if (!class89.field2014 && class50.field1268) {
            class50.field1268 = false;
            class79.field1795++;
            class92.field2094.method290((byte) 0, 67);
            class92.field2094.method756(0, 1);
        }
        class70.method487((byte) -42);
        if (class115.field2769 != 30 && class115.field2769 != 35) {
            return;
        }
        class120.method910((byte) -111);
        class50.method389(false);
        class30.field661++;
        if (class30.field661 > 750) {
            class4.method27((byte) -125);
            return;
        }
        class94.method633(-1);
        class49.method385(-3);
        class34.method216((byte) -105);
        if (class96.field2238 != 0) {
            class92.field2096 += 20;
            if (class92.field2096 >= 400) {
                class96.field2238 = 0;
            }
        }
        class86.field1919++;
        if (class35.field892 != 0) {
            class88.field1995++;
            if (class88.field1995 >= 15) {
                if (class35.field892 == 2) {
                    class45.field1124 = true;
                }
                if (class35.field892 == 3) {
                    class122.field2880 = true;
                }
                class35.field892 = 0;
            }
        }
        if (class43.field1090 != 0) {
            class96.field2243++;
            if (class40.field1001 > class92.field2114 + 5 || class40.field1001 < class92.field2114 - 5 || class114.field2752 + 5 < class135.field3282 || class114.field2752 - 5 > class135.field3282) {
                class54.field1363 = true;
            }
            if (class106.field2572 == 0) {
                if (class43.field1090 == 2) {
                    class45.field1124 = true;
                }
                if (class43.field1090 == 3) {
                    class122.field2880 = true;
                }
                class43.field1090 = 0;
                if (class54.field1363 && class96.field2243 >= 5) {
                    class48.field1218 = -1;
                    class112.method872(arg0 ^ 0xFFFFB7F8);
                    if (class60.field1504 == class48.field1218 && class65.field1583 != class133.field3242) {
                        class103.field2489++;
                        class30 var20 = class14.method86(class60.field1504, false);
                        byte var21 = 0;
                        if (class56.field1444 == 1 && var20.field734 == 206) {
                            var21 = 1;
                        }
                        if (var20.field710[class133.field3242] <= 0) {
                            var21 = 0;
                        }
                        if (var20.field716) {
                            int var24 = class133.field3242;
                            int var25 = class65.field1583;
                            var20.field710[var24] = var20.field710[var25];
                            var20.field708[var24] = var20.field708[var25];
                            var20.field710[var25] = -1;
                            var20.field708[var25] = 0;
                        } else if (var21 == 1) {
                            int var22 = class65.field1583;
                            int var23 = class133.field3242;
                            while (var22 != var23) {
                                if (var22 > var23) {
                                    var20.method190(49, var22 - 1, var22);
                                    var22--;
                                } else if (var22 < var23) {
                                    var20.method190(arg0 - 18390, var22 - -1, var22);
                                    var22++;
                                }
                            }
                        } else {
                            var20.method190(arg0 ^ 0x4836, class133.field3242, class65.field1583);
                        }
                        class92.field2094.method290((byte) 0, 118);
                        class92.field2094.method767(true, var21);
                        class92.field2094.method768(class133.field3242, -76);
                        class92.field2094.method761(class60.field1504, -23644);
                        class92.field2094.method771((byte) 121, class65.field1583);
                    }
                } else if ((class125.field2970 == 1 || class135.method1057(-1, class48.field1231 - 1)) && class48.field1231 > 2) {
                    class126.method998(arg0 ^ 0xFFFFB735);
                } else if (class48.field1231 > 0) {
                    class10.method57(0, class48.field1231 - 1);
                }
                class80.field1841 = 0;
                class88.field1995 = 10;
            }
        }
        byte var26 = 34;
        if (class94.field2161 == -1) {
            if (class131.field3169 != -1) {
                class110.method857(var26, class131.field3169, 516, (byte) 14, 4, 338, 4);
            } else if (class86.field1935 != -1) {
                class110.method857(var26, class86.field1935, 516, (byte) 112, 4, 338, 4);
            }
            if (class18.field440 != -1) {
                class110.method857(var26, class18.field440, 743, (byte) 37, 553, 466, 205);
            } else if (class107.field2604[class126.field3014] != -1) {
                class110.method857(var26, class107.field2604[class126.field3014], 743, (byte) 94, 553, 466, 205);
            }
            if (class108.field2624 != -1) {
                class110.method857(var26, class108.field2624, 496, (byte) 95, 17, 453, 357);
            } else if (class69.field1671 != -1) {
                class110.method857(var26, class69.field1671, 496, (byte) 27, 17, 453, 357);
            }
        } else {
            class110.method857(var26, class94.field2161, 765, (byte) 99, 0, 503, 0);
            if (class103.field2493 != -1) {
                class110.method857(var26, class103.field2493, 765, (byte) 26, 0, 503, 0);
            }
        }
        if (class94.field2161 == -1) {
            if (class131.field3169 != -1) {
                class110.method857(~var26, class131.field3169, 516, (byte) 58, 4, 338, 4);
            } else if (class86.field1935 != -1) {
                class110.method857(~var26, class86.field1935, 516, (byte) 118, 4, 338, 4);
            }
            if (class18.field440 != -1) {
                class110.method857(~var26, class18.field440, 743, (byte) 79, 553, 466, 205);
            } else if (class107.field2604[class126.field3014] != -1) {
                class110.method857(~var26, class107.field2604[class126.field3014], 743, (byte) 58, 553, 466, 205);
            }
            if (class108.field2624 != -1) {
                class110.method857(~var26, class108.field2624, 496, (byte) 87, 17, 453, 357);
            } else if (class69.field1671 != -1) {
                class110.method857(~var26, class69.field1671, 496, (byte) 106, 17, 453, 357);
            }
        } else {
            class110.method857(~var26, class94.field2161, 765, (byte) 111, 0, 503, 0);
            if (class103.field2493 != -1) {
                class110.method857(~var26, class103.field2493, 765, (byte) 17, 0, 503, 0);
            }
        }
        class59.method443(35);
        if (class124.field2914 != -1) {
            int var27 = class124.field2914;
            int var28 = class124.field2895;
            boolean var29 = class128.method1015(0, class13.field332.field803[0], var27, var28, class13.field332.field819[0], true, 0, 0, 0, 0, (byte) 72, 0);
            if (var29) {
                class30.field653 = class132.field3191;
                class35.field895 = class90.field2041;
                class92.field2096 = 0;
                class96.field2238 = 1;
            }
            class124.field2914 = -1;
        }
        if (class80.field1841 == 1 && class135.field3285 != null) {
            class80.field1841 = 0;
            class122.field2880 = true;
            class135.field3285 = null;
        }
        class74.method505((byte) 38);
        if (class94.field2161 == -1) {
            class135.method1064(-109);
            class104.method759(arg0 - 48844);
            class50.method391((byte) 124);
        }
        if (class53.field1349 == -1 && class1.field1 == -1 && class131.field3180 == -1) {
            if (class110.field2671 > 0) {
                class110.field2671--;
            }
        } else if (class106.field2588 > class110.field2671) {
            class110.field2671++;
            if (class110.field2671 == class106.field2588) {
                if (class53.field1349 != -1) {
                    class122.field2880 = true;
                }
                if (class1.field1 != -1) {
                    class45.field1124 = true;
                }
            }
        }
        if (class106.field2572 == 1 || class80.field1841 == 1) {
            class49.field1259++;
        }
        class133.method1044(arg0 ^ 0xFFFFB79D);
        if (class8.field198) {
            class134.method1052((byte) 126);
        }
        for (int var30 = 0; var30 < 5; var30++) {
            int var10002 = class13.field343[var30]++;
        }
        if (arg0 != 18439) {
            return;
        }
        class45.method310(-1);
        int var31 = class42.method288(-128);
        int var32 = method604((byte) -86);
        if (var31 > 4500 && var32 > 4500) {
            class70.field1675 = 250;
            class134.method1047(4000, 8);
            class98.field2329++;
            class92.field2094.method290((byte) 0, 87);
        }
        class118.field2788++;
        class38.field933++;
        class41.field1021++;
        if (class38.field933 > 500) {
            int var33 = (int) (Math.random() * 8.0D);
            if ((var33 & 0x2) == 2) {
                class34.field868 += class2.field45;
            }
            if ((var33 & 0x4) == 4) {
                class87.field1948 += class88.field1992;
            }
            class38.field933 = 0;
            if ((var33 & 0x1) == 1) {
                class70.field1695 += class42.field1055;
            }
        }
        if (class87.field1948 < -40) {
            class88.field1992 = 1;
        }
        if (class34.field868 < -55) {
            class2.field45 = 2;
        }
        if (class70.field1695 < -50) {
            class42.field1055 = 2;
        }
        if (class70.field1695 > 50) {
            class42.field1055 = -2;
        }
        if (class87.field1948 > 40) {
            class88.field1992 = -1;
        }
        if (class34.field868 > 55) {
            class2.field45 = -2;
        }
        if (class118.field2788 > 500) {
            class118.field2788 = 0;
            int var34 = (int) (Math.random() * 8.0D);
            if ((var34 & 0x2) == 2) {
                class63.field1541 += class108.field2626;
            }
            if ((var34 & 0x1) == 1) {
                class42.field1041 += class122.field2881;
            }
        }
        if (class42.field1041 < -60) {
            class122.field2881 = 2;
        }
        if (class42.field1041 > 60) {
            class122.field2881 = -2;
        }
        if (class63.field1541 < -20) {
            class108.field2626 = 1;
        }
        if (class63.field1541 > 10) {
            class108.field2626 = -1;
        }
        if (class41.field1021 > 50) {
            class92.field2094.method290((byte) 0, 215);
            class55.field1442++;
        }
        try {
            if (class110.field2684 != null && class92.field2094.field2563 > 0) {
                class110.field2684.method1086(0, class92.field2094.field2554, class92.field2094.field2563, (byte) -70);
                class41.field1021 = 0;
                class92.field2094.field2563 = 0;
            }
        } catch (IOException var35) {
            class4.method27((byte) -118);
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Ltc;II)V", line = 2124)
    public class91(class116 arg0, int arg1, int arg2) throws IOException {
        this.field2056 = arg0;
        this.field2067 = this.field2072 = arg0.method895(-89);
        this.field2070 = new byte[arg1];
        this.field2053 = 0L;
        this.field2059 = new byte[arg2];
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V", line = 803)
    public final void method610(int arg0) throws IOException {
        if (arg0 != -5691) {
            field2083 = null;
        }
        field2061++;
        this.method612(true);
        this.field2056.method897(1);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(JB)V", line = 831)
    public final void method611(long arg0, byte arg1) {
        field2068++;
        if (arg1 < -72 && arg0 >= 0L) {
            this.field2053 = arg0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V", line = 848)
    private final void method612(boolean arg0) throws IOException {
        if (!arg0) {
            this.method607((byte) -16);
        }
        if (this.field2057 != -1L) {
            long var2 = -1L;
            if (this.field2057 != this.field2052) {
                this.field2056.method894(this.field2057, 85);
                this.field2052 = this.field2057;
            }
            this.field2056.method892(0, this.field2059, this.field2065, 1);
            if (this.field2057 >= this.field2049 && this.field2057 < (long) this.field2073 + this.field2049) {
                var2 = this.field2057;
            } else if (this.field2057 <= this.field2049 && this.field2057 + (long) this.field2065 > this.field2049) {
                var2 = this.field2049;
            }
            long var4 = -1L;
            if ((long) this.field2065 + this.field2057 > this.field2049 && (long) this.field2073 + this.field2049 >= (long) this.field2065 + this.field2057) {
                var4 = (long) this.field2065 + this.field2057;
            } else if (this.field2049 + (long) this.field2073 > this.field2057 && (long) this.field2065 + this.field2057 >= (long) this.field2073 + this.field2049) {
                var4 = this.field2049 + (long) this.field2073;
            }
            this.field2052 += this.field2065;
            if (this.field2072 < this.field2052) {
                this.field2072 = this.field2052;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class84.method556(this.field2059, (int) (var2 - this.field2057), this.field2070, (int) (var2 - this.field2049), var6);
            }
            this.field2057 = -1L;
            this.field2065 = 0;
        }
        field2063++;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V", line = 928)
    public static final void method613(int arg0) {
        if (arg0 != 2) {
            return;
        }
        if (class110.field2682 == 1) {
            class30 var1 = class14.method86(class126.field2990, false);
            if (class58.field1477 != -1) {
                if (var1 == null || var1.field745 == null || var1.field745.length <= class58.field1477) {
                    var1 = null;
                } else {
                    var1 = var1.field745[class58.field1477];
                }
            }
            if (var1 != null && var1.field650 != null) {
                class45.method312(var1.field650, 0, 0, var1, arg0 + 66, 0);
            }
        }
        class110.field2682 = 0;
        field2062++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([BIII)V", line = 965)
    public final void method614(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2066++;
        try {
            if (arg0.length < arg2 + arg1) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg1 - arg0.length);
            }
            if (this.field2057 != -1L && this.field2057 <= this.field2053 && (long) this.field2065 + this.field2057 >= (long) arg1 + this.field2053) {
                class84.method556(this.field2059, (int) (this.field2053 - this.field2057), arg0, arg2, arg1);
                this.field2053 += arg1;
                return;
            }
            long var5 = this.field2053;
            int var7 = arg1;
            int var8 = arg2;
            if (this.field2053 >= this.field2049 && this.field2053 < (long) this.field2073 + this.field2049) {
                int var9 = (int) (this.field2049 + (long) this.field2073 - this.field2053);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class84.method556(this.field2070, (int) (this.field2053 - this.field2049), arg0, arg2, var9);
                this.field2053 += var9;
                arg2 += var9;
                arg1 -= var9;
            }
            if (this.field2070.length < arg1) {
                this.field2056.method894(this.field2053, 97);
                this.field2052 = this.field2053;
                while (arg1 > 0) {
                    int var10 = this.field2056.method893(-1, arg0, arg1, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    this.field2052 += var10;
                    arg1 -= var10;
                    this.field2053 += var10;
                    arg2 += var10;
                }
            } else if (arg1 > 0) {
                this.method605(false);
                int var11 = arg1;
                if (arg1 > this.field2073) {
                    var11 = this.field2073;
                }
                arg1 -= var11;
                class84.method556(this.field2070, 0, arg0, arg2, var11);
                this.field2053 += var11;
                arg2 += var11;
            }
            if (arg3 < 125) {
                this.method611(-52L, (byte) -11);
            }
            if (this.field2057 != -1L) {
                if (this.field2053 < this.field2057 && arg1 > 0) {
                    int var12 = (int) (this.field2057 - this.field2053) + arg2;
                    if (arg1 + arg2 < var12) {
                        var12 = arg1 + arg2;
                    }
                    while (arg2 < var12) {
                        arg1--;
                        arg0[arg2++] = 0;
                        this.field2053++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field2057 && (long) var7 + var5 > this.field2057) {
                    var13 = this.field2057;
                } else if (this.field2057 <= var5 && (long) this.field2065 + this.field2057 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((long) this.field2065 + this.field2057 > var5 && (long) var7 + var5 >= (long) this.field2065 + this.field2057) {
                    var15 = (long) this.field2065 + this.field2057;
                } else if (this.field2057 < (long) var7 + var5 && (long) var7 + var5 <= this.field2057 - -((long) this.field2065)) {
                    var15 = (long) var7 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class84.method556(this.field2059, (int) (var13 - this.field2057), arg0, (int) (var13 - var5) + var8, var17);
                    if (var15 > this.field2053) {
                        arg1 = (int) ((long) arg1 + this.field2053 - var15);
                        this.field2053 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2052 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III[B)V", line = 1153)
    public final void method615(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2051++;
        try {
            if ((long) arg1 + this.field2053 > this.field2067) {
                this.field2067 = this.field2053 + (long) arg1;
            }
            if (arg2 == 1173679576) {
                if (this.field2057 != -1L && (this.field2053 < this.field2057 || this.field2053 > (long) this.field2065 + this.field2057)) {
                    this.method612(true);
                }
                if (this.field2057 != -1L && (long) this.field2059.length + this.field2057 < (long) arg1 + this.field2053) {
                    int var5 = (int) ((long) this.field2059.length + this.field2057 - this.field2053);
                    class84.method556(arg3, arg0, this.field2059, (int) (this.field2053 - this.field2057), var5);
                    arg1 -= var5;
                    this.field2053 += var5;
                    arg0 += var5;
                    this.field2065 = this.field2059.length;
                    this.method612(true);
                }
                if (this.field2059.length < arg1) {
                    if (this.field2053 != this.field2052) {
                        this.field2056.method894(this.field2053, 104);
                        this.field2052 = this.field2053;
                    }
                    this.field2056.method892(arg0, arg3, arg1, 1);
                    this.field2052 += arg1;
                    long var6 = -1L;
                    if (this.field2052 > this.field2072) {
                        this.field2072 = this.field2052;
                    }
                    long var8 = -1L;
                    if (this.field2049 <= this.field2053 && this.field2053 < (long) this.field2073 + this.field2049) {
                        var8 = this.field2053;
                    } else if (this.field2053 <= this.field2049 && (long) arg1 + this.field2053 > this.field2049) {
                        var8 = this.field2049;
                    }
                    if (this.field2049 < (long) arg1 + this.field2053 && (long) this.field2073 + this.field2049 >= this.field2053 - -((long) arg1)) {
                        var6 = (long) arg1 + this.field2053;
                    } else if ((long) this.field2073 + this.field2049 > this.field2053 && (long) this.field2073 + this.field2049 <= this.field2053 - -((long) arg1)) {
                        var6 = (long) this.field2073 + this.field2049;
                    }
                    if (var8 > -1L && var6 > var8) {
                        int var10 = (int) (var6 - var8);
                        class84.method556(arg3, (int) ((long) arg0 + var8 - this.field2053), this.field2070, (int) (var8 - this.field2049), var10);
                    }
                    this.field2053 += arg1;
                } else if (arg1 > 0) {
                    if (this.field2057 == -1L) {
                        this.field2057 = this.field2053;
                    }
                    class84.method556(arg3, arg0, this.field2059, (int) (this.field2053 - this.field2057), arg1);
                    this.field2053 += arg1;
                    if ((long) this.field2065 < this.field2053 - this.field2057) {
                        this.field2065 = (int) (this.field2053 - this.field2057);
                    }
                }
            }
        } catch (IOException var12) {
            this.field2052 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(B)V", line = 1284)
    public static void method616(byte arg0) {
        field2054 = null;
        field2077 = null;
        field2076 = null;
        field2084 = null;
        field2082 = null;
        field2075 = null;
        field2083 = null;
        field2058 = null;
        field2078 = null;
        field2081 = null;
        if (arg0 < 5) {
            field2076 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBIIII[Lee;III)Z", line = 1308)
    public static final boolean method617(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class30[] arg6, int arg7, int arg8, int arg9) {
        if (arg1 != -41) {
            method609(74);
        }
        field2074++;
        boolean var10 = true;
        class27.method166(arg5, arg8, arg2, arg7);
        for (int var11 = 0; var11 < arg6.length; var11++) {
            class30 var12 = arg6[var11];
            if (var12 != null && var12.field722 == arg4) {
                if (var12.field734 > 0) {
                    class110.method856((byte) -46, var12);
                }
                int var13 = var12.field724;
                int var14 = arg8 + var12.field688 - arg3;
                int var15 = var12.field683 + arg5 - arg0;
                if (class89.field2009 == var12) {
                    class30 var16 = class96.method644(var12, true);
                    if (var16 == null) {
                        class89.field2009 = null;
                    } else {
                        int[] var17 = class52.method405(var16, (byte) 61);
                        int[] var18 = class52.method405(var12, (byte) 114);
                        int var19 = class40.field1001 - class108.field2643;
                        if (!var12.field649) {
                            var13 = 128;
                        }
                        int var20 = class135.field3282 - class67.field1647;
                        if (var12.field657 >= var19 && var19 >= -var12.field657 && var12.field657 >= var20 && var20 >= -var12.field657 && !class74.field1728) {
                            var19 = 0;
                            var20 = 0;
                        } else if (class77.field1779 > var12.field669 || class74.field1728) {
                            class74.field1728 = true;
                        } else {
                            var19 = 0;
                            var20 = 0;
                        }
                        int var21 = var18[0] + var19 - var17[0];
                        int var22 = var18[1] + var20 - var17[1];
                        if (var21 < 0) {
                            var21 = 0;
                        }
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        if (var12.field684 + var22 > var16.field684) {
                            var22 = var16.field684 - var12.field684;
                        }
                        if (var12.field700 + var21 > var16.field700) {
                            var21 = var16.field700 - var12.field700;
                        }
                        var15 = var17[0] + var21;
                        var14 = var17[1] + var22;
                    }
                }
                if ((!var12.field644 || var15 <= class27.field600 && var14 <= class27.field603 && var12.field700 + var15 >= class27.field604 && var12.field684 + var14 >= class27.field602) && (!var12.field644 || !var12.field638)) {
                    if (var12.field660 == 0) {
                        if (var12.field638 && !class12.method70(1, var11, arg9)) {
                            continue;
                        }
                        if (!var12.field644) {
                            if (var12.field670 - var12.field684 < var12.field697) {
                                var12.field697 = var12.field670 - var12.field684;
                            }
                            if (var12.field697 < 0) {
                                var12.field697 = 0;
                            }
                        }
                        var10 &= method617(var12.field718, (byte) -41, var12.field700 + var15, var12.field697, var12.field704, var15, arg6, var12.field684 + var14, var14, arg9);
                        if (var12.field745 != null) {
                            var10 &= method617(var12.field718, (byte) -41, var12.field700 + var15, var12.field697, var12.field704, var15, var12.field745, var12.field684 + var14, var14, arg9);
                        }
                        class27.method166(arg5, arg8, arg2, arg7);
                        if (var12.field670 > var12.field684) {
                            class65.method467(var14, var12.field697, 16, var12.field670, var12.field684, var15 + var12.field700);
                        }
                    }
                    if (var12.field660 != 1) {
                        if (var12.field660 == 2) {
                            int var23 = 0;
                            for (int var24 = 0; var24 < var12.field684; var24++) {
                                for (int var25 = 0; var25 < var12.field700; var25++) {
                                    int var26 = (var12.field674 + 32) * var25 + var15;
                                    int var27 = (var12.field636 + 32) * var24 + var14;
                                    if (var23 < 20) {
                                        var26 += var12.field696[var23];
                                        var27 += var12.field694[var23];
                                    }
                                    if (var12.field710[var23] > 0) {
                                        boolean var28 = false;
                                        boolean var29 = false;
                                        int var30 = var12.field710[var23] - 1;
                                        if (class27.field604 - 32 < var26 && var26 < class27.field600 && var27 > class27.field602 - 32 && class27.field603 > var27 || class43.field1090 != 0 && class65.field1583 == var23) {
                                            class46 var31;
                                            if (class137.field3344 == 1 && class1.field24 == var23 && class30.field748 == var12.field704) {
                                                var31 = class115.method888(false, var12.field708[var23], 0, 2011, var30, 2);
                                            } else {
                                                var31 = class115.method888(false, var12.field708[var23], 3153952, 2011, var30, 1);
                                            }
                                            if (var31 == null) {
                                                var10 = false;
                                            } else if (class43.field1090 != 0 && class65.field1583 == var23 && class60.field1504 == var12.field704) {
                                                int var32 = class40.field1001 - class92.field2114;
                                                if (var32 < 5 && var32 > -5) {
                                                    var32 = 0;
                                                }
                                                int var33 = class135.field3282 - class114.field2752;
                                                if (var33 < 5 && var33 > -5) {
                                                    var33 = 0;
                                                }
                                                if (class96.field2243 < 5) {
                                                    var32 = 0;
                                                    var33 = 0;
                                                }
                                                var31.method321(var26 + var32, var27 + var33, 128);
                                                if (arg4 != -1) {
                                                    class30 var34 = arg6[arg4 & 0xFFFF];
                                                    if (var27 + var33 < class27.field602 && var34.field697 > 0) {
                                                        int var35 = (class27.field602 - var27 - var33) * class86.field1919 / 3;
                                                        if (class86.field1919 * 10 < var35) {
                                                            var35 = class86.field1919 * 10;
                                                        }
                                                        if (var35 > var34.field697) {
                                                            var35 = var34.field697;
                                                        }
                                                        class114.field2752 += var35;
                                                        var34.field697 -= var35;
                                                    }
                                                    if (class27.field603 < var33 + var27 + 32 && var34.field697 < var34.field670 - var34.field684) {
                                                        int var36 = (var27 + var33 + 32 - class27.field603) * class86.field1919 / 3;
                                                        if (var36 > class86.field1919 * 10) {
                                                            var36 = class86.field1919 * 10;
                                                        }
                                                        if (var36 > var34.field670 - var34.field684 - var34.field697) {
                                                            var36 = var34.field670 - var34.field697 - var34.field684;
                                                        }
                                                        class114.field2752 -= var36;
                                                        var34.field697 += var36;
                                                    }
                                                }
                                            } else if (class35.field892 != 0 && class7.field182 == var23 && class120.field2848 == var12.field704) {
                                                var31.method321(var26, var27, 128);
                                            } else {
                                                var31.method342(var26, var27);
                                            }
                                        }
                                    } else if (var12.field705 != null && var23 < 20) {
                                        class46 var37 = var12.method192(var23, arg1 ^ 0x7F);
                                        if (var37 != null) {
                                            var37.method342(var26, var27);
                                        } else if (class43.field1075) {
                                            var10 = false;
                                        }
                                    }
                                    var23++;
                                }
                            }
                        } else if (var12.field660 == 3) {
                            int var38;
                            if (class115.method889(var12, 105)) {
                                var38 = var12.field744;
                                if (class12.method70(1, var11, arg9) && var12.field635 != 0) {
                                    var38 = var12.field635;
                                }
                            } else {
                                var38 = var12.field654;
                                if (class12.method70(1, var11, arg9) && var12.field725 != 0) {
                                    var38 = var12.field725;
                                }
                            }
                            if (var13 == 0) {
                                if (var12.field720) {
                                    class27.method164(var15, var14, var12.field700, var12.field684, var38);
                                } else {
                                    class27.method168(var15, var14, var12.field700, var12.field684, var38);
                                }
                            } else if (var12.field720) {
                                class27.method173(var15, var14, var12.field700, var12.field684, var38, 256 - (var13 & 0xFF));
                            } else {
                                class27.method167(var15, var14, var12.field700, var12.field684, var38, 256 - (var13 & 0xFF));
                            }
                        } else if (var12.field660 == 4) {
                            class47 var39 = var12.method195((byte) 45);
                            if (var39 != null) {
                                class40 var40 = var12.field726;
                                int var41;
                                if (class115.method889(var12, 12)) {
                                    var41 = var12.field744;
                                    if (class12.method70(1, var11, arg9) && var12.field635 != 0) {
                                        var41 = var12.field635;
                                    }
                                    if (var12.field676.method255(-10) > 0) {
                                        var40 = var12.field676;
                                    }
                                } else {
                                    var41 = var12.field654;
                                    if (class12.method70(arg1 ^ 0xFFFFFFD6, var11, arg9) && var12.field725 != 0) {
                                        var41 = var12.field725;
                                    }
                                }
                                if (var12.field644 && var12.field675 != -1) {
                                    class4 var42 = class132.method1041(var12.field675, 34);
                                    var40 = var42.field114;
                                    if (var40 == null) {
                                        var40 = class61.field1530;
                                    }
                                    if (var42.field99 == 1 || var12.field753 != 1) {
                                        var40 = client.method114(true, new class40[] { var40, class10.field263, class4.method25(var12.field753, 38) });
                                    }
                                }
                                if (var12.field656 == 6 && class56.field1447 == var12.field704) {
                                    var40 = class69.field1672;
                                    var41 = var12.field654;
                                }
                                if (class27.field601 == 479) {
                                    if (var41 == 16776960) {
                                        var41 = 255;
                                    }
                                    if (var41 == 49152) {
                                        var41 = 16777215;
                                    }
                                }
                                class40 var43 = class8.method47(var40, (byte) -90, var12);
                                var39.method366(var43, var15, var14, var12.field700, var12.field684, var41, var12.field717, var12.field643, var12.field715, var12.field727);
                            } else if (class43.field1075) {
                                var10 = false;
                            }
                        } else if (var12.field660 == 5) {
                            if (var12.field644) {
                                class46 var44;
                                if (var12.field675 == -1) {
                                    var44 = var12.method193(0, false);
                                } else {
                                    var44 = class115.method888(false, var12.field753, var12.field652, arg1 ^ 0xFFFFF80C, var12.field675, var12.field662);
                                }
                                if (var44 != null) {
                                    int var45 = var44.field1165;
                                    int var46 = var44.field1168;
                                    if (var12.field698) {
                                        int[] var47 = new int[4];
                                        class27.method161(var47);
                                        int var48 = var15;
                                        if (var47[0] > var15) {
                                            var48 = var47[0];
                                        }
                                        int var49 = var14;
                                        int var50 = var15 + var12.field700;
                                        int var51 = var12.field684 + var14;
                                        if (var50 > var47[2]) {
                                            var50 = var47[2];
                                        }
                                        if (var47[3] < var51) {
                                            var51 = var47[3];
                                        }
                                        if (var14 < var47[1]) {
                                            var49 = var47[1];
                                        }
                                        class27.method166(var48, var49, var50, var51);
                                        int var52 = (var46 + var12.field684 - 1) / var46;
                                        int var53 = (var12.field700 + var45 - 1) / var45;
                                        for (int var54 = 0; var54 < var53; var54++) {
                                            for (int var55 = 0; var55 < var52; var55++) {
                                                if (var12.field686 != 0) {
                                                    var44.method325(var45 / 2 + var45 * var54 + var15, var46 / 2 + (var14 - -(var46 * var55)), var12.field686, 4096);
                                                } else if (var13 == 0) {
                                                    var44.method342(var15 + var45 * var54, var14 - -(var46 * var55));
                                                } else {
                                                    var44.method321(var15 + var45 * var54, var46 * var55 + var14, 256 - (var13 & 0xFF));
                                                }
                                            }
                                        }
                                        class27.method160(var47);
                                    } else {
                                        int var56 = var12.field700 * 4096 / var45;
                                        if (var12.field686 != 0) {
                                            var44.method325(var15 + var12.field700 / 2, var12.field684 / 2 + var14, var12.field686, var56);
                                        } else if (var13 != 0) {
                                            var44.method326(var15, var14, var12.field700, var12.field684, 256 - (var13 & 0xFF));
                                        } else if (var12.field700 == var45 && var12.field684 == var46) {
                                            var44.method342(var15, var14);
                                        } else {
                                            var44.method343(var15, var14, var12.field700, var12.field684);
                                        }
                                    }
                                } else if (class43.field1075) {
                                    var10 = false;
                                }
                            } else {
                                class46 var57 = var12.method193(0, class115.method889(var12, arg1 + 145));
                                if (var57 != null) {
                                    var57.method342(var15, var14);
                                } else if (class43.field1075) {
                                    var10 = false;
                                }
                            }
                        } else if (var12.field660 == 6) {
                            boolean var58 = class115.method889(var12, 19);
                            int var59;
                            if (var58) {
                                var59 = var12.field642;
                            } else {
                                var59 = var12.field749;
                            }
                            Object var60 = null;
                            class97 var62;
                            if (var12.field647 == 5) {
                                if (var12.field701 == 0) {
                                    var62 = class30.field634.method860(-1, null, null, (byte) -95, -1);
                                } else {
                                    var62 = class13.field332.method2((byte) -113);
                                }
                            } else if (var59 == -1) {
                                var62 = var12.method198(true, var58, null, class13.field332.field2217, -1);
                                if (var62 == null && class43.field1075) {
                                    var10 = false;
                                }
                            } else {
                                class45 var61 = class22.method126((byte) -95, var59);
                                var62 = var12.method198(true, var58, var61, class13.field332.field2217, var12.field742);
                                if (var62 == null && class43.field1075) {
                                    var10 = false;
                                }
                            }
                            int var63 = var12.field658;
                            int var64 = var12.field746;
                            int var65 = var12.field730;
                            int var66 = var12.field646;
                            int var67 = var12.field645;
                            int var68 = var12.field680;
                            if (var12.field675 != -1) {
                                class4 var69 = class132.method1041(var12.field675, 86);
                                if (var69 != null) {
                                    class4 var70 = var69.method21(-119, var12.field753);
                                    var62 = var70.method22(1, true, arg1 - 88);
                                    var63 = var70.field140;
                                    var67 = var70.field132;
                                    var64 = var70.field113;
                                    if (var12.field700 > 0) {
                                        var67 = var67 * 32 / var12.field700;
                                    }
                                    var68 = var70.field116;
                                    var66 = var70.field90;
                                    var65 = var70.field96;
                                }
                            }
                            class109.method845(var12.field700 / 2 + var15, var14 - -(var12.field684 / 2));
                            int var71 = class109.field2659[var63] * var67 >> 16;
                            int var72 = class109.field2657[var63] * var67 >> 16;
                            if (var62 != null) {
                                if (var12.field644) {
                                    var62.method672();
                                    if (var12.field665) {
                                        var62.method659(0, var66, var64, var63, var68, var62.field11 / 2 + var65 + var71, var72 - -var65, var67);
                                    } else {
                                        var62.method674(0, var66, var64, var63, var68, var62.field11 / 2 + var65 + var71, var65 + var72);
                                    }
                                } else {
                                    var62.method674(0, var66, 0, var63, 0, var71, var72);
                                }
                            }
                            class109.method841();
                        } else {
                            if (var12.field660 == 7) {
                                class47 var73 = var12.method195((byte) 45);
                                if (var73 == null) {
                                    if (class43.field1075) {
                                        var10 = false;
                                    }
                                    continue;
                                }
                                int var74 = 0;
                                for (int var75 = 0; var75 < var12.field684; var75++) {
                                    for (int var76 = 0; var76 < var12.field700; var76++) {
                                        if (var12.field710[var74] > 0) {
                                            class4 var77 = class132.method1041(var12.field710[var74] - 1, 52);
                                            class40 var78 = var77.field114;
                                            if (var78 == null) {
                                                var78 = class61.field1530;
                                            }
                                            if (var77.field99 == 1 || var12.field708[var74] != 1) {
                                                var78 = client.method114(true, new class40[] { var78, class10.field263, class4.method25(var12.field708[var74], 80) });
                                            }
                                            int var79 = (var12.field674 + 115) * var76 + var15;
                                            int var80 = (var12.field636 + 12) * var75 + var14;
                                            if (var12.field643 == 0) {
                                                var73.method358(var78, var79, var80, var12.field654, var12.field717);
                                            } else if (var12.field643 == 1) {
                                                var73.method364(var78, var12.field700 / 2 + var79, var80, var12.field654, var12.field717);
                                            } else {
                                                var73.method351(var78, var12.field700 + var79 - 1, var80, var12.field654, var12.field717);
                                            }
                                        }
                                        var74++;
                                    }
                                }
                            }
                            if (var12.field660 == 8 && class66.method472(var11, arg9, 213) && class110.field2671 == class106.field2588) {
                                int var81 = 0;
                                class47 var82 = class133.field3238;
                                int var83 = 0;
                                class40 var84 = var12.field726;
                                class40 var85 = class8.method47(var84, (byte) -106, var12);
                                while (var85.method255(-10) > 0) {
                                    int var93 = var85.method258(class44.field1110, (byte) -74);
                                    class40 var94;
                                    if (var93 == -1) {
                                        var94 = var85;
                                        var85 = class125.field2966;
                                    } else {
                                        var94 = var85.method242(0, -12448, var93);
                                        var85 = var85.method240(-28427, var93 + 2);
                                    }
                                    int var95 = var82.method362(var94);
                                    var83 += var82.field1171 + 1;
                                    if (var81 < var95) {
                                        var81 = var95;
                                    }
                                }
                                var83 += 7;
                                int var86 = var14 + var12.field684 + 5;
                                if (var86 + var83 > arg7) {
                                    var86 = arg7 - var83;
                                }
                                var81 += 6;
                                int var87 = var15 + var12.field700 - var81 - 5;
                                if (var87 < var15 + 5) {
                                    var87 = var15 + 5;
                                }
                                if (arg2 < var87 + var81) {
                                    var87 = arg2 - var81;
                                }
                                class27.method164(var87, var86, var81, var83, 16777120);
                                class27.method168(var87, var86, var81, var83, 0);
                                class40 var88 = var12.field726;
                                int var89 = var82.field1171 + var86 + 2;
                                class40 var90 = class8.method47(var88, (byte) -103, var12);
                                while (var90.method255(-10) > 0) {
                                    int var91 = var90.method258(class44.field1110, (byte) 73);
                                    class40 var92;
                                    if (var91 == -1) {
                                        var92 = var90;
                                        var90 = class125.field2966;
                                    } else {
                                        var92 = var90.method242(0, -12448, var91);
                                        var90 = var90.method240(-28427, var91 + 2);
                                    }
                                    var82.method358(var92, var87 + 3, var89, 0, false);
                                    var89 += var82.field1171 + 1;
                                }
                            }
                            if (var12.field660 == 9) {
                                if (var12.field648 == 1) {
                                    class27.method158(var15, var14, var15 + var12.field700, var12.field684 + var14, var12.field654);
                                } else {
                                    int var96 = var12.field700 < 0 ? -var12.field700 : var12.field700;
                                    int var97 = var12.field684 >= 0 ? var12.field684 : -var12.field684;
                                    int var98 = var96;
                                    if (var96 < var97) {
                                        var98 = var97;
                                    }
                                    if (var98 != 0) {
                                        int var99 = (var12.field684 << 16) / var98;
                                        int var100 = (var12.field700 << 16) / var98;
                                        if (var99 > var100) {
                                            var99 = -var99;
                                        } else {
                                            var100 = -var100;
                                        }
                                        int var101 = var12.field648 * var99 >> 17;
                                        int var102 = var12.field648 * var100 >> 17;
                                        int var103 = var12.field648 * var99 + 1 >> 17;
                                        int var104 = var15 - var103;
                                        int var105 = var15 + var12.field700 - var103;
                                        int var106 = var15 + var101;
                                        int var107 = var12.field700 + var15 + var101;
                                        int var108 = var14 + var102;
                                        int var109 = var12.field648 * var100 + 1 >> 17;
                                        int var110 = var14 - var109;
                                        int var111 = var14 + var12.field684 - var109;
                                        int var112 = var14 + var12.field684 + var102;
                                        class109.method839(var106, var104, var105);
                                        class109.method850(var108, var110, var111, var106, var104, var105, var12.field654);
                                        class109.method839(var106, var105, var107);
                                        class109.method850(var108, var111, var112, var106, var105, var107, var12.field654);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return var10;
    }
}
