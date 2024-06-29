import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class221 extends class311 {

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public int field3091;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "[I")
    public int[] field3096;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "[I")
    public int[] field3092;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "[[I")
    public int[][] field3095;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "[Z")
    public boolean[] field3098;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "Lhc;")
    public static class368 field3097;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "Lhc;")
    public static class368 field3099;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "Lka;")
    public static class408 field3106;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field3103;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "[Lwn;")
    public static class77[] field3104;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field3105;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIB)B")
    public static final byte method1462(int arg0, int arg1, byte arg2) {
        field3102++;
        if (arg1 == 9) {
            int var3 = 19 % ((68 - arg2) / 50);
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
    public static final void method1463(int arg0) {
        field3093++;
        class419.method2589(0, false);
        class379.field5232 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class115.field1750.length; var2++) {
            if (class15.field209[var2] != -1 && class115.field1750[var2] == null) {
                class115.field1750[var2] = class314.field4254.method1926(0, 0, class15.field209[var2]);
                if (class115.field1750[var2] == null) {
                    var1 = false;
                    class379.field5232++;
                }
            }
            if (class415.field5756[var2] != -1 && class204.field2902[var2] == null) {
                class204.field2902[var2] = class314.field4254.method1929(class415.field5756[var2], class122.field1833[var2], 0, -2);
                if (class204.field2902[var2] == null) {
                    var1 = false;
                    class379.field5232++;
                }
            }
            if (class140.field2048[var2] != -1 && class134.field2008[var2] == null) {
                class134.field2008[var2] = class314.field4254.method1926(0, 0, class140.field2048[var2]);
                if (class134.field2008[var2] == null) {
                    var1 = false;
                    class379.field5232++;
                }
            }
            if (class66.field923[var2] != -1 && class143.field2083[var2] == null) {
                class143.field2083[var2] = class314.field4254.method1926(0, 0, class66.field923[var2]);
                if (class143.field2083[var2] == null) {
                    var1 = false;
                    class379.field5232++;
                }
            }
            if (class147.field2129 != null && class446.field6256[var2] == null && class147.field2129[var2] != -1) {
                class446.field6256[var2] = class314.field4254.method1929(class147.field2129[var2], class122.field1833[var2], 0, -2);
                if (class446.field6256[var2] == null) {
                    var1 = false;
                    class379.field5232++;
                }
            }
        }
        if (class430.field5988 == null) {
            if (class337.field4554 == null || !class399.field5534.method1907(-1, class337.field4554.field1453 + "_staticelements")) {
                class430.field5988 = new class147(0);
            } else if (class399.field5534.method1921(class337.field4554.field1453 + "_staticelements", (byte) -126)) {
                class430.field5988 = class70.method557(-251, class399.field5534, class337.field4554.field1453 + "_staticelements", class55.field701);
            } else {
                class379.field5232++;
                var1 = false;
            }
        }
        if (!var1) {
            class127.field1918 = 1;
            return;
        }
        boolean var3 = true;
        class143.field2087 = 0;
        for (int var4 = 0; var4 < class115.field1750.length; var4++) {
            byte[] var20 = class204.field2902[var4];
            if (var20 != null) {
                int var21 = (class171.field2413[var4] >> 8) * 64 - class6.field65;
                int var22 = (class171.field2413[var4] & 0xFF) * 64 - class371.field5148;
                if (class56.field731) {
                    var21 = 10;
                    var22 = 10;
                }
                var3 &= class147.method1066(var21, var20, var22, (byte) -81);
            }
            byte[] var23 = class143.field2083[var4];
            if (var23 != null) {
                int var24 = (class171.field2413[var4] >> 8) * 64 - class6.field65;
                int var25 = (class171.field2413[var4] & 0xFF) * 64 - class371.field5148;
                if (class56.field731) {
                    var24 = 10;
                    var25 = 10;
                }
                var3 &= class147.method1066(var24, var23, var25, (byte) -79);
            }
        }
        if (!var3) {
            class127.field1918 = 2;
            return;
        }
        if (class127.field1918 != 0) {
            class405.method2502(1, true, class31.field432, class326.field4432.method2313((byte) -111, class445.field6241) + "<br>(100%)");
        }
        class140.method1025(255);
        class217.method1443(-65);
        boolean var5 = false;
        if (class354.field4765.method205() && class152.field2192) {
            for (int var6 = 0; var6 < class115.field1750.length; var6++) {
                if (class143.field2083[var6] != null || class134.field2008[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class160.field2272) {
            var7 = class64.field877[class356.field4780];
        } else {
            var7 = class370.field5130[class356.field4780];
        }
        if (class354.field4765.method216()) {
            var7++;
        }
        class61.method499(4, class11.field107, class264.field3620, var7, var5, class354.field4765.method264() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class403.field5567[var8].method1987(32);
        }
        class304.method1840(-29348);
        class436.method2681((byte) -127, false);
        class418.method2581(121);
        class140.method1025(255);
        System.gc();
        class419.method2589(0, true);
        class231.method1510(68, 4, false);
        int[][] var9 = null;
        if (!class56.field731) {
            class253.method1624((byte) -69, false);
            class442.method2745(class359.field4970.field2662[0] >> 3, class359.field4970.field2659[0] >> 3, -99);
            class405.method2505((byte) 103);
            method1464(4, class354.field4765, (byte) 101, false, (int[][]) null);
            var9 = class278.field3794[0];
            class419.method2589(0, true);
            class47.method384(false, true);
            if (class446.field6256 != null) {
                class53.method428((byte) -103);
            }
        }
        if (class56.field731) {
            class120.method931(99, false);
            class442.method2745(class359.field4970.field2662[0] >> 3, class359.field4970.field2659[0] >> 3, 121);
            class405.method2505((byte) 58);
            method1464(4, class354.field4765, (byte) 109, false, (int[][]) null);
            var9 = class278.field3794[0];
            class419.method2589(0, true);
            class245.method1599(113, false);
        }
        class217.method1443(-31);
        class419.method2589(0, true);
        class21.method122(4, class403.field5567, class354.field4765, (byte) -120, (class323) null, false);
        class410.method2543(4, false, class354.field4765);
        class419.method2589(0, true);
        if (arg0 > -109) {
            return;
        }
        int var10 = class56.field733;
        if (class343.field4623 < var10) {
            var10 = class343.field4623;
        }
        if ((class343.field4623 - 1) > var10) {
            var10 = class343.field4623 - 1;
        }
        if (class397.method2461(-69)) {
            class236.method1545(0);
        } else {
            class236.method1545(var10);
        }
        class63.method507(77);
        if (var5) {
            class171.method1227(true);
            class231.method1510(92, 1, true);
            if (!class56.field731) {
                class253.method1624((byte) 71, true);
                method1464(1, class354.field4765, (byte) 116, true, var9);
                class419.method2589(0, true);
                class47.method384(true, true);
                class410.method2543(1, false, class354.field4765);
            }
            if (class56.field731) {
                class120.method931(111, true);
                method1464(1, class354.field4765, (byte) 113, true, var9);
                class419.method2589(0, true);
                class245.method1599(98, true);
            }
            class217.method1443(-74);
            class419.method2589(0, true);
            class21.method122(1, class403.field5567, class354.field4765, (byte) -85, class82.field1130[0], true);
            class410.method2543(1, false, class354.field4765);
            class419.method2589(0, true);
            class63.method507(114);
            class171.method1227(false);
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var18 = 0; var18 < class11.field107; var18++) {
                for (int var19 = 0; var19 < class264.field3620; var19++) {
                    class177.method1258((byte) 51, var19, var11, var18);
                }
            }
        }
        class236.method1544(0);
        class140.method1025(255);
        class117.method911(0);
        class217.method1443(-64);
        class325.field4424 = false;
        class399.method2475((byte) 113);
        if (class323.field4392 != null && class398.field5513 != null && class98.field1383 == 25) {
            class88.field1232.method1151(175, (byte) -125);
            class140.field2049++;
            class88.field1232.method2261(1057001181, -176);
        }
        if (!class56.field731) {
            int var12 = (class26.field335 - (class11.field107 >> 4)) / 8;
            int var13 = ((class11.field107 >> 4) + class26.field335) / 8;
            int var14 = (class133.field1988 - (class264.field3620 >> 4)) / 8;
            int var15 = ((class264.field3620 >> 4) + class133.field1988) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var16 < var12 || var13 < var16 || var14 > var17 || var17 > var15) {
                        class314.field4254.method1923((byte) -80, "m" + var16 + "_" + var17);
                        class314.field4254.method1923((byte) -67, "l" + var16 + "_" + var17);
                    }
                }
            }
        }
        if (class98.field1383 == 28) {
            class191.method1321(10, 40);
        } else {
            class191.method1321(30, 40);
            if (class398.field5513 != null) {
                class88.field1232.method1151(29, (byte) 91);
            }
        }
        class203.method1388(84);
        class140.method1025(255);
        class80.method650(-4);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILea;BZ[[I)V")
    private static final void method1464(int arg0, class58 arg1, byte arg2, boolean arg3, int[][] arg4) {
        for (int var5 = 0; var5 < arg0; var5++) {
            int[][] var6;
            if (arg4 == null) {
                var6 = null;
            } else {
                var6 = new int[class11.field107 + 1][class264.field3620 + 1];
                for (int var7 = 0; var7 <= class264.field3620; var7++) {
                    for (int var8 = 0; var8 <= class11.field107; var8++) {
                        var6[var8][var7] = class278.field3794[var5][var8][var7] - arg4[var8][var7];
                    }
                }
            }
            int var9 = 0;
            int var10 = 0;
            if (!arg3) {
                if (class428.field5958) {
                    var9 |= 0x2;
                }
                if (class152.field2192) {
                    var10 |= 0x8;
                }
                if (class228.field3188 != 0) {
                    var9 |= 0x1;
                    if (var5 == 0 || class409.field5703 >= 96) {
                        var10 |= 0x10;
                    }
                }
            }
            if (class428.field5958) {
                var10 |= 0x7;
            }
            class323 var11 = arg1.method230(class11.field107, class264.field3620, class278.field3794[var5], var6, 128, var9, var10);
            class350.method2114(var5, var11);
        }
        if (arg2 <= 100) {
            method1463(85);
        }
        field3100++;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I[B)V")
    public class221(int arg0, byte[] arg1) {
        this.field3094 = arg0;
        class366 var3 = new class366(arg1);
        this.field3091 = var3.method2306((byte) 89);
        this.field3096 = new int[this.field3091];
        this.field3092 = new int[this.field3091];
        this.field3095 = new int[this.field3091][];
        this.field3098 = new boolean[this.field3091];
        for (int var4 = 0; var4 < this.field3091; var4++) {
            this.field3096[var4] = var3.method2306((byte) 37);
        }
        for (int var5 = 0; var5 < this.field3091; var5++) {
            this.field3098[var5] = var3.method2306((byte) 107) == 1;
        }
        for (int var6 = 0; var6 < this.field3091; var6++) {
            this.field3092[var6] = var3.method2297(13352);
        }
        for (int var7 = 0; var7 < this.field3091; var7++) {
            this.field3095[var7] = new int[var3.method2306((byte) 104)];
        }
        for (int var8 = 0; var8 < this.field3091; var8++) {
            for (int var9 = 0; var9 < this.field3095[var8].length; var9++) {
                this.field3095[var8][var9] = var3.method2306((byte) 49);
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)V")
    public static void method1465(int arg0) {
        field3104 = null;
        field3103 = null;
        field3106 = null;
        field3097 = null;
        if (arg0 <= -64) {
            field3105 = null;
            field3099 = null;
        }
    }

    static {
        new class368("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field3097 = new class368("scroll:", "scrollen:", "déroulement:", "rolagem:");
        field3101 = 1;
        field3099 = new class368("white:", "", "", "");
        field3106 = new class408(4);
    }
}
