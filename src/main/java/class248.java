import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class248 {

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "Lad;")
    public static class11 field3172 = new class11(8);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Ljava/awt/Image;")
    public static Image field3171;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 & 0x3;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg5;
            arg5 = var8;
        }
        field3168++;
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return arg1;
        } else {
            if (arg3 != 4) {
                method1556(-5, null);
            }
            return var7 == 2 ? 7 + 1 - arg6 - arg4 : -arg1 + 7 - (arg5 - 1);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public static void method1555(int arg0) {
        if (arg0 < -113) {
            field3171 = null;
            field3172 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILbt;)Ljava/lang/String;")
    public static final String method1556(int arg0, class88 arg1) {
        if (arg0 == -14) {
            field3170++;
            return class108.method708(32767, 0, arg1);
        } else {
            return null;
        }
    }
}
