import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class82 extends class25 {

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public int field1945;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "[B")
    public byte[] field1946;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public int field1948;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    public int field1947;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lcd;)Lnd;", line = 4)
    public final class82 method618(class17 arg0) {
        this.field1946 = arg0.method138((byte) -93, this.field1946);
        this.field1945 = arg0.method139((byte) -126, this.field1945);
        if (this.field1948 == this.field1947) {
            this.field1948 = this.field1947 = arg0.method144(this.field1948, (byte) -51);
        } else {
            this.field1948 = arg0.method144(this.field1948, (byte) -128);
            this.field1947 = arg0.method144(this.field1947, (byte) -127);
            if (this.field1948 == this.field1947) {
                this.field1948--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(I[BII)V", line = 24)
    public class82(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1945 = arg0;
        this.field1946 = arg1;
        this.field1948 = arg2;
        this.field1947 = arg3;
    }
}
