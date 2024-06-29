import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class305 extends class35 {

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "[I")
    public static int[] field4615 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    public static int field4621 = 0;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    public static int field4619 = -1;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
    public static int field4623 = 0;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    public static int field4620 = 2;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "J")
    public long field4610;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "Loj;")
    public static class283 field4612;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "Lvd;")
    public class305 field4611;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "Lvd;")
    public class305 field4614;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "Lpg;")
    public static class319 field4613;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "Ljava/lang/String;")
    public static String field4624;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V", line = 5)
    public static void method2020(boolean arg0) {
        field4624 = null;
        field4613 = null;
        field4612 = null;
        if (arg0) {
            method2023((String) null, 124);
        }
        field4615 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(CB)Z", line = 23)
    public static final boolean method2021(char arg0, byte arg1) {
        int var2 = -52 / ((-arg1 - 70) / 39);
        field4622++;
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V", line = 36)
    public static final void method2022(int arg0) {
        class307.field4646 = "Bitte warte...";
        class85.field1601 = "Suche nach Updates - ";
        class69.field1475 = " steht bereits auf deiner Ignorieren-Liste!";
        class123.field2127 = "gelb:";
        class183.field2929 = "schütteln:";
        class166.field2677 = "Bitte entferne ";
        class21.field450 = "Update-Liste geladen.";
        class103.field1780 = "Abbrechen";
        class61.field1182 = "Eingabeprozedur geladen.";
        class185.field3017 = "Sprites geladen.";
        class38.field736 = "Lade Titelbild - ";
        class42.field807 = "lila:";
        class94.field1693 = "Benutzen";
        class247.field3830 = "Texturen geladen.";
        class179.field2878 = "blinken3:";
        if (arg0 != 2) {
            field4612 = (class283) null;
        }
        class219.field3469 = "Bitte entferne ";
        class155.field2527 = "leuchten2:";
        class240.field3757 = "leuchten3:";
        class344.field5344 = "Lade Benutzeroberfläche - ";
        class228.field3602 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class80.field1570 = "Schließen";
        class180.field2901 = " steht bereits auf deiner Freunde-Liste!";
        class86.field1624 = " loggt sich ein.";
        class239.field3735 = "Hierhin gehen";
        class24.field479 = "blaugrün:";
        class210.field3385 = "grün:";
        class147.field2410 = "M";
        class259.field4033 = "Lade Schriftsätze - ";
        class125.field2165 = "blinken1:";
        class219.field3478 = "Ladevorgang - bitte warte.";
        class136.field2287 = "Spielwelt erstellt.";
        class319.field4867 = "scrollen:";
        class162.field2614 = "Titelbild geöffnet.";
        class227.field3585 = "Fertigkeit: ";
        class256.field4000 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class106.field1836 = "Gegenstand für Mitglieder";
        class41.field792 = "leuchten1:";
        class216.field3457 = " weitere Optionen";
        class329.field5048 = "Lade Konfiguration - ";
        class212.field3406 = "Nehmen";
        class128.field2194 = "Weiter";
        class268.field4122 = "welle2:";
        class80.field1576 = " zuerst von deiner Ignorieren-Liste!";
        class253.field3961 = " zuerst von deiner Freunde-Liste!";
        class118.field2062 = "möchte mit dir handeln.";
        class294.field4498 = "Lade Liste der Welten";
        class226.field3580 = "Untersuchen";
        class31.field645 = "M";
        client.field911 = "blinken2:";
        class322.field4899 = "Lade Sprites - ";
        class294.field4491 = "Konfig geladen.";
        class235.field3691 = "Verbindung abgebrochen.";
        class104.field1798 = "rot:";
        class90.field1662 = "Lade Standardeinstellungen - ";
        class18.field332 = "Fallen lassen";
        class101.field1777 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        field4617++;
        class70.field1487 = "Musik-Engine vorbereitet.";
        class256.field4004 = "Standardinstellungen geladen";
        class211.field3393 = "Spieler kann nicht gefunden werden: ";
        class68.field1322 = "Versteckt";
        class171.field2763 = "Hierhin drehen";
        class283.field4372 = "Schriftsätze geladen.";
        class169.field2729 = "Kampfstufe: ";
        class203.field3306 = "Ablegen";
        class64.field1232 = "Angreifen";
        class112.field1978 = "3D-Softwarebibliothek gestartet.";
        class52.field1045 = ": ";
        class123.field2131 = "Lade Texturen - ";
        class226.field3578 = " loggt sich aus.";
        class150.field2455 = "Lade Wordpack - ";
        class148.field2430 = "Lade...";
        class81.field1579 = "Auswählen";
        class46.field958 = "weiss:";
        class119.field2077 = "T";
        class59.field1165 = "Okay";
        class116.field2047 = "Verbindung mit Update-Server...";
        class227.field3590 = "Titelbild geladen.";
        class41.field785 = "Benutzeroberfläche geladen.";
        class93.field1679 = "Stufe: ";
        class165.field2657 = "Wordpack geladen.";
        class277.field4253 = "gleiten:";
        class123.field2132 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class342.field5320 = "Zugewiesener Speicher.";
        class197.field3175 = "Starte 3D-Softwarebibliothek.";
        class334.field5129 = "T";
        class330.field5059 = "Wähl eine Option";
        class148.field2427 = "Speicher wird zugewiesen.";
        class42.field810 = "Liste der Welten geladen";
        class67.field1273 = "welle:";
        class134.field2258 = "Verbindung zum Update-Server hergestellt.";
        class135.field2270 = "RuneScape wird geladen - bitte warten...";
        class345.field5352 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 371)
    public static final void method2023(String arg0, int arg1) {
        field4616++;
        int var2 = class303.method2016(arg0, false);
        if (var2 != -1) {
            int[] var3 = class104.field1803.method2274(class222.field3517.field3665[var2] & 0x3FFF, class222.field3517.field3665[var2] >> 28 & 0x3, (class222.field3517.field3665[var2] & 0xFFFD507) >> 14, true);
            class256.method1714(-18606, var3[1], var3[2]);
            int var4 = -2 % ((62 - arg1) / 44);
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V", line = 394)
    public final void method2024(int arg0) {
        field4618++;
        if (this.field4614 == null) {
            return;
        }
        if (arg0 != 0) {
            field4613 = (class319) null;
        }
        this.field4614.field4611 = this.field4611;
        this.field4611.field4614 = this.field4614;
        this.field4611 = null;
        this.field4614 = null;
    }
}
