import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class207 {

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public int field2841;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "[I")
    public static int[] field2848 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public int field2845;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public int field2846;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
    public int field2857;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "Lej;")
    public class63 field2849;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "[I")
    public int[] field2843;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "[I")
    public int[] field2844;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "[I")
    public int[] field2852;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "[I")
    public int[] field2853;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "[I")
    public int[] field2855;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "[I")
    public int[] field2856;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "[Lej;")
    public class63[] field2839;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "[[I")
    public int[][] field2840;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "[[I")
    public int[][] field2854;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V", line = 6)
    public static void method1343(boolean arg0) {
        if (!arg0) {
            field2848 = null;
        }
        field2848 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I[B)V", line = 31)
    private final void method1344(int arg0, byte[] arg1) {
        field2847++;
        class11 var3 = new class11(class303.method1953(-5, arg1));
        int var4 = var3.method172((byte) 52);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field2857 = var3.method185(25239);
        } else {
            this.field2857 = 0;
        }
        int var5 = var3.method172((byte) 52);
        this.field2846 = var3.method174(255);
        int var6 = 0;
        int var7 = -1;
        this.field2844 = new int[this.field2846];
        for (int var8 = 0; var8 < this.field2846; var8++) {
            this.field2844[var8] = var6 += var3.method174(class108.method765(arg0, 247));
            if (var7 < this.field2844[var8]) {
                var7 = this.field2844[var8];
            }
        }
        this.field2845 = var7 + 1;
        this.field2855 = new int[this.field2845];
        this.field2854 = new int[this.field2845][];
        this.field2843 = new int[this.field2845];
        this.field2856 = new int[this.field2845];
        this.field2853 = new int[this.field2845];
        if (var5 != 0) {
            this.field2852 = new int[this.field2845];
            for (int var9 = 0; var9 < this.field2845; var9++) {
                this.field2852[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field2846; var10++) {
                this.field2852[this.field2844[var10]] = var3.method185(25239);
            }
            this.field2849 = new class63(this.field2852);
        }
        for (int var11 = 0; var11 < this.field2846; var11++) {
            this.field2856[this.field2844[var11]] = var3.method185(25239);
        }
        for (int var12 = 0; var12 < this.field2846; var12++) {
            this.field2843[this.field2844[var12]] = var3.method185(25239);
        }
        for (int var13 = 0; var13 < this.field2846; var13++) {
            this.field2855[this.field2844[var13]] = var3.method174(255);
        }
        if (arg0 != 8) {
            method1343(true);
        }
        for (int var14 = 0; var14 < this.field2846; var14++) {
            int var21 = this.field2844[var14];
            int var22 = 0;
            int var23 = this.field2855[var21];
            this.field2854[var21] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field2854[var21][var25] = var22 += var3.method174(255);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field2853[var21] = var24 + 1;
            if (var24 + 1 == var23) {
                this.field2854[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field2839 = new class63[var7 + 1];
        this.field2840 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field2846; var15++) {
            int var16 = this.field2844[var15];
            int var17 = this.field2855[var16];
            this.field2840[var16] = new int[this.field2853[var16]];
            for (int var18 = 0; var18 < this.field2853[var16]; var18++) {
                this.field2840[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field2854[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field2854[var16][var19];
                }
                this.field2840[var16][var20] = var3.method185(25239);
            }
            this.field2839[var16] = new class63(this.field2840[var16]);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([Lhh;IILuo;IIZIII[BB)[I", line = 202)
    public static final int[] method1345(class67[] arg0, int arg1, int arg2, class345 arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, byte[] arg10, byte arg11) {
        field2850++;
        int var12 = (arg4 & 0x7) * 8;
        int var13 = (arg9 & 0x7) * 8;
        if (!arg6) {
            class67 var14 = arg0[arg7];
            for (int var15 = 0; var15 < 8; var15++) {
                for (int var16 = 0; var16 < 8; var16++) {
                    int var17 = arg2 + class230.method1585(var15 & 0x7, arg8, 7, var16 & 0x7);
                    int var18 = arg1 + class393.method2480(-16535, var15 & 0x7, var16 & 0x7, arg8);
                    if (var17 > 0 && var17 < class211.field2954 - 1 && var18 > 0 && var18 < class290.field4061 - 1) {
                        var14.method517(var18, (byte) -76, var17);
                    }
                }
            }
        }
        byte var19;
        if (arg6) {
            var19 = 1;
        } else {
            var19 = 4;
        }
        if (arg11 != 29) {
            return null;
        }
        class11 var20 = new class11(arg10);
        int var21 = (arg4 & 0xFFFFFFF8) << 3;
        int var22 = arg9 & 0x1FFFFFF8 << 3;
        byte var23 = 0;
        byte var24 = 0;
        if (arg8 == 1) {
            var24 = 1;
        } else if (arg8 == 2) {
            var24 = 1;
            var23 = 1;
        } else if (arg8 == 3) {
            var23 = 1;
        }
        for (int var25 = 0; var25 < var19; var25++) {
            for (int var58 = 0; var58 < 64; var58++) {
                for (int var59 = 0; var59 < 64; var59++) {
                    if (arg5 != var25 || var58 < var12 || var12 + 8 < var58 || var59 < var13 || var13 + 8 < var59) {
                        class264.method1728(-1, arg11 + 73, 0, 0, 0, 0, 0, false, 0, -1, var20, arg6);
                    } else if (var12 + 8 == var58 || var13 + 8 == var59) {
                        int var66;
                        int var67;
                        if (arg8 == 0) {
                            var67 = arg1 + var59 - var13;
                            var66 = var58 + arg2 - var12;
                        } else if (arg8 == 1) {
                            var66 = arg2 + var59 - var13;
                            var67 = arg1 + var12 + 8 - var58;
                        } else if (arg8 == 2) {
                            var67 = var13 + arg1 - (var59 - 8);
                            var66 = var12 + arg2 + 8 - var58;
                        } else {
                            var67 = arg1 - (var12 - var58);
                            var66 = arg2 + 8 - (-var13 + var59);
                        }
                        class264.method1728(var67, arg11 ^ 0x39, 0, arg7, var21 + var58, 0, 0, true, var22 + var59, var66, var20, arg6);
                    } else {
                        int var60 = arg2 + class230.method1585(var58 & 0x7, arg8, 7, var59 & 0x7);
                        int var61 = arg1 + class393.method2480(-16535, var58 & 0x7, var59 & 0x7, arg8);
                        class264.method1728(var61, 52, arg8, arg7, var21 + var58, var24, var23, false, var22 + var59, var60, var20, arg6);
                        if (var58 == 63 || var59 == 63) {
                            int var62 = var58 == 63 ? 64 : var58;
                            int var63 = var59 == 63 ? 64 : var59;
                            int var64;
                            int var65;
                            if (arg8 == 0) {
                                var64 = arg1 + var63 - var13;
                                var65 = arg2 + var62 - var12;
                            } else if (arg8 == 1) {
                                var64 = arg1 + var12 + 8 - var62;
                                var65 = arg2 + var63 - var13;
                            } else if (arg8 == 2) {
                                var64 = 8 - var63 - (-var13 - arg1);
                                var65 = var12 - (var62 - (arg2 + 8));
                            } else {
                                var64 = arg1 - (var12 - var62);
                                var65 = var13 + arg2 + 8 - var63;
                            }
                            if (var65 >= 0 && class211.field2954 > var65 && var64 >= 0 && class290.field4061 > var64) {
                                class57.field783[arg7][var65][var64] = class57.field783[arg7][var23 + var60][var61 + var24];
                            }
                        }
                    }
                }
            }
        }
        boolean var26 = false;
        boolean var27 = false;
        while (var20.field191 < var20.field230.length) {
            int var28 = var20.method172((byte) 52);
            if (var28 == 128) {
                class288.field4053[0] = var20.method174(255);
                class288.field4053[1] = var20.method207(7124);
                class288.field4053[2] = var20.method207(arg11 + 7095);
                class288.field4053[3] = var20.method207(7124);
                var26 = true;
                class288.field4053[4] = var20.method174(255);
            } else {
                if (var28 != 129) {
                    var20.field191--;
                    break;
                }
                if (class132.field1889 == null) {
                    class132.field1889 = new byte[4][][];
                }
                for (int var45 = 0; var45 < 4; var45++) {
                    byte var46 = var20.method162(-4436);
                    if (var46 == 0 && class132.field1889[arg7] != null) {
                        if (arg5 >= var45) {
                            int var47 = arg2;
                            int var48 = arg2 + 7;
                            int var49 = arg1;
                            if (var48 < 0) {
                                var48 = 0;
                            } else if (var48 >= class211.field2954) {
                                var48 = class211.field2954;
                            }
                            if (arg1 < 0) {
                                var49 = 0;
                            } else if (class290.field4061 <= arg1) {
                                var49 = class290.field4061;
                            }
                            if (arg2 < 0) {
                                var47 = 0;
                            } else if (arg2 >= class211.field2954) {
                                var47 = class211.field2954;
                            }
                            int var50 = arg1 + 7;
                            if (var50 < 0) {
                                var50 = 0;
                            } else if (var50 >= class290.field4061) {
                                var50 = class290.field4061;
                            }
                            while (var48 > var47) {
                                while (var49 < var50) {
                                    class132.field1889[arg7][var47][var49] = 0;
                                    var49++;
                                }
                                var47++;
                            }
                        }
                    } else if (var46 == 1) {
                        if (class132.field1889[arg7] == null) {
                            class132.field1889[arg7] = new byte[class211.field2954 + 1][class290.field4061 + 1];
                        }
                        for (int var51 = 0; var51 < 64; var51 += 4) {
                            for (int var52 = 0; var52 < 64; var52 += 4) {
                                byte var53 = var20.method162(-4436);
                                if (arg5 >= var45) {
                                    for (int var54 = var51; var54 < (var51 + 4); var54++) {
                                        for (int var55 = var52; var55 < (var52 + 4); var55++) {
                                            if (var54 >= var12 && var54 < (var12 + 8) && var13 <= var55 && var13 < (var13 + 8)) {
                                                int var56 = arg2 + class230.method1585(var54 & 0x7, arg8, 7, var55 & 0x7);
                                                int var57 = class393.method2480(-16535, var54 & 0x7, var55 & 0x7, arg8) + arg1;
                                                if (var56 >= 0 && var56 < class211.field2954 && var57 >= 0 && class290.field4061 > var57) {
                                                    class132.field1889[arg7][var56][var57] = var53;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!arg6) {
            class76 var29 = null;
            while (true) {
                while (var20.field230.length > var20.field191) {
                    int var30 = var20.method172((byte) 52);
                    if (var30 == 0) {
                        var29 = new class76(var20);
                    } else if (var30 == 1) {
                        int var31 = var20.method172((byte) 52);
                        if (var31 > 0) {
                            for (int var32 = 0; var32 < var31; var32++) {
                                class404 var33 = new class404(var20);
                                if (var33.field5739 == 31) {
                                    class17 var34 = class190.method1236(var20.method174(255), -23001);
                                    var33.method2536(var34.field304, var34.field301, var34.field308, -15432, var34.field309);
                                }
                                int var35 = var33.field407 >> 7;
                                int var36 = var33.field408 >> 7;
                                if (var33.field5744 == arg5 && var12 <= var35 && var35 < var12 + 8 && var13 <= var36 && var13 + 8 > var36) {
                                    int var37 = class189.method1231(arg8, var33.field407 & 0x3FF, (byte) 74, var33.field408 & 0x3FF) + (arg2 << 7);
                                    int var38 = (arg1 << 7) + method1346(arg8, var33.field407 & 0x3FF, var33.field408 & 0x3FF, -2);
                                    var33.field408 = var38;
                                    var33.field407 = var37;
                                    int var39 = var33.field407 >> 7;
                                    int var40 = var33.field408 >> 7;
                                    if (var39 >= 0 && var40 >= 0 && var39 < class211.field2954 && var40 < class290.field4061) {
                                        var33.field409 = class57.field783[arg5][var39][var40] - var33.field409;
                                        if (arg3.method48() > 0) {
                                            class48.method417(var33);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var30 == 2) {
                        if (var29 == null) {
                            var29 = new class76();
                        }
                        var29.method560(arg11 + 9202, var20);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var29 != null) {
                    class370.method2376((byte) 99, var29, arg2 >> 3, arg1 >> 3);
                }
                break;
            }
        }
        if (!var27 && class132.field1889 != null && class132.field1889[arg7] != null) {
            int var41 = arg2 + 7;
            int var42 = arg1 + 7;
            for (int var43 = arg2; var43 < var41; var43++) {
                for (int var44 = arg1; var44 < var42; var44++) {
                    class132.field1889[arg7][var43][var44] = 0;
                }
            }
        }
        if (var26) {
            return class288.field4053;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIII)I", line = 673)
    private static final int method1346(int arg0, int arg1, int arg2, int arg3) {
        field2842++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (~var4 == arg3) {
            return 1023 - arg1;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 693)
    public static final void method1347(int arg0) {
        field2851++;
        if (class59.field801 == -1) {
            return;
        }
        int var1 = class239.field3410.method1071((byte) -12);
        int var2 = class239.field3410.method1068((byte) 80);
        if (class212.field2958 != null) {
            var1 = class212.field2958.method384(3);
            var2 = class212.field2958.method383(6);
        }
        class108.method767(class214.field2993, 0, class59.field801, var2, 0, 0, var1, false, 0, class47.field661);
        if (arg0 != -25449) {
            method1345((class67[]) null, 125, 12, (class345) null, -108, -6, false, -68, -18, -10, (byte[]) null, (byte) 114);
        }
        if (class437.field6152 != null) {
            class239.method1625(var1, 4, var2);
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "([BI)V", line = 726)
    public class207(byte[] arg0, int arg1) {
        this.field2841 = class410.method2566(arg0.length, -125, arg0);
        if (this.field2841 != arg1) {
            throw new RuntimeException();
        }
        this.method1344(8, arg0);
    }
}
