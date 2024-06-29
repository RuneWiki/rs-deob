import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class123 extends class181 {

    @OriginalMember(owner = "client!na", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1819 = "Use";

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    public static int field1818 = 0;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    public static int field1822 = 0;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "I")
    public static int field1825 = 0;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public static int field1824 = 0;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "Ljava/lang/String;")
    public static String field1829 = "Started 3d Library";

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public int field1820;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    public int field1823;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "[[[Ljc;")
    public static class201[][][] field1826;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
    public static void method867(int arg0) {
        field1829 = null;
        field1819 = null;
        field1826 = null;
        if (arg0 != -1) {
            method867(-99);
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
    public static final void method868(int arg0) {
        if (class259.field3975 != -1) {
            class67.method536(-1, 0, -1, class259.field3975);
            class259.field3975 = -1;
        }
        field1827++;
        if (arg0 != 24059) {
            method868(25);
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(II)I")
    public static final int method869(int arg0, int arg1) {
        field1817++;
        int var2 = 15 % ((71 - arg1) / 54);
        return arg0 & 0xFF;
    }
}
