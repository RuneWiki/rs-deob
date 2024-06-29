import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class454 {

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Lng;")
    private class226 field6731 = new class226(64);

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Lng;")
    public class226 field6732 = new class226(30);

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Lic;")
    public class491 field6727;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "Lic;")
    private class491 field6728;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "[C")
    public static char[] field6726 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "Llt;")
    public static class475 field6723 = new class475("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field6735 = 0;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "[I")
    public static int[] field6736 = new int[1];

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Lvg;")
    public static class38 field6738 = null;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public int field6737;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V")
    public final void method2726(int arg0, int arg1) {
        if (arg0 != 1) {
            return;
        }
        this.field6737 = arg1;
        field6729++;
        class226 var3 = this.field6732;
        synchronized (this.field6732) {
            this.field6732.method1540(0);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
    public final void method2727(boolean arg0) {
        field6724++;
        class226 var2 = this.field6731;
        synchronized (this.field6731) {
            if (arg0) {
                return;
            }
            this.field6731.method1539(-53);
        }
        class226 var3 = this.field6732;
        synchronized (this.field6732) {
            this.field6732.method1539(-77);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method2728(int arg0) {
        field6736 = null;
        field6738 = null;
        field6726 = null;
        field6723 = null;
        if (arg0 != 160) {
            method2728(-59);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)V")
    public final void method2729(int arg0, byte arg1) {
        field6734++;
        class226 var3 = this.field6731;
        synchronized (this.field6731) {
            this.field6731.method1534(0, arg0);
        }
        if (arg1 <= -84) {
            class226 var4 = this.field6732;
            synchronized (this.field6732) {
                this.field6732.method1534(0, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)V")
    public static final void method2730(boolean arg0, int arg1) {
        if (class150.field2232 == 0) {
            class411.field6178.method1240((byte) 106, arg1);
        } else {
            class146.field2162 = arg1;
        }
        field6730++;
        if (arg0) {
            method2730(false, -10);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public final void method2731(byte arg0) {
        class226 var2 = this.field6731;
        synchronized (this.field6731) {
            this.field6731.method1540(0);
            if (arg0 <= 56) {
                this.field6727 = null;
            }
        }
        field6725++;
        class226 var3 = this.field6732;
        synchronized (this.field6732) {
            this.field6732.method1540(0);
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)Las;")
    public final class104 method2732(int arg0, int arg1) {
        field6733++;
        class226 var3 = this.field6731;
        class104 var4;
        synchronized (this.field6731) {
            var4 = (class104) this.field6731.method1536((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6728.method2945(class493.method2957(arg1, 46), class111.method680(false, arg1), true);
        class104 var6 = new class104();
        var6.field1502 = arg1;
        var6.field1491 = this;
        if (var5 != null) {
            var6.method648(new class209(var5), (byte) 68);
        }
        class226 var7 = this.field6731;
        synchronized (this.field6731) {
            this.field6731.method1542(var6, (byte) 112, (long) arg1);
        }
        if (arg0 <= 35) {
            this.field6731 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lai;ILic;Lic;)V")
    public class454(class423 arg0, int arg1, class491 arg2, class491 arg3) {
        this.field6727 = arg3;
        this.field6728 = arg2;
        int var5 = this.field6728.method2943((byte) -33) - 1;
        this.field6728.method2942(false, var5);
    }
}
