import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class263 extends class162 {

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    private int field4137 = 0;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    private int field4135 = 0;

    @OriginalMember(owner = "client!po", name = "w", descriptor = "I")
    private int field4152 = -32768;

    @OriginalMember(owner = "client!po", name = "u", descriptor = "I")
    private int field4150 = -1;

    @OriginalMember(owner = "client!po", name = "k", descriptor = "I")
    private int field4140 = -1;

    @OriginalMember(owner = "client!po", name = "t", descriptor = "Z")
    private boolean field4149 = false;

    @OriginalMember(owner = "client!po", name = "C", descriptor = "Lfo;")
    private class239 field4158 = null;

    @OriginalMember(owner = "client!po", name = "I", descriptor = "Z")
    private boolean field4164 = true;

    @OriginalMember(owner = "client!po", name = "J", descriptor = "Z")
    private boolean field4165 = false;

    @OriginalMember(owner = "client!po", name = "y", descriptor = "I")
    private int field4154 = 0;

    @OriginalMember(owner = "client!po", name = "l", descriptor = "I")
    private int field4141;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    private int field4145;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "I")
    private int field4146;

    @OriginalMember(owner = "client!po", name = "x", descriptor = "I")
    private int field4153;

    @OriginalMember(owner = "client!po", name = "O", descriptor = "I")
    private int field4170;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "I")
    private int field4143;

    @OriginalMember(owner = "client!po", name = "v", descriptor = "I")
    private int field4151;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "I")
    private int field4139;

    @OriginalMember(owner = "client!po", name = "B", descriptor = "I")
    private int field4157;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "Lsb;")
    private class131 field4144;

    @OriginalMember(owner = "client!po", name = "P", descriptor = "I")
    private int field4171;

    @OriginalMember(owner = "client!po", name = "F", descriptor = "Z")
    public static boolean field4161 = false;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!po", name = "z", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!po", name = "A", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!po", name = "D", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!po", name = "E", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!po", name = "G", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!po", name = "K", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!po", name = "L", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!po", name = "M", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!po", name = "N", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!po", name = "Q", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!po", name = "H", descriptor = "Ldh;")
    private class145 field4163;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(III)V", line = 5)
    private final void method1844(int arg0, int arg1, int arg2) {
        field4142++;
        if (arg0 > -15) {
            this.method1848(-115);
        }
        label95: while (true) {
            if (this.field4144 == null) {
                if (this.field4165) {
                    return;
                }
                this.method1845(-1, -1);
                if (this.field4144 == null) {
                    return;
                }
            }
            int var4 = class58.field875 - this.field4157;
            if (var4 > 100 && this.field4144.field1986 > 0) {
                int var5 = this.field4144.field1988.length - this.field4144.field1986;
                while (this.field4171 < var5 && this.field4144.field2002[this.field4171] < var4) {
                    var4 -= this.field4144.field2002[this.field4171];
                    this.field4171++;
                }
                if (var5 <= this.field4171) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field4144.field1988.length; var7++) {
                        var6 += this.field4144.field2002[var7];
                    }
                    var4 %= var6;
                }
                this.field4151 = this.field4171 + 1;
                if (this.field4144.field1988.length <= this.field4151) {
                    this.field4151 -= this.field4144.field1986;
                    if (this.field4151 < 0 || this.field4151 >= this.field4144.field1988.length) {
                        this.field4151 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field4144.field2002[this.field4171] >= var4) {
                            this.field4157 = class58.field875 - var4;
                            this.field4139 = var4;
                            return;
                        }
                        class276.method1970(this.field4144, false, arg1, 79, arg2, this.field4171);
                        var4 -= this.field4144.field2002[this.field4171];
                        this.field4171++;
                        if (this.field4171 >= this.field4144.field1988.length) {
                            this.field4171 -= this.field4144.field1986;
                            if (this.field4171 < 0 || this.field4144.field1988.length <= this.field4171) {
                                this.field4144 = null;
                                continue label95;
                            }
                        }
                        this.field4151 = this.field4171 + 1;
                    } while (this.field4144.field1988.length > this.field4151);
                    this.field4151 -= this.field4144.field1986;
                } while (this.field4151 >= 0 && this.field4144.field1988.length > this.field4151);
                this.field4151 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II)V", line = 115)
    private final void method1845(int arg0, int arg1) {
        field4148++;
        boolean var3 = false;
        int var4 = arg0;
        if (arg0 == -1) {
            class126 var5 = class165.method1155((byte) 55, this.field4146);
            class126 var6 = var5;
            if (var5.field1949 != null) {
                var5 = var5.method818(-89);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field1883 != null) {
                if (this.field4144 != null && var5.method824(this.field4144.field2013, -26191)) {
                    return;
                }
                var4 = var5.method822(-16207);
                if (this.field4140 != var5.field1924) {
                    var3 = var5.field1889;
                }
            } else if (var5.field1944 == -1) {
                if (var6 != null && var6.field1883 != null) {
                    if (this.field4144 != null && var6.method824(this.field4144.field2013, -26191)) {
                        return;
                    }
                    var4 = var6.method822(-16207);
                    if (this.field4140 != var6.field1924) {
                        var3 = var6.field1889;
                    }
                } else if (var6 != null && var6.field1944 != -1 && this.field4140 != var6.field1924) {
                    var3 = var6.field1889;
                    var4 = var6.field1944;
                }
            } else if (this.field4140 != var5.field1924) {
                var3 = var5.field1889;
                var4 = var5.field1944;
            }
        }
        if (var4 == -1) {
            this.field4144 = null;
            return;
        }
        if (this.field4144 == null || this.field4144.field2013 != var4) {
            this.field4144 = class68.method476((byte) 105, var4);
        } else if (this.field4144.field2004 == 0) {
            return;
        }
        if (var3) {
            this.field4171 = (int) ((double) this.field4144.field1988.length * Math.random());
            this.field4139 = (int) (Math.random() * (double) this.field4144.field2002[this.field4171]) + 1;
        } else {
            this.field4171 = 0;
            this.field4139 = 1;
        }
        this.field4151 = this.field4171 + 1;
        if (~this.field4151 > arg1 || this.field4151 >= this.field4144.field1988.length) {
            this.field4151 = -1;
        }
        this.field4157 = class58.field875 - this.field4139;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lkm;B)V", line = 234)
    private final void method1846(class162 arg0, byte arg1) {
        if (arg1 < 92) {
            method1851(-107, 68, (byte[]) null, -84);
        }
        field4168++;
        if (class245.field3886) {
            class22 var5 = (class22) arg0;
            if ((this.field4163 == null || this.field4163.field2306) && (var5.field287 != null || var5.field282 != null)) {
                class126 var6 = class165.method1155((byte) -105, this.field4146);
                if (var6.field1949 != null) {
                    var6 = var6.method818(-114);
                }
                if (var6 != null) {
                    this.field4163 = new class145(class58.field875, var6.field1880, var6.field1929);
                }
            }
            if (this.field4163 != null) {
                this.field4163.method1037(var5.field287, var5.field282, false, var5.field306, var5.field301, var5.field279);
            }
        } else {
            class67 var3 = (class67) arg0;
            if ((this.field4163 == null || this.field4163.field2306) && (var3.field975 != null || var3.field1002 != null)) {
                class126 var4 = class165.method1155((byte) 58, this.field4146);
                if (var4.field1949 != null) {
                    var4 = var4.method818(-116);
                }
                if (var4 != null) {
                    this.field4163 = new class145(class58.field875, var4.field1880, var4.field1929);
                }
            }
            if (this.field4163 != null) {
                this.field4163.method1037(var3.field975, var3.field1002, false, var3.field973, var3.field969, var3.field990);
            }
        }
        this.field4149 = true;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "()I", line = 291)
    public final int method192() {
        field4167++;
        return this.field4152;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(IIIIIIIZLkm;)V", line = 968)
    public class263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class162 arg8) {
        this.field4141 = arg2;
        this.field4145 = arg4;
        this.field4146 = arg0;
        this.field4153 = arg1;
        this.field4170 = arg5;
        this.field4143 = arg3;
        if (arg8 != null) {
            this.field4165 = true;
            if ((arg8 instanceof class263)) {
                class263 var11 = (class263) arg8;
                if (class245.field3886) {
                    var11.method1847(7955);
                }
                this.field4151 = var11.field4151;
                this.field4139 = var11.field4139;
                this.field4157 = var11.field4157;
                this.field4144 = var11.field4144;
                this.field4171 = var11.field4171;
            } else if (class245.field3886) {
                class126 var10 = class165.method1155((byte) -114, this.field4146);
                if (var10.field1949 != null) {
                    var10 = var10.method818(-106);
                }
                if (var10 != null) {
                    class264.method1858((byte) 75, this.field4170, 0, this.field4153, this.field4143, this.field4145, 0, this.field4141, var10);
                }
            }
        }
        if (this.field4165) {
            this.method1845(arg6, -1);
        }
        if (class245.field3886 && arg8 != null) {
            this.method1849((byte) -61, true);
        }
    }

    @OriginalMember(owner = "client!po", name = "finalize", descriptor = "()V", line = 303)
    protected final void finalize() {
        if (this.field4163 != null) {
            this.field4163.method1021();
        }
        field4138++;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V", line = 319)
    public final void method1847(int arg0) {
        if (arg0 != 7955) {
            return;
        }
        if (this.field4158 != null) {
            class149.method1059(this.field4158, this.field4137, this.field4154, this.field4135);
            this.field4158 = null;
        }
        field4166++;
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)Lkm;", line = 342)
    public final class162 method1848(int arg0) {
        field4159++;
        if (arg0 < 63) {
            this.field4145 = 107;
        }
        return this.method1849((byte) -61, false);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIII)V", line = 362)
    public final void method313(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4162++;
        class162 var6 = null;
        if (class245.field3886) {
            var6 = this.method1849((byte) -61, true);
        } else {
            this.method1844(-94, arg4, arg3);
        }
        if (!this.field4149) {
            if (var6 == null) {
                var6 = this.method1848(114);
            }
            if (var6 == null) {
                return;
            }
            this.method1846(var6, (byte) 127);
        }
        if (this.field4163 != null) {
            this.field4163.method1038(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BZ)Lkm;", line = 395)
    private final class162 method1849(byte arg0, boolean arg1) {
        field4160++;
        boolean var3 = class223.field3444 != class101.field1457;
        class126 var4 = class165.method1155((byte) 25, this.field4146);
        if (var4.field1949 != null) {
            var4 = var4.method818(-80);
        }
        if (var4 == null) {
            if (class245.field3886 && !var3) {
                this.method1847(arg0 ^ 0xFFFFE0D0);
            }
            this.field4140 = -1;
            this.field4150 = this.field4171;
            return null;
        }
        if (!this.field4165 && this.field4140 != var4.field1924) {
            this.method1845(-1, -1);
        }
        int var5 = this.field4141 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field1929;
            var7 = var4.field1880;
        } else {
            var6 = var4.field1880;
            var7 = var4.field1929;
        }
        int var8 = (var6 >> 1) + this.field4145;
        int var9 = this.field4145 + (var6 + 1 >> 1);
        int var10 = this.field4170 + (var7 >> 1);
        int var11 = this.field4170 + (var7 + 1 >> 1);
        if (arg0 != -61) {
            return (class162) null;
        }
        this.method1844(-61, var10 * 128, var8 * 128);
        boolean var12 = !var3 && var4.field1943 && (this.field4140 != var4.field1924 || (this.field4171 != this.field4150 || this.field4144 != null && (this.field4144.field2015 || class241.field3780) && this.field4171 != this.field4151) && class162.field2580 >= 2);
        if (arg1 && !var12) {
            this.field4150 = this.field4171;
            this.field4140 = var4.field1924;
            return null;
        }
        int[][] var13 = class101.field1457[this.field4143];
        int var14 = var13[var9][var10] + var13[var9][var11] + var13[var8][var10] + var13[var8][var11] >> 2;
        int var15 = (this.field4145 << 7) + (var6 << 6);
        int var16 = (this.field4170 << 7) + (var7 << 6);
        int[][] var17 = (int[][]) null;
        if (var3) {
            var17 = class223.field3444[0];
        } else if (this.field4143 < 3) {
            var17 = class101.field1457[this.field4143 + 1];
        }
        if (class245.field3886 && var12) {
            class149.method1059(this.field4158, this.field4137, this.field4154, this.field4135);
        }
        boolean var18 = this.field4158 == null;
        class202 var19;
        if (this.field4144 == null) {
            var19 = var4.method826(var15, false, var14, this.field4141, var12, var18 ? class3.field36 : this.field4158, this.field4153, var16, var13, var17, 26021);
        } else {
            var19 = var4.method823(this.field4151, var13, this.field4153, var18 ? class3.field36 : this.field4158, 1505, this.field4171, this.field4139, var17, this.field4144, var15, var14, var16, this.field4141, var12);
        }
        if (var19 == null) {
            this.field4150 = this.field4171;
            this.field4140 = var4.field1924;
            return null;
        }
        if (class245.field3886 && var12) {
            if (var18) {
                class3.field36 = var19.field3108;
            }
            int var20 = 0;
            if (this.field4143 != 0) {
                int[][] var21 = class101.field1457[0];
                var20 = var14 - (var21[var8][var10] + var21[var9][var10] - (-var21[var8][var11] - var21[var9][var11]) >> 2);
            }
            class239 var22 = var19.field3108;
            if (this.field4164 && class149.method1071(var22, var15, var20, var16)) {
                this.field4164 = false;
            }
            if (!this.field4164) {
                class149.method1061(var22, var15, var20, var16);
                this.field4158 = var22;
                this.field4137 = var15;
                if (var18) {
                    class3.field36 = null;
                }
                this.field4154 = var20;
                this.field4135 = var16;
            }
        }
        this.field4150 = this.field4171;
        this.field4140 = var4.field1924;
        return var19.field3100;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILfh;B)Lnf;", line = 544)
    public static final class275 method1850(int arg0, class313 arg1, byte arg2) {
        field4147++;
        class275 var3 = new class275(arg0, arg1.method2198(-430), arg1.method2198(-430), arg1.method2231((byte) -126), arg1.method2231((byte) -128), arg1.method2224(-120) == 1, arg1.method2224(-127));
        if (arg2 < 122) {
            return (class275) null;
        }
        int var4 = arg1.method2224(-121);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field4537.method1077(16711935, new class196(arg1.method2224(-126), arg1.method2224(-125), arg1.method2250(-1613178296), arg1.method2250(-1613178296), arg1.method2250(-1613178296), arg1.method2250(-1613178296), arg1.method2250(-1613178296), arg1.method2250(-1613178296), arg1.method2250(-1613178296), arg1.method2250(-1613178296)));
        }
        var3.method1967((byte) -59);
        return var3;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II[BI)I", line = 577)
    public static final int method1851(int arg0, int arg1, byte[] arg2, int arg3) {
        field4136++;
        int var4 = arg1;
        for (int var5 = arg3; var5 < arg0; var5++) {
            var4 = class75.field1137[(var4 ^ arg2[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIIIIIJILdh;)V", line = 607)
    public final void method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class145 arg10) {
        field4169++;
        class162 var13 = this.method1848(122);
        if (var13 != null) {
            this.method1846(var13, (byte) 108);
            var13.method180(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4163);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V", line = 628)
    public static final void method1852(byte arg0) {
        class350.field5594 = "Titelbild geöffnet.";
        class119.field1766 = "Lade Liste der Welten";
        class183.field2842 = "Auswählen";
        class214.field3265 = "Bitte entferne ";
        class34.field526 = "blinken2:";
        class132.field2024 = ": ";
        class16.field212 = "gleiten:";
        class138.field2174 = "Spielwelt erstellt.";
        class308.field5021 = "Texturen geladen.";
        class320.field5275 = "leuchten1:";
        class257.field4064 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class60.field907 = "Bitte warte...";
        class219.field3372 = " steht bereits auf deiner Freunde-Liste!";
        class160.field2559 = "lila:";
        class223.field3440 = "gelb:";
        class9.field113 = "rot:";
        class209.field3162 = "T";
        class56.field864 = "Suche nach Updates - ";
        class141.field2276 = "Untersuchen";
        class356.field5641 = "Eingabeprozedur geladen.";
        class221.field3383 = " loggt sich ein.";
        class191.field2959 = "Lade Wordpack - ";
        class293.field4853 = "Lade Standardeinstellungen - ";
        class121.field1802 = "möchte mit dir handeln.";
        class172.field2698 = "Lade...";
        class255.field4045 = "Wordpack geladen.";
        class47.field685 = "Lade Texturen - ";
        class242.field3821 = "Wähl eine Option";
        class5.field63 = "Hierhin drehen";
        class27.field411 = "blinken3:";
        class281.field4624 = "Benutzeroberfläche geladen.";
        class353.field5622 = "Fallen lassen";
        class76.field1142 = "Nehmen";
        class100.field1448 = "Schriftsätze geladen.";
        class161.field2570 = "scrollen:";
        class52.field798 = "welle:";
        class190.field2946 = "Hierhin gehen";
        class146.field2355 = " zuerst von deiner Freunde-Liste!";
        class140.field2266 = "Spieler kann nicht gefunden werden: ";
        class123.field1830 = "T";
        class90.field1305 = "Titelbild geladen.";
        class125.field1863 = "leuchten3:";
        class190.field2955 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class157.field2525 = "Ladevorgang - bitte warte.";
        class138.field2180 = "Stufe: ";
        class250.field3995 = "Verbindung mit Update-Server...";
        class39.field603 = "Sprites geladen.";
        class224.field3498 = " steht bereits auf deiner Ignorieren-Liste!";
        class178.field2778 = "Bitte entferne ";
        class273.field4491 = "Angreifen";
        class326.field5345 = "blaugrün:";
        class178.field2779 = "Lade Titelbild - ";
        class83.field1202 = "Update-Liste geladen.";
        class233.field3711 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class236.field3738 = " loggt sich aus.";
        class183.field2855 = "blinken1:";
        class153.field2478 = "Lade Konfiguration - ";
        class154.field2509 = "Verbindung abgebrochen.";
        class81.field1188 = "Starte 3D-Softwarebibliothek.";
        class161.field2573 = "Liste der Welten geladen";
        class187.field2912 = "Verbindung zum Update-Server hergestellt.";
        class92.field1329 = "weiss:";
        class235.field3733 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class20.field244 = "M";
        class55.field824 = "RuneScape wird geladen - bitte warten...";
        class214.field3275 = "Abbrechen";
        class182.field2834 = "Benutzen";
        class230.field3665 = "Fertigkeit: ";
        class167.field2628 = "schütteln:";
        class102.field1476 = "Speicher wird zugewiesen.";
        field4156++;
        class327.field5351 = "grün:";
        class311.field5062 = "welle2:";
        class99.field1439 = " zuerst von deiner Ignorieren-Liste!";
        class209.field3187 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class352.field5608 = "Kampfstufe: ";
        class41.field631 = "Mechscape wird geladen - bitte warten...";
        if (arg0 != 54) {
            method1850(68, (class313) null, (byte) 62);
        }
        class358.field5674 = "Weiter";
        class167.field2637 = "Standardinstellungen geladen";
        class113.field1660 = "Ablegen";
        class261.field4122 = "Musik-Engine vorbereitet.";
        class281.field4630 = "Okay";
        class31.field477 = "Versteckt";
        class111.field1640 = "Lade Schriftsätze - ";
        class29.field440 = "Lade Benutzeroberfläche - ";
        class34.field521 = "leuchten2:";
        class105.field1523 = "Zugewiesener Speicher.";
        class305.field4994 = "Lade Sprites - ";
        class325.field5332 = "3D-Softwarebibliothek gestartet.";
        class20.field240 = " weitere Optionen";
        class305.field4993 = "Gegenstand für Mitglieder";
        class99.field1435 = "M";
        class74.field1120 = "Konfig geladen.";
        class166.field2621 = "Schließen";
    }
}
