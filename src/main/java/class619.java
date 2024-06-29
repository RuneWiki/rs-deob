import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class class619 {

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Lia;")
    public static class547 field8964 = new class547();

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Lsb;")
    public static class266 field8965 = new class266(33, 11);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field8962;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method3537(int arg0, int arg1, int arg2, Class arg3) {
        class370 var4 = class257.field3792[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class636 var5 = var4.field5497; var5 != null; var5 = var5.field9171) {
            class122 var6 = var5.field9172;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field2220 == arg1 && var6.field2230 == arg2) {
                class203.method1436(var6, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method3538(int arg0) {
        field8965 = null;
        field8964 = null;
        if (arg0 != 24978) {
            method3541(null, false);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILeq;Leq;)V")
    public static final void method3539(int arg0, int arg1, int arg2, class195 arg3, class195 arg4) {
        class370 var5 = class43.method570(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field5501 = arg3;
        var5.field5503 = arg4;
        int var6 = class697.field9813 == class485.field6947 ? 1 : 0;
        if (!arg3.method522((byte) -36)) {
            class7.field513[var6][class575.field8353[var6]++] = arg3;
        } else if (arg3.method524(-116)) {
            class368.field5462[var6][class43.field1090[var6]++] = arg3;
        } else {
            class148.field2552[var6][class338.field5048[var6]++] = arg3;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method522((byte) -36)) {
            if (arg4.method524(94)) {
                class368.field5462[var6][class43.field1090[var6]++] = arg4;
                return;
            }
            class148.field2552[var6][class338.field5048[var6]++] = arg4;
            return;
        }
        class7.field513[var6][class575.field8353[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBI)V")
    public static final void method3540(int arg0, byte arg1, int arg2) {
        field8962++;
        class19 var3 = class373.method2355(127, arg2, 5);
        if (arg1 >= -7) {
            method3540(34, (byte) -118, 69);
        }
        var3.method432(120);
        var3.field829 = arg0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lbw;Z)I")
    public static final int method3541(class641 arg0, boolean arg1) {
        field8963++;
        int var2 = arg0.method3648(122, 2);
        if (arg1) {
            method3538(-28);
        }
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method3648(-78, 5);
        } else if (var2 == 2) {
            var3 = arg0.method3648(89, 8);
        } else {
            var3 = arg0.method3648(-73, 11);
        }
        return var3;
    }
}
