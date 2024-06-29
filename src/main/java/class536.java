import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class536 extends class748 {

    @OriginalMember(owner = "client!dfa", name = "I", descriptor = "I")
    private int field7506 = 1;

    @OriginalMember(owner = "client!dfa", name = "L", descriptor = "I")
    private int field7509 = 204;

    @OriginalMember(owner = "client!dfa", name = "M", descriptor = "I")
    private int field7510 = 1;

    @OriginalMember(owner = "client!dfa", name = "J", descriptor = "I")
    public static int field7507 = 0;

    @OriginalMember(owner = "client!dfa", name = "H", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!dfa", name = "K", descriptor = "I")
    public static int field7508;

    @OriginalMember(owner = "client!dfa", name = "N", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "()V", line = 9)
    public class536() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IZLvj;)V", line = 18)
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field7509 = arg2.method193(2);
                }
            } else {
                this.field7506 = arg2.method194((byte) 119);
            }
        } else {
            this.field7510 = arg2.method194((byte) 119);
        }
        if (!arg1) {
            ++field7508;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(II)[I", line = 67)
    public final int[] method25(int arg0, int arg1) {
        ++field7511;
        if (arg1 != 255) {
            this.method25(-14, -120);
        }
        int[] var3 = super.field10407.method3873(0, arg0);
        if (super.field10407.field9527) {
            for (int var4 = 0; ~var4 > ~class424.field5889; ++var4) {
                int var5 = class237.field3298[var4];
                int var6 = class370.field4727[arg0];
                int var7 = this.field7510 * var5 >> 12;
                int var8 = this.field7506 * var6 >> 12;
                int var9 = var5 % (4096 / this.field7510) * this.field7510;
                int var10 = var6 % (4096 / this.field7506) * this.field7506;
                if (~var10 > ~this.field7509) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field7509) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field7509) {
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
        return var3;
    }
}
