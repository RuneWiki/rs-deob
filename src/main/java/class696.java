import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class696 extends class632 {

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "I")
    private int field9706;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
    private int field9703;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "I")
    private int field9710;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
    private int field9702;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
    private int field9711;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
    private int field9701;

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
    private int field9712;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
    private int field9709;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "Lof;")
    public static class475 field9705 = new class475(9, 2);

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
    public static int field9704;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
    public static int field9707;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "I")
    public static int field9708;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIB)V", line = 5)
    public final void method1993(int arg0, int arg1, byte arg2) {
        if (arg2 < -79) {
            ++field9708;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BII)V", line = 15)
    public final void method1992(byte arg0, int arg1, int arg2) {
        if (arg0 < 96) {
            this.field9709 = -15;
        }
        ++field9704;
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 30)
    public class696(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field9706 = arg1;
        this.field9703 = arg4;
        this.field9710 = arg5;
        this.field9702 = arg7;
        this.field9711 = arg3;
        this.field9701 = arg0;
        this.field9712 = arg2;
        this.field9709 = arg6;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Z)V", line = 53)
    public static void method3932(boolean arg0) {
        if (!arg0) {
            field9705 = null;
        }
        field9705 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IBI)V", line = 63)
    public final void method1994(int arg0, byte arg1, int arg2) {
        ++field9707;
        int var4 = this.field9701 * arg0 >> 12;
        int var5 = this.field9706 * arg2 >> 12;
        int var6 = 124 / ((arg1 - 33) / 62);
        int var7 = this.field9712 * arg0 >> 12;
        int var8 = this.field9711 * arg2 >> 12;
        int var9 = this.field9703 * arg0 >> 12;
        int var10 = this.field9710 * arg2 >> 12;
        int var11 = this.field9709 * arg0 >> 12;
        int var12 = this.field9702 * arg2 >> 12;
        class172.method1103(var7, super.field8836, var8, 2048, var9, var10, var4, var5, var11, var12);
    }
}
