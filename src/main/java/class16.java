import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class16 extends class44 {

    @OriginalMember(owner = "client!cc", name = "zb", descriptor = "Lpb;")
    public static class92 field516 = new class92();

    @OriginalMember(owner = "client!cc", name = "Hb", descriptor = "I")
    public static int field524 = 0;

    @OriginalMember(owner = "client!cc", name = "Kb", descriptor = "La;")
    public static class1 field527 = class113.method934(-11538, "Lade Ignorieren)2Liste)3)3)3");

    @OriginalMember(owner = "client!cc", name = "Ib", descriptor = "La;")
    public static class1 field525 = class113.method934(-11538, " )2> @cya@");

    @OriginalMember(owner = "client!cc", name = "Eb", descriptor = "La;")
    private static class1 field521 = class113.method934(-11538, "To");

    @OriginalMember(owner = "client!cc", name = "Fb", descriptor = "La;")
    public static class1 field522 = field521;

    @OriginalMember(owner = "client!cc", name = "Lb", descriptor = "I")
    public static int field528 = 0;

    @OriginalMember(owner = "client!cc", name = "Jb", descriptor = "I")
    public static int field526 = 0;

    @OriginalMember(owner = "client!cc", name = "sb", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!cc", name = "ub", descriptor = "I")
    public int field511;

    @OriginalMember(owner = "client!cc", name = "vb", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!cc", name = "wb", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!cc", name = "xb", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "client!cc", name = "yb", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "client!cc", name = "Ab", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!cc", name = "Cb", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "client!cc", name = "Mb", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!cc", name = "Gb", descriptor = "Lwc;")
    public static class134 field523;

    @OriginalMember(owner = "client!cc", name = "tb", descriptor = "[I")
    public int[] field510;

    @OriginalMember(owner = "client!cc", name = "Db", descriptor = "[I")
    public int[] field520;

    @OriginalMember(owner = "client!cc", name = "Bb", descriptor = "[La;")
    public class1[] field518;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)V", line = 3)
    public static void method270(int arg0) {
        field527 = null;
        field525 = null;
        field521 = null;
        if (arg0 == -27934) {
            field522 = null;
            field523 = null;
            field516 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lad;IIIILab;IIII)V", line = 32)
    public static final void method271(class5 arg0, int arg1, int arg2, int arg3, int arg4, class3 arg5, int arg6, int arg7, int arg8, int arg9) {
        field509++;
        int var10 = class57.field1454[arg2][arg9][arg8];
        int var11 = class57.field1454[arg2][arg9 + 1][arg8];
        int var12 = class57.field1454[arg2][arg9][arg8 + 1];
        int var13 = class57.field1454[arg2][arg9 + 1][arg8 + 1];
        class49 var14 = class32.method390(arg1, (byte) 125);
        int var15 = var10 + var12 + var11 + var13 >> 2;
        int var16 = (arg7 << 6) + arg4;
        int var17 = arg9 + (arg8 << 7) + (arg1 << 14) + 1073741824;
        if (var14.field1331 == 0) {
            var17 += Integer.MIN_VALUE;
        }
        if (var14.field1318 == 1) {
            var16 += 256;
        }
        if (arg4 == 22) {
            class128 var18;
            if (var14.field1291 == -1 && var14.field1319 == null) {
                var18 = var14.method507(var13, var12, arg7, var10, 22, (byte) 124, var11);
            } else {
                var18 = new class54(arg1, 22, arg7, var10, var11, var13, var12, var14.field1291, true);
            }
            arg5.method89(arg3, arg9, arg8, var15, var18, var17, var16);
            if (var14.field1286 && var14.field1331 == 1) {
                arg0.method116((byte) -28, arg8, arg9);
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class128 var38;
            if (var14.field1291 == -1 && var14.field1319 == null) {
                var38 = var14.method507(var13, var12, arg7, var10, 10, (byte) 124, var11);
            } else {
                var38 = new class54(arg1, 10, arg7, var10, var11, var13, var12, var14.field1291, true);
            }
            if (var38 != null) {
                int var39;
                int var40;
                if (arg7 == 1 || arg7 == 3) {
                    var40 = var14.field1288;
                    var39 = var14.field1300;
                } else {
                    var39 = var14.field1288;
                    var40 = var14.field1300;
                }
                int var41 = 0;
                if (arg4 == 11) {
                    var41 += 256;
                }
                arg5.method94(arg3, arg9, arg8, var15, var39, var40, var38, var41, var17, var16);
            }
            if (var14.field1286) {
                arg0.method119(arg9, var14.field1313, arg6 ^ 0xFFFFA9BB, var14.field1300, arg7, arg8, var14.field1288);
            }
        } else if (arg4 >= 12) {
            class128 var19;
            if (var14.field1291 == -1 && var14.field1319 == null) {
                var19 = var14.method507(var13, var12, arg7, var10, arg4, (byte) 124, var11);
            } else {
                var19 = new class54(arg1, arg4, arg7, var10, var11, var13, var12, var14.field1291, true);
            }
            arg5.method94(arg3, arg9, arg8, var15, 1, 1, var19, 0, var17, var16);
            if (var14.field1286) {
                arg0.method119(arg9, var14.field1313, arg6 ^ 0xFFFFA9B7, var14.field1300, arg7, arg8, var14.field1288);
            }
        } else if (arg4 == 0) {
            class128 var20;
            if (var14.field1291 == -1 && var14.field1319 == null) {
                var20 = var14.method507(var13, var12, arg7, var10, 0, (byte) 124, var11);
            } else {
                var20 = new class54(arg1, 0, arg7, var10, var11, var13, var12, var14.field1291, true);
            }
            arg5.method51(arg3, arg9, arg8, var15, var20, null, class70.field1743[arg7], 0, var17, var16);
            if (var14.field1286) {
                arg0.method115(arg8, arg4, arg7, arg9, var14.field1313, (byte) 95);
            }
        } else if (arg4 == 1) {
            class128 var21;
            if (var14.field1291 == -1 && var14.field1319 == null) {
                var21 = var14.method507(var13, var12, arg7, var10, 1, (byte) 124, var11);
            } else {
                var21 = new class54(arg1, 1, arg7, var10, var11, var13, var12, var14.field1291, true);
            }
            arg5.method51(arg3, arg9, arg8, var15, var21, null, class114.field2822[arg7], 0, var17, var16);
            if (var14.field1286) {
                arg0.method115(arg8, arg4, arg7, arg9, var14.field1313, (byte) 95);
            }
        } else if (arg4 == 2) {
            int var22 = arg7 + 1 & 0x3;
            class128 var23;
            class128 var24;
            if (var14.field1291 == -1 && var14.field1319 == null) {
                var23 = var14.method507(var13, var12, arg7 + 4, var10, 2, (byte) 124, var11);
                var24 = var14.method507(var13, var12, var22, var10, 2, (byte) 124, var11);
            } else {
                var23 = new class54(arg1, 2, arg7 + 4, var10, var11, var13, var12, var14.field1291, true);
                var24 = new class54(arg1, 2, var22, var10, var11, var13, var12, var14.field1291, true);
            }
            arg5.method51(arg3, arg9, arg8, var15, var23, var24, class70.field1743[arg7], class70.field1743[var22], var17, var16);
            if (var14.field1286) {
                arg0.method115(arg8, arg4, arg7, arg9, var14.field1313, (byte) 95);
            }
        } else if (arg4 == 3) {
            class128 var25;
            if (var14.field1291 == -1 && var14.field1319 == null) {
                var25 = var14.method507(var13, var12, arg7, var10, 3, (byte) 124, var11);
            } else {
                var25 = new class54(arg1, 3, arg7, var10, var11, var13, var12, var14.field1291, true);
            }
            arg5.method51(arg3, arg9, arg8, var15, var25, null, class114.field2822[arg7], 0, var17, var16);
            if (var14.field1286) {
                arg0.method115(arg8, arg4, arg7, arg9, var14.field1313, (byte) 95);
            }
        } else if (arg4 == 9) {
            class128 var26;
            if (var14.field1291 == -1 && var14.field1319 == null) {
                var26 = var14.method507(var13, var12, arg7, var10, arg4, (byte) 124, var11);
            } else {
                var26 = new class54(arg1, arg4, arg7, var10, var11, var13, var12, var14.field1291, true);
            }
            arg5.method94(arg3, arg9, arg8, var15, 1, 1, var26, 0, var17, var16);
            if (var14.field1286) {
                arg0.method119(arg9, var14.field1313, -117, var14.field1300, arg7, arg8, var14.field1288);
            }
        } else {
            if (var14.field1315) {
                if (arg7 == 1) {
                    int var30 = var12;
                    var12 = var13;
                    var13 = var11;
                    var11 = var10;
                    var10 = var30;
                } else if (arg7 == 2) {
                    int var28 = var12;
                    var12 = var11;
                    var11 = var28;
                    int var29 = var13;
                    var13 = var10;
                    var10 = var29;
                } else if (arg7 == 3) {
                    int var27 = var12;
                    var12 = var10;
                    var10 = var11;
                    var11 = var13;
                    var13 = var27;
                }
            }
            if (arg4 == 4) {
                class128 var31;
                if (var14.field1291 == -1 && var14.field1319 == null) {
                    var31 = var14.method507(var13, var12, 0, var10, 4, (byte) 124, var11);
                } else {
                    var31 = new class54(arg1, 4, 0, var10, var11, var13, var12, var14.field1291, true);
                }
                arg5.method66(arg3, arg9, arg8, var15, var31, class70.field1743[arg7], arg7 * 512, 0, 0, var17, var16);
            } else if (arg4 == 5) {
                int var32 = 16;
                int var33 = arg5.method79(arg3, arg9, arg8);
                if (var33 > 0) {
                    var32 = class32.method390(var33 >> 14 & 0x7FFF, (byte) 127).field1290;
                }
                class128 var34;
                if (var14.field1291 == -1 && var14.field1319 == null) {
                    var34 = var14.method507(var13, var12, 0, var10, 4, (byte) 124, var11);
                } else {
                    var34 = new class54(arg1, 4, 0, var10, var11, var13, var12, var14.field1291, true);
                }
                arg5.method66(arg3, arg9, arg8, var15, var34, class70.field1743[arg7], arg7 * 512, class63.field1598[arg7] * var32, class4.field182[arg7] * var32, var17, var16);
            } else if (arg6 == -22078) {
                if (arg4 == 6) {
                    class128 var35;
                    if (var14.field1291 == -1 && var14.field1319 == null) {
                        var35 = var14.method507(var13, var12, 0, var10, 4, (byte) 124, var11);
                    } else {
                        var35 = new class54(arg1, 4, 0, var10, var11, var13, var12, var14.field1291, true);
                    }
                    arg5.method66(arg3, arg9, arg8, var15, var35, 256, arg7, 0, 0, var17, var16);
                } else if (arg4 == 7) {
                    class128 var36;
                    if (var14.field1291 == -1 && var14.field1319 == null) {
                        var36 = var14.method507(var13, var12, 0, var10, 4, (byte) 124, var11);
                    } else {
                        var36 = new class54(arg1, 4, 0, var10, var11, var13, var12, var14.field1291, true);
                    }
                    arg5.method66(arg3, arg9, arg8, var15, var36, 512, arg7, 0, 0, var17, var16);
                } else if (arg4 == 8) {
                    class128 var37;
                    if (var14.field1291 == -1 && var14.field1319 == null) {
                        var37 = var14.method507(var13, var12, 0, var10, 4, (byte) 124, var11);
                    } else {
                        var37 = new class54(arg1, 4, 0, var10, var11, var13, var12, var14.field1291, true);
                    }
                    arg5.method66(arg3, arg9, arg8, var15, var37, 768, arg7, 0, 0, var17, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V", line = 331)
    public static final void method272(byte arg0) {
        field529++;
        if (arg0 != -54) {
            field521 = null;
        }
        if (class122.field3053 != 1) {
            return;
        }
        if (class112.field2765 >= 6 && class112.field2765 <= 106 && class1.field14 >= 467 && class1.field14 <= 499) {
            class15.field505 = true;
            class75.field1867 = (class75.field1867 + 1) % 4;
            class105.field2640 = true;
            class70.field1729.method416(11453, 32);
            class74.field1814++;
            class70.field1729.method142(class75.field1867, (byte) -128);
            class70.field1729.method142(class6.field237, (byte) -128);
            class70.field1729.method142(class115.field2831, (byte) -128);
        }
        if (class112.field2765 >= 135 && class112.field2765 <= 235 && class1.field14 >= 467 && class1.field14 <= 499) {
            class105.field2640 = true;
            class6.field237 = (class6.field237 + 1) % 3;
            class15.field505 = true;
            class74.field1814++;
            class70.field1729.method416(arg0 ^ 0xFFFFD377, 32);
            class70.field1729.method142(class75.field1867, (byte) -128);
            class70.field1729.method142(class6.field237, (byte) -128);
            class70.field1729.method142(class115.field2831, (byte) -128);
        }
        if (class112.field2765 >= 273 && class112.field2765 <= 373 && class1.field14 >= 467 && class1.field14 <= 499) {
            class115.field2831 = (class115.field2831 + 1) % 3;
            class15.field505 = true;
            class105.field2640 = true;
            class70.field1729.method416(11453, 32);
            class74.field1814++;
            class70.field1729.method142(class75.field1867, (byte) -128);
            class70.field1729.method142(class6.field237, (byte) -128);
            class70.field1729.method142(class115.field2831, (byte) -128);
        }
        if (class112.field2765 < 412 || class112.field2765 > 512 || class1.field14 < 467 || class1.field14 > 499) {
            return;
        }
        if (class132.field3230 == -1) {
            class36.method414(127);
            if (class74.field1847 != -1) {
                class133.field3271 = false;
                class132.field3218 = class132.field3230 = class74.field1847;
                class132.field3220 = class132.field3237;
                return;
            }
        } else {
            class89.method761(arg0 ^ 0xFFFFFF9A, 0, class78.field1924, class132.field3237);
        }
        return;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZILaa;I)V", line = 403)
    public static final void method273(int arg0, boolean arg1, int arg2, class2 arg3, int arg4) {
        field513++;
        if (class104.field2624 == arg3 || class42.field1105 >= 400) {
            return;
        }
        class1 var5;
        if (arg3.field66 == 0) {
            var5 = class116.method959(82, new class1[] { arg3.field87, class32.method391(class104.field2624.field69, arg3.field69, -122), class48.field1277, class28.field786, class48.method504(arg3.field69, -1), class103.field2604 });
        } else {
            var5 = class116.method959(-60, new class1[] { arg3.field87, class48.field1277, class53.field1395, class48.method504(arg3.field66, -1), class103.field2604 });
        }
        if (class14.field476 == 1) {
            class82.field2068++;
            class34.method399(arg4, client.field585, arg0, -501, arg2, 22, class116.method959(55, new class1[] { class130.field3180, class59.field1503, var5 }));
        } else if (client.field595 != 1) {
            for (int var6 = 4; var6 >= 0; var6--) {
                if (client.field600[var6] != null) {
                    class5.field208++;
                    int var8 = 0;
                    short var9 = 0;
                    if (client.field600[var6].method14(class60.field1525, true)) {
                        if (class104.field2624.field69 < arg3.field69) {
                            var9 = 2000;
                        }
                        if (class104.field2624.field75 != 0 && arg3.field75 != 0) {
                            if (class104.field2624.field75 == arg3.field75) {
                                var9 = 2000;
                            } else {
                                var9 = 0;
                            }
                        }
                    } else if (class24.field736[var6]) {
                        var9 = 2000;
                    }
                    if (var6 == 0) {
                        var8 = var9 + 10;
                    }
                    if (var6 == 1) {
                        var8 = var9 + 39;
                    }
                    if (var6 == 2) {
                        var8 = var9 + 44;
                    }
                    if (var6 == 3) {
                        var8 = var9 + 14;
                    }
                    if (var6 == 4) {
                        var8 = var9 + 41;
                    }
                    class34.method399(arg4, client.field600[var6], arg0, -501, arg2, var8, class116.method959(79, new class1[] { class53.field1396, var5 }));
                }
            }
        } else if ((class115.field2849 & 0x8) == 8) {
            class34.method399(arg4, class60.field1526, arg0, -501, arg2, 1, class116.method959(124, new class1[] { class52.field1387, class59.field1503, var5 }));
            class38.field1024++;
        }
        if (arg1) {
            return;
        }
        for (int var7 = 0; var7 < class42.field1105; var7++) {
            if (class79.field1935[var7] == 7) {
                class102.field2589[var7] = class116.method959(-78, new class1[] { class123.field3060, class93.field2340, class53.field1396, var5 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)I", line = 536)
    public static final int method274(int arg0) {
        field512++;
        if (arg0 != 256) {
            field528 = 44;
        }
        int var1 = class78.method715((byte) -120, class2.field76, class23.field710, class46.field1202);
        return var1 - class70.field1751 >= 800 || (class34.field899[class2.field76][class23.field710 >> 7][class46.field1202 >> 7] & 0x4) == 0 ? 3 : class2.field76;
    }
}
