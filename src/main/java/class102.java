import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class102 {

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "I")
    public int field1526 = 43594;

    @OriginalMember(owner = "client!rba", name = "g", descriptor = "I")
    public int field1528 = 443;

    @OriginalMember(owner = "client!rba", name = "l", descriptor = "Z")
    private boolean field1533 = false;

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "Z")
    private boolean field1523 = false;

    @OriginalMember(owner = "client!rba", name = "h", descriptor = "[J")
    public static long[] field1529 = new long[10];

    @OriginalMember(owner = "client!rba", name = "m", descriptor = "I")
    public static int field1534 = 0;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "I")
    public int field1522;

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!rba", name = "i", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!rba", name = "j", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!rba", name = "k", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!rba", name = "o", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!rba", name = "p", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "J")
    public static long field1525;

    @OriginalMember(owner = "client!rba", name = "f", descriptor = "Ljava/lang/String;")
    public String field1527;

    @OriginalMember(owner = "client!rba", name = "n", descriptor = "[[B")
    public static byte[][] field1535;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)V")
    public static final void method728(byte arg0) {
        field1524++;
        if (class264.field3451 == 7) {
            class65.method395(false, -70);
            return;
        }
        class546.field8061 = class230.field3051;
        class230.field3051 = null;
        class322.method2003(0, 13);
        if (arg0 > -36) {
            field1535 = null;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
    public final void method729(int arg0) {
        field1532++;
        if (!this.field1533) {
            this.field1523 = true;
            this.field1533 = true;
        } else if (this.field1523) {
            this.field1523 = false;
        } else {
            this.field1533 = false;
        }
        if (arg0 != 31292) {
            this.field1526 = 14;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lrba;B)Z")
    public final boolean method730(class102 arg0, byte arg1) {
        int var3 = 72 / ((-arg1 - 84) / 41);
        field1530++;
        if (arg0 == null) {
            return false;
        } else {
            return this.field1522 == arg0.field1522 && this.field1527.equals(arg0.field1527);
        }
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)V")
    public static final void method731(int arg0) {
        int var1 = 63 % ((arg0 + 51) / 37);
        field1531++;
        class148.field2105.method3890(-1);
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(B)V")
    public static void method732(byte arg0) {
        field1529 = null;
        if (arg0 < -74) {
            field1535 = null;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILew;)Lae;")
    public final class254 method733(int arg0, class226 arg1) {
        field1536++;
        if (arg0 != 443) {
            this.method729(105);
        }
        return arg1.method1418(this.field1533 ? this.field1528 : this.field1526, 1, this.field1523, this.field1527);
    }
}
