import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class588 {

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public int field8207;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field8206;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field8208;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field8209;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 4)
    public static final void method3272(int arg0) {
        field8208++;
        int var1 = 84 / ((-arg0 - 54) / 43);
        if (class427.field6007 == null) {
            return;
        }
        if (class427.field6007.field3702 == 1) {
            class427.field6007 = null;
            return;
        }
        if (class427.field6007.field3702 == 2) {
            class158.method1097(class46.field693, 3, 2, class448.field6257);
            class427.field6007 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V", line = 33)
    public class588(int arg0) {
        this.field8207 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "toString", descriptor = "()Ljava/lang/String;", line = 43)
    public final String toString() {
        field8209++;
        throw new IllegalStateException();
    }
}
