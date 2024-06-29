import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class281 extends class709 {

    @OriginalMember(owner = "client!oca", name = "w", descriptor = "[B")
    public byte[] field4073;

    @OriginalMember(owner = "client!oca", name = "x", descriptor = "I")
    public int field4074;

    @OriginalMember(owner = "client!oca", name = "y", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!oca", name = "z", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!oca", name = "A", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!oca", name = "C", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!oca", name = "D", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!oca", name = "E", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!oca", name = "F", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!oca", name = "G", descriptor = "I")
    public int field4083;

    @OriginalMember(owner = "client!oca", name = "H", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!oca", name = "I", descriptor = "I")
    public int field4085;

    @OriginalMember(owner = "client!oca", name = "J", descriptor = "I")
    public int field4086;

    @OriginalMember(owner = "client!oca", name = "B", descriptor = "Luu;")
    public static class237 field4078;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(B)V", line = 3)
    public static void method1873(byte arg0) {
        field4078 = null;
        if (arg0 != -16) {
            method1879((byte) -118);
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 13)
    public static final String method1874(String arg0, byte arg1) {
        field4081++;
        if (class47.field612.startsWith("win")) {
            return arg0 + ".dll";
        } else if (class47.field612.startsWith("linux")) {
            return "lib" + arg0 + ".so";
        } else if (class47.field612.startsWith("mac")) {
            return "lib" + arg0 + ".dylib";
        } else if (arg1 == -37) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(ILdc;)Lfq;", line = 35)
    public static final class204 method1875(int arg0, class63 arg1) {
        field4080++;
        class545 var2 = class272.method1831(-120, arg1);
        int var3 = arg1.method457(-14532);
        if (arg0 == -1121602832) {
            int var4 = arg1.method457(-14532);
            int var5 = arg1.method482(-772591672);
            return new class204(var2.field7560, var2.field7553, var2.field7557, var2.field7562, var2.field7561, var2.field7550, var2.field7555, var2.field7549, var2.field7563, var3, var4, var5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)Z", line = 54)
    public final boolean method1876(int arg0, int arg1, int arg2) {
        field4075++;
        if (arg1 != -15204) {
            method1879((byte) 30);
        }
        return (arg0 * arg2) <= this.field4073.length;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(ZIIII)V", line = 69)
    public final void method1877(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4074 = arg3;
        if (arg0) {
            this.field4083 = 44;
        }
        field4076++;
        this.field4086 = arg4 - arg3;
        this.field4083 = arg2;
        this.field4085 = arg1 - arg2;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIIIBII)V", line = 87)
    public final void method1878(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field4082++;
        int var8 = 0;
        if (arg1 != arg2) {
            var8 = (arg3 - arg5 << 16) / (arg1 - arg2);
        }
        int var9 = 0;
        if (arg0 != arg1) {
            var9 = (arg6 - arg3 << 16) / (arg0 - arg1);
        }
        if (arg4 <= 94) {
            this.field4074 = 89;
        }
        int var10 = 0;
        if (arg0 != arg2) {
            var10 = (arg5 - arg6 << 16) / (arg2 - arg0);
        }
        if (arg1 >= arg2 && arg2 <= arg0) {
            if (arg1 >= arg0) {
                int var11;
                int var12 = var11 = arg5 << 16;
                int var13 = arg6 << 16;
                if (arg2 < 0) {
                    var11 -= arg2 * var8;
                    var12 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg0 < 0) {
                    var13 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg2 && var8 > var10 || arg0 == arg2 && var9 > var8) {
                    int var14 = arg1 - arg0;
                    int var15 = arg0 - arg2;
                    int var16 = this.field4086 * arg2;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class307.method2013(var16, 0, var11 >> 16, var13 >> 16, -36, this.field4073);
                                var13 += var9;
                                var11 += var8;
                                var16 += this.field4086;
                            }
                        }
                        class307.method2013(var16, 0, var11 >> 16, var12 >> 16, -22, this.field4073);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field4086;
                    }
                } else {
                    int var17 = arg1 - arg0;
                    int var18 = arg0 - arg2;
                    int var19 = this.field4086 * arg2;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class307.method2013(var19, 0, var13 >> 16, var11 >> 16, -56, this.field4073);
                                var11 += var8;
                                var19 += this.field4086;
                                var13 += var9;
                            }
                        }
                        class307.method2013(var19, 0, var12 >> 16, var11 >> 16, -24, this.field4073);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field4086;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg5 << 16;
                int var22 = arg3 << 16;
                if (arg2 < 0) {
                    var20 -= arg2 * var8;
                    var21 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg1 < 0) {
                    var22 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg1 != arg2 && var10 < var8 || arg1 == arg2 && var9 < var10) {
                    int var23 = arg0 - arg1;
                    int var24 = arg1 - arg2;
                    int var25 = this.field4086 * arg2;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class307.method2013(var25, 0, var22 >> 16, var21 >> 16, -125, this.field4073);
                                var22 += var9;
                                var25 += this.field4086;
                                var21 += var10;
                            }
                        }
                        class307.method2013(var25, 0, var20 >> 16, var21 >> 16, -81, this.field4073);
                        var20 += var8;
                        var25 += this.field4086;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg0 - arg1;
                    int var27 = arg1 - arg2;
                    int var28 = this.field4086 * arg2;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class307.method2013(var28, 0, var21 >> 16, var22 >> 16, -45, this.field4073);
                                var28 += this.field4086;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class307.method2013(var28, 0, var21 >> 16, var20 >> 16, -77, this.field4073);
                        var28 += this.field4086;
                        var20 += var8;
                        var21 += var10;
                    }
                }
            }
        } else if (arg0 < arg1) {
            if (arg1 <= arg2) {
                int var29;
                int var30 = var29 = arg6 << 16;
                int var31 = arg3 << 16;
                if (arg0 < 0) {
                    var30 -= arg0 * var9;
                    var29 -= arg0 * var10;
                    arg0 = 0;
                }
                if (arg1 < 0) {
                    var31 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var9 < var10) {
                    int var32 = arg2 - arg1;
                    int var33 = arg1 - arg0;
                    int var34 = this.field4086 * arg0;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class307.method2013(var34, 0, var29 >> 16, var31 >> 16, -38, this.field4073);
                                var29 += var10;
                                var34 += this.field4086;
                                var31 += var8;
                            }
                        }
                        class307.method2013(var34, 0, var29 >> 16, var30 >> 16, -79, this.field4073);
                        var34 += this.field4086;
                        var30 += var9;
                        var29 += var10;
                    }
                } else {
                    int var35 = arg2 - arg1;
                    int var36 = arg1 - arg0;
                    int var37 = this.field4086 * arg0;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class307.method2013(var37, 0, var31 >> 16, var29 >> 16, -45, this.field4073);
                                var37 += this.field4086;
                                var29 += var10;
                                var31 += var8;
                            }
                        }
                        class307.method2013(var37, 0, var30 >> 16, var29 >> 16, -84, this.field4073);
                        var29 += var10;
                        var37 += this.field4086;
                        var30 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg6 << 16;
                int var40 = arg5 << 16;
                if (arg0 < 0) {
                    var38 -= arg0 * var10;
                    var39 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg2 < 0) {
                    var40 -= arg2 * var8;
                    arg2 = 0;
                }
                if (var10 > var9) {
                    int var41 = arg1 - arg2;
                    int var42 = arg2 - arg0;
                    int var43 = this.field4086 * arg0;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class307.method2013(var43, 0, var40 >> 16, var39 >> 16, -40, this.field4073);
                                var40 += var8;
                                var43 += this.field4086;
                                var39 += var9;
                            }
                        }
                        class307.method2013(var43, 0, var38 >> 16, var39 >> 16, -26, this.field4073);
                        var38 += var10;
                        var43 += this.field4086;
                        var39 += var9;
                    }
                } else {
                    int var44 = arg1 - arg2;
                    int var45 = arg2 - arg0;
                    int var46 = this.field4086 * arg0;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class307.method2013(var46, 0, var39 >> 16, var40 >> 16, -15, this.field4073);
                                var39 += var9;
                                var46 += this.field4086;
                                var40 += var8;
                            }
                        }
                        class307.method2013(var46, 0, var39 >> 16, var38 >> 16, -42, this.field4073);
                        var39 += var9;
                        var46 += this.field4086;
                        var38 += var10;
                    }
                }
            }
        } else if (arg0 >= arg2) {
            int var47;
            int var48 = var47 = arg3 << 16;
            int var49 = arg5 << 16;
            if (arg1 < 0) {
                var48 -= arg1 * var8;
                var47 -= arg1 * var9;
                arg1 = 0;
            }
            if (arg2 < 0) {
                var49 -= arg2 * var10;
                arg2 = 0;
            }
            if (var8 >= var9) {
                int var50 = arg0 - arg2;
                int var51 = arg2 - arg1;
                int var52 = this.field4086 * arg1;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class307.method2013(var52, 0, var49 >> 16, var47 >> 16, -82, this.field4073);
                            var52 += this.field4086;
                            var47 += var9;
                            var49 += var10;
                        }
                    }
                    class307.method2013(var52, 0, var48 >> 16, var47 >> 16, -21, this.field4073);
                    var48 += var8;
                    var52 += this.field4086;
                    var47 += var9;
                }
            } else {
                int var53 = arg0 - arg2;
                int var54 = arg2 - arg1;
                int var55 = this.field4086 * arg1;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class307.method2013(var55, 0, var47 >> 16, var49 >> 16, -52, this.field4073);
                            var49 += var10;
                            var47 += var9;
                            var55 += this.field4086;
                        }
                    }
                    class307.method2013(var55, 0, var47 >> 16, var48 >> 16, -51, this.field4073);
                    var48 += var8;
                    var55 += this.field4086;
                    var47 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg3 << 16;
            if (arg1 < 0) {
                var56 -= arg1 * var9;
                var57 -= arg1 * var8;
                arg1 = 0;
            }
            int var58 = arg6 << 16;
            if (arg0 < 0) {
                var58 -= arg0 * var10;
                arg0 = 0;
            }
            if (arg0 != arg1 && var9 > var8 || arg0 == arg1 && var10 < var8) {
                int var59 = arg2 - arg0;
                int var60 = arg0 - arg1;
                int var61 = this.field4086 * arg1;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class307.method2013(var61, 0, var58 >> 16, var57 >> 16, -27, this.field4073);
                            var61 += this.field4086;
                            var57 += var8;
                            var58 += var10;
                        }
                    }
                    class307.method2013(var61, 0, var56 >> 16, var57 >> 16, -125, this.field4073);
                    var57 += var8;
                    var61 += this.field4086;
                    var56 += var9;
                }
            } else {
                int var62 = arg2 - arg0;
                int var63 = arg0 - arg1;
                int var64 = this.field4086 * arg1;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class307.method2013(var64, 0, var57 >> 16, var58 >> 16, -70, this.field4073);
                            var57 += var8;
                            var58 += var10;
                            var64 += this.field4086;
                        }
                    }
                    class307.method2013(var64, 0, var57 >> 16, var56 >> 16, -90, this.field4073);
                    var56 += var9;
                    var57 += var8;
                    var64 += this.field4086;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "(B)V", line = 538)
    public static final void method1879(byte arg0) {
        class516.field7210.method2191(-1);
        field4084++;
        int var1 = 23 % ((arg0 + 6) / 32);
        class736.method4101(-89);
        class600.field8121 = null;
        class113.field1523 = null;
        class84.field1188 = 0;
        class68.field1048 = 0;
        class352.field5071.field956 = 0;
        class594.field8063 = null;
        class185.method1159(-101);
        class239.field3558 = 0;
        class691.field9619 = 0;
        class623.field8402 = null;
        class432.field6031 = 0;
        class13.field126 = null;
    }

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "(B)V", line = 563)
    public final void method1880(byte arg0) {
        field4077++;
        int var2 = -1;
        int var3 = 122 / ((arg0 - 75) / 50);
        int var4 = this.field4073.length - 8;
        while (var4 > var2) {
            var2++;
            this.field4073[var2] = 0;
            var2++;
            this.field4073[var2] = 0;
            var2++;
            this.field4073[var2] = 0;
            var2++;
            this.field4073[var2] = 0;
            var2++;
            this.field4073[var2] = 0;
            var2++;
            this.field4073[var2] = 0;
            var2++;
            this.field4073[var2] = 0;
            var2++;
            this.field4073[var2] = 0;
        }
        while (var2 < this.field4073.length - 1) {
            var2++;
            this.field4073[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lrl;II)V", line = 590)
    public class281(class232 arg0, int arg1, int arg2) {
        this.field4073 = new byte[arg1 * arg2];
    }
}
