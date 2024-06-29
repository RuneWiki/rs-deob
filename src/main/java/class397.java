import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class397 {

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "Lea;")
    public static class547 field5631 = new class547(51, 3);

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "Z")
    public static boolean field5637 = false;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "[S")
    public static short[] field5638 = new short[256];

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field5635 = 0;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "F")
    public static float field5636;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public int field5628;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public int field5629;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public int field5632;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "[[I")
    public static int[][] field5634;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lha;ZLsba;)V")
    public static final void method2305(class60 arg0, boolean arg1, class218 arg2) {
        if (!arg1) {
            return;
        }
        field5630++;
        boolean var3 = class761.field10628.method4165(arg2.field2773, arg2.field2771, arg0, arg2.field2723 ? class653.field9086.field1121 : null, arg2.field2826, arg2.field2774, arg2.field2833 | 0xFF000000, 24056) == null;
        if (var3) {
            class149.field1905.method725(new class109(arg2.field2771, arg2.field2826, arg2.field2773, arg2.field2833 | 0xFF000000, arg2.field2774, arg2.field2723), -20911);
            class277.method1652(1, arg2);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static void method2306(int arg0) {
        if (arg0 != -12477) {
            method2306(4);
        }
        field5638 = null;
        field5631 = null;
        field5634 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IILjga;Lni;IIZ)V")
    public static final void method2307(int arg0, int arg1, class716 arg2, class522 arg3, int arg4, int arg5, boolean arg6) {
        class257.method1547(arg3, arg6, arg4, arg1, arg5, -16523);
        field5633++;
        class520.field6997 = arg2;
        if (arg0 != 256) {
            field5635 = 3;
        }
    }
}
