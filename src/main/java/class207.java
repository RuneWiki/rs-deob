import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class207 {

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "Lss;")
    public static class213 field3151 = new class213("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "Lss;")
    public static class213 field3152 = new class213("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "Lss;")
    public static class213 field3153 = new class213("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "[I")
    public static int[] field3154 = new int[3];

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)Lce;")
    public static final class409 method1413(int arg0, int arg1, int arg2) {
        if (class217.field3699[arg0][arg1][arg2] == null) {
            boolean var3 = class217.field3699[0][arg1][arg2] != null && class217.field3699[0][arg1][arg2].field6195 != null;
            if (var3 && arg0 >= class297.field4675 - 1) {
                return null;
            }
            class84.method589(arg0, arg1, arg2);
        }
        return class217.field3699[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
    public static void method1414(byte arg0) {
        field3154 = null;
        field3151 = null;
        int var1 = 33 / ((27 - arg0) / 54);
        field3153 = null;
        field3152 = null;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
    public static final void method1415(int arg0) {
        if (arg0 < 46) {
            return;
        }
        field3150++;
        if (class148.field1994 == 2) {
            class89.method610(3, (byte) -104);
        } else if (class148.field1994 == 6) {
            class89.method610(7, (byte) -102);
        } else if (class148.field1994 == 9) {
            class89.method610(10, (byte) -122);
        }
    }
}
