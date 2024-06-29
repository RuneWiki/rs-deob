import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class23 extends class96 {

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "Lwb;")
    public static class130 field663 = class26.method212(" ", -32376);

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "Lwb;")
    public static class130 field652 = class26.method212("Ung-Ultige Session)2ID)3", -32376);

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "Ls;")
    public static class108 field653 = new class108();

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "Lwb;")
    private static class130 field670 = class26.method212("Walk here", -32376);

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "Z")
    public static boolean field671 = false;

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "Z")
    public static boolean field673 = false;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "Lwb;")
    public static class130 field669 = class26.method212("Sie haben gerade eine andere Welt verlassen)3", -32376);

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "Lwb;")
    public static class130 field675 = class26.method212("(U(Y", -32376);

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "[[[Ls;")
    public static class108[][][] field674 = new class108[4][104][104];

    @OriginalMember(owner = "client!dd", name = "eb", descriptor = "Lwb;")
    private static class130 field678 = class26.method212("Use", -32376);

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "Lwb;")
    public static class130 field672 = field670;

    @OriginalMember(owner = "client!dd", name = "fb", descriptor = "Lwb;")
    public static class130 field679 = field678;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public int field659;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "I")
    public int field665;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    public int field668;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "Lsa;")
    public class109 field657;

    @OriginalMember(owner = "client!dd", name = "cb", descriptor = "Lk;")
    public static class60 field676;

    @OriginalMember(owner = "client!dd", name = "db", descriptor = "Lk;")
    public static class60 field677;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "Lpa;")
    public class91 field650;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "Lpa;")
    public class91 field667;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "[I")
    public int[] field654;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V", line = 4)
    public static void method200(int arg0) {
        field675 = null;
        field677 = null;
        field674 = null;
        field663 = null;
        field679 = null;
        field676 = null;
        field653 = null;
        field678 = null;
        field672 = null;
        field652 = null;
        field669 = null;
        if (arg0 == -24051) {
            field670 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III[B)I", line = 25)
    public static final int method201(int arg0, int arg1, int arg2, byte[] arg3) {
        int var4 = -1;
        int var5 = arg2;
        if (arg0 != 255) {
            return 42;
        }
        while (arg1 > var5) {
            var4 = class75.field1861[(var4 ^ arg3[var5]) & 0xFF] ^ var4 >>> 8;
            var5++;
        }
        field655++;
        return ~var4;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V", line = 49)
    public final void method202(int arg0) {
        int var2 = this.field659;
        if (arg0 > -82) {
            method200(39);
        }
        class109 var3 = this.field657.method826(102);
        if (var3 == null) {
            this.field659 = -1;
            this.field654 = null;
            this.field666 = 0;
            this.field658 = 0;
            this.field668 = 0;
        } else {
            this.field658 = var3.field2691;
            this.field659 = var3.field2680;
            this.field654 = var3.field2638;
            this.field666 = var3.field2648 * 128;
            this.field668 = var3.field2673;
        }
        if (this.field659 != var2 && this.field650 != null) {
            class9.field297.method873(this.field650);
            this.field650 = null;
        }
        field664++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZIII)I", line = 103)
    public static final int method203(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            field675 = null;
        }
        int var4 = 256 - arg1;
        field648++;
        return ((arg2 & 0xFF00) * var4 + (arg3 & 0xFF00) * arg1 & 0xFF0000) + ((arg2 & 0xFF00FF) * var4 + (arg3 & 0xFF00FF) * arg1 & 0xFF00FF00) >> 8;
    }
}
