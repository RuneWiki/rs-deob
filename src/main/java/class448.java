import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class448 {

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Ldc;")
    public static class3 field6394 = new class3();

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "[I")
    public static int[] field6396 = new int[25];

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "[Lsf;")
    public static class306[] field6398;

    static {
        new class349("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIILqo;)V", line = 8)
    public static final void method2791(int arg0, int arg1, int arg2, class16 arg3) {
        if (class385.field5449[arg0][arg1][arg2] == null) {
            class197.method1400(arg0, arg1, arg2);
        }
        class385.field5449[arg0][arg1][arg2].field969 = arg3;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZIBIZ)I", line = 22)
    public static final int method2792(boolean arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        int var5 = 29 % ((arg2 - 24) / 50);
        field6393++;
        class101 var6 = class438.method2729(arg0, arg1, true);
        if (var6 == null) {
            return 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < var6.field1277.length; var8++) {
            if (var6.field1277[var8] >= 0 && var6.field1277[var8] < class320.field4691) {
                class409 var9 = class167.method1202(true, var6.field1277[var8]);
                int var10 = var9.method2589(arg3, class58.method378(arg3, (byte) 118).field4668, 26624);
                if (arg4) {
                    var7 += var6.field1280[var8] * var10;
                } else {
                    var7 += var10;
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V", line = 63)
    public static final void method2793(int arg0, int arg1, int arg2) {
        if (arg1 == -7907) {
            field6395++;
            class24.field305 = new class15(arg0);
            class381.field5408 = new class15(arg2);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V", line = 76)
    public static void method2794(byte arg0) {
        field6394 = null;
        field6396 = null;
        field6398 = null;
        if (arg0 < 96) {
            field6398 = null;
        }
    }
}
