import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class328 extends class496 {

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public int field4840 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public int field4842 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public int field4838 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public int field4844 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public int field4835 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public int field4843 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public int field4841 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public int field4847 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Lob;")
    public class385 field4845;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "Lqp;")
    public static class586 field4836 = new class586(109, -2);

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public static int field4848 = 0;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "Lqc;")
    public static class325 field4849 = new class325(200);

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "Luf;")
    public static class353 field4850;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "Lbj;")
    public static class440 field4851;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 8)
    public static final void method2044(int arg0) {
        class257.field3747 = null;
        class358.field5201 = null;
        if (arg0 != Integer.MAX_VALUE) {
            field4848 = 39;
        }
        class377.field5549 = null;
        class16.field143 = null;
        class336.field4936 = false;
        class179.field2758 = null;
        field4839++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)Z", line = 26)
    public final boolean method2045(int arg0, int arg1, int arg2) {
        field4837++;
        if (this.field4840 <= arg2 && arg2 <= this.field4841 && this.field4847 <= arg0 && arg0 <= this.field4835) {
            return true;
        } else if (this.field4843 <= arg2 && this.field4838 >= arg2 && this.field4844 <= arg0 && arg0 <= this.field4842) {
            return true;
        } else {
            if (arg1 != Integer.MAX_VALUE) {
                this.field4847 = 126;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII)V", line = 44)
    public static final void method2046(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class206.field3077 != null) {
            class206.field3077[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class143.field1861 != null) {
            class143.field1861[arg0][arg1] = (short) arg3;
        }
        if (class642.field9324 != null) {
            class642.field9324[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lob;)V", line = 128)
    public class328(class385 arg0) {
        this.field4845 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V", line = 66)
    public static final void method2047(int arg0) {
        class429.field6303 = null;
        class259.field3800 = null;
        class128.field1691 = null;
        class341.field4994 = null;
        class319.field4756 = null;
        class634.field9250 = null;
        class463.field6700 = null;
        class372.field5384 = null;
        class148.field1920 = null;
        class551.field8209 = null;
        class191.field2900 = null;
        class445.field6486 = null;
        class386.field5646 = null;
        class542.field8106 = null;
        field4846++;
        class168.field2276 = null;
        class3.field34 = null;
        class63.field737 = null;
        class179.field2757 = null;
        if (arg0 > -43) {
            field4836 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V", line = 101)
    public static void method2048(boolean arg0) {
        if (arg0) {
            field4836 = null;
            field4849 = null;
            field4850 = null;
            field4851 = null;
        }
    }
}
