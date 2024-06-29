import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class262 {

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "Lb;")
    private class84 field4104 = new class84();

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    private int field4101;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    private int field4099;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Lll;")
    private class211 field4097;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field4098 = 0;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field4100 = 0;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field4093 = 0;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "Lqd;")
    public static class3 field4088;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "[La;")
    public static class49[] field4096;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)I")
    public final int method1775(int arg0) {
        field4087++;
        int var2 = 0;
        if (arg0 != 17216) {
            field4098 = 54;
        }
        for (class42 var3 = (class42) this.field4104.method681(2); var3 != null; var3 = (class42) this.field4104.method680(109)) {
            if (!var3.method360(0)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IJ)V")
    public final void method1776(int arg0, long arg1) {
        class42 var4 = (class42) this.field4097.method1414(true, arg1);
        if (var4 != null) {
            var4.method693(-22);
            var4.method1964(12213);
            this.field4101++;
        }
        field4103++;
        if (arg0 <= 86) {
            this.method1784((Object) null, true, 5L);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILuf;Luf;)V")
    public static final void method1777(int arg0, class176 arg1, class176 arg2) {
        class65.field1034 = arg1;
        field4102++;
        class135.field2109 = arg2;
        class135.field2109.method1165(3, 34);
        int var3 = (int) (Math.random() * 21.0D) - 10;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 41.0D) - 20;
        int var7 = 62 / ((arg0 - 72) / 51);
        class239.field3712 = var4 + var6;
        class175.field2595 = var5 + var6;
        class261.field4024 = var3 + var6;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
    public final void method1778(int arg0, int arg1) {
        if (class229.field3581 != null) {
            for (class42 var3 = (class42) this.field4104.method681(2); var3 != null; var3 = (class42) this.field4104.method680(114)) {
                if (var3.method360(0)) {
                    if (var3.method356(0) == null) {
                        var3.method693(-116);
                        var3.method1964(12213);
                        this.field4101++;
                    }
                } else if ((long) arg0 < ++var3.field4603) {
                    class42 var4 = class229.field3581.method341((byte) -89, var3);
                    this.field4097.method1409(var3.field1408, 1, var4);
                    class241.method1626(var3, var4, false);
                    var3.method693(-24);
                    var3.method1964(12213);
                }
            }
        }
        field4105++;
        if (arg1 > -12) {
            this.method1775(-41);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public static void method1779(byte arg0) {
        field4088 = null;
        field4096 = null;
        if (arg0 != -102) {
            field4095 = 24;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(JB)Ljava/lang/Object;")
    public final Object method1780(long arg0, byte arg1) {
        field4092++;
        if (arg1 >= -110) {
            return null;
        }
        class42 var4 = (class42) this.field4097.method1414(true, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method356(0);
        if (var5 == null) {
            var4.method693(-43);
            var4.method1964(12213);
            this.field4101++;
            return null;
        }
        if (var4.method360(0)) {
            class231 var6 = new class231(var5);
            this.field4097.method1409(var4.field1408, 1, var6);
            this.field4104.method683(var6, 123);
            var6.field4603 = 0L;
            var4.method693(-70);
            var4.method1964(12213);
        } else {
            this.field4104.method683(var4, 117);
            var4.field4603 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public static final void method1781(int arg0) {
        class119.field1843 = "schütteln:";
        class218.field3417 = "Hierhin drehen";
        class46.field734 = " steht bereits auf deiner Freunde-Liste!";
        class148.field2294 = "M";
        class171.field2542 = "Stufe: ";
        field4085++;
        class203.field3165 = "Konfig geladen.";
        class191.field3037 = "Bitte entferne ";
        class175.field2605 = "Starte 3D-Softwarebibliothek.";
        class120.field1857 = "leuchten2:";
        class19.field294 = "Verbindung zum Update-Server hergestellt.";
        class93.field1505 = "Hierhin gehen";
        class151.field2340 = "Texturen geladen.";
        class292.field4602 = "gleiten:";
        class143.field2207 = "lila:";
        class70.field1124 = "Liste der Welten geladen";
        class180.field2691 = "Abbrechen";
        class280.field4385 = "Lade Titelbild - ";
        class148.field2292 = "Eingabeprozedur geladen.";
        class117.field1822 = "Untersuchen";
        class28.field411 = "Lade Texturen - ";
        class8.field177 = "Lade Konfiguration - ";
        class209.field3251 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class1.field17 = "Fallen lassen";
        class246.field3805 = "Lade Schriftsätze - ";
        class124.field1954 = "Spielwelt erstellt.";
        class160.field2445 = "Bitte warte...";
        class16.field254 = "möchte mit dir handeln.";
        class163.field2481 = "Gegenstand für Mitglieder";
        class202.field3154 = "Standardinstellungen geladen";
        class78.field1312 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class220.field3449 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class69.field1099 = "leuchten3:";
        class23.field348 = " weitere Optionen";
        class256.field3920 = "Benutzen";
        class35.field559 = "rot:";
        class226.field3544 = "gelb:";
        class247.field3827 = "Nehmen";
        class219.field3430 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class87.field1428 = "Verbindung mit Update-Server...";
        class140.field2162 = "Lade Wordpack - ";
        class126.field1984 = "T";
        class63.field1012 = " loggt sich ein.";
        class55.field855 = "M";
        class55.field848 = "Ladevorgang - bitte warte.";
        class10.field206 = " steht bereits auf deiner Ignorieren-Liste!";
        class229.field3583 = "Lade Liste der Welten";
        class22.field328 = "blinken2:";
        class134.field2103 = "blaugrün:";
        class7.field124 = "Kampfstufe: ";
        class26.field403 = "Musik-Engine vorbereitet.";
        class218.field3418 = "Angreifen";
        class65.field1037 = "Lade Sprites - ";
        class111.field1745 = ": ";
        class297.field4692 = "RuneScape wird geladen - bitte warten...";
        class220.field3452 = "Lade...";
        class102.field1629 = "Update-Liste geladen.";
        class254.field3902 = "Okay";
        class174.field2584 = "grün:";
        class161.field2465 = "Fertigkeit: ";
        class273.field4311 = "Benutzeroberfläche geladen.";
        class215.field3315 = "Wähl eine Option";
        class100.field1615 = "3D-Softwarebibliothek gestartet.";
        class10.field205 = "Bitte entferne ";
        int var1 = 120 % ((-arg0 - 29) / 62);
        class64.field1026 = "scrollen:";
        class50.field802 = "Ablegen";
        class160.field2447 = "welle:";
        class259.field3984 = "leuchten1:";
        class160.field2451 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class267.field4255 = "Verbindung abgebrochen.";
        class290.field4569 = "Versteckt";
        class9.field189 = "Auswählen";
        class212.field3287 = " loggt sich aus.";
        class28.field435 = "Titelbild geöffnet.";
        class98.field1572 = "Lade Benutzeroberfläche - ";
        class187.field2815 = " zuerst von deiner Ignorieren-Liste!";
        class266.field4253 = "Wordpack geladen.";
        class142.field2181 = "blinken3:";
        class55.field847 = "Titelbild geladen.";
        class143.field2208 = "Schließen";
        class169.field2535 = "Weiter";
        class124.field1964 = "T";
        class235.field3644 = "Sprites geladen.";
        class216.field3331 = "Speicher wird zugewiesen.";
        class25.field389 = "weiss:";
        class149.field2307 = "Schriftsätze geladen.";
        class121.field1867 = " zuerst von deiner Freunde-Liste!";
        class29.field454 = "Spieler kann nicht gefunden werden: ";
        class34.field546 = "Suche nach Updates - ";
        class28.field448 = "Lade Standardeinstellungen - ";
        class31.field496 = "blinken1:";
        class247.field3819 = "Zugewiesener Speicher.";
        class214.field3308 = "welle2:";
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
    public final void method1782(int arg0) {
        field4089++;
        int var2 = 79 % ((41 - arg0) / 49);
        this.field4104.method684(123);
        this.field4097.method1412(29692);
        this.field4101 = this.field4099;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
    public final void method1783(int arg0) {
        if (arg0 != 0) {
            this.method1775(-69);
        }
        for (class42 var2 = (class42) this.field4104.method681(2); var2 != null; var2 = (class42) this.field4104.method680(-51)) {
            if (var2.method360(0)) {
                var2.method693(arg0 - 85);
                var2.method1964(12213);
                this.field4101++;
            }
        }
        field4086++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/Object;ZJ)V")
    public final void method1784(Object arg0, boolean arg1, long arg2) {
        field4091++;
        this.method1776(109, arg2);
        if (this.field4101 == 0) {
            class42 var5 = (class42) this.field4104.method685(0);
            var5.method693(-32);
            var5.method1964(12213);
        } else {
            this.field4101--;
        }
        class231 var6 = new class231(arg0);
        this.field4097.method1409(arg2, 1, var6);
        this.field4104.method683(var6, 115);
        var6.field4603 = 0L;
        if (arg1) {
            this.method1783(67);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
    public static final void method1785(byte arg0) {
        field4094++;
        int[] var1 = new int[class292.field4595];
        int var2 = 0;
        if (arg0 > -59) {
            return;
        }
        for (int var3 = 0; var3 < class292.field4595; var3++) {
            class123 var5 = class32.method260(var3, true);
            if (var5.field1949 >= 0 || var5.field1951 >= 0) {
                var1[var2++] = var3;
            }
        }
        class9.field194 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class9.field194[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(I)V")
    public class262(int arg0) {
        this.field4101 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field4099 = arg0;
        this.field4097 = new class211(var2);
    }
}
