import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class107 extends class70 {

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "I")
    public int field1940 = -1;

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "I")
    public int field1951 = 0;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "[S")
    public static short[] field1938 = new short[500];

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
    public int field1936;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
    public int field1939;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
    public int field1941;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "I")
    public int field1942;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
    public int field1944;

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "I")
    public int field1947;

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "I")
    public int field1948;

    @OriginalMember(owner = "client!uo", name = "x", descriptor = "I")
    public int field1949;

    @OriginalMember(owner = "client!uo", name = "y", descriptor = "I")
    public int field1950;

    @OriginalMember(owner = "client!uo", name = "A", descriptor = "I")
    public int field1952;

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "Lek;")
    public static class206 field1946;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "[I")
    public static int[] field1937;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)V", line = 10)
    public static void method791(byte arg0) {
        field1937 = null;
        field1938 = null;
        field1946 = null;
        if (arg0 < 46) {
            field1938 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)Ltd;", line = 22)
    public static final class267 method792(int arg0, int arg1, int arg2) {
        class312 var3 = class353.field5644[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class267 var4 = var3.field5080;
            var3.field5080 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIBII)V", line = 50)
    public static final void method793(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (class222.field3674 == 0) {
            int var7 = class7.field264;
            int var8 = class349.field5587;
            int var9 = class349.field5581;
            int var10 = class22.field559;
            int var11 = (arg3 - arg6) * (var9 - var10) / arg5 + var10;
            int var12 = (arg0 - arg1) * (var7 - var8) / arg2 + var8;
            if (class52.field1046 && (class332.field5295 & 0x40) != 0) {
                class181 var13 = class204.method1392(class119.field2126, 1, class354.field5650);
                if (var13 == null) {
                    class266.method1865(-1);
                } else {
                    class358.method2530(" ->", 0L, var12, (short) 25, false, class112.field2047, var11, class13.field397);
                }
            } else {
                if (class141.field2383 == 1) {
                    class358.method2530("", 0L, var12, (short) 35, false, class338.field5354, var11, -1);
                }
                class99.field1813++;
                class358.method2530("", 0L, var12, (short) 31, false, class216.field3608, var11, -1);
            }
        }
        field1945++;
        long var14 = -1L;
        if (arg4 >= -96) {
            method791((byte) -123);
        }
        for (int var16 = 0; var16 < class99.field1817; var16++) {
            long var17 = class5.field111[var16];
            int var19 = ((int) var17 & 0x3FD9) >> 7;
            int var20 = (int) var17 >> 29 & 0x3;
            int var21 = (int) var17 & 0x7F;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                var14 = var17;
                if (var20 == 2 && class235.method1635(class276.field4506, var21, var19, var17)) {
                    class238 var23 = class1.method7(var22, 25);
                    if (var23.field3937 != null) {
                        var23 = var23.method1651(41);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class222.field3674 == 1) {
                        class358.method2530(class147.field2511 + " -> <col=00ffff>" + var23.field3950, var17, var19, (short) 36, false, class363.field5744, var21, class284.field4642);
                        class289.field4706++;
                    } else if (class52.field1046) {
                        class321 var24 = class143.field2415 == -1 ? null : class346.method2467(class143.field2415, 11);
                        if ((class332.field5295 & 0x4) != 0 && (var24 == null || var23.method1664(0, class143.field2415, var24.field5223) != var24.field5223)) {
                            class358.method2530(class10.field287 + " -> <col=00ffff>" + var23.field3950, var17, var19, (short) 2, false, class112.field2047, var21, class13.field397);
                            class57.field1120++;
                        }
                    } else {
                        class96.field1747++;
                        String[] var25 = var23.field3948;
                        if (class178.field2940) {
                            var25 = class195.method1345(0, var25);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    class352.field5623++;
                                    int var27 = -1;
                                    short var28 = 0;
                                    if (var23.field3909 == var26) {
                                        var27 = var23.field3912;
                                    }
                                    if (var23.field3921 == var26) {
                                        var27 = var23.field3897;
                                    }
                                    if (var26 == 0) {
                                        var28 = 5;
                                    }
                                    if (var26 == 1) {
                                        var28 = 10;
                                    }
                                    if (var26 == 2) {
                                        var28 = 28;
                                    }
                                    if (var26 == 3) {
                                        var28 = 3;
                                    }
                                    if (var26 == 4) {
                                        var28 = 1007;
                                    }
                                    class358.method2530("<col=00ffff>" + var23.field3950, var17, var19, var28, false, var25[var26], var21, var27);
                                }
                            }
                        }
                        class358.method2530("<col=00ffff>" + var23.field3950, (long) var23.field3896, var19, (short) 1012, false, class21.field547, var21, class153.field2624);
                    }
                }
                if (var20 == 1) {
                    class314 var29 = class149.field2533[var22];
                    if ((var29.field5107.field1565 & 0x1) == 0 && (var29.field199 & 0x7F) == 0 && (var29.field213 & 0x7F) == 0 || (var29.field5107.field1565 & 0x1) == 1 && (var29.field199 & 0x7F) == 64 && (var29.field213 & 0x7F) == 64) {
                        int var30 = var29.field199 - (var29.field5107.field1565 << 6);
                        int var31 = var29.field213 - (var29.field5107.field1565 << 6);
                        int var32 = var29.field5107.field1565 << 7;
                        if (class162.field2721) {
                            for (int var33 = 0; var33 < class255.field4184; var33++) {
                                class314 var34 = class149.field2533[class23.field570[var33]];
                                if (var34 != null && !var34.field154 && var29 != var34 && var34.field193) {
                                    int var35 = var34.field199 - (var34.field5107.field1565 << 6);
                                    int var36 = var34.field5107.field1565 << 7;
                                    int var37 = var34.field213 - (var34.field5107.field1565 << 6);
                                    if (class181.method1280(var35, var32, var36, var31, var32, var37, var36, 11999, var30)) {
                                        class41.method317(127, class23.field570[var33], var21, var34.field5107, var19);
                                        var34.field154 = true;
                                    }
                                }
                            }
                            for (int var38 = 0; var38 < class252.field4144; var38++) {
                                class98 var39 = class182.field3151[class22.field556[var38]];
                                if (var39 != null && !var39.field154 && var39.field193) {
                                    int var40 = var39.field199 - (var39.method49((byte) -109) << 6);
                                    int var41 = var39.field213 - (var39.method49((byte) 105) << 6);
                                    int var42 = var39.method49((byte) -83) << 7;
                                    if (class181.method1280(var40, var32, var42, var31, var32, var41, var42, 11999, var30)) {
                                        class155.method1101(102, class22.field556[var38], var21, var19, var39);
                                        var39.field154 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (var29.field154) {
                        continue;
                    }
                    class41.method317(24, var22, var21, var29.field5107, var19);
                    var29.field154 = true;
                }
                if (var20 == 0) {
                    class98 var43 = class182.field3151[var22];
                    if ((var43.field199 & 0x7F) == 64 && (var43.field213 & 0x7F) == 64) {
                        int var44 = var43.field199 - (var43.method49((byte) -122) << 6);
                        int var45 = var43.field213 - (var43.method49((byte) 53) << 6);
                        int var46 = var43.method49((byte) 97) << 7;
                        if (class162.field2721) {
                            for (int var47 = 0; var47 < class255.field4184; var47++) {
                                class314 var48 = class149.field2533[class23.field570[var47]];
                                if (var48 != null && !var48.field154 && var48.field193) {
                                    int var49 = var48.field199 - (var48.field5107.field1565 << 6);
                                    int var50 = var48.field213 - (var48.field5107.field1565 << 6);
                                    int var51 = var48.field5107.field1565 << 7;
                                    if (class181.method1280(var49, var46, var51, var45, var46, var50, var51, 11999, var44)) {
                                        class41.method317(101, class23.field570[var47], var21, var48.field5107, var19);
                                        var48.field154 = true;
                                    }
                                }
                            }
                            for (int var52 = 0; var52 < class252.field4144; var52++) {
                                class98 var53 = class182.field3151[class22.field556[var52]];
                                if (var53 != null && !var53.field154 && var43 != var53 && var53.field193) {
                                    int var54 = var53.field199 - (var53.method49((byte) 119) << 6);
                                    int var55 = var53.field213 - (var53.method49((byte) -76) << 6);
                                    int var56 = var53.method49((byte) 81) << 7;
                                    if (class181.method1280(var54, var46, var56, var45, var46, var55, var56, 11999, var44)) {
                                        class155.method1101(59, class22.field556[var52], var21, var19, var53);
                                        var53.field154 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (var43.field154) {
                        continue;
                    }
                    class155.method1101(89, var22, var21, var19, var43);
                    var43.field154 = true;
                }
                if (var20 == 3) {
                    class49 var57 = class99.field1810[class276.field4506][var21][var19];
                    if (var57 != null) {
                        for (class167 var58 = (class167) var57.method429(-75); var58 != null; var58 = (class167) var57.method436(true)) {
                            int var59 = var58.field2787.field5749;
                            class11 var60 = class296.method2124(0, var59);
                            if (class222.field3674 == 1) {
                                class312.field5073++;
                                class358.method2530(class147.field2511 + " -> <col=ff9040>" + var60.field318, (long) var59, var19, (short) 24, false, class363.field5744, var21, class284.field4642);
                            } else if (class52.field1046) {
                                class321 var65 = class143.field2415 == -1 ? null : class346.method2467(class143.field2415, 11);
                                if ((class332.field5295 & 0x1) != 0 && (var65 == null || var60.method114(-129, class143.field2415, var65.field5223) != var65.field5223)) {
                                    class358.method2530(class10.field287 + " -> <col=ff9040>" + var60.field318, (long) var59, var19, (short) 39, false, class112.field2047, var21, class13.field397);
                                    class65.field1231++;
                                }
                            } else {
                                class223.field3685++;
                                String[] var61 = var60.field334;
                                if (class178.field2940) {
                                    var61 = class195.method1345(0, var61);
                                }
                                for (int var62 = 4; var62 >= 0; var62--) {
                                    if (var61 != null && var61[var62] != null) {
                                        byte var63 = 0;
                                        class202.field3386++;
                                        if (var62 == 0) {
                                            var63 = 1;
                                        }
                                        if (var62 == 1) {
                                            var63 = 18;
                                        }
                                        int var64 = -1;
                                        if (var62 == 2) {
                                            var63 = 59;
                                        }
                                        if (var62 == 3) {
                                            var63 = 42;
                                        }
                                        if (var62 == 4) {
                                            var63 = 15;
                                        }
                                        if (var60.field297 == var62) {
                                            var64 = var60.field337;
                                        }
                                        if (var60.field326 == var62) {
                                            var64 = var60.field312;
                                        }
                                        class358.method2530("<col=ff9040>" + var60.field318, (long) var59, var19, var63, false, var61[var62], var21, var64);
                                    }
                                }
                                class358.method2530("<col=ff9040>" + var60.field318, (long) var59, var19, (short) 1002, false, class21.field547, var21, class153.field2624);
                            }
                        }
                    }
                }
            }
        }
    }
}
