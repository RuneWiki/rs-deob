import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class450 {

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    private int field6553 = 0;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    private int field6560 = -1;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "Lbd;")
    private class37 field6559 = new class37();

    @OriginalMember(owner = "client!f", name = "s", descriptor = "Z")
    public boolean field6566 = false;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    private int field6552;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    private int field6549;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "[[[I")
    private int[][][] field6562;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "[Lwq;")
    private class92[] field6565;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Lhj;")
    public static class338 field6550 = new class338(5000);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZIZZI)V", line = 3)
    public static final void method2798(boolean arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field6557++;
        if (!arg0) {
            class187.method1331(0, arg2, arg4, arg1, !arg0, class28.field323.length - 1, arg3);
            class385.field5819 = null;
            class203.field3276 = 0;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BII)V", line = 16)
    public static final void method2799(byte arg0, int arg1, int arg2) {
        field6555++;
        class256 var3 = new class256(16);
        if (arg0 != 125) {
            field6550 = null;
        }
        for (class9 var4 = (class9) class312.field4924.method1776(true); var4 != null; var4 = (class9) class312.field4924.method1773(-1)) {
            var4.method1120(arg0 - 48);
            int var5 = (int) (var4.field2539 >> 28);
            int var6 = (int) (var4.field2539 >> 14 & 0x3FFFL) - arg2;
            int var7 = (int) (var4.field2539 & 0x3FFFL) - arg1;
            if (var7 >= 0 && var6 >= 0 && class80.field1003 > var7 && var6 < class380.field5751) {
                var3.method1766((long) (var7 | var6 << 14 | var5 << 28), var4, arg0 ^ 0xFFFFFFFD);
            }
        }
        class312.field4924 = var3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIBIII)V", line = 53)
    public static final void method2800(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field6558++;
        class172 var7 = class201.method1393(arg1, arg4, -124);
        if (arg3 != -52) {
            return;
        }
        if (var7 != null && var7.field2825 != null) {
            class150 var8 = new class150();
            var8.field2352 = var7.field2825;
            var8.field2348 = var7;
            class17.method135(var8);
        }
        class379.field5737 = arg5;
        class436.field6419 = arg1;
        class73.field925 = arg4;
        class50.field617 = arg0;
        class248.field4058 = arg2;
        class449.field6546 = true;
        class264.field4251 = arg6;
        class336.method2219((byte) 6, var7);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)[[[I", line = 89)
    public final int[][][] method2801(int arg0) {
        if (arg0 != 14371) {
            method2805(-112);
        }
        field6556++;
        if (this.field6552 != this.field6549) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field6549; var2++) {
            this.field6565[var2] = class112.field1554;
        }
        return this.field6562;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V", line = 110)
    public static final void method2802(int arg0) {
        class190.method1334();
        field6561++;
        int var1 = 0;
        if (arg0 != -5) {
            return;
        }
        while (var1 < 4) {
            class162.field2547[var1].method465(2097152);
            var1++;
        }
        class257.method1780(true);
        class346.method2261(15);
        System.gc();
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)[[I", line = 134)
    public final int[][] method2803(int arg0, boolean arg1) {
        field6554++;
        if (!arg1) {
            this.method2801(44);
        }
        if (this.field6552 == this.field6549) {
            this.field6566 = this.field6565[arg0] == null;
            this.field6565[arg0] = class112.field1554;
            return this.field6562[arg0];
        } else if (this.field6549 == 1) {
            this.field6566 = this.field6560 != arg0;
            this.field6560 = arg0;
            return this.field6562[0];
        } else {
            class92 var3 = this.field6565[arg0];
            if (var3 == null) {
                this.field6566 = true;
                if (this.field6549 > this.field6553) {
                    var3 = new class92(arg0, this.field6553);
                    this.field6553++;
                } else {
                    class92 var4 = (class92) this.field6559.method257(-99);
                    var3 = new class92(arg0, var4.field1135);
                    this.field6565[var4.field1137] = null;
                    var4.method1120(75);
                }
                this.field6565[arg0] = var3;
            } else {
                this.field6566 = false;
            }
            this.field6559.method250(var3, 43);
            return this.field6562[var3.field1135];
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIZ)V", line = 201)
    public static final void method2804(int arg0, int arg1, boolean arg2) {
        class196.field3184 = arg1 - class400.field5974;
        class80.field1002 = arg0 - class400.field5973;
        if (!arg2) {
            method2806(-71, 96, -115, (class312) null, (class172) null, 14, 119, (class245) null, -27);
        }
        field6551++;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V", line = 215)
    public static void method2805(int arg0) {
        field6550 = null;
        if (arg0 <= 10) {
            field6550 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIILe;Lne;IILq;I)V", line = 226)
    public static final void method2806(int arg0, int arg1, int arg2, class312 arg3, class172 arg4, int arg5, int arg6, class245 arg7, int arg8) {
        if (arg2 > -105) {
            return;
        }
        field6564++;
        class324 var9 = class288.method1944(36, arg8);
        if (var9 == null || !var9.field5074 || !var9.method2144((byte) -82)) {
            return;
        }
        if (var9.field5088 != null) {
            int[] var10 = new int[var9.field5088.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var13;
                if (class13.field194 == 4) {
                    var13 = (int) class329.field5153 & 0x3FFF;
                } else {
                    var13 = (int) class329.field5153 + class52.field650 & 0x3FFF;
                }
                int var14 = class258.field4177[var13];
                int var15 = class258.field4173[var13];
                if (class13.field194 != 4) {
                    var15 = var15 * 256 / (class367.field5561 + 256);
                    var14 = var14 * 256 / (class367.field5561 + 256);
                }
                var10[var11 * 2] = ((var9.field5088[var11 * 2] * 4 + arg0) * var15 + (var9.field5088[var11 * 2 + 1] * 4 + arg5) * var14 >> 15) + arg4.field2705 / 2 + arg1;
                var10[var11 * 2 + 1] = arg4.field2834 / 2 + arg6 - ((var9.field5088[var11 * 2 + 1] * 4 + arg5) * var15 + -((var9.field5088[var11 * 2] * 4 + arg0) * var14) >> 15);
            }
            class251.method1743(arg3, var10, var9.field5087, arg4.field2700, arg4.field2713);
            for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                arg3.method602(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[var12 * 2 + 3], var9.field5064, 1, arg7, arg1, arg6);
            }
            arg3.method602(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field5064, 1, arg7, arg1, arg6);
        }
        class356 var16 = null;
        if (var9.field5071 != -1) {
            var16 = var9.method2149((byte) 107, arg3, false);
            if (var16 != null) {
                class258.method1787((byte) -110, arg6, arg0, arg1, arg7, arg4, var16, arg5);
            }
        }
        if (var9.field5070 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method2325();
        }
        class452 var18 = class292.field4680;
        class325 var19 = class13.field185;
        if (var9.field5083 == 1) {
            var18 = class435.field6411;
            var19 = class31.field383;
        }
        if (var9.field5083 == 2) {
            var19 = class413.field6111;
            var18 = class11.field133;
        }
        class36.method235(arg4, arg1, arg0, arg5, var9.field5070, var17, arg6, false, arg7, var19, var9.field5061, var18);
        return;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(III)V", line = 647)
    public class450(int arg0, int arg1, int arg2) {
        this.field6552 = arg1;
        this.field6549 = arg0;
        this.field6562 = new int[this.field6549][3][arg2];
        this.field6565 = new class92[this.field6552];
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V", line = 332)
    public static final void method2807(int arg0) {
        class345.field5308 = "Verbindung zum Update-Server hergestellt.";
        class42.field523 = " zuerst von deiner Ignorieren-Liste!";
        class374.field5646 = "Standardeinstellungen geladen";
        class330.field5168 = "Ladevorgang - bitte warte.";
        class343.field5291 = "Wähl eine Option";
        class255.field4131 = "Spieler kann nicht gefunden werden: ";
        class286.field4596 = "Hierhin drehen";
        class190.field3101 = "blinken1:";
        class343.field5292 = "Spielwelt erstellt.";
        class199.field3206 = " loggt sich aus.";
        class19.field246 = "Schriftsätze geladen.";
        class112.field1551 = "Bitte entferne ";
        class193.field3138 = "Weiter";
        class54.field674 = "lila:";
        class111.field1544 = "gelb:";
        class413.field6108 = "Starte 3D-Softwarebibliothek.";
        class156.field2468 = "weiss:";
        class3.field76 = "Lade Texturen - ";
        class141.field2186 = " steht bereits auf deiner Freunde-Liste!";
        class125.field1923 = "Abbrechen";
        class422.field6234 = "Fallen lassen";
        class264.field4253 = "blinken2:";
        class232.field3859 = "Lade Wordpack - ";
        class19.field244 = "Benutzeroberfläche geladen.";
        class272.field4374 = "Lade Titelbild - ";
        class433.field6395 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class235.field3941 = "Kampfstufe: ";
        class12.field169 = "Ablegen";
        class412.field6098 = "Nehmen";
        if (arg0 != -1) {
            field6550 = null;
        }
        class241.field4000 = " loggt sich ein.";
        class58.field749 = "M";
        class412.field6104 = "Auswählen";
        class290.field4635 = "Eingabeprozedur geladen.";
        class362.field5527 = "Liste der Welten geladen";
        class362.field5530 = "Zugewiesener Speicher.";
        class409.field6059 = "leuchten2:";
        class394.field5903 = "leuchten3:";
        class343.field5293 = "welle:";
        class211.field3381 = "Lade...";
        class222.field3690 = "Lade Konfiguration - ";
        class318.field4986 = "Benutzen";
        class388.field5854 = "Lade Sprites - ";
        class238.field3969 = "grün:";
        class430.field6332 = "Gegenstand für Mitglieder";
        class52.field653 = "T";
        class163.field2555 = "blinken3:";
        class84.field1042 = "Sprites geladen.";
        class217.field3553 = "Okay";
        class163.field2554 = "Wordpack geladen.";
        class269.field4319 = "Lade Schriftsätze - ";
        class441.field6462 = "Titelbild geladen.";
        class75.field951 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class351.field5418 = "Schließen";
        class60.field771 = "Stufe: ";
        class226.field3800 = "Lade Benutzeroberfläche - ";
        class250.field4093 = "Konfig geladen.";
        class173.field2891 = "schütteln:";
        class354.field5450 = "Angreifen";
        class155.field2433 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class72.field895 = "Verbindung abgebrochen.";
        class213.field3420 = "leuchten1:";
        field6548++;
        class249.field4074 = "scrollen:";
        class52.field654 = "welle2:";
        class316.field4962 = "Titelbild geöffnet.";
        class38.field491 = "M";
        class272.field4375 = "Verbindung mit Update-Server...";
        class372.field5623 = "Bitte entferne ";
        class130.field2048 = "Suche nach Updates - ";
        class261.field4198 = "Versteckt";
        class271.field4343 = "Lade Liste der Welten";
        class263.field4231 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class252.field4102 = "Untersuchen";
        class272.field4378 = " zuerst von deiner Freunde-Liste!";
        class121.field1718 = "Bitte warte...";
        class104.field1463 = "Musik-Engine vorbereitet.";
        class70.field871 = "blaugrün:";
        class321.field5023 = " steht bereits auf deiner Ignorieren-Liste!";
        class108.field1515 = "Fertigkeit: ";
        class158.field2521 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class64.field839 = "Update-Liste geladen.";
        class277.field4418 = "Hierhin gehen";
        class271.field4344 = "Lade Standardeinstellungen - ";
        class117.field1627 = "gleiten:";
        class208.field3329 = "T";
        class368.field5588 = "Speicher wird zugewiesen.";
        class225.field3741 = " weitere Optionen";
        class30.field369 = "Client-Variablen geladen";
        class429.field6319 = "Texturen geladen.";
        class361.field5507 = "3D-Softwarebibliothek gestartet.";
        class77.field959 = ": ";
        class261.field4197 = "RuneScape wird geladen - bitte warten...";
        class263.field4249 = "Mechscape wird geladen - bitte warten...";
        class56.field697 = "rot:";
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V", line = 605)
    public final void method2808(int arg0) {
        field6563++;
        for (int var2 = 0; var2 < this.field6549; var2++) {
            this.field6562[var2][0] = null;
            this.field6562[var2][1] = null;
            this.field6562[var2][2] = null;
            this.field6562[var2] = null;
        }
        this.field6565 = null;
        if (arg0 != 13350) {
            method2802(-67);
        }
        this.field6562 = null;
        this.field6559.method255(-20994);
        this.field6559 = null;
    }
}
