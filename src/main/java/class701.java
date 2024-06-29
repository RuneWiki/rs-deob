import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class701 extends class300 {

    @OriginalMember(owner = "client!nga", name = "m", descriptor = "I")
    public int field9280;

    @OriginalMember(owner = "client!nga", name = "q", descriptor = "[B")
    public byte[] field9284;

    @OriginalMember(owner = "client!nga", name = "o", descriptor = "I")
    public int field9282;

    @OriginalMember(owner = "client!nga", name = "n", descriptor = "I")
    public int field9281;

    @OriginalMember(owner = "client!nga", name = "p", descriptor = "Z")
    public boolean field9283;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lph;)Lnga;")
    public final class701 method3801(class632 arg0) {
        this.field9284 = arg0.method3376(this.field9284, (byte) 112);
        this.field9280 = arg0.method3375((byte) -71, this.field9280);
        if (this.field9282 == this.field9281) {
            this.field9282 = this.field9281 = arg0.method3374(-111, this.field9282);
        } else {
            this.field9282 = arg0.method3374(-116, this.field9282);
            this.field9281 = arg0.method3374(-125, this.field9281);
            if (this.field9282 == this.field9281) {
                this.field9282--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(I[BII)V")
    public class701(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field9280 = arg0;
        this.field9284 = arg1;
        this.field9282 = arg2;
        this.field9281 = arg3;
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(I[BIIZ)V")
    public class701(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field9280 = arg0;
        this.field9284 = arg1;
        this.field9282 = arg2;
        this.field9281 = arg3;
        this.field9283 = arg4;
    }
}
