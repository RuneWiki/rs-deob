import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class5 extends class180 {

    @OriginalMember(owner = "client!no", name = "q", descriptor = "I")
    public int field106;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "S")
    public static short field105;

    @OriginalMember(owner = "client!no", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field109;

    @OriginalMember(owner = "client!no", name = "v", descriptor = "[I")
    public static int[] field111;

    @OriginalMember(owner = "client!no", name = "r", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!no", name = "s", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!no", name = "u", descriptor = "[[[Lui;")
    public static class406[][][] field110;

    static {
        new class112("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field105 = 1;
        field109 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
        field111 = new int[32];
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BLes;)V", line = 10)
    public static final void method76(byte arg0, class75 arg1) {
        field108++;
        if (arg0 < 92) {
            field105 = 109;
        }
        int var2 = arg1.field1129 - class356.field4972;
        int var3 = arg1.field1095 * 128 + (arg1.method206(0) * 64);
        int var4 = arg1.field1098 * 128 + (arg1.method206(0) * 64);
        arg1.field1137 = 0;
        arg1.field6746 += (var4 - arg1.field6746) / var2;
        arg1.field6765 += (var3 - arg1.field6765) / var2;
        if (arg1.field1097 == 0) {
            arg1.method505(8192, -32082);
        }
        if (arg1.field1097 == 1) {
            arg1.method505(12288, -32082);
        }
        if (arg1.field1097 == 2) {
            arg1.method505(0, -32082);
        }
        if (arg1.field1097 == 3) {
            arg1.method505(4096, -32082);
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(II)V", line = 46)
    public class5(int arg0, int arg1) {
        this.field106 = arg0;
        this.field104 = arg1;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZI)V", line = 61)
    public static final void method77(String arg0, int arg1, String arg2, String arg3, boolean arg4, int arg5) {
        class254.method1581(-1, (byte) -82, arg3, arg0, arg5, (String) null, arg1, arg2);
        field107++;
        if (arg4) {
            field111 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V", line = 74)
    public static void method78(boolean arg0) {
        field110 = null;
        field111 = null;
        field109 = null;
        if (arg0) {
            method78(true);
        }
    }
}
