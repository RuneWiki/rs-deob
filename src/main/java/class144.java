import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class144 {

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    private int field2346 = 0;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "[Ltj;")
    public class280[] field2343;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public int field2344;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Z")
    public static boolean field2328 = true;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2332 = "M";

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "[I")
    public static int[] field2342 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field2335 = 0;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "J")
    private long field2338;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "Ltj;")
    private class280 field2329;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "Ltj;")
    private class280 field2345;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)I")
    public final int method1028(byte arg0) {
        field2327++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2344; var3++) {
            class280 var4 = this.field2343[var3];
            for (class280 var5 = var4.field4470; var5 != var4; var5 = var5.field4470) {
                var2++;
            }
        }
        if (arg0 <= 63) {
            this.method1033(-61);
        }
        return var2;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)Ltj;")
    public final class280 method1029(boolean arg0) {
        field2339++;
        if (this.field2329 == null) {
            return null;
        }
        class280 var2 = this.field2343[(int) ((long) (this.field2344 - 1) & this.field2338)];
        if (arg0) {
            return null;
        }
        while (this.field2329 != var2) {
            if (this.field2329.field4459 == this.field2338) {
                class280 var3 = this.field2329;
                this.field2329 = this.field2329.field4470;
                return var3;
            }
            this.field2329 = this.field2329.field4470;
        }
        this.field2329 = null;
        return null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
    public final int method1030(int arg0) {
        field2340++;
        return arg0 > -14 ? -40 : this.field2344;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)Ltj;")
    public final class280 method1031(byte arg0) {
        if (arg0 != -7) {
            field2328 = false;
        }
        field2331++;
        if (this.field2346 > 0 && this.field2343[this.field2346 - 1] != this.field2345) {
            class280 var2 = this.field2345;
            this.field2345 = var2.field4470;
            return var2;
        }
        while (this.field2346 < this.field2344) {
            class280 var3 = this.field2343[this.field2346++].field4470;
            if (this.field2343[this.field2346 - 1] != var3) {
                this.field2345 = var3.field4470;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLtj;J)V")
    public final void method1032(boolean arg0, class280 arg1, long arg2) {
        if (arg0) {
            this.field2345 = null;
        }
        if (arg1.field4463 != null) {
            arg1.method1922(-1);
        }
        field2330++;
        class280 var5 = this.field2343[(int) ((long) (this.field2344 - 1) & arg2)];
        arg1.field4459 = arg2;
        arg1.field4470 = var5;
        arg1.field4463 = var5.field4463;
        arg1.field4463.field4470 = arg1;
        arg1.field4470.field4463 = arg1;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)Ltj;")
    public final class280 method1033(int arg0) {
        field2347++;
        if (arg0 == -9843) {
            this.field2346 = 0;
            return this.method1031((byte) -7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(JB)Ltj;")
    public final class280 method1034(long arg0, byte arg1) {
        this.field2338 = arg0;
        field2334++;
        class280 var4 = this.field2343[(int) (arg0 & (long) (this.field2344 - 1))];
        if (arg1 != 21) {
            method1038(1, (class131) null);
        }
        for (this.field2329 = var4.field4470; this.field2329 != var4; this.field2329 = this.field2329.field4470) {
            if (this.field2329.field4459 == arg0) {
                class280 var5 = this.field2329;
                this.field2329 = this.field2329.field4470;
                return var5;
            }
        }
        this.field2329 = null;
        return null;
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
    public final void method1035(int arg0) {
        for (int var2 = 0; var2 < this.field2344; var2++) {
            class280 var3 = this.field2343[var2];
            while (true) {
                class280 var4 = var3.field4470;
                if (var3 == var4) {
                    break;
                }
                var4.method1922(-1);
            }
        }
        if (arg0 <= 69) {
            this.method1029(true);
        }
        field2341++;
        this.field2329 = null;
        this.field2345 = null;
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)V")
    public static void method1036(int arg0) {
        field2332 = null;
        field2342 = null;
        if (arg0 != 0) {
            field2332 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)V")
    public static final void method1037(int arg0) {
        class132.field2185 = "Weiter";
        class150.field2446 = "Verbindung abgebrochen.";
        class290.field4602 = "lila:";
        class210.field3377 = "Titelbild geladen.";
        class263.field4277 = "Hierhin gehen";
        class205.field3281 = "blinken2:";
        class128.field1978 = "welle2:";
        class191.field3079 = "Angreifen";
        class49.field722 = "Konfig geladen.";
        class19.field215 = "Musik-Engine vorbereitet.";
        class171.field2764 = "Stufe: ";
        class184.field2975 = "Suche nach Updates - ";
        class253.field4181 = "Ablegen";
        class245.field4025 = "Bitte warte...";
        class276.field4434 = "Benutzeroberfläche geladen.";
        class166.field2696 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class270.field4361 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class143.field2297 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class99.field1449 = "Lade Titelbild - ";
        class164.field2666 = "Lade Schriftsätze - ";
        class40.field567 = "möchte mit dir handeln.";
        class19.field211 = "Texturen geladen.";
        class21.field243 = "Standardinstellungen geladen";
        class130.field1991 = " zuerst von deiner Ignorieren-Liste!";
        class139.field2243 = "rot:";
        class164.field2661 = "blinken1:";
        class36.field524 = "Lade Wordpack - ";
        class100.field1469 = "Liste der Welten geladen";
        class50.field737 = "Versteckt";
        class191.field3085 = "M";
        class80.field1170 = " loggt sich ein.";
        class48.field699 = "Speicher wird zugewiesen.";
        class175.field2849 = "Schließen";
        class77.field1101 = "RuneScape wird geladen - bitte warten...";
        class210.field3375 = "Update-Liste geladen.";
        class20.field218 = "Lade Benutzeroberfläche - ";
        class84.field1220 = "Titelbild geöffnet.";
        class238.field3804 = "T";
        class112.field1610 = "Starte 3D-Softwarebibliothek.";
        class132.field2182 = "Ladevorgang - bitte warte.";
        class297.field4696 = "leuchten3:";
        class265.field4297 = "grün:";
        class69.field1025 = "Spielwelt erstellt.";
        class134.field2205 = "Fallen lassen";
        class215.field3417 = "Bitte entferne ";
        class288.field4578 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class55.field781 = " steht bereits auf deiner Ignorieren-Liste!";
        class82.field1192 = "Eingabeprozedur geladen.";
        class280.field4458 = "Lade Liste der Welten";
        class277.field4439 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class243.field3935 = "Lade Sprites - ";
        class280.field4466 = "Wähl eine Option";
        class267.field4315 = "Verbindung zum Update-Server hergestellt.";
        class195.field3141 = "blaugrün:";
        class226.field3634 = "Nehmen";
        class190.field3071 = "gelb:";
        class105.field1532 = "Auswählen";
        class66.field966 = "weiss:";
        class10.field88 = "schütteln:";
        class12.field143 = " weitere Optionen";
        class128.field1980 = "Gegenstand für Mitglieder";
        class26.field296 = "Lade Standardeinstellungen - ";
        class82.field1193 = "welle:";
        class180.field2904 = "Lade Konfiguration - ";
        int var1 = 1 / ((-arg0 - 69) / 50);
        class67.field986 = "Zugewiesener Speicher.";
        class109.field1574 = "Kampfstufe: ";
        class93.field1394 = "Sprites geladen.";
        class228.field3654 = "blinken3:";
        class117.field1673 = "gleiten:";
        class109.field1575 = "Untersuchen";
        class166.field2694 = "Hierhin drehen";
        class136.field2226 = "Spieler kann nicht gefunden werden: ";
        class216.field3435 = "leuchten1:";
        class146.field2391 = "Benutzen";
        class267.field4312 = "scrollen:";
        class247.field4121 = "leuchten2:";
        class99.field1450 = "Schriftsätze geladen.";
        class276.field4436 = "Lade Texturen - ";
        class125.field1837 = " steht bereits auf deiner Freunde-Liste!";
        class88.field1306 = "Wordpack geladen.";
        field2332 = "M";
        class121.field1769 = "Fertigkeit: ";
        class204.field3276 = " zuerst von deiner Freunde-Liste!";
        class36.field526 = "Verbindung mit Update-Server...";
        class260.field4252 = "Okay";
        class227.field3642 = "Bitte entferne ";
        class183.field2948 = "Lade...";
        class141.field2275 = "3D-Softwarebibliothek gestartet.";
        class235.field3798 = "T";
        field2337++;
        class77.field1120 = " loggt sich aus.";
        class269.field4341 = "Abbrechen";
        class180.field2900 = ": ";
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(I)V")
    public class144(int arg0) {
        this.field2343 = new class280[arg0];
        this.field2344 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class280 var3 = this.field2343[var2] = new class280();
            var3.field4470 = var3;
            var3.field4463 = var3;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILqi;)Z")
    public static final boolean method1038(int arg0, class131 arg1) {
        field2333++;
        if (arg1.field2069 == null) {
            return false;
        } else if (arg0 == 19490) {
            for (int var2 = 0; var2 < arg1.field2069.length; var2++) {
                int var3 = class39.method300((byte) -80, arg1, var2);
                int var4 = arg1.field2124[var2];
                if (arg1.field2069[var2] == 2) {
                    if (var4 <= var3) {
                        return false;
                    }
                } else if (arg1.field2069[var2] == 3) {
                    if (var3 <= var4) {
                        return false;
                    }
                } else if (arg1.field2069[var2] == 4) {
                    if (var3 == var4) {
                        return false;
                    }
                } else if (var3 != var4) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
