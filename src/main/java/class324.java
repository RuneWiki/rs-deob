import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class324 extends class159 {

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public int field4600;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    private int field4604;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    private int field4594;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    private int field4592;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    private int field4603;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    public int field4609;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    private int field4593;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "I")
    public int field4606;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public int field4601;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "[I")
    public static int[] field4599 = new int[32];

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "Lhh;")
    public static class140 field4598;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III[I)V")
    public final void method2094(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field4593;
        arg3[2] = this.field4604 - (this.field4609 - arg0);
        if (arg1 != -890) {
            method2099(false);
        }
        field4608++;
        arg3[1] = -this.field4601 - (-this.field4603 - arg2);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static final void method2095(int arg0) {
        if (class318.field4526 != null) {
            class318.field4526.method2492((byte) 50);
        }
        if (arg0 >= -52) {
            field4598 = null;
        }
        field4596++;
        if (class790.field10850 != null) {
            class790.field10850.method2492((byte) 85);
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(III[I)V")
    public final void method2096(int arg0, int arg1, int arg2, int[] arg3) {
        field4610++;
        arg3[0] = 0;
        arg3[2] = arg2 + this.field4609 - this.field4604;
        arg3[arg0] = -this.field4603 - (-this.field4601 - arg1);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIB)Z")
    public final boolean method2097(int arg0, int arg1, byte arg2) {
        field4602++;
        if (arg2 <= 68) {
            method2099(false);
        }
        return this.field4603 <= arg1 && arg1 <= this.field4594 && arg0 >= this.field4604 && arg0 <= this.field4592;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BII)Z")
    public final boolean method2098(byte arg0, int arg1, int arg2) {
        field4605++;
        int var4 = -111 % ((arg0 - 4) / 39);
        return arg2 >= this.field4601 && this.field4606 >= arg2 && this.field4609 <= arg1 && this.field4600 >= arg1;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
    public static void method2099(boolean arg0) {
        field4598 = null;
        if (!arg0) {
            method2095(-120);
        }
        field4599 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BIII)Z")
    public final boolean method2100(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 124) {
            return false;
        } else {
            field4595++;
            return this.field4593 == arg3 && arg1 >= this.field4603 && arg1 <= this.field4594 && this.field4604 <= arg2 && this.field4592 >= arg2;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field4600 = arg8;
        this.field4604 = arg2;
        this.field4594 = arg3;
        this.field4592 = arg4;
        this.field4603 = arg1;
        this.field4609 = arg6;
        this.field4593 = arg0;
        this.field4606 = arg7;
        this.field4601 = arg5;
    }
}
