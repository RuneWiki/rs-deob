import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class466 {

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field6729 = 16777215;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "Leda;")
    public static class116 field6727 = new class116(51, 8);

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "Lvh;")
    public static class125 field6732 = new class125(25, 3);

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "Z")
    public static boolean field6734 = false;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "B")
    public static byte field6730;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "Lvo;")
    public static class345 field6733;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBIIIIIII)V")
    public static final void method2756(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class45.method362(1, arg3, arg2, arg8, arg4, arg0, arg6, arg5, arg7, 0);
        int var9 = -118 / ((47 - arg1) / 58);
        field6731++;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V")
    public static void method2757(boolean arg0) {
        field6733 = null;
        field6732 = null;
        if (arg0) {
            field6734 = false;
        }
        field6727 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBII)V")
    public static final void method2758(int arg0, byte arg1, int arg2, int arg3) {
        field6728++;
        class449 var4 = class611.method3463(arg0, (byte) -126, 9);
        var4.method2615((byte) -87);
        var4.field6472 = arg2;
        if (arg1 != 103) {
            method2757(true);
        }
        var4.field6480 = arg3;
    }
}
