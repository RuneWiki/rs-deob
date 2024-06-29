import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class169 extends class104 {

    @OriginalMember(owner = "client!pe", name = "qb", descriptor = "Lkh;")
    public static class117 field3042 = class224.method1450((byte) 114, "");

    @OriginalMember(owner = "client!pe", name = "nb", descriptor = "Lkh;")
    private static class117 field3039 = class224.method1450((byte) 123, "Loading title screen )2 ");

    @OriginalMember(owner = "client!pe", name = "tb", descriptor = "Lkh;")
    public static class117 field3045 = field3039;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "[I")
    public static int[] field3038 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!pe", name = "vb", descriptor = "I")
    public static int field3047 = 0;

    @OriginalMember(owner = "client!pe", name = "xb", descriptor = "Lkh;")
    public static class117 field3049 = class224.method1450((byte) 126, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!pe", name = "ob", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!pe", name = "pb", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!pe", name = "rb", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!pe", name = "sb", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!pe", name = "ub", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!pe", name = "wb", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!pe", name = "yb", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIZIBIIIIII)Z")
    public static final boolean method1190(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field3048;
        if (class93.field1712.field4256 != 2) {
            if (class93.field1712.field4256 > 2) {
                return class77.method544(arg9, arg6, arg3, arg10, arg2, arg7, arg8, 94, arg4, arg0, arg11, arg1, class93.field1712.field4256);
            } else {
                return arg5 <= 93 ? false : class37.method327(arg0, arg8, arg7, arg10, 1, arg1, arg6, arg4, arg11, arg3, arg2, arg9);
            }
        } else {
            return class36.method313(arg3, arg9, arg2, arg1, arg0, arg4, arg6, arg8, arg7, 1, arg11, arg10);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLah;)Lkh;")
    public static final class117 method1191(byte arg0, class9 arg1) {
        if (arg0 <= 16) {
            field3039 = null;
        }
        ++field3040;
        if (~class181.method1253(class187.method1269(arg1, (byte) 16), -97) == -1) {
            return null;
        } else if (arg1.field181 != null && arg1.field181.method798((byte) 113).method819((byte) -121) != 0) {
            return arg1.field181;
        } else {
            return class103.field1882 ? class219.field3976 : null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "(I)V")
    public static final void method1192(int arg0) {
        if (arg0 >= -70) {
            field3042 = null;
        }
        ++field3043;
        if (~class134.field2407.toLowerCase().indexOf("microsoft") == 0) {
            class60.field1215[93] = 43;
            class60.field1215[92] = 74;
            class60.field1215[91] = 42;
            class60.field1215[47] = 73;
            class60.field1215[45] = 26;
            if (class134.field2411 != null) {
                class60.field1215[520] = 59;
                class60.field1215[192] = 28;
                class60.field1215[222] = 58;
            } else {
                class60.field1215[192] = 58;
                class60.field1215[222] = 59;
            }
            class60.field1215[44] = 71;
            class60.field1215[46] = 72;
            class60.field1215[59] = 57;
            class60.field1215[61] = 27;
        } else {
            class60.field1215[220] = 74;
            class60.field1215[187] = 27;
            class60.field1215[186] = 57;
            class60.field1215[191] = 73;
            class60.field1215[190] = 72;
            class60.field1215[219] = 42;
            class60.field1215[222] = 59;
            class60.field1215[223] = 28;
            class60.field1215[188] = 71;
            class60.field1215[221] = 43;
            class60.field1215[189] = 26;
            class60.field1215[192] = 58;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(BI)V")
    public static final void method1193(byte arg0, int arg1) {
        if (arg0 < -29) {
            ++field3046;
            if (class61.field1230 == null || ~class61.field1230.length > ~arg1) {
                class61.field1230 = new int[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[[I")
    public final int[][] method116(int arg0, int arg1) {
        if (arg1 != -9179) {
            method1195(-33, (class10) null, (byte) -76);
        }
        ++field3041;
        int[][] var3 = super.field3022.method1148(arg0, 8708);
        if (super.field3022.field2957 && this.method698(2)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field1901 * super.field1901;
            for (int var8 = 0; class115.field2146 > var8; ++var8) {
                int var9 = super.field1892[var8 % super.field1902 + var7];
                var6[var8] = class209.method1370(4080, var9 << 4);
                var4[var8] = class209.method1370(var9 >> 4, 4080);
                var5[var8] = class209.method1370(4080, var9 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "(I)V")
    public static void method1194(int arg0) {
        if (arg0 != 59) {
            method1196(83, (class10) null);
        }
        field3049 = null;
        field3038 = null;
        field3039 = null;
        field3045 = null;
        field3042 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILai;B)[Lr;")
    public static final class186[] method1195(int arg0, class10 arg1, byte arg2) {
        ++field3044;
        if (arg2 < 69) {
            return null;
        } else {
            return !class71.method502(arg1, arg0, (byte) 26) ? null : class100.method679(92);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILai;)V")
    public static final void method1196(int arg0, class10 arg1) {
        ++field3050;
        class106.field1926 = arg1;
        class178.field3228 = class106.field1926.method108(arg0, 0);
    }
}
