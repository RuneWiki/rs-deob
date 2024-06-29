import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class18 {

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "Lnk;")
    private class206 field249 = new class206();

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "Ljj;")
    private class156 field253;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "Ljava/lang/String;")
    public static String field258 = "rating: ";

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Lvq;")
    public static class22 field241 = new class22();

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "[Lnc;")
    public static class126[] field262;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILdp;Ldp;)V")
    public static final void method101(int arg0, class174 arg1, class174 arg2) {
        class341.field4839 = arg1;
        if (arg0 != -28075) {
            field262 = null;
        }
        field244++;
        class311.field4533 = arg2;
        class311.field4533.method1333(0, 36);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method102(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field243++;
        class115 var2 = (class115) this.field253.method1222(5656);
        while (var2 != null) {
            Object var3 = var2.method980(8216);
            if (var3 != null) {
                return var3;
            }
            class115 var4 = var2;
            var2 = (class115) this.field253.method1224((byte) -111);
            var4.method251(17);
            var4.method1398(110);
            this.field256++;
        }
        return null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method103(int arg0, long arg1) {
        field257++;
        class115 var4 = (class115) this.field253.method1219(arg1, -101);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method980(8216);
        if (var5 == null) {
            var4.method251(113);
            var4.method1398(110);
            this.field256++;
            return null;
        } else if (arg0 == 0) {
            if (var4.method985(true)) {
                class437 var6 = new class437(var5);
                this.field253.method1217(1, var4.field499, var6);
                this.field249.method1564((byte) 106, var6);
                var6.field2671 = 0L;
                var4.method251(arg0 ^ 0x58);
                var4.method1398(110);
            } else {
                this.field249.method1564((byte) 106, var4);
                var4.field2671 = 0L;
            }
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)V")
    public final void method104(int arg0, byte arg1) {
        if (arg1 != -34) {
            this.method111(91);
        }
        if (class255.field3695 != null) {
            for (class115 var3 = (class115) this.field249.method1565(1); var3 != null; var3 = (class115) this.field249.method1562(arg1 ^ 0x22)) {
                if (var3.method985(true)) {
                    if (var3.method980(8216) == null) {
                        var3.method251(arg1 + 58);
                        var3.method1398(110);
                        this.field256++;
                    }
                } else if (((long) arg0) < (++var3.field2671)) {
                    class115 var4 = class255.field3695.method1785(var3, 10380);
                    this.field253.method1217(1, var3.field499, var4);
                    class206.method1556(var3, 569, var4);
                    var3.method251(20);
                    var3.method1398(110);
                }
            }
        }
        field260++;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)I")
    public final int method105(int arg0) {
        field255++;
        if (arg0 <= 80) {
            this.method103(109, 76L);
        }
        return this.field245;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public final void method106(byte arg0) {
        this.field249.method1557(1);
        if (arg0 >= -102) {
            field258 = null;
        }
        field259++;
        this.field253.method1228(-30653);
        this.field256 = this.field245;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
    public static final void method107(int arg0) {
        class148.field2283 = "leuchten3:";
        class183.field2696 = "Untersuchen";
        field261++;
        class263.field3961 = "Lade Wordpack - ";
        class214.field3164 = "Verbindung mit Update-Server...";
        class351.field5006 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class255.field3692 = "Musik-Engine vorbereitet.";
        class397.field5815 = "Zugewiesener Speicher.";
        class420.field6136 = "Verbindung abgebrochen.";
        class422.field6142 = "T";
        class364.field5182 = "Titelbild geladen.";
        class39.field610 = "scrollen:";
        class39.field611 = "Standardeinstellungen geladen";
        class361.field5152 = "M";
        class333.field4778 = "blinken2:";
        class193.field2847 = "Bitte entferne ";
        class380.field5391 = "Lade Konfiguration - ";
        class23.field354 = "rot:";
        class135.field2166 = "schütteln:";
        class72.field1210 = "Hierhin drehen";
        class28.field423 = "Eingabeprozedur geladen.";
        class451.field6560 = "welle:";
        class98.field1533 = "blinken3:";
        class242.field3535 = "Wordpack geladen.";
        class281.field4212 = "Bitte warte...";
        class21.field314 = "Lade Sprites - ";
        class387.field5543 = "Abbrechen";
        class387.field5551 = "Ablegen";
        class252.field3634 = "gelb:";
        class247.field3584 = "Lade Titelbild - ";
        class376.field5329 = "leuchten2:";
        class157.field2395 = "Texturen geladen.";
        class33.field486 = "Lade Liste der Welten";
        class109.field1777 = "lila:";
        class37.field540 = " zuerst von deiner Ignorieren-Liste!";
        class39.field612 = " steht bereits auf deiner Ignorieren-Liste!";
        class100.field1564 = "gleiten:";
        class161.field2446 = "Stufe: ";
        class275.field4145 = "welle2:";
        class220.field3272 = "Spieler kann nicht gefunden werden: ";
        class379.field5382 = "grün:";
        class358.field5111 = "Lade Texturen - ";
        class211.field3144 = "Konfig geladen.";
        class270.field4058 = " zuerst von deiner Freunde-Liste!";
        class422.field6145 = "Client-Variablen geladen";
        class360.field5136 = "Update-Liste geladen.";
        class250.field3618 = "Versteckt";
        class268.field4023 = "Starte 3D-Softwarebibliothek.";
        class164.field2467 = "Schriftsätze geladen.";
        field258 = "Kampfstufe: ";
        class391.field5712 = "Wähl eine Option";
        class143.field2238 = "Weiter";
        class19.field267 = "Benutzen";
        class365.field5196 = "blinken1:";
        class441.field6408 = "Titelbild geöffnet.";
        class322.field4648 = "RuneScape wird geladen - bitte warten...";
        class30.field445 = "leuchten1:";
        class77.field1306 = "Auswählen";
        class5.field35 = "Lade Standardeinstellungen - ";
        class105.field1745 = ": ";
        class437.field6363 = " loggt sich aus.";
        class267.field4000 = "3D-Softwarebibliothek gestartet.";
        class418.field6069 = "Lade Benutzeroberfläche - ";
        class113.field1820 = " loggt sich ein.";
        class40.field617 = "Lade...";
        class437.field6361 = "M";
        class418.field6068 = "Angreifen";
        class398.field5860 = "blaugrün:";
        class306.field4472 = "Liste der Welten geladen";
        class450.field6536 = "Verbindung zum Update-Server hergestellt.";
        class234.field3393 = "Gegenstand für Mitglieder";
        class447.field6518 = "Schließen";
        class447.field6521 = "Fertigkeit: ";
        class98.field1535 = " weitere Optionen";
        class22.field341 = "T";
        class429.field6210 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class106.field1754 = "Suche nach Updates - ";
        class172.field2553 = "Okay";
        class113.field1816 = "Speicher wird zugewiesen.";
        class63.field1022 = "Fallen lassen";
        class39.field613 = "Sprites geladen.";
        class27.field398 = "Hierhin gehen";
        class117.field1851 = "Ladevorgang - bitte warte.";
        class191.field2831 = "Bitte entferne ";
        if (arg0 != -30099) {
            field258 = null;
        }
        class320.field4622 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class389.field5593 = "Spielwelt erstellt.";
        client.field3652 = "Benutzeroberfläche geladen.";
        class362.field5163 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class16.field234 = " steht bereits auf deiner Freunde-Liste!";
        class239.field3445 = "Nehmen";
        class98.field1540 = "Lade Schriftsätze - ";
        class432.field6225 = "weiss:";
        class147.field2278 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class171.field2545 = "Mechscape wird geladen - bitte warten...";
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(CB)Z")
    public static final boolean method108(char arg0, byte arg1) {
        field254++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class153.method1184(arg0, 7)) {
            return true;
        } else {
            char[] var2 = class381.field5418;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class250.field3619;
            if (arg1 != 99) {
                return true;
            }
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V")
    public static void method109(int arg0) {
        field241 = null;
        field258 = null;
        if (arg0 != 0) {
            field258 = null;
        }
        field262 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(JI)V")
    private final void method110(long arg0, int arg1) {
        field252++;
        class115 var4 = (class115) this.field253.method1219(arg0, -105);
        if (var4 != null) {
            var4.method251(83);
            var4.method1398(110);
            this.field256++;
        }
        if (arg1 != 0) {
            this.method113((Object) null, -55, 105L);
        }
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method111(int arg0) {
        field247++;
        class115 var2 = (class115) this.field253.method1224((byte) -121);
        if (arg0 <= 47) {
            method109(48);
        }
        while (var2 != null) {
            Object var3 = var2.method980(8216);
            if (var3 != null) {
                return var3;
            }
            class115 var4 = var2;
            var2 = (class115) this.field253.method1224((byte) -102);
            var4.method251(92);
            var4.method1398(110);
            this.field256++;
        }
        return null;
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)V")
    public final void method112(int arg0) {
        for (class115 var2 = (class115) this.field249.method1565(1); var2 != null; var2 = (class115) this.field249.method1562(-4)) {
            if (var2.method985(true)) {
                var2.method251(arg0 ^ 0x23);
                var2.method1398(110);
                this.field256++;
            }
        }
        field251++;
        if (arg0 != 0) {
            this.method104(-49, (byte) -24);
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(I)V")
    public class18(int arg0) {
        this.field256 = arg0;
        this.field245 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field253 = new class156(var2);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/Object;IJ)V")
    public final void method113(Object arg0, int arg1, long arg2) {
        this.method110(arg2, arg1);
        field248++;
        if (this.field256 == 0) {
            class115 var5 = (class115) this.field249.method1558(-2);
            var5.method251(arg1 + 31);
            var5.method1398(110);
        } else {
            this.field256--;
        }
        class437 var6 = new class437(arg0);
        this.field253.method1217(1, arg2, var6);
        this.field249.method1564((byte) 106, var6);
        var6.field2671 = 0L;
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)I")
    public final int method114(int arg0) {
        field250++;
        int var2 = 0;
        for (class115 var3 = (class115) this.field249.method1565(1); var3 != null; var3 = (class115) this.field249.method1562(arg0 + 26470)) {
            if (!var3.method985(true)) {
                var2++;
            }
        }
        if (arg0 != -26474) {
            this.field245 = -18;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "(I)I")
    public final int method115(int arg0) {
        field242++;
        if (arg0 <= 9) {
            this.method103(-30, -80L);
        }
        return this.field256;
    }

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "(I)V")
    public static final void method116(int arg0) {
        field246++;
        class26.field389 = new class331(8);
        class311.field4528 = 0;
        if (arg0 > -124) {
            field258 = null;
        }
        for (class54 var1 = (class54) class322.field4654.method2496(65); var1 != null; var1 = (class54) class322.field4654.method2487(0)) {
            var1.method421();
        }
    }
}
