import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class120 extends class99 {

    @OriginalMember(owner = "client!te", name = "bb", descriptor = "I")
    private int field2277 = 32768;

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "Lr;")
    private static class66 field2275 = class93.method641(43, "Walk here");

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "Lr;")
    public static class66 field2266 = field2275;

    @OriginalMember(owner = "client!te", name = "U", descriptor = "Lwf;")
    public static class101 field2270 = new class101();

    @OriginalMember(owner = "client!te", name = "cb", descriptor = "Lth;")
    public static class243 field2278 = new class243();

    @OriginalMember(owner = "client!te", name = "db", descriptor = "Z")
    public static boolean field2279 = false;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!te", name = "S", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!te", name = "T", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!te", name = "V", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!te", name = "W", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!te", name = "X", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!te", name = "ab", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!te", name = "eb", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        int[] var3 = super.field1943.method749(false, arg1);
        ++field2273;
        if (super.field1943.field2147) {
            int[] var4 = this.method682(1, arg1, arg0 + 29210);
            int[] var5 = this.method682(2, arg1, 29149);
            for (int var6 = 0; ~class199.field3432 < ~var6; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field2277 >> 12;
                int var9 = class146.field2668[var7] * var8 >> 12;
                int var10 = class98.field1914 & (var9 >> 12) + var6;
                int var11 = class143.field2612[var7] * var8 >> 12;
                int var12 = class45.field833 & (var11 >> 12) + arg1;
                int[] var13 = this.method682(0, var12, arg0 ^ -29154);
                var3[var6] = var13[var10];
            }
        }
        if (arg0 != -61) {
            method815((byte) -71, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BZ)V")
    public static final void method815(byte arg0, boolean arg1) {
        ++field2271;
        byte var2 = 4;
        byte[][] var3 = class57.field977;
        if (arg0 >= -8) {
            method816(68);
        }
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            class129.method901(16322);
            for (int var5 = 0; ~var5 > -14; ++var5) {
                for (int var6 = 0; ~var6 > -14; ++var6) {
                    int var7 = class14.field180[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (60286104 & var7) >> 24;
                        if (!arg1 || ~var8 == -1) {
                            int var9 = var7 >> 1 & 3;
                            int var10 = 1023 & var7 >> 14;
                            int var11 = var7 >> 3 & 2047;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; ~var13 > ~class202.field3469.length; ++var13) {
                                if (class202.field3469[var13] == var12 && var3[var13] != null) {
                                    class244.method1608(var4, arg1, (7 & var11) * 8, var5 * 8, var9, (var10 & 7) * 8, var3[var13], var8, class193.field3346, 73, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        ++field2269;
        class49.method347((byte) 96);
        if (arg0 > -22) {
            field2280 = 51;
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    public class120() {
        super(3, false);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field2275 = null;
        }
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field1938 = ~arg0.method1677(-6677) == -2;
            }
        } else {
            this.field2277 = arg0.method1674(1355769544) << 4;
        }
        ++field2267;
    }

    @OriginalMember(owner = "client!te", name = "g", descriptor = "(I)V")
    public static void method816(int arg0) {
        field2270 = null;
        if (arg0 <= -3) {
            field2278 = null;
            field2275 = null;
            field2266 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method817(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class249.field4344 = arg0;
        class174.field3062 = arg3;
        class180.field3160 = arg5;
        ++field2268;
        if (arg4 >= -83) {
            method818(-36, 33, 16);
        }
        class188.field3264 = arg1;
        class175.field3083 = arg2;
        if (arg6 && ~class175.field3083 <= -101) {
            class192.field3330 = class188.field3264 * 128 + 64;
            class207.field3597 = class249.field4344 * 128 + 64;
            class134.field2494 = class45.method327(class207.field3597, class196.field3401, class192.field3330, false) + -class180.field3160;
        }
        class167.field2995 = 2;
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(III)V")
    public static final void method818(int arg0, int arg1, int arg2) {
        ++field2274;
        int var3 = 0;
        if (arg2 <= 54) {
            field2278 = null;
        }
        while (var3 < class93.field1781) {
            class1 var4 = class172.method1167((byte) 53, var3);
            if (var4 != null) {
                int var5 = var4.field10;
                if (var5 >= 0 && !class123.field2318.method407((byte) 39, var5)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field7 < 0) {
                    if (~var5 <= -1) {
                        var6 = class123.field2317[class190.method1249((byte) -91, class123.field2318.method411(var5, 102), 96)];
                    } else if (var4.field3 == -1) {
                        var6 = -1;
                    } else {
                        int var7 = var4.field3;
                        int var8 = (127 & var7) + arg0;
                        if (~var8 > -1) {
                            var8 = 0;
                        } else if (var8 > 127) {
                            var8 = 127;
                        }
                        int var9 = (var7 - -arg1 & 64512) + (896 & var7) + var8;
                        var6 = class123.field2317[class190.method1249((byte) -91, var9, 96)];
                    }
                } else {
                    int var10 = var4.field7;
                    int var11 = (127 & var10) - -arg0;
                    if (~var11 > -1) {
                        var11 = 0;
                    } else if (~var11 < -128) {
                        var11 = 127;
                    }
                    int var12 = (896 & var10) + (64512 & arg1 + var10) + var11;
                    var6 = class123.field2317[class190.method1249((byte) -91, var12, 96)];
                }
                class255.field4480[var3 + 1] = var6;
            }
            ++var3;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method37(int arg0, boolean arg1) {
        ++field2272;
        if (!arg1) {
            field2278 = null;
        }
        int[][] var3 = super.field1946.method823(arg0, (byte) -115);
        if (super.field1946.field2297) {
            int[] var4 = this.method682(1, arg0, 29149);
            int[] var5 = this.method682(2, arg0, 29149);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class199.field3432 < ~var9; ++var9) {
                int var10 = (var4[var9] * 255 & 1044693) >> 12;
                int var11 = var5[var9] * this.field2277 >> 12;
                int var12 = class146.field2668[var10] * var11 >> 12;
                int var13 = class98.field1914 & (var12 >> 12) + var9;
                int var14 = class143.field2612[var10] * var11 >> 12;
                int var15 = class45.field833 & (var14 >> 12) + arg0;
                int[][] var16 = this.method683(-57, 0, var15);
                var6[var9] = var16[0][var13];
                var7[var9] = var16[1][var13];
                var8[var9] = var16[2][var13];
            }
        }
        return var3;
    }
}
