import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class176 extends class257 {

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public int field2780;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "[B")
    public byte[] field2776;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public int field2779;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public int field2778;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "Z")
    public boolean field2777;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lvj;)Lkj;", line = 5)
    public final class176 method1221(class107 arg0) {
        this.field2776 = arg0.method759(this.field2776, (byte) -105);
        this.field2780 = arg0.method763(this.field2780, (byte) 90);
        if (this.field2779 == this.field2778) {
            this.field2779 = this.field2778 = arg0.method764(false, this.field2779);
        } else {
            this.field2779 = arg0.method764(false, this.field2779);
            this.field2778 = arg0.method764(false, this.field2778);
            if (this.field2779 == this.field2778) {
                this.field2779--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class176(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2780 = arg0;
        this.field2776 = arg1;
        this.field2779 = arg2;
        this.field2778 = arg3;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class176(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2780 = arg0;
        this.field2776 = arg1;
        this.field2779 = arg2;
        this.field2778 = arg3;
        this.field2777 = arg4;
    }
}
