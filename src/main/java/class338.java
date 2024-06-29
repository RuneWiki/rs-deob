import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public abstract class class338 extends class623 {

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
    public int field4352;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "Lon;")
    public class335 field4353;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public static int field4355 = 0;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Z")
    public abstract boolean method754(int arg0);

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method753(int arg0);

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lon;I)V")
    public class338(class335 arg0, int arg1) {
        this.field4352 = arg1;
        this.field4353 = arg0;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)Z")
    public static final boolean method2005(int arg0, int arg1, int arg2) {
        field4354++;
        if (arg0 > -86) {
            method2005(59, -59, 47);
        }
        return class418.method2631(-60, arg1, arg2) || class600.method3412(arg1, arg2, 535678147);
    }
}
