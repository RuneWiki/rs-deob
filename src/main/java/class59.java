import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class59 extends class207 {

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "Ljd;")
    public class86 field1189;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Lqc;")
    public static class62 field1184;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[Lwj;IIZI)V")
    public static final void method425(int arg0, class6[] arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var6 = 50 % ((arg5 + 57) / 55);
        for (int var7 = 0; var7 < arg1.length; var7++) {
            class6 var8 = arg1[var7];
            if (var8 != null && var8.field221 == arg3) {
                class224.method1572(var8, 109, arg2, arg4, arg0);
                class144.method1024(arg0, var8, (byte) 123, arg2);
                if (var8.field138 > var8.field114 - var8.field163) {
                    var8.field138 = var8.field114 - var8.field163;
                }
                if (var8.field138 < 0) {
                    var8.field138 = 0;
                }
                if (var8.field102 > (var8.field199 - var8.field131)) {
                    var8.field102 = var8.field199 - var8.field131;
                }
                if (var8.field102 < 0) {
                    var8.field102 = 0;
                }
                if (var8.field184 == 0) {
                    class142.method1010(var8, arg4, -126);
                }
            }
        }
        field1183++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static void method426(byte arg0) {
        if (arg0 < 14) {
            field1184 = null;
        }
        field1184 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Li;I)V")
    public static final void method427(class55 arg0, int arg1) {
        field1186++;
        class113.method796(arg1, arg1 ^ 0xFFFCE55A, arg0);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([BZII)Z")
    public static final boolean method428(byte[] arg0, boolean arg1, int arg2, int arg3) {
        field1185++;
        class200 var4 = new class200(arg0);
        int var5 = -1;
        boolean var6 = arg1;
        label70: while (true) {
            int var7 = var4.method1424(32767);
            if (var7 == 0) {
                return var6;
            }
            var5 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class117 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var4.method1402(20740);
                                        if (var17 == 0) {
                                            continue label70;
                                        }
                                        var4.method1408((byte) -78);
                                    }
                                    int var10 = var4.method1402(20740);
                                    if (var10 == 0) {
                                        continue label70;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 >> 6 & 0x3F;
                                    int var12 = var8 & 0x3F;
                                    var13 = var4.method1408((byte) -98) >> 2;
                                    var14 = arg2 + var11;
                                    var15 = arg3 + var12;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class268.method1845(var5, (byte) -45);
                } while (var13 == 22 && !class116.field2224 && var16.field2301 == 0 && var16.field2288 != 1 && !var16.field2244);
                if (!var16.method829((byte) -67)) {
                    class169.field3124++;
                    var6 = false;
                }
                var9 = true;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
    public class59() {
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Ljd;I)V")
    public class59(class86 arg0, int arg1) {
        this.field1189 = arg0;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)Z")
    public static final boolean method429(byte arg0) throws IOException {
        field1190++;
        if (class248.field4415 == null) {
            return false;
        }
        int var1 = class248.field4415.method208(-11084);
        if (var1 == 0) {
            return false;
        }
        if (class44.field969 == -1) {
            var1--;
            class248.field4415.method210(class168.field3102.field3547, (byte) 114, 0, 1);
            class168.field3102.field3565 = 0;
            class44.field969 = class168.field3102.method1353(-16511);
            class112.field2143 = class268.field4726[class44.field969];
        }
        if (class112.field2143 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class248.field4415.method210(class168.field3102.field3547, (byte) -110, 0, 1);
            var1--;
            class112.field2143 = class168.field3102.field3547[0] & 0xFF;
        }
        if (class112.field2143 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class248.field4415.method210(class168.field3102.field3547, (byte) 82, 0, 2);
            var1 -= 2;
            class168.field3102.field3565 = 0;
            class112.field2143 = class168.field3102.method1410(-92);
        }
        if (class112.field2143 > var1) {
            return false;
        }
        class168.field3102.field3565 = 0;
        class248.field4415.method210(class168.field3102.field3547, (byte) -119, 0, class112.field2143);
        class217.field3916 = class116.field2234;
        class116.field2234 = class255.field4539;
        class255.field4539 = class44.field969;
        class34.field784 = 0;
        if (class44.field969 == 92) {
            int var2 = class168.field3102.method1375(22484);
            int var3 = class168.field3102.method1410(-104);
            int var4 = class168.field3102.method1383(55);
            if (class152.method1116((byte) -64, var3)) {
                class243.method1658(var2, var4, 3);
            }
            class44.field969 = -1;
            return true;
        } else if (class44.field969 == 102) {
            int var5 = class168.field3102.method1407(255);
            int var6 = class168.field3102.method1408((byte) -118);
            int var7 = class168.field3102.method1431((byte) 16);
            class180.field3244 = var5 >> 1;
            class124.field2412.method1570(var6, (var5 & 0x1) == 1, var7, -120);
            class44.field969 = -1;
            return true;
        } else if (class44.field969 == 27) {
            int var8 = class168.field3102.method1401(2080652896);
            int var9 = class168.field3102.method1431((byte) 63);
            int var10 = class168.field3102.method1401(2080652896);
            if (class152.method1116((byte) -64, var8)) {
                if (var9 == 2) {
                    class104.method743(84);
                }
                class178.field3225 = var10;
                class171.method1228((byte) 98, var10);
                class241.method1651(false, (byte) 36);
                class244.method1663(false, class178.field3225);
                for (int var11 = 0; var11 < 100; var11++) {
                    class21.field540[var11] = true;
                }
            }
            class44.field969 = -1;
            return true;
        } else if (class44.field969 == 99) {
            int var12 = class168.field3102.method1401(2080652896);
            class86 var13 = class168.field3102.method1376((byte) 24);
            int var14 = class168.field3102.method1410(-118);
            if (class152.method1116((byte) -64, var14)) {
                class117.method838(var12, 336, var13);
            }
            class44.field969 = -1;
            return true;
        } else if (class44.field969 == 134) {
            class34.method263(-58, true);
            class44.field969 = -1;
            return true;
        } else if (class44.field969 == 219) {
            class186.field3299 = class168.field3102.method1408((byte) -101);
            class44.field969 = -1;
            return true;
        } else if (class44.field969 == 108) {
            class79.method555(0, class112.field2143, class168.field3102, class157.field2954);
            class44.field969 = -1;
            return true;
        } else if (class44.field969 == 105) {
            int var15 = class168.field3102.method1393(0);
            class6 var16 = class25.method178(83, var15);
            for (int var17 = 0; var17 < var16.field232.length; var17++) {
                var16.field232[var17] = -1;
                var16.field232[var17] = 0;
            }
            class62.method441(-29481, var16);
            class44.field969 = -1;
            return true;
        } else if (class44.field969 == 67) {
            class38.field895 = class168.field3102.method1407(255);
            class76.field1519 = class168.field3102.method1407(255);
            while (class168.field3102.field3565 < class112.field2143) {
                class44.field969 = class168.field3102.method1408((byte) -103);
                class168.method1209((byte) -123);
            }
            class44.field969 = -1;
            return true;
        } else if (class44.field969 == 248) {
            class56.field1146 = class112.field2143 / 8;
            for (int var18 = 0; var18 < class56.field1146; var18++) {
                class119.field2325[var18] = class168.field3102.method1409(-111);
                class185.field3283[var18] = class202.method1440(class119.field2325[var18], (byte) 65);
            }
            class177.field3207 = class27.field621;
            class44.field969 = -1;
            return true;
        } else if (class44.field969 == 129) {
            class86 var19 = class168.field3102.method1376((byte) 24);
            if (var19.method601(class50.field1049, (byte) -109)) {
                class86 var20 = var19.method610(0, var19.method604(class130.field2480, true), (byte) -81);
                boolean var21 = false;
                long var22 = var20.method622(-2);
                for (int var24 = 0; var24 < class56.field1146; var24++) {
                    if (class119.field2325[var24] == var22) {
                        var21 = true;
                        break;
                    }
                }
                if (!var21 && class200.field3545 == 0) {
                    class58.method423(class240.field4320, false, 4, var20);
                }
            } else if (var19.method601(class184.field3270, (byte) -109)) {
                class86 var25 = var19.method610(0, var19.method604(class130.field2480, true), (byte) -81);
                long var26 = var25.method622(-2);
                boolean var28 = false;
                for (int var29 = 0; var29 < class56.field1146; var29++) {
                    if (class119.field2325[var29] == var26) {
                        var28 = true;
                        break;
                    }
                }
                if (!var28 && class200.field3545 == 0) {
                    class86 var30 = var19.method610(var19.method604(class130.field2480, true) + 1, var19.method612((byte) 127) + -9, (byte) -81);
                    class58.method423(var30, false, 8, var25);
                }
            } else if (var19.method601(class180.field3245, (byte) -109)) {
                class86 var31 = var19.method610(0, var19.method604(class130.field2480, true), (byte) -81);
                boolean var32 = false;
                long var33 = var31.method622(-2);
                for (int var35 = 0; var35 < class56.field1146; var35++) {
                    if (class119.field2325[var35] == var33) {
                        var32 = true;
                        break;
                    }
                }
                if (!var32 && class200.field3545 == 0) {
                    class58.method423(class56.field1155, false, 10, var31);
                }
            } else if (var19.method601(class140.field2666, (byte) -109)) {
                class86 var59 = var19.method610(0, var19.method604(class140.field2666, true), (byte) -81);
                class58.method423(var59, false, 11, class56.field1155);
            } else if (var19.method601(class92.field1873, (byte) -109)) {
                class86 var58 = var19.method610(0, var19.method604(class92.field1873, true), (byte) -81);
                if (class200.field3545 == 0) {
                    class58.method423(var58, false, 12, class56.field1155);
                }
            } else if (var19.method601(class190.field3368, (byte) -109)) {
                class86 var57 = var19.method610(0, var19.method604(class190.field3368, true), (byte) -81);
                if (class200.field3545 == 0) {
                    class58.method423(var57, false, 13, class56.field1155);
                }
            } else if (var19.method601(class25.field602, (byte) -109)) {
                class86 var36 = var19.method610(0, var19.method604(class130.field2480, true), (byte) -81);
                long var37 = var36.method622(-2);
                boolean var39 = false;
                for (int var40 = 0; var40 < class56.field1146; var40++) {
                    if (class119.field2325[var40] == var37) {
                        var39 = true;
                        break;
                    }
                }
                if (!var39 && class200.field3545 == 0) {
                    class58.method423(class56.field1155, false, 14, var36);
                }
            } else if (var19.method601(class253.field4495, (byte) -109)) {
                class86 var52 = var19.method610(0, var19.method604(class130.field2480, true), (byte) -81);
                long var53 = var52.method622(-2);
                boolean var55 = false;
                for (int var56 = 0; var56 < class56.field1146; var56++) {
                    if (class119.field2325[var56] == var53) {
                        var55 = true;
                        break;
                    }
                }
                if (!var55 && class200.field3545 == 0) {
                    class58.method423(class56.field1155, false, 15, var52);
                }
            } else if (var19.method601(class121.field2346, (byte) -109)) {
                class86 var41 = var19.method610(0, var19.method604(class130.field2480, true), (byte) -81);
                boolean var42 = false;
                long var43 = var41.method622(-2);
                for (int var45 = 0; var45 < class56.field1146; var45++) {
                    if (class119.field2325[var45] == var43) {
                        var42 = true;
                        break;
                    }
                }
                if (!var42 && class200.field3545 == 0) {
                    class58.method423(class56.field1155, false, 16, var41);
                }
            } else if (var19.method601(class232.field4198, (byte) -109)) {
                class86 var46 = var19.method610(0, var19.method604(class130.field2480, true), (byte) -81);
                boolean var47 = false;
                long var48 = var46.method622(-2);
                for (int var50 = 0; var50 < class56.field1146; var50++) {
                    if (class119.field2325[var50] == var48) {
                        var47 = true;
                        break;
                    }
                }
                if (!var47 && class200.field3545 == 0) {
                    class86 var51 = var19.method610(var19.method604(class130.field2480, true) + 1, var19.method612((byte) 84) + -9, (byte) -81);
                    class58.method423(var51, false, 21, var46);
                }
            } else {
                class58.method423(var19, false, 0, class56.field1155);
            }
            class44.field969 = -1;
            return true;
        } else if (class44.field969 == 13) {
            int var60 = class168.field3102.method1398((byte) 123);
            int var61 = class168.field3102.method1414(-16777216);
            int var62 = class168.field3102.method1413(-11011);
            if (class152.method1116((byte) -64, var62)) {
                class205.method1463(var61, var60, (byte) -122);
            }
            class44.field969 = -1;
            return true;
        } else if (class44.field969 == 131) {
            class41.method336((byte) 104);
            class257.field4565 = class168.field3102.method1421((byte) 102);
            class44.field969 = -1;
            class111.field2127 = class27.field621;
            return true;
        } else if (class44.field969 == 135) {
            int var63 = class168.field3102.method1386(-4603);
            int var64 = class168.field3102.method1386(-4603);
            int var65 = class168.field3102.method1410(-52);
            if (class152.method1116((byte) -64, var65)) {
                class1 var66 = (class1) class1.field15.method1698((long) var63, (byte) 114);
                class1 var67 = (class1) class1.field15.method1698((long) var64, (byte) -36);
                if (var67 != null) {
                    class233.method1616(true, var67, var66 == null || var66.field2 != var67.field2);
                }
                if (var66 != null) {
                    var66.method1477(1);
                    class1.field15.method1699(-28407, var66, (long) var64);
                }
                class6 var68 = class25.method178(89, var63);
                if (var68 != null) {
                    class62.method441(-29481, var68);
                }
                class6 var69 = class25.method178(98, var64);
                if (var69 != null) {
                    class62.method441(-29481, var69);
                    class142.method1010(var69, true, -126);
                }
                if (class178.field3225 != -1) {
                    class67.method476((byte) 93, 1, class178.field3225);
                }
            }
            class44.field969 = -1;
            return true;
        } else if (class44.field969 == 56) {
            class86 var70 = class168.field3102.method1376((byte) 24);
            int var71 = class168.field3102.method1389((byte) -92);
            int var72 = class168.field3102.method1407(255);
            if (var72 >= 1 && var72 <= 8) {
                if (var70.method631(12508, class4.field55)) {
                    var70 = null;
                }
                class241.field4328[var72 - 1] = var70;
                class37.field859[var72 - 1] = var71 == 0;
            }
            class44.field969 = -1;
            return true;
        } else if (class44.field969 == 25) {
            class206.method1469(false);
            class44.field969 = -1;
            return true;
        } else if (class44.field969 == 14) {
            class86 var73 = class168.field3102.method1376((byte) 24);
            int var74 = class168.field3102.method1383(78);
            int var75 = class168.field3102.method1413(-11011);
            if (class152.method1116((byte) -64, var74)) {
                class117.method838(var75, 336, var73);
            }
            class44.field969 = -1;
            return true;
        } else {
            int var76 = -114 % ((arg0 - 32) / 63);
            if (class44.field969 == 196) {
                int var77 = class168.field3102.method1401(2080652896);
                int var78 = class168.field3102.method1413(-11011);
                int var79 = class168.field3102.method1383(126);
                int var80 = class168.field3102.method1386(-4603);
                int var81 = class168.field3102.method1401(2080652896);
                if (class152.method1116((byte) -64, var77)) {
                    class171.method1223(var80, 50, var81, var78, var79);
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 95) {
                int var82 = class168.field3102.method1413(-11011);
                class258.method1742(var82, (byte) 90);
                class125.field2421[class1.method5(class273.field4791++, 31)] = class1.method5(32767, var82);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 218) {
                int var83 = class168.field3102.method1383(49);
                if (var83 == 65535) {
                    var83 = -1;
                }
                int var84 = class168.field3102.method1375(22484);
                int var85 = class168.field3102.method1401(2080652896);
                if (class152.method1116((byte) -64, var85)) {
                    class117.method837(var83, var84, true, 2);
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 53) {
                int var86 = class168.field3102.method1410(-80);
                int var87 = class168.field3102.method1408((byte) -75);
                if (var86 == 65535) {
                    var86 = -1;
                }
                int var88 = class168.field3102.method1410(-61);
                class37.method310(var86, var88, var87, 50);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 136) {
                int var89 = class168.field3102.method1393(0);
                int var90 = class168.field3102.method1413(-11011);
                int var91 = class168.field3102.method1410(-105);
                int var92 = class168.field3102.method1410(-124);
                if (var92 == 65535) {
                    var92 = -1;
                }
                int var93 = class168.field3102.method1393(0);
                if (var90 == 65535) {
                    var90 = -1;
                }
                if (class152.method1116((byte) -64, var91)) {
                    for (int var94 = var92; var94 <= var90; var94++) {
                        long var95 = ((long) var93 << 32) + (long) var94;
                        class207 var97 = class56.field1132.method1698(var95, (byte) -38);
                        if (var97 != null) {
                            var97.method1477(1);
                        }
                        class56.field1132.method1699(-28407, new class2(var89), var95);
                    }
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 72) {
                int var98 = class168.field3102.method1375(22484);
                class96.field1897 = class157.field2954.method1722(var98, 3);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 120) {
                int var99 = class168.field3102.method1386(-4603);
                int var100 = class168.field3102.method1410(-115);
                if (var99 < -70000) {
                    var100 += 32768;
                }
                class6 var101;
                if (var99 >= 0) {
                    var101 = class25.method178(69, var99);
                } else {
                    var101 = null;
                }
                while (class168.field3102.field3565 < class112.field2143) {
                    int var102 = class168.field3102.method1402(20740);
                    int var103 = class168.field3102.method1410(-114);
                    int var104 = 0;
                    if (var103 != 0) {
                        var104 = class168.field3102.method1408((byte) -24);
                        if (var104 == 255) {
                            var104 = class168.field3102.method1386(-4603);
                        }
                    }
                    if (var101 != null && var102 >= 0 && var102 < var101.field232.length) {
                        var101.field232[var102] = var103;
                        var101.field201[var102] = var104;
                    }
                    class17.method130(var100, var102, var104, var103 - 1, (byte) -111);
                }
                if (var101 != null) {
                    class62.method441(-29481, var101);
                }
                class41.method336((byte) 104);
                class125.field2421[class1.method5(31, class273.field4791++)] = class1.method5(var100, 32767);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 81) {
                int var105 = class168.field3102.method1413(-11011);
                if (var105 == 65535) {
                    var105 = -1;
                }
                int var106 = class168.field3102.method1407(255);
                int var107 = var106 >> 2;
                int var108 = class100.field1955[var107];
                int var109 = class168.field3102.method1393(0);
                int var110 = var106 & 0x3;
                int var111 = (var109 & 0x3423BF89) >> 28;
                int var112 = (var109 & 0xFFFC6E3) >> 14;
                int var113 = var109 & 0x3FFF;
                int var114 = var112 - class252.field4481;
                int var115 = var113 - class79.field1554;
                class122.method870(var110, var114, var111, var115, var108, var107, var105, -11433);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 250) {
                int var116 = class168.field3102.method1408((byte) -74);
                if (class168.field3102.method1408((byte) -114) == 0) {
                    class111.field2123[var116] = new class188();
                } else {
                    class168.field3102.field3565--;
                    class111.field2123[var116] = new class188(class168.field3102);
                }
                class44.field969 = -1;
                class191.field3396 = class27.field621;
                return true;
            } else if (class44.field969 == 85) {
                int var117 = class168.field3102.method1383(58);
                int var118 = class168.field3102.method1393(0);
                class195.method1361(var117, 19305, var118);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 199) {
                for (int var119 = 0; var119 < class186.field3294.length; var119++) {
                    if (class186.field3294[var119] != null) {
                        class186.field3294[var119].field683 = -1;
                    }
                }
                for (int var120 = 0; var120 < class233.field4217.length; var120++) {
                    if (class233.field4217[var120] != null) {
                        class233.field4217[var120].field683 = -1;
                    }
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 66) {
                long var121 = class168.field3102.method1409(-107);
                int var123 = class168.field3102.method1410(-70);
                class86 var124 = class177.method1244(var123, 1).method799(class168.field3102, 1);
                class9.method58(var123, (class86) null, class202.method1440(var121, (byte) 103).method608((byte) 23), (byte) -124, var124, 19);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 98) {
                class142.method1008((byte) 99);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 224) {
                long var125 = class168.field3102.method1409(-112);
                int var127 = class168.field3102.method1410(-90);
                int var128 = class168.field3102.method1408((byte) -100);
                boolean var129 = true;
                if (var125 < 0L) {
                    var129 = false;
                    var125 &= Long.MAX_VALUE;
                }
                class86 var130 = class56.field1155;
                if (var127 > 0) {
                    var130 = class168.field3102.method1376((byte) 24);
                }
                class86 var131 = class202.method1440(var125, (byte) 87).method608((byte) 105);
                for (int var132 = 0; var132 < class97.field1928; var132++) {
                    if (class209.field3780[var132] == var125) {
                        if (class98.field1944[var132] != var127) {
                            class98.field1944[var132] = var127;
                            if (var127 > 0) {
                                class58.method423(class109.method783(2, new class86[] { var131, class9.field296 }), false, 5, class56.field1155);
                            }
                            if (var127 == 0) {
                                class58.method423(class109.method783(2, new class86[] { var131, class88.field1768 }), false, 5, class56.field1155);
                            }
                        }
                        var131 = null;
                        class207.field3755[var132] = var130;
                        class140.field2664[var132] = var128;
                        class137.field2610[var132] = var129;
                        break;
                    }
                }
                if (var131 != null && class97.field1928 < 200) {
                    class209.field3780[class97.field1928] = var125;
                    class100.field1957[class97.field1928] = var131;
                    class98.field1944[class97.field1928] = var127;
                    class207.field3755[class97.field1928] = var130;
                    class140.field2664[class97.field1928] = var128;
                    class137.field2610[class97.field1928] = var129;
                    class97.field1928++;
                }
                boolean var133 = false;
                class177.field3207 = class27.field621;
                int var134 = class97.field1928;
                while (var134 > 0) {
                    boolean var135 = true;
                    var134--;
                    for (int var136 = 0; var136 < var134; var136++) {
                        if (class98.field1944[var136] != class147.field2766 && class98.field1944[var136 + 1] == class147.field2766 || class98.field1944[var136] == 0 && class98.field1944[var136 + 1] != 0) {
                            int var137 = class98.field1944[var136];
                            class98.field1944[var136] = class98.field1944[var136 + 1];
                            class98.field1944[var136 + 1] = var137;
                            var135 = false;
                            class86 var138 = class207.field3755[var136];
                            class207.field3755[var136] = class207.field3755[var136 + 1];
                            class207.field3755[var136 + 1] = var138;
                            class86 var139 = class100.field1957[var136];
                            class100.field1957[var136] = class100.field1957[var136 + 1];
                            class100.field1957[var136 + 1] = var139;
                            long var140 = class209.field3780[var136];
                            class209.field3780[var136] = class209.field3780[var136 + 1];
                            class209.field3780[var136 + 1] = var140;
                            int var142 = class140.field2664[var136];
                            class140.field2664[var136] = class140.field2664[var136 + 1];
                            class140.field2664[var136 + 1] = var142;
                            boolean var143 = class137.field2610[var136];
                            class137.field2610[var136] = class137.field2610[var136 + 1];
                            class137.field2610[var136 + 1] = var143;
                        }
                    }
                    if (var135) {
                        break;
                    }
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 143) {
                int var144 = class168.field3102.method1408((byte) -45);
                int var145 = class168.field3102.method1408((byte) -80);
                int var146 = class168.field3102.method1408((byte) -52);
                int var147 = class168.field3102.method1408((byte) -47);
                int var148 = class168.field3102.method1410(-107);
                class25.field606[var144] = true;
                class62.field1218[var144] = var145;
                class143.field2717[var144] = var146;
                class188.field3328[var144] = var147;
                class50.field1051[var144] = var148;
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 33) {
                int var149 = class168.field3102.method1410(-58);
                int var150 = class168.field3102.method1410(-80);
                int var151 = class168.field3102.method1386(-4603);
                int var152 = class168.field3102.method1410(-56);
                if (var151 >> 30 != 0) {
                    int var161 = ((var151 & 0xFFFC95D) >> 14) - class252.field4481;
                    int var162 = (var151 & 0x31D488FC) >> 28;
                    int var163 = (var151 & 0x3FFF) - class79.field1554;
                    if (var161 >= 0 && var163 >= 0 && var161 < 104 && var163 < 104) {
                        int var164 = var163 * 128 + 64;
                        int var165 = var161 * 128 + 64;
                        class82 var166 = new class82(var152, var162, var165, var164, class30.method198(31482, var165, var164, var162) - var150, var149, class236.field4265);
                        class187.field3313.method1731(-59, new class178(var166));
                    }
                } else if ((var151 >> 29) != 0) {
                    int var153 = var151 & 0xFFFF;
                    class170 var154 = class233.field4217[var153];
                    if (var154 != null) {
                        var154.field690 = var152;
                        var154.field741 = class236.field4265 + var149;
                        var154.field713 = 0;
                        var154.field722 = var150;
                        if (var154.field690 == 65535) {
                            var154.field690 = -1;
                        }
                        var154.field691 = 0;
                        if (var154.field741 > class236.field4265) {
                            var154.field691 = -1;
                        }
                        if (var154.field690 != -1 && class236.field4265 == var154.field741) {
                            int var155 = class219.method1547(var154.field690, -117).field2466;
                            if (var155 != -1) {
                                class122 var156 = class133.method952(var155, 127);
                                if (var156 != null && var156.field2361 != null) {
                                    class168.method1212(var154.field676, 0, false, var156, 1928670186, var154.field685);
                                }
                            }
                        }
                    }
                } else if ((var151 >> 28) != 0) {
                    int var157 = var151 & 0xFFFF;
                    class224 var158;
                    if (class176.field3189 == var157) {
                        var158 = class124.field2412;
                    } else {
                        var158 = class186.field3294[var157];
                    }
                    if (var158 != null) {
                        var158.field722 = var150;
                        var158.field691 = 0;
                        var158.field741 = class236.field4265 + var149;
                        if (var158.field741 > class236.field4265) {
                            var158.field691 = -1;
                        }
                        var158.field690 = var152;
                        if (var158.field690 == 65535) {
                            var158.field690 = -1;
                        }
                        var158.field713 = 0;
                        if (var158.field690 != -1 && class236.field4265 == var158.field741) {
                            int var159 = class219.method1547(var158.field690, -122).field2466;
                            if (var159 != -1) {
                                class122 var160 = class133.method952(var159, 127);
                                if (var160 != null && var160.field2361 != null) {
                                    class168.method1212(var158.field676, 0, class124.field2412 == var158, var160, 1928670186, var158.field685);
                                }
                            }
                        }
                    }
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 44) {
                int var167 = class168.field3102.method1375(22484);
                int var168 = class168.field3102.method1383(88);
                int var169 = class168.field3102.method1389((byte) 42);
                if (class152.method1116((byte) -64, var168)) {
                    class273.method1864(7, var167, var169);
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 161) {
                long var170 = class168.field3102.method1409(-104);
                int var172 = class168.field3102.method1410(-84);
                boolean var173 = false;
                byte var174 = class168.field3102.method1412((byte) 78);
                if ((var170 & Long.MIN_VALUE) != 0L) {
                    var173 = true;
                }
                if (var173) {
                    if (class144.field2738 == 0) {
                        class44.field969 = -1;
                        return true;
                    }
                    boolean var180 = false;
                    long var181 = var170 & Long.MAX_VALUE;
                    int var183;
                    for (var183 = 0; var183 < class144.field2738 && (class162.field3053[var183].field3759 != var181 || class162.field3053[var183].field1099 != var172); var183++) {
                    }
                    if (class144.field2738 > var183) {
                        while (class144.field2738 - 1 > var183) {
                            class162.field3053[var183] = class162.field3053[var183 + 1];
                            var183++;
                        }
                        class144.field2738--;
                        class162.field3053[class144.field2738] = null;
                    }
                } else {
                    class86 var175 = class168.field3102.method1376((byte) 24);
                    class54 var176 = new class54();
                    var176.field3759 = var170;
                    var176.field1097 = class202.method1440(var176.field3759, (byte) 90);
                    var176.field1104 = var174;
                    var176.field1099 = var172;
                    var176.field1101 = var175;
                    int var177;
                    for (var177 = class144.field2738 - 1; var177 >= 0; var177--) {
                        int var178 = class162.field3053[var177].field1097.method618(var176.field1097, false);
                        if (var178 == 0) {
                            class162.field3053[var177].field1099 = var172;
                            class162.field3053[var177].field1104 = var174;
                            class162.field3053[var177].field1101 = var175;
                            class190.field3373 = class27.field621;
                            class44.field969 = -1;
                            if (class5.field66 == var170) {
                                class65.field1287 = var174;
                            }
                            return true;
                        }
                        if (var178 < 0) {
                            break;
                        }
                    }
                    if (class162.field3053.length <= class144.field2738) {
                        class44.field969 = -1;
                        return true;
                    }
                    for (int var179 = class144.field2738 - 1; var179 > var177; var179--) {
                        class162.field3053[var179 + 1] = class162.field3053[var179];
                    }
                    if (class144.field2738 == 0) {
                        class162.field3053 = new class54[100];
                    }
                    class162.field3053[var177 + 1] = var176;
                    class144.field2738++;
                    if (class5.field66 == var170) {
                        class65.field1287 = var174;
                    }
                }
                class190.field3373 = class27.field621;
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 31) {
                int var184 = class168.field3102.method1408((byte) -34);
                int var185 = var184 >> 6;
                class20 var186 = new class20();
                var186.field516 = var184 & 0x3F;
                var186.field529 = class168.field3102.method1408((byte) -50);
                if (var186.field529 >= 0 && class271.field4756.length > var186.field529) {
                    if (var186.field516 == 1 || var186.field516 == 10) {
                        var186.field531 = class168.field3102.method1410(-59);
                        class168.field3102.field3565 += 3;
                    } else if (var186.field516 >= 2 && var186.field516 <= 6) {
                        if (var186.field516 == 2) {
                            var186.field527 = 64;
                            var186.field523 = 64;
                        }
                        if (var186.field516 == 3) {
                            var186.field523 = 64;
                            var186.field527 = 0;
                        }
                        if (var186.field516 == 4) {
                            var186.field527 = 128;
                            var186.field523 = 64;
                        }
                        if (var186.field516 == 5) {
                            var186.field527 = 64;
                            var186.field523 = 0;
                        }
                        if (var186.field516 == 6) {
                            var186.field523 = 128;
                            var186.field527 = 64;
                        }
                        var186.field516 = 2;
                        var186.field535 = class168.field3102.method1410(-98);
                        var186.field521 = class168.field3102.method1410(-59);
                        var186.field525 = class168.field3102.method1408((byte) -114);
                    }
                    var186.field517 = class168.field3102.method1410(-99);
                    if (var186.field517 == 65535) {
                        var186.field517 = -1;
                    }
                    class180.field3247[var185] = var186;
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 169) {
                class135.method972((byte) 107, class168.field3102);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 36) {
                int var187 = class168.field3102.method1401(2080652896);
                int var188 = class168.field3102.method1414(-16777216);
                int var189 = class168.field3102.method1413(-11011);
                int var190 = class168.field3102.method1413(-11011);
                if (class152.method1116((byte) -64, var190)) {
                    class96.method697((var187 << 16) + var189, (byte) 118, var188);
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 146) {
                class227.field4119 = class168.field3102.method1408((byte) -102);
                class132.field2500 = class168.field3102.method1408((byte) -118);
                class17.field494 = class168.field3102.method1408((byte) -97);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 61) {
                int var191 = class168.field3102.method1410(-128);
                int var192 = class168.field3102.method1410(-116);
                class86.field1664 = var191;
                class139.field2641 = var192;
                class252.method1701(128);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 0) {
                class76.field1519 = class168.field3102.method1431((byte) 90);
                class38.field895 = class168.field3102.method1389((byte) -92);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 38) {
                int var193 = class168.field3102.method1408((byte) -69);
                int var194 = class168.field3102.method1383(99);
                int var195 = class168.field3102.method1375(22484);
                int var196 = class168.field3102.method1410(-83);
                if (class152.method1116((byte) -64, var196)) {
                    class1 var197 = (class1) class1.field15.method1698((long) var195, (byte) -93);
                    if (var197 != null) {
                        class233.method1616(true, var197, var197.field2 != var194);
                    }
                    class67.method479(var195, var193, (byte) -119, var194);
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 154) {
                long var198 = class168.field3102.method1409(-106);
                class86 var200 = class259.method1769(class188.method1295(class168.field3102, 1000).method589(-89));
                class58.method423(var200, false, 6, class202.method1440(var198, (byte) 69).method608((byte) 59));
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 65) {
                int var201 = class168.field3102.method1408((byte) -61);
                int var202 = class168.field3102.method1410(-72);
                int var203 = class168.field3102.method1410(-57);
                if (class152.method1116((byte) -64, var202)) {
                    class243.method1658(var201, var203, 3);
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 7) {
                long var204 = class168.field3102.method1409(-122);
                long var206 = (long) class168.field3102.method1410(-78);
                long var208 = (long) class168.field3102.method1405(-3);
                int var210 = class168.field3102.method1408((byte) -78);
                long var211 = (var206 << 32) + var208;
                boolean var213 = false;
                int var214 = 0;
                label1283: while (true) {
                    if (var214 >= 100) {
                        if (var210 <= 1) {
                            if (class21.field548 == 1 || class134.field2542 == 1) {
                                var213 = true;
                            } else {
                                for (int var215 = 0; var215 < class56.field1146; var215++) {
                                    if (class119.field2325[var215] == var204) {
                                        var213 = true;
                                        break label1283;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    if (class113.field2159[var214] == var211) {
                        var213 = true;
                        break;
                    }
                    var214++;
                }
                if (!var213 && class200.field3545 == 0) {
                    class113.field2159[class193.field3457] = var211;
                    class193.field3457 = (class193.field3457 + 1) % 100;
                    class86 var216 = class259.method1769(class188.method1295(class168.field3102, 1000).method589(-124));
                    if (var210 == 2 || var210 == 3) {
                        class58.method423(var216, false, 7, class109.method783(2, new class86[] { class69.field1370, class202.method1440(var204, (byte) 64).method608((byte) 100) }));
                    } else if (var210 == 1) {
                        class58.method423(var216, false, 7, class109.method783(2, new class86[] { class55.field1126, class202.method1440(var204, (byte) 100).method608((byte) 113) }));
                    } else {
                        class58.method423(var216, false, 3, class202.method1440(var204, (byte) 46).method608((byte) 69));
                    }
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 128) {
                int var217 = class168.field3102.method1414(-16777216);
                int var218 = class168.field3102.method1413(-11011);
                if (class152.method1116((byte) -64, var218)) {
                    int var219 = 0;
                    if (class124.field2412.field4019 != null) {
                        var219 = class124.field2412.field4019.method510(false);
                    }
                    class117.method837(var219, var217, true, 3);
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 113) {
                class41.method336((byte) 104);
                class73.field1481 = class168.field3102.method1408((byte) -69);
                class44.field969 = -1;
                class111.field2127 = class27.field621;
                return true;
            } else if (class44.field969 == 89) {
                byte[] var220 = new byte[class112.field2143];
                class168.field3102.method1363(class112.field2143, (byte) 19, 0, var220);
                class86 var221 = class102.method733((byte) -113, class112.field2143, 0, var220);
                if (class138.field2627 == null && class254.field4522 == 3 || !class254.field4511.startsWith("win") || class179.field3232) {
                    class109.method778(true, 3031, var221);
                } else {
                    class124.field2413 = true;
                    class97.field1931 = var221;
                    class62.field1219 = class157.field2954.method1723(5, new String(var221.method619((byte) 65), "ISO-8859-1"));
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 124) {
                if (class112.field2143 == 0) {
                    class234.field4235 = class210.field3810;
                } else {
                    class234.field4235 = class168.field3102.method1376((byte) 24);
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 74) {
                if (class178.field3225 != -1) {
                    class67.method476((byte) 94, 0, class178.field3225);
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 221) {
                int var222 = class168.field3102.method1401(2080652896);
                int var223 = class168.field3102.method1414(-16777216);
                int var224 = class168.field3102.method1383(125);
                int var225 = class168.field3102.method1401(2080652896);
                if (class152.method1116((byte) -64, var225)) {
                    class117.method837(var224 << 16 | var222, var223, true, 7);
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 160) {
                class133.field2514 = 0;
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 123) {
                class226.field4104 = class168.field3102.method1383(75) * 30;
                class111.field2127 = class27.field621;
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 63 || class44.field969 == 242 || class44.field969 == 112 || class44.field969 == 82 || class44.field969 == 165 || class44.field969 == 168 || class44.field969 == 189 || class44.field969 == 83 || class44.field969 == 116 || class44.field969 == 238 || class44.field969 == 222 || class44.field969 == 111) {
                class168.method1209((byte) -92);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 173) {
                int var226 = class168.field3102.method1413(-11011);
                if (var226 == 65535) {
                    var226 = -1;
                }
                int var227 = class168.field3102.method1386(-4603);
                int var228 = class168.field3102.method1393(0);
                int var229 = class168.field3102.method1413(-11011);
                if (class152.method1116((byte) -64, var229)) {
                    class6 var230 = class25.method178(89, var227);
                    if (var230.field217) {
                        class137.method980(var228, false, var226, var227);
                        class69 var231 = class272.method1853(0, var226);
                        class171.method1223(var227, -106, var231.field1406, var231.field1346, var231.field1350);
                        class68.method482(var227, var231.field1386, 10, var231.field1399, var231.field1371);
                    } else if (var226 == -1) {
                        class44.field969 = -1;
                        var230.field162 = 0;
                        return true;
                    } else {
                        class69 var232 = class272.method1853(0, var226);
                        var230.field110 = var232.field1406;
                        var230.field162 = 4;
                        var230.field198 = var232.field1350 * 100 / var228;
                        var230.field192 = var232.field1346;
                        var230.field195 = var226;
                        class62.method441(-29481, var230);
                    }
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 145) {
                int var233 = class168.field3102.method1386(-4603);
                int var234 = class168.field3102.method1410(-85);
                class6 var235;
                if (var233 >= 0) {
                    var235 = class25.method178(111, var233);
                } else {
                    var235 = null;
                }
                if (var233 < -70000) {
                    var234 += 32768;
                }
                if (var235 != null) {
                    for (int var236 = 0; var236 < var235.field232.length; var236++) {
                        var235.field232[var236] = 0;
                        var235.field201[var236] = 0;
                    }
                }
                class160.method1168(-111, var234);
                int var237 = class168.field3102.method1410(-105);
                for (int var238 = 0; var238 < var237; var238++) {
                    int var239 = class168.field3102.method1410(-70);
                    int var240 = class168.field3102.method1431((byte) 54);
                    if (var240 == 255) {
                        var240 = class168.field3102.method1386(-4603);
                    }
                    if (var235 != null && var235.field232.length > var238) {
                        var235.field232[var238] = var239;
                        var235.field201[var238] = var240;
                    }
                    class17.method130(var234, var238, var240, var239 - 1, (byte) -18);
                }
                if (var235 != null) {
                    class62.method441(-29481, var235);
                }
                class41.method336((byte) 104);
                class125.field2421[class1.method5(class273.field4791++, 31)] = class1.method5(32767, var234);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 178) {
                int var241 = class168.field3102.method1401(2080652896);
                int var242 = class168.field3102.method1398((byte) -107);
                int var243 = class168.field3102.method1414(-16777216);
                int var244 = class168.field3102.method1398((byte) -1);
                if (class152.method1116((byte) -64, var241)) {
                    class39.method324(var244, var243, (byte) 77, var242);
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 9) {
                class164.method1188(-116);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 18) {
                int var245 = class168.field3102.method1383(116);
                int var246 = class168.field3102.method1410(-60);
                int var247 = class168.field3102.method1408((byte) -56);
                class170 var248 = class233.field4217[var246];
                if (var248 != null) {
                    class64.method455(var245, var247, 0, var248);
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 54) {
                long var249 = class168.field3102.method1409(-106);
                class168.field3102.method1412((byte) 126);
                long var251 = class168.field3102.method1409(-106);
                long var253 = (long) class168.field3102.method1410(-95);
                long var255 = (long) class168.field3102.method1405(-3);
                boolean var257 = false;
                long var258 = (var253 << 32) + var255;
                int var260 = class168.field3102.method1408((byte) -59);
                int var261 = class168.field3102.method1410(-70);
                int var262 = 0;
                label1327: while (true) {
                    if (var262 >= 100) {
                        if (var260 <= 1) {
                            for (int var263 = 0; var263 < class56.field1146; var263++) {
                                if (class119.field2325[var263] == var249) {
                                    var257 = true;
                                    break label1327;
                                }
                            }
                        }
                        break;
                    }
                    if (class113.field2159[var262] == var258) {
                        var257 = true;
                        break;
                    }
                    var262++;
                }
                if (!var257 && class200.field3545 == 0) {
                    class113.field2159[class193.field3457] = var258;
                    class193.field3457 = (class193.field3457 + 1) % 100;
                    class86 var264 = class177.method1244(var261, 1).method799(class168.field3102, 1);
                    if (var260 == 2 || var260 == 3) {
                        class9.method58(var261, class202.method1440(var251, (byte) 115).method608((byte) 127), class109.method783(2, new class86[] { class69.field1370, class202.method1440(var249, (byte) 115).method608((byte) 88) }), (byte) -76, var264, 20);
                    } else if (var260 == 1) {
                        class9.method58(var261, class202.method1440(var251, (byte) 90).method608((byte) 27), class109.method783(2, new class86[] { class55.field1126, class202.method1440(var249, (byte) 53).method608((byte) 61) }), (byte) -123, var264, 20);
                    } else {
                        class9.method58(var261, class202.method1440(var251, (byte) 54).method608((byte) 61), class202.method1440(var249, (byte) 89).method608((byte) 58), (byte) -117, var264, 20);
                    }
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 47) {
                class190.field3373 = class27.field621;
                long var265 = class168.field3102.method1409(-106);
                if (var265 == 0L) {
                    class162.field3053 = null;
                    class44.field969 = -1;
                    class65.field1295 = null;
                    class144.field2738 = 0;
                    class265.field4686 = null;
                    return true;
                }
                long var267 = class168.field3102.method1409(-112);
                class65.field1295 = class202.method1440(var267, (byte) 119);
                class265.field4686 = class202.method1440(var265, (byte) 47);
                class247.field4393 = class168.field3102.method1412((byte) 100);
                int var269 = class168.field3102.method1408((byte) -81);
                if (var269 == 255) {
                    class44.field969 = -1;
                    return true;
                }
                class144.field2738 = var269;
                class54[] var270 = new class54[100];
                for (int var271 = 0; var271 < class144.field2738; var271++) {
                    var270[var271] = new class54();
                    var270[var271].field3759 = class168.field3102.method1409(-123);
                    var270[var271].field1097 = class202.method1440(var270[var271].field3759, (byte) 101);
                    var270[var271].field1099 = class168.field3102.method1410(-69);
                    var270[var271].field1104 = class168.field3102.method1412((byte) 106);
                    var270[var271].field1101 = class168.field3102.method1376((byte) 24);
                    if (class5.field66 == var270[var271].field3759) {
                        class65.field1287 = var270[var271].field1104;
                    }
                }
                boolean var272 = false;
                int var273 = class144.field2738;
                while (var273 > 0) {
                    var273--;
                    boolean var274 = true;
                    for (int var275 = 0; var275 < var273; var275++) {
                        if (var270[var275].field1097.method618(var270[var275 + 1].field1097, false) > 0) {
                            var274 = false;
                            class54 var276 = var270[var275];
                            var270[var275] = var270[var275 + 1];
                            var270[var275 + 1] = var276;
                        }
                    }
                    if (var274) {
                        break;
                    }
                }
                class162.field3053 = var270;
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 174) {
                class41.method336((byte) 104);
                int var277 = class168.field3102.method1393(0);
                int var278 = class168.field3102.method1431((byte) 27);
                int var279 = class168.field3102.method1408((byte) -28);
                class69.field1351[var278] = var277;
                class221.field3974[var278] = var279;
                class44.field976[var278] = 1;
                for (int var280 = 0; var280 < 98; var280++) {
                    if (var277 >= class24.field586[var280]) {
                        class44.field976[var278] = var280 + 2;
                    }
                }
                class168.field3107[class1.method5(31, class248.field4405++)] = var278;
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 187) {
                byte var281 = class168.field3102.method1427(1123);
                int var282 = class168.field3102.method1410(-103);
                class195.method1361(var282, 19305, var281);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 201) {
                int var283 = class168.field3102.method1408((byte) -22);
                int var284 = class168.field3102.method1408((byte) -83);
                int var285 = class168.field3102.method1410(-57);
                int var286 = class168.field3102.method1408((byte) -107);
                int var287 = class168.field3102.method1408((byte) -62);
                class33.method242(var283, var286, var287, false, var285, true, var284);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 158) {
                int var288 = class168.field3102.method1410(-123);
                class86 var289 = class168.field3102.method1376((byte) 24);
                Object[] var290 = new Object[var289.method612((byte) 108) + 1];
                for (int var291 = var289.method612((byte) 92) - 1; var291 >= 0; var291--) {
                    if (var289.method611(48, var291) == 115) {
                        var290[var291 + 1] = class168.field3102.method1376((byte) 24);
                    } else {
                        var290[var291 + 1] = Integer.valueOf(class168.field3102.method1386(-4603));
                    }
                }
                var290[0] = Integer.valueOf(class168.field3102.method1386(-4603));
                if (class152.method1116((byte) -64, var288)) {
                    class55 var292 = new class55();
                    var292.field1128 = var290;
                    method427(var292, 200000);
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 240) {
                int var293 = class168.field3102.method1431((byte) 73);
                int var294 = class168.field3102.method1401(2080652896);
                class195.method1364((byte) -54, var293, var294);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 35) {
                long var295 = class168.field3102.method1409(-124);
                class168.field3102.method1412((byte) 99);
                long var297 = class168.field3102.method1409(-113);
                long var299 = (long) class168.field3102.method1410(-105);
                long var301 = (long) class168.field3102.method1405(-3);
                int var303 = class168.field3102.method1408((byte) -30);
                long var304 = (var299 << 32) + var301;
                boolean var306 = false;
                int var307 = 0;
                label1375: while (true) {
                    if (var307 >= 100) {
                        if (var303 <= 1) {
                            if (class21.field548 == 1 || class134.field2542 == 1) {
                                var306 = true;
                            } else {
                                for (int var308 = 0; var308 < class56.field1146; var308++) {
                                    if (class119.field2325[var308] == var295) {
                                        var306 = true;
                                        break label1375;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    if (class113.field2159[var307] == var304) {
                        var306 = true;
                        break;
                    }
                    var307++;
                }
                if (!var306 && class200.field3545 == 0) {
                    class113.field2159[class193.field3457] = var304;
                    class193.field3457 = (class193.field3457 + 1) % 100;
                    class86 var309 = class259.method1769(class188.method1295(class168.field3102, 1000).method589(-94));
                    if (var303 == 2 || var303 == 3) {
                        class179.method1259(var309, class202.method1440(var297, (byte) 47).method608((byte) 38), 9, (byte) -58, class109.method783(2, new class86[] { class69.field1370, class202.method1440(var295, (byte) 105).method608((byte) 20) }));
                    } else if (var303 == 1) {
                        class179.method1259(var309, class202.method1440(var297, (byte) 91).method608((byte) 33), 9, (byte) -89, class109.method783(2, new class86[] { class55.field1126, class202.method1440(var295, (byte) 49).method608((byte) 75) }));
                    } else {
                        class179.method1259(var309, class202.method1440(var297, (byte) 115).method608((byte) 34), 9, (byte) -74, class202.method1440(var295, (byte) 97).method608((byte) 35));
                    }
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 150) {
                int var310 = class168.field3102.method1386(-4603);
                int var311 = class168.field3102.method1401(2080652896);
                int var312 = class168.field3102.method1413(-11011);
                if (var312 == 65535) {
                    var312 = -1;
                }
                if (class152.method1116((byte) -64, var311)) {
                    class117.method837(var312, var310, true, 1);
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 245) {
                class9.method74(124);
                class44.field969 = -1;
                return false;
            } else if (class44.field969 == 41) {
                long var313 = class168.field3102.method1409(-107);
                long var315 = (long) class168.field3102.method1410(-91);
                long var317 = (long) class168.field3102.method1405(-3);
                int var319 = class168.field3102.method1408((byte) -123);
                long var320 = (var315 << 32) + var317;
                int var322 = class168.field3102.method1410(-67);
                boolean var323 = false;
                int var324 = 0;
                label1393: while (true) {
                    if (var324 >= 100) {
                        if (var319 <= 1) {
                            for (int var325 = 0; var325 < class56.field1146; var325++) {
                                if (class119.field2325[var325] == var313) {
                                    var323 = true;
                                    break label1393;
                                }
                            }
                        }
                        break;
                    }
                    if (class113.field2159[var324] == var320) {
                        var323 = true;
                        break;
                    }
                    var324++;
                }
                if (!var323 && class200.field3545 == 0) {
                    class113.field2159[class193.field3457] = var320;
                    class193.field3457 = (class193.field3457 + 1) % 100;
                    class86 var326 = class177.method1244(var322, 1).method799(class168.field3102, 1);
                    if (var319 == 2) {
                        class9.method58(var322, (class86) null, class109.method783(2, new class86[] { class69.field1370, class202.method1440(var313, (byte) 50).method608((byte) 8) }), (byte) -97, var326, 18);
                    } else if (var319 == 1) {
                        class9.method58(var322, (class86) null, class109.method783(2, new class86[] { class55.field1126, class202.method1440(var313, (byte) 127).method608((byte) 61) }), (byte) -51, var326, 18);
                    } else {
                        class9.method58(var322, (class86) null, class202.method1440(var313, (byte) 120).method608((byte) 47), (byte) -58, var326, 18);
                    }
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 151) {
                int var327 = class168.field3102.method1410(-76);
                int var328 = class168.field3102.method1386(-4603);
                if (class152.method1116((byte) -64, var327)) {
                    class1 var329 = (class1) class1.field15.method1698((long) var328, (byte) -12);
                    if (var329 != null) {
                        class233.method1616(true, var329, true);
                    }
                    if (class162.field3045 != null) {
                        class62.method441(-29481, class162.field3045);
                        class162.field3045 = null;
                    }
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 176) {
                int var330 = class168.field3102.method1386(-4603);
                int var331 = class168.field3102.method1401(2080652896);
                class195.method1364((byte) -102, var330, var331);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 171) {
                int var332 = class168.field3102.method1413(-11011);
                int var333 = class168.field3102.method1383(78);
                int var334 = class168.field3102.method1414(-16777216);
                if (class152.method1116((byte) -64, var333)) {
                    class203.method1453(false, var332, var334);
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 159) {
                int var335 = class168.field3102.method1410(-105);
                int var336 = class168.field3102.method1375(22484);
                class86 var337 = class168.field3102.method1376((byte) 24);
                if (class152.method1116((byte) -64, var335)) {
                    class81.method571(3, var336, var337);
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 104) {
                int var338 = class168.field3102.method1401(2080652896);
                if (var338 == 65535) {
                    var338 = -1;
                }
                class211.method1498(112, var338);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 237) {
                int var339 = class168.field3102.method1401(2080652896);
                if (var339 == 65535) {
                    var339 = -1;
                }
                int var340 = class168.field3102.method1415(1282445992);
                class96.method698(11, var340, var339);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 194) {
                class193.method1347(97);
                class41.method336((byte) 104);
                class111.field2128 += 32;
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 96) {
                class38.field895 = class168.field3102.method1408((byte) -71);
                class76.field1519 = class168.field3102.method1389((byte) -111);
                for (int var341 = class76.field1519; var341 < (class76.field1519 + 8); var341++) {
                    for (int var343 = class38.field895; var343 < (class38.field895 + 8); var343++) {
                        if (class238.field4284[class180.field3244][var341][var343] != null) {
                            class238.field4284[class180.field3244][var341][var343] = null;
                            class234.method1621(var341, var343, 64);
                        }
                    }
                }
                for (class162 var342 = (class162) class229.field4158.method1737((byte) 74); var342 != null; var342 = (class162) class229.field4158.method1740(-8843)) {
                    if (class76.field1519 <= var342.field3055 && (class76.field1519 + 8) > var342.field3055 && var342.field3041 >= class38.field895 && (class38.field895 + 8) > var342.field3041 && class180.field3244 == var342.field3033) {
                        var342.field3036 = 0;
                    }
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 20) {
                class2.field25 = class168.field3102.method1408((byte) -26);
                class44.field969 = -1;
                class177.field3207 = class27.field621;
                return true;
            } else if (class44.field969 == 209) {
                int var344 = class168.field3102.method1408((byte) -65);
                int var345 = class168.field3102.method1408((byte) -73);
                int var346 = class168.field3102.method1410(-127);
                int var347 = class168.field3102.method1408((byte) -108);
                int var348 = class168.field3102.method1408((byte) -28);
                class201.method1432(var347, var345, var346, 125, var344, var348);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 252) {
                for (int var349 = 0; var349 < class273.field4805.length; var349++) {
                    if (class72.field1460[var349] != class273.field4805[var349]) {
                        class273.field4805[var349] = class72.field1460[var349];
                        class67.method477((byte) 124, var349);
                        class240.field4313[class1.method5(31, class111.field2128++)] = var349;
                    }
                }
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 166) {
                class34.method263(-58, false);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 139) {
                class233.method1617(class168.field3102.method1376((byte) 24), (byte) -81);
                class44.field969 = -1;
                return true;
            } else if (class44.field969 == 244) {
                int var350 = class168.field3102.method1383(92);
                int var351 = class168.field3102.method1383(127);
                int var352 = class168.field3102.method1386(-4603);
                if (class152.method1116((byte) -64, var350)) {
                    class207.method1475(var351, var352, (byte) -123);
                }
                class44.field969 = -1;
                return true;
            } else {
                class143.method1018((Throwable) null, "T1 - " + class44.field969 + "," + class116.field2234 + "," + class217.field3916 + " - " + class112.field2143, 87);
                class9.method74(124);
                return true;
            }
        }
    }
}
