import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class404 extends class38 {

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
    public int field5568;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "[B")
    public byte[] field5566;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
    public int field5565;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
    public int field5567;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "Z")
    public boolean field5564;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lpr;)Luo;", line = 3)
    public final class404 method2355(class309 arg0) {
        this.field5566 = arg0.method1796((byte) -58, this.field5566);
        this.field5568 = arg0.method1791(12, this.field5568);
        if (this.field5567 == this.field5565) {
            this.field5565 = this.field5567 = arg0.method1795(6, this.field5565);
        } else {
            this.field5565 = arg0.method1795(6, this.field5565);
            this.field5567 = arg0.method1795(6, this.field5567);
            if (this.field5567 == this.field5565) {
                this.field5565--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class404(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field5568 = arg0;
        this.field5566 = arg1;
        this.field5565 = arg2;
        this.field5567 = arg3;
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class404(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field5568 = arg0;
        this.field5566 = arg1;
        this.field5565 = arg2;
        this.field5567 = arg3;
        this.field5564 = arg4;
    }
}
