import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class234 {

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public int field3865 = 0;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Lte;")
    public static class244 field3867 = new class244(64);

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Lfb;")
    public static class271 field3870 = new class271(0, 0);

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field3873 = -1;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field3876 = 0;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3877 = "Allocating memory";

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "Lda;")
    public static class25 field3875;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lpd;I)V")
    public final void method1657(class96 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method584(255);
            if (var3 == 0) {
                int var4 = 116 / ((arg1 + 70) / 33);
                field3868++;
                return;
            }
            this.method1660(arg0, var3, 24892);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Leh;B)V")
    public static final void method1658(class137 arg0, byte arg1) {
        field3869++;
        if (class19.field238 || arg1 <= 5) {
            return;
        }
        class217.method1519();
        class213.field3428 = class162.method1129(arg0, (byte) -18, class86.field1059);
        int var2 = class292.field4640;
        int var3 = var2 * 956 / 503;
        class213.field3428.method320((class283.field4517 - var3) / 2, 0, var3, var2);
        class138.field2211 = class41.method228(-128, arg0, class106.field1423);
        class138.field2211.method915(class283.field4517 / 2 - class138.field2211.field2139 / 2, 18);
        class19.field238 = true;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Loj;IIZIIIIIZI)V")
    public static final void method1659(class144 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field3874++;
        if (arg3 && !class226.method1599((byte) 103) && (class117.field1664[0][arg4][arg7] & 0x2) == 0) {
            if ((class117.field1664[arg8][arg4][arg7] & 0x10) != 0) {
                return;
            }
            if (class192.method1330(arg10 ^ 0xFFFF9D1E, arg7, arg4, arg8) != class126.field2025) {
                return;
            }
        }
        if (class294.field4656 > arg8) {
            class294.field4656 = arg8;
        }
        class228 var11 = class256.method1749(arg2, 0);
        int var12;
        int var13;
        if (arg5 == 1 || arg5 == 3) {
            var13 = var11.field3655;
            var12 = var11.field3714;
        } else {
            var12 = var11.field3655;
            var13 = var11.field3714;
        }
        int var14;
        int var15;
        if (arg4 + var12 <= 104) {
            var14 = (var12 + 1 >> 1) + arg4;
            var15 = (var12 >> 1) + arg4;
        } else {
            var14 = arg4 + 1;
            var15 = arg4;
        }
        int var16;
        int var17;
        if (arg7 + var13 <= 104) {
            var16 = (var13 >> 1) + arg7;
            var17 = (var13 + 1 >> 1) + arg7;
        } else {
            var16 = arg7;
            var17 = arg7 + 1;
        }
        int[][] var18 = class17.field209[arg6];
        int var19 = var18[var14][var17] + var18[var15][var16] + var18[var14][var16] + var18[var15][var17] >> 2;
        int var20 = (arg7 << 7) + (var13 << 6);
        int var21 = (arg4 << 7) + (var12 << 6);
        long var22 = (long) (arg5 | 0x400 << 20 | arg7 << 7 | arg4 | arg1 << 14);
        int[][] var24 = null;
        if (arg9) {
            var24 = class25.field348[0];
        } else if (arg6 < 3) {
            var24 = class17.field209[arg6 + 1];
        }
        if (arg10 != 28777) {
            return;
        }
        if (var11.field3669 == 0 || arg9) {
            var22 |= Long.MIN_VALUE;
        }
        if (var11.field3711 == 1) {
            var22 |= 0x400000L;
        }
        if (var11.field3691) {
            var22 |= 0x80000000L;
        }
        long var25 = var22 | (long) arg2 << 32;
        if (var11.method1628((byte) -97)) {
            class261.method1773(arg5, arg7, (class259) null, var11, (class200) null, arg4, (byte) 91, arg8);
        }
        boolean var27 = !arg9 & var11.field3678;
        int var28 = var11.field3663;
        if (arg1 == 22) {
            if (class96.field1281 || var11.field3669 != 0 || var11.field3676 == 1 || var11.field3700) {
                class264 var30;
                if (var28 == -1 && var11.field3641 == null && !var11.field3649) {
                    class293 var29 = var11.method1621(22, arg5, var27, 122, var21, arg3, var20, var19, var24, (class149) null, var18);
                    var30 = var29.field4650;
                } else {
                    var30 = new class24(arg2, 22, arg5, arg6, arg4, arg7, var28, var11.field3643, (class264) null);
                }
                class17.method93(arg8, arg4, arg7, var19, var30, var25, var11.field3660);
                if (var11.field3676 == 1 && arg0 != null) {
                    arg0.method1005(arg7, arg4, (byte) 112);
                }
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class264 var70;
            if (var28 == -1 && var11.field3641 == null && !var11.field3649) {
                class293 var69 = var11.method1621(10, arg1 == 11 ? arg5 + 4 : arg5, var27, 111, var21, arg3, var20, var19, var24, (class149) null, var18);
                var70 = var69.field4650;
            } else {
                var70 = new class24(arg2, 10, arg1 == 11 ? arg5 + 4 : arg5, arg6, arg4, arg7, var28, var11.field3643, (class264) null);
            }
            if (var70 != null) {
                boolean var71 = class81.method450(arg8, arg4, arg7, var19, var12, var13, var70, 0, var25);
                if (var11.field3696 && var71 && arg3) {
                    int var72 = 15;
                    if (var70 instanceof class158) {
                        var72 = ((class158) var70).method843() / 4;
                        if (var72 > 30) {
                            var72 = 30;
                        }
                    }
                    for (int var73 = 0; var73 <= var12; var73++) {
                        for (int var74 = 0; var74 <= var13; var74++) {
                            if (var72 > class230.field3747[arg8][arg4 + var73][arg7 + var74]) {
                                class230.field3747[arg8][arg4 + var73][arg7 + var74] = (byte) var72;
                            }
                        }
                    }
                }
            }
            if (var11.field3676 != 0 && arg0 != null) {
                arg0.method999(!var11.field3704, (byte) 122, arg7, var11.field3653, var13, arg4, var12);
            }
        } else if (arg1 >= 12) {
            class264 var32;
            if (var28 == -1 && var11.field3641 == null && !var11.field3649) {
                class293 var31 = var11.method1621(arg1, arg5, var27, 126, var21, arg3, var20, var19, var24, (class149) null, var18);
                var32 = var31.field4650;
            } else {
                var32 = new class24(arg2, arg1, arg5, arg6, arg4, arg7, var28, var11.field3643, (class264) null);
            }
            class81.method450(arg8, arg4, arg7, var19, 1, 1, var32, 0, var25);
            if (arg3 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg8 > 0 && var11.field3688 != 0) {
                class289.field4604[arg8][arg4][arg7] = class154.method1048(class289.field4604[arg8][arg4][arg7], 4);
            }
            if (var11.field3676 != 0 && arg0 != null) {
                arg0.method999(!var11.field3704, (byte) 125, arg7, var11.field3653, var13, arg4, var12);
            }
        } else if (arg1 == 0) {
            class264 var34;
            if (var28 == -1 && var11.field3641 == null && !var11.field3649) {
                class293 var33 = var11.method1621(0, arg5, var27, 113, var21, arg3, var20, var19, var24, (class149) null, var18);
                var34 = var33.field4650;
            } else {
                var34 = new class24(arg2, 0, arg5, arg6, arg4, arg7, var28, var11.field3643, (class264) null);
            }
            class184.method1287(arg8, arg4, arg7, var19, var34, (class264) null, class123.field1919[arg5], 0, var25);
            if (arg3) {
                if (arg5 == 0) {
                    if (var11.field3696) {
                        class230.field3747[arg8][arg4][arg7] = 50;
                        class230.field3747[arg8][arg4][arg7 + 1] = 50;
                    }
                    if (var11.field3688 == 1) {
                        class289.field4604[arg8][arg4][arg7] = class154.method1048(class289.field4604[arg8][arg4][arg7], 1);
                    }
                } else if (arg5 == 1) {
                    if (var11.field3696) {
                        class230.field3747[arg8][arg4][arg7 + 1] = 50;
                        class230.field3747[arg8][arg4 + 1][arg7 + 1] = 50;
                    }
                    if (var11.field3688 == 1) {
                        class289.field4604[arg8][arg4][arg7 + 1] = class154.method1048(class289.field4604[arg8][arg4][arg7 + 1], 2);
                    }
                } else if (arg5 == 2) {
                    if (var11.field3696) {
                        class230.field3747[arg8][arg4 + 1][arg7] = 50;
                        class230.field3747[arg8][arg4 + 1][arg7 + 1] = 50;
                    }
                    if (var11.field3688 == 1) {
                        class289.field4604[arg8][arg4 + 1][arg7] = class154.method1048(class289.field4604[arg8][arg4 + 1][arg7], 1);
                    }
                } else if (arg5 == 3) {
                    if (var11.field3696) {
                        class230.field3747[arg8][arg4][arg7] = 50;
                        class230.field3747[arg8][arg4 + 1][arg7] = 50;
                    }
                    if (var11.field3688 == 1) {
                        class289.field4604[arg8][arg4][arg7] = class154.method1048(class289.field4604[arg8][arg4][arg7], 2);
                    }
                }
            }
            if (var11.field3676 != 0 && arg0 != null) {
                arg0.method1010(!var11.field3704, arg10 ^ 0xFFFF8F89, var11.field3653, arg4, arg7, arg5, arg1);
            }
            if (var11.field3654 != 16) {
                class71.method399(arg8, arg4, arg7, var11.field3654);
            }
        } else if (arg1 == 1) {
            class264 var36;
            if (var28 == -1 && var11.field3641 == null && !var11.field3649) {
                class293 var35 = var11.method1621(1, arg5, var27, 126, var21, arg3, var20, var19, var24, (class149) null, var18);
                var36 = var35.field4650;
            } else {
                var36 = new class24(arg2, 1, arg5, arg6, arg4, arg7, var28, var11.field3643, (class264) null);
            }
            class184.method1287(arg8, arg4, arg7, var19, var36, (class264) null, class108.field1506[arg5], 0, var25);
            if (var11.field3696 && arg3) {
                if (arg5 == 0) {
                    class230.field3747[arg8][arg4][arg7 + 1] = 50;
                } else if (arg5 == 1) {
                    class230.field3747[arg8][arg4 + 1][arg7 + 1] = 50;
                } else if (arg5 == 2) {
                    class230.field3747[arg8][arg4 + 1][arg7] = 50;
                } else if (arg5 == 3) {
                    class230.field3747[arg8][arg4][arg7] = 50;
                }
            }
            if (var11.field3676 != 0 && arg0 != null) {
                arg0.method1010(!var11.field3704, -55, var11.field3653, arg4, arg7, arg5, arg1);
            }
        } else if (arg1 == 2) {
            int var37 = arg5 + 1 & 0x3;
            class264 var39;
            class264 var41;
            if (var28 == -1 && var11.field3641 == null && !var11.field3649) {
                class293 var38 = var11.method1621(2, arg5 + 4, var27, 124, var21, arg3, var20, var19, var24, (class149) null, var18);
                var39 = var38.field4650;
                class293 var40 = var11.method1621(2, var37, var27, 119, var21, arg3, var20, var19, var24, (class149) null, var18);
                var41 = var40.field4650;
            } else {
                var39 = new class24(arg2, 2, arg5 + 4, arg6, arg4, arg7, var28, var11.field3643, (class264) null);
                var41 = new class24(arg2, 2, var37, arg6, arg4, arg7, var28, var11.field3643, (class264) null);
            }
            class184.method1287(arg8, arg4, arg7, var19, var39, var41, class123.field1919[arg5], class123.field1919[var37], var25);
            if (var11.field3688 == 1 && arg3) {
                if (arg5 == 0) {
                    class289.field4604[arg8][arg4][arg7] = class154.method1048(class289.field4604[arg8][arg4][arg7], 1);
                    class289.field4604[arg8][arg4][arg7 + 1] = class154.method1048(class289.field4604[arg8][arg4][arg7 + 1], 2);
                } else if (arg5 == 1) {
                    class289.field4604[arg8][arg4][arg7 + 1] = class154.method1048(class289.field4604[arg8][arg4][arg7 + 1], 2);
                    class289.field4604[arg8][arg4 + 1][arg7] = class154.method1048(class289.field4604[arg8][arg4 + 1][arg7], 1);
                } else if (arg5 == 2) {
                    class289.field4604[arg8][arg4 + 1][arg7] = class154.method1048(class289.field4604[arg8][arg4 + 1][arg7], 1);
                    class289.field4604[arg8][arg4][arg7] = class154.method1048(class289.field4604[arg8][arg4][arg7], 2);
                } else if (arg5 == 3) {
                    class289.field4604[arg8][arg4][arg7] = class154.method1048(class289.field4604[arg8][arg4][arg7], 2);
                    class289.field4604[arg8][arg4][arg7] = class154.method1048(class289.field4604[arg8][arg4][arg7], 1);
                }
            }
            if (var11.field3676 != 0 && arg0 != null) {
                arg0.method1010(!var11.field3704, 60, var11.field3653, arg4, arg7, arg5, arg1);
            }
            if (var11.field3654 != 16) {
                class71.method399(arg8, arg4, arg7, var11.field3654);
            }
        } else if (arg1 == 3) {
            class264 var43;
            if (var28 == -1 && var11.field3641 == null && !var11.field3649) {
                class293 var42 = var11.method1621(3, arg5, var27, arg10 - 28666, var21, arg3, var20, var19, var24, (class149) null, var18);
                var43 = var42.field4650;
            } else {
                var43 = new class24(arg2, 3, arg5, arg6, arg4, arg7, var28, var11.field3643, (class264) null);
            }
            class184.method1287(arg8, arg4, arg7, var19, var43, (class264) null, class108.field1506[arg5], 0, var25);
            if (var11.field3696 && arg3) {
                if (arg5 == 0) {
                    class230.field3747[arg8][arg4][arg7 + 1] = 50;
                } else if (arg5 == 1) {
                    class230.field3747[arg8][arg4 + 1][arg7 + 1] = 50;
                } else if (arg5 == 2) {
                    class230.field3747[arg8][arg4 + 1][arg7] = 50;
                } else if (arg5 == 3) {
                    class230.field3747[arg8][arg4][arg7] = 50;
                }
            }
            if (var11.field3676 != 0 && arg0 != null) {
                arg0.method1010(!var11.field3704, 41, var11.field3653, arg4, arg7, arg5, arg1);
            }
        } else if (arg1 == 9) {
            class264 var45;
            if (var28 == -1 && var11.field3641 == null && !var11.field3649) {
                class293 var44 = var11.method1621(arg1, arg5, var27, arg10 ^ 0x7015, var21, arg3, var20, var19, var24, (class149) null, var18);
                var45 = var44.field4650;
            } else {
                var45 = new class24(arg2, arg1, arg5, arg6, arg4, arg7, var28, var11.field3643, (class264) null);
            }
            class81.method450(arg8, arg4, arg7, var19, 1, 1, var45, 0, var25);
            if (var11.field3676 != 0 && arg0 != null) {
                arg0.method999(!var11.field3704, (byte) 127, arg7, var11.field3653, var13, arg4, var12);
            }
            if (var11.field3654 != 16) {
                class71.method399(arg8, arg4, arg7, var11.field3654);
            }
        } else if (arg1 == 4) {
            class264 var47;
            if (var28 == -1 && var11.field3641 == null && !var11.field3649) {
                class293 var46 = var11.method1621(4, arg5, var27, 120, var21, arg3, var20, var19, var24, (class149) null, var18);
                var47 = var46.field4650;
            } else {
                var47 = new class24(arg2, 4, arg5, arg6, arg4, arg7, var28, var11.field3643, (class264) null);
            }
            class144.method1003(arg8, arg4, arg7, var19, var47, (class264) null, class123.field1919[arg5], 0, 0, 0, var25);
        } else if (arg1 == 5) {
            int var48 = 16;
            long var49 = class62.method363(arg8, arg4, arg7);
            if (var49 != 0L) {
                var48 = class256.method1749((int) (var49 >>> 32) & Integer.MAX_VALUE, 0).field3654;
            }
            class264 var52;
            if (var28 == -1 && var11.field3641 == null && !var11.field3649) {
                class293 var51 = var11.method1621(4, arg5, var27, arg10 ^ 0x7013, var21, arg3, var20, var19, var24, (class149) null, var18);
                var52 = var51.field4650;
            } else {
                var52 = new class24(arg2, 4, arg5, arg6, arg4, arg7, var28, var11.field3643, (class264) null);
            }
            class144.method1003(arg8, arg4, arg7, var19, var52, (class264) null, class123.field1919[arg5], 0, class295.field4675[arg5] * var48, class110.field1572[arg5] * var48, var25);
        } else if (arg1 == 6) {
            int var53 = 8;
            long var54 = class62.method363(arg8, arg4, arg7);
            if (var54 != 0L) {
                var53 = class256.method1749((int) (var54 >>> 32) & Integer.MAX_VALUE, 0).field3654 / 2;
            }
            class264 var57;
            if (var28 == -1 && var11.field3641 == null && !var11.field3649) {
                class293 var56 = var11.method1621(4, arg5 + 4, var27, 112, var21, arg3, var20, var19, var24, (class149) null, var18);
                var57 = var56.field4650;
            } else {
                var57 = new class24(arg2, 4, arg5 + 4, arg6, arg4, arg7, var28, var11.field3643, (class264) null);
            }
            class144.method1003(arg8, arg4, arg7, var19, var57, (class264) null, 256, arg5, class92.field1160[arg5] * var53, class35.field455[arg5] * var53, var25);
        } else if (arg1 == 7) {
            int var58 = arg5 + 2 & 0x3;
            class264 var60;
            if (var28 == -1 && var11.field3641 == null && !var11.field3649) {
                class293 var59 = var11.method1621(4, var58 + 4, var27, 113, var21, arg3, var20, var19, var24, (class149) null, var18);
                var60 = var59.field4650;
            } else {
                var60 = new class24(arg2, 4, var58 + 4, arg6, arg4, arg7, var28, var11.field3643, (class264) null);
            }
            class144.method1003(arg8, arg4, arg7, var19, var60, (class264) null, 256, var58, 0, 0, var25);
        } else if (arg1 == 8) {
            long var61 = class62.method363(arg8, arg4, arg7);
            int var63 = 8;
            if (var61 != 0L) {
                var63 = class256.method1749(Integer.MAX_VALUE & (int) (var61 >>> 32), 0).field3654 / 2;
            }
            int var64 = arg5 + 2 & 0x3;
            class264 var66;
            class264 var68;
            if (var28 == -1 && var11.field3641 == null && !var11.field3649) {
                class293 var65 = var11.method1621(4, arg5 + 4, var27, arg10 - 28661, var21, arg3, var20, var19, var24, (class149) null, var18);
                var66 = var65.field4650;
                class293 var67 = var11.method1621(4, var64 + 4, var27, 116, var21, arg3, var20, var19, var24, (class149) null, var18);
                var68 = var67.field4650;
            } else {
                var66 = new class24(arg2, 4, arg5 + 4, arg6, arg4, arg7, var28, var11.field3643, (class264) null);
                var68 = new class24(arg2, 4, var64 + 4, arg6, arg4, arg7, var28, var11.field3643, (class264) null);
            }
            class144.method1003(arg8, arg4, arg7, var19, var66, var68, 256, arg5, class92.field1160[arg5] * var63, class35.field455[arg5] * var63, var25);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lpd;II)V")
    private final void method1660(class96 arg0, int arg1, int arg2) {
        if (arg2 == 24892) {
            if (arg1 == 5) {
                this.field3865 = arg0.method549(arg2 - 24637);
            }
            field3872++;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1661(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < 1) {
            arg5 = 1;
        }
        if (arg1 < 1) {
            arg1 = 1;
        }
        class256.field4159 = (short) arg1;
        if (arg2 != 22) {
            method1658((class137) null, (byte) 104);
        }
        class104.field1406 = (short) arg5;
        field3871++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)V")
    public static final void method1662(int arg0, boolean arg1) {
        class233 var2 = class114.method746(arg0, 1228126432, 11);
        var2.method1653(!arg1);
        if (!arg1) {
            method1661(true, 110, -71, -31, -115, 84);
        }
        field3866++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method1663(int arg0) {
        field3867 = null;
        if (arg0 > -67) {
            method1658((class137) null, (byte) -53);
        }
        field3870 = null;
        field3877 = null;
        field3875 = null;
    }
}
