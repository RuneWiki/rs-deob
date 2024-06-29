import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class605 extends class72 {

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field8785 = 0;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public static int field8787 = 0;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field8790 = 0;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field8786;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public static int field8788;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field8792;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)Z", line = 5)
    public final boolean method3503(int arg0) {
        ++field8789;
        if (super.field1286.method2818(true)) {
            return false;
        } else {
            return arg0 <= 97 ? true : true;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)I", line = 20)
    public final int method58(int arg0, int arg1) {
        if (arg1 != 11260) {
            this.method58(-71, -21);
        }
        ++field8792;
        return super.field1286.method2818(true) ? 3 : 1;
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)I", line = 35)
    public final int method3504(int arg0) {
        ++field8793;
        if (arg0 != 27669) {
            field8785 = -112;
        }
        return super.field1282;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lcq;)V", line = 46)
    public class605(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)I", line = 56)
    public final int method60(int arg0) {
        if (arg0 != -3271) {
            field8790 = -105;
        }
        ++field8788;
        return 1;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 67)
    public final void method55(int arg0) {
        if (super.field1286.method2818(true)) {
            super.field1282 = 0;
        }
        ++field8786;
        if (arg0 <= 30) {
            this.method3503(93);
        }
        if (~super.field1282 != -2 && ~super.field1282 != -1) {
            super.field1282 = this.method60(-3271);
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(ILcq;)V", line = 83)
    public class605(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V", line = 93)
    public final void method59(int arg0, int arg1) {
        super.field1282 = arg0;
        if (arg1 != 3) {
            field8785 = 39;
        }
        ++field8791;
    }
}
