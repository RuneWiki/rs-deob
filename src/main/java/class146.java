import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class146 extends class142 {

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "I")
    private int field2784 = 6;

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "I")
    public static int field2786 = 0;

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "Lai;")
    public static class10 field2787 = class44.method278("Stufe)2", -46);

    @OriginalMember(owner = "client!qa", name = "ab", descriptor = "Lai;")
    public static class10 field2793 = class44.method278("<)4col>", 118);

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "Ldd;")
    public static class34 field2789 = new class34(50);

    @OriginalMember(owner = "client!qa", name = "db", descriptor = "Lai;")
    public static class10 field2796 = class44.method278("titlebutton", -126);

    @OriginalMember(owner = "client!qa", name = "eb", descriptor = "[I")
    public static int[] field2797 = new int[256];

    @OriginalMember(owner = "client!qa", name = "cb", descriptor = "I")
    public static int field2795 = 2301979;

    @OriginalMember(owner = "client!qa", name = "fb", descriptor = "[I")
    public static int[] field2798 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!qa", name = "bb", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!qa", name = "gb", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!qa", name = "hb", descriptor = "Lmb;")
    public static class111 field2800;

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "Lbf;")
    public static class17 field2791;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(III)I")
    private final int method1010(int arg0, int arg1, int arg2) {
        ++field2790;
        if (arg1 != 2020) {
            return 92;
        } else {
            int var4 = this.field2784;
            if (~var4 != -2) {
                if (var4 != 2) {
                    if (var4 != 3) {
                        if (var4 != 4) {
                            if (~var4 != -6) {
                                if (var4 != 6) {
                                    if (~var4 != -8) {
                                        if (var4 != 8) {
                                            if (var4 != 9) {
                                                if (~var4 != -11) {
                                                    if (~var4 != -12) {
                                                        return ~var4 == -13 ? -(arg0 * arg2 >> 11) + arg0 + arg2 : arg0;
                                                    } else {
                                                        return arg2 < arg0 ? -arg2 + arg0 : -arg0 + arg2;
                                                    }
                                                } else {
                                                    return ~arg2 <= ~arg0 ? arg2 : arg0;
                                                }
                                            } else {
                                                return ~arg0 <= ~arg2 ? arg2 : arg0;
                                            }
                                        } else {
                                            return arg0 != 0 ? -((-arg2 + 4096 << 12) / arg0) + 4096 : 0;
                                        }
                                    } else {
                                        return ~arg0 != -4097 ? (arg2 << 12) / (-arg0 + 4096) : 4096;
                                    }
                                } else {
                                    return arg2 >= 2048 ? -((4096 - arg2) * (-arg0 + 4096) >> 11) + 4096 : arg0 * arg2 >> 11;
                                }
                            } else {
                                return 4096 - ((-arg0 + 4096) * (-arg2 + 4096) >> 12);
                            }
                        } else {
                            return ~arg2 == -1 ? 4096 : (arg0 << 12) / arg2;
                        }
                    } else {
                        return arg0 * arg2 >> 12;
                    }
                } else {
                    return arg0 - arg2;
                }
            } else {
                return arg0 + arg2;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        ++field2788;
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (super.field2683.field3516) {
            int[] var4 = this.method963((byte) -121, 0, arg1);
            int[] var5 = this.method963((byte) -121, 1, arg1);
            for (int var6 = 0; var6 < class133.field2499; ++var6) {
                var3[var6] = this.method1010(var4[var6], 2020, var5[var6]);
            }
        }
        if (arg0) {
            this.method78((class114) null, 49, (byte) -84);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    public class146() {
        super(2, false);
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
    public static void method1011(int arg0) {
        field2793 = null;
        field2789 = null;
        if (arg0 != 2024629548) {
            method1012((class21) null, 106, 10, -108, true, (byte) -52, -70);
        }
        field2800 = null;
        field2798 = null;
        field2791 = null;
        field2796 = null;
        field2797 = null;
        field2787 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lc;IIIZBI)V")
    public static final void method1012(class21 arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6) {
        class122.field2348 = arg2;
        class75.field1290 = 1;
        class157.field3022 = arg3;
        if (arg5 > -13) {
            method1012((class21) null, -69, 70, -121, false, (byte) -30, 57);
        }
        class25.field387 = arg0;
        class149.field2872 = arg6;
        ++field2794;
        class172.field3332 = arg4;
        class6.field76 = arg1;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        ++field2799;
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field2684 = arg0.method767(true) == 1;
            }
        } else {
            this.field2784 = arg0.method767(true);
        }
        if (arg2 >= -34) {
            method1011(87);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method86(int arg0, boolean arg1) {
        if (arg1) {
            this.method78((class114) null, -104, (byte) 41);
        }
        int[][] var3 = super.field2666.method956(arg0, -108);
        if (super.field2666.field2664) {
            int[][] var4 = this.method961(2, 0, arg0);
            int[][] var5 = this.method961(2, 1, arg0);
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var5[0];
            int[] var12 = var4[2];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            for (int var15 = 0; class133.field2499 > var15; ++var15) {
                var7[var15] = this.method1010(var9[var15], 2020, var11[var15]);
                var8[var15] = this.method1010(var10[var15], 2020, var13[var15]);
                var6[var15] = this.method1010(var12[var15], 2020, var14[var15]);
            }
        }
        ++field2792;
        return var3;
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if ((var1 & 1) == 1) {
                    var1 = var1 >>> 1 ^ -306674912;
                } else {
                    var1 >>>= 1;
                }
            }
            field2797[var0] = var1;
        }
    }
}
