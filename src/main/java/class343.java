import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class343 extends class483 {

    @OriginalMember(owner = "client!qba", name = "E", descriptor = "[B")
    public byte[] field4413;

    @OriginalMember(owner = "client!qba", name = "B", descriptor = "Lrg;")
    public static class548 field4410 = new class548(70, 2);

    @OriginalMember(owner = "client!qba", name = "N", descriptor = "Lpt;")
    public static class451 field4422 = new class451(16);

    @OriginalMember(owner = "client!qba", name = "Q", descriptor = "[[Z")
    public static boolean[][] field4425 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!qba", name = "z", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!qba", name = "A", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!qba", name = "C", descriptor = "I")
    public int field4411;

    @OriginalMember(owner = "client!qba", name = "D", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!qba", name = "F", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!qba", name = "G", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!qba", name = "I", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!qba", name = "J", descriptor = "I")
    public int field4418;

    @OriginalMember(owner = "client!qba", name = "K", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!qba", name = "L", descriptor = "I")
    public int field4420;

    @OriginalMember(owner = "client!qba", name = "M", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!qba", name = "O", descriptor = "I")
    public int field4423;

    @OriginalMember(owner = "client!qba", name = "P", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!qba", name = "R", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!qba", name = "H", descriptor = "[I")
    public static int[] field4416;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIII)V")
    public static final void method1910(int arg0, int arg1, int arg2, int arg3) {
        field4421++;
        int var4 = class632.field9113 + arg2;
        int var5 = arg0 + class119.field1504;
        if (class383.field5070 == null || arg2 < 0 || arg0 < 0 || class106.field1289 <= arg2 || class422.field5452 <= arg0) {
            return;
        }
        long var6 = (long) (arg3 << 28 | var5 << 14 | var4);
        class36 var8 = (class36) class150.field1787.method2645(var6, (byte) -113);
        if (var8 == null) {
            class479.method2795(arg3, arg2, arg0);
            return;
        }
        class197 var9 = (class197) var8.field280.method1050((byte) 73);
        if (var9 == null) {
            class479.method2795(arg3, arg2, arg0);
            return;
        }
        class117 var10 = (class117) class479.method2795(arg3, arg2, arg0);
        if (var10 == null) {
            var10 = new class117();
        } else {
            var10.field1462 = var10.field1468 = -1;
        }
        var10.field1463 = var9.field2384;
        var10.field1461 = var9.field2386;
        label51: while (true) {
            class197 var11 = (class197) var8.field280.method1047(-7962);
            if (var11 == null) {
                break;
            }
            if (var10.field1461 != var11.field2386) {
                var10.field1462 = var11.field2386;
                var10.field1472 = var11.field2384;
                while (true) {
                    class197 var12 = (class197) var8.field280.method1047(-7962);
                    if (var12 == null) {
                        break label51;
                    }
                    if (var10.field1461 != var12.field2386 && var10.field1462 != var12.field2386) {
                        var10.field1468 = var12.field2386;
                        var10.field1464 = var12.field2384;
                    }
                }
            }
        }
        if (arg1 != -10724) {
            method1913((byte) 89);
        }
        int var13 = class426.method2400(-1, (arg0 << 7) + 64, (arg2 << 7) + 64, arg3);
        class164.method894(arg3, arg2, arg0, var13, var10);
    }

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "(I)V")
    public static void method1911(int arg0) {
        if (arg0 != -1) {
            method1910(94, 81, -54, -70);
        }
        field4422 = null;
        field4425 = null;
        field4416 = null;
        field4410 = null;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Z)V")
    public final void method1912(boolean arg0) {
        field4417++;
        if (arg0) {
            field4426 = 23;
        }
        int var2 = -1;
        int var3 = this.field4413.length - 8;
        while (var2 < var3) {
            var2++;
            this.field4413[var2] = 0;
            var2++;
            this.field4413[var2] = 0;
            var2++;
            this.field4413[var2] = 0;
            var2++;
            this.field4413[var2] = 0;
            var2++;
            this.field4413[var2] = 0;
            var2++;
            this.field4413[var2] = 0;
            var2++;
            this.field4413[var2] = 0;
            var2++;
            this.field4413[var2] = 0;
        }
        while (this.field4413.length - 1 > var2) {
            var2++;
            this.field4413[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!qba", name = "e", descriptor = "(B)V")
    public static final void method1913(byte arg0) {
        if (arg0 >= -29) {
            field4425 = null;
        }
        field4419++;
        int var1 = class370.field4878;
        int[] var2 = class519.field7302;
        for (int var3 = 0; var3 < var1; var3++) {
            class545 var4 = class459.field6329[var2[var3]];
            if (var4 != null) {
                class66.method373(var4.method2694(28146), 0, var4);
            }
        }
    }

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "(III)Z")
    public final boolean method1914(int arg0, int arg1, int arg2) {
        if (arg1 != 17703) {
            this.field4418 = 127;
        }
        field4409++;
        return arg0 * arg2 <= this.field4413.length;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIIIIII)V")
    public final void method1915(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4412++;
        int var8 = 0;
        if (arg0 != arg4) {
            var8 = (arg5 - arg2 << 16) / (arg0 - arg4);
        }
        int var9 = 0;
        if (arg0 != arg1) {
            var9 = (arg3 - arg5 << 16) / (arg1 - arg0);
        }
        int var10 = arg6;
        if (arg1 != arg4) {
            var10 = (arg2 - arg3 << 16) / (arg4 - arg1);
        }
        if (arg0 >= arg4 && arg1 >= arg4) {
            if (arg1 <= arg0) {
                int var11;
                int var12 = var11 = arg2 << 16;
                if (arg4 < 0) {
                    var12 -= arg4 * var10;
                    var11 -= arg4 * var8;
                    arg4 = 0;
                }
                int var13 = arg3 << 16;
                if (arg1 < 0) {
                    var13 -= arg1 * var9;
                    arg1 = 0;
                }
                if ((arg1 == arg4 || var8 <= var10) && (arg1 != arg4 || var9 <= var8)) {
                    int var17 = arg0 - arg1;
                    int var18 = arg1 - arg4;
                    int var19 = this.field4418 * arg4;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class88.method520(var19, var11 >> 16, 0, false, this.field4413, var13 >> 16);
                                var19 += this.field4418;
                                var11 += var8;
                                var13 += var9;
                            }
                        }
                        class88.method520(var19, var11 >> 16, 0, false, this.field4413, var12 >> 16);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field4418;
                    }
                } else {
                    int var14 = arg0 - arg1;
                    int var15 = arg1 - arg4;
                    int var16 = this.field4418 * arg4;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class88.method520(var16, var13 >> 16, 0, false, this.field4413, var11 >> 16);
                                var13 += var9;
                                var16 += this.field4418;
                                var11 += var8;
                            }
                        }
                        class88.method520(var16, var12 >> 16, 0, false, this.field4413, var11 >> 16);
                        var12 += var10;
                        var16 += this.field4418;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg2 << 16;
                int var22 = arg5 << 16;
                if (arg4 < 0) {
                    var20 -= arg4 * var8;
                    var21 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg0 < 0) {
                    var22 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg4 && var10 < var8 || arg0 == arg4 && var10 > var9) {
                    int var23 = arg1 - arg0;
                    int var24 = arg0 - arg4;
                    int var25 = this.field4418 * arg4;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class88.method520(var25, var21 >> 16, 0, false, this.field4413, var22 >> 16);
                                var22 += var9;
                                var25 += this.field4418;
                                var21 += var10;
                            }
                        }
                        class88.method520(var25, var21 >> 16, 0, false, this.field4413, var20 >> 16);
                        var20 += var8;
                        var25 += this.field4418;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg1 - arg0;
                    int var27 = arg0 - arg4;
                    int var28 = this.field4418 * arg4;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class88.method520(var28, var22 >> 16, 0, false, this.field4413, var21 >> 16);
                                var28 += this.field4418;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class88.method520(var28, var20 >> 16, 0, false, this.field4413, var21 >> 16);
                        var20 += var8;
                        var28 += this.field4418;
                        var21 += var10;
                    }
                }
            }
        } else if (arg1 >= arg0) {
            if (arg1 < arg4) {
                int var29;
                int var30 = var29 = arg5 << 16;
                int var31 = arg3 << 16;
                if (arg0 < 0) {
                    var29 -= arg0 * var9;
                    var30 -= arg0 * var8;
                    arg0 = 0;
                }
                if (arg1 < 0) {
                    var31 -= arg1 * var10;
                    arg1 = 0;
                }
                if (arg0 != arg1 && var8 < var9 || arg0 == arg1 && var10 < var8) {
                    int var32 = arg4 - arg1;
                    int var33 = arg1 - arg0;
                    int var34 = this.field4418 * arg0;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class88.method520(var34, var30 >> 16, 0, false, this.field4413, var31 >> 16);
                                var31 += var10;
                                var34 += this.field4418;
                                var30 += var8;
                            }
                        }
                        class88.method520(var34, var30 >> 16, 0, false, this.field4413, var29 >> 16);
                        var34 += this.field4418;
                        var29 += var9;
                        var30 += var8;
                    }
                } else {
                    int var35 = arg4 - arg1;
                    int var36 = arg1 - arg0;
                    int var37 = this.field4418 * arg0;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class88.method520(var37, var31 >> 16, 0, false, this.field4413, var30 >> 16);
                                var37 += this.field4418;
                                var30 += var8;
                                var31 += var10;
                            }
                        }
                        class88.method520(var37, var29 >> 16, 0, false, this.field4413, var30 >> 16);
                        var29 += var9;
                        var37 += this.field4418;
                        var30 += var8;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg5 << 16;
                if (arg0 < 0) {
                    var38 -= arg0 * var9;
                    var39 -= arg0 * var8;
                    arg0 = 0;
                }
                int var40 = arg2 << 16;
                if (arg4 < 0) {
                    var40 -= arg4 * var10;
                    arg4 = 0;
                }
                if (var9 <= var8) {
                    int var41 = arg1 - arg4;
                    int var42 = arg4 - arg0;
                    int var43 = this.field4418 * arg0;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class88.method520(var43, var38 >> 16, 0, false, this.field4413, var40 >> 16);
                                var43 += this.field4418;
                                var38 += var9;
                                var40 += var10;
                            }
                        }
                        class88.method520(var43, var38 >> 16, 0, false, this.field4413, var39 >> 16);
                        var43 += this.field4418;
                        var39 += var8;
                        var38 += var9;
                    }
                } else {
                    int var44 = arg1 - arg4;
                    int var45 = arg4 - arg0;
                    int var46 = this.field4418 * arg0;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class88.method520(var46, var40 >> 16, 0, false, this.field4413, var38 >> 16);
                                var40 += var10;
                                var38 += var9;
                                var46 += this.field4418;
                            }
                        }
                        class88.method520(var46, var39 >> 16, 0, false, this.field4413, var38 >> 16);
                        var39 += var8;
                        var46 += this.field4418;
                        var38 += var9;
                    }
                }
            }
        } else if (arg0 > arg4) {
            int var47;
            int var48 = var47 = arg3 << 16;
            if (arg1 < 0) {
                var47 -= arg1 * var10;
                var48 -= arg1 * var9;
                arg1 = 0;
            }
            int var49 = arg2 << 16;
            if (arg4 < 0) {
                var49 -= arg4 * var8;
                arg4 = 0;
            }
            if (var9 < var10) {
                int var50 = arg0 - arg4;
                int var51 = arg4 - arg1;
                int var52 = this.field4418 * arg1;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class88.method520(var52, var48 >> 16, 0, false, this.field4413, var49 >> 16);
                            var52 += this.field4418;
                            var48 += var9;
                            var49 += var8;
                        }
                    }
                    class88.method520(var52, var48 >> 16, 0, false, this.field4413, var47 >> 16);
                    var48 += var9;
                    var47 += var10;
                    var52 += this.field4418;
                }
            } else {
                int var53 = arg0 - arg4;
                int var54 = arg4 - arg1;
                int var55 = this.field4418 * arg1;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class88.method520(var55, var49 >> 16, 0, false, this.field4413, var48 >> 16);
                            var48 += var9;
                            var49 += var8;
                            var55 += this.field4418;
                        }
                    }
                    class88.method520(var55, var47 >> 16, 0, false, this.field4413, var48 >> 16);
                    var48 += var9;
                    var47 += var10;
                    var55 += this.field4418;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg3 << 16;
            if (arg1 < 0) {
                var56 -= arg1 * var10;
                var57 -= arg1 * var9;
                arg1 = 0;
            }
            int var58 = arg5 << 16;
            if (arg0 < 0) {
                var58 -= arg0 * var8;
                arg0 = 0;
            }
            if (var10 > var9) {
                int var59 = arg4 - arg0;
                int var60 = arg0 - arg1;
                int var61 = this.field4418 * arg1;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class88.method520(var61, var58 >> 16, 0, false, this.field4413, var56 >> 16);
                            var56 += var10;
                            var61 += this.field4418;
                            var58 += var8;
                        }
                    }
                    class88.method520(var61, var57 >> 16, 0, false, this.field4413, var56 >> 16);
                    var61 += this.field4418;
                    var56 += var10;
                    var57 += var9;
                }
            } else {
                int var62 = arg4 - arg0;
                int var63 = arg0 - arg1;
                int var64 = this.field4418 * arg1;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class88.method520(var64, var56 >> 16, 0, false, this.field4413, var58 >> 16);
                            var64 += this.field4418;
                            var56 += var10;
                            var58 += var8;
                        }
                    }
                    class88.method520(var64, var56 >> 16, 0, false, this.field4413, var57 >> 16);
                    var64 += this.field4418;
                    var57 += var9;
                    var56 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "(III)Z")
    public static final boolean method1916(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            field4415++;
            return class307.method1698((byte) -128, arg2, arg1) | (arg1 & 0x70000) != 0 || class383.method2215(arg1, 64, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIIII)V")
    public final void method1917(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4414++;
        this.field4420 = arg0;
        this.field4423 = arg1;
        this.field4411 = arg3 - arg1;
        this.field4418 = arg4 - arg0;
        if (arg2 != 0) {
            this.field4423 = -52;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lmca;ZIBZILmca;)I")
    public static final int method1918(class29 arg0, boolean arg1, int arg2, byte arg3, boolean arg4, int arg5, class29 arg6) {
        field4408++;
        if (arg3 != 90) {
            method1913((byte) -98);
        }
        int var7 = class110.method640(-14653, arg5, arg4, arg0, arg6);
        if (var7 != 0) {
            return arg4 ? -var7 : var7;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var8 = class110.method640(arg3 ^ 0xFFFFC699, arg2, arg1, arg0, arg6);
            return arg1 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lmh;II)V")
    public class343(class537 arg0, int arg1, int arg2) {
        this.field4413 = new byte[arg1 * arg2];
    }
}
