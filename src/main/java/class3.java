import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class3 extends class349 {

    @OriginalMember(owner = "client!dba", name = "F", descriptor = "I")
    private int field21 = 4;

    @OriginalMember(owner = "client!dba", name = "B", descriptor = "I")
    private int field17 = 4;

    @OriginalMember(owner = "client!dba", name = "I", descriptor = "I")
    public static int field24 = 1;

    @OriginalMember(owner = "client!dba", name = "E", descriptor = "Ljj;")
    public static class398 field20 = new class398(36, 3);

    @OriginalMember(owner = "client!dba", name = "K", descriptor = "Lvi;")
    public static class560 field26 = new class560(64);

    @OriginalMember(owner = "client!dba", name = "N", descriptor = "[I")
    public static int[] field28 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!dba", name = "L", descriptor = "I")
    public static int field27 = 0;

    @OriginalMember(owner = "client!dba", name = "C", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!dba", name = "D", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!dba", name = "G", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!dba", name = "H", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!dba", name = "J", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!dba", name = "O", descriptor = "Lpq;")
    public static class159 field29;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field18;
        int var3 = 114 / ((arg0 - 56) / 41);
        int[] var4 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            int var5 = class39.field497 / this.field21;
            int var6 = class442.field6080 / this.field17;
            int[] var8;
            if (~var6 < -1) {
                int var7 = arg1 % var6;
                var8 = this.method2181(0, -1090477337, class442.field6080 * var7 / var6);
            } else {
                var8 = this.method2181(0, -1090477337, 0);
            }
            for (int var9 = 0; ~class39.field497 < ~var9; ++var9) {
                if (~var5 >= -1) {
                    var4[var9] = var8[0];
                } else {
                    int var10 = var9 % var5;
                    var4[var9] = var8[class39.field497 * var10 / var5];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "()V")
    public class3() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "(I)Z")
    public static final boolean method14(int arg0) {
        ++field22;
        if (arg0 < ~class476.field6436) {
            return false;
        } else {
            return class375.field5396 != class333.field4859 || ~class485.field6560 <= -3;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIB)Z")
    public static final boolean method15(int arg0, int arg1, byte arg2) {
        ++field19;
        if (arg2 != -121) {
            method15(-1, 116, (byte) 112);
        }
        return ~(384 & arg0) != -1;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IB)[[I")
    public final int[][] method9(int arg0, byte arg1) {
        ++field25;
        int[][] var3 = super.field5103.method2268(true, arg0);
        int var4 = 4 % ((arg1 - -32) / 47);
        if (super.field5103.field5314) {
            int var5 = class39.field497 / this.field21;
            int var6 = class442.field6080 / this.field17;
            int[][] var7;
            if (~var6 >= -1) {
                var7 = this.method2180(0, 77, 0);
            } else {
                int var8 = arg0 % var6;
                var7 = this.method2180(0, 85, class442.field6080 * var8 / var6);
            }
            int[] var9 = var7[0];
            int[] var10 = var7[1];
            int[] var11 = var7[2];
            int[] var12 = var3[0];
            int[] var13 = var3[1];
            int[] var14 = var3[2];
            for (int var15 = 0; ~class39.field497 < ~var15; ++var15) {
                int var17;
                if (var5 > 0) {
                    int var16 = var15 % var5;
                    var17 = class39.field497 * var16 / var5;
                } else {
                    var17 = 0;
                }
                var12[var15] = var9[var17];
                var13[var15] = var10[var17];
                var14[var15] = var11[var17];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "(I)V")
    public static void method16(int arg0) {
        if (arg0 != -2092) {
            method15(-1, -56, (byte) -16);
        }
        field28 = null;
        field20 = null;
        field26 = null;
        field29 = null;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IILdga;)V")
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field17 = arg2.method957((byte) -75);
            }
        } else {
            this.field21 = arg2.method957((byte) -102);
        }
        if (arg0 != 4095) {
            field20 = null;
        }
        ++field23;
    }
}
