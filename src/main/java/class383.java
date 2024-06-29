import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class383 extends class467 implements class278 {

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "Lpi;")
    public class467 field5435;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field5433 = 0;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "Lfn;")
    public static class52 field5437;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "Ljava/lang/String;")
    public static String field5440;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field5436;

    static {
        new class112("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field5437 = new class52(14, -2);
        field5438 = -1;
        field5440 = "";
        field5439 = -1;
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)Z", line = 3)
    public final boolean method195(int arg0) {
        field5422++;
        return arg0 <= 91;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V", line = 14)
    public final void method217(boolean arg0) {
        if (!arg0) {
            field5427++;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILkm;IZILkj;B)V", line = 24)
    public final void method198(int arg0, class487 arg1, int arg2, boolean arg3, int arg4, class280 arg5, byte arg6) {
        if (arg6 == 59) {
            field5432++;
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(Lkm;I)Lto;", line = 34)
    public final class370 method193(class487 arg0, int arg1) {
        if (arg1 > -6) {
            field5438 = -98;
        }
        field5426++;
        return null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lkm;BII)Z", line = 47)
    public final boolean method199(class487 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 <= 123) {
            return false;
        } else {
            field5423++;
            return false;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lkm;I)V", line = 58)
    public final void method216(class487 arg0, int arg1) {
        int var3 = 124 % ((-arg1 - 12) / 60);
        field5421++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)I", line = 70)
    public final int method215(int arg0) {
        field5430++;
        return arg0 == -11524 ? 0 : 99;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(Lkm;I)V", line = 82)
    public final void method218(class487 arg0, int arg1) {
        field5424++;
        if (arg1 >= -73) {
            field5439 = 61;
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(Lkm;I)V", line = 92)
    public final void method197(class487 arg0, int arg1) {
        field5434++;
        int var3 = -76 / ((64 - arg1) / 59);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lkm;II)Lab;", line = 102)
    public final class232 method208(class487 arg0, int arg1, int arg2) {
        field5431++;
        int var4 = 16 / ((-arg1 - 12) / 47);
        return null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)Z", line = 112)
    public final boolean method214(int arg0) {
        if (arg0 < 24) {
            this.method208((class487) null, 51, -79);
        }
        field5436++;
        return false;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z)I", line = 125)
    public final int method211(boolean arg0) {
        field5429++;
        if (!arg0) {
            this.method199((class487) null, (byte) 81, -8, -10);
        }
        return 0;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 136)
    public final void method202(byte arg0) {
        if (arg0 <= 42) {
            this.method211(false);
        }
        field5425++;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIILpi;)V", line = 149)
    public class383(int arg0, int arg1, int arg2, int arg3, int arg4, class467 arg5) {
        super(arg2, arg3, arg4, class121.method753(true, arg1, arg0));
        this.field5435 = arg5;
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)V", line = 158)
    public static void method2293(int arg0) {
        if (arg0 == -4814) {
            field5440 = null;
            field5437 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)I", line = 170)
    public final int method219(int arg0) {
        field5428++;
        return arg0 == -17942 ? 0 : -110;
    }
}
