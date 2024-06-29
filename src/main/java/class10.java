import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class10 extends class288 {

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    private int field172;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    private int field173;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    private int field178;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Z")
    public static boolean field171 = true;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(III)V")
    public final void method104(int arg0, int arg1, int arg2) {
        if (arg0 > -31) {
            this.method106(115, -57, 53);
        }
        int var4 = this.field172 * arg1 >> 12;
        ++field176;
        int var5 = this.field180 * arg2 >> 12;
        int var6 = this.field173 * arg2 >> 12;
        int var7 = this.field178 * arg1 >> 12;
        class258.method1749(var6, super.field4559, var4, 5490, var7, var5);
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(IIIIIII)V")
    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field172 = arg1;
        this.field180 = arg0;
        this.field173 = arg2;
        this.field178 = arg3;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(III)V")
    public final void method105(int arg0, int arg1, int arg2) {
        ++field181;
        int var4 = this.field180 * arg0 >> 12;
        int var5 = this.field173 * arg0 >> 12;
        int var6 = this.field172 * arg1 >> 12;
        int var7 = this.field178 * arg1 >> 12;
        if (arg2 >= -11) {
            this.field180 = -17;
        }
        class25.method205(true, var4, super.field4567, super.field4569, var6, var5, super.field4559, var7);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)V")
    public final void method106(int arg0, int arg1, int arg2) {
        if (arg0 != 1429) {
            field171 = true;
        }
        ++field179;
    }
}
