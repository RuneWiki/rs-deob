import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class14 extends class129 {

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "[I")
    private int[] field315 = new int[16];

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "[[Lod;")
    private class101[][] field302 = new class101[16][128];

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "[I")
    private int[] field305 = new int[16];

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "[I")
    private int[] field313 = new int[16];

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "[I")
    public int[] field306 = new int[16];

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "[I")
    private int[] field299 = new int[16];

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "[I")
    private int[] field316 = new int[16];

    @OriginalMember(owner = "client!bf", name = "nb", descriptor = "I")
    private int field335 = 256;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "[I")
    private int[] field314 = new int[16];

    @OriginalMember(owner = "client!bf", name = "mb", descriptor = "[I")
    private int[] field334 = new int[16];

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "[I")
    public int[] field321 = new int[16];

    @OriginalMember(owner = "client!bf", name = "Bb", descriptor = "[I")
    private int[] field349 = new int[16];

    @OriginalMember(owner = "client!bf", name = "Eb", descriptor = "[[Lod;")
    private class101[][] field352 = new class101[16][128];

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "[I")
    private int[] field309 = new int[16];

    @OriginalMember(owner = "client!bf", name = "Lb", descriptor = "I")
    private int field359 = 1000000;

    @OriginalMember(owner = "client!bf", name = "zb", descriptor = "[I")
    public int[] field347 = new int[16];

    @OriginalMember(owner = "client!bf", name = "Qb", descriptor = "[I")
    private int[] field364 = new int[16];

    @OriginalMember(owner = "client!bf", name = "Nb", descriptor = "[I")
    private int[] field361 = new int[16];

    @OriginalMember(owner = "client!bf", name = "Vb", descriptor = "[I")
    private int[] field369 = new int[16];

    @OriginalMember(owner = "client!bf", name = "lb", descriptor = "Lfb;")
    private class38 field333 = new class38();

    @OriginalMember(owner = "client!bf", name = "ac", descriptor = "Lhe;")
    private class54 field374 = new class54(this);

    @OriginalMember(owner = "client!bf", name = "pb", descriptor = "Lef;")
    private class35 field337 = new class35(128);

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "[I")
    public static int[] field300 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "Lr;")
    private static class118 field296 = class153.method1136(122, "wishes to trade with you)3");

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "Lr;")
    public static class118 field304 = field296;

    @OriginalMember(owner = "client!bf", name = "ab", descriptor = "Lr;")
    private static class118 field322 = class153.method1136(120, "Connection lost)3");

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "I")
    public static int field317 = 0;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "Lr;")
    public static class118 field312 = class153.method1136(108, "mapback");

    @OriginalMember(owner = "client!bf", name = "Gb", descriptor = "Lr;")
    public static class118 field354 = class153.method1136(87, "sch-Utteln:");

    @OriginalMember(owner = "client!bf", name = "sb", descriptor = "I")
    public static int field340 = 0;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public static int field298 = 0;

    @OriginalMember(owner = "client!bf", name = "Ob", descriptor = "Lr;")
    private static class118 field362 = class153.method1136(86, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!bf", name = "jb", descriptor = "Lr;")
    public static class118 field331 = field322;

    @OriginalMember(owner = "client!bf", name = "Cb", descriptor = "Lr;")
    public static class118 field350 = class153.method1136(105, "hitmarks");

    @OriginalMember(owner = "client!bf", name = "eb", descriptor = "Lr;")
    public static class118 field326 = field362;

    @OriginalMember(owner = "client!bf", name = "yb", descriptor = "Lr;")
    public static class118 field346 = class153.method1136(117, ")4slr)3ws?order=LPWM");

    @OriginalMember(owner = "client!bf", name = "Ab", descriptor = "[I")
    public static int[] field348 = new int[5];

    @OriginalMember(owner = "client!bf", name = "Zb", descriptor = "Lr;")
    private static class118 field373 = class153.method1136(109, "Login");

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "Lr;")
    public static class118 field301 = field373;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!bf", name = "Y", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!bf", name = "bb", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!bf", name = "cb", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!bf", name = "db", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!bf", name = "fb", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!bf", name = "gb", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!bf", name = "hb", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!bf", name = "ib", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!bf", name = "kb", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!bf", name = "ob", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!bf", name = "qb", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!bf", name = "rb", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!bf", name = "tb", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!bf", name = "ub", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!bf", name = "vb", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!bf", name = "wb", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!bf", name = "xb", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!bf", name = "Db", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!bf", name = "Fb", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!bf", name = "Hb", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!bf", name = "Ib", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!bf", name = "Jb", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!bf", name = "Kb", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!bf", name = "Mb", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!bf", name = "Pb", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!bf", name = "Rb", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!bf", name = "Sb", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!bf", name = "Tb", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!bf", name = "Ub", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!bf", name = "Wb", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!bf", name = "Xb", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!bf", name = "Yb", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!bf", name = "bc", descriptor = "I")
    private int field375;

    @OriginalMember(owner = "client!bf", name = "dc", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!bf", name = "gc", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client!bf", name = "cc", descriptor = "J")
    private long field376;

    @OriginalMember(owner = "client!bf", name = "ec", descriptor = "J")
    private long field378;

    @OriginalMember(owner = "client!bf", name = "fc", descriptor = "Z")
    private boolean field379;

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "[Ln;")
    public static class90[] field319;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)V")
    private final void method93(int arg0, int arg1) {
        for (class101 var3 = (class101) this.field374.field1288.method889(124); var3 != null; var3 = (class101) this.field374.field1288.method884(true)) {
            if (arg0 < 0 || var3.field2313 == arg0) {
                if (var3.field2316 != null) {
                    var3.field2316.method440(class85.field2084 / 100);
                    if (var3.field2316.method450()) {
                        this.field374.field1297.method759(var3.field2316);
                    }
                    var3.method778(0);
                }
                if (var3.field2321 < 0) {
                    this.field302[var3.field2313][var3.field2324] = null;
                }
                var3.method768(-1);
            }
        }
        if (arg1 != 0) {
            this.method133();
        }
        field355++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)V")
    private final void method94(byte arg0, int arg1) {
        if ((this.field306[arg1] & 0x4) != 0) {
            for (class101 var3 = (class101) this.field374.field1288.method889(-98); var3 != null; var3 = (class101) this.field374.field1288.method884(true)) {
                if (var3.field2313 == arg1) {
                    var3.field2338 = 0;
                }
            }
        }
        int var4 = -71 % ((-arg0 - 30) / 53);
        field303++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lpe;ZB)V")
    public final synchronized void method95(class109 arg0, boolean arg1, byte arg2) {
        this.method108(-27);
        this.field333.method315(arg0.field2533);
        field357++;
        this.field376 = 0L;
        this.field379 = arg1;
        int var4 = this.field333.method310();
        for (int var5 = 0; var5 < var4; var5++) {
            this.field333.method320(var5);
            this.field333.method316(var5);
            this.field333.method321(var5);
        }
        if (arg2 >= -42) {
            field322 = null;
        }
        this.field375 = this.field333.method317();
        this.field380 = this.field333.field934[this.field375];
        this.field378 = this.field333.method322(this.field380);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILod;[II)Z")
    public final boolean method96(int arg0, int arg1, class101 arg2, int[] arg3, int arg4) {
        field344++;
        arg2.field2344 = class85.field2084 / 100;
        if (arg2.field2321 >= 0 && (arg2.field2316 == null || arg2.field2316.method414())) {
            arg2.method778(0);
            arg2.method768(-1);
            if (arg2.field2318 > 0 && this.field352[arg2.field2313][arg2.field2318] == arg2) {
                this.field352[arg2.field2313][arg2.field2318] = null;
            }
            return true;
        }
        if (arg0 != -30999) {
            field362 = null;
        }
        int var6 = arg2.field2314;
        boolean var7 = false;
        if (var6 > 0) {
            int var8 = var6 - (int) (Math.pow(2.0D, (double) this.field361[arg2.field2313] * 4.921259842519685E-4D) * 16.0D + 0.5D);
            if (var8 < 0) {
                var8 = 0;
            }
            arg2.field2314 = var8;
        }
        arg2.field2316.method445(this.method121(arg2, arg0 ^ 0xFFFF8697));
        class92 var9 = arg2.field2327;
        arg2.field2326 += var9.field2199;
        double var10 = (double) ((arg2.field2324 - 60 << 8) + (arg2.field2319 * arg2.field2314 >> 12)) * 5.086263020833333E-6D;
        arg2.field2328++;
        if (var9.field2206 > 0) {
            if (var9.field2198 <= 0) {
                arg2.field2334 += 128;
            } else {
                arg2.field2334 += (int) (Math.pow(2.0D, (double) var9.field2198 * var10) * 128.0D + 0.5D);
            }
            if (arg2.field2334 * var9.field2206 >= 819200) {
                var7 = true;
            }
        }
        if (var9.field2191 != null) {
            if (var9.field2196 > 0) {
                arg2.field2323 += (int) (Math.pow(2.0D, (double) var9.field2196 * var10) * 128.0D + 0.5D);
            } else {
                arg2.field2323 += 128;
            }
            while (var9.field2191.length - 2 > arg2.field2320 && arg2.field2323 > (var9.field2191[arg2.field2320 + 2] & 0xFF) << 8) {
                arg2.field2320 += 2;
            }
            if (var9.field2191.length - 2 == arg2.field2320 && var9.field2191[arg2.field2320 + 1] == 0) {
                var7 = true;
            }
        }
        if (arg2.field2321 >= 0 && var9.field2190 != null && (this.field306[arg2.field2313] & 0x1) == 0 && (arg2.field2318 < 0 || this.field352[arg2.field2313][arg2.field2318] != arg2)) {
            if (var9.field2202 <= 0) {
                arg2.field2321 += 128;
            } else {
                arg2.field2321 += (int) (Math.pow(2.0D, (double) var9.field2202 * var10) * 128.0D + 0.5D);
            }
            while (arg2.field2343 < var9.field2190.length - 2 && arg2.field2321 > (var9.field2190[arg2.field2343 + 2] & 0xFF) << 8) {
                arg2.field2343 += 2;
            }
            if (var9.field2190.length - 2 == arg2.field2343) {
                var7 = true;
            }
        }
        if (!var7) {
            arg2.field2316.method434(arg2.field2344, this.method111(-4699, arg2), this.method126(arg2, (byte) -108));
            return false;
        }
        arg2.field2316.method440(arg2.field2344);
        if (arg3 == null) {
            arg2.field2316.method114(arg1);
        } else {
            arg2.field2316.method132(arg3, arg4, arg1);
        }
        if (arg2.field2316.method450()) {
            this.field374.field1297.method759(arg2.field2316);
        }
        arg2.method778(0);
        if (arg2.field2321 >= 0) {
            arg2.method768(arg0 + 30998);
            if (arg2.field2318 > 0 && this.field352[arg2.field2313][arg2.field2318] == arg2) {
                this.field352[arg2.field2313][arg2.field2318] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    public static void method97(boolean arg0) {
        field354 = null;
        field296 = null;
        field348 = null;
        field346 = null;
        field312 = null;
        field301 = null;
        field304 = null;
        field300 = null;
        field319 = null;
        field331 = null;
        field350 = null;
        field322 = null;
        field326 = null;
        field373 = null;
        if (!arg0) {
            field362 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method98(int arg0, Throwable arg1) throws IOException {
        field308++;
        if (arg0 != -1) {
            field360 = -33;
        }
        String var3;
        if (arg1 instanceof class62) {
            class62 var2 = (class62) arg1;
            var3 = var2.field1431 + " | ";
            arg1 = var2.field1436;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
    private final void method99(int arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            field358++;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)V")
    private final void method100(int arg0, int arg1, int arg2, int arg3) {
        this.method118((byte) 119, 64, arg0, arg3);
        field368++;
        if ((this.field306[arg0] & 0x2) != 0) {
            for (class101 var5 = (class101) this.field374.field1288.method886(-93); var5 != null; var5 = (class101) this.field374.field1288.method879((byte) -96)) {
                if (var5.field2313 == arg0 && var5.field2321 < 0) {
                    this.field302[arg0][var5.field2324] = null;
                    this.field302[arg0][arg3] = var5;
                    int var6 = (var5.field2319 * var5.field2314 >> 12) + var5.field2340;
                    var5.field2314 = 4096;
                    var5.field2340 += arg3 - var5.field2324 << 8;
                    var5.field2319 = var6 - var5.field2340;
                    var5.field2324 = arg3;
                    return;
                }
            }
        }
        class70 var7 = (class70) this.field337.method297((long) this.field313[arg0], -1);
        if (var7 == null) {
            return;
        }
        class117 var8 = var7.field1628[arg3];
        if (var8 == null) {
            return;
        }
        class101 var9 = new class101();
        var9.field2342 = var7;
        var9.field2331 = var8;
        var9.field2313 = arg0;
        var9.field2327 = var7.field1638[arg3];
        var9.field2318 = var7.field1626[arg3];
        var9.field2324 = arg3;
        var9.field2335 = var7.field1621[arg3] * var7.field1619 * arg1 * arg1 + 1024 >> 11;
        var9.field2317 = var7.field1639[arg3] & 0xFF;
        var9.field2340 = (arg3 << 8) - (var7.field1637[arg3] & 0x7FFF);
        var9.field2321 = -1;
        var9.field2323 = 0;
        var9.field2320 = 0;
        var9.field2343 = 0;
        var9.field2334 = 0;
        if (this.field347[arg0] == arg2) {
            var9.field2316 = class50.method453(var8, this.method121(var9, 89), this.method111(-4699, var9), this.method126(var9, (byte) -108));
        } else {
            var9.field2316 = class50.method453(var8, this.method121(var9, 124), 0, this.method126(var9, (byte) -108));
            this.method128(var9, var7.field1637[arg3] < 0, -1);
        }
        if (var7.field1637[arg3] < 0) {
            var9.field2316.method448(-1);
        }
        if (var9.field2318 >= 0) {
            class101 var10 = this.field352[arg0][var9.field2318];
            if (var10 != null && var10.field2321 < 0) {
                this.field302[arg0][var10.field2324] = null;
                var10.field2321 = 0;
            }
            this.field352[arg0][var9.field2318] = var9;
        }
        this.field374.field1288.method883(var9, arg2 ^ 0xFFFF970E);
        this.field302[arg0][arg3] = var9;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)Z")
    public static final boolean method101(int arg0, int arg1) {
        if (arg0 == 0) {
            field330++;
            return (arg1 >> 21 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "()Lsd;")
    public final synchronized class129 method102() {
        field297++;
        return null;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(II)V")
    private final void method103(int arg0, int arg1) {
        field320++;
        if (arg1 < 0) {
            for (int var3 = 0; var3 < 16; var3++) {
                this.method103(12800, var3);
            }
            return;
        }
        this.field364[arg1] = arg0;
        this.field334[arg1] = 8192;
        this.field369[arg1] = 16383;
        this.field305[arg1] = 8192;
        this.field315[arg1] = 0;
        this.field361[arg1] = 8192;
        this.method130(arg1, false);
        this.method94((byte) -84, arg1);
        this.field306[arg1] = 0;
        this.field316[arg1] = 32767;
        this.field349[arg1] = 256;
        this.field347[arg1] = 0;
        this.method105(-21952, 8192, arg1);
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)Z")
    public final synchronized boolean method104(byte arg0) {
        if (arg0 != 26) {
            this.method121(null, -121);
        }
        field329++;
        return this.field333.method323();
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V")
    private final void method105(int arg0, int arg1, int arg2) {
        if (arg0 != -21952) {
            field304 = null;
        }
        this.field314[arg2] = arg1;
        field365++;
        this.field321[arg2] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
    public static final void method106(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class10 var5 = (class10) class132.field3011.method889(-81); var5 != null; var5 = (class10) class132.field3011.method884(true)) {
            if (var5.field232 != -1 || var5.field219 != null) {
                int var6 = 0;
                if (var5.field245 < arg4) {
                    var6 += arg4 - var5.field245;
                } else if (var5.field235 > arg4) {
                    var6 += var5.field235 - arg4;
                }
                if (var5.field234 < arg2) {
                    var6 += arg2 - var5.field234;
                } else if (var5.field240 > arg2) {
                    var6 += var5.field240 - arg2;
                }
                if (var5.field242 < var6 - 64 || class91.field2178 == 0 || var5.field222 != arg3) {
                    if (var5.field244 != null) {
                        class94.field2239.method765(var5.field244);
                        var5.field244 = null;
                    }
                    if (var5.field231 != null) {
                        class94.field2239.method765(var5.field231);
                        var5.field231 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field242 - var6) * class91.field2178 / var5.field242;
                    if (var5.field244 != null) {
                        var5.field244.method427(var7);
                    } else if (var5.field232 >= 0) {
                        class96 var8 = class96.method752(class91.field2189, var5.field232, 0);
                        if (var8 != null) {
                            class117 var9 = var8.method753().method902(class136.field3090);
                            class50 var10 = class50.method449(var9, 100, var7);
                            var10.method448(-1);
                            class94.field2239.method759(var10);
                            var5.field244 = var10;
                        }
                    }
                    if (var5.field231 != null) {
                        var5.field231.method427(var7);
                        if (!var5.field231.method766((byte) -65)) {
                            var5.field231 = null;
                        }
                    } else if (var5.field219 != null && (var5.field236 -= arg0) <= 0) {
                        int var11 = (int) ((double) var5.field219.length * Math.random());
                        class96 var12 = class96.method752(class91.field2189, var5.field219[var11], 0);
                        if (var12 != null) {
                            class117 var13 = var12.method753().method902(class136.field3090);
                            class50 var14 = class50.method449(var13, 100, var7);
                            var14.method448(0);
                            class94.field2239.method759(var14);
                            var5.field236 = (int) ((double) (var5.field223 - var5.field229) * Math.random()) + var5.field229;
                            var5.field231 = var14;
                        }
                    }
                }
            }
        }
        if (arg1 >= -69) {
            method123(22L, false);
        }
        field342++;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(III)V")
    private final void method107(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.method95(null, true, (byte) 37);
        }
        field327++;
        if (this.field313[arg2] != arg1) {
            this.field313[arg2] = arg1;
            for (int var4 = 0; var4 < 128; var4++) {
                this.field352[arg2][var4] = null;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
    public final synchronized void method108(int arg0) {
        this.field333.method311();
        int var2 = 22 % ((arg0 - 70) / 53);
        this.method127((byte) -124);
        field339++;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
    private final void method109(int arg0) {
        field295++;
        int var2 = this.field375;
        int var3 = this.field380;
        long var4 = this.field378;
        while (this.field380 == var3) {
            while (this.field333.field934[var2] == var3) {
                this.field333.method320(var2);
                int var6 = this.field333.method314(var2);
                if (var6 == 1) {
                    this.field333.method312();
                    this.field333.method321(var2);
                    if (this.field333.method309()) {
                        if (!this.field379 || var3 == 0) {
                            this.method127((byte) -125);
                            this.field333.method311();
                            return;
                        }
                        this.field333.method313(var4);
                    }
                    break;
                }
                if ((var6 & 0x80) != 0) {
                    this.method112(var6, 224);
                }
                this.field333.method316(var2);
                this.field333.method321(var2);
            }
            var2 = this.field333.method317();
            var3 = this.field333.field934[var2];
            var4 = this.field333.method322(var3);
        }
        this.field378 = var4;
        this.field380 = var3;
        this.field375 = var2;
        if (arg0 != 20583) {
            this.method132(null, 71, -30);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIB)V")
    private final void method110(int arg0, int arg1, int arg2, byte arg3) {
        field367++;
        if (arg3 > -13) {
            this.method120(117, null, false, null, null);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILod;)I")
    private final int method111(int arg0, class101 arg1) {
        class92 var3 = arg1.field2327;
        field356++;
        int var4 = this.field369[arg1.field2313] * this.field364[arg1.field2313] + 4096 >> 13;
        int var5 = var4 * var4 + 16384 >> 15;
        int var6 = arg1.field2335 * var5 + 16384 >> 15;
        int var7 = this.field335 * var6 + 128 >> 8;
        if (var3.field2206 > 0) {
            var7 = (int) ((double) var7 * Math.pow(0.5D, (double) arg1.field2334 * 1.953125E-5D * (double) var3.field2206) + 0.5D);
        }
        if (var3.field2191 != null) {
            int var8 = var3.field2191[arg1.field2320 + 1];
            int var9 = arg1.field2323;
            if (arg1.field2320 < var3.field2191.length - 2) {
                int var10 = (var3.field2191[arg1.field2320 + 2] & 0xFF) << 8;
                int var11 = (var3.field2191[arg1.field2320] & 0xFF) << 8;
                var8 += (var9 - var11) * (var3.field2191[arg1.field2320 + 3] - var8) / (var10 - var11);
            }
            var7 = var7 * var8 + 32 >> 6;
        }
        if (arg1.field2321 > 0 && var3.field2190 != null) {
            int var12 = arg1.field2321;
            int var13 = var3.field2190[arg1.field2343 + 1];
            if (arg1.field2343 < var3.field2190.length - 2) {
                int var14 = (var3.field2190[arg1.field2343] & 0xFF) << 8;
                int var15 = (var3.field2190[arg1.field2343 + 2] & 0xFF) << 8;
                var13 += (var3.field2190[arg1.field2343 + 3] - var13) * (var12 - var14) / (var15 - var14);
            }
            var7 = var7 * var13 + 32 >> 6;
        }
        return arg0 == -4699 ? var7 : 7;
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(II)V")
    private final void method112(int arg0, int arg1) {
        int var3 = arg0 & 0xF0;
        field343++;
        if (var3 == 128) {
            int var4 = arg0 >> 16 & 0x7F;
            int var5 = arg0 & 0xF;
            int var6 = arg0 >> 8 & 0x7F;
            this.method118((byte) -127, var4, var5, var6);
        } else if (var3 == 144) {
            int var7 = arg0 & 0xF;
            int var8 = arg0 >> 8 & 0x7F;
            int var9 = arg0 >> 16 & 0x7F;
            if (var9 > 0) {
                this.method100(var7, var9, 0, var8);
            } else {
                this.method118((byte) 116, 64, var7, var8);
            }
        } else if (var3 == 160) {
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 & 0xF;
            int var12 = arg0 >> 16 & 0x7F;
            this.method110(var10, var11, var12, (byte) -55);
        } else if (var3 == 176) {
            int var13 = arg0 & 0xF;
            int var14 = arg0 >> 8 & 0x7F;
            int var15 = arg0 >> 16 & 0x7F;
            if (var14 == 0) {
                this.field309[var13] = class79.method669(this.field309[var13], -2080769) + (var15 << 14);
            }
            if (var14 == 32) {
                this.field309[var13] = class79.method669(this.field309[var13], -16257) + (var15 << 7);
            }
            if (var14 == 1) {
                this.field315[var13] = (var15 << 7) + class79.method669(this.field315[var13], -16257);
            }
            if (var14 == 33) {
                this.field315[var13] = var15 + class79.method669(this.field315[var13], -128);
            }
            if (var14 == 5) {
                this.field361[var13] = class79.method669(-16257, this.field361[var13]) + (var15 << 7);
            }
            if (var14 == 37) {
                this.field361[var13] = var15 + class79.method669(this.field361[var13], -128);
            }
            if (var14 == 7) {
                this.field364[var13] = class79.method669(-16257, this.field364[var13]) + (var15 << 7);
            }
            if (var14 == 39) {
                this.field364[var13] = class79.method669(-128, this.field364[var13]) + var15;
            }
            if (var14 == 10) {
                this.field334[var13] = (var15 << 7) + class79.method669(-16257, this.field334[var13]);
            }
            if (var14 == 42) {
                this.field334[var13] = var15 + class79.method669(-128, this.field334[var13]);
            }
            if (var14 == 11) {
                this.field369[var13] = class79.method669(-16257, this.field369[var13]) + (var15 << 7);
            }
            if (var14 == 43) {
                this.field369[var13] = class79.method669(this.field369[var13], -128) + var15;
            }
            if (var14 == 64) {
                if (var15 < 64) {
                    this.field306[var13] = class79.method669(this.field306[var13], -2);
                } else {
                    this.field306[var13] = class19.method178(this.field306[var13], 1);
                }
            }
            if (var14 == 65) {
                if (var15 < 64) {
                    this.method130(var13, false);
                    this.field306[var13] = class79.method669(this.field306[var13], -3);
                } else {
                    this.field306[var13] = class19.method178(this.field306[var13], 2);
                }
            }
            if (var14 == 99) {
                this.field316[var13] = class79.method669(this.field316[var13], 127) + (var15 << 7);
            }
            if (var14 == 98) {
                this.field316[var13] = class79.method669(16256, this.field316[var13]) + var15;
            }
            if (var14 == 101) {
                this.field316[var13] = (var15 << 7) + class79.method669(this.field316[var13], 127) + 16384;
            }
            if (var14 == 100) {
                this.field316[var13] = var15 + class79.method669(16256, this.field316[var13]) + 16384;
            }
            if (var14 == 120) {
                this.method93(var13, 0);
            }
            if (var14 == 121) {
                this.method103(12800, var13);
            }
            if (var14 == 123) {
                this.method116(var13, (byte) 123);
            }
            if (var14 == 6) {
                int var16 = this.field316[var13];
                if (var16 == 16384) {
                    this.field349[var13] = (var15 << 7) + class79.method669(-16257, this.field349[var13]);
                }
            }
            if (var14 == 38) {
                int var17 = this.field316[var13];
                if (var17 == 16384) {
                    this.field349[var13] = class79.method669(this.field349[var13], -128) + var15;
                }
            }
            if (var14 == 16) {
                this.field347[var13] = class79.method669(this.field347[var13], -16257) + (var15 << 7);
            }
            if (var14 == 48) {
                this.field347[var13] = var15 + class79.method669(-128, this.field347[var13]);
            }
            if (var14 == 81) {
                if (var15 >= 64) {
                    this.field306[var13] = class19.method178(this.field306[var13], 4);
                } else {
                    this.method94((byte) -115, var13);
                    this.field306[var13] = class79.method669(this.field306[var13], -5);
                }
            }
            if (var14 == 17) {
                this.method105(arg1 ^ 0xFFFFAAA0, (var15 << 7) + (this.field314[var13] & 0xFFFFC07F), var13);
            }
            if (var14 == 49) {
                this.method105(-21952, (this.field314[var13] & -128) + var15, var13);
            }
        } else if (var3 == 192) {
            int var18 = arg0 & 0xF;
            int var19 = arg0 >> 8 & 0x7F;
            this.method107(arg1 ^ 0xE0, this.field309[var18] + var19, var18);
        } else if (var3 == 208) {
            int var20 = arg0 & 0xF;
            int var21 = arg0 >> 8 & 0x7F;
            this.method99(var20, 1, var21);
        } else if (arg1 == var3) {
            int var22 = arg0 & 0xF;
            int var23 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method131(var22, -107, var23);
        } else {
            int var24 = arg0 & 0xFF;
            if (var24 == 255) {
                this.method127((byte) -110);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)V")
    public final synchronized void method113(int arg0, byte arg1) {
        if (arg1 != -20) {
            field296 = null;
        }
        this.field335 = arg0;
        field363++;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
    public final synchronized void method114(int arg0) {
        if (this.field333.method323()) {
            int var2 = this.field333.field935 * this.field359 / class85.field2084;
            do {
                long var3 = this.field376 + (long) arg0 * (long) var2;
                if (this.field378 - var3 >= 0L) {
                    this.field376 = var3;
                    break;
                }
                int var5 = (int) (((long) var2 + this.field378 - this.field376 - 1L) / (long) var2);
                arg0 -= var5;
                this.field376 += (long) var2 * (long) var5;
                this.field374.method114(var5);
                this.method109(20583);
            } while (this.field333.method323());
        }
        this.field374.method114(arg0);
        field345++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBI)V")
    private final void method115(int arg0, byte arg1, int arg2) {
        this.field299[arg0] = arg2;
        this.field309[arg0] = class79.method669(-128, arg2);
        this.method107(0, arg2, arg0);
        field353++;
        if (arg1 <= 126) {
            field326 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IB)V")
    private final void method116(int arg0, byte arg1) {
        field336++;
        int var3 = 43 % (arg1 / 54);
        for (class101 var4 = (class101) this.field374.field1288.method889(124); var4 != null; var4 = (class101) this.field374.field1288.method884(true)) {
            if ((arg0 < 0 || var4.field2313 == arg0) && var4.field2321 < 0) {
                this.field302[var4.field2313][var4.field2324] = null;
                var4.field2321 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lod;I)Z")
    public final boolean method117(class101 arg0, int arg1) {
        field377++;
        if (arg1 >= -97) {
            method97(false);
        }
        if (arg0.field2316 != null) {
            return false;
        }
        if (arg0.field2321 >= 0) {
            arg0.method768(-1);
            if (arg0.field2318 > 0 && this.field352[arg0.field2313][arg0.field2318] == arg0) {
                this.field352[arg0.field2313][arg0.field2318] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BIII)V")
    private final void method118(byte arg0, int arg1, int arg2, int arg3) {
        field318++;
        class101 var5 = this.field302[arg2][arg3];
        if (var5 == null) {
            return;
        }
        int var6 = 124 % ((arg0 - 10) / 35);
        this.field302[arg2][arg3] = null;
        if ((this.field306[arg2] & 0x2) == 0) {
            var5.field2321 = 0;
            return;
        }
        for (class101 var7 = (class101) this.field374.field1288.method889(-96); var7 != null; var7 = (class101) this.field374.field1288.method884(true)) {
            if (var5.field2313 == var7.field2313 && var7.field2321 < 0 && var5 != var7) {
                var5.field2321 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BII)V")
    public final synchronized void method119(byte arg0, int arg1, int arg2) {
        this.method115(arg2, (byte) 127, arg1);
        int var4 = 43 % ((arg0 - 21) / 44);
        field371++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILff;ZLs;Lpe;)Z")
    public final synchronized boolean method120(int arg0, class42 arg1, boolean arg2, class125 arg3, class109 arg4) {
        arg4.method863();
        field332++;
        boolean var6 = true;
        int[] var7 = null;
        if (arg0 > 0) {
            var7 = new int[] { arg0 };
        }
        class25 var8 = (class25) arg4.field2532.method296(0);
        if (arg2) {
            return true;
        }
        while (var8 != null) {
            label30: {
                int var9 = (int) var8.field2295;
                class70 var10 = (class70) this.field337.method297((long) var9, -1);
                if (var10 == null) {
                    var10 = class91.method727(var9, 18741, arg1);
                    if (var10 == null) {
                        var6 = false;
                        break label30;
                    }
                    this.field337.method288(var10, (long) var9, (byte) -91);
                }
                if (!var10.method594(-56, var8.field620, arg3, var7)) {
                    var6 = false;
                }
            }
            var8 = (class25) arg4.field2532.method290(-1);
        }
        if (var6) {
            arg4.method862();
        }
        return var6;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Lod;I)I")
    private final int method121(class101 arg0, int arg1) {
        int var3 = (arg0.field2319 * arg0.field2314 >> 12) + arg0.field2340;
        field370++;
        class92 var4 = arg0.field2327;
        if (arg1 <= 85) {
            field296 = null;
        }
        int var5 = ((this.field305[arg0.field2313] - 8192) * this.field349[arg0.field2313] >> 12) + var3;
        if (var4.field2199 > 0 && (var4.field2211 > 0 || this.field315[arg0.field2313] > 0)) {
            int var6 = var4.field2211 << 2;
            int var7 = var4.field2201 << 1;
            if (var7 > arg0.field2328) {
                var6 = arg0.field2328 * var6 / var7;
            }
            int var8 = (this.field315[arg0.field2313] >> 7) + var6;
            double var9 = Math.sin((double) (arg0.field2326 & 0x1FF) * 0.01227184630308513D);
            var5 += (int) ((double) var8 * var9);
        }
        int var11 = (int) ((double) (arg0.field2331.field2714 * 256) * Math.pow(2.0D, (double) var5 * 3.255208333333333E-4D) / (double) class85.field2084 + 0.5D);
        return var11 < 1 ? 1 : var11;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "()Lsd;")
    public final synchronized class129 method122() {
        field351++;
        return this.field374;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(JZ)V")
    public static final void method123(long arg0, boolean arg1) {
        field310++;
        if (arg0 == 0L) {
            return;
        }
        if (class51.field1214 >= 100 && class44.field1053 != 1 || class51.field1214 >= 200) {
            class103.method786(class110.field2567, class54.field1284, 0, (byte) -127);
            return;
        }
        class118 var3 = class131.method1014(arg0, -119).method903(38);
        if (arg1) {
            method97(true);
        }
        for (int var4 = 0; var4 < class51.field1214; var4++) {
            if (class77.field1877[var4] == arg0) {
                class103.method786(class110.field2567, class144.method1066(true, new class118[] { var3, class146.field3253 }), 0, (byte) -127);
                return;
            }
        }
        for (int var5 = 0; var5 < class134.field3055; var5++) {
            if (class75.field1848[var5] == arg0) {
                class103.method786(class110.field2567, class144.method1066(true, new class118[] { class97.field2273, var3, class59.field1362 }), 0, (byte) -126);
                return;
            }
        }
        if (var3.method938((byte) 39, class89.field2150.field2996)) {
            class103.method786(class110.field2567, class82.field1979, 0, (byte) -126);
            return;
        }
        class1.field24[class51.field1214] = var3;
        class66.field1506++;
        class77.field1877[class51.field1214] = arg0;
        class128.field2923[class51.field1214] = 0;
        class114.field2664[class51.field1214] = 0;
        class108.field2517 = class73.field1691;
        class51.field1214++;
        class1.field22.method722(98, (byte) 58);
        class1.field22.method824(arg0, !arg1);
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
    public final synchronized void method124(int arg0) {
        if (arg0 >= -100) {
            field319 = null;
        }
        for (class70 var2 = (class70) this.field337.method296(0); var2 != null; var2 = (class70) this.field337.method290(-1)) {
            var2.method596(116);
        }
        field338++;
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)I")
    public final int method125(int arg0) {
        field372++;
        if (arg0 != -1) {
            field312 = null;
        }
        return this.field335;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lod;B)I")
    private final int method126(class101 arg0, byte arg1) {
        if (arg1 == -108) {
            field328++;
            int var3 = this.field334[arg0.field2313];
            return var3 >= 8192 ? 16384 - ((128 - arg0.field2317) * (-var3 + 16384) + 32 >> 6) : arg0.field2317 * var3 + 32 >> 6;
        } else {
            return -7;
        }
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(B)V")
    private final void method127(byte arg0) {
        this.method93(-1, 0);
        this.method103(12800, -1);
        field325++;
        for (int var2 = 0; var2 < 16; var2++) {
            this.field313[var2] = this.field299[var2];
        }
        if (arg0 < -105) {
            for (int var3 = 0; var3 < 16; var3++) {
                this.field309[var3] = class79.method669(-128, this.field299[var3]);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lod;ZI)V")
    public final void method128(class101 arg0, boolean arg1, int arg2) {
        field323++;
        if (arg2 != -1) {
            this.method96(84, 26, null, null, 46);
        }
        int var4 = arg0.field2331.field2711.length;
        int var7;
        if (arg1 && arg0.field2331.field2713) {
            int var5 = var4 + var4 - arg0.field2331.field2710;
            int var6 = var4 << 8;
            var7 = (int) ((long) this.field347[arg0.field2313] * (long) var5 >> 6);
            if (var6 <= var7) {
                arg0.field2316.method432(true);
                var7 = var6 + var6 - var7 - 1;
            }
        } else {
            var7 = (int) ((long) this.field347[arg0.field2313] * (long) var4 >> 6);
        }
        arg0.field2316.method438(var7);
    }

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)V")
    public final synchronized void method129(int arg0) {
        field307++;
        for (class70 var2 = (class70) this.field337.method296(0); var2 != null; var2 = (class70) this.field337.method290(arg0 + 20323)) {
            var2.method768(-1);
        }
        if (arg0 != -20324) {
            this.method131(-1, -6, -3);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)V")
    private final void method130(int arg0, boolean arg1) {
        if ((this.field306[arg0] & 0x2) != 0) {
            for (class101 var3 = (class101) this.field374.field1288.method889(120); var3 != null; var3 = (class101) this.field374.field1288.method884(true)) {
                if (var3.field2313 == arg0 && this.field302[arg0][var3.field2324] == null && var3.field2321 < 0) {
                    var3.field2321 = 0;
                }
            }
        }
        if (arg1) {
            field362 = null;
        }
        field311++;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(III)V")
    private final void method131(int arg0, int arg1, int arg2) {
        this.field305[arg0] = arg2;
        field324++;
        if (arg1 >= -100) {
            this.field364 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([III)V")
    public final synchronized void method132(int[] arg0, int arg1, int arg2) {
        field341++;
        if (this.field333.method323()) {
            int var4 = this.field333.field935 * this.field359 / class85.field2084;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field376;
                if (this.field378 - var5 >= 0L) {
                    this.field376 = var5;
                    break;
                }
                int var7 = (int) ((this.field378 + (long) var4 - this.field376 - 1L) / (long) var4);
                arg2 -= var7;
                this.field376 += (long) var4 * (long) var7;
                this.field374.method132(arg0, arg1, var7);
                this.method109(20583);
                arg1 += var7;
            } while (this.field333.method323());
        }
        this.field374.method132(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()I")
    public final synchronized int method133() {
        field366++;
        return 0;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    public class14() {
        this.method127((byte) -123);
    }
}
