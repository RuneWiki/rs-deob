import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class218 extends class271 {

    @OriginalMember(owner = "client!dga", name = "n", descriptor = "I")
    public int field3374;

    @OriginalMember(owner = "client!dga", name = "q", descriptor = "[B")
    public byte[] field3377;

    @OriginalMember(owner = "client!dga", name = "p", descriptor = "I")
    public int field3376;

    @OriginalMember(owner = "client!dga", name = "m", descriptor = "I")
    public int field3373;

    @OriginalMember(owner = "client!dga", name = "o", descriptor = "Z")
    public boolean field3375;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lhn;)Ldga;")
    public final class218 method1498(class751 arg0) {
        this.field3377 = arg0.method4185(-114, this.field3377);
        this.field3374 = arg0.method4183(this.field3374, true);
        if (this.field3376 == this.field3373) {
            this.field3376 = this.field3373 = arg0.method4177(this.field3376, (byte) -22);
        } else {
            this.field3376 = arg0.method4177(this.field3376, (byte) -22);
            this.field3373 = arg0.method4177(this.field3373, (byte) -22);
            if (this.field3376 == this.field3373) {
                this.field3376--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(I[BII)V")
    public class218(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3374 = arg0;
        this.field3377 = arg1;
        this.field3376 = arg2;
        this.field3373 = arg3;
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(I[BIIZ)V")
    public class218(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3374 = arg0;
        this.field3377 = arg1;
        this.field3376 = arg2;
        this.field3373 = arg3;
        this.field3375 = arg4;
    }
}
