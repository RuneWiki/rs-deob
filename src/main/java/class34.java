import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class34 extends class64 {

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    private final int field665;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    private final int field664;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    private final int field672;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    private final int field669;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public static int field668 = 0;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    public static int field671 = 0;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(III)V")
    public final void method275(int arg0, int arg1, int arg2) {
        ++field666;
        int var4 = this.field665 * arg0 >> 12;
        int var5 = this.field672 * arg0 >> 12;
        int var6 = this.field664 * arg2 >> 12;
        int var7 = this.field669 * arg2 >> 12;
        class14.method108(var5, var7, false, super.field1224, super.field1223, super.field1219, var6, var4);
        if (arg1 <= 52) {
            field667 = -48;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IBI)V")
    public final void method276(int arg0, byte arg1, int arg2) {
        ++field662;
        int var4 = this.field665 * arg2 >> 12;
        int var5 = this.field669 * arg0 >> 12;
        int var6 = this.field664 * arg0 >> 12;
        int var7 = this.field672 * arg2 >> 12;
        int var8 = -22 % ((arg1 - -70) / 37);
        class240.method1634(var5, 1000, var4, super.field1224, var7, var6);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(IIIIIII)V")
    public class34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field665 = arg0;
        this.field664 = arg1;
        this.field672 = arg2;
        this.field669 = arg3;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(III)V")
    public final void method277(int arg0, int arg1, int arg2) {
        ++field670;
        int var4 = this.field665 * arg1 >> 12;
        int var5 = -14 % ((-5 - arg2) / 54);
        int var6 = this.field669 * arg0 >> 12;
        int var7 = this.field672 * arg1 >> 12;
        int var8 = this.field664 * arg0 >> 12;
        class93.method715(var6, var4, super.field1219, (byte) 76, var7, var8, super.field1223);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)Z")
    public static final boolean method278(byte arg0, int arg1) {
        ++field663;
        int var2 = -94 / ((arg0 - -56) / 57);
        return ~((arg1 & 1685758979) >> 30) != -1;
    }
}
