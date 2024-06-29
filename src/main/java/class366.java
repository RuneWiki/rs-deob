import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class366 extends class425 implements class53 {

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "[Lho;")
    public static class135[] field5422 = new class135[0];

    @OriginalMember(owner = "client!mt", name = "y", descriptor = "[I")
    public static int[] field5435 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "Laj;")
    public static class287 field5424 = new class287(8);

    @OriginalMember(owner = "client!mt", name = "A", descriptor = "[S")
    private static short[] field5437 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!mt", name = "B", descriptor = "[S")
    private static short[] field5438 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "[S")
    private static short[] field5436 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!mt", name = "C", descriptor = "[[S")
    public static short[][] field5439 = new short[][] { field5436, field5437, field5438 };

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "C")
    public char field5420;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
    public int field5421;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!mt", name = "p", descriptor = "I")
    public int field5426;

    @OriginalMember(owner = "client!mt", name = "q", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!mt", name = "r", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!mt", name = "s", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!mt", name = "t", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!mt", name = "w", descriptor = "I")
    public int field5433;

    @OriginalMember(owner = "client!mt", name = "x", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!mt", name = "u", descriptor = "J")
    public long field5431;

    @OriginalMember(owner = "client!mt", name = "v", descriptor = "Ldh;")
    public static class295 field5432;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(B)C")
    public final char method634(byte arg0) {
        int var2 = -29 % ((-arg0 - 20) / 58);
        field5430++;
        return this.field5420;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)J")
    public final long method633(int arg0) {
        field5425++;
        if (arg0 > -24) {
            method2318((byte) -12, null);
        }
        return this.field5431;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)I")
    public final int method632(byte arg0) {
        if (arg0 == 97) {
            field5428++;
            return this.field5421;
        } else {
            return -88;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(JI)V")
    public static final void method2316(long arg0, int arg1) {
        field5423++;
        class275 var3 = class86.method858(0);
        var3.field4103.method693((byte) 106, class168.field2813.field1542);
        var3.field4103.method738(122, arg0);
        var3.field4103.method693((byte) 106, class140.field2466);
        if (arg1 > -14) {
            method2317((byte) 61);
        }
        class140.method1141(var3, 19321);
        class119.field2120 = 0;
        class223.field3351 = 0;
        class605.field8811 = 1;
        class160.field2715 = -3;
    }

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "(B)I")
    public final int method636(byte arg0) {
        field5434++;
        if (arg0 >= -2) {
            field5422 = null;
        }
        return this.field5426;
    }

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "(B)V")
    public static void method2317(byte arg0) {
        field5436 = null;
        field5439 = null;
        field5437 = null;
        field5432 = null;
        if (arg0 < -43) {
            field5422 = null;
            field5438 = null;
            field5424 = null;
            field5435 = null;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method2318(byte arg0, String arg1) {
        field5429++;
        if (arg0 > -102) {
            method2316(61L, -75);
        }
        if (class139.field2460.startsWith("win")) {
            return arg1 + ".dll";
        } else if (class139.field2460.startsWith("linux")) {
            return "lib" + arg1 + ".so";
        } else if (class139.field2460.startsWith("mac")) {
            return "lib" + arg1 + ".dylib";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "(B)I")
    public final int method635(byte arg0) {
        if (arg0 >= -35) {
            return 93;
        } else {
            field5427++;
            return this.field5433;
        }
    }
}
