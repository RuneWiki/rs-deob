import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class634 extends class20 {

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    private int field8833;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    private int field8831;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    private int field8828;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    private int field8826;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field8829;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    public static int field8830;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(III)V")
    public final void method114(int arg0, int arg1, int arg2) {
        ++field8827;
        if (arg0 >= -28) {
            this.method111(-63, 76, -92);
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(III)V")
    public final void method115(int arg0, int arg1, int arg2) {
        if (arg0 > 123) {
            ++field8829;
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(IIIIII)V")
    public class634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field8833 = arg1;
        this.field8831 = arg3;
        this.field8828 = arg0;
        this.field8826 = arg2;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)V")
    public final void method111(int arg0, int arg1, int arg2) {
        if (arg2 != 52) {
            this.method114(96, -23, 98);
        }
        ++field8830;
        int var4 = this.field8828 * arg1 >> 12;
        int var5 = this.field8826 * arg1 >> 12;
        int var6 = this.field8833 * arg0 >> 12;
        int var7 = this.field8831 * arg0 >> 12;
        class288.method1713(var4, var6, 1902406796, var7, super.field222, var5);
    }
}
