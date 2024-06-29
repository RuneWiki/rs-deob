import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class169 {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field2632 = 0;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "[I")
    public static int[] field2639 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public int field2638;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Lqo;")
    public static class21 field2635;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Lqaa;")
    public class26 field2641;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Lkda;")
    public static class328 field2636;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "[I")
    public int[] field2633;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static void method1202(byte arg0) {
        field2636 = null;
        field2635 = null;
        field2639 = null;
        if (arg0 <= 85) {
            field2632 = -100;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V")
    public static final void method1203(int arg0, int arg1) {
        field2640++;
        int var2 = -50 / ((arg1 + 37) / 47);
        class221 var3 = class65.method413(2, arg0, (byte) 122);
        var3.method1432(0);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static final void method1204(int arg0) {
        field2634++;
        class221 var1 = class65.method413(15, 0, (byte) 94);
        var1.method1432(0);
        if (arg0 >= -7) {
            field2639 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)Lhu;")
    public static final class113 method1205(int arg0, int arg1, int arg2) {
        class205 var3 = class420.field5697[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3047;
    }
}
