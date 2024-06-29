import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class226 extends class59 {

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "J")
    public static volatile long field3507 = 0L;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "Ljava/lang/String;")
    public static String field3515 = "";

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "C")
    private char field3510;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    public int field3519;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "Ljava/lang/String;")
    public String field3514;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "[Lnj;")
    public static class215[] field3516;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(Z)V")
    public static final void method1593(boolean arg0) {
        field3508++;
        if (!arg0) {
            return;
        }
        for (int var1 = 0; var1 < class80.field1211; var1++) {
            int var2 = class187.field2939[var1];
            class86 var3 = class191.field3045[var2];
            if (var3 != null) {
                class108.method720(var3, var3.field1321.field1925, (byte) -49);
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)Z")
    public final boolean method1594(int arg0) {
        field3509++;
        if (arg0 > -65) {
            field3515 = null;
        }
        return this.field3510 == 's';
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BB)C")
    public static final char method1595(byte arg0, byte arg1) {
        field3517++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class117.field1694[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        int var4 = -87 % ((56 - arg0) / 48);
        return (char) var2;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method1596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 > -1) {
            field3516 = null;
        }
        if (arg0 >= 0 && arg4 >= 0 && arg0 < 103 && arg4 < 103) {
            if (arg1 == 0) {
                class263 var8 = class32.method167(arg6, arg0, arg4);
                if (var8 != null) {
                    int var9 = (int) (var8.field4270 >>> 32) & Integer.MAX_VALUE;
                    if (arg3 == 2) {
                        var8.field4281 = new class52(var9, 2, arg5 + 4, arg6, arg0, arg4, arg7, false, var8.field4281);
                        var8.field4275 = new class52(var9, 2, arg5 + 1 & 0x3, arg6, arg0, arg4, arg7, false, var8.field4275);
                    } else {
                        var8.field4281 = new class52(var9, arg3, arg5, arg6, arg0, arg4, arg7, false, var8.field4281);
                    }
                }
            }
            if (arg1 == 1) {
                class165 var10 = class192.method1349(arg6, arg0, arg4);
                if (var10 != null) {
                    int var11 = (int) (var10.field2551 >>> 32) & Integer.MAX_VALUE;
                    if (arg3 == 4 || arg3 == 5) {
                        var10.field2552 = new class52(var11, 4, arg5, arg6, arg0, arg4, arg7, false, var10.field2552);
                    } else if (arg3 == 6) {
                        var10.field2552 = new class52(var11, 4, arg5 + 4, arg6, arg0, arg4, arg7, false, var10.field2552);
                    } else if (arg3 == 7) {
                        var10.field2552 = new class52(var11, 4, (arg5 + 2 & 0x3) + 4, arg6, arg0, arg4, arg7, false, var10.field2552);
                    } else if (arg3 == 8) {
                        var10.field2552 = new class52(var11, 4, arg5 + 4, arg6, arg0, arg4, arg7, false, var10.field2552);
                        var10.field2555 = new class52(var11, 4, (arg5 + 2 & 0x3) + 4, arg6, arg0, arg4, arg7, false, var10.field2555);
                    }
                }
            }
            if (arg1 == 2) {
                class158 var12 = class162.method1110(arg6, arg0, arg4);
                if (arg3 == 11) {
                    arg3 = 10;
                }
                if (var12 != null) {
                    var12.field2365 = new class52((int) (var12.field2354 >>> 32) & Integer.MAX_VALUE, arg3, arg5, arg6, arg0, arg4, arg7, false, var12.field2365);
                }
            }
            if (arg1 == 3) {
                class58 var13 = class176.method1254(arg6, arg0, arg4);
                if (var13 != null) {
                    var13.field856 = new class52((int) (var13.field859 >>> 32) & Integer.MAX_VALUE, 22, arg5, arg6, arg0, arg4, arg7, false, var13.field856);
                }
            }
        }
        field3511++;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(Z)V")
    public static final void method1597(boolean arg0) {
        class112.field1622 = "3D-Softwarebibliothek gestartet.";
        class303.field4821 = "welle:";
        class68.field1019 = "Ablegen";
        class158.field2364 = "Kampfstufe: ";
        class193.field3065 = "Wordpack geladen.";
        class310.field4982 = "Verbindung abgebrochen.";
        class245.field4001 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class56.field821 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class302.field4807 = "M";
        field3518++;
        class10.field150 = "Bitte warte...";
        class36.field437 = "Weiter";
        class58.field855 = "Abbrechen";
        class126.field1811 = "grün:";
        class119.field1722 = "Texturen geladen.";
        class179.field2800 = "Benutzen";
        class309.field4978 = "Lade Konfiguration - ";
        class228.field3536 = "Lade Benutzeroberfläche - ";
        class33.field397 = "Ladevorgang - bitte warte.";
        class84.field1295 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class288.field4655 = "Liste der Welten geladen";
        class79.field1195 = "möchte mit dir handeln.";
        class206.field3231 = ": ";
        class178.field2792 = " loggt sich aus.";
        class254.field4152 = "Titelbild geladen.";
        class161.field2417 = "Lade Sprites - ";
        class234.field3789 = "T";
        class59.field864 = "Lade Schriftsätze - ";
        class169.field2609 = "Benutzeroberfläche geladen.";
        class272.field4431 = " steht bereits auf deiner Ignorieren-Liste!";
        class305.field4853 = "Fertigkeit: ";
        class150.field2212 = "leuchten1:";
        class313.field5021 = "leuchten2:";
        class265.field4307 = "gleiten:";
        class230.field3559 = "schütteln:";
        class294.field4715 = "Starte 3D-Softwarebibliothek.";
        class80.field1216 = "Lade Standardeinstellungen - ";
        class196.field3097 = "Verbindung zum Update-Server hergestellt.";
        class67.field987 = "leuchten3:";
        class63.field913 = "Lade Texturen - ";
        class107.field1564 = "Eingabeprozedur geladen.";
        class126.field1810 = "Auswählen";
        class140.field2009 = "blinken1:";
        class313.field5019 = " loggt sich ein.";
        class186.field2928 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class257.field4192 = "Update-Liste geladen.";
        class254.field4151 = "T";
        class21.field277 = "Stufe: ";
        class278.field4548 = "blaugrün:";
        class28.field352 = "Gegenstand für Mitglieder";
        class94.field1405 = "Spieler kann nicht gefunden werden: ";
        class260.field4238 = "Lade Titelbild - ";
        class252.field4128 = "Fallen lassen";
        class161.field2413 = "Hierhin drehen";
        class232.field3752 = "Konfig geladen.";
        class50.field638 = "Versteckt";
        class161.field2414 = "Musik-Engine vorbereitet.";
        class6.field85 = "Schriftsätze geladen.";
        class86.field1303 = "Sprites geladen.";
        class146.field2180 = "weiss:";
        class146.field2175 = "welle2:";
        class238.field3823 = "Suche nach Updates - ";
        class298.field4761 = "Untersuchen";
        class7.field102 = "RuneScape wird geladen - bitte warten...";
        if (arg0) {
            method1593(false);
        }
        class277.field4494 = "Spielwelt erstellt.";
        class209.field3267 = "Lade Wordpack - ";
        class19.field256 = "blinken3:";
        class304.field4830 = "M";
        class162.field2484 = "gelb:";
        class112.field1619 = "Mechscape wird geladen - bitte warten...";
        class123.field1766 = "Lade Liste der Welten";
        class17.field232 = " zuerst von deiner Ignorieren-Liste!";
        class288.field4656 = "scrollen:";
        class76.field1164 = "blinken2:";
        class201.field3169 = "Bitte entferne ";
        class61.field889 = "Angreifen";
        class181.field2844 = "Titelbild geöffnet.";
        class245.field3999 = "Zugewiesener Speicher.";
        class186.field2923 = " weitere Optionen";
        class125.field1796 = "Schließen";
        class229.field3546 = "Okay";
        class19.field265 = " zuerst von deiner Freunde-Liste!";
        class251.field4109 = "Bitte entferne ";
        class177.field2783 = "Wähl eine Option";
        class66.field973 = "Standardinstellungen geladen";
        class86.field1309 = "lila:";
        class81.field1246 = "Nehmen";
        class299.field4775 = "Verbindung mit Update-Server...";
        class178.field2791 = "Hierhin gehen";
        class297.field4747 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class130.field1867 = "Lade...";
        class108.field1578 = "rot:";
        class127.field1824 = " steht bereits auf deiner Freunde-Liste!";
        class191.field2968 = "Speicher wird zugewiesen.";
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lim;IB)V")
    private final void method1598(class170 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field3510 = method1595((byte) 125, arg0.method1215(128));
        } else if (arg1 == 2) {
            this.field3519 = arg0.method1190(arg2 ^ 0x18D3);
        } else if (arg1 == 5) {
            this.field3514 = arg0.method1195(-1);
        }
        if (arg2 == 26) {
            field3513++;
        }
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)V")
    public static void method1599(int arg0) {
        if (arg0 != -4) {
            method1596(-71, -119, 55, 6, 100, -71, 101, -96);
        }
        field3516 = null;
        field3515 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILim;)V")
    public final void method1600(int arg0, class170 arg1) {
        if (arg0 != 127) {
            this.method1600(24, (class170) null);
        }
        while (true) {
            int var3 = arg1.method1218(-29);
            if (var3 == 0) {
                field3512++;
                return;
            }
            this.method1598(arg1, var3, (byte) 26);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1601(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class283.field4595[arg0][var8][var14] == -class68.field1016) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class8.field114[arg0][arg1][arg3] + arg5;
            if (!class117.method773(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class117.method773(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class117.method773(var9, var11, var13)) {
                return false;
            } else if (class117.method773(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class277.method1911(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class117.method773(var6 + 1, class8.field114[arg0][arg1][arg3] + arg5, var7 + 1) && class117.method773(var6 + 128 - 1, class8.field114[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class117.method773(var6 + 128 - 1, class8.field114[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class117.method773(var6 + 1, class8.field114[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }
}
