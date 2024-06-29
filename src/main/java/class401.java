import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class401 {

    @OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
    public int field5674 = -1;

    @OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
    public static int field5668 = -1;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "Lwaa;")
    private class652 field5666;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "Ljava/lang/String;")
    private String field5655;

    @OriginalMember(owner = "client!gr", name = "w", descriptor = "Ljava/lang/String;")
    private String field5673;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "[I")
    private int[] field5652;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "[I")
    private int[] field5654;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "[I")
    private int[] field5656;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "[I")
    private int[] field5659;

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "[I")
    private int[] field5665;

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "[I")
    private int[] field5669;

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "[I")
    private int[] field5670;

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "[I")
    private int[] field5672;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "[Ljava/lang/String;")
    private String[] field5662;

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "[Ljava/lang/String;")
    private String[] field5667;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "[[I")
    private int[][] field5651;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "[[I")
    private int[][] field5658;

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "[[I")
    private int[][] field5664;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIII)V")
    public static final void method2422(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5661++;
        class233 var5 = class7.method44(arg0, arg4, -1);
        var5.method1422(0);
        var5.field3116 = arg2;
        var5.field3114 = arg1;
        var5.field3118 = arg3;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public final void method2423(int arg0) {
        field5657++;
        if (this.field5655 == null) {
            this.field5655 = this.field5673;
        }
        if (arg0 != 1) {
            this.field5669 = null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lun;I)V")
    public final void method2424(class389 arg0, int arg1) {
        field5675++;
        if (arg1 < 48) {
            this.field5672 = null;
        }
        while (true) {
            int var3 = arg0.method2229(255);
            if (var3 == 0) {
                return;
            }
            this.method2425((byte) -61, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BILun;)V")
    private final void method2425(byte arg0, int arg1, class389 arg2) {
        if (arg0 >= -49) {
            method2422(56, -21, -48, -98, 31);
        }
        field5653++;
        if (arg1 == 1) {
            this.field5673 = arg2.method2257(11587);
        } else if (arg1 == 2) {
            this.field5655 = arg2.method2257(11587);
        } else if (arg1 == 3) {
            int var4 = arg2.method2229(255);
            this.field5651 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5651[var5][0] = arg2.method2260(-72);
                this.field5651[var5][1] = arg2.method2255(255);
                this.field5651[var5][2] = arg2.method2255(255);
            }
        } else if (arg1 == 4) {
            int var22 = arg2.method2229(255);
            this.field5658 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field5658[var23][0] = arg2.method2260(-42);
                this.field5658[var23][1] = arg2.method2255(255);
                this.field5658[var23][2] = arg2.method2255(255);
            }
        } else if (arg1 == 5) {
            arg2.method2260(-79);
        } else if (arg1 == 6) {
            arg2.method2229(255);
        } else if (arg1 == 7) {
            arg2.method2229(255);
            return;
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg2.method2229(255);
                return;
            }
            if (arg1 == 10) {
                int var6 = arg2.method2229(255);
                this.field5656 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field5656[var7] = arg2.method2255(255);
                }
                return;
            }
            if (arg1 == 12) {
                arg2.method2255(255);
                return;
            }
            if (arg1 != 13) {
                if (arg1 != 14) {
                    if (arg1 != 15) {
                        if (arg1 == 17) {
                            this.field5674 = arg2.method2260(-42);
                            return;
                        }
                        if (arg1 == 18) {
                            int var16 = arg2.method2229(255);
                            this.field5665 = new int[var16];
                            this.field5662 = new String[var16];
                            this.field5654 = new int[var16];
                            this.field5652 = new int[var16];
                            for (int var17 = 0; var17 < var16; var17++) {
                                this.field5654[var17] = arg2.method2255(255);
                                this.field5665[var17] = arg2.method2255(255);
                                this.field5652[var17] = arg2.method2255(255);
                                this.field5662[var17] = arg2.method2244((byte) -75);
                            }
                        } else if (arg1 == 19) {
                            int var8 = arg2.method2229(255);
                            this.field5669 = new int[var8];
                            this.field5667 = new String[var8];
                            this.field5670 = new int[var8];
                            this.field5672 = new int[var8];
                            for (int var9 = 0; var9 < var8; var9++) {
                                this.field5670[var9] = arg2.method2255(255);
                                this.field5669[var9] = arg2.method2255(255);
                                this.field5672[var9] = arg2.method2255(255);
                                this.field5667[var9] = arg2.method2244((byte) -102);
                            }
                            return;
                        } else if (arg1 == 249) {
                            int var10 = arg2.method2229(255);
                            if (this.field5666 == null) {
                                int var11 = class698.method3915(var10, (byte) 93);
                                this.field5666 = new class652(var11);
                            }
                            for (int var12 = 0; var12 < var10; var12++) {
                                boolean var13 = arg2.method2229(255) == 1;
                                int var14 = arg2.method2258(-3);
                                class513 var15;
                                if (var13) {
                                    var15 = new class374(arg2.method2244((byte) -48));
                                } else {
                                    var15 = new class556(arg2.method2255(255));
                                }
                                this.field5666.method3670((long) var14, var15, (byte) 127);
                            }
                            return;
                        }
                        return;
                    }
                    arg2.method2260(-111);
                    return;
                }
                int var18 = arg2.method2229(255);
                this.field5664 = new int[var18][2];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field5664[var19][0] = arg2.method2229(255);
                    this.field5664[var19][1] = arg2.method2229(255);
                }
                return;
            }
            int var20 = arg2.method2229(255);
            this.field5659 = new int[var20];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field5659[var21] = arg2.method2260(-26);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIIIIIILga;)Z")
    public static final boolean method2426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class370 arg10) {
        field5671++;
        int var11 = arg7;
        int var12 = arg3;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg7 - var13;
        int var16 = arg3 - var14;
        class674.field9680[var13][var14] = 99;
        class180.field2218[var13][var14] = 0;
        byte var17 = 0;
        class665.field9413[var17] = arg7;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class62.field997[var10001] = arg3;
        int[][] var19 = arg10.field4979;
        while (var26 != var18) {
            var11 = class665.field9413[var18];
            var12 = class62.field997[var18];
            int var20 = var11 - var15;
            int var21 = var12 - arg10.field4975;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var12 - var16;
            int var23 = var11 - arg10.field4978;
            if (arg9 == -4) {
                if (arg1 == var11 && arg8 == var12) {
                    class295.field3984 = var11;
                    class195.field2365 = var12;
                    return true;
                }
            } else if (arg9 == -3) {
                if (class204.method1235(arg6, -30503, 1, arg2, 1, var12, arg1, var11, arg8)) {
                    class195.field2365 = var12;
                    class295.field3984 = var11;
                    return true;
                }
            } else if (arg9 == -2) {
                if (arg10.method2142(1, (byte) 14, arg8, arg6, arg1, 1, var12, var11, arg4, arg2)) {
                    class195.field2365 = var12;
                    class295.field3984 = var11;
                    return true;
                }
            } else if (arg9 == -1) {
                if (arg10.method2135(0, var12, arg4, 1, arg1, arg8, var11, arg2, arg6)) {
                    class295.field3984 = var11;
                    class195.field2365 = var12;
                    return true;
                }
            } else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
                if (arg10.method2132(1, arg8, var11, arg1, arg5, arg9, var12, (byte) 35)) {
                    class195.field2365 = var12;
                    class295.field3984 = var11;
                    return true;
                }
            } else if (arg10.method2139(arg9, -1, arg1, arg8, arg5, var11, 1, var12)) {
                class195.field2365 = var12;
                class295.field3984 = var11;
                return true;
            }
            int var25 = class180.field2218[var20][var22] + 1;
            if (var20 > 0 && class674.field9680[var20 - 1][var22] == 0 && (var19[var23 - 1][var21] & 0x42240000) == 0) {
                class665.field9413[var26] = var11 - 1;
                class62.field997[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class674.field9680[var20 - 1][var22] = 2;
                class180.field2218[var20 - 1][var22] = var25;
            }
            if (var20 < 127 && class674.field9680[var20 + 1][var22] == 0 && (var19[var23 + 1][var21] & 0x60240000) == 0) {
                class665.field9413[var26] = var11 + 1;
                class62.field997[var26] = var12;
                class674.field9680[var20 + 1][var22] = 8;
                var26 = var26 + 1 & 0xFFF;
                class180.field2218[var20 + 1][var22] = var25;
            }
            if (var22 > 0 && class674.field9680[var20][var22 - 1] == 0 && (var19[var23][var21 - 1] & 0x40A40000) == 0) {
                class665.field9413[var26] = var11;
                class62.field997[var26] = var12 - 1;
                class674.field9680[var20][var22 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class180.field2218[var20][var22 - 1] = var25;
            }
            if (var22 < 127 && class674.field9680[var20][var22 + 1] == 0 && (var19[var23][var21 + 1] & 0x48240000) == 0) {
                class665.field9413[var26] = var11;
                class62.field997[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class674.field9680[var20][var22 + 1] = 4;
                class180.field2218[var20][var22 + 1] = var25;
            }
            if (var20 > 0 && var22 > 0 && class674.field9680[var20 - 1][var22 - 1] == 0 && (var19[var23 - 1][var21 - 1] & 0x43A40000) == 0 && (var19[var23 - 1][var21] & 0x42240000) == 0 && (var19[var23][var21 - 1] & 0x40A40000) == 0) {
                class665.field9413[var26] = var11 - 1;
                class62.field997[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class674.field9680[var20 - 1][var22 - 1] = 3;
                class180.field2218[var20 - 1][var22 - 1] = var25;
            }
            if (var20 < 127 && var22 > 0 && class674.field9680[var20 + 1][var22 - 1] == 0 && (var19[var23 + 1][var21 - 1] & 0x60E40000) == 0 && (var19[var23 + 1][var21] & 0x60240000) == 0 && (var19[var23][var21 - 1] & 0x40A40000) == 0) {
                class665.field9413[var26] = var11 + 1;
                class62.field997[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class674.field9680[var20 + 1][var22 - 1] = 9;
                class180.field2218[var20 + 1][var22 - 1] = var25;
            }
            if (var20 > 0 && var22 < 127 && class674.field9680[var20 - 1][var22 + 1] == 0 && (var19[var23 - 1][var21 + 1] & 0x4E240000) == 0 && (var19[var23 - 1][var21] & 0x42240000) == 0 && (var19[var23][var21 + 1] & 0x48240000) == 0) {
                class665.field9413[var26] = var11 - 1;
                class62.field997[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class674.field9680[var20 - 1][var22 + 1] = 6;
                class180.field2218[var20 - 1][var22 + 1] = var25;
            }
            if (var20 < 127 && var22 < 127 && class674.field9680[var20 + 1][var22 + 1] == 0 && (var19[var23 + 1][var21 + 1] & 0x78240000) == 0 && (var19[var23 + 1][var21] & 0x60240000) == 0 && (var19[var23][var21 + 1] & 0x48240000) == 0) {
                class665.field9413[var26] = var11 + 1;
                class62.field997[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class674.field9680[var20 + 1][var22 + 1] = 12;
                class180.field2218[var20 + 1][var22 + 1] = var25;
            }
        }
        class295.field3984 = var11;
        class195.field2365 = var12;
        if (arg0 >= -18) {
            field5663 = -22;
        }
        return false;
    }
}
