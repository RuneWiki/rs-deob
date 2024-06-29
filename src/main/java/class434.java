import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class434 extends class712 {

    @OriginalMember(owner = "client!sca", name = "w", descriptor = "Z")
    private boolean field6053 = false;

    @OriginalMember(owner = "client!sca", name = "t", descriptor = "[Lup;")
    public static class241[] field6050 = new class241[128];

    @OriginalMember(owner = "client!sca", name = "B", descriptor = "J")
    public static long field6058 = 0L;

    @OriginalMember(owner = "client!sca", name = "r", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!sca", name = "s", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!sca", name = "u", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!sca", name = "v", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!sca", name = "x", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!sca", name = "y", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!sca", name = "z", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!sca", name = "A", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!sca", name = "C", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!sca", name = "D", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(ILjava/util/Random;B)I")
    public static final int method2677(int arg0, Random arg1, byte arg2) {
        ++field6054;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class88.method611(arg0, 2)) {
            return (int) ((long) arg0 * (4294967295L & (long) arg1.nextInt()) >> 32);
        } else if (arg2 > -95) {
            return -109;
        } else {
            int var3 = -((int) (4294967296L % (long) arg0)) + Integer.MIN_VALUE;
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class328.method2109((byte) 74, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(BZ)V")
    public final void method394(byte arg0, boolean arg1) {
        if (arg0 <= 39) {
            method2680(-51, 36, 71, -8);
        }
        ++field6051;
        super.field9945.method1388(class87.field1239, (byte) 52, class179.field2467);
    }

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "(I)V")
    public static final void method2678(int arg0) {
        ++field6060;
        if (class129.field1802 != null) {
            if (class222.field3009) {
                class166.method1039(true);
            }
            class269.field3931.method2473((byte) 29);
            class612.method3471();
            class367.method2313(true);
            class625.method3522(arg0 + -11856);
            class607.method3452(70);
            class664.method3734((byte) -79);
            if (class359.field5138 != null) {
                class359.field5138.method3397(29586);
            }
            class329.method2116((byte) -47);
            class4.method20(0);
            class12.method57(false);
            class521.method3103((byte) -107);
            class507.method3048(false, 64);
            for (int var1 = 0; ~var1 > -2049; ++var1) {
                class96 var5 = class251.field3675[var1];
                if (var5 != null) {
                    for (int var6 = 0; ~var5.field7194.length < ~var6; ++var6) {
                        var5.field7194[var6] = null;
                    }
                }
            }
            for (int var2 = 0; ~class445.field6185 < ~var2; ++var2) {
                class679 var3 = class757.field10568[var2].field3471;
                if (var3 != null) {
                    for (int var4 = 0; var3.field7194.length > var4; ++var4) {
                        var3.field7194[var4] = null;
                    }
                }
            }
            class723.field10036 = null;
            class243.field3618 = null;
            class129.field1802.method3248((byte) -88);
            class129.field1802 = null;
        }
        if (arg0 != 11954) {
            method2677(55, (Random) null, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IILhba;)V")
    public final void method391(int arg0, int arg1, class190 arg2) {
        super.field9945.method1458(399403340, arg2);
        ++field6049;
        if (arg1 == 0) {
            super.field9945.method1503(arg0, (byte) 100);
        }
    }

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "(Z)Z")
    public final boolean method396(boolean arg0) {
        ++field6052;
        if (arg0) {
            this.method396(false);
        }
        return true;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(ZI)I")
    public static final int method2679(boolean arg0, int arg1) {
        ++field6059;
        if (~arg1 != -6408 && ~arg1 != -34844 && arg1 != 34837) {
            if (arg1 != 6408 && arg1 != 34842 && arg1 != 34836) {
                if (~arg1 != -6407 && arg1 != 34844) {
                    if (arg1 != 6409 && arg1 != 34846) {
                        if (~arg1 != -6411 && ~arg1 != -34848) {
                            if (!arg0) {
                                method2678(29);
                            }
                            if (arg1 == 6402) {
                                return 6402;
                            } else {
                                throw new IllegalArgumentException("");
                            }
                        } else {
                            return 6410;
                        }
                    } else {
                        return 6409;
                    }
                } else {
                    return 6406;
                }
            } else {
                return 6408;
            }
        } else {
            return 6407;
        }
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lrl;)V")
    public class434(class232 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(ZB)V")
    public final void method399(boolean arg0, byte arg1) {
        ++field6048;
        class492 var3 = super.field9945.method1436(0);
        if (arg1 <= 44) {
            field6058 = 4L;
        }
        if (var3 != null && arg0) {
            super.field9945.method1431(0, 1);
            super.field9945.method1458(399403340, var3);
            super.field9945.method338(class171.field2379, -127);
            super.field9945.method1431(0, 1);
            super.field9945.method1388(class87.field1239, (byte) 52, class370.field5228);
            super.field9945.method324(2, true, -9608, class231.field3142, false);
            super.field9945.method1528(class684.field9515, false, 0);
            class474 var4 = super.field9945.method1410((byte) -118);
            var4.method2878(super.field9945.method1433(2784), false);
            super.field9945.method1460(class235.field3478, -128);
            super.field9945.method1431(0, 0);
            this.field6053 = true;
        } else {
            super.field9945.method1528(class684.field9515, false, 0);
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIII)V")
    public static final void method2680(int arg0, int arg1, int arg2, int arg3) {
        ++field6057;
        int var4 = arg2 << 3;
        int var5 = arg0 << 3;
        int var6 = arg3 << arg1;
        class596.field8093 = (float) var6;
        class589.field8028 = (float) var4;
        if (class720.field10023 == 2) {
            class230.field3118 = var6;
            class118.field1556 = var5;
            class25.field318 = var4;
        }
        class391.method2454(-67);
        class397.field5710 = true;
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(Z)V")
    public final void method389(boolean arg0) {
        ++field6055;
        if (this.field6053) {
            super.field9945.method1431(0, 1);
            super.field9945.method338(class134.field1909, -127);
            super.field9945.method1388(class179.field2467, (byte) 52, class179.field2467);
            super.field9945.method1408(2, 0, class520.field7247);
            super.field9945.method1528(class15.field140, arg0, 0);
            super.field9945.method1459(0);
            super.field9945.method1458(399403340, (class190) null);
            super.field9945.method1431(0, 0);
            this.field6053 = false;
        } else {
            super.field9945.method1528(class15.field140, arg0, 0);
        }
        if (arg0) {
            this.method399(false, (byte) 2);
        }
        super.field9945.method1388(class179.field2467, (byte) 52, class179.field2467);
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(III)V")
    public final void method393(int arg0, int arg1, int arg2) {
        if (arg2 >= 96) {
            ++field6056;
        }
    }

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "(Z)V")
    public static void method2681(boolean arg0) {
        field6050 = null;
        if (arg0) {
            field6050 = null;
        }
    }
}
