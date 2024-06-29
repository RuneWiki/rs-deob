import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class70 {

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "B")
    private byte field864;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    private int field866;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    private int field876;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    private int field879;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    private int field868;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    private int field874;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field863 = 3353893;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "[J")
    public static long[] field867 = new long[100];

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field869 = -1;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "Lvk;")
    public static class140 field870;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)I")
    private final int method390(byte arg0) {
        field865++;
        return arg0 == 102 ? this.field864 & 0x7 : -32;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)I")
    private final int method391(int arg0) {
        int var2 = -40 / ((arg0 + 4) / 62);
        field871++;
        return (this.field864 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
    public static final void method392(int arg0) {
        class256.field4146 = "Schließen";
        class208.field3323 = "weiss:";
        class99.field1327 = "Nehmen";
        class178.field2830 = "Versteckt";
        class98.field1298 = " loggt sich aus.";
        class265.field4268 = "Okay";
        class239.field3941 = "Update-Liste geladen.";
        class44.field556 = "M";
        class39.field478 = "Lade...";
        class55.field697 = "Hierhin gehen";
        class34.field439 = "schütteln:";
        class237.field3921 = "Angreifen";
        class189.field3064 = "rot:";
        class68.field860 = "Suche nach Updates - ";
        class143.field2262 = "RuneScape wird geladen - bitte warten...";
        class191.field3077 = "Auswählen";
        class187.field2980 = "blaugrün:";
        class118.field1678 = "welle2:";
        class40.field503 = "T";
        class210.field3351 = "grün:";
        class62.field816 = "Verbindung mit Update-Server...";
        class258.field4187 = "Stufe: ";
        class92.field1162 = ": ";
        class207.field3307 = "Spielwelt erstellt.";
        class129.field2074 = "gleiten:";
        class13.field173 = "leuchten1:";
        class145.field2297 = "Lade Sprites - ";
        class247.field4066 = "Standardinstellungen geladen";
        class296.field4687 = "Lade Schriftsätze - ";
        class196.field3130 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class92.field1154 = "blinken3:";
        class157.field2530 = "leuchten3:";
        class246.field4059 = "leuchten2:";
        class148.field2336 = "Bitte entferne ";
        class152.field2355 = "Verbindung abgebrochen.";
        if (arg0 >= -36) {
            method392(-44);
        }
        class183.field2921 = "gelb:";
        class62.field813 = "Ladevorgang - bitte warte.";
        class166.field2682 = "scrollen:";
        class280.field4449 = "Abbrechen";
        class244.field4006 = "Fallen lassen";
        class200.field3165 = "Starte 3D-Softwarebibliothek.";
        class238.field3937 = "Bitte entferne ";
        class221.field3545 = "Lade Standardeinstellungen - ";
        class55.field704 = "M";
        class207.field3314 = "3D-Softwarebibliothek gestartet.";
        class139.field2230 = " steht bereits auf deiner Ignorieren-Liste!";
        class230.field3828 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class119.field1694 = "Lade Wordpack - ";
        class8.field98 = "Lade Titelbild - ";
        class46.field584 = "Kampfstufe: ";
        class272.field4353 = "Titelbild geöffnet.";
        class160.field2555 = "Weiter";
        class259.field4193 = "Lade Benutzeroberfläche - ";
        class209.field3344 = "Gegenstand für Mitglieder";
        class273.field4373 = " zuerst von deiner Freunde-Liste!";
        class245.field4023 = "Zugewiesener Speicher.";
        class88.field1088 = "Schriftsätze geladen.";
        class130.field2089 = "Ablegen";
        class98.field1295 = "Wordpack geladen.";
        class278.field4411 = "Benutzeroberfläche geladen.";
        class240.field3950 = " loggt sich ein.";
        class207.field3316 = "Benutzen";
        class50.field648 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class274.field4383 = "welle:";
        class82.field1014 = "Titelbild geladen.";
        class261.field4226 = "Fertigkeit: ";
        class225.field3615 = "blinken1:";
        class32.field431 = " weitere Optionen";
        class60.field772 = "Untersuchen";
        class173.field2742 = "Lade Konfiguration - ";
        class190.field3072 = "Konfig geladen.";
        class234.field3877 = "Speicher wird zugewiesen.";
        class294.field4668 = "Spieler kann nicht gefunden werden: ";
        class83.field1027 = "T";
        class2.field11 = "Wähl eine Option";
        class54.field688 = "blinken2:";
        class113.field1627 = "Hierhin drehen";
        field875++;
        class134.field2110 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class274.field4384 = "Lade Liste der Welten";
        class62.field812 = "lila:";
        class88.field1086 = "Bitte warte...";
        class51.field654 = "Eingabeprozedur geladen.";
        class115.field1646 = "möchte mit dir handeln.";
        class60.field767 = "Liste der Welten geladen";
        class252.field4112 = "Lade Texturen - ";
        class178.field2827 = " zuerst von deiner Ignorieren-Liste!";
        class17.field212 = "Texturen geladen.";
        class95.field1211 = "Musik-Engine vorbereitet.";
        class256.field4154 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class47.field593 = "Verbindung zum Update-Server hergestellt.";
        class218.field3490 = " steht bereits auf deiner Freunde-Liste!";
        class34.field433 = "Sprites geladen.";
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Loh;II)V")
    public static final void method393(class156 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field2512;
        field877++;
        int var4 = (Integer) var3[0];
        class245 var5 = class289.method1942(true, var4);
        if (var5 == null) {
            return;
        }
        class22.field293 = 0;
        int var6 = 0;
        int var7 = -1;
        int var8 = 0;
        byte var9 = -1;
        int[] var10 = var5.field4022;
        int[] var11 = var5.field4032;
        try {
            class278.field4418 = new String[var5.field4027];
            class194.field3108 = new int[var5.field4030];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = arg2; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg0.field2506;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field2514;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field2516 == null ? -1 : arg0.field2516.field1844;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field2509;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field2516 == null ? -1 : arg0.field2516.field1829;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field2507 == null ? -1 : arg0.field2507.field1844;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field2507 == null ? -1 : arg0.field2507.field1829;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field2517;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field2515;
                    }
                    class194.field3108[var12++] = var16;
                } else if (var3[var14] instanceof String) {
                    String var15 = (String) var3[var14];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field2504;
                    }
                    class278.field4418[var13++] = var15;
                }
            }
            int var17 = 0;
            label4012: while (true) {
                var17++;
                if (arg1 < var17) {
                    throw new RuntimeException("slow");
                }
                var7++;
                int var517 = var11[var7];
                if (var517 < 100) {
                    if (var517 == 0) {
                        class274.field4376[var6++] = var10[var7];
                        continue;
                    }
                    if (var517 == 1) {
                        int var18 = var10[var7];
                        class274.field4376[var6++] = class135.field2141[var18];
                        continue;
                    }
                    if (var517 == 2) {
                        int var19 = var10[var7];
                        var6--;
                        class136.method919(class274.field4376[var6], -90, var19);
                        continue;
                    }
                    if (var517 == 3) {
                        class287.field4587[var8++] = var5.field4020[var7];
                        continue;
                    }
                    if (var517 == 6) {
                        var7 += var10[var7];
                        continue;
                    }
                    if (var517 == 7) {
                        var6 -= 2;
                        if (class274.field4376[var6 + 1] != class274.field4376[var6]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var517 == 8) {
                        var6 -= 2;
                        if (class274.field4376[var6 + 1] == class274.field4376[var6]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var517 == 9) {
                        var6 -= 2;
                        if (class274.field4376[var6 + 1] > class274.field4376[var6]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var517 == 10) {
                        var6 -= 2;
                        if (class274.field4376[var6] > class274.field4376[var6 + 1]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var517 == 21) {
                        if (class22.field293 == 0) {
                            return;
                        }
                        class94 var20 = class68.field857[--class22.field293];
                        var5 = var20.field1199;
                        class194.field3108 = var20.field1195;
                        var10 = var5.field4022;
                        class278.field4418 = var20.field1190;
                        var7 = var20.field1193;
                        var11 = var5.field4032;
                        continue;
                    }
                    if (var517 == 25) {
                        int var21 = var10[var7];
                        class274.field4376[var6++] = class153.method1044(-62, var21);
                        continue;
                    }
                    if (var517 == 27) {
                        int var22 = var10[var7];
                        var6--;
                        class280.method1873(var22, class274.field4376[var6], true);
                        continue;
                    }
                    if (var517 == 31) {
                        var6 -= 2;
                        if (class274.field4376[var6 + 1] >= class274.field4376[var6]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var517 == 32) {
                        var6 -= 2;
                        if (class274.field4376[var6] >= class274.field4376[var6 + 1]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var517 == 33) {
                        class274.field4376[var6++] = class194.field3108[var10[var7]];
                        continue;
                    }
                    int var10001;
                    if (var517 == 34) {
                        var10001 = var10[var7];
                        var6--;
                        class194.field3108[var10001] = class274.field4376[var6];
                        continue;
                    }
                    if (var517 == 35) {
                        class287.field4587[var8++] = class278.field4418[var10[var7]];
                        continue;
                    }
                    if (var517 == 36) {
                        var10001 = var10[var7];
                        var8--;
                        class278.field4418[var10001] = class287.field4587[var8];
                        continue;
                    }
                    if (var517 == 37) {
                        int var23 = var10[var7];
                        var8 -= var23;
                        String var24 = class237.method1678(true, var8, class287.field4587, var23);
                        class287.field4587[var8++] = var24;
                        continue;
                    }
                    if (var517 == 38) {
                        var6--;
                        continue;
                    }
                    if (var517 == 39) {
                        var8--;
                        continue;
                    }
                    if (var517 == 40) {
                        int var25 = var10[var7];
                        class245 var26 = class289.method1942(true, var25);
                        int[] var27 = new int[var26.field4030];
                        String[] var28 = new String[var26.field4027];
                        for (int var29 = 0; var29 < var26.field4025; var29++) {
                            var27[var29] = class274.field4376[var6 + var29 - var26.field4025];
                        }
                        for (int var30 = 0; var30 < var26.field4024; var30++) {
                            var28[var30] = class287.field4587[var8 + var30 - var26.field4024];
                        }
                        var8 -= var26.field4024;
                        var6 -= var26.field4025;
                        class94 var31 = new class94();
                        var31.field1199 = var5;
                        var31.field1190 = class278.field4418;
                        var31.field1193 = var7;
                        var31.field1195 = class194.field3108;
                        if (class22.field293 >= class68.field857.length) {
                            throw new RuntimeException();
                        }
                        var7 = -1;
                        class68.field857[class22.field293++] = var31;
                        class194.field3108 = var27;
                        class278.field4418 = var28;
                        var5 = var26;
                        var10 = var26.field4022;
                        var11 = var26.field4032;
                        continue;
                    }
                    if (var517 == 42) {
                        class274.field4376[var6++] = class164.field2606[var10[var7]];
                        continue;
                    }
                    if (var517 == 43) {
                        int var32 = var10[var7];
                        var6--;
                        class164.field2606[var32] = class274.field4376[var6];
                        class216.method1513(var32, false);
                        continue;
                    }
                    if (var517 == 44) {
                        var6--;
                        int var33 = class274.field4376[var6];
                        int var34 = var10[var7] >> 16;
                        int var35 = var10[var7] & 0xFFFF;
                        if (var33 >= 0 && var33 <= 5000) {
                            class220.field3525[var34] = var33;
                            byte var36 = -1;
                            if (var35 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var33) {
                                    continue label4012;
                                }
                                class40.field505[var34][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var517 == 45) {
                        int var38 = var10[var7];
                        var6--;
                        int var39 = class274.field4376[var6];
                        if (var39 >= 0 && class220.field3525[var38] > var39) {
                            class274.field4376[var6++] = class40.field505[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var517 == 46) {
                        var6 -= 2;
                        int var40 = var10[var7];
                        int var41 = class274.field4376[var6];
                        if (var41 >= 0 && var41 < class220.field3525[var40]) {
                            class40.field505[var40][var41] = class274.field4376[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var517 == 47) {
                        String var42 = class255.field4140[var10[var7]];
                        if (var42 == null) {
                            var42 = "null";
                        }
                        class287.field4587[var8++] = var42;
                        continue;
                    }
                    if (var517 == 48) {
                        int var43 = var10[var7];
                        var8--;
                        class255.field4140[var43] = class287.field4587[var8];
                        class281.method1879(var43, (byte) 123);
                        continue;
                    }
                    if (var517 == 51) {
                        class110 var44 = var5.field4028[var10[var7]];
                        var6--;
                        class122 var45 = (class122) var44.method708((long) class274.field4376[var6], arg2 + 122);
                        if (var45 != null) {
                            var7 += var45.field1733;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var10[var7] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var517 < 300) {
                    if (var517 == 100) {
                        var6 -= 3;
                        int var47 = class274.field4376[var6];
                        int var48 = class274.field4376[var6 + 2];
                        int var49 = class274.field4376[var6 + 1];
                        if (var49 == 0) {
                            throw new RuntimeException();
                        }
                        class123 var50 = class61.method358(var47, -123);
                        if (var50.field1748 == null) {
                            var50.field1748 = new class123[var48 + 1];
                        }
                        if (var48 >= var50.field1748.length) {
                            class123[] var51 = new class123[var48 + 1];
                            for (int var52 = 0; var52 < var50.field1748.length; var52++) {
                                var51[var52] = var50.field1748[var52];
                            }
                            var50.field1748 = var51;
                        }
                        if (var48 > 0 && var50.field1748[var48 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var48 - 1));
                        }
                        class123 var53 = new class123();
                        var53.field1796 = true;
                        var53.field1829 = var48;
                        var53.field1911 = var53.field1844 = var50.field1844;
                        var53.field1778 = var49;
                        var50.field1748[var48] = var53;
                        if (var46) {
                            class47.field595 = var53;
                        } else {
                            class161.field2568 = var53;
                        }
                        class129.method875((byte) -21, var50);
                        continue;
                    }
                    if (var517 == 101) {
                        class123 var54 = var46 ? class47.field595 : class161.field2568;
                        if (var54.field1829 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class123 var55 = class61.method358(var54.field1844, -121);
                        var55.field1748[var54.field1829] = null;
                        class129.method875((byte) -21, var55);
                        continue;
                    }
                    if (var517 == 102) {
                        var6--;
                        class123 var56 = class61.method358(class274.field4376[var6], -128);
                        var56.field1748 = null;
                        class129.method875((byte) -21, var56);
                        continue;
                    }
                    if (var517 == 200) {
                        var6 -= 2;
                        int var57 = class274.field4376[var6];
                        int var58 = class274.field4376[var6 + 1];
                        class123 var59 = class247.method1714(var58, var57, 0);
                        if (var59 != null && var58 != -1) {
                            class274.field4376[var6++] = 1;
                            if (var46) {
                                class47.field595 = var59;
                            } else {
                                class161.field2568 = var59;
                            }
                            continue;
                        }
                        class274.field4376[var6++] = 0;
                        continue;
                    }
                    if (var517 == 201) {
                        var6--;
                        int var60 = class274.field4376[var6];
                        class123 var61 = class61.method358(var60, arg2 - 127);
                        if (var61 == null) {
                            class274.field4376[var6++] = 0;
                        } else {
                            class274.field4376[var6++] = 1;
                            if (var46) {
                                class47.field595 = var61;
                            } else {
                                class161.field2568 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var517 < 500) {
                    if (var517 == 403) {
                        var6 -= 2;
                        int var505 = class274.field4376[var6];
                        int var506 = class274.field4376[var6 + 1];
                        for (int var507 = 0; var507 < class9.field105.length; var507++) {
                            if (class9.field105[var507] == var505) {
                                class286.field4571.field4219.method905(var506, var507, (byte) -127);
                                continue label4012;
                            }
                        }
                        int var508 = 0;
                        while (true) {
                            if (class280.field4440.length <= var508) {
                                continue label4012;
                            }
                            if (class280.field4440[var508] == var505) {
                                class286.field4571.field4219.method905(var506, var508, (byte) -123);
                                continue label4012;
                            }
                            var508++;
                        }
                    }
                    if (var517 == 404) {
                        var6 -= 2;
                        int var509 = class274.field4376[var6];
                        int var510 = class274.field4376[var6 + 1];
                        class286.field4571.field4219.method909(var510, var509, arg2 - 31774);
                        continue;
                    }
                    if (var517 == 410) {
                        var6--;
                        boolean var511 = class274.field4376[var6] != 0;
                        class286.field4571.field4219.method903(var511, arg2 ^ 0x1);
                        continue;
                    }
                } else if (var517 >= 1000 && var517 < 1100 || var517 >= 2000 && var517 < 2100) {
                    class123 var62;
                    if (var517 < 2000) {
                        var62 = var46 ? class47.field595 : class161.field2568;
                    } else {
                        var517 -= 1000;
                        var6--;
                        var62 = class61.method358(class274.field4376[var6], -128);
                    }
                    if (var517 == 1000) {
                        var6 -= 4;
                        var62.field1820 = class274.field4376[var6];
                        var62.field1808 = class274.field4376[var6 + 1];
                        int var63 = class274.field4376[var6 + 2];
                        int var64 = class274.field4376[var6 + 3];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 5) {
                            var63 = 5;
                        }
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 5) {
                            var64 = 5;
                        }
                        var62.field1852 = (byte) var64;
                        var62.field1825 = (byte) var63;
                        class129.method875((byte) -21, var62);
                        class4.method19(var62, arg2 ^ 0xFFFFFFFE);
                        if (var62.field1829 == -1) {
                            class234.method1662(var62.field1844, true);
                        }
                        continue;
                    }
                    if (var517 == 1001) {
                        var6 -= 4;
                        var62.field1918 = class274.field4376[var6];
                        var62.field1833 = class274.field4376[var6 + 1];
                        var62.field1906 = 0;
                        var62.field1901 = 0;
                        int var65 = class274.field4376[var6 + 3];
                        int var66 = class274.field4376[var6 + 2];
                        if (var66 < 0) {
                            var66 = 0;
                        } else if (var66 > 4) {
                            var66 = 4;
                        }
                        var62.field1875 = (byte) var66;
                        if (var65 < 0) {
                            var65 = 0;
                        } else if (var65 > 4) {
                            var65 = 4;
                        }
                        var62.field1862 = (byte) var65;
                        class129.method875((byte) -21, var62);
                        class4.method19(var62, arg2 ^ 0xFFFFFFFE);
                        if (var62.field1778 == 0) {
                            class21.method118((byte) -2, false, var62);
                        }
                        continue;
                    }
                    if (var517 == 1003) {
                        var6--;
                        boolean var67 = class274.field4376[var6] == 1;
                        if (var67 != var62.field1832) {
                            var62.field1832 = var67;
                            class129.method875((byte) -21, var62);
                        }
                        if (var62.field1829 == -1) {
                            class66.method383(var62.field1844, (byte) 11);
                        }
                        continue;
                    }
                    if (var517 == 1004) {
                        var6 -= 2;
                        var62.field1763 = class274.field4376[var6];
                        var62.field1838 = class274.field4376[var6 + 1];
                        class129.method875((byte) -21, var62);
                        class4.method19(var62, -1);
                        if (var62.field1778 == 0) {
                            class21.method118((byte) -2, false, var62);
                        }
                        continue;
                    }
                    if (var517 == 1005) {
                        var6--;
                        var62.field1741 = class274.field4376[var6] == 1;
                        continue;
                    }
                } else if (var517 >= 1100 && var517 < 1200 || var517 >= 2100 && var517 < 2200) {
                    class123 var68;
                    if (var517 >= 2000) {
                        var517 -= 1000;
                        var6--;
                        var68 = class61.method358(class274.field4376[var6], -125);
                    } else {
                        var68 = var46 ? class47.field595 : class161.field2568;
                    }
                    if (var517 == 1100) {
                        var6 -= 2;
                        var68.field1835 = class274.field4376[var6];
                        if ((var68.field1770 - var68.field1879) < var68.field1835) {
                            var68.field1835 = var68.field1770 - var68.field1879;
                        }
                        if (var68.field1835 < 0) {
                            var68.field1835 = 0;
                        }
                        var68.field1872 = class274.field4376[var6 + 1];
                        if (var68.field1872 > (var68.field1853 - var68.field1809)) {
                            var68.field1872 = var68.field1853 - var68.field1809;
                        }
                        if (var68.field1872 < 0) {
                            var68.field1872 = 0;
                        }
                        class129.method875((byte) -21, var68);
                        if (var68.field1829 == -1) {
                            class110.method706(var68.field1844, 12);
                        }
                        continue;
                    }
                    if (var517 == 1101) {
                        var6--;
                        var68.field1779 = class274.field4376[var6];
                        class129.method875((byte) -21, var68);
                        if (var68.field1829 == -1) {
                            class266.method1794(var68.field1844, true);
                        }
                        continue;
                    }
                    if (var517 == 1102) {
                        var6--;
                        var68.field1831 = class274.field4376[var6] == 1;
                        class129.method875((byte) -21, var68);
                        continue;
                    }
                    if (var517 == 1103) {
                        var6--;
                        var68.field1801 = class274.field4376[var6];
                        class129.method875((byte) -21, var68);
                        continue;
                    }
                    if (var517 == 1104) {
                        var6--;
                        var68.field1851 = class274.field4376[var6];
                        class129.method875((byte) -21, var68);
                        continue;
                    }
                    if (var517 == 1105) {
                        var6--;
                        var68.field1893 = class274.field4376[var6];
                        class129.method875((byte) -21, var68);
                        continue;
                    }
                    if (var517 == 1106) {
                        var6--;
                        var68.field1814 = class274.field4376[var6];
                        class129.method875((byte) -21, var68);
                        continue;
                    }
                    if (var517 == 1107) {
                        var6--;
                        var68.field1773 = class274.field4376[var6] == 1;
                        class129.method875((byte) -21, var68);
                        continue;
                    }
                    if (var517 == 1108) {
                        var68.field1769 = 1;
                        var6--;
                        var68.field1818 = class274.field4376[var6];
                        class129.method875((byte) -21, var68);
                        if (var68.field1829 == -1) {
                            class127.method868(true, var68.field1844);
                        }
                        continue;
                    }
                    if (var517 == 1109) {
                        var6 -= 6;
                        var68.field1815 = class274.field4376[var6];
                        var68.field1810 = class274.field4376[var6 + 1];
                        var68.field1804 = class274.field4376[var6 + 2];
                        var68.field1907 = class274.field4376[var6 + 3];
                        var68.field1756 = class274.field4376[var6 + 4];
                        var68.field1878 = class274.field4376[var6 + 5];
                        class129.method875((byte) -21, var68);
                        if (var68.field1829 == -1) {
                            class107.method650((byte) -91, var68.field1844);
                            class129.method882((byte) 117, var68.field1844);
                        }
                        continue;
                    }
                    if (var517 == 1110) {
                        var6--;
                        int var69 = class274.field4376[var6];
                        if (var68.field1783 != var69) {
                            var68.field1900 = 0;
                            var68.field1780 = 1;
                            var68.field1783 = var69;
                            var68.field1894 = 0;
                            class129.method875((byte) -21, var68);
                        }
                        if (var68.field1829 == -1) {
                            class111.method715(var68.field1844, 3389);
                        }
                        continue;
                    }
                    if (var517 == 1111) {
                        var6--;
                        var68.field1753 = class274.field4376[var6] == 1;
                        class129.method875((byte) -21, var68);
                        continue;
                    }
                    if (var517 == 1112) {
                        var8--;
                        String var70 = class287.field4587[var8];
                        if (!var70.equals(var68.field1751)) {
                            var68.field1751 = var70;
                            class129.method875((byte) -21, var68);
                        }
                        if (var68.field1829 == -1) {
                            class181.method1260(var68.field1844, arg2 - 420427185);
                        }
                        continue;
                    }
                    if (var517 == 1113) {
                        var6--;
                        var68.field1884 = class274.field4376[var6];
                        class129.method875((byte) -21, var68);
                        continue;
                    }
                    if (var517 == 1114) {
                        var6 -= 3;
                        var68.field1868 = class274.field4376[var6];
                        var68.field1876 = class274.field4376[var6 + 1];
                        var68.field1845 = class274.field4376[var6 + 2];
                        class129.method875((byte) -21, var68);
                        continue;
                    }
                    if (var517 == 1115) {
                        var6--;
                        var68.field1749 = class274.field4376[var6] == 1;
                        class129.method875((byte) -21, var68);
                        continue;
                    }
                    if (var517 == 1116) {
                        var6--;
                        var68.field1752 = class274.field4376[var6];
                        class129.method875((byte) -21, var68);
                        continue;
                    }
                    if (var517 == 1117) {
                        var6--;
                        var68.field1792 = class274.field4376[var6];
                        class129.method875((byte) -21, var68);
                        continue;
                    }
                    if (var517 == 1118) {
                        var6--;
                        var68.field1788 = class274.field4376[var6] == 1;
                        class129.method875((byte) -21, var68);
                        continue;
                    }
                    if (var517 == 1119) {
                        var6--;
                        var68.field1795 = class274.field4376[var6] == 1;
                        class129.method875((byte) -21, var68);
                        continue;
                    }
                    if (var517 == 1120) {
                        var6 -= 2;
                        var68.field1770 = class274.field4376[var6];
                        var68.field1853 = class274.field4376[var6 + 1];
                        class129.method875((byte) -21, var68);
                        if (var68.field1778 == 0) {
                            class21.method118((byte) -2, false, var68);
                        }
                        continue;
                    }
                    if (var517 == 1121) {
                        class129.method875((byte) -21, var68);
                        var6 -= 2;
                        continue;
                    }
                    if (var517 == 1122) {
                        var6--;
                        var68.field1758 = class274.field4376[var6] == 1;
                        class129.method875((byte) -21, var68);
                        continue;
                    }
                    if (var517 == 1123) {
                        var6--;
                        var68.field1878 = class274.field4376[var6];
                        class129.method875((byte) -21, var68);
                        if (var68.field1829 == -1) {
                            class107.method650((byte) -82, var68.field1844);
                        }
                        continue;
                    }
                    if (var517 == 1124) {
                        var6--;
                        int var71 = class274.field4376[var6];
                        var68.field1754 = var71 == 1;
                        class129.method875((byte) -21, var68);
                        continue;
                    }
                } else if (!(var517 < 1200 || var517 >= 1300) || !(var517 < 2200 || var517 >= 2300)) {
                    class123 var501;
                    if (var517 >= 2000) {
                        var6--;
                        var501 = class61.method358(class274.field4376[var6], -122);
                        var517 -= 1000;
                    } else {
                        var501 = var46 ? class47.field595 : class161.field2568;
                    }
                    class129.method875((byte) -21, var501);
                    if (var517 == 1200 || var517 == 1205 || var517 == 1208 || var517 == 1209) {
                        var6 -= 2;
                        int var502 = class274.field4376[var6];
                        int var503 = class274.field4376[var6 + 1];
                        if (var501.field1829 == -1) {
                            class41.method226(9, var501.field1844);
                            class107.method650((byte) -110, var501.field1844);
                            class129.method882((byte) 11, var501.field1844);
                        }
                        if (var502 == -1) {
                            var501.field1769 = 1;
                            var501.field1818 = -1;
                            var501.field1806 = -1;
                            continue;
                        }
                        var501.field1805 = var503;
                        if (var517 == 1208 || var517 == 1209) {
                            var501.field1798 = true;
                        } else {
                            var501.field1798 = false;
                        }
                        var501.field1806 = var502;
                        class108 var504 = class256.method1753(-2, var502);
                        var501.field1756 = var504.field1516;
                        var501.field1907 = var504.field1530;
                        var501.field1810 = var504.field1515;
                        var501.field1878 = var504.field1483;
                        if (var517 == 1205) {
                            var501.field1850 = false;
                        } else {
                            var501.field1850 = true;
                        }
                        var501.field1804 = var504.field1521;
                        if (var501.field1906 > 0) {
                            var501.field1878 = var501.field1878 * 32 / var501.field1906;
                        } else if (var501.field1918 > 0) {
                            var501.field1878 = var501.field1878 * 32 / var501.field1918;
                        }
                        var501.field1815 = var504.field1479;
                        continue;
                    }
                    if (var517 == 1201) {
                        var501.field1769 = 2;
                        var6--;
                        var501.field1818 = class274.field4376[var6];
                        if (var501.field1829 == -1) {
                            class127.method868(true, var501.field1844);
                        }
                        continue;
                    }
                    if (var517 == 1202) {
                        var501.field1769 = 3;
                        var501.field1818 = class286.field4571.field4219.method904((byte) -113);
                        if (var501.field1829 == -1) {
                            class127.method868(true, var501.field1844);
                        }
                        continue;
                    }
                    if (var517 == 1203) {
                        var501.field1769 = 6;
                        var6--;
                        var501.field1818 = class274.field4376[var6];
                        if (var501.field1829 == -1) {
                            class127.method868(true, var501.field1844);
                        }
                        continue;
                    }
                    if (var517 == 1204) {
                        var501.field1769 = 5;
                        var6--;
                        var501.field1818 = class274.field4376[var6];
                        if (var501.field1829 == -1) {
                            class127.method868(true, var501.field1844);
                        }
                        continue;
                    }
                    if (var517 == 1206) {
                        var6 -= 4;
                        var501.field1760 = class274.field4376[var6];
                        var501.field1755 = class274.field4376[var6 + 1];
                        var501.field1789 = class274.field4376[var6 + 2];
                        var501.field1794 = class274.field4376[var6 + 3];
                        class129.method875((byte) -21, var501);
                        continue;
                    }
                    if (var517 == 1207) {
                        var6 -= 2;
                        var501.field1841 = class274.field4376[var6];
                        var501.field1830 = class274.field4376[var6 + 1];
                        class129.method875((byte) -21, var501);
                        continue;
                    }
                } else if (var517 >= 1300 && var517 < 1400 || var517 >= 2300 && var517 < 2400) {
                    class123 var495;
                    if (var517 >= 2000) {
                        var6--;
                        var495 = class61.method358(class274.field4376[var6], -121);
                        var517 -= 1000;
                    } else {
                        var495 = var46 ? class47.field595 : class161.field2568;
                    }
                    if (var517 == 1300) {
                        var6--;
                        int var496 = class274.field4376[var6] - 1;
                        if (var496 >= 0 && var496 <= 9) {
                            var8--;
                            var495.method801(var496, 0, class287.field4587[var8]);
                            continue;
                        }
                        var8--;
                        continue;
                    }
                    if (var517 == 1301) {
                        var6 -= 2;
                        int var497 = class274.field4376[var6];
                        int var498 = class274.field4376[var6 + 1];
                        var495.field1782 = class247.method1714(var498, var497, 0);
                        continue;
                    }
                    if (var517 == 1302) {
                        var6--;
                        var495.field1887 = class274.field4376[var6] == 1;
                        continue;
                    }
                    if (var517 == 1303) {
                        var6--;
                        var495.field1840 = class274.field4376[var6];
                        continue;
                    }
                    if (var517 == 1304) {
                        var6--;
                        var495.field1750 = class274.field4376[var6];
                        continue;
                    }
                    if (var517 == 1305) {
                        var8--;
                        var495.field1817 = class287.field4587[var8];
                        continue;
                    }
                    if (var517 == 1306) {
                        var8--;
                        var495.field1863 = class287.field4587[var8];
                        continue;
                    }
                    if (var517 == 1307) {
                        var495.field1910 = null;
                        continue;
                    }
                    if (var517 == 1308) {
                        var6--;
                        var495.field1889 = class274.field4376[var6];
                        var6--;
                        var495.field1738 = class274.field4376[var6];
                        continue;
                    }
                    if (var517 == 1309) {
                        var6--;
                        int var499 = class274.field4376[var6];
                        var6--;
                        int var500 = class274.field4376[var6];
                        if (var500 >= 1 && var500 <= 10) {
                            var495.method798(33, var500 - 1, var499);
                        }
                        continue;
                    }
                    if (var517 == 1310) {
                        var8--;
                        var495.field1885 = class287.field4587[var8];
                        continue;
                    }
                } else {
                    if (var517 >= 1400 && var517 < 1500 || var517 >= 2400 && var517 < 2500) {
                        class123 var488;
                        if (var517 >= 2000) {
                            var6--;
                            var488 = class61.method358(class274.field4376[var6], -121);
                            var517 -= 1000;
                        } else {
                            var488 = var46 ? class47.field595 : class161.field2568;
                        }
                        var8--;
                        String var489 = class287.field4587[var8];
                        int[] var490 = null;
                        if (var489.length() > 0 && var489.charAt(var489.length() - 1) == 'Y') {
                            var6--;
                            int var491 = class274.field4376[var6];
                            if (var491 > 0) {
                                var490 = new int[var491];
                                while ((var491--) > 0) {
                                    var6--;
                                    var490[var491] = class274.field4376[var6];
                                }
                            }
                            var489 = var489.substring(0, var489.length() - 1);
                        }
                        Object[] var492 = new Object[var489.length() + 1];
                        for (int var493 = var492.length - 1; var493 >= 1; var493--) {
                            if (var489.charAt(var493 - 1) == 's') {
                                var8--;
                                var492[var493] = class287.field4587[var8];
                            } else {
                                var6--;
                                var492[var493] = Integer.valueOf(class274.field4376[var6]);
                            }
                        }
                        var6--;
                        int var494 = class274.field4376[var6];
                        if (var494 == -1) {
                            var492 = null;
                        } else {
                            var492[0] = Integer.valueOf(var494);
                        }
                        if (var517 == 1400) {
                            var488.field1843 = var492;
                        } else if (var517 == 1401) {
                            var488.field1834 = var492;
                        } else if (var517 == 1402) {
                            var488.field1837 = var492;
                        } else if (var517 == 1403) {
                            var488.field1767 = var492;
                        } else if (var517 == 1404) {
                            var488.field1765 = var492;
                        } else if (var517 == 1405) {
                            var488.field1912 = var492;
                        } else if (var517 == 1406) {
                            var488.field1776 = var492;
                        } else if (var517 == 1407) {
                            var488.field1917 = var492;
                            var488.field1744 = var490;
                        } else if (var517 == 1408) {
                            var488.field1822 = var492;
                        } else if (var517 == 1409) {
                            var488.field1855 = var492;
                        } else if (var517 == 1410) {
                            var488.field1877 = var492;
                        } else if (var517 == 1411) {
                            var488.field1746 = var492;
                        } else if (var517 == 1412) {
                            var488.field1881 = var492;
                        } else if (var517 == 1414) {
                            var488.field1902 = var492;
                            var488.field1874 = var490;
                        } else if (var517 == 1415) {
                            var488.field1821 = var492;
                            var488.field1811 = var490;
                        } else if (var517 == 1416) {
                            var488.field1866 = var492;
                        } else if (var517 == 1417) {
                            var488.field1790 = var492;
                        } else if (var517 == 1418) {
                            var488.field1908 = var492;
                        } else if (var517 == 1419) {
                            var488.field1882 = var492;
                        } else if (var517 == 1420) {
                            var488.field1897 = var492;
                        } else if (var517 == 1421) {
                            var488.field1786 = var492;
                        } else if (var517 == 1422) {
                            var488.field1871 = var492;
                        } else if (var517 == 1423) {
                            var488.field1864 = var492;
                        } else if (var517 == 1424) {
                            var488.field1890 = var492;
                        } else if (var517 == 1425) {
                            var488.field1743 = var492;
                        } else if (var517 == 1426) {
                            var488.field1849 = var492;
                        } else if (var517 == 1427) {
                            var488.field1909 = var492;
                        } else if (var517 == 1428) {
                            var488.field1785 = var492;
                            var488.field1870 = var490;
                        } else if (var517 == 1429) {
                            var488.field1813 = var492;
                            var488.field1892 = var490;
                        }
                        var488.field1891 = true;
                        continue;
                    }
                    if (var517 < 1600) {
                        class123 var72 = var46 ? class47.field595 : class161.field2568;
                        if (var517 == 1500) {
                            class274.field4376[var6++] = var72.field1899;
                            continue;
                        }
                        if (var517 == 1501) {
                            class274.field4376[var6++] = var72.field1896;
                            continue;
                        }
                        if (var517 == 1502) {
                            class274.field4376[var6++] = var72.field1879;
                            continue;
                        }
                        if (var517 == 1503) {
                            class274.field4376[var6++] = var72.field1809;
                            continue;
                        }
                        if (var517 == 1504) {
                            class274.field4376[var6++] = var72.field1832 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 1505) {
                            class274.field4376[var6++] = var72.field1911;
                            continue;
                        }
                    } else if (var517 < 1700) {
                        class123 var73 = var46 ? class47.field595 : class161.field2568;
                        if (var517 == 1600) {
                            class274.field4376[var6++] = var73.field1835;
                            continue;
                        }
                        if (var517 == 1601) {
                            class274.field4376[var6++] = var73.field1872;
                            continue;
                        }
                        if (var517 == 1602) {
                            class287.field4587[var8++] = var73.field1751;
                            continue;
                        }
                        if (var517 == 1603) {
                            class274.field4376[var6++] = var73.field1770;
                            continue;
                        }
                        if (var517 == 1604) {
                            class274.field4376[var6++] = var73.field1853;
                            continue;
                        }
                        if (var517 == 1605) {
                            class274.field4376[var6++] = var73.field1878;
                            continue;
                        }
                        if (var517 == 1606) {
                            class274.field4376[var6++] = var73.field1804;
                            continue;
                        }
                        if (var517 == 1607) {
                            class274.field4376[var6++] = var73.field1756;
                            continue;
                        }
                        if (var517 == 1608) {
                            class274.field4376[var6++] = var73.field1907;
                            continue;
                        }
                        if (var517 == 1609) {
                            class274.field4376[var6++] = var73.field1801;
                            continue;
                        }
                        if (var517 == 1610) {
                            class274.field4376[var6++] = var73.field1815;
                            continue;
                        }
                        if (var517 == 1611) {
                            class274.field4376[var6++] = var73.field1810;
                            continue;
                        }
                        if (var517 == 1612) {
                            class274.field4376[var6++] = var73.field1893;
                            continue;
                        }
                    } else if (var517 < 1800) {
                        class123 var74 = var46 ? class47.field595 : class161.field2568;
                        if (var517 == 1700) {
                            class274.field4376[var6++] = var74.field1806;
                            continue;
                        }
                        if (var517 == 1701) {
                            if (var74.field1806 == -1) {
                                class274.field4376[var6++] = 0;
                            } else {
                                class274.field4376[var6++] = var74.field1805;
                            }
                            continue;
                        }
                        if (var517 == 1702) {
                            class274.field4376[var6++] = var74.field1829;
                            continue;
                        }
                    } else if (var517 < 1900) {
                        class123 var75 = var46 ? class47.field595 : class161.field2568;
                        if (var517 == 1800) {
                            class274.field4376[var6++] = client.method735(var75).method1171(arg2 - 114);
                            continue;
                        }
                        if (var517 == 1801) {
                            var6--;
                            int var76 = class274.field4376[var6];
                            int var518 = var76 - 1;
                            if (var75.field1910 != null && var75.field1910.length > var518 && var75.field1910[var518] != null) {
                                class287.field4587[var8++] = var75.field1910[var518];
                                continue;
                            }
                            class287.field4587[var8++] = "";
                            continue;
                        }
                        if (var517 == 1802) {
                            if (var75.field1817 == null) {
                                class287.field4587[var8++] = "";
                            } else {
                                class287.field4587[var8++] = var75.field1817;
                            }
                            continue;
                        }
                    } else if (var517 < 2600) {
                        var6--;
                        class123 var77 = class61.method358(class274.field4376[var6], -128);
                        if (var517 == 2500) {
                            class274.field4376[var6++] = var77.field1899;
                            continue;
                        }
                        if (var517 == 2501) {
                            class274.field4376[var6++] = var77.field1896;
                            continue;
                        }
                        if (var517 == 2502) {
                            class274.field4376[var6++] = var77.field1879;
                            continue;
                        }
                        if (var517 == 2503) {
                            class274.field4376[var6++] = var77.field1809;
                            continue;
                        }
                        if (var517 == 2504) {
                            class274.field4376[var6++] = var77.field1832 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 2505) {
                            class274.field4376[var6++] = var77.field1911;
                            continue;
                        }
                    } else if (var517 < 2700) {
                        var6--;
                        class123 var78 = class61.method358(class274.field4376[var6], -125);
                        if (var517 == 2600) {
                            class274.field4376[var6++] = var78.field1835;
                            continue;
                        }
                        if (var517 == 2601) {
                            class274.field4376[var6++] = var78.field1872;
                            continue;
                        }
                        if (var517 == 2602) {
                            class287.field4587[var8++] = var78.field1751;
                            continue;
                        }
                        if (var517 == 2603) {
                            class274.field4376[var6++] = var78.field1770;
                            continue;
                        }
                        if (var517 == 2604) {
                            class274.field4376[var6++] = var78.field1853;
                            continue;
                        }
                        if (var517 == 2605) {
                            class274.field4376[var6++] = var78.field1878;
                            continue;
                        }
                        if (var517 == 2606) {
                            class274.field4376[var6++] = var78.field1804;
                            continue;
                        }
                        if (var517 == 2607) {
                            class274.field4376[var6++] = var78.field1756;
                            continue;
                        }
                        if (var517 == 2608) {
                            class274.field4376[var6++] = var78.field1907;
                            continue;
                        }
                        if (var517 == 2609) {
                            class274.field4376[var6++] = var78.field1801;
                            continue;
                        }
                        if (var517 == 2610) {
                            class274.field4376[var6++] = var78.field1815;
                            continue;
                        }
                        if (var517 == 2611) {
                            class274.field4376[var6++] = var78.field1810;
                            continue;
                        }
                        if (var517 == 2612) {
                            class274.field4376[var6++] = var78.field1893;
                            continue;
                        }
                    } else if (var517 < 2800) {
                        if (var517 == 2700) {
                            var6--;
                            class123 var79 = class61.method358(class274.field4376[var6], -127);
                            class274.field4376[var6++] = var79.field1806;
                            continue;
                        }
                        if (var517 == 2701) {
                            var6--;
                            class123 var80 = class61.method358(class274.field4376[var6], -123);
                            if (var80.field1806 == -1) {
                                class274.field4376[var6++] = 0;
                            } else {
                                class274.field4376[var6++] = var80.field1805;
                            }
                            continue;
                        }
                        if (var517 == 2702) {
                            var6--;
                            int var81 = class274.field4376[var6];
                            class86 var82 = (class86) class92.field1139.method708((long) var81, 124);
                            if (var82 == null) {
                                class274.field4376[var6++] = 0;
                            } else {
                                class274.field4376[var6++] = 1;
                            }
                            continue;
                        }
                        if (var517 == 2703) {
                            var6--;
                            class123 var83 = class61.method358(class274.field4376[var6], -120);
                            if (var83.field1748 == null) {
                                class274.field4376[var6++] = 0;
                                continue;
                            }
                            int var84 = var83.field1748.length;
                            for (int var85 = 0; var85 < var83.field1748.length; var85++) {
                                if (var83.field1748[var85] == null) {
                                    var84 = var85;
                                    break;
                                }
                            }
                            class274.field4376[var6++] = var84;
                            continue;
                        }
                        if (var517 == 2704 || var517 == 2705) {
                            var6 -= 2;
                            int var86 = class274.field4376[var6];
                            int var87 = class274.field4376[var6 + 1];
                            class86 var88 = (class86) class92.field1139.method708((long) var86, -116);
                            if (var88 != null && var88.field1064 == var87) {
                                class274.field4376[var6++] = 1;
                            } else {
                                class274.field4376[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var517 < 2900) {
                        var6--;
                        class123 var89 = class61.method358(class274.field4376[var6], -121);
                        if (var517 == 2800) {
                            class274.field4376[var6++] = client.method735(var89).method1171(-118);
                            continue;
                        }
                        if (var517 == 2801) {
                            var6--;
                            int var90 = class274.field4376[var6];
                            int var519 = var90 - 1;
                            if (var89.field1910 != null && var89.field1910.length > var519 && var89.field1910[var519] != null) {
                                class287.field4587[var8++] = var89.field1910[var519];
                                continue;
                            }
                            class287.field4587[var8++] = "";
                            continue;
                        }
                        if (var517 == 2802) {
                            if (var89.field1817 == null) {
                                class287.field4587[var8++] = "";
                            } else {
                                class287.field4587[var8++] = var89.field1817;
                            }
                            continue;
                        }
                    } else if (var517 < 3200) {
                        if (var517 == 3100) {
                            var8--;
                            String var473 = class287.field4587[var8];
                            class211.method1487(var473, "", 0, (byte) -125);
                            continue;
                        }
                        if (var517 == 3101) {
                            var6 -= 2;
                            class88.method479(class286.field4571, class274.field4376[var6 + 1], class274.field4376[var6], arg2 ^ 0x1);
                            continue;
                        }
                        if (var517 == 3103) {
                            class2.method12(true);
                            continue;
                        }
                        if (var517 == 3104) {
                            int var474 = 0;
                            class96.field1239++;
                            var8--;
                            String var475 = class287.field4587[var8];
                            if (class78.method439(var475, arg2 - 11661)) {
                                var474 = class283.method1901(arg2 ^ 0xB, var475);
                            }
                            class4.field57.method1932(false, 178);
                            class4.field57.method574(var474, arg2 - 2);
                            continue;
                        }
                        if (var517 == 3105) {
                            var8--;
                            String var476 = class287.field4587[var8];
                            class183.field2913++;
                            class4.field57.method1932(false, 252);
                            class4.field57.method590(class185.method1296((byte) -103, var476), 1027669520);
                            continue;
                        }
                        if (var517 == 3106) {
                            class127.field2037++;
                            var8--;
                            String var477 = class287.field4587[var8];
                            class4.field57.method1932(false, 41);
                            class4.field57.method580((byte) 125, var477.length() + 1);
                            class4.field57.method566((byte) -107, var477);
                            continue;
                        }
                        if (var517 == 3107) {
                            var6--;
                            int var478 = class274.field4376[var6];
                            var8--;
                            String var479 = class287.field4587[var8];
                            class250.method1725(var479, (byte) 36, var478);
                            continue;
                        }
                        if (var517 == 3108) {
                            var6 -= 3;
                            int var480 = class274.field4376[var6];
                            int var481 = class274.field4376[var6 + 1];
                            int var482 = class274.field4376[var6 + 2];
                            class123 var483 = class61.method358(var482, -120);
                            class213.method1495(var481, var480, var483, (byte) -116);
                            continue;
                        }
                        if (var517 == 3109) {
                            var6 -= 2;
                            int var484 = class274.field4376[var6 + 1];
                            int var485 = class274.field4376[var6];
                            class123 var486 = var46 ? class47.field595 : class161.field2568;
                            class213.method1495(var484, var485, var486, (byte) 71);
                            continue;
                        }
                        if (var517 == 3110) {
                            class296.field4680++;
                            var6--;
                            int var487 = class274.field4376[var6];
                            class4.field57.method1932(false, 77);
                            class4.field57.method572(true, var487);
                            continue;
                        }
                    } else if (var517 < 3300) {
                        if (var517 == 3200) {
                            var6 -= 3;
                            class130.method885(class274.field4376[var6], class274.field4376[var6 + 2], 255, 0, class274.field4376[var6 + 1]);
                            continue;
                        }
                        if (var517 == 3201) {
                            var6--;
                            class172.method1179(255, class274.field4376[var6], (byte) -94);
                            continue;
                        }
                        if (var517 == 3202) {
                            var6 -= 2;
                            class175.method1212(class274.field4376[var6 + 1], class274.field4376[var6], 255, (byte) 121);
                            continue;
                        }
                    } else if (var517 < 3400) {
                        if (var517 == 3300) {
                            class274.field4376[var6++] = class73.field924;
                            continue;
                        }
                        if (var517 == 3301) {
                            var6 -= 2;
                            int var91 = class274.field4376[var6];
                            int var92 = class274.field4376[var6 + 1];
                            class274.field4376[var6++] = class98.method610(var92, var91, -18);
                            continue;
                        }
                        if (var517 == 3302) {
                            var6 -= 2;
                            int var93 = class274.field4376[var6];
                            int var94 = class274.field4376[var6 + 1];
                            class274.field4376[var6++] = class123.method807(var93, var94, -1);
                            continue;
                        }
                        if (var517 == 3303) {
                            var6 -= 2;
                            int var95 = class274.field4376[var6 + 1];
                            int var96 = class274.field4376[var6];
                            class274.field4376[var6++] = class104.method632(var95, var96, 119);
                            continue;
                        }
                        if (var517 == 3304) {
                            var6--;
                            int var97 = class274.field4376[var6];
                            class274.field4376[var6++] = class118.method762(false, var97).field459;
                            continue;
                        }
                        if (var517 == 3305) {
                            var6--;
                            int var98 = class274.field4376[var6];
                            class274.field4376[var6++] = class187.field2984[var98];
                            continue;
                        }
                        if (var517 == 3306) {
                            var6--;
                            int var99 = class274.field4376[var6];
                            class274.field4376[var6++] = class102.field1382[var99];
                            continue;
                        }
                        if (var517 == 3307) {
                            var6--;
                            int var100 = class274.field4376[var6];
                            class274.field4376[var6++] = class208.field3327[var100];
                            continue;
                        }
                        if (var517 == 3308) {
                            int var101 = class244.field4011;
                            int var102 = (class286.field4571.field3818 >> 7) + class167.field2683;
                            int var103 = (class286.field4571.field3820 >> 7) + class181.field2883;
                            class274.field4376[var6++] = (var101 << 28) + (var102 << 14) + var103;
                            continue;
                        }
                        if (var517 == 3309) {
                            var6--;
                            int var104 = class274.field4376[var6];
                            class274.field4376[var6++] = class173.method1186(16383, var104 >> 14);
                            continue;
                        }
                        if (var517 == 3310) {
                            var6--;
                            int var105 = class274.field4376[var6];
                            class274.field4376[var6++] = var105 >> 28;
                            continue;
                        }
                        if (var517 == 3311) {
                            var6--;
                            int var106 = class274.field4376[var6];
                            class274.field4376[var6++] = class173.method1186(16383, var106);
                            continue;
                        }
                        if (var517 == 3312) {
                            class274.field4376[var6++] = class181.field2890 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3313) {
                            var6 -= 2;
                            int var107 = class274.field4376[var6 + 1];
                            int var108 = class274.field4376[var6] + 32768;
                            class274.field4376[var6++] = class98.method610(var107, var108, class288.method1939(arg2, -17));
                            continue;
                        }
                        if (var517 == 3314) {
                            var6 -= 2;
                            int var109 = class274.field4376[var6] + 32768;
                            int var110 = class274.field4376[var6 + 1];
                            class274.field4376[var6++] = class123.method807(var109, var110, class288.method1939(arg2, -2));
                            continue;
                        }
                        if (var517 == 3315) {
                            var6 -= 2;
                            int var111 = class274.field4376[var6] + 32768;
                            int var112 = class274.field4376[var6 + 1];
                            class274.field4376[var6++] = class104.method632(var112, var111, arg2 - 7);
                            continue;
                        }
                        if (var517 == 3316) {
                            if (class184.field2944 < 2) {
                                class274.field4376[var6++] = 0;
                            } else {
                                class274.field4376[var6++] = class184.field2944;
                            }
                            continue;
                        }
                        if (var517 == 3317) {
                            class274.field4376[var6++] = class160.field2557;
                            continue;
                        }
                        if (var517 == 3318) {
                            class274.field4376[var6++] = class115.field1638;
                            continue;
                        }
                        if (var517 == 3321) {
                            class274.field4376[var6++] = class124.field1930;
                            continue;
                        }
                        if (var517 == 3322) {
                            class274.field4376[var6++] = class106.field1422;
                            continue;
                        }
                        if (var517 == 3323) {
                            if (class148.field2324 >= 5 && class148.field2324 <= 9) {
                                class274.field4376[var6++] = 1;
                                continue;
                            }
                            class274.field4376[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3324) {
                            if (class148.field2324 >= 5 && class148.field2324 <= 9) {
                                class274.field4376[var6++] = class148.field2324;
                                continue;
                            }
                            class274.field4376[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3325) {
                            class274.field4376[var6++] = class224.field3602 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3326) {
                            class274.field4376[var6++] = class286.field4571.field4200;
                            continue;
                        }
                        if (var517 == 3327) {
                            class274.field4376[var6++] = class286.field4571.field4219.field2116 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3328) {
                            class274.field4376[var6++] = class54.field692 && !class123.field1777 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3329) {
                            class274.field4376[var6++] = class216.field3471 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3330) {
                            var6--;
                            int var113 = class274.field4376[var6];
                            class274.field4376[var6++] = class263.method1783(var113, (byte) 101);
                            continue;
                        }
                        if (var517 == 3331) {
                            var6 -= 2;
                            int var114 = class274.field4376[var6];
                            int var115 = class274.field4376[var6 + 1];
                            class274.field4376[var6++] = class74.method420(var115, var114, (byte) -22, false);
                            continue;
                        }
                        if (var517 == 3332) {
                            var6 -= 2;
                            int var116 = class274.field4376[var6];
                            int var117 = class274.field4376[var6 + 1];
                            class274.field4376[var6++] = class74.method420(var117, var116, (byte) -44, true);
                            continue;
                        }
                        if (var517 == 3333) {
                            class274.field4376[var6++] = class170.field2697;
                            continue;
                        }
                        if (var517 == 3335) {
                            class274.field4376[var6++] = class281.field4458;
                            continue;
                        }
                        if (var517 == 3336) {
                            var6 -= 4;
                            int var118 = class274.field4376[var6];
                            int var119 = class274.field4376[var6 + 1];
                            int var120 = (var119 << 14) + var118;
                            int var121 = class274.field4376[var6 + 2];
                            int var122 = (var121 << 28) + var120;
                            int var123 = class274.field4376[var6 + 3];
                            int var124 = var122 + var123;
                            class274.field4376[var6++] = var124;
                            continue;
                        }
                        if (var517 == 3337) {
                            class274.field4376[var6++] = class210.field3374;
                            continue;
                        }
                    } else if (var517 < 3500) {
                        if (var517 == 3400) {
                            var6 -= 2;
                            int var125 = class274.field4376[var6];
                            int var126 = class274.field4376[var6 + 1];
                            class285 var127 = class176.method1220(512, var125);
                            class287.field4587[var8++] = var127.method1905(112, var126);
                            continue;
                        }
                        if (var517 == 3408) {
                            var6 -= 4;
                            int var128 = class274.field4376[var6];
                            int var129 = class274.field4376[var6 + 1];
                            int var130 = class274.field4376[var6 + 3];
                            int var131 = class274.field4376[var6 + 2];
                            class285 var132 = class176.method1220(512, var131);
                            if (var132.field4528 == var128 && var132.field4547 == var129) {
                                if (var129 == 115) {
                                    class287.field4587[var8++] = var132.method1905(54, var130);
                                } else {
                                    class274.field4376[var6++] = var132.method1915((byte) 104, var130);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var517 == 3409) {
                            var6 -= 3;
                            int var133 = class274.field4376[var6];
                            int var134 = class274.field4376[var6 + 2];
                            int var135 = class274.field4376[var6 + 1];
                            if (var135 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class285 var136 = class176.method1220(512, var135);
                            if (var136.field4547 != var133) {
                                throw new RuntimeException("C3409-1");
                            }
                            class274.field4376[var6++] = var136.method1906(false, var134) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3410) {
                            var6--;
                            int var137 = class274.field4376[var6];
                            var8--;
                            String var138 = class287.field4587[var8];
                            if (var137 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class285 var139 = class176.method1220(arg2 ^ 0x201, var137);
                            if (var139.field4547 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class274.field4376[var6++] = var139.method1904(var138, 90) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3411) {
                            var6--;
                            int var140 = class274.field4376[var6];
                            class285 var141 = class176.method1220(512, var140);
                            class274.field4376[var6++] = var141.field4524.method703(false);
                            continue;
                        }
                    } else if (var517 < 3700) {
                        if (var517 == 3600) {
                            if (class7.field87 == 0) {
                                class274.field4376[var6++] = -2;
                            } else if (class7.field87 == 1) {
                                class274.field4376[var6++] = -1;
                            } else {
                                class274.field4376[var6++] = class88.field1091;
                            }
                            continue;
                        }
                        if (var517 == 3601) {
                            var6--;
                            int var142 = class274.field4376[var6];
                            if (class7.field87 == 2 && var142 < class88.field1091) {
                                class287.field4587[var8++] = class143.field2256[var142];
                                continue;
                            }
                            class287.field4587[var8++] = "";
                            continue;
                        }
                        if (var517 == 3602) {
                            var6--;
                            int var143 = class274.field4376[var6];
                            if (class7.field87 == 2 && class88.field1091 > var143) {
                                class274.field4376[var6++] = class188.field3055[var143];
                                continue;
                            }
                            class274.field4376[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3603) {
                            var6--;
                            int var144 = class274.field4376[var6];
                            if (class7.field87 == 2 && var144 < class88.field1091) {
                                class274.field4376[var6++] = client.field1605[var144];
                                continue;
                            }
                            class274.field4376[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3604) {
                            var6--;
                            int var145 = class274.field4376[var6];
                            var8--;
                            String var146 = class287.field4587[var8];
                            class110.method705(var145, var146, (byte) 121);
                            continue;
                        }
                        if (var517 == 3605) {
                            var8--;
                            String var147 = class287.field4587[var8];
                            class121.method787(class185.method1296((byte) -103, var147), (byte) 47);
                            continue;
                        }
                        if (var517 == 3606) {
                            var8--;
                            String var148 = class287.field4587[var8];
                            class129.method879(class185.method1296((byte) -103, var148), -1);
                            continue;
                        }
                        if (var517 == 3607) {
                            var8--;
                            String var149 = class287.field4587[var8];
                            class297.method1991(256, false, class185.method1296((byte) -103, var149));
                            continue;
                        }
                        if (var517 == 3608) {
                            var8--;
                            String var150 = class287.field4587[var8];
                            class210.method1479(class185.method1296((byte) -103, var150), -53);
                            continue;
                        }
                        if (var517 == 3609) {
                            var8--;
                            String var151 = class287.field4587[var8];
                            if (var151.startsWith("<img=0>") || var151.startsWith("<img=1>")) {
                                var151 = var151.substring(7);
                            }
                            class274.field4376[var6++] = class73.method412(0, var151) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3610) {
                            var6--;
                            int var152 = class274.field4376[var6];
                            if (class7.field87 == 2 && var152 < class88.field1091) {
                                class287.field4587[var8++] = class34.field443[var152];
                                continue;
                            }
                            class287.field4587[var8++] = "";
                            continue;
                        }
                        if (var517 == 3611) {
                            if (class15.field191 == null) {
                                class287.field4587[var8++] = "";
                            } else {
                                class287.field4587[var8++] = class213.method1493(class15.field191, (byte) -93);
                            }
                            continue;
                        }
                        if (var517 == 3612) {
                            if (class15.field191 == null) {
                                class274.field4376[var6++] = 0;
                            } else {
                                class274.field4376[var6++] = class28.field404;
                            }
                            continue;
                        }
                        if (var517 == 3613) {
                            var6--;
                            int var153 = class274.field4376[var6];
                            if (class15.field191 != null && var153 < class28.field404) {
                                class287.field4587[var8++] = class213.method1493(class17.field203[var153].field699, (byte) 100);
                                continue;
                            }
                            class287.field4587[var8++] = "";
                            continue;
                        }
                        if (var517 == 3614) {
                            var6--;
                            int var154 = class274.field4376[var6];
                            if (class15.field191 != null && class28.field404 > var154) {
                                class274.field4376[var6++] = class17.field203[var154].field696;
                                continue;
                            }
                            class274.field4376[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3615) {
                            var6--;
                            int var155 = class274.field4376[var6];
                            if (class15.field191 != null && class28.field404 > var155) {
                                class274.field4376[var6++] = class17.field203[var155].field698;
                                continue;
                            }
                            class274.field4376[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3616) {
                            class274.field4376[var6++] = class244.field3999;
                            continue;
                        }
                        if (var517 == 3617) {
                            var8--;
                            String var156 = class287.field4587[var8];
                            class269.method1804(var156, 43);
                            continue;
                        }
                        if (var517 == 3618) {
                            class274.field4376[var6++] = class262.field4248;
                            continue;
                        }
                        if (var517 == 3619) {
                            var8--;
                            String var157 = class287.field4587[var8];
                            class55.method308((byte) -30, class185.method1296((byte) -103, var157));
                            continue;
                        }
                        if (var517 == 3620) {
                            class222.method1571(113);
                            continue;
                        }
                        if (var517 == 3621) {
                            if (class7.field87 == 0) {
                                class274.field4376[var6++] = -1;
                            } else {
                                class274.field4376[var6++] = class198.field3141;
                            }
                            continue;
                        }
                        if (var517 == 3622) {
                            var6--;
                            int var158 = class274.field4376[var6];
                            if (class7.field87 != 0 && class198.field3141 > var158) {
                                class287.field4587[var8++] = class145.method1013(class53.field684[var158], 47);
                                continue;
                            }
                            class287.field4587[var8++] = "";
                            continue;
                        }
                        if (var517 == 3623) {
                            var8--;
                            String var159 = class287.field4587[var8];
                            if (var159.startsWith("<img=0>") || var159.startsWith("<img=1>")) {
                                var159 = var159.substring(7);
                            }
                            class274.field4376[var6++] = class155.method1077(-125, var159) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3624) {
                            var6--;
                            int var160 = class274.field4376[var6];
                            if (class17.field203 != null && var160 < class28.field404 && class17.field203[var160].field699.equalsIgnoreCase(class286.field4571.field4208)) {
                                class274.field4376[var6++] = 1;
                                continue;
                            }
                            class274.field4376[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3625) {
                            if (class77.field965 == null) {
                                class287.field4587[var8++] = "";
                            } else {
                                class287.field4587[var8++] = class213.method1493(class77.field965, (byte) 67);
                            }
                            continue;
                        }
                        if (var517 == 3626) {
                            var6--;
                            int var161 = class274.field4376[var6];
                            if (class15.field191 != null && var161 < class28.field404) {
                                class287.field4587[var8++] = class17.field203[var161].field706;
                                continue;
                            }
                            class287.field4587[var8++] = "";
                            continue;
                        }
                        if (var517 == 3627) {
                            var6--;
                            int var162 = class274.field4376[var6];
                            if (class7.field87 == 2 && var162 >= 0 && var162 < class88.field1091) {
                                class274.field4376[var6++] = class219.field3503[var162] ? 1 : 0;
                                continue;
                            }
                            class274.field4376[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3628) {
                            var8--;
                            String var163 = class287.field4587[var8];
                            if (var163.startsWith("<img=0>") || var163.startsWith("<img=1>")) {
                                var163 = var163.substring(7);
                            }
                            class274.field4376[var6++] = class208.method1464(-1, var163);
                            continue;
                        }
                        if (var517 == 3629) {
                            class274.field4376[var6++] = class36.field460;
                            continue;
                        }
                        if (var517 == 3630) {
                            var8--;
                            String var164 = class287.field4587[var8];
                            class297.method1991(256, true, class185.method1296((byte) -103, var164));
                            continue;
                        }
                        if (var517 == 3631) {
                            var6--;
                            int var165 = class274.field4376[var6];
                            class274.field4376[var6++] = class71.field893[var165] ? 1 : 0;
                            continue;
                        }
                    } else if (var517 < 4000) {
                        if (var517 == 3903) {
                            var6--;
                            int var459 = class274.field4376[var6];
                            class274.field4376[var6++] = class104.field1405[var459].method391(118);
                            continue;
                        }
                        if (var517 == 3904) {
                            var6--;
                            int var460 = class274.field4376[var6];
                            class274.field4376[var6++] = class104.field1405[var460].field866;
                            continue;
                        }
                        if (var517 == 3905) {
                            var6--;
                            int var461 = class274.field4376[var6];
                            class274.field4376[var6++] = class104.field1405[var461].field876;
                            continue;
                        }
                        if (var517 == 3906) {
                            var6--;
                            int var462 = class274.field4376[var6];
                            class274.field4376[var6++] = class104.field1405[var462].field879;
                            continue;
                        }
                        if (var517 == 3907) {
                            var6--;
                            int var463 = class274.field4376[var6];
                            class274.field4376[var6++] = class104.field1405[var463].field868;
                            continue;
                        }
                        if (var517 == 3908) {
                            var6--;
                            int var464 = class274.field4376[var6];
                            class274.field4376[var6++] = class104.field1405[var464].field874;
                            continue;
                        }
                        if (var517 == 3910) {
                            var6--;
                            int var465 = class274.field4376[var6];
                            int var466 = class104.field1405[var465].method390((byte) 102);
                            class274.field4376[var6++] = var466 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3911) {
                            var6--;
                            int var467 = class274.field4376[var6];
                            int var468 = class104.field1405[var467].method390((byte) 102);
                            class274.field4376[var6++] = var468 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3912) {
                            var6--;
                            int var469 = class274.field4376[var6];
                            int var470 = class104.field1405[var469].method390((byte) 102);
                            class274.field4376[var6++] = var470 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3913) {
                            var6--;
                            int var471 = class274.field4376[var6];
                            int var472 = class104.field1405[var471].method390((byte) 102);
                            class274.field4376[var6++] = var472 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var517 < 4100) {
                        if (var517 == 4000) {
                            var6 -= 2;
                            int var166 = class274.field4376[var6 + 1];
                            int var167 = class274.field4376[var6];
                            class274.field4376[var6++] = var166 + var167;
                            continue;
                        }
                        if (var517 == 4001) {
                            var6 -= 2;
                            int var168 = class274.field4376[var6];
                            int var169 = class274.field4376[var6 + 1];
                            class274.field4376[var6++] = var168 - var169;
                            continue;
                        }
                        if (var517 == 4002) {
                            var6 -= 2;
                            int var170 = class274.field4376[var6 + 1];
                            int var171 = class274.field4376[var6];
                            class274.field4376[var6++] = var170 * var171;
                            continue;
                        }
                        if (var517 == 4003) {
                            var6 -= 2;
                            int var172 = class274.field4376[var6];
                            int var173 = class274.field4376[var6 + 1];
                            class274.field4376[var6++] = var172 / var173;
                            continue;
                        }
                        if (var517 == 4004) {
                            var6--;
                            int var174 = class274.field4376[var6];
                            class274.field4376[var6++] = (int) (Math.random() * (double) var174);
                            continue;
                        }
                        if (var517 == 4005) {
                            var6--;
                            int var175 = class274.field4376[var6];
                            class274.field4376[var6++] = (int) ((double) (var175 + 1) * Math.random());
                            continue;
                        }
                        if (var517 == 4006) {
                            var6 -= 5;
                            int var176 = class274.field4376[var6];
                            int var177 = class274.field4376[var6 + 3];
                            int var178 = class274.field4376[var6 + 4];
                            int var179 = class274.field4376[var6 + 2];
                            int var180 = class274.field4376[var6 + 1];
                            class274.field4376[var6++] = (var180 - var176) * (var178 - var179) / (var177 - var179) + var176;
                            continue;
                        }
                        if (var517 == 4007) {
                            var6 -= 2;
                            long var181 = (long) class274.field4376[var6];
                            long var183 = (long) class274.field4376[var6 + 1];
                            class274.field4376[var6++] = (int) (var181 * var183 / 100L + var181);
                            continue;
                        }
                        if (var517 == 4008) {
                            var6 -= 2;
                            int var185 = class274.field4376[var6 + 1];
                            int var186 = class274.field4376[var6];
                            class274.field4376[var6++] = class154.method1048(0x1 << var185, var186);
                            continue;
                        }
                        if (var517 == 4009) {
                            var6 -= 2;
                            int var187 = class274.field4376[var6 + 1];
                            int var188 = class274.field4376[var6];
                            class274.field4376[var6++] = class173.method1186(var188, -(0x1 << var187) - 1);
                            continue;
                        }
                        if (var517 == 4010) {
                            var6 -= 2;
                            int var189 = class274.field4376[var6];
                            int var190 = class274.field4376[var6 + 1];
                            class274.field4376[var6++] = class173.method1186(0x1 << var190, var189) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var517 == 4011) {
                            var6 -= 2;
                            int var191 = class274.field4376[var6 + 1];
                            int var192 = class274.field4376[var6];
                            class274.field4376[var6++] = var192 % var191;
                            continue;
                        }
                        if (var517 == 4012) {
                            var6 -= 2;
                            int var193 = class274.field4376[var6 + 1];
                            int var194 = class274.field4376[var6];
                            if (var194 == 0) {
                                class274.field4376[var6++] = 0;
                            } else {
                                class274.field4376[var6++] = (int) Math.pow((double) var194, (double) var193);
                            }
                            continue;
                        }
                        if (var517 == 4013) {
                            var6 -= 2;
                            int var195 = class274.field4376[var6];
                            int var196 = class274.field4376[var6 + 1];
                            if (var195 == 0) {
                                class274.field4376[var6++] = 0;
                            } else if (var196 == 0) {
                                class274.field4376[var6++] = Integer.MAX_VALUE;
                            } else {
                                class274.field4376[var6++] = (int) Math.pow((double) var195, 1.0D / (double) var196);
                            }
                            continue;
                        }
                        if (var517 == 4014) {
                            var6 -= 2;
                            int var197 = class274.field4376[var6];
                            int var198 = class274.field4376[var6 + 1];
                            class274.field4376[var6++] = class173.method1186(var197, var198);
                            continue;
                        }
                        if (var517 == 4015) {
                            var6 -= 2;
                            int var199 = class274.field4376[var6];
                            int var200 = class274.field4376[var6 + 1];
                            class274.field4376[var6++] = class154.method1048(var200, var199);
                            continue;
                        }
                        if (var517 == 4016) {
                            var6 -= 2;
                            int var201 = class274.field4376[var6 + 1];
                            int var202 = class274.field4376[var6];
                            class274.field4376[var6++] = var201 <= var202 ? var201 : var202;
                            continue;
                        }
                        if (var517 == 4017) {
                            var6 -= 2;
                            int var203 = class274.field4376[var6];
                            int var204 = class274.field4376[var6 + 1];
                            class274.field4376[var6++] = var203 > var204 ? var203 : var204;
                            continue;
                        }
                        if (var517 == 4018) {
                            var6 -= 3;
                            long var205 = (long) class274.field4376[var6 + 1];
                            long var207 = (long) class274.field4376[var6 + 2];
                            long var209 = (long) class274.field4376[var6];
                            class274.field4376[var6++] = (int) (var207 * var209 / var205);
                            continue;
                        }
                    } else if (var517 < 4200) {
                        if (var517 == 4100) {
                            var8--;
                            String var409 = class287.field4587[var8];
                            var6--;
                            int var410 = class274.field4376[var6];
                            class287.field4587[var8++] = var409 + var410;
                            continue;
                        }
                        if (var517 == 4101) {
                            var8 -= 2;
                            String var411 = class287.field4587[var8];
                            String var412 = class287.field4587[var8 + 1];
                            class287.field4587[var8++] = var411 + var412;
                            continue;
                        }
                        if (var517 == 4102) {
                            var8--;
                            String var413 = class287.field4587[var8];
                            var6--;
                            int var414 = class274.field4376[var6];
                            class287.field4587[var8++] = var413 + class178.method1236(true, var414, 57);
                            continue;
                        }
                        if (var517 == 4103) {
                            var8--;
                            String var415 = class287.field4587[var8];
                            class287.field4587[var8++] = var415.toLowerCase();
                            continue;
                        }
                        if (var517 == 4104) {
                            var6--;
                            int var416 = class274.field4376[var6];
                            long var417 = ((long) var416 + 11745L) * 86400000L;
                            class242.field3990.setTime(new Date(var417));
                            int var419 = class242.field3990.get(5);
                            int var420 = class242.field3990.get(2);
                            int var421 = class242.field3990.get(1);
                            class287.field4587[var8++] = var419 + "-" + class106.field1419[var420] + "-" + var421;
                            continue;
                        }
                        if (var517 == 4105) {
                            var8 -= 2;
                            String var422 = class287.field4587[var8];
                            String var423 = class287.field4587[var8 + 1];
                            if (class286.field4571.field4219 != null && class286.field4571.field4219.field2116) {
                                class287.field4587[var8++] = var423;
                                continue;
                            }
                            class287.field4587[var8++] = var422;
                            continue;
                        }
                        if (var517 == 4106) {
                            var6--;
                            int var424 = class274.field4376[var6];
                            class287.field4587[var8++] = Integer.toString(var424);
                            continue;
                        }
                        if (var517 == 4107) {
                            var8 -= 2;
                            class274.field4376[var6++] = class289.method1944(class128.method872((byte) 84, class281.field4458, class287.field4587[var8 + 1], class287.field4587[var8]), (byte) -40);
                            continue;
                        }
                        if (var517 == 4108) {
                            var6 -= 2;
                            var8--;
                            String var425 = class287.field4587[var8];
                            int var426 = class274.field4376[var6];
                            int var427 = class274.field4376[var6 + 1];
                            class274.field4376[var6++] = class14.method75(0, var427).method673(var425, var426);
                            continue;
                        }
                        if (var517 == 4109) {
                            var6 -= 2;
                            var8--;
                            String var428 = class287.field4587[var8];
                            int var429 = class274.field4376[var6];
                            int var430 = class274.field4376[var6 + 1];
                            class274.field4376[var6++] = class14.method75(0, var430).method688(var428, var429);
                            continue;
                        }
                        if (var517 == 4110) {
                            var8 -= 2;
                            String var431 = class287.field4587[var8];
                            String var432 = class287.field4587[var8 + 1];
                            var6--;
                            if (class274.field4376[var6] == 1) {
                                class287.field4587[var8++] = var431;
                            } else {
                                class287.field4587[var8++] = var432;
                            }
                            continue;
                        }
                        if (var517 == 4111) {
                            var8--;
                            String var433 = class287.field4587[var8];
                            class287.field4587[var8++] = class109.method683(var433);
                            continue;
                        }
                        if (var517 == 4112) {
                            var6--;
                            int var434 = class274.field4376[var6];
                            var8--;
                            String var435 = class287.field4587[var8];
                            if (var434 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class287.field4587[var8++] = var435 + (char) var434;
                            continue;
                        }
                        if (var517 == 4113) {
                            var6--;
                            int var436 = class274.field4376[var6];
                            class274.field4376[var6++] = class121.method789((char) var436, 26) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4114) {
                            var6--;
                            int var437 = class274.field4376[var6];
                            class274.field4376[var6++] = class160.method1114(-123, (char) var437) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4115) {
                            var6--;
                            int var438 = class274.field4376[var6];
                            class274.field4376[var6++] = class159.method1112((char) var438, -128) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4116) {
                            var6--;
                            int var439 = class274.field4376[var6];
                            class274.field4376[var6++] = class244.method1703((char) var439, false) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4117) {
                            var8--;
                            String var440 = class287.field4587[var8];
                            if (var440 == null) {
                                class274.field4376[var6++] = 0;
                            } else {
                                class274.field4376[var6++] = var440.length();
                            }
                            continue;
                        }
                        if (var517 == 4118) {
                            var6 -= 2;
                            var8--;
                            String var441 = class287.field4587[var8];
                            int var442 = class274.field4376[var6 + 1];
                            int var443 = class274.field4376[var6];
                            class287.field4587[var8++] = var441.substring(var443, var442);
                            continue;
                        }
                        if (var517 == 4119) {
                            boolean var444 = false;
                            var8--;
                            String var445 = class287.field4587[var8];
                            StringBuffer var446 = new StringBuffer(var445.length());
                            for (int var447 = 0; var447 < var445.length(); var447++) {
                                char var448 = var445.charAt(var447);
                                if (var448 == '<') {
                                    var444 = true;
                                } else if (var448 == '>') {
                                    var444 = false;
                                } else if (!var444) {
                                    var446.append(var448);
                                }
                            }
                            class287.field4587[var8++] = var446.toString();
                            continue;
                        }
                        if (var517 == 4120) {
                            var6 -= 2;
                            var8--;
                            String var449 = class287.field4587[var8];
                            int var450 = class274.field4376[var6 + 1];
                            int var451 = class274.field4376[var6];
                            class274.field4376[var6++] = var449.indexOf(var451, var450);
                            continue;
                        }
                        if (var517 == 4121) {
                            var8 -= 2;
                            String var452 = class287.field4587[var8 + 1];
                            String var453 = class287.field4587[var8];
                            var6--;
                            int var454 = class274.field4376[var6];
                            class274.field4376[var6++] = var453.indexOf(var452, var454);
                            continue;
                        }
                        if (var517 == 4122) {
                            var6--;
                            int var455 = class274.field4376[var6];
                            class274.field4376[var6++] = Character.toLowerCase((char) var455);
                            continue;
                        }
                        if (var517 == 4123) {
                            var6--;
                            int var456 = class274.field4376[var6];
                            class274.field4376[var6++] = Character.toUpperCase((char) var456);
                            continue;
                        }
                        if (var517 == 4124) {
                            var6--;
                            boolean var457 = class274.field4376[var6] != 0;
                            var6--;
                            int var458 = class274.field4376[var6];
                            class287.field4587[var8++] = class210.method1475(0, (byte) -96, (long) var458, var457, class281.field4458);
                            continue;
                        }
                    } else if (var517 < 4300) {
                        if (var517 == 4200) {
                            var6--;
                            int var211 = class274.field4376[var6];
                            class287.field4587[var8++] = class256.method1753(-2, var211).field1504;
                            continue;
                        }
                        if (var517 == 4201) {
                            var6 -= 2;
                            int var212 = class274.field4376[var6 + 1];
                            int var213 = class274.field4376[var6];
                            class108 var214 = class256.method1753(-2, var213);
                            if (var212 >= 1 && var212 <= 5 && var214.field1475[var212 - 1] != null) {
                                class287.field4587[var8++] = var214.field1475[var212 - 1];
                                continue;
                            }
                            class287.field4587[var8++] = "";
                            continue;
                        }
                        if (var517 == 4202) {
                            var6 -= 2;
                            int var215 = class274.field4376[var6 + 1];
                            int var216 = class274.field4376[var6];
                            class108 var217 = class256.method1753(-2, var216);
                            if (var215 >= 1 && var215 <= 5 && var217.field1491[var215 - 1] != null) {
                                class287.field4587[var8++] = var217.field1491[var215 - 1];
                                continue;
                            }
                            class287.field4587[var8++] = "";
                            continue;
                        }
                        if (var517 == 4203) {
                            var6--;
                            int var218 = class274.field4376[var6];
                            class274.field4376[var6++] = class256.method1753(-2, var218).field1490;
                            continue;
                        }
                        if (var517 == 4204) {
                            var6--;
                            int var219 = class274.field4376[var6];
                            class274.field4376[var6++] = class256.method1753(-2, var219).field1492 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4205) {
                            var6--;
                            int var220 = class274.field4376[var6];
                            class108 var221 = class256.method1753(~arg2, var220);
                            if (var221.field1489 == -1 && var221.field1501 >= 0) {
                                class274.field4376[var6++] = var221.field1501;
                                continue;
                            }
                            class274.field4376[var6++] = var220;
                            continue;
                        }
                        if (var517 == 4206) {
                            var6--;
                            int var222 = class274.field4376[var6];
                            class108 var223 = class256.method1753(-2, var222);
                            if (var223.field1489 >= 0 && var223.field1501 >= 0) {
                                class274.field4376[var6++] = var223.field1501;
                                continue;
                            }
                            class274.field4376[var6++] = var222;
                            continue;
                        }
                        if (var517 == 4207) {
                            var6--;
                            int var224 = class274.field4376[var6];
                            class274.field4376[var6++] = class256.method1753(class288.method1939(arg2, -1), var224).field1476 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4208) {
                            var6 -= 2;
                            int var225 = class274.field4376[var6];
                            int var226 = class274.field4376[var6 + 1];
                            class258 var227 = class44.method250(var226, -76);
                            if (var227.method1763((byte) -126)) {
                                class287.field4587[var8++] = class256.method1753(arg2 - 3, var225).method654(var226, var227.field4178, (byte) 122);
                            } else {
                                class274.field4376[var6++] = class256.method1753(class288.method1939(arg2, -1), var225).method669(var226, var227.field4181, (byte) -37);
                            }
                            continue;
                        }
                        if (var517 == 4210) {
                            var6--;
                            int var228 = class274.field4376[var6];
                            var8--;
                            String var229 = class287.field4587[var8];
                            class279.method1865(-115, var229, var228 == 1);
                            class274.field4376[var6++] = class150.field2347;
                            continue;
                        }
                        if (var517 == 4211) {
                            if (class117.field1660 != null && class105.field1412 < class150.field2347) {
                                class274.field4376[var6++] = class173.method1186(class117.field1660[class105.field1412++], 65535);
                                continue;
                            }
                            class274.field4376[var6++] = -1;
                            continue;
                        }
                        if (var517 == 4212) {
                            class105.field1412 = 0;
                            continue;
                        }
                    } else if (var517 >= 4400) {
                        if (var517 < 4500) {
                            if (var517 == 4400) {
                                var6 -= 2;
                                int var230 = class274.field4376[var6 + 1];
                                int var231 = class274.field4376[var6];
                                class258 var232 = class44.method250(var230, -120);
                                if (var232.method1763((byte) 103)) {
                                    class287.field4587[var8++] = class256.method1749(var231, class288.method1939(arg2, 1)).method1619((byte) 127, var230, var232.field4178);
                                } else {
                                    class274.field4376[var6++] = class256.method1749(var231, 0).method1624(32, var232.field4181, var230);
                                }
                                continue;
                            }
                        } else if (var517 >= 4600) {
                            if (var517 < 5100) {
                                if (var517 == 5000) {
                                    class274.field4376[var6++] = class156.field2508;
                                    continue;
                                }
                                if (var517 == 5001) {
                                    class15.field197++;
                                    var6 -= 3;
                                    class156.field2508 = class274.field4376[var6];
                                    class21.field269 = class274.field4376[var6 + 1];
                                    class99.field1325 = class274.field4376[var6 + 2];
                                    class4.field57.method1932(false, 175);
                                    class4.field57.method580((byte) 89, class156.field2508);
                                    class4.field57.method580((byte) 127, class21.field269);
                                    class4.field57.method580((byte) 84, class99.field1325);
                                    continue;
                                }
                                if (var517 == 5002) {
                                    var6 -= 2;
                                    class157.field2531++;
                                    var8--;
                                    String var338 = class287.field4587[var8];
                                    int var339 = class274.field4376[var6 + 1];
                                    int var340 = class274.field4376[var6];
                                    class4.field57.method1932(false, 71);
                                    class4.field57.method590(class185.method1296((byte) -103, var338), arg2 ^ 0x3D40FE11);
                                    class4.field57.method580((byte) 89, var340 - 1);
                                    class4.field57.method580((byte) 72, var339);
                                    continue;
                                }
                                if (var517 == 5003) {
                                    var6--;
                                    int var341 = class274.field4376[var6];
                                    String var342 = null;
                                    if (var341 < 100) {
                                        var342 = class47.field591[var341];
                                    }
                                    if (var342 == null) {
                                        var342 = "";
                                    }
                                    class287.field4587[var8++] = var342;
                                    continue;
                                }
                                if (var517 == 5004) {
                                    var6--;
                                    int var343 = class274.field4376[var6];
                                    int var344 = -1;
                                    if (var343 < 100 && class47.field591[var343] != null) {
                                        var344 = class237.field3915[var343];
                                    }
                                    class274.field4376[var6++] = var344;
                                    continue;
                                }
                                if (var517 == 5005) {
                                    class274.field4376[var6++] = class21.field269;
                                    continue;
                                }
                                if (var517 == 5008) {
                                    var8--;
                                    String var345 = class287.field4587[var8];
                                    if (var345.startsWith("::")) {
                                        class283.method1902(var345, 12);
                                        continue;
                                    }
                                    if (class184.field2944 == 0 && (class54.field692 && !class123.field1777 || class216.field3471)) {
                                        continue;
                                    }
                                    byte var346 = 0;
                                    class213.field3421++;
                                    byte var347 = 0;
                                    String var348 = var345.toLowerCase();
                                    if (var348.startsWith(class54.field691)) {
                                        var346 = 0;
                                        var345 = var345.substring(class54.field691.length());
                                    } else if (var348.startsWith(class94.field1197)) {
                                        var345 = var345.substring(class94.field1197.length());
                                        var346 = 1;
                                    } else if (var348.startsWith(class244.field4012)) {
                                        var346 = 2;
                                        var345 = var345.substring(class244.field4012.length());
                                    } else if (var348.startsWith(class144.field2265)) {
                                        var345 = var345.substring(class144.field2265.length());
                                        var346 = 3;
                                    } else if (var348.startsWith(class177.field2808)) {
                                        var346 = 4;
                                        var345 = var345.substring(class177.field2808.length());
                                    } else if (var348.startsWith(class35.field458)) {
                                        var345 = var345.substring(class35.field458.length());
                                        var346 = 5;
                                    } else if (var348.startsWith(class297.field4692)) {
                                        var345 = var345.substring(class297.field4692.length());
                                        var346 = 6;
                                    } else if (var348.startsWith(class139.field2220)) {
                                        var346 = 7;
                                        var345 = var345.substring(class139.field2220.length());
                                    } else if (var348.startsWith(class282.field4500)) {
                                        var346 = 8;
                                        var345 = var345.substring(class282.field4500.length());
                                    } else if (var348.startsWith(class279.field4435)) {
                                        var346 = 9;
                                        var345 = var345.substring(class279.field4435.length());
                                    } else if (var348.startsWith(class261.field4231)) {
                                        var345 = var345.substring(class261.field4231.length());
                                        var346 = 10;
                                    } else if (var348.startsWith(class21.field270)) {
                                        var346 = 11;
                                        var345 = var345.substring(class21.field270.length());
                                    } else if (class281.field4458 != 0) {
                                        if (var348.startsWith(class183.field2921)) {
                                            var346 = 0;
                                            var345 = var345.substring(class183.field2921.length());
                                        } else if (var348.startsWith(class189.field3064)) {
                                            var346 = 1;
                                            var345 = var345.substring(class189.field3064.length());
                                        } else if (var348.startsWith(class210.field3351)) {
                                            var346 = 2;
                                            var345 = var345.substring(class210.field3351.length());
                                        } else if (var348.startsWith(class187.field2980)) {
                                            var345 = var345.substring(class187.field2980.length());
                                            var346 = 3;
                                        } else if (var348.startsWith(class62.field812)) {
                                            var346 = 4;
                                            var345 = var345.substring(class62.field812.length());
                                        } else if (var348.startsWith(class208.field3323)) {
                                            var345 = var345.substring(class208.field3323.length());
                                            var346 = 5;
                                        } else if (var348.startsWith(class225.field3615)) {
                                            var345 = var345.substring(class225.field3615.length());
                                            var346 = 6;
                                        } else if (var348.startsWith(class54.field688)) {
                                            var345 = var345.substring(class54.field688.length());
                                            var346 = 7;
                                        } else if (var348.startsWith(class92.field1154)) {
                                            var346 = 8;
                                            var345 = var345.substring(class92.field1154.length());
                                        } else if (var348.startsWith(class13.field173)) {
                                            var345 = var345.substring(class13.field173.length());
                                            var346 = 9;
                                        } else if (var348.startsWith(class246.field4059)) {
                                            var346 = 10;
                                            var345 = var345.substring(class246.field4059.length());
                                        } else if (var348.startsWith(class157.field2530)) {
                                            var345 = var345.substring(class157.field2530.length());
                                            var346 = 11;
                                        }
                                    }
                                    String var349 = var345.toLowerCase();
                                    if (var349.startsWith(class251.field4097)) {
                                        var345 = var345.substring(class251.field4097.length());
                                        var347 = 1;
                                    } else if (var349.startsWith(class166.field2681)) {
                                        var347 = 2;
                                        var345 = var345.substring(class166.field2681.length());
                                    } else if (var349.startsWith(class35.field457)) {
                                        var347 = 3;
                                        var345 = var345.substring(class35.field457.length());
                                    } else if (var349.startsWith(class192.field3090)) {
                                        var345 = var345.substring(class192.field3090.length());
                                        var347 = 4;
                                    } else if (var349.startsWith(class134.field2119)) {
                                        var347 = 5;
                                        var345 = var345.substring(class134.field2119.length());
                                    } else if (class281.field4458 != 0) {
                                        if (var349.startsWith(class274.field4383)) {
                                            var345 = var345.substring(class274.field4383.length());
                                            var347 = 1;
                                        } else if (var349.startsWith(class118.field1678)) {
                                            var345 = var345.substring(class118.field1678.length());
                                            var347 = 2;
                                        } else if (var349.startsWith(class34.field439)) {
                                            var347 = 3;
                                            var345 = var345.substring(class34.field439.length());
                                        } else if (var349.startsWith(class166.field2682)) {
                                            var347 = 4;
                                            var345 = var345.substring(class166.field2682.length());
                                        } else if (var349.startsWith(class129.field2074)) {
                                            var345 = var345.substring(class129.field2074.length());
                                            var347 = 5;
                                        }
                                    }
                                    class4.field57.method1932(false, 88);
                                    class4.field57.method580((byte) 91, 0);
                                    int var350 = class4.field57.field1228;
                                    class4.field57.method580((byte) 69, var346);
                                    class4.field57.method580((byte) 101, var347);
                                    class122.method792(var345, true, class4.field57);
                                    class4.field57.method544(-3866, class4.field57.field1228 - var350);
                                    continue;
                                }
                                if (var517 == 5009) {
                                    var8 -= 2;
                                    String var351 = class287.field4587[var8];
                                    String var352 = class287.field4587[var8 + 1];
                                    if (class184.field2944 != 0 || (!class54.field692 || class123.field1777) && !class216.field3471) {
                                        class210.field3354++;
                                        class4.field57.method1932(false, 129);
                                        class4.field57.method580((byte) 127, 0);
                                        int var353 = class4.field57.field1228;
                                        class4.field57.method590(class185.method1296((byte) -103, var351), 1027669520);
                                        class122.method792(var352, true, class4.field57);
                                        class4.field57.method544(-3866, class4.field57.field1228 - var353);
                                    }
                                    continue;
                                }
                                if (var517 == 5010) {
                                    var6--;
                                    int var354 = class274.field4376[var6];
                                    String var355 = null;
                                    if (var354 < 100) {
                                        var355 = class63.field821[var354];
                                    }
                                    if (var355 == null) {
                                        var355 = "";
                                    }
                                    class287.field4587[var8++] = var355;
                                    continue;
                                }
                                if (var517 == 5011) {
                                    var6--;
                                    int var356 = class274.field4376[var6];
                                    String var357 = null;
                                    if (var356 < 100) {
                                        var357 = class51.field667[var356];
                                    }
                                    if (var357 == null) {
                                        var357 = "";
                                    }
                                    class287.field4587[var8++] = var357;
                                    continue;
                                }
                                if (var517 == 5012) {
                                    var6--;
                                    int var358 = class274.field4376[var6];
                                    int var359 = -1;
                                    if (var358 < 100) {
                                        var359 = class165.field2620[var358];
                                    }
                                    class274.field4376[var6++] = var359;
                                    continue;
                                }
                                if (var517 == 5015) {
                                    String var360;
                                    if (class286.field4571 == null || class286.field4571.field4208 == null) {
                                        var360 = class247.field4080;
                                    } else {
                                        var360 = class286.field4571.method1770(-1);
                                    }
                                    class287.field4587[var8++] = var360;
                                    continue;
                                }
                                if (var517 == 5016) {
                                    class274.field4376[var6++] = class99.field1325;
                                    continue;
                                }
                                if (var517 == 5017) {
                                    class274.field4376[var6++] = class11.field123;
                                    continue;
                                }
                                if (var517 == 5050) {
                                    var6--;
                                    int var361 = class274.field4376[var6];
                                    class287.field4587[var8++] = class15.method79(1, var361).field255;
                                    continue;
                                }
                                if (var517 == 5051) {
                                    var6--;
                                    int var362 = class274.field4376[var6];
                                    class20 var363 = class15.method79(1, var362);
                                    if (var363.field260 == null) {
                                        class274.field4376[var6++] = 0;
                                    } else {
                                        class274.field4376[var6++] = var363.field260.length;
                                    }
                                    continue;
                                }
                                if (var517 == 5052) {
                                    var6 -= 2;
                                    int var364 = class274.field4376[var6];
                                    int var365 = class274.field4376[var6 + 1];
                                    class20 var366 = class15.method79(1, var364);
                                    int var367 = var366.field260[var365];
                                    class274.field4376[var6++] = var367;
                                    continue;
                                }
                                if (var517 == 5053) {
                                    var6--;
                                    int var368 = class274.field4376[var6];
                                    class20 var369 = class15.method79(1, var368);
                                    if (var369.field257 == null) {
                                        class274.field4376[var6++] = 0;
                                    } else {
                                        class274.field4376[var6++] = var369.field257.length;
                                    }
                                    continue;
                                }
                                if (var517 == 5054) {
                                    var6 -= 2;
                                    int var370 = class274.field4376[var6];
                                    int var371 = class274.field4376[var6 + 1];
                                    class274.field4376[var6++] = class15.method79(1, var370).field257[var371];
                                    continue;
                                }
                                if (var517 == 5055) {
                                    var6--;
                                    int var372 = class274.field4376[var6];
                                    class287.field4587[var8++] = class155.method1065(var372, false).method1835(true);
                                    continue;
                                }
                                if (var517 == 5056) {
                                    var6--;
                                    int var373 = class274.field4376[var6];
                                    class273 var374 = class155.method1065(var373, false);
                                    if (var374.field4361 == null) {
                                        class274.field4376[var6++] = 0;
                                    } else {
                                        class274.field4376[var6++] = var374.field4361.length;
                                    }
                                    continue;
                                }
                                if (var517 == 5057) {
                                    var6 -= 2;
                                    int var375 = class274.field4376[var6 + 1];
                                    int var376 = class274.field4376[var6];
                                    class274.field4376[var6++] = class155.method1065(var376, false).field4361[var375];
                                    continue;
                                }
                                if (var517 == 5058) {
                                    class30.field416 = new class103();
                                    var6--;
                                    class30.field416.field1390 = class274.field4376[var6];
                                    class30.field416.field1391 = class155.method1065(class30.field416.field1390, false);
                                    class30.field416.field1388 = new int[class30.field416.field1391.method1827(true)];
                                    continue;
                                }
                                if (var517 == 5059) {
                                    class4.field57.method1932(false, 79);
                                    class126.field2020++;
                                    class4.field57.method580((byte) 110, 0);
                                    int var377 = class4.field57.field1228;
                                    class4.field57.method580((byte) 85, 0);
                                    class4.field57.method572(true, class30.field416.field1390);
                                    class30.field416.field1391.method1831(class4.field57, 0, class30.field416.field1388);
                                    class4.field57.method544(-3866, class4.field57.field1228 - var377);
                                    continue;
                                }
                                if (var517 == 5060) {
                                    class164.field2615++;
                                    var8--;
                                    String var378 = class287.field4587[var8];
                                    class4.field57.method1932(false, 113);
                                    class4.field57.method580((byte) 64, 0);
                                    int var379 = class4.field57.field1228;
                                    class4.field57.method590(class185.method1296((byte) -103, var378), arg2 + 1027669519);
                                    class4.field57.method572(true, class30.field416.field1390);
                                    class30.field416.field1391.method1831(class4.field57, 0, class30.field416.field1388);
                                    class4.field57.method544(-3866, class4.field57.field1228 - var379);
                                    continue;
                                }
                                if (var517 == 5061) {
                                    class126.field2020++;
                                    class4.field57.method1932(false, 79);
                                    class4.field57.method580((byte) 99, 0);
                                    int var380 = class4.field57.field1228;
                                    class4.field57.method580((byte) 80, 1);
                                    class4.field57.method572(true, class30.field416.field1390);
                                    class30.field416.field1391.method1831(class4.field57, arg2 ^ 0x1, class30.field416.field1388);
                                    class4.field57.method544(-3866, class4.field57.field1228 - var380);
                                    continue;
                                }
                                if (var517 == 5062) {
                                    var6 -= 2;
                                    int var381 = class274.field4376[var6];
                                    int var382 = class274.field4376[var6 + 1];
                                    class274.field4376[var6++] = class15.method79(1, var381).field256[var382];
                                    continue;
                                }
                                if (var517 == 5063) {
                                    var6 -= 2;
                                    int var383 = class274.field4376[var6];
                                    int var384 = class274.field4376[var6 + 1];
                                    class274.field4376[var6++] = class15.method79(class288.method1939(arg2, 0), var383).field262[var384];
                                    continue;
                                }
                                if (var517 == 5064) {
                                    var6 -= 2;
                                    int var385 = class274.field4376[var6 + 1];
                                    int var386 = class274.field4376[var6];
                                    if (var385 == -1) {
                                        class274.field4376[var6++] = -1;
                                    } else {
                                        class274.field4376[var6++] = class15.method79(1, var386).method109(arg2 + 106, (char) var385);
                                    }
                                    continue;
                                }
                                if (var517 == 5065) {
                                    var6 -= 2;
                                    int var387 = class274.field4376[var6];
                                    int var388 = class274.field4376[var6 + 1];
                                    if (var388 == -1) {
                                        class274.field4376[var6++] = -1;
                                    } else {
                                        class274.field4376[var6++] = class15.method79(1, var387).method112((char) var388, 16);
                                    }
                                    continue;
                                }
                                if (var517 == 5066) {
                                    var6--;
                                    int var389 = class274.field4376[var6];
                                    class274.field4376[var6++] = class155.method1065(var389, false).method1827(true);
                                    continue;
                                }
                                if (var517 == 5067) {
                                    var6 -= 2;
                                    int var390 = class274.field4376[var6];
                                    int var391 = class274.field4376[var6 + 1];
                                    int var392 = class155.method1065(var390, false).method1826(110, var391);
                                    class274.field4376[var6++] = var392;
                                    continue;
                                }
                                if (var517 == 5068) {
                                    var6 -= 2;
                                    int var393 = class274.field4376[var6];
                                    int var394 = class274.field4376[var6 + 1];
                                    class30.field416.field1388[var393] = var394;
                                    continue;
                                }
                                if (var517 == 5069) {
                                    var6 -= 2;
                                    int var395 = class274.field4376[var6 + 1];
                                    int var396 = class274.field4376[var6];
                                    class30.field416.field1388[var396] = var395;
                                    continue;
                                }
                                if (var517 == 5070) {
                                    var6 -= 3;
                                    int var397 = class274.field4376[var6];
                                    int var398 = class274.field4376[var6 + 1];
                                    int var399 = class274.field4376[var6 + 2];
                                    class273 var400 = class155.method1065(var397, false);
                                    if (var400.method1826(arg2 + 106, var398) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class274.field4376[var6++] = var400.method1828(var398, var399, false);
                                    continue;
                                }
                                if (var517 == 5071) {
                                    var8--;
                                    String var401 = class287.field4587[var8];
                                    var6--;
                                    boolean var402 = class274.field4376[var6] == 1;
                                    class71.method398(var401, true, var402);
                                    class274.field4376[var6++] = class150.field2347;
                                    continue;
                                }
                                if (var517 == 5072) {
                                    if (class117.field1660 != null && class150.field2347 > class105.field1412) {
                                        class274.field4376[var6++] = class173.method1186(class117.field1660[class105.field1412++], 65535);
                                        continue;
                                    }
                                    class274.field4376[var6++] = -1;
                                    continue;
                                }
                                if (var517 == 5073) {
                                    class105.field1412 = 0;
                                    continue;
                                }
                            } else if (var517 < 5200) {
                                if (var517 == 5100) {
                                    if (class36.field467[86]) {
                                        class274.field4376[var6++] = 1;
                                    } else {
                                        class274.field4376[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var517 == 5101) {
                                    if (class36.field467[82]) {
                                        class274.field4376[var6++] = 1;
                                    } else {
                                        class274.field4376[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var517 == 5102) {
                                    if (class36.field467[81]) {
                                        class274.field4376[var6++] = 1;
                                    } else {
                                        class274.field4376[var6++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var517 < 5300) {
                                if (var517 == 5200) {
                                    var6--;
                                    class121.method790(class274.field4376[var6], 22);
                                    continue;
                                }
                                if (var517 == 5201) {
                                    class274.field4376[var6++] = class82.method451(-22343);
                                    continue;
                                }
                                if (var517 == 5202) {
                                    var6--;
                                    class61.method354(class274.field4376[var6], -30265);
                                    continue;
                                }
                                if (var517 == 5203) {
                                    var8--;
                                    class80.method446(class287.field4587[var8], arg2 - 574423859);
                                    continue;
                                }
                                if (var517 == 5204) {
                                    class287.field4587[var8 - 1] = class230.method1642(-1, class287.field4587[var8 - 1]);
                                    continue;
                                }
                                if (var517 == 5205) {
                                    var6--;
                                    class96.method554(class274.field4376[var6], -1, -1, (byte) 94);
                                    continue;
                                }
                                if (var517 == 5206) {
                                    var6--;
                                    int var300 = class274.field4376[var6];
                                    class148 var301 = class56.method313(var300 & 0x3FFF, arg2 + 120, var300 >> 14 & 0x3FFF);
                                    if (var301 == null) {
                                        class274.field4376[var6++] = -1;
                                    } else {
                                        class274.field4376[var6++] = var301.field2333;
                                    }
                                    continue;
                                }
                                if (var517 == 5207) {
                                    var6--;
                                    class148 var302 = class94.method526(class274.field4376[var6], arg2 ^ 0xFFFFFF97);
                                    if (var302 != null && var302.field2337 != null) {
                                        class287.field4587[var8++] = var302.field2337;
                                        continue;
                                    }
                                    class287.field4587[var8++] = "";
                                    continue;
                                }
                                if (var517 == 5208) {
                                    class274.field4376[var6++] = class162.field2575;
                                    class274.field4376[var6++] = class162.field2577;
                                    continue;
                                }
                                if (var517 == 5209) {
                                    class274.field4376[var6++] = class220.field3524 + class105.field1413;
                                    class274.field4376[var6++] = class42.field524 + class7.field88 - class224.field3606 - 1;
                                    continue;
                                }
                                if (var517 == 5210) {
                                    var6--;
                                    int var303 = class274.field4376[var6];
                                    class148 var304 = class94.method526(var303, -96);
                                    if (var304 == null) {
                                        class274.field4376[var6++] = 0;
                                        class274.field4376[var6++] = 0;
                                    } else {
                                        class274.field4376[var6++] = class173.method1186(268426829, var304.field2321) >> 14;
                                        class274.field4376[var6++] = class173.method1186(var304.field2321, 16383);
                                    }
                                    continue;
                                }
                                if (var517 == 5211) {
                                    var6--;
                                    int var305 = class274.field4376[var6];
                                    class148 var306 = class94.method526(var305, arg2 ^ 0xFFFFFFC2);
                                    if (var306 == null) {
                                        class274.field4376[var6++] = 0;
                                        class274.field4376[var6++] = 0;
                                    } else {
                                        class274.field4376[var6++] = var306.field2334 - var306.field2316;
                                        class274.field4376[var6++] = var306.field2319 - var306.field2330;
                                    }
                                    continue;
                                }
                                if (var517 == 5212) {
                                    int var307 = class41.method223((byte) 101);
                                    int var308 = 0;
                                    String var309;
                                    if (var307 == -1) {
                                        var309 = "";
                                    } else {
                                        var309 = class209.field3336.field492[var307];
                                        var308 = class209.field3336.method216(var307, -7010);
                                    }
                                    String var310 = class5.method32((byte) 62, var309, " ", "<br>");
                                    class287.field4587[var8++] = var310;
                                    class274.field4376[var6++] = var308;
                                    continue;
                                }
                                if (var517 == 5213) {
                                    int var311 = class75.method422(true);
                                    int var312 = 0;
                                    String var313;
                                    if (var311 == -1) {
                                        var313 = "";
                                    } else {
                                        var313 = class209.field3336.field492[var311];
                                        var312 = class209.field3336.method216(var311, -7010);
                                    }
                                    String var314 = class5.method32((byte) 62, var313, " ", "<br>");
                                    class287.field4587[var8++] = var314;
                                    class274.field4376[var6++] = var312;
                                    continue;
                                }
                                if (var517 == 5214) {
                                    var6--;
                                    int var315 = class274.field4376[var6];
                                    class148 var316 = class270.method1816(1123005260);
                                    if (var316 != null) {
                                        int[] var317 = var316.method1020(var315 & 0x3FFF, (byte) 63, (var315 & 0x349271A0) >> 28, (var315 & 0xFFFDB6F) >> 14);
                                        if (var317 != null) {
                                            client.method725(var317[2], var317[1], (byte) 98);
                                        }
                                    }
                                    continue;
                                }
                                if (var517 == 5215) {
                                    var6 -= 2;
                                    int var318 = class274.field4376[var6 + 1];
                                    int var319 = class274.field4376[var6];
                                    boolean var320 = false;
                                    class22 var321 = class61.method356(500, var319 & 0x3FFF, var319 >> 14 & 0x3FFF);
                                    for (class148 var322 = (class148) var321.method124(0); var322 != null; var322 = (class148) var321.method122(arg2 + 88)) {
                                        if (var322.field2333 == var318) {
                                            var320 = true;
                                            break;
                                        }
                                    }
                                    if (var320) {
                                        class274.field4376[var6++] = 1;
                                    } else {
                                        class274.field4376[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var517 == 5216) {
                                    var6--;
                                    int var323 = class274.field4376[var6];
                                    class213.method1497(60, var323);
                                    continue;
                                }
                                if (var517 == 5217) {
                                    var6--;
                                    int var324 = class274.field4376[var6];
                                    if (class296.method1981(-24032, var324)) {
                                        class274.field4376[var6++] = 1;
                                    } else {
                                        class274.field4376[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var517 == 5218) {
                                    var6--;
                                    int var325 = class274.field4376[var6];
                                    class148 var326 = class94.method526(var325, -79);
                                    if (var326 == null) {
                                        class274.field4376[var6++] = -1;
                                    } else {
                                        class274.field4376[var6++] = var326.field2320;
                                    }
                                    continue;
                                }
                                if (var517 == 5219) {
                                    var8--;
                                    class172.method1184(class287.field4587[var8], -2728);
                                    continue;
                                }
                                if (var517 == 5220) {
                                    class274.field4376[var6++] = class113.field1622 == 100 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 5221) {
                                    var6--;
                                    int var327 = class274.field4376[var6];
                                    client.method725(var327 & 0x3FFF, var327 >> 14 & 0x3FFF, (byte) 98);
                                    continue;
                                }
                                if (var517 == 5222) {
                                    class148 var328 = class270.method1816(1123005260);
                                    if (var328 == null) {
                                        class274.field4376[var6++] = -1;
                                        class274.field4376[var6++] = -1;
                                    } else {
                                        int[] var329 = var328.method1025(class220.field3524 + class105.field1413, class7.field88 - (class224.field3606 - class42.field524) + -1, 12800);
                                        if (var329 == null) {
                                            class274.field4376[var6++] = -1;
                                            class274.field4376[var6++] = -1;
                                        } else {
                                            class274.field4376[var6++] = var329[1];
                                            class274.field4376[var6++] = var329[2];
                                        }
                                    }
                                    continue;
                                }
                                if (var517 == 5223) {
                                    var6 -= 2;
                                    int var330 = class274.field4376[var6];
                                    int var331 = class274.field4376[var6 + 1];
                                    class96.method554(var330, var331 & 0x3FFF, (var331 & 0xFFFF6A4) >> 14, (byte) 55);
                                    continue;
                                }
                                if (var517 == 5224) {
                                    var6--;
                                    int var332 = class274.field4376[var6];
                                    class148 var333 = class270.method1816(arg2 ^ 0x42EFB34D);
                                    if (var333 == null) {
                                        class274.field4376[var6++] = -1;
                                        class274.field4376[var6++] = -1;
                                    } else {
                                        int[] var334 = var333.method1020(var332 & 0x3FFF, (byte) 63, var332 >> 28 & 0x3, (var332 & 0xFFFDE57) >> 14);
                                        if (var334 == null) {
                                            class274.field4376[var6++] = -1;
                                            class274.field4376[var6++] = -1;
                                        } else {
                                            class274.field4376[var6++] = var334[1];
                                            class274.field4376[var6++] = var334[2];
                                        }
                                    }
                                    continue;
                                }
                                if (var517 == 5225) {
                                    var6--;
                                    int var335 = class274.field4376[var6];
                                    class148 var336 = class270.method1816(1123005260);
                                    if (var336 == null) {
                                        class274.field4376[var6++] = -1;
                                        class274.field4376[var6++] = -1;
                                    } else {
                                        int[] var337 = var336.method1025(var335 >> 14 & 0x3FFF, var335 & 0x3FFF, 12800);
                                        if (var337 == null) {
                                            class274.field4376[var6++] = -1;
                                            class274.field4376[var6++] = -1;
                                        } else {
                                            class274.field4376[var6++] = var337[1];
                                            class274.field4376[var6++] = var337[2];
                                        }
                                    }
                                    continue;
                                }
                            } else if (var517 < 5400) {
                                if (var517 == 5300) {
                                    var6 -= 2;
                                    class274.field4376[var6++] = 0;
                                    continue;
                                }
                                if (var517 == 5301) {
                                    continue;
                                }
                                if (var517 == 5302) {
                                    class274.field4376[var6++] = 0;
                                    continue;
                                }
                                if (var517 == 5303) {
                                    var6--;
                                    class274.field4376[var6++] = 0;
                                    class274.field4376[var6++] = 0;
                                    continue;
                                }
                                if (var517 == 5305) {
                                    byte var297 = -1;
                                    class274.field4376[var6++] = var297;
                                    continue;
                                }
                                if (var517 == 5306) {
                                    class274.field4376[var6++] = class192.method1326((byte) -89);
                                    continue;
                                }
                                if (var517 == 5307) {
                                    var6--;
                                    int var298 = class274.field4376[var6];
                                    if (var298 < 0 || var298 > 2) {
                                        var298 = 0;
                                    }
                                    class11.method53(-1, -1, false, 3, var298);
                                    continue;
                                }
                                if (var517 == 5308) {
                                    class274.field4376[var6++] = class67.field855;
                                    continue;
                                }
                                if (var517 == 5309) {
                                    var6--;
                                    int var299 = class274.field4376[var6];
                                    if (var299 < 0 || var299 > 2) {
                                        var299 = 0;
                                    }
                                    class67.field855 = var299;
                                    class111.method716(0, class194.field3107);
                                    continue;
                                }
                            } else if (var517 < 5500) {
                                if (var517 == 5400) {
                                    var8 -= 2;
                                    class5.field72++;
                                    String var233 = class287.field4587[var8];
                                    var6--;
                                    int var234 = class274.field4376[var6];
                                    String var235 = class287.field4587[var8 + 1];
                                    class4.field57.method1932(false, 135);
                                    class4.field57.method580((byte) 99, class115.method753(var233, (byte) 58) - (-class115.method753(var235, (byte) 119) - 1));
                                    class4.field57.method566((byte) -67, var233);
                                    class4.field57.method566((byte) -108, var235);
                                    class4.field57.method580((byte) 72, var234);
                                    continue;
                                }
                                if (var517 == 5401) {
                                    var6 -= 2;
                                    class137.field2169[class274.field4376[var6]] = (short) class288.method1938(true, class274.field4376[var6 + 1]);
                                    class153.method1043(arg2 ^ 0xFFFFD85A);
                                    class171.method1178(arg2 ^ 0x1);
                                    class261.method1774(arg2 - 126);
                                    class2.method9(true);
                                    class275.method1844((byte) 103);
                                    continue;
                                }
                                if (var517 == 5405) {
                                    var6 -= 2;
                                    int var236 = class274.field4376[var6];
                                    int var237 = class274.field4376[var6 + 1];
                                    if (var236 >= 0 && var236 < 2) {
                                        class56.field725[var236] = new int[var237 << 1][4];
                                    }
                                    continue;
                                }
                                if (var517 == 5406) {
                                    var6 -= 7;
                                    int var238 = class274.field4376[var6 + 3];
                                    int var239 = class274.field4376[var6];
                                    int var240 = class274.field4376[var6 + 1] << 1;
                                    int var241 = class274.field4376[var6 + 5];
                                    int var242 = class274.field4376[var6 + 2];
                                    int var243 = class274.field4376[var6 + 4];
                                    int var244 = class274.field4376[var6 + 6];
                                    if (var239 >= 0 && var239 < 2 && class56.field725[var239] != null && var240 >= 0 && var240 < class56.field725[var239].length) {
                                        class56.field725[var239][var240] = new int[] { (class173.method1186(268424810, var242) >> 14) * 128, var238, class173.method1186(16383, var242) * 128, var244 };
                                        class56.field725[var239][var240 + 1] = new int[] { (class173.method1186(var243, 268428711) >> 14) * 128, var241, class173.method1186(var243, 16383) * 128 };
                                    }
                                    continue;
                                }
                                if (var517 == 5407) {
                                    var6--;
                                    int var245 = class56.field725[class274.field4376[var6]].length >> 1;
                                    class274.field4376[var6++] = var245;
                                    continue;
                                }
                                if (var517 == 5411) {
                                    if (class41.field517 == null) {
                                        class46.method259(false, false, class154.method1053(0));
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var517 == 5419) {
                                    String var246 = "";
                                    if (class283.field4507 != null) {
                                        if (class283.field4507.field3992 == null) {
                                            var246 = class183.method1276(arg2 + 254, class283.field4507.field3994);
                                        } else {
                                            var246 = (String) class283.field4507.field3992;
                                        }
                                    }
                                    class287.field4587[var8++] = var246;
                                    continue;
                                }
                                if (var517 == 5420) {
                                    class274.field4376[var6++] = class48.field615 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 5421) {
                                    var8--;
                                    String var247 = class287.field4587[var8];
                                    var6--;
                                    boolean var248 = class274.field4376[var6] == 1;
                                    String var249 = class154.method1053(arg2 - 1) + var247;
                                    if (class41.field517 == null && (!var248 || class48.field615 == 3 || !class48.field608.startsWith("win") || class22.field291)) {
                                        class46.method259(var248, false, var249);
                                        continue;
                                    }
                                    class90.field1127 = var248;
                                    class136.field2156 = var249;
                                    class23.field302 = class194.field3107.method275(var249, 120);
                                    continue;
                                }
                                if (var517 == 5422) {
                                    var8 -= 2;
                                    String var250 = class287.field4587[var8];
                                    String var251 = class287.field4587[var8 + 1];
                                    var6--;
                                    int var252 = class274.field4376[var6];
                                    if (var250.length() > 0) {
                                        if (class21.field276 == null) {
                                            class21.field276 = new String[class110.field1576[class297.field4695]];
                                        }
                                        class21.field276[var252] = var250;
                                    }
                                    if (var251.length() > 0) {
                                        if (class297.field4697 == null) {
                                            class297.field4697 = new String[class110.field1576[class297.field4695]];
                                        }
                                        class297.field4697[var252] = var251;
                                    }
                                    continue;
                                }
                                if (var517 == 5423) {
                                    var8--;
                                    System.out.println(class287.field4587[var8]);
                                    continue;
                                }
                                if (var517 == 5424) {
                                    var6 -= 11;
                                    class275.field4401 = class274.field4376[var6];
                                    class164.field2614 = class274.field4376[var6 + 1];
                                    class215.field3457 = class274.field4376[var6 + 2];
                                    class120.field1707 = class274.field4376[var6 + 3];
                                    class106.field1430 = class274.field4376[var6 + 4];
                                    class189.field3062 = class274.field4376[var6 + 5];
                                    class201.field3182 = class274.field4376[var6 + 6];
                                    class90.field1116 = class274.field4376[var6 + 7];
                                    class235.field3878 = class274.field4376[var6 + 8];
                                    class134.field2117 = class274.field4376[var6 + 9];
                                    client.field1617 = class274.field4376[var6 + 10];
                                    class147.field2302.method938(class106.field1430, 843075268);
                                    class147.field2302.method938(class189.field3062, 843075268);
                                    class147.field2302.method938(class201.field3182, arg2 + 843075267);
                                    class147.field2302.method938(class90.field1116, arg2 + 843075267);
                                    class147.field2302.method938(class235.field3878, 843075268);
                                    class164.field2607 = true;
                                    continue;
                                }
                                if (var517 == 5425) {
                                    class188.method1310(93);
                                    class164.field2607 = false;
                                    continue;
                                }
                                if (var517 == 5426) {
                                    var6--;
                                    class81.field1007 = class274.field4376[var6];
                                    continue;
                                }
                                if (var517 == 5427) {
                                    var6 -= 2;
                                    class153.field2379 = class274.field4376[var6];
                                    class59.field761 = class274.field4376[var6 + 1];
                                    continue;
                                }
                                if (var517 == 5428) {
                                    var6 -= 2;
                                    int var253 = class274.field4376[var6];
                                    int var254 = class274.field4376[var6 + 1];
                                    class274.field4376[var6++] = class132.method897((byte) 27, var253, var254) ? 1 : 0;
                                    continue;
                                }
                            } else if (var517 < 5600) {
                                if (var517 == 5500) {
                                    var6 -= 4;
                                    int var255 = class274.field4376[var6];
                                    int var256 = class274.field4376[var6 + 3];
                                    int var257 = class274.field4376[var6 + 2];
                                    int var258 = class274.field4376[var6 + 1];
                                    class5.method33(false, var256, (var255 >> 14 & 0x3FFF) - class167.field2683, var258, (var255 & 0x3FFF) - class181.field2883, 116, var257);
                                    continue;
                                }
                                if (var517 == 5501) {
                                    var6 -= 4;
                                    int var259 = class274.field4376[var6];
                                    int var260 = class274.field4376[var6 + 2];
                                    int var261 = class274.field4376[var6 + 3];
                                    int var262 = class274.field4376[var6 + 1];
                                    class274.method1842((var259 & 0x3FFF) - class181.field2883, var260, var262, ((var259 & 0xFFFC69C) >> 14) - class167.field2683, 25922, var261);
                                    continue;
                                }
                                if (var517 == 5502) {
                                    var6 -= 6;
                                    int var263 = class274.field4376[var6];
                                    if (var263 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class9.field112 = var263;
                                    int var264 = class274.field4376[var6 + 1];
                                    if (var264 + 1 >= class56.field725[class9.field112].length >> 1) {
                                        throw new RuntimeException();
                                    }
                                    class207.field3317 = 0;
                                    class251.field4099 = var264;
                                    class278.field4429 = class274.field4376[var6 + 2];
                                    class225.field3622 = class274.field4376[var6 + 3];
                                    int var265 = class274.field4376[var6 + 4];
                                    if (var265 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class182.field2892 = var265;
                                    int var266 = class274.field4376[var6 + 5];
                                    if (class56.field725[class182.field2892].length >> 1 <= var266 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class275.field4394 = var266;
                                    class283.field4513 = 3;
                                    continue;
                                }
                                if (var517 == 5503) {
                                    class269.method1811(-1886318102);
                                    continue;
                                }
                                if (var517 == 5504) {
                                    var6 -= 2;
                                    class114.method748(class274.field4376[var6 + 1], arg2 - 73, class274.field4376[var6]);
                                    continue;
                                }
                                if (var517 == 5505) {
                                    class274.field4376[var6++] = (int) class238.field3933;
                                    continue;
                                }
                                if (var517 == 5506) {
                                    class274.field4376[var6++] = (int) class226.field3639;
                                    continue;
                                }
                                if (var517 == 5507) {
                                    class287.method1936(arg2 ^ 0xFFFFFF85);
                                    continue;
                                }
                                if (var517 == 5508) {
                                    class5.method27(-17176);
                                    continue;
                                }
                                if (var517 == 5509) {
                                    class213.method1499((byte) 97);
                                    continue;
                                }
                                if (var517 == 5510) {
                                    class107.method648((byte) 116);
                                    continue;
                                }
                                if (var517 == 5512) {
                                    class279.method1864((byte) 77);
                                    continue;
                                }
                            } else if (var517 < 5700) {
                                if (var517 == 5600) {
                                    var8 -= 2;
                                    String var267 = class287.field4587[var8 + 1];
                                    String var268 = class287.field4587[var8];
                                    var6--;
                                    int var269 = class274.field4376[var6];
                                    if (class250.field4085 == 10 && class35.field448 == 0 && class118.field1672 == 0 && class261.field4227 == 0 && class252.field4110 == 0) {
                                        class198.method1382(var268, var269, var267, (byte) 70);
                                    }
                                    continue;
                                }
                                if (var517 == 5601) {
                                    class124.method816((byte) -117);
                                    continue;
                                }
                                if (var517 == 5602) {
                                    if (class118.field1672 == 0) {
                                        class50.field650 = -2;
                                    }
                                    continue;
                                }
                                if (var517 == 5603) {
                                    var6 -= 4;
                                    if (class250.field4085 == 10 && class35.field448 == 0 && class118.field1672 == 0 && class261.field4227 == 0 && class252.field4110 == 0) {
                                        class222.method1570(class274.field4376[var6 + 2], class274.field4376[var6 + 1], 0, class274.field4376[var6], class274.field4376[var6 + 3]);
                                    }
                                    continue;
                                }
                                if (var517 == 5604) {
                                    var8--;
                                    if (class250.field4085 == 10 && class35.field448 == 0 && class118.field1672 == 0 && class261.field4227 == 0 && class252.field4110 == 0) {
                                        class86.method471(class185.method1296((byte) -103, class287.field4587[var8]), 1);
                                    }
                                    continue;
                                }
                                if (var517 == 5605) {
                                    var8 -= 3;
                                    var6 -= 7;
                                    if (class250.field4085 == 10 && class35.field448 == 0 && class118.field1672 == 0 && class261.field4227 == 0 && class252.field4110 == 0) {
                                        class44.method246(class274.field4376[var6 + 1], class274.field4376[var6 + 3], class287.field4587[var8 + 2], class274.field4376[var6 + 5] == 1, class274.field4376[var6 + 2], class274.field4376[var6], 21719, class287.field4587[var8 + 1], class185.method1296((byte) -103, class287.field4587[var8]), class274.field4376[var6 + 6] == 1, class274.field4376[var6 + 4] == 1);
                                    }
                                    continue;
                                }
                                if (var517 == 5606) {
                                    if (class261.field4227 == 0) {
                                        class86.field1062 = -2;
                                    }
                                    continue;
                                }
                                if (var517 == 5607) {
                                    class274.field4376[var6++] = class50.field650;
                                    continue;
                                }
                                if (var517 == 5608) {
                                    class274.field4376[var6++] = class206.field3299;
                                    continue;
                                }
                                if (var517 == 5609) {
                                    class274.field4376[var6++] = class86.field1062;
                                    continue;
                                }
                                if (var517 == 5610) {
                                    for (int var270 = 0; var270 < 5; var270++) {
                                        class287.field4587[var8++] = class256.field4143.length <= var270 ? "" : class213.method1493(class256.field4143[var270], (byte) 108);
                                    }
                                    class256.field4143 = null;
                                    continue;
                                }
                                if (var517 == 5611) {
                                    class274.field4376[var6++] = field869;
                                    continue;
                                }
                            } else if (var517 < 6100) {
                                if (var517 == 6001) {
                                    var6--;
                                    int var288 = class274.field4376[var6];
                                    if (var288 < 1) {
                                        var288 = 1;
                                    }
                                    if (var288 > 4) {
                                        var288 = 4;
                                    }
                                    class32.field430 = var288;
                                    if (class32.field430 == 1) {
                                        class174.method1203(0.9F);
                                    }
                                    if (class32.field430 == 2) {
                                        class174.method1203(0.8F);
                                    }
                                    if (class32.field430 == 3) {
                                        class174.method1203(0.7F);
                                    }
                                    if (class32.field430 == 4) {
                                        class174.method1203(0.6F);
                                    }
                                    class171.method1178(0);
                                    class111.method716(0, class194.field3107);
                                    class263.field4253 = false;
                                    continue;
                                }
                                if (var517 == 6002) {
                                    var6--;
                                    class200.method1397(class274.field4376[var6] == 1, arg2 - 126);
                                    class30.method172(arg2 - 40);
                                    class90.method495(28);
                                    class176.method1222(false);
                                    class111.method716(arg2 - 1, class194.field3107);
                                    class263.field4253 = false;
                                    continue;
                                }
                                if (var517 == 6003) {
                                    var6--;
                                    class137.field2207 = class274.field4376[var6] == 1;
                                    class176.method1222(false);
                                    class111.method716(arg2 ^ 0x1, class194.field3107);
                                    class263.field4253 = false;
                                    continue;
                                }
                                if (var517 == 6005) {
                                    var6--;
                                    class96.field1281 = class274.field4376[var6] == 1;
                                    class90.method495(28);
                                    class111.method716(arg2 - 1, class194.field3107);
                                    class263.field4253 = false;
                                    continue;
                                }
                                if (var517 == 6006) {
                                    var6--;
                                    class98.field1321 = class274.field4376[var6] == 1;
                                    ((class119) class174.field2756).method775(true, !class98.field1321);
                                    class111.method716(0, class194.field3107);
                                    class263.field4253 = false;
                                    continue;
                                }
                                if (var517 == 6007) {
                                    var6--;
                                    class259.field4204 = class274.field4376[var6] == 1;
                                    class111.method716(0, class194.field3107);
                                    class263.field4253 = false;
                                    continue;
                                }
                                if (var517 == 6008) {
                                    var6--;
                                    class285.field4525 = class274.field4376[var6] == 1;
                                    class111.method716(0, class194.field3107);
                                    class263.field4253 = false;
                                    continue;
                                }
                                if (var517 == 6009) {
                                    var6--;
                                    class196.field3131 = class274.field4376[var6] == 1;
                                    class111.method716(arg2 - 1, class194.field3107);
                                    class263.field4253 = false;
                                    continue;
                                }
                                if (var517 == 6010) {
                                    var6--;
                                    class113.field1624 = class274.field4376[var6] == 1;
                                    class111.method716(arg2 ^ 0x1, class194.field3107);
                                    class263.field4253 = false;
                                    continue;
                                }
                                if (var517 == 6011) {
                                    var6--;
                                    int var289 = class274.field4376[var6];
                                    if (var289 < 0 || var289 > 2) {
                                        var289 = 0;
                                    }
                                    class160.field2549 = var289;
                                    class111.method716(0, class194.field3107);
                                    class263.field4253 = false;
                                    continue;
                                }
                                if (var517 == 6012) {
                                    var6--;
                                    class213.field3429 = class274.field4376[var6] == 1;
                                    if (class32.field430 == 1) {
                                        class174.method1203(0.9F);
                                    }
                                    if (class32.field430 == 2) {
                                        class174.method1203(0.8F);
                                    }
                                    if (class32.field430 == 3) {
                                        class174.method1203(0.7F);
                                    }
                                    if (class32.field430 == 4) {
                                        class174.method1203(0.6F);
                                    }
                                    class90.method495(arg2 ^ 0x1D);
                                    class111.method716(0, class194.field3107);
                                    class263.field4253 = false;
                                    continue;
                                }
                                if (var517 == 6014) {
                                    var6--;
                                    class82.field1021 = class274.field4376[var6] == 1;
                                    class111.method716(arg2 ^ 0x1, class194.field3107);
                                    class263.field4253 = false;
                                    continue;
                                }
                                if (var517 == 6015) {
                                    var6--;
                                    class39.field486 = class274.field4376[var6] == 1;
                                    class111.method716(0, class194.field3107);
                                    class263.field4253 = false;
                                    continue;
                                }
                                if (var517 == 6016) {
                                    var6--;
                                    int var290 = class274.field4376[var6];
                                    if (var290 < 0 || var290 > 2) {
                                        var290 = 0;
                                    }
                                    class22.field294 = var290;
                                    continue;
                                }
                                if (var517 == 6017) {
                                    var6--;
                                    class212.field3405 = class274.field4376[var6] == 1;
                                    class108.method667((byte) 74);
                                    class111.method716(0, class194.field3107);
                                    class263.field4253 = false;
                                    continue;
                                }
                                if (var517 == 6018) {
                                    var6--;
                                    int var291 = class274.field4376[var6];
                                    if (var291 < 0) {
                                        var291 = 0;
                                    }
                                    if (var291 > 127) {
                                        var291 = 127;
                                    }
                                    class272.field4350 = var291;
                                    class111.method716(0, class194.field3107);
                                    class263.field4253 = false;
                                    continue;
                                }
                                if (var517 == 6019) {
                                    var6--;
                                    int var292 = class274.field4376[var6];
                                    if (var292 < 0) {
                                        var292 = 0;
                                    }
                                    if (var292 > 255) {
                                        var292 = 255;
                                    }
                                    if (class218.field3493 != var292) {
                                        if (class218.field3493 == 0 && class171.field2714 != -1) {
                                            class286.method1924(arg2 ^ 0xFFFFD80E, var292, class171.field2714, class182.field2897, 0, false);
                                            class271.field4335 = false;
                                        } else if (var292 == 0) {
                                            class17.method91(false);
                                            class271.field4335 = false;
                                        } else {
                                            class31.method175(-22696, var292);
                                        }
                                        class218.field3493 = var292;
                                    }
                                    class111.method716(0, class194.field3107);
                                    class263.field4253 = false;
                                    continue;
                                }
                                if (var517 == 6020) {
                                    var6--;
                                    int var293 = class274.field4376[var6];
                                    if (var293 < 0) {
                                        var293 = 0;
                                    }
                                    if (var293 > 127) {
                                        var293 = 127;
                                    }
                                    class63.field818 = var293;
                                    class111.method716(0, class194.field3107);
                                    class263.field4253 = false;
                                    continue;
                                }
                                if (var517 == 6021) {
                                    var6--;
                                    class189.field3063 = class274.field4376[var6] == 1;
                                    class176.method1222(false);
                                    continue;
                                }
                                if (var517 == 6023) {
                                    var6--;
                                    int var294 = class274.field4376[var6];
                                    boolean var295 = false;
                                    if (var294 < 0) {
                                        var294 = 0;
                                    }
                                    if (var294 > 2) {
                                        var294 = 2;
                                    }
                                    if (class202.field3202 < 96) {
                                        var295 = true;
                                        var294 = 0;
                                    }
                                    class268.method1801(var294);
                                    class111.method716(arg2 - 1, class194.field3107);
                                    class263.field4253 = false;
                                    class274.field4376[var6++] = var295 ? 0 : 1;
                                    continue;
                                }
                                if (var517 == 6024) {
                                    var6--;
                                    int var296 = class274.field4376[var6];
                                    if (var296 < 0 || var296 > 2) {
                                        var296 = 0;
                                    }
                                    class194.field3109 = var296;
                                    class111.method716(0, class194.field3107);
                                    continue;
                                }
                                if (var517 == 6027) {
                                    var6--;
                                    continue;
                                }
                                if (var517 == 6028) {
                                    var6--;
                                    class85.field1050 = class274.field4376[var6] != 0;
                                    class111.method716(arg2 ^ 0x1, class194.field3107);
                                    continue;
                                }
                            } else if (var517 < 6200) {
                                if (var517 == 6101) {
                                    class274.field4376[var6++] = class32.field430;
                                    continue;
                                }
                                if (var517 == 6102) {
                                    class274.field4376[var6++] = class226.method1599((byte) 122) ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6103) {
                                    class274.field4376[var6++] = class137.field2207 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6105) {
                                    class274.field4376[var6++] = class96.field1281 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6106) {
                                    class274.field4376[var6++] = class98.field1321 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6107) {
                                    class274.field4376[var6++] = class259.field4204 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6108) {
                                    class274.field4376[var6++] = class285.field4525 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6109) {
                                    class274.field4376[var6++] = class196.field3131 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6110) {
                                    class274.field4376[var6++] = class113.field1624 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6111) {
                                    class274.field4376[var6++] = class160.field2549;
                                    continue;
                                }
                                if (var517 == 6112) {
                                    class274.field4376[var6++] = class213.field3429 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6114) {
                                    class274.field4376[var6++] = class82.field1021 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6115) {
                                    class274.field4376[var6++] = class39.field486 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6116) {
                                    class274.field4376[var6++] = class22.field294;
                                    continue;
                                }
                                if (var517 == 6117) {
                                    class274.field4376[var6++] = class212.field3405 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6118) {
                                    class274.field4376[var6++] = class272.field4350;
                                    continue;
                                }
                                if (var517 == 6119) {
                                    class274.field4376[var6++] = class218.field3493;
                                    continue;
                                }
                                if (var517 == 6120) {
                                    class274.field4376[var6++] = class63.field818;
                                    continue;
                                }
                                if (var517 == 6121) {
                                    class274.field4376[var6++] = 0;
                                    continue;
                                }
                                if (var517 == 6123) {
                                    class274.field4376[var6++] = class268.method1799();
                                    continue;
                                }
                                if (var517 == 6124) {
                                    class274.field4376[var6++] = class194.field3109;
                                    continue;
                                }
                                if (var517 == 6126) {
                                    class274.field4376[var6++] = 0;
                                    continue;
                                }
                                if (var517 == 6127) {
                                    class274.field4376[var6++] = class71.field905 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6128) {
                                    class274.field4376[var6++] = class85.field1050 ? 1 : 0;
                                    continue;
                                }
                            } else if (var517 < 6300) {
                                if (var517 == 6200) {
                                    var6 -= 2;
                                    class224.field3611 = (short) class274.field4376[var6];
                                    if (class224.field3611 <= 0) {
                                        class224.field3611 = 256;
                                    }
                                    class8.field103 = (short) class274.field4376[var6 + 1];
                                    if (class8.field103 <= 0) {
                                        class8.field103 = 205;
                                    }
                                    continue;
                                }
                                if (var517 == 6201) {
                                    var6 -= 2;
                                    class191.field3075 = (short) class274.field4376[var6];
                                    if (class191.field3075 <= 0) {
                                        class191.field3075 = 256;
                                    }
                                    class101.field1359 = (short) class274.field4376[var6 + 1];
                                    if (class101.field1359 <= 0) {
                                        class101.field1359 = 320;
                                    }
                                    continue;
                                }
                                if (var517 == 6202) {
                                    var6 -= 4;
                                    class282.field4499 = (short) class274.field4376[var6];
                                    if (class282.field4499 <= 0) {
                                        class282.field4499 = 1;
                                    }
                                    class122.field1731 = (short) class274.field4376[var6 + 1];
                                    if (class122.field1731 <= 0) {
                                        class122.field1731 = 32767;
                                    } else if (class122.field1731 < class282.field4499) {
                                        class122.field1731 = class282.field4499;
                                    }
                                    class191.field3078 = (short) class274.field4376[var6 + 2];
                                    if (class191.field3078 <= 0) {
                                        class191.field3078 = 1;
                                    }
                                    class296.field4681 = (short) class274.field4376[var6 + 3];
                                    if (class296.field4681 <= 0) {
                                        class296.field4681 = 32767;
                                    } else if (class296.field4681 < class191.field3078) {
                                        class296.field4681 = class191.field3078;
                                    }
                                    continue;
                                }
                                if (var517 == 6203) {
                                    class234.method1661(false, class110.field1556.field1879, 22, 0, 0, class110.field1556.field1809);
                                    class274.field4376[var6++] = class256.field4159;
                                    class274.field4376[var6++] = class104.field1406;
                                    continue;
                                }
                                if (var517 == 6204) {
                                    class274.field4376[var6++] = class191.field3075;
                                    class274.field4376[var6++] = class101.field1359;
                                    continue;
                                }
                                if (var517 == 6205) {
                                    class274.field4376[var6++] = class224.field3611;
                                    class274.field4376[var6++] = class8.field103;
                                    continue;
                                }
                            } else if (var517 < 6400) {
                                if (var517 == 6300) {
                                    class274.field4376[var6++] = (int) (class249.method1723((byte) 116) / 60000L);
                                    continue;
                                }
                                if (var517 == 6301) {
                                    class274.field4376[var6++] = (int) (class249.method1723((byte) 122) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var517 == 6302) {
                                    var6 -= 3;
                                    int var271 = class274.field4376[var6 + 1];
                                    int var272 = class274.field4376[var6];
                                    int var273 = class274.field4376[var6 + 2];
                                    class242.field3990.clear();
                                    class242.field3990.set(11, 12);
                                    class242.field3990.set(var273, var271, var272);
                                    class274.field4376[var6++] = (int) (class242.field3990.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var517 == 6303) {
                                    class242.field3990.clear();
                                    class242.field3990.setTime(new Date(class249.method1723((byte) 63)));
                                    class274.field4376[var6++] = class242.field3990.get(1);
                                    continue;
                                }
                                if (var517 == 6304) {
                                    var6--;
                                    int var274 = class274.field4376[var6];
                                    boolean var275 = true;
                                    if (var274 < 0) {
                                        var275 = ((var274 + 1) % 4) == 0;
                                    } else if (var274 < 1582) {
                                        var275 = var274 % 4 == 0;
                                    } else if (var274 % 4 != 0) {
                                        var275 = false;
                                    } else if (var274 % 100 != 0) {
                                        var275 = true;
                                    } else if (var274 % 400 != 0) {
                                        var275 = false;
                                    }
                                    class274.field4376[var6++] = var275 ? 1 : 0;
                                    continue;
                                }
                            } else if (var517 < 6500) {
                                if (var517 == 6405) {
                                    class274.field4376[var6++] = class208.method1459((byte) 34) ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6406) {
                                    class274.field4376[var6++] = class51.method288(126) ? 1 : 0;
                                    continue;
                                }
                            } else if (var517 < 6600) {
                                if (var517 == 6500) {
                                    if (class250.field4085 == 10 && class35.field448 == 0 && class118.field1672 == 0 && class261.field4227 == 0) {
                                        class274.field4376[var6++] = class17.method90(3) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class274.field4376[var6++] = 1;
                                    continue;
                                }
                                if (var517 == 6501) {
                                    class216 var276 = class281.method1876(0);
                                    if (var276 == null) {
                                        class274.field4376[var6++] = -1;
                                        class274.field4376[var6++] = 0;
                                        class287.field4587[var8++] = "";
                                        class274.field4376[var6++] = 0;
                                        class287.field4587[var8++] = "";
                                        class274.field4376[var6++] = 0;
                                    } else {
                                        class274.field4376[var6++] = var276.field3466;
                                        class274.field4376[var6++] = var276.field3844;
                                        class287.field4587[var8++] = var276.field3472;
                                        class191 var277 = var276.method1516((byte) 30);
                                        class274.field4376[var6++] = var277.field3083;
                                        class287.field4587[var8++] = var277.field3076;
                                        class274.field4376[var6++] = var276.field3846;
                                    }
                                    continue;
                                }
                                if (var517 == 6502) {
                                    class216 var278 = class91.method499(0);
                                    if (var278 == null) {
                                        class274.field4376[var6++] = -1;
                                        class274.field4376[var6++] = 0;
                                        class287.field4587[var8++] = "";
                                        class274.field4376[var6++] = 0;
                                        class287.field4587[var8++] = "";
                                        class274.field4376[var6++] = 0;
                                    } else {
                                        class274.field4376[var6++] = var278.field3466;
                                        class274.field4376[var6++] = var278.field3844;
                                        class287.field4587[var8++] = var278.field3472;
                                        class191 var279 = var278.method1516((byte) 30);
                                        class274.field4376[var6++] = var279.field3083;
                                        class287.field4587[var8++] = var279.field3076;
                                        class274.field4376[var6++] = var278.field3846;
                                    }
                                    continue;
                                }
                                if (var517 == 6503) {
                                    var6--;
                                    int var280 = class274.field4376[var6];
                                    if (class250.field4085 == 10 && class35.field448 == 0 && class118.field1672 == 0 && class261.field4227 == 0) {
                                        class274.field4376[var6++] = class251.method1728(var280, 0) ? 1 : 0;
                                        continue;
                                    }
                                    class274.field4376[var6++] = 0;
                                    continue;
                                }
                                if (var517 == 6504) {
                                    var6--;
                                    class74.field933 = class274.field4376[var6];
                                    class111.method716(0, class194.field3107);
                                    continue;
                                }
                                if (var517 == 6505) {
                                    class274.field4376[var6++] = class74.field933;
                                    continue;
                                }
                                if (var517 == 6506) {
                                    var6--;
                                    int var281 = class274.field4376[var6];
                                    class216 var282 = class266.method1791(var281, (byte) -65);
                                    if (var282 == null) {
                                        class274.field4376[var6++] = -1;
                                        class287.field4587[var8++] = "";
                                        class274.field4376[var6++] = 0;
                                        class287.field4587[var8++] = "";
                                        class274.field4376[var6++] = 0;
                                    } else {
                                        class274.field4376[var6++] = var282.field3844;
                                        class287.field4587[var8++] = var282.field3472;
                                        class191 var283 = var282.method1516((byte) 30);
                                        class274.field4376[var6++] = var283.field3083;
                                        class287.field4587[var8++] = var283.field3076;
                                        class274.field4376[var6++] = var282.field3846;
                                    }
                                    continue;
                                }
                                if (var517 == 6507) {
                                    var6 -= 4;
                                    int var284 = class274.field4376[var6];
                                    boolean var285 = class274.field4376[var6 + 1] == 1;
                                    int var286 = class274.field4376[var6 + 2];
                                    boolean var287 = class274.field4376[var6 + 3] == 1;
                                    class181.method1262(var285, var287, false, var286, var284);
                                    continue;
                                }
                            } else if (var517 < 6700) {
                                if (var517 == 6600) {
                                    var6--;
                                    class129.field2065 = class274.field4376[var6] == 1;
                                    class111.method716(0, class194.field3107);
                                    continue;
                                }
                                if (var517 == 6601) {
                                    class274.field4376[var6++] = class129.field2065 ? 1 : 0;
                                    continue;
                                }
                            }
                        } else if (var517 == 4500) {
                            var6 -= 2;
                            int var403 = class274.field4376[var6 + 1];
                            int var404 = class274.field4376[var6];
                            class258 var405 = class44.method250(var403, -102);
                            if (var405.method1763((byte) 47)) {
                                class287.field4587[var8++] = class66.method382(26, var404).method1860(var403, (byte) 97, var405.field4178);
                            } else {
                                class274.field4376[var6++] = class66.method382(arg2 + 25, var404).method1855(var405.field4181, 7383, var403);
                            }
                            continue;
                        }
                    } else if (var517 == 4300) {
                        var6 -= 2;
                        int var406 = class274.field4376[var6 + 1];
                        int var407 = class274.field4376[var6];
                        class258 var408 = class44.method250(var406, arg2 - 80);
                        if (var408.method1763((byte) -124)) {
                            class287.field4587[var8++] = class130.method888(0, var407).method1306(var406, 0, var408.field4178);
                        } else {
                            class274.field4376[var6++] = class130.method888(arg2 - 1, var407).method1313(var408.field4181, var406, (byte) -79);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var516) {
            if (var5.field4019 == null) {
                if (class77.field969 != 0) {
                    class211.method1487("Clientscript error - check log for details", "", 0, (byte) -128);
                }
                class30.method168((byte) -9, var516, "CS2 - scr:" + var5.field3923 + " op:" + var9);
            } else {
                StringBuffer var513 = new StringBuffer(30);
                var513.append("%0a - in: ").append(var5.field4019);
                for (int var514 = class22.field293 - 1; var514 >= 0; var514--) {
                    var513.append("%0a - via: ").append(class68.field857[var514].field1199.field4019);
                }
                if (var9 == 40) {
                    int var515 = var10[var7];
                    var513.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var515));
                }
                if (class77.field969 != 0) {
                    class211.method1487("Clientscript error in: " + var5.field4019, "", 0, (byte) -121);
                }
                class30.method168((byte) -71, var516, "CS2 - scr:" + var5.field3923 + " op:" + var9 + var513.toString());
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)Lub;")
    public static final class11 method394(int arg0, int arg1, int arg2) {
        class246 var3 = class46.field585[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class11 var4 = var3.field4056;
            var3.field4056 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZZ)V")
    public static final void method395(boolean arg0, boolean arg1) {
        field878++;
        class294.field4656 = 99;
        class34.field434 = new int[104];
        class35.field449 = new int[104];
        class180.field2867 = new int[5];
        class128.field2060 = new int[104];
        class186.field2967 = new int[104];
        if (!arg0) {
            return;
        }
        class271.field4336 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class107.field1441 = new byte[var2][104][104];
        class50.field646 = new byte[var2][104][104];
        class143.field2260 = new byte[var2][104][104];
        class289.field4604 = new int[var2][105][105];
        class161.field2569 = new byte[var2][104][104];
        class230.field3747 = new byte[var2][105][105];
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
    public class70() {
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
    public static void method396(boolean arg0) {
        field870 = null;
        field867 = null;
        if (arg0) {
            method392(-53);
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lpd;)V")
    public class70(class96 arg0) {
        this.field864 = arg0.method587(-94);
        this.field866 = arg0.method549(255);
        this.field876 = arg0.method597(-1197332568);
        this.field879 = arg0.method597(-1197332568);
        this.field868 = arg0.method597(-1197332568);
        this.field874 = arg0.method597(-1197332568);
    }
}
