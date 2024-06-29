import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class159 extends class142 {

    @OriginalMember(owner = "client!re", name = "V", descriptor = "I")
    private int field3059 = 32768;

    @OriginalMember(owner = "client!re", name = "cb", descriptor = "Lai;")
    public static class10 field3066 = class44.method278("Hidden)2", 115);

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "[I")
    public static int[] field3062 = new int[50];

    @OriginalMember(owner = "client!re", name = "S", descriptor = "Lai;")
    public static class10 field3056 = class44.method278(" <col=ffff00>", 118);

    @OriginalMember(owner = "client!re", name = "db", descriptor = "Lai;")
    private static class10 field3067 = class44.method278("Select a world", -30);

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "Lai;")
    public static class10 field3064 = field3067;

    @OriginalMember(owner = "client!re", name = "fb", descriptor = "Lai;")
    public static class10 field3069 = class44.method278("Ung-Ultige Session)2ID)3", 117);

    @OriginalMember(owner = "client!re", name = "gb", descriptor = "[I")
    public static int[] field3070 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!re", name = "X", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!re", name = "hb", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!re", name = "W", descriptor = "Lmb;")
    public static class111 field3060;

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "Lc;")
    public static class21 field3063;

    @OriginalMember(owner = "client!re", name = "eb", descriptor = "[I")
    public static int[] field3068;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III[I[I[Lde;)V")
    public static final void method1060(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, class35[] arg5) {
        ++field3055;
        if (arg1 < arg0) {
            int var6 = arg1 - 1;
            int var7 = arg0 - -1;
            int var8 = (arg0 + arg1) / 2;
            class35 var9 = arg5[var8];
            arg5[var8] = arg5[arg1];
            arg5[arg1] = var9;
            while (~var7 < ~var6) {
                boolean var10 = true;
                do {
                    --var7;
                    for (int var11 = 0; var11 < 4; ++var11) {
                        int var12;
                        int var13;
                        if (~arg4[var11] != -3) {
                            if (~arg4[var11] != -2) {
                                if (arg4[var11] == 3) {
                                    var12 = !arg5[var7].field547 ? 0 : 1;
                                    var13 = !var9.field547 ? 0 : 1;
                                } else {
                                    var12 = arg5[var7].field541;
                                    var13 = var9.field541;
                                }
                            } else {
                                var12 = arg5[var7].field550;
                                if (var12 == -1 && arg3[var11] == 1) {
                                    var12 = 2001;
                                }
                                var13 = var9.field550;
                                if (~var13 == 0 && arg3[var11] == 1) {
                                    var13 = 2001;
                                }
                            }
                        } else {
                            var13 = var9.field540;
                            var12 = arg5[var7].field540;
                        }
                        if (var12 != var13) {
                            if ((~arg3[var11] != -2 || ~var12 >= ~var13) && (~arg3[var11] != -1 || var13 <= var12)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    ++var6;
                    for (int var15 = 0; var15 < 4; ++var15) {
                        int var16;
                        int var17;
                        if (arg4[var15] != 2) {
                            if (arg4[var15] == 1) {
                                var16 = arg5[var6].field550;
                                var17 = var9.field550;
                                if (var17 == -1 && arg3[var15] == 1) {
                                    var17 = 2001;
                                }
                                if (var16 == -1 && arg3[var15] == 1) {
                                    var16 = 2001;
                                }
                            } else if (~arg4[var15] != -4) {
                                var17 = var9.field541;
                                var16 = arg5[var6].field541;
                            } else {
                                var17 = !var9.field547 ? 0 : 1;
                                var16 = !arg5[var6].field547 ? 0 : 1;
                            }
                        } else {
                            var16 = arg5[var6].field540;
                            var17 = var9.field540;
                        }
                        if (var16 != var17) {
                            if ((arg3[var15] != 1 || ~var16 <= ~var17) && (arg3[var15] != 0 || var17 >= var16)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (~var6 > ~var7) {
                    class35 var18 = arg5[var6];
                    arg5[var6] = arg5[var7];
                    arg5[var7] = var18;
                }
            }
            method1060(var7, arg1, 127, arg3, arg4, arg5);
            method1060(arg0, var7 + 1, 126, arg3, arg4, arg5);
        }
        if (arg2 < 124) {
            method1062(86, -45, -32, 51);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method86(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field3058;
            int[][] var3 = super.field2666.method956(arg0, -96);
            if (super.field2666.field2664) {
                int[] var4 = this.method963((byte) -121, 1, arg0);
                int[] var5 = this.method963((byte) -121, 2, arg0);
                int[] var6 = var3[2];
                int[] var7 = var3[1];
                int[] var8 = var3[0];
                for (int var9 = 0; ~var9 > ~class133.field2499; ++var9) {
                    int var10 = 255 & var4[var9] * 255 >> 12;
                    int var11 = var5[var9] * this.field3059 >> 12;
                    int var12 = class179.field3400[var10] * var11 >> 12;
                    int var13 = class196.field3709[var10] * var11 >> 12;
                    int var14 = class56.field997 & (var12 >> 12) + var9;
                    int var15 = (var13 >> 12) + arg0 & class205.field3986;
                    int[][] var16 = this.method961(2, 0, var15);
                    var8[var9] = var16[0][var14];
                    var7[var9] = var16[1][var14];
                    var6[var9] = var16[2][var14];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field2684 = ~arg0.method767(true) == -2;
            }
        } else {
            this.field3059 = arg0.method762((byte) 78) << 4;
        }
        ++field3071;
        if (arg2 >= -34) {
            this.method80(-127);
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
    public final void method80(int arg0) {
        ++field3065;
        class58.method392(34);
        if (arg0 != -1) {
            method1061(-126);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        ++field3061;
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (arg0) {
            return null;
        } else {
            if (super.field2683.field3516) {
                int[] var4 = this.method963((byte) -121, 1, arg1);
                int[] var5 = this.method963((byte) -121, 2, arg1);
                for (int var6 = 0; ~class133.field2499 < ~var6; ++var6) {
                    int var7 = (4082 & var4[var6]) >> 4;
                    int var8 = var5[var6] * this.field3059 >> 12;
                    int var9 = class179.field3400[var7] * var8 >> 12;
                    int var10 = var6 - -(var9 >> 12) & class56.field997;
                    int var11 = class196.field3709[var7] * var8 >> 12;
                    int var12 = class205.field3986 & (var11 >> 12) + arg1;
                    int[] var13 = this.method963((byte) -121, 0, var12);
                    var3[var6] = var13[var10];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    public class159() {
        super(3, false);
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
    public static void method1061(int arg0) {
        field3064 = null;
        field3067 = null;
        field3056 = null;
        field3068 = null;
        field3062 = null;
        field3070 = null;
        field3063 = null;
        field3069 = null;
        if (arg0 >= 77) {
            field3066 = null;
            field3060 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)I")
    public static final int method1062(int arg0, int arg1, int arg2, int arg3) {
        ++field3057;
        int var4 = 103 % ((1 - arg2) / 54);
        return (4096 - arg1) * arg0 + arg1 * arg3 >> 12;
    }
}
