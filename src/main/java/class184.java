import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class184 {

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
    public static final void method1191(byte arg0) {
        field2518++;
        int var1 = 75 / ((-arg0 - 50) / 47);
        class264.field3708.method2043(-52);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lra;ILra;)V")
    public static final void method1192(class57 arg0, int arg1, class57 arg2) {
        class70.field790 = arg0;
        if (arg1 == -17110) {
            field2520++;
            class6.field64 = arg2;
        }
    }
}
