import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class27 extends class31 {

    @OriginalMember(owner = "client!vo", name = "s", descriptor = "I")
    public int field335;

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "[B")
    public byte[] field334;

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "client!vo", name = "t", descriptor = "Z")
    public boolean field336;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ldp;)Lvo;")
    public final class27 method186(class2 arg0) {
        this.field334 = arg0.method7((byte) -58, this.field334);
        this.field335 = arg0.method5(this.field335, true);
        if (this.field337 == this.field333) {
            this.field333 = this.field337 = arg0.method11((byte) 71, this.field333);
        } else {
            this.field333 = arg0.method11((byte) 71, this.field333);
            this.field337 = arg0.method11((byte) 71, this.field337);
            if (this.field337 == this.field333) {
                this.field333--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(I[BII)V")
    public class27(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field335 = arg0;
        this.field334 = arg1;
        this.field333 = arg2;
        this.field337 = arg3;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(I[BIIZ)V")
    public class27(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field335 = arg0;
        this.field334 = arg1;
        this.field333 = arg2;
        this.field337 = arg3;
        this.field336 = arg4;
    }
}
