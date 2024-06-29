import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class472 {

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public int field6615;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    private int field6621;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field6618 = 500;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Lsh;")
    public static class472 field6613 = new class472(74, 6);

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "Lbg;")
    public static class257 field6622;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "[Lso;")
    public static class187[] field6620;

    @OriginalMember(owner = "client!sh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6614++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)I")
    public static final int method2752(int arg0) {
        if (arg0 != 27944) {
            method2753(102, true, 76);
        }
        field6617++;
        return 2;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZI)V")
    public static final void method2753(int arg0, boolean arg1, int arg2) {
        field6619++;
        class341 var3 = class271.method1763(arg1, arg2, false);
        if (var3 != null) {
            if (arg0 != -30484) {
                field6623 = -102;
            }
            var3.method283(2);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public static void method2754(int arg0) {
        field6622 = null;
        field6613 = null;
        if (arg0 == 0) {
            field6620 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)I")
    public final int method2755(boolean arg0) {
        field6616++;
        return arg0 ? -32 : this.field6621;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(II)V")
    public class472(int arg0, int arg1) {
        this.field6615 = arg1;
        this.field6621 = arg0;
    }

    static {
        new class332("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field6623 = 0;
    }
}
