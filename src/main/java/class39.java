import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class39 extends class37 {

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public int field791;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "[B")
    public byte[] field790;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public int field792;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "Z")
    public boolean field788;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lpf;)Lfc;")
    public final class39 method284(class110 arg0) {
        this.field790 = arg0.method826(this.field790, (byte) -39);
        this.field791 = arg0.method824(true, this.field791);
        if (this.field792 == this.field789) {
            this.field792 = this.field789 = arg0.method825(this.field792, (byte) 66);
        } else {
            this.field792 = arg0.method825(this.field792, (byte) 24);
            this.field789 = arg0.method825(this.field789, (byte) 123);
            if (this.field792 == this.field789) {
                this.field792--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I[BII)V")
    public class39(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field791 = arg0;
        this.field790 = arg1;
        this.field792 = arg2;
        this.field789 = arg3;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I[BIIZ)V")
    public class39(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field791 = arg0;
        this.field790 = arg1;
        this.field792 = arg2;
        this.field789 = arg3;
        this.field788 = arg4;
    }
}
