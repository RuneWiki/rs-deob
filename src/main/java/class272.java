import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class272 extends class194 {

    @OriginalMember(owner = "client!taa", name = "u", descriptor = "I")
    public int field3456 = -1;

    @OriginalMember(owner = "client!taa", name = "v", descriptor = "Ljj;")
    public static class66 field3457 = new class66(5000);

    @OriginalMember(owner = "client!taa", name = "w", descriptor = "Lgn;")
    public static class635 field3458 = new class635();

    @OriginalMember(owner = "client!taa", name = "q", descriptor = "I")
    public int field3452;

    @OriginalMember(owner = "client!taa", name = "r", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!taa", name = "x", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!taa", name = "s", descriptor = "Ljava/lang/String;")
    public String field3454;

    @OriginalMember(owner = "client!taa", name = "t", descriptor = "Ljava/lang/String;")
    public String field3455;

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "(I)Lkd;")
    public final class494 method1666(int arg0) {
        ++field3453;
        if (arg0 != -1) {
            this.method1666(84);
        }
        return class70.field918[super.field2510];
    }

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "(I)V")
    public static void method1667(int arg0) {
        field3457 = null;
        if (arg0 == -1) {
            field3458 = null;
        }
    }
}
