import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public abstract class class217 extends class280 {

    @OriginalMember(owner = "client!aca", name = "w", descriptor = "Lsm;")
    public static class387 field3244 = new class387("", 13);

    @OriginalMember(owner = "client!aca", name = "B", descriptor = "F")
    public static float field3249 = 1.0F;

    @OriginalMember(owner = "client!aca", name = "t", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!aca", name = "u", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!aca", name = "v", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!aca", name = "x", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!aca", name = "y", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!aca", name = "z", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!aca", name = "A", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!aca", name = "d", descriptor = "(I)Z", line = 4)
    public final boolean method715(int arg0) {
        if (arg0 != -12888) {
            method1533((class146) null, true, 120);
        }
        ++field3242;
        return false;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lqk;ZI)V", line = 16)
    public static final void method1533(class146 arg0, boolean arg1, int arg2) {
        ++field3241;
        int var3 = ~arg0.field2134 != -1 ? arg0.field2134 : arg0.field2016;
        int var4 = ~arg0.field1973 != -1 ? arg0.field1973 : arg0.field1997;
        class175.method1262(arg0.field2079, arg1, var3, true, class600.field8524[arg0.field2079 >> 16], var4);
        if (arg2 == -9543) {
            if (arg0.field2019 != null) {
                class175.method1262(arg0.field2079, arg1, var3, true, arg0.field2019, var4);
            }
            class182 var5 = (class182) class591.field8410.method4020((long) arg0.field2079, (byte) -99);
            if (var5 != null) {
                class366.method2303(var4, false, arg1, var5.field2505, var3);
            }
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILjw;Lha;BIZI)V", line = 41)
    public final void method711(int arg0, class280 arg1, class543 arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        ++field3248;
        if (arg3 < 28) {
            field3244 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(IIIII)V", line = 51)
    public class217(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field3923 = arg0;
        super.field3922 = arg1;
        super.field3916 = arg2;
        super.field3924 = (byte) arg4;
        super.field3920 = (byte) arg3;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V", line = 63)
    public static void method1534(int arg0) {
        if (arg0 != -1505997328) {
            method1534(47);
        }
        field3244 = null;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 74)
    public static final void method1535(int arg0, int arg1, int arg2, Class arg3) {
        class375 var4 = class565.field8185[arg0][arg1][arg2];
        if (var4 != null) {
            for (class208 var5 = var4.field5425; var5 != null; var5 = var5.field3146) {
                class638 var6 = var5.field3144;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field9038 == arg1 && var6.field9035 == arg2) {
                    class152.method1098(var6, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aca", name = "f", descriptor = "(B)Z", line = 103)
    public final boolean method92(byte arg0) {
        if (arg0 <= 16) {
            field3244 = null;
        }
        ++field3246;
        return class437.field6237[(super.field3923 >> class639.field9095) + -class613.field8757 + class430.field6190][(super.field3916 >> class639.field9095) + -class140.field1915 + class430.field6190];
    }

    @OriginalMember(owner = "client!aca", name = "e", descriptor = "(I)V", line = 117)
    public final void method713(int arg0) {
        if (arg0 == -16221) {
            ++field3247;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!aca", name = "f", descriptor = "(I)Z", line = 129)
    public final boolean method88(int arg0) {
        if (arg0 != -1) {
            method1533((class146) null, false, 8);
        }
        ++field3243;
        class208 var2 = class482.method2953(super.field3920, super.field3923 >> class639.field9095, super.field3916 >> class639.field9095);
        return var2 != null && var2.field3144.field9040 ? class187.method1326(var2.field3144.method595(arg0 ^ -32768) - -this.method595(32767), super.field3916 >> class639.field9095, (byte) 105, super.field3920, super.field3923 >> class639.field9095) : class141.method998(super.field3923 >> class639.field9095, arg0 + -40, super.field3916 >> class639.field9095, super.field3920);
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I[Lwh;)I", line = 151)
    public final int method90(int arg0, class40[] arg1) {
        ++field3245;
        if (arg0 != -1) {
            field3249 = 0.6679143F;
        }
        return this.method1794(super.field3923 >> class639.field9095, arg1, arg0, super.field3916 >> class639.field9095);
    }
}
