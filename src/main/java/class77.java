import java.awt.Image;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class77 extends class276 {

    @OriginalMember(owner = "client!el", name = "S", descriptor = "I")
    private int field1250 = 0;

    @OriginalMember(owner = "client!el", name = "X", descriptor = "I")
    private int field1255 = 81;

    @OriginalMember(owner = "client!el", name = "gb", descriptor = "I")
    private int field1264 = 1024;

    @OriginalMember(owner = "client!el", name = "hb", descriptor = "I")
    private int field1265 = 4;

    @OriginalMember(owner = "client!el", name = "ib", descriptor = "I")
    private int field1266 = 204;

    @OriginalMember(owner = "client!el", name = "db", descriptor = "I")
    private int field1261 = 8;

    @OriginalMember(owner = "client!el", name = "lb", descriptor = "I")
    private int field1269 = 1024;

    @OriginalMember(owner = "client!el", name = "mb", descriptor = "I")
    private int field1270 = 409;

    @OriginalMember(owner = "client!el", name = "N", descriptor = "I")
    public static int field1245 = 0;

    @OriginalMember(owner = "client!el", name = "ab", descriptor = "[C")
    public static char[] field1258 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!el", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field1263 = "Loaded wordpack";

    @OriginalMember(owner = "client!el", name = "M", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!el", name = "O", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!el", name = "P", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!el", name = "Q", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!el", name = "R", descriptor = "I")
    private int field1249;

    @OriginalMember(owner = "client!el", name = "T", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!el", name = "U", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!el", name = "Y", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client!el", name = "Z", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!el", name = "bb", descriptor = "I")
    private int field1259;

    @OriginalMember(owner = "client!el", name = "jb", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!el", name = "kb", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!el", name = "V", descriptor = "Ljava/awt/Image;")
    public static Image field1253;

    @OriginalMember(owner = "client!el", name = "eb", descriptor = "[I")
    private int[] field1262;

    @OriginalMember(owner = "client!el", name = "W", descriptor = "[[I")
    private int[][] field1254;

    @OriginalMember(owner = "client!el", name = "cb", descriptor = "[[I")
    private int[][] field1260;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "(I)V")
    private final void method467(int arg0) {
        ++field1267;
        Random var2 = new Random((long) this.field1261);
        this.field1249 = this.field1255 / 2;
        this.field1254 = new int[this.field1261][this.field1265 + 1];
        this.field1256 = arg0 / this.field1265;
        int var3 = this.field1256 / 2;
        this.field1259 = 4096 / this.field1261;
        this.field1262 = new int[this.field1261 + 1];
        this.field1262[0] = 0;
        this.field1260 = new int[this.field1261][this.field1265];
        int var4 = this.field1259 / 2;
        for (int var5 = 0; ~this.field1261 < ~var5; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field1259;
                int var7 = (-2048 + class37.method246(4096, (byte) -59, var2)) * this.field1266 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field1262[var5] = this.field1262[var5 + -1] + var8;
            }
            this.field1254[var5][0] = 0;
            for (int var9 = 0; ~this.field1265 < ~var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field1256;
                    int var11 = (-2048 + class37.method246(4096, (byte) -59, var2)) * this.field1270 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field1254[var5][var9] = this.field1254[var5][var9 + -1] + var12;
                }
                this.field1260[var5][var9] = this.field1269 > 0 ? -class37.method246(this.field1269, (byte) -59, var2) + 4096 : 4096;
            }
            this.field1254[var5][this.field1265] = 4096;
        }
        this.field1262[this.field1261] = 4096;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
    public static void method468(boolean arg0) {
        field1258 = null;
        if (!arg0) {
            field1253 = null;
            field1263 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([Lta;ZIB[BIII)[I")
    public static final int[] method469(class189[] arg0, boolean arg1, int arg2, byte arg3, byte[] arg4, int arg5, int arg6, int arg7) {
        if (arg3 != -58) {
            method470(-87, 13);
        }
        ++field1268;
        if (!arg1) {
            for (int var8 = 0; ~var8 > -5; ++var8) {
                for (int var9 = 0; var9 < 64; ++var9) {
                    for (int var10 = 0; var10 < 64; ++var10) {
                        if (arg5 + var9 > 0 && arg5 - -var9 < 103 && arg2 + var10 > 0 && ~(arg2 + var10) > -104) {
                            arg0[var8].field3061[arg5 + var9][arg2 + var10] = class113.method791(arg0[var8].field3061[arg5 + var9][arg2 + var10], -2097153);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg1) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class101 var12 = new class101(arg4);
        int var13 = arg6 - -arg5;
        int var14 = arg2 + arg7;
        for (int var15 = 0; ~var11 < ~var15; ++var15) {
            for (int var39 = 0; var39 < 64; ++var39) {
                for (int var40 = 0; ~var40 > -65; ++var40) {
                    class163.method1100(var14 - -var40, 0, var13 - -var39, arg2 + var40, arg5 + var39, arg1, false, arg3 + -866, var12, var15);
                }
            }
        }
        boolean var16 = false;
        boolean var17 = false;
        while (var12.field1730.length > var12.field1762) {
            int var18 = var12.method669((byte) 36);
            if (var18 == 128) {
                class296.field4700[0] = var12.method677(false);
                class296.field4700[1] = var12.method686(-3);
                var16 = true;
                class296.field4700[2] = var12.method686(-3);
                class296.field4700[3] = var12.method686(class52.method329(arg3, 59));
                class296.field4700[4] = var12.method677(false);
            } else {
                if (~var18 != -130) {
                    --var12.field1762;
                    break;
                }
                for (int var19 = 0; var19 < 4; ++var19) {
                    byte var20 = var12.method646(97);
                    if (~var20 == -1) {
                        int var21 = arg5;
                        if (~arg5 > -1) {
                            var21 = 0;
                        } else if (arg5 >= 104) {
                            var21 = 104;
                        }
                        int var22 = arg5 + 64;
                        if (~var22 > -1) {
                            var22 = 0;
                        } else if (~var22 <= -105) {
                            var22 = 104;
                        }
                        int var23 = arg2;
                        int var24 = arg2 + 64;
                        if (~arg2 <= -1) {
                            if (arg2 >= 104) {
                                var23 = 104;
                            }
                        } else {
                            var23 = 0;
                        }
                        if (~var24 > -1) {
                            var24 = 0;
                        } else if (~var24 <= -105) {
                            var24 = 104;
                        }
                        while (var22 > var21) {
                            while (var24 > var23) {
                                class99.field1700[var19][var21][var23] = 0;
                                ++var23;
                            }
                            ++var21;
                        }
                    } else if (var20 != 1) {
                        if (~var20 == -3 && var19 > 0) {
                            int var25 = arg5;
                            if (~arg5 <= -1) {
                                if (~arg5 <= -105) {
                                    var25 = 104;
                                }
                            } else {
                                var25 = 0;
                            }
                            int var26 = arg5 + 64;
                            if (var26 >= 0) {
                                if (~var26 <= -105) {
                                    var26 = 104;
                                }
                            } else {
                                var26 = 0;
                            }
                            int var27 = arg2;
                            if (arg2 < 0) {
                                var27 = 0;
                            } else if (arg2 >= 104) {
                                var27 = 104;
                            }
                            int var28 = arg2 + 64;
                            if (var28 >= 0) {
                                if (var28 >= 104) {
                                    var28 = 104;
                                }
                            } else {
                                var28 = 0;
                            }
                            while (~var26 < ~var25) {
                                while (var27 < var28) {
                                    class99.field1700[var19][var25][var27] = class99.field1700[var19 + -1][var25][var27];
                                    ++var27;
                                }
                                ++var25;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~var29 > -65; var29 += 4) {
                            for (int var30 = 0; var30 < 64; var30 += 4) {
                                byte var31 = var12.method646(79);
                                for (int var32 = arg5 + var29; var29 + 4 + arg5 > var32; ++var32) {
                                    for (int var33 = arg2 + var30; arg2 + var30 - -4 > var33; ++var33) {
                                        if (var32 >= 0 && ~var32 > -105 && ~var33 <= -1 && ~var33 > -105) {
                                            class99.field1700[var19][var32][var33] = var31;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var17 = true;
            }
        }
        if (!var17) {
            for (int var34 = 0; var34 < 4; ++var34) {
                for (int var35 = 0; var35 < 16; ++var35) {
                    for (int var36 = 0; var36 < 16; ++var36) {
                        int var37 = (arg5 >> 2) - -var35;
                        int var38 = (arg2 >> 2) - -var36;
                        if (var37 >= 0 && ~var37 > -27 && var38 >= 0 && ~var38 > -27) {
                            class99.field1700[var34][var37][var38] = 0;
                        }
                    }
                }
            }
        }
        if (var16) {
            return class296.field4700;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            int var4 = 0;
            int var5;
            for (var5 = class206.field3389[arg1] - -this.field1250; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field1261 && var5 >= this.field1262[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(var4 & 1) == -1;
            int var8 = this.field1262[var4];
            int var9 = this.field1262[var4 + -1];
            if (~(this.field1249 + var9) > ~var5 && ~(-this.field1249 + var8) < ~var5) {
                for (int var10 = 0; ~class53.field929 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field1264 : -this.field1264;
                    int var13;
                    for (var13 = class175.field2883[var10] - -(this.field1256 * var12 >> 12); ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field1265 && this.field1254[var6][var11] <= var13) {
                        ++var11;
                    }
                    int var14 = this.field1254[var6][var11];
                    int var15 = var11 + -1;
                    int var16 = this.field1254[var6][var15];
                    if (var13 > this.field1249 + var16 && -this.field1249 + var14 > var13) {
                        var3[var10] = this.field1260[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class235.method1560(var3, 0, class53.field929, 0);
            }
        }
        ++field1252;
        return arg0 <= 39 ? null : var3;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (~arg0 == -8) {
                                        this.field1269 = arg1.method677(false);
                                    }
                                } else {
                                    this.field1255 = arg1.method677(false);
                                }
                            } else {
                                this.field1250 = arg1.method677(false);
                            }
                        } else {
                            this.field1264 = arg1.method677(false);
                        }
                    } else {
                        this.field1266 = arg1.method677(false);
                    }
                } else {
                    this.field1270 = arg1.method677(false);
                }
            } else {
                this.field1261 = arg1.method669((byte) 36);
            }
        } else {
            this.field1265 = arg1.method669((byte) 36);
        }
        if (arg2 != -1) {
            this.field1249 = 91;
        }
        ++field1246;
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(II)V")
    public static final void method470(int arg0, int arg1) {
        ++field1244;
        class55 var2 = class62.method395(3, arg0, (byte) -66);
        var2.method341((byte) 62);
        if (arg1 != 0) {
            field1258 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "h", descriptor = "(I)V")
    public static final void method471(int arg0) {
        class286.field4517 = "Kampfstufe: ";
        class142.field2440 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class92.field1618 = "Benutzeroberfläche geladen.";
        class273.field4382 = "blaugrün:";
        class189.field3070 = "Verbindung abgebrochen.";
        class240.field3949 = "Wähl eine Option";
        class1.field4 = "welle2:";
        class108.field1938 = "Lade Schriftsätze - ";
        class261.field4257 = "Ladevorgang - bitte warte.";
        class91.field1611 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class183.field2980 = "Update-Liste geladen.";
        class261.field4259 = "Titelbild geladen.";
        class152.field2537 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class219.field3678 = "möchte mit dir handeln.";
        class215.field3631 = "Bitte warte...";
        class239.field3938 = "Stufe: ";
        class229.field3864 = "leuchten2:";
        class105.field1862 = "RuneScape wird geladen - bitte warten...";
        class25.field388 = "schütteln:";
        class165.field2709 = "Schließen";
        class11.field157 = " zuerst von deiner Freunde-Liste!";
        class93.field1637 = "Standardinstellungen geladen";
        class41.field613 = " loggt sich ein.";
        class191.field3085 = "Lade Liste der Welten";
        class79.field1361 = "Spieler kann nicht gefunden werden: ";
        class69.field1138 = "Versteckt";
        class290.field4637 = "Schriftsätze geladen.";
        class37.field527 = "Zugewiesener Speicher.";
        class211.field3560 = "Angreifen";
        class239.field3935 = "Abbrechen";
        class121.field2141 = " steht bereits auf deiner Freunde-Liste!";
        class139.field2394 = "Eingabeprozedur geladen.";
        class286.field4528 = "Konfig geladen.";
        class92.field1617 = "scrollen:";
        class161.field2683 = "Lade Sprites - ";
        class73.field1207 = "Okay";
        class3.field31 = "Sprites geladen.";
        class81.field1468 = "Fertigkeit: ";
        class228.field3839 = "Weiter";
        class176.field2897 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class176.field2894 = "T";
        class141.field2429 = " zuerst von deiner Ignorieren-Liste!";
        class296.field4701 = "Hierhin drehen";
        class52.field918 = "Spielwelt erstellt.";
        class154.field2578 = "Verbindung mit Update-Server...";
        class74.field1228 = "Lade Titelbild - ";
        class161.field2679 = " loggt sich aus.";
        class211.field3562 = "Liste der Welten geladen";
        class58.field1022 = "Musik-Engine vorbereitet.";
        class98.field1695 = "rot:";
        class239.field3920 = "Fallen lassen";
        class29.field429 = "leuchten3:";
        class96.field1655 = "Nehmen";
        class134.field2324 = "Lade Wordpack - ";
        class215.field3627 = "weiss:";
        class62.field1086 = " steht bereits auf deiner Ignorieren-Liste!";
        class31.field459 = "grün:";
        class201.field3308 = "gelb:";
        class145.field2482 = "M";
        class248.field4063 = "Speicher wird zugewiesen.";
        class55.field962 = "Hierhin gehen";
        class272.field4371 = "Verbindung zum Update-Server hergestellt.";
        class62.field1085 = "M";
        class109.field1981 = "Lade Texturen - ";
        class293.field4672 = "blinken2:";
        class189.field3057 = "blinken1:";
        class286.field4521 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class45.field631 = "Benutzen";
        class154.field2584 = "Lade...";
        client.field4535 = "Texturen geladen.";
        class60.field1049 = "Gegenstand für Mitglieder";
        class58.field1012 = "lila:";
        class42.field618 = ": ";
        class294.field4687 = "Auswählen";
        class245.field4029 = "Titelbild geöffnet.";
        class125.field2190 = "blinken3:";
        class67.field1121 = "leuchten1:";
        class205.field3355 = "Lade Konfiguration - ";
        class212.field3580 = "Suche nach Updates - ";
        class160.field2669 = "3D-Softwarebibliothek gestartet.";
        class295.field4692 = "Bitte entferne ";
        class220.field3687 = "welle:";
        class274.field4391 = "T";
        class215.field3626 = "Lade Standardeinstellungen - ";
        class134.field2323 = " weitere Optionen";
        field1263 = "Wordpack geladen.";
        if (arg0 <= 25) {
            method471(113);
        }
        class199.field3280 = "Lade Benutzeroberfläche - ";
        class21.field332 = "gleiten:";
        class30.field453 = "Starte 3D-Softwarebibliothek.";
        class277.field4436 = "Untersuchen";
        class266.field4305 = "Bitte entferne ";
        class102.field1791 = "Ablegen";
        ++field1257;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IZLvh;Lvh;)V")
    public static final void method472(int arg0, boolean arg1, class108 arg2, class108 arg3) {
        ++field1247;
        class280.field4461 = arg1;
        if (arg0 == 104) {
            class45.field636 = arg2;
            class245.field4028 = arg3;
        }
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(I)V")
    public final void method22(int arg0) {
        this.method467(4096);
        ++field1248;
        if (arg0 <= 66) {
            this.method21(-55, (class101) null, (byte) 60);
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
    public class77() {
        super(0, true);
    }
}
