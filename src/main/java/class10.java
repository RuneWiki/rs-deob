import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class class10 {

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "[I")
    public static int[] field140 = new int[250];

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Z")
    public static boolean field138 = false;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field139 = 0;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method70(int arg0) {
        field140 = null;
        if (arg0 != -1091591193) {
            method70(88);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)I")
    public static final int method71(int arg0, int arg1, int arg2) {
        field142++;
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
            int var3 = (arg2 & arg1) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIILsr;Lsr;)V")
    public static final void method72(int arg0, int arg1, int arg2, class168 arg3, class168 arg4) {
        class138 var5 = class297.method1929(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field2115 = arg3;
            var5.field2106 = arg4;
        }
    }
}
