import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class444 {

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "Lhm;")
    public static class208 field5589 = new class208(8);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIBII)I", line = 7)
    public static final int method2437(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field5588++;
        int var5 = 65536 - class243.field3128[arg4 * 8192 / arg0] >> 1;
        if (arg2 < 51) {
            field5589 = null;
        }
        return ((65536 - var5) * arg1 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)V", line = 25)
    public static void method2438(boolean arg0) {
        if (!arg0) {
            method2438(false);
        }
        field5589 = null;
    }
}
