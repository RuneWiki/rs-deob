import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class611 {

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "Lqm;")
    public class430 field8734 = new class430();

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    public static int field8733;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public static int field8735;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    public static int field8736;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
    public static int field8738;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
    public static int field8739;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    public static int field8742;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
    public static int field8743;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    public static int field8744;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "I")
    public static int field8746;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
    public static int field8747;

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
    public static int field8748;

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "I")
    public static int field8749;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "Ljia;")
    public static class336 field8741;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "Lqm;")
    private class430 field8740;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field8737;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
    public final void method3553(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field8745++;
        while (true) {
            class430 var2 = this.field8734.field6189;
            if (this.field8734 == var2) {
                this.field8740 = null;
                return;
            }
            var2.method2656((byte) 126);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)Lhha;")
    public static final class503 method3554(byte arg0) {
        field8746++;
        int var1 = -124 / ((-arg0 - 18) / 61);
        class503 var2 = (class503) class57.field967.method3025(false);
        if (var2 != null) {
            var2.method2656((byte) 120);
            var2.method2381(15735);
            return var2;
        }
        class503 var3;
        do {
            var3 = (class503) class412.field5871.method3025(false);
            if (var3 == null) {
                return null;
            }
            if (var3.method3071(124) > class465.method2818(255)) {
                return null;
            }
            var3.method2656((byte) 121);
            var3.method2381(15735);
        } while ((var3.field5602 & Long.MIN_VALUE) == 0L);
        return var3;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)Z")
    public final boolean method3555(int arg0) {
        if (arg0 <= 67) {
            field8737 = null;
        }
        field8736++;
        return this.field8734.field6189 == this.field8734;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILqm;Lmr;)V")
    private final void method3556(int arg0, class430 arg1, class611 arg2) {
        field8735++;
        int var4 = 3 / ((arg0 + 6) / 61);
        class430 var5 = this.field8734.field6186;
        this.field8734.field6186 = arg1.field6186;
        arg1.field6186.field6189 = this.field8734;
        if (this.field8734 != arg1) {
            arg1.field6186 = arg2.field8734.field6186;
            arg1.field6186.field6189 = arg1;
            var5.field6189 = arg2.field8734;
            arg2.field8734.field6186 = var5;
        }
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)I")
    public final int method3557(int arg0) {
        int var2 = -104 / ((-arg0 - 20) / 46);
        field8747++;
        int var3 = 0;
        for (class430 var4 = this.field8734.field6189; var4 != this.field8734; var4 = var4.field6189) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILqm;)V")
    public final void method3558(int arg0, class430 arg1) {
        if (arg1.field6186 != null) {
            arg1.method2656((byte) 125);
        }
        field8749++;
        arg1.field6189 = this.field8734.field6189;
        if (arg0 == 0) {
            arg1.field6186 = this.field8734;
            arg1.field6186.field6189 = arg1;
            arg1.field6189.field6186 = arg1;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lqm;B)V")
    public final void method3559(class430 arg0, byte arg1) {
        field8742++;
        if (arg0.field6186 != null) {
            arg0.method2656((byte) 120);
        }
        arg0.field6189 = this.field8734;
        arg0.field6186 = this.field8734.field6186;
        arg0.field6186.field6189 = arg0;
        arg0.field6189.field6186 = arg0;
        if (arg1 != 12) {
            this.field8740 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILla;[ILla;)V")
    public static final void method3560(int arg0, class423 arg1, int[] arg2, class423 arg3) {
        if (arg2 != null) {
            class346.field4952 = arg2;
        }
        field8732++;
        class595.field8457 = arg1;
        class714.field10077 = arg3;
        if (arg0 != -13338) {
            field8737 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)Lqm;")
    public final class430 method3561(byte arg0) {
        if (arg0 < 12) {
            method3560(47, null, null, null);
        }
        field8733++;
        class430 var2 = this.field8740;
        if (this.field8734 == var2) {
            this.field8740 = null;
            return null;
        } else {
            this.field8740 = var2.field6189;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)Lqm;")
    public final class430 method3562(int arg0) {
        field8738++;
        class430 var2 = this.field8740;
        if (arg0 != 0) {
            field8741 = null;
        }
        if (this.field8734 == var2) {
            this.field8740 = null;
            return null;
        } else {
            this.field8740 = var2.field6186;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "(I)Lqm;")
    public final class430 method3563(int arg0) {
        field8744++;
        if (arg0 != 0) {
            field8741 = null;
        }
        class430 var2 = this.field8734.field6189;
        if (this.field8734 == var2) {
            return null;
        } else {
            var2.method2656((byte) 119);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(B)Lqm;")
    public final class430 method3564(byte arg0) {
        field8739++;
        int var2 = -63 % ((arg0 - 24) / 55);
        class430 var3 = this.field8734.field6186;
        if (this.field8734 == var3) {
            this.field8740 = null;
            return null;
        } else {
            this.field8740 = var3.field6186;
            return var3;
        }
    }

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "(I)Lqm;")
    public final class430 method3565(int arg0) {
        int var2 = -37 % ((44 - arg0) / 56);
        field8748++;
        class430 var3 = this.field8734.field6189;
        if (this.field8734 == var3) {
            this.field8740 = null;
            return null;
        } else {
            this.field8740 = var3.field6189;
            return var3;
        }
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V")
    public class611() {
        this.field8734.field6189 = this.field8734;
        this.field8734.field6186 = this.field8734;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lmr;B)V")
    public final void method3566(class611 arg0, byte arg1) {
        if (arg1 <= 44) {
            field8737 = null;
        }
        field8743++;
        this.method3556(-97, this.field8734.field6189, arg0);
    }

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "(I)V")
    public static void method3567(int arg0) {
        if (arg0 != 0) {
            method3560(-6, null, null, null);
        }
        field8737 = null;
        field8741 = null;
    }
}
