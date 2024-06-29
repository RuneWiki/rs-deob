import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class61 extends class82 {

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    private int field1139 = 0;

    @OriginalMember(owner = "client!fe", name = "hb", descriptor = "[S")
    private short[] field1150 = new short[257];

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
    public static volatile int field1137 = 0;

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "Ldj;")
    public static class44 field1142 = class89.method650(255, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!fe", name = "bb", descriptor = "[I")
    public static int[] field1144 = new int[32];

    @OriginalMember(owner = "client!fe", name = "fb", descriptor = "Lvc;")
    public static class223 field1148 = null;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "[Lij;")
    public static class97[] field1132 = new class97[4];

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!fe", name = "ab", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!fe", name = "db", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!fe", name = "ib", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!fe", name = "lb", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "Lnf;")
    public static class147 field1138;

    @OriginalMember(owner = "client!fe", name = "eb", descriptor = "Lve;")
    public static class225 field1147;

    @OriginalMember(owner = "client!fe", name = "cb", descriptor = "[I")
    private int[] field1145;

    @OriginalMember(owner = "client!fe", name = "gb", descriptor = "[I")
    private int[] field1149;

    @OriginalMember(owner = "client!fe", name = "jb", descriptor = "[I")
    public static int[] field1152;

    @OriginalMember(owner = "client!fe", name = "kb", descriptor = "[[I")
    private int[][] field1153;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)[I")
    private final int[] method456(byte arg0, int arg1) {
        ++field1143;
        if (arg1 < 0) {
            return this.field1149;
        } else {
            if (arg0 < 53) {
                this.field1149 = null;
            }
            return this.field1153.length <= arg1 ? this.field1145 : this.field1153[arg1];
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field1135;
        if (arg0 != 25238) {
            return null;
        } else {
            int[] var3 = super.field1595.method603(true, arg1);
            if (super.field1595.field1538) {
                int[] var4 = this.method620(2652, arg1, 0);
                for (int var5 = 0; ~var5 > ~class129.field2287; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    if (var6 > 256) {
                        var6 = 256;
                    }
                    var3[var5] = this.field1150[var6];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        if (this.field1153 == null) {
            this.field1153 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field1146;
        if (this.field1153.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field1139 == 2) {
                this.method462(48);
            }
            class71.method558(4096);
            if (arg0 < 95) {
                field1152 = null;
            }
            this.method458((byte) 125);
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)V")
    public static final void method457(byte arg0) {
        class31.field544 = null;
        class170.field2968 = null;
        class225.field4218 = null;
        class72.field1378 = null;
        ++field1140;
        class154.field2679 = 0;
        class79.field1535 = null;
        class95.field1772 = null;
        class48.field895 = null;
        class180.field3121 = null;
        class228.field4281 = null;
        class30.field541 = null;
        class192.field3315.method1193((byte) 26);
        class186.field3217.method1193((byte) 26);
        class124.field2229 = null;
        if (arg0 != 55) {
            method461(true, 42);
        }
        class52.field937 = null;
        class5.field78 = null;
        class208.field3733 = null;
        class101.field1848 = null;
        class73.field1391 = null;
        class64.field1185 = null;
        class200.field3538 = null;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class61() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(B)V")
    private final void method458(byte arg0) {
        int var2 = this.field1139;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field1153.length + -1) < ~var5 && ~this.field1153[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field1153[var5];
                    int[] var7 = this.field1153[var5 + -1];
                    int var8 = (var4 - var7[0] << 12) / (var6[0] + -var7[0]);
                    int var9 = -class214.field3863[(var8 & 8163) >> 5] + 4096 >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var7[1] * var10 - -(var6[1] * var9) >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field1150[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field1153.length + -1 && ~var13 <= ~this.field1153[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field1153[var14 + -1];
                    int[] var16 = this.field1153[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field1150[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field1153.length - 1) < ~var22 && this.field1153[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field1153[var22];
                int[] var24 = this.field1153[var22 - 1];
                int var25 = this.method456((byte) 57, var22 + -2)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = this.method456((byte) 87, var22 + 1)[1];
                int var29 = -var25 + var27;
                int var30 = (-var24[0] + var21 << 12) / (var23[0] + -var24[0]);
                int var31 = var28 - -var26 + -var27 + -var25;
                int var32 = var30 * var30 >> 12;
                int var34 = (var30 * var31 >> 12) * var32 >> 12;
                int var35 = var29 * var30 >> 12;
                int var36 = -var26 + -var31 + var25;
                int var37 = var32 * var36 >> 12;
                int var38 = var34 + var35 + var37 + var26;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field1150[var20] = (short) var38;
            }
        }
        if (arg0 < 120) {
            field1152 = null;
        }
        ++field1141;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        if (arg2 != 68) {
            this.field1153 = null;
        }
        if (~arg1 == -1) {
            this.field1139 = arg0.method506(255);
            this.field1153 = new int[arg0.method506(255)][2];
            for (int var4 = 0; this.field1153.length > var4; ++var4) {
                this.field1153[var4][0] = arg0.method500(arg2 + 50);
                this.field1153[var4][1] = arg0.method500(76);
            }
        }
        ++field1154;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lld;I)V")
    public static final void method459(class124 arg0, int arg1) {
        arg0.field2213 = false;
        ++field1136;
        if (arg0.field2264 != -1) {
            class204 var2 = class94.method672(arg0.field2264, -115);
            if (var2 != null && var2.field3658 != null) {
                ++arg0.field2232;
                if (~arg0.field2249 > ~var2.field3658.length && var2.field3648[arg0.field2249] < arg0.field2232) {
                    ++arg0.field2249;
                    arg0.field2232 = 1;
                    class139.method937(var2, arg0.field2260, -109, arg0.field2195, arg0.field2249, class96.field1774 == arg0);
                }
                if (~arg0.field2249 <= ~var2.field3658.length) {
                    arg0.field2249 = 0;
                    arg0.field2232 = 0;
                    class139.method937(var2, arg0.field2260, -110, arg0.field2195, arg0.field2249, class96.field1774 == arg0);
                }
            } else {
                arg0.field2264 = -1;
            }
        }
        if (~arg0.field2205 != 0 && ~class46.field868 <= ~arg0.field2223) {
            if (~arg0.field2221 > -1) {
                arg0.field2221 = 0;
            }
            int var3 = class79.method606(arg0.field2205, arg1 + -14849).field248;
            if (~var3 == 0) {
                arg0.field2205 = -1;
            } else {
                class204 var4 = class94.method672(var3, -111);
                if (var4 != null && var4.field3658 != null) {
                    ++arg0.field2247;
                    if (~var4.field3658.length < ~arg0.field2221 && arg0.field2247 > var4.field3648[arg0.field2221]) {
                        ++arg0.field2221;
                        arg0.field2247 = 1;
                        class139.method937(var4, arg0.field2260, -54, arg0.field2195, arg0.field2221, class96.field1774 == arg0);
                    }
                    if (~arg0.field2221 <= ~var4.field3658.length) {
                        arg0.field2205 = -1;
                    }
                } else {
                    arg0.field2205 = -1;
                }
            }
        }
        if (arg0.field2243 != -1 && arg0.field2222 <= 1) {
            class204 var5 = class94.method672(arg0.field2243, 127);
            if (~var5.field3656 == -2 && arg0.field2203 > 0 && ~class46.field868 <= ~arg0.field2198 && ~arg0.field2199 > ~class46.field868) {
                arg0.field2222 = 1;
                return;
            }
        }
        if (arg1 != 13019) {
            field1132 = null;
        }
        if (arg0.field2243 != -1 && arg0.field2222 == 0) {
            class204 var6 = class94.method672(arg0.field2243, 79);
            if (var6 != null && var6.field3658 != null) {
                ++arg0.field2255;
                if (~arg0.field2252 > ~var6.field3658.length && ~arg0.field2255 < ~var6.field3648[arg0.field2252]) {
                    ++arg0.field2252;
                    arg0.field2255 = 1;
                    class139.method937(var6, arg0.field2260, -88, arg0.field2195, arg0.field2252, class96.field1774 == arg0);
                }
                if (~arg0.field2252 <= ~var6.field3658.length) {
                    ++arg0.field2215;
                    arg0.field2252 -= var6.field3659;
                    if (arg0.field2215 >= var6.field3642) {
                        arg0.field2243 = -1;
                    } else if (arg0.field2252 >= 0 && ~var6.field3658.length < ~arg0.field2252) {
                        class139.method937(var6, arg0.field2260, -73, arg0.field2195, arg0.field2252, class96.field1774 == arg0);
                    } else {
                        arg0.field2243 = -1;
                    }
                }
                arg0.field2213 = var6.field3665;
            } else {
                arg0.field2243 = -1;
            }
        }
        if (~arg0.field2222 < -1) {
            --arg0.field2222;
        }
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(B)V")
    public static void method460(byte arg0) {
        if (arg0 != -78) {
            field1148 = null;
        }
        field1144 = null;
        field1142 = null;
        field1152 = null;
        field1147 = null;
        field1138 = null;
        field1148 = null;
        field1132 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZI)Lqa;")
    public static final class172 method461(boolean arg0, int arg1) {
        class172 var2 = (class172) class9.field194.method1178((long) arg1, 14176);
        ++field1151;
        if (var2 != null) {
            return var2;
        } else {
            if (arg0) {
                method457((byte) 18);
            }
            byte[] var3 = class198.field3506.method1466(4, arg1, (byte) -124);
            class172 var4 = new class172();
            if (var3 != null) {
                var4.method1096(0, arg1, new class66(var3));
            }
            class9.field194.method1183((byte) 89, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)V")
    private final void method462(int arg0) {
        ++field1134;
        int[] var2 = this.field1153[1];
        int[] var3 = this.field1153[this.field1153.length - 2];
        int[] var4 = this.field1153[0];
        int[] var5 = this.field1153[this.field1153.length - 1];
        this.field1149 = new int[] { var4[0] + -var2[0] + var4[0], var4[1] + -var2[1] + var4[1] };
        int var6 = 26 % ((-34 - arg0) / 62);
        this.field1145 = new int[] { var3[0] + -var5[0] + var3[0], var3[1] - (var5[1] - var3[1]) };
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZII)I")
    public static final int method463(boolean arg0, int arg1, int arg2) {
        int var3 = arg2 >>> 31;
        if (!arg0) {
            return 111;
        } else {
            ++field1133;
            return (arg2 + var3) / arg1 + -var3;
        }
    }
}
