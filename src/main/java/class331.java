import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class331 extends class429 {

    @OriginalMember(owner = "client!bga", name = "s", descriptor = "I")
    public static int field4537 = 0;

    @OriginalMember(owner = "client!bga", name = "t", descriptor = "I")
    public static int field4538 = 0;

    @OriginalMember(owner = "client!bga", name = "p", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!bga", name = "q", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!bga", name = "r", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!bga", name = "u", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!bga", name = "v", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IIIZ)V")
    public final void method1179(int arg0, int arg1, int arg2, boolean arg3) {
        ++field4536;
        int var5 = this.method2450(7555) * super.field5899.field4067 / 10000;
        class10.field197.method415(arg2, arg1 + 2, var5, super.field5899.field4075 - arg0, ((class587) super.field5899).field7782, 0);
        class10.field197.method415(arg2 + var5, arg1 + 2, super.field5899.field4067 - var5, super.field5899.field4075 - 2, 0, 0);
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(IIIZ)V")
    public final void method1181(int arg0, int arg1, int arg2, boolean arg3) {
        class10.field197.method423(arg1 + -2, arg0, super.field5899.field4067 + 4, super.field5899.field4075 + 2, ((class587) super.field5899).field7788, 0);
        int var5 = -63 / ((arg2 - 2) / 54);
        ++field4535;
        class10.field197.method423(arg1 + -1, arg0 + 1, super.field5899.field4067 + 2, super.field5899.field4075, 0, 0);
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lbi;Lbi;Ltq;)V")
    public class331(class449 arg0, class449 arg1, class587 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IBIIII)V")
    public static final void method1969(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4540;
        int var6 = arg4 - arg0;
        int var7 = arg3 - arg5;
        if (~var6 != -1) {
            if (var7 == 0) {
                class565.method3096(arg5, arg2, arg4, -59, arg0);
            } else if (arg1 > 63) {
                int var8 = (var7 << 12) / var6;
                int var9 = -(arg0 * var8 >> 12) + arg5;
                int var10;
                int var11;
                if (~class600.field7959 < ~arg4) {
                    var10 = (class600.field7959 * var8 >> 12) + var9;
                    var11 = class600.field7959;
                } else if (arg4 > class366.field4956) {
                    var10 = (class366.field4956 * var8 >> 12) + var9;
                    var11 = class366.field4956;
                } else {
                    var11 = arg4;
                    var10 = arg3;
                }
                int var12;
                int var13;
                if (arg0 >= class600.field7959) {
                    if (arg0 <= class366.field4956) {
                        var12 = arg0;
                        var13 = arg5;
                    } else {
                        var13 = var9 - -(class366.field4956 * var8 >> 12);
                        var12 = class366.field4956;
                    }
                } else {
                    var12 = class600.field7959;
                    var13 = (class600.field7959 * var8 >> 12) + var9;
                }
                if (~var10 <= ~class310.field4279) {
                    if (class442.field6058 < var10) {
                        var11 = (class442.field6058 - var9 << 12) / var8;
                        var10 = class442.field6058;
                    }
                } else {
                    var11 = (-var9 + class310.field4279 << 12) / var8;
                    var10 = class310.field4279;
                }
                if (~class310.field4279 < ~var13) {
                    var13 = class310.field4279;
                    var12 = (-var9 + class310.field4279 << 12) / var8;
                } else if (var13 > class442.field6058) {
                    var13 = class442.field6058;
                    var12 = (class442.field6058 - var9 << 12) / var8;
                }
                class668.method3755(arg2, var11, var10, var12, var13, (byte) -111);
            }
        } else {
            if (~var7 != -1) {
                class572.method3147(0, arg5, arg2, arg0, arg3);
            }
        }
    }
}
