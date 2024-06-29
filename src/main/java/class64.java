import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class64 extends class208 {

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    private static int field1149;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()I")
    public static final int method462() {
        return field1149;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static final void method463(int arg0) {
        field1149 = arg0;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()V")
    public final void method464() {
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
    public class64() {
        new class56();
        new class132();
    }

    static {
        new class231(8);
        field1149 = 2;
        new class149(131056);
    }
}
