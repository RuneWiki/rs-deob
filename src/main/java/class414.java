import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class414 extends class314 {

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "[I")
    public static int[] field6348 = new int[2];

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "Lri;")
    public static class97 field6351;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(III)Z")
    public static final boolean method2638(int arg0, int arg1, int arg2) {
        ++field6350;
        if (!(class311.method2134(arg0, (byte) 95, arg1) | ~(65536 & arg1) != -1) && !class157.method1298(-121, arg0, arg1)) {
            if (arg2 != -2) {
                return true;
            } else {
                return ~(arg0 & 55) == -1 && class136.method1170(127, arg0, arg1);
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    public class414() {
        super(3, false);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        ++field6352;
        int[] var3 = super.field4928.method534((byte) -81, arg0);
        if (arg1 <= 109) {
            this.method4(-89, (byte) 87);
        }
        if (super.field4928.field618) {
            int[] var4 = this.method2140(0, arg0, -122);
            int[] var5 = this.method2140(1, arg0, -127);
            int[] var6 = this.method2140(2, arg0, -122);
            for (int var7 = 0; ~var7 > ~class81.field1009; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = var4[var7] * var8 - -((4096 - var8) * var5[var7]) >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(III)I")
    public static final int method2639(int arg0, int arg1, int arg2) {
        ++field6354;
        int var3 = 0;
        while (~arg1 < -1) {
            var3 = arg2 & 1 | var3 << 1;
            arg2 >>>= 1;
            --arg1;
        }
        if (arg0 != 24819) {
            method2638(-47, -73, -65);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method4(int arg0, byte arg1) {
        ++field6353;
        if (arg1 <= 68) {
            return null;
        } else {
            int[][] var3 = super.field4931.method1345(arg0, 0);
            if (super.field4931.field2799) {
                int[] var4 = this.method2140(2, arg0, -126);
                int[][] var5 = this.method2143(0, arg0, (byte) -4);
                int[][] var6 = this.method2143(1, arg0, (byte) -4);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; ~class81.field1009 < ~var16; ++var16) {
                    int var17 = var4[var16];
                    if (~var17 == -4097) {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var12[var16];
                    } else if (var17 == 0) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = 4096 - var17;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLie;I)V")
    public final void method5(byte arg0, class6 arg1, int arg2) {
        if (~arg2 == -1) {
            super.field4936 = ~arg1.method70(-9059) == -2;
        }
        if (arg0 > -1) {
            method2638(114, -115, -102);
        }
        ++field6355;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
    public static void method2640(byte arg0) {
        field6348 = null;
        if (arg0 != 5) {
            method2638(74, -73, 69);
        }
        field6351 = null;
    }
}
