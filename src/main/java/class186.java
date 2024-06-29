import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class186 {

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "B")
    public byte field2831;

    @OriginalMember(owner = "client!ffa", name = "h", descriptor = "[I")
    public static int[] field2836 = new int[6];

    @OriginalMember(owner = "client!ffa", name = "l", descriptor = "Lqe;")
    public static class469 field2840 = new class469(4, -1);

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!ffa", name = "o", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!ffa", name = "r", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "Lma;")
    public class12 field2834;

    @OriginalMember(owner = "client!ffa", name = "m", descriptor = "Lma;")
    public class12 field2841;

    @OriginalMember(owner = "client!ffa", name = "n", descriptor = "Lffa;")
    public class186 field2842;

    @OriginalMember(owner = "client!ffa", name = "p", descriptor = "Lng;")
    public class343 field2844;

    @OriginalMember(owner = "client!ffa", name = "q", descriptor = "Liq;")
    public class608 field2845;

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "Lica;")
    public class665 field2832;

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "Lica;")
    public class665 field2835;

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "Llr;")
    public class754 field2830;

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "S")
    public short field2833;

    @OriginalMember(owner = "client!ffa", name = "i", descriptor = "S")
    public short field2837;

    @OriginalMember(owner = "client!ffa", name = "j", descriptor = "S")
    public short field2838;

    @OriginalMember(owner = "client!ffa", name = "k", descriptor = "S")
    public short field2839;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V", line = 6)
    public final void method1306(int arg0) {
        while (this.field2830 != null) {
            class754 var2 = this.field2830.field10537;
            this.field2830.method4201(true);
            this.field2830 = var2;
        }
        if (arg0 == -1) {
            field2829++;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(I)V", line = 23)
    public class186(int arg0) {
        this.field2831 = (byte) arg0;
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V", line = 41)
    public static void method1307(int arg0) {
        field2836 = null;
        if (arg0 != -1) {
            field2840 = null;
        }
        field2840 = null;
    }
}
