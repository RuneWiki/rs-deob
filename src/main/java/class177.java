import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class177 extends class205 {

    @OriginalMember(owner = "client!qi", name = "Y", descriptor = "I")
    private int field3313 = 4;

    @OriginalMember(owner = "client!qi", name = "bb", descriptor = "I")
    private int field3316 = 4;

    @OriginalMember(owner = "client!qi", name = "V", descriptor = "I")
    public static int field3310 = 0;

    @OriginalMember(owner = "client!qi", name = "X", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!qi", name = "Z", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!qi", name = "ab", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!qi", name = "W", descriptor = "[[[I")
    public static int[][][] field3311;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        ++field3314;
        int var4 = -7 % ((arg1 - -47) / 34);
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field3316 = arg0.method662((byte) -85);
            }
        } else {
            this.field3313 = arg0.method662((byte) -86);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method2((class109) null, (byte) 101, 6);
        }
        ++field3312;
        int[] var3 = super.field3810.method557(arg0 + 6978, arg1);
        if (super.field3810.field1635) {
            int var4 = class118.field2245 / this.field3313;
            int var5 = class134.field2598 / this.field3316;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method1322(0, (byte) 79, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method1322(class134.field2598 * var7 / var5, (byte) 67, 0);
            }
            for (int var8 = 0; class118.field2245 > var8; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class118.field2245 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)[[I")
    public final int[][] method96(int arg0, byte arg1) {
        int[][] var3 = super.field3815.method1003(-8357, arg0);
        ++field3315;
        if (arg1 <= 98) {
            field3310 = 71;
        }
        if (super.field3815.field3015) {
            int var4 = class118.field2245 / this.field3313;
            int var5 = class134.field2598 / this.field3316;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method1323(0, class134.field2598 * var6 / var5, -5920);
            } else {
                var7 = this.method1323(0, 0, -5920);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[2];
            int[] var13 = var3[1];
            for (int var14 = 0; class118.field2245 > var14; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class118.field2245 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var13[var14] = var9[var16];
                var12[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)V")
    public static void method1119(byte arg0) {
        int var1 = -51 % ((arg0 - 26) / 51);
        field3311 = null;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
    public class177() {
        super(1, false);
    }
}
