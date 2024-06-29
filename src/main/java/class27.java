import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IPCPGCKM")
public class class27 {

    @OriginalMember(owner = "client!IPCPGCKM", name = "h", descriptor = "I")
    private int field899 = -38597;

    @OriginalMember(owner = "client!IPCPGCKM", name = "k", descriptor = "I")
    private int field902 = 6;

    @OriginalMember(owner = "client!IPCPGCKM", name = "n", descriptor = "I")
    private int field905 = -685;

    @OriginalMember(owner = "client!IPCPGCKM", name = "p", descriptor = "Z")
    private boolean field907 = false;

    @OriginalMember(owner = "client!IPCPGCKM", name = "u", descriptor = "I")
    private int field912;

    @OriginalMember(owner = "client!IPCPGCKM", name = "v", descriptor = "I")
    private int field913;

    @OriginalMember(owner = "client!IPCPGCKM", name = "g", descriptor = "[[[I")
    private int[][][] field898;

    @OriginalMember(owner = "client!IPCPGCKM", name = "d", descriptor = "[[[B")
    private byte[][][] field895;

    @OriginalMember(owner = "client!IPCPGCKM", name = "r", descriptor = "[[[B")
    private byte[][][] field909;

    @OriginalMember(owner = "client!IPCPGCKM", name = "c", descriptor = "[[[B")
    private byte[][][] field894;

    @OriginalMember(owner = "client!IPCPGCKM", name = "s", descriptor = "[[[B")
    private byte[][][] field910;

    @OriginalMember(owner = "client!IPCPGCKM", name = "D", descriptor = "[[[B")
    private byte[][][] field921;

    @OriginalMember(owner = "client!IPCPGCKM", name = "x", descriptor = "[[[I")
    private int[][][] field915;

    @OriginalMember(owner = "client!IPCPGCKM", name = "q", descriptor = "[[[B")
    private byte[][][] field908;

    @OriginalMember(owner = "client!IPCPGCKM", name = "f", descriptor = "[[I")
    private int[][] field897;

    @OriginalMember(owner = "client!IPCPGCKM", name = "y", descriptor = "[I")
    private int[] field916;

    @OriginalMember(owner = "client!IPCPGCKM", name = "z", descriptor = "[I")
    private int[] field917;

    @OriginalMember(owner = "client!IPCPGCKM", name = "A", descriptor = "[I")
    private int[] field918;

    @OriginalMember(owner = "client!IPCPGCKM", name = "B", descriptor = "[I")
    private int[] field919;

    @OriginalMember(owner = "client!IPCPGCKM", name = "C", descriptor = "[I")
    private int[] field920;

