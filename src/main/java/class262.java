import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public abstract class class262 extends class117 {

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lap;")
    public static class335 field3309 = new class335(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "Lap;")
    public static class335 field3315 = new class335("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public int field3308;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public int field3311;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public int field3316;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "Z")
    public boolean field3310;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)V")
    public static void method1567(byte arg0) {
        field3315 = null;
        field3309 = null;
        if (arg0 >= -121) {
            field3309 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V")
    public final void method180(byte arg0) {
        field3314++;
        if (arg0 != -2) {
            field3309 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lhd;I)Lhd;")
    public static final class523 method1568(class523 arg0, int arg1) {
        field3318++;
        if (arg0.field7673 != -1) {
            return class310.method1810(arg0.field7673, 1182823664);
        }
        if (arg1 >= -79) {
            field3309 = null;
        }
        int var2 = arg0.field7723 >>> 16;
        class57 var3 = new class57(class397.field5684);
        for (class175 var4 = (class175) var3.method538(0); var4 != null; var4 = (class175) var3.method539(-101)) {
            if (var4.field2279 == var2) {
                return class310.method1810((int) var4.field5043, 1182823664);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)Z")
    public final boolean method194(byte arg0) {
        if (arg0 > -72) {
            return true;
        } else {
            field3313++;
            return false;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)V")
    public static final void method1569(byte arg0, int arg1) {
        field3317++;
        if (!class450.method2649(arg1, 21182)) {
            return;
        }
        if (arg0 != 35) {
            field3309 = null;
        }
        class523[] var2 = class293.field3725[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class523 var4 = var2[var3];
            if (var4 != null) {
                var4.field7698 = 0;
                var4.field7627 = 0;
                var4.field7691 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lgg;IZIIILya;)V")
    public final void method193(class117 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class38 arg6) {
        int var8 = -19 % ((27 - arg5) / 40);
        field3312++;
        throw new IllegalStateException();
    }
}
