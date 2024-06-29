import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class143 extends class5 {

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "Lof;")
    public static class446 field1907 = new class446("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!eq", name = "y", descriptor = "Z")
    public static boolean field1915 = false;

    @OriginalMember(owner = "client!eq", name = "x", descriptor = "Lla;")
    public static class319 field1914 = new class319(109, 12);

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "[I")
    public static int[] field1916 = new int[14];

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    public int field1900;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
    public int field1901;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
    public int field1902;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
    public int field1905;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
    public int field1909;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "I")
    public int field1910;

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "Lga;")
    public class282 field1903;

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "Lga;")
    public class282 field1911;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "Ljava/lang/String;")
    public String field1906;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "Z")
    public boolean field1904;

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "[Ljava/lang/Object;")
    public Object[] field1912;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)Z", line = 10)
    public static final boolean method955(int arg0, int arg1) {
        if (arg0 != -7) {
            field1914 = null;
        }
        field1908++;
        return arg1 == 2 || arg1 == 6 || arg1 == 9;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)Z", line = 30)
    public static final boolean method956(int arg0, int arg1, int arg2) {
        if (arg2 != 19688) {
            field1915 = false;
        }
        field1913++;
        return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V", line = 41)
    public static void method957(byte arg0) {
        if (arg0 == 26) {
            field1916 = null;
            field1914 = null;
            field1907 = null;
        }
    }
}
