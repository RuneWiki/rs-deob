import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class119 extends class154 {

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public int field2107;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Loh;")
    public static class258 field2099 = class153.method1046("Lade Sprites )2 ", 98);

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field2101 = 0;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "Loh;")
    private static class258 field2103 = class153.method1046("Opened title screen", 90);

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "[F")
    public static float[] field2109 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "Z")
    public static boolean field2110 = true;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "Loh;")
    public static class258 field2102 = field2103;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "Lng;")
    public static class163 field2108;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "[I")
    public static int[] field2105;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 7)
    public static void method874(int arg0) {
        field2102 = null;
        field2105 = null;
        if (arg0 <= 115) {
            field2102 = (class258) null;
        }
        field2109 = null;
        field2103 = null;
        field2099 = null;
        field2108 = null;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V", line = 50)
    public class119() {
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V", line = 54)
    public static final void method875(int arg0, int arg1) {
        class153.field2631.method1156(arg1, 0);
        class281.field4831.method1156(arg1, 0);
        field2106++;
        if (arg0 < 54) {
            field2108 = (class163) null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(I)V", line = 67)
    public class119(int arg0) {
        this.field2107 = arg0;
    }
}
