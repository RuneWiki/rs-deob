import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class261 {

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Lhb;")
    public static class629 field3711 = new class629(4, 4);

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field3713 = -1;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Lea;")
    public static class474 field3712 = new class474("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lcq;")
    public static class402 field3710;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 3)
    public static void method1736(byte arg0) {
        field3712 = null;
        field3711 = null;
        if (arg0 <= -99) {
            field3710 = null;
        }
    }
}
