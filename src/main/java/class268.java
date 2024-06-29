import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class268 {

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "[[B")
    public static byte[][] field3984;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "[[Z")
    public static boolean[][] field3982;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
    public static void method1708(byte arg0) {
        if (arg0 == 3) {
            field3982 = null;
            field3984 = null;
        }
    }
}
