import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class120 extends class134 {

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "[I")
    public int[] field1840 = new int[1];

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "[I")
    public int[] field1842 = new int[] { -1 };

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "Lec;")
    public static class25 field1843 = new class25(4);

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field1848 = new String[200];

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "Z")
    public static volatile boolean field1850 = true;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
    public static int field1849 = -1;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "Lfa;")
    public static class273 field1846;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)I")
    public static final int method782(byte arg0) {
        field1839++;
        if (arg0 != -126) {
            field1846 = null;
        }
        return class111.field1696.method150(0);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)I")
    public static final int method783(int arg0, int arg1, int arg2) {
        field1841++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & arg1) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V")
    public static void method784(int arg0) {
        field1843 = null;
        field1846 = null;
        if (arg0 != 0) {
            method783(13, 123, 118);
        }
        field1848 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method785(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class168 var20 = new class168(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class27.field346[var21][arg1][arg2] == null) {
                    class27.field346[var21][arg1][arg2] = new class154(var21, arg1, arg2);
                }
            }
            class27.field346[arg0][arg1][arg2].field2423 = var20;
        } else if (arg3 == 1) {
            class168 var22 = new class168(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class27.field346[var23][arg1][arg2] == null) {
                    class27.field346[var23][arg1][arg2] = new class154(var23, arg1, arg2);
                }
            }
            class27.field346[arg0][arg1][arg2].field2423 = var22;
        } else {
            class153 var24 = new class153(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class27.field346[var25][arg1][arg2] == null) {
                    class27.field346[var25][arg1][arg2] = new class154(var25, arg1, arg2);
                }
            }
            class27.field346[arg0][arg1][arg2].field2428 = var24;
        }
    }
}
