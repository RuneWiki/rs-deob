import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class634 extends class120 {

    @OriginalMember(owner = "client!re", name = "I", descriptor = "[B")
    public byte[] field8933;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    public static int field8930 = -1;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "I")
    public int field8928;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field8929;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field8931;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "I")
    public int field8932;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public int field8934;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "I")
    public static int field8935;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    public static int field8937;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public int field8938;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public static int field8939;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IBI)Z")
    public final boolean method3562(int arg0, byte arg1, int arg2) {
        if (arg1 > -25) {
            return false;
        } else {
            field8937++;
            return (arg0 * arg2) <= this.field8933.length;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIII)V")
    public final void method3563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 2) {
            return;
        }
        field8936++;
        int var8 = 0;
        if (arg0 != arg4) {
            var8 = (arg1 - arg3 << 16) / (arg4 - arg0);
        }
        int var9 = 0;
        if (arg2 != arg4) {
            var9 = (arg6 - arg1 << 16) / (arg2 - arg4);
        }
        int var10 = 0;
        if (arg0 != arg2) {
            var10 = (arg3 - arg6 << 16) / (arg0 - arg2);
        }
        if (arg4 >= arg0 && arg2 >= arg0) {
            if (arg4 >= arg2) {
                int var11;
                int var12 = var11 = arg3 << 16;
                if (arg0 < 0) {
                    var12 -= arg0 * var10;
                    var11 -= arg0 * var8;
                    arg0 = 0;
                }
                int var13 = arg6 << 16;
                if (arg2 < 0) {
                    var13 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg0 != arg2 && var10 < var8 || arg0 == arg2 && var8 < var9) {
                    int var14 = arg4 - arg2;
                    int var15 = arg2 - arg0;
                    int var16 = this.field8932 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class552.method3129(26297, this.field8933, var11 >> 16, 0, var16, var13 >> 16);
                                var16 += this.field8932;
                                var11 += var8;
                                var13 += var9;
                            }
                        }
                        class552.method3129(arg5 + 26295, this.field8933, var11 >> 16, 0, var16, var12 >> 16);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field8932;
                    }
                } else {
                    int var17 = arg4 - arg2;
                    int var18 = arg2 - arg0;
                    int var19 = this.field8932 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class552.method3129(26297, this.field8933, var13 >> 16, 0, var19, var11 >> 16);
                                var13 += var9;
                                var19 += this.field8932;
                                var11 += var8;
                            }
                        }
                        class552.method3129(26297, this.field8933, var12 >> 16, 0, var19, var11 >> 16);
                        var12 += var10;
                        var11 += var8;
                        var19 += this.field8932;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg3 << 16;
                if (arg0 < 0) {
                    var21 -= arg0 * var10;
                    var20 -= arg0 * var8;
                    arg0 = 0;
                }
                int var22 = arg1 << 16;
                if (arg4 < 0) {
                    var22 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg0 != arg4 && var10 < var8 || arg0 == arg4 && var9 < var10) {
                    int var23 = arg2 - arg4;
                    int var24 = arg4 - arg0;
                    int var25 = this.field8932 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class552.method3129(26297, this.field8933, var22 >> 16, 0, var25, var21 >> 16);
                                var21 += var10;
                                var22 += var9;
                                var25 += this.field8932;
                            }
                        }
                        class552.method3129(arg5 ^ 0x66BB, this.field8933, var20 >> 16, 0, var25, var21 >> 16);
                        var21 += var10;
                        var25 += this.field8932;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg2 - arg4;
                    int var27 = arg4 - arg0;
                    int var28 = this.field8932 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class552.method3129(arg5 + 26295, this.field8933, var21 >> 16, 0, var28, var22 >> 16);
                                var21 += var10;
                                var28 += this.field8932;
                                var22 += var9;
                            }
                        }
                        class552.method3129(arg5 ^ 0x66BB, this.field8933, var21 >> 16, 0, var28, var20 >> 16);
                        var20 += var8;
                        var28 += this.field8932;
                        var21 += var10;
                    }
                }
            }
        } else if (arg4 > arg2) {
            if (arg4 <= arg0) {
                int var29;
                int var30 = var29 = arg6 << 16;
                int var31 = arg1 << 16;
                if (arg2 < 0) {
                    var30 -= arg2 * var9;
                    var29 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg4 < 0) {
                    var31 -= arg4 * var8;
                    arg4 = 0;
                }
                if (var10 <= var9) {
                    int var32 = arg0 - arg4;
                    int var33 = arg4 - arg2;
                    int var34 = this.field8932 * arg2;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class552.method3129(26297, this.field8933, var31 >> 16, 0, var34, var29 >> 16);
                                var34 += this.field8932;
                                var31 += var8;
                                var29 += var10;
                            }
                        }
                        class552.method3129(26297, this.field8933, var30 >> 16, 0, var34, var29 >> 16);
                        var30 += var9;
                        var29 += var10;
                        var34 += this.field8932;
                    }
                } else {
                    int var35 = arg0 - arg4;
                    int var36 = arg4 - arg2;
                    int var37 = this.field8932 * arg2;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class552.method3129(26297, this.field8933, var29 >> 16, 0, var37, var31 >> 16);
                                var37 += this.field8932;
                                var29 += var10;
                                var31 += var8;
                            }
                        }
                        class552.method3129(26297, this.field8933, var29 >> 16, 0, var37, var30 >> 16);
                        var29 += var10;
                        var37 += this.field8932;
                        var30 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg6 << 16;
                int var40 = arg3 << 16;
                if (arg2 < 0) {
                    var39 -= arg2 * var9;
                    var38 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg0 < 0) {
                    var40 -= arg0 * var8;
                    arg0 = 0;
                }
                if (var10 > var9) {
                    int var41 = arg4 - arg0;
                    int var42 = arg0 - arg2;
                    int var43 = this.field8932 * arg2;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class552.method3129(26297, this.field8933, var40 >> 16, 0, var43, var39 >> 16);
                                var39 += var9;
                                var40 += var8;
                                var43 += this.field8932;
                            }
                        }
                        class552.method3129(arg5 ^ 0x66BB, this.field8933, var38 >> 16, 0, var43, var39 >> 16);
                        var38 += var10;
                        var39 += var9;
                        var43 += this.field8932;
                    }
                } else {
                    int var44 = arg4 - arg0;
                    int var45 = arg0 - arg2;
                    int var46 = this.field8932 * arg2;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class552.method3129(26297, this.field8933, var39 >> 16, 0, var46, var40 >> 16);
                                var40 += var8;
                                var46 += this.field8932;
                                var39 += var9;
                            }
                        }
                        class552.method3129(26297, this.field8933, var39 >> 16, 0, var46, var38 >> 16);
                        var39 += var9;
                        var46 += this.field8932;
                        var38 += var10;
                    }
                }
            }
        } else if (arg2 >= arg0) {
            int var47;
            int var48 = var47 = arg1 << 16;
            if (arg4 < 0) {
                var48 -= arg4 * var8;
                var47 -= arg4 * var9;
                arg4 = 0;
            }
            int var49 = arg3 << 16;
            if (arg0 < 0) {
                var49 -= arg0 * var10;
                arg0 = 0;
            }
            if (var8 >= var9) {
                int var50 = arg2 - arg0;
                int var51 = arg0 - arg4;
                int var52 = this.field8932 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class552.method3129(26297, this.field8933, var49 >> 16, 0, var52, var47 >> 16);
                            var52 += this.field8932;
                            var49 += var10;
                            var47 += var9;
                        }
                    }
                    class552.method3129(26297, this.field8933, var48 >> 16, 0, var52, var47 >> 16);
                    var48 += var8;
                    var52 += this.field8932;
                    var47 += var9;
                }
            } else {
                int var53 = arg2 - arg0;
                int var54 = arg0 - arg4;
                int var55 = this.field8932 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class552.method3129(arg5 ^ 0x66BB, this.field8933, var47 >> 16, 0, var55, var49 >> 16);
                            var47 += var9;
                            var55 += this.field8932;
                            var49 += var10;
                        }
                    }
                    class552.method3129(26297, this.field8933, var47 >> 16, 0, var55, var48 >> 16);
                    var47 += var9;
                    var55 += this.field8932;
                    var48 += var8;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg1 << 16;
            if (arg4 < 0) {
                var56 -= arg4 * var9;
                var57 -= arg4 * var8;
                arg4 = 0;
            }
            int var58 = arg6 << 16;
            if (arg2 < 0) {
                var58 -= arg2 * var10;
                arg2 = 0;
            }
            if (arg2 != arg4 && var9 > var8 || arg2 == arg4 && var8 > var10) {
                int var59 = arg0 - arg2;
                int var60 = arg2 - arg4;
                int var61 = this.field8932 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class552.method3129(26297, this.field8933, var58 >> 16, 0, var61, var57 >> 16);
                            var58 += var10;
                            var61 += this.field8932;
                            var57 += var8;
                        }
                    }
                    class552.method3129(arg5 ^ 0x66BB, this.field8933, var56 >> 16, 0, var61, var57 >> 16);
                    var61 += this.field8932;
                    var57 += var8;
                    var56 += var9;
                }
            } else {
                int var62 = arg0 - arg2;
                int var63 = arg2 - arg4;
                int var64 = this.field8932 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class552.method3129(26297, this.field8933, var57 >> 16, 0, var64, var58 >> 16);
                            var64 += this.field8932;
                            var57 += var8;
                            var58 += var10;
                        }
                    }
                    class552.method3129(26297, this.field8933, var57 >> 16, 0, var64, var56 >> 16);
                    var56 += var9;
                    var64 += this.field8932;
                    var57 += var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)I")
    public static final int method3564(int arg0, int arg1, int arg2) {
        field8935++;
        if (arg2 < arg1) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        if (arg0 != -1164236048) {
            method3564(125, -98, -65);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(B)V")
    public final void method3565(byte arg0) {
        if (arg0 >= -52) {
            field8930 = 124;
        }
        field8929++;
        int var2 = -1;
        int var3 = this.field8933.length - 8;
        while (var3 > var2) {
            var2++;
            this.field8933[var2] = 0;
            var2++;
            this.field8933[var2] = 0;
            var2++;
            this.field8933[var2] = 0;
            var2++;
            this.field8933[var2] = 0;
            var2++;
            this.field8933[var2] = 0;
            var2++;
            this.field8933[var2] = 0;
            var2++;
            this.field8933[var2] = 0;
            var2++;
            this.field8933[var2] = 0;
        }
        while ((this.field8933.length - 1) > var2) {
            var2++;
            this.field8933[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lmj;II)V")
    public class634(class344 arg0, int arg1, int arg2) {
        this.field8933 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lpi;IILjava/lang/String;)Lbp;")
    public static final class88 method3566(class464 arg0, int arg1, int arg2, String arg3) {
        if (arg2 != 0) {
            field8930 = 43;
        }
        field8939++;
        if (arg1 == 0) {
            return arg0.method2665(arg3, (byte) 91);
        } else if (arg1 == 1) {
            try {
                class627.method3522(new Object[] { (new URL(class591.field8347.getCodeBase(), arg3)).toString() }, class591.field8347, "openjs", -118);
                class88 var4 = new class88();
                var4.field884 = 1;
                return var4;
            } catch (Throwable var10) {
                class88 var5 = new class88();
                var5.field884 = 2;
                return var5;
            }
        } else if (arg1 == 2) {
            try {
                class591.field8347.getAppletContext().showDocument(new URL(class591.field8347.getCodeBase(), arg3), "_blank");
                class88 var6 = new class88();
                var6.field884 = 1;
                return var6;
            } catch (Exception var11) {
                class88 var7 = new class88();
                var7.field884 = 2;
                return var7;
            }
        } else if (arg1 == 3) {
            try {
                class627.method3524("loggedout", class591.field8347, arg2 ^ 0x5B7D);
            } catch (Throwable var13) {
            }
            try {
                class591.field8347.getAppletContext().showDocument(new URL(class591.field8347.getCodeBase(), arg3), "_top");
                class88 var8 = new class88();
                var8.field884 = 1;
                return var8;
            } catch (Exception var12) {
                class88 var9 = new class88();
                var9.field884 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
    public final void method3567(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 <= 66) {
            this.method3567(-49, 79, -85, -24, 39);
        }
        this.field8928 = arg1;
        this.field8932 = arg0 - arg2;
        field8931++;
        this.field8938 = arg2;
        this.field8934 = arg4 - arg1;
    }
}
