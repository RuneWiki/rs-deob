import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class27 {

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[I")
    public static int[] field480 = new int[100];

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[[B")
    public static byte[][] field484 = new byte[1000][];

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field479 = 0;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "Led;")
    public static class43 field490 = class191.method1219("<col=ff3000>", false);

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Z")
    public static boolean field481 = true;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Lga;")
    public static class58 field483;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "[Lnb;")
    public static class120[] field489;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "[[B")
    public static byte[][] field488;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lke;")
    public static final class96 method129(int arg0) {
        if (arg0 != 100) {
            field480 = null;
        }
        field487++;
        try {
            return (class96) Class.forName("b").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class37();
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static void method130(int arg0) {
        field489 = null;
        field484 = null;
        field483 = null;
        field490 = null;
        if (arg0 != 1000) {
            method131((byte) -116, null);
        }
        field480 = null;
        field488 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLga;)V")
    public static final void method131(byte arg0, class58 arg1) {
        if (arg0 <= -7) {
            class184.field3631 = arg1;
            field485++;
        }
    }
}
