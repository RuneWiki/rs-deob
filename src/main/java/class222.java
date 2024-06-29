import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class222 implements class252 {

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "Ldj;")
    private class143 field3206 = new class143(256);

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "Lfh;")
    private class140 field3193;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "Lfh;")
    private class140 field3203;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "[Lmi;")
    private class9[] field3202;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3191 = "Select";

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "J")
    public static volatile long field3200 = 0L;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field3205 = 2;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IFIIIZ)[I", line = 5)
    public final int[] method1612(int arg0, float arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3196++;
        return arg4 > -125 ? (int[]) null : this.method1047(arg2, true).method1782((double) arg1, this.field3202[arg2].field115, 30319, this.field3203, this, arg0, arg5, arg3);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIZIIIII)V", line = 23)
    public static final void method1613(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3197++;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                class277.field3967[var11][var12] = 0;
                class323.field4735[var11][var12] = 99999999;
            }
        }
        int var13 = arg2;
        class277.field3967[arg4][arg2] = 99;
        class323.field4735[arg4][arg2] = 0;
        int var14 = arg4;
        int var15 = 0;
        byte var16 = 0;
        boolean var17 = false;
        class274.field3926[var16] = arg4;
        int var28 = var16 + 1;
        class199.field2805[var16] = arg2;
        if (arg7 != -1) {
            field3191 = (String) null;
        }
        int[][] var18 = class231.field3312[class56.field724].field89;
        while (var15 != var28) {
            var14 = class274.field3926[var15];
            var13 = class199.field2805[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg0 == var14 && arg6 == var13) {
                var17 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class231.field3312[class56.field724].method51(arg6, arg8, var13, var14, (byte) -93, arg0, 2, arg3 - 1)) {
                    var17 = true;
                    break;
                }
                if (arg3 < 10 && class231.field3312[class56.field724].method54(arg0, var14, arg6, 1024, var13, arg3 - 1, arg8, 2)) {
                    var17 = true;
                    break;
                }
            }
            if (arg1 != 0 && arg10 != 0 && class231.field3312[class56.field724].method47(var13, -1, arg9, 2, arg6, arg0, arg10, arg1, var14)) {
                var17 = true;
                break;
            }
            int var19 = class323.field4735[var14][var13] + 1;
            if (var14 > 0 && class277.field3967[var14 - 1][var13] == 0 && (var18[var14 - 1][var13] & 0x2C010E) == 0 && (var18[var14 - 1][var13 + 1] & 0x2C0138) == 0) {
                class274.field3926[var28] = var14 - 1;
                class199.field2805[var28] = var13;
                class277.field3967[var14 - 1][var13] = 2;
                class323.field4735[var14 - 1][var13] = var19;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var14 < 102 && class277.field3967[var14 + 1][var13] == 0 && (var18[var14 + 2][var13] & 0x2C0183) == 0 && (var18[var14 + 2][var13 + 1] & 0x2C01E0) == 0) {
                class274.field3926[var28] = var14 + 1;
                class199.field2805[var28] = var13;
                class277.field3967[var14 + 1][var13] = 8;
                var28 = var28 + 1 & 0xFFF;
                class323.field4735[var14 + 1][var13] = var19;
            }
            if (var13 > 0 && class277.field3967[var14][var13 - 1] == 0 && (var18[var14][var13 - 1] & 0x2C010E) == 0 && (var18[var14 + 1][var13 - 1] & 0x2C0183) == 0) {
                class274.field3926[var28] = var14;
                class199.field2805[var28] = var13 - 1;
                class277.field3967[var14][var13 - 1] = 1;
                var28 = var28 + 1 & 0xFFF;
                class323.field4735[var14][var13 - 1] = var19;
            }
            if (var13 < 102 && class277.field3967[var14][var13 + 1] == 0 && (var18[var14][var13 + 2] & 0x2C0138) == 0 && (var18[var14 + 1][var13 + 2] & 0x2C01E0) == 0) {
                class274.field3926[var28] = var14;
                class199.field2805[var28] = var13 + 1;
                var28 = var28 + 1 & 0xFFF;
                class277.field3967[var14][var13 + 1] = 4;
                class323.field4735[var14][var13 + 1] = var19;
            }
            if (var14 > 0 && var13 > 0 && class277.field3967[var14 - 1][var13 - 1] == 0 && (var18[var14 - 1][var13] & 0x2C013E) == 0 && (var18[var14 - 1][var13 - 1] & 0x2C010E) == 0 && (var18[var14][var13 - 1] & 0x2C018F) == 0) {
                class274.field3926[var28] = var14 - 1;
                class199.field2805[var28] = var13 - 1;
                var28 = var28 + 1 & 0xFFF;
                class277.field3967[var14 - 1][var13 - 1] = 3;
                class323.field4735[var14 - 1][var13 - 1] = var19;
            }
            if (var14 < 102 && var13 > 0 && class277.field3967[var14 + 1][var13 - 1] == 0 && (var18[var14 + 1][var13 - 1] & 0x2C018F) == 0 && (var18[var14 + 2][var13 - 1] & 0x2C0183) == 0 && (var18[var14 + 2][var13] & 0x2C01E3) == 0) {
                class274.field3926[var28] = var14 + 1;
                class199.field2805[var28] = var13 - 1;
                var28 = var28 + 1 & 0xFFF;
                class277.field3967[var14 + 1][var13 - 1] = 9;
                class323.field4735[var14 + 1][var13 - 1] = var19;
            }
            if (var14 > 0 && var13 < 102 && class277.field3967[var14 - 1][var13 + 1] == 0 && (var18[var14 - 1][var13 + 1] & 0x2C013E) == 0 && (var18[var14 - 1][var13 + 2] & 0x2C0138) == 0 && (var18[var14][var13 + 2] & 0x2C01F8) == 0) {
                class274.field3926[var28] = var14 - 1;
                class199.field2805[var28] = var13 + 1;
                var28 = var28 + 1 & 0xFFF;
                class277.field3967[var14 - 1][var13 + 1] = 6;
                class323.field4735[var14 - 1][var13 + 1] = var19;
            }
            if (var14 < 102 && var13 < 102 && class277.field3967[var14 + 1][var13 + 1] == 0 && (var18[var14 + 1][var13 + 2] & 0x2C01F8) == 0 && (var18[var14 + 2][var13 + 2] & 0x2C01E0) == 0 && (var18[var14 + 2][var13 + 1] & 0x2C01E3) == 0) {
                class274.field3926[var28] = var14 + 1;
                class199.field2805[var28] = var13 + 1;
                var28 = var28 + 1 & 0xFFF;
                class277.field3967[var14 + 1][var13 + 1] = 12;
                class323.field4735[var14 + 1][var13 + 1] = var19;
            }
        }
        if (!var17) {
            if (!arg5) {
                return;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg0 - var22; var23 <= arg0 + var22; var23++) {
                for (int var24 = arg6 - var22; var24 <= arg6 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class323.field4735[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (arg0 > var23) {
                            var25 = arg0 - var23;
                        } else if ((arg0 + arg1 - 1) < var23) {
                            var25 = var23 - (arg0 + arg1 - 1);
                        }
                        if (var24 < arg6) {
                            var26 = arg6 - var24;
                        } else if (var24 > (arg6 + arg10 - 1)) {
                            var26 = var24 + 1 - arg6 - arg10;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && var21 > class323.field4735[var23][var24]) {
                            var21 = class323.field4735[var23][var24];
                            var13 = var24;
                            var14 = var23;
                            var20 = var27;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return;
            }
            if (arg4 == var14 && arg2 == var13) {
                return;
            }
        }
        class133.field1818 = false;
        class116.field1499 = var14;
        class5.field53 = var13;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 372)
    public static final void method1614(String arg0, int arg1) {
        field3192++;
        class194.field2690 = arg0;
        if (class157.field2216.field883 == null) {
            return;
        }
        try {
            String var2 = class157.field2216.field883.getParameter("cookieprefix");
            if (arg1 < 3) {
                return;
            }
            String var3 = class157.field2216.field883.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class245.method1726(class6.method37(10828) + 94608000000L, 1) + "; Max-Age=" + 94608000L;
            }
            class200.method1471(1240, "document.cookie=\"" + var5 + "\"", class157.field2216.field883);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 411)
    public static final void method1615(int arg0) {
        class318.field4684.method2258((byte) 86);
        if (arg0 == -5069) {
            field3194++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(IZ)Lln;", line = 424)
    public class255 method1047(int arg0, boolean arg1) {
        field3199++;
        class213 var3 = this.field3206.method1116(17301, (long) arg0);
        if (var3 != null) {
            return (class255) var3;
        }
        byte[] var4 = this.field3193.method1060(arg0, arg1);
        if (var4 == null) {
            return null;
        } else {
            class255 var5 = new class255(new class299(var4));
            this.field3206.method1115((long) arg0, 30, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 448)
    public static void method1616(byte arg0) {
        if (arg0 == -10) {
            field3191 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Z", line = 458)
    public final boolean method1617(int arg0, int arg1) {
        if (arg1 != 1) {
            method1614((String) null, -120);
        }
        class255 var3 = this.method1047(arg0, true);
        field3204++;
        return var3 != null && var3.method1778(this, this.field3203, -50);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)Lmi;", line = 479)
    public final class9 method1618(int arg0, byte arg1) {
        int var3 = -99 / ((arg1 - 64) / 36);
        field3195++;
        return this.field3202[arg0];
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 495)
    public static final String method1619(int arg0, long arg1) {
        if (arg0 <= 92) {
            method1615(48);
        }
        field3201++;
        return class92.method667(0, arg1);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(CI)Z", line = 506)
    public static final boolean method1620(char arg0, int arg1) {
        field3198++;
        if (!(arg1 <= ~arg0 || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            int var2 = 0;
            char[] var3 = class131.field1785;
            while (var2 < var3.length) {
                char var4 = var3[var2];
                if (arg0 == var4) {
                    return true;
                }
                var2++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lfh;Lfh;Lfh;)V", line = 879)
    public class222(class140 arg0, class140 arg1, class140 arg2) {
        this.field3193 = arg1;
        this.field3203 = arg2;
        class299 var4 = new class299(arg0.method1089(0, (byte) 114, 0));
        int var5 = var4.method2083((byte) -116);
        this.field3202 = new class9[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method2096((byte) -122) == 1) {
                this.field3202[var6] = new class9();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field3202[var7] != null) {
                this.field3202[var7].field116 = var4.method2096((byte) -122) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field3202[var8] != null) {
                this.field3202[var8].field107 = var4.method2096((byte) -122) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3202[var9] != null) {
                this.field3202[var9].field106 = var4.method2096((byte) -122) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field3202[var10] != null) {
                this.field3202[var10].field102 = var4.method2096((byte) -122) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field3202[var11] != null) {
                this.field3202[var11].field113 = var4.method2104(111);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field3202[var12] != null) {
                this.field3202[var12].field109 = var4.method2104(97);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field3202[var13] != null) {
                this.field3202[var13].field110 = var4.method2104(116);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field3202[var14] != null) {
                this.field3202[var14].field111 = var4.method2104(120);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field3202[var15] != null) {
                this.field3202[var15].field114 = (short) var4.method2083((byte) -36);
            }
        }
        if (var4.field4351 < var4.field4350.length) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field3202[var16] != null) {
                    var4.method2104(101);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field3202[var17] != null) {
                    var4.method2104(122);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field3202[var18] != null) {
                    var4.method2096((byte) -122);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field3202[var19] != null) {
                    this.field3202[var19].field115 = var4.method2096((byte) -122) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field3202[var20] != null) {
                    var4.method2104(110);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field3202[var21] != null) {
                    var4.method2096((byte) -122);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field3202[var22] != null) {
                    var4.method2096((byte) -122);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field3202[var23] != null) {
                    var4.method2096((byte) -122);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V", line = 544)
    public static final void method1621(int arg0) {
        class176.field2406 = "Fallen lassen";
        class215.field3041 = "leuchten2:";
        class273.field3909 = "Schließen";
        class62.field779 = "Verbindung zum Update-Server hergestellt.";
        class236.field3396 = "rot:";
        class212.field2993 = "Speicher wird zugewiesen.";
        class106.field1379 = " weitere Optionen";
        class133.field1814 = "Wordpack geladen.";
        class204.field2836 = "Titelbild geladen.";
        class90.field1145 = "Standardinstellungen geladen";
        field3191 = "Auswählen";
        class30.field338 = "Suche nach Updates - ";
        class24.field274 = "Lade...";
        class91.field1179 = "Lade Titelbild - ";
        class316.field4663 = "Weiter";
        class121.field1592 = "Lade Sprites - ";
        class194.field2688 = "Bitte entferne ";
        class167.field2330 = "Lade Texturen - ";
        class344.field5347 = "Gegenstand für Mitglieder";
        class160.field2293 = "Benutzen";
        class122.field1599 = "Liste der Welten geladen";
        class330.field4829 = "RuneScape wird geladen - bitte warten...";
        class97.field1275 = "M";
        class3.field25 = "Lade Wordpack - ";
        class80.field1019 = "Verbindung mit Update-Server...";
        class3.field33 = "Starte 3D-Softwarebibliothek.";
        class234.field3357 = "welle:";
        class138.field1887 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class191.field2647 = "Okay";
        class308.field4539 = "schütteln:";
        class7.field65 = "Lade Benutzeroberfläche - ";
        class106.field1380 = "Lade Standardeinstellungen - ";
        class173.field2389 = " steht bereits auf deiner Ignorieren-Liste!";
        class196.field2711 = "3D-Softwarebibliothek gestartet.";
        class249.field3623 = "M";
        class161.field2298 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class233.field3346 = "grün:";
        class142.field1972 = "Lade Schriftsätze - ";
        class283.field4031 = "weiss:";
        class181.field2472 = "Spielwelt erstellt.";
        class91.field1156 = ": ";
        class331.field4904 = "scrollen:";
        class291.field4219 = "Spieler kann nicht gefunden werden: ";
        class106.field1378 = "Titelbild geöffnet.";
        class132.field1800 = "Lade Konfiguration - ";
        class145.field2023 = "Musik-Engine vorbereitet.";
        field3207++;
        class207.field2885 = "Ladevorgang - bitte warte.";
        class5.field52 = "Angreifen";
        class106.field1375 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class221.field3182 = " zuerst von deiner Freunde-Liste!";
        class75.field993 = "leuchten1:";
        class9.field104 = "Lade Liste der Welten";
        class157.field2213 = "blinken3:";
        class193.field2666 = "leuchten3:";
        if (arg0 != 1) {
            method1616((byte) 29);
        }
        class180.field2469 = "möchte mit dir handeln.";
        class357.field5589 = "Hierhin drehen";
        class204.field2834 = "T";
        class146.field2040 = "Sprites geladen.";
        class90.field1135 = "Hierhin gehen";
        class75.field986 = "Wähl eine Option";
        class258.field3755 = "blinken1:";
        class115.field1488 = " loggt sich ein.";
        class72.field957 = " loggt sich aus.";
        class297.field4310 = "Versteckt";
        class238.field3445 = "blaugrün:";
        class206.field2868 = "Update-Liste geladen.";
        class316.field4654 = "Eingabeprozedur geladen.";
        class170.field2361 = "Bitte warte...";
        class253.field3697 = "Verbindung abgebrochen.";
        class84.field1077 = "Abbrechen";
        class258.field3756 = "welle2:";
        class190.field2630 = "Stufe: ";
        class212.field2994 = "T";
        class62.field778 = "Untersuchen";
        class28.field325 = "Schriftsätze geladen.";
        class178.field2438 = "Ablegen";
        class125.field1664 = "Zugewiesener Speicher.";
        class109.field1419 = "Benutzeroberfläche geladen.";
        class92.field1198 = "Fertigkeit: ";
        class288.field4177 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class135.field1837 = "gleiten:";
        class190.field2629 = " steht bereits auf deiner Freunde-Liste!";
        class133.field1819 = "Bitte entferne ";
        class236.field3385 = "blinken2:";
        class27.field312 = "Mechscape wird geladen - bitte warten...";
        class213.field3010 = "Konfig geladen.";
        class59.field755 = "Nehmen";
        class317.field4681 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class23.field252 = "Texturen geladen.";
        class163.field2313 = "gelb:";
        class88.field1108 = "lila:";
        class132.field1793 = "Kampfstufe: ";
        class283.field4036 = " zuerst von deiner Ignorieren-Liste!";
    }
}
