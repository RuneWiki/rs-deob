import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class230 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Z")
    public boolean field3647 = false;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "[I")
    public static int[] field3649 = new int[8];

    @OriginalMember(owner = "client!u", name = "i", descriptor = "[I")
    public static int[] field3655 = new int[5];

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field3662 = 0;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public int field3652;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public int field3660;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Leb;")
    public static class103 field3654;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Ljj;")
    public static class134 field3651;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lhi;IB)V")
    public final void method1524(class264 arg0, int arg1, byte arg2) {
        while (true) {
            int var4 = arg0.method1779(-67);
            if (var4 == 0) {
                if (arg2 != -21) {
                    method1528(-3);
                }
                field3648++;
                return;
            }
            this.method1525(arg1, arg0, var4, (byte) -106);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILhi;IB)V")
    private final void method1525(int arg0, class264 arg1, int arg2, byte arg3) {
        field3656++;
        if (arg2 == 1) {
            this.field3660 = arg1.method1777(-58);
        } else if (arg2 == 2) {
            this.field3652 = arg1.method1732(104);
        } else if (arg2 == 3) {
            this.field3647 = true;
        } else if (arg2 == 4) {
            this.field3660 = -1;
        }
        if (arg3 >= -69) {
            field3655 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method1526(byte arg0) {
        field3654 = null;
        field3649 = null;
        if (arg0 < -4) {
            field3655 = null;
            field3651 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public static final void method1527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field3658++;
        class85 var13 = new class85();
        var13.field1161 = arg8;
        var13.field1159 = arg6;
        var13.field1155 = arg11;
        var13.field1165 = arg5;
        var13.field1158 = arg4;
        var13.field1152 = arg1;
        var13.field1169 = arg2;
        var13.field1164 = arg7;
        var13.field1166 = arg12;
        var13.field1167 = arg9;
        var13.field1170 = arg3;
        var13.field1173 = arg10;
        if (arg0 == 3177) {
            class243.field3892.method363(-107, var13);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static final void method1528(int arg0) {
        class260.field4131 = "Lade Texturen - ";
        class87.field1184 = "Bitte entferne ";
        class258.field4115 = "Verbindung abgebrochen.";
        class104.field1732 = " loggt sich aus.";
        class54.field774 = "Verbindung mit Update-Server...";
        class233.field3718 = "Speicher wird zugewiesen.";
        class205.field3282 = "Wähl eine Option";
        class22.field277 = "Nehmen";
        class289.field4620 = "T";
        class16.field197 = "leuchten3:";
        class23.field295 = "M";
        class49.field665 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class102.field1540 = "blaugrün:";
        class93.field1328 = "Okay";
        class38.field469 = "Lade Liste der Welten";
        class188.field3010 = "Fallen lassen";
        class146.field2359 = "schütteln:";
        class75.field1035 = "M";
        class256.field4099 = "blinken3:";
        class185.field2977 = "weiss:";
        class228.field3632 = "3D-Softwarebibliothek gestartet.";
        class12.field167 = "grün:";
        class155.field2493 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class78.field1070 = "lila:";
        class293.field4648 = "leuchten2:";
        class201.field3234 = " loggt sich ein.";
        class205.field3290 = "Hierhin gehen";
        if (arg0 != 0) {
            method1528(112);
        }
        class124.field2070 = "RuneScape wird geladen - bitte warten...";
        class183.field2929 = "leuchten1:";
        class253.field4047 = "Zugewiesener Speicher.";
        class18.field215 = "T";
        class78.field1074 = "Verbindung zum Update-Server hergestellt.";
        class184.field2936 = "welle2:";
        class290.field4630 = "möchte mit dir handeln.";
        class46.field556 = "Benutzen";
        class171.field2757 = "Konfig geladen.";
        class48.field591 = "Starte 3D-Softwarebibliothek.";
        class26.field314 = "blinken1:";
        class262.field4150 = "Bitte warte...";
        class75.field1019 = "Standardinstellungen geladen";
        class93.field1329 = "Texturen geladen.";
        class122.field2053 = "Lade Wordpack - ";
        class246.field3956 = "Liste der Welten geladen";
        class184.field2935 = "Abbrechen";
        class125.field2099 = "welle:";
        class226.field3575 = "Musik-Engine vorbereitet.";
        class104.field1730 = " steht bereits auf deiner Freunde-Liste!";
        class205.field3278 = "scrollen:";
        class264.field4202 = " steht bereits auf deiner Ignorieren-Liste!";
        class206.field3308 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        client.field3601 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class223.field3547 = "Lade Schriftsätze - ";
        class280.field4473 = "Titelbild geöffnet.";
        class41.field491 = " zuerst von deiner Freunde-Liste!";
        class175.field2814 = "Gegenstand für Mitglieder";
        class169.field2742 = " zuerst von deiner Ignorieren-Liste!";
        class107.field1857 = "Spielwelt erstellt.";
        class175.field2818 = "Sprites geladen.";
        class283.field4509 = "Lade...";
        class251.field4013 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class173.field2800 = "Stufe: ";
        class21.field256 = "Ladevorgang - bitte warte.";
        class203.field3260 = "Update-Liste geladen.";
        class238.field3804 = "Wordpack geladen.";
        class243.field3893 = "blinken2:";
        class295.field4669 = "Lade Titelbild - ";
        class159.field2596 = "Ablegen";
        class280.field4475 = "Fertigkeit: ";
        class34.field427 = "Benutzeroberfläche geladen.";
        class17.field198 = "Eingabeprozedur geladen.";
        class62.field849 = ": ";
        field3650++;
        class166.field2702 = "Lade Sprites - ";
        class96.field1443 = "Lade Konfiguration - ";
        class62.field865 = "Kampfstufe: ";
        class45.field543 = "Untersuchen";
        client.field3614 = "rot:";
        class77.field1047 = "Spieler kann nicht gefunden werden: ";
        class246.field3954 = "Weiter";
        class92.field1318 = "Bitte entferne ";
        class191.field3049 = " weitere Optionen";
        class51.field723 = "Schließen";
        class44.field526 = "Auswählen";
        class153.field2475 = "Lade Benutzeroberfläche - ";
        class295.field4668 = "Titelbild geladen.";
        class193.field3104 = "Hierhin drehen";
        class79.field1080 = "Schriftsätze geladen.";
        class127.field2111 = "Versteckt";
        class224.field3558 = "gelb:";
        class271.field4381 = "Lade Standardeinstellungen - ";
        class144.field2333 = "Angreifen";
        class101.field1530 = "Suche nach Updates - ";
        class152.field2462 = "gleiten:";
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIZ)Lvl;")
    public final class68 method1529(int arg0, int arg1, boolean arg2) {
        field3653++;
        class68 var4 = (class68) class125.field2100.method1839((byte) 60, (long) (arg0 << 16 | this.field3660 | (arg2 ? 262144 : 0)));
        int var5 = 84 % ((-arg1 - 32) / 39);
        if (var4 != null) {
            return var4;
        }
        class22.field272.method935((byte) 31, this.field3660);
        class68 var6 = class273.method1842(-85, 0, class22.field272, this.field3660);
        if (var6 != null) {
            var6.method531(class58.field813, class274.field4418, class201.field3236);
            var6.field3438 = var6.field3434;
            var6.field3431 = var6.field3437;
            if (arg2) {
                var6.method542();
            }
            for (int var7 = 0; var7 < arg0; var7++) {
                var6.method539();
            }
            class125.field2100.method1830((long) (arg0 << 16 | this.field3660 | (arg2 ? 262144 : 0)), -109, var6);
        }
        return var6;
    }
}
