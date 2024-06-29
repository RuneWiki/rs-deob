import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class256 implements class189 {

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public int field3675;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public static int field3673 = 0;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "Liu;")
    public static class390 field3677 = new class390(103, -2);

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "Liu;")
    public static class390 field3678 = new class390(45, 2);

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "[[B")
    public static byte[][] field3674;

    @OriginalMember(owner = "client!pp", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3676++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class256(String arg0, int arg1) {
        this.field3675 = arg1;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)V")
    public static void method1595(boolean arg0) {
        if (!arg0) {
            field3674 = null;
            field3678 = null;
            field3677 = null;
        }
    }

    static {
        new class194(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
    }
}
