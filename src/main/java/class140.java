import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class140 extends class128 {

    @OriginalMember(owner = "client!kl", name = "Q", descriptor = "I")
    private int field1959 = 4096;

    @OriginalMember(owner = "client!kl", name = "O", descriptor = "I")
    private int field1957 = 4096;

    @OriginalMember(owner = "client!kl", name = "R", descriptor = "I")
    private int field1960 = 4096;

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "Z")
    public static boolean field1951 = false;

    @OriginalMember(owner = "client!kl", name = "L", descriptor = "Lie;")
    public static class94 field1954 = new class94(5000);

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!kl", name = "P", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!kl", name = "S", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!kl", name = "T", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!kl", name = "U", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "Llc;")
    public static class175 field1952;

    @OriginalMember(owner = "client!kl", name = "M", descriptor = "Llc;")
    public static class175 field1955;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lp;II)V", line = 6)
    public final void method107(class107 arg0, int arg1, int arg2) {
        field1953++;
        if (arg2 >= -85) {
            this.field1957 = -83;
        }
        if (arg1 == 0) {
            this.field1960 = arg0.method624(14612);
        } else if (arg1 == 1) {
            this.field1957 = arg0.method624(14612);
        } else if (arg1 == 2) {
            this.field1959 = arg0.method624(14612);
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V", line = 50)
    public class140() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIII[IIZII)V", line = 57)
    public static final void method929(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field1962++;
        int var11 = arg2;
        if (arg2 >= class144.field2010) {
            return;
        }
        if (class144.field2006 > arg2) {
            var11 = class144.field2006;
        }
        int var12 = arg2 + arg4;
        if (class144.field2006 >= var12) {
            return;
        }
        int var13 = arg10;
        if (var12 > class144.field2010) {
            var12 = class144.field2010;
        }
        if (arg10 >= class144.field2008) {
            return;
        }
        if (class144.field2007 > arg10) {
            var13 = class144.field2007;
        }
        int var14 = arg10 + arg1;
        if (var14 <= class144.field2007) {
            return;
        }
        if (arg0 == 9) {
            arg0 = 1;
            arg5 = arg5 + 1 & 0x3;
        }
        int var15 = class144.field2009 + var11 - var12;
        int var16 = var12 - arg2;
        int var17 = class144.field2009 * var13 + var11;
        if (class144.field2008 < var14) {
            var14 = class144.field2008;
        }
        int var18 = var14 - arg10;
        int var19 = var13 - arg10;
        int var20 = var11 - arg2;
        if (arg0 == 10) {
            arg0 = 1;
            arg5 = arg5 + 3 & 0x3;
        }
        int var21 = arg1 - var18;
        int var22 = arg4 - var16;
        if (arg0 == arg7) {
            arg0 = 8;
            arg5 = arg5 + 3 & 0x3;
        }
        int var23 = arg4 - var20;
        int var24 = arg1 - var19;
        if (arg0 == 1) {
            if (arg5 == 0) {
                for (int var25 = var19; var25 < var18; var25++) {
                    for (int var26 = var20; var26 < var16; var26++) {
                        if (var26 <= var25) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg5 == 1) {
                for (int var31 = var24 - 1; var31 >= var21; var31--) {
                    for (int var32 = var20; var32 < var16; var32++) {
                        if (var32 <= var31) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg5 == 2) {
                for (int var27 = var19; var27 < var18; var27++) {
                    for (int var28 = var20; var28 < var16; var28++) {
                        if (var28 >= var27) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg5 == 3) {
                for (int var29 = var24 - 1; var29 >= var21; var29--) {
                    for (int var30 = var20; var30 < var16; var30++) {
                        if (var29 <= var30) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            }
        } else if (arg0 == 2) {
            if (arg5 == 0) {
                for (int var81 = var24 - 1; var81 >= var21; var81--) {
                    for (int var82 = var20; var82 < var16; var82++) {
                        if (var82 <= (var81 >> 1)) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg5 == 1) {
                for (int var87 = var19; var87 < var18; var87++) {
                    for (int var88 = var20; var88 < var16; var88++) {
                        if (var17 >= 0 && var17 < arg6.length) {
                            if (var88 >= (var87 << 1)) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg9;
                            }
                            var17++;
                        } else {
                            var17++;
                        }
                    }
                    var17 += var15;
                }
            } else if (arg5 == 2) {
                for (int var83 = var19; var83 < var18; var83++) {
                    for (int var84 = var23 - 1; var84 >= var22; var84--) {
                        if ((var83 >> 1) >= var84) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg5 == 3) {
                for (int var85 = var24 - 1; var85 >= var21; var85--) {
                    for (int var86 = var23 - 1; var86 >= var22; var86--) {
                        if (var85 << 1 <= var86) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            }
        } else if (arg0 == 3) {
            if (arg5 == 0) {
                for (int var73 = var24 - 1; var73 >= var21; var73--) {
                    for (int var74 = var23 - 1; var74 >= var22; var74--) {
                        if (var74 <= (var73 >> 1)) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg5 == 1) {
                for (int var75 = var24 - 1; var75 >= var21; var75--) {
                    for (int var76 = var20; var76 < var16; var76++) {
                        if (var75 << 1 <= var76) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg5 == 2) {
                for (int var77 = var19; var77 < var18; var77++) {
                    for (int var78 = var20; var78 < var16; var78++) {
                        if ((var77 >> 1) >= var78) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg5 == 3) {
                for (int var79 = var19; var79 < var18; var79++) {
                    for (int var80 = var23 - 1; var80 >= var22; var80--) {
                        if ((var79 << 1) <= var80) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            }
        } else if (arg0 == 4) {
            if (arg5 == 0) {
                for (int var65 = var24 - 1; var65 >= var21; var65--) {
                    for (int var66 = var20; var66 < var16; var66++) {
                        if (var65 >> 1 <= var66) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg5 == 1) {
                for (int var67 = var19; var67 < var18; var67++) {
                    for (int var68 = var20; var68 < var16; var68++) {
                        if (var68 <= var67 << 1) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg5 == 2) {
                for (int var69 = var19; var69 < var18; var69++) {
                    for (int var70 = var23 - 1; var70 >= var22; var70--) {
                        if (var70 >= (var69 >> 1)) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            } else if (arg5 == 3) {
                for (int var71 = var24 - 1; var71 >= var21; var71--) {
                    for (int var72 = var23 - 1; var72 >= var22; var72--) {
                        if (var72 <= (var71 << 1)) {
                            arg6[var17] = arg3;
                        } else if (arg8) {
                            arg6[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var15;
                }
            }
        } else if (arg0 != 5) {
            if (arg0 == 6) {
                if (arg5 == 0) {
                    for (int var41 = var19; var41 < var18; var41++) {
                        for (int var42 = var20; var42 < var16; var42++) {
                            if ((arg4 / 2) >= var42) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
                if (arg5 == 1) {
                    for (int var63 = var19; var63 < var18; var63++) {
                        for (int var64 = var20; var64 < var16; var64++) {
                            if (arg1 / 2 >= var63) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
                if (arg5 == 2) {
                    for (int var43 = var19; var43 < var18; var43++) {
                        for (int var44 = var20; var44 < var16; var44++) {
                            if (arg4 / 2 <= var44) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
                if (arg5 == 3) {
                    for (int var45 = var19; var45 < var18; var45++) {
                        for (int var46 = var20; var46 < var16; var46++) {
                            if (arg1 / 2 <= var45) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
            }
            if (arg0 == 7) {
                if (arg5 == 0) {
                    for (int var47 = var19; var47 < var18; var47++) {
                        for (int var48 = var20; var48 < var16; var48++) {
                            if (var48 <= (var47 - (arg1 / 2))) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
                if (arg5 == 1) {
                    for (int var49 = var24 - 1; var49 >= var21; var49--) {
                        for (int var50 = var20; var50 < var16; var50++) {
                            if (var49 - (arg1 / 2) >= var50) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
                if (arg5 == 2) {
                    for (int var51 = var24 - 1; var51 >= var21; var51--) {
                        for (int var52 = var23 - 1; var52 >= var22; var52--) {
                            if (var52 <= var51 - (arg1 / 2)) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
                if (arg5 == 3) {
                    for (int var53 = var19; var53 < var18; var53++) {
                        for (int var54 = var23 - 1; var54 >= var22; var54--) {
                            if (var54 <= var53 - arg1 / 2) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
            }
            if (arg0 == 8) {
                if (arg5 == 0) {
                    for (int var61 = var19; var61 < var18; var61++) {
                        for (int var62 = var20; var62 < var16; var62++) {
                            if ((var61 - (arg1 / 2)) <= var62) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
                if (arg5 == 1) {
                    for (int var55 = var24 - 1; var55 >= var21; var55--) {
                        for (int var56 = var20; var56 < var16; var56++) {
                            if (var55 - (arg1 / 2) <= var56) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
                if (arg5 == 2) {
                    for (int var57 = var24 - 1; var57 >= var21; var57--) {
                        for (int var58 = var23 - 1; var58 >= var22; var58--) {
                            if (var57 - arg1 / 2 <= var58) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
                if (arg5 == 3) {
                    for (int var59 = var19; var59 < var18; var59++) {
                        for (int var60 = var23 - 1; var60 >= var22; var60--) {
                            if ((var59 - (arg1 / 2)) <= var60) {
                                arg6[var17] = arg3;
                            } else if (arg8) {
                                arg6[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var15;
                    }
                    return;
                }
            }
        } else if (arg5 == 0) {
            for (int var33 = var24 - 1; var33 >= var21; var33--) {
                for (int var34 = var23 - 1; var34 >= var22; var34--) {
                    if ((var33 >> 1) <= var34) {
                        arg6[var17] = arg3;
                    } else if (arg8) {
                        arg6[var17] = arg9;
                    }
                    var17++;
                }
                var17 += var15;
            }
        } else if (arg5 == 1) {
            for (int var35 = var24 - 1; var35 >= var21; var35--) {
                for (int var36 = var20; var36 < var16; var36++) {
                    if (var36 <= (var35 << 1)) {
                        arg6[var17] = arg3;
                    } else if (arg8) {
                        arg6[var17] = arg9;
                    }
                    var17++;
                }
                var17 += var15;
            }
        } else if (arg5 == 2) {
            for (int var37 = var19; var37 < var18; var37++) {
                for (int var38 = var20; var38 < var16; var38++) {
                    if (var38 >= (var37 >> 1)) {
                        arg6[var17] = arg3;
                    } else if (arg8) {
                        arg6[var17] = arg9;
                    }
                    var17++;
                }
                var17 += var15;
            }
        } else if (arg5 == 3) {
            for (int var39 = var19; var39 < var18; var39++) {
                for (int var40 = var23 - 1; var40 >= var22; var40--) {
                    if (var40 <= (var39 << 1)) {
                        arg6[var17] = arg3;
                    } else if (arg8) {
                        arg6[var17] = arg9;
                    }
                    var17++;
                }
                var17 += var15;
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIII)I", line = 1231)
    public static final int method930(int arg0, int arg1, int arg2, int arg3) {
        field1961++;
        if (arg0 == 24918) {
            return arg3 <= arg1 ? (arg1 > arg2 ? arg2 : arg1) : arg3;
        } else {
            return -69;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIII)V", line = 1242)
    public static final void method931(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class296.field4621 = arg0;
        class345.field5356 = arg2;
        class149.field2066 = arg4;
        class68.field897 = arg1;
        if (arg3 != 1746656908) {
            field1954 = (class94) null;
        }
        class153.field2107 = arg5;
        if (class149.field2066 >= 100) {
            int var6 = class345.field5356 * 128 + 64;
            int var7 = class296.field4621 * 128 + 64;
            int var8 = class184.method1278(class138.field1940, -13660, var6, var7) - class153.field2107;
            int var9 = var7 - class130.field1792;
            int var10 = var8 - class301.field4704;
            int var11 = var6 - class109.field1506;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class30.field380 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class323.field4975 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 0x7FF;
            if (class30.field380 < 128) {
                class30.field380 = 128;
            }
            if (class30.field380 > 383) {
                class30.field380 = 383;
            }
        }
        field1956++;
        class118.field1671 = 2;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)V", line = 1289)
    public static void method932(byte arg0) {
        if (arg0 < -106) {
            field1954 = null;
            field1955 = null;
            field1952 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)[[I", line = 1316)
    public final int[][] method102(int arg0, int arg1) {
        int[][] var3 = this.field1755.method875(54, arg0);
        if (this.field1755.field1815) {
            int[][] var4 = this.method855(arg1 - 8212, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var4[1];
            int[] var8 = var3[2];
            int[] var9 = var4[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class10.field141; var11++) {
                int var12 = var5[var11];
                int var13 = var9[var11];
                int var14 = var7[var11];
                if (var12 == var13 && var13 == var14) {
                    var6[var11] = this.field1960 * var12 >> 12;
                    var10[var11] = this.field1957 * var13 >> 12;
                    var8[var11] = this.field1959 * var14 >> 12;
                } else {
                    var6[var11] = this.field1960;
                    var10[var11] = this.field1957;
                    var8[var11] = this.field1959;
                }
            }
        }
        field1958++;
        return arg1 == 5110 ? var3 : (int[][]) ((int[][]) null);
    }
}
