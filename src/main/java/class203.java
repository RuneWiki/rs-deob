import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class203 extends class596 {

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
    private int field3128 = 0;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "Lhga;")
    public static class158 field3124 = new class158();

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "Z")
    public static boolean field3129 = true;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "F")
    public static float field3123;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZZ)V")
    public final void method1432(boolean arg0, boolean arg1) {
        ++field3127;
        int var3 = super.field8557.field9586.method2056(92, super.field8561.method1784(), class575.field8355) + super.field8557.field9578;
        int var4 = super.field8557.field9575.method3156(class693.field9762, 4416, super.field8561.method1789()) - -super.field8557.field9577;
        super.field8561.method3917((float) (super.field8561.method1784() / 2 + var3), (float) (var4 + super.field8561.method1789() / 2), 4096, this.field3128);
        if (arg1) {
            this.field3128 = -25;
        }
        this.field3128 += ((class24) super.field8557).field899;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lom;Lfba;)V")
    public class203(class344 arg0, class24 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
    public static void method1433(int arg0) {
        field3124 = null;
        if (arg0 != 10) {
            method1433(-118);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(FB)F")
    public static final float method1434(float arg0, byte arg1) {
        if (arg1 != -49) {
            method1434(-0.48877114F, (byte) 27);
        }
        ++field3125;
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IBII)V")
    public static final void method1435(int arg0, byte arg1, int arg2, int arg3) {
        ++field3126;
        if (arg1 != 34) {
            method1433(-63);
        }
        if (~arg3 != -1005) {
            if (~arg3 == -1009) {
                class683.method3844(class438.field6317, arg0, arg2);
            } else if (~arg3 == -1004) {
                class683.method3844(class261.field3830, arg0, arg2);
            } else {
                if (arg3 != 1009) {
                    if (arg3 == 1002) {
                        class683.method3844(class56.field1273, arg0, arg2);
                        return;
                    }
                } else {
                    class683.method3844(class593.field8527, arg0, arg2);
                }
            }
        } else {
            class683.method3844(class36.field1033, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lvr;Z)V")
    public static final void method1436(class122 arg0, boolean arg1) {
        for (int var2 = arg0.field2220; var2 <= arg0.field2227; ++var2) {
            for (int var3 = arg0.field2230; var3 <= arg0.field2222; ++var3) {
                class370 var4 = class257.field3792[arg0.field9814][var2][var3];
                if (var4 != null) {
                    class636 var5 = var4.field5497;
                    class636 var6 = null;
                    while (var5 != null) {
                        if (var5.field9172 == arg0) {
                            if (var6 != null) {
                                var6.field9171 = var5.field9171;
                            } else {
                                var4.field5497 = var5.field9171;
                            }
                            var5.method3632((byte) -126);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field9171;
                    }
                }
            }
        }
        if (!arg1) {
            class104.method965(arg0);
        }
    }
}
