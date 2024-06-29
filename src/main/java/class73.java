import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class73 extends class221 {

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    private final int field1420;

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
    private final int field1432;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    private final int field1413;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    private final int field1412;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    private final int field1416;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    private final int field1418;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    private final int field1423;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    private final int field1425;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1417 = new CRC32();

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "[Z")
    public static boolean[] field1422 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field1421 = 0;

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "Lrd;")
    private static class173 field1427 = class133.method843("Login", 65);

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "[Lpd;")
    public static class153[] field1430 = new class153[23];

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "Lrd;")
    public static class173 field1431 = field1427;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "Lrd;")
    public static class173 field1426 = class133.method843("Bitte wenden Sie sich an den Kundendienst)3", -70);

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "Laf;")
    public static class7 field1429 = new class7(50);

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "Lrd;")
    public static class173 field1434 = class133.method843("<col=ffb000>", 75);

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIB)V")
    public final void method399(int arg0, int arg1, byte arg2) {
        int var4 = 88 / ((-50 - arg2) / 44);
        ++field1428;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1420 = arg6;
        this.field1432 = arg0;
        this.field1413 = arg5;
        this.field1412 = arg2;
        this.field1416 = arg1;
        this.field1418 = arg4;
        this.field1423 = arg7;
        this.field1425 = arg3;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V")
    public final void method394(int arg0, int arg1, int arg2) {
        ++field1419;
        if (arg0 != 0) {
            this.method393(-84, -111, -8);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method451(byte arg0) {
        field1426 = null;
        field1430 = null;
        field1429 = null;
        field1427 = null;
        if (arg0 != 9) {
            method451((byte) 123);
        }
        field1431 = null;
        field1417 = null;
        field1434 = null;
        field1422 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
    public final void method393(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method452(-47);
        }
        int var4 = this.field1432 * arg1 >> 12;
        int var5 = this.field1416 * arg0 >> 12;
        ++field1415;
        int var6 = this.field1425 * arg0 >> 12;
        int var7 = this.field1412 * arg1 >> 12;
        int var8 = this.field1418 * arg1 >> 12;
        int var9 = this.field1423 * arg0 >> 12;
        int var10 = this.field1413 * arg0 >> 12;
        int var11 = this.field1420 * arg1 >> 12;
        class158.method1038(var7, var10, var11, var5, var9, super.field4246, var4, var8, var6, (byte) -111);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Z")
    public static final boolean method452(int arg0) {
        ++field1424;
        class71 var1 = class15.field343;
        synchronized (class15.field343) {
            if (arg0 != -26290) {
                return false;
            } else if (class25.field539 == class202.field3896) {
                return false;
            } else {
                class122.field2300 = class223.field4269[class202.field3896];
                class135.field2554 = class66.field1293[class202.field3896];
                class202.field3896 = 127 & class202.field3896 - -1;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
    public static final void method453(byte arg0) {
        ++field1414;
        if (class12.field199 > 1) {
            --class12.field199;
        }
        if (class63.field1243 > 0) {
            --class63.field1243;
        }
        if (class158.field2960) {
            class158.field2960 = false;
            class11.method71(-18070);
        } else {
            if (arg0 < 82) {
                method452(81);
            }
            for (int var1 = 0; ~var1 > -101 && class176.method1171(-752901085); ++var1) {
            }
            if (class24.field525 == 30) {
                class31.method255(class165.field3175, 108, -472);
                Object var2 = class160.field2986.field25;
                synchronized (class160.field2986.field25) {
                    if (!class151.field2859) {
                        class160.field2986.field34 = 0;
                    } else if (~class120.field2208 != -1 || class160.field2986.field34 >= 40) {
                        ++class172.field3329;
                        class165.field3175.method1023(11, -21822);
                        class165.field3175.method752(0, (byte) -128);
                        int var3 = 0;
                        int var4 = class165.field3175.field2222;
                        for (int var5 = 0; ~class160.field2986.field34 < ~var5 && ~(-var4 + class165.field3175.field2222) > -241; ++var5) {
                            ++var3;
                            int var6 = class160.field2986.field35[var5];
                            if (~var6 <= -1) {
                                if (~var6 < -503) {
                                    var6 = 502;
                                }
                            } else {
                                var6 = 0;
                            }
                            int var7 = class160.field2986.field36[var5];
                            if (var7 < 0) {
                                var7 = 0;
                            } else if (~var7 < -765) {
                                var7 = 764;
                            }
                            int var8 = var6 * 765 + var7;
                            if (~class160.field2986.field35[var5] == 0 && ~class160.field2986.field36[var5] == 0) {
                                var8 = 524287;
                                var6 = -1;
                                var7 = -1;
                            }
                            if (class110.field2041 == var7 && class150.field2852 == var6) {
                                if (~class100.field1828 > -2048) {
                                    ++class100.field1828;
                                }
                            } else {
                                int var9 = var7 - class110.field2041;
                                int var10 = -class150.field2852 + var6;
                                class110.field2041 = var7;
                                class150.field2852 = var6;
                                if (class100.field1828 < 8 && ~var9 <= 31 && var9 <= 31 && ~var10 <= 31 && var10 <= 31) {
                                    var10 += 32;
                                    var9 += 32;
                                    class165.field3175.method736((var9 << 6) + (class100.field1828 << 12) + var10, -120);
                                    class100.field1828 = 0;
                                } else if (~class100.field1828 > -9) {
                                    class165.field3175.method740((class100.field1828 << 19) + var8 + 8388608, (byte) -91);
                                    class100.field1828 = 0;
                                } else {
                                    class165.field3175.method775(732495312, (class100.field1828 << 19) + -1073741824 + var8);
                                    class100.field1828 = 0;
                                }
                            }
                        }
                        class165.field3175.method786(class165.field3175.field2222 - var4, (byte) -81);
                        if (var3 < class160.field2986.field34) {
                            class160.field2986.field34 -= var3;
                            for (int var11 = 0; ~var11 > ~class160.field2986.field34; ++var11) {
                                class160.field2986.field36[var11] = class160.field2986.field36[var11 - -var3];
                                class160.field2986.field35[var11] = class160.field2986.field35[var3 + var11];
                            }
                        } else {
                            class160.field2986.field34 = 0;
                        }
                    }
                }
                if (~class120.field2208 != -1) {
                    long var12 = (-class172.field3324 + class42.field865) / 50L;
                    int var14 = class23.field493;
                    ++class48.field1014;
                    if (~var12 < -4096L) {
                        var12 = 4095L;
                    }
                    class172.field3324 = class42.field865;
                    int var15 = class41.field849;
                    if (~var15 > -1) {
                        var15 = 0;
                    } else if (var15 > 764) {
                        var15 = 764;
                    }
                    if (~var14 > -1) {
                        var14 = 0;
                    } else if (var14 > 502) {
                        var14 = 502;
                    }
                    int var16 = var14 * 765 + var15;
                    byte var17 = 0;
                    int var18 = (int) var12;
                    if (~class120.field2208 == -3) {
                        var17 = 1;
                    }
                    class165.field3175.method1023(252, -21822);
                    class165.field3175.method741((var18 << 20) + (var17 << 19) + var16, (byte) 9);
                }
                if (class13.field208[96] || class13.field208[97] || class13.field208[98] || class13.field208[99]) {
                    class117.field2157 = true;
                }
                if (class59.field1159 > 0) {
                    --class59.field1159;
                }
                if (class117.field2157 && class59.field1159 <= 0) {
                    class59.field1159 = 20;
                    class117.field2157 = false;
                    ++class215.field4169;
                    class165.field3175.method1023(35, -21822);
                    class165.field3175.method778(class203.field3928, (byte) 74);
                    class165.field3175.method762(class140.field2614, true);
                }
                if (class135.field2556 && !class18.field376) {
                    class18.field376 = true;
                    ++class26.field544;
                    class165.field3175.method1023(37, -21822);
                    class165.field3175.method752(1, (byte) -128);
                }
                if (!class135.field2556 && class18.field376) {
                    class18.field376 = false;
                    class165.field3175.method1023(37, -21822);
                    class165.field3175.method752(0, (byte) -128);
                    ++class26.field544;
                }
                class17.method154(-22278);
                if (~class24.field525 == -31) {
                    class203.method1349((byte) -59);
                    class166.method1076(true);
                    ++class138.field2587;
                    if (class138.field2587 > 750) {
                        class11.method71(-18070);
                    } else {
                        class215.method1409(15977);
                        class105.method649(-1);
                        class64.method405((byte) 106);
                        ++class171.field3305;
                        if (~class155.field2925 != -1) {
                            class161.field2996 += 20;
                            if (class161.field2996 >= 400) {
                                class155.field2925 = 0;
                            }
                        }
                        if (class75.field1485 != null) {
                            ++class3.field21;
                            if (class3.field21 >= 15) {
                                class209.method1379(1, class75.field1485);
                                class75.field1485 = null;
                            }
                        }
                        if (class177.field3470 != null) {
                            class209.method1379(1, class177.field3470);
                            if (class176.field3460 + 5 < class214.field4154 || ~(class176.field3460 + -5) < ~class214.field4154 || class197.field3836 - -5 < class4.field72 || ~(class197.field3836 - 5) < ~class4.field72) {
                                class205.field4018 = true;
                            }
                            ++class178.field3508;
                            if (class144.field2685 == 0) {
                                if (class205.field4018 && ~class178.field3508 <= -6) {
                                    if (class177.field3470 == class105.field1974 && ~class30.field614 != ~class172.field3328) {
                                        ++class126.field2365;
                                        class165 var19 = class177.field3470;
                                        byte var20 = 0;
                                        if (~class188.field3669 == -2 && var19.field3170 == 206) {
                                            var20 = 1;
                                        }
                                        if (~var19.field3111[class30.field614] >= -1) {
                                            var20 = 0;
                                        }
                                        if (!class190.method1267(class78.method474(var19, 114), (byte) -119)) {
                                            if (~var20 == -2) {
                                                int var21 = class172.field3328;
                                                int var22 = class30.field614;
                                                while (~var21 != ~var22) {
                                                    if (~var21 >= ~var22) {
                                                        if (var21 < var22) {
                                                            var19.method1063(var21 - -1, var21, 1);
                                                            ++var21;
                                                        }
                                                    } else {
                                                        var19.method1063(var21 + -1, var21, 1);
                                                        --var21;
                                                    }
                                                }
                                            } else {
                                                var19.method1063(class30.field614, class172.field3328, 1);
                                            }
                                        } else {
                                            int var23 = class172.field3328;
                                            int var24 = class30.field614;
                                            var19.field3111[var24] = var19.field3111[var23];
                                            var19.field3102[var24] = var19.field3102[var23];
                                            var19.field3111[var23] = -1;
                                            var19.field3102[var23] = 0;
                                        }
                                        class165.field3175.method1023(161, -21822);
                                        class165.field3175.method752(var20, (byte) -128);
                                        class165.field3175.method778(class30.field614, (byte) 74);
                                        class165.field3175.method775(732495312, class177.field3470.field3132);
                                        class165.field3175.method762(class172.field3328, true);
                                    }
                                } else if ((~class48.field1019 == -2 || class84.method550(class195.field3792 + -1, 2000)) && ~class195.field3792 < -3) {
                                    class163.method1050(-109);
                                } else if (class195.field3792 > 0) {
                                    class163.method1051((byte) -93, class195.field3792 + -1);
                                }
                                class3.field21 = 10;
                                class120.field2208 = 0;
                                class177.field3470 = null;
                            }
                        }
                        class106.field1983 = 0;
                        class89.field1724 = false;
                        class165 var25 = class96.field1768;
                        class174.field3435 = false;
                        class105.field1941 = null;
                        class96.field1768 = null;
                        class165 var26 = class104.field1924;
                        class104.field1924 = null;
                        while (method452(-26290) && ~class106.field1983 > -129) {
                            class4.field98[class106.field1983] = class122.field2300;
                            class9.field169[class106.field1983] = class135.field2554;
                            ++class106.field1983;
                        }
                        if (~class134.field2539 != 0) {
                            class160.method1048(765, 0, 503, class134.field2539, 0, 0, 0, -1791);
                        }
                        ++class34.field741;
                        while (true) {
                            class117 var27;
                            class165 var28;
                            class165 var29;
                            do {
                                var27 = (class117) class87.field1685.method919(0);
                                if (var27 == null) {
                                    while (true) {
                                        class117 var30;
                                        class165 var31;
                                        class165 var32;
                                        do {
                                            var30 = (class117) class186.field3626.method919(0);
                                            if (var30 == null) {
                                                while (true) {
                                                    class117 var33;
                                                    class165 var34;
                                                    class165 var35;
                                                    do {
                                                        var33 = (class117) class148.field2835.method919(0);
                                                        if (var33 == null) {
                                                            if (class71.field1376 != null) {
                                                                class13.method75(2411);
                                                            }
                                                            if (~class116.field2154 != 0) {
                                                                int var36 = class139.field2598;
                                                                int var37 = class116.field2154;
                                                                boolean var38 = class30.method233(0, var36, class175.field3447.field2814[0], var37, true, 0, 0, 0, class175.field3447.field2764[0], (byte) -2, 0, 0);
                                                                if (var38) {
                                                                    class20.field447 = class41.field849;
                                                                    class31.field650 = class23.field493;
                                                                    class161.field2996 = 0;
                                                                    class155.field2925 = 1;
                                                                }
                                                                class116.field2154 = -1;
                                                            }
                                                            class112.method683((byte) 76);
                                                            if (class96.field1768 != var25) {
                                                                if (var25 != null) {
                                                                    class209.method1379(1, var25);
                                                                }
                                                                if (class96.field1768 != null) {
                                                                    class209.method1379(1, class96.field1768);
                                                                }
                                                            }
                                                            if (class104.field1924 != var26 && class56.field1109 == class189.field3690) {
                                                                if (var26 != null) {
                                                                    class209.method1379(1, var26);
                                                                }
                                                                if (class104.field1924 != null) {
                                                                    class209.method1379(1, class104.field1924);
                                                                }
                                                            }
                                                            if (class104.field1924 != null) {
                                                                if (~class56.field1109 > ~class189.field3690) {
                                                                    ++class56.field1109;
                                                                    if (~class56.field1109 == ~class189.field3690) {
                                                                        class209.method1379(1, class104.field1924);
                                                                    }
                                                                }
                                                            } else if (~class56.field1109 < -1) {
                                                                --class56.field1109;
                                                            }
                                                            class48.method336((byte) -119);
                                                            if (class111.field2070) {
                                                                class133.method844(0);
                                                            }
                                                            for (int var39 = 0; ~var39 > -6; ++var39) {
                                                                int var10002 = class124.field2334[var39]++;
                                                            }
                                                            int var40 = class219.method1430((byte) -41);
                                                            int var41 = class70.method428(5000);
                                                            if (var40 > 4500 && var41 > 4500) {
                                                                class63.field1243 = 250;
                                                                ++class208.field4043;
                                                                class167.method1079(4000, (byte) 29);
                                                                class165.field3175.method1023(247, -21822);
                                                            }
                                                            ++class149.field2845;
                                                            ++class26.field550;
                                                            ++class172.field3343;
                                                            if (~class26.field550 < -501) {
                                                                class26.field550 = 0;
                                                                int var42 = (int) (8.0D * Math.random());
                                                                if (~(var42 & 2) == -3) {
                                                                    class21.field463 += class13.field280;
                                                                }
                                                                if ((var42 & 4) == 4) {
                                                                    class31.field661 += class191.field3739;
                                                                }
                                                                if ((1 & var42) == 1) {
                                                                    class92.field1740 += class105.field1973;
                                                                }
                                                            }
                                                            if (class92.field1740 < -50) {
                                                                class105.field1973 = 2;
                                                            }
                                                            if (class92.field1740 > 50) {
                                                                class105.field1973 = -2;
                                                            }
                                                            if (~class31.field661 > 39) {
                                                                class191.field3739 = 1;
                                                            }
                                                            if (class21.field463 < -55) {
                                                                class13.field280 = 2;
                                                            }
                                                            if (class31.field661 > 40) {
                                                                class191.field3739 = -1;
                                                            }
                                                            if (~class21.field463 < -56) {
                                                                class13.field280 = -2;
                                                            }
                                                            if (~class149.field2845 < -501) {
                                                                class149.field2845 = 0;
                                                                int var43 = (int) (8.0D * Math.random());
                                                                if (~(var43 & 2) == -3) {
                                                                    class167.field3225 += class182.field3579;
                                                                }
                                                                if ((1 & var43) == 1) {
                                                                    class140.field2620 += client.field626;
                                                                }
                                                            }
                                                            if (class167.field3225 < -20) {
                                                                class182.field3579 = 1;
                                                            }
                                                            if (class140.field2620 < -60) {
                                                                client.field626 = 2;
                                                            }
                                                            if (~class167.field3225 < -11) {
                                                                class182.field3579 = -1;
                                                            }
                                                            if (~class140.field2620 < -61) {
                                                                client.field626 = -2;
                                                            }
                                                            if (~class172.field3343 < -51) {
                                                                class165.field3175.method1023(193, -21822);
                                                                ++class58.field1153;
                                                            }
                                                            try {
                                                                if (class34.field738 != null && ~class165.field3175.field2222 < -1) {
                                                                    class34.field738.method1097(0, class165.field3175.field2218, class165.field3175.field2222, (byte) -84);
                                                                    class172.field3343 = 0;
                                                                    class165.field3175.field2222 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var44) {
                                                                class11.method71(-18070);
                                                                return;
                                                            }
                                                        }
                                                        var34 = var33.field2155;
                                                        if (var34.field3173 < 0) {
                                                            break;
                                                        }
                                                        var35 = class103.method639(var34.field3072, true);
                                                    } while (var35 == null || var35.field3067 == null || var34.field3173 >= var35.field3067.length || var35.field3067[var34.field3173] != var34);
                                                    class189.method1265(-3256, var33);
                                                }
                                            }
                                            var31 = var30.field2155;
                                            if (~var31.field3173 > -1) {
                                                break;
                                            }
                                            var32 = class103.method639(var31.field3072, true);
                                        } while (var32 == null || var32.field3067 == null || var32.field3067.length <= var31.field3173 || var32.field3067[var31.field3173] != var31);
                                        class189.method1265(-3256, var30);
                                    }
                                }
                                var28 = var27.field2155;
                                if (~var28.field3173 > -1) {
                                    break;
                                }
                                var29 = class103.method639(var28.field3072, true);
                            } while (var29 == null || var29.field3067 == null || var29.field3067.length <= var28.field3173 || var29.field3067[var28.field3173] != var28);
                            class189.method1265(-3256, var27);
                        }
                    }
                }
            }
        }
    }
}
