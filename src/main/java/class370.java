import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class370 {

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public int field4988;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field4986 = 0;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLac;)Lqfa;")
    public static final class85 method2133(byte arg0, class501 arg1) {
        field4989++;
        class497 var2 = class248.method1532(arg1, -26);
        int var3 = arg1.method2840(false);
        int var4 = arg1.method2840(false);
        if (arg0 != -34) {
            method2133((byte) -57, null);
        }
        return new class85(var2.field6762, var2.field6763, var2.field6765, var2.field6754, var2.field6764, var2.field6757, var2.field6760, var2.field6759, var2.field6758, var3, var4);
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(II)V")
    public class370(int arg0, int arg1) {
        this.field4988 = arg1;
    }

    @OriginalMember(owner = "client!oh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4987++;
        throw new IllegalStateException();
    }
}
