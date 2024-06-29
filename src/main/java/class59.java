import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class59 extends class604 {

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "client!qr", name = "t", descriptor = "[B")
    public byte[] field762;

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "client!qr", name = "v", descriptor = "I")
    public int field764;

    @OriginalMember(owner = "client!qr", name = "u", descriptor = "Z")
    public boolean field763;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lcm;)Lqr;")
    public final class59 method671(class678 arg0) {
        this.field762 = arg0.method3870(false, this.field762);
        this.field760 = arg0.method3873(this.field760, 14);
        if (this.field764 == this.field761) {
            this.field761 = this.field764 = arg0.method3871((byte) -70, this.field761);
        } else {
            this.field761 = arg0.method3871((byte) -100, this.field761);
            this.field764 = arg0.method3871((byte) -52, this.field764);
            if (this.field764 == this.field761) {
                this.field761--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(I[BII)V")
    public class59(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field760 = arg0;
        this.field762 = arg1;
        this.field761 = arg2;
        this.field764 = arg3;
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(I[BIIZ)V")
    public class59(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field760 = arg0;
        this.field762 = arg1;
        this.field761 = arg2;
        this.field764 = arg3;
        this.field763 = arg4;
    }
}
