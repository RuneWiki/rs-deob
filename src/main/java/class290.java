import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class class290 {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Lke;")
    public static class256 field5007 = class316.method2202("V-Brification des mises -9 jour )2 ", 27626);

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lke;")
    public static class256 field5016 = class316.method2202("Fallen lassen", 27626);

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Lqe;")
    public static class196 field5012 = new class196();

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "Lke;")
    public static class256 field5024 = class316.method2202("hitbar_default", 27626);

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "Lke;")
    public static class256 field5021 = class316.method2202("um", 27626);

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public static int field5027 = 0;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Ljava/util/Random;")
    public static Random field5023 = new Random();

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public int field5008;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public int field5009;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public int field5014;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public int field5015;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public int field5018;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public int field5026;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "Lfl;")
    public static class318 field5025;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "Lhd;")
    public static class319 field5028;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "[I")
    public static int[] field5017;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "[Lke;")
    public static class256[] field5022;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 17)
    public static final void method2015(int arg0) {
        field5020++;
        if (arg0 != 0) {
            method2017(-87);
        }
        class215.field3834.method2076(arg0 + 94);
        class36.field642.method2076(arg0 + 99);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lng;Lng;B)V", line = 30)
    public static final void method2016(class138 arg0, class138 arg1, byte arg2) {
        class213.field3809 = arg1;
        class99.field1762 = arg0;
        int var3 = -11 % ((-arg2 - 29) / 45);
        field5010++;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 50)
    public static void method2017(int arg0) {
        field5023 = null;
        field5017 = null;
        field5016 = null;
        field5021 = null;
        field5025 = null;
        field5022 = null;
        field5007 = null;
        if (arg0 != -14671) {
            method2017(127);
        }
        field5024 = null;
        field5012 = null;
        field5028 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IJ)Lke;", line = 88)
    public static final class256 method2018(int arg0, long arg1) {
        field5019++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            long var3 = arg1;
            int var5 = 0;
            while (var3 != 0L) {
                var3 /= 37L;
                var5++;
            }
            byte[] var6 = new byte[var5];
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var5--;
                var6[var5] = class112.field1961[(int) (var7 - (arg1 * 37L))];
            }
            if (arg0 == 7130) {
                class256 var9 = new class256();
                var9.field4380 = var6;
                var9.field4384 = var6.length;
                return var9;
            } else {
                return (class256) null;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZIIILsd;BZII)V", line = 137)
    public static final void method2019(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class37 arg6, byte arg7, boolean arg8, int arg9, int arg10) {
        field5011++;
        if (arg2 && !class216.method1512(128) && (class308.field5296[0][arg10][arg0] & 0x2) == 0) {
            if ((class308.field5296[arg9][arg10][arg0] & 0x10) != 0) {
                return;
            }
            if (class159.method1179(arg10, arg0, 9373, arg9) != class7.field110) {
                return;
            }
        }
        if (class191.field3491 > arg9) {
            class191.field3491 = arg9;
        }
        class273 var11 = class271.method1871(122, arg4);
        if (class253.field4323 && var11.field4704) {
            return;
        }
        int var12;
        int var13;
        if (arg1 == 1 || arg1 == 3) {
            var12 = var11.field4662;
            var13 = var11.field4711;
        } else {
            var12 = var11.field4711;
            var13 = var11.field4662;
        }
        int var14;
        int var15;
        if (arg10 + var13 <= 104) {
            var14 = (var13 >> 1) + arg10;
            var15 = arg10 + (var13 + 1 >> 1);
        } else {
            var15 = arg10 + 1;
            var14 = arg10;
        }
        int var16;
        int var17;
        if ((arg0 + var12) > 104) {
            var16 = arg0 + 1;
            var17 = arg0;
        } else {
            var16 = (var12 + 1 >> 1) + arg0;
            var17 = (var12 >> 1) + arg0;
        }
        int[][] var18 = class118.field2090[arg5];
        int var19 = var18[var14][var17] + var18[var14][var16] + var18[var15][var16] + var18[var15][var17] >> 2;
        int var20 = (arg10 << 7) + (var13 << 6);
        int var21 = 0;
        if (class253.field4323 && arg5 != 0) {
            int[][] var22 = class118.field2090[0];
            var21 = var19 - (var22[var14][var17] + var22[var15][var16] + var22[var14][var16] + var22[var15][var17] >> 2);
        }
        int var23 = (arg0 << 7) + (var12 << 6);
        long var24 = (long) (arg3 | 0x10000 << 14 | arg0 << 7 | arg10 | arg1 << 20);
        int[][] var26 = (int[][]) null;
        if (arg8) {
            var26 = class72.field1329[0];
        } else if (arg5 < 3) {
            var26 = class118.field2090[arg5 + 1];
        }
        if (var11.field4685 == 0 || arg8) {
            var24 |= Long.MIN_VALUE;
        }
        if (var11.field4668 == 1) {
            var24 |= 0x400000L;
        }
        if (var11.field4699) {
            var24 |= 0x80000000L;
        }
        int var27 = -13 / ((5 - arg7) / 58);
        long var28 = var24 | (long) arg4 << 32;
        if (var11.method1892((byte) -124)) {
            class22.method143((class279) null, arg0, arg1, arg10, var11, arg9, (class144) null, 128);
        }
        boolean var30 = !arg8 & var11.field4714;
        if (arg3 == 22) {
            if (class65.field1167 || var11.field4685 != 0 || var11.field4710 == 1 || var11.field4666) {
                class51 var78;
                if (var11.field4713 == -1 && var11.field4664 == null && !var11.field4681) {
                    class196 var77 = var11.method1882(arg2, var30, (class232) null, var26, var23, var20, false, var19, 22, var18, arg1);
                    if (class253.field4323 && var30) {
                        class123.method841(var77.field3595, var20, var21, var23);
                    }
                    var78 = var77.field3589;
                } else {
                    var78 = new class101(arg4, 22, arg1, arg5, arg10, arg0, var11.field4713, var11.field4730, (class51) null);
                }
                class107.method753(arg9, arg10, arg0, var19, var78, var28, var11.field4689);
                if (var11.field4710 == 1 && arg6 != null) {
                    arg6.method272(arg0, 262144, arg10);
                }
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class51 var72;
            if (var11.field4713 == -1 && var11.field4664 == null && !var11.field4681) {
                class196 var71 = var11.method1882(arg2, var30, (class232) null, var26, var23, var20, false, var19, 10, var18, arg3 == 11 ? arg1 + 4 : arg1);
                if (class253.field4323 && var30) {
                    class123.method841(var71.field3595, var20, var21, var23);
                }
                var72 = var71.field3589;
            } else {
                var72 = new class101(arg4, 10, arg3 == 11 ? arg1 + 4 : arg1, arg5, arg10, arg0, var11.field4713, var11.field4730, (class51) null);
            }
            if (var72 != null) {
                boolean var73 = class58.method454(arg9, arg10, arg0, var19, var13, var12, var72, 0, var28);
                if (var11.field4702 && var73 && arg2) {
                    int var74 = 15;
                    if (var72 instanceof class26) {
                        var74 = ((class26) var72).method172() / 4;
                        if (var74 > 30) {
                            var74 = 30;
                        }
                    }
                    for (int var75 = 0; var75 <= var13; var75++) {
                        for (int var76 = 0; var76 <= var12; var76++) {
                            if (class249.field4234[arg9][arg10 + var75][arg0 + var76] < var74) {
                                class249.field4234[arg9][arg10 + var75][arg0 + var76] = (byte) var74;
                            }
                        }
                    }
                }
            }
            if (var11.field4710 != 0 && arg6 != null) {
                arg6.method278(arg0, var11.field4661, var12, var13, false, arg10);
            }
        } else if (arg3 >= 12) {
            class51 var70;
            if (var11.field4713 == -1 && var11.field4664 == null && !var11.field4681) {
                class196 var69 = var11.method1882(arg2, var30, (class232) null, var26, var23, var20, false, var19, arg3, var18, arg1);
                if (class253.field4323 && var30) {
                    class123.method841(var69.field3595, var20, var21, var23);
                }
                var70 = var69.field3589;
            } else {
                var70 = new class101(arg4, arg3, arg1, arg5, arg10, arg0, var11.field4713, var11.field4730, (class51) null);
            }
            class58.method454(arg9, arg10, arg0, var19, 1, 1, var70, 0, var28);
            if (arg2 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg9 > 0) {
                class210.field3792[arg9][arg10][arg0] = class100.method721(class210.field3792[arg9][arg10][arg0], 4);
            }
            if (var11.field4710 != 0 && arg6 != null) {
                arg6.method278(arg0, var11.field4661, var12, var13, false, arg10);
            }
        } else if (arg3 == 0) {
            class51 var32;
            if (var11.field4713 == -1 && var11.field4664 == null && !var11.field4681) {
                class196 var31 = var11.method1882(arg2, var30, (class232) null, var26, var23, var20, false, var19, 0, var18, arg1);
                if (class253.field4323 && var30) {
                    class123.method841(var31.field3595, var20, var21, var23);
                }
                var32 = var31.field3589;
            } else {
                var32 = new class101(arg4, 0, arg1, arg5, arg10, arg0, var11.field4713, var11.field4730, (class51) null);
            }
            class216.method1511(arg9, arg10, arg0, var19, var32, (class51) null, class160.field2852[arg1], 0, var28);
            if (arg2) {
                if (arg1 == 0) {
                    if (var11.field4702) {
                        class249.field4234[arg9][arg10][arg0] = 50;
                        class249.field4234[arg9][arg10][arg0 + 1] = 50;
                    }
                    if (var11.field4734) {
                        class210.field3792[arg9][arg10][arg0] = class100.method721(class210.field3792[arg9][arg10][arg0], 1);
                    }
                } else if (arg1 == 1) {
                    if (var11.field4702) {
                        class249.field4234[arg9][arg10][arg0 + 1] = 50;
                        class249.field4234[arg9][arg10 + 1][arg0 + 1] = 50;
                    }
                    if (var11.field4734) {
                        class210.field3792[arg9][arg10][arg0 + 1] = class100.method721(class210.field3792[arg9][arg10][arg0 + 1], 2);
                    }
                } else if (arg1 == 2) {
                    if (var11.field4702) {
                        class249.field4234[arg9][arg10 + 1][arg0] = 50;
                        class249.field4234[arg9][arg10 + 1][arg0 + 1] = 50;
                    }
                    if (var11.field4734) {
                        class210.field3792[arg9][arg10 + 1][arg0] = class100.method721(class210.field3792[arg9][arg10 + 1][arg0], 1);
                    }
                } else if (arg1 == 3) {
                    if (var11.field4702) {
                        class249.field4234[arg9][arg10][arg0] = 50;
                        class249.field4234[arg9][arg10 + 1][arg0] = 50;
                    }
                    if (var11.field4734) {
                        class210.field3792[arg9][arg10][arg0] = class100.method721(class210.field3792[arg9][arg10][arg0], 2);
                    }
                }
            }
            if (var11.field4710 != 0 && arg6 != null) {
                arg6.method289(arg10, arg1, arg3, arg0, true, var11.field4661);
            }
            if (var11.field4722 != 16) {
                class99.method708(arg9, arg10, arg0, var11.field4722);
            }
        } else if (arg3 == 1) {
            class51 var68;
            if (var11.field4713 == -1 && var11.field4664 == null && !var11.field4681) {
                class196 var67 = var11.method1882(arg2, var30, (class232) null, var26, var23, var20, false, var19, 1, var18, arg1);
                if (class253.field4323 && var30) {
                    class123.method841(var67.field3595, var20, var21, var23);
                }
                var68 = var67.field3589;
            } else {
                var68 = new class101(arg4, 1, arg1, arg5, arg10, arg0, var11.field4713, var11.field4730, (class51) null);
            }
            class216.method1511(arg9, arg10, arg0, var19, var68, (class51) null, class264.field4531[arg1], 0, var28);
            if (var11.field4702 && arg2) {
                if (arg1 == 0) {
                    class249.field4234[arg9][arg10][arg0 + 1] = 50;
                } else if (arg1 == 1) {
                    class249.field4234[arg9][arg10 + 1][arg0 + 1] = 50;
                } else if (arg1 == 2) {
                    class249.field4234[arg9][arg10 + 1][arg0] = 50;
                } else if (arg1 == 3) {
                    class249.field4234[arg9][arg10][arg0] = 50;
                }
            }
            if (var11.field4710 != 0 && arg6 != null) {
                arg6.method289(arg10, arg1, arg3, arg0, true, var11.field4661);
            }
        } else if (arg3 == 2) {
            int var33 = arg1 + 1 & 0x3;
            class51 var35;
            class51 var37;
            if (var11.field4713 == -1 && var11.field4664 == null && !var11.field4681) {
                class196 var34 = var11.method1882(arg2, var30, (class232) null, var26, var23, var20, false, var19, 2, var18, arg1 + 4);
                if (class253.field4323 && var30) {
                    class123.method841(var34.field3595, var20, var21, var23);
                }
                var35 = var34.field3589;
                class196 var36 = var11.method1882(arg2, var30, (class232) null, var26, var23, var20, false, var19, 2, var18, var33);
                if (class253.field4323 && var30) {
                    class123.method841(var36.field3595, var20, var21, var23);
                }
                var37 = var36.field3589;
            } else {
                var35 = new class101(arg4, 2, arg1 + 4, arg5, arg10, arg0, var11.field4713, var11.field4730, (class51) null);
                var37 = new class101(arg4, 2, var33, arg5, arg10, arg0, var11.field4713, var11.field4730, (class51) null);
            }
            class216.method1511(arg9, arg10, arg0, var19, var35, var37, class160.field2852[arg1], class160.field2852[var33], var28);
            if (var11.field4734 && arg2) {
                if (arg1 == 0) {
                    class210.field3792[arg9][arg10][arg0] = class100.method721(class210.field3792[arg9][arg10][arg0], 1);
                    class210.field3792[arg9][arg10][arg0 + 1] = class100.method721(class210.field3792[arg9][arg10][arg0 + 1], 2);
                } else if (arg1 == 1) {
                    class210.field3792[arg9][arg10][arg0 + 1] = class100.method721(class210.field3792[arg9][arg10][arg0 + 1], 2);
                    class210.field3792[arg9][arg10 + 1][arg0] = class100.method721(class210.field3792[arg9][arg10 + 1][arg0], 1);
                } else if (arg1 == 2) {
                    class210.field3792[arg9][arg10 + 1][arg0] = class100.method721(class210.field3792[arg9][arg10 + 1][arg0], 1);
                    class210.field3792[arg9][arg10][arg0] = class100.method721(class210.field3792[arg9][arg10][arg0], 2);
                } else if (arg1 == 3) {
                    class210.field3792[arg9][arg10][arg0] = class100.method721(class210.field3792[arg9][arg10][arg0], 2);
                    class210.field3792[arg9][arg10][arg0] = class100.method721(class210.field3792[arg9][arg10][arg0], 1);
                }
            }
            if (var11.field4710 != 0 && arg6 != null) {
                arg6.method289(arg10, arg1, arg3, arg0, true, var11.field4661);
            }
            if (var11.field4722 != 16) {
                class99.method708(arg9, arg10, arg0, var11.field4722);
            }
        } else if (arg3 == 3) {
            class51 var66;
            if (var11.field4713 == -1 && var11.field4664 == null && !var11.field4681) {
                class196 var65 = var11.method1882(arg2, var30, (class232) null, var26, var23, var20, false, var19, 3, var18, arg1);
                if (class253.field4323 && var30) {
                    class123.method841(var65.field3595, var20, var21, var23);
                }
                var66 = var65.field3589;
            } else {
                var66 = new class101(arg4, 3, arg1, arg5, arg10, arg0, var11.field4713, var11.field4730, (class51) null);
            }
            class216.method1511(arg9, arg10, arg0, var19, var66, (class51) null, class264.field4531[arg1], 0, var28);
            if (var11.field4702 && arg2) {
                if (arg1 == 0) {
                    class249.field4234[arg9][arg10][arg0 + 1] = 50;
                } else if (arg1 == 1) {
                    class249.field4234[arg9][arg10 + 1][arg0 + 1] = 50;
                } else if (arg1 == 2) {
                    class249.field4234[arg9][arg10 + 1][arg0] = 50;
                } else if (arg1 == 3) {
                    class249.field4234[arg9][arg10][arg0] = 50;
                }
            }
            if (var11.field4710 != 0 && arg6 != null) {
                arg6.method289(arg10, arg1, arg3, arg0, true, var11.field4661);
            }
        } else if (arg3 == 9) {
            class51 var64;
            if (var11.field4713 == -1 && var11.field4664 == null && !var11.field4681) {
                class196 var63 = var11.method1882(arg2, var30, (class232) null, var26, var23, var20, false, var19, arg3, var18, arg1);
                if (class253.field4323 && var30) {
                    class123.method841(var63.field3595, var20, var21, var23);
                }
                var64 = var63.field3589;
            } else {
                var64 = new class101(arg4, arg3, arg1, arg5, arg10, arg0, var11.field4713, var11.field4730, (class51) null);
            }
            class58.method454(arg9, arg10, arg0, var19, 1, 1, var64, 0, var28);
            if (var11.field4710 != 0 && arg6 != null) {
                arg6.method278(arg0, var11.field4661, var12, var13, false, arg10);
            }
            if (var11.field4722 != 16) {
                class99.method708(arg9, arg10, arg0, var11.field4722);
            }
        } else if (arg3 == 4) {
            class51 var62;
            if (var11.field4713 == -1 && var11.field4664 == null && !var11.field4681) {
                class196 var61 = var11.method1882(arg2, var30, (class232) null, var26, var23, var20, false, var19, 4, var18, arg1);
                if (class253.field4323 && var30) {
                    class123.method841(var61.field3595, var20, var21, var23);
                }
                var62 = var61.field3589;
            } else {
                var62 = new class101(arg4, 4, arg1, arg5, arg10, arg0, var11.field4713, var11.field4730, (class51) null);
            }
            class76.method578(arg9, arg10, arg0, var19, var62, (class51) null, class160.field2852[arg1], 0, 0, 0, var28);
        } else if (arg3 == 5) {
            int var38 = 16;
            long var39 = class308.method2141(arg9, arg10, arg0);
            if (var39 != 0L) {
                var38 = class271.method1871(127, (int) (var39 >>> 32) & Integer.MAX_VALUE).field4722;
            }
            class51 var42;
            if (var11.field4713 == -1 && var11.field4664 == null && !var11.field4681) {
                class196 var41 = var11.method1882(arg2, var30, (class232) null, var26, var23, var20, false, var19, 4, var18, arg1);
                if (class253.field4323 && var30) {
                    class123.method841(var41.field3595, var20 - (class256.field4378[arg1] * 8), var21, var23 - (class124.field2198[arg1] * 8));
                }
                var42 = var41.field3589;
            } else {
                var42 = new class101(arg4, 4, arg1, arg5, arg10, arg0, var11.field4713, var11.field4730, (class51) null);
            }
            class76.method578(arg9, arg10, arg0, var19, var42, (class51) null, class160.field2852[arg1], 0, class256.field4378[arg1] * var38, class124.field2198[arg1] * var38, var28);
        } else if (arg3 == 6) {
            int var43 = 8;
            long var44 = class308.method2141(arg9, arg10, arg0);
            if (var44 != 0L) {
                var43 = class271.method1871(125, Integer.MAX_VALUE & (int) (var44 >>> 32)).field4722 / 2;
            }
            class51 var47;
            if (var11.field4713 == -1 && var11.field4664 == null && !var11.field4681) {
                class196 var46 = var11.method1882(arg2, var30, (class232) null, var26, var23, var20, false, var19, 4, var18, arg1 + 4);
                if (class253.field4323 && var30) {
                    class123.method841(var46.field3595, var20 - class198.field3612[arg1] * 8, var21, var23 - (class297.field5145[arg1] * 8));
                }
                var47 = var46.field3589;
            } else {
                var47 = new class101(arg4, 4, arg1 + 4, arg5, arg10, arg0, var11.field4713, var11.field4730, (class51) null);
            }
            class76.method578(arg9, arg10, arg0, var19, var47, (class51) null, 256, arg1, class198.field3612[arg1] * var43, class297.field5145[arg1] * var43, var28);
        } else if (arg3 == 7) {
            int var48 = arg1 + 2 & 0x3;
            class51 var50;
            if (var11.field4713 == -1 && var11.field4664 == null && !var11.field4681) {
                class196 var49 = var11.method1882(arg2, var30, (class232) null, var26, var23, var20, false, var19, 4, var18, var48 + 4);
                if (class253.field4323 && var30) {
                    class123.method841(var49.field3595, var20, var21, var23);
                }
                var50 = var49.field3589;
            } else {
                var50 = new class101(arg4, 4, var48 + 4, arg5, arg10, arg0, var11.field4713, var11.field4730, (class51) null);
            }
            class76.method578(arg9, arg10, arg0, var19, var50, (class51) null, 256, var48, 0, 0, var28);
        } else if (arg3 == 8) {
            int var51 = 8;
            long var52 = class308.method2141(arg9, arg10, arg0);
            if (var52 != 0L) {
                var51 = class271.method1871(126, Integer.MAX_VALUE & (int) (var52 >>> 32)).field4722 / 2;
            }
            int var54 = arg1 + 2 & 0x3;
            class51 var58;
            class51 var60;
            if (var11.field4713 == -1 && var11.field4664 == null && !var11.field4681) {
                int var55 = class198.field3612[arg1] * 8;
                int var56 = class297.field5145[arg1] * 8;
                class196 var57 = var11.method1882(arg2, var30, (class232) null, var26, var23, var20, false, var19, 4, var18, arg1 + 4);
                if (class253.field4323 && var30) {
                    class123.method841(var57.field3595, var20 - var55, var21, var23 - var56);
                }
                var58 = var57.field3589;
                class196 var59 = var11.method1882(arg2, var30, (class232) null, var26, var23, var20, false, var19, 4, var18, var54 + 4);
                if (class253.field4323 && var30) {
                    class123.method841(var59.field3595, var20 - var55, var21, var23 - var56);
                }
                var60 = var59.field3589;
            } else {
                var58 = new class101(arg4, 4, arg1 + 4, arg5, arg10, arg0, var11.field4713, var11.field4730, (class51) null);
                var60 = new class101(arg4, 4, var54 + 4, arg5, arg10, arg0, var11.field4713, var11.field4730, (class51) null);
            }
            class76.method578(arg9, arg10, arg0, var19, var58, var60, 256, arg1, class198.field3612[arg1] * var51, class297.field5145[arg1] * var51, var28);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
    public abstract void method12(int arg0, int arg1);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
    public abstract void method15(int arg0, int arg1, int arg2);
}
