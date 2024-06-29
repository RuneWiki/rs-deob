import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class320 extends class364 implements class106 {

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "Lwm;")
    public class364 field4641;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    public static int field4644 = 0;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "[I")
    public static int[] field4633 = new int[2];

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public static int field4642 = 0;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!ve", name = "L", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!ve", name = "N", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!ve", name = "P", descriptor = "Ltr;")
    public static class176 field4650;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public final void method111(int arg0) {
        if (arg0 >= 56) {
            field4648++;
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(IIIIILwm;)V")
    public class320(int arg0, int arg1, int arg2, int arg3, int arg4, class364 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class334.method2111(arg1, arg0, (byte) -108));
        this.field4641 = arg5;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILnp;)V")
    public final void method109(int arg0, class313 arg1) {
        field4638++;
        if (arg0 > -126) {
            field4633 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "(I)I")
    public final int method105(int arg0) {
        field4635++;
        if (arg0 > -86) {
            method2051((byte) -107);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lrp;I)Lso;")
    public static final class302 method2048(class276 arg0, int arg1) {
        field4646++;
        class302 var2 = new class302();
        if (arg1 != 1) {
            method2050(-34, -42, -83);
        }
        var2.field4302 = arg0.method1729(65280);
        var2.field4306 = class226.method1452(arg1 ^ 0xFFFF7FFE, var2.field4302);
        return var2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lnp;BI)Lf;")
    public final class491 method115(class313 arg0, byte arg1, int arg2) {
        field4640++;
        return arg1 <= 70 ? null : null;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)I")
    public final int method104(int arg0) {
        if (arg0 != 31249) {
            this.method109(-88, (class313) null);
        }
        field4636++;
        return 0;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)Z")
    public final boolean method116(byte arg0) {
        if (arg0 > -40) {
            this.method109(96, (class313) null);
        }
        field4639++;
        return false;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)I")
    public final int method119(byte arg0) {
        field4649++;
        return arg0 < 13 ? -38 : 0;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)V")
    public static void method2049(boolean arg0) {
        field4633 = null;
        if (!arg0) {
            field4633 = null;
        }
        field4650 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lnp;B)V")
    public final void method103(class313 arg0, byte arg1) {
        field4645++;
        if (arg1 > -95) {
            this.field4641 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIILnp;)Z")
    public final boolean method113(int arg0, int arg1, int arg2, class313 arg3) {
        field4634++;
        return arg1 < 16;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(III)Z")
    public static final boolean method2050(int arg0, int arg1, int arg2) {
        int var3 = class177.field2542[arg0][arg1][arg2];
        if (-class258.field3772 == var3) {
            return false;
        } else if (class258.field3772 == var3) {
            return true;
        } else {
            int var4 = arg1 << class216.field3242;
            int var5 = arg2 << class216.field3242;
            if (class459.method2688(var4 + 1, class53.field725[arg0].method1218(arg1, arg2), var5 + 1) && class459.method2688(class418.field5845 + var4 - 1, class53.field725[arg0].method1218(arg1 + 1, arg2), var5 + 1) && class459.method2688(class418.field5845 + var4 - 1, class53.field725[arg0].method1218(arg1 + 1, arg2 + 1), class418.field5845 + var5 - 1) && class459.method2688(var4 + 1, class53.field725[arg0].method1218(arg1, arg2 + 1), class418.field5845 + var5 - 1)) {
                class177.field2542[arg0][arg1][arg2] = class258.field3772;
                return true;
            } else {
                class177.field2542[arg0][arg1][arg2] = -class258.field3772;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
    public final int method106(int arg0) {
        field4647++;
        return arg0 == 12181 ? 0 : 42;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lnp;I)V")
    public final void method114(class313 arg0, int arg1) {
        field4637++;
        if (arg1 != -26920) {
            field4644 = -2;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(ILnp;)Lql;")
    public final class477 method120(int arg0, class313 arg1) {
        field4643++;
        return arg0 == 0 ? null : null;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V")
    public static final void method2051(byte arg0) {
        field4632++;
        if (arg0 != 94) {
            field4633 = null;
        }
        if (class304.field4318) {
            return;
        }
        class132.field1732 = true;
        class304.field4318 = true;
        if (class314.field4438.field5782) {
            class483.field6806 = (float) ((int) class483.field6806 + 47 & 0xFFFFFFF0);
        } else {
            class342.field4991 += (12.0F - class342.field4991) / 2.0F;
        }
    }
}
