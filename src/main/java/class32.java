import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class32 extends class104 {

    @OriginalMember(owner = "client!faa", name = "n", descriptor = "I")
    public int field484;

    @OriginalMember(owner = "client!faa", name = "k", descriptor = "[I")
    public static int[] field481 = new int[500];

    @OriginalMember(owner = "client!faa", name = "o", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!faa", name = "l", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!faa", name = "m", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)V")
    public static void method233(int arg0) {
        if (arg0 != -1) {
            field481 = null;
        }
        field481 = null;
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(B)V")
    public static final void method234(byte arg0) {
        if (arg0 != 96) {
            method234((byte) -69);
        }
        class501.field7010.method3202((byte) 127);
        field483++;
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(ILvfa;Lrq;III)V")
    public class32(int arg0, class92 arg1, class482 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field484 = arg5;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)Lag;")
    public final class214 method210(int arg0) {
        field482++;
        return arg0 == 7288 ? class395.field5485 : null;
    }

    static {
        new class747("", 73);
        field485 = -1;
    }
}
