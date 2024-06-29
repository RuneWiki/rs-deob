import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class263 extends class354 {

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
    public static int field3685 = 0;

    @OriginalMember(owner = "client!oj", name = "U", descriptor = "F")
    public static float field3693 = 0.25F;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!oj", name = "Q", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!oj", name = "S", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!oj", name = "T", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!oj", name = "W", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "Lju;")
    public static class82 field3684;

    @OriginalMember(owner = "client!oj", name = "V", descriptor = "[Lmp;")
    private class542[] field3694;

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "[[B")
    public static byte[][] field3688;

    @OriginalMember(owner = "client!oj", name = "R", descriptor = "[[Lga;")
    public static class282[][] field3690;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(BI)[I")
    public final int[] method270(byte arg0, int arg1) {
        ++field3691;
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (super.field5478.field6213) {
            this.method1695(0, super.field5478.method2523(-1));
        }
        if (arg0 >= -74) {
            field3684 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
    public class263() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBIZ)Ljava/lang/String;")
    public static final String method1694(int arg0, byte arg1, int arg2, boolean arg3) {
        ++field3687;
        if (arg1 != 27) {
            return null;
        } else if (arg2 >= 2 && arg2 <= 36) {
            if (arg3 && arg0 >= 0) {
                int var4 = 2;
                for (int var5 = arg0 / arg2; var5 != 0; var5 /= arg2) {
                    ++var4;
                }
                char[] var6 = new char[var4];
                var6[0] = '+';
                for (int var7 = var4 + -1; var7 > 0; --var7) {
                    int var8 = arg0;
                    arg0 /= arg2;
                    int var9 = -(arg0 * arg2) + var8;
                    if (~var9 > -11) {
                        var6[var7] = (char) (var9 + 48);
                    } else {
                        var6[var7] = (char) (var9 + 87);
                    }
                }
                return new String(var6);
            } else {
                return Integer.toString(arg0, arg2);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[[I)V")
    private final void method1695(int arg0, int[][] arg1) {
        ++field3686;
        int var3 = class531.field7814;
        int var4 = class33.field511;
        class533.method3155(arg0 + 1, arg1);
        class378.method2370(class423.field6453, class179.field2409, -4537, 0, arg0);
        if (this.field3694 != null) {
            for (int var5 = 0; ~var5 > ~this.field3694.length; ++var5) {
                class542 var6 = this.field3694[var5];
                int var7 = var6.field7925;
                int var8 = var6.field7926;
                if (var7 >= 0) {
                    if (var8 < 0) {
                        var6.method928(21074, var4, var3);
                    } else {
                        var6.method930((byte) -111, var3, var4);
                    }
                } else if (var8 >= 0) {
                    var6.method931(var3, var4, (byte) 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "(I)V")
    public static final void method1696(int arg0) {
        ++field3683;
        class288.field4211 = 0;
        int var1 = (class56.field800.field1867 >> 7) + class331.field5162;
        int var2 = (class56.field800.field1862 >> 7) + class328.field5099;
        if (~var1 <= -3054 && ~var1 >= -3157 && ~var2 <= -3057 && var2 <= 3136) {
            class288.field4211 = 1;
        }
        if (var1 >= 3072 && ~var1 >= -3119 && ~var2 <= -9493 && var2 <= 9535) {
            class288.field4211 = 1;
        }
        int var3 = -1 / ((arg0 - 67) / 55);
        if (class288.field4211 == 1 && ~var1 <= -3140 && ~var1 >= -3200 && ~var2 <= -3009 && var2 <= 3062) {
            class288.field4211 = 0;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method354(int arg0, byte arg1) {
        ++field3692;
        int[][] var3 = super.field5474.method2414((byte) -108, arg0);
        int var4 = 69 / ((48 - arg1) / 60);
        if (super.field5474.field5870) {
            int var5 = class531.field7814;
            int var6 = class33.field511;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = super.field5474.method2415(67);
            this.method1695(0, var7);
            for (int var9 = 0; ~class33.field511 < ~var9; ++var9) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[0];
                int[] var13 = var11[1];
                int[] var14 = var11[2];
                for (int var15 = 0; ~var15 > ~class531.field7814; ++var15) {
                    int var16 = var10[var15];
                    var14[var15] = class519.method3092(var16 << 4, 4080);
                    var13[var15] = class519.method3092(var16 >> 4, 4080);
                    var12[var15] = class519.method3092(4080, var16 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "(I)V")
    public static void method1697(int arg0) {
        field3684 = null;
        field3688 = null;
        int var1 = 39 / ((arg0 - -53) / 45);
        field3690 = null;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
    public static final void method1698(byte arg0) {
        int var1 = -117 / ((arg0 - -29) / 47);
        if (class531.field7811 != null) {
            class531.field7811.method1120((byte) -127);
            class531.field7811 = null;
            class382.field5822 = null;
        }
        ++field3695;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lnj;II)V")
    public final void method272(class164 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field5466 = arg0.method1087(false) == 1;
            }
        } else {
            this.field3694 = new class542[arg0.method1087(false)];
            for (int var4 = 0; var4 < this.field3694.length; ++var4) {
                int var5 = arg0.method1087(false);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field3694[var4] = class126.method866(arg0, false);
                            }
                        } else {
                            this.field3694[var4] = class29.method264(-118, arg0);
                        }
                    } else {
                        this.field3694[var4] = class431.method2634((byte) -6, arg0);
                    }
                } else {
                    this.field3694[var4] = class339.method2191(arg0, 0);
                }
            }
        }
        if (arg2 != 1638) {
            this.method270((byte) 2, -3);
        }
        ++field3689;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)I")
    public static final int method1699(int arg0, int arg1) {
        return class236.field3344 != null ? class236.field3344[arg0][arg1] & 65535 : 0;
    }
}
