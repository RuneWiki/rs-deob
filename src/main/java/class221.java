import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class221 implements Runnable {

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Z")
    public boolean field3479 = true;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Ljava/lang/Object;")
    public Object field3489 = new Object();

    @OriginalMember(owner = "client!se", name = "p", descriptor = "[I")
    public int[] field3491 = new int[500];

    @OriginalMember(owner = "client!se", name = "r", descriptor = "[I")
    public int[] field3493 = new int[500];

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public int field3492 = 0;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3478 = 0;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Lrg;")
    public static class248 field3485 = null;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field3477 = 0;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field3488 = 0;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field3487 = 0;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Lgi;")
    public static class164 field3482;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "[I")
    public static int[] field3486;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILgi;)V")
    public static final void method1502(int arg0, class164 arg1) {
        if (arg0 > -114) {
            field3485 = null;
        }
        field3484++;
    }

    @OriginalMember(owner = "client!se", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field3479) {
            Object var1 = this.field3489;
            synchronized (this.field3489) {
                if (this.field3492 < 500) {
                    this.field3493[this.field3492] = class287.field4640;
                    this.field3491[this.field3492] = class55.field797;
                    this.field3492++;
                }
            }
            class33.method250(50L, 256);
        }
        field3476++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static final void method1503(int arg0) {
        class90.field1404 = "schütteln:";
        int var1 = 38 / ((67 - arg0) / 44);
        class57.field825 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class177.field2942 = "Konfig geladen.";
        class98.field1552 = "Untersuchen";
        class192.field3131 = "Lade Liste der Welten";
        class25.field458 = "leuchten3:";
        class66.field1073 = " zuerst von deiner Ignorieren-Liste!";
        class22.field409 = "Spieler kann nicht gefunden werden: ";
        class62.field908 = "Abbrechen";
        class91.field1437 = "Titelbild geladen.";
        class134.field2176 = "RuneScape wird geladen - bitte warten...";
        class14.field293 = "Kampfstufe: ";
        class183.field3041 = "Lade...";
        class217.field3415 = "Texturen geladen.";
        class192.field3140 = "rot:";
        class188.field3094 = "Musik-Engine vorbereitet.";
        class99.field1564 = "lila:";
        class247.field3887 = " steht bereits auf deiner Freunde-Liste!";
        class59.field863 = "Lade Konfiguration - ";
        class8.field184 = "Bitte warte...";
        class306.field4980 = "Versteckt";
        class263.field4298 = "Sprites geladen.";
        class225.field3532 = "Speicher wird zugewiesen.";
        class237.field3721 = "3D-Softwarebibliothek gestartet.";
        class133.field2137 = "Benutzeroberfläche geladen.";
        class48.field703 = "Mechscape wird geladen - bitte warten...";
        class33.field537 = "Benutzen";
        class200.field3198 = "Nehmen";
        class174.field2916 = "Schließen";
        class120.field1906 = "grün:";
        class17.field306 = "Update-Liste geladen.";
        class236.field3694 = "Bitte entferne ";
        class74.field1197 = "Spielwelt erstellt.";
        class259.field4246 = "Gegenstand für Mitglieder";
        class198.field3183 = "Lade Sprites - ";
        class310.field5020 = "scrollen:";
        class225.field3529 = "Zugewiesener Speicher.";
        class123.field1961 = "Verbindung zum Update-Server hergestellt.";
        class238.field3734 = "welle2:";
        class82.field1326 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class4.field105 = "Titelbild geöffnet.";
        class205.field3300 = "leuchten2:";
        class88.field1377 = "Hierhin drehen";
        class268.field4334 = "Suche nach Updates - ";
        class146.field2350 = "Liste der Welten geladen";
        class248.field3910 = "Lade Schriftsätze - ";
        field3490++;
        class24.field446 = "leuchten1:";
        class8.field189 = "T";
        class70.field1127 = ": ";
        class155.field2472 = "Eingabeprozedur geladen.";
        class299.field4911 = "Stufe: ";
        class157.field2507 = "Auswählen";
        class229.field3582 = "Lade Standardeinstellungen - ";
        class232.field3626 = "Wordpack geladen.";
        class174.field2914 = "blinken3:";
        class70.field1131 = "Standardinstellungen geladen";
        class257.field4233 = "Ablegen";
        class120.field1903 = "weiss:";
        class263.field4305 = " loggt sich ein.";
        class220.field3468 = "Verbindung abgebrochen.";
        class87.field1363 = "blinken1:";
        class229.field3594 = "welle:";
        class302.field4942 = "blaugrün:";
        class33.field543 = "Fallen lassen";
        class148.field2369 = "gleiten:";
        class43.field647 = "blinken2:";
        class22.field419 = "Schriftsätze geladen.";
        class140.field2279 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class165.field2733 = " loggt sich aus.";
        class137.field2212 = "Lade Benutzeroberfläche - ";
        class152.field2442 = "T";
        class26.field470 = "möchte mit dir handeln.";
        class123.field1958 = "Wähl eine Option";
        class33.field540 = "Hierhin gehen";
        class311.field5031 = "M";
        class68.field1085 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class65.field1044 = "Weiter";
        class99.field1563 = "Lade Wordpack - ";
        class275.field4511 = "Fertigkeit: ";
        class291.field4769 = "M";
        class54.field788 = "Okay";
        class157.field2519 = " zuerst von deiner Freunde-Liste!";
        class287.field4643 = "Bitte entferne ";
        class115.field1755 = "Ladevorgang - bitte warte.";
        class183.field3034 = "gelb:";
        class302.field4943 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class307.field4990 = " weitere Optionen";
        class248.field4070 = "Lade Texturen - ";
        class200.field3206 = "Angreifen";
        class277.field4526 = "Verbindung mit Update-Server...";
        class253.field4153 = " steht bereits auf deiner Ignorieren-Liste!";
        class302.field4947 = "Starte 3D-Softwarebibliothek.";
        class177.field2945 = "Lade Titelbild - ";
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([[[Lke;ZIIII)Z")
    public static final boolean method1504(class116[][][] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field3483++;
        byte var6 = arg1 ? 1 : (byte) (class89.field1384 & 0xFF);
        if (class217.field3412[class214.field3389][arg4][arg5] == var6) {
            return false;
        } else if ((class214.field3386[class214.field3389][arg4][arg5] & 0x4) == 0) {
            return false;
        } else {
            int var7 = 0;
            byte var8 = 0;
            class284.field4606[var8] = arg4;
            int var31 = var8 + 1;
            class246.field3879[var8] = arg5;
            class217.field3412[class214.field3389][arg4][arg5] = var6;
            if (arg2 <= 73) {
                return false;
            }
            while (var7 != var31) {
                int var9 = (class284.field4606[var7] & 0xFF8284) >> 16;
                int var10 = class284.field4606[var7] >> 24 & 0xFF;
                int var11 = class284.field4606[var7] & 0xFFFF;
                int var12 = class246.field3879[var7] >> 16 & 0xFF;
                boolean var13 = false;
                int var14 = class246.field3879[var7] & 0xFFFF;
                if ((class214.field3386[class214.field3389][var11][var14] & 0x4) == 0) {
                    var13 = true;
                }
                boolean var15 = false;
                var7 = var7 + 1 & 0xFFF;
                label227: for (int var16 = class214.field3389 + 1; var16 <= 3; var16++) {
                    if ((class214.field3386[var16][var11][var14] & 0x8) == 0) {
                        if (var13 && arg0[var16][var11][var14] != null) {
                            if (arg0[var16][var11][var14].field1775 != null) {
                                int var19 = class277.method1892(var9, (byte) 98);
                                if (arg0[var16][var11][var14].field1775.field2221 == var19 || arg0[var16][var11][var14].field1775.field2224 == var19) {
                                    continue;
                                }
                                if (var10 != 0) {
                                    int var20 = class277.method1892(var10, (byte) -114);
                                    if (arg0[var16][var11][var14].field1775.field2221 == var20 || arg0[var16][var11][var14].field1775.field2224 == var20) {
                                        continue;
                                    }
                                }
                                if (var12 != 0) {
                                    int var21 = class277.method1892(var12, (byte) -28);
                                    if (arg0[var16][var11][var14].field1775.field2221 == var21 || arg0[var16][var11][var14].field1775.field2224 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg0[var16][var11][var14].field1782 != null) {
                                for (int var22 = 0; var22 < arg0[var16][var11][var14].field1787; var22++) {
                                    int var23 = (int) (arg0[var16][var11][var14].field1782[var22].field1402 >> 14 & 0x3FL);
                                    int var24 = (int) (arg0[var16][var11][var14].field1782[var22].field1402 >> 20 & 0x3L);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var25 = var23 | var24 << 6;
                                    if (var9 == var25 || var10 != 0 && var10 == var25 || var12 != 0 && var12 == var25) {
                                        continue label227;
                                    }
                                }
                            }
                        }
                        class116 var26 = arg0[var16][var11][var14];
                        if (var26 != null && var26.field1787 > 0) {
                            for (int var27 = 0; var27 < var26.field1787; var27++) {
                                class90 var28 = var26.field1782[var27];
                                if (var28.field1420 != var28.field1405 || var28.field1407 != var28.field1399) {
                                    for (int var29 = var28.field1405; var29 <= var28.field1420; var29++) {
                                        for (int var30 = var28.field1407; var30 <= var28.field1399; var30++) {
                                            class217.field3412[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class217.field3412[var16][var11][var14] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = var14 << 7;
                    if (class40.field607[arg3] < class166.field2746[class214.field3389 + 1][var11][var14]) {
                        class40.field607[arg3] = class166.field2746[class214.field3389 + 1][var11][var14];
                    }
                    int var18 = var11 << 7;
                    if (var18 < class87.field1366[arg3]) {
                        class87.field1366[arg3] = var18;
                    } else if (class218.field3424[arg3] < var18) {
                        class218.field3424[arg3] = var18;
                    }
                    if (var17 < class205.field3303[arg3]) {
                        class205.field3303[arg3] = var17;
                    } else if (class16.field300[arg3] < var17) {
                        class16.field300[arg3] = var17;
                    }
                }
                if (!var13) {
                    if (var11 >= 1 && class217.field3412[class214.field3389][var11 - 1][var14] != var6) {
                        class284.field4606[var31] = class76.method555(class76.method555(1179648, var11 - 1), -754974720);
                        class246.field3879[var31] = class76.method555(var14, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class217.field3412[class214.field3389][var11 - 1][var14] = var6;
                    }
                    var14++;
                    if (var14 < 104) {
                        if (var11 - 1 >= 0 && class217.field3412[class214.field3389][var11 - 1][var14] != var6 && (class214.field3386[class214.field3389][var11][var14] & 0x4) == 0 && (class214.field3386[class214.field3389][var11 - 1][var14 - 1] & 0x4) == 0) {
                            class284.field4606[var31] = class76.method555(1375731712, class76.method555(var11 - 1, 1179648));
                            class246.field3879[var31] = class76.method555(var14, 1245184);
                            class217.field3412[class214.field3389][var11 - 1][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class217.field3412[class214.field3389][var11][var14] != var6) {
                            class284.field4606[var31] = class76.method555(318767104, class76.method555(5373952, var11));
                            class246.field3879[var31] = class76.method555(var14, 5439488);
                            class217.field3412[class214.field3389][var11][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var11 + 1) < 104 && class217.field3412[class214.field3389][var11 + 1][var14] != var6 && (class214.field3386[class214.field3389][var11][var14] & 0x4) == 0 && (class214.field3386[class214.field3389][var11 + 1][var14 - 1] & 0x4) == 0) {
                            class284.field4606[var31] = class76.method555(-1845493760, class76.method555(5373952, var11 + 1));
                            class246.field3879[var31] = class76.method555(var14, 5439488);
                            class217.field3412[class214.field3389][var11 + 1][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var14--;
                    if (var11 + 1 < 104 && class217.field3412[class214.field3389][var11 + 1][var14] != var6) {
                        class284.field4606[var31] = class76.method555(1392508928, class76.method555(9568256, var11 + 1));
                        class246.field3879[var31] = class76.method555(var14, 9633792);
                        class217.field3412[class214.field3389][var11 + 1][var14] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var14--;
                    if (var14 >= 0) {
                        if (var11 - 1 >= 0 && class217.field3412[class214.field3389][var11 - 1][var14] != var6 && (class214.field3386[class214.field3389][var11][var14] & 0x4) == 0 && (class214.field3386[class214.field3389][var11 - 1][var14 + 1] & 0x4) == 0) {
                            class284.field4606[var31] = class76.method555(class76.method555(13762560, var11 - 1), 301989888);
                            class246.field3879[var31] = class76.method555(var14, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class217.field3412[class214.field3389][var11 - 1][var14] = var6;
                        }
                        if (class217.field3412[class214.field3389][var11][var14] != var6) {
                            class284.field4606[var31] = class76.method555(-1828716544, class76.method555(13762560, var11));
                            class246.field3879[var31] = class76.method555(13828096, var14);
                            var31 = var31 + 1 & 0xFFF;
                            class217.field3412[class214.field3389][var11][var14] = var6;
                        }
                        if ((var11 + 1) < 104 && class217.field3412[class214.field3389][var11 + 1][var14] != var6 && (class214.field3386[class214.field3389][var11][var14] & 0x4) == 0 && (class214.field3386[class214.field3389][var11 + 1][var14 + 1] & 0x4) == 0) {
                            class284.field4606[var31] = class76.method555(class76.method555(9568256, var11 + 1), -771751936);
                            class246.field3879[var31] = class76.method555(var14, 9633792);
                            class217.field3412[class214.field3389][var11 + 1][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class40.field607[arg3] != -1000000) {
                class40.field607[arg3] += 10;
                class87.field1366[arg3] -= 50;
                class218.field3424[arg3] += 50;
                class16.field300[arg3] += 50;
                class205.field3303[arg3] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V")
    public static final void method1505(int arg0, int arg1) {
        field3481++;
        if (arg0 != 11819) {
            method1503(103);
        }
        class123 var2 = class149.field2381;
        synchronized (class149.field2381) {
            class50.field730 = arg1;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    public static void method1506(boolean arg0) {
        field3486 = null;
        if (arg0) {
            method1505(-81, 83);
        }
        field3482 = null;
        field3485 = null;
    }
}
