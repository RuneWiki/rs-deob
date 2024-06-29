import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class240 extends class78 {

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    private static int field3718;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()I")
    public static final int method1622() {
        return field3718;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
    public static final void method1623(int arg0) {
        field3718 = arg0;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "()V")
    public final void method1624() {
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
    public class240() {
        new class246();
        new class149();
    }

    static {
        new class164(8);
        field3718 = 2;
        new class37(131056);
    }
}
