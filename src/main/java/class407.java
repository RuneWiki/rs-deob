import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class407 extends class223 {

    @OriginalMember(owner = "client!cv", name = "s", descriptor = "I")
    public int field5782;

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "[B")
    public byte[] field5779;

    @OriginalMember(owner = "client!cv", name = "t", descriptor = "I")
    public int field5783;

    @OriginalMember(owner = "client!cv", name = "r", descriptor = "I")
    public int field5781;

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "Z")
    public boolean field5780;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Luj;)Lcv;")
    public final class407 method2425(class266 arg0) {
        this.field5779 = arg0.method1712((byte) 91, this.field5779);
        this.field5782 = arg0.method1714(this.field5782, (byte) -128);
        if (this.field5783 == this.field5781) {
            this.field5783 = this.field5781 = arg0.method1713(this.field5783, -15);
        } else {
            this.field5783 = arg0.method1713(this.field5783, -15);
            this.field5781 = arg0.method1713(this.field5781, -15);
            if (this.field5783 == this.field5781) {
                this.field5783--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(I[BII)V")
    public class407(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field5782 = arg0;
        this.field5779 = arg1;
        this.field5783 = arg2;
        this.field5781 = arg3;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(I[BIIZ)V")
    public class407(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field5782 = arg0;
        this.field5779 = arg1;
        this.field5783 = arg2;
        this.field5781 = arg3;
        this.field5780 = arg4;
    }
}
