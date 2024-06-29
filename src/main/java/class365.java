import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class365 {

    @OriginalMember(owner = "client!um", name = "l", descriptor = "Ljt;")
    private class68 field4749 = new class68();

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "Ljt;")
    private class68 field4751;

    static {
        new class335("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field4746 = -1;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method2089(int arg0) {
        int var2 = 42 % ((arg0 + 46) / 36);
        field4748++;
        return this.field4749.field880 == this.field4749;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)Ljt;", line = 13)
    public final class68 method2090(int arg0) {
        field4739++;
        if (arg0 != 0) {
            return null;
        }
        class68 var2 = this.field4749.field878;
        if (this.field4749 == var2) {
            this.field4751 = null;
            return null;
        } else {
            this.field4751 = var2.field878;
            return var2;
        }
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)Ljt;", line = 36)
    public final class68 method2091(int arg0) {
        field4738++;
        if (arg0 != -1) {
            return null;
        }
        class68 var2 = this.field4751;
        if (this.field4749 == var2) {
            this.field4751 = null;
            return null;
        } else {
            this.field4751 = var2.field880;
            return var2;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 57)
    public static final boolean method2092(String arg0, int arg1) {
        field4750++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class280.field3555; var2++) {
            if (arg0.equalsIgnoreCase(class329.field4163[var2])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class23.field336.field2852);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZII)I", line = 84)
    public static final int method2093(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method2093(true, 114, -43);
        }
        field4745++;
        return arg1 == 4 || arg1 == 5 ? class181.field2392[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)I", line = 102)
    public final int method2094(int arg0) {
        field4742++;
        if (arg0 != 1126) {
            return 125;
        }
        int var2 = 0;
        class68 var3 = this.field4749.field880;
        while (this.field4749 != var3) {
            var3 = var3.field880;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V", line = 128)
    public final void method2095(int arg0) {
        while (true) {
            class68 var2 = this.field4749.field880;
            if (this.field4749 == var2) {
                field4743++;
                int var3 = 19 / ((-arg0 - 60) / 40);
                this.field4751 = null;
                return;
            }
            var2.method603(0);
        }
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(I)Ljt;", line = 157)
    public final class68 method2096(int arg0) {
        field4744++;
        class68 var2 = this.field4749.field880;
        if (this.field4749 == var2) {
            return null;
        } else {
            var2.method603(arg0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)Ljt;", line = 181)
    public final class68 method2097(byte arg0) {
        field4741++;
        class68 var2 = this.field4749.field880;
        if (this.field4749 == var2) {
            this.field4751 = null;
            return null;
        } else {
            this.field4751 = var2.field880;
            return arg0 == 86 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III)Lah;", line = 204)
    public static final class262 method2098(int arg0, int arg1, int arg2) {
        class490 var3 = class125.field1664[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class262 var4 = var3.field7129;
            var3.field7129 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljt;I)V", line = 214)
    public final void method2099(class68 arg0, int arg1) {
        field4740++;
        if (arg0.field878 != null) {
            arg0.method603(0);
        }
        arg0.field880 = this.field4749;
        arg0.field878 = this.field4749.field878;
        if (arg1 < 35) {
            this.method2099(null, 100);
        }
        arg0.field878.field880 = arg0;
        arg0.field880.field878 = arg0;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V", line = 238)
    public class365() {
        this.field4749.field878 = this.field4749;
        this.field4749.field880 = this.field4749;
    }
}
