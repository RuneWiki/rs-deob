import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EZVBBZYG")
public class class16 {

    @OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "Z")
    private boolean field854 = false;

    @OriginalMember(owner = "client!EZVBBZYG", name = "d", descriptor = "I")
    private int field857 = -949;

    @OriginalMember(owner = "client!EZVBBZYG", name = "g", descriptor = "Z")
    private boolean field860 = false;

    @OriginalMember(owner = "client!EZVBBZYG", name = "k", descriptor = "B")
    private byte field864 = 7;

    @OriginalMember(owner = "client!EZVBBZYG", name = "y", descriptor = "I")
    private int field878 = 486;

    @OriginalMember(owner = "client!EZVBBZYG", name = "E", descriptor = "I")
    private int field884;

    @OriginalMember(owner = "client!EZVBBZYG", name = "F", descriptor = "I")
    private int field885;

    @OriginalMember(owner = "client!EZVBBZYG", name = "c", descriptor = "[[[I")
    private int[][][] field856;

    @OriginalMember(owner = "client!EZVBBZYG", name = "m", descriptor = "[[[B")
    private byte[][][] field866;

    @OriginalMember(owner = "client!EZVBBZYG", name = "f", descriptor = "[[[B")
    private byte[][][] field859;

    @OriginalMember(owner = "client!EZVBBZYG", name = "o", descriptor = "[[[B")
    private byte[][][] field868;

    @OriginalMember(owner = "client!EZVBBZYG", name = "z", descriptor = "[[[B")
    private byte[][][] field879;

    @OriginalMember(owner = "client!EZVBBZYG", name = "p", descriptor = "[[[B")
    private byte[][][] field869;

    @OriginalMember(owner = "client!EZVBBZYG", name = "A", descriptor = "[[[I")
    private int[][][] field880;

    @OriginalMember(owner = "client!EZVBBZYG", name = "e", descriptor = "[[[B")
    private byte[][][] field858;

    @OriginalMember(owner = "client!EZVBBZYG", name = "i", descriptor = "[[I")
    private int[][] field862;

    @OriginalMember(owner = "client!EZVBBZYG", name = "t", descriptor = "[I")
    private int[] field873;

    @OriginalMember(owner = "client!EZVBBZYG", name = "u", descriptor = "[I")
    private int[] field874;

    @OriginalMember(owner = "client!EZVBBZYG", name = "v", descriptor = "[I")
    private int[] field875;

    @OriginalMember(owner = "client!EZVBBZYG", name = "w", descriptor = "[I")
    private int[] field876;

    @OriginalMember(owner = "client!EZVBBZYG", name = "x", descriptor = "[I")
    private int[] field877;

    @OriginalMember(owner = "client!EZVBBZYG", name = "b", descriptor = "[I")
    private static final int[] field855 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!EZVBBZYG", name = "h", descriptor = "[I")
    private static final int[] field861 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!EZVBBZYG", name = "j", descriptor = "I")
    private static int field863 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!EZVBBZYG", name = "l", descriptor = "Z")
    public static boolean field865 = true;

    @OriginalMember(owner = "client!EZVBBZYG", name = "q", descriptor = "I")
    private static int field870 = 279;

    @OriginalMember(owner = "client!EZVBBZYG", name = "r", descriptor = "I")
    private static int field871 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!EZVBBZYG", name = "s", descriptor = "[I")
    private static final int[] field872 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!EZVBBZYG", name = "B", descriptor = "I")
    private static int field881 = -828;

    @OriginalMember(owner = "client!EZVBBZYG", name = "C", descriptor = "I")
    private static int field882 = 4;

    @OriginalMember(owner = "client!EZVBBZYG", name = "D", descriptor = "I")
    public static int field883 = 99;

    @OriginalMember(owner = "client!EZVBBZYG", name = "G", descriptor = "[I")
    private static final int[] field886 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!EZVBBZYG", name = "n", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(II)I")
    private static final int method254(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "([LCRVZDSLK;IIIIIBI[BLRHXAQRFP;I)V")
    public final void method255(class5[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, byte[] arg8, class48 arg9, int arg10) {
        class32 var12 = new class32((byte) 114, arg8);
        int var13 = -1;
        if (this.field864 != arg6) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        while (true) {
            int var15 = var12.method383();
            if (var15 == 0) {
                return;
            }
            var13 += var15;
            int var16 = 0;
            while (true) {
                int var17 = var12.method383();
                if (var17 == 0) {
                    break;
                }
                var16 += var17 - 1;
                int var18 = var16 & 0x3F;
                int var19 = var16 >> 6 & 0x3F;
                int var20 = var16 >> 12;
                int var21 = var12.method369();
                int var22 = var21 >> 2;
                int var23 = var21 & 0x3;
                if (arg4 == var20 && var19 >= arg2 && var19 < arg2 + 8 && var18 >= arg10 && var18 < arg10 + 8) {
                    class34 var24 = class34.method409(var13);
                    int var25 = arg1 + class30.method355(-18423, var19 & 0x7, var24.field1106, var18 & 0x7, arg7, var24.field1085, var23);
                    int var26 = arg3 + class30.method356(arg7, var18 & 0x7, var23, var19 & 0x7, -447, var24.field1106, var24.field1085);
                    if (var25 > 0 && var26 > 0 && var25 < 103 && var26 < 103) {
                        int var27 = arg5;
                        if ((this.field866[1][var25][var26] & 0x2) == 2) {
                            var27 = arg5 - 1;
                        }
                        class5 var28 = null;
                        if (var27 >= 0) {
                            var28 = arg0[var27];
                        }
                        this.method256(arg7 + var23 & 0x3, (byte) 2, var25, var13, var28, var26, arg5, arg9, var22);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(IBIILCRVZDSLK;IILRHXAQRFP;I)V")
    private final void method256(int arg0, byte arg1, int arg2, int arg3, class5 arg4, int arg5, int arg6, class48 arg7, int arg8) {
        if (arg1 != 2) {
            this.field860 = !this.field860;
        }
        if (field865 && (this.field866[0][arg2][arg5] & 0x2) == 0) {
            if ((this.field866[arg6][arg2][arg5] & 0x10) != 0) {
                return;
            }
            if (this.method274(arg2, arg5, arg6, 0) != field867) {
                return;
            }
        }
        if (arg6 < field883) {
            field883 = arg6;
        }
        int var10 = this.field856[arg6][arg2][arg5];
        int var11 = this.field856[arg6][arg2 + 1][arg5];
        int var12 = this.field856[arg6][arg2 + 1][arg5 + 1];
        int var13 = this.field856[arg6][arg2][arg5 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class34 var15 = class34.method409(arg3);
        int var16 = (arg3 << 14) + (arg5 << 7) + arg2 + 1073741824;
        if (!var15.field1078) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg0 << 6) + arg8);
        if (arg8 == 22) {
            if (!field865 || var15.field1078 || var15.field1079) {
                class53 var18;
                if (var15.field1105 == -1 && var15.field1082 == null) {
                    var18 = var15.method419(22, arg0, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class11(var11, var15.field1105, var13, arg0, var10, 22, true, arg3, var12, false);
                }
                arg7.method477(var18, (byte) 7, arg5, arg6, var16, arg2, var17, var14);
                if (var15.field1064 && var15.field1078 && arg4 != null) {
                    arg4.method160(arg2, field882, arg5);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class53 var38;
            if (var15.field1105 == -1 && var15.field1082 == null) {
                var38 = var15.method419(10, arg0, var10, var11, var12, var13, -1);
            } else {
                var38 = new class11(var11, var15.field1105, var13, arg0, var10, 10, true, arg3, var12, false);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg8 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg0 == 1 || arg0 == 3) {
                    var40 = var15.field1106;
                    var41 = var15.field1085;
                } else {
                    var40 = var15.field1085;
                    var41 = var15.field1106;
                }
                if (arg7.method481(var41, var38, var40, var16, var14, var39, var17, arg6, 704, arg5, arg2) && var15.field1069) {
                    class8 var42;
                    if (var38 instanceof class8) {
                        var42 = (class8) var38;
                    } else {
                        var42 = var15.method419(10, arg0, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field643 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field858[arg6][arg2 + var43][arg5 + var44]) {
                                    this.field858[arg6][arg2 + var43][arg5 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1064 && arg4 != null) {
                arg4.method159(arg2, arg0, var15.field1085, 0, var15.field1106, var15.field1077, arg5);
            }
        } else if (arg8 >= 12) {
            class53 var19;
            if (var15.field1105 == -1 && var15.field1082 == null) {
                var19 = var15.method419(arg8, arg0, var10, var11, var12, var13, -1);
            } else {
                var19 = new class11(var11, var15.field1105, var13, arg0, var10, arg8, true, arg3, var12, false);
            }
            arg7.method481(1, var19, 1, var16, var14, 0, var17, arg6, 704, arg5, arg2);
            if (arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg6 > 0) {
                this.field880[arg6][arg2][arg5] |= 0x924;
            }
            if (var15.field1064 && arg4 != null) {
                arg4.method159(arg2, arg0, var15.field1085, 0, var15.field1106, var15.field1077, arg5);
            }
        } else if (arg8 == 0) {
            class53 var20;
            if (var15.field1105 == -1 && var15.field1082 == null) {
                var20 = var15.method419(0, arg0, var10, var11, var12, var13, -1);
            } else {
                var20 = new class11(var11, var15.field1105, var13, arg0, var10, 0, true, arg3, var12, false);
            }
            arg7.method479(arg6, 0, arg5, null, field855[arg0], 0, var14, var16, var20, var17, arg2);
            if (arg0 == 0) {
                if (var15.field1069) {
                    this.field858[arg6][arg2][arg5] = 50;
                    this.field858[arg6][arg2][arg5 + 1] = 50;
                }
                if (var15.field1099) {
                    this.field880[arg6][arg2][arg5] |= 0x249;
                }
            } else if (arg0 == 1) {
                if (var15.field1069) {
                    this.field858[arg6][arg2][arg5 + 1] = 50;
                    this.field858[arg6][arg2 + 1][arg5 + 1] = 50;
                }
                if (var15.field1099) {
                    this.field880[arg6][arg2][arg5 + 1] |= 0x492;
                }
            } else if (arg0 == 2) {
                if (var15.field1069) {
                    this.field858[arg6][arg2 + 1][arg5] = 50;
                    this.field858[arg6][arg2 + 1][arg5 + 1] = 50;
                }
                if (var15.field1099) {
                    this.field880[arg6][arg2 + 1][arg5] |= 0x249;
                }
            } else if (arg0 == 3) {
                if (var15.field1069) {
                    this.field858[arg6][arg2][arg5] = 50;
                    this.field858[arg6][arg2 + 1][arg5] = 50;
                }
                if (var15.field1099) {
                    this.field880[arg6][arg2][arg5] |= 0x492;
                }
            }
            if (var15.field1064 && arg4 != null) {
                arg4.method158(arg0, var15.field1077, (byte) 41, arg5, arg8, arg2);
            }
            if (var15.field1075 != 16) {
                arg7.method487(var15.field1075, arg2, arg5, arg6, 8);
            }
        } else if (arg8 == 1) {
            class53 var21;
            if (var15.field1105 == -1 && var15.field1082 == null) {
                var21 = var15.method419(1, arg0, var10, var11, var12, var13, -1);
            } else {
                var21 = new class11(var11, var15.field1105, var13, arg0, var10, 1, true, arg3, var12, false);
            }
            arg7.method479(arg6, 0, arg5, null, field872[arg0], 0, var14, var16, var21, var17, arg2);
            if (var15.field1069) {
                if (arg0 == 0) {
                    this.field858[arg6][arg2][arg5 + 1] = 50;
                } else if (arg0 == 1) {
                    this.field858[arg6][arg2 + 1][arg5 + 1] = 50;
                } else if (arg0 == 2) {
                    this.field858[arg6][arg2 + 1][arg5] = 50;
                } else if (arg0 == 3) {
                    this.field858[arg6][arg2][arg5] = 50;
                }
            }
            if (var15.field1064 && arg4 != null) {
                arg4.method158(arg0, var15.field1077, (byte) 41, arg5, arg8, arg2);
            }
        } else if (arg8 == 2) {
            int var22 = arg0 + 1 & 0x3;
            class53 var23;
            class53 var24;
            if (var15.field1105 == -1 && var15.field1082 == null) {
                var23 = var15.method419(2, arg0 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method419(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class11(var11, var15.field1105, var13, arg0 + 4, var10, 2, true, arg3, var12, false);
                var24 = new class11(var11, var15.field1105, var13, var22, var10, 2, true, arg3, var12, false);
            }
            arg7.method479(arg6, field855[var22], arg5, var24, field855[arg0], 0, var14, var16, var23, var17, arg2);
            if (var15.field1099) {
                if (arg0 == 0) {
                    this.field880[arg6][arg2][arg5] |= 0x249;
                    this.field880[arg6][arg2][arg5 + 1] |= 0x492;
                } else if (arg0 == 1) {
                    this.field880[arg6][arg2][arg5 + 1] |= 0x492;
                    this.field880[arg6][arg2 + 1][arg5] |= 0x249;
                } else if (arg0 == 2) {
                    this.field880[arg6][arg2 + 1][arg5] |= 0x249;
                    this.field880[arg6][arg2][arg5] |= 0x492;
                } else if (arg0 == 3) {
                    this.field880[arg6][arg2][arg5] |= 0x492;
                    this.field880[arg6][arg2][arg5] |= 0x249;
                }
            }
            if (var15.field1064 && arg4 != null) {
                arg4.method158(arg0, var15.field1077, (byte) 41, arg5, arg8, arg2);
            }
            if (var15.field1075 != 16) {
                arg7.method487(var15.field1075, arg2, arg5, arg6, 8);
            }
        } else if (arg8 == 3) {
            class53 var25;
            if (var15.field1105 == -1 && var15.field1082 == null) {
                var25 = var15.method419(3, arg0, var10, var11, var12, var13, -1);
            } else {
                var25 = new class11(var11, var15.field1105, var13, arg0, var10, 3, true, arg3, var12, false);
            }
            arg7.method479(arg6, 0, arg5, null, field872[arg0], 0, var14, var16, var25, var17, arg2);
            if (var15.field1069) {
                if (arg0 == 0) {
                    this.field858[arg6][arg2][arg5 + 1] = 50;
                } else if (arg0 == 1) {
                    this.field858[arg6][arg2 + 1][arg5 + 1] = 50;
                } else if (arg0 == 2) {
                    this.field858[arg6][arg2 + 1][arg5] = 50;
                } else if (arg0 == 3) {
                    this.field858[arg6][arg2][arg5] = 50;
                }
            }
            if (var15.field1064 && arg4 != null) {
                arg4.method158(arg0, var15.field1077, (byte) 41, arg5, arg8, arg2);
            }
        } else if (arg8 == 9) {
            class53 var26;
            if (var15.field1105 == -1 && var15.field1082 == null) {
                var26 = var15.method419(arg8, arg0, var10, var11, var12, var13, -1);
            } else {
                var26 = new class11(var11, var15.field1105, var13, arg0, var10, arg8, true, arg3, var12, false);
            }
            arg7.method481(1, var26, 1, var16, var14, 0, var17, arg6, 704, arg5, arg2);
            if (var15.field1064 && arg4 != null) {
                arg4.method159(arg2, arg0, var15.field1085, 0, var15.field1106, var15.field1077, arg5);
            }
        } else {
            if (var15.field1111) {
                if (arg0 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg0 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg0 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg8 == 4) {
                class53 var31;
                if (var15.field1105 == -1 && var15.field1082 == null) {
                    var31 = var15.method419(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class11(var11, var15.field1105, var13, 0, var10, 4, true, arg3, var12, false);
                }
                arg7.method480(var14, var31, 0, arg5, field855[arg0], var17, 0, var16, arg6, (byte) -93, arg0 * 512, arg2);
            } else if (arg8 == 5) {
                int var32 = 16;
                int var33 = arg7.method497(arg6, arg2, arg5);
                if (var33 > 0) {
                    var32 = class34.method409(var33 >> 14 & 0x7FFF).field1075;
                }
                class53 var34;
                if (var15.field1105 == -1 && var15.field1082 == null) {
                    var34 = var15.method419(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class11(var11, var15.field1105, var13, 0, var10, 4, true, arg3, var12, false);
                }
                arg7.method480(var14, var34, field886[arg0] * var32, arg5, field855[arg0], var17, field861[arg0] * var32, var16, arg6, (byte) -93, arg0 * 512, arg2);
            } else if (arg8 == 6) {
                class53 var35;
                if (var15.field1105 == -1 && var15.field1082 == null) {
                    var35 = var15.method419(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class11(var11, var15.field1105, var13, 0, var10, 4, true, arg3, var12, false);
                }
                arg7.method480(var14, var35, 0, arg5, 256, var17, 0, var16, arg6, (byte) -93, arg0, arg2);
            } else if (arg8 == 7) {
                class53 var36;
                if (var15.field1105 == -1 && var15.field1082 == null) {
                    var36 = var15.method419(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class11(var11, var15.field1105, var13, 0, var10, 4, true, arg3, var12, false);
                }
                arg7.method480(var14, var36, 0, arg5, 512, var17, 0, var16, arg6, (byte) -93, arg0, arg2);
            } else if (arg8 == 8) {
                class53 var37;
                if (var15.field1105 == -1 && var15.field1082 == null) {
                    var37 = var15.method419(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class11(var11, var15.field1105, var13, 0, var10, 4, true, arg3, var12, false);
                }
                arg7.method480(var14, var37, 0, arg5, 768, var17, 0, var16, arg6, (byte) -93, arg0, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(I[[[IZIIILCRVZDSLK;IILRHXAQRFP;I)V")
    public static final void method257(int arg0, int[][][] arg1, boolean arg2, int arg3, int arg4, int arg5, class5 arg6, int arg7, int arg8, class48 arg9, int arg10) {
        int var11 = arg1[arg4][arg10][arg7];
        int var12 = arg1[arg4][arg10 + 1][arg7];
        int var13 = arg1[arg4][arg10 + 1][arg7 + 1];
        int var14 = arg1[arg4][arg10][arg7 + 1];
        if (!arg2) {
            field881 = 166;
        }
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class34 var16 = class34.method409(arg8);
        int var17 = (arg8 << 14) + (arg7 << 7) + arg10 + 1073741824;
        if (!var16.field1078) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg0 << 6) + arg5);
        if (arg5 == 22) {
            class53 var19;
            if (var16.field1105 == -1 && var16.field1082 == null) {
                var19 = var16.method419(22, arg0, var11, var12, var13, var14, -1);
            } else {
                var19 = new class11(var12, var16.field1105, var14, arg0, var11, 22, true, arg8, var13, false);
            }
            arg9.method477(var19, (byte) 7, arg7, arg3, var17, arg10, var18, var15);
            if (var16.field1064 && var16.field1078) {
                arg6.method160(arg10, field882, arg7);
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class53 var39;
            if (var16.field1105 == -1 && var16.field1082 == null) {
                var39 = var16.method419(10, arg0, var11, var12, var13, var14, -1);
            } else {
                var39 = new class11(var12, var16.field1105, var14, arg0, var11, 10, true, arg8, var13, false);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg5 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg0 == 1 || arg0 == 3) {
                    var41 = var16.field1106;
                    var42 = var16.field1085;
                } else {
                    var41 = var16.field1085;
                    var42 = var16.field1106;
                }
                arg9.method481(var42, var39, var41, var17, var15, var40, var18, arg3, 704, arg7, arg10);
            }
            if (var16.field1064) {
                arg6.method159(arg10, arg0, var16.field1085, 0, var16.field1106, var16.field1077, arg7);
            }
        } else if (arg5 >= 12) {
            class53 var20;
            if (var16.field1105 == -1 && var16.field1082 == null) {
                var20 = var16.method419(arg5, arg0, var11, var12, var13, var14, -1);
            } else {
                var20 = new class11(var12, var16.field1105, var14, arg0, var11, arg5, true, arg8, var13, false);
            }
            arg9.method481(1, var20, 1, var17, var15, 0, var18, arg3, 704, arg7, arg10);
            if (var16.field1064) {
                arg6.method159(arg10, arg0, var16.field1085, 0, var16.field1106, var16.field1077, arg7);
            }
        } else if (arg5 == 0) {
            class53 var21;
            if (var16.field1105 == -1 && var16.field1082 == null) {
                var21 = var16.method419(0, arg0, var11, var12, var13, var14, -1);
            } else {
                var21 = new class11(var12, var16.field1105, var14, arg0, var11, 0, true, arg8, var13, false);
            }
            arg9.method479(arg3, 0, arg7, null, field855[arg0], 0, var15, var17, var21, var18, arg10);
            if (var16.field1064) {
                arg6.method158(arg0, var16.field1077, (byte) 41, arg7, arg5, arg10);
            }
        } else if (arg5 == 1) {
            class53 var22;
            if (var16.field1105 == -1 && var16.field1082 == null) {
                var22 = var16.method419(1, arg0, var11, var12, var13, var14, -1);
            } else {
                var22 = new class11(var12, var16.field1105, var14, arg0, var11, 1, true, arg8, var13, false);
            }
            arg9.method479(arg3, 0, arg7, null, field872[arg0], 0, var15, var17, var22, var18, arg10);
            if (var16.field1064) {
                arg6.method158(arg0, var16.field1077, (byte) 41, arg7, arg5, arg10);
            }
        } else if (arg5 == 2) {
            int var23 = arg0 + 1 & 0x3;
            class53 var24;
            class53 var25;
            if (var16.field1105 == -1 && var16.field1082 == null) {
                var24 = var16.method419(2, arg0 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method419(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class11(var12, var16.field1105, var14, arg0 + 4, var11, 2, true, arg8, var13, false);
                var25 = new class11(var12, var16.field1105, var14, var23, var11, 2, true, arg8, var13, false);
            }
            arg9.method479(arg3, field855[var23], arg7, var25, field855[arg0], 0, var15, var17, var24, var18, arg10);
            if (var16.field1064) {
                arg6.method158(arg0, var16.field1077, (byte) 41, arg7, arg5, arg10);
            }
        } else if (arg5 == 3) {
            class53 var26;
            if (var16.field1105 == -1 && var16.field1082 == null) {
                var26 = var16.method419(3, arg0, var11, var12, var13, var14, -1);
            } else {
                var26 = new class11(var12, var16.field1105, var14, arg0, var11, 3, true, arg8, var13, false);
            }
            arg9.method479(arg3, 0, arg7, null, field872[arg0], 0, var15, var17, var26, var18, arg10);
            if (var16.field1064) {
                arg6.method158(arg0, var16.field1077, (byte) 41, arg7, arg5, arg10);
            }
        } else if (arg5 == 9) {
            class53 var27;
            if (var16.field1105 == -1 && var16.field1082 == null) {
                var27 = var16.method419(arg5, arg0, var11, var12, var13, var14, -1);
            } else {
                var27 = new class11(var12, var16.field1105, var14, arg0, var11, arg5, true, arg8, var13, false);
            }
            arg9.method481(1, var27, 1, var17, var15, 0, var18, arg3, 704, arg7, arg10);
            if (var16.field1064) {
                arg6.method159(arg10, arg0, var16.field1085, 0, var16.field1106, var16.field1077, arg7);
            }
        } else {
            if (var16.field1111) {
                if (arg0 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg0 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg0 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg5 == 4) {
                class53 var32;
                if (var16.field1105 == -1 && var16.field1082 == null) {
                    var32 = var16.method419(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class11(var12, var16.field1105, var14, 0, var11, 4, true, arg8, var13, false);
                }
                arg9.method480(var15, var32, 0, arg7, field855[arg0], var18, 0, var17, arg3, (byte) -93, arg0 * 512, arg10);
            } else if (arg5 == 5) {
                int var33 = 16;
                int var34 = arg9.method497(arg3, arg10, arg7);
                if (var34 > 0) {
                    var33 = class34.method409(var34 >> 14 & 0x7FFF).field1075;
                }
                class53 var35;
                if (var16.field1105 == -1 && var16.field1082 == null) {
                    var35 = var16.method419(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class11(var12, var16.field1105, var14, 0, var11, 4, true, arg8, var13, false);
                }
                arg9.method480(var15, var35, field886[arg0] * var33, arg7, field855[arg0], var18, field861[arg0] * var33, var17, arg3, (byte) -93, arg0 * 512, arg10);
            } else if (arg5 == 6) {
                class53 var36;
                if (var16.field1105 == -1 && var16.field1082 == null) {
                    var36 = var16.method419(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class11(var12, var16.field1105, var14, 0, var11, 4, true, arg8, var13, false);
                }
                arg9.method480(var15, var36, 0, arg7, 256, var18, 0, var17, arg3, (byte) -93, arg0, arg10);
            } else if (arg5 == 7) {
                class53 var37;
                if (var16.field1105 == -1 && var16.field1082 == null) {
                    var37 = var16.method419(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class11(var12, var16.field1105, var14, 0, var11, 4, true, arg8, var13, false);
                }
                arg9.method480(var15, var37, 0, arg7, 512, var18, 0, var17, arg3, (byte) -93, arg0, arg10);
            } else if (arg5 == 8) {
                class53 var38;
                if (var16.field1105 == -1 && var16.field1082 == null) {
                    var38 = var16.method419(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class11(var12, var16.field1105, var14, 0, var11, 4, true, arg8, var13, false);
                }
                arg9.method480(var15, var38, 0, arg7, 768, var18, 0, var17, arg3, (byte) -93, arg0, arg10);
            }
        }
    }

    @OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(III)I")
    private static final int method258(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method262(var3, var5);
        int var8 = method262(var3 + 1, var5);
        int var9 = method262(var3, var5 + 1);
        int var10 = method262(var3 + 1, var5 + 1);
        int var11 = method263(var7, var8, var4, arg2);
        int var12 = method263(var9, var10, var4, arg2);
        return method263(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(I[LCRVZDSLK;[BIIIIIII)V")
    public final void method259(int arg0, class5[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        while (arg6 >= 0) {
            this.field854 = !this.field854;
        }
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg9 + var11 > 0 && arg9 + var11 < 103 && arg5 + var16 > 0 && arg5 + var16 < 103) {
                    arg1[arg8].field575[arg9 + var11][arg5 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class32 var12 = new class32((byte) 114, arg2);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg4 == var13 && var14 >= arg3 && var14 < arg3 + 8 && var15 >= arg0 && var15 < arg0 + 8) {
                        this.method267(0, arg7, arg9 + class30.method353(var15 & 0x7, arg7, var14 & 0x7, (byte) 9), 0, false, var12, arg5 + class30.method354(var14 & 0x7, 121, arg7, var15 & 0x7), arg8);
                    } else {
                        this.method267(0, 0, -1, 0, false, var12, -1, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(LEBLTOQBO;BLLBBVYYXO;)V")
    public static final void method260(class12 arg0, byte arg1, class32 arg2) {
        if (arg1 == 3) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = -1;
        while (true) {
            int var6 = arg2.method383();
            if (var6 == 0) {
                return;
            }
            var5 += var6;
            class34 var7 = class34.method409(var5);
            var7.method418((byte) 1, arg0);
            while (true) {
                int var8 = arg2.method383();
                if (var8 == 0) {
                    break;
                }
                arg2.method369();
            }
        }
    }

    @OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(ZIII)V")
    public final void method261(boolean arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < 8; var5++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.field856[arg1][arg3 + var5][arg2 + var8] = 0;
            }
        }
        if (arg0) {
            this.field878 = -209;
        }
        if (arg3 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                this.field856[arg1][arg3][arg2 + var6] = this.field856[arg1][arg3 - 1][arg2 + var6];
            }
        }
        if (arg2 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                this.field856[arg1][arg3 + var7][arg2] = this.field856[arg1][arg3 + var7][arg2 - 1];
            }
        }
        if (arg3 > 0 && this.field856[arg1][arg3 - 1][arg2] != 0) {
            this.field856[arg1][arg3][arg2] = this.field856[arg1][arg3 - 1][arg2];
        } else if (arg2 > 0 && this.field856[arg1][arg3][arg2 - 1] != 0) {
            this.field856[arg1][arg3][arg2] = this.field856[arg1][arg3][arg2 - 1];
        } else if (arg3 > 0 && arg2 > 0 && this.field856[arg1][arg3 - 1][arg2 - 1] != 0) {
            this.field856[arg1][arg3][arg2] = this.field856[arg1][arg3 - 1][arg2 - 1];
        }
    }

    @OriginalMember(owner = "client!EZVBBZYG", name = "b", descriptor = "(II)I")
    private static final int method262(int arg0, int arg1) {
        int var2 = method265(arg0 - 1, arg1 - 1) + method265(arg0 + 1, arg1 - 1) + method265(arg0 - 1, arg1 + 1) + method265(arg0 + 1, arg1 + 1);
        int var3 = method265(arg0 - 1, arg1) + method265(arg0 + 1, arg1) + method265(arg0, arg1 - 1) + method265(arg0, arg1 + 1);
        int var4 = method265(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(IIII)I")
    private static final int method263(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class6.field588[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "client!EZVBBZYG", name = "b", descriptor = "(III)Z")
    public static final boolean method264(int arg0, int arg1, int arg2) {
        class34 var3 = class34.method409(arg1);
        if (arg2 != 0) {
            throw new NullPointerException();
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method410(0, arg0);
    }

    @OriginalMember(owner = "client!EZVBBZYG", name = "c", descriptor = "(II)I")
    private static final int method265(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method266(int arg0, int arg1, byte[] arg2, int arg3) {
        boolean var4 = true;
        class32 var5 = new class32((byte) 114, arg2);
        int var6 = -1;
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        label52: while (true) {
            int var7 = var5.method383();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method383();
                    if (var11 == 0) {
                        continue label52;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method369() >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg3 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class34 var17 = class34.method409(var6);
                        if (var14 != 22 || !field865 || var17.field1078 || var17.field1079) {
                            var4 &= var17.method417(field870);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method383();
                if (var10 == 0) {
                    break;
                }
                var5.method369();
            }
        }
    }

    @OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(IIIIZLLBBVYYXO;II)V")
    private final void method267(int arg0, int arg1, int arg2, int arg3, boolean arg4, class32 arg5, int arg6, int arg7) {
        if (arg4) {
            this.field878 = -227;
        }
        if (arg2 < 0 || arg2 >= 104 || arg6 < 0 || arg6 >= 104) {
            while (true) {
                int var11 = arg5.method369();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg5.method369();
                    return;
                }
                if (var11 <= 49) {
                    arg5.method369();
                }
            }
        }
        this.field866[arg7][arg2][arg6] = 0;
        while (true) {
            int var9 = arg5.method369();
            if (var9 == 0) {
                if (arg7 == 0) {
                    this.field856[0][arg2][arg6] = -method269(arg2 + arg3 + 932731, arg6 + 556238 + arg0) * 8;
                    return;
                } else {
                    this.field856[arg7][arg2][arg6] = this.field856[arg7 - 1][arg2][arg6] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg5.method369();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg7 == 0) {
                    this.field856[0][arg2][arg6] = -var10 * 8;
                    return;
                }
                this.field856[arg7][arg2][arg6] = this.field856[arg7 - 1][arg2][arg6] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field868[arg7][arg2][arg6] = arg5.method370();
                this.field879[arg7][arg2][arg6] = (byte) ((var9 - 2) / 4);
                this.field869[arg7][arg2][arg6] = (byte) (var9 + arg1 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field866[arg7][arg2][arg6] = (byte) (var9 - 49);
            } else {
                this.field859[arg7][arg2][arg6] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(IZILRHXAQRFP;[B[LCRVZDSLK;)V")
    public final void method268(int arg0, boolean arg1, int arg2, class48 arg3, byte[] arg4, class5[] arg5) {
        class32 var7 = new class32((byte) 114, arg4);
        int var8 = -1;
        if (arg1) {
            return;
        }
        while (true) {
            int var9 = var7.method383();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method383();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method369();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg0 + var13;
                int var19 = arg2 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field866[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class5 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg5[var20];
                    }
                    this.method256(var17, (byte) 2, var18, var8, var21, var19, var14, arg3, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!EZVBBZYG", name = "<init>", descriptor = "([[[BI[[[III)V")
    public class16(byte[][][] arg0, int arg1, int[][][] arg2, int arg3, int arg4) {
        field883 = 99;
        this.field884 = arg3;
        this.field885 = arg1;
        this.field856 = arg2;
        this.field866 = arg0;
        if (arg4 >= 0) {
            throw new NullPointerException();
        }
        this.field859 = new byte[4][this.field884][this.field885];
        this.field868 = new byte[4][this.field884][this.field885];
        this.field879 = new byte[4][this.field884][this.field885];
        this.field869 = new byte[4][this.field884][this.field885];
        this.field880 = new int[4][this.field884 + 1][this.field885 + 1];
        this.field858 = new byte[4][this.field884 + 1][this.field885 + 1];
        this.field862 = new int[this.field884 + 1][this.field885 + 1];
        this.field873 = new int[this.field885];
        this.field874 = new int[this.field885];
        this.field875 = new int[this.field885];
        this.field876 = new int[this.field885];
        this.field877 = new int[this.field885];
    }

    @OriginalMember(owner = "client!EZVBBZYG", name = "d", descriptor = "(II)I")
    private static final int method269(int arg0, int arg1) {
        int var2 = method258(arg0 + 45365, arg1 + 91923, 4) + (method258(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method258(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "client!EZVBBZYG", name = "c", descriptor = "(III)I")
    private final int method270(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(IIIII)V")
    public final void method271(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= 0) {
            return;
        }
        for (int var6 = arg4; var6 <= arg3 + arg4; var6++) {
            for (int var7 = arg2; var7 <= arg1 + arg2; var7++) {
                if (var7 >= 0 && var7 < this.field884 && var6 >= 0 && var6 < this.field885) {
                    this.field858[0][var7][var6] = 127;
                    if (arg2 == var7 && var7 > 0) {
                        this.field856[0][var7][var6] = this.field856[0][var7 - 1][var6];
                    }
                    if (arg1 + arg2 == var7 && var7 < this.field884 - 1) {
                        this.field856[0][var7][var6] = this.field856[0][var7 + 1][var6];
                    }
                    if (arg4 == var6 && var6 > 0) {
                        this.field856[0][var7][var6] = this.field856[0][var7][var6 - 1];
                    }
                    if (arg3 + arg4 == var6 && var6 < this.field885 - 1) {
                        this.field856[0][var7][var6] = this.field856[0][var7][var6 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(II[LCRVZDSLK;III[B)V")
    public final void method272(int arg0, int arg1, class5[] arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 + var13 > 0 && arg4 + var13 < 103 && arg1 + var14 > 0 && arg1 + var14 < 103) {
                        arg2[var8].field575[arg4 + var13][arg1 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        if (arg5 != 28908) {
            this.field878 = -20;
        }
        class32 var9 = new class32((byte) 114, arg6);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method267(arg0, 0, arg4 + var11, arg3, false, var9, arg1 + var12, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(LRHXAQRFP;[LCRVZDSLK;Z)V")
    public final void method273(class48 arg0, class5[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field866[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field866[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method160(var110, field882, var111);
                        }
                    }
                }
            }
        }
        field871 += (int) (Math.random() * 5.0D) - 2;
        if (field871 < -8) {
            field871 = -8;
        }
        if (field871 > 8) {
            field871 = 8;
        }
        field863 += (int) (Math.random() * 5.0D) - 2;
        if (arg2) {
            return;
        }
        if (field863 < -16) {
            field863 = -16;
        }
        if (field863 > 16) {
            field863 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field858[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field885 - 1; var56++) {
                for (int var101 = 1; var101 < this.field884 - 1; var101++) {
                    int var102 = this.field856[var5][var101 + 1][var56] - this.field856[var5][var101 - 1][var56];
                    int var103 = this.field856[var5][var101][var56 + 1] - this.field856[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field862[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field885; var57++) {
                this.field873[var57] = 0;
                this.field874[var57] = 0;
                this.field875[var57] = 0;
                this.field876[var57] = 0;
                this.field877[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field884 + 5; var58++) {
                for (int var61 = 0; var61 < this.field885; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field884) {
                        int var96 = this.field859[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class3 var97 = class3.field30[var96 - 1];
                            this.field873[var61] += var97.field39;
                            this.field874[var61] += var97.field37;
                            this.field875[var61] += var97.field38;
                            this.field876[var61] += var97.field40;
                            var10002 = this.field877[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field884) {
                        int var99 = this.field859[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class3 var100 = class3.field30[var99 - 1];
                            this.field873[var61] -= var100.field39;
                            this.field874[var61] -= var100.field37;
                            this.field875[var61] -= var100.field38;
                            this.field876[var61] -= var100.field40;
                            var10002 = this.field877[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field884 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field885 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field885) {
                            var62 += this.field873[var68];
                            var63 += this.field874[var68];
                            var64 += this.field875[var68];
                            var65 += this.field876[var68];
                            var66 += this.field877[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field885) {
                            var62 -= this.field873[var69];
                            var63 -= this.field874[var69];
                            var64 -= this.field875[var69];
                            var65 -= this.field876[var69];
                            var66 -= this.field877[var69];
                        }
                        if (var67 >= 1 && var67 < this.field885 - 1 && (!field865 || (this.field866[0][var58][var67] & 0x2) != 0 || (this.field866[var5][var58][var67] & 0x10) == 0 && this.method274(var58, var67, var5, 0) == field867)) {
                            if (var5 < field883) {
                                field883 = var5;
                            }
                            int var70 = this.field859[var5][var58][var67] & 0xFF;
                            int var71 = this.field868[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field856[var5][var58][var67];
                                int var73 = this.field856[var5][var58 + 1][var67];
                                int var74 = this.field856[var5][var58 + 1][var67 + 1];
                                int var75 = this.field856[var5][var58][var67 + 1];
                                int var76 = this.field862[var58][var67];
                                int var77 = this.field862[var58 + 1][var67];
                                int var78 = this.field862[var58 + 1][var67 + 1];
                                int var79 = this.field862[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method270(var82, var83, var84);
                                    int var85 = field871 + var82 & 0xFF;
                                    int var86 = field863 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method270(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field879[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class3.field30[var71 - 1].field35) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field880[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class6.field599[method254(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg0.method476(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method254(var80, var76), method254(var80, var77), method254(var80, var78), method254(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field879[var5][var58][var67] + 1;
                                    byte var90 = this.field869[var5][var58][var67];
                                    class3 var91 = class3.field30[var71 - 1];
                                    int var92 = var91.field33;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class6.method175(var92, true);
                                        var94 = -1;
                                    } else if (var91.field32 == 16711935) {
                                        var94 = -2;
                                        var92 = -1;
                                        var93 = class6.field599[this.method275(var91.field41, 96)];
                                    } else {
                                        var94 = this.method270(var91.field36, var91.field37, var91.field38);
                                        var93 = class6.field599[this.method275(var91.field41, 96)];
                                    }
                                    arg0.method476(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method254(var80, var76), method254(var80, var77), method254(var80, var78), method254(var80, var79), this.method275(var94, var76), this.method275(var94, var77), this.method275(var94, var78), this.method275(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field885 - 1; var59++) {
                for (int var60 = 1; var60 < this.field884 - 1; var60++) {
                    arg0.method475(var5, var60, var59, this.method274(var60, var59, var5, 0));
                }
            }
        }
        arg0.method502(-10, -50, -50, 358);
        for (int var6 = 0; var6 < this.field884; var6++) {
            for (int var47 = 0; var47 < this.field885; var47++) {
                if ((this.field866[1][var6][var47] & 0x2) == 2) {
                    arg0.method473(var6, var47, false);
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
                for (int var12 = 0; var12 <= this.field885; var12++) {
                    for (int var13 = 0; var13 <= this.field884; var13++) {
                        if ((this.field880[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field880[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field885 && (this.field880[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label330: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field880[var16 - 1][var13][var18] & var7) == 0) {
                                        break label330;
                                    }
                                }
                                var16--;
                            }
                            label319: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field880[var17 + 1][var13][var19] & var7) == 0) {
                                        break label319;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field856[var17][var13][var14] - var21;
                                int var23 = this.field856[var16][var13][var14];
                                class48.method474(var13 * 128, var23, var13 * 128, var15 * 128 + 128, 6, var10, 1, var22, var14 * 128);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field880[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field880[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field880[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field884 && (this.field880[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label383: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field880[var28 - 1][var30][var12] & var8) == 0) {
                                        break label383;
                                    }
                                }
                                var28--;
                            }
                            label372: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field880[var29 + 1][var31][var12] & var8) == 0) {
                                        break label372;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field856[var29][var26][var12] - var33;
                                int var35 = this.field856[var28][var26][var12];
                                class48.method474(var27 * 128 + 128, var35, var26 * 128, var12 * 128, 6, var10, 2, var34, var12 * 128);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field880[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field880[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field880[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field885 && (this.field880[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label436: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field880[var11][var38 - 1][var42] & var9) == 0) {
                                        break label436;
                                    }
                                }
                                var38--;
                            }
                            label425: while (var39 < this.field884) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field880[var11][var39 + 1][var43] & var9) == 0) {
                                        break label425;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field856[var11][var38][var40];
                                class48.method474(var39 * 128 + 128, var44, var38 * 128, var41 * 128 + 128, 6, var10, 4, var44, var40 * 128);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field880[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!EZVBBZYG", name = "b", descriptor = "(IIII)I")
    public int method274(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            return this.field857;
        } else if ((this.field866[arg2][arg0][arg1] & 0x8) == 0) {
            return arg2 <= 0 || (this.field866[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!EZVBBZYG", name = "e", descriptor = "(II)I")
    private final int method275(int arg0, int arg1) {
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
}
