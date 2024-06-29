import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class422 extends class302 {

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    private int field6348;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    private int field6339;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    private int field6344;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    private int field6343;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "Lvp;")
    public static class123 field6338 = new class123();

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "J")
    public static long field6346;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBIIIII)V", line = 10)
    public static final void method2538(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class308[] var7 = class409.field6169;
        int var8 = 35 % ((-10 - arg1) / 44);
        for (int var9 = 0; var7.length > var9; ++var9) {
            class308 var10 = var7[var9];
            if (var10 != null && var10.field4436 == 2) {
                class12.method78(0, var10.field4431, arg0, var10.field4424, arg2 >> 1, var10.field4425 * 2, var10.field4428, arg5, arg6 >> 1);
                if (class158.field2321[0] > -1 && ~(class317.field4559 % 20) > -11) {
                    class250.field3711[var10.field4434].method3121(class158.field2321[0] + -12 + arg3, class158.field2321[1] + arg4 + -28);
                }
            }
        }
        ++field6340;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V", line = 41)
    public static void method2539(byte arg0) {
        field6338 = null;
        if (arg0 < 100) {
            field6338 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIILlh;Llh;)V", line = 60)
    public static final void method2540(int arg0, int arg1, int arg2, class364 arg3, class364 arg4) {
        class518 var5 = class110.method674(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field7559 = arg3;
            var5.field7570 = arg4;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(III)V", line = 70)
    public final void method403(int arg0, int arg1, int arg2) {
        ++field6341;
        int var4 = this.field6343 * arg0 >> 12;
        int var5 = this.field6344 * arg0 >> 12;
        int var6 = this.field6339 * arg2 >> 12;
        if (arg1 == 4802) {
            int var7 = this.field6348 * arg2 >> 12;
            class518.method3050(super.field4267, var7, var6, var4, (byte) 85, var5);
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIIII)V", line = 89)
    public class422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field6348 = arg3;
        this.field6339 = arg1;
        this.field6344 = arg2;
        this.field6343 = arg0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V", line = 102)
    public final void method405(int arg0, int arg1, int arg2) {
        if (arg0 != 2) {
            this.method403(93, 71, 106);
        }
        ++field6347;
        int var4 = this.field6343 * arg1 >> 12;
        int var5 = this.field6344 * arg1 >> 12;
        int var6 = this.field6339 * arg2 >> 12;
        int var7 = this.field6348 * arg2 >> 12;
        class269.method1778(var5, var4, super.field4267, super.field4273, var7, var6, true, super.field4272);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIZ)V", line = 121)
    public final void method404(int arg0, int arg1, boolean arg2) {
        ++field6342;
        if (!arg2) {
            method2538(-50, (byte) 20, 48, 60, 118, -21, -92);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILkn;IIILqa;)V", line = 132)
    public static final void method2541(int arg0, class519 arg1, int arg2, int arg3, int arg4, class162 arg5) {
        ++field6345;
        class464 var6 = class57.field872.method1202(true, arg1.field7611);
        if (var6.field6877 != -1) {
            int var8;
            if (arg1.field7608) {
                int var7 = arg1.field7605 + arg4;
                var8 = var7 & 3;
            } else {
                var8 = 0;
            }
            class529 var9 = var6.method2790(var8, arg1.field7634, arg5, 3);
            if (var9 != null) {
                int var10 = arg1.field7648;
                int var11 = arg1.field7614;
                if (~(var8 & 1) == -2) {
                    var11 = arg1.field7648;
                    var10 = arg1.field7614;
                }
                int var12 = var9.method105();
                if (arg3 != 4) {
                    method2540(8, 20, -12, (class364) null, (class364) null);
                }
                int var13 = var9.method100();
                if (var6.field6874) {
                    var12 = var10 * 4;
                    var13 = var11 * 4;
                }
                if (var6.field6873 == 0) {
                    var9.method3123(arg0, -(var11 * 4) + arg2 + 4, var12, var13);
                } else {
                    var9.method106(arg0, -((var11 + -1) * 4) + arg2, var12, var13, 0, -16777216 | var6.field6873, 1);
                }
            }
        }
    }
}
