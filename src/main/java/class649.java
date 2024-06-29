import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class649 extends class502 {

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field8972;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field8974;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field8975;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field8976;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "J")
    public static long field8973;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Lgj;")
    public static class662 field8977;

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(ILeka;)V")
    public class649(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        ++field8976;
        if (arg1 != 0) {
            field8973 = -107L;
        }
        return 3;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Leka;)V")
    public class649(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(II)V")
    public final void method52(int arg0, int arg1) {
        ++field8974;
        super.field6865 = arg0;
        if (arg1 != 0) {
            this.method55(-68);
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(B)I")
    public final int method3639(byte arg0) {
        ++field8975;
        if (arg0 < 49) {
            field8973 = 34L;
        }
        return super.field6865;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)I")
    public final int method55(int arg0) {
        ++field8972;
        if (arg0 != -2) {
            return -3;
        } else {
            return super.field6863.method2826(true) == class505.field6887 && super.field6863.method2830((byte) 117) ? 0 : 1;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
    public final void method58(boolean arg0) {
        ++field8971;
        if (!arg0) {
            field8973 = 10L;
        }
        super.field6865 = this.method55(-2);
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public static void method3640(int arg0) {
        field8977 = null;
        if (arg0 != 1) {
            method3640(33);
        }
    }
}
