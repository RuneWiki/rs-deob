import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class class247 extends class15 {

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "Lce;")
    public static class126 field4160 = class206.method1445(-7923, "Veuillez patienter )2 tentative de r-Btablissement)3");

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "Lce;")
    public static class126 field4161 = class206.method1445(-7923, "Liste des mises -9 jour charg-Be");

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIII)V", line = 23)
    public static final void method1690(int arg0, int arg1, int arg2, int arg3) {
        field4159++;
        class245 var4 = class139.method1022(arg0, (byte) -126, arg2);
        var4.method1683(arg0 - 4);
        var4.field4154 = arg1;
        var4.field4153 = arg3;
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)V", line = 40)
    public static void method1691(int arg0) {
        field4161 = null;
        if (arg0 == 4) {
            field4160 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(B)Z")
    public abstract boolean method1035(byte arg0);

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1034(int arg0);
}
