import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class196 extends class146 {

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "[I")
    public static int[] field3209 = new int[5];

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public int field3203;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public int field3206;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
    public int field3211;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
    public int field3212;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
    public int field3217;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "Lbf;")
    public static class102 field3200;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "Lkj;")
    public class114 field3207;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "Lkj;")
    public class114 field3213;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "Lsb;")
    public static class124 field3210;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "Ljava/lang/String;")
    public String field3202;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "Z")
    public boolean field3215;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "[Ljava/lang/Object;")
    public Object[] field3205;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public static final boolean method1336(boolean arg0, String arg1) {
        field3208++;
        if (arg0) {
            field3209 = null;
        }
        return class267.method1820(-115, true, arg1, 10);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static final void method1337(int arg0) {
        field3204++;
        int var1 = class224.field3569;
        int var2 = class267.field4274;
        int var3 = class66.field1088;
        int var4 = class190.field3121;
        int var5 = 6116423;
        class63.method493(var1, var2, var4, var3, var5);
        class63.method493(var1 + 1, var2 + 1, var4 - 2, 16, 0);
        class63.method492(var1 + 1, var2 - arg0, var4 - 2, var3 - 19, 0);
        class23.field362.method578(class139.field2332, var1 + 3, var2 + 14, var5, -1);
        int var6 = class165.field2719;
        int var7 = class269.field4311;
        for (int var8 = 0; var8 < class42.field776; var8++) {
            int var9 = (class42.field776 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var1 < var7 && var7 < var1 + var4 && (var9 - 13) < var6 && var6 < var9 + 3) {
                var10 = 16776960;
            }
            class23.field362.method578(class55.method447(-117, var8), var1 + 3, var9, var10, 0);
        }
        class180.method1271(class190.field3121, class66.field1088, class267.field4274, class224.field3569, 0);
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)V")
    public static final void method1338(byte arg0) {
        class178.field2964 = "welle2:";
        class32.field531 = "Lade...";
        class50.field926 = "M";
        client.field4582 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class75.field1231 = "Konfig geladen.";
        class27.field476 = "Verbindung abgebrochen.";
        class247.field3883 = " steht bereits auf deiner Freunde-Liste!";
        class33.field556 = "Lade Standardeinstellungen - ";
        class71.field1185 = "M";
        class76.field1248 = "Sprites geladen.";
        class237.field3739 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class124.field2081 = "Okay";
        class201.field3275 = "Hierhin gehen";
        class207.field3332 = "möchte mit dir handeln.";
        class9.field107 = "Ablegen";
        class223.field3552 = "rot:";
        client.field4580 = "Musik-Engine vorbereitet.";
        class23.field363 = "Wordpack geladen.";
        class47.field839 = "Bitte warte...";
        class111.field1720 = " steht bereits auf deiner Ignorieren-Liste!";
        class165.field2690 = "Titelbild geladen.";
        class65.field1068 = "Spielwelt erstellt.";
        class265.field4230 = "welle:";
        class8.field93 = "Stufe: ";
        class19.field282 = "Kampfstufe: ";
        class5.field67 = "blaugrün:";
        class240.field3788 = " loggt sich ein.";
        class59.field1021 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class32.field529 = "Untersuchen";
        class131.field2169 = "Benutzen";
        class206.field3316 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class285.field4549 = "Lade Schriftsätze - ";
        class91.field1443 = "Verbindung mit Update-Server...";
        class87.field1411 = "leuchten2:";
        class160.field2618 = "T";
        class224.field3577 = "gelb:";
        class253.field4033 = "Abbrechen";
        class185.field3041 = ": ";
        class96.field1497 = "Speicher wird zugewiesen.";
        class65.field1065 = "Versteckt";
        class5.field68 = " zuerst von deiner Freunde-Liste!";
        class230.field3664 = "Angreifen";
        class139.field2332 = "Wähl eine Option";
        class187.field3060 = " zuerst von deiner Ignorieren-Liste!";
        class216.field3458 = "scrollen:";
        class35.field591 = "Ladevorgang - bitte warte.";
        class156.field2541 = "Lade Konfiguration - ";
        class127.field2101 = "Spieler kann nicht gefunden werden: ";
        class105.field1607 = "Lade Wordpack - ";
        class91.field1440 = " weitere Optionen";
        class29.field508 = "Lade Benutzeroberfläche - ";
        class101.field1547 = "Fertigkeit: ";
        class36.field621 = " loggt sich aus.";
        class296.field4684 = "weiss:";
        class242.field3834 = "grün:";
        class18.field247 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class4.field51 = "Fallen lassen";
        class43.field781 = "schütteln:";
        class97.field1508 = "leuchten1:";
        class295.field4678 = "Lade Sprites - ";
        class256.field4074 = "Bitte entferne ";
        class256.field4077 = "blinken3:";
        class230.field3663 = "Gegenstand für Mitglieder";
        if (arg0 != 28) {
            field3200 = null;
        }
        class152.field2488 = "Schriftsätze geladen.";
        class160.field2612 = "Benutzeroberfläche geladen.";
        class244.field3858 = "Titelbild geöffnet.";
        field3214++;
        class211.field3390 = "Auswählen";
        class107.field1631 = "Lade Titelbild - ";
        class161.field2629 = "gleiten:";
        class239.field3760 = "Suche nach Updates - ";
        class184.field3036 = "Update-Liste geladen.";
        class138.field2314 = "Schließen";
        class277.field4403 = "Texturen geladen.";
        class82.field1364 = "Starte 3D-Softwarebibliothek.";
        class224.field3578 = "Lade Texturen - ";
        class11.field152 = "Liste der Welten geladen";
        class210.field3366 = "Lade Liste der Welten";
        class262.field4159 = "leuchten3:";
        class75.field1235 = "Bitte entferne ";
        class279.field4429 = "Eingabeprozedur geladen.";
        class241.field3795 = "Verbindung zum Update-Server hergestellt.";
        class228.field3635 = "RuneScape wird geladen - bitte warten...";
        class89.field1427 = "Zugewiesener Speicher.";
        class250.field3983 = "T";
        class3.field41 = "Standardinstellungen geladen";
        class23.field369 = "Nehmen";
        class112.field1732 = "blinken2:";
        class57.field1000 = "Weiter";
        class268.field4304 = "lila:";
        class220.field3527 = "blinken1:";
        class204.field3286 = "Hierhin drehen";
        class213.field3433 = "3D-Softwarebibliothek gestartet.";
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public static final void method1339(int arg0) {
        field3201++;
        if (arg0 != 424115814) {
            return;
        }
        int var1 = class266.field4245.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class266.field4245[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class119.field2017; var4++) {
                    if (class294.field4673[var4] == class268.field4291[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class294.field4673[class119.field2017] = class268.field4291[var2];
                    var3 = class119.field2017++;
                }
                int var5 = 0;
                class136 var6 = new class136(class266.field4245[var2]);
                while (class266.field4245[var2].length > var6.field2231 && var5 < 511) {
                    int var7 = var5++ << 6 | var3;
                    int var8 = var6.method996(arg0 ^ 0x19478166);
                    int var9 = var8 >> 14;
                    int var10 = var8 & 0x3F;
                    int var11 = (var8 & 0x1FAD) >> 7;
                    int var12 = (class268.field4291[var2] & 0xFF) * 64 + var10 - class170.field2787;
                    int var13 = (class268.field4291[var2] >> 8) * 64 + var11 - class256.field4082;
                    class165 var14 = class128.method932(-31, var6.method996(65280));
                    if (class3.field45[var7] == null && (var14.field2725 & 0x1) > 0 && class282.field4485 == var9 && var13 >= 0 && var13 + var14.field2682 < 104 && var12 >= 0 && var14.field2682 + var12 < 104) {
                        class3.field45[var7] = new class139();
                        class139 var15 = class3.field45[var7];
                        class287.field4587[class7.field88++] = var7;
                        var15.field2846 = class207.field3336;
                        var15.method1038(-15565, var14);
                        var15.method1229((byte) 8, var15.field2321.field2682);
                        var15.field2893 = var15.field2831 = class242.field3835[var15.field2321.field2694];
                        var15.field2891 = var15.field2321.field2724;
                        if (var15.field2891 == 0) {
                            var15.field2831 = 0;
                        }
                        var15.field2835 = var15.field2321.field2702;
                        var15.method1220((byte) 72, true, var13, var15.method1226((byte) -89), var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)V")
    public static void method1340(byte arg0) {
        int var1 = -60 % ((arg0 + 44) / 58);
        field3200 = null;
        field3209 = null;
        field3210 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method1341(byte arg0, String arg1) {
        if (arg0 < 125) {
            field3200 = null;
        }
        int var2 = arg1.length();
        field3216++;
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = ((var3 << 5) + class170.method1216(-3055, arg1.charAt(var4))) - var3;
        }
        return var3;
    }
}
