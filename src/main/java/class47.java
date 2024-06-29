import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class47 extends class441 {

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    private int field570;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    private int field571;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    private int field575;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "Lpf;")
    public static class425 field574 = new class425(47, 8);

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "Ltm;")
    public static class354 field577 = new class354();

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "Lns;")
    public static class55 field580 = new class55(7, 4);

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "[I")
    public static int[] field582;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BII)V")
    public final void method175(byte arg0, int arg1, int arg2) {
        ++field572;
        if (arg0 > -67) {
            this.field570 = 104;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
    public static void method263(int arg0) {
        if (arg0 > -21) {
            field582 = null;
        }
        field577 = null;
        field582 = null;
        field580 = null;
        field574 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
    public final void method176(int arg0, int arg1, int arg2) {
        if (arg1 != 307) {
            this.method174(-40, false, 82);
        }
        ++field578;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IIIIII)V")
    public class47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field570 = arg3;
        this.field576 = arg1;
        this.field571 = arg0;
        this.field575 = arg2;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZI)V")
    public final void method174(int arg0, boolean arg1, int arg2) {
        ++field581;
        int var4 = this.field571 * arg2 >> 12;
        int var5 = this.field575 * arg2 >> 12;
        int var6 = this.field576 * arg0 >> 12;
        int var7 = this.field570 * arg0 >> 12;
        if (!arg1) {
            this.method175((byte) 95, 72, 22);
        }
        class374.method2245(-223616820, var6, var7, var4, var5, super.field6485);
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(BII)I")
    public static final int method264(byte arg0, int arg1, int arg2) {
        ++field573;
        if (arg1 < arg2) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        int var4 = 6 % ((-59 - arg0) / 42);
        while (arg2 != 0) {
            int var5 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var5;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lui;ILui;)V")
    public static final void method265(class426 arg0, int arg1, class426 arg2) {
        ++field579;
        if (arg2.field6257 != null) {
            arg2.method2627(0);
        }
        arg2.field6251 = arg0.field6251;
        arg2.field6257 = arg0;
        arg2.field6257.field6251 = arg2;
        if (arg1 < -113) {
            arg2.field6251.field6257 = arg2;
        }
    }
}
