import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class92 {

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public int field1340 = 128;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public int field1341 = 128;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public int field1339;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public int field1343;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public int field1349;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public int field1344;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "[I")
    public static int[] field1347;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "Lgn;")
    public static class410 field1348;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "Lqu;")
    public static class219 field1350;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "Ljava/awt/Frame;")
    public static Frame field1342;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V")
    public static void method636(boolean arg0) {
        field1342 = null;
        field1348 = null;
        if (!arg0) {
            method636(false);
        }
        field1347 = null;
        field1350 = null;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)Ltl;")
    public final class92 method637(boolean arg0) {
        field1346++;
        if (arg0) {
            field1348 = null;
        }
        return new class92(this.field1339, this.field1340, this.field1341, this.field1344, this.field1349, this.field1343);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLtl;)V")
    public final void method638(byte arg0, class92 arg1) {
        this.field1340 = arg1.field1340;
        this.field1343 = arg1.field1343;
        this.field1341 = arg1.field1341;
        this.field1349 = arg1.field1349;
        this.field1339 = arg1.field1339;
        if (arg0 == -60) {
            this.field1344 = arg1.field1344;
            field1345++;
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(I)V")
    public class92(int arg0) {
        this.field1339 = arg0;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(IIIIII)V")
    private class92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1341 = arg2;
        this.field1340 = arg1;
        this.field1339 = arg0;
        this.field1343 = arg5;
        this.field1349 = arg4;
        this.field1344 = arg3;
    }

    static {
        new class213("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field1347 = new int[64];
        field1348 = new class410();
        field1350 = new class219(47, 18);
    }
}
