import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class141 extends class273 {

    @OriginalMember(owner = "client!kj", name = "lb", descriptor = "I")
    private int field2687 = -1;

    @OriginalMember(owner = "client!kj", name = "U", descriptor = "I")
    public static int field2670 = 0;

    @OriginalMember(owner = "client!kj", name = "T", descriptor = "Ljd;")
    public static class86 field2669 = class122.method868("gelb:", true);

    @OriginalMember(owner = "client!kj", name = "jb", descriptor = "Ljd;")
    private static class86 field2685 = class122.method868("Continue", true);

    @OriginalMember(owner = "client!kj", name = "X", descriptor = "I")
    public static int field2673 = 0;

    @OriginalMember(owner = "client!kj", name = "kb", descriptor = "Ljd;")
    public static class86 field2686 = field2685;

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!kj", name = "V", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!kj", name = "W", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!kj", name = "Z", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!kj", name = "ab", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!kj", name = "bb", descriptor = "I")
    private int field2677;

    @OriginalMember(owner = "client!kj", name = "cb", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!kj", name = "db", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!kj", name = "eb", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!kj", name = "fb", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!kj", name = "gb", descriptor = "I")
    private int field2682;

    @OriginalMember(owner = "client!kj", name = "hb", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!kj", name = "ib", descriptor = "Lwk;")
    public static class259 field2684;

    @OriginalMember(owner = "client!kj", name = "Y", descriptor = "[I")
    private int[] field2674;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "(I)V")
    public static final void method1000(int arg0) {
        ++field2679;
        if (!class195.field3506) {
            class46.field1022[0] = class205.field3708;
            if (~class209.field3776 != -1) {
                class57.field1168 = class272.field4765;
                class200.field3576 = class12.field398;
            } else if (~class143.field2712 != -1) {
                class57.field1168 = class39.field906;
                class200.field3576 = class185.field3288;
            } else {
                class200.field3576 = class6.field207;
                class57.field1168 = class90.field1841;
            }
            class16.field463 = 1;
            class188.field3332[0] = class56.field1155;
            class273.field4784[0] = 1003;
        }
        if (~class178.field3225 != 0) {
            class105.method755(-124, class178.field3225);
        }
        for (int var1 = 0; ~var1 > ~class51.field1062; ++var1) {
            if (class21.field540[var1]) {
                class204.field3686[var1] = true;
            }
            class215.field3886[var1] = class21.field540[var1];
            class21.field540[var1] = false;
        }
        class224.field4055 = null;
        class229.field4154 = -1;
        class66.field1299 = -1;
        class227.field4116 = class236.field4265;
        if (~class178.field3225 != 0) {
            class51.field1062 = 0;
            class91.method676(0, true, -1, class248.field4414, 0, class178.field3225, 0, class4.field53, 0);
        }
        class131.method925();
        class241.method1652(-13588);
        if (!class195.field3506) {
            if (class229.field4154 != -1) {
                class185.method1276(class229.field4154, 95, class66.field1299);
            }
        } else {
            class195.method1362((byte) -115);
        }
        if (~class195.field3501 == -4) {
            for (int var2 = 0; ~class51.field1062 < ~var2; ++var2) {
                if (class215.field3886[var2]) {
                    class131.method930(class127.field2439[var2], class37.field842[var2], class216.field3902[var2], class31.field665[var2], 16711935, 128);
                } else if (class204.field3686[var2]) {
                    class131.method930(class127.field2439[var2], class37.field842[var2], class216.field3902[var2], class31.field665[var2], 16711680, 128);
                }
            }
        }
        class33.method245(class180.field3244, class194.field3474, class124.field2412.field676, class124.field2412.field685, 73);
        class194.field3474 = 0;
        if (arg0 > -116) {
            method1005(-3, 122, -24, true);
        }
    }

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "(I)V")
    public static void method1001(int arg0) {
        field2685 = null;
        field2686 = null;
        field2684 = null;
        field2669 = null;
        if (arg0 != 0) {
            field2685 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljd;B)Z")
    public static final boolean method1002(class86 arg0, byte arg1) {
        ++field2672;
        if (arg0 == null) {
            return false;
        } else {
            for (int var2 = 0; ~class97.field1928 < ~var2; ++var2) {
                if (arg0.method631(12508, class100.field1957[var2])) {
                    return true;
                }
            }
            if (arg1 != -45) {
                method1004((int[]) null, 16, -55, 43, 91, 63);
            }
            return arg0.method631(12508, class124.field2412.field4029);
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)V")
    public final void method966(byte arg0) {
        super.method966(arg0);
        ++field2675;
        this.field2674 = null;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class141() {
        super(0, false);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)Z")
    private final boolean method1003(boolean arg0) {
        ++field2668;
        if (this.field2674 != null) {
            return true;
        } else if (~this.field2687 <= -1) {
            int var2 = class96.field1896;
            int var3 = class176.field3200;
            int var4 = !class160.field3009.method183(this.field2687, (byte) 123) ? 128 : 64;
            this.field2674 = class160.field3009.method184(this.field2687, 2047);
            this.field2677 = var4;
            this.field2682 = var4;
            class9.method60(true, var3, var2);
            return this.field2674 != null;
        } else {
            return !arg0;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([IIIIII)V")
    public static final void method1004(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class249 var6 = class248.field4406[arg3][arg4][arg5];
        if (var6 != null) {
            class236 var7 = var6.field4442;
            if (var7 == null) {
                class110 var10 = var6.field4444;
                if (var10 != null) {
                    int var11 = var10.field2101;
                    int var12 = var10.field2098;
                    int var13 = var10.field2099;
                    int var14 = var10.field2103;
                    int[] var15 = class70.field1440[var11];
                    int[] var16 = class96.field1915[var12];
                    int var17 = 0;
                    if (var13 != 0) {
                        for (int var18 = 0; var18 < 4; ++var18) {
                            arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg1 += arg2;
                        }
                    } else {
                        for (int var19 = 0; var19 < 4; ++var19) {
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 2] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 3] = var14;
                            }
                            arg1 += arg2;
                        }
                    }
                }
            } else {
                int var8 = var7.field4262;
                if (var8 != 0) {
                    for (int var9 = 0; var9 < 4; ++var9) {
                        arg0[arg1] = var8;
                        arg0[arg1 + 1] = var8;
                        arg0[arg1 + 2] = var8;
                        arg0[arg1 + 3] = var8;
                        arg1 += arg2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIZ)Ljd;")
    public static final class86 method1005(int arg0, int arg1, int arg2, boolean arg3) {
        ++field2680;
        if (arg1 >= 2 && arg1 <= 36) {
            int var4 = 1;
            if (arg0 != 4709) {
                method1000(-96);
            }
            for (int var5 = arg2 / arg1; ~var5 != -1; var5 /= arg1) {
                ++var4;
            }
            int var6 = var4;
            if (~arg2 > -1 || arg3) {
                var6 = var4 + 1;
            }
            byte[] var7 = new byte[var6];
            if (~arg2 > -1) {
                var7[0] = 45;
            } else if (arg3) {
                var7[0] = 43;
            }
            for (int var8 = 0; ~var8 > ~var4; ++var8) {
                int var10 = arg2 % arg1;
                arg2 /= arg1;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (~var10 < -10) {
                    var10 += 39;
                }
                var7[var6 + -1 + -var8] = (byte) (var10 + 48);
            }
            class86 var9 = new class86();
            var9.field1670 = var7;
            var9.field1704 = var6;
            return var9;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)I")
    public final int method1006(byte arg0) {
        if (arg0 < 118) {
            return 41;
        } else {
            ++field2681;
            return this.field2687;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method29(int arg0, byte arg1) {
        ++field2671;
        int[][] var3 = super.field4787.method1657(arg0, (byte) -122);
        if (super.field4787.field4355 && this.method1003(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = (~class96.field1896 == ~this.field2677 ? arg0 : this.field2677 * arg0 / class96.field1896) * this.field2682;
            int[] var7 = var3[2];
            if (~class176.field3200 == ~this.field2682) {
                for (int var8 = 0; ~var8 > ~class176.field3200; ++var8) {
                    int var9 = this.field2674[var6++];
                    var7[var8] = class1.method5(255, var9) << 4;
                    var5[var8] = class1.method5(65280, var9) >> 4;
                    var4[var8] = class1.method5(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class176.field3200; ++var10) {
                    int var11 = this.field2682 * var10 / class176.field3200;
                    int var12 = this.field2674[var6 - -var11];
                    var7[var10] = class1.method5(255, var12) << 4;
                    var5[var10] = class1.method5(var12 >> 4, 4080);
                    var4[var10] = class1.method5(16711680, var12) >> 12;
                }
            }
        }
        int var13 = 105 % ((12 - arg1) / 58);
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        if (~arg0 == -1) {
            this.field2687 = arg1.method1410(-55);
        }
        ++field2676;
        if (arg2 >= -16) {
            field2670 = 121;
        }
    }
}
