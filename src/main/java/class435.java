import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class435 {

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Lao;")
    public static class188 field6320 = new class188(64, 1);

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "Lvp;")
    public static class123 field6322 = new class123(1, -1);

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Lao;")
    public static class188 field6323 = new class188(22, 0);

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Lgf;")
    public static class180 field6324 = new class180("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
    public static void method2633(int arg0) {
        field6323 = null;
        field6324 = null;
        if (arg0 == -229) {
            field6322 = null;
            field6320 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IC)C")
    public static final char method2634(int arg0, char arg1) {
        field6319++;
        if (arg0 != -18473) {
            field6324 = null;
        }
        if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIILdn;ZI)V")
    public static final void method2635(int arg0, int arg1, int arg2, int arg3, class357 arg4, boolean arg5, int arg6) {
        field6321++;
        if (class420.field6182 >= 50 || arg4 == null || arg4.field5398 == null || arg4.field5398.length <= arg3 || arg4.field5398[arg3] == null) {
            return;
        }
        int var7 = arg4.field5398[arg3][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xEE) >> 5;
        int var10 = var7 & 0x1F;
        if (arg4.field5398[arg3].length > 1) {
            int var11 = (int) ((double) arg4.field5398[arg3].length * Math.random());
            if (var11 > 0) {
                var8 = arg4.field5398[arg3][var11];
            }
        }
        if (var10 == 0) {
            if (arg5) {
                class513.method3041(arg1 + 27431, var9, 0, var8, 255);
            }
        } else if (class397.field5830.field135 != 0) {
            int var12 = arg6 - 64 >> 7;
            int var13 = arg2 - 64 >> 7;
            if (arg1 == 232) {
                class375.field5603[class420.field6182++] = new class310((byte) 1, var8, var9, 0, 255, (var13 << 8) + (var12 << 16) + (arg0 << 24) + var10);
            }
        }
    }
}
