import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class276 {

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "[[[I")
    public static int[][][] field4598 = new int[4][13][13];

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Lph;")
    public static class229 field4601 = class266.method1858(":trade:", 0);

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field4599 = 0;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)I", line = 16)
    public static final int method1907(int arg0, int arg1, int arg2, int arg3) {
        field4600++;
        if (arg0 != -25107) {
            return 20;
        } else if ((class245.field4050[arg2][arg3][arg1] & 0x8) == 0) {
            return arg2 <= 0 || (class245.field4050[1][arg3][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 55)
    public static void method1908(int arg0) {
        field4601 = null;
        if (arg0 != 4) {
            method1907(11, 36, 20, 71);
        }
        field4598 = (int[][][]) null;
    }
}
