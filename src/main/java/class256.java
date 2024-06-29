import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class256 extends class433 {

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public int field3594;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "[B")
    public byte[] field3590;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public int field3591;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public int field3593;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "Z")
    public boolean field3592;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lio;)Lvj;")
    public final class256 method1698(class252 arg0) {
        this.field3590 = arg0.method1685(this.field3590, 74);
        this.field3594 = arg0.method1688((byte) 80, this.field3594);
        if (this.field3593 == this.field3591) {
            this.field3591 = this.field3593 = arg0.method1687(this.field3591, 82);
        } else {
            this.field3591 = arg0.method1687(this.field3591, -108);
            this.field3593 = arg0.method1687(this.field3593, 69);
            if (this.field3593 == this.field3591) {
                this.field3591--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I[BII)V")
    public class256(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3594 = arg0;
        this.field3590 = arg1;
        this.field3591 = arg2;
        this.field3593 = arg3;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I[BIIZ)V")
    public class256(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3594 = arg0;
        this.field3590 = arg1;
        this.field3591 = arg2;
        this.field3593 = arg3;
        this.field3592 = arg4;
    }
}
