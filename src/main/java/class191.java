import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class191 {

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Lhh;")
    private static class163 field3491 = class137.method1065("Loading )2 please wait)3", 17);

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Lhh;")
    public static class163 field3492 = field3491;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "Loa;")
    public static class9 field3494 = new class9();

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "S")
    public static short field3497 = 205;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "Lhh;")
    public static class163 field3495 = class137.method1065("(R", 17);

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "S")
    public static short field3500 = 32767;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "Lhh;")
    public static class163 field3496 = class137.method1065("<col=40ff00>", 17);

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "Lmd;")
    public static class12 field3499 = new class12(5000);

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public static int field3505 = 0;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "J")
    public static volatile long field3502 = 0L;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "Lhh;")
    private static class163 field3504 = class137.method1065("Continue", 17);

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "Lhh;")
    public static class163 field3501 = field3504;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "Lpa;")
    public static class123 field3498;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Lv;")
    public static class22 field3489;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "()V")
    public static final void method1400() {
        for (int var0 = 0; var0 < class7.field126; var0++) {
            for (int var4 = 0; var4 < class58.field948; var4++) {
                for (int var5 = 0; var5 < class106.field2033; var5++) {
                    class259.field4542[var0][var4][var5] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class20.field330; var1++) {
            class239.field4254[var1] = null;
        }
        class20.field330 = 0;
        for (int var2 = 0; var2 < class57.field935; var2++) {
            class55.field918[var2] = null;
        }
        class57.field935 = 0;
        for (int var3 = 0; var3 < class139.field2662.length; var3++) {
            class139.field2662[var3] = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Led;IZ)V")
    public static final void method1401(class255 arg0, int arg1, boolean arg2) {
        field3487++;
        if (class23.field378 != null) {
            try {
                class23.field378.method1724(true);
            } catch (Exception var8) {
            }
            class23.field378 = null;
        }
        class23.field378 = arg0;
        class26.method168((byte) 19, arg2);
        class77.field1446 = null;
        class85.field1606 = null;
        class182.field3340 = 0;
        class176.field3222.field1541 = 0;
        while (true) {
            class46 var3 = (class46) class214.field3909.method1747((byte) 115);
            if (var3 == null) {
                while (true) {
                    class46 var4 = (class46) class192.field3517.method1747((byte) 112);
                    if (var4 == null) {
                        if (class73.field1385 != 0) {
                            try {
                                class81 var5 = new class81(4);
                                var5.method655(0, 4);
                                var5.method655(arg1, class73.field1385);
                                var5.method631(0, -1);
                                class23.field378.method1729(var5.field1562, 4, 0, arg1 + 5000);
                            } catch (IOException var7) {
                                try {
                                    class23.field378.method1724(true);
                                } catch (Exception var6) {
                                }
                                class81.field1532++;
                                class23.field378 = null;
                            }
                        }
                        class5.field101 = arg1;
                        class246.field4343 = class7.method55(0);
                        return;
                    }
                    class20.field314.method467(var4, true);
                    class130.field2528.method1741(var4, false, var4.field2641);
                    class77.field1447--;
                    class20.field318++;
                }
            }
            class135.field2606.method1741(var3, false, var3.field2641);
            class116.field2200--;
            class90.field1662++;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method1402(int arg0) {
        field3492 = null;
        field3499 = null;
        field3501 = null;
        field3495 = null;
        if (arg0 != -1244216794) {
            method1401((class255) null, 110, false);
        }
        field3489 = null;
        field3504 = null;
        field3494 = null;
        field3491 = null;
        field3496 = null;
        field3498 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lpg;I)V")
    public static final void method1403(class81 arg0, int arg1) {
        field3493++;
        if (arg1 != -1804892218) {
            method1400();
        }
        while (true) {
            while (arg0.field1562.length > arg0.field1541) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg0.method622(true) == 1) {
                    var3 = true;
                    var2 = arg0.method622(true);
                    var4 = arg0.method622(true);
                }
                int var5 = arg0.method622(true);
                int var6 = arg0.method622(true);
                int var7 = class58.field952 - (var6 * 64) - (1 - class218.field3965);
                int var8 = var5 * 64 - class54.field892;
                if (var8 >= 0 && (var7 - 63) >= 0 && class124.field2395 > (var8 + 63) && class58.field952 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || var2 * 8 <= var11 && (var2 * 8 + 8) > var11 && var12 >= var4 * 8 && var4 * 8 + 8 > var12) {
                                byte var13 = arg0.method635(-28);
                                if (var13 != 0) {
                                    if (class32.field495[var9][var10] == null) {
                                        class32.field495[var9][var10] = new byte[4096];
                                    }
                                    class32.field495[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method635(-26);
                                    if (class19.field300[var9][var10] == null) {
                                        class19.field300[var9][var10] = new byte[4096];
                                    }
                                    class19.field300[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method635(-116);
                        if (var16 != 0) {
                            arg0.field1541++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIBIIII)V")
    public static final void method1404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        field3488++;
        int var11 = arg3 - arg1;
        int var12 = arg7 - arg2;
        if (arg3 < class124.field2395) {
            var11++;
        }
        if (class58.field952 > arg7) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var33 = arg8 * var13 + arg4 >> 16;
            int var34 = (var13 + 1) * arg8 + arg4 >> 16;
            int var35 = var34 - var33;
            if (var35 > 0) {
                int var36 = arg1 + var13 >> 6;
                if (var36 >= 0 && var36 <= class215.field3917.length - 1) {
                    int var37 = arg10 + var34;
                    int[][] var38 = class215.field3917[var36];
                    int var39 = arg10 + var33;
                    byte[][] var40 = class32.field495[var36];
                    byte[][] var41 = class19.field300[var36];
                    byte[][] var42 = class38.field633[var36];
                    byte[][] var43 = class151.field2828[var36];
                    byte[][] var44 = class55.field911[var36];
                    for (int var45 = 0; var45 < var12; var45++) {
                        int var46 = arg5 + (arg0 * var45) >> 16;
                        int var47 = arg5 + ((var45 + 1) * arg0) >> 16;
                        int var48 = var47 - var46;
                        if (var48 > 0) {
                            int var49 = arg2 + var45 >> 6;
                            int var50 = arg9 + var47;
                            int var51 = arg9 + var46;
                            int var52 = arg2 + var45 & 0x3F;
                            int var53 = var13 + arg1 & 0x3F;
                            int var54 = (var52 << 6) + var53;
                            int var55;
                            if (var49 < 0 || (var38.length - 1) < var49 || var38[var49] == null) {
                                if (class253.field4430.field1433 != -1) {
                                    var55 = class253.field4430.field1433;
                                } else if ((arg1 + var13 & 0x4) == (arg2 + var45 & 0x4)) {
                                    var55 = class231.field4151[class6.field108 + 1];
                                } else {
                                    var55 = 4936552;
                                }
                                if (var49 < 0 || (var38.length - 1) < var49) {
                                    if (var55 == 0) {
                                        var55 = 1;
                                    }
                                    class206.method1483(var39, var51, var35, var48, var55);
                                    continue;
                                }
                            } else {
                                var55 = var38[var49][var54];
                            }
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            int var56 = var40[var49] == null ? 0 : class231.field4151[var40[var49][var54] & 0xFF];
                            int var57 = var42[var49] == null ? 0 : class231.field4151[var42[var49][var54] & 0xFF];
                            if (var56 == 0 && var57 == 0) {
                                class206.method1483(var39, var51, var35, var48, var55);
                            } else {
                                if (var56 != 0) {
                                    if (var56 == -1) {
                                        var56 = 1;
                                    }
                                    byte var58 = var41[var49] == null ? 0 : var41[var49][var54];
                                    int var59 = var58 & 0xFC;
                                    if (var59 == 0 || var35 <= 1 || var48 <= 1) {
                                        class206.method1483(var39, var51, var35, var48, var56);
                                    } else {
                                        class145.method1097(var48, var39, var58 & 0x3, 5841, class206.field3716, var56, var59 >> 2, var51, var35, true, var55);
                                    }
                                }
                                if (var57 != 0) {
                                    if (var57 == -1) {
                                        var57 = var55;
                                    }
                                    byte var60 = var43[var49][var54];
                                    int var61 = var60 & 0xFC;
                                    if (var61 == 0 || var35 <= 1 || var48 <= 1) {
                                        class206.method1483(var39, var51, var35, var48, var57);
                                    }
                                    class145.method1097(var48, var39, var60 & 0x3, 5841, class206.field3716, var57, var61 >> 2, var51, var35, var56 == 0, 0);
                                }
                            }
                            if (var44[var49] != null) {
                                int var62 = var44[var49][var54] & 0xFF;
                                if (var62 != 0) {
                                    int var63;
                                    if (var35 == 1) {
                                        var63 = var39;
                                    } else {
                                        var63 = var37 - 1;
                                    }
                                    int var64;
                                    if (var48 == 1) {
                                        var64 = var51;
                                    } else {
                                        var64 = var50 - 1;
                                    }
                                    int var65 = 13421772;
                                    if (var62 >= 5 && var62 <= 8 || var62 >= 13 && var62 <= 16 || var62 >= 21 && var62 <= 24 || var62 == 27 || var62 == 28) {
                                        var65 = 13369344;
                                        var62 -= 4;
                                    }
                                    if (var62 == 1) {
                                        class206.method1474(var39, var51, var48, var65);
                                    } else if (var62 == 2) {
                                        class206.method1475(var39, var51, var35, var65);
                                    } else if (var62 == 3) {
                                        class206.method1474(var63, var51, var48, var65);
                                    } else if (var62 == 4) {
                                        class206.method1475(var39, var64, var35, var65);
                                    } else if (var62 == 9) {
                                        class206.method1474(var39, var51, var48, 16777215);
                                        class206.method1475(var39, var51, var35, var65);
                                    } else if (var62 == 10) {
                                        class206.method1474(var63, var51, var48, 16777215);
                                        class206.method1475(var39, var51, var35, var65);
                                    } else if (var62 == 11) {
                                        class206.method1474(var63, var51, var48, 16777215);
                                        class206.method1475(var39, var64, var35, var65);
                                    } else if (var62 == 12) {
                                        class206.method1474(var39, var51, var48, 16777215);
                                        class206.method1475(var39, var64, var35, var65);
                                    } else if (var62 == 17) {
                                        class206.method1475(var39, var51, 1, var65);
                                    } else if (var62 == 18) {
                                        class206.method1475(var63, var51, 1, var65);
                                    } else if (var62 == 19) {
                                        class206.method1475(var63, var64, 1, var65);
                                    } else if (var62 == 20) {
                                        class206.method1475(var39, var64, 1, var65);
                                    } else if (var62 == 25) {
                                        for (int var67 = 0; var67 < var48; var67++) {
                                            class206.method1475(var39 + var67, -var67 + var64, 1, var65);
                                        }
                                    } else if (var62 == 26) {
                                        for (int var66 = 0; var66 < var48; var66++) {
                                            class206.method1475(var39 + var66, var51 + var66, 1, var65);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg10 + var34;
                    int var69 = arg10 + var33;
                    for (int var70 = 0; var70 < var12; var70++) {
                        int var71;
                        if (class253.field4430.field1433 != -1) {
                            var71 = class253.field4430.field1433;
                        } else if ((arg1 + var13 & 0x4) == (arg2 + var70 & 0x4)) {
                            var71 = class231.field4151[class6.field108 + 1];
                        } else {
                            var71 = 4936552;
                        }
                        int var72 = (arg0 * var70 + arg5 >> 16) + arg9;
                        if (var71 == 0) {
                            var71 = 1;
                        }
                        int var73 = (arg5 + ((var70 + 1) * arg0) >> 16) + arg9;
                        int var74 = var73 - var72;
                        class206.method1483(var69, var72, var35, var74, var71);
                    }
                }
            }
        }
        int var14 = -23 / ((arg6 + 37) / 48);
        for (int var15 = -2; var15 < (var11 + 2); var15++) {
            int var16 = arg8 * var15 + arg4 >> 16;
            int var17 = (var15 + 1) * arg8 + arg4 >> 16;
            int var18 = var17 - var16;
            if (var18 > 0) {
                var10000 = arg10 + var17;
                int var20 = arg1 + var15 >> 6;
                int var21 = arg10 + var16;
                if (var20 >= 0 && (class203.field3683.length - 1) >= var20) {
                    short[][] var22 = class203.field3683[var20];
                    for (int var23 = -2; var23 < var12 + 2; var23++) {
                        int var24 = arg0 * var23 + arg5 >> 16;
                        int var25 = (var23 + 1) * arg0 + arg5 >> 16;
                        int var26 = var25 - var24;
                        if (var26 > 0) {
                            int var27 = arg9 + var24;
                            var10000 = arg9 + var25;
                            int var29 = arg2 + var23 >> 6;
                            if (var29 >= 0 && var29 <= (var22.length - 1)) {
                                int var30 = (arg2 + var23 & 0x3F << 6) + (arg1 + var15 & 0x3F);
                                if (var22[var29] != null) {
                                    int var31 = var22[var29][var30] & 0x3FFF;
                                    int var32 = (var22[var29][var30] & 0xC874) >> 14;
                                    if (var31 != 0) {
                                        if (var32 == 0) {
                                            class192.field3511[var31 - 1].method1672(var21, var27, var18 * 2, var26 * 2);
                                        } else if (var32 == 1) {
                                            class55.field924[var31 - 1].method1672(var21, var27, var18 * 2, var26 * 2);
                                        } else if (var32 == 2) {
                                            class125.field2419[var31 - 1].method1672(var21, var27, var18 * 2, var26 * 2);
                                        } else if (var32 == 3) {
                                            class1.field3[var31 - 1].method1672(var21, var27, var18 * 2, var26 * 2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
