import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class393 {

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "Lgo;")
    public static class441 field5934 = new class441(1, 2, 2, 0);

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lqa;Z)V", line = 8)
    public static final void method2387(class162 arg0, boolean arg1) {
        field5935++;
        if (class105.field1520.method810(!arg1) == 0) {
            return;
        }
        if (class170.field2529 == 0) {
            for (class62 var2 = (class62) class105.field1520.method816(117); var2 != null; var2 = (class62) class105.field1520.method812(103)) {
                class294.field4196.method463(var2.field938, var2.field945 ? class500.field7365.field3532 : null, var2.field937, var2.field944, (byte) -116, var2.field935, var2.field941, class47.field761, false, false, arg0, arg0);
                var2.method2049(-121);
            }
            class377.method2315(false);
        } else {
            if (class282.field4041 == null) {
                Canvas var3 = new Canvas();
                var3.setSize(36, 32);
                class282.field4041 = class162.method1090(var3, 0, class109.field1563, class483.field7077, 0, false);
                class220.field3240 = class282.field4041.method1081(class483.method2865(117, class105.field1522, class407.field6142, 0), class408.method2460(class6.field81, class407.field6142, 0), true);
            }
            for (class62 var4 = (class62) class105.field1520.method816(119); var4 != null; var4 = (class62) class105.field1520.method812(92)) {
                class294.field4196.method463(var4.field938, var4.field945 ? class500.field7365.field3532 : null, var4.field937, var4.field944, (byte) -116, var4.field935, var4.field941, class220.field3240, false, false, class282.field4041, arg0);
                var4.method2049(-91);
            }
        }
        if (!arg1) {
            field5934 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z)Z", line = 61)
    public static final boolean method2388(boolean arg0) throws IOException {
        field5936++;
        if (class90.field1361 == null) {
            return false;
        }
        int var1 = class90.field1361.method2310(-104);
        if (var1 == 0) {
            return false;
        }
        if (class59.field883 == null) {
            if (class418.field6285) {
                class90.field1361.method2308(class66.field1009.field3036, 0, 1, 120);
                var1--;
                class418.field6285 = false;
                class259.field3813++;
            }
            class66.field1009.field3037 = 0;
            if (class66.field1009.method1694(true)) {
                if (var1 == 0) {
                    return false;
                }
                class90.field1361.method2308(class66.field1009.field3036, 1, 1, 65);
                var1--;
                class259.field3813++;
            }
            class418.field6285 = true;
            class73[] var2 = client.method1336((byte) 89);
            int var3 = class66.field1009.method1693((byte) -128);
            if (var3 < 0 || var2.length <= var3) {
                throw new IOException("invo:" + var3 + " ip:" + class66.field1009.field3037);
            }
            class59.field883 = var2[var3];
            class352.field5395 = class59.field883.field1083;
        }
        if (class352.field5395 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class90.field1361.method2308(class66.field1009.field3036, 0, 1, 76);
            class352.field5395 = class66.field1009.field3036[0] & 0xFF;
            class259.field3813++;
            var1--;
        }
        if (class352.field5395 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class90.field1361.method2308(class66.field1009.field3036, 0, 2, 105);
            class66.field1009.field3037 = 0;
            class352.field5395 = class66.field1009.method1450((byte) 111);
            var1 -= 2;
            class259.field3813 += 2;
        }
        if (class352.field5395 > var1) {
            return false;
        }
        class66.field1009.field3037 = 0;
        class90.field1361.method2308(class66.field1009.field3036, 0, class352.field5395, 82);
        class5.field73 = 0;
        class259.field3813 += class352.field5395;
        class471.field6941 = class80.field1218;
        class80.field1218 = class47.field765;
        class47.field765 = class59.field883;
        if (class59.field883 == class40.field587) {
            int var4 = class66.field1009.method1465((byte) -117);
            int var5 = class66.field1009.method1447(29480);
            int var6 = class66.field1009.method1452(65280);
            int var7 = class66.field1009.method1435(16);
            if (class203.method1375(var4, (byte) 126)) {
                class508.method3009(var6, var5, var7, (byte) -66);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class108.field1556) {
            class312.field4468 = class66.field1009.method1428(32122);
            class59.field883 = null;
            class296.field4212 = class99.field1453;
            return true;
        } else if (class59.field883 == class108.field1549) {
            int var8 = class66.field1009.method1452(65280);
            int var9 = var8 >> 28 & 0x3;
            int var10 = var8 >> 14 & 0x3FFF;
            int var11 = var8 & 0x3FFF;
            int var12 = class66.field1009.method1428(32122);
            int var13 = var12 >> 2;
            int var14 = var12 & 0x3;
            int var15 = class260.field3836[var13];
            int var16 = class66.field1009.method1465((byte) 116);
            int var17 = var11 - class24.field259;
            if (var16 == 65535) {
                var16 = -1;
            }
            int var18 = var10 - class68.field1038;
            class229.method1574(var15, var13, -72, var17, var18, var16, var9, var14);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class512.field7491) {
            class223.method1528(true, class75.field1115);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class494.field7307) {
            class248.field3645 = class66.field1009.method1450((byte) 29) * 30;
            class296.field4212 = class99.field1453;
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class22.field233) {
            class314.field4479 = class66.field1009.method1428(32122);
            class37.field394 = class66.field1009.method1442(111) << 3;
            class27.field286 = class66.field1009.method1438(3) << 3;
            for (class84 var19 = (class84) class176.field2591.method2608(true); var19 != null; var19 = (class84) class176.field2591.method2603(60)) {
                int var21 = (int) (var19.field4736 & 0x3FFFL);
                int var22 = (int) (var19.field4736 >> 14 & 0x3FFFL);
                int var23 = (int) (var19.field4736 >> 28 & 0x3L);
                if (class314.field4479 == var23 && var21 >= class27.field286 && class27.field286 + 8 > var21 && var22 >= class37.field394 && class37.field394 + 8 > var22) {
                    var19.method2049(-67);
                    class326.method2015((byte) 82, class314.field4479, var21, var22);
                }
            }
            for (class278 var20 = (class278) class422.field6338.method816(108); var20 != null; var20 = (class278) class422.field6338.method812(84)) {
                if (class27.field286 <= var20.field4008 && var20.field4008 < (class27.field286 + 8) && class37.field394 <= var20.field4002 && (class37.field394 + 8) > var20.field4002 && class314.field4479 == var20.field4016) {
                    var20.field4004 = 0;
                }
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class56.field858) {
            int var24 = class66.field1009.method1450((byte) 82);
            int var25 = class66.field1009.method1463(10510);
            int var26 = class66.field1009.method1465((byte) 85);
            int var27 = class66.field1009.method1462((byte) -85);
            if (class203.method1375(var27, (byte) -92)) {
                class31.method184((var26 << 16) + var24, var25, (byte) 79);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class252.field3757) {
            class454.field6735 = class66.field1009.method1424((byte) -104);
            class157.field2291 = class66.field1009.method1428(32122);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class141.field2115) {
            class334.method2036(false, 663);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class405.field6116) {
            int var28 = class66.field1009.method1450((byte) 30);
            if (class203.method1375(var28, (byte) 48)) {
                class375.method2302((byte) -114);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class465.field6882) {
            int var29 = class66.field1009.method1428(32122);
            int var30 = var29 >> 5;
            int var31 = var29 & 0x1F;
            if (var31 == 0) {
                class409.field6169[var30] = null;
                class59.field883 = null;
                return true;
            }
            class308 var32 = new class308();
            var32.field4436 = var31;
            var32.field4434 = class66.field1009.method1428(32122);
            if (var32.field4434 >= 0 && class250.field3711.length > var32.field4434) {
                if (var32.field4436 == 1 || var32.field4436 == 10) {
                    var32.field4443 = class66.field1009.method1450((byte) 70);
                    class66.field1009.field3037 += 6;
                } else if (var32.field4436 >= 2 && var32.field4436 <= 6) {
                    if (var32.field4436 == 2) {
                        var32.field4424 = 64;
                        var32.field4431 = 64;
                    }
                    if (var32.field4436 == 3) {
                        var32.field4431 = 64;
                        var32.field4424 = 0;
                    }
                    if (var32.field4436 == 4) {
                        var32.field4424 = 128;
                        var32.field4431 = 64;
                    }
                    if (var32.field4436 == 5) {
                        var32.field4431 = 0;
                        var32.field4424 = 64;
                    }
                    if (var32.field4436 == 6) {
                        var32.field4424 = 64;
                        var32.field4431 = 128;
                    }
                    var32.field4436 = 2;
                    var32.field4428 = class66.field1009.method1428(32122);
                    var32.field4424 += class66.field1009.method1450((byte) 55) - class68.field1038 << 7;
                    var32.field4431 += class66.field1009.method1450((byte) 33) - class24.field259 << 7;
                    var32.field4425 = class66.field1009.method1428(32122);
                    var32.field4427 = class66.field1009.method1450((byte) 80);
                }
                var32.field4441 = class66.field1009.method1450((byte) 102);
                if (var32.field4441 == 65535) {
                    var32.field4441 = -1;
                }
                class409.field6169[var30] = var32;
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class398.field5970) {
            int var33 = class66.field1009.method1463(10510);
            int var34 = class66.field1009.method1430(!arg0);
            int var35 = class66.field1009.method1451((byte) -47);
            if (class203.method1375(var35, (byte) -80)) {
                class32.method186(var33, var34, -16256);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class221.field3280) {
            class61.field927 = class66.field1009.method1428(32122);
            for (int var36 = 0; var36 < class61.field927; var36++) {
                class3.field41[var36] = class66.field1009.method1449(106);
                class359.field5515[var36] = class66.field1009.method1449(122);
                if (class359.field5515[var36].equals("")) {
                    class359.field5515[var36] = class3.field41[var36];
                }
                class231.field3446[var36] = class66.field1009.method1449(69);
                class338.field4750[var36] = class66.field1009.method1449(108);
                if (class338.field4750[var36].equals("")) {
                    class338.field4750[var36] = class231.field3446[var36];
                }
                class431.field6440[var36] = false;
            }
            class447.field6663 = class99.field1453;
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class461.field6846) {
            class223.method1528(arg0, class76.field1122);
            class59.field883 = null;
            return true;
        } else if (class79.field1190 == class59.field883) {
            while (class352.field5395 > class66.field1009.field3037) {
                boolean var47 = class66.field1009.method1428(32122) == 1;
                String var48 = class66.field1009.method1449(63);
                String var49 = class66.field1009.method1449(67);
                int var50 = class66.field1009.method1450((byte) 126);
                int var51 = class66.field1009.method1428(32122);
                String var52 = "";
                boolean var53 = false;
                if (var50 > 0) {
                    var52 = class66.field1009.method1449(127);
                    var53 = class66.field1009.method1428(32122) == 1;
                }
                for (int var54 = 0; var54 < class315.field4496; var54++) {
                    if (var47) {
                        if (var49.equals(class474.field6980[var54])) {
                            class474.field6980[var54] = var48;
                            class287.field4106[var54] = var49;
                            var48 = null;
                            break;
                        }
                    } else if (var48.equals(class474.field6980[var54])) {
                        if (class85.field1296[var54] != var50) {
                            class85.field1296[var54] = var50;
                            if (var50 > 0) {
                                class401.method2418(5, "", 0, "", var48 + class519.field7574.method2838(!arg0, class143.field2137), false);
                            }
                            if (var50 == 0) {
                                class401.method2418(5, "", 0, "", var48 + class227.field3363.method2838(false, class143.field2137), !arg0);
                            }
                        }
                        class287.field4106[var54] = var49;
                        class364.field5575[var54] = var52;
                        class66.field990[var54] = var51;
                        class467.field6893[var54] = var53;
                        var48 = null;
                        break;
                    }
                }
                if (var48 != null && class315.field4496 < 200) {
                    class474.field6980[class315.field4496] = var48;
                    class287.field4106[class315.field4496] = var49;
                    class85.field1296[class315.field4496] = var50;
                    class364.field5575[class315.field4496] = var52;
                    class66.field990[class315.field4496] = var51;
                    class467.field6893[class315.field4496] = var53;
                    class315.field4496++;
                }
            }
            class336.field4732 = 2;
            class447.field6663 = class99.field1453;
            boolean var37 = false;
            int var38 = class315.field4496;
            while (var38 > 0) {
                var38--;
                boolean var39 = true;
                for (int var40 = 0; var40 < var38; var40++) {
                    if (class85.field1296[var40] != class102.field1474 && class85.field1296[var40 + 1] == class102.field1474 || class85.field1296[var40] == 0 && class85.field1296[var40 + 1] != 0) {
                        int var41 = class85.field1296[var40];
                        class85.field1296[var40] = class85.field1296[var40 + 1];
                        class85.field1296[var40 + 1] = var41;
                        String var42 = class364.field5575[var40];
                        class364.field5575[var40] = class364.field5575[var40 + 1];
                        class364.field5575[var40 + 1] = var42;
                        String var43 = class474.field6980[var40];
                        class474.field6980[var40] = class474.field6980[var40 + 1];
                        class474.field6980[var40 + 1] = var43;
                        String var44 = class287.field4106[var40];
                        class287.field4106[var40] = class287.field4106[var40 + 1];
                        class287.field4106[var40 + 1] = var44;
                        int var45 = class66.field990[var40];
                        class66.field990[var40] = class66.field990[var40 + 1];
                        class66.field990[var40 + 1] = var45;
                        boolean var46 = class467.field6893[var40];
                        class467.field6893[var40] = class467.field6893[var40 + 1];
                        var39 = false;
                        class467.field6893[var40 + 1] = var46;
                    }
                }
                if (var39) {
                    break;
                }
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class119.field1799) {
            class49.field796.method1208(-25783);
            class355.field5467 += 32;
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class199.field2887) {
            int var55 = class66.field1009.method1462((byte) -70);
            int var56 = class66.field1009.method1462((byte) -118);
            byte var57 = class66.field1009.method1438(3);
            if (class203.method1375(var55, (byte) -94)) {
                class310.method1944(94, var56, var57);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class141.field2118) {
            class39.field572 = class352.field5395 <= 2 ? class165.field2438.method2838(false, class143.field2137) : class66.field1009.method1449(85);
            class135.field2065 = class352.field5395 > 0 ? class66.field1009.method1450((byte) 67) : -1;
            class59.field883 = null;
            if (class135.field2065 == 65535) {
                class135.field2065 = -1;
            }
            return true;
        } else if (class59.field883 == class108.field1560) {
            int var58 = class66.field1009.method1423(437589608);
            int var59 = class66.field1009.method1465((byte) -51);
            if (class203.method1375(var59, (byte) 74)) {
                class199.method1351(-1, var58, 3, -1, (byte) 64);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class289.field4155) {
            int var60 = class66.field1009.method1450((byte) 45);
            if (var60 == 65535) {
                var60 = -1;
            }
            int var61 = class66.field1009.method1428(32122);
            int var62 = class66.field1009.method1450((byte) 101);
            int var63 = class66.field1009.method1428(32122);
            class207.method1394(var63, 100, var60, var61, var62);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class431.field6444) {
            class223.method1528(arg0, class381.field5775);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class321.field4584) {
            int var64 = class66.field1009.method1432(23094);
            int var65 = class66.field1009.method1424((byte) -20);
            int var66 = class66.field1009.method1462((byte) -123);
            int var67 = class66.field1009.method1465((byte) -109);
            if (class203.method1375(var66, (byte) -87)) {
                class92 var68 = (class92) class431.field6450.method2605(false, (long) var64);
                if (var68 != null) {
                    class250.method1671(false, var68.field1378 != var67, var68, false);
                }
                class76.method434(var67, 0, false, var64, var65);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class420.field6322) {
            class223.method1528(arg0, class38.field561);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class331.field4687) {
            String var69 = class66.field1009.method1449(96);
            String var70 = class323.method2003(1, class282.method1825(class66.field1009, -2));
            class401.method2418(6, var69, 0, var69, var70, false);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class441.field6591) {
            int var71 = class66.field1009.method1428(32122);
            boolean var72 = (var71 & 0x1) == 1;
            String var73 = class66.field1009.method1449(92);
            String var74 = class66.field1009.method1449(94);
            if (var74.equals("")) {
                var74 = var73;
            }
            String var75 = class66.field1009.method1449(45);
            String var76 = class66.field1009.method1449(83);
            if (var76.equals("")) {
                var76 = var75;
            }
            if (var72) {
                for (int var77 = 0; var77 < class61.field927; var77++) {
                    if (class359.field5515[var77].equals(var76)) {
                        class3.field41[var77] = var73;
                        class359.field5515[var77] = var74;
                        class231.field3446[var77] = var75;
                        class338.field4750[var77] = var76;
                        break;
                    }
                }
            } else {
                class3.field41[class61.field927] = var73;
                class359.field5515[class61.field927] = var74;
                class231.field3446[class61.field927] = var75;
                class338.field4750[class61.field927] = var76;
                class431.field6440[class61.field927] = class286.method1847(var71, 2) == 2;
                class61.field927++;
            }
            class447.field6663 = class99.field1453;
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class229.field3417) {
            int var78 = class66.field1009.method1462((byte) -9);
            int var79 = class66.field1009.method1423(437589608);
            int var80 = class66.field1009.method1450((byte) 65);
            if (class203.method1375(var78, (byte) 76)) {
                class310.method1944(114, var80, var79);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class138.field2083) {
            int var81 = class66.field1009.method1452(65280);
            int var82 = class66.field1009.method1462((byte) -111);
            int var83 = class66.field1009.method1423(437589608);
            if (class203.method1375(var82, (byte) 78)) {
                class92 var84 = (class92) class431.field6450.method2605(false, (long) var81);
                class92 var85 = (class92) class431.field6450.method2605(false, (long) var83);
                if (var85 != null) {
                    class250.method1671(false, var84 == null || var84.field1378 != var85.field1378, var85, false);
                }
                if (var84 != null) {
                    var84.method2049(-61);
                    class431.field6450.method2606(var84, (long) var83, 0);
                }
                class38 var86 = class149.method979((byte) -68, var81);
                if (var86 != null) {
                    class350.method2203((byte) -123, var86);
                }
                class38 var87 = class149.method979((byte) -98, var83);
                if (var87 != null) {
                    class350.method2203((byte) -117, var87);
                    class478.method2850(var87, true, true);
                }
                if (class6.field79 != -1) {
                    class110.method677(1, !arg0, class6.field79);
                }
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class12.field154) {
            int var88 = class66.field1009.method1434(16887);
            int var89 = class66.field1009.method1452(65280);
            int var90 = class66.field1009.method1428(32122);
            String var91 = "";
            String var92 = var91;
            if ((var90 & 0x1) != 0) {
                var91 = class66.field1009.method1449(64);
                if ((var90 & 0x2) == 0) {
                    var92 = var91;
                } else {
                    var92 = class66.field1009.method1449(45);
                }
            }
            String var93 = class66.field1009.method1449(97);
            if (var88 == 99) {
                class314.method1955(var93, 14715);
            } else if (var92.equals("") || !class135.method898(-70, var92)) {
                class401.method2418(var88, var92, var89, var91, var93, false);
            } else {
                class59.field883 = null;
                return true;
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class265.field3882) {
            boolean var94 = class66.field1009.method1428(32122) == 1;
            String var95 = class66.field1009.method1449(65);
            String var96 = var95;
            if (var94) {
                var96 = class66.field1009.method1449(103);
            }
            int var97 = class66.field1009.method1428(32122);
            boolean var98 = false;
            if (var97 <= 1) {
                if (!(!class56.field871 || class447.field6665) || class214.field3124) {
                    var98 = true;
                } else if (var97 <= 1 && class135.method898(-91, var96)) {
                    var98 = true;
                }
            }
            if (!var98 && class269.field3927 == 0) {
                String var99 = class323.method2003(1, class282.method1825(class66.field1009, -2));
                if (var97 == 2) {
                    class159.method1013(var99, 24, null, 105, "<img=1>" + var96, "<img=1>" + var95, -1, 0);
                } else if (var97 == 1) {
                    class159.method1013(var99, 24, null, -87, "<img=0>" + var96, "<img=0>" + var95, -1, 0);
                } else {
                    class159.method1013(var99, 24, null, 99, var96, var95, -1, 0);
                }
            }
            class59.field883 = null;
            return true;
        } else if (class84.field1292 == class59.field883) {
            class447.field6663 = class99.field1453;
            class336.field4732 = 1;
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class117.field1767) {
            int var100 = class66.field1009.method1428(32122);
            int var101 = class66.field1009.method1463(10510);
            int var102 = class66.field1009.method1469(128);
            class86.field1323[var102] = var101;
            class459.field6793[var102] = var100;
            class318.field4569[var102] = 1;
            int var103 = class378.field5764[var102] - 1;
            for (int var104 = 0; var104 < var103; var104++) {
                if (var101 >= class86.field1317[var104]) {
                    class318.field4569[var102] = var104 + 2;
                }
            }
            class421.field6336[class286.method1847(class424.field6367++, 31)] = var102;
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class31.field340) {
            int var105 = class66.field1009.method1450((byte) 56);
            int var106 = class66.field1009.method1469(128);
            boolean var107 = (var106 & 0x1) == 1;
            class522.method3097((byte) -45, var105, var107);
            class387.field5864[class286.method1847(class269.field3926++, 31)] = var105;
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class234.field3466) {
            int var108 = class66.field1009.method1462((byte) -36);
            int var109 = class66.field1009.method1463(10510);
            class49.field796.method1210(false, var108, var109);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class443.field6601) {
            int var110 = class66.field1009.method1452(65280);
            int var111 = class66.field1009.method1450((byte) 66);
            int var112 = class66.field1009.method1451((byte) -47);
            int var113 = class66.field1009.method1428(32122);
            int var114 = class66.field1009.method1450((byte) 53);
            boolean var115 = (var113 & 0x80) != 0;
            if (var110 >> 30 != 0) {
                int var116 = var110 >> 28 & 0x3;
                int var117 = (var110 >> 14 & 0x3FFF) - class68.field1038;
                int var118 = (var110 & 0x3FFF) - class24.field259;
                if (var117 >= 0 && var118 >= 0 && class30.field323 > var117 && class182.field2661 > var118) {
                    int var119 = var117 * 128 + 64;
                    int var120 = var118 * 128 + 64;
                    int var121 = var116;
                    if (var116 < 3 && class57.method347(var118, var117, true)) {
                        var121 = var116 + 1;
                    }
                    class417 var122 = new class417(var114, 0, class317.field4559, var116, var121, var119, class377.method2316(var120, false, var119, var116) - var111, var120, var117, var117, var118, var118, var113);
                    class100.field1459.method809(new class214(var122), false);
                }
            } else if ((var110 >> 29) != 0) {
                int var138 = var110 & 0xFFFF;
                class167 var139 = class193.field2821[var138];
                if (var139 != null) {
                    if (var114 == 65535) {
                        var114 = -1;
                    }
                    boolean var140 = true;
                    int var141 = var115 ? var139.field1912 : var139.field1906;
                    if (var114 != -1 && var141 != -1) {
                        if (var114 == var141) {
                            class104 var142 = class512.field7494.method2732(57, var114);
                            if (var142.field1499 && var142.field1505 != -1) {
                                class329 var143 = class84.field1295.method1182(var142.field1505, 8);
                                int var144 = var143.field4668;
                                if (var144 == 0 || var144 == 2) {
                                    var140 = false;
                                } else if (var144 == 1) {
                                    var140 = true;
                                }
                            }
                        } else {
                            class104 var145 = class512.field7494.method2732(67, var114);
                            class104 var146 = class512.field7494.method2732(116, var141);
                            if (var145.field1505 != -1 && var146.field1505 != -1) {
                                class329 var147 = class84.field1295.method1182(var145.field1505, 8);
                                class329 var148 = class84.field1295.method1182(var146.field1505, 8);
                                if (var147.field4680 < var148.field4680) {
                                    var140 = false;
                                }
                            }
                        }
                    }
                    if (var140) {
                        if (var115) {
                            var139.field1977 = 1;
                            var139.field1975 = 0;
                            var139.field1938 = class317.field4559 + var112;
                            var139.field1970 = var113 & 0x7;
                            var139.field1929 = 0;
                            var139.field1912 = var114;
                            var139.field1903 = var111;
                            if (var139.field1938 > class317.field4559) {
                                var139.field1975 = -1;
                            }
                            if (var139.field1912 != -1 && class317.field4559 == var139.field1938) {
                                int var151 = class512.field7494.method2732(55, var139.field1912).field1505;
                                if (var151 != -1) {
                                    class329 var152 = class84.field1295.method1182(var151, 8);
                                    if (var152 != null && var152.field4670 != null) {
                                        class480.method2856(var139.field1769, var139.field1763, (byte) 109, var139.field1768, false, var152, 0);
                                    }
                                }
                            }
                        } else {
                            var139.field1937 = 0;
                            var139.field1924 = 1;
                            var139.field1922 = var113 & 0x7;
                            var139.field1906 = var114;
                            var139.field1973 = 0;
                            var139.field1949 = var111;
                            var139.field1908 = class317.field4559 + var112;
                            if (var139.field1908 > class317.field4559) {
                                var139.field1937 = -1;
                            }
                            if (var139.field1906 != -1 && class317.field4559 == var139.field1908) {
                                int var149 = class512.field7494.method2732(80, var139.field1906).field1505;
                                if (var149 != -1) {
                                    class329 var150 = class84.field1295.method1182(var149, 8);
                                    if (var150 != null && var150.field4670 != null) {
                                        class480.method2856(var139.field1769, var139.field1763, (byte) 38, var139.field1768, false, var150, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if ((var110 >> 28) != 0) {
                int var123 = var110 & 0xFFFF;
                class239 var124;
                if (class172.field2546 == var123) {
                    var124 = class500.field7365;
                } else {
                    var124 = class44.field707[var123];
                }
                if (var124 != null) {
                    if (var114 == 65535) {
                        var114 = -1;
                    }
                    boolean var125 = true;
                    int var126 = var115 ? var124.field1912 : var124.field1906;
                    if (var114 != -1 && var126 != -1) {
                        if (var114 == var126) {
                            class104 var127 = class512.field7494.method2732(100, var114);
                            if (var127.field1499 && var127.field1505 != -1) {
                                class329 var128 = class84.field1295.method1182(var127.field1505, 8);
                                int var129 = var128.field4668;
                                if (var129 == 0 || var129 == 2) {
                                    var125 = false;
                                } else if (var129 == 1) {
                                    var125 = true;
                                }
                            }
                        } else {
                            class104 var130 = class512.field7494.method2732(58, var114);
                            class104 var131 = class512.field7494.method2732(121, var126);
                            if (var130.field1505 != -1 && var131.field1505 != -1) {
                                class329 var132 = class84.field1295.method1182(var130.field1505, 8);
                                class329 var133 = class84.field1295.method1182(var131.field1505, 8);
                                if (var133.field4680 > var132.field4680) {
                                    var125 = false;
                                }
                            }
                        }
                    }
                    if (var125) {
                        if (var115) {
                            var124.field1903 = var111;
                            var124.field1970 = var113 & 0x7;
                            var124.field1929 = 0;
                            var124.field1938 = class317.field4559 + var112;
                            var124.field1977 = 1;
                            var124.field1975 = 0;
                            var124.field1912 = var114;
                            if (var124.field1912 == 65535) {
                                var124.field1912 = -1;
                            }
                            if (var124.field1938 > class317.field4559) {
                                var124.field1975 = -1;
                            }
                            if (var124.field1912 != -1 && class317.field4559 == var124.field1938) {
                                int var134 = class512.field7494.method2732(50, var124.field1912).field1505;
                                if (var134 != -1) {
                                    class329 var135 = class84.field1295.method1182(var134, 8);
                                    if (var135 != null && var135.field4670 != null) {
                                        class480.method2856(var124.field1769, var124.field1763, (byte) 119, var124.field1768, class500.field7365 == var124, var135, 0);
                                    }
                                }
                            }
                        } else {
                            var124.field1922 = var113 & 0x7;
                            var124.field1924 = 1;
                            var124.field1937 = 0;
                            var124.field1908 = class317.field4559 + var112;
                            var124.field1906 = var114;
                            var124.field1973 = 0;
                            var124.field1949 = var111;
                            if (var124.field1906 == 65535) {
                                var124.field1906 = -1;
                            }
                            if (var124.field1908 > class317.field4559) {
                                var124.field1937 = -1;
                            }
                            if (var124.field1906 != -1 && class317.field4559 == var124.field1908) {
                                int var136 = class512.field7494.method2732(51, var124.field1906).field1505;
                                if (var136 != -1) {
                                    class329 var137 = class84.field1295.method1182(var136, 8);
                                    if (var137 != null && var137.field4670 != null) {
                                        class480.method2856(var124.field1769, var124.field1763, (byte) 64, var124.field1768, class500.field7365 == var124, var137, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class148.field2198) {
            int var153 = class66.field1009.method1450((byte) 100);
            int var154 = class66.field1009.method1452(65280);
            if (class203.method1375(var153, (byte) -108)) {
                class92 var155 = (class92) class431.field6450.method2605(false, (long) var154);
                if (var155 != null) {
                    class250.method1671(false, true, var155, !arg0);
                }
                if (class191.field2809 != null) {
                    class350.method2203((byte) -119, class191.field2809);
                    class191.field2809 = null;
                }
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class184.field2743) {
            class223.method1528(true, class480.field7046);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class228.field3398) {
            class456.method2738(class352.field5395, arg0, class66.field1009);
            class59.field883 = null;
            return true;
        } else if (class99.field1451 == class59.field883) {
            class66.field1009.field3037 += 28;
            if (class66.field1009.method1470(0)) {
                class120.method789(class66.field1009, true, class66.field1009.field3037 - 28);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class29.field303) {
            int var156 = class66.field1009.method1465((byte) 69);
            int var157 = class66.field1009.method1451((byte) -47);
            int var158 = class66.field1009.method1451((byte) -47);
            if (class203.method1375(var158, (byte) -101)) {
                class178.method1215(var157, var156, true, 0);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class242.field3571) {
            class223.method1528(true, class60.field891);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class106.field1528) {
            boolean var159 = class66.field1009.method1428(32122) == 1;
            String var160 = class66.field1009.method1449(70);
            String var161 = var160;
            if (var159) {
                var161 = class66.field1009.method1449(122);
            }
            long var162 = class66.field1009.method1425(21985);
            long var164 = (long) class66.field1009.method1450((byte) 103);
            long var166 = (long) class66.field1009.method1458((byte) -10);
            int var168 = class66.field1009.method1428(32122);
            long var169 = (var164 << 32) + var166;
            boolean var171 = false;
            int var172 = 0;
            while (true) {
                if (var172 >= 100) {
                    if (var168 <= 1) {
                        if (!(!class56.field871 || class447.field6665) || class214.field3124) {
                            var171 = true;
                        } else if (class135.method898(106, var161)) {
                            var171 = true;
                        }
                    }
                    break;
                }
                if (class120.field1810[var172] == var169) {
                    var171 = true;
                    break;
                }
                var172++;
            }
            if (!var171 && class269.field3927 == 0) {
                class120.field1810[class417.field6241] = var169;
                class417.field6241 = (class417.field6241 + 1) % 100;
                String var173 = class323.method2003(1, class282.method1825(class66.field1009, -2));
                if (var168 == 2 || var168 == 3) {
                    class159.method1013(var173, 9, class485.method2876(var162, (byte) 72), 9, "<img=1>" + var161, "<img=1>" + var160, -1, 0);
                } else if (var168 == 1) {
                    class159.method1013(var173, 9, class485.method2876(var162, (byte) 96), 48, "<img=0>" + var161, "<img=0>" + var160, -1, 0);
                } else {
                    class159.method1013(var173, 9, class485.method2876(var162, (byte) 60), -88, var161, var160, -1, 0);
                }
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class377.field5757) {
            String var174 = class66.field1009.method1449(45);
            boolean var175 = class66.field1009.method1428(32122) == 1;
            String var176;
            if (var175) {
                var176 = class66.field1009.method1449(47);
            } else {
                var176 = var174;
            }
            int var177 = class66.field1009.method1450((byte) 67);
            byte var178 = class66.field1009.method1417(false);
            boolean var179 = false;
            if (var178 == -128) {
                var179 = true;
            }
            if (var179) {
                if (class44.field690 == 0) {
                    class59.field883 = null;
                    return true;
                }
                boolean var180 = false;
                int var181;
                for (var181 = 0; class44.field690 > var181 && (!class18.field194[var181].field2497.equals(var176) || class18.field194[var181].field2503 != var177); var181++) {
                }
                if (class44.field690 > var181) {
                    while (var181 < class44.field690 - 1) {
                        class18.field194[var181] = class18.field194[var181 + 1];
                        var181++;
                    }
                    class44.field690--;
                    class18.field194[class44.field690] = null;
                }
            } else {
                String var182 = class66.field1009.method1449(97);
                class169 var183 = new class169();
                var183.field2497 = var176;
                var183.field2504 = var174;
                var183.field2500 = class14.method93(var183.field2497, 3841);
                var183.field2503 = var177;
                var183.field2495 = var178;
                var183.field2499 = var182;
                int var184;
                for (var184 = class44.field690 - 1; var184 >= 0; var184--) {
                    int var185 = class18.field194[var184].field2500.compareTo(var183.field2500);
                    if (var185 == 0) {
                        class18.field194[var184].field2503 = var177;
                        class18.field194[var184].field2495 = var178;
                        class18.field194[var184].field2499 = var182;
                        if (var176.equals(class500.field7365.field3548)) {
                            class123.field1873 = var178;
                        }
                        class59.field883 = null;
                        class342.field4903 = class99.field1453;
                        return true;
                    }
                    if (var185 < 0) {
                        break;
                    }
                }
                if (class44.field690 >= class18.field194.length) {
                    class59.field883 = null;
                    return true;
                }
                for (int var186 = class44.field690 - 1; var186 > var184; var186--) {
                    class18.field194[var186 + 1] = class18.field194[var186];
                }
                if (class44.field690 == 0) {
                    class18.field194 = new class169[100];
                }
                class18.field194[var184 + 1] = var183;
                class44.field690++;
                if (var176.equals(class500.field7365.field3548)) {
                    class123.field1873 = var178;
                }
            }
            class342.field4903 = class99.field1453;
            class59.field883 = null;
            return true;
        } else if (class68.field1036 == class59.field883) {
            class85.field1306 = class66.field1009.method1447(29480);
            class59.field883 = null;
            class296.field4212 = class99.field1453;
            return true;
        } else if (class59.field883 == class335.field4716) {
            int var187 = class66.field1009.method1452(65280);
            class94.field1394 = class483.field7077.method2571((byte) -118, var187);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class213.field3110) {
            class223.method1528(true, class47.field768);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class334.field4709) {
            int var188 = class66.field1009.method1450((byte) 57);
            int var189 = class66.field1009.method1428(32122);
            boolean var190 = (var189 & 0x1) == 1;
            class474.method2832(var190, 0, var188);
            int var191 = class66.field1009.method1450((byte) 113);
            for (int var192 = 0; var192 < var191; var192++) {
                int var193 = class66.field1009.method1451((byte) -47);
                int var194 = class66.field1009.method1428(32122);
                if (var194 == 255) {
                    var194 = class66.field1009.method1463(10510);
                }
                class76.method433(26897, var190, var194, var192, var193 - 1, var188);
            }
            class387.field5864[class286.method1847(31, class269.field3926++)] = var188;
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class42.field632) {
            class334.method2036(true, 663);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class322.field4614) {
            int var195 = class66.field1009.method1430(false);
            int var196 = class66.field1009.method1462((byte) -47);
            if (class203.method1375(var196, (byte) -99)) {
                class252.field3739 = var195;
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class39.field571) {
            int var197 = class66.field1009.method1452(65280);
            int var198 = class66.field1009.method1465((byte) 110);
            int var199 = class66.field1009.method1450((byte) 60);
            if (class203.method1375(var199, (byte) 102)) {
                method2390(var198, var197, -107);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class37.field390) {
            int var200 = class66.field1009.method1451((byte) -47);
            int var201 = class66.field1009.method1462((byte) -117);
            int var202 = class66.field1009.method1432(23094);
            if (class203.method1375(var201, (byte) 116)) {
                class252.method1685(var202, 10660, var200);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class148.field2186) {
            if (class82.field1255 != null) {
                class407.method2447(-1, false, class426.field6401.field991, -1, (byte) -49);
            }
            byte[] var203 = new byte[class352.field5395];
            class66.field1009.method1689(class352.field5395, var203, 0, false);
            String var204 = class271.method1782(class352.field5395, 44, 0, var203);
            class36.method210(var204, class170.field2529 == 1, class483.field7077, true, (byte) -127);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class41.field615) {
            int var205 = class66.field1009.method1451((byte) -47);
            int var206 = class66.field1009.method1432(23094);
            int var207 = class66.field1009.method1465((byte) 111);
            int var208 = class66.field1009.method1450((byte) 34);
            int var209 = class66.field1009.method1450((byte) 85);
            if (class203.method1375(var207, (byte) 79)) {
                class199.method1351(var209 << 16 | var205, var206, 7, var208, (byte) 64);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class361.field5552) {
            int var210 = class66.field1009.method1465((byte) 53);
            int var211 = class66.field1009.method1432(23094);
            class49.field796.method1214(-1, var211, var210);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class41.field605) {
            for (int var212 = 0; var212 < class44.field707.length; var212++) {
                if (class44.field707[var212] != null) {
                    class44.field707[var212].field1950 = -1;
                }
            }
            for (int var213 = 0; var213 < class193.field2821.length; var213++) {
                if (class193.field2821[var213] != null) {
                    class193.field2821[var213].field1950 = -1;
                }
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class229.field3427) {
            class246.method1653(-4548);
            class59.field883 = null;
            return false;
        } else if (class59.field883 == class484.field7105) {
            int var214 = class66.field1009.method1450((byte) 127);
            if (var214 == 65535) {
                var214 = -1;
            }
            int var215 = class66.field1009.method1462((byte) -73);
            int var216 = class66.field1009.method1452(65280);
            if (class203.method1375(var215, (byte) -124)) {
                class199.method1351(var214, var216, 1, -1, (byte) 64);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class166.field2447) {
            int var217 = class66.field1009.method1423(437589608);
            int var218 = class66.field1009.method1465((byte) 91);
            int var219 = class66.field1009.method1465((byte) 62);
            if (var219 == 65535) {
                var219 = -1;
            }
            int var220 = class66.field1009.method1465((byte) -77);
            if (var220 == 65535) {
                var220 = -1;
            }
            int var221 = class66.field1009.method1423(437589608);
            if (class203.method1375(var218, (byte) 93)) {
                for (int var222 = var219; var222 <= var220; var222++) {
                    long var223 = ((long) var217 << 32) + (long) var222;
                    class387 var225 = (class387) class251.field3713.method2605(!arg0, var223);
                    class387 var226;
                    if (var225 != null) {
                        var226 = new class387(var221, var225.field5860);
                        var225.method2049(-79);
                    } else if (var222 == -1) {
                        var226 = new class387(var221, class149.method979((byte) -119, var217).field399.field5860);
                    } else {
                        var226 = new class387(var221, -1);
                    }
                    class251.field3713.method2606(var226, var223, 0);
                }
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class143.field2133) {
            int var227 = class66.field1009.method1432(23094);
            int var228 = class66.field1009.method1451((byte) -47);
            int var229 = class66.field1009.method1465((byte) -109);
            if (var229 == 65535) {
                var229 = -1;
            }
            if (class203.method1375(var228, (byte) -93)) {
                class117.method782((byte) -59, var227, var229);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class425.field6390) {
            class8.method46(-101);
            class59.field883 = null;
            return false;
        } else if (class59.field883 == class31.field334) {
            int var230 = class66.field1009.method1450((byte) 52);
            int var231 = class66.field1009.method1450((byte) 57);
            int var232 = class66.field1009.method1450((byte) 75);
            int var233 = class66.field1009.method1450((byte) 91);
            if (class203.method1375(var230, (byte) 99) && class185.field2754[var231] != null) {
                for (int var234 = var232; var234 < var233; var234++) {
                    int var235 = class66.field1009.method1458((byte) -10);
                    if (class185.field2754[var231].length > var234 && class185.field2754[var231][var234] != null) {
                        class185.field2754[var231][var234].field493 = var235;
                    }
                }
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class111.field1577) {
            int var236 = class66.field1009.method1450((byte) 104);
            int var237 = class66.field1009.method1428(32122);
            boolean var238 = (var237 & 0x1) == 1;
            while (class352.field5395 > class66.field1009.field3037) {
                int var239 = class66.field1009.method1434(16887);
                int var240 = class66.field1009.method1450((byte) 53);
                int var241 = 0;
                if (var240 != 0) {
                    var241 = class66.field1009.method1428(32122);
                    if (var241 == 255) {
                        var241 = class66.field1009.method1452(65280);
                    }
                }
                class76.method433(26897, var238, var241, var239, var240 - 1, var236);
            }
            class387.field5864[class286.method1847(31, class269.field3926++)] = var236;
            class59.field883 = null;
            return true;
        } else if (class69.field1045 == class59.field883) {
            class223.method1528(true, class234.field3483);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class231.field3445) {
            int var242 = class66.field1009.method1462((byte) -23);
            int var243 = class66.field1009.method1428(32122);
            int var244 = class66.field1009.method1462((byte) -91);
            if (class203.method1375(var242, (byte) 61)) {
                if (var243 == 2) {
                    class486.method2884((byte) -115);
                }
                class6.field79 = var244;
                class24.method152(-117, var244);
                class159.method1015(false, (byte) 45);
                class360.method2239(class6.field79);
                for (int var245 = 0; var245 < 100; var245++) {
                    class315.field4503[var245] = true;
                }
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class402.field6035) {
            boolean var246 = class66.field1009.method1428(32122) == 1;
            String var247 = class66.field1009.method1449(115);
            String var248 = var247;
            if (var246) {
                var248 = class66.field1009.method1449(89);
            }
            int var249 = class66.field1009.method1428(32122);
            int var250 = class66.field1009.method1450((byte) 108);
            boolean var251 = false;
            if (var249 <= 1 && class135.method898(-100, var248)) {
                var251 = true;
            }
            if (!var251 && class269.field3927 == 0) {
                String var252 = class169.field2507.method2821((byte) 64, var250).method475(class66.field1009, -113);
                if (var249 == 2) {
                    class159.method1013(var252, 25, null, -112, "<img=1>" + var248, "<img=1>" + var247, var250, 0);
                } else if (var249 == 1) {
                    class159.method1013(var252, 25, null, 123, "<img=0>" + var248, "<img=0>" + var247, var250, 0);
                } else {
                    class159.method1013(var252, 25, null, -126, var248, var247, var250, 0);
                }
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class490.field7238) {
            class223.method1528(true, class40.field583);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class353.field5401) {
            int var253 = class66.field1009.method1452(65280);
            int var254 = class66.field1009.method1451((byte) -47);
            int var255 = class66.field1009.method1463(10510);
            int var256 = class66.field1009.method1451((byte) -47);
            if (var256 == 65535) {
                var256 = -1;
            }
            if (class203.method1375(var254, (byte) -125)) {
                class359.method2235(var255, var256, var253, (byte) -30);
                class339 var257 = class294.field4196.method453(0, var256);
                class98.method605(108, var257.field4799, var257.field4789, var257.field4786, var253);
                class92.method533(var257.field4807, var253, var257.field4781, var257.field4762, (byte) -104);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class415.field6235) {
            class470.method2818(-102);
            class59.field883 = null;
            return false;
        } else if (class59.field883 == class251.field3733) {
            class123.method811((byte) 117, class352.field5395, class66.field1009, class483.field7077);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class301.field4262) {
            class195.method1314(121);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class196.field2865) {
            int var258 = class66.field1009.method1430(false);
            int var259 = class66.field1009.method1428(32122);
            String var260 = class66.field1009.method1449(73);
            int var261 = class66.field1009.method1462((byte) -77);
            if (var261 == 65535) {
                var261 = -1;
            }
            if (var258 >= 1 && var258 <= 8) {
                if (var260.equalsIgnoreCase("null")) {
                    var260 = null;
                }
                class172.field2536[var258 - 1] = var260;
                class522.field7722[var258 - 1] = var261;
                class100.field1455[var258 - 1] = var259 == 0;
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class225.field3303) {
            class425.field6375 = class66.field1009.method1428(32122);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class464.field6876) {
            int var262 = class66.field1009.method1462((byte) -15);
            byte var263 = class66.field1009.method1438(3);
            class49.field796.method1210(!arg0, var262, var263);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class321.field4603) {
            int var264 = class66.field1009.method1450((byte) 47);
            if (var264 == 65535) {
                var264 = -1;
            }
            int var265 = class66.field1009.method1428(32122);
            int var266 = class66.field1009.method1450((byte) 125);
            int var267 = class66.field1009.method1428(32122);
            class92.method535(var265, var264, var266, 0, var267);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class482.field7071) {
            class342.field4903 = class99.field1453;
            if (class352.field5395 == 0) {
                class44.field690 = 0;
                class59.field883 = null;
                class18.field194 = null;
                class376.field5746 = null;
                class266.field3895 = null;
                return true;
            }
            class376.field5746 = class66.field1009.method1449(65);
            boolean var268 = class66.field1009.method1428(32122) == 1;
            if (var268) {
                class66.field1009.method1449(80);
            }
            long var269 = class66.field1009.method1425(21985);
            class266.field3895 = class63.method372(0, var269);
            class443.field6599 = class66.field1009.method1417(false);
            int var271 = class66.field1009.method1428(32122);
            if (var271 == 255) {
                class59.field883 = null;
                return true;
            }
            class44.field690 = var271;
            class169[] var272 = new class169[100];
            for (int var273 = 0; var273 < class44.field690; var273++) {
                var272[var273] = new class169();
                var272[var273].field2504 = class66.field1009.method1449(58);
                boolean var279 = class66.field1009.method1428(32122) == 1;
                if (var279) {
                    var272[var273].field2497 = class66.field1009.method1449(86);
                } else {
                    var272[var273].field2497 = var272[var273].field2504;
                }
                var272[var273].field2500 = class14.method93(var272[var273].field2497, 3841);
                var272[var273].field2503 = class66.field1009.method1450((byte) 61);
                var272[var273].field2495 = class66.field1009.method1417(false);
                var272[var273].field2499 = class66.field1009.method1449(85);
                if (var272[var273].field2497.equals(class500.field7365.field3548)) {
                    class123.field1873 = var272[var273].field2495;
                }
            }
            boolean var274 = false;
            int var275 = class44.field690;
            while (var275 > 0) {
                boolean var276 = true;
                var275--;
                for (int var277 = 0; var277 < var275; var277++) {
                    if (var272[var277].field2500.compareTo(var272[var277 + 1].field2500) > 0) {
                        class169 var278 = var272[var277];
                        var272[var277] = var272[var277 + 1];
                        var272[var277 + 1] = var278;
                        var276 = false;
                    }
                }
                if (var276) {
                    break;
                }
            }
            class59.field883 = null;
            class18.field194 = var272;
            return true;
        } else if (class59.field883 == class421.field6335) {
            class223.method1528(true, class338.field4753);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class227.field3360) {
            int var280 = class66.field1009.method1424((byte) 123);
            int var281 = class66.field1009.method1465((byte) -94);
            int var282 = class66.field1009.method1465((byte) -128);
            class167 var283 = class193.field2821[var282];
            if (var283 != null) {
                class509.method3013(var280, 0, var283, var281);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class4.field48) {
            int var284 = class66.field1009.method1450((byte) 48);
            int var285 = class66.field1009.method1428(32122);
            int var286 = class66.field1009.method1428(32122);
            int var287 = class66.field1009.method1428(32122);
            int var288 = class66.field1009.method1428(32122);
            int var289 = class66.field1009.method1450((byte) 93);
            if (class203.method1375(var284, (byte) 75)) {
                class189.field2793[var285] = true;
                class335.field4724[var285] = var286;
                class441.field6592[var285] = var287;
                class131.field2029[var285] = var288;
                class5.field69[var285] = var289;
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class326.field4651) {
            int var290 = class66.field1009.method1451((byte) -47);
            int var291 = class66.field1009.method1432(23094);
            int var292 = class66.field1009.method1451((byte) -47);
            if (class203.method1375(var292, (byte) 57)) {
                class178.method1218((byte) 118, var290, var291);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class202.field2924) {
            int var293 = class66.field1009.method1451((byte) -47);
            if (var293 == 65535) {
                var293 = -1;
            }
            int var294 = class66.field1009.method1469(128);
            int var295 = class66.field1009.method1428(32122);
            class334.method2043(var293, true, var294, var295);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class333.field4694) {
            int var296 = class66.field1009.method1409(118);
            int var297 = class66.field1009.method1451((byte) -47);
            if (var297 == 65535) {
                var297 = -1;
            }
            int var298 = class66.field1009.method1424((byte) -17);
            class145.method958(var298, var297, var296, 75);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class385.field5836) {
            int var299 = class66.field1009.method1428(32122);
            if (class66.field1009.method1428(32122) == 0) {
                class186.field2762[var299] = new class230();
            } else {
                class66.field1009.field3037--;
                class186.field2762[var299] = new class230(class66.field1009);
            }
            class59.field883 = null;
            class438.field6545 = class99.field1453;
            return true;
        } else if (class59.field883 == class278.field4013) {
            String var300 = class66.field1009.method1449(113);
            int var301 = class66.field1009.method1450((byte) 49);
            String var302 = class169.field2507.method2821((byte) 49, var301).method475(class66.field1009, -59);
            class159.method1013(var302, 19, null, -87, var300, var300, var301, 0);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class525.field7771) {
            int var303 = class66.field1009.method1450((byte) 57);
            int var304 = class66.field1009.method1451((byte) -47);
            String var305 = class66.field1009.method1449(114);
            if (class203.method1375(var304, (byte) -90)) {
                class299.method1897(var305, -25805, var303);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class301.field4265) {
            if (class6.field79 != -1) {
                class110.method677(0, false, class6.field79);
            }
            class59.field883 = null;
            return true;
        } else if (class92.field1375 == class59.field883) {
            class461.method2780(115, class66.field1009.method1449(56));
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class335.field4726) {
            int var306 = class66.field1009.method1451((byte) -47);
            int var307 = class66.field1009.method1452(65280);
            if (class203.method1375(var306, (byte) -101)) {
                class199.method1351(class172.field2546, var307, 5, 0, (byte) 64);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class380.field5774) {
            int var308 = class66.field1009.method1450((byte) 54);
            int var309 = class66.field1009.method1428(32122);
            int var310 = class66.field1009.method1428(32122);
            int var311 = class66.field1009.method1450((byte) 41) << 0;
            int var312 = class66.field1009.method1428(32122);
            int var313 = class66.field1009.method1428(32122);
            if (class203.method1375(var308, (byte) -100)) {
                class290.method1860(false, var310, var311, var312, var313, var309);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class139.field2087) {
            int var314 = class66.field1009.method1450((byte) 32);
            if (class203.method1375(var314, (byte) -121)) {
                class427.method2559((byte) -112);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class431.field6449) {
            int var315 = class66.field1009.method1462((byte) -108);
            int var316 = class66.field1009.method1451((byte) -47);
            if (var316 == 65535) {
                var316 = -1;
            }
            int var317 = class66.field1009.method1432(23094);
            int var318 = class66.field1009.method1450((byte) 84);
            if (var318 == 65535) {
                var318 = -1;
            }
            int var319 = class66.field1009.method1462((byte) -109);
            if (class203.method1375(var319, (byte) -95)) {
                for (int var320 = var316; var320 <= var318; var320++) {
                    long var321 = ((long) var317 << 32) + (long) var320;
                    class387 var323 = (class387) class251.field3713.method2605(false, var321);
                    class387 var324;
                    if (var323 != null) {
                        var324 = new class387(var323.field5858, var315);
                        var323.method2049(-59);
                    } else if (var320 == -1) {
                        var324 = new class387(class149.method979((byte) -122, var317).field399.field5858, var315);
                    } else {
                        var324 = new class387(0, var315);
                    }
                    class251.field3713.method2606(var324, var321, 0);
                }
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class326.field4646) {
            class223.method1528(true, class5.field66);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class173.field2555) {
            int var325 = class66.field1009.method1423(437589608);
            int var326 = class66.field1009.method1451((byte) -47);
            int var327 = class66.field1009.method1432(23094);
            int var328 = class66.field1009.method1451((byte) -47);
            if (class203.method1375(var326, (byte) -126)) {
                class199.method1351(var328, var325, 5, var327, (byte) 64);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class334.field4705) {
            class223.method1528(true, class489.field7225);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class511.field7476) {
            int var329 = class66.field1009.method1424((byte) -97);
            int var330 = class66.field1009.method1424((byte) 112);
            if (var329 == 255) {
                var329 = -1;
                var330 = -1;
            }
            class225.method1532(var330, var329, -27617);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class456.field6748) {
            boolean var331 = class66.field1009.method1428(32122) == 1;
            String var332 = class66.field1009.method1449(62);
            String var333 = var332;
            if (var331) {
                var333 = class66.field1009.method1449(44);
            }
            long var334 = class66.field1009.method1425(21985);
            long var336 = (long) class66.field1009.method1450((byte) 119);
            long var338 = (long) class66.field1009.method1458((byte) -10);
            int var340 = class66.field1009.method1428(32122);
            int var341 = class66.field1009.method1450((byte) 89);
            long var342 = (var336 << 32) + var338;
            boolean var344 = false;
            int var345 = 0;
            while (true) {
                if (var345 >= 100) {
                    if (var340 <= 1 && class135.method898(117, var333)) {
                        var344 = true;
                    }
                    break;
                }
                if (class120.field1810[var345] == var342) {
                    var344 = true;
                    break;
                }
                var345++;
            }
            if (!var344 && class269.field3927 == 0) {
                class120.field1810[class417.field6241] = var342;
                class417.field6241 = (class417.field6241 + 1) % 100;
                String var346 = class169.field2507.method2821((byte) 40, var341).method475(class66.field1009, -57);
                if (var340 == 2) {
                    class159.method1013(var346, 20, class485.method2876(var334, (byte) 102), -124, "<img=1>" + var333, "<img=1>" + var332, var341, 0);
                } else if (var340 == 1) {
                    class159.method1013(var346, 20, class485.method2876(var334, (byte) 34), -90, "<img=0>" + var333, "<img=0>" + var332, var341, 0);
                } else {
                    class159.method1013(var346, 20, class485.method2876(var334, (byte) 65), -84, var333, var332, var341, 0);
                }
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class39.field573) {
            class223.method1528(true, class442.field6595);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class246.field3625) {
            boolean var347 = class66.field1009.method1428(32122) == 1;
            String var348 = class66.field1009.method1449(80);
            String var349 = var348;
            if (var347) {
                var349 = class66.field1009.method1449(88);
            }
            long var350 = (long) class66.field1009.method1450((byte) 66);
            long var352 = (long) class66.field1009.method1458((byte) -10);
            int var354 = class66.field1009.method1428(32122);
            long var355 = (var350 << 32) + var352;
            boolean var357 = false;
            int var358 = 0;
            while (true) {
                if (var358 >= 100) {
                    if (var354 <= 1) {
                        if (!(!class56.field871 || class447.field6665) || class214.field3124) {
                            var357 = true;
                        } else if (class135.method898(-102, var349)) {
                            var357 = true;
                        }
                    }
                    break;
                }
                if (class120.field1810[var358] == var355) {
                    var357 = true;
                    break;
                }
                var358++;
            }
            if (!var357 && class269.field3927 == 0) {
                class120.field1810[class417.field6241] = var355;
                class417.field6241 = (class417.field6241 + 1) % 100;
                String var359 = class323.method2003(1, class282.method1825(class66.field1009, -2));
                if (var354 == 2) {
                    class159.method1013(var359, 7, null, 115, "<img=1>" + var349, "<img=1>" + var348, -1, 0);
                } else if (var354 == 1) {
                    class159.method1013(var359, 7, null, -96, "<img=0>" + var349, "<img=0>" + var348, -1, 0);
                } else {
                    class159.method1013(var359, 3, null, 97, var349, var348, -1, 0);
                }
            }
            class59.field883 = null;
            return true;
        } else if (class73.field1085 == class59.field883) {
            int var360 = class66.field1009.method1450((byte) 91);
            int var361 = class66.field1009.method1428(32122);
            int var362 = class66.field1009.method1428(32122);
            int var363 = class66.field1009.method1450((byte) 98) << 0;
            int var364 = class66.field1009.method1428(32122);
            int var365 = class66.field1009.method1428(32122);
            if (class203.method1375(var360, (byte) 54)) {
                class155.method997(var363, true, (byte) 102, var361, var365, var364, var362);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class407.field6137) {
            int var366 = class66.field1009.method1462((byte) -37);
            int var367 = class66.field1009.method1469(128);
            class49.field796.method1214(-1, var367, var366);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class329.field4674) {
            String var368 = class66.field1009.method1449(39);
            int var369 = class66.field1009.method1462((byte) -115);
            int var370 = class66.field1009.method1462((byte) -113);
            if (class203.method1375(var370, (byte) 98)) {
                class299.method1897(var368, -25805, var369);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class310.field4452) {
            class64.field972 = class180.method1222(class66.field1009.method1428(32122), (byte) 101);
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class475.field6991) {
            int var371 = class66.field1009.method1465((byte) -67);
            int var372 = class66.field1009.method1451((byte) -47);
            if (var372 == 65535) {
                var372 = -1;
            }
            int var373 = class66.field1009.method1423(437589608);
            if (class203.method1375(var371, (byte) 73)) {
                class199.method1351(var372, var373, 2, -1, (byte) 64);
            }
            class59.field883 = null;
            return true;
        } else if (class59.field883 == class471.field6936) {
            int var374 = class66.field1009.method1450((byte) 99);
            String var375 = class66.field1009.method1449(72);
            Object[] var376 = new Object[var375.length() + 1];
            for (int var377 = var375.length() - 1; var377 >= 0; var377--) {
                if (var375.charAt(var377) == 's') {
                    var376[var377 + 1] = class66.field1009.method1449(38);
                } else {
                    var376[var377 + 1] = Integer.valueOf(class66.field1009.method1452(65280));
                }
            }
            var376[0] = Integer.valueOf(class66.field1009.method1452(65280));
            if (class203.method1375(var374, (byte) -81)) {
                class168 var378 = new class168();
                var378.field2484 = var376;
                class360.method2238(var378);
            }
            class59.field883 = null;
            return true;
        } else {
            if (!arg0) {
                method2389(16);
            }
            if (class59.field883 == class315.field4497) {
                int var379 = class66.field1009.method1432(23094);
                int var380 = class66.field1009.method1462((byte) -42);
                String var381 = class66.field1009.method1449(45);
                if (class203.method1375(var380, (byte) 99)) {
                    class269.method1775(20282, var379, var381);
                }
                class59.field883 = null;
                return true;
            } else if (class59.field883 == class25.field265) {
                int var382 = class66.field1009.method1450((byte) 79);
                int var383 = class66.field1009.method1452(65280);
                int var384 = class66.field1009.method1451((byte) -47);
                int var385 = class66.field1009.method1465((byte) -67);
                int var386 = class66.field1009.method1465((byte) -67);
                if (class203.method1375(var386, (byte) 79)) {
                    class98.method605(115, var384, var385, var382, var383);
                }
                class59.field883 = null;
                return true;
            } else if (class59.field883 == class133.field2045) {
                class223.method1528(true, class352.field5397);
                class59.field883 = null;
                return true;
            } else if (class59.field883 == class138.field2073) {
                class314.field4479 = class66.field1009.method1424((byte) 122);
                class27.field286 = class66.field1009.method1417(false) << 3;
                class37.field394 = class66.field1009.method1440((byte) 110) << 3;
                class59.field883 = null;
                return true;
            } else if (class59.field883 == class334.field4714) {
                class223.method1528(arg0, class400.field6007);
                class59.field883 = null;
                return true;
            } else if (class59.field883 == class179.field2635) {
                class27.field286 = class66.field1009.method1438(3) << 3;
                class314.field4479 = class66.field1009.method1469(128);
                class37.field394 = class66.field1009.method1442(108) << 3;
                while (class66.field1009.field3037 < class352.field5395) {
                    class327 var387 = class130.method864(110)[class66.field1009.method1428(32122)];
                    class223.method1528(arg0, var387);
                }
                class59.field883 = null;
                return true;
            } else if (class59.field883 == class287.field4113) {
                int var388 = class66.field1009.method1465((byte) 80);
                int var389 = class66.field1009.method1464((byte) 102);
                int var390 = class66.field1009.method1423(437589608);
                if (class203.method1375(var388, (byte) 79)) {
                    class8.method49(var390, -787791453, var389);
                }
                class59.field883 = null;
                return true;
            } else if (class59.field883 == class397.field5958) {
                boolean var391 = class66.field1009.method1428(32122) == 1;
                String var392 = class66.field1009.method1449(41);
                String var393 = var392;
                if (var391) {
                    var393 = class66.field1009.method1449(108);
                }
                long var394 = (long) class66.field1009.method1450((byte) 86);
                long var396 = (long) class66.field1009.method1458((byte) -10);
                int var398 = class66.field1009.method1428(32122);
                int var399 = class66.field1009.method1450((byte) 86);
                long var400 = (var394 << 32) + var396;
                boolean var402 = false;
                int var403 = 0;
                while (true) {
                    if (var403 >= 100) {
                        if (var398 <= 1 && class135.method898(-8, var393)) {
                            var402 = true;
                        }
                        break;
                    }
                    if (class120.field1810[var403] == var400) {
                        var402 = true;
                        break;
                    }
                    var403++;
                }
                if (!var402 && class269.field3927 == 0) {
                    class120.field1810[class417.field6241] = var400;
                    class417.field6241 = (class417.field6241 + 1) % 100;
                    String var404 = class169.field2507.method2821((byte) 80, var399).method475(class66.field1009, 110);
                    if (var398 == 2) {
                        class159.method1013(var404, 18, null, 111, "<img=1>" + var393, "<img=1>" + var392, var399, 0);
                    } else if (var398 == 1) {
                        class159.method1013(var404, 18, null, -125, "<img=0>" + var393, "<img=0>" + var392, var399, 0);
                    } else {
                        class159.method1013(var404, 18, null, 120, var393, var392, var399, 0);
                    }
                }
                class59.field883 = null;
                return true;
            } else {
                class235.method1598(null, "T1 - " + (class59.field883 == null ? -1 : class59.field883.method420(1)) + "," + (class80.field1218 == null ? -1 : class80.field1218.method420(1)) + "," + (class471.field6941 == null ? -1 : class471.field6941.method420(1)) + " - " + class352.field5395, (byte) 57);
                class246.method1653(-4548);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V", line = 3171)
    public static void method2389(int arg0) {
        field5934 = null;
        if (arg0 <= 0) {
            field5934 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)V", line = 3182)
    private static final void method2390(int arg0, int arg1, int arg2) {
        field5937++;
        class338 var3 = class230.method1580(14, -1332166328, arg1);
        int var4 = 25 % ((-arg2 - 25) / 59);
        var3.method2053(-127);
        var3.field4756 = arg0;
    }
}
