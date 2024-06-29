import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class250 {

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "Lul;")
    private class294 field3607 = new class294();

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Lct;")
    public static class285 field3600 = new class285(81, 3);

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "F")
    public static float field3604;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "Lul;")
    private class294 field3609;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "[Ldp;")
    public static class319[] field3602;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Lul;")
    public final class294 method1589(int arg0) {
        field3596++;
        class294 var2 = this.field3607.field4426;
        if (this.field3607 == var2) {
            return null;
        } else {
            int var3 = 3 % ((arg0 - 67) / 56);
            var2.method1847(true);
            return var2;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public final void method1590(int arg0) {
        field3598++;
        while (true) {
            class294 var2 = this.field3607.field4426;
            if (this.field3607 == var2) {
                if (arg0 != -15139) {
                    field3604 = 0.95312744F;
                }
                this.field3609 = null;
                return;
            }
            var2.method1847(true);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
    public static final void method1591(int arg0, int arg1) {
        field3597++;
        class186 var2 = class275.method1789(arg1, (byte) 123, 16);
        if (arg0 != 81) {
            field3600 = null;
        }
        var2.method1279((byte) -65);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)Z")
    public final boolean method1592(byte arg0) {
        if (arg0 < 104) {
            this.method1592((byte) -123);
        }
        field3601++;
        return this.field3607.field4426 == this.field3607;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
    public static void method1593(int arg0) {
        if (arg0 != 81) {
            field3604 = -0.39076585F;
        }
        field3602 = null;
        field3600 = null;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)Lul;")
    public final class294 method1594(int arg0) {
        field3606++;
        class294 var2 = this.field3607.field4426;
        if (arg0 != 16) {
            field3602 = null;
        }
        if (this.field3607 == var2) {
            this.field3609 = null;
            return null;
        } else {
            this.field3609 = var2.field4426;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Lul;")
    public final class294 method1595(byte arg0) {
        field3603++;
        if (arg0 != -10) {
            this.method1592((byte) 110);
        }
        class294 var2 = this.field3607.field4424;
        if (this.field3607 == var2) {
            this.field3609 = null;
            return null;
        } else {
            this.field3609 = var2.field4424;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)Lul;")
    public final class294 method1596(boolean arg0) {
        if (!arg0) {
            this.field3607 = null;
        }
        field3599++;
        class294 var2 = this.field3609;
        if (this.field3607 == var2) {
            this.field3609 = null;
            return null;
        } else {
            this.field3609 = var2.field4426;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lul;B)V")
    public final void method1597(class294 arg0, byte arg1) {
        if (arg0.field4424 != null) {
            arg0.method1847(true);
        }
        int var3 = 73 / ((arg1 + 13) / 52);
        field3605++;
        arg0.field4426 = this.field3607;
        arg0.field4424 = this.field3607.field4424;
        arg0.field4424.field4426 = arg0;
        arg0.field4426.field4424 = arg0;
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)I")
    public final int method1598(int arg0) {
        field3608++;
        int var2 = 0;
        for (class294 var3 = this.field3607.field4426; var3 != this.field3607; var3 = var3.field4426) {
            var2++;
        }
        return arg0 > -78 ? -50 : var2;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class250() {
        this.field3607.field4426 = this.field3607;
        this.field3607.field4424 = this.field3607;
    }
}
