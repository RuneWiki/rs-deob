import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class91 extends class303 {

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
    public int field1486 = 0;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "[B")
    private byte[] field1490 = new byte[512];

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
    public int field1494 = 4;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public int field1491 = 1638;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    public int field1497 = 4;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    public int field1493 = 4;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "Z")
    public boolean field1503 = true;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "Z")
    public static boolean field1489 = false;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field1499 = new String[100];

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "I")
    public static int field1505 = 0;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "Lob;")
    public static class292 field1500;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "[S")
    private short[] field1501;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "[S")
    private short[] field1504;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILpe;I)V", line = 7)
    public final void method65(int arg0, class101 arg1, int arg2) {
        field1487++;
        if (arg0 != -4004) {
            field1489 = true;
        }
        if (arg2 == 0) {
            this.field1503 = arg1.method741(65) == 1;
        } else if (arg2 == 1) {
            this.field1497 = arg1.method741(104);
        } else if (arg2 == 2) {
            this.field1491 = arg1.method780(-17432);
            if (this.field1491 < 0) {
                this.field1501 = new short[this.field1497];
                for (int var5 = 0; var5 < this.field1497; var5++) {
                    this.field1501[var5] = (short) arg1.method780(-17432);
                }
            }
        } else if (arg2 == 3) {
            this.field1494 = this.field1493 = arg1.method741(17);
        } else if (arg2 == 4) {
            this.field1486 = arg1.method741(12);
        } else if (arg2 == 5) {
            this.field1494 = arg1.method741(arg0 + 4036);
        } else if (arg2 == 6) {
            this.field1493 = arg1.method741(78);
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V", line = 734)
    public class91() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)[I", line = 108)
    public final int[] method67(int arg0, int arg1) {
        if (arg0 != -3) {
            this.method65(-16, (class101) null, -24);
        }
        field1488++;
        int[] var3 = this.field4763.method394(0, arg1);
        if (this.field4763.field863) {
            this.method656(arg1, (byte) -126, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V", line = 131)
    public static void method654(boolean arg0) {
        if (!arg0) {
            method654(false);
        }
        field1500 = null;
        field1499 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILfa;IIII)Lfa;", line = 147)
    public static final class199 method655(int arg0, int arg1, class199 arg2, int arg3, int arg4, int arg5, int arg6) {
        field1498++;
        if (arg1 != -10) {
            method655(-60, -104, (class199) null, 110, 7, 21, 61);
        }
        long var7 = (long) arg4;
        class199 var9 = (class199) class175.field2750.method1830(var7, (byte) 52);
        if (var9 == null) {
            class130 var10 = class130.method969(class55.field878, arg4, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method976(64, 768, -50, -10, -50);
            class175.field2750.method1831(var7, var9, -13897);
        }
        int var11 = arg2.method1109();
        int var12 = arg2.method1107();
        int var13 = arg2.method1102();
        int var14 = arg2.method1117();
        class199 var15 = var9.method1103(true, true, true);
        if (arg0 != 0) {
            var15.method1134(arg0);
        }
        if (class265.field4126) {
            class171 var16 = (class171) var15;
            if (arg6 != class48.method374(arg3 + var13, arg5 + var11, 113, class41.field734) || class48.method374(arg3 + var14, arg5 + var12, arg1 ^ 0xFFFFFF82, class41.field734) != arg6) {
                for (int var17 = 0; var17 < var16.field2666; var17++) {
                    var16.field2676[var17] += class48.method374(var16.field2668[var17] + arg3, var16.field2690[var17] + arg5, class29.method193(arg1, -103), class41.field734) - arg6;
                }
                var16.field2696.field3964 = false;
                var16.field2662.field2985 = false;
            }
        } else {
            class146 var18 = (class146) var15;
            if (class48.method374(arg3 + var13, arg5 - -var11, 101, class41.field734) != arg6 || class48.method374(arg3 + var14, arg5 + var12, 99, class41.field734) != arg6) {
                for (int var19 = 0; var19 < var18.field2324; var19++) {
                    var18.field2311[var19] += class48.method374(var18.field2316[var19] + arg3, var18.field2304[var19] + arg5, 109, class41.field734) - arg6;
                }
                var18.field2315 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB[I)V", line = 237)
    public final void method656(int arg0, byte arg1, int[] arg2) {
        field1506++;
        int var4 = class36.field591[arg0] * this.field1493;
        if (arg1 >= -119) {
            this.field1497 = -44;
        }
        if (this.field1497 == 1) {
            int var5 = this.field1504[0] << 12;
            int var6 = var4 * var5 >> 12;
            short var7 = this.field1501[0];
            int var8 = var6 >> 12;
            int var9 = this.field1494 * var5 >> 12;
            int var10 = var6 & 0xFFF;
            int var11 = this.field1493 * var5 >> 12;
            int var12 = this.field1490[var8 & 0xFF] & 0xFF;
            int var13 = class264.field4088[var10];
            int var14 = var8 + 1;
            if (var14 >= var11) {
                var14 = 0;
            }
            int var15 = this.field1490[var14 & 0xFF] & 0xFF;
            if (this.field1503) {
                for (int var16 = 0; var16 < class70.field1108; var16++) {
                    int var17 = class291.field4427[var16] * this.field1494;
                    int var18 = this.method659(var9, var13, var15, var10, var5 * var17 >> 12, var12, (byte) 125);
                    int var19 = var7 * var18 >> 12;
                    arg2[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; var20 < class70.field1108; var20++) {
                    int var21 = class291.field4427[var20] * this.field1494;
                    int var22 = this.method659(var9, var13, var15, var10, var5 * var21 >> 12, var12, (byte) 45);
                    arg2[var20] = var7 * var22 >> 12;
                }
            }
            return;
        }
        short var23 = this.field1501[0];
        if (var23 > 8 || var23 < -8) {
            int var24 = this.field1504[0] << 12;
            int var25 = this.field1493 * var24 >> 12;
            int var26 = var4 * var24 >> 12;
            int var27 = var26 >> 12;
            int var28 = var26 & 0xFFF;
            int var29 = this.field1494 * var24 >> 12;
            int var30 = this.field1490[var27 & 0xFF] & 0xFF;
            int var31 = class264.field4088[var28];
            int var32 = var27 + 1;
            if (var25 <= var32) {
                var32 = 0;
            }
            int var33 = this.field1490[var32 & 0xFF] & 0xFF;
            for (int var34 = 0; var34 < class70.field1108; var34++) {
                int var35 = class291.field4427[var34] * this.field1494;
                int var36 = this.method659(var29, var31, var33, var28, var24 * var35 >> 12, var30, (byte) 51);
                arg2[var34] = var23 * var36 >> 12;
            }
        }
        for (int var37 = 1; var37 < this.field1497; var37++) {
            short var38 = this.field1501[var37];
            if (var38 > 8 || var38 < -8) {
                int var39 = this.field1504[var37] << 12;
                int var40 = var4 * var39 >> 12;
                int var41 = this.field1493 * var39 >> 12;
                int var42 = this.field1494 * var39 >> 12;
                int var43 = var40 >> 12;
                int var44 = var40 & 0xFFF;
                int var45 = var43 + 1;
                int var46 = this.field1490[var43 & 0xFF] & 0xFF;
                int var47 = class264.field4088[var44];
                if (var45 >= var41) {
                    var45 = 0;
                }
                int var48 = this.field1490[var45 & 0xFF] & 0xFF;
                if (this.field1503 && this.field1497 - 1 == var37) {
                    for (int var49 = 0; var49 < class70.field1108; var49++) {
                        int var50 = class291.field4427[var49] * this.field1494;
                        int var51 = this.method659(var42, var47, var48, var44, var39 * var50 >> 12, var46, (byte) 13);
                        int var52 = (var38 * var51 >> 12) + arg2[var49];
                        arg2[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; var53 < class70.field1108; var53++) {
                        int var54 = class291.field4427[var53] * this.field1494;
                        int var55 = this.method659(var42, var47, var48, var44, var39 * var54 >> 12, var46, (byte) 56);
                        arg2[var53] += var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V", line = 403)
    public static final void method657(int arg0) {
        class102.field1726 = " weitere Optionen";
        class45.field780 = " loggt sich aus.";
        class210.field3351 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        field1496++;
        class43.field762 = "Starte 3D-Softwarebibliothek.";
        class156.field2476 = "Lade Liste der Welten";
        class273.field4241 = "Eingabeprozedur geladen.";
        class107.field1783 = "Stufe: ";
        class110.field1826 = "Zugewiesener Speicher.";
        class310.field4879 = "Hierhin drehen";
        class204.field3239 = "Titelbild geöffnet.";
        class18.field354 = "Angreifen";
        class252.field3888 = "blinken3:";
        class36.field653 = "Ablegen";
        class226.field3622 = "welle2:";
        class19.field357 = "blaugrün:";
        class284.field4368 = "Verbindung mit Update-Server...";
        class77.field1180 = "Bitte entferne ";
        class11.field176 = "Weiter";
        class26.field424 = "Suche nach Updates - ";
        class65.field1056 = "Kampfstufe: ";
        class204.field3238 = "Lade Schriftsätze - ";
        class244.field3771 = "leuchten2:";
        class329.field5086 = "T";
        client.field3915 = "Okay";
        class9.field135 = "M";
        class118.field1897 = "weiss:";
        class4.field22 = "Liste der Welten geladen";
        class20.field384 = "Lade Konfiguration - ";
        class102.field1724 = " steht bereits auf deiner Ignorieren-Liste!";
        class329.field5084 = "Lade Titelbild - ";
        class143.field2258 = "Gegenstand für Mitglieder";
        class298.field4716 = "schütteln:";
        class162.field2547 = "Versteckt";
        class254.field3943 = "Verbindung zum Update-Server hergestellt.";
        class48.field804 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class43.field758 = "Hierhin gehen";
        class89.field1421 = "Bitte warte...";
        class101.field1655 = "Texturen geladen.";
        class107.field1792 = "Verbindung abgebrochen.";
        class120.field1933 = "Benutzeroberfläche geladen.";
        class4.field24 = "Lade Sprites - ";
        class77.field1175 = "Wähl eine Option";
        if (arg0 > -87) {
            method654(false);
        }
        class26.field433 = ": ";
        class176.field2774 = "T";
        class294.field4620 = "3D-Softwarebibliothek gestartet.";
        class280.field4328 = " zuerst von deiner Freunde-Liste!";
        class41.field733 = "Schließen";
        class272.field4209 = "Fertigkeit: ";
        class54.field861 = "Speicher wird zugewiesen.";
        class168.field2613 = "leuchten3:";
        class57.field913 = "Schriftsätze geladen.";
        class85.field1287 = "grün:";
        class141.field2244 = "Lade Benutzeroberfläche - ";
        class50.field811 = "M";
        class281.field4336 = "gelb:";
        class179.field2831 = "gleiten:";
        class176.field2765 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class236.field3705 = "Lade Wordpack - ";
        class115.field1879 = "Abbrechen";
        class26.field436 = "Fallen lassen";
        class245.field3787 = "lila:";
        class126.field2005 = "rot:";
        class208.field3334 = "blinken2:";
        class124.field1985 = "Nehmen";
        class281.field4334 = "Auswählen";
        class111.field1836 = "scrollen:";
        class240.field3737 = "Wordpack geladen.";
        class189.field3003 = " zuerst von deiner Ignorieren-Liste!";
        class204.field3236 = "Lade Texturen - ";
        class64.field1015 = "Ladevorgang - bitte warte.";
        class305.field4779 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class41.field731 = " loggt sich ein.";
        class163.field2552 = "RuneScape wird geladen - bitte warten...";
        class115.field1877 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class170.field2645 = " steht bereits auf deiner Freunde-Liste!";
        class239.field3725 = "Bitte entferne ";
        class236.field3715 = "Musik-Engine vorbereitet.";
        class136.field2165 = "leuchten1:";
        class156.field2489 = "Spielwelt erstellt.";
        class291.field4429 = "Spieler kann nicht gefunden werden: ";
        class57.field917 = "Benutzen";
        class317.field4938 = "Konfig geladen.";
        class279.field4320 = "welle:";
        class220.field3517 = "Sprites geladen.";
        class191.field3059 = "Update-Liste geladen.";
        class254.field3945 = "blinken1:";
        class73.field1129 = "Titelbild geladen.";
        class285.field4377 = "Untersuchen";
        class151.field2422 = "Lade...";
        class60.field942 = "möchte mit dir handeln.";
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V", line = 769)
    private final void method658(int arg0) {
        field1502++;
        if (this.field1491 > 0) {
            this.field1504 = new short[this.field1497];
            this.field1501 = new short[this.field1497];
            for (int var3 = 0; var3 < this.field1497; var3++) {
                this.field1501[var3] = (short) ((int) (Math.pow((double) ((float) this.field1491 / 4096.0F), (double) var3) * 4096.0D));
                this.field1504[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field1501 != null && this.field1501.length == this.field1497) {
            this.field1504 = new short[this.field1497];
            for (int var2 = 0; var2 < this.field1497; var2++) {
                this.field1504[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        if (arg0 != 2) {
            this.field1501 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V", line = 811)
    public final void method70(int arg0) {
        field1495++;
        this.field1490 = class247.method1757(this.field1486, 511);
        this.method658(2);
        for (int var2 = this.field1497 - 1; var2 >= 1; var2--) {
            short var3 = this.field1501[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field1497--;
        }
        if (arg0 < 13) {
            this.method658(58);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIB)I", line = 841)
    private final int method659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field1492++;
        int var8 = arg3 - 4096;
        int var9 = arg4 >> 12;
        int var10 = var9 + 1;
        int var11 = arg4 & 0xFFF;
        int var12 = var9 & 0xFF;
        int var13 = var11 - 4096;
        if (arg0 <= var10) {
            var10 = 0;
        }
        if (arg6 <= 9) {
            this.field1501 = (short[]) null;
        }
        int var14 = this.field1490[arg5 + var12] & 0x3;
        int var15;
        if (var14 > 1) {
            var15 = var14 == 2 ? var11 - arg3 : -arg3 + -var11;
        } else {
            var15 = var14 == 0 ? arg3 + var11 : -var11 + arg3;
        }
        int var16 = class264.field4088[var11];
        int var17 = var10 & 0xFF;
        int var18 = this.field1490[arg5 + var17] & 0x3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? arg3 + var13 : -var13 + arg3;
        } else {
            var19 = var18 == 2 ? var13 - arg3 : -arg3 + -var13;
        }
        int var20 = ((var19 - var15) * var16 >> 12) + var15;
        int var21 = this.field1490[arg2 + var12] & 0x3;
        int var22;
        if (var21 > 1) {
            var22 = var21 == 2 ? var11 - var8 : -var11 - var8;
        } else {
            var22 = var21 == 0 ? var8 + var11 : -var11 + var8;
        }
        int var23 = this.field1490[arg2 + var17] & 0x3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var13 + var8 : var8 - var13;
        } else {
            var24 = var23 == 2 ? var13 - var8 : -var13 - var8;
        }
        int var25 = ((var24 - var22) * var16 >> 12) + var22;
        return ((var25 - var20) * arg1 >> 12) + var20;
    }
}
