import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class class277 {

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field4606 = 10;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "[[B")
    public static byte[][] field4608;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "[[[Lkk;")
    public static class72[][][] field4604;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIIIII)V", line = 5)
    public static final void method1909(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class192.field3172 <= arg7 && arg7 <= class77.field1289 && arg2 >= class192.field3172 && class77.field1289 >= arg2 && class192.field3172 <= arg9 && class77.field1289 >= arg9 && arg6 >= class192.field3172 && class77.field1289 >= arg6 && class206.field3398 <= arg5 && arg5 <= class214.field3533 && class206.field3398 <= arg3 && class214.field3533 >= arg3 && class206.field3398 <= arg8 && class214.field3533 >= arg8 && arg4 >= class206.field3398 && arg4 <= class214.field3533) {
            class102.method781((byte) 103, arg6, arg3, arg0, arg5, arg8, arg9, arg7, arg4, arg2);
        } else {
            class174.method1259(arg9, arg2, arg3, arg5, arg4, (byte) 106, arg8, arg7, arg6, arg0);
        }
        field4609++;
        if (arg1 != 1) {
            method1910((byte) -2);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 25)
    public static void method1910(byte arg0) {
        field4604 = (class72[][][]) null;
        field4608 = (byte[][]) null;
        if (arg0 != -37) {
            field4606 = -125;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BII)I", line = 42)
    public static final int method1911(byte arg0, int arg1, int arg2) {
        field4603++;
        if (arg0 < 34) {
            method1914(-60);
        }
        int var3 = arg1 - 1 & arg2 >> 31;
        return ((arg2 >>> 31) + arg2) % arg1 + var3;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIBIIII)V", line = 62)
    public static final void method1912(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field4610++;
        int var8 = -111 / ((-arg3 - 63) / 50);
        if (class192.field3172 <= arg6 && arg0 <= class77.field1289 && arg4 >= class206.field3398 && class214.field3533 >= arg2) {
            class162.method1141(arg0, arg6, arg5, arg2, arg4, arg7, arg1, 2047);
        } else {
            class78.method588(arg4, true, arg2, arg6, arg1, arg5, arg7, arg0);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lsm;Lsi;ILsi;)V", line = 86)
    public static final void method1913(class297 arg0, class66 arg1, int arg2, class66 arg3) {
        class44.field682 = arg3;
        class279.field4621 = arg1;
        field4607++;
        class255.field4260 = arg0;
        if (class44.field682 != null) {
            class145.field2356 = class44.field682.method517((byte) -126, 1);
        }
        if (arg2 != -32625) {
            field4604 = (class72[][][]) ((class72[][][]) null);
        }
        if (class279.field4621 != null) {
            class174.field2858 = class279.field4621.method517((byte) -126, 1);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)Lvf;", line = 105)
    public static final class33 method1914(int arg0) {
        field4605++;
        if (arg0 != 1) {
            method1911((byte) -84, -60, -115);
        }
        try {
            return (class33) Class.forName("aa").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class112();
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I")
    public abstract int method1399(int arg0);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method1398(byte arg0, Component arg1);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method1400(Component arg0, int arg1);
}
