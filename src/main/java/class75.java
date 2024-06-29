import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public abstract class class75 extends class301 {

    @OriginalMember(owner = "client!bn", name = "I", descriptor = "[I")
    public static int[] field1364 = new int[25];

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
    public int field1353;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
    public int field1355;

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "I")
    public int field1356;

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "client!bn", name = "D", descriptor = "I")
    public int field1359;

    @OriginalMember(owner = "client!bn", name = "E", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!bn", name = "F", descriptor = "I")
    public int field1361;

    @OriginalMember(owner = "client!bn", name = "H", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!bn", name = "G", descriptor = "Lga;")
    public static class23 field1362;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(III)Lnk;", line = 9)
    public static final class16 method567(int arg0, int arg1, int arg2) {
        class312 var3 = class353.field5644[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5102;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([SZ[Ljava/lang/String;)V", line = 22)
    public static final void method570(short[] arg0, boolean arg1, String[] arg2) {
        if (!arg1) {
            field1362 = (class23) null;
        }
        field1357++;
        class352.method2510(arg0, arg2, 0, 82, arg2.length - 1);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZIIZIZI)V", line = 44)
    public static final void method573(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        if (arg0) {
            class241.method1679();
        }
        field1352++;
        if (class202.field3384 != null && (arg2 != 3 || class217.field3616 != arg4 || class146.field2459 != arg1)) {
            class273.method1936(class59.field1164, -2, class202.field3384);
            class202.field3384 = null;
        }
        if (arg2 == 3 && class202.field3384 == null) {
            class202.field3384 = class317.method2284(class59.field1164, arg1, 0, arg4, -10754, 0);
            if (class202.field3384 != null) {
                class146.field2459 = arg1;
                class217.field3616 = arg4;
                class235.method1634(class59.field1164, (byte) -60);
            }
        }
        if (arg2 == 3 && class202.field3384 == null) {
            method573(true, -1, class135.field2318, true, -1, true, arg6);
            return;
        }
        Container var7;
        if (class202.field3384 != null) {
            var7 = class202.field3384;
        } else if (class274.field4469 == null) {
            var7 = class59.field1164.field2658;
        } else {
            var7 = class274.field4469;
        }
        class276.field4505 = var7.getSize().width;
        class332.field5302 = var7.getSize().height;
        if (class274.field4469 == var7) {
            Insets var8 = class274.field4469.getInsets();
            class332.field5302 -= var8.top + var8.bottom;
            class276.field4505 -= var8.right + var8.left;
        }
        if (arg2 < 2) {
            class332.field5298 = (class276.field4505 - 765) / 2;
            class133.field2287 = 765;
            class287.field4696 = 503;
            class355.field5659 = 0;
        } else {
            class133.field2287 = class276.field4505;
            class355.field5659 = 0;
            class332.field5298 = 0;
            class287.field4696 = class332.field5302;
        }
        if (arg5) {
            class263.method1848(class209.field3489, (byte) 1);
            class164.method1181(1, class209.field3489);
            if (class285.field4662 != null) {
                class285.field4662.method2253(126, class209.field3489);
            }
            class111.field2036.method808(-10374);
            class321.method2307(false, class209.field3489);
            class115.method850((byte) 108, class209.field3489);
            if (class285.field4662 != null) {
                class285.field4662.method2252(16912, class209.field3489);
            }
        } else {
            if (class241.field4016) {
                class241.method1708(class133.field2287, class287.field4696);
            }
            class209.field3489.setSize(class133.field2287, class287.field4696);
            if (class274.field4469 == var7) {
                Insets var9 = class274.field4469.getInsets();
                class209.field3489.setLocation(class332.field5298 + var9.left, class355.field5659 + var9.top);
            } else {
                class209.field3489.setLocation(class332.field5298, class355.field5659);
            }
        }
        if (arg2 == 0 && arg6 > 0) {
            class241.method1712(class209.field3489);
        }
        if (arg0 && arg2 > 0) {
            class209.field3489.setIgnoreRepaint(true);
            if (!class65.field1236) {
                class35.method262();
                class285.field4666 = null;
                class285.field4666 = class15.method161(class287.field4696, -76, class133.field2287, class209.field3489);
                class270.method1888();
                if (class334.field5326 == 5) {
                    class346.method2466(class332.field5297, (byte) 107, true);
                } else {
                    class312.method2268(class284.field4645, false, (byte) 91);
                }
                try {
                    Graphics var10 = class209.field3489.getGraphics();
                    class285.field4666.method611(0, (byte) -47, 0, var10);
                } catch (Exception var14) {
                }
                class114.method847((byte) -91);
                if (arg6 == 0) {
                    class285.field4666 = class15.method161(503, -35, 765, class209.field3489);
                } else {
                    class285.field4666 = null;
                }
                class210 var12 = class59.field1164.method1111(-91, class111.field2036.getClass());
                while (var12.field3504 == 0) {
                    class122.method881(-88, 100L);
                }
                if (var12.field3504 == 1) {
                    class65.field1236 = true;
                }
            }
            if (class65.field1236) {
                class241.method1720(class209.field3489, class117.field2083 * 2);
            }
        }
        if (!class241.field4016 && arg2 > 0) {
            method573(true, -1, 0, arg3, -1, true, arg6);
            return;
        }
        if (arg2 > 0 && arg6 == 0) {
            class164.field2750.setPriority(5);
            class285.field4666 = null;
            class95.method729();
            ((class7) class305.field4968).method73(200, 52);
            if (class281.field4606) {
                class305.method2216(0.7F);
            }
            if (class191.field3233 == null) {
                class191.field3233 = new class134[13][13];
            }
            class2.method19(4, 104, 104);
            class221.method1546(104, 104);
            class271.method1914((byte) -61);
        } else if (arg2 == 0 && arg6 > 0) {
            class164.field2750.setPriority(1);
            class285.field4666 = class15.method161(503, -95, 765, class209.field3489);
            class95.method726();
            class214.method1490();
            ((class7) class305.field4968).method73(20, 49);
            if (class281.field4606) {
                if (class152.field2601 == 1) {
                    class305.method2216(0.9F);
                }
                if (class152.field2601 == 2) {
                    class305.method2216(0.8F);
                }
                if (class152.field2601 == 3) {
                    class305.method2216(0.7F);
                }
                if (class152.field2601 == 4) {
                    class305.method2216(0.6F);
                }
            }
            class102.method768();
            class271.method1914((byte) -61);
        }
        class248.field4072 = !class14.method137(256);
        class214.method1481(class133.field2287, class287.field4696);
        if (arg0) {
            class26.method211(-127);
        }
        if (arg2 < 2) {
            class208.field3483 = false;
        } else {
            class208.field3483 = true;
        }
        if (class88.field1566 != -1) {
            class316.method2278(true, 0);
        }
        if (class127.field2224 != null && (class334.field5326 == 30 || class334.field5326 == 25)) {
            class320.method2305((byte) -62);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class213.field3524[var13] = true;
        }
        class205.field3412 = arg3;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lla;I)V", line = 281)
    public static final void method574(class157 arg0, int arg1) {
        field1360++;
        class152.field2601 = 3;
        class203 var2 = null;
        class127.method910((byte) 113, true);
        class30.field706 = 127;
        class68.field1254 = true;
        class359.field5723 = true;
        class281.field4606 = true;
        class117.field2083 = 0;
        class52.field1045 = 255;
        class178.field2937 = 0;
        class277.field4519 = true;
        class264.field4330 = true;
        class358.field5697 = true;
        class136.field2333 = true;
        class166.field2784 = true;
        class349.field5590 = true;
        class217.field3616 = 0;
        class8.field268 = 127;
        class146.field2459 = 0;
        class111.field2032 = 2;
        class252.field4143 = true;
        class53.field1060 = true;
        if (arg1 != 1691) {
            field1364 = (int[]) null;
        }
        if (class58.field1148 >= 96) {
            class214.method1488(2);
        } else {
            class214.method1488(0);
        }
        class133.field2281 = false;
        class115.field2080 = true;
        class135.field2318 = 0;
        class248.field4071 = 0;
        class97.field1761 = 0;
        class151.field2559 = false;
        class171.field2832 = false;
        try {
            class210 var3 = arg0.method1130("runescape", false);
            while (var3.field3504 == 0) {
                class122.method881(112, 1L);
            }
            if (var3.field3504 == 1) {
                var2 = (class203) var3.field3501;
                byte[] var4 = new byte[(int) var2.method1388(0)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1389(var5, -21270, var4, var4.length - var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class201.method1378(-113, new class146(var4));
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method1390(0);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(B)V", line = 367)
    public static final void method576(byte arg0) {
        int var1 = 0;
        int var2 = -110 / ((37 - arg0) / 50);
        while (class91.field1613 > var1) {
            int var3 = class34.field761[var1];
            class98 var4 = class182.field3151[var3];
            int var5 = class342.field5413.method1005((byte) 122);
            if ((var5 & 0x2) != 0) {
                var5 += class342.field5413.method1005((byte) 122) << 8;
            }
            class81.method602(var3, -55, var5, var4);
            var1++;
        }
        field1354++;
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)V", line = 398)
    public static final void method577(int arg0) {
        class363.field5744 = "Benutzen";
        class176.field2923 = "Spielwelt erstellt.";
        class71.field1315 = "leuchten2:";
        class235.field3848 = "Mechscape wird geladen - bitte warten...";
        class173.field2875 = "Weiter";
        class55.field1089 = "Update-Liste geladen.";
        class267.field4374 = "Sprites geladen.";
        class114.field2055 = "Lade Benutzeroberfläche - ";
        class21.field547 = "Untersuchen";
        class73.field1331 = "Lade...";
        class266.field4350 = "Hierhin gehen";
        class28.field687 = "T";
        client.field4592 = "Lade Titelbild - ";
        class78.field1385 = " weitere Optionen";
        class339.field5378 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class348.field5564 = "blinken3:";
        class353.field5648 = "Angreifen";
        class103.field1888 = "rot:";
        class147.field2510 = "schütteln:";
        class306.field4977 = "Texturen geladen.";
        class331.field5287 = "Fallen lassen";
        class18.field493 = "Starte 3D-Softwarebibliothek.";
        class346.field5528 = "Kampfstufe: ";
        class111.field2034 = " zuerst von deiner Freunde-Liste!";
        class61.field1194 = "Lade Konfiguration - ";
        class25.field655 = "welle2:";
        if (arg0 != -27220) {
            return;
        }
        class87.field1526 = "Lade Sprites - ";
        class220.field3650 = "lila:";
        class170.field2815 = "3D-Softwarebibliothek gestartet.";
        class44.field914 = "Suche nach Updates - ";
        field1351++;
        class180.field2959 = " steht bereits auf deiner Ignorieren-Liste!";
        class19.field514 = "Bitte entferne ";
        class160.field2710 = " zuerst von deiner Ignorieren-Liste!";
        class36.field793 = "M";
        class112.field2050 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class1.field24 = "gleiten:";
        class47.field954 = "Versteckt";
        class103.field1887 = " loggt sich ein.";
        class87.field1525 = "Lade Texturen - ";
        class59.field1153 = "weiss:";
        class231.field3787 = "Spieler kann nicht gefunden werden: ";
        class338.field5361 = "Verbindung zum Update-Server hergestellt.";
        class56.field1108 = "Auswählen";
        class16.field463 = "Nehmen";
        class158.field2680 = "Wordpack geladen.";
        class119.field2114 = "Konfig geladen.";
        class338.field5354 = "Hierhin drehen";
        class260.field4249 = "Okay";
        class36.field789 = "Fertigkeit: ";
        class73.field1333 = "leuchten1:";
        class13.field398 = "Musik-Engine vorbereitet.";
        class167.field2791 = "blinken2:";
        client.field4581 = "scrollen:";
        class53.field1059 = "M";
        class23.field577 = "Speicher wird zugewiesen.";
        class278.field4541 = "Stufe: ";
        class316.field5148 = " loggt sich aus.";
        class312.field5099 = "gelb:";
        class284.field4645 = "Ladevorgang - bitte warte.";
        class104.field1906 = "Lade Standardeinstellungen - ";
        class332.field5296 = "Ablegen";
        class272.field4435 = "Liste der Welten geladen";
        class132.field2269 = "RuneScape wird geladen - bitte warten...";
        class18.field491 = "Eingabeprozedur geladen.";
        class137.field2336 = "Schließen";
        class362.field5732 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class232.field3800 = "T";
        class229.field3759 = "Lade Wordpack - ";
        class255.field4174 = "blinken1:";
        class105.field1919 = "Lade Liste der Welten";
        class137.field2342 = "Abbrechen";
        class344.field5438 = "leuchten3:";
        class47.field951 = "Bitte entferne ";
        class194.field3265 = "Schriftsätze geladen.";
        class73.field1332 = "Standardeinstellungen geladen";
        class334.field5328 = "Titelbild geöffnet.";
        class257.field4205 = "blaugrün:";
        class166.field2782 = "Titelbild geladen.";
        class152.field2598 = "Lade Schriftsätze - ";
        class6.field194 = "Verbindung abgebrochen.";
        class52.field1053 = "Bitte warte...";
        class275.field4484 = "Benutzeroberfläche geladen.";
        class159.field2691 = "Verbindung mit Update-Server...";
        class6.field128 = "welle:";
        class145.field2430 = ": ";
        class144.field2419 = " steht bereits auf deiner Freunde-Liste!";
        class174.field2893 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class19.field508 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class73.field1341 = "Gegenstand für Mitglieder";
        class358.field5688 = "Zugewiesener Speicher.";
        class298.field4850 = "grün:";
        class20.field518 = "Wähl eine Option";
    }

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "(I)V", line = 666)
    public static void method578(int arg0) {
        if (arg0 != 2) {
            field1364 = (int[]) null;
        }
        field1362 = null;
        field1364 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIB)V", line = 682)
    public final void method579(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1363++;
        int var6 = this.field1359 << 3;
        int var7 = (arg1 << 4) + (var6 & 0xF);
        if (arg4 != 8) {
            this.field1361 = 71;
        }
        int var8 = this.field1355 << 3;
        int var9 = (arg2 << 4) + (var8 & 0xF);
        this.method571(var6, var8, var7, var9, arg3, arg0);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)V")
    public abstract void method565(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(IIIII)V")
    public abstract void method566(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)V")
    public abstract void method568(int arg0, int arg1);

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)V")
    public abstract void method569(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIII)V")
    public abstract void method571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(II)V")
    public abstract void method572(int arg0, int arg1);

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(II)V")
    public abstract void method575(int arg0, int arg1);
}
