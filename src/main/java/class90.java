import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class90 {

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Lsc;")
    public static class128 field2051 = class129.method1017(false, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!n", name = "h", descriptor = "J")
    public static long field2052 = 0L;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Lrc;")
    public static class121 field2048 = new class121();

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field2058 = 0;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "Lsc;")
    public static class128 field2059 = class129.method1017(false, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Lsc;")
    public static class128 field2057 = class129.method1017(false, "Sprites geladen)3");

    @OriginalMember(owner = "client!n", name = "j", descriptor = "Lw;")
    public static class153 field2054 = new class153();

    @OriginalMember(owner = "client!n", name = "q", descriptor = "[I")
    public static int[] field2061 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2060 = new CRC32();

    @OriginalMember(owner = "client!n", name = "s", descriptor = "Lsc;")
    public static class128 field2063 = class129.method1017(false, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!n", name = "u", descriptor = "Lsc;")
    private static class128 field2065 = class129.method1017(false, "flash1:");

    @OriginalMember(owner = "client!n", name = "t", descriptor = "Lsc;")
    public static class128 field2064 = field2065;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "Lsc;")
    public static class128 field2062 = field2065;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "B")
    public static byte field2053;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lwe;")
    public static class158 field2056;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Lmc;")
    public static class86 field2055;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)I")
    public static final int method701(int arg0, int arg1) {
        if (arg0 != -1953860478) {
            return 11;
        }
        field2046++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static final void method702(int arg0) {
        field2049++;
        if (class63.field1359 > 1) {
            class63.field1359--;
        }
        if (class12.field193 > 0) {
            class12.field193--;
        }
        if (class19.field347) {
            class19.field347 = false;
            class44.method316(4550);
            return;
        }
        for (int var1 = 0; var1 < 100 && class125.method954(arg0 - 113); var1++) {
        }
        if (class14.field282 != 30) {
            return;
        }
        class43.method309(956, class152.field3502, 155);
        Object var2 = class73.field1641.field2605;
        synchronized (class73.field1641.field2605) {
            if (!class14.field267) {
                class73.field1641.field2622 = 0;
            } else if (class120.field2726 != 0 || class73.field1641.field2622 >= 40) {
                int var3 = 0;
                class158.field3634++;
                class152.field3502.method507(-105, 232);
                class152.field3502.method653(0, arg0 ^ 0xFFFFFFFD);
                int var4 = class152.field3502.field1924;
                for (int var5 = 0; class73.field1641.field2622 > var5 && class152.field3502.field1924 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class73.field1641.field2615[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var7 = class73.field1641.field2620[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (class73.field1641.field2615[var5] == -1 && class73.field1641.field2620[var5] == -1) {
                        var7 = -1;
                        var8 = 524287;
                        var6 = -1;
                    }
                    if (class105.field2389 != var7 || class21.field391 != var6) {
                        int var9 = var7 - class105.field2389;
                        class105.field2389 = var7;
                        int var10 = var6 - class21.field391;
                        class21.field391 = var6;
                        if (class149.field3431 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class152.field3502.method631((class149.field3431 << 12) + (var9 << 6) + var10, (byte) 103);
                            class149.field3431 = 0;
                        } else if (class149.field3431 < 8) {
                            class152.field3502.method626(var8 + (class149.field3431 << 19) + 8388608, (byte) -117);
                            class149.field3431 = 0;
                        } else {
                            class152.field3502.method649(-35, (class149.field3431 << 19) + (var8 - 1073741824));
                            class149.field3431 = 0;
                        }
                    } else if (class149.field3431 < 2047) {
                        class149.field3431++;
                    }
                }
                class152.field3502.method647(class152.field3502.field1924 - var4, -49);
                if (class73.field1641.field2622 <= var3) {
                    class73.field1641.field2622 = 0;
                } else {
                    class73.field1641.field2622 -= var3;
                    for (int var11 = 0; var11 < class73.field1641.field2622; var11++) {
                        class73.field1641.field2620[var11] = class73.field1641.field2620[var3 + var11];
                        class73.field1641.field2615[var11] = class73.field1641.field2615[var3 + var11];
                    }
                }
            }
        }
        if (class120.field2726 != 0) {
            long var12 = (class121.field2766 - field2052) / 50L;
            field2052 = class121.field2766;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            int var14 = class43.field806;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 764) {
                var14 = 764;
            }
            byte var15 = 0;
            if (class120.field2726 == 2) {
                var15 = 1;
            }
            int var16 = class9.field133;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 502) {
                var16 = 502;
            }
            int var17 = var16 * 765 + var14;
            class152.field3502.method507(-91, 1);
            int var18 = (int) var12;
            class152.field3502.method628((var15 << 19) + (var18 << 20) + var17, false);
            class128.field2919++;
        }
        if (class147.field3407[96] || class147.field3407[97] || class147.field3407[98] || class147.field3407[99]) {
            class68.field1532 = true;
        }
        if (class2.field21 > 0) {
            class2.field21--;
        }
        if (class68.field1532 && class2.field21 <= 0) {
            class68.field1532 = false;
            class69.field1551++;
            class2.field21 = 20;
            class152.field3502.method507(58, 58);
            class152.field3502.method656(class94.field2184, (byte) 33);
            class152.field3502.method673((byte) -79, class82.field1813);
        }
        if (class21.field396 && !class51.field1029) {
            class51.field1029 = true;
            class152.field3502.method507(-123, 188);
            class64.field1411++;
            class152.field3502.method653(1, arg0 ^ 0xFFFFFFFD);
        }
        if (!class21.field396 && class51.field1029) {
            class64.field1411++;
            class51.field1029 = false;
            class152.field3502.method507(arg0 ^ 0xFFFFFF8F, 188);
            class152.field3502.method653(0, 0);
        }
        class132.method1047(arg0 - 38);
        if (class14.field282 != 30) {
            return;
        }
        class113.method866(21155);
        class40.method290((byte) -113);
        class50.field997++;
        if (class50.field997 > 750) {
            class44.method316(4550);
            return;
        }
        class152.method1211(arg0 ^ 0xFFFFFFC2);
        class51.method400(arg0 - 115);
        class9.method68(21);
        if (class127.field2871 != 0) {
            class70.field1580 += 20;
            if (class70.field1580 >= 400) {
                class127.field2871 = 0;
            }
        }
        class155.field3570++;
        if (class36.field699 != null) {
            class157.field3601++;
            if (class157.field3601 >= 15) {
                class89.method696(class36.field699, arg0 + 4);
                class36.field699 = null;
            }
        }
        if (class115.field2603 != null) {
            class89.method696(class115.field2603, arg0 ^ 0xFFFFFFFC);
            class127.field2879++;
            if (class103.field2343 + 5 < class64.field1380 || class64.field1380 < class103.field2343 - 5 || class2.field27 + 5 < class18.field330 || class18.field330 < class2.field27 - 5) {
                class72.field1615 = true;
            }
            if (class147.field3400 == 0) {
                if (class72.field1615 && class127.field2879 >= 5) {
                    if (class116.field2611 == class115.field2603 && class84.field1862 != class159.field3656) {
                        class34.field646++;
                        class54 var19 = class115.field2603;
                        byte var20 = 0;
                        if (class104.field2367 == 1 && var19.field1078 == 206) {
                            var20 = 1;
                        }
                        if (var19.field1144[class159.field3656] <= 0) {
                            var20 = 0;
                        }
                        if (class35.method256(class77.method561(arg0 ^ 0xFFFFFFA9, var19), arg0 ^ 0xFFFFFFFC)) {
                            int var23 = class84.field1862;
                            int var24 = class159.field3656;
                            var19.field1144[var24] = var19.field1144[var23];
                            var19.field1203[var24] = var19.field1203[var23];
                            var19.field1144[var23] = -1;
                            var19.field1203[var23] = 0;
                        } else if (var20 == 1) {
                            int var21 = class84.field1862;
                            int var22 = class159.field3656;
                            while (var21 != var22) {
                                if (var22 < var21) {
                                    var19.method414(var21, -17908, var21 - 1);
                                    var21--;
                                } else if (var21 < var22) {
                                    var19.method414(var21, -17908, var21 + 1);
                                    var21++;
                                }
                            }
                        } else {
                            var19.method414(class84.field1862, arg0 ^ 0x45F1, class159.field3656);
                        }
                        class152.field3502.method507(arg0 - 83, 166);
                        class152.field3502.method649(arg0 ^ 0x2C, class115.field2603.field1117);
                        class152.field3502.method631(class84.field1862, (byte) 115);
                        class152.field3502.method633((byte) -78, var20);
                        class152.field3502.method660(class159.field3656, -18562);
                    }
                } else if ((class49.field912 == 1 || class134.method1089(class7.field103 - 1, false)) && class7.field103 > 2) {
                    class7.method32(127);
                } else if (class7.field103 > 0) {
                    class25.method221(class7.field103 - 1, false);
                }
                class115.field2603 = null;
                class157.field3601 = 10;
                class120.field2726 = 0;
            }
        }
        class29.field561 = null;
        class14.field278 = false;
        class6.field83 = false;
        class54 var25 = class58.field1257;
        class58.field1257 = null;
        class54 var26 = class65.field1434;
        class65.field1434 = null;
        for (class137.field3241 = 0; class23.method207((byte) 102) && class137.field3241 < 128; class137.field3241++) {
            class12.field201[class137.field3241] = class2.field19;
            class123.field2786[class137.field3241] = class30.field565;
        }
        class150.method1196(0, 503, false, 0, 0, 765, 0, class29.field556);
        class135.field3186++;
        while (true) {
            class18 var27;
            class54 var28;
            class54 var29;
            do {
                var27 = (class18) class67.field1505.method928((byte) 110);
                if (var27 == null) {
                    while (true) {
                        class18 var30;
                        class54 var31;
                        class54 var32;
                        do {
                            var30 = (class18) class30.field586.method928((byte) -120);
                            if (var30 == null) {
                                while (true) {
                                    class18 var33;
                                    class54 var34;
                                    class54 var35;
                                    do {
                                        var33 = (class18) class110.field2479.method928((byte) 87);
                                        if (var33 == null) {
                                            if (class43.field814 != null) {
                                                class135.method1092(false);
                                            }
                                            if (class13.field243 != -1) {
                                                int var36 = class13.field243;
                                                int var37 = class13.field213;
                                                boolean var38 = class43.method306(var36, 0, 0, 0, 0, var37, 0, (byte) -91, true, class151.field3473.field989[0], class151.field3473.field962[0], 0);
                                                class13.field243 = -1;
                                                if (var38) {
                                                    class19.field356 = class9.field133;
                                                    class156.field3587 = class43.field806;
                                                    class70.field1580 = 0;
                                                    class127.field2871 = 1;
                                                }
                                            }
                                            if (arg0 != -3) {
                                                field2063 = null;
                                            }
                                            class71.method534((byte) -70);
                                            if (class65.field1434 != var26) {
                                                if (var26 != null) {
                                                    class89.method696(var26, arg0 + 4);
                                                }
                                                if (class65.field1434 != null) {
                                                    class89.method696(class65.field1434, 1);
                                                }
                                            }
                                            if (class58.field1257 != var25 && class29.field558 == class108.field2447) {
                                                if (var25 != null) {
                                                    class89.method696(var25, 1);
                                                }
                                                if (class58.field1257 != null) {
                                                    class89.method696(class58.field1257, 1);
                                                }
                                            }
                                            if (class58.field1257 == null) {
                                                if (class29.field558 > 0) {
                                                    class29.field558--;
                                                }
                                            } else if (class108.field2447 > class29.field558) {
                                                class29.field558++;
                                                if (class29.field558 == class108.field2447) {
                                                    class89.method696(class58.field1257, 1);
                                                }
                                            }
                                            class43.method311(26573);
                                            if (class132.field3053) {
                                                class75.method555((byte) -93);
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class23.field459[var39]++;
                                            }
                                            int var40 = class12.method93(-122);
                                            int var41 = class146.method1179(45);
                                            if (var40 > 4500 && var41 > 4500) {
                                                class126.field2853++;
                                                class12.field193 = 250;
                                                class116.method893(4000, 106);
                                                class152.field3502.method507(arg0 ^ 0x5B, 134);
                                            }
                                            class40.field750++;
                                            class35.field673++;
                                            class159.field3652++;
                                            if (class35.field673 > 500) {
                                                int var42 = (int) (Math.random() * 8.0D);
                                                if ((var42 & 0x1) == 1) {
                                                    class146.field3371 += class54.field1092;
                                                }
                                                if ((var42 & 0x4) == 4) {
                                                    class108.field2457 += class134.field3171;
                                                }
                                                class35.field673 = 0;
                                                if ((var42 & 0x2) == 2) {
                                                    class126.field2857 += class34.field638;
                                                }
                                            }
                                            if (class40.field750 > 500) {
                                                int var43 = (int) (Math.random() * 8.0D);
                                                if ((var43 & 0x2) == 2) {
                                                    class89.field2042 += class125.field2841;
                                                }
                                                if ((var43 & 0x1) == 1) {
                                                    class46.field857 += class77.field1688;
                                                }
                                                class40.field750 = 0;
                                            }
                                            if (class108.field2457 < -40) {
                                                class134.field3171 = 1;
                                            }
                                            if (class146.field3371 < -50) {
                                                class54.field1092 = 2;
                                            }
                                            if (class46.field857 < -60) {
                                                class77.field1688 = 2;
                                            }
                                            if (class46.field857 > 60) {
                                                class77.field1688 = -2;
                                            }
                                            if (class89.field2042 < -20) {
                                                class125.field2841 = 1;
                                            }
                                            if (class89.field2042 > 10) {
                                                class125.field2841 = -1;
                                            }
                                            if (class108.field2457 > 40) {
                                                class134.field3171 = -1;
                                            }
                                            if (class146.field3371 > 50) {
                                                class54.field1092 = -2;
                                            }
                                            if (class126.field2857 < -55) {
                                                class34.field638 = 2;
                                            }
                                            if (class126.field2857 > 55) {
                                                class34.field638 = -2;
                                            }
                                            if (class159.field3652 > 50) {
                                                class72.field1616++;
                                                class152.field3502.method507(arg0 ^ 0x58, 152);
                                            }
                                            try {
                                                if (class63.field1358 != null && class152.field3502.field1924 > 0) {
                                                    class63.field1358.method496(true, class152.field3502.field1920, class152.field3502.field1924, 0);
                                                    class152.field3502.field1924 = 0;
                                                    class159.field3652 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class44.method316(4550);
                                                return;
                                            }
                                        }
                                        var34 = var33.field314;
                                        if (var34.field1162 < 0) {
                                            break;
                                        }
                                        var35 = class46.method338(var34.field1175, 113);
                                    } while (var35 == null || var35.field1100 == null || var34.field1162 >= var35.field1100.length || var35.field1100[var34.field1162] != var34);
                                    class46.method341(var33, -2601);
                                }
                            }
                            var31 = var30.field314;
                            if (var31.field1162 < 0) {
                                break;
                            }
                            var32 = class46.method338(var31.field1175, 95);
                        } while (var32 == null || var32.field1100 == null || var31.field1162 >= var32.field1100.length || var32.field1100[var31.field1162] != var31);
                        class46.method341(var30, -2601);
                    }
                }
                var28 = var27.field314;
                if (var28.field1162 < 0) {
                    break;
                }
                var29 = class46.method338(var28.field1175, arg0 ^ 0x74);
            } while (var29 == null || var29.field1100 == null || var29.field1100.length <= var28.field1162 || var29.field1100[var28.field1162] != var28);
            class46.method341(var27, -2601);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public static void method703(byte arg0) {
        if (arg0 != 35) {
            field2057 = null;
        }
        field2059 = null;
        field2055 = null;
        field2065 = null;
        field2056 = null;
        field2051 = null;
        field2064 = null;
        field2061 = null;
        field2048 = null;
        field2060 = null;
        field2063 = null;
        field2062 = null;
        field2057 = null;
        field2054 = null;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
    public static final void method704(int arg0) {
        if (class63.field1358 != null) {
            class63.field1358.method502((byte) -1);
            class63.field1358 = null;
        }
        field2047++;
        class122.method939(28803);
        class154.field3553.method109();
        int var1 = 0;
        if (arg0 != -20389) {
            method703((byte) 74);
        }
        while (var1 < 4) {
            class104.field2359[var1].method211(128);
            var1++;
        }
        System.gc();
        class124.method944(arg0 + 20606, 2);
        class141.field3305 = -1;
        class67.field1511 = false;
        class7.method36(-62);
        class23.method206(20, 10);
    }
}
