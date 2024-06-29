import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class28 extends class246 {

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    private final int field434;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    private final int field430;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    private final int field439;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    private final int field437;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Lhh;")
    public static class163 field429 = class137.method1065(" )2> <col=ffffff>", 17);

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "Lhh;")
    public static class163 field433 = class137.method1065("<col=ffffff>", 17);

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Lv;")
    public static class22 field426;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "Lv;")
    public static class22 field438;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
    public final void method42(int arg0, int arg1, int arg2) {
        ++field436;
        int var4 = this.field430 * arg1 >> 12;
        int var5 = this.field434 * arg1 >> 12;
        if (arg0 > -17) {
            this.method46(82, -113, -110);
        }
        int var6 = this.field437 * arg2 >> 12;
        int var7 = this.field439 * arg2 >> 12;
        class114.method907(super.field4333, 123, super.field4335, var6, var5, var7, var4, super.field4342);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lpa;IIZ)Lhk;")
    public static final class105 method171(class123 arg0, int arg1, int arg2, boolean arg3) {
        ++field442;
        if (!arg3) {
            field426 = null;
        }
        return !class85.method677(arg2, arg0, 20888, arg1) ? null : class63.method443(12);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)I")
    public static final int method172(byte arg0) {
        ++field435;
        if (arg0 <= 8) {
            field429 = null;
        }
        return 6;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)V")
    public final void method46(int arg0, int arg1, int arg2) {
        ++field440;
        int var4 = this.field430 * arg0 >> 12;
        if (arg1 == 2) {
            int var5 = this.field434 * arg0 >> 12;
            int var6 = this.field439 * arg2 >> 12;
            int var7 = this.field437 * arg2 >> 12;
            class69.method475((byte) 84, var4, var6, super.field4333, var7, var5);
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(II)Lgf;")
    public static final class171 method173(int arg0, int arg1) {
        ++field432;
        class171 var2 = (class171) class192.field3512.method114((long) arg1, 0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class122.field2305.method973(arg0, true, arg1);
            class171 var4 = new class171();
            if (var3 != null) {
                var4.method1272((byte) 50, new class81(var3));
            }
            class192.field3512.method117(var4, false, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIZIIII)V")
    public static final void method174(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class235.field4201 = arg6;
        ++field428;
        class50.field853 = arg0;
        class262.field4566 = arg1;
        class49.field819 = arg3;
        class181.field3321 = arg4;
        if (arg2 && class181.field3321 >= 100) {
            class123.field2367 = class49.field819 * 128 - -64;
            class88.field1636 = class235.field4201 * 128 + 64;
            class191.field3490 = class127.method1011(class88.field1636, class123.field2367, class20.field323, arg5 + 29906) + -class50.field853;
        }
        class5.field99 = arg5;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
    public static void method175(byte arg0) {
        field433 = null;
        field426 = null;
        field438 = null;
        field429 = null;
        if (arg0 != 53) {
            field427 = 118;
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)[Lhk;")
    public static final class105[] method176(byte arg0) {
        class105[] var1 = new class105[class84.field1594];
        for (int var2 = 0; var2 < class84.field1594; ++var2) {
            int var3 = class257.field4505[var2] * class256.field4478[var2];
            byte[] var4 = class223.field4070[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; ~var3 < ~var6; ++var6) {
                var5[var6] = class111.field2097[class7.method50(255, var4[var6])];
            }
            var1[var2] = new class105(class107.field2043, class2.field36, class65.field1107[var2], class180.field3267[var2], class256.field4478[var2], class257.field4505[var2], var5);
        }
        if (arg0 <= 33) {
            method177(45, -37, 119, 79, (class165) null, -64, -125L, -73, 57, -91, -57);
        }
        ++field431;
        class67.method463(-80);
        return var1;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BII)V")
    public final void method44(byte arg0, int arg1, int arg2) {
        ++field441;
        int var4 = this.field430 * arg1 >> 12;
        if (arg0 != 6) {
            field427 = -116;
        }
        int var5 = this.field434 * arg1 >> 12;
        int var6 = this.field439 * arg2 >> 12;
        int var7 = this.field437 * arg2 >> 12;
        class236.method1639(var6, var4, var7, var5, super.field4342, 10873, super.field4335);
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IIIIIII)V")
    public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field434 = arg2;
        this.field430 = arg0;
        this.field439 = arg1;
        this.field437 = arg3;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIILta;IJIIII)Z")
    public static final boolean method177(int arg0, int arg1, int arg2, int arg3, class165 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class152.method1128(arg0, arg7, arg8, arg9 - arg7 + 1, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }
}
