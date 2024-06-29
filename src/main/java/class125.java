import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class125 extends class20 {

    @OriginalMember(owner = "client!s", name = "A", descriptor = "I")
    public int field2753;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "[B")
    public byte[] field2757;

    @OriginalMember(owner = "client!s", name = "C", descriptor = "I")
    public int field2754;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!s", name = "E", descriptor = "Z")
    public boolean field2755;

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(I[BII)V")
    public class125(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2753 = arg0;
        this.field2757 = arg1;
        this.field2754 = arg2;
        this.field2756 = arg3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lhc;)Ls;")
    public final class125 method969(class52 arg0) {
        this.field2757 = arg0.method381((byte) -122, this.field2757);
        this.field2753 = arg0.method378(this.field2753, false);
        if (this.field2756 == this.field2754) {
            this.field2754 = this.field2756 = arg0.method380(this.field2754, (byte) -39);
        } else {
            this.field2754 = arg0.method380(this.field2754, (byte) -39);
            this.field2756 = arg0.method380(this.field2756, (byte) -39);
            if (this.field2756 == this.field2754) {
                this.field2754--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(I[BIIZ)V")
    public class125(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2753 = arg0;
        this.field2757 = arg1;
        this.field2754 = arg2;
        this.field2756 = arg3;
        this.field2755 = arg4;
    }
}
