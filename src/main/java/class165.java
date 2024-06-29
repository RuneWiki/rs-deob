import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class165 {

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public int field2433 = 0;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public int field2436 = 0;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public int field2437 = 2048;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public int field2440 = 2048;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field2432 = 10;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILlk;)V", line = 21)
    public final void method1017(int arg0, class425 arg1) {
        field2439++;
        if (arg0 > -105) {
            return;
        }
        while (true) {
            int var3 = arg1.method2503(true);
            if (var3 == 0) {
                return;
            }
            this.method1018(var3, arg1, true);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILlk;Z)V", line = 43)
    private final void method1018(int arg0, class425 arg1, boolean arg2) {
        field2434++;
        if (arg0 == 1) {
            this.field2433 = arg1.method2503(true);
        } else if (arg0 == 2) {
            this.field2437 = arg1.method2508(true);
        } else if (arg0 == 3) {
            this.field2440 = arg1.method2508(true);
        } else if (arg0 == 4) {
            this.field2436 = arg1.method2514(9786);
        }
        if (!arg2) {
            this.method1017(-63, (class425) null);
        }
    }
}
