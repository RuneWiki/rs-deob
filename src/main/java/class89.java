import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class89 {

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field1722 = 1;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Z")
    public static boolean field1724 = false;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lrh;IIIIBII)V")
    public static final void method568(class177 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field1721++;
        if (class107.field2003 && (class21.field462[0][arg7][arg3] & 0x2) == 0) {
            if ((class21.field462[arg6][arg7][arg3] & 0x10) != 0) {
                return;
            }
            if (class151.method991(arg3, arg6, (byte) -120, arg7) != class203.field3951) {
                return;
            }
        }
        if (class15.field351 > arg6) {
            class15.field351 = arg6;
        }
        class4 var8 = class182.method1237(true, arg4);
        int var9;
        int var10;
        if (arg2 == 1 || arg2 == 3) {
            var9 = var8.field67;
            var10 = var8.field61;
        } else {
            var9 = var8.field61;
            var10 = var8.field67;
        }
        int var11;
        int var12;
        if (arg7 + var9 > 104) {
            var11 = arg7 + 1;
            var12 = arg7;
        } else {
            var11 = arg7 + (var9 + 1 >> 1);
            var12 = (var9 >> 1) + arg7;
        }
        int var13;
        int var14;
        if (arg3 + var10 > 104) {
            var13 = arg3 + 1;
            var14 = arg3;
        } else {
            var14 = arg3 + (var10 >> 1);
            var13 = arg3 + (var10 + 1 >> 1);
        }
        int[][] var15 = class46.field975[arg6];
        int var16 = (arg3 << 7) + (var10 << 6);
        int var17 = (arg7 << 7) + (var9 << 6);
        int var18 = var15[var12][var14] + var15[var11][var14] + var15[var11][var13] + var15[var12][var13] >> 2;
        long var19 = (long) ((arg2 | 0x400) << 20 | arg7 | arg3 << 7 | arg1 << 14);
        if (var8.field80 == 0) {
            var19 |= Long.MIN_VALUE;
        }
        if (var8.field38 == 1) {
            var19 |= 0x400000L;
        }
        if (var8.method35(-85)) {
            class190.method1269(arg2, arg3, var8, 128, arg6, arg7);
        }
        long var21 = var19 | (long) arg4 << 32;
        if (arg1 == 22) {
            if (!class107.field2003 || var8.field80 != 0 || var8.field45 == 1 || var8.field93) {
                class35 var24;
                if (var8.field57 == -1 && var8.field84 == null) {
                    class59 var23 = var8.method32(var18, var16, var17, 22, arg2, var15, true);
                    var24 = var23.field1167;
                } else {
                    var24 = new class166(arg4, 22, arg2, arg6, arg7, arg3, var8.field57, var8.field42, null);
                }
                class153.method1014(arg6, arg7, arg3, var18, var24, var21, var8.field49);
                if (var8.field45 == 1 && arg0 != null) {
                    arg0.method1185(arg7, arg3, (byte) -120);
                }
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class35 var64;
            if (var8.field57 == -1 && var8.field84 == null) {
                class59 var63 = var8.method32(var18, var16, var17, 10, arg2, var15, true);
                var64 = var63.field1167;
            } else {
                var64 = new class166(arg4, 10, arg2, arg6, arg7, arg3, var8.field57, var8.field42, null);
            }
            if (var64 != null && class104.method644(arg6, arg7, arg3, var18, var9, var10, var64, arg1 == 11 ? 256 : 0, var21) && var8.field46) {
                int var65 = 15;
                if (var64 instanceof class213) {
                    var65 = ((class213) var64).method1400() / 4;
                    if (var65 > 30) {
                        var65 = 30;
                    }
                }
                for (int var66 = 0; var66 <= var9; var66++) {
                    for (int var67 = 0; var67 <= var10; var67++) {
                        if (var65 > class140.field2602[arg6][arg7 + var66][arg3 + var67]) {
                            class140.field2602[arg6][arg7 + var66][arg3 + var67] = (byte) var65;
                        }
                    }
                }
            }
            if (var8.field45 != 0 && arg0 != null) {
                arg0.method1180(arg3, var10, var9, (byte) -128, var8.field77, arg7);
            }
        } else if (arg1 >= 12) {
            class35 var26;
            if (var8.field57 == -1 && var8.field84 == null) {
                class59 var25 = var8.method32(var18, var16, var17, arg1, arg2, var15, true);
                var26 = var25.field1167;
            } else {
                var26 = new class166(arg4, arg1, arg2, arg6, arg7, arg3, var8.field57, var8.field42, null);
            }
            class104.method644(arg6, arg7, arg3, var18, 1, 1, var26, 0, var21);
            if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg6 > 0) {
                class79.field1570[arg6][arg7][arg3] = class21.method181(class79.field1570[arg6][arg7][arg3], 2340);
            }
            if (var8.field45 != 0 && arg0 != null) {
                arg0.method1180(arg3, var10, var9, (byte) -126, var8.field77, arg7);
            }
        } else if (arg1 == 0) {
            class35 var28;
            if (var8.field57 == -1 && var8.field84 == null) {
                class59 var27 = var8.method32(var18, var16, var17, 0, arg2, var15, true);
                var28 = var27.field1167;
            } else {
                var28 = new class166(arg4, 0, arg2, arg6, arg7, arg3, var8.field57, var8.field42, null);
            }
            class82.method510(arg6, arg7, arg3, var18, var28, null, client.field645[arg2], 0, var21);
            if (arg2 == 0) {
                if (var8.field46) {
                    class140.field2602[arg6][arg7][arg3] = 50;
                    class140.field2602[arg6][arg7][arg3 + 1] = 50;
                }
                if (var8.field50) {
                    class79.field1570[arg6][arg7][arg3] = class21.method181(class79.field1570[arg6][arg7][arg3], 585);
                }
            } else if (arg2 == 1) {
                if (var8.field46) {
                    class140.field2602[arg6][arg7][arg3 + 1] = 50;
                    class140.field2602[arg6][arg7 + 1][arg3 + 1] = 50;
                }
                if (var8.field50) {
                    class79.field1570[arg6][arg7][arg3 + 1] = class21.method181(class79.field1570[arg6][arg7][arg3 + 1], 1170);
                }
            } else if (arg2 == 2) {
                if (var8.field46) {
                    class140.field2602[arg6][arg7 + 1][arg3] = 50;
                    class140.field2602[arg6][arg7 + 1][arg3 + 1] = 50;
                }
                if (var8.field50) {
                    class79.field1570[arg6][arg7 + 1][arg3] = class21.method181(class79.field1570[arg6][arg7 + 1][arg3], 585);
                }
            } else if (arg2 == 3) {
                if (var8.field46) {
                    class140.field2602[arg6][arg7][arg3] = 50;
                    class140.field2602[arg6][arg7 + 1][arg3] = 50;
                }
                if (var8.field50) {
                    class79.field1570[arg6][arg7][arg3] = class21.method181(class79.field1570[arg6][arg7][arg3], 1170);
                }
            }
            if (var8.field45 != 0 && arg0 != null) {
                arg0.method1175((byte) -115, arg3, arg1, var8.field77, arg2, arg7);
            }
            if (var8.field85 != 16) {
                class60.method380(arg6, arg7, arg3, var8.field85);
            }
        } else {
            if (arg5 != -9) {
                method570(21, 43, -82);
            }
            if (arg1 == 1) {
                class35 var30;
                if (var8.field57 == -1 && var8.field84 == null) {
                    class59 var29 = var8.method32(var18, var16, var17, 1, arg2, var15, true);
                    var30 = var29.field1167;
                } else {
                    var30 = new class166(arg4, 1, arg2, arg6, arg7, arg3, var8.field57, var8.field42, null);
                }
                class82.method510(arg6, arg7, arg3, var18, var30, null, class71.field1385[arg2], 0, var21);
                if (var8.field46) {
                    if (arg2 == 0) {
                        class140.field2602[arg6][arg7][arg3 + 1] = 50;
                    } else if (arg2 == 1) {
                        class140.field2602[arg6][arg7 + 1][arg3 + 1] = 50;
                    } else if (arg2 == 2) {
                        class140.field2602[arg6][arg7 + 1][arg3] = 50;
                    } else if (arg2 == 3) {
                        class140.field2602[arg6][arg7][arg3] = 50;
                    }
                }
                if (var8.field45 != 0 && arg0 != null) {
                    arg0.method1175((byte) 88, arg3, arg1, var8.field77, arg2, arg7);
                }
            } else if (arg1 == 2) {
                int var31 = arg2 + 1 & 0x3;
                class35 var34;
                class35 var35;
                if (var8.field57 == -1 && var8.field84 == null) {
                    class59 var32 = var8.method32(var18, var16, var17, 2, arg2 + 4, var15, true);
                    class59 var33 = var8.method32(var18, var16, var17, 2, var31, var15, true);
                    var34 = var32.field1167;
                    var35 = var33.field1167;
                } else {
                    var34 = new class166(arg4, 2, arg2 + 4, arg6, arg7, arg3, var8.field57, var8.field42, null);
                    var35 = new class166(arg4, 2, var31, arg6, arg7, arg3, var8.field57, var8.field42, null);
                }
                class82.method510(arg6, arg7, arg3, var18, var34, var35, client.field645[arg2], client.field645[var31], var21);
                if (var8.field50) {
                    if (arg2 == 0) {
                        class79.field1570[arg6][arg7][arg3] = class21.method181(class79.field1570[arg6][arg7][arg3], 585);
                        class79.field1570[arg6][arg7][arg3 + 1] = class21.method181(class79.field1570[arg6][arg7][arg3 + 1], 1170);
                    } else if (arg2 == 1) {
                        class79.field1570[arg6][arg7][arg3 + 1] = class21.method181(class79.field1570[arg6][arg7][arg3 + 1], 1170);
                        class79.field1570[arg6][arg7 + 1][arg3] = class21.method181(class79.field1570[arg6][arg7 + 1][arg3], 585);
                    } else if (arg2 == 2) {
                        class79.field1570[arg6][arg7 + 1][arg3] = class21.method181(class79.field1570[arg6][arg7 + 1][arg3], 585);
                        class79.field1570[arg6][arg7][arg3] = class21.method181(class79.field1570[arg6][arg7][arg3], 1170);
                    } else if (arg2 == 3) {
                        class79.field1570[arg6][arg7][arg3] = class21.method181(class79.field1570[arg6][arg7][arg3], 1170);
                        class79.field1570[arg6][arg7][arg3] = class21.method181(class79.field1570[arg6][arg7][arg3], 585);
                    }
                }
                if (var8.field45 != 0 && arg0 != null) {
                    arg0.method1175((byte) -114, arg3, arg1, var8.field77, arg2, arg7);
                }
                if (var8.field85 != 16) {
                    class60.method380(arg6, arg7, arg3, var8.field85);
                }
            } else if (arg1 == 3) {
                class35 var37;
                if (var8.field57 == -1 && var8.field84 == null) {
                    class59 var36 = var8.method32(var18, var16, var17, 3, arg2, var15, true);
                    var37 = var36.field1167;
                } else {
                    var37 = new class166(arg4, 3, arg2, arg6, arg7, arg3, var8.field57, var8.field42, null);
                }
                class82.method510(arg6, arg7, arg3, var18, var37, null, class71.field1385[arg2], 0, var21);
                if (var8.field46) {
                    if (arg2 == 0) {
                        class140.field2602[arg6][arg7][arg3 + 1] = 50;
                    } else if (arg2 == 1) {
                        class140.field2602[arg6][arg7 + 1][arg3 + 1] = 50;
                    } else if (arg2 == 2) {
                        class140.field2602[arg6][arg7 + 1][arg3] = 50;
                    } else if (arg2 == 3) {
                        class140.field2602[arg6][arg7][arg3] = 50;
                    }
                }
                if (var8.field45 != 0 && arg0 != null) {
                    arg0.method1175((byte) -115, arg3, arg1, var8.field77, arg2, arg7);
                }
            } else if (arg1 == 9) {
                class35 var39;
                if (var8.field57 == -1 && var8.field84 == null) {
                    class59 var38 = var8.method32(var18, var16, var17, arg1, arg2, var15, true);
                    var39 = var38.field1167;
                } else {
                    var39 = new class166(arg4, arg1, arg2, arg6, arg7, arg3, var8.field57, var8.field42, null);
                }
                class104.method644(arg6, arg7, arg3, var18, 1, 1, var39, 0, var21);
                if (var8.field45 != 0 && arg0 != null) {
                    arg0.method1180(arg3, var10, var9, (byte) 22, var8.field77, arg7);
                }
                if (var8.field85 != 16) {
                    class60.method380(arg6, arg7, arg3, var8.field85);
                }
            } else if (arg1 == 4) {
                class35 var41;
                if (var8.field57 == -1 && var8.field84 == null) {
                    class59 var40 = var8.method32(var18, var16, var17, 4, arg2, var15, true);
                    var41 = var40.field1167;
                } else {
                    var41 = new class166(arg4, 4, arg2, arg6, arg7, arg3, var8.field57, var8.field42, null);
                }
                class35.method271(arg6, arg7, arg3, var18, var41, null, client.field645[arg2], 0, 0, 0, var21);
            } else if (arg1 == 5) {
                int var42 = 16;
                long var43 = class13.method97(arg6, arg7, arg3);
                if (var43 != 0L) {
                    var42 = class182.method1237(true, Integer.MAX_VALUE & (int) (var43 >>> 32)).field85;
                }
                class35 var46;
                if (var8.field57 == -1 && var8.field84 == null) {
                    class59 var45 = var8.method32(var18, var16, var17, 4, arg2, var15, true);
                    var46 = var45.field1167;
                } else {
                    var46 = new class166(arg4, 4, arg2, arg6, arg7, arg3, var8.field57, var8.field42, null);
                }
                class35.method271(arg6, arg7, arg3, var18, var46, null, client.field645[arg2], 0, class106.field1986[arg2] * var42, class99.field1817[arg2] * var42, var21);
            } else if (arg1 == 6) {
                int var47 = 8;
                long var48 = class13.method97(arg6, arg7, arg3);
                if (var48 != 0L) {
                    var47 = class182.method1237(true, (int) (var48 >>> 32) & Integer.MAX_VALUE).field85 / 2;
                }
                class35 var51;
                if (var8.field57 == -1 && var8.field84 == null) {
                    class59 var50 = var8.method32(var18, var16, var17, 4, arg2 + 4, var15, true);
                    var51 = var50.field1167;
                } else {
                    var51 = new class166(arg4, 4, arg2 + 4, arg6, arg7, arg3, var8.field57, var8.field42, null);
                }
                class35.method271(arg6, arg7, arg3, var18, var51, null, 256, arg2, class116.field2135[arg2] * var47, class59.field1158[arg2] * var47, var21);
            } else if (arg1 == 7) {
                int var52 = arg2 + 2 & 0x3;
                class35 var54;
                if (var8.field57 == -1 && var8.field84 == null) {
                    class59 var53 = var8.method32(var18, var16, var17, 4, var52 + 4, var15, true);
                    var54 = var53.field1167;
                } else {
                    var54 = new class166(arg4, 4, var52 + 4, arg6, arg7, arg3, var8.field57, var8.field42, null);
                }
                class35.method271(arg6, arg7, arg3, var18, var54, null, 256, var52, 0, 0, var21);
            } else if (arg1 == 8) {
                int var55 = 8;
                long var56 = class13.method97(arg6, arg7, arg3);
                if (var56 != 0L) {
                    var55 = class182.method1237(true, Integer.MAX_VALUE & (int) (var56 >>> 32)).field85 / 2;
                }
                int var58 = arg2 + 2 & 0x3;
                class35 var61;
                class35 var62;
                if (var8.field57 == -1 && var8.field84 == null) {
                    class59 var59 = var8.method32(var18, var16, var17, 4, arg2 + 4, var15, true);
                    class59 var60 = var8.method32(var18, var16, var17, 4, var58 + 4, var15, true);
                    var61 = var59.field1167;
                    var62 = var60.field1167;
                } else {
                    var61 = new class166(arg4, 4, arg2 + 4, arg6, arg7, arg3, var8.field57, var8.field42, null);
                    var62 = new class166(arg4, 4, var58 + 4, arg6, arg7, arg3, var8.field57, var8.field42, null);
                }
                class35.method271(arg6, arg7, arg3, var18, var61, var62, 256, arg2, class116.field2135[arg2] * var55, class59.field1158[arg2] * var55, var21);
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()V")
    public static final void method569() {
        for (int var0 = 0; var0 < class191.field3742; var0++) {
            class5 var1 = class172.field3345[var0];
            class71.method431(var1);
            class172.field3345[var0] = null;
        }
        class191.field3742 = 0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)Z")
    public static final boolean method570(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class216.field4192; var3++) {
            class126 var4 = class215.field4166[var3];
            if (var4.field2380 == 1) {
                int var5 = var4.field2382 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2385 * var5 >> 8) + var4.field2381;
                    int var7 = (var4.field2366 * var5 >> 8) + var4.field2372;
                    int var8 = (var4.field2374 * var5 >> 8) + var4.field2377;
                    int var9 = (var4.field2373 * var5 >> 8) + var4.field2371;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2380 == 2) {
                int var10 = arg0 - var4.field2382;
                if (var10 > 0) {
                    int var11 = (var4.field2385 * var10 >> 8) + var4.field2381;
                    int var12 = (var4.field2366 * var10 >> 8) + var4.field2372;
                    int var13 = (var4.field2374 * var10 >> 8) + var4.field2377;
                    int var14 = (var4.field2373 * var10 >> 8) + var4.field2371;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2380 == 3) {
                int var15 = var4.field2381 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2383 * var15 >> 8) + var4.field2382;
                    int var17 = (var4.field2387 * var15 >> 8) + var4.field2367;
                    int var18 = (var4.field2374 * var15 >> 8) + var4.field2377;
                    int var19 = (var4.field2373 * var15 >> 8) + var4.field2371;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2380 == 4) {
                int var20 = arg2 - var4.field2381;
                if (var20 > 0) {
                    int var21 = (var4.field2383 * var20 >> 8) + var4.field2382;
                    int var22 = (var4.field2387 * var20 >> 8) + var4.field2367;
                    int var23 = (var4.field2374 * var20 >> 8) + var4.field2377;
                    int var24 = (var4.field2373 * var20 >> 8) + var4.field2371;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2380 == 5) {
                int var25 = arg1 - var4.field2377;
                if (var25 > 0) {
                    int var26 = (var4.field2383 * var25 >> 8) + var4.field2382;
                    int var27 = (var4.field2387 * var25 >> 8) + var4.field2367;
                    int var28 = (var4.field2385 * var25 >> 8) + var4.field2381;
                    int var29 = (var4.field2366 * var25 >> 8) + var4.field2372;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
