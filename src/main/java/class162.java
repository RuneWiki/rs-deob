import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class162 {

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    private int field2047;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    private int field2046;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    private int field2053;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    private int field2050;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    private int field2056;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    private int field2054;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    private int field2051;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    private int field2052;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    private int field2055;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    private int field2049;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "Ljj;")
    public static class398 field2057 = new class398(26, 3);

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    public static int field2058 = 0;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "[I")
    public static int[] field2059 = new int[1];

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static void method1096(int arg0) {
        int var1 = 9 % ((arg0 - 51) / 51);
        field2059 = null;
        field2057 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIIIIIII)V")
    public final void method1097(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2047 = arg4;
        this.field2050 = arg8;
        this.field2053 = arg3;
        if (arg6 != 11328) {
            this.field2047 = -24;
        }
        field2048++;
        this.field2046 = arg7 * arg7;
        this.field2056 = this.field2050 + arg9;
        this.field2051 = this.field2053 + arg5;
        this.field2049 = this.field2050 + arg0;
        this.field2054 = this.field2053 + arg10;
        this.field2052 = this.field2047 + arg2;
        this.field2055 = this.field2047 + arg1;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIII)Z")
    public final boolean method1098(int arg0, int arg1, int arg2, int arg3) {
        field2045++;
        if (this.field2056 > arg2 || this.field2049 < arg2) {
            return false;
        }
        if (arg3 < 62) {
            this.method1097(-1, -60, -18, -53, -115, 119, 55, 99, 36, -97, -94);
        }
        if (arg1 < this.field2054 || this.field2051 < arg1) {
            return false;
        } else if (arg0 >= this.field2052 && arg0 <= this.field2055) {
            int var5 = arg2 - this.field2050;
            int var6 = arg0 - this.field2047;
            return this.field2046 > (var5 * var5 + var6 * var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2047 = arg2;
        this.field2046 = arg3 * arg3;
        this.field2053 = arg1;
        this.field2050 = arg0;
        this.field2056 = this.field2050 + arg4;
        this.field2054 = this.field2053 + arg6;
        this.field2051 = this.field2053 + arg7;
        this.field2052 = this.field2047 + arg8;
        this.field2055 = this.field2047 + arg9;
        this.field2049 = this.field2050 + arg5;
    }
}
