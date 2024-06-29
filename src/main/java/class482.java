import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class482 extends class298 {

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "[J")
    public static long[] field6808 = new long[100];

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "Lsd;")
    public static class74 field6810;

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "Z")
    public static boolean field6813;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "Lgj;")
    public static class405 field6811;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)[I")
    public final int[] method13(int arg0, boolean arg1) {
        ++field6806;
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (!arg1) {
            field6810 = null;
        }
        if (super.field4443.field6915) {
            int var4 = class156.field1865[arg0];
            for (int var5 = 0; ~class158.field1877 < ~var5; ++var5) {
                var3[var5] = this.method2841((byte) 28, class236.field3260[var5], var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BII)I")
    private final int method2841(byte arg0, int arg1, int arg2) {
        ++field6804;
        if (arg0 != 28) {
            field6808 = null;
        }
        int var4 = arg2 * 57 + arg1;
        int var5 = var4 << 1 ^ var4;
        return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V")
    public static void method2842(int arg0) {
        if (arg0 != 789221) {
            method2844((byte) 69, (class280) null);
        }
        field6811 = null;
        field6808 = null;
        field6810 = null;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)V")
    public static final void method2843(int arg0, int arg1) {
        if (arg1 == 4096) {
            class27.field360 = arg0;
            ++field6805;
            class210 var2 = class460.field6497;
            synchronized (class460.field6497) {
                class460.field6497.method1165((byte) 118);
            }
            class210 var3 = class189.field2588;
            synchronized (class189.field2588) {
                class189.field2588.method1165((byte) 118);
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    public class482() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLoj;)V")
    public static final void method2844(byte arg0, class280 arg1) {
        ++field6809;
        if ((class223.field3099 >= 2 || class293.field4359) && class484.field6868 == null) {
            String var2;
            if (class293.field4359 && ~class223.field3099 > -3) {
                var2 = class390.field5570 + class417.field6012.method205((byte) 118, class68.field849) + class126.field1543 + " ->";
            } else if (class224.field3100 && class308.field4529.method1689((byte) -118, 81) && ~class223.field3099 < -3) {
                var2 = class125.method597((class158) class485.field6882.field1985.field1777.field1777, -127);
            } else {
                class158 var3 = (class158) class485.field6882.field1985.field1777;
                var2 = class125.method597(var3, -68);
                int[] var4 = null;
                if (class419.method2493(var3.field1889, 22383)) {
                    var4 = class422.field6096.method121((int) var3.field1883, -1).field5520;
                } else if (var3.field1887 != -1) {
                    var4 = class422.field6096.method121(var3.field1887, -1).field5520;
                } else if (!class45.method242(var3.field1889, (byte) -83)) {
                    if (class432.method2587(var3.field1889, (byte) -120)) {
                        Object var5 = null;
                        class415 var6;
                        if (var3.field1889 != 1004) {
                            var6 = class173.field2084.method2297(50, (int) (2147483647L & var3.field1883 >>> 32));
                        } else {
                            var6 = class173.field2084.method2297(50, (int) var3.field1883);
                        }
                        if (var6.field5951 != null) {
                            var6 = var6.method2473(-18648, class75.field909);
                        }
                        if (var6 != null) {
                            var4 = var6.field5922;
                        }
                    }
                } else {
                    class137 var7 = class448.field6366[(int) var3.field1883];
                    if (var7 != null) {
                        class476 var8 = var7.field1643;
                        if (var8.field6694 != null) {
                            var8 = var8.method2812(class75.field909, true);
                        }
                        if (var8 != null) {
                            var4 = var8.field6683;
                        }
                    }
                }
                if (var4 != null) {
                    var2 = var2 + class349.method2115(14160, var4);
                }
            }
            if (class223.field3099 > 2) {
                var2 = var2 + "<col=ffffff> / " + (class223.field3099 + -2) + class385.field5523.method205((byte) 124, class68.field849);
            }
            int var9 = 66 / ((-65 - arg0) / 51);
            if (class182.field2341 != null) {
                class206 var10 = class182.field2341.method1581(-1, arg1);
                if (var10 == null) {
                    var10 = class101.field1230;
                }
                var10.method1126(class432.field6249, class182.field2341.field3625, class430.field6222, class182.field2341.field3707, class182.field2341.field3701, class398.field5656, class82.field989, class182.field2341.field3597, class369.field5283, class199.field2768, 61, class298.field4460, class182.field2341.field3666, class182.field2341.field3679, var2);
                class343.method2084(true, class369.field5283[0], class369.field5283[2], class369.field5283[1], class369.field5283[3]);
            } else if (class251.field3527 != null && class475.field6675 == class289.field4317) {
                int var11 = class101.field1230.method1142(16777215, var2, class352.field5063 + 16, class82.field989, class298.field4460, true, class477.field6751 - -4, class430.field6222, class199.field2768, 0);
                class343.method2084(true, class477.field6751 + 4, class453.field6394.method2419(false, var2) - -var11, class352.field5063, 16);
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method2845(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg5) {
            class328.method1990((byte) 7);
        }
        ++field6807;
        if (class348.field4961 != null && (arg1 != 3 || ~class282.field4111 != ~arg3 || ~class92.field1143 != ~arg2)) {
            class470.method2766((byte) -102, class42.field512, class348.field4961);
            class348.field4961 = null;
        }
        if (arg1 == 3 && class348.field4961 == null) {
            class348.field4961 = class459.method2709(arg2, class42.field512, (byte) 88, 0, 0, arg3);
            if (class348.field4961 != null) {
                class92.field1143 = arg2;
                class282.field4111 = arg3;
                class120.method582(-2, class42.field512);
            }
        }
        if (~arg1 == -4 && class348.field4961 == null) {
            method2845(arg0, class262.field3766, -1, -1, -3, true);
        } else {
            Container var6;
            if (class348.field4961 == null) {
                if (class41.field500 == null) {
                    var6 = class42.field512.field5106;
                    class74.field898 = var6.getSize().width;
                    class119.field1473 = var6.getSize().height;
                } else {
                    Insets var7 = class41.field500.getInsets();
                    class74.field898 = class41.field500.getSize().width + -var7.left - var7.right;
                    int var10001 = -var7.top;
                    class119.field1473 = class41.field500.getSize().height + var10001 + -var7.bottom;
                    var6 = class41.field500;
                }
            } else {
                class119.field1473 = arg2;
                var6 = class348.field4961;
                class74.field898 = arg3;
            }
            if (~arg1 != -2) {
                if (class275.field3918 < 96 && class375.field5347 == 0) {
                    int var8 = ~class74.field898 >= -1025 ? class74.field898 : 1024;
                    class171.field2020 = (-var8 + class74.field898) / 2;
                    int var9 = class119.field1473 <= 768 ? class119.field1473 : 768;
                    class110.field1336 = var8;
                    class464.field6541 = var9;
                    class428.field6173 = 0;
                } else {
                    class110.field1336 = class74.field898;
                    class428.field6173 = 0;
                    class464.field6541 = class119.field1473;
                    class171.field2020 = 0;
                }
            } else {
                class428.field6173 = 0;
                class464.field6541 = class462.field6513;
                class110.field1336 = class48.field629;
                class171.field2020 = (-class48.field629 + class74.field898) / 2;
            }
            if (class414.field5904 != class145.field1754) {
                boolean var10000;
                if (class110.field1336 < 1024 && ~class464.field6541 > -769) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            if (arg5) {
                class331.method2015((byte) -128, class375.field5347);
            } else {
                class126.field1542.setSize(class110.field1336, class464.field6541);
                if (class231.field3205 != null) {
                    class231.field3205.method1467();
                }
                if (class41.field500 == var6) {
                    Insets var10 = class41.field500.getInsets();
                    class126.field1542.setLocation(class171.field2020 + var10.left, class428.field6173 + var10.top);
                } else {
                    class126.field1542.setLocation(class171.field2020, class428.field6173);
                }
            }
            if (~arg1 <= arg4) {
                class464.field6538 = true;
            } else {
                class464.field6538 = false;
            }
            if (~class57.field725 != 0) {
                class418.method2486(true, false);
            }
            if (class322.field4655 != null && (~class453.field6415 == -31 || ~class453.field6415 == -26)) {
                class168.method824(-89);
            }
            for (int var11 = 0; ~var11 > -101; ++var11) {
                class61.field764[var11] = true;
            }
            class2.field9 = true;
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)I")
    public static final int method2846(int arg0) {
        ++field6803;
        if ((double) class429.field6192 == 3.0D) {
            return 37;
        } else if ((double) class429.field6192 == 4.0D) {
            return 50;
        } else if ((double) class429.field6192 == 6.0D) {
            return 75;
        } else if (arg0 != 96) {
            return -88;
        } else {
            return (double) class429.field6192 == 8.0D ? 100 : 200;
        }
    }

    static {
        new class40((String) null, "der Spieler ist momentan nicht verfügbar.", (String) null, (String) null);
        field6810 = new class74(66, 0);
        field6813 = false;
    }
}
