import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class16 extends class72 {

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "[B")
    public byte[] field340;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "Z")
    public boolean field339;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lq;)Lca;", line = 4)
    public final class16 method136(class100 arg0) {
        this.field340 = arg0.method764(this.field340, false);
        this.field337 = arg0.method766(14, this.field337);
        if (this.field338 == this.field336) {
            this.field336 = this.field338 = arg0.method763(this.field336, false);
        } else {
            this.field336 = arg0.method763(this.field336, false);
            this.field338 = arg0.method763(this.field338, false);
            if (this.field338 == this.field336) {
                this.field336--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class16(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field337 = arg0;
        this.field340 = arg1;
        this.field336 = arg2;
        this.field338 = arg3;
    }
}
