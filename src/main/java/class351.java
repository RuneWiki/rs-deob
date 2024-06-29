import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class351 {

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Lgf;")
    public static class400 field5100 = new class400(16);

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Lhi;")
    public static class45 field5101 = new class45(31, 3);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIZ)I", line = 7)
    public static final int method2104(int arg0, int arg1, int arg2, boolean arg3) {
        field5099++;
        int var4 = 112 / ((arg1 + 20) / 40);
        class412 var5 = class379.method2261(3597, arg3, arg2);
        if (var5 == null) {
            return -1;
        } else if (arg0 >= 0 && var5.field5865.length > arg0) {
            return var5.field5865[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 28)
    public static void method2105(int arg0) {
        field5101 = null;
        if (arg0 != -1) {
            field5101 = null;
        }
        field5100 = null;
    }
}
