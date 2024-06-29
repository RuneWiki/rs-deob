import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class369 {

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Lmg;")
    private class134 field5770;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public int field5773;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    private int field5767;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public int field5768;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Lje;")
    public static class369 field5774 = new class369(0, 3, class134.field2201);

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Lje;")
    public static class369 field5775 = new class369(1, 3, class134.field2201);

    @OriginalMember(owner = "client!je", name = "j", descriptor = "Lje;")
    public static class369 field5776 = new class369(2, 4, class134.field2197);

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Lje;")
    public static class369 field5777 = new class369(3, 1, class134.field2201);

    @OriginalMember(owner = "client!je", name = "l", descriptor = "Lje;")
    public static class369 field5778 = new class369(4, 2, class134.field2201);

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Lje;")
    public static class369 field5779 = new class369(5, 3, class134.field2201);

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Lje;")
    public static class369 field5780 = new class369(6, 4, class134.field2201);

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field5781 = class622.method3610((byte) -125, 16);

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Ljo;")
    public static class307 field5782 = new class307("", 14);

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field5783 = 1;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "Lrl;")
    public static class672 field5784 = new class672(17, 1);

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Lhga;")
    public static class158 field5785 = new class158(108, -2);

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)Lje;", line = 6)
    public static final class369 method2437(byte arg0, int arg1) {
        if (arg0 < 52) {
            field5774 = null;
        }
        field5769++;
        if (arg1 == 0) {
            return field5774;
        } else if (arg1 == 1) {
            return field5775;
        } else if (arg1 == 2) {
            return field5776;
        } else if (arg1 == 3) {
            return field5777;
        } else if (arg1 == 4) {
            return field5778;
        } else if (arg1 == 5) {
            return field5779;
        } else if (arg1 == 6) {
            return field5780;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!je", name = "toString", descriptor = "()Ljava/lang/String;", line = 78)
    public final String toString() {
        field5772++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(BI)I", line = 89)
    public static final int method2438(byte arg0, int arg1) {
        field5771++;
        if (arg0 > -76) {
            method2439(-3);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 103)
    public static void method2439(int arg0) {
        field5782 = null;
        if (arg0 != -7) {
            method2438((byte) 100, -12);
        }
        field5785 = null;
        field5777 = null;
        field5778 = null;
        field5775 = null;
        field5780 = null;
        field5779 = null;
        field5774 = null;
        field5784 = null;
        field5776 = null;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(IILmg;)V", line = 123)
    private class369(int arg0, int arg1, class134 arg2) {
        this.field5770 = arg2;
        this.field5773 = arg0;
        this.field5767 = arg1;
        this.field5768 = this.field5770.field2196 * this.field5767;
        if (this.field5773 >= 16) {
            throw new RuntimeException();
        }
    }
}
