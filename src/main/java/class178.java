import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class178 extends class276 {

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "I")
    private int field2935 = 4;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "I")
    private int field2927 = 4;

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "I")
    public static int field2937 = 0;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    public static int field2929 = 0;

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "Lid;")
    public static class100 field2933;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "Lvh;")
    public static class108 field2928;

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "[[[I")
    public static int[][][] field2936;

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class178() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field2927 = arg1.method669((byte) 36);
            }
        } else {
            this.field2935 = arg1.method669((byte) 36);
        }
        if (arg2 == -1) {
            ++field2940;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIB)Lcc;")
    public static final class194 method1180(int arg0, int arg1, int arg2, byte arg3) {
        ++field2934;
        class194 var4 = new class194();
        var4.field3137 = arg0;
        var4.field3128 = arg1;
        class41.field607.method780((byte) -78, (long) arg2, var4);
        class273.method1795(-122, arg1);
        class46 var5 = class108.method760(-29533, arg2);
        if (var5 != null) {
            class79.method516(-373, var5);
        }
        if (class139.field2404 != null) {
            class79.method516(-373, class139.field2404);
            class139.field2404 = null;
        }
        int var6 = class275.field4399;
        for (int var7 = 0; ~var7 > ~var6; ++var7) {
            if (class21.method147((byte) 85, class101.field1788[var7])) {
                class62.method393(1, var7);
            }
        }
        if (arg3 <= 86) {
            method1180(-85, 121, 40, (byte) -52);
        }
        if (class275.field4399 == 1) {
            class248.field4074 = false;
            class264.method1750(class127.field2244, class95.field1641, class144.field2469, class22.field340, (byte) 71);
        } else {
            class264.method1750(class127.field2244, class95.field1641, class144.field2469, class22.field340, (byte) 91);
            int var8 = class290.field4636.method1622(class240.field3949);
            for (int var9 = 0; class275.field4399 > var9; ++var9) {
                int var10 = class290.field4636.method1622(class245.method1639((byte) 36, var9));
                if (~var8 > ~var10) {
                    var8 = var10;
                }
            }
            class95.field1641 = var8 + 8;
            class127.field2244 = class275.field4399 * 15 - -(class60.field1050 ? 26 : 22);
        }
        if (var5 != null) {
            class89.method580(true, false, var5);
        }
        class224.method1507(0, arg1);
        if (~client.field4545 != 0) {
            class252.method1670(client.field4545, 1, (byte) -77);
        }
        return var4;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)[[I")
    public final int[][] method300(int arg0, int arg1) {
        if (arg1 != -1) {
            this.method21(-111, (class101) null, (byte) 100);
        }
        ++field2932;
        int[][] var3 = super.field4418.method835((byte) 121, arg0);
        if (super.field4418.field2164) {
            int var4 = class53.field929 / this.field2935;
            int var5 = class209.field3540 / this.field2927;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method1810((byte) -23, class209.field3540 * var6 / var5, 0);
            } else {
                var7 = this.method1810((byte) 100, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[2];
            int[] var13 = var3[1];
            for (int var14 = 0; class53.field929 > var14; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class53.field929 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var13[var14] = var9[var16];
                var12[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        ++field2938;
        if (arg0 <= 39) {
            this.field2935 = 3;
        }
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            int var4 = class53.field929 / this.field2935;
            int var5 = class209.field3540 / this.field2927;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method1805(false, 0, class209.field3540 * var6 / var5);
            } else {
                var7 = this.method1805(false, 0, 0);
            }
            for (int var8 = 0; class53.field929 > var8; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class53.field929 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)V")
    public static final void method1181(byte arg0, int arg1) {
        ++field2939;
        class267.field4315.method63(0, arg1);
        if (arg0 >= -47) {
            method1183(false, (class46[]) null, 93);
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)V")
    public static void method1182(byte arg0) {
        field2928 = null;
        int var1 = 103 / ((-46 - arg0) / 56);
        field2933 = null;
        field2936 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z[Ldl;I)V")
    public static final void method1183(boolean arg0, class46[] arg1, int arg2) {
        for (int var3 = 0; ~arg1.length < ~var3; ++var3) {
            class46 var4 = arg1[var3];
            if (var4 != null && ~var4.field660 == ~arg2 && (!var4.field734 || !client.method1919(var4))) {
                if (var4.field812 == 0) {
                    if (!var4.field734 && client.method1919(var4) && class201.field3304 != var4) {
                        continue;
                    }
                    method1183(arg0, arg1, var4.field786);
                    if (var4.field785 != null) {
                        method1183(true, var4.field785, var4.field786);
                    }
                    class194 var5 = (class194) class41.field607.method779(-91, (long) var4.field786);
                    if (var5 != null) {
                        class203.method1344(var5.field3128, (byte) -115);
                    }
                }
                if (var4.field812 == 6) {
                    if (~var4.field708 != 0 || var4.field783 != -1) {
                        boolean var6 = class49.method303(0, var4);
                        int var7;
                        if (!var6) {
                            var7 = var4.field708;
                        } else {
                            var7 = var4.field783;
                        }
                        if (~var7 != 0) {
                            class167 var8 = class105.method714(var7, (byte) 67);
                            if (var8 != null) {
                                var4.field802 += class191.field3087;
                                while (~var8.field2751[var4.field760] > ~var4.field802) {
                                    var4.field802 -= var8.field2751[var4.field760];
                                    ++var4.field760;
                                    if (~var4.field760 <= ~var8.field2736.length) {
                                        var4.field760 -= var8.field2725;
                                        if (~var4.field760 > -1 || var4.field760 >= var8.field2736.length) {
                                            var4.field760 = 0;
                                        }
                                    }
                                    var4.field643 = var4.field760 + 1;
                                    if (var8.field2736.length <= var4.field643) {
                                        var4.field643 -= var8.field2725;
                                        if (~var4.field643 > -1 || ~var8.field2736.length >= ~var4.field643) {
                                            var4.field643 = -1;
                                        }
                                    }
                                    class79.method516(-373, var4);
                                }
                            }
                        }
                    }
                    if (var4.field668 != 0 && !var4.field734) {
                        int var9 = var4.field668 >> 16;
                        int var10 = var4.field668 << 16 >> 16;
                        int var11 = class191.field3087 * var9;
                        int var12 = class191.field3087 * var10;
                        var4.field741 = 2047 & var4.field741 + var11;
                        var4.field816 = var4.field816 + var12 & 2047;
                        class79.method516(-373, var4);
                    }
                }
            }
        }
        ++field2931;
        if (!arg0) {
            field2933 = null;
        }
    }
}
