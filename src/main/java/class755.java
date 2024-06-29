import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class755 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field10522 = 0;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field10523;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZIIII)V")
    public static final void method4204(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0) {
            field10522 = 46;
        }
        if (arg3 >= arg2) {
            class608.method3484(class77.field1131[arg1], arg2, -7, arg4, arg3);
        } else {
            class608.method3484(class77.field1131[arg1], arg3, -7, arg4, arg2);
        }
        field10523++;
    }
}
