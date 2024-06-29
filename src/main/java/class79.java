import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class79 {

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "Ldp;")
    public class304 field1040 = new class304();

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "[I")
    public static int[] field1041 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "[Z")
    public static boolean[] field1038 = new boolean[5];

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "[[I")
    public static int[][] field1046;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "Lsc;")
    public static class239 field1043;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "Ldp;")
    private class304 field1044;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)Ldp;")
    public final class304 method512(byte arg0) {
        field1045++;
        class304 var2 = this.field1040.field4597;
        if (this.field1040 == var2) {
            this.field1044 = null;
            return null;
        }
        this.field1044 = var2.field4597;
        if (arg0 >= -123) {
            this.method514((byte) 36);
        }
        return var2;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ldp;I)V")
    public final void method513(class304 arg0, int arg1) {
        field1039++;
        if (arg0.field4598 != null) {
            arg0.method1872((byte) -36);
        }
        if (arg1 == 20319) {
            arg0.field4598 = this.field1040.field4598;
            arg0.field4597 = this.field1040;
            arg0.field4598.field4597 = arg0;
            arg0.field4597.field4598 = arg0;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V")
    public final void method514(byte arg0) {
        field1036++;
        while (true) {
            class304 var2 = this.field1040.field4597;
            if (this.field1040 == var2) {
                this.field1044 = null;
                if (arg0 == 81) {
                    return;
                } else {
                    this.field1044 = null;
                    return;
                }
            }
            var2.method1872((byte) -89);
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(B)Ldp;")
    public final class304 method515(byte arg0) {
        field1037++;
        if (arg0 != -96) {
            method516(-88, -18, (byte) -87, 66, -76);
        }
        class304 var2 = this.field1044;
        if (this.field1040 == var2) {
            this.field1044 = null;
            return null;
        } else {
            this.field1044 = var2.field4597;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIBII)V")
    public static final void method516(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1035++;
        class32 var5 = class136.method854(10, (byte) 93, arg4);
        var5.method194(false);
        var5.field400 = arg0;
        var5.field412 = arg3;
        if (arg2 == -14) {
            var5.field404 = arg1;
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
    public class79() {
        this.field1040.field4597 = this.field1040;
        this.field1040.field4598 = this.field1040;
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(B)V")
    public static void method517(byte arg0) {
        field1043 = null;
        if (arg0 >= 102) {
            field1038 = null;
            field1041 = null;
            field1046 = null;
        }
    }

    static {
        new class151("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field1046 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };
    }
}
