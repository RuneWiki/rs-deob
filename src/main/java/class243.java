import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class243 {

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Lef;")
    public static class214 field3885 = null;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "[J")
    public static long[] field3889 = new long[32];

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "[[[Lrh;")
    public static class46[][][] field3891 = new class46[4][104][104];

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field3890 = 0;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "Ldl;")
    public static class123 field3892;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Lol;")
    public static class208 field3888;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "[I")
    public static int[] field3893;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIZ)I")
    public static final int method1639(int arg0, int arg1, boolean arg2) {
        field3894++;
        if (!arg2) {
            field3887 = -23;
        }
        int var3 = 0;
        while (arg1 > 0) {
            arg1--;
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method1640(byte arg0, String arg1) {
        field3884++;
        if (arg0 <= 59) {
            method1639(-117, 38, true);
        }
        return class131.method895(arg1, true, 10, -9);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method1641(int arg0) {
        if (arg0 > -72) {
            return;
        }
        field3893 = null;
        field3889 = null;
        field3888 = null;
        field3885 = null;
        field3892 = null;
        field3891 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static final void method1642(byte arg0) {
        class227.field3671 = "Suche nach Updates - ";
        class60.field838 = "Schriftsätze geladen.";
        class257.field4157 = "Titelbild geöffnet.";
        class51.field707 = " loggt sich aus.";
        class178.field2782 = "rot:";
        class271.field4305 = "Bitte entferne ";
        class253.field4088 = "weiss:";
        class241.field3861 = "Stufe: ";
        class225.field3643 = "Lade Benutzeroberfläche - ";
        class172.field2702 = "Untersuchen";
        class86.field1366 = "Wähl eine Option";
        class148.field2195 = "möchte mit dir handeln.";
        class258.field4164 = "Sprites geladen.";
        class278.field4422 = "Weiter";
        class33.field425 = "T";
        class35.field450 = "Kampfstufe: ";
        class139.field2045 = "blinken2:";
        class45.field575 = "Lade Titelbild - ";
        class58.field813 = "Bitte warte...";
        class62.field855 = "RuneScape wird geladen - bitte warten...";
        class211.field3290 = "Speicher wird zugewiesen.";
        class92.field1403 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class276.field4395 = "Verbindung zum Update-Server hergestellt.";
        class286.field4540 = "Texturen geladen.";
        class56.field796 = "Okay";
        class165.field2559 = "Ladevorgang - bitte warte.";
        class203.field3180 = "blinken1:";
        class218.field3551 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class224.field3622 = "3D-Softwarebibliothek gestartet.";
        field3896++;
        class140.field2063 = "Lade...";
        class54.field738 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class102.field1588 = "Lade Schriftsätze - ";
        class134.field1951 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class162.field2518 = "Titelbild geladen.";
        class173.field2714 = " steht bereits auf deiner Ignorieren-Liste!";
        class223.field3604 = ": ";
        class72.field1017 = "Nehmen";
        class178.field2780 = "Auswählen";
        class216.field3534 = "Spieler kann nicht gefunden werden: ";
        class157.field2420 = "gelb:";
        class47.field602 = "Verbindung abgebrochen.";
        class26.field367 = "Bitte entferne ";
        class161.field2506 = "Gegenstand für Mitglieder";
        class199.field3122 = "Spielwelt erstellt.";
        class106.field1632 = "scrollen:";
        class115.field1704 = "Eingabeprozedur geladen.";
        class154.field2300 = " steht bereits auf deiner Freunde-Liste!";
        class248.field3971 = "Lade Texturen - ";
        if (arg0 != 15) {
            method1640((byte) 84, (String) null);
        }
        class211.field3307 = "Lade Wordpack - ";
        class198.field3111 = "blaugrün:";
        class16.field189 = "Fertigkeit: ";
        class13.field176 = "Versteckt";
        class102.field1586 = " loggt sich ein.";
        class227.field3659 = "Verbindung mit Update-Server...";
        class274.field4372 = "leuchten1:";
        class155.field2305 = "Lade Sprites - ";
        class128.field1882 = "Zugewiesener Speicher.";
        class270.field4295 = "M";
        class290.field4581 = "Abbrechen";
        class227.field3673 = "Liste der Welten geladen";
        class186.field2908 = "Musik-Engine vorbereitet.";
        class174.field2725 = "Konfig geladen.";
        class16.field194 = "Benutzeroberfläche geladen.";
        class10.field135 = "welle2:";
        class29.field394 = " zuerst von deiner Ignorieren-Liste!";
        class80.field1147 = "blinken3:";
        class198.field3110 = " weitere Optionen";
        class232.field3731 = "Wordpack geladen.";
        class90.field1377 = "Ablegen";
        class130.field1911 = "Fallen lassen";
        class239.field3819 = "Lade Konfiguration - ";
        class130.field1910 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class110.field1666 = "Starte 3D-Softwarebibliothek.";
        class228.field3689 = "schütteln:";
        class262.field4238 = "Angreifen";
        class218.field3547 = "Benutzen";
        class189.field2979 = "welle:";
        class131.field1928 = "gleiten:";
        class50.field678 = "T";
        class159.field2441 = "Hierhin gehen";
        class274.field4374 = "Schließen";
        class47.field600 = "grün:";
        class13.field169 = "leuchten2:";
        class16.field187 = "Lade Liste der Welten";
        class202.field3161 = "Update-Liste geladen.";
        class10.field146 = "leuchten3:";
        class272.field4319 = "lila:";
        class152.field2260 = "M";
        class261.field4214 = " zuerst von deiner Freunde-Liste!";
        class84.field1313 = "Hierhin drehen";
    }
}
