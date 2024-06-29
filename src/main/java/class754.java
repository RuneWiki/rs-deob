import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public abstract class class754 {

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "Lkda;")
    public static class388 field10528 = new class388();

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "I")
    public static int field10527;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Z)Lhq;")
    public abstract class158 method2135(boolean arg0);

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IB)I")
    public abstract int method2136(int arg0, byte arg1);

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(BI)[B")
    public abstract byte[] method2139(byte arg0, int arg1);

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V")
    public static void method4194(int arg0) {
        field10528 = null;
        if (arg0 != 0) {
            field10528 = null;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILefa;)V")
    public static final void method4195(int arg0, class183 arg1) {
        if (arg0 != 0) {
            field10528 = null;
        }
        field10527++;
        class376 var2 = (class376) class653.field9319.method1754(false, (long) arg1.field7107);
        if (var2 == null) {
            class416.method2543(null, arg1.field7193[0], 0, arg1, arg1.field4628, null, (byte) -85, arg1.field7187[0]);
        } else {
            var2.method2189(arg0 ^ 0x79);
        }
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(IB)V")
    public abstract void method2140(int arg0, byte arg1);
}
