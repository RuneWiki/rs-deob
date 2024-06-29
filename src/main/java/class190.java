import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class190 extends class149 {

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    private int field2660 = 4096;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    private int field2658 = 0;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "[I")
    public static int[] field2659 = new int[5];

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "Lui;")
    public static class375 field2661 = new class375("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "Lcm;")
    public static class449 field2664 = new class449(53, 3);

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "[I")
    public static int[] field2668 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BIZZI)V")
    public static final void method1327(byte arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        ++field2666;
        if (arg3 || class10.field163 != arg4 || ~class77.field1036 != ~arg1 || class430.field6399 != class195.field2770 && !class96.field1399.method1734(121, class441.field6563)) {
            class430.field6399 = class195.field2770;
            class77.field1036 = arg1;
            class10.field163 = arg4;
            if (class96.field1399.method1734(120, class441.field6563)) {
                class430.field6399 = 0;
            }
            if (arg2) {
                class524.method3106(28, (byte) 14);
            } else {
                class524.method3106(25, (byte) 86);
            }
            class252.method1645(class84.field1153, (byte) 31, class107.field1512.method2335((byte) -100, class288.field4292), true);
            int var5 = class82.field1105;
            int var6 = class437.field6477;
            class82.field1105 = (-(class96.field1403 >> 4) + class10.field163) * 8;
            class437.field6477 = (-(class485.field7122 >> 4) + class77.field1036) * 8;
            class296.field4399 = class135.method875(class10.field163 * 8, class77.field1036 * 8);
            class465.field6792 = null;
            int var7 = -var5 + class82.field1105;
            int var8 = -var6 + class437.field6477;
            if (!arg2) {
                for (int var9 = 0; var9 < 32768; ++var9) {
                    class194 var10 = class151.field2174[var9];
                    if (var10 != null) {
                        for (int var11 = 0; ~var11 > -11; ++var11) {
                            var10.field5339[var11] -= var7;
                            var10.field5344[var11] -= var8;
                        }
                        var10.field2215 -= var8 * 128;
                        var10.field2217 -= var7 * 128;
                    }
                }
            } else {
                class25.field411 = 0;
                int var12 = (class96.field1403 + -1) * 128;
                int var13 = (class485.field7122 + -1) * 128;
                for (int var14 = 0; var14 < 32768; ++var14) {
                    class194 var22 = class151.field2174[var14];
                    if (var22 != null) {
                        var22.field2215 -= var8 * 128;
                        var22.field2217 -= var7 * 128;
                        if (~var22.field2217 <= -1 && var22.field2217 <= var12 && var22.field2215 >= 0 && var13 >= var22.field2215) {
                            boolean var23 = true;
                            for (int var24 = 0; var24 < 10; ++var24) {
                                var22.field5339[var24] -= var7;
                                var22.field5344[var24] -= var8;
                                if (var22.field5339[var24] < 0 || ~var22.field5339[var24] <= ~class96.field1403 || ~var22.field5344[var24] > -1 || ~var22.field5344[var24] <= ~class485.field7122) {
                                    var23 = false;
                                }
                            }
                            if (!var23) {
                                class151.field2174[var14].method1364((class329) null, 85);
                                class151.field2174[var14] = null;
                            } else {
                                class259.field3609[class25.field411++] = var14;
                            }
                        } else {
                            class151.field2174[var14].method1364((class329) null, 66);
                            class151.field2174[var14] = null;
                        }
                    }
                }
            }
            for (int var15 = 0; ~var15 > -2049; ++var15) {
                class322 var20 = class439.field6539[var15];
                if (var20 != null) {
                    for (int var21 = 0; var21 < 10; ++var21) {
                        var20.field5339[var21] -= var7;
                        var20.field5344[var21] -= var8;
                    }
                    var20.field2217 -= var7 * 128;
                    var20.field2215 -= var8 * 128;
                }
            }
            class187[] var16 = class463.field6771;
            for (int var17 = 0; var16.length > var17; ++var17) {
                class187 var19 = var16[var17];
                if (var19 != null) {
                    var19.field2624 -= var7 * 128;
                    var19.field2628 -= var8 * 128;
                }
            }
            class82.method526(-100, var7, var8);
            for (class309 var18 = (class309) class255.field3530.method1970(64); var18 != null; var18 = (class309) class255.field3530.method1960(24)) {
                var18.field4623 -= var7;
                var18.field4636 -= var8;
                if (class51.field683 != 3 && (~var18.field4623 > -1 || ~var18.field4636 > -1 || ~class96.field1403 >= ~var18.field4623 || ~var18.field4636 <= ~class485.field7122)) {
                    var18.method2785((byte) -120);
                }
            }
            if (class112.field1573 != 0) {
                class479.field7009 -= var8;
                class112.field1573 -= var7;
            }
            class104.method699((byte) -35);
            if (arg0 < -33) {
                if (arg2) {
                    class34.field539 -= var7 * 128;
                    class301.field4447 -= var8 * 128;
                    class173.field2489 -= var8;
                    class467.field6804 -= var7;
                    class363.field5623 -= var7;
                    class54.field721 -= var8;
                    if (Math.abs(var7) > class96.field1403 || ~Math.abs(var8) < ~class485.field7122) {
                        class459.method2760((byte) 126);
                    }
                } else if (~class432.field6409 != -5) {
                    class432.field6409 = 1;
                } else {
                    class165.field2409 -= var7 * 128;
                    class205.field2896 -= var8 * 128;
                    class274.field3815 -= var7 * 128;
                    class209.field2963 -= var8 * 128;
                }
                class461.method2767(21492);
                class413.method2508(false);
                class443.field6601.method1959((byte) 113);
                class494.field7232.method1959((byte) 113);
                class226.field3255.method2362((byte) 123);
                class422.method2539(-27);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1328(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2667;
        if (class260.field3628 != null && (~arg2 != -4 || class96.field1399.field5228 != arg4 || class96.field1399.field5207 != arg3)) {
            class158.method1030(class419.field6254, 0, class260.field3628);
            class260.field3628 = null;
        }
        if (arg2 == 3 && class260.field3628 == null) {
            class260.field3628 = class528.method3120(false, 0, 0, arg3, class419.field6254, arg4);
            if (class260.field3628 != null) {
                class96.field1399.field5228 = arg4;
                class96.field1399.field5207 = arg3;
                class96.field1399.method1731(true, class419.field6254);
            }
        }
        if (~arg2 == -4 && class260.field3628 == null) {
            method1328(true, arg1, class96.field1399.field5234, -1, -1, arg5);
        } else {
            Container var7;
            if (class260.field3628 == null) {
                if (class452.field6646 != null) {
                    Insets var6 = class452.field6646.getInsets();
                    class503.field7496 = class452.field6646.getSize().width - var6.left - var6.right;
                    int var10001 = var6.top + var6.bottom;
                    class529.field7811 = class452.field6646.getSize().height - var10001;
                    var7 = class452.field6646;
                } else {
                    var7 = class419.field6254.field6861;
                    class503.field7496 = var7.getSize().width;
                    class529.field7811 = var7.getSize().height;
                }
            } else {
                class503.field7496 = arg4;
                class529.field7811 = arg3;
                var7 = class260.field3628;
            }
            if (arg2 != 1) {
                if (~class455.field6684 > -97 && class441.field6563 == 0) {
                    int var8 = ~class503.field7496 < -1025 ? 1024 : class503.field7496;
                    class272.field3781 = (-var8 + class503.field7496) / 2;
                    int var9 = ~class529.field7811 < -769 ? 768 : class529.field7811;
                    class7.field112 = var8;
                    class341.field5383 = 0;
                    class486.field7136 = var9;
                } else {
                    class7.field112 = class503.field7496;
                    class272.field3781 = 0;
                    class341.field5383 = 0;
                    class486.field7136 = class529.field7811;
                }
            } else {
                class486.field7136 = class462.field6768;
                class341.field5383 = 0;
                class272.field3781 = (class503.field7496 - class515.field7639) / 2;
                class7.field112 = class515.field7639;
            }
            if (class74.field999 != class140.field2031) {
                boolean var10000;
                if (class7.field112 < 1024 && ~class486.field7136 > -769) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            if (!arg0) {
                class245.field3430.setSize(class7.field112, class486.field7136);
                class337.field5242.method1083(class245.field3430);
                if (class452.field6646 == var7) {
                    Insets var10 = class452.field6646.getInsets();
                    class245.field3430.setLocation(class272.field3781 + var10.left, class341.field5383 + var10.top);
                } else {
                    class245.field3430.setLocation(class272.field3781, class341.field5383);
                }
            } else {
                class397.method2440(0);
            }
            if (~arg2 > -3) {
                class166.field2420 = false;
            } else {
                class166.field2420 = true;
            }
            if (~class329.field5062 != 0) {
                class519.method3092(true, arg5 + 8069);
            }
            if (class81.field1092 != null && (class144.field2077 == 30 || class144.field2077 == 25)) {
                class240.method1612(-113);
            }
            if (arg5 != -7813) {
                field2661 = null;
            }
            for (int var11 = 0; var11 < 100; ++var11) {
                class326.field5002[var11] = true;
            }
            class471.field6883 = true;
        }
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)V")
    public static void method1329(int arg0) {
        field2668 = null;
        field2659 = null;
        if (arg0 < -55) {
            field2664 = null;
            field2661 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2657;
        class428 var7 = (class428) class226.field3255.method2358((byte) 127);
        if (arg0 < 120) {
            method1327((byte) -54, -43, true, false, 95);
        }
        while (var7 != null) {
            if (~var7.field6365 >= ~class405.field6116) {
                var7.method142(0);
            } else {
                class461.method2763(arg5, (var7.field6359 << 7) - -64, arg4 >> 1, -161, arg6 >> 1, var7.field6368, (var7.field6362 << 7) - -64, var7.field6364 * 2, arg2);
                class104.field1497.method239(0, 14144, var7.field6366, -16777216 | var7.field6369, class470.field6872[0] + arg1, class470.field6872[1] + arg3);
            }
            var7 = (class428) class226.field3255.method2363(31844);
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class190() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZZII)Lns;")
    public static final class438 method1331(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        if (arg3 != 1) {
            return null;
        } else {
            ++field2662;
            class80 var5 = null;
            if (class460.field6748 != null) {
                var5 = new class80(arg4, class460.field6748, class195.field2769[arg4], 1000000);
            }
            class76.field1032[arg4] = class453.field6656.method2579(arg4, var5, class15.field251, 8404);
            if (arg1) {
                class76.field1032[arg4].method1425(false);
            }
            return new class438(class76.field1032[arg4], arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)[I")
    public final int[] method92(int arg0, int arg1) {
        ++field2665;
        int[] var3 = super.field2152.method2891(arg1, (byte) 114);
        if (arg0 != -10835) {
            return null;
        } else {
            if (super.field2152.field7051) {
                int[] var4 = this.method983(0, 24824, arg1);
                for (int var5 = 0; var5 < class316.field4838; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = var6 >= this.field2658 && ~this.field2660 <= ~var6 ? 4096 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBLtl;)V")
    public final void method93(int arg0, byte arg1, class91 arg2) {
        ++field2663;
        if (arg1 != 35) {
            field2668 = null;
        }
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field2660 = arg2.method631(10494);
            }
        } else {
            this.field2658 = arg2.method631(arg1 + 10459);
        }
    }
}
