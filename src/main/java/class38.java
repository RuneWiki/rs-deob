import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class38 {

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "F")
    public float field654 = 1.0F;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "F")
    public float field643 = 0.25F;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "F")
    public float field658 = 1.0F;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "F")
    public float field649;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
    public int field653;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "F")
    public float field646;

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "F")
    public float field647;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "Lop;")
    public class63 field645;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "Ltm;")
    public static class112 field655 = new class112("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "Lmq;")
    public static class104 field660;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "Lqs;")
    public static class222 field659;

    static {
        new class112("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        new class112("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field660 = new class104(8);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V", line = 4)
    public static void method315(byte arg0) {
        field660 = null;
        field655 = null;
        if (arg0 >= -84) {
            method315((byte) 120);
        }
        field659 = null;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Llk;I)V", line = 16)
    public final void method316(class425 arg0, int arg1) {
        field648++;
        this.field654 = (float) (arg0.method2503(true) * 8) / 255.0F;
        this.field643 = (float) (arg0.method2503(true) * 8) / 255.0F;
        this.field658 = (float) (arg0.method2503(true) * 8) / 255.0F;
        if (arg1 != 10051) {
            this.field645 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lws;B)Z", line = 37)
    public final boolean method317(class38 arg0, byte arg1) {
        int var3 = -10 % ((arg1 + 37) / 32);
        field644++;
        return this.field651 == arg0.field651 && this.field647 == arg0.field647 && this.field646 == arg0.field646 && this.field649 == arg0.field649 && this.field643 == arg0.field643 && this.field654 == arg0.field654 && this.field658 == arg0.field658 && this.field657 == arg0.field657 && this.field656 == arg0.field656 && this.field645 == arg0.field645;
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V", line = 67)
    public class38() {
        this.field649 = 1.2F;
        this.field650 = -60;
        this.field656 = 0;
        this.field653 = -50;
        this.field646 = 0.69921875F;
        this.field652 = -50;
        this.field647 = 1.1523438F;
        this.field645 = class166.field2446;
        this.field657 = class335.field4599;
        this.field651 = class491.field6933;
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Llk;)V", line = 83)
    public class38(class425 arg0) {
        int var2 = arg0.method2503(true);
        if (class312.field4249 && class2.field18.method1051() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field651 = class491.field6933;
            } else {
                this.field651 = arg0.method2502((byte) -86);
            }
            if ((var2 & 0x2) == 0) {
                this.field647 = 1.1523438F;
            } else {
                this.field647 = (float) arg0.method2508(true) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field646 = 0.69921875F;
            } else {
                this.field646 = (float) arg0.method2508(true) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field649 = 1.2F;
            } else {
                this.field649 = (float) arg0.method2508(true) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2502((byte) -86);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2508(true);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2508(true);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2508(true);
            }
            this.field651 = class491.field6933;
            this.field646 = 0.69921875F;
            this.field647 = 1.1523438F;
            this.field649 = 1.2F;
        }
        if ((var2 & 0x10) == 0) {
            this.field650 = -60;
            this.field652 = -50;
            this.field653 = -50;
        } else {
            this.field652 = arg0.method2514(9786);
            this.field650 = arg0.method2514(9786);
            this.field653 = arg0.method2514(9786);
        }
        if ((var2 & 0x20) == 0) {
            this.field657 = class335.field4599;
        } else {
            this.field657 = arg0.method2502((byte) -86);
        }
        if ((var2 & 0x40) == 0) {
            this.field656 = 0;
        } else {
            this.field656 = arg0.method2508(true);
        }
        if ((var2 & 0x80) == 0) {
            this.field645 = class166.field2446;
        } else {
            this.field645 = class286.method1765(arg0.method2508(true), (byte) 121, arg0.method2508(true), arg0.method2508(true), arg0.method2508(true), arg0.method2508(true), arg0.method2508(true));
        }
    }
}
