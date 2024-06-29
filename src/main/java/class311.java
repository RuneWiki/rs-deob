import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class311 {

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[J")
    public static long[] field5298 = new long[256];

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field5301 = 0;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "Lmc;")
    public static class170 field5302;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "Lvd;")
    public static class126 field5306;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Lcb;")
    public static class267 field5303;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5305;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "[Lhf;")
    public static class189[] field5295;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)I", line = 10)
    public static final int method2112(int arg0, int arg1, int arg2) {
        int var3 = 1;
        field5297++;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg1 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            int var4 = -64 / ((-arg0 - 38) / 47);
            return var3;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V", line = 44)
    public static void method2113(byte arg0) {
        field5298 = null;
        field5302 = null;
        field5306 = null;
        field5305 = null;
        field5295 = null;
        field5303 = null;
        int var1 = 38 / ((-arg0 - 13) / 42);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field5298[var0] = var1;
        }
        field5302 = new class170();
    }
}
