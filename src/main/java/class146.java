import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class146 extends OutputStream {

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Lbn;")
    public static class160 field1973 = new class160(60, -1);

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field1977 = 0;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field1978 = 100;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "[I")
    public static int[] field1979 = new int[50];

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field1976 = 1339;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Leb;")
    public static class395 field1975 = new class395();

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field1981 = new String[100];

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field1983 = 50;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "[I")
    public static int[] field1988 = new int[field1983];

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field1980 = new String[field1983];

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "[I")
    public static int[] field1989 = new int[field1983];

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "[I")
    public static int[] field1987 = new int[field1983];

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "[I")
    public static int[] field1985 = new int[field1983];

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "[I")
    public static int[] field1984 = new int[field1983];

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "[I")
    public static int[] field1982 = new int[field1983];

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!cf", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field1974++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method1011(int arg0) {
        field1981 = null;
        field1984 = null;
        field1979 = null;
        field1985 = null;
        field1987 = null;
        field1980 = null;
        field1989 = null;
        field1973 = null;
        field1988 = null;
        field1982 = null;
        field1975 = null;
        if (arg0 > -127) {
            field1973 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILmj;IZLmj;BZ)I")
    private static final int method1012(int arg0, class177 arg1, int arg2, boolean arg3, class177 arg4, byte arg5, boolean arg6) {
        field1972++;
        int var7 = class295.method1961(-128, arg4, arg1, arg0, arg3);
        if (var7 != 0) {
            return arg3 ? -var7 : var7;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var8 = 11 / ((42 - arg5) / 56);
            int var9 = class295.method1961(121, arg4, arg1, arg2, arg6);
            return arg6 ? -var9 : var9;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lqh;III[Z)V")
    public static final void method1013(class337 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class215.field3069 == class161.field2151) {
            return;
        }
        int var5 = class28.field401[arg1].method1427(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class378 var7 = class28.field401[var6];
                if (var7 != null) {
                    var7.method1431(arg0, arg2, var5 - var7.method1427(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZZIIZ)V")
    public static final void method1014(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        if (!arg6) {
            field1975 = null;
        }
        field1971++;
        if (arg1 <= arg4) {
            return;
        }
        int var7 = (arg1 + arg4) / 2;
        int var8 = arg4;
        class177 var9 = class223.field3277[var7];
        class223.field3277[var7] = class223.field3277[arg1];
        class223.field3277[arg1] = var9;
        for (int var10 = arg4; var10 < arg1; var10++) {
            if (method1012(arg0, class223.field3277[var10], arg5, arg2, var9, (byte) 101, arg3) <= 0) {
                class177 var11 = class223.field3277[var10];
                class223.field3277[var10] = class223.field3277[var8];
                class223.field3277[var8++] = var11;
            }
        }
        class223.field3277[arg1] = class223.field3277[var8];
        class223.field3277[var8] = var9;
        method1014(arg0, var8 - 1, arg2, arg3, arg4, arg5, true);
        method1014(arg0, arg1, arg2, arg3, var8 + 1, arg5, true);
    }
}
