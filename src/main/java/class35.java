import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class35 extends class377 {

    @OriginalMember(owner = "client!be", name = "F", descriptor = "I")
    private int field528 = 4;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "I")
    private int field529 = 4;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    public static int field524 = 16777215;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "Z")
    public static boolean field525 = false;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!be", name = "I", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[I")
    public final int[] method88(int arg0, int arg1) {
        ++field532;
        int var3 = -51 % ((arg1 - 5) / 53);
        int[] var4 = super.field4842.method2772(arg0, (byte) -111);
        if (super.field4842.field6354) {
            int var5 = class528.field6661 / this.field528;
            int var6 = class383.field4916 / this.field529;
            int[] var8;
            if (var6 > 0) {
                int var7 = arg0 % var6;
                var8 = this.method2174(0, class383.field4916 * var7 / var6, (byte) 13);
            } else {
                var8 = this.method2174(0, 0, (byte) -126);
            }
            for (int var9 = 0; ~var9 > ~class528.field6661; ++var9) {
                if (var5 <= 0) {
                    var4[var9] = var8[0];
                } else {
                    int var10 = var9 % var5;
                    var4[var9] = var8[class528.field6661 * var10 / var5];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)Z")
    public static final boolean method233(byte arg0, int arg1) {
        ++field531;
        if (arg0 != -77) {
            return false;
        } else {
            return ~arg1 == -4 || arg1 == 4 || ~arg1 == -6 || ~arg1 == -7;
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class35() {
        super(1, false);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILji;)V")
    public final void method27(int arg0, int arg1, class572 arg2) {
        int var4 = -18 / ((arg1 - 13) / 55);
        ++field527;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field529 = arg2.method3097((byte) 12);
            }
        } else {
            this.field528 = arg2.method3097((byte) 12);
        }
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V")
    public static final void method234(int arg0) {
        class347.field4463 = class98.method720(0.4F, 4, arg0 + -7, true, 35, arg0, 8, 2048);
        ++field526;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(B)V")
    public static final void method235(byte arg0) {
        class161.method991(0);
        ++field530;
        class610.field8305 = null;
        if (arg0 <= -104) {
            class613.field8339 = null;
            class531.field6702 = null;
            class675.field9221 = 0;
            class295.field3741 = 0;
            class10.field100 = 0;
            class222.field2585.field7313 = 0;
            class660.field8961 = null;
            class644.method3605((byte) -123);
            class205.method1188(24527);
            for (int var1 = 0; var1 < 2048; ++var1) {
                class132.field1601[var1] = null;
            }
            class67.field815 = null;
            for (int var2 = 0; ~var2 > ~class215.field2516; ++var2) {
                class506 var4 = class140.field1687[var2].field9854;
                if (var4 != null) {
                    var4.field491 = -1;
                }
            }
            class472.method2564((byte) -87);
            class385.field4946 = 1;
            class78.method609(10503, 10);
            for (int var3 = 0; ~var3 > -101; ++var3) {
                class58.field743[var3] = true;
            }
            class694.method3834((byte) -61);
            class689.field9550 = null;
            class345.field4414 = 0L;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)[[I")
    public final int[][] method23(int arg0, byte arg1) {
        ++field523;
        int[][] var3 = super.field4850.method2566(-27346, arg0);
        int var4 = 61 / ((31 - arg1) / 42);
        if (super.field4850.field5843) {
            int var5 = class528.field6661 / this.field528;
            int var6 = class383.field4916 / this.field529;
            int[][] var8;
            if (var6 > 0) {
                int var7 = arg0 % var6;
                var8 = this.method2173(1, class383.field4916 * var7 / var6, 0);
            } else {
                var8 = this.method2173(1, 0, 0);
            }
            int[] var9 = var8[0];
            int[] var10 = var8[1];
            int[] var11 = var8[2];
            int[] var12 = var3[0];
            int[] var13 = var3[1];
            int[] var14 = var3[2];
            for (int var15 = 0; ~var15 > ~class528.field6661; ++var15) {
                int var16;
                if (~var5 >= -1) {
                    var16 = 0;
                } else {
                    int var17 = var15 % var5;
                    var16 = class528.field6661 * var17 / var5;
                }
                var12[var15] = var9[var16];
                var13[var15] = var10[var16];
                var14[var15] = var11[var16];
            }
        }
        return var3;
    }
}
