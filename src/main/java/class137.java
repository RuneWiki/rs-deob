import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class137 extends class105 {

    @OriginalMember(owner = "client!pb", name = "gb", descriptor = "I")
    private int field2686 = 6;

    @OriginalMember(owner = "client!pb", name = "Y", descriptor = "Leh;")
    public static class47 field2678 = class195.method1282((byte) -4, "Benutzen");

    @OriginalMember(owner = "client!pb", name = "Z", descriptor = "[Z")
    public static boolean[] field2679 = new boolean[100];

    @OriginalMember(owner = "client!pb", name = "ab", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!pb", name = "bb", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!pb", name = "eb", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!pb", name = "hb", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!pb", name = "jb", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!pb", name = "kb", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!pb", name = "lb", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!pb", name = "mb", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!pb", name = "nb", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!pb", name = "fb", descriptor = "Lfe;")
    public static class53 field2685;

    @OriginalMember(owner = "client!pb", name = "cb", descriptor = "[Lfb;")
    public static class50[] field2682;

    @OriginalMember(owner = "client!pb", name = "db", descriptor = "[Lfb;")
    public static class50[] field2683;

    @OriginalMember(owner = "client!pb", name = "ib", descriptor = "[Lfb;")
    public static class50[] field2688;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (arg2 != -256) {
            field2682 = null;
        }
        ++field2681;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field2179 = ~arg1.method604((byte) -128) == -2;
            }
        } else {
            this.field2686 = arg1.method604((byte) -123);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        ++field2690;
        if (arg1 <= 78) {
            method998((byte[]) null, -60);
        }
        int[] var3 = super.field2192.method336(-47, arg0);
        if (super.field2192.field770) {
            int[] var4 = this.method851(0, true, arg0);
            int[] var5 = this.method851(1, true, arg0);
            for (int var6 = 0; ~class149.field2928 < ~var6; ++var6) {
                var3[var6] = this.method997(var4[var6], var5[var6], false);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(IBI)I")
    public static final int method994(int arg0, byte arg1, int arg2) {
        class120 var3 = (class120) class2.field21.method1342((long) arg0, (byte) -20);
        ++field2691;
        if (var3 == null) {
            return 0;
        } else if (~arg2 == 0) {
            return 0;
        } else {
            int var4 = 0;
            if (arg1 != -16) {
                method999(108, 75, -58);
            }
            for (int var5 = 0; var3.field2429.length > var5; ++var5) {
                if (~var3.field2426[var5] == ~arg2) {
                    var4 += var3.field2429[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V")
    public static void method995(byte arg0) {
        field2683 = null;
        field2682 = null;
        field2678 = null;
        field2679 = null;
        field2688 = null;
        if (arg0 != 32) {
            field2679 = null;
        }
        field2685 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIBII)V")
    public static final void method996(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        class70.field1535[0].method327(arg0, arg4);
        int var6 = (arg1 + -32) * arg1 / arg5;
        if (~var6 > -9) {
            var6 = 8;
        }
        class70.field1535[1].method327(arg0, arg1 + arg4 + -16);
        ++field2680;
        int var7 = (arg1 + -32 + -var6) * arg2 / (-arg1 + arg5);
        class169.method1149(arg0, arg4 + 16, 16, arg1 + -32, class135.field2656);
        class169.method1149(arg0, arg4 + 16 - -var7, 16, var6, class70.field1542);
        class169.method1137(arg0, arg4 + var7 - -16, var6, class74.field1620);
        class169.method1137(arg0 - -1, arg4 + 16 + var7, var6, class74.field1620);
        class169.method1141(arg0, arg4 + 16 + var7, 16, class74.field1620);
        class169.method1141(arg0, arg4 - -17 + var7, 16, class74.field1620);
        class169.method1137(arg0 + 15, arg4 + 16 - -var7, var6, class173.field3352);
        class169.method1137(arg0 + 14, arg4 + 17 - -var7, var6 + -1, class173.field3352);
        class169.method1141(arg0, arg4 - -var7 + 15 - -var6, 16, class173.field3352);
        class169.method1141(arg0 + 1, arg4 + 14 + var6 + var7, 15, class173.field3352);
        int var8 = -7 % ((arg3 - -48) / 32);
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class137() {
        super(2, false);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(IIZ)I")
    private final int method997(int arg0, int arg1, boolean arg2) {
        ++field2692;
        int var4 = this.field2686;
        if (~var4 != -2) {
            if (~var4 != -3) {
                if (~var4 != -4) {
                    if (~var4 != -5) {
                        if (var4 != 5) {
                            if (~var4 != -7) {
                                if (~var4 != -8) {
                                    if (var4 != 8) {
                                        if (~var4 != -10) {
                                            if (var4 != 10) {
                                                if (var4 != 11) {
                                                    if (var4 == 12) {
                                                        return arg0 + arg1 + -(arg0 * arg1 >> 11);
                                                    } else {
                                                        if (arg2) {
                                                            field2688 = null;
                                                        }
                                                        return arg0;
                                                    }
                                                } else {
                                                    return arg1 >= arg0 ? -arg0 + arg1 : arg0 - arg1;
                                                }
                                            } else {
                                                return arg0 <= arg1 ? arg1 : arg0;
                                            }
                                        } else {
                                            return arg1 > arg0 ? arg0 : arg1;
                                        }
                                    } else {
                                        return arg0 != 0 ? -((-arg1 + 4096 << 12) / arg0) + 4096 : 0;
                                    }
                                } else {
                                    return arg0 == 4096 ? 4096 : (arg1 << 12) / (-arg0 + 4096);
                                }
                            } else {
                                return ~arg1 <= -2049 ? -((4096 - arg1) * (-arg0 + 4096) >> 11) + 4096 : arg0 * arg1 >> 11;
                            }
                        } else {
                            return 4096 - ((-arg0 + 4096) * (-arg1 + 4096) >> 12);
                        }
                    } else {
                        return ~arg1 == -1 ? 4096 : (arg0 << 12) / arg1;
                    }
                } else {
                    return arg0 * arg1 >> 12;
                }
            } else {
                return -arg1 + arg0;
            }
        } else {
            return arg0 + arg1;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method15(int arg0, boolean arg1) {
        if (!arg1) {
            this.method997(110, 60, true);
        }
        ++field2684;
        int[][] var3 = super.field2186.method10(arg0, (byte) 51);
        if (super.field2186.field28) {
            int[][] var4 = this.method854(0, (byte) -68, arg0);
            int[][] var5 = this.method854(1, (byte) -118, arg0);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var4[0];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            for (int var15 = 0; ~class149.field2928 < ~var15; ++var15) {
                var7[var15] = this.method997(var11[var15], var12[var15], !arg1);
                var6[var15] = this.method997(var9[var15], var13[var15], false);
                var8[var15] = this.method997(var10[var15], var14[var15], false);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([BI)[B")
    public static final byte[] method998(byte[] arg0, int arg1) {
        ++field2689;
        class68 var2 = new class68(arg0);
        int var3 = var2.method604((byte) 93);
        int var4 = var2.method599((byte) 96);
        if (var4 >= 0 && (class192.field3716 == 0 || ~var4 >= ~class192.field3716)) {
            if (arg1 < 96) {
                method998((byte[]) null, -93);
            }
            if (~var3 == -1) {
                byte[] var5 = new byte[var4];
                var2.method565(var4, 0, (byte) 35, var5);
                return var5;
            } else {
                int var6 = var2.method599((byte) 96);
                if (~var6 <= -1 && (~class192.field3716 == -1 || var6 <= class192.field3716)) {
                    byte[] var7 = new byte[var6];
                    if (~var3 == -2) {
                        class101.method816(var7, var6, arg0, var4, 9);
                    } else {
                        class178.field3397.method914(var2, var7, 4040);
                    }
                    return var7;
                } else {
                    throw new RuntimeException();
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(III)Ln;")
    public static final class117 method999(int arg0, int arg1, int arg2) {
        class152 var3 = class173.field3351[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2990;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBIII)V")
    public static final void method1000(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field2693;
        class120 var5 = (class120) class2.field21.method1342((long) arg4, (byte) -20);
        if (var5 == null) {
            var5 = new class120();
            class2.field21.method1341(-41, (long) arg4, var5);
        }
        int var6 = 102 / ((arg1 - 39) / 63);
        if (arg0 >= var5.field2426.length) {
            int[] var7 = new int[arg0 + 1];
            int[] var8 = new int[arg0 - -1];
            for (int var9 = 0; var5.field2426.length > var9; ++var9) {
                var7[var9] = var5.field2426[var9];
                var8[var9] = var5.field2429[var9];
            }
            for (int var10 = var5.field2426.length; var10 < arg0; ++var10) {
                var7[var10] = -1;
                var8[var10] = 0;
            }
            var5.field2426 = var7;
            var5.field2429 = var8;
        }
        var5.field2426[arg0] = arg3;
        var5.field2429[arg0] = arg2;
    }
}
