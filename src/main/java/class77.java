import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class77 extends class97 {

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public int field1898;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "I")
    private int field1906;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "[I")
    public int[] field1903;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "[[I")
    public int[][] field1897;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "Lwd;")
    private static class150 field1901 = class2.method9(true, "Loading title screen )2 ");

    @OriginalMember(owner = "client!la", name = "x", descriptor = "Lwd;")
    private static class150 field1900 = class2.method9(true, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!la", name = "G", descriptor = "[I")
    public static int[] field1909 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!la", name = "J", descriptor = "Lwd;")
    public static class150 field1912 = class2.method9(true, "mapedge");

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    public static int field1902 = 0;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "Lwd;")
    public static class150 field1907 = class2.method9(true, "backright2");

    @OriginalMember(owner = "client!la", name = "B", descriptor = "Lwd;")
    public static class150 field1904 = field1901;

    @OriginalMember(owner = "client!la", name = "K", descriptor = "Lwd;")
    public static class150 field1913 = field1900;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!la", name = "L", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "Lqd;")
    public static class114 field1895;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "Ljava/awt/Image;")
    public static Image field1910;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILva;)V")
    public static final void method569(int arg0, class141 arg1) {
        if (arg0 != 15665) {
            return;
        }
        int var2 = arg1.field3323 >> 16;
        field1911++;
        if (class66.field1688 == var2 || class29.field882 == var2) {
            class40.field1067 = true;
        }
        if (class118.field2702 == var2 || class42.field1111[class24.field695] == var2) {
            class82.field1972 = true;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
    public static final void method570(int arg0) {
        field1899++;
        if (class20.field517 && class17.field466 != class107.field2435) {
            class109.method781(class17.field466, (byte) -8, class46.field1244.field2934[0], class142.field3441, class46.field1244.field2963[0], class92.field2144);
            return;
        }
        if (arg0 > -37) {
            field1902 = 105;
        }
        if (class17.field466 != class113.field2600) {
            class113.field2600 = class17.field466;
            class70.method537(class17.field466, 6758);
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(B)V")
    public static void method571(byte arg0) {
        field1909 = null;
        field1895 = null;
        if (arg0 <= 60) {
            return;
        }
        field1900 = null;
        field1910 = null;
        field1912 = null;
        field1904 = null;
        field1907 = null;
        field1901 = null;
        field1913 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)I")
    public static final int method572(int arg0, int arg1, int arg2) {
        field1908++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 / 128;
        if (arg0 < 27) {
            field1909 = null;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Z")
    public static final boolean method573(int arg0, int arg1) {
        field1896++;
        if (arg1 < 119) {
            field1910 = null;
        }
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(I[B)V")
    public class77(int arg0, byte[] arg1) {
        this.field1898 = arg0;
        class148 var3 = new class148(arg1);
        this.field1906 = var3.method1137(255);
        this.field1903 = new int[this.field1906];
        this.field1897 = new int[this.field1906][];
        for (int var4 = 0; var4 < this.field1906; var4++) {
            this.field1903[var4] = var3.method1137(255);
        }
        for (int var5 = 0; var5 < this.field1906; var5++) {
            this.field1897[var5] = new int[var3.method1137(255)];
        }
        for (int var6 = 0; var6 < this.field1906; var6++) {
            for (int var7 = 0; var7 < this.field1897[var6].length; var7++) {
                this.field1897[var6][var7] = var3.method1137(255);
            }
        }
    }
}
