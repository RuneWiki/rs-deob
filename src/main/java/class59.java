import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class59 extends class259 {

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "[B")
    public byte[] field808;

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
    public int field810;

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "Z")
    public boolean field811;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lew;)Lqr;")
    public final class59 method504(class453 arg0) {
        this.field808 = arg0.method2598(this.field808, true);
        this.field809 = arg0.method2601(this.field809, 7);
        if (this.field812 == this.field810) {
            this.field812 = this.field810 = arg0.method2600(113, this.field812);
        } else {
            this.field812 = arg0.method2600(100, this.field812);
            this.field810 = arg0.method2600(79, this.field810);
            if (this.field812 == this.field810) {
                this.field812--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(I[BII)V")
    public class59(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field809 = arg0;
        this.field808 = arg1;
        this.field812 = arg2;
        this.field810 = arg3;
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(I[BIIZ)V")
    public class59(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field809 = arg0;
        this.field808 = arg1;
        this.field812 = arg2;
        this.field810 = arg3;
        this.field811 = arg4;
    }
}
