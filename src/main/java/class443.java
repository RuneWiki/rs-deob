import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class443 {

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Z")
    public boolean field6305;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "[I")
    public static int[] field6306 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field6307 = 4;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Lej;")
    public static class104 field6309 = new class104("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lcba;")
    public static class471 field6312 = new class471(20, 4);

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Z")
    public static boolean field6313 = false;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Luj;")
    public class321 field6302;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Luj;")
    public class321 field6304;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Z")
    public boolean field6308;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method2619(int arg0) {
        field6312 = null;
        field6309 = null;
        if (arg0 != 2) {
            field6307 = -35;
        }
        field6306 = null;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)Z")
    public final boolean method2620(int arg0) {
        if (arg0 == 2860) {
            field6303++;
            return this.field6308 && !this.field6305;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZZ)V")
    public static final void method2621(boolean arg0, boolean arg1) {
        class595.method3520(class387.field5196, class134.field2128, class56.field1005, arg0, arg1);
        field6301++;
        if (arg1) {
            field6307 = 3;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILbea;)I")
    public static final int method2622(int arg0, class188 arg1) {
        field6310++;
        if (arg0 >= -2) {
            field6307 = 87;
        }
        int var2 = arg1.field2668;
        class107 var3 = arg1.method349(true);
        if (arg1.field567) {
            var2 = arg1.field2662;
        } else if (arg1.field554 == var3.field1617 || arg1.field554 == var3.field1629 || arg1.field554 == var3.field1652 || arg1.field554 == var3.field1641) {
            var2 = arg1.field2628;
        } else if (arg1.field554 == var3.field1647 || arg1.field554 == var3.field1627 || arg1.field554 == var3.field1642 || arg1.field554 == var3.field1636) {
            var2 = arg1.field2646;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
    public final void method2623(boolean arg0) {
        field6311++;
        if (this.field6302 != null) {
            this.field6302.method618((byte) 125);
        }
        this.field6308 = arg0;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Z)V")
    public class443(boolean arg0) {
        this.field6305 = arg0;
    }

    static {
        new class104("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
    }
}
