import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class741 {

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "Lko;")
    public class507 field10344 = new class507();

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "Lhg;")
    public static class693 field10341 = new class693(12, -1);

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "[I")
    public static int[] field10342 = new int[2];

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field10343;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field10345;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)V")
    public static final void method4130(int arg0, int arg1, int arg2) {
        class14 var3 = class197.field2689[arg0][arg1][arg2];
        if (var3 != null) {
            class501.method2938(var3.field279);
            if (var3.field279 != null) {
                var3.field279 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)V")
    public static final void method4131(int arg0, byte arg1) {
        field10345++;
        if (arg1 > -115) {
            return;
        }
        if (class748.field10451.field10396.method3748((byte) -48) == 0) {
            arg0 = -1;
        }
        if (class23.field427 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class229 var2 = class416.field5301.method10(1, arg0);
            class728 var3 = var2.method1455(0);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class162.field2227.method2641(class262.field3311, var3.method4061(), true, new Point(var2.field3023, var2.field3027), var3.method4056(), var3.method4055());
                class23.field427 = arg0;
            }
        }
        if (arg0 == -1 && class23.field427 != -1) {
            class162.field2227.method2641(class262.field3311, -1, true, new Point(), null, -1);
            class23.field427 = -1;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZLjava/lang/String;Lqg;ZZ)V")
    public static final void method4132(boolean arg0, String arg1, class465 arg2, boolean arg3, boolean arg4) {
        field10343++;
        if (arg3) {
            method4130(69, -50, 68);
        }
        if (!arg0) {
            class37.method233(arg1, (byte) 69, arg2, 3);
            return;
        }
        if (class465.field6233.startsWith("win") && arg2.field6256) {
            String var5 = null;
            if (class64.field900 != null) {
                var5 = class64.field900.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class181 var6 = class37.method233(arg1, (byte) 69, arg2, 0);
                class625.field8601 = var6;
                class660.field9193 = arg1;
                class285.field3595 = arg2;
                return;
            }
        }
        if (class465.field6233.startsWith("mac")) {
            String var7 = null;
            if (class64.field900 != null) {
                var7 = class64.field900.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg4) {
                class37.method233(arg1, (byte) 69, arg2, 1);
                return;
            }
        }
        class37.method233(arg1, (byte) 69, arg2, 2);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public static void method4133(int arg0) {
        field10342 = null;
        if (arg0 != -1) {
            method4133(37);
        }
        field10341 = null;
    }
}
