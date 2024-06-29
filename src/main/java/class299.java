import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class299 {

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "Lnn;")
    public static class214 field4325 = new class214(1, 2);

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "Lpp;")
    public static class464 field4326 = new class464(43, -1);

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "Liu;")
    public static class517 field4329;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "Lkl;")
    public static class468 field4330;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "F")
    public static float field4328;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field4327;

    static {
        new class567("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field4329 = new class517(22, 3);
        field4330 = new class468(1);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lfm;I)Z", line = 8)
    public static final boolean method1873(class192 arg0, int arg1) {
        int var2 = -95 / ((-arg1 - 34) / 58);
        field4324++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field2745) {
            return false;
        } else if (!arg0.method1272(-113, class212.field3090)) {
            return false;
        } else if (class526.field7325.method740(0, (long) arg0.field2734) == null) {
            return class330.field4742.method740(0, (long) arg0.field2769) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 40)
    public static void method1874(int arg0) {
        field4330 = null;
        if (arg0 != 1) {
            field4329 = null;
        }
        field4326 = null;
        field4325 = null;
        field4329 = null;
    }
}
