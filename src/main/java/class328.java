import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class328 {

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "[I")
    private int[] field5083;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "[J")
    public static long[] field5079 = new long[32];

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field5084 = 0;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "[I")
    public static int[] field5085;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 23)
    public static void method2240(int arg0) {
        if (arg0 != 15580) {
            field5085 = (int[]) null;
        }
        field5079 = null;
        field5085 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIBZIIIIII)Z", line = 37)
    public static final boolean method2241(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field5082++;
        if (class235.field3602.method929(arg4 ^ 0x0) == 2) {
            return class13.method103(arg10, arg6, arg11, arg7, arg4 + 106, arg1, arg8, arg9, arg3, arg2, arg5, arg0);
        } else if (class235.field3602.method929(12) > 2) {
            return class227.method1611(arg0, arg9, arg1, 113, arg6, arg10, arg11, arg7, arg5, arg2, arg8, arg3, class235.field3602.method929(12));
        } else {
            if (arg4 != 12) {
                field5084 = 52;
            }
            return class161.method1154(arg2, arg3, arg10, arg11, arg8, -98, arg7, arg0, arg6, arg5, arg1, arg9);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)I", line = 57)
    public final int method2242(int arg0, int arg1) {
        field5081++;
        if (arg0 != -16536) {
            this.field5083 = (int[]) null;
        }
        int var3 = (this.field5083.length >> 1) - 1;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field5083[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field5083[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "([I)V", line = 83)
    public class328(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field5083 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field5083[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field5083[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field5083[var5 + var5] = arg0[var4];
            this.field5083[var5 + var5 + 1] = var4++;
        }
    }
}
