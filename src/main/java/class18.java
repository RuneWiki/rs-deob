import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class18 extends class180 {

    @OriginalMember(owner = "client!l", name = "C", descriptor = "[B")
    public byte[] field273;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "Lgda;")
    public static class53 field279 = new class53(8, 2);

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "Lgda;")
    public static class53 field285 = new class53(52, 3);

    @OriginalMember(owner = "client!l", name = "O", descriptor = "F")
    public static float field283;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public int field271;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    public int field277;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "I")
    public int field282;

    @OriginalMember(owner = "client!l", name = "P", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IBI)Z")
    public static final boolean method107(int arg0, byte arg1, int arg2) {
        field280++;
        int var3 = 37 % ((arg1 - 32) / 61);
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIBII)V")
    public final void method108(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field281++;
        if (arg4 != -34) {
            return;
        }
        int var8 = 0;
        if (arg3 != arg5) {
            var8 = (arg2 - arg1 << 16) / (arg5 - arg3);
        }
        int var9 = 0;
        if (arg5 != arg6) {
            var9 = (arg0 - arg2 << 16) / (arg6 - arg5);
        }
        int var10 = 0;
        if (arg3 != arg6) {
            var10 = (arg1 - arg0 << 16) / (arg3 - arg6);
        }
        if (arg5 >= arg3 && arg6 >= arg3) {
            if (arg6 > arg5) {
                int var11;
                int var12 = var11 = arg1 << 16;
                int var13 = arg2 << 16;
                if (arg3 < 0) {
                    var12 -= arg3 * var10;
                    var11 -= arg3 * var8;
                    arg3 = 0;
                }
                if (arg5 < 0) {
                    var13 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg3 != arg5 && var10 < var8 || arg3 == arg5 && var9 < var10) {
                    int var14 = arg6 - arg5;
                    int var15 = arg5 - arg3;
                    int var16 = this.field275 * arg3;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class76.method605(0, var16, var12 >> 16, (byte) 110, var13 >> 16, this.field273);
                                var16 += this.field275;
                                var13 += var9;
                                var12 += var10;
                            }
                        }
                        class76.method605(0, var16, var12 >> 16, (byte) 91, var11 >> 16, this.field273);
                        var12 += var10;
                        var16 += this.field275;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg6 - arg5;
                    int var18 = arg5 - arg3;
                    int var19 = this.field275 * arg3;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class76.method605(0, var19, var13 >> 16, (byte) 80, var12 >> 16, this.field273);
                                var19 += this.field275;
                                var13 += var9;
                                var12 += var10;
                            }
                        }
                        class76.method605(0, var19, var11 >> 16, (byte) 61, var12 >> 16, this.field273);
                        var11 += var8;
                        var19 += this.field275;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg1 << 16;
                int var22 = arg0 << 16;
                if (arg3 < 0) {
                    var21 -= arg3 * var10;
                    var20 -= arg3 * var8;
                    arg3 = 0;
                }
                if (arg6 < 0) {
                    var22 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg3 != arg6 && var10 < var8 || arg3 == arg6 && var9 > var8) {
                    int var23 = arg5 - arg6;
                    int var24 = arg6 - arg3;
                    int var25 = this.field275 * arg3;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class76.method605(0, var25, var22 >> 16, (byte) 58, var20 >> 16, this.field273);
                                var25 += this.field275;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        class76.method605(0, var25, var21 >> 16, (byte) 108, var20 >> 16, this.field273);
                        var21 += var10;
                        var25 += this.field275;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg5 - arg6;
                    int var27 = arg6 - arg3;
                    int var28 = this.field275 * arg3;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class76.method605(0, var28, var20 >> 16, (byte) 93, var22 >> 16, this.field273);
                                var28 += this.field275;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        class76.method605(0, var28, var20 >> 16, (byte) 92, var21 >> 16, this.field273);
                        var21 += var10;
                        var28 += this.field275;
                        var20 += var8;
                    }
                }
            }
        } else if (arg6 < arg5) {
            if (arg5 <= arg3) {
                int var29;
                int var30 = var29 = arg0 << 16;
                int var31 = arg2 << 16;
                if (arg6 < 0) {
                    var30 -= arg6 * var9;
                    var29 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg5 < 0) {
                    var31 -= arg5 * var8;
                    arg5 = 0;
                }
                if (var9 < var10) {
                    int var32 = arg3 - arg5;
                    int var33 = arg5 - arg6;
                    int var34 = this.field275 * arg6;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class76.method605(0, var34, var31 >> 16, (byte) 44, var29 >> 16, this.field273);
                                var34 += this.field275;
                                var31 += var8;
                                var29 += var10;
                            }
                        }
                        class76.method605(0, var34, var30 >> 16, (byte) 107, var29 >> 16, this.field273);
                        var30 += var9;
                        var34 += this.field275;
                        var29 += var10;
                    }
                } else {
                    int var35 = arg3 - arg5;
                    int var36 = arg5 - arg6;
                    int var37 = this.field275 * arg6;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class76.method605(0, var37, var29 >> 16, (byte) 27, var31 >> 16, this.field273);
                                var37 += this.field275;
                                var31 += var8;
                                var29 += var10;
                            }
                        }
                        class76.method605(0, var37, var29 >> 16, (byte) 39, var30 >> 16, this.field273);
                        var29 += var10;
                        var37 += this.field275;
                        var30 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg0 << 16;
                if (arg6 < 0) {
                    var38 -= arg6 * var10;
                    var39 -= arg6 * var9;
                    arg6 = 0;
                }
                int var40 = arg1 << 16;
                if (arg3 < 0) {
                    var40 -= arg3 * var8;
                    arg3 = 0;
                }
                if (var10 <= var9) {
                    int var41 = arg5 - arg3;
                    int var42 = arg3 - arg6;
                    int var43 = this.field275 * arg6;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class76.method605(0, var43, var40 >> 16, (byte) 53, var39 >> 16, this.field273);
                                var39 += var9;
                                var40 += var8;
                                var43 += this.field275;
                            }
                        }
                        class76.method605(0, var43, var38 >> 16, (byte) 91, var39 >> 16, this.field273);
                        var39 += var9;
                        var38 += var10;
                        var43 += this.field275;
                    }
                } else {
                    int var44 = arg5 - arg3;
                    int var45 = arg3 - arg6;
                    int var46 = this.field275 * arg6;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class76.method605(0, var46, var39 >> 16, (byte) 99, var40 >> 16, this.field273);
                                var40 += var8;
                                var39 += var9;
                                var46 += this.field275;
                            }
                        }
                        class76.method605(0, var46, var39 >> 16, (byte) 121, var38 >> 16, this.field273);
                        var39 += var9;
                        var46 += this.field275;
                        var38 += var10;
                    }
                }
            }
        } else if (arg6 < arg3) {
            int var47;
            int var48 = var47 = arg2 << 16;
            if (arg5 < 0) {
                var47 -= arg5 * var9;
                var48 -= arg5 * var8;
                arg5 = 0;
            }
            int var49 = arg0 << 16;
            if (arg6 < 0) {
                var49 -= arg6 * var10;
                arg6 = 0;
            }
            if (arg5 != arg6 && var8 < var9 || arg5 == arg6 && var10 < var8) {
                int var50 = arg3 - arg6;
                int var51 = arg6 - arg5;
                int var52 = this.field275 * arg5;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class76.method605(0, var52, var48 >> 16, (byte) 100, var49 >> 16, this.field273);
                            var49 += var10;
                            var48 += var8;
                            var52 += this.field275;
                        }
                    }
                    class76.method605(0, var52, var48 >> 16, (byte) 53, var47 >> 16, this.field273);
                    var48 += var8;
                    var47 += var9;
                    var52 += this.field275;
                }
            } else {
                int var53 = arg3 - arg6;
                int var54 = arg6 - arg5;
                int var55 = this.field275 * arg5;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class76.method605(0, var55, var49 >> 16, (byte) 23, var48 >> 16, this.field273);
                            var55 += this.field275;
                            var49 += var10;
                            var48 += var8;
                        }
                    }
                    class76.method605(0, var55, var47 >> 16, (byte) 68, var48 >> 16, this.field273);
                    var55 += this.field275;
                    var48 += var8;
                    var47 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg2 << 16;
            if (arg5 < 0) {
                var57 -= arg5 * var8;
                var56 -= arg5 * var9;
                arg5 = 0;
            }
            int var58 = arg1 << 16;
            if (arg3 < 0) {
                var58 -= arg3 * var10;
                arg3 = 0;
            }
            if (var9 <= var8) {
                int var59 = arg6 - arg3;
                int var60 = arg3 - arg5;
                int var61 = this.field275 * arg5;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class76.method605(0, var61, var56 >> 16, (byte) 83, var58 >> 16, this.field273);
                            var61 += this.field275;
                            var58 += var10;
                            var56 += var9;
                        }
                    }
                    class76.method605(0, var61, var56 >> 16, (byte) 77, var57 >> 16, this.field273);
                    var56 += var9;
                    var57 += var8;
                    var61 += this.field275;
                }
            } else {
                int var62 = arg6 - arg3;
                int var63 = arg3 - arg5;
                int var64 = this.field275 * arg5;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class76.method605(0, var64, var58 >> 16, (byte) 85, var56 >> 16, this.field273);
                            var56 += var9;
                            var64 += this.field275;
                            var58 += var10;
                        }
                    }
                    class76.method605(0, var64, var57 >> 16, (byte) 127, var56 >> 16, this.field273);
                    var57 += var8;
                    var64 += this.field275;
                    var56 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BII)Z")
    public static final boolean method109(byte arg0, int arg1, int arg2) {
        if (arg0 == -36) {
            field278++;
            return class399.method2493(arg1, arg0 ^ 0x7BC1690, arg2) | (arg2 & 0x70000) != 0 || class757.method4207((byte) 108, arg1, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(B)V")
    public final void method110(byte arg0) {
        field284++;
        int var2 = -1;
        if (arg0 < 52) {
            return;
        }
        int var3 = this.field273.length - 8;
        while (var3 > var2) {
            var2++;
            this.field273[var2] = 0;
            var2++;
            this.field273[var2] = 0;
            var2++;
            this.field273[var2] = 0;
            var2++;
            this.field273[var2] = 0;
            var2++;
            this.field273[var2] = 0;
            var2++;
            this.field273[var2] = 0;
            var2++;
            this.field273[var2] = 0;
            var2++;
            this.field273[var2] = 0;
        }
        while ((this.field273.length - 1) > var2) {
            var2++;
            this.field273[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIII)V")
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field275 = arg1 - arg4;
        if (arg3 != -18678) {
            this.field271 = -109;
        }
        field276++;
        this.field282 = arg4;
        this.field271 = arg0;
        this.field277 = arg2 - arg0;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(III)Z")
    public final boolean method112(int arg0, int arg1, int arg2) {
        if (arg0 != 27928) {
            method114(-46);
        }
        field274++;
        return this.field273.length >= (arg1 * arg2);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Z")
    public static final boolean method113(int arg0, int arg1) {
        if (arg0 != -3) {
            method109((byte) 80, 3, 31);
        }
        field272++;
        return arg1 == 0 || arg1 == 2;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
    public static void method114(int arg0) {
        field285 = null;
        if (arg0 != -1) {
            field285 = null;
        }
        field279 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lkba;IIIII)V")
    public static final void method115(class105 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class634.field8744 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class492.field6939) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class365.field5171 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class165 var14 = class553.field7776[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class459.field6474[var11].method1816((byte) -82, var13, var12) + class459.field6474[var11].method1816((byte) 121, var13, var12 + 1) + class459.field6474[var11].method1816((byte) 23, var13 + 1, var12) + class459.field6474[var11].method1816((byte) -127, var13 + 1, var12 + 1)) / 4 - (class459.field6474[arg1].method1816((byte) 54, arg3, arg2) + class459.field6474[arg1].method1816((byte) 126, arg3, arg2 + 1) + class459.field6474[arg1].method1816((byte) 124, arg3 + 1, arg2) + class459.field6474[arg1].method1816((byte) -61, arg3 + 1, arg2 + 1)) / 4;
                                    class444 var16 = var14.field2269;
                                    class444 var17 = var14.field2265;
                                    if (var16 != null && var16.method621(-105)) {
                                        arg0.method615(var6, class362.field5135, var15, (var13 - arg3) * class586.field8250 + (1 - arg5) * class197.field2617, var16, 22501, (var12 - arg2) * class586.field8250 + (1 - arg4) * class197.field2617);
                                    }
                                    if (var17 != null && var17.method621(-115)) {
                                        arg0.method615(var6, class362.field5135, var15, (var13 - arg3) * class586.field8250 + (1 - arg5) * class197.field2617, var17, 22501, (var12 - arg2) * class586.field8250 + (1 - arg4) * class197.field2617);
                                    }
                                    for (class356 var18 = var14.field2270; var18 != null; var18 = var18.field5066) {
                                        class524 var19 = var18.field5067;
                                        if (var19 != null && var19.method621(-107) && (var19.field7415 == var12 || var7 == var12) && (var19.field7418 == var13 || var9 == var13)) {
                                            int var20 = var19.field7413 + 1 - var19.field7415;
                                            int var21 = var19.field7409 + 1 - var19.field7418;
                                            arg0.method615(var6, class362.field5135, var15, (var19.field7418 - arg3) * class586.field8250 + (var21 - arg5) * class197.field2617, var19, 22501, (var19.field7415 - arg2) * class586.field8250 + (var20 - arg4) * class197.field2617);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lsr;II)V")
    public class18(class251 arg0, int arg1, int arg2) {
        this.field273 = new byte[arg1 * arg2];
    }
}
