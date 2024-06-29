import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class291 implements Runnable {

    @OriginalMember(owner = "client!c", name = "d", descriptor = "[Lmj;")
    public volatile class218[] field4680 = new class218[2];

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Z")
    public volatile boolean field4677 = false;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "Z")
    public volatile boolean field4688 = false;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "[Lim;")
    public static class170[] field4687 = new class170[2048];

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Lmd;")
    public class239 field4684;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "[[S")
    public static short[][] field4685;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static void method1977(int arg0) {
        if (arg0 == 3) {
            field4685 = null;
            field4687 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZJ)V")
    public static final void method1978(boolean arg0, long arg1) {
        field4679++;
        try {
            Thread.sleep(arg1);
            if (!arg0) {
                method1980(true, 104, 78, false, 106, 114, (class99) null, -106, -83, 126, -93);
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public static final void method1979(byte arg0) {
        field4686++;
        int var1 = 0;
        if (arg0 >= -42) {
            return;
        }
        while (class140.field2016 > var1) {
            int var2 = class212.field3299[var1];
            class1 var3 = class35.field409[var2];
            int var4 = class175.field2763.method1218(70);
            if ((var4 & 0x80) != 0) {
                var4 += class175.field2763.method1218(-124) << 8;
            }
            class29.method146(var4, 1, var2, var3);
            var1++;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZIIZIILji;IIII)V")
    public static final void method1980(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class99 arg6, int arg7, int arg8, int arg9, int arg10) {
        field4682++;
        if (arg3 && !class60.method384(-4) && (class74.field1121[0][arg9][arg2] & 0x2) == 0) {
            if ((class74.field1121[arg5][arg9][arg2] & 0x10) != 0) {
                return;
            }
            if (class309.method2083(arg2, -5293, arg9, arg5) != class250.field4051) {
                return;
            }
        }
        if (class211.field3289 > arg5) {
            class211.field3289 = arg5;
        }
        if (arg10 != 17) {
            field4687 = null;
        }
        class191 var11 = class128.method822(arg4, (byte) 126);
        int var12;
        int var13;
        if (arg7 == 1 || arg7 == 3) {
            var12 = var11.field3039;
            var13 = var11.field2993;
        } else {
            var12 = var11.field2993;
            var13 = var11.field3039;
        }
        int var14;
        int var15;
        if (arg9 + var12 > 104) {
            var14 = arg9;
            var15 = arg9 + 1;
        } else {
            var15 = (var12 + 1 >> 1) + arg9;
            var14 = (var12 >> 1) + arg9;
        }
        int var16;
        int var17;
        if ((arg2 + var13) > 104) {
            var16 = arg2 + 1;
            var17 = arg2;
        } else {
            var16 = (var13 + 1 >> 1) + arg2;
            var17 = arg2 + (var13 >> 1);
        }
        int[][] var18 = class8.field114[arg1];
        int var19 = (arg9 << 7) + (var12 << 6);
        int var20 = var18[var14][var16] + var18[var14][var17] + var18[var15][var16] + var18[var15][var17] >> 2;
        int var21 = (arg2 << 7) + (var13 << 6);
        int[][] var22 = null;
        if (arg0) {
            var22 = class285.field4613[0];
        } else if (arg1 < 3) {
            var22 = class8.field114[arg1 + 1];
        }
        long var23 = (long) (arg7 | 0x400 << 20 | arg8 << 14 | arg2 << 7 | arg9);
        if (var11.field3040 == 0 || arg0) {
            var23 |= Long.MIN_VALUE;
        }
        if (var11.field3037 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field2962) {
            var23 |= 0x80000000L;
        }
        long var25 = var23 | (long) arg4 << 32;
        if (var11.method1332(0)) {
            class1.method7(arg5, var11, (class1) null, arg2, arg7, (class86) null, arg9, 17733);
        }
        boolean var27 = !arg0 & var11.field3032;
        if (arg8 == 22) {
            if (class73.field1106 || var11.field3040 != 0 || var11.field2981 == 1 || var11.field2974) {
                class248 var29;
                if (var11.field2985 == -1 && var11.field2972 == null && var11.field2963 == null && !var11.field2971) {
                    class177 var28 = var11.method1334(var22, var19, arg3, var21, (class91) null, arg10 - 98, var18, arg7, 22, var20, var27);
                    var29 = var28.field2784;
                } else {
                    var29 = new class52(arg4, 22, arg7, arg1, arg9, arg2, -1, var11.field2994, (class248) null);
                }
                client.method1700(arg5, arg9, arg2, var20, var29, var25, var11.field2980);
                if (var11.field2981 == 1 && arg6 != null) {
                    arg6.method678(119, arg9, arg2);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class248 var69;
            if (var11.field2985 == -1 && var11.field2972 == null && var11.field2963 == null && !var11.field2971) {
                class177 var68 = var11.method1334(var22, var19, arg3, var21, (class91) null, arg10 - 54, var18, arg8 == 11 ? arg7 + 4 : arg7, 10, var20, var27);
                var69 = var68.field2784;
            } else {
                var69 = new class52(arg4, 10, arg8 == 11 ? arg7 + 4 : arg7, arg1, arg9, arg2, -1, var11.field2994, (class248) null);
            }
            if (var69 != null) {
                boolean var70 = class9.method55(arg5, arg9, arg2, var20, var12, var13, var69, 0, var25);
                if (var11.field2975 && var70 && arg3) {
                    int var71 = 15;
                    if (var69 instanceof class208) {
                        var71 = ((class208) var69).method329() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var12; var72++) {
                        for (int var73 = 0; var73 <= var13; var73++) {
                            if (var71 > class41.field503[arg5][arg9 + var72][arg2 + var73]) {
                                class41.field503[arg5][arg9 + var72][arg2 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field2981 != 0 && arg6 != null) {
                arg6.method669(-1, !var11.field2991, var13, arg2, var12, arg9, var11.field2982);
            }
        } else if (arg8 >= 12) {
            class248 var31;
            if (var11.field2985 == -1 && var11.field2972 == null && var11.field2963 == null && !var11.field2971) {
                class177 var30 = var11.method1334(var22, var19, arg3, var21, (class91) null, arg10 ^ 0xFFFFFFAB, var18, arg7, arg8, var20, var27);
                var31 = var30.field2784;
            } else {
                var31 = new class52(arg4, arg8, arg7, arg1, arg9, arg2, -1, var11.field2994, (class248) null);
            }
            class9.method55(arg5, arg9, arg2, var20, 1, 1, var31, 0, var25);
            if (arg3 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg5 > 0 && var11.field3029 != 0) {
                class97.field1463[arg5][arg9][arg2] = class243.method1723(class97.field1463[arg5][arg9][arg2], 4);
            }
            if (var11.field2981 != 0 && arg6 != null) {
                arg6.method669(arg10 - 18, !var11.field2991, var13, arg2, var12, arg9, var11.field2982);
            }
        } else if (arg8 == 0) {
            class248 var33;
            if (var11.field2985 == -1 && var11.field2972 == null && var11.field2963 == null && !var11.field2971) {
                class177 var32 = var11.method1334(var22, var19, arg3, var21, (class91) null, -21, var18, arg7, 0, var20, var27);
                var33 = var32.field2784;
            } else {
                var33 = new class52(arg4, 0, arg7, arg1, arg9, arg2, -1, var11.field2994, (class248) null);
            }
            class40.method231(arg5, arg9, arg2, var20, var33, (class248) null, class126.field1813[arg7], 0, var25);
            if (arg3) {
                if (arg7 == 0) {
                    if (var11.field2975) {
                        class41.field503[arg5][arg9][arg2] = 50;
                        class41.field503[arg5][arg9][arg2 + 1] = 50;
                    }
                    if (var11.field3029 == 1) {
                        class97.field1463[arg5][arg9][arg2] = class243.method1723(class97.field1463[arg5][arg9][arg2], 1);
                    }
                } else if (arg7 == 1) {
                    if (var11.field2975) {
                        class41.field503[arg5][arg9][arg2 + 1] = 50;
                        class41.field503[arg5][arg9 + 1][arg2 + 1] = 50;
                    }
                    if (var11.field3029 == 1) {
                        class97.field1463[arg5][arg9][arg2 + 1] = class243.method1723(class97.field1463[arg5][arg9][arg2 + 1], 2);
                    }
                } else if (arg7 == 2) {
                    if (var11.field2975) {
                        class41.field503[arg5][arg9 + 1][arg2] = 50;
                        class41.field503[arg5][arg9 + 1][arg2 + 1] = 50;
                    }
                    if (var11.field3029 == 1) {
                        class97.field1463[arg5][arg9 + 1][arg2] = class243.method1723(class97.field1463[arg5][arg9 + 1][arg2], 1);
                    }
                } else if (arg7 == 3) {
                    if (var11.field2975) {
                        class41.field503[arg5][arg9][arg2] = 50;
                        class41.field503[arg5][arg9 + 1][arg2] = 50;
                    }
                    if (var11.field3029 == 1) {
                        class97.field1463[arg5][arg9][arg2] = class243.method1723(class97.field1463[arg5][arg9][arg2], 2);
                    }
                }
            }
            if (var11.field2981 != 0 && arg6 != null) {
                arg6.method668((byte) 124, arg8, !var11.field2991, arg2, arg7, var11.field2982, arg9);
            }
            if (var11.field2997 != 16) {
                class43.method243(arg5, arg9, arg2, var11.field2997);
            }
        } else if (arg8 == 1) {
            class248 var35;
            if (var11.field2985 == -1 && var11.field2972 == null && var11.field2963 == null && !var11.field2971) {
                class177 var34 = var11.method1334(var22, var19, arg3, var21, (class91) null, -84, var18, arg7, 1, var20, var27);
                var35 = var34.field2784;
            } else {
                var35 = new class52(arg4, 1, arg7, arg1, arg9, arg2, -1, var11.field2994, (class248) null);
            }
            class40.method231(arg5, arg9, arg2, var20, var35, (class248) null, class163.field2494[arg7], 0, var25);
            if (var11.field2975 && arg3) {
                if (arg7 == 0) {
                    class41.field503[arg5][arg9][arg2 + 1] = 50;
                } else if (arg7 == 1) {
                    class41.field503[arg5][arg9 + 1][arg2 + 1] = 50;
                } else if (arg7 == 2) {
                    class41.field503[arg5][arg9 + 1][arg2] = 50;
                } else if (arg7 == 3) {
                    class41.field503[arg5][arg9][arg2] = 50;
                }
            }
            if (var11.field2981 != 0 && arg6 != null) {
                arg6.method668((byte) 109, arg8, !var11.field2991, arg2, arg7, var11.field2982, arg9);
            }
        } else if (arg8 == 2) {
            int var36 = arg7 + 1 & 0x3;
            class248 var38;
            class248 var40;
            if (var11.field2985 == -1 && var11.field2972 == null && var11.field2963 == null && !var11.field2971) {
                class177 var37 = var11.method1334(var22, var19, arg3, var21, (class91) null, -35, var18, arg7 + 4, 2, var20, var27);
                var38 = var37.field2784;
                class177 var39 = var11.method1334(var22, var19, arg3, var21, (class91) null, arg10 - 119, var18, var36, 2, var20, var27);
                var40 = var39.field2784;
            } else {
                var38 = new class52(arg4, 2, arg7 + 4, arg1, arg9, arg2, -1, var11.field2994, (class248) null);
                var40 = new class52(arg4, 2, var36, arg1, arg9, arg2, -1, var11.field2994, (class248) null);
            }
            class40.method231(arg5, arg9, arg2, var20, var38, var40, class126.field1813[arg7], class126.field1813[var36], var25);
            if (var11.field3029 == 1 && arg3) {
                if (arg7 == 0) {
                    class97.field1463[arg5][arg9][arg2] = class243.method1723(class97.field1463[arg5][arg9][arg2], 1);
                    class97.field1463[arg5][arg9][arg2 + 1] = class243.method1723(class97.field1463[arg5][arg9][arg2 + 1], 2);
                } else if (arg7 == 1) {
                    class97.field1463[arg5][arg9][arg2 + 1] = class243.method1723(class97.field1463[arg5][arg9][arg2 + 1], 2);
                    class97.field1463[arg5][arg9 + 1][arg2] = class243.method1723(class97.field1463[arg5][arg9 + 1][arg2], 1);
                } else if (arg7 == 2) {
                    class97.field1463[arg5][arg9 + 1][arg2] = class243.method1723(class97.field1463[arg5][arg9 + 1][arg2], 1);
                    class97.field1463[arg5][arg9][arg2] = class243.method1723(class97.field1463[arg5][arg9][arg2], 2);
                } else if (arg7 == 3) {
                    class97.field1463[arg5][arg9][arg2] = class243.method1723(class97.field1463[arg5][arg9][arg2], 2);
                    class97.field1463[arg5][arg9][arg2] = class243.method1723(class97.field1463[arg5][arg9][arg2], 1);
                }
            }
            if (var11.field2981 != 0 && arg6 != null) {
                arg6.method668((byte) 118, arg8, !var11.field2991, arg2, arg7, var11.field2982, arg9);
            }
            if (var11.field2997 != 16) {
                class43.method243(arg5, arg9, arg2, var11.field2997);
            }
        } else if (arg8 == 3) {
            class248 var42;
            if (var11.field2985 == -1 && var11.field2972 == null && var11.field2963 == null && !var11.field2971) {
                class177 var41 = var11.method1334(var22, var19, arg3, var21, (class91) null, -12, var18, arg7, 3, var20, var27);
                var42 = var41.field2784;
            } else {
                var42 = new class52(arg4, 3, arg7, arg1, arg9, arg2, -1, var11.field2994, (class248) null);
            }
            class40.method231(arg5, arg9, arg2, var20, var42, (class248) null, class163.field2494[arg7], 0, var25);
            if (var11.field2975 && arg3) {
                if (arg7 == 0) {
                    class41.field503[arg5][arg9][arg2 + 1] = 50;
                } else if (arg7 == 1) {
                    class41.field503[arg5][arg9 + 1][arg2 + 1] = 50;
                } else if (arg7 == 2) {
                    class41.field503[arg5][arg9 + 1][arg2] = 50;
                } else if (arg7 == 3) {
                    class41.field503[arg5][arg9][arg2] = 50;
                }
            }
            if (var11.field2981 != 0 && arg6 != null) {
                arg6.method668((byte) 119, arg8, !var11.field2991, arg2, arg7, var11.field2982, arg9);
            }
        } else if (arg8 == 9) {
            class248 var44;
            if (var11.field2985 == -1 && var11.field2972 == null && var11.field2963 == null && !var11.field2971) {
                class177 var43 = var11.method1334(var22, var19, arg3, var21, (class91) null, -16, var18, arg7, arg8, var20, var27);
                var44 = var43.field2784;
            } else {
                var44 = new class52(arg4, arg8, arg7, arg1, arg9, arg2, -1, var11.field2994, (class248) null);
            }
            class9.method55(arg5, arg9, arg2, var20, 1, 1, var44, 0, var25);
            if (var11.field2981 != 0 && arg6 != null) {
                arg6.method669(-1, !var11.field2991, var13, arg2, var12, arg9, var11.field2982);
            }
            if (var11.field2997 != 16) {
                class43.method243(arg5, arg9, arg2, var11.field2997);
            }
        } else if (arg8 == 4) {
            class248 var46;
            if (var11.field2985 == -1 && var11.field2972 == null && var11.field2963 == null && !var11.field2971) {
                class177 var45 = var11.method1334(var22, var19, arg3, var21, (class91) null, -49, var18, arg7, 4, var20, var27);
                var46 = var45.field2784;
            } else {
                var46 = new class52(arg4, 4, arg7, arg1, arg9, arg2, -1, var11.field2994, (class248) null);
            }
            class112.method747(arg5, arg9, arg2, var20, var46, (class248) null, class126.field1813[arg7], 0, 0, 0, var25);
        } else if (arg8 == 5) {
            int var47 = 16;
            long var48 = class78.method531(arg5, arg9, arg2);
            if (var48 != 0L) {
                var47 = class128.method822(Integer.MAX_VALUE & (int) (var48 >>> 32), (byte) -105).field2997;
            }
            class248 var51;
            if (var11.field2985 == -1 && var11.field2972 == null && var11.field2963 == null && !var11.field2971) {
                class177 var50 = var11.method1334(var22, var19, arg3, var21, (class91) null, -108, var18, arg7, 4, var20, var27);
                var51 = var50.field2784;
            } else {
                var51 = new class52(arg4, 4, arg7, arg1, arg9, arg2, -1, var11.field2994, (class248) null);
            }
            class112.method747(arg5, arg9, arg2, var20, var51, (class248) null, class126.field1813[arg7], 0, class231.field3735[arg7] * var47, class3.field53[arg7] * var47, var25);
        } else if (arg8 == 6) {
            long var52 = class78.method531(arg5, arg9, arg2);
            int var54 = 8;
            if (var52 != 0L) {
                var54 = class128.method822(Integer.MAX_VALUE & (int) (var52 >>> 32), (byte) -82).field2997 / 2;
            }
            class248 var56;
            if (var11.field2985 == -1 && var11.field2972 == null && var11.field2963 == null && !var11.field2971) {
                class177 var55 = var11.method1334(var22, var19, arg3, var21, (class91) null, -87, var18, arg7 + 4, 4, var20, var27);
                var56 = var55.field2784;
            } else {
                var56 = new class52(arg4, 4, arg7 + 4, arg1, arg9, arg2, -1, var11.field2994, (class248) null);
            }
            class112.method747(arg5, arg9, arg2, var20, var56, (class248) null, 256, arg7, class72.field1074[arg7] * var54, class66.field977[arg7] * var54, var25);
        } else if (arg8 == 7) {
            int var57 = arg7 + 2 & 0x3;
            class248 var59;
            if (var11.field2985 == -1 && var11.field2972 == null && var11.field2963 == null && !var11.field2971) {
                class177 var58 = var11.method1334(var22, var19, arg3, var21, (class91) null, -82, var18, var57 + 4, 4, var20, var27);
                var59 = var58.field2784;
            } else {
                var59 = new class52(arg4, 4, var57 + 4, arg1, arg9, arg2, -1, var11.field2994, (class248) null);
            }
            class112.method747(arg5, arg9, arg2, var20, var59, (class248) null, 256, var57, 0, 0, var25);
        } else if (arg8 == 8) {
            long var60 = class78.method531(arg5, arg9, arg2);
            int var62 = 8;
            if (var60 != 0L) {
                var62 = class128.method822((int) (var60 >>> 32) & Integer.MAX_VALUE, (byte) -53).field2997 / 2;
            }
            int var63 = arg7 + 2 & 0x3;
            class248 var65;
            class248 var67;
            if (var11.field2985 == -1 && var11.field2972 == null && var11.field2963 == null && !var11.field2971) {
                class177 var64 = var11.method1334(var22, var19, arg3, var21, (class91) null, -94, var18, arg7 + 4, 4, var20, var27);
                var65 = var64.field2784;
                class177 var66 = var11.method1334(var22, var19, arg3, var21, (class91) null, -34, var18, var63 + 4, 4, var20, var27);
                var67 = var66.field2784;
            } else {
                var65 = new class52(arg4, 4, arg7 + 4, arg1, arg9, arg2, -1, var11.field2994, (class248) null);
                var67 = new class52(arg4, 4, var63 + 4, arg1, arg9, arg2, -1, var11.field2994, (class248) null);
            }
            class112.method747(arg5, arg9, arg2, var20, var65, var67, 256, arg7, class72.field1074[arg7] * var62, class66.field977[arg7] * var62, var25);
        }
    }

    @OriginalMember(owner = "client!c", name = "run", descriptor = "()V")
    public final void run() {
        this.field4688 = true;
        field4678++;
        try {
            while (!this.field4677) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class218 var2 = this.field4680[var1];
                    if (var2 != null) {
                        var2.method1534((byte) -110);
                    }
                }
                class7.method43(-71, 10L);
                class140.method880(512, this.field4684, (Object) null);
            }
        } catch (Exception var9) {
            class285.method1952(var9, (byte) -92, (String) null);
        } finally {
            Object var6 = null;
            this.field4688 = false;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1981(int arg0, Throwable arg1) throws IOException {
        field4689++;
        String var3;
        if (arg1 instanceof class112) {
            class112 var2 = (class112) arg1;
            arg1 = var2.field1618;
            var3 = var2.field1620 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        if (arg0 <= 95) {
            field4687 = null;
        }
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }
}
