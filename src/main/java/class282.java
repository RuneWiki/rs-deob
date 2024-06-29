import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class282 extends class223 {

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "[B")
    public byte[] field4107;

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "[I")
    public static int[] field4106 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4109;

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "Lsb;")
    public static class191 field4108;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
    public static void method1801(int arg0) {
        field4108 = null;
        if (arg0 != -7799) {
            field4108 = null;
        }
        field4106 = null;
        field4109 = null;
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "([B)V")
    public class282(byte[] arg0) {
        this.field4107 = arg0;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)Lhr;")
    public static final class363 method1802(int arg0, int arg1, int arg2) {
        class148 var3 = class422.field6240[arg0][arg1][arg2];
        return var3 == null || var3.field2082 == null ? null : var3.field2082;
    }

    static {
        new class331("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field4109 = "";
    }
}
