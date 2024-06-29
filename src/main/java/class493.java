import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class493 {

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "Ljava/lang/String;")
    public String field7005;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "J")
    public long field7008;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "Ljava/lang/String;")
    public String field7006;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    public int field7010;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public int field7007;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "Llu;")
    public static class610 field7003 = new class610(71, 3);

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "Ljava/lang/String;")
    public static String field7009 = "";

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "Lh;")
    public static class572 field7011 = new class572("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
    public static int field7014 = 1;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "Lh;")
    public static class572 field7013 = new class572("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "Lkda;")
    public static class328 field7012;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V", line = 7)
    public static void method2948(int arg0) {
        field7012 = null;
        field7011 = null;
        field7003 = null;
        field7009 = null;
        if (arg0 == 0) {
            field7013 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)V", line = 25)
    public static final void method2949(int arg0, int arg1) {
        field7004++;
        if (!class325.method1953(arg1, (byte) -99)) {
            return;
        }
        class162[] var2 = class302.field4135[arg1];
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class162 var4 = var2[var3];
            if (var4 != null) {
                var4.field2528 = 0;
                var4.field2438 = 0;
                var4.field2506 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V", line = 69)
    public class493(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field7005 = arg3;
        this.field7008 = arg4;
        this.field7006 = arg1;
        this.field7010 = arg2;
        this.field7007 = arg0;
    }
}
