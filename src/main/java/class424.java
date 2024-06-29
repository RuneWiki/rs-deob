import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class424 {

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Lbc;")
    public static class225 field5739 = new class225("", 12);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)V")
    public static final void method2504(int arg0, byte arg1) {
        field5740++;
        class106 var2 = class250.method1400(5, -119, arg0);
        if (arg1 == -42) {
            var2.method659(-124);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZLmr;IIII)V")
    public static final void method2505(int arg0, boolean arg1, class86 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1) {
            field5742++;
            class108.method673(arg0, arg2.field6507, arg2.field6502, 0, arg3, arg4, arg2.field6501, arg5, (byte) 25, arg6);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public static void method2506(byte arg0) {
        field5739 = null;
        if (arg0 < 30) {
            field5739 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(IB)V")
    public static final void method2507(int arg0, byte arg1) {
        field5741++;
        class160.field2211 = 1000 / arg0;
        if (arg1 <= 92) {
            method2504(-60, (byte) -98);
        }
    }
}
