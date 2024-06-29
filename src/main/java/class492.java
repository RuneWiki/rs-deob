import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class492 extends class642 {

    @OriginalMember(owner = "client!rfa", name = "K", descriptor = "[B")
    private byte[] field6993 = new byte[512];

    @OriginalMember(owner = "client!rfa", name = "J", descriptor = "[S")
    private short[] field6992 = new short[512];

    @OriginalMember(owner = "client!rfa", name = "L", descriptor = "I")
    private int field6994 = 2048;

    @OriginalMember(owner = "client!rfa", name = "D", descriptor = "I")
    private int field6986 = 5;

    @OriginalMember(owner = "client!rfa", name = "G", descriptor = "I")
    private int field6989 = 5;

    @OriginalMember(owner = "client!rfa", name = "F", descriptor = "I")
    private int field6988 = 0;

    @OriginalMember(owner = "client!rfa", name = "N", descriptor = "I")
    private int field6996 = 1;

    @OriginalMember(owner = "client!rfa", name = "R", descriptor = "I")
    private int field7000 = 2;

    @OriginalMember(owner = "client!rfa", name = "M", descriptor = "Lvg;")
    public static class622 field6995 = new class622(59, 2);

    @OriginalMember(owner = "client!rfa", name = "P", descriptor = "Lnw;")
    public static class619 field6998 = new class619();

    @OriginalMember(owner = "client!rfa", name = "U", descriptor = "I")
    public static int field7003 = -1;

    @OriginalMember(owner = "client!rfa", name = "C", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!rfa", name = "E", descriptor = "I")
    public static int field6987;

    @OriginalMember(owner = "client!rfa", name = "H", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!rfa", name = "I", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!rfa", name = "O", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!rfa", name = "Q", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!rfa", name = "S", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!rfa", name = "T", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!rfa", name = "V", descriptor = "Ljava/lang/Object;")
    public static Object field7004;

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field6985;
        if (arg1 != -9) {
            field7003 = -72;
        }
        int[] var3 = super.field9216.method1185(arg0, -118);
        if (super.field9216.field2418) {
            int var4 = class400.field6026[arg0] * this.field6989 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class338.field4909; ++var7) {
                class533.field7842 = Integer.MAX_VALUE;
                class328.field4743 = Integer.MAX_VALUE;
                class440.field6399 = Integer.MAX_VALUE;
                class108.field1608 = Integer.MAX_VALUE;
                int var8 = class542.field8026[var7] * this.field6986 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = this.field6993[(~var11 <= ~this.field6989 ? -this.field6989 + var11 : var11) & 255] & 255;
                    for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                        int var15 = (this.field6993[var13 - -(var14 >= this.field6986 ? -this.field6986 + var14 : var14) & 255] & 255) * 2;
                        int var27 = var15 + 1;
                        int var16 = var8 - (this.field6992[var15] - -(var14 << 12));
                        int var17 = -(var11 << 12) - (this.field6992[var27] - var4);
                        int var18 = this.field6996;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (~var16 <= -1 ? var16 : -var16) + (var17 >= 0 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 < 0 ? -var16 : var16;
                                int var26 = ~var17 <= -1 ? var17 : -var17;
                                var19 = var25 <= var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~class108.field1608 < ~var19) {
                            class533.field7842 = class328.field4743;
                            class328.field4743 = class440.field6399;
                            class440.field6399 = class108.field1608;
                            class108.field1608 = var19;
                        } else if (~class440.field6399 >= ~var19) {
                            if (var19 < class328.field4743) {
                                class533.field7842 = class328.field4743;
                                class328.field4743 = var19;
                            } else if (var19 < class533.field7842) {
                                class533.field7842 = var19;
                            }
                        } else {
                            class533.field7842 = class328.field4743;
                            class328.field4743 = class440.field6399;
                            class440.field6399 = var19;
                        }
                    }
                }
                int var12 = this.field7000;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class108.field1608 + class440.field6399;
                                }
                            } else {
                                var3[var7] = class533.field7842;
                            }
                        } else {
                            var3[var7] = class328.field4743;
                        }
                    } else {
                        var3[var7] = class440.field6399;
                    }
                } else {
                    var3[var7] = class108.field1608;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Z)V")
    public static final void method2811(boolean arg0) {
        ++field7002;
        if (class567.field8270 != -1) {
            if (!arg0) {
                method2813((class98) null, true);
            }
            int var1 = class315.field4612.method2340(40960);
            int var2 = class315.field4612.method2338((byte) 68);
            class147 var3 = (class147) class430.field6262.method1904(false);
            if (var3 != null) {
                var1 = var3.method478(0);
                var2 = var3.method475(-2);
            }
            class641.method3651(0, 0, class567.field8270, class425.field6218, var1, 0, 0, var2, class454.field6538, !arg0);
            if (class574.field8343 != null) {
                class454.method2665(var1, var2, (byte) 123);
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)V")
    private final void method2812(byte arg0) {
        int var2 = -92 / ((68 - arg0) / 35);
        ++field6999;
        Random var3 = new Random((long) this.field6988);
        this.field6992 = new short[512];
        if (~this.field6994 < -1) {
            for (int var4 = 0; ~var4 > -513; ++var4) {
                this.field6992[var4] = (short) class339.method2095(true, var3, this.field6994);
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lr;Z)V")
    public static final void method2813(class98 arg0, boolean arg1) {
        ++field6991;
        int var2 = class201.field2730;
        int var3 = class291.field4283;
        int var4 = class367.field5374;
        int var5 = class232.field3067 + -3;
        if (arg1) {
            method2814();
        }
        byte var6 = 20;
        if (class46.field711 == null || class652.field9332 == null) {
            if (class595.field8616.method1818(class302.field4474, 4) && class595.field8616.method1818(class578.field8394, 4)) {
                class46.field711 = arg0.method660(class616.method3509(class595.field8616, class302.field4474, 0), true);
                class616 var7 = class616.method3509(class595.field8616, class578.field8394, 0);
                class652.field9332 = arg0.method660(var7, true);
                var7.method3514();
                class177.field2473 = arg0.method660(var7, true);
            } else {
                arg0.method700(var2, var3, var4, var6, class400.field6029 | -class102.field1537 + 255 << 24, 1);
            }
        }
        if (class46.field711 != null && class652.field9332 != null) {
            int var8 = (-(class652.field9332.method48() * 2) + var4) / class46.field711.method48();
            for (int var9 = 0; ~var9 > ~var8; ++var9) {
                class46.field711.method1534(class652.field9332.method48() + (var2 - -(var9 * class46.field711.method48())), var3);
            }
            class652.field9332.method1534(var2, var3);
            class177.field2473.method1534(-class177.field2473.method48() + var4 + var2, var3);
        }
        class395.field5976.method2447(var2 + 3, class279.field3649.method1654(123, class262.field3401), class675.field9516 | -16777216, 2, var3 + 14, -1);
        arg0.method700(var2, var3 + var6, var4, -var6 + var5, class400.field6029 | -class102.field1537 + 255 << 24, 1);
        int var10 = class315.field4612.method2340(40960);
        int var11 = class315.field4612.method2338((byte) 72);
        int var12 = 0;
        for (class426 var13 = (class426) class152.field2150.method1904(arg1); var13 != null; var13 = (class426) class152.field2150.method1901(120)) {
            int var31 = (class373.field5520 + -1 - var12) * 16 + var6 + 13 + var3;
            if (var10 > var2 && var10 < var2 + var4 && var31 + -13 < var11 && var31 + 4 > var11 && var13.field6232) {
                arg0.method700(var2, var31 + -12, var4, 16, -class497.field7034 + 255 << 24 | class74.field1161, 1);
            }
            ++var12;
        }
        if ((class612.field8821 == null || class541.field8023 == null || class552.field8120 == null) && class595.field8616.method1818(class375.field5659, 4) && class595.field8616.method1818(class48.field765, 4) && class595.field8616.method1818(class432.field6275, 4)) {
            class616 var14 = class616.method3509(class595.field8616, class48.field765, 0);
            class541.field8023 = arg0.method660(var14, true);
            var14.method3514();
            class200.field2722 = arg0.method660(var14, true);
            class612.field8821 = arg0.method660(class616.method3509(class595.field8616, class375.field5659, 0), true);
            class616 var15 = class616.method3509(class595.field8616, class432.field6275, 0);
            class552.field8120 = arg0.method660(var15, true);
            var15.method3514();
            class699.field9837 = arg0.method660(var15, true);
        }
        int var16 = 0;
        if (class612.field8821 != null && class541.field8023 != null && class552.field8120 != null) {
            int var17 = (-(class552.field8120.method48() * 2) + var4) / class612.field8821.method48();
            for (int var18 = 0; var17 > var18; ++var18) {
                class612.field8821.method1534(var2 + class552.field8120.method48() - -(var18 * class612.field8821.method48()), -class612.field8821.method56() + var3 - -var5);
            }
            int var19 = (-class552.field8120.method56() + -var6 + var5) / class541.field8023.method56();
            for (int var20 = 0; ~var20 > ~var19; ++var20) {
                class541.field8023.method1534(var2, var20 * class541.field8023.method56() + var6 + var3);
                class200.field2722.method1534(-class200.field2722.method48() + (var2 - -var4), class541.field8023.method56() * var20 + var6 + var3);
            }
            class552.field8120.method1534(var2, var5 + (var3 - class552.field8120.method56()));
            class699.field9837.method1534(-class552.field8120.method48() + var2 + var4, var3 - (-var5 + class552.field8120.method56()));
        }
        for (class426 var21 = (class426) class152.field2150.method1904(arg1); var21 != null; var21 = (class426) class152.field2150.method1901(97)) {
            int var22 = var3 - -13 - -((class373.field5520 + -1 + -var16) * 16) + var6;
            int var23 = class675.field9516 | -16777216;
            if (~var10 < ~var2 && var10 < var2 - -var4 && ~(var22 + -13) > ~var11 && ~(var22 + 4) < ~var11 && var21.field6232) {
                var23 = class477.field6834 | -16777216;
            }
            int[] var24 = null;
            if (!class56.method352(var21.field6223, (byte) -91)) {
                if (var21.field6227 == -1) {
                    if (class160.method1140(false, var21.field6223)) {
                        class177 var25 = (class177) class271.field3550.method2002((byte) -108, (long) ((int) var21.field6231));
                        if (var25 != null) {
                            class53 var26 = var25.field2476;
                            class76 var27 = var26.field805;
                            if (var27.field1212 != null) {
                                var27 = var27.method443(class308.field4545, (byte) 90);
                            }
                            if (var27 != null) {
                                var24 = var27.field1174;
                            }
                        }
                    } else if (class643.method3664(var21.field6223, false)) {
                        Object var28 = null;
                        class289 var29;
                        if (var21.field6223 == 1007) {
                            var29 = class60.field965.method2596(0, (int) var21.field6231);
                        } else {
                            var29 = class60.field965.method2596(0, (int) (2147483647L & var21.field6231 >>> 32));
                        }
                        if (var29.field4213 != null) {
                            var29 = var29.method1788(class308.field4545, -94);
                        }
                        if (var29 != null) {
                            var24 = var29.field4247;
                        }
                    }
                } else {
                    var24 = class259.field3355.method2382(var21.field6227, (byte) 28).field5842;
                }
            } else {
                var24 = class259.field3355.method2382((int) var21.field6231, (byte) 28).field5842;
            }
            String var30 = class443.method2616(var21, 119);
            if (var24 != null) {
                var30 = var30 + class365.method2237(var24, -16907);
            }
            class395.field5976.method2439(var2 - -3, 0, var22, var23, 0, class224.field2975, var30, class386.field5772);
            if (var21.field6221) {
                class547.field8065.method1534(class141.field2042.method3455(var30, (byte) 1) + 5 + var2, var22 + -12);
            }
            ++var16;
        }
        class351.method2178(class291.field4283, class232.field3067, class367.field5374, 0, class201.field2730);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILgk;B)V")
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (arg2 <= 29) {
            field7004 = null;
        }
        ++field6997;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field6989 = arg1.method3115(29871);
                                }
                            } else {
                                this.field6986 = arg1.method3115(29871);
                            }
                        } else {
                            this.field6996 = arg1.method3115(29871);
                        }
                    } else {
                        this.field7000 = arg1.method3115(29871);
                    }
                } else {
                    this.field6994 = arg1.method3169(26488);
                }
            } else {
                this.field6988 = arg1.method3115(29871);
            }
        } else {
            this.field6986 = this.field6989 = arg1.method3115(29871);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "()V")
    public class492() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "()V")
    public static final void method2814() {
        for (int var0 = 0; var0 < class466.field6718.length; ++var0) {
            class466.field6718[var0].method3949();
        }
        class466.field6718 = null;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lf;IIILps;Lua;BI)V")
    public static final void method2815(class256 arg0, int arg1, int arg2, int arg3, class5 arg4, class591 arg5, byte arg6, int arg7) {
        ++field6987;
        if (arg0 != null) {
            int var8;
            if (class684.field9659 == 4) {
                var8 = (int) class311.field4589 & 16383;
            } else {
                var8 = (int) class311.field4589 - -class53.field817 & 16383;
            }
            int var9 = 10 + Math.max(arg4.field202 / 2, arg4.field76 / 2);
            int var10 = arg1 * arg1 + arg2 * arg2;
            if (var10 <= var9 * var9) {
                int var11 = -26 / ((12 - arg6) / 38);
                int var12 = class271.field3549[var8];
                int var13 = class271.field3544[var8];
                if (~class684.field9659 != -5) {
                    var12 = var12 * 256 / (class697.field9826 - -256);
                    var13 = var13 * 256 / (class697.field9826 + 256);
                }
                int var14 = arg2 * var12 - -(arg1 * var13) >> 14;
                int var15 = arg2 * var13 + -(arg1 * var12) >> 14;
                arg0.method51(arg4.field202 / 2 + arg7 + var14 + -(arg0.method50() / 2), arg3 + (arg4.field76 / 2 - (var15 - -(arg0.method43() / 2))), arg5, arg7, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "(I)V")
    public final void method2(int arg0) {
        this.field6993 = class468.method2706((byte) -56, this.field6988);
        ++field7001;
        this.method2812((byte) -3);
        if (arg0 != 6276) {
            field6995 = null;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZII)I")
    public static final int method2816(boolean arg0, int arg1, int arg2) {
        ++field6990;
        if (arg0) {
            method2815((class256) null, -4, -70, 60, (class5) null, (class591) null, (byte) 3, -96);
        }
        return arg1 != 1 && arg1 != 3 ? class620.field8981[arg2 & 3] : class309.field4547[arg2 & 3];
    }

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "(I)V")
    public static void method2817(int arg0) {
        field7004 = null;
        field6998 = null;
        field6995 = null;
        int var1 = 17 / ((36 - arg0) / 40);
    }
}
