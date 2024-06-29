import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class291 {

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public int field4209 = 0;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public int field4208 = -1;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Z")
    public boolean field4205 = true;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public int field4216 = 128;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "Z")
    public boolean field4217 = true;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public int field4213 = 16;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public int field4220 = 1190717;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public int field4203 = -1;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "Z")
    public boolean field4218 = false;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    public int field4219 = -1;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public int field4221 = 8;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "[I")
    public static int[] field4207 = new int[5];

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4204 = "Members object";

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field4211 = -1;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "[Lsh;")
    public static class341[] field4206;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)V")
    public static final void method1865(int arg0, int arg1) {
        field4215++;
        class256 var2 = class363.method2385(1, arg1, (byte) 1);
        int var3 = 101 % ((10 - arg0) / 62);
        var2.method1611(-92);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)V")
    public final void method1866(int arg0, boolean arg1) {
        if (this.field4208 == -1) {
            this.field4208 = this.field4203;
        }
        field4210++;
        this.field4221 = this.field4221 << 8 | arg0;
        if (arg1) {
            this.method1868((class265) null, 114, 18);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method1867(int arg0) {
        field4207 = null;
        if (arg0 != -9) {
            field4206 = null;
        }
        field4204 = null;
        field4206 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lil;II)V")
    public final void method1868(class265 arg0, int arg1, int arg2) {
        field4212++;
        if (arg2 != -5780) {
            this.method1868((class265) null, 92, 95);
        }
        while (true) {
            int var4 = arg0.method1697(-58);
            if (var4 == 0) {
                return;
            }
            this.method1870(arg0, arg1, -121, var4);
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public static final void method1869(int arg0) {
        class319.field4566 = " weitere Optionen";
        class75.field1015 = "Wähl eine Option";
        class271.field3970 = "Auswählen";
        class143.field1893 = "Angreifen";
        class40.field636 = "T";
        class436.field6401 = "Spielwelt erstellt.";
        class444.field6467 = "blaugrün:";
        class151.field1976 = " steht bereits auf deiner Freunde-Liste!";
        class391.field5860 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class284.field4146 = "leuchten3:";
        class413.field6172 = "Bitte warte...";
        class281.field4129 = "Wordpack geladen.";
        class137.field1811 = "Lade Standardeinstellungen - ";
        class6.field60 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class274.field4032 = "lila:";
        class411.field6153 = "Speicher wird zugewiesen.";
        class134.field1790 = "Client-Variablen geladen";
        class420.field6248 = " zuerst von deiner Ignorieren-Liste!";
        class52.field760 = "Verbindung abgebrochen.";
        class309.field4435 = "Fallen lassen";
        class80.field1103 = "blinken3:";
        class220.field3141 = " loggt sich aus.";
        class452.field6584 = "scrollen:";
        class8.field78 = "welle2:";
        class151.field1979 = "Lade Schriftsätze - ";
        class93.field1279 = "Lade Sprites - ";
        class314.field4506 = "Fertigkeit: ";
        class282.field4139 = "Starte 3D-Softwarebibliothek.";
        class187.field2543 = "rot:";
        if (arg0 >= -83) {
            return;
        }
        class278.field4086 = "Standardeinstellungen geladen";
        class373.field5621 = "weiss:";
        class327.field4697 = "Okay";
        class138.field1847 = "Mechscape wird geladen - bitte warten...";
        class166.field2173 = "Untersuchen";
        class185.field2521 = "Lade Benutzeroberfläche - ";
        class281.field4132 = "blinken2:";
        class273.field4004 = "Titelbild geladen.";
        class219.field3104 = " loggt sich ein.";
        class45.field672 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class6.field61 = " steht bereits auf deiner Ignorieren-Liste!";
        class119.field1586 = "Musik-Engine vorbereitet.";
        class390.field5852 = "gleiten:";
        class311.field4447 = "RuneScape wird geladen - bitte warten...";
        class86.field1200 = "Lade Wordpack - ";
        class224.field3177 = "Bitte entferne ";
        class73.field994 = "Abbrechen";
        class213.field3035 = "blinken1:";
        class295.field4258 = "Verbindung mit Update-Server...";
        field4204 = "Gegenstand für Mitglieder";
        class311.field4446 = "Titelbild geöffnet.";
        class451.field6573 = "Zugewiesener Speicher.";
        class74.field1001 = "M";
        class328.field4710 = "schütteln:";
        class170.field2243 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class126.field1685 = "Schließen";
        class434.field6393 = "Lade Konfiguration - ";
        class154.field2020 = "Benutzeroberfläche geladen.";
        class197.field2821 = "Ablegen";
        class403.field5983 = "Bitte entferne ";
        class376.field5682 = "Konfig geladen.";
        class177.field2313 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class191.field2666 = "Verbindung zum Update-Server hergestellt.";
        class284.field4157 = "Ladevorgang - bitte warte.";
        class119.field1595 = "Spieler kann nicht gefunden werden: ";
        class138.field1831 = "Update-Liste geladen.";
        class167.field2191 = "Sprites geladen.";
        class16.field186 = "3D-Softwarebibliothek gestartet.";
        class29.field506 = "Lade Titelbild - ";
        class238.field3341 = "Benutzen";
        class387.field5787 = "gelb:";
        class423.field6293 = "Versteckt";
        class370.field5496 = "Lade...";
        class306.field4377 = ": ";
        class97.field1330 = "Kampfstufe: ";
        class280.field4121 = "Texturen geladen.";
        class239.field3370 = "grün:";
        class264.field3838 = "welle:";
        class132.field1776 = "leuchten2:";
        class74.field1004 = "M";
        class433.field6391 = "Stufe: ";
        class197.field2811 = "Lade Texturen - ";
        field4214++;
        class300.field4295 = "T";
        class398.field5952 = " zuerst von deiner Freunde-Liste!";
        class192.field2672 = "leuchten1:";
        class51.field757 = "Lade Liste der Welten";
        class324.field4661 = "Hierhin gehen";
        class26.field451 = "Nehmen";
        class307.field4388 = "Weiter";
        class34.field560 = "Hierhin drehen";
        class256.field3755 = "Schriftsätze geladen.";
        class6.field59 = "Eingabeprozedur geladen.";
        class329.field4728 = "Liste der Welten geladen";
        class126.field1682 = "Suche nach Updates - ";
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lil;III)V")
    private final void method1870(class265 arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= -113) {
            return;
        }
        if (arg3 == 1) {
            this.field4209 = class222.method1377(arg0.method1691(false), (byte) 106);
        } else if (arg3 == 2) {
            this.field4203 = arg0.method1697(-60);
        } else if (arg3 == 3) {
            this.field4203 = arg0.method1685(8104);
            if (this.field4203 == 65535) {
                this.field4203 = -1;
            }
        } else if (arg3 == 5) {
            this.field4205 = false;
        } else if (arg3 == 7) {
            this.field4219 = class222.method1377(arg0.method1691(false), (byte) 106);
        } else if (arg3 == 8) {
            class125.field1662 = arg1;
        } else if (arg3 == 9) {
            this.field4216 = arg0.method1685(8104);
        } else if (arg3 == 10) {
            this.field4217 = false;
        } else if (arg3 == 11) {
            this.field4221 = arg0.method1697(-88);
        } else if (arg3 == 12) {
            this.field4218 = true;
        } else if (arg3 == 13) {
            this.field4220 = arg0.method1691(false);
        } else if (arg3 == 14) {
            this.field4213 = arg0.method1697(-71);
        } else if (arg3 == 15) {
            this.field4208 = arg0.method1685(8104);
            if (this.field4208 == 65535) {
                this.field4208 = -1;
            }
        }
        field4202++;
    }
}
