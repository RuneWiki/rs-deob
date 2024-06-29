import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class386 {

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Lbi;")
    public static class104 field5899 = new class104(102, 3);

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Z")
    public static boolean field5901;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method2484(int arg0) {
        if (arg0 != 3) {
            field5899 = null;
        }
        field5899 = null;
    }

    static {
        new class213("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field5902 = 16777215;
        field5901 = false;
        field5903 = 0;
    }
}
