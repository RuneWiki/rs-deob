import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class79 {

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public int field1427;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "Leb;")
    public static class230 field1438 = class68.method589(0, "scrollbar");

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "[[[B")
    public static byte[][][] field1435 = new byte[4][104][104];

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public int field1424;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public int field1426;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    public int field1447;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "Lof;")
    public class254 field1442;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "[I")
    public int[] field1425;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "[I")
    public int[] field1429;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "[I")
    public int[] field1432;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "[I")
    public int[] field1433;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "[I")
    public int[] field1443;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "[I")
    public int[] field1448;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "[Lof;")
    public class254[] field1444;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "[[I")
    public int[][] field1430;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "[[I")
    public int[][] field1434;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IBI)V")
    public static final void method654(int arg0, byte arg1, int arg2) {
        field1437++;
        if (class186.field3266 < 2 && class196.field3513 == 0 && !class184.field3231) {
            return;
        }
        class230 var3;
        if (class196.field3513 == 1 && class186.field3266 < 2) {
            var3 = class173.method1267((byte) 59, new class230[] { class275.field4832, client.field2721, class153.field2730, class9.field154 });
        } else if (class184.field3231 && class186.field3266 < 2) {
            var3 = class173.method1267((byte) 59, new class230[] { class68.field1275, client.field2721, class44.field792, class9.field154 });
        } else {
            var3 = class158.method1201(false, class186.field3266 - 1);
        }
        if (class186.field3266 > 2) {
            var3 = class173.method1267((byte) 59, new class230[] { var3, class30.field560, class37.method340(class186.field3266 - 2, (byte) -26), class169.field2991 });
        }
        if (arg1 < -59) {
            int var4 = class76.field1382.method782(var3, arg2 + 4, arg0 + 15, 16777215, 0, class21.field425, class163.field2904);
            class14.method149(15, arg2 + 4, arg0, -14160, var4 + class76.field1382.method783(var3));
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIIIIIIB)V")
    public static final void method655(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        field1428++;
        int var11 = arg5 - arg3;
        if (arg5 < class237.field4094) {
            var11++;
        }
        int var12 = arg2 - arg6;
        if (class249.field4417 > arg2) {
            var12++;
        }
        if (arg10 >= -41) {
            method655(95, -11, -97, -115, -105, 123, 18, 111, 61, 59, (byte) -19);
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var44 = arg8 * var13 + arg0 >> 16;
            int var45 = (var13 + 1) * arg8 + arg0 >> 16;
            int var46 = var45 - var44;
            if (var46 > 0) {
                int var47 = arg3 + var13 >> 6;
                if (var47 >= 0 && class84.field1487.length - 1 >= var47) {
                    int var48 = arg1 + var45;
                    int var49 = arg1 + var44;
                    int[][] var50 = class84.field1487[var47];
                    byte[][] var51 = class229.field3949[var47];
                    byte[][] var52 = class54.field940[var47];
                    byte[][] var53 = class243.field4164[var47];
                    byte[][] var54 = class169.field2990[var47];
                    byte[][] var55 = class114.field2041[var47];
                    for (int var56 = 0; var56 < var12; var56++) {
                        int var57 = arg9 * var56 + arg7 >> 16;
                        int var58 = arg7 + ((var56 + 1) * arg9) >> 16;
                        int var59 = var58 - var57;
                        if (var59 > 0) {
                            int var60 = arg4 + var57;
                            int var61 = arg4 + var58;
                            int var62 = arg6 + var56 >> 6;
                            int var63 = arg6 + var56 & 0x3F;
                            int var64 = arg3 + var13 & 0x3F;
                            int var65 = (var63 << 6) + var64;
                            int var66;
                            if (var62 < 0 || var62 > var50.length - 1 || var50[var62] == null) {
                                if (class125.field2192.field3326 != -1) {
                                    var66 = class125.field2192.field3326;
                                } else if ((var13 + arg3 & 0x4) == (arg6 + var56 & 0x4)) {
                                    var66 = class28.field519[class275.field4834 + 1];
                                } else {
                                    var66 = 4936552;
                                }
                                if (var62 < 0 || var62 > (var50.length - 1)) {
                                    if (var66 == 0) {
                                        var66 = 1;
                                    }
                                    class87.method705(var49, var60, var46, var59, var66);
                                    continue;
                                }
                            } else {
                                var66 = var50[var62][var65];
                            }
                            if (var66 == 0) {
                                var66 = 1;
                            }
                            int var67 = var52[var62] == null ? 0 : class28.field519[var52[var62][var65] & 0xFF];
                            int var68 = var51[var62] == null ? 0 : class28.field519[var51[var62][var65] & 0xFF];
                            if (var68 == 0 && var67 == 0) {
                                class87.method705(var49, var60, var46, var59, var66);
                            } else {
                                if (var68 != 0) {
                                    if (var68 == -1) {
                                        var68 = 1;
                                    }
                                    byte var69 = var53[var62] == null ? 0 : var53[var62][var65];
                                    int var70 = var69 & 0xFC;
                                    if (var70 == 0 || var46 <= 1 || var59 <= 1) {
                                        class87.method705(var49, var60, var46, var59, var68);
                                    } else {
                                        class191.method1360(var59, 20513, true, var46, var70 >> 2, var68, var69 & 0x3, var49, class87.field1516, var60, var66);
                                    }
                                }
                                if (var67 != 0) {
                                    byte var71 = var54[var62][var65];
                                    if (var67 == -1) {
                                        var67 = var66;
                                    }
                                    int var72 = var71 & 0xFC;
                                    if (var72 == 0 || var46 <= 1 || var59 <= 1) {
                                        class87.method705(var49, var60, var46, var59, var67);
                                    }
                                    class191.method1360(var59, 20513, var68 == 0, var46, var72 >> 2, var67, var71 & 0x3, var49, class87.field1516, var60, 0);
                                }
                            }
                            if (var55[var62] != null) {
                                int var73 = var55[var62][var65] & 0xFF;
                                if (var73 != 0) {
                                    int var74;
                                    if (var46 == 1) {
                                        var74 = var49;
                                    } else {
                                        var74 = var48 - 1;
                                    }
                                    int var75;
                                    if (var59 == 1) {
                                        var75 = var60;
                                    } else {
                                        var75 = var61 - 1;
                                    }
                                    int var76 = 13421772;
                                    if (var73 >= 5 && var73 <= 8 || var73 >= 13 && var73 <= 16 || var73 >= 21 && var73 <= 24 || var73 == 27 || var73 == 28) {
                                        var73 -= 4;
                                        var76 = 13369344;
                                    }
                                    if (var73 == 1) {
                                        class87.method711(var49, var60, var59, var76);
                                    } else if (var73 == 2) {
                                        class87.method709(var49, var60, var46, var76);
                                    } else if (var73 == 3) {
                                        class87.method711(var74, var60, var59, var76);
                                    } else if (var73 == 4) {
                                        class87.method709(var49, var75, var46, var76);
                                    } else if (var73 == 9) {
                                        class87.method711(var49, var60, var59, 16777215);
                                        class87.method709(var49, var60, var46, var76);
                                    } else if (var73 == 10) {
                                        class87.method711(var74, var60, var59, 16777215);
                                        class87.method709(var49, var60, var46, var76);
                                    } else if (var73 == 11) {
                                        class87.method711(var74, var60, var59, 16777215);
                                        class87.method709(var49, var75, var46, var76);
                                    } else if (var73 == 12) {
                                        class87.method711(var49, var60, var59, 16777215);
                                        class87.method709(var49, var75, var46, var76);
                                    } else if (var73 == 17) {
                                        class87.method709(var49, var60, 1, var76);
                                    } else if (var73 == 18) {
                                        class87.method709(var74, var60, 1, var76);
                                    } else if (var73 == 19) {
                                        class87.method709(var74, var75, 1, var76);
                                    } else if (var73 == 20) {
                                        class87.method709(var49, var75, 1, var76);
                                    } else if (var73 == 25) {
                                        for (int var77 = 0; var77 < var59; var77++) {
                                            class87.method709(var49 + var77, var75 - var77, 1, var76);
                                        }
                                    } else if (var73 == 26) {
                                        for (int var78 = 0; var78 < var59; var78++) {
                                            class87.method709(var49 + var78, var60 + var78, 1, var76);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg1 + var45;
                    int var80 = arg1 + var44;
                    for (int var81 = 0; var81 < var12; var81++) {
                        int var82 = ((var81 + 1) * arg9 + arg7 >> 16) + arg4;
                        int var83;
                        if (class125.field2192.field3326 != -1) {
                            var83 = class125.field2192.field3326;
                        } else if ((var81 + arg6 & 0x4) == (arg3 + var13 & 0x4)) {
                            var83 = class28.field519[class275.field4834 + 1];
                        } else {
                            var83 = 4936552;
                        }
                        int var84 = (arg9 * var81 + arg7 >> 16) + arg4;
                        int var85 = var82 - var84;
                        if (var83 == 0) {
                            var83 = 1;
                        }
                        class87.method705(var80, var84, var46, var85, var83);
                    }
                }
            }
        }
        for (int var14 = -2; var14 < var11 + 2; var14++) {
            int var15 = arg0 + ((var14 + 1) * arg8) >> 16;
            int var16 = arg0 + (arg8 * var14) >> 16;
            int var17 = var15 - var16;
            if (var17 > 0) {
                int var18 = arg1 + var16;
                int var19 = arg3 + var14 >> 6;
                var10000 = arg1 + var15;
                if (var19 >= 0 && class168.field2977.length - 1 >= var19) {
                    short[][] var21 = class168.field2977[var19];
                    for (int var22 = -2; var22 < var12 + 2; var22++) {
                        int var23 = (var22 + 1) * arg9 + arg7 >> 16;
                        int var24 = arg9 * var22 + arg7 >> 16;
                        int var25 = var23 - var24;
                        if (var25 > 0) {
                            int var26 = arg4 + var24;
                            var10000 = arg4 + var23;
                            int var28 = var22 + arg6 >> 6;
                            if (var28 >= 0 && var28 <= (var21.length - 1)) {
                                int var29 = ((var22 + arg6 & 0x3F) << 6) + (arg3 + var14 & 0x3F);
                                if (var21[var28] != null) {
                                    int var30 = (var21[var28][var29] & 0xF1B2) >> 14;
                                    int var31 = var21[var28][var29] & 0x3FFF;
                                    if (var31 != 0) {
                                        if (var30 == 0) {
                                            int var32 = class97.field1740[var31 - 1].field871 * var17 / 4;
                                            int var33 = class97.field1740[var31 - 1].field858 * var25 / 4;
                                            int var34 = class97.field1740[var31 - 1].field867 * var25 / 4;
                                            class97.field1740[var31 - 1].method597(var18, var26 - var34, var32, var33);
                                        } else if (var30 == 1) {
                                            int var41 = class103.field1890[var31 - 1].field871 * var17 / 4;
                                            int var42 = class103.field1890[var31 - 1].field867 * var25 / 4;
                                            int var43 = class103.field1890[var31 - 1].field858 * var25 / 4;
                                            class103.field1890[var31 - 1].method597(var18, var26 - var42, var41, var43);
                                        } else if (var30 == 2) {
                                            int var35 = class130.field2343[var31 - 1].field871 * var17 / 4;
                                            int var36 = class130.field2343[var31 - 1].field867 * var25 / 4;
                                            int var37 = class130.field2343[var31 - 1].field858 * var25 / 4;
                                            class130.field2343[var31 - 1].method597(var18, var26 - var36, var35, var37);
                                        } else if (var30 == 3) {
                                            int var38 = class101.field1857[var31 - 1].field871 * var17 / 4;
                                            int var39 = class101.field1857[var31 - 1].field858 * var25 / 4;
                                            int var40 = class101.field1857[var31 - 1].field867 * var25 / 4;
                                            class101.field1857[var31 - 1].method597(var18, var26 - var40, var38, var39);
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

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static void method656(int arg0) {
        field1438 = null;
        if (arg0 != 16777215) {
            field1446 = -36;
        }
        field1435 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[B)V")
    private final void method657(int arg0, byte[] arg1) {
        if (arg0 != 2) {
            field1446 = -20;
        }
        class14 var3 = new class14(class5.method54(arg1, (byte) -123));
        field1440++;
        int var4 = var3.method200(255);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field1424 = var3.method187((byte) 61);
        } else {
            this.field1424 = 0;
        }
        int var5 = 0;
        int var6 = -1;
        int var7 = var3.method200(255);
        this.field1447 = var3.method161(4);
        this.field1448 = new int[this.field1447];
        for (int var8 = 0; var8 < this.field1447; var8++) {
            this.field1448[var8] = var5 += var3.method161(4);
            if (this.field1448[var8] > var6) {
                var6 = this.field1448[var8];
            }
        }
        this.field1426 = var6 + 1;
        this.field1425 = new int[this.field1426];
        this.field1433 = new int[this.field1426];
        this.field1430 = new int[this.field1426][];
        this.field1443 = new int[this.field1426];
        this.field1429 = new int[this.field1426];
        if (var7 != 0) {
            this.field1432 = new int[this.field1426];
            for (int var9 = 0; var9 < this.field1426; var9++) {
                this.field1432[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1447; var10++) {
                this.field1432[this.field1448[var10]] = var3.method187((byte) 61);
            }
            this.field1442 = new class254(this.field1432);
        }
        for (int var11 = 0; var11 < this.field1447; var11++) {
            this.field1425[this.field1448[var11]] = var3.method187((byte) 61);
        }
        for (int var12 = 0; var12 < this.field1447; var12++) {
            this.field1443[this.field1448[var12]] = var3.method187((byte) 61);
        }
        for (int var13 = 0; var13 < this.field1447; var13++) {
            this.field1433[this.field1448[var13]] = var3.method161(4);
        }
        for (int var14 = 0; var14 < this.field1447; var14++) {
            int var21 = 0;
            int var22 = this.field1448[var14];
            int var23 = this.field1433[var22];
            this.field1430[var22] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field1430[var22][var25] = var21 += var3.method161(4);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field1429[var22] = var24 + 1;
            if (var24 + 1 == var23) {
                this.field1430[var22] = null;
            }
        }
        if (var7 == 0) {
            return;
        }
        this.field1434 = new int[var6 + 1][];
        this.field1444 = new class254[var6 + 1];
        for (int var15 = 0; var15 < this.field1447; var15++) {
            int var16 = this.field1448[var15];
            int var17 = this.field1433[var16];
            this.field1434[var16] = new int[this.field1429[var16]];
            for (int var18 = 0; var18 < this.field1429[var16]; var18++) {
                this.field1434[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field1430[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field1430[var16][var19];
                }
                this.field1434[var16][var20] = var3.method187((byte) 61);
            }
            this.field1444[var16] = new class254(this.field1434[var16]);
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "([BI)V")
    public class79(byte[] arg0, int arg1) {
        this.field1427 = class124.method969(arg0.length, arg0, (byte) -15);
        if (this.field1427 != arg1) {
            throw new RuntimeException();
        }
        this.method657(2, arg0);
    }
}
