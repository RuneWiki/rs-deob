import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class180 {

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field2464 = 0;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "Ldj;")
    public static class143 field2465 = new class143(64);

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "Z")
    public static boolean field2467 = true;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "J")
    public static long field2468 = 0L;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "S")
    public static short field2466 = 320;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2469 = "wishes to trade with you.";

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "[I")
    public static int[] field2463;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V", line = 8)
    public static void method1325(byte arg0) {
        field2469 = null;
        field2465 = null;
        if (arg0 != 73) {
            method1325((byte) -85);
        }
        field2463 = null;
    }
}
