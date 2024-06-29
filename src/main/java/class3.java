import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field20 = 0;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field21 = -1;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public static final void method11(int arg0) {
        class140.method1017(arg0 - 122);
        field19++;
        class512.field7202 = null;
        class53.field1050 = null;
        class152.field2201 = null;
        class207.field2908 = null;
        if (arg0 != -1) {
            field20 = 99;
        }
        class115.field1765 = null;
    }
}
