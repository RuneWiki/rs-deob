import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class184 extends class496 {

    @OriginalMember(owner = "client!br", name = "k", descriptor = "[Lgu;")
    public static class126[] field2797 = new class126[5];

    @OriginalMember(owner = "client!br", name = "m", descriptor = "Lqu;")
    public static class364 field2799;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "I")
    public int field2795;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "I")
    public int field2796;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "[[B")
    public static byte[][] field2800;

    static {
        for (int var0 = 0; var0 < field2797.length; var0++) {
            field2797[var0] = new class126();
        }
        field2799 = new class364(3, 3);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V", line = 3)
    public static void method1211(byte arg0) {
        if (arg0 < 6) {
            method1211((byte) -68);
        }
        field2799 = null;
        field2797 = null;
        field2800 = null;
    }
}
