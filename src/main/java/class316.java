import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public abstract class class316 {

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public static int field4461;

    static {
        new class151("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILjava/lang/String;)V", line = 4)
    public static final void method2006(int arg0, String arg1) {
        if (arg0 < 38) {
            method2006(-98, (String) null);
        }
        class106.method842("", 0, arg1, 0, 0, "");
        field4460++;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIII)V", line = 17)
    public static final void method2007(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class423.field5857 = arg5;
        class368.field5069 = arg2;
        class301.field4260 = arg3;
        class35.field376 = arg4;
        class320.field4509 = arg1;
        field4459++;
        class128.field1740 = arg0;
        if (arg6 != 0) {
            field4461 = 91;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZILvc;IILuq;I)V")
    public abstract void method70(boolean arg0, int arg1, class89 arg2, int arg3, int arg4, class316 arg5, int arg6);

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lvc;I)Lep;")
    public abstract class309 method69(class89 arg0, int arg1);

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)Z")
    public abstract boolean method68(int arg0);

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILvc;II)Z")
    public abstract boolean method77(int arg0, class89 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "(B)V")
    public abstract void method75(byte arg0);

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(ZLvc;)V")
    public abstract void method86(boolean arg0, class89 arg1);
}
