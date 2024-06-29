import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class9 {

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public int field183 = -1;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public int field180 = 0;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public int field178 = 1190717;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public int field188 = 128;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "Z")
    public boolean field185 = false;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "Z")
    public boolean field193 = true;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public int field190 = 16;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    public int field198 = -1;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public int field201 = 8;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "Z")
    public boolean field199 = true;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "[I")
    public static int[] field181 = new int[2000];

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "Lok;")
    private static class146 field179 = class235.method1724(-12908, "Loaded update list");

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "Z")
    public static boolean field186 = false;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "Lok;")
    public static class146 field195 = class235.method1724(-12908, "Chargement des fichiers config )2 ");

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "Lok;")
    public static class146 field196 = class235.method1724(-12908, "M-Bmoire en cours d(Wattribution");

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "Lok;")
    public static class146 field197 = field179;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "Lok;")
    public static class146 field200 = class235.method1724(-12908, "(R");

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Lhd;")
    public static class117 field177 = new class117(200);

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "Llc;")
    public static class160 field202 = new class160();

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "Lje;")
    public static class70 field187;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lcj;)V", line = 5)
    public static final void method61(class311 arg0) {
        for (int var1 = arg0.field5296; var1 <= arg0.field5302; var1++) {
            for (int var2 = arg0.field5294; var2 <= arg0.field5299; var2++) {
                class11 var3 = class203.field3382[arg0.field5292][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field218; var4++) {
                        if (var3.field217[var4] == arg0) {
                            var3.field218--;
                            for (int var5 = var4; var5 < var3.field218; var5++) {
                                var3.field217[var5] = var3.field217[var5 + 1];
                                var3.field214[var5] = var3.field214[var5 + 1];
                            }
                            var3.field217[var3.field218] = null;
                            break;
                        }
                    }
                    var3.field221 = 0;
                    for (int var6 = 0; var6 < var3.field218; var6++) {
                        var3.field221 |= var3.field214[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lwe;II)V", line = 63)
    public final void method62(class47 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            return;
        }
        while (true) {
            int var4 = arg0.method368(54);
            if (var4 == 0) {
                field184++;
                return;
            }
            this.method63(var4, -24573, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILwe;I)V", line = 110)
    private final void method63(int arg0, int arg1, class47 arg2, int arg3) {
        if (arg0 == 1) {
            this.field180 = class128.method875(32767, arg2.method389((byte) 28));
        } else if (arg0 == 2) {
            this.field198 = arg2.method368(arg1 ^ 0xFFFFA07E);
        } else if (arg0 == 3) {
            this.field198 = arg2.method379(-2);
            if (this.field198 == 65535) {
                this.field198 = -1;
            }
        } else if (arg0 == 5) {
            this.field193 = false;
        } else if (arg0 == 7) {
            this.field183 = class128.method875(32767, arg2.method389((byte) 29));
        } else if (arg0 == 8) {
            class276.field4743 = arg3;
        } else if (arg0 == 9) {
            this.field188 = arg2.method379(arg1 + 24571);
        } else if (arg0 == 10) {
            this.field199 = false;
        } else if (arg0 == 11) {
            this.field201 = arg2.method368(31);
        } else if (arg0 == 12) {
            this.field185 = true;
        } else if (arg0 == 13) {
            this.field178 = arg2.method389((byte) 120);
        } else if (arg0 == 14) {
            this.field190 = arg2.method368(arg1 ^ 0x5F97);
        }
        if (arg1 != -24573) {
            this.method62((class47) null, -83, 123);
        }
        field192++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)I", line = 182)
    public static final int method64(int arg0, int arg1) {
        if (arg1 >= -10) {
            return -122;
        } else {
            field191++;
            return arg0 >> 18 & 0x7;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BIIZIIIII[II)V", line = 195)
    public static final void method65(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        field182++;
        int var11 = arg1;
        if (class181.field3033 <= arg1) {
            return;
        }
        int var12 = arg1 + arg8;
        if (class181.field3038 > arg1) {
            var11 = class181.field3038;
        }
        if (class181.field3038 >= var12) {
            return;
        }
        if (class181.field3033 < var12) {
            var12 = class181.field3033;
        }
        int var13 = arg4;
        if (class181.field3041 <= arg4) {
            return;
        }
        int var14 = arg4 + arg5;
        if (arg4 < class181.field3036) {
            var13 = class181.field3036;
        }
        if (class181.field3036 >= var14) {
            return;
        }
        if (var14 > class181.field3041) {
            var14 = class181.field3041;
        }
        if (arg10 == 9) {
            arg10 = 1;
            arg6 = arg6 + 1 & 0x3;
        }
        if (arg10 == 10) {
            arg6 = arg6 + 3 & 0x3;
            arg10 = 1;
        }
        if (arg10 == 11) {
            arg6 = arg6 + 3 & 0x3;
            arg10 = 8;
        }
        int var15 = class181.field3034 * var13 + var11;
        int var16 = var13 - arg4;
        int var17 = var14 - arg4;
        int var18 = class181.field3034 + var11 - var12;
        int var19 = var12 - arg1;
        int var20 = arg8 - var19;
        int var21 = var11 - arg1;
        int var22 = arg5 - var17;
        int var23 = arg5 - var16;
        int var24 = arg8 - var21;
        if (arg0 != -9) {
            method66(-27, -76, (Random) null);
        }
        if (arg10 == 1) {
            if (arg6 == 0) {
                for (int var81 = var16; var81 < var17; var81++) {
                    for (int var82 = var21; var82 < var19; var82++) {
                        if (var82 <= var81) {
                            arg9[var15] = arg7;
                        } else if (arg3) {
                            arg9[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 1) {
                for (int var83 = var23 - 1; var83 >= var22; var83--) {
                    for (int var84 = var21; var84 < var19; var84++) {
                        if (var83 >= var84) {
                            arg9[var15] = arg7;
                        } else if (arg3) {
                            arg9[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 2) {
                for (int var87 = var16; var87 < var17; var87++) {
                    for (int var88 = var21; var88 < var19; var88++) {
                        if (var87 <= var88) {
                            arg9[var15] = arg7;
                        } else if (arg3) {
                            arg9[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 3) {
                for (int var85 = var23 - 1; var85 >= var22; var85--) {
                    for (int var86 = var21; var86 < var19; var86++) {
                        if (var86 >= var85) {
                            arg9[var15] = arg7;
                        } else if (arg3) {
                            arg9[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg10 == 2) {
            if (arg6 == 0) {
                for (int var31 = var23 - 1; var31 >= var22; var31--) {
                    for (int var32 = var21; var32 < var19; var32++) {
                        if ((var31 >> 1) >= var32) {
                            arg9[var15] = arg7;
                        } else if (arg3) {
                            arg9[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 1) {
                for (int var29 = var16; var29 < var17; var29++) {
                    for (int var30 = var21; var30 < var19; var30++) {
                        if (var15 >= 0 && arg9.length > var15) {
                            if ((var29 << 1) <= var30) {
                                arg9[var15] = arg7;
                            } else if (arg3) {
                                arg9[var15] = arg2;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var18;
                }
            } else if (arg6 == 2) {
                for (int var27 = var16; var27 < var17; var27++) {
                    for (int var28 = var24 - 1; var28 >= var20; var28--) {
                        if (var28 <= (var27 >> 1)) {
                            arg9[var15] = arg7;
                        } else if (arg3) {
                            arg9[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 3) {
                for (int var25 = var23 - 1; var25 >= var22; var25--) {
                    for (int var26 = var24 - 1; var26 >= var20; var26--) {
                        if (var26 >= (var25 << 1)) {
                            arg9[var15] = arg7;
                        } else if (arg3) {
                            arg9[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg10 == 3) {
            if (arg6 == 0) {
                for (int var39 = var23 - 1; var39 >= var22; var39--) {
                    for (int var40 = var24 - 1; var40 >= var20; var40--) {
                        if (var39 >> 1 >= var40) {
                            arg9[var15] = arg7;
                        } else if (arg3) {
                            arg9[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 1) {
                for (int var33 = var23 - 1; var33 >= var22; var33--) {
                    for (int var34 = var21; var34 < var19; var34++) {
                        if (var34 >= (var33 << 1)) {
                            arg9[var15] = arg7;
                        } else if (arg3) {
                            arg9[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 2) {
                for (int var37 = var16; var37 < var17; var37++) {
                    for (int var38 = var21; var38 < var19; var38++) {
                        if (var38 <= (var37 >> 1)) {
                            arg9[var15] = arg7;
                        } else if (arg3) {
                            arg9[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 3) {
                for (int var35 = var16; var35 < var17; var35++) {
                    for (int var36 = var24 - 1; var36 >= var20; var36--) {
                        if ((var35 << 1) <= var36) {
                            arg9[var15] = arg7;
                        } else if (arg3) {
                            arg9[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg10 == 4) {
            if (arg6 == 0) {
                for (int var79 = var23 - 1; var79 >= var22; var79--) {
                    for (int var80 = var21; var80 < var19; var80++) {
                        if (var79 >> 1 <= var80) {
                            arg9[var15] = arg7;
                        } else if (arg3) {
                            arg9[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 1) {
                for (int var77 = var16; var77 < var17; var77++) {
                    for (int var78 = var21; var78 < var19; var78++) {
                        if (var77 << 1 >= var78) {
                            arg9[var15] = arg7;
                        } else if (arg3) {
                            arg9[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 2) {
                for (int var73 = var16; var73 < var17; var73++) {
                    for (int var74 = var24 - 1; var74 >= var20; var74--) {
                        if (var74 >= var73 >> 1) {
                            arg9[var15] = arg7;
                        } else if (arg3) {
                            arg9[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg6 == 3) {
                for (int var75 = var23 - 1; var75 >= var22; var75--) {
                    for (int var76 = var24 - 1; var76 >= var20; var76--) {
                        if ((var75 << 1) >= var76) {
                            arg9[var15] = arg7;
                        } else if (arg3) {
                            arg9[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg10 != 5) {
            if (arg10 == 6) {
                if (arg6 == 0) {
                    for (int var63 = var16; var63 < var17; var63++) {
                        for (int var64 = var21; var64 < var19; var64++) {
                            if (var64 <= arg8 / 2) {
                                arg9[var15] = arg7;
                            } else if (arg3) {
                                arg9[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var61 = var16; var61 < var17; var61++) {
                        for (int var62 = var21; var62 < var19; var62++) {
                            if ((arg5 / 2) >= var61) {
                                arg9[var15] = arg7;
                            } else if (arg3) {
                                arg9[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var59 = var16; var59 < var17; var59++) {
                        for (int var60 = var21; var60 < var19; var60++) {
                            if (var60 >= arg8 / 2) {
                                arg9[var15] = arg7;
                            } else if (arg3) {
                                arg9[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var41 = var16; var41 < var17; var41++) {
                        for (int var42 = var21; var42 < var19; var42++) {
                            if (var41 >= (arg5 / 2)) {
                                arg9[var15] = arg7;
                            } else if (arg3) {
                                arg9[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg10 == 7) {
                if (arg6 == 0) {
                    for (int var49 = var16; var49 < var17; var49++) {
                        for (int var50 = var21; var50 < var19; var50++) {
                            if ((var49 - (arg5 / 2)) >= var50) {
                                arg9[var15] = arg7;
                            } else if (arg3) {
                                arg9[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var43 = var23 - 1; var43 >= var22; var43--) {
                        for (int var44 = var21; var44 < var19; var44++) {
                            if (var44 <= var43 - (arg5 / 2)) {
                                arg9[var15] = arg7;
                            } else if (arg3) {
                                arg9[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var45 = var23 - 1; var45 >= var22; var45--) {
                        for (int var46 = var24 - 1; var46 >= var20; var46--) {
                            if (var45 - arg5 / 2 >= var46) {
                                arg9[var15] = arg7;
                            } else if (arg3) {
                                arg9[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var47 = var16; var47 < var17; var47++) {
                        for (int var48 = var24 - 1; var48 >= var20; var48--) {
                            if ((var47 - (arg5 / 2)) >= var48) {
                                arg9[var15] = arg7;
                            } else if (arg3) {
                                arg9[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg10 == 8) {
                if (arg6 == 0) {
                    for (int var57 = var16; var57 < var17; var57++) {
                        for (int var58 = var21; var58 < var19; var58++) {
                            if (var57 - arg5 / 2 <= var58) {
                                arg9[var15] = arg7;
                            } else if (arg3) {
                                arg9[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var51 = var23 - 1; var51 >= var22; var51--) {
                        for (int var52 = var21; var52 < var19; var52++) {
                            if (var52 >= var51 - (arg5 / 2)) {
                                arg9[var15] = arg7;
                            } else if (arg3) {
                                arg9[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var53 = var23 - 1; var53 >= var22; var53--) {
                        for (int var54 = var24 - 1; var54 >= var20; var54--) {
                            if (var53 - arg5 / 2 <= var54) {
                                arg9[var15] = arg7;
                            } else if (arg3) {
                                arg9[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var55 = var16; var55 < var17; var55++) {
                        for (int var56 = var24 - 1; var56 >= var20; var56--) {
                            if ((var55 - arg5 / 2) <= var56) {
                                arg9[var15] = arg7;
                            } else if (arg3) {
                                arg9[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
        } else if (arg6 == 0) {
            for (int var71 = var23 - 1; var71 >= var22; var71--) {
                for (int var72 = var24 - 1; var72 >= var20; var72--) {
                    if (var72 >= (var71 >> 1)) {
                        arg9[var15] = arg7;
                    } else if (arg3) {
                        arg9[var15] = arg2;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg6 == 1) {
            for (int var69 = var23 - 1; var69 >= var22; var69--) {
                for (int var70 = var21; var70 < var19; var70++) {
                    if ((var69 << 1) >= var70) {
                        arg9[var15] = arg7;
                    } else if (arg3) {
                        arg9[var15] = arg2;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg6 == 2) {
            for (int var67 = var16; var67 < var17; var67++) {
                for (int var68 = var21; var68 < var19; var68++) {
                    if (var68 >= var67 >> 1) {
                        arg9[var15] = arg7;
                    } else if (arg3) {
                        arg9[var15] = arg2;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg6 == 3) {
            for (int var65 = var16; var65 < var17; var65++) {
                for (int var66 = var24 - 1; var66 >= var20; var66--) {
                    if (var65 << 1 >= var66) {
                        arg9[var15] = arg7;
                    } else if (arg3) {
                        arg9[var15] = arg2;
                    }
                    var15++;
                }
                var15 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILjava/util/Random;)I", line = 1385)
    public static final int method66(int arg0, int arg1, Random arg2) {
        field189++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class21.method152((byte) -104, arg1)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
            if (arg0 != -482656096) {
                method66(115, 4, (Random) null);
            }
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class92.method637(var4, arg1, arg0 ^ 0xE33B40F9);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V", line = 1416)
    public static void method67(byte arg0) {
        field181 = null;
        field200 = null;
        field179 = null;
        field197 = null;
        field187 = null;
        field202 = null;
        field196 = null;
        field195 = null;
        if (arg0 == -80) {
            field177 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIIIZIIZ)Z", line = 1449)
    public static final boolean method68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, boolean arg11) {
        field175++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class318.field5395[var12][var13] = 0;
                class98.field1588[var12][var13] = 99999999;
            }
        }
        class318.field5395[arg3][arg5] = 99;
        int var14 = arg5;
        class98.field1588[arg3][arg5] = 0;
        int var15 = arg3;
        int var16 = 0;
        byte var17 = 0;
        class191.field3162[var17] = arg3;
        boolean var18 = arg11;
        int var32 = var17 + 1;
        class300.field5077[var17] = arg5;
        int[][] var19 = class251.field4202[class203.field3387].field2392;
        while (var16 != var32) {
            var15 = class191.field3162[var16];
            var14 = class300.field5077[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg9 == var15 && arg0 == var14) {
                var18 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && class251.field4202[class203.field3387].method1067(arg7, var15, 160, arg9, 2, arg0, arg1 - 1, var14)) {
                    var18 = true;
                    break;
                }
                if (arg1 < 10 && class251.field4202[class203.field3387].method1061(var14, arg0, 2, arg1 - 1, var15, arg9, arg7, (byte) -67)) {
                    var18 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg2 != 0 && class251.field4202[class203.field3387].method1072(arg9, 2, arg0, arg4, arg2, (byte) -109, var14, arg6, var15)) {
                var18 = true;
                break;
            }
            int var20 = class98.field1588[var15][var14] + 1;
            if (var15 > 0 && class318.field5395[var15 - 1][var14] == 0 && (var19[var15 - 1][var14] & 0x12C010E) == 0 && (var19[var15 - 1][var14 + 1] & 0x12C0138) == 0) {
                class191.field3162[var32] = var15 - 1;
                class300.field5077[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class318.field5395[var15 - 1][var14] = 2;
                class98.field1588[var15 - 1][var14] = var20;
            }
            if (var15 < 102 && class318.field5395[var15 + 1][var14] == 0 && (var19[var15 + 2][var14] & 0x12C0183) == 0 && (var19[var15 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class191.field3162[var32] = var15 + 1;
                class300.field5077[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class318.field5395[var15 + 1][var14] = 8;
                class98.field1588[var15 + 1][var14] = var20;
            }
            if (var14 > 0 && class318.field5395[var15][var14 - 1] == 0 && (var19[var15][var14 - 1] & 0x12C010E) == 0 && (var19[var15 + 1][var14 - 1] & 0x12C0183) == 0) {
                class191.field3162[var32] = var15;
                class300.field5077[var32] = var14 - 1;
                class318.field5395[var15][var14 - 1] = 1;
                class98.field1588[var15][var14 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 102 && class318.field5395[var15][var14 + 1] == 0 && (var19[var15][var14 + 2] & 0x12C0138) == 0 && (var19[var15 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class191.field3162[var32] = var15;
                class300.field5077[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class318.field5395[var15][var14 + 1] = 4;
                class98.field1588[var15][var14 + 1] = var20;
            }
            if (var15 > 0 && var14 > 0 && class318.field5395[var15 - 1][var14 - 1] == 0 && (var19[var15 - 1][var14] & 0x12C0138) == 0 && (var19[var15 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var15][var14 - 1] & 0x12C0183) == 0) {
                class191.field3162[var32] = var15 - 1;
                class300.field5077[var32] = var14 - 1;
                class318.field5395[var15 - 1][var14 - 1] = 3;
                class98.field1588[var15 - 1][var14 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 < 102 && var14 > 0 && class318.field5395[var15 + 1][var14 - 1] == 0 && (var19[var15 + 1][var14 - 1] & 0x12C010E) == 0 && (var19[var15 + 2][var14 - 1] & 0x12C0183) == 0 && (var19[var15 + 2][var14] & 0x12C01E0) == 0) {
                class191.field3162[var32] = var15 + 1;
                class300.field5077[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class318.field5395[var15 + 1][var14 - 1] = 9;
                class98.field1588[var15 + 1][var14 - 1] = var20;
            }
            if (var15 > 0 && var14 < 102 && class318.field5395[var15 - 1][var14 + 1] == 0 && (var19[var15 - 1][var14 + 1] & 0x12C010E) == 0 && (var19[var15 - 1][var14 + 2] & 0x12C0138) == 0 && (var19[var15][var14 + 2] & 0x12C01E0) == 0) {
                class191.field3162[var32] = var15 - 1;
                class300.field5077[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class318.field5395[var15 - 1][var14 + 1] = 6;
                class98.field1588[var15 - 1][var14 + 1] = var20;
            }
            if (var15 < 102 && var14 < 102 && class318.field5395[var15 + 1][var14 + 1] == 0 && (var19[var15 + 1][var14 + 2] & 0x12C0138) == 0 && (var19[var15 + 2][var14 + 2] & 0x12C01E0) == 0 && (var19[var15 + 2][var14 + 1] & 0x12C0183) == 0) {
                class191.field3162[var32] = var15 + 1;
                class300.field5077[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class318.field5395[var15 + 1][var14 + 1] = 12;
                class98.field1588[var15 + 1][var14 + 1] = var20;
            }
        }
        class201.field3352 = 0;
        if (!var18) {
            if (!arg8) {
                return false;
            }
            int var21 = 100;
            byte var22 = 10;
            int var23 = 1000;
            for (int var24 = arg9 - var22; var24 <= (arg9 + var22); var24++) {
                for (int var25 = arg0 - var22; var25 <= (arg0 + var22); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class98.field1588[var24][var25] < 100) {
                        int var26 = 0;
                        if (var25 < arg0) {
                            var26 = arg0 - var25;
                        } else if ((arg0 + arg2 - 1) < var25) {
                            var26 = var25 + 1 - (arg0 + arg2);
                        }
                        int var27 = 0;
                        if (arg9 > var24) {
                            var27 = arg9 - var24;
                        } else if ((arg6 + arg9 - 1) < var24) {
                            var27 = var24 + 1 - arg6 - arg9;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var23 || var23 == var28 && class98.field1588[var24][var25] < var21) {
                            var23 = var28;
                            var15 = var24;
                            var21 = class98.field1588[var24][var25];
                            var14 = var25;
                        }
                    }
                }
            }
            if (var23 == 1000) {
                return false;
            }
            if (arg3 == var15 && arg5 == var14) {
                return false;
            }
            class201.field3352 = 1;
        }
        byte var29 = 0;
        class191.field3162[var29] = var15;
        int var33 = var29 + 1;
        class300.field5077[var29] = var14;
        int var30;
        int var31 = var30 = class318.field5395[var15][var14];
        while (arg3 != var15 || arg5 != var14) {
            if (var30 != var31) {
                var30 = var31;
                class191.field3162[var33] = var15;
                class300.field5077[var33++] = var14;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            if ((var31 & 0x2) != 0) {
                var15++;
            } else if ((var31 & 0x8) != 0) {
                var15--;
            }
            var31 = class318.field5395[var15][var14];
        }
        if (var33 > 0) {
            class313.method2197(arg10, 0, var33);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
