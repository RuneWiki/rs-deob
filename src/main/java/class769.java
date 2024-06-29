import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class769 extends class406 {

    @OriginalMember(owner = "client!au", name = "m", descriptor = "I")
    private int field10596 = -1;

    @OriginalMember(owner = "client!au", name = "t", descriptor = "Lvl;")
    public static class15 field10603 = new class15(82, -1);

    @OriginalMember(owner = "client!au", name = "y", descriptor = "I")
    public static int field10608 = 0;

    @OriginalMember(owner = "client!au", name = "x", descriptor = "I")
    public static int field10607 = -1;

    @OriginalMember(owner = "client!au", name = "w", descriptor = "B")
    private byte field10606;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "I")
    public static int field10597;

    @OriginalMember(owner = "client!au", name = "o", descriptor = "I")
    public static int field10598;

    @OriginalMember(owner = "client!au", name = "p", descriptor = "I")
    public static int field10599;

    @OriginalMember(owner = "client!au", name = "q", descriptor = "I")
    public static int field10600;

    @OriginalMember(owner = "client!au", name = "s", descriptor = "I")
    public static int field10602;

    @OriginalMember(owner = "client!au", name = "v", descriptor = "I")
    private int field10605;

    @OriginalMember(owner = "client!au", name = "l", descriptor = "Lnn;")
    public static class439 field10595;

    @OriginalMember(owner = "client!au", name = "u", descriptor = "Loo;")
    public static class654 field10604;

    @OriginalMember(owner = "client!au", name = "z", descriptor = "Lgj;")
    public static class662 field10609;

    @OriginalMember(owner = "client!au", name = "r", descriptor = "Ljava/lang/String;")
    private String field10601;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ZLgca;)V")
    public final void method1291(boolean arg0, class265 arg1) {
        field10602++;
        if (!arg0) {
            this.method1292(null, true);
        }
        class692 var3 = arg1.field3737[this.field10596];
        var3.field9601 = this.field10601;
        var3.field9610 = this.field10606;
        var3.field9599 = this.field10605;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V")
    public static final void method4229(int arg0, String arg1, String arg2, int arg3, String arg4, int arg5, int arg6, String arg7, String arg8) {
        field10600++;
        class434 var9 = class169.field2716[arg6];
        for (int var10 = 99; var10 > 0; var10--) {
            class169.field2716[var10] = class169.field2716[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class434(arg5, arg0, arg4, arg8, arg7, arg2, arg3, arg1);
        } else {
            var9.method2540(arg7, arg3, arg8, arg0, arg2, (byte) -33, arg1, arg5, arg4);
        }
        class488.field6587++;
        class169.field2716[0] = var9;
        class25.field501 = class62.field859;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Lfca;Z)V")
    public final void method1292(class93 arg0, boolean arg1) {
        field10598++;
        this.field10596 = arg0.method763(75);
        this.field10606 = arg0.method766((byte) 122);
        this.field10605 = arg0.method763(-55);
        if (arg1) {
            method4231((byte) -25);
        }
        arg0.method770((byte) 95);
        this.field10601 = arg0.method752(0);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
    public static final void method4230(int arg0) {
        class74.method639((byte) -93);
        field10599++;
        if (arg0 != 99) {
            return;
        }
        class65.field916 = null;
        class378.field5161 = null;
        class346.field4666 = null;
        class408.field5594 = null;
        class205.field3095 = null;
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(B)V")
    public static void method4231(byte arg0) {
        field10604 = null;
        field10609 = null;
        if (arg0 > -127) {
            method4230(37);
        }
        field10595 = null;
        field10603 = null;
    }
}
