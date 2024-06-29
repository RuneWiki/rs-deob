import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class77 extends class287 {

    @OriginalMember(owner = "client!in", name = "h", descriptor = "Lh;")
    public static class572 field1021 = new class572("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!in", name = "n", descriptor = "Lkv;")
    public static class227 field1027 = new class227();

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    public int field1023;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    public int field1024;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    public int field1029;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "Lco;")
    public class102 field1030;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "Loa;")
    public static class597 field1031;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "[Lpr;")
    public class381[] field1022;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III)Z")
    public static final boolean method592(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            field1026++;
            return (arg2 & 0x10000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(IIII)V")
    public static final void method593(int arg0, int arg1, int arg2, int arg3) {
        class205 var4 = class420.field5697[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class323 var5 = var4.field3040;
        class323 var6 = var4.field3050;
        if (var5 != null) {
            var5.field4448 = var5.field4448 * arg3 / (0x10 << class115.field1626 - 7);
            var5.field4447 = var5.field4447 * arg3 / (0x10 << class115.field1626 - 7);
        }
        if (var6 != null) {
            var6.field4448 = var6.field4448 * arg3 / (0x10 << class115.field1626 - 7);
            var6.field4447 = var6.field4447 * arg3 / (0x10 << class115.field1626 - 7);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method594(class208 arg0, int arg1, int arg2, int arg3) {
        field1025++;
        if (arg3 <= 114) {
            return false;
        }
        if (this.field1022 != null) {
            for (int var5 = 0; var5 < this.field1022.length; var5++) {
                if (this.field1022[var5].method2271(arg1, arg2) && this.field1030.method171(arg2, arg0, arg1, (byte) 58)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V")
    public static void method595(byte arg0) {
        field1031 = null;
        if (arg0 < -68) {
            field1021 = null;
            field1027 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lfw;IIII)V")
    public static final void method596(class51 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class623.method3644(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class145.field2083) {
            class623.method3644(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class623.method3644(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class384.field5282) {
            class623.method3644(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class384.field5282) {
            class623.method3644(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class145.field2083 && arg4 <= class384.field5282) {
            class623.method3644(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class623.method3644(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class145.field2083 && arg4 > 0) {
            class623.method3644(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }
}
