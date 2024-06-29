import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class87 extends class70 {

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public int field1998;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "[B")
    public byte[] field1997;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    public int field2000;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
    public int field1999;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ll;)Loc;", line = 8)
    public final class87 method603(class66 arg0) {
        this.field1997 = arg0.method465(this.field1997, (byte) -51);
        this.field1998 = arg0.method462(this.field1998, (byte) -13);
        if (this.field2000 == this.field1999) {
            this.field2000 = this.field1999 = arg0.method469(this.field2000, 7);
        } else {
            this.field2000 = arg0.method469(this.field2000, 7);
            this.field1999 = arg0.method469(this.field1999, 7);
            if (this.field2000 == this.field1999) {
                this.field2000--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class87(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1998 = arg0;
        this.field1997 = arg1;
        this.field2000 = arg2;
        this.field1999 = arg3;
    }
}
