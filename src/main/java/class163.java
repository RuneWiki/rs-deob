import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class163 {

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "Lga;")
    public static class420 field2388 = new class420();

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "Lpg;")
    public static class762 field2391 = new class762();

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
    public static void method1277(int arg0) {
        field2388 = null;
        if (arg0 == 14345) {
            field2391 = null;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2390++;
        if ((arg2 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg0;
            arg0 = var7;
        }
        int var8 = arg4 & arg6;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return arg1;
        } else if (var8 == 2) {
            return 7 + 1 - arg3 - arg5;
        } else {
            return 1 + 7 - arg0 - arg1;
        }
    }
}
