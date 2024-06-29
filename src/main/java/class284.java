import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class284 {

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4604 = null;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field4606 = 0;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Lvl;")
    public static class73 field4610;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "[I")
    public static int[] field4603;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)I")
    public static final int method1947(int arg0, byte arg1) {
        field4607++;
        int var2 = (arg0 & 0xCB) >> 6;
        if (arg1 != -39) {
            method1949(-87, 52, (byte[]) null, -69);
        }
        int var3 = arg0 & 0x3F;
        if (var3 == 18) {
            if (var2 == 0) {
                return 1;
            }
            if (var2 == 1) {
                return 2;
            }
            if (var2 == 2) {
                return 4;
            }
            if (var2 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var2 == 0) {
                return 16;
            }
            if (var2 == 1) {
                return 32;
            }
            if (var2 == 2) {
                return 64;
            }
            if (var2 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static final void method1948(byte arg0) {
        while (true) {
            if (class175.field2763.method449(class262.field4252, 8) >= 11) {
                int var1 = class175.field2763.method439(124, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class35.field409[var1] == null) {
                        var2 = true;
                        class35.field409[var1] = new class1();
                        if (class291.field4687[var1] != null) {
                            class35.field409[var1].method11(false, class291.field4687[var1]);
                        }
                    }
                    class52.field745[class272.field4432++] = var1;
                    class1 var3 = class35.field409[var1];
                    var3.field3931 = class311.field4996;
                    int var4 = class195.field3091[class175.field2763.method439(103, 3)];
                    if (var2) {
                        var3.field3924 = var3.field3913 = var4;
                    }
                    int var5 = class175.field2763.method439(121, 5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class175.field2763.method439(126, 5);
                    int var7 = class175.field2763.method439(112, 1);
                    if (var7 == 1) {
                        class212.field3299[class140.field2016++] = var1;
                    }
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var8 = class175.field2763.method439(117, 1);
                    var3.method5(var8 == 1, 360000, class214.field3347.field3970[0] + var6, class214.field3347.field3972[0] + var5);
                    continue;
                }
            }
            class175.field2763.method440(7551);
            field4605++;
            int var9 = 26 / ((-arg0 - 64) / 35);
            return;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II[BI)I")
    public static final int method1949(int arg0, int arg1, byte[] arg2, int arg3) {
        int var4 = -1;
        field4609++;
        int var5 = arg1;
        if (arg3 > -109) {
            return -79;
        }
        while (var5 < arg0) {
            var4 = var4 >>> 8 ^ class111.field1604[(arg2[var5] ^ var4) & 0xFF];
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method1950(int arg0) {
        field4610 = null;
        field4603 = null;
        if (arg0 > -2) {
            field4610 = null;
        }
        field4604 = null;
    }
}
