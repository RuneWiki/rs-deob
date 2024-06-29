import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class12 {

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public int field177 = -1;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public int field188 = -1;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public int field195 = 99;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "Z")
    public boolean field175 = false;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public int field185 = -1;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    public int field193 = 2;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public int field192 = -1;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "Z")
    public boolean field196 = false;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "Z")
    public boolean field202 = false;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public int field179 = -1;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public int field190 = 5;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "Z")
    public boolean field201 = false;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    public int field200;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "[I")
    public int[] field176;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "[I")
    public int[] field182;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "[I")
    private int[] field199;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "[Lck;")
    public static class351[] field205;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "[Z")
    public boolean[] field187;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "[Z")
    public static boolean[] field197;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "[[B")
    public static byte[][] field198;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "[[I")
    public int[][] field181;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "[[[B")
    public static byte[][][] field184;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method81(String arg0, int arg1) throws ClassNotFoundException {
        field174++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else {
            if (arg1 != -5024) {
                field184 = null;
            }
            if (arg0.equals("S")) {
                return Short.TYPE;
            } else if (arg0.equals("J")) {
                return Long.TYPE;
            } else if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public final void method82(int arg0) {
        if (this.field179 == -1) {
            if (this.field187 == null) {
                this.field179 = 0;
            } else {
                this.field179 = 2;
            }
        }
        field204++;
        if (arg0 != 65535) {
            this.method87((class228) null, 71, 11);
        }
        if (this.field185 != -1) {
            return;
        }
        if (this.field187 == null) {
            this.field185 = 0;
        } else {
            this.field185 = 2;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
    public static final void method83(int arg0) {
        class331.field4814 = "3D-Softwarebibliothek gestartet.";
        class171.field2295 = "Auswählen";
        class230.field3075 = "T";
        class396.field5857 = "Weiter";
        class237.field3184 = "Bitte entferne ";
        if (arg0 < 60) {
            field205 = null;
        }
        class166.field2244 = "Standardeinstellungen geladen";
        class259.field3783 = "Verbindung zum Update-Server hergestellt.";
        class148.field2034 = "Schriftsätze geladen.";
        class83.field1201 = "blinken2:";
        class17.field259 = "Spieler kann nicht gefunden werden: ";
        class288.field4159 = "Mechscape wird geladen - bitte warten...";
        class356.field5145 = "Ablegen";
        class147.field2014 = "welle:";
        class278.field4027 = "RuneScape wird geladen - bitte warten...";
        class363.field5244 = "scrollen:";
        class105.field1524 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class407.field6045 = "Schließen";
        class396.field5866 = " steht bereits auf deiner Freunde-Liste!";
        class159.field2148 = " zuerst von deiner Freunde-Liste!";
        class184.field2490 = "gelb:";
        class277.field4014 = "Lade Benutzeroberfläche - ";
        class264.field3831 = "Titelbild geladen.";
        class270.field3921 = "Lade...";
        class182.field2456 = "weiss:";
        class234.field3127 = "rot:";
        class205.field2769 = "Spielwelt erstellt.";
        class44.field628 = "Lade Standardeinstellungen - ";
        class104.field1515 = "blinken3:";
        class353.field5109 = "Speicher wird zugewiesen.";
        class225.field2960 = "Hierhin gehen";
        field194++;
        class163.field2186 = "grün:";
        class199.field2654 = "Nehmen";
        class174.field2325 = "blinken1:";
        class319.field4660 = " zuerst von deiner Ignorieren-Liste!";
        class165.field2228 = " loggt sich ein.";
        class218.field2883 = " steht bereits auf deiner Ignorieren-Liste!";
        class161.field2161 = "Lade Konfiguration - ";
        class202.field2706 = "Texturen geladen.";
        class167.field2262 = "Starte 3D-Softwarebibliothek.";
        class405.field6016 = "Lade Texturen - ";
        class291.field4172 = "Client-Variablen geladen";
        class393.field5623 = "Fallen lassen";
        class211.field2829 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class398.field5937 = "T";
        class218.field2884 = "Abbrechen";
        class313.field4587 = "Versteckt";
        class372.field5413 = "Ladevorgang - bitte warte.";
        class423.field6237 = "Musik-Engine vorbereitet.";
        class38.field532 = "Untersuchen";
        class298.field4321 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class369.field5333 = "M";
        class353.field5116 = "Liste der Welten geladen";
        class407.field6037 = "Hierhin drehen";
        class267.field3857 = "Benutzeroberfläche geladen.";
        class431.field6337 = "leuchten1:";
        class323.field4736 = "Eingabeprozedur geladen.";
        class234.field3125 = "Zugewiesener Speicher.";
        class52.field714 = "Lade Schriftsätze - ";
        class284.field4136 = "Lade Wordpack - ";
        class194.field2599 = "gleiten:";
        class153.field2072 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class169.field2270 = "Suche nach Updates - ";
        class218.field2882 = "Lade Titelbild - ";
        class144.field1967 = " loggt sich aus.";
        class124.field1725 = "Kampfstufe: ";
        class442.field6481 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class296.field4252 = "Titelbild geöffnet.";
        class353.field5112 = "Lade Sprites - ";
        class435.field6401 = "Wähl eine Option";
        class379.field5507 = "Angreifen";
        class112.field1583 = "Okay";
        class347.field5030 = "Gegenstand für Mitglieder";
        class117.field1650 = "M";
        class72.field1045 = "lila:";
        class333.field4829 = "Wordpack geladen.";
        class315.field4600 = "Update-Liste geladen.";
        class173.field2316 = "Bitte warte...";
        class197.field2629 = "Fertigkeit: ";
        class346.field4972 = "Stufe: ";
        class159.field2149 = ": ";
        class120.field1679 = " weitere Optionen";
        class223.field2942 = "welle2:";
        class400.field5968 = "schütteln:";
        class228.field3032 = "leuchten3:";
        class432.field6342 = "Lade Liste der Welten";
        class306.field4502 = "Sprites geladen.";
        class92.field1295 = "blaugrün:";
        class171.field2300 = "Konfig geladen.";
        class451.field6585 = "Bitte entferne ";
        class153.field2075 = "leuchten2:";
        class384.field5553 = "Benutzen";
        class442.field6475 = "Verbindung abgebrochen.";
        class7.field93 = "Verbindung mit Update-Server...";
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BIIIILdc;II)Ldc;")
    public final class375 method84(byte arg0, int arg1, int arg2, int arg3, int arg4, class375 arg5, int arg6, int arg7) {
        field180++;
        int var9 = this.field176[arg2];
        int var10 = this.field182[arg2];
        if (arg4 <= 37) {
            return null;
        }
        class442 var11 = class307.method2093(3, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg5.method1568((byte) 1, arg7, true);
        }
        class442 var13 = null;
        if ((this.field196 || class120.field1676) && arg3 != -1 && this.field182.length > arg3) {
            int var14 = this.field182[arg3];
            var13 = class307.method2093(3, var14 >> 16);
            arg3 = var14 & 0xFFFF;
        }
        if (this.field201) {
            arg7 |= 0x200;
        }
        if (var11.method2782((byte) 87, var12)) {
            arg7 |= 0x80;
        }
        if (var11.method2783(var12, (byte) -83)) {
            arg7 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method2782((byte) 87, arg3)) {
                arg7 |= 0x80;
            }
            if (var13.method2783(arg3, (byte) -83)) {
                arg7 |= 0x100;
            }
        }
        int var15 = arg7 | 0x20;
        class375 var16 = arg5.method1568(arg0, var15, true);
        var16.method2429(var12, var9, var13, arg6 - 1, 2, arg3, arg1, var11, this.field201);
        return var16;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lnj;I)V")
    public final void method85(class228 arg0, int arg1) {
        if (arg1 != 31731) {
            field198 = null;
        }
        field186++;
        while (true) {
            int var3 = arg0.method1348(arg1 - 31851);
            if (var3 == 0) {
                return;
            }
            this.method87(arg0, -84, var3);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BIIZ)I")
    public final int method86(byte arg0, int arg1, int arg2, boolean arg3) {
        field178++;
        int var5 = 0;
        int var6 = 0;
        if (arg0 < 58) {
            this.field193 = 111;
        }
        int var7 = this.field182[arg1];
        class442 var8 = null;
        class442 var9 = class307.method2093(3, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field196 || class120.field1676) && arg2 != -1 && arg2 < this.field182.length) {
            int var11 = this.field182[arg2];
            var8 = class307.method2093(3, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field201) {
            var5 |= 0x200;
        }
        if (var9.method2782((byte) 87, var10)) {
            var5 |= 0x80;
        }
        if (var9.method2783(var10, (byte) -83)) {
            var5 |= 0x100;
        }
        if (var8 != null) {
            if (var8.method2782((byte) 87, var6)) {
                var5 |= 0x80;
            }
            if (var8.method2783(var6, (byte) -83)) {
                var5 |= 0x100;
            }
        }
        if (this.field199 != null && arg3) {
            if (this.field199.length > arg1) {
                int var12 = this.field199[arg1];
                if (var12 != 65535) {
                    class442 var13 = class307.method2093(3, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method2782((byte) 87, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method2783(var14, (byte) -83)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
            if ((this.field196 || class120.field1676) && arg2 != -1 && this.field199.length > arg2) {
                int var15 = this.field199[arg2];
                if (var15 != 65535) {
                    class442 var16 = class307.method2093(3, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method2782((byte) 87, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method2783(var17, (byte) -83)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lnj;II)V")
    private final void method87(class228 arg0, int arg1, int arg2) {
        int var4 = 85 % ((4 - arg1) / 37);
        if (arg2 == 1) {
            int var14 = arg0.method1343(255);
            this.field176 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field176[var15] = arg0.method1343(255);
            }
            this.field182 = new int[var14];
            for (int var16 = 0; var16 < var14; var16++) {
                this.field182[var16] = arg0.method1343(255);
            }
            for (int var17 = 0; var17 < var14; var17++) {
                this.field182[var17] += arg0.method1343(255) << 16;
            }
        } else if (arg2 == 2) {
            this.field177 = arg0.method1343(255);
        } else if (arg2 == 3) {
            this.field187 = new boolean[256];
            int var5 = arg0.method1348(-105);
            for (int var6 = 0; var6 < var5; var6++) {
                this.field187[arg0.method1348(-108)] = true;
            }
        } else if (arg2 == 4) {
            this.field202 = true;
        } else if (arg2 == 5) {
            this.field190 = arg0.method1348(-109);
        } else if (arg2 == 6) {
            this.field188 = arg0.method1343(255);
        } else if (arg2 == 7) {
            this.field192 = arg0.method1343(255);
        } else if (arg2 == 8) {
            this.field195 = arg0.method1348(-106);
        } else if (arg2 == 9) {
            this.field179 = arg0.method1348(-121);
        } else if (arg2 == 10) {
            this.field185 = arg0.method1348(-117);
        } else if (arg2 == 11) {
            this.field193 = arg0.method1348(-113);
        } else if (arg2 == 12) {
            int var7 = arg0.method1348(-106);
            this.field199 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field199[var8] = arg0.method1343(255);
            }
            for (int var9 = 0; var9 < var7; var9++) {
                this.field199[var9] += arg0.method1343(255) << 16;
            }
        } else if (arg2 == 13) {
            int var10 = arg0.method1343(255);
            this.field181 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg0.method1348(-127);
                if (var12 > 0) {
                    this.field181[var11] = new int[var12];
                    this.field181[var11][0] = arg0.method1333((byte) -110);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field181[var11][var13] = arg0.method1343(255);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field201 = true;
        } else if (arg2 == 15) {
            this.field196 = true;
        } else if (arg2 == 16) {
            this.field175 = true;
        }
        field173++;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
    public static void method88(byte arg0) {
        field205 = null;
        field197 = null;
        field184 = null;
        field198 = null;
        if (arg0 > -88) {
            field184 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZLjava/lang/String;ILlm;)Lle;")
    public static final class65 method89(boolean arg0, String arg1, int arg2, class347 arg3) {
        field183++;
        int var4 = arg3.method2270(arg1, (byte) 115);
        if (var4 == -1) {
            return new class65(0);
        }
        int[] var5 = arg3.method2253(var4, -127);
        class65 var6 = new class65(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field860) {
                class228 var9 = new class228(arg3.method2261(var5[var8++], var4, arg2 ^ 0xFFFFEB5E));
                int var10 = var9.method1344((byte) 72);
                int var11 = var9.method1343(255);
                int var12 = var9.method1348(-96);
                if (!arg0 && var12 == 1) {
                    var6.field860--;
                } else {
                    var6.field864[var7] = var10;
                    var6.field863[var7] = var11;
                    var7++;
                }
            }
            if (arg2 != -5320) {
                method83(-73);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLdc;IIII)Ldc;")
    public final class375 method90(byte arg0, class375 arg1, int arg2, int arg3, int arg4, int arg5) {
        field203++;
        int var7 = this.field176[arg3];
        int var8 = this.field182[arg3];
        class442 var9 = class307.method2093(3, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method1568((byte) 1, arg2, true);
        }
        class442 var11 = null;
        if ((this.field196 || class120.field1676) && arg5 != -1 && arg5 < this.field182.length) {
            int var12 = this.field182[arg5];
            var11 = class307.method2093(3, var12 >> 16);
            arg5 = var12 & 0xFFFF;
        }
        class442 var13 = null;
        class442 var14 = null;
        int var15 = -44 % ((arg0 + 48) / 61);
        int var16 = 0;
        int var17 = 0;
        if (this.field199 != null) {
            if (arg3 < this.field199.length) {
                var16 = this.field199[arg3];
                if (var16 != 65535) {
                    var13 = class307.method2093(3, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
            if ((this.field196 || class120.field1676) && arg5 != -1 && this.field199.length > arg5) {
                var17 = this.field199[arg5];
                if (var17 != 65535) {
                    var14 = class307.method2093(3, var17 >> 16);
                    var17 &= 0xFFFF;
                }
            }
        }
        if (this.field201) {
            arg2 |= 0x200;
        }
        if (var9.method2782((byte) 87, var10)) {
            arg2 |= 0x80;
        }
        if (var9.method2783(var10, (byte) -83)) {
            arg2 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method2782((byte) 87, var16)) {
                arg2 |= 0x80;
            }
            if (var13.method2783(var16, (byte) -83)) {
                arg2 |= 0x100;
            }
        }
        if (var11 != null) {
            if (var11.method2782((byte) 87, arg5)) {
                arg2 |= 0x80;
            }
            if (var11.method2783(arg5, (byte) -83)) {
                arg2 |= 0x100;
            }
        }
        if (var14 != null) {
            if (var14.method2782((byte) 87, var17)) {
                arg2 |= 0x80;
            }
            if (var14.method2783(var17, (byte) -83)) {
                arg2 |= 0x100;
            }
        }
        int var18 = arg2 | 0x20;
        class375 var19 = arg1.method1568((byte) 1, var18, true);
        var19.method2429(var10, var7, var11, arg4 - 1, 2, arg5, 0, var9, this.field201);
        if (var13 != null) {
            var19.method2429(var16, var7, var14, arg4 - 1, 2, var17, 0, var13, this.field201);
        }
        return var19;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIC)C")
    public static final char method91(int arg0, int arg1, char arg2) {
        field189++;
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 == 'Ñ' && arg1 != 0) {
                return 'N';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 == 'ñ' && arg1 != 0) {
                return 'n';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 == 'Œ') {
            return 'O';
        } else if (arg2 == 'œ') {
            return 'o';
        } else {
            if (arg0 != -205) {
                field198 = null;
            }
            if (arg2 == 'Ÿ') {
                return 'Y';
            } else {
                return arg2;
            }
        }
    }
}
