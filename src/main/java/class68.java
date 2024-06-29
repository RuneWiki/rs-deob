import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class68 {

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Lsa;")
    private class121 field1747 = new class121();

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Loc;")
    public static class99 field1748 = class48.method402((byte) -104, "Passwort: ");

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Loc;")
    private static class99 field1753 = class48.method402((byte) -104, "No reply from loginserver)3");

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field1749 = 0;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field1759 = 0;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Loc;")
    public static class99 field1751 = class48.method402((byte) -104, "swe");

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "J")
    public static long field1755 = 0L;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "Loc;")
    public static class99 field1760 = field1753;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Loc;")
    public static class99 field1758 = class48.method402((byte) -104, "leuchten1:");

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "J")
    public static long field1745;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "Lae;")
    public static class6 field1757;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILsa;)V")
    public final void method595(int arg0, class121 arg1) {
        if (arg0 > -3) {
            return;
        }
        field1744++;
        if (arg1.field2951 != null) {
            arg1.method1010((byte) 45);
        }
        arg1.field2953 = this.field1747;
        arg1.field2951 = this.field1747.field2951;
        arg1.field2951.field2953 = arg1;
        arg1.field2953.field2951 = arg1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static void method596(byte arg0) {
        field1748 = null;
        field1760 = null;
        if (arg0 < -100) {
            field1751 = null;
            field1753 = null;
            field1757 = null;
            field1758 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)Lsa;")
    public final class121 method597(boolean arg0) {
        class121 var2 = this.field1747.field2953;
        field1754++;
        if (arg0) {
            field1748 = null;
        }
        return this.field1747 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)Lra;")
    public static final class115 method598(byte arg0) {
        if (arg0 != 91) {
            method598((byte) -32);
        }
        class115 var1 = new class115(class74.field1887, class95.field2319, class119.field2929, class21.field508, class86.field2142);
        field1761++;
        class89.method746(arg0 ^ 0x27);
        return var1;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class68() {
        this.field1747.field2953 = this.field1747;
        this.field1747.field2951 = this.field1747;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(ILsa;)V")
    public final void method599(int arg0, class121 arg1) {
        if (arg1.field2951 != null) {
            arg1.method1010((byte) 45);
        }
        arg1.field2953 = this.field1747.field2953;
        field1750++;
        if (arg0 == 0) {
            arg1.field2951 = this.field1747;
            arg1.field2951.field2953 = arg1;
            arg1.field2953.field2951 = arg1;
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(B)Lsa;")
    public final class121 method600(byte arg0) {
        int var2 = -43 / ((23 - arg0) / 38);
        field1762++;
        class121 var3 = this.field1747.field2953;
        if (this.field1747 == var3) {
            return null;
        } else {
            var3.method1010((byte) 45);
            return var3;
        }
    }
}
