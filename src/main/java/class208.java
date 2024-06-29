import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class208 extends class615 {

    @OriginalMember(owner = "client!nt", name = "F", descriptor = "I")
    private int field2982 = 585;

    @OriginalMember(owner = "client!nt", name = "G", descriptor = "Ldb;")
    public static class298 field2983 = new class298(63, 6);

    @OriginalMember(owner = "client!nt", name = "H", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!nt", name = "I", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "()V", line = 5)
    public class208() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(BILeh;)V", line = 11)
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (arg1 == 0) {
            this.field2982 = arg2.method2001((byte) -83);
        }
        if (arg0 > 44) {
            ++field2984;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)V", line = 37)
    public static void method1339(boolean arg0) {
        field2983 = null;
        if (arg0) {
            method1339(false);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)[I", line = 48)
    public final int[] method8(int arg0, byte arg1) {
        if (arg1 != -18) {
            method1339(true);
        }
        ++field2985;
        int[] var3 = super.field8125.method298(arg0, -25);
        if (super.field8125.field579) {
            int var4 = class402.field5353[arg0];
            for (int var5 = 0; var5 < class505.field6740; ++var5) {
                int var6 = class168.field2599[var5];
                if (~var6 < ~this.field2982 && ~var6 > ~(-this.field2982 + 4096) && var4 > 2048 - this.field2982 && ~var4 > ~(2048 - -this.field2982)) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field2982 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (~(-this.field2982 + 2048) > ~var6 && ~(this.field2982 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field2982;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field2982 + 2048);
                } else if (~var4 <= ~this.field2982 && ~(-this.field2982 + 4096) <= ~var4) {
                    if (var6 >= this.field2982 && ~(4096 - this.field2982) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field2982 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field2982;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field2982);
                }
            }
        }
        return var3;
    }
}
