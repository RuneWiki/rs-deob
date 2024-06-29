import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class258 extends class162 {

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public int field4565;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "[B")
    public byte[] field4566;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public int field4564;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public int field4563;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "Z")
    public boolean field4567;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljf;)Lbd;")
    public final class258 method1792(class189 arg0) {
        this.field4566 = arg0.method1373(this.field4566, (byte) -107);
        this.field4565 = arg0.method1374((byte) 21, this.field4565);
        if (this.field4564 == this.field4563) {
            this.field4564 = this.field4563 = arg0.method1377(this.field4564, (byte) 26);
        } else {
            this.field4564 = arg0.method1377(this.field4564, (byte) 26);
            this.field4563 = arg0.method1377(this.field4563, (byte) 26);
            if (this.field4564 == this.field4563) {
                this.field4564--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(I[BII)V")
    public class258(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field4565 = arg0;
        this.field4566 = arg1;
        this.field4564 = arg2;
        this.field4563 = arg3;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(I[BIIZ)V")
    public class258(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field4565 = arg0;
        this.field4566 = arg1;
        this.field4564 = arg2;
        this.field4563 = arg3;
        this.field4567 = arg4;
    }
}
