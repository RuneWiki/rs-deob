import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class263 extends class80 {

    @OriginalMember(owner = "client!ab", name = "xb", descriptor = "Leg;")
    public static class37 field4630 = class174.method1167("<col=ffffff> )4 ", -30);

    @OriginalMember(owner = "client!ab", name = "vb", descriptor = "Leg;")
    public static class37 field4628 = class174.method1167("::gc", 70);

    @OriginalMember(owner = "client!ab", name = "Bb", descriptor = "[I")
    public static int[] field4634 = new int[5];

    @OriginalMember(owner = "client!ab", name = "ub", descriptor = "Leg;")
    public static class37 field4627 = class174.method1167("::tele ", -57);

    @OriginalMember(owner = "client!ab", name = "Db", descriptor = "Leg;")
    private static class37 field4636 = class174.method1167("flash2:", 88);

    @OriginalMember(owner = "client!ab", name = "yb", descriptor = "Leg;")
    public static class37 field4631 = field4636;

    @OriginalMember(owner = "client!ab", name = "Ab", descriptor = "Leg;")
    public static class37 field4633 = field4636;

    @OriginalMember(owner = "client!ab", name = "sb", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!ab", name = "tb", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!ab", name = "wb", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!ab", name = "zb", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!ab", name = "Cb", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!ab", name = "Eb", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!ab", name = "Fb", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILpe;)Leg;")
    public static final class37 method1775(int arg0, class237 arg1) {
        ++field4635;
        if (class285.method1910(client.method787(arg1), -19253) == arg0) {
            return null;
        } else if (arg1.field4190 != null && arg1.field4190.method255(-157).method222((byte) 112) != 0) {
            return arg1.field4190;
        } else {
            return class126.field2117 ? class63.field1035 : null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(BI)[[I")
    public final int[][] method193(byte arg0, int arg1) {
        int[][] var3 = super.field2585.method1532(arg1, -97);
        if (arg0 != 115) {
            return null;
        } else {
            if (super.field2585.field3761 && this.method542(1)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg1 % super.field1255 * super.field1255;
                for (int var8 = 0; class227.field3898 > var8; ++var8) {
                    int var9 = super.field1250[var7 - -(var8 % super.field1246)];
                    var6[var8] = class96.method626(var9 << 4, 4080);
                    var5[var8] = class96.method626(var9 >> 4, 4080);
                    var4[var8] = class96.method626(var9, 16711680) >> 12;
                }
            }
            ++field4638;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(III)Loa;")
    public static final class273 method1776(int arg0, int arg1, int arg2) {
        class111 var3 = class286.field5048[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class273 var4 = var3.field1875;
            var3.field1875 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)I")
    public static final int method1777(int arg0, byte arg1) {
        ++field4632;
        int var8 = arg0 - 1;
        int var2 = var8 | var8 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = 56 / ((-38 - arg1) / 58);
        int var6 = var4 | var4 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return var7 + 1;
    }

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "(I)V")
    public static void method1778(int arg0) {
        field4634 = null;
        field4633 = null;
        field4628 = null;
        field4627 = null;
        field4630 = null;
        field4636 = null;
        field4631 = null;
        if (arg0 != 22909) {
            field4631 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(III)I")
    public static final int method1779(int arg0, int arg1, int arg2) {
        ++field4625;
        if (~arg2 == 1) {
            return 12345678;
        } else {
            if (arg1 >= -113) {
                method1775(91, (class237) null);
            }
            if (~arg2 == 0) {
                if (~arg0 <= -3) {
                    if (~arg0 < -127) {
                        arg0 = 126;
                    }
                } else {
                    arg0 = 2;
                }
                return arg0;
            } else {
                int var3 = (arg2 & 127) * arg0 >> 7;
                if (~var3 > -3) {
                    var3 = 2;
                } else if (~var3 < -127) {
                    var3 = 126;
                }
                return (65408 & arg2) - -var3;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBILjl;)Lni;")
    public static final class195 method1780(int arg0, byte arg1, int arg2, class101 arg3) {
        if (arg1 != -51) {
            method1779(-62, -29, 81);
        }
        ++field4626;
        return !class131.method941(arg0, arg3, arg2, -123) ? null : class252.method1727(-123);
    }

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "(I)V")
    public static final void method1781(int arg0) {
        if (arg0 == -25157) {
            for (int var1 = 0; ~var1 > ~class159.field2658; ++var1) {
                int var10002 = class235.field4055[var1]--;
                if (~class235.field4055[var1] <= 9) {
                    class103 var3 = class202.field3446[var1];
                    if (var3 == null) {
                        var3 = class103.method693(class243.field4366, class202.field3443[var1], 0);
                        if (var3 == null) {
                            continue;
                        }
                        class235.field4055[var1] += var3.method690();
                        class202.field3446[var1] = var3;
                    }
                    if (~class235.field4055[var1] > -1) {
                        int var10;
                        if (~class42.field667[var1] != -1) {
                            int var4 = (class42.field667[var1] & 255) * 128;
                            int var5 = (class42.field667[var1] & 16753221) >> 16;
                            int var6 = (class42.field667[var1] & 65409) >> 8;
                            int var7 = var5 * 128 + 64 + -class82.field1285.field1799;
                            if (~var7 > -1) {
                                var7 = -var7;
                            }
                            int var8 = var6 * 128 + -class82.field1285.field1793 + 64;
                            if (var8 < 0) {
                                var8 = -var8;
                            }
                            int var9 = var7 + -128 + var8;
                            if (var9 > var4) {
                                class235.field4055[var1] = -100;
                                continue;
                            }
                            if (var9 < 0) {
                                var9 = 0;
                            }
                            var10 = (-var9 + var4) * class151.field2544 / var4;
                        } else {
                            var10 = class156.field2602;
                        }
                        if (~var10 < -1) {
                            class142 var11 = var3.method692().method1000(class152.field2557);
                            class57 var12 = class57.method402(var11, 100, var10);
                            var12.method406(class281.field4957[var1] - 1);
                            class127.field2127.method1512(var12);
                        }
                        class235.field4055[var1] = -100;
                    }
                } else {
                    --class159.field2658;
                    for (int var2 = var1; ~var2 > ~class159.field2658; ++var2) {
                        class202.field3443[var2] = class202.field3443[var2 - -1];
                        class202.field3446[var2] = class202.field3446[var2 + 1];
                        class281.field4957[var2] = class281.field4957[var2 + 1];
                        class235.field4055[var2] = class235.field4055[var2 + 1];
                        class42.field667[var2] = class42.field667[var2 - -1];
                    }
                    --var1;
                }
            }
            ++field4637;
            if (class108.field1720 && !class152.method1044(0)) {
                if (~class252.field4507 != -1 && ~class137.field2344 != 0) {
                    class148.method1020(class92.field1449, -2744, false, class137.field2344, 0, class252.field4507);
                }
                class108.field1720 = false;
            } else if (~class252.field4507 != -1 && ~class137.field2344 != 0 && !class152.method1044(0)) {
                class273.field4778.method1697(202, 102);
                class273.field4778.method1272(27862, class137.field2344);
                class137.field2344 = -1;
                ++class116.field1978;
            }
        }
    }
}
