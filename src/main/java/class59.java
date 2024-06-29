import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class59 extends class22 {

    @OriginalMember(owner = "client!ds", name = "M", descriptor = "Ljava/lang/Object;")
    private Object field923;

    @OriginalMember(owner = "client!ds", name = "L", descriptor = "Lfn;")
    public static class52 field922 = new class52(75, 3);

    @OriginalMember(owner = "client!ds", name = "P", descriptor = "J")
    public static long field926 = 0L;

    @OriginalMember(owner = "client!ds", name = "U", descriptor = "Ltm;")
    public static class112 field931 = new class112(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!ds", name = "C", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!ds", name = "N", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!ds", name = "O", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!ds", name = "Q", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!ds", name = "S", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!ds", name = "R", descriptor = "Li;")
    public static class332 field928;

    @OriginalMember(owner = "client!ds", name = "T", descriptor = "[[B")
    public static byte[][] field930;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)Lll;")
    public static final class248 method437(int arg0, int arg1) {
        field925++;
        if (arg0 > -58) {
            method439((byte) 59);
        }
        class248[] var2 = class210.method1324(8);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class248 var4 = var2[var3];
            if (var4.field3483 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lig;Ljava/lang/Object;I)V")
    public class59(class281 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field923 = arg1;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)Z")
    public final boolean method183(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field921++;
            return false;
        }
    }

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "(I)V")
    public static void method438(int arg0) {
        field922 = null;
        if (arg0 != -6638) {
            field922 = null;
        }
        field928 = null;
        field931 = null;
        field930 = null;
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(B)Z")
    public static final boolean method439(byte arg0) {
        if (arg0 <= 94) {
            field926 = -92L;
        }
        field929++;
        return class70.field1040 == 0 ? class224.field3181.method287(true) : true;
    }

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method185(int arg0) {
        int var2 = -104 % ((7 - arg0) / 60);
        field924++;
        return this.field923;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILfc;I)Lgr;")
    public static final class85 method440(int arg0, int arg1, class343 arg2, int arg3) {
        field927++;
        byte[] var4 = arg2.method2029(arg1, arg0, 0);
        if (arg3 != 3) {
            method439((byte) -69);
        }
        return var4 == null ? null : new class85(var4);
    }

    static {
        new class112("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
    }
}
