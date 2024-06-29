import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class494 extends class325 {

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
    private int field6837 = 585;

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "I")
    public static int field6839 = 0;

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "I")
    public static int field6842 = 100;

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "[I")
    public static int[] field6838;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(Z)V")
    public static final void method2864(boolean arg0) {
        class120.field1754.method718((byte) 124);
        if (!arg0) {
            field6842 = 114;
        }
        ++field6836;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljp;IB)V")
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            this.field6837 = arg0.method2359(-1);
        }
        ++field6843;
        if (arg2 >= -41) {
            field6842 = -56;
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(III)Z")
    public static final boolean method2865(int arg0, int arg1, int arg2) {
        ++field6844;
        if (arg2 != 27677) {
            method2865(-21, -16, 37);
        }
        return ~(1024 & arg0) != -1;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
    public static void method2866(int arg0) {
        field6838 = null;
        if (arg0 != 0) {
            method2864(true);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)[I")
    public final int[] method100(byte arg0, int arg1) {
        ++field6841;
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (arg0 < 21) {
            this.field6837 = -86;
        }
        if (super.field4727.field6067) {
            int var4 = class621.field8370[arg1];
            for (int var5 = 0; ~class261.field3874 < ~var5; ++var5) {
                int var6 = class556.field7498[var5];
                if (var6 > this.field6837 && ~var6 > ~(-this.field6837 + 4096) && ~var4 < ~(-this.field6837 + 2048) && 2048 - -this.field6837 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field6837 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (-this.field6837 + 2048 < var6 && var6 < this.field6837 + 2048) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field6837;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field6837 + 2048);
                } else if (this.field6837 <= var4 && ~(-this.field6837 + 4096) <= ~var4) {
                    if (this.field6837 <= var6 && ~(-this.field6837 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 <= -1 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field6837);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field6837;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field6837 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(BLjava/lang/String;)V")
    public static final void method2867(byte arg0, String arg1) {
        class746.method4129(0, "", "", arg1, 0, "", 16773);
        ++field6840;
        if (arg0 <= 15) {
            field6839 = -54;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
    public class494() {
        super(0, true);
    }
}
