import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class165 {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "[Lti;")
    public static class236[] field2273 = new class236[29];

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "[Lsf;")
    public static class115[] field2279 = new class115[14];

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field2277 = 0;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "S")
    public static short field2281 = 205;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public static int field2289 = 3;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lla;")
    public static class147 field2274;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "Llc;")
    public static class175 field2284;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "[I")
    public static int[] field2285;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)I", line = 4)
    public static final int method1077(byte arg0) {
        field2276++;
        if ((double) class184.field2652 == 3.0D) {
            return 37;
        } else if ((double) class184.field2652 == 4.0D) {
            return 50;
        } else {
            if (arg0 > -51) {
                method1080(-53, (byte) -8);
            }
            if ((double) class184.field2652 == 6.0D) {
                return 75;
            } else if ((double) class184.field2652 == 8.0D) {
                return 100;
            } else {
                return 200;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)Lvm;", line = 30)
    public static final class84 method1078(int arg0, int arg1, int arg2) {
        field2286++;
        class84 var3 = new class84();
        int var4 = -9 / ((arg1 + 6) / 32);
        for (class79 var5 = (class79) class335.field5171.method1540(-121); var5 != null; var5 = (class79) class335.field5171.method1544(127)) {
            if (var5.field1012 && var5.method471(arg2, -19, arg0)) {
                var3.method495((byte) -113, var5);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)I", line = 52)
    public static final int method1079(byte arg0, int arg1) {
        field2275++;
        if (arg0 != 62) {
            field2287 = 41;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IB)V", line = 65)
    public static final void method1080(int arg0, byte arg1) {
        for (class332 var2 = class277.field4315.method1540(111); var2 != null; var2 = class277.field4315.method1544(127)) {
            if (((long) arg0) == (var2.field5065 >> 48 & 0xFFFFL)) {
                var2.method2285(true);
            }
        }
        if (arg1 != -48) {
            field2281 = 101;
        }
        field2282++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 85)
    public static final void method1081(int arg0) {
        class170.field2431 = "Spielwelt erstellt.";
        class115.field1638 = "lila:";
        class137.field1916 = "Lade...";
        class171.field2457 = "Verbindung mit Update-Server...";
        class218.field3062 = " loggt sich aus.";
        class264.field4164 = "Lade Sprites - ";
        class186.field2693 = "Titelbild geöffnet.";
        class240.field3612 = "Fertigkeit: ";
        class97.field1274 = "weiss:";
        class253.field3845 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class163.field2255 = "Sprites geladen.";
        class154.field2128 = "Lade Titelbild - ";
        class152.field2094 = " steht bereits auf deiner Freunde-Liste!";
        class121.field1696 = "Fallen lassen";
        class258.field3919 = "schütteln:";
        class301.field4699 = "blinken1:";
        class339.field5263 = "Lade Standardeinstellungen - ";
        class239.field3591 = "Lade Texturen - ";
        class286.field4504 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class321.field4923 = "T";
        class134.field1859 = "Eingabeprozedur geladen.";
        class204.field2869 = "Titelbild geladen.";
        if (arg0 != -4441) {
            method1077((byte) -44);
        }
        class295.field4609 = "welle:";
        class227.field3239 = "Zugewiesener Speicher.";
        class305.field4727 = "scrollen:";
        class254.field3870 = "Lade Konfiguration - ";
        class158.field2176 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class279.field4339 = "Abbrechen";
        class279.field4328 = "Hierhin drehen";
        class98.field1286 = "Gegenstand für Mitglieder";
        class146.field2035 = "Wordpack geladen.";
        class316.field4870 = "leuchten2:";
        class129.field1775 = "Verbindung zum Update-Server hergestellt.";
        class27.field353 = "Texturen geladen.";
        class163.field2251 = "Ladevorgang - bitte warte.";
        class284.field4453 = " zuerst von deiner Freunde-Liste!";
        field2288++;
        class148.field2058 = "Weiter";
        class233.field3403 = "blinken3:";
        class19.field252 = "Kampfstufe: ";
        class50.field629 = "Benutzen";
        class159.field2201 = "3D-Softwarebibliothek gestartet.";
        class316.field4875 = "Lade Schriftsätze - ";
        class315.field4858 = "RuneScape wird geladen - bitte warten...";
        class279.field4338 = "Stufe: ";
        class42.field500 = "blaugrün:";
        class116.field1641 = "Konfig geladen.";
        class311.field4810 = "Benutzeroberfläche geladen.";
        class164.field2262 = "Wähl eine Option";
        class145.field2019 = "M";
        class309.field4779 = "möchte mit dir handeln.";
        class38.field461 = "Standardinstellungen geladen";
        class255.field3881 = ": ";
        class229.field3342 = " loggt sich ein.";
        class195.field2799 = "Schriftsätze geladen.";
        class298.field4657 = "Ablegen";
        class15.field213 = "Hierhin gehen";
        class279.field4327 = "Bitte entferne ";
        class307.field4754 = "leuchten1:";
        class303.field4707 = "leuchten3:";
        class247.field3738 = "T";
        class226.field3226 = " zuerst von deiner Ignorieren-Liste!";
        class218.field3061 = "Bitte warte...";
        class15.field199 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class56.field685 = "Starte 3D-Softwarebibliothek.";
        class218.field3068 = "welle2:";
        class27.field354 = "Lade Liste der Welten";
        class328.field5017 = "Update-Liste geladen.";
        class61.field749 = "Musik-Engine vorbereitet.";
        class149.field2063 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class311.field4813 = "Angreifen";
        class40.field470 = "blinken2:";
        class343.field5323 = "Untersuchen";
        class252.field3830 = "rot:";
        class146.field2025 = "Lade Wordpack - ";
        class283.field4442 = "gleiten:";
        class206.field2890 = "gelb:";
        class237.field3479 = "grün:";
        class289.field4527 = "Lade Benutzeroberfläche - ";
        class196.field2812 = "Verbindung abgebrochen.";
        class107.field1361 = " weitere Optionen";
        class58.field701 = "Spieler kann nicht gefunden werden: ";
        class275.field4290 = "M";
        class62.field789 = "Schließen";
        class236.field3436 = "Suche nach Updates - ";
        class235.field3424 = "Auswählen";
        class342.field5312 = "Liste der Welten geladen";
        class40.field482 = "Bitte entferne ";
        class103.field1336 = "Okay";
        class285.field4477 = "Speicher wird zugewiesen.";
        class256.field3898 = "Versteckt";
        class73.field942 = "Nehmen";
        class204.field2860 = " steht bereits auf deiner Ignorieren-Liste!";
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IBILlc;)Laf;", line = 426)
    public static final class189 method1082(int arg0, byte arg1, int arg2, class175 arg3) {
        field2278++;
        if (arg1 != 45) {
            field2274 = (class147) null;
        }
        return class304.method2132((byte) -69, arg0, arg2, arg3) ? class112.method766(arg1 + 33) : null;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V", line = 455)
    public static void method1083(int arg0) {
        field2285 = null;
        field2274 = null;
        field2279 = null;
        field2284 = null;
        field2273 = null;
        if (arg0 != 75) {
            method1081(-94);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ltk;Lp;II)V", line = 469)
    public static final void method1084(class265 arg0, class107 arg1, int arg2, int arg3) {
        field2283++;
        class60 var4 = new class60();
        var4.field731 = arg1.method661(-1);
        var4.field746 = arg1.method676(true);
        var4.field735 = new int[var4.field731];
        if (arg2 != -4) {
            return;
        }
        var4.field744 = new class18[var4.field731];
        var4.field736 = new int[var4.field731];
        var4.field741 = new byte[var4.field731][][];
        var4.field737 = new int[var4.field731];
        var4.field730 = new class18[var4.field731];
        for (int var5 = 0; var5 < var4.field731; var5++) {
            try {
                int var6 = arg1.method661(arg2 + 3);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg1.method628(false);
                    String var8 = arg1.method628(false);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg1.method676(true);
                    }
                    var4.field736[var5] = var6;
                    var4.field737[var5] = var9;
                    var4.field744[var5] = arg0.method1923(class220.method1515(arg2 + 36, var7), (byte) 17, var8);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg1.method628(false);
                    String var11 = arg1.method628(false);
                    int var12 = arg1.method661(arg2 ^ 0x3);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg1.method628(false);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg1.method676(true);
                            var15[var16] = new byte[var17];
                            arg1.method626(true, var17, 0, var15[var16]);
                        }
                    }
                    Class[] var18 = new Class[var12];
                    var4.field736[var5] = var6;
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class220.method1515(32, var13[var19]);
                    }
                    var4.field730[var5] = arg0.method1910(var18, -61, class220.method1515(32, var10), var11);
                    var4.field741[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field735[var5] = -1;
            } catch (SecurityException var26) {
                var4.field735[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field735[var5] = -3;
            } catch (Exception var28) {
                var4.field735[var5] = -4;
            } catch (Throwable var29) {
                var4.field735[var5] = -5;
            }
        }
        class186.field2681.method2325(var4, (byte) 34);
    }
}
