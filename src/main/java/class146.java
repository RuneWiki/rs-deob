import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class146 extends class65 {

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    public int field3440;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "[B")
    public byte[] field3441;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    public int field3444;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public int field3442;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "Z")
    public boolean field3443;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lae;)Lvb;")
    public final class146 method1180(class6 arg0) {
        this.field3441 = arg0.method57(true, this.field3441);
        this.field3440 = arg0.method56(this.field3440, (byte) -67);
        if (this.field3444 == this.field3442) {
            this.field3444 = this.field3442 = arg0.method54(this.field3444, 7);
        } else {
            this.field3444 = arg0.method54(this.field3444, 7);
            this.field3442 = arg0.method54(this.field3442, 7);
            if (this.field3444 == this.field3442) {
                this.field3444--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(I[BII)V")
    public class146(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3440 = arg0;
        this.field3441 = arg1;
        this.field3444 = arg2;
        this.field3442 = arg3;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(I[BIIZ)V")
    public class146(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3440 = arg0;
        this.field3441 = arg1;
        this.field3444 = arg2;
        this.field3442 = arg3;
        this.field3443 = arg4;
    }
}
