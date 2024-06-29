import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class450 extends class706 {

    @OriginalMember(owner = "client!w", name = "I", descriptor = "[B")
    public byte[] field6187;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "[S")
    public static short[] field6188 = new short[256];

    @OriginalMember(owner = "client!w", name = "y", descriptor = "Lfha;")
    public static class522 field6178 = new class522();

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public int field6180;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public int field6185;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    public int field6189;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    public int field6190;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "Lsv;")
    public static class59 field6183;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)[Ljf;")
    public static final class640[] method2701(byte arg0) {
        field6186++;
        if (arg0 > -17) {
            field6183 = null;
        }
        return new class640[] { class175.field2381, class224.field3150, class497.field6968, class345.field4396, class499.field6985, class321.field4139, class453.field6240, class497.field6964, class710.field9912, class53.field744, class710.field9911, class714.field10126, class91.field1236, class47.field695 };
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(B)V")
    public final void method2702(byte arg0) {
        field6179++;
        int var2 = 120 % ((arg0 - 80) / 37);
        int var3 = -1;
        int var4 = this.field6187.length - 8;
        while (var4 > var3) {
            var3++;
            this.field6187[var3] = 0;
            var3++;
            this.field6187[var3] = 0;
            var3++;
            this.field6187[var3] = 0;
            var3++;
            this.field6187[var3] = 0;
            var3++;
            this.field6187[var3] = 0;
            var3++;
            this.field6187[var3] = 0;
            var3++;
            this.field6187[var3] = 0;
            var3++;
            this.field6187[var3] = 0;
        }
        while (var3 < this.field6187.length - 1) {
            var3++;
            this.field6187[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I")
    public static int method2703(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BIIIIII)V")
    public final void method2704(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6193++;
        int var8 = 0;
        if (arg2 != arg3) {
            var8 = (arg5 - arg4 << 16) / (arg3 - arg2);
        }
        int var9 = 0;
        if (arg3 != arg6) {
            var9 = (arg1 - arg5 << 16) / (arg6 - arg3);
        }
        int var10 = 0;
        if (arg0 != -111) {
            field6183 = null;
        }
        if (arg2 != arg6) {
            var10 = (arg4 - arg1 << 16) / (arg2 - arg6);
        }
        if (arg2 <= arg3 && arg2 <= arg6) {
            if (arg3 >= arg6) {
                int var11;
                int var12 = var11 = arg4 << 16;
                int var13 = arg1 << 16;
                if (arg2 < 0) {
                    var11 -= arg2 * var8;
                    var12 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg6 < 0) {
                    var13 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg2 != arg6 && var10 < var8 || arg2 == arg6 && var9 > var8) {
                    int var14 = arg3 - arg6;
                    int var15 = arg6 - arg2;
                    int var16 = this.field6185 * arg2;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class217.method1423(var11 >> 16, -102, 0, this.field6187, var13 >> 16, var16);
                                var16 += this.field6185;
                                var13 += var9;
                                var11 += var8;
                            }
                        }
                        class217.method1423(var11 >> 16, -93, 0, this.field6187, var12 >> 16, var16);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field6185;
                    }
                } else {
                    int var17 = arg3 - arg6;
                    int var18 = arg6 - arg2;
                    int var19 = this.field6185 * arg2;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class217.method1423(var13 >> 16, -94, 0, this.field6187, var11 >> 16, var19);
                                var11 += var8;
                                var13 += var9;
                                var19 += this.field6185;
                            }
                        }
                        class217.method1423(var12 >> 16, -90, 0, this.field6187, var11 >> 16, var19);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field6185;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg4 << 16;
                int var22 = arg5 << 16;
                if (arg2 < 0) {
                    var20 -= arg2 * var8;
                    var21 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg3 < 0) {
                    var22 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg2 != arg3 && var8 > var10 || arg2 == arg3 && var10 > var9) {
                    int var23 = arg6 - arg3;
                    int var24 = arg3 - arg2;
                    int var25 = this.field6185 * arg2;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class217.method1423(var22 >> 16, -119, 0, this.field6187, var21 >> 16, var25);
                                var21 += var10;
                                var22 += var9;
                                var25 += this.field6185;
                            }
                        }
                        class217.method1423(var20 >> 16, -88, 0, this.field6187, var21 >> 16, var25);
                        var21 += var10;
                        var25 += this.field6185;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg6 - arg3;
                    int var27 = arg3 - arg2;
                    int var28 = this.field6185 * arg2;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class217.method1423(var21 >> 16, -86, 0, this.field6187, var22 >> 16, var28);
                                var21 += var10;
                                var22 += var9;
                                var28 += this.field6185;
                            }
                        }
                        class217.method1423(var21 >> 16, -125, 0, this.field6187, var20 >> 16, var28);
                        var20 += var8;
                        var28 += this.field6185;
                        var21 += var10;
                    }
                }
            }
        } else if (arg3 <= arg6) {
            if (arg6 < arg2) {
                int var29;
                int var30 = var29 = arg5 << 16;
                if (arg3 < 0) {
                    var30 -= arg3 * var8;
                    var29 -= arg3 * var9;
                    arg3 = 0;
                }
                int var31 = arg1 << 16;
                if (arg6 < 0) {
                    var31 -= arg6 * var10;
                    arg6 = 0;
                }
                if ((arg3 == arg6 || var9 <= var8) && (arg3 != arg6 || var8 <= var10)) {
                    int var35 = arg2 - arg6;
                    int var36 = arg6 - arg3;
                    int var37 = this.field6185 * arg3;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class217.method1423(var30 >> 16, arg0 - 12, 0, this.field6187, var31 >> 16, var37);
                                var30 += var8;
                                var31 += var10;
                                var37 += this.field6185;
                            }
                        }
                        class217.method1423(var30 >> 16, arg0 ^ 0x16, 0, this.field6187, var29 >> 16, var37);
                        var29 += var9;
                        var37 += this.field6185;
                        var30 += var8;
                    }
                } else {
                    int var32 = arg2 - arg6;
                    int var33 = arg6 - arg3;
                    int var34 = this.field6185 * arg3;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class217.method1423(var31 >> 16, -109, 0, this.field6187, var30 >> 16, var34);
                                var30 += var8;
                                var34 += this.field6185;
                                var31 += var10;
                            }
                        }
                        class217.method1423(var29 >> 16, arg0 + 23, 0, this.field6187, var30 >> 16, var34);
                        var34 += this.field6185;
                        var30 += var8;
                        var29 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg5 << 16;
                if (arg3 < 0) {
                    var39 -= arg3 * var8;
                    var38 -= arg3 * var9;
                    arg3 = 0;
                }
                int var40 = arg4 << 16;
                if (arg2 < 0) {
                    var40 -= arg2 * var10;
                    arg2 = 0;
                }
                if (var8 >= var9) {
                    int var41 = arg6 - arg2;
                    int var42 = arg2 - arg3;
                    int var43 = this.field6185 * arg3;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class217.method1423(var40 >> 16, -105, 0, this.field6187, var38 >> 16, var43);
                                var38 += var9;
                                var43 += this.field6185;
                                var40 += var10;
                            }
                        }
                        class217.method1423(var39 >> 16, -112, 0, this.field6187, var38 >> 16, var43);
                        var39 += var8;
                        var43 += this.field6185;
                        var38 += var9;
                    }
                } else {
                    int var44 = arg6 - arg2;
                    int var45 = arg2 - arg3;
                    int var46 = this.field6185 * arg3;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class217.method1423(var38 >> 16, -111, 0, this.field6187, var40 >> 16, var46);
                                var40 += var10;
                                var46 += this.field6185;
                                var38 += var9;
                            }
                        }
                        class217.method1423(var38 >> 16, -120, 0, this.field6187, var39 >> 16, var46);
                        var39 += var8;
                        var46 += this.field6185;
                        var38 += var9;
                    }
                }
            }
        } else if (arg2 < arg3) {
            int var47;
            int var48 = var47 = arg1 << 16;
            if (arg6 < 0) {
                var48 -= arg6 * var9;
                var47 -= arg6 * var10;
                arg6 = 0;
            }
            int var49 = arg4 << 16;
            if (arg2 < 0) {
                var49 -= arg2 * var8;
                arg2 = 0;
            }
            if (var9 >= var10) {
                int var50 = arg3 - arg2;
                int var51 = arg2 - arg6;
                int var52 = this.field6185 * arg6;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class217.method1423(var48 >> 16, -100, 0, this.field6187, var49 >> 16, var52);
                            var52 += this.field6185;
                            var48 += var9;
                            var49 += var8;
                        }
                    }
                    class217.method1423(var48 >> 16, -86, 0, this.field6187, var47 >> 16, var52);
                    var48 += var9;
                    var47 += var10;
                    var52 += this.field6185;
                }
            } else {
                int var53 = arg3 - arg2;
                int var54 = arg2 - arg6;
                int var55 = this.field6185 * arg6;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class217.method1423(var49 >> 16, -105, 0, this.field6187, var48 >> 16, var55);
                            var55 += this.field6185;
                            var49 += var8;
                            var48 += var9;
                        }
                    }
                    class217.method1423(var47 >> 16, -88, 0, this.field6187, var48 >> 16, var55);
                    var47 += var10;
                    var55 += this.field6185;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg1 << 16;
            if (arg6 < 0) {
                var57 -= arg6 * var9;
                var56 -= arg6 * var10;
                arg6 = 0;
            }
            int var58 = arg5 << 16;
            if (arg3 < 0) {
                var58 -= arg3 * var8;
                arg3 = 0;
            }
            if (var9 < var10) {
                int var59 = arg2 - arg3;
                int var60 = arg3 - arg6;
                int var61 = this.field6185 * arg6;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class217.method1423(var56 >> 16, arg0 + 16, 0, this.field6187, var58 >> 16, var61);
                            var61 += this.field6185;
                            var56 += var10;
                            var58 += var8;
                        }
                    }
                    class217.method1423(var56 >> 16, -120, 0, this.field6187, var57 >> 16, var61);
                    var57 += var9;
                    var56 += var10;
                    var61 += this.field6185;
                }
            } else {
                int var62 = arg2 - arg3;
                int var63 = arg3 - arg6;
                int var64 = this.field6185 * arg6;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class217.method1423(var58 >> 16, -89, 0, this.field6187, var56 >> 16, var64);
                            var56 += var10;
                            var64 += this.field6185;
                            var58 += var8;
                        }
                    }
                    class217.method1423(var57 >> 16, arg0 - 10, 0, this.field6187, var56 >> 16, var64);
                    var64 += this.field6185;
                    var56 += var10;
                    var57 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BIIII)V")
    public final void method2705(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field6192++;
        if (arg0 >= -67) {
            field6178 = null;
        }
        this.field6190 = arg2;
        this.field6185 = arg4 - arg3;
        this.field6189 = arg1 - arg2;
        this.field6180 = arg3;
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(B)V")
    public static void method2706(byte arg0) {
        field6188 = null;
        field6183 = null;
        if (arg0 == 46) {
            field6178 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IBLvea;I)J")
    public static final long method2707(int arg0, byte arg1, class649 arg2, int arg3) {
        if (arg1 < 74) {
            method2708(31, (byte) -66, 57);
        }
        field6191++;
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class30 var8 = class264.field3604.method3188(arg2.method275(24263), (byte) -57);
        long var9 = (long) (arg3 << 7 | arg0 | arg2.method276(-25963) << 14 | arg2.method269(-17174) << 20 | 0x40000000);
        if (var8.field467 == 0) {
            var9 |= var6;
        }
        if (var8.field431 == 1) {
            var9 |= var4;
        }
        return var9 | (long) arg2.method275(24263) << 32;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2708(int arg0, byte arg1, int arg2) {
        if (arg1 != 40) {
            field6188 = null;
        }
        field6184++;
        return (arg0 & 0x800) != 0 && (arg2 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lpga;II)V")
    public class450(class492 arg0, int arg1, int arg2) {
        this.field6187 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)Z")
    public final boolean method2709(int arg0, int arg1, int arg2) {
        field6181++;
        if (arg2 != 1073741824) {
            method2708(14, (byte) -10, -40);
        }
        return this.field6187.length >= (arg0 * arg1);
    }
}
