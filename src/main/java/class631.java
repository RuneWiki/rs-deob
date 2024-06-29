import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class631 extends class45 {

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "Lkaa;")
    public static class47 field8404 = new class47(45, 18);

    @OriginalMember(owner = "client!sn", name = "y", descriptor = "Lkaa;")
    public static class47 field8407 = new class47(11, 2);

    @OriginalMember(owner = "client!sn", name = "A", descriptor = "Lht;")
    public static class582 field8409 = new class582(12, 8);

    @OriginalMember(owner = "client!sn", name = "C", descriptor = "Lhda;")
    public static class752 field8411 = new class752(80, 1);

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
    public static int field8401;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
    public static int field8402;

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "I")
    public static int field8403;

    @OriginalMember(owner = "client!sn", name = "w", descriptor = "I")
    public static int field8405;

    @OriginalMember(owner = "client!sn", name = "B", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "Lhu;")
    private class133 field8397;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "Lhu;")
    private class133 field8398;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "Lhu;")
    private class133 field8399;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "Lhu;")
    private class133 field8400;

    @OriginalMember(owner = "client!sn", name = "x", descriptor = "Lhu;")
    public class133 field8406;

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "Lhu;")
    private class133 field8408;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIZ)V")
    public final void method321(int arg0, int arg1, int arg2, boolean arg3) {
        ++field8410;
        int var5 = arg0 + this.field8408.method1036();
        int var6 = arg0 + (super.field584.field6529 - this.field8398.method1036());
        int var7 = this.field8397.method1048() + arg2;
        int var8 = arg2 - -super.field584.field6531 - this.field8400.method1048();
        int var9 = var6 - var5;
        int var10 = -var7 + var8;
        int var11 = var9 * this.method323((byte) -36) / 10000;
        int[] var12 = new int[4];
        class341.field4807.method393(var12);
        class341.field4807.method419(var5, var7, var5 + var11, var8);
        this.method2181(-3832, var7, var10, var9, var5);
        class341.field4807.method419(var5 - -var11, var7, var6, var8);
        this.field8399.method1049(var5, var7, var9, var10);
        class341.field4807.method419(var12[0], var12[1], var12[arg1], var12[3]);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)Z")
    public final boolean method320(int arg0) {
        ++field8403;
        if (!super.method320(arg0)) {
            return false;
        } else {
            class735 var2 = (class735) super.field584;
            if (!super.field578.method2216(var2.field10168, -62)) {
                return false;
            } else if (!super.field578.method2216(var2.field10170, 61)) {
                return false;
            } else if (!super.field578.method2216(var2.field10164, arg0 + -5533)) {
                return false;
            } else if (!super.field578.method2216(var2.field10171, -98)) {
                return false;
            } else if (!super.field578.method2216(var2.field10162, arg0 ^ 5548)) {
                return false;
            } else {
                return super.field578.method2216(var2.field10161, 94);
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lwu;Lwu;Leja;)V")
    public class631(class376 arg0, class376 arg1, class735 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIII)V")
    public void method2181(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == -3832) {
            this.field8406.method1049(arg4, arg1, arg3, arg2);
            ++field8405;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIZI)V")
    public final void method325(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            int[] var5 = new int[4];
            class341.field4807.method393(var5);
            class341.field4807.method419(arg3, arg0, super.field584.field6529 + arg3, super.field584.field6531 + arg0);
            int var6 = this.field8408.method1036();
            int var7 = this.field8408.method1048();
            int var8 = this.field8398.method1036();
            int var9 = this.field8398.method1048();
            this.field8408.method1035(arg3, arg0 - -((-var7 + super.field584.field6531) / 2));
            this.field8398.method1035(arg3 - var8 + super.field584.field6529, arg0 - -((-var9 + super.field584.field6531) / 2));
            class341.field4807.method419(arg3, arg0, arg3 - -super.field584.field6529, arg0 + this.field8397.method1048());
            this.field8397.method1049(arg3 + var6, arg0, super.field584.field6529 - var6 + -var8, super.field584.field6531);
            int var10 = this.field8400.method1048();
            class341.field4807.method419(arg3, super.field584.field6531 + arg0 - var10, super.field584.field6529 + arg3, super.field584.field6531 + arg0);
            this.field8400.method1049(arg3 + var6, -var10 + super.field584.field6531 + arg0, -var6 - var8 + super.field584.field6529, super.field584.field6531);
            class341.field4807.method419(var5[0], var5[1], var5[2], var5[3]);
        }
        if (arg1 > -72) {
            this.method324((byte) 31);
        }
        ++field8402;
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
    public static void method3469(int arg0) {
        field8411 = null;
        field8404 = null;
        field8409 = null;
        if (arg0 != 0) {
            field8407 = null;
        }
        field8407 = null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
    public final void method324(byte arg0) {
        ++field8401;
        if (arg0 < 34) {
            this.field8398 = null;
        }
        super.method324((byte) 72);
        class735 var2 = (class735) super.field584;
        this.field8406 = class453.method2578(var2.field10168, super.field578, true);
        this.field8399 = class453.method2578(var2.field10170, super.field578, true);
        this.field8408 = class453.method2578(var2.field10164, super.field578, true);
        this.field8398 = class453.method2578(var2.field10171, super.field578, true);
        this.field8397 = class453.method2578(var2.field10162, super.field578, true);
        this.field8400 = class453.method2578(var2.field10161, super.field578, true);
    }
}
