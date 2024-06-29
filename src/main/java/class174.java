import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class174 extends class137 {

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    private int field2589;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    private int field2586;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
    private int field2592;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    private int field2591;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2584 = "green:";

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Lag;")
    public static class188 field2577 = null;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "Ljava/lang/String;")
    public static String field2588 = null;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "[I")
    public static int[] field2587 = new int[200];

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "[Lqd;")
    public static class3[] field2590;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)V")
    public final void method550(int arg0, int arg1, int arg2) {
        ++field2578;
        if (arg0 != 0) {
            this.field2591 = 56;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)V")
    public static final void method1143(byte arg0, int arg1) {
        class5.field88.method1778(arg1, -45);
        int var2 = -57 / ((arg0 - 34) / 41);
        ++field2585;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZII)V")
    public final void method542(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.method542(false, -18, 83);
        }
        ++field2580;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    public static void method1144(int arg0) {
        field2590 = null;
        field2577 = null;
        field2587 = null;
        field2588 = null;
        if (arg0 <= 119) {
            method1143((byte) -80, 94);
        }
        field2584 = null;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(IIIIII)V")
    public class174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2589 = arg0;
        this.field2586 = arg3;
        this.field2592 = arg2;
        this.field2591 = arg1;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)V")
    public final void method549(int arg0, int arg1, int arg2) {
        int var4 = this.field2589 * arg0 >> 12;
        int var5 = this.field2592 * arg0 >> 12;
        ++field2579;
        int var6 = this.field2586 * arg1 >> 12;
        int var7 = this.field2591 * arg1 >> 12;
        class295.method1978(var5, var6, var7, arg2, var4, super.field2124);
    }
}
