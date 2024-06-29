import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class202 extends class179 {

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "[B")
    public byte[] field3201;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "[I")
    public static int[] field3203 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V")
    public static void method1255(int arg0) {
        field3203 = null;
        if (arg0 < 34) {
            method1255(-108);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIBIIIII[Ltq;)V")
    public static final void method1256(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class427[] arg9) {
        field3200++;
        class345.field5116.method1982(arg8, arg5, arg6, arg0);
        int var10 = 0;
        if (arg3 >= -33) {
            return;
        }
        while (var10 < arg9.length) {
            class427 var11 = arg9[var10];
            if (var11 != null && (var11.field6253 == arg1 || arg1 == -1412584499 && class450.field6931 == var11)) {
                int var12;
                if (arg2 == -1) {
                    class331.field4950[class413.field5993].setBounds(var11.field6262 + arg4, var11.field6259 + arg7, var11.field6175, var11.field6126);
                    var12 = class413.field5993++;
                } else {
                    var12 = arg2;
                }
                var11.field6232 = var12;
                var11.field6245 = class369.field5424;
                if (!client.method1190(var11)) {
                    label580: {
                        if (var11.field6187 != 0) {
                            class298.method1804(var11, true);
                        }
                        int var13 = var11.field6262 + arg4;
                        int var14 = var11.field6259 + arg7;
                        int var15 = var11.field6135;
                        if (class483.field7373 && (client.method1176(var11).field823 != 0 || var11.field6197 == 0) && var15 > 127) {
                            var15 = 127;
                        }
                        if (class450.field6931 == var11) {
                            if (arg1 != -1412584499 && (class408.field5931 == var11.field6194 || class267.field4035 == var11.field6194)) {
                                class14.field203 = arg7;
                                class481.field7345 = arg4;
                                class26.field340 = arg9;
                                break label580;
                            }
                            if (class178.field2790 && class157.field2470) {
                                int var16 = class251.field3835.method1686(25478);
                                int var17 = class251.field3835.method1690(8);
                                int var18 = var16 - class446.field6867;
                                int var19 = var17 - class123.field2031;
                                if (class348.field5133 > var18) {
                                    var18 = class348.field5133;
                                }
                                if (var19 < class410.field5942) {
                                    var19 = class410.field5942;
                                }
                                if (class348.field5133 + class332.field4974.field6175 < var11.field6175 + var18) {
                                    var18 = class332.field4974.field6175 + class348.field5133 - var11.field6175;
                                }
                                if (class410.field5942 + class332.field4974.field6126 < var11.field6126 + var19) {
                                    var19 = class332.field4974.field6126 + class410.field5942 - var11.field6126;
                                }
                                var13 = var18;
                                var14 = var19;
                            }
                            if (class267.field4035 == var11.field6194) {
                                var15 = 128;
                            }
                        }
                        int var22;
                        int var23;
                        int var24;
                        int var25;
                        if (var11.field6197 == 2) {
                            var25 = arg6;
                            var23 = arg5;
                            var22 = arg8;
                            var24 = arg0;
                        } else {
                            int var20 = var11.field6175 + var13;
                            int var21 = var11.field6126 + var14;
                            if (var11.field6197 == 9) {
                                var21++;
                                var20++;
                            }
                            var22 = var13 <= arg8 ? arg8 : var13;
                            var23 = arg5 >= var14 ? arg5 : var14;
                            var24 = var21 < arg0 ? var21 : arg0;
                            var25 = arg6 <= var20 ? arg6 : var20;
                        }
                        if (var25 > var22 && var23 < var24) {
                            if (var11.field6187 != 0) {
                                if (class441.field6470 == var11.field6187 || class432.field6355 == var11.field6187) {
                                    class236.method1418(class432.field6355 == var11.field6187, var11.field6126, var14, 20417, var13, var11.field6175);
                                    class77.field1376[var12] = true;
                                    class345.field5116.method1982(arg8, arg5, arg6, arg0);
                                    break label580;
                                }
                                if (class249.field3821 == var11.field6187) {
                                    if (var11.method2512(class345.field5116, (byte) 97) != null) {
                                        class233.method1400(false);
                                        class381.method2289(var13, var11, class345.field5116, var14, (byte) 126);
                                        class400.field5832[var12] = true;
                                        class345.field5116.method1982(arg8, arg5, arg6, arg0);
                                    }
                                    break label580;
                                }
                                if (class444.field6856 == var11.field6187) {
                                    if (var11.method2512(class345.field5116, (byte) -111) != null) {
                                        class266.method1629((byte) -58, var11, var14, var13);
                                        class400.field5832[var12] = true;
                                        class345.field5116.method1982(arg8, arg5, arg6, arg0);
                                    }
                                    break label580;
                                }
                                if (class282.field4276 == var11.field6187) {
                                    class256.method1539(var13, var11.field6126, class218.field3349, -8847, var14, class345.field5116, var11.field6175);
                                    class77.field1376[var12] = true;
                                    class345.field5116.method1982(arg8, arg5, arg6, arg0);
                                    break label580;
                                }
                                if (class17.field238 == var11.field6187) {
                                    class273.method1664(var14, var13, var11.field6126, class345.field5116, var11.field6175, true);
                                    class77.field1376[var12] = true;
                                    class345.field5116.method1982(arg8, arg5, arg6, arg0);
                                    break label580;
                                }
                                if (class314.field4744 == var11.field6187) {
                                    if (!class359.field5320 && !class100.field1811) {
                                        break label580;
                                    }
                                    int var26 = var11.field6175 + var13;
                                    int var27 = var14 + 15;
                                    if (class359.field5320) {
                                        class217.field3343.method2946(var26, -256, (byte) -60, "Fps:" + class49.field756, -1, var27);
                                        var27 += 15;
                                        Runtime var28 = Runtime.getRuntime();
                                        int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                        int var30 = -256;
                                        if (var29 > 65536) {
                                            var30 = -65536;
                                        }
                                        class217.field3343.method2946(var26, var30, (byte) -94, "Mem:" + var29 + "k", -1, var27);
                                        var27 += 15;
                                        class217.field3343.method2946(var26, -256, (byte) -67, "In:" + class320.field4809 + "B/s Out:" + class257.field3921 + "B/s", -1, var27);
                                        var27 += 15;
                                        int var31 = class345.field5116.method1960() / 1024;
                                        class217.field3343.method2946(var26, var31 > 65536 ? -65536 : -256, (byte) -89, "Offheap:" + var31 + "k", -1, var27);
                                        var27 += 15;
                                        int var32 = 0;
                                        int var33 = 0;
                                        int var34 = 0;
                                        for (int var35 = 0; var35 < 30; var35++) {
                                            var32 += class99.field1791[var35].method2325(-19400);
                                            var33 += class99.field1791[var35].method2318(true);
                                            var34 += class99.field1791[var35].method2326(0);
                                        }
                                        int var36 = var34 * 100 / var32;
                                        int var37 = var33 * 10000 / var32;
                                        String var38 = "Cache:" + class347.method2116((long) var37, (byte) 15, 0, true, 2) + "% (" + var36 + "%)";
                                        class266.field4026.method2946(var26, -256, (byte) -37, var38, -1, var27);
                                        var27 += 12;
                                    }
                                    if (class263.field3982 > 0) {
                                        class266.field4026.method2946(var26, -256, (byte) -53, "Particles: " + class292.field4452 + " / " + class263.field3982, -1, var27);
                                    }
                                    var27 += 12;
                                    if (class100.field1811) {
                                        class266.field4026.method2946(var26, -256, (byte) -125, "Polys: " + class345.field5116.method1929() + " Models: " + class345.field5116.method1897(), -1, var27);
                                        var27 += 12;
                                        class266.field4026.method2946(var26, -256, (byte) -110, "Ls: " + class271.field4109 + " La: " + class248.field3804 + " NPC: " + class32.field418 + " Pl: " + class22.field280, -1, var27);
                                        var27 += 12;
                                        class47.method329(-100);
                                    }
                                    class77.field1376[var12] = true;
                                    break label580;
                                }
                            }
                            if (var11.field6197 == 0) {
                                if (class100.field1816 == var11.field6187 && class345.field5116.method1975()) {
                                    class345.field5116.method1987(var13, var14, var11.field6175, var11.field6126);
                                }
                                method1256(var24, var11.field6157, var12, (byte) -54, var13 - var11.field6277, var23, var25, var14 - var11.field6179, var22, arg9);
                                if (var11.field6193 != null) {
                                    method1256(var24, var11.field6157, var12, (byte) -107, var13 - var11.field6277, var23, var25, var14 - var11.field6179, var22, var11.field6193);
                                }
                                class394 var39 = (class394) class245.field3741.method2409(false, (long) var11.field6157);
                                if (var39 != null) {
                                    class85.method599(var13, var25, var23, var39.field5750, var14, var24, var22, false, var12);
                                }
                                if (class100.field1816 == var11.field6187 && class345.field5116.method1975()) {
                                    class345.field5116.method1954();
                                    class431.field6351 = true;
                                }
                                class345.field5116.method1982(arg8, arg5, arg6, arg0);
                            }
                            if (class78.field1386[var12] || class156.field2464 > 1) {
                                if (var11.field6197 == 3) {
                                    if (var15 == 0) {
                                        if (var11.field6138) {
                                            class345.field5116.method1971(var13, var14, var11.field6175, var11.field6126, var11.field6166, 0);
                                        } else {
                                            class345.field5116.method1918(var13, var14, var11.field6175, var11.field6126, var11.field6166, 0);
                                        }
                                    } else if (var11.field6138) {
                                        class345.field5116.method1971(var13, var14, var11.field6175, var11.field6126, var11.field6166 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                    } else {
                                        class345.field5116.method1918(var13, var14, var11.field6175, var11.field6126, var11.field6166 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                    }
                                } else if (var11.field6197 == 4) {
                                    class488 var40 = var11.method2515(0, class345.field5116);
                                    if (var40 != null) {
                                        int var41 = var11.field6166;
                                        String var42 = var11.field6230;
                                        if (var11.field6274 != -1) {
                                            class182 var43 = class288.field4362.method3030((byte) 126, var11.field6274);
                                            var42 = var43.field2829;
                                            if (var42 == null) {
                                                var42 = "null";
                                            }
                                            if ((var43.field2886 == 1 || var11.field6228 != 1) && var11.field6228 != -1) {
                                                var42 = "<col=ff9040>" + var42 + "</col> x" + class255.method1531(var11.field6228, 2006);
                                            }
                                        }
                                        if (class198.field3118 == var11) {
                                            var42 = class6.field57.method2473(class406.field5898, -118);
                                            var41 = var11.field6166;
                                        }
                                        if (class86.field1496) {
                                            class345.field5116.method1948(var13, var14, var11.field6175 + var13, var11.field6126 + var14);
                                        }
                                        var40.method2941(var11.field6225, null, var11.field6192, 17975, var11.field6249 ? 255 - (var15 & 0xFF) << 24 : -1, class480.field7336, 0, 0, var11.field6202, var11.field6126, var11.field6175, var13, var42, var14, 255 - (var15 & 0xFF) << 24 | var41, var11.field6162, null);
                                        if (class86.field1496) {
                                            class345.field5116.method1982(arg8, arg5, arg6, arg0);
                                        }
                                    } else if (class458.field7054) {
                                        class288.method1754(var11, 0);
                                    }
                                } else if (var11.field6197 == 5) {
                                    if (var11.field6127 < 0) {
                                        class154 var44;
                                        if (var11.field6274 == -1) {
                                            var44 = var11.method2518(class345.field5116, 1);
                                        } else {
                                            class320 var45 = var11.field6149 ? class286.field4329.field696 : null;
                                            var44 = class288.field4362.method3028(var11.field6255, var11.field6243, (byte) 84, class345.field5116, var11.field6228, var11.field6274, var45, var11.field6151 | 0xFF000000);
                                        }
                                        if (var44 != null) {
                                            int var46 = var44.method988();
                                            int var47 = var44.method989();
                                            int var48 = (var11.field6166 == 0 ? 16777215 : var11.field6166 & 0xFFFFFF) | 255 - (var15 & 0xFF) << 24;
                                            if (var11.field6154) {
                                                class345.field5116.method1948(var13, var14, var13 + var11.field6175, var11.field6126 + var14);
                                                if (var11.field6206 != 0) {
                                                    int var49 = (var11.field6175 - (1 - var46)) / var46;
                                                    int var50 = (-(-var47 - var11.field6126) - 1) / var47;
                                                    for (int var51 = 0; var51 < var49; var51++) {
                                                        for (int var52 = 0; var52 < var50; var52++) {
                                                            if (var11.field6166 == 0) {
                                                                var44.method999((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var47 * var52 + var14), 4096, var11.field6206);
                                                            } else {
                                                                var44.method986((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var47 * var52 + var14), 4096, var11.field6206, 0, var48, 1);
                                                            }
                                                        }
                                                    }
                                                } else if (var11.field6166 == 0 && var15 == 0) {
                                                    var44.method995(var13, var14, var11.field6175, var11.field6126);
                                                } else {
                                                    var44.method998(var13, var14, var11.field6175, var11.field6126, 0, var48, 1);
                                                }
                                                class345.field5116.method1982(arg8, arg5, arg6, arg0);
                                            } else if (var11.field6166 == 0 && var15 == 0) {
                                                if (var11.field6206 != 0) {
                                                    var44.method999((float) var11.field6175 / 2.0F + (float) var13, (float) var11.field6126 / 2.0F + (float) var14, var11.field6175 * 4096 / var46, var11.field6206);
                                                } else if (var11.field6175 == var46 && var11.field6126 == var47) {
                                                    var44.method994(var13, var14);
                                                } else {
                                                    var44.method996(var13, var14, var11.field6175, var11.field6126);
                                                }
                                            } else if (var11.field6206 != 0) {
                                                var44.method986((float) var11.field6175 / 2.0F + (float) var13, (float) var11.field6126 / 2.0F + (float) var14, var11.field6175 * 4096 / var46, var11.field6206, 0, var48, 1);
                                            } else if (var11.field6175 == var46 && var11.field6126 == var47) {
                                                var44.method577(var13, var14, 0, var48, 1);
                                            } else {
                                                var44.method572(var13, var14, var11.field6175, var11.field6126, 0, var48, 1);
                                            }
                                        } else if (class458.field7054) {
                                            class288.method1754(var11, 0);
                                        }
                                    } else {
                                        var11.method2514((byte) 122, class466.field7155, class507.field7670).method293(-1, var11.field6180 << 3, 0, class345.field5116, var13, 0, var14, var11.field6175, var11.field6126, var11.field6176 << 3);
                                    }
                                } else if (var11.field6197 == 6) {
                                    class4.method16((byte) 86);
                                    class198 var53 = null;
                                    int var54 = 0;
                                    if (var11.field6274 != -1) {
                                        class182 var55 = class288.field4362.method3030((byte) 60, var11.field6274);
                                        if (var55 != null) {
                                            class182 var56 = var55.method1144(var11.field6228, (byte) -105);
                                            class87 var57 = var11.field6275 == -1 ? null : class429.field6302.method106(-116, var11.field6275);
                                            class320 var58 = var11.field6149 ? class286.field4329.field696 : null;
                                            var53 = var56.method1134(2048, var57, var58, var11.field6235, class345.field5116, var11.field6290, 206918595, 1, var11.field6217);
                                            if (var53 == null) {
                                                class288.method1754(var11, 0);
                                            } else {
                                                var54 = -var53.method492() >> 1;
                                            }
                                        }
                                    } else if (var11.field6195 == 5) {
                                        int var59 = var11.field6161;
                                        if (var59 >= 0 && var59 < 2048) {
                                            class47 var60 = class224.field3450[var59];
                                            class87 var61 = var11.field6275 == -1 ? null : class429.field6302.method106(-107, var11.field6275);
                                            if (var60 != null && (class507.field7667 == var59 || class499.method3002((byte) -51, var60.field685) == var11.field6134)) {
                                                var53 = var60.field696.method2002(null, var11.field6290, 2048, class433.field6358, 29311, -1, 0, true, var11.field6217, 0, null, class288.field4362, class511.field7740, class345.field5116, var11.field6235, class273.field4144, var61, class56.field933, class429.field6302);
                                            }
                                        }
                                    } else if (var11.field6195 == 8 || var11.field6195 == 9) {
                                        class146 var63 = class478.method2889(var11.field6161, (byte) 27, false);
                                        class87 var64 = var11.field6275 == -1 ? null : class429.field6302.method106(-105, var11.field6275);
                                        if (var63 != null) {
                                            class320 var65 = var11.field6149 ? class286.field4329.field696 : null;
                                            var53 = var63.method955(var65, var11.field6290, var11.field6195 == 9, 1, var11.field6235, class345.field5116, var11.field6217, var11.field6134, 2048, var64);
                                        }
                                    } else if (var11.field6275 == -1) {
                                        var53 = var11.method2520(class288.field4362, class56.field933, -2570, 2048, null, class286.field4329.field696, -1, 0, class433.field6358, class273.field4144, class511.field7740, -1, class429.field6302, class345.field5116);
                                        if (var53 == null && class458.field7054) {
                                            class288.method1754(var11, 0);
                                        }
                                    } else {
                                        class87 var62 = class429.field6302.method106(-89, var11.field6275);
                                        var53 = var11.method2520(class288.field4362, class56.field933, -2570, 2048, var62, class286.field4329.field696, var11.field6235, var11.field6290, class433.field6358, class273.field4144, class511.field7740, var11.field6217, class429.field6302, class345.field5116);
                                        if (var53 == null && class458.field7054) {
                                            class288.method1754(var11, 0);
                                        }
                                    }
                                    if (var53 != null) {
                                        int var66;
                                        if (var11.field6125 <= 0) {
                                            var66 = 512;
                                        } else {
                                            var66 = (var11.field6175 << 9) / var11.field6125;
                                        }
                                        int var67;
                                        if (var11.field6133 <= 0) {
                                            var67 = 512;
                                        } else {
                                            var67 = (var11.field6126 << 9) / var11.field6133;
                                        }
                                        int var68 = var11.field6175 / 2 + (var11.field6170 * var66 >> 9) + var13;
                                        int var69 = (var11.field6203 * var67 >> 9) + (var14 + (var11.field6126 / 2));
                                        class378.field5533.method195();
                                        class345.field5116.method1921(class378.field5533);
                                        class345.field5116.method1931(var68, var69, var66, var67);
                                        class345.field5116.method1993((float) (var11.field6266 << 0), var11.field6269 ? (float) (var11.field6291 << 0) : (float) (var11.field6291 << 0) * 1.5F);
                                        if (arg1 == -1412584499 || class431.field6351) {
                                            class345.field5116.method1966();
                                            class345.field5116.method1964();
                                            class345.field5116.method1982(arg8, arg5, arg6, arg0);
                                            class431.field6351 = false;
                                        }
                                        if (var11.field6244) {
                                            class345.field5116.method1895(false);
                                        }
                                        int var70 = (var11.field6221 << 0) * class195.field3075[var11.field6214 << 3] >> 15;
                                        int var71 = (var11.field6221 << 0) * class195.field3077[var11.field6214 << 3] >> 15;
                                        class51.field775.method204(-var11.field6264 << 3);
                                        class51.field775.method196(var11.field6201 << 3);
                                        class51.field775.method201(var11.field6278 << 0, (var11.field6223 << 0) + (var70 + var54), (var11.field6223 << 0) + var71);
                                        class51.field775.method199(var11.field6214 << 3);
                                        if (class86.field1496) {
                                            class345.field5116.method1948(var13, var14, var11.field6175 + var13, var11.field6126 + var14);
                                        }
                                        if (var11.field6269) {
                                            var53.method480(class51.field775, null, var11.field6221 << 0, 1);
                                        } else {
                                            var53.method461(class51.field775, null, 1);
                                        }
                                        if (class86.field1496) {
                                            class345.field5116.method1982(arg8, arg5, arg6, arg0);
                                        }
                                        if (var11.field6244) {
                                            class345.field5116.method1895(true);
                                        }
                                        class345.field5116.method1993(0.0F, 0.0F);
                                    }
                                } else if (var11.field6197 == 9) {
                                    int var72;
                                    int var73;
                                    int var74;
                                    int var75;
                                    if (var11.field6236) {
                                        var72 = var14;
                                        var73 = var13;
                                        var75 = var11.field6126 + var14;
                                        var74 = var11.field6175 + var13;
                                    } else {
                                        var72 = var14 + var11.field6126;
                                        var73 = var13;
                                        var74 = var11.field6175 + var13;
                                        var75 = var14;
                                    }
                                    if (var11.field6258 == 1) {
                                        class345.field5116.method1991(var73, var75, var74, var72, var11.field6166, 0);
                                    } else {
                                        class345.field5116.method1972(var73, var75, var74, var72, var11.field6166, var11.field6258, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "([B)V")
    public class202(byte[] arg0) {
        this.field3201 = arg0;
    }
}
