import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class632 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lpf;")
    public static class728 field9000 = new class728();

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Ldm;")
    public static class98 field9003 = new class98();

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field9001;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field9002;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBIZ)V")
    public static final void method3675(int arg0, byte arg1, int arg2, boolean arg3) {
        if (arg1 < 27) {
            field9000 = null;
        }
        field9002++;
        if (class63.field842.method1381(true, (long) arg0) != null) {
            return;
        }
        if (class340.field4355) {
            class192 var4 = new class192(arg0, new class45(4096, class635.field9039, arg0), arg2, arg3);
            var4.field2791.method3854((byte) -125, class280.field3725[class369.field4721]);
            class63.field842.method1387(var4, (long) arg0, (byte) -112);
        } else {
            class494.method2956(arg3, (byte) -61, arg0);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()V")
    public static final void method3676() {
        for (int var0 = class383.field5378; var0 < class214.field3021; var0++) {
            for (int var1 = 0; var1 < class485.field6556; var1++) {
                for (int var2 = 0; var2 < class314.field4059; var2++) {
                    class38 var3 = class352.field4549[var0][var1][var2];
                    if (var3 != null) {
                        class217 var4 = var3.field539;
                        class217 var5 = var3.field540;
                        if (var4 != null && var4.method373((byte) -57)) {
                            class306.method1788(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method373((byte) -57)) {
                                class306.method1788(var5, var0, var1, var2, 1, 1);
                                var5.method365(0, (byte) 90, false, 0, class646.field9160, 0, var4);
                                var5.method380((byte) -109);
                            }
                            var4.method380((byte) 73);
                        }
                        for (class590 var6 = var3.field538; var6 != null; var6 = var6.field8467) {
                            class743 var8 = var6.field8468;
                            if (var8 != null && var8.method373((byte) -57)) {
                                class306.method1788(var8, var0, var1, var2, var8.field10365 + 1 - var8.field10352, var8.field10353 - var8.field10357 + 1);
                                var8.method380((byte) 104);
                            }
                        }
                        class50 var7 = var3.field532;
                        if (var7 != null && var7.method373((byte) -57)) {
                            class561.method3358(var7, var0, var1, var2);
                            var7.method380((byte) -123);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static void method3677(byte arg0) {
        field9000 = null;
        field9003 = null;
        if (arg0 != -59) {
            method3676();
        }
    }
}
