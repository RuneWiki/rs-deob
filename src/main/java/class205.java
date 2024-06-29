import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class205 extends class377 {

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "[B")
    public byte[] field2949;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "[Z")
    public static boolean[] field2962;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "F")
    public static float field2960;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    public int field2954;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    public int field2955;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public int field2956;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public int field2958;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "[Lf;")
    public static class528[] field2957;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZIIII)V")
    public final void method1371(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field2951++;
        int var8 = 0;
        if (!arg2) {
            return;
        }
        if (arg4 != arg6) {
            var8 = (arg1 - arg0 << 16) / (arg6 - arg4);
        }
        int var9 = 0;
        if (arg3 != arg6) {
            var9 = (arg5 - arg1 << 16) / (arg3 - arg6);
        }
        int var10 = 0;
        if (arg3 != arg4) {
            var10 = (arg0 - arg5 << 16) / (arg4 - arg3);
        }
        if (arg4 <= arg6 && arg4 <= arg3) {
            if (arg3 <= arg6) {
                int var11;
                int var12 = var11 = arg0 << 16;
                if (arg4 < 0) {
                    var12 -= arg4 * var10;
                    var11 -= arg4 * var8;
                    arg4 = 0;
                }
                int var13 = arg5 << 16;
                if (arg3 < 0) {
                    var13 -= arg3 * var9;
                    arg3 = 0;
                }
                if ((arg3 == arg4 || var8 <= var10) && (arg3 != arg4 || var8 >= var9)) {
                    int var17 = arg6 - arg3;
                    int var18 = arg3 - arg4;
                    int var19 = this.field2956 * arg4;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class192.method1316(var11 >> 16, var19, this.field2949, var13 >> 16, 0, 7190);
                                var11 += var8;
                                var13 += var9;
                                var19 += this.field2956;
                            }
                        }
                        class192.method1316(var11 >> 16, var19, this.field2949, var12 >> 16, 0, 7190);
                        var12 += var10;
                        var19 += this.field2956;
                        var11 += var8;
                    }
                } else {
                    int var14 = arg6 - arg3;
                    int var15 = arg3 - arg4;
                    int var16 = this.field2956 * arg4;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class192.method1316(var13 >> 16, var16, this.field2949, var11 >> 16, 0, 7190);
                                var16 += this.field2956;
                                var11 += var8;
                                var13 += var9;
                            }
                        }
                        class192.method1316(var12 >> 16, var16, this.field2949, var11 >> 16, 0, 7190);
                        var11 += var8;
                        var16 += this.field2956;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg0 << 16;
                int var22 = arg1 << 16;
                if (arg4 < 0) {
                    var21 -= arg4 * var10;
                    var20 -= arg4 * var8;
                    arg4 = 0;
                }
                if (arg6 < 0) {
                    var22 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg4 != arg6 && var8 > var10 || arg4 == arg6 && var10 > var9) {
                    int var23 = arg3 - arg6;
                    int var24 = arg6 - arg4;
                    int var25 = this.field2956 * arg4;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class192.method1316(var21 >> 16, var25, this.field2949, var22 >> 16, 0, 7190);
                                var25 += this.field2956;
                                var21 += var10;
                                var22 += var9;
                            }
                        }
                        class192.method1316(var21 >> 16, var25, this.field2949, var20 >> 16, 0, 7190);
                        var21 += var10;
                        var25 += this.field2956;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg3 - arg6;
                    int var27 = arg6 - arg4;
                    int var28 = this.field2956 * arg4;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class192.method1316(var22 >> 16, var28, this.field2949, var21 >> 16, 0, 7190);
                                var28 += this.field2956;
                                var21 += var10;
                                var22 += var9;
                            }
                        }
                        class192.method1316(var20 >> 16, var28, this.field2949, var21 >> 16, 0, 7190);
                        var20 += var8;
                        var21 += var10;
                        var28 += this.field2956;
                    }
                }
            }
        } else if (arg6 <= arg3) {
            if (arg3 < arg4) {
                int var29;
                int var30 = var29 = arg1 << 16;
                int var31 = arg5 << 16;
                if (arg6 < 0) {
                    var29 -= arg6 * var9;
                    var30 -= arg6 * var8;
                    arg6 = 0;
                }
                if (arg3 < 0) {
                    var31 -= arg3 * var10;
                    arg3 = 0;
                }
                if (arg3 != arg6 && var8 < var9 || arg3 == arg6 && var10 < var8) {
                    int var32 = arg4 - arg3;
                    int var33 = arg3 - arg6;
                    int var34 = this.field2956 * arg6;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class192.method1316(var30 >> 16, var34, this.field2949, var31 >> 16, 0, 7190);
                                var30 += var8;
                                var31 += var10;
                                var34 += this.field2956;
                            }
                        }
                        class192.method1316(var30 >> 16, var34, this.field2949, var29 >> 16, 0, 7190);
                        var29 += var9;
                        var34 += this.field2956;
                        var30 += var8;
                    }
                } else {
                    int var35 = arg4 - arg3;
                    int var36 = arg3 - arg6;
                    int var37 = this.field2956 * arg6;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class192.method1316(var31 >> 16, var37, this.field2949, var30 >> 16, 0, 7190);
                                var30 += var8;
                                var31 += var10;
                                var37 += this.field2956;
                            }
                        }
                        class192.method1316(var29 >> 16, var37, this.field2949, var30 >> 16, 0, 7190);
                        var30 += var8;
                        var29 += var9;
                        var37 += this.field2956;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg1 << 16;
                int var40 = arg0 << 16;
                if (arg6 < 0) {
                    var39 -= arg6 * var8;
                    var38 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg4 < 0) {
                    var40 -= arg4 * var10;
                    arg4 = 0;
                }
                if (var8 >= var9) {
                    int var41 = arg3 - arg4;
                    int var42 = arg4 - arg6;
                    int var43 = this.field2956 * arg6;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class192.method1316(var38 >> 16, var43, this.field2949, var40 >> 16, 0, 7190);
                                var43 += this.field2956;
                                var40 += var10;
                                var38 += var9;
                            }
                        }
                        class192.method1316(var38 >> 16, var43, this.field2949, var39 >> 16, 0, 7190);
                        var39 += var8;
                        var38 += var9;
                        var43 += this.field2956;
                    }
                } else {
                    int var44 = arg3 - arg4;
                    int var45 = arg4 - arg6;
                    int var46 = this.field2956 * arg6;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class192.method1316(var40 >> 16, var46, this.field2949, var38 >> 16, 0, 7190);
                                var46 += this.field2956;
                                var40 += var10;
                                var38 += var9;
                            }
                        }
                        class192.method1316(var39 >> 16, var46, this.field2949, var38 >> 16, 0, 7190);
                        var46 += this.field2956;
                        var38 += var9;
                        var39 += var8;
                    }
                }
            }
        } else if (arg4 < arg6) {
            int var47;
            int var48 = var47 = arg5 << 16;
            int var49 = arg0 << 16;
            if (arg3 < 0) {
                var48 -= arg3 * var9;
                var47 -= arg3 * var10;
                arg3 = 0;
            }
            if (arg4 < 0) {
                var49 -= arg4 * var8;
                arg4 = 0;
            }
            if (var10 > var9) {
                int var50 = arg6 - arg4;
                int var51 = arg4 - arg3;
                int var52 = this.field2956 * arg3;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class192.method1316(var48 >> 16, var52, this.field2949, var49 >> 16, 0, 7190);
                            var49 += var8;
                            var52 += this.field2956;
                            var48 += var9;
                        }
                    }
                    class192.method1316(var48 >> 16, var52, this.field2949, var47 >> 16, 0, 7190);
                    var47 += var10;
                    var52 += this.field2956;
                    var48 += var9;
                }
            } else {
                int var53 = arg6 - arg4;
                int var54 = arg4 - arg3;
                int var55 = this.field2956 * arg3;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class192.method1316(var49 >> 16, var55, this.field2949, var48 >> 16, 0, 7190);
                            var48 += var9;
                            var49 += var8;
                            var55 += this.field2956;
                        }
                    }
                    class192.method1316(var47 >> 16, var55, this.field2949, var48 >> 16, 0, 7190);
                    var55 += this.field2956;
                    var47 += var10;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg5 << 16;
            int var58 = arg1 << 16;
            if (arg3 < 0) {
                var57 -= arg3 * var9;
                var56 -= arg3 * var10;
                arg3 = 0;
            }
            if (arg6 < 0) {
                var58 -= arg6 * var8;
                arg6 = 0;
            }
            if (var10 > var9) {
                int var59 = arg4 - arg6;
                int var60 = arg6 - arg3;
                int var61 = this.field2956 * arg3;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class192.method1316(var58 >> 16, var61, this.field2949, var56 >> 16, 0, 7190);
                            var56 += var10;
                            var58 += var8;
                            var61 += this.field2956;
                        }
                    }
                    class192.method1316(var57 >> 16, var61, this.field2949, var56 >> 16, 0, 7190);
                    var56 += var10;
                    var57 += var9;
                    var61 += this.field2956;
                }
            } else {
                int var62 = arg4 - arg6;
                int var63 = arg6 - arg3;
                int var64 = this.field2956 * arg3;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class192.method1316(var56 >> 16, var64, this.field2949, var58 >> 16, 0, 7190);
                            var64 += this.field2956;
                            var56 += var10;
                            var58 += var8;
                        }
                    }
                    class192.method1316(var56 >> 16, var64, this.field2949, var57 >> 16, 0, 7190);
                    var57 += var9;
                    var64 += this.field2956;
                    var56 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBIIIIIII)V")
    public static final void method1372(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 <= 101) {
            field2960 = -0.74951047F;
        }
        class222.method1468(arg6, (byte) -128, arg3, arg8, arg0, arg4, arg2, arg5, arg7, 0);
        field2948++;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)V")
    public static void method1373(byte arg0) {
        field2962 = null;
        if (arg0 >= -45) {
            method1375(-11, 28, 52, -54, 84, 25, -23, -69, 11, 43);
        }
        field2957 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIBII)V")
    public final void method1374(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var6 = 73 / ((15 - arg2) / 52);
        this.field2956 = arg1 - arg3;
        this.field2954 = arg3;
        field2961++;
        this.field2958 = arg0;
        this.field2955 = arg4 - arg0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2950++;
        if (!class91.method738(false, arg2)) {
            return;
        }
        if (class103.field1643[arg2] == null) {
            client.method1347(class416.field6157[arg2], -1, arg7, arg0, arg4, arg5, arg9, arg1, arg6, arg3);
        } else {
            client.method1347(class103.field1643[arg2], -1, arg7, arg0, arg4, arg5, arg9, arg1, arg6, arg3);
        }
        int var10 = -35 % ((arg8 - 48) / 46);
    }

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)V")
    public final void method1376(int arg0) {
        field2953++;
        int var2 = arg0;
        int var3 = this.field2949.length - 8;
        while (var2 < var3) {
            var2++;
            this.field2949[var2] = 0;
            var2++;
            this.field2949[var2] = 0;
            var2++;
            this.field2949[var2] = 0;
            var2++;
            this.field2949[var2] = 0;
            var2++;
            this.field2949[var2] = 0;
            var2++;
            this.field2949[var2] = 0;
            var2++;
            this.field2949[var2] = 0;
            var2++;
            this.field2949[var2] = 0;
        }
        while (var2 < this.field2949.length - 1) {
            var2++;
            this.field2949[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBI)Z")
    public final boolean method1377(int arg0, byte arg1, int arg2) {
        if (arg1 != -21) {
            method1375(-77, -6, -117, -99, 88, 99, -20, -14, -47, 29);
        }
        field2952++;
        return this.field2949.length >= arg0 * arg2;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lqg;II)V")
    public class205(class321 arg0, int arg1, int arg2) {
        this.field2949 = new byte[arg1 * arg2];
    }

    static {
        new class180("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
        field2962 = new boolean[5];
    }
}
