import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 {

    @OriginalMember(owner = "client!a", name = "b", descriptor = "[I")
    public static int[] field2 = new int[32];

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Lv;")
    public static class146 field5 = class159.method1226((byte) -37, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!a", name = "g", descriptor = "[[S")
    public static short[][] field7 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Lv;")
    private static class146 field10;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Lv;")
    public static class146 field9;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "Lv;")
    private static class146 field15;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "[I")
    public static int[] field14;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Lv;")
    public static class146 field12;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Lv;")
    public static class146 field13;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Luf;")
    public static class145 field8;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1++;
        int var7 = arg0 & 0x3;
        if (arg3 != -16127) {
            field14 = null;
        }
        if ((arg2 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg4;
            arg4 = var8;
        }
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return arg6;
        } else if (var7 == 2) {
            return 7 + 1 - arg5 - arg1;
        } else {
            return 7 + 1 - arg4 - arg6;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIZI)Lie;")
    public static final class61 method2(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field4++;
        long var6 = ((long) arg2 << 40) + ((long) arg0 << 16) + ((long) arg1 << 38) + (long) arg5;
        if (!arg4) {
            class61 var8 = (class61) class72.field1674.method1045(var6, arg3 ^ 0x5B);
            if (var8 != null) {
                return var8;
            }
        }
        class59 var9 = class73.method524((byte) 107, arg5);
        if (arg0 > 1 && var9.field1327 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg0 >= var9.field1362[var11] && var9.field1362[var11] != 0) {
                    var10 = var9.field1327[var11];
                }
            }
            if (var10 != -1) {
                var9 = class73.method524((byte) 82, var10);
            }
        }
        class139 var12 = var9.method403((byte) 120, 1);
        if (var12 == null) {
            return null;
        }
        class61 var13 = null;
        if (var9.field1333 != -1) {
            var13 = method2(10, 1, 0, 32, true, var9.field1353);
            if (var13 == null) {
                return null;
            }
        }
        int var14 = class56.field1265;
        int var15 = class56.field1264;
        int[] var16 = new int[4];
        int[] var17 = class56.field1269;
        class56.method379(var16);
        class61 var18 = new class61(36, arg3);
        class56.method389(var18.field1411, 36, 32);
        class56.method374();
        class45.method304();
        class45.method303(16, 16);
        int var19 = var9.field1339;
        if (arg4) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg1 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        class45.field1036 = false;
        int var20 = class45.field1032[var9.field1319] * var19 >> 16;
        int var21 = class45.field1030[var9.field1319] * var19 >> 16;
        var12.method1031();
        var12.method1036(0, var9.field1313, var9.field1312, var9.field1319, var9.field1315, var12.field1488 / 2 + var9.field1325 + var21, var9.field1325 + var20);
        if (arg1 >= 1) {
            var18.method436(1);
        }
        if (arg1 >= 2) {
            var18.method436(16777215);
        }
        if (arg2 != 0) {
            var18.method431(arg2);
        }
        class56.method389(var18.field1411, 36, 32);
        if (var9.field1333 != -1) {
            var13.method423(0, 0);
        }
        if (!arg4 && (var9.field1344 == 1 || arg0 != 1) && arg0 != -1) {
            class68.field1552.method827(class49.method341(-124, arg0), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            class72.field1674.method1047(arg3 - 33, var18, var6);
        }
        class56.method389(var17, var14, var15);
        class56.method380(var16);
        class45.method304();
        class45.field1036 = true;
        return var18;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIILla;)Z")
    public static final boolean method3(int arg0, int arg1, int arg2, class77 arg3) {
        if (arg2 > -84) {
            method2(-16, -12, 53, 106, false, 51);
        }
        byte[] var4 = arg3.method585(arg0, 109, arg1);
        field6++;
        if (var4 == null) {
            return false;
        } else {
            class113.method883(var4, (byte) 123);
            return true;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method4(int arg0) {
        field14 = null;
        field5 = null;
        field2 = null;
        if (arg0 != 2) {
            field5 = null;
        }
        field13 = null;
        field10 = null;
        field12 = null;
        field7 = null;
        field9 = null;
        field8 = null;
        field15 = null;
        field3 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2[var1] = var0 - 1;
            var0 += var0;
        }
        field11 = 0;
        field10 = class159.method1226((byte) -37, "Existing User");
        field9 = field10;
        field15 = class159.method1226((byte) -37, "Sorry invited players only)3");
        field14 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field12 = field15;
        field13 = class159.method1226((byte) -37, "titlebutton");
        field16 = 0;
    }
}
