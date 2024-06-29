import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class240 extends class123 {

    @OriginalMember(owner = "client!ad", name = "hb", descriptor = "I")
    private int field4140 = -1;

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "Leb;")
    public static class230 field4130 = class68.method589(0, "::fpsoff");

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "Leb;")
    private static class230 field4131 = class68.method589(0, "Opened title screen");

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "Leb;")
    public static class230 field4132 = class68.method589(0, ":duelstake:");

    @OriginalMember(owner = "client!ad", name = "mb", descriptor = "Leb;")
    public static class230 field4145 = field4131;

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "I")
    private int field4134;

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!ad", name = "db", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!ad", name = "eb", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!ad", name = "fb", descriptor = "I")
    private int field4138;

    @OriginalMember(owner = "client!ad", name = "gb", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!ad", name = "ib", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!ad", name = "jb", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!ad", name = "kb", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!ad", name = "lb", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!ad", name = "ob", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!ad", name = "nb", descriptor = "[I")
    private int[] field4146;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
    public final void method961(boolean arg0) {
        super.method961(arg0);
        this.field4146 = null;
        ++field4139;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        int[][] var3 = super.field2152.method1106(arg0, -7034);
        if (super.field2152.field2616 && this.method1687(64)) {
            int var4 = this.field4138 * (class255.field4540 == this.field4134 ? arg0 : this.field4134 * arg0 / class255.field4540);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            if (class140.field2505 != this.field4138) {
                for (int var8 = 0; class140.field2505 > var8; ++var8) {
                    int var9 = this.field4138 * var8 / class140.field2505;
                    int var10 = this.field4146[var4 + var9];
                    var6[var8] = class189.method1350(var10, 255) << 4;
                    var7[var8] = class189.method1350(var10, 65280) >> 4;
                    var5[var8] = class189.method1350(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; class140.field2505 > var11; ++var11) {
                    int var12 = this.field4146[var4++];
                    var6[var11] = class189.method1350(var12, 255) << 4;
                    var7[var11] = class189.method1350(var12 >> 4, 4080);
                    var5[var11] = class189.method1350(4080, var12 >> 12);
                }
            }
        }
        ++field4135;
        if (arg1 != 26080) {
            this.method2(96, -20);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Leb;IBLeb;Leb;)V")
    public static final void method1683(class230 arg0, int arg1, byte arg2, class230 arg3, class230 arg4) {
        ++field4143;
        class167.method1236(arg3, (byte) 99, arg0, arg4, -1, arg1);
        if (arg2 <= 102) {
            field4131 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)I")
    public final int method963(int arg0) {
        if (arg0 > -63) {
            method1684(21, -53, true, 54);
        }
        ++field4144;
        return this.field4140;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        ++field4137;
        if (arg2 != 1876195788) {
            field4130 = null;
        }
        if (arg0 == 0) {
            this.field4140 = arg1.method161(4);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIZI)Leb;")
    public static final class230 method1684(int arg0, int arg1, boolean arg2, int arg3) {
        ++field4142;
        if (~arg1 <= -3 && ~arg1 >= -37) {
            int var4 = 1;
            for (int var5 = arg0 / arg1; var5 != 0; var5 /= arg1) {
                ++var4;
            }
            int var6 = var4;
            if (arg0 < 0 || arg2) {
                var6 = var4 + 1;
            }
            byte[] var7 = new byte[var6];
            if (~arg0 <= -1) {
                if (arg2) {
                    var7[0] = 43;
                }
            } else {
                var7[0] = 45;
            }
            for (int var8 = 0; ~var4 < ~var8; ++var8) {
                int var10 = arg0 % arg1;
                if (~var10 > -1) {
                    var10 = -var10;
                }
                if (var10 > 9) {
                    var10 += 39;
                }
                var7[-var8 + var6 + -1] = (byte) (var10 + 48);
                arg0 /= arg1;
            }
            class230 var9 = new class230();
            var9.field3990 = var6;
            if (arg3 != -5) {
                return null;
            } else {
                var9.field3988 = var7;
                return var9;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lfk;I)V")
    public static final void method1685(class14 arg0, int arg1) {
        int var2 = class162.field2886 >> 2 << 10;
        ++field4133;
        int var3 = class258.field4561 >> 1;
        if (arg1 == 64) {
            byte[][] var4 = new byte[class237.field4094][class249.field4417];
            while (~arg0.field269.length < ~arg0.field318) {
                boolean var33 = false;
                int var34 = 0;
                int var35 = 0;
                if (arg0.method200(255) == 1) {
                    var33 = true;
                    var34 = arg0.method200(arg1 + 191);
                    var35 = arg0.method200(255);
                }
                int var36 = arg0.method200(255);
                int var37 = arg0.method200(arg1 ^ 191);
                int var38 = var36 * 64 + -class72.field1319;
                int var39 = class249.field4417 - (var37 * 64 + -class178.field3119) + -1;
                if (var38 >= 0 && ~(var39 - 63) <= -1 && ~(var38 + 63) > ~class237.field4094 && ~var39 > ~class249.field4417) {
                    for (int var40 = 0; var40 < 64; ++var40) {
                        byte[] var41 = var4[var38 + var40];
                        for (int var42 = 0; ~var42 > -65; ++var42) {
                            if (!var33 || ~(var34 * 8) >= ~var40 && ~var40 > ~(var34 * 8 - -8) && var42 >= var35 * 8 && ~(var35 * 8 + 8) < ~var42) {
                                var41[-var42 + var39] = arg0.method198(false);
                            }
                        }
                    }
                } else if (!var33) {
                    arg0.field318 += 4096;
                } else {
                    arg0.field318 += 64;
                }
            }
            int var5 = class237.field4094;
            int var6 = class249.field4417;
            int[] var7 = new int[var6];
            int[] var8 = new int[var6];
            int[] var9 = new int[var6];
            int[] var10 = new int[var6];
            int[] var11 = new int[var6];
            for (int var12 = -5; var5 > var12; ++var12) {
                for (int var13 = 0; ~var6 < ~var13; ++var13) {
                    int var27 = var12 - -5;
                    int var10002;
                    if (var5 > var27) {
                        int var28 = 255 & var4[var27][var13];
                        if (var28 > 0) {
                            class146 var29 = class130.method1028(arg1 ^ 65, var28 - 1);
                            var8[var13] += var29.field2620;
                            var7[var13] += var29.field2625;
                            var9[var13] += var29.field2633;
                            var11[var13] += var29.field2630;
                            var10002 = var10[var13]++;
                        }
                    }
                    int var30 = var12 + -5;
                    if (var30 >= 0) {
                        int var31 = 255 & var4[var30][var13];
                        if (var31 > 0) {
                            class146 var32 = class130.method1028(1, var31 + -1);
                            var8[var13] -= var32.field2620;
                            var7[var13] -= var32.field2625;
                            var9[var13] -= var32.field2633;
                            var11[var13] -= var32.field2630;
                            var10002 = var10[var13]--;
                        }
                    }
                }
                if (var12 >= 0) {
                    int[][] var14 = class84.field1487[var12 >> 6];
                    int var15 = 0;
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    for (int var20 = -5; var20 < var6; ++var20) {
                        int var21 = var20 + -5;
                        int var22 = var20 + 5;
                        if (var6 > var22) {
                            var18 += var10[var22];
                            var15 += var8[var22];
                            var19 += var7[var22];
                            var17 += var9[var22];
                            var16 += var11[var22];
                        }
                        if (~var21 <= -1) {
                            var19 -= var7[var21];
                            var16 -= var11[var21];
                            var15 -= var8[var21];
                            var18 -= var10[var21];
                            var17 -= var9[var21];
                        }
                        if (var20 >= 0 && var18 > 0) {
                            int[] var23 = var14[var20 >> 6];
                            int var24 = var16 != 0 ? class44.method382((byte) 91, var15 * 256 / var16, var17 / var18, var19 / var18) : 0;
                            if (~var4[var12][var20] == -1) {
                                if (var23 != null) {
                                    var23[(class189.method1350(var20, 63) << 6) + class189.method1350(63, var12)] = 0;
                                }
                            } else {
                                if (var23 == null) {
                                    var23 = var14[var20 >> 6] = new int[4096];
                                }
                                int var25 = (var24 & 127) + var3;
                                if (~var25 > -1) {
                                    var25 = 0;
                                } else if (~var25 < -128) {
                                    var25 = 127;
                                }
                                int var26 = (var2 + var24 & 64512) + (896 & var24) + var25;
                                var23[class189.method1350(4032, var20 << 6) + class189.method1350(63, var12)] = class3.field20[class127.method992(96, var26, 128)];
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)V")
    public static void method1686(int arg0) {
        field4145 = null;
        field4132 = null;
        field4131 = null;
        if (arg0 != -1) {
            field4145 = null;
        }
        field4130 = null;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class240() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "(I)Z")
    private final boolean method1687(int arg0) {
        ++field4136;
        if (this.field4146 != null) {
            return true;
        } else if (~this.field4140 <= -1) {
            int var2 = class140.field2505;
            int var3 = class255.field4540;
            int var4 = !class149.field2666.method726(this.field4140, -98) ? 128 : 64;
            this.field4146 = class149.field2666.method723(this.field4140, (byte) 88);
            this.field4138 = var4;
            this.field4134 = var4;
            class18.method222(var3, -557025620, var2);
            return this.field4146 != null;
        } else {
            if (arg0 != 64) {
                this.method6(-47, (class14) null, 85);
            }
            return false;
        }
    }
}
