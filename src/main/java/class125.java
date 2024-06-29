import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class125 extends class77 {

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "Lpf;")
    public static class17 field2100 = new class17(8);

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "Z")
    public static boolean field2102 = false;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "[Lng;")
    public static class73[] field2103;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "[[[Lbb;")
    public static class49[][][] field2101;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
    public static void method937(int arg0) {
        field2103 = null;
        field2101 = null;
        field2100 = null;
        if (arg0 != -29488) {
            field2102 = false;
        }
    }
}
