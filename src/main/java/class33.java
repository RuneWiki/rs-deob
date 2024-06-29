import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class class33 extends class267 {

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field547 = 0;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "[Llga;")
    public static class714[] field548 = new class714[4];

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "Lhm;")
    public static class223 field549 = new class223(4, 1);

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "B")
    public static byte field546;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "Lke;")
    public static class600 field550;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "[[B")
    public static byte[][] field545;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 4)
    public static void method219(int arg0) {
        field545 = null;
        if (arg0 == 23742) {
            field550 = null;
            field548 = null;
            field549 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)Lnn;")
    public abstract class418 method220(byte arg0);
}
