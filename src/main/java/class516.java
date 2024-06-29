import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class516 extends class535 {

    @OriginalMember(owner = "client!dr", name = "G", descriptor = "I")
    private int field7476 = 0;

    @OriginalMember(owner = "client!dr", name = "L", descriptor = "I")
    private int field7481 = 0;

    @OriginalMember(owner = "client!dr", name = "I", descriptor = "I")
    private int field7478 = 1;

    @OriginalMember(owner = "client!dr", name = "F", descriptor = "J")
    public static long field7475 = -1L;

    @OriginalMember(owner = "client!dr", name = "H", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!dr", name = "J", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!dr", name = "K", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!dr", name = "M", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(II)[I")
    public final int[] method65(int arg0, int arg1) {
        ++field7482;
        if (arg1 != 1) {
            return null;
        } else {
            int[] var3 = super.field7885.method974(-30531, arg0);
            if (super.field7885.field2086) {
                int var4 = class448.field6442[arg0];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; ~class174.field2597 < ~var6; ++var6) {
                    int var7 = class539.field7939[var6];
                    int var8 = var7 - 2048 >> 1;
                    int var11;
                    if (~this.field7476 != -1) {
                        int var9 = var8 * var8 - -(var5 * var5) >> 12;
                        int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                        var11 = (int) ((double) (this.field7478 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (-var4 + var7) * this.field7478;
                    }
                    int var12 = var11 - (var11 & -4096);
                    if (~this.field7481 == -1) {
                        var12 = class294.field4388[(var12 & 4084) >> 4] + 4096 >> 1;
                    } else if (~this.field7481 == -3) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "(B)V")
    public final void method66(byte arg0) {
        ++field7477;
        if (arg0 <= 111) {
            this.field7478 = 121;
        }
        class100.method744(-125);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILwn;I)V")
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 3) {
                    this.field7478 = arg1.method3072((byte) -127);
                }
            } else {
                this.field7481 = arg1.method3072((byte) -124);
            }
        } else {
            this.field7476 = arg1.method3072((byte) -119);
        }
        ++field7480;
        if (arg2 != -6232) {
            this.field7476 = 40;
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V")
    public class516() {
        super(0, true);
    }
}