    @OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "I")
    private static int field892 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!IPCPGCKM", name = "b", descriptor = "[I")
    private static final int[] field893 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!IPCPGCKM", name = "i", descriptor = "I")
    private static int field900 = 536;

    @OriginalMember(owner = "client!IPCPGCKM", name = "j", descriptor = "[I")
    private static final int[] field901 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!IPCPGCKM", name = "l", descriptor = "Z")
    public static boolean field903 = true;

    @OriginalMember(owner = "client!IPCPGCKM", name = "m", descriptor = "[I")
    private static final int[] field904 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!IPCPGCKM", name = "o", descriptor = "[I")
    private static final int[] field906 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!IPCPGCKM", name = "t", descriptor = "I")
    public static int field911 = 99;

    @OriginalMember(owner = "client!IPCPGCKM", name = "w", descriptor = "I")
    private static int field914 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!IPCPGCKM", name = "e", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(IIII)I")
    private static final int method305(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class39.field1155[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(BI[[[IILTCDQXHKB;IILVLOWRGUJ;III)V")
    public static final void method306(byte arg0, int arg1, int[][][] arg2, int arg3, class53 arg4, int arg5, int arg6, class61 arg7, int arg8, int arg9, int arg10) {
        if (arg0 != 2) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = arg2[arg3][arg5][arg1];
        int var13 = arg2[arg3][arg5 + 1][arg1];
        int var14 = arg2[arg3][arg5 + 1][arg1 + 1];
        int var15 = arg2[arg3][arg5][arg1 + 1];
        int var16 = var12 + var13 + var14 + var15 >> 2;
        class70 var17 = class70.method596(arg9);
        int var18 = (arg9 << 14) + (arg1 << 7) + arg5 + 1073741824;
        if (!var17.field1730) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg10 << 6) + arg6);
        if (arg6 == 22) {
            class3 var20;
            if (var17.field1706 == -1 && var17.field1734 == null) {
                var20 = var17.method587(22, arg10, var12, var13, var14, var15, -1);
            } else {
                var20 = new class15(var12, arg10, var14, var13, true, 22, arg9, var15, var17.field1706, false);
            }
            arg4.method454(arg8, arg1, var16, var20, arg5, var18, -37054, var19);
            if (var17.field1713 && var17.field1730) {
                arg7.method555(arg1, arg5, -866);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class3 var40;
            if (var17.field1706 == -1 && var17.field1734 == null) {
                var40 = var17.method587(10, arg10, var12, var13, var14, var15, -1);
            } else {
                var40 = new class15(var12, arg10, var14, var13, true, 10, arg9, var15, var17.field1706, false);
            }
            if (var40 != null) {
                int var41 = 0;
                if (arg6 == 11) {
                    var41 += 256;
                }
                int var42;
                int var43;
                if (arg10 == 1 || arg10 == 3) {
                    var42 = var17.field1735;
                    var43 = var17.field1724;
                } else {
                    var42 = var17.field1724;
                    var43 = var17.field1735;
                }
                arg4.method458(arg5, var43, var40, var19, var18, var42, var16, 0, arg1, var41, arg8);
            }
            if (var17.field1713) {
                arg7.method554(var17.field1724, arg1, var17.field1735, arg10, arg5, 0, var17.field1703);
            }
        } else if (arg6 >= 12) {
            class3 var21;
            if (var17.field1706 == -1 && var17.field1734 == null) {
                var21 = var17.method587(arg6, arg10, var12, var13, var14, var15, -1);
            } else {
                var21 = new class15(var12, arg10, var14, var13, true, arg6, arg9, var15, var17.field1706, false);
            }
            arg4.method458(arg5, 1, var21, var19, var18, 1, var16, 0, arg1, 0, arg8);
            if (var17.field1713) {
                arg7.method554(var17.field1724, arg1, var17.field1735, arg10, arg5, 0, var17.field1703);
            }
        } else if (arg6 == 0) {
            class3 var22;
            if (var17.field1706 == -1 && var17.field1734 == null) {
                var22 = var17.method587(0, arg10, var12, var13, var14, var15, -1);
            } else {
                var22 = new class15(var12, arg10, var14, var13, true, 0, arg9, var15, var17.field1706, false);
            }
            arg4.method456(field906[arg10], var22, arg5, false, null, arg1, var18, 0, arg8, var16, var19);
            if (var17.field1713) {
                arg7.method553((byte) -125, arg5, arg6, arg10, arg1, var17.field1703);
            }
        } else if (arg6 == 1) {
            class3 var23;
            if (var17.field1706 == -1 && var17.field1734 == null) {
                var23 = var17.method587(1, arg10, var12, var13, var14, var15, -1);
            } else {
                var23 = new class15(var12, arg10, var14, var13, true, 1, arg9, var15, var17.field1706, false);
            }
            arg4.method456(field893[arg10], var23, arg5, false, null, arg1, var18, 0, arg8, var16, var19);
            if (var17.field1713) {
                arg7.method553((byte) -125, arg5, arg6, arg10, arg1, var17.field1703);
            }
        } else if (arg6 == 2) {
            int var24 = arg10 + 1 & 0x3;
            class3 var25;
            class3 var26;
            if (var17.field1706 == -1 && var17.field1734 == null) {
                var25 = var17.method587(2, arg10 + 4, var12, var13, var14, var15, -1);
                var26 = var17.method587(2, var24, var12, var13, var14, var15, -1);
            } else {
                var25 = new class15(var12, arg10 + 4, var14, var13, true, 2, arg9, var15, var17.field1706, false);
                var26 = new class15(var12, var24, var14, var13, true, 2, arg9, var15, var17.field1706, false);
            }
            arg4.method456(field906[arg10], var25, arg5, false, var26, arg1, var18, field906[var24], arg8, var16, var19);
            if (var17.field1713) {
                arg7.method553((byte) -125, arg5, arg6, arg10, arg1, var17.field1703);
            }
        } else if (arg6 == 3) {
            class3 var27;
            if (var17.field1706 == -1 && var17.field1734 == null) {
                var27 = var17.method587(3, arg10, var12, var13, var14, var15, -1);
            } else {
                var27 = new class15(var12, arg10, var14, var13, true, 3, arg9, var15, var17.field1706, false);
            }
            arg4.method456(field893[arg10], var27, arg5, false, null, arg1, var18, 0, arg8, var16, var19);
            if (var17.field1713) {
                arg7.method553((byte) -125, arg5, arg6, arg10, arg1, var17.field1703);
            }
        } else if (arg6 == 9) {
            class3 var28;
            if (var17.field1706 == -1 && var17.field1734 == null) {
                var28 = var17.method587(arg6, arg10, var12, var13, var14, var15, -1);
            } else {
                var28 = new class15(var12, arg10, var14, var13, true, arg6, arg9, var15, var17.field1706, false);
            }
            arg4.method458(arg5, 1, var28, var19, var18, 1, var16, 0, arg1, 0, arg8);
            if (var17.field1713) {
                arg7.method554(var17.field1724, arg1, var17.field1735, arg10, arg5, 0, var17.field1703);
            }
        } else {
            if (var17.field1726) {
                if (arg10 == 1) {
                    int var29 = var15;
                    var15 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var29;
                } else if (arg10 == 2) {
                    int var30 = var15;
                    var15 = var13;
                    var13 = var30;
                    int var31 = var14;
                    var14 = var12;
                    var12 = var31;
                } else if (arg10 == 3) {
                    int var32 = var15;
                    var15 = var12;
                    var12 = var13;
                    var13 = var14;
                    var14 = var32;
                }
            }
            if (arg6 == 4) {
                class3 var33;
                if (var17.field1706 == -1 && var17.field1734 == null) {
                    var33 = var17.method587(4, 0, var12, var13, var14, var15, -1);
                } else {
                    var33 = new class15(var12, 0, var14, var13, true, 4, arg9, var15, var17.field1706, false);
                }
                arg4.method457(var18, var19, var33, 0, var16, arg8, 0, field906[arg10], arg5, 0, arg1, arg10 * 512);
            } else if (arg6 == 5) {
                int var34 = 16;
                int var35 = arg4.method474(arg8, arg5, arg1);
                if (var35 > 0) {
                    var34 = class70.method596(var35 >> 14 & 0x7FFF).field1746;
                }
                class3 var36;
                if (var17.field1706 == -1 && var17.field1734 == null) {
                    var36 = var17.method587(4, 0, var12, var13, var14, var15, -1);
                } else {
                    var36 = new class15(var12, 0, var14, var13, true, 4, arg9, var15, var17.field1706, false);
                }
                arg4.method457(var18, var19, var36, field901[arg10] * var34, var16, arg8, field904[arg10] * var34, field906[arg10], arg5, 0, arg1, arg10 * 512);
            } else if (arg6 == 6) {
                class3 var37;
                if (var17.field1706 == -1 && var17.field1734 == null) {
                    var37 = var17.method587(4, 0, var12, var13, var14, var15, -1);
                } else {
                    var37 = new class15(var12, 0, var14, var13, true, 4, arg9, var15, var17.field1706, false);
                }
                arg4.method457(var18, var19, var37, 0, var16, arg8, 0, 256, arg5, 0, arg1, arg10);
            } else if (arg6 == 7) {
                class3 var38;
                if (var17.field1706 == -1 && var17.field1734 == null) {
                    var38 = var17.method587(4, 0, var12, var13, var14, var15, -1);
                } else {
                    var38 = new class15(var12, 0, var14, var13, true, 4, arg9, var15, var17.field1706, false);
                }
                arg4.method457(var18, var19, var38, 0, var16, arg8, 0, 512, arg5, 0, arg1, arg10);
            } else if (arg6 == 8) {
                class3 var39;
                if (var17.field1706 == -1 && var17.field1734 == null) {
                    var39 = var17.method587(4, 0, var12, var13, var14, var15, -1);
                } else {
                    var39 = new class15(var12, 0, var14, var13, true, 4, arg9, var15, var17.field1706, false);
                }
                arg4.method457(var18, var19, var39, 0, var16, arg8, 0, 768, arg5, 0, arg1, arg10);
            }
        }
    }

    @OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(II)I")
    private static final int method307(int arg0, int arg1) {
        int var2 = method326(arg0 + 45365, arg1 + 91923, 4) + (method326(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method326(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(IIILTCDQXHKB;IIILVLOWRGUJ;I)V")
    private final void method308(int arg0, int arg1, int arg2, class53 arg3, int arg4, int arg5, int arg6, class61 arg7, int arg8) {
        if (field903 && (this.field895[0][arg8][arg5] & 0x2) == 0) {
            if ((this.field895[arg2][arg8][arg5] & 0x10) != 0) {
                return;
            }
            if (this.method318(arg2, 33, arg8, arg5) != field896) {
                return;
            }
        }
        if (arg2 < field911) {
            field911 = arg2;
        }
        int var10 = this.field898[arg2][arg8][arg5];
        int var11 = this.field898[arg2][arg8 + 1][arg5];
        int var12 = this.field898[arg2][arg8 + 1][arg5 + 1];
        int var13 = this.field898[arg2][arg8][arg5 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class70 var15 = class70.method596(arg4);
        int var16 = (arg4 << 14) + (arg5 << 7) + arg8 + 1073741824;
        if (!var15.field1730) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg1 << 6) + arg6);
        if (arg0 >= 0) {
            return;
        }
        if (arg6 == 22) {
            if (!field903 || var15.field1730 || var15.field1752) {
                class3 var18;
                if (var15.field1706 == -1 && var15.field1734 == null) {
                    var18 = var15.method587(22, arg1, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class15(var10, arg1, var12, var11, true, 22, arg4, var13, var15.field1706, false);
                }
                arg3.method454(arg2, arg5, var14, var18, arg8, var16, -37054, var17);
                if (var15.field1713 && var15.field1730 && arg7 != null) {
                    arg7.method555(arg5, arg8, -866);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class3 var38;
            if (var15.field1706 == -1 && var15.field1734 == null) {
                var38 = var15.method587(10, arg1, var10, var11, var12, var13, -1);
            } else {
                var38 = new class15(var10, arg1, var12, var11, true, 10, arg4, var13, var15.field1706, false);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg6 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg1 == 1 || arg1 == 3) {
                    var40 = var15.field1735;
                    var41 = var15.field1724;
                } else {
                    var40 = var15.field1724;
                    var41 = var15.field1735;
                }
                if (arg3.method458(arg8, var41, var38, var17, var16, var40, var14, 0, arg5, var39, arg2) && var15.field1729) {
                    class16 var42;
                    if (var38 instanceof class16) {
                        var42 = (class16) var38;
                    } else {
                        var42 = var15.method587(10, arg1, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field738 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field908[arg2][arg8 + var43][arg5 + var44]) {
                                    this.field908[arg2][arg8 + var43][arg5 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1713 && arg7 != null) {
                arg7.method554(var15.field1724, arg5, var15.field1735, arg1, arg8, 0, var15.field1703);
            }
        } else if (arg6 >= 12) {
            class3 var19;
            if (var15.field1706 == -1 && var15.field1734 == null) {
                var19 = var15.method587(arg6, arg1, var10, var11, var12, var13, -1);
            } else {
                var19 = new class15(var10, arg1, var12, var11, true, arg6, arg4, var13, var15.field1706, false);
            }
            arg3.method458(arg8, 1, var19, var17, var16, 1, var14, 0, arg5, 0, arg2);
            if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg2 > 0) {
                this.field915[arg2][arg8][arg5] |= 0x924;
            }
            if (var15.field1713 && arg7 != null) {
                arg7.method554(var15.field1724, arg5, var15.field1735, arg1, arg8, 0, var15.field1703);
            }
        } else if (arg6 == 0) {
            class3 var20;
            if (var15.field1706 == -1 && var15.field1734 == null) {
                var20 = var15.method587(0, arg1, var10, var11, var12, var13, -1);
            } else {
                var20 = new class15(var10, arg1, var12, var11, true, 0, arg4, var13, var15.field1706, false);
            }
            arg3.method456(field906[arg1], var20, arg8, false, null, arg5, var16, 0, arg2, var14, var17);
            if (arg1 == 0) {
                if (var15.field1729) {
                    this.field908[arg2][arg8][arg5] = 50;
                    this.field908[arg2][arg8][arg5 + 1] = 50;
                }
                if (var15.field1750) {
                    this.field915[arg2][arg8][arg5] |= 0x249;
                }
            } else if (arg1 == 1) {
                if (var15.field1729) {
                    this.field908[arg2][arg8][arg5 + 1] = 50;
                    this.field908[arg2][arg8 + 1][arg5 + 1] = 50;
                }
                if (var15.field1750) {
                    this.field915[arg2][arg8][arg5 + 1] |= 0x492;
                }
            } else if (arg1 == 2) {
                if (var15.field1729) {
                    this.field908[arg2][arg8 + 1][arg5] = 50;
                    this.field908[arg2][arg8 + 1][arg5 + 1] = 50;
                }
                if (var15.field1750) {
                    this.field915[arg2][arg8 + 1][arg5] |= 0x249;
                }
            } else if (arg1 == 3) {
                if (var15.field1729) {
                    this.field908[arg2][arg8][arg5] = 50;
                    this.field908[arg2][arg8 + 1][arg5] = 50;
                }
                if (var15.field1750) {
                    this.field915[arg2][arg8][arg5] |= 0x492;
                }
            }
            if (var15.field1713 && arg7 != null) {
                arg7.method553((byte) -125, arg8, arg6, arg1, arg5, var15.field1703);
            }
            if (var15.field1746 != 16) {
                arg3.method464(arg2, -14891, var15.field1746, arg8, arg5);
            }
        } else if (arg6 == 1) {
            class3 var21;
            if (var15.field1706 == -1 && var15.field1734 == null) {
                var21 = var15.method587(1, arg1, var10, var11, var12, var13, -1);
            } else {
                var21 = new class15(var10, arg1, var12, var11, true, 1, arg4, var13, var15.field1706, false);
            }
            arg3.method456(field893[arg1], var21, arg8, false, null, arg5, var16, 0, arg2, var14, var17);
            if (var15.field1729) {
                if (arg1 == 0) {
                    this.field908[arg2][arg8][arg5 + 1] = 50;
                } else if (arg1 == 1) {
                    this.field908[arg2][arg8 + 1][arg5 + 1] = 50;
                } else if (arg1 == 2) {
                    this.field908[arg2][arg8 + 1][arg5] = 50;
                } else if (arg1 == 3) {
                    this.field908[arg2][arg8][arg5] = 50;
                }
            }
            if (var15.field1713 && arg7 != null) {
                arg7.method553((byte) -125, arg8, arg6, arg1, arg5, var15.field1703);
            }
        } else if (arg6 == 2) {
            int var22 = arg1 + 1 & 0x3;
            class3 var23;
            class3 var24;
            if (var15.field1706 == -1 && var15.field1734 == null) {
                var23 = var15.method587(2, arg1 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method587(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class15(var10, arg1 + 4, var12, var11, true, 2, arg4, var13, var15.field1706, false);
                var24 = new class15(var10, var22, var12, var11, true, 2, arg4, var13, var15.field1706, false);
            }
            arg3.method456(field906[arg1], var23, arg8, false, var24, arg5, var16, field906[var22], arg2, var14, var17);
            if (var15.field1750) {
                if (arg1 == 0) {
                    this.field915[arg2][arg8][arg5] |= 0x249;
                    this.field915[arg2][arg8][arg5 + 1] |= 0x492;
                } else if (arg1 == 1) {
                    this.field915[arg2][arg8][arg5 + 1] |= 0x492;
                    this.field915[arg2][arg8 + 1][arg5] |= 0x249;
                } else if (arg1 == 2) {
                    this.field915[arg2][arg8 + 1][arg5] |= 0x249;
                    this.field915[arg2][arg8][arg5] |= 0x492;
                } else if (arg1 == 3) {
                    this.field915[arg2][arg8][arg5] |= 0x492;
                    this.field915[arg2][arg8][arg5] |= 0x249;
                }
            }
            if (var15.field1713 && arg7 != null) {
                arg7.method553((byte) -125, arg8, arg6, arg1, arg5, var15.field1703);
            }
            if (var15.field1746 != 16) {
                arg3.method464(arg2, -14891, var15.field1746, arg8, arg5);
            }
        } else if (arg6 == 3) {
            class3 var25;
            if (var15.field1706 == -1 && var15.field1734 == null) {
                var25 = var15.method587(3, arg1, var10, var11, var12, var13, -1);
            } else {
                var25 = new class15(var10, arg1, var12, var11, true, 3, arg4, var13, var15.field1706, false);
            }
            arg3.method456(field893[arg1], var25, arg8, false, null, arg5, var16, 0, arg2, var14, var17);
            if (var15.field1729) {
                if (arg1 == 0) {
                    this.field908[arg2][arg8][arg5 + 1] = 50;
                } else if (arg1 == 1) {
                    this.field908[arg2][arg8 + 1][arg5 + 1] = 50;
                } else if (arg1 == 2) {
                    this.field908[arg2][arg8 + 1][arg5] = 50;
                } else if (arg1 == 3) {
                    this.field908[arg2][arg8][arg5] = 50;
                }
            }
            if (var15.field1713 && arg7 != null) {
                arg7.method553((byte) -125, arg8, arg6, arg1, arg5, var15.field1703);
            }
        } else if (arg6 == 9) {
            class3 var26;
            if (var15.field1706 == -1 && var15.field1734 == null) {
                var26 = var15.method587(arg6, arg1, var10, var11, var12, var13, -1);
            } else {
                var26 = new class15(var10, arg1, var12, var11, true, arg6, arg4, var13, var15.field1706, false);
            }
            arg3.method458(arg8, 1, var26, var17, var16, 1, var14, 0, arg5, 0, arg2);
            if (var15.field1713 && arg7 != null) {
                arg7.method554(var15.field1724, arg5, var15.field1735, arg1, arg8, 0, var15.field1703);
            }
        } else {
            if (var15.field1726) {
                if (arg1 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg1 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg1 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg6 == 4) {
                class3 var31;
                if (var15.field1706 == -1 && var15.field1734 == null) {
                    var31 = var15.method587(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class15(var10, 0, var12, var11, true, 4, arg4, var13, var15.field1706, false);
                }
                arg3.method457(var16, var17, var31, 0, var14, arg2, 0, field906[arg1], arg8, 0, arg5, arg1 * 512);
            } else if (arg6 == 5) {
                int var32 = 16;
                int var33 = arg3.method474(arg2, arg8, arg5);
                if (var33 > 0) {
                    var32 = class70.method596(var33 >> 14 & 0x7FFF).field1746;
                }
                class3 var34;
                if (var15.field1706 == -1 && var15.field1734 == null) {
                    var34 = var15.method587(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class15(var10, 0, var12, var11, true, 4, arg4, var13, var15.field1706, false);
                }
                arg3.method457(var16, var17, var34, field901[arg1] * var32, var14, arg2, field904[arg1] * var32, field906[arg1], arg8, 0, arg5, arg1 * 512);
            } else if (arg6 == 6) {
                class3 var35;
                if (var15.field1706 == -1 && var15.field1734 == null) {
                    var35 = var15.method587(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class15(var10, 0, var12, var11, true, 4, arg4, var13, var15.field1706, false);
                }
                arg3.method457(var16, var17, var35, 0, var14, arg2, 0, 256, arg8, 0, arg5, arg1);
            } else if (arg6 == 7) {
                class3 var36;
                if (var15.field1706 == -1 && var15.field1734 == null) {
                    var36 = var15.method587(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class15(var10, 0, var12, var11, true, 4, arg4, var13, var15.field1706, false);
                }
                arg3.method457(var16, var17, var36, 0, var14, arg2, 0, 512, arg8, 0, arg5, arg1);
            } else if (arg6 == 8) {
                class3 var37;
                if (var15.field1706 == -1 && var15.field1734 == null) {
                    var37 = var15.method587(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class15(var10, 0, var12, var11, true, 4, arg4, var13, var15.field1706, false);
                }
                arg3.method457(var16, var17, var37, 0, var14, arg2, 0, 768, arg8, 0, arg5, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "([LVLOWRGUJ;LTCDQXHKB;I)V")
    public final void method309(class61[] arg0, class53 arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var111 = 0; var111 < 104; var111++) {
                for (int var112 = 0; var112 < 104; var112++) {
                    if ((this.field895[var4][var111][var112] & 0x1) == 1) {
                        int var113 = var4;
                        if ((this.field895[1][var111][var112] & 0x2) == 2) {
                            var113 = var4 - 1;
                        }
                        if (var113 >= 0) {
                            arg0[var113].method555(var112, var111, -866);
                        }
                    }
                }
            }
        }
        field914 += (int) (Math.random() * 5.0D) - 2;
        if (field914 < -8) {
            field914 = -8;
        }
        if (field914 > 8) {
            field914 = 8;
        }
        field892 += (int) (Math.random() * 5.0D) - 2;
        if (field892 < -16) {
            field892 = -16;
        }
        if (field892 > 16) {
            field892 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var49 = this.field908[var5];
            byte var50 = 96;
            short var51 = 768;
            byte var52 = -50;
            byte var53 = -10;
            byte var54 = -50;
            int var55 = (int) Math.sqrt((double) (var54 * var54 + var52 * var52 + var53 * var53));
            int var56 = var51 * var55 >> 8;
            for (int var57 = 1; var57 < this.field913 - 1; var57++) {
                for (int var102 = 1; var102 < this.field912 - 1; var102++) {
                    int var103 = this.field898[var5][var102 + 1][var57] - this.field898[var5][var102 - 1][var57];
                    int var104 = this.field898[var5][var102][var57 + 1] - this.field898[var5][var102][var57 - 1];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + var103 * var103 + 65536));
                    int var106 = (var103 << 8) / var105;
                    int var107 = 65536 / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var54 * var108 + var52 * var106 + var53 * var107) / var56 + var50;
                    int var110 = (var49[var102][var57] >> 1) + (var49[var102][var57 + 1] >> 3) + (var49[var102][var57 - 1] >> 2) + (var49[var102 - 1][var57] >> 2) + (var49[var102 + 1][var57] >> 3);
                    this.field897[var102][var57] = var109 - var110;
                }
            }
            for (int var58 = 0; var58 < this.field913; var58++) {
                this.field916[var58] = 0;
                this.field917[var58] = 0;
                this.field918[var58] = 0;
                this.field919[var58] = 0;
                this.field920[var58] = 0;
            }
            for (int var59 = -5; var59 < this.field912 + 5; var59++) {
                for (int var62 = 0; var62 < this.field913; var62++) {
                    int var96 = var59 + 5;
                    int var10002;
                    if (var96 >= 0 && var96 < this.field912) {
                        int var97 = this.field909[var5][var96][var62] & 0xFF;
                        if (var97 > 0) {
                            class21 var98 = class21.field848[var97 - 1];
                            this.field916[var62] += var98.field857;
                            this.field917[var62] += var98.field855;
                            this.field918[var62] += var98.field856;
                            this.field919[var62] += var98.field858;
                            var10002 = this.field920[var62]++;
                        }
                    }
                    int var99 = var59 - 5;
                    if (var99 >= 0 && var99 < this.field912) {
                        int var100 = this.field909[var5][var99][var62] & 0xFF;
                        if (var100 > 0) {
                            class21 var101 = class21.field848[var100 - 1];
                            this.field916[var62] -= var101.field857;
                            this.field917[var62] -= var101.field855;
                            this.field918[var62] -= var101.field856;
                            this.field919[var62] -= var101.field858;
                            var10002 = this.field920[var62]--;
                        }
                    }
                }
                if (var59 >= 1 && var59 < this.field912 - 1) {
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    int var67 = 0;
                    for (int var68 = -5; var68 < this.field913 + 5; var68++) {
                        int var69 = var68 + 5;
                        if (var69 >= 0 && var69 < this.field913) {
                            var63 += this.field916[var69];
                            var64 += this.field917[var69];
                            var65 += this.field918[var69];
                            var66 += this.field919[var69];
                            var67 += this.field920[var69];
                        }
                        int var70 = var68 - 5;
                        if (var70 >= 0 && var70 < this.field913) {
                            var63 -= this.field916[var70];
                            var64 -= this.field917[var70];
                            var65 -= this.field918[var70];
                            var66 -= this.field919[var70];
                            var67 -= this.field920[var70];
                        }
                        if (var68 >= 1 && var68 < this.field913 - 1 && (!field903 || (this.field895[0][var59][var68] & 0x2) != 0 || (this.field895[var5][var59][var68] & 0x10) == 0 && this.method318(var5, 33, var59, var68) == field896)) {
                            if (var5 < field911) {
                                field911 = var5;
                            }
                            int var71 = this.field909[var5][var59][var68] & 0xFF;
                            int var72 = this.field894[var5][var59][var68] & 0xFF;
                            if (var71 > 0 || var72 > 0) {
                                int var73 = this.field898[var5][var59][var68];
                                int var74 = this.field898[var5][var59 + 1][var68];
                                int var75 = this.field898[var5][var59 + 1][var68 + 1];
                                int var76 = this.field898[var5][var59][var68 + 1];
                                int var77 = this.field897[var59][var68];
                                int var78 = this.field897[var59 + 1][var68];
                                int var79 = this.field897[var59 + 1][var68 + 1];
                                int var80 = this.field897[var59][var68 + 1];
                                int var81 = -1;
                                int var82 = -1;
                                if (var71 > 0) {
                                    int var83 = var63 * 256 / var66;
                                    int var84 = var64 / var67;
                                    int var85 = var65 / var67;
                                    var81 = this.method313(var83, var84, var85);
                                    int var86 = field914 + var83 & 0xFF;
                                    int var87 = field892 + var85;
                                    if (var87 < 0) {
                                        var87 = 0;
                                    } else if (var87 > 255) {
                                        var87 = 255;
                                    }
                                    var82 = this.method313(var86, var84, var87);
                                }
                                if (var5 > 0) {
                                    boolean var88 = true;
                                    if (var71 == 0 && this.field910[var5][var59][var68] != 0) {
                                        var88 = false;
                                    }
                                    if (var72 > 0 && !class21.field848[var72 - 1].field853) {
                                        var88 = false;
                                    }
                                    if (var88 && var73 == var74 && var73 == var75 && var73 == var76) {
                                        this.field915[var5][var59][var68] |= 0x924;
                                    }
                                }
                                int var89 = 0;
                                if (var81 != -1) {
                                    var89 = class39.field1166[method323(var82, 96)];
                                }
                                if (var72 == 0) {
                                    arg1.method453(var5, var59, var68, 0, 0, -1, var73, var74, var75, var76, method323(var81, var77), method323(var81, var78), method323(var81, var79), method323(var81, var80), 0, 0, 0, 0, var89, 0);
                                } else {
                                    int var90 = this.field910[var5][var59][var68] + 1;
                                    byte var91 = this.field921[var5][var59][var68];
                                    class21 var92 = class21.field848[var72 - 1];
                                    int var93 = var92.field851;
                                    int var94;
                                    int var95;
                                    if (var93 >= 0) {
                                        var94 = class39.method408(var93, false);
                                        var95 = -1;
                                    } else if (var92.field850 == 16711935) {
                                        var95 = -2;
                                        var93 = -1;
                                        var94 = class39.field1166[this.method317(var92.field859, 96)];
                                    } else {
                                        var95 = this.method313(var92.field854, var92.field855, var92.field856);
                                        var94 = class39.field1166[this.method317(var92.field859, 96)];
                                    }
                                    arg1.method453(var5, var59, var68, var90, var91, var93, var73, var74, var75, var76, method323(var81, var77), method323(var81, var78), method323(var81, var79), method323(var81, var80), this.method317(var95, var77), this.method317(var95, var78), this.method317(var95, var79), this.method317(var95, var80), var89, var94);
                                }
                            }
                        }
                    }
                }
            }
            for (int var60 = 1; var60 < this.field913 - 1; var60++) {
                for (int var61 = 1; var61 < this.field912 - 1; var61++) {
                    arg1.method452(var5, var61, var60, this.method318(var5, 33, var61, var60));
                }
            }
        }
        if (arg2 != 9) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        arg1.method479(-50, -50, (byte) 33, -10);
        for (int var7 = 0; var7 < this.field912; var7++) {
            for (int var48 = 0; var48 < this.field913; var48++) {
                if ((this.field895[1][var7][var48] & 0x2) == 2) {
                    arg1.method450(var7, this.field899, var48);
                }
            }
        }
        int var8 = 1;
        int var9 = 2;
        int var10 = 4;
        for (int var11 = 0; var11 < 4; var11++) {
            if (var11 > 0) {
                var8 <<= 0x3;
                var9 <<= 0x3;
                var10 <<= 0x3;
            }
            for (int var12 = 0; var12 <= var11; var12++) {
                for (int var13 = 0; var13 <= this.field913; var13++) {
                    for (int var14 = 0; var14 <= this.field912; var14++) {
                        if ((this.field915[var12][var14][var13] & var8) != 0) {
                            int var15 = var13;
                            int var16 = var13;
                            int var17 = var12;
                            int var18 = var12;
                            while (var15 > 0 && (this.field915[var12][var14][var15 - 1] & var8) != 0) {
                                var15--;
                            }
                            while (var16 < this.field913 && (this.field915[var12][var14][var16 + 1] & var8) != 0) {
                                var16++;
                            }
                            label331: while (var17 > 0) {
                                for (int var19 = var15; var19 <= var16; var19++) {
                                    if ((this.field915[var17 - 1][var14][var19] & var8) == 0) {
                                        break label331;
                                    }
                                }
                                var17--;
                            }
                            label320: while (var18 < var11) {
                                for (int var20 = var15; var20 <= var16; var20++) {
                                    if ((this.field915[var18 + 1][var14][var20] & var8) == 0) {
                                        break label320;
                                    }
                                }
                                var18++;
                            }
                            int var21 = (var18 + 1 - var17) * (var16 + 1 - var15);
                            if (var21 >= 8) {
                                short var22 = 240;
                                int var23 = this.field898[var18][var14][var15] - var22;
                                int var24 = this.field898[var17][var14][var15];
                                class53.method451(var24, 1, var23, var11, var14 * 128, var15 * 128, 656, var14 * 128, var16 * 128 + 128);
                                for (int var25 = var17; var25 <= var18; var25++) {
                                    for (int var26 = var15; var26 <= var16; var26++) {
                                        this.field915[var25][var14][var26] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field915[var12][var14][var13] & var9) != 0) {
                            int var27 = var14;
                            int var28 = var14;
                            int var29 = var12;
                            int var30 = var12;
                            while (var27 > 0 && (this.field915[var12][var27 - 1][var13] & var9) != 0) {
                                var27--;
                            }
                            while (var28 < this.field912 && (this.field915[var12][var28 + 1][var13] & var9) != 0) {
                                var28++;
                            }
                            label384: while (var29 > 0) {
                                for (int var31 = var27; var31 <= var28; var31++) {
                                    if ((this.field915[var29 - 1][var31][var13] & var9) == 0) {
                                        break label384;
                                    }
                                }
                                var29--;
                            }
                            label373: while (var30 < var11) {
                                for (int var32 = var27; var32 <= var28; var32++) {
                                    if ((this.field915[var30 + 1][var32][var13] & var9) == 0) {
                                        break label373;
                                    }
                                }
                                var30++;
                            }
                            int var33 = (var30 + 1 - var29) * (var28 + 1 - var27);
                            if (var33 >= 8) {
                                short var34 = 240;
                                int var35 = this.field898[var30][var27][var13] - var34;
                                int var36 = this.field898[var29][var27][var13];
                                class53.method451(var36, 2, var35, var11, var27 * 128, var13 * 128, 656, var28 * 128 + 128, var13 * 128);
                                for (int var37 = var29; var37 <= var30; var37++) {
                                    for (int var38 = var27; var38 <= var28; var38++) {
                                        this.field915[var37][var38][var13] &= ~var9;
                                    }
                                }
                            }
                        }
                        if ((this.field915[var12][var14][var13] & var10) != 0) {
                            int var39 = var14;
                            int var40 = var14;
                            int var41 = var13;
                            int var42 = var13;
                            while (var41 > 0 && (this.field915[var12][var14][var41 - 1] & var10) != 0) {
                                var41--;
                            }
                            while (var42 < this.field913 && (this.field915[var12][var14][var42 + 1] & var10) != 0) {
                                var42++;
                            }
                            label437: while (var39 > 0) {
                                for (int var43 = var41; var43 <= var42; var43++) {
                                    if ((this.field915[var12][var39 - 1][var43] & var10) == 0) {
                                        break label437;
                                    }
                                }
                                var39--;
                            }
                            label426: while (var40 < this.field912) {
                                for (int var44 = var41; var44 <= var42; var44++) {
                                    if ((this.field915[var12][var40 + 1][var44] & var10) == 0) {
                                        break label426;
                                    }
                                }
                                var40++;
                            }
                            if ((var40 + 1 - var39) * (var42 + 1 - var41) >= 4) {
                                int var45 = this.field898[var12][var39][var41];
                                class53.method451(var45, 4, var45, var11, var39 * 128, var41 * 128, 656, var40 * 128 + 128, var42 * 128 + 128);
                                for (int var46 = var39; var46 <= var40; var46++) {
                                    for (int var47 = var41; var47 <= var42; var47++) {
                                        this.field915[var12][var46][var47] &= ~var10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(ZI[BI)Z")
    public static final boolean method310(boolean arg0, int arg1, byte[] arg2, int arg3) {
        boolean var4 = true;
        class10 var5 = new class10(arg2, field900);
        if (arg0) {
            field900 = -483;
        }
        int var6 = -1;
        label54: while (true) {
            int var7 = var5.method208();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method208();
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method194() >> 2;
                    int var15 = arg3 + var13;
                    int var16 = arg1 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class70 var17 = class70.method596(var6);
                        if (var14 != 22 || !field903 || var17.field1730 || var17.field1752) {
                            var4 &= var17.method590(false);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method208();
                if (var10 == 0) {
                    break;
                }
                var5.method194();
            }
        }
    }

    @OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(IILCMGGUSPR;ZIIII)V")
    private final void method311(int arg0, int arg1, class10 arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!arg3) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg1 < 0 || arg1 >= 104 || arg6 < 0 || arg6 >= 104) {
            while (true) {
                int var12 = arg2.method194();
                if (var12 == 0) {
                    return;
                }
                if (var12 == 1) {
                    arg2.method194();
                    return;
                }
                if (var12 <= 49) {
                    arg2.method194();
                }
            }
        }
        this.field895[arg0][arg1][arg6] = 0;
        while (true) {
            int var10 = arg2.method194();
            if (var10 == 0) {
                if (arg0 == 0) {
                    this.field898[0][arg1][arg6] = -method307(arg1 + arg4 + 932731, arg6 + 556238 + arg5) * 8;
                    return;
                } else {
                    this.field898[arg0][arg1][arg6] = this.field898[arg0 - 1][arg1][arg6] - 240;
                    return;
                }
            }
            if (var10 == 1) {
                int var11 = arg2.method194();
                if (var11 == 1) {
                    var11 = 0;
                }
                if (arg0 == 0) {
                    this.field898[0][arg1][arg6] = -var11 * 8;
                    return;
                }
                this.field898[arg0][arg1][arg6] = this.field898[arg0 - 1][arg1][arg6] - var11 * 8;
                return;
            }
            if (var10 <= 49) {
                this.field894[arg0][arg1][arg6] = arg2.method195();
                this.field910[arg0][arg1][arg6] = (byte) ((var10 - 2) / 4);
                this.field921[arg0][arg1][arg6] = (byte) (var10 + arg7 - 2 & 0x3);
            } else if (var10 <= 81) {
                this.field895[arg0][arg1][arg6] = (byte) (var10 - 49);
            } else {
                this.field909[arg0][arg1][arg6] = (byte) (var10 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!IPCPGCKM", name = "b", descriptor = "(II)I")
    private static final int method312(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(III)I")
    private final int method313(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(IIIILTCDQXHKB;II[LVLOWRGUJ;I[BI)V")
    public final void method314(int arg0, int arg1, int arg2, int arg3, class53 arg4, int arg5, int arg6, class61[] arg7, int arg8, byte[] arg9, int arg10) {
        if (arg6 >= 0) {
            return;
        }
        class10 var12 = new class10(arg9, field900);
        int var13 = -1;
        while (true) {
            int var14 = var12.method208();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method208();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method194();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg0 == var19 && var18 >= arg2 && var18 < arg2 + 8 && var17 >= arg5 && var17 < arg5 + 8) {
                    class70 var23 = class70.method596(var13);
                    int var24 = arg8 + class43.method428(arg10, var18 & 0x7, var23.field1735, var23.field1724, var17 & 0x7, var22, 30);
                    int var25 = arg3 + class43.method429(773, var23.field1724, var18 & 0x7, arg10, var22, var17 & 0x7, var23.field1735);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg1;
                        if ((this.field895[1][var24][var25] & 0x2) == 2) {
                            var26 = arg1 - 1;
                        }
                        class61 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg7[var26];
                        }
                        this.method308(-71, arg10 + var22 & 0x3, arg1, arg4, var13, var25, var21, var27, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!IPCPGCKM", name = "c", descriptor = "(II)I")
    private static final int method315(int arg0, int arg1) {
        int var2 = method312(arg0 - 1, arg1 - 1) + method312(arg0 + 1, arg1 - 1) + method312(arg0 - 1, arg1 + 1) + method312(arg0 + 1, arg1 + 1);
        int var3 = method312(arg0 - 1, arg1) + method312(arg0 + 1, arg1) + method312(arg0, arg1 - 1) + method312(arg0, arg1 + 1);
        int var4 = method312(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(IIBLTCDQXHKB;[LVLOWRGUJ;[B)V")
    public final void method316(int arg0, int arg1, byte arg2, class53 arg3, class61[] arg4, byte[] arg5) {
        class10 var7 = new class10(arg5, field900);
        int var8 = -1;
        if (arg2 != 3) {
            return;
        }
        while (true) {
            int var9 = var7.method208();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method208();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method194();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg0 + var13;
                int var19 = arg1 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field895[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class61 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg4[var20];
                    }
                    this.method308(-71, var17, var14, arg3, var8, var19, var16, var21, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!IPCPGCKM", name = "d", descriptor = "(II)I")
    private final int method317(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!IPCPGCKM", name = "<init>", descriptor = "(I[[[B[[[III)V")
    public class27(int arg0, byte[][][] arg1, int[][][] arg2, int arg3, int arg4) {
        field911 = 99;
        this.field912 = arg0;
        this.field913 = arg4;
        this.field898 = arg2;
        this.field895 = arg1;
        this.field909 = new byte[4][this.field912][this.field913];
        this.field894 = new byte[4][this.field912][this.field913];
        this.field910 = new byte[4][this.field912][this.field913];
        this.field921 = new byte[4][this.field912][this.field913];
        this.field915 = new int[4][this.field912 + 1][this.field913 + 1];
        this.field908 = new byte[4][this.field912 + 1][this.field913 + 1];
        this.field897 = new int[this.field912 + 1][this.field913 + 1];
        this.field916 = new int[this.field913];
        if (arg3 != 948) {
            this.field905 = -234;
        }
        this.field917 = new int[this.field913];
        this.field918 = new int[this.field913];
        this.field919 = new int[this.field913];
        this.field920 = new int[this.field913];
    }

    @OriginalMember(owner = "client!IPCPGCKM", name = "b", descriptor = "(IIII)I")
    public int method318(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 <= 0) {
            return 0;
        } else if ((this.field895[arg0][arg2][arg3] & 0x8) == 0) {
            return arg0 <= 0 || (this.field895[1][arg2][arg3] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(I[LVLOWRGUJ;II[BIIIII)V")
    public final void method319(int arg0, class61[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg0 + var11 > 0 && arg0 + var11 < 103 && arg9 + var16 > 0 && arg9 + var16 < 103) {
                    arg1[arg7].field1558[arg0 + var11][arg9 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class10 var12 = new class10(arg4, field900);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg8 == var13 && var14 >= arg5 && var14 < arg5 + 8 && var15 >= arg2 && var15 < arg2 + 8) {
                        this.method311(arg7, arg0 + class43.method426(var14 & 0x7, true, arg3, var15 & 0x7), var12, true, 0, 0, arg9 + class43.method427(arg3, -3564, var15 & 0x7, var14 & 0x7), arg3);
                    } else {
                        this.method311(0, -1, var12, true, 0, 0, -1, 0);
                    }
                }
            }
        }
        if (arg6 != 32496) {
            this.field907 = !this.field907;
        }
    }

    @OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "([LVLOWRGUJ;III[BII)V")
    public final void method320(class61[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        if (arg5 != 0) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg1 + var13 > 0 && arg1 + var13 < 103 && arg2 + var14 > 0 && arg2 + var14 < 103) {
                        arg0[var8].field1558[arg1 + var13][arg2 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class10 var9 = new class10(arg4, field900);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method311(var10, arg1 + var11, var9, true, arg3, arg6, arg2 + var12, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(IIIIZ)V")
    public final void method321(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            return;
        }
        for (int var6 = arg3; var6 <= arg0 + arg3; var6++) {
            for (int var7 = arg2; var7 <= arg1 + arg2; var7++) {
                if (var7 >= 0 && var7 < this.field912 && var6 >= 0 && var6 < this.field913) {
                    this.field908[0][var7][var6] = 127;
                    if (arg2 == var7 && var7 > 0) {
                        this.field898[0][var7][var6] = this.field898[0][var7 - 1][var6];
                    }
                    if (arg1 + arg2 == var7 && var7 < this.field912 - 1) {
                        this.field898[0][var7][var6] = this.field898[0][var7 + 1][var6];
                    }
                    if (arg3 == var6 && var6 > 0) {
                        this.field898[0][var7][var6] = this.field898[0][var7][var6 - 1];
                    }
                    if (arg0 + arg3 == var6 && var6 < this.field913 - 1) {
                        this.field898[0][var7][var6] = this.field898[0][var7][var6 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!IPCPGCKM", name = "c", descriptor = "(IIII)V")
    public final void method322(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < 8; var5++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.field898[arg2][arg3 + var5][arg0 + var8] = 0;
            }
        }
        if (arg1 < 9 || arg1 > 9) {
            this.field905 = 309;
        }
        if (arg3 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                this.field898[arg2][arg3][arg0 + var6] = this.field898[arg2][arg3 - 1][arg0 + var6];
            }
        }
        if (arg0 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                this.field898[arg2][arg3 + var7][arg0] = this.field898[arg2][arg3 + var7][arg0 - 1];
            }
        }
        if (arg3 > 0 && this.field898[arg2][arg3 - 1][arg0] != 0) {
            this.field898[arg2][arg3][arg0] = this.field898[arg2][arg3 - 1][arg0];
        } else if (arg0 > 0 && this.field898[arg2][arg3][arg0 - 1] != 0) {
            this.field898[arg2][arg3][arg0] = this.field898[arg2][arg3][arg0 - 1];
        } else if (arg3 > 0 && arg0 > 0 && this.field898[arg2][arg3 - 1][arg0 - 1] != 0) {
            this.field898[arg2][arg3][arg0] = this.field898[arg2][arg3 - 1][arg0 - 1];
        }
    }

    @OriginalMember(owner = "client!IPCPGCKM", name = "e", descriptor = "(II)I")
    private static final int method323(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(ZII)Z")
    public static final boolean method324(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            throw new NullPointerException();
        }
        class70 var3 = class70.method596(arg2);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method586(arg1, true);
    }

    @OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(LCMGGUSPR;LUCDUMMGN;I)V")
    public static final void method325(class10 arg0, class58 arg1, int arg2) {
        if (arg2 >= 0) {
            return;
        }
        int var3 = -1;
        while (true) {
            int var4 = arg0.method208();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class70 var5 = class70.method596(var3);
            var5.method589(8, arg1);
            while (true) {
                int var6 = arg0.method208();
                if (var6 == 0) {
                    break;
                }
                arg0.method194();
            }
        }
    }

    @OriginalMember(owner = "client!IPCPGCKM", name = "b", descriptor = "(III)I")
    private static final int method326(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method315(var3, var5);
        int var8 = method315(var3 + 1, var5);
        int var9 = method315(var3, var5 + 1);
        int var10 = method315(var3 + 1, var5 + 1);
        int var11 = method305(var7, var8, var4, arg2);
        int var12 = method305(var9, var10, var4, arg2);
        return method305(var11, var12, var6, arg2);
    }
}
