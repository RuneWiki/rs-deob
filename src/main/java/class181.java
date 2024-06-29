import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class181 {

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public int field2593 = -1;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "Lvo;")
    public static class32 field2590 = new class32("", 11);

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field2599 = 2;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    private int field2602;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "J")
    private long field2588;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "J")
    private long field2604;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "Lfb;")
    public static class485 field2596;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "Z")
    public boolean field2594;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "[I")
    private int[] field2598;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "[I")
    public int[] field2600;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "[[I")
    private int[][] field2601;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public static void method1124(int arg0) {
        field2590 = null;
        field2596 = null;
        if (arg0 != Integer.MIN_VALUE) {
            method1125(-14, 26, 116, 80);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIII)I")
    public static final int method1125(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 31290) {
            field2599 = 124;
        }
        field2603++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)V")
    public final void method1126(int arg0, int arg1, int arg2) {
        field2595++;
        this.field2600[arg2] = arg0;
        this.method1127(false);
        if (arg1 != 22242) {
            this.field2594 = true;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V")
    private final void method1127(boolean arg0) {
        field2606++;
        long[] var2 = class205.field2973;
        this.field2588 = -1L;
        this.field2588 = var2[(int) (((long) (this.field2602 >> 8) ^ this.field2588) & 0xFFL)] ^ this.field2588 >>> 8;
        this.field2588 = var2[(int) (((long) this.field2602 ^ this.field2588) & 0xFFL)] ^ this.field2588 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field2588 = var2[(int) (((long) (this.field2598[var3] >> 24) ^ this.field2588) & 0xFFL)] ^ this.field2588 >>> 8;
            this.field2588 = var2[(int) (((long) (this.field2598[var3] >> 16) ^ this.field2588) & 0xFFL)] ^ this.field2588 >>> 8;
            this.field2588 = var2[(int) (((long) (this.field2598[var3] >> 8) ^ this.field2588) & 0xFFL)] ^ this.field2588 >>> 8;
            this.field2588 = this.field2588 >>> 8 ^ var2[(int) ((this.field2588 ^ (long) this.field2598[var3]) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field2588 = var2[(int) ((this.field2588 ^ (long) this.field2600[var4]) & 0xFFL)] ^ this.field2588 >>> 8;
        }
        if (arg0) {
            field2590 = null;
        }
        this.field2588 = var2[(int) (((long) (this.field2594 ? 1 : 0) ^ this.field2588) & 0xFFL)] ^ this.field2588 >>> 8;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILrt;BILgn;Lpe;Lza;Leb;ILcf;ILvk;)Le;")
    public final class377 method1128(int arg0, class154 arg1, byte arg2, int arg3, class504 arg4, class441 arg5, class290 arg6, class449 arg7, int arg8, class437 arg9, int arg10, class252 arg11) {
        field2607++;
        if (this.field2593 != -1) {
            return arg5.method2580(this.field2593, -119).method1943(arg9, arg11, arg0, arg3, 105, arg10, arg8, arg7, arg6);
        }
        int var13 = arg0;
        if (arg7 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg0 | 0x20;
            Object var21 = null;
            int var22 = arg7.field6276[arg8];
            int var23 = var22 >>> 16;
            class454 var24 = arg9.method2572(var23, (byte) 75);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method2648(arg2 + 13772, var25);
                var14 |= var24.method2651(var25, arg2 - 1094206070);
                var17 |= var24.method2649(var25, arg2 ^ 0xC1);
                var16 |= arg7.field6260;
            }
            if ((arg7.field6270 || class26.field318) && arg3 != -1 && arg3 < arg7.field6276.length) {
                int var26 = arg7.field6276[arg3];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class454 var29 = var23 == var27 ? var24 : arg9.method2572(var27, (byte) 106);
                if (var29 != null) {
                    var15 |= var29.method2648(13834, var28);
                    var14 |= var29.method2651(var28, -1094206008);
                    var17 |= var29.method2649(var28, 255);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        if (arg2 != 62) {
            field2599 = -128;
        }
        class174 var30 = class66.field842;
        class377 var31;
        synchronized (class66.field842) {
            var31 = (class377) class66.field842.method1088(this.field2588, (byte) -119);
        }
        if (var31 == null || arg6.method324(var31.method1605(), var13) != 0) {
            if (var31 != null) {
                var13 = arg6.method302(var13, var31.method1605());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field2598[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg4.method3004(-1, var35 & 0x3FFFFFFF).method770((byte) -69)) {
                        var33 = true;
                    }
                } else if (!arg1.method993(var35 & 0x3FFFFFFF, true).method2298(this.field2594, (byte) -110)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class117[] var36 = new class117[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field2598[var38];
                if ((var39 & 0x40000000) != 0) {
                    class117 var40 = arg1.method993(var39 & 0x3FFFFFFF, true).method2296((byte) -105, this.field2594);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class117 var41 = arg4.method3004(-1, var39 & 0x3FFFFFFF).method763(-14);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class117 var43 = new class117(var36, var37);
            var31 = arg6.method293(var43, var42, class79.field1033, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (this.field2600[var44] < class426.field5988[var44].length) {
                    var31.method1570(class67.field851[var44], class426.field5988[var44][this.field2600[var44]]);
                }
                if (class80.field1041[var44].length > this.field2600[var44]) {
                    var31.method1570(class421.field5942[var44], class80.field1041[var44][this.field2600[var44]]);
                }
            }
            var31.method1606(var13);
            class174 var45 = class66.field842;
            synchronized (class66.field842) {
                class66.field842.method1097(19627, var31, this.field2588);
            }
        }
        if (arg7 == null) {
            return var31;
        } else {
            var31.method1590((byte) 4, var13, true);
            return arg7.method2626(arg10, arg3, var31, arg8, arg0, 1010306416);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZ)V")
    public final void method1129(int arg0, boolean arg1) {
        this.field2594 = arg1;
        field2597++;
        if (arg0 == -598237024) {
            this.method1127(false);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1130(boolean arg0, int arg1) {
        field2587++;
        if (arg0) {
            return true;
        } else {
            return arg1 == 3 || arg1 == 7 || arg1 == 10;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I[IZZ[II)V")
    public final void method1131(int arg0, int[] arg1, boolean arg2, boolean arg3, int[] arg4, int arg5) {
        this.field2594 = arg3;
        this.field2600 = arg1;
        if (!arg2) {
            field2608 = -28;
        }
        if (this.field2602 != arg5) {
            this.field2601 = null;
            this.field2602 = arg5;
        }
        field2605++;
        this.field2598 = arg4;
        this.field2593 = arg0;
        this.method1127(false);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lpe;Lza;Lgn;ZLvk;II[Lah;Leb;ILpi;Lcf;IILeb;IILrt;I)Le;")
    public final class377 method1132(class441 arg0, class290 arg1, class504 arg2, boolean arg3, class252 arg4, int arg5, int arg6, class265[] arg7, class449 arg8, int arg9, class350 arg10, class437 arg11, int arg12, int arg13, class449 arg14, int arg15, int arg16, class154 arg17, int arg18) {
        field2591++;
        if (this.field2593 != -1) {
            return arg0.method2580(this.field2593, -116).method1947(81, arg18, arg4, arg6, arg5, arg1, arg16, arg12, arg14, arg15, arg9, arg8, arg7, arg10, arg11);
        }
        int var20 = arg18;
        long var21 = this.field2588;
        int[] var23 = this.field2598;
        if (arg14 != null && (arg14.field6282 >= 0 || arg14.field6263 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field2598[var24];
            }
            if (arg14.field6282 >= 0) {
                if (arg14.field6282 == 65535) {
                    var23[5] = 0;
                    var21 ^= 0xFFFFFFFF00000000L;
                } else {
                    var23[5] = class170.method1067(1073741824, arg14.field6282);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg14.field6263 >= 0) {
                if (arg14.field6263 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class170.method1067(arg14.field6263, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg14 != null || arg8 != null;
        int var29 = arg7 == null ? 0 : arg7.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class187.field2691[var30] = null;
            if (arg7[var30] != null) {
                class449 var31 = arg11.method2566(arg7[var30].field3881, -19);
                if (var31.field6276 != null) {
                    var28 = true;
                    class66.field834[var30] = var31;
                    int var32 = arg7[var30].field3889;
                    int var33 = arg7[var30].field3886;
                    int var34 = var31.field6276[var32];
                    class187.field2691[var30] = arg11.method2572(var34 >>> 16, (byte) 64);
                    int var35 = var34 & 0xFFFF;
                    class170.field2477[var30] = var35;
                    if (class187.field2691[var30] != null) {
                        var26 |= class187.field2691[var30].method2648(13834, var35);
                        var25 |= class187.field2691[var30].method2651(var35, -1094206008);
                        var27 |= class187.field2691[var30].method2649(var35, 255);
                    }
                    if ((var31.field6270 || class26.field318) && var33 != -1 && var31.field6276.length > var33) {
                        class369.field5272[var30] = var31.field6258[var32];
                        class275.field4093[var30] = arg7[var30].field3883;
                        int var36 = var31.field6276[var33];
                        class38.field419[var30] = arg11.method2572(var36 >>> 16, (byte) 70);
                        int var37 = var36 & 0xFFFF;
                        class332.field4833[var30] = var37;
                        if (class38.field419[var30] != null) {
                            var26 |= class38.field419[var30].method2648(13834, var37);
                            var25 |= class38.field419[var30].method2651(var37, -1094206008);
                            var27 |= class38.field419[var30].method2649(var37, 255);
                        }
                    } else {
                        class369.field5272[var30] = 0;
                        class275.field4093[var30] = 0;
                        class38.field419[var30] = null;
                        class332.field4833[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class454 var41 = null;
        class454 var42 = null;
        int var43 = -1;
        if (arg13 != 21353) {
            method1125(-6, 60, -35, 10);
        }
        int var44 = -1;
        int var45 = 0;
        class454 var46 = null;
        class454 var47 = null;
        if (var28) {
            var20 = arg18 | 0x20;
            if (arg14 != null) {
                int var48 = arg14.field6276[arg5];
                int var49 = var48 >>> 16;
                var38 = var48 & 0xFFFF;
                var41 = arg11.method2572(var49, (byte) 65);
                if (var41 != null) {
                    var26 |= var41.method2648(13834, var38);
                    var25 |= var41.method2651(var38, -1094206008);
                    var27 |= var41.method2649(var38, arg13 - 21098);
                }
                if ((arg14.field6270 || class26.field318) && arg9 != -1 && arg14.field6276.length > arg9) {
                    var40 = arg14.field6258[arg5];
                    int var50 = arg14.field6276[arg9];
                    int var51 = var50 >>> 16;
                    var42 = var49 == var51 ? var41 : arg11.method2572(var51, (byte) 102);
                    var39 = var50 & 0xFFFF;
                    if (var42 != null) {
                        var26 |= var42.method2648(arg13 ^ 0x6563, var39);
                        var25 |= var42.method2651(var39, -1094206008);
                        var27 |= var42.method2649(var39, arg13 ^ 0x5396);
                    }
                }
            }
            if (arg8 != null) {
                int var52 = arg8.field6276[arg15];
                int var53 = var52 >>> 16;
                var46 = arg11.method2572(var53, (byte) 82);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method2648(13834, var43);
                    var25 |= var46.method2651(var43, -1094206008);
                    var27 |= var46.method2649(var43, 255);
                }
                if ((arg8.field6270 || class26.field318) && arg12 != -1 && arg12 < arg8.field6276.length) {
                    var45 = arg8.field6258[arg15];
                    int var54 = arg8.field6276[arg12];
                    int var55 = var54 >>> 16;
                    var44 = var54 & 0xFFFF;
                    var47 = var53 == var55 ? var46 : arg11.method2572(var55, (byte) 68);
                    if (var47 != null) {
                        var26 |= var47.method2648(arg13 - 7519, var44);
                        var25 |= var47.method2651(var44, -1094206008);
                        var27 |= var47.method2649(var44, arg13 ^ 0x5396);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
            if (var27) {
                var20 |= 0x400;
            }
        }
        class174 var56 = class311.field4524;
        class377 var57;
        synchronized (class311.field4524) {
            var57 = (class377) class311.field4524.method1088(var21, (byte) -115);
        }
        class98 var58 = null;
        if (this.field2602 != -1) {
            var58 = arg10.method2069((byte) -9, this.field2602);
        }
        if (var57 == null || arg1.method324(var57.method1605(), var20) != 0 || var58 != null && var58.field1287 != null && this.field2601 == null) {
            if (var57 != null) {
                var20 = arg1.method302(var20, var57.method1605());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var62) != 0 && !arg2.method3004(-1, var62 & 0x3FFFFFFF).method767((byte) 40)) {
                        var60 = true;
                    }
                } else if (!arg17.method993(var62 & 0x3FFFFFFF, true).method2287(this.field2594, false)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field2604 != -1L) {
                    class174 var88 = class311.field4524;
                    synchronized (class311.field4524) {
                        var57 = (class377) class311.field4524.method1088(this.field2604, (byte) -116);
                    }
                }
                if (var57 == null || arg1.method324(var57.method1605(), var20) != 0 || var58 != null && var58.field1287 != null && this.field2601 == null) {
                    return null;
                }
            } else {
                class117[] var63 = new class117[12];
                for (int var64 = 0; var64 < 12; var64++) {
                    int var65 = var23[var64];
                    if ((var65 & 0x40000000) != 0) {
                        class117 var66 = arg17.method993(var65 & 0x3FFFFFFF, true).method2290(this.field2594, -14);
                        if (var66 != null) {
                            var63[var64] = var66;
                        }
                    } else if ((var65 & Integer.MIN_VALUE) != 0) {
                        class117 var67 = arg2.method3004(arg13 ^ 0xFFFFAC96, var65 & 0x3FFFFFFF).method765((byte) 38);
                        if (var67 != null) {
                            var63[var64] = var67;
                        }
                    }
                }
                if (var58 != null && var58.field1287 != null) {
                    for (int var68 = 0; var68 < var58.field1287.length; var68++) {
                        if (var58.field1287[var68] != null && var63[var68] != null) {
                            int var69 = var58.field1287[var68][0];
                            int var70 = var58.field1287[var68][1];
                            int var71 = var58.field1287[var68][2];
                            int var72 = var58.field1287[var68][3] << 3;
                            int var73 = var58.field1287[var68][4] << 3;
                            int var74 = var58.field1287[var68][5] << 3;
                            if (this.field2601 == null) {
                                this.field2601 = new int[var58.field1287.length][];
                            }
                            if (this.field2601[var68] == null) {
                                int[] var75 = this.field2601[var68] = new int[15];
                                if (var72 == 0 && var73 == 0 && var74 == 0) {
                                    var75[14] = -var71;
                                    var75[12] = -var69;
                                    var75[13] = -var70;
                                    var75[0] = var75[4] = var75[8] = 32768;
                                } else {
                                    int var76 = class95.field1241[var72];
                                    int var77 = class95.field1242[var72];
                                    int var78 = class95.field1241[var73];
                                    int var79 = class95.field1242[var73];
                                    int var80 = class95.field1241[var74];
                                    int var81 = class95.field1242[var74];
                                    int var82 = var77 * var80 + 16384 >> 15;
                                    int var83 = var77 * var81 + 16384 >> 15;
                                    var75[1] = var79 * var82 + -var81 * var78 + 16384 >> 15;
                                    var75[7] = -var79 * -var81 + var78 * var82 + 16384 >> 15;
                                    var75[2] = var76 * var79 + 16384 >> 15;
                                    var75[3] = var76 * var81 + 16384 >> 15;
                                    var75[4] = var76 * var80 + 16384 >> 15;
                                    var75[8] = var76 * var78 + 16384 >> 15;
                                    var75[5] = -var77;
                                    var75[6] = -var79 * var80 + (var78 * var83) + 16384 >> 15;
                                    var75[0] = var78 * var80 + var79 * var83 + 16384 >> 15;
                                    var75[12] = var75[0] * -var69 + var75[6] * -var71 + var75[3] * -var70 + 16384 >> 15;
                                    var75[14] = var75[5] * -var70 + var75[2] * -var69 + (var75[8] * -var71) + 16384 >> 15;
                                    var75[13] = var75[7] * -var71 + var75[4] * -var70 + var75[1] * -var69 + 16384 >> 15;
                                }
                                var75[11] = var71;
                                var75[10] = var70;
                                var75[9] = var69;
                            }
                            if (var72 != 0 || var73 != 0 || var74 != 0) {
                                var63[var68].method780(var74, var72, var73, -4);
                            }
                            if (var69 != 0 || var70 != 0 || var71 != 0) {
                                var63[var68].method784(var69, var70, (byte) 116, var71);
                            }
                        }
                    }
                }
                int var84 = var20 | 0x4000;
                class117 var85 = new class117(var63, var63.length);
                var57 = arg1.method293(var85, var84, class79.field1033, 64, 850);
                for (int var86 = 0; var86 < 5; var86++) {
                    if (class426.field5988[var86].length > this.field2600[var86]) {
                        var57.method1570(class67.field851[var86], class426.field5988[var86][this.field2600[var86]]);
                    }
                    if (class80.field1041[var86].length > this.field2600[var86]) {
                        var57.method1570(class421.field5942[var86], class80.field1041[var86][this.field2600[var86]]);
                    }
                }
                if (arg3) {
                    var57.method1606(var20);
                    class174 var87 = class311.field4524;
                    synchronized (class311.field4524) {
                        class311.field4524.method1097(arg13 ^ 0x1FC2, var57, var21);
                    }
                    this.field2604 = var21;
                }
            }
        }
        class377 var89 = var57.method1590((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var90 < var29) {
            if (class187.field2691[var90] != null) {
                var89.method2200(class369.field5272[var90], class38.field419[var90], class332.field4833[var90], class275.field4093[var90] - 1, 0, false, -23720, this.field2601 == null ? null : this.field2601[var90], class170.field2477[var90], var91, class187.field2691[var90]);
            }
            var90++;
            var91 <<= 0x1;
        }
        if (var41 != null && var46 != null) {
            var89.method2202(false, var38, var46, var40, arg16 - 1, arg14.field6277, var42, -1, var47, arg6 - 1, var43, var39, var45, var44, var41);
        } else if (var41 != null) {
            var89.method2205((byte) -94, var38, var39, var42, 0, arg16 - 1, var40, false, var41);
        } else if (var46 != null) {
            var89.method2205((byte) -113, var43, var44, var47, 0, arg6 - 1, var45, false, var46);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class187.field2691[var92] = null;
            class38.field419[var92] = null;
            class66.field834[var92] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Leb;Lgn;Lza;IIIIIIIBLcf;)Le;")
    public final class377 method1133(class449 arg0, class504 arg1, class290 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, class437 arg11) {
        field2592++;
        int var13 = arg8;
        if (arg0 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg0.field6276[arg5];
            var13 = arg8 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            class454 var24 = arg11.method2572(var23, (byte) 94);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method2648(13834, var25);
                var14 |= var24.method2651(var25, arg10 - 1094205993);
                var17 |= var24.method2649(var25, 255);
                var16 |= arg0.field6260;
            }
            if ((arg0.field6270 || class26.field318) && arg9 != -1 && arg0.field6276.length > arg9) {
                int var26 = arg0.field6276[arg9];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class454 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg11.method2572(var28 >>> 16, (byte) 72);
                }
                if (var29 != null) {
                    var15 |= var29.method2648(arg10 ^ 0xFFFFC9FB, var28);
                    var14 |= var29.method2651(var28, -1094206008);
                    var17 |= var29.method2649(var28, 255);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) (arg6 << 16) | (long) arg3 << 32 | (long) arg7;
        class174 var32 = class66.field842;
        class377 var33;
        synchronized (class66.field842) {
            var33 = (class377) class66.field842.method1088(var30, (byte) 87);
        }
        if (var33 == null || arg2.method324(var33.method1605(), var13) != 0) {
            if (var33 != null) {
                var13 = arg2.method302(var13, var33.method1605());
            }
            class117[] var35 = new class117[3];
            int var36 = 0;
            if (!arg1.method3004(-1, arg7).method770((byte) -82) || !arg1.method3004(arg10 + 14, arg6).method770((byte) -127) || !arg1.method3004(-1, arg3).method770((byte) -83)) {
                return null;
            }
            class117 var37 = arg1.method3004(-1, arg7).method763(-14);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class117 var38 = arg1.method3004(-1, arg6).method763(-14);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class117 var39 = arg1.method3004(-1, arg3).method763(-14);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class117 var41 = new class117(var35, var36);
            var33 = arg2.method293(var41, var40, class79.field1033, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (class426.field5988[var42].length > this.field2600[var42]) {
                    var33.method1570(class67.field851[var42], class426.field5988[var42][this.field2600[var42]]);
                }
                if (this.field2600[var42] < class80.field1041[var42].length) {
                    var33.method1570(class421.field5942[var42], class80.field1041[var42][this.field2600[var42]]);
                }
            }
            var33.method1606(var13);
            class174 var43 = class66.field842;
            synchronized (class66.field842) {
                class66.field842.method1097(19627, var33, var30);
            }
        }
        if (arg0 == null) {
            return var33;
        } else {
            class377 var44 = var33.method1590((byte) 4, var13, true);
            class377 var45 = arg0.method2626(arg4, arg9, var44, arg5, arg8, 1010306416);
            return arg10 == -15 ? var45 : null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lgn;III)V")
    public final void method1134(class504 arg0, int arg1, int arg2, int arg3) {
        field2589++;
        int var5 = class466.field6513[arg2];
        if (this.field2598[var5] == 0 || arg0.method3004(-1, arg1) == null) {
            return;
        }
        this.field2598[var5] = class170.method1067(arg1, Integer.MIN_VALUE);
        this.method1127(false);
        if (arg3 != 9604) {
            this.method1126(104, -18, -101);
        }
    }
}
