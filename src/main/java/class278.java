import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class278 {

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "Lvj;")
    public static class304 field3653 = new class304("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "B")
    public byte field3634;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "B")
    public byte field3640;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "B")
    public byte field3643;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "B")
    public byte field3648;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "B")
    public byte field3649;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "B")
    public byte field3650;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "B")
    public byte field3651;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public int field3639;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public int field3642;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "S")
    public short field3647;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Z")
    public boolean field3632;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Z")
    public boolean field3635;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Z")
    public boolean field3636;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Z")
    public boolean field3637;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "Z")
    public boolean field3638;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "Z")
    public boolean field3641;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Z")
    public boolean field3644;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "Z")
    public boolean field3646;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "Z")
    public boolean field3652;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method1652(int arg0) {
        field3653 = null;
        if (arg0 >= -84) {
            field3653 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)V")
    public static final void method1653(boolean arg0, int arg1) {
        if (!class154.field2244.field7763) {
            arg1 = -1;
        }
        if (arg0) {
            field3653 = null;
        }
        field3633++;
        if (class400.field5373 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class106 var2 = class31.field513.method2333(true, arg1);
            class134 var3 = var2.method745(0);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class389.field5281.method1370(class518.field7663, new Point(var2.field1555, var2.field1553), var3.method946(), 17, var3.method938(), var3.method942());
                class400.field5373 = arg1;
            }
        }
        if (arg1 == -1 && class400.field5373 != -1) {
            class389.field5281.method1370(class518.field7663, new Point(), null, 17, -1, -1);
            class400.field5373 = -1;
        }
    }

    static {
        new class304("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
    }
}
