import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class36 extends class104 {

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    public static int field659 = -1;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "Le;")
    public static class191 field657 = class54.method368("sl_arrows", 2047);

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "Le;")
    public static class191 field660 = class54.method368("hitbar_default", 2047);

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "Le;")
    public static class191 field658 = class54.method368("::qa_op_test", 2047);

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "Le;")
    public static class191 field663 = class54.method368("runes", 2047);

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    public int field664;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
    public int field665;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)V")
    public static void method248(int arg0) {
        field663 = null;
        if (arg0 != 64) {
            method249(61, 5, 2, 22, 24, -11, (class16) null, -27, -127L);
        }
        field657 = null;
        field660 = null;
        field658 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIILbe;IJ)Z")
    public static final boolean method249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class16 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class183.method1232(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)Lwc;")
    public static final class25 method250(int arg0, boolean arg1) {
        field662++;
        class25 var2 = (class25) class176.field3023.method437((byte) 125, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class164.field2781.method826((byte) 35, 11, arg0);
        if (arg1) {
            field659 = -82;
        }
        class25 var4 = new class25();
        if (var3 != null) {
            var4.method185(45, new class225(var3));
        }
        class176.field3023.method439(var4, -1, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)V")
    public static final void method251(int arg0) {
        field655++;
        class53.field963.method1096(arg0, 0);
        class53.field963.method1608(class92.field1509, false);
        class137.field2298++;
    }
}
