import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class176 extends class34 {

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    private int field2649 = 204;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "I")
    private int field2647 = 1;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
    private int field2646 = 1;

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "Lhi;")
    public static class45 field2650 = new class45(57, 2);

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "[S")
    public static short[] field2651;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field2644;
        int[] var3 = super.field537.method1780(arg0, (byte) 54);
        int var4 = -76 % (arg1 / 50);
        if (super.field537.field4191) {
            for (int var5 = 0; ~var5 > ~class383.field5502; ++var5) {
                int var6 = class91.field1463[var5];
                int var7 = class284.field3856[arg0];
                int var8 = this.field2647 * var6 >> 12;
                int var9 = this.field2646 * var7 >> 12;
                int var10 = var6 % (4096 / this.field2647) * this.field2647;
                int var11 = var7 % (4096 / this.field2646) * this.field2646;
                if (~var11 > ~this.field2649) {
                    for (var8 -= var9; var8 < 0; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (var8 != 1) {
                        var3[var5] = 0;
                        continue;
                    }
                    if (this.field2649 > var10) {
                        var3[var5] = 0;
                        continue;
                    }
                }
                if (var10 < this.field2649) {
                    int var12;
                    for (var12 = var8 - var9; ~var12 > -1; var12 += 4) {
                    }
                    while (var12 > 3) {
                        var12 -= 4;
                    }
                    if (~var12 < -1) {
                        var3[var5] = 0;
                        continue;
                    }
                }
                var3[var5] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    public class176() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lsv;II)V")
    public final void method69(class319 arg0, int arg1, int arg2) {
        if (arg1 < 16) {
            this.method69((class319) null, -112, 41);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field2649 = arg0.method1844(-101);
                }
            } else {
                this.field2646 = arg0.method1869(-81);
            }
        } else {
            this.field2647 = arg0.method1869(-111);
        }
        ++field2648;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)V")
    public static void method1207(boolean arg0) {
        field2650 = null;
        if (!arg0) {
            method1207(false);
        }
        field2651 = null;
    }
}
