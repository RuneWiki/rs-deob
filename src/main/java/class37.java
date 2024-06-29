import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OBDFVVEL")
public class class37 {

    @OriginalMember(owner = "client!OBDFVVEL", name = "i", descriptor = "Z")
    private boolean field1093 = true;

    @OriginalMember(owner = "client!OBDFVVEL", name = "k", descriptor = "B")
    private byte field1095 = 6;

    @OriginalMember(owner = "client!OBDFVVEL", name = "C", descriptor = "Z")
    private boolean field1113 = false;

    @OriginalMember(owner = "client!OBDFVVEL", name = "q", descriptor = "I")
    private int field1101;

    @OriginalMember(owner = "client!OBDFVVEL", name = "r", descriptor = "I")
    private int field1102;

    @OriginalMember(owner = "client!OBDFVVEL", name = "o", descriptor = "[[[I")
    private int[][][] field1099;

    @OriginalMember(owner = "client!OBDFVVEL", name = "F", descriptor = "[[[B")
    private byte[][][] field1116;

    @OriginalMember(owner = "client!OBDFVVEL", name = "b", descriptor = "[[[B")
    private byte[][][] field1086;

    @OriginalMember(owner = "client!OBDFVVEL", name = "g", descriptor = "[[[B")
    private byte[][][] field1091;

    @OriginalMember(owner = "client!OBDFVVEL", name = "j", descriptor = "[[[B")
    private byte[][][] field1094;

    @OriginalMember(owner = "client!OBDFVVEL", name = "e", descriptor = "[[[B")
    private byte[][][] field1089;

    @OriginalMember(owner = "client!OBDFVVEL", name = "y", descriptor = "[[[I")
    private int[][][] field1109;

    @OriginalMember(owner = "client!OBDFVVEL", name = "h", descriptor = "[[[B")
    private byte[][][] field1092;

    @OriginalMember(owner = "client!OBDFVVEL", name = "H", descriptor = "[[I")
    private int[][] field1118;

    @OriginalMember(owner = "client!OBDFVVEL", name = "s", descriptor = "[I")
    private int[] field1103;

    @OriginalMember(owner = "client!OBDFVVEL", name = "t", descriptor = "[I")
    private int[] field1104;

    @OriginalMember(owner = "client!OBDFVVEL", name = "u", descriptor = "[I")
    private int[] field1105;

    @OriginalMember(owner = "client!OBDFVVEL", name = "v", descriptor = "[I")
    private int[] field1106;

    @OriginalMember(owner = "client!OBDFVVEL", name = "w", descriptor = "[I")
    private int[] field1107;

