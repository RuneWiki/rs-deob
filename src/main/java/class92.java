import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class92 extends class30 {

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    public int field2228;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "[B")
    public byte[] field2227;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    public int field2229;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public int field2226;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "Z")
    public boolean field2230;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lbe;)Lnb;")
    public final class92 method734(class13 arg0) {
        this.field2227 = arg0.method94(this.field2227, 0);
        this.field2228 = arg0.method95(-1006, this.field2228);
        if (this.field2229 == this.field2226) {
            this.field2229 = this.field2226 = arg0.method97(31942, this.field2229);
        } else {
            this.field2229 = arg0.method97(31942, this.field2229);
            this.field2226 = arg0.method97(31942, this.field2226);
            if (this.field2229 == this.field2226) {
                this.field2229--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I[BII)V")
    public class92(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2228 = arg0;
        this.field2227 = arg1;
        this.field2229 = arg2;
        this.field2226 = arg3;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I[BIIZ)V")
    public class92(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2228 = arg0;
        this.field2227 = arg1;
        this.field2229 = arg2;
        this.field2226 = arg3;
        this.field2230 = arg4;
    }
}
