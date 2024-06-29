import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class126 extends class174 {

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public int field2215;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "[B")
    public byte[] field2211;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public int field2213;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "Z")
    public boolean field2214;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lpb;)Llb;")
    public final class126 method855(class123 arg0) {
        this.field2211 = arg0.method842(-103, this.field2211);
        this.field2215 = arg0.method845((byte) 127, this.field2215);
        if (this.field2213 == this.field2212) {
            this.field2212 = this.field2213 = arg0.method846(this.field2212, (byte) -128);
        } else {
            this.field2212 = arg0.method846(this.field2212, (byte) -128);
            this.field2213 = arg0.method846(this.field2213, (byte) -128);
            if (this.field2213 == this.field2212) {
                this.field2212--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I[BII)V")
    public class126(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2215 = arg0;
        this.field2211 = arg1;
        this.field2212 = arg2;
        this.field2213 = arg3;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I[BIIZ)V")
    public class126(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2215 = arg0;
        this.field2211 = arg1;
        this.field2212 = arg2;
        this.field2213 = arg3;
        this.field2214 = arg4;
    }
}
