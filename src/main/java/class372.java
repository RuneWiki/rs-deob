import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class372 extends class168 {

    @OriginalMember(owner = "client!bfa", name = "m", descriptor = "I")
    public int field4770;

    @OriginalMember(owner = "client!bfa", name = "t", descriptor = "I")
    private int field4777;

    @OriginalMember(owner = "client!bfa", name = "l", descriptor = "I")
    public int field4769;

    @OriginalMember(owner = "client!bfa", name = "o", descriptor = "I")
    private int field4772;

    @OriginalMember(owner = "client!bfa", name = "y", descriptor = "I")
    public int field4782;

    @OriginalMember(owner = "client!bfa", name = "x", descriptor = "I")
    private int field4781;

    @OriginalMember(owner = "client!bfa", name = "n", descriptor = "I")
    private int field4771;

    @OriginalMember(owner = "client!bfa", name = "k", descriptor = "I")
    private int field4768;

    @OriginalMember(owner = "client!bfa", name = "u", descriptor = "I")
    public int field4778;

    @OriginalMember(owner = "client!bfa", name = "s", descriptor = "Lan;")
    public static class23 field4776 = new class23();

    @OriginalMember(owner = "client!bfa", name = "A", descriptor = "Lde;")
    public static class534 field4784 = new class534(20);

    @OriginalMember(owner = "client!bfa", name = "w", descriptor = "F")
    public static float field4780;

    @OriginalMember(owner = "client!bfa", name = "j", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!bfa", name = "p", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!bfa", name = "r", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!bfa", name = "v", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!bfa", name = "z", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!bfa", name = "q", descriptor = "Lda;")
    public static class61 field4774;

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(III)Z", line = 4)
    public final boolean method2138(int arg0, int arg1, int arg2) {
        if (arg2 != 31838) {
            this.method2141(true, 111, 111, 69);
        }
        field4775++;
        return arg1 >= this.field4778 && arg1 <= this.field4769 && this.field4770 <= arg0 && arg0 <= this.field4782;
    }

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "(III)Z", line = 25)
    public final boolean method2139(int arg0, int arg1, int arg2) {
        field4779++;
        if (arg1 == 0) {
            return arg0 >= this.field4777 && this.field4771 >= arg0 && this.field4768 <= arg2 && arg2 <= this.field4772;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "([IBII)V", line = 41)
    public final void method2140(int[] arg0, byte arg1, int arg2, int arg3) {
        int var5 = -61 % ((-arg1 - 14) / 42);
        arg0[2] = arg3 + this.field4770 - this.field4768;
        arg0[1] = this.field4778 + arg2 - this.field4777;
        arg0[0] = 0;
        field4767++;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZIII)Z", line = 53)
    public final boolean method2141(boolean arg0, int arg1, int arg2, int arg3) {
        field4783++;
        if (arg0) {
            return false;
        } else {
            return this.field4781 == arg3 && this.field4777 <= arg1 && this.field4771 >= arg1 && arg2 >= this.field4768 && this.field4772 >= arg2;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I[III)V", line = 69)
    public final void method2142(int arg0, int[] arg1, int arg2, int arg3) {
        int var5 = -3 % ((arg2 + 68) / 32);
        arg1[0] = this.field4781;
        field4773++;
        arg1[1] = -this.field4778 - (-this.field4777 - arg0);
        arg1[2] = this.field4768 + arg3 - this.field4770;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)V", line = 84)
    public static void method2143(byte arg0) {
        field4774 = null;
        field4776 = null;
        field4784 = null;
        if (arg0 != 75) {
            method2143((byte) 75);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(IIIIIIIII)V", line = 106)
    public class372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field4770 = arg6;
        this.field4777 = arg1;
        this.field4769 = arg7;
        this.field4772 = arg4;
        this.field4782 = arg8;
        this.field4781 = arg0;
        this.field4771 = arg3;
        this.field4768 = arg2;
        this.field4778 = arg5;
    }
}
