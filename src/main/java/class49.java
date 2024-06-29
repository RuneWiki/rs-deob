import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class49 {

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Lud;")
    public static class2 field801 = new class2();

    @OriginalMember(owner = "client!a", name = "f", descriptor = "[I")
    public static int[] field803 = new int[500];

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Lud;")
    public static class2 field802 = new class2();

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field805 = 64;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field807 = -1;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Lnf;")
    public static class162 field806 = new class162(64);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "Ljava/lang/String;")
    public static String field811 = "rating: ";

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field810 = -1;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Lel;")
    public static class213 field808;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Lef;")
    public static class227 field804;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method411(int arg0) {
        field803 = null;
        field802 = null;
        field811 = null;
        field804 = null;
        if (arg0 != -1) {
            method412(74, (byte) -6);
        }
        field808 = null;
        field801 = null;
        field806 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)I")
    public static final int method412(int arg0, byte arg1) {
        if (arg1 > -20) {
            return 106;
        } else {
            field800++;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIZ)V")
    public static final void method413(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class69 var5 = class255.method1723((byte) 32, arg3, 4);
        var5.method556((byte) -103);
        if (arg4) {
            field810 = 41;
        }
        field799++;
        var5.field1091 = arg0;
        var5.field1088 = arg2;
        var5.field1086 = arg1;
    }
}
