import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class10 extends class169 {

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public int field196;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "[B")
    public byte[] field193;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public int field194;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public int field195;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "Z")
    public boolean field192;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lk;)Lai;")
    public final class10 method70(class98 arg0) {
        this.field193 = arg0.method743(this.field193, (byte) 12);
        this.field196 = arg0.method742((byte) 110, this.field196);
        if (this.field195 == this.field194) {
            this.field194 = this.field195 = arg0.method740(true, this.field194);
        } else {
            this.field194 = arg0.method740(true, this.field194);
            this.field195 = arg0.method740(true, this.field195);
            if (this.field195 == this.field194) {
                this.field194--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(I[BII)V")
    public class10(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field196 = arg0;
        this.field193 = arg1;
        this.field194 = arg2;
        this.field195 = arg3;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(I[BIIZ)V")
    public class10(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field196 = arg0;
        this.field193 = arg1;
        this.field194 = arg2;
        this.field195 = arg3;
        this.field192 = arg4;
    }
}
