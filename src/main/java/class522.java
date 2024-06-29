import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public class class522 {

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "Ltq;")
    public class513 field7324 = new class513();

    @OriginalMember(owner = "client!fha", name = "o", descriptor = "Lfha;")
    public static class522 field7338 = new class522();

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!fha", name = "c", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!fha", name = "d", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!fha", name = "e", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!fha", name = "f", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!fha", name = "g", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!fha", name = "h", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!fha", name = "i", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!fha", name = "j", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!fha", name = "k", descriptor = "I")
    public static int field7334;

    @OriginalMember(owner = "client!fha", name = "l", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!fha", name = "n", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!fha", name = "p", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!fha", name = "q", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!fha", name = "m", descriptor = "Ltq;")
    private class513 field7336;

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(I)Ltq;")
    public final class513 method3111(int arg0) {
        field7334++;
        class513 var2 = this.field7336;
        if (arg0 <= 113) {
            field7338 = null;
        }
        if (this.field7324 == var2) {
            this.field7336 = null;
            return null;
        } else {
            this.field7336 = var2.field7165;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(Z)I")
    public static final int method3112(boolean arg0) {
        if (arg0) {
            return -88;
        } else {
            field7339++;
            return class209.field2978;
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(B)I")
    public final int method3113(byte arg0) {
        field7326++;
        if (arg0 >= -57) {
            this.field7324 = null;
        }
        int var2 = 0;
        class513 var3 = this.field7324.field7165;
        while (this.field7324 != var3) {
            var3 = var3.field7165;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "(I)Ltq;")
    public final class513 method3114(int arg0) {
        field7331++;
        class513 var2 = this.field7324.field7164;
        if (this.field7324 == var2) {
            this.field7336 = null;
            return null;
        } else if (arg0 >= -64) {
            return null;
        } else {
            this.field7336 = var2.field7164;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "(Z)Ltq;")
    public final class513 method3115(boolean arg0) {
        field7327++;
        class513 var2 = this.field7324.field7165;
        if (this.field7324 == var2) {
            return null;
        } else {
            var2.method3065(-17363);
            return arg0 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(ILtq;)V")
    public final void method3116(int arg0, class513 arg1) {
        field7333++;
        if (arg1.field7164 != null) {
            arg1.method3065(-17363);
        }
        arg1.field7164 = this.field7324.field7164;
        if (arg0 == 29066) {
            arg1.field7165 = this.field7324;
            arg1.field7164.field7165 = arg1;
            arg1.field7165.field7164 = arg1;
        }
    }

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "(B)Ltq;")
    public final class513 method3117(byte arg0) {
        field7337++;
        class513 var2 = this.field7336;
        if (this.field7324 == var2) {
            this.field7336 = null;
            return null;
        }
        this.field7336 = var2.field7164;
        if (arg0 < 82) {
            field7340 = 88;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fha", name = "c", descriptor = "(B)Ltq;")
    public final class513 method3118(byte arg0) {
        if (arg0 != 73) {
            this.method3115(false);
        }
        field7332++;
        class513 var2 = this.field7324.field7165;
        if (this.field7324 == var2) {
            this.field7336 = null;
            return null;
        } else {
            this.field7336 = var2.field7165;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fha", name = "c", descriptor = "(Z)V")
    public static void method3119(boolean arg0) {
        if (!arg0) {
            field7340 = 2;
        }
        field7338 = null;
    }

    @OriginalMember(owner = "client!fha", name = "<init>", descriptor = "()V")
    public class522() {
        this.field7324.field7165 = this.field7324;
        this.field7324.field7164 = this.field7324;
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(ZLfha;Ltq;)V")
    private final void method3120(boolean arg0, class522 arg1, class513 arg2) {
        field7328++;
        class513 var4 = this.field7324.field7164;
        this.field7324.field7164 = arg2.field7164;
        arg2.field7164.field7165 = this.field7324;
        if (!arg0) {
            this.method3122(-24);
        }
        if (this.field7324 != arg2) {
            arg2.field7164 = arg1.field7324.field7164;
            arg2.field7164.field7165 = arg2;
            var4.field7165 = arg1.field7324;
            arg1.field7324.field7164 = var4;
        }
    }

    @OriginalMember(owner = "client!fha", name = "d", descriptor = "(B)Z")
    public final boolean method3121(byte arg0) {
        int var2 = 29 % ((-arg0 - 59) / 55);
        field7325++;
        return this.field7324.field7165 == this.field7324;
    }

    @OriginalMember(owner = "client!fha", name = "c", descriptor = "(I)V")
    public final void method3122(int arg0) {
        field7335++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            class513 var2 = this.field7324.field7165;
            if (this.field7324 == var2) {
                this.field7336 = null;
                return;
            }
            var2.method3065(arg0 - 17363);
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lfha;B)V")
    public final void method3123(class522 arg0, byte arg1) {
        field7329++;
        if (arg1 > 14) {
            this.method3120(true, arg0, this.field7324.field7165);
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(Ltq;B)V")
    public final void method3124(class513 arg0, byte arg1) {
        field7330++;
        if (arg0.field7164 != null) {
            arg0.method3065(-17363);
        }
        arg0.field7164 = this.field7324;
        arg0.field7165 = this.field7324.field7165;
        arg0.field7164.field7165 = arg0;
        arg0.field7165.field7164 = arg0;
        int var3 = -76 / ((arg1 + 75) / 47);
    }
}
