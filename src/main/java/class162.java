import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class162 {

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Lne;")
    public static class235 field2563 = new class235(4);

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "J")
    public static long field2567 = 0L;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field2566 = 0;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field2568 = -1;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static volatile int field2569 = 0;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V", line = 6)
    public static void method1084(byte arg0) {
        field2563 = null;
        int var1 = 19 % ((-arg0 - 29) / 55);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLqc;)I", line = 20)
    public static final int method1085(boolean arg0, class4 arg1) {
        field2570++;
        class242 var2 = arg1.field72;
        if (var2.field4011 != null) {
            var2 = var2.method1650(4);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field3987;
        class251 var4 = arg1.method1706((byte) 76);
        if (arg0) {
            method1084((byte) -106);
        }
        if (arg1.field4224 == var4.field4310) {
            var3 = var2.field3959;
        } else if (arg1.field4224 == var4.field4286 || arg1.field4224 == var4.field4301 || arg1.field4224 == var4.field4296 || arg1.field4224 == var4.field4303) {
            var3 = var2.field3999;
        } else if (arg1.field4224 == var4.field4280 || arg1.field4224 == var4.field4307 || arg1.field4224 == var4.field4282 || arg1.field4224 == var4.field4318) {
            var3 = var2.field3993;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILwm;)I", line = 58)
    public static final int method1086(int arg0, class152 arg1) {
        field2565++;
        return arg0 == -1 ? arg1.method1000(0) + 1 : 127;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIII)V", line = 69)
    public static final void method1087(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != 1) {
            return;
        }
        if (arg4 >= class308.field5283 && class238.field3902 >= arg7 && class157.field2505 <= arg2 && arg3 <= class110.field1553) {
            class45.method309(arg4, arg0 ^ 0xFFFFFFFE, arg3, arg7, arg6, arg5, arg1, arg2);
        } else {
            class297.method2047(arg6, -125, arg2, arg1, arg3, arg4, arg5, arg7);
        }
        field2564++;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)Lfk;", line = 94)
    public static final class45 method1088(int arg0, byte arg1) {
        field2562++;
        if (arg1 < 110) {
            return (class45) null;
        }
        class45 var2 = (class45) class203.field3275.method1663((long) arg0, (byte) -118);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class183.field2918.method1381(11, arg0, 0);
        class45 var4 = new class45();
        if (var3 != null) {
            var4.method311((byte) -66, new class291(var3));
        }
        class203.field3275.method1662(var4, (long) arg0, -106);
        return var4;
    }
}
