import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class549 extends class4 {

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
    private int field7638 = 204;

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "I")
    private int field7637 = 1;

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
    private int field7636 = 1;

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "I")
    public static int field7635 = 1;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
    public class549() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field7638 = arg1.method3090(-110);
                }
            } else {
                this.field7636 = arg1.method3045(-127);
            }
        } else {
            this.field7637 = arg1.method3045(-127);
        }
        ++field7634;
        if (arg0 >= -89) {
            this.field7636 = 1;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field7633;
        if (arg0 != 10) {
            this.method15((byte) 8, 80);
        }
        int[] var3 = super.field31.method2252(arg1, 11);
        if (super.field31.field5127) {
            for (int var4 = 0; class132.field1627 > var4; ++var4) {
                int var5 = class66.field881[var4];
                int var6 = class130.field1606[arg1];
                int var7 = this.field7637 * var5 >> 12;
                int var8 = this.field7636 * var6 >> 12;
                int var9 = var5 % (4096 / this.field7637) * this.field7637;
                int var10 = var6 % (4096 / this.field7636) * this.field7636;
                if (var10 < this.field7638) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var9 > ~this.field7638) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var9 > ~this.field7638) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }
}
