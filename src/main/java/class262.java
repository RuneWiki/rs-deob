import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class262 extends class43 {

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public int field3371;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public int field3368;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "Z")
    public static boolean field3369 = false;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "S")
    public static short field3374 = 32767;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "[I")
    public static int[] field3370 = new int[32];

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "[[B")
    public static byte[][] field3375;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V", line = 6)
    public static void method1655(int arg0) {
        if (arg0 != -1) {
            method1655(-121);
        }
        field3370 = null;
        field3375 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)I", line = 19)
    public static final int method1656(int arg0, int arg1, int arg2) {
        if (arg0 < 51) {
            field3367 = 15;
        }
        if (arg2 > arg1) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        field3372++;
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V", line = 49)
    public static final void method1657(byte arg0) {
        field3376++;
        while (class215.field2658.method2170(class134.field1533, 7329) >= 11) {
            int var1 = class215.field2658.method2171(11, 110);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class212.field2584[var1] == null) {
                class212.field2584[var1] = new class131();
                class212.field2584[var1].field2445 = var1;
                var2 = true;
                if (class299.field3998[var1] != null) {
                    class212.field2584[var1].method847(class299.field3998[var1], -45);
                }
            }
            class304.field4083[class450.field6291++] = var1;
            class131 var3 = class212.field2584[var1];
            var3.field2427 = class106.field1273;
            int var4 = class215.field2658.method2171(1, 91);
            if (var4 == 1) {
                class332.field4530[class341.field4651++] = var1;
            }
            int var5 = class215.field2658.method2171(1, 92);
            int var6 = class148.field1731[class215.field2658.method2171(3, 78)];
            int var7 = class215.field2658.method2171(5, 85);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class215.field2658.method2171(5, 75);
            if (var8 > 15) {
                var8 -= 32;
            }
            if (var2) {
                var3.method1254((byte) 22, var6);
            }
            var3.method842(var5 == 1, class143.field1684.field2480[0] + var8, (byte) 125, class43.field513, class143.field1684.field2482[0] + var7);
        }
        if (arg0 < 75) {
            field3375 = null;
        }
        class215.field2658.method2168(68);
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(II)V", line = 124)
    public class262(int arg0, int arg1) {
        this.field3371 = arg1;
        this.field3368 = arg0;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I", line = 133)
    public static int method1658(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
