import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class412 extends class183 {

    @OriginalMember(owner = "client!mha", name = "q", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!mha", name = "u", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!mha", name = "v", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!mha", name = "w", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!mha", name = "B", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!mha", name = "r", descriptor = "Lkr;")
    private class743 field5694;

    @OriginalMember(owner = "client!mha", name = "t", descriptor = "Lkr;")
    private class743 field5696;

    @OriginalMember(owner = "client!mha", name = "x", descriptor = "Lkr;")
    private class743 field5700;

    @OriginalMember(owner = "client!mha", name = "y", descriptor = "Lkr;")
    public class743 field5701;

    @OriginalMember(owner = "client!mha", name = "z", descriptor = "Lkr;")
    private class743 field5702;

    @OriginalMember(owner = "client!mha", name = "A", descriptor = "Lkr;")
    private class743 field5703;

    @OriginalMember(owner = "client!mha", name = "s", descriptor = "[I")
    public static int[] field5695;

    @OriginalMember(owner = "client!mha", name = "C", descriptor = "[I")
    public static int[] field5705;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIZI)V", line = 4)
    public final void method1313(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg1 != 0) {
            this.method1176((byte) 87);
        }
        if (arg2) {
            int[] var5 = new int[4];
            class359.field5046.method624(var5);
            class359.field5046.method584(arg3, arg0, super.field2610.field3705 + arg3, super.field2610.field3701 + arg0);
            int var6 = this.field5700.method82();
            int var7 = this.field5700.method83();
            int var8 = this.field5696.method82();
            int var9 = this.field5696.method83();
            this.field5700.method4135(arg3, (super.field2610.field3701 - var7) / 2 + arg0);
            this.field5696.method4135(-var8 + super.field2610.field3705 + arg3, (-var9 + super.field2610.field3701) / 2 + arg0);
            class359.field5046.method584(arg3, arg0, super.field2610.field3705 + arg3, this.field5703.method83() + arg0);
            this.field5703.method4137(arg3 + var6, arg0, -var6 - var8 + super.field2610.field3705, super.field2610.field3701);
            int var10 = this.field5702.method83();
            class359.field5046.method584(arg3, -var10 + arg0 + super.field2610.field3701, super.field2610.field3705 + arg3, super.field2610.field3701 + arg0);
            this.field5702.method4137(arg3 + var6, -var10 + arg0 - -super.field2610.field3701, -var6 + super.field2610.field3705 + -var8, super.field2610.field3701);
            class359.field5046.method584(var5[0], var5[1], var5[2], var5[3]);
        }
        ++field5699;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IBZI)V", line = 42)
    public final void method1309(int arg0, byte arg1, boolean arg2, int arg3) {
        ++field5704;
        int var5 = arg0 - -this.field5700.method82();
        int var6 = super.field2610.field3705 + arg0 + -this.field5696.method82();
        int var7 = this.field5703.method83() + arg3;
        int var8 = super.field2610.field3701 + arg3 + -this.field5702.method83();
        int var9 = -var5 + var6;
        if (arg1 >= -100) {
            this.field5696 = null;
        }
        int var10 = var8 - var7;
        int var11 = var9 * this.method1307(false) / 10000;
        int[] var12 = new int[4];
        class359.field5046.method624(var12);
        class359.field5046.method584(var5, var7, var5 + var11, var8);
        this.method2507(var5, var10, 1, var9, var7);
        class359.field5046.method584(var5 + var11, var7, var6, var8);
        this.field5694.method4137(var5, var7, var9, var10);
        class359.field5046.method584(var12[0], var12[1], var12[2], var12[3]);
    }

    @OriginalMember(owner = "client!mha", name = "e", descriptor = "(I)V", line = 74)
    public static void method2506(int arg0) {
        if (arg0 != 15142) {
            method2506(24);
        }
        field5705 = null;
        field5695 = null;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V", line = 88)
    public final void method1173(int arg0) {
        ++field5698;
        super.method1173(-127);
        class519 var2 = (class519) super.field2610;
        this.field5701 = class458.method2794(super.field2621, var2.field7359, -85);
        this.field5694 = class458.method2794(super.field2621, var2.field7366, -88);
        this.field5700 = class458.method2794(super.field2621, var2.field7371, -118);
        if (arg0 >= -105) {
            this.method2507(21, 126, 111, 112, 85);
        }
        this.field5696 = class458.method2794(super.field2621, var2.field7367, -85);
        this.field5703 = class458.method2794(super.field2621, var2.field7360, -118);
        this.field5702 = class458.method2794(super.field2621, var2.field7363, -111);
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(B)Z", line = 107)
    public final boolean method1176(byte arg0) {
        if (arg0 <= 124) {
            this.field5701 = null;
        }
        ++field5693;
        if (!super.method1176((byte) 126)) {
            return false;
        } else {
            class519 var2 = (class519) super.field2610;
            if (!super.field2621.method1472(-25711, var2.field7359)) {
                return false;
            } else if (!super.field2621.method1472(-25711, var2.field7366)) {
                return false;
            } else if (!super.field2621.method1472(-25711, var2.field7371)) {
                return false;
            } else if (!super.field2621.method1472(-25711, var2.field7367)) {
                return false;
            } else if (!super.field2621.method1472(-25711, var2.field7360)) {
                return false;
            } else {
                return super.field2621.method1472(-25711, var2.field7363);
            }
        }
    }

    @OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(Leq;Leq;Lbaa;)V", line = 148)
    public class412(class209 arg0, class209 arg1, class519 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIIII)V", line = 152)
    public void method2507(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5701.method4137(arg0, arg4, arg3, arg1);
        ++field5697;
        if (arg2 != 1) {
            field5695 = null;
        }
    }
}
