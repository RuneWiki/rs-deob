import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class234 {

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "[Ljava/lang/String;")
    private String[] field3772;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Lhn;")
    public static class509 field3777;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field3776;

    static {
        new class234("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field3777 = new class509(3, 6);
        new class234("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V", line = 27)
    public static void method1634(byte arg0) {
        if (arg0 != -61) {
            method1636(-91);
        }
        field3777 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 50)
    public final String method1635(int arg0, byte arg1) {
        field3774++;
        int var3 = 66 % ((arg1 - 81) / 36);
        return this.field3772[arg0];
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 61)
    public class234(String arg0, String arg1, String arg2, String arg3) {
        this.field3772 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!ak", name = "toString", descriptor = "()Ljava/lang/String;", line = 87)
    public final String toString() {
        field3776++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 135)
    public static final void method1636(int arg0) {
        field3775++;
        class132.field2021 = new class106(8);
        if (arg0 <= 107) {
            field3777 = null;
        }
        class324.field4847 = 0;
        for (class354 var1 = (class354) class465.field6733.method1958(12); var1 != null; var1 = (class354) class465.field6733.method1961(105)) {
            var1.method2229();
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lul;Lul;I)V", line = 158)
    public static final void method1637(class406 arg0, class406 arg1, int arg2) {
        field3773++;
        class48.field626 = arg1;
        class521.field7629 = arg0;
        int var3 = -40 / ((arg2 + 76) / 46);
    }
}
