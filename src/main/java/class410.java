import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class410 {

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "Lbk;")
    private class254 field5989 = new class254();

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "I")
    public static int field5996 = 0;

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "Lwj;")
    public static class270 field5991 = new class270(101, 0);

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!ht", name = "l", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!ht", name = "m", descriptor = "Lbk;")
    private class254 field5999;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)Lbk;", line = 3)
    public final class254 method2452(int arg0) {
        field5997++;
        class254 var2 = this.field5989.field3529;
        if (arg0 > -101) {
            this.method2454(-83, null);
        }
        if (this.field5989 == var2) {
            return null;
        } else {
            var2.method1522(-59);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)Z", line = 21)
    public final boolean method2453(int arg0) {
        field5990++;
        if (arg0 == -8365) {
            return this.field5989.field3529 == this.field5989;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILbk;)V", line = 38)
    public final void method2454(int arg0, class254 arg1) {
        field5998++;
        if (arg0 != -9946) {
            return;
        }
        if (arg1.field3525 != null) {
            arg1.method1522(arg0 ^ 0x26E3);
        }
        arg1.field3529 = this.field5989;
        arg1.field3525 = this.field5989.field3525;
        arg1.field3525.field3529 = arg1;
        arg1.field3529.field3525 = arg1;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)Lbk;", line = 59)
    public final class254 method2455(byte arg0) {
        field5993++;
        if (arg0 != 125) {
            method2456(15, '\n');
        }
        class254 var2 = this.field5989.field3525;
        if (this.field5989 == var2) {
            this.field5999 = null;
            return null;
        } else {
            this.field5999 = var2.field3525;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IC)Z", line = 80)
    public static final boolean method2456(int arg0, char arg1) {
        field5992++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else if (arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ') {
            return true;
        } else {
            return arg0 != 338;
        }
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V", line = 194)
    public class410() {
        this.field5989.field3525 = this.field5989;
        this.field5989.field3529 = this.field5989;
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(I)V", line = 106)
    public final void method2457(int arg0) {
        while (true) {
            class254 var2 = this.field5989.field3529;
            if (this.field5989 == var2) {
                if (arg0 != 8165) {
                    this.method2459(59);
                }
                field5987++;
                this.field5999 = null;
                return;
            }
            var2.method1522(-59);
        }
    }

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)Lbk;", line = 129)
    public final class254 method2458(int arg0) {
        field5995++;
        int var2 = -18 % ((arg0 - 72) / 36);
        class254 var3 = this.field5999;
        if (this.field5989 == var3) {
            this.field5999 = null;
            return null;
        } else {
            this.field5999 = var3.field3529;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "(I)I", line = 149)
    public final int method2459(int arg0) {
        field5988++;
        int var2 = 0;
        class254 var3 = this.field5989.field3529;
        if (arg0 != -4137) {
            this.field5989 = null;
        }
        while (this.field5989 != var3) {
            var3 = var3.field3529;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(B)V", line = 171)
    public static void method2460(byte arg0) {
        int var1 = -4 % ((arg0 + 65) / 41);
        field5991 = null;
    }

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "(I)Lbk;", line = 206)
    public final class254 method2461(int arg0) {
        field5994++;
        class254 var2 = this.field5989.field3529;
        if (this.field5989 == var2) {
            this.field5999 = null;
            return null;
        }
        if (arg0 > -77) {
            field5991 = null;
        }
        this.field5999 = var2.field3529;
        return var2;
    }
}
