import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class297 {

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field4655 = 1;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "J")
    public static long field4654 = 0L;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "[Lek;")
    public static class196[] field4657 = new class196[32768];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "F")
    public static float field4653;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "[[[B")
    public static byte[][][] field4658;

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V", line = 62)
    public class297() {
        new class3();
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V", line = 35)
    public static void method2068(byte arg0) {
        field4658 = (byte[][][]) null;
        field4657 = null;
        if (arg0 > -61) {
            field4658 = (byte[][][]) ((byte[][][]) null);
        }
    }
}
