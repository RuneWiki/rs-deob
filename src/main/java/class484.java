import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class484 {

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "I")
    public int field6903;

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "I")
    public int field6904;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "I")
    public int field6899;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
    public int field6900;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "[I")
    public static int[] field6902 = new int[200];

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
    public static void method2767(int arg0) {
        field6902 = null;
        if (arg0 != 6703) {
            method2767(-47);
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(IIII)V")
    public class484(int arg0, int arg1, int arg2, int arg3) {
        this.field6903 = arg0;
        this.field6904 = arg3;
        this.field6899 = arg2;
        this.field6900 = arg1;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IB)Lgda;")
    public final class484 method2768(int arg0, byte arg1) {
        field6901++;
        return arg1 >= -107 ? null : new class484(this.field6903, arg0, this.field6899, this.field6904);
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(I)I")
    public static final int method2769(int arg0) {
        if (arg0 != 200) {
            field6902 = null;
        }
        field6905++;
        return class594.method3380(false, -98);
    }
}
