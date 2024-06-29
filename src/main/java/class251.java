import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class251 extends class195 {

    @OriginalMember(owner = "client!kea", name = "A", descriptor = "[B")
    public byte[] field3676;

    @OriginalMember(owner = "client!kea", name = "y", descriptor = "Ljb;")
    public static class519 field3674 = new class519(35, 12);

    @OriginalMember(owner = "client!kea", name = "B", descriptor = "Led;")
    public static class732 field3677 = new class732(8, 0, 4, 1);

    @OriginalMember(owner = "client!kea", name = "t", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!kea", name = "u", descriptor = "I")
    public int field3670;

    @OriginalMember(owner = "client!kea", name = "v", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!kea", name = "w", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!kea", name = "x", descriptor = "I")
    public int field3673;

    @OriginalMember(owner = "client!kea", name = "z", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!kea", name = "C", descriptor = "I")
    public int field3678;

    @OriginalMember(owner = "client!kea", name = "D", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!kea", name = "E", descriptor = "I")
    public int field3680;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIII)V", line = 7)
    public final void method1646(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3680 = arg1;
        this.field3678 = arg0 - arg3;
        if (arg2 != 0) {
            this.field3673 = 121;
        }
        this.field3670 = arg4 - arg1;
        this.field3673 = arg3;
        field3672++;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIBIIII)V", line = 28)
    public final void method1647(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field3679++;
        if (arg2 <= 13) {
            this.field3670 = -86;
        }
        int var8 = 0;
        if (arg0 != arg4) {
            var8 = (arg1 - arg5 << 16) / (arg4 - arg0);
        }
        int var9 = 0;
        if (arg3 != arg4) {
            var9 = (arg6 - arg1 << 16) / (arg3 - arg4);
        }
        int var10 = 0;
        if (arg0 != arg3) {
            var10 = (arg5 - arg6 << 16) / (arg0 - arg3);
        }
        if (arg4 >= arg0 && arg3 >= arg0) {
            if (arg4 < arg3) {
                int var11;
                int var12 = var11 = arg5 << 16;
                int var13 = arg1 << 16;
                if (arg0 < 0) {
                    var11 -= arg0 * var8;
                    var12 -= arg0 * var10;
                    arg0 = 0;
                }
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if ((arg0 == arg4 || var10 >= var8) && (arg0 != arg4 || var9 >= var10)) {
                    int var17 = arg3 - arg4;
                    int var18 = arg4 - arg0;
                    int var19 = this.field3670 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class101.method785(75, var12 >> 16, var19, this.field3676, 0, var13 >> 16);
                                var12 += var10;
                                var13 += var9;
                                var19 += this.field3670;
                            }
                        }
                        class101.method785(103, var12 >> 16, var19, this.field3676, 0, var11 >> 16);
                        var19 += this.field3670;
                        var11 += var8;
                        var12 += var10;
                    }
                } else {
                    int var14 = arg3 - arg4;
                    int var15 = arg4 - arg0;
                    int var16 = this.field3670 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class101.method785(73, var13 >> 16, var16, this.field3676, 0, var12 >> 16);
                                var13 += var9;
                                var12 += var10;
                                var16 += this.field3670;
                            }
                        }
                        class101.method785(67, var11 >> 16, var16, this.field3676, 0, var12 >> 16);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field3670;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg5 << 16;
                int var22 = arg6 << 16;
                if (arg0 < 0) {
                    var21 -= arg0 * var10;
                    var20 -= arg0 * var8;
                    arg0 = 0;
                }
                if (arg3 < 0) {
                    var22 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg0 != arg3 && var8 > var10 || arg0 == arg3 && var8 < var9) {
                    int var23 = arg4 - arg3;
                    int var24 = arg3 - arg0;
                    int var25 = this.field3670 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class101.method785(71, var20 >> 16, var25, this.field3676, 0, var22 >> 16);
                                var22 += var9;
                                var25 += this.field3670;
                                var20 += var8;
                            }
                        }
                        class101.method785(77, var20 >> 16, var25, this.field3676, 0, var21 >> 16);
                        var25 += this.field3670;
                        var21 += var10;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg4 - arg3;
                    int var27 = arg3 - arg0;
                    int var28 = this.field3670 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class101.method785(87, var22 >> 16, var28, this.field3676, 0, var20 >> 16);
                                var22 += var9;
                                var20 += var8;
                                var28 += this.field3670;
                            }
                        }
                        class101.method785(106, var21 >> 16, var28, this.field3676, 0, var20 >> 16);
                        var20 += var8;
                        var28 += this.field3670;
                        var21 += var10;
                    }
                }
            }
        } else if (arg4 <= arg3) {
            if (arg0 <= arg3) {
                int var29;
                int var30 = var29 = arg1 << 16;
                if (arg4 < 0) {
                    var29 -= arg4 * var9;
                    var30 -= arg4 * var8;
                    arg4 = 0;
                }
                int var31 = arg5 << 16;
                if (arg0 < 0) {
                    var31 -= arg0 * var10;
                    arg0 = 0;
                }
                if (var8 < var9) {
                    int var32 = arg3 - arg0;
                    int var33 = arg0 - arg4;
                    int var34 = this.field3670 * arg4;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class101.method785(100, var29 >> 16, var34, this.field3676, 0, var31 >> 16);
                                var29 += var9;
                                var31 += var10;
                                var34 += this.field3670;
                            }
                        }
                        class101.method785(74, var29 >> 16, var34, this.field3676, 0, var30 >> 16);
                        var34 += this.field3670;
                        var30 += var8;
                        var29 += var9;
                    }
                } else {
                    int var35 = arg3 - arg0;
                    int var36 = arg0 - arg4;
                    int var37 = this.field3670 * arg4;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class101.method785(101, var31 >> 16, var37, this.field3676, 0, var29 >> 16);
                                var31 += var10;
                                var37 += this.field3670;
                                var29 += var9;
                            }
                        }
                        class101.method785(120, var30 >> 16, var37, this.field3676, 0, var29 >> 16);
                        var30 += var8;
                        var37 += this.field3670;
                        var29 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg1 << 16;
                int var40 = arg6 << 16;
                if (arg4 < 0) {
                    var39 -= arg4 * var8;
                    var38 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg3 < 0) {
                    var40 -= arg3 * var10;
                    arg3 = 0;
                }
                if (arg3 != arg4 && var9 > var8 || arg3 == arg4 && var10 < var8) {
                    int var41 = arg0 - arg3;
                    int var42 = arg3 - arg4;
                    int var43 = this.field3670 * arg4;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class101.method785(75, var40 >> 16, var43, this.field3676, 0, var39 >> 16);
                                var40 += var10;
                                var43 += this.field3670;
                                var39 += var8;
                            }
                        }
                        class101.method785(85, var38 >> 16, var43, this.field3676, 0, var39 >> 16);
                        var38 += var9;
                        var39 += var8;
                        var43 += this.field3670;
                    }
                } else {
                    int var44 = arg0 - arg3;
                    int var45 = arg3 - arg4;
                    int var46 = this.field3670 * arg4;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class101.method785(116, var39 >> 16, var46, this.field3676, 0, var40 >> 16);
                                var40 += var10;
                                var39 += var8;
                                var46 += this.field3670;
                            }
                        }
                        class101.method785(87, var39 >> 16, var46, this.field3676, 0, var38 >> 16);
                        var39 += var8;
                        var46 += this.field3670;
                        var38 += var9;
                    }
                }
            }
        } else if (arg4 <= arg0) {
            int var47;
            int var48 = var47 = arg6 << 16;
            if (arg3 < 0) {
                var48 -= arg3 * var9;
                var47 -= arg3 * var10;
                arg3 = 0;
            }
            int var49 = arg1 << 16;
            if (arg4 < 0) {
                var49 -= arg4 * var8;
                arg4 = 0;
            }
            if (var10 <= var9) {
                int var50 = arg0 - arg4;
                int var51 = arg4 - arg3;
                int var52 = this.field3670 * arg3;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class101.method785(88, var49 >> 16, var52, this.field3676, 0, var47 >> 16);
                            var52 += this.field3670;
                            var49 += var8;
                            var47 += var10;
                        }
                    }
                    class101.method785(90, var48 >> 16, var52, this.field3676, 0, var47 >> 16);
                    var47 += var10;
                    var48 += var9;
                    var52 += this.field3670;
                }
            } else {
                int var53 = arg0 - arg4;
                int var54 = arg4 - arg3;
                int var55 = this.field3670 * arg3;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class101.method785(106, var47 >> 16, var55, this.field3676, 0, var49 >> 16);
                            var55 += this.field3670;
                            var47 += var10;
                            var49 += var8;
                        }
                    }
                    class101.method785(80, var47 >> 16, var55, this.field3676, 0, var48 >> 16);
                    var48 += var9;
                    var55 += this.field3670;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg6 << 16;
            if (arg3 < 0) {
                var57 -= arg3 * var9;
                var56 -= arg3 * var10;
                arg3 = 0;
            }
            int var58 = arg5 << 16;
            if (arg0 < 0) {
                var58 -= arg0 * var8;
                arg0 = 0;
            }
            if (var9 >= var10) {
                int var59 = arg4 - arg0;
                int var60 = arg0 - arg3;
                int var61 = this.field3670 * arg3;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class101.method785(114, var57 >> 16, var61, this.field3676, 0, var58 >> 16);
                            var58 += var8;
                            var61 += this.field3670;
                            var57 += var9;
                        }
                    }
                    class101.method785(94, var57 >> 16, var61, this.field3676, 0, var56 >> 16);
                    var61 += this.field3670;
                    var57 += var9;
                    var56 += var10;
                }
            } else {
                int var62 = arg4 - arg0;
                int var63 = arg0 - arg3;
                int var64 = this.field3670 * arg3;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class101.method785(90, var58 >> 16, var64, this.field3676, 0, var57 >> 16);
                            var57 += var9;
                            var64 += this.field3670;
                            var58 += var8;
                        }
                    }
                    class101.method785(67, var56 >> 16, var64, this.field3676, 0, var57 >> 16);
                    var57 += var9;
                    var64 += this.field3670;
                    var56 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(BII)V", line = 463)
    public static final void method1648(byte arg0, int arg1, int arg2) {
        if (arg0 != 82) {
            return;
        }
        field3675++;
        if (class682.field9122 == class426.field6204) {
            if (!class307.method1985(-2, arg1, 1, 1, 0, false, 0, arg2, true)) {
                class307.method1985(-3, arg1, 1, 1, 0, false, 0, arg2, true);
            }
        } else if (!class307.method1985(-3, arg1, 1, 1, 0, false, 0, arg2, true)) {
            class307.method1985(-2, arg1, 1, 1, 0, false, 0, arg2, true);
        }
    }

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "(B)V", line = 493)
    public static void method1649(byte arg0) {
        field3674 = null;
        field3677 = null;
        if (arg0 != -1) {
            field3677 = null;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IBI)Z", line = 510)
    public final boolean method1650(int arg0, byte arg1, int arg2) {
        int var4 = -14 % ((arg1 - 57) / 45);
        field3669++;
        return this.field3676.length >= (arg0 * arg2);
    }

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "(B)V", line = 525)
    public final void method1651(byte arg0) {
        if (arg0 >= -67) {
            this.field3670 = 95;
        }
        field3671++;
        int var2 = -1;
        int var3 = this.field3676.length - 8;
        while (var3 > var2) {
            var2++;
            this.field3676[var2] = 0;
            var2++;
            this.field3676[var2] = 0;
            var2++;
            this.field3676[var2] = 0;
            var2++;
            this.field3676[var2] = 0;
            var2++;
            this.field3676[var2] = 0;
            var2++;
            this.field3676[var2] = 0;
            var2++;
            this.field3676[var2] = 0;
            var2++;
            this.field3676[var2] = 0;
        }
        while ((this.field3676.length - 1) > var2) {
            var2++;
            this.field3676[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Llf;II)V", line = 554)
    public class251(class250 arg0, int arg1, int arg2) {
        this.field3676 = new byte[arg1 * arg2];
    }
}
