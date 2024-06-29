import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class159 extends class502 {

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "[I")
    public static int[] field2569 = new int[4];

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Lul;")
    public static class599 field2562 = new class599(2);

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
    public final void method58(boolean arg0) {
        ++field2566;
        if (super.field6863.field6725.method3781((byte) 119) && !class357.method2201(super.field6863.field6725.method3784((byte) 82), 5)) {
            super.field6865 = 0;
        }
        if (!arg0) {
            this.method1227(-108);
        }
        if (~super.field6865 > -1 || ~super.field6865 < -2) {
            super.field6865 = this.method55(-2);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
    public static void method1225(int arg0) {
        field2569 = null;
        if (arg0 == 3) {
            field2562 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(II)V")
    public final void method52(int arg0, int arg1) {
        if (arg1 != 0) {
            field2562 = null;
        }
        ++field2564;
        super.field6865 = arg0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        ++field2563;
        if (arg1 != 0) {
            return -43;
        } else {
            return !class357.method2201(super.field6863.field6725.method3784((byte) 73), arg1 + 5) ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)I")
    public final int method1226(byte arg0) {
        ++field2567;
        return arg0 <= 49 ? -126 : super.field6865;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(ILeka;)V")
    public class159(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)I")
    public final int method55(int arg0) {
        ++field2565;
        return arg0 != -2 ? 81 : 0;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)Z")
    public final boolean method1227(int arg0) {
        ++field2568;
        if (!class357.method2201(super.field6863.field6725.method3784((byte) 107), 5)) {
            return false;
        } else {
            if (arg0 != 0) {
                field2562 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Leka;)V")
    public class159(class492 arg0) {
        super(arg0);
    }
}
