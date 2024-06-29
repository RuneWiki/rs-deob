import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class591 extends class252 {

    @OriginalMember(owner = "client!wca", name = "r", descriptor = "[B")
    public byte[] field8481;

    @OriginalMember(owner = "client!wca", name = "x", descriptor = "[Lcba;")
    public static class478[] field8487 = new class478[75];

    @OriginalMember(owner = "client!wca", name = "v", descriptor = "I")
    public static int field8485 = 0;

    @OriginalMember(owner = "client!wca", name = "w", descriptor = "Z")
    public static boolean field8486 = true;

    @OriginalMember(owner = "client!wca", name = "p", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!wca", name = "q", descriptor = "I")
    public int field8480;

    @OriginalMember(owner = "client!wca", name = "s", descriptor = "I")
    public int field8482;

    @OriginalMember(owner = "client!wca", name = "t", descriptor = "I")
    public static int field8483;

    @OriginalMember(owner = "client!wca", name = "u", descriptor = "I")
    public int field8484;

    @OriginalMember(owner = "client!wca", name = "y", descriptor = "I")
    public static int field8488;

    @OriginalMember(owner = "client!wca", name = "A", descriptor = "I")
    public int field8490;

    @OriginalMember(owner = "client!wca", name = "B", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!wca", name = "z", descriptor = "[S")
    public static short[] field8489;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V", line = 14)
    public final void method3443(int arg0) {
        field8488++;
        if (arg0 < 57) {
            return;
        }
        int var2 = -1;
        int var3 = this.field8481.length - 8;
        while (var3 > var2) {
            var2++;
            this.field8481[var2] = 0;
            var2++;
            this.field8481[var2] = 0;
            var2++;
            this.field8481[var2] = 0;
            var2++;
            this.field8481[var2] = 0;
            var2++;
            this.field8481[var2] = 0;
            var2++;
            this.field8481[var2] = 0;
            var2++;
            this.field8481[var2] = 0;
            var2++;
            this.field8481[var2] = 0;
        }
        while (this.field8481.length - 1 > var2) {
            var2++;
            this.field8481[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)V", line = 44)
    public static void method3444(byte arg0) {
        field8487 = null;
        field8489 = null;
        int var1 = -113 % ((80 - arg0) / 41);
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIBIIII)V", line = 62)
    public final void method3445(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 88) {
            field8485 = -103;
        }
        field8491++;
        int var8 = 0;
        if (arg1 != arg3) {
            var8 = (arg5 - arg0 << 16) / (arg1 - arg3);
        }
        int var9 = 0;
        if (arg1 != arg4) {
            var9 = (arg6 - arg5 << 16) / (arg4 - arg1);
        }
        int var10 = 0;
        if (arg3 != arg4) {
            var10 = (arg0 - arg6 << 16) / (arg3 - arg4);
        }
        if (arg3 <= arg1 && arg3 <= arg4) {
            if (arg1 >= arg4) {
                int var11;
                int var12 = var11 = arg0 << 16;
                int var13 = arg6 << 16;
                if (arg3 < 0) {
                    var11 -= arg3 * var8;
                    var12 -= arg3 * var10;
                    arg3 = 0;
                }
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if ((arg3 == arg4 || var10 >= var8) && (arg3 != arg4 || var8 >= var9)) {
                    int var17 = arg1 - arg4;
                    int var18 = arg4 - arg3;
                    int var19 = this.field8482 * arg3;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class55.method407(var11 >> 16, var13 >> 16, 0, var19, this.field8481, -101);
                                var13 += var9;
                                var11 += var8;
                                var19 += this.field8482;
                            }
                        }
                        class55.method407(var11 >> 16, var12 >> 16, 0, var19, this.field8481, arg2 - 177);
                        var12 += var10;
                        var19 += this.field8482;
                        var11 += var8;
                    }
                } else {
                    int var14 = arg1 - arg4;
                    int var15 = arg4 - arg3;
                    int var16 = this.field8482 * arg3;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class55.method407(var13 >> 16, var11 >> 16, 0, var16, this.field8481, arg2 ^ 0xFFFFFFED);
                                var13 += var9;
                                var11 += var8;
                                var16 += this.field8482;
                            }
                        }
                        class55.method407(var12 >> 16, var11 >> 16, 0, var16, this.field8481, -87);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field8482;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg0 << 16;
                if (arg3 < 0) {
                    var20 -= arg3 * var8;
                    var21 -= arg3 * var10;
                    arg3 = 0;
                }
                int var22 = arg5 << 16;
                if (arg1 < 0) {
                    var22 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg1 != arg3 && var8 > var10 || arg1 == arg3 && var9 < var10) {
                    int var23 = arg4 - arg1;
                    int var24 = arg1 - arg3;
                    int var25 = this.field8482 * arg3;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class55.method407(var21 >> 16, var22 >> 16, 0, var25, this.field8481, arg2 - 212);
                                var22 += var9;
                                var21 += var10;
                                var25 += this.field8482;
                            }
                        }
                        class55.method407(var21 >> 16, var20 >> 16, 0, var25, this.field8481, arg2 ^ 0xFFFFFFF2);
                        var25 += this.field8482;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg4 - arg1;
                    int var27 = arg1 - arg3;
                    int var28 = this.field8482 * arg3;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class55.method407(var22 >> 16, var21 >> 16, 0, var28, this.field8481, arg2 ^ 0xFFFFFFDE);
                                var22 += var9;
                                var21 += var10;
                                var28 += this.field8482;
                            }
                        }
                        class55.method407(var20 >> 16, var21 >> 16, 0, var28, this.field8481, -45);
                        var28 += this.field8482;
                        var20 += var8;
                        var21 += var10;
                    }
                }
            }
        } else if (arg1 <= arg4) {
            if (arg3 > arg4) {
                int var29;
                int var30 = var29 = arg5 << 16;
                if (arg1 < 0) {
                    var29 -= arg1 * var9;
                    var30 -= arg1 * var8;
                    arg1 = 0;
                }
                int var31 = arg6 << 16;
                if (arg4 < 0) {
                    var31 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg1 != arg4 && var9 > var8 || arg1 == arg4 && var8 > var10) {
                    int var32 = arg3 - arg4;
                    int var33 = arg4 - arg1;
                    int var34 = this.field8482 * arg1;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class55.method407(var30 >> 16, var31 >> 16, 0, var34, this.field8481, -48);
                                var30 += var8;
                                var31 += var10;
                                var34 += this.field8482;
                            }
                        }
                        class55.method407(var30 >> 16, var29 >> 16, 0, var34, this.field8481, arg2 ^ 0xFFFFFFB7);
                        var34 += this.field8482;
                        var29 += var9;
                        var30 += var8;
                    }
                } else {
                    int var35 = arg3 - arg4;
                    int var36 = arg4 - arg1;
                    int var37 = this.field8482 * arg1;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class55.method407(var31 >> 16, var30 >> 16, 0, var37, this.field8481, arg2 ^ 0xFFFFFFEB);
                                var37 += this.field8482;
                                var31 += var10;
                                var30 += var8;
                            }
                        }
                        class55.method407(var29 >> 16, var30 >> 16, 0, var37, this.field8481, -80);
                        var30 += var8;
                        var29 += var9;
                        var37 += this.field8482;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg5 << 16;
                if (arg1 < 0) {
                    var38 -= arg1 * var9;
                    var39 -= arg1 * var8;
                    arg1 = 0;
                }
                int var40 = arg0 << 16;
                if (arg3 < 0) {
                    var40 -= arg3 * var10;
                    arg3 = 0;
                }
                if (var8 >= var9) {
                    int var41 = arg4 - arg3;
                    int var42 = arg3 - arg1;
                    int var43 = this.field8482 * arg1;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class55.method407(var38 >> 16, var40 >> 16, 0, var43, this.field8481, -109);
                                var38 += var9;
                                var43 += this.field8482;
                                var40 += var10;
                            }
                        }
                        class55.method407(var38 >> 16, var39 >> 16, 0, var43, this.field8481, arg2 ^ 0xFFFFFFE4);
                        var39 += var8;
                        var43 += this.field8482;
                        var38 += var9;
                    }
                } else {
                    int var44 = arg4 - arg3;
                    int var45 = arg3 - arg1;
                    int var46 = this.field8482 * arg1;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class55.method407(var40 >> 16, var38 >> 16, 0, var46, this.field8481, -97);
                                var40 += var10;
                                var46 += this.field8482;
                                var38 += var9;
                            }
                        }
                        class55.method407(var39 >> 16, var38 >> 16, 0, var46, this.field8481, -45);
                        var46 += this.field8482;
                        var38 += var9;
                        var39 += var8;
                    }
                }
            }
        } else if (arg1 > arg3) {
            int var47;
            int var48 = var47 = arg6 << 16;
            if (arg4 < 0) {
                var48 -= arg4 * var9;
                var47 -= arg4 * var10;
                arg4 = 0;
            }
            int var49 = arg0 << 16;
            if (arg3 < 0) {
                var49 -= arg3 * var8;
                arg3 = 0;
            }
            if (var10 > var9) {
                int var50 = arg1 - arg3;
                int var51 = arg3 - arg4;
                int var52 = this.field8482 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class55.method407(var48 >> 16, var49 >> 16, 0, var52, this.field8481, arg2 - 197);
                            var52 += this.field8482;
                            var49 += var8;
                            var48 += var9;
                        }
                    }
                    class55.method407(var48 >> 16, var47 >> 16, 0, var52, this.field8481, -124);
                    var48 += var9;
                    var47 += var10;
                    var52 += this.field8482;
                }
            } else {
                int var53 = arg1 - arg3;
                int var54 = arg3 - arg4;
                int var55 = this.field8482 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class55.method407(var49 >> 16, var48 >> 16, 0, var55, this.field8481, -115);
                            var49 += var8;
                            var48 += var9;
                            var55 += this.field8482;
                        }
                    }
                    class55.method407(var47 >> 16, var48 >> 16, 0, var55, this.field8481, -72);
                    var47 += var10;
                    var55 += this.field8482;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg6 << 16;
            if (arg4 < 0) {
                var56 -= arg4 * var10;
                var57 -= arg4 * var9;
                arg4 = 0;
            }
            int var58 = arg5 << 16;
            if (arg1 < 0) {
                var58 -= arg1 * var8;
                arg1 = 0;
            }
            if (var10 <= var9) {
                int var59 = arg3 - arg1;
                int var60 = arg1 - arg4;
                int var61 = this.field8482 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class55.method407(var56 >> 16, var58 >> 16, 0, var61, this.field8481, -30);
                            var58 += var8;
                            var56 += var10;
                            var61 += this.field8482;
                        }
                    }
                    class55.method407(var56 >> 16, var57 >> 16, 0, var61, this.field8481, arg2 ^ 0xFFFFFFD5);
                    var61 += this.field8482;
                    var56 += var10;
                    var57 += var9;
                }
            } else {
                int var62 = arg3 - arg1;
                int var63 = arg1 - arg4;
                int var64 = this.field8482 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class55.method407(var58 >> 16, var56 >> 16, 0, var64, this.field8481, -67);
                            var64 += this.field8482;
                            var56 += var10;
                            var58 += var8;
                        }
                    }
                    class55.method407(var57 >> 16, var56 >> 16, 0, var64, this.field8481, -24);
                    var56 += var10;
                    var64 += this.field8482;
                    var57 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(BII)Z", line = 501)
    public final boolean method3446(byte arg0, int arg1, int arg2) {
        field8483++;
        int var4 = -79 / ((-arg0 - 42) / 39);
        return arg1 * arg2 <= this.field8481.length;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIII)V", line = 522)
    public final void method3447(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8482 = arg3 - arg1;
        this.field8484 = arg4;
        field8479++;
        if (arg2 != -1029) {
            method3444((byte) 110);
        }
        this.field8490 = arg1;
        this.field8480 = arg0 - arg4;
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lad;II)V", line = 539)
    public class591(class362 arg0, int arg1, int arg2) {
        this.field8481 = new byte[arg1 * arg2];
    }
}
