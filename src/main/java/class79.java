import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class79 {

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1827 = 0;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field1831 = 0;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
    public static int[] field1832 = new int[2000];

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Lec;")
    public static class32 field1835 = class73.method594("Titelbild geladen)3", true);

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Lec;")
    public static class32 field1834 = class73.method594("Fps:", true);

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lea;")
    public static class30 field1829;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "[[Lf;")
    public static class36[][] field1826;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)V")
    public static final void method626(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1833++;
        int var5 = arg0;
        if (arg3 != 5037) {
            return;
        }
        while (arg0 + arg2 >= var5) {
            for (int var6 = arg1; var6 <= arg1 + arg4; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class85.field1986[0][var6][var5] = 127;
                    if (arg1 == var6 && var6 > 0) {
                        class70.field1631[0][var6][var5] = class70.field1631[0][var6 - 1][var5];
                    }
                    if (arg1 + arg4 == var6 && var6 < 103) {
                        class70.field1631[0][var6][var5] = class70.field1631[0][var6 + 1][var5];
                    }
                    if (arg0 == var5 && var5 > 0) {
                        class70.field1631[0][var6][var5] = class70.field1631[0][var6][var5 - 1];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        class70.field1631[0][var6][var5] = class70.field1631[0][var6][var5 + 1];
                    }
                }
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)Z")
    public static final boolean method627(int arg0, byte arg1) {
        field1828++;
        if (arg1 <= 18) {
            method630(34);
        }
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public static final void method628(byte arg0) {
        class103.field2428 = new int[4][105][105];
        class31.field590 = new int[105][105];
        class68.field1593 = new int[104];
        class33.field699 = new int[104];
        class85.field1986 = new byte[4][105][105];
        class106.field2513 = new int[104];
        class151.field3474 = 99;
        class143.field3274 = new int[104];
        field1830++;
        class117.field2816 = new byte[4][104][104];
        class111.field2614 = new byte[4][104][104];
        class37.field895 = new int[104];
        if (arg0 > -50) {
            field1825 = 4;
        }
        class134.field3125 = new byte[4][104][104];
        class134.field3131 = new byte[4][104][104];
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLec;ILec;)V")
    public static final void method629(byte arg0, class32 arg1, int arg2, class32 arg3) {
        if (arg0 != 98) {
            field1829 = null;
        }
        class97.method758(arg3, true, arg2, arg1, null);
        field1836++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method630(int arg0) {
        field1834 = null;
        field1835 = null;
        field1829 = null;
        if (arg0 != 1) {
            field1829 = null;
        }
        field1826 = null;
        field1832 = null;
    }
}
