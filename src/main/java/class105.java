import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class105 extends class70 {

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field1914 = -1;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1919 = "Loading world list data";

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "[F")
    public static float[] field1924 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "[I")
    public static int[] field1922 = new int[4096];

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public int field1910;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public int field1911;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public int field1912;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public int field1913;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public int field1916;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public int field1917;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public int field1918;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public int field1920;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public int field1921;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public int field1923;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public int field1925;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    public int field1926;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "[Lwf;")
    public static class67[] field1928;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V", line = 5)
    public static void method784(byte arg0) {
        field1922 = null;
        field1928 = null;
        field1919 = null;
        field1924 = null;
        if (arg0 != -72) {
            field1914 = 1;
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1922[var0] = class349.method2496(var0, 126);
        }
    }
}
