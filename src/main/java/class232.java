import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public abstract class class232 {

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Lcf;")
    public static class93 field4136 = class147.method1066(" de votre liste noire)3", -48);

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "Lcf;")
    public static class93 field4145 = class147.method1066("(U", -48);

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "Lcf;")
    public static class93 field4140 = class147.method1066("ul", -48);

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Lcf;")
    private static class93 field4135 = class147.method1066("Connection lost)3", -48);

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "[I")
    public static int[] field4141 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "Lcf;")
    public static class93 field4137 = field4135;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "Lhg;")
    public static class177 field4144;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "Lhg;")
    public static class177 field4147;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Ltg;")
    public static class181 field4146;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "[I")
    public static int[] field4148;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "[[[B")
    public static byte[][][] field4143;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "[[[Lr;")
    public static class41[][][] field4138;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILhg;)V")
    public static final void method1585(int arg0, class177 arg1) {
        field4139++;
        class85.field1550 = arg1;
        if (arg0 != 64) {
            field4138 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILmc;)Lmc;")
    public abstract class196 method1532(int arg0, class196 arg1);

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public static final void method1586(int arg0) {
        class11.field149.method300(arg0 + 19099);
        class247.field4447.method300(0);
        if (arg0 == -19099) {
            field4149++;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
    public static void method1587(int arg0) {
        field4146 = null;
        field4135 = null;
        field4143 = null;
        field4140 = null;
        field4144 = null;
        field4148 = null;
        field4138 = null;
        field4141 = null;
        if (arg0 != 10215) {
            method1588(100, -67, -92, -122, -96, 125, (class211) null, 25, -88L);
        }
        field4147 = null;
        field4137 = null;
        field4136 = null;
        field4145 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIILgl;IJ)Z")
    public static final boolean method1588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class211 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class34.method201(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lcf;B)Z")
    public static final boolean method1589(class93 arg0, byte arg1) {
        field4142++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class145.field2567; var2++) {
            if (arg0.method649(class171.field3004[var2], -4446)) {
                return true;
            }
        }
        if (arg1 < 87) {
            field4137 = null;
        }
        return arg0.method649(class166.field2927.field4247, -4446);
    }
}
