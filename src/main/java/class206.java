import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class206 {

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "Luf;")
    public static class168 field3385 = class148.method1019(-1720, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Luf;")
    public static class168 field3386 = class148.method1019(-1720, "http:)4)4");

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field3384 = 0;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Luf;")
    public static class168 field3380 = class148.method1019(-1720, "gr-Un:");

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lkb;")
    public static class80 field3383 = new class80(4096);

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "[I")
    public static int[] field3389 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V", line = 23)
    public static void method1437(byte arg0) {
        field3389 = null;
        if (arg0 < -88) {
            field3383 = null;
            field3385 = null;
            field3386 = null;
            field3380 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lwi;BLdk;Ldk;)V", line = 37)
    public static final void method1438(class235 arg0, byte arg1, class241 arg2, class241 arg3) {
        field3388++;
        class105.field1627 = arg0;
        class200.field3300 = arg2;
        int var4 = 15 / ((-arg1 - 36) / 43);
        class165.field2637 = arg3;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIB)I", line = 60)
    public static final int method1439(int arg0, int arg1, byte arg2) {
        field3382++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg0 >>= 0x1;
        }
        if (arg2 > -61) {
            method1437((byte) -28);
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }
}
