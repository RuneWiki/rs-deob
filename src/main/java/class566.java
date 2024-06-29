import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class566 extends class134 {

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "I")
    private int field8046;

    @OriginalMember(owner = "client!cv", name = "z", descriptor = "I")
    public int field8056;

    @OriginalMember(owner = "client!cv", name = "u", descriptor = "I")
    public int field8051;

    @OriginalMember(owner = "client!cv", name = "s", descriptor = "I")
    private int field8049;

    @OriginalMember(owner = "client!cv", name = "v", descriptor = "I")
    private int field8052;

    @OriginalMember(owner = "client!cv", name = "t", descriptor = "I")
    private int field8050;

    @OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
    public int field8043;

    @OriginalMember(owner = "client!cv", name = "x", descriptor = "I")
    public int field8054;

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "I")
    private int field8045;

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "Ldh;")
    public static class320 field8042 = new class320(54, -2);

    @OriginalMember(owner = "client!cv", name = "w", descriptor = "Ldh;")
    public static class320 field8053 = new class320(10, 20);

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "I")
    public static int field8040;

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "I")
    public static int field8041;

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "I")
    public static int field8044;

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "I")
    public static int field8047;

    @OriginalMember(owner = "client!cv", name = "r", descriptor = "I")
    public static int field8048;

    @OriginalMember(owner = "client!cv", name = "y", descriptor = "I")
    public static int field8055;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I[III)V", line = 9)
    public final void method3290(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[arg3] = arg2 + this.field8045 - this.field8056;
        field8044++;
        arg1[1] = arg0 + this.field8049 - this.field8043;
        arg1[0] = this.field8050;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(BII)Z", line = 19)
    public final boolean method3291(byte arg0, int arg1, int arg2) {
        field8048++;
        if (arg0 != -30) {
            this.method3294((byte) -5, -98, 101, -109);
        }
        return arg2 >= this.field8043 && arg2 <= this.field8054 && this.field8056 <= arg1 && this.field8051 >= arg1;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(III[I)V", line = 34)
    public final void method3292(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = 0;
        arg3[1] = this.field8043 + arg0 - this.field8049;
        field8041++;
        arg3[arg1] = arg2 + this.field8056 - this.field8045;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IBI)Z", line = 46)
    public final boolean method3293(int arg0, byte arg1, int arg2) {
        field8040++;
        int var4 = 15 % ((88 - arg1) / 36);
        return arg2 >= this.field8049 && this.field8052 >= arg2 && arg0 >= this.field8045 && this.field8046 >= arg0;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(BIII)Z", line = 72)
    public final boolean method3294(byte arg0, int arg1, int arg2, int arg3) {
        field8047++;
        if (arg0 != -110) {
            field8042 = null;
        }
        return this.field8050 == arg2 && arg3 >= this.field8049 && this.field8052 >= arg3 && arg1 >= this.field8045 && arg1 <= this.field8046;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V", line = 87)
    public static void method3295(int arg0) {
        field8053 = null;
        field8042 = null;
        if (arg0 != 54) {
            method3295(106);
        }
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(IIIIIIIII)V", line = 102)
    public class566(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field8046 = arg4;
        this.field8056 = arg6;
        this.field8051 = arg8;
        this.field8049 = arg1;
        this.field8052 = arg3;
        this.field8050 = arg0;
        this.field8043 = arg5;
        this.field8054 = arg7;
        this.field8045 = arg2;
    }
}
