import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public abstract class class86 {

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "Lnq;")
    public class325 field1248;

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "Lps;")
    public static class63 field1251 = new class63();

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "Lof;")
    public static class446 field1253;

    @OriginalMember(owner = "client!hw", name = "h", descriptor = "Lps;")
    public static class63 field1254;

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "Ljava/lang/Boolean;")
    public static Boolean field1255;

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "F")
    public static float field1252;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
    public static final void method586(byte arg0) {
        int var1 = 0;
        if (arg0 != -128) {
            return;
        }
        while (class515.field7568.length > var1) {
            for (int var2 = 0; var2 < class515.field7568[var1].length; var2++) {
                class515.field7568[var1][var2] = class232.field3306;
            }
            var1++;
        }
        field1249++;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)Z")
    public static final boolean method587(int arg0, int arg1) {
        field1247++;
        if (class24.field351[arg1]) {
            return true;
        }
        if (arg0 > -108) {
            method589(119, (byte) -34, 46, -44, 54);
        }
        if (!class25.field359.method1268(-117, arg1)) {
            return false;
        }
        int var2 = class25.field359.method1290(false, arg1);
        if (var2 == 0) {
            class24.field351[arg1] = true;
            return true;
        }
        if (class263.field3690[arg1] == null) {
            class263.field3690[arg1] = new class282[var2];
        }
        for (int var3 = 0; var3 < var2; var3++) {
            if (class263.field3690[arg1][var3] == null) {
                byte[] var4 = class25.field359.method1281(arg1, var3, 81);
                if (var4 != null) {
                    class282 var5 = class263.field3690[arg1][var3] = new class282();
                    var5.field4029 = (arg1 << 16) + var3;
                    if (var4[0] != -1) {
                        throw new IllegalStateException("if1");
                    }
                    var5.method1809((byte) 44, new class164(var4));
                }
            }
        }
        class24.field351[arg1] = true;
        return true;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IBI)V")
    public abstract void method239(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(B)Z")
    public abstract boolean method238(byte arg0);

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z)V")
    public static void method588(boolean arg0) {
        field1254 = null;
        if (!arg0) {
            field1251 = null;
            field1253 = null;
            field1255 = null;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
    public abstract void method237(int arg0);

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lnq;)V")
    public class86(class325 arg0) {
        this.field1248 = arg0;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZ)V")
    public abstract void method241(int arg0, boolean arg1);

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(ZB)V")
    public abstract void method235(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IBIII)V")
    public static final void method589(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1250++;
        if (class377.field5760 <= arg3 && class49.field701 >= arg3) {
            int var5 = class33.method289(arg1 + 261157, class463.field6924, class369.field5628, arg2);
            int var6 = class33.method289(arg1 + 261157, class463.field6924, class369.field5628, arg4);
            class465.method2798(var6, (byte) 83, var5, arg3, arg0);
        }
        if (arg1 != -53) {
            method588(false);
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(ZLlr;I)V")
    public abstract void method236(boolean arg0, class538 arg1, int arg2);

    static {
        new class446("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field1253 = new class446("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");
        field1254 = new class63();
        field1255 = Boolean.FALSE;
    }
}
