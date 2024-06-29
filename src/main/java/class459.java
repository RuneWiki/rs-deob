import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class459 extends class328 {

    @OriginalMember(owner = "client!td", name = "I", descriptor = "Ljava/lang/String;")
    public static String field6612 = null;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "[F")
    public static float[] field6614 = new float[16384];

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public static int field6615 = -1;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "[F")
    public static float[] field6606 = new float[16384];

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "Lgp;")
    public static class561 field6619;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "[Lsn;")
    private class260[] field6608;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "[Z")
    public static boolean[] field6618;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public static final void method2686(boolean arg0) {
        ++field6617;
        if (!class202.field2854.method2628((byte) 68, class646.field9388) && class545.field7583 != class466.field6714) {
            class159.method1125(10, false, class533.field7443, 124, class559.field7931);
        } else {
            if (arg0) {
                method2689((class167) null, -40);
            }
            class571.method3264(class159.field2378, -128);
            if (~class545.field7583 != ~class306.field4410) {
                class531.method2994(-71);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BILco;)V")
    public final void method1(byte arg0, int arg1, class268 arg2) {
        ++field6610;
        if (arg1 == 0) {
            this.field6608 = new class260[arg2.method1738(255)];
            for (int var4 = 0; ~this.field6608.length < ~var4; ++var4) {
                int var5 = arg2.method1738(255);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field6608[var4] = class46.method413((byte) -110, arg2);
                            }
                        } else {
                            this.field6608[var4] = class156.method1099(arg2, 1);
                        }
                    } else {
                        this.field6608[var4] = class248.method1574(arg2, (byte) 96);
                    }
                } else {
                    this.field6608[var4] = class490.method2797(arg2, false);
                }
            }
        } else if (~arg1 == -2) {
            super.field4728 = arg2.method1738(255) == 1;
        }
        if (arg0 < 75) {
            field6615 = -54;
        }
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V")
    public static void method2687(int arg0) {
        field6606 = null;
        if (arg0 == -274305948) {
            field6612 = null;
            field6614 = null;
            field6618 = null;
            field6619 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V")
    public static final void method2688(byte arg0) {
        ++field6616;
        if (arg0 != 87) {
            method2686(false);
        }
        if (class254.field3703 != null) {
            class254.field3703.method1163(6510);
            class233.field3431 = null;
            class254.field3703 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lqa;I)V")
    public static final void method2689(class167 arg0, int arg1) {
        if (class255.field3709) {
            class469.method2730(-30762, arg0);
        } else {
            class284.method1808(true, arg0);
        }
        ++field6609;
        if (arg1 > -17) {
            method2687(-43);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I[[I)V")
    private final void method2690(int arg0, int[][] arg1) {
        ++field6607;
        if (arg0 > 28) {
            int var3 = class449.field6539;
            int var4 = class527.field7334;
            class496.method2825(arg1, 0);
            class605.method3449(class108.field1799, 0, class589.field8379, 3, 0);
            if (this.field6608 != null) {
                for (int var5 = 0; this.field6608.length > var5; ++var5) {
                    class260 var6 = this.field6608[var5];
                    int var7 = var6.field3778;
                    int var8 = var6.field3783;
                    if (~var7 <= -1) {
                        if (var8 >= 0) {
                            var6.method32(var3, (byte) 80, var4);
                        } else {
                            var6.method33(false, var3, var4);
                        }
                    } else if (var8 >= 0) {
                        var6.method30(var3, var4, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    public class459() {
        super(0, true);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)[[I")
    public final int[][] method7(int arg0, int arg1) {
        ++field6611;
        int var3 = -94 / ((46 - arg1) / 54);
        int[][] var4 = super.field4725.method1886((byte) -109, arg0);
        if (super.field4725.field4371) {
            int var5 = class449.field6539;
            int var6 = class527.field7334;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = super.field4725.method1882((byte) 35);
            this.method2690(112, var7);
            for (int var9 = 0; ~var9 > ~class527.field7334; ++var9) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[0];
                int[] var13 = var11[1];
                int[] var14 = var11[2];
                for (int var15 = 0; ~var15 > ~class449.field6539; ++var15) {
                    int var16 = var10[var15];
                    var14[var15] = class424.method2540(var16, 255) << 4;
                    var13[var15] = class424.method2540(var16 >> 4, 4080);
                    var12[var15] = class424.method2540(4080, var16 >> 12);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field6613;
        int var3 = -62 / ((48 - arg1) / 56);
        int[] var4 = super.field4720.method2872(1, arg0);
        if (super.field4720.field7109) {
            this.method2690(76, super.field4720.method2874(-22531));
        }
        return var4;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field6606[var2] = (float) Math.sin((double) var2 * var0);
            field6614[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
