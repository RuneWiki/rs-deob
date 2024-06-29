import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class430 extends class320 {

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
    public int field5569;

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "[B")
    public byte[] field5570;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
    public int field5566;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
    public int field5567;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "Z")
    public boolean field5568;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lnba;)Lbp;")
    public final class430 method2469(class569 arg0) {
        this.field5570 = arg0.method3045(this.field5570, (byte) 118);
        this.field5569 = arg0.method3043(this.field5569, 0);
        if (this.field5567 == this.field5566) {
            this.field5566 = this.field5567 = arg0.method3040(6, this.field5566);
        } else {
            this.field5566 = arg0.method3040(6, this.field5566);
            this.field5567 = arg0.method3040(6, this.field5567);
            if (this.field5567 == this.field5566) {
                this.field5566--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(I[BII)V")
    public class430(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field5569 = arg0;
        this.field5570 = arg1;
        this.field5566 = arg2;
        this.field5567 = arg3;
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(I[BIIZ)V")
    public class430(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field5569 = arg0;
        this.field5570 = arg1;
        this.field5566 = arg2;
        this.field5567 = arg3;
        this.field5568 = arg4;
    }
}
