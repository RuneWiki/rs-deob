import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class206 {

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "[I")
    public static int[] field3010 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public static int field3014 = 0;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)Z", line = 4)
    public static final boolean method1411(int arg0) throws IOException {
        field3011++;
        if (class394.field5440 == null) {
            return false;
        }
        int var1 = class394.field5440.method2089(false);
        if (var1 == 0) {
            return false;
        }
        if (class34.field373 == null) {
            if (class239.field3503) {
                var1--;
                class394.field5440.method2094(0, 1, -110, class46.field710.field2262);
                class239.field3503 = false;
                class218.field3163++;
            }
            class46.field710.field2298 = 0;
            if (class46.field710.method717(128)) {
                if (var1 == 0) {
                    return false;
                }
                var1--;
                class394.field5440.method2094(1, 1, -107, class46.field710.field2262);
                class218.field3163++;
            }
            class239.field3503 = true;
            class108[] var2 = class344.method2144(117);
            int var3 = class46.field710.method720(120);
            if (var3 < 0 || var2.length <= var3) {
                throw new IOException("invo:" + var3);
            }
            class34.field373 = var2[var3];
            class126.field1718 = class34.field373.field1512;
        }
        if (class126.field1718 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class394.field5440.method2094(0, 1, -112, class46.field710.field2262);
            var1--;
            class218.field3163++;
            class126.field1718 = class46.field710.field2262[0] & 0xFF;
        }
        if (class126.field1718 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class394.field5440.method2094(0, 2, -100, class46.field710.field2262);
            class46.field710.field2298 = 0;
            class126.field1718 = class46.field710.method1134(-16848);
            var1 -= 2;
            class218.field3163 += 2;
        }
        if (var1 < class126.field1718) {
            return false;
        }
        class46.field710.field2298 = 0;
        class394.field5440.method2094(0, class126.field1718, -101, class46.field710.field2262);
        class490.field6916 = class368.field5073;
        class218.field3163 += class126.field1718;
        class46.field711 = 0;
        class368.field5073 = class367.field5044;
        class367.field5044 = class34.field373;
        if (class379.field5211 == class34.field373) {
            class116.method909(class422.field5837, 126);
            class34.field373 = null;
            return true;
        } else if (class384.field5259 == class34.field373) {
            class128.field1749 = class46.field710.method1137(true);
            class108.field1504 = class46.field710.method1137(true);
            class9.field70 = class46.field710.method1137(true);
            for (class223 var4 = (class223) class427.field5956.method1097(64); var4 != null; var4 = (class223) class427.field5956.method1105(false)) {
                int var6 = (int) (var4.field6382 & 0x3FFFL);
                int var7 = (int) (var4.field6382 >> 14 & 0x3FFFL);
                int var8 = (int) (var4.field6382 >> 28 & 0x3L);
                if (class128.field1749 == var8 && var6 >= class108.field1504 && var6 < (class108.field1504 + 8) && var7 >= class9.field70 && class9.field70 + 8 > var7) {
                    var4.method2714(-126);
                    class478.method2830(65, var6, class128.field1749, var7);
                }
            }
            for (class399 var5 = (class399) class236.field3436.method775(1); var5 != null; var5 = (class399) class236.field3436.method763(0)) {
                if (var5.field5474 >= class108.field1504 && (class108.field1504 + 8) > var5.field5474 && class9.field70 <= var5.field5482 && (class9.field70 + 8) > var5.field5482 && class128.field1749 == var5.field5475) {
                    var5.field5477 = 0;
                }
            }
            class34.field373 = null;
            return true;
        } else {
            int var9 = -44 % ((arg0 + 55) / 60);
            if (class34.field373 == class305.field4327) {
                int var10 = class46.field710.method1134(-16848);
                int var11 = class46.field710.method1172((byte) -110);
                boolean var12 = (var11 & 0x1) == 1;
                class290.method1903(true, var10, var12);
                int var13 = class46.field710.method1134(-16848);
                for (int var14 = 0; var14 < var13; var14++) {
                    int var15 = class46.field710.method1171((byte) 112);
                    int var16 = class46.field710.method1172((byte) -114);
                    if (var16 == 255) {
                        var16 = class46.field710.method1188(24290);
                    }
                    class225.method1532(var15 - 1, var14, (byte) 59, var12, var16, var10);
                }
                class483.field6824[class88.method739(class362.field4988++, 31)] = var10;
                class34.field373 = null;
                return true;
            } else if (class397.field5455 == class34.field373) {
                class116.method909(class340.field4695, -41);
                class34.field373 = null;
                return true;
            } else if (class482.field6819 == class34.field373) {
                int var17 = class46.field710.method1172((byte) -112);
                if (class46.field710.method1172((byte) 124) == 0) {
                    class41.field554[var17] = new class94();
                } else {
                    class46.field710.field2298--;
                    class41.field554[var17] = new class94(class46.field710);
                }
                class367.field5043 = class86.field1217;
                class34.field373 = null;
                return true;
            } else if (class399.field5465 == class34.field373) {
                class416.field5691.method1728((byte) -15);
                class62.field911 += 32;
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class129.field1771) {
                class213.field3095 = class46.field710.method1163(9988);
                class34.field373 = null;
                class416.field5725 = class86.field1217;
                return true;
            } else if (class34.field373 == class167.field2426) {
                class34.field372 = class46.field710.method1172((byte) -113);
                class33.field341 = class86.field1217;
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class164.field2393) {
                String var18 = class46.field710.method1186(-1);
                String var19 = class264.method1787(-61, class333.method2096(16383, class68.method636(class46.field710, -95)));
                class106.method842(var18, 6, var19, 0, 0, var18);
                class34.field373 = null;
                return true;
            } else if (class377.field5195 == class34.field373) {
                int var20 = class46.field710.method1139(-92);
                int var21 = class46.field710.method1191(1419728488);
                String var22 = class46.field710.method1186(-1);
                if (class167.method1215(1, var20)) {
                    class227.method1548(var21, var22, 28186);
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class158.field2250) {
                boolean var23 = class46.field710.method1172((byte) -119) == 1;
                String var24 = class46.field710.method1186(-1);
                String var25 = var24;
                if (var23) {
                    var25 = class46.field710.method1186(-1);
                }
                long var26 = class46.field710.method1170(true);
                long var28 = (long) class46.field710.method1134(-16848);
                long var30 = (long) class46.field710.method1178((byte) 63);
                int var32 = class46.field710.method1172((byte) -112);
                long var33 = (var28 << 32) + var30;
                boolean var35 = false;
                int var36 = 0;
                while (true) {
                    if (var36 >= 100) {
                        if (var32 <= 1) {
                            if (!(!class291.field4125 || class178.field2709) || class184.field2782) {
                                var35 = true;
                            } else if (class261.method1756(var25, 0)) {
                                var35 = true;
                            }
                        }
                        break;
                    }
                    if (class387.field5305[var36] == var33) {
                        var35 = true;
                        break;
                    }
                    var36++;
                }
                if (!var35 && class361.field4976 == 0) {
                    class387.field5305[class320.field4511] = var33;
                    class320.field4511 = (class320.field4511 + 1) % 100;
                    String var37 = class264.method1787(-61, class333.method2096(16383, class68.method636(class46.field710, 106)));
                    if (var32 == 2 || var32 == 3) {
                        class385.method2346("<img=1>" + var25, 0, 9, "<img=1>" + var24, var37, class73.method655((byte) 115, var26), (byte) 103, -1);
                    } else if (var32 == 1) {
                        class385.method2346("<img=0>" + var25, 0, 9, "<img=0>" + var24, var37, class73.method655((byte) 107, var26), (byte) 103, -1);
                    } else {
                        class385.method2346(var25, 0, 9, var24, var37, class73.method655((byte) 18, var26), (byte) 103, -1);
                    }
                }
                class34.field373 = null;
                return true;
            } else if (class411.field5625 == class34.field373) {
                byte var38 = class46.field710.method1152(-1910700904);
                int var39 = class46.field710.method1139(-108);
                class416.field5691.method1730(var39, (byte) 127, var38);
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class141.field1973) {
                class116.method909(class304.field4325, 126);
                class34.field373 = null;
                return true;
            } else if (class480.field6797 == class34.field373) {
                int var40 = class46.field710.method1139(-122);
                int var41 = class46.field710.method1171((byte) 122);
                int var42 = class46.field710.method1175(-17130);
                int var43 = class46.field710.method1171((byte) 115);
                if (class167.method1215(1, var40)) {
                    class89.method749(64, (var41 << 16) + var43, var42);
                }
                class34.field373 = null;
                return true;
            } else if (class345.field4761 == class34.field373) {
                int var44 = class46.field710.method1134(-16848);
                int var45 = class46.field710.method1172((byte) -113);
                boolean var46 = (var45 & 0x1) == 1;
                while (class126.field1718 > class46.field710.field2298) {
                    int var47 = class46.field710.method1133(0);
                    int var48 = class46.field710.method1134(-16848);
                    int var49 = 0;
                    if (var48 != 0) {
                        var49 = class46.field710.method1172((byte) -9);
                        if (var49 == 255) {
                            var49 = class46.field710.method1168(255);
                        }
                    }
                    class225.method1532(var48 - 1, var47, (byte) -118, var46, var49, var44);
                }
                class483.field6824[class88.method739(31, class362.field4988++)] = var44;
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class183.field2754) {
                int var50 = class46.field710.method1172((byte) 95);
                boolean var51 = (var50 & 0x1) == 1;
                String var52 = class46.field710.method1186(-1);
                String var53 = class46.field710.method1186(-1);
                if (var53.equals("")) {
                    var53 = var52;
                }
                String var54 = class46.field710.method1186(-1);
                String var55 = class46.field710.method1186(-1);
                if (var55.equals("")) {
                    var55 = var54;
                }
                if (var51) {
                    for (int var56 = 0; var56 < class222.field3201; var56++) {
                        if (class318.field4494[var56].equals(var55)) {
                            class379.field5204[var56] = var52;
                            class318.field4494[var56] = var53;
                            class276.field3985[var56] = var54;
                            class41.field542[var56] = var55;
                            break;
                        }
                    }
                } else {
                    class379.field5204[class222.field3201] = var52;
                    class318.field4494[class222.field3201] = var53;
                    class276.field3985[class222.field3201] = var54;
                    class41.field542[class222.field3201] = var55;
                    class450.field6408[class222.field3201] = class88.method739(var50, 2) == 2;
                    class222.field3201++;
                }
                class34.field373 = null;
                class33.field341 = class86.field1217;
                return true;
            } else if (class34.field373 == class149.field2039) {
                int var57 = class46.field710.method1145((byte) 113);
                int var58 = class46.field710.method1137(true);
                int var59 = class46.field710.method1171((byte) 126);
                class361 var60 = class163.field2377[var57];
                if (var60 != null) {
                    class138.method1012(var58, var59, (byte) 57, var60);
                }
                class34.field373 = null;
                return true;
            } else if (class39.field525 == class34.field373) {
                class126.method954(class126.field1718, (byte) 80, class436.field6206, class46.field710);
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class20.field218) {
                int var61 = class46.field710.method1171((byte) 114);
                int var62 = class46.field710.method1188(24290);
                int var63 = class46.field710.method1171((byte) 114);
                if (var63 == 65535) {
                    var63 = -1;
                }
                if (class167.method1215(1, var61)) {
                    class52.method497(-1, var63, (byte) -128, 2, var62);
                }
                class34.field373 = null;
                return true;
            } else if (class95.field1332 == class34.field373) {
                int var64 = class46.field710.method1134(-16848);
                byte var65 = class46.field710.method1152(-1910700904);
                int var66 = class46.field710.method1145((byte) 119);
                if (class167.method1215(1, var64)) {
                    class363.method2233((byte) -66, var65, var66);
                }
                class34.field373 = null;
                return true;
            } else if (class93.field1311 == class34.field373) {
                class108.field1504 = class46.field710.method1172((byte) 75);
                class9.field70 = class46.field710.method1160(124);
                class128.field1749 = class46.field710.method1160(72);
                while (class46.field710.field2298 < class126.field1718) {
                    class443 var67 = class468.method2787((byte) 113)[class46.field710.method1172((byte) -118)];
                    class116.method909(var67, -78);
                }
                class34.field373 = null;
                return true;
            } else if (class391.field5400 == class34.field373) {
                int var68 = class46.field710.method1134(-16848);
                int var69 = class46.field710.method1168(255);
                if (class167.method1215(1, var68)) {
                    class249 var70 = (class249) class310.field4399.method1104(-125, (long) var69);
                    if (var70 != null) {
                        class365.method2240(var70, 9662, false, true);
                    }
                    if (class315.field4453 != null) {
                        class184.method1314(class315.field4453, 102);
                        class315.field4453 = null;
                    }
                }
                class34.field373 = null;
                return true;
            } else if (class66.field966 == class34.field373) {
                class116.method909(class303.field4293, -101);
                class34.field373 = null;
                return true;
            } else if (class79.field1166 == class34.field373) {
                int var71 = class46.field710.method1175(-17130);
                int var72 = class46.field710.method1171((byte) 119);
                int var73 = class46.field710.method1188(24290);
                int var74 = class46.field710.method1139(-106);
                if (var74 == 65535) {
                    var74 = -1;
                }
                if (class167.method1215(1, var72)) {
                    class237.method1647(var73, var71, 114, var74);
                    class156 var75 = class373.field5128.method1644(var74, 98);
                    class82.method698(var71, var75.field2169, var75.field2182, var75.field2185, (byte) 70);
                    class207.method1416(var75.field2210, var71, var75.field2227, var75.field2172, -118);
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class292.field4128) {
                class116.method909(class194.field2885, -30);
                class34.field373 = null;
                return true;
            } else if (class419.field5816 == class34.field373) {
                int var76 = class46.field710.method1171((byte) 115);
                int var77 = class46.field710.method1191(1419728488);
                int var78 = class46.field710.method1175(-17130);
                if (class167.method1215(1, var76)) {
                    class249 var79 = (class249) class310.field4399.method1104(-125, (long) var77);
                    class249 var80 = (class249) class310.field4399.method1104(-126, (long) var78);
                    if (var80 != null) {
                        class365.method2240(var80, 9662, false, var79 == null || var79.field3593 != var80.field3593);
                    }
                    if (var79 != null) {
                        var79.method2714(122);
                        class310.field4399.method1100(var79, 90, (long) var78);
                    }
                    class172 var81 = class361.method2217(var77, -1060820048);
                    if (var81 != null) {
                        class184.method1314(var81, 58);
                    }
                    class172 var82 = class361.method2217(var78, -1060820048);
                    if (var82 != null) {
                        class184.method1314(var82, 115);
                        class110.method877(var82, true, -1);
                    }
                    if (class238.field3475 != -1) {
                        class225.method1533(16, 1, class238.field3475);
                    }
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class230.field3381) {
                int var83 = class46.field710.method1188(24290);
                int var84 = class46.field710.method1145((byte) 64);
                int var85 = class46.field710.method1171((byte) 127);
                if (class167.method1215(1, var84)) {
                    class363.method2233((byte) -66, var83, var85);
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class21.field223) {
                class482.method2841((byte) 39, false);
                class34.field373 = null;
                return true;
            } else if (class490.field6909 == class34.field373) {
                int var86 = class46.field710.method1188(24290);
                int var87 = class46.field710.method1171((byte) 114);
                int var88 = class46.field710.method1171((byte) 123);
                int var89 = class46.field710.method1171((byte) 122);
                if (var89 == 65535) {
                    var89 = -1;
                }
                int var90 = class46.field710.method1171((byte) 110);
                if (var90 == 65535) {
                    var90 = -1;
                }
                if (class167.method1215(1, var87)) {
                    for (int var91 = var90; var91 <= var89; var91++) {
                        long var92 = ((long) var86 << 32) + (long) var91;
                        class110 var94 = (class110) class329.field4558.method1104(-127, var92);
                        class110 var95;
                        if (var94 != null) {
                            var95 = new class110(var94.field1544, var88);
                            var94.method2714(97);
                        } else if (var91 == -1) {
                            var95 = new class110(class361.method2217(var86, -1060820048).field2557.field1544, var88);
                        } else {
                            var95 = new class110(0, var88);
                        }
                        class329.field4558.method1100(var95, 24, var92);
                    }
                }
                class34.field373 = null;
                return true;
            } else if (class389.field5373 == class34.field373) {
                class116.method909(class168.field2433, 123);
                class34.field373 = null;
                return true;
            } else if (class343.field4739 == class34.field373) {
                class89.field1270 = class46.field710.method1134(-16848) * 30;
                class416.field5725 = class86.field1217;
                class34.field373 = null;
                return true;
            } else if (class462.field6530 == class34.field373) {
                if (class238.field3475 != -1) {
                    class225.method1533(16, 0, class238.field3475);
                }
                class34.field373 = null;
                return true;
            } else if (class357.field4932 == class34.field373) {
                int var96 = class46.field710.method1172((byte) -123);
                int var97 = class46.field710.method1134(-16848);
                int var98 = class46.field710.method1188(24290);
                if (class167.method1215(1, var97)) {
                    class167.method1216(var98, var96, false);
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class102.field1433) {
                class243.method1687(-122, false);
                class34.field373 = null;
                return false;
            } else if (class390.field5396 == class34.field373) {
                int var99 = class46.field710.method1168(255);
                int var100 = class46.field710.method1145((byte) 97);
                class416.field5691.method1733(var100, var99, (byte) -22);
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class105.field1475) {
                class230.method1621(class46.field710, 17875, class126.field1718);
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class166.field2420) {
                class46.field710.field2298 += 28;
                if (class46.field710.method1148(-87)) {
                    class34.method210(class46.field710, true, class46.field710.field2298 - 28);
                }
                class34.field373 = null;
                return true;
            } else if (class56.field823 == class34.field373) {
                if (class273.field3967 != null) {
                    class241.method1677(class223.field3222, -1, -1, false, true);
                }
                byte[] var101 = new byte[class126.field1718];
                class46.field710.method709(var101, class126.field1718, 0, 255);
                String var102 = class388.method2357(var101, class126.field1718, 0, -28860);
                class430.method2567(false, class377.field5192 == 1, true, var102, class436.field6206);
                class34.field373 = null;
                return true;
            } else if (class462.field6531 == class34.field373) {
                int var103 = class46.field710.method1137(true);
                int var104 = class46.field710.method1145((byte) 121);
                boolean var105 = (var103 & 0x1) == 1;
                class131.method982(5, var104, var105);
                class483.field6824[class88.method739(class362.field4988++, 31)] = var104;
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class227.field3268) {
                class243.method1687(-91, true);
                class34.field373 = null;
                return false;
            } else if (class481.field6809 == class34.field373) {
                int var106 = class46.field710.method1175(-17130);
                int var107 = class46.field710.method1145((byte) 119);
                if (class167.method1215(1, var107)) {
                    class52.method497(-1, -1, (byte) -120, 3, var106);
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class129.field1769) {
                boolean var108 = class46.field710.method1172((byte) 51) == 1;
                String var109 = class46.field710.method1186(-1);
                String var110 = var109;
                if (var108) {
                    var110 = class46.field710.method1186(-1);
                }
                long var111 = (long) class46.field710.method1134(-16848);
                long var113 = (long) class46.field710.method1178((byte) 63);
                int var115 = class46.field710.method1172((byte) -117);
                long var116 = (var111 << 32) + var113;
                boolean var118 = false;
                int var119 = 0;
                while (true) {
                    if (var119 >= 100) {
                        if (var115 <= 1) {
                            if (!(!class291.field4125 || class178.field2709) || class184.field2782) {
                                var118 = true;
                            } else if (class261.method1756(var110, 0)) {
                                var118 = true;
                            }
                        }
                        break;
                    }
                    if (class387.field5305[var119] == var116) {
                        var118 = true;
                        break;
                    }
                    var119++;
                }
                if (!var118 && class361.field4976 == 0) {
                    class387.field5305[class320.field4511] = var116;
                    class320.field4511 = (class320.field4511 + 1) % 100;
                    String var120 = class264.method1787(-61, class333.method2096(16383, class68.method636(class46.field710, 117)));
                    if (var115 == 2) {
                        class385.method2346("<img=1>" + var110, 0, 7, "<img=1>" + var109, var120, (String) null, (byte) 103, -1);
                    } else if (var115 == 1) {
                        class385.method2346("<img=0>" + var110, 0, 7, "<img=0>" + var109, var120, (String) null, (byte) 103, -1);
                    } else {
                        class385.method2346(var110, 0, 3, var109, var120, (String) null, (byte) 103, -1);
                    }
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class193.field2869) {
                boolean var121 = class46.field710.method1172((byte) -16) == 1;
                String var122 = class46.field710.method1186(-1);
                String var123 = var122;
                if (var121) {
                    var123 = class46.field710.method1186(-1);
                }
                long var124 = class46.field710.method1170(true);
                long var126 = (long) class46.field710.method1134(-16848);
                long var128 = (long) class46.field710.method1178((byte) 63);
                int var130 = class46.field710.method1172((byte) -123);
                int var131 = class46.field710.method1134(-16848);
                long var132 = (var126 << 32) + var128;
                boolean var134 = false;
                int var135 = 0;
                while (true) {
                    if (var135 >= 100) {
                        if (var130 <= 1 && class261.method1756(var123, 0)) {
                            var134 = true;
                        }
                        break;
                    }
                    if (class387.field5305[var135] == var132) {
                        var134 = true;
                        break;
                    }
                    var135++;
                }
                if (!var134 && class361.field4976 == 0) {
                    class387.field5305[class320.field4511] = var132;
                    class320.field4511 = (class320.field4511 + 1) % 100;
                    String var136 = class172.method1244(32767, var131).method2342(104, class46.field710);
                    if (var130 == 2) {
                        class385.method2346("<img=1>" + var123, 0, 20, "<img=1>" + var122, var136, class73.method655((byte) 56, var124), (byte) 103, var131);
                    } else if (var130 == 1) {
                        class385.method2346("<img=0>" + var123, 0, 20, "<img=0>" + var122, var136, class73.method655((byte) 46, var124), (byte) 103, var131);
                    } else {
                        class385.method2346(var123, 0, 20, var122, var136, class73.method655((byte) 125, var124), (byte) 103, var131);
                    }
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class211.field3074) {
                class222.field3201 = class46.field710.method1172((byte) -124);
                for (int var137 = 0; var137 < class222.field3201; var137++) {
                    class379.field5204[var137] = class46.field710.method1186(-1);
                    class318.field4494[var137] = class46.field710.method1186(-1);
                    if (class318.field4494[var137].equals("")) {
                        class318.field4494[var137] = class379.field5204[var137];
                    }
                    class276.field3985[var137] = class46.field710.method1186(-1);
                    class41.field542[var137] = class46.field710.method1186(-1);
                    if (class41.field542[var137].equals("")) {
                        class41.field542[var137] = class276.field3985[var137];
                    }
                    class450.field6408[var137] = false;
                }
                class34.field373 = null;
                class33.field341 = class86.field1217;
                return true;
            } else if (class34.field373 == class102.field1430) {
                class314.field4436 = class86.field1217;
                if (class126.field1718 == 0) {
                    class255.field3671 = null;
                    class422.field5851 = null;
                    class71.field1033 = 0;
                    class34.field373 = null;
                    class311.field4405 = null;
                    return true;
                }
                class422.field5851 = class46.field710.method1186(-1);
                boolean var138 = class46.field710.method1172((byte) -110) == 1;
                if (var138) {
                    class46.field710.method1186(-1);
                }
                long var139 = class46.field710.method1170(true);
                class255.field3671 = class106.method851((byte) 52, var139);
                class223.field3225 = class46.field710.method1152(-1910700904);
                int var141 = class46.field710.method1172((byte) -123);
                if (var141 == 255) {
                    class34.field373 = null;
                    return true;
                }
                class71.field1033 = var141;
                class56[] var142 = new class56[100];
                for (int var143 = 0; var143 < class71.field1033; var143++) {
                    var142[var143] = new class56();
                    var142[var143].field822 = class46.field710.method1186(-1);
                    boolean var149 = class46.field710.method1172((byte) -118) == 1;
                    if (var149) {
                        var142[var143].field819 = class46.field710.method1186(-1);
                    } else {
                        var142[var143].field819 = var142[var143].field822;
                    }
                    var142[var143].field826 = class472.method2799(89, var142[var143].field819);
                    var142[var143].field824 = class46.field710.method1134(-16848);
                    var142[var143].field820 = class46.field710.method1152(-1910700904);
                    var142[var143].field827 = class46.field710.method1186(-1);
                    if (var142[var143].field819.equals(class262.field3781.field485)) {
                        class205.field3006 = var142[var143].field820;
                    }
                }
                boolean var144 = false;
                int var145 = class71.field1033;
                while (var145 > 0) {
                    boolean var146 = true;
                    var145--;
                    for (int var147 = 0; var147 < var145; var147++) {
                        if (var142[var147].field826.compareTo(var142[var147 + 1].field826) > 0) {
                            class56 var148 = var142[var147];
                            var142[var147] = var142[var147 + 1];
                            var146 = false;
                            var142[var147 + 1] = var148;
                        }
                    }
                    if (var146) {
                        break;
                    }
                }
                class311.field4405 = var142;
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class265.field3820) {
                int var150 = class46.field710.method1137(true);
                int var151 = class46.field710.method1137(true);
                if (var150 == 255) {
                    var150 = -1;
                    var151 = -1;
                }
                class295.method1919(var150, 15, var151);
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class296.field4180) {
                int var152 = class46.field710.method1139(-112);
                int var153 = class46.field710.method1145((byte) 99);
                int var154 = class46.field710.method1168(255);
                int var155 = class46.field710.method1137(true);
                if (class167.method1215(1, var152)) {
                    class249 var156 = (class249) class310.field4399.method1104(-125, (long) var154);
                    if (var156 != null) {
                        class365.method2240(var156, 9662, false, var156.field3593 != var153);
                    }
                    class477.method2826(var153, false, -741861886, var155, var154);
                }
                class34.field373 = null;
                return true;
            } else if (class401.field5506 == class34.field373) {
                for (int var157 = 0; var157 < class112.field1570.length; var157++) {
                    if (class112.field1570[var157] != null) {
                        class112.field1570[var157].field5742 = -1;
                    }
                }
                for (int var158 = 0; var158 < class163.field2377.length; var158++) {
                    if (class163.field2377[var158] != null) {
                        class163.field2377[var158].field5742 = -1;
                    }
                }
                class34.field373 = null;
                return true;
            } else if (class98.field1389 == class34.field373) {
                int var159 = class46.field710.method1133(0);
                int var160 = class46.field710.method1168(255);
                int var161 = class46.field710.method1172((byte) -118);
                String var162 = "";
                String var163 = var162;
                if ((var161 & 0x1) != 0) {
                    var162 = class46.field710.method1186(-1);
                    if ((var161 & 0x2) == 0) {
                        var163 = var162;
                    } else {
                        var163 = class46.field710.method1186(-1);
                    }
                }
                String var164 = class46.field710.method1186(-1);
                if (var159 == 99) {
                    class94.method790(var164, -30123);
                } else if (var163.equals("") || !class261.method1756(var163, 0)) {
                    class106.method842(var162, var159, var164, var160, 0, var163);
                } else {
                    class34.field373 = null;
                    return true;
                }
                class34.field373 = null;
                return true;
            } else if (class412.field5649 == class34.field373) {
                int var165 = class46.field710.method1134(-16848);
                int var166 = class46.field710.method1168(255);
                if (class167.method1215(1, var165)) {
                    class52.method497(0, class168.field2432, (byte) -123, 5, var166);
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class176.field2668) {
                boolean var167 = class46.field710.method1172((byte) 62) == 1;
                String var168 = class46.field710.method1186(-1);
                String var169 = class46.field710.method1186(-1);
                int var170 = class46.field710.method1134(-16848);
                int var171 = class46.field710.method1172((byte) 26);
                String var172 = "";
                boolean var173 = false;
                if (var170 > 0) {
                    var172 = class46.field710.method1186(-1);
                    var173 = class46.field710.method1172((byte) -122) == 1;
                }
                for (int var174 = 0; var174 < class349.field4807; var174++) {
                    if (var167) {
                        if (var169.equals(class37.field446[var174])) {
                            class37.field446[var174] = var168;
                            var168 = null;
                            class8.field54[var174] = var169;
                            break;
                        }
                    } else if (var168.equals(class37.field446[var174])) {
                        if (class264.field3801[var174] != var170) {
                            class264.field3801[var174] = var170;
                            if (var170 > 0) {
                                class106.method842("", 5, var168 + class284.field4071.method1078(class66.field967, 100), 0, 0, "");
                            }
                            if (var170 == 0) {
                                class106.method842("", 5, var168 + class62.field907.method1078(class66.field967, 100), 0, 0, "");
                            }
                        }
                        class8.field54[var174] = var169;
                        class243.field3532[var174] = var172;
                        class191.field2861[var174] = var171;
                        class270.field3940[var174] = var173;
                        var168 = null;
                        break;
                    }
                }
                if (var168 != null && class349.field4807 < 200) {
                    class37.field446[class349.field4807] = var168;
                    class8.field54[class349.field4807] = var169;
                    class264.field3801[class349.field4807] = var170;
                    class243.field3532[class349.field4807] = var172;
                    class191.field2861[class349.field4807] = var171;
                    class270.field3940[class349.field4807] = var173;
                    class349.field4807++;
                }
                class33.field341 = class86.field1217;
                boolean var175 = false;
                int var176 = class349.field4807;
                while (var176 > 0) {
                    var176--;
                    boolean var177 = true;
                    for (int var178 = 0; var178 < var176; var178++) {
                        if (class264.field3801[var178] != class379.field5212 && class264.field3801[var178 + 1] == class379.field5212 || class264.field3801[var178] == 0 && class264.field3801[var178 + 1] != 0) {
                            int var179 = class264.field3801[var178];
                            class264.field3801[var178] = class264.field3801[var178 + 1];
                            class264.field3801[var178 + 1] = var179;
                            String var180 = class243.field3532[var178];
                            class243.field3532[var178] = class243.field3532[var178 + 1];
                            class243.field3532[var178 + 1] = var180;
                            String var181 = class37.field446[var178];
                            class37.field446[var178] = class37.field446[var178 + 1];
                            class37.field446[var178 + 1] = var181;
                            String var182 = class8.field54[var178];
                            class8.field54[var178] = class8.field54[var178 + 1];
                            class8.field54[var178 + 1] = var182;
                            int var183 = class191.field2861[var178];
                            class191.field2861[var178] = class191.field2861[var178 + 1];
                            class191.field2861[var178 + 1] = var183;
                            boolean var184 = class270.field3940[var178];
                            class270.field3940[var178] = class270.field3940[var178 + 1];
                            var177 = false;
                            class270.field3940[var178 + 1] = var184;
                        }
                    }
                    if (var177) {
                        break;
                    }
                }
                class34.field373 = null;
                return true;
            } else if (class432.field6112 == class34.field373) {
                class116.method909(class117.field1628, 124);
                class34.field373 = null;
                return true;
            } else if (class407.field5552 == class34.field373) {
                class108.field1504 = class46.field710.method1160(127);
                class128.field1749 = class46.field710.method1181((byte) -38);
                class9.field70 = class46.field710.method1181((byte) -38);
                class34.field373 = null;
                return true;
            } else if (class76.field1121 == class34.field373) {
                class116.method909(class402.field5514, -82);
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class223.field3221) {
                int var185 = class46.field710.method1181((byte) -38);
                int var186 = class46.field710.method1139(-118);
                class416.field5691.method1733(var186, var185, (byte) -22);
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class310.field4400) {
                int var187 = class46.field710.method1171((byte) 112);
                int var188 = class46.field710.method1175(-17130);
                int var189 = class46.field710.method1145((byte) 111);
                int var190 = class46.field710.method1139(-115);
                int var191 = class46.field710.method1139(-122);
                if (class167.method1215(1, var191)) {
                    class52.method497(var189, var190 << 16 | var187, (byte) -118, 7, var188);
                }
                class34.field373 = null;
                return true;
            } else if (class48.field732 == class34.field373) {
                int var192 = class46.field710.method1134(-16848);
                if (var192 == 65535) {
                    var192 = -1;
                }
                int var193 = class46.field710.method1137(true);
                class164.method1211(-79, var193, var192);
                class34.field373 = null;
                return true;
            } else if (class41.field539 == class34.field373) {
                int var194 = class46.field710.method1134(-16848);
                if (var194 == 65535) {
                    var194 = -1;
                }
                int var195 = class46.field710.method1143(-8502);
                int var196 = class46.field710.method1137(true);
                class27.method184(false, var195, var196, var194);
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class143.field1997) {
                int var197 = class46.field710.method1171((byte) 120);
                int var198 = class46.field710.method1168(255);
                int var199 = class46.field710.method1171((byte) 123);
                int var200 = class46.field710.method1145((byte) 87);
                if (var198 >> 30 != 0) {
                    int var201 = (var198 & 0x3D298110) >> 28;
                    int var202 = ((var198 & 0xFFFC0C2) >> 14) - class279.field4012;
                    int var203 = (var198 & 0x3FFF) - class189.field2810;
                    if (var202 >= 0 && var203 >= 0 && class36.field388 > var202 && var203 < class68.field998) {
                        int var204 = var202 * 128 + 64;
                        int var205 = var203 * 128 + 64;
                        class222 var206 = new class222(var200, 0, class364.field5010, var201, var204, class407.method2440(var204, -16490, var205, var201) - var197, var205, var202, var202, var203, var203);
                        class422.field5849.method766(new class265(var206), -1);
                    }
                } else if ((var198 >> 29) != 0) {
                    int var207 = var198 & 0xFFFF;
                    class361 var208 = class163.field2377[var207];
                    if (var208 != null) {
                        if (var200 == 65535) {
                            var200 = -1;
                        }
                        boolean var209 = true;
                        if (var200 != -1 && var208.field5759 != -1) {
                            if (var208.field5759 == var200) {
                                class217 var210 = class371.field5108.method1664(var200, -5);
                                if (var210.field3128 && var210.field3129 != -1) {
                                    class303 var211 = class386.field5289.method1856(49, var210.field3129);
                                    int var212 = var211.field4289;
                                    if (var212 == 0 || var212 == 2) {
                                        var209 = false;
                                    } else if (var212 == 1) {
                                        var209 = true;
                                    }
                                }
                            } else {
                                class217 var213 = class371.field5108.method1664(var200, 54);
                                class217 var214 = class371.field5108.method1664(var208.field5759, 71);
                                if (var213.field3129 != -1 && var214.field3129 != -1) {
                                    class303 var215 = class386.field5289.method1856(24, var213.field3129);
                                    class303 var216 = class386.field5289.method1856(27, var214.field3129);
                                    if (var215.field4307 < var216.field4307) {
                                        var209 = false;
                                    }
                                }
                            }
                        }
                        if (var209) {
                            var208.field5741 = 0;
                            var208.field5737 = 0;
                            var208.field5730 = class364.field5010 + var199;
                            var208.field5759 = var200;
                            var208.field5788 = 1;
                            var208.field5749 = var197;
                            if (class364.field5010 < var208.field5730) {
                                var208.field5741 = -1;
                            }
                            if (var208.field5759 != -1 && class364.field5010 == var208.field5730) {
                                int var217 = class371.field5108.method1664(var208.field5759, 71).field3129;
                                if (var217 != -1) {
                                    class303 var218 = class386.field5289.method1856(44, var217);
                                    if (var218 != null && var218.field4286 != null) {
                                        class178.method1275(0, false, false, var208.field4531, var208.field4537, var218, var208.field4530);
                                    }
                                }
                            }
                        }
                    }
                } else if (var198 >> 28 != 0) {
                    int var219 = var198 & 0xFFFF;
                    class39 var220;
                    if (class168.field2432 == var219) {
                        var220 = class262.field3781;
                    } else {
                        var220 = class112.field1570[var219];
                    }
                    if (var220 != null) {
                        if (var200 == 65535) {
                            var200 = -1;
                        }
                        boolean var221 = true;
                        if (var200 != -1 && var220.field5759 != -1) {
                            if (var220.field5759 == var200) {
                                class217 var226 = class371.field5108.method1664(var200, -124);
                                if (var226.field3128 && var226.field3129 != -1) {
                                    class303 var227 = class386.field5289.method1856(14, var226.field3129);
                                    int var228 = var227.field4289;
                                    if (var228 == 0 || var228 == 2) {
                                        var221 = false;
                                    } else if (var228 == 1) {
                                        var221 = true;
                                    }
                                }
                            } else {
                                class217 var222 = class371.field5108.method1664(var200, 23);
                                class217 var223 = class371.field5108.method1664(var220.field5759, 36);
                                if (var222.field3129 != -1 && var223.field3129 != -1) {
                                    class303 var224 = class386.field5289.method1856(115, var222.field3129);
                                    class303 var225 = class386.field5289.method1856(79, var223.field3129);
                                    if (var225.field4307 > var224.field4307) {
                                        var221 = false;
                                    }
                                }
                            }
                        }
                        if (var221) {
                            var220.field5788 = 1;
                            var220.field5730 = class364.field5010 + var199;
                            var220.field5737 = 0;
                            var220.field5749 = var197;
                            var220.field5741 = 0;
                            var220.field5759 = var200;
                            if (var220.field5759 == 65535) {
                                var220.field5759 = -1;
                            }
                            if (class364.field5010 < var220.field5730) {
                                var220.field5741 = -1;
                            }
                            if (var220.field5759 != -1 && class364.field5010 == var220.field5730) {
                                int var229 = class371.field5108.method1664(var220.field5759, -110).field3129;
                                if (var229 != -1) {
                                    class303 var230 = class386.field5289.method1856(40, var229);
                                    if (var230 != null && var230.field4286 != null) {
                                        class178.method1275(0, class262.field3781 == var220, false, var220.field4531, var220.field4537, var230, var220.field4530);
                                    }
                                }
                            }
                        }
                    }
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class255.field3672) {
                int var231 = class46.field710.method1168(255);
                int var232 = class46.field710.method1139(-96);
                int var233 = class46.field710.method1139(-72);
                if (var233 == 65535) {
                    var233 = -1;
                }
                int var234 = class46.field710.method1139(-81);
                if (var234 == 65535) {
                    var234 = -1;
                }
                int var235 = class46.field710.method1175(-17130);
                if (class167.method1215(1, var232)) {
                    for (int var236 = var234; var236 <= var233; var236++) {
                        long var237 = ((long) var231 << 32) + ((long) var236);
                        class110 var239 = (class110) class329.field4558.method1104(-126, var237);
                        class110 var240;
                        if (var239 != null) {
                            var240 = new class110(var235, var239.field1542);
                            var239.method2714(74);
                        } else if (var236 == -1) {
                            var240 = new class110(var235, class361.method2217(var231, -1060820048).field2557.field1542);
                        } else {
                            var240 = new class110(var235, -1);
                        }
                        class329.field4558.method1100(var240, -118, var237);
                    }
                }
                class34.field373 = null;
                return true;
            } else if (class443.field6297 == class34.field373) {
                int var241 = class46.field710.method1134(-16848);
                int var242 = class46.field710.method1172((byte) 38);
                int var243 = class46.field710.method1172((byte) 126);
                int var244 = class46.field710.method1134(-16848);
                int var245 = class46.field710.method1172((byte) -118);
                int var246 = class46.field710.method1172((byte) 30);
                if (class167.method1215(1, var241)) {
                    class145.method1038(var244, true, var242, var243, var246, var245);
                }
                class34.field373 = null;
                return true;
            } else if (class96.field1347 == class34.field373) {
                int var247 = class46.field710.method1134(-16848);
                int var248 = class46.field710.method1171((byte) 119);
                int var249 = class46.field710.method1171((byte) 118);
                if (class167.method1215(1, var249)) {
                    class6.method32(0, (byte) -62, var247, var248);
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class196.field2904) {
                String var250 = class46.field710.method1186(-1);
                int var251 = class46.field710.method1134(-16848);
                int var252 = class46.field710.method1139(-113);
                if (class167.method1215(1, var251)) {
                    class187.method1321(var250, true, var252);
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class168.field2436) {
                class116.method909(class34.field371, 122);
                class34.field373 = null;
                return true;
            } else if (class405.field5539 == class34.field373) {
                int var253 = class46.field710.method1171((byte) 120);
                int var254 = class46.field710.method1181((byte) -38);
                if (class167.method1215(1, var253)) {
                    class196.field2911 = var254;
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class143.field1998) {
                class38.field477 = class46.field710.method1172((byte) 41);
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class34.field349) {
                int var255 = class46.field710.method1134(-16848);
                int var256 = class46.field710.method1172((byte) -126);
                int var257 = class46.field710.method1172((byte) 122);
                int var258 = class46.field710.method1172((byte) 33);
                int var259 = class46.field710.method1172((byte) -107);
                int var260 = class46.field710.method1134(-16848);
                if (class167.method1215(1, var255)) {
                    class394.field5441[var256] = true;
                    class434.field6140[var256] = var257;
                    class138.field1915[var256] = var258;
                    class196.field2913[var256] = var259;
                    class406.field5543[var256] = var260;
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class111.field1564) {
                int var261 = class46.field710.method1163(9988);
                int var262 = class46.field710.method1168(255);
                int var263 = class46.field710.method1139(-109);
                if (class167.method1215(1, var263)) {
                    class69.method639(var262, false, var261);
                }
                class34.field373 = null;
                return true;
            } else if (class373.field5135 == class34.field373) {
                class116.method909(class1.field9, -8);
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class312.field4418) {
                class116.method909(class370.field5095, -80);
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class319.field4506) {
                class116.method909(class343.field4741, -83);
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class142.field1976) {
                int var264 = class46.field710.method1145((byte) 73);
                if (var264 == 65535) {
                    var264 = -1;
                }
                int var265 = class46.field710.method1175(-17130);
                int var266 = class46.field710.method1139(-127);
                if (class167.method1215(1, var266)) {
                    class22.method163(var265, var264, 16);
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class225.field3248) {
                int var267 = class46.field710.method1134(-16848);
                if (class167.method1215(1, var267)) {
                    class482.method2839(127);
                }
                class34.field373 = null;
                return true;
            } else if (class350.field4831 == class34.field373) {
                boolean var268 = class46.field710.method1172((byte) -107) == 1;
                String var269 = class46.field710.method1186(-1);
                String var270 = var269;
                if (var268) {
                    var270 = class46.field710.method1186(-1);
                }
                long var271 = (long) class46.field710.method1134(-16848);
                long var273 = (long) class46.field710.method1178((byte) 63);
                int var275 = class46.field710.method1172((byte) -110);
                int var276 = class46.field710.method1134(-16848);
                long var277 = (var271 << 32) + var273;
                boolean var279 = false;
                int var280 = 0;
                while (true) {
                    if (var280 >= 100) {
                        if (var275 <= 1 && class261.method1756(var270, 0)) {
                            var279 = true;
                        }
                        break;
                    }
                    if (class387.field5305[var280] == var277) {
                        var279 = true;
                        break;
                    }
                    var280++;
                }
                if (!var279 && class361.field4976 == 0) {
                    class387.field5305[class320.field4511] = var277;
                    class320.field4511 = (class320.field4511 + 1) % 100;
                    String var281 = class172.method1244(32767, var276).method2342(110, class46.field710);
                    if (var275 == 2) {
                        class385.method2346("<img=1>" + var270, 0, 18, "<img=1>" + var269, var281, (String) null, (byte) 103, var276);
                    } else if (var275 == 1) {
                        class385.method2346("<img=0>" + var270, 0, 18, "<img=0>" + var269, var281, (String) null, (byte) 103, var276);
                    } else {
                        class385.method2346(var270, 0, 18, var269, var281, (String) null, (byte) 103, var276);
                    }
                }
                class34.field373 = null;
                return true;
            } else if (class370.field5096 == class34.field373) {
                if (class126.field1718 == 0) {
                    class309.field4390 = class176.field2667.method1078(class66.field967, 100);
                } else {
                    class309.field4390 = class46.field710.method1186(-1);
                }
                class34.field373 = null;
                return true;
            } else if (class395.field5447 == class34.field373) {
                String var282 = class46.field710.method1186(-1);
                int var283 = class46.field710.method1134(-16848);
                String var284 = class172.method1244(32767, var283).method2342(116, class46.field710);
                class385.method2346(var282, 0, 19, var282, var284, (String) null, (byte) 103, var283);
                class34.field373 = null;
                return true;
            } else if (class354.field4864 == class34.field373) {
                int var285 = class46.field710.method1172((byte) 0);
                int var286 = var285 >> 5;
                int var287 = var285 & 0x1F;
                if (var287 == 0) {
                    class143.field1994[var286] = null;
                    class34.field373 = null;
                    return true;
                }
                class177 var288 = new class177();
                var288.field2678 = var287;
                var288.field2672 = class46.field710.method1172((byte) -17);
                if (var288.field2672 >= 0 && var288.field2672 < class77.field1137.length) {
                    if (var288.field2678 == 1 || var288.field2678 == 10) {
                        var288.field2680 = class46.field710.method1134(-16848);
                        class46.field710.field2298 += 6;
                    } else if (var288.field2678 >= 2 && var288.field2678 <= 6) {
                        if (var288.field2678 == 2) {
                            var288.field2671 = 64;
                            var288.field2674 = 64;
                        }
                        if (var288.field2678 == 3) {
                            var288.field2671 = 64;
                            var288.field2674 = 0;
                        }
                        if (var288.field2678 == 4) {
                            var288.field2674 = 128;
                            var288.field2671 = 64;
                        }
                        if (var288.field2678 == 5) {
                            var288.field2674 = 64;
                            var288.field2671 = 0;
                        }
                        if (var288.field2678 == 6) {
                            var288.field2671 = 128;
                            var288.field2674 = 64;
                        }
                        var288.field2678 = 2;
                        var288.field2685 = class46.field710.method1172((byte) -119);
                        var288.field2675 = class46.field710.method1134(-16848);
                        var288.field2683 = class46.field710.method1134(-16848);
                        var288.field2684 = class46.field710.method1172((byte) -116);
                        var288.field2679 = class46.field710.method1134(-16848);
                    }
                    var288.field2673 = class46.field710.method1134(-16848);
                    if (var288.field2673 == 65535) {
                        var288.field2673 = -1;
                    }
                    class143.field1994[var286] = var288;
                }
                class34.field373 = null;
                return true;
            } else if (class368.field5065 == class34.field373) {
                class370.method2263(3);
                class34.field373 = null;
                return false;
            } else if (class414.field5680 == class34.field373) {
                int var289 = class46.field710.method1168(255);
                int var290 = class46.field710.method1145((byte) 119);
                class416.field5691.method1730(var290, (byte) 127, var289);
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class334.field4650) {
                class289.field4107 = class46.field710.method1172((byte) -109);
                class34.field373 = null;
                class416.field5725 = class86.field1217;
                return true;
            } else if (class34.field373 == class303.field4309) {
                int var291 = class46.field710.method1134(-16848);
                if (class167.method1215(1, var291)) {
                    class103.method831(126);
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class279.field4004) {
                int var292 = class46.field710.method1188(24290);
                int var293 = class46.field710.method1139(-107);
                int var294 = class46.field710.method1145((byte) 113);
                if (class167.method1215(1, var293)) {
                    class319.method2032(var294, var292, (byte) -78);
                }
                class34.field373 = null;
                return true;
            } else if (class341.field4707 == class34.field373) {
                String var295 = class46.field710.method1186(-1);
                int var296 = class46.field710.method1172((byte) 31);
                int var297 = class46.field710.method1145((byte) 82);
                if (var297 == 65535) {
                    var297 = -1;
                }
                int var298 = class46.field710.method1172((byte) 85);
                if (var296 >= 1 && var296 <= 8) {
                    if (var295.equalsIgnoreCase("null")) {
                        var295 = null;
                    }
                    class106.field1494[var296 - 1] = var295;
                    class168.field2437[var296 - 1] = var297;
                    class48.field730[var296 - 1] = var298 == 0;
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class233.field3401) {
                int var299 = class46.field710.method1168(255);
                int var300 = class46.field710.method1134(-16848);
                int var301 = class46.field710.method1134(-16848);
                int var302 = class46.field710.method1139(-82);
                int var303 = class46.field710.method1171((byte) 117);
                if (class167.method1215(1, var303)) {
                    class82.method698(var299, var300, var301, var302, (byte) 68);
                }
                class34.field373 = null;
                return true;
            } else if (class71.field1031 == class34.field373) {
                int var304 = class46.field710.method1134(-16848);
                if (var304 == 65535) {
                    var304 = -1;
                }
                int var305 = class46.field710.method1172((byte) 90);
                int var306 = class46.field710.method1134(-16848);
                int var307 = class46.field710.method1172((byte) 83);
                class61.method555(var304, var306, -113, var305, var307);
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class336.field4664) {
                int var308 = class46.field710.method1191(1419728488);
                int var309 = class46.field710.method1139(-127);
                int var310 = class46.field710.method1139(-95);
                if (class167.method1215(1, var309)) {
                    class443.method2690(var308, var310, -128);
                }
                class34.field373 = null;
                return true;
            } else if (class398.field5460 == class34.field373) {
                class116.method909(class163.field2376, 123);
                class34.field373 = null;
                return true;
            } else if (class401.field5500 == class34.field373) {
                String var311 = class46.field710.method1186(-1);
                boolean var312 = class46.field710.method1172((byte) -109) == 1;
                String var313;
                if (var312) {
                    var313 = class46.field710.method1186(-1);
                } else {
                    var313 = var311;
                }
                int var314 = class46.field710.method1134(-16848);
                byte var315 = class46.field710.method1152(-1910700904);
                boolean var316 = false;
                if (var315 == -128) {
                    var316 = true;
                }
                if (var316) {
                    if (class71.field1033 == 0) {
                        class34.field373 = null;
                        return true;
                    }
                    boolean var317 = false;
                    int var318;
                    for (var318 = 0; class71.field1033 > var318 && (!class311.field4405[var318].field819.equals(var313) || class311.field4405[var318].field824 != var314); var318++) {
                    }
                    if (var318 < class71.field1033) {
                        while ((class71.field1033 - 1) > var318) {
                            class311.field4405[var318] = class311.field4405[var318 + 1];
                            var318++;
                        }
                        class71.field1033--;
                        class311.field4405[class71.field1033] = null;
                    }
                } else {
                    String var319 = class46.field710.method1186(-1);
                    class56 var320 = new class56();
                    var320.field819 = var313;
                    var320.field822 = var311;
                    var320.field826 = class472.method2799(72, var320.field819);
                    var320.field824 = var314;
                    var320.field827 = var319;
                    var320.field820 = var315;
                    int var321;
                    for (var321 = class71.field1033 - 1; var321 >= 0; var321--) {
                        int var322 = class311.field4405[var321].field826.compareTo(var320.field826);
                        if (var322 == 0) {
                            class311.field4405[var321].field824 = var314;
                            class311.field4405[var321].field820 = var315;
                            class311.field4405[var321].field827 = var319;
                            if (var313.equals(class262.field3781.field485)) {
                                class205.field3006 = var315;
                            }
                            class34.field373 = null;
                            class314.field4436 = class86.field1217;
                            return true;
                        }
                        if (var322 < 0) {
                            break;
                        }
                    }
                    if (class311.field4405.length <= class71.field1033) {
                        class34.field373 = null;
                        return true;
                    }
                    for (int var323 = class71.field1033 - 1; var323 > var321; var323--) {
                        class311.field4405[var323 + 1] = class311.field4405[var323];
                    }
                    if (class71.field1033 == 0) {
                        class311.field4405 = new class56[100];
                    }
                    class311.field4405[var321 + 1] = var320;
                    class71.field1033++;
                    if (var313.equals(class262.field3781.field485)) {
                        class205.field3006 = var315;
                    }
                }
                class314.field4436 = class86.field1217;
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class312.field4407) {
                class357.method2208(class46.field710.method1186(-1), -13165);
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class187.field2800) {
                class139.field1930 = class46.field710.method1172((byte) 21);
                class411.field5627 = class46.field710.method1172((byte) -115);
                class127.field1737 = class46.field710.method1181((byte) -38);
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class271.field3942) {
                int var324 = class46.field710.method1134(-16848);
                String var325 = class46.field710.method1186(-1);
                Object[] var326 = new Object[var325.length() + 1];
                for (int var327 = var325.length() - 1; var327 >= 0; var327--) {
                    if (var325.charAt(var327) == 's') {
                        var326[var327 + 1] = class46.field710.method1186(-1);
                    } else {
                        var326[var327 + 1] = Integer.valueOf(class46.field710.method1168(255));
                    }
                }
                var326[0] = Integer.valueOf(class46.field710.method1168(255));
                if (class167.method1215(1, var324)) {
                    class472 var328 = new class472();
                    var328.field6649 = var326;
                    class457.method2745(var328);
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class213.field3093) {
                int var329 = class46.field710.method1188(24290);
                int var330 = class46.field710.method1171((byte) 122);
                int var331 = class46.field710.method1171((byte) 124);
                if (class167.method1215(1, var331)) {
                    class278.method1861(var330, -31727, var329);
                }
                class34.field373 = null;
                return true;
            } else if (class444.field6315 == class34.field373) {
                int var332 = class46.field710.method1134(-16848);
                int var333 = class46.field710.method1139(-68);
                if (var333 == 65535) {
                    var333 = -1;
                }
                int var334 = class46.field710.method1175(-17130);
                if (class167.method1215(1, var332)) {
                    class52.method497(-1, var333, (byte) -123, 1, var334);
                }
                class34.field373 = null;
                return true;
            } else if (class404.field5534 == class34.field373) {
                int var335 = class46.field710.method1191(1419728488);
                int var336 = class46.field710.method1172((byte) 28);
                int var337 = class46.field710.method1181((byte) -38);
                class21.field226[var337] = var335;
                class398.field5459[var337] = var336;
                class122.field1673[var337] = 1;
                int var338 = class263.field3783[var337] - 1;
                for (int var339 = 0; var339 < var338; var339++) {
                    if (var335 >= class486.field6870[var339]) {
                        class122.field1673[var337] = var339 + 2;
                    }
                }
                class178.field2686[class88.method739(class279.field4013++, 31)] = var337;
                class34.field373 = null;
                return true;
            } else if (class418.field5728 == class34.field373) {
                class116.method909(class389.field5384, 116);
                class34.field373 = null;
                return true;
            } else if (class388.field5318 == class34.field373) {
                int var340 = class46.field710.method1171((byte) 125);
                String var341 = class46.field710.method1186(-1);
                int var342 = class46.field710.method1134(-16848);
                if (class167.method1215(1, var340)) {
                    class187.method1321(var341, true, var342);
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class175.field2657) {
                int var343 = class46.field710.method1160(73);
                int var344 = var343 >> 2;
                int var345 = var343 & 0x3;
                int var346 = class161.field2334[var344];
                int var347 = class46.field710.method1175(-17130);
                int var348 = var347 >> 28 & 0x3;
                int var349 = var347 >> 14 & 0x3FFF;
                int var350 = var347 & 0x3FFF;
                int var351 = class46.field710.method1139(-76);
                if (var351 == 65535) {
                    var351 = -1;
                }
                int var352 = var350 - class189.field2810;
                int var353 = var349 - class279.field4012;
                class95.method793(var345, var353, var352, var348, (byte) -49, var344, var346, var351);
                class34.field373 = null;
                return true;
            } else if (class436.field6192 == class34.field373) {
                class116.method909(class247.field3588, -24);
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class149.field2057) {
                int var354 = class46.field710.method1175(-17130);
                int var355 = class46.field710.method1171((byte) 115);
                int var356 = class46.field710.method1139(-87);
                int var357 = class46.field710.method1191(1419728488);
                if (class167.method1215(1, var356)) {
                    class52.method497(var357, var355, (byte) -120, 5, var354);
                }
                class34.field373 = null;
                return true;
            } else if (class472.field6647 == class34.field373) {
                int var358 = class46.field710.method1168(255);
                class444.field6339 = class436.field6206.method618(var358, 0);
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class161.field2306) {
                int var359 = class46.field710.method1171((byte) 110);
                int var360 = class46.field710.method1172((byte) 110);
                int var361 = class46.field710.method1134(-16848);
                if (class167.method1215(1, var361)) {
                    if (var360 == 2) {
                        class112.method888((byte) 26);
                    }
                    class238.field3475 = var359;
                    class110.method878(var359, true);
                    class464.method2770((byte) -127, false);
                    class457.method2740(class238.field3475);
                    for (int var362 = 0; var362 < 100; var362++) {
                        class424.field5879[var362] = true;
                    }
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class174.field2645) {
                int var363 = class46.field710.method1134(-16848);
                int var364 = class46.field710.method1134(-16848);
                int var365 = class46.field710.method1134(-16848);
                int var366 = class46.field710.method1134(-16848);
                if (class167.method1215(1, var363) && class263.field3787[var364] != null) {
                    for (int var367 = var365; var367 < var366; var367++) {
                        int var368 = class46.field710.method1178((byte) 63);
                        if (class263.field3787[var364].length > var367 && class263.field3787[var364][var367] != null) {
                            class263.field3787[var364][var367].field2615 = var368;
                        }
                    }
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class207.field3039) {
                int var369 = class46.field710.method1134(-16848);
                int var370 = class46.field710.method1157(116);
                int var371 = class46.field710.method1159((byte) 83);
                int var372 = class46.field710.method1191(1419728488);
                if (class167.method1215(1, var369)) {
                    class389.method2363(var372, var370, -197, var371);
                }
                class34.field373 = null;
                return true;
            } else if (class34.field373 == class22.field250) {
                int var373 = class46.field710.method1134(-16848);
                int var374 = class46.field710.method1172((byte) -118);
                int var375 = class46.field710.method1172((byte) -118);
                int var376 = class46.field710.method1134(-16848);
                int var377 = class46.field710.method1172((byte) 90);
                int var378 = class46.field710.method1172((byte) -118);
                if (class167.method1215(1, var373)) {
                    class94.method789(var374, var375, 1184, var376, var378, true, var377);
                }
                class34.field373 = null;
                return true;
            } else if (class94.field1315 == class34.field373) {
                class482.method2841((byte) 39, true);
                class34.field373 = null;
                return true;
            } else {
                class83.method704((byte) 103, (Throwable) null, "T1 - " + (class34.field373 == null ? -1 : class34.field373.method854(20500)) + "," + (class368.field5073 == null ? -1 : class368.field5073.method854(20500)) + "," + (class490.field6916 == null ? -1 : class490.field6916.method854(20500)) + " - " + class126.field1718);
                class370.method2263(3);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BLvc;Lae;)V", line = 2884)
    public static final void method1412(byte arg0, class89 arg1, class172 arg2) {
        field3012++;
        boolean var3 = class373.field5128.method1651(arg2.field2608, arg1, arg2.field2483, arg2.field2599 ? class262.field3781.field498 : null, arg2.field2626 | 0xFF000000, (byte) 123, arg2.field2542, arg2.field2584) == null;
        int var4 = -54 / ((arg0 + 39) / 54);
        if (var3) {
            class38.field472.method766(new class465(arg2.field2483, arg2.field2608, arg2.field2584, arg2.field2626 | 0xFF000000, arg2.field2542, arg2.field2599), -1);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V", line = 2900)
    public static void method1413(byte arg0) {
        field3010 = null;
        if (arg0 != -22) {
            field3010 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)Z", line = 2913)
    public static final boolean method1414(byte arg0) {
        field3013++;
        class73 var1 = (class73) class6.field38.field1299.field6388;
        if (var1 == null || class6.field38.field1299 == var1) {
            return false;
        }
        if (var1.field1048 >= 2000) {
            var1.field1048 -= 2000;
        }
        if (arg0 <= 81) {
            field3010 = null;
        }
        return var1.field1048 == 1002;
    }
}
