import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class608 extends class601 {

    @OriginalMember(owner = "client!wn", name = "F", descriptor = "I")
    private int field7692 = 4096;

    @OriginalMember(owner = "client!wn", name = "H", descriptor = "I")
    private int field7694 = 4096;

    @OriginalMember(owner = "client!wn", name = "J", descriptor = "I")
    private int field7696 = 4096;

    @OriginalMember(owner = "client!wn", name = "G", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!wn", name = "I", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!wn", name = "K", descriptor = "I")
    public static int field7697;

    @OriginalMember(owner = "client!wn", name = "L", descriptor = "I")
    public static int field7698;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(II)[[I", line = 3)
    public final int[][] method638(int arg0, int arg1) {
        if (arg0 != 2017) {
            this.method638(-6, -17);
        }
        ++field7697;
        int[][] var3 = super.field7647.method3510((byte) -51, arg1);
        if (super.field7647.field8306) {
            int[][] var4 = this.method3247((byte) -116, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class418.field5518; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field7694 * var12 >> 12;
                    var9[var11] = this.field7692 * var13 >> 12;
                    var10[var11] = this.field7696 * var14 >> 12;
                } else {
                    var8[var11] = this.field7694;
                    var9[var11] = this.field7692;
                    var10[var11] = this.field7696;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V", line = 72)
    public class608() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lmc;II)V", line = 79)
    public final void method259(class234 arg0, int arg1, int arg2) {
        int var4 = -83 % ((arg2 - 40) / 52);
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field7696 = arg0.method1553((byte) -123);
                }
            } else {
                this.field7692 = arg0.method1553((byte) -122);
            }
        } else {
            this.field7694 = arg0.method1553((byte) -125);
        }
        ++field7695;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 124)
    public static final int method3263(boolean arg0, String arg1) {
        ++field7698;
        int var2 = arg1.length();
        if (!arg0) {
            field7693 = 120;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2; ++var4) {
            var3 = -var3 + (var3 << 5) + class755.method4099(-256, arg1.charAt(var4));
        }
        return var3;
    }
}
