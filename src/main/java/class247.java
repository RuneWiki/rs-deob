import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class247 extends class270 {

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    private int field3590 = 585;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "Ljava/lang/String;")
    public static String field3584 = "Loading title screen - ";

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "F")
    public static float field3586 = 0.0F;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "Ldp;")
    public static class174 field3585;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V", line = 4)
    public static void method1786(boolean arg0) {
        field3585 = null;
        field3584 = null;
        if (!arg0) {
            field3586 = 0.626087F;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V", line = 15)
    public class247() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLec;I)V", line = 18)
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (arg0 == 108) {
            ++field3588;
            if (~arg2 == -1) {
                this.field3590 = arg1.method320((byte) -87);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)Ltp;", line = 50)
    public static final class188 method1787(int arg0, int arg1) {
        ++field3587;
        if (arg0 <= 31) {
            field3586 = 0.6910332F;
        }
        return (class188) class319.field4606.method1219((long) arg1, -114);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)[I", line = 64)
    public final int[] method81(byte arg0, int arg1) {
        if (arg0 <= 26) {
            return null;
        } else {
            ++field3589;
            int[] var3 = super.field4053.method396(arg1, -85);
            if (super.field4053.field815) {
                int var4 = class364.field5185[arg1];
                for (int var5 = 0; ~class161.field2445 < ~var5; ++var5) {
                    int var6 = class136.field2168[var5];
                    if (~this.field3590 > ~var6 && ~(-this.field3590 + 4096) < ~var6 && -this.field3590 + 2048 < var4 && ~var4 > ~(this.field3590 + 2048)) {
                        int var7 = 2048 - var6;
                        int var8 = ~var7 > -1 ? -var7 : var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (-this.field3590 + 2048);
                        var3[var5] = -var10 + 4096;
                    } else if (~(-this.field3590 + 2048) > ~var6 && this.field3590 + 2048 > var6) {
                        int var11 = var4 + -2048;
                        int var12 = ~var11 <= -1 ? var11 : -var11;
                        int var13 = var12 - this.field3590;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (2048 - this.field3590);
                    } else if (var4 >= this.field3590 && -this.field3590 + 4096 >= var4) {
                        if (this.field3590 <= var6 && var6 <= -this.field3590 + 4096) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = ~var15 > -1 ? -var15 : var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (2048 - this.field3590);
                            var3[var5] = -var18 + 4096;
                        }
                    } else {
                        int var19 = var6 + -2048;
                        int var20 = var19 < 0 ? -var19 : var19;
                        int var21 = var20 - this.field3590;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (-this.field3590 + 2048);
                    }
                }
            }
            return var3;
        }
    }
}
