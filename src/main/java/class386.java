import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class386 {

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Lbo;")
    private class453 field5650 = new class453(256);

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "Lbo;")
    private class453 field5655 = new class453(256);

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "Lir;")
    private class185 field5651;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "Lir;")
    private class185 field5654;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field5639 = 0;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field5644 = 1;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "[Loq;")
    public static class232[] field5643 = new class232[29];

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "[[B")
    public static byte[][] field5652 = new byte[250][];

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Lir;")
    public static class185 field5647;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Ll;")
    public static class315 field5638;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "[[I")
    public static int[][] field5640;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "[[[B")
    public static byte[][][] field5642;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II[I)Lhh;")
    public final class151 method2499(int arg0, int arg1, int[] arg2) {
        if (arg0 != -1005623568) {
            method2501((byte) 30);
        }
        field5653++;
        if (this.field5651.method1222(true) == 1) {
            return this.method2506(false, arg1, 0, arg2);
        } else if (this.field5651.method1225(arg1, (byte) 27) == 1) {
            return this.method2506(false, 0, arg1, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lfb;I)Lbg;")
    public static final class84 method2500(class341 arg0, int arg1) {
        if (arg1 != 27360) {
            field5639 = -71;
        }
        field5646++;
        class84 var2 = new class84();
        var2.field1159 = arg0.method2239(-1076227960);
        var2.field1164 = class208.method1367(-10186, var2.field1159);
        return var2;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static void method2501(byte arg0) {
        field5638 = null;
        if (arg0 > -127) {
            method2504((byte) 83, -14);
        }
        field5647 = null;
        field5642 = null;
        field5643 = null;
        field5640 = null;
        field5652 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([III)Lhh;")
    public final class151 method2502(int[] arg0, int arg1, int arg2) {
        field5648++;
        if (this.field5654.method1222(true) == 1) {
            return this.method2505(55, arg0, 0, arg1);
        } else if (this.field5654.method1225(arg1, (byte) 27) == 1) {
            return this.method2505(50, arg0, arg1, 0);
        } else {
            int var4 = -70 % ((-arg2 - 81) / 41);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
    public static final void method2503(boolean arg0) {
        class398.field5822 = "leuchten1:";
        class398.field5835 = "Mechscape wird geladen - bitte warten...";
        class113.field1460 = " loggt sich ein.";
        class257.field3765 = "Lade Liste der Welten";
        class109.field1423 = "Hierhin drehen";
        class338.field4999 = "T";
        class337.field4983 = "Wähl eine Option";
        class447.field6435 = "Titelbild geladen.";
        class429.field6239 = "Benutzen";
        class45.field689 = "Client-Variablen geladen";
        class108.field1419 = " steht bereits auf deiner Freunde-Liste!";
        class128.field1667 = "lila:";
        class27.field463 = "Weiter";
        class74.field1041 = ": ";
        field5645++;
        class255.field3715 = "grün:";
        class25.field445 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class295.field4451 = "Titelbild geöffnet.";
        class122.field1583 = "blaugrün:";
        class447.field6427 = "Ablegen";
        class126.field1648 = "Fallen lassen";
        class192.field2679 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class249.field3683 = "blinken3:";
        class7.field102 = "Abbrechen";
        class248.field3641 = "welle:";
        class278.field4084 = " weitere Optionen";
        class8.field110 = "scrollen:";
        class393.field5728 = "Starte 3D-Softwarebibliothek.";
        class48.field727 = "Schließen";
        class165.field2240 = "Ladevorgang - bitte warte.";
        class355.field5258 = "Lade Standardeinstellungen - ";
        class110.field1433 = "weiss:";
        class271.field3993 = "RuneScape wird geladen - bitte warten...";
        class21.field377 = "leuchten2:";
        class328.field4846 = "Standardeinstellungen geladen";
        class385.field5634 = "Okay";
        class95.field1298 = "Bitte entferne ";
        class399.field5845 = "Speicher wird zugewiesen.";
        class331.field4879 = " steht bereits auf deiner Ignorieren-Liste!";
        if (arg0) {
            method2500((class341) null, -37);
        }
        class95.field1282 = "Gegenstand für Mitglieder";
        class104.field1358 = "Stufe: ";
        class450.field6452 = "Lade Schriftsätze - ";
        class230.field3162 = "Verbindung zum Update-Server hergestellt.";
        class20.field359 = "Fertigkeit: ";
        class6.field82 = "Wordpack geladen.";
        class7.field97 = "Kampfstufe: ";
        class423.field6161 = "welle2:";
        class305.field4558 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class244.field3437 = "Hierhin gehen";
        class175.field2370 = "Spieler kann nicht gefunden werden: ";
        class361.field5342 = "Versteckt";
        class143.field1810 = "rot:";
        class25.field453 = "3D-Softwarebibliothek gestartet.";
        class316.field4623 = "Nehmen";
        class297.field4489 = "Texturen geladen.";
        class337.field4982 = "Untersuchen";
        class118.field1531 = "M";
        class249.field3685 = "Lade Benutzeroberfläche - ";
        class15.field239 = "Schriftsätze geladen.";
        class195.field2706 = "Lade Wordpack - ";
        class271.field3995 = " zuerst von deiner Freunde-Liste!";
        class144.field1848 = "Lade Konfiguration - ";
        class338.field4986 = "Musik-Engine vorbereitet.";
        class353.field5233 = "T";
        class234.field3258 = "leuchten3:";
        class397.field5798 = "Suche nach Updates - ";
        class421.field6114 = "Verbindung abgebrochen.";
        class8.field106 = "Bitte warte...";
        class69.field997 = "Update-Liste geladen.";
        class106.field1396 = "Bitte entferne ";
        class69.field995 = "Auswählen";
        class353.field5236 = "Konfig geladen.";
        class355.field5257 = "Zugewiesener Speicher.";
        class366.field5401 = " zuerst von deiner Ignorieren-Liste!";
        class325.field4820 = "Lade...";
        class320.field4761 = "gelb:";
        class296.field4472 = "Liste der Welten geladen";
        class68.field991 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class115.field1500 = "Lade Texturen - ";
        class274.field4027 = "Lade Titelbild - ";
        class258.field3802 = "M";
        class263.field3859 = "Spielwelt erstellt.";
        class72.field1025 = "Verbindung mit Update-Server...";
        class399.field5848 = "blinken1:";
        class447.field6444 = "Angreifen";
        class352.field5223 = "Lade Sprites - ";
        class252.field3694 = "Benutzeroberfläche geladen.";
        class129.field1687 = "Eingabeprozedur geladen.";
        class188.field2567 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class101.field1327 = "blinken2:";
        class133.field1745 = " loggt sich aus.";
        class431.field6271 = "gleiten:";
        class63.field945 = "Sprites geladen.";
        class190.field2649 = "schütteln:";
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)Z")
    public static final boolean method2504(byte arg0, int arg1) {
        field5637++;
        if (arg1 == 20 || arg1 == 31 || arg1 == 57 || arg1 == 42 || arg1 == 45) {
            return true;
        } else if (arg1 == 37 || arg1 == 23 || arg1 == 1009) {
            return true;
        } else {
            if (arg0 <= 111) {
                method2503(true);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[III)Lhh;")
    private final class151 method2505(int arg0, int[] arg1, int arg2, int arg3) {
        field5641++;
        int var5 = arg3 ^ (arg2 >>> 12 | (arg2 & 0xF0000FFF) << 4);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class151 var9 = (class151) this.field5655.method2826(false, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class44 var10 = (class44) this.field5650.method2826(false, var7);
            if (var10 == null) {
                var10 = class44.method315(this.field5654, arg2, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field5650.method2815(-1, var7, var10);
            }
            if (arg0 < 14) {
                field5639 = 105;
            }
            class151 var11 = var10.method319(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method2632(true);
                this.field5655.method2815(-1, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZII[I)Lhh;")
    private final class151 method2506(boolean arg0, int arg1, int arg2, int[] arg3) {
        field5636++;
        int var5 = (arg2 << 4 & 0xFFF5 | arg2 >>> 12) ^ arg1;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class151 var9 = (class151) this.field5655.method2826(arg0, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class374 var10 = class374.method2455(this.field5651, arg2, arg1);
            if (var10 == null) {
                return null;
            }
            class151 var11 = var10.method2457();
            this.field5655.method2815(-1, var7, var11);
            if (arg3 != null) {
                arg3[0] -= var11.field1907.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lir;Lir;)V")
    public class386(class185 arg0, class185 arg1) {
        this.field5651 = arg0;
        this.field5654 = arg1;
    }
}
