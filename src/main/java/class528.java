import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class528 extends class325 {

    @OriginalMember(owner = "client!eaa", name = "C", descriptor = "I")
    private int field7226 = 204;

    @OriginalMember(owner = "client!eaa", name = "E", descriptor = "I")
    private int field7228 = 1;

    @OriginalMember(owner = "client!eaa", name = "H", descriptor = "I")
    private int field7231 = 1;

    @OriginalMember(owner = "client!eaa", name = "F", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!eaa", name = "G", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!eaa", name = "D", descriptor = "[Ls;")
    public static class296[] field7227;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BI)[I", line = 4)
    public final int[] method100(byte arg0, int arg1) {
        ++field7229;
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (super.field4727.field6067) {
            for (int var4 = 0; class261.field3874 > var4; ++var4) {
                int var5 = class556.field7498[var4];
                int var6 = class621.field8370[arg1];
                int var7 = this.field7228 * var5 >> 12;
                int var8 = this.field7231 * var6 >> 12;
                int var9 = var5 % (4096 / this.field7228) * this.field7228;
                int var10 = var6 % (4096 / this.field7231) * this.field7231;
                if (this.field7226 > var10) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field7226) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field7226 < ~var9) {
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
        if (arg0 <= 21) {
            this.field7231 = 106;
        }
        return var3;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Ljp;IB)V", line = 90)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (arg2 >= -41) {
            this.field7228 = -99;
        }
        ++field7230;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field7226 = arg0.method2359(-1);
                }
            } else {
                this.field7231 = arg0.method2398(-1372747256);
            }
        } else {
            this.field7228 = arg0.method2398(-1372747256);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(Z)V", line = 136)
    public static void method3040(boolean arg0) {
        field7227 = null;
        if (!arg0) {
            method3040(true);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "()V", line = 153)
    public class528() {
        super(0, true);
    }
}
