import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class672 extends class334 {

    @OriginalMember(owner = "client!iea", name = "H", descriptor = "I")
    private int field9408 = 204;

    @OriginalMember(owner = "client!iea", name = "J", descriptor = "I")
    private int field9410 = 1;

    @OriginalMember(owner = "client!iea", name = "L", descriptor = "I")
    private int field9412 = 1;

    @OriginalMember(owner = "client!iea", name = "K", descriptor = "I")
    public static int field9411 = 1407;

    @OriginalMember(owner = "client!iea", name = "F", descriptor = "I")
    public static int field9406;

    @OriginalMember(owner = "client!iea", name = "G", descriptor = "I")
    public static int field9407;

    @OriginalMember(owner = "client!iea", name = "I", descriptor = "I")
    public static int field9409;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IZLol;)V", line = 4)
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        ++field9409;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field9408 = arg2.method2565((byte) -82);
                }
            } else {
                this.field9412 = arg2.method2557(14929);
            }
        } else {
            this.field9410 = arg2.method2557(14929);
        }
        if (arg1) {
            this.method29(6, true, (class431) null);
        }
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(BI)[I", line = 49)
    public static final int[] method3766(byte arg0, int arg1) {
        ++field9407;
        int[] var2 = new int[3];
        if (arg0 != 103) {
            method3766((byte) -98, -17);
        }
        class724.method4017((byte) 126, class706.method3946(arg1, -106));
        var2[0] = class99.field1449.get(5);
        var2[1] = class99.field1449.get(2);
        var2[2] = class99.field1449.get(1);
        return var2;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(II)[I", line = 67)
    public final int[] method28(int arg0, int arg1) {
        ++field9406;
        int[] var3 = super.field4743.method1027((byte) -124, arg0);
        if (super.field4743.field1993) {
            for (int var4 = 0; var4 < class439.field6099; ++var4) {
                int var5 = class295.field4296[var4];
                int var6 = class527.field7361[arg0];
                int var7 = this.field9410 * var5 >> 12;
                int var8 = this.field9412 * var6 >> 12;
                int var9 = var5 % (4096 / this.field9410) * this.field9410;
                int var10 = var6 % (4096 / this.field9412) * this.field9412;
                if (var10 < this.field9408) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field9408) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field9408 < ~var9) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
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
        return arg1 != -22563988 ? null : var3;
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "()V", line = 160)
    public class672() {
        super(0, true);
    }
}
