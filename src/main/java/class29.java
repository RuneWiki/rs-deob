import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class29 extends class197 {

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public int field407;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "[B")
    public byte[] field409;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public int field408;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    public int field406;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "Z")
    public boolean field405;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lsi;)Lqh;")
    public final class29 method167(class219 arg0) {
        this.field409 = arg0.method1550(-32768, this.field409);
        this.field407 = arg0.method1553(this.field407, -2);
        if (this.field408 == this.field406) {
            this.field408 = this.field406 = arg0.method1552(this.field408, -64);
        } else {
            this.field408 = arg0.method1552(this.field408, -54);
            this.field406 = arg0.method1552(this.field406, -117);
            if (this.field408 == this.field406) {
                this.field408--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(I[BII)V")
    public class29(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field407 = arg0;
        this.field409 = arg1;
        this.field408 = arg2;
        this.field406 = arg3;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(I[BIIZ)V")
    public class29(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field407 = arg0;
        this.field409 = arg1;
        this.field408 = arg2;
        this.field406 = arg3;
        this.field405 = arg4;
    }
}
