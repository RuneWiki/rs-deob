import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class16 extends class612 {

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public int field158;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "[B")
    public byte[] field159;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public int field156;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public int field160;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "Z")
    public boolean field157;

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(I[BII)V")
    public class16(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field158 = arg0;
        this.field159 = arg1;
        this.field156 = arg2;
        this.field160 = arg3;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(I[BIIZ)V")
    public class16(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field158 = arg0;
        this.field159 = arg1;
        this.field156 = arg2;
        this.field160 = arg3;
        this.field157 = arg4;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lcc;)Lqk;")
    public final class16 method107(class624 arg0) {
        this.field159 = arg0.method3646(14, this.field159);
        this.field158 = arg0.method3649(this.field158, -112);
        if (this.field160 == this.field156) {
            this.field156 = this.field160 = arg0.method3648(this.field156, false);
        } else {
            this.field156 = arg0.method3648(this.field156, false);
            this.field160 = arg0.method3648(this.field160, false);
            if (this.field160 == this.field156) {
                this.field156--;
            }
        }
        return this;
    }
}
