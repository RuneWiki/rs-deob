import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class347 extends class177 {

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "Lku;")
    public class347 field5165;

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "Lku;")
    public class347 field5168;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
    public final void method2253(int arg0) {
        field5167++;
        if (this.field5165 == null) {
            return;
        }
        this.field5165.field5168 = this.field5168;
        this.field5168.field5165 = this.field5165;
        this.field5165 = null;
        this.field5168 = null;
        if (arg0 != -14315) {
            this.method2253(65);
        }
    }
}
