import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class215 {

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "[Z")
    public static boolean[] field2761 = new boolean[200];

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "Luv;")
    public static class3 field2760 = new class3(18, 8);

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "Luv;")
    public static class3 field2762 = new class3(39, 2);

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "[I")
    public static int[] field2764 = new int[8];

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "Lpca;")
    public static class362 field2763 = new class362();

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "Lvt;")
    public static class344 field2766 = new class344("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "[Ljq;")
    public static class447[] field2765;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
    public static void method1394(byte arg0) {
        if (arg0 <= 96) {
            field2765 = null;
        }
        field2763 = null;
        field2761 = null;
        field2765 = null;
        field2760 = null;
        field2762 = null;
        field2766 = null;
        field2764 = null;
    }
}
