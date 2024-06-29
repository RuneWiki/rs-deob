import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public abstract class class141 {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Lid;")
    public static class60 field3204 = class11.method72("zur-Uck auf die RuneScape)2Webseite gehen", (byte) 116);

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Lid;")
    public static class60 field3208 = class11.method72("Keine Antwort vom Anmelde)2Server)3", (byte) 127);

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Lid;")
    public static class60 field3212 = class11.method72("va", (byte) -85);

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "[I")
    public static int[] field3213 = new int[1000];

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field3224 = 0;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "Lid;")
    public static class60 field3214 = class11.method72("M", (byte) -104);

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "Lid;")
    public static class60 field3215 = class11.method72(" <col=ffff00>", (byte) -88);

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "Lid;")
    public static class60 field3211 = class11.method72("<img=0>", (byte) 126);

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "Lid;")
    public static class60 field3223 = class11.method72(" )2> <col=ffff00>", (byte) -30);

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "Lid;")
    public static class60 field3219 = class11.method72("", (byte) 108);

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "Lid;")
    public static class60 field3216 = field3219;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "Lid;")
    public static class60 field3218 = field3219;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "Lid;")
    public static class60 field3220 = field3219;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lid;")
    public static class60 field3205 = field3219;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "Lid;")
    public static class60 field3209 = field3219;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "Lid;")
    public static class60 field3210 = field3219;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "Lid;")
    public static class60 field3229 = class11.method72("Art", (byte) -79);

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    private static int field3227;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "Lfd;")
    public static class40 field3221;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "Lh;")
    public static class49 field3226;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "Lie;")
    public static class61 field3217;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    private static final void method1096(byte arg0) {
        field3228++;
        if (class100.field2421 == 15) {
            int var1 = class56.field1393.method829((byte) 60);
            int var2 = class153.field3421 + (var1 >> 4 & 0x7);
            int var3 = field3227 + (var1 & 0x7);
            int var4 = class56.field1393.method833((byte) 27);
            int var5 = class56.field1393.method823((byte) 117);
            int var6 = var5 >> 2;
            int var7 = class55.field1383[var6];
            int var8 = var5 & 0x3;
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class66.method498(class46.field1222, -1, var3, var4, var2, 0, var8, var7, var6, arg0 - 47);
            }
        } else if (class100.field2421 == 76) {
            int var9 = class56.field1393.method810(-1384376976);
            int var10 = class56.field1393.method829((byte) 63);
            int var11 = var10 & 0x3;
            int var12 = var10 >> 2;
            int var13 = class55.field1383[var12];
            int var14 = class56.field1393.method829((byte) -120);
            int var15 = (var14 >> 4 & 0x7) + class153.field3421;
            int var16 = (var14 & 0x7) + field3227;
            if (var15 >= 0 && var16 >= 0 && var15 < 103 && var16 < 103) {
                int var17 = class113.field2711[class46.field1222][var15][var16];
                int var18 = class113.field2711[class46.field1222][var15 + 1][var16];
                int var19 = class113.field2711[class46.field1222][var15 + 1][var16 + 1];
                int var20 = class113.field2711[class46.field1222][var15][var16 + 1];
                if (var13 == 0) {
                    class89 var21 = class43.field1151.method585(class46.field1222, var15, var16);
                    if (var21 != null) {
                        int var22 = var21.field2207 >> 14 & 0x7FFF;
                        if (var12 == 2) {
                            var21.field2200 = new class135(var22, 2, var11 + 4, var17, var18, var19, var20, var9, false, var21.field2200);
                            var21.field2216 = new class135(var22, 2, var11 + 1 & 0x3, var17, var18, var19, var20, var9, false, var21.field2216);
                        } else {
                            var21.field2200 = new class135(var22, var12, var11, var17, var18, var19, var20, var9, false, var21.field2200);
                        }
                    }
                }
                if (var13 == 1) {
                    class54 var23 = class43.field1151.method598(class46.field1222, var15, var16);
                    if (var23 != null) {
                        var23.field1359 = new class135(var23.field1361 >> 14 & 0x7FFF, 4, 0, var17, var18, var19, var20, var9, false, var23.field1359);
                    }
                }
                if (var13 == 2) {
                    if (var12 == 11) {
                        var12 = 10;
                    }
                    class41 var24 = class43.field1151.method601(class46.field1222, var15, var16);
                    if (var24 != null) {
                        var24.field1084 = new class135(var24.field1076 >> 14 & 0x7FFF, var12, var11, var17, var18, var19, var20, var9, false, var24.field1084);
                    }
                }
                if (var13 == 3) {
                    class101 var25 = class43.field1151.method618(class46.field1222, var15, var16);
                    if (var25 != null) {
                        var25.field2451 = new class135(var25.field2450 >> 14 & 0x7FFF, 22, var11, var17, var18, var19, var20, var9, false, var25.field2451);
                    }
                }
            }
        } else {
            if (arg0 != 44) {
                field3204 = null;
            }
            if (class100.field2421 == 25) {
                int var26 = class56.field1393.method850((byte) 25);
                int var27 = class56.field1393.method831(false);
                int var28 = (var27 >> 4 & 0x7) + class153.field3421;
                int var29 = (var27 & 0x7) + field3227;
                int var30 = class56.field1393.method808(-20054);
                if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                    class97 var31 = new class97();
                    var31.field2375 = var26;
                    var31.field2386 = var30;
                    if (class107.field2637[class46.field1222][var28][var29] == null) {
                        class107.field2637[class46.field1222][var28][var29] = new class66();
                    }
                    class107.field2637[class46.field1222][var28][var29].method508(var31, (byte) 123);
                    class129.method1011(arg0 + 28750, var28, var29);
                }
            } else {
                if (class100.field2421 == 144) {
                    int var32 = class56.field1393.method829((byte) -102);
                    int var33 = (var32 & 0x7) + field3227;
                    int var34 = (var32 >> 4 & 0x7) + class153.field3421;
                    int var35 = class56.field1393.method808(-20054);
                    int var36 = class56.field1393.method829((byte) -96);
                    int var37 = var36 >> 4 & 0xF;
                    int var38 = class56.field1393.method829((byte) -102);
                    int var39 = var36 & 0x7;
                    if (var34 >= 0 && var33 >= 0 && var34 < 104 && var33 < 104) {
                        int var40 = var37 + 1;
                        if (var34 - var40 <= class107.field2640.field841[0] && class107.field2640.field841[0] <= var34 + var40 && class107.field2640.field827[0] >= var33 - var40 && var33 + var40 >= class107.field2640.field827[0] && class74.field1784 != 0 && var39 > 0 && class34.field789 < 50) {
                            class133.field3042[class34.field789] = var35;
                            class19.field473[class34.field789] = var39;
                            class33.field773[class34.field789] = var38;
                            class9.field138[class34.field789] = null;
                            class116.field2739[class34.field789] = (var34 << 16) + (var33 << 8) + var37;
                            class34.field789++;
                        }
                    }
                }
                if (class100.field2421 == 164) {
                    int var41 = class56.field1393.method823((byte) 123);
                    int var42 = (var41 & 0x7) + field3227;
                    int var43 = (var41 >> 4 & 0x7) + class153.field3421;
                    int var44 = class56.field1393.method833((byte) 27);
                    int var45 = class56.field1393.method810(-1384376976);
                    int var46 = class56.field1393.method808(-20054);
                    if (var43 >= 0 && var42 >= 0 && var43 < 104 && var42 < 104 && class140.field3197 != var46) {
                        class97 var47 = new class97();
                        var47.field2375 = var44;
                        var47.field2386 = var45;
                        if (class107.field2637[class46.field1222][var43][var42] == null) {
                            class107.field2637[class46.field1222][var43][var42] = new class66();
                        }
                        class107.field2637[class46.field1222][var43][var42].method508(var47, (byte) 117);
                        class129.method1011(arg0 + 28750, var43, var42);
                    }
                } else if (class100.field2421 == 129) {
                    int var48 = class56.field1393.method829((byte) 85);
                    int var49 = (var48 & 0x7) + field3227;
                    int var50 = (var48 >> 4 & 0x7) + class153.field3421;
                    int var51 = class56.field1393.method808(arg0 ^ 0xFFFFB186);
                    int var52 = class56.field1393.method829((byte) 64);
                    int var53 = class56.field1393.method808(-20054);
                    if (var50 >= 0 && var49 >= 0 && var50 < 104 && var49 < 104) {
                        int var54 = var50 * 128 + 64;
                        int var55 = var49 * 128 + 64;
                        class100 var56 = new class100(var51, class46.field1222, var54, var55, class50.method381(class46.field1222, var55, var54, (byte) 10) - var52, var53, class82.field2065);
                        class109.field2647.method508(var56, (byte) 119);
                    }
                } else if (class100.field2421 == 141) {
                    int var57 = class56.field1393.method829((byte) -93);
                    int var58 = (var57 >> 4 & 0x7) + class153.field3421;
                    int var59 = field3227 + (var57 & 0x7);
                    int var60 = class56.field1393.method808(-20054);
                    int var61 = class56.field1393.method808(-20054);
                    int var62 = class56.field1393.method808(arg0 - 20098);
                    if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                        class66 var63 = class107.field2637[class46.field1222][var58][var59];
                        if (var63 != null) {
                            for (class97 var64 = (class97) var63.method496(10153); var64 != null; var64 = (class97) var63.method500(arg0 - 45)) {
                                if ((var60 & 0x7FFF) == var64.field2386 && var64.field2375 == var61) {
                                    var64.field2375 = var62;
                                    break;
                                }
                            }
                            class129.method1011(28794, var58, var59);
                        }
                    }
                } else if (class100.field2421 == 41) {
                    int var65 = class56.field1393.method823((byte) 20);
                    int var66 = (var65 >> 4 & 0x7) + class153.field3421;
                    int var67 = (var65 & 0x7) + field3227;
                    int var68 = class56.field1393.method808(-20054);
                    if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
                        class66 var69 = class107.field2637[class46.field1222][var66][var67];
                        if (var69 != null) {
                            for (class97 var70 = (class97) var69.method496(10153); var70 != null; var70 = (class97) var69.method500(-1)) {
                                if ((var68 & 0x7FFF) == var70.field2386) {
                                    var70.method1009((byte) 56);
                                    break;
                                }
                            }
                            if (var69.method496(10153) == null) {
                                class107.field2637[class46.field1222][var66][var67] = null;
                            }
                            class129.method1011(28794, var66, var67);
                        }
                    }
                } else if (class100.field2421 == 100) {
                    int var71 = class56.field1393.method829((byte) -83);
                    int var72 = (var71 >> 4 & 0x7) + class153.field3421;
                    int var73 = (var71 & 0x7) + field3227;
                    int var74 = class56.field1393.method843(true) + var72;
                    int var75 = var73 + class56.field1393.method843(true);
                    int var76 = class56.field1393.method821(2);
                    int var77 = class56.field1393.method808(-20054);
                    int var78 = class56.field1393.method829((byte) 111) * 4;
                    int var79 = class56.field1393.method829((byte) -103) * 4;
                    int var80 = class56.field1393.method808(-20054);
                    int var81 = class56.field1393.method808(-20054);
                    int var82 = class56.field1393.method829((byte) -102);
                    int var83 = class56.field1393.method829((byte) 47);
                    if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104 && var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104 && var77 != 65535) {
                        int var84 = var72 * 128 + 64;
                        int var85 = var74 * 128 + 64;
                        int var86 = var73 * 128 + 64;
                        int var87 = var75 * 128 + 64;
                        class82 var88 = new class82(var77, class46.field1222, var84, var86, class50.method381(class46.field1222, var86, var84, (byte) 10) - var78, class82.field2065 + var80, class82.field2065 + var81, var82, var83, var76, var79);
                        var88.method693(var87, class50.method381(class46.field1222, var87, var85, (byte) 10) - var79, class82.field2065 + var80, arg0 - 50, var85);
                        class25.field610.method508(var88, (byte) 126);
                    }
                } else if (class100.field2421 == 239) {
                    int var89 = class56.field1393.method849(1);
                    int var90 = var89 >> 2;
                    int var91 = class55.field1383[var90];
                    int var92 = class56.field1393.method829((byte) -80);
                    int var93 = (var92 & 0x7) + field3227;
                    int var94 = class153.field3421 + (var92 >> 4 & 0x7);
                    int var95 = var89 & 0x3;
                    if (var94 >= 0 && var93 >= 0 && var94 < 104 && var93 < 104) {
                        class66.method498(class46.field1222, -1, var93, -1, var94, 0, var95, var91, var90, -3);
                    }
                } else if (class100.field2421 == 245) {
                    int var96 = class56.field1393.method833((byte) 27);
                    byte var97 = class56.field1393.method832((byte) -67);
                    byte var98 = class56.field1393.method816((byte) 32);
                    byte var99 = class56.field1393.method832((byte) -90);
                    int var100 = class56.field1393.method850((byte) 5);
                    int var101 = class56.field1393.method831(false);
                    int var102 = var101 >> 2;
                    int var103 = var101 & 0x3;
                    int var104 = class55.field1383[var102];
                    int var105 = class56.field1393.method849(1);
                    int var106 = (var105 >> 4 & 0x7) + class153.field3421;
                    int var107 = (var105 & 0x7) + field3227;
                    int var108 = class56.field1393.method808(-20054);
                    int var109 = class56.field1393.method808(arg0 - 20098);
                    byte var110 = class56.field1393.method816((byte) 32);
                    class1 var111;
                    if (class140.field3197 == var109) {
                        var111 = class107.field2640;
                    } else {
                        var111 = class81.field2016[var109];
                    }
                    if (var111 != null) {
                        class148 var112 = class31.method238(-29628, var96);
                        int var113 = class113.field2711[class46.field1222][var106 + 1][var107 + 1];
                        int var114 = class113.field2711[class46.field1222][var106][var107];
                        int var115 = class113.field2711[class46.field1222][var106 + 1][var107];
                        int var116 = class113.field2711[class46.field1222][var106][var107 + 1];
                        class70 var117 = var112.method1123(var113, (byte) -88, var102, var116, var114, var115, var103);
                        if (var117 != null) {
                            if (var97 < var99) {
                                byte var118 = var99;
                                var99 = var97;
                                var97 = var118;
                            }
                            class66.method498(class46.field1222, var108 + 1, var107, -1, var106, var100 + 1, 0, var104, 0, -3);
                            var111.field26 = var117;
                            var111.field23 = class82.field2065 + var108;
                            int var119 = var112.field3330;
                            if (var98 < var110) {
                                byte var120 = var110;
                                var110 = var98;
                                var98 = var120;
                            }
                            var111.field25 = class82.field2065 + var100;
                            int var121 = var112.field3306;
                            if (var103 == 1 || var103 == 3) {
                                var121 = var112.field3330;
                                var119 = var112.field3306;
                            }
                            var111.field10 = var107 * 128 + var121 * 64;
                            var111.field32 = var106 * 128 + var119 * 64;
                            var111.field8 = class50.method381(class46.field1222, var111.field10, var111.field32, (byte) 10);
                            var111.field20 = var99 + var106;
                            var111.field5 = var107 + var110;
                            var111.field19 = var106 + var97;
                            var111.field29 = var98 + var107;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method1097(int arg0) {
        field3211 = null;
        field3223 = null;
        field3204 = null;
        field3210 = null;
        field3205 = null;
        field3229 = null;
        field3220 = null;
        field3213 = null;
        field3216 = null;
        field3218 = null;
        field3219 = null;
        field3215 = null;
        if (arg0 != 0) {
            return;
        }
        field3209 = null;
        field3208 = null;
        field3221 = null;
        field3217 = null;
        field3226 = null;
        field3212 = null;
        field3214 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
    public static final int method1098(int arg0, int arg1) {
        field3207++;
        int var2 = arg0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 = arg0 + 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return var2 + arg1;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILae;BII)V")
    public static final void method1099(int arg0, int arg1, class6 arg2, byte arg3, int arg4, int arg5) {
        field3225++;
        if (arg3 > -29) {
            return;
        }
        int var6 = arg1 * arg1 + arg4 * arg4;
        if (var6 <= 4225 || var6 >= 90000) {
            class64.method493(arg5, arg0, arg2, (byte) 51, arg4, arg1);
            return;
        }
        int var7 = class157.field3590 + class151.field3394 & 0x7FF;
        int var8 = class127.field2900[var7];
        int var9 = var8 * 256 / (class145.field3271 + 256);
        int var10 = class127.field2899[var7];
        int var11 = var10 * 256 / (class145.field3271 + 256);
        int var12 = arg1 * var9 + arg4 * var11 >> 16;
        int var13 = arg1 * var11 - arg4 * var9 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        class135.field3065.method43(arg0 + var16 + 94 + 4 - 10, arg5 + 83 - (var17 + 20), 20, 20, 15, 15, var14, 256);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)Z")
    public static final boolean method1100(int arg0) {
        field3206++;
        if (class4.field73 == null) {
            return false;
        }
        try {
            int var1 = class4.field73.method735(arg0 ^ arg0);
            if (var1 == 0) {
                return false;
            }
            if (class100.field2421 == -1) {
                class4.field73.method734(class56.field1393.field2498, 1, arg0 ^ 0xFFFFFFE8, 0);
                var1--;
                class56.field1393.field2501 = 0;
                class100.field2421 = class56.field1393.method1209(122);
                class94.field2310 = class41.field1110[class100.field2421];
            }
            if (class94.field2310 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                class4.field73.method734(class56.field1393.field2498, 1, -70, 0);
                var1--;
                class94.field2310 = class56.field1393.field2498[0] & 0xFF;
            }
            if (class94.field2310 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                var1 -= 2;
                class4.field73.method734(class56.field1393.field2498, 2, -75, 0);
                class56.field1393.field2501 = 0;
                class94.field2310 = class56.field1393.method808(-20054);
            }
            if (var1 < class94.field2310) {
                return false;
            }
            class56.field1393.field2501 = 0;
            class4.field73.method734(class56.field1393.field2498, class94.field2310, -26, 0);
            class42.field1119 = 0;
            class80.field1978 = class2.field51;
            class2.field51 = class35.field874;
            class35.field874 = class100.field2421;
            if (class100.field2421 == 233) {
                int var2 = class56.field1393.method808(-20054);
                class11.field187 = var2;
                class35.method270(var2, (byte) 116);
                class8.method51(class11.field187, (byte) 2);
                for (int var3 = 0; var3 < 100; var3++) {
                    class14.field257[var3] = true;
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 135) {
                class60 var4 = class56.field1393.method841(27330);
                if (var4.method448(class44.field1160, 100)) {
                    class60 var21 = var4.method427(var4.method446(class116.field2735, 0), arg0 - 117, 0);
                    long var22 = var21.method430(126);
                    boolean var24 = false;
                    for (int var25 = 0; var25 < class133.field3044; var25++) {
                        if (class44.field1169[var25] == var22) {
                            var24 = true;
                            break;
                        }
                    }
                    if (!var24 && class112.field2696 == 0) {
                        class43.method342(var21, 4, class98.field2403, 2001);
                    }
                } else if (var4.method448(class22.field521, 119)) {
                    class60 var5 = var4.method427(var4.method446(class116.field2735, 0), -88, 0);
                    long var6 = var5.method430(85);
                    boolean var8 = false;
                    for (int var9 = 0; var9 < class133.field3044; var9++) {
                        if (class44.field1169[var9] == var6) {
                            var8 = true;
                            break;
                        }
                    }
                    if (!var8 && class112.field2696 == 0) {
                        class43.method342(var5, 8, class136.field3077, 2001);
                    }
                } else if (var4.method448(class80.field1991, 93)) {
                    class60 var10 = var4.method427(var4.method446(class116.field2735, 0), arg0 ^ 0xFFFFFFB8, 0);
                    boolean var11 = false;
                    long var12 = var10.method430(80);
                    for (int var14 = 0; var14 < class133.field3044; var14++) {
                        if (class44.field1169[var14] == var12) {
                            var11 = true;
                            break;
                        }
                    }
                    if (!var11 && class112.field2696 == 0) {
                        class60 var15 = var4.method427(var4.method447((byte) 39) - 9, -49, var4.method446(class116.field2735, 0) + 1);
                        class43.method342(var10, 8, var15, 2001);
                    }
                } else if (var4.method448(class82.field2062, 112)) {
                    class60 var16 = var4.method427(var4.method446(class116.field2735, arg0), arg0 - 107, 0);
                    long var17 = var16.method430(70);
                    boolean var19 = false;
                    for (int var20 = 0; var20 < class133.field3044; var20++) {
                        if (class44.field1169[var20] == var17) {
                            var19 = true;
                            break;
                        }
                    }
                    if (!var19 && class112.field2696 == 0) {
                        class43.method342(var16, 10, class94.field2314, 2001);
                    }
                } else {
                    class43.method342(class94.field2314, 0, var4, 2001);
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 149) {
                int var26 = class56.field1393.method799(-612365912);
                int var27 = class56.field1393.method850((byte) 124);
                class40 var28 = class132.method1041(true, var26);
                if (var28.field981 != 1 || var28.field963 != var27) {
                    var28.field981 = 1;
                    var28.field963 = var27;
                    class12.method79(-30833, var28);
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 31) {
                for (int var29 = 0; var29 < class13.field243; var29++) {
                    class8 var30 = class116.method921(var29, (byte) -74);
                    if (var30 != null && var30.field129 == 0) {
                        class97.field2382[var29] = 0;
                        class43.field1158[var29] = 0;
                    }
                }
                class139.method1082(arg0 + 13);
                class7.field103 += 32;
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 219) {
                class137.field3102 = class82.field2065;
                long var31 = class56.field1393.method846(-4297);
                if (var31 == 0L) {
                    class100.field2421 = -1;
                    class101.field2470 = null;
                    class103.field2514 = null;
                    class33.field764 = 0;
                    return true;
                }
                class103.field2514 = class89.method726((byte) -99, var31);
                class151.field3395 = class56.field1393.method843(true);
                int var33 = class56.field1393.method829((byte) 98);
                if (var33 == 255) {
                    class100.field2421 = -1;
                    return true;
                }
                class33.field764 = var33;
                class75[] var34 = new class75[100];
                for (int var35 = 0; var35 < class33.field764; var35++) {
                    var34[var35] = new class75();
                    var34[var35].field2929 = class56.field1393.method846(arg0 - 4297);
                    var34[var35].field1795 = class89.method726((byte) -114, var34[var35].field2929);
                    var34[var35].field1804 = class56.field1393.method808(arg0 ^ 0xFFFFB1AA);
                    var34[var35].field1805 = class56.field1393.method843(true);
                    if (class128.field2925 == var34[var35].field2929) {
                        class55.field1379 = var34[var35].field1805;
                    }
                }
                boolean var36 = false;
                int var37 = class33.field764;
                while (var37 > 0) {
                    boolean var38 = true;
                    var37--;
                    for (int var39 = 0; var39 < var37; var39++) {
                        if (var34[var39].field1795.method432(var34[var39 + 1].field1795, false) > 0) {
                            var38 = false;
                            class75 var40 = var34[var39];
                            var34[var39] = var34[var39 + 1];
                            var34[var39 + 1] = var40;
                        }
                    }
                    if (var38) {
                        break;
                    }
                }
                class101.field2470 = var34;
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 13) {
                class109.field2661 = true;
                class139.field3152 = class56.field1393.method829((byte) 80);
                class14.field305 = class56.field1393.method829((byte) -119);
                class73.field1753 = class56.field1393.method808(arg0 ^ 0xFFFFB1AA);
                class14.field256 = class56.field1393.method829((byte) 18);
                class64.field1599 = class56.field1393.method829((byte) 59);
                if (class64.field1599 >= 100) {
                    class128.field2931 = class14.field305 * 128 + 64;
                    class140.field3198 = class139.field3152 * 128 + 64;
                    class101.field2461 = class50.method381(class46.field1222, class128.field2931, class140.field3198, (byte) 10) - class73.field1753;
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 220) {
                long var41 = class56.field1393.method846(arg0 ^ 0xFFFFEF37);
                class56.field1393.method843(true);
                long var43 = class56.field1393.method846(-4297);
                long var45 = (long) class56.field1393.method808(-20054);
                long var47 = (long) class56.field1393.method805(arg0 + 3);
                int var49 = class56.field1393.method829((byte) -110);
                boolean var50 = false;
                long var51 = (var45 << 32) + var47;
                for (int var53 = 0; var53 < 100; var53++) {
                    if (class48.field1264[var53] == var51) {
                        var50 = true;
                        break;
                    }
                }
                if (var49 <= 1) {
                    for (int var54 = 0; var54 < class133.field3044; var54++) {
                        if (class44.field1169[var54] == var41) {
                            var50 = true;
                            break;
                        }
                    }
                }
                if (!var50 && class112.field2696 == 0) {
                    class48.field1264[class25.field618] = var51;
                    class25.field618 = (class25.field618 + 1) % 100;
                    class60 var55 = class122.method962(class77.method626(class56.field1393, (byte) 125).method444(true));
                    if (var49 == 2 || var49 == 3) {
                        class2.method6((byte) 96, class89.method726((byte) -104, var43), var55, class104.method853(-118, new class60[] { class4.field75, class89.method726((byte) -124, var41).method434((byte) 82) }), 9);
                    } else if (var49 == 1) {
                        class2.method6((byte) 115, class89.method726((byte) -97, var43), var55, class104.method853(-94, new class60[] { class133.field3038, class89.method726((byte) -100, var41).method434((byte) 48) }), 9);
                    } else {
                        class2.method6((byte) 84, class89.method726((byte) -102, var43), var55, class89.method726((byte) -104, var41).method434((byte) 71), 9);
                    }
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 101) {
                field3227 = class56.field1393.method831(false);
                class153.field3421 = class56.field1393.method823((byte) 127);
                for (int var56 = class153.field3421; var56 < class153.field3421 + 8; var56++) {
                    for (int var57 = field3227; var57 < field3227 + 8; var57++) {
                        if (class107.field2637[class46.field1222][var56][var57] != null) {
                            class107.field2637[class46.field1222][var56][var57] = null;
                            class129.method1011(28794, var56, var57);
                        }
                    }
                }
                for (class12 var58 = (class12) class53.field1340.method496(10153); var58 != null; var58 = (class12) class53.field1340.method500(-1)) {
                    if (class153.field3421 <= var58.field201 && class153.field3421 + 8 > var58.field201 && field3227 <= var58.field225 && field3227 + 8 > var58.field225 && class46.field1222 == var58.field223) {
                        var58.field220 = 0;
                    }
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 195) {
                class107.method886((byte) -90);
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 197) {
                class139.method1082(arg0 ^ 0xD);
                class131.field2982 = class56.field1393.method829((byte) 38);
                class78.field1922 = class78.field1921;
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 39) {
                int var59 = class56.field1393.method812(42);
                int var60 = class56.field1393.method840(true);
                class40 var61 = class132.method1041(true, var60);
                if (var61.field939 != var59 || var59 == -1) {
                    var61.field939 = var59;
                    var61.field1067 = 0;
                    var61.field1013 = 0;
                    class12.method79(arg0 ^ 0xFFFF878F, var61);
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 177) {
                class106.field2625 = class56.field1393.method829((byte) 108);
                if (class106.field2625 == 1) {
                    class75.field1799 = class56.field1393.method808(-20054);
                }
                if (class106.field2625 >= 2 && class106.field2625 <= 6) {
                    if (class106.field2625 == 2) {
                        class100.field2422 = 64;
                        class153.field3448 = 64;
                    }
                    if (class106.field2625 == 3) {
                        class100.field2422 = 64;
                        class153.field3448 = 0;
                    }
                    if (class106.field2625 == 4) {
                        class100.field2422 = 64;
                        class153.field3448 = 128;
                    }
                    if (class106.field2625 == 5) {
                        class153.field3448 = 64;
                        class100.field2422 = 0;
                    }
                    if (class106.field2625 == 6) {
                        class100.field2422 = 128;
                        class153.field3448 = 64;
                    }
                    class106.field2625 = 2;
                    class12.field229 = class56.field1393.method808(-20054);
                    class151.field3396 = class56.field1393.method808(-20054);
                    class8.field116 = class56.field1393.method829((byte) 24);
                }
                if (class106.field2625 == 10) {
                    class145.field3263 = class56.field1393.method808(-20054);
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 158) {
                int var62 = class56.field1393.method833((byte) 27);
                int var63 = class56.field1393.method803(false);
                if (var62 == 65535) {
                    var62 = -1;
                }
                int var64 = class56.field1393.method833((byte) 27);
                if (var64 == 65535) {
                    var64 = -1;
                }
                int var65 = class56.field1393.method803(false);
                for (int var66 = var62; var66 <= var64; var66++) {
                    long var67 = ((long) var63 << 32) + (long) var66;
                    class128 var69 = class101.field2457.method716((byte) 98, var67);
                    if (var69 != null) {
                        var69.method1009((byte) 116);
                    }
                    class101.field2457.method712(var67, new class62(var65), (byte) 103);
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 43) {
                field3227 = class56.field1393.method831(false);
                class153.field3421 = class56.field1393.method831(false);
                while (class56.field1393.field2501 < class94.field2310) {
                    class100.field2421 = class56.field1393.method829((byte) -82);
                    method1096((byte) 44);
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 254) {
                for (int var70 = 0; var70 < class43.field1158.length; var70++) {
                    if (class97.field2382[var70] != class43.field1158[var70]) {
                        class43.field1158[var70] = class97.field2382[var70];
                        class72.method551((byte) 116, var70);
                        class17.field414[class80.method680(class7.field103++, 31)] = var70;
                    }
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 11) {
                class19.field461 = class56.field1393.method829((byte) -79);
                class100.field2421 = -1;
                class42.field1112 = class78.field1921;
                return true;
            }
            if (class100.field2421 == 60) {
                int var71 = class56.field1393.method829((byte) 74);
                class60 var72 = class56.field1393.method841(27330);
                int var73 = class56.field1393.method849(1);
                if (var71 >= 1 && var71 <= 8) {
                    if (var72.method426(class41.field1107, (byte) 37)) {
                        var72 = null;
                    }
                    class73.field1763[var71 - 1] = var72;
                    class44.field1164[var71 - 1] = var73 == 0;
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 186) {
                int var74 = class56.field1393.method809(255);
                int var75 = class56.field1393.method833((byte) 27);
                int var76 = var75 >> 10 & 0x1F;
                int var77 = var75 >> 5 & 0x1F;
                int var78 = var75 & 0x1F;
                class40 var79 = class132.method1041(true, var74);
                int var80 = (var78 << 3) + (var76 << 19) + (var77 << 11);
                if (var79.field972 != var80) {
                    var79.field972 = var80;
                    class12.method79(arg0 ^ 0xFFFF878F, var79);
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 30) {
                int var81 = class56.field1393.method809(255);
                class60 var82 = class56.field1393.method841(27330);
                class40 var83 = class132.method1041(true, var81);
                if (!var82.method451(var83.field998, arg0 ^ 0x2BC7)) {
                    var83.field998 = var82;
                    class12.method79(-30833, var83);
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 33) {
                int var84 = class56.field1393.method847((byte) 105);
                int var85 = class56.field1393.method812(arg0 + 30);
                int var86 = class56.field1393.method803(false);
                class40 var87 = class132.method1041(true, var86);
                int var88 = var87.field1054 + var84;
                int var89 = var87.field1021 + var85;
                if (var87.field1033 != var89 || var87.field1073 != var88) {
                    var87.field1033 = var89;
                    var87.field1073 = var88;
                    class12.method79(-30833, var87);
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 70) {
                class42.method336(false, false);
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 147) {
                int var90 = class56.field1393.method810(-1384376976);
                int var91 = class56.field1393.method840(true);
                class40 var92 = class132.method1041(true, var91);
                if (var92 != null && var92.field938 == 0) {
                    if (var92.field1071 - var92.field1014 < var90) {
                        var90 = var92.field1071 - var92.field1014;
                    }
                    if (var90 < 0) {
                        var90 = 0;
                    }
                    if (var92.field1031 != var90) {
                        var92.field1031 = var90;
                        class12.method79(-30833, var92);
                    }
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 29) {
                if (class11.field187 != -1) {
                    class16.method129(-29873, class11.field187, 0);
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 16) {
                int var93 = class56.field1393.method803(false);
                class81 var94 = (class81) class39.field929.method716((byte) 112, (long) var93);
                if (var94 != null) {
                    class109.method894(false, var94, true);
                }
                if (class124.field2864 != null) {
                    class12.method79(-30833, class124.field2864);
                    class124.field2864 = null;
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 119) {
                int var95 = class56.field1393.method810(-1384376976);
                int var96 = class56.field1393.method803(false);
                class97.field2382[var95] = var96;
                if (class43.field1158[var95] != var96) {
                    class43.field1158[var95] = var96;
                    class72.method551((byte) 111, var95);
                }
                class17.field414[class80.method680(31, class7.field103++)] = var95;
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 170) {
                int var97 = class56.field1393.method809(255);
                class40 var98 = class132.method1041(true, var97);
                for (int var99 = 0; var99 < var98.field1053.length; var99++) {
                    var98.field1053[var99] = -1;
                    var98.field1053[var99] = 0;
                }
                class12.method79(-30833, var98);
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 126) {
                class42.method336(false, true);
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 151) {
                int var100 = class56.field1393.method808(-20054);
                byte var101 = class56.field1393.method814((byte) -100);
                class97.field2382[var100] = var101;
                if (class43.field1158[var100] != var101) {
                    class43.field1158[var100] = var101;
                    class72.method551((byte) 112, var100);
                }
                class17.field414[class80.method680(31, class7.field103++)] = var100;
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 242) {
                long var102 = class56.field1393.method846(-4297);
                int var104 = class56.field1393.method808(-20054);
                byte var105 = class56.field1393.method843(true);
                boolean var106 = false;
                if ((Long.MIN_VALUE & var102) != 0L) {
                    var106 = true;
                }
                if (var106) {
                    if (class33.field764 == 0) {
                        class100.field2421 = -1;
                        return true;
                    }
                    long var107 = var102 & Long.MAX_VALUE;
                    boolean var109 = false;
                    int var110;
                    for (var110 = 0; class33.field764 > var110 && (class101.field2470[var110].field2929 != var107 || class101.field2470[var110].field1804 != var104); var110++) {
                    }
                    if (var110 < class33.field764) {
                        while (class33.field764 - 1 > var110) {
                            class101.field2470[var110] = class101.field2470[var110 + 1];
                            var110++;
                        }
                        class101.field2470[class33.field764] = null;
                        class33.field764--;
                    }
                } else {
                    class75 var111 = new class75();
                    var111.field2929 = var102;
                    var111.field1795 = class89.method726((byte) -116, var111.field2929);
                    var111.field1805 = var105;
                    var111.field1804 = var104;
                    int var112;
                    for (var112 = class33.field764 - 1; var112 >= 0; var112--) {
                        int var113 = class101.field2470[var112].field1795.method432(var111.field1795, false);
                        if (var113 == 0) {
                            class101.field2470[var112].field1804 = var104;
                            class101.field2470[var112].field1805 = var105;
                            if (class128.field2925 == var102) {
                                class55.field1379 = var105;
                            }
                            class137.field3102 = class82.field2065;
                            class100.field2421 = -1;
                            return true;
                        }
                        if (var113 < 0) {
                            break;
                        }
                    }
                    if (class33.field764 >= class101.field2470.length) {
                        class100.field2421 = -1;
                        return true;
                    }
                    for (int var114 = class33.field764 - 1; var114 > var112; var114--) {
                        class101.field2470[var114 + 1] = class101.field2470[var114];
                    }
                    if (class33.field764 == 0) {
                        class101.field2470 = new class75[100];
                    }
                    class101.field2470[var112 + 1] = var111;
                    if (class128.field2925 == var102) {
                        class55.field1379 = var105;
                    }
                    class33.field764++;
                }
                class100.field2421 = -1;
                class137.field3102 = class82.field2065;
                return true;
            }
            if (class100.field2421 == 169) {
                int var115 = class56.field1393.method799(-612365912);
                class40 var116 = class132.method1041(true, var115);
                var116.field981 = 3;
                var116.field963 = class107.field2640.field2.method138(16448869);
                class12.method79(-30833, var116);
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 53) {
                long var117 = class56.field1393.method846(-4297);
                int var119 = class56.field1393.method808(-20054);
                int var120 = class56.field1393.method829((byte) 98);
                class60 var121 = class89.method726((byte) -105, var117).method434((byte) 114);
                for (int var122 = 0; var122 < class103.field2502; var122++) {
                    if (class136.field3082[var122] == var117) {
                        if (class89.field2210[var122] != var119) {
                            class89.field2210[var122] = var119;
                            if (var119 > 0) {
                                class43.method342(class94.field2314, 5, class104.method853(-111, new class60[] { var121, class100.field2426 }), arg0 + 2001);
                            }
                            if (var119 == 0) {
                                class43.method342(class94.field2314, 5, class104.method853(-114, new class60[] { var121, class7.field105 }), 2001);
                            }
                        }
                        class17.field427[var122] = var120;
                        var121 = null;
                        break;
                    }
                }
                if (var121 != null && class103.field2502 < 200) {
                    class136.field3082[class103.field2502] = var117;
                    class67.field1639[class103.field2502] = var121;
                    class89.field2210[class103.field2502] = var119;
                    class17.field427[class103.field2502] = var120;
                    class103.field2502++;
                }
                class42.field1112 = class78.field1921;
                int var123 = class103.field2502;
                boolean var124 = false;
                while (var123 > 0) {
                    var123--;
                    boolean var125 = true;
                    for (int var126 = 0; var126 < var123; var126++) {
                        if (class89.field2210[var126] != class17.field434 && class89.field2210[var126 + 1] == class17.field434 || class89.field2210[var126] == 0 && class89.field2210[var126 + 1] != 0) {
                            var125 = false;
                            int var127 = class89.field2210[var126];
                            class89.field2210[var126] = class89.field2210[var126 + 1];
                            class89.field2210[var126 + 1] = var127;
                            class60 var128 = class67.field1639[var126];
                            class67.field1639[var126] = class67.field1639[var126 + 1];
                            class67.field1639[var126 + 1] = var128;
                            long var129 = class136.field3082[var126];
                            class136.field3082[var126] = class136.field3082[var126 + 1];
                            class136.field3082[var126 + 1] = var129;
                            int var131 = class17.field427[var126];
                            class17.field427[var126] = class17.field427[var126 + 1];
                            class17.field427[var126 + 1] = var131;
                        }
                    }
                    if (var125) {
                        break;
                    }
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 155) {
                int var132 = class56.field1393.method799(arg0 - 612365912);
                int var133 = class56.field1393.method808(arg0 - 20054);
                int var134 = class56.field1393.method833((byte) 27);
                class40 var135 = class132.method1041(true, var132);
                var135.field985 = (var134 << 16) + var133;
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 36) {
                class139.method1082(13);
                int var136 = class56.field1393.method840(true);
                int var137 = class56.field1393.method823((byte) 120);
                int var138 = class56.field1393.method831(false);
                class32.field751[var137] = var136;
                class85.field2080[var137] = var138;
                class40.field1043[var137] = 1;
                for (int var139 = 0; var139 < 98; var139++) {
                    if (class132.field2997[var139] <= var136) {
                        class40.field1043[var137] = var139 + 2;
                    }
                }
                class22.field523[class80.method680(31, class106.field2627++)] = var137;
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 209) {
                int var140 = class56.field1393.method799(-612365912);
                class38.field920 = class116.field2731.method202((byte) -104, var140);
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 225) {
                class139.method1082(13);
                class66.field1610 = class56.field1393.method821(2);
                class78.field1922 = class78.field1921;
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 86) {
                boolean var141 = class56.field1393.method823((byte) 119) == 1;
                int var142 = class56.field1393.method799(-612365912);
                class40 var143 = class132.method1041(true, var142);
                if (var143.field1064 != var141) {
                    var143.field1064 = var141;
                    class12.method79(arg0 ^ 0xFFFF878F, var143);
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 104) {
                class46.field1200 = class56.field1393.method829((byte) -84);
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 120) {
                class153.field3421 = class56.field1393.method823((byte) 19);
                field3227 = class56.field1393.method829((byte) -74);
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 58) {
                int var144 = class56.field1393.method808(-20054);
                int var145 = class56.field1393.method810(-1384376976);
                int var146 = class56.field1393.method840(true);
                int var147 = class56.field1393.method833((byte) 27);
                class40 var148 = class132.method1041(true, var146);
                if (var148.field952 != var145 || var148.field980 != var147 || var148.field1065 != var144) {
                    var148.field952 = var145;
                    var148.field980 = var147;
                    var148.field1065 = var144;
                    class12.method79(-30833, var148);
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 210) {
                class44.field1161 = class56.field1393.method850((byte) 121) * 30;
                class78.field1922 = class78.field1921;
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 95) {
                int var149 = class56.field1393.method850((byte) 123);
                class155.method1188(22265, var149);
                class157.field3600[class80.method680(class154.field3459++, 31)] = class80.method680(var149, 32767);
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 110) {
                for (int var150 = 0; var150 < class81.field2016.length; var150++) {
                    if (class81.field2016[var150] != null) {
                        class81.field2016[var150].field806 = -1;
                    }
                }
                for (int var151 = 0; var151 < class5.field83.length; var151++) {
                    if (class5.field83[var151] != null) {
                        class5.field83[var151].field806 = -1;
                    }
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 50) {
                int var152 = class56.field1393.method829((byte) 59);
                int var153 = class56.field1393.method829((byte) 99);
                int var154 = class56.field1393.method829((byte) 47);
                int var155 = class56.field1393.method829((byte) 51);
                class121.field2788[var152] = true;
                class4.field72[var152] = var153;
                class136.field3091[var152] = var154;
                class153.field3440[var152] = var155;
                class129.field2940[var152] = 0;
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 115) {
                int var156 = class56.field1393.method808(-20054);
                int var157 = class56.field1393.method829((byte) 34);
                int var158 = class56.field1393.method808(-20054);
                class94.method745(50, var157, var156, var158);
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 132) {
                int var159 = class56.field1393.method810(-1384376976);
                if (var159 == 65535) {
                    var159 = -1;
                }
                class80.method681((byte) 73, var159);
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 224) {
                int var160 = class56.field1393.method805(3);
                int var161 = class56.field1393.method850((byte) 30);
                if (var161 == 65535) {
                    var161 = -1;
                }
                class18.method152(var161, var160, -1);
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 23) {
                class55.method400(class94.field2310, class116.field2731, (byte) -117, class56.field1393);
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 55) {
                int var162 = class94.field2310 + class56.field1393.field2501;
                int var163 = class56.field1393.method808(arg0 ^ 0xFFFFB1AA);
                if (class11.field187 != var163) {
                    class11.field187 = var163;
                    class35.method270(class11.field187, (byte) 116);
                    class8.method51(class11.field187, (byte) 2);
                    for (int var164 = 0; var164 < 100; var164++) {
                        class14.field257[var164] = true;
                    }
                }
                while (class56.field1393.field2501 < var162) {
                    int var165 = class56.field1393.method803(false);
                    int var166 = class56.field1393.method808(-20054);
                    int var167 = class56.field1393.method829((byte) 57);
                    class81 var168 = (class81) class39.field929.method716((byte) 18, (long) var165);
                    if (var168 != null && var168.field2012 != var166) {
                        class109.method894(false, var168, true);
                        var168 = null;
                    }
                    if (var168 == null) {
                        var168 = class146.method1116(var167, (byte) 26, var165, var166);
                    }
                    var168.field2013 = true;
                }
                for (class81 var169 = (class81) class39.field929.method713(arg0 + 12421); var169 != null; var169 = (class81) class39.field929.method711(arg0 ^ 0x6D)) {
                    if (var169.field2013) {
                        var169.field2013 = false;
                    } else {
                        class109.method894(false, var169, true);
                    }
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 144 || class100.field2421 == 141 || class100.field2421 == 245 || class100.field2421 == 164 || class100.field2421 == 129 || class100.field2421 == 100 || class100.field2421 == 41 || class100.field2421 == 25 || class100.field2421 == 76 || class100.field2421 == 239 || class100.field2421 == 15) {
                method1096((byte) 44);
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 200) {
                int var170 = class56.field1393.method803(false);
                int var171 = class56.field1393.method808(-20054);
                class40 var172;
                if (var170 >= 0) {
                    var172 = class132.method1041(true, var170);
                } else {
                    var172 = null;
                }
                if (var172 != null) {
                    for (int var173 = 0; var173 < var172.field1053.length; var173++) {
                        var172.field1053[var173] = 0;
                        var172.field993[var173] = 0;
                    }
                }
                if (var170 < -70000) {
                    var171 += 32768;
                }
                class145.method1113((byte) -101, var171);
                int var174 = class56.field1393.method808(arg0 - 20054);
                for (int var175 = 0; var175 < var174; var175++) {
                    int var176 = class56.field1393.method850((byte) 16);
                    int var177 = class56.field1393.method831(false);
                    if (var177 == 255) {
                        var177 = class56.field1393.method803(false);
                    }
                    if (var172 != null && var172.field1053.length > var175) {
                        var172.field1053[var175] = var176;
                        var172.field993[var175] = var177;
                    }
                    class132.method1043(var175, var171, var176 - 1, -438, var177);
                }
                if (var172 != null) {
                    class12.method79(arg0 ^ 0xFFFF878F, var172);
                }
                class139.method1082(13);
                class157.field3600[class80.method680(class154.field3459++, 31)] = class80.method680(32767, var171);
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 218) {
                class60 var178 = class56.field1393.method841(27330);
                Object[] var179 = new Object[var178.method447((byte) 39) + 1];
                for (int var180 = var178.method447((byte) 39) - 1; var180 >= 0; var180--) {
                    if (var178.method418(var180, (byte) -101) == 115) {
                        var179[var180 + 1] = class56.field1393.method841(27330);
                    } else {
                        var179[var180 + 1] = Integer.valueOf(class56.field1393.method803(false));
                    }
                }
                var179[0] = Integer.valueOf(class56.field1393.method803(false));
                class15 var181 = new class15();
                var181.field353 = var179;
                class61.method467(false, var181);
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 40) {
                class154.method1170((byte) -55);
                class100.field2421 = -1;
                return false;
            }
            if (class100.field2421 == 173) {
                class109.field2661 = true;
                class148.field3368 = class56.field1393.method829((byte) 79);
                class53.field1347 = class56.field1393.method829((byte) -79);
                class109.field2659 = class56.field1393.method808(arg0 - 20054);
                class155.field3549 = class56.field1393.method829((byte) 103);
                class59.field1427 = class56.field1393.method829((byte) -110);
                if (class59.field1427 >= 100) {
                    int var182 = class148.field3368 * 128 + 64;
                    int var183 = class53.field1347 * 128 + 64;
                    int var184 = class50.method381(class46.field1222, var183, var182, (byte) 10) - class109.field2659;
                    int var185 = var182 - class140.field3198;
                    int var186 = var184 - class101.field2461;
                    int var187 = var183 - class128.field2931;
                    int var188 = (int) Math.sqrt((double) (var185 * var185 + var187 * var187));
                    class63.field1567 = (int) (Math.atan2((double) var186, (double) var188) * 325.949D) & 0x7FF;
                    class74.field1787 = (int) (-325.949D * Math.atan2((double) var185, (double) var187)) & 0x7FF;
                    if (class63.field1567 < 128) {
                        class63.field1567 = 128;
                    }
                    if (class63.field1567 > 383) {
                        class63.field1567 = 383;
                    }
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 240) {
                int var189 = class56.field1393.method803(false);
                int var190 = class56.field1393.method810(-1384376976);
                class40 var191 = class132.method1041(true, var189);
                if (var191.field981 != 2 || var191.field963 != var190) {
                    var191.field963 = var190;
                    var191.field981 = 2;
                    class12.method79(-30833, var191);
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 134) {
                class109.field2661 = false;
                for (int var192 = 0; var192 < 5; var192++) {
                    class121.field2788[var192] = false;
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 73) {
                class157.method1207(-13202);
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 133) {
                long var193 = class56.field1393.method846(-4297);
                class60 var195 = class122.method962(class77.method626(class56.field1393, (byte) 116).method444(true));
                class43.method342(class89.method726((byte) -108, var193).method434((byte) 96), 6, var195, arg0 ^ 0x7D1);
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 121) {
                class133.field3044 = class94.field2310 / 8;
                for (int var196 = 0; var196 < class133.field3044; var196++) {
                    class44.field1169[var196] = class56.field1393.method846(-4297);
                }
                class42.field1112 = class78.field1921;
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 27) {
                class100.field2421 = -1;
                class48.field1267 = 0;
                return true;
            }
            if (class100.field2421 == 102) {
                class11.field195 = class56.field1393.method829((byte) 75);
                class56.field1397 = class56.field1393.method829((byte) 93);
                class7.field110 = class56.field1393.method829((byte) 18);
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 9) {
                int var197 = class56.field1393.method803(false);
                int var198 = class56.field1393.method808(-20054);
                if (var197 < -70000) {
                    var198 += 32768;
                }
                class40 var199;
                if (var197 >= 0) {
                    var199 = class132.method1041(true, var197);
                } else {
                    var199 = null;
                }
                while (class94.field2310 > class56.field1393.field2501) {
                    int var200 = class56.field1393.method835(-24298);
                    int var201 = class56.field1393.method808(-20054);
                    int var202 = 0;
                    if (var201 != 0) {
                        var202 = class56.field1393.method829((byte) 25);
                        if (var202 == 255) {
                            var202 = class56.field1393.method803(false);
                        }
                    }
                    if (var199 != null && var200 >= 0 && var200 < var199.field1053.length) {
                        var199.field1053[var200] = var201;
                        var199.field993[var200] = var202;
                    }
                    class132.method1043(var200, var198, var201 - 1, -438, var202);
                }
                if (var199 != null) {
                    class12.method79(-30833, var199);
                }
                class139.method1082(13);
                class157.field3600[class80.method680(class154.field3459++, 31)] = class80.method680(var198, 32767);
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 71) {
                int var203 = class56.field1393.method799(-612365912);
                int var204 = class56.field1393.method833((byte) 27);
                if (var204 == 65535) {
                    var204 = -1;
                }
                int var205 = class56.field1393.method840(true);
                class40 var206 = class132.method1041(true, var203);
                if (var206.field977) {
                    var206.field954 = var204;
                    var206.field1051 = var205;
                    class85 var207 = class85.method710(var204, 10);
                    var206.field948 = var207.field2128;
                    var206.field1075 = var207.field2091;
                    var206.field1005 = var207.field2129;
                    var206.field980 = var207.field2084;
                    var206.field1065 = var207.field2096;
                    if (var206.field1038 > 0) {
                        var206.field1065 = var206.field1065 * 32 / var206.field1038;
                    }
                    var206.field952 = var207.field2085;
                    class12.method79(-30833, var206);
                } else if (var204 == -1) {
                    class100.field2421 = -1;
                    var206.field981 = 0;
                    return true;
                } else {
                    class85 var208 = class85.method710(var204, 10);
                    var206.field980 = var208.field2084;
                    var206.field963 = var204;
                    var206.field952 = var208.field2085;
                    var206.field981 = 4;
                    var206.field1065 = var208.field2096 * 100 / var205;
                    class12.method79(arg0 ^ 0xFFFF878F, var206);
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 62) {
                boolean var209 = false;
                long var210 = class56.field1393.method846(-4297);
                long var212 = (long) class56.field1393.method808(-20054);
                long var214 = (long) class56.field1393.method805(3);
                long var216 = (var212 << 32) + var214;
                int var218 = class56.field1393.method829((byte) 24);
                for (int var219 = 0; var219 < 100; var219++) {
                    if (class48.field1264[var219] == var216) {
                        var209 = true;
                        break;
                    }
                }
                if (var218 <= 1) {
                    for (int var220 = 0; var220 < class133.field3044; var220++) {
                        if (class44.field1169[var220] == var210) {
                            var209 = true;
                            break;
                        }
                    }
                }
                if (!var209 && class112.field2696 == 0) {
                    class48.field1264[class25.field618] = var216;
                    class25.field618 = (class25.field618 + 1) % 100;
                    class60 var221 = class122.method962(class77.method626(class56.field1393, (byte) 113).method444(true));
                    if (var218 == 2 || var218 == 3) {
                        class43.method342(class104.method853(-98, new class60[] { class4.field75, class89.method726((byte) -108, var210).method434((byte) 108) }), 7, var221, arg0 + 2001);
                    } else if (var218 == 1) {
                        class43.method342(class104.method853(-84, new class60[] { class133.field3038, class89.method726((byte) -114, var210).method434((byte) 71) }), 7, var221, 2001);
                    } else {
                        class43.method342(class89.method726((byte) -117, var210).method434((byte) 33), 3, var221, 2001);
                    }
                }
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 128) {
                int var222 = class56.field1393.method849(1);
                int var223 = class56.field1393.method823((byte) 118);
                int var224 = class56.field1393.method823((byte) -81);
                class46.field1222 = var223 >> 1;
                class107.field2640.method266(var224, var222, (var223 & 0x1) == 1, -17715);
                class100.field2421 = -1;
                return true;
            }
            if (class100.field2421 == 78) {
                int var225 = class56.field1393.method849(1);
                int var226 = class56.field1393.method833((byte) 27);
                int var227 = class56.field1393.method799(-612365912);
                class81 var228 = (class81) class39.field929.method716((byte) 103, (long) var227);
                if (var228 != null) {
                    class109.method894(false, var228, var228.field2012 != var226);
                }
                class146.method1116(var225, (byte) 26, var227, var226);
                class100.field2421 = -1;
                return true;
            }
            class73.method558(arg0 - 1, "T1 - " + class100.field2421 + "," + class2.field51 + "," + class80.field1978 + " - " + class94.field2310, null);
            class154.method1170((byte) -55);
        } catch (IOException var232) {
            class98.method775(61);
        } catch (Exception var233) {
            String var230 = "T2 - " + class100.field2421 + "," + class2.field51 + "," + class80.field1978 + " - " + class94.field2310 + "," + (class107.field2640.field841[0] + class41.field1095) + "," + (class107.field2640.field827[0] + class144.field3240) + " - ";
            for (int var231 = 0; var231 < class94.field2310 && var231 < 50; var231++) {
                var230 = var230 + class56.field1393.field2498[var231] + ",";
            }
            class73.method558(-1, var230, var233);
            class154.method1170((byte) -55);
        }
        return true;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)I")
    public abstract int method146(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
    public abstract void method148(byte arg0);
}
