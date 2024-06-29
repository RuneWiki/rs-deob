import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class287 {

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "Lth;")
    private class286 field3566;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field3567;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field3573;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "Luaa;")
    private class436 field3576;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "Lnf;")
    private class37 field3569;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field3575 = 0;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "[C")
    public static char[] field3580 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "Llb;")
    public static class255 field3581;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "Les;")
    private class630 field3572;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "[I")
    public static int[] field3570;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "[Lpda;")
    private class304[] field3568;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "[Z")
    public static boolean[] field3574;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)Z")
    public final boolean method1613(int arg0) {
        field3571++;
        if (this.field3572 != null) {
            return true;
        }
        if (this.field3569 == null) {
            if (this.field3576.method2299(26555)) {
                return false;
            }
            this.field3569 = this.field3576.method2288(255, 255, arg0 + 17431, true, (byte) 0);
        }
        if (this.field3569.field7755) {
            return false;
        }
        class630 var2 = new class630(this.field3569.method232((byte) 112));
        var2.field8812 = 5;
        int var3 = var2.method3501(-9268);
        var2.field8812 += var3 * 72;
        byte[] var4 = new byte[var2.field8804.length - var2.field8812];
        var2.method3522(var4, true, var4.length, 0);
        byte[] var7;
        if (this.field3567 == null || this.field3573 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field3567, this.field3573);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class357.method1969(var2.field8812 - var4.length - 5, var2.field8804, arg0 + 17554, 5);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        if (arg0 == -17427) {
            this.field3572 = var2;
            this.field3568 = new class304[var3];
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
    public final void method1614(int arg0) {
        field3577++;
        if (this.field3568 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3568.length; var2++) {
            if (this.field3568[var2] != null) {
                this.field3568[var2].method1736(-117);
            }
        }
        if (arg0 != -18366) {
            field3580 = null;
        }
        for (int var3 = 0; var3 < this.field3568.length; var3++) {
            if (this.field3568[var3] != null) {
                this.field3568[var3].method1739(60);
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZZLlf;ILlf;)Lpda;")
    private final class304 method1615(boolean arg0, boolean arg1, class676 arg2, int arg3, class676 arg4) {
        field3579++;
        if (this.field3572 == null) {
            throw new RuntimeException();
        } else if (arg3 < 0 || arg3 >= this.field3568.length) {
            throw new RuntimeException();
        } else if (this.field3568[arg3] == null) {
            this.field3572.field8812 = arg3 * 72 + 6;
            int var6 = this.field3572.method3483(84);
            int var7 = this.field3572.method3483(89);
            byte[] var8 = new byte[64];
            this.field3572.method3522(var8, arg0, 64, 0);
            class304 var9 = new class304(arg3, arg4, arg2, this.field3576, this.field3566, var6, var8, var7, arg1);
            this.field3568[arg3] = var9;
            return var9;
        } else {
            return this.field3568[arg3];
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILlf;Llf;B)Lpda;")
    public final class304 method1616(int arg0, class676 arg1, class676 arg2, byte arg3) {
        int var5 = 27 / ((arg3 + 59) / 46);
        field3578++;
        return this.method1615(true, true, arg1, arg0, arg2);
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)V")
    public static void method1617(int arg0) {
        field3570 = null;
        if (arg0 != 242) {
            method1617(59);
        }
        field3574 = null;
        field3580 = null;
        field3581 = null;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Luaa;Lth;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class287(class436 arg0, class286 arg1, BigInteger arg2, BigInteger arg3) {
        this.field3566 = arg1;
        this.field3567 = arg2;
        this.field3573 = arg3;
        this.field3576 = arg0;
        if (!this.field3576.method2299(26555)) {
            this.field3569 = this.field3576.method2288(255, 255, 4, true, (byte) 0);
        }
    }
}
