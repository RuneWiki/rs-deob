import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class266 extends class217 {

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    public int field4532;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "[B")
    public byte[] field4533;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public int field4530;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public int field4531;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "Z")
    public boolean field4534;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lcc;)Lkc;")
    public final class266 method1771(class202 arg0) {
        this.field4533 = arg0.method1369((byte) 94, this.field4533);
        this.field4532 = arg0.method1372(this.field4532, (byte) 54);
        if (this.field4531 == this.field4530) {
            this.field4530 = this.field4531 = arg0.method1371(6, this.field4530);
        } else {
            this.field4530 = arg0.method1371(6, this.field4530);
            this.field4531 = arg0.method1371(6, this.field4531);
            if (this.field4531 == this.field4530) {
                this.field4530--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(I[BII)V")
    public class266(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field4532 = arg0;
        this.field4533 = arg1;
        this.field4530 = arg2;
        this.field4531 = arg3;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(I[BIIZ)V")
    public class266(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field4532 = arg0;
        this.field4533 = arg1;
        this.field4530 = arg2;
        this.field4531 = arg3;
        this.field4534 = arg4;
    }
}
