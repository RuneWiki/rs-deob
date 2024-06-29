import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class113 extends class115 {

    @OriginalMember(owner = "client!su", name = "i", descriptor = "[B")
    public byte[] field1719;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "Lni;")
    public static class521 field1720 = new class521();

    @OriginalMember(owner = "client!su", name = "k", descriptor = "[I")
    public static int[] field1721 = new int[100];

    @OriginalMember(owner = "client!su", name = "m", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!su", name = "l", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)V")
    public static void method872(boolean arg0) {
        field1720 = null;
        if (!arg0) {
            field1721 = null;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lgo;I)V")
    public static final void method873(class310 arg0, int arg1) {
        if (arg1 != -645) {
            field1723 = -84;
        }
        field1722++;
        if (arg0.field4703 == 5 && arg0.field4665 != -1) {
            class431.method2544(arg0, class407.field6147, 21917);
        }
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "([B)V")
    public class113(byte[] arg0) {
        this.field1719 = arg0;
    }

    static {
        new class347("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        field1723 = -1;
    }
}
