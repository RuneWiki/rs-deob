import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DRKSBDQX")
public class class10 extends class38 {

    @OriginalMember(owner = "DRKSBDQX", name = "h", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "DRKSBDQX", name = "f", descriptor = "LDRKSBDQX;")
    public class10 field684;

    @OriginalMember(owner = "DRKSBDQX", name = "g", descriptor = "LDRKSBDQX;")
    public class10 field685;

    @OriginalMember(owner = "DRKSBDQX", name = "b", descriptor = "()V")
    public void method217() {
        if (this.field685 != null) {
            this.field685.field684 = this.field684;
            this.field684.field685 = this.field685;
            this.field684 = null;
            this.field685 = null;
        }
    }
}
