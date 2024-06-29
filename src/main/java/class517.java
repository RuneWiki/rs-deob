import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class517 {

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    private int field7190;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    public int field7192;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field7191;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field7194;

    static {
        new class567("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)I", line = 5)
    public final int method2914(int arg0) {
        field7191++;
        return arg0 == 6 ? this.field7190 : 73;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)I", line = 16)
    public static final int method2915(byte arg0) {
        field7189++;
        if (arg0 != -73) {
            field7194 = -128;
        }
        return 6;
    }

    @OriginalMember(owner = "client!iu", name = "toString", descriptor = "()Ljava/lang/String;", line = 30)
    public final String toString() {
        field7193++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(II)V", line = 39)
    public class517(int arg0, int arg1) {
        this.field7190 = arg0;
        this.field7192 = arg1;
    }
}
