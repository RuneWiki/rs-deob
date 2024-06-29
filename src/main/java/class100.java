import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class100 extends class227 {

    @OriginalMember(owner = "client!qba", name = "s", descriptor = "Lwk;")
    public static class430 field1475 = new class430(7, 8);

    @OriginalMember(owner = "client!qba", name = "t", descriptor = "I")
    public static int field1476 = -50;

    @OriginalMember(owner = "client!qba", name = "v", descriptor = "Ltm;")
    public static class334 field1478 = new class334(62, 6);

    @OriginalMember(owner = "client!qba", name = "w", descriptor = "[I")
    public static int[] field1479 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!qba", name = "z", descriptor = "Ltm;")
    public static class334 field1482 = new class334(71, -1);

    @OriginalMember(owner = "client!qba", name = "A", descriptor = "[J")
    public static long[] field1483 = new long[32];

    @OriginalMember(owner = "client!qba", name = "p", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!qba", name = "q", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!qba", name = "r", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!qba", name = "u", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!qba", name = "x", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!qba", name = "y", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lla;Lla;Lir;)V", line = 6)
    public class100(class422 arg0, class422 arg1, class181 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(ILka;III)Lkn;", line = 11)
    public static final class516 method819(int arg0, class282 arg1, int arg2, int arg3, int arg4) {
        ++field1473;
        if (arg1 == null) {
            return null;
        } else {
            return arg0 != 8 ? null : new class516(arg4, arg2, arg3, arg1.method999(), arg1.method1008(), arg1.method1024(), arg1.method1033(), arg1.method1005(), arg1.method996(), arg1.method1003());
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 28)
    public static final void method820(boolean arg0, int arg1, String arg2) {
        ++field1481;
        if (arg2 != null) {
            if (~class270.field4155 <= -101) {
                class564.method3268(class641.field9032.method3621(123, class467.field6804), 17137, 4);
            } else {
                String var3 = class519.method3095(arg2, false);
                if (var3 != null) {
                    for (int var4 = 0; ~class270.field4155 < ~var4; ++var4) {
                        String var9 = class519.method3095(class379.field5697[var4], false);
                        if (var9 != null && var9.equals(var3)) {
                            class564.method3268(arg2 + class641.field9033.method3621(114, class467.field6804), 17137, 4);
                            return;
                        }
                        if (class603.field8536[var4] != null) {
                            String var10 = class519.method3095(class603.field8536[var4], false);
                            if (var10 != null && var10.equals(var3)) {
                                class564.method3268(arg2 + class641.field9033.method3621(120, class467.field6804), 17137, 4);
                                return;
                            }
                        }
                    }
                    for (int var5 = 0; class468.field6818 > var5; ++var5) {
                        String var7 = class519.method3095(class562.field7961[var5], false);
                        if (var7 != null && var7.equals(var3)) {
                            class564.method3268(class641.field9038.method3621(111, class467.field6804) + arg2 + class641.field9039.method3621(90, class467.field6804), 17137, 4);
                            return;
                        }
                        if (class624.field8745[var5] != null) {
                            String var8 = class519.method3095(class624.field8745[var5], false);
                            if (var8 != null && var8.equals(var3)) {
                                class564.method3268(class641.field9038.method3621(106, class467.field6804) + arg2 + class641.field9039.method3621(95, class467.field6804), 17137, 4);
                                return;
                            }
                        }
                    }
                    if (class519.method3095(class145.field2251.field8146, false).equals(var3)) {
                        class564.method3268(class641.field9035.method3621(95, class467.field6804), 17137, 4);
                    } else {
                        ++class521.field7531;
                        if (arg1 <= 10) {
                            method819(-95, (class282) null, 79, 12, 16);
                        }
                        class540 var6 = class257.method1732(true, class211.field3502, class655.field9332);
                        var6.field7707.method1926(class16.method101(-101, arg2) - -1, 65280);
                        var6.field7707.method1931(112, arg2);
                        var6.field7707.method1926(arg0 ? 1 : 0, 65280);
                        class756.method4211(var6, 123);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IBIZ)V", line = 125)
    public final void method821(int arg0, byte arg1, int arg2, boolean arg3) {
        ++field1474;
        int var5 = this.method1588(-1046) * super.field3638.field1076 / 10000;
        class364.field5573.method410(arg0, arg2 + 2, var5, super.field3638.field1078 + -2, ((class181) super.field3638).field3064, 0);
        if (arg1 != -30) {
            this.method824(true, 83, true, 17);
        }
        class364.field5573.method410(arg0 + var5, arg2 + 2, -var5 + super.field3638.field1076, super.field3638.field1078 + -2, 0, 0);
    }

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "(I)V", line = 139)
    public static void method822(int arg0) {
        field1482 = null;
        field1478 = null;
        field1479 = null;
        field1483 = null;
        if (arg0 != 0) {
            method820(true, -96, (String) null);
        }
        field1475 = null;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIZ)Z", line = 156)
    public static final boolean method823(int arg0, int arg1, boolean arg2) {
        ++field1472;
        if (arg2) {
            field1475 = null;
        }
        return class395.method2455(arg1, true, arg0) || class496.method3008(arg0, 45056, arg1);
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZIZI)V", line = 168)
    public final void method824(boolean arg0, int arg1, boolean arg2, int arg3) {
        ++field1477;
        class364.field5573.method224(arg1 + -2, arg3, super.field3638.field1076 + 4, super.field3638.field1078 + 2, ((class181) super.field3638).field3063, 0);
        if (arg0) {
            field1483 = null;
        }
        class364.field5573.method224(arg1 + -1, arg3 + 1, super.field3638.field1076 + 2, super.field3638.field1078, 0, 0);
    }
}
