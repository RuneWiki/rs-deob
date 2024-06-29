import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class363 extends class263 {

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "Z")
    public static boolean field4646 = false;

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "Lhm;")
    public static class208 field4650 = new class208(64);

    @OriginalMember(owner = "client!fu", name = "q", descriptor = "Lcga;")
    public static class449 field4656 = new class449(17, -1);

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!fu", name = "l", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!fu", name = "n", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!fu", name = "o", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!fu", name = "p", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "J")
    public long field4648;

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "Lfu;")
    public class363 field4647;

    @OriginalMember(owner = "client!fu", name = "m", descriptor = "Lfu;")
    public class363 field4652;

    @OriginalMember(owner = "client!fu", name = "r", descriptor = "[I")
    public static int[] field4657;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)Z", line = 8)
    public static final boolean method2106(int arg0, int arg1) {
        if (arg1 == 64) {
            field4653++;
            return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)I", line = 22)
    public static final int method2107(boolean arg0) {
        field4649++;
        if (arg0) {
            method2111(127);
        }
        return class193.field2286;
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(B)Z", line = 33)
    public final boolean method2108(byte arg0) {
        field4651++;
        if (arg0 != -58) {
            field4657 = null;
        }
        return this.field4647 != null;
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(II)V", line = 48)
    public static final void method2109(int arg0, int arg1) {
        if (arg1 != -11465) {
            method2111(27);
        }
        for (class263 var2 = class96.field1248.method3830((byte) -9); var2 != null; var2 = class96.field1248.method3838((byte) -92)) {
            if ((long) arg0 == (var2.field3321 >> 48 & 0xFFFFL)) {
                var2.method1566(-122);
            }
        }
        field4655++;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V", line = 70)
    public final void method2110(int arg0) {
        field4654++;
        if (this.field4647 == null) {
            return;
        }
        this.field4647.field4652 = this.field4652;
        if (arg0 < 85) {
            field4650 = null;
        }
        this.field4652.field4647 = this.field4647;
        this.field4647 = null;
        this.field4652 = null;
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)V", line = 90)
    public static void method2111(int arg0) {
        if (arg0 == 0) {
            field4657 = null;
            field4650 = null;
            field4656 = null;
        }
    }
}
