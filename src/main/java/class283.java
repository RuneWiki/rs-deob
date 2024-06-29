import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class283 {

    @OriginalMember(owner = "client!of", name = "e", descriptor = "J")
    public long field4373 = 0L;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "[I")
    public static int[] field4380 = new int[100];

    @OriginalMember(owner = "client!of", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4379 = "purple:";

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Lqf;")
    public static class311 field4383 = new class311(16);

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field4389 = 0;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "Z")
    public static boolean field4390 = false;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public int field4370;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public int field4371;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public int field4374;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public int field4375;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public int field4377;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public int field4378;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public int field4381;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Lgh;")
    public class248 field4382;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "Lgh;")
    public class248 field4384;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "Lug;")
    public static class253 field4386;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2005(int arg0) {
        field4372++;
        class194.method1436((byte) 126);
        class11.method134(15088);
        class221.method1621(-12931);
        class101.method703((byte) -13);
        class297.method2072((byte) -5);
        class206.method1521(-123);
        class55.method439(-70);
        class136.method992(false);
        class316.method2209((byte) 126);
        method2010(-22305);
        class334.method2324(arg0 ^ 0xFFFF9875);
        class110.method790((byte) 118);
        class130.method963(arg0 - 26549);
        class197.method1459((byte) 89);
        class182.method1336(arg0 - 50755);
        class15.method145((byte) 109);
        class340.method2359(98);
        class81.method593(32010);
        if (class107.field1430 != 0) {
            for (int var1 = 0; var1 < class311.field4868.length; var1++) {
                class311.field4868[var1] = null;
            }
            class211.field3335 = 0;
        }
        class253.method1839(false);
        class205.method1507(true);
        class339.field5284.method1359(75);
        if (!class109.field1458) {
            ((class57) class31.field466).method463(false);
        }
        class39.field558.method1630(false);
        class145.field2293.method1827(arg0 ^ 0x67B5);
        class78.field1051.method1827(0);
        class237.field3716.method1827(0);
        class18.field301.method1827(0);
        class290.field4476.method1827(0);
        class249.field3913.method1827(arg0 ^ 0x67B5);
        class171.field2826.method1827(arg0 ^ arg0);
        class256.field4042.method1827(0);
        class138.field2208.method1827(0);
        class175.field2873.method1827(0);
        class206.field3258.method1827(arg0 - 26549);
        class84.field1148.method1359(104);
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V", line = 63)
    public static void method2006(int arg0) {
        if (arg0 <= 52) {
            method2006(-52);
        }
        field4380 = null;
        field4383 = null;
        field4386 = null;
        field4379 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZIII)I", line = 85)
    public static final int method2007(boolean arg0, int arg1, int arg2, int arg3) {
        field4388++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else {
            if (arg0) {
                method2007(false, -107, 24, 125);
            }
            return 1023 - arg2;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V", line = 108)
    public static final void method2008(boolean arg0) {
        int var1 = class270.field4197.method2254(class232.field3623);
        for (int var2 = 0; var2 < class78.field1046; var2++) {
            int var3 = class270.field4197.method2254(class207.method1525(8, var2));
            if (var1 < var3) {
                var1 = var3;
            }
        }
        var1 += 8;
        field4387++;
        int var4 = class78.field1046 * 15 + 21;
        int var5 = class215.field3387 - (var1 / 2);
        if ((var1 + var5) > class127.field1841) {
            var5 = class127.field1841 - var1;
        }
        int var6 = class57.field812;
        if (var5 < 0) {
            var5 = 0;
        }
        if ((var4 + var6) > class95.field1258) {
            var6 = class95.field1258 - var4;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class163.field2645 == 1) {
            if (class337.field5281 == class215.field3387 && class57.field812 == class57.field808) {
                class163.field2645 = 0;
                class238.field3729 = true;
                class95.field1264 = (class334.field5196 ? 26 : 22) + class78.field1046 * 15;
                class281.field4343 = var6;
                class138.field2197 = var1;
                class295.field4575 = var5;
            }
        } else if (class215.field3387 == class205.field3256 && class57.field812 == class271.field4207) {
            class281.field4343 = var6;
            class295.field4575 = var5;
            class163.field2645 = 0;
            class238.field3729 = true;
            class138.field2197 = var1;
            class95.field1264 = (class334.field5196 ? 26 : 22) + class78.field1046 * 15;
        } else {
            class337.field5281 = class205.field3256;
            class163.field2645 = 1;
            class57.field808 = class271.field4207;
        }
        if (!arg0) {
            method2008(false);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IBIII)V", line = 199)
    public static final void method2009(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 100) {
            method2007(true, -48, -100, 37);
        }
        if (class291.field4490 <= arg0 && arg0 <= class210.field3309) {
            int var5 = class171.method1280(class42.field579, (byte) -7, class334.field5205, arg2);
            int var6 = class171.method1280(class42.field579, (byte) -7, class334.field5205, arg3);
            class47.method362(128, var6, var5, arg4, arg0);
        }
        field4369++;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V", line = 238)
    private static final void method2010(int arg0) {
        field4385++;
        if (arg0 == -22305) {
            class62.field913.method1359(113);
        }
    }
}
