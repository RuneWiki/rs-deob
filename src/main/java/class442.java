import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public abstract class class442 {

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field5895 = -50;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "Lada;")
    public static class144 field5894 = new class144(76, 2);

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "Llp;")
    public static class331 field5896;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Laa;I)Laa;")
    public abstract class415 method1663(class415 arg0, int arg1);

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
    public static void method2565(int arg0) {
        field5896 = null;
        if (arg0 == -11395) {
            field5894 = null;
        }
    }
}
