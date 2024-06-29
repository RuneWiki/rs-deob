import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class196 extends class220 {

    @OriginalMember(owner = "client!mo", name = "T", descriptor = "I")
    public static int field2804 = 0;

    @OriginalMember(owner = "client!mo", name = "S", descriptor = "I")
    public static int field2803 = -1;

    @OriginalMember(owner = "client!mo", name = "V", descriptor = "Z")
    public static volatile boolean field2806 = true;

    @OriginalMember(owner = "client!mo", name = "Q", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!mo", name = "R", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!mo", name = "U", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!mo", name = "W", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!mo", name = "X", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!mo", name = "P", descriptor = "Lao;")
    public static class116 field2800;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IBLil;)V")
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (arg1 != -49) {
            field2803 = 72;
        }
        if (~arg0 == -1) {
            super.field3131 = arg2.method1697(-84) == 1;
        }
        ++field2805;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(Z)V")
    public static void method1226(boolean arg0) {
        if (arg0) {
            field2806 = false;
        }
        field2800 = null;
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field2808;
        int[] var3 = super.field3125.method2005(arg1, (byte) -113);
        if (arg0 != -11543) {
            field2803 = 77;
        }
        if (super.field3125.field4676) {
            int[] var4 = this.method1366(0, (byte) -40, arg1);
            int[] var5 = this.method1366(1, (byte) -40, arg1);
            int[] var6 = this.method1366(2, (byte) -40, arg1);
            for (int var7 = 0; ~var7 > ~class344.field5043; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (~var8 != -1) {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
    public class196() {
        super(3, false);
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        if (arg1 != 0) {
            method1226(true);
        }
        ++field2801;
        int[][] var3 = super.field3135.method1774(arg0, -2);
        if (super.field3135.field4087) {
            int[] var4 = this.method1366(2, (byte) -40, arg0);
            int[][] var5 = this.method1369(0, (byte) 117, arg0);
            int[][] var6 = this.method1369(1, (byte) 115, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class344.field5043 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (~var17 == -1) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(BI)S")
    public static final short method1227(byte arg0, int arg1) {
        ++field2802;
        int var2 = (arg1 & 64726) >> 10;
        int var3 = 112 & arg1 >> 3;
        int var4 = -18 / ((-74 - arg0) / 51);
        int var5 = arg1 & 127;
        int var6 = var5 > 64 ? (-var5 + 127) * var3 >> 7 : var3 * var5 >> 7;
        int var7 = var5 + var6;
        int var8;
        if (~var7 == -1) {
            var8 = var6 << 1;
        } else {
            var8 = (var6 << 8) / var7;
        }
        return (short) (var7 | var2 << 10 | var8 >> 4 << 7);
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(III)V")
    public static final void method1228(int arg0, int arg1, int arg2) {
        ++field2807;
        class256 var3 = class363.method2385(arg0, arg2, (byte) 1);
        var3.method1614(0);
        var3.field3756 = arg1;
    }
}
