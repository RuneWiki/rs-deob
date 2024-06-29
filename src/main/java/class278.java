import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class278 extends class264 {

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    private int field4001 = 585;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "[I")
    public static int[] field3996 = new int[1000];

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V", line = 7)
    public class278() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V", line = 10)
    public static final void method1861(int arg0, int arg1, int arg2) {
        ++field4000;
        class334 var3 = class352.method2172(arg2, 12, 16711935);
        var3.method2104(0);
        var3.field4648 = arg0;
        if (arg1 != -31727) {
            field3996 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLkk;I)V", line = 24)
    public final void method7(byte arg0, class161 arg1, int arg2) {
        ++field3999;
        if (~arg2 == -1) {
            this.field4001 = arg1.method1134(-16848);
        }
        if (arg0 < 31) {
            method1861(79, -46, -16);
        }
    }

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "(I)V", line = 60)
    public static void method1862(int arg0) {
        int var1 = -22 % ((arg0 - 81) / 39);
        field3996 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)[I", line = 72)
    public final int[] method90(int arg0, int arg1) {
        ++field4002;
        int[] var3 = super.field3808.method958((byte) 91, arg0);
        if (arg1 != 21034) {
            field3996 = null;
        }
        if (super.field3808.field1732) {
            int var4 = class379.field5216[arg0];
            for (int var5 = 0; class478.field6792 > var5; ++var5) {
                int var6 = class151.field2084[var5];
                if (~this.field4001 > ~var6 && -this.field4001 + 4096 > var6 && ~var4 < ~(-this.field4001 + 2048) && ~(2048 - -this.field4001) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field4001 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (2048 - this.field4001 < var6 && ~var6 > ~(this.field4001 + 2048)) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 <= -1 ? var11 : -var11;
                    int var13 = var12 - this.field4001;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field4001 + 2048);
                } else if (~this.field4001 >= ~var4 && ~(4096 - this.field4001) <= ~var4) {
                    if (var6 >= this.field4001 && ~(-this.field4001 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field4001);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field4001;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field4001 + 2048);
                }
            }
        }
        return var3;
    }
}
