import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class class10 {

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public int field213;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public int field216;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public int field211;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field219 = -1;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
    public abstract void method94(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)Lnh;")
    public static final class264 method95(byte arg0) {
        field215++;
        try {
            return arg0 > -85 ? null : (class264) Class.forName("oe").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)I")
    public static final int method96(int arg0, int arg1) {
        field217++;
        return arg0 < 109 ? -13 : arg1 >>> 8;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIILsc;Lsc;IIIIJ)V")
    public static final void method97(int arg0, int arg1, int arg2, int arg3, class119 arg4, class119 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class207 var12 = new class207();
        var12.field3535 = arg10;
        var12.field3540 = arg1 * 128 + 64;
        var12.field3542 = arg2 * 128 + 64;
        var12.field3534 = arg3;
        var12.field3533 = arg4;
        var12.field3539 = arg5;
        var12.field3544 = arg6;
        var12.field3543 = arg7;
        var12.field3541 = arg8;
        var12.field3532 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class31.field553[var13][arg1][arg2] == null) {
                class31.field553[var13][arg1][arg2] = new class71(var13, arg1, arg2);
            }
        }
        class31.field553[arg0][arg1][arg2].field1157 = var12;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBIIII[IIZII)V")
    public static final void method98(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, boolean arg8, int arg9, int arg10) {
        int var11 = arg5;
        field212++;
        if (arg5 >= class128.field2293) {
            return;
        }
        int var12 = arg5 + arg0;
        if (class128.field2287 > arg5) {
            var11 = class128.field2287;
        }
        if (class128.field2287 >= var12) {
            return;
        }
        if (class128.field2293 < var12) {
            var12 = class128.field2293;
        }
        int var13 = arg2;
        if (arg2 >= class128.field2292) {
            return;
        }
        if (arg2 < class128.field2289) {
            var13 = class128.field2289;
        }
        int var14 = arg2 + arg4;
        if (class128.field2289 >= var14) {
            return;
        }
        if (arg9 == 9) {
            arg7 = arg7 + 1 & 0x3;
            arg9 = 1;
        }
        if (var14 > class128.field2292) {
            var14 = class128.field2292;
        }
        int var15 = class128.field2294 + var11 - var12;
        if (arg9 == 10) {
            arg9 = 1;
            arg7 = arg7 + 3 & 0x3;
        }
        int var16 = var12 - arg5;
        int var17 = class128.field2294 * var13 + var11;
        int var18 = var14 - arg2;
        int var19 = var11 - arg5;
        int var20 = arg0 - var16;
        int var21 = arg0 - var19;
        int var22 = var13 - arg2;
        int var23 = arg4 - var18;
        if (arg1 != -86) {
            return;
        }
        if (arg9 == 11) {
            arg9 = 8;
            arg7 = arg7 + 3 & 0x3;
        }
        int var24 = arg4 - var22;
        if (arg9 == 1) {
            if (arg7 == 0) {
                for (int var25 = var22; var25 < var18; var25++) {
                    for (int var26 = var19; var26 < var16; var26++) {
                        if (var25 >= var26) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg7 == 1) {
                for (int var27 = var24 - 1; var27 >= var23; var27--) {
                    for (int var28 = var19; var28 < var16; var28++) {
                        if (var27 >= var28) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg7 == 2) {
                for (int var29 = var22; var29 < var18; var29++) {
                    for (int var30 = var19; var30 < var16; var30++) {
                        if (var30 >= var29) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg7 == 3) {
                for (int var31 = var24 - 1; var31 >= var23; var31--) {
                    for (int var32 = var19; var32 < var16; var32++) {
                        if (var31 <= var32) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            }
        } else if (arg9 == 2) {
            if (arg7 == 0) {
                for (int var33 = var24 - 1; var33 >= var23; var33--) {
                    for (int var34 = var19; var34 < var16; var34++) {
                        if (var34 <= (var33 >> 1)) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg7 == 1) {
                for (int var35 = var22; var35 < var18; var35++) {
                    for (int var36 = var19; var36 < var16; var36++) {
                        if (var17 >= 0 && arg6.length > var17) {
                            if (var35 << 1 <= var36) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg10;
                            }
                            var17++;
                        } else {
                            var17++;
                        }
                    }
                    var17 += var15;
                }
            } else if (arg7 == 2) {
                for (int var37 = var22; var37 < var18; var37++) {
                    for (int var38 = var21 - 1; var38 >= var20; var38--) {
                        if ((var37 >> 1) >= var38) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg7 == 3) {
                for (int var39 = var24 - 1; var39 >= var23; var39--) {
                    for (int var40 = var21 - 1; var40 >= var20; var40--) {
                        if (var39 << 1 <= var40) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            }
        } else if (arg9 == 3) {
            if (arg7 == 0) {
                for (int var41 = var24 - 1; var41 >= var23; var41--) {
                    for (int var42 = var21 - 1; var42 >= var20; var42--) {
                        if (var42 <= (var41 >> 1)) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg7 == 1) {
                for (int var43 = var24 - 1; var43 >= var23; var43--) {
                    for (int var44 = var19; var44 < var16; var44++) {
                        if ((var43 << 1) <= var44) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg7 == 2) {
                for (int var45 = var22; var45 < var18; var45++) {
                    for (int var46 = var19; var46 < var16; var46++) {
                        if ((var45 >> 1) >= var46) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg7 == 3) {
                for (int var47 = var22; var47 < var18; var47++) {
                    for (int var48 = var21 - 1; var48 >= var20; var48--) {
                        if ((var47 << 1) <= var48) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            }
        } else if (arg9 == 4) {
            if (arg7 == 0) {
                for (int var49 = var24 - 1; var49 >= var23; var49--) {
                    for (int var50 = var19; var50 < var16; var50++) {
                        if (var50 >= var49 >> 1) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg7 == 1) {
                for (int var51 = var22; var51 < var18; var51++) {
                    for (int var52 = var19; var52 < var16; var52++) {
                        if (var52 <= (var51 << 1)) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg7 == 2) {
                for (int var53 = var22; var53 < var18; var53++) {
                    for (int var54 = var21 - 1; var54 >= var20; var54--) {
                        if (var53 >> 1 <= var54) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg7 == 3) {
                for (int var55 = var24 - 1; var55 >= var23; var55--) {
                    for (int var56 = var21 - 1; var56 >= var20; var56--) {
                        if ((var55 << 1) >= var56) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            }
        } else if (arg9 != 5) {
            if (arg9 == 6) {
                if (arg7 == 0) {
                    for (int var65 = var22; var65 < var18; var65++) {
                        for (int var66 = var19; var66 < var16; var66++) {
                            if (arg0 / 2 >= var66) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var67 = var22; var67 < var18; var67++) {
                        for (int var68 = var19; var68 < var16; var68++) {
                            if (var67 <= arg4 / 2) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var69 = var22; var69 < var18; var69++) {
                        for (int var70 = var19; var70 < var16; var70++) {
                            if (arg0 / 2 <= var70) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var71 = var22; var71 < var18; var71++) {
                        for (int var72 = var19; var72 < var16; var72++) {
                            if (var71 >= (arg4 / 2)) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
            }
            if (arg9 == 7) {
                if (arg7 == 0) {
                    for (int var73 = var22; var73 < var18; var73++) {
                        for (int var74 = var19; var74 < var16; var74++) {
                            if (var74 <= var73 - (arg4 / 2)) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var75 = var24 - 1; var75 >= var23; var75--) {
                        for (int var76 = var19; var76 < var16; var76++) {
                            if (var76 <= var75 - (arg4 / 2)) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var77 = var24 - 1; var77 >= var23; var77--) {
                        for (int var78 = var21 - 1; var78 >= var20; var78--) {
                            if (var78 <= (var77 - (arg4 / 2))) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var79 = var22; var79 < var18; var79++) {
                        for (int var80 = var21 - 1; var80 >= var20; var80--) {
                            if (var80 <= (var79 - (arg4 / 2))) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
            }
            if (arg9 == 8) {
                if (arg7 == 0) {
                    for (int var81 = var22; var81 < var18; var81++) {
                        for (int var82 = var19; var82 < var16; var82++) {
                            if ((var81 - (arg4 / 2)) <= var82) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var83 = var24 - 1; var83 >= var23; var83--) {
                        for (int var84 = var19; var84 < var16; var84++) {
                            if ((var83 - arg4 / 2) <= var84) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var85 = var24 - 1; var85 >= var23; var85--) {
                        for (int var86 = var21 - 1; var86 >= var20; var86--) {
                            if (var86 >= (var85 - arg4 / 2)) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var87 = var22; var87 < var18; var87++) {
                        for (int var88 = var21 - 1; var88 >= var20; var88--) {
                            if (var88 >= var87 - arg4 / 2) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
            }
        } else if (arg7 == 0) {
            for (int var57 = var24 - 1; var57 >= var23; var57--) {
                for (int var58 = var21 - 1; var58 >= var20; var58--) {
                    if ((var57 >> 1) <= var58) {
                        arg6[var17] = arg3;
                    } else if (arg8) {
                        arg6[var17] = arg10;
                    }
                    var17++;
                }
                var17 += var15;
            }
        } else if (arg7 == 1) {
            for (int var59 = var24 - 1; var59 >= var23; var59--) {
                for (int var60 = var19; var60 < var16; var60++) {
                    if (var60 <= (var59 << 1)) {
                        arg6[var17] = arg3;
                    } else if (arg8) {
                        arg6[var17] = arg10;
                    }
                    var17++;
                }
                var17 += var15;
            }
        } else if (arg7 == 2) {
            for (int var61 = var22; var61 < var18; var61++) {
                for (int var62 = var19; var62 < var16; var62++) {
                    if (var61 >> 1 <= var62) {
                        arg6[var17] = arg3;
                    } else if (arg8) {
                        arg6[var17] = arg10;
                    }
                    var17++;
                }
                var17 += var15;
            }
        } else if (arg7 == 3) {
            for (int var63 = var22; var63 < var18; var63++) {
                for (int var64 = var21 - 1; var64 >= var20; var64--) {
                    if (var64 <= var63 << 1) {
                        arg6[var17] = arg3;
                    } else if (arg8) {
                        arg6[var17] = arg10;
                    }
                    var17++;
                }
                var17 += var15;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
    public static final void method99(byte arg0) {
        field218++;
        if (arg0 == -44 && class202.field3452) {
            class202.field3452 = false;
            class189.field3271 = null;
            class81.field1424 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(III)V")
    public class10(int arg0, int arg1, int arg2) {
        this.field213 = arg2;
        this.field216 = arg0;
        this.field211 = arg1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILjava/awt/Component;Lkh;I)Lph;")
    public static final class229 method100(int arg0, int arg1, Component arg2, class5 arg3, int arg4) {
        field214++;
        if (class253.field4432 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class229 var5 = (class229) Class.forName("ka").getDeclaredConstructor().newInstance();
                var5.field3955 = arg1;
                var5.field3940 = new int[(class61.field1028 ? 2 : 1) * 256];
                var5.method1102(arg2);
                var5.field3954 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field3954 > 16384) {
                    var5.field3954 = 16384;
                }
                var5.method1104(var5.field3954);
                if (class196.field3382 > 0 && class184.field3167 == null) {
                    class184.field3167 = new class110();
                    class184.field3167.field1958 = arg3;
                    arg3.method32(class184.field3167, class196.field3382, (byte) -121);
                }
                if (class184.field3167 != null) {
                    if (class184.field3167.field1962[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class184.field3167.field1962[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    if (arg0 >= -100) {
                        return null;
                    }
                    class149 var6 = new class149(arg3, arg4);
                    var6.field3940 = new int[(class61.field1028 ? 2 : 1) * 256];
                    var6.field3955 = arg1;
                    var6.method1102(arg2);
                    var6.field3954 = 16384;
                    var6.method1104(var6.field3954);
                    if (class196.field3382 > 0 && class184.field3167 == null) {
                        class184.field3167 = new class110();
                        class184.field3167.field1958 = arg3;
                        arg3.method32(class184.field3167, class196.field3382, (byte) -121);
                    }
                    if (class184.field3167 != null) {
                        if (class184.field3167.field1962[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class184.field3167.field1962[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class229();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZI)V")
    public abstract void method101(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(IZI)V")
    public abstract void method102(int arg0, boolean arg1, int arg2);
}
