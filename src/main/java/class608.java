import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class608 extends class334 {

    @OriginalMember(owner = "client!fs", name = "G", descriptor = "I")
    private int field8642 = 4096;

    @OriginalMember(owner = "client!fs", name = "L", descriptor = "Z")
    private boolean field8646 = true;

    @OriginalMember(owner = "client!fs", name = "J", descriptor = "[I")
    public static int[] field8644 = new int[1000];

    @OriginalMember(owner = "client!fs", name = "E", descriptor = "[I")
    public static int[] field8640 = new int[14];

    @OriginalMember(owner = "client!fs", name = "M", descriptor = "Lsaa;")
    public static class657 field8647 = new class657();

    @OriginalMember(owner = "client!fs", name = "F", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!fs", name = "I", descriptor = "I")
    public static int field8643;

    @OriginalMember(owner = "client!fs", name = "K", descriptor = "I")
    public static int field8645;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZLol;)V", line = 3)
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        ++field8641;
        if (arg1) {
            method3524(103);
        }
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field8646 = arg2.method2557(14929) == 1;
            }
        } else {
            this.field8642 = arg2.method2565((byte) -96);
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V", line = 63)
    public class608() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZI)Z", line = 48)
    public static final boolean method3522(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field8640 = null;
        }
        ++field8645;
        return class464.method2700(arg0, -1, arg2) & class527.method3084(arg2, 5616, arg0);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIILjava/lang/Class;)Lkm;", line = 70)
    public static final class208 method3523(int arg0, int arg1, int arg2, Class arg3) {
        class172 var4 = class514.field7096[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        } else {
            for (class11 var5 = var4.field2594; var5 != null; var5 = var5.field145) {
                class208 var6 = var5.field143;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field3027 == arg1 && var6.field3035 == arg2) {
                    return var6;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZI)[[I", line = 95)
    public final int[][] method283(boolean arg0, int arg1) {
        ++field8643;
        int[][] var3 = super.field4734.method275(26422, arg1);
        if (!arg0) {
            this.method29(-87, true, (class431) null);
        }
        if (super.field4734.field425) {
            int[] var4 = this.method2052(0, 0, class147.field2360 & arg1 + -1);
            int[] var5 = this.method2052(0, 0, arg1);
            int[] var6 = this.method2052(0, 0, arg1 + 1 & class147.field2360);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class439.field6099 < ~var10; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field8642;
                int var12 = (var5[class478.field6578 & var10 + 1] + -var5[class478.field6578 & var10 - 1]) * this.field8642;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 - (-var16 - 4096)) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = var12 / var17;
                    var19 = var11 / var17;
                    var20 = 16777216 / var17;
                } else {
                    var18 = 0;
                    var20 = 0;
                    var19 = 0;
                }
                if (this.field8646) {
                    var19 = (var19 >> 1) + 2048;
                    var18 = 2048 - -(var18 >> 1);
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var19;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "(I)V", line = 177)
    public static void method3524(int arg0) {
        field8647 = null;
        field8644 = null;
        if (arg0 >= 100) {
            field8640 = null;
        }
    }
}
