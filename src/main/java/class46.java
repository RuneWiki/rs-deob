import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class46 extends class124 {

    @OriginalMember(owner = "client!gd", name = "gb", descriptor = "Z")
    public boolean field1280 = false;

    @OriginalMember(owner = "client!gd", name = "ob", descriptor = "I")
    public int field1288 = -1;

    @OriginalMember(owner = "client!gd", name = "xb", descriptor = "I")
    public int field1297 = -1;

    @OriginalMember(owner = "client!gd", name = "Cb", descriptor = "I")
    public int field1302 = 99;

    @OriginalMember(owner = "client!gd", name = "qb", descriptor = "I")
    public int field1290 = -1;

    @OriginalMember(owner = "client!gd", name = "fb", descriptor = "I")
    public int field1279 = 2;

    @OriginalMember(owner = "client!gd", name = "Ab", descriptor = "I")
    public int field1300 = 5;

    @OriginalMember(owner = "client!gd", name = "Mb", descriptor = "I")
    public int field1312 = -1;

    @OriginalMember(owner = "client!gd", name = "Ob", descriptor = "I")
    public int field1314 = -1;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "[Lrd;")
    public static class117[] field1273 = new class117[1000];

    @OriginalMember(owner = "client!gd", name = "sb", descriptor = "Z")
    public static boolean field1292 = false;

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "Lrd;")
    public static class117 field1277 = class95.method812("Fehler beim Laden Ihres Spielcharakters)3", (byte) 8);

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "Lrd;")
    public static class117 field1274 = class95.method812("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1", (byte) 8);

    @OriginalMember(owner = "client!gd", name = "Fb", descriptor = "I")
    public static int field1305 = 0;

    @OriginalMember(owner = "client!gd", name = "Hb", descriptor = "I")
    public static volatile int field1307 = 0;

    @OriginalMember(owner = "client!gd", name = "wb", descriptor = "J")
    public static long field1296 = 0L;

    @OriginalMember(owner = "client!gd", name = "ub", descriptor = "Lrd;")
    private static class117 field1294 = class95.method812("glow3:", (byte) 8);

    @OriginalMember(owner = "client!gd", name = "tb", descriptor = "Lrd;")
    public static class117 field1293 = field1294;

    @OriginalMember(owner = "client!gd", name = "Ib", descriptor = "Lrd;")
    public static class117 field1308 = class95.method812("Zu viele Verbindungen von Ihrer Adresse)3", (byte) 8);

    @OriginalMember(owner = "client!gd", name = "Nb", descriptor = "Lrd;")
    public static class117 field1313 = field1294;

    @OriginalMember(owner = "client!gd", name = "Gb", descriptor = "I")
    public static int field1306 = -1;

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!gd", name = "eb", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!gd", name = "hb", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!gd", name = "kb", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!gd", name = "lb", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!gd", name = "mb", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!gd", name = "nb", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!gd", name = "pb", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!gd", name = "vb", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!gd", name = "yb", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!gd", name = "zb", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!gd", name = "Bb", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!gd", name = "Db", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!gd", name = "Eb", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!gd", name = "Lb", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!gd", name = "ib", descriptor = "[I")
    public int[] field1282;

    @OriginalMember(owner = "client!gd", name = "jb", descriptor = "[I")
    private int[] field1283;

    @OriginalMember(owner = "client!gd", name = "rb", descriptor = "[I")
    public int[] field1291;

    @OriginalMember(owner = "client!gd", name = "Jb", descriptor = "[I")
    public int[] field1309;

    @OriginalMember(owner = "client!gd", name = "Kb", descriptor = "[I")
    private int[] field1310;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[Lrd;BI)Lrd;")
    public static final class117 method494(int arg0, class117[] arg1, byte arg2, int arg3) {
        field1275++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg1[arg3 + var5] == null) {
                arg1[arg3 + var5] = class121.field2965;
            }
            var4 += arg1[arg3 + var5].field2858;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        if (arg2 <= 73) {
            method499((byte) -11);
        }
        for (int var8 = 0; var8 < arg0; var8++) {
            class117 var10 = arg1[arg3 + var8];
            class91.method797(var10.field2851, 0, var6, var7, var10.field2858);
            var7 += var10.field2858;
        }
        class117 var9 = new class117();
        var9.field2858 = var4;
        var9.field2851 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ldf;IIILgd;)Ldf;")
    public final class28 method495(class28 arg0, int arg1, int arg2, int arg3, class46 arg4) {
        field1295++;
        int var6 = this.field1309[arg1];
        class66 var7 = class102.method855(var6 >> 16, 62);
        int var8 = var6 & arg2;
        if (var7 == null) {
            return arg4.method504(arg3, arg0, -111);
        }
        int var9 = arg4.field1309[arg3];
        class66 var10 = class102.method855(var9 >> 16, 100);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class28 var12 = arg0.method292(!var7.method659(var8, arg2 ^ 0xD383));
            var12.method286(var7, var8);
            return var12;
        } else {
            class28 var13 = arg0.method292(!var7.method659(var8, 11388) & !var10.method659(var11, arg2 - 54147));
            var13.method305(var7, var8, var10, var11, this.field1283);
            return var13;
        }
    }

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "(I)V")
    public static final void method496(int arg0) {
        if (class119.field2923 != null) {
            class119.field2923.method755(-2);
            class119.field2923 = null;
        }
        class111.method914(-126);
        class90.field2308.method349();
        for (int var1 = 0; var1 < 4; var1++) {
            class18.field461[var1].method571((byte) 86);
        }
        System.gc();
        class40.method466(2, (byte) 21);
        class71.field1984 = false;
        field1287++;
        class63.field1814 = -1;
        if (arg0 <= -4) {
            class33.method390(13503);
            class85.method769(0, 10);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLbf;I)V")
    private final void method497(byte arg0, class14 arg1, int arg2) {
        field1289++;
        if (arg2 == 1) {
            int var4 = arg1.method153(true);
            this.field1282 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1282[var5] = arg1.method138((byte) 117);
            }
            this.field1309 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1309[var6] = arg1.method138((byte) 72);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1309[var7] = (arg1.method138((byte) 100) << 16) + this.field1309[var7];
            }
        } else if (arg2 == 2) {
            this.field1290 = arg1.method138((byte) 123);
        } else if (arg2 == 3) {
            int var13 = arg1.method153(true);
            this.field1283 = new int[var13 + 1];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1283[var14] = arg1.method153(true);
            }
            this.field1283[var13] = 9999999;
        } else if (arg2 == 4) {
            this.field1280 = true;
        } else if (arg2 == 5) {
            this.field1300 = arg1.method153(true);
        } else if (arg2 == 6) {
            this.field1312 = arg1.method138((byte) 87);
        } else if (arg2 == 7) {
            this.field1288 = arg1.method138((byte) 79);
        } else if (arg2 == 8) {
            this.field1302 = arg1.method153(true);
        } else if (arg2 == 9) {
            this.field1314 = arg1.method153(true);
        } else if (arg2 == 10) {
            this.field1297 = arg1.method153(true);
        } else if (arg2 == 11) {
            this.field1279 = arg1.method153(true);
        } else if (arg2 == 12) {
            int var10 = arg1.method153(true);
            this.field1310 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1310[var11] = arg1.method138((byte) 101);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field1310[var12] += arg1.method138((byte) 108) << 16;
            }
        } else if (arg2 == 13) {
            int var8 = arg1.method153(true);
            this.field1291 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1291[var9] = arg1.method122(17260);
            }
        }
        if (arg0 > -124) {
            this.field1283 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)V")
    public final void method498(boolean arg0) {
        field1278++;
        if (this.field1314 == -1) {
            if (this.field1283 == null) {
                this.field1314 = 0;
            } else {
                this.field1314 = 2;
            }
        }
        if (!arg0) {
            method499((byte) -2);
        }
        if (this.field1297 != -1) {
            return;
        }
        if (this.field1283 == null) {
            this.field1297 = 0;
        } else {
            this.field1297 = 2;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
    public static final void method499(byte arg0) {
        field1311++;
        try {
            Graphics var1 = class42.field1216.getGraphics();
            class18.field460.method485(4, 4, -6898, var1);
            int var2 = -60 % ((-arg0 - 24) / 51);
        } catch (Exception var3) {
            class42.field1216.repaint();
        }
    }

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "(I)V")
    public static void method500(int arg0) {
        field1294 = null;
        field1277 = null;
        field1308 = null;
        field1274 = null;
        field1313 = null;
        field1273 = null;
        field1293 = null;
        if (arg0 != 6634) {
            field1294 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lbe;I)V")
    public static final void method501(class13 arg0, int arg1) {
        class61.field1706 = arg0;
        if (arg1 != 0) {
            field1307 = 26;
        }
        field1276++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ldf;III)Ldf;")
    public final class28 method502(class28 arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1309[arg3];
        field1298++;
        class66 var6 = class102.method855(var5 >> 16, 71);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method292(true);
        }
        int var8 = arg1 & 0x3;
        class28 var9 = arg0.method292(!var6.method659(var7, 11388));
        if (var8 == 1) {
            var9.method285();
        } else if (var8 == 2) {
            var9.method301();
        } else if (var8 == 3) {
            var9.method306();
        }
        var9.method286(var6, var7);
        if (arg2 != 1272007632) {
            return null;
        }
        if (var8 == 1) {
            var9.method306();
        } else if (var8 == 2) {
            var9.method301();
        } else if (var8 == 3) {
            var9.method285();
        }
        return var9;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)V")
    public static final void method503(boolean arg0, int arg1) {
        field1272++;
        if (class144.field3516.field717 >> 7 == class40.field1164 && class144.field3516.field751 >> 7 == class59.field1674) {
            class40.field1164 = 0;
        }
        if (arg1 != 5987) {
            return;
        }
        int var2 = class96.field2419;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            int var4;
            class101 var5;
            if (arg0) {
                var4 = 33538048;
                var5 = class144.field3516;
            } else {
                var5 = class93.field2340[class137.field3292[var3]];
                var4 = class137.field3292[var3] << 14;
            }
            if (var5 != null && var5.method265(-109)) {
                var5.field2526 = false;
                if ((class68.field1925 && class96.field2419 > 50 || class96.field2419 > 200) && !arg0 && var5.field726 == var5.field704) {
                    var5.field2526 = true;
                }
                int var6 = var5.field717 >> 7;
                int var7 = var5.field751 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var5.field2510 == null || class85.field2236 < var5.field2520 || class85.field2236 >= var5.field2523) {
                        if ((var5.field717 & 0x7F) == 64 && (var5.field751 & 0x7F) == 64) {
                            if (class71.field1974[var6][var7] == class128.field3112) {
                                continue;
                            }
                            class71.field1974[var6][var7] = class128.field3112;
                        }
                        var5.field2519 = class133.method1091(class120.field2940, var5.field751, (byte) -83, var5.field717);
                        class90.field2308.method323(class120.field2940, var5.field717, var5.field751, var5.field2519, 60, var5, var5.field697, var4, var5.field690);
                    } else {
                        var5.field2526 = false;
                        var5.field2519 = class133.method1091(class120.field2940, var5.field751, (byte) 126, var5.field717);
                        class90.field2308.method364(class120.field2940, var5.field717, var5.field751, var5.field2519, 60, var5, var5.field697, var4, var5.field2533, var5.field2513, var5.field2522, var5.field2504);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILdf;I)Ldf;")
    public final class28 method504(int arg0, class28 arg1, int arg2) {
        int var4 = this.field1309[arg0];
        field1285++;
        if (arg2 >= -77) {
            return null;
        }
        class66 var5 = class102.method855(var4 >> 16, 85);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method292(true);
        } else {
            class28 var7 = arg1.method292(!var5.method659(var6, 11388));
            var7.method286(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILdf;)Ldf;")
    public final class28 method505(int arg0, int arg1, class28 arg2) {
        field1304++;
        int var4 = this.field1309[arg1];
        class66 var5 = class102.method855(var4 >> 16, 76);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method292(true);
        }
        if (arg0 >= -64) {
            this.method507(-2, null, -34);
        }
        int var7 = 0;
        class66 var8 = null;
        if (this.field1310 != null && this.field1310.length > arg1) {
            int var9 = this.field1310[arg1];
            var8 = class102.method855(var9 >> 16, 63);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class28 var11 = arg2.method292(!var5.method659(var6, 11388));
            var11.method286(var5, var6);
            return var11;
        } else {
            class28 var10 = arg2.method292(!var5.method659(var6, 11388) & !var8.method659(var7, 11388));
            var10.method286(var5, var6);
            var10.method286(var8, var7);
            return var10;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)I")
    public static final int method506(int arg0, int arg1, int arg2) {
        field1281++;
        if (arg1 != -1) {
            field1294 = null;
        }
        class45 var3 = (class45) class84.field2191.method20((long) arg0, true);
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var3.field1265.length) {
            return var3.field1265[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(ILdf;I)Ldf;")
    public final class28 method507(int arg0, class28 arg1, int arg2) {
        int var4 = this.field1309[arg2];
        class66 var5 = class102.method855(var4 >> arg0, 112);
        int var6 = var4 & 0xFFFF;
        field1284++;
        if (var5 == null) {
            return arg1.method295(true);
        } else {
            class28 var7 = arg1.method295(!var5.method659(var6, arg0 - 1271996244));
            var7.method286(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILbf;)V")
    public final void method508(int arg0, class14 arg1) {
        field1303++;
        if (arg0 != -1) {
            this.method505(102, -79, null);
        }
        while (true) {
            int var3 = arg1.method153(true);
            if (var3 == 0) {
                return;
            }
            this.method497((byte) -128, arg1, var3);
        }
    }
}
