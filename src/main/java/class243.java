import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class243 {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field3962 = 0;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "J")
    public static long field3966 = 0L;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field3964;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIII)I", line = 5)
    public static final int method1700(int arg0, int arg1, int arg2, int arg3) {
        field3965++;
        int var4 = arg1 & 0x3;
        int var5 = -76 % ((arg0 + 58) / 59);
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 26)
    public static void method1701(int arg0) {
        field3964 = null;
        int var1 = -15 / ((arg0 + 80) / 43);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIILuk;IJZ)Z", line = 36)
    public static final boolean method1702(int arg0, int arg1, int arg2, int arg3, int arg4, class104 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class258.method1791(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }
}
