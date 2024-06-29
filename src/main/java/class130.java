import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class130 extends class176 {

    @OriginalMember(owner = "client!od", name = "r", descriptor = "Lgg;")
    private static class63 field2834 = class116.method911(43, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field2836 = -1;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "Lgg;")
    public static class63 field2835 = field2834;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "Lid;")
    public static class78 field2833 = new class78(32);

    @OriginalMember(owner = "client!od", name = "A", descriptor = "Lgg;")
    public static class63 field2843 = class116.method911(43, "::fpsoff");

    @OriginalMember(owner = "client!od", name = "x", descriptor = "Lch;")
    public static class29 field2840 = new class29(50);

    @OriginalMember(owner = "client!od", name = "B", descriptor = "Lch;")
    public static class29 field2844 = new class29(30);

    @OriginalMember(owner = "client!od", name = "D", descriptor = "Lgg;")
    private static class63 field2846 = class116.method911(43, "level)2");

    @OriginalMember(owner = "client!od", name = "C", descriptor = "Lgg;")
    public static class63 field2845 = field2846;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "Lod;")
    public class130 field2839;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "Lod;")
    public class130 field2841;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(Z)V")
    public static void method961(boolean arg0) {
        field2845 = null;
        field2833 = null;
        field2835 = null;
        field2844 = null;
        field2843 = null;
        field2840 = null;
        field2846 = null;
        if (arg0) {
            field2834 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public final void method962(byte arg0) {
        field2832++;
        if (this.field2841 == null) {
            return;
        }
        if (arg0 <= 5) {
            method963(null, (byte) -91);
        }
        this.field2841.field2839 = this.field2839;
        this.field2839.field2841 = this.field2841;
        this.field2841 = null;
        this.field2839 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Loe;B)V")
    public static final void method963(class131 arg0, byte arg1) {
        field2838++;
        class75.method688(-126, arg0, 200000);
        if (arg1 > -32) {
            method961(false);
        }
    }
}
