import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class82 {

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "Ldb;")
    private class24 field1886 = new class24();

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "[Lqf;")
    public static class117[] field1884 = new class117[500];

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "[I")
    public static int[] field1880 = new int[25];

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field1874 = 0;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "Lqf;")
    private static class117 field1891 = class72.method514(127, "purple:");

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "Lqf;")
    public static class117 field1894 = field1891;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "Lqf;")
    public static class117 field1896 = class72.method514(119, "AUS");

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public static int field1895 = -1;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "Lqf;")
    private static class117 field1897 = class72.method514(108, "Loading title screen )2 ");

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "Lqf;")
    public static class117 field1881 = field1891;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "Lqf;")
    public static class117 field1889 = field1897;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "J")
    public static long field1878;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "Lha;")
    public static class50 field1887;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "Z")
    public static boolean field1873;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "Z")
    public static boolean field1875;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)Ldb;")
    public final class24 method639(byte arg0) {
        field1883++;
        class24 var2 = this.field1886.field470;
        if (this.field1886 == var2) {
            return null;
        } else {
            if (arg0 < 6) {
                method644((byte) -27);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method640(int arg0) {
        if (arg0 != 10892) {
            method643(47, (byte) 34, 19);
        }
        field1889 = null;
        field1880 = null;
        field1884 = null;
        field1881 = null;
        field1891 = null;
        field1897 = null;
        field1896 = null;
        field1894 = null;
        field1887 = null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)Z")
    public static final boolean method641(byte arg0) {
        field1885++;
        class152 var1 = class116.field2740;
        synchronized (class116.field2740) {
            int var2 = -125 / ((40 - arg0) / 60);
            if (class68.field1421 == class66.field1381) {
                return false;
            } else {
                class104.field2514 = class23.field457[class68.field1421];
                class85.field1929 = class119.field2840[class68.field1421];
                class68.field1421 = class68.field1421 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILdb;)V")
    public final void method642(int arg0, class24 arg1) {
        if (arg0 <= 84) {
            field1887 = null;
        }
        field1893++;
        if (arg1.field466 != null) {
            arg1.method185(-113);
        }
        arg1.field466 = this.field1886;
        arg1.field470 = this.field1886.field470;
        arg1.field466.field470 = arg1;
        arg1.field470.field466 = arg1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBI)Lmf;")
    public static final class89 method643(int arg0, byte arg1, int arg2) {
        field1877++;
        class89 var3 = class104.method801(arg0, -88);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field2084 == null || arg2 >= var3.field2084.length) {
            return null;
        } else if (arg1 <= 99) {
            return null;
        } else {
            return var3.field2084[arg2];
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)V")
    public static final void method644(byte arg0) {
        field1882++;
        class153.field3785.method250((byte) -54);
        class50.field1045.method250((byte) -54);
        int var1 = 42 / ((-arg0 - 76) / 45);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZLdb;)V")
    public final void method645(boolean arg0, class24 arg1) {
        if (arg1.field466 != null) {
            arg1.method185(-108);
        }
        arg1.field466 = this.field1886.field466;
        field1892++;
        if (!arg0) {
            field1879 = 108;
        }
        arg1.field470 = this.field1886;
        arg1.field466.field470 = arg1;
        arg1.field470.field466 = arg1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)Z")
    public static final boolean method646(int arg0, int arg1, int arg2) {
        if (arg0 <= 16) {
            field1874 = -91;
        }
        field1888++;
        if (arg2 == 0 && class90.field2209 == arg1) {
            return true;
        } else if (arg2 == 1 && class47.field949 == arg1) {
            return true;
        } else {
            return (arg2 == 2 || arg2 == 3) && class72.field1585 == arg1;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class82() {
        this.field1886.field466 = this.field1886;
        this.field1886.field470 = this.field1886;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)Ldb;")
    public final class24 method647(byte arg0) {
        class24 var2 = this.field1886.field470;
        if (arg0 <= 64) {
            field1879 = -44;
        }
        field1872++;
        if (this.field1886 == var2) {
            return null;
        } else {
            var2.method185(-117);
            return var2;
        }
    }
}
