import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class38 extends class52 {

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public int field747;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "[B")
    public byte[] field748;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lp;)Lga;")
    public final class38 method230(class90 arg0) {
        this.field748 = arg0.method639(this.field748, -110);
        this.field747 = arg0.method635(-104, this.field747);
        if (this.field750 == this.field749) {
            this.field749 = this.field750 = arg0.method637(this.field749, (byte) -95);
        } else {
            this.field749 = arg0.method637(this.field749, (byte) -119);
            this.field750 = arg0.method637(this.field750, (byte) -97);
            if (this.field750 == this.field749) {
                this.field749--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(I[BII)V")
    public class38(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field747 = arg0;
        this.field748 = arg1;
        this.field749 = arg2;
        this.field750 = arg3;
    }
}
