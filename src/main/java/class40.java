import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class40 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Lui;")
    public static class375 field618 = new class375("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field621 = 0;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lwk;")
    public static class171 field623;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Z")
    public static boolean field620;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIII)I")
    public static final int method319(int arg0, int arg1, int arg2, int arg3) {
        field619++;
        if (arg0 == arg1) {
            return arg0;
        }
        int var4 = 128 - arg3;
        if (arg2 != 28365) {
            field620 = false;
        }
        int var5 = (arg0 & 0x7F) * var4 + (arg1 & 0x7F) * arg3 >> 7;
        int var6 = (arg0 & 0x380) * var4 + (arg1 & 0x380) * arg3 >> 7;
        int var7 = (arg0 & 0xFC00) * var4 + (arg1 & 0xFC00) * arg3 >> 7;
        return var7 & 0xFC00 | var6 & 0x380 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method320(byte arg0) {
        field618 = null;
        field623 = null;
        if (arg0 != -78) {
            method319(107, 40, 32, 23);
        }
    }
}
