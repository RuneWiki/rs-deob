import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class386 extends class540 {

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "Ljb;")
    public static class519 field5612 = new class519(78, -1);

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "I")
    public static int field5614 = 1337;

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!mn", name = "A", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!mn", name = "C", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!mn", name = "D", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "Lhh;")
    private class140 field5606;

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "Lhh;")
    private class140 field5607;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "Lhh;")
    private class140 field5608;

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "Lhh;")
    private class140 field5611;

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "Lhh;")
    private class140 field5615;

    @OriginalMember(owner = "client!mn", name = "B", descriptor = "Lhh;")
    public class140 field5617;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)Z")
    public final boolean method210(int arg0) {
        ++field5610;
        if (!super.method210(arg0)) {
            return false;
        } else {
            class68 var2 = (class68) super.field7476;
            if (!super.field7471.method1185(var2.field948, 9330)) {
                return false;
            } else if (!super.field7471.method1185(var2.field946, 9330)) {
                return false;
            } else if (!super.field7471.method1185(var2.field949, arg0 + -6795)) {
                return false;
            } else if (!super.field7471.method1185(var2.field940, 9330)) {
                return false;
            } else if (!super.field7471.method1185(var2.field941, 9330)) {
                return false;
            } else {
                return super.field7471.method1185(var2.field944, 9330);
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)V")
    public static void method2401(int arg0) {
        field5612 = null;
        if (arg0 < 62) {
            field5612 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZIII)V")
    public final void method1265(boolean arg0, int arg1, int arg2, int arg3) {
        ++field5616;
        int var5 = this.field5606.method343() + arg2;
        int var6 = arg2 - (-super.field7476.field4708 + this.field5611.method343());
        int var7 = arg3 - -this.field5607.method340();
        int var8 = super.field7476.field4710 + arg3 + -this.field5608.method340();
        int var9 = -var5 + var6;
        int var10 = var8 - var7;
        int var11 = var9 * this.method3129(8324) / 10000;
        int[] var12 = new int[4];
        class375.field5490.method467(var12);
        class375.field5490.method453(var5, var7, var5 + var11, var8);
        this.method2402(var10, var5, (byte) 98, var9, var7);
        class375.field5490.method453(var5 + var11, var7, var6, var8);
        this.field5615.method978(var5, var7, var9, var10);
        class375.field5490.method453(var12[0], var12[1], var12[2], var12[3]);
        if (arg1 != 10) {
            this.method1267(20, 55, false, 100);
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Luq;Luq;Lbd;)V")
    public class386(class172 arg0, class172 arg1, class68 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIBII)V")
    public void method2402(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var6 = 104 % ((-37 - arg2) / 48);
        ++field5618;
        this.field5617.method978(arg1, arg4, arg3, arg0);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V")
    public final void method211(byte arg0) {
        super.method211((byte) -112);
        ++field5619;
        class68 var2 = (class68) super.field7476;
        this.field5617 = class570.method3243(super.field7471, var2.field948, true);
        this.field5615 = class570.method3243(super.field7471, var2.field946, true);
        this.field5606 = class570.method3243(super.field7471, var2.field949, true);
        this.field5611 = class570.method3243(super.field7471, var2.field940, true);
        if (arg0 >= -107) {
            this.method210(-54);
        }
        this.field5607 = class570.method3243(super.field7471, var2.field941, true);
        this.field5608 = class570.method3243(super.field7471, var2.field944, true);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIZI)V")
    public final void method1267(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg1 != -19726) {
            this.method211((byte) 116);
        }
        ++field5613;
        if (arg2) {
            int[] var5 = new int[4];
            class375.field5490.method467(var5);
            class375.field5490.method453(arg0, arg3, super.field7476.field4708 + arg0, super.field7476.field4710 + arg3);
            int var6 = this.field5606.method343();
            int var7 = this.field5606.method340();
            int var8 = this.field5611.method343();
            int var9 = this.field5611.method340();
            this.field5606.method968(arg0, (super.field7476.field4710 - var7) / 2 + arg3);
            this.field5611.method968(-var8 + arg0 + super.field7476.field4708, arg3 - -((-var9 + super.field7476.field4710) / 2));
            class375.field5490.method453(arg0, arg3, arg0 - -super.field7476.field4708, arg3 - -this.field5607.method340());
            this.field5607.method978(arg0 - -var6, arg3, -var8 + super.field7476.field4708 + -var6, super.field7476.field4710);
            int var10 = this.field5608.method340();
            class375.field5490.method453(arg0, -var10 + arg3 + super.field7476.field4710, super.field7476.field4708 + arg0, super.field7476.field4710 + arg3);
            this.field5608.method978(arg0 + var6, super.field7476.field4710 + arg3 + -var10, -var6 + super.field7476.field4708 - var8, super.field7476.field4710);
            class375.field5490.method453(var5[0], var5[1], var5[2], var5[3]);
        }
    }
}
