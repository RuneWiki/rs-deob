import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class327 extends class324 {

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "I")
    private int field5213;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
    private int field5209;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
    private int field5214;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    private int field5204;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field5202 = -1;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "[C")
    public static char[] field5206 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "Ljava/lang/String;")
    public static String field5207 = "Loaded update list";

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[IIIIIIIZII)V", line = 9)
    public static final void method2271(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        int var11 = arg0;
        field5211++;
        if (class47.field724 <= arg0) {
            return;
        }
        int var12 = arg0 + arg2;
        if (arg0 < class47.field726) {
            var11 = class47.field726;
        }
        if (class47.field726 >= var12) {
            return;
        }
        if (var12 > class47.field724) {
            var12 = class47.field724;
        }
        int var13 = arg7;
        if (class47.field727 <= arg7) {
            return;
        }
        if (arg7 < class47.field723) {
            var13 = class47.field723;
        }
        int var14 = arg6 + arg7;
        if (class47.field723 >= var14) {
            return;
        }
        int var15 = class47.field729 * var13 + var11;
        if (var14 > class47.field727) {
            var14 = class47.field727;
        }
        int var16 = var13 - arg7;
        int var17 = var14 - arg7;
        int var18 = class47.field729 + var11 - var12;
        int var19 = var11 - arg0;
        if (arg9 == 9) {
            arg9 = 1;
            arg10 = arg10 + 1 & 0x3;
        }
        if (arg9 == 10) {
            arg9 = 1;
            arg10 = arg10 + 3 & 0x3;
        }
        int var20 = var12 - arg0;
        if (arg9 == 11) {
            arg9 = 8;
            arg10 = arg10 + 3 & 0x3;
        }
        int var21 = arg6 - var17;
        int var22 = arg2 - var20;
        int var23 = arg6 - var16;
        int var24 = arg2 - var19;
        if (arg9 == 1) {
            if (arg10 == 0) {
                for (int var25 = var16; var25 < var17; var25++) {
                    for (int var26 = var19; var26 < var20; var26++) {
                        if (var25 >= var26) {
                            arg1[var15] = arg3;
                        } else if (arg8) {
                            arg1[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg10 == 1) {
                for (int var31 = var23 - 1; var31 >= var21; var31--) {
                    for (int var32 = var19; var32 < var20; var32++) {
                        if (var32 <= var31) {
                            arg1[var15] = arg3;
                        } else if (arg8) {
                            arg1[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg10 == 2) {
                for (int var29 = var16; var29 < var17; var29++) {
                    for (int var30 = var19; var30 < var20; var30++) {
                        if (var30 >= var29) {
                            arg1[var15] = arg3;
                        } else if (arg8) {
                            arg1[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg10 == 3) {
                for (int var27 = var23 - 1; var27 >= var21; var27--) {
                    for (int var28 = var19; var28 < var20; var28++) {
                        if (var28 >= var27) {
                            arg1[var15] = arg3;
                        } else if (arg8) {
                            arg1[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg9 == 2) {
            if (arg10 == 0) {
                for (int var81 = var23 - 1; var81 >= var21; var81--) {
                    for (int var82 = var19; var82 < var20; var82++) {
                        if (var82 <= var81 >> 1) {
                            arg1[var15] = arg3;
                        } else if (arg8) {
                            arg1[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg10 == 1) {
                for (int var83 = var16; var83 < var17; var83++) {
                    for (int var84 = var19; var84 < var20; var84++) {
                        if (var15 >= 0 && arg1.length > var15) {
                            if ((var83 << 1) <= var84) {
                                arg1[var15] = arg3;
                            } else if (arg8) {
                                arg1[var15] = arg5;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var18;
                }
            } else if (arg10 == 2) {
                for (int var87 = var16; var87 < var17; var87++) {
                    for (int var88 = var24 - 1; var88 >= var22; var88--) {
                        if (var88 <= var87 >> 1) {
                            arg1[var15] = arg3;
                        } else if (arg8) {
                            arg1[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg10 == 3) {
                for (int var85 = var23 - 1; var85 >= var21; var85--) {
                    for (int var86 = var24 - 1; var86 >= var22; var86--) {
                        if ((var85 << 1) <= var86) {
                            arg1[var15] = arg3;
                        } else if (arg8) {
                            arg1[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg9 != 3) {
            if (arg4 != -4781) {
                field5207 = (String) null;
            }
            if (arg9 == 4) {
                if (arg10 == 0) {
                    for (int var79 = var23 - 1; var79 >= var21; var79--) {
                        for (int var80 = var19; var80 < var20; var80++) {
                            if (var80 >= var79 >> 1) {
                                arg1[var15] = arg3;
                            } else if (arg8) {
                                arg1[var15] = arg5;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                } else if (arg10 == 1) {
                    for (int var73 = var16; var73 < var17; var73++) {
                        for (int var74 = var19; var74 < var20; var74++) {
                            if (var74 <= var73 << 1) {
                                arg1[var15] = arg3;
                            } else if (arg8) {
                                arg1[var15] = arg5;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                } else if (arg10 == 2) {
                    for (int var75 = var16; var75 < var17; var75++) {
                        for (int var76 = var24 - 1; var76 >= var22; var76--) {
                            if (var76 >= (var75 >> 1)) {
                                arg1[var15] = arg3;
                            } else if (arg8) {
                                arg1[var15] = arg5;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                } else if (arg10 == 3) {
                    for (int var77 = var23 - 1; var77 >= var21; var77--) {
                        for (int var78 = var24 - 1; var78 >= var22; var78--) {
                            if (var78 <= (var77 << 1)) {
                                arg1[var15] = arg3;
                            } else if (arg8) {
                                arg1[var15] = arg5;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                }
            } else if (arg9 != 5) {
                if (arg9 == 6) {
                    if (arg10 == 0) {
                        for (int var41 = var16; var41 < var17; var41++) {
                            for (int var42 = var19; var42 < var20; var42++) {
                                if (arg2 / 2 >= var42) {
                                    arg1[var15] = arg3;
                                } else if (arg8) {
                                    arg1[var15] = arg5;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                    if (arg10 == 1) {
                        for (int var63 = var16; var63 < var17; var63++) {
                            for (int var64 = var19; var64 < var20; var64++) {
                                if (var63 <= (arg6 / 2)) {
                                    arg1[var15] = arg3;
                                } else if (arg8) {
                                    arg1[var15] = arg5;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                    if (arg10 == 2) {
                        for (int var61 = var16; var61 < var17; var61++) {
                            for (int var62 = var19; var62 < var20; var62++) {
                                if ((arg2 / 2) <= var62) {
                                    arg1[var15] = arg3;
                                } else if (arg8) {
                                    arg1[var15] = arg5;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                    if (arg10 == 3) {
                        for (int var43 = var16; var43 < var17; var43++) {
                            for (int var44 = var19; var44 < var20; var44++) {
                                if (var43 >= arg6 / 2) {
                                    arg1[var15] = arg3;
                                } else if (arg8) {
                                    arg1[var15] = arg5;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                }
                if (arg9 == 7) {
                    if (arg10 == 0) {
                        for (int var51 = var16; var51 < var17; var51++) {
                            for (int var52 = var19; var52 < var20; var52++) {
                                if (var52 <= (var51 - (arg6 / 2))) {
                                    arg1[var15] = arg3;
                                } else if (arg8) {
                                    arg1[var15] = arg5;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                    if (arg10 == 1) {
                        for (int var49 = var23 - 1; var49 >= var21; var49--) {
                            for (int var50 = var19; var50 < var20; var50++) {
                                if (var49 - arg6 / 2 >= var50) {
                                    arg1[var15] = arg3;
                                } else if (arg8) {
                                    arg1[var15] = arg5;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                    if (arg10 == 2) {
                        for (int var47 = var23 - 1; var47 >= var21; var47--) {
                            for (int var48 = var24 - 1; var48 >= var22; var48--) {
                                if (var47 - (arg6 / 2) >= var48) {
                                    arg1[var15] = arg3;
                                } else if (arg8) {
                                    arg1[var15] = arg5;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                    if (arg10 == 3) {
                        for (int var45 = var16; var45 < var17; var45++) {
                            for (int var46 = var24 - 1; var46 >= var22; var46--) {
                                if (var46 <= var45 - (arg6 / 2)) {
                                    arg1[var15] = arg3;
                                } else if (arg8) {
                                    arg1[var15] = arg5;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                }
                if (arg9 == 8) {
                    if (arg10 == 0) {
                        for (int var59 = var16; var59 < var17; var59++) {
                            for (int var60 = var19; var60 < var20; var60++) {
                                if ((var59 - (arg6 / 2)) <= var60) {
                                    arg1[var15] = arg3;
                                } else if (arg8) {
                                    arg1[var15] = arg5;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                    if (arg10 == 1) {
                        for (int var57 = var23 - 1; var57 >= var21; var57--) {
                            for (int var58 = var19; var58 < var20; var58++) {
                                if (var57 - (arg6 / 2) <= var58) {
                                    arg1[var15] = arg3;
                                } else if (arg8) {
                                    arg1[var15] = arg5;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                    if (arg10 == 2) {
                        for (int var53 = var23 - 1; var53 >= var21; var53--) {
                            for (int var54 = var24 - 1; var54 >= var22; var54--) {
                                if ((var53 - (arg6 / 2)) <= var54) {
                                    arg1[var15] = arg3;
                                } else if (arg8) {
                                    arg1[var15] = arg5;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                    if (arg10 == 3) {
                        for (int var55 = var16; var55 < var17; var55++) {
                            for (int var56 = var24 - 1; var56 >= var22; var56--) {
                                if ((var55 - arg6 / 2) <= var56) {
                                    arg1[var15] = arg3;
                                } else if (arg8) {
                                    arg1[var15] = arg5;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                }
            } else if (arg10 == 0) {
                for (int var71 = var23 - 1; var71 >= var21; var71--) {
                    for (int var72 = var24 - 1; var72 >= var22; var72--) {
                        if ((var71 >> 1) <= var72) {
                            arg1[var15] = arg3;
                        } else if (arg8) {
                            arg1[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg10 == 1) {
                for (int var69 = var23 - 1; var69 >= var21; var69--) {
                    for (int var70 = var19; var70 < var20; var70++) {
                        if (var69 << 1 >= var70) {
                            arg1[var15] = arg3;
                        } else if (arg8) {
                            arg1[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg10 == 2) {
                for (int var67 = var16; var67 < var17; var67++) {
                    for (int var68 = var19; var68 < var20; var68++) {
                        if (var67 >> 1 <= var68) {
                            arg1[var15] = arg3;
                        } else if (arg8) {
                            arg1[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg10 == 3) {
                for (int var65 = var16; var65 < var17; var65++) {
                    for (int var66 = var24 - 1; var66 >= var22; var66--) {
                        if ((var65 << 1) >= var66) {
                            arg1[var15] = arg3;
                        } else if (arg8) {
                            arg1[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg10 == 0) {
            for (int var39 = var23 - 1; var39 >= var21; var39--) {
                for (int var40 = var24 - 1; var40 >= var22; var40--) {
                    if ((var39 >> 1) >= var40) {
                        arg1[var15] = arg3;
                    } else if (arg8) {
                        arg1[var15] = arg5;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg10 == 1) {
            for (int var37 = var23 - 1; var37 >= var21; var37--) {
                for (int var38 = var19; var38 < var20; var38++) {
                    if ((var37 << 1) <= var38) {
                        arg1[var15] = arg3;
                    } else if (arg8) {
                        arg1[var15] = arg5;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg10 == 2) {
            for (int var33 = var16; var33 < var17; var33++) {
                for (int var34 = var19; var34 < var20; var34++) {
                    if (var34 <= var33 >> 1) {
                        arg1[var15] = arg3;
                    } else if (arg8) {
                        arg1[var15] = arg5;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg10 == 3) {
            for (int var35 = var16; var35 < var17; var35++) {
                for (int var36 = var24 - 1; var36 >= var22; var36--) {
                    if ((var35 << 1) <= var36) {
                        arg1[var15] = arg3;
                    } else if (arg8) {
                        arg1[var15] = arg5;
                    }
                    var15++;
                }
                var15 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V", line = 1196)
    public final void method344(int arg0, int arg1, int arg2) {
        field5212++;
        int var4 = this.field5209 * arg1 >> 12;
        if (arg2 <= -116) {
            int var5 = this.field5213 * arg1 >> 12;
            int var6 = this.field5214 * arg0 >> 12;
            int var7 = this.field5204 * arg0 >> 12;
            class296.method2020(this.field5164, var7, var6, var4, var5, -5873);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIB)V", line = 1216)
    public final void method346(int arg0, int arg1, byte arg2) {
        int var4 = -26 / ((-arg2 - 20) / 39);
        field5201++;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V", line = 1225)
    public static final void method2272(int arg0) {
        field5203++;
        if (class101.field1633 > 0) {
            class344.method2408((byte) 116);
            return;
        }
        class203.field3462 = class279.field4426;
        class279.field4426 = null;
        class33.method302((byte) 87, 40);
        if (arg0 > -89) {
            field5207 = (String) null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZI)V", line = 1253)
    public static final void method2273(boolean arg0, int arg1) {
        field5210++;
        if (arg0) {
            method2271(120, (int[]) null, 67, -95, -122, -97, 43, 27, true, -64, -68);
        }
        class57.field882.method469(-11815, arg1);
        class250.field4053.method469(-11815, arg1);
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(IIIIIII)V", line = 1267)
    public class327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5213 = arg2;
        this.field5209 = arg0;
        this.field5214 = arg1;
        this.field5204 = arg3;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([[[I[[B[[BII[[B[[I[[F[[[B[[I[[I[[F[[I[[F[[I[[B)[Lbl;", line = 1280)
    public static final class337[] method2274(int[][][] arg0, byte[][] arg1, byte[][] arg2, int arg3, int arg4, byte[][] arg5, int[][] arg6, float[][] arg7, byte[][][] arg8, int[][] arg9, int[][] arg10, float[][] arg11, int[][] arg12, float[][] arg13, int[][] arg14, byte[][] arg15) {
        int[][] var16 = new int[105][105];
        field5205++;
        for (int var17 = 1; var17 <= 103; var17++) {
            for (int var18 = 1; var18 <= 103; var18++) {
                int var19 = 0;
                if (arg0 != null) {
                    int var20 = arg0[arg4][var17 >> 3][var18 >> 3];
                    var19 = var20 >> 1 & 0x3;
                }
                boolean var21 = false;
                byte var22;
                if (var19 == 0) {
                    var22 = arg15[var17][var18];
                    if (var22 == 0) {
                        var22 = arg15[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17 - 1][var18 - 1];
                    }
                } else if (var19 == 1) {
                    var22 = arg15[var17][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg15[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17 - 1][var18];
                    }
                } else if (var19 == 2) {
                    var22 = arg15[var17 - 1][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg15[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17][var18];
                    }
                } else {
                    var22 = arg15[var17 - 1][var18];
                    if (var22 == 0) {
                        var22 = arg15[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17][var18 - 1];
                    }
                }
                if (var22 != 0) {
                    class35 var23 = class322.method2219((var22 & 0xFF) - 1, 1);
                    var16[var17][var18] = (var23.field508 + 1 << 16) + var23.field511;
                }
            }
        }
        class79 var24 = new class79(128);
        for (int var25 = 1; var25 <= 102; var25++) {
            for (int var26 = 1; var26 <= 102; var26++) {
                if (arg15[var25][var26] != 0) {
                    int[] var27;
                    if (arg2[var25][var26] == 0) {
                        var27 = class214.field3592[0];
                    } else {
                        var27 = class98.field1594[arg1[var25][var26]];
                        if (var27.length == 0) {
                            continue;
                        }
                    }
                    int var28 = 0;
                    int var29 = var16[var25][var26];
                    if (arg12 != null) {
                        var28 = arg12[var25][var26] & 0xFFFFFF;
                    }
                    int var30 = var16[var25 + 1][var26];
                    int var31 = var16[var25][var26 + 1];
                    int var32 = var16[var25 + 1][var26 + 1];
                    long var33 = (long) var29 << 32 | (long) var28;
                    long var35 = (long) var32 << 32 | (long) var28;
                    long var37 = (long) var30 << 32 | (long) var28;
                    long var39 = (long) var31 << 32 | (long) var28;
                    int var41 = var27.length / 2;
                    class337 var42 = (class337) var24.method732(var33, true);
                    if (var42 == null) {
                        var42 = new class337((var29 >> 16) - 1, (float) (var29 & 0xFFFF), false, arg6 != null, var28);
                        var24.method725(var33, var42, 1);
                    }
                    var42.field5373++;
                    var42.field5383 += var41;
                    if (var33 != var37) {
                        class337 var43 = (class337) var24.method732(var37, true);
                        if (var43 == null) {
                            var43 = new class337((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg6 != null, var28);
                            var24.method725(var37, var43, 1);
                        }
                        var43.field5383 += var41;
                        var43.field5373++;
                    }
                    if (var33 != var35 && var35 != var37) {
                        class337 var44 = (class337) var24.method732(var35, true);
                        if (var44 == null) {
                            var44 = new class337((var32 >> 16) - 1, (float) (var32 & 0xFFFF), false, arg6 != null, var28);
                            var24.method725(var35, var44, 1);
                        }
                        var44.field5383 += var41;
                        var44.field5373++;
                    }
                    if (var33 != var39 && var37 != var39 && var35 != var39) {
                        class337 var45 = (class337) var24.method732(var39, true);
                        if (var45 == null) {
                            var45 = new class337((var31 >> 16) - 1, (float) (var31 & 0xFFFF), false, arg6 != null, var28);
                            var24.method725(var39, var45, 1);
                        }
                        var45.field5383 += var41;
                        var45.field5373++;
                    }
                }
            }
        }
        for (class337 var46 = (class337) var24.method736(2); var46 != null; var46 = (class337) var24.method727((byte) -110)) {
            var46.method2380();
        }
        for (int var47 = 1; var47 <= 102; var47++) {
            for (int var48 = 1; var48 <= 102; var48++) {
                byte var49 = arg15[var47][var48];
                if (var49 != 0) {
                    int var50;
                    if ((arg8[arg4][var47][var48] & 0x8) != 0) {
                        var50 = 0;
                    } else if ((arg8[1][var47][var48] & 0x2) == 2 && arg4 > 0) {
                        var50 = arg4 - 1;
                    } else {
                        var50 = arg4;
                    }
                    int var51 = 0;
                    int var52 = 128;
                    boolean[] var53 = null;
                    if (arg12 != null) {
                        var51 = arg12[var47][var48] & 0xFFFFFF;
                        var52 = arg12[var47][var48] >>> 24 << 3;
                    }
                    int[] var54;
                    byte var65;
                    if (arg2[var47][var48] == 0) {
                        var54 = class214.field3592[0];
                        byte var55 = 0;
                        byte var56 = 0;
                        int var57 = var55 + (arg15[var47 + 1][var48 - 1] == var49 ? 1 : -1);
                        int var58 = var56 + (arg15[var47 + 1][var48 + 1] == var49 ? 1 : -1);
                        byte var59 = 0;
                        int var60 = var59 + (arg15[var47 - 1][var48 - 1] == var49 ? 1 : -1);
                        byte var61 = 0;
                        if (arg15[var47][var48 - 1] == var49) {
                            var57++;
                            var60++;
                        } else {
                            var60--;
                            var57--;
                        }
                        int var62 = var61 + (arg15[var47 - 1][var48 + 1] == var49 ? 1 : -1);
                        if (arg15[var47 + 1][var48] == var49) {
                            var58++;
                            var57++;
                        } else {
                            var58--;
                            var57--;
                        }
                        if (arg15[var47][var48 + 1] == var49) {
                            var62++;
                            var58++;
                        } else {
                            var58--;
                            var62--;
                        }
                        if (arg15[var47 - 1][var48] == var49) {
                            var60++;
                            var62++;
                        } else {
                            var60--;
                            var62--;
                        }
                        int var63 = var60 - var58;
                        int var64 = var57 - var62;
                        if (var64 < 0) {
                            var64 = -var64;
                        }
                        if (var63 < 0) {
                            var63 = -var63;
                        }
                        var65 = (byte) (var64 > var63 ? 1 : 0);
                        arg5[var47][var48] = var65;
                    } else {
                        var65 = arg5[var47][var48];
                        var53 = class155.field2752[arg1[var47][var48]];
                        var54 = class98.field1594[arg1[var47][var48]];
                        if (var54.length == 0) {
                            continue;
                        }
                    }
                    int var66 = var16[var47][var48];
                    int var67 = var16[var47 + 1][var48];
                    int var68 = var16[var47 + 1][var48 + 1];
                    int var69 = var16[var47][var48 + 1];
                    long var70 = (long) var67 << 32 | (long) var51;
                    long var72 = (long) var68 << 32 | (long) var51;
                    long var74 = (long) var51 | (long) var66 << 32;
                    long var76 = (long) var69 << 32 | (long) var51;
                    int var78 = arg10[var47][var48];
                    int var79 = arg10[var47 + 1][var48];
                    int var80 = arg10[var47 + 1][var48 + 1];
                    int var81 = arg10[var47][var48 + 1];
                    int var82 = arg9[var47][var48];
                    int var83 = arg9[var47 + 1][var48];
                    int var84 = arg9[var47 + 1][var48 + 1];
                    int var85 = arg9[var47][var48 + 1];
                    int var86 = (var67 >> 16) - 1;
                    int var87 = (var68 >> 16) - 1;
                    int var88 = (var66 >> 16) - 1;
                    int var89 = (var69 >> 16) - 1;
                    class337 var90 = (class337) var24.method732(var74, true);
                    class209.method1558(arg11, class265.method1827(var80, true, var84, var88), var52, class265.method1827(var81, true, var85, var88), var90, arg14, arg7, class265.method1827(var79, true, var83, var88), var66 <= var67, var50, var65, 255, arg13, arg6, var47, class265.method1827(var78, true, var82, var88), var68 >= var66, var53, var54, var66 >= var66, var69 >= var66, var48);
                    if (var70 != var74) {
                        class337 var91 = (class337) var24.method732(var70, true);
                        class209.method1558(arg11, class265.method1827(var80, true, var84, var86), var52, class265.method1827(var81, true, var85, var86), var91, arg14, arg7, class265.method1827(var79, true, var83, var86), var67 >= var67, var50, var65, 255, arg13, arg6, var47, class265.method1827(var78, true, var82, var86), var67 <= var68, var53, var54, var67 <= var66, var67 <= var69, var48);
                    }
                    if (var72 != var74 && var70 != var72) {
                        class337 var92 = (class337) var24.method732(var72, true);
                        class209.method1558(arg11, class265.method1827(var80, true, var84, var87), var52, class265.method1827(var81, true, var85, var87), var92, arg14, arg7, class265.method1827(var79, true, var83, var87), var68 <= var67, var50, var65, 255, arg13, arg6, var47, class265.method1827(var78, true, var82, var87), var68 >= var68, var53, var54, var66 >= var68, var68 <= var69, var48);
                    }
                    if (var74 != var76 && var70 != var76 && var72 != var76) {
                        class337 var93 = (class337) var24.method732(var76, true);
                        class209.method1558(arg11, class265.method1827(var80, true, var84, var89), var52, class265.method1827(var81, true, var85, var89), var93, arg14, arg7, class265.method1827(var79, true, var83, var89), var67 >= var69, var50, var65, 255, arg13, arg6, var47, class265.method1827(var78, true, var82, var89), var68 >= var69, var53, var54, var69 <= var66, var69 <= var69, var48);
                    }
                }
            }
        }
        for (class337 var94 = (class337) var24.method736(2); var94 != null; var94 = (class337) var24.method727((byte) -110)) {
            if (var94.field5390 == 0) {
                var94.method2195(-1);
            } else {
                var94.method2378();
            }
        }
        int var95 = -108 % ((arg3 + 71) / 46);
        int var96 = var24.method723(5500);
        class337[] var97 = new class337[var96];
        var24.method731(63, var97);
        long[] var98 = new long[var96];
        for (int var99 = 0; var99 < var96; var99++) {
            var98[var99] = var97[var99].field5062;
        }
        class197.method1490(19, var98, var97);
        return var97;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(Z)V", line = 1742)
    public static void method2275(boolean arg0) {
        field5207 = null;
        if (arg0) {
            field5206 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(III)V", line = 1754)
    public final void method347(int arg0, int arg1, int arg2) {
        int var4 = this.field5209 * arg2 >> 12;
        field5208++;
        if (arg1 <= 103) {
            method2271(-63, (int[]) null, 13, 83, 1, -65, -12, 123, false, 39, 84);
        }
        int var5 = this.field5213 * arg2 >> 12;
        int var6 = this.field5204 * arg0 >> 12;
        int var7 = this.field5214 * arg0 >> 12;
        class253.method1765(true, var4, var5, this.field5162, var7, var6, this.field5164, this.field5149);
    }
}
