import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class267 extends class205 {

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    public int field4202;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "[B")
    public byte[] field4205;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    public int field4204;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
    public int field4203;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "Z")
    public boolean field4201;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lra;)Lqj;", line = 3)
    public final class267 method1892(class336 arg0) {
        this.field4205 = arg0.method2312(false, this.field4205);
        this.field4202 = arg0.method2314(this.field4202, 7);
        if (this.field4204 == this.field4203) {
            this.field4204 = this.field4203 = arg0.method2311((byte) 116, this.field4204);
        } else {
            this.field4204 = arg0.method2311((byte) 116, this.field4204);
            this.field4203 = arg0.method2311((byte) 116, this.field4203);
            if (this.field4204 == this.field4203) {
                this.field4204--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class267(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field4202 = arg0;
        this.field4205 = arg1;
        this.field4204 = arg2;
        this.field4203 = arg3;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class267(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field4202 = arg0;
        this.field4205 = arg1;
        this.field4204 = arg2;
        this.field4203 = arg3;
        this.field4201 = arg4;
    }
}
