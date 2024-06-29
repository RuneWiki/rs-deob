import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class350 extends class512 {

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "I")
    private int field5478 = 585;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "[I")
    public static int[] field5470 = new int[13];

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "[I")
    public static int[] field5474 = new int[13];

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "I")
    public static int field5480 = 0;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "Lc;")
    public static class202 field5472;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "Lia;")
    public static class23 field5469;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)Z", line = 9)
    public static final boolean method2250(int arg0) {
        ++field5477;
        if (class432.field6464 != 0) {
            return true;
        } else {
            return arg0 != -6257 ? false : class509.field7398.method2384(true);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZILia;)V", line = 24)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        ++field5473;
        if (arg1 == 0) {
            this.field5478 = arg2.method132(125);
        }
        if (!arg0) {
            field5472 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(Z)[Lbs;", line = 53)
    public static final class111[] method2251(boolean arg0) {
        if (!arg0) {
            method2251(true);
        }
        ++field5471;
        return new class111[] { class187.field2932, class41.field678, class516.field7641 };
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)V", line = 64)
    public static void method2252(byte arg0) {
        int var1 = 101 % ((52 - arg0) / 63);
        field5469 = null;
        field5472 = null;
        field5470 = null;
        field5474 = null;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V", line = 81)
    public class350() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)[I", line = 90)
    public final int[] method75(int arg0, byte arg1) {
        ++field5479;
        int var3 = -3 / ((arg1 - 43) / 48);
        int[] var4 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            int var5 = class412.field6233[arg0];
            for (int var6 = 0; ~class402.field6113 < ~var6; ++var6) {
                int var7 = class276.field4540[var6];
                if (~this.field5478 > ~var7 && ~var7 > ~(-this.field5478 + 4096) && var5 > -this.field5478 + 2048 && var5 < this.field5478 + 2048) {
                    int var8 = -var7 + 2048;
                    int var9 = var8 >= 0 ? var8 : -var8;
                    int var10 = var9 << 12;
                    int var11 = var10 / (2048 - this.field5478);
                    var4[var6] = -var11 + 4096;
                } else if (var7 > -this.field5478 + 2048 && this.field5478 + 2048 > var7) {
                    int var12 = var5 + -2048;
                    int var13 = var12 < 0 ? -var12 : var12;
                    int var14 = var13 - this.field5478;
                    int var15 = var14 << 12;
                    var4[var6] = var15 / (-this.field5478 + 2048);
                } else if (~var5 <= ~this.field5478 && ~(-this.field5478 + 4096) <= ~var5) {
                    if (~this.field5478 >= ~var7 && var7 <= -this.field5478 + 4096) {
                        var4[var6] = 0;
                    } else {
                        int var16 = -var5 + 2048;
                        int var17 = var16 >= 0 ? var16 : -var16;
                        int var18 = var17 << 12;
                        int var19 = var18 / (2048 - this.field5478);
                        var4[var6] = -var19 + 4096;
                    }
                } else {
                    int var20 = var7 + -2048;
                    int var21 = var20 < 0 ? -var20 : var20;
                    int var22 = var21 - this.field5478;
                    int var23 = var22 << 12;
                    var4[var6] = var23 / (-this.field5478 + 2048);
                }
            }
        }
        return var4;
    }
}
