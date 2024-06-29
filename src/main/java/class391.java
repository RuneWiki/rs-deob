import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class391 extends class30 {

    @OriginalMember(owner = "client!ifa", name = "F", descriptor = "I")
    private int field5542 = 20;

    @OriginalMember(owner = "client!ifa", name = "H", descriptor = "I")
    private int field5544 = 0;

    @OriginalMember(owner = "client!ifa", name = "G", descriptor = "I")
    private int field5543 = 1365;

    @OriginalMember(owner = "client!ifa", name = "C", descriptor = "I")
    private int field5540 = 0;

    @OriginalMember(owner = "client!ifa", name = "E", descriptor = "Lem;")
    public static class206 field5541 = new class206(49, 6);

    @OriginalMember(owner = "client!ifa", name = "z", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!ifa", name = "A", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!ifa", name = "B", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(Z)V")
    public static void method2293(boolean arg0) {
        if (!arg0) {
            field5541 = null;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "()V")
    public class391() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(II)[I")
    public final int[] method48(int arg0, int arg1) {
        ++field5539;
        if (arg0 != 1) {
            this.field5542 = 91;
        }
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (super.field374.field9032) {
            for (int var4 = 0; class31.field399 > var4; ++var4) {
                int var5 = (class48.field568[var4] << 12) / this.field5543 + this.field5540;
                int var6 = (class430.field6016[arg1] << 12) / this.field5543 + this.field5544;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && var13 < this.field5542) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var11 + var7;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = ~var13 <= ~(this.field5542 + -1) ? 0 : (var13 << 12) / this.field5542;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BILac;)V")
    public final void method27(byte arg0, int arg1, class501 arg2) {
        ++field5537;
        if (arg0 >= 100) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (arg1 != 2) {
                        if (~arg1 == -4) {
                            this.field5544 = arg2.method2845(-1);
                        }
                    } else {
                        this.field5540 = arg2.method2845(-1);
                    }
                } else {
                    this.field5542 = arg2.method2845(-1);
                }
            } else {
                this.field5543 = arg2.method2845(-1);
            }
        }
    }
}
