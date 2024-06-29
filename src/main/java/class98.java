import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class98 {

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "Loh;")
    public static class263 field1878 = class253.method1681(-124, "Nehmen");

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Loh;")
    public static class263 field1880 = class253.method1681(-127, "<col=ffffff>");

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "Loh;")
    private static class263 field1893 = class253.method1681(-125, "wave2:");

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Loh;")
    public static class263 field1884 = field1893;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "[Loh;")
    public static class263[] field1879 = new class263[100];

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field1894 = -1;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Loh;")
    public static class263 field1888 = field1893;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public int field1882;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public int field1883;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public int field1885;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public int field1889;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public int field1890;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public int field1897;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    public int field1899;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "Lug;")
    public static class195 field1892;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "[B")
    public byte[] field1886;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "[B")
    public byte[] field1891;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method671(int arg0) {
        field1878 = null;
        field1892 = null;
        field1884 = null;
        field1888 = null;
        field1880 = null;
        if (arg0 >= 76) {
            field1879 = null;
            field1893 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIII)I")
    public static final int method672(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -257) {
            field1888 = null;
        }
        field1895++;
        if (arg3 <= arg2) {
            return arg2 <= arg1 ? arg2 : arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
    public static final int method673(int arg0, KeyEvent arg1) {
        field1898++;
        if (arg0 >= -112) {
            method671(-46);
        }
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IJ)Loh;")
    public static final class263 method674(int arg0, long arg1) {
        if (arg0 == -25940) {
            field1887++;
            return class217.method1473(false, false, arg1, 10);
        } else {
            return null;
        }
    }
}
