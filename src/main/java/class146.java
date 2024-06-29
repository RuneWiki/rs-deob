import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class146 {

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lgd;")
    public static class206 field2096;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "[[B")
    public static byte[][] field2098;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "[[Lnk;")
    public static class464[][] field2099;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static final void method867(int arg0) {
        field2095++;
        if (class446.field6074) {
            return;
        }
        class82.field1094 = true;
        int var1 = 76 / ((arg0 - 72) / 39);
        class446.field6074 = true;
        if (class488.field6789.field6670) {
            class270.field3610 = (float) ((int) class270.field3610 - 65 & 0xFFFFFF80);
        } else {
            class216.field2912 += (-class216.field2912 - 24.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)S")
    public static final short method868(int arg0, int arg1) {
        field2093++;
        int var2 = (arg0 & 0xFDDC) >> 10;
        if (arg1 != -2045205981) {
            return 123;
        }
        int var3 = (arg0 & 0x384) >> 3;
        int var4 = arg0 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var2 << 10 | var7 >> 4 << 7);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)V")
    public static final void method869(int arg0, boolean arg1) {
        field2097++;
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        if (!arg1) {
            field2099 = null;
        }
        class460.field6234 = arg0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)Lel;")
    public static final class354 method870(int arg0, int arg1, int arg2) {
        class491 var3 = class289.field3897[arg0][arg1][arg2];
        return var3 == null || var3.field6842 == null ? null : var3.field6842;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIILda;)V")
    public static final void method871(int arg0, int arg1, int arg2, int arg3, class41 arg4) {
        class491 var5 = class398.method2420(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field584 = (arg1 << class302.field4025) + class235.field3119;
        arg4.field580 = arg3;
        arg4.field583 = (arg2 << class302.field4025) + class235.field3119;
        for (class309 var7 = var5.field6845; var7 != null; var7 = var7.field4084) {
            if (var7.field4091.field6504) {
                int var8 = var7.field4091.method6(0);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field580 += var6;
            arg4.field581 = true;
        }
        var5.field6855 = arg4;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
    public static void method872(byte arg0) {
        field2098 = null;
        field2099 = null;
        if (arg0 == -29) {
            field2096 = null;
        }
    }

    static {
        new class206("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field2096 = new class206("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");
    }
}
