import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class38 extends class78 {

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public int field955;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "[B")
    public byte[] field957;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public int field956;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public int field953;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "Z")
    public boolean field954;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Llb;)Lfc;")
    public final class38 method319(class77 arg0) {
        this.field957 = arg0.method682(this.field957, 116);
        this.field955 = arg0.method679(-23935, this.field955);
        if (this.field956 == this.field953) {
            this.field956 = this.field953 = arg0.method678(this.field956, (byte) 61);
        } else {
            this.field956 = arg0.method678(this.field956, (byte) 61);
            this.field953 = arg0.method678(this.field953, (byte) 61);
            if (this.field956 == this.field953) {
                this.field956--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I[BII)V")
    public class38(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field955 = arg0;
        this.field957 = arg1;
        this.field956 = arg2;
        this.field953 = arg3;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I[BIIZ)V")
    public class38(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field955 = arg0;
        this.field957 = arg1;
        this.field956 = arg2;
        this.field953 = arg3;
        this.field954 = arg4;
    }
}
