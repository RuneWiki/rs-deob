import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class253 {

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field3847 = 0;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3848 = "Choose Option";

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1699(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg2;
            arg2 = var7;
        }
        field3849++;
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg6;
        } else if (arg3 == var8) {
            return arg5;
        } else if (var8 == 2) {
            return 7 - arg6 - (arg0 + -1);
        } else {
            return 1 + 7 - arg2 - arg5;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method1700(int arg0) {
        field3848 = null;
        if (arg0 < 96) {
            field3848 = null;
        }
    }
}
