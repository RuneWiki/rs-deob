import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class214 extends class220 {

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "[B")
    public byte[] field3776;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    public static int field3778 = 127;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public static int field3779 = 0;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "Lvf;")
    public static class296 field3777 = new class296();

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "Lmh;")
    public static class128 field3780 = class22.method156(122, "(U3");

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V", line = 16)
    public static void method1484(int arg0) {
        if (arg0 >= -82) {
            field3780 = (class128) null;
        }
        field3780 = null;
        field3777 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIBZ)V", line = 36)
    public static final void method1485(int arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        field3775++;
        if (class133.method890(false, arg0) && arg3 == -6) {
            class290.method2000(arg4, arg2, arg1, (byte) -120, -1, class200.field3508[arg0]);
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "([B)V", line = 61)
    public class214(byte[] arg0) {
        this.field3776 = arg0;
    }
}
