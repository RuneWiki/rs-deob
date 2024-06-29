import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gka")
public class class667 {

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "Lwja;")
    public class351 field9377 = new class351();

    @OriginalMember(owner = "client!gka", name = "d", descriptor = "Lin;")
    public static class380 field9380 = new class380(40, -2);

    @OriginalMember(owner = "client!gka", name = "f", descriptor = "Lin;")
    public static class380 field9382 = new class380(123, 11);

    @OriginalMember(owner = "client!gka", name = "b", descriptor = "I")
    public static int field9378;

    @OriginalMember(owner = "client!gka", name = "e", descriptor = "I")
    public static int field9381;

    @OriginalMember(owner = "client!gka", name = "c", descriptor = "[I")
    public static int[] field9379;

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(IB)V")
    public static final void method3736(int arg0, byte arg1) {
        field9381++;
        if (arg1 != -82) {
            method3737((byte) 109);
        }
        class580.field8354.method2888(arg0, arg1 + 204);
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(B)V")
    public static void method3737(byte arg0) {
        field9380 = null;
        if (arg0 != -13) {
            method3737((byte) -69);
        }
        field9379 = null;
        field9382 = null;
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(ILjava/lang/Object;BI)[B")
    public static final byte[] method3738(int arg0, Object arg1, byte arg2, int arg3) {
        field9378++;
        if (arg2 != 95) {
            method3736(-4, (byte) -60);
        }
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var4 = (byte[]) arg1;
            return class695.method3906(false, arg3, arg0, var4);
        } else if (arg1 instanceof class637) {
            class637 var5 = (class637) arg1;
            return var5.method1478(-2049, arg3, arg0);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
