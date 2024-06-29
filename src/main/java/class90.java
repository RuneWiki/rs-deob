import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class90 extends class29 {

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "[Ldh;")
    public class180[] field1377;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
    public static int field1372 = 3353893;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    public static int field1368 = 0;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "I")
    public static int field1378 = -1;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "Lel;")
    public static class128 field1373;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "Lok;")
    public static class160 field1374;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "[[[B")
    public static byte[][][] field1370;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIBIIIII)V", line = 6)
    public static final void method647(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1369++;
        int var11 = 32 / ((arg5 + 2) / 40);
        int var12 = arg10 - arg9;
        if (arg10 < class240.field3815) {
            var12++;
        }
        int var13 = arg0 - arg1;
        if (arg0 < class331.field5158) {
            var13++;
        }
        int var10000;
        for (int var14 = 0; var14 < var12; var14++) {
            int var15 = arg7 * var14 + arg3 >> 16;
            int var16 = arg3 + ((var14 + 1) * arg7) >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = var14 + arg9 >> 6;
                if (var18 >= 0 && var18 <= class308.field4814.length - 1) {
                    int var19 = arg2 + var16;
                    int[][] var20 = class308.field4814[var18];
                    byte[][] var21 = class41.field578[var18];
                    byte[][] var22 = class334.field5185[var18];
                    byte[][] var23 = class325.field5074[var18];
                    int var24 = arg2 + var15;
                    byte[][] var25 = class145.field2163[var18];
                    byte[][] var26 = class16.field210[var18];
                    for (int var27 = 0; var27 < var13; var27++) {
                        int var28 = (var27 + 1) * arg4 + arg8 >> 16;
                        int var29 = arg4 * var27 + arg8 >> 16;
                        int var30 = var28 - var29;
                        if (var30 > 0) {
                            int var31 = arg6 + var28;
                            int var32 = var27 + arg1 >> 6;
                            int var33 = arg1 + var27 & 0x3F;
                            int var34 = arg6 + var29;
                            int var35 = arg9 + var14 & 0x3F;
                            int var36 = (var33 << 6) + var35;
                            int var37;
                            if (var32 < 0 || var32 > var20.length - 1 || var20[var32] == null) {
                                if (class124.field1855.field4934 != -1) {
                                    var37 = class124.field1855.field4934;
                                } else if ((arg1 + var27 & 0x4) == (arg9 + var14 & 0x4)) {
                                    var37 = class209.field3423[class5.field59 + 1];
                                } else {
                                    var37 = 4936552;
                                }
                                if (var32 < 0 || var20.length - 1 < var32) {
                                    if (var37 == 0) {
                                        var37 = 1;
                                    }
                                    class216.method1573(var24, var34, var17, var30, var37);
                                    continue;
                                }
                            } else {
                                var37 = var20[var32][var36];
                            }
                            int var38 = var25[var32] == null ? 0 : class209.field3423[var25[var32][var36] & 0xFF];
                            int var39 = var26[var32] == null ? 0 : class209.field3423[var26[var32][var36] & 0xFF];
                            if (var37 == 0) {
                                var37 = 1;
                            }
                            if (var38 == 0 && var39 == 0) {
                                class216.method1573(var24, var34, var17, var30, var37);
                            } else {
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = 1;
                                    }
                                    byte var40 = var21[var32] == null ? 0 : var21[var32][var36];
                                    int var41 = var40 & 0xFC;
                                    if (var41 == 0 || var17 <= 1 || var30 <= 1) {
                                        class216.method1573(var24, var34, var17, var30, var38);
                                    } else {
                                        class202.method1474(var38, var34, var30, var24, true, false, var37, var41 >> 2, var40 & 0x3, class216.field3480, var17);
                                    }
                                }
                                if (var39 != 0) {
                                    if (var39 == -1) {
                                        var39 = var37;
                                    }
                                    byte var42 = var23[var32][var36];
                                    int var43 = var42 & 0xFC;
                                    if (var43 == 0 || var17 <= 1 || var30 <= 1) {
                                        class216.method1573(var24, var34, var17, var30, var39);
                                    }
                                    class202.method1474(var39, var34, var30, var24, var38 == 0, false, 0, var43 >> 2, var42 & 0x3, class216.field3480, var17);
                                }
                            }
                            if (var22[var32] != null) {
                                int var44 = var22[var32][var36] & 0xFF;
                                if (var44 != 0) {
                                    int var45;
                                    if (var17 == 1) {
                                        var45 = var24;
                                    } else {
                                        var45 = var19 - 1;
                                    }
                                    int var46 = 13421772;
                                    if (var44 >= 5 && var44 <= 8 || var44 >= 13 && var44 <= 16 || var44 >= 21 && var44 <= 24 || var44 == 27 || var44 == 28) {
                                        var44 -= 4;
                                        var46 = 13369344;
                                    }
                                    int var47;
                                    if (var30 == 1) {
                                        var47 = var34;
                                    } else {
                                        var47 = var31 - 1;
                                    }
                                    if (var44 == 1) {
                                        class216.method1589(var24, var34, var30, var46);
                                    } else if (var44 == 2) {
                                        class216.method1587(var24, var34, var17, var46);
                                    } else if (var44 == 3) {
                                        class216.method1589(var45, var34, var30, var46);
                                    } else if (var44 == 4) {
                                        class216.method1587(var24, var47, var17, var46);
                                    } else if (var44 == 9) {
                                        class216.method1589(var24, var34, var30, 16777215);
                                        class216.method1587(var24, var34, var17, var46);
                                    } else if (var44 == 10) {
                                        class216.method1589(var45, var34, var30, 16777215);
                                        class216.method1587(var24, var34, var17, var46);
                                    } else if (var44 == 11) {
                                        class216.method1589(var45, var34, var30, 16777215);
                                        class216.method1587(var24, var47, var17, var46);
                                    } else if (var44 == 12) {
                                        class216.method1589(var24, var34, var30, 16777215);
                                        class216.method1587(var24, var47, var17, var46);
                                    } else if (var44 == 17) {
                                        class216.method1587(var24, var34, 1, var46);
                                    } else if (var44 == 18) {
                                        class216.method1587(var45, var34, 1, var46);
                                    } else if (var44 == 19) {
                                        class216.method1587(var45, var47, 1, var46);
                                    } else if (var44 == 20) {
                                        class216.method1587(var24, var47, 1, var46);
                                    } else if (var44 == 25) {
                                        for (int var49 = 0; var49 < var30; var49++) {
                                            class216.method1587(var24 + var49, -var49 + var47, 1, var46);
                                        }
                                    } else if (var44 == 26) {
                                        for (int var48 = 0; var48 < var30; var48++) {
                                            class216.method1587(var24 + var48, var34 + var48, 1, var46);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg2 + var16;
                    int var51 = arg2 + var15;
                    for (int var52 = 0; var52 < var13; var52++) {
                        int var53;
                        if (class124.field1855.field4934 != -1) {
                            var53 = class124.field1855.field4934;
                        } else if ((arg1 + var52 & 0x4) == (arg9 + var14 & 0x4)) {
                            var53 = class209.field3423[class5.field59 + 1];
                        } else {
                            var53 = 4936552;
                        }
                        int var54 = (arg8 + (arg4 * var52) >> 16) + arg6;
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        int var55 = ((var52 + 1) * arg4 + arg8 >> 16) + arg6;
                        int var56 = var55 - var54;
                        class216.method1573(var51, var54, var17, var56, var53);
                    }
                }
            }
        }
        for (int var57 = -2; var57 < var12 + 2; var57++) {
            int var58 = arg7 * var57 + arg3 >> 16;
            int var59 = (var57 + 1) * arg7 + arg3 >> 16;
            int var60 = var59 - var58;
            if (var60 > 0) {
                int var61 = arg2 + var58;
                var10000 = arg2 + var59;
                int var63 = var57 + arg9 >> 6;
                if (var63 >= 0 && var63 <= class254.field4030.length - 1) {
                    int[][] var64 = class254.field4030[var63];
                    for (int var65 = -2; var65 < var13 + 2; var65++) {
                        int var66 = arg8 + (arg4 * var65) >> 16;
                        int var67 = arg8 + ((var65 + 1) * arg4) >> 16;
                        int var68 = var67 - var66;
                        if (var68 > 0) {
                            var10000 = arg6 + var67;
                            int var70 = arg6 + var66;
                            int var71 = arg1 + var65 >> 6;
                            if (var71 >= 0 && (var64.length - 1) >= var71) {
                                int var72 = (arg1 + var65 & 0x3F << 6) + (arg9 + var57 & 0x3F);
                                if (var64[var71] != null) {
                                    int var73 = var64[var71][var72];
                                    int var74 = var73 & 0x1FFF;
                                    if (var74 != 0) {
                                        class208 var75 = class276.method1970(var74 - 1, 89);
                                        int var76 = var73 >> 13 & 0x3;
                                        boolean var77 = (var73 >> 15 & 0x1) == 1;
                                        class123 var78 = var75.method1523(23985, var77, var76);
                                        if (var78 != null) {
                                            int var79 = var78.field4037 * var60 / 4;
                                            int var80 = var78.field4039 * var68 / 4;
                                            if (var75.field3397) {
                                                int var81 = (var73 & 0xF6D06D) >> 20;
                                                int var82 = var73 >> 16 & 0xF;
                                                if ((var76 & 0x1) == 1) {
                                                    int var83 = var82;
                                                    var82 = var81;
                                                    var81 = var83;
                                                }
                                                var80 = var68 * var81;
                                                var79 = var60 * var82;
                                            }
                                            if (var79 != 0 && var80 != 0) {
                                                if (var75.field3409 == 0) {
                                                    var78.method857(var61, var70 + var68 - var80, var79, var80);
                                                } else {
                                                    var78.method856(var61, var70 + var68 - var80, var79, var80, var75.field3409);
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
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)I", line = 426)
    public static final int method648(int arg0, byte arg1) {
        if (arg1 == 7) {
            field1371++;
            return arg0 & 0x3FF;
        } else {
            return -128;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)Z", line = 444)
    public final boolean method649(int arg0, int arg1) {
        if (arg1 != 15869) {
            this.method650(93, -89);
        }
        field1367++;
        return this.field1377[arg0].field2914;
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(II)Z", line = 455)
    public final boolean method650(int arg0, int arg1) {
        if (arg0 != 1) {
            method652(-15);
        }
        field1366++;
        return this.field1377[arg1].field2910;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)V", line = 468)
    public static final void method651(int arg0, int arg1, int arg2) {
        field1375++;
        class256 var3 = class116.field1745[class148.field2209][arg1][arg0];
        if (var3 == null) {
            class145.method1022(class148.field2209, arg1, arg0);
            return;
        }
        int var4 = -99999999;
        class209 var5 = null;
        for (class209 var6 = (class209) var3.method1807((byte) 22); var6 != null; var6 = (class209) var3.method1808(18051)) {
            class74 var7 = class31.method198(false, var6.field3414.field342);
            int var8 = var7.field969;
            if (var7.field960 == 1) {
                var8 = (var6.field3414.field338 + 1) * var8;
            }
            if (var8 > var4) {
                var5 = var6;
                var4 = var8;
            }
        }
        if (var5 == null) {
            class145.method1022(class148.field2209, arg1, arg0);
            return;
        }
        var3.method1809(var5, (byte) -52);
        class24 var9 = null;
        class209 var10 = (class209) var3.method1807((byte) 38);
        class24 var11 = null;
        while (var10 != null) {
            class24 var12 = var10.field3414;
            if (var5.field3414.field342 != var12.field342) {
                if (var9 == null) {
                    var9 = var12;
                }
                if (var9.field342 != var12.field342 && var11 == null) {
                    var11 = var12;
                }
            }
            var10 = (class209) var3.method1808(18051);
        }
        long var13 = (long) ((arg0 << 7) + arg1 + 1610612736);
        int var15 = 98 % ((-arg2 - 59) / 44);
        class294.method2053(class148.field2209, arg1, arg0, class227.method1653(arg1 * 128 + 64, arg0 * 128 + 64, -12282, class148.field2209), var5.field3414, var13, var9, var11);
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lkb;Lkb;IZ)V", line = 555)
    public class90(class39 arg0, class39 arg1, int arg2, boolean arg3) {
        class256 var5 = new class256();
        int var6 = arg0.method261(-127, arg2);
        this.field1377 = new class180[var6];
        int[] var7 = arg0.method270(-87, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method250(true, arg2, var7[var8]);
            class343 var10 = null;
            int var11 = var9[0] & 0xFF << 8 | var9[1] & 0xFF;
            for (class343 var12 = (class343) var5.method1807((byte) 116); var12 != null; var12 = (class343) var5.method1808(18051)) {
                if (var12.field5340 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method273(0, var11, 1);
                } else {
                    var13 = arg1.method273(var11, 0, 1);
                }
                var10 = new class343(var11, var13);
                var5.method1815((byte) 115, var10);
            }
            this.field1377[var7[var8]] = new class180(var9, var10);
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V", line = 617)
    public static void method652(int arg0) {
        field1370 = (byte[][][]) null;
        field1373 = null;
        field1374 = null;
        if (arg0 != -21) {
            method652(-98);
        }
    }
}
