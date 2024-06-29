import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class140 extends class135 {

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public int field3256;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "[B")
    public byte[] field3259;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public int field3258;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public int field3260;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Z")
    public boolean field3257;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lpa;)Lw;")
    public final class140 method1075(class99 arg0) {
        this.field3259 = arg0.method714((byte) -122, this.field3259);
        this.field3256 = arg0.method720((byte) 2, this.field3256);
        if (this.field3260 == this.field3258) {
            this.field3258 = this.field3260 = arg0.method716(this.field3258, 4);
        } else {
            this.field3258 = arg0.method716(this.field3258, 4);
            this.field3260 = arg0.method716(this.field3260, 4);
            if (this.field3260 == this.field3258) {
                this.field3258--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(I[BII)V")
    public class140(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3256 = arg0;
        this.field3259 = arg1;
        this.field3258 = arg2;
        this.field3260 = arg3;
    }
}
