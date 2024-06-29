import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class146 {

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "I")
    public static int field1745 = 0;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "Lws;")
    public static class333 field1744 = new class333();

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "Ljd;")
    public static class216 field1748 = new class216(3, 2);

    @OriginalMember(owner = "client!wea", name = "g", descriptor = "[J")
    public static long[] field1750 = new long[100];

    @OriginalMember(owner = "client!wea", name = "f", descriptor = "I")
    public static int field1749 = 0;

    @OriginalMember(owner = "client!wea", name = "i", descriptor = "Lcga;")
    public static class449 field1752 = new class449(38, 3);

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!wea", name = "h", descriptor = "Lpfa;")
    public static class275 field1751;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)V")
    public static void method910(int arg0) {
        field1748 = null;
        field1751 = null;
        field1744 = null;
        field1752 = null;
        field1750 = null;
        if (arg0 != 0) {
            field1749 = 41;
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lns;I)I")
    public static final int method911(class375 arg0, int arg1) {
        field1746++;
        if (class291.field3672 == arg0) {
            return 7681;
        } else if (class607.field8276 == arg0) {
            return 8448;
        } else if (class597.field8016 == arg0) {
            return 34165;
        } else if (class375.field4829 == arg0) {
            return 260;
        } else if (class113.field1421 == arg0) {
            return 34023;
        } else if (arg1 > -58) {
            return 94;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)V")
    public static final void method912(int arg0) {
        if (class470.field5804 == 9) {
            class78.method609(10503, 5);
        } else if (class470.field5804 == 5 || class470.field5804 == 6) {
            class78.method609(10503, 3);
        } else if (class470.field5804 == 12) {
            class78.method609(10503, 3);
        }
        field1747++;
        if (arg0 != 3) {
            method911(null, 120);
        }
    }
}
