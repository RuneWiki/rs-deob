import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class47 {

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "Lbf;")
    private class502 field669 = new class502();

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
    public static int field671 = 0;

    @OriginalMember(owner = "client!aea", name = "l", descriptor = "[Ln;")
    public static class17[] field677 = new class17[35];

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!aea", name = "g", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!aea", name = "h", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!aea", name = "i", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!aea", name = "k", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!aea", name = "m", descriptor = "Lbf;")
    private class502 field678;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)I", line = 3)
    public static final int method322(int arg0, int arg1, int arg2) {
        field676++;
        int var3 = -128 % ((arg2 + 2) / 58);
        return arg1 == 1 || arg1 == 3 ? class505.field6746[arg0 & 0x3] : class511.field6827[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)I", line = 21)
    public final int method323(int arg0) {
        field668++;
        if (arg0 < 70) {
            this.field669 = null;
        }
        int var2 = 0;
        class502 var3 = this.field669.field6715;
        while (this.field669 != var3) {
            var3 = var3.field6715;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(I)V", line = 50)
    public final void method324(int arg0) {
        field673++;
        if (arg0 >= -75) {
            this.method327(null, false);
        }
        while (true) {
            class502 var2 = this.field669.field6715;
            if (this.field669 == var2) {
                this.field678 = null;
                return;
            }
            var2.method2787(false);
        }
    }

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "(I)Lbf;", line = 71)
    public final class502 method325(int arg0) {
        field674++;
        class502 var2 = this.field669.field6709;
        if (arg0 <= 38) {
            return null;
        } else if (this.field669 == var2) {
            this.field678 = null;
            return null;
        } else {
            this.field678 = var2.field6709;
            return var2;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Z)V", line = 92)
    public static void method326(boolean arg0) {
        if (arg0) {
            field677 = null;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lbf;Z)V", line = 102)
    public final void method327(class502 arg0, boolean arg1) {
        if (!arg1) {
            this.method323(97);
        }
        field672++;
        if (arg0.field6709 != null) {
            arg0.method2787(false);
        }
        arg0.field6715 = this.field669;
        arg0.field6709 = this.field669.field6709;
        arg0.field6709.field6715 = arg0;
        arg0.field6715.field6709 = arg0;
    }

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "(I)Lbf;", line = 123)
    public final class502 method328(int arg0) {
        field675++;
        class502 var2 = this.field669.field6715;
        if (this.field669 == var2) {
            this.field678 = null;
            return null;
        } else if (arg0 == 0) {
            this.field678 = var2.field6715;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)Lbf;", line = 146)
    public final class502 method329(byte arg0) {
        field670++;
        if (arg0 != 77) {
            method326(false);
        }
        class502 var2 = this.field669.field6715;
        if (this.field669 == var2) {
            return null;
        } else {
            var2.method2787(false);
            return var2;
        }
    }

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "(I)Z", line = 166)
    public final boolean method330(int arg0) {
        field666++;
        if (arg0 != 3) {
            field677 = null;
        }
        return this.field669.field6715 == this.field669;
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(B)Lbf;", line = 180)
    public final class502 method331(byte arg0) {
        int var2 = 123 / ((54 - arg0) / 60);
        field667++;
        class502 var3 = this.field678;
        if (this.field669 == var3) {
            this.field678 = null;
            return null;
        } else {
            this.field678 = var3.field6715;
            return var3;
        }
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "()V", line = 209)
    public class47() {
        this.field669.field6715 = this.field669;
        this.field669.field6709 = this.field669;
    }
}
