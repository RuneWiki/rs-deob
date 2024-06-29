import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class766 {

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "B")
    public byte field10421;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field10416;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field10417;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field10418;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field10419;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field10420;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "Lcda;")
    public class121 field10430;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "Lcda;")
    public class121 field10432;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Luc;")
    public static class133 field10415;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Lpa;")
    public class417 field10426;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "Lbj;")
    public class569 field10431;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Lfa;")
    public class590 field10425;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Lsi;")
    public class721 field10423;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "Lsi;")
    public class721 field10433;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "Lmf;")
    public class766 field10422;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "S")
    public short field10424;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "S")
    public short field10427;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "S")
    public short field10428;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "S")
    public short field10429;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)I", line = 5)
    public static final int method4161(byte arg0, int arg1) {
        int var2 = -116 / ((-arg0 - 4) / 58);
        field10418++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 17)
    public static void method4162(int arg0) {
        field10415 = null;
        if (arg0 != -24169) {
            method4165(118, -119);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V", line = 31)
    public final void method4163(boolean arg0) {
        while (this.field10431 != null) {
            class569 var2 = this.field10431.field7189;
            this.field10431.method3064((byte) -57);
            this.field10431 = var2;
        }
        if (!arg0) {
            field10417 = -18;
        }
        field10419++;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLha;IIIIILqf;IIII)V", line = 49)
    public static final void method4164(byte arg0, class570 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class403 arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg10 > arg11 && (arg2 + arg11) > arg10 && (arg5 - 13) < arg9 && (arg5 + 3) > arg9) {
            arg3 = arg4;
        }
        int var12 = -16 % ((-arg0 - 53) / 38);
        field10416++;
        String var13 = class229.method1473((byte) 91, arg7);
        class595.field7562.method2430(var13, arg3, class269.field3556, arg11 + 3, 0, 0, arg5, class230.field3103);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V", line = 65)
    public static final void method4165(int arg0, int arg1) {
        field10420++;
        if (class683.method3667(arg1, arg0 ^ 0x61)) {
            class215.method1419(-1, class647.field8259[arg1], arg0);
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I)V", line = 76)
    public class766(int arg0) {
        this.field10421 = (byte) arg0;
    }
}
