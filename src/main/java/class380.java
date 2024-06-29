import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class380 extends class666 {

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
    private int field4937 = 585;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "Ljava/lang/String;")
    public static String field4932 = "";

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
    public static int field4935 = 0;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "Ljava/lang/Object;")
    public static Object field4936;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "[I")
    public static int[] field4938;

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V", line = 3)
    public class380() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILiaa;Z)V", line = 8)
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field4937 = arg1.method2574(-1758460248);
        }
        ++field4933;
        if (!arg2) {
            method2080((byte) -5);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[I", line = 35)
    public final int[] method122(int arg0, int arg1) {
        ++field4934;
        if (arg0 >= -21) {
            method2080((byte) 54);
        }
        int[] var3 = super.field9466.method1811(arg1, 51);
        if (super.field9466.field4172) {
            int var4 = class476.field6935[arg1];
            for (int var5 = 0; ~var5 > ~class501.field7222; ++var5) {
                int var6 = class579.field8246[var5];
                if (~var6 < ~this.field4937 && var6 < -this.field4937 + 4096 && ~(2048 - this.field4937) > ~var4 && ~(this.field4937 + 2048) < ~var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field4937 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (var6 > -this.field4937 + 2048 && var6 < 2048 - -this.field4937) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field4937;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field4937 + 2048);
                } else if (var4 >= this.field4937 && ~(-this.field4937 + 4096) <= ~var4) {
                    if (this.field4937 <= var6 && ~(-this.field4937 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = ~var15 <= -1 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field4937 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field4937;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field4937 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V", line = 127)
    public static void method2080(byte arg0) {
        field4936 = null;
        field4932 = null;
        int var1 = 68 / ((arg0 - 50) / 46);
        field4938 = null;
    }
}
