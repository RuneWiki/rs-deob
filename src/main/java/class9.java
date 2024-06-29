import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class9 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Z")
    public static boolean field108 = false;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field111 = 0;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Ljava/lang/String;")
    public static String field113 = "red:";

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field112 = -1;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "S")
    public static short field114 = 1;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 32)
    public static void method62(int arg0) {
        if (arg0 <= 119) {
            method63(-68, 100, 106, -105, 50, -81, (class162) null, -66, 23L);
        }
        field113 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIILkm;IJ)Z", line = 64)
    public static final boolean method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class162 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class265.method1870(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }
}
