import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class655 extends class739 {

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
    private int field9389 = 585;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "Z")
    public static boolean field9386 = true;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "I")
    public static int field9387;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public static int field9388;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
    public static int field9390;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public static int field9391;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B[S[Ljava/lang/String;)V", line = 3)
    public static final void method3754(byte arg0, short[] arg1, String[] arg2) {
        class660.method3767((byte) 95, arg2, arg1, 0, arg2.length + -1);
        int var3 = 99 % ((-5 - arg0) / 59);
        ++field9391;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lsl;IB)V", line = 16)
    public final void method112(class479 arg0, int arg1, byte arg2) {
        ++field9390;
        if (arg2 != 1) {
            method3754((byte) -118, (short[]) null, (String[]) null);
        }
        if (arg1 == 0) {
            this.field9389 = arg0.method2882(-1);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)[I", line = 45)
    public final int[] method445(boolean arg0, int arg1) {
        ++field9388;
        if (arg0) {
            method3754((byte) 44, (short[]) null, (String[]) null);
        }
        int[] var3 = super.field10317.method1042(0, arg1);
        if (super.field10317.field2170) {
            int var4 = class19.field185[arg1];
            for (int var5 = 0; class399.field5703 > var5; ++var5) {
                int var6 = class604.field8580[var5];
                if (var6 > this.field9389 && var6 < 4096 - this.field9389 && ~var4 < ~(-this.field9389 + 2048) && this.field9389 + 2048 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field9389 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (~(-this.field9389 + 2048) > ~var6 && ~(this.field9389 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field9389;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field9389 + 2048);
                } else if (var4 >= this.field9389 && var4 <= -this.field9389 + 4096) {
                    if (~this.field9389 >= ~var6 && ~(-this.field9389 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field9389 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field9389;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field9389 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V", line = 125)
    public class655() {
        super(0, true);
    }
}
