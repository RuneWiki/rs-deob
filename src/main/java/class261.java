import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class261 {

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "[Lnl;")
    public static class98[] field4126 = new class98[0];

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "J")
    public static long field4125;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)Z")
    public static final boolean method1748(int arg0) {
        if (arg0 != 4) {
            method1748(-32);
        }
        field4122++;
        if (class62.field983) {
            try {
                if ((Boolean) class289.method1926(true, "showingVideoAd", class123.field1863.field63)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)Loe;")
    public static final class147 method1749(int arg0, int arg1) {
        field4124++;
        class147 var2 = (class147) class247.field3923.method1361((byte) -95, (long) arg1);
        int var3 = 59 % ((-arg0 - 68) / 42);
        if (var2 != null) {
            return var2;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = class184.field2902.method721((byte) -117, 1, arg1 & 0x7FFF);
        } else {
            var4 = class288.field4500.method721((byte) -117, 1, arg1);
        }
        class147 var5 = new class147();
        if (var4 != null) {
            var5.method1066(new class31(var4), 0);
        }
        if (arg1 >= 32768) {
            var5.method1069(-30);
        }
        class247.field3923.method1365((long) arg1, (byte) 13, var5);
        return var5;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
    public static final void method1750(int arg0) {
        class194.field3039 = null;
        class41.field692 = null;
        field4123++;
        int var1 = -123 % ((13 - arg0) / 61);
        class2.field41 = null;
        class49.field808 = null;
        class278.field4416 = null;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V")
    public static void method1751(int arg0) {
        field4126 = null;
        if (arg0 != -46) {
            field4125 = -59L;
        }
    }
}
