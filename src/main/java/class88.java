import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class88 {

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "[Lwa;")
    public static class75[] field1455 = new class75[100];

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "[I")
    public static int[] field1457 = new int[256];

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Lwa;")
    private static class75 field1458 = class66.method560("Please wait )2 attempting to reestablish)3", false);

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1460 = -1;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lwa;")
    public static class75 field1462 = class66.method560(":duelfriend:", false);

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Lwa;")
    public static class75 field1461 = field1458;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "[I")
    public static int[] field1459;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1457[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILcb;II)[Lje;", line = 9)
    public static final class68[] method703(int arg0, class267 arg1, int arg2, int arg3) {
        field1456++;
        if (arg2 != 1) {
            method704((byte) -91);
        }
        return class281.method1994(arg3, (byte) -7, arg0, arg1) ? class152.method1161(arg2 ^ 0x1) : null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 35)
    public static void method704(byte arg0) {
        int var1 = -17 % ((arg0 - 80) / 42);
        field1462 = null;
        field1457 = null;
        field1461 = null;
        field1459 = null;
        field1455 = null;
        field1458 = null;
    }
}
