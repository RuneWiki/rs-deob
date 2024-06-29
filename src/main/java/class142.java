import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class142 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "Ljb;")
    private class224 field1943 = null;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "Ljb;")
    private class224 field1955 = null;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    private int field1960 = 65000;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    private int field1948;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field1953 = 1;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field1956 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public static int field1961 = 0;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1954 = "shake:";

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Lnh;")
    public static class305 field1947;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "Lnh;")
    public static class305 field1962;

    @OriginalMember(owner = "client!ki", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1959++;
        return "Cache:" + this.field1948;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI[BZI)Z")
    private final boolean method891(boolean arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        field1945++;
        class224 var6 = this.field1943;
        synchronized (this.field1943) {
            try {
                int var8;
                if (arg0) {
                    if ((long) (arg1 * 6 + 6) > this.field1955.method1476(6)) {
                        return false;
                    }
                    this.field1955.method1480((long) (arg1 * 6), true);
                    this.field1955.method1484(class275.field4378, (byte) 75, 0, 6);
                    var8 = (class275.field4378[5] & 0xFF) + ((class275.field4378[3] & 0xFF << 16) + (class275.field4378[4] & 0xFF << 8));
                    if (var8 <= 0 || this.field1943.method1476(6) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1943.method1476(6) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class275.field4378[1] = (byte) (arg4 >> 8);
                class275.field4378[2] = (byte) arg4;
                if (arg3) {
                    this.field1948 = -48;
                }
                class275.field4378[5] = (byte) var8;
                class275.field4378[4] = (byte) (var8 >> 8);
                int var10 = 0;
                class275.field4378[0] = (byte) (arg4 >> 16);
                class275.field4378[3] = (byte) (var8 >> 16);
                int var11 = 0;
                this.field1955.method1480((long) (arg1 * 6), true);
                this.field1955.method1482(!arg3, 6, 0, class275.field4378);
                while (arg4 > var10) {
                    int var12 = 0;
                    if (arg0) {
                        label115: {
                            this.field1943.method1480((long) (var8 * 520), true);
                            try {
                                this.field1943.method1484(class275.field4378, (byte) 121, 0, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class275.field4378[4] & 0xFF << 16) + (class275.field4378[6] & 0xFF) + ((class275.field4378[5] & 0xFF) << 8);
                            int var13 = ((class275.field4378[0] & 0xFF) << 8) + (class275.field4378[1] & 0xFF);
                            int var14 = (class275.field4378[2] & 0xFF << 8) + (class275.field4378[3] & 0xFF);
                            int var15 = class275.field4378[7] & 0xFF;
                            if (arg1 == var13 && var11 == var14 && this.field1948 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field1943.method1476(6) / 520L)) {
                                    break label115;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg0 = false;
                        var12 = (int) ((this.field1943.method1476(6) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class275.field4378[1] = (byte) arg1;
                    class275.field4378[7] = (byte) this.field1948;
                    class275.field4378[0] = (byte) (arg1 >> 8);
                    int var18 = arg4 - var10;
                    class275.field4378[2] = (byte) (var11 >> 8);
                    if ((arg4 - var10) <= 512) {
                        var12 = 0;
                    }
                    class275.field4378[4] = (byte) (var12 >> 16);
                    class275.field4378[3] = (byte) var11;
                    var11++;
                    class275.field4378[6] = (byte) var12;
                    class275.field4378[5] = (byte) (var12 >> 8);
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field1943.method1480((long) (var8 * 520), true);
                    this.field1943.method1482(true, 8, 0, class275.field4378);
                    this.field1943.method1482(true, var18, var10, arg2);
                    var10 += var18;
                    var8 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static void method892(int arg0) {
        field1962 = null;
        field1947 = null;
        field1954 = null;
        if (arg0 > -67) {
            field1953 = 68;
        }
        field1956 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIZ)I")
    public static final int method893(int arg0, int arg1, boolean arg2) {
        field1946++;
        if (arg0 == -2) {
            return 12345678;
        }
        if (arg2) {
            field1953 = 59;
        }
        if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
    public static final void method894(int arg0) {
        class70.field1005.method948((byte) 58);
        if (arg0 != 6574) {
            field1952 = 44;
        }
        field1957++;
        class37.field562.method948((byte) 58);
        class32.field477.method948((byte) 58);
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
    public static final void method895(int arg0) {
        class238.field3694 = " steht bereits auf deiner Ignorieren-Liste!";
        class106.field1523 = "Lade Standardeinstellungen - ";
        class154.field2135 = "Mechscape wird geladen - bitte warten...";
        class205.field3060 = "Nehmen";
        if (arg0 != 0) {
            method894(32);
        }
        class5.field42 = "Bitte entferne ";
        class244.field3827 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class5.field46 = "T";
        class95.field1367 = "Benutzen";
        class58.field799 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class107.field1529 = "Versteckt";
        class227.field3555 = "Lade Texturen - ";
        class38.field578 = "Verbindung abgebrochen.";
        class117.field1683 = "M";
        class222.field3463 = " steht bereits auf deiner Freunde-Liste!";
        class233.field3649 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class93.field1361 = "Bitte warte...";
        class48.field690 = ": ";
        class263.field4224 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class92.field1352 = "Lade Benutzeroberfläche - ";
        class65.field862 = "weiss:";
        class166.field2369 = "Musik-Engine vorbereitet.";
        class6.field62 = "Standardeinstellungen geladen";
        class276.field4391 = "Eingabeprozedur geladen.";
        class292.field4652 = "welle2:";
        class250.field3913 = "gleiten:";
        class205.field3075 = "Suche nach Updates - ";
        class93.field1365 = "Liste der Welten geladen";
        class166.field2359 = "blaugrün:";
        class169.field2413 = "blinken2:";
        class202.field3051 = "Hierhin gehen";
        class294.field4694 = "Ladevorgang - bitte warte.";
        class39.field597 = "gelb:";
        class24.field388 = "Speicher wird zugewiesen.";
        class156.field2154 = "T";
        class54.field775 = "Okay";
        class280.field4452 = "Bitte entferne ";
        class236.field3672 = "Auswählen";
        class159.field2220 = "Verbindung mit Update-Server...";
        class15.field261 = "lila:";
        class83.field1158 = "Spieler kann nicht gefunden werden: ";
        class32.field479 = "Fertigkeit: ";
        class101.field1451 = " zuerst von deiner Freunde-Liste!";
        class163.field2313 = "Zugewiesener Speicher.";
        class195.field2990 = "Fallen lassen";
        class12.field202 = "Lade Konfiguration - ";
        class107.field1527 = "rot:";
        class229.field3595 = "Abbrechen";
        class24.field381 = "blinken1:";
        class150.field2088 = "Spielwelt erstellt.";
        class75.field1060 = "Schließen";
        class82.field1131 = "scrollen:";
        class288.field4601 = "Hierhin drehen";
        class164.field2320 = "3D-Softwarebibliothek gestartet.";
        class218.field3360 = "leuchten2:";
        class57.field797 = "leuchten1:";
        class180.field2727 = "Titelbild geöffnet.";
        class59.field816 = "M";
        class24.field386 = "Wähl eine Option";
        class128.field1784 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class38.field581 = "Lade Schriftsätze - ";
        class221.field3435 = "Titelbild geladen.";
        class159.field2213 = "Gegenstand für Mitglieder";
        class260.field4195 = "blinken3:";
        class271.field4325 = "Stufe: ";
        class7.field75 = " loggt sich ein.";
        class35.field530 = "leuchten3:";
        class60.field829 = " weitere Optionen";
        class126.field1779 = "RuneScape wird geladen - bitte warten...";
        class69.field973 = "Angreifen";
        field1954 = "schütteln:";
        class215.field3254 = " loggt sich aus.";
        class69.field969 = "Benutzeroberfläche geladen.";
        class263.field4226 = "Lade...";
        class96.field1392 = "grün:";
        class298.field4754 = "Sprites geladen.";
        class194.field2964 = "Wordpack geladen.";
        class105.field1514 = "Kampfstufe: ";
        class92.field1348 = "Lade Liste der Welten";
        class248.field3880 = "Lade Sprites - ";
        class294.field4693 = "Lade Wordpack - ";
        class234.field3660 = "welle:";
        class186.field2823 = "Ablegen";
        class238.field3685 = "Texturen geladen.";
        class208.field3096 = "Schriftsätze geladen.";
        class12.field200 = "Verbindung zum Update-Server hergestellt.";
        class45.field668 = "Untersuchen";
        class60.field832 = " zuerst von deiner Ignorieren-Liste!";
        class308.field4955 = "Starte 3D-Softwarebibliothek.";
        class163.field2309 = "Lade Titelbild - ";
        class229.field3577 = "Update-Liste geladen.";
        class188.field2847 = "Konfig geladen.";
        field1958++;
        class101.field1453 = "Weiter";
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)[B")
    public final byte[] method896(int arg0, byte arg1) {
        field1951++;
        class224 var3 = this.field1943;
        synchronized (this.field1943) {
            try {
                if (((long) (arg0 * 6 + 6)) > this.field1955.method1476(6)) {
                    return null;
                }
                this.field1955.method1480((long) (arg0 * 6), true);
                this.field1955.method1484(class275.field4378, (byte) 106, 0, 6);
                int var5 = (class275.field4378[1] & 0xFF << 8) + (class275.field4378[0] & 0xFF << 16) + (class275.field4378[2] & 0xFF);
                int var6 = (class275.field4378[5] & 0xFF) + ((class275.field4378[4] & 0xFF) << 8) + (class275.field4378[3] & 0xFF << 16);
                if (var5 < 0 || this.field1960 < var5) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field1943.method1476(6) / 520L) {
                    byte[] var9 = new byte[var5];
                    if (arg1 < 95) {
                        method895(-1);
                    }
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field1943.method1480((long) (var6 * 520), true);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1943.method1484(class275.field4378, (byte) 92, 0, var13 + 8);
                        int var14 = class275.field4378[7] & 0xFF;
                        int var15 = ((class275.field4378[4] & 0xFF) << 16) + ((class275.field4378[5] & 0xFF) << 8) + (class275.field4378[6] & 0xFF);
                        int var16 = (class275.field4378[0] & 0xFF << 8) + (class275.field4378[1] & 0xFF);
                        int var17 = (class275.field4378[2] & 0xFF << 8) + (class275.field4378[3] & 0xFF);
                        if (arg0 == var16 && var11 == var17 && this.field1948 == var14) {
                            if (var15 >= 0 && this.field1943.method1476(6) / 520L >= (long) var15) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class275.field4378[var20 + 8];
                                }
                                var11++;
                                var6 = var15;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZII[B)Z")
    public final boolean method897(boolean arg0, int arg1, int arg2, byte[] arg3) {
        field1950++;
        class224 var5 = this.field1943;
        synchronized (this.field1943) {
            if (arg1 < 0 || arg1 > this.field1960) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method891(arg0, arg2, arg3, !arg0, arg1);
            if (!var6) {
                var6 = this.method891(false, arg2, arg3, !arg0, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(ILjb;Ljb;I)V")
    public class142(int arg0, class224 arg1, class224 arg2, int arg3) {
        this.field1960 = arg3;
        this.field1955 = arg2;
        this.field1948 = arg0;
        this.field1943 = arg1;
    }
}
