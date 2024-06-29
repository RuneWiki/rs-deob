import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class311 extends class218 {

    @OriginalMember(owner = "client!gaa", name = "s", descriptor = "Lke;")
    public static class622 field4625 = new class622(72, -2);

    @OriginalMember(owner = "client!gaa", name = "w", descriptor = "Lke;")
    public static class622 field4629 = new class622(117, 1);

    @OriginalMember(owner = "client!gaa", name = "k", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!gaa", name = "l", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!gaa", name = "n", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!gaa", name = "o", descriptor = "I")
    public int field4621;

    @OriginalMember(owner = "client!gaa", name = "p", descriptor = "I")
    public int field4622;

    @OriginalMember(owner = "client!gaa", name = "q", descriptor = "I")
    public int field4623;

    @OriginalMember(owner = "client!gaa", name = "r", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!gaa", name = "t", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!gaa", name = "u", descriptor = "I")
    public int field4627;

    @OriginalMember(owner = "client!gaa", name = "m", descriptor = "J")
    public long field4619;

    @OriginalMember(owner = "client!gaa", name = "x", descriptor = "Lrp;")
    public static class458 field4630;

    @OriginalMember(owner = "client!gaa", name = "y", descriptor = "Lag;")
    public static class710 field4631;

    @OriginalMember(owner = "client!gaa", name = "v", descriptor = "[Ls;")
    public static class292[] field4628;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)V")
    public static void method2034(int arg0) {
        if (arg0 != 117) {
            return;
        }
        field4628 = null;
        field4625 = null;
        field4631 = null;
        field4630 = null;
        field4629 = null;
    }

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "(B)I")
    public final int method1511(byte arg0) {
        field4618++;
        return arg0 <= 103 ? 58 : this.field4623;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)I")
    public final int method1506(byte arg0) {
        field4620++;
        int var2 = 62 % ((arg0 - 19) / 59);
        return this.field4627;
    }

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "(B)I")
    public final int method1508(byte arg0) {
        field4624++;
        int var2 = 50 % ((arg0 - 62) / 44);
        return this.field4622;
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(B)J")
    public final long method1507(byte arg0) {
        int var2 = -13 % ((arg0 - 42) / 56);
        field4626++;
        return this.field4619;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)I")
    public final int method1509(int arg0) {
        if (arg0 != -8567) {
            field4628 = null;
        }
        field4617++;
        return this.field4621;
    }
}
