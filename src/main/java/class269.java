import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class269 {

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4001 = "";

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "[I")
    public static int[] field4004 = new int[2];

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "[C")
    public static char[] field4005 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "J")
    public static long field3995;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Ldu;")
    public static class443 field3996;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "[I")
    public static int[] field3997;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)Lfp;")
    public static final class437 method1675(int arg0, int arg1) {
        field4002++;
        class437[] var2 = class126.method928(128);
        if (arg1 != 381) {
            return null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field6443 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)Z")
    public static final boolean method1676(byte arg0, int arg1) {
        int var2 = -14 % ((arg0 + 32) / 38);
        field4003++;
        return arg1 >= 12 && arg1 <= 17;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static final void method1677(byte arg0) {
        field3998++;
        if (arg0 >= 121) {
            class261.field3905 = new class497();
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method1678(int arg0, int arg1) {
        if (arg1 != 12904) {
            method1675(-125, 56);
        }
        field4000++;
        return (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFF8A11) >> 16) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method1679(int arg0) {
        field4001 = null;
        field4004 = null;
        field3997 = null;
        field4005 = null;
        if (arg0 < 34) {
            method1678(-65, -124);
        }
        field3996 = null;
    }

    static {
        new class347("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
    }
}
