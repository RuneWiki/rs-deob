import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class148 extends class220 {

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    public int field2662;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "[B")
    public byte[] field2660;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public int field2659;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "I")
    public int field2663;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "Z")
    public boolean field2661;

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(I[BII)V")
    public class148(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2662 = arg0;
        this.field2660 = arg1;
        this.field2659 = arg2;
        this.field2663 = arg3;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(I[BIIZ)V")
    public class148(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2662 = arg0;
        this.field2660 = arg1;
        this.field2659 = arg2;
        this.field2663 = arg3;
        this.field2661 = arg4;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lmb;)Lqa;")
    public final class148 method1130(class157 arg0) {
        this.field2660 = arg0.method1197(14, this.field2660);
        this.field2662 = arg0.method1195(this.field2662, 6);
        if (this.field2663 == this.field2659) {
            this.field2659 = this.field2663 = arg0.method1198(this.field2659, false);
        } else {
            this.field2659 = arg0.method1198(this.field2659, false);
            this.field2663 = arg0.method1198(this.field2663, false);
            if (this.field2663 == this.field2659) {
                this.field2659--;
            }
        }
        return this;
    }
}