    @OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "I")
    private static int field1085 = 34585;

    @OriginalMember(owner = "client!OBDFVVEL", name = "d", descriptor = "I")
    private static int field1088 = -447;

    @OriginalMember(owner = "client!OBDFVVEL", name = "f", descriptor = "[I")
    private static final int[] field1090 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!OBDFVVEL", name = "l", descriptor = "[I")
    private static final int[] field1096 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!OBDFVVEL", name = "m", descriptor = "[I")
    private static final int[] field1097 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!OBDFVVEL", name = "n", descriptor = "B")
    private static byte field1098 = -106;

    @OriginalMember(owner = "client!OBDFVVEL", name = "p", descriptor = "I")
    public static int field1100 = 99;

    @OriginalMember(owner = "client!OBDFVVEL", name = "z", descriptor = "I")
    private static int field1110 = 16592;

    @OriginalMember(owner = "client!OBDFVVEL", name = "A", descriptor = "I")
    private static int field1111 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!OBDFVVEL", name = "B", descriptor = "Z")
    public static boolean field1112 = true;

    @OriginalMember(owner = "client!OBDFVVEL", name = "D", descriptor = "I")
    private static int field1114 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!OBDFVVEL", name = "E", descriptor = "[I")
    private static final int[] field1115 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!OBDFVVEL", name = "c", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!OBDFVVEL", name = "x", descriptor = "I")
    private static int field1108;

    @OriginalMember(owner = "client!OBDFVVEL", name = "G", descriptor = "Z")
    private static boolean field1117;

    @OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(LNQUAUMDT;BLNJYVZTLI;)V")
    public static final void method378(class36 arg0, byte arg1, class34 arg2) {
        int var3 = -1;
        if (arg1 != 49) {
            field1108 = -271;
        }
        while (true) {
            int var4 = arg0.method353();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class25 var5 = class25.method249(var3);
            var5.method244(arg2, 4);
            while (true) {
                int var6 = arg0.method353();
                if (var6 == 0) {
                    break;
                }
                arg0.method339();
            }
        }
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(III)Z")
    public static final boolean method379(int arg0, int arg1, int arg2) {
        if (arg2 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        class25 var4 = class25.method249(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var4.method252(arg1, 6);
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(IILUJWODGQS;LYCMSDYIA;IIIII)V")
    private final void method380(int arg0, int arg1, class56 arg2, class67 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (field1112 && (this.field1116[0][arg4][arg6] & 0x2) == 0) {
            if ((this.field1116[arg5][arg4][arg6] & 0x10) != 0) {
                return;
            }
            if (this.method387(arg6, 776, arg5, arg4) != field1087) {
                return;
            }
        }
        if (arg5 < field1100) {
            field1100 = arg5;
        }
        int var10 = this.field1099[arg5][arg4][arg6];
        int var11 = this.field1099[arg5][arg4 + 1][arg6];
        int var12 = this.field1099[arg5][arg4 + 1][arg6 + 1];
        int var13 = this.field1099[arg5][arg4][arg6 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class25 var15 = class25.method249(arg1);
        int var16 = (arg1 << 14) + (arg6 << 7) + arg4 + 1073741824;
        if (arg7 != 16592) {
            this.field1093 = !this.field1093;
        }
        if (!var15.field861) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg8 << 6) + arg0);
        if (arg0 == 22) {
            if (!field1112 || var15.field861 || var15.field883) {
                class50 var18;
                if (var15.field899 == -1 && var15.field872 == null) {
                    var18 = var15.method247(22, arg8, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class21(arg1, var10, 22, var13, var11, var12, arg8, true, -126, var15.field899);
                }
                arg2.method464(var18, (byte) 1, var14, var17, arg6, var16, arg4, arg5);
                if (var15.field885 && var15.field861 && arg3 != null) {
                    arg3.method564(arg4, field1117, arg6);
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            class50 var38;
            if (var15.field899 == -1 && var15.field872 == null) {
                var38 = var15.method247(10, arg8, var10, var11, var12, var13, -1);
            } else {
                var38 = new class21(arg1, var10, 10, var13, var11, var12, arg8, true, -126, var15.field899);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg0 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg8 == 1 || arg8 == 3) {
                    var40 = var15.field853;
                    var41 = var15.field896;
                } else {
                    var40 = var15.field896;
                    var41 = var15.field853;
                }
                if (arg2.method468(var16, var39, var40, arg6, arg4, var41, 62, var17, var14, var38, arg5) && var15.field869) {
                    class22 var42;
                    if (var38 instanceof class22) {
                        var42 = (class22) var38;
                    } else {
                        var42 = var15.method247(10, arg8, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field792 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1092[arg5][arg4 + var43][arg6 + var44]) {
                                    this.field1092[arg5][arg4 + var43][arg6 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field885 && arg3 != null) {
                arg3.method563(var15.field864, arg4, arg8, var15.field896, arg6, 555, var15.field853);
            }
        } else if (arg0 >= 12) {
            class50 var19;
            if (var15.field899 == -1 && var15.field872 == null) {
                var19 = var15.method247(arg0, arg8, var10, var11, var12, var13, -1);
            } else {
                var19 = new class21(arg1, var10, arg0, var13, var11, var12, arg8, true, -126, var15.field899);
            }
            arg2.method468(var16, 0, 1, arg6, arg4, 1, 62, var17, var14, var19, arg5);
            if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg5 > 0) {
                this.field1109[arg5][arg4][arg6] |= 0x924;
            }
            if (var15.field885 && arg3 != null) {
                arg3.method563(var15.field864, arg4, arg8, var15.field896, arg6, 555, var15.field853);
            }
        } else if (arg0 == 0) {
            class50 var20;
            if (var15.field899 == -1 && var15.field872 == null) {
                var20 = var15.method247(0, arg8, var10, var11, var12, var13, -1);
            } else {
                var20 = new class21(arg1, var10, 0, var13, var11, var12, arg8, true, -126, var15.field899);
            }
            arg2.method466(field1085, field1115[arg8], arg5, null, var17, arg6, var20, 0, var16, var14, arg4);
            if (arg8 == 0) {
                if (var15.field869) {
                    this.field1092[arg5][arg4][arg6] = 50;
                    this.field1092[arg5][arg4][arg6 + 1] = 50;
                }
                if (var15.field870) {
                    this.field1109[arg5][arg4][arg6] |= 0x249;
                }
            } else if (arg8 == 1) {
                if (var15.field869) {
                    this.field1092[arg5][arg4][arg6 + 1] = 50;
                    this.field1092[arg5][arg4 + 1][arg6 + 1] = 50;
                }
                if (var15.field870) {
                    this.field1109[arg5][arg4][arg6 + 1] |= 0x492;
                }
            } else if (arg8 == 2) {
                if (var15.field869) {
                    this.field1092[arg5][arg4 + 1][arg6] = 50;
                    this.field1092[arg5][arg4 + 1][arg6 + 1] = 50;
                }
                if (var15.field870) {
                    this.field1109[arg5][arg4 + 1][arg6] |= 0x249;
                }
            } else if (arg8 == 3) {
                if (var15.field869) {
                    this.field1092[arg5][arg4][arg6] = 50;
                    this.field1092[arg5][arg4 + 1][arg6] = 50;
                }
                if (var15.field870) {
                    this.field1109[arg5][arg4][arg6] |= 0x492;
                }
            }
            if (var15.field885 && arg3 != null) {
                arg3.method562(var15.field864, arg8, -978, arg6, arg0, arg4);
            }
            if (var15.field894 != 16) {
                arg2.method474(var15.field894, arg4, arg5, arg6, 1);
            }
        } else if (arg0 == 1) {
            class50 var21;
            if (var15.field899 == -1 && var15.field872 == null) {
                var21 = var15.method247(1, arg8, var10, var11, var12, var13, -1);
            } else {
                var21 = new class21(arg1, var10, 1, var13, var11, var12, arg8, true, -126, var15.field899);
            }
            arg2.method466(field1085, field1096[arg8], arg5, null, var17, arg6, var21, 0, var16, var14, arg4);
            if (var15.field869) {
                if (arg8 == 0) {
                    this.field1092[arg5][arg4][arg6 + 1] = 50;
                } else if (arg8 == 1) {
                    this.field1092[arg5][arg4 + 1][arg6 + 1] = 50;
                } else if (arg8 == 2) {
                    this.field1092[arg5][arg4 + 1][arg6] = 50;
                } else if (arg8 == 3) {
                    this.field1092[arg5][arg4][arg6] = 50;
                }
            }
            if (var15.field885 && arg3 != null) {
                arg3.method562(var15.field864, arg8, -978, arg6, arg0, arg4);
            }
        } else if (arg0 == 2) {
            int var22 = arg8 + 1 & 0x3;
            class50 var23;
            class50 var24;
            if (var15.field899 == -1 && var15.field872 == null) {
                var23 = var15.method247(2, arg8 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method247(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class21(arg1, var10, 2, var13, var11, var12, arg8 + 4, true, -126, var15.field899);
                var24 = new class21(arg1, var10, 2, var13, var11, var12, var22, true, -126, var15.field899);
            }
            arg2.method466(field1085, field1115[arg8], arg5, var24, var17, arg6, var23, field1115[var22], var16, var14, arg4);
            if (var15.field870) {
                if (arg8 == 0) {
                    this.field1109[arg5][arg4][arg6] |= 0x249;
                    this.field1109[arg5][arg4][arg6 + 1] |= 0x492;
                } else if (arg8 == 1) {
                    this.field1109[arg5][arg4][arg6 + 1] |= 0x492;
                    this.field1109[arg5][arg4 + 1][arg6] |= 0x249;
                } else if (arg8 == 2) {
                    this.field1109[arg5][arg4 + 1][arg6] |= 0x249;
                    this.field1109[arg5][arg4][arg6] |= 0x492;
                } else if (arg8 == 3) {
                    this.field1109[arg5][arg4][arg6] |= 0x492;
                    this.field1109[arg5][arg4][arg6] |= 0x249;
                }
            }
            if (var15.field885 && arg3 != null) {
                arg3.method562(var15.field864, arg8, -978, arg6, arg0, arg4);
            }
            if (var15.field894 != 16) {
                arg2.method474(var15.field894, arg4, arg5, arg6, 1);
            }
        } else if (arg0 == 3) {
            class50 var25;
            if (var15.field899 == -1 && var15.field872 == null) {
                var25 = var15.method247(3, arg8, var10, var11, var12, var13, -1);
            } else {
                var25 = new class21(arg1, var10, 3, var13, var11, var12, arg8, true, -126, var15.field899);
            }
            arg2.method466(field1085, field1096[arg8], arg5, null, var17, arg6, var25, 0, var16, var14, arg4);
            if (var15.field869) {
                if (arg8 == 0) {
                    this.field1092[arg5][arg4][arg6 + 1] = 50;
                } else if (arg8 == 1) {
                    this.field1092[arg5][arg4 + 1][arg6 + 1] = 50;
                } else if (arg8 == 2) {
                    this.field1092[arg5][arg4 + 1][arg6] = 50;
                } else if (arg8 == 3) {
                    this.field1092[arg5][arg4][arg6] = 50;
                }
            }
            if (var15.field885 && arg3 != null) {
                arg3.method562(var15.field864, arg8, -978, arg6, arg0, arg4);
            }
        } else if (arg0 == 9) {
            class50 var26;
            if (var15.field899 == -1 && var15.field872 == null) {
                var26 = var15.method247(arg0, arg8, var10, var11, var12, var13, -1);
            } else {
                var26 = new class21(arg1, var10, arg0, var13, var11, var12, arg8, true, -126, var15.field899);
            }
            arg2.method468(var16, 0, 1, arg6, arg4, 1, 62, var17, var14, var26, arg5);
            if (var15.field885 && arg3 != null) {
                arg3.method563(var15.field864, arg4, arg8, var15.field896, arg6, 555, var15.field853);
            }
        } else {
            if (var15.field887) {
                if (arg8 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg8 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg8 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg0 == 4) {
                class50 var31;
                if (var15.field899 == -1 && var15.field872 == null) {
                    var31 = var15.method247(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class21(arg1, var10, 4, var13, var11, var12, 0, true, -126, var15.field899);
                }
                arg2.method467(var16, arg6, arg4, var17, 0, arg5, 0, var31, field1115[arg8], arg8 * 512, 42935, var14);
            } else if (arg0 == 5) {
                int var32 = 16;
                int var33 = arg2.method484(arg5, arg4, arg6);
                if (var33 > 0) {
                    var32 = class25.method249(var33 >> 14 & 0x7FFF).field894;
                }
                class50 var34;
                if (var15.field899 == -1 && var15.field872 == null) {
                    var34 = var15.method247(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class21(arg1, var10, 4, var13, var11, var12, 0, true, -126, var15.field899);
                }
                arg2.method467(var16, arg6, arg4, var17, field1097[arg8] * var32, arg5, field1090[arg8] * var32, var34, field1115[arg8], arg8 * 512, 42935, var14);
            } else if (arg0 == 6) {
                class50 var35;
                if (var15.field899 == -1 && var15.field872 == null) {
                    var35 = var15.method247(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class21(arg1, var10, 4, var13, var11, var12, 0, true, -126, var15.field899);
                }
                arg2.method467(var16, arg6, arg4, var17, 0, arg5, 0, var35, 256, arg8, 42935, var14);
            } else if (arg0 == 7) {
                class50 var36;
                if (var15.field899 == -1 && var15.field872 == null) {
                    var36 = var15.method247(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class21(arg1, var10, 4, var13, var11, var12, 0, true, -126, var15.field899);
                }
                arg2.method467(var16, arg6, arg4, var17, 0, arg5, 0, var36, 512, arg8, 42935, var14);
            } else if (arg0 == 8) {
                class50 var37;
                if (var15.field899 == -1 && var15.field872 == null) {
                    var37 = var15.method247(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class21(arg1, var10, 4, var13, var11, var12, 0, true, -126, var15.field899);
                }
                arg2.method467(var16, arg6, arg4, var17, 0, arg5, 0, var37, 768, arg8, 42935, var14);
            }
        }
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(II[B[LYCMSDYIA;LUJWODGQS;I)V")
    public final void method381(int arg0, int arg1, byte[] arg2, class67[] arg3, class56 arg4, int arg5) {
        class36 var7 = new class36(-587, arg2);
        int var8 = -1;
        if (arg1 != -43202) {
            return;
        }
        while (true) {
            int var9 = var7.method353();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method353();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method339();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg5 + var13;
                int var19 = arg0 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field1116[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class67 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg3[var20];
                    }
                    this.method380(var16, var8, arg4, var21, var18, var14, var19, field1110, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(BIIILUJWODGQS;LYCMSDYIA;I[[[IIII)V")
    public static final void method382(byte arg0, int arg1, int arg2, int arg3, class56 arg4, class67 arg5, int arg6, int[][][] arg7, int arg8, int arg9, int arg10) {
        if (field1098 != arg0) {
            field1110 = 37;
        }
        int var11 = arg7[arg9][arg8][arg2];
        int var12 = arg7[arg9][arg8 + 1][arg2];
        int var13 = arg7[arg9][arg8 + 1][arg2 + 1];
        int var14 = arg7[arg9][arg8][arg2 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class25 var16 = class25.method249(arg1);
        int var17 = (arg1 << 14) + (arg2 << 7) + arg8 + 1073741824;
        if (!var16.field861) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg6 << 6) + arg10);
        if (arg10 == 22) {
            class50 var19;
            if (var16.field899 == -1 && var16.field872 == null) {
                var19 = var16.method247(22, arg6, var11, var12, var13, var14, -1);
            } else {
                var19 = new class21(arg1, var11, 22, var14, var12, var13, arg6, true, -126, var16.field899);
            }
            arg4.method464(var19, (byte) 1, var15, var18, arg2, var17, arg8, arg3);
            if (var16.field885 && var16.field861) {
                arg5.method564(arg8, field1117, arg2);
            }
        } else if (arg10 == 10 || arg10 == 11) {
            class50 var39;
            if (var16.field899 == -1 && var16.field872 == null) {
                var39 = var16.method247(10, arg6, var11, var12, var13, var14, -1);
            } else {
                var39 = new class21(arg1, var11, 10, var14, var12, var13, arg6, true, -126, var16.field899);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg10 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg6 == 1 || arg6 == 3) {
                    var41 = var16.field853;
                    var42 = var16.field896;
                } else {
                    var41 = var16.field896;
                    var42 = var16.field853;
                }
                arg4.method468(var17, var40, var41, arg2, arg8, var42, 62, var18, var15, var39, arg3);
            }
            if (var16.field885) {
                arg5.method563(var16.field864, arg8, arg6, var16.field896, arg2, 555, var16.field853);
            }
        } else if (arg10 >= 12) {
            class50 var20;
            if (var16.field899 == -1 && var16.field872 == null) {
                var20 = var16.method247(arg10, arg6, var11, var12, var13, var14, -1);
            } else {
                var20 = new class21(arg1, var11, arg10, var14, var12, var13, arg6, true, -126, var16.field899);
            }
            arg4.method468(var17, 0, 1, arg2, arg8, 1, 62, var18, var15, var20, arg3);
            if (var16.field885) {
                arg5.method563(var16.field864, arg8, arg6, var16.field896, arg2, 555, var16.field853);
            }
        } else if (arg10 == 0) {
            class50 var21;
            if (var16.field899 == -1 && var16.field872 == null) {
                var21 = var16.method247(0, arg6, var11, var12, var13, var14, -1);
            } else {
                var21 = new class21(arg1, var11, 0, var14, var12, var13, arg6, true, -126, var16.field899);
            }
            arg4.method466(field1085, field1115[arg6], arg3, null, var18, arg2, var21, 0, var17, var15, arg8);
            if (var16.field885) {
                arg5.method562(var16.field864, arg6, -978, arg2, arg10, arg8);
            }
        } else if (arg10 == 1) {
            class50 var22;
            if (var16.field899 == -1 && var16.field872 == null) {
                var22 = var16.method247(1, arg6, var11, var12, var13, var14, -1);
            } else {
                var22 = new class21(arg1, var11, 1, var14, var12, var13, arg6, true, -126, var16.field899);
            }
            arg4.method466(field1085, field1096[arg6], arg3, null, var18, arg2, var22, 0, var17, var15, arg8);
            if (var16.field885) {
                arg5.method562(var16.field864, arg6, -978, arg2, arg10, arg8);
            }
        } else if (arg10 == 2) {
            int var23 = arg6 + 1 & 0x3;
            class50 var24;
            class50 var25;
            if (var16.field899 == -1 && var16.field872 == null) {
                var24 = var16.method247(2, arg6 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method247(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class21(arg1, var11, 2, var14, var12, var13, arg6 + 4, true, -126, var16.field899);
                var25 = new class21(arg1, var11, 2, var14, var12, var13, var23, true, -126, var16.field899);
            }
            arg4.method466(field1085, field1115[arg6], arg3, var25, var18, arg2, var24, field1115[var23], var17, var15, arg8);
            if (var16.field885) {
                arg5.method562(var16.field864, arg6, -978, arg2, arg10, arg8);
            }
        } else if (arg10 == 3) {
            class50 var26;
            if (var16.field899 == -1 && var16.field872 == null) {
                var26 = var16.method247(3, arg6, var11, var12, var13, var14, -1);
            } else {
                var26 = new class21(arg1, var11, 3, var14, var12, var13, arg6, true, -126, var16.field899);
            }
            arg4.method466(field1085, field1096[arg6], arg3, null, var18, arg2, var26, 0, var17, var15, arg8);
            if (var16.field885) {
                arg5.method562(var16.field864, arg6, -978, arg2, arg10, arg8);
            }
        } else if (arg10 == 9) {
            class50 var27;
            if (var16.field899 == -1 && var16.field872 == null) {
                var27 = var16.method247(arg10, arg6, var11, var12, var13, var14, -1);
            } else {
                var27 = new class21(arg1, var11, arg10, var14, var12, var13, arg6, true, -126, var16.field899);
            }
            arg4.method468(var17, 0, 1, arg2, arg8, 1, 62, var18, var15, var27, arg3);
            if (var16.field885) {
                arg5.method563(var16.field864, arg8, arg6, var16.field896, arg2, 555, var16.field853);
            }
        } else {
            if (var16.field887) {
                if (arg6 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg6 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg6 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg10 == 4) {
                class50 var32;
                if (var16.field899 == -1 && var16.field872 == null) {
                    var32 = var16.method247(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class21(arg1, var11, 4, var14, var12, var13, 0, true, -126, var16.field899);
                }
                arg4.method467(var17, arg2, arg8, var18, 0, arg3, 0, var32, field1115[arg6], arg6 * 512, 42935, var15);
            } else if (arg10 == 5) {
                int var33 = 16;
                int var34 = arg4.method484(arg3, arg8, arg2);
                if (var34 > 0) {
                    var33 = class25.method249(var34 >> 14 & 0x7FFF).field894;
                }
                class50 var35;
                if (var16.field899 == -1 && var16.field872 == null) {
                    var35 = var16.method247(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class21(arg1, var11, 4, var14, var12, var13, 0, true, -126, var16.field899);
                }
                arg4.method467(var17, arg2, arg8, var18, field1097[arg6] * var33, arg3, field1090[arg6] * var33, var35, field1115[arg6], arg6 * 512, 42935, var15);
            } else if (arg10 == 6) {
                class50 var36;
                if (var16.field899 == -1 && var16.field872 == null) {
                    var36 = var16.method247(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class21(arg1, var11, 4, var14, var12, var13, 0, true, -126, var16.field899);
                }
                arg4.method467(var17, arg2, arg8, var18, 0, arg3, 0, var36, 256, arg6, 42935, var15);
            } else if (arg10 == 7) {
                class50 var37;
                if (var16.field899 == -1 && var16.field872 == null) {
                    var37 = var16.method247(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class21(arg1, var11, 4, var14, var12, var13, 0, true, -126, var16.field899);
                }
                arg4.method467(var17, arg2, arg8, var18, 0, arg3, 0, var37, 512, arg6, 42935, var15);
            } else if (arg10 == 8) {
                class50 var38;
                if (var16.field899 == -1 && var16.field872 == null) {
                    var38 = var16.method247(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class21(arg1, var11, 4, var14, var12, var13, 0, true, -126, var16.field899);
                }
                arg4.method467(var17, arg2, arg8, var18, 0, arg3, 0, var38, 768, arg6, 42935, var15);
            }
        }
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(II[LYCMSDYIA;[BIII)V")
    public final void method383(int arg0, int arg1, class67[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg1 + var13 > 0 && arg1 + var13 < 103 && arg0 + var14 > 0 && arg0 + var14 < 103) {
                        arg2[var8].field1676[arg1 + var13][arg0 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        if (arg4 != 0) {
            this.field1113 = !this.field1113;
        }
        class36 var9 = new class36(-587, arg3);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method390(0, arg0 + var12, var9, arg5, var10, arg6, false, arg1 + var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "b", descriptor = "(III)I")
    private static final int method384(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method398(var3, var5);
        int var8 = method398(var3 + 1, var5);
        int var9 = method398(var3, var5 + 1);
        int var10 = method398(var3 + 1, var5 + 1);
        int var11 = method399(var7, var8, var4, arg2);
        int var12 = method399(var9, var10, var4, arg2);
        return method399(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(IIZI)V")
    public final void method385(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            return;
        }
        for (int var5 = 0; var5 < 8; var5++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.field1099[arg1][arg0 + var5][arg3 + var8] = 0;
            }
        }
        if (arg0 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                this.field1099[arg1][arg0][arg3 + var6] = this.field1099[arg1][arg0 - 1][arg3 + var6];
            }
        }
        if (arg3 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                this.field1099[arg1][arg0 + var7][arg3] = this.field1099[arg1][arg0 + var7][arg3 - 1];
            }
        }
        if (arg0 > 0 && this.field1099[arg1][arg0 - 1][arg3] != 0) {
            this.field1099[arg1][arg0][arg3] = this.field1099[arg1][arg0 - 1][arg3];
        } else if (arg3 > 0 && this.field1099[arg1][arg0][arg3 - 1] != 0) {
            this.field1099[arg1][arg0][arg3] = this.field1099[arg1][arg0][arg3 - 1];
        } else if (arg0 > 0 && arg3 > 0 && this.field1099[arg1][arg0 - 1][arg3 - 1] != 0) {
            this.field1099[arg1][arg0][arg3] = this.field1099[arg1][arg0 - 1][arg3 - 1];
        }
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(IIBII)V")
    public final void method386(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        for (int var6 = arg0; var6 <= arg0 + arg1; var6++) {
            for (int var7 = arg4; var7 <= arg3 + arg4; var7++) {
                if (var7 >= 0 && var7 < this.field1101 && var6 >= 0 && var6 < this.field1102) {
                    this.field1092[0][var7][var6] = 127;
                    if (arg4 == var7 && var7 > 0) {
                        this.field1099[0][var7][var6] = this.field1099[0][var7 - 1][var6];
                    }
                    if (arg3 + arg4 == var7 && var7 < this.field1101 - 1) {
                        this.field1099[0][var7][var6] = this.field1099[0][var7 + 1][var6];
                    }
                    if (arg0 == var6 && var6 > 0) {
                        this.field1099[0][var7][var6] = this.field1099[0][var7][var6 - 1];
                    }
                    if (arg0 + arg1 == var6 && var6 < this.field1102 - 1) {
                        this.field1099[0][var7][var6] = this.field1099[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (arg2 != 3) {
            this.field1093 = !this.field1093;
        }
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(IIII)I")
    public int method387(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 69 / arg1;
        if ((this.field1116[arg2][arg3][arg0] & 0x8) == 0) {
            return arg2 <= 0 || (this.field1116[1][arg3][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "c", descriptor = "(III)I")
    private final int method388(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "<init>", descriptor = "(IB[[[II[[[B)V")
    public class37(int arg0, byte arg1, int[][][] arg2, int arg3, byte[][][] arg4) {
        field1100 = 99;
        this.field1101 = arg3;
        this.field1102 = arg0;
        this.field1099 = arg2;
        this.field1116 = arg4;
        this.field1086 = new byte[4][this.field1101][this.field1102];
        this.field1091 = new byte[4][this.field1101][this.field1102];
        this.field1094 = new byte[4][this.field1101][this.field1102];
        if (arg1 != 8) {
            throw new NullPointerException();
        }
        this.field1089 = new byte[4][this.field1101][this.field1102];
        this.field1109 = new int[4][this.field1101 + 1][this.field1102 + 1];
        this.field1092 = new byte[4][this.field1101 + 1][this.field1102 + 1];
        this.field1118 = new int[this.field1101 + 1][this.field1102 + 1];
        this.field1103 = new int[this.field1102];
        this.field1104 = new int[this.field1102];
        this.field1105 = new int[this.field1102];
        this.field1106 = new int[this.field1102];
        this.field1107 = new int[this.field1102];
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(II)I")
    private final int method389(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            int var4 = (arg0 & 0x7F) * arg1 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(IILNQUAUMDT;IIIZI)V")
    private final void method390(int arg0, int arg1, class36 arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        if (arg6) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg7 < 0 || arg7 >= 104 || arg1 < 0 || arg1 >= 104) {
            while (true) {
                int var12 = arg2.method339();
                if (var12 == 0) {
                    return;
                }
                if (var12 == 1) {
                    arg2.method339();
                    return;
                }
                if (var12 <= 49) {
                    arg2.method339();
                }
            }
        }
        this.field1116[arg4][arg7][arg1] = 0;
        while (true) {
            int var10 = arg2.method339();
            if (var10 == 0) {
                if (arg4 == 0) {
                    this.field1099[0][arg7][arg1] = -method392(arg7 + arg5 + 932731, arg1 + 556238 + arg3) * 8;
                    return;
                } else {
                    this.field1099[arg4][arg7][arg1] = this.field1099[arg4 - 1][arg7][arg1] - 240;
                    return;
                }
            }
            if (var10 == 1) {
                int var11 = arg2.method339();
                if (var11 == 1) {
                    var11 = 0;
                }
                if (arg4 == 0) {
                    this.field1099[0][arg7][arg1] = -var11 * 8;
                    return;
                }
                this.field1099[arg4][arg7][arg1] = this.field1099[arg4 - 1][arg7][arg1] - var11 * 8;
                return;
            }
            if (var10 <= 49) {
                this.field1091[arg4][arg7][arg1] = arg2.method340();
                this.field1094[arg4][arg7][arg1] = (byte) ((var10 - 2) / 4);
                this.field1089[arg4][arg7][arg1] = (byte) (var10 + arg0 - 2 & 0x3);
            } else if (var10 <= 81) {
                this.field1116[arg4][arg7][arg1] = (byte) (var10 - 49);
            } else {
                this.field1086[arg4][arg7][arg1] = (byte) (var10 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(I[BIB)Z")
    public static final boolean method391(int arg0, byte[] arg1, int arg2, byte arg3) {
        if (arg3 != -90) {
            field1088 = 2;
        }
        boolean var4 = true;
        class36 var5 = new class36(-587, arg1);
        int var6 = -1;
        label54: while (true) {
            int var7 = var5.method353();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method353();
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method339() >> 2;
                    int var15 = arg2 + var13;
                    int var16 = arg0 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class25 var17 = class25.method249(var6);
                        if (var14 != 22 || !field1112 || var17.field861 || var17.field883) {
                            var4 &= var17.method245(false);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method353();
                if (var10 == 0) {
                    break;
                }
                var5.method339();
            }
        }
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "b", descriptor = "(II)I")
    private static final int method392(int arg0, int arg1) {
        int var2 = method384(arg0 + 45365, arg1 + 91923, 4) + (method384(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method384(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(II[BII[LYCMSDYIA;IIII)V")
    public final void method393(int arg0, int arg1, byte[] arg2, int arg3, int arg4, class67[] arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg1 + var11 > 0 && arg1 + var11 < 103 && arg6 + var16 > 0 && arg6 + var16 < 103) {
                    arg5[arg8].field1676[arg1 + var11][arg6 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        if (arg9 < 4 || arg9 > 4) {
            return;
        }
        class36 var12 = new class36(-587, arg2);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg4 == var13 && var14 >= arg0 && var14 < arg0 + 8 && var15 >= arg3 && var15 < arg3 + 8) {
                        this.method390(arg7, arg6 + class40.method409(var14 & 0x7, var15 & 0x7, true, arg7), var12, 0, arg8, 0, false, arg1 + class40.method408(var15 & 0x7, var14 & 0x7, arg7, 0));
                    } else {
                        this.method390(0, -1, var12, 0, 0, 0, false, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "([LYCMSDYIA;LUJWODGQS;I)V")
    public final void method394(class67[] arg0, class56 arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var111 = 0; var111 < 104; var111++) {
                for (int var112 = 0; var112 < 104; var112++) {
                    if ((this.field1116[var4][var111][var112] & 0x1) == 1) {
                        int var113 = var4;
                        if ((this.field1116[1][var111][var112] & 0x2) == 2) {
                            var113 = var4 - 1;
                        }
                        if (var113 >= 0) {
                            arg0[var113].method564(var111, field1117, var112);
                        }
                    }
                }
            }
        }
        field1111 += (int) (Math.random() * 5.0D) - 2;
        if (field1111 < -8) {
            field1111 = -8;
        }
        if (field1111 > 8) {
            field1111 = 8;
        }
        field1114 += (int) (Math.random() * 5.0D) - 2;
        while (arg2 >= 0) {
            for (int var110 = 1; var110 > 0; var110++) {
            }
        }
        if (field1114 < -16) {
            field1114 = -16;
        }
        if (field1114 > 16) {
            field1114 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1092[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1102 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1101 - 1; var101++) {
                    int var102 = this.field1099[var5][var101 + 1][var56] - this.field1099[var5][var101 - 1][var56];
                    int var103 = this.field1099[var5][var101][var56 + 1] - this.field1099[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1118[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1102; var57++) {
                this.field1103[var57] = 0;
                this.field1104[var57] = 0;
                this.field1105[var57] = 0;
                this.field1106[var57] = 0;
                this.field1107[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1101 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1102; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1101) {
                        int var96 = this.field1086[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class43 var97 = class43.field1157[var96 - 1];
                            this.field1103[var61] += var97.field1166;
                            this.field1104[var61] += var97.field1164;
                            this.field1105[var61] += var97.field1165;
                            this.field1106[var61] += var97.field1167;
                            var10002 = this.field1107[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1101) {
                        int var99 = this.field1086[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class43 var100 = class43.field1157[var99 - 1];
                            this.field1103[var61] -= var100.field1166;
                            this.field1104[var61] -= var100.field1164;
                            this.field1105[var61] -= var100.field1165;
                            this.field1106[var61] -= var100.field1167;
                            var10002 = this.field1107[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1101 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1102 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1102) {
                            var62 += this.field1103[var68];
                            var63 += this.field1104[var68];
                            var64 += this.field1105[var68];
                            var65 += this.field1106[var68];
                            var66 += this.field1107[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1102) {
                            var62 -= this.field1103[var69];
                            var63 -= this.field1104[var69];
                            var64 -= this.field1105[var69];
                            var65 -= this.field1106[var69];
                            var66 -= this.field1107[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1102 - 1 && (!field1112 || (this.field1116[0][var58][var67] & 0x2) != 0 || (this.field1116[var5][var58][var67] & 0x10) == 0 && this.method387(var67, 776, var5, var58) == field1087)) {
                            if (var5 < field1100) {
                                field1100 = var5;
                            }
                            int var70 = this.field1086[var5][var58][var67] & 0xFF;
                            int var71 = this.field1091[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1099[var5][var58][var67];
                                int var73 = this.field1099[var5][var58 + 1][var67];
                                int var74 = this.field1099[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1099[var5][var58][var67 + 1];
                                int var76 = this.field1118[var58][var67];
                                int var77 = this.field1118[var58 + 1][var67];
                                int var78 = this.field1118[var58 + 1][var67 + 1];
                                int var79 = this.field1118[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method388(var82, var83, var84);
                                    int var85 = field1111 + var82 & 0xFF;
                                    int var86 = field1114 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method388(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1094[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class43.field1157[var71 - 1].field1162) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1109[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class72.field1757[method396(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg1.method463(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method396(var80, var76), method396(var80, var77), method396(var80, var78), method396(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1094[var5][var58][var67] + 1;
                                    byte var90 = this.field1089[var5][var58][var67];
                                    class43 var91 = class43.field1157[var71 - 1];
                                    int var92 = var91.field1160;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class72.method594(var92, 0);
                                        var94 = -1;
                                    } else if (var91.field1159 == 16711935) {
                                        var94 = -2;
                                        var92 = -1;
                                        var93 = class72.field1757[this.method389(var91.field1168, 96)];
                                    } else {
                                        var94 = this.method388(var91.field1163, var91.field1164, var91.field1165);
                                        var93 = class72.field1757[this.method389(var91.field1168, 96)];
                                    }
                                    arg1.method463(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method396(var80, var76), method396(var80, var77), method396(var80, var78), method396(var80, var79), this.method389(var94, var76), this.method389(var94, var77), this.method389(var94, var78), this.method389(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1102 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1101 - 1; var60++) {
                    arg1.method462(var5, var60, var59, this.method387(var59, 776, var5, var60));
                }
            }
        }
        arg1.method489(-50, false, -10, -50);
        for (int var6 = 0; var6 < this.field1101; var6++) {
            for (int var47 = 0; var47 < this.field1102; var47++) {
                if ((this.field1116[1][var6][var47] & 0x2) == 2) {
                    arg1.method460((byte) 2, var6, var47);
                }
            }
        }
        int var7 = 1;
        int var8 = 2;
        int var9 = 4;
        for (int var10 = 0; var10 < 4; var10++) {
            if (var10 > 0) {
                var7 <<= 0x3;
                var8 <<= 0x3;
                var9 <<= 0x3;
            }
            for (int var11 = 0; var11 <= var10; var11++) {
                for (int var12 = 0; var12 <= this.field1102; var12++) {
                    for (int var13 = 0; var13 <= this.field1101; var13++) {
                        if ((this.field1109[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1109[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1102 && (this.field1109[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label332: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1109[var16 - 1][var13][var18] & var7) == 0) {
                                        break label332;
                                    }
                                }
                                var16--;
                            }
                            label321: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1109[var17 + 1][var13][var19] & var7) == 0) {
                                        break label321;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1099[var17][var13][var14] - var21;
                                int var23 = this.field1099[var16][var13][var14];
                                class56.method461(var22, var10, var14 * 128, var13 * 128, var15 * 128 + 128, 0, var23, 1, var13 * 128);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1109[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1109[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1109[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1101 && (this.field1109[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label385: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1109[var28 - 1][var30][var12] & var8) == 0) {
                                        break label385;
                                    }
                                }
                                var28--;
                            }
                            label374: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1109[var29 + 1][var31][var12] & var8) == 0) {
                                        break label374;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1099[var29][var26][var12] - var33;
                                int var35 = this.field1099[var28][var26][var12];
                                class56.method461(var34, var10, var12 * 128, var27 * 128 + 128, var12 * 128, 0, var35, 2, var26 * 128);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1109[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1109[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1109[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1102 && (this.field1109[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label438: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1109[var11][var38 - 1][var42] & var9) == 0) {
                                        break label438;
                                    }
                                }
                                var38--;
                            }
                            label427: while (var39 < this.field1101) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1109[var11][var39 + 1][var43] & var9) == 0) {
                                        break label427;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field1099[var11][var38][var40];
                                class56.method461(var44, var10, var40 * 128, var39 * 128 + 128, var41 * 128 + 128, 0, var44, 4, var38 * 128);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1109[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(ILUJWODGQS;[LYCMSDYIA;Z[BIIIIII)V")
    public final void method395(int arg0, class56 arg1, class67[] arg2, boolean arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        class36 var12 = new class36(-587, arg4);
        int var13 = -1;
        if (arg3) {
            return;
        }
        while (true) {
            int var14 = var12.method353();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method353();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method339();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg7 == var19 && var18 >= arg5 && var18 < arg5 + 8 && var17 >= arg8 && var17 < arg8 + 8) {
                    class25 var23 = class25.method249(var13);
                    int var24 = arg6 + class40.method410(var22, var23.field896, var17 & 0x7, var23.field853, var18 & 0x7, this.field1095, arg0);
                    int var25 = arg9 + class40.method411(true, arg0, var17 & 0x7, var22, var23.field896, var18 & 0x7, var23.field853);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg10;
                        if ((this.field1116[1][var24][var25] & 0x2) == 2) {
                            var26 = arg10 - 1;
                        }
                        class67 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg2[var26];
                        }
                        this.method380(var21, var13, arg1, var27, var24, arg10, var25, field1110, arg0 + var22 & 0x3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "c", descriptor = "(II)I")
    private static final int method396(int arg0, int arg1) {
        if (arg0 == -1) {
            return 12345678;
        }
        int var2 = (arg0 & 0x7F) * arg1 / 128;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "d", descriptor = "(II)I")
    private static final int method397(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "e", descriptor = "(II)I")
    private static final int method398(int arg0, int arg1) {
        int var2 = method397(arg0 - 1, arg1 - 1) + method397(arg0 + 1, arg1 - 1) + method397(arg0 - 1, arg1 + 1) + method397(arg0 + 1, arg1 + 1);
        int var3 = method397(arg0 - 1, arg1) + method397(arg0 + 1, arg1) + method397(arg0, arg1 - 1) + method397(arg0, arg1 + 1);
        int var4 = method397(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "client!OBDFVVEL", name = "b", descriptor = "(IIII)I")
    private static final int method399(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class72.field1746[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }
}
