import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class293 extends class512 {

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "Lvv;")
    public static class313 field4743 = new class313(30, 1);

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "[I")
    public static int[] field4747 = new int[6];

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
    public static int field4748 = 1405;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "[Lfo;")
    private class457[] field4741;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)V")
    public static final void method1883(int arg0) {
        for (int var1 = arg0; ~var1 > ~class192.field2982.length; ++var1) {
            for (int var2 = 0; ~class192.field2982[0].length < ~var2; ++var2) {
                for (int var3 = 0; var3 < class192.field2982[0][0].length; ++var3) {
                    class192.field2982[var1][var2][var3] = 0;
                }
            }
        }
        ++field4746;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I[[I)V")
    private final void method1884(int arg0, int[][] arg1) {
        ++field4745;
        int var3 = class402.field6113;
        int var4 = class227.field3953;
        class289.method1867((byte) 106, arg1);
        class360.method2304(class270.field4492, 0, (byte) 82, class269.field4478, arg0);
        if (this.field4741 != null) {
            for (int var5 = 0; var5 < this.field4741.length; ++var5) {
                class457 var6 = this.field4741[var5];
                int var7 = var6.field6806;
                int var8 = var6.field6801;
                if (var7 >= 0) {
                    if (var8 < 0) {
                        var6.method328(false, var3, var4);
                    } else {
                        var6.method334(var4, var3, 33);
                    }
                } else if (var8 >= 0) {
                    var6.method331(var4, var3, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)[[I")
    public final int[][] method278(int arg0, int arg1) {
        ++field4740;
        int var3 = -4 % ((arg0 - -40) / 47);
        int[][] var4 = super.field7496.method2777(arg1, 0);
        if (super.field7496.field6942) {
            int var5 = class402.field6113;
            int var6 = class227.field3953;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = super.field7496.method2775(false);
            this.method1884(0, var7);
            for (int var9 = 0; ~var9 > ~class227.field3953; ++var9) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[0];
                int[] var13 = var11[1];
                int[] var14 = var11[2];
                for (int var15 = 0; ~var15 > ~class402.field6113; ++var15) {
                    int var16 = var10[var15];
                    var14[var15] = class344.method2224(255, var16) << 4;
                    var13[var15] = class344.method2224(var16 >> 4, 4080);
                    var12[var15] = class344.method2224(4080, var16 >> 12);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(B)V")
    public static void method1885(byte arg0) {
        if (arg0 != 72) {
            field4743 = null;
        }
        field4747 = null;
        field4743 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZILia;)V")
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        if (!arg0) {
            field4748 = -54;
        }
        ++field4744;
        if (arg1 == 0) {
            this.field4741 = new class457[arg2.method126((byte) -125)];
            for (int var4 = 0; var4 < this.field4741.length; ++var4) {
                int var5 = arg2.method126((byte) -94);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field4741[var4] = class473.method2801(arg2, 7573);
                            }
                        } else {
                            this.field4741[var4] = class64.method419(arg2, 27644);
                        }
                    } else {
                        this.field4741[var4] = class296.method1894((byte) 118, arg2);
                    }
                } else {
                    this.field4741[var4] = class84.method605(arg2, 119);
                }
            }
        } else if (~arg1 == -2) {
            super.field7491 = ~arg2.method126((byte) -126) == -2;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)[I")
    public final int[] method75(int arg0, byte arg1) {
        ++field4742;
        int[] var3 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            this.method1884(0, super.field7494.method233(-7777));
        }
        int var4 = 81 / ((arg1 - 43) / 48);
        return var3;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
    public class293() {
        super(0, true);
    }
}
