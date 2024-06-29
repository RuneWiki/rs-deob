import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class493 {

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    public int field7176;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    private int field7172;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public static int field7170 = 1400;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "Ljava/lang/String;")
    public static String field7171 = "";

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    public static int field7177;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    public static int field7175;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)I")
    public final int method2989(boolean arg0) {
        if (arg0) {
            field7173++;
            return this.field7172;
        } else {
            return 118;
        }
    }

    @OriginalMember(owner = "client!dq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7174++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(II)V")
    public class493(int arg0, int arg1) {
        this.field7176 = arg1;
        this.field7172 = arg0;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
    public static void method2990(int arg0) {
        int var1 = -31 / ((-arg0 - 24) / 63);
        field7171 = null;
    }

    static {
        new class335("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field7177 = 1405;
    }
}
