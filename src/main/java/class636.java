import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class636 {

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field9144 = 500;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public static int field9146 = -2;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "Lrg;")
    public static class548 field9142 = new class548(11, 16);

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public static int field9140;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field9141;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field9143;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "Lha;")
    public static class52 field9145;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V", line = 9)
    public static void method3650(int arg0) {
        field9142 = null;
        field9145 = null;
        if (arg0 != 500) {
            method3650(-30);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)Z", line = 21)
    public static final boolean method3651(int arg0, int arg1, int arg2) {
        int var3 = 0 % ((arg2 + 73) / 37);
        field9141++;
        return (arg1 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I[BI)I", line = 31)
    public static final int method3652(int arg0, byte[] arg1, int arg2) {
        if (arg2 != -32297) {
            field9142 = null;
        }
        field9140++;
        return class303.method1669(0, arg0, 94, arg1);
    }
}
