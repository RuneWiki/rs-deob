import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public abstract class class167 {

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Ldk;")
    public static class326 field2443 = new class326("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field2444 = 0;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Lus;")
    public static class1 field2445 = new class1(98, 17);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
    public static void method1032(boolean arg0) {
        field2443 = null;
        field2445 = null;
        if (!arg0) {
            method1033(2, (class313) null);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILnp;)V")
    public static final void method1033(int arg0, class313 arg1) {
        if (class19.field260) {
            class313.method1932(9143, arg1);
        } else {
            class164.method1026(arg1, false);
        }
        field2446++;
        if (arg0 != -1) {
            method1032(true);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
    public static final void method1034(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2441++;
        if (arg1 != 1) {
            return;
        }
        int var6 = arg3 - arg2;
        int var7 = arg5 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class53.method336(arg4, arg3, arg0, 8, arg2);
            }
        } else if (var6 == 0) {
            class492.method2888(arg5, -14970, arg2, arg0, arg4);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg0;
                int var10 = arg5;
                arg0 = arg2;
                arg5 = arg3;
                arg2 = var9;
                arg3 = var10;
            }
            if (arg5 < arg0) {
                int var11 = arg0;
                int var12 = arg2;
                arg0 = arg5;
                arg5 = var11;
                arg2 = arg3;
                arg3 = var12;
            }
            int var13 = arg2;
            int var14 = arg5 - arg0;
            int var15 = arg3 - arg2;
            int var16 = -(var14 >> 1);
            int var17 = arg2 >= arg3 ? -1 : 1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (var8) {
                for (int var19 = arg0; var19 <= arg5; var19++) {
                    class128.field1676[var19][var13] = arg4;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var18 = arg0; var18 <= arg5; var18++) {
                    var16 += var15;
                    class128.field1676[var13][var18] = arg4;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lnp;Z)V")
    public static final void method1035(class313 arg0, boolean arg1) {
        field2442++;
        if (arg1 || class58.field785.method2850(0) == 0) {
            return;
        }
        if (class437.field6083 == 0) {
            for (class410 var4 = (class410) class58.field785.method2843(1123227612); var4 != null; var4 = (class410) class58.field785.method2842(1673506446)) {
                class64.field834.method2138(var4.field5751, 32, arg0, false, var4.field5747 ? class492.field6935.field6296 : null, var4.field5750, var4.field5745, var4.field5757, class453.field6355, var4.field5749, false, arg0);
                var4.method1510((byte) -13);
            }
            class453.method2661((byte) 127);
            return;
        }
        if (class250.field3692 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class250.field3692 = class313.method1937(0, var2, class252.field3718, class58.field766, 21954, 0);
            class1.field7 = class250.field3692.method688(class387.method2330(2, class347.field5025, 0, class434.field6054), class72.method432(class407.field5716, class434.field6054, 0), true);
        }
        for (class410 var3 = (class410) class58.field785.method2843(1123227612); var3 != null; var3 = (class410) class58.field785.method2842(1673506446)) {
            class64.field834.method2138(var3.field5751, 32, class250.field3692, false, var3.field5747 ? class492.field6935.field6296 : null, var3.field5750, var3.field5745, var3.field5757, class1.field7, var3.field5749, false, arg0);
            var3.method1510((byte) -13);
        }
    }
}
