import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class class248 {

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "Lha;")
    public static class46 field4379 = class271.method1828("(U0a )2 in: ", -46);

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "[Ldd;")
    public static class67[] field4380 = new class67[4];

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "Lha;")
    public static class46 field4384 = class271.method1828("(Z", -46);

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "[I")
    public static int[] field4385 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field4383 = 0;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "Lha;")
    public static class46 field4386 = class271.method1828("gr-Un:", -46);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZLvd;)V")
    public static final void method1684(boolean arg0, class141 arg1) {
        if (class157.field2803 == arg1.field2587 || arg1.field2575 == -1 || arg1.field2533 != 0 || (arg1.field2570 + 1) > class119.method951(0, arg1.field2575).field3040[arg1.field2579]) {
            int var2 = arg1.field2587 - arg1.field2576;
            int var3 = class157.field2803 - arg1.field2576;
            int var4 = arg1.field2534 * 128 + arg1.method642(48) * 64;
            int var5 = arg1.field2527 * 128 + (arg1.method642(78) * 64);
            int var6 = arg1.field2513 * 128 + arg1.method642(118) * 64;
            int var7 = arg1.field2536 * 128 + arg1.method642(120) * 64;
            arg1.field2546 = ((var2 - var3) * var5 + var3 * var7) / var2;
            arg1.field2585 = ((var2 - var3) * var4 + var3 * var6) / var2;
        }
        if (arg1.field2514 == 0) {
            arg1.field2526 = 1024;
        }
        arg1.field2552 = 0;
        if (!arg0) {
            field4384 = null;
        }
        if (arg1.field2514 == 1) {
            arg1.field2526 = 1536;
        }
        if (arg1.field2514 == 2) {
            arg1.field2526 = 0;
        }
        if (arg1.field2514 == 3) {
            arg1.field2526 = 512;
        }
        arg1.field2535 = arg1.field2526;
        field4377++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZ)I")
    public abstract int method1570(int arg0, boolean arg1);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)Ld;")
    public static final class130 method1685(int arg0, int arg1) {
        field4381++;
        class130 var2 = (class130) class89.field1689.method1364((long) arg1, -21987);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class259.field4519.method1293(arg1 & 0x7FFF, 0, (byte) -105);
        } else {
            var3 = class29.field561.method1293(arg1, 0, (byte) 107);
        }
        class130 var4 = new class130();
        if (arg0 <= 8) {
            method1686(101, -17, -50, -42, -32, 117, 66, 99);
        }
        if (var3 != null) {
            var4.method1010(-119, new class75(var3));
        }
        if (arg1 >= 32768) {
            var4.method1013(88);
        }
        class89.field1689.method1366(true, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)Ljf;")
    public abstract class8 method1572(byte arg0);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class135.field2445 <= arg3 && class73.field1309 >= arg4 && arg7 >= class4.field70 && arg6 <= class70.field1205) {
            class206.method1457(arg3, arg4, arg5, arg1, true, arg6, arg7, arg0);
        } else {
            class47.method354(arg0, arg5, arg7, (byte) -79, arg4, arg1, arg3, arg6);
        }
        field4376++;
        if (arg2 != 2) {
            field4380 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)[B")
    public abstract byte[] method1577(int arg0, int arg1);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static void method1687(int arg0) {
        field4384 = null;
        field4380 = null;
        field4385 = null;
        int var1 = 9 % ((-arg0 - 22) / 50);
        field4379 = null;
        field4386 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)V")
    public abstract void method1580(int arg0, byte arg1);
}
