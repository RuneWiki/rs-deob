import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class268 extends class128 {

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public int field4577;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "[B")
    public byte[] field4576;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public int field4578;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public int field4579;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Z")
    public boolean field4575;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lfl;)Lof;", line = 4)
    public final class268 method1858(class318 arg0) {
        this.field4576 = arg0.method2210(this.field4576, (byte) 114);
        this.field4577 = arg0.method2211((byte) -120, this.field4577);
        if (this.field4579 == this.field4578) {
            this.field4578 = this.field4579 = arg0.method2214(false, this.field4578);
        } else {
            this.field4578 = arg0.method2214(false, this.field4578);
            this.field4579 = arg0.method2214(false, this.field4579);
            if (this.field4579 == this.field4578) {
                this.field4578--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class268(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field4577 = arg0;
        this.field4576 = arg1;
        this.field4578 = arg2;
        this.field4579 = arg3;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class268(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field4577 = arg0;
        this.field4576 = arg1;
        this.field4578 = arg2;
        this.field4579 = arg3;
        this.field4575 = arg4;
    }
}
