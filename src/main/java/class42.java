import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class42 {

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "[I")
    public int[] field633 = new int[257];

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "[B")
    public byte[] field637 = new byte[4096];

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "[[I")
    public int[][] field650 = new int[6][258];

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "[Z")
    public boolean[] field648 = new boolean[256];

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "[Z")
    public boolean[] field645 = new boolean[16];

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "[[B")
    public byte[][] field652 = new byte[6][258];

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "[[I")
    public int[][] field635 = new int[6][258];

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
    public int field655 = 0;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "[B")
    public byte[] field644 = new byte[256];

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "[B")
    public byte[] field654 = new byte[18002];

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "[I")
    public int[] field649 = new int[16];

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "[[I")
    public int[][] field651 = new int[6][258];

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public int field660 = 0;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "[B")
    public byte[] field661 = new byte[18002];

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "[I")
    public int[] field665 = new int[6];

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "[I")
    public int[] field647 = new int[256];

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Lsc;")
    public static class181 field634 = class149.method967(255, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "Lsc;")
    private static class181 field646 = class149.method967(255, "Loaded textures");

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "[Lai;")
    public static class50[] field636 = new class50[4];

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "Lsc;")
    public static class181 field663 = field646;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "B")
    public byte field628;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public int field626;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public int field630;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public int field632;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public int field638;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public int field639;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public int field640;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public int field642;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    public int field664;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "[B")
    public byte[] field627;

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "[B")
    public byte[] field653;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V")
    public static final void method292(int arg0, int arg1, int arg2) {
        field659++;
        int[] var3 = new int[4];
        var3[0] = arg1;
        int var4 = 1;
        int[] var5 = new int[4];
        var5[0] = arg0;
        if (arg2 < 88) {
            field646 = null;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            if (class64.field1031[var6] != arg1) {
                var3[var4] = class64.field1031[var6];
                var5[var4] = class33.field539[var6];
                var4++;
            }
        }
        class33.field539 = var5;
        class64.field1031 = var3;
        class256.method1744(class131.field2167, -8684, class131.field2167.length - 1, 0);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static void method293(byte arg0) {
        field663 = null;
        field646 = null;
        if (arg0 > 98) {
            field634 = null;
            field636 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLpe;)V")
    public static final void method294(byte arg0, class245 arg1) {
        arg1.method1655(class114.field1848, class143.field2321 / 2, class41.field620 / 2 - 26, 16777215, -1);
        field631++;
        int var2 = class41.field620 / 2 - 18;
        class17.method155(class143.field2321 / 2 - 152, var2, 304, 34, 9179409);
        class17.method155(class143.field2321 / 2 - 151, var2 + 1, 302, 32, 0);
        if (arg0 >= -82) {
            field636 = null;
        }
        class17.method156(class143.field2321 / 2 - 150, var2 + 2, class236.field4100 * 3, 30, 9179409);
        class17.method156(class143.field2321 / 2 + class236.field4100 * 3 - 150, var2 + 2, 300 - (class236.field4100 * 3), 30, 0);
        arg1.method1655(class140.field2268, class143.field2321 / 2, class41.field620 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILjc;ZIIIIIIZI)V")
    public static final void method295(int arg0, class8 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field641++;
        if (arg9 && !class219.method1460(51885665) && (class70.field1129[0][arg6][arg8] & 0x2) == 0) {
            if ((class70.field1129[arg5][arg6][arg8] & 0x10) != 0) {
                return;
            }
            if (class106.method714((byte) 121, arg8, arg6, arg5) != class31.field509) {
                return;
            }
        }
        if (class107.field1754 > arg5) {
            class107.field1754 = arg5;
        }
        class148 var11 = class62.method442((byte) 79, arg0);
        int var12;
        int var13;
        if (arg7 == 1 || arg7 == 3) {
            var13 = var11.field2466;
            var12 = var11.field2433;
        } else {
            var12 = var11.field2466;
            var13 = var11.field2433;
        }
        int var14;
        int var15;
        if ((arg6 + var12) <= 104) {
            var14 = (var12 + 1 >> 1) + arg6;
            var15 = (var12 >> 1) + arg6;
        } else {
            var15 = arg6;
            var14 = arg6 + 1;
        }
        int var16;
        int var17;
        if (arg8 + var13 > 104) {
            var16 = arg8 + 1;
            var17 = arg8;
        } else {
            var16 = (var13 + 1 >> 1) + arg8;
            var17 = (var13 >> 1) + arg8;
        }
        int[][] var18 = class31.field505[arg10];
        int var19 = (arg8 << 7) + (var13 << 6);
        int var20 = (arg6 << 7) + (var12 << 6);
        int var21 = var18[var14][var16] + var18[var15][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
        int[][] var22 = null;
        long var23 = (long) (arg7 | 0x400 << 20 | arg3 << 14 | arg6 | arg8 << 7);
        if (arg2) {
            var22 = class21.field379[0];
        } else if (arg10 < 3) {
            var22 = class31.field505[arg10 + 1];
        }
        if (var11.field2420 == 0 || arg2) {
            var23 |= Long.MIN_VALUE;
        }
        if (var11.field2471 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field2464) {
            var23 |= 0x80000000L;
        }
        long var25 = var23 | (long) arg0 << 32;
        if (var11.method962((byte) 67)) {
            class76.method531(9522, (class116) null, (class178) null, var11, arg7, arg6, arg5, arg8);
        }
        if (arg4 > -73) {
            return;
        }
        boolean var27 = !arg2 & var11.field2448;
        if (arg3 == 22) {
            if (class239.field4165 || var11.field2420 != 0 || var11.field2463 == 1 || var11.field2444) {
                class208 var29;
                if (var11.field2441 == -1 && var11.field2446 == null) {
                    class260 var28 = var11.method954(var19, arg9, (byte) 34, var18, var22, var20, (class134) null, var21, arg7, 22, var27);
                    var29 = var28.field4534;
                } else {
                    var29 = new class96(arg0, 22, arg7, arg10, arg6, arg8, var11.field2441, var11.field2460, (class208) null);
                }
                class25.method211(arg5, arg6, arg8, var21, var29, var25, var11.field2447);
                if (var11.field2463 == 1 && arg1 != null) {
                    arg1.method68(arg8, arg6, 262144);
                }
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class208 var69;
            if (var11.field2441 == -1 && var11.field2446 == null) {
                class260 var68 = var11.method954(var19, arg9, (byte) 106, var18, var22, var20, (class134) null, var21, arg3 == 11 ? arg7 + 4 : arg7, 10, var27);
                var69 = var68.field4534;
            } else {
                var69 = new class96(arg0, 10, arg3 == 11 ? arg7 + 4 : arg7, arg10, arg6, arg8, var11.field2441, var11.field2460, (class208) null);
            }
            if (var69 != null) {
                boolean var70 = class57.method416(arg5, arg6, arg8, var21, var12, var13, var69, 0, var25);
                if (var11.field2452 && var70 && arg9) {
                    int var71 = 15;
                    if (var69 instanceof class249) {
                        var71 = ((class249) var69).method1580() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var12; var72++) {
                        for (int var73 = 0; var73 <= var13; var73++) {
                            if (var71 > class113.field1836[arg5][arg6 + var72][arg8 + var73]) {
                                class113.field1836[arg5][arg6 + var72][arg8 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field2463 != 0 && arg1 != null) {
                arg1.method62(var12, arg8, var11.field2437, arg6, true, var13);
            }
        } else if (arg3 >= 12) {
            class208 var31;
            if (var11.field2441 == -1 && var11.field2446 == null) {
                class260 var30 = var11.method954(var19, arg9, (byte) 40, var18, var22, var20, (class134) null, var21, arg7, arg3, var27);
                var31 = var30.field4534;
            } else {
                var31 = new class96(arg0, arg3, arg7, arg10, arg6, arg8, var11.field2441, var11.field2460, (class208) null);
            }
            class57.method416(arg5, arg6, arg8, var21, 1, 1, var31, 0, var25);
            if (arg9 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg5 > 0) {
                class52.field813[arg5][arg6][arg8] = class185.method1291(class52.field813[arg5][arg6][arg8], 4);
            }
            if (var11.field2463 != 0 && arg1 != null) {
                arg1.method62(var12, arg8, var11.field2437, arg6, true, var13);
            }
        } else if (arg3 == 0) {
            class208 var33;
            if (var11.field2441 == -1 && var11.field2446 == null) {
                class260 var32 = var11.method954(var19, arg9, (byte) 62, var18, var22, var20, (class134) null, var21, arg7, 0, var27);
                var33 = var32.field4534;
            } else {
                var33 = new class96(arg0, 0, arg7, arg10, arg6, arg8, var11.field2441, var11.field2460, (class208) null);
            }
            class131.method845(arg5, arg6, arg8, var21, var33, (class208) null, class3.field71[arg7], 0, var25);
            if (arg9) {
                if (arg7 == 0) {
                    if (var11.field2452) {
                        class113.field1836[arg5][arg6][arg8] = 50;
                        class113.field1836[arg5][arg6][arg8 + 1] = 50;
                    }
                    if (var11.field2445) {
                        class52.field813[arg5][arg6][arg8] = class185.method1291(class52.field813[arg5][arg6][arg8], 1);
                    }
                } else if (arg7 == 1) {
                    if (var11.field2452) {
                        class113.field1836[arg5][arg6][arg8 + 1] = 50;
                        class113.field1836[arg5][arg6 + 1][arg8 + 1] = 50;
                    }
                    if (var11.field2445) {
                        class52.field813[arg5][arg6][arg8 + 1] = class185.method1291(class52.field813[arg5][arg6][arg8 + 1], 2);
                    }
                } else if (arg7 == 2) {
                    if (var11.field2452) {
                        class113.field1836[arg5][arg6 + 1][arg8] = 50;
                        class113.field1836[arg5][arg6 + 1][arg8 + 1] = 50;
                    }
                    if (var11.field2445) {
                        class52.field813[arg5][arg6 + 1][arg8] = class185.method1291(class52.field813[arg5][arg6 + 1][arg8], 1);
                    }
                } else if (arg7 == 3) {
                    if (var11.field2452) {
                        class113.field1836[arg5][arg6][arg8] = 50;
                        class113.field1836[arg5][arg6 + 1][arg8] = 50;
                    }
                    if (var11.field2445) {
                        class52.field813[arg5][arg6][arg8] = class185.method1291(class52.field813[arg5][arg6][arg8], 2);
                    }
                }
            }
            if (var11.field2463 != 0 && arg1 != null) {
                arg1.method63(arg8, arg6, 7834, arg3, arg7, var11.field2437);
            }
            if (var11.field2429 != 16) {
                class157.method1048(arg5, arg6, arg8, var11.field2429);
            }
        } else if (arg3 == 1) {
            class208 var35;
            if (var11.field2441 == -1 && var11.field2446 == null) {
                class260 var34 = var11.method954(var19, arg9, (byte) 45, var18, var22, var20, (class134) null, var21, arg7, 1, var27);
                var35 = var34.field4534;
            } else {
                var35 = new class96(arg0, 1, arg7, arg10, arg6, arg8, var11.field2441, var11.field2460, (class208) null);
            }
            class131.method845(arg5, arg6, arg8, var21, var35, (class208) null, class171.field2870[arg7], 0, var25);
            if (var11.field2452 && arg9) {
                if (arg7 == 0) {
                    class113.field1836[arg5][arg6][arg8 + 1] = 50;
                } else if (arg7 == 1) {
                    class113.field1836[arg5][arg6 + 1][arg8 + 1] = 50;
                } else if (arg7 == 2) {
                    class113.field1836[arg5][arg6 + 1][arg8] = 50;
                } else if (arg7 == 3) {
                    class113.field1836[arg5][arg6][arg8] = 50;
                }
            }
            if (var11.field2463 != 0 && arg1 != null) {
                arg1.method63(arg8, arg6, 7834, arg3, arg7, var11.field2437);
            }
        } else if (arg3 == 2) {
            int var36 = arg7 + 1 & 0x3;
            class208 var38;
            class208 var40;
            if (var11.field2441 == -1 && var11.field2446 == null) {
                class260 var37 = var11.method954(var19, arg9, (byte) 106, var18, var22, var20, (class134) null, var21, arg7 + 4, 2, var27);
                var38 = var37.field4534;
                class260 var39 = var11.method954(var19, arg9, (byte) 73, var18, var22, var20, (class134) null, var21, var36, 2, var27);
                var40 = var39.field4534;
            } else {
                var38 = new class96(arg0, 2, arg7 + 4, arg10, arg6, arg8, var11.field2441, var11.field2460, (class208) null);
                var40 = new class96(arg0, 2, var36, arg10, arg6, arg8, var11.field2441, var11.field2460, (class208) null);
            }
            class131.method845(arg5, arg6, arg8, var21, var38, var40, class3.field71[arg7], class3.field71[var36], var25);
            if (var11.field2445 && arg9) {
                if (arg7 == 0) {
                    class52.field813[arg5][arg6][arg8] = class185.method1291(class52.field813[arg5][arg6][arg8], 1);
                    class52.field813[arg5][arg6][arg8 + 1] = class185.method1291(class52.field813[arg5][arg6][arg8 + 1], 2);
                } else if (arg7 == 1) {
                    class52.field813[arg5][arg6][arg8 + 1] = class185.method1291(class52.field813[arg5][arg6][arg8 + 1], 2);
                    class52.field813[arg5][arg6 + 1][arg8] = class185.method1291(class52.field813[arg5][arg6 + 1][arg8], 1);
                } else if (arg7 == 2) {
                    class52.field813[arg5][arg6 + 1][arg8] = class185.method1291(class52.field813[arg5][arg6 + 1][arg8], 1);
                    class52.field813[arg5][arg6][arg8] = class185.method1291(class52.field813[arg5][arg6][arg8], 2);
                } else if (arg7 == 3) {
                    class52.field813[arg5][arg6][arg8] = class185.method1291(class52.field813[arg5][arg6][arg8], 2);
                    class52.field813[arg5][arg6][arg8] = class185.method1291(class52.field813[arg5][arg6][arg8], 1);
                }
            }
            if (var11.field2463 != 0 && arg1 != null) {
                arg1.method63(arg8, arg6, 7834, arg3, arg7, var11.field2437);
            }
            if (var11.field2429 != 16) {
                class157.method1048(arg5, arg6, arg8, var11.field2429);
            }
        } else if (arg3 == 3) {
            class208 var42;
            if (var11.field2441 == -1 && var11.field2446 == null) {
                class260 var41 = var11.method954(var19, arg9, (byte) 68, var18, var22, var20, (class134) null, var21, arg7, 3, var27);
                var42 = var41.field4534;
            } else {
                var42 = new class96(arg0, 3, arg7, arg10, arg6, arg8, var11.field2441, var11.field2460, (class208) null);
            }
            class131.method845(arg5, arg6, arg8, var21, var42, (class208) null, class171.field2870[arg7], 0, var25);
            if (var11.field2452 && arg9) {
                if (arg7 == 0) {
                    class113.field1836[arg5][arg6][arg8 + 1] = 50;
                } else if (arg7 == 1) {
                    class113.field1836[arg5][arg6 + 1][arg8 + 1] = 50;
                } else if (arg7 == 2) {
                    class113.field1836[arg5][arg6 + 1][arg8] = 50;
                } else if (arg7 == 3) {
                    class113.field1836[arg5][arg6][arg8] = 50;
                }
            }
            if (var11.field2463 != 0 && arg1 != null) {
                arg1.method63(arg8, arg6, 7834, arg3, arg7, var11.field2437);
            }
        } else if (arg3 == 9) {
            class208 var44;
            if (var11.field2441 == -1 && var11.field2446 == null) {
                class260 var43 = var11.method954(var19, arg9, (byte) 31, var18, var22, var20, (class134) null, var21, arg7, arg3, var27);
                var44 = var43.field4534;
            } else {
                var44 = new class96(arg0, arg3, arg7, arg10, arg6, arg8, var11.field2441, var11.field2460, (class208) null);
            }
            class57.method416(arg5, arg6, arg8, var21, 1, 1, var44, 0, var25);
            if (var11.field2463 != 0 && arg1 != null) {
                arg1.method62(var12, arg8, var11.field2437, arg6, true, var13);
            }
            if (var11.field2429 != 16) {
                class157.method1048(arg5, arg6, arg8, var11.field2429);
            }
        } else if (arg3 == 4) {
            class208 var46;
            if (var11.field2441 == -1 && var11.field2446 == null) {
                class260 var45 = var11.method954(var19, arg9, (byte) 100, var18, var22, var20, (class134) null, var21, arg7, 4, var27);
                var46 = var45.field4534;
            } else {
                var46 = new class96(arg0, 4, arg7, arg10, arg6, arg8, var11.field2441, var11.field2460, (class208) null);
            }
            class43.method296(arg5, arg6, arg8, var21, var46, (class208) null, class3.field71[arg7], 0, 0, 0, var25);
        } else if (arg3 == 5) {
            int var47 = 16;
            long var48 = class230.method1528(arg5, arg6, arg8);
            if (var48 != 0L) {
                var47 = class62.method442((byte) 79, Integer.MAX_VALUE & (int) (var48 >>> 32)).field2429;
            }
            class208 var51;
            if (var11.field2441 == -1 && var11.field2446 == null) {
                class260 var50 = var11.method954(var19, arg9, (byte) 106, var18, var22, var20, (class134) null, var21, arg7, 4, var27);
                var51 = var50.field4534;
            } else {
                var51 = new class96(arg0, 4, arg7, arg10, arg6, arg8, var11.field2441, var11.field2460, (class208) null);
            }
            class43.method296(arg5, arg6, arg8, var21, var51, (class208) null, class3.field71[arg7], 0, class35.field554[arg7] * var47, class135.field2207[arg7] * var47, var25);
        } else if (arg3 == 6) {
            int var52 = 8;
            long var53 = class230.method1528(arg5, arg6, arg8);
            if (var53 != 0L) {
                var52 = class62.method442((byte) 79, Integer.MAX_VALUE & (int) (var53 >>> 32)).field2429 / 2;
            }
            class208 var56;
            if (var11.field2441 == -1 && var11.field2446 == null) {
                class260 var55 = var11.method954(var19, arg9, (byte) 80, var18, var22, var20, (class134) null, var21, arg7 + 4, 4, var27);
                var56 = var55.field4534;
            } else {
                var56 = new class96(arg0, 4, arg7 + 4, arg10, arg6, arg8, var11.field2441, var11.field2460, (class208) null);
            }
            class43.method296(arg5, arg6, arg8, var21, var56, (class208) null, 256, arg7, class144.field2349[arg7] * var52, class217.field3727[arg7] * var52, var25);
        } else if (arg3 == 7) {
            int var57 = arg7 + 2 & 0x3;
            class208 var59;
            if (var11.field2441 == -1 && var11.field2446 == null) {
                class260 var58 = var11.method954(var19, arg9, (byte) 91, var18, var22, var20, (class134) null, var21, var57 + 4, 4, var27);
                var59 = var58.field4534;
            } else {
                var59 = new class96(arg0, 4, var57 + 4, arg10, arg6, arg8, var11.field2441, var11.field2460, (class208) null);
            }
            class43.method296(arg5, arg6, arg8, var21, var59, (class208) null, 256, var57, 0, 0, var25);
        } else if (arg3 == 8) {
            long var60 = class230.method1528(arg5, arg6, arg8);
            int var62 = 8;
            if (var60 != 0L) {
                var62 = class62.method442((byte) 79, (int) (var60 >>> 32) & Integer.MAX_VALUE).field2429 / 2;
            }
            int var63 = arg7 + 2 & 0x3;
            class208 var65;
            class208 var67;
            if (var11.field2441 == -1 && var11.field2446 == null) {
                class260 var64 = var11.method954(var19, arg9, (byte) 79, var18, var22, var20, (class134) null, var21, arg7 + 4, 4, var27);
                var65 = var64.field4534;
                class260 var66 = var11.method954(var19, arg9, (byte) 98, var18, var22, var20, (class134) null, var21, var63 + 4, 4, var27);
                var67 = var66.field4534;
            } else {
                var65 = new class96(arg0, 4, arg7 + 4, arg10, arg6, arg8, var11.field2441, var11.field2460, (class208) null);
                var67 = new class96(arg0, 4, var63 + 4, arg10, arg6, arg8, var11.field2441, var11.field2460, (class208) null);
            }
            class43.method296(arg5, arg6, arg8, var21, var65, var67, 256, arg7, class144.field2349[arg7] * var62, class217.field3727[arg7] * var62, var25);
        }
    }
}
