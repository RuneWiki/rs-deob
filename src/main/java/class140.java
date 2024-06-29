import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class140 extends class189 {

    @OriginalMember(owner = "client!pe", name = "lb", descriptor = "I")
    private int field3000 = 409;

    @OriginalMember(owner = "client!pe", name = "nb", descriptor = "I")
    private int field3002 = 204;

    @OriginalMember(owner = "client!pe", name = "hb", descriptor = "I")
    private int field2996 = 8;

    @OriginalMember(owner = "client!pe", name = "gb", descriptor = "I")
    private int field2995 = 1024;

    @OriginalMember(owner = "client!pe", name = "tb", descriptor = "I")
    private int field3008 = 1024;

    @OriginalMember(owner = "client!pe", name = "rb", descriptor = "I")
    private int field3006 = 81;

    @OriginalMember(owner = "client!pe", name = "pb", descriptor = "I")
    private int field3004 = 0;

    @OriginalMember(owner = "client!pe", name = "Ab", descriptor = "I")
    private int field3015 = 4;

    @OriginalMember(owner = "client!pe", name = "kb", descriptor = "Lgg;")
    public static class63 field2999 = class116.method911(43, "null");

    @OriginalMember(owner = "client!pe", name = "zb", descriptor = "I")
    public static int field3014 = 0;

    @OriginalMember(owner = "client!pe", name = "mb", descriptor = "[Lgg;")
    public static class63[] field3001 = new class63[100];

    @OriginalMember(owner = "client!pe", name = "qb", descriptor = "I")
    public static int field3005 = 1;

    @OriginalMember(owner = "client!pe", name = "vb", descriptor = "Lch;")
    public static class29 field3010 = new class29(5);

    @OriginalMember(owner = "client!pe", name = "Hb", descriptor = "[Lgg;")
    public static class63[] field3022 = new class63[200];

    @OriginalMember(owner = "client!pe", name = "Gb", descriptor = "Lgg;")
    public static class63 field3021 = class116.method911(43, "Nehmen");

    @OriginalMember(owner = "client!pe", name = "ib", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!pe", name = "jb", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!pe", name = "sb", descriptor = "I")
    private int field3007;

    @OriginalMember(owner = "client!pe", name = "ub", descriptor = "I")
    private int field3009;

    @OriginalMember(owner = "client!pe", name = "wb", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!pe", name = "xb", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!pe", name = "yb", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!pe", name = "Cb", descriptor = "I")
    private int field3017;

    @OriginalMember(owner = "client!pe", name = "Db", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!pe", name = "Fb", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!pe", name = "Ib", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!pe", name = "ob", descriptor = "[I")
    private int[] field3003;

    @OriginalMember(owner = "client!pe", name = "Bb", descriptor = "[[I")
    private int[][] field3016;

    @OriginalMember(owner = "client!pe", name = "Eb", descriptor = "[[I")
    private int[][] field3019;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(II)Lcg;")
    public static final class28 method1007(int arg0, int arg1) {
        ++field3018;
        class28 var2 = (class28) class188.field3791.method289((long) arg1, arg0 ^ 130079446);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class16.field378.method745(9, arg1, 0);
            class28 var4 = new class28();
            var4.field666 = arg1;
            if (arg0 != -201) {
                field3010 = null;
            }
            if (var3 != null) {
                var4.method271(new class3(var3), false);
            }
            var4.method270((byte) -126);
            class188.field3791.method293(false, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(B)V")
    public static void method1008(byte arg0) {
        if (arg0 > -73) {
            method1008((byte) 94);
        }
        field3021 = null;
        field3001 = null;
        field3022 = null;
        field2999 = null;
        field3010 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field3020;
        int[] var3 = super.field3825.method681(arg1, (byte) -85);
        if (super.field3825.field1840) {
            int var4 = class21.field496[arg1] + this.field3004;
            int var5 = 0;
            while (var4 < 0) {
                var4 += 4096;
            }
            while (~var4 < -4097) {
                var4 -= 4096;
            }
            while (~this.field2996 < ~var5 && var4 >= this.field3003[var5]) {
                ++var5;
            }
            float var6 = (float) this.field3003[var5 + -1];
            float var7 = (float) this.field3003[var5];
            if ((float) var4 > (float) this.field3009 + var6 && (float) var4 < var7 - (float) this.field3009) {
                for (int var8 = 0; var8 < class54.field1430; ++var8) {
                    int var9 = 0;
                    int var10 = ~(var5 % 2) == -1 ? this.field2995 : -this.field2995;
                    int var11;
                    for (var11 = (this.field3017 * var10 >> 12) + class35.field825[var8]; ~var11 > -1; var11 += 4096) {
                    }
                    while (var11 > 4096) {
                        var11 -= 4096;
                    }
                    while (~var9 > ~this.field3015 && ~this.field3019[var5 + -1][var9] >= ~var11) {
                        ++var9;
                    }
                    float var12 = (float) this.field3019[var5 + -1][var9 + -1];
                    float var13 = (float) this.field3019[var5 - 1][var9];
                    if ((float) var11 > (float) this.field3009 + var12 && (float) (-this.field3009) + var13 > (float) var11) {
                        var3[var8] = this.field3016[var5 - 1][var9 + -1];
                    } else {
                        var3[var8] = 0;
                    }
                }
            } else {
                class102.method850(var3, 0, class54.field1430, 0);
            }
        }
        return arg0 != 0 ? null : var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BZ)V")
    public static final void method1009(byte arg0, boolean arg1) {
        if (~(class3.field72.field1141 >> 7) == ~class106.field2418 && ~(class3.field72.field1144 >> 7) == ~class118.field2632) {
            class106.field2418 = 0;
        }
        if (arg0 != -29) {
            method1011((class3) null, 38);
        }
        ++field3013;
        int var2 = class34.field813;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; ~var3 > ~var2; ++var3) {
            class62 var4;
            long var5;
            if (arg1) {
                var4 = class3.field72;
                var5 = 8791798054912L;
            } else {
                var5 = (long) class177.field3641[var3] << 32;
                var4 = class33.field806[class177.field3641[var3]];
            }
            if (var4 != null && var4.method97(4365)) {
                int var7 = var4.field1144 >> 7;
                int var8 = var4.field1141 >> 7;
                var4.field1571 = false;
                if ((class198.field3964 && ~class34.field813 < -51 || ~class34.field813 < -201) && !arg1 && ~var4.field1110 == ~var4.field1108) {
                    var4.field1571 = true;
                }
                if (var8 >= 0 && ~var8 > -105 && ~var7 <= -1 && ~var7 > -105) {
                    if (var4.field1577 != null && ~var4.field1557 >= ~class173.field3571 && ~var4.field1549 < ~class173.field3571) {
                        var4.field1571 = false;
                        var4.field1143 = class112.method894(-121, class112.field2528, var4.field1141, var4.field1144);
                        class64.method611(class112.field2528, var4.field1141, var4.field1144, var4.field1143, var4, var4.field1104, var5, var4.field1562, var4.field1579, var4.field1556, var4.field1573);
                    } else {
                        if ((127 & var4.field1141) == 64 && (var4.field1144 & 127) == 64) {
                            if (~class134.field2904[var8][var7] == ~class93.field2187) {
                                continue;
                            }
                            class134.field2904[var8][var7] = class93.field2187;
                        }
                        var4.field1143 = class112.method894(-125, class112.field2528, var4.field1141, var4.field1144);
                        class134.method975(class112.field2528, var4.field1141, var4.field1144, var4.field1143, 60, var4, var4.field1104, var5, var4.field1162);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(Z)V")
    public final void method84(boolean arg0) {
        ++field3012;
        if (arg0) {
            this.method1010(false);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (arg1 <= 32) {
            method1007(58, -30);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (arg0 == 7) {
                                        this.field3008 = arg2.method46((byte) 65);
                                    }
                                } else {
                                    this.field3006 = arg2.method46((byte) 65);
                                }
                            } else {
                                this.field3004 = arg2.method46((byte) 65);
                            }
                        } else {
                            this.field2995 = arg2.method46((byte) 65);
                        }
                    } else {
                        this.field3002 = arg2.method46((byte) 65);
                    }
                } else {
                    this.field3000 = arg2.method46((byte) 65);
                }
            } else {
                this.field2996 = arg2.method64(31790);
            }
        } else {
            this.field3015 = arg2.method64(31790);
        }
        ++field2997;
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(Z)V")
    private final void method1010(boolean arg0) {
        ++field3011;
        Random var2 = new Random((long) this.field2996);
        this.field3017 = 4096 / this.field3015;
        if (!arg0) {
            this.field3007 = 4096 / this.field2996;
            this.field3019 = new int[this.field2996][this.field3015 + 1];
            this.field3003 = new int[this.field2996 + 1];
            int var3 = this.field3007 / 2;
            this.field3016 = new int[this.field2996][this.field3015];
            int var4 = this.field3017 / 2;
            this.field3003[0] = 0;
            this.field3009 = this.field3006 / 2;
            for (int var5 = 0; var5 < this.field2996; ++var5) {
                if (var5 > 0) {
                    int var6 = this.field3007;
                    int var7 = (-2048 + class97.method834(0, var2, 4096)) * this.field3002 >> 12;
                    int var8 = (var3 * var7 >> 12) + var6;
                    this.field3003[var5] = this.field3003[var5 + -1] + var8;
                }
                this.field3019[var5][0] = 0;
                for (int var9 = 0; var9 < this.field3015; ++var9) {
                    if (~var9 < -1) {
                        int var10 = this.field3017;
                        int var11 = (-2048 + class97.method834(0, var2, 4096)) * this.field3000 >> 12;
                        int var12 = (var4 * var11 >> 12) + var10;
                        this.field3019[var5][var9] = this.field3019[var5][var9 + -1] + var12;
                    }
                    this.field3016[var5][var9] = ~this.field3008 >= -1 ? 4096 : -class97.method834(0, var2, this.field3008) + 4096;
                }
                this.field3019[var5][this.field3015] = 4096;
            }
            this.field3003[this.field2996] = 4096;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lab;I)V")
    public static final void method1011(class3 arg0, int arg1) {
        if (class180.field3666 != null) {
            try {
                class180.field3666.method160(arg1 + 118, 0L);
                class180.field3666.method156(2855, arg0.field54, 24, arg0.field48);
            } catch (Exception var2) {
            }
        }
        if (arg1 == 0) {
            arg0.field54 += 24;
            ++field2998;
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class140() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)V")
    public static final void method1012(int arg0, int arg1, int arg2, int arg3) {
        class96 var4 = class148.field3117[arg0][arg1][arg2];
        if (var4 != null) {
            class148.field3117[arg0][arg1][arg2].field2270 = arg3;
        }
    }
}
