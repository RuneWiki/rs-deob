import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class549 extends class180 {

    @OriginalMember(owner = "client!lba", name = "I", descriptor = "[B")
    public byte[] field7666;

    @OriginalMember(owner = "client!lba", name = "E", descriptor = "Z")
    public static boolean field7662 = false;

    @OriginalMember(owner = "client!lba", name = "H", descriptor = "I")
    public static int field7665 = 100;

    @OriginalMember(owner = "client!lba", name = "L", descriptor = "I")
    public static int field7669 = 0;

    @OriginalMember(owner = "client!lba", name = "z", descriptor = "I")
    public int field7657;

    @OriginalMember(owner = "client!lba", name = "A", descriptor = "I")
    public int field7658;

    @OriginalMember(owner = "client!lba", name = "B", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!lba", name = "C", descriptor = "I")
    public int field7660;

    @OriginalMember(owner = "client!lba", name = "D", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!lba", name = "G", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!lba", name = "J", descriptor = "I")
    public static int field7667;

    @OriginalMember(owner = "client!lba", name = "K", descriptor = "I")
    public int field7668;

    @OriginalMember(owner = "client!lba", name = "M", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!lba", name = "O", descriptor = "I")
    public static int field7672;

    @OriginalMember(owner = "client!lba", name = "N", descriptor = "Lfp;")
    public static class323 field7671;

    @OriginalMember(owner = "client!lba", name = "F", descriptor = "[I")
    public static int[] field7663;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIB)Z")
    public final boolean method3176(int arg0, int arg1, byte arg2) {
        int var4 = 25 / ((arg2 - 11) / 34);
        field7659++;
        return arg0 * arg1 <= this.field7666.length;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIII)V")
    public final void method3177(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7660 = arg1 - arg4;
        this.field7657 = arg3 - arg0;
        field7664++;
        if (arg2 == 0) {
            this.field7668 = arg0;
            this.field7658 = arg4;
        }
    }

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "(I)V")
    public static void method3178(int arg0) {
        if (arg0 != 230) {
            field7669 = -95;
        }
        field7663 = null;
        field7671 = null;
    }

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "(I)V")
    public final void method3179(int arg0) {
        field7672++;
        if (arg0 < 81) {
            return;
        }
        int var2 = -1;
        int var3 = this.field7666.length - 8;
        while (var3 > var2) {
            var2++;
            this.field7666[var2] = 0;
            var2++;
            this.field7666[var2] = 0;
            var2++;
            this.field7666[var2] = 0;
            var2++;
            this.field7666[var2] = 0;
            var2++;
            this.field7666[var2] = 0;
            var2++;
            this.field7666[var2] = 0;
            var2++;
            this.field7666[var2] = 0;
            var2++;
            this.field7666[var2] = 0;
        }
        while (var2 < this.field7666.length - 1) {
            var2++;
            this.field7666[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIIII)V")
    public final void method3180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7667++;
        if (arg3 > -93) {
            this.method3179(88);
        }
        int var8 = 0;
        if (arg4 != arg5) {
            var8 = (arg1 - arg0 << 16) / (arg5 - arg4);
        }
        int var9 = 0;
        if (arg5 != arg6) {
            var9 = (arg2 - arg1 << 16) / (arg6 - arg5);
        }
        int var10 = 0;
        if (arg4 != arg6) {
            var10 = (arg0 - arg2 << 16) / (arg4 - arg6);
        }
        if (arg5 >= arg4 && arg6 >= arg4) {
            if (arg5 >= arg6) {
                int var11;
                int var12 = var11 = arg0 << 16;
                int var13 = arg2 << 16;
                if (arg4 < 0) {
                    var11 -= arg4 * var8;
                    var12 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg6 < 0) {
                    var13 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg4 != arg6 && var8 > var10 || arg4 == arg6 && var9 > var8) {
                    int var14 = arg5 - arg6;
                    int var15 = arg6 - arg4;
                    int var16 = this.field7657 * arg4;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class34.method195(var13 >> 16, var11 >> 16, 0, var16, this.field7666, -1212415540);
                                var16 += this.field7657;
                                var11 += var8;
                                var13 += var9;
                            }
                        }
                        class34.method195(var12 >> 16, var11 >> 16, 0, var16, this.field7666, -1212415540);
                        var16 += this.field7657;
                        var11 += var8;
                        var12 += var10;
                    }
                } else {
                    int var17 = arg5 - arg6;
                    int var18 = arg6 - arg4;
                    int var19 = this.field7657 * arg4;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class34.method195(var11 >> 16, var13 >> 16, 0, var19, this.field7666, -1212415540);
                                var11 += var8;
                                var13 += var9;
                                var19 += this.field7657;
                            }
                        }
                        class34.method195(var11 >> 16, var12 >> 16, 0, var19, this.field7666, -1212415540);
                        var11 += var8;
                        var19 += this.field7657;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg0 << 16;
                if (arg4 < 0) {
                    var20 -= arg4 * var8;
                    var21 -= arg4 * var10;
                    arg4 = 0;
                }
                int var22 = arg1 << 16;
                if (arg5 < 0) {
                    var22 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg4 != arg5 && var10 < var8 || arg4 == arg5 && var10 > var9) {
                    int var23 = arg6 - arg5;
                    int var24 = arg5 - arg4;
                    int var25 = this.field7657 * arg4;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class34.method195(var21 >> 16, var22 >> 16, 0, var25, this.field7666, -1212415540);
                                var21 += var10;
                                var25 += this.field7657;
                                var22 += var9;
                            }
                        }
                        class34.method195(var21 >> 16, var20 >> 16, 0, var25, this.field7666, -1212415540);
                        var25 += this.field7657;
                        var21 += var10;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg6 - arg5;
                    int var27 = arg5 - arg4;
                    int var28 = this.field7657 * arg4;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class34.method195(var22 >> 16, var21 >> 16, 0, var28, this.field7666, -1212415540);
                                var22 += var9;
                                var21 += var10;
                                var28 += this.field7657;
                            }
                        }
                        class34.method195(var20 >> 16, var21 >> 16, 0, var28, this.field7666, -1212415540);
                        var20 += var8;
                        var21 += var10;
                        var28 += this.field7657;
                    }
                }
            }
        } else if (arg6 < arg5) {
            if (arg4 < arg5) {
                int var29;
                int var30 = var29 = arg2 << 16;
                if (arg6 < 0) {
                    var30 -= arg6 * var9;
                    var29 -= arg6 * var10;
                    arg6 = 0;
                }
                int var31 = arg0 << 16;
                if (arg4 < 0) {
                    var31 -= arg4 * var8;
                    arg4 = 0;
                }
                if (var10 <= var9) {
                    int var32 = arg5 - arg4;
                    int var33 = arg4 - arg6;
                    int var34 = this.field7657 * arg6;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class34.method195(var31 >> 16, var30 >> 16, 0, var34, this.field7666, -1212415540);
                                var31 += var8;
                                var34 += this.field7657;
                                var30 += var9;
                            }
                        }
                        class34.method195(var29 >> 16, var30 >> 16, 0, var34, this.field7666, -1212415540);
                        var34 += this.field7657;
                        var30 += var9;
                        var29 += var10;
                    }
                } else {
                    int var35 = arg5 - arg4;
                    int var36 = arg4 - arg6;
                    int var37 = this.field7657 * arg6;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class34.method195(var30 >> 16, var31 >> 16, 0, var37, this.field7666, -1212415540);
                                var31 += var8;
                                var37 += this.field7657;
                                var30 += var9;
                            }
                        }
                        class34.method195(var30 >> 16, var29 >> 16, 0, var37, this.field7666, -1212415540);
                        var30 += var9;
                        var29 += var10;
                        var37 += this.field7657;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                int var40 = arg1 << 16;
                if (arg6 < 0) {
                    var38 -= arg6 * var10;
                    var39 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg5 < 0) {
                    var40 -= arg5 * var8;
                    arg5 = 0;
                }
                if (var10 <= var9) {
                    int var41 = arg4 - arg5;
                    int var42 = arg5 - arg6;
                    int var43 = this.field7657 * arg6;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class34.method195(var38 >> 16, var40 >> 16, 0, var43, this.field7666, -1212415540);
                                var38 += var10;
                                var40 += var8;
                                var43 += this.field7657;
                            }
                        }
                        class34.method195(var38 >> 16, var39 >> 16, 0, var43, this.field7666, -1212415540);
                        var38 += var10;
                        var39 += var9;
                        var43 += this.field7657;
                    }
                } else {
                    int var44 = arg4 - arg5;
                    int var45 = arg5 - arg6;
                    int var46 = this.field7657 * arg6;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class34.method195(var40 >> 16, var38 >> 16, 0, var46, this.field7666, -1212415540);
                                var40 += var8;
                                var46 += this.field7657;
                                var38 += var10;
                            }
                        }
                        class34.method195(var39 >> 16, var38 >> 16, 0, var46, this.field7666, -1212415540);
                        var39 += var9;
                        var38 += var10;
                        var46 += this.field7657;
                    }
                }
            }
        } else if (arg6 >= arg4) {
            int var47;
            int var48 = var47 = arg1 << 16;
            int var49 = arg0 << 16;
            if (arg5 < 0) {
                var47 -= arg5 * var9;
                var48 -= arg5 * var8;
                arg5 = 0;
            }
            if (arg4 < 0) {
                var49 -= arg4 * var10;
                arg4 = 0;
            }
            if (var8 < var9) {
                int var50 = arg6 - arg4;
                int var51 = arg4 - arg5;
                int var52 = this.field7657 * arg5;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class34.method195(var49 >> 16, var47 >> 16, 0, var52, this.field7666, -1212415540);
                            var52 += this.field7657;
                            var47 += var9;
                            var49 += var10;
                        }
                    }
                    class34.method195(var48 >> 16, var47 >> 16, 0, var52, this.field7666, -1212415540);
                    var48 += var8;
                    var52 += this.field7657;
                    var47 += var9;
                }
            } else {
                int var53 = arg6 - arg4;
                int var54 = arg4 - arg5;
                int var55 = this.field7657 * arg5;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class34.method195(var47 >> 16, var49 >> 16, 0, var55, this.field7666, -1212415540);
                            var49 += var10;
                            var47 += var9;
                            var55 += this.field7657;
                        }
                    }
                    class34.method195(var47 >> 16, var48 >> 16, 0, var55, this.field7666, -1212415540);
                    var55 += this.field7657;
                    var47 += var9;
                    var48 += var8;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg1 << 16;
            int var58 = arg2 << 16;
            if (arg5 < 0) {
                var57 -= arg5 * var8;
                var56 -= arg5 * var9;
                arg5 = 0;
            }
            if (arg6 < 0) {
                var58 -= arg6 * var10;
                arg6 = 0;
            }
            if (arg5 != arg6 && var8 < var9 || arg5 == arg6 && var10 < var8) {
                int var59 = arg4 - arg6;
                int var60 = arg6 - arg5;
                int var61 = this.field7657 * arg5;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class34.method195(var57 >> 16, var58 >> 16, 0, var61, this.field7666, -1212415540);
                            var61 += this.field7657;
                            var58 += var10;
                            var57 += var8;
                        }
                    }
                    class34.method195(var57 >> 16, var56 >> 16, 0, var61, this.field7666, -1212415540);
                    var56 += var9;
                    var57 += var8;
                    var61 += this.field7657;
                }
            } else {
                int var62 = arg4 - arg6;
                int var63 = arg6 - arg5;
                int var64 = this.field7657 * arg5;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class34.method195(var58 >> 16, var57 >> 16, 0, var64, this.field7666, -1212415540);
                            var64 += this.field7657;
                            var58 += var10;
                            var57 += var8;
                        }
                    }
                    class34.method195(var56 >> 16, var57 >> 16, 0, var64, this.field7666, -1212415540);
                    var57 += var8;
                    var56 += var9;
                    var64 += this.field7657;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Leea;II)V")
    public class549(class131 arg0, int arg1, int arg2) {
        this.field7666 = new byte[arg1 * arg2];
    }
}
