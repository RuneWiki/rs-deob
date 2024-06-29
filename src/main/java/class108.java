import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class108 extends class166 {

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Lcd;")
    public static class23 field2299 = class54.method414("scape main", -1);

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "Lcd;")
    private static class23 field2304 = class54.method414("To play on this world move to a free area first)3", -1);

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "Lcd;")
    public static class23 field2306 = field2304;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "Lcd;")
    private static class23 field2305 = class54.method414("Unexpected server response)3", -1);

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
    public static int field2307 = 0;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "[I")
    public static int[] field2308 = new int[128];

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Lcd;")
    public static class23 field2301 = field2305;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field2298 = 0;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "Lcd;")
    public class23 field2300;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
    public static void method703(int arg0) {
        field2308 = null;
        field2305 = null;
        field2304 = null;
        if (arg0 != 10136) {
            method704(5, -8);
        }
        field2301 = null;
        field2299 = null;
        field2306 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)I")
    public static final int method704(int arg0, int arg1) {
        field2302++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        int var3 = 36 / ((arg1 - 4) / 61);
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)Lsb;")
    public static final class163 method705(int arg0) {
        field2303++;
        try {
            if (arg0 >= -56) {
                method703(86);
            }
            return (class163) Class.forName("id").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class131();
        }
    }
}
