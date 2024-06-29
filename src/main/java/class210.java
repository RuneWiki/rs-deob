import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class210 {

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "Lrg;")
    public static class548 field2561;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "Lqa;")
    public static class206 field2560;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "Lwj;")
    public class332 field2559;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
    public static void method1207(int arg0) {
        field2561 = null;
        if (arg0 < 72) {
            field2564 = 72;
        }
        field2560 = null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Let;B)Ljava/lang/String;")
    public static final String method1208(class509 arg0, byte arg1) {
        field2563++;
        if (client.method1412(arg0).method1499(arg1 - 42) == 0) {
            return null;
        }
        if (arg1 != 42) {
            field2564 = -29;
        }
        if (arg0.field7112 == null || arg0.field7112.trim().length() == 0) {
            return class2.field8 ? "Hidden-use" : null;
        } else {
            return arg0.field7112;
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)Z")
    public static final boolean method1209(int arg0) {
        field2562++;
        class544 var1 = class89.field1096.field2331.field7965;
        if (var1 == null || class89.field1096.field2331 == var1) {
            return false;
        }
        class99 var2 = (class99) var1;
        int var3 = 44 / ((26 - arg0) / 45);
        if (var2.field1227 >= 2000) {
            var2.field1227 -= 2000;
        }
        return var2.field1227 == 1009;
    }

    static {
        new class180(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
        field2564 = 0;
        field2561 = new class548(53, 4);
        new class180("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
    }
}
