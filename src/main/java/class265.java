import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class265 {

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "[[I")
    public static int[][] field3882 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Lpn;")
    public static class534 field3887 = new class534(0, 0);

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lkn;")
    public static class530 field3888 = new class530("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public int field3880;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public int field3881;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public int field3883;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public int field3885;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public int field3886;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public int field3889;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Li;III[Z)Z")
    public static final boolean method1681(class31 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class60.field743 != class330.field4818) {
            int var6 = class68.field858[arg1].method11(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class38 var8 = class68.field858[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method11(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method17(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method3(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method1682(int arg0) {
        field3882 = null;
        field3888 = null;
        if (arg0 < 42) {
            method1681(null, -48, 64, 96, null);
        }
        field3887 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IC)C")
    public static final char method1683(int arg0, char arg1) {
        field3884++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else if (arg1 == 'œ') {
            return 'e';
        } else {
            if (arg0 != 0) {
                field3888 = null;
            }
            return '\u0000';
        }
    }
}
