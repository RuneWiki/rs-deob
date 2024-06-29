import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class306 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lho;")
    public static class215 field4750;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIBILud;)V", line = 5)
    public static final void method2196(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class91 arg6) {
        if (arg4 <= 36) {
            method2196(98, -87, 24, 116, (byte) 13, 70, (class91) null);
        }
        class186.method1434(false, arg6.field1359, arg6.field1286, 0, arg1, arg5, arg3, arg0, arg2);
        field4751++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 22)
    public static void method2197(int arg0) {
        if (arg0 != -28214) {
            field4749 = -38;
        }
        field4750 = null;
    }
}
