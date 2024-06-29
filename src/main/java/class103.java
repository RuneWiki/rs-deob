import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class103 extends class439 {

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "Ljava/lang/String;")
    public String field1639;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "[C")
    public static char[] field1640 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "Lvp;")
    public static class123 field1638 = new class123(66, 2);

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "[[Ltn;")
    public static class58[][] field1643;

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V", line = 6)
    public class103() {
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 8)
    public class103(String arg0, int arg1) {
        this.field1639 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V", line = 19)
    public static void method787(byte arg0) {
        field1638 = null;
        field1640 = null;
        if (arg0 >= 16) {
            field1643 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BII[B)[B", line = 39)
    public static final byte[] method788(byte arg0, int arg1, int arg2, byte[] arg3) {
        field1644++;
        if (arg0 <= 24) {
            field1643 = null;
        }
        byte[] var4 = new byte[arg2];
        class486.method2905(arg3, arg1, var4, 0, arg2);
        return var4;
    }
}
