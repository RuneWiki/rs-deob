import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class236 extends class32 {

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public int field3860;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "[B")
    public byte[] field3857;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public int field3856;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public int field3858;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "Z")
    public boolean field3859;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lca;)Llb;", line = 3)
    public final class236 method1637(class114 arg0) {
        this.field3857 = arg0.method848(32768, this.field3857);
        this.field3860 = arg0.method841(this.field3860, (byte) 123);
        if (this.field3858 == this.field3856) {
            this.field3856 = this.field3858 = arg0.method843(this.field3856, false);
        } else {
            this.field3856 = arg0.method843(this.field3856, false);
            this.field3858 = arg0.method843(this.field3858, false);
            if (this.field3858 == this.field3856) {
                this.field3856--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class236(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3860 = arg0;
        this.field3857 = arg1;
        this.field3856 = arg2;
        this.field3858 = arg3;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class236(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3860 = arg0;
        this.field3857 = arg1;
        this.field3856 = arg2;
        this.field3858 = arg3;
        this.field3859 = arg4;
    }
}
