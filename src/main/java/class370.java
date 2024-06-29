import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class370 extends class459 {

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
    private int field5794 = 0;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
    private int field5791 = 0;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    private int field5789 = 0;

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "I")
    private int field5802 = 0;

    @OriginalMember(owner = "client!ga", name = "bb", descriptor = "Z")
    private boolean field5804 = false;

    @OriginalMember(owner = "client!ga", name = "db", descriptor = "I")
    private int field5806 = -1;

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "Z")
    public boolean field5803 = false;

    @OriginalMember(owner = "client!ga", name = "mb", descriptor = "I")
    private int field5815 = 0;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    private int field5787;

    @OriginalMember(owner = "client!ga", name = "eb", descriptor = "I")
    public int field5807;

    @OriginalMember(owner = "client!ga", name = "gb", descriptor = "Lqg;")
    private class428 field5809;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!ga", name = "cb", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!ga", name = "fb", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!ga", name = "hb", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!ga", name = "ib", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!ga", name = "jb", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!ga", name = "kb", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!ga", name = "lb", descriptor = "Liu;")
    private class536 field5814;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 8)
    public final void method2440(int arg0) {
        if (this.field5814 != null) {
            this.field5814.method3251();
        }
        ++field5810;
        if (arg0 < 102) {
            this.method403(34, (class167) null);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIB)V", line = 22)
    public static final void method2441(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 <= -4) {
            ++field5788;
            class413 var5 = class674.method3852(10, arg3, 125);
            var5.method2633(16777215);
            var5.field6337 = arg2;
            var5.field6340 = arg1;
            var5.field6333 = arg0;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(ILr;)Lod;", line = 38)
    public final class468 method403(int arg0, class167 arg1) {
        ++field5793;
        class55 var3 = this.method2445(this.field5787, 63, (this.field5802 != 0 ? 5 : 0) | 2048, arg1);
        if (arg0 > -38) {
            this.field5809 = null;
        }
        if (var3 == null) {
            return null;
        } else {
            if (this.field5802 != 0) {
                var3.method618(this.field5802 * 2048);
            }
            class393 var4 = arg1.method339();
            var4.method503(super.field9696, super.field9701, super.field9705);
            this.method2442(arg1, var3, var4, (byte) -53);
            if (!class534.field7778) {
                var3.method606(var4, (class306) null, 0);
            } else {
                var3.method613(var4, (class306) null, class609.field8652, 0);
            }
            if (this.field5814 != null) {
                class79 var5 = this.field5814.method3250();
                if (class534.field7778) {
                    arg1.method320(var5, class609.field8652);
                } else {
                    arg1.method354(var5);
                }
            }
            this.field5804 = var3.method614();
            this.field5789 = var3.method623();
            this.field5791 = var3.method612();
            return null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lr;Lda;Lq;B)V", line = 85)
    private final void method2442(class167 arg0, class55 arg1, class393 arg2, byte arg3) {
        if (arg3 >= -11) {
            method2444((class692) null, -14, 5, 65, -72, -94);
        }
        arg1.method601(arg2);
        ++field5795;
        class406[] var5 = arg1.method599();
        class192[] var6 = arg1.method652();
        if ((this.field5814 == null || this.field5814.field7839) && (var5 != null || var6 != null)) {
            this.field5814 = class536.method3249(class562.field8084, true);
        }
        if (this.field5814 != null) {
            this.field5814.method3257(arg0, (long) class562.field8084, var5, var6, false);
            this.field5814.method3259(super.field9695, super.field6865, super.field6870, super.field6869, super.field6871);
        }
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(B)V", line = 112)
    public final void method404(byte arg0) {
        if (arg0 < -40) {
            ++field5796;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 293)
    public class370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field5802 = arg12;
        this.field5787 = arg0;
        this.field5807 = arg2 - -arg1;
        class578 var14 = class65.field826.method3686(false, this.field5787);
        int var15 = var14.field8241;
        if (~var15 == 0) {
            this.field5803 = true;
        } else {
            this.field5809 = class636.field8942.method2872((byte) 11, var15);
            this.field5803 = false;
        }
        if (~this.field5807 == ~arg2) {
            class216.method1622(this.field5794, this, (byte) -65, this.field5809);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V", line = 135)
    public final void method2443(int arg0, int arg1) {
        ++field5805;
        if (!this.field5803) {
            this.field5815 += arg1;
            while (~this.field5809.field6532[this.field5794] > ~this.field5815) {
                this.field5815 -= this.field5809.field6532[this.field5794];
                ++this.field5794;
                if (~this.field5809.field6521.length >= ~this.field5794) {
                    this.field5803 = true;
                    break;
                }
            }
            if (!this.field5803) {
                class216.method1622(this.field5794, this, (byte) -23, this.field5809);
            }
            if (arg0 < 111) {
                this.method2442((class167) null, (class55) null, (class393) null, (byte) -3);
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lpn;IIIII)V", line = 167)
    public static final void method2444(class692 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; ++var11) {
            if (class524.field7649 != var11) {
                for (int var12 = var7; var12 <= var8; ++var12) {
                    if (var12 >= 0 && var12 < class43.field597) {
                        for (int var13 = var9; var13 <= var10; ++var13) {
                            if (var13 >= 0 && var13 < class541.field7896 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class252 var14 = class454.field6818[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class587.field8346[var11].method479(var13, var12, 37) + class587.field8346[var11].method479(var13, var12 + 1, 120) + class587.field8346[var11].method479(var13 + 1, var12, 123) + class587.field8346[var11].method479(var13 + 1, var12 + 1, -91)) / 4 - (class587.field8346[arg1].method479(arg3, arg2, -122) + class587.field8346[arg1].method479(arg3, arg2 + 1, -128) + class587.field8346[arg1].method479(arg3 + 1, arg2, -103) + class587.field8346[arg1].method479(arg3 + 1, arg2 + 1, 113)) / 4;
                                    class563 var16 = var14.field4029;
                                    class563 var17 = var14.field4019;
                                    if (var16 != null && var16.method398((byte) -125)) {
                                        arg0.method415(var15, (var12 - arg2) * class134.field2203 + (1 - arg4) * class459.field6867, 1, class595.field8435, var6, (var13 - arg3) * class134.field2203 + (1 - arg5) * class459.field6867, var16);
                                    }
                                    if (var17 != null && var17.method398((byte) -126)) {
                                        arg0.method415(var15, (var12 - arg2) * class134.field2203 + (1 - arg4) * class459.field6867, 1, class595.field8435, var6, (var13 - arg3) * class134.field2203 + (1 - arg5) * class459.field6867, var17);
                                    }
                                    for (class531 var18 = var14.field4026; var18 != null; var18 = var18.field7736) {
                                        class459 var19 = var18.field7739;
                                        if (var19 != null && var19.method398((byte) -128) && (var19.field6865 == var12 || var7 == var12) && (var19.field6869 == var13 || var9 == var13)) {
                                            int var20 = var19.field6870 - var19.field6865 + 1;
                                            int var21 = var19.field6871 - var19.field6869 + 1;
                                            arg0.method415(var15, (var19.field6865 - arg2) * class134.field2203 + (var20 - arg4) * class459.field6867, 1, class595.field8435, var6, (var19.field6869 - arg3) * class134.field2203 + (var21 - arg5) * class459.field6867, var19);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var7;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(B)I", line = 255)
    public final int method406(byte arg0) {
        ++field5792;
        if (arg0 < 108) {
            this.field5787 = -104;
        }
        return this.field5791;
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)I", line = 269)
    public final int method393(int arg0) {
        if (arg0 != 0) {
            this.method393(21);
        }
        ++field5797;
        return this.field5789;
    }

    @OriginalMember(owner = "client!ga", name = "finalize", descriptor = "()V", line = 281)
    protected final void finalize() {
        ++field5790;
        if (this.field5814 != null) {
            this.field5814.method3251();
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZILr;I)Z", line = 318)
    public final boolean method392(boolean arg0, int arg1, class167 arg2, int arg3) {
        ++field5808;
        if (arg0) {
            this.field5806 = 86;
        }
        return false;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILr;)Lda;", line = 331)
    private final class55 method2445(int arg0, int arg1, int arg2, class167 arg3) {
        ++field5812;
        class578 var5 = class65.field826.method3686(false, arg0);
        int var6 = -80 % ((arg1 - -3) / 46);
        class37 var7 = class491.field7187[super.field9695];
        class37 var8 = super.field9703 < 3 ? class491.field7187[super.field9703 + 1] : null;
        return this.field5803 ? var5.method3380(0, class636.field8942, super.field9701, -1, var8, var7, (byte) -99, true, super.field9696, arg3, arg2, super.field9705, -1) : var5.method3380(this.field5815, class636.field8942, super.field9701, this.field5794, var8, var7, (byte) -103, true, super.field9696, arg3, arg2, super.field9705, this.field5806);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lr;Z)V", line = 353)
    public final void method412(class167 arg0, boolean arg1) {
        ++field5786;
        class55 var3 = this.method2445(this.field5787, -90, 0, arg0);
        if (!arg1) {
            if (var3 != null) {
                class393 var4 = arg0.method339();
                var4.method503(super.field9696, super.field9701, super.field9705);
                this.method2442(arg0, var3, var4, (byte) -94);
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "(I)Z", line = 374)
    public final boolean method402(int arg0) {
        if (arg0 != 623404585) {
            this.field5815 = 23;
        }
        ++field5801;
        return this.field5804;
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(B)Z", line = 389)
    public final boolean method398(byte arg0) {
        ++field5800;
        if (arg0 >= -92) {
            this.method408((byte) 126, (class167) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILr;ZILpn;)V", line = 400)
    public final void method415(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, int arg5, class692 arg6) {
        ++field5798;
        if (arg2 == 1) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "(I)Z", line = 412)
    public final boolean method414(int arg0) {
        if (arg0 != 0) {
            this.field5806 = -69;
        }
        ++field5799;
        return false;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLr;)Lll;", line = 427)
    public final class334 method408(byte arg0, class167 arg1) {
        ++field5811;
        return arg0 != 111 ? null : null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILvca;Lkt;ILr;)Z", line = 438)
    public static final boolean method2446(int arg0, int arg1, class257 arg2, class143 arg3, int arg4, class167 arg5) {
        ++field5813;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg2.field4072 != null) {
            var9 = -((arg2.field4091 + arg3.field2407 + -class378.field5893) * (-class378.field5890 + class378.field5897) / (class378.field5900 - class378.field5893)) + class378.field5897;
            var7 = (arg2.field4108 + arg3.field2406 + -class378.field5903) * (-class378.field5887 + class378.field5899) / (-class378.field5903 + class378.field5892) + class378.field5887;
            var8 = class378.field5897 - (-class378.field5893 + arg2.field4076 - -arg3.field2407) * (-class378.field5890 + class378.field5897) / (-class378.field5893 + class378.field5900);
            var6 = class378.field5887 - -((arg2.field4107 - (-arg3.field2406 + class378.field5903)) * (-class378.field5887 + class378.field5899) / (-class378.field5903 + class378.field5892));
        }
        class702 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (~arg2.field4102 != 0) {
            if (arg3.field2410 && ~arg2.field4085 != 0) {
                var10 = arg2.method1815(arg5, true, false);
            } else {
                var10 = arg2.method1815(arg5, false, false);
            }
            if (var10 != null) {
                var11 = arg3.field2401 + -(var10.method1076() - -1 >> 1);
                var12 = arg3.field2401 - -(1 + var10.method1076() >> 1);
                if (~var6 < ~var11) {
                    var6 = var11;
                }
                if (var7 < var12) {
                    var7 = var12;
                }
                var13 = arg3.field2400 + -(1 + var10.method1079() >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg3.field2400 - -(var10.method1079() + 1 >> 1);
                if (~var9 > ~var14) {
                    var9 = var14;
                }
            }
        }
        class82 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg2.field4088 != null) {
            var15 = class606.method3527(true, arg2.field4103);
            if (var15 != null) {
                var16 = class130.field2132.method3675(arg2.field4088, 116, (class702[]) null, (int[]) null, class366.field5745);
                int var23 = arg3.field2400;
                if (var10 != null) {
                    var17 = var23 - ((var10.method1079() >> 1) - -(var16 * var15.method774()));
                } else {
                    var17 = var23 - var16 * var15.method777() / 2;
                }
                for (int var24 = 0; ~var24 > ~var16; ++var24) {
                    String var25 = class366.field5745[var24];
                    if (~(var16 + -1) < ~var24) {
                        var25 = var25.substring(0, -4 + var25.length());
                    }
                    int var26 = var15.method775(var25);
                    if (~var26 < ~var18) {
                        var18 = var26;
                    }
                }
                var19 = arg3.field2401 + arg4 + -(var18 / 2);
                var20 = arg3.field2401 + arg4 - -(var18 / 2);
                if (~var19 > ~var6) {
                    var6 = var19;
                }
                if (~var20 < ~var7) {
                    var7 = var20;
                }
                var21 = arg1 + var17;
                if (var21 < var8) {
                    var8 = var21;
                }
                var22 = arg1 + var17 - -(var15.method774() * var16);
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (~class378.field5887 >= ~var7 && ~class378.field5899 <= ~var6 && var9 >= class378.field5890 && var8 <= class378.field5897) {
            if (arg0 > -22) {
                return false;
            } else {
                if (arg2.field4072 != null) {
                    int[] var27 = new int[arg2.field4072.length];
                    for (int var28 = 0; ~(var27.length / 2) < ~var28; ++var28) {
                        int var30 = arg2.field4072[var28 * 2] + arg3.field2406;
                        int var31 = arg2.field4072[var28 * 2 + 1] - -arg3.field2407;
                        var27[var28 * 2] = (-class378.field5903 + var30) * (-class378.field5887 + class378.field5899) / (-class378.field5903 + class378.field5892) + class378.field5887;
                        var27[var28 * 2 + 1] = -((-class378.field5893 + var31) * (-class378.field5890 + class378.field5897) / (-class378.field5893 + class378.field5900)) + class378.field5897;
                    }
                    class513.method3113(arg5, var27, arg2.field4099);
                    for (int var29 = 0; ~var29 > ~(var27.length / 2 - 1); ++var29) {
                        arg5.method1354(arg2.field4083, var27[var29 * 2 + 1], var27[var29 * 2 + 2 + 1], 65, var27[var29 * 2], var27[(var29 + 1) * 2]);
                    }
                    arg5.method1354(arg2.field4083, var27[var27.length + -1], var27[1], -80, var27[var27.length + -2], var27[0]);
                }
                if (var10 != null) {
                    if (~class471.field6976 < -1 && (class516.field7497 != -1 && class516.field7497 == arg3.field2408 || class204.field3329 != -1 && ~class204.field3329 == ~arg2.field4112)) {
                        int var32;
                        if (~class442.field6729 >= -51) {
                            var32 = class442.field6729 * 2;
                        } else {
                            var32 = -(class442.field6729 * 2) + 200;
                        }
                        int var33 = var32 << 24 | 16776960;
                        arg5.method1351(arg3.field2400, 114, var10.method1083() / 2 + 7, var33, arg3.field2401);
                        arg5.method1351(arg3.field2400, -73, 5 + var10.method1083() / 2, var33, arg3.field2401);
                        arg5.method1351(arg3.field2400, 114, var10.method1083() / 2 - -3, var33, arg3.field2401);
                        arg5.method1351(arg3.field2400, 113, 1 + var10.method1083() / 2, var33, arg3.field2401);
                        arg5.method1351(arg3.field2400, 119, var10.method1083() / 2, var33, arg3.field2401);
                    }
                    var10.method3960(arg3.field2401 - (var10.method1076() >> 1), arg3.field2400 + -(var10.method1079() >> 1));
                }
                if (arg2.field4088 != null && var15 != null) {
                    class235.method1698(var16, var17, arg3, var15, var18, 22, arg5, arg2);
                }
                if (arg2.field4102 != -1 || arg2.field4088 != null) {
                    class659 var34 = new class659(arg3);
                    var34.field9173 = var13;
                    var34.field9177 = var14;
                    var34.field9180 = var12;
                    var34.field9182 = var22;
                    var34.field9175 = var19;
                    var34.field9184 = var20;
                    var34.field9174 = var21;
                    var34.field9181 = var11;
                    class167.field2803.method3463((byte) -87, var34);
                }
                return false;
            }
        } else {
            return true;
        }
    }
}
