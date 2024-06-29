import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class135 {

    @OriginalMember(owner = "client!of", name = "h", descriptor = "[I")
    public static int[] field2195 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Lck;")
    public static class119 field2188 = class298.method1987((byte) 63, ")2");

    @OriginalMember(owner = "client!of", name = "f", descriptor = "Lck;")
    private static class119 field2193 = class298.method1987((byte) 48, "Take");

    @OriginalMember(owner = "client!of", name = "i", descriptor = "Lck;")
    public static class119 field2196 = field2193;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "[[Lml;")
    public static class134[][] field2189;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "[[[B")
    public static byte[][][] field2190;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V", line = 4)
    public static void method898(byte arg0) {
        field2196 = null;
        field2189 = (class134[][]) null;
        field2193 = null;
        if (arg0 != 77) {
            field2195 = (int[]) null;
        }
        field2195 = null;
        field2190 = (byte[][][]) null;
        field2188 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IBIIII)V", line = 57)
    public static final void method899(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field2194++;
        int var6 = class197.method1264(-113, arg4, class108.field1650, class236.field3800);
        int var7 = class197.method1264(-90, arg0, class108.field1650, class236.field3800);
        int var8 = class197.method1264(-127, arg5, class79.field1226, class59.field957);
        int var9 = class197.method1264(-93, arg3, class79.field1226, class59.field957);
        int var10 = var6;
        if (arg1 != -31) {
            method898((byte) -90);
        }
        while (var10 <= var7) {
            class36.method282(var9, var8, arg2, class256.field4113[var10], arg1 + 26206);
            var10++;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 101)
    public static final void method900(int arg0) {
        class264.method1733();
        field2192++;
        if (class295.field4900 != null) {
            class295.field4900.detach();
        }
        if (arg0 != 255) {
            field2190 = (byte[][][]) ((byte[][][]) null);
        }
        if (class182.field2880 != null) {
            class81.method555(class182.field2880, class220.field3533, 0);
        }
        class269.field4437 = 765;
        class264.field4306 = 765;
        class174.field2789 = 0;
        class131.field2000 = 503;
        class264.field4290 = 503;
        class182.field2880 = null;
        if (class119.field1822 != -1) {
            class25.method188((byte) 96, true);
        }
        if (class44.field660 != null) {
            class6.field149.method966(0, 94);
            class6.field149.method40(0, -66);
            class6.field149.method40(0, 97);
            class195.field3121++;
        }
        class291.method1929(arg0 ^ 0xFD);
    }
}
