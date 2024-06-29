import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class5 extends class161 {

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "[B")
    public byte[] field113;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public int field116;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public int field114;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "Z")
    public boolean field115;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lsi;)Llj;", line = 7)
    public final class5 method59(class334 arg0) {
        this.field113 = arg0.method2305(0, this.field113);
        this.field112 = arg0.method2304(5702, this.field112);
        if (this.field116 == this.field114) {
            this.field116 = this.field114 = arg0.method2306(this.field116, false);
        } else {
            this.field116 = arg0.method2306(this.field116, false);
            this.field114 = arg0.method2306(this.field114, false);
            if (this.field116 == this.field114) {
                this.field116--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class5(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field112 = arg0;
        this.field113 = arg1;
        this.field116 = arg2;
        this.field114 = arg3;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class5(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field112 = arg0;
        this.field113 = arg1;
        this.field116 = arg2;
        this.field114 = arg3;
        this.field115 = arg4;
    }
}
