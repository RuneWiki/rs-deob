import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class268 {

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field3671 = 0;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "[B")
    public static byte[] field3675 = new byte[2048];

    @OriginalMember(owner = "client!om", name = "d", descriptor = "Ljj;")
    public static class398 field3673 = new class398(40, 8);

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILqe;I)V", line = 14)
    public static final void method1653(int arg0, class122 arg1, int arg2) {
        field3674++;
        class654.field9261 = false;
        class72.field937 = arg2;
        class286.method1716((byte) 77, arg1);
        class296.method1770(arg1, arg2 ^ 0x1);
        if (class654.field9261) {
            System.out.println("---endgpp---");
        }
        if (arg1.field1745 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg1.field1745 + " psize:" + arg0);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V", line = 42)
    public static void method1654(byte arg0) {
        if (arg0 >= -76) {
            field3672 = 56;
        }
        field3675 = null;
        field3673 = null;
    }
}
