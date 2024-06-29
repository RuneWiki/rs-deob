import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class77 extends class106 {

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    public int field1951;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "[B")
    public byte[] field1950;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    public int field1952;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public int field1949;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ldd;)Lme;", line = 7)
    public final class77 method664(class23 arg0) {
        this.field1950 = arg0.method161((byte) 122, this.field1950);
        this.field1951 = arg0.method160((byte) 61, this.field1951);
        if (this.field1952 == this.field1949) {
            this.field1952 = this.field1949 = arg0.method159(this.field1952, false);
        } else {
            this.field1952 = arg0.method159(this.field1952, false);
            this.field1949 = arg0.method159(this.field1949, false);
            if (this.field1952 == this.field1949) {
                this.field1952--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(I[BII)V", line = 24)
    public class77(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1951 = arg0;
        this.field1950 = arg1;
        this.field1952 = arg2;
        this.field1949 = arg3;
    }
}
