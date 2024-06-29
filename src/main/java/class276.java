import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class276 extends class36 {

    @OriginalMember(owner = "client!saa", name = "p", descriptor = "Ldl;")
    public class56 field3849;

    @OriginalMember(owner = "client!saa", name = "q", descriptor = "[[I")
    public static int[][] field3850 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!saa", name = "s", descriptor = "I")
    public static int field3852 = 1403;

    @OriginalMember(owner = "client!saa", name = "u", descriptor = "J")
    public static long field3854 = -1L;

    @OriginalMember(owner = "client!saa", name = "r", descriptor = "Leea;")
    public static class114 field3851 = new class114();

    @OriginalMember(owner = "client!saa", name = "w", descriptor = "Lig;")
    public static class206 field3856 = new class206(110, 0);

    @OriginalMember(owner = "client!saa", name = "t", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!saa", name = "v", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!saa", name = "x", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)V", line = 10)
    public static void method1793(byte arg0) {
        field3851 = null;
        field3856 = null;
        field3850 = null;
        if (arg0 != -85) {
            field3851 = null;
        }
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(II)V", line = 30)
    public static final void method1794(int arg0, int arg1) {
        field3853++;
        class467 var2 = class541.method3144(arg0, (byte) -92, 5);
        if (arg1 >= -16) {
            field3852 = -72;
        }
        var2.method2852(0);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(III)I", line = 45)
    public static final int method1795(int arg0, int arg1, int arg2) {
        field3857++;
        return arg0 == arg1 || arg1 == 5 ? class446.field6668[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Ldl;)V", line = 59)
    public class276(class56 arg0) {
        this.field3849 = arg0;
    }
}
