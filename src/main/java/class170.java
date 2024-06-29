import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class170 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Ldd;")
    public static class35 field3392 = class180.method1196((byte) 126, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Ldd;")
    public static class35 field3394 = class180.method1196((byte) 127, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Ldd;")
    private static class35 field3398 = class180.method1196((byte) 126, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Ldd;")
    public static class35 field3400 = class180.method1196((byte) -102, ")1 ");

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Ldd;")
    public static class35 field3393 = field3398;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field3399 = 0;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "[[S")
    public static short[][] field3396 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Ldd;")
    private static class35 field3403 = class180.method1196((byte) -65, ":tradereq:");

    @OriginalMember(owner = "client!s", name = "p", descriptor = "Ldd;")
    public static class35 field3407 = class180.method1196((byte) -100, "k");

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public int field3402;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public int field3404;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Ljava/awt/Image;")
    public Image field3395;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "[I")
    public int[] field3408;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Z")
    public static final boolean method1108(int arg0) {
        field3406++;
        if (class108.field2408 == null) {
            return false;
        }
        try {
            int var1 = class108.field2408.method923(false);
            if (var1 == 0) {
                return false;
            }
            if (class207.field4121 == -1) {
                var1--;
                class108.field2408.method922(1, 1, class172.field3441.field529, 0);
                class172.field3441.field527 = 0;
                class207.field4121 = class172.field3441.method668(255);
                class101.field2224 = class82.field1912[class207.field4121];
            }
            if (class101.field2224 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class108.field2408.method922(1, 1, class172.field3441.field529, 0);
                class101.field2224 = class172.field3441.field529[0] & 0xFF;
            }
            if (class101.field2224 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                var1 -= 2;
                class108.field2408.method922(1, 2, class172.field3441.field529, 0);
                class172.field3441.field527 = 0;
                class101.field2224 = class172.field3441.method256((byte) -78);
            }
            if (class101.field2224 > var1) {
                return false;
            }
            class172.field3441.field527 = 0;
            class108.field2408.method922(1, class101.field2224, class172.field3441.field529, 0);
            class13.field231 = class113.field2532;
            class161.field3272 = 0;
            class113.field2532 = class113.field2534;
            class113.field2534 = class207.field4121;
            if (class207.field4121 == 6) {
                int var2 = class172.field3441.method238((byte) 48);
                class93.field2062 = var2;
                class28.method273(var2, (byte) 73);
                class207.method1367(class93.field2062, -1);
                for (int var3 = 0; var3 < 100; var3++) {
                    class158.field3228[var3] = true;
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 253) {
                int var4 = class172.field3441.method263(124);
                int var5 = class172.field3441.method216((byte) -117);
                class55 var6 = class131.method903(609074640, var5);
                if (var6.field1303 != var4 || var4 == -1) {
                    var6.field1240 = 0;
                    var6.field1303 = var4;
                    var6.field1289 = 0;
                    class137.method937(var6, (byte) -85);
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 0) {
                class96.field2114 = class172.field3441.method221(-119);
                class100.field2208 = class13.field232;
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 214) {
                int var7 = class172.field3441.method221(-102);
                int var8 = class172.field3441.method221(-110);
                int var9 = class172.field3441.method221(-84);
                int var10 = class172.field3441.method221(-105);
                int var11 = class172.field3441.method256((byte) -78);
                class48.field1057[var7] = true;
                class29.field587[var7] = var8;
                class97.field2142[var7] = var9;
                class19.field379[var7] = var10;
                class37.field810[var7] = var11;
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 78) {
                class120.field2641 = class172.field3441.method221(-109);
                class13.field241 = class172.field3441.method252(255);
                for (int var12 = class13.field241; var12 < class13.field241 + 8; var12++) {
                    for (int var13 = class120.field2641; var13 < class120.field2641 + 8; var13++) {
                        if (class145.field3074[class175.field3585][var12][var13] != null) {
                            class145.field3074[class175.field3585][var12][var13] = null;
                            class181.method1201(var13, var12, 2048);
                        }
                    }
                }
                for (class21 var14 = (class21) class136.field2910.method1232(25831); var14 != null; var14 = (class21) class136.field2910.method1238(22622)) {
                    if (class13.field241 <= var14.field423 && var14.field423 < class13.field241 + 8 && class120.field2641 <= var14.field434 && var14.field434 < class120.field2641 + 8 && class175.field3585 == var14.field437) {
                        var14.field413 = 0;
                    }
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 108) {
                class50.method448(true);
                class207.field4121 = -1;
                return false;
            }
            if (class207.field4121 == 105) {
                for (int var15 = 0; var15 < class130.field2787; var15++) {
                    class29 var16 = class111.method814(-107, var15);
                    if (var16 != null && var16.field597 == 0) {
                        class110.field2430[var15] = 0;
                        class115.field2557[var15] = 0;
                    }
                }
                method1110((byte) 82);
                class207.field4121 = -1;
                class115.field2559 += 32;
                return true;
            }
            if (class207.field4121 == 18) {
                for (int var17 = 0; var17 < class115.field2557.length; var17++) {
                    if (class115.field2557[var17] != class110.field2430[var17]) {
                        class115.field2557[var17] = class110.field2430[var17];
                        class163.method1080((byte) 116, var17);
                        class70.field1683[class208.method1372(31, class115.field2559++)] = var17;
                    }
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 111) {
                class136.field2912 = class101.field2224 / 8;
                for (int var18 = 0; var18 < class136.field2912; var18++) {
                    class5.field82[var18] = class172.field3441.method230((byte) 100);
                    class58.field1449[var18] = class49.method436(class5.field82[var18], false);
                }
                class207.field4121 = -1;
                class100.field2208 = class13.field232;
                return true;
            }
            if (class207.field4121 == 198) {
                int var19 = class172.field3441.method256((byte) -78);
                int var20 = class172.field3441.method221(-93);
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var21 = class172.field3441.method256((byte) -78);
                class167.method1102(var20, (byte) 91, var19, var21);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 26) {
                int var22 = class172.field3441.method221(-122);
                int var23 = var22 >> 6;
                class89 var24 = new class89();
                var24.field1994 = var22 & 0x3F;
                var24.field1981 = class172.field3441.method221(-97);
                if (var24.field1981 >= 0 && var24.field1981 < class205.field4076.length) {
                    if (var24.field1994 == 1 || var24.field1994 == 10) {
                        var24.field1984 = class172.field3441.method256((byte) -78);
                    }
                    if (var24.field1994 >= 2 && var24.field1994 <= 6) {
                        if (var24.field1994 == 2) {
                            var24.field1990 = 64;
                            var24.field1993 = 64;
                        }
                        if (var24.field1994 == 3) {
                            var24.field1990 = 0;
                            var24.field1993 = 64;
                        }
                        if (var24.field1994 == 4) {
                            var24.field1993 = 64;
                            var24.field1990 = 128;
                        }
                        if (var24.field1994 == 5) {
                            var24.field1993 = 0;
                            var24.field1990 = 64;
                        }
                        if (var24.field1994 == 6) {
                            var24.field1993 = 128;
                            var24.field1990 = 64;
                        }
                        var24.field1994 = 2;
                        var24.field1991 = class172.field3441.method256((byte) -78);
                        var24.field1987 = class172.field3441.method256((byte) -78);
                        var24.field1995 = class172.field3441.method221(-95);
                    }
                    class162.field3297[var23] = var24;
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 134) {
                int var25 = class172.field3441.method231(65280);
                int var26 = class172.field3441.method256((byte) -78);
                class110.field2430[var26] = var25;
                if (class115.field2557[var26] != var25) {
                    class115.field2557[var26] = var25;
                    class163.method1080((byte) 125, var26);
                }
                class70.field1683[class208.method1372(class115.field2559++, 31)] = var26;
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 187) {
                class20.field385 = class172.field3441.method256((byte) -78) * 30;
                class207.field4121 = -1;
                class1.field14 = class13.field232;
                return true;
            }
            if (class207.field4121 == 216) {
                class186.method1227(class172.field3441, -61);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 160) {
                class45.method407(-48, false);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 201) {
                int var27 = class172.field3441.method256((byte) -78);
                if (var27 == 65535) {
                    var27 = -1;
                }
                class134.method918(-31901, var27);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 34) {
                int var28 = class172.field3441.method238((byte) 123);
                if (var28 == 65535) {
                    var28 = -1;
                }
                int var29 = class172.field3441.method219(-2);
                class118.method846(var29, true, var28);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 95) {
                int var30 = class172.field3441.method266(-1330);
                class55 var31 = class131.method903(609074640, var30);
                var31.field1315 = 3;
                var31.field1244 = class71.field1704.field2281.method183(false);
                class137.method937(var31, (byte) -85);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 50) {
                int var32 = class172.field3441.method238((byte) 58);
                int var33 = class172.field3441.method248(true);
                int var34 = class172.field3441.method216((byte) -108);
                class55 var35 = class131.method903(609074640, var34);
                class207.field4121 = -1;
                var35.field1349 = (var32 << 16) + var33;
                return true;
            }
            if (class207.field4121 == 1) {
                class78.field1823 = class13.field232;
                long var36 = class172.field3441.method230((byte) 100);
                if (var36 == 0L) {
                    class13.field236 = null;
                    class207.field4121 = -1;
                    class14.field265 = 0;
                    class45.field981 = null;
                    class175.field3580 = null;
                    return true;
                }
                long var38 = class172.field3441.method230((byte) 100);
                class13.field236 = class49.method436(var38, false);
                class45.field981 = class49.method436(var36, false);
                class148.field3115 = class172.field3441.method225((byte) -105);
                int var40 = class172.field3441.method221(-126);
                if (var40 == 255) {
                    class207.field4121 = -1;
                    return true;
                }
                class14.field265 = var40;
                class93[] var41 = new class93[100];
                for (int var42 = 0; var42 < class14.field265; var42++) {
                    var41[var42] = new class93();
                    var41[var42].field2416 = class172.field3441.method230((byte) 100);
                    var41[var42].field2052 = class49.method436(var41[var42].field2416, false);
                    var41[var42].field2060 = class172.field3441.method256((byte) -78);
                    var41[var42].field2069 = class172.field3441.method225((byte) -114);
                    var41[var42].field2061 = class172.field3441.method236(0);
                    if (class148.field3104 == var41[var42].field2416) {
                        class24.field470 = var41[var42].field2069;
                    }
                }
                boolean var43 = false;
                int var44 = class14.field265;
                while (var44 > 0) {
                    boolean var45 = true;
                    var44--;
                    for (int var46 = 0; var46 < var44; var46++) {
                        if (var41[var46].field2052.method339(var41[var46 + 1].field2052, (byte) 30) > 0) {
                            var45 = false;
                            class93 var47 = var41[var46];
                            var41[var46] = var41[var46 + 1];
                            var41[var46 + 1] = var47;
                        }
                    }
                    if (var45) {
                        break;
                    }
                }
                class175.field3580 = var41;
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 51) {
                int var48 = class172.field3441.method250(28198);
                class124.method884(var48, -36);
                class105.field2347[class208.method1372(31, class65.field1547++)] = class208.method1372(var48, 32767);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 136) {
                int var49 = class172.field3441.method266(-1330);
                int var50 = class172.field3441.method256((byte) -78);
                if (var50 == 65535) {
                    var50 = -1;
                }
                int var51 = class172.field3441.method238((byte) 126);
                int var52 = class172.field3441.method231(65280);
                if (var51 == 65535) {
                    var51 = -1;
                }
                for (int var53 = var50; var53 <= var51; var53++) {
                    long var54 = ((long) var49 << 32) + (long) var53;
                    class109 var56 = class26.field555.method796(true, var54);
                    if (var56 != null) {
                        var56.method799(-24265);
                    }
                    class26.field555.method789(new class15(var52), true, var54);
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 102) {
                int var57 = class101.field2224 + class172.field3441.field527;
                int var58 = class172.field3441.method256((byte) -78);
                int var59 = class172.field3441.method256((byte) -78);
                if (class93.field2062 != var58) {
                    class93.field2062 = var58;
                    class28.method273(class93.field2062, (byte) 73);
                    class207.method1367(class93.field2062, -1);
                    for (int var60 = 0; var60 < 100; var60++) {
                        class158.field3228[var60] = true;
                    }
                }
                while (var59-- > 0) {
                    int var61 = class172.field3441.method240(8);
                    int var62 = class172.field3441.method256((byte) -78);
                    int var63 = class172.field3441.method221(-78);
                    class195 var64 = (class195) class22.field445.method796(true, (long) var61);
                    if (var64 != null && var64.field3884 != var62) {
                        class4.method27(-817150687, true, var64);
                        var64 = null;
                    }
                    if (var64 == null) {
                        var64 = class100.method754(-116, var61, var62, var63);
                    }
                    var64.field3885 = true;
                }
                for (class195 var65 = (class195) class22.field445.method790(-115); var65 != null; var65 = (class195) class22.field445.method794((byte) 90)) {
                    if (var65.field3885) {
                        var65.field3885 = false;
                    } else {
                        class4.method27(-817150687, true, var65);
                    }
                }
                class26.field555 = new class107(512);
                while (class172.field3441.field527 < var57) {
                    int var66 = class172.field3441.method240(8);
                    int var67 = class172.field3441.method256((byte) -78);
                    int var68 = class172.field3441.method256((byte) -78);
                    int var69 = class172.field3441.method240(8);
                    for (int var70 = var67; var70 <= var68; var70++) {
                        long var71 = ((long) var66 << 32) + ((long) var70);
                        class26.field555.method789(new class15(var69), true, var71);
                    }
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 90) {
                long var73 = class172.field3441.method230((byte) 100);
                int var75 = class172.field3441.method256((byte) -78);
                int var76 = class172.field3441.method221(-119);
                class35 var77 = class20.field387;
                if (var75 > 0) {
                    var77 = class172.field3441.method236(0);
                }
                class35 var78 = class49.method436(var73, false).method346(68);
                for (int var79 = 0; var79 < class25.field505; var79++) {
                    if (class167.field3373[var79] == var73) {
                        if (class181.field3691[var79] != var75) {
                            class181.field3691[var79] = var75;
                            if (var75 > 0) {
                                class190.method1252(class20.field387, 0, class63.method529(new class35[] { var78, class165.field3344 }, (byte) 90), 5);
                            }
                            if (var75 == 0) {
                                class190.method1252(class20.field387, 0, class63.method529(new class35[] { var78, class53.field1199 }, (byte) 56), 5);
                            }
                        }
                        var78 = null;
                        class67.field1567[var79] = var77;
                        class44.field957[var79] = var76;
                        break;
                    }
                }
                if (var78 != null && class25.field505 < 200) {
                    class167.field3373[class25.field505] = var73;
                    class39.field871[class25.field505] = var78;
                    class181.field3691[class25.field505] = var75;
                    class67.field1567[class25.field505] = var77;
                    class44.field957[class25.field505] = var76;
                    class25.field505++;
                }
                class100.field2208 = class13.field232;
                boolean var80 = false;
                int var81 = class25.field505;
                while (var81 > 0) {
                    var81--;
                    boolean var82 = true;
                    for (int var83 = 0; var83 < var81; var83++) {
                        if (class181.field3691[var83] != class101.field2230 && class181.field3691[var83 + 1] == class101.field2230 || class181.field3691[var83] == 0 && class181.field3691[var83 + 1] != 0) {
                            int var84 = class181.field3691[var83];
                            var82 = false;
                            class181.field3691[var83] = class181.field3691[var83 + 1];
                            class181.field3691[var83 + 1] = var84;
                            class35 var85 = class67.field1567[var83];
                            class67.field1567[var83] = class67.field1567[var83 + 1];
                            class67.field1567[var83 + 1] = var85;
                            class35 var86 = class39.field871[var83];
                            class39.field871[var83] = class39.field871[var83 + 1];
                            class39.field871[var83 + 1] = var86;
                            long var87 = class167.field3373[var83];
                            class167.field3373[var83] = class167.field3373[var83 + 1];
                            class167.field3373[var83 + 1] = var87;
                            int var89 = class44.field957[var83];
                            class44.field957[var83] = class44.field957[var83 + 1];
                            class44.field957[var83 + 1] = var89;
                        }
                    }
                    if (var82) {
                        break;
                    }
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 127) {
                if (class93.field2062 != -1) {
                    class82.method623(class93.field2062, 0, (byte) -112);
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 120) {
                int var90 = class172.field3441.method248(true);
                byte var91 = class172.field3441.method223(true);
                class110.field2430[var90] = var91;
                if (class115.field2557[var90] != var91) {
                    class115.field2557[var90] = var91;
                    class163.method1080((byte) 98, var90);
                }
                class70.field1683[class208.method1372(31, class115.field2559++)] = var90;
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 207) {
                method1110((byte) 82);
                class115.field2587 = class172.field3441.method221(-93);
                class207.field4121 = -1;
                class1.field14 = class13.field232;
                return true;
            }
            if (class207.field4121 == 42) {
                int var92 = class172.field3441.method231(65280);
                int var93 = class172.field3441.method238((byte) 35);
                int var94 = class172.field3441.method266(-1330);
                class55 var95 = class131.method903(609074640, var94);
                if (var93 == 65535) {
                    var93 = -1;
                }
                if (var95.field1291) {
                    var95.field1254 = var92;
                    var95.field1258 = var93;
                    class46 var97 = class207.method1370((byte) -73, var93);
                    var95.field1323 = var97.field1000;
                    var95.field1337 = var97.field984;
                    var95.field1304 = var97.field1037;
                    var95.field1307 = var97.field1006;
                    var95.field1252 = var97.field1031;
                    if (var95.field1249 > 0) {
                        var95.field1252 = var95.field1252 * 32 / var95.field1249;
                    }
                    var95.field1295 = var97.field988;
                    class137.method937(var95, (byte) -85);
                } else if (var93 == -1) {
                    var95.field1315 = 0;
                    class207.field4121 = -1;
                    return true;
                } else {
                    class46 var96 = class207.method1370((byte) -73, var93);
                    var95.field1315 = 4;
                    var95.field1323 = var96.field1000;
                    var95.field1252 = var96.field1031 * 100 / var92;
                    var95.field1244 = var93;
                    var95.field1304 = var96.field1037;
                    class137.method937(var95, (byte) -85);
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 122) {
                long var98 = class172.field3441.method230((byte) 100);
                long var100 = (long) class172.field3441.method256((byte) -78);
                long var102 = (long) class172.field3441.method232(74);
                long var104 = (var100 << 32) + var102;
                int var106 = class172.field3441.method221(-83);
                boolean var107 = false;
                for (int var108 = 0; var108 < 100; var108++) {
                    if (class30.field600[var108] == var104) {
                        var107 = true;
                        break;
                    }
                }
                if (var106 <= 1) {
                    for (int var109 = 0; var109 < class136.field2912; var109++) {
                        if (class5.field82[var109] == var98) {
                            var107 = true;
                            break;
                        }
                    }
                }
                if (!var107 && class55.field1283 == 0) {
                    class30.field600[class14.field263] = var104;
                    class14.field263 = (class14.field263 + 1) % 100;
                    class35 var110 = class199.method1309(class110.method808(class172.field3441, 7485).method357((byte) 107));
                    if (var106 == 2 || var106 == 3) {
                        class190.method1252(class63.method529(new class35[] { class99.field2172, class49.method436(var98, false).method346(68) }, (byte) 110), 0, var110, 7);
                    } else if (var106 == 1) {
                        class190.method1252(class63.method529(new class35[] { class46.field985, class49.method436(var98, false).method346(76) }, (byte) 85), 0, var110, 7);
                    } else {
                        class190.method1252(class49.method436(var98, false).method346(89), 0, var110, 3);
                    }
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 63) {
                method1110((byte) 82);
                class24.field484 = class172.field3441.method241(false);
                class1.field14 = class13.field232;
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 155) {
                class34.field702 = class172.field3441.method221(-79);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 218) {
                class35 var111 = class172.field3441.method236(0);
                if (var111.method317((byte) 95, field3403)) {
                    class35 var112 = var111.method326(0, -1, var111.method327((byte) 88, class38.field842));
                    boolean var113 = false;
                    long var114 = var112.method321(21830);
                    for (int var116 = 0; var116 < class136.field2912; var116++) {
                        if (class5.field82[var116] == var114) {
                            var113 = true;
                            break;
                        }
                    }
                    if (!var113 && class55.field1283 == 0) {
                        class190.method1252(var112, 0, class63.field1517, 4);
                    }
                } else if (var111.method317((byte) 95, class176.field3597)) {
                    class35 var117 = var111.method326(0, -6, var111.method327((byte) 102, class38.field842));
                    long var118 = var117.method321(21830);
                    boolean var120 = false;
                    for (int var121 = 0; var121 < class136.field2912; var121++) {
                        if (class5.field82[var121] == var118) {
                            var120 = true;
                            break;
                        }
                    }
                    if (!var120 && class55.field1283 == 0) {
                        class35 var122 = var111.method326(var111.method327((byte) 82, class38.field842) + 1, 127, var111.method347((byte) -104) - 9);
                        class190.method1252(var117, 0, var122, 8);
                    }
                } else if (var111.method317((byte) 95, class51.field1157)) {
                    boolean var141 = false;
                    class35 var142 = var111.method326(0, 115, var111.method327((byte) 58, class38.field842));
                    long var143 = var142.method321(21830);
                    for (int var145 = 0; var145 < class136.field2912; var145++) {
                        if (class5.field82[var145] == var143) {
                            var141 = true;
                            break;
                        }
                    }
                    if (!var141 && class55.field1283 == 0) {
                        class190.method1252(var142, 0, class20.field387, 10);
                    }
                } else if (var111.method317((byte) 95, class8.field138)) {
                    class35 var123 = var111.method326(0, 16, var111.method327((byte) 69, class8.field138));
                    class190.method1252(class20.field387, 0, var123, 11);
                } else if (var111.method317((byte) 95, class175.field3564)) {
                    class35 var140 = var111.method326(0, -40, var111.method327((byte) 58, class175.field3564));
                    if (class55.field1283 == 0) {
                        class190.method1252(class20.field387, 0, var140, 12);
                    }
                } else if (var111.method317((byte) 95, class147.field3097)) {
                    class35 var139 = var111.method326(0, -54, var111.method327((byte) 84, class147.field3097));
                    if (class55.field1283 == 0) {
                        class190.method1252(class20.field387, 0, var139, 13);
                    }
                } else if (var111.method317((byte) 95, class143.field2996)) {
                    class35 var134 = var111.method326(0, 115, var111.method327((byte) 63, class38.field842));
                    boolean var135 = false;
                    long var136 = var134.method321(21830);
                    for (int var138 = 0; var138 < class136.field2912; var138++) {
                        if (class5.field82[var138] == var136) {
                            var135 = true;
                            break;
                        }
                    }
                    if (!var135 && class55.field1283 == 0) {
                        class190.method1252(var134, 0, class20.field387, 14);
                    }
                } else if (var111.method317((byte) 95, class2.field35)) {
                    class35 var124 = var111.method326(0, 127, var111.method327((byte) 104, class38.field842));
                    long var125 = var124.method321(21830);
                    boolean var127 = false;
                    for (int var128 = 0; var128 < class136.field2912; var128++) {
                        if (class5.field82[var128] == var125) {
                            var127 = true;
                            break;
                        }
                    }
                    if (!var127 && class55.field1283 == 0) {
                        class190.method1252(var124, 0, class20.field387, 15);
                    }
                } else if (var111.method317((byte) 95, class195.field3890)) {
                    class35 var129 = var111.method326(0, 14, var111.method327((byte) 59, class38.field842));
                    long var130 = var129.method321(21830);
                    boolean var132 = false;
                    for (int var133 = 0; var133 < class136.field2912; var133++) {
                        if (class5.field82[var133] == var130) {
                            var132 = true;
                            break;
                        }
                    }
                    if (!var132 && class55.field1283 == 0) {
                        class190.method1252(var129, 0, class20.field387, 16);
                    }
                } else {
                    class190.method1252(class20.field387, 0, var111, 0);
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 143) {
                int var146 = class172.field3441.method216((byte) 35);
                class168.field3388 = class182.field3734.method384(var146, (byte) 39);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 75) {
                class2.field29 = true;
                class44.field956 = class172.field3441.method221(-111);
                class166.field3369 = class172.field3441.method221(-110);
                class127.field2755 = class172.field3441.method256((byte) -78);
                class110.field2426 = class172.field3441.method221(-91);
                class102.field2270 = class172.field3441.method221(-86);
                if (class102.field2270 >= 100) {
                    class8.field122 = class166.field3369 * 128 + 64;
                    class26.field571 = class44.field956 * 128 + 64;
                    class51.field1150 = class73.method583(class175.field3585, class8.field122, class26.field571, (byte) 1) - class127.field2755;
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 124) {
                long var147 = class172.field3441.method230((byte) 100);
                int var149 = class172.field3441.method256((byte) -78);
                byte var150 = class172.field3441.method225((byte) -127);
                boolean var151 = false;
                if ((Long.MIN_VALUE & var147) != 0L) {
                    var151 = true;
                }
                if (var151) {
                    if (class14.field265 == 0) {
                        class207.field4121 = -1;
                        return true;
                    }
                    long var152 = var147 & Long.MAX_VALUE;
                    boolean var154 = false;
                    int var155;
                    for (var155 = 0; var155 < class14.field265 && (class175.field3580[var155].field2416 != var152 || class175.field3580[var155].field2060 != var149); var155++) {
                    }
                    if (var155 < class14.field265) {
                        while (class14.field265 - 1 > var155) {
                            class175.field3580[var155] = class175.field3580[var155 + 1];
                            var155++;
                        }
                        class14.field265--;
                        class175.field3580[class14.field265] = null;
                    }
                } else {
                    class35 var156 = class172.field3441.method236(0);
                    class93 var157 = new class93();
                    var157.field2416 = var147;
                    var157.field2052 = class49.method436(var157.field2416, false);
                    var157.field2069 = var150;
                    var157.field2060 = var149;
                    var157.field2061 = var156;
                    int var158;
                    for (var158 = class14.field265 - 1; var158 >= 0; var158--) {
                        int var159 = class175.field3580[var158].field2052.method339(var157.field2052, (byte) 30);
                        if (var159 == 0) {
                            class175.field3580[var158].field2060 = var149;
                            class175.field3580[var158].field2069 = var150;
                            class175.field3580[var158].field2061 = var156;
                            class207.field4121 = -1;
                            if (class148.field3104 == var147) {
                                class24.field470 = var150;
                            }
                            class78.field1823 = class13.field232;
                            return true;
                        }
                        if (var159 < 0) {
                            break;
                        }
                    }
                    if (class14.field265 >= class175.field3580.length) {
                        class207.field4121 = -1;
                        return true;
                    }
                    for (int var160 = class14.field265 - 1; var160 > var158; var160--) {
                        class175.field3580[var160 + 1] = class175.field3580[var160];
                    }
                    if (class14.field265 == 0) {
                        class175.field3580 = new class93[100];
                    }
                    class175.field3580[var158 + 1] = var157;
                    if (class148.field3104 == var147) {
                        class24.field470 = var150;
                    }
                    class14.field265++;
                }
                class78.field1823 = class13.field232;
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 110) {
                int var161 = class172.field3441.method248(true);
                int var162 = class172.field3441.method256((byte) -78);
                int var163 = class172.field3441.method231(65280);
                int var164 = class172.field3441.method248(true);
                class55 var165 = class131.method903(609074640, var163);
                if (var165.field1304 != var162 || var165.field1323 != var161 || var165.field1252 != var164) {
                    var165.field1252 = var164;
                    var165.field1304 = var162;
                    var165.field1323 = var161;
                    class137.method937(var165, (byte) -85);
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 168) {
                class2.field29 = false;
                for (int var166 = 0; var166 < 5; var166++) {
                    class48.field1057[var166] = false;
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 94) {
                class35 var167 = class172.field3441.method236(0);
                int var168 = class172.field3441.method252(255);
                int var169 = class172.field3441.method221(-101);
                if (var169 >= 1 && var169 <= 8) {
                    if (var167.method337(-78, class4.field80)) {
                        var167 = null;
                    }
                    class25.field512[var169 - 1] = var167;
                    class88.field1953[var169 - 1] = var168 == 0;
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 33) {
                class135.method921(class172.field3441, class101.field2224, (byte) 88, class182.field3734);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 150) {
                int var170 = class172.field3441.method248(true);
                if (var170 == 65535) {
                    var170 = -1;
                }
                int var171 = class172.field3441.method231(65280);
                class55 var172 = class131.method903(609074640, var171);
                if (var172.field1315 != 1 || var172.field1244 != var170) {
                    var172.field1244 = var170;
                    var172.field1315 = 1;
                    class137.method937(var172, (byte) -85);
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 146) {
                method1110((byte) 82);
                int var173 = class172.field3441.method221(-104);
                int var174 = class172.field3441.method216((byte) 81);
                int var175 = class172.field3441.method221(-112);
                class172.field3440[var173] = var174;
                class159.field3239[var173] = var175;
                class129.field2781[var173] = 1;
                for (int var176 = 0; var176 < 98; var176++) {
                    if (class175.field3576[var176] <= var174) {
                        class129.field2781[var173] = var176 + 2;
                    }
                }
                class67.field1580[class208.method1372(class61.field1499++, 31)] = var173;
                class207.field4121 = -1;
                return true;
            }
            int var177 = 25 % ((arg0 - 6) / 60);
            if (class207.field4121 == 113) {
                class13.field241 = class172.field3441.method217((byte) 59);
                class120.field2641 = class172.field3441.method252(255);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 239) {
                int var178 = class172.field3441.method240(8);
                int var179 = class172.field3441.method250(28198);
                class55 var180 = class131.method903(609074640, var178);
                if (var180 != null && var180.field1355 == 0) {
                    if (var179 > var180.field1257 - var180.field1329) {
                        var179 = var180.field1257 - var180.field1329;
                    }
                    if (var179 < 0) {
                        var179 = 0;
                    }
                    if (var180.field1310 != var179) {
                        var180.field1310 = var179;
                        class137.method937(var180, (byte) -85);
                    }
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 192) {
                int var181 = class172.field3441.method251(false);
                int var182 = class172.field3441.method241(false);
                int var183 = class172.field3441.method266(-1330);
                class55 var184 = class131.method903(609074640, var183);
                int var185 = var184.field1324 + var182;
                int var186 = var184.field1259 + var181;
                if (var184.field1348 != var186 || var184.field1314 != var185) {
                    var184.field1348 = var186;
                    var184.field1314 = var185;
                    class137.method937(var184, (byte) -85);
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 45) {
                class55.field1352 = 0;
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 178) {
                int var187 = class172.field3441.method252(255);
                int var188 = class172.field3441.method221(-117);
                int var189 = class172.field3441.method252(255);
                class175.field3585 = var189 >> 1;
                class71.field1704.method558((var189 & 0x1) == 1, -30, var188, var187);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 25) {
                int var190 = class172.field3441.method216((byte) -111);
                class55 var191 = class131.method903(609074640, var190);
                for (int var192 = 0; var192 < var191.field1316.length; var192++) {
                    var191.field1316[var192] = -1;
                    var191.field1316[var192] = 0;
                }
                class137.method937(var191, (byte) -85);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 19) {
                int var193 = class172.field3441.method266(-1330);
                boolean var194 = class172.field3441.method252(255) == 1;
                class55 var195 = class131.method903(609074640, var193);
                if (var195.field1336 != var194) {
                    var195.field1336 = var194;
                    class137.method937(var195, (byte) -85);
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 167) {
                int var196 = class172.field3441.method256((byte) -78);
                int var197 = class172.field3441.method216((byte) -126);
                class55 var198 = class131.method903(609074640, var197);
                if (var196 == 65535) {
                    var196 = -1;
                }
                if (var198.field1315 != 2 || var198.field1244 != var196) {
                    var198.field1244 = var196;
                    var198.field1315 = 2;
                    class137.method937(var198, (byte) -85);
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 162) {
                class35 var199 = class172.field3441.method236(0);
                Object[] var200 = new Object[var199.method347((byte) -100) + 1];
                for (int var201 = var199.method347((byte) -86) - 1; var201 >= 0; var201--) {
                    if (var199.method341(var201, -11) == 115) {
                        var200[var201 + 1] = class172.field3441.method236(0);
                    } else {
                        var200[var201 + 1] = Integer.valueOf(class172.field3441.method240(8));
                    }
                }
                var200[0] = Integer.valueOf(class172.field3441.method240(8));
                class200 var202 = new class200();
                var202.field4010 = var200;
                class1.method2(var202, (byte) -123);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 221) {
                int var203 = class172.field3441.method240(8);
                int var204 = class172.field3441.method256((byte) -78);
                class55 var205;
                if (var203 >= 0) {
                    var205 = class131.method903(609074640, var203);
                } else {
                    var205 = null;
                }
                if (var203 < -70000) {
                    var204 += 32768;
                }
                while (class101.field2224 > class172.field3441.field527) {
                    int var206 = class172.field3441.method259((byte) -114);
                    int var207 = 0;
                    int var208 = class172.field3441.method256((byte) -78);
                    if (var208 != 0) {
                        var207 = class172.field3441.method221(-122);
                        if (var207 == 255) {
                            var207 = class172.field3441.method240(8);
                        }
                    }
                    if (var205 != null && var206 >= 0 && var206 < var205.field1316.length) {
                        var205.field1316[var206] = var208;
                        var205.field1242[var206] = var207;
                    }
                    class25.method213(var208 - 1, var207, var206, var204, true);
                }
                if (var205 != null) {
                    class137.method937(var205, (byte) -85);
                }
                method1110((byte) 82);
                class105.field2347[class208.method1372(31, class65.field1547++)] = class208.method1372(var204, 32767);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 9) {
                class50.method444(-1446570996);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 29) {
                int var209 = class172.field3441.method221(-101);
                if (class172.field3441.method221(-105) == 0) {
                    class8.field147[var209] = new class130();
                } else {
                    class172.field3441.field527--;
                    class8.field147[var209] = new class130(class172.field3441);
                }
                class207.field4121 = -1;
                class3.field53 = class13.field232;
                return true;
            }
            if (class207.field4121 == 153) {
                int var210 = class172.field3441.method231(65280);
                int var211 = class172.field3441.method217((byte) 48);
                int var212 = class172.field3441.method238((byte) 77);
                class195 var213 = (class195) class22.field445.method796(true, (long) var210);
                if (var213 != null) {
                    class4.method27(-817150687, var213.field3884 != var212, var213);
                }
                class100.method754(-86, var210, var212, var211);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 2) {
                class174.field3555 = class172.field3441.method236(0);
                class148.method1014((byte) 92, class174.field3555);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 252) {
                for (int var214 = 0; var214 < class51.field1154.length; var214++) {
                    if (class51.field1154[var214] != null) {
                        class51.field1154[var214].field1610 = -1;
                    }
                }
                for (int var215 = 0; var215 < class204.field4058.length; var215++) {
                    if (class204.field4058[var215] != null) {
                        class204.field4058[var215].field1610 = -1;
                    }
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 144) {
                int var216 = class172.field3441.method240(8);
                int var217 = class172.field3441.method256((byte) -78);
                if (var216 < -70000) {
                    var217 += 32768;
                }
                class55 var218;
                if (var216 < 0) {
                    var218 = null;
                } else {
                    var218 = class131.method903(609074640, var216);
                }
                if (var218 != null) {
                    for (int var219 = 0; var219 < var218.field1316.length; var219++) {
                        var218.field1316[var219] = 0;
                        var218.field1242[var219] = 0;
                    }
                }
                class19.method170(-26325, var217);
                int var220 = class172.field3441.method256((byte) -78);
                for (int var221 = 0; var221 < var220; var221++) {
                    int var222 = class172.field3441.method221(-96);
                    if (var222 == 255) {
                        var222 = class172.field3441.method231(65280);
                    }
                    int var223 = class172.field3441.method238((byte) 43);
                    if (var218 != null && var221 < var218.field1316.length) {
                        var218.field1316[var221] = var223;
                        var218.field1242[var221] = var222;
                    }
                    class25.method213(var223 - 1, var222, var221, var217, true);
                }
                if (var218 != null) {
                    class137.method937(var218, (byte) -85);
                }
                method1110((byte) 82);
                class105.field2347[class208.method1372(class65.field1547++, 31)] = class208.method1372(var217, 32767);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 82) {
                class35 var224 = class172.field3441.method236(0);
                int var225 = class172.field3441.method231(65280);
                class55 var226 = class131.method903(609074640, var225);
                if (!var224.method332(18732, var226.field1335)) {
                    var226.field1335 = var224;
                    class137.method937(var226, (byte) -85);
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 173) {
                long var227 = class172.field3441.method230((byte) 100);
                class172.field3441.method225((byte) -105);
                long var229 = class172.field3441.method230((byte) 100);
                long var231 = (long) class172.field3441.method256((byte) -78);
                long var233 = (long) class172.field3441.method232(75);
                long var235 = (var231 << 32) + var233;
                boolean var237 = false;
                int var238 = class172.field3441.method221(-112);
                for (int var239 = 0; var239 < 100; var239++) {
                    if (class30.field600[var239] == var235) {
                        var237 = true;
                        break;
                    }
                }
                if (var238 <= 1) {
                    for (int var240 = 0; var240 < class136.field2912; var240++) {
                        if (class5.field82[var240] == var227) {
                            var237 = true;
                            break;
                        }
                    }
                }
                if (!var237 && class55.field1283 == 0) {
                    class30.field600[class14.field263] = var235;
                    class14.field263 = (class14.field263 + 1) % 100;
                    class35 var241 = class199.method1309(class110.method808(class172.field3441, 7485).method357((byte) 98));
                    if (var238 == 2 || var238 == 3) {
                        class148.method1009(var241, (byte) -4, class63.method529(new class35[] { class99.field2172, class49.method436(var227, false).method346(74) }, (byte) 53), class49.method436(var229, false).method346(70), 9);
                    } else if (var238 == 1) {
                        class148.method1009(var241, (byte) -4, class63.method529(new class35[] { class46.field985, class49.method436(var227, false).method346(105) }, (byte) 108), class49.method436(var229, false).method346(89), 9);
                    } else {
                        class148.method1009(var241, (byte) -4, class49.method436(var227, false).method346(115), class49.method436(var229, false).method346(61), 9);
                    }
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 175) {
                class120.field2641 = class172.field3441.method252(255);
                class13.field241 = class172.field3441.method214((byte) -98);
                while (class172.field3441.field527 < class101.field2224) {
                    class207.field4121 = class172.field3441.method221(-89);
                    class95.method729(false);
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 60) {
                int var242 = class172.field3441.method238((byte) 56);
                int var243 = class172.field3441.method256((byte) -78);
                class116.field2593 = var242;
                class207.field4121 = -1;
                class55.field1246 = var243;
                return true;
            }
            if (class207.field4121 == 195) {
                class45.method407(-48, true);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 225) {
                long var244 = class172.field3441.method230((byte) 100);
                class35 var246 = class199.method1309(class110.method808(class172.field3441, 7485).method357((byte) 99));
                class190.method1252(class49.method436(var244, false).method346(107), 0, var246, 6);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 141) {
                int var247 = class172.field3441.method240(8);
                class195 var248 = (class195) class22.field445.method796(true, (long) var247);
                if (var248 != null) {
                    class4.method27(-817150687, true, var248);
                }
                if (class101.field2218 != null) {
                    class137.method937(class101.field2218, (byte) -85);
                    class101.field2218 = null;
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 98) {
                class100.method750((byte) 124);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 48) {
                int var249 = class172.field3441.method256((byte) -78);
                int var250 = var249 >> 10 & 0x1F;
                int var251 = class172.field3441.method266(-1330);
                int var252 = var249 >> 5 & 0x1F;
                class55 var253 = class131.method903(609074640, var251);
                int var254 = var249 & 0x1F;
                int var255 = (var250 << 19) + (var252 << 11) + (var254 << 3);
                if (var253.field1287 != var255) {
                    var253.field1287 = var255;
                    class137.method937(var253, (byte) -85);
                }
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 109) {
                class91.field2034 = class172.field3441.method221(-116);
                class134.field2868 = class172.field3441.method221(-98);
                class150.field3128 = class172.field3441.method221(-81);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 235 || class207.field4121 == 97 || class207.field4121 == 170 || class207.field4121 == 130 || class207.field4121 == 84 || class207.field4121 == 148 || class207.field4121 == 200 || class207.field4121 == 32 || class207.field4121 == 206 || class207.field4121 == 232 || class207.field4121 == 85) {
                class95.method729(false);
                class207.field4121 = -1;
                return true;
            }
            if (class207.field4121 == 164) {
                class2.field29 = true;
                class101.field2223 = class172.field3441.method221(-83);
                class173.field3470 = class172.field3441.method221(-117);
                class182.field3736 = class172.field3441.method256((byte) -78);
                class96.field2118 = class172.field3441.method221(-115);
                class22.field457 = class172.field3441.method221(-82);
                if (class22.field457 >= 100) {
                    int var256 = class101.field2223 * 128 + 64;
                    int var257 = class173.field3470 * 128 + 64;
                    int var258 = class73.method583(class175.field3585, var257, var256, (byte) 1) - class182.field3736;
                    int var259 = var256 - class26.field571;
                    int var260 = var258 - class51.field1150;
                    int var261 = var257 - class8.field122;
                    int var262 = (int) Math.sqrt((double) (var259 * var259 + var261 * var261));
                    class116.field2593 = (int) (Math.atan2((double) var260, (double) var262) * 325.949D) & 0x7FF;
                    class55.field1246 = (int) (-325.949D * Math.atan2((double) var259, (double) var261)) & 0x7FF;
                    if (class116.field2593 < 128) {
                        class116.field2593 = 128;
                    }
                    if (class116.field2593 > 383) {
                        class116.field2593 = 383;
                    }
                }
                class207.field4121 = -1;
                return true;
            }
            class173.method1145((byte) -65, "T1 - " + class207.field4121 + "," + class113.field2532 + "," + class13.field231 + " - " + class101.field2224, null);
            class50.method448(true);
        } catch (IOException var266) {
            class55.method490(19845);
        } catch (Exception var267) {
            String var264 = "T2 - " + class207.field4121 + "," + class113.field2532 + "," + class13.field231 + " - " + class101.field2224 + "," + (class71.field1704.field1603[0] + class172.field3444) + "," + (class71.field1704.field1605[0] + class67.field1552) + " - ";
            for (int var265 = 0; class101.field2224 > var265 && var265 < 50; var265++) {
                var264 = var264 + class172.field3441.field529[var265] + ",";
            }
            class173.method1145((byte) -65, var264, var267);
            class50.method448(true);
        }
        return true;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IBIILjava/awt/Graphics;I)V")
    public abstract void method363(int arg0, byte arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZILjava/awt/Graphics;I)V")
    public abstract void method359(boolean arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
    public abstract void method360(Component arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Ljc;")
    public static final class92 method1109(int arg0, int arg1) {
        if (arg1 != -27120) {
            return null;
        }
        field3397++;
        class92 var2 = (class92) class121.field2659.method817(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class130.field2789.method39(4, -1, arg0);
        class92 var4 = new class92();
        if (var3 != null) {
            var4.method674(arg0, new class26(var3), true);
        }
        class121.field2659.method816(var4, (long) arg0, arg1 ^ 0xFFFF9600);
        return var4;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static final void method1110(byte arg0) {
        for (class195 var1 = (class195) class22.field445.method790(arg0 - 204); var1 != null; var1 = (class195) class22.field445.method794((byte) 90)) {
            int var2 = var1.field3884;
            if (class193.method1261((byte) 111, var2)) {
                boolean var3 = true;
                class55[] var4 = class163.field3299[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field1291;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2416;
                    class55 var7 = class131.method903(609074640, var6);
                    if (var7 != null) {
                        class137.method937(var7, (byte) -85);
                    }
                }
            }
        }
        field3405++;
        if (arg0 != 82) {
            field3407 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
    public final void method1111(byte arg0) {
        class140.method972(this.field3408, this.field3402, this.field3404);
        field3409++;
        if (arg0 <= 9) {
            this.field3408 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public static void method1112(int arg0) {
        field3400 = null;
        field3396 = null;
        field3403 = null;
        field3392 = null;
        field3393 = null;
        field3407 = null;
        if (arg0 != -23835) {
            method1110((byte) 75);
        }
        field3394 = null;
        field3398 = null;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    protected class170() {
    }
}
