import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class244 extends class443 {

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "Ljava/lang/String;")
    private String field3435 = "null";

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field3419 = -1;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "Luc;")
    public static class51 field3423 = new class51(50);

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "I")
    public static int field3436 = 0;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "Ljava/lang/String;")
    public static String field3437 = "Walk here";

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "C")
    public char field3422;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "C")
    public char field3426;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    private int field3429;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "Lbo;")
    public class453 field3425;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "Lbo;")
    private class453 field3430;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lfb;I)V")
    public final void method1585(class341 arg0, int arg1) {
        field3432++;
        while (true) {
            int var3 = arg0.method2233((byte) 104);
            if (var3 == 0) {
                if (arg1 > -116) {
                    this.method1590(-64, (String) null);
                    return;
                } else {
                    return;
                }
            }
            this.method1587(-100, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)V")
    private final void method1586(byte arg0) {
        field3427++;
        this.field3430 = new class453(this.field3425.method2822((byte) -73));
        for (class17 var2 = (class17) this.field3425.method2812(15710); var2 != null; var2 = (class17) this.field3425.method2819((byte) 90)) {
            class17 var3 = new class17((int) var2.field6091);
            this.field3430.method2815(-1, (long) var2.field274, var3);
        }
        if (arg0 < 78) {
            field3437 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILfb;)V")
    private final void method1587(int arg0, int arg1, class341 arg2) {
        field3434++;
        if (arg1 == 1) {
            this.field3426 = class95.method758(arg2.method2211(255), false);
        } else if (arg1 == 2) {
            this.field3422 = class95.method758(arg2.method2211(255), false);
        } else if (arg1 == 3) {
            this.field3435 = arg2.method2261((byte) 67);
        } else if (arg1 == 4) {
            this.field3429 = arg2.method2232(-43);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method2239(-1076227960);
            this.field3425 = new class453(class41.method299(2, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method2232(-32);
                class418 var7;
                if (arg1 == 5) {
                    var7 = new class143(arg2.method2261((byte) 123));
                } else {
                    var7 = new class17(arg2.method2232(124));
                }
                this.field3425.method2815(-1, (long) var6, var7);
            }
        }
        int var8 = -11 % ((-arg0 - 42) / 48);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public final String method1588(byte arg0, int arg1) {
        field3421++;
        if (this.field3425 == null) {
            return this.field3435;
        }
        if (arg0 != 85) {
            this.field3422 = (char) 65494;
        }
        class143 var3 = (class143) this.field3425.method2826(false, (long) arg1);
        return var3 == null ? this.field3435 : var3.field1813;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
    public static void method1589(int arg0) {
        field3437 = null;
        if (arg0 != 0) {
            field3419 = 51;
        }
        field3423 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1590(int arg0, String arg1) {
        field3428++;
        if (arg0 != 0) {
            this.method1591(-96);
        }
        if (this.field3425 == null) {
            return false;
        }
        if (this.field3430 == null) {
            this.method1591(11843);
        }
        for (class132 var3 = (class132) this.field3430.method2826(false, class415.method2625(arg1, (byte) 88)); var3 != null; var3 = (class132) this.field3430.method2817(arg0 - 1)) {
            if (var3.field1734.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
    private final void method1591(int arg0) {
        field3424++;
        this.field3430 = new class453(this.field3425.method2822((byte) -73));
        class143 var2 = (class143) this.field3425.method2812(15710);
        if (arg0 != 11843) {
            this.field3435 = null;
        }
        while (var2 != null) {
            class132 var3 = new class132(var2.field1813, (int) var2.field6091);
            this.field3430.method2815(-1, class415.method2625(var2.field1813, (byte) 48), var3);
            var2 = (class143) this.field3425.method2819((byte) 109);
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)I")
    public final int method1592(int arg0, int arg1) {
        field3433++;
        if (arg1 != 0) {
            this.method1587(-123, 98, (class341) null);
        }
        if (this.field3425 == null) {
            return this.field3429;
        } else {
            class17 var3 = (class17) this.field3425.method2826(false, (long) arg0);
            return var3 == null ? this.field3429 : var3.field274;
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(II)Z")
    public final boolean method1593(int arg0, int arg1) {
        field3420++;
        if (this.field3425 == null) {
            return false;
        }
        if (this.field3430 == null) {
            this.method1586((byte) 125);
        }
        class17 var3 = (class17) this.field3430.method2826(false, (long) arg1);
        int var4 = -33 % ((arg0 - 62) / 55);
        return var3 != null;
    }
}
