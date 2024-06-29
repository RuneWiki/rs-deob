import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class314 {

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "Lcca;")
    private class696 field4019 = new class696();

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "Lcca;")
    private class696 field4028;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
    public static final void method1833(int arg0) {
        class112.method758(-1);
        field4024++;
        class107.field1323 = false;
        if (arg0 != 100) {
            field4027 = 40;
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)Lcca;")
    public final class696 method1834(int arg0) {
        field4030++;
        class696 var2 = this.field4019.field9860;
        if (this.field4019 == var2) {
            return null;
        }
        if (arg0 != 0) {
            this.method1838((byte) -21);
        }
        var2.method3869(true);
        return var2;
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)Z")
    public final boolean method1835(int arg0) {
        field4029++;
        if (arg0 > -75) {
            return false;
        } else {
            return this.field4019.field9860 == this.field4019;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)Lcca;")
    public final class696 method1836(byte arg0) {
        field4022++;
        class696 var2 = this.field4028;
        if (this.field4019 == var2) {
            this.field4028 = null;
            return null;
        }
        if (arg0 != -26) {
            field4027 = 58;
        }
        this.field4028 = var2.field9860;
        return var2;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lus;ZLrr;)Lida;")
    public static final class650 method1837(class328 arg0, boolean arg1, class395 arg2) {
        field4021++;
        if (!arg1) {
            return null;
        }
        class650 var3 = class561.method3171((byte) 123);
        var3.field8929 = arg0.field4186;
        var3.field8932 = arg0;
        if (var3.field8929 == -1) {
            var3.field8928 = new class757(260);
        } else if (var3.field8929 == -2) {
            var3.field8928 = new class757(10000);
        } else if (var3.field8929 <= 18) {
            var3.field8928 = new class757(20);
        } else if (var3.field8929 > 98) {
            var3.field8928 = new class757(260);
        } else {
            var3.field8928 = new class757(100);
        }
        var3.field8928.method4210((byte) -103, arg2);
        var3.field8928.method4215((byte) 90, var3.field8932.method1940((byte) 102));
        var3.field8930 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V")
    public final void method1838(byte arg0) {
        int var2 = -38 % ((-arg0 - 67) / 53);
        while (true) {
            class696 var3 = this.field4019.field9860;
            if (this.field4019 == var3) {
                field4025++;
                this.field4028 = null;
                return;
            }
            var3.method3869(true);
        }
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)Lcca;")
    public final class696 method1839(int arg0) {
        int var2 = 28 % ((arg0 + 55) / 63);
        field4018++;
        class696 var3 = this.field4019.field9860;
        if (this.field4019 == var3) {
            this.field4028 = null;
            return null;
        } else {
            this.field4028 = var3.field9860;
            return var3;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILcca;)V")
    public final void method1840(int arg0, class696 arg1) {
        if (arg0 != 18) {
            this.method1839(-56);
        }
        if (arg1.field9862 != null) {
            arg1.method3869(true);
        }
        field4023++;
        arg1.field9860 = this.field4019;
        arg1.field9862 = this.field4019.field9862;
        arg1.field9862.field9860 = arg1;
        arg1.field9860.field9862 = arg1;
    }

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)Lcca;")
    public final class696 method1841(int arg0) {
        field4026++;
        class696 var2 = this.field4019.field9862;
        if (arg0 != -10244) {
            field4027 = -45;
        }
        if (this.field4019 == var2) {
            this.field4028 = null;
            return null;
        } else {
            this.field4028 = var2.field9862;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)I")
    public final int method1842(int arg0) {
        field4020++;
        int var2 = arg0;
        for (class696 var3 = this.field4019.field9860; var3 != this.field4019; var3 = var3.field9860) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
    public class314() {
        this.field4019.field9860 = this.field4019;
        this.field4019.field9862 = this.field4019;
    }
}
