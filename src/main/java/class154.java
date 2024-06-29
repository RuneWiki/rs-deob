import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class154 extends class16 {

    @OriginalMember(owner = "client!um", name = "V", descriptor = "[S")
    private short[] field2352 = new short[257];

    @OriginalMember(owner = "client!um", name = "fb", descriptor = "I")
    private int field2362 = 0;

    @OriginalMember(owner = "client!um", name = "cb", descriptor = "Z")
    public static boolean field2359 = false;

    @OriginalMember(owner = "client!um", name = "Z", descriptor = "F")
    public static float field2356;

    @OriginalMember(owner = "client!um", name = "Q", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!um", name = "U", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!um", name = "X", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!um", name = "ab", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!um", name = "bb", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!um", name = "db", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!um", name = "eb", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!um", name = "gb", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!um", name = "hb", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!um", name = "ib", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!um", name = "jb", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!um", name = "Y", descriptor = "Lbi;")
    public static class91 field2355;

    @OriginalMember(owner = "client!um", name = "R", descriptor = "[I")
    private int[] field2348;

    @OriginalMember(owner = "client!um", name = "T", descriptor = "[I")
    public static int[] field2350;

    @OriginalMember(owner = "client!um", name = "W", descriptor = "[I")
    private int[] field2353;

    @OriginalMember(owner = "client!um", name = "S", descriptor = "[[I")
    private int[][] field2349;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(B)I", line = 5)
    public static final int method1069(byte arg0) {
        if (arg0 != 6) {
            field2355 = (class91) null;
        }
        field2354++;
        try {
            if (class238.field3764 == 0) {
                if (class237.field3747 > (class304.method2128((byte) -101) - 5000L)) {
                    return 0;
                }
                class142.field2128 = class264.field4183.method41(class326.field5089, class214.field3472, arg0 - 7);
                class113.field1682 = class304.method2128((byte) -114);
                class238.field3764 = 1;
            }
            if ((class113.field1682 + 30000L) < class304.method2128((byte) -128)) {
                return class49.method343(false, 1000);
            }
            if (class238.field3764 == 1) {
                if (class142.field2128.field3488 == 2) {
                    return class49.method343(false, 1001);
                }
                if (class142.field2128.field3488 != 1) {
                    return -1;
                }
                int var1 = 0;
                class69.field901 = new class300((Socket) class142.field2128.field3490, class264.field4183);
                if (class142.field2129) {
                    var1 = class283.field4464;
                }
                class142.field2128 = null;
                class21.field313.field3129 = 0;
                class21.field313.method1365(-32769, 23);
                class21.field313.method1350(var1, -86);
                class69.field901.method2101(class21.field313.field3128, (byte) 18, 0, class21.field313.field3129);
                if (field2355 != null) {
                    field2355.method656((byte) 10);
                }
                if (class296.field4640 != null) {
                    class296.field4640.method656((byte) 10);
                }
                int var2 = class69.field901.method2099(0);
                if (field2355 != null) {
                    field2355.method656((byte) 10);
                }
                if (class296.field4640 != null) {
                    class296.field4640.method656((byte) 10);
                }
                if (var2 != 0) {
                    return class49.method343(false, var2);
                }
                class238.field3764 = 2;
            }
            if (class238.field3764 == 2) {
                if (class69.field901.method2100(0) < 2) {
                    return -1;
                }
                class8.field90 = class69.field901.method2099(arg0 - 6);
                class8.field90 <<= 0x8;
                class8.field90 += class69.field901.method2099(0);
                class237.field3755 = new byte[class8.field90];
                class92.field1425 = 0;
                class238.field3764 = 3;
            }
            if (class238.field3764 != 3) {
                return -1;
            }
            int var3 = class69.field901.method2100(0);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > (class8.field90 - class92.field1425)) {
                var3 = class8.field90 - class92.field1425;
            }
            class69.field901.method2092(var3, 15167, class237.field3755, class92.field1425);
            class92.field1425 += var3;
            if (class8.field90 > class92.field1425) {
                return -1;
            } else if (class237.method1689(arg0 ^ 0x6C, class237.field3755)) {
                class266.field4196 = new class255[class325.field5080];
                int var4 = 0;
                for (int var5 = class30.field428; var5 <= class26.field380; var5++) {
                    class255 var6 = class128.method874(93, var5);
                    if (var6 != null) {
                        class266.field4196[var4++] = var6;
                    }
                }
                class69.field901.method2095(arg0 + 8731);
                class238.field3764 = 0;
                class69.field901 = null;
                class237.field3755 = null;
                class324.field5066 = 0;
                class237.field3747 = class304.method2128((byte) -78);
                return 0;
            } else {
                return class49.method343(false, 1002);
            }
        } catch (IOException var8) {
            return class49.method343(false, 1003);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 141)
    public static final void method1070(boolean arg0, String arg1, int arg2) {
        class179 var3 = class319.method2220(arg2, (byte) -66, 3);
        field2365++;
        if (!arg0) {
            var3.method1242((byte) -85);
            var3.field2898 = arg1;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(Z)V", line = 154)
    public static void method1071(boolean arg0) {
        if (arg0) {
            field2355 = null;
            field2350 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "g", descriptor = "(I)V", line = 178)
    private final void method1072(int arg0) {
        int var2 = this.field2362;
        if (var2 == 2) {
            for (int var20 = 0; var20 < 257; var20++) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < (this.field2349.length - 1) && this.field2349[var22][0] <= var21; var22++) {
                }
                int[] var23 = this.field2349[var22 - 1];
                int[] var24 = this.field2349[var22];
                int var25 = this.method1076((byte) 82, var22 - 2)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = var26 - var25;
                int var29 = this.method1076((byte) 82, var22 + 1)[1];
                int var30 = var29 + var27 - var26 - var25;
                int var31 = var25 - var30 - var27;
                int var32 = (var21 - var23[0] << 12) / (var24[0] - var23[0]);
                int var34 = var28 * var32 >> 12;
                int var35 = var32 * var32 >> 12;
                int var36 = (var30 * var32 >> 12) * var35 >> 12;
                int var37 = var31 * var35 >> 12;
                int var38 = var36 + var37 + var34 + var27;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field2352[var20] = (short) var38;
            }
        } else if (var2 == 1) {
            for (int var11 = 0; var11 < 257; var11++) {
                int var12 = var11 << 4;
                int var13;
                for (var13 = 1; this.field2349.length - 1 > var13 && var12 >= this.field2349[var13][0]; var13++) {
                }
                int[] var14 = this.field2349[var13];
                int[] var15 = this.field2349[var13 - 1];
                int var16 = (var12 - var15[0] << 12) / (var14[0] - var15[0]);
                int var17 = 4096 - class229.field3652[(var16 & 0x1FE3) >> 5] >> 1;
                int var18 = 4096 - var17;
                int var19 = var15[1] * var18 + (var14[1] * var17) >> 12;
                if (var19 <= -32768) {
                    var19 = -32767;
                }
                if (var19 >= 32768) {
                    var19 = 32767;
                }
                this.field2352[var11] = (short) var19;
            }
        } else {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; var5 < (this.field2349.length - 1) && var4 >= this.field2349[var5][0]; var5++) {
                }
                int[] var6 = this.field2349[var5 - 1];
                int[] var7 = this.field2349[var5];
                int var8 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var9 = 4096 - var8;
                int var10 = var6[1] * var9 + (var7[1] * var8) >> 12;
                if (var10 <= -32768) {
                    var10 = -32767;
                }
                if (var10 >= 32768) {
                    var10 = 32767;
                }
                this.field2352[var3] = (short) var10;
            }
        }
        if (arg0 >= -118) {
            method1073(-78);
        }
        field2361++;
    }

    @OriginalMember(owner = "client!um", name = "h", descriptor = "(I)V", line = 353)
    public static final void method1073(int arg0) {
        field2360++;
        class22.field329.method1623(1);
        if (arg0 < 114) {
            field2355 = (class91) null;
        }
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(B)V", line = 366)
    public final void method55(byte arg0) {
        if (this.field2349 == null) {
            this.field2349 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (arg0 != 0) {
            return;
        }
        field2364++;
        if (this.field2349.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field2362 == 2) {
            this.method1074(-21602);
        }
        class103.method723(false);
        this.method1072(-123);
    }

    @OriginalMember(owner = "client!um", name = "i", descriptor = "(I)V", line = 395)
    private final void method1074(int arg0) {
        field2347++;
        int[] var2 = this.field2349[0];
        int[] var3 = this.field2349[this.field2349.length - 2];
        if (arg0 != -21602) {
            this.field2348 = (int[]) null;
        }
        int[] var4 = this.field2349[1];
        int[] var5 = this.field2349[this.field2349.length - 1];
        this.field2353 = new int[] { var2[0] + var2[0] - var4[0], var2[1] + var2[1] + -var4[1] };
        this.field2348 = new int[] { var3[0] - (var5[0] - var3[0]), var3[1] + -var5[1] + var3[1] };
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V", line = 414)
    public class154() {
        super(1, true);
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(ZI)[I", line = 418)
    public final int[] method8(boolean arg0, int arg1) {
        if (!arg0) {
            field2359 = false;
        }
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        field2351++;
        if (this.field207.field4024) {
            int[] var4 = this.method103(0, 4389, arg1);
            for (int var5 = 0; var5 < class276.field4376; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field2352[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(B)V", line = 460)
    public static final void method1075(byte arg0) {
        class18.field254 = "rot:";
        class46.field625 = "Update-Liste geladen.";
        class100.field1528 = "T";
        class51.field697 = "Lade Konfiguration - ";
        class77.field1169 = "Konfig geladen.";
        class182.field2941 = "blinken3:";
        class222.field3543 = "grün:";
        class45.field619 = "Versteckt";
        class249.field3955 = "Hierhin gehen";
        class93.field1436 = "Schließen";
        class188.field3062 = "Wähl eine Option";
        class45.field621 = " weitere Optionen";
        class18.field238 = " steht bereits auf deiner Ignorieren-Liste!";
        class188.field3060 = " zuerst von deiner Ignorieren-Liste!";
        class68.field881 = "Bitte warte...";
        class341.field5316 = "gelb:";
        class37.field494 = "Lade Texturen - ";
        class44.field607 = "gleiten:";
        class173.field2768 = "Untersuchen";
        class325.field5077 = "Starte 3D-Softwarebibliothek.";
        class287.field4529 = "Kampfstufe: ";
        class321.field5032 = "M";
        class179.field2896 = "Lade Liste der Welten";
        class331.field5153 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class105.field1588 = "Verbindung abgebrochen.";
        class290.field4577 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class288.field4533 = "Ladevorgang - bitte warte.";
        class309.field4831 = "Lade...";
        class173.field2748 = "Auswählen";
        class201.field3290 = " steht bereits auf deiner Freunde-Liste!";
        class269.field4249 = "3D-Softwarebibliothek gestartet.";
        class247.field3939 = "Gegenstand für Mitglieder";
        class164.field2671 = "Benutzeroberfläche geladen.";
        class242.field3847 = "Lade Benutzeroberfläche - ";
        class138.field2068 = "Benutzen";
        class224.field3567 = "Lade Titelbild - ";
        if (arg0 > -21) {
            return;
        }
        class79.field1191 = "Bitte entferne ";
        class44.field598 = "Wordpack geladen.";
        class305.field4758 = "Angreifen";
        class291.field4593 = "Musik-Engine vorbereitet.";
        class266.field4200 = "welle2:";
        class26.field378 = "Standardinstellungen geladen";
        class294.field4622 = "RuneScape wird geladen - bitte warten...";
        class98.field1496 = "Lade Schriftsätze - ";
        class255.field4048 = "Okay";
        class174.field2783 = "leuchten3:";
        class140.field2091 = "weiss:";
        class24.field341 = "Spielwelt erstellt.";
        class55.field730 = "blinken1:";
        class24.field343 = "Abbrechen";
        field2358++;
        class103.field1581 = "Suche nach Updates - ";
        class91.field1407 = "Lade Wordpack - ";
        class226.field3597 = "Weiter";
        class93.field1441 = "Verbindung zum Update-Server hergestellt.";
        class191.field3093 = "scrollen:";
        class113.field1687 = "Texturen geladen.";
        class236.field3743 = "lila:";
        class330.field5150 = "leuchten2:";
        class246.field3919 = "leuchten1:";
        class132.field1967 = "T";
        class5.field56 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class92.field1422 = "Ablegen";
        class103.field1574 = "blaugrün:";
        class253.field4026 = "Speicher wird zugewiesen.";
        class198.field3252 = "Fertigkeit: ";
        class232.field3714 = "Schriftsätze geladen.";
        class172.field2732 = "Nehmen";
        class342.field5324 = "Liste der Welten geladen";
        class107.field1617 = "Fallen lassen";
        class59.field784 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class288.field4536 = "Sprites geladen.";
        class187.field3042 = " loggt sich ein.";
        class292.field4600 = "Stufe: ";
        class260.field4147 = " loggt sich aus.";
        class28.field401 = "Lade Standardeinstellungen - ";
        class250.field3983 = "Bitte entferne ";
        class93.field1435 = "Zugewiesener Speicher.";
        class277.field4384 = "blinken2:";
        class142.field2111 = "welle:";
        class102.field1559 = "möchte mit dir handeln.";
        class84.field1277 = "Titelbild geöffnet.";
        class314.field4886 = "Eingabeprozedur geladen.";
        class176.field2874 = "schütteln:";
        class326.field5081 = "Titelbild geladen.";
        class193.field3170 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class3.field26 = "Lade Sprites - ";
        class17.field226 = "Hierhin drehen";
        class37.field500 = ": ";
        class107.field1612 = " zuerst von deiner Freunde-Liste!";
        class86.field1310 = "Spieler kann nicht gefunden werden: ";
        class98.field1491 = "Verbindung mit Update-Server...";
        class329.field5132 = "M";
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BLim;I)V", line = 798)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        if (arg0 != -7) {
            field2355 = (class91) null;
        }
        if (arg2 == 0) {
            this.field2362 = arg1.method1399(-1172389784);
            this.field2349 = new int[arg1.method1399(arg0 ^ 0x45E13F91)][2];
            for (int var4 = 0; var4 < this.field2349.length; var4++) {
                this.field2349[var4][0] = arg1.method1396(-84);
                this.field2349[var4][1] = arg1.method1396(arg0 - 117);
            }
        }
        field2363++;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BI)[I", line = 829)
    private final int[] method1076(byte arg0, int arg1) {
        if (arg0 != 82) {
            method1071(true);
        }
        field2366++;
        if (arg1 < 0) {
            return this.field2353;
        } else if (arg1 >= this.field2349.length) {
            return this.field2348;
        } else {
            return this.field2349[arg1];
        }
    }
}
