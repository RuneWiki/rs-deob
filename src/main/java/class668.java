import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class668 extends class706 {

    @OriginalMember(owner = "client!ov", name = "J", descriptor = "[B")
    public byte[] field9409;

    @OriginalMember(owner = "client!ov", name = "I", descriptor = "Z")
    public static boolean field9408 = false;

    @OriginalMember(owner = "client!ov", name = "M", descriptor = "I")
    public static int field9412 = 0;

    @OriginalMember(owner = "client!ov", name = "G", descriptor = "I")
    public static int field9406 = -1;

    @OriginalMember(owner = "client!ov", name = "y", descriptor = "I")
    public static int field9398;

    @OriginalMember(owner = "client!ov", name = "z", descriptor = "I")
    public static int field9399;

    @OriginalMember(owner = "client!ov", name = "A", descriptor = "I")
    public static int field9400;

    @OriginalMember(owner = "client!ov", name = "B", descriptor = "I")
    public static int field9401;

    @OriginalMember(owner = "client!ov", name = "C", descriptor = "I")
    public static int field9402;

    @OriginalMember(owner = "client!ov", name = "D", descriptor = "I")
    public static int field9403;

    @OriginalMember(owner = "client!ov", name = "E", descriptor = "I")
    public int field9404;

    @OriginalMember(owner = "client!ov", name = "F", descriptor = "I")
    public int field9405;

    @OriginalMember(owner = "client!ov", name = "H", descriptor = "I")
    public static int field9407;

    @OriginalMember(owner = "client!ov", name = "K", descriptor = "I")
    public int field9410;

    @OriginalMember(owner = "client!ov", name = "L", descriptor = "I")
    public int field9411;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILd;BLjava/awt/Canvas;I)Lha;", line = 8)
    public static final class545 method3824(int arg0, class268 arg1, byte arg2, Canvas arg3, int arg4) {
        field9402++;
        if (arg2 <= 83) {
            field9408 = false;
        }
        return new class521(arg3, arg1, arg0, arg4);
    }

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "(I)V", line = 21)
    public static final void method3825(int arg0) {
        field9407++;
        class674.field9500.method2250((byte) 114, 1, class674.field9500.field5159);
        class674.field9500.method2250((byte) 100, 1, class674.field9500.field5113);
        class674.field9500.method2250((byte) 82, 1, class674.field9500.field5119);
        class674.field9500.method2250((byte) 105, 1, class674.field9500.field5122);
        class674.field9500.method2250((byte) 104, 1, class674.field9500.field5131);
        class674.field9500.method2250((byte) 110, 1, class674.field9500.field5163);
        class674.field9500.method2250((byte) 116, 0, class674.field9500.field5137);
        class674.field9500.method2250((byte) 127, 0, class674.field9500.field5154);
        class674.field9500.method2250((byte) 111, 0, class674.field9500.field5168);
        class674.field9500.method2250((byte) 94, 0, class674.field9500.field5151);
        class674.field9500.method2250((byte) 84, 0, class674.field9500.field5130);
        if (arg0 != -7220) {
            return;
        }
        class674.field9500.method2250((byte) 117, 0, class674.field9500.field5162);
        class674.field9500.method2250((byte) 117, 0, class674.field9500.field5134);
        class674.field9500.method2250((byte) 82, 0, class674.field9500.field5143);
        class674.field9500.method2250((byte) 102, 0, class674.field9500.field5135);
        class674.field9500.method2250((byte) 117, 0, class674.field9500.field5155);
        class674.field9500.method2250((byte) 87, 0, class674.field9500.field5148);
        class674.field9500.method2250((byte) 84, 0, class674.field9500.field5120);
        class674.field9500.method2250((byte) 96, 0, class674.field9500.field5132);
        class163.method1017(false);
        class674.field9500.method2250((byte) 115, 2, class674.field9500.field5139);
        class674.field9500.method2250((byte) 104, 2, class674.field9500.field5117);
        class469.method2794(false);
        class507.method3027(-1);
        class295.field3852 = true;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIIIII)V", line = 61)
    public final void method3826(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9401++;
        int var8 = arg3;
        if (arg2 != arg4) {
            var8 = (arg5 - arg6 << 16) / (arg2 - arg4);
        }
        int var9 = 0;
        if (arg1 != arg2) {
            var9 = (arg0 - arg5 << 16) / (arg1 - arg2);
        }
        int var10 = 0;
        if (arg1 != arg4) {
            var10 = (arg6 - arg0 << 16) / (arg4 - arg1);
        }
        if (arg2 >= arg4 && arg1 >= arg4) {
            if (arg2 >= arg1) {
                int var11;
                int var12 = var11 = arg6 << 16;
                if (arg4 < 0) {
                    var12 -= arg4 * var10;
                    var11 -= arg4 * var8;
                    arg4 = 0;
                }
                int var13 = arg0 << 16;
                if (arg1 < 0) {
                    var13 -= arg1 * var9;
                    arg1 = 0;
                }
                if ((arg1 == arg4 || var8 <= var10) && (arg1 != arg4 || var8 >= var9)) {
                    int var17 = arg2 - arg1;
                    int var18 = arg1 - arg4;
                    int var19 = this.field9410 * arg4;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class141.method918(var11 >> 16, var19, this.field9409, 0, var13 >> 16, arg3 - 27209);
                                var19 += this.field9410;
                                var13 += var9;
                                var11 += var8;
                            }
                        }
                        class141.method918(var11 >> 16, var19, this.field9409, 0, var12 >> 16, -27209);
                        var19 += this.field9410;
                        var11 += var8;
                        var12 += var10;
                    }
                } else {
                    int var14 = arg2 - arg1;
                    int var15 = arg1 - arg4;
                    int var16 = this.field9410 * arg4;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class141.method918(var13 >> 16, var16, this.field9409, 0, var11 >> 16, -27209);
                                var11 += var8;
                                var16 += this.field9410;
                                var13 += var9;
                            }
                        }
                        class141.method918(var12 >> 16, var16, this.field9409, 0, var11 >> 16, arg3 ^ 0xFFFF95B7);
                        var11 += var8;
                        var16 += this.field9410;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg6 << 16;
                if (arg4 < 0) {
                    var20 -= arg4 * var8;
                    var21 -= arg4 * var10;
                    arg4 = 0;
                }
                int var22 = arg5 << 16;
                if (arg2 < 0) {
                    var22 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg2 != arg4 && var10 < var8 || arg2 == arg4 && var10 > var9) {
                    int var23 = arg1 - arg2;
                    int var24 = arg2 - arg4;
                    int var25 = this.field9410 * arg4;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class141.method918(var21 >> 16, var25, this.field9409, 0, var22 >> 16, -27209);
                                var22 += var9;
                                var21 += var10;
                                var25 += this.field9410;
                            }
                        }
                        class141.method918(var21 >> 16, var25, this.field9409, 0, var20 >> 16, -27209);
                        var20 += var8;
                        var21 += var10;
                        var25 += this.field9410;
                    }
                } else {
                    int var26 = arg1 - arg2;
                    int var27 = arg2 - arg4;
                    int var28 = this.field9410 * arg4;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class141.method918(var22 >> 16, var28, this.field9409, 0, var21 >> 16, -27209);
                                var22 += var9;
                                var28 += this.field9410;
                                var21 += var10;
                            }
                        }
                        class141.method918(var20 >> 16, var28, this.field9409, 0, var21 >> 16, -27209);
                        var21 += var10;
                        var20 += var8;
                        var28 += this.field9410;
                    }
                }
            }
        } else if (arg1 >= arg2) {
            if (arg4 > arg1) {
                int var29;
                int var30 = var29 = arg5 << 16;
                if (arg2 < 0) {
                    var29 -= arg2 * var9;
                    var30 -= arg2 * var8;
                    arg2 = 0;
                }
                int var31 = arg0 << 16;
                if (arg1 < 0) {
                    var31 -= arg1 * var10;
                    arg1 = 0;
                }
                if (arg1 != arg2 && var8 < var9 || arg1 == arg2 && var10 < var8) {
                    int var32 = arg4 - arg1;
                    int var33 = arg1 - arg2;
                    int var34 = this.field9410 * arg2;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class141.method918(var30 >> 16, var34, this.field9409, 0, var31 >> 16, -27209);
                                var30 += var8;
                                var34 += this.field9410;
                                var31 += var10;
                            }
                        }
                        class141.method918(var30 >> 16, var34, this.field9409, 0, var29 >> 16, -27209);
                        var29 += var9;
                        var34 += this.field9410;
                        var30 += var8;
                    }
                } else {
                    int var35 = arg4 - arg1;
                    int var36 = arg1 - arg2;
                    int var37 = this.field9410 * arg2;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class141.method918(var31 >> 16, var37, this.field9409, 0, var30 >> 16, -27209);
                                var31 += var10;
                                var30 += var8;
                                var37 += this.field9410;
                            }
                        }
                        class141.method918(var29 >> 16, var37, this.field9409, 0, var30 >> 16, -27209);
                        var37 += this.field9410;
                        var30 += var8;
                        var29 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg5 << 16;
                if (arg2 < 0) {
                    var38 -= arg2 * var9;
                    var39 -= arg2 * var8;
                    arg2 = 0;
                }
                int var40 = arg6 << 16;
                if (arg4 < 0) {
                    var40 -= arg4 * var10;
                    arg4 = 0;
                }
                if (var9 > var8) {
                    int var41 = arg1 - arg4;
                    int var42 = arg4 - arg2;
                    int var43 = this.field9410 * arg2;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class141.method918(var40 >> 16, var43, this.field9409, 0, var38 >> 16, -27209);
                                var43 += this.field9410;
                                var38 += var9;
                                var40 += var10;
                            }
                        }
                        class141.method918(var39 >> 16, var43, this.field9409, 0, var38 >> 16, arg3 - 27209);
                        var38 += var9;
                        var43 += this.field9410;
                        var39 += var8;
                    }
                } else {
                    int var44 = arg1 - arg4;
                    int var45 = arg4 - arg2;
                    int var46 = this.field9410 * arg2;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class141.method918(var38 >> 16, var46, this.field9409, 0, var40 >> 16, -27209);
                                var40 += var10;
                                var46 += this.field9410;
                                var38 += var9;
                            }
                        }
                        class141.method918(var38 >> 16, var46, this.field9409, 0, var39 >> 16, -27209);
                        var38 += var9;
                        var46 += this.field9410;
                        var39 += var8;
                    }
                }
            }
        } else if (arg4 < arg2) {
            int var47;
            int var48 = var47 = arg0 << 16;
            if (arg1 < 0) {
                var48 -= arg1 * var9;
                var47 -= arg1 * var10;
                arg1 = 0;
            }
            int var49 = arg6 << 16;
            if (arg4 < 0) {
                var49 -= arg4 * var8;
                arg4 = 0;
            }
            if (var10 <= var9) {
                int var50 = arg2 - arg4;
                int var51 = arg4 - arg1;
                int var52 = this.field9410 * arg1;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class141.method918(var49 >> 16, var52, this.field9409, 0, var48 >> 16, arg3 - 27209);
                            var48 += var9;
                            var52 += this.field9410;
                            var49 += var8;
                        }
                    }
                    class141.method918(var47 >> 16, var52, this.field9409, 0, var48 >> 16, -27209);
                    var47 += var10;
                    var52 += this.field9410;
                    var48 += var9;
                }
            } else {
                int var53 = arg2 - arg4;
                int var54 = arg4 - arg1;
                int var55 = this.field9410 * arg1;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class141.method918(var48 >> 16, var55, this.field9409, 0, var49 >> 16, arg3 - 27209);
                            var48 += var9;
                            var55 += this.field9410;
                            var49 += var8;
                        }
                    }
                    class141.method918(var48 >> 16, var55, this.field9409, 0, var47 >> 16, arg3 ^ 0xFFFF95B7);
                    var48 += var9;
                    var55 += this.field9410;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg0 << 16;
            int var58 = arg5 << 16;
            if (arg1 < 0) {
                var57 -= arg1 * var9;
                var56 -= arg1 * var10;
                arg1 = 0;
            }
            if (arg2 < 0) {
                var58 -= arg2 * var8;
                arg2 = 0;
            }
            if (var9 >= var10) {
                int var59 = arg4 - arg2;
                int var60 = arg2 - arg1;
                int var61 = this.field9410 * arg1;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class141.method918(var56 >> 16, var61, this.field9409, 0, var58 >> 16, -27209);
                            var61 += this.field9410;
                            var58 += var8;
                            var56 += var10;
                        }
                    }
                    class141.method918(var56 >> 16, var61, this.field9409, 0, var57 >> 16, -27209);
                    var56 += var10;
                    var61 += this.field9410;
                    var57 += var9;
                }
            } else {
                int var62 = arg4 - arg2;
                int var63 = arg2 - arg1;
                int var64 = this.field9410 * arg1;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class141.method918(var58 >> 16, var64, this.field9409, 0, var56 >> 16, arg3 - 27209);
                            var64 += this.field9410;
                            var58 += var8;
                            var56 += var10;
                        }
                    }
                    class141.method918(var57 >> 16, var64, this.field9409, 0, var56 >> 16, -27209);
                    var57 += var9;
                    var64 += this.field9410;
                    var56 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(B)V", line = 497)
    public final void method3827(byte arg0) {
        field9399++;
        int var2 = -1;
        int var3 = this.field9409.length - 8;
        while (var3 > var2) {
            var2++;
            this.field9409[var2] = 0;
            var2++;
            this.field9409[var2] = 0;
            var2++;
            this.field9409[var2] = 0;
            var2++;
            this.field9409[var2] = 0;
            var2++;
            this.field9409[var2] = 0;
            var2++;
            this.field9409[var2] = 0;
            var2++;
            this.field9409[var2] = 0;
            var2++;
            this.field9409[var2] = 0;
        }
        if (arg0 == 0) {
            while (this.field9409.length - 1 > var2) {
                var2++;
                this.field9409[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(III)Z", line = 529)
    public final boolean method3828(int arg0, int arg1, int arg2) {
        if (arg1 != -1155735024) {
            method3830((byte) -9, 34);
        }
        field9398++;
        return (arg0 * arg2) <= this.field9409.length;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIZI)V", line = 541)
    public final void method3829(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field9400++;
        this.field9410 = arg0 - arg2;
        this.field9405 = arg1;
        if (!arg3) {
            this.field9411 = arg4 - arg1;
            this.field9404 = arg2;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(BI)I", line = 560)
    public static final int method3830(byte arg0, int arg1) {
        field9403++;
        int var2 = 0;
        if (arg0 != -7) {
            field9406 = 3;
        }
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lep;II)V", line = 614)
    public class668(class371 arg0, int arg1, int arg2) {
        this.field9409 = new byte[arg1 * arg2];
    }
}
