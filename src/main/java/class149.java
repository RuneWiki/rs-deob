import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class149 extends class230 {

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
    private int field1974;

    @OriginalMember(owner = "client!cu", name = "w", descriptor = "I")
    private int field1985;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
    private int field1971;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
    private int field1972;

    @OriginalMember(owner = "client!cu", name = "q", descriptor = "I")
    public static int field1979 = 0;

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "I")
    public static int field1980 = 0;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
    public static int field1973 = 0;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!cu", name = "s", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!cu", name = "t", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!cu", name = "u", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!cu", name = "v", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "[Lo;")
    public static class24[] field1976;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIB)V")
    public final void method409(int arg0, int arg1, byte arg2) {
        ++field1984;
        if (arg2 == -85) {
            int var4 = this.field1974 * arg1 >> 12;
            int var5 = this.field1985 * arg1 >> 12;
            int var6 = this.field1972 * arg0 >> 12;
            int var7 = this.field1971 * arg0 >> 12;
            class542.method3184(super.field3391, var6, var7, super.field3389, var4, super.field3394, (byte) -94, var5);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(II)Z")
    public static final boolean method927(int arg0, int arg1) {
        if (arg1 != -24210) {
            method928((byte) -73);
        }
        ++field1981;
        return ~arg0 == -3 || arg0 == 6 || ~arg0 == -10;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(IIIIIII)V")
    public class149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1974 = arg0;
        this.field1985 = arg2;
        this.field1971 = arg3;
        this.field1972 = arg1;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
    public static void method928(byte arg0) {
        if (arg0 < 3) {
            field1975 = -126;
        }
        field1976 = null;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIIIILza;I[[[BIII)V")
    public static final void method929(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class290 arg7, int arg8, byte[][][] arg9, int arg10, int arg11, int arg12) {
        ++field1983;
        if (~arg1 != -1 && ~arg10 != -1) {
            if (arg5 >= -104) {
                method929(-81, 10, -10, 78, 86, -81, 2, (class290) null, -123, (byte[][][]) null, 67, -17, 95);
            }
            if (~arg1 == -10) {
                arg1 = 1;
                arg4 = arg4 + 1 & 3;
            }
            if (~arg1 == -11) {
                arg1 = 1;
                arg4 = 3 & arg4 + 3;
            }
            if (~arg1 == -12) {
                arg4 = 3 & arg4 + 3;
                arg1 = 8;
            }
            arg7.method290(arg11, arg2, arg0, arg6, arg3, arg12, arg9[arg1 + -1][arg4], arg10, arg8);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZLla;Ljava/lang/String;B)V")
    public static final void method930(boolean arg0, class319 arg1, String arg2, byte arg3) {
        ++field1982;
        byte var4 = 4;
        int var5 = 6 - -var4;
        int var6 = -47 / ((arg3 - -28) / 49);
        int var7 = var4 + 6;
        int var8 = class431.field6093.method2435((byte) 114, 250, arg2, (class24[]) null);
        int var9 = class431.field6093.method2431(250, arg2, (byte) -119, (class24[]) null) * 13;
        class385.field5414.method325(-var4 + var5, -var4 + var7, var4 + var4 + var8, var4 + var9 + var4, -16777216, 0);
        class385.field5414.method288(-var4 + var5, var7 - var4, var4 + var8 + var4, var9 - -var4 + var4, -1, 0);
        arg1.method1922(var9, -1, var7, 1, 1, -1, (class145) null, var5, 0, 0, var8, (class24[]) null, 0, (int[]) null, arg2, -2);
        class108.method738(-var4 + var7, var5 - var4, (byte) 38, var4 + var4 + var9, var4 + var4 + var8);
        if (arg0) {
            class385.field5414.method377();
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(III)V")
    public final void method406(int arg0, int arg1, int arg2) {
        ++field1977;
        int var4 = this.field1974 * arg2 >> 12;
        int var5 = this.field1985 * arg2 >> 12;
        if (arg0 != 0) {
            method927(-9, -82);
        }
        int var6 = this.field1972 * arg1 >> 12;
        int var7 = this.field1971 * arg1 >> 12;
        class2.method22(var6, var7, var5, (byte) -126, var4, super.field3394);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)V")
    public final void method408(int arg0, int arg1, int arg2) {
        ++field1970;
        if (arg2 != 0) {
            field1975 = 74;
        }
    }
}
