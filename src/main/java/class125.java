import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class125 extends class216 {

    @OriginalMember(owner = "client!om", name = "u", descriptor = "I")
    public int field1956;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "[B")
    public byte[] field1952;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    public int field1954;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public int field1953;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "Z")
    public boolean field1955;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lsn;)Lom;", line = 8)
    public final class125 method911(class145 arg0) {
        this.field1952 = arg0.method1075(-128, this.field1952);
        this.field1956 = arg0.method1071(-32768, this.field1956);
        if (this.field1954 == this.field1953) {
            this.field1954 = this.field1953 = arg0.method1074((byte) 99, this.field1954);
        } else {
            this.field1954 = arg0.method1074((byte) 75, this.field1954);
            this.field1953 = arg0.method1074((byte) 114, this.field1953);
            if (this.field1954 == this.field1953) {
                this.field1954--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class125(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1956 = arg0;
        this.field1952 = arg1;
        this.field1954 = arg2;
        this.field1953 = arg3;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class125(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1956 = arg0;
        this.field1952 = arg1;
        this.field1954 = arg2;
        this.field1953 = arg3;
        this.field1955 = arg4;
    }
}
