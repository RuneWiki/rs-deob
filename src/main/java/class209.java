import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class209 {

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field3298 = 0;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "J")
    public static long field3302 = 0L;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "Lgd;")
    public static class325 field3303 = new class325(4);

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3304 = "red:";

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "Lle;")
    public static class260 field3305 = new class260(5000);

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "[[[B")
    public static byte[][][] field3299;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V", line = 9)
    public static final void method1531(byte arg0) {
        class102.method830(0, 14804, 0);
        field3297++;
        if (arg0 != 44) {
            field3299 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 28)
    public static final void method1532(int arg0) {
        while (true) {
            if (class80.field1248.method1799(class128.field2060, (byte) -127) >= 11) {
                int var1 = class80.field1248.method1800(-58, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class74.field1140[var1] == null) {
                        class74.field1140[var1] = new class92();
                        if (class282.field4419[var1] != null) {
                            class74.field1140[var1].method731(-20812, class282.field4419[var1]);
                        }
                        var2 = true;
                    }
                    class325.field5068[class45.field703++] = var1;
                    class92 var3 = class74.field1140[var1];
                    var3.field4673 = class307.field4869;
                    int var4 = class80.field1248.method1800(-35, 1);
                    int var5 = class80.field1248.method1800(112, 5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class309.field4890[class80.field1248.method1800(arg0 + 12079, 3)];
                    if (var2) {
                        var3.field4630 = var3.field4682 = var6;
                    }
                    int var7 = class80.field1248.method1800(-37, 1);
                    if (var7 == 1) {
                        class251.field3708[class88.field1420++] = var1;
                    }
                    int var8 = class80.field1248.method1800(114, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method736(class345.field5363.field4619[0] + var8, -2436, class345.field5363.field4643[0] + var5, var4 == 1);
                    continue;
                }
            }
            field3300++;
            if (arg0 != -12147) {
                return;
            }
            class80.field1248.method1801((byte) -100);
            return;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IJZ)V", line = 94)
    public static final void method1533(int arg0, long arg1, boolean arg2) {
        field3293++;
        if (arg1 == 0L) {
            return;
        }
        if (class321.field5024 >= 100) {
            class129.method1003(0, class245.field3659, "", 45);
            return;
        }
        String var4 = class150.method1134(arg0 ^ 0xFFFFFFD1, arg1);
        for (int var5 = 0; var5 < class321.field5024; var5++) {
            if (class158.field2587[var5] == arg1) {
                class129.method1003(0, var4 + class204.field3178, "", 98);
                return;
            }
        }
        for (int var6 = arg0; var6 < class172.field2763; var6++) {
            if (class130.field2080[var6] == arg1) {
                class129.method1003(0, class11.field257 + var4 + class137.field2238, "", arg0 ^ 0x3C);
                return;
            }
        }
        if (var4.equals(class345.field5363.field1486)) {
            class129.method1003(0, class253.field3729, "", 67);
            return;
        }
        class154.field2505++;
        class158.field2587[class321.field5024] = arg1;
        class197.field3030[class321.field5024] = class332.method2332(class85.method677(arg0, -31648), arg1);
        class176.field2817[class321.field5024++] = arg2;
        class11.field254 = class200.field3060;
        field3305.method1808((byte) -74, 35);
        field3305.method59(arg1, false);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V", line = 159)
    public static final void method1534(int arg0, int arg1) {
        field3295++;
        class32.field496 = -1;
        class67.field1013 = arg0;
        class32.field496 = -1;
        if (arg1 >= 72) {
            class344.method2385((byte) 25);
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)V", line = 173)
    public static void method1535(byte arg0) {
        field3299 = (byte[][][]) null;
        field3304 = null;
        field3305 = null;
        field3303 = null;
        int var1 = 45 % ((-arg0 - 78) / 32);
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)Ljava/lang/String;", line = 189)
    public static final String method1536(int arg0, int arg1) {
        field3301++;
        return arg0 <= arg1 ? "*" : Integer.toString(arg1);
    }
}
