import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class88 {

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "Llk;")
    public class81 field1619 = new class81();

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "Lpj;")
    private static class237 field1623 = class33.method353("Checking for updates )2 ", 120);

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "Lpj;")
    public static class237 field1625 = field1623;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "Llk;")
    private class81 field1622;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)Llk;")
    public final class81 method672(byte arg0) {
        int var2 = -93 / ((arg0 - 72) / 34);
        field1617++;
        class81 var3 = this.field1619.field1520;
        if (this.field1619 == var3) {
            this.field1622 = null;
            return null;
        } else {
            this.field1622 = var3.field1520;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)Llk;")
    public final class81 method673(boolean arg0) {
        field1621++;
        if (arg0) {
            this.method673(false);
        }
        class81 var2 = this.field1619.field1527;
        if (this.field1619 == var2) {
            this.field1622 = null;
            return null;
        } else {
            this.field1622 = var2.field1527;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)Llk;")
    public final class81 method674(boolean arg0) {
        field1614++;
        if (arg0) {
            this.field1622 = null;
        }
        class81 var2 = this.field1622;
        if (this.field1619 == var2) {
            this.field1622 = null;
            return null;
        } else {
            this.field1622 = var2.field1520;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Llk;B)V")
    public final void method675(class81 arg0, byte arg1) {
        field1624++;
        if (arg0.field1520 != null) {
            arg0.method629(0);
        }
        arg0.field1527 = this.field1619;
        arg0.field1520 = this.field1619.field1520;
        arg0.field1520.field1527 = arg0;
        if (arg1 > -27) {
            this.method678(false);
        }
        arg0.field1527.field1520 = arg0;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public final void method676(int arg0) {
        if (arg0 != 16841) {
            this.method675((class81) null, (byte) 103);
        }
        while (true) {
            class81 var2 = this.field1619.field1527;
            if (this.field1619 == var2) {
                field1616++;
                this.field1622 = null;
                return;
            }
            var2.method629(arg0 - 16841);
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(Z)V")
    public static void method677(boolean arg0) {
        if (!arg0) {
            field1625 = null;
            field1623 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(Z)Llk;")
    public final class81 method678(boolean arg0) {
        field1613++;
        if (arg0) {
            return null;
        }
        class81 var2 = this.field1619.field1527;
        if (this.field1619 == var2) {
            return null;
        } else {
            var2.method629(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILlk;)V")
    public final void method679(int arg0, class81 arg1) {
        if (arg1.field1520 != null) {
            arg1.method629(0);
        }
        field1618++;
        if (arg0 != 24549) {
            this.method674(true);
        }
        arg1.field1527 = this.field1619.field1527;
        arg1.field1520 = this.field1619;
        arg1.field1520.field1527 = arg1;
        arg1.field1527.field1520 = arg1;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)Llk;")
    public final class81 method680(int arg0) {
        field1620++;
        if (arg0 <= 15) {
            this.method674(true);
        }
        class81 var2 = this.field1622;
        if (this.field1619 == var2) {
            this.field1622 = null;
            return null;
        } else {
            this.field1622 = var2.field1527;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class88() {
        this.field1619.field1527 = this.field1619;
        this.field1619.field1520 = this.field1619;
    }
}
