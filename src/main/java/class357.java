import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class357 extends class249 {

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public int field5738;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "[B")
    public byte[] field5739;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public int field5737;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public int field5741;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "Z")
    public boolean field5740;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ltl;)Ljg;", line = 3)
    public final class357 method2957(class648 arg0) {
        this.field5739 = arg0.method4721(0, this.field5739);
        this.field5738 = arg0.method4725(-69, this.field5738);
        if (this.field5741 == this.field5737) {
            this.field5737 = this.field5741 = arg0.method4719(this.field5737, 101);
        } else {
            this.field5737 = arg0.method4719(this.field5737, 74);
            this.field5741 = arg0.method4719(this.field5741, -92);
            if (this.field5741 == this.field5737) {
                this.field5737--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class357(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field5738 = arg0;
        this.field5739 = arg1;
        this.field5737 = arg2;
        this.field5741 = arg3;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class357(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field5738 = arg0;
        this.field5739 = arg1;
        this.field5737 = arg2;
        this.field5741 = arg3;
        this.field5740 = arg4;
    }
}
