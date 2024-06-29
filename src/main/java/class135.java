import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class135 extends class5 {

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "Z")
    public static boolean field2524 = false;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "Lhj;")
    public static class69 field2525 = class181.method1318("details", (byte) -127);

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "I")
    public int field2534;

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "I")
    public int field2535;

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
    public int field2539;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "Ltc;")
    public static class173 field2532;

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "Ltk;")
    public static class50 field2536;

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "Lhj;")
    public class69 field2533;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)V")
    public static final void method1006(int arg0) {
        class140.method1078((byte) 122);
        ++field2531;
        class133.method987(true);
        class115.method853(-5823);
        class36.method195(5);
        if (arg0 != -4635) {
            field2532 = null;
        }
        class258.method1778(-46);
        class69.method451(arg0 + 15463);
        class105.method796(15844);
        class127.method904(-1);
        class247.method1743(false);
        class147.method1113(256);
        class181.method1321(-100);
        class126.method901(arg0 + 4713);
        class109.method821(arg0 ^ -4736);
        class55.method326(1);
        class227.field4133.method1709((byte) -100);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLhj;)V")
    public static final void method1007(boolean arg0, class69 arg1) {
        ++field2529;
        if (class273.field4833 != null) {
            int var2 = 0;
            long var3 = arg1.method473((byte) 52);
            if (var3 != 0L) {
                while (class273.field4833.length > var2 && ~class273.field4833[var2].field1685 != ~var3) {
                    ++var2;
                }
                if (class273.field4833.length > var2 && class273.field4833[var2] != null) {
                    class48.field692.method301(216, -104);
                    ++class134.field2504;
                    class48.field692.method918(class273.field4833[var2].field1685, 18820);
                    if (arg0) {
                        field2524 = true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)I")
    public final int method1008(byte arg0) {
        ++field2530;
        int var2 = -48 % ((arg0 - 44) / 42);
        return (int) super.field1685;
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)J")
    public final long method1009(int arg0) {
        if (arg0 < 78) {
            method1006(68);
        }
        ++field2527;
        return Long.MAX_VALUE & super.field44;
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(B)V")
    public static void method1010(byte arg0) {
        if (arg0 <= 72) {
            method1007(true, (class69) null);
        }
        field2532 = null;
        field2525 = null;
        field2536 = null;
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(B)V")
    public final void method1011(byte arg0) {
        super.field44 |= Long.MIN_VALUE;
        ++field2538;
        if (arg0 != 122) {
            field2536 = null;
        }
        if (~this.method1009(97) == -1L) {
            class224.field4075.method1643(this, arg0 ^ 4218);
        }
    }

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "(B)V")
    public final void method1012(byte arg0) {
        ++field2526;
        int var2 = -47 / ((-37 - arg0) / 49);
        super.field44 = super.field44 & Long.MIN_VALUE | 500L + class223.method1584(-25392);
        class39.field550.method1643(this, 4096);
    }

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "(B)I")
    public final int method1013(byte arg0) {
        int var2 = 63 / ((arg0 - 67) / 32);
        ++field2537;
        return (int) (255L & super.field1685 >>> 32);
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(II)V")
    public class135(int arg0, int arg1) {
        super.field1685 = (long) arg1 | (long) arg0 << 32;
    }
}
