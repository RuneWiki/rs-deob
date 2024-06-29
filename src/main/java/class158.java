import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class158 extends class513 {

    @OriginalMember(owner = "client!aba", name = "u", descriptor = "I")
    public int field1929;

    @OriginalMember(owner = "client!aba", name = "o", descriptor = "I")
    public int field1923;

    @OriginalMember(owner = "client!aba", name = "m", descriptor = "Lgfa;")
    public static class696 field1921 = new class696(1, 2, 2, 0);

    @OriginalMember(owner = "client!aba", name = "q", descriptor = "I")
    public static int field1925 = 0;

    @OriginalMember(owner = "client!aba", name = "s", descriptor = "Lok;")
    public static class231 field1927 = new class231();

    @OriginalMember(owner = "client!aba", name = "j", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!aba", name = "l", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!aba", name = "n", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!aba", name = "p", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!aba", name = "r", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!aba", name = "t", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method990(int arg0) {
        if (arg0 > -6) {
            field1927 = null;
        }
        field1919++;
        return (this.field1929 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)Z", line = 16)
    public final boolean method991(int arg0) {
        field1922++;
        if (arg0 != 18164) {
            this.method995((byte) -26);
        }
        return (this.field1929 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)I", line = 29)
    public final int method992(byte arg0) {
        if (arg0 != 64) {
            field1921 = null;
        }
        field1918++;
        return this.field1929 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "(I)V", line = 41)
    public static void method993(int arg0) {
        if (arg0 != -1) {
            method996(95);
        }
        field1921 = null;
        field1927 = null;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(ZI)Z", line = 53)
    public final boolean method994(boolean arg0, int arg1) {
        if (!arg0) {
            this.method997((byte) 108);
        }
        field1920++;
        return (this.field1929 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "(B)Z", line = 74)
    public final boolean method995(byte arg0) {
        field1928++;
        if (arg0 != 84) {
            field1927 = null;
        }
        return (this.field1929 & 0x36B191) >> 21 != 0;
    }

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "(I)I", line = 87)
    public static final int method996(int arg0) {
        field1924++;
        if (arg0 != 3) {
            method993(-88);
        }
        if (class617.field8851 == null) {
            return class190.field2324 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "(B)I", line = 107)
    public final int method997(byte arg0) {
        field1926++;
        int var2 = 62 / ((arg0 + 74) / 47);
        return class584.method3393(this.field1929, false);
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(II)V", line = 116)
    public class158(int arg0, int arg1) {
        this.field1929 = arg0;
        this.field1923 = arg1;
    }
}
