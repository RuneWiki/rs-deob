import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class254 extends class362 {

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "Lka;")
    public static class408 field3518 = new class408(128);

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "J")
    public static long field3520;

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "Lfc;")
    public static class193 field3522;

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "Lci;")
    public static class389 field3521;

    static {
        new class368(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field3520 = 0L;
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V", line = 14)
    public static void method1628(int arg0) {
        if (arg0 == -2106) {
            field3522 = null;
            field3521 = null;
            field3518 = null;
        }
    }
}
