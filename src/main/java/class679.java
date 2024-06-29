import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class679 extends class127 {

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "[I")
    public static int[] field9093 = new int[13];

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "[I")
    public static int[] field9089 = new int[1];

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
    public static int field9087;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    public static int field9088;

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
    public static int field9090;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "I")
    public static int field9092;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "[Z")
    public static boolean[] field9091;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BIII)V")
    public final void method905(byte arg0, int arg1, int arg2, int arg3) {
        ++field9092;
        super.field1747 = arg2;
        super.field1748 = arg3;
        int var5 = 18 / ((arg0 - -54) / 34);
        super.field1742 = arg1;
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)V")
    public static final void method3731(int arg0) {
        class646.field8702 = arg0;
        class453.field6502 = arg0;
        class235.field3123 = arg0;
        class247.field3226 = arg0;
        ++field9087;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V")
    public static final void method3732(int arg0, int arg1) {
        ++field9088;
        class674.field9021 = 1000000000L / (long) arg0;
        if (arg1 != 13) {
            field9093 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIIIIF)V")
    public class679(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IF)V")
    public final void method906(int arg0, float arg1) {
        if (arg0 == -17359) {
            super.field1746 = arg1;
            ++field9090;
        }
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)V")
    public static void method3733(byte arg0) {
        field9089 = null;
        field9091 = null;
        if (arg0 < -120) {
            field9093 = null;
        }
    }
}
