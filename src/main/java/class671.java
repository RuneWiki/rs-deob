import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class671 extends class192 {

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
    private int field9314 = 1;

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "I")
    private int field9316 = 0;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
    private int field9313 = 0;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "Lbm;")
    public static class637 field9315 = new class637();

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "I")
    public static int field9312;

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "I")
    public static int field9317;

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "I")
    public static int field9318;

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "Lww;")
    public static class305 field9319;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V", line = 5)
    public final void method618(byte arg0) {
        class265.method1641((byte) 122);
        ++field9312;
        if (arg0 != 63) {
            field9315 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 73)
    public class671() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILfd;I)V", line = 30)
    public final void method109(int arg0, class418 arg1, int arg2) {
        if (arg2 == -12160) {
            ++field9317;
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 == 3) {
                        this.field9314 = arg1.method2396(2);
                    }
                } else {
                    this.field9316 = arg1.method2396(-31);
                }
            } else {
                this.field9313 = arg1.method2396(-103);
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)[I", line = 81)
    public final int[] method118(int arg0, byte arg1) {
        ++field9318;
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (super.field2448.field7266) {
            int var4 = class221.field2895[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; class561.field7319 > var6; ++var6) {
                int var7 = class183.field2359[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (this.field9313 != 0) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field9314 * var10) * 3.141592653589793D);
                } else {
                    var11 = (var7 - var4) * this.field9314;
                }
                int var12 = var11 - (-4096 & var11);
                if (~this.field9316 != -1) {
                    if (this.field9316 == 2) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class5.field34[(var12 & 4095) >> 4] - -4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg1 >= -123) {
            this.method109(8, (class418) null, 40);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V", line = 152)
    public static void method3687(int arg0) {
        field9315 = null;
        if (arg0 > 23) {
            field9319 = null;
        }
    }
}
