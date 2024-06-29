import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class344 {

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "[I")
    public static int[] field5547 = new int[500];

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field5550 = 0;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "[B")
    public byte[] field5545;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "[S")
    public short[] field5546;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "[S")
    public short[] field5549;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "[S")
    public short[] field5551;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V", line = 4)
    public static final void method2340(int arg0, int arg1) {
        field5553++;
        int var2 = -82 / ((arg1 + 56) / 48);
        class453.field6805.method573((byte) 126, arg0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIII)V", line = 14)
    public static final void method2341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 >= -76) {
            method2340(41, -92);
        }
        for (int var6 = arg2; var6 <= arg3; var6++) {
            class367.method2427(3803, arg5, arg0, class39.field527[var6], arg4);
        }
        field5552++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 48)
    public static void method2342(byte arg0) {
        if (arg0 != -91) {
            field5547 = null;
        }
        field5547 = null;
    }
}
