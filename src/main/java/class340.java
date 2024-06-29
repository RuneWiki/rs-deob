import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class340 extends class530 {

    @OriginalMember(owner = "client!wha", name = "l", descriptor = "Z")
    public static boolean field4355 = false;

    @OriginalMember(owner = "client!wha", name = "i", descriptor = "Lefa;")
    public static class528 field4352 = new class528();

    @OriginalMember(owner = "client!wha", name = "g", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!wha", name = "h", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!wha", name = "j", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!wha", name = "k", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!wha", name = "m", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!wha", name = "n", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!wha", name = "o", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "(II)V", line = 3)
    public final void method70(int arg0, int arg1) {
        ++field4356;
        if (arg1 >= -38) {
            method1965(2, (class379) null);
        }
        super.field7419 = arg0;
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 15)
    public static final void method1961(int arg0, int arg1, int arg2, Class arg3) {
        class38 var4 = class352.field4549[arg0][arg1][arg2];
        if (var4 != null) {
            for (class590 var5 = var4.field538; var5 != null; var5 = var5.field8467) {
                class743 var6 = var5.field8468;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field10352 == arg1 && var6.field10357 == arg2) {
                    class374.method2256(var6, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "(I)I", line = 42)
    public final int method1962(int arg0) {
        ++field4353;
        return arg0 != 0 ? -42 : super.field7419;
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)I", line = 53)
    public final int method74(int arg0) {
        ++field4358;
        if (arg0 != 0) {
            field4355 = true;
        }
        return !super.field7418.method2254((byte) -58).method1896((byte) 121) ? 2 : 3;
    }

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "(III)Lc;", line = 68)
    public static final class50 method1963(int arg0, int arg1, int arg2) {
        class38 var3 = class352.field4549[arg0][arg1][arg2];
        return var3 != null && var3.field532 != null ? var3.field532 : null;
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)V", line = 75)
    public static void method1964(byte arg0) {
        field4352 = null;
        if (arg0 != 56) {
            field4352 = null;
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(Z)V", line = 87)
    public final void method73(boolean arg0) {
        if (~super.field7419 > -2 || ~super.field7419 < -4) {
            super.field7419 = this.method74(0);
        }
        ++field4351;
        if (!arg0) {
            method1963(-63, -81, -31);
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(ILqc;)Lqc;", line = 107)
    public static final class379 method1965(int arg0, class379 arg1) {
        ++field4354;
        class379 var2 = arg1 == null ? new class379() : new class379(arg1);
        var2.method2328(128, 9, -11);
        if (arg0 != 3) {
            method1965(120, (class379) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(ILah;)V", line = 122)
    public class340(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Lah;)V", line = 125)
    public class340(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(II)I", line = 131)
    public final int method75(int arg0, int arg1) {
        ++field4357;
        int var3 = 77 % ((arg1 - 63) / 60);
        return 1;
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(ILwu;)V", line = 142)
    public static final void method1966(int arg0, class557 arg1) {
        ++field4350;
        class365.field4673 = arg1.method3311((byte) -24, "hitmarks");
        class80.field1102 = arg1.method3311((byte) -24, "hitbar_default");
        class545.field7707 = arg1.method3311((byte) -24, "timerbar_default");
        class42.field590 = arg1.method3311((byte) -24, "headicons_pk");
        class453.field6243 = arg1.method3311((byte) -24, "headicons_prayer");
        class636.field9046 = arg1.method3311((byte) -24, "hint_headicons");
        class622.field8851 = arg1.method3311((byte) -24, "hint_mapmarkers");
        class586.field8434 = arg1.method3311((byte) -24, "mapflag");
        class18.field231 = arg1.method3311((byte) -24, "cross");
        class529.field7402 = arg1.method3311((byte) -24, "mapdots");
        if (arg0 == 1) {
            class293.field3831 = arg1.method3311((byte) -24, "scrollbar");
            class687.field9634 = arg1.method3311((byte) -24, "name_icons");
            class609.field8673 = arg1.method3311((byte) -24, "floorshadows");
            class405.field5623 = arg1.method3311((byte) -24, "compass");
            class504.field7059 = arg1.method3311((byte) -24, "otherlevel");
            class390.field5436 = arg1.method3311((byte) -24, "hint_mapedge");
        }
    }
}
