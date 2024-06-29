import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class581 extends class72 {

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "[I")
    public static int[] field8213 = new int[4096];

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "[I")
    public static int[] field8211 = new int[6];

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field8212;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public static int field8214;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public static int field8215;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public static int field8216;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public static int field8217;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public static int field8218;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
    public static int field8219;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "I")
    public static int field8220;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
    public static int field8221;

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(ILcq;)V")
    public class581(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)I")
    public final int method60(int arg0) {
        ++field8217;
        if (arg0 != -3271) {
            field8211 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)I")
    public final int method58(int arg0, int arg1) {
        if (arg1 != 11260) {
            field8211 = null;
        }
        ++field8216;
        if (super.field1286.method2818(true)) {
            return 3;
        } else {
            return ~arg0 != -1 && ~super.field1286.field6674.method3652(27669) != -2 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)Z")
    public static final boolean method3365(int arg0, int arg1, int arg2) {
        ++field8219;
        if (arg0 != -13849) {
            return true;
        } else {
            return (arg2 & 384) != 0;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
    public final void method59(int arg0, int arg1) {
        super.field1282 = arg0;
        ++field8215;
        if (arg1 != 3) {
            field8211 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
    public final void method55(int arg0) {
        if (super.field1286.method2818(true)) {
            super.field1282 = 0;
        }
        ++field8218;
        if (super.field1282 < 0 && ~super.field1282 < -3) {
            super.field1282 = this.method60(-3271);
        }
        if (arg0 < 30) {
            field8211 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)Z")
    public final boolean method3366(int arg0) {
        ++field8220;
        if (super.field1286.method2818(true)) {
            return false;
        } else {
            return arg0 <= 97 ? true : true;
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lcq;)V")
    public class581(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)V")
    public static void method3367(int arg0) {
        if (arg0 != 384) {
            method3365(112, 30, -66);
        }
        field8213 = null;
        field8211 = null;
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)I")
    public final int method3368(int arg0) {
        if (arg0 != 27669) {
            field8213 = null;
        }
        ++field8214;
        return super.field1282;
    }
}
