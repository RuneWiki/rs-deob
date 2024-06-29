import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class218 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    private int field3744 = 0;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    private int field3755 = -1;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Lid;")
    private class226 field3756 = new class226();

    @OriginalMember(owner = "client!k", name = "r", descriptor = "Z")
    public boolean field3761 = false;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    private int field3748;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    private int field3758;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "[Ldb;")
    private class121[] field3760;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "[[[I")
    private int[][][] field3747;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Z")
    public static boolean field3746 = false;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "[[I")
    public static int[][] field3753 = new int[104][104];

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field3750 = 0;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "[I")
    public static int[] field3749 = new int[4096];

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "[[[I")
    public static int[][][] field3754;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZIIIIII[IBII)V")
    public static final void method1529(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, byte arg8, int arg9, int arg10) {
        field3757++;
        int var11 = arg9;
        if (arg9 >= class122.field2051) {
            return;
        }
        if (arg9 < class122.field2053) {
            var11 = class122.field2053;
        }
        int var12 = arg4 + arg9;
        if (var12 <= class122.field2053) {
            return;
        }
        if (var12 > class122.field2051) {
            var12 = class122.field2051;
        }
        int var13 = arg6;
        if (class122.field2054 <= arg6) {
            return;
        }
        if (class122.field2055 > arg6) {
            var13 = class122.field2055;
        }
        int var14 = arg2 + arg6;
        if (var14 <= class122.field2055) {
            return;
        }
        if (arg1 == 9) {
            arg10 = arg10 + 1 & 0x3;
            arg1 = 1;
        }
        int var15 = class122.field2048 * var13 + var11;
        if (class122.field2054 < var14) {
            var14 = class122.field2054;
        }
        int var16 = var13 - arg6;
        int var17 = var14 - arg6;
        if (arg1 == 10) {
            arg10 = arg10 + 3 & 0x3;
            arg1 = 1;
        }
        if (arg1 == 11) {
            arg10 = arg10 + 3 & 0x3;
            arg1 = 8;
        }
        int var18 = class122.field2048 + var11 - var12;
        int var19 = var12 - arg9;
        int var20 = var11 - arg9;
        int var21 = arg4 - var20;
        if (arg8 < 86) {
            field3749 = null;
        }
        int var22 = arg2 - var17;
        int var23 = arg2 - var16;
        int var24 = arg4 - var19;
        if (arg1 == 1) {
            if (arg10 == 0) {
                for (int var25 = var16; var25 < var17; var25++) {
                    for (int var26 = var20; var26 < var19; var26++) {
                        if (var26 <= var25) {
                            arg7[var15] = arg3;
                        } else if (arg0) {
                            arg7[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg10 == 1) {
                for (int var27 = var23 - 1; var27 >= var22; var27--) {
                    for (int var28 = var20; var28 < var19; var28++) {
                        if (var28 <= var27) {
                            arg7[var15] = arg3;
                        } else if (arg0) {
                            arg7[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg10 == 2) {
                for (int var29 = var16; var29 < var17; var29++) {
                    for (int var30 = var20; var30 < var19; var30++) {
                        if (var29 <= var30) {
                            arg7[var15] = arg3;
                        } else if (arg0) {
                            arg7[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg10 == 3) {
                for (int var31 = var23 - 1; var31 >= var22; var31--) {
                    for (int var32 = var20; var32 < var19; var32++) {
                        if (var31 <= var32) {
                            arg7[var15] = arg3;
                        } else if (arg0) {
                            arg7[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg1 == 2) {
            if (arg10 == 0) {
                for (int var33 = var23 - 1; var33 >= var22; var33--) {
                    for (int var34 = var20; var34 < var19; var34++) {
                        if (var33 >> 1 >= var34) {
                            arg7[var15] = arg3;
                        } else if (arg0) {
                            arg7[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg10 == 1) {
                for (int var35 = var16; var35 < var17; var35++) {
                    for (int var36 = var20; var36 < var19; var36++) {
                        if (var15 >= 0 && arg7.length > var15) {
                            if (var36 >= (var35 << 1)) {
                                arg7[var15] = arg3;
                            } else if (arg0) {
                                arg7[var15] = arg5;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var18;
                }
            } else if (arg10 == 2) {
                for (int var37 = var16; var37 < var17; var37++) {
                    for (int var38 = var21 - 1; var38 >= var24; var38--) {
                        if (var37 >> 1 >= var38) {
                            arg7[var15] = arg3;
                        } else if (arg0) {
                            arg7[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg10 == 3) {
                for (int var39 = var23 - 1; var39 >= var22; var39--) {
                    for (int var40 = var21 - 1; var40 >= var24; var40--) {
                        if (var40 >= (var39 << 1)) {
                            arg7[var15] = arg3;
                        } else if (arg0) {
                            arg7[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg1 == 3) {
            if (arg10 == 0) {
                for (int var41 = var23 - 1; var41 >= var22; var41--) {
                    for (int var42 = var21 - 1; var42 >= var24; var42--) {
                        if (var41 >> 1 >= var42) {
                            arg7[var15] = arg3;
                        } else if (arg0) {
                            arg7[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg10 == 1) {
                for (int var43 = var23 - 1; var43 >= var22; var43--) {
                    for (int var44 = var20; var44 < var19; var44++) {
                        if (var43 << 1 <= var44) {
                            arg7[var15] = arg3;
                        } else if (arg0) {
                            arg7[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg10 == 2) {
                for (int var45 = var16; var45 < var17; var45++) {
                    for (int var46 = var20; var46 < var19; var46++) {
                        if ((var45 >> 1) >= var46) {
                            arg7[var15] = arg3;
                        } else if (arg0) {
                            arg7[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg10 == 3) {
                for (int var47 = var16; var47 < var17; var47++) {
                    for (int var48 = var21 - 1; var48 >= var24; var48--) {
                        if (var47 << 1 <= var48) {
                            arg7[var15] = arg3;
                        } else if (arg0) {
                            arg7[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg1 == 4) {
            if (arg10 == 0) {
                for (int var49 = var23 - 1; var49 >= var22; var49--) {
                    for (int var50 = var20; var50 < var19; var50++) {
                        if (var50 >= var49 >> 1) {
                            arg7[var15] = arg3;
                        } else if (arg0) {
                            arg7[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg10 == 1) {
                for (int var51 = var16; var51 < var17; var51++) {
                    for (int var52 = var20; var52 < var19; var52++) {
                        if (var51 << 1 >= var52) {
                            arg7[var15] = arg3;
                        } else if (arg0) {
                            arg7[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg10 == 2) {
                for (int var53 = var16; var53 < var17; var53++) {
                    for (int var54 = var21 - 1; var54 >= var24; var54--) {
                        if (var53 >> 1 <= var54) {
                            arg7[var15] = arg3;
                        } else if (arg0) {
                            arg7[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg10 == 3) {
                for (int var55 = var23 - 1; var55 >= var22; var55--) {
                    for (int var56 = var21 - 1; var56 >= var24; var56--) {
                        if (var56 <= (var55 << 1)) {
                            arg7[var15] = arg3;
                        } else if (arg0) {
                            arg7[var15] = arg5;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg1 != 5) {
            if (arg1 == 6) {
                if (arg10 == 0) {
                    for (int var65 = var16; var65 < var17; var65++) {
                        for (int var66 = var20; var66 < var19; var66++) {
                            if (arg4 / 2 >= var66) {
                                arg7[var15] = arg3;
                            } else if (arg0) {
                                arg7[var15] = arg5;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg10 == 1) {
                    for (int var67 = var16; var67 < var17; var67++) {
                        for (int var68 = var20; var68 < var19; var68++) {
                            if (var67 <= arg2 / 2) {
                                arg7[var15] = arg3;
                            } else if (arg0) {
                                arg7[var15] = arg5;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg10 == 2) {
                    for (int var69 = var16; var69 < var17; var69++) {
                        for (int var70 = var20; var70 < var19; var70++) {
                            if (var70 >= (arg4 / 2)) {
                                arg7[var15] = arg3;
                            } else if (arg0) {
                                arg7[var15] = arg5;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg10 == 3) {
                    for (int var71 = var16; var71 < var17; var71++) {
                        for (int var72 = var20; var72 < var19; var72++) {
                            if ((arg2 / 2) <= var71) {
                                arg7[var15] = arg3;
                            } else if (arg0) {
                                arg7[var15] = arg5;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg1 == 7) {
                if (arg10 == 0) {
                    for (int var73 = var16; var73 < var17; var73++) {
                        for (int var74 = var20; var74 < var19; var74++) {
                            if (var74 <= var73 - arg2 / 2) {
                                arg7[var15] = arg3;
                            } else if (arg0) {
                                arg7[var15] = arg5;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg10 == 1) {
                    for (int var75 = var23 - 1; var75 >= var22; var75--) {
                        for (int var76 = var20; var76 < var19; var76++) {
                            if ((var75 - (arg2 / 2)) >= var76) {
                                arg7[var15] = arg3;
                            } else if (arg0) {
                                arg7[var15] = arg5;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg10 == 2) {
                    for (int var77 = var23 - 1; var77 >= var22; var77--) {
                        for (int var78 = var21 - 1; var78 >= var24; var78--) {
                            if (var78 <= var77 - arg2 / 2) {
                                arg7[var15] = arg3;
                            } else if (arg0) {
                                arg7[var15] = arg5;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg10 == 3) {
                    for (int var79 = var16; var79 < var17; var79++) {
                        for (int var80 = var21 - 1; var80 >= var24; var80--) {
                            if ((var79 - (arg2 / 2)) >= var80) {
                                arg7[var15] = arg3;
                            } else if (arg0) {
                                arg7[var15] = arg5;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg1 == 8) {
                if (arg10 == 0) {
                    for (int var81 = var16; var81 < var17; var81++) {
                        for (int var82 = var20; var82 < var19; var82++) {
                            if ((var81 - (arg2 / 2)) <= var82) {
                                arg7[var15] = arg3;
                            } else if (arg0) {
                                arg7[var15] = arg5;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg10 == 1) {
                    for (int var83 = var23 - 1; var83 >= var22; var83--) {
                        for (int var84 = var20; var84 < var19; var84++) {
                            if (var83 - (arg2 / 2) <= var84) {
                                arg7[var15] = arg3;
                            } else if (arg0) {
                                arg7[var15] = arg5;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg10 == 2) {
                    for (int var85 = var23 - 1; var85 >= var22; var85--) {
                        for (int var86 = var21 - 1; var86 >= var24; var86--) {
                            if (var86 >= var85 - (arg2 / 2)) {
                                arg7[var15] = arg3;
                            } else if (arg0) {
                                arg7[var15] = arg5;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg10 == 3) {
                    for (int var87 = var16; var87 < var17; var87++) {
                        for (int var88 = var21 - 1; var88 >= var24; var88--) {
                            if ((var87 - arg2 / 2) <= var88) {
                                arg7[var15] = arg3;
                            } else if (arg0) {
                                arg7[var15] = arg5;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
        } else if (arg10 == 0) {
            for (int var57 = var23 - 1; var57 >= var22; var57--) {
                for (int var58 = var21 - 1; var58 >= var24; var58--) {
                    if (var58 >= (var57 >> 1)) {
                        arg7[var15] = arg3;
                    } else if (arg0) {
                        arg7[var15] = arg5;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg10 == 1) {
            for (int var59 = var23 - 1; var59 >= var22; var59--) {
                for (int var60 = var20; var60 < var19; var60++) {
                    if (var59 << 1 >= var60) {
                        arg7[var15] = arg3;
                    } else if (arg0) {
                        arg7[var15] = arg5;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg10 == 2) {
            for (int var61 = var16; var61 < var17; var61++) {
                for (int var62 = var20; var62 < var19; var62++) {
                    if ((var61 >> 1) <= var62) {
                        arg7[var15] = arg3;
                    } else if (arg0) {
                        arg7[var15] = arg5;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg10 == 3) {
            for (int var63 = var16; var63 < var17; var63++) {
                for (int var64 = var21 - 1; var64 >= var24; var64--) {
                    if ((var63 << 1) >= var64) {
                        arg7[var15] = arg3;
                    } else if (arg0) {
                        arg7[var15] = arg5;
                    }
                    var15++;
                }
                var15 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)[[[I")
    public final int[][][] method1530(boolean arg0) {
        field3745++;
        if (!arg0) {
            return null;
        } else if (this.field3758 == this.field3748) {
            for (int var2 = 0; var2 < this.field3748; var2++) {
                this.field3760[var2] = class249.field4466;
            }
            return this.field3747;
        } else {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public final void method1531(byte arg0) {
        int var2 = 0;
        if (arg0 != 60) {
            return;
        }
        while (var2 < this.field3748) {
            this.field3747[var2][0] = null;
            this.field3747[var2][1] = null;
            this.field3747[var2][2] = null;
            this.field3747[var2] = null;
            var2++;
        }
        field3751++;
        this.field3747 = null;
        this.field3760 = null;
        this.field3756.method1573(79);
        this.field3756 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)[[I")
    public final int[][] method1532(int arg0, int arg1) {
        field3759++;
        if (arg1 > -1) {
            this.field3748 = 115;
        }
        if (this.field3758 == this.field3748) {
            this.field3761 = this.field3760[arg0] == null;
            this.field3760[arg0] = class249.field4466;
            return this.field3747[arg0];
        } else if (this.field3748 == 1) {
            this.field3761 = this.field3755 != arg0;
            this.field3755 = arg0;
            return this.field3747[0];
        } else {
            class121 var3 = this.field3760[arg0];
            if (var3 == null) {
                this.field3761 = true;
                if (this.field3748 <= this.field3744) {
                    class121 var4 = (class121) this.field3756.method1572((byte) 58);
                    var3 = new class121(arg0, var4.field2035);
                    this.field3760[var4.field2039] = null;
                    var4.method441(16773377);
                } else {
                    var3 = new class121(arg0, this.field3744);
                    this.field3744++;
                }
                this.field3760[arg0] = var3;
            } else {
                this.field3761 = false;
            }
            this.field3756.method1567(0, var3);
            return this.field3747[var3.field2035];
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method1533(int arg0) {
        field3753 = null;
        field3749 = null;
        if (arg0 == -12223) {
            field3754 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(III)V")
    public class218(int arg0, int arg1, int arg2) {
        this.field3748 = arg0;
        this.field3758 = arg1;
        this.field3760 = new class121[this.field3758];
        this.field3747 = new int[this.field3748][3][arg2];
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3749[var0] = class82.method555(var0, true);
        }
    }
}
