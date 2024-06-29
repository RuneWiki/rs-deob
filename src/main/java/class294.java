import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class294 {

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "I")
    public int field4407;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
    public static int field4410 = 2;

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "I")
    public static int field4412 = 0;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "Z")
    public static boolean field4411 = false;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(I)V")
    public class294(int arg0) {
        this.field4407 = arg0;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(BI)V")
    public static final void method1959(byte arg0, int arg1) {
        if (arg0 >= 106) {
            field4409++;
            class240.method1590(class265.field3887.method1733(255, class140.field2466), 3, arg1);
        }
    }

    @OriginalMember(owner = "client!fda", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4408++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IZI)Z")
    public static final boolean method1960(int arg0, boolean arg1, int arg2) {
        field4413++;
        if (arg1) {
            return false;
        } else {
            return (arg2 & 0x400) != 0;
        }
    }
}
