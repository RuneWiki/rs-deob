import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QJLJTPQV")
public class class42 {

    @OriginalMember(owner = "QJLJTPQV", name = "h", descriptor = "I")
    private int field1109 = -738;

    @OriginalMember(owner = "QJLJTPQV", name = "i", descriptor = "I")
    private int field1110 = -738;

    @OriginalMember(owner = "QJLJTPQV", name = "j", descriptor = "I")
    private int field1111 = -45738;

    @OriginalMember(owner = "QJLJTPQV", name = "l", descriptor = "I")
    private int field1113 = 24940;

    @OriginalMember(owner = "QJLJTPQV", name = "t", descriptor = "B")
    private byte field1121 = 64;

    @OriginalMember(owner = "QJLJTPQV", name = "x", descriptor = "Z")
    private boolean field1125 = true;

    @OriginalMember(owner = "QJLJTPQV", name = "z", descriptor = "Z")
    private boolean field1127 = false;

    @OriginalMember(owner = "QJLJTPQV", name = "H", descriptor = "I")
    private int field1135 = -45738;

    @OriginalMember(owner = "QJLJTPQV", name = "F", descriptor = "I")
    private int field1133;

    @OriginalMember(owner = "QJLJTPQV", name = "G", descriptor = "I")
    private int field1134;

    @OriginalMember(owner = "QJLJTPQV", name = "e", descriptor = "[[[I")
    private int[][][] field1106;

    @OriginalMember(owner = "QJLJTPQV", name = "w", descriptor = "[[[B")
    private byte[][][] field1124;

    @OriginalMember(owner = "QJLJTPQV", name = "J", descriptor = "[[[B")
    private byte[][][] field1137;

    @OriginalMember(owner = "QJLJTPQV", name = "n", descriptor = "[[[B")
    private byte[][][] field1115;

    @OriginalMember(owner = "QJLJTPQV", name = "y", descriptor = "[[[B")
    private byte[][][] field1126;

    @OriginalMember(owner = "QJLJTPQV", name = "a", descriptor = "[[[B")
    private byte[][][] field1102;

    @OriginalMember(owner = "QJLJTPQV", name = "f", descriptor = "[[[I")
    private int[][][] field1107;

    @OriginalMember(owner = "QJLJTPQV", name = "C", descriptor = "[[[B")
    private byte[][][] field1130;

    @OriginalMember(owner = "QJLJTPQV", name = "m", descriptor = "[[I")
    private int[][] field1114;

    @OriginalMember(owner = "QJLJTPQV", name = "o", descriptor = "[I")
    private int[] field1116;

    @OriginalMember(owner = "QJLJTPQV", name = "p", descriptor = "[I")
    private int[] field1117;

    @OriginalMember(owner = "QJLJTPQV", name = "q", descriptor = "[I")
    private int[] field1118;

    @OriginalMember(owner = "QJLJTPQV", name = "r", descriptor = "[I")
    private int[] field1119;

    @OriginalMember(owner = "QJLJTPQV", name = "s", descriptor = "[I")
    private int[] field1120;

    @OriginalMember(owner = "QJLJTPQV", name = "b", descriptor = "Z")
    public static boolean field1103 = true;

