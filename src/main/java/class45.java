import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class45 extends class427 {

    @OriginalMember(owner = "client!uda", name = "U", descriptor = "[B")
    public byte[] field614;

    @OriginalMember(owner = "client!uda", name = "P", descriptor = "[Lnea;")
    public static class538[] field609 = new class538[4];

    @OriginalMember(owner = "client!uda", name = "M", descriptor = "[I")
    public static int[] field606 = new int[13];

    @OriginalMember(owner = "client!uda", name = "G", descriptor = "Ljn;")
    public static class117 field602 = new class117(5);

    @OriginalMember(owner = "client!uda", name = "F", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!uda", name = "I", descriptor = "I")
    public int field603;

    @OriginalMember(owner = "client!uda", name = "K", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!uda", name = "L", descriptor = "I")
    public int field605;

    @OriginalMember(owner = "client!uda", name = "N", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!uda", name = "O", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!uda", name = "Q", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!uda", name = "R", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!uda", name = "S", descriptor = "I")
    public int field612;

    @OriginalMember(owner = "client!uda", name = "T", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!uda", name = "V", descriptor = "I")
    public int field615;

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "(B)V")
    public static void method358(byte arg0) {
        field602 = null;
        field609 = null;
        field606 = null;
        int var1 = 54 % ((arg0 + 61) / 46);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(BIIII)V")
    public final void method359(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            this.field614 = null;
        }
        this.field603 = arg4 - arg3;
        this.field615 = arg2 - arg1;
        this.field605 = arg1;
        this.field612 = arg3;
        field610++;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIIIII)V")
    public final void method360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field611++;
        int var8 = 0;
        if (arg0 != arg2) {
            var8 = (arg3 - arg4 << 16) / (arg0 - arg2);
        }
        int var9 = -96 / ((arg5 - 8) / 50);
        int var10 = 0;
        if (arg0 != arg1) {
            var10 = (arg6 - arg3 << 16) / (arg1 - arg0);
        }
        int var11 = 0;
        if (arg1 != arg2) {
            var11 = (arg4 - arg6 << 16) / (arg2 - arg1);
        }
        if (arg0 >= arg2 && arg1 >= arg2) {
            if (arg1 > arg0) {
                int var12;
                int var13 = var12 = arg4 << 16;
                int var14 = arg3 << 16;
                if (arg2 < 0) {
                    var13 -= arg2 * var11;
                    var12 -= arg2 * var8;
                    arg2 = 0;
                }
                if (arg0 < 0) {
                    var14 -= arg0 * var10;
                    arg0 = 0;
                }
                if ((arg0 == arg2 || var8 <= var11) && (arg0 != arg2 || var10 >= var11)) {
                    int var18 = arg1 - arg0;
                    int var19 = arg0 - arg2;
                    int var20 = this.field615 * arg2;
                    while (true) {
                        var19--;
                        if (var19 < 0) {
                            while (true) {
                                var18--;
                                if (var18 < 0) {
                                    return;
                                }
                                class30.method278((byte) 1, 0, var13 >> 16, var20, this.field614, var14 >> 16);
                                var20 += this.field615;
                                var13 += var11;
                                var14 += var10;
                            }
                        }
                        class30.method278((byte) 1, 0, var13 >> 16, var20, this.field614, var12 >> 16);
                        var13 += var11;
                        var20 += this.field615;
                        var12 += var8;
                    }
                } else {
                    int var15 = arg1 - arg0;
                    int var16 = arg0 - arg2;
                    int var17 = this.field615 * arg2;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            while (true) {
                                var15--;
                                if (var15 < 0) {
                                    return;
                                }
                                class30.method278((byte) 1, 0, var14 >> 16, var17, this.field614, var13 >> 16);
                                var13 += var11;
                                var14 += var10;
                                var17 += this.field615;
                            }
                        }
                        class30.method278((byte) 1, 0, var12 >> 16, var17, this.field614, var13 >> 16);
                        var13 += var11;
                        var17 += this.field615;
                        var12 += var8;
                    }
                }
            } else {
                int var21;
                int var22 = var21 = arg4 << 16;
                if (arg2 < 0) {
                    var21 -= arg2 * var8;
                    var22 -= arg2 * var11;
                    arg2 = 0;
                }
                int var23 = arg6 << 16;
                if (arg1 < 0) {
                    var23 -= arg1 * var10;
                    arg1 = 0;
                }
                if (arg1 != arg2 && var11 < var8 || arg1 == arg2 && var10 > var8) {
                    int var24 = arg0 - arg1;
                    int var25 = arg1 - arg2;
                    int var26 = this.field615 * arg2;
                    while (true) {
                        var25--;
                        if (var25 < 0) {
                            while (true) {
                                var24--;
                                if (var24 < 0) {
                                    return;
                                }
                                class30.method278((byte) 1, 0, var21 >> 16, var26, this.field614, var23 >> 16);
                                var21 += var8;
                                var26 += this.field615;
                                var23 += var10;
                            }
                        }
                        class30.method278((byte) 1, 0, var21 >> 16, var26, this.field614, var22 >> 16);
                        var22 += var11;
                        var26 += this.field615;
                        var21 += var8;
                    }
                } else {
                    int var27 = arg0 - arg1;
                    int var28 = arg1 - arg2;
                    int var29 = this.field615 * arg2;
                    while (true) {
                        var28--;
                        if (var28 < 0) {
                            while (true) {
                                var27--;
                                if (var27 < 0) {
                                    return;
                                }
                                class30.method278((byte) 1, 0, var23 >> 16, var29, this.field614, var21 >> 16);
                                var29 += this.field615;
                                var23 += var10;
                                var21 += var8;
                            }
                        }
                        class30.method278((byte) 1, 0, var22 >> 16, var29, this.field614, var21 >> 16);
                        var22 += var11;
                        var21 += var8;
                        var29 += this.field615;
                    }
                }
            }
        } else if (arg1 >= arg0) {
            if (arg1 >= arg2) {
                int var30;
                int var31 = var30 = arg3 << 16;
                if (arg0 < 0) {
                    var30 -= arg0 * var10;
                    var31 -= arg0 * var8;
                    arg0 = 0;
                }
                int var32 = arg4 << 16;
                if (arg2 < 0) {
                    var32 -= arg2 * var11;
                    arg2 = 0;
                }
                if (var8 >= var10) {
                    int var33 = arg1 - arg2;
                    int var34 = arg2 - arg0;
                    int var35 = this.field615 * arg0;
                    while (true) {
                        var34--;
                        if (var34 < 0) {
                            while (true) {
                                var33--;
                                if (var33 < 0) {
                                    return;
                                }
                                class30.method278((byte) 1, 0, var32 >> 16, var35, this.field614, var30 >> 16);
                                var30 += var10;
                                var32 += var11;
                                var35 += this.field615;
                            }
                        }
                        class30.method278((byte) 1, 0, var31 >> 16, var35, this.field614, var30 >> 16);
                        var30 += var10;
                        var35 += this.field615;
                        var31 += var8;
                    }
                } else {
                    int var36 = arg1 - arg2;
                    int var37 = arg2 - arg0;
                    int var38 = this.field615 * arg0;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            while (true) {
                                var36--;
                                if (var36 < 0) {
                                    return;
                                }
                                class30.method278((byte) 1, 0, var30 >> 16, var38, this.field614, var32 >> 16);
                                var32 += var11;
                                var38 += this.field615;
                                var30 += var10;
                            }
                        }
                        class30.method278((byte) 1, 0, var30 >> 16, var38, this.field614, var31 >> 16);
                        var30 += var10;
                        var31 += var8;
                        var38 += this.field615;
                    }
                }
            } else {
                int var39;
                int var40 = var39 = arg3 << 16;
                int var41 = arg6 << 16;
                if (arg0 < 0) {
                    var39 -= arg0 * var10;
                    var40 -= arg0 * var8;
                    arg0 = 0;
                }
                if (arg1 < 0) {
                    var41 -= arg1 * var11;
                    arg1 = 0;
                }
                if (arg0 != arg1 && var8 < var10 || arg0 == arg1 && var8 > var11) {
                    int var42 = arg2 - arg1;
                    int var43 = arg1 - arg0;
                    int var44 = this.field615 * arg0;
                    while (true) {
                        var43--;
                        if (var43 < 0) {
                            while (true) {
                                var42--;
                                if (var42 < 0) {
                                    return;
                                }
                                class30.method278((byte) 1, 0, var41 >> 16, var44, this.field614, var40 >> 16);
                                var40 += var8;
                                var41 += var11;
                                var44 += this.field615;
                            }
                        }
                        class30.method278((byte) 1, 0, var39 >> 16, var44, this.field614, var40 >> 16);
                        var40 += var8;
                        var44 += this.field615;
                        var39 += var10;
                    }
                } else {
                    int var45 = arg2 - arg1;
                    int var46 = arg1 - arg0;
                    int var47 = this.field615 * arg0;
                    while (true) {
                        var46--;
                        if (var46 < 0) {
                            while (true) {
                                var45--;
                                if (var45 < 0) {
                                    return;
                                }
                                class30.method278((byte) 1, 0, var40 >> 16, var47, this.field614, var41 >> 16);
                                var47 += this.field615;
                                var40 += var8;
                                var41 += var11;
                            }
                        }
                        class30.method278((byte) 1, 0, var40 >> 16, var47, this.field614, var39 >> 16);
                        var40 += var8;
                        var47 += this.field615;
                        var39 += var10;
                    }
                }
            }
        } else if (arg2 >= arg0) {
            int var48;
            int var49 = var48 = arg6 << 16;
            if (arg1 < 0) {
                var48 -= arg1 * var11;
                var49 -= arg1 * var10;
                arg1 = 0;
            }
            int var50 = arg3 << 16;
            if (arg0 < 0) {
                var50 -= arg0 * var8;
                arg0 = 0;
            }
            if (var11 > var10) {
                int var51 = arg2 - arg0;
                int var52 = arg0 - arg1;
                int var53 = this.field615 * arg1;
                while (true) {
                    var52--;
                    if (var52 < 0) {
                        while (true) {
                            var51--;
                            if (var51 < 0) {
                                return;
                            }
                            class30.method278((byte) 1, 0, var48 >> 16, var53, this.field614, var50 >> 16);
                            var50 += var8;
                            var48 += var11;
                            var53 += this.field615;
                        }
                    }
                    class30.method278((byte) 1, 0, var48 >> 16, var53, this.field614, var49 >> 16);
                    var49 += var10;
                    var53 += this.field615;
                    var48 += var11;
                }
            } else {
                int var54 = arg2 - arg0;
                int var55 = arg0 - arg1;
                int var56 = this.field615 * arg1;
                while (true) {
                    var55--;
                    if (var55 < 0) {
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                return;
                            }
                            class30.method278((byte) 1, 0, var50 >> 16, var56, this.field614, var48 >> 16);
                            var56 += this.field615;
                            var48 += var11;
                            var50 += var8;
                        }
                    }
                    class30.method278((byte) 1, 0, var49 >> 16, var56, this.field614, var48 >> 16);
                    var48 += var11;
                    var49 += var10;
                    var56 += this.field615;
                }
            }
        } else {
            int var57;
            int var58 = var57 = arg6 << 16;
            if (arg1 < 0) {
                var57 -= arg1 * var11;
                var58 -= arg1 * var10;
                arg1 = 0;
            }
            int var59 = arg4 << 16;
            if (arg2 < 0) {
                var59 -= arg2 * var8;
                arg2 = 0;
            }
            if (var11 > var10) {
                int var60 = arg0 - arg2;
                int var61 = arg2 - arg1;
                int var62 = this.field615 * arg1;
                while (true) {
                    var61--;
                    if (var61 < 0) {
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                return;
                            }
                            class30.method278((byte) 1, 0, var59 >> 16, var62, this.field614, var58 >> 16);
                            var58 += var10;
                            var62 += this.field615;
                            var59 += var8;
                        }
                    }
                    class30.method278((byte) 1, 0, var57 >> 16, var62, this.field614, var58 >> 16);
                    var57 += var11;
                    var62 += this.field615;
                    var58 += var10;
                }
            } else {
                int var63 = arg0 - arg2;
                int var64 = arg2 - arg1;
                int var65 = this.field615 * arg1;
                while (true) {
                    var64--;
                    if (var64 < 0) {
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                return;
                            }
                            class30.method278((byte) 1, 0, var58 >> 16, var65, this.field614, var59 >> 16);
                            var59 += var8;
                            var58 += var10;
                            var65 += this.field615;
                        }
                    }
                    class30.method278((byte) 1, 0, var58 >> 16, var65, this.field614, var57 >> 16);
                    var65 += this.field615;
                    var58 += var10;
                    var57 += var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
    public final void method361(int arg0) {
        field613++;
        if (arg0 != 30932) {
            this.method360(56, -70, 124, -70, 88, 68, -110);
        }
        int var2 = -1;
        int var3 = this.field614.length - 8;
        while (var2 < var3) {
            var2++;
            this.field614[var2] = 0;
            var2++;
            this.field614[var2] = 0;
            var2++;
            this.field614[var2] = 0;
            var2++;
            this.field614[var2] = 0;
            var2++;
            this.field614[var2] = 0;
            var2++;
            this.field614[var2] = 0;
            var2++;
            this.field614[var2] = 0;
            var2++;
            this.field614[var2] = 0;
        }
        while (var2 < (this.field614.length - 1)) {
            var2++;
            this.field614[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method362(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field607++;
        if (arg3 < 512 || arg2 < 512 || ((class430.field6136 - 2) * 512) < arg3 || arg2 > (class580.field8504 - 2) * 512) {
            class166.field2737[0] = class166.field2737[1] = -1;
            return;
        }
        int var10 = class603.method3433(arg2, arg1, arg3, -117) - arg5;
        if (arg0 != 1) {
            return;
        }
        class410.field5865.method158(arg9, 0, 0);
        class637.field9048.method755(class410.field5865);
        class637.field9048.method810(arg3, var10, arg2, class166.field2737);
        class410.field5865.method158(-arg9, 0, 0);
        class637.field9048.method755(class410.field5865);
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(IIIIIIIIII)Z")
    public static final boolean method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field601++;
        if (!class217.method1463(arg2, arg9, 11420, arg6)) {
            return false;
        }
        int var10 = class490.field7032[1];
        int var11 = class490.field7032[2];
        int var12 = class490.field7032[0];
        if (!class217.method1463(arg0, arg4, 11420, arg3)) {
            return false;
        }
        int var13 = class490.field7032[0];
        int var14 = class490.field7032[1];
        int var15 = class490.field7032[2];
        if (class217.method1463(arg8, arg7, 11420, arg5)) {
            int var16 = class490.field7032[arg1];
            int var17 = class490.field7032[0];
            int var18 = class490.field7032[2];
            return class84.method638(var17, var14, var16, var11, var10, var13, var12, var15, 49, var18);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(BI)I")
    public static final int method364(byte arg0, int arg1) {
        if (arg0 != 0) {
            method362(-63, 112, -24, -21, 77, -75, -45, -68, 75, -97);
        }
        field604++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(III)Z")
    public final boolean method365(int arg0, int arg1, int arg2) {
        field608++;
        int var4 = -2 / ((arg2 - 38) / 62);
        return this.field614.length >= (arg0 * arg1);
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Lnh;II)V")
    public class45(class495 arg0, int arg1, int arg2) {
        this.field614 = new byte[arg1 * arg2];
    }
}
