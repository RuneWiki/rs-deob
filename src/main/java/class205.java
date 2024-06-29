import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class205 {

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3399 = 0;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Lpe;")
    public static class100 field3395 = new class100(32);

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Lij;")
    public static class50 field3402 = class78.method578(123, "floorshadows");

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Lij;")
    public static class50 field3403 = class78.method578(121, "::");

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field3404 = 0;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Lij;")
    private static class50 field3405 = class78.method578(124, "scroll:");

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Lij;")
    public static class50 field3401 = field3405;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Z")
    public static boolean field3406 = false;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "Lij;")
    public static class50 field3408 = field3405;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)Z")
    public static final boolean method1382(int arg0) throws IOException {
        field3397++;
        if (class148.field2547 == null) {
            return false;
        }
        int var1 = class148.field2547.method631((byte) -35);
        if (var1 == 0) {
            return false;
        }
        if (class213.field3523 == -1) {
            class148.field2547.method633(false, class119.field2109.field3633, 0, 1);
            var1--;
            class119.field2109.field3581 = 0;
            class213.field3523 = class119.field2109.method1599(arg0 - 109);
            class20.field428 = class176.field2951[class213.field3523];
        }
        if (class20.field428 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class148.field2547.method633(false, class119.field2109.field3633, 0, 1);
            var1--;
            class20.field428 = class119.field2109.field3633[0] & 0xFF;
        }
        if (class20.field428 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class148.field2547.method633(false, class119.field2109.field3633, 0, 2);
            class119.field2109.field3581 = 0;
            class20.field428 = class119.field2109.method1441(84);
        }
        if (var1 < class20.field428) {
            return false;
        }
        class119.field2109.field3581 = 0;
        class148.field2547.method633(false, class119.field2109.field3633, 0, class20.field428);
        class87.field1688 = class99.field1827;
        class10.field204 = arg0;
        class99.field1827 = class137.field2381;
        class137.field2381 = class213.field3523;
        if (class213.field3523 == 109) {
            int var2 = class119.field2109.method1441(arg0 - 72);
            int var3 = class119.field2109.method1486(arg0 + 74);
            class16.method125(65535, var2, var3);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 204) {
            byte var4 = class119.field2109.method1442(-120);
            int var5 = class119.field2109.method1490((byte) -118);
            class197.method1328(~arg0, var5, var4);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 66) {
            class90.method703(12);
            class224.field3766 = class119.field2109.method1487(255);
            class213.field3523 = -1;
            class255.field4399 = class217.field3649;
            return true;
        } else if (class213.field3523 == 63) {
            int var6 = class119.field2109.method1462(-110);
            int var7 = class119.field2109.method1486(46);
            int var8 = class119.field2109.method1486(arg0 + 96);
            class201.field3312 = var6 >> 1;
            class239.field4067.method1609((var6 & 0x1) == 1, arg0 - 114, var7, var8);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 110) {
            int var9 = class119.field2109.method1441(-20);
            if (var9 == 65535) {
                var9 = -1;
            }
            int var10 = class119.field2109.method1462(arg0 ^ 0xFFFFFFA2);
            int var11 = var10 >> 2;
            int var12 = var10 & 0x3;
            int var13 = class142.field2496[var11];
            int var14 = class119.field2109.method1454(32);
            int var15 = (var14 & 0x3B655C70) >> 28;
            int var16 = var14 >> 14 & 0x3FFF;
            int var17 = var16 - class61.field1124;
            int var18 = var14 & 0x3FFF;
            int var19 = var18 - class254.field4394;
            class42.method316(arg0 ^ 0x7B, var15, var11, var12, var17, var9, var19, var13);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 219) {
            class213.field3523 = -1;
            class259.field4512 = 0;
            return true;
        } else if (class213.field3523 == 61) {
            int var20 = class119.field2109.method1487(255);
            class50 var21 = class119.field2109.method1469((byte) -88);
            int var22 = class119.field2109.method1448((byte) -2);
            if (var20 >= 1 && var20 <= 8) {
                if (var21.method387(class184.field3025, true)) {
                    var21 = null;
                }
                class99.field1830[var20 - 1] = var21;
                class32.field637[var20 - 1] = var22 == 0;
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 183) {
            int var23 = class119.field2109.method1465((byte) -112);
            if (var23 == 65535) {
                var23 = -1;
            }
            class139.method970(var23, (byte) 40);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 239) {
            int var24 = class119.field2109.method1455((byte) -120);
            int var25 = class119.field2109.method1490((byte) -118);
            if (var25 == 65535) {
                var25 = -1;
            }
            class239.method1626(var25, var24, 104);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 166) {
            int var26 = class119.field2109.method1441(arg0 - 21);
            int var27 = class119.field2109.method1450((byte) 115);
            int var28 = class119.field2109.method1490((byte) -118);
            class10 var29 = class89.method698(var27, (byte) 94);
            class213.field3523 = -1;
            var29.field165 = (var26 << 16) + var28;
            return true;
        } else if (class213.field3523 == 92) {
            int var30 = class119.field2109.method1477((byte) 70);
            class6.field71 = class186.field3058.method959((byte) 95, var30);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 233) {
            int var31 = class119.field2109.method1466((byte) -15);
            int var32 = class119.field2109.method1441(-30);
            if (var32 == 65535) {
                var32 = -1;
            }
            class10 var33 = class89.method698(var31, (byte) 94);
            if (var33.field232 != 2 || var33.field159 != var32) {
                var33.field159 = var32;
                var33.field232 = 2;
                class140.method979((byte) 35, var33);
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 177) {
            class255.method1722(-128);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 207) {
            class256.field4452 = class217.field3649;
            long var34 = class119.field2109.method1443(41);
            if (var34 == 0L) {
                class213.field3523 = -1;
                class219.field3662 = null;
                class82.field1482 = 0;
                class140.field2442 = null;
                class261.field4545 = null;
                return true;
            }
            long var36 = class119.field2109.method1443(-73);
            class261.field4545 = class223.method1533((byte) -30, var36);
            class219.field3662 = class223.method1533((byte) -30, var34);
            class95.field1774 = class119.field2109.method1444((byte) -59);
            int var38 = class119.field2109.method1487(255);
            if (var38 == 255) {
                class213.field3523 = -1;
                return true;
            }
            class82.field1482 = var38;
            class66[] var39 = new class66[100];
            for (int var40 = 0; var40 < class82.field1482; var40++) {
                var39[var40] = new class66();
                var39[var40].field635 = class119.field2109.method1443(107);
                var39[var40].field1265 = class223.method1533((byte) -30, var39[var40].field635);
                var39[var40].field1258 = class119.field2109.method1441(arg0 - 72);
                var39[var40].field1268 = class119.field2109.method1444((byte) -97);
                var39[var40].field1267 = class119.field2109.method1469((byte) -128);
                if (class132.field2308 == var39[var40].field635) {
                    class114.field1995 = var39[var40].field1268;
                }
            }
            boolean var41 = false;
            int var42 = class82.field1482;
            while (var42 > 0) {
                boolean var43 = true;
                var42--;
                for (int var44 = 0; var44 < var42; var44++) {
                    if (var39[var44].field1265.method394(var39[var44 + 1].field1265, (byte) 37) > 0) {
                        var43 = false;
                        class66 var45 = var39[var44];
                        var39[var44] = var39[var44 + 1];
                        var39[var44 + 1] = var45;
                    }
                }
                if (var43) {
                    break;
                }
            }
            class140.field2442 = var39;
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 113) {
            class178.field2974 = class119.field2109.method1487(255);
            class184.field3023 = class217.field3649;
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 246) {
            int var46 = class119.field2109.method1473(false);
            int var47 = class119.field2109.method1450((byte) 126);
            class10 var48 = class89.method698(var47, (byte) 94);
            if (var48.field200 != var46 || var46 == -1) {
                var48.field301 = 0;
                var48.field200 = var46;
                var48.field237 = 0;
                class140.method979((byte) 17, var48);
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 252) {
            int var49 = class119.field2109.method1487(255);
            int var50 = class119.field2109.method1487(255);
            int var51 = class119.field2109.method1487(255);
            int var52 = class119.field2109.method1487(255);
            int var53 = class119.field2109.method1441(arg0 ^ 0x46);
            class144.field2515[var49] = true;
            class126.field2214[var49] = var50;
            class192.field3190[var49] = var51;
            class49.field877[var49] = var52;
            class85.field1644[var49] = var53;
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 21) {
            int var54 = class119.field2109.method1454(arg0 ^ 0x20);
            class50 var55 = class119.field2109.method1469((byte) -114);
            class10 var56 = class89.method698(var54, (byte) 94);
            if (!var55.method367(var56.field137, 1)) {
                var56.field137 = var55;
                class140.method979((byte) 99, var56);
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 158) {
            class90.method703(12);
            int var57 = class119.field2109.method1462(-103);
            int var58 = class119.field2109.method1462(-107);
            int var59 = class119.field2109.method1454(arg0 ^ 0x20);
            class86.field1662[var57] = var59;
            class190.field3154[var57] = var58;
            class83.field1542[var57] = 1;
            for (int var60 = 0; var60 < 98; var60++) {
                if (var59 >= class69.field1292[var60]) {
                    class83.field1542[var57] = var60 + 2;
                }
            }
            class61.field1128[class51.method413(class41.field763++, 31)] = var57;
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 90) {
            int var61 = class119.field2109.method1490((byte) -118);
            int var62 = class119.field2109.method1465((byte) -112);
            int var63 = class119.field2109.method1448((byte) -2);
            class53 var64 = class41.field764[var61];
            if (var64 != null) {
                class35.method280(var63, var62, var64, false);
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 132) {
            class101.method773(class20.field428, class119.field2109, (byte) -100, class186.field3058);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 214) {
            int var65 = class119.field2109.method1490((byte) -118);
            int var66 = class119.field2109.method1441(111);
            int var67 = class119.field2109.method1454(32);
            int var68 = class119.field2109.method1441(-123);
            class10 var69 = class89.method698(var67, (byte) 94);
            if (var69.field183 != var68 || var69.field276 != var65 || var69.field218 != var66) {
                var69.field183 = var68;
                var69.field276 = var65;
                var69.field218 = var66;
                class140.method979((byte) 40, var69);
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 241) {
            int var70 = class119.field2109.method1487(255);
            class141 var71 = new class141();
            var71.field2474 = var70 & 0x3F;
            int var72 = var70 >> 6;
            var71.field2465 = class119.field2109.method1487(255);
            if (var71.field2465 >= 0 && class119.field2112.length > var71.field2465) {
                if (var71.field2474 == 1 || var71.field2474 == 10) {
                    var71.field2471 = class119.field2109.method1441(105);
                    class119.field2109.field3581 += 3;
                } else if (var71.field2474 >= 2 && var71.field2474 <= 6) {
                    if (var71.field2474 == 2) {
                        var71.field2464 = 64;
                        var71.field2479 = 64;
                    }
                    if (var71.field2474 == 3) {
                        var71.field2479 = 64;
                        var71.field2464 = 0;
                    }
                    if (var71.field2474 == 4) {
                        var71.field2479 = 64;
                        var71.field2464 = 128;
                    }
                    if (var71.field2474 == 5) {
                        var71.field2464 = 64;
                        var71.field2479 = 0;
                    }
                    if (var71.field2474 == 6) {
                        var71.field2464 = 64;
                        var71.field2479 = 128;
                    }
                    var71.field2474 = 2;
                    var71.field2463 = class119.field2109.method1441(arg0 ^ 0x49);
                    var71.field2473 = class119.field2109.method1441(106);
                    var71.field2469 = class119.field2109.method1487(255);
                }
                var71.field2472 = class119.field2109.method1441(arg0 ^ 0x4D);
                if (var71.field2472 == 65535) {
                    var71.field2472 = -1;
                }
                class36.field707[var72] = var71;
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 35) {
            class162.field2773 = class119.field2109.method1448((byte) -2);
            class154.field2691 = class119.field2109.method1448((byte) -2);
            while (class20.field428 > class119.field2109.field3581) {
                class213.field3523 = class119.field2109.method1487(255);
                class16.method122(arg0 ^ 0x64C4);
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 138) {
            class50 var73 = class119.field2109.method1469((byte) -116);
            if (var73.method403(-9, class255.field4413)) {
                class50 var74 = var73.method363(0, var73.method390(class52.field949, arg0 - 1), arg0);
                long var75 = var74.method368((byte) -103);
                boolean var77 = false;
                for (int var78 = 0; var78 < class73.field1379; var78++) {
                    if (class227.field3823[var78] == var75) {
                        var77 = true;
                        break;
                    }
                }
                if (!var77 && class64.field1222 == 0) {
                    class54.method431(class18.field385, 4, arg0, var74);
                }
            } else if (var73.method403(-77, class151.field2621)) {
                class50 var79 = var73.method363(0, var73.method390(class52.field949, -1), 0);
                boolean var80 = false;
                long var81 = var79.method368((byte) -103);
                for (int var83 = 0; var83 < class73.field1379; var83++) {
                    if (class227.field3823[var83] == var81) {
                        var80 = true;
                        break;
                    }
                }
                if (!var80 && class64.field1222 == 0) {
                    class50 var84 = var73.method363(var73.method390(class52.field949, -1) + 1, var73.method396(1) - 9, 0);
                    class54.method431(var84, 8, 0, var79);
                }
            } else if (var73.method403(-73, class140.field2436)) {
                class50 var103 = var73.method363(0, var73.method390(class52.field949, arg0 - 1), 0);
                boolean var104 = false;
                long var105 = var103.method368((byte) -103);
                for (int var107 = 0; var107 < class73.field1379; var107++) {
                    if (class227.field3823[var107] == var105) {
                        var104 = true;
                        break;
                    }
                }
                if (!var104 && class64.field1222 == 0) {
                    class54.method431(class245.field4271, 10, arg0, var103);
                }
            } else if (var73.method403(arg0 - 70, class194.field3219)) {
                class50 var102 = var73.method363(0, var73.method390(class194.field3219, -1), 0);
                class54.method431(var102, 11, arg0, class245.field4271);
            } else if (var73.method403(-51, class58.field1045)) {
                class50 var101 = var73.method363(0, var73.method390(class58.field1045, -1), 0);
                if (class64.field1222 == 0) {
                    class54.method431(var101, 12, 0, class245.field4271);
                }
            } else if (var73.method403(-13, class126.field2213)) {
                class50 var85 = var73.method363(0, var73.method390(class126.field2213, -1), 0);
                if (class64.field1222 == 0) {
                    class54.method431(var85, 13, 0, class245.field4271);
                }
            } else if (var73.method403(arg0 ^ 0xFFFFFFAF, class208.field3449)) {
                class50 var96 = var73.method363(0, var73.method390(class52.field949, ~arg0), arg0);
                long var97 = var96.method368((byte) -103);
                boolean var99 = false;
                for (int var100 = 0; var100 < class73.field1379; var100++) {
                    if (class227.field3823[var100] == var97) {
                        var99 = true;
                        break;
                    }
                }
                if (!var99 && class64.field1222 == 0) {
                    class54.method431(class245.field4271, 14, 0, var96);
                }
            } else if (var73.method403(-109, class62.field1175)) {
                class50 var86 = var73.method363(0, var73.method390(class52.field949, -1), 0);
                long var87 = var86.method368((byte) -103);
                boolean var89 = false;
                for (int var90 = 0; var90 < class73.field1379; var90++) {
                    if (class227.field3823[var90] == var87) {
                        var89 = true;
                        break;
                    }
                }
                if (!var89 && class64.field1222 == 0) {
                    class54.method431(class245.field4271, 15, 0, var86);
                }
            } else if (var73.method403(-112, class192.field3197)) {
                boolean var91 = false;
                class50 var92 = var73.method363(0, var73.method390(class52.field949, -1), 0);
                long var93 = var92.method368((byte) -103);
                for (int var95 = 0; var95 < class73.field1379; var95++) {
                    if (class227.field3823[var95] == var93) {
                        var91 = true;
                        break;
                    }
                }
                if (!var91 && class64.field1222 == 0) {
                    class54.method431(class245.field4271, 16, 0, var92);
                }
            } else {
                class54.method431(var73, 0, 0, class245.field4271);
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 43) {
            class90.method703(arg0 + 12);
            class191.field3171 = class119.field2109.method1438(arg0 - 123);
            class255.field4399 = class217.field3649;
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 220) {
            long var108 = class119.field2109.method1443(-84);
            int var110 = class119.field2109.method1441(arg0 - 108);
            int var111 = class119.field2109.method1487(arg0 + 255);
            class50 var112 = class245.field4271;
            if (var110 > 0) {
                var112 = class119.field2109.method1469((byte) -115);
            }
            boolean var113 = true;
            if (var108 < 0L) {
                var113 = false;
                var108 &= Long.MAX_VALUE;
            }
            class50 var114 = class223.method1533((byte) -30, var108).method375(true);
            for (int var115 = 0; var115 < class227.field3830; var115++) {
                if (class59.field1070[var115] == var108) {
                    if (class141.field2477[var115] != var110) {
                        class141.field2477[var115] = var110;
                        if (var110 > 0) {
                            class54.method431(class80.method589(new class50[] { var114, class2.field31 }, 28743), 5, arg0, class245.field4271);
                        }
                        if (var110 == 0) {
                            class54.method431(class80.method589(new class50[] { var114, class76.field1439 }, 28743), 5, 0, class245.field4271);
                        }
                    }
                    var114 = null;
                    class224.field3764[var115] = var112;
                    class216.field3567[var115] = var111;
                    class196.field3251[var115] = var113;
                    break;
                }
            }
            if (var114 != null && class227.field3830 < 200) {
                class59.field1070[class227.field3830] = var108;
                class208.field3452[class227.field3830] = var114;
                class141.field2477[class227.field3830] = var110;
                class224.field3764[class227.field3830] = var112;
                class216.field3567[class227.field3830] = var111;
                class196.field3251[class227.field3830] = var113;
                class227.field3830++;
            }
            boolean var116 = false;
            class184.field3023 = class217.field3649;
            int var117 = class227.field3830;
            while (var117 > 0) {
                boolean var118 = true;
                var117--;
                for (int var119 = 0; var119 < var117; var119++) {
                    if (class141.field2477[var119] != class14.field332 && class141.field2477[var119 + 1] == class14.field332 || class141.field2477[var119] == 0 && class141.field2477[var119 + 1] != 0) {
                        var118 = false;
                        int var120 = class141.field2477[var119];
                        class141.field2477[var119] = class141.field2477[var119 + 1];
                        class141.field2477[var119 + 1] = var120;
                        class50 var121 = class224.field3764[var119];
                        class224.field3764[var119] = class224.field3764[var119 + 1];
                        class224.field3764[var119 + 1] = var121;
                        class50 var122 = class208.field3452[var119];
                        class208.field3452[var119] = class208.field3452[var119 + 1];
                        class208.field3452[var119 + 1] = var122;
                        long var123 = class59.field1070[var119];
                        class59.field1070[var119] = class59.field1070[var119 + 1];
                        class59.field1070[var119 + 1] = var123;
                        int var125 = class216.field3567[var119];
                        class216.field3567[var119] = class216.field3567[var119 + 1];
                        class216.field3567[var119 + 1] = var125;
                        boolean var126 = class196.field3251[var119];
                        class196.field3251[var119] = class196.field3251[var119 + 1];
                        class196.field3251[var119 + 1] = var126;
                    }
                }
                if (var118) {
                    break;
                }
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 169) {
            long var127 = class119.field2109.method1443(-74);
            class50 var129 = class152.method1057(class239.method1617(2000, class119.field2109).method405(arg0 + 13829));
            class54.method431(var129, 6, arg0, class223.method1533((byte) -30, var127).method375(true));
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 163) {
            class34.field668 = class119.field2109.method1487(255);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 60) {
            int var130 = class119.field2109.method1465((byte) -112);
            int var131 = class119.field2109.method1450((byte) 108);
            if (var130 == 65535) {
                var130 = -1;
            }
            class10 var132 = class89.method698(var131, (byte) 94);
            if (var132.field232 != 1 || var132.field159 != var130) {
                var132.field232 = 1;
                var132.field159 = var130;
                class140.method979((byte) 80, var132);
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 215) {
            long var133 = class119.field2109.method1443(31);
            boolean var135 = false;
            class119.field2109.method1444((byte) -94);
            long var136 = class119.field2109.method1443(66);
            long var138 = (long) class119.field2109.method1441(68);
            long var140 = (long) class119.field2109.method1447(arg0 ^ 0xFFFFFFD3);
            int var142 = class119.field2109.method1487(arg0 ^ 0xFF);
            long var143 = (var138 << 32) + var140;
            int var145 = 0;
            label1182: while (true) {
                if (var145 >= 100) {
                    if (var142 <= 1) {
                        if (class255.field4403 == 1 || class66.field1262 == 1) {
                            var135 = true;
                        } else {
                            for (int var146 = 0; var146 < class73.field1379; var146++) {
                                if (class227.field3823[var146] == var133) {
                                    var135 = true;
                                    break label1182;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class18.field394[var145] == var143) {
                    var135 = true;
                    break;
                }
                var145++;
            }
            if (!var135 && class64.field1222 == 0) {
                class18.field394[class68.field1283] = var143;
                class68.field1283 = (class68.field1283 + 1) % 100;
                class50 var147 = class152.method1057(class239.method1617(2000, class119.field2109).method405(13829));
                if (var142 == 2 || var142 == 3) {
                    class127.method908(9, var147, (byte) 126, class223.method1533((byte) -30, var136).method375(true), class80.method589(new class50[] { class116.field2021, class223.method1533((byte) -30, var133).method375(true) }, 28743));
                } else if (var142 == 1) {
                    class127.method908(9, var147, (byte) 126, class223.method1533((byte) -30, var136).method375(true), class80.method589(new class50[] { class195.field3244, class223.method1533((byte) -30, var133).method375(true) }, arg0 ^ 0x7047));
                } else {
                    class127.method908(9, var147, (byte) 126, class223.method1533((byte) -30, var136).method375(true), class223.method1533((byte) -30, var133).method375(true));
                }
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 40) {
            int var148 = class119.field2109.method1462(arg0 ^ 0xFFFFFF90);
            int var149 = class119.field2109.method1483(26293);
            if (var148 == 2) {
                class90.method704((byte) -127);
            }
            class48.field871 = var149;
            class19.method141(var149, 0);
            class207.method1393(0, false);
            class117.method847(class48.field871, (byte) -76);
            for (int var150 = 0; var150 < 100; var150++) {
                class210.field3492[var150] = true;
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 69) {
            class223.method1530((byte) -121);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 41) {
            class182.method1236(class119.field2109, (byte) 78);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 98) {
            class176.method1211(false, true);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 3) {
            class100.method767(false, class119.field2109.method1469((byte) -118));
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 150) {
            class154.field2691 = class119.field2109.method1486(56);
            class162.field2773 = class119.field2109.method1448((byte) -2);
            for (int var151 = class154.field2691; var151 < (class154.field2691 + 8); var151++) {
                for (int var153 = class162.field2773; var153 < class162.field2773 + 8; var153++) {
                    if (class184.field3022[class201.field3312][var151][var153] != null) {
                        class184.field3022[class201.field3312][var151][var153] = null;
                        class1.method2(var151, (byte) -35, var153);
                    }
                }
            }
            for (class203 var152 = (class203) class227.field3824.method689(1001); var152 != null; var152 = (class203) class227.field3824.method688(-100)) {
                if (var152.field3366 >= class154.field2691 && var152.field3366 < class154.field2691 + 8 && var152.field3373 >= class162.field2773 && var152.field3373 < class162.field2773 + 8 && class201.field3312 == var152.field3376) {
                    var152.field3385 = 0;
                }
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 248) {
            if (class20.field428 == 0) {
                class39.field725 = class210.field3476;
            } else {
                class39.field725 = class119.field2109.method1469((byte) -86);
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 26) {
            byte[] var154 = new byte[class20.field428];
            class119.field2109.method1595(class20.field428, var154, -53, 0);
            class215.method1426(true, class2.method7(0, class20.field428, -15075, var154), (byte) 85);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 145) {
            int var155 = class119.field2109.method1487(255);
            if (class119.field2109.method1487(arg0 + 255) == 0) {
                class19.field402[var155] = new class95();
            } else {
                class119.field2109.field3581--;
                class19.field402[var155] = new class95(class119.field2109);
            }
            class241.field4136 = class217.field3649;
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 133) {
            int var156 = class119.field2109.method1486(90);
            int var157 = class119.field2109.method1465((byte) -112);
            int var158 = class119.field2109.method1483(26293);
            class252.method1706((byte) 102, var158);
            client.method610(var157, var156, arg0);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 73) {
            long var159 = class119.field2109.method1443(-110);
            long var161 = (long) class119.field2109.method1441(112);
            long var163 = (long) class119.field2109.method1447(127);
            long var165 = (var161 << 32) + var163;
            boolean var167 = false;
            int var168 = class119.field2109.method1487(arg0 ^ 0xFF);
            int var169 = class119.field2109.method1441(-58);
            int var170 = 0;
            label1218: while (true) {
                if (var170 >= 100) {
                    if (var168 <= 1) {
                        for (int var171 = 0; var171 < class73.field1379; var171++) {
                            if (class227.field3823[var171] == var159) {
                                var167 = true;
                                break label1218;
                            }
                        }
                    }
                    break;
                }
                if (class18.field394[var170] == var165) {
                    var167 = true;
                    break;
                }
                var170++;
            }
            if (!var167 && class64.field1222 == 0) {
                class18.field394[class68.field1283] = var165;
                class68.field1283 = (class68.field1283 + 1) % 100;
                class50 var172 = class260.method1751(-80, var169).method1295(-31800, class119.field2109);
                if (var168 == 2) {
                    class18.method137(var169, class80.method589(new class50[] { class116.field2021, class223.method1533((byte) -30, var159).method375(true) }, 28743), 18, -1, var172, (class50) null);
                } else if (var168 == 1) {
                    class18.method137(var169, class80.method589(new class50[] { class195.field3244, class223.method1533((byte) -30, var159).method375(true) }, arg0 + 28743), 18, -1, var172, (class50) null);
                } else {
                    class18.method137(var169, class223.method1533((byte) -30, var159).method375(true), 18, -1, var172, (class50) null);
                }
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 56) {
            long var173 = class119.field2109.method1443(-74);
            boolean var175 = false;
            long var176 = (long) class119.field2109.method1441(78);
            long var178 = (long) class119.field2109.method1447(-68);
            long var180 = (var176 << 32) + var178;
            int var182 = class119.field2109.method1487(arg0 + 255);
            int var183 = 0;
            label1247: while (true) {
                if (var183 >= 100) {
                    if (var182 <= 1) {
                        if (class255.field4403 == 1 || class66.field1262 == 1) {
                            var175 = true;
                        } else {
                            for (int var184 = 0; var184 < class73.field1379; var184++) {
                                if (class227.field3823[var184] == var173) {
                                    var175 = true;
                                    break label1247;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class18.field394[var183] == var180) {
                    var175 = true;
                    break;
                }
                var183++;
            }
            if (!var175 && class64.field1222 == 0) {
                class18.field394[class68.field1283] = var180;
                class68.field1283 = (class68.field1283 + 1) % 100;
                class50 var185 = class152.method1057(class239.method1617(2000, class119.field2109).method405(13829));
                if (var182 == 2 || var182 == 3) {
                    class54.method431(var185, 7, 0, class80.method589(new class50[] { class116.field2021, class223.method1533((byte) -30, var173).method375(true) }, 28743));
                } else if (var182 == 1) {
                    class54.method431(var185, 7, 0, class80.method589(new class50[] { class195.field3244, class223.method1533((byte) -30, var173).method375(true) }, 28743));
                } else {
                    class54.method431(var185, 3, 0, class223.method1533((byte) -30, var173).method375(true));
                }
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 230) {
            class153.field2683 = class119.field2109.method1487(arg0 + 255);
            class21.field443 = class119.field2109.method1487(255);
            class36.field704 = class119.field2109.method1487(255);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 50) {
            for (int var186 = 0; var186 < class71.field1370.length; var186++) {
                if (class71.field1370[var186] != null) {
                    class71.field1370[var186].field4002 = -1;
                }
            }
            for (int var187 = 0; var187 < class41.field764.length; var187++) {
                if (class41.field764[var187] != null) {
                    class41.field764[var187].field4002 = -1;
                }
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 24) {
            int var188 = class119.field2109.method1466((byte) -15);
            int var189 = class119.field2109.method1441(90);
            if (var188 < -70000) {
                var189 += 32768;
            }
            class10 var190;
            if (var188 < 0) {
                var190 = null;
            } else {
                var190 = class89.method698(var188, (byte) 94);
            }
            while (class119.field2109.field3581 < class20.field428) {
                int var191 = class119.field2109.method1436(-97);
                int var192 = 0;
                int var193 = class119.field2109.method1441(90);
                if (var193 != 0) {
                    var192 = class119.field2109.method1487(255);
                    if (var192 == 255) {
                        var192 = class119.field2109.method1466((byte) -15);
                    }
                }
                if (var190 != null && var191 >= 0 && var191 < var190.field298.length) {
                    var190.field298[var191] = var193;
                    var190.field152[var191] = var192;
                }
                class214.method1424(var191, 1441, var192, var189, var193 - 1);
            }
            if (var190 != null) {
                class140.method979((byte) 90, var190);
            }
            class90.method703(12);
            class155.field2705[class51.method413(class124.field2172++, 31)] = class51.method413(var189, 32767);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 134) {
            int var194 = class119.field2109.method1477((byte) 80);
            int var195 = class119.field2109.method1466((byte) -15);
            int var196 = class119.field2109.method1483(26293);
            class10 var197 = class89.method698(var194, (byte) 94);
            if (var196 == 65535) {
                var196 = -1;
            }
            if (var197.field222) {
                var197.field205 = var195;
                var197.field300 = var196;
                class239 var199 = class15.method111(var196, false);
                var197.field172 = var199.field4107;
                var197.field218 = var199.field4049;
                if (var197.field290 > 0) {
                    var197.field218 = var197.field218 * 32 / var197.field290;
                } else if (var197.field229 > 0) {
                    var197.field218 = var197.field218 * 32 / var197.field229;
                }
                var197.field173 = var199.field4074;
                var197.field183 = var199.field4086;
                var197.field276 = var199.field4119;
                var197.field215 = var199.field4052;
                class140.method979((byte) 82, var197);
            } else if (var196 == -1) {
                var197.field232 = 0;
                class213.field3523 = -1;
                return true;
            } else {
                class239 var198 = class15.method111(var196, false);
                var197.field159 = var196;
                var197.field183 = var198.field4086;
                var197.field218 = var198.field4049 * 100 / var195;
                var197.field232 = 4;
                var197.field276 = var198.field4119;
                class140.method979((byte) 104, var197);
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 167) {
            int var200 = class119.field2109.method1465((byte) -112);
            int var201 = class119.field2109.method1477((byte) 53);
            int var202 = class119.field2109.method1441(-125);
            int var203 = class119.field2109.method1465((byte) -112);
            if ((var201 >> 30) != 0) {
                int var204 = (var201 & 0x329C157D) >> 28;
                int var205 = ((var201 & 0xFFFC7DE) >> 14) - class61.field1124;
                int var206 = (var201 & 0x3FFF) - class254.field4394;
                if (var205 >= 0 && var206 >= 0 && var205 < 104 && var206 < 104) {
                    int var207 = var206 * 128 + 64;
                    int var208 = var205 * 128 + 64;
                    class40 var209 = new class40(var200, var204, var208, var207, class187.method1260((byte) 61, var208, var207, var204) - var202, var203, class244.field4245);
                    class47.field860.method684(new class254(var209), (byte) 109);
                }
            } else if ((var201 >> 29) != 0) {
                int var210 = var201 & 0xFFFF;
                class53 var211 = class41.field764[var210];
                if (var211 != null) {
                    var211.field3973 = 0;
                    var211.field3966 = var200;
                    var211.field4014 = 0;
                    var211.field4025 = var202;
                    if (var211.field3966 == 65535) {
                        var211.field3966 = -1;
                    }
                    var211.field3997 = class244.field4245 + var203;
                    if (var211.field3997 > class244.field4245) {
                        var211.field3973 = -1;
                    }
                }
            } else if ((var201 >> 28) != 0) {
                int var212 = var201 & 0xFFFF;
                class187 var213;
                if (class240.field4124 == var212) {
                    var213 = class239.field4067;
                } else {
                    var213 = class71.field1370[var212];
                }
                if (var213 != null) {
                    var213.field4014 = 0;
                    var213.field3997 = class244.field4245 + var203;
                    var213.field3966 = var200;
                    var213.field4025 = var202;
                    var213.field3973 = 0;
                    if (var213.field3966 == 65535) {
                        var213.field3966 = -1;
                    }
                    if (var213.field3997 > class244.field4245) {
                        var213.field3973 = -1;
                    }
                }
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 17) {
            class163.method1141(0);
            class90.method703(arg0 + 12);
            class197.field3276 += 32;
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 187) {
            int var214 = class119.field2109.method1466((byte) -15);
            int var215 = class119.field2109.method1441(arg0 + 110);
            if (var214 < -70000) {
                var215 += 32768;
            }
            class10 var216;
            if (var214 < 0) {
                var216 = null;
            } else {
                var216 = class89.method698(var214, (byte) 94);
            }
            if (var216 != null) {
                for (int var217 = 0; var217 < var216.field298.length; var217++) {
                    var216.field298[var217] = 0;
                    var216.field152[var217] = 0;
                }
            }
            class70.method532(arg0 + 50, var215);
            int var218 = class119.field2109.method1441(-112);
            for (int var219 = 0; var219 < var218; var219++) {
                int var220 = class119.field2109.method1462(-114);
                if (var220 == 255) {
                    var220 = class119.field2109.method1450((byte) 119);
                }
                int var221 = class119.field2109.method1490((byte) -118);
                if (var216 != null && var219 < var216.field298.length) {
                    var216.field298[var219] = var221;
                    var216.field152[var219] = var220;
                }
                class214.method1424(var219, arg0 + 1441, var220, var215, var221 - 1);
            }
            if (var216 != null) {
                class140.method979((byte) 121, var216);
            }
            class90.method703(12);
            class155.field2705[class51.method413(31, class124.field2172++)] = class51.method413(var215, 32767);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 147) {
            int var222 = class119.field2109.method1466((byte) -15);
            int var223 = class119.field2109.method1441(-97);
            class16.method125(arg0 ^ 0xFFFF, var223, var222);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 130) {
            long var224 = class119.field2109.method1443(91);
            int var226 = class119.field2109.method1441(arg0 + 92);
            byte var227 = class119.field2109.method1444((byte) -35);
            boolean var228 = false;
            if ((var224 & Long.MIN_VALUE) != 0L) {
                var228 = true;
            }
            if (var228) {
                if (class82.field1482 == 0) {
                    class213.field3523 = -1;
                    return true;
                }
                long var229 = var224 & Long.MAX_VALUE;
                boolean var231 = false;
                int var232;
                for (var232 = 0; class82.field1482 > var232 && (class140.field2442[var232].field635 != var229 || class140.field2442[var232].field1258 != var226); var232++) {
                }
                if (var232 < class82.field1482) {
                    while ((class82.field1482 - 1) > var232) {
                        class140.field2442[var232] = class140.field2442[var232 + 1];
                        var232++;
                    }
                    class82.field1482--;
                    class140.field2442[class82.field1482] = null;
                }
            } else {
                class50 var233 = class119.field2109.method1469((byte) -110);
                class66 var234 = new class66();
                var234.field635 = var224;
                var234.field1265 = class223.method1533((byte) -30, var234.field635);
                var234.field1268 = var227;
                var234.field1258 = var226;
                var234.field1267 = var233;
                int var235;
                for (var235 = class82.field1482 - 1; var235 >= 0; var235--) {
                    int var236 = class140.field2442[var235].field1265.method394(var234.field1265, (byte) 37);
                    if (var236 == 0) {
                        class140.field2442[var235].field1258 = var226;
                        class140.field2442[var235].field1268 = var227;
                        class140.field2442[var235].field1267 = var233;
                        if (class132.field2308 == var224) {
                            class114.field1995 = var227;
                        }
                        class213.field3523 = -1;
                        class256.field4452 = class217.field3649;
                        return true;
                    }
                    if (var236 < 0) {
                        break;
                    }
                }
                if (class82.field1482 >= class140.field2442.length) {
                    class213.field3523 = -1;
                    return true;
                }
                for (int var237 = class82.field1482 - 1; var237 > var235; var237--) {
                    class140.field2442[var237 + 1] = class140.field2442[var237];
                }
                if (class82.field1482 == 0) {
                    class140.field2442 = new class66[100];
                }
                class140.field2442[var235 + 1] = var234;
                class82.field1482++;
                if (class132.field2308 == var224) {
                    class114.field1995 = var227;
                }
            }
            class256.field4452 = class217.field3649;
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 100) {
            class50 var238 = class119.field2109.method1469((byte) -115);
            Object[] var239 = new Object[var238.method396(1) + 1];
            for (int var240 = var238.method396(1) - 1; var240 >= 0; var240--) {
                if (var238.method393(var240, (byte) 123) == 115) {
                    var239[var240 + 1] = class119.field2109.method1469((byte) -117);
                } else {
                    var239[var240 + 1] = Integer.valueOf(class119.field2109.method1466((byte) -15));
                }
            }
            var239[0] = Integer.valueOf(class119.field2109.method1466((byte) -15));
            class93 var241 = new class93();
            var241.field1739 = var239;
            class214.method1422(var241, arg0 ^ 0xFFFFC4B3);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 232) {
            int var242 = class119.field2109.method1466((byte) -15);
            int var243 = class119.field2109.method1466((byte) -15);
            class87 var244 = (class87) class132.field2304.method443((long) var242, (byte) 83);
            class87 var245 = (class87) class132.field2304.method443((long) var243, (byte) 74);
            if (var245 != null) {
                class69.method529(var245, 105, var244 == null || var244.field1678 != var245.field1678);
            }
            if (var244 != null) {
                var244.method267(-101);
                class132.field2304.method445(arg0 ^ 0x6D, (long) var243, var244);
            }
            class10 var246 = class89.method698(var242, (byte) 94);
            if (var246 != null) {
                class140.method979((byte) 21, var246);
            }
            class10 var247 = class89.method698(var243, (byte) 94);
            if (var247 != null) {
                class140.method979((byte) 41, var247);
                class254.method1716(827759824, true, var247);
            }
            if (class48.field871 != -1) {
                class160.method1127(-17126, class48.field871, 1);
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 53) {
            boolean var248 = class119.field2109.method1486(110) == 1;
            int var249 = class119.field2109.method1466((byte) -15);
            class10 var250 = class89.method698(var249, (byte) 94);
            if (var250.field268 != var248) {
                var250.field268 = var248;
                class140.method979((byte) 117, var250);
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 126) {
            int var251 = class119.field2109.method1483(26293);
            class227.method1555(var251, arg0 ^ 0x2);
            class155.field2705[class51.method413(class124.field2172++, 31)] = class51.method413(var251, 32767);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 223) {
            int var252 = class119.field2109.method1450((byte) 109);
            int var253 = class119.field2109.method1465((byte) -112);
            int var254 = class119.field2109.method1441(arg0 ^ 0x7C);
            class252.method1706((byte) 103, var254);
            client.method610(var253, var252, arg0);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 127) {
            for (int var255 = 0; var255 < class54.field968.length; var255++) {
                if (class70.field1360[var255] != class54.field968[var255]) {
                    class54.field968[var255] = class70.field1360[var255];
                    class40.method308(var255, 0);
                    class10.field190[class51.method413(class197.field3276++, 31)] = var255;
                }
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 131) {
            int var256 = class119.field2109.method1441(-24);
            int var257 = class119.field2109.method1487(255);
            if (var256 == 65535) {
                var256 = -1;
            }
            int var258 = class119.field2109.method1441(-14);
            class244.method1667(var258, var257, (byte) -126, var256);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 96) {
            int var259 = class119.field2109.method1450((byte) 112);
            class10 var260 = class89.method698(var259, (byte) 94);
            var260.field232 = 3;
            var260.field159 = class239.field4067.field3092.method290((byte) -77);
            class140.method979((byte) 127, var260);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 159) {
            int var261 = class119.field2109.method1483(arg0 + 26293);
            int var262 = class119.field2109.method1466((byte) -15);
            class10 var263 = class89.method698(var262, (byte) 94);
            if (var263 != null && var263.field227 == 0) {
                if (var261 > var263.field292 - var263.field242) {
                    var261 = var263.field292 - var263.field242;
                }
                if (var261 < 0) {
                    var261 = 0;
                }
                if (var263.field239 != var261) {
                    var263.field239 = var261;
                    class140.method979((byte) 80, var263);
                }
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 201) {
            int var264 = class119.field2109.method1487(255);
            int var265 = class119.field2109.method1487(255);
            int var266 = class119.field2109.method1441(-72);
            int var267 = class119.field2109.method1487(255);
            int var268 = class119.field2109.method1487(arg0 + 255);
            class215.method1430(64, var265, var267, var268, var264, var266);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 152) {
            int var269 = class119.field2109.method1465((byte) -112);
            int var270 = class119.field2109.method1490((byte) -118);
            if (var269 == 65535) {
                var269 = -1;
            }
            int var271 = class119.field2109.method1477((byte) 97);
            int var272 = class119.field2109.method1466((byte) -15);
            if (var270 == 65535) {
                var270 = -1;
            }
            for (int var273 = var269; var273 <= var270; var273++) {
                long var274 = ((long) var271 << 32) + (long) var273;
                class32 var276 = class232.field3896.method443(var274, (byte) -34);
                if (var276 != null) {
                    var276.method267(-90);
                }
                class232.field3896.method445(121, var274, new class199(var272));
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 11) {
            if (class48.field871 != -1) {
                class160.method1127(-17126, class48.field871, 0);
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 102) {
            class73.field1379 = class20.field428 / 8;
            for (int var277 = 0; var277 < class73.field1379; var277++) {
                class227.field3823[var277] = class119.field2109.method1443(98);
                class20.field426[var277] = class223.method1533((byte) -30, class227.field3823[var277]);
            }
            class184.field3023 = class217.field3649;
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 84) {
            class228.method1556((byte) -114);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 128) {
            int var278 = class119.field2109.method1478((byte) 14);
            int var279 = class119.field2109.method1493(19);
            int var280 = class119.field2109.method1450((byte) 114);
            class10 var281 = class89.method698(var280, (byte) 94);
            var281.field272 = var281.field282 = var278;
            var281.field241 = var281.field260 = var279;
            var281.field182 = 0;
            var281.field278 = 0;
            class140.method979((byte) 121, var281);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 118) {
            int var282 = class119.field2109.method1487(arg0 ^ 0xFF);
            int var283 = class119.field2109.method1466((byte) -15);
            int var284 = class119.field2109.method1483(26293);
            class87 var285 = (class87) class132.field2304.method443((long) var283, (byte) -78);
            if (var285 != null) {
                class69.method529(var285, 105, var285.field1678 != var284);
            }
            class73.method551(var284, var283, var282, 1);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 227) {
            class50 var286 = class119.field2109.method1469((byte) -126);
            int var287 = class119.field2109.method1483(26293);
            int var288 = class119.field2109.method1483(26293);
            class252.method1706((byte) 110, var288);
            class146.method1028(var287, var286, true);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 171) {
            class162.field2773 = class119.field2109.method1462(-112);
            class154.field2691 = class119.field2109.method1487(255);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 112) {
            int var289 = class20.field428 + class119.field2109.field3581;
            int var290 = class119.field2109.method1441(-66);
            int var291 = class119.field2109.method1441(arg0 + 123);
            if (class48.field871 != var290) {
                class48.field871 = var290;
                class19.method141(class48.field871, 0);
                class207.method1393(0, false);
                class117.method847(class48.field871, (byte) -76);
                for (int var292 = 0; var292 < 100; var292++) {
                    class210.field3492[var292] = true;
                }
            }
            while (var291-- > 0) {
                int var301 = class119.field2109.method1466((byte) -15);
                int var302 = class119.field2109.method1441(95);
                int var303 = class119.field2109.method1487(255);
                class87 var304 = (class87) class132.field2304.method443((long) var301, (byte) -84);
                if (var304 != null && var304.field1678 != var302) {
                    class69.method529(var304, 100, true);
                    var304 = null;
                }
                if (var304 == null) {
                    var304 = class73.method551(var302, var301, var303, 1);
                }
                var304.field1668 = true;
            }
            for (class87 var293 = (class87) class132.field2304.method446(1); var293 != null; var293 = (class87) class132.field2304.method448((byte) 87)) {
                if (var293.field1668) {
                    var293.field1668 = false;
                } else {
                    class69.method529(var293, arg0 + 91, true);
                }
            }
            class232.field3896.method437((byte) 19);
            while (var289 > class119.field2109.field3581) {
                int var294 = class119.field2109.method1466((byte) -15);
                int var295 = class119.field2109.method1441(98);
                int var296 = class119.field2109.method1441(arg0 - 15);
                int var297 = class119.field2109.method1466((byte) -15);
                for (int var298 = var295; var298 <= var296; var298++) {
                    long var299 = ((long) var294 << 32) + (long) var298;
                    class232.field3896.method445(107, var299, new class199(var297));
                }
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 55) {
            int var305 = class119.field2109.method1466((byte) -15);
            class10 var306 = class89.method698(var305, (byte) 94);
            for (int var307 = 0; var307 < var306.field298.length; var307++) {
                var306.field298[var307] = -1;
                var306.field298[var307] = 0;
            }
            class140.method979((byte) 102, var306);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 162) {
            int var308 = class119.field2109.method1483(26293);
            int var309 = class119.field2109.method1465((byte) -112);
            class50 var310 = class119.field2109.method1469((byte) -92);
            class252.method1706((byte) 102, var309);
            class146.method1028(var308, var310, true);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 14) {
            class176.method1211(false, false);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 153) {
            int var311 = class119.field2109.method1465((byte) -112);
            int var312 = class119.field2109.method1450((byte) 112);
            int var313 = var311 & 0x1F;
            int var314 = (var311 & 0x7FD0) >> 10;
            int var315 = var311 >> 5 & 0x1F;
            int var316 = (var314 << 19) - (-(var313 << 3) - (var315 << 11));
            class10 var317 = class89.method698(var312, (byte) 94);
            if (var317.field280 != var316) {
                var317.field280 = var316;
                class140.method979((byte) 52, var317);
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 62) {
            class25.method239((byte) 54);
            class213.field3523 = -1;
            return false;
        } else if (class213.field3523 == 160 || class213.field3523 == 4 || class213.field3523 == 176 || class213.field3523 == 104 || class213.field3523 == 94 || class213.field3523 == 143 || class213.field3523 == 247 || class213.field3523 == 31 || class213.field3523 == 226 || class213.field3523 == 85 || class213.field3523 == 68 || class213.field3523 == 5) {
            class16.method122(25796);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 217) {
            int var318 = class119.field2109.method1487(255);
            int var319 = class119.field2109.method1487(255);
            int var320 = class119.field2109.method1441(arg0 ^ 0xFFFFFFF8);
            int var321 = class119.field2109.method1487(255);
            int var322 = class119.field2109.method1487(255);
            class142.method990(var319, arg0 ^ 0xFFFF8E49, var318, var320, true, var321, var322);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 192) {
            long var323 = class119.field2109.method1443(35);
            class119.field2109.method1444((byte) -84);
            long var325 = class119.field2109.method1443(110);
            long var327 = (long) class119.field2109.method1441(-8);
            long var329 = (long) class119.field2109.method1447(-9);
            int var331 = class119.field2109.method1487(arg0 ^ 0xFF);
            int var332 = class119.field2109.method1441(-17);
            long var333 = (var327 << 32) + var329;
            boolean var335 = false;
            int var336 = 0;
            label1367: while (true) {
                if (var336 >= 100) {
                    if (var331 <= 1) {
                        for (int var337 = 0; var337 < class73.field1379; var337++) {
                            if (class227.field3823[var337] == var323) {
                                var335 = true;
                                break label1367;
                            }
                        }
                    }
                    break;
                }
                if (class18.field394[var336] == var333) {
                    var335 = true;
                    break;
                }
                var336++;
            }
            if (!var335 && class64.field1222 == 0) {
                class18.field394[class68.field1283] = var333;
                class68.field1283 = (class68.field1283 + 1) % 100;
                class50 var338 = class260.method1751(-88, var332).method1295(arg0 - 31800, class119.field2109);
                if (var331 == 2 || var331 == 3) {
                    class18.method137(var332, class80.method589(new class50[] { class116.field2021, class223.method1533((byte) -30, var323).method375(true) }, 28743), 20, -1, var338, class223.method1533((byte) -30, var325).method375(true));
                } else if (var331 == 1) {
                    class18.method137(var332, class80.method589(new class50[] { class195.field3244, class223.method1533((byte) -30, var323).method375(true) }, arg0 + 28743), 20, -1, var338, class223.method1533((byte) -30, var325).method375(true));
                } else {
                    class18.method137(var332, class223.method1533((byte) -30, var323).method375(true), 20, -1, var338, class223.method1533((byte) -30, var325).method375(true));
                }
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 87) {
            int var339 = class119.field2109.method1441(110);
            int var340 = class119.field2109.method1490((byte) -118);
            class19.field406 = var339;
            class160.field2758 = var340;
            class3.method20(arg0 - 104);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 175) {
            long var341 = class119.field2109.method1443(-104);
            int var343 = class119.field2109.method1441(101);
            class50 var344 = class260.method1751(arg0 ^ 0xFFFFFFBC, var343).method1295(arg0 - 31800, class119.field2109);
            class18.method137(var343, class223.method1533((byte) -30, var341).method375(true), 19, -1, var344, (class50) null);
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 77) {
            class22.field510 = class119.field2109.method1441(71) * 30;
            class255.field4399 = class217.field3649;
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 107) {
            int var345 = class119.field2109.method1466((byte) -15);
            class87 var346 = (class87) class132.field2304.method443((long) var345, (byte) 93);
            if (var346 != null) {
                class69.method529(var346, 33, true);
            }
            if (class220.field3676 != null) {
                class140.method979((byte) 37, class220.field3676);
                class220.field3676 = null;
            }
            class213.field3523 = -1;
            return true;
        } else if (class213.field3523 == 48) {
            int var347 = class119.field2109.method1465((byte) -112);
            int var348 = class119.field2109.method1450((byte) 114);
            class197.method1328(-1, var347, var348);
            class213.field3523 = -1;
            return true;
        } else {
            class121.method883("T1 - " + class213.field3523 + "," + class99.field1827 + "," + class87.field1688 + " - " + class20.field428, (byte) -72, (Throwable) null);
            class25.method239((byte) 54);
            return true;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3400++;
        if (class10.method67(arg4, (byte) 123)) {
            client.method619(class137.field2380[arg4], arg2, arg3, arg7, arg0, arg1, arg6, arg5);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(DI)V")
    public static final void method1384(double arg0, int arg1) {
        int var3 = -38 / ((21 - arg1) / 37);
        if (class84.field1612 != arg0) {
            for (int var4 = 0; var4 < 256; var4++) {
                int var5 = (int) (Math.pow((double) var4 / 255.0D, arg0) * 255.0D);
                class15.field347[var4] = var5 <= 255 ? var5 : 255;
            }
            class84.field1612 = arg0;
        }
        field3396++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static void method1385(byte arg0) {
        field3395 = null;
        field3408 = null;
        field3402 = null;
        field3405 = null;
        field3401 = null;
        field3403 = null;
        int var1 = -23 / ((arg0 - 16) / 61);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method1386(boolean arg0, Object arg1, int arg2) {
        field3407++;
        if (arg2 != 255) {
            return null;
        } else if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class173.method1192(79, var3) : var3;
        } else if (arg1 instanceof class112) {
            class112 var4 = (class112) arg1;
            return var4.method591(arg2 - 141);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    public static final void method1387(boolean arg0) {
        field3398++;
        if (arg0) {
            field3404 = -125;
        }
        class222.field3733.method762((byte) 117);
        class109.field1945.method762((byte) 117);
        class5.field62.method762((byte) 117);
    }
}
