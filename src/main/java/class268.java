import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class268 extends class280 {

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    private static int field4297;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()I")
    public static final int method1799() {
        return field4297;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()V")
    public final void method1800() {
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static final void method1801(int arg0) {
        field4297 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
    public class268() {
        new class138();
        new class269();
    }

    static {
        new class198(8);
        field4297 = 2;
        new class96(131056);
    }
}
