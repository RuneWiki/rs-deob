import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class58 {

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Lp;")
    public static class280 field933 = class18.method140((byte) -121, "<col=00ff00>");

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Lp;")
    public static class280 field934 = class18.method140((byte) -127, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Lp;")
    private static class280 field939 = class18.method140((byte) -126, "red:");

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Lp;")
    public static class280 field938 = class18.method140((byte) -122, " loggt sich ein)3");

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Lp;")
    public static class280 field935 = field939;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "S")
    public static short field940 = 1;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Lp;")
    public static class280 field941 = field939;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field936 = 0;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Lp;")
    public static class280 field943 = class18.method140((byte) -118, "Connexion au serveur de mise -9 jour en cours");

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "Lp;")
    private static class280 field945 = class18.method140((byte) -125, "Connection lost)3");

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lp;")
    public static class280 field937 = field945;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "[I")
    public static int[] field947;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
    public static final void method414(int arg0, int arg1, int arg2) {
        class17.field314[arg0] = arg2;
        if (arg1 != 7) {
            method417((class277) null, -118);
        }
        class116 var3 = (class116) class176.field3063.method150((long) arg0, 107);
        if (var3 == null) {
            class116 var4 = new class116(class77.method569((byte) -118) + 500L);
            class176.field3063.method148(-1, var4, (long) arg0);
        } else {
            var3.field2095 = class77.method569((byte) 28) + 500L;
        }
        field942++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method415(int arg0) {
        field934 = null;
        field945 = null;
        field947 = null;
        field943 = null;
        if (arg0 != 768) {
            field945 = null;
        }
        field938 = null;
        field935 = null;
        field933 = null;
        field941 = null;
        field939 = null;
        field937 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method416(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field944++;
        if (class89.field1440 <= arg0 && class12.field249 >= arg2 && arg7 >= class36.field654 && arg5 <= class249.field4360) {
            class161.method1145(arg0, arg6, arg5, arg4, (byte) -1, arg2, arg7, arg3);
        } else {
            class105.method736(arg3, arg2, arg5, arg4, arg0, arg7, (byte) -115, arg6);
        }
        if (arg1 >= -14) {
            field941 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lrf;I)V")
    public static final void method417(class277 arg0, int arg1) {
        field946++;
        arg0.field4803 = arg0.field4834;
        if (arg0.field4816 == 0) {
            arg0.field4833 = 0;
            return;
        }
        if (arg0.field4853 != -1 && arg0.field4821 == 0) {
            class78 var2 = class207.method1401((byte) -22, arg0.field4853);
            if (arg0.field4864 > 0 && var2.field1291 == 0) {
                arg0.field4833++;
                return;
            }
            if (arg0.field4864 <= 0 && var2.field1276 == 0) {
                arg0.field4833++;
                return;
            }
        }
        if (arg1 >= -78) {
            field941 = null;
        }
        int var3 = arg0.field4791;
        int var4 = arg0.field4793;
        int var5 = arg0.field4837[arg0.field4816 - 1] * 128 + (arg0.method984((byte) -34) * 64);
        int var6 = arg0.field4792[arg0.field4816 - 1] * 128 + (arg0.method984((byte) -34) * 64);
        if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || (var6 - var4) < -256) {
            arg0.field4793 = var6;
            arg0.field4791 = var5;
            return;
        }
        if (var5 > var3) {
            if (var4 < var6) {
                arg0.field4863 = 1280;
            } else if (var4 <= var6) {
                arg0.field4863 = 1536;
            } else {
                arg0.field4863 = 1792;
            }
        } else if (var5 >= var3) {
            if (var6 > var4) {
                arg0.field4863 = 1024;
            } else if (var6 < var4) {
                arg0.field4863 = 0;
            }
        } else if (var4 < var6) {
            arg0.field4863 = 768;
        } else if (var4 <= var6) {
            arg0.field4863 = 512;
        } else {
            arg0.field4863 = 256;
        }
        int var7 = arg0.field4822;
        int var8 = arg0.field4863 - arg0.field4809 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg0.field4850;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg0.field4858;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg0.field4855;
        }
        boolean var9 = true;
        int var10 = 4;
        if (var7 == -1) {
            var7 = arg0.field4850;
        }
        arg0.field4803 = var7;
        if (arg0 instanceof class61) {
            var9 = ((class61) arg0).field987.field4487;
        }
        if (var9) {
            if (arg0.field4863 != arg0.field4809 && arg0.field4829 == -1 && arg0.field4843 != 0) {
                var10 = 2;
            }
            if (arg0.field4816 > 2) {
                var10 = 6;
            }
            if (arg0.field4816 > 3) {
                var10 = 8;
            }
            if (arg0.field4833 > 0 && arg0.field4816 > 1) {
                arg0.field4833--;
                var10 = 8;
            }
        } else {
            if (arg0.field4816 > 1) {
                var10 = 6;
            }
            if (arg0.field4816 > 2) {
                var10 = 8;
            }
            if (arg0.field4833 > 0 && arg0.field4816 > 1) {
                var10 = 8;
                arg0.field4833--;
            }
        }
        if (arg0.field4859[arg0.field4816 - 1]) {
            var10 <<= 0x1;
        }
        if (var3 < var5) {
            arg0.field4791 += var10;
            if (arg0.field4791 > var5) {
                arg0.field4791 = var5;
            }
        } else if (var5 < var3) {
            arg0.field4791 -= var10;
            if (arg0.field4791 < var5) {
                arg0.field4791 = var5;
            }
        }
        if (var10 >= 8 && arg0.field4850 == arg0.field4803 && arg0.field4794 != -1) {
            arg0.field4803 = arg0.field4794;
        }
        if (var4 < var6) {
            arg0.field4793 += var10;
            if (arg0.field4793 > var6) {
                arg0.field4793 = var6;
            }
        } else if (var4 > var6) {
            arg0.field4793 -= var10;
            if (var6 > arg0.field4793) {
                arg0.field4793 = var6;
            }
        }
        if (arg0.field4791 == var5 && arg0.field4793 == var6) {
            if (arg0.field4864 > 0) {
                arg0.field4864--;
            }
            arg0.field4816--;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    public static final void method418(int arg0) {
        field932++;
        if (class85.field1394 == 183) {
            int var1 = class20.field367.method189((byte) -103);
            int var2 = ((var1 & 0x77) >> 4) + class190.field3331;
            int var3 = class22.field404 + (var1 & 0x7);
            int var4 = class20.field367.method193((byte) 77);
            int var5 = class20.field367.method189((byte) -103);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var6 = (var5 & 0xFA) >> 4;
            int var7 = var5 & 0x7;
            int var8 = class20.field367.method189((byte) -103);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                int var9 = var6 + 1;
                if (class262.field4631.field4837[0] >= (var2 - var9) && class262.field4631.field4837[0] <= (var2 + var9) && class262.field4631.field4792[0] >= (var3 - var9) && class262.field4631.field4792[0] <= var3 + var9 && class54.field892 != 0 && var7 > 0 && class79.field1304 < 50 && var4 != -1) {
                    class14.field274[class79.field1304] = var4;
                    class153.field2658[class79.field1304] = var7;
                    class208.field3591[class79.field1304] = var8;
                    class64.field1051[class79.field1304] = null;
                    class237.field4115[class79.field1304] = (var2 << 16) + (var3 << 8) + var6;
                    class79.field1304++;
                }
            }
        } else if (class85.field1394 == 15) {
            int var10 = class20.field367.method189((byte) -103);
            int var11 = var10 & 0x3;
            int var12 = var10 >> 2;
            int var13 = class161.field2817[var12];
            int var14 = class20.field367.method220(true);
            int var15 = (var14 >> 4 & 0x7) + class190.field3331;
            int var16 = (var14 & 0x7) + class22.field404;
            int var17 = class20.field367.method216(false);
            if (var17 == 65535) {
                var17 = -1;
            }
            class21.method166(var15, var12, var13, var16, class231.field4013, (byte) -68, var11, var17);
        } else if (class85.field1394 == 75) {
            int var18 = class20.field367.method189((byte) -103);
            int var19 = class22.field404 + (var18 & 0x7);
            int var20 = ((var18 & 0x77) >> 4) + class190.field3331;
            int var21 = class20.field367.method193((byte) 77);
            int var22 = class20.field367.method193((byte) 77);
            int var23 = class20.field367.method193((byte) 77);
            if (var20 >= 0 && var19 >= 0 && var20 < 104 && var19 < 104) {
                class90 var24 = class165.field2896[class231.field4013][var20][var19];
                if (var24 != null) {
                    for (class60 var25 = (class60) var24.method651(12916); var25 != null; var25 = (class60) var24.method643(11066)) {
                        class81 var26 = var25.field968;
                        if ((var21 & 0x7FFF) == var26.field1326 && var26.field1329 == var22) {
                            var26.field1329 = var23;
                            break;
                        }
                    }
                    class147.method1025(var20, var19, true);
                }
            }
        } else if (class85.field1394 == 74) {
            int var27 = class20.field367.method220(true);
            int var28 = class190.field3331 + (var27 >> 4 & 0x7);
            int var29 = (var27 & 0x7) + class22.field404;
            int var30 = class20.field367.method193((byte) 77);
            if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                class90 var31 = class165.field2896[class231.field4013][var28][var29];
                if (var31 != null) {
                    for (class60 var32 = (class60) var31.method651(12916); var32 != null; var32 = (class60) var31.method643(11066)) {
                        if ((var30 & 0x7FFF) == var32.field968.field1326) {
                            var32.method1146(26159);
                            break;
                        }
                    }
                    if (var31.method651(12916) == null) {
                        class165.field2896[class231.field4013][var28][var29] = null;
                    }
                    class147.method1025(var28, var29, true);
                }
            }
        } else if (class85.field1394 == 243) {
            int var33 = class20.field367.method189((byte) -103);
            int var34 = ((var33 & 0xF0) >> 4) + class190.field3331 * 2;
            int var35 = (var33 & 0xF) + class22.field404 * 2;
            int var36 = var34 + class20.field367.method200(32768);
            int var37 = var35 + class20.field367.method200(32768);
            int var38 = class20.field367.method191(-102);
            int var39 = class20.field367.method193((byte) 77);
            int var40 = class20.field367.method189((byte) -103) * 4;
            int var41 = class20.field367.method189((byte) -103) * 4;
            int var42 = class20.field367.method193((byte) 77);
            int var43 = class20.field367.method193((byte) 77);
            int var44 = class20.field367.method189((byte) -103);
            int var45 = class20.field367.method189((byte) -103);
            if (var34 >= 0 && var35 >= 0 && var34 < 208 && var35 < 208 && var36 >= 0 && var37 >= 0 && var36 < 208 && var37 < 208 && var39 != 65535) {
                int var46 = var34 * 64;
                int var47 = var37 * 64;
                int var48 = var35 * 64;
                int var49 = var36 * 64;
                class192 var50 = new class192(var39, class231.field4013, var46, var48, class158.method1123(class231.field4013, var46, -6230, var48) - var40, class117.field2104 + var42, class117.field2104 + var43, var44, var45, var38, var41);
                var50.method1327(var49, var47, 112, class117.field2104 + var42, class158.method1123(class231.field4013, var49, -6230, var47) + -var41);
                class230.field4009.method649(new class67(var50), (byte) 121);
            }
        } else if (class85.field1394 == 159) {
            int var51 = class20.field367.method189((byte) -103);
            int var52 = (var51 >> 4 & 0x7) + class190.field3331;
            int var53 = (var51 & 0x7) + class22.field404;
            int var54 = class20.field367.method193((byte) 77);
            int var55 = class20.field367.method189((byte) -103);
            int var56 = class20.field367.method193((byte) 77);
            if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                int var57 = var53 * 128 + 64;
                int var58 = var52 * 128 + 64;
                class224 var59 = new class224(var54, class231.field4013, var58, var57, class158.method1123(class231.field4013, var58, -6230, var57) - var55, var56, class117.field2104);
                class211.field3636.method649(new class204(var59), (byte) 76);
            }
        } else if (class85.field1394 == 151) {
            int var60 = class20.field367.method189((byte) -103);
            int var61 = (var60 >> 4 & 0x7) + class190.field3331;
            int var62 = (var60 & 0x7) + class22.field404;
            int var63 = var61 + class20.field367.method200(32768);
            int var64 = var62 + class20.field367.method200(32768);
            int var65 = class20.field367.method191(-106);
            int var66 = class20.field367.method193((byte) 77);
            int var67 = class20.field367.method189((byte) -103) * 4;
            int var68 = class20.field367.method189((byte) -103) * 4;
            int var69 = class20.field367.method193((byte) 77);
            int var70 = class20.field367.method193((byte) 77);
            int var71 = class20.field367.method189((byte) -103);
            int var72 = class20.field367.method189((byte) -103);
            if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104 && var66 != 65535) {
                int var73 = var61 * 128 + 64;
                int var74 = var62 * 128 + 64;
                int var75 = var64 * 128 + 64;
                int var76 = var63 * 128 + 64;
                class192 var77 = new class192(var66, class231.field4013, var73, var74, class158.method1123(class231.field4013, var73, -6230, var74) - var67, class117.field2104 + var69, class117.field2104 + var70, var71, var72, var65, var68);
                var77.method1327(var76, var75, 107, class117.field2104 + var69, class158.method1123(class231.field4013, var76, -6230, var75) - var68);
                class230.field4009.method649(new class67(var77), (byte) 113);
            }
        } else if (class85.field1394 == 196) {
            int var78 = class20.field367.method216(false);
            int var79 = class20.field367.method189((byte) -103);
            int var80 = ((var79 & 0x78) >> 4) + class190.field3331;
            int var81 = class22.field404 + (var79 & 0x7);
            int var82 = class20.field367.method212((byte) -50);
            if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
                class81 var83 = new class81();
                var83.field1326 = var82;
                var83.field1329 = var78;
                if (class165.field2896[class231.field4013][var80][var81] == null) {
                    class165.field2896[class231.field4013][var80][var81] = new class90();
                }
                class165.field2896[class231.field4013][var80][var81].method649(new class60(var83), (byte) 122);
                class147.method1025(var80, var81, true);
            }
        } else {
            if (class85.field1394 == 55) {
                int var84 = class20.field367.method211(false);
                int var85 = var84 >> 2;
                int var86 = class161.field2817[var85];
                byte var87 = class20.field367.method200(32768);
                int var88 = var84 & 0x3;
                int var89 = class20.field367.method217(true);
                int var90 = (var89 & 0x7) + class22.field404;
                int var91 = class190.field3331 + ((var89 & 0x7B) >> 4);
                int var92 = class20.field367.method213((byte) 113);
                int var93 = class20.field367.method213((byte) 113);
                byte var94 = class20.field367.method232(64);
                int var95 = class20.field367.method212((byte) -50);
                int var96 = class20.field367.method212((byte) -50);
                byte var97 = class20.field367.method200(32768);
                byte var98 = class20.field367.method202(0);
                class142 var99;
                if (class11.field240 == var92) {
                    var99 = class262.field4631;
                } else {
                    var99 = class280.field4940[var92];
                }
                if (var99 != null) {
                    class130 var100 = class32.method277((byte) -64, var96);
                    int var101;
                    int var102;
                    if (var88 == 1 || var88 == 3) {
                        var102 = var100.field2277;
                        var101 = var100.field2265;
                    } else {
                        var101 = var100.field2277;
                        var102 = var100.field2265;
                    }
                    int[][] var103 = class145.field2529[class231.field4013];
                    int[][] var104 = null;
                    int var105 = (var101 + 1 >> 1) + var91;
                    int var106 = (var102 + 1 >> 1) + var90;
                    int var107 = (var101 >> 1) + var91;
                    if (class231.field4013 < 3) {
                        var104 = class145.field2529[class231.field4013 + 1];
                    }
                    int var108 = var90 + (var102 >> 1);
                    int var109 = var103[var107][var108] + var103[var107][var106] + var103[var105][var106] + var103[var105][var108] >> 2;
                    int var110 = (var90 << 7) + (var102 << 6);
                    int var111 = (var91 << 7) + (var101 << 6);
                    class273 var112 = var100.method897(var88, false, var103, var111, var110, var85, var104, var100.field2293, 65, var109, (class5) null);
                    if (var112 != null) {
                        class51.method380(var91, class231.field4013, var90, var93 + 1, -1, var86, 0, (byte) -50, var95 + 1, 0);
                        if (var97 < var87) {
                            byte var113 = var87;
                            var87 = var97;
                            var97 = var113;
                        }
                        var99.field2468 = var91 + var87;
                        var99.field2466 = (class256) var112.field4751;
                        var99.field2499 = var90 * 128 + var102 * 64;
                        var99.field2467 = class117.field2104 + var93;
                        var99.field2489 = var109;
                        if (var94 < var98) {
                            byte var114 = var98;
                            var98 = var94;
                            var94 = var114;
                        }
                        var99.field2460 = var91 * 128 + (var101 * 64);
                        var99.field2484 = var91 + var97;
                        var99.field2506 = var90 + var94;
                        var99.field2507 = var90 + var98;
                        var99.field2477 = var95 + class117.field2104;
                    }
                }
            }
            if (class85.field1394 == 246) {
                int var115 = class20.field367.method211(false);
                int var116 = (var115 >> 4 & 0x7) + class190.field3331;
                int var117 = class22.field404 + (var115 & 0x7);
                int var118 = class20.field367.method211(false);
                int var119 = var118 >> 2;
                int var120 = class161.field2817[var119];
                int var121 = var118 & 0x3;
                if (var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104) {
                    class51.method380(var116, class231.field4013, var117, -1, -1, var120, var119, (byte) 91, 0, var121);
                }
            } else if (class85.field1394 == 140) {
                int var122 = class20.field367.method213((byte) 113);
                int var123 = class20.field367.method217(true);
                int var124 = (var123 >> 4 & 0x7) + class190.field3331;
                int var125 = class22.field404 + (var123 & 0x7);
                int var126 = class20.field367.method220(true);
                int var127 = var126 & 0x3;
                int var128 = var126 >> 2;
                int var129 = class161.field2817[var128];
                if (var124 >= 0 && var125 >= 0 && var124 < 104 && var125 < 104) {
                    class51.method380(var124, class231.field4013, var125, -1, var122, var129, var128, (byte) -20, 0, var127);
                }
            } else if (arg0 <= -51 && class85.field1394 == 33) {
                int var130 = class20.field367.method193((byte) 77);
                int var131 = class20.field367.method217(true);
                int var132 = (var131 & 0x7) + class22.field404;
                int var133 = (var131 >> 4 & 0x7) + class190.field3331;
                int var134 = class20.field367.method193((byte) 77);
                int var135 = class20.field367.method213((byte) 113);
                if (var133 >= 0 && var132 >= 0 && var133 < 104 && var132 < 104 && class11.field240 != var135) {
                    class81 var136 = new class81();
                    var136.field1326 = var130;
                    var136.field1329 = var134;
                    if (class165.field2896[class231.field4013][var133][var132] == null) {
                        class165.field2896[class231.field4013][var133][var132] = new class90();
                    }
                    class165.field2896[class231.field4013][var133][var132].method649(new class60(var136), (byte) 86);
                    class147.method1025(var133, var132, true);
                }
            }
        }
    }
}
