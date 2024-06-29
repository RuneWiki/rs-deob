import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class251 extends class208 {

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field4224 = 0;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "[S")
    public static short[] field4226 = new short[256];

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "[I")
    public static int[] field4231 = new int[99];

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field4228 = 0;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "[[I")
    public static int[][] field4233 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "[Lve;")
    public static class255[] field4237 = new class255[8];

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "B")
    public byte field4232;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public int field4225;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "Lve;")
    public class255 field4229;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "Lve;")
    public class255 field4236;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "Lrg;")
    public static class88 field4230;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)[B", line = 11)
    public static final byte[] method1721(byte arg0, int arg1) {
        if (arg0 != -105) {
            return (byte[]) null;
        }
        class129 var2 = (class129) class70.field1103.method58(arg0 ^ 0xFFFFFF97, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class212.method1522(var4, var7, (byte) 108);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class129(var3);
            class70.field1103.method63(0, (long) arg1, var2);
        }
        field4235++;
        return var2.field2132;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field4231[var1] = var0 / 4;
        }
        field4240 = 1;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V", line = 68)
    public static void method1722(int arg0) {
        field4226 = null;
        field4230 = null;
        field4231 = null;
        field4237 = null;
        if (arg0 != 3) {
            field4226 = (short[]) null;
        }
        field4233 = (int[][]) null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lve;Lve;IILve;)V", line = 86)
    public static final void method1723(class255 arg0, class255 arg1, int arg2, int arg3, class255 arg4) {
        field4227++;
        class100.method780(arg2, arg1, arg0, -32411, arg3, arg4);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)V", line = 95)
    public static final void method1724(int arg0, byte arg1) {
        class53 var2 = class303.method2112(-1155040160, arg0, 12);
        if (arg1 < 46) {
            field4241 = 101;
        }
        field4238++;
        var2.method326(70);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIZI[IIZ)V", line = 116)
    public static final void method1725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int[] arg8, int arg9, boolean arg10) {
        field4234++;
        int var11 = arg5;
        if (arg5 >= class175.field2894) {
            return;
        }
        if (class175.field2888 > arg5) {
            var11 = class175.field2888;
        }
        int var12 = arg0 + arg5;
        if (arg10) {
            field4231 = (int[]) null;
        }
        if (class175.field2888 >= var12) {
            return;
        }
        if (var12 > class175.field2894) {
            var12 = class175.field2894;
        }
        int var13 = arg4;
        if (arg4 >= class175.field2896) {
            return;
        }
        if (arg4 < class175.field2893) {
            var13 = class175.field2893;
        }
        int var14 = arg4 + arg7;
        if (var14 <= class175.field2893) {
            return;
        }
        int var15 = class175.field2890 * var13 + var11;
        if (arg3 == 9) {
            arg1 = arg1 + 1 & 0x3;
            arg3 = 1;
        }
        int var16 = var13 - arg4;
        if (var14 > class175.field2896) {
            var14 = class175.field2896;
        }
        int var17 = var14 - arg4;
        int var18 = arg7 - var17;
        if (arg3 == 10) {
            arg1 = arg1 + 3 & 0x3;
            arg3 = 1;
        }
        int var19 = class175.field2890 + var11 - var12;
        int var20 = arg7 - var16;
        int var21 = var11 - arg5;
        int var22 = arg0 - var21;
        if (arg3 == 11) {
            arg1 = arg1 + 3 & 0x3;
            arg3 = 8;
        }
        int var23 = var12 - arg5;
        int var24 = arg0 - var23;
        if (arg3 == 1) {
            if (arg1 == 0) {
                for (int var81 = var16; var81 < var17; var81++) {
                    for (int var82 = var21; var82 < var23; var82++) {
                        if (var81 >= var82) {
                            arg8[var15] = arg9;
                        } else if (arg6) {
                            arg8[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg1 == 1) {
                for (int var87 = var20 - 1; var87 >= var18; var87--) {
                    for (int var88 = var21; var88 < var23; var88++) {
                        if (var87 >= var88) {
                            arg8[var15] = arg9;
                        } else if (arg6) {
                            arg8[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg1 == 2) {
                for (int var83 = var16; var83 < var17; var83++) {
                    for (int var84 = var21; var84 < var23; var84++) {
                        if (var84 >= var83) {
                            arg8[var15] = arg9;
                        } else if (arg6) {
                            arg8[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg1 == 3) {
                for (int var85 = var20 - 1; var85 >= var18; var85--) {
                    for (int var86 = var21; var86 < var23; var86++) {
                        if (var86 >= var85) {
                            arg8[var15] = arg9;
                        } else if (arg6) {
                            arg8[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            }
        } else if (arg3 == 2) {
            if (arg1 == 0) {
                for (int var31 = var20 - 1; var31 >= var18; var31--) {
                    for (int var32 = var21; var32 < var23; var32++) {
                        if (var32 <= var31 >> 1) {
                            arg8[var15] = arg9;
                        } else if (arg6) {
                            arg8[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg1 == 1) {
                for (int var29 = var16; var29 < var17; var29++) {
                    for (int var30 = var21; var30 < var23; var30++) {
                        if (var15 >= 0 && arg8.length > var15) {
                            if (var30 >= (var29 << 1)) {
                                arg8[var15] = arg9;
                            } else if (arg6) {
                                arg8[var15] = arg2;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var19;
                }
            } else if (arg1 == 2) {
                for (int var27 = var16; var27 < var17; var27++) {
                    for (int var28 = var22 - 1; var28 >= var24; var28--) {
                        if (var28 <= var27 >> 1) {
                            arg8[var15] = arg9;
                        } else if (arg6) {
                            arg8[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg1 == 3) {
                for (int var25 = var20 - 1; var25 >= var18; var25--) {
                    for (int var26 = var22 - 1; var26 >= var24; var26--) {
                        if (var26 >= var25 << 1) {
                            arg8[var15] = arg9;
                        } else if (arg6) {
                            arg8[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            }
        } else if (arg3 == 3) {
            if (arg1 == 0) {
                for (int var33 = var20 - 1; var33 >= var18; var33--) {
                    for (int var34 = var22 - 1; var34 >= var24; var34--) {
                        if (var33 >> 1 >= var34) {
                            arg8[var15] = arg9;
                        } else if (arg6) {
                            arg8[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg1 == 1) {
                for (int var39 = var20 - 1; var39 >= var18; var39--) {
                    for (int var40 = var21; var40 < var23; var40++) {
                        if (var40 >= (var39 << 1)) {
                            arg8[var15] = arg9;
                        } else if (arg6) {
                            arg8[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg1 == 2) {
                for (int var37 = var16; var37 < var17; var37++) {
                    for (int var38 = var21; var38 < var23; var38++) {
                        if (var38 <= (var37 >> 1)) {
                            arg8[var15] = arg9;
                        } else if (arg6) {
                            arg8[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg1 == 3) {
                for (int var35 = var16; var35 < var17; var35++) {
                    for (int var36 = var22 - 1; var36 >= var24; var36--) {
                        if (var36 >= (var35 << 1)) {
                            arg8[var15] = arg9;
                        } else if (arg6) {
                            arg8[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            }
        } else if (arg3 == 4) {
            if (arg1 == 0) {
                for (int var41 = var20 - 1; var41 >= var18; var41--) {
                    for (int var42 = var21; var42 < var23; var42++) {
                        if (var41 >> 1 <= var42) {
                            arg8[var15] = arg9;
                        } else if (arg6) {
                            arg8[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg1 == 1) {
                for (int var47 = var16; var47 < var17; var47++) {
                    for (int var48 = var21; var48 < var23; var48++) {
                        if (var48 <= var47 << 1) {
                            arg8[var15] = arg9;
                        } else if (arg6) {
                            arg8[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg1 == 2) {
                for (int var45 = var16; var45 < var17; var45++) {
                    for (int var46 = var22 - 1; var46 >= var24; var46--) {
                        if (var45 >> 1 <= var46) {
                            arg8[var15] = arg9;
                        } else if (arg6) {
                            arg8[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg1 == 3) {
                for (int var43 = var20 - 1; var43 >= var18; var43--) {
                    for (int var44 = var22 - 1; var44 >= var24; var44--) {
                        if (var43 << 1 >= var44) {
                            arg8[var15] = arg9;
                        } else if (arg6) {
                            arg8[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            }
        } else if (arg3 != 5) {
            if (arg3 == 6) {
                if (arg1 == 0) {
                    for (int var55 = var16; var55 < var17; var55++) {
                        for (int var56 = var21; var56 < var23; var56++) {
                            if (arg0 / 2 >= var56) {
                                arg8[var15] = arg9;
                            } else if (arg6) {
                                arg8[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var53 = var16; var53 < var17; var53++) {
                        for (int var54 = var21; var54 < var23; var54++) {
                            if ((arg7 / 2) >= var53) {
                                arg8[var15] = arg9;
                            } else if (arg6) {
                                arg8[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var51 = var16; var51 < var17; var51++) {
                        for (int var52 = var21; var52 < var23; var52++) {
                            if (arg0 / 2 <= var52) {
                                arg8[var15] = arg9;
                            } else if (arg6) {
                                arg8[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var49 = var16; var49 < var17; var49++) {
                        for (int var50 = var21; var50 < var23; var50++) {
                            if (var49 >= arg7 / 2) {
                                arg8[var15] = arg9;
                            } else if (arg6) {
                                arg8[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
            }
            if (arg3 == 7) {
                if (arg1 == 0) {
                    for (int var71 = var16; var71 < var17; var71++) {
                        for (int var72 = var21; var72 < var23; var72++) {
                            if ((var71 - (arg7 / 2)) >= var72) {
                                arg8[var15] = arg9;
                            } else if (arg6) {
                                arg8[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var69 = var20 - 1; var69 >= var18; var69--) {
                        for (int var70 = var21; var70 < var23; var70++) {
                            if (var69 - (arg7 / 2) >= var70) {
                                arg8[var15] = arg9;
                            } else if (arg6) {
                                arg8[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var67 = var20 - 1; var67 >= var18; var67--) {
                        for (int var68 = var22 - 1; var68 >= var24; var68--) {
                            if ((var67 - (arg7 / 2)) >= var68) {
                                arg8[var15] = arg9;
                            } else if (arg6) {
                                arg8[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var65 = var16; var65 < var17; var65++) {
                        for (int var66 = var22 - 1; var66 >= var24; var66--) {
                            if (var65 - (arg7 / 2) >= var66) {
                                arg8[var15] = arg9;
                            } else if (arg6) {
                                arg8[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
            }
            if (arg3 == 8) {
                if (arg1 == 0) {
                    for (int var63 = var16; var63 < var17; var63++) {
                        for (int var64 = var21; var64 < var23; var64++) {
                            if ((var63 - (arg7 / 2)) <= var64) {
                                arg8[var15] = arg9;
                            } else if (arg6) {
                                arg8[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var61 = var20 - 1; var61 >= var18; var61--) {
                        for (int var62 = var21; var62 < var23; var62++) {
                            if ((var61 - (arg7 / 2)) <= var62) {
                                arg8[var15] = arg9;
                            } else if (arg6) {
                                arg8[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var59 = var20 - 1; var59 >= var18; var59--) {
                        for (int var60 = var22 - 1; var60 >= var24; var60--) {
                            if ((var59 - (arg7 / 2)) <= var60) {
                                arg8[var15] = arg9;
                            } else if (arg6) {
                                arg8[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var57 = var16; var57 < var17; var57++) {
                        for (int var58 = var22 - 1; var58 >= var24; var58--) {
                            if ((var57 - arg7 / 2) <= var58) {
                                arg8[var15] = arg9;
                            } else if (arg6) {
                                arg8[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
            }
        } else if (arg1 == 0) {
            for (int var73 = var20 - 1; var73 >= var18; var73--) {
                for (int var74 = var22 - 1; var74 >= var24; var74--) {
                    if (var73 >> 1 <= var74) {
                        arg8[var15] = arg9;
                    } else if (arg6) {
                        arg8[var15] = arg2;
                    }
                    var15++;
                }
                var15 += var19;
            }
        } else if (arg1 == 1) {
            for (int var75 = var20 - 1; var75 >= var18; var75--) {
                for (int var76 = var21; var76 < var23; var76++) {
                    if (var75 << 1 >= var76) {
                        arg8[var15] = arg9;
                    } else if (arg6) {
                        arg8[var15] = arg2;
                    }
                    var15++;
                }
                var15 += var19;
            }
        } else if (arg1 == 2) {
            for (int var79 = var16; var79 < var17; var79++) {
                for (int var80 = var21; var80 < var23; var80++) {
                    if (var80 >= var79 >> 1) {
                        arg8[var15] = arg9;
                    } else if (arg6) {
                        arg8[var15] = arg2;
                    }
                    var15++;
                }
                var15 += var19;
            }
        } else if (arg1 == 3) {
            for (int var77 = var16; var77 < var17; var77++) {
                for (int var78 = var22 - 1; var78 >= var24; var78--) {
                    if (var78 <= var77 << 1) {
                        arg8[var15] = arg9;
                    } else if (arg6) {
                        arg8[var15] = arg2;
                    }
                    var15++;
                }
                var15 += var19;
            }
        }
    }
}
