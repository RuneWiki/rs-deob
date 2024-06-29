import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class164 {

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "Lwa;")
    public static class75 field2782 = class66.method560("mem=", false);

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field2783 = 255;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "Lwa;")
    public static class75 field2781 = class66.method560(" )2> <col=00ffff>", false);

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "[I")
    public static int[] field2788;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "[[[B")
    public static byte[][][] field2786;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 14)
    public static void method1225(int arg0) {
        field2782 = null;
        field2786 = (byte[][][]) null;
        field2781 = null;
        field2788 = null;
        if (arg0 != -24536) {
            method1228((Object) null, true, (byte) -44);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BIIIIIZI[III)V", line = 38)
    public static final void method1226(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int[] arg8, int arg9, int arg10) {
        field2785++;
        int var11 = arg7;
        if (arg7 >= class44.field714) {
            return;
        }
        if (arg7 < class44.field715) {
            var11 = class44.field715;
        }
        int var12 = arg7 + arg5;
        if (var12 <= class44.field715) {
            return;
        }
        if (var12 > class44.field714) {
            var12 = class44.field714;
        }
        int var13 = arg9;
        if (arg9 >= class44.field720) {
            return;
        }
        if (arg9 < class44.field719) {
            var13 = class44.field719;
        }
        int var14 = arg2 + arg9;
        if (class44.field719 >= var14) {
            return;
        }
        if (arg3 == 9) {
            arg3 = 1;
            arg1 = arg1 + 1 & 0x3;
        }
        if (var14 > class44.field720) {
            var14 = class44.field720;
        }
        if (arg3 == 10) {
            arg1 = arg1 + 3 & 0x3;
            arg3 = 1;
        }
        int var15 = class44.field717 * var13 + var11;
        if (arg3 == 11) {
            arg1 = arg1 + 3 & 0x3;
            arg3 = 8;
        }
        int var16 = var14 - arg9;
        int var17 = class44.field717 + var11 - var12;
        int var18 = var11 - arg7;
        if (arg0 != -47) {
            return;
        }
        int var19 = arg5 - var18;
        int var20 = var13 - arg9;
        int var21 = arg2 - var16;
        int var22 = var12 - arg7;
        int var23 = arg2 - var20;
        int var24 = arg5 - var22;
        if (arg3 == 1) {
            if (arg1 == 0) {
                for (int var81 = var20; var81 < var16; var81++) {
                    for (int var82 = var18; var82 < var22; var82++) {
                        if (var82 <= var81) {
                            arg8[var15] = arg4;
                        } else if (arg6) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 1) {
                for (int var83 = var23 - 1; var83 >= var21; var83--) {
                    for (int var84 = var18; var84 < var22; var84++) {
                        if (var84 <= var83) {
                            arg8[var15] = arg4;
                        } else if (arg6) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 2) {
                for (int var85 = var20; var85 < var16; var85++) {
                    for (int var86 = var18; var86 < var22; var86++) {
                        if (var85 <= var86) {
                            arg8[var15] = arg4;
                        } else if (arg6) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 3) {
                for (int var87 = var23 - 1; var87 >= var21; var87--) {
                    for (int var88 = var18; var88 < var22; var88++) {
                        if (var87 <= var88) {
                            arg8[var15] = arg4;
                        } else if (arg6) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg3 == 2) {
            if (arg1 == 0) {
                for (int var25 = var23 - 1; var25 >= var21; var25--) {
                    for (int var26 = var18; var26 < var22; var26++) {
                        if (var26 <= var25 >> 1) {
                            arg8[var15] = arg4;
                        } else if (arg6) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 1) {
                for (int var27 = var20; var27 < var16; var27++) {
                    for (int var28 = var18; var28 < var22; var28++) {
                        if (var15 >= 0 && var15 < arg8.length) {
                            if ((var27 << 1) <= var28) {
                                arg8[var15] = arg4;
                            } else if (arg6) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var17;
                }
            } else if (arg1 == 2) {
                for (int var31 = var20; var31 < var16; var31++) {
                    for (int var32 = var19 - 1; var32 >= var24; var32--) {
                        if (var32 <= (var31 >> 1)) {
                            arg8[var15] = arg4;
                        } else if (arg6) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 3) {
                for (int var29 = var23 - 1; var29 >= var21; var29--) {
                    for (int var30 = var19 - 1; var30 >= var24; var30--) {
                        if (var30 >= (var29 << 1)) {
                            arg8[var15] = arg4;
                        } else if (arg6) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg3 == 3) {
            if (arg1 == 0) {
                for (int var39 = var23 - 1; var39 >= var21; var39--) {
                    for (int var40 = var19 - 1; var40 >= var24; var40--) {
                        if (var39 >> 1 >= var40) {
                            arg8[var15] = arg4;
                        } else if (arg6) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 1) {
                for (int var33 = var23 - 1; var33 >= var21; var33--) {
                    for (int var34 = var18; var34 < var22; var34++) {
                        if (var34 >= var33 << 1) {
                            arg8[var15] = arg4;
                        } else if (arg6) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 2) {
                for (int var35 = var20; var35 < var16; var35++) {
                    for (int var36 = var18; var36 < var22; var36++) {
                        if (var35 >> 1 >= var36) {
                            arg8[var15] = arg4;
                        } else if (arg6) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 3) {
                for (int var37 = var20; var37 < var16; var37++) {
                    for (int var38 = var19 - 1; var38 >= var24; var38--) {
                        if ((var37 << 1) <= var38) {
                            arg8[var15] = arg4;
                        } else if (arg6) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg3 == 4) {
            if (arg1 == 0) {
                for (int var79 = var23 - 1; var79 >= var21; var79--) {
                    for (int var80 = var18; var80 < var22; var80++) {
                        if ((var79 >> 1) <= var80) {
                            arg8[var15] = arg4;
                        } else if (arg6) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 1) {
                for (int var77 = var20; var77 < var16; var77++) {
                    for (int var78 = var18; var78 < var22; var78++) {
                        if (var78 <= (var77 << 1)) {
                            arg8[var15] = arg4;
                        } else if (arg6) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 2) {
                for (int var73 = var20; var73 < var16; var73++) {
                    for (int var74 = var19 - 1; var74 >= var24; var74--) {
                        if (var73 >> 1 <= var74) {
                            arg8[var15] = arg4;
                        } else if (arg6) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 3) {
                for (int var75 = var23 - 1; var75 >= var21; var75--) {
                    for (int var76 = var19 - 1; var76 >= var24; var76--) {
                        if ((var75 << 1) >= var76) {
                            arg8[var15] = arg4;
                        } else if (arg6) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg3 != 5) {
            if (arg3 == 6) {
                if (arg1 == 0) {
                    for (int var41 = var20; var41 < var16; var41++) {
                        for (int var42 = var18; var42 < var22; var42++) {
                            if (arg5 / 2 >= var42) {
                                arg8[var15] = arg4;
                            } else if (arg6) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var43 = var20; var43 < var16; var43++) {
                        for (int var44 = var18; var44 < var22; var44++) {
                            if (arg2 / 2 >= var43) {
                                arg8[var15] = arg4;
                            } else if (arg6) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var47 = var20; var47 < var16; var47++) {
                        for (int var48 = var18; var48 < var22; var48++) {
                            if (var48 >= arg5 / 2) {
                                arg8[var15] = arg4;
                            } else if (arg6) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var45 = var20; var45 < var16; var45++) {
                        for (int var46 = var18; var46 < var22; var46++) {
                            if (var45 >= (arg2 / 2)) {
                                arg8[var15] = arg4;
                            } else if (arg6) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
            }
            if (arg3 == 7) {
                if (arg1 == 0) {
                    for (int var49 = var20; var49 < var16; var49++) {
                        for (int var50 = var18; var50 < var22; var50++) {
                            if (var50 <= var49 - (arg2 / 2)) {
                                arg8[var15] = arg4;
                            } else if (arg6) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var63 = var23 - 1; var63 >= var21; var63--) {
                        for (int var64 = var18; var64 < var22; var64++) {
                            if (var64 <= (var63 - (arg2 / 2))) {
                                arg8[var15] = arg4;
                            } else if (arg6) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var51 = var23 - 1; var51 >= var21; var51--) {
                        for (int var52 = var19 - 1; var52 >= var24; var52--) {
                            if (var52 <= (var51 - (arg2 / 2))) {
                                arg8[var15] = arg4;
                            } else if (arg6) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var61 = var20; var61 < var16; var61++) {
                        for (int var62 = var19 - 1; var62 >= var24; var62--) {
                            if ((var61 - (arg2 / 2)) >= var62) {
                                arg8[var15] = arg4;
                            } else if (arg6) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
            }
            if (arg3 == 8) {
                if (arg1 == 0) {
                    for (int var59 = var20; var59 < var16; var59++) {
                        for (int var60 = var18; var60 < var22; var60++) {
                            if ((var59 - (arg2 / 2)) <= var60) {
                                arg8[var15] = arg4;
                            } else if (arg6) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var57 = var23 - 1; var57 >= var21; var57--) {
                        for (int var58 = var18; var58 < var22; var58++) {
                            if (var58 >= (var57 - (arg2 / 2))) {
                                arg8[var15] = arg4;
                            } else if (arg6) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var55 = var23 - 1; var55 >= var21; var55--) {
                        for (int var56 = var19 - 1; var56 >= var24; var56--) {
                            if (var56 >= (var55 - (arg2 / 2))) {
                                arg8[var15] = arg4;
                            } else if (arg6) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var53 = var20; var53 < var16; var53++) {
                        for (int var54 = var19 - 1; var54 >= var24; var54--) {
                            if (var54 >= (var53 - (arg2 / 2))) {
                                arg8[var15] = arg4;
                            } else if (arg6) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
            }
        } else if (arg1 == 0) {
            for (int var65 = var23 - 1; var65 >= var21; var65--) {
                for (int var66 = var19 - 1; var66 >= var24; var66--) {
                    if (var65 >> 1 <= var66) {
                        arg8[var15] = arg4;
                    } else if (arg6) {
                        arg8[var15] = arg10;
                    }
                    var15++;
                }
                var15 += var17;
            }
        } else if (arg1 == 1) {
            for (int var71 = var23 - 1; var71 >= var21; var71--) {
                for (int var72 = var18; var72 < var22; var72++) {
                    if (var72 <= var71 << 1) {
                        arg8[var15] = arg4;
                    } else if (arg6) {
                        arg8[var15] = arg10;
                    }
                    var15++;
                }
                var15 += var17;
            }
        } else if (arg1 == 2) {
            for (int var69 = var20; var69 < var16; var69++) {
                for (int var70 = var18; var70 < var22; var70++) {
                    if (var70 >= var69 >> 1) {
                        arg8[var15] = arg4;
                    } else if (arg6) {
                        arg8[var15] = arg10;
                    }
                    var15++;
                }
                var15 += var17;
            }
        } else if (arg1 == 3) {
            for (int var67 = var20; var67 < var16; var67++) {
                for (int var68 = var19 - 1; var68 >= var24; var68--) {
                    if (var67 << 1 >= var68) {
                        arg8[var15] = arg4;
                    } else if (arg6) {
                        arg8[var15] = arg10;
                    }
                    var15++;
                }
                var15 += var17;
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lwa;IBLwa;)V", line = 1245)
    public static final void method1227(class75 arg0, int arg1, byte arg2, class75 arg3) {
        class117.field1991 = arg1;
        field2789++;
        class121.field2046 = arg3;
        class121.field2044 = arg0;
        class167.field2825 = false;
        class296.field5075 = 0;
        if (class121.field2044.method660(class121.field2037, arg2 ^ 0x2D) || class121.field2046.method660(class121.field2037, -118)) {
            class207.field3498 = 0;
            class69.field1183 = 3;
            return;
        }
        if (arg2 != 120) {
            method1226((byte) -97, 74, -45, -108, 105, 95, true, -39, (int[]) null, -86, -47);
        }
        class229.field3899 = 0;
        class186.field3102 = 0;
        class207.field3498 = 1;
        class69.field1183 = -3;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B", line = 1272)
    public static final byte[] method1228(Object arg0, boolean arg1, byte arg2) {
        field2784++;
        if (arg0 == null) {
            return null;
        } else if ((arg0 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg0);
            return arg1 ? class118.method900((byte) -37, var4) : var4;
        } else if ((arg0 instanceof class112)) {
            class112 var3 = (class112) arg0;
            return var3.method179((byte) 121);
        } else if (arg2 == -114) {
            throw new IllegalArgumentException();
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILja;)Lil;", line = 1310)
    public static final class53 method1229(int arg0, class60 arg1) {
        arg1.method501(arg0 + arg0);
        field2787++;
        int var2 = arg1.method501(0);
        class53 var3 = class69.method587(var2, true);
        var3.field886 = arg1.method501(0);
        int var4 = arg1.method501(0);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method501(0);
            var3.method54(var6, arg1, true);
        }
        var3.method56((byte) -79);
        return var3;
    }
}
