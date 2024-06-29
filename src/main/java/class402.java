import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class402 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "Lraa;")
    public static class520 field5281 = new class520();

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "[I")
    public static int[] field5286 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public int field5284;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Lnaa;")
    public class62 field5283;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "[I")
    public int[] field5282;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    public static void method2298(byte arg0) {
        field5281 = null;
        if (arg0 != -42) {
            method2299(69, 15, 60);
        }
        field5286 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Z")
    public static final boolean method2299(int arg0, int arg1, int arg2) {
        field5285++;
        if (arg1 != 8192) {
            field5286 = null;
        }
        return class205.method1096(false, arg0, arg2) & ((arg2 & 0x2000) != 0 | class342.method1908(arg2, false, arg0) | class168.method944(arg0, arg2, (byte) -63));
    }
}
