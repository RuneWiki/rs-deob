import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class196 implements class486 {

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "I")
    public int field2541;

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "Ltq;")
    public static class654 field2539 = new class654("", 11);

    @OriginalMember(owner = "client!efa", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field2542 = new String[100];

    @OriginalMember(owner = "client!efa", name = "i", descriptor = "Z")
    public static boolean field2544 = true;

    @OriginalMember(owner = "client!efa", name = "j", descriptor = "Ljava/lang/Object;")
    public static volatile Object field2545 = null;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!efa", name = "h", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method1286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field2543++;
        class290.field4140 = arg2;
        class685.field9177 = arg3;
        class684.field9130 = arg5;
        class716.field9761 = arg1;
        class416.field6000 = arg4;
        int var7 = -28 / ((arg6 + 40) / 43);
        class624.field8420 = arg0;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)V")
    public static void method1287(int arg0) {
        if (arg0 != -11745) {
            field2542 = null;
        }
        field2539 = null;
        field2545 = null;
        field2542 = null;
    }

    @OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(I)V")
    public class196(int arg0) {
        this.field2541 = arg0;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)Leo;")
    public final class313 method576(byte arg0) {
        field2537++;
        if (arg0 != 41) {
            method1287(-126);
        }
        return class601.field8185;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(BJ)I")
    public static final int method1288(byte arg0, long arg1) {
        field2538++;
        return arg0 == 33 ? (int) (arg1 / 86400000L) - 11745 : 15;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(BLgm;)Z")
    public static final boolean method1289(byte arg0, class134 arg1) {
        if (arg0 == -104) {
            field2536++;
            return class740.field10026 == arg1 || class720.field9788 == arg1 || class416.field6001 == arg1 || class640.field8632 == arg1;
        } else {
            return true;
        }
    }
}
