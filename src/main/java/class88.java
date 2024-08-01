import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class class88 extends class71 {

    @OriginalMember(owner = "jc", name = "o", descriptor = "Llf;")
    public static class109 field1825 = class35.method275("<)4col>", 2);

    @OriginalMember(owner = "jc", name = "u", descriptor = "Llf;")
    private static class109 field1831 = class35.method275("RuneScape has been updated(Q", 2);

    @OriginalMember(owner = "jc", name = "A", descriptor = "Llf;")
    public static class109 field1837 = class35.method275(")1", 2);

    @OriginalMember(owner = "jc", name = "w", descriptor = "Llf;")
    public static class109 field1833 = field1831;

    @OriginalMember(owner = "jc", name = "q", descriptor = "[[[B")
    public static byte[][][] field1827 = new byte[4][104][104];

    @OriginalMember(owner = "jc", name = "D", descriptor = "Llf;")
    private static class109 field1840 = class35.method275(" from your ignore list first)3", 2);

    @OriginalMember(owner = "jc", name = "y", descriptor = "Llf;")
    public static class109 field1835 = class35.method275("Fallen lassen", 2);

    @OriginalMember(owner = "jc", name = "x", descriptor = "Llf;")
    public static class109 field1834 = field1840;

    @OriginalMember(owner = "jc", name = "E", descriptor = "[Llf;")
    public static class109[] field1841 = new class109[100];

    @OriginalMember(owner = "jc", name = "s", descriptor = "B")
    public byte field1829;

    @OriginalMember(owner = "jc", name = "n", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "jc", name = "r", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "jc", name = "t", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "jc", name = "v", descriptor = "I")
    public int field1832;

    @OriginalMember(owner = "jc", name = "B", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "jc", name = "F", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "jc", name = "p", descriptor = "Llf;")
    public class109 field1826;

    @OriginalMember(owner = "jc", name = "C", descriptor = "Z")
    public static boolean field1839;

    @OriginalMember(owner = "jc", name = "z", descriptor = "[[[B")
    public static byte[][][] field1836;

    @OriginalMember(owner = "jc", name = "a", descriptor = "(I)V")
    public static final void method652(int arg0) {
        class191.field3656.method1088(arg0 ^ 0xFFFFF832);
        field1828++;
        if (arg0 != 2047) {
            field1841 = null;
        }
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(I)V")
    public static void method653(int arg0) {
        field1831 = null;
        field1825 = null;
        field1835 = null;
        field1834 = null;
        field1837 = null;
        field1840 = null;
        field1841 = null;
        field1836 = null;
        field1827 = null;
        field1833 = null;
        if (arg0 >= -72) {
            field1839 = true;
        }
    }

    @OriginalMember(owner = "jc", name = "c", descriptor = "(I)V")
    public static final void method654(int arg0) {
        field1830++;
        class95.field1934.method1338(11045);
        int var1 = class95.field1934.method1341((byte) 106, arg0);
        if (var1 == 0) {
            return;
        }
        int var2 = class95.field1934.method1341((byte) 118, 2);
        if (var2 == 0) {
            class102.field2018[class98.field1967++] = 2047;
        } else if (var2 == 1) {
            int var3 = class95.field1934.method1341((byte) 124, 3);
            class157.field2955.method1272(false, var3, arg0 + 119);
            int var4 = class95.field1934.method1341((byte) 92, 1);
            if (var4 == 1) {
                class102.field2018[class98.field1967++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class95.field1934.method1341((byte) 68, 3);
            class157.field2955.method1272(true, var5, arg0 - 65);
            int var6 = class95.field1934.method1341((byte) 119, 3);
            class157.field2955.method1272(true, var6, -77);
            int var7 = class95.field1934.method1341((byte) 63, 1);
            if (var7 == 1) {
                class102.field2018[class98.field1967++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class95.field1934.method1341((byte) 123, 1);
            class72.field1405 = class95.field1934.method1341((byte) 102, 2);
            int var9 = class95.field1934.method1341((byte) 81, 1);
            if (var9 == 1) {
                class102.field2018[class98.field1967++] = 2047;
            }
            int var10 = class95.field1934.method1341((byte) 110, 7);
            int var11 = class95.field1934.method1341((byte) 70, 7);
            class157.field2955.method1268(true, var11, var8 == 1, var10);
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(II[II)I")
    public static final int method655(int arg0, int arg1, int[] arg2, int arg3) {
        field1838++;
        if (arg3 != 4003) {
            field1836 = null;
        }
        return arg2[0] * arg0 + arg2[1] * arg1;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIII)I")
    public static final int method656(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 667494220) {
            field1839 = true;
        }
        field1824++;
        return (4096 - arg2) * arg0 + arg2 * arg3 >> 12;
    }

    @OriginalMember(owner = "jc", name = "d", descriptor = "(I)V")
    public static final void method657(int arg0) {
        field1842++;
        class145.field2788 = null;
        int var1 = 87 % ((arg0 - 36) / 59);
        class23.field512 = null;
        class27.field583 = null;
    }
}
