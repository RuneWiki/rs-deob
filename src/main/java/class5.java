import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class5 extends class43 {

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
    public static int field36 = 0;

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "Lcq;")
    public static class72 field38 = new class72("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "Lc;")
    public class436 field35;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "Z")
    public boolean field34;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IC)Z")
    public static final boolean method18(int arg0, char arg1) {
        field37++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg0 != -340) {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V")
    public static void method19(int arg0) {
        field38 = null;
        int var1 = -32 / ((-arg0 - 50) / 35);
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)V")
    public static final void method20(byte arg0) {
        field33++;
        int var1 = -90 / ((55 - arg0) / 61);
        for (int var2 = 0; var2 < class431.field5879; var2++) {
            class91 var3 = class267.method1668(var2, (byte) 53);
            if (var3 != null && var3.field1061 == 0) {
                class104.field1231[var2] = 0;
                class56.field649[var2] = 0;
            }
        }
        class23.field241 = new class349(128);
    }
}
