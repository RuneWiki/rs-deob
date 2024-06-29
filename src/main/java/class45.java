import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class45 extends class148 {

    @OriginalMember(owner = "client!qn", name = "L", descriptor = "I")
    private int field716 = 1365;

    @OriginalMember(owner = "client!qn", name = "O", descriptor = "I")
    private int field719 = 0;

    @OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
    private int field715 = 0;

    @OriginalMember(owner = "client!qn", name = "S", descriptor = "I")
    private int field723 = 20;

    @OriginalMember(owner = "client!qn", name = "P", descriptor = "Llt;")
    public static class475 field720 = new class475("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!qn", name = "Q", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!qn", name = "R", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!qn", name = "M", descriptor = "Lns;")
    public static class277 field717;

    @OriginalMember(owner = "client!qn", name = "N", descriptor = "[Z")
    public static boolean[] field718;

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V", line = 4)
    public class45() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)[I", line = 8)
    public final int[] method25(int arg0, int arg1) {
        ++field714;
        int[] var3 = super.field2193.method497(arg1, false);
        if (arg0 > -65) {
            this.method23(-30, (class209) null, -28);
        }
        if (super.field2193.field1312) {
            for (int var4 = 0; var4 < class320.field4579; ++var4) {
                int var5 = (class517.field7539[var4] << 12) / this.field716 + this.field715;
                int var6 = (class456.field6752[arg1] << 12) / this.field716 + this.field719;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 + var12) > -16385 && ~this.field723 < ~var13) {
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = var7 + var11 + -var12;
                    ++var13;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = ~var13 <= ~(this.field723 + -1) ? 0 : (var13 << 12) / this.field723;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILdh;I)V", line = 67)
    public final void method23(int arg0, class209 arg1, int arg2) {
        ++field721;
        int var4 = 73 % ((-88 - arg2) / 33);
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        this.field719 = arg1.method1450((byte) 58);
                    }
                } else {
                    this.field715 = arg1.method1450((byte) 111);
                }
            } else {
                this.field723 = arg1.method1450((byte) 32);
            }
        } else {
            this.field716 = arg1.method1450((byte) 79);
        }
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)V", line = 121)
    public static void method287(int arg0) {
        field720 = null;
        field718 = null;
        field717 = null;
        if (arg0 != -756674292) {
            method287(-51);
        }
    }
}
