import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class364 extends class354 {

    @OriginalMember(owner = "client!fo", name = "L", descriptor = "I")
    private int field5589 = 0;

    @OriginalMember(owner = "client!fo", name = "O", descriptor = "I")
    private int field5592 = 4096;

    @OriginalMember(owner = "client!fo", name = "P", descriptor = "[B")
    public static byte[] field5593 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!fo", name = "K", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!fo", name = "M", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!fo", name = "N", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(B)V", line = 4)
    public static void method2328(byte arg0) {
        field5593 = null;
        if (arg0 != 0) {
            method2328((byte) -103);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lnj;II)V", line = 14)
    public final void method272(class164 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field5592 = arg0.method1074(-635989152);
            }
        } else {
            this.field5589 = arg0.method1074(-635989152);
        }
        ++field5590;
        if (arg2 != 1638) {
            this.method270((byte) 127, 43);
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "()V", line = 51)
    public class364() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(BI)[I", line = 54)
    public final int[] method270(byte arg0, int arg1) {
        ++field5588;
        if (arg0 >= -74) {
            return null;
        } else {
            int[] var3 = super.field5478.method2522(arg1, 16863);
            if (super.field5478.field6213) {
                int[] var4 = this.method2275((byte) 74, 0, arg1);
                for (int var5 = 0; var5 < class531.field7814; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = ~this.field5589 >= ~var6 && var6 <= this.field5592 ? 4096 : 0;
                }
            }
            return var3;
        }
    }
}
