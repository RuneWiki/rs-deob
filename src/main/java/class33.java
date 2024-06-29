import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LTTSKENL")
public class class33 {

    @OriginalMember(owner = "client!LTTSKENL", name = "a", descriptor = "J")
    public long field957;

    @OriginalMember(owner = "client!LTTSKENL", name = "b", descriptor = "LLTTSKENL;")
    public class33 field958;

    @OriginalMember(owner = "client!LTTSKENL", name = "c", descriptor = "LLTTSKENL;")
    public class33 field959;

    @OriginalMember(owner = "client!LTTSKENL", name = "d", descriptor = "Z")
    public static boolean field960;

    @OriginalMember(owner = "client!LTTSKENL", name = "a", descriptor = "()V")
    public void method327() {
        if (this.field959 != null) {
            this.field959.field958 = this.field958;
            this.field958.field959 = this.field959;
            this.field958 = null;
            this.field959 = null;
        }
    }
}
