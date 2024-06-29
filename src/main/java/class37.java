import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class37 {

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Lhh;")
    public static class163 field623 = class137.method1065("(Udns", 17);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "[I")
    public static int[] field621 = new int[32];

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Lhh;")
    public static class163 field624 = class137.method1065("name_icons", 17);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Lhh;")
    public static class163 field622 = class137.method1065("m-Ochte mit Ihnen handeln)3", 17);

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Lhh;")
    public static class163 field630 = class137.method1065("Zugewiesener Speicher)3", 17);

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Lhh;")
    public static class163 field627 = class137.method1065(" steht bereits auf Ihrer Freunde)2Liste(Q", 17);

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Lhh;")
    public static class163 field632 = class137.method1065("k", 17);

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "[I")
    public static int[] field631;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZIIIIIIIII)Z")
    public static final boolean method266(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field628++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class140.field2668[var12][var31] = 0;
                class180.field3256[var12][var31] = 99999999;
            }
        }
        if (arg0 != 4800) {
            return true;
        }
        class140.field2668[arg8][arg3] = 99;
        int var13 = arg8;
        class180.field3256[arg8][arg3] = 0;
        byte var14 = 0;
        int var15 = 0;
        class197.field3552[var14] = arg8;
        boolean var16 = false;
        int var32 = var14 + 1;
        class96.field1816[var14] = arg3;
        int var17 = arg3;
        int[][] var18 = class140.field2670[class20.field323].field11;
        while (var32 != var15) {
            var13 = class197.field3552[var15];
            var17 = class96.field1816[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg6 == var13 && arg11 == var17) {
                var16 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && class140.field2670[class20.field323].method12(var13, arg6, arg11, 2, arg4 - 1, true, arg9, var17)) {
                    var16 = true;
                    break;
                }
                if (arg4 < 10 && class140.field2670[class20.field323].method10(arg11, arg4 - 1, var13, arg6, arg9, 2, var17, 0)) {
                    var16 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg10 != 0 && class140.field2670[class20.field323].method1(arg5, var13, var17, arg10, 2, arg11, arg0 ^ 0xFFFFED47, arg1, arg6)) {
                var16 = true;
                break;
            }
            int var30 = class180.field3256[var13][var17] + 1;
            if (var13 > 0 && class140.field2668[var13 - 1][var17] == 0 && (var18[var13 - 1][var17] & 0x12C010E) == 0 && (var18[var13 - 1][var17 + 1] & 0x12C0138) == 0) {
                class197.field3552[var32] = var13 - 1;
                class96.field1816[var32] = var17;
                class140.field2668[var13 - 1][var17] = 2;
                class180.field3256[var13 - 1][var17] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && class140.field2668[var13 + 1][var17] == 0 && (var18[var13 + 2][var17] & 0x12C0183) == 0 && (var18[var13 + 2][var17 + 1] & 0x12C01E0) == 0) {
                class197.field3552[var32] = var13 + 1;
                class96.field1816[var32] = var17;
                class140.field2668[var13 + 1][var17] = 8;
                var32 = var32 + 1 & 0xFFF;
                class180.field3256[var13 + 1][var17] = var30;
            }
            if (var17 > 0 && class140.field2668[var13][var17 - 1] == 0 && (var18[var13][var17 - 1] & 0x12C010E) == 0 && (var18[var13 + 1][var17 - 1] & 0x12C0183) == 0) {
                class197.field3552[var32] = var13;
                class96.field1816[var32] = var17 - 1;
                class140.field2668[var13][var17 - 1] = 1;
                class180.field3256[var13][var17 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var17 < 102 && class140.field2668[var13][var17 + 1] == 0 && (var18[var13][var17 + 2] & 0x12C0138) == 0 && (var18[var13 + 1][var17 + 2] & 0x12C01E0) == 0) {
                class197.field3552[var32] = var13;
                class96.field1816[var32] = var17 + 1;
                var32 = var32 + 1 & 0xFFF;
                class140.field2668[var13][var17 + 1] = 4;
                class180.field3256[var13][var17 + 1] = var30;
            }
            if (var13 > 0 && var17 > 0 && class140.field2668[var13 - 1][var17 - 1] == 0 && (var18[var13 - 1][var17] & 0x12C0138) == 0 && (var18[var13 - 1][var17 - 1] & 0x12C010E) == 0 && (var18[var13][var17 - 1] & 0x12C0183) == 0) {
                class197.field3552[var32] = var13 - 1;
                class96.field1816[var32] = var17 - 1;
                class140.field2668[var13 - 1][var17 - 1] = 3;
                class180.field3256[var13 - 1][var17 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && var17 > 0 && class140.field2668[var13 + 1][var17 - 1] == 0 && (var18[var13 + 1][var17 - 1] & 0x12C010E) == 0 && (var18[var13 + 2][var17 - 1] & 0x12C0183) == 0 && (var18[var13 + 2][var17] & 0x12C01E0) == 0) {
                class197.field3552[var32] = var13 + 1;
                class96.field1816[var32] = var17 - 1;
                class140.field2668[var13 + 1][var17 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class180.field3256[var13 + 1][var17 - 1] = var30;
            }
            if (var13 > 0 && var17 < 102 && class140.field2668[var13 - 1][var17 + 1] == 0 && (var18[var13 - 1][var17 + 1] & 0x12C010E) == 0 && (var18[var13 - 1][var17 + 2] & 0x12C0138) == 0 && (var18[var13][var17 + 2] & 0x12C01E0) == 0) {
                class197.field3552[var32] = var13 - 1;
                class96.field1816[var32] = var17 + 1;
                class140.field2668[var13 - 1][var17 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class180.field3256[var13 - 1][var17 + 1] = var30;
            }
            if (var13 < 102 && var17 < 102 && class140.field2668[var13 + 1][var17 + 1] == 0 && (var18[var13 + 1][var17 + 2] & 0x12C0138) == 0 && (var18[var13 + 2][var17 + 2] & 0x12C01E0) == 0 && (var18[var13 + 2][var17 + 1] & 0x12C0183) == 0) {
                class197.field3552[var32] = var13 + 1;
                class96.field1816[var32] = var17 + 1;
                var32 = var32 + 1 & 0xFFF;
                class140.field2668[var13 + 1][var17 + 1] = 12;
                class180.field3256[var13 + 1][var17 + 1] = var30;
            }
        }
        class260.field4551 = 0;
        if (!var16) {
            if (!arg2) {
                return false;
            }
            int var19 = 1000;
            byte var20 = 10;
            int var21 = 100;
            for (int var22 = arg6 - var20; var22 <= (arg6 + var20); var22++) {
                for (int var23 = arg11 - var20; var23 <= arg11 + var20; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class180.field3256[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (arg11 > var23) {
                            var24 = arg11 - var23;
                        } else if (arg10 + arg11 - 1 < var23) {
                            var24 = var23 + 1 - arg10 - arg11;
                        }
                        if (arg6 > var22) {
                            var25 = arg6 - var22;
                        } else if ((arg5 + arg6 - 1) < var22) {
                            var25 = var22 + 1 - arg5 - arg6;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var26 < var19 || var19 == var26 && class180.field3256[var22][var23] < var21) {
                            var21 = class180.field3256[var22][var23];
                            var13 = var22;
                            var17 = var23;
                            var19 = var26;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg8 == var13 && arg3 == var17) {
                return false;
            }
            class260.field4551 = 1;
        }
        byte var27 = 0;
        class197.field3552[var27] = var13;
        int var33 = var27 + 1;
        class96.field1816[var27] = var17;
        int var28;
        int var29 = var28 = class140.field2668[var13][var17];
        while (arg8 != var13 || arg3 != var17) {
            if (var28 != var29) {
                class197.field3552[var33] = var13;
                var28 = var29;
                class96.field1816[var33++] = var17;
            }
            if ((var29 & 0x1) != 0) {
                var17++;
            } else if ((var29 & 0x4) != 0) {
                var17--;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            var29 = class140.field2668[var13][var17];
        }
        if (var33 > 0) {
            class248.method1703(var33, arg7, 3);
            return true;
        } else if (arg7 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public static final void method267(byte arg0) {
        class1.field14++;
        field626++;
        class191.field3499.method75(169, 83);
        if (arg0 != 12) {
            field624 = null;
        }
        class191.field3499.method651(-645765520, 0L);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZI)I")
    public static final int method268(boolean arg0, int arg1) {
        if (!arg0) {
            method269(false);
        }
        field629++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
    public static void method269(boolean arg0) {
        field630 = null;
        field622 = null;
        field623 = null;
        field632 = null;
        field621 = null;
        field624 = null;
        field631 = null;
        field627 = null;
        if (!arg0) {
            method268(false, -108);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIII)V")
    public static final void method270(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field625++;
        long var6 = class243.method1681(arg4, arg1, arg3);
        if (var6 != 0L) {
            int var8 = ((int) var6 & 0x345CF3) >> 20;
            int var9 = (int) var6 >> 14 & 0x1F;
            int var10 = arg0;
            int var11 = (52736 - (arg3 * 512)) * 4 + ((arg1 * 4) + 24624);
            if (var6 > 0L) {
                var10 = arg2;
            }
            int var12 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            int[] var13 = class206.field3716;
            class35 var14 = class9.method64(false, var12);
            if (var14.field557 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var13[var11] = var10;
                        var13[var11 + 512] = var10;
                        var13[var11 + 1024] = var10;
                        var13[var11 + 1536] = var10;
                    } else if (var8 == 1) {
                        var13[var11] = var10;
                        var13[var11 + 1] = var10;
                        var13[var11 + 2] = var10;
                        var13[var11 + 3] = var10;
                    } else if (var8 == 2) {
                        var13[var11 + 3] = var10;
                        var13[var11 + 515] = var10;
                        var13[var11 + 1024 + 3] = var10;
                        var13[var11 + 1536 + 3] = var10;
                    } else if (var8 == 3) {
                        var13[var11 + 1536] = var10;
                        var13[var11 + 1536 + 1] = var10;
                        var13[var11 + 1538] = var10;
                        var13[var11 + 1536 + 3] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var13[var11] = var10;
                    } else if (var8 == 1) {
                        var13[var11 + 3] = var10;
                    } else if (var8 == 2) {
                        var13[var11 + 1539] = var10;
                    } else if (var8 == 3) {
                        var13[var11 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var13[var11] = var10;
                        var13[var11 + 512] = var10;
                        var13[var11 + 1024] = var10;
                        var13[var11 + 1536] = var10;
                    } else if (var8 == 0) {
                        var13[var11] = var10;
                        var13[var11 + 1] = var10;
                        var13[var11 + 2] = var10;
                        var13[var11 + 3] = var10;
                    } else if (var8 == 1) {
                        var13[var11 + 3] = var10;
                        var13[var11 + 515] = var10;
                        var13[var11 + 1024 + 3] = var10;
                        var13[var11 + 1536 + 3] = var10;
                    } else if (var8 == 2) {
                        var13[var11 + 1536] = var10;
                        var13[var11 + 1536 + 1] = var10;
                        var13[var11 + 2 + 1536] = var10;
                        var13[var11 + 1539] = var10;
                    }
                }
            } else {
                class242 var15 = null;
                if (!var14.field584) {
                    var15 = class238.field4243[var14.field557];
                } else if (var8 == 0) {
                    var15 = class238.field4243[var14.field557];
                } else if (var8 == 1) {
                    var15 = class239.field4248[var14.field557];
                } else if (var8 == 2) {
                    var15 = class64.field1080[var14.field557];
                } else if (var8 == 3) {
                    var15 = class107.field2042[var14.field557];
                }
                if (var15 != null) {
                    int var16 = (var14.field591 * 4 - var15.field1785) / 2;
                    int var17 = (var14.field574 * 4 - var15.field1784) / 2;
                    var15.method751(arg1 * 4 + var17 + 48, var16 + 48 - -((-var14.field591 + 104 - arg3) * 4));
                }
            }
        }
        long var18 = class19.method134(arg4, arg1, arg3);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 20 & 0x3;
            int var21 = (int) var18 >> 14 & 0x1F;
            int var22 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            class35 var23 = class9.method64(false, var22);
            if (var23.field557 != -1) {
                class242 var24 = null;
                if (!var23.field584) {
                    var24 = class238.field4243[var23.field557];
                } else if (var20 == 0) {
                    var24 = class238.field4243[var23.field557];
                } else if (var20 == 1) {
                    var24 = class239.field4248[var23.field557];
                } else if (var20 == 2) {
                    var24 = class64.field1080[var23.field557];
                } else if (var20 == 3) {
                    var24 = class107.field2042[var23.field557];
                }
                if (var24 != null) {
                    int var25 = (var23.field591 * 4 - var24.field1785) / 2;
                    int var26 = (var23.field574 * 4 - var24.field1784) / 2;
                    var24.method751((arg1 * 4) + var26 + 48, (104 - var23.field591 + -arg3) * 4 + 48 + var25);
                }
            } else if (var21 == 9) {
                int var27 = 15658734;
                int var28 = arg1 * 4 + (((52736 - arg3 * 512) * 4) + 24624);
                int[] var29 = class206.field3716;
                if (var18 > 0L) {
                    var27 = 15597568;
                }
                if (var20 == 0 || var20 == 2) {
                    var29[var28 + 1536] = var27;
                    var29[var28 + 1024 + 1] = var27;
                    var29[var28 + 514] = var27;
                    var29[var28 + 3] = var27;
                } else {
                    var29[var28] = var27;
                    var29[var28 + 1 + 512] = var27;
                    var29[var28 + 1024 + 2] = var27;
                    var29[var28 + 1536 + 3] = var27;
                }
            }
        }
        if (arg5 != 2) {
            field631 = null;
        }
        long var30 = class219.method1553(arg4, arg1, arg3);
        if (var30 == 0L) {
            return;
        }
        int var32 = Integer.MAX_VALUE & (int) (var30 >>> 32);
        class35 var33 = class9.method64(false, var32);
        int var34 = (int) var30 >> 20 & 0x3;
        if (var33.field557 == -1) {
            return;
        }
        class242 var35 = null;
        if (!var33.field584) {
            var35 = class238.field4243[var33.field557];
        } else if (var34 == 0) {
            var35 = class238.field4243[var33.field557];
        } else if (var34 == 1) {
            var35 = class239.field4248[var33.field557];
        } else if (var34 == 2) {
            var35 = class64.field1080[var33.field557];
        } else if (var34 == 3) {
            var35 = class107.field2042[var33.field557];
        }
        if (var35 != null) {
            int var36 = (var33.field574 * 4 - var35.field1784) / 2;
            int var37 = (var33.field591 * 4 - var35.field1785) / 2;
            var35.method751(arg1 * 4 + var36 + 48, (-arg3 + 104 + -var33.field591) * 4 + 48 + var37);
            return;
        }
    }
}
