import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class104 extends class247 {

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field1519 = 0;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field1515 = 0;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "[B")
    public static byte[] field1516 = new byte[32896];

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public int field1511;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public int field1517;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "Lfe;")
    public static class231 field1521;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Lvl;")
    public static class73 field1512;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "[[[B")
    public static byte[][][] field1520;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)Lhg;")
    public static final class162 method696(byte arg0, int arg1) {
        field1513++;
        class162 var2 = (class162) class164.field2542.method1517((long) arg1, (byte) -127);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class124.field1791.method501(arg0 + 24, class168.method1144(255, arg1), class108.method725(arg1, (byte) -107));
        class162 var4 = new class162();
        var4.field2475 = arg1;
        if (var3 != null) {
            var4.method1107(6274, new class170(var3));
        }
        var4.method1119(65536);
        if (var4.field2490 != -1) {
            var4.method1114(method696((byte) -26, var4.field2490), method696((byte) -26, var4.field2454), arg0 + 25);
        }
        if (var4.field2472 != -1) {
            var4.method1116(method696((byte) -26, var4.field2459), method696((byte) -26, var4.field2472), arg0 - 82);
        }
        if (!class254.field4154 && var4.field2478) {
            var4.field2423 = 0;
            var4.field2451 = false;
            var4.field2464 = class120.field1724;
            var4.field2432 = class161.field2408;
            var4.field2425 = class28.field352;
        }
        if (arg0 != -26) {
            field1519 = 59;
        }
        class164.field2542.method1518(var4, (long) arg1, (byte) 75);
        return var4;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
    public static void method697(byte arg0) {
        field1520 = null;
        field1512 = null;
        field1516 = null;
        if (arg0 == 124) {
            field1521 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
    public static final void method698(int arg0, int arg1) {
        field1514++;
        class181 var2 = class95.method652(arg1, (byte) 34, arg0);
        var2.method1283(192);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1516[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field1522 = -1;
    }
}
