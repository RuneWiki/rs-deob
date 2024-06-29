import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class402 extends class17 {

    @OriginalMember(owner = "client!pu", name = "F", descriptor = "I")
    private int field5641 = 0;

    @OriginalMember(owner = "client!pu", name = "I", descriptor = "I")
    private int field5644 = 0;

    @OriginalMember(owner = "client!pu", name = "H", descriptor = "I")
    private int field5643 = 1365;

    @OriginalMember(owner = "client!pu", name = "L", descriptor = "I")
    private int field5647 = 20;

    @OriginalMember(owner = "client!pu", name = "K", descriptor = "Ltn;")
    public static class60 field5646 = new class60(0, 4);

    @OriginalMember(owner = "client!pu", name = "M", descriptor = "Ltn;")
    public static class60 field5648 = new class60(71, 8);

    @OriginalMember(owner = "client!pu", name = "N", descriptor = "I")
    public static int field5649 = 0;

    @OriginalMember(owner = "client!pu", name = "G", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!pu", name = "J", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V")
    public static void method2317(byte arg0) {
        if (arg0 != 86) {
            method2317((byte) 22);
        }
        field5646 = null;
        field5648 = null;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "()V")
    public class402() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lwm;II)V")
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (arg2 != 5159) {
            this.field5647 = -122;
        }
        ++field5645;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 == 3) {
                        this.field5641 = arg0.method2338(0);
                    }
                } else {
                    this.field5644 = arg0.method2338(0);
                }
            } else {
                this.field5647 = arg0.method2338(0);
            }
        } else {
            this.field5643 = arg0.method2338(0);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field5642;
        int[] var3 = super.field210.method2683(-17, arg0);
        if (arg1 <= 53) {
            return null;
        } else {
            if (super.field210.field6442) {
                for (int var4 = 0; ~class530.field7763 < ~var4; ++var4) {
                    int var5 = (class492.field6966[var4] << 12) / this.field5643 + this.field5644;
                    int var6 = (class40.field427[arg0] << 12) / this.field5643 + this.field5641;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (~(var11 - -var12) > -16385 && var13 < this.field5647) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = var7 + var11 + -var12;
                        var11 = var9 * var9 >> 12;
                        ++var13;
                        var12 = var10 * var10 >> 12;
                    }
                    var3[var4] = ~var13 > ~(this.field5647 + -1) ? (var13 << 12) / this.field5647 : 0;
                }
            }
            return var3;
        }
    }
}
