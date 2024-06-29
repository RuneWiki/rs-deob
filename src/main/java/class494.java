import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class494 implements class205 {

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public int field7302;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public static int field7306 = 0;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "Lcu;")
    public static class145 field7307 = new class145(1);

    @OriginalMember(owner = "client!no", name = "g", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    public static int field7305;

    static {
        new class342("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field7308 = 0;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V", line = 10)
    public static void method2973(boolean arg0) {
        field7307 = null;
        if (!arg0) {
            method2974(72, 88);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(II)I", line = 22)
    public static final int method2974(int arg0, int arg1) {
        field7304++;
        return ~arg1 == arg0 ? -1 : class259.method1676(0, arg1);
    }

    @OriginalMember(owner = "client!no", name = "toString", descriptor = "()Ljava/lang/String;", line = 36)
    public final String toString() {
        field7305++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 45)
    public class494(String arg0, int arg1) {
        this.field7302 = arg1;
    }
}
