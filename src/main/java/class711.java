import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class711 extends class706 {

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "[B")
    public byte[] field10012;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "I")
    public static int field10008 = 13156520;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "Z")
    public static boolean field10015 = true;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
    public static int field10016 = 0;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
    public static int field10001;

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
    public static int field10002;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
    public int field10003;

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
    public static int field10004;

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "I")
    public static int field10005;

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
    public static int field10006;

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "I")
    public int field10007;

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
    public static int field10009;

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
    public static int field10010;

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "I")
    public static int field10011;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    public int field10013;

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "I")
    public static int field10014;

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "I")
    public int field10017;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIBI)V", line = 8)
    public final void method3936(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field10005++;
        int var8 = 0;
        if (arg0 != arg4) {
            var8 = (arg2 - arg6 << 16) / (arg4 - arg0);
        }
        if (arg5 >= -72) {
            this.field10003 = 95;
        }
        int var9 = 0;
        if (arg1 != arg4) {
            var9 = (arg3 - arg2 << 16) / (arg1 - arg4);
        }
        int var10 = 0;
        if (arg0 != arg1) {
            var10 = (arg6 - arg3 << 16) / (arg0 - arg1);
        }
        if (arg0 <= arg4 && arg0 <= arg1) {
            if (arg1 > arg4) {
                int var11;
                int var12 = var11 = arg6 << 16;
                if (arg0 < 0) {
                    var12 -= arg0 * var10;
                    var11 -= arg0 * var8;
                    arg0 = 0;
                }
                int var13 = arg2 << 16;
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg0 != arg4 && var10 < var8 || arg0 == arg4 && var9 < var10) {
                    int var14 = arg1 - arg4;
                    int var15 = arg4 - arg0;
                    int var16 = this.field10007 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class657.method3698(var13 >> 16, 0, var16, 126, var12 >> 16, this.field10012);
                                var13 += var9;
                                var16 += this.field10007;
                                var12 += var10;
                            }
                        }
                        class657.method3698(var11 >> 16, 0, var16, 127, var12 >> 16, this.field10012);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field10007;
                    }
                } else {
                    int var17 = arg1 - arg4;
                    int var18 = arg4 - arg0;
                    int var19 = this.field10007 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class657.method3698(var12 >> 16, 0, var19, 127, var13 >> 16, this.field10012);
                                var19 += this.field10007;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        class657.method3698(var12 >> 16, 0, var19, 125, var11 >> 16, this.field10012);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field10007;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg6 << 16;
                if (arg0 < 0) {
                    var20 -= arg0 * var8;
                    var21 -= arg0 * var10;
                    arg0 = 0;
                }
                int var22 = arg3 << 16;
                if (arg1 < 0) {
                    var22 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg0 != arg1 && var8 > var10 || arg0 == arg1 && var8 < var9) {
                    int var23 = arg4 - arg1;
                    int var24 = arg1 - arg0;
                    int var25 = this.field10007 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class657.method3698(var20 >> 16, 0, var25, 125, var22 >> 16, this.field10012);
                                var22 += var9;
                                var25 += this.field10007;
                                var20 += var8;
                            }
                        }
                        class657.method3698(var20 >> 16, 0, var25, 127, var21 >> 16, this.field10012);
                        var25 += this.field10007;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg4 - arg1;
                    int var27 = arg1 - arg0;
                    int var28 = this.field10007 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class657.method3698(var22 >> 16, 0, var28, 125, var20 >> 16, this.field10012);
                                var22 += var9;
                                var20 += var8;
                                var28 += this.field10007;
                            }
                        }
                        class657.method3698(var21 >> 16, 0, var28, 127, var20 >> 16, this.field10012);
                        var21 += var10;
                        var28 += this.field10007;
                        var20 += var8;
                    }
                }
            }
        } else if (arg4 > arg1) {
            if (arg0 >= arg4) {
                int var29;
                int var30 = var29 = arg3 << 16;
                if (arg1 < 0) {
                    var30 -= arg1 * var9;
                    var29 -= arg1 * var10;
                    arg1 = 0;
                }
                int var31 = arg2 << 16;
                if (arg4 < 0) {
                    var31 -= arg4 * var8;
                    arg4 = 0;
                }
                if (var10 > var9) {
                    int var32 = arg0 - arg4;
                    int var33 = arg4 - arg1;
                    int var34 = this.field10007 * arg1;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class657.method3698(var29 >> 16, 0, var34, 127, var31 >> 16, this.field10012);
                                var31 += var8;
                                var29 += var10;
                                var34 += this.field10007;
                            }
                        }
                        class657.method3698(var29 >> 16, 0, var34, 127, var30 >> 16, this.field10012);
                        var29 += var10;
                        var34 += this.field10007;
                        var30 += var9;
                    }
                } else {
                    int var35 = arg0 - arg4;
                    int var36 = arg4 - arg1;
                    int var37 = this.field10007 * arg1;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class657.method3698(var31 >> 16, 0, var37, 127, var29 >> 16, this.field10012);
                                var37 += this.field10007;
                                var29 += var10;
                                var31 += var8;
                            }
                        }
                        class657.method3698(var30 >> 16, 0, var37, 125, var29 >> 16, this.field10012);
                        var37 += this.field10007;
                        var30 += var9;
                        var29 += var10;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg3 << 16;
                int var40 = arg6 << 16;
                if (arg1 < 0) {
                    var38 -= arg1 * var10;
                    var39 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg0 < 0) {
                    var40 -= arg0 * var8;
                    arg0 = 0;
                }
                if (var10 <= var9) {
                    int var41 = arg4 - arg0;
                    int var42 = arg0 - arg1;
                    int var43 = this.field10007 * arg1;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class657.method3698(var39 >> 16, 0, var43, 127, var40 >> 16, this.field10012);
                                var40 += var8;
                                var43 += this.field10007;
                                var39 += var9;
                            }
                        }
                        class657.method3698(var39 >> 16, 0, var43, 125, var38 >> 16, this.field10012);
                        var38 += var10;
                        var43 += this.field10007;
                        var39 += var9;
                    }
                } else {
                    int var44 = arg4 - arg0;
                    int var45 = arg0 - arg1;
                    int var46 = this.field10007 * arg1;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class657.method3698(var40 >> 16, 0, var46, 126, var39 >> 16, this.field10012);
                                var39 += var9;
                                var46 += this.field10007;
                                var40 += var8;
                            }
                        }
                        class657.method3698(var38 >> 16, 0, var46, 125, var39 >> 16, this.field10012);
                        var46 += this.field10007;
                        var39 += var9;
                        var38 += var10;
                    }
                }
            }
        } else if (arg0 <= arg1) {
            int var47;
            int var48 = var47 = arg2 << 16;
            if (arg4 < 0) {
                var47 -= arg4 * var9;
                var48 -= arg4 * var8;
                arg4 = 0;
            }
            int var49 = arg6 << 16;
            if (arg0 < 0) {
                var49 -= arg0 * var10;
                arg0 = 0;
            }
            if (var8 < var9) {
                int var50 = arg1 - arg0;
                int var51 = arg0 - arg4;
                int var52 = this.field10007 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class657.method3698(var47 >> 16, 0, var52, 125, var49 >> 16, this.field10012);
                            var49 += var10;
                            var47 += var9;
                            var52 += this.field10007;
                        }
                    }
                    class657.method3698(var47 >> 16, 0, var52, 126, var48 >> 16, this.field10012);
                    var48 += var8;
                    var52 += this.field10007;
                    var47 += var9;
                }
            } else {
                int var53 = arg1 - arg0;
                int var54 = arg0 - arg4;
                int var55 = this.field10007 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class657.method3698(var49 >> 16, 0, var55, 127, var47 >> 16, this.field10012);
                            var55 += this.field10007;
                            var47 += var9;
                            var49 += var10;
                        }
                    }
                    class657.method3698(var48 >> 16, 0, var55, 125, var47 >> 16, this.field10012);
                    var48 += var8;
                    var55 += this.field10007;
                    var47 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg2 << 16;
            if (arg4 < 0) {
                var57 -= arg4 * var8;
                var56 -= arg4 * var9;
                arg4 = 0;
            }
            int var58 = arg3 << 16;
            if (arg1 < 0) {
                var58 -= arg1 * var10;
                arg1 = 0;
            }
            if (arg1 != arg4 && var8 < var9 || arg1 == arg4 && var10 < var8) {
                int var59 = arg0 - arg1;
                int var60 = arg1 - arg4;
                int var61 = this.field10007 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class657.method3698(var58 >> 16, 0, var61, 125, var57 >> 16, this.field10012);
                            var61 += this.field10007;
                            var57 += var8;
                            var58 += var10;
                        }
                    }
                    class657.method3698(var56 >> 16, 0, var61, 127, var57 >> 16, this.field10012);
                    var61 += this.field10007;
                    var56 += var9;
                    var57 += var8;
                }
            } else {
                int var62 = arg0 - arg1;
                int var63 = arg1 - arg4;
                int var64 = this.field10007 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class657.method3698(var57 >> 16, 0, var64, 127, var58 >> 16, this.field10012);
                            var57 += var8;
                            var58 += var10;
                            var64 += this.field10007;
                        }
                    }
                    class657.method3698(var57 >> 16, 0, var64, 125, var56 >> 16, this.field10012);
                    var56 += var9;
                    var57 += var8;
                    var64 += this.field10007;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V", line = 444)
    public final void method3937(int arg0) {
        if (arg0 >= -82) {
            this.method3941(117, -74, 40);
        }
        field10002++;
        int var2 = -1;
        int var3 = this.field10012.length - 8;
        while (var3 > var2) {
            var2++;
            this.field10012[var2] = 0;
            var2++;
            this.field10012[var2] = 0;
            var2++;
            this.field10012[var2] = 0;
            var2++;
            this.field10012[var2] = 0;
            var2++;
            this.field10012[var2] = 0;
            var2++;
            this.field10012[var2] = 0;
            var2++;
            this.field10012[var2] = 0;
            var2++;
            this.field10012[var2] = 0;
        }
        while (var2 < this.field10012.length - 1) {
            var2++;
            this.field10012[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V", line = 477)
    public static final void method3938(int arg0, int arg1, int arg2) {
        field10011++;
        if (arg2 == 0) {
            class118 var3 = class86.method755(true, 13, arg0);
            var3.method933((byte) 71);
            var3.field1811 = arg1;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIII)V", line = 498)
    public final void method3939(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field10003 = arg0;
        this.field10007 = arg4 - arg3;
        field10009++;
        if (arg2 != 0) {
            field10008 = -1;
        }
        this.field10017 = arg1 - arg0;
        this.field10013 = arg3;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 521)
    public static final String method3940(byte arg0, String arg1) {
        if (arg0 > -118) {
            field10016 = -100;
        }
        field10006++;
        String var2 = null;
        int var3 = arg1.indexOf("--> ");
        if (var3 >= 0) {
            var2 = arg1.substring(0, var3 + 4);
            arg1 = arg1.substring(var3 + 4);
        }
        if (arg1.startsWith("directlogin ")) {
            int var4 = arg1.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg1.length();
                arg1 = arg1.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; var6++) {
                    arg1 = arg1 + "*";
                }
            }
        }
        return var2 == null ? arg1 : var2 + arg1;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lrs;II)V", line = 574)
    public class711(class166 arg0, int arg1, int arg2) {
        this.field10012 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(III)Z", line = 584)
    public final boolean method3941(int arg0, int arg1, int arg2) {
        if (arg0 == -21017) {
            field10010++;
            return this.field10012.length >= arg1 * arg2;
        } else {
            return true;
        }
    }
}
