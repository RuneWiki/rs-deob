import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class204 {

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Z")
    public static boolean field2899 = false;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Lrc;")
    public static class9 field2898 = new class9(64);

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field2906 = 3;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "[I")
    public static int[] field2908 = new int[4096];

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Lbc;")
    public static class282 field2905;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Lse;")
    public static class89 field2904;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "[I")
    public static int[] field2909;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "[Lck;")
    public static class1[] field2903;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZIIIZLhl;BIIII)V")
    public static final void method1314(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, class137 arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        field2901++;
        if (arg0 && !class176.method1141(1) && (class241.field3507[0][arg9][arg8] & 0x2) == 0) {
            if ((class241.field3507[arg7][arg9][arg8] & 0x10) != 0) {
                return;
            }
            if (class101.method618(arg7, false, arg9, arg8) != class251.field3626) {
                return;
            }
        }
        if (class2.field30 > arg7) {
            class2.field30 = arg7;
        }
        class273 var11 = class164.method1081(arg6 ^ 0x76, arg10);
        int var12;
        int var13;
        if (arg3 == 1 || arg3 == 3) {
            var12 = var11.field4008;
            var13 = var11.field4023;
        } else {
            var12 = var11.field4023;
            var13 = var11.field4008;
        }
        int var14;
        int var15;
        if ((arg9 + var13) <= 104) {
            var14 = (var13 + 1 >> 1) + arg9;
            var15 = (var13 >> 1) + arg9;
        } else {
            var14 = arg9 + 1;
            var15 = arg9;
        }
        int var16;
        int var17;
        if (arg8 + var12 > 104) {
            var16 = arg8;
            var17 = arg8 + 1;
        } else {
            var16 = (var12 >> 1) + arg8;
            var17 = (var12 + 1 >> 1) + arg8;
        }
        int[][] var18 = class290.field4536[arg1];
        int var19 = var18[var14][var16] + var18[var15][var16] + var18[var15][var17] + var18[var14][var17] >> 2;
        int var20 = (arg9 << 7) + (var13 << 6);
        if (arg6 != 118) {
            method1316(-22);
        }
        int var21 = (arg8 << 7) + (var12 << 6);
        int[][] var22 = null;
        if (arg4) {
            var22 = class180.field2550[0];
        } else if (arg1 < 3) {
            var22 = class290.field4536[arg1 + 1];
        }
        long var23 = (long) (arg9 | arg8 << 7 | arg2 << 14 | arg3 << 20 | 0x40000000);
        if (var11.field4050 == 0 || arg4) {
            var23 |= Long.MIN_VALUE;
        }
        if (var11.field4057 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field4022) {
            var23 |= 0x80000000L;
        }
        if (var11.method1756((byte) 121)) {
            class287.method1931(arg3, 128, arg8, (class54) null, arg9, (class240) null, arg7, var11);
        }
        long var25 = var23 | (long) arg10 << 32;
        boolean var27 = var11.field3992 & !arg4;
        int var28 = var11.field4052;
        if (arg2 == 22) {
            if (class149.field2169 || var11.field4050 != 0 || var11.field4016 == 1 || var11.field4021) {
                class131 var30;
                if (var28 == -1 && var11.field3991 == null && !var11.field4046) {
                    class280 var29 = var11.method1746((class43) null, arg3, var19, var27, var18, arg0, 22, var22, var21, -10, var20);
                    var30 = var29.field4248;
                } else {
                    var30 = new class122(arg10, 22, arg3, arg1, arg9, arg8, var28, var11.field4001, (class131) null);
                }
                class77.method468(arg7, arg9, arg8, var19, var30, var25, var11.field3998);
                if (var11.field4016 == 1 && arg5 != null) {
                    arg5.method894(arg8, arg9, true);
                }
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class131 var70;
            if (var28 == -1 && var11.field3991 == null && !var11.field4046) {
                class280 var69 = var11.method1746((class43) null, arg2 == 11 ? arg3 + 4 : arg3, var19, var27, var18, arg0, 10, var22, var21, arg6 ^ 0xFFFFFF80, var20);
                var70 = var69.field4248;
            } else {
                var70 = new class122(arg10, 10, arg2 == 11 ? arg3 + 4 : arg3, arg1, arg9, arg8, var28, var11.field4001, (class131) null);
            }
            if (var70 != null) {
                boolean var71 = class180.method1170(arg7, arg9, arg8, var19, var13, var12, var70, 0, var25);
                if (var11.field3990 && var71 && arg0) {
                    int var72 = 15;
                    if (var70 instanceof class106) {
                        var72 = ((class106) var70).method657() / 4;
                        if (var72 > 30) {
                            var72 = 30;
                        }
                    }
                    for (int var73 = 0; var73 <= var13; var73++) {
                        for (int var74 = 0; var74 <= var12; var74++) {
                            if (class263.field3812[arg7][arg9 + var73][arg8 + var74] < var72) {
                                class263.field3812[arg7][arg9 + var73][arg8 + var74] = (byte) var72;
                            }
                        }
                    }
                }
            }
            if (var11.field4016 != 0 && arg5 != null) {
                arg5.method900(var13, arg6 - 119, !var11.field4043, arg8, arg9, var11.field4063, var12);
            }
        } else if (arg2 >= 12) {
            class131 var32;
            if (var28 == -1 && var11.field3991 == null && !var11.field4046) {
                class280 var31 = var11.method1746((class43) null, arg3, var19, var27, var18, arg0, arg2, var22, var21, arg6 - 128, var20);
                var32 = var31.field4248;
            } else {
                var32 = new class122(arg10, arg2, arg3, arg1, arg9, arg8, var28, var11.field4001, (class131) null);
            }
            class180.method1170(arg7, arg9, arg8, var19, 1, 1, var32, 0, var25);
            if (arg0 && arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg7 > 0 && var11.field4027 != 0) {
                class64.field751[arg7][arg9][arg8] = class220.method1432(class64.field751[arg7][arg9][arg8], 4);
            }
            if (var11.field4016 != 0 && arg5 != null) {
                arg5.method900(var13, -1, !var11.field4043, arg8, arg9, var11.field4063, var12);
            }
        } else if (arg2 == 0) {
            class131 var34;
            if (var28 == -1 && var11.field3991 == null && !var11.field4046) {
                class280 var33 = var11.method1746((class43) null, arg3, var19, var27, var18, arg0, 0, var22, var21, -10, var20);
                var34 = var33.field4248;
            } else {
                var34 = new class122(arg10, 0, arg3, arg1, arg9, arg8, var28, var11.field4001, (class131) null);
            }
            class119.method779(arg7, arg9, arg8, var19, var34, (class131) null, class283.field4316[arg3], 0, var25);
            if (arg0) {
                if (arg3 == 0) {
                    if (var11.field3990) {
                        class263.field3812[arg7][arg9][arg8] = 50;
                        class263.field3812[arg7][arg9][arg8 + 1] = 50;
                    }
                    if (var11.field4027 == 1) {
                        class64.field751[arg7][arg9][arg8] = class220.method1432(class64.field751[arg7][arg9][arg8], 1);
                    }
                } else if (arg3 == 1) {
                    if (var11.field3990) {
                        class263.field3812[arg7][arg9][arg8 + 1] = 50;
                        class263.field3812[arg7][arg9 + 1][arg8 + 1] = 50;
                    }
                    if (var11.field4027 == 1) {
                        class64.field751[arg7][arg9][arg8 + 1] = class220.method1432(class64.field751[arg7][arg9][arg8 + 1], 2);
                    }
                } else if (arg3 == 2) {
                    if (var11.field3990) {
                        class263.field3812[arg7][arg9 + 1][arg8] = 50;
                        class263.field3812[arg7][arg9 + 1][arg8 + 1] = 50;
                    }
                    if (var11.field4027 == 1) {
                        class64.field751[arg7][arg9 + 1][arg8] = class220.method1432(class64.field751[arg7][arg9 + 1][arg8], 1);
                    }
                } else if (arg3 == 3) {
                    if (var11.field3990) {
                        class263.field3812[arg7][arg9][arg8] = 50;
                        class263.field3812[arg7][arg9 + 1][arg8] = 50;
                    }
                    if (var11.field4027 == 1) {
                        class64.field751[arg7][arg9][arg8] = class220.method1432(class64.field751[arg7][arg9][arg8], 2);
                    }
                }
            }
            if (var11.field4016 != 0 && arg5 != null) {
                arg5.method899(arg2, arg9, !var11.field4043, var11.field4063, (byte) -74, arg8, arg3);
            }
            if (var11.field4009 != 16) {
                class266.method1702(arg7, arg9, arg8, var11.field4009);
            }
        } else if (arg2 == 1) {
            class131 var36;
            if (var28 == -1 && var11.field3991 == null && !var11.field4046) {
                class280 var35 = var11.method1746((class43) null, arg3, var19, var27, var18, arg0, 1, var22, var21, arg6 ^ 0xFFFFFF80, var20);
                var36 = var35.field4248;
            } else {
                var36 = new class122(arg10, 1, arg3, arg1, arg9, arg8, var28, var11.field4001, (class131) null);
            }
            class119.method779(arg7, arg9, arg8, var19, var36, (class131) null, client.field4442[arg3], 0, var25);
            if (var11.field3990 && arg0) {
                if (arg3 == 0) {
                    class263.field3812[arg7][arg9][arg8 + 1] = 50;
                } else if (arg3 == 1) {
                    class263.field3812[arg7][arg9 + 1][arg8 + 1] = 50;
                } else if (arg3 == 2) {
                    class263.field3812[arg7][arg9 + 1][arg8] = 50;
                } else if (arg3 == 3) {
                    class263.field3812[arg7][arg9][arg8] = 50;
                }
            }
            if (var11.field4016 != 0 && arg5 != null) {
                arg5.method899(arg2, arg9, !var11.field4043, var11.field4063, (byte) -74, arg8, arg3);
            }
        } else if (arg2 == 2) {
            int var37 = arg3 + 1 & 0x3;
            class131 var39;
            class131 var41;
            if (var28 == -1 && var11.field3991 == null && !var11.field4046) {
                class280 var38 = var11.method1746((class43) null, arg3 + 4, var19, var27, var18, arg0, 2, var22, var21, arg6 ^ 0xFFFFFF80, var20);
                var39 = var38.field4248;
                class280 var40 = var11.method1746((class43) null, var37, var19, var27, var18, arg0, 2, var22, var21, -10, var20);
                var41 = var40.field4248;
            } else {
                var39 = new class122(arg10, 2, arg3 + 4, arg1, arg9, arg8, var28, var11.field4001, (class131) null);
                var41 = new class122(arg10, 2, var37, arg1, arg9, arg8, var28, var11.field4001, (class131) null);
            }
            class119.method779(arg7, arg9, arg8, var19, var39, var41, class283.field4316[arg3], class283.field4316[var37], var25);
            if (var11.field4027 == 1 && arg0) {
                if (arg3 == 0) {
                    class64.field751[arg7][arg9][arg8] = class220.method1432(class64.field751[arg7][arg9][arg8], 1);
                    class64.field751[arg7][arg9][arg8 + 1] = class220.method1432(class64.field751[arg7][arg9][arg8 + 1], 2);
                } else if (arg3 == 1) {
                    class64.field751[arg7][arg9][arg8 + 1] = class220.method1432(class64.field751[arg7][arg9][arg8 + 1], 2);
                    class64.field751[arg7][arg9 + 1][arg8] = class220.method1432(class64.field751[arg7][arg9 + 1][arg8], 1);
                } else if (arg3 == 2) {
                    class64.field751[arg7][arg9 + 1][arg8] = class220.method1432(class64.field751[arg7][arg9 + 1][arg8], 1);
                    class64.field751[arg7][arg9][arg8] = class220.method1432(class64.field751[arg7][arg9][arg8], 2);
                } else if (arg3 == 3) {
                    class64.field751[arg7][arg9][arg8] = class220.method1432(class64.field751[arg7][arg9][arg8], 2);
                    class64.field751[arg7][arg9][arg8] = class220.method1432(class64.field751[arg7][arg9][arg8], 1);
                }
            }
            if (var11.field4016 != 0 && arg5 != null) {
                arg5.method899(arg2, arg9, !var11.field4043, var11.field4063, (byte) -74, arg8, arg3);
            }
            if (var11.field4009 != 16) {
                class266.method1702(arg7, arg9, arg8, var11.field4009);
            }
        } else if (arg2 == 3) {
            class131 var43;
            if (var28 == -1 && var11.field3991 == null && !var11.field4046) {
                class280 var42 = var11.method1746((class43) null, arg3, var19, var27, var18, arg0, 3, var22, var21, -10, var20);
                var43 = var42.field4248;
            } else {
                var43 = new class122(arg10, 3, arg3, arg1, arg9, arg8, var28, var11.field4001, (class131) null);
            }
            class119.method779(arg7, arg9, arg8, var19, var43, (class131) null, client.field4442[arg3], 0, var25);
            if (var11.field3990 && arg0) {
                if (arg3 == 0) {
                    class263.field3812[arg7][arg9][arg8 + 1] = 50;
                } else if (arg3 == 1) {
                    class263.field3812[arg7][arg9 + 1][arg8 + 1] = 50;
                } else if (arg3 == 2) {
                    class263.field3812[arg7][arg9 + 1][arg8] = 50;
                } else if (arg3 == 3) {
                    class263.field3812[arg7][arg9][arg8] = 50;
                }
            }
            if (var11.field4016 != 0 && arg5 != null) {
                arg5.method899(arg2, arg9, !var11.field4043, var11.field4063, (byte) -74, arg8, arg3);
            }
        } else if (arg2 == 9) {
            class131 var45;
            if (var28 == -1 && var11.field3991 == null && !var11.field4046) {
                class280 var44 = var11.method1746((class43) null, arg3, var19, var27, var18, arg0, arg2, var22, var21, -10, var20);
                var45 = var44.field4248;
            } else {
                var45 = new class122(arg10, arg2, arg3, arg1, arg9, arg8, var28, var11.field4001, (class131) null);
            }
            class180.method1170(arg7, arg9, arg8, var19, 1, 1, var45, 0, var25);
            if (var11.field4016 != 0 && arg5 != null) {
                arg5.method900(var13, -1, !var11.field4043, arg8, arg9, var11.field4063, var12);
            }
            if (var11.field4009 != 16) {
                class266.method1702(arg7, arg9, arg8, var11.field4009);
            }
        } else if (arg2 == 4) {
            class131 var47;
            if (var28 == -1 && var11.field3991 == null && !var11.field4046) {
                class280 var46 = var11.method1746((class43) null, arg3, var19, var27, var18, arg0, 4, var22, var21, -10, var20);
                var47 = var46.field4248;
            } else {
                var47 = new class122(arg10, 4, arg3, arg1, arg9, arg8, var28, var11.field4001, (class131) null);
            }
            class141.method914(arg7, arg9, arg8, var19, var47, (class131) null, class283.field4316[arg3], 0, 0, 0, var25);
        } else if (arg2 == 5) {
            long var48 = class255.method1634(arg7, arg9, arg8);
            int var50 = 16;
            if (var48 != 0L) {
                var50 = class164.method1081(0, Integer.MAX_VALUE & (int) (var48 >>> 32)).field4009;
            }
            class131 var52;
            if (var28 == -1 && var11.field3991 == null && !var11.field4046) {
                class280 var51 = var11.method1746((class43) null, arg3, var19, var27, var18, arg0, 4, var22, var21, arg6 - 128, var20);
                var52 = var51.field4248;
            } else {
                var52 = new class122(arg10, 4, arg3, arg1, arg9, arg8, var28, var11.field4001, (class131) null);
            }
            class141.method914(arg7, arg9, arg8, var19, var52, (class131) null, class283.field4316[arg3], 0, class145.field2135[arg3] * var50, class159.field2307[arg3] * var50, var25);
        } else if (arg2 == 6) {
            long var53 = class255.method1634(arg7, arg9, arg8);
            int var55 = 8;
            if (var53 != 0L) {
                var55 = class164.method1081(arg6 ^ 0x76, (int) (var53 >>> 32) & Integer.MAX_VALUE).field4009 / 2;
            }
            class131 var57;
            if (var28 == -1 && var11.field3991 == null && !var11.field4046) {
                class280 var56 = var11.method1746((class43) null, arg3 + 4, var19, var27, var18, arg0, 4, var22, var21, arg6 ^ 0xFFFFFF80, var20);
                var57 = var56.field4248;
            } else {
                var57 = new class122(arg10, 4, arg3 + 4, arg1, arg9, arg8, var28, var11.field4001, (class131) null);
            }
            class141.method914(arg7, arg9, arg8, var19, var57, (class131) null, 256, arg3, class164.field2354[arg3] * var55, class46.field546[arg3] * var55, var25);
        } else if (arg2 == 7) {
            int var58 = arg3 + 2 & 0x3;
            class131 var60;
            if (var28 == -1 && var11.field3991 == null && !var11.field4046) {
                class280 var59 = var11.method1746((class43) null, var58 + 4, var19, var27, var18, arg0, 4, var22, var21, -10, var20);
                var60 = var59.field4248;
            } else {
                var60 = new class122(arg10, 4, var58 + 4, arg1, arg9, arg8, var28, var11.field4001, (class131) null);
            }
            class141.method914(arg7, arg9, arg8, var19, var60, (class131) null, 256, var58, 0, 0, var25);
        } else if (arg2 == 8) {
            int var61 = 8;
            long var62 = class255.method1634(arg7, arg9, arg8);
            if (var62 != 0L) {
                var61 = class164.method1081(arg6 - 118, Integer.MAX_VALUE & (int) (var62 >>> 32)).field4009 / 2;
            }
            int var64 = arg3 + 2 & 0x3;
            class131 var66;
            class131 var68;
            if (var28 == -1 && var11.field3991 == null && !var11.field4046) {
                class280 var65 = var11.method1746((class43) null, arg3 + 4, var19, var27, var18, arg0, 4, var22, var21, -10, var20);
                var66 = var65.field4248;
                class280 var67 = var11.method1746((class43) null, var64 + 4, var19, var27, var18, arg0, 4, var22, var21, -10, var20);
                var68 = var67.field4248;
            } else {
                var66 = new class122(arg10, 4, arg3 + 4, arg1, arg9, arg8, var28, var11.field4001, (class131) null);
                var68 = new class122(arg10, 4, var64 + 4, arg1, arg9, arg8, var28, var11.field4001, (class131) null);
            }
            class141.method914(arg7, arg9, arg8, var19, var66, var68, 256, arg3, class164.field2354[arg3] * var61, class46.field546[arg3] * var61, var25);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Lcf;")
    public static final class163 method1315(int arg0, int arg1, int arg2) {
        class133 var3 = class6.field94[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class163 var4 = var3.field1920;
            var3.field1920 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static void method1316(int arg0) {
        field2908 = null;
        field2904 = null;
        field2898 = null;
        field2905 = null;
        field2909 = null;
        if (arg0 < 30) {
            method1317((int[][]) null, 68);
        }
        field2903 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([[II)V")
    public static final void method1317(int[][] arg0, int arg1) {
        if (arg1 != -1) {
            field2902 = -54;
        }
        field2900++;
        class268.field3919 = arg0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BII[Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1318(byte arg0, int arg1, int arg2, String[] arg3) {
        field2897++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg3[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg2;
            int var6 = 0;
            if (arg0 >= -51) {
                field2906 = 5;
            }
            for (int var7 = arg2; var7 < var5; var7++) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg2; var9 < var5; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBIII)V")
    public static final void method1319(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2896++;
        if (arg0 - arg4 >= class177.field2514 && class279.field4238 >= arg0 + arg4 && class286.field4431 <= arg2 - arg4 && class230.field3302 >= arg2 + arg4) {
            class293.method1963(arg3, arg2, arg4, 2, arg0);
        } else {
            class125.method814(arg4, arg2, arg0, 85, arg3);
        }
        if (arg1 < 35) {
            field2899 = true;
        }
    }
}
