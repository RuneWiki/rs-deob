import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class108 {

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "[Lgk;")
    public static class52[] field1455 = new class52[14];

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public int field1454;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public int field1456;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public int field1457;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public int field1465;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "[[[B")
    public static byte[][][] field1463;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 11)
    public static void method791(int arg0) {
        field1463 = (byte[][][]) null;
        field1455 = null;
        if (arg0 != 28022) {
            field1455 = (class52[]) null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIBIII)V", line = 24)
    public static final void method792(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var6 = -16 / ((arg2 + 81) / 36);
        field1462++;
        if (arg1 == arg3) {
            class66.method448(arg5, arg1, arg0, arg4, false);
        } else if (class206.field2952 <= arg5 - arg1 && class259.field3813 >= arg1 + arg5 && class101.field1397 <= (arg0 - arg3) && arg0 + arg3 <= class44.field536) {
            class107.method785((byte) -105, arg3, arg4, arg5, arg1, arg0);
        } else {
            class194.method1356(arg1, (byte) -50, arg3, arg0, arg5, arg4);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIILdn;Ldn;IIIIJ)V", line = 51)
    private static final void method793(int arg0, int arg1, int arg2, int arg3, class132 arg4, class132 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class269 var12 = new class269();
        var12.field3992 = arg10;
        var12.field3986 = arg1 * 128 + 64;
        var12.field3980 = arg2 * 128 + 64;
        var12.field3989 = arg3;
        var12.field3987 = arg4;
        var12.field3995 = arg5;
        var12.field3979 = arg6;
        var12.field3996 = arg7;
        var12.field3985 = arg8;
        var12.field3991 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class142.field1940[var13][arg1][arg2] == null) {
                class142.field1940[var13][arg1][arg2] = new class202(var13, arg1, arg2);
            }
        }
        class142.field1940[arg0][arg1][arg2].field2879 = var12;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILla;IZIZIIII)V", line = 92)
    public static final void method794(int arg0, int arg1, class72 arg2, int arg3, boolean arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        field1461++;
        if (arg4 && !class154.method1113(arg10 ^ 0xFFFFFF84) && (class240.field3406[0][arg9][arg8] & 0x2) == 0) {
            if ((class240.field3406[arg1][arg9][arg8] & 0x10) != 0) {
                return;
            }
            if (class28.method160(arg10 ^ 0x37, arg8, arg9, arg1) != class270.field4028) {
                return;
            }
        }
        if (class320.field4868 > arg1) {
            class320.field4868 = arg1;
        }
        class302 var11 = class153.method1106(arg7, (byte) -82);
        if (class67.field908 && var11.field4536) {
            return;
        }
        int var12;
        int var13;
        if (arg0 == 1 || arg0 == 3) {
            var12 = var11.field4520;
            var13 = var11.field4479;
        } else {
            var12 = var11.field4479;
            var13 = var11.field4520;
        }
        int var14;
        int var15;
        if (arg9 + var13 <= 104) {
            var14 = (var13 + 1 >> 1) + arg9;
            var15 = (var13 >> 1) + arg9;
        } else {
            var15 = arg9;
            var14 = arg9 + 1;
        }
        int var16;
        int var17;
        if (arg8 + var12 <= 104) {
            var16 = (var12 + 1 >> 1) + arg8;
            var17 = (var12 >> 1) + arg8;
        } else {
            var17 = arg8;
            var16 = arg8 + 1;
        }
        int[][] var18 = class333.field5020[arg5];
        int var19 = (arg9 << 7) + (var13 << 6);
        int var20 = var18[var14][var17] + var18[var15][var16] + var18[var14][var16] + var18[var15][var17] >> 2;
        int var21 = (arg8 << 7) + (var12 << 6);
        int var22 = 0;
        if (class67.field908 && arg5 != 0) {
            int[][] var23 = class333.field5020[0];
            var22 = var20 - (var23[var14][var17] + var23[var15][var17] - (-var23[var15][var16] - var23[var14][var16]) >> 2);
        }
        int[][] var24 = (int[][]) null;
        if (arg6) {
            var24 = class269.field3994[0];
        } else if (arg5 < 3) {
            var24 = class333.field5020[arg5 + 1];
        }
        long var25 = (long) (arg3 | 0x10000 << 14 | arg8 << 7 | arg9 | arg0 << 20);
        if (var11.field4484 == 0 || arg6) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field4501 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field4541) {
            var25 |= 0x80000000L;
        }
        long var27 = var25 | (long) arg7 << 32;
        if (var11.method2064(arg10 ^ 0x0)) {
            class134.method978(arg1, arg8, (byte) -41, arg0, (class241) null, arg9, (class329) null, var11);
        }
        int var29 = var11.field4550;
        boolean var30 = !arg6 & var11.field4507;
        if (arg3 == 22) {
            if (class183.field2517 || var11.field4484 != 0 || var11.field4530 == 1 || var11.field4491) {
                class132 var78;
                if (var29 == -1 && var11.field4519 == null && !var11.field4480) {
                    class44 var77 = var11.method2054((byte) 1, var19, var24, var18, var30, var20, arg4, (class258) null, var21, 22, arg0);
                    if (class67.field908 && var30) {
                        class322.method2257(var77.field532, var19, var22, var21);
                    }
                    var78 = var77.field531;
                } else {
                    var78 = new class301(arg7, 22, arg0, arg5, arg9, arg8, var29, var11.field4508, (class132) null);
                }
                class143.method1033(arg1, arg9, arg8, var20, var78, var27, var11.field4487);
                if (var11.field4530 == 1 && arg2 != null) {
                    arg2.method528(arg8, 126, arg9);
                }
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class132 var72;
            if (var29 == -1 && var11.field4519 == null && !var11.field4480) {
                class44 var71 = var11.method2054((byte) 1, var19, var24, var18, var30, var20, arg4, (class258) null, var21, 10, arg3 == 11 ? arg0 + 4 : arg0);
                if (class67.field908 && var30) {
                    class322.method2257(var71.field532, var19, var22, var21);
                }
                var72 = var71.field531;
            } else {
                var72 = new class301(arg7, 10, arg3 == 11 ? arg0 + 4 : arg0, arg5, arg9, arg8, var29, var11.field4508, (class132) null);
            }
            if (var72 != null) {
                boolean var73 = class90.method691(arg1, arg9, arg8, var20, var13, var12, var72, 0, var27);
                if (var11.field4537 && var73 && arg4) {
                    int var74 = 15;
                    if (var72 instanceof class345) {
                        var74 = ((class345) var72).method319() / 4;
                        if (var74 > 30) {
                            var74 = 30;
                        }
                    }
                    for (int var75 = 0; var75 <= var13; var75++) {
                        for (int var76 = 0; var76 <= var12; var76++) {
                            if (var74 > class242.field3458[arg1][arg9 + var75][arg8 + var76]) {
                                class242.field3458[arg1][arg9 + var75][arg8 + var76] = (byte) var74;
                            }
                        }
                    }
                }
            }
            if (var11.field4530 != 0 && arg2 != null) {
                arg2.method525(var13, !var11.field4546, arg9, arg8, -17110, var11.field4506, var12);
            }
        } else if (arg3 >= 12) {
            class132 var32;
            if (var29 == -1 && var11.field4519 == null && !var11.field4480) {
                class44 var31 = var11.method2054((byte) 1, var19, var24, var18, var30, var20, arg4, (class258) null, var21, arg3, arg0);
                if (class67.field908 && var30) {
                    class322.method2257(var31.field532, var19, var22, var21);
                }
                var32 = var31.field531;
            } else {
                var32 = new class301(arg7, arg3, arg0, arg5, arg9, arg8, var29, var11.field4508, (class132) null);
            }
            class90.method691(arg1, arg9, arg8, var20, 1, 1, var32, 0, var27);
            if (arg4 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg1 > 0 && var11.field4539 != 0) {
                class334.field5051[arg1][arg9][arg8] = class190.method1334(class334.field5051[arg1][arg9][arg8], 4);
            }
            if (var11.field4530 != 0 && arg2 != null) {
                arg2.method525(var13, !var11.field4546, arg9, arg8, -17110, var11.field4506, var12);
            }
        } else if (arg3 == arg10) {
            class132 var70;
            if (var29 == -1 && var11.field4519 == null && !var11.field4480) {
                class44 var69 = var11.method2054((byte) 1, var19, var24, var18, var30, var20, arg4, (class258) null, var21, 0, arg0);
                if (class67.field908 && var30) {
                    class322.method2257(var69.field532, var19, var22, var21);
                }
                var70 = var69.field531;
            } else {
                var70 = new class301(arg7, 0, arg0, arg5, arg9, arg8, var29, var11.field4508, (class132) null);
            }
            class142.method1025(arg1, arg9, arg8, var20, var70, (class132) null, class10.field105[arg0], 0, var27);
            if (arg4) {
                if (arg0 == 0) {
                    if (var11.field4537) {
                        class242.field3458[arg1][arg9][arg8] = 50;
                        class242.field3458[arg1][arg9][arg8 + 1] = 50;
                    }
                    if (var11.field4539 == 1) {
                        class334.field5051[arg1][arg9][arg8] = class190.method1334(class334.field5051[arg1][arg9][arg8], 1);
                    }
                } else if (arg0 == 1) {
                    if (var11.field4537) {
                        class242.field3458[arg1][arg9][arg8 + 1] = 50;
                        class242.field3458[arg1][arg9 + 1][arg8 + 1] = 50;
                    }
                    if (var11.field4539 == 1) {
                        class334.field5051[arg1][arg9][arg8 + 1] = class190.method1334(class334.field5051[arg1][arg9][arg8 + 1], 2);
                    }
                } else if (arg0 == 2) {
                    if (var11.field4537) {
                        class242.field3458[arg1][arg9 + 1][arg8] = 50;
                        class242.field3458[arg1][arg9 + 1][arg8 + 1] = 50;
                    }
                    if (var11.field4539 == 1) {
                        class334.field5051[arg1][arg9 + 1][arg8] = class190.method1334(class334.field5051[arg1][arg9 + 1][arg8], 1);
                    }
                } else if (arg0 == 3) {
                    if (var11.field4537) {
                        class242.field3458[arg1][arg9][arg8] = 50;
                        class242.field3458[arg1][arg9 + 1][arg8] = 50;
                    }
                    if (var11.field4539 == 1) {
                        class334.field5051[arg1][arg9][arg8] = class190.method1334(class334.field5051[arg1][arg9][arg8], 2);
                    }
                }
            }
            if (var11.field4530 != 0 && arg2 != null) {
                arg2.method537(arg3, arg0, arg9, !var11.field4546, arg8, (byte) -127, var11.field4506);
            }
            if (var11.field4535 != 16) {
                class294.method2004(arg1, arg9, arg8, var11.field4535);
            }
        } else if (arg3 == 1) {
            class132 var34;
            if (var29 == -1 && var11.field4519 == null && !var11.field4480) {
                class44 var33 = var11.method2054((byte) 1, var19, var24, var18, var30, var20, arg4, (class258) null, var21, 1, arg0);
                if (class67.field908 && var30) {
                    class322.method2257(var33.field532, var19, var22, var21);
                }
                var34 = var33.field531;
            } else {
                var34 = new class301(arg7, 1, arg0, arg5, arg9, arg8, var29, var11.field4508, (class132) null);
            }
            class142.method1025(arg1, arg9, arg8, var20, var34, (class132) null, class269.field3990[arg0], 0, var27);
            if (var11.field4537 && arg4) {
                if (arg0 == 0) {
                    class242.field3458[arg1][arg9][arg8 + 1] = 50;
                } else if (arg0 == 1) {
                    class242.field3458[arg1][arg9 + 1][arg8 + 1] = 50;
                } else if (arg0 == 2) {
                    class242.field3458[arg1][arg9 + 1][arg8] = 50;
                } else if (arg0 == 3) {
                    class242.field3458[arg1][arg9][arg8] = 50;
                }
            }
            if (var11.field4530 != 0 && arg2 != null) {
                arg2.method537(arg3, arg0, arg9, !var11.field4546, arg8, (byte) -122, var11.field4506);
            }
        } else if (arg3 == 2) {
            int var35 = arg0 + 1 & 0x3;
            class132 var37;
            class132 var39;
            if (var29 == -1 && var11.field4519 == null && !var11.field4480) {
                class44 var36 = var11.method2054((byte) 1, var19, var24, var18, var30, var20, arg4, (class258) null, var21, 2, arg0 + 4);
                if (class67.field908 && var30) {
                    class322.method2257(var36.field532, var19, var22, var21);
                }
                var37 = var36.field531;
                class44 var38 = var11.method2054((byte) 1, var19, var24, var18, var30, var20, arg4, (class258) null, var21, 2, var35);
                if (class67.field908 && var30) {
                    class322.method2257(var38.field532, var19, var22, var21);
                }
                var39 = var38.field531;
            } else {
                var37 = new class301(arg7, 2, arg0 + 4, arg5, arg9, arg8, var29, var11.field4508, (class132) null);
                var39 = new class301(arg7, 2, var35, arg5, arg9, arg8, var29, var11.field4508, (class132) null);
            }
            class142.method1025(arg1, arg9, arg8, var20, var37, var39, class10.field105[arg0], class10.field105[var35], var27);
            if (var11.field4539 == 1 && arg4) {
                if (arg0 == 0) {
                    class334.field5051[arg1][arg9][arg8] = class190.method1334(class334.field5051[arg1][arg9][arg8], 1);
                    class334.field5051[arg1][arg9][arg8 + 1] = class190.method1334(class334.field5051[arg1][arg9][arg8 + 1], 2);
                } else if (arg0 == 1) {
                    class334.field5051[arg1][arg9][arg8 + 1] = class190.method1334(class334.field5051[arg1][arg9][arg8 + 1], 2);
                    class334.field5051[arg1][arg9 + 1][arg8] = class190.method1334(class334.field5051[arg1][arg9 + 1][arg8], 1);
                } else if (arg0 == 2) {
                    class334.field5051[arg1][arg9 + 1][arg8] = class190.method1334(class334.field5051[arg1][arg9 + 1][arg8], 1);
                    class334.field5051[arg1][arg9][arg8] = class190.method1334(class334.field5051[arg1][arg9][arg8], 2);
                } else if (arg0 == 3) {
                    class334.field5051[arg1][arg9][arg8] = class190.method1334(class334.field5051[arg1][arg9][arg8], 2);
                    class334.field5051[arg1][arg9][arg8] = class190.method1334(class334.field5051[arg1][arg9][arg8], 1);
                }
            }
            if (var11.field4530 != 0 && arg2 != null) {
                arg2.method537(arg3, arg0, arg9, !var11.field4546, arg8, (byte) -96, var11.field4506);
            }
            if (var11.field4535 != 16) {
                class294.method2004(arg1, arg9, arg8, var11.field4535);
            }
        } else if (arg3 == 3) {
            class132 var68;
            if (var29 == -1 && var11.field4519 == null && !var11.field4480) {
                class44 var67 = var11.method2054((byte) 1, var19, var24, var18, var30, var20, arg4, (class258) null, var21, 3, arg0);
                if (class67.field908 && var30) {
                    class322.method2257(var67.field532, var19, var22, var21);
                }
                var68 = var67.field531;
            } else {
                var68 = new class301(arg7, 3, arg0, arg5, arg9, arg8, var29, var11.field4508, (class132) null);
            }
            class142.method1025(arg1, arg9, arg8, var20, var68, (class132) null, class269.field3990[arg0], 0, var27);
            if (var11.field4537 && arg4) {
                if (arg0 == 0) {
                    class242.field3458[arg1][arg9][arg8 + 1] = 50;
                } else if (arg0 == 1) {
                    class242.field3458[arg1][arg9 + 1][arg8 + 1] = 50;
                } else if (arg0 == 2) {
                    class242.field3458[arg1][arg9 + 1][arg8] = 50;
                } else if (arg0 == 3) {
                    class242.field3458[arg1][arg9][arg8] = 50;
                }
            }
            if (var11.field4530 != 0 && arg2 != null) {
                arg2.method537(arg3, arg0, arg9, !var11.field4546, arg8, (byte) -102, var11.field4506);
            }
        } else if (arg3 == 9) {
            class132 var66;
            if (var29 == -1 && var11.field4519 == null && !var11.field4480) {
                class44 var65 = var11.method2054((byte) 1, var19, var24, var18, var30, var20, arg4, (class258) null, var21, arg3, arg0);
                if (class67.field908 && var30) {
                    class322.method2257(var65.field532, var19, var22, var21);
                }
                var66 = var65.field531;
            } else {
                var66 = new class301(arg7, arg3, arg0, arg5, arg9, arg8, var29, var11.field4508, (class132) null);
            }
            class90.method691(arg1, arg9, arg8, var20, 1, 1, var66, 0, var27);
            if (var11.field4530 != 0 && arg2 != null) {
                arg2.method525(var13, !var11.field4546, arg9, arg8, arg10 - 17110, var11.field4506, var12);
            }
            if (var11.field4535 != 16) {
                class294.method2004(arg1, arg9, arg8, var11.field4535);
            }
        } else if (arg3 == 4) {
            class132 var41;
            if (var29 == -1 && var11.field4519 == null && !var11.field4480) {
                class44 var40 = var11.method2054((byte) 1, var19, var24, var18, var30, var20, arg4, (class258) null, var21, 4, arg0);
                if (class67.field908 && var30) {
                    class322.method2257(var40.field532, var19, var22, var21);
                }
                var41 = var40.field531;
            } else {
                var41 = new class301(arg7, 4, arg0, arg5, arg9, arg8, var29, var11.field4508, (class132) null);
            }
            method793(arg1, arg9, arg8, var20, var41, (class132) null, class10.field105[arg0], 0, 0, 0, var27);
        } else if (arg3 == 5) {
            int var60 = 16;
            long var61 = class269.method1853(arg1, arg9, arg8);
            if (var61 != 0L) {
                var60 = class153.method1106(Integer.MAX_VALUE & (int) (var61 >>> 32), (byte) -128).field4535;
            }
            class132 var64;
            if (var29 == -1 && var11.field4519 == null && !var11.field4480) {
                class44 var63 = var11.method2054((byte) 1, var19, var24, var18, var30, var20, arg4, (class258) null, var21, 4, arg0);
                if (class67.field908 && var30) {
                    class322.method2257(var63.field532, var19 - class185.field2546[arg0] * 8, var22, var21 - (class339.field5092[arg0] * 8));
                }
                var64 = var63.field531;
            } else {
                var64 = new class301(arg7, 4, arg0, arg5, arg9, arg8, var29, var11.field4508, (class132) null);
            }
            method793(arg1, arg9, arg8, var20, var64, (class132) null, class10.field105[arg0], 0, class185.field2546[arg0] * var60, class339.field5092[arg0] * var60, var27);
        } else if (arg3 == 6) {
            int var55 = 8;
            long var56 = class269.method1853(arg1, arg9, arg8);
            if (var56 != 0L) {
                var55 = class153.method1106((int) (var56 >>> 32) & Integer.MAX_VALUE, (byte) -59).field4535 / 2;
            }
            class132 var59;
            if (var29 == -1 && var11.field4519 == null && !var11.field4480) {
                class44 var58 = var11.method2054((byte) 1, var19, var24, var18, var30, var20, arg4, (class258) null, var21, 4, arg0 + 4);
                if (class67.field908 && var30) {
                    class322.method2257(var58.field532, var19 - (class30.field366[arg0] * 8), var22, var21 - (class211.field3054[arg0] * 8));
                }
                var59 = var58.field531;
            } else {
                var59 = new class301(arg7, 4, arg0 + 4, arg5, arg9, arg8, var29, var11.field4508, (class132) null);
            }
            method793(arg1, arg9, arg8, var20, var59, (class132) null, 256, arg0, class30.field366[arg0] * var55, class211.field3054[arg0] * var55, var27);
        } else if (arg3 == 7) {
            int var52 = arg0 + 2 & 0x3;
            class132 var54;
            if (var29 == -1 && var11.field4519 == null && !var11.field4480) {
                class44 var53 = var11.method2054((byte) 1, var19, var24, var18, var30, var20, arg4, (class258) null, var21, 4, var52 + 4);
                if (class67.field908 && var30) {
                    class322.method2257(var53.field532, var19, var22, var21);
                }
                var54 = var53.field531;
            } else {
                var54 = new class301(arg7, 4, var52 + 4, arg5, arg9, arg8, var29, var11.field4508, (class132) null);
            }
            method793(arg1, arg9, arg8, var20, var54, (class132) null, 256, var52, 0, 0, var27);
        } else if (arg3 == 8) {
            int var42 = 8;
            long var43 = class269.method1853(arg1, arg9, arg8);
            int var45 = arg0 + 2 & 0x3;
            if (var43 != 0L) {
                var42 = class153.method1106((int) (var43 >>> 32) & Integer.MAX_VALUE, (byte) -98).field4535 / 2;
            }
            class132 var49;
            class132 var51;
            if (var29 == -1 && var11.field4519 == null && !var11.field4480) {
                int var46 = class211.field3054[arg0] * 8;
                int var47 = class30.field366[arg0] * 8;
                class44 var48 = var11.method2054((byte) 1, var19, var24, var18, var30, var20, arg4, (class258) null, var21, 4, arg0 + 4);
                if (class67.field908 && var30) {
                    class322.method2257(var48.field532, var19 - var47, var22, var21 - var46);
                }
                var49 = var48.field531;
                class44 var50 = var11.method2054((byte) 1, var19, var24, var18, var30, var20, arg4, (class258) null, var21, 4, var45 + 4);
                if (class67.field908 && var30) {
                    class322.method2257(var50.field532, var19 - var47, var22, var21 - var46);
                }
                var51 = var50.field531;
            } else {
                var49 = new class301(arg7, 4, arg0 + 4, arg5, arg9, arg8, var29, var11.field4508, (class132) null);
                var51 = new class301(arg7, 4, var45 + 4, arg5, arg9, arg8, var29, var11.field4508, (class132) null);
            }
            method793(arg1, arg9, arg8, var20, var49, var51, 256, arg0, class30.field366[arg0] * var42, class211.field3054[arg0] * var42, var27);
        }
    }
}
