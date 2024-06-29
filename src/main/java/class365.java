import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class365 extends class509 {

    @OriginalMember(owner = "client!li", name = "nb", descriptor = "Lrda;")
    public class578 field5523;

    @OriginalMember(owner = "client!li", name = "rb", descriptor = "[I")
    public static int[] field5527 = new int[32];

    @OriginalMember(owner = "client!li", name = "lb", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!li", name = "mb", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!li", name = "ob", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!li", name = "pb", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!li", name = "qb", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method2346(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5521;
        if (class113.field1385 <= -arg1 + arg2 && class4.field43 >= arg1 + arg2 && ~(-arg1 + arg3) <= ~class418.field6298 && arg1 + arg3 <= class461.field6877) {
            class521.method3080(arg2, arg3, arg4, 120, arg1);
        } else {
            class73.method485(arg1, arg4, arg3, arg2, 0);
        }
        if (arg0 != 110) {
            field5527 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IJ)V", line = 22)
    public static final void method2347(int arg0, long arg1) {
        if (class431.field6408 != null) {
            if (class236.field3384 != 1 && class236.field3384 != 5) {
                if (~class236.field3384 == -5) {
                    class357.method2242(arg0 + 3, arg1);
                }
            } else {
                class23.method147((byte) 92, arg1);
            }
        }
        if (arg0 != -4) {
            field5527 = null;
        }
        ++field5525;
        class315.method2075((long) class287.field3982, class413.field6264, (byte) 95);
        if (class518.field7542 != -1) {
            class268.method1753(arg0 ^ 121, class518.field7542);
        }
        for (int var3 = 0; class384.field5785 > var3; ++var3) {
            if (class136.field1692[var3]) {
                class570.field8224[var3] = true;
            }
            class320.field4635[var3] = class136.field1692[var3];
            class136.field1692[var3] = false;
        }
        class80.field882 = class287.field3982;
        if (class413.field6264.method370()) {
            class508.field7385 = true;
        }
        if (~class518.field7542 != 0) {
            class384.field5785 = 0;
            class163.method948(6543);
        }
        class413.field6264.method404();
        class22.method139((byte) -32, class413.field6264);
        int var4 = class525.method3092(-13);
        if (~var4 == 0) {
            var4 = class595.field8697;
        }
        if (~var4 == 0) {
            var4 = class398.field6048;
        }
        class279.method1822(var4, -1);
        class197.method1258(class439.field6548.field1764, class439.field6548.field1757, class529.field7661, class439.field6548.field1768, (byte) 54);
        class529.field7661 = 0;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Ljava/lang/String;", line = 89)
    public static final String method2348(int arg0, int arg1, int arg2) {
        ++field5524;
        int var3 = -arg2 + arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (~var3 > 5) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (~var3 > -1) {
            return "<col=ffb000>";
        } else if (~var3 < arg1) {
            return "<col=00ff00>";
        } else if (~var3 < -7) {
            return "<col=40ff00>";
        } else if (~var3 < -4) {
            return "<col=80ff00>";
        } else {
            return ~var3 < -1 ? "<col=c0ff00>" : "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V", line = 129)
    public final void method283(byte arg0) {
        ++field5526;
        int var2 = 78 % ((arg0 - -7) / 37);
        this.field5523 = new class578(super.field7400);
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lfk;)V", line = 139)
    public class365(class569 arg0) {
        super(arg0);
        this.field5523 = new class578(arg0);
        super.field7415 = new class584(super.field7400);
        super.field7419 = new class584(super.field7400);
        super.field7461 = new class584(super.field7400);
        super.field7451 = new class584(super.field7400);
        super.field7443 = new class584(super.field7400);
        super.field7426 = new class584(super.field7400);
        super.field7437 = new class584(super.field7400);
        super.field7441 = new class584(super.field7400);
        super.field7457 = new class584(super.field7400);
        super.field7435 = new class584(super.field7400);
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V", line = 160)
    public static void method2349(int arg0) {
        if (arg0 == 0) {
            field5527 = null;
        }
    }
}
