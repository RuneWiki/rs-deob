import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class37 {

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Lhc;")
    private class151 field554 = new class151();

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    private int field559;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "Lh;")
    private class190 field552;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field545 = -1;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "Ljava/lang/String;")
    public static String field543 = "red:";

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "[C")
    public static char[] field547 = new char[128];

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "[I")
    public static int[] field555 = new int[1000];

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Lve;")
    public static class233 field542;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "Lve;")
    public static class233 field557;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "Lqi;")
    public static class266 field551;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "[Lij;")
    public static class69[] field556;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)I")
    public final int method254(byte arg0) {
        if (arg0 < 39) {
            return 41;
        }
        int var2 = 0;
        for (class283 var3 = (class283) this.field554.method1026((byte) 126); var3 != null; var3 = (class283) this.field554.method1022(-9709)) {
            if (!var3.method694((byte) -115)) {
                var2++;
            }
        }
        field544++;
        return var2;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(JLjava/lang/Object;B)V")
    public final void method255(long arg0, Object arg1, byte arg2) {
        field539++;
        this.method262(arg0, 3003);
        if (this.field537 == 0) {
            class283 var5 = (class283) this.field554.method1023((byte) 54);
            var5.method1706(-101);
            var5.method609(-15747);
        } else {
            this.field537--;
        }
        class193 var6 = new class193(arg1);
        this.field552.method1215(var6, -99, arg0);
        this.field554.method1028(false, var6);
        if (arg2 >= -123) {
            this.method262(-41L, -101);
        }
        var6.field1376 = 0L;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
    public static void method256(byte arg0) {
        int var1 = -114 / ((arg0 - 85) / 33);
        field557 = null;
        field551 = null;
        field556 = null;
        field547 = null;
        field555 = null;
        field543 = null;
        field542 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
    public final void method257(boolean arg0) {
        if (arg0) {
            this.method258(-94, (byte) 12);
        }
        field541++;
        for (class283 var2 = (class283) this.field554.method1026((byte) 127); var2 != null; var2 = (class283) this.field554.method1022(-9709)) {
            if (var2.method694((byte) -56)) {
                var2.method1706(-121);
                var2.method609(-15747);
                this.field537++;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)V")
    public final void method258(int arg0, byte arg1) {
        if (class119.field1748 != null) {
            for (class283 var3 = (class283) this.field554.method1026((byte) 126); var3 != null; var3 = (class283) this.field554.method1022(-9709)) {
                if (var3.method694((byte) -89)) {
                    if (var3.method693((byte) -109) == null) {
                        var3.method1706(-65);
                        var3.method609(-15747);
                        this.field537++;
                    }
                } else if ((++var3.field1376) > ((long) arg0)) {
                    class283 var4 = class119.field1748.method1118(var3, (byte) -31);
                    this.field552.method1215(var4, -117, var3.field3851);
                    class79.method529(var3, 0, var4);
                    var3.method1706(-84);
                    var3.method609(-15747);
                }
            }
        }
        if (arg1 >= 52) {
            field548++;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method259(int arg0, String arg1, Throwable arg2) {
        field540++;
        try {
            String var3 = "";
            int var4 = -12 / ((39 - arg0) / 42);
            if (arg2 != null) {
                var3 = class226.method1478(-87, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class248.method1633((byte) 58, var3);
            String var5 = class235.method1546(var3, ":", "%3a", -81);
            String var6 = class235.method1546(var5, "@", "%40", -51);
            String var7 = class235.method1546(var6, "&", "%26", -115);
            String var8 = class235.method1546(var7, "#", "%23", -107);
            if (class277.field4434.field1273 != null) {
                class239 var9 = class277.field4434.method554(new URL(class277.field4434.field1273.getCodeBase(), "clienterror.ws?c=" + class60.field913 + "&u=" + class68.field1054 + "&v1=" + class83.field1279 + "&v2=" + class83.field1272 + "&e=" + var8), 0);
                while (var9.field3588 == 0) {
                    class98.method660(1L, -77);
                }
                if (var9.field3588 == 1) {
                    DataInputStream var10 = (DataInputStream) var9.field3585;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public final void method260(int arg0) {
        this.field554.method1024(false);
        this.field552.method1222(arg0);
        field549++;
        this.field537 = this.field559;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public static final void method261(int arg0) {
        field553++;
        class289.field4570.method260(0);
        class171.field2454.method260(0);
        class61.field931.method260(0);
        if (arg0 != -1) {
            field547 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(JI)V")
    public final void method262(long arg0, int arg1) {
        field558++;
        if (arg1 != 3003) {
            return;
        }
        class283 var4 = (class283) this.field552.method1218(arg0, 113);
        if (var4 != null) {
            var4.method1706(-81);
            var4.method609(-15747);
            this.field537++;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
    public final Object method263(byte arg0, long arg1) {
        field550++;
        class283 var4 = (class283) this.field552.method1218(arg1, -46);
        if (var4 == null) {
            return null;
        }
        if (arg0 < 108) {
            method264(26, 22, -113, true, -81, -126, -106);
        }
        Object var5 = var4.method693((byte) -109);
        if (var5 == null) {
            var4.method1706(-119);
            var4.method609(-15747);
            this.field537++;
            return null;
        }
        if (var4.method694((byte) -101)) {
            class193 var6 = new class193(var5);
            this.field552.method1215(var6, -106, var4.field3851);
            this.field554.method1028(false, var6);
            var6.field1376 = 0L;
            var4.method1706(-73);
            var4.method609(-15747);
        } else {
            this.field554.method1028(false, var4);
            var4.field1376 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIZIII)V")
    public static final void method264(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class32.field470 = arg6;
        class103.field1532 = arg0;
        class16.field238 = arg5;
        field538++;
        class219.field3233 = arg1;
        int var7 = -110 % ((-arg4 - 14) / 46);
        class5.field53 = arg2;
        if (arg3 && class219.field3233 >= 100) {
            class223.field3341 = class5.field53 * 128 + 64;
            class89.field1355 = class32.field470 * 128 + 64;
            class169.field2442 = class81.method542(class89.field1355, -1, class163.field2364, class223.field3341) - class16.field238;
        }
        class68.field1069 = 2;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
    public static final void method265(int arg0) {
        class56.field849 = "leuchten1:";
        class99.field1481 = " weitere Optionen";
        class130.field1900 = " steht bereits auf deiner Ignorieren-Liste!";
        class221.field3280 = " loggt sich aus.";
        class43.field627 = "Musik-Engine vorbereitet.";
        class179.field2553 = "Ablegen";
        class26.field358 = " loggt sich ein.";
        class66.field1034 = "T";
        class72.field1116 = "Lade Sprites - ";
        class163.field2375 = " zuerst von deiner Freunde-Liste!";
        class55.field846 = "Verbindung abgebrochen.";
        class194.field2787 = "Lade Wordpack - ";
        class253.field3848 = "Wähl eine Option";
        class240.field3609 = "Benutzen";
        class140.field2027 = "Verbindung mit Update-Server...";
        class110.field1591 = "Lade Schriftsätze - ";
        class166.field2424 = "Benutzeroberfläche geladen.";
        class263.field3966 = "grün:";
        class55.field845 = "M";
        class40.field594 = "Fertigkeit: ";
        class80.field1238 = "Titelbild geladen.";
        class237.field3569 = "rot:";
        class56.field857 = "lila:";
        class86.field1333 = "Ladevorgang - bitte warte.";
        class38.field564 = "Fallen lassen";
        class16.field232 = "Liste der Welten geladen";
        class184.field2626 = "M";
        class155.field2263 = "Starte 3D-Softwarebibliothek.";
        class124.field1802 = "Versteckt";
        class147.field2105 = "scrollen:";
        class158.field2287 = "Hierhin gehen";
        class280.field4474 = "T";
        class1.field15 = "blinken1:";
        class152.field2203 = "weiss:";
        class48.field707 = "Bitte entferne ";
        class262.field3946 = "Update-Liste geladen.";
        class1.field16 = "Angreifen";
        class273.field4341 = "Zugewiesener Speicher.";
        class109.field1570 = "leuchten3:";
        class124.field1805 = "schütteln:";
        class91.field1385 = "Lade Texturen - ";
        class203.field2942 = "Texturen geladen.";
        class39.field586 = "Wordpack geladen.";
        class124.field1809 = "Lade Konfiguration - ";
        class227.field3409 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class55.field830 = "Untersuchen";
        class48.field697 = "Sprites geladen.";
        class123.field1781 = "Schriftsätze geladen.";
        class194.field2795 = "Titelbild geöffnet.";
        class70.field1096 = "Auswählen";
        class23.field309 = "Speicher wird zugewiesen.";
        class42.field611 = "Lade Benutzeroberfläche - ";
        class67.field1039 = "leuchten2:";
        class227.field3408 = "welle2:";
        class47.field661 = "blaugrün:";
        class10.field169 = " zuerst von deiner Ignorieren-Liste!";
        class109.field1572 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class182.field2603 = "Stufe: ";
        class237.field3566 = "gelb:";
        class248.field3722 = "Suche nach Updates - ";
        class221.field3281 = "möchte mit dir handeln.";
        class78.field1209 = "Verbindung zum Update-Server hergestellt.";
        class273.field4329 = "welle:";
        class13.field208 = "Eingabeprozedur geladen.";
        class267.field4067 = " steht bereits auf deiner Freunde-Liste!";
        field546++;
        class260.field3926 = "Schließen";
        class94.field1437 = "Hierhin drehen";
        class58.field895 = "Lade Liste der Welten";
        class233.field3503 = "Abbrechen";
        class20.field272 = ": ";
        class52.field760 = "blinken2:";
        class235.field3541 = "Bitte warte...";
        class33.field478 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class176.field2504 = "Lade Titelbild - ";
        class123.field1784 = "Konfig geladen.";
        if (arg0 != 14807) {
            field555 = null;
        }
        class51.field746 = "Spielwelt erstellt.";
        class163.field2366 = "3D-Softwarebibliothek gestartet.";
        class284.field4516 = "Lade...";
        class168.field2435 = "blinken3:";
        class183.field2607 = "Nehmen";
        class181.field2598 = "RuneScape wird geladen - bitte warten...";
        class197.field2847 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class101.field1509 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class47.field662 = "Okay";
        class84.field1306 = "Bitte entferne ";
        class183.field2617 = "Gegenstand für Mitglieder";
        class96.field1454 = "Spieler kann nicht gefunden werden: ";
        class89.field1358 = "gleiten:";
        class135.field1955 = "Weiter";
        class75.field1169 = "Kampfstufe: ";
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I)V")
    public class37(int arg0) {
        this.field559 = arg0;
        this.field537 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field552 = new class190(var2);
    }
}
