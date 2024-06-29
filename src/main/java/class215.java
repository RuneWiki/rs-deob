import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class215 {

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public static int field2654 = 0;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public static int field2655 = 0;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "Lkl;")
    public static class338 field2658 = new class338(5000);

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public static int field2659 = 1;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public int field2653;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public int field2656;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public int field2657;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public int field2660;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BI)I")
    public static final int method1315(byte arg0, int arg1) {
        int var2 = 65 % ((arg0 + 8) / 63);
        field2652++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
    public static void method1316(int arg0) {
        field2658 = null;
        if (arg0 != 741029735) {
            method1315((byte) -77, -89);
        }
    }
}
