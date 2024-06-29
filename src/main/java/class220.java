import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class220 {

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field3121 = 0;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Lb;")
    public static class262 field3117;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Lbc;")
    public static class282 field3119;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "[[[I")
    public static int[][][] field3122;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static void method1427(byte arg0) {
        field3122 = null;
        field3119 = null;
        if (arg0 != -103) {
            field3122 = null;
        }
        field3117 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(CZ)B")
    public static final byte method1428(char arg0, boolean arg1) {
        if (!arg1) {
            field3122 = null;
        }
        field3115++;
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static final void method1429(int arg0) {
        class1.field20 = "Konfig geladen.";
        class212.field2971 = "Lade Standardeinstellungen - ";
        class120.field1718 = "Kampfstufe: ";
        class259.field3761 = "Lade Liste der Welten";
        class167.field2407 = "T";
        class79.field941 = "Schriftsätze geladen.";
        class206.field2929 = "Bitte warte...";
        class188.field2700 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class105.field1434 = "lila:";
        class146.field2151 = "schütteln:";
        class5.field66 = "Speicher wird zugewiesen.";
        class19.field237 = "Versteckt";
        class21.field251 = "Untersuchen";
        class150.field2184 = "Lade Benutzeroberfläche - ";
        field3124++;
        class279.field4243 = "leuchten2:";
        class26.field314 = "Benutzen";
        class156.field2257 = "Lade Texturen - ";
        class26.field304 = "Titelbild geladen.";
        class209.field2946 = "Lade Schriftsätze - ";
        class127.field1830 = "Verbindung zum Update-Server hergestellt.";
        class137.field2002 = "Lade Konfiguration - ";
        class241.field3504 = "Hierhin drehen";
        class202.field2867 = "T";
        class35.field407 = "blinken3:";
        class243.field3549 = "Titelbild geöffnet.";
        class55.field640 = " loggt sich aus.";
        class216.field3070 = "Lade Titelbild - ";
        class153.field2214 = "welle2:";
        class229.field3232 = "Wordpack geladen.";
        class228.field3222 = "Nehmen";
        class277.field4212 = "blinken2:";
        class146.field2153 = "Verbindung abgebrochen.";
        class235.field3390 = "Okay";
        class12.field156 = "scrollen:";
        class154.field2235 = "welle:";
        class105.field1430 = " steht bereits auf deiner Freunde-Liste!";
        class247.field3597 = "Abbrechen";
        class227.field3202 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class209.field2949 = "blaugrün:";
        class94.field1264 = "Fallen lassen";
        class152.field2204 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class74.field892 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class260.field3780 = "grün:";
        class23.field280 = "3D-Softwarebibliothek gestartet.";
        class159.field2308 = "Weiter";
        class93.field1253 = "Benutzeroberfläche geladen.";
        class180.field2554 = "Angreifen";
        class150.field2190 = "Hierhin gehen";
        class119.field1697 = " zuerst von deiner Ignorieren-Liste!";
        class140.field2028 = "Texturen geladen.";
        class258.field3758 = "Zugewiesener Speicher.";
        class115.field1595 = "Verbindung mit Update-Server...";
        class241.field3510 = " weitere Optionen";
        class157.field2272 = "Lade Wordpack - ";
        class259.field3762 = "weiss:";
        class246.field3582 = "M";
        class211.field2967 = "M";
        class193.field2769 = "möchte mit dir handeln.";
        class12.field157 = "gelb:";
        class257.field3729 = "rot:";
        class167.field2410 = "Fertigkeit: ";
        class11.field152 = "Ablegen";
        class280.field4258 = "Eingabeprozedur geladen.";
        class123.field1766 = " zuerst von deiner Freunde-Liste!";
        if (arg0 != 3937) {
            return;
        }
        class84.field1163 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class146.field2155 = "Musik-Engine vorbereitet.";
        class286.field4432 = "Spieler kann nicht gefunden werden: ";
        client.field4452 = "Schließen";
        class41.field502 = ": ";
        class131.field1890 = "Bitte entferne ";
        class98.field1313 = "Bitte entferne ";
        class164.field2349 = "Wähl eine Option";
        class61.field724 = "Stufe: ";
        class260.field3788 = "leuchten3:";
        class131.field1895 = " loggt sich ein.";
        class269.field3927 = "blinken1:";
        class168.field2418 = "Ladevorgang - bitte warte.";
        class122.field1733 = "Lade Sprites - ";
        class189.field2720 = "Sprites geladen.";
        class1.field3 = "RuneScape wird geladen - bitte warten...";
        class247.field3587 = " steht bereits auf deiner Ignorieren-Liste!";
        class91.field1234 = "Starte 3D-Softwarebibliothek.";
        class231.field3332 = "Auswählen";
        class123.field1769 = "Update-Liste geladen.";
        class124.field1789 = "leuchten1:";
        class212.field2975 = "Standardinstellungen geladen";
        class153.field2216 = "Liste der Welten geladen";
        class198.field2823 = "Gegenstand für Mitglieder";
        class259.field3775 = "gleiten:";
        class245.field3566 = "Spielwelt erstellt.";
        class70.field822 = "Lade...";
        class270.field3949 = "Suche nach Updates - ";
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
    public static final void method1430(byte arg0) {
        if (arg0 != -118) {
            method1434((byte) -74);
        }
        field3120++;
        class285.field4395.method67((byte) -122);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)V")
    public static final void method1431(int arg0, int arg1, int arg2) {
        class164.field2358[arg1] = arg0;
        field3118++;
        if (arg2 < 108) {
            method1429(-81);
        }
        class277 var3 = (class277) class26.field313.method1895((long) arg1, -128);
        if (var3 == null) {
            class277 var4 = new class277(class86.method509(false) + 500L);
            class26.field313.method1894(-1, var4, (long) arg1);
        } else {
            var3.field4206 = class86.method509(false) + 500L;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I")
    public static int method1432(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)V")
    public static final void method1433(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg0; var5 < class216.field3044; var5++) {
            if ((class182.field2618[var5] + class124.field1788[var5]) > arg3 && arg2 + arg3 > class182.field2618[var5] && (class247.field3595[var5] + class21.field259[var5]) > arg4 && class247.field3595[var5] < arg1 + arg4) {
                class163.field2341[var5] = true;
            }
        }
        field3123++;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V")
    public static final void method1434(byte arg0) {
        field3114++;
        for (class116 var1 = (class116) class72.field865.method1532(-67); var1 != null; var1 = (class116) class72.field865.method1523(-121)) {
            if (var1.field1626) {
                var1.method750(101);
            }
        }
        if (arg0 < 115) {
            method1428('\u0014', true);
        }
        for (class116 var2 = (class116) class254.field3665.method1532(-75); var2 != null; var2 = (class116) class254.field3665.method1523(-128)) {
            if (var2.field1626) {
                var2.method750(101);
            }
        }
    }
}
