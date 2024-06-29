import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public abstract class class292 {

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "Ldf;")
    public static class177 field4542 = new class177(16);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "[I")
    public static int[] field4540;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)Ltk;", line = 5)
    public static final class281 method2110(int arg0, byte arg1) {
        field4543++;
        class281 var2 = (class281) class294.field4576.method654(-109, (long) arg0);
        if (arg1 < 0) {
            method2110(59, (byte) 31);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class309.field4778.method187(class212.method1565(arg0, (byte) -16), class192.method1464(true, arg0), -1);
        class281 var4 = new class281();
        var4.field4336 = arg0;
        if (var3 != null) {
            var4.method2048(new class25(var3), -48);
        }
        class294.field4576.method652(120, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 30)
    public static final void method2111(int arg0) {
        class209.field3219 = "Hierhin gehen";
        class278.field4293 = "blaugrün:";
        class79.field1146 = "Hierhin drehen";
        class284.field4410 = "Lade Sprites - ";
        class297.field4601 = "schütteln:";
        class344.field5477 = "Benutzeroberfläche geladen.";
        field4541++;
        class268.field4134 = "Ladevorgang - bitte warte.";
        class340.field5232 = "Bitte entferne ";
        class15.field249 = "Gegenstand für Mitglieder";
        class238.field3688 = "M";
        class350.field5559 = "Musik-Engine vorbereitet.";
        class165.field2628 = "Lade Standardeinstellungen - ";
        class222.field3455 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class255.field3933 = "Lade Texturen - ";
        class287.field4457 = "T";
        class271.field4190 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class178.field2802 = " loggt sich aus.";
        class143.field2350 = "Benutzen";
        class178.field2807 = "Update-Liste geladen.";
        class203.field3147 = "Angreifen";
        class162.field2577 = "Standardeinstellungen geladen";
        class149.field2443 = "Ablegen";
        class184.field2893 = "T";
        class311.field4840 = "Stufe: ";
        class238.field3680 = "3D-Softwarebibliothek gestartet.";
        class58.field906 = "Bitte entferne ";
        class194.field3065 = "Wordpack geladen.";
        class123.field1971 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class174.field2762 = "Weiter";
        class268.field4132 = "rot:";
        class353.field5638 = "welle:";
        class263.field4096 = "Verbindung zum Update-Server hergestellt.";
        class173.field2754 = "Fertigkeit: ";
        class335.field5125 = " zuerst von deiner Freunde-Liste!";
        class79.field1142 = "blinken1:";
        class261.field4000 = "Okay";
        class153.field2489 = "Speicher wird zugewiesen.";
        class277.field4285 = "gleiten:";
        class108.field1625 = " loggt sich ein.";
        class277.field4281 = "Titelbild geladen.";
        class94.field1440 = "Zugewiesener Speicher.";
        class158.field2529 = "Liste der Welten geladen";
        class190.field2991 = " steht bereits auf deiner Freunde-Liste!";
        class313.field4847 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class10.field136 = "Konfig geladen.";
        class9.field133 = "Versteckt";
        class82.field1190 = "Lade Konfiguration - ";
        class177.field2794 = "Auswählen";
        class314.field4857 = "Spieler kann nicht gefunden werden: ";
        class87.field1252 = "Nehmen";
        class94.field1441 = "leuchten1:";
        class280.field4322 = "Kampfstufe: ";
        class123.field1979 = "Abbrechen";
        class186.field2930 = " steht bereits auf deiner Ignorieren-Liste!";
        class222.field3450 = "Wähl eine Option";
        class208.field3204 = "blinken2:";
        class352.field5627 = "RuneScape wird geladen - bitte warten...";
        class140.field2335 = "leuchten2:";
        class93.field1402 = "Starte 3D-Softwarebibliothek.";
        class284.field4397 = "scrollen:";
        class310.field4798 = "M";
        class340.field5231 = "welle2:";
        class350.field5582 = " zuerst von deiner Ignorieren-Liste!";
        class120.field1876 = "Suche nach Updates - ";
        class279.field4306 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class311.field4838 = "gelb:";
        class171.field2729 = "Untersuchen";
        class126.field2109 = "Fallen lassen";
        class224.field3501 = "blinken3:";
        class134.field2246 = "Lade Liste der Welten";
        class128.field2123 = "Schriftsätze geladen.";
        class239.field3719 = " weitere Optionen";
        class45.field716 = "Verbindung mit Update-Server...";
        class311.field4822 = ": ";
        class185.field2903 = "lila:";
        class161.field2569 = "grün:";
        class175.field2770 = "weiss:";
        class353.field5635 = "Eingabeprozedur geladen.";
        class49.field778 = "Titelbild geöffnet.";
        class279.field4307 = "Verbindung abgebrochen.";
        class6.field76 = "Lade Titelbild - ";
        class199.field3098 = "Lade...";
        client.field1837 = "Spielwelt erstellt.";
        class206.field3169 = "Lade Benutzeroberfläche - ";
        class120.field1871 = "Schließen";
        class309.field4774 = "Texturen geladen.";
        class163.field2598 = "leuchten3:";
        class223.field3471 = "Lade Schriftsätze - ";
        class31.field483 = "Mechscape wird geladen - bitte warten...";
        if (arg0 == 253) {
            class46.field737 = "Bitte warte...";
            class217.field3403 = "Sprites geladen.";
            class115.field1771 = "Lade Wordpack - ";
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V", line = 304)
    public static final void method2112(int arg0, int arg1, int arg2) {
        class194.field3054++;
        field4539++;
        class99.field1491.method1628((byte) -77, 253);
        class99.field1491.method315(arg0, 120);
        class99.field1491.method263(arg1, false);
        if (arg2 >= -45) {
            field4542 = (class177) null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIII)V", line = 325)
    public static final void method2113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4538++;
        if (arg5 > -122 || class284.field4385 < arg3 || arg4 < class328.field5042) {
            return;
        }
        boolean var6;
        if (arg1 < class43.field693) {
            arg1 = class43.field693;
            var6 = false;
        } else if (class128.field2130 < arg1) {
            var6 = false;
            arg1 = class128.field2130;
        } else {
            var6 = true;
        }
        boolean var7;
        if (class43.field693 > arg2) {
            var7 = false;
            arg2 = class43.field693;
        } else if (class128.field2130 < arg2) {
            arg2 = class128.field2130;
            var7 = false;
        } else {
            var7 = true;
        }
        if (arg3 >= class328.field5042) {
            class283.method2059(arg0, class133.field2235[arg3++], (byte) 114, arg2, arg1);
        } else {
            arg3 = class328.field5042;
        }
        if (arg4 <= class284.field4385) {
            class283.method2059(arg0, class133.field2235[arg4--], (byte) 99, arg2, arg1);
        } else {
            arg4 = class284.field4385;
        }
        if (var6 && var7) {
            for (int var8 = arg3; var8 <= arg4; var8++) {
                int[] var9 = class133.field2235[var8];
                var9[arg1] = var9[arg2] = arg0;
            }
        } else if (var6) {
            for (int var10 = arg3; var10 <= arg4; var10++) {
                class133.field2235[var10][arg1] = arg0;
            }
        } else if (var7) {
            for (int var11 = arg3; var11 <= arg4; var11++) {
                class133.field2235[var11][arg2] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lrn;Lrn;ILrn;)V", line = 434)
    public static final void method2114(class18 arg0, class18 arg1, int arg2, class18 arg3) {
        field4544++;
        if (arg2 > 15) {
            class222.field3446 = arg0;
            class327.field5025 = arg3;
            class163.field2587 = arg1;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V", line = 457)
    public static void method2115(int arg0) {
        if (arg0 > -102) {
            method2113(-51, -6, 36, 64, 86, 65);
        }
        field4542 = null;
        field4540 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method316(byte arg0, Component arg1);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)I")
    public abstract int method317(byte arg0);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method318(Component arg0, int arg1);
}
