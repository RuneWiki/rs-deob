import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class43 extends class45 {

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "[B")
    public byte[] field614;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public int field612;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Z")
    public boolean field615;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lsl;)Ld;", line = 4)
    public final class43 method312(class40 arg0) {
        this.field614 = arg0.method291(true, this.field614);
        this.field611 = arg0.method294(this.field611, 123);
        if (this.field613 == this.field612) {
            this.field613 = this.field612 = arg0.method293(-73, this.field613);
        } else {
            this.field613 = arg0.method293(-94, this.field613);
            this.field612 = arg0.method293(-46, this.field612);
            if (this.field613 == this.field612) {
                this.field613--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class43(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field611 = arg0;
        this.field614 = arg1;
        this.field613 = arg2;
        this.field612 = arg3;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class43(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field611 = arg0;
        this.field614 = arg1;
        this.field613 = arg2;
        this.field612 = arg3;
        this.field615 = arg4;
    }
}
