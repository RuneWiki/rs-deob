import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class35 extends class240 {

    @OriginalMember(owner = "client!dl", name = "Q", descriptor = "I")
    private int field565 = 32768;

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "Lcd;")
    private static class64 field564 = class44.method335((byte) 71, "Starting 3d Library");

    @OriginalMember(owner = "client!dl", name = "X", descriptor = "Lcd;")
    public static class64 field572 = class44.method335((byte) 71, "_labels");

    @OriginalMember(owner = "client!dl", name = "bb", descriptor = "I")
    public static int field576 = 0;

    @OriginalMember(owner = "client!dl", name = "cb", descriptor = "Lcd;")
    public static class64 field577 = field564;

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!dl", name = "R", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!dl", name = "S", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!dl", name = "U", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!dl", name = "V", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!dl", name = "Y", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!dl", name = "Z", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!dl", name = "ab", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!dl", name = "W", descriptor = "[Leg;")
    public static class289[] field571;

    @OriginalMember(owner = "client!dl", name = "T", descriptor = "[[Lfg;")
    public static class204[][] field568;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IILkh;)V", line = 12)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg1 == 0) {
            this.field565 = arg2.method112((byte) 92) << 4;
        } else if (arg1 == 1) {
            this.field4113 = arg2.method152((byte) -92) == 1;
        }
        field570++;
        if (arg0 != 2) {
            this.method288(-72);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)[[I", line = 43)
    public final int[][] method286(byte arg0, int arg1) {
        int[][] var3 = this.field4095.method1797(arg1, -104);
        if (this.field4095.field4355) {
            int[] var4 = this.method1745(arg1, 1, (byte) 110);
            int[] var5 = this.method1745(arg1, 2, (byte) 125);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class169.field2936; var9++) {
                int var10 = var4[var9] * 255 >> 12 & 0xFF;
                int var11 = var5[var9] * this.field565 >> 12;
                int var12 = class168.field2929[var10] * var11 >> 12;
                int var13 = class268.field4619[var10] * var11 >> 12;
                int var14 = class132.field2356 & (var13 >> 12) + var9;
                int var15 = (var12 >> 12) + arg1 & class74.field1407;
                int[][] var16 = this.method1746(-86, var15, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        if (arg0 <= 34) {
            this.field565 = 35;
        }
        field573++;
        return var3;
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(B)V", line = 100)
    public static void method287(byte arg0) {
        int var1 = -88 % ((-arg0 - 58) / 54);
        field571 = null;
        field577 = null;
        field564 = null;
        field568 = (class204[][]) null;
        field572 = null;
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)V", line = 113)
    public final void method288(int arg0) {
        field567++;
        if (arg0 == 17772) {
            class92.method692(0);
        }
    }

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "(I)V", line = 131)
    public static final void method289(int arg0) {
        if (class137.field2438 > 1) {
            class137.field2438--;
            class149.field2621 = class238.field4039;
        }
        if (class269.field4654 > 0) {
            class269.field4654--;
        }
        field563++;
        if (class104.field1926) {
            class104.field1926 = false;
            class121.method851(0);
            return;
        }
        if (arg0 >= -7) {
            method289(-39);
        }
        for (int var1 = 0; var1 < 100 && class32.method275(-51); var1++) {
        }
        if (class128.field2277 != 30) {
            return;
        }
        class187.method1322(class17.field353, 4, 184);
        Object var2 = class153.field2719.field2564;
        synchronized (class153.field2719.field2564) {
            if (!class211.field3541) {
                class153.field2719.field2571 = 0;
            } else if (class232.field3916 != 0 || class153.field2719.field2571 >= 40) {
                class14.field311++;
                class17.field353.method1214(-115, 114);
                class17.field353.method130(-1, 0);
                int var3 = class17.field353.field281;
                int var4 = 0;
                for (int var5 = 0; class153.field2719.field2571 > var5 && (class17.field353.field281 - var3) < 240; var5++) {
                    var4++;
                    boolean var6 = false;
                    int var7 = class153.field2719.field2568[var5];
                    int var8 = class153.field2719.field2567[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class153.field2719.field2568[var5] == -1 && class153.field2719.field2567[var5] == -1) {
                        var8 = -1;
                        var7 = -1;
                        var6 = true;
                    }
                    if (class104.field1929 != var8 || class75.field1420 != var7) {
                        int var9 = var8 - class104.field1929;
                        class104.field1929 = var8;
                        int var10 = var7 - class75.field1420;
                        class75.field1420 = var7;
                        if (class91.field1629 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class17.field353.method145(125, (class91.field1629 << 12) + (var9 << 6) + var10);
                            class91.field1629 = 0;
                        } else if (class91.field1629 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var10 += 128;
                            class17.field353.method130(-1, class91.field1629 + 128);
                            var9 += 128;
                            class17.field353.method145(100, (var9 << 8) + var10);
                            class91.field1629 = 0;
                        } else if (class91.field1629 >= 32) {
                            class17.field353.method145(76, class91.field1629 + 57344);
                            if (var6) {
                                class17.field353.method128((byte) -27, Integer.MIN_VALUE);
                            } else {
                                class17.field353.method128((byte) -51, var7 << 16 | var8);
                            }
                            class91.field1629 = 0;
                        } else {
                            class17.field353.method130(-1, class91.field1629 + 192);
                            if (var6) {
                                class17.field353.method128((byte) 119, Integer.MIN_VALUE);
                            } else {
                                class17.field353.method128((byte) -57, var7 << 16 | var8);
                            }
                            class91.field1629 = 0;
                        }
                    } else if (class91.field1629 < 2047) {
                        class91.field1629++;
                    }
                }
                class17.field353.method155(-128, class17.field353.field281 - var3);
                if (class153.field2719.field2571 > var4) {
                    class153.field2719.field2571 -= var4;
                    for (int var11 = 0; var11 < class153.field2719.field2571; var11++) {
                        class153.field2719.field2567[var11] = class153.field2719.field2567[var4 + var11];
                        class153.field2719.field2568[var11] = class153.field2719.field2568[var4 + var11];
                    }
                } else {
                    class153.field2719.field2571 = 0;
                }
            }
        }
        if (class232.field3916 != 0) {
            class242.field4188++;
            long var13 = (class169.field2946 - class206.field3512) / 50L;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            class206.field3512 = class169.field2946;
            int var15 = (int) var13;
            int var16 = class268.field4609;
            byte var17 = 0;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var18 = class238.field4061;
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 65535) {
                var18 = 65535;
            }
            if (class232.field3916 == 2) {
                var17 = 1;
            }
            class17.field353.method1214(-126, 145);
            class17.field353.method162((byte) 58, var18 << 16 | var16);
            class17.field353.method126(var15 | var17 << 15, true);
        }
        if (class120.field2174[96] || class120.field2174[97] || class120.field2174[98] || class120.field2174[99]) {
            class202.field3462 = true;
        }
        if (class223.field3803 > 0) {
            class223.field3803--;
        }
        if (class202.field3462 && class223.field3803 <= 0) {
            class223.field3803 = 20;
            class202.field3462 = false;
            class114.field2098++;
            class17.field353.method1214(-75, 116);
            class17.field353.method145(92, class77.field1459);
            class17.field353.method149(class241.field4157, true);
        }
        if (class77.field1458 && !class288.field4927) {
            class288.field4927 = true;
            class246.field4293++;
            class17.field353.method1214(-18, 55);
            class17.field353.method130(-1, 1);
        }
        if (!class77.field1458 && class288.field4927) {
            class288.field4927 = false;
            class246.field4293++;
            class17.field353.method1214(-28, 55);
            class17.field353.method130(-1, 0);
        }
        if (!class259.field4465) {
            class244.field4215++;
            class17.field353.method1214(-87, 23);
            class17.field353.method162((byte) 58, class241.method1751((byte) -91));
            class259.field4465 = true;
        }
        class161.method1162((byte) 15);
        if (class128.field2277 != 30) {
            return;
        }
        class158.method1134(8503);
        class188.method1328(79);
        class133.field2361++;
        if (class133.field2361 > 750) {
            class121.method851(0);
            return;
        }
        class143.method1014((byte) -92);
        class264.method1855(6930);
        class242.method1768(10586);
        if (class47.field790 != null) {
            class15.method170(1);
        }
        for (int var19 = class229.method1654(0, true); var19 != -1; var19 = class229.method1654(0, false)) {
            class65.method546(var19, -10);
            class290.field4982[class224.method1614(31, class307.field5246++)] = var19;
        }
        for (class299 var20 = class6.method63(false); var20 != null; var20 = class6.method63(false)) {
            int var21 = var20.method2086((byte) -63);
            int var22 = var20.method2087((byte) -113);
            if (var21 == 1) {
                class40.field633[var22] = var20.field5153;
                class43.field699[class224.method1614(class272.field4670++, 31)] = var22;
            } else if (var21 == 2) {
                class32.field533[var22] = var20.field5159;
                class130.field2317[class224.method1614(31, class124.field2243++)] = var22;
            } else if (var21 == 3) {
                class60 var23 = class125.method907(var22, -71);
                if (!var20.field5159.method519((byte) 124, var23.field1053)) {
                    var23.field1053 = var20.field5159;
                    class190.method1342(var23, 0);
                }
            } else if (var21 == 4) {
                class60 var24 = class125.method907(var22, -81);
                int var25 = var20.field5153;
                int var26 = var20.field5152;
                if (var24.field1012 != var25 || var24.field1067 != var26) {
                    var24.field1012 = var25;
                    var24.field1067 = var26;
                    class190.method1342(var24, 0);
                }
            } else if (var21 == 5) {
                class60 var42 = class125.method907(var22, -98);
                if (var20.field5153 != var42.field1026 || var20.field5153 == -1) {
                    var42.field1085 = 0;
                    var42.field1082 = 0;
                    var42.field1026 = var20.field5153;
                    class190.method1342(var42, 0);
                }
            } else if (var21 == 6) {
                int var27 = var20.field5153;
                int var28 = var27 >> 10 & 0x1F;
                int var29 = (var27 & 0x3EF) >> 5;
                int var30 = var27 & 0x1F;
                int var31 = (var28 << 19) - (-(var29 << 11) - (var30 << 3));
                class60 var32 = class125.method907(var22, -122);
                if (var32.field1024 != var31) {
                    var32.field1024 = var31;
                    class190.method1342(var32, 0);
                }
            } else if (var21 == 7) {
                class60 var33 = class125.method907(var22, -99);
                boolean var34 = var20.field5153 == 1;
                if (var33.field1102 != var34) {
                    var33.field1102 = var34;
                    class190.method1342(var33, 0);
                }
            } else if (var21 == 8) {
                class60 var35 = class125.method907(var22, -107);
                if (var20.field5153 != var35.field1146 || var20.field5152 != var35.field1009 || var20.field5157 != var35.field1148) {
                    var35.field1009 = var20.field5152;
                    var35.field1148 = var20.field5157;
                    var35.field1146 = var20.field5153;
                    if (var35.field1169 != -1) {
                        if (var35.field1140 > 0) {
                            var35.field1148 = var35.field1148 * 32 / var35.field1140;
                        } else if (var35.field1161 > 0) {
                            var35.field1148 = var35.field1148 * 32 / var35.field1161;
                        }
                    }
                    class190.method1342(var35, 0);
                }
            } else if (var21 == 9) {
                class60 var41 = class125.method907(var22, -83);
                if (var20.field5153 != var41.field1169 || var20.field5152 != var41.field1088) {
                    var41.field1169 = var20.field5153;
                    var41.field1088 = var20.field5152;
                    class190.method1342(var41, 0);
                }
            } else if (var21 == 10) {
                class60 var36 = class125.method907(var22, -71);
                if (var20.field5153 != var36.field1173 || var20.field5152 != var36.field1153 || var20.field5157 != var36.field1105) {
                    var36.field1173 = var20.field5153;
                    var36.field1105 = var20.field5157;
                    var36.field1153 = var20.field5152;
                    class190.method1342(var36, 0);
                }
            } else if (var21 == 11) {
                class60 var40 = class125.method907(var22, -69);
                var40.field1040 = var40.field1021 = var20.field5153;
                var40.field1159 = 0;
                var40.field1032 = var40.field1094 = var20.field5152;
                var40.field1168 = 0;
                class190.method1342(var40, 0);
            } else if (var21 == 12) {
                class60 var38 = class125.method907(var22, -124);
                int var39 = var20.field5153;
                if (var38 != null && var38.field1091 == 0) {
                    if (var39 > var38.field1171 - var38.field1016) {
                        var39 = var38.field1171 - var38.field1016;
                    }
                    if (var39 < 0) {
                        var39 = 0;
                    }
                    if (var38.field1022 != var39) {
                        var38.field1022 = var39;
                        class190.method1342(var38, 0);
                    }
                }
            } else if (var21 == 13) {
                class60 var37 = class125.method907(var22, -118);
                var37.field1095 = var20.field5153;
            }
        }
        class249.field4327++;
        if (class237.field3995 != 0) {
            class238.field4051 += 20;
            if (class238.field4051 >= 400) {
                class237.field3995 = 0;
            }
        }
        if (class8.field180 != null) {
            class307.field5244++;
            if (class307.field5244 >= 15) {
                class190.method1342(class8.field180, 0);
                class8.field180 = null;
            }
        }
        if (class265.field4561 != null) {
            class190.method1342(class265.field4561, 0);
            class81.field1504++;
            if (class134.field2383 + 5 < class281.field4835 || (class134.field2383 - 5) > class281.field4835 || class273.field4690 + 5 < class188.field3213 || (class273.field4690 - 5) > class188.field3213) {
                class138.field2459 = true;
            }
            if (class260.field4472 == 0) {
                if (class138.field2459 && class81.field1504 >= 5) {
                    if (class69.field1328 == class265.field4561 && class71.field1377 != class70.field1347) {
                        class60 var43 = class265.field4561;
                        class190.field3263++;
                        byte var44 = 0;
                        if (class70.field1355 == 1 && var43.field1013 == 206) {
                            var44 = 1;
                        }
                        if (var43.field1117[class70.field1347] <= 0) {
                            var44 = 0;
                        }
                        if (class11.method95(0, client.method1762(var43))) {
                            int var45 = class71.field1377;
                            int var46 = class70.field1347;
                            var43.field1117[var46] = var43.field1117[var45];
                            var43.field1110[var46] = var43.field1110[var45];
                            var43.field1117[var45] = -1;
                            var43.field1110[var45] = 0;
                        } else if (var44 == 1) {
                            int var47 = class70.field1347;
                            int var48 = class71.field1377;
                            while (var47 != var48) {
                                if (var48 > var47) {
                                    var43.method475((byte) -93, var48 - 1, var48);
                                    var48--;
                                } else if (var47 > var48) {
                                    var43.method475((byte) -123, var48 + 1, var48);
                                    var48++;
                                }
                            }
                        } else {
                            var43.method475((byte) -103, class70.field1347, class71.field1377);
                        }
                        class17.field353.method1214(-117, 224);
                        class17.field353.method126(class71.field1377, true);
                        class17.field353.method114(var44, (byte) 123);
                        class17.field353.method145(75, class70.field1347);
                        class17.field353.method162((byte) 58, class265.field4561.field1080);
                    }
                } else if ((class146.field2591 == 1 || class298.method2083(2047, class220.field3736 - 1)) && class220.field3736 > 2) {
                    class46.method343(0);
                } else if (class220.field3736 > 0) {
                    class283.method1967(-21576);
                }
                class265.field4561 = null;
                class232.field3916 = 0;
                class307.field5244 = 10;
            }
        }
        class218.field3708 = false;
        class188.field3239 = null;
        class156.field2762 = 0;
        class175.field2999 = false;
        class60 var49 = class189.field3256;
        class189.field3256 = null;
        class60 var50 = class297.field5116;
        class297.field5116 = null;
        while (class202.method1416(32) && class156.field2762 < 128) {
            class301.field5171[class156.field2762] = class242.field4196;
            class253.field4398[class156.field2762] = class211.field3564;
            class156.field2762++;
        }
        class47.field790 = null;
        class197.field3375 = null;
        if (class83.field1524 != -1) {
            class199.method1396(0, class83.field1524, (byte) 98, 0, class13.field290, class58.field960, 0, 0);
        }
        class238.field4039++;
        if (class197.field3375 != null) {
            class101.method751(class197.field3375, class85.field1564, class135.field2417, true);
            class197.field3375 = null;
        }
        while (true) {
            class11 var51;
            class60 var52;
            class60 var53;
            do {
                var51 = (class11) class102.field1837.method780((byte) 127);
                if (var51 == null) {
                    while (true) {
                        class11 var54;
                        class60 var55;
                        class60 var56;
                        do {
                            var54 = (class11) class70.field1353.method780((byte) -73);
                            if (var54 == null) {
                                while (true) {
                                    class11 var57;
                                    class60 var58;
                                    class60 var59;
                                    do {
                                        var57 = (class11) class306.field5220.method780((byte) -82);
                                        if (var57 == null) {
                                            if (class227.field3866 && class47.field790 == null) {
                                                class227.field3866 = false;
                                            }
                                            if (class263.field4511 != null) {
                                                class118.method838(117);
                                            }
                                            if (class301.field5174 > 0 && class120.field2174[82] && class120.field2174[81] && class266.field4570 != 0) {
                                                int var60 = class20.field364 - class266.field4570;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class180.method1283(68, class139.field2472.field1876[0] + class190.field3269, var60, class121.field2184 + class139.field2472.field1898[0]);
                                            }
                                            if (class252.field4383 != -1) {
                                                int var61 = class252.field4383;
                                                int var62 = class202.field3457;
                                                if (class301.field5174 > 0 && class120.field2174[82] && class120.field2174[81]) {
                                                    class180.method1283(110, class190.field3269 + var61, class20.field364, class121.field2184 + var62);
                                                } else if (class15.field320) {
                                                    class17.field353.method1214(-104, 9);
                                                    class17.field353.method145(118, class223.field3809);
                                                    class10.field204++;
                                                    class17.field353.method122((byte) 99, class185.field3168);
                                                    class17.field353.method160((byte) -77, class190.field3269 + var61);
                                                    class17.field353.method160((byte) -111, class121.field2184 + var62);
                                                    class237.field4004 = class238.field4061;
                                                    class238.field4051 = 0;
                                                    class277.field4778 = class268.field4609;
                                                    class237.field3995 = 1;
                                                } else {
                                                    boolean var63 = class85.method650(0, 0, 0, -12920, var61, var62, 0, true, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 0);
                                                    if (var63) {
                                                        class237.field4004 = class238.field4061;
                                                        class238.field4051 = 0;
                                                        class277.field4778 = class268.field4609;
                                                        class237.field3995 = 1;
                                                    }
                                                }
                                                class252.field4383 = -1;
                                                class15.field320 = false;
                                            }
                                            class139.method992(67);
                                            if (class189.field3256 != var49) {
                                                if (var49 != null) {
                                                    class190.method1342(var49, 0);
                                                }
                                                if (class189.field3256 != null) {
                                                    class190.method1342(class189.field3256, 0);
                                                }
                                            }
                                            if (class297.field5116 != var50 && class270.field4664 == class131.field2328) {
                                                if (var50 != null) {
                                                    class190.method1342(var50, 0);
                                                }
                                                if (class297.field5116 != null) {
                                                    class190.method1342(class297.field5116, 0);
                                                }
                                            }
                                            if (class297.field5116 == null) {
                                                if (class270.field4664 > 0) {
                                                    class270.field4664--;
                                                }
                                            } else if (class270.field4664 < class131.field2328) {
                                                class270.field4664++;
                                                if (class270.field4664 == class131.field2328) {
                                                    class190.method1342(class297.field5116, 0);
                                                }
                                            }
                                            if (class238.field4054 == 1) {
                                                class8.method75(-121);
                                            } else if (class238.field4054 == 2) {
                                                class141.method1004(116);
                                            } else {
                                                class54.method405(-104);
                                            }
                                            for (int var64 = 0; var64 < 5; var64++) {
                                                int var10002 = class315.field5341[var64]++;
                                            }
                                            int var65 = class13.method117(4057);
                                            int var66 = class59.method456(1);
                                            if (var65 > 4500 && var66 > 4500) {
                                                class288.field4922++;
                                                class269.field4654 = 250;
                                                class252.method1807(-12965, 4000);
                                                class17.field353.method1214(-37, 88);
                                            }
                                            if (class42.field691 != null && class42.field691.field375 == 1) {
                                                if (class42.field691.field377 != null) {
                                                    class314.method2173(class84.field1555, -7704, class124.field2249);
                                                }
                                                class42.field691 = null;
                                                class124.field2249 = null;
                                                class84.field1555 = false;
                                            }
                                            class54.field893++;
                                            class266.field4578++;
                                            class89.field1610++;
                                            if (class89.field1610 > 500) {
                                                class89.field1610 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x2) == 2) {
                                                    class181.field3112 += class131.field2344;
                                                }
                                                if ((var67 & 0x4) == 4) {
                                                    class44.field720 += class120.field2175;
                                                }
                                                if ((var67 & 0x1) == 1) {
                                                    class44.field719 += class85.field1577;
                                                }
                                            }
                                            if (class44.field719 < -50) {
                                                class85.field1577 = 2;
                                            }
                                            if (class54.field893 > 500) {
                                                class54.field893 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x2) == 2) {
                                                    class277.field4766 += class306.field5239;
                                                }
                                                if ((var68 & 0x1) == 1) {
                                                    class154.field2734 += class206.field3517;
                                                }
                                            }
                                            if (class44.field720 < -40) {
                                                class120.field2175 = 1;
                                            }
                                            if (class277.field4766 < -20) {
                                                class306.field5239 = 1;
                                            }
                                            if (class154.field2734 < -60) {
                                                class206.field3517 = 2;
                                            }
                                            if (class44.field719 > 50) {
                                                class85.field1577 = -2;
                                            }
                                            if (class154.field2734 > 60) {
                                                class206.field3517 = -2;
                                            }
                                            if (class44.field720 > 40) {
                                                class120.field2175 = -1;
                                            }
                                            if (class181.field3112 < -55) {
                                                class131.field2344 = 2;
                                            }
                                            if (class181.field3112 > 55) {
                                                class131.field2344 = -2;
                                            }
                                            if (class277.field4766 > 10) {
                                                class306.field5239 = -1;
                                            }
                                            if (class266.field4578 > 50) {
                                                class85.field1572++;
                                                class17.field353.method1214(-111, 118);
                                            }
                                            if (class56.field944) {
                                                class310.method2147(true);
                                                class56.field944 = false;
                                            }
                                            try {
                                                if (class216.field3626 != null && class17.field353.field281 > 0) {
                                                    class216.field3626.method227(class17.field353.field254, 0, 3, class17.field353.field281);
                                                    class266.field4578 = 0;
                                                    class17.field353.field281 = 0;
                                                }
                                            } catch (IOException var70) {
                                                class121.method851(0);
                                            }
                                            return;
                                        }
                                        var58 = var57.field212;
                                        if (var58.field1167 < 0) {
                                            break;
                                        }
                                        var59 = class125.method907(var58.field1113, -118);
                                    } while (var59 == null || var59.field1100 == null || var58.field1167 >= var59.field1100.length || var59.field1100[var58.field1167] != var58);
                                    class218.method1562((byte) 56, var57);
                                }
                            }
                            var55 = var54.field212;
                            if (var55.field1167 < 0) {
                                break;
                            }
                            var56 = class125.method907(var55.field1113, -117);
                        } while (var56 == null || var56.field1100 == null || var56.field1100.length <= var55.field1167 || var56.field1100[var55.field1167] != var55);
                        class218.method1562((byte) 55, var54);
                    }
                }
                var52 = var51.field212;
                if (var52.field1167 < 0) {
                    break;
                }
                var53 = class125.method907(var52.field1113, -91);
            } while (var53 == null || var53.field1100 == null || var53.field1100.length <= var52.field1167 || var53.field1100[var52.field1167] != var52);
            class218.method1562((byte) 78, var51);
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V", line = 1129)
    public class35() {
        super(3, false);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(BI)V", line = 1143)
    public static final void method290(byte arg0, int arg1) {
        field569++;
        if (!class159.method1148(-1, arg1)) {
            return;
        }
        class60[] var2 = class272.field4675[arg1];
        if (arg0 > -88) {
            method287((byte) -90);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class60 var4 = var2[var3];
            if (var4 != null) {
                var4.field1085 = 0;
                var4.field1082 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)[I", line = 1194)
    public final int[] method12(int arg0, int arg1) {
        int[] var3 = this.field4094.method179(arg1, true);
        if (this.field4094.field344) {
            int[] var4 = this.method1745(arg1, 1, (byte) 107);
            int[] var5 = this.method1745(arg1, 2, (byte) 111);
            for (int var6 = 0; var6 < class169.field2936; var6++) {
                int var7 = var4[var6] >> 4 & 0xFF;
                int var8 = var5[var6] * this.field565 >> 12;
                int var9 = class268.field4619[var7] * var8 >> 12;
                int var10 = (var9 >> 12) + var6 & class132.field2356;
                int var11 = class168.field2929[var7] * var8 >> 12;
                int var12 = (var11 >> 12) + arg1 & class74.field1407;
                int[] var13 = this.method1745(var12, 0, (byte) 112);
                var3[var6] = var13[var10];
            }
        }
        field575++;
        if (arg0 != 64) {
            field564 = (class64) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZJ[I)Lcd;", line = 1246)
    public static final class64 method291(int arg0, boolean arg1, long arg2, int[] arg3) {
        field574++;
        if (!arg1) {
            field564 = (class64) null;
        }
        if (class82.field1509 != null) {
            class64 var5 = class82.field1509.method1506(arg2, arg3, -38, arg0);
            if (var5 != null) {
                return var5;
            }
        }
        return arg0 == 5 ? class99.method734(arg1, arg2).method510(125) : class275.method1909(arg2, (byte) 106);
    }
}
