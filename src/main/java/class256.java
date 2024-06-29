import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class256 extends class374 {

    @OriginalMember(owner = "client!j", name = "j", descriptor = "Ldp;")
    public static class347 field3474 = new class347("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!j", name = "l", descriptor = "[J")
    public static long[] field3476 = new long[256];

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "Lok;")
    public static class74 field3478;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
    public static void method1523(int arg0) {
        field3476 = null;
        field3474 = null;
        if (arg0 <= 104) {
            field3476 = null;
        }
        field3478 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZZ)V")
    public final void method25(boolean arg0, boolean arg1) {
        super.field5646.method1548(arg1, (byte) 82);
        ++field3469;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZLew;I)V")
    public final void method18(boolean arg0, class271 arg1, int arg2) {
        ++field3473;
        super.field5646.method1546(-2, arg1);
        super.field5646.method1582(arg2, arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
    public final void method20(int arg0, int arg1, int arg2) {
        if (arg1 != -20857) {
            field3474 = null;
        }
        ++field3475;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)Z")
    public final boolean method21(byte arg0) {
        if (arg0 <= 85) {
            field3478 = null;
        }
        ++field3470;
        return true;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)V")
    public final void method19(boolean arg0, int arg1) {
        if (arg1 > -2) {
            this.method19(true, 66);
        }
        ++field3468;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        super.field5646.method1548(false, (byte) 57);
        if (arg0 >= 74) {
            ++field3471;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lvd;)V")
    public class256(class258 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(III)Lep;")
    public static final class311 method1524(int arg0, int arg1, int arg2) {
        ++field3472;
        class311 var3 = new class311();
        var3.field4833 = arg1 + 1 + 5;
        var3.field4827 = arg2 + 1 + 5;
        if (arg0 != -28193) {
            method1523(-56);
        }
        var3.field4813 = -1;
        var3.field4820 = -1;
        var3.field4819 = new int[var3.field4827][var3.field4833];
        var3.method1959(13734);
        return var3;
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if (~(var1 & 1L) == -2L) {
                    var1 = -3932672073523589310L ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field3476[var0] = var1;
        }
        field3477 = -1;
        field3479 = -1;
    }
}
