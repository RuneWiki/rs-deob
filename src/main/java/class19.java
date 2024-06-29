import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class19 {

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "Lkp;")
    public class417 field179 = new class417();

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "Lada;")
    public static class144 field181 = new class144(52, -1);

    @OriginalMember(owner = "client!bu", name = "q", descriptor = "I")
    public static int field189 = 0;

    @OriginalMember(owner = "client!bu", name = "r", descriptor = "I")
    public static int field190 = -1;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!bu", name = "m", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!bu", name = "n", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!bu", name = "o", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!bu", name = "p", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "Lkp;")
    private class417 field183;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)Z")
    public final boolean method119(boolean arg0) {
        field174++;
        if (!arg0) {
            this.method130(null, 40);
        }
        return this.field179.field5645 == this.field179;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)Lkp;")
    public final class417 method120(int arg0) {
        field178++;
        class417 var2 = this.field183;
        if (this.field179 == var2) {
            this.field183 = null;
            return null;
        } else {
            int var3 = -115 / ((arg0 + 27) / 42);
            this.field183 = var2.field5645;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILbu;Lkp;)V")
    private final void method121(int arg0, class19 arg1, class417 arg2) {
        field176++;
        class417 var4 = this.field179.field5648;
        if (arg0 != 0) {
            this.method122((byte) 34);
        }
        this.field179.field5648 = arg2.field5648;
        arg2.field5648.field5645 = this.field179;
        if (this.field179 != arg2) {
            arg2.field5648 = arg1.field179.field5648;
            arg2.field5648.field5645 = arg2;
            arg1.field179.field5648 = var4;
            var4.field5645 = arg1.field179;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V")
    public final void method122(byte arg0) {
        if (arg0 != 14) {
            field181 = null;
        }
        while (true) {
            class417 var2 = this.field179.field5645;
            if (this.field179 == var2) {
                field175++;
                this.field183 = null;
                return;
            }
            var2.method2457(-8422);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILkp;)V")
    public final void method123(int arg0, class417 arg1) {
        if (arg0 != -1) {
            this.field179 = null;
        }
        field180++;
        if (arg1.field5648 != null) {
            arg1.method2457(-8422);
        }
        arg1.field5645 = this.field179.field5645;
        arg1.field5648 = this.field179;
        arg1.field5648.field5645 = arg1;
        arg1.field5645.field5648 = arg1;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)Lkp;")
    public final class417 method124(byte arg0) {
        if (arg0 != 42) {
            return null;
        }
        field185++;
        class417 var2 = this.field179.field5645;
        if (this.field179 == var2) {
            this.field183 = null;
            return null;
        } else {
            this.field183 = var2.field5645;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)Lkp;")
    public final class417 method125(int arg0) {
        if (arg0 != -1) {
            return null;
        }
        field182++;
        class417 var2 = this.field179.field5648;
        if (this.field179 == var2) {
            this.field183 = null;
            return null;
        } else {
            this.field183 = var2.field5648;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)Lkp;")
    public final class417 method126(int arg0) {
        field184++;
        class417 var2 = this.field183;
        if (arg0 < 121) {
            return null;
        } else if (this.field179 == var2) {
            this.field183 = null;
            return null;
        } else {
            this.field183 = var2.field5648;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "(I)I")
    public final int method127(int arg0) {
        field188++;
        int var2 = arg0;
        class417 var3 = this.field179.field5645;
        while (this.field179 != var3) {
            var3 = var3.field5645;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "(I)Lkp;")
    public final class417 method128(int arg0) {
        field173++;
        if (arg0 != 936) {
            this.method124((byte) -74);
        }
        class417 var2 = this.field179.field5645;
        if (this.field179 == var2) {
            return null;
        } else {
            var2.method2457(-8422);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "(I)V")
    public static void method129(int arg0) {
        if (arg0 == 28961) {
            field181 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lbu;I)V")
    public final void method130(class19 arg0, int arg1) {
        field187++;
        this.method121(arg1 ^ arg1, arg0, this.field179.field5645);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lkp;I)V")
    public final void method131(class417 arg0, int arg1) {
        if (arg0.field5648 != null) {
            arg0.method2457(-8422);
        }
        field186++;
        arg0.field5648 = this.field179.field5648;
        arg0.field5645 = this.field179;
        arg0.field5648.field5645 = arg0;
        if (arg1 != 0) {
            this.method127(-76);
        }
        arg0.field5645.field5648 = arg0;
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V")
    public class19() {
        this.field179.field5645 = this.field179;
        this.field179.field5648 = this.field179;
    }
}
