import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class111 extends class166 {

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public int field1815 = 0;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public int field1825 = -1;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public int field1810;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public int field1814;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public int field1816;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public int field1819;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public int field1820;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    public int field1821;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    public int field1822;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public int field1823;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public int field1824;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    public int field1827;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "Z")
    public static boolean field1818;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "[I")
    public static int[] field1826;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([[II)V")
    public static final void method787(int[][] arg0, int arg1) {
        class154.field2406 = arg0;
        if (arg1 <= 63) {
            field1818 = true;
        }
        field1811++;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
    public static void method788(int arg0) {
        if (arg0 != -1) {
            method788(0);
        }
        field1826 = null;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)V")
    public static final void method789(int arg0, int arg1) {
        field1812++;
        if (class53.method394(false, arg1)) {
            if (arg0 < 73) {
                method788(26);
            }
            class263.method1772(-1, class193.field3052[arg1], -120);
        }
    }
}
