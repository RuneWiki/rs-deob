import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class447 {

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field6459 = 0;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public static int field6461 = -1;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "Leda;")
    public static class116 field6457 = null;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIII)V")
    public static final void method2605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6463++;
        int var6 = class367.method2203(class198.field3084, class627.field8931, arg2, true);
        int var7 = class367.method2203(class198.field3084, class627.field8931, arg4, true);
        int var8 = class367.method2203(class512.field7620, class94.field1398, arg1, true);
        int var9 = class367.method2203(class512.field7620, class94.field1398, arg5, true);
        int var10 = var6;
        if (arg3 > -11) {
            field6457 = null;
        }
        while (var10 <= var7) {
            class223.method1484(class657.field9275[var10], var9, -81, arg0, var8);
            var10++;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lek;I)Lpaa;")
    public static final class580 method2606(class465 arg0, int arg1) {
        field6460++;
        class199 var2 = class686.method3871(-23878, arg0);
        int var3 = arg0.method2744(arg1);
        return new class580(var2.field8302, var2.field8299, var2.field8301, var2.field8295, var2.field8300, var2.field8291, var2.field8293, var2.field8294, var2.field8297, var2.field3088, var2.field3089, var2.field3086, var2.field3097, var2.field3092, var2.field3094, var3);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "([BB)[B")
    public static final byte[] method2607(byte[] arg0, byte arg1) {
        field6458++;
        class465 var2 = new class465(arg0);
        if (arg1 <= 35) {
            field6461 = -20;
        }
        int var3 = var2.method2705(-69);
        int var4 = var2.method2691((byte) -67);
        if (var4 < 0 || !(class193.field2989 == 0 || var4 <= class193.field2989)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var8 = new byte[var4];
            var2.method2750(var8, -107, var4, 0);
            return var8;
        } else {
            int var5 = var2.method2691((byte) -67);
            if (var5 < 0 || !(class193.field2989 == 0 || class193.field2989 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class245.method1580(var6, var5, arg0, var4, 9);
            } else {
                class168 var7 = class544.field7991;
                synchronized (class544.field7991) {
                    class544.field7991.method1264(var6, -32, var2);
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V")
    public static void method2608(byte arg0) {
        field6457 = null;
        int var1 = 16 / ((43 - arg0) / 61);
    }
}
