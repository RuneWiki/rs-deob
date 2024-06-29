import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class2 {

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "Lai;")
    public static class357 field10 = new class357(0, 0);

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field14 = -1;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "Lec;")
    public static class129 field8;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "[B")
    public static byte[] field13;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "[[B")
    public static byte[][] field12;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIII)V", line = 3)
    public static final void method2(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9++;
        class240.field3547 = arg0;
        class231.field3415 = arg2;
        class408.field5789 = arg4;
        if (arg3 != -1) {
            field8 = null;
        }
        class245.field3659 = arg1;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "([[II)V", line = 36)
    public static final void method3(int[][] arg0, int arg1) {
        class440.field6288 = arg0;
        int var2 = 33 % ((arg1 + 11) / 45);
        field11++;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V", line = 48)
    public static void method4(byte arg0) {
        if (arg0 != 3) {
            method3((int[][]) null, -29);
        }
        field10 = null;
        field8 = null;
        field13 = null;
        field12 = null;
    }
}
