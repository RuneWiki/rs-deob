import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class25 extends class276 {

    @OriginalMember(owner = "client!aaa", name = "m", descriptor = "I")
    public int field274;

    @OriginalMember(owner = "client!aaa", name = "n", descriptor = "[B")
    public byte[] field275;

    @OriginalMember(owner = "client!aaa", name = "l", descriptor = "I")
    public int field273;

    @OriginalMember(owner = "client!aaa", name = "p", descriptor = "I")
    public int field277;

    @OriginalMember(owner = "client!aaa", name = "o", descriptor = "Z")
    public boolean field276;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lmd;)Laaa;")
    public final class25 method136(class624 arg0) {
        this.field275 = arg0.method3649(this.field275, -10142);
        this.field274 = arg0.method3651(this.field274, false);
        if (this.field277 == this.field273) {
            this.field273 = this.field277 = arg0.method3653(6, this.field273);
        } else {
            this.field273 = arg0.method3653(6, this.field273);
            this.field277 = arg0.method3653(6, this.field277);
            if (this.field277 == this.field273) {
                this.field273--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(I[BII)V")
    public class25(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field274 = arg0;
        this.field275 = arg1;
        this.field273 = arg2;
        this.field277 = arg3;
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(I[BIIZ)V")
    public class25(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field274 = arg0;
        this.field275 = arg1;
        this.field273 = arg2;
        this.field277 = arg3;
        this.field276 = arg4;
    }
}
