import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class271 {

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field4408 = -1;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "[I")
    public static int[] field4415 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public int field4411;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "Ljava/lang/String;")
    public String field4413;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public static void method1885(byte arg0) {
        int var1 = -70 / ((arg0 + 48) / 48);
        field4415 = null;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)V")
    public static final void method1886(byte arg0) {
        field4414++;
        if (arg0 <= -67) {
            class36.field438.method1511((byte) 89);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIILsc;IJIIII)Z")
    public static final boolean method1887(int arg0, int arg1, int arg2, int arg3, class248 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class59.method377(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1888(int arg0, int arg1) {
        field4412++;
        return arg1 == 6139 ? (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + ((arg0 & 0xFF2A) >> 8) + "." + (arg0 & 0xFF) : null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)I")
    public static final int method1889(int arg0, int arg1, int arg2) {
        if (arg1 != 255) {
            method1886((byte) -7);
        }
        field4407++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }
}
