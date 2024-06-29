import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class459 {

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "J")
    public static long field6501 = 0L;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "[Z")
    public static boolean[] field6496 = new boolean[5];

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "J")
    public static long field6494;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "[S")
    public static short[] field6500;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 8)
    public static final void method2646(int arg0) {
        class81.field1135 = new class192();
        if (arg0 != 0) {
            field6494 = -119L;
        }
        field6502++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILpj;)Lpv;", line = 19)
    public static final class63 method2647(int arg0, int arg1, class132 arg2) {
        if (arg0 >= -1) {
            field6500 = null;
        }
        field6497++;
        byte[] var3 = arg2.method938(arg1, (byte) -53);
        return var3 == null ? null : new class63(var3);
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V", line = 37)
    public static void method2648(int arg0) {
        if (arg0 != 0) {
            method2646(-47);
        }
        field6496 = null;
        field6500 = null;
    }
}
