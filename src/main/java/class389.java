import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class389 {

    @OriginalMember(owner = "client!po", name = "a", descriptor = "Lok;")
    public static class166 field5276 = new class166(0, 4);

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "Ljs;")
    public static class216 field5281;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "Lcg;")
    public static class90 field5280;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V")
    public static final void method2294(boolean arg0) {
        field5278++;
        class412.field5693 = 0;
        class415.field5733.method1670((byte) -104);
        class415.field5733.method1666((byte) -108, class141.field2047);
        if (arg0) {
            method2295(false);
        }
        class412.field5693++;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(Z)V")
    public static void method2295(boolean arg0) {
        field5280 = null;
        field5281 = null;
        if (arg0) {
            field5280 = null;
        }
        field5276 = null;
    }
}
