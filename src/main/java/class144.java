import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class144 extends class279 {

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Lng;")
    public static class76 field2537 = new class76();

    @OriginalMember(owner = "client!w", name = "q", descriptor = "Loa;")
    public static class99 field2539 = class221.method1463(2844, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Loa;")
    public static class99 field2542 = class221.method1463(2844, "gr-Un:");

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Z")
    public static boolean field2543 = false;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public int field2531;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "Ldd;")
    public static class133 field2538;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Loa;")
    public class99 field2532;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Loa;")
    public class99 field2541;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)Lta;")
    public final class256 method980(byte arg0) {
        ++field2535;
        if (arg0 != -9) {
            method983((byte) 119);
        }
        return class97.field1630[super.field4896];
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
    public static final void method981(int arg0, int arg1, int arg2) {
        int var3 = 111 % ((arg2 - -60) / 61);
        ++field2536;
        class65 var4 = class152.method1010(arg1, 12, (byte) -73);
        var4.method433(32);
        var4.field1094 = arg0;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)[Lpi;")
    public static final class139[] method982(boolean arg0) {
        ++field2533;
        class139[] var1 = new class139[class201.field3495];
        for (int var2 = 0; class201.field3495 > var2; ++var2) {
            byte[] var3 = class181.field3151[var2];
            int var4 = class223.field3885[var2] * class193.field3395[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; ~var4 < ~var6; ++var6) {
                var5[var6] = class173.field3062[class71.method502(var3[var6], 255)];
            }
            var1[var2] = new class4(class164.field2883, class88.field1520, class290.field5082[var2], class11.field94[var2], class223.field3885[var2], class193.field3395[var2], var5);
        }
        class24.method181(!arg0);
        if (!arg0) {
            field2543 = true;
        }
        return var1;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V")
    public static void method983(byte arg0) {
        field2542 = null;
        field2537 = null;
        if (arg0 > -37) {
            field2542 = null;
        }
        field2539 = null;
        field2538 = null;
    }
}
