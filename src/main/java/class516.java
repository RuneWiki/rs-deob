import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class516 implements class171 {

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public int field7585;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Lko;")
    public static class348 field7581 = new class348();

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Z")
    public static boolean field7584 = false;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "F")
    public static float field7582;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!ob", name = "toString", descriptor = "()Ljava/lang/String;", line = 11)
    public final String toString() {
        field7583++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)Ljava/lang/String;", line = 20)
    public static final String method3056(int arg0, int arg1) {
        field7586++;
        int var2 = -77 % ((arg0 - 2) / 44);
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFFCF3A) >> 16) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V", line = 34)
    public static void method3057(byte arg0) {
        if (arg0 != 34) {
            field7582 = 0.53413016F;
        }
        field7581 = null;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 47)
    public class516(String arg0, int arg1) {
        this.field7585 = arg1;
    }
}
