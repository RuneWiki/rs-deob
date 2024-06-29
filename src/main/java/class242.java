import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class242 extends class5 {

    @OriginalMember(owner = "client!j", name = "x", descriptor = "[I")
    public static int[] field3684 = new int[2];

    @OriginalMember(owner = "client!j", name = "t", descriptor = "Lec;")
    public static class99 field3680 = new class99(64);

    @OriginalMember(owner = "client!j", name = "B", descriptor = "[Z")
    public static boolean[] field3688 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public int field3683;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    public int field3689;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljd;I)V", line = 4)
    public static final void method1675(class95 arg0, int arg1) {
        class235.field3580 = arg0;
        if (arg1 == 2) {
            field3686++;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Lcm;", line = 16)
    public static final class332 method1676(int arg0, int arg1) {
        field3682++;
        class332 var2 = (class332) class330.field5072.method747((long) arg0, (byte) 93);
        if (var2 != null) {
            return var2;
        } else if (arg1 == 64) {
            byte[] var3 = class153.field2327.method696(class79.method616(arg0, -20255), (byte) 105, class98.method732(arg1 ^ 0xFFFFFFB5, arg0));
            class332 var4 = new class332();
            var4.field5147 = arg0;
            if (var3 != null) {
                var4.method2325(new class254(var3), (byte) -65);
            }
            var4.method2315((byte) 94);
            class330.field5072.method744(var4, -15692, (long) arg0);
            return var4;
        } else {
            return (class332) null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V", line = 44)
    public static void method1677(boolean arg0) {
        field3688 = null;
        field3680 = null;
        field3684 = null;
        if (!arg0) {
            method1677(false);
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V", line = 74)
    public static final void method1678(byte arg0) {
        class300.field4624 = "Eingabeprozedur geladen.";
        class214.field3296 = "Fertigkeit: ";
        class307.field4790 = "Schriftsätze geladen.";
        class220.field3361 = "T";
        class60.field797 = "Verbindung mit Update-Server...";
        class32.field408 = "Update-Liste geladen.";
        class3.field37 = "Hierhin gehen";
        class276.field4287 = "Lade Schriftsätze - ";
        class268.field4161 = "blinken3:";
        class330.field5066 = " loggt sich ein.";
        class228.field3471 = "Lade Wordpack - ";
        class137.field2072 = "leuchten2:";
        class222.field3382 = "gleiten:";
        class133.field2029 = "grün:";
        class172.field2774 = " zuerst von deiner Ignorieren-Liste!";
        class331.field5105 = "Zugewiesener Speicher.";
        class28.field337 = "Okay";
        class284.field4426 = "blaugrün:";
        if (arg0 >= -20) {
            field3680 = (class99) null;
        }
        class237.field3603 = "schütteln:";
        class339.field5269 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class144.field2207 = "Konfig geladen.";
        class286.field4447 = "Ladevorgang - bitte warte.";
        class16.field206 = "Starte 3D-Softwarebibliothek.";
        class51.field690 = "Texturen geladen.";
        class323.field4996 = "Lade Sprites - ";
        class5.field75 = "Versteckt";
        class169.field2737 = "Benutzeroberfläche geladen.";
        class83.field1216 = "Spielwelt erstellt.";
        class97.field1397 = "gelb:";
        class229.field3492 = "möchte mit dir handeln.";
        class205.field3151 = "Verbindung zum Update-Server hergestellt.";
        class76.field1112 = "Auswählen";
        class62.field834 = "M";
        class225.field3432 = "blinken1:";
        class51.field693 = "Nehmen";
        class273.field4256 = "Suche nach Updates - ";
        class21.field243 = "Lade Benutzeroberfläche - ";
        class63.field835 = "Stufe: ";
        class108.field1569 = "Fallen lassen";
        class98.field1407 = "scrollen:";
        class62.field825 = "Speicher wird zugewiesen.";
        class170.field2756 = "welle:";
        class265.field4119 = ": ";
        class102.field1473 = "Musik-Engine vorbereitet.";
        class61.field808 = "Titelbild geladen.";
        class209.field3193 = "M";
        class260.field4002 = "Kampfstufe: ";
        class257.field3938 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class233.field3543 = "Bitte warte...";
        class240.field3672 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class323.field4999 = "lila:";
        class59.field780 = "Schließen";
        class16.field204 = "Lade Texturen - ";
        class29.field354 = "Ablegen";
        class112.field1699 = "Hierhin drehen";
        class168.field2717 = " zuerst von deiner Freunde-Liste!";
        class201.field3092 = "Benutzen";
        class191.field2987 = "Wordpack geladen.";
        class228.field3481 = "leuchten3:";
        class34.field500 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class43.field613 = "RuneScape wird geladen - bitte warten...";
        class243.field3692 = "Lade Liste der Welten";
        class139.field2080 = " steht bereits auf deiner Freunde-Liste!";
        class239.field3646 = "Abbrechen";
        class335.field5219 = "leuchten1:";
        class178.field2832 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class28.field317 = "Liste der Welten geladen";
        class63.field853 = "Lade Konfiguration - ";
        class332.field5153 = "welle2:";
        class118.field1842 = "Bitte entferne ";
        class328.field5060 = "Gegenstand für Mitglieder";
        class320.field4959 = "Titelbild geöffnet.";
        class211.field3236 = "T";
        class21.field238 = "Lade...";
        class41.field599 = "blinken2:";
        field3681++;
        class201.field3073 = "Weiter";
        class121.field1864 = " steht bereits auf deiner Ignorieren-Liste!";
        class133.field2032 = "Untersuchen";
        class62.field830 = "Lade Titelbild - ";
        class237.field3608 = " weitere Optionen";
        class240.field3668 = "Bitte entferne ";
        class166.field2692 = "Spieler kann nicht gefunden werden: ";
        class77.field1127 = "rot:";
        class129.field1972 = "weiss:";
        class206.field3165 = "Lade Standardeinstellungen - ";
        class278.field4319 = "Sprites geladen.";
        class305.field4691 = "Verbindung abgebrochen.";
        class340.field5283 = " loggt sich aus.";
        class293.field4521 = "Angreifen";
        class130.field2002 = "Wähl eine Option";
        class153.field2328 = "3D-Softwarebibliothek gestartet.";
        class153.field2326 = "Standardinstellungen geladen";
    }
}
