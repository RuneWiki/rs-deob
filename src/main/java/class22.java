import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public abstract class class22 extends class29 {

    @OriginalMember(owner = "client!dc", name = "gb", descriptor = "I")
    public int field634 = 1000;

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "Lwb;")
    public static class130 field631 = class26.method212("Anmelde)2Limit -Uberschritten)3", -32376);

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "Lwb;")
    public static class130 field627 = class26.method212("Benutzeroberfl-=che geladen)3", -32376);

    @OriginalMember(owner = "client!dc", name = "eb", descriptor = "I")
    public static int field632 = -1;

    @OriginalMember(owner = "client!dc", name = "jb", descriptor = "[I")
    public static int[] field637 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client!dc", name = "hb", descriptor = "Lwb;")
    public static class130 field635 = class26.method212("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", -32376);

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "[Z")
    public static boolean[] field629 = new boolean[5];

    @OriginalMember(owner = "client!dc", name = "ib", descriptor = "Lwb;")
    public static class130 field636 = class26.method212("Ihr Spielkonto wird bereits benutzt)3", -32376);

    @OriginalMember(owner = "client!dc", name = "ob", descriptor = "I")
    public static volatile int field642 = 0;

    @OriginalMember(owner = "client!dc", name = "mb", descriptor = "Lwb;")
    public static class130 field640 = class26.method212("*6n", -32376);

    @OriginalMember(owner = "client!dc", name = "kb", descriptor = "Lge;")
    public static class41 field638 = new class41(64);

    @OriginalMember(owner = "client!dc", name = "pb", descriptor = "I")
    public static int field643 = 127;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!dc", name = "fb", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!dc", name = "nb", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!dc", name = "qb", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!dc", name = "lb", descriptor = "Lk;")
    public static class60 field639;

    @OriginalMember(owner = "client!dc", name = "rb", descriptor = "Lk;")
    public static class60 field645;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)V", line = 10)
    public static final void method196(byte arg0) {
        field633++;
        class7.field241.method401(26116);
        int var1 = -67 % ((arg0 + 25) / 47);
        class68.field1760.method401(26116);
        class15.field440.method401(26116);
        class71.field1806.method401(26116);
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(B)V", line = 28)
    public static void method197(byte arg0) {
        field636 = null;
        field645 = null;
        field640 = null;
        field627 = null;
        field637 = null;
        if (arg0 < 53) {
            method197((byte) 105);
        }
        field639 = null;
        field635 = null;
        field638 = null;
        field631 = null;
        field629 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIIII)V", line = 47)
    public void method198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field628++;
        class102 var10 = this.method10((byte) -38);
        if (var10 != null) {
            this.field634 = var10.field634;
            var10.method198(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(B)Lr;", line = 102)
    public class102 method10(byte arg0) {
        if (arg0 != -38) {
            field630 = 40;
        }
        field626++;
        return null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 122)
    public static final int method199(KeyEvent arg0, int arg1) {
        field641++;
        int var2 = arg0.getKeyChar();
        int var3 = -37 % ((arg1 + 30) / 33);
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }
}
