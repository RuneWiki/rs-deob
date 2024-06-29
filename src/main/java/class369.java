import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class369 extends class666 {

    @OriginalMember(owner = "client!qba", name = "M", descriptor = "I")
    private int field4799 = 4;

    @OriginalMember(owner = "client!qba", name = "L", descriptor = "I")
    private int field4798 = 4;

    @OriginalMember(owner = "client!qba", name = "D", descriptor = "I")
    public static int field4790 = 0;

    @OriginalMember(owner = "client!qba", name = "F", descriptor = "Lmfa;")
    public static class562 field4792 = new class562();

    @OriginalMember(owner = "client!qba", name = "K", descriptor = "[I")
    public static int[] field4797 = new int[256];

    @OriginalMember(owner = "client!qba", name = "G", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!qba", name = "H", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!qba", name = "I", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!qba", name = "J", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!qba", name = "E", descriptor = "Lbl;")
    public static class592 field4791;

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if ((1 & var1) == 1) {
                    var1 = -306674912 ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field4797[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IB)[[I", line = 5)
    public final int[][] method1251(int arg0, byte arg1) {
        ++field4795;
        if (arg1 != 98) {
            method2018((byte) 70);
        }
        int[][] var3 = super.field9471.method3639(40, arg0);
        if (super.field9471.field9180) {
            int var4 = class501.field7222 / this.field4798;
            int var5 = class567.field8041 / this.field4799;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method3737(class567.field8041 * var6 / var5, 0, 3);
            } else {
                var7 = this.method3737(0, 0, 3);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class501.field7222 < ~var14; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class501.field7222 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(II)[I", line = 73)
    public final int[] method122(int arg0, int arg1) {
        if (arg0 >= -21) {
            method2018((byte) 120);
        }
        ++field4796;
        int[] var3 = super.field9466.method1811(arg1, 104);
        if (super.field9466.field4172) {
            int var4 = class501.field7222 / this.field4798;
            int var5 = class567.field8041 / this.field4799;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method3739(0, -121, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method3739(0, -128, class567.field8041 * var7 / var5);
            }
            for (int var8 = 0; var8 < class501.field7222; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class501.field7222 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(ILiaa;Z)V", line = 128)
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (!arg2) {
            this.method1251(-113, (byte) 84);
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field4799 = arg1.method2541(110);
            }
        } else {
            this.field4798 = arg1.method2541(86);
        }
        ++field4794;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)V", line = 163)
    public static void method2018(byte arg0) {
        field4792 = null;
        field4791 = null;
        field4797 = null;
        int var1 = -46 / ((arg0 - 59) / 37);
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "()V", line = 182)
    public class369() {
        super(1, false);
    }
}
