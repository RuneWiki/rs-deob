import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public abstract class class205 extends class425 {

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "Lpm;")
    public static class349 field2889 = new class349("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static final void method1432(int arg0) {
        field2888++;
        int var1 = 0;
        for (int var2 = 0; var2 < class80.field1034; var2++) {
            for (int var3 = 0; var3 < class381.field5414; var3++) {
                if (class352.method2304(arg0 ^ 0xDFF, var2, class385.field5449, var3, var1, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 != 512) {
            method1432(15);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public static void method1433(boolean arg0) {
        if (!arg0) {
            field2889 = null;
        }
        field2889 = null;
    }
}
