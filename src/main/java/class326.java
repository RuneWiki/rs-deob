import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class326 {

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Lhc;")
    public static class368 field4432 = new class368("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Lka;")
    public static class408 field4433 = new class408(50);

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "Z")
    public static boolean field4434 = false;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field4435 = 13156520;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V")
    public static final void method1992(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class88.field1232.field5048 = 0;
        field4431++;
        int var5 = 34 % ((arg0 + 63) / 41);
        class88.field1232.method2280(20, 1537846408);
        class88.field1232.method2280(arg2, 1537846408);
        class88.field1232.method2280(arg4, 1537846408);
        class88.field1232.method2275(123, arg3);
        class88.field1232.method2275(126, arg1);
        class436.field6158 = -3;
        class284.field3868 = 1;
        class123.field1850 = 0;
        class445.field6240 = 0;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILrb;)V")
    public static final void method1993(int arg0, class425 arg1) {
        if (arg0 != -2) {
            method1994(18);
        }
        arg1.field5916 = false;
        field4430++;
        if (arg1.field5917 != null) {
            arg1.field5917.field2478 = 0;
        }
        for (class425 var2 = arg1.method100(); var2 != null; var2 = arg1.method105()) {
            method1993(-2, var2);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method1994(int arg0) {
        field4433 = null;
        field4432 = null;
        if (arg0 != 0) {
            field4433 = null;
        }
    }
}
