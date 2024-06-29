import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class93 {

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "[[I")
    private int[][] field1438;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    private int field1443;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "[I")
    public static int[] field1432 = new int[1000];

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Lck;")
    private static class119 field1435 = class298.method1987((byte) 121, "hint_mapmarkers");

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "[[I")
    public static int[][] field1437 = new int[104][104];

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "Lck;")
    public static class119 field1440 = class298.method1987((byte) 81, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Lck;")
    public static class119 field1429 = class298.method1987((byte) 21, "");

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Lvh;")
    public static class212 field1431 = new class212(32);

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1442 = "http://advert.runescape.com/banner.ws?size=729";

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field1444 = -1;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "Lml;")
    public static class134 field1439;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[B)[B", line = 19)
    public final byte[] method633(int arg0, byte[] arg1) {
        field1441++;
        int var3 = 81 / ((arg0 + 38) / 59);
        if (this.field1438 != null) {
            int var4 = (int) ((long) arg1.length * (long) this.field1443 / (long) this.field1433) + 14;
            int var5 = 0;
            int[] var6 = new int[var4];
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.length; var8++) {
                byte var9 = arg1[var8];
                int[] var10 = this.field1438[var5];
                for (int var11 = 0; var11 < 14; var11++) {
                    var6[var7 + var11] += var10[var11] * var9;
                }
                int var12 = this.field1443 + var5;
                int var13 = var12 / this.field1433;
                var5 = var12 - this.field1433 * var13;
                var7 += var13;
            }
            arg1 = new byte[var4];
            for (int var14 = 0; var14 < var4; var14++) {
                int var15 = var6[var14] + 32768 >> 16;
                if (var15 < -128) {
                    arg1[var14] = -128;
                } else if (var15 <= 127) {
                    arg1[var14] = (byte) var15;
                } else {
                    arg1[var14] = 127;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I", line = 91)
    public final int method634(int arg0, int arg1) {
        if (this.field1438 != null) {
            arg0 = ((int) ((long) this.field1443 * (long) arg0 / (long) this.field1433)) + 6;
        }
        field1428++;
        if (arg1 != -14085) {
            this.method634(92, -105);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILva;)V", line = 105)
    public static final void method635(int arg0, class36 arg1) {
        class44.field654 = arg1.method285(class203.field3219, true);
        class124.field1912 = arg1.method285(class281.field4647, true);
        class183.field2909 = arg1.method285(class124.field1916, true);
        field1434++;
        class86.field1303 = arg1.method285(class79.field1219, true);
        class270.field4452 = arg1.method285(class263.field4286, true);
        class87.field1323 = arg1.method285(class196.field3138, true);
        class139.field2228 = arg1.method285(class299.field5055, true);
        if (arg0 != -6607) {
            field1439 = (class134) null;
        }
        class85.field1286 = arg1.method285(class36.field513, true);
        class221.field3543 = arg1.method285(class276.field4514, true);
        class74.field1164 = arg1.method285(class246.field3978, true);
        class291.field4813 = arg1.method285(field1435, true);
        class162.field2560 = arg1.method285(class209.field3345, true);
        class101.field1532 = arg1.method285(class25.field377, true);
        class63.field1000 = arg1.method285(class58.field935, true);
        class216.field3458 = arg1.method285(class217.field3496, true);
        class206.field3270 = arg1.method285(class154.field2454, true);
        class20.field292 = arg1.method285(class289.field4762, true);
        class185.field2924 = arg1.method285(class81.field1240, true);
        class151.field2409 = arg1.method285(class114.field1727, true);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)I", line = 137)
    public final int method636(int arg0, int arg1) {
        if (this.field1438 != null) {
            arg1 = (int) ((long) this.field1443 * (long) arg1 / (long) this.field1433);
        }
        field1436++;
        if (arg0 <= 118) {
            method637((byte) 2);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V", line = 159)
    public static final void method637(byte arg0) {
        if (class4.field114 < 128) {
            class4.field114 = 128;
        }
        class140.field2253 &= 0x7FF;
        if (class4.field114 > 383) {
            class4.field114 = 383;
        }
        field1430++;
        int var1 = class273.field4486 >> 7;
        if (arg0 != -110) {
            field1442 = (String) null;
        }
        int var2 = class295.field4890 >> 7;
        int var3 = 0;
        int var4 = class207.method1304(class10.field189, (byte) 82, class273.field4486, class295.field4890);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class10.field189;
                    if (var7 < 3 && (class111.field1707[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var4 - class57.field926[var7][var5][var6];
                    if (var3 < var8) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class27.field397 < var9) {
            class27.field397 += (var9 - class27.field397) / 24;
        } else if (class27.field397 > var9) {
            class27.field397 += (var9 - class27.field397) / 80;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 245)
    public static void method638(int arg0) {
        field1439 = null;
        if (arg0 != 14) {
            field1444 = -46;
        }
        field1432 = null;
        field1431 = null;
        field1440 = null;
        field1437 = (int[][]) null;
        field1442 = null;
        field1435 = null;
        field1429 = null;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(II)V", line = 269)
    public class93(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class283.method1884(arg0, true, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field1438 = new int[var5][14];
            this.field1443 = var4;
            this.field1433 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1438[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                if (var10 < 0) {
                    var10 = 0;
                }
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (-1.0E-4D > var14 || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
