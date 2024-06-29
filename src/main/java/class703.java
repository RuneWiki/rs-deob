import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class703 {

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field9752;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field9753;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    public static int field9754;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field9751;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V", line = 6)
    public static void method3956(byte arg0) {
        if (arg0 >= -101) {
            method3957((byte) 77, (byte) 49);
        }
        field9751 = null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BB)C", line = 18)
    public static final char method3957(byte arg0, byte arg1) {
        field9752++;
        int var2 = arg1 & 0xFF;
        if (arg0 != -71) {
            field9754 = 98;
        }
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class540.field7158[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIIII)Z", line = 45)
    public static final boolean method3958(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9753++;
        int var7 = arg0 + arg4;
        int var8 = arg1 + arg2;
        if (arg5 <= 9) {
            return false;
        }
        int var9 = arg3 + arg6;
        if (!class566.method3128(false, arg4, var7, var8, arg4, var8, var9, var8, var9, arg3)) {
            return false;
        } else if (class566.method3128(false, arg4, var7, var8, var7, var8, var9, var8, arg3, arg3)) {
            if (class58.field705 > arg4) {
                if (!class566.method3128(false, arg4, arg4, arg2, arg4, var8, var9, var8, arg3, var9)) {
                    return false;
                }
                if (!class566.method3128(false, arg4, arg4, arg2, arg4, var8, arg3, arg2, arg3, var9)) {
                    return false;
                }
            } else if (!class566.method3128(false, var7, var7, arg2, var7, var8, var9, var8, arg3, var9)) {
                return false;
            } else if (!class566.method3128(false, var7, var7, arg2, var7, var8, arg3, arg2, arg3, var9)) {
                return false;
            }
            if (class270.field3784 > arg3) {
                if (!class566.method3128(false, arg4, var7, arg2, arg4, var8, arg3, var8, arg3, arg3)) {
                    return false;
                }
                if (!class566.method3128(false, arg4, var7, arg2, var7, var8, arg3, arg2, arg3, arg3)) {
                    return false;
                }
            } else if (!class566.method3128(false, arg4, var7, arg2, arg4, var8, var9, var8, var9, var9)) {
                return false;
            } else if (!class566.method3128(false, arg4, var7, arg2, var7, var8, var9, arg2, var9, var9)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
}
