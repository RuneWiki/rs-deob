import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class101 {

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public int field1894 = -1;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "J")
    public static long field1895 = 0L;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Lkg;")
    public static class115 field1893 = new class115(64);

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Lmb;")
    private static class132 field1899 = class166.method1092("Loading interfaces )2 ", 111);

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "Lmb;")
    public static class132 field1896 = field1899;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "Llc;")
    public static class122 field1897 = new class122(4096);

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "[Lmb;")
    public static class132[] field1901 = new class132[1000];

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Lmb;")
    public static class132 field1902 = class166.method1092("auf einer freien Welt zu spielen)3", 127);

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field1903 = -1;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Lmd;")
    public class134 field1892;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Loc;")
    public static class155 field1888;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Lii;")
    public static class96 field1898;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "[I")
    public int[] field1891;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "[Lmb;")
    public class132[] field1890;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "[[[Lpf;")
    public static class169[][][] field1900;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)Z")
    public static final boolean method624(int arg0, int arg1) {
        field1889++;
        if (arg0 != 2000) {
            return false;
        } else if (arg1 < 0) {
            return false;
        } else {
            int var2 = class31.field488[arg1];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 1003;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static void method625(int arg0) {
        field1896 = null;
        field1900 = null;
        field1899 = null;
        field1893 = null;
        field1898 = null;
        if (arg0 != -1) {
            method624(-45, -50);
        }
        field1897 = null;
        field1888 = null;
        field1901 = null;
        field1902 = null;
    }
}
