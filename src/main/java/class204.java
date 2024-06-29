import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class204 {

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field3155 = 0;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field3153 = 1;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field3158 = -1;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public int field3152;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Lgm;")
    public class119 field3151;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3157;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "[I")
    public int[] field3154;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lqf;III)V", line = 15)
    public static final void method1523(class64 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class154.field2492) {
            class329 var4 = class170.field2689[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field5062 != null && var4.field5062.field714.method390()) {
                arg0.method394(var4.field5062.field714, 128, 0, 0, true);
            }
        }
        if (arg3 < class154.field2492) {
            class329 var5 = class170.field2689[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field5062 != null && var5.field5062.field714.method390()) {
                arg0.method394(var5.field5062.field714, 0, 0, 128, true);
            }
        }
        if (arg2 < class154.field2492 && arg3 < class166.field2642) {
            class329 var6 = class170.field2689[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field5062 != null && var6.field5062.field714.method390()) {
                arg0.method394(var6.field5062.field714, 128, 0, 128, true);
            }
        }
        if (arg2 < class154.field2492 && arg3 > 0) {
            class329 var7 = class170.field2689[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field5062 != null && var7.field5062.field714.method390()) {
                arg0.method394(var7.field5062.field714, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 63)
    public static final void method1524(int arg0, Component arg1) {
        arg1.removeMouseListener(class236.field3674);
        int var2 = 17 % ((arg0 + 14) / 58);
        field3159++;
        arg1.removeMouseMotionListener(class236.field3674);
        arg1.removeFocusListener(class236.field3674);
        class53.field803 = 0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIZIIIIZILrk;)V", line = 82)
    public static final void method1525(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, class290 arg10) {
        field3156++;
        if (arg3 && !class158.method1282(false) && (class146.field2386[0][arg7][arg4] & 0x2) == 0) {
            if ((class146.field2386[arg6][arg7][arg4] & 0x10) != 0) {
                return;
            }
            if (class48.method465(arg6, arg0 - 44872, arg4, arg7) != class68.field1046) {
                return;
            }
        }
        if (arg6 < class176.field2782) {
            class176.field2782 = arg6;
        }
        class212 var11 = class43.method437(87, arg1);
        if (class240.field3737 && var11.field3317) {
            return;
        }
        int var12;
        int var13;
        if (arg9 == 1 || arg9 == 3) {
            var13 = var11.field3250;
            var12 = var11.field3306;
        } else {
            var12 = var11.field3250;
            var13 = var11.field3306;
        }
        int var14;
        int var15;
        if ((arg7 + var13) > 104) {
            var14 = arg7;
            var15 = arg7 + 1;
        } else {
            var14 = (var13 >> 1) + arg7;
            var15 = (var13 + 1 >> 1) + arg7;
        }
        int[][] var16 = class277.field4290[arg5];
        int var17;
        int var18;
        if (arg4 + var12 > 104) {
            var17 = arg4 + 1;
            var18 = arg4;
        } else {
            var18 = (var12 >> 1) + arg4;
            var17 = (var12 + 1 >> 1) + arg4;
        }
        int var19 = var16[var14][var17] + var16[var14][var18] + var16[var15][var17] + var16[var15][var18] >> 2;
        int var20 = (arg7 << 7) + (var13 << 6);
        int var21 = (arg4 << 7) + (var12 << 6);
        int var22 = 0;
        if (arg0 != 19330) {
            method1525(-4, 65, 102, false, -28, 2, -22, 86, true, -117, (class290) null);
        }
        if (class240.field3737 && arg5 != 0) {
            int[][] var23 = class277.field4290[0];
            var22 = var19 - (var23[var14][var17] + var23[var14][var18] + var23[var15][var17] + var23[var15][var18] >> 2);
        }
        int[][] var24 = (int[][]) null;
        if (arg8) {
            var24 = class121.field1924[0];
        } else if (arg5 < 3) {
            var24 = class277.field4290[arg5 + 1];
        }
        long var25 = (long) (arg7 | arg4 << 7 | arg2 << 14 | arg9 << 20 | 0x40000000);
        if (var11.field3254 == 0 || arg8) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field3330 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field3274) {
            var25 |= 0x80000000L;
        }
        long var27 = var25 | (long) arg1 << 32;
        if (var11.method1579(false)) {
            class320.method2258(0, arg6, var11, (class171) null, arg4, (class244) null, arg0 - 19202, arg9, arg7);
        }
        boolean var29 = !arg8 & var11.field3258;
        if (arg2 == 22) {
            if (class327.field5034 || var11.field3254 != 0 || var11.field3329 == 1 || var11.field3279) {
                class64 var77;
                if (var11.field3300 == -1 && var11.field3271 == null && var11.field3289 == null && !var11.field3252) {
                    class118 var76 = var11.method1571(arg3, var21, var16, 22, (class77) null, -89, var20, var19, var29, arg9, var24);
                    if (class240.field3737 && var29) {
                        class127.method1102(var76.field1809, var20, var22, var21);
                    }
                    var77 = var76.field1810;
                } else {
                    var77 = new class288(arg1, 22, arg9, arg5, arg7, arg4, -1, var11.field3253, (class64) null);
                }
                class319.method2255(arg6, arg7, arg4, var19, var77, var27, var11.field3248);
                if (var11.field3329 == 1 && arg10 != null) {
                    arg10.method2101(arg7, arg4, -47);
                }
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class64 var71;
            if (var11.field3300 == -1 && var11.field3271 == null && var11.field3289 == null && !var11.field3252) {
                class118 var70 = var11.method1571(arg3, var21, var16, 10, (class77) null, arg0 - 19455, var20, var19, var29, arg2 == 11 ? arg9 + 4 : arg9, var24);
                if (class240.field3737 && var29) {
                    class127.method1102(var70.field1809, var20, var22, var21);
                }
                var71 = var70.field1810;
            } else {
                var71 = new class288(arg1, 10, arg2 == 11 ? arg9 + 4 : arg9, arg5, arg7, arg4, -1, var11.field3253, (class64) null);
            }
            if (var71 != null) {
                boolean var72 = class223.method1676(arg6, arg7, arg4, var19, var13, var12, var71, 0, var27);
                if (var11.field3260 && var72 && arg3) {
                    int var73 = 15;
                    if (var71 instanceof class52) {
                        var73 = ((class52) var71).method506() / 4;
                        if (var73 > 30) {
                            var73 = 30;
                        }
                    }
                    for (int var74 = 0; var74 <= var13; var74++) {
                        for (int var75 = 0; var75 <= var12; var75++) {
                            if (var73 > class235.field3658[arg6][arg7 + var74][arg4 + var75]) {
                                class235.field3658[arg6][arg7 + var74][arg4 + var75] = (byte) var73;
                            }
                        }
                    }
                }
            }
            if (var11.field3329 != 0 && arg10 != null) {
                arg10.method2091(arg7, var12, 0, var11.field3307, arg4, var13, !var11.field3308);
            }
        } else if (arg2 >= 12) {
            class64 var69;
            if (var11.field3300 == -1 && var11.field3271 == null && var11.field3289 == null && !var11.field3252) {
                class118 var68 = var11.method1571(arg3, var21, var16, arg2, (class77) null, -119, var20, var19, var29, arg9, var24);
                if (class240.field3737 && var29) {
                    class127.method1102(var68.field1809, var20, var22, var21);
                }
                var69 = var68.field1810;
            } else {
                var69 = new class288(arg1, arg2, arg9, arg5, arg7, arg4, -1, var11.field3253, (class64) null);
            }
            class223.method1676(arg6, arg7, arg4, var19, 1, 1, var69, 0, var27);
            if (arg3 && arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg6 > 0 && var11.field3323 != 0) {
                class190.field2979[arg6][arg7][arg4] = class41.method426(class190.field2979[arg6][arg7][arg4], 4);
            }
            if (var11.field3329 != 0 && arg10 != null) {
                arg10.method2091(arg7, var12, 0, var11.field3307, arg4, var13, !var11.field3308);
            }
        } else if (arg2 == 0) {
            class64 var67;
            if (var11.field3300 == -1 && var11.field3271 == null && var11.field3289 == null && !var11.field3252) {
                class118 var66 = var11.method1571(arg3, var21, var16, 0, (class77) null, -113, var20, var19, var29, arg9, var24);
                if (class240.field3737 && var29) {
                    class127.method1102(var66.field1809, var20, var22, var21);
                }
                var67 = var66.field1810;
            } else {
                var67 = new class288(arg1, 0, arg9, arg5, arg7, arg4, -1, var11.field3253, (class64) null);
            }
            class61.method614(arg6, arg7, arg4, var19, var67, (class64) null, class163.field2600[arg9], 0, var27);
            if (arg3) {
                if (arg9 == 0) {
                    if (var11.field3260) {
                        class235.field3658[arg6][arg7][arg4] = 50;
                        class235.field3658[arg6][arg7][arg4 + 1] = 50;
                    }
                    if (var11.field3323 == 1) {
                        class190.field2979[arg6][arg7][arg4] = class41.method426(class190.field2979[arg6][arg7][arg4], 1);
                    }
                } else if (arg9 == 1) {
                    if (var11.field3260) {
                        class235.field3658[arg6][arg7][arg4 + 1] = 50;
                        class235.field3658[arg6][arg7 + 1][arg4 + 1] = 50;
                    }
                    if (var11.field3323 == 1) {
                        class190.field2979[arg6][arg7][arg4 + 1] = class41.method426(class190.field2979[arg6][arg7][arg4 + 1], 2);
                    }
                } else if (arg9 == 2) {
                    if (var11.field3260) {
                        class235.field3658[arg6][arg7 + 1][arg4] = 50;
                        class235.field3658[arg6][arg7 + 1][arg4 + 1] = 50;
                    }
                    if (var11.field3323 == 1) {
                        class190.field2979[arg6][arg7 + 1][arg4] = class41.method426(class190.field2979[arg6][arg7 + 1][arg4], 1);
                    }
                } else if (arg9 == 3) {
                    if (var11.field3260) {
                        class235.field3658[arg6][arg7][arg4] = 50;
                        class235.field3658[arg6][arg7 + 1][arg4] = 50;
                    }
                    if (var11.field3323 == 1) {
                        class190.field2979[arg6][arg7][arg4] = class41.method426(class190.field2979[arg6][arg7][arg4], 2);
                    }
                }
            }
            if (var11.field3329 != 0 && arg10 != null) {
                arg10.method2100(arg7, 1, arg4, !var11.field3308, arg2, arg9, var11.field3307);
            }
            if (var11.field3281 != 16) {
                class203.method1518(arg6, arg7, arg4, var11.field3281);
            }
        } else if (arg2 == 1) {
            class64 var65;
            if (var11.field3300 == -1 && var11.field3271 == null && var11.field3289 == null && !var11.field3252) {
                class118 var64 = var11.method1571(arg3, var21, var16, 1, (class77) null, -57, var20, var19, var29, arg9, var24);
                if (class240.field3737 && var29) {
                    class127.method1102(var64.field1809, var20, var22, var21);
                }
                var65 = var64.field1810;
            } else {
                var65 = new class288(arg1, 1, arg9, arg5, arg7, arg4, -1, var11.field3253, (class64) null);
            }
            class61.method614(arg6, arg7, arg4, var19, var65, (class64) null, class193.field3043[arg9], 0, var27);
            if (var11.field3260 && arg3) {
                if (arg9 == 0) {
                    class235.field3658[arg6][arg7][arg4 + 1] = 50;
                } else if (arg9 == 1) {
                    class235.field3658[arg6][arg7 + 1][arg4 + 1] = 50;
                } else if (arg9 == 2) {
                    class235.field3658[arg6][arg7 + 1][arg4] = 50;
                } else if (arg9 == 3) {
                    class235.field3658[arg6][arg7][arg4] = 50;
                }
            }
            if (var11.field3329 != 0 && arg10 != null) {
                arg10.method2100(arg7, arg0 - 19329, arg4, !var11.field3308, arg2, arg9, var11.field3307);
            }
        } else if (arg2 == 2) {
            int var30 = arg9 + 1 & 0x3;
            class64 var32;
            class64 var34;
            if (var11.field3300 == -1 && var11.field3271 == null && var11.field3289 == null && !var11.field3252) {
                class118 var31 = var11.method1571(arg3, var21, var16, 2, (class77) null, arg0 - 19438, var20, var19, var29, arg9 + 4, var24);
                if (class240.field3737 && var29) {
                    class127.method1102(var31.field1809, var20, var22, var21);
                }
                var32 = var31.field1810;
                class118 var33 = var11.method1571(arg3, var21, var16, 2, (class77) null, -64, var20, var19, var29, var30, var24);
                if (class240.field3737 && var29) {
                    class127.method1102(var33.field1809, var20, var22, var21);
                }
                var34 = var33.field1810;
            } else {
                var32 = new class288(arg1, 2, arg9 + 4, arg5, arg7, arg4, -1, var11.field3253, (class64) null);
                var34 = new class288(arg1, 2, var30, arg5, arg7, arg4, -1, var11.field3253, (class64) null);
            }
            class61.method614(arg6, arg7, arg4, var19, var32, var34, class163.field2600[arg9], class163.field2600[var30], var27);
            if (var11.field3323 == 1 && arg3) {
                if (arg9 == 0) {
                    class190.field2979[arg6][arg7][arg4] = class41.method426(class190.field2979[arg6][arg7][arg4], 1);
                    class190.field2979[arg6][arg7][arg4 + 1] = class41.method426(class190.field2979[arg6][arg7][arg4 + 1], 2);
                } else if (arg9 == 1) {
                    class190.field2979[arg6][arg7][arg4 + 1] = class41.method426(class190.field2979[arg6][arg7][arg4 + 1], 2);
                    class190.field2979[arg6][arg7 + 1][arg4] = class41.method426(class190.field2979[arg6][arg7 + 1][arg4], 1);
                } else if (arg9 == 2) {
                    class190.field2979[arg6][arg7 + 1][arg4] = class41.method426(class190.field2979[arg6][arg7 + 1][arg4], 1);
                    class190.field2979[arg6][arg7][arg4] = class41.method426(class190.field2979[arg6][arg7][arg4], 2);
                } else if (arg9 == 3) {
                    class190.field2979[arg6][arg7][arg4] = class41.method426(class190.field2979[arg6][arg7][arg4], 2);
                    class190.field2979[arg6][arg7][arg4] = class41.method426(class190.field2979[arg6][arg7][arg4], 1);
                }
            }
            if (var11.field3329 != 0 && arg10 != null) {
                arg10.method2100(arg7, 1, arg4, !var11.field3308, arg2, arg9, var11.field3307);
            }
            if (var11.field3281 != 16) {
                class203.method1518(arg6, arg7, arg4, var11.field3281);
            }
        } else if (arg2 == 3) {
            class64 var36;
            if (var11.field3300 == -1 && var11.field3271 == null && var11.field3289 == null && !var11.field3252) {
                class118 var35 = var11.method1571(arg3, var21, var16, 3, (class77) null, arg0 ^ 0xFFFFB432, var20, var19, var29, arg9, var24);
                if (class240.field3737 && var29) {
                    class127.method1102(var35.field1809, var20, var22, var21);
                }
                var36 = var35.field1810;
            } else {
                var36 = new class288(arg1, 3, arg9, arg5, arg7, arg4, -1, var11.field3253, (class64) null);
            }
            class61.method614(arg6, arg7, arg4, var19, var36, (class64) null, class193.field3043[arg9], 0, var27);
            if (var11.field3260 && arg3) {
                if (arg9 == 0) {
                    class235.field3658[arg6][arg7][arg4 + 1] = 50;
                } else if (arg9 == 1) {
                    class235.field3658[arg6][arg7 + 1][arg4 + 1] = 50;
                } else if (arg9 == 2) {
                    class235.field3658[arg6][arg7 + 1][arg4] = 50;
                } else if (arg9 == 3) {
                    class235.field3658[arg6][arg7][arg4] = 50;
                }
            }
            if (var11.field3329 != 0 && arg10 != null) {
                arg10.method2100(arg7, 1, arg4, !var11.field3308, arg2, arg9, var11.field3307);
            }
        } else if (arg2 == 9) {
            class64 var63;
            if (var11.field3300 == -1 && var11.field3271 == null && var11.field3289 == null && !var11.field3252) {
                class118 var62 = var11.method1571(arg3, var21, var16, arg2, (class77) null, -88, var20, var19, var29, arg9, var24);
                if (class240.field3737 && var29) {
                    class127.method1102(var62.field1809, var20, var22, var21);
                }
                var63 = var62.field1810;
            } else {
                var63 = new class288(arg1, arg2, arg9, arg5, arg7, arg4, -1, var11.field3253, (class64) null);
            }
            class223.method1676(arg6, arg7, arg4, var19, 1, 1, var63, 0, var27);
            if (var11.field3329 != 0 && arg10 != null) {
                arg10.method2091(arg7, var12, 0, var11.field3307, arg4, var13, !var11.field3308);
            }
            if (var11.field3281 != 16) {
                class203.method1518(arg6, arg7, arg4, var11.field3281);
            }
        } else if (arg2 == 4) {
            class64 var61;
            if (var11.field3300 == -1 && var11.field3271 == null && var11.field3289 == null && !var11.field3252) {
                class118 var60 = var11.method1571(arg3, var21, var16, 4, (class77) null, -69, var20, var19, var29, arg9, var24);
                if (class240.field3737 && var29) {
                    class127.method1102(var60.field1809, var20, var22, var21);
                }
                var61 = var60.field1810;
            } else {
                var61 = new class288(arg1, 4, arg9, arg5, arg7, arg4, -1, var11.field3253, (class64) null);
            }
            class100.method872(arg6, arg7, arg4, var19, var61, (class64) null, class163.field2600[arg9], 0, 0, 0, var27);
        } else if (arg2 == 5) {
            int var37 = 16;
            long var38 = class280.method2045(arg6, arg7, arg4);
            if (var38 != 0L) {
                var37 = class43.method437(50, (int) (var38 >>> 32) & Integer.MAX_VALUE).field3281;
            }
            class64 var41;
            if (var11.field3300 == -1 && var11.field3271 == null && var11.field3289 == null && !var11.field3252) {
                class118 var40 = var11.method1571(arg3, var21, var16, 4, (class77) null, -112, var20, var19, var29, arg9, var24);
                if (class240.field3737 && var29) {
                    class127.method1102(var40.field1809, var20 - class331.field5087[arg9] * 8, var22, var21 - class148.field2402[arg9] * 8);
                }
                var41 = var40.field1810;
            } else {
                var41 = new class288(arg1, 4, arg9, arg5, arg7, arg4, -1, var11.field3253, (class64) null);
            }
            class100.method872(arg6, arg7, arg4, var19, var41, (class64) null, class163.field2600[arg9], 0, class331.field5087[arg9] * var37, class148.field2402[arg9] * var37, var27);
        } else if (arg2 == 6) {
            long var55 = class280.method2045(arg6, arg7, arg4);
            int var57 = 8;
            if (var55 != 0L) {
                var57 = class43.method437(arg0 - 19265, (int) (var55 >>> 32) & Integer.MAX_VALUE).field3281 / 2;
            }
            class64 var59;
            if (var11.field3300 == -1 && var11.field3271 == null && var11.field3289 == null && !var11.field3252) {
                class118 var58 = var11.method1571(arg3, var21, var16, 4, (class77) null, arg0 - 19394, var20, var19, var29, arg9 + 4, var24);
                if (class240.field3737 && var29) {
                    class127.method1102(var58.field1809, var20 - class217.field3404[arg9] * 8, var22, var21 - (class190.field2987[arg9] * 8));
                }
                var59 = var58.field1810;
            } else {
                var59 = new class288(arg1, 4, arg9 + 4, arg5, arg7, arg4, -1, var11.field3253, (class64) null);
            }
            class100.method872(arg6, arg7, arg4, var19, var59, (class64) null, 256, arg9, class217.field3404[arg9] * var57, class190.field2987[arg9] * var57, var27);
        } else if (arg2 == 7) {
            int var42 = arg9 + 2 & 0x3;
            class64 var44;
            if (var11.field3300 == -1 && var11.field3271 == null && var11.field3289 == null && !var11.field3252) {
                class118 var43 = var11.method1571(arg3, var21, var16, 4, (class77) null, arg0 ^ 0xFFFFB418, var20, var19, var29, var42 + 4, var24);
                if (class240.field3737 && var29) {
                    class127.method1102(var43.field1809, var20, var22, var21);
                }
                var44 = var43.field1810;
            } else {
                var44 = new class288(arg1, 4, var42 + 4, arg5, arg7, arg4, -1, var11.field3253, (class64) null);
            }
            class100.method872(arg6, arg7, arg4, var19, var44, (class64) null, 256, var42, 0, 0, var27);
        } else if (arg2 == 8) {
            long var45 = class280.method2045(arg6, arg7, arg4);
            int var47 = 8;
            if (var45 != 0L) {
                var47 = class43.method437(88, (int) (var45 >>> 32) & Integer.MAX_VALUE).field3281 / 2;
            }
            int var48 = arg9 + 2 & 0x3;
            class64 var52;
            class64 var54;
            if (var11.field3300 == -1 && var11.field3271 == null && var11.field3289 == null && !var11.field3252) {
                int var49 = class217.field3404[arg9] * 8;
                int var50 = class190.field2987[arg9] * 8;
                class118 var51 = var11.method1571(arg3, var21, var16, 4, (class77) null, -87, var20, var19, var29, arg9 + 4, var24);
                if (class240.field3737 && var29) {
                    class127.method1102(var51.field1809, var20 - var49, var22, var21 - var50);
                }
                var52 = var51.field1810;
                class118 var53 = var11.method1571(arg3, var21, var16, 4, (class77) null, -97, var20, var19, var29, var48 + 4, var24);
                if (class240.field3737 && var29) {
                    class127.method1102(var53.field1809, var20 - var49, var22, var21 - var50);
                }
                var54 = var53.field1810;
            } else {
                var52 = new class288(arg1, 4, arg9 + 4, arg5, arg7, arg4, -1, var11.field3253, (class64) null);
                var54 = new class288(arg1, 4, var48 + 4, arg5, arg7, arg4, -1, var11.field3253, (class64) null);
            }
            class100.method872(arg6, arg7, arg4, var19, var52, var54, 256, arg9, class217.field3404[arg9] * var47, class190.field2987[arg9] * var47, var27);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 737)
    public static void method1526(int arg0) {
        field3157 = null;
        if (arg0 != 12) {
            field3158 = -83;
        }
    }
}
