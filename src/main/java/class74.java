import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class74 extends class197 {

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "[B")
    public byte[] field1054;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "Z")
    public static boolean field1045 = false;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "I")
    public static int field1046 = 0;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "[[S")
    public static short[][] field1050;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIII)V")
    public final void method578(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1042 = arg4 - arg0;
        this.field1053 = arg0;
        this.field1052 = arg1 - arg2;
        int var6 = -36 % ((arg3 - 13) / 55);
        this.field1044 = arg2;
        field1049++;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V")
    public static void method579(byte arg0) {
        if (arg0 != 25) {
            method581(-66, false);
        }
        field1050 = null;
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(B)V")
    public final void method580(byte arg0) {
        field1043++;
        if (arg0 > -2) {
            this.method578(52, -122, 31, 23, -8);
        }
        int var2 = -1;
        int var3 = this.field1054.length - 8;
        while (var3 > var2) {
            var2++;
            this.field1054[var2] = 0;
            var2++;
            this.field1054[var2] = 0;
            var2++;
            this.field1054[var2] = 0;
            var2++;
            this.field1054[var2] = 0;
            var2++;
            this.field1054[var2] = 0;
            var2++;
            this.field1054[var2] = 0;
            var2++;
            this.field1054[var2] = 0;
            var2++;
            this.field1054[var2] = 0;
        }
        while (this.field1054.length - 1 > var2) {
            var2++;
            this.field1054[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZ)V")
    public static final void method581(int arg0, boolean arg1) {
        class473 var2 = class134.field2044;
        synchronized (class134.field2044) {
            class134.field2044.method2779(14896, arg0);
        }
        if (!arg1) {
            return;
        }
        field1051++;
        class473 var3 = client.field7546;
        synchronized (client.field7546) {
            client.field7546.method2779(14896, arg0);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBI)Z")
    public final boolean method582(int arg0, byte arg1, int arg2) {
        field1047++;
        if (arg1 != 21) {
            method579((byte) -36);
        }
        return (arg0 * arg2) <= this.field1054.length;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBIIIII)V")
    public final void method583(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1048++;
        int var8 = 0;
        if (arg0 != arg5) {
            var8 = (arg4 - arg3 << 16) / (arg5 - arg0);
        }
        if (arg1 != -127) {
            field1046 = 121;
        }
        int var9 = 0;
        if (arg2 != arg5) {
            var9 = (arg6 - arg4 << 16) / (arg2 - arg5);
        }
        int var10 = 0;
        if (arg0 != arg2) {
            var10 = (arg3 - arg6 << 16) / (arg0 - arg2);
        }
        if (arg0 <= arg5 && arg0 <= arg2) {
            if (arg2 <= arg5) {
                int var11;
                int var12 = var11 = arg3 << 16;
                if (arg0 < 0) {
                    var11 -= arg0 * var8;
                    var12 -= arg0 * var10;
                    arg0 = 0;
                }
                int var13 = arg6 << 16;
                if (arg2 < 0) {
                    var13 -= arg2 * var9;
                    arg2 = 0;
                }
                if ((arg0 == arg2 || var10 >= var8) && (arg0 != arg2 || var8 >= var9)) {
                    int var17 = arg5 - arg2;
                    int var18 = arg2 - arg0;
                    int var19 = this.field1052 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class219.method1372(var11 >> 16, 0, this.field1054, var19, (byte) -12, var13 >> 16);
                                var19 += this.field1052;
                                var11 += var8;
                                var13 += var9;
                            }
                        }
                        class219.method1372(var11 >> 16, 0, this.field1054, var19, (byte) -13, var12 >> 16);
                        var11 += var8;
                        var19 += this.field1052;
                        var12 += var10;
                    }
                } else {
                    int var14 = arg5 - arg2;
                    int var15 = arg2 - arg0;
                    int var16 = this.field1052 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class219.method1372(var13 >> 16, 0, this.field1054, var16, (byte) 111, var11 >> 16);
                                var16 += this.field1052;
                                var11 += var8;
                                var13 += var9;
                            }
                        }
                        class219.method1372(var12 >> 16, 0, this.field1054, var16, (byte) 125, var11 >> 16);
                        var11 += var8;
                        var16 += this.field1052;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg3 << 16;
                int var22 = arg4 << 16;
                if (arg0 < 0) {
                    var20 -= arg0 * var8;
                    var21 -= arg0 * var10;
                    arg0 = 0;
                }
                if (arg5 < 0) {
                    var22 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg0 != arg5 && var10 < var8 || arg0 == arg5 && var9 < var10) {
                    int var23 = arg2 - arg5;
                    int var24 = arg5 - arg0;
                    int var25 = this.field1052 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class219.method1372(var21 >> 16, 0, this.field1054, var25, (byte) -10, var22 >> 16);
                                var21 += var10;
                                var25 += this.field1052;
                                var22 += var9;
                            }
                        }
                        class219.method1372(var21 >> 16, 0, this.field1054, var25, (byte) 122, var20 >> 16);
                        var20 += var8;
                        var21 += var10;
                        var25 += this.field1052;
                    }
                } else {
                    int var26 = arg2 - arg5;
                    int var27 = arg5 - arg0;
                    int var28 = this.field1052 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class219.method1372(var22 >> 16, 0, this.field1054, var28, (byte) 113, var21 >> 16);
                                var22 += var9;
                                var21 += var10;
                                var28 += this.field1052;
                            }
                        }
                        class219.method1372(var20 >> 16, 0, this.field1054, var28, (byte) -17, var21 >> 16);
                        var28 += this.field1052;
                        var21 += var10;
                        var20 += var8;
                    }
                }
            }
        } else if (arg2 >= arg5) {
            if (arg0 <= arg2) {
                int var29;
                int var30 = var29 = arg4 << 16;
                int var31 = arg3 << 16;
                if (arg5 < 0) {
                    var30 -= arg5 * var8;
                    var29 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg0 < 0) {
                    var31 -= arg0 * var10;
                    arg0 = 0;
                }
                if (var8 < var9) {
                    int var32 = arg2 - arg0;
                    int var33 = arg0 - arg5;
                    int var34 = this.field1052 * arg5;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class219.method1372(var31 >> 16, 0, this.field1054, var34, (byte) 104, var29 >> 16);
                                var29 += var9;
                                var34 += this.field1052;
                                var31 += var10;
                            }
                        }
                        class219.method1372(var30 >> 16, 0, this.field1054, var34, (byte) 99, var29 >> 16);
                        var29 += var9;
                        var30 += var8;
                        var34 += this.field1052;
                    }
                } else {
                    int var35 = arg2 - arg0;
                    int var36 = arg0 - arg5;
                    int var37 = this.field1052 * arg5;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class219.method1372(var29 >> 16, 0, this.field1054, var37, (byte) 111, var31 >> 16);
                                var29 += var9;
                                var37 += this.field1052;
                                var31 += var10;
                            }
                        }
                        class219.method1372(var29 >> 16, 0, this.field1054, var37, (byte) 124, var30 >> 16);
                        var29 += var9;
                        var37 += this.field1052;
                        var30 += var8;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg4 << 16;
                int var40 = arg6 << 16;
                if (arg5 < 0) {
                    var39 -= arg5 * var8;
                    var38 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg2 < 0) {
                    var40 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg2 != arg5 && var8 < var9 || arg2 == arg5 && var8 > var10) {
                    int var41 = arg0 - arg2;
                    int var42 = arg2 - arg5;
                    int var43 = this.field1052 * arg5;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class219.method1372(var39 >> 16, 0, this.field1054, var43, (byte) 113, var40 >> 16);
                                var43 += this.field1052;
                                var39 += var8;
                                var40 += var10;
                            }
                        }
                        class219.method1372(var39 >> 16, 0, this.field1054, var43, (byte) 112, var38 >> 16);
                        var43 += this.field1052;
                        var39 += var8;
                        var38 += var9;
                    }
                } else {
                    int var44 = arg0 - arg2;
                    int var45 = arg2 - arg5;
                    int var46 = this.field1052 * arg5;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class219.method1372(var40 >> 16, 0, this.field1054, var46, (byte) 101, var39 >> 16);
                                var46 += this.field1052;
                                var40 += var10;
                                var39 += var8;
                            }
                        }
                        class219.method1372(var38 >> 16, 0, this.field1054, var46, (byte) 110, var39 >> 16);
                        var39 += var8;
                        var38 += var9;
                        var46 += this.field1052;
                    }
                }
            }
        } else if (arg0 >= arg5) {
            int var47;
            int var48 = var47 = arg6 << 16;
            int var49 = arg4 << 16;
            if (arg2 < 0) {
                var47 -= arg2 * var10;
                var48 -= arg2 * var9;
                arg2 = 0;
            }
            if (arg5 < 0) {
                var49 -= arg5 * var8;
                arg5 = 0;
            }
            if (var10 > var9) {
                int var50 = arg0 - arg5;
                int var51 = arg5 - arg2;
                int var52 = this.field1052 * arg2;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class219.method1372(var49 >> 16, 0, this.field1054, var52, (byte) -86, var47 >> 16);
                            var49 += var8;
                            var47 += var10;
                            var52 += this.field1052;
                        }
                    }
                    class219.method1372(var48 >> 16, 0, this.field1054, var52, (byte) -106, var47 >> 16);
                    var48 += var9;
                    var47 += var10;
                    var52 += this.field1052;
                }
            } else {
                int var53 = arg0 - arg5;
                int var54 = arg5 - arg2;
                int var55 = this.field1052 * arg2;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class219.method1372(var47 >> 16, 0, this.field1054, var55, (byte) -115, var49 >> 16);
                            var55 += this.field1052;
                            var47 += var10;
                            var49 += var8;
                        }
                    }
                    class219.method1372(var47 >> 16, 0, this.field1054, var55, (byte) -49, var48 >> 16);
                    var55 += this.field1052;
                    var48 += var9;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg6 << 16;
            int var58 = arg3 << 16;
            if (arg2 < 0) {
                var56 -= arg2 * var10;
                var57 -= arg2 * var9;
                arg2 = 0;
            }
            if (arg0 < 0) {
                var58 -= arg0 * var8;
                arg0 = 0;
            }
            if (var9 < var10) {
                int var59 = arg5 - arg0;
                int var60 = arg0 - arg2;
                int var61 = this.field1052 * arg2;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class219.method1372(var57 >> 16, 0, this.field1054, var61, (byte) 101, var58 >> 16);
                            var57 += var9;
                            var58 += var8;
                            var61 += this.field1052;
                        }
                    }
                    class219.method1372(var57 >> 16, 0, this.field1054, var61, (byte) 110, var56 >> 16);
                    var61 += this.field1052;
                    var57 += var9;
                    var56 += var10;
                }
            } else {
                int var62 = arg5 - arg0;
                int var63 = arg0 - arg2;
                int var64 = this.field1052 * arg2;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class219.method1372(var58 >> 16, 0, this.field1054, var64, (byte) 113, var57 >> 16);
                            var64 += this.field1052;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class219.method1372(var56 >> 16, 0, this.field1054, var64, (byte) -105, var57 >> 16);
                    var56 += var10;
                    var57 += var9;
                    var64 += this.field1052;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lpg;II)V")
    public class74(class333 arg0, int arg1, int arg2) {
        this.field1054 = new byte[arg1 * arg2];
    }
}
