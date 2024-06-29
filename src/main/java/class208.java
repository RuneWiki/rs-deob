import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class208 {

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public int field2999 = -1;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "[I")
    public static int[] field2987 = new int[100];

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field2994 = 1;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field2992 = null;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field3001 = -1;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "[I")
    public static int[] field3000 = new int[1000];

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Lpn;")
    public static class170 field2998;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Lge;")
    public class221 field2990;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "[I")
    public int[] field2993;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "[Ljava/lang/String;")
    public String[] field2996;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Z", line = 6)
    public static final boolean method1465(int arg0, int arg1) {
        field2991++;
        int var2 = 17 / ((arg0 + 54) / 58);
        return arg1 == 4 || arg1 == 8;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)I", line = 33)
    public static final int method1466(int arg0, int arg1, int arg2) {
        if (arg2 != -9) {
            return 29;
        }
        field2995++;
        if (arg0 > arg1) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([[II)V", line = 60)
    public static final void method1467(int[][] arg0, int arg1) {
        field2989++;
        class126.field1723 = arg0;
        if (arg1 != 1) {
            field2992 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 77)
    public static void method1468(int arg0) {
        if (arg0 > -108) {
            field3000 = (int[]) null;
        }
        field2998 = null;
        field2992 = null;
        field3000 = null;
        field2987 = null;
    }
}
