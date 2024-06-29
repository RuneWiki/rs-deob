import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class206 {

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Z")
    public static boolean field3488 = false;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "Lmh;")
    public static class62 field3496 = class201.method1405(true, " )2> ");

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "[[[I")
    public static int[][][] field3491 = new int[2][][];

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field3490 = -1;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static volatile int field3487 = 0;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "Lmh;")
    public static class62 field3503 = class201.method1405(true, "cookiehost");

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "J")
    public long field3499;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Lai;")
    public class206 field3492;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "Lai;")
    public class206 field3495;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "[I")
    public static int[] field3494;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "[[[B")
    public static byte[][][] field3502;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V", line = 11)
    public final void method1444(byte arg0) {
        field3497++;
        if (this.field3495 == null) {
            return;
        }
        this.field3495.field3492 = this.field3492;
        if (arg0 == 89) {
            this.field3492.field3495 = this.field3495;
            this.field3492 = null;
            this.field3495 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V", line = 35)
    public static final void method1445(byte arg0) {
        if (arg0 == 2) {
            class229.field3984.method1395((byte) -43);
            field3493++;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IBI)V", line = 47)
    public static final void method1446(int arg0, byte arg1, int arg2) {
        int var3 = -31 / ((arg1 - 25) / 63);
        field3504++;
        class151 var4 = class165.method1194((byte) 1, 12, arg2);
        var4.method1088(126);
        var4.field2395 = arg0;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)V", line = 67)
    public static void method1447(byte arg0) {
        field3494 = null;
        field3491 = (int[][][]) null;
        if (arg0 > -64) {
            method1445((byte) -72);
        }
        field3502 = (byte[][][]) null;
        field3496 = null;
        field3503 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)Z", line = 85)
    public final boolean method1448(int arg0) {
        field3486++;
        if (arg0 != -6543) {
            field3494 = (int[]) null;
        }
        return this.field3495 != null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZIIIIZ)V", line = 117)
    public static final void method1449(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg0) {
            method1449(false, -13, 60, 29, -95, true);
        }
        int var6 = arg1 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = class129.field2115 + ((class244.field4154 - class129.field2115) * var6 / 100);
        if (class245.field4164 > var7) {
            var7 = class245.field4164;
        } else if (var7 > class171.field2780) {
            var7 = class171.field2780;
        }
        int var8 = arg1 * 512 * var7 / (arg2 * 334);
        if (class287.field4905 > var8) {
            short var9 = class287.field4905;
            var7 = var9 * 334 * arg2 / (arg1 * 512);
            if (class171.field2780 < var7) {
                var7 = class171.field2780;
                int var10 = var7 * 512 * arg1 / (var9 * 334);
                int var11 = (arg2 - var10) / 2;
                if (arg5) {
                    class311.method2110();
                    class311.method2117(arg4, arg3, var11, arg1, 0);
                    class311.method2117(arg4 + arg2 - var11, arg3, var11, arg1, 0);
                }
                arg4 += var11;
                arg2 -= var11 * 2;
            }
        } else if (var8 > class268.field4558) {
            short var12 = class268.field4558;
            var7 = arg2 * var12 * 334 / (arg1 * 512);
            if (class245.field4164 > var7) {
                var7 = class245.field4164;
                int var13 = arg2 * var12 * 334 / (var7 * 512);
                int var14 = (arg1 - var13) / 2;
                if (arg5) {
                    class311.method2110();
                    class311.method2117(arg4, arg3, arg2, var14, 0);
                    class311.method2117(arg4, arg1 + arg3 - var14, arg2, var14, 0);
                }
                arg1 -= var14 * 2;
                arg3 += var14;
            }
        }
        class195.field3287 = arg1 * var7 / 334;
        class182.field2898 = arg3;
        field3501++;
        class102.field1673 = (short) arg1;
        class199.field3370 = (short) arg2;
        class254.field4318 = arg4;
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)V", line = 207)
    public static final void method1450(byte arg0) {
        class301.method2064(48, 5);
        field3500++;
        class120.method927(7, 5);
        class35.method225(5, (byte) -105);
        class219.method1566((byte) 58, 5);
        class187.method1312(5, 4433);
        class252.method1756(-4, 5);
        class150.method1078(5, -77);
        class182.method1281((byte) -76, 5);
        class244.method1711((byte) -45, 5);
        class31.method201(-22019, 5);
        class146.method1068(5, (byte) 122);
        class85.method650(true, 50);
        class184.method1290((byte) 69, 5);
        if (arg0 >= -126) {
            method1449(true, -91, 121, 113, -56, true);
        }
        class30.method197(-124, 5);
        class102.field1688.method1390(5, -87);
    }
}
