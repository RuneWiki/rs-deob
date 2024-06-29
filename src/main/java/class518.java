import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class518 extends class529 {

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "Ljava/lang/String;")
    public String field7682;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field7683;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "Lgn;")
    public static class410 field7685;

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    public class518() {
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)Z")
    public static final boolean method3108(byte arg0, int arg1) {
        field7683++;
        if (arg1 == 15 || arg1 == 3 || arg1 == 57 || arg1 == 23 || arg1 == 44) {
            return true;
        } else if (arg1 == 45 || arg1 == 1006) {
            return true;
        } else {
            int var2 = -102 / ((arg0 - 45) / 47);
            return false;
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class518(String arg0, int arg1) {
        this.field7682 = arg0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static void method3109(int arg0) {
        field7685 = null;
        if (arg0 != -1007) {
            method3109(105);
        }
    }

    static {
        new class213("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field7686 = 0;
    }
}
