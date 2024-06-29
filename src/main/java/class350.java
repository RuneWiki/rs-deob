import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class350 extends class97 {

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public int field5202;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public static int field5201 = 0;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class350() {
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lmr;B)V")
    public static final void method2110(class145 arg0, byte arg1) {
        if (arg1 != -98) {
            method2110((class145) null, (byte) -40);
        }
        if (arg0 instanceof class155) {
            class155 var2 = (class155) arg0;
            if (var2.field2137 != null) {
                class278.method1718(class113.field1500.field1902 != var2.field1902, var2, (byte) 60);
            }
        } else if (arg0 instanceof class169) {
            class169 var3 = (class169) arg0;
            class435.method2672(class113.field1500.field1902 != var3.field1902, var3, (byte) 68);
        }
        field5203++;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(I)V")
    public class350(int arg0) {
        this.field5202 = arg0;
    }

    static {
        new class151("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        new class151("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field5205 = 2;
    }
}
