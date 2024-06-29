import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class64 implements class79 {

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "Z")
    private boolean field1250 = true;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field1236 = 0;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "Lcd;")
    public static class64 field1257 = class44.method335((byte) 71, "Fertigkeit:");

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "[J")
    public static long[] field1237 = new long[500];

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    private int field1249;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "I")
    public int field1274;

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!cd", name = "cb", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!cd", name = "db", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!cd", name = "eb", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!cd", name = "fb", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!cd", name = "gb", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!cd", name = "hb", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!cd", name = "ib", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!cd", name = "jb", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!cd", name = "kb", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!cd", name = "lb", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "Lqm;")
    public static class222 field1233;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "[B")
    public byte[] field1252;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBLcd;I)Lcd;", line = 10)
    public final class64 method491(int arg0, byte arg1, class64 arg2, int arg3) {
        field1263++;
        if (!this.field1250) {
            throw new IllegalArgumentException();
        }
        int var5 = -38 % ((arg1 + 45) / 37);
        if (arg3 < 0 || arg0 < arg3 || arg0 > arg2.field1274) {
            throw new IllegalArgumentException();
        }
        this.field1249 = 0;
        if ((this.field1274 + arg0 - arg3) > this.field1252.length) {
            int var6;
            for (var6 = 1; var6 < (this.field1274 + arg2.field1274); var6 += var6) {
            }
            byte[] var7 = new byte[var6];
            class95.method721(this.field1252, 0, var7, 0, this.field1274);
            this.field1252 = var7;
        }
        class95.method721(arg2.field1252, arg3, this.field1252, this.field1274, arg0 - arg3);
        this.field1274 += arg0 - arg3;
        return this;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lcd;I)I", line = 65)
    public final int method492(class64 arg0, int arg1) {
        field1279++;
        int var3;
        if (arg0.field1274 < this.field1274) {
            var3 = arg0.field1274;
        } else {
            var3 = this.field1274;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg0.field1252[var4] & 0xFF) > (this.field1252[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field1252[var4] & 0xFF) > (arg0.field1252[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1 != 255) {
            field1246 = -90;
        }
        if (arg0.field1274 > this.field1274) {
            return -1;
        } else if (arg0.field1274 < this.field1274) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/net/URL;I)Ljava/net/URL;", line = 107)
    public final URL method493(URL arg0, int arg1) throws MalformedURLException {
        field1240++;
        if (arg1 != -21389) {
            this.method497(-92);
        }
        return new URL(arg0, new String(this.field1252, 0, this.field1274));
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)Lcd;", line = 119)
    public final class64 method494(int arg0, int arg1, int arg2) {
        field1227++;
        byte var4 = (byte) arg2;
        byte var5 = (byte) arg1;
        class64 var6 = new class64();
        if (arg0 != -21158) {
            this.method511((byte) -11);
        }
        var6.field1274 = this.field1274;
        var6.field1252 = new byte[this.field1274];
        for (int var7 = 0; var7 < this.field1274; var7++) {
            byte var8 = this.field1252[var7];
            if (var5 == var8) {
                var6.field1252[var7] = var4;
            } else {
                var6.field1252[var7] = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)I", line = 153)
    public final int method495(int arg0, byte arg1) {
        if (arg1 <= 77) {
            field1237 = (long[]) null;
        }
        field1245++;
        return this.field1252[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 165)
    public final void method496(int arg0, int arg1, int arg2, Graphics arg3) {
        field1283++;
        String var5;
        try {
            var5 = new String(this.field1252, 0, this.field1274, "ISO-8859-1");
            if (arg0 >= -82) {
                this.method498((byte) -94);
            }
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field1252, 0, this.field1274);
        }
        arg3.drawString(var5, arg1, arg2);
    }

    @OriginalMember(owner = "client!cd", name = "toString", descriptor = "()Ljava/lang/String;", line = 183)
    public final String toString() {
        field1282++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)Lcd;", line = 195)
    public final class64 method497(int arg0) {
        field1247++;
        if (!this.field1250) {
            throw new IllegalArgumentException();
        }
        this.field1249 = arg0;
        if (this.field1252.length != this.field1274) {
            byte[] var2 = new byte[this.field1274];
            class95.method721(this.field1252, 0, var2, 0, this.field1274);
            this.field1252 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)Z", line = 227)
    public final boolean method498(byte arg0) {
        field1286++;
        return arg0 >= -105 ? true : this.method517(10, true);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V", line = 240)
    public static final void method499(byte arg0) {
        class84.field1559 = class166.field2907;
        class121.field2180 = class186.field3199;
        class106.field1959 = class56.field950;
        class114.field2103 = class61.field1200;
        class81.field1495 = class265.field4552;
        class297.field5127 = class315.field5345;
        class196.field3346 = class92.field1662;
        field1266++;
        class246.field4291 = class220.field3747;
        class34.field558 = class24.field399;
        class91.field1636 = class296.field5104;
        class211.field3561 = class40.field630;
        class161.field2833 = class37.field602;
        class213.field3588 = class2.field8;
        class180.field3095 = class70.field1358;
        class89.field1604 = class237.field4007;
        class34.field561 = class196.field3345;
        class31.field523 = class165.field2901;
        class134.field2381 = class132.field2359;
        class135.field2418 = class55.field934;
        class69.field1341 = class89.field1606;
        class107.field1983 = class105.field1939;
        class222.field3779 = class44.field717;
        class139.field2466 = class53.field854;
        class30.field508 = class251.field4356;
        class226.field3846 = class172.field2964;
        class53.field852 = class109.field2009;
        class161.field2834 = class94.field1739;
        class260.field4474 = class195.field3334;
        class304.field5205 = class37.field605;
        class309.field5256 = class77.field1457;
        class92.field1717 = class253.field4400;
        class301.field5166 = class17.field345;
        class154.field2732 = class75.field1417;
        class248.field4311 = class41.field646;
        class240.field4112 = class83.field1537;
        class6.field143 = class44.field724;
        class275.field4727 = class297.field5125;
        class48.field800 = class248.field4312;
        class76.field1431 = class159.field2813;
        class82.field1505 = class297.field5126;
        class149.field2609 = class115.field2117;
        class220.field3723 = class122.field2203;
        class58.field958 = class292.field5040;
        class198.field3385 = class297.field5117;
        class9.field194 = class32.field536;
        class315.field5339 = class248.field4320;
        class143.field2512 = class9.field197;
        class181.field3114 = class205.field3508;
        class113.field2080 = class92.field1650;
        class17.field354 = class244.field4236;
        class47.field772 = class105.field1935;
        class151.field2697 = class10.field209;
        class189.field3253 = class312.field5291;
        class223.field3802 = class66.field1309;
        class94.field1748 = class10.field210;
        class249.field4334 = class41.field667;
        class182.field3120 = class270.field4661;
        class258.field4455 = class211.field3553;
        class47.field788 = class254.field4424;
        class6.field159 = class44.field724;
        class255.field4437 = class8.field185;
        class255.field4431 = class199.field3400;
        class131.field2319 = class154.field2725;
        class255.field4427 = class259.field4464;
        class315.field5346 = class2.field9;
        class35.field577 = class29.field497;
        class240.field4114 = class92.field1668;
        class28.field452 = class184.field3159;
        class101.field1819 = class156.field2763;
        class304.field5195 = class247.field4305;
        class54.field891 = class101.field1811;
        class180.field3077 = class263.field4507;
        class224.field3823 = class289.field4947;
        class252.field4390 = class226.field3835;
        class261.field4493 = class105.field1940;
        class84.field1560 = class102.field1845;
        class132.field2357 = class312.field5296;
        class138.field2464 = class81.field1499;
        class30.field501 = class58.field967;
        if (arg0 >= -33) {
            field1236 = -97;
        }
        class138.field2453 = client.field4173;
        class205.field3504 = class78.field1460;
        class157.field2777 = class3.field29;
        class307.field5243 = class298.field5133;
        class138.field2448 = class81.field1499;
        class40.field618 = class240.field4106;
        class185.field3170 = class185.field3187;
        class138.field2452 = client.field4173;
        class12.field235 = class202.field3465;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILcd;)I", line = 595)
    public final int method500(int arg0, class64 arg1) {
        int var3 = -113 / ((-arg0 - 68) / 44);
        field1224++;
        return this.method526(arg1, 0, -121);
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)Lcd;", line = 604)
    public final class64 method501(byte arg0) {
        field1280++;
        if (arg0 != 64) {
            this.method537(-105, (byte) 84, -111, -105, (byte[]) null);
        }
        int var2 = 0;
        int var3 = this.field1274;
        while (var2 < this.field1274 && (this.field1252[var2] >= 0 && this.field1252[var2] <= 32 || (this.field1252[var2] & 0xFF) == 160)) {
            var2++;
        }
        while (var3 > var2 && (this.field1252[var3 - 1] >= 0 && this.field1252[var3 - 1] <= 32 || (this.field1252[var3 - 1] & 0xFF) == 160)) {
            var3--;
        }
        if (var2 == 0 && this.field1274 == var3) {
            return this;
        }
        class64 var4 = new class64();
        var4.field1274 = var3 - var2;
        var4.field1252 = new byte[var4.field1274];
        for (int var5 = 0; var5 < var4.field1274; var5++) {
            var4.field1252[var5] = this.field1252[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLcd;)Lcd;", line = 641)
    public final class64 method502(byte arg0, class64 arg1) {
        field1273++;
        if (!this.field1250) {
            throw new IllegalArgumentException();
        }
        this.field1249 = 0;
        if (arg0 > -108) {
            field1257 = (class64) null;
        }
        if (this.field1252.length < (this.field1274 + arg1.field1274)) {
            int var3;
            for (var3 = 1; var3 < (this.field1274 + arg1.field1274); var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class95.method721(this.field1252, 0, var4, 0, this.field1274);
            this.field1252 = var4;
        }
        class95.method721(arg1.field1252, 0, this.field1252, this.field1274, arg1.field1274);
        this.field1274 += arg1.field1274;
        return this;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(B)Lcd;", line = 688)
    public final class64 method503(byte arg0) {
        if (arg0 != 27) {
            this.method518(123);
        }
        class64 var2 = new class64();
        var2.field1274 = this.field1274;
        var2.field1252 = new byte[var2.field1274];
        for (int var3 = 0; var3 < this.field1274; var3++) {
            var2.field1252[this.field1274 - var3 - 1] = this.field1252[var3];
        }
        field1264++;
        return var2;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)[Lcd;", line = 711)
    public final class64[] method504(int arg0, int arg1) {
        field1284++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1274; var4++) {
            if (this.field1252[var4] == arg0) {
                var3++;
            }
        }
        class64[] var5 = new class64[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = arg1;
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field1252[var6 + var9] != arg0; var9++) {
            }
            var5[var7++] = this.method524(var6 + var9, (byte) 85, var6);
            var6 += var9 + 1;
        }
        var5[var3] = this.method524(this.field1274, (byte) 127, var6);
        return var5;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLjava/applet/Applet;)Lcd;", line = 766)
    public final class64 method505(byte arg0, Applet arg1) {
        field1272++;
        int var3 = 43 / ((11 - arg0) / 44);
        String var4 = new String(this.field1252, 0, this.field1274);
        String var5 = arg1.getParameter(var4);
        return var5 == null ? null : class200.method1406((byte) 85, var5);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([[F[[FIBIIZII[[FI[[IIILfg;B)V", line = 784)
    public static final void method506(float[][] arg0, float[][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, float[][] arg9, int arg10, int[][] arg11, int arg12, int arg13, class204 arg14, byte arg15) {
        field1228++;
        int var16 = (arg13 << 8) + 255;
        int var17 = (arg8 << 8) + 255;
        int var18 = (arg7 << 8) + 255;
        int var19 = (arg4 << 8) + 255;
        int[] var20 = null;
        int[] var21 = class297.field5111[arg15];
        int[] var22 = new int[var21.length >> 1];
        for (int var23 = arg10; var23 < var22.length; var23++) {
            var22[var23] = class213.method1503(var19, arg0, false, var16, var21[var23 + var23 + 1], arg14, arg1, var18, arg12, 0.0F, var21[var23 + var23], (int[][]) null, var17, arg3, arg11, arg2, arg9, 16988);
        }
        if (arg6) {
            if (arg15 == 1) {
                var20 = new int[6];
                int var25 = class213.method1503(var19, arg0, true, var16, 128, arg14, arg1, var18, arg12, 0.0F, 64, (int[][]) null, var17, arg3, arg11, arg2, arg9, arg10 + 16988);
                int var26 = class213.method1503(var19, arg0, true, var16, 64, arg14, arg1, var18, arg12, 0.0F, 128, (int[][]) null, var17, arg3, arg11, arg2, arg9, arg10 + 16988);
                var20[2] = var22[2];
                var20[5] = var22[2];
                var20[3] = var25;
                var20[0] = var26;
                var20[4] = var22[0];
                var20[1] = var25;
            } else if (arg15 == 2) {
                int var42 = class213.method1503(var19, arg0, true, var16, 128, arg14, arg1, var18, arg12, 0.0F, 128, (int[][]) null, var17, arg3, arg11, arg2, arg9, 16988);
                var20 = new int[6];
                int var43 = class213.method1503(var19, arg0, true, var16, 0, arg14, arg1, var18, arg12, 0.0F, 64, (int[][]) null, var17, arg3, arg11, arg2, arg9, arg10 ^ 0x425C);
                var20[3] = var42;
                var20[2] = var42;
                var20[1] = var43;
                var20[4] = var22[1];
                var20[0] = var22[0];
                var20[5] = var22[0];
            } else if (arg15 == 3) {
                int var27 = class213.method1503(var19, arg0, true, var16, 128, arg14, arg1, var18, arg12, 0.0F, 0, (int[][]) null, var17, arg3, arg11, arg2, arg9, 16988);
                int var28 = class213.method1503(var19, arg0, true, var16, 0, arg14, arg1, var18, arg12, 0.0F, 64, (int[][]) null, var17, arg3, arg11, arg2, arg9, 16988);
                var20 = new int[] { var22[2], var22[1], var27, var27, var28, var22[2] };
            } else if (arg15 == 4) {
                var20 = new int[3];
                int var29 = class213.method1503(var19, arg0, true, var16, 128, arg14, arg1, var18, arg12, 0.0F, 0, (int[][]) null, var17, arg3, arg11, arg2, arg9, arg10 + 16988);
                var20[0] = var22[3];
                var20[2] = var22[0];
                var20[1] = var29;
            } else if (arg15 == 5) {
                int var30 = class213.method1503(var19, arg0, true, var16, 128, arg14, arg1, var18, arg12, 0.0F, 128, (int[][]) null, var17, arg3, arg11, arg2, arg9, 16988);
                var20 = new int[] { var22[2], var30, var22[3] };
            } else if (arg15 == 6) {
                var20 = new int[6];
                int var40 = class213.method1503(var19, arg0, true, var16, 0, arg14, arg1, var18, arg12, 0.0F, 128, (int[][]) null, var17, arg3, arg11, arg2, arg9, 16988);
                int var41 = class213.method1503(var19, arg0, true, var16, 128, arg14, arg1, var18, arg12, 0.0F, 128, (int[][]) null, var17, arg3, arg11, arg2, arg9, arg10 + 16988);
                var20[1] = var40;
                var20[2] = var41;
                var20[0] = var22[3];
                var20[4] = var22[0];
                var20[3] = var41;
                var20[5] = var22[3];
            } else if (arg15 == 7) {
                var20 = new int[6];
                int var31 = class213.method1503(var19, arg0, true, var16, 128, arg14, arg1, var18, arg12, 0.0F, 0, (int[][]) null, var17, arg3, arg11, arg2, arg9, arg10 ^ 0x425C);
                int var32 = class213.method1503(var19, arg0, true, var16, 0, arg14, arg1, var18, arg12, 0.0F, 128, (int[][]) null, var17, arg3, arg11, arg2, arg9, arg10 + 16988);
                var20[0] = var22[1];
                var20[1] = var32;
                var20[5] = var22[1];
                var20[3] = var31;
                var20[2] = var31;
                var20[4] = var22[2];
            } else if (arg15 == 8) {
                var20 = new int[3];
                int var33 = class213.method1503(var19, arg0, true, var16, 0, arg14, arg1, var18, arg12, 0.0F, 0, (int[][]) null, var17, arg3, arg11, arg2, arg9, 16988);
                var20[0] = var22[3];
                var20[2] = var22[4];
                var20[1] = var33;
            } else if (arg15 == 9) {
                var20 = new int[15];
                int var34 = class213.method1503(var19, arg0, true, var16, 64, arg14, arg1, var18, arg12, 0.0F, 128, (int[][]) null, var17, arg3, arg11, arg2, arg9, 16988);
                int var35 = class213.method1503(var19, arg0, true, var16, 32, arg14, arg1, var18, arg12, 0.0F, 96, (int[][]) null, var17, arg3, arg11, arg2, arg9, arg10 + 16988);
                int var36 = class213.method1503(var19, arg0, true, var16, 0, arg14, arg1, var18, arg12, 0.0F, 64, (int[][]) null, var17, arg3, arg11, arg2, arg9, 16988);
                var20[2] = var22[4];
                var20[4] = var22[4];
                var20[6] = var35;
                var20[12] = var35;
                var20[3] = var35;
                var20[0] = var35;
                var20[1] = var34;
                var20[13] = var22[1];
                var20[8] = var22[2];
                var20[9] = var35;
                var20[11] = var22[1];
                var20[5] = var22[3];
                var20[7] = var22[3];
                var20[14] = var36;
                var20[10] = var22[2];
            } else if (arg15 == 10) {
                var20 = new int[9];
                int var37 = class213.method1503(var19, arg0, true, var16, 128, arg14, arg1, var18, arg12, 0.0F, 0, (int[][]) null, var17, arg3, arg11, arg2, arg9, 16988);
                var20[7] = var37;
                var20[0] = var22[2];
                var20[2] = var22[3];
                var20[3] = var22[3];
                var20[1] = var37;
                var20[4] = var37;
                var20[5] = var22[4];
                var20[6] = var22[4];
                var20[8] = var22[0];
            } else if (arg15 == 11) {
                int var38 = class213.method1503(var19, arg0, true, var16, 64, arg14, arg1, var18, arg12, 0.0F, 0, (int[][]) null, var17, arg3, arg11, arg2, arg9, 16988);
                var20 = new int[12];
                int var39 = class213.method1503(var19, arg0, true, var16, 64, arg14, arg1, var18, arg12, 0.0F, 128, (int[][]) null, var17, arg3, arg11, arg2, arg9, 16988);
                var20[0] = var22[3];
                var20[2] = var22[0];
                var20[8] = var38;
                var20[6] = var22[2];
                var20[9] = var22[2];
                var20[4] = var22[2];
                var20[3] = var22[3];
                var20[1] = var38;
                var20[11] = var39;
                var20[7] = var39;
                var20[10] = var22[1];
                var20[5] = var38;
            }
        }
        arg14.method1429(arg5, arg2, arg12, var22, var20, false);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I", line = 1054)
    public final int method507(FontMetrics arg0, int arg1) {
        field1255++;
        String var3;
        try {
            var3 = new String(this.field1252, arg1, this.field1274, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field1252, 0, this.field1274);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)Lcd;", line = 1085)
    public final class64 method508(byte arg0, int arg1) {
        field1278++;
        return arg0 == 99 ? this.method524(this.field1274, (byte) 62, arg1) : (class64) null;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)J", line = 1097)
    public final long method509(int arg0) {
        if (arg0 != 31492) {
            this.method538(63, 79, 87);
        }
        field1229++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field1274 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field1252[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 + 1 - 65);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 + 1 - 97);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 - 21);
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)Lcd;", line = 1135)
    public final class64 method510(int arg0) {
        field1287++;
        class64 var2 = new class64();
        boolean var3 = true;
        int var4 = 37 % ((arg0 - 29) / 48);
        var2.field1274 = this.field1274;
        var2.field1252 = new byte[this.field1274];
        for (int var5 = 0; var5 < this.field1274; var5++) {
            byte var6 = this.field1252[var5];
            if (var6 == 95) {
                var2.field1252[var5] = 32;
                var3 = true;
            } else if (var6 >= 97 && var6 <= 122 && var3) {
                var2.field1252[var5] = (byte) (var6 - 32);
                var3 = false;
            } else {
                var2.field1252[var5] = var6;
                var3 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(B)I", line = 1184)
    public final int method511(byte arg0) {
        int var2 = -65 / ((arg0 - 12) / 59);
        int var3 = 0;
        field1256++;
        for (int var4 = 0; var4 < this.field1274; var4++) {
            var3 = (var3 << 5) + (this.field1252[var4] & 0xFF) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lcd;Z)I", line = 1201)
    public final int method512(class64 arg0, boolean arg1) {
        field1248++;
        int var3 = 0;
        int var4 = 0;
        int var5 = this.field1274;
        if (arg1) {
            return 88;
        }
        int var6 = arg0.field1274;
        int var7 = this.field1274;
        int var8 = arg0.field1274;
        int var9 = 0;
        int var10 = 0;
        while (var5 != 0 && var6 != 0) {
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = this.field1252[var9] & 0xFF;
                var9++;
            }
            if (class142.method1006(-141, var3)) {
                var7++;
            } else {
                var5--;
            }
            if (var4 == 156 || var4 == 230) {
                var4 = 101;
            } else if (var4 == 140 || var4 == 198) {
                var4 = 69;
            } else if (var4 == 223) {
                var4 = 115;
            } else {
                var4 = arg0.field1252[var10] & 0xFF;
                var10++;
            }
            if (class142.method1006(-141, var4)) {
                var8++;
            } else {
                var6--;
            }
            if (class69.field1337[var3] < class69.field1337[var4]) {
                return -1;
            }
            if (class69.field1337[var4] < class69.field1337[var3]) {
                return 1;
            }
        }
        if (var8 > var7) {
            return -1;
        } else if (var8 >= var7) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILjava/applet/Applet;)V", line = 1293)
    public final void method513(int arg0, Applet arg1) throws Throwable {
        if (arg0 == -25286) {
            field1268++;
            String var3 = new String(this.field1252, 0, this.field1274);
            class90.method682(arg1, (byte) -106, var3);
        }
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(B)V", line = 1312)
    public static void method514(byte arg0) {
        int var1 = 109 % ((arg0 + 1) / 50);
        field1237 = null;
        field1257 = null;
        field1233 = null;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(ILcd;)Z", line = 1327)
    public final boolean method515(int arg0, class64 arg1) {
        field1241++;
        if (arg1 == null) {
            return false;
        } else if (this.field1274 == arg1.field1274) {
            for (int var3 = 0; var3 < this.field1274; var3++) {
                byte var4 = this.field1252[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg1.field1252[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            if (arg0 != -64) {
                this.field1274 = 25;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)Lcd;", line = 1369)
    public final class64 method516(int arg0, int arg1) {
        if (arg0 <= 6) {
            return (class64) null;
        }
        field1232++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field1250) {
            this.field1249 = 0;
            if (this.field1252.length == this.field1274) {
                int var3;
                for (var3 = 1; var3 <= this.field1274; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class95.method721(this.field1252, 0, var4, 0, this.field1274);
                this.field1252 = var4;
            }
            this.field1252[this.field1274++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)Z", line = 1409)
    private final boolean method517(int arg0, boolean arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        field1285++;
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        if (!arg1) {
            this.field1249 = 110;
        }
        for (int var6 = 0; var6 < this.field1274; var6++) {
            int var7 = this.field1252[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                return false;
            }
            if (arg0 <= var7) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                return false;
            }
            var4 = true;
            var5 = var8;
        }
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)J", line = 1489)
    public final long method518(int arg0) {
        field1239++;
        long var2 = 0L;
        if (arg0 != -703251387) {
            field1233 = (class222) null;
        }
        for (int var4 = 0; var4 < this.field1274; var4++) {
            var2 = (var2 << 5) + (long) (this.field1252[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(BLcd;)Z", line = 1513)
    public final boolean method519(byte arg0, class64 arg1) {
        field1281++;
        if (arg1 == null) {
            return false;
        } else if (this.field1274 == arg1.field1274) {
            if (arg0 <= 119) {
                this.field1252 = (byte[]) null;
            }
            if (!this.field1250 || !arg1.field1250) {
                if (this.field1249 == 0) {
                    this.field1249 = this.method511((byte) 98);
                    if (this.field1249 == 0) {
                        this.field1249 = 1;
                    }
                }
                if (arg1.field1249 == 0) {
                    arg1.field1249 = arg1.method511((byte) 114);
                    if (arg1.field1249 == 0) {
                        arg1.field1249 = 1;
                    }
                }
                if (this.field1249 != arg1.field1249) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field1274; var3++) {
                if (this.field1252[var3] != arg1.field1252[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)Lcd;", line = 1565)
    public final class64 method520(boolean arg0) {
        field1276++;
        if (!arg0) {
            field1257 = (class64) null;
        }
        class64 var2 = new class64();
        var2.field1274 = this.field1274;
        var2.field1252 = new byte[this.field1274];
        byte var3 = 2;
        for (int var4 = 0; var4 < this.field1274; var4++) {
            byte var5 = this.field1252[var4];
            if (!(var5 < 97 || var5 > 122) || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var3 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var3 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var3 = 2;
            } else if (var5 != 32) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var2.field1252[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(IB)V", line = 1624)
    public final void method521(int arg0, byte arg1) {
        field1254++;
        if (arg1 <= 35) {
            this.field1252 = (byte[]) null;
        }
        this.field1249 = 0;
        if (!this.field1250) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 > this.field1252.length) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class95.method721(this.field1252, 0, var4, 0, this.field1274);
                this.field1252 = var4;
            }
            for (int var5 = this.field1274; var5 < arg0; var5++) {
                this.field1252[var5] = 32;
            }
            this.field1274 = arg0;
        }
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)Lcd;", line = 1674)
    public final class64 method522(int arg0) {
        field1275++;
        class64 var2 = new class64();
        var2.field1274 = this.field1274;
        var2.field1252 = new byte[this.field1274];
        if (arg0 != -41) {
            this.method541(-34, (class64) null);
        }
        for (int var3 = 0; var3 < this.field1274; var3++) {
            byte var4 = this.field1252[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field1252[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lcd;ILcd;)Lcd;", line = 1717)
    public final class64 method523(class64 arg0, int arg1, class64 arg2) {
        int var4 = arg1;
        int var5 = this.field1274;
        field1259++;
        int var6 = arg0.field1274 - arg2.field1274;
        while (true) {
            int var7 = this.method526(arg2, var4, arg1 - 119);
            if (var7 < 0) {
                int var8 = 0;
                class64 var9 = class156.method1128(1, var5);
                while (true) {
                    int var10 = this.method526(arg2, var8, -100);
                    if (var10 < 0) {
                        while (var8 < this.field1274) {
                            var9.method516(73, this.field1252[var8++] & 0xFF);
                        }
                        return var9;
                    }
                    while (var8 < var10) {
                        var9.method516(arg1 ^ 0x4A, this.field1252[var8++] & 0xFF);
                    }
                    var9.method502((byte) -123, arg0);
                    var8 += arg2.field1274;
                }
            }
            var4 = arg2.field1274 + var7;
            var5 += var6;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBI)Lcd;", line = 1770)
    public final class64 method524(int arg0, byte arg1, int arg2) {
        field1231++;
        class64 var4 = new class64();
        var4.field1274 = arg0 - arg2;
        var4.field1252 = new byte[arg0 - arg2];
        if (arg1 < 47) {
            this.method495(93, (byte) 56);
        }
        class95.method721(this.field1252, arg2, var4.field1252, 0, var4.field1274);
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(II)I", line = 1793)
    public final int method525(int arg0, int arg1) {
        field1235++;
        boolean var3 = false;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var4 = false;
        int var5 = 0;
        if (arg0 != 55) {
            return 17;
        }
        for (int var6 = 0; var6 < this.field1274; var6++) {
            int var7 = this.field1252[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (var7 >= arg1) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if ((var8 / arg1) != var5) {
                throw new NumberFormatException();
            }
            var5 = var8;
            var4 = true;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lcd;II)I", line = 1870)
    public final int method526(class64 arg0, int arg1, int arg2) {
        field1242++;
        int[] var4 = new int[256];
        int[] var5 = new int[arg0.field1274];
        int[] var6 = new int[arg0.field1274];
        for (int var7 = 0; var7 < var4.length; var7++) {
            var4[var7] = arg0.field1274;
        }
        for (int var8 = 1; var8 <= arg0.field1274; var8++) {
            var6[var8 - 1] = (arg0.field1274 << 1) - var8;
            var4[class224.method1614(arg0.field1252[var8 - 1], 255)] = arg0.field1274 - var8;
        }
        int var9 = arg0.field1274 + 1;
        int var10 = arg0.field1274;
        while (var10 > 0) {
            var5[var10 - 1] = var9;
            while (var9 <= arg0.field1274 && arg0.field1252[var9 - 1] != arg0.field1252[var10 - 1]) {
                if (var6[var9 - 1] >= arg0.field1274 - var10) {
                    var6[var9 - 1] = arg0.field1274 - var10;
                }
                var9 = var5[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = var9;
        int var12 = arg0.field1274 + 1 - var9;
        int var13 = 0;
        int var14 = 1;
        while (var12 >= var14) {
            var5[var14 - 1] = var13;
            while (var13 >= 1 && arg0.field1252[var13 - 1] != arg0.field1252[var14 - 1]) {
                var13 = var5[var13 - 1];
            }
            var14++;
            var13++;
        }
        if (arg2 >= -86) {
            method542(23, (byte) -67);
        }
        int var15 = 1;
        while (var11 < arg0.field1274) {
            for (int var16 = var15; var16 <= var11; var16++) {
                if ((arg0.field1274 - (var16 - var11)) <= var6[var16 - 1]) {
                    var6[var16 - 1] = arg0.field1274 + var11 - var16;
                }
            }
            var15 = var11 + 1;
            var11 = var11 + var12 - var5[var12 - 1];
            var12 = var5[var12 - 1];
        }
        int var18;
        for (int var17 = arg1 + arg0.field1274 - 1; var17 < this.field1274; var17 += Math.max(var4[this.field1252[var17] & 0xFF], var6[var18])) {
            for (var18 = arg0.field1274 - 1; var18 >= 0 && this.field1252[var17] == arg0.field1252[var18]; var18--) {
                var17--;
            }
            if (var18 == -1) {
                return var17 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "(B)V", line = 1980)
    public final void method527(byte arg0) {
        if (arg0 != 121) {
            return;
        }
        field1244++;
        String var2;
        try {
            var2 = new String(this.field1252, 0, this.field1274, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field1252, 0, this.field1274);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(IB)I", line = 2008)
    public final int method528(int arg0, byte arg1) {
        if (arg1 != 18) {
            field1257 = (class64) null;
        }
        byte var3 = (byte) arg0;
        field1253++;
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1274; var5++) {
            if (this.field1252[var5] == var3) {
                var4++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 2033)
    public final boolean equals(Object arg0) {
        field1234++;
        if (!arg0 instanceof class64) {
            throw new IllegalArgumentException();
        }
        return this.method519((byte) 125, (class64) arg0);
    }

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "(B)I", line = 2046)
    public final int method529(byte arg0) {
        field1243++;
        int var2 = -22 / ((-arg0) / 39);
        return this.method525(55, 10);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(ILjava/applet/Applet;)Ljava/lang/Object;", line = 2064)
    public final Object method530(int arg0, Applet arg1) throws Throwable {
        String var3 = new String(this.field1252, arg0, this.field1274);
        Object var4 = class90.method683(arg1, (Object[]) null, var3, -3189);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class292.method2015(0, var5, 0, var5.length);
        }
        field1226++;
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lcd;Z)Z", line = 2082)
    public final boolean method531(class64 arg0, boolean arg1) {
        field1270++;
        if (this.field1274 < arg0.field1274) {
            return false;
        }
        if (!arg1) {
            this.method505((byte) -25, (Applet) null);
        }
        int var3 = this.field1274 - arg0.field1274;
        for (int var4 = 0; var4 < arg0.field1274; var4++) {
            if (this.field1252[var3 + var4] != arg0.field1252[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI)Lcd;", line = 2121)
    public final class64 method532(boolean arg0, int arg1) {
        field1277++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class64 var3 = new class64();
        var3.field1252 = new byte[this.field1274 + 1];
        var3.field1274 = this.field1274 + 1;
        if (arg0) {
            this.method527((byte) -17);
        }
        class95.method721(this.field1252, 0, var3.field1252, 0, this.field1274);
        var3.field1252[this.field1274] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(ILcd;)Z", line = 2152)
    public final boolean method533(int arg0, class64 arg1) {
        if (arg0 != 32) {
            field1246 = 110;
        }
        field1238++;
        if (this.field1274 < arg1.field1274) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field1274; var3++) {
            byte var4 = this.field1252[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            byte var5 = arg1.field1252[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)Lcd;", line = 2198)
    public final class64 method534(int arg0) {
        field1225++;
        if (arg0 != -91) {
            this.field1274 = 90;
        }
        class64 var2 = class99.method734(true, this.method509(31492));
        return var2 == null ? class53.field875 : var2;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)Lcd;", line = 2223)
    public final class64 method535(boolean arg0) {
        long var2 = this.method518(-703251387);
        field1271++;
        synchronized (cd.class) {
            if (class205.field3506 == null) {
                class205.field3506 = new class159(4096);
            } else {
                for (class141 var5 = (class141) class205.field3506.method1151(var2, 0); var5 != null; var5 = (class141) class205.field3506.method1140((byte) 115)) {
                    if (this.method519((byte) 121, var5.field2482)) {
                        return var5.field2482;
                    }
                }
            }
            class141 var6 = new class141();
            this.field1250 = arg0;
            var6.field2482 = this;
            class205.field3506.method1149(var6, var2, -83);
            return this;
        }
    }

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)[B", line = 2260)
    public final byte[] method536(int arg0) {
        field1230++;
        byte[] var2 = new byte[this.field1274];
        class95.method721(this.field1252, arg0, var2, 0, this.field1274);
        return var2;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBII[B)I", line = 2276)
    public final int method537(int arg0, byte arg1, int arg2, int arg3, byte[] arg4) {
        class95.method721(this.field1252, arg2, arg4, arg0, arg3 - arg2);
        if (arg1 > -63) {
            this.field1249 = -35;
        }
        field1261++;
        return arg3 - arg2;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(III)I", line = 2294)
    public final int method538(int arg0, int arg1, int arg2) {
        if (arg0 != 19027) {
            this.method528(-58, (byte) -111);
        }
        field1265++;
        byte var4 = (byte) arg1;
        for (int var5 = arg2; var5 < this.field1274; var5++) {
            if (this.field1252[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)Ljava/net/URL;", line = 2328)
    public final URL method539(int arg0) throws MalformedURLException {
        field1269++;
        int var2 = 115 % ((arg0 - 69) / 33);
        return new URL(new String(this.field1252, 0, this.field1274));
    }

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "(I)I", line = 2338)
    public final int method540(int arg0) {
        if (arg0 != 28981) {
            this.field1250 = true;
        }
        field1262++;
        return this.field1274;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(ILcd;)Z", line = 2354)
    public final boolean method541(int arg0, class64 arg1) {
        field1267++;
        if (arg1.field1274 > this.field1274) {
            return false;
        } else if (arg0 == 13861) {
            for (int var3 = 0; var3 < arg1.field1274; var3++) {
                if (this.field1252[var3] != arg1.field1252[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(IB)Lmd;", line = 2388)
    public static final class240 method542(int arg0, byte arg1) {
        field1260++;
        if (arg1 < 85) {
            return (class240) null;
        } else if (arg0 == 0) {
            return new class156();
        } else if (arg0 == 1) {
            return new class153();
        } else if (arg0 == 2) {
            return new class161();
        } else if (arg0 == 3) {
            return new class189();
        } else if (arg0 == 4) {
            return new class264();
        } else if (arg0 == 5) {
            return new class126();
        } else if (arg0 == 6) {
            return new class281();
        } else if (arg0 == 7) {
            return new class263();
        } else if (arg0 == 8) {
            return new class273();
        } else if (arg0 == 9) {
            return new class36();
        } else if (arg0 == 10) {
            return new class298();
        } else if (arg0 == 11) {
            return new class283();
        } else if (arg0 == 12) {
            return new class288();
        } else if (arg0 == 13) {
            return new class228();
        } else if (arg0 == 14) {
            return new class196();
        } else if (arg0 == 15) {
            return new class107();
        } else if (arg0 == 16) {
            return new class3();
        } else if (arg0 == 17) {
            return new class230();
        } else if (arg0 == 18) {
            return new class128();
        } else if (arg0 == 19) {
            return new class35();
        } else if (arg0 == 20) {
            return new class76();
        } else if (arg0 == 21) {
            return new class236();
        } else if (arg0 == 22) {
            return new class93();
        } else if (arg0 == 23) {
            return new class118();
        } else if (arg0 == 24) {
            return new class138();
        } else if (arg0 == 25) {
            return new class224();
        } else if (arg0 == 26) {
            return new class125();
        } else if (arg0 == 27) {
            return new class265();
        } else if (arg0 == 28) {
            return new class269();
        } else if (arg0 == 29) {
            return new class200();
        } else if (arg0 == 30) {
            return new class47();
        } else if (arg0 == 31) {
            return new class94();
        } else if (arg0 == 32) {
            return new class96();
        } else if (arg0 == 33) {
            return new class109();
        } else if (arg0 == 34) {
            return new class131();
        } else if (arg0 == 35) {
            return new class314();
        } else if (arg0 == 36) {
            return new class146();
        } else if (arg0 == 37) {
            return new class233();
        } else if (arg0 == 38) {
            return new class169();
        } else if (arg0 == 39) {
            return new class143();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "hashCode", descriptor = "()I", line = 2712)
    public final int hashCode() {
        field1258++;
        return this.method511((byte) -94);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILam;IIIBI)Lam;", line = 2724)
    public static final class243 method543(int arg0, class243 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field1251++;
        long var7 = (long) arg4;
        class243 var9 = (class243) class141.field2487.method1194(var7, (byte) -61);
        if (var9 == null) {
            class150 var10 = class150.method1090(class19.field359, arg4, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1076(64, 768, -50, -10, -50);
            class141.field2487.method1190(12669, var9, var7);
        }
        int var11 = -74 / ((2 - arg5) / 59);
        int var12 = arg1.method39();
        int var13 = arg1.method19();
        int var14 = arg1.method55();
        int var15 = arg1.method30();
        class243 var16 = var9.method24(true, true);
        if (arg2 != 0) {
            var16.method27(arg2);
        }
        if (class123.field2216) {
            class217 var19 = (class217) var16;
            if (arg3 != class15.method169(arg0 + var14, 13257, class20.field364, arg6 + var12) || class15.method169(arg0 + var15, 13257, class20.field364, arg6 + var13) != arg3) {
                for (int var20 = 0; var20 < var19.field3634; var20++) {
                    var19.field3656[var20] += class15.method169(var19.field3669[var20] + arg0, 13257, class20.field364, var19.field3664[var20] + arg6) - arg3;
                }
                var19.field3648.field793 = false;
                var19.field3639.field613 = false;
            }
        } else {
            class5 var17 = (class5) var16;
            if (class15.method169(arg0 + var14, 13257, class20.field364, arg6 + var12) != arg3 || class15.method169(arg0 + var15, 13257, class20.field364, arg6 + var13) != arg3) {
                for (int var18 = 0; var18 < var17.field73; var18++) {
                    var17.field54[var18] += class15.method169(var17.field45[var18] + arg0, 13257, class20.field364, var17.field53[var18] + arg6) - arg3;
                }
                var17.field70 = false;
            }
        }
        return var16;
    }
}
