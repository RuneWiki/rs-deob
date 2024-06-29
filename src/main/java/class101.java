import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class101 extends class747 {

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    private int field1393 = 4096;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    private int field1392 = 0;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "Lkr;")
    public static class602 field1389 = new class602(108, 6);

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "[[B")
    public static byte[][] field1394;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V", line = 4)
    public static void method674(int arg0) {
        field1394 = null;
        if (arg0 != 22630) {
            field1389 = null;
        }
        field1389 = null;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V", line = 16)
    public class101() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)[I", line = 20)
    public final int[] method182(int arg0, int arg1) {
        ++field1391;
        int[] var3 = super.field10279.method3479(true, arg0);
        if (super.field10279.field8263) {
            int[] var4 = this.method4156(19, arg0, 0);
            for (int var5 = 0; ~var5 > ~class73.field1095; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field1392 >= ~var6 && var6 <= this.field1393 ? 4096 : 0;
            }
        }
        if (arg1 >= -89) {
            method674(-64);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ldc;II)V", line = 56)
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field1393 = arg0.method482(-772591672);
            }
        } else {
            this.field1392 = arg0.method482(-772591672);
        }
        ++field1390;
        if (arg1 != 11608) {
            this.method183((class63) null, -103, 28);
        }
    }
}
