import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class384 {

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Z")
    public static boolean field5117 = true;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Llj;")
    public static class570 field5120 = new class570(11, 0, 1, 2);

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Lcu;")
    public static class206 field5121 = new class206(82, 8);

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static void method2237(int arg0) {
        field5120 = null;
        if (arg0 >= -79) {
            field5120 = null;
        }
        field5121 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIBLbi;)Lkga;")
    public static final class511 method2238(int arg0, int arg1, byte arg2, class449 arg3) {
        field5118++;
        byte[] var4 = arg3.method2537(false, arg1, arg0);
        if (var4 == null) {
            return null;
        } else if (arg2 > -98) {
            return null;
        } else {
            return new class511(var4);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLgba;)V")
    public static final void method2239(byte arg0, class625 arg1) {
        if (arg0 >= -4) {
            field5120 = null;
        }
        field5119++;
        if (arg1.field8421 == 5 && arg1.field8403 != -1) {
            class592.method3252(class10.field197, (byte) -112, arg1);
        }
    }
}
