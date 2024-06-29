import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class693 extends class184 {

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
    public int field9575;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
    public int field9574;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public int field9568;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    private int field9567;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    private int field9573;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
    private int field9577;

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "I")
    private int field9581;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
    public int field9582;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
    private int field9583;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "[I")
    public static int[] field9576 = new int[200];

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "Lqe;")
    public static class469 field9572 = new class469(35, 7);

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field9566;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field9569;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public static int field9570;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public static int field9571;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
    public static int field9578;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "I")
    public static int field9579;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
    public static int field9580;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[III)V")
    public final void method3932(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[1] = arg3 + this.field9568 - this.field9581;
        field9571++;
        arg1[2] = this.field9575 + arg0 - this.field9573;
        arg1[0] = 0;
        if (arg2 >= -45) {
            method3939((byte) -30);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static final void method3933(int arg0) {
        field9578++;
        if (arg0 > -91) {
            field9572 = null;
        }
        class350.field5111.method2514(-128);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)Z")
    public final boolean method3934(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 1) {
            this.method3935(-59, -10, -42);
        }
        field9580++;
        return this.field9583 == arg1 && arg3 >= this.field9581 && this.field9567 >= arg3 && this.field9573 <= arg2 && this.field9577 >= arg2;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)Z")
    public final boolean method3935(int arg0, int arg1, int arg2) {
        field9579++;
        if (arg2 != 27505) {
            method3938(-7);
        }
        return this.field9568 <= arg1 && this.field9574 >= arg1 && this.field9575 <= arg0 && this.field9582 >= arg0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[IIZ)V")
    public final void method3936(int arg0, int[] arg1, int arg2, boolean arg3) {
        arg1[1] = this.field9581 + arg2 - this.field9568;
        arg1[2] = arg0 - (this.field9575 - this.field9573);
        field9570++;
        arg1[0] = this.field9583;
        if (arg3) {
            field9576 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(III)Z")
    public final boolean method3937(int arg0, int arg1, int arg2) {
        if (arg0 == 2) {
            field9569++;
            return arg1 >= this.field9581 && arg1 <= this.field9567 && arg2 >= this.field9573 && arg2 <= this.field9577;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
    public static final void method3938(int arg0) {
        if (arg0 != 35) {
            return;
        }
        for (class342 var1 = (class342) class748.field10459.method1195(0); var1 != null; var1 = (class342) class748.field10459.method1201(2)) {
            if (class66.method585(var1.field4972, (byte) -61)) {
                class573.method3315(var1, (byte) -116);
            }
        }
        field9566++;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public static void method3939(byte arg0) {
        int var1 = -109 % ((arg0 + 13) / 45);
        field9572 = null;
        field9576 = null;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class693(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field9575 = arg6;
        this.field9574 = arg7;
        this.field9568 = arg5;
        this.field9567 = arg3;
        this.field9573 = arg2;
        this.field9577 = arg4;
        this.field9581 = arg1;
        this.field9582 = arg8;
        this.field9583 = arg0;
    }
}
