import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class462 extends class408 {

    @OriginalMember(owner = "client!nq", name = "C", descriptor = "Lol;")
    public class285 field6809;

    @OriginalMember(owner = "client!nq", name = "E", descriptor = "Lfl;")
    public class741 field6811;

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
    public int field6808;

    @OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
    public int field6810;

    @OriginalMember(owner = "client!nq", name = "G", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!nq", name = "H", descriptor = "I")
    public int field6813;

    @OriginalMember(owner = "client!nq", name = "I", descriptor = "I")
    public int field6814;

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "I")
    public int field6815;

    @OriginalMember(owner = "client!nq", name = "K", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!nq", name = "A", descriptor = "Lqq;")
    public static class477 field6807;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V", line = 3)
    public static void method2816(int arg0) {
        field6807 = null;
        if (arg0 != 0) {
            field6812 = -19;
        }
    }

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "(I)V", line = 21)
    public final void method2817(int arg0) {
        this.field6810 = this.field6809.field4045;
        this.field6813 = this.field6809.field4049;
        this.field6815 = this.field6809.field4048;
        field6816++;
        if (this.field6809.field4046 != null) {
            this.field6809.field4046.method776(this.field6811.field10390, this.field6811.field10391, this.field6811.field10393, class341.field4957);
        }
        this.field6808 = class341.field4957[2];
        if (arg0 != 28159) {
            method2816(-26);
        }
        this.field6814 = class341.field4957[0];
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIII)I", line = 41)
    public static final int method2818(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 8373) {
            return 25;
        }
        field6805++;
        if (arg1 <= arg2) {
            return arg2 <= arg0 ? arg2 : arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lol;Lpaa;)V", line = 60)
    public class462(class285 arg0, class626 arg1) {
        this.field6809 = arg0;
        this.field6811 = this.field6809.method1824(94);
        this.method2817(28159);
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)V", line = 72)
    public static final void method2819(int arg0, int arg1) {
        if (class63.field916.field10163.method2181(17503) == 0) {
            arg1 = -1;
        }
        field6806++;
        if (class724.field10105 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class196 var2 = class123.field1667.method1564(33, arg1);
            class129 var3 = var2.method1365(85);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class179.field2759.method4053(class106.field1476, var3.method921(), 25015, var3.method913(), new Point(var2.field2980, var2.field2972), var3.method912());
                class724.field10105 = arg1;
            }
        }
        if (arg1 == -1 && class724.field10105 != -1) {
            class179.field2759.method4053(class106.field1476, null, arg0 ^ 0xFFFFCD23, -1, new Point(), -1);
            class724.field10105 = -1;
        }
        if (arg0 != -21356) {
            field6812 = 95;
        }
    }
}
