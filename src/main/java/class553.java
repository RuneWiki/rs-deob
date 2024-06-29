import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class553 extends class28 {

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public int field7567;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
    private int field7576;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    private int field7563;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    private int field7565;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
    private int field7577;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public int field7571;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public int field7574;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    private int field7570;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public int field7566;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "Z")
    public static boolean field7575 = true;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II[IB)V")
    public final void method3097(int arg0, int arg1, int[] arg2, byte arg3) {
        arg2[2] = arg1 - (this.field7566 - this.field7577);
        field7573++;
        arg2[1] = this.field7565 + arg0 - this.field7571;
        arg2[0] = this.field7570;
        if (arg3 != 86) {
            method3102(false, null);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZI)Z")
    public final boolean method3098(int arg0, boolean arg1, int arg2) {
        field7578++;
        if (!arg1) {
            this.field7571 = -1;
        }
        return arg0 >= this.field7565 && arg0 <= this.field7576 && arg2 >= this.field7577 && this.field7563 >= arg2;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II[IZ)V")
    public final void method3099(int arg0, int arg1, int[] arg2, boolean arg3) {
        if (arg3) {
            this.field7565 = -45;
        }
        arg2[0] = 0;
        arg2[2] = this.field7566 + arg1 - this.field7577;
        field7568++;
        arg2[1] = arg0 + this.field7571 - this.field7565;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(Lfca;I)V")
    public static final void method3100(class188 arg0, int arg1) {
        field7562++;
        if (class431.field5989 == arg0.field2366) {
            class200.field2630[arg0.field2467] = true;
        }
        if (arg1 != 0) {
            method3104(40);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIII)Z")
    public final boolean method3101(int arg0, int arg1, int arg2, int arg3) {
        field7569++;
        if (arg1 == -1368) {
            return this.field7570 == arg3 && arg0 >= this.field7565 && this.field7576 >= arg0 && this.field7577 <= arg2 && arg2 <= this.field7563;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLjava/lang/String;)J")
    public static final long method3102(boolean arg0, String arg1) {
        field7564++;
        int var2 = arg1.length();
        long var3 = 0L;
        if (arg0) {
            field7575 = false;
        }
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (long) arg1.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIB)Z")
    public final boolean method3103(int arg0, int arg1, byte arg2) {
        field7561++;
        if (arg2 > -57) {
            return false;
        } else {
            return arg0 >= this.field7571 && this.field7574 >= arg0 && this.field7566 <= arg1 && this.field7567 >= arg1;
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field7567 = arg8;
        this.field7576 = arg3;
        this.field7563 = arg4;
        this.field7565 = arg1;
        this.field7577 = arg2;
        this.field7571 = arg5;
        this.field7574 = arg7;
        this.field7570 = arg0;
        this.field7566 = arg6;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public static final void method3104(int arg0) {
        field7572++;
        class168.field2105 = 1;
        class644.field9129 = -1;
        if (arg0 != 29423) {
            field7575 = true;
        }
        long var1 = 0L;
        if (class267.field3667 == null) {
            class689.method3818(35, 104);
        } else {
            class138 var3 = new class138(class326.method2093((byte) 8, class527.method2996(class267.field3667, (byte) -119)));
            long var4 = var3.method949(arg0 ^ 0x7285);
            class12.field116 = var3.method949(arg0 ^ 0x729E);
            class525.method2994(arg0 - 29424, class98.method538(var4, arg0 ^ 0x72B5), "", true);
        }
    }
}
