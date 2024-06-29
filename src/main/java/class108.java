import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class108 {

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "Lfr;")
    private class375 field1663 = new class375();

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "Ltd;")
    public static class417 field1660 = null;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "Ldg;")
    public static class376 field1665 = new class376(57, 4);

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
    public static int field1667 = 0;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
    public static int field1666 = 1401;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "Lfr;")
    private class375 field1664;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)I", line = 5)
    public final int method845(byte arg0) {
        field1658++;
        if (arg0 != 82) {
            return -33;
        }
        int var2 = 0;
        for (class375 var3 = this.field1663.field5347; var3 != this.field1663; var3 = var3.field5347) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)V", line = 32)
    public final void method846(byte arg0) {
        field1654++;
        while (true) {
            class375 var2 = this.field1663.field5347;
            if (this.field1663 == var2) {
                this.field1664 = null;
                if (arg0 <= 85) {
                    this.method854((byte) 82);
                    return;
                } else {
                    return;
                }
            }
            var2.method2258((byte) 125);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)Lfr;", line = 54)
    public final class375 method847(int arg0) {
        field1656++;
        if (arg0 != 0) {
            return null;
        }
        class375 var2 = this.field1663.field5347;
        if (this.field1663 == var2) {
            return null;
        } else {
            var2.method2258((byte) 115);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(B)Lfr;", line = 72)
    public final class375 method848(byte arg0) {
        if (arg0 > -3) {
            this.field1663 = null;
        }
        field1661++;
        class375 var2 = this.field1663.field5349;
        if (this.field1663 == var2) {
            return null;
        } else {
            var2.method2258((byte) 116);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(B)Lfr;", line = 94)
    public final class375 method849(byte arg0) {
        field1659++;
        class375 var2 = this.field1663.field5347;
        if (this.field1663 == var2) {
            this.field1664 = null;
            return null;
        } else {
            this.field1664 = var2.field5347;
            int var3 = 123 % ((-arg0 - 54) / 54);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lfr;I)V", line = 113)
    public final void method850(class375 arg0, int arg1) {
        if (arg1 != 4) {
            this.method854((byte) -59);
        }
        if (arg0.field5349 != null) {
            arg0.method2258((byte) 120);
        }
        field1655++;
        arg0.field5349 = this.field1663;
        arg0.field5347 = this.field1663.field5347;
        arg0.field5349.field5347 = arg0;
        arg0.field5347.field5349 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)V", line = 131)
    public static final void method851(int arg0, int arg1) {
        if (class443.field6454 == null || class443.field6454.length < arg0) {
            class443.field6454 = new int[arg0];
        }
        field1657++;
        if (arg1 != -14417) {
            method851(-36, 104);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZLfr;)V", line = 149)
    public final void method852(boolean arg0, class375 arg1) {
        if (arg1.field5349 != null) {
            arg1.method2258((byte) 126);
        }
        field1662++;
        arg1.field5349 = this.field1663.field5349;
        if (!arg0) {
            this.field1664 = null;
        }
        arg1.field5347 = this.field1663;
        arg1.field5349.field5347 = arg1;
        arg1.field5347.field5349 = arg1;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V", line = 167)
    public static void method853(int arg0) {
        if (arg0 == -5584) {
            field1665 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(B)Lfr;", line = 182)
    public final class375 method854(byte arg0) {
        field1653++;
        class375 var2 = this.field1664;
        if (this.field1663 == var2) {
            this.field1664 = null;
            return null;
        } else if (arg0 < 86) {
            return null;
        } else {
            this.field1664 = var2.field5347;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V", line = 215)
    public class108() {
        this.field1663.field5347 = this.field1663;
        this.field1663.field5349 = this.field1663;
    }
}
