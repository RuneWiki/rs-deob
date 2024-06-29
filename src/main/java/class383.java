import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class383 extends class615 {

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "Lcu;")
    public static class206 field5114 = new class206(68, 6);

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "Ldb;")
    public static class298 field5115 = new class298(12, 8);

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    public static int field5116 = -1;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "[Ljb;")
    private class461[] field5112;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[[I", line = 4)
    public final int[][] method223(int arg0, int arg1) {
        ++field5111;
        if (arg0 != 2) {
            field5115 = null;
        }
        int[][] var3 = super.field8129.method2654(false, arg1);
        if (super.field8129.field6315) {
            int var4 = class505.field6740;
            int var5 = class471.field6301;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field8129.method2650(arg0 + -2);
            this.method2236(var6, (byte) -126);
            for (int var8 = 0; ~var8 > ~class471.field6301; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class505.field6740 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class571.method3139(4080, var15 << 4);
                    var12[var14] = class571.method3139(var15, 65280) >> 4;
                    var11[var14] = class571.method3139(4080, var15 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(B)V", line = 67)
    public static void method2235(byte arg0) {
        field5114 = null;
        field5115 = null;
        if (arg0 < 14) {
            method2235((byte) 7);
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V", line = 84)
    public class383() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BILeh;)V", line = 87)
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (~arg1 == -1) {
            this.field5112 = new class461[arg2.method2034(255)];
            for (int var4 = 0; ~var4 > ~this.field5112.length; ++var4) {
                int var5 = arg2.method2034(255);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field5112[var4] = class284.method1761(arg2, 4096);
                            }
                        } else {
                            this.field5112[var4] = class243.method1492((byte) -32, arg2);
                        }
                    } else {
                        this.field5112[var4] = class367.method2168(arg2, -32618);
                    }
                } else {
                    this.field5112[var4] = class510.method2832(arg2, 73);
                }
            }
        } else if (arg1 == 1) {
            super.field8118 = arg2.method2034(255) == 1;
        }
        if (arg0 < 44) {
            this.method8(29, (byte) -52);
        }
        ++field5113;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)[I", line = 169)
    public final int[] method8(int arg0, byte arg1) {
        ++field5109;
        if (arg1 != -18) {
            this.method8(-44, (byte) -76);
        }
        int[] var3 = super.field8125.method298(arg0, arg1 ^ 96);
        if (super.field8125.field579) {
            this.method2236(super.field8125.method294((byte) 99), (byte) 116);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([[IB)V", line = 192)
    private final void method2236(int[][] arg0, byte arg1) {
        int var3 = -85 % ((arg1 - -61) / 32);
        ++field5110;
        int var4 = class505.field6740;
        int var5 = class471.field6301;
        class198.method1283((byte) -51, arg0);
        class503.method2794(class658.field9107, 0, 0, (byte) -74, class313.field4306);
        if (this.field5112 != null) {
            for (int var6 = 0; ~this.field5112.length < ~var6; ++var6) {
                class461 var7 = this.field5112[var6];
                int var8 = var7.field6246;
                int var9 = var7.field6248;
                if (var8 < 0) {
                    if (var9 >= 0) {
                        var7.method703(var5, -105, var4);
                    }
                } else if (~var9 > -1) {
                    var7.method705(var5, var4, (byte) -56);
                } else {
                    var7.method704((byte) 101, var4, var5);
                }
            }
        }
    }
}
