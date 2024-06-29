import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class398 {

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Lkq;")
    public class427 field6063 = new class427();

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Lni;")
    public static class367 field6064;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "J")
    public static long field6070;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "[I")
    public static int[] field6073;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "Laa;")
    public static class341 field6074;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Lkq;")
    private class427 field6068;

    static {
        new class446("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
        field6064 = new class367(43, 3);
        field6070 = 0L;
        new class446("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field6072 = 0;
        field6071 = 104;
        field6073 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)I", line = 5)
    public final int method2464(int arg0) {
        field6066++;
        int var2 = 0;
        if (arg0 == 2) {
            for (class427 var3 = this.field6063.field6485; var3 != this.field6063; var3 = var3.field6485) {
                var2++;
            }
            return var2;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V", line = 26)
    public static void method2465(int arg0) {
        field6074 = null;
        field6073 = null;
        if (arg0 != -27958) {
            field6071 = 22;
        }
        field6064 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)Lkq;", line = 39)
    public final class427 method2466(byte arg0) {
        int var2 = 64 / ((arg0 + 53) / 33);
        field6067++;
        class427 var3 = this.field6063.field6485;
        if (this.field6063 == var3) {
            this.field6068 = null;
            return null;
        } else {
            this.field6068 = var3.field6485;
            return var3;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILkq;)V", line = 59)
    public final void method2467(int arg0, class427 arg1) {
        if (arg0 != 1) {
            return;
        }
        if (arg1.field6487 != null) {
            arg1.method2606(11129);
        }
        field6062++;
        arg1.field6485 = this.field6063;
        arg1.field6487 = this.field6063.field6487;
        arg1.field6487.field6485 = arg1;
        arg1.field6485.field6487 = arg1;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)Lkq;", line = 76)
    public final class427 method2468(int arg0) {
        field6065++;
        class427 var2 = this.field6068;
        if (this.field6063 == var2) {
            this.field6068 = null;
            return null;
        }
        if (arg0 > -75) {
            this.method2464(69);
        }
        this.field6068 = var2.field6485;
        return var2;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V", line = 141)
    public class398() {
        this.field6063.field6487 = this.field6063;
        this.field6063.field6485 = this.field6063;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V", line = 114)
    public final void method2469(boolean arg0) {
        if (!arg0) {
            method2465(-90);
        }
        while (true) {
            class427 var2 = this.field6063.field6485;
            if (this.field6063 == var2) {
                field6069++;
                this.field6068 = null;
                return;
            }
            var2.method2606(11129);
        }
    }
}
