import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class210 extends class306 {

    @OriginalMember(owner = "client!me", name = "K", descriptor = "I")
    private int field3160 = 3072;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "I")
    private int field3163 = 1024;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "I")
    private int field3165 = 2048;

    @OriginalMember(owner = "client!me", name = "R", descriptor = "[I")
    public static int[] field3167 = new int[200];

    @OriginalMember(owner = "client!me", name = "U", descriptor = "Ljava/lang/String;")
    public static String field3170 = "scroll:";

    @OriginalMember(owner = "client!me", name = "G", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!me", name = "H", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(CB)Z", line = 5)
    public static final boolean method1460(char arg0, byte arg1) {
        if (arg1 != 85) {
            field3161 = 40;
        }
        field3158++;
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILlf;I)V", line = 20)
    public final void method45(int arg0, class143 arg1, int arg2) {
        field3169++;
        if (arg2 == 0) {
            this.field3163 = arg1.method1051(1);
        } else if (arg2 == 1) {
            this.field3160 = arg1.method1051(arg0 ^ 0xFFFFC41B);
        } else if (arg2 == 2) {
            this.field4759 = arg1.method1043(true) == 1;
        }
        if (arg0 != -15334) {
            method1461((byte[]) null, 92, -115, -84, -61, (class262[]) null, 91, false, -66, -42, -52);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)[[I", line = 64)
    public final int[][] method681(int arg0, byte arg1) {
        field3164++;
        int[][] var3 = this.field4752.method1866(arg0, 0);
        if (arg1 != -119) {
            field3159 = -52;
        }
        if (this.field4752.field4179) {
            int[][] var4 = this.method2160(0, (byte) 111, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class31.field367; var11++) {
                var10[var11] = (var5[var11] * this.field3165 >> 12) + this.field3163;
                var8[var11] = (var7[var11] * this.field3165 >> 12) + this.field3163;
                var9[var11] = (var6[var11] * this.field3165 >> 12) + this.field3163;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V", line = 653)
    public class210() {
        super(1, false);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)[I", line = 124)
    public final int[] method47(int arg0, int arg1) {
        if (arg1 != -1546337535) {
            field3170 = (String) null;
        }
        field3168++;
        int[] var3 = this.field4757.method903(arg0, -57);
        if (this.field4757.field1898) {
            int[] var4 = this.method2161(arg0, (byte) 116, 0);
            for (int var5 = 0; var5 < class31.field367; var5++) {
                var3[var5] = (var4[var5] * this.field3165 >> 12) + this.field3163;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([BIIII[Lne;IZIII)[I", line = 163)
    public static final int[] method1461(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class262[] arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field3171++;
        int var11 = (arg9 & 0x7) * 8;
        int var12 = (arg4 & 0x7) * 8;
        byte var13;
        if (arg7) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        if (!arg7) {
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg8 + class127.method864(arg3, -3, var15 & 0x7, var14 & 0x7);
                    int var17 = class331.method2296(var15 & 0x7, true, arg3, var14 & 0x7) + arg6;
                    if (var16 > 0 && var16 < 103 && var17 > 0 && var17 < 103) {
                        arg5[arg1].field4156[var16][var17] = class261.method1840(arg5[arg1].field4156[var16][var17], -2097153);
                    }
                }
            }
        }
        int var18 = (arg9 & 0xFFFFFFF8) << 3;
        int var19 = arg4 & 0x1FFFFFF8 << 3;
        class143 var20 = new class143(arg0);
        byte var21 = 0;
        byte var22 = 0;
        if (arg3 == 1) {
            var22 = 1;
        } else if (arg3 == 2) {
            var22 = 1;
            var21 = 1;
        } else if (arg3 == 3) {
            var21 = 1;
        }
        for (int var23 = 0; var23 < var13; var23++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg2 != var23 || var11 > var24 || (var11 + 8) < var24 || var25 < var12 || var12 + 8 < var25) {
                        class311.method2198(0, arg7, 0, var20, 0, 0, false, 124, -1, 0, -1, 0);
                    } else if ((var11 + 8) == var24 || (var12 + 8) == var25) {
                        int var32;
                        int var33;
                        if (arg3 == 0) {
                            var32 = var24 - (var11 - arg8);
                            var33 = arg6 + var25 - var12;
                        } else if (arg3 == 1) {
                            var33 = var11 - (var24 - (arg6 + 8));
                            var32 = var25 + arg8 - var12;
                        } else if (arg3 == 2) {
                            var32 = arg8 + var11 + 8 - var24;
                            var33 = arg6 + var12 + 8 - var25;
                        } else {
                            var33 = var24 + arg6 - var11;
                            var32 = var12 + arg8 + 8 - var25;
                        }
                        class311.method2198(0, arg7, var19 + var25, var20, 0, 0, true, 122, var33, var18 + var24, var32, arg1);
                    } else {
                        int var26 = arg8 + class127.method864(arg3, -3, var25 & 0x7, var24 & 0x7);
                        int var27 = class331.method2296(var25 & 0x7, true, arg3, var24 & 0x7) + arg6;
                        class311.method2198(var22, arg7, var19 + var25, var20, arg3, var21, false, 120, var27, var18 + var24, var26, arg1);
                        if (var24 == 63 || var25 == 63) {
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29 = var25 == 63 ? 64 : var25;
                            int var30;
                            int var31;
                            if (arg3 == 0) {
                                var30 = arg8 - (var11 - var28);
                                var31 = var29 + arg6 - var12;
                            } else if (arg3 == 1) {
                                var31 = arg6 + var11 + 8 - var28;
                                var30 = arg8 - (var12 - var29);
                            } else if (arg3 == 2) {
                                var31 = -var29 - (-var12 - (arg6 + 8));
                                var30 = var11 + arg8 + 8 - var28;
                            } else {
                                var30 = 8 - var29 - (-var12 - arg8);
                                var31 = var28 + arg6 - var11;
                            }
                            if (var30 >= 0 && var30 < 104 && var31 >= 0 && var31 < 104) {
                                class72.field902[arg1][var30][var31] = class72.field902[arg1][var21 + var26][var22 + var27];
                            }
                        }
                    }
                }
            }
        }
        boolean var34 = false;
        boolean var35 = false;
        if (arg10 != 25171) {
            method1463(36);
        }
        while (var20.field2295 < var20.field2260.length) {
            int var36 = var20.method1043(true);
            if (var36 == 128) {
                var34 = true;
                class300.field4685[0] = var20.method1051(1);
                class300.field4685[1] = var20.method1021(-1);
                class300.field4685[2] = var20.method1021(-1);
                class300.field4685[3] = var20.method1021(class60.method368(arg10, -25172));
                class300.field4685[4] = var20.method1051(1);
            } else {
                if (var36 != 129) {
                    var20.field2295--;
                    break;
                }
                for (int var37 = 0; var37 < 4; var37++) {
                    byte var38 = var20.method1028(79030408);
                    if (var38 == 0) {
                        if (arg2 >= var37) {
                            int var46 = arg8;
                            if (arg8 < 0) {
                                var46 = 0;
                            } else if (arg8 >= 104) {
                                var46 = 104;
                            }
                            int var47 = arg6;
                            int var48 = arg6 + 7;
                            if (var48 < 0) {
                                var48 = 0;
                            } else if (var48 >= 104) {
                                var48 = 104;
                            }
                            if (arg6 < 0) {
                                var47 = 0;
                            } else if (arg6 >= 104) {
                                var47 = 104;
                            }
                            int var49 = arg8 + 7;
                            if (var49 < 0) {
                                var49 = 0;
                            } else if (var49 >= 104) {
                                var49 = 104;
                            }
                            while (var49 > var46) {
                                while (var47 < var48) {
                                    class207.field3132[arg1][var46][var47] = 0;
                                    var47++;
                                }
                                var46++;
                            }
                        }
                    } else if (var38 == 1) {
                        for (int var39 = 0; var39 < 64; var39 += 4) {
                            for (int var40 = 0; var40 < 64; var40 += 4) {
                                byte var41 = var20.method1028(79030408);
                                if (arg2 >= var37) {
                                    for (int var42 = var39; var42 < (var39 + 4); var42++) {
                                        for (int var43 = var40; var43 < (var40 + 4); var43++) {
                                            if (var42 >= var11 && var11 + 8 > var42 && var43 >= var12 && var12 < (var12 + 8)) {
                                                int var44 = class127.method864(arg3, arg10 ^ 0xFFFF9DAE, var43 & 0x7, var42 & 0x7) + arg8;
                                                int var45 = class331.method2296(var43 & 0x7, true, arg3, var42 & 0x7) + arg6;
                                                if (var44 >= 0 && var44 < 104 && var45 >= 0 && var45 < 104) {
                                                    class207.field3132[arg1][var44][var45] = var41;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var38 == 2) {
                    }
                }
            }
        }
        if (class272.field4317 && !arg7) {
            class322 var50 = null;
            while (true) {
                while (var20.field2260.length > var20.field2295) {
                    int var51 = var20.method1043(true);
                    if (var51 == 0) {
                        var50 = new class322(var20);
                    } else if (var51 == 1) {
                        int var52 = var20.method1043(true);
                        if (var52 > 0) {
                            for (int var53 = 0; var53 < var52; var53++) {
                                class244 var54 = new class244(var20);
                                if (var54.field3827 == 31) {
                                    class18 var55 = class360.method2518(true, var20.method1051(1));
                                    var54.method1729(var55.field212, var55.field214, var55.field221, (byte) 16, var55.field209);
                                }
                                int var56 = var54.field3839 >> 7;
                                int var57 = var54.field3841 >> 7;
                                if (var54.field3831 == arg2 && var11 <= var56 && var56 < (var11 + 8) && var57 >= var12 && var57 < var12 + 8) {
                                    int var58 = (arg8 << 7) + class303.method2137(var54.field3841 & 0x3FF, var54.field3839 & 0x3FF, arg3, (byte) -9);
                                    int var59 = (arg6 << 7) + class285.method2052(arg3, var54.field3841 & 0x3FF, 9, var54.field3839 & 0x3FF);
                                    var54.field3839 = var58;
                                    var54.field3841 = var59;
                                    int var60 = var54.field3841 >> 7;
                                    int var61 = var54.field3839 >> 7;
                                    if (var61 >= 0 && var60 >= 0 && var61 < 104 && var60 < 104) {
                                        var54.field3830 = (class225.field3398[1][var61][var60] & 0x2) != 0;
                                        var54.field3823 = class72.field902[var54.field3831][var61][var60] - var54.field3823;
                                        class195.method1357(var54);
                                    }
                                }
                            }
                        }
                    } else if (var51 == 2) {
                        if (var50 == null) {
                            var50 = new class322();
                        }
                        var50.method2240(16970, var20);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var50 == null) {
                    var50 = new class322();
                }
                class296.field4652[arg8 >> 3][arg6 >> 3] = var50;
                break;
            }
        }
        if (!var35) {
            int var62 = arg8 + 7;
            int var63 = arg6 + 7;
            for (int var64 = arg8; var64 < var62; var64++) {
                for (int var65 = arg6; var65 < var63; var65++) {
                    class207.field3132[arg1][var64][var65] = 0;
                }
            }
        }
        return var34 ? class300.field4685 : null;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Z)V", line = 622)
    public static void method1462(boolean arg0) {
        if (!arg0) {
            field3161 = -127;
        }
        field3167 = null;
        field3170 = null;
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V", line = 637)
    public static final void method1463(int arg0) {
        field3156++;
        class309.field4795 = 0;
        int var1 = -107 / ((arg0 - 86) / 35);
        class5.field57 = 0;
        class333.field5333 = 0;
        class355.field5641 = 0;
        class237.field3650 = false;
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V", line = 660)
    public final void method43(byte arg0) {
        if (arg0 > -103) {
            field3170 = (String) null;
        }
        this.field3165 = this.field3160 - this.field3163;
        field3157++;
    }
}
