import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class341 extends class271 {

    @OriginalMember(owner = "client!mv", name = "C", descriptor = "[B")
    public byte[] field4954;

    @OriginalMember(owner = "client!mv", name = "E", descriptor = "Llaa;")
    public static class106 field4956 = new class106(9, 0, 4, 1);

    @OriginalMember(owner = "client!mv", name = "w", descriptor = "I")
    public int field4948;

    @OriginalMember(owner = "client!mv", name = "x", descriptor = "I")
    public int field4949;

    @OriginalMember(owner = "client!mv", name = "y", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!mv", name = "z", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!mv", name = "A", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!mv", name = "B", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!mv", name = "D", descriptor = "I")
    public int field4955;

    @OriginalMember(owner = "client!mv", name = "F", descriptor = "I")
    public int field4957;

    @OriginalMember(owner = "client!mv", name = "G", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(B)V", line = 4)
    public final void method2039(byte arg0) {
        if (arg0 != 0) {
            this.field4954 = null;
        }
        field4950++;
        int var2 = -1;
        int var3 = this.field4954.length - 8;
        while (var3 > var2) {
            var2++;
            this.field4954[var2] = 0;
            var2++;
            this.field4954[var2] = 0;
            var2++;
            this.field4954[var2] = 0;
            var2++;
            this.field4954[var2] = 0;
            var2++;
            this.field4954[var2] = 0;
            var2++;
            this.field4954[var2] = 0;
            var2++;
            this.field4954[var2] = 0;
            var2++;
            this.field4954[var2] = 0;
        }
        while ((this.field4954.length - 1) > var2) {
            var2++;
            this.field4954[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BLpj;Ltt;)V", line = 37)
    public static final void method2040(byte arg0, class132 arg1, class79 arg2) {
        class605.field8438 = "";
        if (arg0 <= 15) {
            method2040((byte) -39, null, null);
        }
        class370.field5276 = arg1;
        class591.field8235 = arg2;
        field4951++;
        if (class339.field4919.startsWith("win")) {
            class605.field8438 = class605.field8438 + "windows/";
        } else if (class339.field4919.startsWith("linux")) {
            class605.field8438 = class605.field8438 + "linux/";
        } else if (class339.field4919.startsWith("mac")) {
            class605.field8438 = class605.field8438 + "macos/";
        }
        if (class591.field8235.field1090) {
            class605.field8438 = class605.field8438 + "msjava/";
        } else if (class339.field4923.startsWith("amd64") || class339.field4923.startsWith("x86_64")) {
            class605.field8438 = class605.field8438 + "x86_64/";
        } else if (class339.field4923.startsWith("i386") || class339.field4923.startsWith("i486") || class339.field4923.startsWith("i586") || class339.field4923.startsWith("x86")) {
            class605.field8438 = class605.field8438 + "x86/";
        } else if (class339.field4923.startsWith("ppc")) {
            class605.field8438 = class605.field8438 + "ppc/";
        } else {
            class605.field8438 = class605.field8438 + "universal/";
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIBIIII)V", line = 91)
    public final void method2041(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field4958++;
        int var8 = 0;
        if (arg4 != arg5) {
            var8 = (arg3 - arg6 << 16) / (arg4 - arg5);
        }
        int var9 = 0;
        if (arg1 != arg4) {
            var9 = (arg0 - arg3 << 16) / (arg1 - arg4);
        }
        int var10 = 7 % ((68 - arg2) / 58);
        int var11 = 0;
        if (arg1 != arg5) {
            var11 = (arg6 - arg0 << 16) / (arg5 - arg1);
        }
        if (arg5 <= arg4 && arg1 >= arg5) {
            if (arg1 <= arg4) {
                int var12;
                int var13 = var12 = arg6 << 16;
                int var14 = arg0 << 16;
                if (arg5 < 0) {
                    var13 -= arg5 * var11;
                    var12 -= arg5 * var8;
                    arg5 = 0;
                }
                if (arg1 < 0) {
                    var14 -= arg1 * var9;
                    arg1 = 0;
                }
                if ((arg1 == arg5 || var11 >= var8) && (arg1 != arg5 || var8 >= var9)) {
                    int var18 = arg4 - arg1;
                    int var19 = arg1 - arg5;
                    int var20 = this.field4957 * arg5;
                    while (true) {
                        var19--;
                        if (var19 < 0) {
                            while (true) {
                                var18--;
                                if (var18 < 0) {
                                    return;
                                }
                                class610.method3370(-4638, this.field4954, var14 >> 16, var20, 0, var12 >> 16);
                                var20 += this.field4957;
                                var12 += var8;
                                var14 += var9;
                            }
                        }
                        class610.method3370(-4638, this.field4954, var13 >> 16, var20, 0, var12 >> 16);
                        var12 += var8;
                        var13 += var11;
                        var20 += this.field4957;
                    }
                } else {
                    int var15 = arg4 - arg1;
                    int var16 = arg1 - arg5;
                    int var17 = this.field4957 * arg5;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            while (true) {
                                var15--;
                                if (var15 < 0) {
                                    return;
                                }
                                class610.method3370(-4638, this.field4954, var12 >> 16, var17, 0, var14 >> 16);
                                var17 += this.field4957;
                                var14 += var9;
                                var12 += var8;
                            }
                        }
                        class610.method3370(-4638, this.field4954, var12 >> 16, var17, 0, var13 >> 16);
                        var12 += var8;
                        var17 += this.field4957;
                        var13 += var11;
                    }
                }
            } else {
                int var21;
                int var22 = var21 = arg6 << 16;
                if (arg5 < 0) {
                    var22 -= arg5 * var11;
                    var21 -= arg5 * var8;
                    arg5 = 0;
                }
                int var23 = arg3 << 16;
                if (arg4 < 0) {
                    var23 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg4 != arg5 && var11 < var8 || arg4 == arg5 && var11 > var9) {
                    int var24 = arg1 - arg4;
                    int var25 = arg4 - arg5;
                    int var26 = this.field4957 * arg5;
                    while (true) {
                        var25--;
                        if (var25 < 0) {
                            while (true) {
                                var24--;
                                if (var24 < 0) {
                                    return;
                                }
                                class610.method3370(-4638, this.field4954, var23 >> 16, var26, 0, var22 >> 16);
                                var26 += this.field4957;
                                var23 += var9;
                                var22 += var11;
                            }
                        }
                        class610.method3370(-4638, this.field4954, var21 >> 16, var26, 0, var22 >> 16);
                        var21 += var8;
                        var22 += var11;
                        var26 += this.field4957;
                    }
                } else {
                    int var27 = arg1 - arg4;
                    int var28 = arg4 - arg5;
                    int var29 = this.field4957 * arg5;
                    while (true) {
                        var28--;
                        if (var28 < 0) {
                            while (true) {
                                var27--;
                                if (var27 < 0) {
                                    return;
                                }
                                class610.method3370(-4638, this.field4954, var22 >> 16, var29, 0, var23 >> 16);
                                var23 += var9;
                                var22 += var11;
                                var29 += this.field4957;
                            }
                        }
                        class610.method3370(-4638, this.field4954, var22 >> 16, var29, 0, var21 >> 16);
                        var22 += var11;
                        var21 += var8;
                        var29 += this.field4957;
                    }
                }
            }
        } else if (arg4 <= arg1) {
            if (arg1 >= arg5) {
                int var30;
                int var31 = var30 = arg3 << 16;
                if (arg4 < 0) {
                    var30 -= arg4 * var9;
                    var31 -= arg4 * var8;
                    arg4 = 0;
                }
                int var32 = arg6 << 16;
                if (arg5 < 0) {
                    var32 -= arg5 * var11;
                    arg5 = 0;
                }
                if (var8 >= var9) {
                    int var33 = arg1 - arg5;
                    int var34 = arg5 - arg4;
                    int var35 = this.field4957 * arg4;
                    while (true) {
                        var34--;
                        if (var34 < 0) {
                            while (true) {
                                var33--;
                                if (var33 < 0) {
                                    return;
                                }
                                class610.method3370(-4638, this.field4954, var32 >> 16, var35, 0, var30 >> 16);
                                var35 += this.field4957;
                                var32 += var11;
                                var30 += var9;
                            }
                        }
                        class610.method3370(-4638, this.field4954, var31 >> 16, var35, 0, var30 >> 16);
                        var31 += var8;
                        var30 += var9;
                        var35 += this.field4957;
                    }
                } else {
                    int var36 = arg1 - arg5;
                    int var37 = arg5 - arg4;
                    int var38 = this.field4957 * arg4;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            while (true) {
                                var36--;
                                if (var36 < 0) {
                                    return;
                                }
                                class610.method3370(-4638, this.field4954, var30 >> 16, var38, 0, var32 >> 16);
                                var32 += var11;
                                var38 += this.field4957;
                                var30 += var9;
                            }
                        }
                        class610.method3370(-4638, this.field4954, var30 >> 16, var38, 0, var31 >> 16);
                        var31 += var8;
                        var38 += this.field4957;
                        var30 += var9;
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
                int var41 = arg0 << 16;
                if (arg1 < 0) {
                    var41 -= arg1 * var11;
                    arg1 = 0;
                }
                if (arg1 != arg4 && var9 > var8 || arg1 == arg4 && var11 < var8) {
                    int var42 = arg5 - arg1;
                    int var43 = arg1 - arg4;
                    int var44 = this.field4957 * arg4;
                    while (true) {
                        var43--;
                        if (var43 < 0) {
                            while (true) {
                                var42--;
                                if (var42 < 0) {
                                    return;
                                }
                                class610.method3370(-4638, this.field4954, var41 >> 16, var44, 0, var40 >> 16);
                                var41 += var11;
                                var44 += this.field4957;
                                var40 += var8;
                            }
                        }
                        class610.method3370(-4638, this.field4954, var39 >> 16, var44, 0, var40 >> 16);
                        var39 += var9;
                        var44 += this.field4957;
                        var40 += var8;
                    }
                } else {
                    int var45 = arg5 - arg1;
                    int var46 = arg1 - arg4;
                    int var47 = this.field4957 * arg4;
                    while (true) {
                        var46--;
                        if (var46 < 0) {
                            while (true) {
                                var45--;
                                if (var45 < 0) {
                                    return;
                                }
                                class610.method3370(-4638, this.field4954, var40 >> 16, var47, 0, var41 >> 16);
                                var40 += var8;
                                var41 += var11;
                                var47 += this.field4957;
                            }
                        }
                        class610.method3370(-4638, this.field4954, var40 >> 16, var47, 0, var39 >> 16);
                        var40 += var8;
                        var47 += this.field4957;
                        var39 += var9;
                    }
                }
            }
        } else if (arg5 >= arg4) {
            int var48;
            int var49 = var48 = arg0 << 16;
            int var50 = arg3 << 16;
            if (arg1 < 0) {
                var48 -= arg1 * var11;
                var49 -= arg1 * var9;
                arg1 = 0;
            }
            if (arg4 < 0) {
                var50 -= arg4 * var8;
                arg4 = 0;
            }
            if (var11 > var9) {
                int var51 = arg5 - arg4;
                int var52 = arg4 - arg1;
                int var53 = this.field4957 * arg1;
                while (true) {
                    var52--;
                    if (var52 < 0) {
                        while (true) {
                            var51--;
                            if (var51 < 0) {
                                return;
                            }
                            class610.method3370(-4638, this.field4954, var48 >> 16, var53, 0, var50 >> 16);
                            var50 += var8;
                            var48 += var11;
                            var53 += this.field4957;
                        }
                    }
                    class610.method3370(-4638, this.field4954, var48 >> 16, var53, 0, var49 >> 16);
                    var49 += var9;
                    var48 += var11;
                    var53 += this.field4957;
                }
            } else {
                int var54 = arg5 - arg4;
                int var55 = arg4 - arg1;
                int var56 = this.field4957 * arg1;
                while (true) {
                    var55--;
                    if (var55 < 0) {
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                return;
                            }
                            class610.method3370(-4638, this.field4954, var50 >> 16, var56, 0, var48 >> 16);
                            var50 += var8;
                            var48 += var11;
                            var56 += this.field4957;
                        }
                    }
                    class610.method3370(-4638, this.field4954, var49 >> 16, var56, 0, var48 >> 16);
                    var56 += this.field4957;
                    var49 += var9;
                    var48 += var11;
                }
            }
        } else {
            int var57;
            int var58 = var57 = arg0 << 16;
            int var59 = arg6 << 16;
            if (arg1 < 0) {
                var58 -= arg1 * var9;
                var57 -= arg1 * var11;
                arg1 = 0;
            }
            if (arg5 < 0) {
                var59 -= arg5 * var8;
                arg5 = 0;
            }
            if (var11 > var9) {
                int var60 = arg4 - arg5;
                int var61 = arg5 - arg1;
                int var62 = this.field4957 * arg1;
                while (true) {
                    var61--;
                    if (var61 < 0) {
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                return;
                            }
                            class610.method3370(-4638, this.field4954, var59 >> 16, var62, 0, var58 >> 16);
                            var62 += this.field4957;
                            var59 += var8;
                            var58 += var9;
                        }
                    }
                    class610.method3370(-4638, this.field4954, var57 >> 16, var62, 0, var58 >> 16);
                    var62 += this.field4957;
                    var58 += var9;
                    var57 += var11;
                }
            } else {
                int var63 = arg4 - arg5;
                int var64 = arg5 - arg1;
                int var65 = this.field4957 * arg1;
                while (true) {
                    var64--;
                    if (var64 < 0) {
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                return;
                            }
                            class610.method3370(-4638, this.field4954, var58 >> 16, var65, 0, var59 >> 16);
                            var59 += var8;
                            var58 += var9;
                            var65 += this.field4957;
                        }
                    }
                    class610.method3370(-4638, this.field4954, var58 >> 16, var65, 0, var57 >> 16);
                    var57 += var11;
                    var65 += this.field4957;
                    var58 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(III)Z", line = 529)
    public final boolean method2042(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field4953++;
            return arg0 * arg1 <= this.field4954.length;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIBII)V", line = 541)
    public final void method2043(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        this.field4948 = arg4;
        this.field4949 = arg1 - arg4;
        field4952++;
        this.field4957 = arg0 - arg3;
        this.field4955 = arg3;
        if (arg2 > -44) {
            this.method2043(89, -51, (byte) -95, 124, 127);
        }
    }

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "(I)V", line = 559)
    public static void method2044(int arg0) {
        if (arg0 != 0) {
            method2044(-74);
        }
        field4956 = null;
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Len;II)V", line = 573)
    public class341(class289 arg0, int arg1, int arg2) {
        this.field4954 = new byte[arg1 * arg2];
    }
}
