import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class85 {

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field1403 = 0;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Lb;")
    public static class84 field1404 = new class84();

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Lpa;")
    public static class219 field1405 = new class219(0, -1);

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public int field1402;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V")
    public static final void method688(int arg0, int arg1, int arg2) {
        class222.field3479 = true;
        class48.field793 = arg0;
        class99.field1586 = arg1;
        class137.field2125 = arg2;
        class187.field2818 = -1;
        class133.field2041 = -1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method689(int arg0) {
        if (arg0 == 0) {
            field1404 = null;
            field1405 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Ltd;")
    public static final class73 method690(int arg0, int arg1) {
        field1397++;
        class73 var2 = (class73) class244.field3782.method1780((long) arg1, (byte) -120);
        if (arg0 != 2276) {
            field1404 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class124.field1961.method1163(class237.method1593(arg1, (byte) -55), class84.method686((byte) 120, arg1), 48);
        class73 var4 = new class73();
        var4.field1209 = arg1;
        if (var3 != null) {
            var4.method572(new class37(var3), (byte) -93);
        }
        var4.method579(0);
        if (!class181.field2693 && var4.field1159) {
            var4.field1164 = null;
        }
        if (var4.field1158) {
            var4.field1208 = 0;
            var4.field1197 = false;
        }
        class244.field3782.method1784(var4, false, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class139.field2140 = 0;
        for (int var7 = -1; var7 < class62.field1006 + class5.field78; var7++) {
            class264 var23;
            if (var7 == -1) {
                var23 = class261.field4058;
            } else if (class5.field78 > var7) {
                var23 = class41.field675[class166.field2510[var7]];
            } else {
                var23 = class72.field1144[class198.field3113[var7 - class5.field78]];
            }
            if (var23 != null && var23.method229(-18109)) {
                if (var23 instanceof class32) {
                    class217 var24 = ((class32) var23).field518;
                    if (var24.field3405 != null) {
                        var24 = var24.method1446(45);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (class5.field78 <= var7) {
                    class217 var25 = ((class32) var23).field518;
                    if (var25.field3405 != null) {
                        var25 = var25.method1446(19);
                    }
                    if (var25.field3354 >= 0 && var25.field3354 < class44.field708.length) {
                        int var26;
                        if (var25.field3348 == -1) {
                            var26 = var23.method1795(false) + 15;
                        } else {
                            var26 = var25.field3348 + 15;
                        }
                        class50.method421(arg5, true, var23, arg4 >> 1, arg1 >> 1, arg2, var26);
                        if (class275.field4324 > -1) {
                            class44.field708[var25.field3354].method45(arg3 + class275.field4324 - 12, arg0 - -class256.field3921 + -30);
                        }
                    }
                    class25[] var27 = class217.field3360;
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        class25 var29 = var27[var28];
                        if (var29 != null && var29.field385 == 1 && class198.field3113[var7 - class5.field78] == var29.field371 && class267.field4256 % 20 < 10) {
                            int var30;
                            if (var25.field3348 == -1) {
                                var30 = var23.method1795(false) + 15;
                            } else {
                                var30 = var25.field3348 + 15;
                            }
                            class50.method421(arg5, true, var23, arg4 >> 1, arg1 >> 1, arg2, var30);
                            if (class275.field4324 > -1) {
                                class188.field3005[var29.field374].method45(arg3 + class275.field4324 - 12, arg0 + -28 + class256.field3921);
                            }
                        }
                    }
                } else {
                    int var31 = 30;
                    class28 var32 = (class28) var23;
                    if (var32.field408 != -1 || var32.field439 != -1) {
                        class50.method421(arg5, true, var23, arg4 >> 1, arg1 >> 1, arg2, var23.method1795(false) + 15);
                        if (class275.field4324 > -1) {
                            if (var32.field408 != -1) {
                                class272.field4291[var32.field408].method45(arg3 + class275.field4324 - 12, -var31 + class256.field3921 + arg0);
                                var31 += 25;
                            }
                            if (var32.field439 != -1) {
                                class44.field708[var32.field439].method45(arg3 + class275.field4324 - 12, -var31 + class256.field3921 + arg0);
                                var31 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class25[] var33 = class217.field3360;
                        for (int var34 = 0; var34 < var33.length; var34++) {
                            class25 var35 = var33[var34];
                            if (var35 != null && var35.field385 == 10 && class166.field2510[var7] == var35.field371) {
                                class50.method421(arg5, true, var23, arg4 >> 1, arg1 >> 1, arg2, var23.method1795(false) + 15);
                                if (class275.field4324 > -1) {
                                    class188.field3005[var35.field374].method45(arg3 + class275.field4324 - 12, class256.field3921 + arg0 + -var31);
                                }
                            }
                        }
                    }
                }
                if (var23.field4131 != null && (class5.field78 <= var7 || class290.field4573 == 0 || class290.field4573 == 3 || class290.field4573 == 1 && class92.method725(((class28) var23).field446, -108))) {
                    class50.method421(arg5, true, var23, arg4 >> 1, arg1 >> 1, arg2, var23.method1795(false));
                    if (class275.field4324 > -1 && class56.field872 > class139.field2140) {
                        class56.field865[class139.field2140] = class123.field1925.method10(var23.field4131) / 2;
                        class56.field867[class139.field2140] = class123.field1925.field21;
                        class56.field860[class139.field2140] = class275.field4324;
                        class56.field869[class139.field2140] = class256.field3921;
                        class56.field876[class139.field2140] = var23.field4150;
                        class56.field864[class139.field2140] = var23.field4149;
                        class56.field866[class139.field2140] = var23.field4197;
                        class56.field871[class139.field2140] = var23.field4131;
                        class139.field2140++;
                    }
                }
                if (class267.field4256 < var23.field4171) {
                    class3 var36 = class171.field2545[0];
                    class3 var37 = class171.field2545[1];
                    int var41;
                    if (var23 instanceof class32) {
                        class32 var38 = (class32) var23;
                        class3[] var39 = (class3[]) class287.field4524.method1780((long) var38.field518.field3357, (byte) -114);
                        if (var39 == null) {
                            var39 = class238.method1606(-25519, class90.field1459, var38.field518.field3357, 0);
                            if (var39 != null) {
                                class287.field4524.method1784(var39, false, (long) var38.field518.field3357);
                            }
                        }
                        class217 var40 = var38.field518;
                        if (var39 != null && var39.length == 2) {
                            var37 = var39[1];
                            var36 = var39[0];
                        }
                        if (var40.field3348 == -1) {
                            var41 = var23.method1795(false);
                        } else {
                            var41 = var40.field3348;
                        }
                    } else {
                        var41 = var23.method1795(false);
                    }
                    class50.method421(arg5, true, var23, arg4 >> 1, arg1 >> 1, arg2, var41 + var36.field52 + 10);
                    if (class275.field4324 > -1) {
                        int var42 = class275.field4324 + arg3 - (var36.field54 >> 1);
                        int var43 = class256.field3921 + arg0 - 3;
                        var36.method45(var42, var43);
                        int var44 = var23.field4146 * var36.field54 / 255;
                        int var45 = var36.field52;
                        class201.method1347(var42, var43, var42 + var44, var43 + var45);
                        var37.method45(var42, var43);
                        class201.method1351(arg3, arg0, arg3 + arg4, arg0 - -arg1);
                    }
                }
                for (int var46 = 0; var46 < 4; var46++) {
                    if (class267.field4256 < var23.field4184[var46]) {
                        int var49;
                        if (var23 instanceof class32) {
                            class32 var47 = (class32) var23;
                            class217 var48 = var47.field518;
                            if (var48.field3348 == -1) {
                                var49 = var23.method1795(false) / 2;
                            } else {
                                var49 = var48.field3348 / 2;
                            }
                        } else {
                            var49 = var23.method1795(false) / 2;
                        }
                        class50.method421(arg5, true, var23, arg4 >> 1, arg1 >> 1, arg2, var49);
                        if (class275.field4324 > -1) {
                            if (var46 == 1) {
                                class256.field3921 -= 20;
                            }
                            if (var46 == 2) {
                                class275.field4324 -= 15;
                                class256.field3921 -= 10;
                            }
                            if (var46 == 3) {
                                class275.field4324 += 15;
                                class256.field3921 -= 10;
                            }
                            class215.field3312[var23.field4132[var46]].method45(class275.field4324 + arg3 - 12, arg0 - 12 + class256.field3921);
                            class143.field2189.method12(Integer.toString(var23.field4152[var46]), arg3 + class275.field4324 - 1, class256.field3921 + arg0 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < class139.field2140; var8++) {
            int var9 = class56.field860[var8];
            int var10 = class56.field865[var8];
            int var11 = class56.field869[var8];
            int var12 = class56.field867[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if ((var11 + 2) > (class56.field869[var22] - class56.field867[var22]) && var11 - var12 < class56.field869[var22] - -2 && (class56.field865[var22] + class56.field860[var22]) > (var9 - var10) && (class56.field860[var22] - class56.field865[var22]) < (var9 + var10) && var11 > (class56.field869[var22] - class56.field867[var22])) {
                        var13 = true;
                        var11 = class56.field869[var22] - class56.field867[var22];
                    }
                }
            }
            class275.field4324 = class56.field860[var8];
            class256.field3921 = class56.field869[var8] = var11;
            String var14 = class56.field871[var8];
            if (class119.field1841 == 0) {
                int var15 = 16776960;
                if (class56.field876[var8] < 6) {
                    var15 = class290.field4571[class56.field876[var8]];
                }
                if (class56.field876[var8] == 6) {
                    var15 = class17.field278 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class56.field876[var8] == 7) {
                    var15 = class17.field278 % 20 < 10 ? 255 : 65535;
                }
                if (class56.field876[var8] == 8) {
                    var15 = (class17.field278 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class56.field876[var8] == 9) {
                    int var16 = 150 - class56.field866[var8];
                    if (var16 < 50) {
                        var15 = (var16 * 1280) + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16384000 + 16776960 - (var16 * 327680);
                    } else if (var16 < 150) {
                        var15 = (var16 - 100) * 5 + 65280;
                    }
                }
                if (class56.field876[var8] == 10) {
                    int var17 = 150 - class56.field866[var8];
                    if (var17 < 50) {
                        var15 = (var17 * 5) + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16711935 - ((var17 - 50) * 327680);
                    } else if (var17 < 150) {
                        var15 = (var17 - 100) * 327680 + 255 - ((var17 + -100) * 5);
                    }
                }
                if (class56.field876[var8] == 11) {
                    int var18 = 150 - class56.field866[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - var18 * 327685;
                    } else if (var18 < 100) {
                        var15 = (var18 - 50) * 327685 + 65280;
                    } else if (var18 < 150) {
                        var15 = 16777215 - (var18 - 100) * 327680;
                    }
                }
                if (class56.field864[var8] == 0) {
                    class123.field1925.method12(var14, class275.field4324 + arg3, class256.field3921 + arg0, var15, 0);
                }
                if (class56.field864[var8] == 1) {
                    class123.field1925.method19(var14, arg3 + class275.field4324, class256.field3921 + arg0, var15, 0, class17.field278);
                }
                if (class56.field864[var8] == 2) {
                    class123.field1925.method14(var14, arg3 + class275.field4324, arg0 - -class256.field3921, var15, 0, class17.field278);
                }
                if (class56.field864[var8] == 3) {
                    class123.field1925.method16(var14, arg3 + class275.field4324, class256.field3921 + arg0, var15, 0, class17.field278, 150 - class56.field866[var8]);
                }
                if (class56.field864[var8] == 4) {
                    int var19 = (150 - class56.field866[var8]) * (class123.field1925.method10(var14) + 100) / 150;
                    class201.method1347(class275.field4324 + arg3 - 50, arg0, arg3 + class275.field4324 + 50, arg0 + arg1);
                    class123.field1925.method13(var14, arg3 - (-class275.field4324 - (50 - var19)), class256.field3921 + arg0, var15, 0);
                    class201.method1351(arg3, arg0, arg3 + arg4, arg0 + arg1);
                }
                if (class56.field864[var8] == 5) {
                    int var20 = 150 - class56.field866[var8];
                    int var21 = 0;
                    class201.method1347(arg3, class256.field3921 + arg0 - class123.field1925.field21 - 1, arg3 + arg4, class256.field3921 + arg0 + 5);
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class123.field1925.method12(var14, class275.field4324 + arg3, arg0 + var21 + class256.field3921, var15, 0);
                    class201.method1351(arg3, arg0, arg3 + arg4, arg0 - -arg1);
                }
            } else {
                class123.field1925.method12(var14, class275.field4324 + arg3, class256.field3921 + arg0, 16776960, 0);
            }
        }
        if (arg6 >= -51) {
            method689(-7);
        }
        field1394++;
    }
}
