import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class31 extends class137 {

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public static int field482 = 0;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "Lhh;")
    private static class163 field478 = class137.method1065("Loaded sprites", 17);

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public static int field481 = 0;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "I")
    public static int field489 = 0;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "Lhh;")
    public static class163 field487 = field478;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V")
    public static void method185(byte arg0) {
        int var1 = 8 % ((arg0 + 36) / 41);
        field478 = null;
        field487 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lpa;B)V")
    public static final void method186(class123 arg0, byte arg1) {
        field480++;
        class39.field659 = arg0.method983(arg1 + 24080, class20.field321);
        class89.field1637 = arg0.method983(24108, class177.field3228);
        if (arg1 != 28) {
            method185((byte) 0);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZLqh;II)V")
    public static final void method187(int arg0, boolean arg1, class69 arg2, int arg3, int arg4) {
        field486++;
        int var5 = arg2.field1183;
        int var6 = arg2.field1220;
        if (arg2.field1204 == 0) {
            arg2.field1183 = arg2.field1320;
        } else if (arg2.field1204 == 1) {
            arg2.field1183 = arg4 - arg2.field1320;
        } else if (arg2.field1204 == 2) {
            arg2.field1183 = arg2.field1320 * arg4 >> 14;
        } else if (arg2.field1204 == 3) {
            if (arg2.field1294 == 2) {
                arg2.field1183 = (arg2.field1320 - 1) * arg2.field1293 + arg2.field1320 * 32;
            } else if (arg2.field1294 == 7) {
                arg2.field1183 = arg2.field1320 * 115 + ((arg2.field1320 - 1) * arg2.field1293);
            }
        }
        if (arg2.field1225 == 0) {
            arg2.field1220 = arg2.field1259;
        } else if (arg2.field1225 == 1) {
            arg2.field1220 = arg0 - arg2.field1259;
        } else if (arg2.field1225 == 2) {
            arg2.field1220 = arg2.field1259 * arg0 >> 14;
        } else if (arg2.field1225 == 3) {
            if (arg2.field1294 == 2) {
                arg2.field1220 = (arg2.field1259 - 1) * arg2.field1260 + arg2.field1259 * 32;
            } else if (arg2.field1294 == 7) {
                arg2.field1220 = arg2.field1259 * 12 + ((arg2.field1259 - 1) * arg2.field1260);
            }
        }
        if (arg2.field1204 == 4) {
            arg2.field1183 = arg2.field1220 * arg2.field1178 / arg2.field1314;
        }
        if (arg2.field1225 == 4) {
            arg2.field1220 = arg2.field1314 * arg2.field1183 / arg2.field1178;
        }
        if (class127.field2470 && (client.method826(arg2) != 0 || arg2.field1294 == 0)) {
            if (arg2.field1220 < 5 && arg2.field1183 < 5) {
                arg2.field1220 = 5;
                arg2.field1183 = 5;
            } else {
                if (arg2.field1220 <= 0) {
                    arg2.field1220 = 5;
                }
                if (arg2.field1183 <= 0) {
                    arg2.field1183 = 5;
                }
            }
        }
        if (arg2.field1217 == 1337) {
            class137.field2646 = arg2;
        }
        if (arg3 != -2) {
            method188(true, 110, 36, -36, -6, 99, 126);
        }
        if (arg1 && arg2.field1244 != null && arg2.field1183 != var5 || arg2.field1220 != var6) {
            class225 var7 = new class225();
            var7.field4079 = arg2.field1244;
            var7.field4076 = arg2;
            class11.field170.method1018((byte) 94, var7);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method188(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field485++;
        if (class102.field1965 == arg6 && class29.field467 == arg3 && class233.field4167 == arg5 || class177.method1310(4643)) {
            return;
        }
        class102.field1965 = arg6;
        class233.field4167 = arg5;
        class29.field467 = arg3;
        if (class177.method1310(4643)) {
            class233.field4167 = 0;
        }
        if (arg0) {
            class174.method1292(28, true);
        } else {
            class174.method1292(25, true);
        }
        class68.method473(true, class191.field3492, (byte) -99);
        int var7 = class257.field4500;
        int var8 = class62.field1035;
        class62.field1035 = arg6 * 8 - 48;
        class257.field4500 = (arg3 - 6) * 8;
        class29.field468 = class93.method740(class29.field467 * 8, -18094, class102.field1965 * 8);
        int var9 = class257.field4500 - var7;
        int var10 = class257.field4500;
        int var11 = class62.field1035 - var8;
        int var12 = class62.field1035;
        if (arg0) {
            class199.field3573 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class2 var32 = class111.field2098[var16];
                if (var32 != null) {
                    var32.field3615 -= var9 * 128;
                    var32.field3633 -= var11 * 128;
                    if (var32.field3633 >= 0 && var32.field3633 <= 13184 && var32.field3615 >= 0 && var32.field3615 <= 13184) {
                        for (int var33 = 0; var33 < 10; var33++) {
                            var32.field3614[var33] -= var11;
                            var32.field3629[var33] -= var9;
                        }
                        class155.field2887[class199.field3573++] = var16;
                    } else {
                        class111.field2098[var16].field41 = null;
                        class111.field2098[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class2 var14 = class111.field2098[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field3614[var15] -= var11;
                        var14.field3629[var15] -= var9;
                    }
                    var14.field3633 -= var11 * 128;
                    var14.field3615 -= var9 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class126 var30 = class106.field2029[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field3614[var31] -= var11;
                    var30.field3629[var31] -= var9;
                }
                var30.field3615 -= var9 * 128;
                var30.field3633 -= var11 * 128;
            }
        }
        class20.field323 = arg5;
        class235.field4203.method1444(arg4, arg2 + 94, arg1, false);
        byte var18 = 0;
        byte var19 = 104;
        byte var20 = 104;
        byte var21 = 1;
        byte var22 = 1;
        if (var11 < 0) {
            var22 = -1;
            var19 = -1;
            var18 = 103;
        }
        byte var23 = 0;
        if (var9 < 0) {
            var21 = -1;
            var23 = 103;
            var20 = -1;
        }
        for (int var24 = var18; var24 != var19; var24 += var22) {
            for (int var26 = var23; var26 != var20; var26 += var21) {
                int var27 = var24 + var11;
                int var28 = var9 + var26;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                        class32.field498[var29][var24][var26] = class32.field498[var29][var27][var28];
                    } else {
                        class32.field498[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class250 var25 = (class250) class143.field2708.method1017(119); var25 != null; var25 = (class250) class143.field2708.method1016((byte) -31)) {
            var25.field4396 -= var11;
            var25.field4397 -= var9;
            if (var25.field4396 < 0 || var25.field4397 < 0 || var25.field4396 >= 104 || var25.field4397 >= 104) {
                var25.method1063(118);
            }
        }
        if (class265.field4605 != 0) {
            class265.field4605 -= var11;
            class213.field3886 -= var9;
        }
        class40.field671 = 0;
        class18.field258 = arg2;
        if (arg0) {
            class235.field4201 -= var9;
            class262.field4581 -= var11;
            class49.field819 -= var11;
            class10.field162 -= var9;
        } else {
            class5.field99 = 1;
        }
        class130.field2525.method1021((byte) -68);
        class17.field239.method1021((byte) -118);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBLhh;)V")
    public static final void method189(int arg0, byte arg1, class163 arg2) {
        field488++;
        class163 var3 = arg2.method1226((byte) -31).method1190((byte) 73);
        boolean var4 = false;
        if (arg1 < 2) {
            return;
        }
        for (int var5 = 0; var5 < class95.field1791; var5++) {
            class126 var6 = class106.field2029[class246.field4340[var5]];
            if (var6 != null && var6.field2424 != null && var6.field2424.method1228(var3, -32)) {
                var4 = true;
                class239.method1652(var6.field3614[0], 2, 1, 0, 1, 116, var6.field3629[0], false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
                if (arg0 == 1) {
                    class191.field3499.method75(233, 115);
                    class191.field3499.method616(-8618, class246.field4340[var5]);
                    class120.field2258++;
                } else if (arg0 == 4) {
                    class191.field3499.method75(114, 64);
                    class191.field3499.method631(class246.field4340[var5], -1);
                    class149.field2802++;
                } else if (arg0 == 6) {
                    class191.field3499.method75(178, 71);
                    class220.field4003++;
                    class191.field3499.method631(class246.field4340[var5], -1);
                } else if (arg0 == 7) {
                    class191.field3499.method75(134, 122);
                    class179.field3249++;
                    class191.field3499.method634(class246.field4340[var5], -42);
                }
                break;
            }
        }
        if (!var4) {
            class56.method396(class145.method1101(0, new class163[] { class27.field422, var3 }), 95, class170.field3120, 0);
        }
    }
}
