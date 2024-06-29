import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class171 {

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "[I")
    public static int[] field2365 = new int[] { 0, -2, -2, 0, 1, 0, 0, 0, 1, 0, 6, 8, 0, 0, 0, 0, 0, 15, 8, 20, 0, 0, 0, 3, 0, -2, 4, 0, 0, 0, -1, 12, 0, 3, -2, 9, 0, 0, 3, 0, 7, 0, 6, -2, -1, 0, 8, 7, 0, -2, 0, 0, 2, -2, -1, 1, 0, 0, 0, -1, 5, 0, 0, 7, 0, 10, 0, 0, 0, 0, 0, 0, 2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 8, 0, 10, 12, 0, 0, 8, 0, 2, 0, 2, 0, -1, 3, 0, 0, 4, -1, 15, 0, 0, 0, 0, 0, 17, 0, 12, 7, 3, -2, 0, 0, 0, 3, 0, 0, 0, 0, 0, -1, 0, 0, 6, 3, 4, 0, 14, 0, 6, -2, 3, 6, 0, 0, 0, 0, 0, 6, 0, 0, 2, 8, 0, 5, 8, 10, 6, 0, -2, 2, 0, 6, 0, 0, 0, 14, 0, 6, 0, 28, 0, 2, 0, 0, 0, 8, -2, -1, 0, 5, 11, 0, 4, 0, 0, -1, 12, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 5, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 10, 0, 0, 0, 0, 3, 8, 0, 0, -1, 0, 0, 0, 0, 0, -1, -2, 0, 0 };

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field2368 = 0;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Z")
    public static boolean field2372 = false;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Lwf;")
    public static class333 field2371;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(JB)V", line = 7)
    public static final void method1258(long arg0, byte arg1) {
        field2366++;
        if (arg0 == 0L || arg1 != -67) {
            return;
        }
        for (int var3 = 0; var3 < class116.field1511; var3++) {
            if (class234.field3356[var3] == arg0) {
                class116.field1511--;
                for (int var4 = var3; var4 < class116.field1511; var4++) {
                    class234.field3356[var4] = class234.field3356[var4 + 1];
                    class109.field1422[var4] = class109.field1422[var4 + 1];
                    class226.field3255[var4] = class226.field3255[var4 + 1];
                }
                class9.field108++;
                class180.field2464 = class64.field801;
                class251.field3681.method1309(23, 142);
                class251.field3681.method2049(arg1 - 19713, arg0);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIZILch;ZI)V", line = 52)
    public static final void method1259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, class8 arg8, boolean arg9, int arg10) {
        field2367++;
        if (arg9 && !class138.method1038(true) && (class9.field101[0][arg4][arg7] & 0x2) == 0) {
            if ((class9.field101[arg1][arg4][arg7] & 0x10) != 0) {
                return;
            }
            if (class61.method448(arg7, arg1, (byte) 106, arg4) != class226.field3256) {
                return;
            }
        }
        if (class247.field3602 > arg1) {
            class247.field3602 = arg1;
        }
        class219 var11 = class345.method2392(arg2, 0);
        if (class47.field623 && var11.field3156) {
            return;
        }
        int var12;
        int var13;
        if (arg0 == 1 || arg0 == 3) {
            var13 = var11.field3096;
            var12 = var11.field3112;
        } else {
            var12 = var11.field3096;
            var13 = var11.field3112;
        }
        int var14;
        int var15;
        if ((arg4 + var13) > 104) {
            var14 = arg4 + 1;
            var15 = arg4;
        } else {
            var14 = (var13 + 1 >> 1) + arg4;
            var15 = (var13 >> 1) + arg4;
        }
        int var16;
        int var17;
        if (arg7 + var12 > 104) {
            var16 = arg7 + 1;
            var17 = arg7;
        } else {
            var17 = (var12 >> 1) + arg7;
            var16 = arg7 + (var12 + 1 >> 1);
        }
        int[][] var18 = class74.field978[arg3];
        int var19 = (arg4 << 7) + (var13 << 6);
        int var20 = (arg7 << 7) + (var12 << 6);
        int var21 = var18[var14][var17] + var18[var15][var17] + var18[var15][var16] + var18[var14][var16] >> 2;
        int var22 = 0;
        if (class47.field623 && arg3 != 0) {
            int[][] var23 = class74.field978[0];
            var22 = var21 - (var23[var15][var17] + var23[var15][var16] - (-var23[var14][var17] - var23[var14][var16]) >> 2);
        }
        long var24 = (long) (arg4 | arg7 << 7 | arg10 << 14 | arg0 << 20 | 0x40000000);
        int[][] var26 = (int[][]) null;
        if (arg6) {
            var26 = class185.field2517[0];
        } else if (arg3 < 3) {
            var26 = class74.field978[arg3 + 1];
        }
        if (var11.field3106 == 0 || arg6) {
            var24 |= Long.MIN_VALUE;
        }
        if (var11.field3100 == 1) {
            var24 |= 0x400000L;
        }
        if (var11.field3158) {
            var24 |= 0x80000000L;
        }
        if (var11.method1599(92)) {
            class1.method2(128, var11, arg4, (class169) null, arg7, (class239) null, arg0, arg1);
        }
        long var27 = var24 | (long) arg2 << 32;
        boolean var29 = var11.field3090 & !arg6;
        if (arg10 == 22) {
            if (class329.field4812 || var11.field3106 != 0 || var11.field3087 == 1 || var11.field3126) {
                class260 var77;
                if (var11.field3107 == -1 && var11.field3163 == null && var11.field3125 == null && !var11.field3139) {
                    class276 var76 = var11.method1586(var19, arg9, 22, var21, var18, var26, var29, arg0, var20, -123, (class153) null);
                    if (class47.field623 && var29) {
                        class151.method1162(var76.field3958, var19, var22, var20);
                    }
                    var77 = var76.field3952;
                } else {
                    var77 = new class291(arg2, 22, arg0, arg3, arg4, arg7, -1, var11.field3140, (class260) null);
                }
                class121.method876(arg1, arg4, arg7, var21, var77, var27, var11.field3088);
                if (var11.field3087 == 1 && arg8 != null) {
                    arg8.method43(arg7, -28, arg4);
                }
            }
        } else if (arg10 == 10 || arg10 == 11) {
            class260 var71;
            if (var11.field3107 == -1 && var11.field3163 == null && var11.field3125 == null && !var11.field3139) {
                class276 var70 = var11.method1586(var19, arg9, 10, var21, var18, var26, var29, arg10 == 11 ? arg0 + 4 : arg0, var20, arg5 - 118, (class153) null);
                if (class47.field623 && var29) {
                    class151.method1162(var70.field3958, var19, var22, var20);
                }
                var71 = var70.field3952;
            } else {
                var71 = new class291(arg2, 10, arg10 == 11 ? arg0 + 4 : arg0, arg3, arg4, arg7, -1, var11.field3140, (class260) null);
            }
            if (var71 != null) {
                boolean var72 = method1262(arg1, arg4, arg7, var21, var13, var12, var71, 0, var27);
                if (var11.field3133 && var72 && arg9) {
                    int var73 = 15;
                    if (var71 instanceof class81) {
                        var73 = ((class81) var71).method584() / 4;
                        if (var73 > 30) {
                            var73 = 30;
                        }
                    }
                    for (int var74 = 0; var74 <= var13; var74++) {
                        for (int var75 = 0; var75 <= var12; var75++) {
                            if (class169.field2356[arg1][arg4 + var74][arg7 + var75] < var73) {
                                class169.field2356[arg1][arg4 + var74][arg7 + var75] = (byte) var73;
                            }
                        }
                    }
                }
            }
            if (var11.field3087 != 0 && arg8 != null) {
                arg8.method44(var11.field3115, !var11.field3161, var12, var13, arg7, -32566, arg4);
            }
        } else if (arg10 >= 12) {
            class260 var69;
            if (var11.field3107 == -1 && var11.field3163 == null && var11.field3125 == null && !var11.field3139) {
                class276 var68 = var11.method1586(var19, arg9, arg10, var21, var18, var26, var29, arg0, var20, -115, (class153) null);
                if (class47.field623 && var29) {
                    class151.method1162(var68.field3958, var19, var22, var20);
                }
                var69 = var68.field3952;
            } else {
                var69 = new class291(arg2, arg10, arg0, arg3, arg4, arg7, -1, var11.field3140, (class260) null);
            }
            method1262(arg1, arg4, arg7, var21, 1, 1, var69, 0, var27);
            if (arg9 && arg10 >= 12 && arg10 <= 17 && arg10 != 13 && arg1 > 0 && var11.field3142 != 0) {
                class195.field2692[arg1][arg4][arg7] = class80.method568(class195.field2692[arg1][arg4][arg7], 4);
            }
            if (var11.field3087 != 0 && arg8 != null) {
                arg8.method44(var11.field3115, !var11.field3161, var12, var13, arg7, -32566, arg4);
            }
        } else if (arg10 == 0) {
            class260 var31;
            if (var11.field3107 == -1 && var11.field3163 == null && var11.field3125 == null && !var11.field3139) {
                class276 var30 = var11.method1586(var19, arg9, 0, var21, var18, var26, var29, arg0, var20, -128, (class153) null);
                if (class47.field623 && var29) {
                    class151.method1162(var30.field3958, var19, var22, var20);
                }
                var31 = var30.field3952;
            } else {
                var31 = new class291(arg2, 0, arg0, arg3, arg4, arg7, -1, var11.field3140, (class260) null);
            }
            class101.method721(arg1, arg4, arg7, var21, var31, (class260) null, class175.field2400[arg0], 0, var27);
            if (arg9) {
                if (arg0 == 0) {
                    if (var11.field3133) {
                        class169.field2356[arg1][arg4][arg7] = 50;
                        class169.field2356[arg1][arg4][arg7 + 1] = 50;
                    }
                    if (var11.field3142 == 1) {
                        class195.field2692[arg1][arg4][arg7] = class80.method568(class195.field2692[arg1][arg4][arg7], 1);
                    }
                } else if (arg0 == 1) {
                    if (var11.field3133) {
                        class169.field2356[arg1][arg4][arg7 + 1] = 50;
                        class169.field2356[arg1][arg4 + 1][arg7 + 1] = 50;
                    }
                    if (var11.field3142 == 1) {
                        class195.field2692[arg1][arg4][arg7 + 1] = class80.method568(class195.field2692[arg1][arg4][arg7 + 1], 2);
                    }
                } else if (arg0 == 2) {
                    if (var11.field3133) {
                        class169.field2356[arg1][arg4 + 1][arg7] = 50;
                        class169.field2356[arg1][arg4 + 1][arg7 + 1] = 50;
                    }
                    if (var11.field3142 == 1) {
                        class195.field2692[arg1][arg4 + 1][arg7] = class80.method568(class195.field2692[arg1][arg4 + 1][arg7], 1);
                    }
                } else if (arg0 == 3) {
                    if (var11.field3133) {
                        class169.field2356[arg1][arg4][arg7] = 50;
                        class169.field2356[arg1][arg4 + 1][arg7] = 50;
                    }
                    if (var11.field3142 == 1) {
                        class195.field2692[arg1][arg4][arg7] = class80.method568(class195.field2692[arg1][arg4][arg7], 2);
                    }
                }
            }
            if (var11.field3087 != 0 && arg8 != null) {
                arg8.method50(arg7, -21665, var11.field3115, !var11.field3161, arg4, arg10, arg0);
            }
            if (var11.field3084 != 16) {
                class224.method1624(arg1, arg4, arg7, var11.field3084);
            }
        } else if (arg10 == 1) {
            class260 var33;
            if (var11.field3107 == -1 && var11.field3163 == null && var11.field3125 == null && !var11.field3139) {
                class276 var32 = var11.method1586(var19, arg9, 1, var21, var18, var26, var29, arg0, var20, -116, (class153) null);
                if (class47.field623 && var29) {
                    class151.method1162(var32.field3958, var19, var22, var20);
                }
                var33 = var32.field3952;
            } else {
                var33 = new class291(arg2, 1, arg0, arg3, arg4, arg7, -1, var11.field3140, (class260) null);
            }
            class101.method721(arg1, arg4, arg7, var21, var33, (class260) null, class215.field3043[arg0], 0, var27);
            if (var11.field3133 && arg9) {
                if (arg0 == 0) {
                    class169.field2356[arg1][arg4][arg7 + 1] = 50;
                } else if (arg0 == 1) {
                    class169.field2356[arg1][arg4 + 1][arg7 + 1] = 50;
                } else if (arg0 == 2) {
                    class169.field2356[arg1][arg4 + 1][arg7] = 50;
                } else if (arg0 == 3) {
                    class169.field2356[arg1][arg4][arg7] = 50;
                }
            }
            if (var11.field3087 != 0 && arg8 != null) {
                arg8.method50(arg7, arg5 ^ 0xFFFFAB5B, var11.field3115, !var11.field3161, arg4, arg10, arg0);
            }
        } else if (arg10 == 2) {
            int var34 = arg0 + 1 & 0x3;
            class260 var36;
            class260 var38;
            if (var11.field3107 == -1 && var11.field3163 == null && var11.field3125 == null && !var11.field3139) {
                class276 var35 = var11.method1586(var19, arg9, 2, var21, var18, var26, var29, arg0 + 4, var20, arg5 ^ 0xFFFFFF8E, (class153) null);
                if (class47.field623 && var29) {
                    class151.method1162(var35.field3958, var19, var22, var20);
                }
                var36 = var35.field3952;
                class276 var37 = var11.method1586(var19, arg9, 2, var21, var18, var26, var29, var34, var20, arg5 - 119, (class153) null);
                if (class47.field623 && var29) {
                    class151.method1162(var37.field3958, var19, var22, var20);
                }
                var38 = var37.field3952;
            } else {
                var36 = new class291(arg2, 2, arg0 + 4, arg3, arg4, arg7, -1, var11.field3140, (class260) null);
                var38 = new class291(arg2, 2, var34, arg3, arg4, arg7, -1, var11.field3140, (class260) null);
            }
            class101.method721(arg1, arg4, arg7, var21, var36, var38, class175.field2400[arg0], class175.field2400[var34], var27);
            if (var11.field3142 == 1 && arg9) {
                if (arg0 == 0) {
                    class195.field2692[arg1][arg4][arg7] = class80.method568(class195.field2692[arg1][arg4][arg7], 1);
                    class195.field2692[arg1][arg4][arg7 + 1] = class80.method568(class195.field2692[arg1][arg4][arg7 + 1], 2);
                } else if (arg0 == 1) {
                    class195.field2692[arg1][arg4][arg7 + 1] = class80.method568(class195.field2692[arg1][arg4][arg7 + 1], 2);
                    class195.field2692[arg1][arg4 + 1][arg7] = class80.method568(class195.field2692[arg1][arg4 + 1][arg7], 1);
                } else if (arg0 == 2) {
                    class195.field2692[arg1][arg4 + 1][arg7] = class80.method568(class195.field2692[arg1][arg4 + 1][arg7], 1);
                    class195.field2692[arg1][arg4][arg7] = class80.method568(class195.field2692[arg1][arg4][arg7], 2);
                } else if (arg0 == 3) {
                    class195.field2692[arg1][arg4][arg7] = class80.method568(class195.field2692[arg1][arg4][arg7], 2);
                    class195.field2692[arg1][arg4][arg7] = class80.method568(class195.field2692[arg1][arg4][arg7], 1);
                }
            }
            if (var11.field3087 != 0 && arg8 != null) {
                arg8.method50(arg7, -21665, var11.field3115, !var11.field3161, arg4, arg10, arg0);
            }
            if (var11.field3084 != 16) {
                class224.method1624(arg1, arg4, arg7, var11.field3084);
            }
        } else if (arg10 == 3) {
            class260 var40;
            if (var11.field3107 == -1 && var11.field3163 == null && var11.field3125 == null && !var11.field3139) {
                class276 var39 = var11.method1586(var19, arg9, 3, var21, var18, var26, var29, arg0, var20, -128, (class153) null);
                if (class47.field623 && var29) {
                    class151.method1162(var39.field3958, var19, var22, var20);
                }
                var40 = var39.field3952;
            } else {
                var40 = new class291(arg2, 3, arg0, arg3, arg4, arg7, -1, var11.field3140, (class260) null);
            }
            class101.method721(arg1, arg4, arg7, var21, var40, (class260) null, class215.field3043[arg0], 0, var27);
            if (var11.field3133 && arg9) {
                if (arg0 == 0) {
                    class169.field2356[arg1][arg4][arg7 + 1] = 50;
                } else if (arg0 == 1) {
                    class169.field2356[arg1][arg4 + 1][arg7 + 1] = 50;
                } else if (arg0 == 2) {
                    class169.field2356[arg1][arg4 + 1][arg7] = 50;
                } else if (arg0 == 3) {
                    class169.field2356[arg1][arg4][arg7] = 50;
                }
            }
            if (var11.field3087 != 0 && arg8 != null) {
                arg8.method50(arg7, arg5 - 21669, var11.field3115, !var11.field3161, arg4, arg10, arg0);
            }
        } else if (arg10 == 9) {
            class260 var42;
            if (var11.field3107 == -1 && var11.field3163 == null && var11.field3125 == null && !var11.field3139) {
                class276 var41 = var11.method1586(var19, arg9, arg10, var21, var18, var26, var29, arg0, var20, -119, (class153) null);
                if (class47.field623 && var29) {
                    class151.method1162(var41.field3958, var19, var22, var20);
                }
                var42 = var41.field3952;
            } else {
                var42 = new class291(arg2, arg10, arg0, arg3, arg4, arg7, -1, var11.field3140, (class260) null);
            }
            method1262(arg1, arg4, arg7, var21, 1, 1, var42, 0, var27);
            if (var11.field3087 != 0 && arg8 != null) {
                arg8.method44(var11.field3115, !var11.field3161, var12, var13, arg7, -32566, arg4);
            }
            if (var11.field3084 != 16) {
                class224.method1624(arg1, arg4, arg7, var11.field3084);
            }
        } else if (arg5 == 4) {
            if (arg10 == 4) {
                class260 var44;
                if (var11.field3107 == -1 && var11.field3163 == null && var11.field3125 == null && !var11.field3139) {
                    class276 var43 = var11.method1586(var19, arg9, 4, var21, var18, var26, var29, arg0, var20, -125, (class153) null);
                    if (class47.field623 && var29) {
                        class151.method1162(var43.field3958, var19, var22, var20);
                    }
                    var44 = var43.field3952;
                } else {
                    var44 = new class291(arg2, 4, arg0, arg3, arg4, arg7, -1, var11.field3140, (class260) null);
                }
                class62.method456(arg1, arg4, arg7, var21, var44, (class260) null, class175.field2400[arg0], 0, 0, 0, var27);
            } else if (arg10 == 5) {
                long var63 = class9.method62(arg1, arg4, arg7);
                int var65 = 16;
                if (var63 != 0L) {
                    var65 = class345.method2392((int) (var63 >>> 32) & Integer.MAX_VALUE, 0).field3084;
                }
                class260 var67;
                if (var11.field3107 == -1 && var11.field3163 == null && var11.field3125 == null && !var11.field3139) {
                    class276 var66 = var11.method1586(var19, arg9, 4, var21, var18, var26, var29, arg0, var20, -116, (class153) null);
                    if (class47.field623 && var29) {
                        class151.method1162(var66.field3958, var19 - (class316.field4651[arg0] * 8), var22, var20 - class258.field3754[arg0] * 8);
                    }
                    var67 = var66.field3952;
                } else {
                    var67 = new class291(arg2, 4, arg0, arg3, arg4, arg7, -1, var11.field3140, (class260) null);
                }
                class62.method456(arg1, arg4, arg7, var21, var67, (class260) null, class175.field2400[arg0], 0, class316.field4651[arg0] * var65, class258.field3754[arg0] * var65, var27);
            } else if (arg10 == 6) {
                long var45 = class9.method62(arg1, arg4, arg7);
                int var47 = 8;
                if (var45 != 0L) {
                    var47 = class345.method2392(Integer.MAX_VALUE & (int) (var45 >>> 32), arg5 ^ 0x4).field3084 / 2;
                }
                class260 var49;
                if (var11.field3107 == -1 && var11.field3163 == null && var11.field3125 == null && !var11.field3139) {
                    class276 var48 = var11.method1586(var19, arg9, 4, var21, var18, var26, var29, arg0 + 4, var20, -117, (class153) null);
                    if (class47.field623 && var29) {
                        class151.method1162(var48.field3958, var19 - class165.field2320[arg0] * 8, var22, var20 - (class248.field3609[arg0] * 8));
                    }
                    var49 = var48.field3952;
                } else {
                    var49 = new class291(arg2, 4, arg0 + 4, arg3, arg4, arg7, -1, var11.field3140, (class260) null);
                }
                class62.method456(arg1, arg4, arg7, var21, var49, (class260) null, 256, arg0, class165.field2320[arg0] * var47, class248.field3609[arg0] * var47, var27);
            } else if (arg10 == 7) {
                int var60 = arg0 + 2 & 0x3;
                class260 var62;
                if (var11.field3107 == -1 && var11.field3163 == null && var11.field3125 == null && !var11.field3139) {
                    class276 var61 = var11.method1586(var19, arg9, 4, var21, var18, var26, var29, var60 + 4, var20, -123, (class153) null);
                    if (class47.field623 && var29) {
                        class151.method1162(var61.field3958, var19, var22, var20);
                    }
                    var62 = var61.field3952;
                } else {
                    var62 = new class291(arg2, 4, var60 + 4, arg3, arg4, arg7, -1, var11.field3140, (class260) null);
                }
                class62.method456(arg1, arg4, arg7, var21, var62, (class260) null, 256, var60, 0, 0, var27);
            } else if (arg10 == 8) {
                int var50 = 8;
                long var51 = class9.method62(arg1, arg4, arg7);
                if (var51 != 0L) {
                    var50 = class345.method2392((int) (var51 >>> 32) & Integer.MAX_VALUE, 0).field3084 / 2;
                }
                int var53 = arg0 + 2 & 0x3;
                class260 var57;
                class260 var59;
                if (var11.field3107 == -1 && var11.field3163 == null && var11.field3125 == null && !var11.field3139) {
                    int var54 = class165.field2320[arg0] * 8;
                    int var55 = class248.field3609[arg0] * 8;
                    class276 var56 = var11.method1586(var19, arg9, 4, var21, var18, var26, var29, arg0 + 4, var20, -113, (class153) null);
                    if (class47.field623 && var29) {
                        class151.method1162(var56.field3958, var19 - var54, var22, var20 - var55);
                    }
                    var57 = var56.field3952;
                    class276 var58 = var11.method1586(var19, arg9, 4, var21, var18, var26, var29, var53 + 4, var20, arg5 - 117, (class153) null);
                    if (class47.field623 && var29) {
                        class151.method1162(var58.field3958, var19 - var54, var22, var20 - var55);
                    }
                    var59 = var58.field3952;
                } else {
                    var57 = new class291(arg2, 4, arg0 + 4, arg3, arg4, arg7, -1, var11.field3140, (class260) null);
                    var59 = new class291(arg2, 4, var53 + 4, arg3, arg4, arg7, -1, var11.field3140, (class260) null);
                }
                class62.method456(arg1, arg4, arg7, var21, var57, var59, 256, arg0, class165.field2320[arg0] * var50, class248.field3609[arg0] * var50, var27);
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILfh;ILfh;I)Lke;", line = 712)
    public static final class230 method1260(int arg0, class140 arg1, int arg2, class140 arg3, int arg4) {
        field2370++;
        return class134.method1020(arg4, arg3, arg2, arg0) ? class175.method1291(arg1.method1089(arg2, (byte) 110, arg0), (byte) -81) : null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 724)
    public static void method1261(int arg0) {
        field2371 = null;
        field2365 = null;
        if (arg0 != 1) {
            field2369 = 33;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIILvc;IJ)Z", line = 735)
    private static final boolean method1262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class260 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class283.method1925(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIIIIIIIIII)V", line = 753)
    public static final void method1263(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2373++;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                class277.field3967[var11][var12] = 0;
                class323.field4735[var11][var12] = 99999999;
            }
        }
        int var13 = arg7;
        int var14 = arg1;
        byte var15 = 0;
        class277.field3967[arg7][arg1] = 99;
        int var16 = 0;
        class323.field4735[arg7][arg1] = 0;
        class274.field3926[var15] = arg7;
        int var29 = var15 + 1;
        class199.field2805[var15] = arg1;
        boolean var17 = false;
        int[][] var18 = class231.field3312[class56.field724].field89;
        while (var29 != var16) {
            var14 = class199.field2805[var16];
            var13 = class274.field3926[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg2 == var13 && arg5 == var14) {
                var17 = true;
                break;
            }
            if (arg6 != 0) {
                if ((arg6 < 5 || arg6 == 10) && class231.field3312[class56.field724].method51(arg5, arg4, var14, var13, (byte) -120, arg2, 1, arg6 - 1)) {
                    var17 = true;
                    break;
                }
                if (arg6 < 10 && class231.field3312[class56.field724].method54(arg2, var13, arg5, 1024, var14, arg6 - 1, arg4, 1)) {
                    var17 = true;
                    break;
                }
            }
            if (arg10 != 0 && arg3 != 0 && class231.field3312[class56.field724].method47(var14, -1, arg8, 1, arg5, arg2, arg3, arg10, var13)) {
                var17 = true;
                break;
            }
            int var19 = class323.field4735[var13][var14] + 1;
            if (var13 > 0 && class277.field3967[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x2C0108) == 0) {
                class274.field3926[var29] = var13 - 1;
                class199.field2805[var29] = var14;
                var29 = var29 + 1 & 0xFFF;
                class277.field3967[var13 - 1][var14] = 2;
                class323.field4735[var13 - 1][var14] = var19;
            }
            if (var13 < 103 && class277.field3967[var13 + 1][var14] == 0 && (var18[var13 + 1][var14] & 0x2C0180) == 0) {
                class274.field3926[var29] = var13 + 1;
                class199.field2805[var29] = var14;
                class277.field3967[var13 + 1][var14] = 8;
                var29 = var29 + 1 & 0xFFF;
                class323.field4735[var13 + 1][var14] = var19;
            }
            if (var14 > 0 && class277.field3967[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x2C0102) == 0) {
                class274.field3926[var29] = var13;
                class199.field2805[var29] = var14 - 1;
                class277.field3967[var13][var14 - 1] = 1;
                var29 = var29 + 1 & 0xFFF;
                class323.field4735[var13][var14 - 1] = var19;
            }
            if (var14 < 103 && class277.field3967[var13][var14 + 1] == 0 && (var18[var13][var14 + 1] & 0x2C0120) == 0) {
                class274.field3926[var29] = var13;
                class199.field2805[var29] = var14 + 1;
                class277.field3967[var13][var14 + 1] = 4;
                var29 = var29 + 1 & 0xFFF;
                class323.field4735[var13][var14 + 1] = var19;
            }
            if (var13 > 0 && var14 > 0 && class277.field3967[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14 - 1] & 0x2C010E) == 0 && (var18[var13 - 1][var14] & 0x2C0108) == 0 && (var18[var13][var14 - 1] & 0x2C0102) == 0) {
                class274.field3926[var29] = var13 - 1;
                class199.field2805[var29] = var14 - 1;
                class277.field3967[var13 - 1][var14 - 1] = 3;
                var29 = var29 + 1 & 0xFFF;
                class323.field4735[var13 - 1][var14 - 1] = var19;
            }
            if (var13 < 103 && var14 > 0 && class277.field3967[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x2C0183) == 0 && (var18[var13 + 1][var14] & 0x2C0180) == 0 && (var18[var13][var14 - 1] & 0x2C0102) == 0) {
                class274.field3926[var29] = var13 + 1;
                class199.field2805[var29] = var14 - 1;
                var29 = var29 + 1 & 0xFFF;
                class277.field3967[var13 + 1][var14 - 1] = 9;
                class323.field4735[var13 + 1][var14 - 1] = var19;
            }
            if (var13 > 0 && var14 < 103 && class277.field3967[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x2C0138) == 0 && (var18[var13 - 1][var14] & 0x2C0108) == 0 && (var18[var13][var14 + 1] & 0x2C0120) == 0) {
                class274.field3926[var29] = var13 - 1;
                class199.field2805[var29] = var14 + 1;
                var29 = var29 + 1 & 0xFFF;
                class277.field3967[var13 - 1][var14 + 1] = 6;
                class323.field4735[var13 - 1][var14 + 1] = var19;
            }
            if (var13 < 103 && var14 < 103 && class277.field3967[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 1] & 0x2C01E0) == 0 && (var18[var13 + 1][var14] & 0x2C0180) == 0 && (var18[var13][var14 + 1] & 0x2C0120) == 0) {
                class274.field3926[var29] = var13 + 1;
                class199.field2805[var29] = var14 + 1;
                var29 = var29 + 1 & 0xFFF;
                class277.field3967[var13 + 1][var14 + 1] = 12;
                class323.field4735[var13 + 1][var14 + 1] = var19;
            }
        }
        if (!var17) {
            if (!arg0) {
                return;
            }
            int var20 = 1000;
            byte var21 = 10;
            int var22 = 100;
            for (int var23 = arg2 - var21; var23 <= (arg2 + var21); var23++) {
                for (int var24 = arg5 - var21; var24 <= arg5 + var21; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class323.field4735[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg2 > var23) {
                            var25 = arg2 - var23;
                        } else if ((arg2 + arg10 - 1) < var23) {
                            var25 = var23 + 1 - (arg2 + arg10);
                        }
                        int var26 = 0;
                        if (arg5 > var24) {
                            var26 = arg5 - var24;
                        } else if ((arg5 - (1 - arg3)) < var24) {
                            var26 = var24 + 1 - arg3 - arg5;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && var22 > class323.field4735[var23][var24]) {
                            var14 = var24;
                            var22 = class323.field4735[var23][var24];
                            var20 = var27;
                            var13 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return;
            }
            if (arg7 == var13 && arg1 == var14) {
                return;
            }
        }
        int var28 = -31 % ((arg9 + 29) / 46);
        class116.field1499 = var13;
        class133.field1818 = false;
        class5.field53 = var14;
    }
}
