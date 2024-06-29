import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class74 {

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Lce;")
    private static class126 field1196 = class206.method1445(-7923, "Loaded interfaces");

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field1186 = 0;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "Z")
    public static boolean field1200 = true;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "Lce;")
    public static class126 field1202 = field1196;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "F")
    public static float field1194;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public int field1190;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public int field1192;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "J")
    public long field1201;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Lwd;")
    public static class112 field1197;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Lja;")
    public class114 field1188;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Lja;")
    public class114 field1191;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "Lja;")
    public class114 field1193;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "[Ljk;")
    public static class273[] field1195;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lcc;ILck;ZLcc;)V", line = 15)
    public static final void method535(class313 arg0, int arg1, class275 arg2, boolean arg3, class313 arg4) {
        class5.field66 = arg3;
        class317.field5437 = arg0;
        class26.field362 = arg4;
        field1183++;
        int var5 = arg1 + class317.field5437.method2174(0);
        class68.field1118 = class317.field5437.method2165(0, var5) + var5 * 256;
        class322.field5501 = arg2;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[I)[I", line = 37)
    public static final int[] method536(int arg0, int[] arg1) {
        field1203++;
        if (arg1 == null) {
            return null;
        } else if (arg0 == -1734678527) {
            int[] var2 = new int[arg1.length];
            class230.method1568(arg1, 0, var2, 0, arg1.length);
            return var2;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 63)
    public static void method537(int arg0) {
        field1202 = null;
        field1197 = null;
        field1196 = null;
        if (arg0 < 87) {
            method535((class313) null, -128, (class275) null, false, (class313) null);
        }
        field1195 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILcc;Lcc;)V", line = 81)
    public static final void method538(int arg0, class313 arg1, class313 arg2) {
        field1184++;
        if (arg0 != 2) {
            method538(-125, (class313) null, (class313) null);
        }
        class21.field277 = arg2;
        class168.field2999 = arg1;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIZIIII[I)V", line = 100)
    public static final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        int var11 = arg7;
        field1198++;
        if (arg7 >= class276.field4622) {
            return;
        }
        if (class276.field4625 > arg7) {
            var11 = class276.field4625;
        }
        int var12 = arg2 + arg7;
        if (var12 <= class276.field4625) {
            return;
        }
        int var13 = arg9;
        if (var12 > class276.field4622) {
            var12 = class276.field4622;
        }
        if (class276.field4621 <= arg9) {
            return;
        }
        if (class276.field4627 > arg9) {
            var13 = class276.field4627;
        }
        int var14 = arg9 + arg8;
        if (class276.field4627 >= var14) {
            return;
        }
        if (class276.field4621 < var14) {
            var14 = class276.field4621;
        }
        int var15 = var14 - arg9;
        if (arg0 == 9) {
            arg4 = arg4 + 1 & 0x3;
            arg0 = 1;
        }
        int var16 = class276.field4619 * var13 + var11;
        if (arg0 == 10) {
            arg0 = 1;
            arg4 = arg4 + 3 & 0x3;
        }
        int var17 = var13 - arg9;
        int var18 = var11 + class276.field4619 - var12;
        int var19 = var11 - arg7;
        if (arg0 == 11) {
            arg0 = 8;
            arg4 = arg4 + 3 & 0x3;
        }
        if (arg3 > -43) {
            field1202 = (class126) null;
        }
        int var20 = var12 - arg7;
        int var21 = arg2 - var20;
        int var22 = arg2 - var19;
        int var23 = arg8 - var15;
        int var24 = arg8 - var17;
        if (arg0 == 1) {
            if (arg4 == 0) {
                for (int var81 = var17; var81 < var15; var81++) {
                    for (int var82 = var19; var82 < var20; var82++) {
                        if (var82 <= var81) {
                            arg10[var16] = arg6;
                        } else if (arg5) {
                            arg10[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg4 == 1) {
                for (int var83 = var24 - 1; var83 >= var23; var83--) {
                    for (int var84 = var19; var84 < var20; var84++) {
                        if (var84 <= var83) {
                            arg10[var16] = arg6;
                        } else if (arg5) {
                            arg10[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg4 == 2) {
                for (int var87 = var17; var87 < var15; var87++) {
                    for (int var88 = var19; var88 < var20; var88++) {
                        if (var87 <= var88) {
                            arg10[var16] = arg6;
                        } else if (arg5) {
                            arg10[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg4 == 3) {
                for (int var85 = var24 - 1; var85 >= var23; var85--) {
                    for (int var86 = var19; var86 < var20; var86++) {
                        if (var86 >= var85) {
                            arg10[var16] = arg6;
                        } else if (arg5) {
                            arg10[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg0 == 2) {
            if (arg4 == 0) {
                for (int var25 = var24 - 1; var25 >= var23; var25--) {
                    for (int var26 = var19; var26 < var20; var26++) {
                        if (var25 >> 1 >= var26) {
                            arg10[var16] = arg6;
                        } else if (arg5) {
                            arg10[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg4 == 1) {
                for (int var27 = var17; var27 < var15; var27++) {
                    for (int var28 = var19; var28 < var20; var28++) {
                        if (var16 >= 0 && var16 < arg10.length) {
                            if (var28 >= (var27 << 1)) {
                                arg10[var16] = arg6;
                            } else if (arg5) {
                                arg10[var16] = arg1;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var18;
                }
            } else if (arg4 == 2) {
                for (int var31 = var17; var31 < var15; var31++) {
                    for (int var32 = var22 - 1; var32 >= var21; var32--) {
                        if (var31 >> 1 >= var32) {
                            arg10[var16] = arg6;
                        } else if (arg5) {
                            arg10[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg4 == 3) {
                for (int var29 = var24 - 1; var29 >= var23; var29--) {
                    for (int var30 = var22 - 1; var30 >= var21; var30--) {
                        if ((var29 << 1) <= var30) {
                            arg10[var16] = arg6;
                        } else if (arg5) {
                            arg10[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg0 == 3) {
            if (arg4 == 0) {
                for (int var79 = var24 - 1; var79 >= var23; var79--) {
                    for (int var80 = var22 - 1; var80 >= var21; var80--) {
                        if ((var79 >> 1) >= var80) {
                            arg10[var16] = arg6;
                        } else if (arg5) {
                            arg10[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg4 == 1) {
                for (int var73 = var24 - 1; var73 >= var23; var73--) {
                    for (int var74 = var19; var74 < var20; var74++) {
                        if ((var73 << 1) <= var74) {
                            arg10[var16] = arg6;
                        } else if (arg5) {
                            arg10[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg4 == 2) {
                for (int var75 = var17; var75 < var15; var75++) {
                    for (int var76 = var19; var76 < var20; var76++) {
                        if (var76 <= (var75 >> 1)) {
                            arg10[var16] = arg6;
                        } else if (arg5) {
                            arg10[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg4 == 3) {
                for (int var77 = var17; var77 < var15; var77++) {
                    for (int var78 = var22 - 1; var78 >= var21; var78--) {
                        if (var78 >= (var77 << 1)) {
                            arg10[var16] = arg6;
                        } else if (arg5) {
                            arg10[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg0 == 4) {
            if (arg4 == 0) {
                for (int var33 = var24 - 1; var33 >= var23; var33--) {
                    for (int var34 = var19; var34 < var20; var34++) {
                        if (var33 >> 1 <= var34) {
                            arg10[var16] = arg6;
                        } else if (arg5) {
                            arg10[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg4 == 1) {
                for (int var35 = var17; var35 < var15; var35++) {
                    for (int var36 = var19; var36 < var20; var36++) {
                        if (var36 <= (var35 << 1)) {
                            arg10[var16] = arg6;
                        } else if (arg5) {
                            arg10[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg4 == 2) {
                for (int var39 = var17; var39 < var15; var39++) {
                    for (int var40 = var22 - 1; var40 >= var21; var40--) {
                        if (var39 >> 1 <= var40) {
                            arg10[var16] = arg6;
                        } else if (arg5) {
                            arg10[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg4 == 3) {
                for (int var37 = var24 - 1; var37 >= var23; var37--) {
                    for (int var38 = var22 - 1; var38 >= var21; var38--) {
                        if (var37 << 1 >= var38) {
                            arg10[var16] = arg6;
                        } else if (arg5) {
                            arg10[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg0 != 5) {
            if (arg0 == 6) {
                if (arg4 == 0) {
                    for (int var63 = var17; var63 < var15; var63++) {
                        for (int var64 = var19; var64 < var20; var64++) {
                            if (arg2 / 2 >= var64) {
                                arg10[var16] = arg6;
                            } else if (arg5) {
                                arg10[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg4 == 1) {
                    for (int var41 = var17; var41 < var15; var41++) {
                        for (int var42 = var19; var42 < var20; var42++) {
                            if (var41 <= (arg8 / 2)) {
                                arg10[var16] = arg6;
                            } else if (arg5) {
                                arg10[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg4 == 2) {
                    for (int var61 = var17; var61 < var15; var61++) {
                        for (int var62 = var19; var62 < var20; var62++) {
                            if (var62 >= arg2 / 2) {
                                arg10[var16] = arg6;
                            } else if (arg5) {
                                arg10[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg4 == 3) {
                    for (int var59 = var17; var59 < var15; var59++) {
                        for (int var60 = var19; var60 < var20; var60++) {
                            if (arg8 / 2 <= var59) {
                                arg10[var16] = arg6;
                            } else if (arg5) {
                                arg10[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg0 == 7) {
                if (arg4 == 0) {
                    for (int var43 = var17; var43 < var15; var43++) {
                        for (int var44 = var19; var44 < var20; var44++) {
                            if (var44 <= var43 - (arg8 / 2)) {
                                arg10[var16] = arg6;
                            } else if (arg5) {
                                arg10[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg4 == 1) {
                    for (int var45 = var24 - 1; var45 >= var23; var45--) {
                        for (int var46 = var19; var46 < var20; var46++) {
                            if (var46 <= (var45 - arg8 / 2)) {
                                arg10[var16] = arg6;
                            } else if (arg5) {
                                arg10[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg4 == 2) {
                    for (int var47 = var24 - 1; var47 >= var23; var47--) {
                        for (int var48 = var22 - 1; var48 >= var21; var48--) {
                            if (var48 <= var47 - (arg8 / 2)) {
                                arg10[var16] = arg6;
                            } else if (arg5) {
                                arg10[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg4 == 3) {
                    for (int var49 = var17; var49 < var15; var49++) {
                        for (int var50 = var22 - 1; var50 >= var21; var50--) {
                            if (var50 <= var49 - (arg8 / 2)) {
                                arg10[var16] = arg6;
                            } else if (arg5) {
                                arg10[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg0 == 8) {
                if (arg4 == 0) {
                    for (int var51 = var17; var51 < var15; var51++) {
                        for (int var52 = var19; var52 < var20; var52++) {
                            if ((var51 - arg8 / 2) <= var52) {
                                arg10[var16] = arg6;
                            } else if (arg5) {
                                arg10[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg4 == 1) {
                    for (int var53 = var24 - 1; var53 >= var23; var53--) {
                        for (int var54 = var19; var54 < var20; var54++) {
                            if (var53 - (arg8 / 2) <= var54) {
                                arg10[var16] = arg6;
                            } else if (arg5) {
                                arg10[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg4 == 2) {
                    for (int var57 = var24 - 1; var57 >= var23; var57--) {
                        for (int var58 = var22 - 1; var58 >= var21; var58--) {
                            if (var57 - arg8 / 2 <= var58) {
                                arg10[var16] = arg6;
                            } else if (arg5) {
                                arg10[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg4 == 3) {
                    for (int var55 = var17; var55 < var15; var55++) {
                        for (int var56 = var22 - 1; var56 >= var21; var56--) {
                            if (var56 >= (var55 - (arg8 / 2))) {
                                arg10[var16] = arg6;
                            } else if (arg5) {
                                arg10[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
        } else if (arg4 == 0) {
            for (int var71 = var24 - 1; var71 >= var23; var71--) {
                for (int var72 = var22 - 1; var72 >= var21; var72--) {
                    if ((var71 >> 1) <= var72) {
                        arg10[var16] = arg6;
                    } else if (arg5) {
                        arg10[var16] = arg1;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg4 == 1) {
            for (int var69 = var24 - 1; var69 >= var23; var69--) {
                for (int var70 = var19; var70 < var20; var70++) {
                    if (var69 << 1 >= var70) {
                        arg10[var16] = arg6;
                    } else if (arg5) {
                        arg10[var16] = arg1;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg4 == 2) {
            for (int var67 = var17; var67 < var15; var67++) {
                for (int var68 = var19; var68 < var20; var68++) {
                    if ((var67 >> 1) <= var68) {
                        arg10[var16] = arg6;
                    } else if (arg5) {
                        arg10[var16] = arg1;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg4 == 3) {
            for (int var65 = var17; var65 < var15; var65++) {
                for (int var66 = var22 - 1; var66 >= var21; var66--) {
                    if ((var65 << 1) >= var66) {
                        arg10[var16] = arg6;
                    } else if (arg5) {
                        arg10[var16] = arg1;
                    }
                    var16++;
                }
                var16 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V", line = 1295)
    public static final void method540(int arg0) {
        for (class65 var1 = (class65) class16.field222.method1630((byte) 56); var1 != null; var1 = (class65) class16.field222.method1632(-101)) {
            int var2 = var1.field1097;
            if (class13.method75(var2, (byte) -83)) {
                boolean var3 = true;
                class112[] var4 = class291.field4825[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field1916;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field1117;
                    class112 var7 = class252.method1706(5157, var6);
                    if (var7 != null) {
                        class23.method114(var7, (byte) 94);
                    }
                }
            }
        }
        if (arg0 != 0) {
            method540(90);
        }
        field1185++;
    }
}
