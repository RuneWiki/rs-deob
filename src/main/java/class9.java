import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class9 extends class279 {

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    public int field93;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "[B")
    public byte[] field95;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    public int field94;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "Z")
    public boolean field92;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lfa;)Ljf;", line = 6)
    public final class9 method39(class235 arg0) {
        this.field95 = arg0.method1661((byte) -48, this.field95);
        this.field93 = arg0.method1658(114, this.field93);
        if (this.field94 == this.field91) {
            this.field94 = this.field91 = arg0.method1660(-122, this.field94);
        } else {
            this.field94 = arg0.method1660(-73, this.field94);
            this.field91 = arg0.method1660(-123, this.field91);
            if (this.field94 == this.field91) {
                this.field94--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class9(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field93 = arg0;
        this.field95 = arg1;
        this.field94 = arg2;
        this.field91 = arg3;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class9(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field93 = arg0;
        this.field95 = arg1;
        this.field94 = arg2;
        this.field91 = arg3;
        this.field92 = arg4;
    }
}
