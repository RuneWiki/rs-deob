import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class261 extends class184 {

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "[B")
    public byte[] field3738;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "Lej;")
    public static class124 field3744 = new class124(22, 7);

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "[I")
    public static int[] field3745 = new int[1];

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "Luh;")
    public static class168 field3746;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
    public int field3733;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    public int field3734;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    public int field3735;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
    public int field3741;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V")
    public final void method1753(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3733 = arg0 - arg4;
        this.field3734 = arg2 - arg3;
        this.field3735 = arg4;
        if (arg1 > -96) {
            this.method1756(27);
        }
        field3740++;
        this.field3741 = arg3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIII)V")
    public final void method1754(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3739++;
        int var8 = 0;
        if (arg0 != arg4) {
            var8 = (arg3 - arg2 << 16) / (arg4 - arg0);
        }
        int var9 = 0;
        if (arg4 != arg5) {
            var9 = (arg6 - arg3 << 16) / (arg5 - arg4);
        }
        int var10 = -10 % ((-arg1 - 65) / 55);
        int var11 = 0;
        if (arg0 != arg5) {
            var11 = (arg2 - arg6 << 16) / (arg0 - arg5);
        }
        if (arg4 >= arg0 && arg0 <= arg5) {
            if (arg4 >= arg5) {
                int var12;
                int var13 = var12 = arg2 << 16;
                int var14 = arg6 << 16;
                if (arg0 < 0) {
                    var13 -= arg0 * var11;
                    var12 -= arg0 * var8;
                    arg0 = 0;
                }
                if (arg5 < 0) {
                    var14 -= arg5 * var9;
                    arg5 = 0;
                }
                if ((arg0 == arg5 || var11 >= var8) && (arg0 != arg5 || var8 >= var9)) {
                    int var18 = arg4 - arg5;
                    int var19 = arg5 - arg0;
                    int var20 = this.field3733 * arg0;
                    while (true) {
                        var19--;
                        if (var19 < 0) {
                            while (true) {
                                var18--;
                                if (var18 < 0) {
                                    return;
                                }
                                class529.method3058(var20, var12 >> 16, this.field3738, 0, 1354705384, var14 >> 16);
                                var20 += this.field3733;
                                var14 += var9;
                                var12 += var8;
                            }
                        }
                        class529.method3058(var20, var12 >> 16, this.field3738, 0, 1354705384, var13 >> 16);
                        var13 += var11;
                        var12 += var8;
                        var20 += this.field3733;
                    }
                } else {
                    int var15 = arg4 - arg5;
                    int var16 = arg5 - arg0;
                    int var17 = this.field3733 * arg0;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            while (true) {
                                var15--;
                                if (var15 < 0) {
                                    return;
                                }
                                class529.method3058(var17, var14 >> 16, this.field3738, 0, 1354705384, var12 >> 16);
                                var17 += this.field3733;
                                var14 += var9;
                                var12 += var8;
                            }
                        }
                        class529.method3058(var17, var13 >> 16, this.field3738, 0, 1354705384, var12 >> 16);
                        var17 += this.field3733;
                        var12 += var8;
                        var13 += var11;
                    }
                }
            } else {
                int var21;
                int var22 = var21 = arg2 << 16;
                if (arg0 < 0) {
                    var21 -= arg0 * var8;
                    var22 -= arg0 * var11;
                    arg0 = 0;
                }
                int var23 = arg3 << 16;
                if (arg4 < 0) {
                    var23 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg0 != arg4 && var8 > var11 || arg0 == arg4 && var9 < var11) {
                    int var24 = arg5 - arg4;
                    int var25 = arg4 - arg0;
                    int var26 = this.field3733 * arg0;
                    while (true) {
                        var25--;
                        if (var25 < 0) {
                            while (true) {
                                var24--;
                                if (var24 < 0) {
                                    return;
                                }
                                class529.method3058(var26, var22 >> 16, this.field3738, 0, 1354705384, var23 >> 16);
                                var26 += this.field3733;
                                var22 += var11;
                                var23 += var9;
                            }
                        }
                        class529.method3058(var26, var22 >> 16, this.field3738, 0, 1354705384, var21 >> 16);
                        var21 += var8;
                        var22 += var11;
                        var26 += this.field3733;
                    }
                } else {
                    int var27 = arg5 - arg4;
                    int var28 = arg4 - arg0;
                    int var29 = this.field3733 * arg0;
                    while (true) {
                        var28--;
                        if (var28 < 0) {
                            while (true) {
                                var27--;
                                if (var27 < 0) {
                                    return;
                                }
                                class529.method3058(var29, var23 >> 16, this.field3738, 0, 1354705384, var22 >> 16);
                                var23 += var9;
                                var29 += this.field3733;
                                var22 += var11;
                            }
                        }
                        class529.method3058(var29, var21 >> 16, this.field3738, 0, 1354705384, var22 >> 16);
                        var22 += var11;
                        var29 += this.field3733;
                        var21 += var8;
                    }
                }
            }
        } else if (arg4 <= arg5) {
            if (arg5 >= arg0) {
                int var30;
                int var31 = var30 = arg3 << 16;
                if (arg4 < 0) {
                    var30 -= arg4 * var9;
                    var31 -= arg4 * var8;
                    arg4 = 0;
                }
                int var32 = arg2 << 16;
                if (arg0 < 0) {
                    var32 -= arg0 * var11;
                    arg0 = 0;
                }
                if (var8 < var9) {
                    int var33 = arg5 - arg0;
                    int var34 = arg0 - arg4;
                    int var35 = this.field3733 * arg4;
                    while (true) {
                        var34--;
                        if (var34 < 0) {
                            while (true) {
                                var33--;
                                if (var33 < 0) {
                                    return;
                                }
                                class529.method3058(var35, var32 >> 16, this.field3738, 0, 1354705384, var30 >> 16);
                                var30 += var9;
                                var35 += this.field3733;
                                var32 += var11;
                            }
                        }
                        class529.method3058(var35, var31 >> 16, this.field3738, 0, 1354705384, var30 >> 16);
                        var31 += var8;
                        var35 += this.field3733;
                        var30 += var9;
                    }
                } else {
                    int var36 = arg5 - arg0;
                    int var37 = arg0 - arg4;
                    int var38 = this.field3733 * arg4;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            while (true) {
                                var36--;
                                if (var36 < 0) {
                                    return;
                                }
                                class529.method3058(var38, var30 >> 16, this.field3738, 0, 1354705384, var32 >> 16);
                                var30 += var9;
                                var32 += var11;
                                var38 += this.field3733;
                            }
                        }
                        class529.method3058(var38, var30 >> 16, this.field3738, 0, 1354705384, var31 >> 16);
                        var38 += this.field3733;
                        var30 += var9;
                        var31 += var8;
                    }
                }
            } else {
                int var39;
                int var40 = var39 = arg3 << 16;
                if (arg4 < 0) {
                    var39 -= arg4 * var9;
                    var40 -= arg4 * var8;
                    arg4 = 0;
                }
                int var41 = arg6 << 16;
                if (arg5 < 0) {
                    var41 -= arg5 * var11;
                    arg5 = 0;
                }
                if (arg4 != arg5 && var9 > var8 || arg4 == arg5 && var8 > var11) {
                    int var42 = arg0 - arg5;
                    int var43 = arg5 - arg4;
                    int var44 = this.field3733 * arg4;
                    while (true) {
                        var43--;
                        if (var43 < 0) {
                            while (true) {
                                var42--;
                                if (var42 < 0) {
                                    return;
                                }
                                class529.method3058(var44, var40 >> 16, this.field3738, 0, 1354705384, var41 >> 16);
                                var44 += this.field3733;
                                var41 += var11;
                                var40 += var8;
                            }
                        }
                        class529.method3058(var44, var40 >> 16, this.field3738, 0, 1354705384, var39 >> 16);
                        var39 += var9;
                        var44 += this.field3733;
                        var40 += var8;
                    }
                } else {
                    int var45 = arg0 - arg5;
                    int var46 = arg5 - arg4;
                    int var47 = this.field3733 * arg4;
                    while (true) {
                        var46--;
                        if (var46 < 0) {
                            while (true) {
                                var45--;
                                if (var45 < 0) {
                                    return;
                                }
                                class529.method3058(var47, var41 >> 16, this.field3738, 0, 1354705384, var40 >> 16);
                                var47 += this.field3733;
                                var40 += var8;
                                var41 += var11;
                            }
                        }
                        class529.method3058(var47, var39 >> 16, this.field3738, 0, 1354705384, var40 >> 16);
                        var47 += this.field3733;
                        var40 += var8;
                        var39 += var9;
                    }
                }
            }
        } else if (arg0 < arg4) {
            int var48;
            int var49 = var48 = arg6 << 16;
            int var50 = arg2 << 16;
            if (arg5 < 0) {
                var48 -= arg5 * var11;
                var49 -= arg5 * var9;
                arg5 = 0;
            }
            if (arg0 < 0) {
                var50 -= arg0 * var8;
                arg0 = 0;
            }
            if (var9 < var11) {
                int var51 = arg4 - arg0;
                int var52 = arg0 - arg5;
                int var53 = this.field3733 * arg5;
                while (true) {
                    var52--;
                    if (var52 < 0) {
                        while (true) {
                            var51--;
                            if (var51 < 0) {
                                return;
                            }
                            class529.method3058(var53, var49 >> 16, this.field3738, 0, 1354705384, var50 >> 16);
                            var50 += var8;
                            var53 += this.field3733;
                            var49 += var9;
                        }
                    }
                    class529.method3058(var53, var49 >> 16, this.field3738, 0, 1354705384, var48 >> 16);
                    var53 += this.field3733;
                    var49 += var9;
                    var48 += var11;
                }
            } else {
                int var54 = arg4 - arg0;
                int var55 = arg0 - arg5;
                int var56 = this.field3733 * arg5;
                while (true) {
                    var55--;
                    if (var55 < 0) {
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                return;
                            }
                            class529.method3058(var56, var50 >> 16, this.field3738, 0, 1354705384, var49 >> 16);
                            var50 += var8;
                            var56 += this.field3733;
                            var49 += var9;
                        }
                    }
                    class529.method3058(var56, var48 >> 16, this.field3738, 0, 1354705384, var49 >> 16);
                    var49 += var9;
                    var56 += this.field3733;
                    var48 += var11;
                }
            }
        } else {
            int var57;
            int var58 = var57 = arg6 << 16;
            if (arg5 < 0) {
                var57 -= arg5 * var11;
                var58 -= arg5 * var9;
                arg5 = 0;
            }
            int var59 = arg3 << 16;
            if (arg4 < 0) {
                var59 -= arg4 * var8;
                arg4 = 0;
            }
            if (var11 <= var9) {
                int var60 = arg0 - arg4;
                int var61 = arg4 - arg5;
                int var62 = this.field3733 * arg5;
                while (true) {
                    var61--;
                    if (var61 < 0) {
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                return;
                            }
                            class529.method3058(var62, var57 >> 16, this.field3738, 0, 1354705384, var59 >> 16);
                            var59 += var8;
                            var57 += var11;
                            var62 += this.field3733;
                        }
                    }
                    class529.method3058(var62, var57 >> 16, this.field3738, 0, 1354705384, var58 >> 16);
                    var62 += this.field3733;
                    var58 += var9;
                    var57 += var11;
                }
            } else {
                int var63 = arg0 - arg4;
                int var64 = arg4 - arg5;
                int var65 = this.field3733 * arg5;
                while (true) {
                    var64--;
                    if (var64 < 0) {
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                return;
                            }
                            class529.method3058(var65, var59 >> 16, this.field3738, 0, 1354705384, var57 >> 16);
                            var57 += var11;
                            var65 += this.field3733;
                            var59 += var8;
                        }
                    }
                    class529.method3058(var65, var58 >> 16, this.field3738, 0, 1354705384, var57 >> 16);
                    var58 += var9;
                    var57 += var11;
                    var65 += this.field3733;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(B)V")
    public static void method1755(byte arg0) {
        int var1 = 107 % ((arg0 - 27) / 34);
        field3745 = null;
        field3744 = null;
        field3746 = null;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V")
    public final void method1756(int arg0) {
        if (arg0 <= 1) {
            this.method1753(-75, -2, 86, -31, 120);
        }
        field3742++;
        int var2 = -1;
        int var3 = this.field3738.length - 8;
        while (var3 > var2) {
            var2++;
            this.field3738[var2] = 0;
            var2++;
            this.field3738[var2] = 0;
            var2++;
            this.field3738[var2] = 0;
            var2++;
            this.field3738[var2] = 0;
            var2++;
            this.field3738[var2] = 0;
            var2++;
            this.field3738[var2] = 0;
            var2++;
            this.field3738[var2] = 0;
            var2++;
            this.field3738[var2] = 0;
        }
        while (var2 < this.field3738.length - 1) {
            var2++;
            this.field3738[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V")
    public static final void method1757(int arg0) {
        if (arg0 < 30) {
            field3746 = null;
        }
        class82.method783(class693.field9368.field4437.method3426(-32350) == 1, 2, true, 22050);
        field3737++;
        class297.field4175 = class65.method669(22050, class689.field9299, class458.field6458, 0, 7);
        class161.method1231(true, -114, class584.method3341(null, 9));
        class603.field8276 = class65.method669(2048, class689.field9299, class458.field6458, 1, 7);
        class326.field4510 = new class180();
        class603.field8276.method3169(false, class326.field4510);
        class335.field4728 = new class609(22050, class103.field1834);
        class268.method1785(110);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIB)Z")
    public final boolean method1758(int arg0, int arg1, byte arg2) {
        field3736++;
        if (arg2 != -59) {
            this.field3734 = 41;
        }
        return this.field3738.length >= (arg0 * arg1);
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lwga;II)V")
    public class261(class745 arg0, int arg1, int arg2) {
        this.field3738 = new byte[arg1 * arg2];
    }

    static {
        new class418("", 76);
        field3746 = new class168();
    }
}
