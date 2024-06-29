import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class48 {

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Lgf;")
    public static class210 field830 = new class210();

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field832 = 0;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method355(int arg0) {
        if (arg0 != 0) {
            field832 = -58;
        }
        field830 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IJ)V")
    public static final void method356(int arg0, long arg1) {
        field829++;
        if ((long) arg0 != arg1) {
            class58.field967.method285((byte) -90, 202);
            class58.field967.method578((byte) -127, arg1);
            class225.field3922++;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lmf;B)I")
    public static final int method357(class26 arg0, byte arg1) {
        class78 var2 = arg0.field511;
        field826++;
        if (var2.field1448 != null) {
            var2 = var2.method620(arg1 - 17755);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg1 != 42) {
            field830 = null;
        }
        int var3 = var2.field1458;
        if (arg0.field2553 == arg0.field2537) {
            var3 = var2.field1456;
        } else if (arg0.field2540 == arg0.field2537) {
            var3 = var2.field1495;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Lsc;")
    public static final class146 method358(int arg0) {
        field825++;
        if (arg0 != -1191) {
            return null;
        }
        class146 var1 = (class146) class32.field600.method1658((byte) -106);
        if (var1 != null) {
            var1.method501(0);
            var1.method1219(arg0 ^ 0xFFFFFB19);
            return var1;
        }
        class146 var2;
        do {
            var2 = (class146) class14.field220.method1658((byte) 78);
            if (var2 == null) {
                return null;
            }
            if (var2.method1085(119) > class223.method1537(-26619)) {
                return null;
            }
            var2.method501(arg0 + 1191);
            var2.method1219(64);
        } while ((var2.field3053 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
    public static final void method359(int arg0) {
        field827++;
        if (!class180.method1291(2047) && class243.field4321 != class135.field2450) {
            class81.method639(class277.field4824.field2517[0], class97.field1801, 0, false, class38.field669, class277.field4824.field2523[0], class135.field2450);
            return;
        }
        if (class225.field3938 != class135.field2450) {
            class225.field3938 = class135.field2450;
            class93.method731(class135.field2450, -91);
            class272.method1838(-119);
        }
        if (arg0 != 0) {
            field832 = -47;
        }
    }
}
