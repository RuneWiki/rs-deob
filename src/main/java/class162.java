import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class162 extends class167 {

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    private static int field2326;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
    public static final void method1069(int arg0) {
        field2326 = arg0;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()I")
    public static final int method1070() {
        return field2326;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "()V")
    public final void method1071() {
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    public class162() {
        new class7();
        new class234();
    }

    static {
        new class136(8);
        field2326 = 2;
        new class216(131056);
    }
}
