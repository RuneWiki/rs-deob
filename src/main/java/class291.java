import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public abstract class class291 {

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "I")
    public static int field4028 = -2;

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "Lada;")
    public static class144 field4027 = new class144(87, 6);

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "Lada;")
    public static class144 field4030 = new class144(21, 6);

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(ILsa;)V", line = 10)
    public static final void method1793(int arg0, class176 arg1) {
        class165.field2609[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Z)V", line = 22)
    public static void method1795(boolean arg0) {
        field4030 = null;
        if (!arg0) {
            field4027 = null;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(BII)[B")
    public abstract byte[] method1791(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1792(int arg0);

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I[B)V")
    public abstract void method1794(int arg0, byte[] arg1);
}
