import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class220 {

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "Ltq;")
    public class626 field3131 = new class626();

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
    public static int field3141 = 7000;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field3129 = field3141;

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "[C")
    private static char[] field3137 = new char[64];

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "[Lcs;")
    public static class340[] field3146;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "Ltq;")
    private class626 field3144;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)Ltq;")
    public final class626 method1521(int arg0) {
        field3130++;
        class626 var2 = this.field3131.field8990;
        if (this.field3131 == var2) {
            return null;
        } else {
            var2.method3617(1);
            return arg0 < 107 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)Ltq;")
    public final class626 method1522(boolean arg0) {
        field3132++;
        class626 var2 = this.field3131.field8990;
        if (this.field3131 == var2) {
            this.field3144 = null;
            return null;
        }
        this.field3144 = var2.field8990;
        if (!arg0) {
            field3141 = -48;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)Ltq;")
    public final class626 method1523(byte arg0) {
        field3134++;
        int var2 = 56 % ((-arg0 - 31) / 33);
        class626 var3 = this.field3131.field8989;
        if (this.field3131 == var3) {
            this.field3144 = null;
            return null;
        } else {
            this.field3144 = var3.field8989;
            return var3;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILtq;)V")
    public final void method1524(int arg0, class626 arg1) {
        field3142++;
        if (arg1.field8989 != null) {
            arg1.method3617(1);
        }
        if (arg0 != 43) {
            field3141 = -28;
        }
        arg1.field8989 = this.field3131;
        arg1.field8990 = this.field3131.field8990;
        arg1.field8989.field8990 = arg1;
        arg1.field8990.field8989 = arg1;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)V")
    public static void method1525(int arg0) {
        field3137 = null;
        field3146 = null;
        if (arg0 < 109) {
            field3141 = -115;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ltq;I)V")
    public final void method1526(class626 arg0, int arg1) {
        if (arg0.field8989 != null) {
            arg0.method3617(1);
        }
        field3140++;
        arg0.field8989 = this.field3131.field8989;
        arg0.field8990 = this.field3131;
        arg0.field8989.field8990 = arg0;
        int var3 = 123 / ((arg1 - 30) / 48);
        arg0.field8990.field8989 = arg0;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(B)Ltq;")
    public final class626 method1527(byte arg0) {
        field3133++;
        if (arg0 < 46) {
            field3141 = -68;
        }
        class626 var2 = this.field3144;
        if (this.field3131 == var2) {
            this.field3144 = null;
            return null;
        } else {
            this.field3144 = var2.field8990;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(I)Z")
    public final boolean method1528(int arg0) {
        if (arg0 != 65) {
            this.method1530((byte) -58);
        }
        field3145++;
        return this.field3131.field8990 == this.field3131;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILnt;)V")
    public final void method1529(int arg0, class220 arg1) {
        this.method1533(arg1, this.field3131.field8990, 0);
        field3139++;
        if (arg0 != 52) {
            this.field3131 = null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(B)V")
    public final void method1530(byte arg0) {
        while (true) {
            class626 var2 = this.field3131.field8990;
            if (this.field3131 == var2) {
                field3143++;
                this.field3144 = null;
                if (arg0 <= 78) {
                    field3141 = -99;
                    return;
                }
                return;
            }
            var2.method3617(1);
        }
    }

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "(I)I")
    public final int method1531(int arg0) {
        field3135++;
        int var2 = arg0;
        for (class626 var3 = this.field3131.field8990; var3 != this.field3131; var3 = var3.field8990) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "(B)Ltq;")
    public final class626 method1532(byte arg0) {
        field3136++;
        class626 var2 = this.field3144;
        if (this.field3131 == var2) {
            this.field3144 = null;
            return null;
        } else {
            this.field3144 = var2.field8989;
            return arg0 == 100 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "()V")
    public class220() {
        this.field3131.field8989 = this.field3131;
        this.field3131.field8990 = this.field3131;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lnt;Ltq;I)V")
    private final void method1533(class220 arg0, class626 arg1, int arg2) {
        field3138++;
        if (arg2 != 0) {
            this.method1528(109);
        }
        class626 var4 = this.field3131.field8989;
        this.field3131.field8989 = arg1.field8989;
        arg1.field8989.field8990 = this.field3131;
        if (this.field3131 != arg1) {
            arg1.field8989 = arg0.field3131.field8989;
            arg1.field8989.field8990 = arg1;
            var4.field8990 = arg0.field3131;
            arg0.field3131.field8989 = var4;
        }
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3137[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3137[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3137[var2] = (char) (var2 - 4);
        }
        field3137[63] = '/';
        field3137[62] = '+';
        field3146 = new class340[8];
    }
}
