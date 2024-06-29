import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class144 extends class234 {

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "[J")
    public static long[] field2297 = new long[500];

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "[I")
    public static int[] field2299 = new int[200];

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "Lmh;")
    public static class62 field2302 = class201.method1405(true, "Nehmen");

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "Z")
    public static boolean field2301 = false;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "Lka;")
    public static class274 field2296;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 16)
    public static void method1060(int arg0) {
        field2296 = null;
        if (arg0 < -32) {
            field2297 = null;
            field2299 = null;
            field2302 = null;
        }
    }
}
