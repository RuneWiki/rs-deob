import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class239 extends class117 {

    @OriginalMember(owner = "client!di", name = "y", descriptor = "[B")
    public byte[] field3160;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "Leba;")
    public static class550 field3164 = new class550(57, 5);

    @OriginalMember(owner = "client!di", name = "G", descriptor = "Ltt;")
    public static class338 field3168 = new class338(46, -1);

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "I")
    public int field3163;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!di", name = "E", descriptor = "I")
    public int field3166;

    @OriginalMember(owner = "client!di", name = "F", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!di", name = "H", descriptor = "I")
    public int field3169;

    @OriginalMember(owner = "client!di", name = "I", descriptor = "I")
    public int field3170;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(I)V", line = 3)
    public static void method1480(int arg0) {
        field3168 = null;
        if (arg0 == 7032) {
            field3164 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIII)V", line = 18)
    public final void method1481(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3161++;
        int var8 = 0;
        if (arg2 != arg6) {
            var8 = (arg0 - arg1 << 16) / (arg2 - arg6);
        }
        if (arg5 != -1351019056) {
            this.method1484(124, (byte) -126, -26);
        }
        int var9 = 0;
        if (arg2 != arg3) {
            var9 = (arg4 - arg0 << 16) / (arg3 - arg2);
        }
        int var10 = 0;
        if (arg3 != arg6) {
            var10 = (arg1 - arg4 << 16) / (arg6 - arg3);
        }
        if (arg6 <= arg2 && arg3 >= arg6) {
            if (arg3 <= arg2) {
                int var11;
                int var12 = var11 = arg1 << 16;
                if (arg6 < 0) {
                    var11 -= arg6 * var8;
                    var12 -= arg6 * var10;
                    arg6 = 0;
                }
                int var13 = arg4 << 16;
                if (arg3 < 0) {
                    var13 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg3 != arg6 && var8 > var10 || arg3 == arg6 && var8 < var9) {
                    int var14 = arg2 - arg3;
                    int var15 = arg3 - arg6;
                    int var16 = this.field3166 * arg6;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class569.method3153(0, var16, this.field3160, var11 >> 16, 115, var13 >> 16);
                                var13 += var9;
                                var11 += var8;
                                var16 += this.field3166;
                            }
                        }
                        class569.method3153(0, var16, this.field3160, var11 >> 16, 122, var12 >> 16);
                        var11 += var8;
                        var16 += this.field3166;
                        var12 += var10;
                    }
                } else {
                    int var17 = arg2 - arg3;
                    int var18 = arg3 - arg6;
                    int var19 = this.field3166 * arg6;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class569.method3153(0, var19, this.field3160, var13 >> 16, 120, var11 >> 16);
                                var11 += var8;
                                var19 += this.field3166;
                                var13 += var9;
                            }
                        }
                        class569.method3153(0, var19, this.field3160, var12 >> 16, arg5 ^ 0xAF7915BF, var11 >> 16);
                        var12 += var10;
                        var11 += var8;
                        var19 += this.field3166;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg1 << 16;
                int var22 = arg0 << 16;
                if (arg6 < 0) {
                    var21 -= arg6 * var10;
                    var20 -= arg6 * var8;
                    arg6 = 0;
                }
                if (arg2 < 0) {
                    var22 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg2 != arg6 && var10 < var8 || arg2 == arg6 && var9 < var10) {
                    int var23 = arg3 - arg2;
                    int var24 = arg2 - arg6;
                    int var25 = this.field3166 * arg6;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class569.method3153(0, var25, this.field3160, var22 >> 16, 113, var21 >> 16);
                                var22 += var9;
                                var25 += this.field3166;
                                var21 += var10;
                            }
                        }
                        class569.method3153(0, var25, this.field3160, var20 >> 16, 111, var21 >> 16);
                        var21 += var10;
                        var25 += this.field3166;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg3 - arg2;
                    int var27 = arg2 - arg6;
                    int var28 = this.field3166 * arg6;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class569.method3153(0, var28, this.field3160, var21 >> 16, 118, var22 >> 16);
                                var22 += var9;
                                var21 += var10;
                                var28 += this.field3166;
                            }
                        }
                        class569.method3153(0, var28, this.field3160, var21 >> 16, arg5 ^ 0xAF7915BE, var20 >> 16);
                        var20 += var8;
                        var21 += var10;
                        var28 += this.field3166;
                    }
                }
            }
        } else if (arg2 <= arg3) {
            if (arg3 >= arg6) {
                int var29;
                int var30 = var29 = arg0 << 16;
                int var31 = arg1 << 16;
                if (arg2 < 0) {
                    var30 -= arg2 * var8;
                    var29 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg6 < 0) {
                    var31 -= arg6 * var10;
                    arg6 = 0;
                }
                if (var9 <= var8) {
                    int var32 = arg3 - arg6;
                    int var33 = arg6 - arg2;
                    int var34 = this.field3166 * arg2;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class569.method3153(0, var34, this.field3160, var31 >> 16, arg5 ^ 0xAF7915AA, var29 >> 16);
                                var31 += var10;
                                var34 += this.field3166;
                                var29 += var9;
                            }
                        }
                        class569.method3153(0, var34, this.field3160, var30 >> 16, 121, var29 >> 16);
                        var30 += var8;
                        var29 += var9;
                        var34 += this.field3166;
                    }
                } else {
                    int var35 = arg3 - arg6;
                    int var36 = arg6 - arg2;
                    int var37 = this.field3166 * arg2;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class569.method3153(0, var37, this.field3160, var29 >> 16, arg5 + 1351019183, var31 >> 16);
                                var37 += this.field3166;
                                var29 += var9;
                                var31 += var10;
                            }
                        }
                        class569.method3153(0, var37, this.field3160, var29 >> 16, 114, var30 >> 16);
                        var29 += var9;
                        var37 += this.field3166;
                        var30 += var8;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg0 << 16;
                int var40 = arg4 << 16;
                if (arg2 < 0) {
                    var39 -= arg2 * var8;
                    var38 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg3 < 0) {
                    var40 -= arg3 * var10;
                    arg3 = 0;
                }
                if (arg2 != arg3 && var8 < var9 || arg2 == arg3 && var8 > var10) {
                    int var41 = arg6 - arg3;
                    int var42 = arg3 - arg2;
                    int var43 = this.field3166 * arg2;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class569.method3153(0, var43, this.field3160, var40 >> 16, 110, var39 >> 16);
                                var40 += var10;
                                var43 += this.field3166;
                                var39 += var8;
                            }
                        }
                        class569.method3153(0, var43, this.field3160, var38 >> 16, 108, var39 >> 16);
                        var38 += var9;
                        var43 += this.field3166;
                        var39 += var8;
                    }
                } else {
                    int var44 = arg6 - arg3;
                    int var45 = arg3 - arg2;
                    int var46 = this.field3166 * arg2;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class569.method3153(0, var46, this.field3160, var39 >> 16, 127, var40 >> 16);
                                var46 += this.field3166;
                                var39 += var8;
                                var40 += var10;
                            }
                        }
                        class569.method3153(0, var46, this.field3160, var39 >> 16, 109, var38 >> 16);
                        var46 += this.field3166;
                        var39 += var8;
                        var38 += var9;
                    }
                }
            }
        } else if (arg2 <= arg6) {
            int var47;
            int var48 = var47 = arg4 << 16;
            int var49 = arg0 << 16;
            if (arg3 < 0) {
                var48 -= arg3 * var9;
                var47 -= arg3 * var10;
                arg3 = 0;
            }
            if (arg2 < 0) {
                var49 -= arg2 * var8;
                arg2 = 0;
            }
            if (var9 < var10) {
                int var50 = arg6 - arg2;
                int var51 = arg2 - arg3;
                int var52 = this.field3166 * arg3;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class569.method3153(0, var52, this.field3160, var47 >> 16, 114, var49 >> 16);
                            var47 += var10;
                            var49 += var8;
                            var52 += this.field3166;
                        }
                    }
                    class569.method3153(0, var52, this.field3160, var47 >> 16, 110, var48 >> 16);
                    var47 += var10;
                    var48 += var9;
                    var52 += this.field3166;
                }
            } else {
                int var53 = arg6 - arg2;
                int var54 = arg2 - arg3;
                int var55 = this.field3166 * arg3;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class569.method3153(0, var55, this.field3160, var49 >> 16, 121, var47 >> 16);
                            var49 += var8;
                            var55 += this.field3166;
                            var47 += var10;
                        }
                    }
                    class569.method3153(0, var55, this.field3160, var48 >> 16, 126, var47 >> 16);
                    var55 += this.field3166;
                    var47 += var10;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg4 << 16;
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
            if (var10 <= var9) {
                int var59 = arg2 - arg6;
                int var60 = arg6 - arg3;
                int var61 = this.field3166 * arg3;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class569.method3153(0, var61, this.field3160, var57 >> 16, arg5 + 1351019171, var58 >> 16);
                            var57 += var9;
                            var58 += var8;
                            var61 += this.field3166;
                        }
                    }
                    class569.method3153(0, var61, this.field3160, var57 >> 16, arg5 + 1351019179, var56 >> 16);
                    var61 += this.field3166;
                    var57 += var9;
                    var56 += var10;
                }
            } else {
                int var62 = arg2 - arg6;
                int var63 = arg6 - arg3;
                int var64 = this.field3166 * arg3;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class569.method3153(0, var64, this.field3160, var58 >> 16, 125, var57 >> 16);
                            var58 += var8;
                            var64 += this.field3166;
                            var57 += var9;
                        }
                    }
                    class569.method3153(0, var64, this.field3160, var56 >> 16, arg5 ^ 0xAF7915BB, var57 >> 16);
                    var64 += this.field3166;
                    var57 += var9;
                    var56 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z[I[I)V", line = 457)
    public static final void method1482(boolean arg0, int[] arg1, int[] arg2) {
        field3167++;
        if (arg2 == null || arg1 == null) {
            class98.field1191 = null;
            class452.field5962 = null;
            class663.field9444 = null;
            return;
        }
        class452.field5962 = arg2;
        class663.field9444 = new int[arg2.length];
        class98.field1191 = new byte[arg2.length][][];
        if (!arg0) {
            for (int var3 = 0; var3 < class452.field5962.length; var3++) {
                class98.field1191[var3] = new byte[arg1[var3]][];
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V", line = 494)
    public static final void method1483(int arg0, int arg1, int arg2) {
        if (class649.field8968 != arg2) {
            class376.field4981 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class376.field4981[var3] = (var3 << 12) / arg2;
            }
            class649.field8968 = arg2;
            class29.field413 = arg2 - 1;
            class703.field9887 = arg2 * 32;
        }
        if (arg1 != 0) {
            return;
        }
        field3165++;
        if (class316.field4237 == arg0) {
            return;
        }
        if (class649.field8968 == arg0) {
            class686.field9697 = class376.field4981;
        } else {
            class686.field9697 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class686.field9697[var4] = (var4 << 12) / arg0;
            }
        }
        class316.field4237 = arg0;
        class326.field4386 = arg0 - 1;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IBI)Z", line = 545)
    public final boolean method1484(int arg0, byte arg1, int arg2) {
        field3162++;
        int var4 = -123 / ((arg1 - 13) / 48);
        return this.field3160.length >= (arg0 * arg2);
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(B)V", line = 556)
    public final void method1485(byte arg0) {
        if (arg0 != 90) {
            return;
        }
        field3159++;
        int var2 = -1;
        int var3 = this.field3160.length - 8;
        while (var3 > var2) {
            var2++;
            this.field3160[var2] = 0;
            var2++;
            this.field3160[var2] = 0;
            var2++;
            this.field3160[var2] = 0;
            var2++;
            this.field3160[var2] = 0;
            var2++;
            this.field3160[var2] = 0;
            var2++;
            this.field3160[var2] = 0;
            var2++;
            this.field3160[var2] = 0;
            var2++;
            this.field3160[var2] = 0;
        }
        while ((this.field3160.length - 1) > var2) {
            var2++;
            this.field3160[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIBII)V", line = 592)
    public final void method1486(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            this.method1486(-93, -116, (byte) -119, -38, 116);
        }
        this.field3169 = arg0 - arg3;
        field3171++;
        this.field3170 = arg3;
        this.field3166 = arg1 - arg4;
        this.field3163 = arg4;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lqq;II)V", line = 612)
    public class239(class651 arg0, int arg1, int arg2) {
        this.field3160 = new byte[arg1 * arg2];
    }
}
