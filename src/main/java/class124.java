import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public abstract class class124 {

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field2296 = 0;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "[I")
    public static int[] field2298 = new int[200];

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "[I")
    public static int[] field2299 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Z")
    public static boolean field2301 = false;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field2302 = 0;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)I")
    public abstract int method954(byte arg0);

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method955(Component arg0, int arg1);

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
    public static final Object method956(int arg0, boolean arg1, byte[] arg2) {
        if (arg0 != -25561) {
            return null;
        }
        field2297++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class60.field1032) {
            try {
                class65 var3 = (class65) Class.forName("li").getDeclaredConstructor().newInstance();
                var3.method459(-1, arg2);
                return var3;
            } catch (Throwable var4) {
                class60.field1032 = true;
            }
        }
        return arg1 ? class233.method1581((byte) -23, arg2) : arg2;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIII[IIZIII)V")
    public static final void method957(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        int var11 = arg6;
        field2300++;
        if (class84.field1422 <= arg6) {
            return;
        }
        if (class84.field1425 > arg6) {
            var11 = class84.field1425;
        }
        int var12 = arg3 + arg6;
        if (class84.field1425 >= var12) {
            return;
        }
        if (class84.field1422 < var12) {
            var12 = class84.field1422;
        }
        int var13 = arg2;
        if (arg2 >= class84.field1423) {
            return;
        }
        int var14 = arg1 + arg2;
        if (class84.field1426 > arg2) {
            var13 = class84.field1426;
        }
        if (class84.field1426 >= var14) {
            return;
        }
        if (var14 > class84.field1423) {
            var14 = class84.field1423;
        }
        if (arg8 == 9) {
            arg8 = 1;
            arg9 = arg9 + 1 & 0x3;
        }
        if (arg8 == 10) {
            arg9 = arg9 + 3 & 0x3;
            arg8 = 1;
        }
        int var15 = class84.field1429 * var13 + var11;
        int var16 = var13 - arg2;
        if (arg8 == 11) {
            arg8 = 8;
            arg9 = arg9 + 3 & 0x3;
        }
        int var17 = var14 - arg2;
        int var18 = class84.field1429 + var11 - var12;
        int var19 = var12 - arg6;
        int var20 = var11 - arg6;
        int var21 = arg3 - var20;
        int var22 = arg3 - var19;
        if (arg10 != 16274) {
            return;
        }
        int var23 = arg1 - var17;
        int var24 = arg1 - var16;
        if (arg8 == 1) {
            if (arg9 == 0) {
                for (int var25 = var16; var25 < var17; var25++) {
                    for (int var26 = var20; var26 < var19; var26++) {
                        if (var25 >= var26) {
                            arg5[var15] = arg4;
                        } else if (arg7) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 1) {
                for (int var27 = var24 - 1; var27 >= var23; var27--) {
                    for (int var28 = var20; var28 < var19; var28++) {
                        if (var28 <= var27) {
                            arg5[var15] = arg4;
                        } else if (arg7) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 2) {
                for (int var29 = var16; var29 < var17; var29++) {
                    for (int var30 = var20; var30 < var19; var30++) {
                        if (var30 >= var29) {
                            arg5[var15] = arg4;
                        } else if (arg7) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 3) {
                for (int var31 = var24 - 1; var31 >= var23; var31--) {
                    for (int var32 = var20; var32 < var19; var32++) {
                        if (var32 >= var31) {
                            arg5[var15] = arg4;
                        } else if (arg7) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg8 == 2) {
            if (arg9 == 0) {
                for (int var33 = var24 - 1; var33 >= var23; var33--) {
                    for (int var34 = var20; var34 < var19; var34++) {
                        if ((var33 >> 1) >= var34) {
                            arg5[var15] = arg4;
                        } else if (arg7) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 1) {
                for (int var35 = var16; var35 < var17; var35++) {
                    for (int var36 = var20; var36 < var19; var36++) {
                        if (var15 >= 0 && var15 < arg5.length) {
                            if (var35 << 1 <= var36) {
                                arg5[var15] = arg4;
                            } else if (arg7) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var18;
                }
            } else if (arg9 == 2) {
                for (int var37 = var16; var37 < var17; var37++) {
                    for (int var38 = var21 - 1; var38 >= var22; var38--) {
                        if (var38 <= var37 >> 1) {
                            arg5[var15] = arg4;
                        } else if (arg7) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 3) {
                for (int var39 = var24 - 1; var39 >= var23; var39--) {
                    for (int var40 = var21 - 1; var40 >= var22; var40--) {
                        if (var39 << 1 <= var40) {
                            arg5[var15] = arg4;
                        } else if (arg7) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg8 == 3) {
            if (arg9 == 0) {
                for (int var41 = var24 - 1; var41 >= var23; var41--) {
                    for (int var42 = var21 - 1; var42 >= var22; var42--) {
                        if ((var41 >> 1) >= var42) {
                            arg5[var15] = arg4;
                        } else if (arg7) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 1) {
                for (int var43 = var24 - 1; var43 >= var23; var43--) {
                    for (int var44 = var20; var44 < var19; var44++) {
                        if (var43 << 1 <= var44) {
                            arg5[var15] = arg4;
                        } else if (arg7) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 2) {
                for (int var45 = var16; var45 < var17; var45++) {
                    for (int var46 = var20; var46 < var19; var46++) {
                        if (var46 <= (var45 >> 1)) {
                            arg5[var15] = arg4;
                        } else if (arg7) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 3) {
                for (int var47 = var16; var47 < var17; var47++) {
                    for (int var48 = var21 - 1; var48 >= var22; var48--) {
                        if (var48 >= var47 << 1) {
                            arg5[var15] = arg4;
                        } else if (arg7) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg8 == 4) {
            if (arg9 == 0) {
                for (int var49 = var24 - 1; var49 >= var23; var49--) {
                    for (int var50 = var20; var50 < var19; var50++) {
                        if (var49 >> 1 <= var50) {
                            arg5[var15] = arg4;
                        } else if (arg7) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 1) {
                for (int var51 = var16; var51 < var17; var51++) {
                    for (int var52 = var20; var52 < var19; var52++) {
                        if (var51 << 1 >= var52) {
                            arg5[var15] = arg4;
                        } else if (arg7) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 2) {
                for (int var53 = var16; var53 < var17; var53++) {
                    for (int var54 = var21 - 1; var54 >= var22; var54--) {
                        if ((var53 >> 1) <= var54) {
                            arg5[var15] = arg4;
                        } else if (arg7) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 3) {
                for (int var55 = var24 - 1; var55 >= var23; var55--) {
                    for (int var56 = var21 - 1; var56 >= var22; var56--) {
                        if (var56 <= (var55 << 1)) {
                            arg5[var15] = arg4;
                        } else if (arg7) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg8 != 5) {
            if (arg8 == 6) {
                if (arg9 == 0) {
                    for (int var65 = var16; var65 < var17; var65++) {
                        for (int var66 = var20; var66 < var19; var66++) {
                            if (var66 <= (arg3 / 2)) {
                                arg5[var15] = arg4;
                            } else if (arg7) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var67 = var16; var67 < var17; var67++) {
                        for (int var68 = var20; var68 < var19; var68++) {
                            if (arg1 / 2 >= var67) {
                                arg5[var15] = arg4;
                            } else if (arg7) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var69 = var16; var69 < var17; var69++) {
                        for (int var70 = var20; var70 < var19; var70++) {
                            if (arg3 / 2 <= var70) {
                                arg5[var15] = arg4;
                            } else if (arg7) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var71 = var16; var71 < var17; var71++) {
                        for (int var72 = var20; var72 < var19; var72++) {
                            if (var71 >= arg1 / 2) {
                                arg5[var15] = arg4;
                            } else if (arg7) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg8 == 7) {
                if (arg9 == 0) {
                    for (int var73 = var16; var73 < var17; var73++) {
                        for (int var74 = var20; var74 < var19; var74++) {
                            if (var73 - (arg1 / 2) >= var74) {
                                arg5[var15] = arg4;
                            } else if (arg7) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var75 = var24 - 1; var75 >= var23; var75--) {
                        for (int var76 = var20; var76 < var19; var76++) {
                            if (var75 - arg1 / 2 >= var76) {
                                arg5[var15] = arg4;
                            } else if (arg7) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var77 = var24 - 1; var77 >= var23; var77--) {
                        for (int var78 = var21 - 1; var78 >= var22; var78--) {
                            if ((var77 - (arg1 / 2)) >= var78) {
                                arg5[var15] = arg4;
                            } else if (arg7) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var79 = var16; var79 < var17; var79++) {
                        for (int var80 = var21 - 1; var80 >= var22; var80--) {
                            if (var79 - arg1 / 2 >= var80) {
                                arg5[var15] = arg4;
                            } else if (arg7) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg8 == 8) {
                if (arg9 == 0) {
                    for (int var81 = var16; var81 < var17; var81++) {
                        for (int var82 = var20; var82 < var19; var82++) {
                            if (var81 - (arg1 / 2) <= var82) {
                                arg5[var15] = arg4;
                            } else if (arg7) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var83 = var24 - 1; var83 >= var23; var83--) {
                        for (int var84 = var20; var84 < var19; var84++) {
                            if (var84 >= (var83 - (arg1 / 2))) {
                                arg5[var15] = arg4;
                            } else if (arg7) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var85 = var24 - 1; var85 >= var23; var85--) {
                        for (int var86 = var21 - 1; var86 >= var22; var86--) {
                            if (var85 - (arg1 / 2) <= var86) {
                                arg5[var15] = arg4;
                            } else if (arg7) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var87 = var16; var87 < var17; var87++) {
                        for (int var88 = var21 - 1; var88 >= var22; var88--) {
                            if (var87 - (arg1 / 2) <= var88) {
                                arg5[var15] = arg4;
                            } else if (arg7) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
        } else if (arg9 == 0) {
            for (int var57 = var24 - 1; var57 >= var23; var57--) {
                for (int var58 = var21 - 1; var58 >= var22; var58--) {
                    if (var58 >= (var57 >> 1)) {
                        arg5[var15] = arg4;
                    } else if (arg7) {
                        arg5[var15] = arg0;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg9 == 1) {
            for (int var59 = var24 - 1; var59 >= var23; var59--) {
                for (int var60 = var20; var60 < var19; var60++) {
                    if ((var59 << 1) >= var60) {
                        arg5[var15] = arg4;
                    } else if (arg7) {
                        arg5[var15] = arg0;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg9 == 2) {
            for (int var61 = var16; var61 < var17; var61++) {
                for (int var62 = var20; var62 < var19; var62++) {
                    if (var61 >> 1 <= var62) {
                        arg5[var15] = arg4;
                    } else if (arg7) {
                        arg5[var15] = arg0;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg9 == 3) {
            for (int var63 = var16; var63 < var17; var63++) {
                for (int var64 = var21 - 1; var64 >= var22; var64--) {
                    if ((var63 << 1) >= var64) {
                        arg5[var15] = arg4;
                    } else if (arg7) {
                        arg5[var15] = arg0;
                    }
                    var15++;
                }
                var15 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I[Lmb;II)Lmb;")
    public static final class96 method958(int arg0, class96[] arg1, int arg2, int arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg1[arg2 + var5] == null) {
                arg1[arg2 + var5] = class40.field689;
            }
            var4 += arg1[arg2 + var5].field1600;
        }
        if (arg3 != -25433) {
            field2296 = -92;
        }
        field2295++;
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg0; var8++) {
            class96 var10 = arg1[arg2 + var8];
            class102.method772(var10.field1580, 0, var7, var6, var10.field1600);
            var6 += var10.field1600;
        }
        class96 var9 = new class96();
        var9.field1600 = var4;
        var9.field1580 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method959(Component arg0, byte arg1);

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
    public static void method960(byte arg0) {
        field2299 = null;
        field2298 = null;
        if (arg0 > -16) {
            field2299 = null;
        }
    }
}
