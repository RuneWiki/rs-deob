import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class529 extends class499 {

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field7777 = 0;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Lec;")
    public static class68 field7780 = null;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "Z")
    public static boolean field7782;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "Lnk;")
    public static class326 field7781;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "Llo;")
    public static class306 field7783;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field7778;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field7779;

    static {
        new class306("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field7782 = false;
        field7781 = new class326(25, 15);
        field7783 = new class306("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3131(int arg0) {
        if (class177.field2811 != null) {
            class177.field2811.method532(-1);
        }
        field7779++;
        int var1 = 66 % ((arg0 - 13) / 39);
        if (class429.field6435 != null) {
            class429.field6435.method532(-1);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZLol;I)Lqk;", line = 20)
    public static final class1 method3132(boolean arg0, class290 arg1, int arg2) {
        if (!arg0) {
            field7780 = null;
        }
        field7778++;
        class1 var3;
        if (class236.field4086 == null) {
            var3 = new class1();
        } else {
            var3 = class236.field4086;
            class236.field4086 = class236.field4086.field2;
            class4.field42--;
            var3.field2 = null;
        }
        var3.field9 = arg1;
        var3.field4 = arg2;
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V", line = 53)
    public static void method3133(boolean arg0) {
        field7783 = null;
        field7781 = null;
        field7780 = null;
        if (arg0) {
            field7781 = null;
        }
    }
}
