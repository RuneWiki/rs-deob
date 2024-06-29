import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class249 extends class425 {

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "I")
    public int field3708 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
    public int field3717 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
    public int field3714 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
    public int field3713 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
    public int field3710 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!gr", name = "w", descriptor = "I")
    public int field3715 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!gr", name = "A", descriptor = "I")
    public int field3719 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
    public int field3718 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "Lak;")
    public class194 field3711;

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!gr", name = "C", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!gr", name = "B", descriptor = "Ltj;")
    public static class108 field3720;

    static {
        new class349("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)Lam;", line = 12)
    public static final class379 method1731(int arg0, int arg1) {
        field3721++;
        class379 var2 = (class379) class206.field2945.method1972((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class421.field6022.method643(arg1, arg0, true);
        class379 var4 = new class379();
        if (var3 != null) {
            var4.method2418(new class130(var3), arg1 - 100);
        }
        class206.field2945.method1975(var4, (long) arg0, false);
        return var4;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V", line = 37)
    public static void method1732(int arg0) {
        if (arg0 != 27337) {
            method1732(-126);
        }
        field3720 = null;
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lak;)V", line = 107)
    public class249(class194 arg0) {
        this.field3711 = arg0;
    }

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "(B)V", line = 52)
    public static final void method1733(byte arg0) {
        if (arg0 != 62) {
            field3707 = 11;
        }
        class173.field2446.method98(0);
        field3716++;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)Z", line = 72)
    public final boolean method1734(int arg0, int arg1, int arg2) {
        if (arg0 < 6) {
            return true;
        }
        field3712++;
        if (arg1 >= this.field3717 && this.field3715 >= arg1 && this.field3718 <= arg2 && this.field3713 >= arg2) {
            return true;
        } else {
            return this.field3710 <= arg1 && arg1 <= this.field3714 && this.field3719 <= arg2 && this.field3708 >= arg2;
        }
    }
}
