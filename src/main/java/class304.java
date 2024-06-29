import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class304 extends class234 {

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public static int field4660 = -1;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "Z")
    public static boolean field4662 = false;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "Z")
    public static boolean field4658 = false;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "Lfi;")
    public static class38 field4659;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIII)V")
    public static final void method2013(int arg0, int arg1, int arg2, int arg3) {
        class312.field4752.method1348((byte) -65, arg2);
        field4661++;
        if (arg3 == 17012) {
            class312.field4752.method1362(arg1, arg3 ^ 0xFFFFBDCA);
            class312.field4752.method1362(arg0, -66);
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)V")
    public static void method2014(byte arg0) {
        if (arg0 != -42) {
            field4657 = -7;
        }
        field4659 = null;
    }
}
