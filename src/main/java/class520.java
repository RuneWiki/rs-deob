import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class520 extends class54 {

    @OriginalMember(owner = "client!tv", name = "J", descriptor = "[B")
    public byte[] field7332;

    @OriginalMember(owner = "client!tv", name = "F", descriptor = "[I")
    public static int[] field7328 = new int[32];

    @OriginalMember(owner = "client!tv", name = "G", descriptor = "I")
    public static int field7329 = 0;

    @OriginalMember(owner = "client!tv", name = "L", descriptor = "Lnea;")
    public static class664 field7334 = new class664(25, 9);

    @OriginalMember(owner = "client!tv", name = "O", descriptor = "Z")
    public static boolean field7337 = false;

    @OriginalMember(owner = "client!tv", name = "y", descriptor = "I")
    public int field7321;

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!tv", name = "A", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!tv", name = "B", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!tv", name = "C", descriptor = "I")
    public int field7325;

    @OriginalMember(owner = "client!tv", name = "D", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!tv", name = "E", descriptor = "I")
    public int field7327;

    @OriginalMember(owner = "client!tv", name = "H", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!tv", name = "I", descriptor = "I")
    public int field7331;

    @OriginalMember(owner = "client!tv", name = "N", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!tv", name = "K", descriptor = "Lbh;")
    public static class34 field7333;

    @OriginalMember(owner = "client!tv", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field7335;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(CI)B", line = 4)
    public static final byte method2966(char arg0, int arg1) {
        if (arg1 != 20965) {
            return -3;
        }
        field7322++;
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(BIIII)V", line = 131)
    public final void method2967(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7331 = arg4;
        field7326++;
        this.field7327 = arg2;
        this.field7325 = arg1 - arg2;
        int var6 = 32 / ((10 - arg0) / 53);
        this.field7321 = arg3 - arg4;
    }

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "(B)V", line = 158)
    public static void method2968(byte arg0) {
        field7334 = null;
        if (arg0 != -103) {
            field7337 = true;
        }
        field7328 = null;
        field7333 = null;
        field7335 = null;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IZI)Z", line = 171)
    public final boolean method2969(int arg0, boolean arg1, int arg2) {
        field7330++;
        if (!arg1) {
            this.method2967((byte) -81, 8, -128, 126, 74);
        }
        return (arg0 * arg2) <= this.field7332.length;
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(Z)V", line = 182)
    public final void method2970(boolean arg0) {
        field7323++;
        int var2 = -1;
        int var3 = this.field7332.length - 8;
        while (var2 < var3) {
            var2++;
            this.field7332[var2] = 0;
            var2++;
            this.field7332[var2] = 0;
            var2++;
            this.field7332[var2] = 0;
            var2++;
            this.field7332[var2] = 0;
            var2++;
            this.field7332[var2] = 0;
            var2++;
            this.field7332[var2] = 0;
            var2++;
            this.field7332[var2] = 0;
            var2++;
            this.field7332[var2] = 0;
        }
        if (!arg0) {
            while ((this.field7332.length - 1) > var2) {
                var2++;
                this.field7332[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIIIII)V", line = 212)
    public final void method2971(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7336++;
        int var8 = 0;
        if (arg4 != arg5) {
            var8 = (arg2 - arg1 << 16) / (arg5 - arg4);
        }
        if (arg6 != 25223) {
            this.method2969(4, true, 60);
        }
        int var9 = 0;
        if (arg3 != arg5) {
            var9 = (arg0 - arg2 << 16) / (arg3 - arg5);
        }
        int var10 = 0;
        if (arg3 != arg4) {
            var10 = (arg1 - arg0 << 16) / (arg4 - arg3);
        }
        if (arg4 <= arg5 && arg4 <= arg3) {
            if (arg3 <= arg5) {
                int var11;
                int var12 = var11 = arg1 << 16;
                if (arg4 < 0) {
                    var12 -= arg4 * var10;
                    var11 -= arg4 * var8;
                    arg4 = 0;
                }
                int var13 = arg0 << 16;
                if (arg3 < 0) {
                    var13 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg3 != arg4 && var10 < var8 || arg3 == arg4 && var9 > var8) {
                    int var14 = arg5 - arg3;
                    int var15 = arg3 - arg4;
                    int var16 = this.field7325 * arg4;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class387.method2342(89, var16, var11 >> 16, 0, this.field7332, var13 >> 16);
                                var16 += this.field7325;
                                var13 += var9;
                                var11 += var8;
                            }
                        }
                        class387.method2342(85, var16, var11 >> 16, 0, this.field7332, var12 >> 16);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field7325;
                    }
                } else {
                    int var17 = arg5 - arg3;
                    int var18 = arg3 - arg4;
                    int var19 = this.field7325 * arg4;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class387.method2342(113, var19, var13 >> 16, 0, this.field7332, var11 >> 16);
                                var11 += var8;
                                var19 += this.field7325;
                                var13 += var9;
                            }
                        }
                        class387.method2342(101, var19, var12 >> 16, 0, this.field7332, var11 >> 16);
                        var11 += var8;
                        var19 += this.field7325;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg1 << 16;
                int var22 = arg2 << 16;
                if (arg4 < 0) {
                    var21 -= arg4 * var10;
                    var20 -= arg4 * var8;
                    arg4 = 0;
                }
                if (arg5 < 0) {
                    var22 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg4 != arg5 && var10 < var8 || arg4 == arg5 && var9 < var10) {
                    int var23 = arg3 - arg5;
                    int var24 = arg5 - arg4;
                    int var25 = this.field7325 * arg4;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class387.method2342(arg6 ^ 0xFFFF9D36, var25, var22 >> 16, 0, this.field7332, var21 >> 16);
                                var21 += var10;
                                var22 += var9;
                                var25 += this.field7325;
                            }
                        }
                        class387.method2342(-96, var25, var20 >> 16, 0, this.field7332, var21 >> 16);
                        var25 += this.field7325;
                        var21 += var10;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg3 - arg5;
                    int var27 = arg5 - arg4;
                    int var28 = this.field7325 * arg4;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class387.method2342(67, var28, var21 >> 16, 0, this.field7332, var22 >> 16);
                                var28 += this.field7325;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class387.method2342(80, var28, var21 >> 16, 0, this.field7332, var20 >> 16);
                        var21 += var10;
                        var28 += this.field7325;
                        var20 += var8;
                    }
                }
            }
        } else if (arg5 > arg3) {
            if (arg4 < arg5) {
                int var29;
                int var30 = var29 = arg0 << 16;
                if (arg3 < 0) {
                    var29 -= arg3 * var10;
                    var30 -= arg3 * var9;
                    arg3 = 0;
                }
                int var31 = arg1 << 16;
                if (arg4 < 0) {
                    var31 -= arg4 * var8;
                    arg4 = 0;
                }
                if (var10 <= var9) {
                    int var32 = arg5 - arg4;
                    int var33 = arg4 - arg3;
                    int var34 = this.field7325 * arg3;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class387.method2342(-94, var34, var30 >> 16, 0, this.field7332, var31 >> 16);
                                var31 += var8;
                                var30 += var9;
                                var34 += this.field7325;
                            }
                        }
                        class387.method2342(84, var34, var30 >> 16, 0, this.field7332, var29 >> 16);
                        var30 += var9;
                        var29 += var10;
                        var34 += this.field7325;
                    }
                } else {
                    int var35 = arg5 - arg4;
                    int var36 = arg4 - arg3;
                    int var37 = this.field7325 * arg3;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class387.method2342(-79, var37, var31 >> 16, 0, this.field7332, var30 >> 16);
                                var37 += this.field7325;
                                var31 += var8;
                                var30 += var9;
                            }
                        }
                        class387.method2342(arg6 ^ 0xFFFF9D13, var37, var29 >> 16, 0, this.field7332, var30 >> 16);
                        var30 += var9;
                        var29 += var10;
                        var37 += this.field7325;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg0 << 16;
                if (arg3 < 0) {
                    var39 -= arg3 * var9;
                    var38 -= arg3 * var10;
                    arg3 = 0;
                }
                int var40 = arg2 << 16;
                if (arg5 < 0) {
                    var40 -= arg5 * var8;
                    arg5 = 0;
                }
                if (var9 >= var10) {
                    int var41 = arg4 - arg5;
                    int var42 = arg5 - arg3;
                    int var43 = this.field7325 * arg3;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class387.method2342(-77, var43, var40 >> 16, 0, this.field7332, var38 >> 16);
                                var43 += this.field7325;
                                var40 += var8;
                                var38 += var10;
                            }
                        }
                        class387.method2342(arg6 ^ 0x62C7, var43, var39 >> 16, 0, this.field7332, var38 >> 16);
                        var39 += var9;
                        var38 += var10;
                        var43 += this.field7325;
                    }
                } else {
                    int var44 = arg4 - arg5;
                    int var45 = arg5 - arg3;
                    int var46 = this.field7325 * arg3;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class387.method2342(84, var46, var38 >> 16, 0, this.field7332, var40 >> 16);
                                var38 += var10;
                                var40 += var8;
                                var46 += this.field7325;
                            }
                        }
                        class387.method2342(arg6 - 25351, var46, var38 >> 16, 0, this.field7332, var39 >> 16);
                        var38 += var10;
                        var39 += var9;
                        var46 += this.field7325;
                    }
                }
            }
        } else if (arg4 > arg3) {
            int var47;
            int var48 = var47 = arg2 << 16;
            int var49 = arg0 << 16;
            if (arg5 < 0) {
                var48 -= arg5 * var8;
                var47 -= arg5 * var9;
                arg5 = 0;
            }
            if (arg3 < 0) {
                var49 -= arg3 * var10;
                arg3 = 0;
            }
            if (arg3 != arg5 && var8 < var9 || arg3 == arg5 && var8 > var10) {
                int var50 = arg4 - arg3;
                int var51 = arg3 - arg5;
                int var52 = this.field7325 * arg5;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class387.method2342(-117, var52, var49 >> 16, 0, this.field7332, var48 >> 16);
                            var52 += this.field7325;
                            var48 += var8;
                            var49 += var10;
                        }
                    }
                    class387.method2342(108, var52, var47 >> 16, 0, this.field7332, var48 >> 16);
                    var48 += var8;
                    var47 += var9;
                    var52 += this.field7325;
                }
            } else {
                int var53 = arg4 - arg3;
                int var54 = arg3 - arg5;
                int var55 = this.field7325 * arg5;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class387.method2342(111, var55, var48 >> 16, 0, this.field7332, var49 >> 16);
                            var49 += var10;
                            var55 += this.field7325;
                            var48 += var8;
                        }
                    }
                    class387.method2342(-122, var55, var48 >> 16, 0, this.field7332, var47 >> 16);
                    var55 += this.field7325;
                    var47 += var9;
                    var48 += var8;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg2 << 16;
            int var58 = arg1 << 16;
            if (arg5 < 0) {
                var57 -= arg5 * var8;
                var56 -= arg5 * var9;
                arg5 = 0;
            }
            if (arg4 < 0) {
                var58 -= arg4 * var10;
                arg4 = 0;
            }
            if (var9 > var8) {
                int var59 = arg3 - arg4;
                int var60 = arg4 - arg5;
                int var61 = this.field7325 * arg5;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class387.method2342(67, var61, var56 >> 16, 0, this.field7332, var58 >> 16);
                            var56 += var9;
                            var58 += var10;
                            var61 += this.field7325;
                        }
                    }
                    class387.method2342(-65, var61, var56 >> 16, 0, this.field7332, var57 >> 16);
                    var61 += this.field7325;
                    var56 += var9;
                    var57 += var8;
                }
            } else {
                int var62 = arg3 - arg4;
                int var63 = arg4 - arg5;
                int var64 = this.field7325 * arg5;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class387.method2342(120, var64, var58 >> 16, 0, this.field7332, var56 >> 16);
                            var56 += var9;
                            var64 += this.field7325;
                            var58 += var10;
                        }
                    }
                    class387.method2342(83, var64, var57 >> 16, 0, this.field7332, var56 >> 16);
                    var56 += var9;
                    var64 += this.field7325;
                    var57 += var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lok;II)V", line = 657)
    public class520(class228 arg0, int arg1, int arg2) {
        this.field7332 = new byte[arg1 * arg2];
    }
}
