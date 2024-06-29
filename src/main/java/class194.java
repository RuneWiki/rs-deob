import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public abstract class class194 {

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "Luv;")
    public static class3 field2514 = new class3(70, -1);

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "[I")
    public static int[] field2520 = new int[16];

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "Lvt;")
    public static class344 field2521 = new class344("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
    public static int field2523 = -1;

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "Z")
    public static boolean field2524 = true;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
    public int field2510;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    public int field2513;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
    public int field2516;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)Z")
    public final boolean method1240(int arg0) {
        if (arg0 <= 72) {
            field2511 = -30;
        }
        field2517++;
        return (this.field2513 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1241(String arg0, int arg1) {
        field2518++;
        return arg1 >= -109 ? 93 : arg0.length() + 1;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
    public static void method1242(byte arg0) {
        field2520 = null;
        field2521 = null;
        if (arg0 != 67) {
            field2520 = null;
        }
        field2514 = null;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)Z")
    public final boolean method1243(int arg0) {
        field2519++;
        if (arg0 != 12709) {
            this.method1240(-77);
        }
        return (this.field2513 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)Z")
    public final boolean method1244(int arg0) {
        int var2 = 2 / ((-arg0 - 61) / 58);
        field2515++;
        return (this.field2513 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "(I)Z")
    public final boolean method1245(int arg0) {
        field2512++;
        if (arg0 > -86) {
            return true;
        } else {
            return (this.field2513 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)I")
    public static final int method1246(int arg0, int arg1, int arg2) {
        int var3 = -39 / ((44 - arg0) / 49);
        field2509++;
        int var4 = 0;
        while (arg1 > 0) {
            var4 = arg2 & 0x1 | var4 << 1;
            arg1--;
            arg2 >>>= 0x1;
        }
        return var4;
    }
}
