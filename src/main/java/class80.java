import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class80 extends class157 {

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "Lcc;")
    public static class209 field1489 = class95.method669(106, " GMT");

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "[I")
    public static int[] field1490 = new int[2];

    @OriginalMember(owner = "client!oi", name = "S", descriptor = "Z")
    public static boolean field1494 = false;

    @OriginalMember(owner = "client!oi", name = "Y", descriptor = "Lcc;")
    public static class209 field1500 = class95.method669(116, "_labels");

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!oi", name = "T", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!oi", name = "U", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!oi", name = "W", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!oi", name = "X", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!oi", name = "Z", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!oi", name = "ab", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "[Llb;")
    private class129[] field1491;

    @OriginalMember(owner = "client!oi", name = "V", descriptor = "[[[B")
    public static byte[][][] field1497;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[[I")
    public final int[][] method250(int arg0, int arg1) {
        ++field1493;
        int[][] var3 = super.field2872.method533(arg1, 3);
        if (super.field2872.field1434) {
            int var4 = class79.field1469;
            int var5 = class226.field4124;
            int[][] var6 = new int[var4][var5];
            int[][][] var7 = super.field2872.method531((byte) -67);
            this.method564(var6, -1);
            for (int var8 = 0; class79.field1469 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[1];
                int[] var12 = var10[0];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class226.field4124; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class27.method220(255, var15) << 4;
                    var11[var14] = class27.method220(var15 >> 4, 4080);
                    var12[var14] = class27.method220(var15, 16711680) >> 12;
                }
            }
        }
        return arg0 != 1 ? null : var3;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        if (arg0 == 0) {
            this.field1491 = new class129[arg2.method774((byte) 85)];
            for (int var4 = 0; var4 < this.field1491.length; ++var4) {
                int var5 = arg2.method774((byte) 127);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field1491[var4] = class85.method611(7, arg2);
                            }
                        } else {
                            this.field1491[var4] = class23.method196(-98, arg2);
                        }
                    } else {
                        this.field1491[var4] = class150.method1041(arg2, 0);
                    }
                } else {
                    this.field1491[var4] = class56.method438((byte) -112, arg2);
                }
            }
        } else if (arg0 == 1) {
            super.field2877 = arg2.method774((byte) 76) == 1;
        }
        if (arg1 >= -29) {
            this.method564((int[][]) null, 19);
        }
        ++field1495;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        if (arg0 != -98) {
            method562((byte) -67, true);
        }
        ++field1498;
        int[] var3 = super.field2879.method1269(arg1, arg0 + 17983);
        if (super.field2879.field3363) {
            this.method564(super.field2879.method1268((byte) -56), arg0 ^ 97);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class80() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BZ)V")
    public static final void method562(byte arg0, boolean arg1) {
        ++field1496;
        int var2 = class10.field202.length;
        byte[][] var3 = class247.field4475;
        for (int var4 = 0; var4 < var2; ++var4) {
            byte[] var6 = var3[var4];
            if (var6 != null) {
                int var7 = (class47.field913[var4] & 255) * 64 + -class245.field4444;
                int var8 = (class47.field913[var4] >> 8) * 64 + -class174.field3178;
                class117.method831(-413981948);
                class147.method1025(class122.field2404, var7, arg1, 103, var6, var8);
            }
        }
        int var5 = -20 % ((43 - arg0) / 48);
    }

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "(I)V")
    public static void method563(int arg0) {
        field1490 = null;
        field1500 = null;
        if (arg0 != -1) {
            field1490 = null;
        }
        field1489 = null;
        field1497 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([[II)V")
    private final void method564(int[][] arg0, int arg1) {
        int var3 = class226.field4124;
        ++field1501;
        int var4 = class79.field1469;
        if (arg1 == -1) {
            class283.method1907(-81, arg0);
            class244.method1699(class42.field859, 0, true, class249.field4490, 0);
            if (this.field1491 != null) {
                for (int var5 = 0; this.field1491.length > var5; ++var5) {
                    class129 var6 = this.field1491[var5];
                    int var7 = var6.field2475;
                    int var8 = var6.field2481;
                    if (~var7 <= -1) {
                        if (~var8 <= -1) {
                            var6.method96(var3, var4, 121);
                        } else {
                            var6.method100(var4, arg1 ^ -101, var3);
                        }
                    } else if (~var8 <= -1) {
                        var6.method103(arg1 + -122, var3, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(IIIIII)V")
    public static final void method565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg5; ~(arg1 + arg5) <= ~var6; ++var6) {
            for (int var11 = arg4; arg2 + arg4 >= var11; ++var11) {
                if (~var11 <= -1 && ~var11 > -105 && var6 >= 0 && var6 < 104) {
                    field1497[arg3][var11][var6] = 127;
                }
            }
        }
        ++field1492;
        for (int var7 = arg5; var7 < arg1 + arg5; ++var7) {
            for (int var10 = arg4; arg2 + arg4 > var10; ++var10) {
                if (~var10 <= -1 && ~var10 > -105 && ~var7 <= -1 && var7 < 104) {
                    class271.field4803[arg3][var10][var7] = arg3 <= 0 ? 0 : class271.field4803[arg3 + -1][var10][var7];
                }
            }
        }
        if (arg0 < arg4 && ~arg4 > -105) {
            for (int var8 = arg5 + 1; arg1 + arg5 > var8; ++var8) {
                if (~var8 <= -1 && var8 < 104) {
                    class271.field4803[arg3][arg4][var8] = class271.field4803[arg3][arg4 - 1][var8];
                }
            }
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var9 = arg4 + 1; ~(arg2 + arg4) < ~var9; ++var9) {
                if (var9 >= 0 && ~var9 > -105) {
                    class271.field4803[arg3][var9][arg5] = class271.field4803[arg3][var9][arg5 + -1];
                }
            }
        }
        if (~arg4 <= -1 && arg5 >= 0 && ~arg4 > -105 && ~arg5 > -105) {
            if (arg3 != 0) {
                if (~arg4 < -1 && class271.field4803[arg3 + -1][arg4 + -1][arg5] != class271.field4803[arg3][arg4 + -1][arg5]) {
                    class271.field4803[arg3][arg4][arg5] = class271.field4803[arg3][arg4 + -1][arg5];
                    return;
                }
                if (arg5 > 0 && ~class271.field4803[arg3 + -1][arg4][arg5 + -1] != ~class271.field4803[arg3][arg4][arg5 + -1]) {
                    class271.field4803[arg3][arg4][arg5] = class271.field4803[arg3][arg4][arg5 - 1];
                    return;
                }
                if (arg4 > 0 && arg5 > 0 && ~class271.field4803[arg3 - 1][arg4 + -1][arg5 + -1] != ~class271.field4803[arg3][arg4 + -1][arg5 + -1]) {
                    class271.field4803[arg3][arg4][arg5] = class271.field4803[arg3][arg4 + -1][arg5 + -1];
                    return;
                }
            } else {
                if (~arg4 >= -1 || ~class271.field4803[arg3][arg4 + -1][arg5] == -1) {
                    if (arg5 > 0 && ~class271.field4803[arg3][arg4][arg5 + -1] != -1) {
                        class271.field4803[arg3][arg4][arg5] = class271.field4803[arg3][arg4][arg5 + -1];
                        return;
                    }
                    if (arg4 > 0 && ~arg5 < -1 && ~class271.field4803[arg3][arg4 + -1][arg5 + -1] != -1) {
                        class271.field4803[arg3][arg4][arg5] = class271.field4803[arg3][arg4 + -1][arg5 - 1];
                        return;
                    }
                    return;
                }
                class271.field4803[arg3][arg4][arg5] = class271.field4803[arg3][arg4 + -1][arg5];
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "(I)I")
    public static final int method566(int arg0) {
        ++field1499;
        return arg0 > -42 ? -77 : 6;
    }

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "(I)V")
    public static final void method567(int arg0) {
        ++field1502;
        if (arg0 < -77) {
            class44.field873.method150(-120);
            class244.field4428 = 1;
            class65.field1264 = null;
        }
    }
}
