import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class695 extends class640 {

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
    public int field9686;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "[B")
    public byte[] field9688;

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "I")
    public int field9687;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    public int field9684;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "Z")
    public boolean field9685;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lln;)Lwo;", line = 6)
    public final class695 method3927(class476 arg0) {
        this.field9688 = arg0.method2897((byte) -110, this.field9688);
        this.field9686 = arg0.method2900(this.field9686, 2);
        if (this.field9687 == this.field9684) {
            this.field9687 = this.field9684 = arg0.method2902(this.field9687, 0);
        } else {
            this.field9687 = arg0.method2902(this.field9687, 0);
            this.field9684 = arg0.method2902(this.field9684, 0);
            if (this.field9687 == this.field9684) {
                this.field9687--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class695(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field9686 = arg0;
        this.field9688 = arg1;
        this.field9687 = arg2;
        this.field9684 = arg3;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class695(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field9686 = arg0;
        this.field9688 = arg1;
        this.field9687 = arg2;
        this.field9684 = arg3;
        this.field9685 = arg4;
    }
}
