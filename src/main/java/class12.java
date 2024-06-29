import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class class12 {

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field237 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field233 = 0;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "Lcd;")
    private static class64 field236 = class44.method335((byte) 71, "wave2:");

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "Lcd;")
    public static class64 field238 = class44.method335((byte) 71, "cookiehost");

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "Lcd;")
    public static class64 field235 = field236;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Lcd;")
    public static class64 field232 = field236;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Lig;")
    public static class168 field231 = new class168(50);

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "[I")
    public static int[] field234;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V", line = 10)
    public static void method97(byte arg0) {
        field234 = null;
        field235 = null;
        field232 = null;
        field231 = null;
        field238 = null;
        if (arg0 != -38) {
            method99((int[][]) ((int[][]) null), -113);
        }
        field236 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "([[II)V", line = 60)
    public static final void method99(int[][] arg0, int arg1) {
        field239++;
        if (arg1 == 17) {
            class124.field2241 = arg0;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "([BZ)V")
    public abstract void method98(byte[] arg0, boolean arg1);

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)[B")
    public abstract byte[] method100(int arg0);
}
