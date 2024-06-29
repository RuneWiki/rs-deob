import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class156 {

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2473 = "Created gameworld";

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field2474 = 0;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field2472 = new String[500];

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Lkk;")
    public static class254 field2470;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Lkk;")
    public static class254 field2471;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method1030(int arg0) {
        field2470 = null;
        field2471 = null;
        if (arg0 != 500) {
            method1030(-66);
        }
        field2472 = null;
        field2473 = null;
    }
}
