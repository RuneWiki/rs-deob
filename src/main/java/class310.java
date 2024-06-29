import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class310 extends class281 {

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public int field5179;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "[B")
    public byte[] field5182;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    public int field5181;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public int field5180;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "Z")
    public boolean field5183;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljd;)Ls;", line = 5)
    public final class310 method2094(class134 arg0) {
        this.field5182 = arg0.method1054(this.field5182, (byte) 39);
        this.field5179 = arg0.method1061(110, this.field5179);
        if (this.field5181 == this.field5180) {
            this.field5181 = this.field5180 = arg0.method1055(this.field5181, (byte) 68);
        } else {
            this.field5181 = arg0.method1055(this.field5181, (byte) 68);
            this.field5180 = arg0.method1055(this.field5180, (byte) 68);
            if (this.field5181 == this.field5180) {
                this.field5181--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class310(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field5179 = arg0;
        this.field5182 = arg1;
        this.field5181 = arg2;
        this.field5180 = arg3;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class310(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field5179 = arg0;
        this.field5182 = arg1;
        this.field5181 = arg2;
        this.field5180 = arg3;
        this.field5183 = arg4;
    }
}
