import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class115 extends class122 {

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public int field2656;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "[B")
    public byte[] field2659;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public int field2657;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public int field2658;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "Z")
    public boolean field2655;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lec;)Lqe;")
    public final class115 method808(class32 arg0) {
        this.field2659 = arg0.method260(this.field2659, 49);
        this.field2656 = arg0.method258(-30, this.field2656);
        if (this.field2658 == this.field2657) {
            this.field2657 = this.field2658 = arg0.method252((byte) -86, this.field2657);
        } else {
            this.field2657 = arg0.method252((byte) -53, this.field2657);
            this.field2658 = arg0.method252((byte) -30, this.field2658);
            if (this.field2658 == this.field2657) {
                this.field2657--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(I[BII)V")
    public class115(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2656 = arg0;
        this.field2659 = arg1;
        this.field2657 = arg2;
        this.field2658 = arg3;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(I[BIIZ)V")
    public class115(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2656 = arg0;
        this.field2659 = arg1;
        this.field2657 = arg2;
        this.field2658 = arg3;
        this.field2655 = arg4;
    }
}
