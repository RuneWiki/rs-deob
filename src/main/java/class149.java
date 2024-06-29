import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class149 {

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "[[Z")
    public static boolean[][] field2022;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "Lat;")
    public static class256 field2021;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "Lae;")
    public static class285 field2023;

    static {
        new class409("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field2022 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };
        field2021 = new class256(new byte[5000]);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 6)
    public static void method1024(int arg0) {
        field2022 = null;
        field2021 = null;
        field2023 = null;
        if (arg0 <= 95) {
            field2021 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lgt;Ljava/lang/Object;I)V", line = 36)
    public static final void method1025(class341 arg0, Object arg1, int arg2) {
        field2019++;
        if (arg0.field5026 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field5026.peekEvent() != null; var3++) {
            class418.method2587(false, 1L);
        }
        if (arg2 != 20897) {
            method1025((class341) null, (Object) null, 104);
        }
        if (arg1 != null) {
            arg0.field5026.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
