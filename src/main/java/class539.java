import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class539 extends class125 {

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "Lgr;")
    public static class530 field7825 = new class530(17, 7);

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "[I")
    public static int[] field7827 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "I")
    public static int field7826;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)V")
    public static void method3248(byte arg0) {
        if (arg0 == 47) {
            field7825 = null;
            field7827 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(Z)I")
    public final int method3249(boolean arg0) {
        if (arg0) {
            return -46;
        } else {
            ++field7821;
            return super.field1732;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IILha;Lmr;Z)V")
    public static final void method3250(int arg0, int arg1, class543 arg2, class611 arg3, boolean arg4) {
        ++field7828;
        class524.field7613.method3553(0);
        if (!class724.field10181) {
            if (arg4) {
                method3248((byte) -57);
            }
            for (class241 var5 = (class241) arg3.method3565(105); var5 != null; var5 = (class241) arg3.method3561((byte) 48)) {
                class463 var6 = class664.field9482.method2687(var5.field3562, 36);
                if (class610.method3550((byte) -49, var6)) {
                    boolean var7 = class637.method3662(0, var6, var5, arg1, arg0, arg2);
                    if (var7) {
                        class488.method2975(var5, arg2, var6, 34);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZI)I")
    public final int method155(boolean arg0, int arg1) {
        if (!arg0) {
            method3248((byte) 38);
        }
        ++field7829;
        return 1;
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(ILgp;)V")
    public class539(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BI)V")
    public final void method157(byte arg0, int arg1) {
        ++field7830;
        super.field1732 = arg1;
        if (arg0 >= -32) {
            this.method155(false, -103);
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        ++field7826;
        if (arg0) {
            if (super.field1732 < 0 && ~super.field1732 < -5) {
                super.field1732 = this.method158((byte) 95);
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)I")
    public final int method158(byte arg0) {
        int var2 = 27 % ((arg0 - -63) / 49);
        ++field7823;
        return super.field1733.method3303(-1).method2049((byte) -107) > 1 ? 4 : 2;
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lgp;)V")
    public class539(class549 arg0) {
        super(arg0);
    }
}
