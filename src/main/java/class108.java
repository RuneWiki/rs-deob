import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class108 extends class152 {

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    public int field2660;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "[B")
    public byte[] field2659;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public int field2658;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public int field2661;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "Z")
    public boolean field2662;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lgf;)Lpd;")
    public final class108 method869(class48 arg0) {
        this.field2659 = arg0.method383(false, this.field2659);
        this.field2660 = arg0.method392(this.field2660, -2);
        if (this.field2661 == this.field2658) {
            this.field2658 = this.field2661 = arg0.method389(-1, this.field2658);
        } else {
            this.field2658 = arg0.method389(-1, this.field2658);
            this.field2661 = arg0.method389(-1, this.field2661);
            if (this.field2661 == this.field2658) {
                this.field2658--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I[BII)V")
    public class108(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2660 = arg0;
        this.field2659 = arg1;
        this.field2658 = arg2;
        this.field2661 = arg3;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I[BIIZ)V")
    public class108(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2660 = arg0;
        this.field2659 = arg1;
        this.field2658 = arg2;
        this.field2661 = arg3;
        this.field2662 = arg4;
    }
}
