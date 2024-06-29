import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class729 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public int field10230;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public int field10236;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Ljava/lang/String;")
    public String field10233;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Ljava/lang/String;")
    public String field10238;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "J")
    public long field10235;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field10234 = -1;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "[I")
    public static int[] field10237 = new int[8];

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field10231;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Z")
    public static boolean field10232;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V", line = 3)
    public static void method4067(boolean arg0) {
        if (arg0) {
            method4067(true);
        }
        field10237 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIII)V", line = 31)
    public static final void method4068(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field10231++;
        if (arg3 != -1) {
            method4067(false);
        }
        if (arg7 < 1 || arg8 < 1 || arg7 > class184.field2546 - 2 || (class240.field3555 - 2) < arg8) {
            return;
        }
        int var9 = arg4;
        if (arg4 < 3 && class547.method3292((byte) -87, arg8, arg7)) {
            var9 = arg4 + 1;
        }
        if (class243.field3580.field8002.method2026(false) == 0 && !class583.method3433((byte) 16, class717.field10118, var9, arg8, arg7)) {
            return;
        }
        if (class565.field8185 == null) {
            return;
        }
        class631.field8928.method2547(83, arg7, arg4, arg2, class211.field3164, class6.field57[arg4], arg8);
        if (arg0 < 0) {
            return;
        }
        int var10 = class243.field3580.field7996.method2663(false);
        class243.field3580.method3301(1, 24, class243.field3580.field7996);
        class631.field8928.method2539(var9, arg1, arg0, arg4, class211.field3164, arg5, -102, arg8, arg7, arg6, class6.field57[arg4]);
        class243.field3580.method3301(var10, 24, class243.field3580.field7996);
        return;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V", line = 77)
    public class729(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field10230 = arg0;
        this.field10236 = arg2;
        this.field10233 = arg3;
        this.field10238 = arg1;
        this.field10235 = arg4;
    }
}
