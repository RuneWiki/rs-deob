import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class185 extends class254 {

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "Ljava/lang/Object;")
    private Object field3354;

    @OriginalMember(owner = "client!ii", name = "Z", descriptor = "Z")
    public static boolean field3362 = false;

    @OriginalMember(owner = "client!ii", name = "W", descriptor = "Llc;")
    public static class143 field3359 = class66.method374(")4p=", -1);

    @OriginalMember(owner = "client!ii", name = "V", descriptor = "Llc;")
    public static class143 field3358 = class66.method374("settings=", -1);

    @OriginalMember(owner = "client!ii", name = "gb", descriptor = "I")
    public static int field3369 = 0;

    @OriginalMember(owner = "client!ii", name = "X", descriptor = "[I")
    public static int[] field3360 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!ii", name = "Y", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!ii", name = "ab", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!ii", name = "eb", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!ii", name = "fb", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!ii", name = "hb", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!ii", name = "ib", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "Lvg;")
    public static class230 field3356;

    @OriginalMember(owner = "client!ii", name = "db", descriptor = "Lcb;")
    public static class248 field3366;

    @OriginalMember(owner = "client!ii", name = "U", descriptor = "Lgf;")
    public static class7 field3357;

    @OriginalMember(owner = "client!ii", name = "bb", descriptor = "Lgf;")
    public static class7 field3364;

    @OriginalMember(owner = "client!ii", name = "cb", descriptor = "[[I")
    public static int[][] field3365;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljd;Lgf;ILgf;)V")
    public static final void method1206(class121 arg0, class7 arg1, int arg2, class7 arg3) {
        class279.field4923 = arg3;
        if (arg2 != 1) {
            return;
        }
        field3370++;
        class79.field1442 = arg0;
        class257.field4618 = arg1;
        if (class257.field4618 != null) {
            class274.field4877 = class257.field4618.method60(-101, 1);
        }
        if (class279.field4923 != null) {
            class234.field4267 = class279.field4923.method60(-87, 1);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)Z")
    public final boolean method789(boolean arg0) {
        if (!arg0) {
            field3366 = null;
        }
        field3355++;
        return false;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V")
    public static void method1207(byte arg0) {
        field3364 = null;
        field3356 = null;
        if (arg0 != 118) {
            return;
        }
        field3365 = null;
        field3358 = null;
        field3366 = null;
        field3360 = null;
        field3357 = null;
        field3359 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIILqk;IJZ)Z")
    public static final boolean method1208(int arg0, int arg1, int arg2, int arg3, int arg4, class51 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class5.method26(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method790(int arg0) {
        field3371++;
        if (arg0 != 383) {
            field3364 = null;
        }
        return this.field3354;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIIIIB)V")
    public static final void method1209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        field3363++;
        int var11 = arg9 - arg3;
        int var12 = arg4 - arg8;
        if (arg4 < class25.field426) {
            var12++;
        }
        if (class169.field3009 > arg9) {
            var11++;
        }
        if (arg10 != 99) {
            field3358 = null;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var44 = arg2 * var13 + arg5 >> 16;
            int var45 = (var13 + 1) * arg2 + arg5 >> 16;
            int var46 = var45 - var44;
            if (var46 > 0) {
                int var47 = arg3 + var13 >> 6;
                if (var47 >= 0 && var47 <= (class123.field2155.length - 1)) {
                    int var48 = arg6 + var45;
                    int[][] var49 = class123.field2155[var47];
                    int var50 = arg6 + var44;
                    byte[][] var51 = class227.field4101[var47];
                    byte[][] var52 = class35.field612[var47];
                    byte[][] var53 = class10.field201[var47];
                    byte[][] var54 = class20.field327[var47];
                    byte[][] var55 = class39.field678[var47];
                    for (int var56 = 0; var56 < var12; var56++) {
                        int var57 = (var56 + 1) * arg0 + arg1 >> 16;
                        int var58 = arg1 + (arg0 * var56) >> 16;
                        int var59 = var57 - var58;
                        if (var59 > 0) {
                            int var60 = arg8 + var56 >> 6;
                            int var61 = arg7 + var57;
                            int var62 = var13 + arg3 & 0x3F;
                            int var63 = arg7 + var58;
                            int var64 = arg8 + var56 & 0x3F;
                            int var65 = (var64 << 6) + var62;
                            int var66;
                            if (var60 < 0 || var60 > (var49.length - 1) || var49[var60] == null) {
                                if (class135.field2364.field1463 != -1) {
                                    var66 = class135.field2364.field1463;
                                } else if ((arg3 + var13 & 0x4) == (arg8 + var56 & 0x4)) {
                                    var66 = class67.field1270[class95.field1742 + 1];
                                } else {
                                    var66 = 4936552;
                                }
                                if (var60 < 0 || var49.length - 1 < var60) {
                                    if (var66 == 0) {
                                        var66 = 1;
                                    }
                                    class260.method1726(var50, var63, var46, var59, var66);
                                    continue;
                                }
                            } else {
                                var66 = var49[var60][var65];
                            }
                            if (var66 == 0) {
                                var66 = 1;
                            }
                            int var67 = var53[var60] == null ? 0 : class67.field1270[var53[var60][var65] & 0xFF];
                            int var68 = var51[var60] == null ? 0 : class67.field1270[var51[var60][var65] & 0xFF];
                            if (var67 == 0 && var68 == 0) {
                                class260.method1726(var50, var63, var46, var59, var66);
                            } else {
                                if (var67 != 0) {
                                    if (var67 == -1) {
                                        var67 = 1;
                                    }
                                    byte var69 = var52[var60] == null ? 0 : var52[var60][var65];
                                    int var70 = var69 & 0xFC;
                                    if (var70 == 0 || var46 <= 1 || var59 <= 1) {
                                        class260.method1726(var50, var63, var46, var59, var67);
                                    } else {
                                        class217.method1489(true, 73397217, var46, var63, var59, class260.field4651, var70 >> 2, var67, var66, var69 & 0x3, var50);
                                    }
                                }
                                if (var68 != 0) {
                                    byte var71 = var54[var60][var65];
                                    if (var68 == -1) {
                                        var68 = var66;
                                    }
                                    int var72 = var71 & 0xFC;
                                    if (var72 == 0 || var46 <= 1 || var59 <= 1) {
                                        class260.method1726(var50, var63, var46, var59, var68);
                                    }
                                    class217.method1489(var67 == 0, arg10 ^ 0x45FF382, var46, var63, var59, class260.field4651, var72 >> 2, var68, 0, var71 & 0x3, var50);
                                }
                            }
                            if (var55[var60] != null) {
                                int var73 = var55[var60][var65] & 0xFF;
                                if (var73 != 0) {
                                    int var74;
                                    if (var46 == 1) {
                                        var74 = var50;
                                    } else {
                                        var74 = var48 - 1;
                                    }
                                    int var75 = 13421772;
                                    int var76;
                                    if (var59 == 1) {
                                        var76 = var63;
                                    } else {
                                        var76 = var61 - 1;
                                    }
                                    if (var73 >= 5 && var73 <= 8 || var73 >= 13 && var73 <= 16 || var73 >= 21 && var73 <= 24 || var73 == 27 || var73 == 28) {
                                        var75 = 13369344;
                                        var73 -= 4;
                                    }
                                    if (var73 == 1) {
                                        class260.method1735(var50, var63, var59, var75);
                                    } else if (var73 == 2) {
                                        class260.method1715(var50, var63, var46, var75);
                                    } else if (var73 == 3) {
                                        class260.method1735(var74, var63, var59, var75);
                                    } else if (var73 == 4) {
                                        class260.method1715(var50, var76, var46, var75);
                                    } else if (var73 == 9) {
                                        class260.method1735(var50, var63, var59, 16777215);
                                        class260.method1715(var50, var63, var46, var75);
                                    } else if (var73 == 10) {
                                        class260.method1735(var74, var63, var59, 16777215);
                                        class260.method1715(var50, var63, var46, var75);
                                    } else if (var73 == 11) {
                                        class260.method1735(var74, var63, var59, 16777215);
                                        class260.method1715(var50, var76, var46, var75);
                                    } else if (var73 == 12) {
                                        class260.method1735(var50, var63, var59, 16777215);
                                        class260.method1715(var50, var76, var46, var75);
                                    } else if (var73 == 17) {
                                        class260.method1715(var50, var63, 1, var75);
                                    } else if (var73 == 18) {
                                        class260.method1715(var74, var63, 1, var75);
                                    } else if (var73 == 19) {
                                        class260.method1715(var74, var76, 1, var75);
                                    } else if (var73 == 20) {
                                        class260.method1715(var50, var76, 1, var75);
                                    } else if (var73 == 25) {
                                        for (int var78 = 0; var78 < var59; var78++) {
                                            class260.method1715(var50 + var78, var76 - var78, 1, var75);
                                        }
                                    } else if (var73 == 26) {
                                        for (int var77 = 0; var77 < var59; var77++) {
                                            class260.method1715(var50 + var77, var63 - -var77, 1, var75);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var79 = arg6 + var44;
                    for (int var80 = 0; var80 < var12; var80++) {
                        int var82 = ((var80 + 1) * arg0 + arg1 >> 16) + arg7;
                        int var83;
                        if (class135.field2364.field1463 != -1) {
                            var83 = class135.field2364.field1463;
                        } else if ((arg3 + var13 & 0x4) == (arg8 + var80 & 0x4)) {
                            var83 = class67.field1270[class95.field1742 + 1];
                        } else {
                            var83 = 4936552;
                        }
                        int var84 = (arg0 * var80 + arg1 >> 16) + arg7;
                        if (var83 == 0) {
                            var83 = 1;
                        }
                        int var85 = var82 - var84;
                        class260.method1726(var79, var84, var46, var85, var83);
                    }
                    var10000 = arg6 + var45;
                }
            }
        }
        for (int var14 = -2; var14 < var11 + 2; var14++) {
            int var15 = arg5 + ((var14 + 1) * arg2) >> 16;
            int var16 = arg2 * var14 + arg5 >> 16;
            int var17 = var15 - var16;
            if (var17 > 0) {
                var10000 = arg6 + var15;
                int var19 = arg3 + var14 >> 6;
                int var20 = arg6 + var16;
                if (var19 >= 0 && var19 <= (class118.field2099.length - 1)) {
                    short[][] var21 = class118.field2099[var19];
                    for (int var22 = -2; var22 < (var12 + 2); var22++) {
                        int var23 = arg1 + ((var22 + 1) * arg0) >> 16;
                        int var24 = arg0 * var22 + arg1 >> 16;
                        int var25 = var23 - var24;
                        if (var25 > 0) {
                            var10000 = arg7 + var23;
                            int var27 = arg8 + var22 >> 6;
                            int var28 = arg7 + var24;
                            if (var27 >= 0 && var27 <= (var21.length - 1)) {
                                int var29 = (arg8 + var22 & 0x3F << 6) + (arg3 + var14 & 0x3F);
                                if (var21[var27] != null) {
                                    int var30 = var21[var27][var29] & 0x3FFF;
                                    int var31 = (var21[var27][var29] & 0xDA10) >> 14;
                                    if (var30 != 0) {
                                        if (var31 == 0) {
                                            int var32 = class187.field3387[var30 - 1].field3935 * var25 / 4;
                                            int var33 = class187.field3387[var30 - 1].field3939 * var17 / 4;
                                            if (var33 != 0 && var32 != 0) {
                                                int var34 = class187.field3387[var30 - 1].field3936 * var25 / 4;
                                                class187.field3387[var30 - 1].method590(var20, var28 - var34, var33, var32);
                                            }
                                        } else if (var31 == 1) {
                                            int var35 = class16.field282[var30 - 1].field3939 * var17 / 4;
                                            int var36 = class16.field282[var30 - 1].field3935 * var25 / 4;
                                            if (var35 != 0 && var36 != 0) {
                                                int var37 = class16.field282[var30 - 1].field3936 * var25 / 4;
                                                class16.field282[var30 - 1].method590(var20, var28 - var37, var35, var36);
                                            }
                                        } else if (var31 == 2) {
                                            int var41 = class187.field3394[var30 - 1].field3935 * var25 / 4;
                                            int var42 = class187.field3394[var30 - 1].field3939 * var17 / 4;
                                            if (var42 != 0 && var41 != 0) {
                                                int var43 = class187.field3394[var30 - 1].field3936 * var25 / 4;
                                                class187.field3394[var30 - 1].method590(var20, var28 - var43, var42, var41);
                                            }
                                        } else if (var31 == 3) {
                                            int var38 = class179.field3205[var30 - 1].field3939 * var17 / 4;
                                            int var39 = class179.field3205[var30 - 1].field3935 * var25 / 4;
                                            if (var38 != 0 && var39 != 0) {
                                                int var40 = class179.field3205[var30 - 1].field3936 * var25 / 4;
                                                class179.field3205[var30 - 1].method590(var20, var28 - var40, var38, var39);
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

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1210(int arg0, byte[] arg1) {
        field3361++;
        class190 var2 = new class190(arg1);
        int var3 = var2.method1265(120);
        int var4 = var2.method1269(105);
        if (arg0 < ~var4 || !(class126.field2234 == 0 || var4 <= class126.field2234)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1258(0, var5, (byte) -119, var4);
            return var5;
        } else {
            int var6 = var2.method1269(124);
            if (var6 < 0 || class126.field2234 != 0 && var6 > class126.field2234) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class98.method575(var7, var6, arg1, var4, 9);
            } else {
                class27.field449.method728(false, var7, var2);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class185(Object arg0) {
        this.field3354 = arg0;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)Lvh;")
    public static final class43 method1211(int arg0, int arg1, int arg2) {
        field3368++;
        class43 var3 = class27.method186(1341, arg1);
        if (arg2 == -1) {
            return var3;
        } else {
            if (arg0 >= -31) {
                method1212(-40);
            }
            return var3 == null || var3.field885 == null || arg2 >= var3.field885.length ? null : var3.field885[arg2];
        }
    }

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "(I)V")
    public static final void method1212(int arg0) {
        class62 var1 = (class62) class59.field1139.method1294(false);
        if (arg0 != 1) {
            method1210(-67, (byte[]) null);
        }
        field3367++;
        while (var1 != null) {
            class24 var2 = var1.field1170;
            if (class170.field3044 != var2.field390 || var2.field408) {
                var1.method349(0);
            } else if (class146.field2635 >= var2.field393) {
                var2.method171(0, class128.field2252);
                if (var2.field408) {
                    var1.method349(0);
                } else {
                    method1208(var2.field390, var2.field412, var2.field395, var2.field403, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class62) class59.field1139.method1292((byte) 49);
        }
    }
}
