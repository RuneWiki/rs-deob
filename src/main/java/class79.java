import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class79 extends class12 {

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field1497 = 0;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "[Z")
    public static boolean[] field1496 = new boolean[8];

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "Lvf;")
    public static class265 field1504 = class87.method582(-46, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field1500 = 0;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "Lvf;")
    public static class265 field1506 = class87.method582(-46, "details");

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "Lvf;")
    public static class265 field1508 = class87.method582(-46, "lila:");

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public static int field1510 = 100;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public int field1498;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public int field1499;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public int field1505;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZI)I")
    public static final int method546(boolean arg0, int arg1) {
        field1495++;
        long var2 = class136.method950(8954);
        if (arg1 != -1) {
            return 3;
        }
        for (class170 var4 = arg0 ? (class170) class150.field2779.method1851(false) : (class170) class150.field2779.method1847(false); var4 != null; var4 = (class170) class150.field2779.method1847(false)) {
            if (var2 > (var4.field3069 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field3069 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field393;
                    class256.field4385[var5] = class182.field3228[var5];
                    var4.method97(arg1 ^ 0xFFFFFF61);
                    return var5;
                }
                var4.method97(arg1 ^ 0xFFFFFF61);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)I")
    public static final int method547(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 243) {
            arg0 >>= 0x4;
        } else if (arg2 > 217) {
            arg0 >>= 0x3;
        } else if (arg2 > 192) {
            arg0 >>= 0x2;
        } else if (arg2 > 179) {
            arg0 >>= 0x1;
        }
        if (arg3 != 0) {
            field1497 = 80;
        }
        field1494++;
        return (arg2 >> 1) + (arg0 >> 5 << 7) + (arg1 >> 2 << 10);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lgk;B)Z")
    public static final boolean method548(class6 arg0, byte arg1) {
        field1507++;
        if (arg0.field234 == null) {
            return false;
        }
        if (arg1 <= 72) {
            method550(48, -104);
        }
        for (int var2 = 0; var2 < arg0.field234.length; var2++) {
            int var3 = class26.method233((byte) -16, var2, arg0);
            int var4 = arg0.field177[var2];
            if (arg0.field234[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field234[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field234[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)I")
    public static final int method549(boolean arg0) {
        if (arg0) {
            field1501++;
            return 2;
        } else {
            return -77;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)Z")
    public static final boolean method550(int arg0, int arg1) {
        field1509++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            int var2 = 107 % ((arg1 - 87) / 33);
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILjava/lang/String;)Lvf;")
    public static final class265 method551(int arg0, String arg1) {
        field1503++;
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg1.getBytes();
        }
        class265 var3 = new class265();
        var3.field4640 = 0;
        var3.field4643 = var2;
        if (arg0 >= -37) {
            field1506 = null;
        }
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field4640++] = var2[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIBJ)Z")
    public static final boolean method552(int arg0, int arg1, byte arg2, long arg3) {
        field1502++;
        int var5 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        int var6 = ((int) arg3 & 0x7C5A9) >> 14;
        int var7 = ((int) arg3 & 0x34C02F) >> 20;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class130 var8 = class84.method574(94, var5);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var9 = var8.field2328;
                var10 = var8.field2309;
            } else {
                var9 = var8.field2309;
                var10 = var8.field2328;
            }
            int var11 = var8.field2291;
            if (var7 != 0) {
                var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
            }
            class217.method1496(0, arg1, class214.field3827.field2536[0], 10396, 2, true, 0, var10, var9, var11, class214.field3827.field2575[0], arg0);
        } else {
            class217.method1496(var7, arg1, class214.field3827.field2536[0], 10396, 2, true, var6 + 1, 0, 0, 0, class214.field3827.field2575[0], arg0);
        }
        class141.field2615 = 2;
        if (arg2 != -12) {
            field1497 = 46;
        }
        class277.field4905 = 0;
        class162.field2944 = class122.field2193;
        class95.field1681 = class192.field3427;
        return true;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V")
    public static void method553(int arg0) {
        field1504 = null;
        field1508 = null;
        field1506 = null;
        if (arg0 != -123) {
            field1504 = null;
        }
        field1496 = null;
    }
}
