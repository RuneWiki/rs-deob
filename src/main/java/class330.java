import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class330 extends class221 {

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "Ljava/lang/Object;")
    private Object field4476 = new Object();

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "[Llb;")
    private class210[] field4495 = new class210[0];

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "I")
    private int field4496 = 0;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "I")
    private int field4497 = 0;

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
    public static int field4498 = 0;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)V")
    private final void method2096(int arg0, int arg1) {
        if (arg1 != 32) {
            this.field4495 = null;
        }
        ++field4480;
        super.field3046[super.field3050] = (byte) arg0;
        ++super.field3050;
        if (super.field3050 >= 5000) {
            super.field3050 = 0;
        }
        ++super.field3057;
        ++super.field3049;
        if (~this.field4496 < -1) {
            Object var3 = this.field4476;
            synchronized (this.field4476) {
                this.field4476.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ldg;I)V")
    public final void method1025(class224 arg0, int arg1) {
        Object var3 = this.field4476;
        synchronized (this.field4476) {
            --super.field3056;
            if (super.field3056 < 0) {
                super.field3056 = 4999;
            }
            super.field3046[super.field3056] = 21;
            super.field3053[super.field3056] = arg0;
            ++super.field3049;
            ++super.field3057;
            if (~this.field4496 < arg1) {
                this.field4476.notifyAll();
            }
        }
        ++field4485;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)V")
    private final void method2097(int arg0, int arg1) {
        ++field4483;
        super.field3046[super.field3050] = (byte) (arg1 + 10);
        ++super.field3050;
        if (~super.field3050 <= -5001) {
            super.field3050 = 0;
        }
        ++super.field3049;
        ++super.field3057;
        if (this.field4496 > arg0) {
            Object var3 = this.field4476;
            synchronized (this.field4476) {
                this.field4476.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
    public static final void method2098(byte arg0) {
        class421.field5900 = "Eingabeprozedur geladen.";
        class278.field3745 = "M";
        class134.field1907 = "Konfig geladen.";
        class5.field38 = "Kampfstufe: ";
        class273.field3665 = ": ";
        class184.field2679 = "Lade Texturen - ";
        class71.field1073 = "Benutzeroberfläche geladen.";
        class128.field1825 = "Texturen geladen.";
        class233.field3206 = "Spieler kann nicht gefunden werden: ";
        class356.field4839 = "Mechscape wird geladen - bitte warten...";
        class412.field5762 = "welle2:";
        class243.field3354 = "Update-Liste geladen.";
        class243.field3361 = "rot:";
        class417.field5858 = " zuerst von deiner Freunde-Liste!";
        class295.field3986 = "Lade Konfiguration - ";
        class185.field2692 = "blinken1:";
        class235.field3254 = " zuerst von deiner Ignorieren-Liste!";
        class63.field965 = "M";
        class94.field1366 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class375.field5279 = "Auswählen";
        class275.field3696 = "gleiten:";
        class134.field1909 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class386.field5441 = "Lade Wordpack - ";
        class435.field6201 = "Nehmen";
        class443.field6392 = " loggt sich aus.";
        class381.field5342 = "Wordpack geladen.";
        class391.field5481 = "Schließen";
        class410.field5731 = "Lade Sprites - ";
        class198.field2815 = "gelb:";
        class155.field2347 = "lila:";
        class66.field996 = "Versteckt";
        class97.field1399 = "Standardeinstellungen geladen";
        class391.field5483 = "Hierhin drehen";
        class290.field3943 = "Lade Liste der Welten";
        class213.field2949 = "Suche nach Updates - ";
        class148.field2266 = "Wähl eine Option";
        class127.field1797 = "Gegenstand für Mitglieder";
        class398.field5577 = "blinken2:";
        class288.field3857 = "blinken3:";
        class328.field4458 = "Benutzen";
        if (arg0 <= -110) {
            class382.field5356 = "Bitte warte...";
            class97.field1404 = "Spielwelt erstellt.";
            class435.field6204 = "Ablegen";
            class255.field3459 = "Fertigkeit: ";
            class422.field5908 = " steht bereits auf deiner Freunde-Liste!";
            class199.field2839 = "Abbrechen";
            class155.field2355 = "3D-Softwarebibliothek gestartet.";
            class244.field3369 = "Lade...";
            class263.field3538 = "Speicher wird zugewiesen.";
            class126.field1763 = "Lade Schriftsätze - ";
            ++field4493;
            class335.field4538 = "leuchten3:";
            class423.field5921 = "Titelbild geöffnet.";
            class340.field4651 = "T";
            class288.field3863 = "welle:";
            class224.field3100 = " weitere Optionen";
            class293.field3964 = "Schriftsätze geladen.";
            class73.field1098 = "Stufe: ";
            class105.field1551 = "leuchten2:";
            class387.field5447 = "Sprites geladen.";
            class423.field5919 = " loggt sich ein.";
            class149.field2290 = "Angreifen";
            class127.field1796 = "Okay";
            class186.field2698 = "Titelbild geladen.";
            class128.field1817 = "Liste der Welten geladen";
            class448.field6493 = "weiss:";
            class336.field4556 = "Bitte entferne ";
            class441.field6339 = "Lade Standardeinstellungen - ";
            class338.field4607 = "Ladevorgang - bitte warte.";
            class223.field3097 = "RuneScape wird geladen - bitte warten...";
            class293.field3963 = "Musik-Engine vorbereitet.";
            class412.field5761 = "Lade Titelbild - ";
            class126.field1772 = "scrollen:";
            class24.field426 = "Starte 3D-Softwarebibliothek.";
            class241.field3333 = "Untersuchen";
            class3.field20 = "Verbindung abgebrochen.";
            class361.field4909 = "Client-Variablen geladen";
            class68.field1025 = "Lade Benutzeroberfläche - ";
            class345.field4681 = "blaugrün:";
            class149.field2287 = "schütteln:";
            class424.field5945 = "Fallen lassen";
            class283.field3786 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
            class84.field1226 = "Weiter";
            class266.field3578 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
            class362.field4921 = "T";
            class63.field967 = " steht bereits auf deiner Ignorieren-Liste!";
            class284.field3806 = "Verbindung mit Update-Server...";
            class365.field5035 = "Hierhin gehen";
            class165.field2444 = "Verbindung zum Update-Server hergestellt.";
            class233.field3204 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
            class14.field105 = "leuchten1:";
            class415.field5811 = "grün:";
            class296.field3987 = "Bitte entferne ";
            class301.field4048 = "Zugewiesener Speicher.";
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLdg;)V")
    public final void method1021(byte arg0, class224 arg1) {
        if (arg0 > 63) {
            Object var3 = this.field4476;
            synchronized (this.field4476) {
                super.field3046[super.field3050] = 20;
                super.field3053[super.field3050] = arg1;
                ++super.field3050;
                if (super.field3050 >= 5000) {
                    super.field3050 = 0;
                }
                ++super.field3049;
                ++super.field3057;
                if (~this.field4496 < -1) {
                    this.field4476.notifyAll();
                }
            }
            ++field4479;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)I")
    public static final int method2099(int arg0, int arg1, int arg2) {
        ++field4484;
        return arg0 != arg1 && ~arg0 != -4 ? class43.field644[arg2 & 3] : class365.field5038[arg2 & 3];
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILlb;)V")
    public final void method2100(int arg0, class210 arg1) {
        ++field4482;
        boolean var3 = false;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field4476;
            byte var7;
            synchronized (this.field4476) {
                while (~super.field3049 == -1) {
                    ++this.field4496;
                    this.field4476.wait();
                    --this.field4496;
                }
                var7 = super.field3046[super.field3056];
                if (arg1.field2925 < 0) {
                    if (~var7 <= -1 && ~var7 >= -4) {
                        var3 = true;
                    }
                } else if (~var7 > -1 || ~var7 < -4) {
                    var3 = true;
                }
                if (var3) {
                    arg1.field5468 = super.field3053[super.field3056];
                    var5 = super.field3048[super.field3056];
                    super.field3053[super.field3056] = null;
                    ++super.field3056;
                    --super.field3049;
                    if (~super.field3056 <= -5001) {
                        super.field3056 = 0;
                    }
                }
            }
            if (!var3) {
                Thread.yield();
            } else if (arg1.field2925 >= 0) {
                if (var7 == 21) {
                    class450.method2797(arg1, (class224) arg1.field5468);
                } else if (~var7 == -21) {
                    class224 var8 = (class224) arg1.field5468;
                    if (var8.field3108 != null) {
                        var8.field3108.method581(arg0 + 1847, class91.field1347);
                    }
                    if (var8.field3125 != null) {
                        var8.field3125.method581(0, class91.field1347);
                    }
                    if (var8.field3121 != null) {
                        var8.field3121.method581(0, class91.field1347);
                    }
                    if (var8.field3116 != null) {
                        var8.field3116.method581(0, class91.field1347);
                    }
                    if (var8.field3124 != null) {
                        var8.field3124.method581(0, class91.field1347);
                    }
                    for (class26 var9 = var8.field3129; var9 != null; var9 = var9.field463) {
                        var9.field460.method581(0, class91.field1347);
                    }
                } else if (var7 >= 30 && var7 <= 33) {
                    class91.field1347.method108(3000.0F, var5 * 1.5F);
                    ((class411) arg1.field5468).method1510(class134.field1914, class31.field516, class303.field4107, class227.field3147, ~(var7 + -30) == -1);
                } else if (var7 >= 40 && var7 <= 43) {
                    class91.field1347.method108(3000.0F, var5 * 1.5F);
                    ((class411) arg1.field5468).method1510(class134.field1914, class31.field516, class303.field4107, class400.field5594, var7 + -40 == 0);
                } else if (~var7 == -23) {
                    class91.field1347.method137(-1, 1583160, 40);
                } else if (~var7 == -24) {
                    class91.field1347.method148();
                } else if (var7 != 24) {
                    if (~var7 <= -11 && ~var7 >= -14) {
                        class91.field1347.method92(arg1.field2925);
                        arg1.field2925 = -1;
                    }
                } else {
                    class91.field1347.method141(0, (class269[]) null);
                }
            } else if (var7 >= 0 && ~var7 >= -4) {
                arg1.field2925 = var7;
                class91.field1347.method210(var7);
            }
            if (arg0 != -1847) {
                this.field4476 = null;
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field4476;
                synchronized (this.field4476) {
                    --super.field3057;
                    if (super.field3057 == 0) {
                        this.field4476.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILvj;IILjava/lang/String;ILhq;IILbi;ILvm;)V")
    public static final void method2101(int arg0, class179 arg1, int arg2, int arg3, String arg4, int arg5, class175 arg6, int arg7, int arg8, class139 arg9, int arg10, class323 arg11) {
        int var12 = 38 % ((arg7 - 64) / 46);
        ++field4494;
        int var13;
        if (class184.field2675 == 4) {
            var13 = (int) class313.field4229 & 16383;
        } else {
            var13 = 16383 & (int) class313.field4229 + class161.field2395;
        }
        int var14 = Math.max(arg9.field2027 / 2, arg9.field2011 / 2) + 10;
        int var15 = arg2 * arg2 + arg3 * arg3;
        if (var15 <= var14 * var14) {
            int var16 = class174.field2572[var13];
            int var17 = class174.field2564[var13];
            if (~class184.field2675 != -5) {
                var17 = var17 * 256 / (class398.field5576 + 256);
                var16 = var16 * 256 / (class398.field5576 + 256);
            }
            int var18 = arg3 * var16 - -(arg2 * var17) >> 15;
            int var19 = arg3 * var17 + -(arg2 * var16) >> 15;
            int var20 = arg11.method2055(arg4, (byte) -97, (class80[]) null, 100);
            int var21 = var18 - var20 / 2;
            int var22 = arg11.method2052(100, -31, (class80[]) null, 0, arg4);
            if (~var21 <= ~(-arg9.field2027) && ~arg9.field2027 <= ~var21 && -arg9.field2011 <= var19 && ~var19 >= ~arg9.field2011) {
                arg6.method1315(arg5, 0, arg9.field2027 / 2 + var21 + arg0, 1, (int[]) null, (byte) -106, 50, 0, arg0, arg1, arg8, var20, arg9.field2011 / 2 + (-var19 + arg5 - arg10) + -var22, (class80[]) null, arg4, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public final void method1028(byte arg0) {
        ++field4487;
        try {
            Object var2 = this.field4476;
            synchronized (this.field4476) {
                while (~super.field3057 != -1) {
                    this.field4476.wait();
                }
            }
            if (arg0 <= 21) {
                this.method1018(45, 0.8319965F, false, 79, (class411) null);
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)V")
    public final void method1026(boolean arg0, int arg1) {
        ++field4489;
        int var3 = 0;
        Object var4 = this.field4476;
        synchronized (this.field4476) {
            if (~this.field4497 == ~arg1) {
                for (int var5 = 0; ~var5 > ~this.field4497; ++var5) {
                    this.method2096(var3++, 32);
                }
            } else {
                for (int var6 = 0; ~this.field4497 < ~var6; ++var6) {
                    this.field4495[var6].method1447((byte) 122);
                }
                this.field4497 = arg1;
                this.field4495 = new class210[this.field4497];
                if (arg0) {
                    for (int var7 = 0; var7 < this.field4497; ++var7) {
                        this.field4495[var7] = new class210(this);
                        this.field4495[var7].method1446((byte) 91);
                        this.method2096(var3++, 32);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(II)Lqr;")
    public static final class15 method2102(int arg0, int arg1) {
        ++field4490;
        class410 var2 = class243.field3362;
        class15 var3;
        synchronized (class243.field3362) {
            var3 = (class15) class243.field3362.method2537(-77, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class132.field1888.method2633(class426.method2619(arg0, 90), -1, class328.method2083(0, arg0));
            class15 var5 = new class15();
            var5.field128 = arg0;
            if (var4 != null) {
                var5.method75(-113, new class289(var4));
            }
            var5.method84((byte) 63);
            if (arg1 > -29) {
                method2102(-81, -7);
            }
            class410 var6 = class243.field3362;
            synchronized (class243.field3362) {
                class243.field3362.method2542(var5, (byte) -86, (long) arg0);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILdg;)V")
    public final void method1019(int arg0, class224 arg1) {
        ++field4488;
        Object var3 = this.field4476;
        synchronized (this.field4476) {
            super.field3046[super.field3050] = 21;
            super.field3053[super.field3050] = arg1;
            ++super.field3050;
            ++super.field3049;
            ++super.field3057;
            if (arg0 == 0) {
                if (super.field3050 >= 5000) {
                    super.field3050 = 0;
                }
                if (~this.field4496 < -1) {
                    this.field4476.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method2103(int arg0, String arg1) {
        if (arg0 != 9479941) {
            field4498 = 55;
        }
        ++field4477;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; ++var5) {
            var3 = (long) arg1.charAt(var5) + -var3 + (var3 << 5);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V")
    public final void method1027(int arg0, int arg1) {
        Object var3 = this.field4476;
        synchronized (this.field4476) {
            super.field3046[super.field3050] = (byte) arg1;
            ++super.field3050;
            ++super.field3049;
            ++super.field3057;
            if (arg0 != 2) {
                this.method1019(82, (class224) null);
            }
            if (~super.field3050 <= -5001) {
                super.field3050 = 0;
            }
            if (this.field4496 > 0) {
                this.field4476.notifyAll();
            }
        }
        ++field4486;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([IB)Ljava/lang/String;")
    public static final String method2104(int[] arg0, byte arg1) {
        ++field4478;
        if (arg1 >= -55) {
            method2099(-85, 28, 47);
        }
        StringBuffer var2 = new StringBuffer();
        int var3 = class388.field5456;
        for (int var4 = 0; var4 < arg0.length; ++var4) {
            class378 var5 = class334.method2114(arg0[var4], 35);
            if (var5.field5318 != -1) {
                class80 var6 = (class80) class415.field5801.method2537(-123, (long) var5.field5318);
                if (var6 == null) {
                    class214 var7 = class214.method1459(class187.field2705, var5.field5318, 0);
                    if (var7 != null) {
                        var6 = class249.field3415.method213(var7, true);
                        class415.field5801.method2542(var6, (byte) -49, (long) var5.field5318);
                    }
                }
                if (var6 != null) {
                    class258.field3483[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    ++var3;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V")
    public final void method1020(byte arg0) {
        ++field4492;
        Object var2 = this.field4476;
        synchronized (this.field4476) {
            int var3 = 0;
            while (true) {
                if (this.field4497 <= var3) {
                    break;
                }
                if (this.field4495[var3].field2925 >= 0) {
                    this.method2097(0, this.field4495[var3].field2925);
                }
                ++var3;
            }
        }
        if (arg0 <= 61) {
            this.field4496 = -65;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IFZILsa;)V")
    public final void method1018(int arg0, float arg1, boolean arg2, int arg3, class411 arg4) {
        Object var6 = this.field4476;
        synchronized (this.field4476) {
            super.field3046[super.field3050] = (byte) (arg2 ? arg3 + 40 : arg3 + 30);
            super.field3053[super.field3050] = arg4;
            super.field3048[super.field3050] = arg1;
            ++super.field3050;
            if (arg0 != 0) {
                field4498 = -112;
            }
            if (~super.field3050 <= -5001) {
                super.field3050 = 0;
            }
            ++super.field3049;
            ++super.field3057;
            if (~this.field4496 < -1) {
                this.field4476.notifyAll();
            }
        }
        ++field4491;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
    public static final void method2105(int arg0) {
        if (arg0 != -29596) {
            method2102(-85, -78);
        }
        class303.field4106.method2533(0);
        ++field4481;
    }
}
