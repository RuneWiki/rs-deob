import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class289 extends class96 {

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    private int field3691 = 0;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    private int field3700 = 0;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    private int field3697 = 1;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    public static int field3696 = 0;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "Lsj;")
    public static class502 field3699;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILbt;)V", line = 3)
    public final void method31(int arg0, int arg1, class88 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -4) {
                    this.field3697 = arg2.method617(2);
                }
            } else {
                this.field3700 = arg2.method617(2);
            }
        } else {
            this.field3691 = arg2.method617(arg1 + 3);
        }
        if (arg1 != -1) {
            field3698 = -21;
        }
        ++field3692;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V", line = 53)
    public class289() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)V", line = 56)
    public final void method390(int arg0) {
        class18.method112(-33);
        if (arg0 > 15) {
            ++field3695;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)[I", line = 74)
    public final int[] method37(int arg0, int arg1) {
        ++field3693;
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (arg1 != 255) {
            this.method37(-12, 107);
        }
        if (super.field1331.field863) {
            int var4 = class74.field933[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; ~var6 > ~class269.field3403; ++var6) {
                int var7 = class510.field7476[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field3691 == -1) {
                    var9 = (-var4 + var7) * this.field3697;
                } else {
                    int var10 = var8 * var8 - -(var5 * var5) >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field3697 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (this.field3700 != 0) {
                    if (this.field3700 == 2) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class40.field587[255 & var12 >> 4] - -4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)V", line = 145)
    public static void method1750(int arg0) {
        field3699 = null;
        if (arg0 < 87) {
            method1750(-70);
        }
    }
}
