import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class195 {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Ldd;")
    private class259 field2939 = new class259();

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "[I")
    public static int[] field2940 = new int[5];

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "Lhl;")
    public static class139 field2945 = new class139(50);

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "[I")
    public static int[] field2954 = new int[2];

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Ldd;")
    private class259 field2948;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2946;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "[[[I")
    public static int[][][] field2952;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZLca;)Ljava/lang/String;")
    public static final String method1311(int arg0, boolean arg1, class54 arg2) {
        field2951++;
        try {
            if (!arg1) {
                return null;
            }
            int var3 = arg2.method436(126);
            if (arg0 < var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg2.field887 += class209.field3128.method1865(arg2.field848, var4, var3, arg2.field887, 0, 2);
            return class258.method1742(var3, 35, var4, 0);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Ldd;")
    public final class259 method1312(byte arg0) {
        class259 var2 = this.field2939.field3972;
        if (arg0 >= -17) {
            field2945 = null;
        }
        field2943++;
        if (this.field2939 == var2) {
            return null;
        } else {
            var2.method1746(36);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I")
    public final int method1313(int arg0) {
        field2944++;
        class259 var2 = this.field2939.field3972;
        int var3 = 0;
        while (this.field2939 != var2) {
            var3++;
            var2 = var2.field3972;
        }
        if (arg0 != 27920) {
            field2954 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V")
    public static final void method1314(byte arg0) {
        class194.field2929 = "Spieler kann nicht gefunden werden: ";
        class256.field3950 = "Angreifen";
        class157.field2306 = "Titelbild geöffnet.";
        class51.field827 = "leuchten1:";
        class239.field3709 = "Lade Benutzeroberfläche - ";
        class117.field1763 = "Lade Liste der Welten";
        class113.field1735 = "möchte mit dir handeln.";
        class246.field3837 = ": ";
        class114.field1745 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class210.field3140 = "Liste der Welten geladen";
        class209.field3131 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class168.field2473 = "lila:";
        class7.field88 = "gleiten:";
        class64.field1071 = "Musik-Engine vorbereitet.";
        class293.field4440 = "Nehmen";
        class147.field2133 = "Verbindung abgebrochen.";
        class160.field2327 = "blaugrün:";
        class45.field783 = "Update-Liste geladen.";
        class182.field2650 = "leuchten3:";
        class212.field3257 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class123.field1819 = "Benutzen";
        class171.field2514 = "leuchten2:";
        class117.field1769 = "Fallen lassen";
        class285.field4377 = "M";
        if (arg0 != 87) {
            field2952 = null;
        }
        class185.field2689 = " loggt sich aus.";
        class223.field3472 = "Starte 3D-Softwarebibliothek.";
        class184.field2676 = "Benutzeroberfläche geladen.";
        class249.field3866 = "welle:";
        class186.field2712 = "Fertigkeit: ";
        class67.field1115 = "Konfig geladen.";
        class213.field3270 = " steht bereits auf deiner Ignorieren-Liste!";
        class174.field2553 = "M";
        class295.field4491 = "Ladevorgang - bitte warte.";
        class163.field2382 = "Verbindung zum Update-Server hergestellt.";
        class152.field2219 = "Versteckt";
        class126.field1859 = "Hierhin gehen";
        class30.field552 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class285.field4372 = "RuneScape wird geladen - bitte warten...";
        class42.field737 = " steht bereits auf deiner Freunde-Liste!";
        field2949++;
        class280.field4302 = "T";
        class194.field2938 = "Wähl eine Option";
        class20.field343 = "Lade Wordpack - ";
        class105.field1552 = "Verbindung mit Update-Server...";
        class123.field1829 = "3D-Softwarebibliothek gestartet.";
        class69.field1146 = "schütteln:";
        class176.field2586 = "Titelbild geladen.";
        class146.field2116 = "Kampfstufe: ";
        class110.field1644 = "Speicher wird zugewiesen.";
        class264.field4131 = "Schriftsätze geladen.";
        class32.field575 = "Bitte entferne ";
        class240.field3728 = " loggt sich ein.";
        class14.field203 = "Lade...";
        class12.field185 = "grün:";
        class7.field83 = "T";
        class292.field4434 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class16.field296 = "blinken1:";
        class239.field3683 = "Stufe: ";
        class12.field180 = "Hierhin drehen";
        class64.field1073 = "weiss:";
        class189.field2844 = "gelb:";
        class182.field2644 = "Schließen";
        class258.field3955 = " zuerst von deiner Freunde-Liste!";
        class24.field393 = "Gegenstand für Mitglieder";
        class105.field1554 = "Lade Konfiguration - ";
        class175.field2569 = "rot:";
        class36.field638 = "Sprites geladen.";
        class32.field568 = "Lade Sprites - ";
        class69.field1145 = "Lade Standardeinstellungen - ";
        class121.field1798 = "Spielwelt erstellt.";
        class175.field2571 = "Texturen geladen.";
        class210.field3141 = "Lade Schriftsätze - ";
        class91.field1380 = "blinken3:";
        class13.field189 = "Bitte warte...";
        class66.field1089 = "Weiter";
        class150.field2170 = " weitere Optionen";
        class167.field2466 = "Eingabeprozedur geladen.";
        class4.field50 = "Zugewiesener Speicher.";
        class6.field75 = "Bitte entferne ";
        class284.field4361 = " zuerst von deiner Ignorieren-Liste!";
        class76.field1215 = "Wordpack geladen.";
        class201.field3012 = "Ablegen";
        class115.field1752 = "blinken2:";
        class15.field223 = "Okay";
        class128.field1892 = "Untersuchen";
        class100.field1463 = "Standardinstellungen geladen";
        class240.field3737 = "Abbrechen";
        class109.field1616 = "Suche nach Updates - ";
        class7.field91 = "scrollen:";
        class7.field84 = "Lade Titelbild - ";
        class241.field3743 = "Auswählen";
        class90.field1372 = "welle2:";
        class140.field2025 = "Lade Texturen - ";
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLdd;)V")
    public final void method1315(byte arg0, class259 arg1) {
        if (arg0 != -48) {
            this.field2948 = null;
        }
        if (arg1.field3973 != null) {
            arg1.method1746(44);
        }
        arg1.field3973 = this.field2939.field3973;
        arg1.field3972 = this.field2939;
        arg1.field3973.field3972 = arg1;
        arg1.field3972.field3973 = arg1;
        field2953++;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class195() {
        this.field2939.field3973 = this.field2939;
        this.field2939.field3972 = this.field2939;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public static final void method1316(int arg0) {
        field2941++;
        if (arg0 >= -8) {
            method1319((byte) 38);
        }
        if (class258.field3961 != null) {
            class258.field3961.method810(76);
        }
        if (class182.field2648 != null) {
            class182.field2648.method810(47);
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)Ldd;")
    public final class259 method1317(int arg0) {
        field2942++;
        class259 var2 = this.field2948;
        if (arg0 != -3668) {
            return null;
        } else if (this.field2939 == var2) {
            this.field2948 = null;
            return null;
        } else {
            this.field2948 = var2.field3972;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)Ldd;")
    public final class259 method1318(byte arg0) {
        field2950++;
        if (arg0 > -82) {
            return null;
        }
        class259 var2 = this.field2939.field3972;
        if (this.field2939 == var2) {
            this.field2948 = null;
            return null;
        } else {
            this.field2948 = var2.field3972;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(B)V")
    public static void method1319(byte arg0) {
        if (arg0 <= 75) {
            field2954 = null;
        }
        field2946 = null;
        field2940 = null;
        field2952 = null;
        field2945 = null;
        field2954 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public final void method1320(boolean arg0) {
        while (true) {
            class259 var2 = this.field2939.field3972;
            if (this.field2939 == var2) {
                this.field2948 = null;
                if (arg0) {
                    field2954 = null;
                }
                field2947++;
                return;
            }
            var2.method1746(84);
        }
    }
}
