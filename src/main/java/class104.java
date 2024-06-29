import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class104 extends class181 {

    @OriginalMember(owner = "client!jt", name = "U", descriptor = "[B")
    public byte[] field1745;

    @OriginalMember(owner = "client!jt", name = "H", descriptor = "[Z")
    public static boolean[] field1732 = new boolean[5];

    @OriginalMember(owner = "client!jt", name = "P", descriptor = "[[I")
    public static int[][] field1740 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!jt", name = "G", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!jt", name = "I", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!jt", name = "J", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!jt", name = "K", descriptor = "I")
    public int field1735;

    @OriginalMember(owner = "client!jt", name = "L", descriptor = "I")
    public int field1736;

    @OriginalMember(owner = "client!jt", name = "M", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!jt", name = "O", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!jt", name = "R", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!jt", name = "S", descriptor = "I")
    public int field1743;

    @OriginalMember(owner = "client!jt", name = "T", descriptor = "I")
    public int field1744;

    @OriginalMember(owner = "client!jt", name = "Q", descriptor = "Leq;")
    public static class209 field1741;

    @OriginalMember(owner = "client!jt", name = "N", descriptor = "[Z")
    public static boolean[] field1738;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "(B)V")
    public static final void method900(byte arg0) {
        field1742++;
        class564.field7978 = 0;
        int var1 = class644.field9146.method236(arg0 + 246);
        boolean var2 = class644.field9146.method236(123) == 1;
        int var3 = class644.field9146.method248((byte) -117);
        int var4 = class644.field9146.method253(-13900);
        class399.method2471((byte) -26);
        class414.method2519(var1, 9349);
        int var5 = (class374.field5243 - class644.field9146.field469) / 16;
        class35.field463 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class35.field463[var6][var10] = class644.field9146.method234((byte) -97);
            }
        }
        class390.field5453 = new int[var5];
        class109.field1777 = new int[var5];
        class412.field5705 = new int[var5];
        class190.field2739 = new byte[var5][];
        class430.field6023 = new byte[var5][];
        class190.field2743 = new byte[var5][];
        class697.field9800 = null;
        class68.field1233 = new int[var5];
        class561.field7959 = new int[var5];
        class493.field7032 = null;
        class630.field9040 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var4 - (class174.field2540 >> 4)) / 8; var8 <= ((var4 + (class174.field2540 >> 4)) / 8); var8++) {
            for (int var9 = (var3 - (class716.field9999 >> 4)) / 8; var9 <= ((class716.field9999 >> 4) + var3) / 8; var9++) {
                class412.field5705[var7] = (var8 << 8) + var9;
                class561.field7959[var7] = class391.field5460.method1482(class349.method2193(arg0, 125), "m" + var8 + "_" + var9);
                class68.field1233[var7] = class391.field5460.method1482(-1, "l" + var8 + "_" + var9);
                class390.field5453[var7] = class391.field5460.method1482(-1, "um" + var8 + "_" + var9);
                class109.field1777[var7] = class391.field5460.method1482(-1, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        if (arg0 != -126) {
            method905((byte) -9);
        }
        class68.method709(var2, var4, arg0 ^ 0x7D, 11, var3);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIII)V")
    public final void method901(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1744 = arg2;
        this.field1735 = arg4 - arg1;
        this.field1743 = arg1;
        field1733++;
        if (arg0 != -12724) {
            method900((byte) -11);
        }
        this.field1736 = arg3 - arg2;
    }

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "(I)V")
    public final void method902(int arg0) {
        field1737++;
        int var2 = -1;
        if (arg0 != -29011) {
            this.method902(-18);
        }
        int var3 = this.field1745.length - 8;
        while (var3 > var2) {
            var2++;
            this.field1745[var2] = 0;
            var2++;
            this.field1745[var2] = 0;
            var2++;
            this.field1745[var2] = 0;
            var2++;
            this.field1745[var2] = 0;
            var2++;
            this.field1745[var2] = 0;
            var2++;
            this.field1745[var2] = 0;
            var2++;
            this.field1745[var2] = 0;
            var2++;
            this.field1745[var2] = 0;
        }
        while ((this.field1745.length - 1) > var2) {
            var2++;
            this.field1745[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IBI)Z")
    public final boolean method903(int arg0, byte arg1, int arg2) {
        if (arg1 > -33) {
            method905((byte) -73);
        }
        field1734++;
        return this.field1745.length >= arg0 * arg2;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIIIZI)V")
    public final void method904(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field1731++;
        if (!arg5) {
            this.field1735 = 15;
        }
        int var8 = 0;
        if (arg3 != arg6) {
            var8 = (arg0 - arg1 << 16) / (arg6 - arg3);
        }
        int var9 = 0;
        if (arg4 != arg6) {
            var9 = (arg2 - arg0 << 16) / (arg4 - arg6);
        }
        int var10 = 0;
        if (arg3 != arg4) {
            var10 = (arg1 - arg2 << 16) / (arg3 - arg4);
        }
        if (arg3 <= arg6 && arg3 <= arg4) {
            if (arg4 <= arg6) {
                int var11;
                int var12 = var11 = arg1 << 16;
                if (arg3 < 0) {
                    var11 -= arg3 * var8;
                    var12 -= arg3 * var10;
                    arg3 = 0;
                }
                int var13 = arg2 << 16;
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg3 != arg4 && var8 > var10 || arg3 == arg4 && var9 > var8) {
                    int var14 = arg6 - arg4;
                    int var15 = arg4 - arg3;
                    int var16 = this.field1736 * arg3;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class675.method3816(this.field1745, (byte) -2, var11 >> 16, 0, var13 >> 16, var16);
                                var13 += var9;
                                var11 += var8;
                                var16 += this.field1736;
                            }
                        }
                        class675.method3816(this.field1745, (byte) -2, var11 >> 16, 0, var12 >> 16, var16);
                        var16 += this.field1736;
                        var11 += var8;
                        var12 += var10;
                    }
                } else {
                    int var17 = arg6 - arg4;
                    int var18 = arg4 - arg3;
                    int var19 = this.field1736 * arg3;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class675.method3816(this.field1745, (byte) -2, var13 >> 16, 0, var11 >> 16, var19);
                                var13 += var9;
                                var19 += this.field1736;
                                var11 += var8;
                            }
                        }
                        class675.method3816(this.field1745, (byte) -2, var12 >> 16, 0, var11 >> 16, var19);
                        var12 += var10;
                        var11 += var8;
                        var19 += this.field1736;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg1 << 16;
                if (arg3 < 0) {
                    var21 -= arg3 * var10;
                    var20 -= arg3 * var8;
                    arg3 = 0;
                }
                int var22 = arg0 << 16;
                if (arg6 < 0) {
                    var22 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg3 != arg6 && var10 < var8 || arg3 == arg6 && var9 < var10) {
                    int var23 = arg4 - arg6;
                    int var24 = arg6 - arg3;
                    int var25 = this.field1736 * arg3;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class675.method3816(this.field1745, (byte) -2, var22 >> 16, 0, var21 >> 16, var25);
                                var22 += var9;
                                var25 += this.field1736;
                                var21 += var10;
                            }
                        }
                        class675.method3816(this.field1745, (byte) -2, var20 >> 16, 0, var21 >> 16, var25);
                        var21 += var10;
                        var25 += this.field1736;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg4 - arg6;
                    int var27 = arg6 - arg3;
                    int var28 = this.field1736 * arg3;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class675.method3816(this.field1745, (byte) -2, var21 >> 16, 0, var22 >> 16, var28);
                                var21 += var10;
                                var22 += var9;
                                var28 += this.field1736;
                            }
                        }
                        class675.method3816(this.field1745, (byte) -2, var21 >> 16, 0, var20 >> 16, var28);
                        var28 += this.field1736;
                        var20 += var8;
                        var21 += var10;
                    }
                }
            }
        } else if (arg6 <= arg4) {
            if (arg4 >= arg3) {
                int var29;
                int var30 = var29 = arg0 << 16;
                if (arg6 < 0) {
                    var29 -= arg6 * var9;
                    var30 -= arg6 * var8;
                    arg6 = 0;
                }
                int var31 = arg1 << 16;
                if (arg3 < 0) {
                    var31 -= arg3 * var10;
                    arg3 = 0;
                }
                if (var8 < var9) {
                    int var32 = arg4 - arg3;
                    int var33 = arg3 - arg6;
                    int var34 = this.field1736 * arg6;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class675.method3816(this.field1745, (byte) -2, var29 >> 16, 0, var31 >> 16, var34);
                                var29 += var9;
                                var34 += this.field1736;
                                var31 += var10;
                            }
                        }
                        class675.method3816(this.field1745, (byte) -2, var29 >> 16, 0, var30 >> 16, var34);
                        var34 += this.field1736;
                        var30 += var8;
                        var29 += var9;
                    }
                } else {
                    int var35 = arg4 - arg3;
                    int var36 = arg3 - arg6;
                    int var37 = this.field1736 * arg6;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class675.method3816(this.field1745, (byte) -2, var31 >> 16, 0, var29 >> 16, var37);
                                var37 += this.field1736;
                                var29 += var9;
                                var31 += var10;
                            }
                        }
                        class675.method3816(this.field1745, (byte) -2, var30 >> 16, 0, var29 >> 16, var37);
                        var29 += var9;
                        var30 += var8;
                        var37 += this.field1736;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg0 << 16;
                if (arg6 < 0) {
                    var38 -= arg6 * var9;
                    var39 -= arg6 * var8;
                    arg6 = 0;
                }
                int var40 = arg2 << 16;
                if (arg4 < 0) {
                    var40 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg4 != arg6 && var8 < var9 || arg4 == arg6 && var8 > var10) {
                    int var41 = arg3 - arg4;
                    int var42 = arg4 - arg6;
                    int var43 = this.field1736 * arg6;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class675.method3816(this.field1745, (byte) -2, var40 >> 16, 0, var39 >> 16, var43);
                                var39 += var8;
                                var40 += var10;
                                var43 += this.field1736;
                            }
                        }
                        class675.method3816(this.field1745, (byte) -2, var38 >> 16, 0, var39 >> 16, var43);
                        var38 += var9;
                        var43 += this.field1736;
                        var39 += var8;
                    }
                } else {
                    int var44 = arg3 - arg4;
                    int var45 = arg4 - arg6;
                    int var46 = this.field1736 * arg6;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class675.method3816(this.field1745, (byte) -2, var39 >> 16, 0, var40 >> 16, var46);
                                var46 += this.field1736;
                                var40 += var10;
                                var39 += var8;
                            }
                        }
                        class675.method3816(this.field1745, (byte) -2, var39 >> 16, 0, var38 >> 16, var46);
                        var46 += this.field1736;
                        var39 += var8;
                        var38 += var9;
                    }
                }
            }
        } else if (arg3 >= arg6) {
            int var47;
            int var48 = var47 = arg2 << 16;
            int var49 = arg0 << 16;
            if (arg4 < 0) {
                var48 -= arg4 * var9;
                var47 -= arg4 * var10;
                arg4 = 0;
            }
            if (arg6 < 0) {
                var49 -= arg6 * var8;
                arg6 = 0;
            }
            if (var10 > var9) {
                int var50 = arg3 - arg6;
                int var51 = arg6 - arg4;
                int var52 = this.field1736 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class675.method3816(this.field1745, (byte) -2, var47 >> 16, 0, var49 >> 16, var52);
                            var47 += var10;
                            var52 += this.field1736;
                            var49 += var8;
                        }
                    }
                    class675.method3816(this.field1745, (byte) -2, var47 >> 16, 0, var48 >> 16, var52);
                    var48 += var9;
                    var52 += this.field1736;
                    var47 += var10;
                }
            } else {
                int var53 = arg3 - arg6;
                int var54 = arg6 - arg4;
                int var55 = this.field1736 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class675.method3816(this.field1745, (byte) -2, var49 >> 16, 0, var47 >> 16, var55);
                            var55 += this.field1736;
                            var47 += var10;
                            var49 += var8;
                        }
                    }
                    class675.method3816(this.field1745, (byte) -2, var48 >> 16, 0, var47 >> 16, var55);
                    var47 += var10;
                    var48 += var9;
                    var55 += this.field1736;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg2 << 16;
            int var58 = arg1 << 16;
            if (arg4 < 0) {
                var57 -= arg4 * var9;
                var56 -= arg4 * var10;
                arg4 = 0;
            }
            if (arg3 < 0) {
                var58 -= arg3 * var8;
                arg3 = 0;
            }
            if (var9 >= var10) {
                int var59 = arg6 - arg3;
                int var60 = arg3 - arg4;
                int var61 = this.field1736 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class675.method3816(this.field1745, (byte) -2, var57 >> 16, 0, var58 >> 16, var61);
                            var61 += this.field1736;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class675.method3816(this.field1745, (byte) -2, var57 >> 16, 0, var56 >> 16, var61);
                    var61 += this.field1736;
                    var56 += var10;
                    var57 += var9;
                }
            } else {
                int var62 = arg6 - arg3;
                int var63 = arg3 - arg4;
                int var64 = this.field1736 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class675.method3816(this.field1745, (byte) -2, var58 >> 16, 0, var57 >> 16, var64);
                            var64 += this.field1736;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class675.method3816(this.field1745, (byte) -2, var56 >> 16, 0, var57 >> 16, var64);
                    var64 += this.field1736;
                    var57 += var9;
                    var56 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "(B)V")
    public static void method905(byte arg0) {
        if (arg0 >= -12) {
            field1740 = null;
        }
        field1740 = null;
        field1738 = null;
        field1741 = null;
        field1732 = null;
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lgt;II)V")
    public class104(class453 arg0, int arg1, int arg2) {
        this.field1745 = new byte[arg1 * arg2];
    }
}
