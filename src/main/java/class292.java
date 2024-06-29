import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class292 extends class246 {

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
    public int field5007;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "[B")
    public byte[] field5009;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
    public int field5010;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
    public int field5006;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "Z")
    public boolean field5008;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lph;)Lgm;", line = 6)
    public final class292 method2022(class79 arg0) {
        this.field5009 = arg0.method522(this.field5009, 125);
        this.field5007 = arg0.method527(true, this.field5007);
        if (this.field5010 == this.field5006) {
            this.field5010 = this.field5006 = arg0.method520(-4460, this.field5010);
        } else {
            this.field5010 = arg0.method520(-4460, this.field5010);
            this.field5006 = arg0.method520(-4460, this.field5006);
            if (this.field5010 == this.field5006) {
                this.field5010--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class292(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field5007 = arg0;
        this.field5009 = arg1;
        this.field5010 = arg2;
        this.field5006 = arg3;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class292(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field5007 = arg0;
        this.field5009 = arg1;
        this.field5010 = arg2;
        this.field5006 = arg3;
        this.field5008 = arg4;
    }
}
