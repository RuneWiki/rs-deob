import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class33 extends class53 {

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "[B")
    public byte[] field569;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public int field572;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public int field571;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "Z")
    public boolean field573;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Led;)Ldc;")
    public final class33 method204(class44 arg0) {
        this.field569 = arg0.method257(3751, this.field569);
        this.field570 = arg0.method256(this.field570, true);
        if (this.field572 == this.field571) {
            this.field572 = this.field571 = arg0.method252(-114, this.field572);
        } else {
            this.field572 = arg0.method252(127, this.field572);
            this.field571 = arg0.method252(118, this.field571);
            if (this.field572 == this.field571) {
                this.field572--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I[BII)V")
    public class33(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field570 = arg0;
        this.field569 = arg1;
        this.field572 = arg2;
        this.field571 = arg3;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I[BIIZ)V")
    public class33(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field570 = arg0;
        this.field569 = arg1;
        this.field572 = arg2;
        this.field571 = arg3;
        this.field573 = arg4;
    }
}
