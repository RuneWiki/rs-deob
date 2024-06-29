import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class234 {

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public int field3506 = -1;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    public int field3508 = -1;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "Lvq;")
    public static class24 field3504 = new class24(80, -1);

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "I")
    public static int field3514 = 0;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "[I")
    public static int[] field3513 = new int[100];

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "[I")
    public int[] field3511;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "[Loc;")
    public static class96[] field3515;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BLat;II)V")
    private final void method1585(byte arg0, class256 arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field3506 = arg1.method1767(1930493576);
        } else if (arg3 == 2) {
            this.field3511 = new int[arg1.method1738((byte) -46)];
            for (int var5 = 0; var5 < this.field3511.length; var5++) {
                this.field3511[var5] = arg1.method1767(1930493576);
            }
        } else if (arg3 == 3) {
            this.field3508 = arg1.method1738((byte) -23);
        }
        field3512++;
        int var6 = -36 % ((-arg0 - 38) / 48);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZI)V")
    public static final void method1586(boolean arg0, int arg1) {
        field3509++;
        class363 var2 = class47.field615;
        synchronized (class47.field615) {
            class47.field615.method2300(arg1, arg0);
        }
        if (!arg0) {
            field3516 = 37;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V")
    public static final void method1587(byte arg0) {
        class363 var1 = class459.field6785;
        synchronized (class459.field6785) {
            class459.field6785.method2313(110);
        }
        field3505++;
        if (arg0 >= -17) {
            field3504 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIII)V")
    public static final void method1588(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -1) {
            return;
        }
        if (arg2 - arg4 >= class9.field128 && class63.field838 >= arg2 + arg4 && arg1 - arg4 >= class248.field3659 && class146.field1978 >= arg1 + arg4) {
            class373.method2372(-99554687, arg4, arg0, arg2, arg1);
        } else {
            class216.method1489((byte) -115, arg2, arg4, arg1, arg0);
        }
        field3507++;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILat;I)V")
    public final void method1589(int arg0, class256 arg1, int arg2) {
        field3503++;
        while (true) {
            int var4 = arg1.method1738((byte) -41);
            if (var4 == 0) {
                if (arg2 == 26970) {
                    return;
                } else {
                    field3504 = null;
                    return;
                }
            }
            this.method1585((byte) -114, arg1, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIILik;Lik;)V")
    public static final void method1590(int arg0, int arg1, int arg2, class422 arg3, class422 arg4) {
        class369 var5 = class186.method1275(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field5335 = arg3;
            var5.field5332 = arg4;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
    public static void method1591(int arg0) {
        field3515 = null;
        field3513 = null;
        field3504 = null;
        if (arg0 != -4) {
            field3513 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)V")
    public static final void method1592(int arg0) {
        class125.field1658.method2307(19);
        field3510++;
        class452.field6665.method2307(30);
        class202.field2859.method2307(arg0 ^ 0x41);
        if (arg0 == 100) {
            class175.field2395.method2307(21);
            class399.field5775.method2307(arg0 - 42);
        }
    }
}
