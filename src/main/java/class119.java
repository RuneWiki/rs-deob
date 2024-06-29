import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class119 extends class24 {

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public int field1744;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "[B")
    public byte[] field1745;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public int field1743;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public int field1742;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "Z")
    public boolean field1746;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lcf;)Lu;")
    public final class119 method783(class93 arg0) {
        this.field1745 = arg0.method623((byte) -106, this.field1745);
        this.field1744 = arg0.method620(false, this.field1744);
        if (this.field1743 == this.field1742) {
            this.field1743 = this.field1742 = arg0.method621(this.field1743, (byte) -118);
        } else {
            this.field1743 = arg0.method621(this.field1743, (byte) -118);
            this.field1742 = arg0.method621(this.field1742, (byte) 64);
            if (this.field1743 == this.field1742) {
                this.field1743--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(I[BII)V")
    public class119(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1744 = arg0;
        this.field1745 = arg1;
        this.field1743 = arg2;
        this.field1742 = arg3;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(I[BIIZ)V")
    public class119(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1744 = arg0;
        this.field1745 = arg1;
        this.field1743 = arg2;
        this.field1742 = arg3;
        this.field1746 = arg4;
    }
}
