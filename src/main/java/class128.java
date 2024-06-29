import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class128 extends class381 {

    @OriginalMember(owner = "client!om", name = "u", descriptor = "I")
    public int field1812 = -1;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "I")
    public int field1822 = 0;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "Z")
    public static boolean field1807 = false;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "I")
    public static int field1811 = 0;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "I")
    public static int field1813 = 0;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "I")
    public static int field1815 = -1;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "Ljava/lang/String;")
    public static String field1817 = "Loaded world list data";

    @OriginalMember(owner = "client!om", name = "I", descriptor = "I")
    public static int field1826 = 0;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "Ljava/lang/String;")
    public static String field1825 = "Loaded textures";

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public int field1803;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    public int field1804;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public int field1806;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "I")
    public int field1808;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public int field1809;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "I")
    public int field1816;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    public int field1818;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "I")
    public int field1819;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "I")
    public int field1823;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "I")
    public int field1827;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!om", name = "D", descriptor = "Lid;")
    public static class242 field1821;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "Lrk;")
    public static class427 field1810;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V", line = 11)
    public static void method1001(int arg0) {
        field1825 = null;
        field1817 = null;
        field1810 = null;
        if (arg0 > -121) {
            field1825 = null;
        }
        field1821 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IBILrk;)Lmr;", line = 56)
    public static final class84 method1002(int arg0, byte arg1, int arg2, class427 arg3) {
        field1820++;
        byte[] var4 = arg3.method2633(arg2, -1, arg0);
        if (var4 == null) {
            return null;
        } else {
            if (arg1 <= 125) {
                method1001(44);
            }
            return new class84(var4);
        }
    }
}
