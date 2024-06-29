import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class169 extends class330 {

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "I")
    private int field2148 = 1;

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
    private int field2151 = 1;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    private int field2155 = 204;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    public static int field2154 = 0;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "[Lrr;")
    public static class410[] field2150;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
    public static void method1092(int arg0) {
        field2150 = null;
        if (arg0 != -94366580) {
            field2150 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
    public class169() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)[I")
    public final int[] method464(int arg0, boolean arg1) {
        ++field2147;
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (arg1) {
            return null;
        } else {
            if (super.field4630.field5704) {
                for (int var4 = 0; ~class80.field901 < ~var4; ++var4) {
                    int var5 = class404.field5705[var4];
                    int var6 = class300.field4352[arg0];
                    int var7 = this.field2151 * var5 >> 12;
                    int var8 = this.field2148 * var6 >> 12;
                    int var9 = var5 % (4096 / this.field2151) * this.field2151;
                    int var10 = var6 % (4096 / this.field2148) * this.field2148;
                    if (var10 < this.field2155) {
                        for (var7 -= var8; ~var7 > -1; var7 += 4) {
                        }
                        while (var7 > 3) {
                            var7 -= 4;
                        }
                        if (var7 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (this.field2155 > var9) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (this.field2155 > var9) {
                        int var11;
                        for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                        }
                        while (~var11 < -4) {
                            var11 -= 4;
                        }
                        if (var11 > 0) {
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

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lgga;IB)V")
    public final void method466(class511 arg0, int arg1, byte arg2) {
        int var4 = -34 % ((arg2 - -41) / 42);
        ++field2152;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field2155 = arg0.method3002(-1);
                }
            } else {
                this.field2148 = arg0.method3013(24);
            }
        } else {
            this.field2151 = arg0.method3013(-111);
        }
    }
}
