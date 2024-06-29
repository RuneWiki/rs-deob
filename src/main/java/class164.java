import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class164 extends class99 {

    @OriginalMember(owner = "client!oj", name = "kb", descriptor = "[S")
    private short[] field2948 = new short[257];

    @OriginalMember(owner = "client!oj", name = "jb", descriptor = "I")
    private int field2947 = 0;

    @OriginalMember(owner = "client!oj", name = "Y", descriptor = "I")
    public static int field2936 = 255;

    @OriginalMember(owner = "client!oj", name = "Z", descriptor = "I")
    public static int field2937 = 0;

    @OriginalMember(owner = "client!oj", name = "T", descriptor = "Lr;")
    public static class66 field2932 = class93.method641(43, "mapscene");

    @OriginalMember(owner = "client!oj", name = "X", descriptor = "[S")
    public static short[] field2935 = new short[256];

    @OriginalMember(owner = "client!oj", name = "hb", descriptor = "Lr;")
    private static class66 field2945 = class93.method641(43, "Started 3d library");

    @OriginalMember(owner = "client!oj", name = "lb", descriptor = "Lr;")
    public static class66 field2949 = field2945;

    @OriginalMember(owner = "client!oj", name = "bb", descriptor = "I")
    public static int field2939 = 0;

    @OriginalMember(owner = "client!oj", name = "W", descriptor = "I")
    public static int field2934 = 0;

    @OriginalMember(owner = "client!oj", name = "mb", descriptor = "Lr;")
    public static class66 field2950 = class93.method641(43, "<img=0>");

    @OriginalMember(owner = "client!oj", name = "Q", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!oj", name = "R", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!oj", name = "S", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!oj", name = "ab", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!oj", name = "eb", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!oj", name = "fb", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!oj", name = "gb", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!oj", name = "ib", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!oj", name = "V", descriptor = "[I")
    private int[] field2933;

    @OriginalMember(owner = "client!oj", name = "cb", descriptor = "[I")
    private int[] field2940;

    @OriginalMember(owner = "client!oj", name = "db", descriptor = "[[I")
    private int[][] field2941;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        if (this.field2941 == null) {
            this.field2941 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field2943;
        if (this.field2941.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field2947 == 2) {
                this.method1105((byte) 100);
            }
            if (arg0 >= -22) {
                field2934 = 22;
            }
            class49.method347((byte) -128);
            this.method1106((byte) 63);
        }
    }

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "(I)V")
    public static void method1103(int arg0) {
        field2932 = null;
        field2935 = null;
        if (arg0 != -1) {
            field2939 = -3;
        }
        field2949 = null;
        field2945 = null;
        field2950 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field2947 = arg0.method1677(arg2 ^ 6676);
            this.field2941 = new int[arg0.method1677(-6677)][2];
            for (int var4 = 0; var4 < this.field2941.length; ++var4) {
                this.field2941[var4][0] = arg0.method1674(arg2 + 1355769545);
                this.field2941[var4][1] = arg0.method1674(class109.method741(arg2, -1355769545));
            }
        }
        if (arg2 != -1) {
            field2934 = 120;
        }
        ++field2930;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
    public static final void method1104(boolean arg0) {
        if (!class115.field2177) {
            class176.field3105 = 1;
            class43.field710[0] = 1004;
            class25.field325[0] = class194.field3358;
            class9.field96[0] = class85.field1679;
            if (~class90.field1743 == -1) {
                if (~class264.field4627 != -1) {
                    class29.field429 = class174.field3068;
                    class147.field2683 = class188.field3274;
                } else {
                    class147.field2683 = class170.field3021;
                    class29.field429 = class50.field896;
                }
            } else {
                class29.field429 = class8.field83;
                class147.field2683 = class92.field1769;
            }
        }
        if (~class150.field2702 != 0) {
            class155.method1053(class150.field2702, -1);
        }
        ++field2946;
        for (int var1 = 0; var1 < class87.field1701; ++var1) {
            if (class255.field4485[var1]) {
                class142.field2607[var1] = true;
            }
            class36.field540[var1] = class255.field4485[var1];
            class255.field4485[var1] = false;
        }
        class14.field182 = -1;
        class214.field3672 = null;
        class163.field2926 = class75.field1501;
        if (!arg0) {
            method1107(-36, (byte) 44);
        }
        class125.field2368 = -1;
        if (~class150.field2702 != 0) {
            class87.field1701 = 0;
            class102.method703(0, 0, class12.field143, 0, class150.field2702, -1, 0, class19.field257, (byte) -112);
        }
        class235.method1535();
        class199.method1297(6364);
        if (!class115.field2177) {
            if (~class14.field182 != 0) {
                class88.method626(106, class125.field2368, class14.field182);
            }
        } else {
            class237.method1563(4);
        }
        if (class26.field335 == 3) {
            for (int var2 = 0; var2 < class87.field1701; ++var2) {
                if (class36.field540[var2]) {
                    class235.method1554(class246.field4293[var2], class181.field3167[var2], class157.field2827[var2], class45.field831[var2], 16711935, 128);
                } else if (class142.field2607[var2]) {
                    class235.method1554(class246.field4293[var2], class181.field3167[var2], class157.field2827[var2], class45.field831[var2], 16711680, 128);
                }
            }
        }
        class161.method1089(class193.field3347, (byte) -34, class196.field3401, class207.field3595.field2053, class207.field3595.field2077);
        class193.field3347 = 0;
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(B)V")
    private final void method1105(byte arg0) {
        ++field2944;
        int[] var2 = this.field2941[0];
        int[] var3 = this.field2941[1];
        int[] var4 = this.field2941[this.field2941.length + -1];
        int[] var5 = this.field2941[this.field2941.length + -2];
        this.field2940 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] + var2[1] - var3[1] };
        if (arg0 != 100) {
            field2935 = null;
        }
        this.field2933 = new int[] { var5[0] + -var4[0] + var5[0], var5[1] + -var4[1] + var5[1] };
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(B)V")
    private final void method1106(byte arg0) {
        ++field2942;
        int var2 = this.field2947;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field2941.length - 1) < ~var5 && this.field2941[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field2941[var5 + -1];
                    int[] var7 = this.field2941[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = -class146.field2668[(8169 & var8) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field2948[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field2941.length + -1 && ~var13 <= ~this.field2941[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field2941[var14];
                    int[] var16 = this.field2941[var14 + -1];
                    int var17 = (-var16[0] + var13 << 12) / (var15[0] + -var16[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var16[1] * var18 - -(var15[1] * var17) >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field2948[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field2941.length + -1 > var22 && ~this.field2941[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field2941[var22];
                int[] var24 = this.field2941[var22 - 1];
                int var25 = this.method1108((byte) -124, var22 + -2)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = this.method1108((byte) -125, var22 + 1)[1];
                int var29 = (-var24[0] + var21 << 12) / (var23[0] + -var24[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var26 + var28 - (var27 - -var25);
                int var32 = -var25 + var27;
                int var33 = (var29 * var31 >> 12) * var30 >> 12;
                int var34 = var25 - var26 + -var31;
                int var35 = var30 * var34 >> 12;
                int var36 = var29 * var32 >> 12;
                int var38 = var33 + var36 + var35 + var26;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field2948[var20] = (short) var38;
            }
        }
        if (arg0 != 63) {
            this.method11((class249) null, 65, 75);
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(IB)Z")
    public static final boolean method1107(int arg0, byte arg1) {
        ++field2931;
        if (class196.field3394[arg0]) {
            return true;
        } else if (!client.field1648.method130((byte) -126, arg0)) {
            return false;
        } else {
            int var2 = client.field1648.method152(arg0, 0);
            if (var2 == 0) {
                class196.field3394[arg0] = true;
                return true;
            } else {
                if (class31.field466[arg0] == null) {
                    class31.field466[arg0] = new class63[var2];
                }
                for (int var3 = 0; ~var3 > ~var2; ++var3) {
                    if (class31.field466[arg0][var3] == null) {
                        byte[] var4 = client.field1648.method135(var3, 0, arg0);
                        if (var4 != null) {
                            class31.field466[arg0][var3] = new class63();
                            class31.field466[arg0][var3].field1115 = (arg0 << 16) + var3;
                            if (var4[0] != -1) {
                                class31.field466[arg0][var3].method420(-18165, new class249(var4));
                            } else {
                                class31.field466[arg0][var3].method424(-2, new class249(var4));
                            }
                        }
                    }
                }
                if (arg1 != -2) {
                    field2939 = -29;
                }
                class196.field3394[arg0] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(BI)[I")
    private final int[] method1108(byte arg0, int arg1) {
        ++field2929;
        if (arg0 > -117) {
            return null;
        } else if (~arg1 > -1) {
            return this.field2940;
        } else {
            return arg1 >= this.field2941.length ? this.field2933 : this.field2941[arg1];
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
    public class164() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        ++field2938;
        int[] var3 = super.field1943.method749(false, arg1);
        if (super.field1943.field2147) {
            int[] var4 = this.method682(0, arg1, 29149);
            for (int var5 = 0; ~var5 > ~class199.field3432; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field2948[var6];
            }
        }
        if (arg0 != -61) {
            method1107(-50, (byte) -96);
        }
        return var3;
    }
}