    @OriginalMember(owner = "QJLJTPQV", name = "d", descriptor = "I")
    private static int field1105 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "QJLJTPQV", name = "g", descriptor = "Z")
    private static boolean field1108 = true;

    @OriginalMember(owner = "QJLJTPQV", name = "k", descriptor = "[I")
    private static final int[] field1112 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "QJLJTPQV", name = "v", descriptor = "[I")
    private static final int[] field1123 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "QJLJTPQV", name = "A", descriptor = "[I")
    private static final int[] field1128 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "QJLJTPQV", name = "B", descriptor = "[I")
    private static final int[] field1129 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "QJLJTPQV", name = "D", descriptor = "I")
    private static int field1131 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "QJLJTPQV", name = "E", descriptor = "I")
    public static int field1132 = 99;

    @OriginalMember(owner = "QJLJTPQV", name = "c", descriptor = "I")
    private int field1104;

    @OriginalMember(owner = "QJLJTPQV", name = "u", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "QJLJTPQV", name = "I", descriptor = "I")
    private static int field1136;

    @OriginalMember(owner = "QJLJTPQV", name = "a", descriptor = "(IIII)I")
    private static final int method406(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class58.field1477[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "QJLJTPQV", name = "a", descriptor = "([BIII)Z")
    public static final boolean method407(byte[] arg0, int arg1, int arg2, int arg3) {
        boolean var4 = true;
        class24 var5 = new class24(0, arg0);
        while (arg2 >= 0) {
            field1108 = !field1108;
        }
        int var6 = -1;
        label58: while (true) {
            int var7 = var5.method252();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method252();
                    if (var11 == 0) {
                        continue label58;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method238() >> 2;
                    int var15 = arg1 + var13;
                    int var16 = arg3 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class41 var17 = class41.method398(var6);
                        if (var14 != 22 || !field1103 || var17.field1083 || var17.field1080) {
                            var4 &= var17.method401(false);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method252();
                if (var10 == 0) {
                    break;
                }
                var5.method238();
            }
        }
    }

    @OriginalMember(owner = "QJLJTPQV", name = "a", descriptor = "([BIII[LWWMUUFBO;II)V")
    public final void method408(byte[] arg0, int arg1, int arg2, int arg3, class63[] arg4, int arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg1 + var13 > 0 && arg1 + var13 < 103 && arg2 + var14 > 0 && arg2 + var14 < 103) {
                        arg4[var8].field1586[arg1 + var13][arg2 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        if (arg6 != -38919) {
            field1108 = !field1108;
        }
        class24 var9 = new class24(0, arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method423(var9, arg3, 0, var10, this.field1109, arg1 + var11, arg5, arg2 + var12);
                }
            }
        }
    }

    @OriginalMember(owner = "QJLJTPQV", name = "<init>", descriptor = "(II[[[BI[[[I)V")
    public class42(int arg0, int arg1, byte[][][] arg2, int arg3, int[][][] arg4) {
        field1132 = 99;
        this.field1133 = arg1;
        this.field1134 = arg3;
        this.field1106 = arg4;
        this.field1124 = arg2;
        this.field1137 = new byte[4][this.field1133][this.field1134];
        this.field1115 = new byte[4][this.field1133][this.field1134];
        this.field1126 = new byte[4][this.field1133][this.field1134];
        this.field1102 = new byte[4][this.field1133][this.field1134];
        this.field1107 = new int[4][this.field1133 + 1][this.field1134 + 1];
        this.field1130 = new byte[4][this.field1133 + 1][this.field1134 + 1];
        this.field1114 = new int[this.field1133 + 1][this.field1134 + 1];
        this.field1116 = new int[this.field1134];
        this.field1117 = new int[this.field1134];
        this.field1118 = new int[this.field1134];
        this.field1119 = new int[this.field1134];
        while (arg0 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field1120 = new int[this.field1134];
    }

    @OriginalMember(owner = "QJLJTPQV", name = "a", descriptor = "(II)I")
    private final int method409(int arg0, int arg1) {
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

    @OriginalMember(owner = "QJLJTPQV", name = "b", descriptor = "(IIII)I")
    public int method410(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if ((this.field1124[arg2][arg0][arg1] & 0x8) == 0) {
            return arg2 <= 0 || (this.field1124[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "QJLJTPQV", name = "a", descriptor = "(III[LWWMUUFBO;IIIII[B)V")
    public final void method411(int arg0, int arg1, int arg2, class63[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var17 = 0; var17 < 8; var17++) {
                if (arg5 + var11 > 0 && arg5 + var11 < 103 && arg0 + var17 > 0 && arg0 + var17 < 103) {
                    arg3[arg7].field1586[arg5 + var11][arg0 + var17] &= 0xFEFFFFFF;
                }
            }
        }
        class24 var12 = new class24(0, arg9);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    if (arg4 == var13 && var15 >= arg6 && var15 < arg6 + 8 && var16 >= arg8 && var16 < arg8 + 8) {
                        this.method423(var12, 0, arg1, arg7, this.field1109, arg5 + class70.method586((byte) 98, var16 & 0x7, arg1, var15 & 0x7), 0, arg0 + class70.method587(var16 & 0x7, 0, arg1, var15 & 0x7));
                    } else {
                        this.method423(var12, 0, 0, 0, this.field1109, -1, 0, -1);
                    }
                }
            }
        }
        int var14 = 48 / arg2;
    }

    @OriginalMember(owner = "QJLJTPQV", name = "a", descriptor = "(IIILLIOYHOWO;IIIILWWMUUFBO;)V")
    private final void method412(int arg0, int arg1, int arg2, class34 arg3, int arg4, int arg5, int arg6, int arg7, class63 arg8) {
        if (field1103 && (this.field1124[0][arg2][arg5] & 0x2) == 0) {
            if ((this.field1124[arg0][arg2][arg5] & 0x10) != 0) {
                return;
            }
            if (this.method410(arg2, arg5, arg0, 0) != field1122) {
                return;
            }
        }
        if (arg0 < field1132) {
            field1132 = arg0;
        }
        int var10 = this.field1106[arg0][arg2][arg5];
        int var11 = this.field1106[arg0][arg2 + 1][arg5];
        int var12 = this.field1106[arg0][arg2 + 1][arg5 + 1];
        int var13 = this.field1106[arg0][arg2][arg5 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        if (this.field1135 != arg4) {
            this.field1113 = -61;
        }
        class41 var15 = class41.method398(arg1);
        int var16 = (arg1 << 14) + (arg5 << 7) + arg2 + 1073741824;
        if (!var15.field1083) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg7 << 6) + arg6);
        if (arg6 == 22) {
            if (!field1103 || var15.field1083 || var15.field1080) {
                class4 var18;
                if (var15.field1052 == -1 && var15.field1070 == null) {
                    var18 = var15.method405(22, arg7, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class15(arg7, true, var11, var13, var12, var10, 0, arg1, var15.field1052, 22);
                }
                arg3.method331(arg2, (byte) 0, var17, var16, arg0, arg5, var18, var14);
                if (var15.field1098 && var15.field1083 && arg8 != null) {
                    arg8.method531(arg5, arg2, (byte) -95);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class4 var38;
            if (var15.field1052 == -1 && var15.field1070 == null) {
                var38 = var15.method405(10, arg7, var10, var11, var12, var13, -1);
            } else {
                var38 = new class15(arg7, true, var11, var13, var12, var10, 0, arg1, var15.field1052, 10);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg6 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg7 == 1 || arg7 == 3) {
                    var40 = var15.field1067;
                    var41 = var15.field1094;
                } else {
                    var40 = var15.field1094;
                    var41 = var15.field1067;
                }
                if (arg3.method335(var17, var14, arg0, var38, -903, var39, var41, arg5, var16, arg2, var40) && var15.field1078) {
                    class67 var42;
                    if (var38 instanceof class67) {
                        var42 = (class67) var38;
                    } else {
                        var42 = var15.method405(10, arg7, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field1639 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1130[arg0][arg2 + var43][arg5 + var44]) {
                                    this.field1130[arg0][arg2 + var43][arg5 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1098 && arg8 != null) {
                arg8.method530(arg7, var15.field1094, 4, arg2, var15.field1067, var15.field1091, arg5);
            }
        } else if (arg6 >= 12) {
            class4 var19;
            if (var15.field1052 == -1 && var15.field1070 == null) {
                var19 = var15.method405(arg6, arg7, var10, var11, var12, var13, -1);
            } else {
                var19 = new class15(arg7, true, var11, var13, var12, var10, 0, arg1, var15.field1052, arg6);
            }
            arg3.method335(var17, var14, arg0, var19, -903, 0, 1, arg5, var16, arg2, 1);
            if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg0 > 0) {
                this.field1107[arg0][arg2][arg5] |= 0x924;
            }
            if (var15.field1098 && arg8 != null) {
                arg8.method530(arg7, var15.field1094, 4, arg2, var15.field1067, var15.field1091, arg5);
            }
        } else if (arg6 == 0) {
            class4 var20;
            if (var15.field1052 == -1 && var15.field1070 == null) {
                var20 = var15.method405(0, arg7, var10, var11, var12, var13, -1);
            } else {
                var20 = new class15(arg7, true, var11, var13, var12, var10, 0, arg1, var15.field1052, 0);
            }
            arg3.method333(arg0, field1112[arg7], arg5, 0, var20, arg2, -730, var16, null, var14, var17);
            if (arg7 == 0) {
                if (var15.field1078) {
                    this.field1130[arg0][arg2][arg5] = 50;
                    this.field1130[arg0][arg2][arg5 + 1] = 50;
                }
                if (var15.field1092) {
                    this.field1107[arg0][arg2][arg5] |= 0x249;
                }
            } else if (arg7 == 1) {
                if (var15.field1078) {
                    this.field1130[arg0][arg2][arg5 + 1] = 50;
                    this.field1130[arg0][arg2 + 1][arg5 + 1] = 50;
                }
                if (var15.field1092) {
                    this.field1107[arg0][arg2][arg5 + 1] |= 0x492;
                }
            } else if (arg7 == 2) {
                if (var15.field1078) {
                    this.field1130[arg0][arg2 + 1][arg5] = 50;
                    this.field1130[arg0][arg2 + 1][arg5 + 1] = 50;
                }
                if (var15.field1092) {
                    this.field1107[arg0][arg2 + 1][arg5] |= 0x249;
                }
            } else if (arg7 == 3) {
                if (var15.field1078) {
                    this.field1130[arg0][arg2][arg5] = 50;
                    this.field1130[arg0][arg2 + 1][arg5] = 50;
                }
                if (var15.field1092) {
                    this.field1107[arg0][arg2][arg5] |= 0x492;
                }
            }
            if (var15.field1098 && arg8 != null) {
                arg8.method529(arg2, 5, arg6, arg7, arg5, var15.field1091);
            }
            if (var15.field1065 != 16) {
                arg3.method341(arg5, arg2, arg0, false, var15.field1065);
            }
        } else if (arg6 == 1) {
            class4 var21;
            if (var15.field1052 == -1 && var15.field1070 == null) {
                var21 = var15.method405(1, arg7, var10, var11, var12, var13, -1);
            } else {
                var21 = new class15(arg7, true, var11, var13, var12, var10, 0, arg1, var15.field1052, 1);
            }
            arg3.method333(arg0, field1123[arg7], arg5, 0, var21, arg2, -730, var16, null, var14, var17);
            if (var15.field1078) {
                if (arg7 == 0) {
                    this.field1130[arg0][arg2][arg5 + 1] = 50;
                } else if (arg7 == 1) {
                    this.field1130[arg0][arg2 + 1][arg5 + 1] = 50;
                } else if (arg7 == 2) {
                    this.field1130[arg0][arg2 + 1][arg5] = 50;
                } else if (arg7 == 3) {
                    this.field1130[arg0][arg2][arg5] = 50;
                }
            }
            if (var15.field1098 && arg8 != null) {
                arg8.method529(arg2, 5, arg6, arg7, arg5, var15.field1091);
            }
        } else if (arg6 == 2) {
            int var22 = arg7 + 1 & 0x3;
            class4 var23;
            class4 var24;
            if (var15.field1052 == -1 && var15.field1070 == null) {
                var23 = var15.method405(2, arg7 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method405(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class15(arg7 + 4, true, var11, var13, var12, var10, 0, arg1, var15.field1052, 2);
                var24 = new class15(var22, true, var11, var13, var12, var10, 0, arg1, var15.field1052, 2);
            }
            arg3.method333(arg0, field1112[arg7], arg5, field1112[var22], var23, arg2, -730, var16, var24, var14, var17);
            if (var15.field1092) {
                if (arg7 == 0) {
                    this.field1107[arg0][arg2][arg5] |= 0x249;
                    this.field1107[arg0][arg2][arg5 + 1] |= 0x492;
                } else if (arg7 == 1) {
                    this.field1107[arg0][arg2][arg5 + 1] |= 0x492;
                    this.field1107[arg0][arg2 + 1][arg5] |= 0x249;
                } else if (arg7 == 2) {
                    this.field1107[arg0][arg2 + 1][arg5] |= 0x249;
                    this.field1107[arg0][arg2][arg5] |= 0x492;
                } else if (arg7 == 3) {
                    this.field1107[arg0][arg2][arg5] |= 0x492;
                    this.field1107[arg0][arg2][arg5] |= 0x249;
                }
            }
            if (var15.field1098 && arg8 != null) {
                arg8.method529(arg2, 5, arg6, arg7, arg5, var15.field1091);
            }
            if (var15.field1065 != 16) {
                arg3.method341(arg5, arg2, arg0, false, var15.field1065);
            }
        } else if (arg6 == 3) {
            class4 var25;
            if (var15.field1052 == -1 && var15.field1070 == null) {
                var25 = var15.method405(3, arg7, var10, var11, var12, var13, -1);
            } else {
                var25 = new class15(arg7, true, var11, var13, var12, var10, 0, arg1, var15.field1052, 3);
            }
            arg3.method333(arg0, field1123[arg7], arg5, 0, var25, arg2, -730, var16, null, var14, var17);
            if (var15.field1078) {
                if (arg7 == 0) {
                    this.field1130[arg0][arg2][arg5 + 1] = 50;
                } else if (arg7 == 1) {
                    this.field1130[arg0][arg2 + 1][arg5 + 1] = 50;
                } else if (arg7 == 2) {
                    this.field1130[arg0][arg2 + 1][arg5] = 50;
                } else if (arg7 == 3) {
                    this.field1130[arg0][arg2][arg5] = 50;
                }
            }
            if (var15.field1098 && arg8 != null) {
                arg8.method529(arg2, 5, arg6, arg7, arg5, var15.field1091);
            }
        } else if (arg6 == 9) {
            class4 var26;
            if (var15.field1052 == -1 && var15.field1070 == null) {
                var26 = var15.method405(arg6, arg7, var10, var11, var12, var13, -1);
            } else {
                var26 = new class15(arg7, true, var11, var13, var12, var10, 0, arg1, var15.field1052, arg6);
            }
            arg3.method335(var17, var14, arg0, var26, -903, 0, 1, arg5, var16, arg2, 1);
            if (var15.field1098 && arg8 != null) {
                arg8.method530(arg7, var15.field1094, 4, arg2, var15.field1067, var15.field1091, arg5);
            }
        } else {
            if (var15.field1059) {
                if (arg7 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg7 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg7 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg6 == 4) {
                class4 var31;
                if (var15.field1052 == -1 && var15.field1070 == null) {
                    var31 = var15.method405(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class15(0, true, var11, var13, var12, var10, 0, arg1, var15.field1052, 4);
                }
                arg3.method334(var17, var16, arg5, field1112[arg7], var14, false, arg7 * 512, 0, 0, arg0, var31, arg2);
            } else if (arg6 == 5) {
                int var32 = 16;
                int var33 = arg3.method351(arg0, arg2, arg5);
                if (var33 > 0) {
                    var32 = class41.method398(var33 >> 14 & 0x7FFF).field1065;
                }
                class4 var34;
                if (var15.field1052 == -1 && var15.field1070 == null) {
                    var34 = var15.method405(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class15(0, true, var11, var13, var12, var10, 0, arg1, var15.field1052, 4);
                }
                arg3.method334(var17, var16, arg5, field1112[arg7], var14, false, arg7 * 512, field1128[arg7] * var32, field1129[arg7] * var32, arg0, var34, arg2);
            } else if (arg6 == 6) {
                class4 var35;
                if (var15.field1052 == -1 && var15.field1070 == null) {
                    var35 = var15.method405(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class15(0, true, var11, var13, var12, var10, 0, arg1, var15.field1052, 4);
                }
                arg3.method334(var17, var16, arg5, 256, var14, false, arg7, 0, 0, arg0, var35, arg2);
            } else if (arg6 == 7) {
                class4 var36;
                if (var15.field1052 == -1 && var15.field1070 == null) {
                    var36 = var15.method405(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class15(0, true, var11, var13, var12, var10, 0, arg1, var15.field1052, 4);
                }
                arg3.method334(var17, var16, arg5, 512, var14, false, arg7, 0, 0, arg0, var36, arg2);
            } else if (arg6 == 8) {
                class4 var37;
                if (var15.field1052 == -1 && var15.field1070 == null) {
                    var37 = var15.method405(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class15(0, true, var11, var13, var12, var10, 0, arg1, var15.field1052, 4);
                }
                arg3.method334(var17, var16, arg5, 768, var14, false, arg7, 0, 0, arg0, var37, arg2);
            }
        }
    }

    @OriginalMember(owner = "QJLJTPQV", name = "a", descriptor = "(III)I")
    private final int method413(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "QJLJTPQV", name = "a", descriptor = "(LLIOYHOWO;I[BI[LWWMUUFBO;I)V")
    public final void method414(class34 arg0, int arg1, byte[] arg2, int arg3, class63[] arg4, int arg5) {
        class24 var7 = new class24(0, arg2);
        if (arg1 != 0) {
            return;
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method252();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method252();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method238();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg3 + var13;
                int var19 = arg5 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field1124[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class63 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg4[var20];
                    }
                    this.method412(var14, var8, var18, arg0, this.field1111, var19, var16, var17, var21);
                }
            }
        }
    }

    @OriginalMember(owner = "QJLJTPQV", name = "a", descriptor = "(ILIMUIZRAF;LTDBJVJCU;)V")
    public static final void method415(int arg0, class24 arg1, class53 arg2) {
        int var3 = -1;
        if (arg0 != -23175) {
            field1136 = -204;
        }
        while (true) {
            int var4 = arg1.method252();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class41 var5 = class41.method398(var3);
            var5.method396(arg2, (byte) 11);
            while (true) {
                int var6 = arg1.method252();
                if (var6 == 0) {
                    break;
                }
                arg1.method238();
            }
        }
    }

    @OriginalMember(owner = "QJLJTPQV", name = "b", descriptor = "(II)I")
    private static final int method416(int arg0, int arg1) {
        int var2 = method421(arg0 - 1, arg1 - 1) + method421(arg0 + 1, arg1 - 1) + method421(arg0 - 1, arg1 + 1) + method421(arg0 + 1, arg1 + 1);
        int var3 = method421(arg0 - 1, arg1) + method421(arg0 + 1, arg1) + method421(arg0, arg1 - 1) + method421(arg0, arg1 + 1);
        int var4 = method421(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "QJLJTPQV", name = "a", descriptor = "(I[[[IIILWWMUUFBO;IIIIILLIOYHOWO;)V")
    public static final void method417(int arg0, int[][][] arg1, int arg2, int arg3, class63 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class34 arg10) {
        int var11 = arg1[arg2][arg0][arg7];
        int var12 = arg1[arg2][arg0 + 1][arg7];
        int var13 = 77 / arg6;
        int var14 = arg1[arg2][arg0 + 1][arg7 + 1];
        int var15 = arg1[arg2][arg0][arg7 + 1];
        int var16 = var11 + var12 + var14 + var15 >> 2;
        class41 var17 = class41.method398(arg8);
        int var18 = (arg8 << 14) + (arg7 << 7) + arg0 + 1073741824;
        if (!var17.field1083) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg3 << 6) + arg5);
        if (arg5 == 22) {
            class4 var20;
            if (var17.field1052 == -1 && var17.field1070 == null) {
                var20 = var17.method405(22, arg3, var11, var12, var14, var15, -1);
            } else {
                var20 = new class15(arg3, true, var12, var15, var14, var11, 0, arg8, var17.field1052, 22);
            }
            arg10.method331(arg0, (byte) 0, var19, var18, arg9, arg7, var20, var16);
            if (var17.field1098 && var17.field1083) {
                arg4.method531(arg7, arg0, (byte) -95);
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class4 var40;
            if (var17.field1052 == -1 && var17.field1070 == null) {
                var40 = var17.method405(10, arg3, var11, var12, var14, var15, -1);
            } else {
                var40 = new class15(arg3, true, var12, var15, var14, var11, 0, arg8, var17.field1052, 10);
            }
            if (var40 != null) {
                int var41 = 0;
                if (arg5 == 11) {
                    var41 += 256;
                }
                int var42;
                int var43;
                if (arg3 == 1 || arg3 == 3) {
                    var42 = var17.field1067;
                    var43 = var17.field1094;
                } else {
                    var42 = var17.field1094;
                    var43 = var17.field1067;
                }
                arg10.method335(var19, var16, arg9, var40, -903, var41, var43, arg7, var18, arg0, var42);
            }
            if (var17.field1098) {
                arg4.method530(arg3, var17.field1094, 4, arg0, var17.field1067, var17.field1091, arg7);
            }
        } else if (arg5 >= 12) {
            class4 var21;
            if (var17.field1052 == -1 && var17.field1070 == null) {
                var21 = var17.method405(arg5, arg3, var11, var12, var14, var15, -1);
            } else {
                var21 = new class15(arg3, true, var12, var15, var14, var11, 0, arg8, var17.field1052, arg5);
            }
            arg10.method335(var19, var16, arg9, var21, -903, 0, 1, arg7, var18, arg0, 1);
            if (var17.field1098) {
                arg4.method530(arg3, var17.field1094, 4, arg0, var17.field1067, var17.field1091, arg7);
            }
        } else if (arg5 == 0) {
            class4 var22;
            if (var17.field1052 == -1 && var17.field1070 == null) {
                var22 = var17.method405(0, arg3, var11, var12, var14, var15, -1);
            } else {
                var22 = new class15(arg3, true, var12, var15, var14, var11, 0, arg8, var17.field1052, 0);
            }
            arg10.method333(arg9, field1112[arg3], arg7, 0, var22, arg0, -730, var18, null, var16, var19);
            if (var17.field1098) {
                arg4.method529(arg0, 5, arg5, arg3, arg7, var17.field1091);
            }
        } else if (arg5 == 1) {
            class4 var23;
            if (var17.field1052 == -1 && var17.field1070 == null) {
                var23 = var17.method405(1, arg3, var11, var12, var14, var15, -1);
            } else {
                var23 = new class15(arg3, true, var12, var15, var14, var11, 0, arg8, var17.field1052, 1);
            }
            arg10.method333(arg9, field1123[arg3], arg7, 0, var23, arg0, -730, var18, null, var16, var19);
            if (var17.field1098) {
                arg4.method529(arg0, 5, arg5, arg3, arg7, var17.field1091);
            }
        } else if (arg5 == 2) {
            int var24 = arg3 + 1 & 0x3;
            class4 var25;
            class4 var26;
            if (var17.field1052 == -1 && var17.field1070 == null) {
                var25 = var17.method405(2, arg3 + 4, var11, var12, var14, var15, -1);
                var26 = var17.method405(2, var24, var11, var12, var14, var15, -1);
            } else {
                var25 = new class15(arg3 + 4, true, var12, var15, var14, var11, 0, arg8, var17.field1052, 2);
                var26 = new class15(var24, true, var12, var15, var14, var11, 0, arg8, var17.field1052, 2);
            }
            arg10.method333(arg9, field1112[arg3], arg7, field1112[var24], var25, arg0, -730, var18, var26, var16, var19);
            if (var17.field1098) {
                arg4.method529(arg0, 5, arg5, arg3, arg7, var17.field1091);
            }
        } else if (arg5 == 3) {
            class4 var27;
            if (var17.field1052 == -1 && var17.field1070 == null) {
                var27 = var17.method405(3, arg3, var11, var12, var14, var15, -1);
            } else {
                var27 = new class15(arg3, true, var12, var15, var14, var11, 0, arg8, var17.field1052, 3);
            }
            arg10.method333(arg9, field1123[arg3], arg7, 0, var27, arg0, -730, var18, null, var16, var19);
            if (var17.field1098) {
                arg4.method529(arg0, 5, arg5, arg3, arg7, var17.field1091);
            }
        } else if (arg5 == 9) {
            class4 var28;
            if (var17.field1052 == -1 && var17.field1070 == null) {
                var28 = var17.method405(arg5, arg3, var11, var12, var14, var15, -1);
            } else {
                var28 = new class15(arg3, true, var12, var15, var14, var11, 0, arg8, var17.field1052, arg5);
            }
            arg10.method335(var19, var16, arg9, var28, -903, 0, 1, arg7, var18, arg0, 1);
            if (var17.field1098) {
                arg4.method530(arg3, var17.field1094, 4, arg0, var17.field1067, var17.field1091, arg7);
            }
        } else {
            if (var17.field1059) {
                if (arg3 == 1) {
                    int var29 = var15;
                    var15 = var14;
                    var14 = var12;
                    var12 = var11;
                    var11 = var29;
                } else if (arg3 == 2) {
                    int var30 = var15;
                    var15 = var12;
                    var12 = var30;
                    int var31 = var14;
                    var14 = var11;
                    var11 = var31;
                } else if (arg3 == 3) {
                    int var32 = var15;
                    var15 = var11;
                    var11 = var12;
                    var12 = var14;
                    var14 = var32;
                }
            }
            if (arg5 == 4) {
                class4 var33;
                if (var17.field1052 == -1 && var17.field1070 == null) {
                    var33 = var17.method405(4, 0, var11, var12, var14, var15, -1);
                } else {
                    var33 = new class15(0, true, var12, var15, var14, var11, 0, arg8, var17.field1052, 4);
                }
                arg10.method334(var19, var18, arg7, field1112[arg3], var16, false, arg3 * 512, 0, 0, arg9, var33, arg0);
            } else if (arg5 == 5) {
                int var34 = 16;
                int var35 = arg10.method351(arg9, arg0, arg7);
                if (var35 > 0) {
                    var34 = class41.method398(var35 >> 14 & 0x7FFF).field1065;
                }
                class4 var36;
                if (var17.field1052 == -1 && var17.field1070 == null) {
                    var36 = var17.method405(4, 0, var11, var12, var14, var15, -1);
                } else {
                    var36 = new class15(0, true, var12, var15, var14, var11, 0, arg8, var17.field1052, 4);
                }
                arg10.method334(var19, var18, arg7, field1112[arg3], var16, false, arg3 * 512, field1128[arg3] * var34, field1129[arg3] * var34, arg9, var36, arg0);
            } else if (arg5 == 6) {
                class4 var37;
                if (var17.field1052 == -1 && var17.field1070 == null) {
                    var37 = var17.method405(4, 0, var11, var12, var14, var15, -1);
                } else {
                    var37 = new class15(0, true, var12, var15, var14, var11, 0, arg8, var17.field1052, 4);
                }
                arg10.method334(var19, var18, arg7, 256, var16, false, arg3, 0, 0, arg9, var37, arg0);
            } else if (arg5 == 7) {
                class4 var38;
                if (var17.field1052 == -1 && var17.field1070 == null) {
                    var38 = var17.method405(4, 0, var11, var12, var14, var15, -1);
                } else {
                    var38 = new class15(0, true, var12, var15, var14, var11, 0, arg8, var17.field1052, 4);
                }
                arg10.method334(var19, var18, arg7, 512, var16, false, arg3, 0, 0, arg9, var38, arg0);
            } else if (arg5 == 8) {
                class4 var39;
                if (var17.field1052 == -1 && var17.field1070 == null) {
                    var39 = var17.method405(4, 0, var11, var12, var14, var15, -1);
                } else {
                    var39 = new class15(0, true, var12, var15, var14, var11, 0, arg8, var17.field1052, 4);
                }
                arg10.method334(var19, var18, arg7, 768, var16, false, arg3, 0, 0, arg9, var39, arg0);
            }
        }
    }

    @OriginalMember(owner = "QJLJTPQV", name = "c", descriptor = "(II)I")
    private static final int method418(int arg0, int arg1) {
        int var2 = method426(arg0 + 45365, arg1 + 91923, 4) + (method426(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method426(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "QJLJTPQV", name = "d", descriptor = "(II)I")
    private static final int method419(int arg0, int arg1) {
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

    @OriginalMember(owner = "QJLJTPQV", name = "a", descriptor = "(I[LWWMUUFBO;IBIIILLIOYHOWO;II[B)V")
    public final void method420(int arg0, class63[] arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, class34 arg7, int arg8, int arg9, byte[] arg10) {
        class24 var12 = new class24(0, arg10);
        if (this.field1121 != arg3) {
            return;
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method252();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method252();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method238();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg5 == var19 && var18 >= arg2 && var18 < arg2 + 8 && var17 >= arg8 && var17 < arg8 + 8) {
                    class41 var23 = class41.method398(var13);
                    int var24 = arg0 + class70.method588(var17 & 0x7, var23.field1067, var18 & 0x7, var23.field1094, arg4, -187);
                    int var25 = arg9 + class70.method589(var18 & 0x7, var17 & 0x7, 0, arg4, var23.field1094, var23.field1067);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg6;
                        if ((this.field1124[1][var24][var25] & 0x2) == 2) {
                            var26 = arg6 - 1;
                        }
                        class63 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg1[var26];
                        }
                        this.method412(arg6, var13, var24, arg7, this.field1111, var25, var21, arg4 + var22 & 0x3, var27);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "QJLJTPQV", name = "e", descriptor = "(II)I")
    private static final int method421(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "QJLJTPQV", name = "a", descriptor = "(LLIOYHOWO;[LWWMUUFBO;I)V")
    public final void method422(class34 arg0, class63[] arg1, int arg2) {
        if (arg2 != -3083) {
            this.field1127 = !this.field1127;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1124[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1124[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method531(var111, var110, (byte) -95);
                        }
                    }
                }
            }
        }
        field1131 += (int) (Math.random() * 5.0D) - 2;
        if (field1131 < -8) {
            field1131 = -8;
        }
        if (field1131 > 8) {
            field1131 = 8;
        }
        field1105 += (int) (Math.random() * 5.0D) - 2;
        if (field1105 < -16) {
            field1105 = -16;
        }
        if (field1105 > 16) {
            field1105 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1130[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1134 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1133 - 1; var101++) {
                    int var102 = this.field1106[var5][var101 + 1][var56] - this.field1106[var5][var101 - 1][var56];
                    int var103 = this.field1106[var5][var101][var56 + 1] - this.field1106[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1114[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1134; var57++) {
                this.field1116[var57] = 0;
                this.field1117[var57] = 0;
                this.field1118[var57] = 0;
                this.field1119[var57] = 0;
                this.field1120[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1133 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1134; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1133) {
                        int var96 = this.field1137[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class19 var97 = class19.field742[var96 - 1];
                            this.field1116[var61] += var97.field751;
                            this.field1117[var61] += var97.field749;
                            this.field1118[var61] += var97.field750;
                            this.field1119[var61] += var97.field752;
                            var10002 = this.field1120[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1133) {
                        int var99 = this.field1137[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class19 var100 = class19.field742[var99 - 1];
                            this.field1116[var61] -= var100.field751;
                            this.field1117[var61] -= var100.field749;
                            this.field1118[var61] -= var100.field750;
                            this.field1119[var61] -= var100.field752;
                            var10002 = this.field1120[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1133 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1134 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1134) {
                            var62 += this.field1116[var68];
                            var63 += this.field1117[var68];
                            var64 += this.field1118[var68];
                            var65 += this.field1119[var68];
                            var66 += this.field1120[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1134) {
                            var62 -= this.field1116[var69];
                            var63 -= this.field1117[var69];
                            var64 -= this.field1118[var69];
                            var65 -= this.field1119[var69];
                            var66 -= this.field1120[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1134 - 1 && (!field1103 || (this.field1124[0][var58][var67] & 0x2) != 0 || (this.field1124[var5][var58][var67] & 0x10) == 0 && this.method410(var58, var67, var5, 0) == field1122)) {
                            if (var5 < field1132) {
                                field1132 = var5;
                            }
                            int var70 = this.field1137[var5][var58][var67] & 0xFF;
                            int var71 = this.field1115[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1106[var5][var58][var67];
                                int var73 = this.field1106[var5][var58 + 1][var67];
                                int var74 = this.field1106[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1106[var5][var58][var67 + 1];
                                int var76 = this.field1114[var58][var67];
                                int var77 = this.field1114[var58 + 1][var67];
                                int var78 = this.field1114[var58 + 1][var67 + 1];
                                int var79 = this.field1114[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method413(var82, var83, var84);
                                    int var85 = field1131 + var82 & 0xFF;
                                    int var86 = field1105 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method413(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1126[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class19.field742[var71 - 1].field747) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1107[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class58.field1488[method419(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg0.method330(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method419(var80, var76), method419(var80, var77), method419(var80, var78), method419(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1126[var5][var58][var67] + 1;
                                    byte var90 = this.field1102[var5][var58][var67];
                                    class19 var91 = class19.field742[var71 - 1];
                                    int var92 = var91.field745;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class58.method500(this.field1104, var92);
                                        var94 = -1;
                                    } else if (var91.field744 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method413(var91.field748, var91.field749, var91.field750);
                                        var93 = class58.field1488[this.method409(var91.field753, 96)];
                                    }
                                    arg0.method330(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method419(var80, var76), method419(var80, var77), method419(var80, var78), method419(var80, var79), this.method409(var94, var76), this.method409(var94, var77), this.method409(var94, var78), this.method409(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1134 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1133 - 1; var60++) {
                    arg0.method329(var5, var60, var59, this.method410(var60, var59, var5, 0));
                }
            }
        }
        arg0.method356(768, this.field1125, 64, -50, -10, -50);
        for (int var6 = 0; var6 < this.field1133; var6++) {
            for (int var47 = 0; var47 < this.field1134; var47++) {
                if ((this.field1124[1][var6][var47] & 0x2) == 2) {
                    arg0.method327(var47, var6, (byte) 0);
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
                for (int var12 = 0; var12 <= this.field1134; var12++) {
                    for (int var13 = 0; var13 <= this.field1133; var13++) {
                        if ((this.field1107[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1107[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1134 && (this.field1107[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label335: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1107[var16 - 1][var13][var18] & var7) == 0) {
                                        break label335;
                                    }
                                }
                                var16--;
                            }
                            label324: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1107[var17 + 1][var13][var19] & var7) == 0) {
                                        break label324;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1106[var17][var13][var14] - var21;
                                int var23 = this.field1106[var16][var13][var14];
                                class34.method328(var13 * 128, (byte) -97, var13 * 128, var15 * 128 + 128, 1, var10, var22, var14 * 128, var23);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1107[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1107[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1107[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1133 && (this.field1107[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label388: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1107[var28 - 1][var30][var12] & var8) == 0) {
                                        break label388;
                                    }
                                }
                                var28--;
                            }
                            label377: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1107[var29 + 1][var31][var12] & var8) == 0) {
                                        break label377;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1106[var29][var26][var12] - var33;
                                int var35 = this.field1106[var28][var26][var12];
                                class34.method328(var26 * 128, (byte) -97, var27 * 128 + 128, var12 * 128, 2, var10, var34, var12 * 128, var35);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1107[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1107[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1107[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1134 && (this.field1107[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label441: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1107[var11][var38 - 1][var42] & var9) == 0) {
                                        break label441;
                                    }
                                }
                                var38--;
                            }
                            label430: while (var39 < this.field1133) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1107[var11][var39 + 1][var43] & var9) == 0) {
                                        break label430;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field1106[var11][var38][var40];
                                class34.method328(var38 * 128, (byte) -97, var39 * 128 + 128, var41 * 128 + 128, 4, var10, var44, var40 * 128, var44);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1107[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "QJLJTPQV", name = "a", descriptor = "(LIMUIZRAF;IIIIIII)V")
    private final void method423(class24 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 >= 0) {
            return;
        }
        if (arg5 < 0 || arg5 >= 104 || arg7 < 0 || arg7 >= 104) {
            while (true) {
                int var11 = arg0.method238();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg0.method238();
                    return;
                }
                if (var11 <= 49) {
                    arg0.method238();
                }
            }
        }
        this.field1124[arg3][arg5][arg7] = 0;
        while (true) {
            int var9 = arg0.method238();
            if (var9 == 0) {
                if (arg3 == 0) {
                    this.field1106[0][arg5][arg7] = -method418(arg5 + arg1 + 932731, arg7 + 556238 + arg6) * 8;
                    return;
                } else {
                    this.field1106[arg3][arg5][arg7] = this.field1106[arg3 - 1][arg5][arg7] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg0.method238();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg3 == 0) {
                    this.field1106[0][arg5][arg7] = -var10 * 8;
                    return;
                }
                this.field1106[arg3][arg5][arg7] = this.field1106[arg3 - 1][arg5][arg7] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field1115[arg3][arg5][arg7] = arg0.method239();
                this.field1126[arg3][arg5][arg7] = (byte) ((var9 - 2) / 4);
                this.field1102[arg3][arg5][arg7] = (byte) (var9 + arg2 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field1124[arg3][arg5][arg7] = (byte) (var9 - 49);
            } else {
                this.field1137[arg3][arg5][arg7] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "QJLJTPQV", name = "a", descriptor = "(IIIII)V")
    public final void method424(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg3; var6 <= arg3 + arg4; var6++) {
            for (int var7 = arg1; var7 <= arg0 + arg1; var7++) {
                if (var7 >= 0 && var7 < this.field1133 && var6 >= 0 && var6 < this.field1134) {
                    this.field1130[0][var7][var6] = 127;
                    if (arg1 == var7 && var7 > 0) {
                        this.field1106[0][var7][var6] = this.field1106[0][var7 - 1][var6];
                    }
                    if (arg0 + arg1 == var7 && var7 < this.field1133 - 1) {
                        this.field1106[0][var7][var6] = this.field1106[0][var7 + 1][var6];
                    }
                    if (arg3 == var6 && var6 > 0) {
                        this.field1106[0][var7][var6] = this.field1106[0][var7][var6 - 1];
                    }
                    if (arg3 + arg4 == var6 && var6 < this.field1134 - 1) {
                        this.field1106[0][var7][var6] = this.field1106[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (arg2 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "QJLJTPQV", name = "b", descriptor = "(III)Z")
    public static final boolean method425(int arg0, int arg1, int arg2) {
        class41 var3 = class41.method398(arg1);
        if (arg2 != 26615) {
            throw new NullPointerException();
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method397(0, arg0);
    }

    @OriginalMember(owner = "QJLJTPQV", name = "c", descriptor = "(III)I")
    private static final int method426(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method416(var3, var5);
        int var8 = method416(var3 + 1, var5);
        int var9 = method416(var3, var5 + 1);
        int var10 = method416(var3 + 1, var5 + 1);
        int var11 = method406(var7, var8, var4, arg2);
        int var12 = method406(var9, var10, var4, arg2);
        return method406(var11, var12, var6, arg2);
    }
}
