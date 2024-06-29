import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class101 extends class574 {

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public int field1496;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "[B")
    public byte[] field1495;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public int field1493;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public int field1497;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "Z")
    public boolean field1494;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lou;)Lud;", line = 5)
    public final class101 method839(class292 arg0) {
        this.field1495 = arg0.method1849(false, this.field1495);
        this.field1496 = arg0.method1851((byte) 67, this.field1496);
        if (this.field1497 == this.field1493) {
            this.field1493 = this.field1497 = arg0.method1853(6, this.field1493);
        } else {
            this.field1493 = arg0.method1853(6, this.field1493);
            this.field1497 = arg0.method1853(6, this.field1497);
            if (this.field1497 == this.field1493) {
                this.field1493--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class101(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1496 = arg0;
        this.field1495 = arg1;
        this.field1493 = arg2;
        this.field1497 = arg3;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class101(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1496 = arg0;
        this.field1495 = arg1;
        this.field1493 = arg2;
        this.field1497 = arg3;
        this.field1494 = arg4;
    }
}
