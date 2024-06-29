import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class362 {

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    private int field4605;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    private int field4612;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    private int field4598;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    private int field4602;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    private int field4610;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    private int field4606;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    private int field4600;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    private int field4603;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    private int field4599;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    private int field4608;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "[J")
    public static long[] field4607;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)Z")
    public final boolean method1988(int arg0, int arg1, int arg2, int arg3) {
        field4601++;
        if (this.field4599 > arg0 || this.field4606 < arg0) {
            return false;
        }
        int var5 = 9 / ((arg2 - 67) / 49);
        if (arg3 < this.field4603 || this.field4600 < arg3) {
            return false;
        } else if (this.field4610 <= arg1 && this.field4608 >= arg1) {
            int var6 = arg0 - this.field4602;
            int var7 = arg1 - this.field4598;
            return this.field4612 > var6 * var6 + (var7 * var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static final void method1989(int arg0) {
        field4604++;
        class463.field5904 = 0;
        int var1 = 28 / ((arg0 + 51) / 48);
        class1.field7.method247(2);
        class84.field1188 = false;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZIIIIIIIII)V")
    public final void method1990(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field4602 = arg0;
        this.field4612 = arg3 * arg3;
        this.field4598 = arg5;
        field4611++;
        this.field4605 = arg9;
        this.field4600 = this.field4605 + arg8;
        this.field4608 = this.field4598 + arg10;
        this.field4599 = this.field4602 + arg7;
        this.field4610 = this.field4598 + arg4;
        if (!arg1) {
            method1991(-29);
        }
        this.field4606 = this.field4602 + arg6;
        this.field4603 = this.field4605 + arg2;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public static void method1991(int arg0) {
        field4607 = null;
        if (arg0 != -8862) {
            field4607 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class362(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field4605 = arg1;
        this.field4612 = arg3 * arg3;
        this.field4598 = arg2;
        this.field4602 = arg0;
        this.field4610 = this.field4598 + arg8;
        this.field4606 = this.field4602 + arg5;
        this.field4600 = this.field4605 + arg7;
        this.field4603 = this.field4605 + arg6;
        this.field4599 = this.field4602 + arg4;
        this.field4608 = this.field4598 + arg9;
    }
}
