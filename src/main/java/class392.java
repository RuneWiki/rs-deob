import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class392 extends class496 implements class454 {

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field5702 = 52;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "Lnj;")
    public static class487 field5711 = new class487("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    public static int field5713 = 0;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "Lqp;")
    public static class586 field5712 = new class586(66, 7);

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "C")
    public char field5699;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public int field5700;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public int field5704;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public int field5707;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "J")
    public long field5706;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "[Lls;")
    public static class418[] field5710;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)I")
    public final int method2360(boolean arg0) {
        if (!arg0) {
            method2366(-102);
        }
        field5695++;
        return this.field5704;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIILdda;)Lts;")
    public static final class53 method2361(int arg0, int arg1, int arg2, class597 arg3) {
        field5701++;
        class428 var4 = new class428(arg3.method3486((byte) -53, arg2, arg0));
        class53 var5 = new class53(arg2, var4.method2585(120), var4.method2585(115), var4.method2589(arg1 - 11052), var4.method2589(-11179), var4.method2561((byte) -89) == 1, var4.method2561((byte) -106), var4.method2561((byte) 125));
        int var6 = var4.method2561((byte) 121);
        int var7 = 0;
        if (arg1 != -127) {
            return null;
        }
        while (var7 < var6) {
            var5.field632.method2492(new class147(var4.method2561((byte) -89), var4.method2620(105), var4.method2620(65), var4.method2620(arg1 ^ 0xFFFFFFF2), var4.method2620(arg1 + 170), var4.method2620(18), var4.method2620(50), var4.method2620(121), var4.method2620(58)), (byte) -93);
            var7++;
        }
        var5.method275((byte) 84);
        return var5;
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)V")
    public static void method2362(int arg0) {
        field5712 = null;
        field5711 = null;
        if (arg0 != -2807) {
            method2361(-96, 109, -46, null);
        }
        field5710 = null;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)C")
    public final char method2363(int arg0) {
        if (arg0 != 28814) {
            method2362(-37);
        }
        field5697++;
        return this.field5699;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(CI)Z")
    public static final boolean method2364(char arg0, int arg1) {
        field5708++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else if (arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ') {
            return true;
        } else {
            if (arg1 != 338) {
                method2364((char) 65499, -53);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)J")
    public final long method2365(byte arg0) {
        field5703++;
        int var2 = 82 % ((-arg0 - 68) / 44);
        return this.field5706;
    }

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "(I)Z")
    public static final boolean method2366(int arg0) {
        field5694++;
        int var1 = 123 / ((arg0 + 71) / 51);
        return class643.field9339 != class582.field8561 || class370.field5351 >= 2;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)I")
    public final int method2367(int arg0) {
        if (arg0 == -28783) {
            field5705++;
            return this.field5700;
        } else {
            return 22;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)I")
    public final int method2368(int arg0) {
        if (arg0 == 32613) {
            field5698++;
            return this.field5707;
        } else {
            return -127;
        }
    }
}
