import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class307 extends class273 {

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public int field5277;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public int field5271;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "[I")
    public int[] field5270;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "[Z")
    public boolean[] field5276;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "[[I")
    public int[][] field5269;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "[I")
    public int[] field5274;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "[I")
    public static int[] field5275 = new int[2];

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "Lwm;")
    public static class152 field5279 = class157.method1048("<)4col>", 109);

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lah;BII)Ldc;", line = 6)
    public static final class109 method2137(class205 arg0, byte arg1, int arg2, int arg3) {
        field5272++;
        if (class86.method566(arg2, arg0, arg3, 1)) {
            if (arg1 > -35) {
                method2141(13);
            }
            return class106.method708(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIZ[Luf;II[B)V", line = 39)
    public static final void method2138(int arg0, int arg1, int arg2, boolean arg3, class22[] arg4, int arg5, int arg6, byte[] arg7) {
        if (!arg3) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if ((arg5 + var9) > 0 && arg5 + var9 < 103 && arg1 + var10 > 0 && (arg1 + var10) < 103) {
                            arg4[var8].field384[arg5 + var9][arg1 + var10] = class34.method251(arg4[var8].field384[arg5 + var9][arg1 + var10], -16777217);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg3) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        field5278++;
        if (arg6 <= 111) {
            field5275 = (int[]) null;
        }
        class291 var12 = new class291(arg7);
        for (int var13 = 0; var13 < var11; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class277.method1893(arg0, arg2, arg5 + var14, var12, var13, -54, arg3, 0, arg1 + var15);
                }
            }
        }
        boolean var16 = false;
        while (var12.field4946 < var12.field4950.length) {
            int var17 = var12.method2011(-102);
            if (var17 != 129) {
                var12.field4946--;
                break;
            }
            var16 = true;
            for (int var18 = 0; var18 < 4; var18++) {
                byte var19 = var12.method1962(false);
                if (var19 == 0) {
                    int var29 = arg5;
                    if (arg5 < 0) {
                        var29 = 0;
                    } else if (arg5 >= 104) {
                        var29 = 104;
                    }
                    int var30 = arg5 + 64;
                    if (var30 < 0) {
                        var30 = 0;
                    } else if (var30 >= 104) {
                        var30 = 104;
                    }
                    int var31 = arg1;
                    if (arg1 < 0) {
                        var31 = 0;
                    } else if (arg1 >= 104) {
                        var31 = 104;
                    }
                    int var32 = arg1 + 64;
                    if (var32 < 0) {
                        var32 = 0;
                    } else if (var32 >= 104) {
                        var32 = 104;
                    }
                    while (var30 > var29) {
                        while (var31 < var32) {
                            class97.field1401[var18][var29][var31] = 0;
                            var31++;
                        }
                        var29++;
                    }
                } else if (var19 == 1) {
                    for (int var20 = 0; var20 < 64; var20 += 4) {
                        for (int var21 = 0; var21 < 64; var21 += 4) {
                            byte var22 = var12.method1962(false);
                            for (int var23 = arg5 + var20; var23 < var20 - (-arg5 - 4); var23++) {
                                for (int var24 = arg1 + var21; var24 < (var21 + arg1 + 4); var24++) {
                                    if (var23 >= 0 && var23 < 104 && var24 >= 0 && var24 < 104) {
                                        class97.field1401[var18][var23][var24] = var22;
                                    }
                                }
                            }
                        }
                    }
                } else if (var19 == 2 && var18 > 0) {
                    int var25 = arg5;
                    if (arg5 < 0) {
                        var25 = 0;
                    } else if (arg5 >= 104) {
                        var25 = 104;
                    }
                    int var26 = arg1;
                    if (arg1 < 0) {
                        var26 = 0;
                    } else if (arg1 >= 104) {
                        var26 = 104;
                    }
                    int var27 = arg5 + 64;
                    int var28 = arg1 + 64;
                    if (var28 < 0) {
                        var28 = 0;
                    } else if (var28 >= 104) {
                        var28 = 104;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    } else if (var27 >= 104) {
                        var27 = 104;
                    }
                    while (var25 < var27) {
                        while (var26 < var28) {
                            class97.field1401[var18][var25][var26] = class97.field1401[var18 - 1][var25][var26];
                            var26++;
                        }
                        var25++;
                    }
                }
            }
        }
        if (class217.field3516 && !arg3) {
            class174 var33 = null;
            while (true) {
                while (var12.field4950.length > var12.field4946) {
                    int var34 = var12.method2011(-108);
                    if (var34 == 0) {
                        var33 = new class174(var12);
                    } else if (var34 == 1) {
                        int var35 = var12.method2011(-65);
                        if (var35 > 0) {
                            for (int var36 = 0; var36 < var35; var36++) {
                                class54 var37 = new class54(var12);
                                if (var37.field833 == 31) {
                                    class234 var38 = class191.method1266(var12.method2021((byte) 74), 2);
                                    var37.method358(var38.field3841, var38.field3830, var38.field3836, var38.field3829, (byte) 84);
                                }
                                var37.field838 += arg5 << 7;
                                var37.field848 += arg1 << 7;
                                int var39 = var37.field848 >> 7;
                                int var40 = var37.field838 >> 7;
                                if (var40 >= 0 && var39 >= 0 && var40 < 104 && var39 < 104) {
                                    var37.field830 = (class70.field1026[1][var40][var39] & 0x2) != 0;
                                    var37.field849 = class65.field984[var37.field837][var40][var39] - var37.field849;
                                    class24.method214(var37);
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var33 == null) {
                    var33 = new class174();
                }
                for (int var41 = 0; var41 < 8; var41++) {
                    for (int var42 = 0; var42 < 8; var42++) {
                        int var43 = (arg5 >> 3) + var41;
                        int var44 = (arg1 >> 3) + var42;
                        if (var43 >= 0 && var43 < 13 && var44 >= 0 && var44 < 13) {
                            class131.field1994[var43][var44] = var33;
                        }
                    }
                }
                break;
            }
        }
        if (var16) {
            return;
        }
        for (int var45 = 0; var45 < 4; var45++) {
            for (int var46 = 0; var46 < 16; var46++) {
                for (int var47 = 0; var47 < 16; var47++) {
                    int var48 = (arg5 >> 2) + var46;
                    int var49 = (arg1 >> 2) + var47;
                    if (var48 >= 0 && var48 < 26 && var49 >= 0 && var49 < 26) {
                        class97.field1401[var45][var48][var49] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZLhg;IIII)V", line = 431)
    public static final void method2139(boolean arg0, class172 arg1, int arg2, int arg3, int arg4, int arg5) {
        field5281++;
        if (arg1.field2729 == -1 && arg1.field2737 == null) {
            return;
        }
        int var6 = 0;
        if (arg4 > arg1.field2728) {
            var6 += arg4 - arg1.field2728;
        } else if (arg4 < arg1.field2730) {
            var6 += arg1.field2730 - arg4;
        }
        if (arg5 > arg1.field2734) {
            var6 += arg5 - arg1.field2734;
        } else if (arg5 < arg1.field2735) {
            var6 += arg1.field2735 - arg5;
        }
        if (arg1.field2731 == 0 || arg1.field2731 < (var6 - 64) || class72.field1048 == 0 || arg1.field2755 != arg3) {
            if (arg1.field2746 != null) {
                class290.field4916.method1495(arg1.field2746);
                arg1.field2746 = null;
            }
            if (arg1.field2750 != null) {
                class290.field4916.method1495(arg1.field2750);
                arg1.field2750 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg1.field2731 - var6) * class72.field1048 / arg1.field2731;
        if (arg0) {
            method2141(23);
        }
        if (arg1.field2746 != null) {
            arg1.field2746.method471(var7);
        } else if (arg1.field2729 >= 0) {
            class144 var8 = class144.method905(class256.field4407, arg1.field2729, 0);
            if (var8 != null) {
                class292 var9 = var8.method906().method2022(class93.field1326);
                class71 var10 = class71.method451(var9, 100, var7);
                var10.method453(-1);
                class290.field4916.method1491(var10);
                arg1.field2746 = var10;
            }
        }
        if (arg1.field2750 != null) {
            arg1.field2750.method471(var7);
            if (!arg1.field2750.method1879((byte) -3)) {
                arg1.field2750 = null;
            }
        } else if (arg1.field2737 != null && (arg1.field2748 -= arg2) <= 0) {
            int var11 = (int) (Math.random() * (double) arg1.field2737.length);
            class144 var12 = class144.method905(class256.field4407, arg1.field2737[var11], 0);
            if (var12 != null) {
                class292 var13 = var12.method906().method2022(class93.field1326);
                class71 var14 = class71.method451(var13, 100, var7);
                var14.method453(0);
                class290.field4916.method1491(var14);
                arg1.field2750 = var14;
                arg1.field2748 = arg1.field2740 + (int) (Math.random() * (double) (arg1.field2756 - arg1.field2740));
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(I[B)V", line = 558)
    public class307(int arg0, byte[] arg1) {
        this.field5277 = arg0;
        class291 var3 = new class291(arg1);
        this.field5271 = var3.method2011(-127);
        this.field5270 = new int[this.field5271];
        this.field5276 = new boolean[this.field5271];
        this.field5269 = new int[this.field5271][];
        this.field5274 = new int[this.field5271];
        for (int var4 = 0; var4 < this.field5271; var4++) {
            this.field5274[var4] = var3.method2011(-102);
        }
        for (int var5 = 0; var5 < this.field5271; var5++) {
            this.field5276[var5] = var3.method2011(-115) == 1;
        }
        for (int var6 = 0; var6 < this.field5271; var6++) {
            this.field5270[var6] = var3.method2021((byte) 74);
        }
        for (int var7 = 0; var7 < this.field5271; var7++) {
            this.field5269[var7] = new int[var3.method2011(-110)];
        }
        for (int var8 = 0; var8 < this.field5271; var8++) {
            for (int var9 = 0; var9 < this.field5269[var8].length; var9++) {
                this.field5269[var8][var9] = var3.method2011(-103);
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILah;Lah;)V", line = 619)
    public static final void method2140(int arg0, class205 arg1, class205 arg2) {
        class256.field4415 = arg1;
        class294.field5021 = arg2;
        class142.field2191 = class294.field5021.method1375(3, 0);
        field5280++;
        if (arg0 > -34) {
            method2137((class205) null, (byte) 82, -109, 80);
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V", line = 636)
    public static void method2141(int arg0) {
        field5275 = null;
        field5279 = null;
        if (arg0 != -64) {
            field5275 = (int[]) null;
        }
    }
}
