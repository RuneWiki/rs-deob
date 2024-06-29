import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class32 {

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Loc;")
    public static class151 field654 = class137.method873(2, "Neuer Benutzer");

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Loc;")
    public static class151 field653 = class137.method873(2, "blaugr-Un:");

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "Loc;")
    public static class151 field656 = class137.method873(2, "weiss:");

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field658 = 0;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "[Z")
    public static boolean[] field662 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field655 = 0;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "[S")
    public static short[] field663 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIBII)V")
    public static final void method234(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class51.field1032 = 0;
        if (arg2 != -78) {
            field658 = -37;
        }
        for (int var5 = -1; var5 < class47.field961 + class23.field505; var5++) {
            class228 var21;
            if (var5 == -1) {
                var21 = class228.field3975;
            } else if (class47.field961 > var5) {
                var21 = class179.field3229[class159.field2866[var5]];
            } else {
                var21 = class122.field2190[class81.field1553[var5 - class47.field961]];
            }
            if (var21 != null && var21.method173(2)) {
                if (var21 instanceof class203) {
                    class67 var22 = ((class203) var21).field3608;
                    if (var22.field1291 != null) {
                        var22 = var22.method446(-99);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (class47.field961 <= var5) {
                    class67 var23 = ((class203) var21).field3608;
                    if (var23.field1291 != null) {
                        var23 = var23.method446(-99);
                    }
                    if (var23.field1310 >= 0 && class192.field3412.length > var23.field1310) {
                        class131.method815(1928491554, var21, var21.method1431(200) + 15);
                        if (class162.field2924 > -1) {
                            class192.field3412[var23.field1310].method545(class162.field2924 + arg1 - 12, class109.field1932 - 30 + arg4);
                        }
                    }
                    class109[] var24 = class47.field967;
                    for (int var25 = 0; var25 < var24.length; var25++) {
                        class109 var26 = var24[var25];
                        if (var26 != null && var26.field1935 == 1 && class81.field1553[var5 - class47.field961] == var26.field1922 && class200.field3541 % 20 < 10) {
                            class131.method815(1928491554, var21, var21.method1431(200) + 15);
                            if (class162.field2924 > -1) {
                                class157.field2838[var26.field1930].method545(class162.field2924 + arg1 - 12, class109.field1932 + -28 + arg4);
                            }
                        }
                    }
                } else {
                    int var27 = 30;
                    class20 var28 = (class20) var21;
                    if (var28.field427 != -1 || var28.field420 != -1) {
                        class131.method815(1928491554, var21, var21.method1431(200) + 15);
                        if (class162.field2924 > -1) {
                            if (var28.field427 != -1) {
                                class131.field2404[var28.field427].method545(arg1 + class162.field2924 - 12, class109.field1932 + arg4 + -var27);
                                var27 += 25;
                            }
                            if (var28.field420 != -1) {
                                class192.field3412[var28.field420].method545(arg1 + class162.field2924 - 12, class109.field1932 + arg4 + -var27);
                                var27 += 25;
                            }
                        }
                    }
                    if (var5 >= 0) {
                        class109[] var29 = class47.field967;
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            class109 var31 = var29[var30];
                            if (var31 != null && var31.field1935 == 10 && class159.field2866[var5] == var31.field1922) {
                                class131.method815(1928491554, var21, var21.method1431(200) + 15);
                                if (class162.field2924 > -1) {
                                    class157.field2838[var31.field1930].method545(class162.field2924 + arg1 - 12, class109.field1932 + arg4 + -var27);
                                }
                            }
                        }
                    }
                }
                if (var21.field4033 != null && (class47.field961 <= var5 || class90.field1657 == 0 || class90.field1657 == 3 || class90.field1657 == 1 && class108.method653(((class20) var21).field416, arg2 + 79))) {
                    class131.method815(1928491554, var21, var21.method1431(arg2 + 278));
                    if (class162.field2924 > -1 && class226.field3947 > class51.field1032) {
                        class226.field3935[class51.field1032] = class19.field403.method1259(var21.field4033) / 2;
                        class226.field3948[class51.field1032] = class19.field403.field3563;
                        class226.field3931[class51.field1032] = class162.field2924;
                        class226.field3949[class51.field1032] = class109.field1932;
                        class226.field3945[class51.field1032] = var21.field3985;
                        class226.field3939[class51.field1032] = var21.field4009;
                        class226.field3938[class51.field1032] = var21.field4026;
                        class226.field3936[class51.field1032] = var21.field4033;
                        class51.field1032++;
                    }
                }
                if (class200.field3541 < var21.field4041) {
                    class131.method815(1928491554, var21, var21.method1431(200) + 15);
                    if (class162.field2924 > -1) {
                        class221.method1375(class162.field2924 + arg1 - 15, arg4 + -3 - -class109.field1932, var21.field3986, 5, 65280);
                        class221.method1375(class162.field2924 + arg1 + var21.field3986 - 15, class109.field1932 + arg4 + -3, 30 - var21.field3986, 5, 16711680);
                    }
                }
                for (int var32 = 0; var32 < 4; var32++) {
                    if (class200.field3541 < var21.field4011[var32]) {
                        class131.method815(1928491554, var21, var21.method1431(arg2 ^ 0xFFFFFF7A) / 2);
                        if (class162.field2924 > -1) {
                            if (var32 == 1) {
                                class109.field1932 -= 20;
                            }
                            if (var32 == 2) {
                                class162.field2924 -= 15;
                                class109.field1932 -= 10;
                            }
                            if (var32 == 3) {
                                class162.field2924 += 15;
                                class109.field1932 -= 10;
                            }
                            class112.field1968[var21.field4014[var32]].method545(arg1 + class162.field2924 - 12, arg4 + -12 - -class109.field1932);
                            class147.field2643.method1254(class137.method874(var21.field4013[var32], false), class162.field2924 + arg1 - 1, arg4 + 3 + class109.field1932, 16777215, 0);
                        }
                    }
                }
            }
        }
        field661++;
        for (int var6 = 0; var6 < class51.field1032; var6++) {
            int var7 = class226.field3931[var6];
            int var8 = class226.field3949[var6];
            int var9 = class226.field3935[var6];
            int var10 = class226.field3948[var6];
            boolean var11 = true;
            while (var11) {
                var11 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (var8 + 2 > class226.field3949[var20] + -class226.field3948[var20] && class226.field3949[var20] + 2 > -var10 + var8 && class226.field3935[var20] + class226.field3931[var20] > -var9 + var7 && class226.field3931[var20] - class226.field3935[var20] < var7 - -var9 && class226.field3949[var20] - class226.field3948[var20] < var8) {
                        var11 = true;
                        var8 = class226.field3949[var20] - class226.field3948[var20];
                    }
                }
            }
            class162.field2924 = class226.field3931[var6];
            class109.field1932 = class226.field3949[var6] = var8;
            class151 var12 = class226.field3936[var6];
            if (class149.field2673 == 0) {
                int var13 = 16776960;
                if (class226.field3945[var6] < 6) {
                    var13 = class68.field1341[class226.field3945[var6]];
                }
                if (class226.field3945[var6] == 6) {
                    var13 = class116.field2080 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class226.field3945[var6] == 7) {
                    var13 = class116.field2080 % 20 >= 10 ? 65535 : 255;
                }
                if (class226.field3945[var6] == 8) {
                    var13 = class116.field2080 % 20 < 10 ? 45056 : 8454016;
                }
                if (class226.field3945[var6] == 9) {
                    int var14 = 150 - class226.field3938[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 16776960 + 16384000 - var14 * 327680;
                    } else if (var14 < 150) {
                        var13 = (var14 - 100) * 5 + 65280;
                    }
                }
                if (class226.field3945[var6] == 10) {
                    int var15 = 150 - class226.field3938[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 16711935 - (var15 - 50) * 327680;
                    } else if (var15 < 150) {
                        var13 = var15 * 327680 + 755 - var15 * 5 - 32768000;
                    }
                }
                if (class226.field3945[var6] == 11) {
                    int var16 = 150 - class226.field3938[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = var16 * 327685 - 16318970;
                    } else if (var16 < 150) {
                        var13 = 16777215 + 32768000 - var16 * 327680;
                    }
                }
                if (class226.field3939[var6] == 0) {
                    class19.field403.method1254(var12, class162.field2924 + arg1, class109.field1932 + arg4, var13, 0);
                }
                if (class226.field3939[var6] == 1) {
                    class19.field403.method1273(var12, class162.field2924 + arg1, class109.field1932 + arg4, var13, 0, class116.field2080);
                }
                if (class226.field3939[var6] == 2) {
                    class19.field403.method1265(var12, class162.field2924 + arg1, arg4 - -class109.field1932, var13, 0, class116.field2080);
                }
                if (class226.field3939[var6] == 3) {
                    class19.field403.method1270(var12, arg1 + class162.field2924, class109.field1932 + arg4, var13, 0, class116.field2080, 150 - class226.field3938[var6]);
                }
                if (class226.field3939[var6] == 4) {
                    int var17 = (150 - class226.field3938[var6]) * (class19.field403.method1259(var12) + 100) / 150;
                    class221.method1379(class162.field2924 + arg1 - 50, arg4, class162.field2924 + arg1 + 50, arg3 + arg4);
                    class19.field403.method1256(var12, class162.field2924 + arg1 + 50 - var17, class109.field1932 + arg4, var13, 0);
                    class221.method1386(arg1, arg4, arg0 + arg1, arg3 + arg4);
                }
                if (class226.field3939[var6] == 5) {
                    int var18 = 150 - class226.field3938[var6];
                    class221.method1379(arg1, class109.field1932 + arg4 - class19.field403.field3563 - 1, arg1 - -arg0, class109.field1932 + arg4 + 5);
                    int var19 = 0;
                    if (var18 < 25) {
                        var19 = var18 - 25;
                    } else if (var18 > 125) {
                        var19 = var18 - 125;
                    }
                    class19.field403.method1254(var12, class162.field2924 + arg1, class109.field1932 + arg4 + var19, var13, 0);
                    class221.method1386(arg1, arg4, arg1 + arg0, arg3 + arg4);
                }
            } else {
                class19.field403.method1254(var12, class162.field2924 + arg1, class109.field1932 + arg4, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZLwd;)V")
    public static final void method235(boolean arg0, class232 arg1) {
        if (arg0) {
            field656 = null;
        }
        field659++;
        int var2 = arg1.field4148;
        if (var2 == 324) {
            if (class15.field340 == -1) {
                class15.field340 = arg1.field4206;
                class117.field2118 = arg1.field4193;
            }
            if (class31.field638.field896) {
                arg1.field4206 = class15.field340;
            } else {
                arg1.field4206 = class117.field2118;
            }
        } else if (var2 == 325) {
            if (class15.field340 == -1) {
                class15.field340 = arg1.field4206;
                class117.field2118 = arg1.field4193;
            }
            if (class31.field638.field896) {
                arg1.field4206 = class117.field2118;
            } else {
                arg1.field4206 = class15.field340;
            }
        } else if (var2 == 327) {
            arg1.field4251 = 150;
            arg1.field4269 = (int) (Math.sin((double) class200.field3541 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field4165 = -1;
            arg1.field4149 = 5;
        } else if (var2 == 328) {
            if (class228.field3975.field416 == null) {
                arg1.field4165 = 0;
            } else {
                arg1.field4251 = 150;
                arg1.field4269 = (int) (Math.sin((double) class200.field3541 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field4149 = 5;
                arg1.field4165 = ((int) class228.field3975.field416.method981(false) << 11) + 2047;
                arg1.field4270 = class228.field3975.field3993;
                arg1.field4150 = class228.field3975.field3974;
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static final void method236(int arg0) {
        int var1 = 22 / ((arg0 - 22) / 36);
        field657++;
        class1.field34.method648(false);
        int var2 = class1.field34.method645(1, (byte) 10);
        if (var2 == 0) {
            return;
        }
        int var3 = class1.field34.method645(2, (byte) 10);
        if (var3 == 0) {
            class218.field3800[class111.field1956++] = 2047;
        } else if (var3 == 1) {
            int var4 = class1.field34.method645(3, (byte) 10);
            class228.field3975.method1430(false, var4, -10527);
            int var5 = class1.field34.method645(1, (byte) 10);
            if (var5 == 1) {
                class218.field3800[class111.field1956++] = 2047;
            }
        } else if (var3 == 2) {
            int var6 = class1.field34.method645(3, (byte) 10);
            class228.field3975.method1430(true, var6, -10527);
            int var7 = class1.field34.method645(3, (byte) 10);
            class228.field3975.method1430(true, var7, -10527);
            int var8 = class1.field34.method645(1, (byte) 10);
            if (var8 == 1) {
                class218.field3800[class111.field1956++] = 2047;
            }
        } else if (var3 == 3) {
            class234.field4325 = class1.field34.method645(2, (byte) 10);
            int var9 = class1.field34.method645(7, (byte) 10);
            int var10 = class1.field34.method645(7, (byte) 10);
            int var11 = class1.field34.method645(1, (byte) 10);
            int var12 = class1.field34.method645(1, (byte) 10);
            if (var12 == 1) {
                class218.field3800[class111.field1956++] = 2047;
            }
            class228.field3975.method1427(var9, var11 == 1, (byte) 14, var10);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static void method237(byte arg0) {
        if (arg0 > -93) {
            return;
        }
        field663 = null;
        field662 = null;
        field654 = null;
        field656 = null;
        field653 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ld;I)V")
    public static final void method238(class34 arg0, int arg1) {
        if (arg0.field705 != null) {
            arg0.field705.field3658 = 0;
        }
        field660++;
        arg0.field707 = false;
        if (arg1 != 0) {
            method238(null, 109);
        }
        for (class34 var2 = arg0.method250(); var2 != null; var2 = arg0.method251()) {
            method238(var2, 0);
        }
    }
}
