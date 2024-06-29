import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class120 extends class115 {

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Ldp;")
    public static class347 field1834 = new class347(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public int field1826;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public int field1831;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public int field1835;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    public int field1836;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public int field1837;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public int field1838;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Lgo;")
    public class310 field1830;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "Lgo;")
    public class310 field1833;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Ljava/lang/String;")
    public String field1829;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Z")
    public boolean field1827;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "[Ljava/lang/Object;")
    public Object[] field1832;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "[Z")
    public static boolean[] field1839;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
    public static void method902(boolean arg0) {
        if (!arg0) {
            method903(30, -54, 4);
        }
        field1834 = null;
        field1839 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)Z")
    public static final boolean method903(int arg0, int arg1, int arg2) {
        if (arg1 != -8382) {
            method903(-79, -82, 80);
        }
        field1828++;
        return (class191.method1275(arg2, arg1 + 7837, arg0) | (arg2 & 0x2000) != 0 | class152.method1095(arg2, arg0, (byte) 56)) & class532.method3158(arg2, false, arg0);
    }

    static {
        new class347("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field1840 = -1;
    }
}
