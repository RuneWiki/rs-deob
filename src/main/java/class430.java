import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class430 extends class381 {

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public int field6119 = -1;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "Z")
    public boolean field6117 = false;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "Lik;")
    public static class410 field6116 = new class410(64);

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "[[I")
    public static int[][] field6125 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "Lon;")
    public static class35 field6126 = new class35(64);

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public int field6114;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public int field6115;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public int field6120;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    public int field6122;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    public int field6124;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
    public static void method2676(int arg0) {
        if (arg0 != 5) {
            field6118 = -34;
        }
        field6116 = null;
        field6126 = null;
        field6125 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method2677(int arg0, String arg1, boolean arg2) {
        class382.field5353++;
        class355.field4828.method1801(94, (byte) -98);
        field6123++;
        class355.field4828.method1824(83, class408.method2528(-99, arg1) + 1);
        if (!arg2) {
            field6118 = -58;
        }
        class355.field4828.method1836(arg0, -1);
        class355.field4828.method1827(0, arg1);
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(I)V")
    public class430(int arg0) {
        this.field6119 = arg0;
    }
}
