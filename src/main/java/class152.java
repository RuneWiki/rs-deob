import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class152 extends class30 {

    @OriginalMember(owner = "client!cfa", name = "F", descriptor = "Z")
    private boolean field2225 = true;

    @OriginalMember(owner = "client!cfa", name = "C", descriptor = "Z")
    private boolean field2222 = true;

    @OriginalMember(owner = "client!cfa", name = "B", descriptor = "I")
    public static int field2221 = 0;

    @OriginalMember(owner = "client!cfa", name = "z", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!cfa", name = "D", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!cfa", name = "E", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!cfa", name = "G", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!cfa", name = "H", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!cfa", name = "A", descriptor = "[J")
    public static long[] field2220;

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "()V", line = 8)
    public class152() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ZZ)V", line = 15)
    public static final void method1095(boolean arg0, boolean arg1) {
        if (!arg1) {
            method1096(18);
        }
        if (arg0 && class510.field6979 != null) {
            class390.field5522 = class510.field6979.field1550;
        } else {
            class390.field5522 = -1;
        }
        ++field2226;
        class606.field8432 = 0;
        class510.field6979 = null;
        class289.field3960 = null;
        class40.field470 = null;
        class510.method2923();
        class510.field6985.method1444(-27547);
        class510.field6992 = null;
        class677.field9706 = null;
        class615.field8584 = null;
        class363.field4779 = null;
        class98.field1378 = null;
        class527.field7149 = null;
        class255.field3490 = -1;
        class266.field3599 = null;
        class554.field7470 = null;
        class311.field4304 = null;
        class670.field9402 = null;
        class14.field152 = -1;
        if (class510.field6981 != null) {
            class510.field6981.method3704(82);
            class510.field6981.method3707((byte) -123, 64, 128);
        }
        if (class510.field6977 != null) {
            class510.field6977.method356(false, 64, 64);
        }
        if (class510.field6974 != null) {
            class510.field6974.method2687(64, 1);
        }
        class333.field4490.method2039(-83, 64);
    }

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "(I)V", line = 63)
    public static void method1096(int arg0) {
        if (arg0 != 0) {
            field2223 = -56;
        }
        field2220 = null;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(II)[I", line = 81)
    public final int[] method48(int arg0, int arg1) {
        if (arg0 != 1) {
            return null;
        } else {
            ++field2227;
            int[] var3 = super.field374.method3664(arg1, (byte) 8);
            if (super.field374.field9032) {
                int[] var4 = this.method294(!this.field2225 ? arg1 : -arg1 + class649.field9002, 0, (byte) 78);
                if (this.field2222) {
                    for (int var5 = 0; var5 < class31.field399; ++var5) {
                        var3[var5] = var4[-var5 + class353.field4694];
                    }
                } else {
                    class359.method2054(var4, 0, var3, 0, class31.field399);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BILac;)V", line = 123)
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field378 = arg2.method2874((byte) -75) == 1;
                }
            } else {
                this.field2225 = arg2.method2874((byte) -75) == 1;
            }
        } else {
            this.field2222 = arg2.method2874((byte) -75) == 1;
        }
        if (arg0 < 100) {
            this.field2222 = true;
        }
        ++field2224;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IB)[[I", line = 167)
    public final int[][] method30(int arg0, byte arg1) {
        ++field2219;
        int[][] var3 = super.field377.method3683(arg0, (byte) -39);
        if (arg1 != 7) {
            field2221 = 75;
        }
        if (super.field377.field9085) {
            int[][] var4 = this.method292(arg1 ^ 109, 0, !this.field2225 ? arg0 : -arg0 + class649.field9002);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field2222) {
                for (int var11 = 0; ~class31.field399 < ~var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; class31.field399 > var12; ++var12) {
                    var8[var12] = var5[-var12 + class353.field4694];
                    var9[var12] = var6[class353.field4694 - var12];
                    var10[var12] = var7[-var12 + class353.field4694];
                }
            }
        }
        return var3;
    }
}
