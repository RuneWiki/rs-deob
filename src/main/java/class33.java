import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class33 extends class17 {

    @OriginalMember(owner = "client!bt", name = "K", descriptor = "Z")
    private boolean field383 = true;

    @OriginalMember(owner = "client!bt", name = "M", descriptor = "I")
    private int field385 = 4096;

    @OriginalMember(owner = "client!bt", name = "G", descriptor = "I")
    public static int field379 = 1339;

    @OriginalMember(owner = "client!bt", name = "F", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!bt", name = "H", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!bt", name = "J", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!bt", name = "L", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!bt", name = "I", descriptor = "Lo;")
    public static class24 field381;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lwm;II)V")
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (arg2 == 5159) {
            if (arg1 != 0) {
                if (~arg1 == -2) {
                    this.field383 = arg0.method2357((byte) 117) == 1;
                }
            } else {
                this.field385 = arg0.method2338(0);
            }
            ++field378;
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
    public class33() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        ++field382;
        int[][] var3 = super.field201.method1851(arg0, (byte) -56);
        if (arg1 != -25) {
            this.method34((class403) null, 44, -31);
        }
        if (super.field201.field4431) {
            int[] var4 = this.method88(arg0 - 1 & class38.field417, -4526, 0);
            int[] var5 = this.method88(arg0, -4526, 0);
            int[] var6 = this.method88(arg0 + 1 & class38.field417, -4526, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class530.field7763 < ~var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field385;
                int var12 = (var5[var10 + 1 & class43.field499] + -var5[class43.field499 & var10 + -1]) * this.field385;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 - (-var16 - 4096)) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = var12 / var17;
                    var18 = var11 / var17;
                    var20 = 16777216 / var17;
                }
                if (this.field383) {
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var20 = 2048 - -(var20 >> 1);
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "(I)V")
    public static void method195(int arg0) {
        field381 = null;
        int var1 = -38 / ((8 - arg0) / 33);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IZIZ)I")
    public static final int method196(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (arg3) {
            method195(-4);
        }
        ++field384;
        class167 var4 = class119.method803(arg1, arg2, 0);
        if (var4 == null) {
            return 0;
        } else {
            return arg0 >= 0 && arg0 < var4.field2433.length ? var4.field2433[arg0] : 0;
        }
    }
}
