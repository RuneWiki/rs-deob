import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class145 extends class25 {

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "B")
    public byte field1823;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    public int field1826;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "Lbq;")
    public static class307 field1824;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "Les;")
    public class403 field1821;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "Lda;")
    public static class67 field1820;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)[B", line = 4)
    public final byte[] method250(int arg0) {
        ++field1822;
        if (!super.field374 && ~(this.field1821.field5275.length + -this.field1823) >= ~this.field1821.field5262) {
            if (arg0 != -13864) {
                this.method250(43);
            }
            return this.field1821.field5275;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)V", line = 24)
    public static void method1062(byte arg0) {
        if (arg0 != 109) {
            method1062((byte) -56);
        }
        field1820 = null;
        field1824 = null;
    }

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "(I)I", line = 44)
    public final int method253(int arg0) {
        ++field1825;
        if (this.field1821 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.method253(-53);
            }
            return this.field1821.field5262 * 100 / (this.field1821.field5275.length + -this.field1823);
        }
    }
}
