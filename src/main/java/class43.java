import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class43 extends class601 {

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "I")
    private int field486 = 1365;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    private int field485 = 0;

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
    private int field488 = 0;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    private int field482 = 20;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "Luw;")
    public static class208 field484 = new class208(66, 0);

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "I")
    public static int field490 = 0;

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "[I")
    public static int[] field491 = new int[13];

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class43() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "(I)V")
    public static void method258(int arg0) {
        if (arg0 != -11550) {
            method258(-79);
        }
        field491 = null;
        field484 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lmc;II)V")
    public final void method259(class234 arg0, int arg1, int arg2) {
        ++field489;
        int var4 = -48 / ((arg2 - 40) / 52);
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 == -4) {
                        this.field485 = arg0.method1553((byte) 126);
                    }
                } else {
                    this.field488 = arg0.method1553((byte) -117);
                }
            } else {
                this.field482 = arg0.method1553((byte) 84);
            }
        } else {
            this.field486 = arg0.method1553((byte) 113);
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(II)I")
    public static final int method260(int arg0, int arg1) {
        ++field487;
        return arg1 <= 73 ? 16 : 127 & arg0;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)[I")
    public final int[] method261(int arg0, byte arg1) {
        ++field483;
        if (arg1 >= -76) {
            return null;
        } else {
            int[] var3 = super.field7643.method2054(arg0, 9986);
            if (super.field7643.field4364) {
                for (int var4 = 0; var4 < class418.field5518; ++var4) {
                    int var5 = (class64.field839[var4] << 12) / this.field486 - -this.field488;
                    int var6 = (class427.field5623[arg0] << 12) / this.field486 + this.field485;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (~(var11 + var12) > -16385 && ~this.field482 < ~var13) {
                        var10 = (var9 * var10 >> 12) * 2 - -var8;
                        var9 = var11 - (var12 - var7);
                        ++var13;
                        var11 = var9 * var9 >> 12;
                        var12 = var10 * var10 >> 12;
                    }
                    var3[var4] = ~var13 <= ~(this.field482 - 1) ? 0 : (var13 << 12) / this.field482;
                }
            }
            return var3;
        }
    }
}
