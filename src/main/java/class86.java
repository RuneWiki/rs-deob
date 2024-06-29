import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class class86 {

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "[S")
    public static short[] field1398;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)Z")
    public final boolean method636(int arg0) {
        field1397++;
        if (arg0 != 69) {
            field1396 = 87;
        }
        return this.method643(94) || this.method637(122) || this.method642(-39);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Z")
    public abstract boolean method637(int arg0);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IC)C")
    public static final char method638(int arg0, char arg1) {
        field1393++;
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
            if (arg0 <= 25) {
                method638(-122, '\u0017');
            }
            return '\u0000';
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)I")
    public abstract int method639(byte arg0);

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
    public static void method640(int arg0) {
        field1398 = null;
        if (arg0 != -23253) {
            method645(false, (byte) 123, true);
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
    public abstract void method641(int arg0);

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)Z")
    public abstract boolean method642(int arg0);

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)Z")
    public abstract boolean method643(int arg0);

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)I")
    public abstract int method644(int arg0);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZBZ)V")
    public static final void method645(boolean arg0, byte arg1, boolean arg2) {
        if (arg2) {
            class29.field399--;
            if (class29.field399 == 0) {
                class167.field2517 = null;
            }
        }
        if (arg1 > -45) {
            return;
        }
        field1394++;
        if (!arg0) {
            return;
        }
        class112.field1663--;
        if (class112.field1663 == 0) {
            class470.field6825 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
    public abstract void method646(byte arg0);

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)Lsm;")
    public abstract class191 method647(int arg0);

    static {
        new class44("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        field1396 = -1;
    }
}
