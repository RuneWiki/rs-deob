import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 {

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Lic;")
    private static class59 field1367 = class59.method433(0, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field1369 = 0;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Lic;")
    public static class59 field1378 = class59.method433(0, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Lic;")
    public static class59 field1372 = field1367;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "Lic;")
    public static class59 field1371 = class59.method433(0, "gr-Un:");

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Lic;")
    public static class59 field1377 = class59.method433(0, "mapedge");

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field1373 = 127;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "Lic;")
    private static class59 field1370 = class59.method433(0, "<col=ff7000>");

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Lic;")
    public static class59 field1376 = class59.method433(0, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field1381 = 2301979;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "[Lce;")
    public static class20[] field1375;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "[[[B")
    public static byte[][][] field1382;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method411(int arg0) {
        field1377 = null;
        field1375 = null;
        field1378 = null;
        field1372 = null;
        if (arg0 >= -124) {
            return;
        }
        field1370 = null;
        field1371 = null;
        field1367 = null;
        field1376 = null;
        field1382 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIBILt;)V")
    public static final void method412(int arg0, int arg1, int arg2, byte arg3, int arg4, class132 arg5) {
        if (arg3 != -127) {
            return;
        }
        int var6 = arg2 * arg2 + arg4 * arg4;
        if (var6 > 4225 && var6 < 90000) {
            int var7 = class79.field1941 + class130.field2927 & 0x7FF;
            int var8 = class11.field244[var7];
            int var9 = var8 * 256 / (class49.field1226 + 256);
            int var10 = class11.field249[var7];
            int var11 = var10 * 256 / (class49.field1226 + 256);
            int var12 = arg2 * var9 + arg4 * var11 >> 16;
            int var13 = arg2 * var11 - arg4 * var9 >> 16;
            double var14 = Math.atan2((double) var12, (double) var13);
            int var16 = (int) (Math.sin(var14) * 63.0D);
            int var17 = (int) (Math.cos(var14) * 57.0D);
            class62.field1567.method1010(arg1 + var16 + 94 - 6, -var17 + arg0 + 63, 20, 20, 15, 15, var14, 256);
        } else {
            class76.method629(arg2, arg4, false, arg1, arg0, arg5);
        }
        field1374++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IBIII)V")
    public static final void method413(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1379++;
        class89.field2255 = 0;
        for (int var5 = -1; var5 < class43.field1092 + class103.field2510; var5++) {
            class68 var21;
            if (var5 == -1) {
                var21 = class159.field3650;
            } else if (class43.field1092 > var5) {
                var21 = class91.field2323[class31.field842[var5]];
            } else {
                var21 = class47.field1210[class53.field1309[var5 - class43.field1092]];
            }
            if (var21 != null && var21.method380(arg1 ^ 0x65)) {
                if (var21 instanceof class90) {
                    class125 var22 = ((class90) var21).field2276;
                    if (var22.field2815 != null) {
                        var22 = var22.method954(200);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (class43.field1092 <= var5) {
                    class125 var25 = ((class90) var21).field2276;
                    if (var25.field2815 != null) {
                        var25 = var25.method954(200);
                    }
                    if (var25.field2800 >= 0 && class61.field1564.length > var25.field2800) {
                        class95.method786(var21.field1734 + 15, var21, 0);
                        if (class95.field2416 > -1) {
                            class61.field1564[var25.field2800].method1023(class95.field2416 + arg3 - 12, arg4 - -class149.field3258 - 30);
                        }
                    }
                    if (class1.field28 == 1 && class53.field1309[var5 - class43.field1092] == class95.field2413 && class23.field561 % 20 < 10) {
                        class95.method786(var21.field1734 + 15, var21, 0);
                        if (class95.field2416 > -1) {
                            class62.field1576[0].method1023(arg3 + class95.field2416 - 12, class149.field3258 + arg4 + -28);
                        }
                    }
                } else {
                    int var23 = 30;
                    class49 var24 = (class49) var21;
                    if (var24.field1257 != -1 || var24.field1216 != -1) {
                        class95.method786(var21.field1734 + 15, var21, 0);
                        if (class95.field2416 > -1) {
                            if (var24.field1257 != -1) {
                                class7.field142[var24.field1257].method1023(class95.field2416 + arg3 - 12, -var23 + class149.field3258 + arg4);
                                var23 += 25;
                            }
                            if (var24.field1216 != -1) {
                                class61.field1564[var24.field1216].method1023(class95.field2416 + arg3 - 12, class149.field3258 + arg4 + -var23);
                                var23 += 25;
                            }
                        }
                    }
                    if (var5 >= 0 && class1.field28 == 10 && class31.field842[var5] == class159.field3665) {
                        class95.method786(var21.field1734 + 15, var21, 0);
                        if (class95.field2416 > -1) {
                            class62.field1576[1].method1023(class95.field2416 + arg3 - 12, arg4 - var23 + class149.field3258);
                        }
                    }
                }
                if (var21.field1697 != null && (var5 >= class43.field1092 || class131.field2943 == 0 || class131.field2943 == 3 || class131.field2943 == 1 && class130.method1000((byte) -121, ((class49) var21).field1225))) {
                    class95.method786(var21.field1734, var21, 0);
                    if (class95.field2416 > -1 && class89.field2255 < class4.field85) {
                        class4.field91[class89.field2255] = class43.field1105.method1157(var21.field1697) / 2;
                        class4.field80[class89.field2255] = class43.field1105.field3392;
                        class4.field88[class89.field2255] = class95.field2416;
                        class4.field92[class89.field2255] = class149.field3258;
                        class4.field82[class89.field2255] = var21.field1687;
                        class4.field86[class89.field2255] = var21.field1738;
                        class4.field79[class89.field2255] = var21.field1720;
                        class4.field77[class89.field2255] = var21.field1697;
                        class89.field2255++;
                    }
                }
                if (class23.field561 < var21.field1684) {
                    class95.method786(var21.field1734 + 15, var21, 0);
                    if (class95.field2416 > -1) {
                        int var26 = var21.field1695 * 30 / var21.field1696;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        class129.method988(class95.field2416 + arg3 - 15, class149.field3258 + -3 + arg4, var26, 5, 65280);
                        class129.method988(arg3 + class95.field2416 + var26 - 15, arg4 - -class149.field3258 + -3, 30 - var26, 5, 16711680);
                    }
                }
                for (int var27 = 0; var27 < 4; var27++) {
                    if (var21.field1733[var27] > class23.field561) {
                        class95.method786(var21.field1734 / 2, var21, 0);
                        if (class95.field2416 > -1) {
                            if (var27 == 1) {
                                class149.field3258 -= 20;
                            }
                            if (var27 == 2) {
                                class149.field3258 -= 10;
                                class95.field2416 -= 15;
                            }
                            if (var27 == 3) {
                                class149.field3258 -= 10;
                                class95.field2416 += 15;
                            }
                            class64.field1638[var21.field1740[var27]].method1023(arg3 + class95.field2416 - 12, class149.field3258 + arg4 + -12);
                            class21.field446.method1146(class46.method361(var21.field1714[var27], 100), arg3 + class95.field2416 - 1, class149.field3258 + arg4 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg1 != 103) {
            method411(-28);
        }
        for (int var6 = 0; var6 < class89.field2255; var6++) {
            int var7 = class4.field88[var6];
            int var8 = class4.field92[var6];
            int var9 = class4.field91[var6];
            int var10 = class4.field80[var6];
            boolean var11 = true;
            while (var11) {
                var11 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (class4.field92[var20] - class4.field80[var20] < var8 + 2 && var8 - var10 < class4.field92[var20] + 2 && class4.field91[var20] + class4.field88[var20] > var7 - var9 && var7 + var9 > class4.field88[var20] + -class4.field91[var20] && var8 > class4.field92[var20] - class4.field80[var20]) {
                        var11 = true;
                        var8 = class4.field92[var20] - class4.field80[var20];
                    }
                }
            }
            class95.field2416 = class4.field88[var6];
            class149.field3258 = class4.field92[var6] = var8;
            class59 var12 = class4.field77[var6];
            if (class57.field1385 == 0) {
                int var13 = 16776960;
                if (class4.field82[var6] < 6) {
                    var13 = class57.field1393[class4.field82[var6]];
                }
                if (class4.field82[var6] == 6) {
                    var13 = class51.field1280 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class4.field82[var6] == 7) {
                    var13 = class51.field1280 % 20 < 10 ? 255 : 65535;
                }
                if (class4.field82[var6] == 8) {
                    var13 = class51.field1280 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class4.field82[var6] == 9) {
                    int var14 = 150 - class4.field79[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 16776960 + 16384000 - var14 * 327680;
                    } else if (var14 < 150) {
                        var13 = (var14 - 100) * 5 + 65280;
                    }
                }
                if (class4.field82[var6] == 10) {
                    int var15 = 150 - class4.field79[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 16711935 - (var15 - 50) * 327680;
                    } else if (var15 < 150) {
                        var13 = var15 * 327680 + 255 + 500 - var15 * 5 - 32768000;
                    }
                }
                if (class4.field82[var6] == 11) {
                    int var16 = 150 - class4.field79[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = (var16 - 50) * 327685 + 65280;
                    } else if (var16 < 150) {
                        var13 = 16777215 - (var16 - 100) * 327680;
                    }
                }
                if (class4.field86[var6] == 0) {
                    class43.field1105.method1146(var12, class95.field2416 + arg3, class149.field3258 + arg4, var13, 0);
                }
                if (class4.field86[var6] == 1) {
                    class43.field1105.method1154(var12, class95.field2416 + arg3, class149.field3258 + arg4, var13, 0, class51.field1280);
                }
                if (class4.field86[var6] == 2) {
                    class43.field1105.method1138(var12, class95.field2416 + arg3, class149.field3258 + arg4, var13, 0, class51.field1280);
                }
                if (class4.field86[var6] == 3) {
                    class43.field1105.method1151(var12, arg3 + class95.field2416, arg4 - -class149.field3258, var13, 0, class51.field1280, 150 - class4.field79[var6]);
                }
                if (class4.field86[var6] == 4) {
                    int var17 = (150 - class4.field79[var6]) * (class43.field1105.method1157(var12) + 100) / 150;
                    class129.method992(arg3 + class95.field2416 - 50, arg4, arg3 + class95.field2416 + 50, arg2 + arg4);
                    class43.field1105.method1134(var12, class95.field2416 + arg3 + 50 - var17, class149.field3258 + arg4, var13, 0);
                    class129.method980(arg3, arg4, arg0 + arg3, arg2 + arg4);
                }
                if (class4.field86[var6] == 5) {
                    int var18 = 150 - class4.field79[var6];
                    int var19 = 0;
                    class129.method992(arg3, class149.field3258 + arg4 - class43.field1105.field3392 - 1, arg0 + arg3, class149.field3258 + arg4 + 5);
                    if (var18 < 25) {
                        var19 = var18 - 25;
                    } else if (var18 > 125) {
                        var19 = var18 - 125;
                    }
                    class43.field1105.method1146(var12, class95.field2416 + arg3, arg4 - -class149.field3258 + var19, var13, 0);
                    class129.method980(arg3, arg4, arg0 + arg3, arg2 + arg4);
                }
            } else {
                class43.field1105.method1146(var12, arg3 + class95.field2416, arg4 - -class149.field3258, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)Lic;")
    public static final class59 method414(int arg0, int arg1, int arg2) {
        field1368++;
        int var3 = arg2 - arg0;
        if (var3 < -9) {
            return class120.field2775;
        } else if (var3 < -6) {
            return class18.field359;
        } else if (var3 < -3) {
            return field1370;
        } else if (var3 < 0) {
            return class102.field2494;
        } else {
            int var4 = 107 / ((55 - arg1) / 45);
            if (var3 > 9) {
                return class107.field2569;
            } else if (var3 > 6) {
                return class103.field2515;
            } else if (var3 > 3) {
                return class63.field1627;
            } else if (var3 > 0) {
                return class154.field3349;
            } else {
                return class4.field95;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    public static final void method415(int arg0, int arg1) {
        field1380++;
        class125.field2849 = arg1;
        class63.field1603 = -1;
        class76.field1861 = null;
        class127.field2877 = 0;
        class149.field3265 = -1;
        class41.field1047 = arg0;
        class100.field2479 = false;
    }
}
