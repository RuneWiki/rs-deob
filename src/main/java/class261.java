import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class261 {

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "Z")
    public boolean field4404 = false;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "Ljl;")
    public static class332 field4394 = new class332(2);

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field4399 = -1;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "[Lqm;")
    public static class227[] field4401 = new class227[2048];

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "F")
    public static float field4396 = 0.0F;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "[Lne;")
    public static class90[] field4402 = new class90[29];

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field4395 = 2301979;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4406 = "Ok";

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public int field4388;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public int field4390;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "[I")
    public static int[] field4403;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBZ)Llb;", line = 7)
    public final class341 method1989(int arg0, byte arg1, boolean arg2) {
        if (arg1 != -9) {
            this.field4390 = 4;
        }
        class341 var4 = (class341) class46.field745.method2329((byte) 107, (long) ((arg2 ? 262144 : 0) | arg0 << 16 | this.field4388));
        field4398++;
        if (var4 != null) {
            return var4;
        }
        class86.field1465.method452(this.field4388, (byte) -128);
        class341 var5 = class201.method1543(false, class86.field1465, this.field4388, 0);
        if (var5 != null) {
            var5.method2399(class326.field5184, class46.field747, class22.field269);
            var5.field4644 = var5.field4649;
            var5.field4642 = var5.field4652;
            if (arg2) {
                var5.method2409();
            }
            for (int var6 = 0; var6 < arg0; var6++) {
                var5.method2400();
            }
            class46.field745.method2333((long) (this.field4388 | arg0 << 16 | (arg2 ? 262144 : 0)), 0, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lqm;BI)V", line = 48)
    public final void method1990(class227 arg0, byte arg1, int arg2) {
        field4397++;
        if (arg1 <= 8) {
            field4402 = (class90[]) null;
        }
        while (true) {
            int var4 = arg0.method1720((byte) -95);
            if (var4 == 0) {
                return;
            }
            this.method1993(var4, arg2, arg0, -119);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I[BZI)I", line = 73)
    public static final int method1991(int arg0, byte[] arg1, boolean arg2, int arg3) {
        if (!arg2) {
            return 39;
        }
        int var4 = -1;
        field4392++;
        for (int var5 = arg0; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class41.field599[(var4 ^ arg1[var5]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V", line = 95)
    public static final void method1992(boolean arg0) {
        class324.field5159 = "Titelbild geöffnet.";
        class327.field5191 = "Ablegen";
        class236.field3916 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class318.field5067 = "Schließen";
        class329.field5223 = "M";
        class7.field69 = "lila:";
        class152.field2411 = "Lade Wordpack - ";
        class102.field1662 = "Verbindung abgebrochen.";
        class298.field4789 = " loggt sich ein.";
        class300.field4841 = "Mechscape wird geladen - bitte warten...";
        class213.field3396 = "Benutzeroberfläche geladen.";
        class254.field4282 = "blinken2:";
        class104.field1689 = "Abbrechen";
        class182.field2928 = "Gegenstand für Mitglieder";
        class245.field4029 = "Kampfstufe: ";
        class222.field3676 = " weitere Optionen";
        class169.field2693 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class322.field5131 = "Lade Liste der Welten";
        class211.field3373 = "Lade Titelbild - ";
        class117.field1981 = "Verbindung mit Update-Server...";
        class258.field4338 = "blinken3:";
        class116.field1948 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class271.field4505 = "Musik-Engine vorbereitet.";
        class201.field3203 = "leuchten1:";
        class121.field2058 = "Nehmen";
        class278.field4579 = "Speicher wird zugewiesen.";
        class102.field1663 = "rot:";
        class56.field940 = "Fertigkeit: ";
        class201.field3206 = "leuchten3:";
        class65.field1161 = "Schriftsätze geladen.";
        class270.field4493 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        if (!arg0) {
            field4405 = -110;
        }
        class40.field592 = "Versteckt";
        class172.field2747 = "Angreifen";
        class173.field2760 = " steht bereits auf deiner Ignorieren-Liste!";
        class131.field2234 = "Lade Texturen - ";
        class163.field2577 = "3D-Softwarebibliothek gestartet.";
        class251.field4243 = "Standardeinstellungen geladen";
        class209.field3284 = "Wähl eine Option";
        class347.field5521 = "schütteln:";
        class257.field4314 = "welle2:";
        class160.field2548 = "RuneScape wird geladen - bitte warten...";
        class79.field1368 = "Stufe: ";
        class313.field4972 = "Wordpack geladen.";
        class140.field2301 = "Konfig geladen.";
        class295.field4755 = "Spieler kann nicht gefunden werden: ";
        class46.field748 = "M";
        class124.field2124 = "Update-Liste geladen.";
        class183.field2951 = " zuerst von deiner Ignorieren-Liste!";
        class326.field5181 = "leuchten2:";
        class52.field861 = "weiss:";
        class76.field1321 = "Texturen geladen.";
        class350.field5562 = "Suche nach Updates - ";
        class75.field1273 = "Fallen lassen";
        class350.field5559 = "gelb:";
        field4400++;
        class285.field4659 = "grün:";
        class352.field5583 = "T";
        class148.field2373 = "Ladevorgang - bitte warte.";
        class11.field93 = "Lade Schriftsätze - ";
        class245.field4017 = "Titelbild geladen.";
        class74.field1260 = "Hierhin gehen";
        class135.field2257 = "Lade Standardeinstellungen - ";
        class117.field1953 = "Benutzen";
        class272.field4519 = "Weiter";
        class71.field1238 = "Auswählen";
        class258.field4346 = "Verbindung zum Update-Server hergestellt.";
        class113.field1855 = "T";
        class355.field5637 = "scrollen:";
        class347.field5524 = "Lade...";
        class335.field5301 = "Bitte entferne ";
        class253.field4272 = " loggt sich aus.";
        class138.field2277 = "Starte 3D-Softwarebibliothek.";
        class247.field4041 = ": ";
        class160.field2547 = " zuerst von deiner Freunde-Liste!";
        class325.field5162 = "Lade Konfiguration - ";
        class54.field901 = "Spielwelt erstellt.";
        class54.field898 = "gleiten:";
        class298.field4781 = "Eingabeprozedur geladen.";
        class335.field5303 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class206.field3249 = "Sprites geladen.";
        class204.field3228 = "Zugewiesener Speicher.";
        class7.field67 = "Lade Benutzeroberfläche - ";
        class191.field3055 = "welle:";
        class176.field2819 = "Hierhin drehen";
        class215.field3439 = "blinken1:";
        field4406 = "Okay";
        class327.field5198 = "Untersuchen";
        class2.field15 = "Liste der Welten geladen";
        class350.field5570 = "Lade Sprites - ";
        class129.field2186 = "Bitte warte...";
        class231.field3840 = " steht bereits auf deiner Freunde-Liste!";
        class230.field3832 = "Bitte entferne ";
        class127.field2157 = "blaugrün:";
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILqm;I)V", line = 370)
    private final void method1993(int arg0, int arg1, class227 arg2, int arg3) {
        if (arg0 == 1) {
            this.field4388 = arg2.method1765(true);
        } else if (arg0 == 2) {
            this.field4390 = arg2.method1736(255);
        } else if (arg0 == 3) {
            this.field4404 = true;
        } else if (arg0 == 4) {
            this.field4388 = -1;
        }
        field4391++;
        if (arg3 > -71) {
            field4399 = -93;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I[B)Lpd;", line = 408)
    public static final class290 method1994(int arg0, byte[] arg1) {
        field4393++;
        if (arg0 <= 42) {
            return (class290) null;
        } else if (arg1 == null) {
            return null;
        } else {
            class290 var2 = new class290(arg1, class189.field3035, class19.field211, class221.field3595, class322.field5132, class163.field2578);
            class211.method1592((byte) 41);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V", line = 426)
    public static void method1995(byte arg0) {
        field4394 = null;
        field4402 = null;
        int var1 = 55 % ((-arg0) / 58);
        field4406 = null;
        field4403 = null;
        field4401 = null;
    }
}
