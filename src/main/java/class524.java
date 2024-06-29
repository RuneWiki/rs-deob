import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class524 {

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Ljava/lang/String;")
    public static String field7653 = null;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "F")
    public static float field7655;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Lkj;")
    public static class405 field7656;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Laa;")
    public static class343 field7654;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method3109(int arg0) {
        if (arg0 != -32600) {
            field7653 = null;
        }
        field7653 = null;
        field7654 = null;
        field7656 = null;
    }

    static {
        new class44("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field7655 = 1024.0F;
        field7656 = new class405("", 15);
    }
}
