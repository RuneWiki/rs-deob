import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class51 extends class252 {

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "Ljd;")
    public static class85 field890 = class221.method1499("Musik)2Engine vorbereitet)3", (byte) 105);

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "Lsb;")
    public static class214 field889 = new class214(64);

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
    public static int field895 = 0;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        ++field894;
        if (arg1 != -55) {
            field890 = null;
        }
        int[] var3 = super.field4356.method868(arg0, (byte) -50);
        if (super.field4356.field2258) {
            int[] var4 = this.method1742((byte) 8, 0, arg0);
            int[] var5 = this.method1742((byte) 8, 1, arg0);
            int[] var6 = this.method1742((byte) 8, 2, arg0);
            for (int var7 = 0; ~var7 > ~class5.field63; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (~var8 != -1) {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lik;Z)V")
    public static final void method340(class247 arg0, boolean arg1) {
        ++field893;
        if (arg0.field4238.length - arg0.field4224 >= 1) {
            if (arg1) {
                method340((class247) null, false);
            }
            int var2 = arg0.method1711((byte) -67);
            if (var2 >= 0 && var2 <= 3) {
                byte var3;
                if (var2 != 3) {
                    if (~var2 == -3) {
                        var3 = 22;
                    } else if (~var2 == -2) {
                        var3 = 23;
                    } else {
                        var3 = 19;
                    }
                } else {
                    var3 = 23;
                }
                if (~(arg0.field4238.length + -arg0.field4224) <= ~var3) {
                    class3.field38 = arg0.method1711((byte) -67);
                    if (~class3.field38 > -2) {
                        class3.field38 = 1;
                    } else if (class3.field38 > 4) {
                        class3.field38 = 4;
                    }
                    class268.method1845(~arg0.method1711((byte) -67) == -2, (byte) -72);
                    class236.field4084 = arg0.method1711((byte) -67) == 1;
                    class31.field475 = ~arg0.method1711((byte) -67) == -2;
                    class214.field3762 = ~arg0.method1711((byte) -67) == -2;
                    class95.field1735 = ~arg0.method1711((byte) -67) == -2;
                    class25.field396 = ~arg0.method1711((byte) -67) == -2;
                    class180.field3093 = ~arg0.method1711((byte) -67) == -2;
                    class273.field4826 = ~arg0.method1711((byte) -67) == -2;
                    class11.field167 = arg0.method1711((byte) -67);
                    if (class11.field167 > 2) {
                        class11.field167 = 2;
                    }
                    if (var2 < 2) {
                        class240.field4136 = arg0.method1711((byte) -67) == 1;
                        arg0.method1711((byte) -67);
                    } else {
                        class240.field4136 = ~arg0.method1711((byte) -67) == -2;
                    }
                    class194.field3308 = ~arg0.method1711((byte) -67) == -2;
                    class98.field1775 = ~arg0.method1711((byte) -67) == -2;
                    class177.field3028 = arg0.method1711((byte) -67);
                    if (class177.field3028 > 2) {
                        class177.field3028 = 2;
                    }
                    class95.field1743 = arg0.method1711((byte) -67) == 1;
                    class85.field1565 = arg0.method1711((byte) -67);
                    if (class85.field1565 > 127) {
                        class85.field1565 = 127;
                    }
                    class270.field4793 = arg0.method1711((byte) -67);
                    class182.field3109 = arg0.method1711((byte) -67);
                    if (class182.field3109 > 127) {
                        class182.field3109 = 127;
                    }
                    if (var2 >= 1) {
                        class214.field3770 = arg0.method1694((byte) -100);
                        class152.field2600 = arg0.method1694((byte) -100);
                    }
                    if (~var2 <= -4) {
                        class193.field3296 = ~arg0.method1711((byte) -67) == -2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        if (arg2 != -99) {
            field895 = 41;
        }
        if (~arg1 == -1) {
            super.field4338 = arg0.method1711((byte) -67) == 1;
        }
        ++field888;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    public class51() {
        super(3, false);
    }

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)V")
    public static void method341(int arg0) {
        field890 = null;
        field889 = null;
        int var1 = 63 % (-arg0 / 36);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        int[][] var3 = super.field4350.method155(arg0, false);
        ++field891;
        if (super.field4350.field338) {
            int[] var4 = this.method1742((byte) 8, 2, arg0);
            int[][] var5 = this.method1737(0, 3, arg0);
            int[][] var6 = this.method1737(1, 3, arg0);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var6[0];
            int[] var13 = var6[1];
            int[] var14 = var6[2];
            int[] var15 = var5[2];
            for (int var16 = 0; var16 < class5.field63; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (~var17 != -1) {
                        int var18 = -var17 + 4096;
                        var8[var16] = var10[var16] * var17 + var12[var16] * var18 >> 12;
                        var7[var16] = var11[var16] * var17 + var13[var16] * var18 >> 12;
                        var9[var16] = var14[var16] * var18 + var15[var16] * var17 >> 12;
                    } else {
                        var8[var16] = var12[var16];
                        var7[var16] = var13[var16];
                        var9[var16] = var14[var16];
                    }
                } else {
                    var8[var16] = var10[var16];
                    var7[var16] = var11[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        if (arg1 != -123) {
            field896 = -68;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZLjb;)Ljb;")
    public static final class255 method342(boolean arg0, class255 arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field892;
            if (~arg1.field4530 != 0) {
                return class72.method506(arg1.field4530, 0);
            } else {
                int var2 = arg1.field4479 >>> 16;
                class127 var3 = new class127(class121.field2126);
                for (class129 var4 = (class129) var3.method856(-17301); var4 != null; var4 = (class129) var3.method861(-3)) {
                    if (var4.field2264 == var2) {
                        return class72.method506((int) var4.field4377, 0);
                    }
                }
                return null;
            }
        }
    }
}
