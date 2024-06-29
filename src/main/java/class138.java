import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class class138 extends class366 {

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "Laa;")
    public class283 field2115;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "Z")
    public static boolean field2117 = false;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field2118;

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "[I")
    public static int[] field2119;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "Lml;")
    public static class219 field2116;

    static {
        new class349("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field2118 = new String[100];
        field2119 = new int[13];
        new class349("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Laa;)V", line = 8)
    public class138(class283 arg0) {
        this.field2115 = arg0;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V", line = 18)
    public static void method1052(int arg0) {
        field2118 = null;
        field2119 = null;
        field2116 = null;
        if (arg0 != 100) {
            field2118 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(B)Z")
    public abstract boolean method1050(byte arg0);

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1051(byte arg0);
}
