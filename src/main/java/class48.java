import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class48 {

    @OriginalMember(owner = "client!co", name = "d", descriptor = "Ljava/lang/String;")
    public static String field628 = "Attack";

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static int field625 = 0;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field629 = 0;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "I")
    public static int field634 = 3353893;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "I")
    public static int field635 = 0;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "F")
    public static float field627;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "Lun;")
    public static class190 field633;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "Llc;")
    public static class294 field630;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "[[S")
    public static short[][] field626;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V", line = 10)
    public static void method365(int arg0) {
        field628 = null;
        field630 = null;
        field626 = (short[][]) null;
        field633 = null;
        if (arg0 != 4) {
            field628 = (String) null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIIII)Z", line = 29)
    public static final boolean method366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILug;II)Luj;", line = 59)
    public static final class169 method367(int arg0, class253 arg1, int arg2, int arg3) {
        field631++;
        if (arg3 != -10166) {
            field628 = (String) null;
        }
        return class287.method2029(arg1, arg2, 2, arg0) ? class138.method1028(-121) : null;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIII)I", line = 75)
    public static final int method368(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 12 / ((-arg3 - 73) / 47);
        if (arg0 > 243) {
            arg2 >>= 0x4;
        } else if (arg0 > 217) {
            arg2 >>= 0x3;
        } else if (arg0 > 192) {
            arg2 >>= 0x2;
        } else if (arg0 > 179) {
            arg2 >>= 0x1;
        }
        field636++;
        return (arg1 >> 2 << 10) + (arg0 >> 1) + (arg2 >> 5 << 7);
    }
}
