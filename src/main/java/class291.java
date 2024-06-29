import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class291 {

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public static int field4242 = 1;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "[[I")
    public static int[][] field4247;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "Ldk;")
    public static class326 field4245;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "Ldt;")
    public static class145 field4240;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)V")
    public static final void method1822(boolean arg0) {
        if (arg0) {
            method1822(false);
        }
        if (class430.field6025.toLowerCase().indexOf("microsoft") == -1) {
            class22.field277[47] = 73;
            class22.field277[93] = 43;
            class22.field277[59] = 57;
            class22.field277[45] = 26;
            class22.field277[46] = 72;
            class22.field277[92] = 74;
            class22.field277[91] = 42;
            class22.field277[61] = 27;
            if (class430.field6028 == null) {
                class22.field277[222] = 59;
                class22.field277[192] = 58;
            } else {
                class22.field277[222] = 58;
                class22.field277[520] = 59;
                class22.field277[192] = 28;
            }
            class22.field277[44] = 71;
        } else {
            class22.field277[219] = 42;
            class22.field277[186] = 57;
            class22.field277[188] = 71;
            class22.field277[192] = 58;
            class22.field277[223] = 28;
            class22.field277[189] = 26;
            class22.field277[221] = 43;
            class22.field277[220] = 74;
            class22.field277[191] = 73;
            class22.field277[187] = 27;
            class22.field277[190] = 72;
            class22.field277[222] = 59;
        }
        field4241++;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)I")
    public static final int method1823(byte arg0) {
        if (arg0 < 86) {
            field4240 = null;
        }
        field4244++;
        if (class250.field3695 == null) {
            if (!class19.field260 && class476.field6690 > 0) {
                if (class325.field4695 && class272.field3959.method2712(2, 81) && class476.field6690 > 2) {
                    return ((class451) class160.field2365.field6838.field3576.field3576).field6239;
                }
                return ((class451) class160.field2365.field6838.field3576).field6239;
            }
            int var1 = class262.field3832.method175(-100);
            int var2 = class262.field3832.method177(39);
            int var3 = class142.field1888;
            int var4 = class151.field2246;
            int var5 = class104.field1324;
            if (var3 < var1 && var1 < var3 + var5) {
                int var6 = -1;
                for (int var7 = 0; var7 < class476.field6690; var7++) {
                    if (class103.field1317) {
                        int var12 = (class476.field6690 - var7 - 1) * 16 + var4 + 33;
                        if (var12 - 13 < var2 && var12 + 3 >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class476.field6690 - var7 - 1) * 16 + var4 + 31;
                        if (var11 - 13 < var2 && var11 + 3 >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class449 var9 = new class449(class160.field2365);
                    for (class451 var10 = (class451) var9.method2621(1); var10 != null; var10 = (class451) var9.method2619((byte) 60)) {
                        if (var8++ == var6) {
                            return var10.field6239;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
    public static void method1824(int arg0) {
        if (arg0 >= -54) {
            method1824(96);
        }
        field4247 = null;
        field4240 = null;
        field4245 = null;
    }

    static {
        new class326("Select", "Auswählen", "Sélectionner", "Selecionar");
        field4246 = 0;
        field4247 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
        field4245 = new class326("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");
    }
}
