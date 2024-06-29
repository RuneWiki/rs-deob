import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class76 {

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "Lcd;")
    public static class69 field1064 = new class69(32);

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "[I")
    public static int[] field1066 = new int[2000];

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field1067 = 0;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Lak;")
    public static class172 field1061;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjj;I)Ljava/lang/String;", line = 6)
    public static final String method514(int arg0, class44 arg1, int arg2) {
        field1063++;
        try {
            int var3 = arg1.method281(-69);
            if (var3 > arg0) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg1.field586 += class18.field254.method971(var3, arg1.field586, arg2, arg1.field573, var4, (byte) 127);
            return class302.method2156(var3, 0, -69, var4);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)[B", line = 33)
    public static final synchronized byte[] method515(int arg0, int arg1) {
        if (arg0 != 0) {
            field1066 = (int[]) null;
        }
        field1059++;
        if (arg1 == 100 && class240.field3817 > 0) {
            byte[] var2 = class25.field351[--class240.field3817];
            class25.field351[class240.field3817] = null;
            return var2;
        } else if (arg1 == 5000 && class52.field735 > 0) {
            byte[] var3 = class319.field4955[--class52.field735];
            class319.field4955[class52.field735] = null;
            return var3;
        } else if (arg1 == 30000 && class265.field4292 > 0) {
            byte[] var4 = class211.field3457[--class265.field4292];
            class211.field3457[class265.field4292] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V", line = 71)
    public static final void method516(byte arg0) {
        if (class49.field693 != null) {
            class49.field693.method2218(-80);
        }
        field1062++;
        if (arg0 != -51) {
            field1067 = -23;
        }
        if (class198.field3225 != null) {
            class198.field3225.method2218(-60);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V", line = 92)
    public static final void method517(int arg0) {
        class304.field4776 = "blinken2:";
        class110.field1629 = " loggt sich aus.";
        class33.field446 = "Lade...";
        class156.field2404 = "weiss:";
        class169.field2792 = " zuerst von deiner Freunde-Liste!";
        if (arg0 != -20869) {
            field1066 = (int[]) null;
        }
        class27.field376 = "gelb:";
        class259.field4149 = "Verbindung zum Update-Server hergestellt.";
        class159.field2633 = "leuchten1:";
        class274.field4422 = "Ablegen";
        class341.field5312 = "Schriftsätze geladen.";
        class73.field1028 = "Lade Wordpack - ";
        class117.field1776 = "scrollen:";
        class127.field1980 = "Nehmen";
        class287.field4594 = "Titelbild geöffnet.";
        class282.field4532 = "Standardinstellungen geladen";
        class169.field2786 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class286.field4591 = " weitere Optionen";
        class81.field1132 = "Abbrechen";
        class343.field5332 = ": ";
        class260.field4152 = "rot:";
        class316.field4887 = " zuerst von deiner Ignorieren-Liste!";
        class298.field4702 = "Update-Liste geladen.";
        class273.field4395 = "Weiter";
        class109.field1613 = "Stufe: ";
        class133.field2084 = "Lade Benutzeroberfläche - ";
        class80.field1117 = "Gegenstand für Mitglieder";
        class32.field427 = "Zugewiesener Speicher.";
        class319.field4957 = "grün:";
        class120.field1827 = "Spieler kann nicht gefunden werden: ";
        class261.field4172 = "Angreifen";
        class298.field4707 = "Verbindung mit Update-Server...";
        class330.field5087 = "T";
        class252.field4028 = "welle:";
        class116.field1762 = "Wähl eine Option";
        class167.field2769 = "Lade Liste der Welten";
        class158.field2619 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class151.field2329 = "schütteln:";
        class109.field1612 = "Eingabeprozedur geladen.";
        class57.field811 = "lila:";
        class160.field2643 = "Liste der Welten geladen";
        class97.field1383 = "Kampfstufe: ";
        class99.field1427 = "Bitte warte...";
        class103.field1513 = " loggt sich ein.";
        class127.field1992 = "Sprites geladen.";
        class2.field32 = "Lade Titelbild - ";
        class46.field640 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class58.field820 = "Fallen lassen";
        class288.field4611 = "M";
        class334.field5208 = "Texturen geladen.";
        class192.field3137 = "M";
        class32.field437 = "Versteckt";
        class282.field4536 = "Wordpack geladen.";
        class55.field773 = "leuchten3:";
        class246.field3895 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class108.field1598 = "Konfig geladen.";
        class146.field2276 = "Spielwelt erstellt.";
        class133.field2082 = "Hierhin gehen";
        class217.field3519 = "RuneScape wird geladen - bitte warten...";
        class187.field3086 = "gleiten:";
        class23.field315 = "Bitte entferne ";
        field1065++;
        class190.field3115 = "welle2:";
        class164.field2735 = "Speicher wird zugewiesen.";
        class116.field1766 = " steht bereits auf deiner Ignorieren-Liste!";
        class280.field4522 = "Lade Standardeinstellungen - ";
        class322.field4991 = "blinken3:";
        class284.field4547 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class179.field2968 = "Benutzeroberfläche geladen.";
        class172.field2862 = "blinken1:";
        class289.field4640 = "Starte 3D-Softwarebibliothek.";
        class168.field2778 = "blaugrün:";
        class55.field781 = "Musik-Engine vorbereitet.";
        class212.field3473 = "Schließen";
        class287.field4592 = "Lade Konfiguration - ";
        class196.field3194 = "Suche nach Updates - ";
        class57.field794 = "Bitte entferne ";
        class66.field954 = "T";
        class64.field925 = "Benutzen";
        class108.field1605 = "Ladevorgang - bitte warte.";
        class261.field4168 = "möchte mit dir handeln.";
        class106.field1575 = "Lade Texturen - ";
        class221.field3550 = "Titelbild geladen.";
        class94.field1288 = "Lade Schriftsätze - ";
        class103.field1509 = "3D-Softwarebibliothek gestartet.";
        class31.field411 = "Okay";
        class94.field1289 = " steht bereits auf deiner Freunde-Liste!";
        class284.field4541 = "Verbindung abgebrochen.";
        class323.field5028 = "Hierhin drehen";
        class338.field5273 = "Auswählen";
        class185.field3066 = "Lade Sprites - ";
        class127.field1987 = "leuchten2:";
        class21.field308 = "Fertigkeit: ";
        class63.field918 = "Untersuchen";
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)Z", line = 428)
    public static final boolean method518(int arg0) {
        if (arg0 == -19076) {
            field1058++;
            return class232.field3690 ? true : class14.field157;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)V", line = 446)
    public static final void method519(int arg0, int arg1) {
        field1060++;
        if (class263.method1875(107, arg0)) {
            if (arg1 != -23141) {
                field1067 = -48;
            }
            class316.method2225(-1, -1, class221.field3547[arg0]);
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V", line = 462)
    public static void method520(int arg0) {
        field1066 = null;
        field1061 = null;
        if (arg0 >= 75) {
            field1064 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIIBII)V", line = 476)
    public static final void method521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field1057++;
        if (arg7 != 89) {
            return;
        }
        class327 var10 = (class327) class273.field4399.method1240(arg7 - 86);
        class327 var11 = null;
        while (var10 != null) {
            if (var10.field5051 == arg2 && var10.field5060 == arg5 && var10.field5046 == arg3 && var10.field5058 == arg0) {
                var11 = var10;
                break;
            }
            var10 = (class327) class273.field4399.method1235(false);
        }
        if (var11 == null) {
            var11 = new class327();
            var11.field5046 = arg3;
            var11.field5051 = arg2;
            var11.field5058 = arg0;
            var11.field5060 = arg5;
            class66.method443(0, var11);
            class273.field4399.method1232(arg7 + 28, var11);
        }
        var11.field5062 = arg1;
        var11.field5055 = arg9;
        var11.field5045 = arg4;
        var11.field5048 = arg8;
        var11.field5056 = arg6;
    }
}
