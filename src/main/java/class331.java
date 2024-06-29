import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public abstract class class331 {

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "[I")
    public static int[] field5032 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "[F")
    public static float[] field5034 = new float[4];

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field5042 = -1;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "Lqf;")
    public static class359 field5041 = null;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "[Lgd;")
    public static class180[] field5039;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V", line = 11)
    public static final void method2324(byte arg0) {
        field5038++;
        int var1 = 0;
        int var2 = 27 / ((arg0 + 59) / 44);
        int[] var3 = new int[class240.field3578];
        for (int var4 = 0; var4 < class240.field3578; var4++) {
            class122 var5 = class175.method1228((byte) 54, var4);
            if (var5.field1754 >= 0 || var5.field1718 >= 0) {
                var3[var1++] = var4;
            }
        }
        class255.field3804 = new int[var1];
        for (int var6 = 0; var6 < var1; var6++) {
            class255.field3804[var6] = var3[var6];
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZZ)V", line = 43)
    public static final void method2325(boolean arg0, boolean arg1) {
        class11.field176 = arg1;
        class313.field4662 = !class3.method15((byte) 93);
        field5035++;
        if (arg0) {
            field5034 = (float[]) null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lph;I)V", line = 56)
    public static final void method2326(class361 arg0, int arg1) {
        if (arg1 > -76) {
            method2328(-121);
        }
        field5037++;
        class175.field2523 = arg0;
        class131.field1922 = class175.field2523.method2539(true, 4);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 76)
    public static final void method2327(int arg0) {
        class180.field2597 = "M";
        class298.field4456 = "Verbindung abgebrochen.";
        class35.field521 = "Schriftsätze geladen.";
        class150.field2177 = "gleiten:";
        class287.field4345 = "Benutzeroberfläche geladen.";
        class184.field2648 = "Konfig geladen.";
        class170.field2453 = "Lade Titelbild - ";
        class52.field780 = "3D-Softwarebibliothek gestartet.";
        class18.field294 = "Suche nach Updates - ";
        class109.field1582 = "welle:";
        class230.field3482 = "Speicher wird zugewiesen.";
        class49.field730 = "Stufe: ";
        class236.field3550 = ": ";
        class74.field1084 = "Angreifen";
        class332.field5080 = "Verbindung mit Update-Server...";
        class347.field5369 = "Okay";
        class123.field1794 = "Titelbild geladen.";
        class166.field2379 = "RuneScape wird geladen - bitte warten...";
        class252.field3764 = "scrollen:";
        class127.field1851 = "Ladevorgang - bitte warte.";
        class76.field1109 = "Lade...";
        class276.field4185 = "blaugrün:";
        class21.field328 = " steht bereits auf deiner Ignorieren-Liste!";
        class236.field3546 = "Lade Liste der Welten";
        class360.field5687 = "Nehmen";
        class259.field3865 = "Verbindung zum Update-Server hergestellt.";
        class352.field5425 = "Hierhin drehen";
        class288.field4359 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class4.field116 = "Versteckt";
        class194.field2818 = "Lade Texturen - ";
        class173.field2493 = "Wähl eine Option";
        class316.field4695 = " weitere Optionen";
        class191.field2781 = "T";
        class30.field431 = "Spielwelt erstellt.";
        class4.field114 = "Zugewiesener Speicher.";
        class148.field2128 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class180.field2598 = "Schließen";
        class23.field343 = "T";
        class258.field3852 = "Wordpack geladen.";
        class51.field771 = "leuchten3:";
        class123.field1788 = "rot:";
        class315.field4684 = "Update-Liste geladen.";
        class139.field1996 = "schütteln:";
        class251.field3720 = "Texturen geladen.";
        class214.field3085 = "Musik-Engine vorbereitet.";
        class55.field801 = "lila:";
        if (arg0 != -3) {
            method2330(true);
        }
        class154.field2206 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class357.field5471 = "Benutzen";
        class332.field5070 = "welle2:";
        class86.field1221 = "Bitte entferne ";
        class56.field826 = " loggt sich aus.";
        class184.field2638 = "Lade Standardeinstellungen - ";
        class67.field987 = "Spieler kann nicht gefunden werden: ";
        class110.field1593 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class122.field1779 = "Lade Sprites - ";
        class75.field1089 = "Fallen lassen";
        class85.field1197 = " zuerst von deiner Freunde-Liste!";
        class202.field2964 = "blinken1:";
        class134.field1961 = " loggt sich ein.";
        class361.field5695 = "Eingabeprozedur geladen.";
        class133.field1945 = " zuerst von deiner Ignorieren-Liste!";
        class189.field2698 = "Lade Benutzeroberfläche - ";
        class165.field2343 = "Untersuchen";
        field5040++;
        class197.field2861 = " steht bereits auf deiner Freunde-Liste!";
        class30.field436 = "Ablegen";
        class351.field5414 = "Lade Schriftsätze - ";
        class201.field2949 = "Bitte warte...";
        class48.field723 = "Titelbild geöffnet.";
        class128.field1867 = "Abbrechen";
        class318.field4789 = "Fertigkeit: ";
        class103.field1485 = "Kampfstufe: ";
        class132.field1932 = "Lade Wordpack - ";
        class128.field1865 = "Hierhin gehen";
        class56.field809 = "Starte 3D-Softwarebibliothek.";
        class347.field5357 = "M";
        class4.field109 = "Mechscape wird geladen - bitte warten...";
        class88.field1242 = "weiss:";
        class75.field1088 = "Gegenstand für Mitglieder";
        class181.field2602 = "Auswählen";
        class58.field864 = "Weiter";
        class192.field2798 = "leuchten1:";
        class221.field3320 = "Liste der Welten geladen";
        class229.field3468 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class110.field1590 = "Standardeinstellungen geladen";
        class67.field980 = "Lade Konfiguration - ";
        class5.field130 = "gelb:";
        class52.field777 = "leuchten2:";
        class103.field1489 = "Sprites geladen.";
        class312.field4640 = "grün:";
        class342.field5281 = "Bitte entferne ";
        class306.field4582 = "blinken2:";
        class261.field3935 = "blinken3:";
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V", line = 357)
    public static final void method2328(int arg0) {
        field5033++;
        if (class362.method2546(1) != 2) {
            return;
        }
        byte var1 = (byte) (class117.field1662 - 4 & 0xFF);
        int var2 = class117.field1662 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class170.field2456[var3][var2][var4] = var1;
            }
        }
        if (class321.field4835 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class86.field1223[var5] = -1000000;
            class348.field5382[var5] = 1000000;
            class107.field1549[var5] = 0;
            class356.field5465[var5] = 1000000;
            class150.field2181[var5] = 0;
        }
        if (arg0 != 4) {
            return;
        }
        if (class86.field1208 != 1) {
            int var16 = class71.method584(class321.field4835, class137.field1991, 102, class166.field2385);
            if (var16 - class129.field1871 < 800 && (class230.field3491[class321.field4835][class137.field1991 >> 7][class166.field2385 >> 7] & 0x4) != 0) {
                class135.method964(false, class166.field2385 >> 7, class137.field1991 >> 7, 1, class302.field4502, false);
            }
            return;
        }
        if ((class230.field3491[class321.field4835][class1.field55.field5137 >> 7][class1.field55.field5165 >> 7] & 0x4) != 0) {
            class135.method964(false, class1.field55.field5165 >> 7, class1.field55.field5137 >> 7, 0, class302.field4502, false);
        }
        if (class362.field5746 >= 310) {
            return;
        }
        int var6 = class137.field1991 >> 7;
        int var7 = class1.field55.field5137 >> 7;
        int var8 = class166.field2385 >> 7;
        int var9;
        if (var7 <= var6) {
            var9 = var6 - var7;
        } else {
            var9 = var7 - var6;
        }
        int var10 = class1.field55.field5165 >> 7;
        int var11;
        if (var10 > var8) {
            var11 = var10 - var8;
        } else {
            var11 = var8 - var10;
        }
        if (var9 == 0 && var11 == 0 || var9 <= -104 || var9 >= 104 || var11 <= -104 || var11 >= 104) {
            class343.method2402("RC: " + var6 + "," + var8 + " " + var7 + "," + var10 + " " + class272.field4123 + "," + class202.field2968, (Throwable) null, arg0 - 6);
            return;
        }
        if (var11 >= var9) {
            int var14 = var9 * 65536 / var11;
            int var15 = 32768;
            while (var8 != var10) {
                if (var8 < var10) {
                    var8++;
                } else if (var8 > var10) {
                    var8--;
                }
                if ((class230.field3491[class321.field4835][var6][var8] & 0x4) != 0) {
                    class135.method964(false, var8, var6, 1, class302.field4502, false);
                    break;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var6 < var7) {
                        var6++;
                    } else if (var6 > var7) {
                        var6--;
                    }
                    if ((class230.field3491[class321.field4835][var6][var8] & 0x4) != 0) {
                        class135.method964(false, var8, var6, 1, class302.field4502, false);
                        break;
                    }
                }
            }
            return;
        }
        int var12 = var11 * 65536 / var9;
        int var13 = 32768;
        while (var6 != var7) {
            if (var7 > var6) {
                var6++;
            } else if (var7 < var6) {
                var6--;
            }
            if ((class230.field3491[class321.field4835][var6][var8] & 0x4) != 0) {
                class135.method964(false, var8, var6, 1, class302.field4502, false);
                break;
            }
            var13 += var12;
            if (var13 >= 65536) {
                if (var8 < var10) {
                    var8++;
                } else if (var10 < var8) {
                    var8--;
                }
                var13 -= 65536;
                if ((class230.field3491[class321.field4835][var6][var8] & 0x4) != 0) {
                    class135.method964(false, var8, var6, 1, class302.field4502, false);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILph;)[Lwi;", line = 552)
    public static final class234[] method2329(int arg0, int arg1, class361 arg2) {
        field5036++;
        if (arg0 >= -73) {
            return (class234[]) null;
        } else if (class329.method2282(9, arg1, arg2)) {
            return class123.method925((byte) -100);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V", line = 573)
    public static void method2330(boolean arg0) {
        field5032 = null;
        if (arg0) {
            method2328(-127);
        }
        field5034 = null;
        field5039 = null;
        field5041 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILqn;)Lqn;")
    public abstract class247 method974(int arg0, class247 arg1);
}
