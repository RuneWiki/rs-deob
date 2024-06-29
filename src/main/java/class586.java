import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class586 extends class626 {

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "J")
    public long field8246;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field8248 = 0;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Lqe;")
    public static class465 field8247 = new class465(79, 0);

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field8250 = 0;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Lqe;")
    public static class465 field8249 = new class465(39, 8);

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Ljava/lang/String;")
    public static String field8251 = null;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field8252 = 0;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "D")
    public static double field8255;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "Leq;")
    public static class209 field8253;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "[[B")
    public static byte[][] field8254;

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class586() {
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(J)V")
    public class586(long arg0) {
        this.field8246 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static void method3380(byte arg0) {
        field8247 = null;
        field8249 = null;
        if (arg0 > 77) {
            field8254 = null;
            field8253 = null;
            field8251 = null;
        }
    }
}
