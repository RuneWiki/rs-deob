import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class185 extends class42 {

    @OriginalMember(owner = "client!up", name = "o", descriptor = "I")
    public int field2729 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!up", name = "s", descriptor = "I")
    public int field2733 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!up", name = "t", descriptor = "I")
    public int field2734 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!up", name = "w", descriptor = "I")
    public int field2737 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!up", name = "r", descriptor = "I")
    public int field2732 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!up", name = "z", descriptor = "I")
    public int field2740 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!up", name = "y", descriptor = "I")
    public int field2739 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!up", name = "B", descriptor = "I")
    public int field2742 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!up", name = "v", descriptor = "Lau;")
    public class528 field2736;

    @OriginalMember(owner = "client!up", name = "p", descriptor = "J")
    public static long field2730 = 0L;

    @OriginalMember(owner = "client!up", name = "u", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!up", name = "x", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!up", name = "A", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!up", name = "q", descriptor = "[[I")
    public static int[][] field2731;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)I")
    public static final int method1278(byte arg0) {
        if (arg0 == -21) {
            field2741++;
            return 6;
        } else {
            return 88;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IZI)Z")
    public final boolean method1279(int arg0, boolean arg1, int arg2) {
        field2735++;
        if (arg1) {
            method1278((byte) 43);
        }
        if (this.field2740 <= arg0 && arg0 <= this.field2732 && this.field2739 <= arg2 && arg2 <= this.field2742) {
            return true;
        } else {
            return arg0 >= this.field2729 && this.field2737 >= arg0 && this.field2734 <= arg2 && arg2 <= this.field2733;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)V")
    public static void method1280(boolean arg0) {
        field2731 = null;
        if (!arg0) {
            method1280(true);
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lau;)V")
    public class185(class528 arg0) {
        this.field2736 = arg0;
    }
}
