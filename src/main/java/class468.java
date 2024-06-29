import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class468 {

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
    private int field6835 = 0;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    private int field6836 = 0;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "Lao;")
    private class188 field6840 = null;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "I")
    private int field6843 = 0;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "Lht;")
    private class410 field6842;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "Lgo;")
    private class442 field6839;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "[Lsc;")
    private class229[] field6837;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "Lrv;")
    public class71 field6838;

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "Lfg;")
    public static class83 field6846;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "Lvu;")
    public static class222 field6847;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)Z")
    public final boolean method2749(int arg0, int arg1) {
        field6841++;
        int var3 = -112 / ((arg0 + 18) / 32);
        return this.field6837[arg1].method13((byte) 125);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lao;BI)Z")
    public final boolean method2750(class188 arg0, byte arg1, int arg2) {
        field6845++;
        if (arg1 != -42) {
            return false;
        } else if (this.field6835 == 0) {
            return false;
        } else {
            if (this.field6840 != arg0) {
                this.field6837[Integer.MAX_VALUE & this.field6835].method22(-80, arg2, arg0);
                this.field6840 = arg0;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IZIZ)V")
    public final void method2751(int arg0, boolean arg1, int arg2, boolean arg3) {
        boolean var5 = arg3 & this.field6842.method481();
        field6844++;
        if (arg2 >= -96) {
            this.field6836 = -7;
        }
        if (!var5 && (arg0 == 4 || arg0 == 8)) {
            arg0 = 2;
        }
        if (arg0 != 0 && arg1) {
            arg0 |= Integer.MIN_VALUE;
        }
        if (this.field6835 != arg0) {
            if (this.field6835 != 0) {
                this.field6837[Integer.MAX_VALUE & this.field6835].method19(262144);
            }
            if (arg0 != 0) {
                this.field6837[Integer.MAX_VALUE & arg0].method20(true, arg1);
                this.field6837[arg0 & Integer.MAX_VALUE].method17(arg1, -27632);
            }
            this.field6840 = null;
            this.field6835 = arg0;
            this.field6843 = Integer.MIN_VALUE;
            this.field6836 = Integer.MIN_VALUE;
        } else if (this.field6835 != 0) {
            this.field6837[Integer.MAX_VALUE & this.field6835].method17(arg1, -27632);
            return;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(III)V")
    public final void method2752(int arg0, int arg1, int arg2) {
        if ((this.field6836 != arg0 | this.field6843 != arg1) & this.field6835 != 0) {
            this.field6837[Integer.MAX_VALUE & this.field6835].method12(arg0, arg2 ^ 0x80000037, arg1);
            this.field6836 = arg0;
            this.field6843 = arg1;
        }
        field6848++;
        if (arg2 != Integer.MAX_VALUE) {
            this.method2752(-104, -98, 36);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
    public static void method2753(int arg0) {
        field6847 = null;
        if (arg0 != -6543) {
            field6846 = null;
        }
        field6846 = null;
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lht;)V")
    public class468(class410 arg0) {
        this.field6842 = arg0;
        this.field6839 = new class442(arg0);
        this.field6837 = new class229[10];
        this.field6837[1] = new class3(arg0);
        this.field6837[2] = new class101(arg0, this.field6839);
        this.field6837[4] = new class327(arg0, this.field6839);
        this.field6837[5] = new class420(arg0, this.field6839);
        this.field6837[6] = new class321(arg0);
        this.field6837[7] = new class213(arg0);
        this.field6837[3] = this.field6838 = new class71(arg0);
        this.field6837[8] = new class287(arg0, this.field6839);
        this.field6837[9] = new class476(arg0, this.field6839);
        if (!this.field6837[8].method13((byte) 124)) {
            this.field6837[8] = this.field6837[4];
        }
        if (!this.field6837[9].method13((byte) 125)) {
            this.field6837[9] = this.field6837[8];
        }
    }

    static {
        new class83("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field6846 = new class83("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");
    }
}
