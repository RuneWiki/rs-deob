import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class52 extends class354 {

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public static int field739 = 0;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "[I")
    public static int[] field737 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "Len;")
    public static class322 field744 = new class322();

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "Ldl;")
    public static class64 field741;

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(ILwo;)V")
    public class52(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        if (arg0 != 6384) {
            field744 = null;
        }
        if (super.field4545 < 0 || ~super.field4545 < -5) {
            super.field4545 = this.method393((byte) 101);
        }
        ++field743;
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(II)V")
    public final void method389(int arg0, int arg1) {
        super.field4545 = arg1;
        if (arg0 != -1) {
            field739 = -61;
        }
        ++field740;
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V")
    public static void method390(int arg0) {
        if (arg0 > 18) {
            field741 = null;
            field744 = null;
            field737 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)I")
    public final int method391(int arg0, int arg1) {
        ++field736;
        if (arg0 != 3) {
            field739 = 127;
        }
        return 1;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)I")
    public final int method392(byte arg0) {
        ++field747;
        int var2 = -15 % ((arg0 - 7) / 45);
        return super.field4545;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)I")
    public final int method393(byte arg0) {
        int var2 = -5 / ((37 - arg0) / 63);
        ++field746;
        return 0;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBLsl;)Ljava/lang/String;")
    public static final String method394(int arg0, byte arg1, class461 arg2) {
        ++field742;
        try {
            int var3 = 103 % ((arg1 - -48) / 34);
            int var4 = arg2.method2594(3340);
            if (~arg0 > ~var4) {
                var4 = arg0;
            }
            byte[] var5 = new byte[var4];
            arg2.field6193 += class43.field636.method3249(arg2.field6193, arg2.field6180, -1, var4, var5, 0);
            return class190.method1277(0, var4, var5, 37);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field745;
        if (arg8 != -2) {
            method395(-70, -82, -28, 93, 109, -75, 72, 67, 4);
        }
        if (arg7 >= 1 && ~arg1 <= -2 && ~(class409.field5183 + -2) <= ~arg7 && ~arg1 >= ~(class543.field7597 + -2)) {
            int var9 = arg0;
            if (arg0 < 3 && class99.method797(arg1, ~arg8, arg7)) {
                var9 = arg0 + 1;
            }
            if (~class748.field10451.field10412.method1806((byte) -54) == -1 && !class520.method3024(var9, arg7, arg1, class440.field5865, arg8 ^ 29918)) {
                return;
            }
            if (class197.field2689 == null) {
                return;
            }
            class197.field2685.method1334(arg2, arg1, arg0, (byte) -111, class386.field4930, class526.field7350[arg0], arg7);
            if (arg3 >= 0) {
                int var10 = class748.field10451.field10386.method3003((byte) -87);
                class748.field10451.method4150(class748.field10451.field10386, 1, arg8 ^ 5);
                class197.field2685.method1338(arg6, arg7, arg0, class526.field7350[arg0], arg4, (byte) -4, arg1, var9, arg5, class386.field4930, arg3);
                class748.field10451.method4150(class748.field10451.field10386, var10, -5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lwo;)V")
    public class52(class746 arg0) {
        super(arg0);
    }
}
