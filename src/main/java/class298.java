import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class298 extends class673 {

    @OriginalMember(owner = "client!sea", name = "p", descriptor = "I")
    public static int field3765 = 2;

    @OriginalMember(owner = "client!sea", name = "x", descriptor = "[I")
    public static int[] field3773 = new int[14];

    @OriginalMember(owner = "client!sea", name = "w", descriptor = "[F")
    public static float[] field3772 = new float[4];

    @OriginalMember(owner = "client!sea", name = "C", descriptor = "B")
    public static byte field3778;

    @OriginalMember(owner = "client!sea", name = "t", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!sea", name = "u", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!sea", name = "y", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!sea", name = "z", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!sea", name = "D", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!sea", name = "E", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!sea", name = "q", descriptor = "Lpu;")
    private class772 field3766;

    @OriginalMember(owner = "client!sea", name = "r", descriptor = "Lpu;")
    private class772 field3767;

    @OriginalMember(owner = "client!sea", name = "s", descriptor = "Lpu;")
    private class772 field3768;

    @OriginalMember(owner = "client!sea", name = "v", descriptor = "Lpu;")
    private class772 field3771;

    @OriginalMember(owner = "client!sea", name = "A", descriptor = "Lpu;")
    public class772 field3776;

    @OriginalMember(owner = "client!sea", name = "B", descriptor = "Lpu;")
    private class772 field3777;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)Z")
    public final boolean method1034(int arg0) {
        ++field3780;
        if (!super.method1034(arg0)) {
            return false;
        } else {
            class26 var2 = (class26) super.field8712;
            if (!super.field8706.method130(-2, var2.field224)) {
                return false;
            } else if (!super.field8706.method130(-2, var2.field217)) {
                return false;
            } else if (!super.field8706.method130(arg0 + 32158, var2.field220)) {
                return false;
            } else if (!super.field8706.method130(arg0 + 32158, var2.field218)) {
                return false;
            } else if (!super.field8706.method130(-2, var2.field219)) {
                return false;
            } else {
                return super.field8706.method130(-2, var2.field221);
            }
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIIZ)V")
    public final void method1746(int arg0, int arg1, int arg2, boolean arg3) {
        ++field3775;
        if (arg2 >= -50) {
            this.field3771 = null;
        }
        if (arg3) {
            int[] var5 = new int[4];
            class576.field7320.method924(var5);
            class576.field7320.method915(arg0, arg1, super.field8712.field140 + arg0, super.field8712.field141 + arg1);
            int var6 = this.field3768.method623();
            int var7 = this.field3768.method628();
            int var8 = this.field3777.method623();
            int var9 = this.field3777.method628();
            this.field3768.method4203(arg0, (super.field8712.field141 - var7) / 2 + arg1);
            this.field3777.method4203(super.field8712.field140 + arg0 - var8, (super.field8712.field141 - var9) / 2 + arg1);
            class576.field7320.method915(arg0, arg1, super.field8712.field140 + arg0, arg1 - -this.field3767.method628());
            this.field3767.method4198(arg0 + var6, arg1, -var6 + -var8 + super.field8712.field140, super.field8712.field141);
            int var10 = this.field3771.method628();
            class576.field7320.method915(arg0, -var10 + super.field8712.field141 + arg1, super.field8712.field140 + arg0, super.field8712.field141 + arg1);
            this.field3771.method4198(arg0 + var6, super.field8712.field141 + arg1 + -var10, -var6 + super.field8712.field140 + -var8, super.field8712.field141);
            class576.field7320.method915(var5[0], var5[1], var5[2], var5[3]);
        }
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)V")
    public final void method1035(int arg0) {
        super.method1035(arg0);
        ++field3769;
        class26 var2 = (class26) super.field8712;
        this.field3776 = class752.method4085(super.field8706, var2.field224, (byte) 36);
        this.field3766 = class752.method4085(super.field8706, var2.field217, (byte) 36);
        this.field3768 = class752.method4085(super.field8706, var2.field220, (byte) 36);
        this.field3777 = class752.method4085(super.field8706, var2.field218, (byte) 36);
        this.field3767 = class752.method4085(super.field8706, var2.field219, (byte) 36);
        this.field3771 = class752.method4085(super.field8706, var2.field221, (byte) 36);
        if (arg0 != 27889) {
            this.method1034(35);
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIIIB)V")
    public void method1775(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field3770;
        this.field3776.method4198(arg1, arg0, arg2, arg3);
        if (arg4 != 34) {
            this.field3777 = null;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IZZI)V")
    public final void method1745(int arg0, boolean arg1, boolean arg2, int arg3) {
        ++field3774;
        int var5 = arg0 - -this.field3768.method623();
        int var6 = arg0 - (-super.field8712.field140 + this.field3777.method623());
        int var7 = arg3 - -this.field3767.method628();
        int var8 = arg3 + super.field8712.field141 + -this.field3771.method628();
        int var9 = -var5 + var6;
        int var10 = -var7 + var8;
        int var11 = this.method3629((byte) 100) * var9 / 10000;
        int[] var12 = new int[4];
        class576.field7320.method924(var12);
        class576.field7320.method915(var5, var7, var5 + var11, var8);
        this.method1775(var7, var5, var9, var10, (byte) 34);
        if (!arg1) {
            this.field3776 = null;
        }
        class576.field7320.method915(var5 - -var11, var7, var6, var8);
        this.field3766.method4198(var5, var7, var9, var10);
        class576.field7320.method915(var12[0], var12[1], var12[2], var12[3]);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(III)Z")
    public static final boolean method1776(int arg0, int arg1, int arg2) {
        ++field3779;
        if (arg0 <= 31) {
            field3765 = 77;
        }
        return (arg2 & 52) != 0;
    }

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "(I)V")
    public static void method1777(int arg0) {
        if (arg0 != 52) {
            field3772 = null;
        }
        field3772 = null;
        field3773 = null;
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lwm;Lwm;Liv;)V")
    public class298(class30 arg0, class30 arg1, class26 arg2) {
        super(arg0, arg1, arg2);
    }
}
