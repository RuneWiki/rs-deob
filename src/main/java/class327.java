import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kka")
public class class327 extends class84 {

    @OriginalMember(owner = "client!kka", name = "E", descriptor = "B")
    public byte field4565;

    @OriginalMember(owner = "client!kka", name = "D", descriptor = "I")
    public int field4564;

    @OriginalMember(owner = "client!kka", name = "F", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!kka", name = "H", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!kka", name = "G", descriptor = "Lso;")
    public class494 field4567;

    @OriginalMember(owner = "client!kka", name = "e", descriptor = "(B)[B", line = 8)
    public final byte[] method638(byte arg0) {
        ++field4566;
        int var2 = -116 / ((arg0 - -15) / 36);
        if (!super.field930 && this.field4567.field7050.length + -this.field4565 <= this.field4567.field7042) {
            return this.field4567.field7050;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kka", name = "f", descriptor = "(B)I", line = 26)
    public final int method641(byte arg0) {
        ++field4568;
        if (this.field4567 == null) {
            return 0;
        } else {
            if (arg0 != -14) {
                this.method641((byte) -112);
            }
            return this.field4567.field7042 * 100 / (this.field4567.field7050.length + -this.field4565);
        }
    }
}
