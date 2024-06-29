import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class146 {

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Lvd;")
    public static class15 field2555 = new class15();

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field2557 = 0;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field2558 = 0;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "Lsb;")
    private static class98 field2559 = class47.method368("Type", 0);

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field2560 = 0;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "Lsb;")
    public static class98 field2564 = class47.method368("headicons_pk", 0);

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Lsb;")
    public static class98 field2561 = field2559;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public int field2552;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public int field2554;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public int field2566;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "Lbd;")
    public static class22 field2562;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "[I")
    public static int[] field2565;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Lsb;")
    public static final class98 method1078(int arg0, int arg1) {
        field2553++;
        if (arg1 <= 31) {
            method1078(-115, 35);
        }
        return class186.method1288(new class98[] { class125.method930(25904, arg0 >> 24 & 0xFF), class41.field672, class125.method930(25904, arg0 >> 16 & 0xFF), class41.field672, class125.method930(25904, (arg0 & 0xFFDA) >> 8), class41.field672, class125.method930(25904, arg0 & 0xFF) }, 31618);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method1079(int arg0) {
        if (arg0 <= 34) {
            field2563 = -44;
        }
        field2565 = null;
        field2564 = null;
        field2555 = null;
        field2561 = null;
        field2562 = null;
        field2559 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([BIII)I")
    public static final int method1080(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 255) {
            return -17;
        }
        field2556++;
        int var4 = -1;
        for (int var5 = arg1; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class260.field4572[(arg0[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }
}
