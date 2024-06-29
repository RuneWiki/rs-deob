import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class159 {

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "Lmk;")
    private class154 field2056;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "[I")
    public static int[] field2054 = new int[] { 0, 0, 0, 15, 0, 0, 0, 1, 0, 0, 0, 4, 6, 0, 0, 0, 0, 14, 0, 0, 0, 5, 10, 0, -1, -2, 0, 0, 8, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 6, 0, 11, 1, 0, -2, 8, 0, 0, 6, -1, 0, 0, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 14, 0, 20, 7, 0, 0, 0, 0, 0, 2, 2, 10, 0, 12, 0, 1, 0, 3, -2, 3, 0, 12, 0, 0, 2, 0, 0, 6, -2, 7, 3, 0, 7, 0, 8, -1, 0, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, -1, 0, -2, 0, 4, 2, 0, -2, -1, -2, 0, -1, 0, -2, 0, 0, 0, 0, 0, 8, 0, 0, 0, -1, 0, -1, 2, -1, 0, 0, 3, 10, 10, 6, 0, 3, 0, 0, 8, 0, -1, 0, 0, 28, 2, -1, 8, 0, 0, 3, 3, 0, 15, 0, 6, 0, 0, 0, 8, 0, 0, 6, 0, -1, -2, -2, 12, 9, 8, 5, 0, 0, 17, 0, 12, 0, 8, 0, 0, 0, 4, 1, -2, 0, 0, 1, 3, 5, 5, 0, 12, 0, 0, 0, 0, 0, 0, 0, -1, -2, 0, 0, 6, 0, 0, -1, 6, -1, 0, 0, 0, 6, 0, 0, 0, 2, 2, 0, 8, 7, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "Lgl;")
    private class338 field2059;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "Llh;")
    public static class450 field2055;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "[I")
    public static int[] field2058;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)Lgl;")
    public final class338 method861(int arg0) {
        field2057++;
        class338 var2 = this.field2056.field1942.field4505;
        if (this.field2056.field1942 == var2) {
            this.field2059 = null;
            return null;
        }
        this.field2059 = var2.field4505;
        if (arg0 < 1) {
            field2055 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)Lgl;")
    public final class338 method862(byte arg0) {
        field2050++;
        class338 var2 = this.field2059;
        if (this.field2056.field1942 == var2) {
            this.field2059 = null;
            return null;
        } else {
            int var3 = -8 % ((46 - arg0) / 62);
            this.field2059 = var2.field4505;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
    public static final void method863(int arg0) {
        class155.field1971 = "Titelbild geladen.";
        class350.field4890 = " weitere Optionen";
        class267.field3640 = "Lade Standardeinstellungen - ";
        class423.field6196 = "Lade Wordpack - ";
        class172.field2160 = " steht bereits auf deiner Freunde-Liste!";
        class213.field2887 = "leuchten1:";
        class12.field113 = "Benutzen";
        class230.field3170 = "Konfig geladen.";
        class57.field575 = "T";
        class201.field2695 = "Lade Benutzeroberfläche - ";
        class27.field255 = "Verbindung zum Update-Server hergestellt.";
        class305.field4135 = "Angreifen";
        class181.field2278 = "RuneScape wird geladen - bitte warten...";
        class7.field66 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class434.field6349 = "Untersuchen";
        class40.field411 = "Spielwelt erstellt.";
        class337.field4499 = "Ladevorgang - bitte warte.";
        class312.field4201 = "leuchten2:";
        class1.field6 = "Weiter";
        class208.field2832 = "Hierhin gehen";
        class153.field1930 = "Zugewiesener Speicher.";
        class209.field2839 = "Fallen lassen";
        class396.field5698 = "Wordpack geladen.";
        class259.field3518 = "Titelbild geöffnet.";
        class87.field990 = "scrollen:";
        class8.field72 = "Bitte warte...";
        class250.field3433 = "blinken2:";
        class282.field3870 = "Starte 3D-Softwarebibliothek.";
        class18.field176 = "Ablegen";
        class236.field3256 = "Bitte entferne ";
        class228.field3151 = "Liste der Welten geladen";
        class206.field2786 = "Musik-Engine vorbereitet.";
        class263.field3596 = "Sprites geladen.";
        class380.field5426 = "Lade Schriftsätze - ";
        class444.field6484 = "blaugrün:";
        class101.field1196 = "Update-Liste geladen.";
        class246.field3329 = "Lade Titelbild - ";
        class243.field3307 = "Lade Konfiguration - ";
        class451.field6567 = "Spieler kann nicht gefunden werden: ";
        if (arg0 != 23910) {
            method866((byte) -19);
        }
        class32.field307 = "welle2:";
        class232.field3193 = "Fertigkeit: ";
        class246.field3332 = " loggt sich aus.";
        class396.field5709 = "Versteckt";
        class386.field5500 = "Mechscape wird geladen - bitte warten...";
        class366.field5131 = "Stufe: ";
        class88.field1000 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class366.field5121 = "lila:";
        class132.field1702 = "weiss:";
        class57.field586 = "Kampfstufe: ";
        class65.field677 = "T";
        class395.field5694 = "welle:";
        class382.field5444 = "Client-Variablen geladen";
        class260.field3548 = "Hierhin drehen";
        class428.field6282 = "Auswählen";
        class269.field3655 = "blinken3:";
        class320.field4286 = "Wähl eine Option";
        class193.field2438 = "gelb:";
        class301.field4111 = "Lade...";
        class183.field2332 = "Benutzeroberfläche geladen.";
        class366.field5128 = " zuerst von deiner Ignorieren-Liste!";
        class72.field790 = " zuerst von deiner Freunde-Liste!";
        class249.field3363 = "Speicher wird zugewiesen.";
        class317.field4229 = "M";
        class58.field592 = "Verbindung abgebrochen.";
        class115.field1439 = "blinken1:";
        class184.field2337 = " loggt sich ein.";
        class32.field313 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class116.field1451 = "Schriftsätze geladen.";
        class195.field2636 = "Verbindung mit Update-Server...";
        class335.field4466 = "Lade Sprites - ";
        class374.field5264 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class98.field1159 = "Lade Texturen - ";
        class2.field21 = "schütteln:";
        field2051++;
        class380.field5424 = "Abbrechen";
        class10.field93 = "Texturen geladen.";
        class268.field3651 = "Lade Liste der Welten";
        class143.field1837 = "Bitte entferne ";
        class1.field7 = "Standardeinstellungen geladen";
        class175.field2196 = "Nehmen";
        class38.field399 = "Gegenstand für Mitglieder";
        class229.field3156 = "Eingabeprozedur geladen.";
        class69.field728 = "grün:";
        class110.field1359 = "rot:";
        class168.field2129 = "Schließen";
        class83.field928 = "Okay";
        class352.field4927 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class270.field3663 = "Suche nach Updates - ";
        class388.field5544 = "3D-Softwarebibliothek gestartet.";
        class411.field5946 = " steht bereits auf deiner Ignorieren-Liste!";
        class368.field5160 = "gleiten:";
        class448.field6517 = "M";
        class296.field4035 = "leuchten3:";
        class51.field489 = ": ";
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILvm;)V")
    public static final void method864(int arg0, class322 arg1) {
        field2052++;
        if (class244.field3323 < 2 && class171.field2155 == 0 && !class65.field682) {
            return;
        }
        String var2;
        if (class171.field2155 == 1 && class244.field3323 < 2) {
            var2 = class12.field113 + class51.field489 + class114.field1425 + " ->";
        } else if (class65.field682 && class244.field3323 < 2) {
            var2 = class132.field1699 + class51.field489 + class77.field874 + " ->";
        } else if (class259.field3519 && class249.field3361[81] && class244.field3323 > 2) {
            var2 = class83.method452((class405) class342.field4577.field1942.field4506.field4506, 14963);
        } else {
            class405 var3 = (class405) class342.field4577.field1942.field4506;
            var2 = class83.method452(var3, 14963);
            int[] var4 = null;
            if (class306.method1798(var3.field5892, 9055)) {
                var4 = class65.method368((int) var3.field5891, -120).field1543;
            } else if (class293.method1725((byte) 46, var3.field5892)) {
                class91 var5 = class38.field397[(int) var3.field5891];
                if (var5 != null) {
                    var4 = var5.field1035.field4655;
                }
            } else if (class376.method2259((byte) -59, var3.field5892)) {
                if (var3.field5892 == 1010) {
                    var4 = class281.method1655((byte) -28, (int) var3.field5891).field3068;
                } else {
                    var4 = class281.method1655((byte) -28, (int) (var3.field5891 >>> 32 & 0x7FFFFFFFL)).field3068;
                }
            }
            if (var4 != null) {
                var2 = var2 + client.method1409((byte) -29, var4);
            }
        }
        if (arg0 != -4) {
            field2058 = null;
        }
        if (class244.field3323 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class244.field3323 - 2) + class350.field4890;
        }
        if (class56.field562 != null) {
            class298 var7 = class56.field562.method1048(true, arg1);
            if (var7 == null) {
                var7 = class291.field3957;
            }
            var7.method1749(class168.field2128, arg0 + 4, class56.field562.field2590, class130.field1673, class183.field2336, class56.field562.field2591, class56.field562.field2460, class63.field659, class56.field562.field2501, class210.field2848, class335.field4469, var2, class164.field2097, class56.field562.field2560, class56.field562.field2563);
            class136.method735(false, class164.field2097[3], class164.field2097[2], class164.field2097[0], class164.field2097[1]);
        } else if (class182.field2311 != null && class62.field636 == 0) {
            int var6 = class291.field3957.method1757(class183.field2334 + 16, var2, 16777215, class130.field1673, 0, class335.field4469, class210.field2848, class183.field2336, class323.field4314 + 4, arg0 ^ 0x52);
            class136.method735(false, 16, class111.field1385.method2526(var2, 160) + var6, class323.field4314 - -4, class183.field2334);
            return;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILmk;)V")
    public final void method865(int arg0, class154 arg1) {
        if (arg0 != 0) {
            field2055 = null;
        }
        field2060++;
        this.field2056 = arg1;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
    public class159() {
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V")
    public static void method866(byte arg0) {
        field2054 = null;
        field2058 = null;
        int var1 = -116 / ((-arg0 - 5) / 33);
        field2055 = null;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lmk;)V")
    public class159(class154 arg0) {
        this.field2056 = arg0;
    }
}
