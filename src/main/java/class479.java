import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class479 {

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)V")
    public static final void method2654(boolean arg0) {
        field6394++;
        class251.method1590();
        if (!arg0) {
            ;
        }
    }
}
