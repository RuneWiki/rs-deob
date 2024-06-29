import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class163 {

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field2527 = 0;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Lih;")
    public static class32 field2533 = new class32();

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "S")
    public static short field2535 = 32767;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Lck;")
    public static class236 field2536 = new class236();

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field2538 = 0;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field2539 = 0;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Lna;")
    public static class26 field2537 = class69.method505("overlay", (byte) -126);

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Lbe;")
    public static class297 field2540 = null;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "[[[B")
    public static byte[][][] field2529;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)I", line = 8)
    public static final int method1110(int arg0, int arg1, int arg2, int arg3) {
        field2534++;
        if (arg2 >= -76) {
            field2535 = -91;
        }
        if ((class92.field1492[arg3][arg1][arg0] & 0x8) == 0) {
            return arg3 <= 0 || (class92.field1492[1][arg1][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([J[Ljava/lang/Object;I)V", line = 35)
    public static final void method1111(long[] arg0, Object[] arg1, int arg2) {
        field2532++;
        int var3 = 38 % ((arg2 - 28) / 52);
        class287.method2024(arg0.length - 1, arg0, 122, 0, arg1);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)V", line = 58)
    public static final void method1112(byte arg0, int arg1) {
        field2526++;
        int var2 = -51 % ((26 - arg0) / 33);
        class120 var3 = class293.method2059(4, 1, arg1);
        var3.method823(true);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lna;I)I", line = 75)
    public static final int method1113(class26 arg0, int arg1) {
        field2531++;
        if (arg1 != -1) {
            method1113((class26) null, 65);
        }
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class321.field5520; var2++) {
            if (arg0.method162(arg1 ^ 0x6B, class267.field4406[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)Z", line = 111)
    public static final boolean method1114(byte arg0) throws IOException {
        field2530++;
        if (class88.field1449 == null) {
            return false;
        }
        int var1 = class88.field1449.method2015(-18358);
        if (var1 == 0) {
            return false;
        }
        if (class26.field384 == -1) {
            var1--;
            class88.field1449.method2011(0, 1, arg0 ^ 0x4844, class300.field5157.field1280);
            class300.field5157.field1301 = 0;
            class26.field384 = class300.field5157.method1432(0);
            class259.field4228 = class196.field3049[class26.field384];
        }
        if (class259.field4228 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class88.field1449.method2011(0, 1, -18455, class300.field5157.field1280);
            var1--;
            class259.field4228 = class300.field5157.field1280[0] & 0xFF;
        }
        if (class259.field4228 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class88.field1449.method2011(0, 2, -18455, class300.field5157.field1280);
            class300.field5157.field1301 = 0;
            class259.field4228 = class300.field5157.method576(1);
        }
        if (class259.field4228 > var1) {
            return false;
        }
        class300.field5157.field1301 = 0;
        class88.field1449.method2011(0, class259.field4228, -18455, class300.field5157.field1280);
        class284.field4757 = class178.field2800;
        class178.field2800 = class56.field907;
        class56.field907 = class26.field384;
        class148.field2311 = 0;
        if (class26.field384 == 60) {
            int var2 = class300.field5157.method597(arg0 + 188);
            byte var3 = class300.field5157.method602((byte) 100);
            class115.method804((byte) 99, var3, var2);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 115) {
            int var4 = class300.field5157.method576(1);
            class26 var5 = class300.field5157.method615(true);
            Object[] var6 = new Object[var5.method171(-92) + 1];
            for (int var7 = var5.method171(arg0 ^ 0x4F) - 1; var7 >= 0; var7--) {
                if (var5.method200(var7, (byte) -45) == 115) {
                    var6[var7 + 1] = class300.field5157.method615(true);
                } else {
                    var6[var7 + 1] = Integer.valueOf(class300.field5157.method587(class282.method1982(arg0, 502942853)));
                }
            }
            var6[0] = Integer.valueOf(class300.field5157.method587(-502942936));
            if (class189.method1290(var4, (byte) -25)) {
                class263 var8 = new class263();
                var8.field4306 = var6;
                class215.method1442(1073376993, var8);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 70) {
            class26 var9 = class300.field5157.method615(true);
            if (var9.method181((byte) -60, class193.field3010)) {
                class26 var45 = var9.method188(var9.method182(class53.field828, 65), 0, 0);
                long var46 = var45.method209(-128);
                boolean var48 = false;
                for (int var49 = 0; var49 < class132.field2014; var49++) {
                    if (class85.field1394[var49] == var46) {
                        var48 = true;
                        break;
                    }
                }
                if (!var48 && class166.field2573 == 0) {
                    class214.method1420(var45, 4, class202.field3139, arg0 + 82);
                }
            } else if (var9.method181((byte) -47, class41.field671)) {
                class26 var39 = var9.method188(var9.method182(class53.field828, 75), 0, 0);
                long var40 = var39.method209(-110);
                boolean var42 = false;
                for (int var43 = 0; var43 < class132.field2014; var43++) {
                    if (class85.field1394[var43] == var40) {
                        var42 = true;
                        break;
                    }
                }
                if (!var42 && class166.field2573 == 0) {
                    class26 var44 = var9.method188(var9.method171(arg0 - 16) - 9, arg0 ^ 0xFFFFFFAD, var9.method182(class53.field828, 101) + 1);
                    class214.method1420(var39, 8, var44, arg0 ^ 0x52);
                }
            } else if (var9.method181((byte) -98, class201.field3130)) {
                boolean var10 = false;
                class26 var11 = var9.method188(var9.method182(class53.field828, 96), 0, 0);
                long var12 = var11.method209(-109);
                for (int var14 = 0; var14 < class132.field2014; var14++) {
                    if (class85.field1394[var14] == var12) {
                        var10 = true;
                        break;
                    }
                }
                if (!var10 && class166.field2573 == 0) {
                    class214.method1420(var11, 10, class2.field18, -1);
                }
            } else if (var9.method181((byte) -128, class210.field3261)) {
                class26 var15 = var9.method188(var9.method182(class210.field3261, arg0 ^ 0xFFFFFFCE), 0, 0);
                class214.method1420(class2.field18, 11, var15, -1);
            } else if (var9.method181((byte) -29, class324.field5592)) {
                class26 var38 = var9.method188(var9.method182(class324.field5592, 102), 0, 0);
                if (class166.field2573 == 0) {
                    class214.method1420(class2.field18, 12, var38, -1);
                }
            } else if (var9.method181((byte) -80, class207.field3219)) {
                class26 var16 = var9.method188(var9.method182(class207.field3219, 121), 0, 0);
                if (class166.field2573 == 0) {
                    class214.method1420(class2.field18, 13, var16, -1);
                }
            } else if (var9.method181((byte) -42, class322.field5532)) {
                boolean var33 = false;
                class26 var34 = var9.method188(var9.method182(class53.field828, 115), 0, 0);
                long var35 = var34.method209(-118);
                for (int var37 = 0; var37 < class132.field2014; var37++) {
                    if (class85.field1394[var37] == var35) {
                        var33 = true;
                        break;
                    }
                }
                if (!var33 && class166.field2573 == 0) {
                    class214.method1420(var34, 14, class2.field18, -1);
                }
            } else if (var9.method181((byte) -41, class83.field1349)) {
                class26 var28 = var9.method188(var9.method182(class53.field828, 118), 0, 0);
                boolean var29 = false;
                long var30 = var28.method209(-120);
                for (int var32 = 0; var32 < class132.field2014; var32++) {
                    if (class85.field1394[var32] == var30) {
                        var29 = true;
                        break;
                    }
                }
                if (!var29 && class166.field2573 == 0) {
                    class214.method1420(var28, 15, class2.field18, -1);
                }
            } else if (var9.method181((byte) -110, class18.field264)) {
                class26 var17 = var9.method188(var9.method182(class53.field828, arg0 + 138), 0, 0);
                long var18 = var17.method209(arg0 - 23);
                boolean var20 = false;
                for (int var21 = 0; var21 < class132.field2014; var21++) {
                    if (class85.field1394[var21] == var18) {
                        var20 = true;
                        break;
                    }
                }
                if (!var20 && class166.field2573 == 0) {
                    class214.method1420(var17, 16, class2.field18, -1);
                }
            } else if (var9.method181((byte) -41, class26.field427)) {
                class26 var22 = var9.method188(var9.method182(class53.field828, arg0 + 189), arg0 + 83, 0);
                boolean var23 = false;
                long var24 = var22.method209(-122);
                for (int var26 = 0; var26 < class132.field2014; var26++) {
                    if (class85.field1394[var26] == var24) {
                        var23 = true;
                        break;
                    }
                }
                if (!var23 && class166.field2573 == 0) {
                    class26 var27 = var9.method188(var9.method171(-32) - 9, arg0 ^ 0xFFFFFFAD, var9.method182(class53.field828, 92) + 1);
                    class214.method1420(var22, 21, var27, -1);
                }
            } else {
                class214.method1420(class2.field18, 0, var9, arg0 + 82);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 123) {
            int var369 = class300.field5157.method605(-69);
            int var370 = class300.field5157.method597(-126);
            class26 var371 = class300.field5157.method615(true);
            if (class189.method1290(var370, (byte) -25)) {
                class309.method2158(var371, (byte) 40, var369);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 230) {
            class204.field3190 = class300.field5157.method590((byte) -88);
            class64.field1023 = class300.field5157.method593(true);
            while (class259.field4228 > class300.field5157.field1301) {
                class26.field384 = class300.field5157.method642((byte) -60);
                class160.method1091((byte) -82);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 153) {
            class26.field384 = -1;
            class64.field1020 = 0;
            return true;
        } else if (class26.field384 == 220) {
            int var366 = class300.field5157.method637((byte) -59);
            int var367 = class300.field5157.method605(-75);
            int var368 = class300.field5157.method576(arg0 + 84);
            if (class189.method1290(var368, (byte) -25)) {
                class315.method2188(var367, var366, (byte) 68);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 81) {
            long var50 = class300.field5157.method595(-120);
            class300.field5157.method599(false);
            long var52 = class300.field5157.method595(arg0 ^ 0x36);
            long var54 = (long) class300.field5157.method576(1);
            long var56 = (long) class300.field5157.method633((byte) 104);
            int var58 = class300.field5157.method642((byte) -80);
            boolean var59 = false;
            int var60 = class300.field5157.method576(arg0 ^ 0xFFFFFFAC);
            long var61 = (var54 << 32) + var56;
            int var63 = 0;
            label1275: while (true) {
                if (var63 < 100) {
                    if (class252.field4139[var63] != var61) {
                        var63++;
                        continue;
                    }
                    var59 = true;
                    break;
                }
                if (var58 <= 1) {
                    for (int var64 = 0; var64 < class132.field2014; var64++) {
                        if (class85.field1394[var64] == var50) {
                            var59 = true;
                            break label1275;
                        }
                    }
                }
                break;
            }
            if (!var59 && class166.field2573 == 0) {
                class252.field4139[class305.field5253] = var61;
                class305.field5253 = (class305.field5253 + 1) % 100;
                class26 var65 = class56.method410(12345678, var60).method1977(28021, class300.field5157);
                if (var58 == 2 || var58 == 3) {
                    class250.method1718(var60, 20, var65, class153.method1042(arg0 - 29581, var52).method176((byte) -50), (byte) 50, class236.method1587(new class26[] { class168.field2604, class153.method1042(-29664, var50).method176((byte) -50) }, (byte) -124));
                } else if (var58 == 1) {
                    class250.method1718(var60, 20, var65, class153.method1042(-29664, var52).method176((byte) -50), (byte) 50, class236.method1587(new class26[] { class223.field3529, class153.method1042(arg0 - 29581, var50).method176((byte) -50) }, (byte) -109));
                } else {
                    class250.method1718(var60, 20, var65, class153.method1042(arg0 - 29581, var52).method176((byte) -50), (byte) 50, class153.method1042(-29664, var50).method176((byte) -50));
                }
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 55) {
            class216.field3392 = class74.field1144;
            long var354 = class300.field5157.method595(-110);
            if (var354 == 0L) {
                class154.field2411 = null;
                class26.field384 = -1;
                class297.field5057 = null;
                class4.field49 = null;
                class96.field1567 = 0;
                return true;
            }
            long var356 = class300.field5157.method595(-126);
            class297.field5057 = class153.method1042(-29664, var356);
            class154.field2411 = class153.method1042(arg0 - 29581, var354);
            class159.field2474 = class300.field5157.method599(false);
            int var358 = class300.field5157.method642((byte) -86);
            if (var358 == 255) {
                class26.field384 = -1;
                return true;
            }
            class96.field1567 = var358;
            class131[] var359 = new class131[100];
            for (int var360 = 0; var360 < class96.field1567; var360++) {
                var359[var360] = new class131();
                var359[var360].field2293 = class300.field5157.method595(arg0 + 4);
                var359[var360].field1992 = class153.method1042(arg0 - 29581, var359[var360].field2293);
                var359[var360].field1996 = class300.field5157.method576(1);
                var359[var360].field1988 = class300.field5157.method599(false);
                var359[var360].field1989 = class300.field5157.method615(true);
                if (class20.field283 == var359[var360].field2293) {
                    class228.field3613 = var359[var360].field1988;
                }
            }
            boolean var361 = false;
            int var362 = class96.field1567;
            while (var362 > 0) {
                boolean var363 = true;
                var362--;
                for (int var364 = 0; var364 < var362; var364++) {
                    if (var359[var364].field1992.method190(var359[var364 + 1].field1992, arg0 ^ 0x52) > 0) {
                        var363 = false;
                        class131 var365 = var359[var364];
                        var359[var364] = var359[var364 + 1];
                        var359[var364 + 1] = var365;
                    }
                }
                if (var363) {
                    break;
                }
            }
            class4.field49 = var359;
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 164) {
            int var353 = class300.field5157.method619(-1);
            class157.field2455 = class45.field712.method1062(arg0 ^ 0xFFFFFFAE, var353);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 225) {
            class59.method425((byte) -122);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 48) {
            int var66 = class300.field5157.method576(1);
            class26 var67 = class300.field5157.method615(true);
            int var68 = class300.field5157.method620((byte) -115);
            if (class189.method1290(var66, (byte) -25)) {
                class309.method2158(var67, (byte) 40, var68);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 232) {
            class158.field2463 = class300.field5157.method642((byte) -72);
            class284.field4753 = class300.field5157.method642((byte) -128);
            class7.field85 = class300.field5157.method642((byte) -57);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 44) {
            int var349 = class300.field5157.method620((byte) -88);
            if (var349 == 65535) {
                var349 = -1;
            }
            int var350 = class300.field5157.method642((byte) -68);
            int var351 = class300.field5157.method642((byte) -122);
            class26 var352 = class300.field5157.method615(true);
            if (var351 >= 1 && var351 <= 8) {
                if (var352.method162(-121, class121.field1895)) {
                    var352 = null;
                }
                class228.field3596[var351 - 1] = var352;
                class201.field3127[var351 - 1] = var349;
                class273.field4570[var351 - 1] = var350 == 0;
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 226) {
            int var347 = class300.field5157.method587(-502942936);
            int var348 = class300.field5157.method597(-112);
            class115.method804((byte) 99, var347, var348);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 21) {
            int var344 = class300.field5157.method625(true);
            int var345 = class300.field5157.method576(1);
            int var346 = class300.field5157.method621(arg0 ^ 0x13);
            if (class189.method1290(var345, (byte) -25)) {
                class181.method1249(-16207, var346, var344);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 145) {
            int var69 = class300.field5157.method620((byte) -110);
            int var70 = class300.field5157.method590((byte) -101);
            int var71 = class300.field5157.method620((byte) -120);
            if (class189.method1290(var71, (byte) -25)) {
                if (var70 == 2) {
                    class178.method1229((byte) -86);
                }
                class250.field4095 = var69;
                class72.method516(var69, 16182);
                class220.method1480(false, (byte) -64);
                class31.method248(class250.field4095, 69);
                for (int var72 = 0; var72 < 100; var72++) {
                    class2.field21[var72] = true;
                }
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 69) {
            int var341 = class300.field5157.method620((byte) -113);
            int var342 = class300.field5157.method587(-502942936);
            int var343 = class300.field5157.method597(-107);
            if (class189.method1290(var341, (byte) -25)) {
                class113.method787(var343, var342, 1);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 141) {
            long var337 = class300.field5157.method595(-125);
            int var339 = class300.field5157.method576(1);
            class26 var340 = class56.method410(arg0 + 12345761, var339).method1977(28021, class300.field5157);
            class250.method1718(var339, 19, var340, (class26) null, (byte) 50, class153.method1042(-29664, var337).method176((byte) -50));
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 169) {
            class104.method747(class300.field5157, arg0 ^ 0xFFFFFFD5);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 89) {
            class1.method7(-117);
            class214.method1434(false);
            class260.field4258 += 32;
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 125) {
            int var73 = class300.field5157.method576(1);
            int var74 = class300.field5157.method642((byte) -37);
            int var75 = class300.field5157.method642((byte) -114);
            int var76 = class300.field5157.method576(1);
            int var77 = class300.field5157.method642((byte) -59);
            int var78 = class300.field5157.method642((byte) -96);
            if (class189.method1290(var73, (byte) -25)) {
                class134.method906(var76, var75, var77, var74, (byte) -21, var78);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 36) {
            int var334 = class300.field5157.method637((byte) 122);
            int var335 = class300.field5157.method630((byte) 10);
            int var336 = class300.field5157.method597(114);
            if (class189.method1290(var336, (byte) -25)) {
                class12.method77(var334, var335, arg0 + 178);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 9) {
            int var79 = class300.field5157.method620((byte) -97);
            int var80 = class300.field5157.method621(-101);
            int var81 = class300.field5157.method597(-105);
            int var82 = class300.field5157.method605(arg0 ^ 0x17);
            if (var82 == 65535) {
                var82 = -1;
            }
            int var83 = class300.field5157.method597(127);
            if (var83 == 65535) {
                var83 = -1;
            }
            if (class189.method1290(var81, (byte) -25)) {
                for (int var84 = var83; var84 <= var82; var84++) {
                    long var85 = ((long) var80 << 32) + (long) var84;
                    class327 var87 = (class327) class220.field3506.method1827(var85, 0);
                    class327 var88;
                    if (var87 != null) {
                        var88 = new class327(var87.field5661, var79);
                        var87.method1006(-1024);
                    } else if (var84 == -1) {
                        var88 = new class327(class178.method1226((byte) 119, var80).field5063.field5661, var79);
                    } else {
                        var88 = new class327(0, var79);
                    }
                    class220.field3506.method1826(1, var88, var85);
                }
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 56) {
            int var89 = class300.field5157.method576(1);
            int var90 = class300.field5157.method605(arg0 - 8);
            int var91 = class300.field5157.method619(-1);
            int var92 = class300.field5157.method620((byte) -119);
            if ((var91 >> 30) != 0) {
                int var103 = var91 >> 28 & 0x3;
                int var104 = ((var91 & 0xFFFFB65) >> 14) - class12.field157;
                int var105 = (var91 & 0x3FFF) - class165.field2568;
                if (var104 >= 0 && var105 >= 0 && var104 < 104 && var105 < 104) {
                    int var106 = var105 * 128 + 64;
                    int var107 = var104 * 128 + 64;
                    class272 var108 = new class272(var92, var103, var107, var106, class17.method118(var103, 1, var107, var106) - var90, var89, class229.field3626);
                    class303.field5219.method257(true, new class63(var108));
                }
            } else if (var91 >> 29 != 0) {
                int var93 = var91 & 0xFFFF;
                class324 var94 = class185.field2877[var93];
                if (var94 != null) {
                    if (var92 == 65535) {
                        var92 = -1;
                    }
                    boolean var95 = true;
                    if (var92 != -1 && var94.field3986 != -1 && client.method1731(class236.method1582((byte) 42, var92).field5168, (byte) -20).field4060 < client.method1731(class236.method1582((byte) 42, var94.field3986).field5168, (byte) -20).field4060) {
                        var95 = false;
                    }
                    if (var95) {
                        var94.field3896 = 0;
                        var94.field3986 = var92;
                        var94.field3894 = class229.field3626 + var89;
                        var94.field3945 = 0;
                        if (var94.field3894 > class229.field3626) {
                            var94.field3945 = -1;
                        }
                        var94.field3939 = var90;
                        var94.field3969 = 1;
                        if (var94.field3986 != -1 && class229.field3626 == var94.field3894) {
                            int var96 = class236.method1582((byte) 42, var94.field3986).field5168;
                            if (var96 != -1) {
                                class249 var97 = client.method1731(var96, (byte) -20);
                                if (var97 != null && var97.field4051 != null) {
                                    class285.method2020(var94.field3972, var97, 183921384, var94.field3962, false, 0);
                                }
                            }
                        }
                    }
                }
            } else if ((var91 >> 28) != 0) {
                int var98 = var91 & 0xFFFF;
                class159 var99;
                if (class327.field5668 == var98) {
                    var99 = class13.field221;
                } else {
                    var99 = class268.field4427[var98];
                }
                if (var99 != null) {
                    if (var92 == 65535) {
                        var92 = -1;
                    }
                    boolean var100 = true;
                    if (var92 != -1 && var99.field3986 != -1 && client.method1731(class236.method1582((byte) 42, var92).field5168, (byte) -20).field4060 < client.method1731(class236.method1582((byte) 42, var99.field3986).field5168, (byte) -20).field4060) {
                        var100 = false;
                    }
                    if (var100) {
                        var99.field3894 = class229.field3626 + var89;
                        var99.field3939 = var90;
                        var99.field3986 = var92;
                        if (var99.field3986 == 65535) {
                            var99.field3986 = -1;
                        }
                        var99.field3969 = 1;
                        var99.field3896 = 0;
                        var99.field3945 = 0;
                        if (var99.field3894 > class229.field3626) {
                            var99.field3945 = -1;
                        }
                        if (var99.field3986 != -1 && class229.field3626 == var99.field3894) {
                            int var101 = class236.method1582((byte) 42, var99.field3986).field5168;
                            if (var101 != -1) {
                                class249 var102 = client.method1731(var101, (byte) -20);
                                if (var102 != null && var102.field4051 != null) {
                                    class285.method2020(var99.field3972, var102, 183921384, var99.field3962, class13.field221 == var99, 0);
                                }
                            }
                        }
                    }
                }
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 207) {
            int var330 = class300.field5157.method637((byte) -87);
            int var331 = class300.field5157.method597(arg0 + 92);
            int var332 = class300.field5157.method576(arg0 ^ 0xFFFFFFAC);
            int var333 = class300.field5157.method597(-113);
            if (class189.method1290(var331, (byte) -25)) {
                class85.method663((var332 << 16) + var333, var330, arg0 ^ 0x9AA);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 38) {
            class214.method1434(false);
            int var109 = class300.field5157.method590((byte) -111);
            int var110 = class300.field5157.method619(-1);
            int var111 = class300.field5157.method642((byte) -92);
            class37.field601[var111] = var110;
            class303.field5228[var111] = var109;
            class210.field3258[var111] = 1;
            for (int var112 = 0; var112 < 98; var112++) {
                if (class217.field3436[var112] <= var110) {
                    class210.field3258[var111] = var112 + 2;
                }
            }
            class280.field4671[class4.method23(31, class302.field5208++)] = var111;
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 104 || class26.field384 == 121 || class26.field384 == 97 || class26.field384 == 14 || class26.field384 == 202 || class26.field384 == 135 || class26.field384 == 17 || class26.field384 == 16 || class26.field384 == 240 || class26.field384 == 33 || class26.field384 == 20 || class26.field384 == 195 || class26.field384 == 179) {
            class160.method1091((byte) -99);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 149) {
            int var113 = class300.field5157.method576(1);
            int var114 = class300.field5157.method587(arg0 - 502942853);
            if (class189.method1290(var113, (byte) -25)) {
                class174 var115 = (class174) class74.field1132.method1827((long) var114, 0);
                if (var115 != null) {
                    class113.method786(true, var115, false);
                }
                if (class142.field2165 != null) {
                    class318.method2209(115, class142.field2165);
                    class142.field2165 = null;
                }
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 187) {
            int var327 = class300.field5157.method605(-107);
            int var328 = class300.field5157.method576(1);
            int var329 = class300.field5157.method576(1);
            if (class189.method1290(var328, (byte) -25)) {
                class300.field5156 = var327;
                class224.field3534 = var329;
                if (class37.field614 == 2) {
                    class312.field5335 = class224.field3534;
                    class230.field3660 = class300.field5156;
                }
                class5.method34((byte) -117);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 132) {
            int var322 = class300.field5157.method576(1);
            int var323 = class300.field5157.method597(31);
            int var324 = class300.field5157.method620((byte) -117);
            int var325 = class300.field5157.method620((byte) -90);
            int var326 = class300.field5157.method587(arg0 - 502942853);
            if (class189.method1290(var323, (byte) -25)) {
                class266.method1899((byte) -124, var324, var326, var325, var322);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 112) {
            class64.field1023 = class300.field5157.method642((byte) -126);
            class204.field3190 = class300.field5157.method625(true);
            for (int var116 = class64.field1023; var116 < class64.field1023 + 8; var116++) {
                for (int var117 = class204.field3190; var117 < (class204.field3190 + 8); var117++) {
                    if (class268.field4433[class279.field4651][var116][var117] != null) {
                        class268.field4433[class279.field4651][var116][var117] = null;
                        class244.method1683(var117, (byte) 65, var116);
                    }
                }
            }
            for (class69 var118 = (class69) class98.field1595.method264(-81); var118 != null; var118 = (class69) class98.field1595.method263(arg0 + 87)) {
                if (var118.field1082 >= class64.field1023 && class64.field1023 + 8 > var118.field1082 && var118.field1066 >= class204.field3190 && var118.field1066 < (class204.field3190 + 8) && class279.field4651 == var118.field1068) {
                    var118.field1077 = 0;
                }
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 144) {
            int var119 = class300.field5157.method637((byte) 72);
            class297 var120 = class178.method1226((byte) 111, var119);
            for (int var121 = 0; var121 < var120.field5060.length; var121++) {
                var120.field5060[var121] = -1;
                var120.field5060[var121] = 0;
            }
            class318.method2209(123, var120);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 130) {
            int var319 = class300.field5157.method621(-104);
            int var320 = class300.field5157.method620((byte) -125);
            int var321 = class300.field5157.method597(arg0 ^ 0xFFFFFFFE);
            if (var321 == 65535) {
                var321 = -1;
            }
            if (class189.method1290(var320, (byte) -25)) {
                class113.method788(-1, 1, var319, (byte) -109, var321);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 192) {
            class154.field2402 = class300.field5157.method642((byte) -59);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 13) {
            int var316 = class300.field5157.method593(true);
            int var317 = class300.field5157.method590((byte) 108);
            int var318 = class300.field5157.method642((byte) -41);
            class279.field4651 = var317 >> 1;
            class13.field221.method1084((byte) 126, var316, (var317 & 0x1) == 1, var318);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 62) {
            long var122 = class300.field5157.method595(-127);
            int var124 = class300.field5157.method576(1);
            int var125 = class300.field5157.method642((byte) -99);
            boolean var126 = true;
            if (var122 < 0L) {
                var122 &= Long.MAX_VALUE;
                var126 = false;
            }
            class26 var127 = class2.field18;
            if (var124 > 0) {
                var127 = class300.field5157.method615(true);
            }
            class26 var128 = class153.method1042(-29664, var122).method176((byte) -50);
            for (int var129 = 0; var129 < class321.field5520; var129++) {
                if (class121.field1890[var129] == var122) {
                    if (class208.field3226[var129] != var124) {
                        class208.field3226[var129] = var124;
                        if (var124 > 0) {
                            class214.method1420(class2.field18, 5, class236.method1587(new class26[] { var128, class304.field5238 }, (byte) -77), -1);
                        }
                        if (var124 == 0) {
                            class214.method1420(class2.field18, 5, class236.method1587(new class26[] { var128, class121.field1886 }, (byte) -97), -1);
                        }
                    }
                    class96.field1560[var129] = var127;
                    class117.field1842[var129] = var125;
                    var128 = null;
                    class147.field2295[var129] = var126;
                    break;
                }
            }
            boolean var130 = false;
            if (var128 != null && class321.field5520 < 200) {
                class121.field1890[class321.field5520] = var122;
                class267.field4406[class321.field5520] = var128;
                class208.field3226[class321.field5520] = var124;
                class96.field1560[class321.field5520] = var127;
                class117.field1842[class321.field5520] = var125;
                class147.field2295[class321.field5520] = var126;
                class321.field5520++;
            }
            class100.field1611 = class74.field1144;
            int var131 = class321.field5520;
            while (var131 > 0) {
                var131--;
                boolean var132 = true;
                for (int var133 = 0; var133 < var131; var133++) {
                    if (class208.field3226[var133] != class263.field4309 && class208.field3226[var133 + 1] == class263.field4309 || class208.field3226[var133] == 0 && class208.field3226[var133 + 1] != 0) {
                        var132 = false;
                        int var134 = class208.field3226[var133];
                        class208.field3226[var133] = class208.field3226[var133 + 1];
                        class208.field3226[var133 + 1] = var134;
                        class26 var135 = class96.field1560[var133];
                        class96.field1560[var133] = class96.field1560[var133 + 1];
                        class96.field1560[var133 + 1] = var135;
                        class26 var136 = class267.field4406[var133];
                        class267.field4406[var133] = class267.field4406[var133 + 1];
                        class267.field4406[var133 + 1] = var136;
                        long var137 = class121.field1890[var133];
                        class121.field1890[var133] = class121.field1890[var133 + 1];
                        class121.field1890[var133 + 1] = var137;
                        int var139 = class117.field1842[var133];
                        class117.field1842[var133] = class117.field1842[var133 + 1];
                        class117.field1842[var133 + 1] = var139;
                        boolean var140 = class147.field2295[var133];
                        class147.field2295[var133] = class147.field2295[var133 + 1];
                        class147.field2295[var133 + 1] = var140;
                    }
                }
                if (var132) {
                    break;
                }
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 160) {
            if (class259.field4228 == 0) {
                class112.field1771 = class95.field1554;
            } else {
                class112.field1771 = class300.field5157.method615(true);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 128) {
            for (int var315 = 0; var315 < class205.field3201.length; var315++) {
                if (class205.field3201[var315] != class117.field1835[var315]) {
                    class205.field3201[var315] = class117.field1835[var315];
                    class191.method1299(98, var315);
                    class229.field3639[class4.method23(class260.field4258++, 31)] = var315;
                }
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 154) {
            int var141 = class300.field5157.method576(arg0 ^ 0xFFFFFFAC);
            int var142 = class300.field5157.method642((byte) -56);
            int var143 = class300.field5157.method642((byte) -23);
            int var144 = class300.field5157.method576(1);
            int var145 = class300.field5157.method642((byte) -123);
            int var146 = class300.field5157.method642((byte) -92);
            if (class189.method1290(var141, (byte) -25)) {
                class210.method1409(true, var145, var144, var146, (byte) -124, var143, var142);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 247) {
            long var147 = class300.field5157.method595(-115);
            long var149 = (long) class300.field5157.method576(1);
            long var151 = (long) class300.field5157.method633((byte) 77);
            int var153 = class300.field5157.method642((byte) -28);
            int var154 = class300.field5157.method576(1);
            boolean var155 = false;
            long var156 = (var149 << 32) + var151;
            int var158 = 0;
            label1357: while (true) {
                if (var158 < 100) {
                    if (class252.field4139[var158] != var156) {
                        var158++;
                        continue;
                    }
                    var155 = true;
                    break;
                }
                if (var153 <= 1) {
                    for (int var159 = 0; var159 < class132.field2014; var159++) {
                        if (class85.field1394[var159] == var147) {
                            var155 = true;
                            break label1357;
                        }
                    }
                }
                break;
            }
            if (!var155 && class166.field2573 == 0) {
                class252.field4139[class305.field5253] = var156;
                class305.field5253 = (class305.field5253 + 1) % 100;
                class26 var160 = class56.method410(12345678, var154).method1977(28021, class300.field5157);
                if (var153 == 2) {
                    class250.method1718(var154, 18, var160, (class26) null, (byte) 50, class236.method1587(new class26[] { class168.field2604, class153.method1042(-29664, var147).method176((byte) -50) }, (byte) -105));
                } else if (var153 == 1) {
                    class250.method1718(var154, 18, var160, (class26) null, (byte) 50, class236.method1587(new class26[] { class223.field3529, class153.method1042(-29664, var147).method176((byte) -50) }, (byte) -113));
                } else {
                    class250.method1718(var154, 18, var160, (class26) null, (byte) 50, class153.method1042(arg0 - 29581, var147).method176((byte) -50));
                }
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 176) {
            int var308 = class300.field5157.method619(arg0 ^ 0x52);
            int var309 = class300.field5157.method597(19);
            int var310 = class300.field5157.method619(-1);
            if (class189.method1290(var309, (byte) -25)) {
                class174 var311 = (class174) class74.field1132.method1827((long) var308, arg0 ^ 0xFFFFFFAD);
                class174 var312 = (class174) class74.field1132.method1827((long) var310, 0);
                if (var312 != null) {
                    class113.method786(var311 == null || var311.field2721 != var312.field2721, var312, false);
                }
                if (var311 != null) {
                    var311.method1006(-1024);
                    class74.field1132.method1826(1, var311, (long) var310);
                }
                class297 var313 = class178.method1226((byte) 113, var308);
                if (var313 != null) {
                    class318.method2209(arg0 + 57, var313);
                }
                class297 var314 = class178.method1226((byte) 114, var310);
                if (var314 != null) {
                    class318.method2209(119, var314);
                    class203.method1368(var314, true, 48);
                }
                if (class250.field4095 != -1) {
                    class294.method2063(28, 1, class250.field4095);
                }
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 27) {
            int var302 = class300.field5157.method576(arg0 + 84);
            int var303 = class300.field5157.method642((byte) -104);
            int var304 = class300.field5157.method642((byte) -128);
            int var305 = class300.field5157.method642((byte) -102);
            int var306 = class300.field5157.method642((byte) -81);
            int var307 = class300.field5157.method576(1);
            if (class189.method1290(var302, (byte) -25)) {
                class290.field4825[var303] = true;
                class110.field1748[var303] = var304;
                class10.field134[var303] = var305;
                class240.field3882[var303] = var306;
                class139.field2124[var303] = var307;
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 2) {
            int var299 = class300.field5157.method619(-1);
            int var300 = class300.field5157.method597(-114);
            int var301 = class300.field5157.method620((byte) -119);
            if (class189.method1290(var300, (byte) -25)) {
                class232.method1559(var301, var299, (byte) -127);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 85) {
            class11.field155 = class300.field5157.method576(1) * 30;
            class26.field384 = -1;
            class319.field5463 = class74.field1144;
            return true;
        } else if (class26.field384 == 114) {
            class240.method1649(class45.field712, class300.field5157, class259.field4228, (byte) -126);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 65) {
            int var161 = class300.field5157.method605(arg0 ^ 0xD);
            int var162 = class300.field5157.method625(true);
            int var163 = class300.field5157.method620((byte) -100);
            if (class189.method1290(var161, (byte) -25)) {
                class113.method787(var163, var162, arg0 ^ 0xFFFFFFAC);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 234) {
            class214.method1434(false);
            class92.field1516 = class300.field5157.method642((byte) -104);
            class319.field5463 = class74.field1144;
            class26.field384 = -1;
            return true;
        } else if (arg0 != -83) {
            return false;
        } else if (class26.field384 == 209) {
            if (class250.field4095 != -1) {
                class294.method2063(48, 0, class250.field4095);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 191) {
            int var298 = class300.field5157.method605(-59);
            class118.method820(var298, arg0 ^ 0x6E19);
            class281.field4672[class4.method23(31, class212.field3279++)] = class4.method23(var298, 32767);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 102) {
            int var294 = class300.field5157.method605(-116);
            int var295 = class300.field5157.method593(true);
            int var296 = class300.field5157.method576(arg0 ^ 0xFFFFFFAC);
            class324 var297 = class185.field2877[var294];
            if (var297 != null) {
                class259.method1819(var295, var296, 39, var297);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 159) {
            class214.method1434(false);
            class305.field5263 = class300.field5157.method626((byte) 59);
            class319.field5463 = class74.field1144;
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 71) {
            long var164 = class300.field5157.method595(arg0 ^ 0x1C);
            class26 var166 = class175.method1203(class223.method1487(class300.field5157, arg0 ^ 0xFFFF8C9D).method167(121));
            class214.method1420(class153.method1042(-29664, var164).method176((byte) -50), 6, var166, arg0 ^ 0x52);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 42) {
            if (class198.field3075 != null) {
                class86.method670(false, class96.field1574, -8914, -1, -1);
            }
            byte[] var292 = new byte[class259.field4228];
            class300.field5157.method1426((byte) 30, 0, var292, class259.field4228);
            class26 var293 = class320.method2222(var292, -4114, class259.field4228, 0);
            if (class142.field2172 == null && class156.field2427 == 3 || !class156.field2436.startsWith("win") || class25.field371) {
                class67.method497(var293, (byte) 127, true);
            } else {
                class185.field2881 = var293;
                class26.field421 = true;
                class316.field5417 = class45.field712.method1049(new String(var293.method199(0), "ISO-8859-1"), true);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 111) {
            int var167 = class300.field5157.method597(-123);
            int var168 = class300.field5157.method637((byte) -45);
            int var169 = class300.field5157.method620((byte) -109);
            int var170 = class300.field5157.method605(arg0 + 19);
            int var171 = class300.field5157.method620((byte) -107);
            if (class189.method1290(var167, (byte) -25)) {
                class113.method788(var169, 7, var168, (byte) -126, var170 << 16 | var171);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 37) {
            int var172 = class300.field5157.method590((byte) 122);
            int var173 = class300.field5157.method605(-124);
            class81.method575((byte) -122, var172, var173);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 155) {
            int var174 = class300.field5157.method642((byte) -66);
            int var175 = class300.field5157.method637((byte) -51);
            int var176 = class300.field5157.method597(arg0 + 163);
            int var177 = class300.field5157.method576(1);
            if (class189.method1290(var176, (byte) -25)) {
                class174 var178 = (class174) class74.field1132.method1827((long) var175, 0);
                if (var178 != null) {
                    class113.method786(var178.field2721 != var177, var178, false);
                }
                class168.method1137(6422, var177, var175, var174);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 131) {
            for (int var290 = 0; var290 < class268.field4427.length; var290++) {
                if (class268.field4427[var290] != null) {
                    class268.field4427[var290].field3908 = -1;
                }
            }
            for (int var291 = 0; var291 < class185.field2877.length; var291++) {
                if (class185.field2877[var291] != null) {
                    class185.field2877[var291].field3908 = -1;
                }
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 217) {
            int var179 = class300.field5157.method642((byte) -30);
            class145 var180 = new class145();
            int var181 = var179 >> 6;
            var180.field2213 = var179 & 0x3F;
            var180.field2203 = class300.field5157.method642((byte) -49);
            if (var180.field2203 >= 0 && var180.field2203 < class10.field133.length) {
                if (var180.field2213 == 1 || var180.field2213 == 10) {
                    var180.field2212 = class300.field5157.method576(arg0 ^ 0xFFFFFFAC);
                    class300.field5157.field1301 += 3;
                } else if (var180.field2213 >= 2 && var180.field2213 <= 6) {
                    if (var180.field2213 == 2) {
                        var180.field2198 = 64;
                        var180.field2202 = 64;
                    }
                    if (var180.field2213 == 3) {
                        var180.field2198 = 0;
                        var180.field2202 = 64;
                    }
                    if (var180.field2213 == 4) {
                        var180.field2198 = 128;
                        var180.field2202 = 64;
                    }
                    if (var180.field2213 == 5) {
                        var180.field2198 = 64;
                        var180.field2202 = 0;
                    }
                    if (var180.field2213 == 6) {
                        var180.field2198 = 64;
                        var180.field2202 = 128;
                    }
                    var180.field2213 = 2;
                    var180.field2208 = class300.field5157.method576(arg0 + 84);
                    var180.field2199 = class300.field5157.method576(1);
                    var180.field2205 = class300.field5157.method642((byte) -32);
                }
                var180.field2207 = class300.field5157.method576(1);
                if (var180.field2207 == 65535) {
                    var180.field2207 = -1;
                }
                class122.field1901[var181] = var180;
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 126) {
            class132.field2014 = class259.field4228 / 8;
            for (int var182 = 0; var182 < class132.field2014; var182++) {
                class85.field1394[var182] = class300.field5157.method595(-120);
                class309.field5316[var182] = class153.method1042(-29664, class85.field1394[var182]);
            }
            class100.field1611 = class74.field1144;
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 32) {
            class292.method2054(8169);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 119) {
            int var183 = class300.field5157.method597(-125);
            int var184 = class300.field5157.method621(-48);
            int var185 = class300.field5157.method626((byte) 74);
            int var186 = class300.field5157.method586(-58);
            if (class189.method1290(var183, (byte) -25)) {
                class89.method695(var185, var184, 1, var186);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 235) {
            int var187 = class300.field5157.method593(true);
            int var188 = var187 >> 2;
            int var189 = var187 & 0x3;
            int var190 = class222.field3519[var188];
            int var191 = class300.field5157.method576(1);
            int var192 = class300.field5157.method587(-502942936);
            if (var191 == 65535) {
                var191 = -1;
            }
            int var193 = var192 & 0x3FFF;
            int var194 = var192 >> 14 & 0x3FFF;
            int var195 = var194 - class12.field157;
            int var196 = var193 - class165.field2568;
            int var197 = var192 >> 28 & 0x3;
            class121.method836(var197, 110, var189, var188, var196, var190, var195, var191);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 0) {
            long var198 = class300.field5157.method595(-85);
            long var200 = (long) class300.field5157.method576(arg0 + 84);
            long var202 = (long) class300.field5157.method633((byte) 93);
            int var204 = class300.field5157.method642((byte) -106);
            boolean var205 = false;
            long var206 = (var200 << 32) + var202;
            int var208 = 0;
            label1405: while (true) {
                if (var208 >= 100) {
                    if (var204 <= 1) {
                        if ((!class88.field1454 || class17.field242) && !class292.field4863) {
                            for (int var209 = 0; var209 < class132.field2014; var209++) {
                                if (class85.field1394[var209] == var198) {
                                    var205 = true;
                                    break label1405;
                                }
                            }
                        } else {
                            var205 = true;
                        }
                    }
                    break;
                }
                if (class252.field4139[var208] == var206) {
                    var205 = true;
                    break;
                }
                var208++;
            }
            if (!var205 && class166.field2573 == 0) {
                class252.field4139[class305.field5253] = var206;
                class305.field5253 = (class305.field5253 + 1) % 100;
                class26 var210 = class175.method1203(class223.method1487(class300.field5157, arg0 ^ 0xFFFF8C9D).method167(96));
                if (var204 == 2 || var204 == 3) {
                    class214.method1420(class236.method1587(new class26[] { class168.field2604, class153.method1042(-29664, var198).method176((byte) -50) }, (byte) -105), 7, var210, -1);
                } else if (var204 == 1) {
                    class214.method1420(class236.method1587(new class26[] { class223.field3529, class153.method1042(-29664, var198).method176((byte) -50) }, (byte) -71), 7, var210, -1);
                } else {
                    class214.method1420(class153.method1042(arg0 - 29581, var198).method176((byte) -50), 3, var210, arg0 + 82);
                }
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 54) {
            long var275 = class300.field5157.method595(-122);
            class300.field5157.method599(false);
            long var277 = class300.field5157.method595(-124);
            long var279 = (long) class300.field5157.method576(1);
            long var281 = (long) class300.field5157.method633((byte) 81);
            long var283 = (var279 << 32) + var281;
            int var285 = class300.field5157.method642((byte) -40);
            boolean var286 = false;
            int var287 = 0;
            label1530: while (true) {
                if (var287 >= 100) {
                    if (var285 <= 1) {
                        if ((!class88.field1454 || class17.field242) && !class292.field4863) {
                            for (int var288 = 0; var288 < class132.field2014; var288++) {
                                if (class85.field1394[var288] == var275) {
                                    var286 = true;
                                    break label1530;
                                }
                            }
                        } else {
                            var286 = true;
                        }
                    }
                    break;
                }
                if (class252.field4139[var287] == var283) {
                    var286 = true;
                    break;
                }
                var287++;
            }
            if (!var286 && class166.field2573 == 0) {
                class252.field4139[class305.field5253] = var283;
                class305.field5253 = (class305.field5253 + 1) % 100;
                class26 var289 = class175.method1203(class223.method1487(class300.field5157, 29488).method167(116));
                if (var285 == 2 || var285 == 3) {
                    class46.method352(-1, var289, class236.method1587(new class26[] { class168.field2604, class153.method1042(-29664, var275).method176((byte) -50) }, (byte) -59), class153.method1042(arg0 - 29581, var277).method176((byte) -50), 9);
                } else if (var285 == 1) {
                    class46.method352(-1, var289, class236.method1587(new class26[] { class223.field3529, class153.method1042(arg0 ^ 0x738D, var275).method176((byte) -50) }, (byte) -85), class153.method1042(-29664, var277).method176((byte) -50), 9);
                } else {
                    class46.method352(-1, var289, class153.method1042(-29664, var275).method176((byte) -50), class153.method1042(-29664, var277).method176((byte) -50), 9);
                }
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 214) {
            class160.method1086(0, true);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 172) {
            int var272 = class300.field5157.method576(1);
            int var273 = class300.field5157.method642((byte) -102);
            if (var272 == 65535) {
                var272 = -1;
            }
            int var274 = class300.field5157.method576(1);
            class98.method732(var273, var272, var274, -799);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 66) {
            int var269 = class300.field5157.method620((byte) -87);
            int var270 = class300.field5157.method619(-1);
            if (class189.method1290(var269, (byte) -25)) {
                int var271 = 0;
                if (class13.field221.field2484 != null) {
                    var271 = class13.field221.field2484.method1401(-24861);
                }
                class113.method788(-1, 3, var270, (byte) -110, var271);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 171) {
            int var211 = class300.field5157.method637((byte) -55);
            class26 var212 = class300.field5157.method615(true);
            int var213 = class300.field5157.method597(103);
            if (class189.method1290(var213, (byte) -25)) {
                class8.method52(var212, 0, var211);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 84) {
            int var267 = class300.field5157.method621(-79);
            int var268 = class300.field5157.method620((byte) -96);
            class81.method575((byte) -106, var267, var268);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 22) {
            int var261 = class300.field5157.method587(-502942936);
            int var262 = class300.field5157.method576(1);
            if (var261 < -70000) {
                var262 += 32768;
            }
            class297 var263;
            if (var261 < 0) {
                var263 = null;
            } else {
                var263 = class178.method1226((byte) 127, var261);
            }
            while (class300.field5157.field1301 < class259.field4228) {
                int var264 = class300.field5157.method617(true);
                int var265 = class300.field5157.method576(1);
                int var266 = 0;
                if (var265 != 0) {
                    var266 = class300.field5157.method642((byte) -52);
                    if (var266 == 255) {
                        var266 = class300.field5157.method587(-502942936);
                    }
                }
                if (var263 != null && var264 >= 0 && var263.field5060.length > var264) {
                    var263.field5060[var264] = var265;
                    var263.field5131[var264] = var266;
                }
                class89.method701(var265 - 1, var264, var266, var262, (byte) 46);
            }
            if (var263 != null) {
                class318.method2209(-128, var263);
            }
            class214.method1434(false);
            class281.field4672[class4.method23(class212.field3279++, 31)] = class4.method23(32767, var262);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 24) {
            int var214 = class300.field5157.method576(1);
            if (class189.method1290(var214, (byte) -25)) {
                class132.method893(-21556);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 86) {
            class216.method1451((byte) 46);
            class26.field384 = -1;
            return false;
        } else if (class26.field384 == 116) {
            int var215 = class300.field5157.method642((byte) -62);
            if (class300.field5157.method642((byte) -124) == 0) {
                class315.field5392[var215] = new class37();
            } else {
                class300.field5157.field1301--;
                class315.field5392[var215] = new class37(class300.field5157);
            }
            class26.field384 = -1;
            class17.field243 = class74.field1144;
            return true;
        } else if (class26.field384 == 73) {
            int var216 = class300.field5157.method597(-121);
            int var217 = class300.field5157.method621(-105);
            if (var216 == 65535) {
                var216 = -1;
            }
            int var218 = class300.field5157.method605(arg0 ^ 0x13);
            if (class189.method1290(var218, (byte) -25)) {
                class113.method788(-1, 2, var217, (byte) -113, var216);
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 162) {
            class160.method1086(arg0 ^ 0xFFFFFFAD, false);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 165) {
            int var251 = class300.field5157.method605(-95);
            int var252 = class300.field5157.method605(-72);
            if (var252 == 65535) {
                var252 = -1;
            }
            int var253 = class300.field5157.method587(-502942936);
            int var254 = class300.field5157.method597(23);
            int var255 = class300.field5157.method619(-1);
            if (var254 == 65535) {
                var254 = -1;
            }
            if (class189.method1290(var251, (byte) -25)) {
                for (int var256 = var254; var256 <= var252; var256++) {
                    long var257 = ((long) var253 << 32) + ((long) var256);
                    class327 var259 = (class327) class220.field3506.method1827(var257, 0);
                    class327 var260;
                    if (var259 != null) {
                        var260 = new class327(var255, var259.field5654);
                        var259.method1006(-1024);
                    } else if (var256 == -1) {
                        var260 = new class327(var255, class178.method1226((byte) 116, var253).field5063.field5654);
                    } else {
                        var260 = new class327(var255, -1);
                    }
                    class220.field3506.method1826(1, var260, var257);
                }
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 197) {
            class145.field2209 = class300.field5157.method642((byte) -104);
            class100.field1611 = class74.field1144;
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 196) {
            long var237 = class300.field5157.method595(-93);
            int var239 = class300.field5157.method576(1);
            byte var240 = class300.field5157.method599(false);
            boolean var241 = false;
            if ((Long.MIN_VALUE & var237) != 0L) {
                var241 = true;
            }
            if (var241) {
                if (class96.field1567 == 0) {
                    class26.field384 = -1;
                    return true;
                }
                boolean var247 = false;
                long var248 = var237 & Long.MAX_VALUE;
                int var250;
                for (var250 = 0; class96.field1567 > var250 && (class4.field49[var250].field2293 != var248 || class4.field49[var250].field1996 != var239); var250++) {
                }
                if (var250 < class96.field1567) {
                    while ((class96.field1567 - 1) > var250) {
                        class4.field49[var250] = class4.field49[var250 + 1];
                        var250++;
                    }
                    class96.field1567--;
                    class4.field49[class96.field1567] = null;
                }
            } else {
                class26 var242 = class300.field5157.method615(true);
                class131 var243 = new class131();
                var243.field2293 = var237;
                var243.field1992 = class153.method1042(-29664, var243.field2293);
                var243.field1988 = var240;
                var243.field1989 = var242;
                var243.field1996 = var239;
                int var244;
                for (var244 = class96.field1567 - 1; var244 >= 0; var244--) {
                    int var245 = class4.field49[var244].field1992.method190(var243.field1992, arg0 ^ 0x52);
                    if (var245 == 0) {
                        class4.field49[var244].field1996 = var239;
                        class4.field49[var244].field1988 = var240;
                        class4.field49[var244].field1989 = var242;
                        if (class20.field283 == var237) {
                            class228.field3613 = var240;
                        }
                        class216.field3392 = class74.field1144;
                        class26.field384 = -1;
                        return true;
                    }
                    if (var245 < 0) {
                        break;
                    }
                }
                if (class4.field49.length <= class96.field1567) {
                    class26.field384 = -1;
                    return true;
                }
                for (int var246 = class96.field1567 - 1; var246 > var244; var246--) {
                    class4.field49[var246 + 1] = class4.field49[var246];
                }
                if (class96.field1567 == 0) {
                    class4.field49 = new class131[100];
                }
                class4.field49[var244 + 1] = var243;
                if (class20.field283 == var237) {
                    class228.field3613 = var240;
                }
                class96.field1567++;
            }
            class26.field384 = -1;
            class216.field3392 = class74.field1144;
            return true;
        } else if (class26.field384 == 50) {
            int var230 = class300.field5157.method587(arg0 ^ 0x1DFA4C85);
            int var231 = class300.field5157.method637((byte) -79);
            int var232 = class300.field5157.method620((byte) -118);
            if (var232 == 65535) {
                var232 = -1;
            }
            int var233 = class300.field5157.method605(-85);
            if (class189.method1290(var233, (byte) -25)) {
                class297 var234 = class178.method1226((byte) 115, var231);
                if (var234.field5038) {
                    class319.method2218((byte) 122, var231, var230, var232);
                    class217 var235 = class45.method341(var232, (byte) 70);
                    class266.method1899((byte) -128, var235.field3470, var231, var235.field3458, var235.field3441);
                    class124.method850(var231, var235.field3420, var235.field3398, var235.field3447, (byte) -85);
                } else if (var232 == -1) {
                    var234.field5005 = 0;
                    class26.field384 = -1;
                    return true;
                } else {
                    class217 var236 = class45.method341(var232, (byte) 91);
                    var234.field4983 = var236.field3441;
                    var234.field4963 = var236.field3470 * 100 / var230;
                    var234.field5005 = 4;
                    var234.field5004 = var232;
                    var234.field5120 = var236.field3458;
                    class318.method2209(117, var234);
                }
            }
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 105) {
            int var219 = class300.field5157.method587(-502942936);
            int var220 = class300.field5157.method576(arg0 ^ 0xFFFFFFAC);
            if (var219 < -70000) {
                var220 += 32768;
            }
            class297 var221;
            if (var219 >= 0) {
                var221 = class178.method1226((byte) 118, var219);
            } else {
                var221 = null;
            }
            if (var221 != null) {
                for (int var222 = 0; var222 < var221.field5060.length; var222++) {
                    var221.field5060[var222] = 0;
                    var221.field5131[var222] = 0;
                }
            }
            class306.method2145((byte) 114, var220);
            int var223 = class300.field5157.method576(1);
            for (int var224 = 0; var224 < var223; var224++) {
                int var225 = class300.field5157.method593(true);
                if (var225 == 255) {
                    var225 = class300.field5157.method587(-502942936);
                }
                int var226 = class300.field5157.method576(1);
                if (var221 != null && var224 < var221.field5060.length) {
                    var221.field5060[var224] = var226;
                    var221.field5131[var224] = var225;
                }
                class89.method701(var226 - 1, var224, var225, var220, (byte) 41);
            }
            if (var221 != null) {
                class318.method2209(-9, var221);
            }
            class214.method1434(false);
            class281.field4672[class4.method23(class212.field3279++, 31)] = class4.method23(32767, var220);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 142) {
            class56.method411(0, class300.field5157.method615(true));
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 26) {
            class64.field1023 = class300.field5157.method625(true);
            class204.field3190 = class300.field5157.method642((byte) -62);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 4) {
            int var227 = class300.field5157.method620((byte) -121);
            if (var227 == 65535) {
                var227 = -1;
            }
            class218.method1471(true, var227);
            class26.field384 = -1;
            return true;
        } else if (class26.field384 == 208) {
            int var228 = class300.field5157.method594((byte) -118);
            int var229 = class300.field5157.method605(-57);
            if (var229 == 65535) {
                var229 = -1;
            }
            class216.method1448(var228, var229, (byte) -1);
            class26.field384 = -1;
            return true;
        } else {
            class302.method2124("T1 - " + class26.field384 + "," + class178.field2800 + "," + class284.field4757 + " - " + class259.field4228, (Throwable) null, (byte) 117);
            class216.method1451((byte) 46);
            return true;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 2884)
    public static void method1115(int arg0) {
        field2536 = null;
        field2529 = (byte[][][]) null;
        field2537 = null;
        if (arg0 > -88) {
            method1115(-84);
        }
        field2533 = null;
        field2540 = null;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V", line = 2900)
    public static final void method1116(int arg0) {
        class318.method2209(arg0 + 111, class95.field1549);
        field2528++;
        class276.field4617++;
        if (class168.field2596 && class123.field1913) {
            int var1 = class136.field2090;
            int var2 = var1 - class254.field4150;
            if (class72.field1115 > var2) {
                var2 = class72.field1115;
            }
            int var3 = class259.field4235;
            if ((class72.field1115 + field2540.field4967) < (var2 + class95.field1549.field4967)) {
                var2 = class72.field1115 + field2540.field4967 - class95.field1549.field4967;
            }
            int var4 = var3 - class313.field5346;
            if (var4 < class287.field4801) {
                var4 = class287.field4801;
            }
            if (class287.field4801 + field2540.field4996 < var4 - -class95.field1549.field4996) {
                var4 = class287.field4801 + field2540.field4996 - class95.field1549.field4996;
            }
            if (arg0 != -1) {
                field2533 = (class32) null;
            }
            int var5 = var4 - class55.field873;
            int var6 = var2 - class88.field1437;
            int var7 = field2540.field5053 + var2 - class72.field1115;
            int var8 = field2540.field5012 + var4 - class287.field4801;
            int var9 = class95.field1549.field5018;
            if (class276.field4617 > class95.field1549.field4978 && (var9 < var6 || (-var9) > var6 || var5 > var9 || var5 < -var9)) {
                class324.field5563 = true;
            }
            if (class95.field1549.field5106 != null && class324.field5563) {
                class263 var10 = new class263();
                var10.field4307 = class95.field1549;
                var10.field4306 = class95.field1549.field5106;
                var10.field4305 = var7;
                var10.field4298 = var8;
                class215.method1442(1073376993, var10);
            }
            if (class310.field5325 == 0) {
                if (class324.field5563) {
                    if (class95.field1549.field5034 != null) {
                        class263 var11 = new class263();
                        var11.field4298 = var8;
                        var11.field4292 = class322.field5544;
                        var11.field4305 = var7;
                        var11.field4306 = class95.field1549.field5034;
                        var11.field4307 = class95.field1549;
                        class215.method1442(1073376993, var11);
                    }
                    if (class322.field5544 != null && client.method1725(class95.field1549) != null) {
                        class114.field1789.method1431(0, 79);
                        class38.field624++;
                        class114.field1789.method598(-93, class95.field1549.field5088);
                        class114.field1789.method635(arg0 ^ 0x0, class322.field5544.field4994);
                        class114.field1789.method577(-125, class322.field5544.field5088);
                        class114.field1789.method635(-1, class95.field1549.field4994);
                    }
                } else if ((class28.field475 == 1 || class261.method1840(class126.field1955 - 1, ~arg0)) && class126.field1955 > 2) {
                    class108.method768((byte) -97);
                } else if (class126.field1955 > 0) {
                    class158.method1073(96);
                }
                class95.field1549 = null;
            }
        } else if (class276.field4617 > 1) {
            class95.field1549 = null;
        }
    }
}
