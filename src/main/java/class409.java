import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class409 extends class726 {

    @OriginalMember(owner = "client!taa", name = "i", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!taa", name = "j", descriptor = "Ltaa;")
    public class409 field5960;

    @OriginalMember(owner = "client!taa", name = "k", descriptor = "Ltaa;")
    public class409 field5961;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V", line = 7)
    public final void method2536(int arg0) {
        field5959++;
        if (this.field5960 == null) {
            return;
        }
        this.field5960.field5961 = this.field5961;
        this.field5961.field5960 = this.field5960;
        this.field5961 = null;
        this.field5960 = null;
        int var2 = 123 / ((6 - arg0) / 37);
    }
}
