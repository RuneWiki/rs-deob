import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class620 extends class205 {

    @OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
    public static int field8658 = 0;

    @OriginalMember(owner = "client!vs", name = "A", descriptor = "[I")
    public static int[] field8667 = new int[14];

    @OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
    public static int field8659;

    @OriginalMember(owner = "client!vs", name = "t", descriptor = "I")
    public static int field8660;

    @OriginalMember(owner = "client!vs", name = "w", descriptor = "I")
    public static int field8663;

    @OriginalMember(owner = "client!vs", name = "y", descriptor = "I")
    public static int field8665;

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "I")
    public static int field8666;

    @OriginalMember(owner = "client!vs", name = "D", descriptor = "I")
    public static int field8670;

    @OriginalMember(owner = "client!vs", name = "E", descriptor = "I")
    public static int field8671;

    @OriginalMember(owner = "client!vs", name = "u", descriptor = "Lf;")
    private class536 field8661;

    @OriginalMember(owner = "client!vs", name = "v", descriptor = "Lf;")
    public class536 field8662;

    @OriginalMember(owner = "client!vs", name = "x", descriptor = "Lf;")
    private class536 field8664;

    @OriginalMember(owner = "client!vs", name = "B", descriptor = "Lf;")
    private class536 field8668;

    @OriginalMember(owner = "client!vs", name = "C", descriptor = "Lf;")
    private class536 field8669;

    @OriginalMember(owner = "client!vs", name = "F", descriptor = "Lf;")
    private class536 field8672;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IBIII)V", line = 3)
    public void method3403(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 85) {
            this.field8664 = null;
        }
        ++field8666;
        this.field8662.method2909(arg2, arg3, arg4, arg0);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V", line = 15)
    public final void method394(int arg0) {
        super.method394(-115);
        ++field8660;
        class529 var2 = (class529) super.field2603;
        this.field8662 = class121.method649(super.field2604, 1024, var2.field7157);
        this.field8672 = class121.method649(super.field2604, 1024, var2.field7159);
        this.field8668 = class121.method649(super.field2604, 1024, var2.field7153);
        this.field8669 = class121.method649(super.field2604, 1024, var2.field7150);
        if (arg0 > -41) {
            method3404(-21, 65, 39, 85, -53, -34, (byte) 37);
        }
        this.field8664 = class121.method649(super.field2604, 1024, var2.field7154);
        this.field8661 = class121.method649(super.field2604, 1024, var2.field7162);
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(IIZI)V", line = 35)
    public final void method1240(int arg0, int arg1, boolean arg2, int arg3) {
        ++field8663;
        int var5 = this.field8668.method160() + arg3;
        int var6 = super.field2603.field1621 + arg3 + -this.field8669.method160();
        int var7 = this.field8664.method166() + arg1;
        int var8 = arg1 + super.field2603.field1617 + -this.field8661.method166();
        int var9 = -var5 + var6;
        int var10 = var8 - var7;
        int var11 = this.method1242((byte) -8) * var9 / 10000;
        int[] var12 = new int[4];
        class32.field452.method1060(var12);
        class32.field452.method1083(var5, var7, var5 - -var11, var8);
        this.method3403(var10, (byte) 85, var5, var7, var9);
        class32.field452.method1083(var5 + var11, var7, var6, var8);
        this.field8672.method2909(var5, var7, var9, var10);
        class32.field452.method1083(var12[0], var12[1], var12[arg0], var12[3]);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIIIIB)V", line = 65)
    public static final void method3404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 == 20) {
            for (class107 var7 = (class107) class580.field8120.method802((byte) 113); var7 != null; var7 = (class107) class580.field8120.method800((byte) -106)) {
                if (var7.field1422 <= class133.field1735) {
                    var7.method3146(2);
                } else {
                    class513.method2769((var7.field1428 << 9) + 256, arg2 >> 1, arg3, (var7.field1423 << 9) + 256, arg5, (byte) 46, arg1 >> 1, var7.field1426 * 2, var7.field1427);
                    class65.field889.method2199(-16777216 | var7.field1425, arg6 ^ -154, arg4 - -class273.field3450[0], 0, class273.field3450[1] + arg0, var7.field1430);
                }
            }
            ++field8665;
        }
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lpl;Lpl;Ltm;)V", line = 92)
    public class620(class612 arg0, class612 arg1, class529 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)Z", line = 104)
    public final boolean method392(byte arg0) {
        ++field8671;
        if (!super.method392(arg0)) {
            return false;
        } else {
            class529 var2 = (class529) super.field2603;
            if (!super.field2604.method3368(1912, var2.field7157)) {
                return false;
            } else if (!super.field2604.method3368(1912, var2.field7159)) {
                return false;
            } else if (!super.field2604.method3368(arg0 ^ 1834, var2.field7153)) {
                return false;
            } else if (!super.field2604.method3368(1912, var2.field7150)) {
                return false;
            } else if (!super.field2604.method3368(1912, var2.field7154)) {
                return false;
            } else {
                return super.field2604.method3368(arg0 ^ 1834, var2.field7162);
            }
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIZI)V", line = 136)
    public final void method1239(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            int[] var5 = new int[4];
            class32.field452.method1060(var5);
            class32.field452.method1083(arg1, arg3, super.field2603.field1621 + arg1, super.field2603.field1617 + arg3);
            int var6 = this.field8668.method160();
            int var7 = this.field8668.method166();
            int var8 = this.field8669.method160();
            int var9 = this.field8669.method166();
            this.field8668.method2902(arg1, (-var7 + super.field2603.field1617) / 2 + arg3);
            this.field8669.method2902(arg1 - -super.field2603.field1621 - var8, (-var9 + super.field2603.field1617) / 2 + arg3);
            class32.field452.method1083(arg1, arg3, arg1 - -super.field2603.field1621, this.field8664.method166() + arg3);
            this.field8664.method2909(arg1 - -var6, arg3, -var6 + super.field2603.field1621 - var8, super.field2603.field1617);
            int var10 = this.field8661.method166();
            class32.field452.method1083(arg1, super.field2603.field1617 + arg3 - var10, arg1 - -super.field2603.field1621, super.field2603.field1617 + arg3);
            this.field8661.method2909(arg1 + var6, super.field2603.field1617 + arg3 + -var10, super.field2603.field1621 - var8 + -var6, super.field2603.field1617);
            class32.field452.method1083(var5[0], var5[1], var5[2], var5[3]);
        }
        ++field8659;
        int var11 = -81 % ((arg0 - 50) / 49);
    }

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "(I)V", line = 177)
    public static void method3405(int arg0) {
        field8667 = null;
        if (arg0 != 2) {
            field8658 = -27;
        }
    }
}
