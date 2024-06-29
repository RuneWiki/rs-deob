import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class178 extends class283 {

    @OriginalMember(owner = "client!ml", name = "ab", descriptor = "I")
    private int field2446 = 0;

    @OriginalMember(owner = "client!ml", name = "gb", descriptor = "I")
    private int field2452 = 0;

    @OriginalMember(owner = "client!ml", name = "db", descriptor = "I")
    private int field2449 = 0;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "I")
    private int field2434 = 0;

    @OriginalMember(owner = "client!ml", name = "Sb", descriptor = "Z")
    private boolean field2490 = true;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "Z")
    private boolean field2413 = false;

    @OriginalMember(owner = "client!ml", name = "Ob", descriptor = "Z")
    private boolean field2486 = false;

    @OriginalMember(owner = "client!ml", name = "dc", descriptor = "I")
    private int field2501 = 0;

    @OriginalMember(owner = "client!ml", name = "yb", descriptor = "Z")
    private boolean field2470 = false;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "Lep;")
    private class371 field2418;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Leca;")
    private class329 field2405;

    @OriginalMember(owner = "client!ml", name = "xb", descriptor = "Leca;")
    private class329 field2469;

    @OriginalMember(owner = "client!ml", name = "vc", descriptor = "Leca;")
    private class329 field2519;

    @OriginalMember(owner = "client!ml", name = "Cb", descriptor = "Leca;")
    private class329 field2474;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "Lqi;")
    private class292 field2407;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
    private int field2428;

    @OriginalMember(owner = "client!ml", name = "Z", descriptor = "I")
    private int field2445;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "[I")
    private int[] field2414;

    @OriginalMember(owner = "client!ml", name = "Bb", descriptor = "[S")
    private short[] field2473;

    @OriginalMember(owner = "client!ml", name = "U", descriptor = "[I")
    private int[] field2440;

    @OriginalMember(owner = "client!ml", name = "pc", descriptor = "[I")
    private int[] field2513;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "[I")
    private int[] field2417;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "[Lhr;")
    private class57[] field2435;

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "[Loo;")
    private class648[] field2439;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
    private int field2433;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "[Liaa;")
    private class253[] field2429;

    @OriginalMember(owner = "client!ml", name = "wc", descriptor = "[Ljt;")
    private class37[] field2520;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "S")
    private short field2408;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "[S")
    private short[] field2431;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "[S")
    private short[] field2409;

    @OriginalMember(owner = "client!ml", name = "eb", descriptor = "[F")
    private float[] field2450;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "[B")
    private byte[] field2411;

    @OriginalMember(owner = "client!ml", name = "zc", descriptor = "[S")
    private short[] field2523;

    @OriginalMember(owner = "client!ml", name = "zb", descriptor = "S")
    private short field2471;

    @OriginalMember(owner = "client!ml", name = "sc", descriptor = "[S")
    private short[] field2516;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "[S")
    private short[] field2426;

    @OriginalMember(owner = "client!ml", name = "ec", descriptor = "[S")
    private short[] field2502;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "[S")
    private short[] field2423;

    @OriginalMember(owner = "client!ml", name = "Lb", descriptor = "[F")
    private float[] field2483;

    @OriginalMember(owner = "client!ml", name = "Fb", descriptor = "[S")
    private short[] field2477;

    @OriginalMember(owner = "client!ml", name = "tc", descriptor = "[S")
    private short[] field2517;

    @OriginalMember(owner = "client!ml", name = "cc", descriptor = "[B")
    private byte[] field2500;

    @OriginalMember(owner = "client!ml", name = "Gb", descriptor = "[S")
    private short[] field2478;

    @OriginalMember(owner = "client!ml", name = "Qb", descriptor = "[I")
    private int[] field2488;

    @OriginalMember(owner = "client!ml", name = "mc", descriptor = "[[I")
    private int[][] field2510;

    @OriginalMember(owner = "client!ml", name = "Tb", descriptor = "[[I")
    private int[][] field2491;

    @OriginalMember(owner = "client!ml", name = "Wb", descriptor = "[[I")
    private int[][] field2494;

    @OriginalMember(owner = "client!ml", name = "tb", descriptor = "I")
    public static int field2465 = 0;

    @OriginalMember(owner = "client!ml", name = "Bc", descriptor = "I")
    public static int field2525 = -2;

    @OriginalMember(owner = "client!ml", name = "Ac", descriptor = "B")
    private byte field2524;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!ml", name = "W", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!ml", name = "X", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!ml", name = "Y", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!ml", name = "cb", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!ml", name = "fb", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!ml", name = "hb", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!ml", name = "ib", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!ml", name = "jb", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!ml", name = "kb", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!ml", name = "lb", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!ml", name = "mb", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!ml", name = "nb", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!ml", name = "qb", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!ml", name = "rb", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!ml", name = "sb", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!ml", name = "vb", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!ml", name = "wb", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!ml", name = "Ab", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!ml", name = "Db", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!ml", name = "Eb", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!ml", name = "Hb", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!ml", name = "Ib", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!ml", name = "Jb", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!ml", name = "Kb", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!ml", name = "Mb", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!ml", name = "Nb", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!ml", name = "Pb", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!ml", name = "Rb", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!ml", name = "Ub", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!ml", name = "Vb", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!ml", name = "Xb", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!ml", name = "Zb", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!ml", name = "ac", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!ml", name = "fc", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!ml", name = "gc", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!ml", name = "hc", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!ml", name = "jc", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!ml", name = "kc", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ml", name = "lc", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!ml", name = "nc", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!ml", name = "oc", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!ml", name = "qc", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!ml", name = "rc", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!ml", name = "uc", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!ml", name = "xc", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!ml", name = "yc", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!ml", name = "Cc", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "Lcq;")
    private class222 field2436;

    @OriginalMember(owner = "client!ml", name = "pb", descriptor = "Lhu;")
    private class227 field2461;

    @OriginalMember(owner = "client!ml", name = "ob", descriptor = "Lvi;")
    private class368 field2460;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "S")
    private short field2424;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "S")
    private short field2427;

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "S")
    private short field2437;

    @OriginalMember(owner = "client!ml", name = "V", descriptor = "S")
    private short field2441;

    @OriginalMember(owner = "client!ml", name = "bb", descriptor = "S")
    private short field2447;

    @OriginalMember(owner = "client!ml", name = "Yb", descriptor = "S")
    private short field2496;

    @OriginalMember(owner = "client!ml", name = "bc", descriptor = "S")
    private short field2499;

    @OriginalMember(owner = "client!ml", name = "ic", descriptor = "S")
    private short field2506;

    @OriginalMember(owner = "client!ml", name = "ub", descriptor = "[S")
    public static short[] field2466;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "()V")
    public final void method1112() {
        field2432++;
        if (this.field2452 <= 0 || this.field2501 <= 0) {
            return;
        }
        this.method1157(0, false);
        if ((this.field2524 & 0x10) == 0 && this.field2407.field3823 == null) {
            this.method1139(false, (byte) 121);
        }
        this.method1144(-32677);
    }

    @OriginalMember(owner = "client!ml", name = "ma", descriptor = "()I")
    public final int method1113() {
        field2443++;
        if (!this.field2486) {
            this.method1156(0);
        }
        return this.field2437;
    }

    @OriginalMember(owner = "client!ml", name = "V", descriptor = "()I")
    public final int method1114() {
        field2507++;
        if (!this.field2486) {
            this.method1156(0);
        }
        return this.field2441;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIIIB)Z")
    private final boolean method1115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field2458++;
        if (arg8 != -125) {
            return true;
        } else if (arg2 > arg6 && arg5 > arg6 && arg3 > arg6) {
            return false;
        } else if (arg2 < arg6 && arg5 < arg6 && arg6 > arg3) {
            return false;
        } else if (arg0 > arg4 && arg1 > arg4 && arg4 < arg7) {
            return false;
        } else {
            return arg4 <= arg0 || arg4 <= arg1 || arg4 <= arg7;
        }
    }

    @OriginalMember(owner = "client!ml", name = "wa", descriptor = "()V")
    public final void method1116() {
        for (int var1 = 0; var1 < this.field2434; var1++) {
            this.field2440[var1] = this.field2440[var1] + 7 >> 4;
            this.field2417[var1] = this.field2417[var1] + 7 >> 4;
            this.field2513[var1] = this.field2513[var1] + 7 >> 4;
        }
        field2509++;
        if (this.field2405 != null) {
            this.field2405.field4220 = null;
        }
        this.field2486 = false;
    }

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "(III)V")
    public final void method1117(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2449; var4++) {
            if (arg0 != 0) {
                this.field2440[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field2417[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field2513[var4] += arg2;
            }
        }
        field2448++;
        if (this.field2405 != null) {
            this.field2405.field4220 = null;
        }
        this.field2486 = false;
    }

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "(I)V")
    public final void method1118(int arg0) {
        this.field2445 = arg0;
        field2480++;
        if (this.field2436 != null && (this.field2445 & 0x10000) == 0) {
            this.field2426 = this.field2436.field3111;
            this.field2423 = this.field2436.field3123;
            this.field2478 = this.field2436.field3112;
            this.field2411 = this.field2436.field3114;
            this.field2436 = null;
        }
        this.field2490 = true;
        this.method1144(-32677);
    }

    @OriginalMember(owner = "client!ml", name = "WA", descriptor = "()I")
    public final int method1119() {
        field2489++;
        return this.field2471;
    }

    @OriginalMember(owner = "client!ml", name = "fa", descriptor = "()I")
    public final int method1120() {
        if (!this.field2486) {
            this.method1156(0);
        }
        field2522++;
        return this.field2499;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
    private final void method1121(int arg0) {
        field2420++;
        if (arg0 != 1) {
            this.method1158();
        }
        if (this.field2429 == null) {
            return;
        }
        class437 var2 = this.field2418.field4946;
        this.field2418.method2139(1004);
        this.field2418.method2148(!this.field2470);
        this.field2418.method2197(false, (byte) -88);
        this.field2418.method2172(null, arg0 + 32885, this.field2418.field5025, this.field2418.field5061, null);
        for (int var3 = 0; var3 < this.field2433; var3++) {
            class253 var4 = this.field2429[var3];
            class37 var5 = this.field2520[var3];
            if (!var4.field3500 || !this.field2418.method569()) {
                float var6 = (float) (this.field2440[var4.field3493] + this.field2440[var4.field3499] + this.field2440[var4.field3492]) * 0.3333333F;
                float var7 = (float) (this.field2417[var4.field3499] + this.field2417[var4.field3492] + this.field2417[var4.field3493]) * 0.3333333F;
                float var8 = (float) (this.field2513[var4.field3493] + this.field2513[var4.field3492] + this.field2513[var4.field3499]) * 0.3333333F;
                float var9 = class346.field4406 * var8 + class512.field7157 * var6 + class455.field6261 * var7 + class337.field4338;
                float var10 = class405.field5624 * var8 + class69.field981 * var6 + class330.field4239 * var7 + class452.field6217;
                float var11 = class139.field1908 * var8 + class336.field4309 * var7 + class130.field1770 * var6 + class172.field2327;
                float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field3498;
                var2.method2620(var11 * var12 - var11, var10 * var12 + (float) var5.field520 + -var10, var5.field524, (float) var5.field525 + var9 - (var9 * var12), var4.field3497 * var5.field523 >> 7, var4.field3491 * var5.field526 >> 7, -127);
                this.field2418.method2218(0, var2);
                int var13 = var5.field519;
                OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                this.field2418.method2103((byte) -59, var4.field3490);
                this.field2418.method2121(var4.field3495, arg0);
                this.field2418.method2067(0, 4, (byte) -117, 7);
            }
        }
        this.field2418.method2148(true);
        this.field2418.method2220(arg0 ^ 0xA);
    }

    @OriginalMember(owner = "client!ml", name = "NA", descriptor = "()Z")
    public final boolean method1122() {
        field2514++;
        if (this.field2510 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field2434; var1++) {
            this.field2440[var1] <<= 0x4;
            this.field2417[var1] <<= 0x4;
            this.field2513[var1] <<= 0x4;
        }
        class311.field3991 = 0;
        class401.field5552 = 0;
        class691.field9673 = 0;
        return true;
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "()V")
    public final void method1123() {
        field2454++;
    }

    @OriginalMember(owner = "client!ml", name = "ba", descriptor = "(Lr;)Lr;")
    public final class706 method1124(class706 arg0) {
        field2476++;
        if (this.field2452 == 0) {
            return null;
        }
        if (!this.field2486) {
            this.method1156(0);
        }
        int var2;
        int var3;
        if (this.field2418.field5092 <= 0) {
            var2 = this.field2441 - (this.field2418.field5092 * this.field2499 >> 8) >> this.field2418.field4953;
            var3 = this.field2424 - (this.field2418.field5092 * this.field2496 >> 8) >> this.field2418.field4953;
        } else {
            var2 = this.field2441 - (this.field2418.field5092 * this.field2496 >> 8) >> this.field2418.field4953;
            var3 = this.field2424 - (this.field2418.field5092 * this.field2499 >> 8) >> this.field2418.field4953;
        }
        int var4;
        int var5;
        if (this.field2418.field5072 <= 0) {
            var4 = this.field2427 - (this.field2418.field5072 * this.field2499 >> 8) >> this.field2418.field4953;
            var5 = this.field2447 - (this.field2418.field5072 * this.field2496 >> 8) >> this.field2418.field4953;
        } else {
            var4 = this.field2427 - (this.field2418.field5072 * this.field2496 >> 8) >> this.field2418.field4953;
            var5 = this.field2447 - (this.field2418.field5072 * this.field2499 >> 8) >> this.field2418.field4953;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class668 var8 = (class668) arg0;
        class668 var9;
        if (var8 != null && var8.method3828(var6, -1155735024, var7)) {
            var9 = var8;
            var8.method3827((byte) 0);
        } else {
            var9 = new class668(this.field2418, var6, var7);
        }
        var9.method3829(var3, var4, var2, false, var5);
        this.method1127((byte) -121, var9);
        return var9;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)Z")
    public static final boolean method1125(int arg0) {
        if (arg0 != 21618) {
            method1137(true);
        }
        field2503++;
        try {
            if (class736.field10292 == 2) {
                if (class683.field9606 == null) {
                    class683.field9606 = class134.method842(class355.field4565, class703.field9783, class108.field1548);
                    if (class683.field9606 == null) {
                        return false;
                    }
                }
                if (class109.field1551 == null) {
                    class109.field1551 = new class455(class474.field6485, class169.field2312);
                }
                class379 var1 = class336.field4314;
                if (class539.field7539 != null) {
                    var1 = class539.field7539;
                }
                if (var1.method2315(class263.field3587, 22050, (byte) 98, class683.field9606, class109.field1551)) {
                    class336.field4314 = var1;
                    class336.field4314.method2292(arg0 ^ 0x4DA);
                    if (class670.field9424 > 0) {
                        class736.field10292 = 3;
                        class336.field4314.method2301((byte) -36, class470.field6423 >= class670.field9424 ? class670.field9424 : class470.field6423);
                        for (int var2 = 0; var2 < class169.field2314.length; var2++) {
                            class336.field4314.method2308(class169.field2314[var2], var2, -17);
                            class169.field2314[var2] = 255;
                        }
                    } else {
                        class736.field10292 = 0;
                        class336.field4314.method2301((byte) -36, class470.field6423);
                        for (int var3 = 0; var3 < class169.field2314.length; var3++) {
                            class336.field4314.method2308(class169.field2314[var3], var3, arg0 ^ 0xFFFFAB9D);
                            class169.field2314[var3] = 255;
                        }
                    }
                    if (class539.field7539 == null) {
                        if (class419.field5818 <= 0L) {
                            class336.field4314.method2325(true, class298.field3896, class683.field9606);
                        } else {
                            class336.field4314.method2307(class683.field9606, 14027, class298.field3896, class419.field5818, true);
                        }
                    }
                    if (class614.field8742 != null) {
                        class614.field8742.method3143((byte) -41, class336.field4314);
                    }
                    class539.field7539 = null;
                    class419.field5818 = 0L;
                    class109.field1551 = null;
                    class683.field9606 = null;
                    class355.field4565 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class336.field4314.method2311(-108);
            class109.field1551 = null;
            class683.field9606 = null;
            class539.field7539 = null;
            class355.field4565 = null;
            class736.field10292 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!ml", name = "EA", descriptor = "()I")
    public final int method1126() {
        field2515++;
        if (!this.field2486) {
            this.method1156(0);
        }
        return this.field2496;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLov;)V")
    private final void method1127(byte arg0, class668 arg1) {
        if (this.field2452 > this.field2418.field5100.length) {
            this.field2418.field5100 = new int[this.field2452];
            this.field2418.field5099 = new int[this.field2452];
        }
        field2416++;
        int[] var3 = this.field2418.field5100;
        int[] var4 = this.field2418.field5099;
        for (int var5 = 0; var5 < this.field2449; var5++) {
            int var16 = (this.field2440[var5] - (this.field2417[var5] * this.field2418.field5092 >> 8) >> this.field2418.field4953) - arg1.field9404;
            int var17 = (this.field2513[var5] - (this.field2417[var5] * this.field2418.field5072 >> 8) >> this.field2418.field4953) - arg1.field9405;
            int var18 = this.field2414[var5];
            int var19 = this.field2414[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field2517[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field2501; var6++) {
            if (this.field2500 == null || this.field2500[var6] <= 128) {
                short var7 = this.field2502[var6];
                short var8 = this.field2431[var6];
                short var9 = this.field2409[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - (var12 - var11) * (var14 - var13) > 0) {
                    arg1.method3826(var12, var15, var14, 0, var13, var11, var10);
                }
            }
        }
        if (arg0 != -121) {
            this.field2471 = -44;
        }
    }

    @OriginalMember(owner = "client!ml", name = "HA", descriptor = "()I")
    public final int method1128() {
        field2425++;
        if (!this.field2486) {
            this.method1156(0);
        }
        return this.field2427;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Luha;IZ)V")
    public final void method1129(class723 arg0, int arg1, boolean arg2) {
        field2419++;
        if (this.field2473 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field2449; var5++) {
            if ((arg1 & this.field2473[var5]) != 0) {
                if (arg2) {
                    arg0.method871(this.field2440[var5], this.field2417[var5], this.field2513[var5], var4);
                } else {
                    arg0.method861(this.field2440[var5], this.field2417[var5], this.field2513[var5], var4);
                }
                this.field2440[var5] = var4[0];
                this.field2417[var5] = var4[1];
                this.field2513[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "()Z")
    public final boolean method1130() {
        field2505++;
        return this.field2470;
    }

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "(I)V")
    public final void method1131(int arg0) {
        field2415++;
        int var2 = class231.field3217[arg0];
        int var3 = class231.field3218[arg0];
        for (int var4 = 0; var4 < this.field2449; var4++) {
            int var7 = this.field2513[var4] * var2 + this.field2440[var4] * var3 >> 14;
            this.field2513[var4] = this.field2513[var4] * var3 - (this.field2440[var4] * var2) >> 14;
            this.field2440[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field2452; var5++) {
            int var6 = this.field2478[var5] * var3 + this.field2423[var5] * var2 >> 14;
            this.field2423[var5] = (short) (this.field2423[var5] * var3 - (this.field2478[var5] * var2) >> 14);
            this.field2478[var5] = (short) var6;
        }
        if (this.field2519 == null && this.field2474 != null) {
            this.field2474.field4220 = null;
        }
        if (this.field2519 != null) {
            this.field2519.field4220 = null;
        }
        this.field2486 = false;
        if (this.field2405 != null) {
            this.field2405.field4220 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "na", descriptor = "()I")
    public final int method1132() {
        if (!this.field2486) {
            this.method1156(0);
        }
        field2430++;
        return this.field2506;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public final void method1133(int arg0) {
        field2472++;
        int var2 = class231.field3217[arg0];
        int var3 = class231.field3218[arg0];
        for (int var4 = 0; var4 < this.field2449; var4++) {
            int var5 = this.field2513[var4] * var2 + this.field2440[var4] * var3 >> 14;
            this.field2513[var4] = this.field2513[var4] * var3 - (this.field2440[var4] * var2) >> 14;
            this.field2440[var4] = var5;
        }
        if (this.field2405 != null) {
            this.field2405.field4220 = null;
        }
        this.field2486 = false;
    }

    @OriginalMember(owner = "client!ml", name = "ia", descriptor = "(SS)V")
    public final void method1134(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2446; var3++) {
            if (this.field2477[var3] == arg0) {
                this.field2477[var3] = arg1;
            }
        }
        field2451++;
        if (this.field2429 != null) {
            for (int var4 = 0; var4 < this.field2433; var4++) {
                class253 var5 = this.field2429[var4];
                class37 var6 = this.field2520[var4];
                var6.field519 = var6.field519 & 0xFF000000 | class673.field9471[this.field2477[var5.field3496] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field2474 != null) {
            this.field2474.field4220 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "ua", descriptor = "()I")
    public final int method1135() {
        field2467++;
        return this.field2445;
    }

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "()I")
    public final int method1136() {
        if (!this.field2486) {
            this.method1156(0);
        }
        field2410++;
        return this.field2447;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)V")
    public static void method1137(boolean arg0) {
        field2466 = null;
        if (!arg0) {
            field2466 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final void method1138(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field2462++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            class311.field3991 = 0;
            class691.field9673 = 0;
            class401.field5552 = 0;
            int var13 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field2510.length) {
                    int[] var16 = this.field2510[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field2473 == null || (arg6 & this.field2473[var18]) != 0) {
                            class311.field3991 += this.field2440[var18];
                            class691.field9673 += this.field2417[var18];
                            class401.field5552 += this.field2513[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                class401.field5552 = class401.field5552 / var13 + var12;
                class311.field3991 = class311.field3991 / var13 + var10;
                class691.field9673 = class691.field9673 / var13 + var11;
                class140.field1929 = true;
            } else {
                class691.field9673 = var11;
                class401.field5552 = var12;
                class311.field3991 = var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 8192 >> 14;
                int var20 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + (arg7[7] * arg3) + 8192 >> 14;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg4 << 4;
            int var23 = arg3 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field2510.length > var26) {
                    int[] var27 = this.field2510[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field2473 == null || (this.field2473[var29] & arg6) != 0) {
                            this.field2440[var29] += var24;
                            this.field2417[var29] += var23;
                            this.field2513[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field2510.length) {
                        int[] var50 = this.field2510[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field2473 == null || (arg6 & this.field2473[var52]) != 0) {
                                this.field2440[var52] -= class311.field3991;
                                this.field2417[var52] -= class691.field9673;
                                this.field2513[var52] -= class401.field5552;
                                if (arg4 != 0) {
                                    int var53 = class231.field3217[arg4];
                                    int var54 = class231.field3218[arg4];
                                    int var55 = this.field2440[var52] * var54 + this.field2417[var52] * var53 + 16383 >> 14;
                                    this.field2417[var52] = this.field2417[var52] * var54 + 16383 - (this.field2440[var52] * var53) >> 14;
                                    this.field2440[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class231.field3217[arg2];
                                    int var57 = class231.field3218[arg2];
                                    int var58 = this.field2417[var52] * var57 + 16383 - (this.field2513[var52] * var56) >> 14;
                                    this.field2513[var52] = this.field2417[var52] * var56 + this.field2513[var52] * var57 + 16383 >> 14;
                                    this.field2417[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class231.field3217[arg3];
                                    int var60 = class231.field3218[arg3];
                                    int var61 = this.field2513[var52] * var59 + (this.field2440[var52] * var60) + 16383 >> 14;
                                    this.field2513[var52] = this.field2513[var52] * var60 - (this.field2440[var52] * var59 - 16383) >> 14;
                                    this.field2440[var52] = var61;
                                }
                                this.field2440[var52] += class311.field3991;
                                this.field2417[var52] += class691.field9673;
                                this.field2513[var52] += class401.field5552;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field2510.length > var32) {
                            int[] var33 = this.field2510[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field2473 == null || (this.field2473[var35] & arg6) != 0) {
                                    int var36 = this.field2414[var35];
                                    int var37 = this.field2414[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field2517[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class231.field3217[arg4];
                                            int var41 = class231.field3218[arg4];
                                            int var42 = this.field2426[var39] * var40 - (-(this.field2478[var39] * var41) - 16383) >> 14;
                                            this.field2426[var39] = (short) (this.field2426[var39] * var41 + 16383 - (this.field2478[var39] * var40) >> 14);
                                            this.field2478[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class231.field3217[arg2];
                                            int var44 = class231.field3218[arg2];
                                            int var45 = this.field2426[var39] * var44 + 16383 - (this.field2423[var39] * var43) >> 14;
                                            this.field2423[var39] = (short) (this.field2426[var39] * var43 + this.field2423[var39] * var44 + 16383 >> 14);
                                            this.field2426[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class231.field3217[arg3];
                                            int var47 = class231.field3218[arg3];
                                            int var48 = this.field2423[var39] * var46 - (-(this.field2478[var39] * var47) - 16383) >> 14;
                                            this.field2423[var39] = (short) (this.field2423[var39] * var47 + 16383 - (this.field2478[var39] * var46) >> 14);
                                            this.field2478[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field2519 == null && this.field2474 != null) {
                        this.field2474.field4220 = null;
                    }
                    if (this.field2519 != null) {
                        this.field2519.field4220 = null;
                        return;
                    }
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class140.field1929) {
                    int var68 = arg7[0] * class311.field3991 + arg7[3] * class691.field9673 + arg7[6] * class401.field5552 + 8192 >> 14;
                    int var69 = arg7[1] * class311.field3991 + (arg7[4] * class691.field9673) + arg7[7] * class401.field5552 + 8192 >> 14;
                    int var70 = arg7[5] * class691.field9673 + (arg7[2] * class311.field3991 + (arg7[8] * class401.field5552)) + 8192 >> 14;
                    int var71 = var66 + var69;
                    int var72 = var65 + var68;
                    class311.field3991 = var72;
                    int var73 = var67 + var70;
                    class691.field9673 = var71;
                    class140.field1929 = false;
                    class401.field5552 = var73;
                }
                int[] var74 = new int[9];
                int var75 = class231.field3218[arg2];
                int var76 = class231.field3217[arg2];
                int var77 = class231.field3218[arg3];
                int var78 = class231.field3217[arg3];
                int var79 = class231.field3218[arg4];
                int var80 = class231.field3217[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[1] = var78 * var81 + -var77 * var80 + 8192 >> 14;
                var74[7] = var77 * var81 + var78 * var80 + 8192 >> 14;
                var74[0] = var77 * var79 + (var78 * var82 + 8192) >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[5] = -var76;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[6] = -var78 * var79 + var77 * var82 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                int var83 = var74[0] * -class311.field3991 + var74[2] * -class401.field5552 + (var74[1] * -class691.field9673) + 8192 >> 14;
                int var84 = var74[3] * -class311.field3991 + (var74[5] * -class401.field5552) + var74[4] * -class691.field9673 + 8192 >> 14;
                int var85 = var74[6] * -class311.field3991 + (var74[8] * -class401.field5552) + var74[7] * -class691.field9673 + 8192 >> 14;
                int var86 = class311.field3991 + var83;
                int var87 = class691.field9673 + var84;
                int var88 = class401.field5552 + var85;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += arg7[var119 * 3 + var121] * var74[var90 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 8192 >> 14;
                    }
                }
                int var91 = var74[2] * var67 + var74[0] * var65 + (var74[1] * var66) + 8192 >> 14;
                int var92 = var74[5] * var67 + var74[4] * var66 + var74[3] * var65 + 8192 >> 14;
                int var93 = var87 + var92;
                int var94 = var74[6] * var65 + (var74[7] * var66) + var74[8] * var67 + 8192 >> 14;
                int var95 = var86 + var91;
                int var96 = var88 + var94;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += arg7[var98 * 3 + var118] * var89[var118 * 3 + var116];
                        }
                        var97[var98 * 3 + var116] = var117 + 8192 >> 14;
                    }
                }
                int var99 = arg7[1] * var93 + arg7[2] * var96 + arg7[0] * var95 + 8192 >> 14;
                int var100 = arg7[3] * var95 + (arg7[4] * var93) - (-(arg7[5] * var96) - 8192) >> 14;
                int var101 = var63 + var100;
                int var102 = arg7[7] * var93 + (arg7[6] * var95 + (arg7[8] * var96)) + 8192 >> 14;
                int var103 = var62 + var99;
                int var104 = var64 + var102;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field2510.length > var106) {
                        int[] var107 = this.field2510[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field2473 == null || (this.field2473[var109] & arg6) != 0) {
                                int var110 = this.field2513[var109] * var97[2] + this.field2440[var109] * var97[0] + this.field2417[var109] * var97[1] + 8192 >> 14;
                                int var111 = this.field2440[var109] * var97[3] + 8192 - (-(this.field2417[var109] * var97[4]) - this.field2513[var109] * var97[5]) >> 14;
                                int var112 = var101 + var111;
                                int var113 = var103 + var110;
                                int var114 = this.field2513[var109] * var97[8] + this.field2417[var109] * var97[7] + this.field2440[var109] * var97[6] + 8192 >> 14;
                                this.field2440[var109] = var113;
                                int var115 = var104 + var114;
                                this.field2417[var109] = var112;
                                this.field2513[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (var123 < this.field2510.length) {
                        int[] var124 = this.field2510[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field2473 == null || (this.field2473[var126] & arg6) != 0) {
                                this.field2440[var126] -= class311.field3991;
                                this.field2417[var126] -= class691.field9673;
                                this.field2513[var126] -= class401.field5552;
                                this.field2440[var126] = this.field2440[var126] * arg2 >> 7;
                                this.field2417[var126] = this.field2417[var126] * arg3 >> 7;
                                this.field2513[var126] = this.field2513[var126] * arg4 >> 7;
                                this.field2440[var126] += class311.field3991;
                                this.field2417[var126] += class691.field9673;
                                this.field2513[var126] += class401.field5552;
                            }
                        }
                    }
                }
            } else {
                int var127 = arg7[9] << 4;
                int var128 = arg7[10] << 4;
                int var129 = arg7[11] << 4;
                int var130 = arg7[12] << 4;
                int var131 = arg7[13] << 4;
                int var132 = arg7[14] << 4;
                if (class140.field1929) {
                    int var133 = arg7[0] * class311.field3991 + arg7[6] * class401.field5552 + arg7[3] * class691.field9673 + 8192 >> 14;
                    int var134 = arg7[1] * class311.field3991 - (-(arg7[4] * class691.field9673) - (arg7[7] * class401.field5552) - 8192) >> 14;
                    int var135 = var130 + var133;
                    int var136 = var131 + var134;
                    int var137 = arg7[8] * class401.field5552 + arg7[5] * class691.field9673 + arg7[2] * class311.field3991 + 8192 >> 14;
                    class691.field9673 = var136;
                    int var138 = var132 + var137;
                    class311.field3991 = var135;
                    class401.field5552 = var138;
                    class140.field1929 = false;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class311.field3991 * var139 + 8192 >> 14;
                int var143 = -class691.field9673 * var140 + 8192 >> 14;
                int var144 = -class401.field5552 * var141 + 8192 >> 14;
                int var145 = class311.field3991 + var142;
                int var146 = var143 + class691.field9673;
                int var147 = class401.field5552 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var132 * var141 + 8192 >> 14;
                int var152 = var145 + var149;
                int var153 = var146 + var150;
                int var154 = var147 + var151;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += var148[var174 + (var176 * 3)] * arg7[var156 * 3 + var176];
                        }
                        var155[var156 * 3 + var174] = var175 + 8192 >> 14;
                    }
                }
                int var157 = arg7[1] * var153 + (arg7[0] * var152 + (arg7[2] * var154)) + 8192 >> 14;
                int var158 = arg7[3] * var152 + arg7[5] * var154 + (arg7[4] * var153) + 8192 >> 14;
                int var159 = arg7[8] * var154 + arg7[7] * var153 + arg7[6] * var152 + 8192 >> 14;
                int var160 = var128 + var158;
                int var161 = var127 + var157;
                int var162 = var129 + var159;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (var164 < this.field2510.length) {
                        int[] var165 = this.field2510[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field2473 == null || (this.field2473[var167] & arg6) != 0) {
                                int var168 = this.field2513[var167] * var155[2] + this.field2440[var167] * var155[0] + this.field2417[var167] * var155[1] + 8192 >> 14;
                                int var169 = this.field2513[var167] * var155[5] + this.field2440[var167] * var155[3] + this.field2417[var167] * var155[4] + 8192 >> 14;
                                int var170 = var160 + var169;
                                int var171 = var161 + var168;
                                int var172 = this.field2417[var167] * var155[7] + this.field2513[var167] * var155[8] + this.field2440[var167] * var155[6] + 8192 >> 14;
                                int var173 = var162 + var172;
                                this.field2440[var167] = var171;
                                this.field2417[var167] = var170;
                                this.field2513[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2494 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field2494.length) {
                        int[] var182 = this.field2494[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field2516 == null || (arg6 & this.field2516[var184]) != 0) {
                                int var185 = (this.field2500[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field2500[var184] = (byte) var185;
                                if (this.field2474 != null) {
                                    this.field2474.field4220 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field2429 != null) {
                    for (int var178 = 0; var178 < this.field2433; var178++) {
                        class253 var179 = this.field2429[var178];
                        class37 var180 = this.field2520[var178];
                        var180.field519 = 255 - (this.field2500[var179.field3496] & 0xFF) << 24 | var180.field519 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field2494 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field2494.length) {
                        int[] var191 = this.field2494[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field2516 == null || (this.field2516[var193] & arg6) != 0) {
                                int var194 = this.field2477[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFD61) >> 10;
                                int var196 = (var194 & 0x3C8) >> 7;
                                int var197 = arg3 / 4 + var196;
                                int var198 = var194 & 0x7F;
                                int var199 = arg2 + var195 & 0x3F;
                                int var200 = arg4 + var198;
                                if (var197 < 0) {
                                    var197 = 0;
                                } else if (var197 > 7) {
                                    var197 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field2477[var193] = (short) class747.method4153(class747.method4153(var199 << 10, var197 << 7), var200);
                                if (this.field2474 != null) {
                                    this.field2474.field4220 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field2429 != null) {
                    for (int var187 = 0; var187 < this.field2433; var187++) {
                        class253 var188 = this.field2429[var187];
                        class37 var189 = this.field2520[var187];
                        var189.field519 = class673.field9471[this.field2477[var188.field3496] & 0xFFFF] & 0xFFFFFF | var189.field519 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field2491 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field2491.length) {
                        int[] var203 = this.field2491[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class37 var205 = this.field2520[var203[var204]];
                            var205.field525 += arg2;
                            var205.field520 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field2491 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field2491.length) {
                        int[] var208 = this.field2491[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class37 var210 = this.field2520[var208[var209]];
                            var210.field523 = var210.field523 * arg2 >> 7;
                            var210.field526 = var210.field526 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field2491 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field2491.length) {
                    int[] var213 = this.field2491[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class37 var215 = this.field2520[var213[var214]];
                        var215.field524 = var215.field524 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZB)V")
    private final void method1139(boolean arg0, byte arg1) {
        field2456++;
        if (this.field2501 * 6 <= this.field2418.field5033.field279.length) {
            this.field2418.field5033.field330 = 0;
        } else {
            this.field2418.field5033 = new class128((this.field2501 + 100) * 6);
        }
        if (arg1 <= 8) {
            this.field2496 = -43;
        }
        class128 var3 = this.field2418.field5033;
        if (this.field2418.field4992) {
            for (int var5 = 0; var5 < this.field2501; var5++) {
                var3.method147((byte) 53, this.field2502[var5]);
                var3.method147((byte) 53, this.field2431[var5]);
                var3.method147((byte) 53, this.field2409[var5]);
            }
        } else {
            for (int var4 = 0; var4 < this.field2501; var4++) {
                var3.method139(this.field2502[var4], -127);
                var3.method139(this.field2431[var4], -114);
                var3.method139(this.field2409[var4], 15);
            }
        }
        if (var3.field330 == 0) {
            return;
        }
        if (arg0) {
            if (this.field2460 == null) {
                this.field2460 = this.field2418.method2209(var3.field330, -127, var3.field279, 5123, true);
            } else {
                this.field2460.method1857(var3.field279, -13491, var3.field330, 5123);
            }
            this.field2407.field3823 = this.field2460;
        } else {
            this.field2407.field3823 = this.field2418.method2209(var3.field330, -120, var3.field279, 5123, false);
        }
        if (!arg0) {
            this.field2490 = true;
        }
    }

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "()Z")
    public final boolean method1140() {
        field2453++;
        return this.field2413;
    }

    @OriginalMember(owner = "client!ml", name = "da", descriptor = "()I")
    public final int method1141() {
        field2484++;
        return this.field2408;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method1142(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field2482++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            class691.field9673 = 0;
            int var12 = 0;
            class401.field5552 = 0;
            class311.field3991 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field2510.length > var14) {
                    int[] var15 = this.field2510[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class311.field3991 += this.field2440[var17];
                        class691.field9673 += this.field2417[var17];
                        class401.field5552 += this.field2513[var17];
                        var12++;
                    }
                }
            }
            if (var12 > 0) {
                class691.field9673 = class691.field9673 / var12 + var10;
                class401.field5552 = class401.field5552 / var12 + var11;
                class311.field3991 = class311.field3991 / var12 + var9;
            } else {
                class311.field3991 = var9;
                class691.field9673 = var10;
                class401.field5552 = var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg3 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field2510.length) {
                    int[] var23 = this.field2510[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field2440[var25] += var18;
                        this.field2417[var25] += var19;
                        this.field2513[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field2510.length > var45) {
                    int[] var46 = this.field2510[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field2440[var48] -= class311.field3991;
                            this.field2417[var48] -= class691.field9673;
                            this.field2513[var48] -= class401.field5552;
                            if (arg4 != 0) {
                                int var49 = class231.field3217[arg4];
                                int var50 = class231.field3218[arg4];
                                int var51 = this.field2417[var48] * var49 - (-(this.field2440[var48] * var50) - 16383) >> 14;
                                this.field2417[var48] = this.field2417[var48] * var50 + 16383 - (this.field2440[var48] * var49) >> 14;
                                this.field2440[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class231.field3217[arg2];
                                int var53 = class231.field3218[arg2];
                                int var54 = this.field2417[var48] * var53 + 16383 - (this.field2513[var48] * var52) >> 14;
                                this.field2513[var48] = this.field2417[var48] * var52 + this.field2513[var48] * var53 + 16383 >> 14;
                                this.field2417[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class231.field3217[arg3];
                                int var56 = class231.field3218[arg3];
                                int var57 = this.field2513[var48] * var55 + this.field2440[var48] * var56 + 16383 >> 14;
                                this.field2513[var48] = this.field2513[var48] * var56 + 16383 - this.field2440[var48] * var55 >> 14;
                                this.field2440[var48] = var57;
                            }
                            this.field2440[var48] += class311.field3991;
                            this.field2417[var48] += class691.field9673;
                            this.field2513[var48] += class401.field5552;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field2440[var59] -= class311.field3991;
                            this.field2417[var59] -= class691.field9673;
                            this.field2513[var59] -= class401.field5552;
                            if (arg2 != 0) {
                                int var60 = class231.field3217[arg2];
                                int var61 = class231.field3218[arg2];
                                int var62 = this.field2417[var59] * var61 + 16383 - (this.field2513[var59] * var60) >> 14;
                                this.field2513[var59] = this.field2417[var59] * var60 - (-(this.field2513[var59] * var61) - 16383) >> 14;
                                this.field2417[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class231.field3217[arg4];
                                int var64 = class231.field3218[arg4];
                                int var65 = this.field2440[var59] * var64 + this.field2417[var59] * var63 + 16383 >> 14;
                                this.field2417[var59] = this.field2417[var59] * var64 + 16383 - this.field2440[var59] * var63 >> 14;
                                this.field2440[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class231.field3217[arg3];
                                int var67 = class231.field3218[arg3];
                                int var68 = this.field2440[var59] * var67 + (this.field2513[var59] * var66 + 16383) >> 14;
                                this.field2513[var59] = this.field2513[var59] * var67 + 16383 - (this.field2440[var59] * var66) >> 14;
                                this.field2440[var59] = var68;
                            }
                            this.field2440[var59] += class311.field3991;
                            this.field2417[var59] += class691.field9673;
                            this.field2513[var59] += class401.field5552;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field2510.length) {
                        int[] var29 = this.field2510[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field2414[var31];
                            int var33 = this.field2414[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field2517[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class231.field3217[arg4];
                                    int var37 = class231.field3218[arg4];
                                    int var38 = this.field2478[var35] * var37 + this.field2426[var35] * var36 + 16383 >> 14;
                                    this.field2426[var35] = (short) (this.field2426[var35] * var37 + 16383 - (this.field2478[var35] * var36) >> 14);
                                    this.field2478[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class231.field3217[arg2];
                                    int var40 = class231.field3218[arg2];
                                    int var41 = this.field2426[var35] * var40 + 16383 - (this.field2423[var35] * var39) >> 14;
                                    this.field2423[var35] = (short) (this.field2423[var35] * var40 + (this.field2426[var35] * var39 + 16383) >> 14);
                                    this.field2426[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class231.field3217[arg3];
                                    int var43 = class231.field3218[arg3];
                                    int var44 = this.field2423[var35] * var42 - (-(this.field2478[var35] * var43) - 16383) >> 14;
                                    this.field2423[var35] = (short) (this.field2423[var35] * var43 + 16383 - (this.field2478[var35] * var42) >> 14);
                                    this.field2478[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field2519 == null && this.field2474 != null) {
                    this.field2474.field4220 = null;
                }
                if (this.field2519 != null) {
                    this.field2519.field4220 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field2510.length) {
                    int[] var71 = this.field2510[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field2440[var73] -= class311.field3991;
                        this.field2417[var73] -= class691.field9673;
                        this.field2513[var73] -= class401.field5552;
                        this.field2440[var73] = this.field2440[var73] * arg2 >> 7;
                        this.field2417[var73] = this.field2417[var73] * arg3 >> 7;
                        this.field2513[var73] = this.field2513[var73] * arg4 >> 7;
                        this.field2440[var73] += class311.field3991;
                        this.field2417[var73] += class691.field9673;
                        this.field2513[var73] += class401.field5552;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2494 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field2494.length) {
                        int[] var79 = this.field2494[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field2500[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field2500[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field2474 != null) {
                            this.field2474.field4220 = null;
                        }
                    }
                }
                if (this.field2429 != null) {
                    for (int var75 = 0; var75 < this.field2433; var75++) {
                        class253 var76 = this.field2429[var75];
                        class37 var77 = this.field2520[var75];
                        var77.field519 = var77.field519 & 0xFFFFFF | 255 - (this.field2500[var76.field3496] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field2494 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field2494.length) {
                        int[] var88 = this.field2494[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field2477[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = var91 & 0x7F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = arg2 + var92 & 0x3F;
                            if (var95 < 0) {
                                var95 = 0;
                            } else if (var95 > 7) {
                                var95 = 7;
                            }
                            int var97 = arg4 + var94;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field2477[var90] = (short) class747.method4153(class747.method4153(var95 << 7, var96 << 10), var97);
                        }
                        if (var88.length > 0 && this.field2474 != null) {
                            this.field2474.field4220 = null;
                        }
                    }
                }
                if (this.field2429 != null) {
                    for (int var84 = 0; var84 < this.field2433; var84++) {
                        class253 var85 = this.field2429[var84];
                        class37 var86 = this.field2520[var84];
                        var86.field519 = var86.field519 & 0xFF000000 | class673.field9471[this.field2477[var85.field3496] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field2491 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field2491.length) {
                        int[] var100 = this.field2491[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class37 var102 = this.field2520[var100[var101]];
                            var102.field520 += arg3;
                            var102.field525 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field2491 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field2491.length > var104) {
                        int[] var105 = this.field2491[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class37 var107 = this.field2520[var105[var106]];
                            var107.field526 = var107.field526 * arg3 >> 7;
                            var107.field523 = var107.field523 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field2491 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field2491.length) {
                    int[] var110 = this.field2491[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class37 var112 = this.field2520[var110[var111]];
                        var112.field524 = var112.field524 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BIJIILkda;FIIF)S")
    private final short method1143(byte arg0, int arg1, long arg2, int arg3, int arg4, class64 arg5, float arg6, int arg7, int arg8, float arg9) {
        field2492++;
        int var12 = this.field2414[arg4];
        int var13 = this.field2414[arg4 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field2517[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class372.field5103[var15] == arg2) {
                return (short) (var16 - 1);
            }
        }
        if (arg0 < 105) {
            this.field2506 = -64;
        }
        this.field2517[var14] = (short) (this.field2452 + 1);
        class372.field5103[var14] = arg2;
        this.field2478[this.field2452] = (short) arg1;
        this.field2426[this.field2452] = (short) arg7;
        this.field2423[this.field2452] = (short) arg8;
        this.field2411[this.field2452] = (byte) arg3;
        this.field2483[this.field2452] = arg9;
        this.field2450[this.field2452] = arg6;
        return (short) (this.field2452++);
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
    private final void method1144(int arg0) {
        field2485++;
        if (!this.field2490) {
            return;
        }
        this.field2490 = false;
        if (this.field2435 == null && this.field2439 == null && this.field2429 == null) {
            if (this.field2440 != null && !class120.method781(this.field2428, (byte) 42, this.field2445)) {
                if (this.field2405 != null && this.field2405.field4220 == null) {
                    this.field2490 = true;
                } else {
                    if (!this.field2486) {
                        this.method1156(0);
                    }
                    this.field2440 = null;
                }
            }
            if (this.field2417 != null && !class226.method1469(this.field2428, this.field2445, arg0 ^ 0xFFFF805B)) {
                if (this.field2405 != null && this.field2405.field4220 == null) {
                    this.field2490 = true;
                } else {
                    if (!this.field2486) {
                        this.method1156(0);
                    }
                    this.field2417 = null;
                }
            }
            if (this.field2513 != null && !class191.method1270(this.field2445, arg0 ^ 0xFFFF80DB, this.field2428)) {
                if (this.field2405 != null && this.field2405.field4220 == null) {
                    this.field2490 = true;
                } else {
                    if (!this.field2486) {
                        this.method1156(0);
                    }
                    this.field2513 = null;
                }
            }
        }
        if (this.field2517 != null && this.field2440 == null && this.field2417 == null && this.field2513 == null) {
            this.field2414 = null;
            this.field2517 = null;
        }
        if (this.field2411 != null && !class10.method47(this.field2428, (byte) 3, this.field2445)) {
            if (this.field2519 == null) {
                if (this.field2474 != null && this.field2474.field4220 == null) {
                    this.field2490 = true;
                } else {
                    this.field2411 = null;
                    this.field2478 = this.field2426 = this.field2423 = null;
                }
            } else if (this.field2519.field4220 == null) {
                this.field2490 = true;
            } else {
                this.field2411 = null;
                this.field2478 = this.field2426 = this.field2423 = null;
            }
        }
        if (this.field2477 != null && !class336.method1947(this.field2428, this.field2445, arg0 + 19594)) {
            if (this.field2474 != null && this.field2474.field4220 == null) {
                this.field2490 = true;
            } else {
                this.field2477 = null;
            }
        }
        if (this.field2500 != null && !class357.method2019(this.field2445, 65534, this.field2428)) {
            if (this.field2474 != null && this.field2474.field4220 == null) {
                this.field2490 = true;
            } else {
                this.field2500 = null;
            }
        }
        if (this.field2483 != null && !class736.method4094(this.field2445, 126, this.field2428)) {
            if (this.field2469 != null && this.field2469.field4220 == null) {
                this.field2490 = true;
            } else {
                this.field2483 = this.field2450 = null;
            }
        }
        if (this.field2523 != null && !class390.method2368(this.field2428, this.field2445, -1003763703)) {
            if (this.field2474 != null && this.field2474.field4220 == null) {
                this.field2490 = true;
            } else {
                this.field2523 = null;
            }
        }
        if (this.field2502 != null && !class249.method1588(15675, this.field2428, this.field2445)) {
            if ((this.field2407 == null || this.field2407.field3823 != null) && (this.field2474 == null || this.field2474.field4220 != null)) {
                this.field2502 = this.field2431 = this.field2409 = null;
            } else {
                this.field2490 = true;
            }
        }
        if (arg0 != -32677) {
            return;
        }
        if (this.field2494 != null && !class308.method1808(104, this.field2428, this.field2445)) {
            this.field2516 = null;
            this.field2494 = null;
        }
        if (this.field2510 != null && !class218.method1424((byte) -41, this.field2428, this.field2445)) {
            this.field2473 = null;
            this.field2510 = null;
        }
        if (this.field2491 != null && !class310.method1813(this.field2428, 2439, this.field2445)) {
            this.field2491 = null;
        }
        if (this.field2488 != null && (this.field2445 & 0x800) == 0 && (this.field2445 & 0x40000) == 0) {
            this.field2488 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "()[Loo;")
    public final class648[] method1145() {
        field2518++;
        return this.field2439;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
    private final void method1146(byte arg0) {
        field2412++;
        int var2 = -127 % ((arg0 + 58) / 52);
        if (this.field2501 == 0) {
            return;
        }
        if (this.field2524 != 0) {
            this.method1157(0, true);
        }
        this.method1157(0, false);
        if (this.field2407 != null) {
            if (this.field2407.field3823 == null) {
                this.method1139((this.field2524 & 0x10) != 0, (byte) 42);
            }
            if (this.field2407.field3823 != null) {
                this.field2418.method2197(this.field2519 != null, (byte) -88);
                this.field2418.method2172(this.field2474, 32886, this.field2405, this.field2469, this.field2519);
                int var3 = this.field2488.length - 1;
                for (int var4 = 0; var4 < var3; var4++) {
                    int var5 = this.field2488[var4];
                    int var6 = this.field2488[var4 + 1];
                    int var7 = this.field2523[var5] & 0xFFFF;
                    if (var7 == 65535) {
                        var7 = -1;
                    }
                    this.field2418.method2096(var7, 12575, this.field2519 != null);
                    this.field2418.method2229(4, 32, (var6 - var5) * 3, var5 * 3, this.field2407.field3823);
                }
            }
        }
        this.method1144(-32677);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BIZ)Lka;")
    public final class283 method1147(byte arg0, int arg1, boolean arg2) {
        field2487++;
        class178 var4;
        class178 var5;
        if (arg0 == 1) {
            var4 = this.field2418.field5021;
            var5 = this.field2418.field5011;
        } else if (arg0 == 2) {
            var5 = this.field2418.field5045;
            var4 = this.field2418.field4993;
        } else if (arg0 == 3) {
            var4 = this.field2418.field5067;
            var5 = this.field2418.field5039;
        } else if (arg0 == 4) {
            var4 = this.field2418.field4997;
            var5 = this.field2418.field5027;
        } else if (arg0 == 5) {
            var5 = this.field2418.field5026;
            var4 = this.field2418.field5037;
        } else {
            var4 = var5 = new class178(this.field2418);
        }
        return this.method1171(var5, arg1, 0, arg0 != 0, arg2, var4);
    }

    @OriginalMember(owner = "client!ml", name = "aa", descriptor = "(SS)V")
    public final void method1148(short arg0, short arg1) {
        field2422++;
        class268 var3 = this.field2418.field7694;
        for (int var4 = 0; var4 < this.field2446; var4++) {
            if (this.field2523[var4] == arg0) {
                this.field2523[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class468 var7 = var3.method91(arg0 & 0xFFFF, -22805);
            var6 = var7.field6399;
            var5 = var7.field6381;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class468 var10 = var3.method91(arg1 & 0xFFFF, -22805);
            if (var10.field6388 != 0 || var10.field6390 != 0) {
                this.field2413 = true;
            }
            var9 = var10.field6399;
            var8 = var10.field6381;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field2429 != null) {
            for (int var11 = 0; var11 < this.field2433; var11++) {
                class253 var12 = this.field2429[var11];
                class37 var13 = this.field2520[var11];
                var13.field519 = class673.field9471[this.field2477[var12.field3496] & 0xFFFF] & 0xFFFFFF | var13.field519 & 0xFF000000;
            }
        }
        if (this.field2474 != null) {
            this.field2474.field4220 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIII)V")
    public final void method1149(int arg0, int arg1, int arg2, int arg3) {
        field2498++;
        for (int var5 = 0; var5 < this.field2446; var5++) {
            int var9 = this.field2477[var5] & 0xFFFF;
            int var10 = (var9 & 0xFD7C) >> 10;
            int var11 = (var9 & 0x3EB) >> 7;
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 -= -((arg0 - var10) * arg3 >> 7);
            }
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field2477[var5] = (short) class747.method4153(class747.method4153(var11 << 7, var10 << 10), var12);
        }
        if (this.field2429 != null) {
            for (int var6 = 0; var6 < this.field2433; var6++) {
                class253 var7 = this.field2429[var6];
                class37 var8 = this.field2520[var6];
                var8.field519 = class673.field9471[this.field2477[var7.field3496] & 0xFFFF] & 0xFFFFFF | var8.field519 & 0xFF000000;
            }
        }
        if (this.field2474 != null) {
            this.field2474.field4220 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "()V")
    public final void method1150() {
        field2497++;
        for (int var1 = 0; var1 < this.field2449; var1++) {
            this.field2513[var1] = -this.field2513[var1];
        }
        for (int var2 = 0; var2 < this.field2452; var2++) {
            this.field2423[var2] = (short) (-this.field2423[var2]);
        }
        for (int var3 = 0; var3 < this.field2446; var3++) {
            short var4 = this.field2502[var3];
            this.field2502[var3] = this.field2409[var3];
            this.field2409[var3] = var4;
        }
        if (this.field2519 == null && this.field2474 != null) {
            this.field2474.field4220 = null;
        }
        if (this.field2519 != null) {
            this.field2519.field4220 = null;
        }
        this.field2486 = false;
        if (this.field2407 != null) {
            this.field2407.field3823 = null;
        }
        if (this.field2405 != null) {
            this.field2405.field4220 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILuha;ZII)Z")
    public final boolean method1151(int arg0, int arg1, class723 arg2, boolean arg3, int arg4, int arg5) {
        field2468++;
        return this.method1170((byte) 81, arg5, arg4, arg2, arg1, arg0, arg3);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method1152(class283 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2464++;
        class178 var6 = (class178) arg0;
        if (this.field2446 == 0 || var6.field2446 == 0) {
            return;
        }
        int var7 = var6.field2449;
        int[] var8 = var6.field2440;
        int[] var9 = var6.field2417;
        int[] var10 = var6.field2513;
        short[] var11 = var6.field2478;
        short[] var12 = var6.field2426;
        short[] var13 = var6.field2423;
        byte[] var14 = var6.field2411;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field2436 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var17 = this.field2436.field3123;
            var15 = this.field2436.field3114;
            var18 = this.field2436.field3111;
            var16 = this.field2436.field3112;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        byte[] var22;
        if (var6.field2436 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var20 = var6.field2436.field3112;
            var21 = var6.field2436.field3123;
            var19 = var6.field2436.field3111;
            var22 = var6.field2436.field3114;
        }
        int[] var23 = var6.field2414;
        short[] var24 = var6.field2517;
        if (!var6.field2486) {
            var6.method1156(0);
        }
        short var25 = var6.field2499;
        short var26 = var6.field2496;
        short var27 = var6.field2441;
        short var28 = var6.field2424;
        short var29 = var6.field2427;
        short var30 = var6.field2447;
        for (int var31 = 0; var31 < this.field2449; var31++) {
            int var32 = this.field2417[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field2440[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field2513[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field2414[var31];
                        int var37 = this.field2414[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field2517[var38] - 1;
                            if (var35 == -1 || this.field2411[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39];
                                    int var41 = var23[var39 + 1];
                                    int var42 = -1;
                                    for (int var43 = var40; var43 < var41; var43++) {
                                        var42 = var24[var43] - 1;
                                        if (var42 == -1 || var14[var42] != 0) {
                                            break;
                                        }
                                    }
                                    if (var42 != -1) {
                                        if (var16 == null) {
                                            this.field2436 = new class222();
                                            var16 = this.field2436.field3112 = class347.method1985(0, this.field2478);
                                            var18 = this.field2436.field3111 = class347.method1985(0, this.field2426);
                                            var17 = this.field2436.field3123 = class347.method1985(0, this.field2423);
                                            var15 = this.field2436.field3114 = class82.method486(-28, this.field2411);
                                        }
                                        if (var20 == null) {
                                            class222 var44 = var6.field2436 = new class222();
                                            var20 = var44.field3112 = class347.method1985(0, var11);
                                            var19 = var44.field3111 = class347.method1985(0, var12);
                                            var21 = var44.field3123 = class347.method1985(0, var13);
                                            var22 = var44.field3114 = class82.method486(89, var14);
                                        }
                                        short var45 = this.field2478[var35];
                                        short var46 = this.field2426[var35];
                                        short var47 = this.field2423[var35];
                                        int var48 = var23[var39];
                                        int var49 = var23[var39 + 1];
                                        byte var50 = this.field2411[var35];
                                        for (int var51 = var48; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var20[var52] += var45;
                                                var19[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var50;
                                            }
                                        }
                                        int var53 = this.field2414[var31 + 1];
                                        byte var54 = var14[var42];
                                        short var55 = var12[var42];
                                        short var56 = var11[var42];
                                        short var57 = var13[var42];
                                        int var58 = this.field2414[var31];
                                        for (int var59 = var58; var59 < var53; var59++) {
                                            int var60 = this.field2517[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var16[var60] += var56;
                                                var18[var60] += var55;
                                                var17[var60] += var57;
                                                var15[var60] += var54;
                                            }
                                        }
                                        if (this.field2519 == null && this.field2474 != null) {
                                            this.field2474.field4220 = null;
                                        }
                                        if (this.field2519 != null) {
                                            this.field2519.field4220 = null;
                                        }
                                        if (var6.field2519 == null && var6.field2474 != null) {
                                            var6.field2474.field4220 = null;
                                        }
                                        if (var6.field2519 != null) {
                                            var6.field2519.field4220 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "()Z")
    public final boolean method1153() {
        field2479++;
        if (this.field2523 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field2523.length; var1++) {
            if (this.field2523[var1] != -1 && !this.field2418.field7694.method86((byte) 117, this.field2523[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "(IILs;Ls;III)V")
    public final void method1154(int arg0, int arg1, class339 arg2, class339 arg3, int arg4, int arg5, int arg6) {
        field2475++;
        if (!this.field2486) {
            this.method1156(0);
        }
        int var8 = this.field2441 + arg4;
        int var9 = this.field2424 + arg4;
        int var10 = this.field2427 + arg6;
        int var11 = arg6 + this.field2447;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field4346 + var9 >> arg2.field4349 >= arg2.field4344 || var10 < 0 || (arg2.field4346 + var11 >> arg2.field4349) >= arg2.field4348) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field4344 <= arg3.field4346 + var9 >> arg3.field4349 || var10 < 0 || arg3.field4348 <= var11 + arg3.field4346 >> arg3.field4349) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field4349;
            int var13 = var9 + arg2.field4346 - 1 >> arg2.field4349;
            int var14 = var10 >> arg2.field4349;
            int var15 = var11 + arg2.field4346 - 1 >> arg2.field4349;
            if (arg5 == arg2.method1959(126, var14, var12) && arg5 == arg2.method1959(125, var14, var13) && arg2.method1959(124, var15, var12) == arg5 && arg5 == arg2.method1959(125, var15, var13)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field2449; var16++) {
                this.field2417[var16] += arg2.method1960(this.field2440[var16] + arg4, this.field2513[var16] - -arg6, 117) - arg5;
            }
        } else if (arg0 == 2) {
            short var17 = this.field2499;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field2449; var18++) {
                int var19 = (this.field2417[var18] << 16) / var17;
                if (arg1 > var19) {
                    this.field2417[var18] -= -((arg2.method1960(this.field2440[var18] + arg4, this.field2513[var18] - -arg6, 125) - arg5) * (arg1 - var19) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var20 = (arg1 & 0xFF) * 4;
            int var21 = (arg1 >> 8 & 0xFF) * 4;
            int var22 = arg1 >> 16 & 0xFF << 6;
            int var23 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var20 >> 1) < 0 || (arg2.field4346 + arg4 + (var20 >> 1)) >= (arg2.field4344 << arg2.field4349) || (arg6 - (var21 >> 1)) < 0 || (arg2.field4348 << arg2.field4349) <= ((var21 >> 1) + arg6 + arg2.field4346)) {
                return;
            }
            this.method1694(arg6, var23, (byte) -53, var22, arg2, arg5, var21, arg4, var20);
        } else if (arg0 == 4) {
            int var31 = this.field2496 - this.field2499;
            for (int var32 = 0; var32 < this.field2449; var32++) {
                this.field2417[var32] = this.field2417[var32] + var31 + arg3.method1960(this.field2440[var32] + arg4, this.field2513[var32] + arg6, 127) - arg5;
            }
        } else if (arg0 == 5) {
            int var24 = this.field2496 - this.field2499;
            for (int var25 = 0; var25 < this.field2449; var25++) {
                int var26 = this.field2440[var25] + arg4;
                int var27 = this.field2513[var25] + arg6;
                int var28 = arg2.method1960(var26, var27, 123);
                int var29 = arg3.method1960(var26, var27, 121);
                int var30 = var28 - arg1 - var29;
                this.field2417[var25] = ((this.field2417[var25] << 8) / var24 * var30 >> 8) + var28 - arg5;
            }
        }
        if (this.field2405 != null) {
            this.field2405.field4220 = null;
        }
        this.field2486 = false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILuha;ZI)Z")
    public final boolean method1155(int arg0, int arg1, class723 arg2, boolean arg3, int arg4) {
        field2459++;
        return this.method1170((byte) -99, -1, arg4, arg2, arg1, arg0, arg3);
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V")
    private final void method1156(int arg0) {
        field2493++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = arg0;
        for (int var10 = 0; var10 < this.field2449; var10++) {
            int var11 = this.field2440[var10];
            int var12 = this.field2417[var10];
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = this.field2513[var10];
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var12 * var12 + (var11 * var11 + (var13 * var13));
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field2427 = (short) var4;
        this.field2496 = (short) var6;
        this.field2441 = (short) var2;
        this.field2447 = (short) var7;
        this.field2424 = (short) var5;
        this.field2499 = (short) var3;
        this.field2506 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field2437 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field2486 = true;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZ)V")
    private final void method1157(int arg0, boolean arg1) {
        field2526++;
        boolean var3 = this.field2474 != null && this.field2474.field4220 == null;
        boolean var4 = this.field2519 != null && this.field2519.field4220 == null;
        boolean var5 = this.field2405 != null && this.field2405.field4220 == null;
        boolean var6 = this.field2469 != null && this.field2469.field4220 == null;
        if (arg1) {
            var4 &= (this.field2524 & 0x4) != 0;
            var5 &= (this.field2524 & 0x1) != 0;
            var3 &= (this.field2524 & 0x2) != 0;
            var6 &= (this.field2524 & 0x8) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        byte var11 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var3) {
            var9 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (var4) {
            var10 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var11 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (arg0 == var7) {
            return;
        }
        if (this.field2418.field5033.field279.length >= this.field2452 * var7) {
            this.field2418.field5033.field330 = 0;
        } else {
            this.field2418.field5033 = new class128((this.field2452 + 100) * var7);
        }
        class128 var12 = this.field2418.field5033;
        if (var5) {
            if (this.field2418.field4992) {
                for (int var13 = 0; var13 < this.field2449; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field2440[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field2417[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field2513[var13]);
                    int var17 = this.field2414[var13];
                    int var18 = this.field2414[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field2517[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field330 = var7 * var20;
                        var12.method199(true, var14);
                        var12.method199(true, var15);
                        var12.method199(true, var16);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field2449; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field2440[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field2417[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field2513[var21]);
                    int var25 = this.field2414[var21];
                    int var26 = this.field2414[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field2517[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field330 = var7 * var28;
                        var12.method160(false, var22);
                        var12.method160(false, var23);
                        var12.method160(false, var24);
                    }
                }
            }
        }
        if (var3) {
            if (this.field2519 == null) {
                byte[] var29;
                short[] var30;
                short[] var31;
                short[] var32;
                if (this.field2436 == null) {
                    var29 = this.field2411;
                    var30 = this.field2478;
                    var31 = this.field2423;
                    var32 = this.field2426;
                } else {
                    var29 = this.field2436.field3114;
                    var30 = this.field2436.field3112;
                    var31 = this.field2436.field3123;
                    var32 = this.field2436.field3111;
                }
                float var33 = this.field2418.field5022[0];
                float var34 = this.field2418.field5022[1];
                float var35 = this.field2418.field5022[2];
                float var36 = this.field2418.field5046;
                float var37 = this.field2418.field4987 * 768.0F / (float) this.field2408;
                float var38 = this.field2418.field5008 * 768.0F / (float) this.field2408;
                for (int var39 = 0; var39 < this.field2446; var39++) {
                    int var40 = this.method1163(this.field2471, this.field2523[var39], this.field2477[var39], this.field2500[var39], 16711680);
                    short var41 = this.field2502[var39];
                    float var42 = (float) (var40 >>> 24) * this.field2418.field5015;
                    float var43 = (float) (var40 >> 16 & 0xFF) * this.field2418.field5024;
                    float var44 = (float) ((var40 & 0xFF7B) >> 8) * this.field2418.field5035;
                    short var45 = (short) var29[var41];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var31[var41] * var35 + (float) var30[var41] * var33 + (float) var32[var41] * var34) * 0.0026041667F;
                    } else {
                        var46 = ((float) var31[var41] * var35 + (float) var30[var41] * var33 + (float) var32[var41] * var34) / (float) (var45 * 256);
                    }
                    float var47 = ((var46 < 0.0F) ? var38 : var37) * var46 + var36;
                    int var48 = (int) (var42 * var47);
                    int var49 = (int) (var43 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var50 = (int) (var44 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    var12.field330 = var9 + (var7 * var41);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.method184(var48, -34);
                    var12.method184(var49, arg0 ^ 0xFFFFFF98);
                    var12.method184(var50, -54);
                    var12.method184(255 - (this.field2500[var39] & 0xFF), -40);
                    short var51 = this.field2431[var39];
                    short var52 = (short) var29[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var31[var51] * var35 + (float) var30[var51] * var33 + (float) var32[var51] * var34) * 0.0026041667F;
                    } else {
                        var53 = ((float) var31[var51] * var35 + (float) var30[var51] * var33 + (float) var32[var51] * var34) / (float) (var52 * 256);
                    }
                    float var54 = var36 + (var53 < 0.0F ? var38 : var37) * var53;
                    int var55 = (int) (var42 * var54);
                    int var56 = (int) (var43 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var57 = (int) (var44 * var54);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.field330 = var9 + (var7 * var51);
                    var12.method184(var55, -43);
                    var12.method184(var56, -100);
                    var12.method184(var57, -100);
                    var12.method184(255 - (this.field2500[var39] & 0xFF), arg0 + -43);
                    short var58 = this.field2409[var39];
                    short var59 = (short) var29[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var31[var58] * var35 + (float) var30[var58] * var33 + (float) var32[var58] * var34) * 0.0026041667F;
                    } else {
                        var60 = ((float) var31[var58] * var35 + (float) var30[var58] * var33 + (float) var32[var58] * var34) / (float) (var59 * 256);
                    }
                    float var61 = var36 + var60 * (var60 < 0.0F ? var38 : var37);
                    int var62 = (int) (var42 * var61);
                    int var63 = (int) (var43 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var64 = (int) (var44 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    var12.field330 = var7 * var58 + var9;
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.method184(var62, arg0 - 68);
                    var12.method184(var63, arg0 ^ 0xFFFFFF8E);
                    var12.method184(var64, -37);
                    var12.method184(255 - (this.field2500[var39] & 0xFF), -83);
                }
            } else {
                for (int var65 = 0; var65 < this.field2446; var65++) {
                    int var66 = this.method1163(this.field2471, this.field2523[var65], this.field2477[var65], this.field2500[var65], arg0 ^ 0xFF0000);
                    var12.field330 = this.field2502[var65] * var7 + var9;
                    var12.method199(true, var66);
                    var12.field330 = this.field2431[var65] * var7 + var9;
                    var12.method199(true, var66);
                    var12.field330 = var9 + (this.field2409[var65] * var7);
                    var12.method199(true, var66);
                }
            }
        }
        if (var4) {
            short[] var67;
            byte[] var68;
            short[] var69;
            short[] var70;
            if (this.field2436 == null) {
                var67 = this.field2478;
                var68 = this.field2411;
                var69 = this.field2426;
                var70 = this.field2423;
            } else {
                var67 = this.field2436.field3112;
                var70 = this.field2436.field3123;
                var68 = this.field2436.field3114;
                var69 = this.field2436.field3111;
            }
            float var71 = 3.0F / (float) this.field2408;
            float var72 = 3.0F / (float) (this.field2408 + (this.field2408 / 2));
            var12.field330 = var10;
            if (this.field2418.field4992) {
                for (int var76 = 0; var76 < this.field2452; var76++) {
                    int var77 = var68[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method821((float) var67[var76] * var72, 856244488);
                        var12.method821((float) var69[var76] * var72, 856244488);
                        var12.method821((float) var70[var76] * var72, 856244488);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method821((float) var67[var76] * var78, 856244488);
                        var12.method821((float) var69[var76] * var78, 856244488);
                        var12.method821((float) var70[var76] * var78, 856244488);
                    }
                    var12.field330 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field2452; var73++) {
                    int var74 = var68[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method820((byte) 108, (float) var67[var73] * var72);
                        var12.method820((byte) 104, (float) var69[var73] * var72);
                        var12.method820((byte) 117, (float) var70[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method820((byte) 100, (float) var67[var73] * var75);
                        var12.method820((byte) 111, (float) var69[var73] * var75);
                        var12.method820((byte) 101, (float) var70[var73] * var75);
                    }
                    var12.field330 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field330 = var11;
            if (this.field2418.field4992) {
                for (int var80 = 0; var80 < this.field2452; var80++) {
                    var12.method821(this.field2483[var80], 856244488);
                    var12.method821(this.field2450[var80], 856244488);
                    var12.field330 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field2452; var79++) {
                    var12.method820((byte) 81, this.field2483[var79]);
                    var12.method820((byte) 89, this.field2450[var79]);
                    var12.field330 += var7 - 8;
                }
            }
        }
        var12.field330 = this.field2452 * var7;
        class227 var81;
        if (arg1) {
            if (this.field2461 == null) {
                this.field2461 = this.field2418.method2144(var12.field330, true, var12.field279, var7, -9);
            } else {
                this.field2461.method1471((byte) 100, var7, var12.field330, var12.field279);
            }
            var81 = this.field2461;
            this.field2524 = 0;
        } else {
            var81 = this.field2418.method2144(var12.field330, false, var12.field279, var7, -62);
            this.field2490 = true;
        }
        if (var5) {
            this.field2405.field4222 = var8;
            this.field2405.field4220 = var81;
        }
        if (var6) {
            this.field2469.field4222 = var11;
            this.field2469.field4220 = var81;
        }
        if (var3) {
            this.field2474.field4222 = var9;
            this.field2474.field4220 = var81;
        }
        if (var4) {
            this.field2519.field4222 = var10;
            this.field2519.field4220 = var81;
        }
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "()[Lhr;")
    public final class57[] method1158() {
        field2421++;
        return this.field2435;
    }

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "(I)V")
    public final void method1159(int arg0) {
        this.field2471 = (short) arg0;
        field2406++;
        if (this.field2474 != null) {
            this.field2474.field4220 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "()V")
    public final void method1160() {
        field2508++;
    }

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "(III)V")
    public final void method1161(int arg0, int arg1, int arg2) {
        field2521++;
        for (int var4 = 0; var4 < this.field2449; var4++) {
            if (arg0 != 128) {
                this.field2440[var4] = this.field2440[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field2417[var4] = this.field2417[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field2513[var4] = this.field2513[var4] * arg2 >> 7;
            }
        }
        if (this.field2405 != null) {
            this.field2405.field4220 = null;
        }
        this.field2486 = false;
    }

    @OriginalMember(owner = "client!ml", name = "LA", descriptor = "(I)V")
    public final void method1162(int arg0) {
        field2495++;
        this.field2408 = (short) arg0;
        if (this.field2474 != null) {
            this.field2474.field4220 = null;
        }
        if (this.field2519 != null) {
            this.field2519.field4220 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ISIBI)I")
    private final int method1163(int arg0, short arg1, int arg2, byte arg3, int arg4) {
        if (arg4 != 16711680) {
            this.field2502 = null;
        }
        field2457++;
        int var6 = class673.field9471[class228.method1477(arg2, arg0, (byte) -98)];
        if (arg1 != -1) {
            class468 var7 = this.field2418.field7694.method91(arg1 & 0xFFFF, arg4 - 16734485);
            int var8 = var7.field6381 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg0 < 0) {
                    var9 = 0;
                } else if (arg0 <= 127) {
                    var9 = arg0 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var9 & 0xFF00) * var8 + ((var6 & 0xFF00) * var11) & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field6399 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (var6 >> 8 & 0xFF) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = ((var13 & 0x9C00FF00) << 8) + (var15 >> 8) + (var14 & 0xFF00);
            }
        }
        return 255 - ((arg3 & 0xFF) - (var6 << 8));
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Luha;Lau;II)V")
    public final void method1164(class723 arg0, class247 arg1, int arg2, int arg3) {
        field2511++;
        if (this.field2452 == 0) {
            return;
        }
        class437 var5 = this.field2418.field4979;
        class437 var6 = (class437) arg0;
        if (!this.field2486) {
            this.method1156(0);
        }
        class172.field2327 = var5.field6000 * var6.field6001 + var5.field6008 * var6.field6012 + var5.field6007 * var6.field5998 + var5.field6001;
        class336.field4309 = var5.field6000 * var6.field6008 + var5.field6008 * var6.field6009 + var5.field6007 * var6.field5979;
        float var7 = (float) this.field2499 * class336.field4309 + class172.field2327;
        float var8 = (float) this.field2496 * class336.field4309 + class172.field2327;
        float var9;
        float var10;
        if ((var7 > var8)) {
            var9 = (float) (-this.field2506) + var8;
            var10 = (float) this.field2506 + var7;
        } else {
            var9 = (float) (-this.field2506) + var7;
            var10 = (float) this.field2506 + var8;
        }
        if ((var9 >= this.field2418.field5065) || ((float) this.field2418.field4988 >= var10)) {
            return;
        }
        class455.field6261 = var5.field5996 * var6.field6008 + var5.field5989 * var6.field5979 + var5.field5979 * var6.field6009;
        class337.field4338 = var5.field5996 * var6.field6001 + var5.field5989 * var6.field5998 + var5.field5979 * var6.field6012 + var5.field5998;
        float var11 = (float) this.field2499 * class455.field6261 + class337.field4338;
        float var12 = (float) this.field2496 * class455.field6261 + class337.field4338;
        float var13;
        float var14;
        if ((var12 < var11)) {
            var13 = (var12 - (float) this.field2506) * (float) this.field2418.field5023;
            var14 = ((float) this.field2506 + var11) * (float) this.field2418.field5023;
        } else {
            var13 = ((float) (-this.field2506) + var11) * (float) this.field2418.field5023;
            var14 = ((float) this.field2506 + var12) * (float) this.field2418.field5023;
        }
        if ((this.field2418.field5017 <= var13 / (float) arg2) || (this.field2418.field5013 >= var14 / (float) arg2)) {
            return;
        }
        class452.field6217 = var5.field5980 * var6.field6001 + var5.field6009 * var6.field6012 + var5.field5993 * var6.field5998 + var5.field6012;
        class330.field4239 = var5.field5980 * var6.field6008 + var5.field6009 * var6.field6009 + var5.field5993 * var6.field5979;
        float var15 = (float) this.field2499 * class330.field4239 + class452.field6217;
        float var16 = (float) this.field2496 * class330.field4239 + class452.field6217;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = ((float) this.field2506 + var15) * (float) this.field2418.field5006;
            var18 = (var16 - (float) this.field2506) * (float) this.field2418.field5006;
        } else {
            var18 = ((float) (-this.field2506) + var15) * (float) this.field2418.field5006;
            var17 = ((float) this.field2506 + var16) * (float) this.field2418.field5006;
        }
        if ((var18 / (float) arg2 >= this.field2418.field5058) || (var17 / (float) arg2 <= this.field2418.field5000)) {
            return;
        }
        if (arg1 != null || this.field2429 != null) {
            class405.field5624 = var5.field5980 * var6.field6000 + var5.field6009 * var6.field5980 + var5.field5993 * var6.field5996;
            class69.field981 = var5.field5980 * var6.field6007 + var5.field6009 * var6.field5993 + var5.field5993 * var6.field5989;
            class139.field1908 = var5.field6000 * var6.field6000 + var5.field6008 * var6.field5980 + var5.field6007 * var6.field5996;
            class512.field7157 = var5.field5996 * var6.field6007 + var5.field5989 * var6.field5989 + var5.field5979 * var6.field5993;
            class130.field1770 = var5.field6000 * var6.field6007 + var5.field6008 * var6.field5993 + var5.field6007 * var6.field5989;
            class346.field4406 = var5.field5996 * var6.field6000 + var5.field5989 * var6.field5996 + var5.field5979 * var6.field5980;
        }
        if (arg1 != null) {
            int var19 = this.field2441 + this.field2424 >> 1;
            int var20 = this.field2447 + this.field2427 >> 1;
            int var21 = (int) ((float) var20 * class346.field4406 + (float) this.field2499 * class455.field6261 + (float) var19 * class512.field7157 + class337.field4338);
            int var22 = (int) ((float) var20 * class405.field5624 + (float) this.field2499 * class330.field4239 + (float) var19 * class69.field981 + class452.field6217);
            int var23 = (int) ((float) var20 * class139.field1908 + (float) this.field2499 * class336.field4309 + (float) var19 * class130.field1770 + class172.field2327);
            int var24 = (int) ((float) var20 * class346.field4406 + (float) this.field2496 * class455.field6261 + (float) var19 * class512.field7157 + class337.field4338);
            int var25 = (int) ((float) var20 * class405.field5624 + (float) this.field2496 * class330.field4239 + (float) var19 * class69.field981 + class452.field6217);
            arg1.field3430 = this.field2418.field5023 * var24 / arg2 + this.field2418.field5070;
            arg1.field3433 = this.field2418.field5006 * var25 / arg2 + this.field2418.field5057;
            arg1.field3428 = this.field2418.field5023 * var21 / arg2 + this.field2418.field5070;
            arg1.field3429 = this.field2418.field5006 * var22 / arg2 + this.field2418.field5057;
            int var26 = (int) ((float) var20 * class139.field1908 + (float) this.field2496 * class336.field4309 + (float) var19 * class130.field1770 + class172.field2327);
            if (var23 >= this.field2418.field4988 || this.field2418.field4988 <= var26) {
                arg1.field3432 = (this.field2506 + var21) * this.field2418.field5023 / arg2 + this.field2418.field5070 - arg1.field3428;
                arg1.field3431 = true;
            }
        }
        this.field2418.method2075((float) arg2, (byte) -128);
        this.field2418.method2125((byte) -88);
        this.field2418.method2153(var6, (byte) 15);
        this.method1146((byte) 26);
        this.field2418.method2220(-109);
        this.method1121(1);
    }

    @OriginalMember(owner = "client!ml", name = "FA", descriptor = "(I)V")
    public final void method1165(int arg0) {
        field2463++;
        int var2 = class231.field3217[arg0];
        int var3 = class231.field3218[arg0];
        for (int var4 = 0; var4 < this.field2449; var4++) {
            int var5 = this.field2417[var4] * var3 - (this.field2513[var4] * var2) >> 14;
            this.field2513[var4] = this.field2417[var4] * var2 + (this.field2513[var4] * var3) >> 14;
            this.field2417[var4] = var5;
        }
        this.field2486 = false;
        if (this.field2405 != null) {
            this.field2405.field4220 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "(IIII)V")
    public final void method1166(int arg0, int arg1, int arg2, int arg3) {
        field2455++;
        if (arg0 == 0) {
            class401.field5552 = 0;
            class311.field3991 = 0;
            int var5 = 0;
            class691.field9673 = 0;
            for (int var6 = 0; var6 < this.field2449; var6++) {
                class311.field3991 += this.field2440[var6];
                class691.field9673 += this.field2417[var6];
                var5++;
                class401.field5552 += this.field2513[var6];
            }
            if (var5 > 0) {
                class311.field3991 = class311.field3991 / var5 + arg1;
                class401.field5552 = class401.field5552 / var5 + arg3;
                class691.field9673 = class691.field9673 / var5 + arg2;
            } else {
                class691.field9673 = arg2;
                class401.field5552 = arg3;
                class311.field3991 = arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field2449; var7++) {
                this.field2440[var7] += arg1;
                this.field2417[var7] += arg2;
                this.field2513[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field2449; var8++) {
                this.field2440[var8] -= class311.field3991;
                this.field2417[var8] -= class691.field9673;
                this.field2513[var8] -= class401.field5552;
                if (arg3 != 0) {
                    int var9 = class231.field3217[arg3];
                    int var10 = class231.field3218[arg3];
                    int var11 = this.field2440[var8] * var10 + this.field2417[var8] * var9 + 16383 >> 14;
                    this.field2417[var8] = this.field2417[var8] * var10 + 16383 - (this.field2440[var8] * var9) >> 14;
                    this.field2440[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class231.field3217[arg1];
                    int var13 = class231.field3218[arg1];
                    int var14 = this.field2417[var8] * var13 + 16383 - this.field2513[var8] * var12 >> 14;
                    this.field2513[var8] = this.field2417[var8] * var12 + (this.field2513[var8] * var13) + 16383 >> 14;
                    this.field2417[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class231.field3217[arg2];
                    int var16 = class231.field3218[arg2];
                    int var17 = this.field2513[var8] * var15 + this.field2440[var8] * var16 + 16383 >> 14;
                    this.field2513[var8] = this.field2513[var8] * var16 + 16383 - (this.field2440[var8] * var15) >> 14;
                    this.field2440[var8] = var17;
                }
                this.field2440[var8] += class311.field3991;
                this.field2417[var8] += class691.field9673;
                this.field2513[var8] += class401.field5552;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field2449; var18++) {
                this.field2440[var18] -= class311.field3991;
                this.field2417[var18] -= class691.field9673;
                this.field2513[var18] -= class401.field5552;
                this.field2440[var18] = this.field2440[var18] * arg1 / 128;
                this.field2417[var18] = this.field2417[var18] * arg2 / 128;
                this.field2513[var18] = this.field2513[var18] * arg3 / 128;
                this.field2440[var18] += class311.field3991;
                this.field2417[var18] += class691.field9673;
                this.field2513[var18] += class401.field5552;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field2446; var19++) {
                int var23 = (this.field2500[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field2500[var19] = (byte) var23;
            }
            if (this.field2474 != null) {
                this.field2474.field4220 = null;
            }
            if (this.field2429 != null) {
                for (int var20 = 0; var20 < this.field2433; var20++) {
                    class253 var21 = this.field2429[var20];
                    class37 var22 = this.field2520[var20];
                    var22.field519 = var22.field519 & 0xFFFFFF | 255 - (this.field2500[var21.field3496] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field2446; var24++) {
                int var28 = this.field2477[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x3CF) >> 7;
                int var31 = var28 & 0x7F;
                int var32 = var29 + arg1 & 0x3F;
                int var33 = arg2 / 4 + var30;
                int var34 = arg3 + var31;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field2477[var24] = (short) class747.method4153(var34, class747.method4153(var32 << 10, var33 << 7));
            }
            if (this.field2474 != null) {
                this.field2474.field4220 = null;
            }
            if (this.field2429 != null) {
                for (int var25 = 0; var25 < this.field2433; var25++) {
                    class253 var26 = this.field2429[var25];
                    class37 var27 = this.field2520[var25];
                    var27.field519 = var27.field519 & 0xFF000000 | class673.field9471[this.field2477[var26.field3496] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field2433; var35++) {
                class37 var36 = this.field2520[var35];
                var36.field520 += arg2;
                var36.field525 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field2433; var37++) {
                class37 var38 = this.field2520[var37];
                var38.field523 = var38.field523 * arg1 >> 7;
                var38.field526 = var38.field526 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field2433; var39++) {
                class37 var40 = this.field2520[var39];
                var40.field524 = var40.field524 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "VA", descriptor = "(I)V")
    public final void method1167(int arg0) {
        field2504++;
        int var2 = class231.field3217[arg0];
        int var3 = class231.field3218[arg0];
        for (int var4 = 0; var4 < this.field2449; var4++) {
            int var5 = this.field2417[var4] * var2 + (this.field2440[var4] * var3) >> 14;
            this.field2417[var4] = this.field2417[var4] * var3 - (this.field2440[var4] * var2) >> 14;
            this.field2440[var4] = var5;
        }
        if (this.field2405 != null) {
            this.field2405.field4220 = null;
        }
        this.field2486 = false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Luha;Lau;I)V")
    public final void method1168(class723 arg0, class247 arg1, int arg2) {
        field2481++;
        if (this.field2452 == 0) {
            return;
        }
        class437 var4 = this.field2418.field4979;
        class437 var5 = (class437) arg0;
        if (!this.field2486) {
            this.method1156(0);
        }
        class336.field4309 = var4.field6000 * var5.field6008 + var4.field6008 * var5.field6009 + var4.field6007 * var5.field5979;
        class172.field2327 = var4.field6000 * var5.field6001 + var4.field6008 * var5.field6012 + var4.field6007 * var5.field5998 + var4.field6001;
        float var6 = (float) this.field2499 * class336.field4309 + class172.field2327;
        float var7 = (float) this.field2496 * class336.field4309 + class172.field2327;
        float var8;
        float var9;
        if (var6 > var7) {
            var8 = (float) this.field2506 + var6;
            var9 = (float) (-this.field2506) + var7;
        } else {
            var8 = (float) this.field2506 + var7;
            var9 = var6 - (float) this.field2506;
        }
        if ((var9 >= this.field2418.field5091) || (var8 <= (float) this.field2418.field4988)) {
            return;
        }
        class337.field4338 = var4.field5996 * var5.field6001 + var4.field5989 * var5.field5998 + var4.field5979 * var5.field6012 + var4.field5998;
        class455.field6261 = var4.field5996 * var5.field6008 + var4.field5989 * var5.field5979 + var4.field5979 * var5.field6009;
        float var10 = (float) this.field2499 * class455.field6261 + class337.field4338;
        float var11 = (float) this.field2496 * class455.field6261 + class337.field4338;
        float var12;
        float var13;
        if ((var11 < var10)) {
            var13 = ((float) (-this.field2506) + var11) * (float) this.field2418.field5023;
            var12 = ((float) this.field2506 + var10) * (float) this.field2418.field5023;
        } else {
            var12 = ((float) this.field2506 + var11) * (float) this.field2418.field5023;
            var13 = (var10 - (float) this.field2506) * (float) this.field2418.field5023;
        }
        if ((this.field2418.field5017 <= var13 / var8) || (var12 / var8 <= this.field2418.field5013)) {
            return;
        }
        class330.field4239 = var4.field5980 * var5.field6008 + var4.field6009 * var5.field6009 + var4.field5993 * var5.field5979;
        class452.field6217 = var4.field5980 * var5.field6001 + var4.field6009 * var5.field6012 + var4.field5993 * var5.field5998 + var4.field6012;
        float var14 = (float) this.field2499 * class330.field4239 + class452.field6217;
        float var15 = (float) this.field2496 * class330.field4239 + class452.field6217;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = ((float) this.field2506 + var14) * (float) this.field2418.field5006;
            var17 = ((float) (-this.field2506) + var15) * (float) this.field2418.field5006;
        } else {
            var16 = ((float) this.field2506 + var15) * (float) this.field2418.field5006;
            var17 = (var14 - (float) this.field2506) * (float) this.field2418.field5006;
        }
        if ((var17 / var8 >= this.field2418.field5058) || (var16 / var8 <= this.field2418.field5000)) {
            return;
        }
        if (arg1 != null || this.field2429 != null) {
            class69.field981 = var4.field5980 * var5.field6007 + var4.field6009 * var5.field5993 + var4.field5993 * var5.field5989;
            class405.field5624 = var4.field5980 * var5.field6000 + var4.field6009 * var5.field5980 + var4.field5993 * var5.field5996;
            class512.field7157 = var4.field5996 * var5.field6007 + var4.field5989 * var5.field5989 + var4.field5979 * var5.field5993;
            class346.field4406 = var4.field5996 * var5.field6000 + var4.field5989 * var5.field5996 + var4.field5979 * var5.field5980;
            class139.field1908 = var4.field6000 * var5.field6000 + var4.field6008 * var5.field5980 + var4.field6007 * var5.field5996;
            class130.field1770 = var4.field6000 * var5.field6007 + var4.field6008 * var5.field5993 + var4.field6007 * var5.field5989;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field2441 + this.field2424 >> 1;
            int var21 = this.field2447 + this.field2427 >> 1;
            int var22 = (int) ((float) var21 * class346.field4406 + (float) this.field2499 * class455.field6261 + (float) var20 * class512.field7157 + class337.field4338);
            int var23 = (int) ((float) var21 * class405.field5624 + (float) this.field2499 * class330.field4239 + (float) var20 * class69.field981 + class452.field6217);
            int var24 = (int) ((float) var21 * class139.field1908 + (float) this.field2499 * class336.field4309 + (float) var20 * class130.field1770 + class172.field2327);
            if (this.field2418.field4988 <= var24) {
                arg1.field3429 = this.field2418.field5006 * var23 / var24 + this.field2418.field5057;
                arg1.field3428 = this.field2418.field5070 + (this.field2418.field5023 * var22 / var24);
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class346.field4406 + (float) this.field2496 * class455.field6261 + (float) var20 * class512.field7157 + class337.field4338);
            int var26 = (int) ((float) var21 * class405.field5624 + (float) this.field2496 * class330.field4239 + (float) var20 * class69.field981 + class452.field6217);
            int var27 = (int) ((float) var21 * class139.field1908 + (float) this.field2496 * class336.field4309 + (float) var20 * class130.field1770 + class172.field2327);
            if (var27 >= this.field2418.field4988) {
                arg1.field3430 = this.field2418.field5070 + (this.field2418.field5023 * var25 / var27);
                arg1.field3433 = this.field2418.field5006 * var26 / var27 + this.field2418.field5057;
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field2418.field4988 > var24 && var27 < this.field2418.field4988) {
                    var19 = false;
                } else if (this.field2418.field4988 > var24) {
                    int var28 = (var27 - this.field2418.field4988 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    int var30 = var26 + ((var26 - var23) * var28 >> 16);
                    arg1.field3428 = this.field2418.field5070 + (this.field2418.field5023 * var29 / this.field2418.field4988);
                    arg1.field3429 = this.field2418.field5057 + (this.field2418.field5006 * var30 / this.field2418.field4988);
                } else if (this.field2418.field4988 > var27) {
                    int var31 = (var24 - this.field2418.field4988 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field3428 = this.field2418.field5023 * var32 / this.field2418.field4988 + this.field2418.field5070;
                    arg1.field3429 = this.field2418.field5006 * var33 / this.field2418.field4988 + this.field2418.field5057;
                }
            }
            if (var19) {
                if (var27 >= var24) {
                    arg1.field3432 = this.field2418.field5070 + ((var25 - -this.field2506) * this.field2418.field5023 / var27) - arg1.field3430;
                } else {
                    arg1.field3432 = (this.field2506 + var22) * this.field2418.field5023 / var24 + this.field2418.field5070 - arg1.field3428;
                }
                arg1.field3431 = true;
            }
        }
        this.field2418.method2118(-125);
        this.field2418.method2153(var5, (byte) 15);
        this.method1146((byte) -113);
        this.field2418.method2220(-108);
        this.method1121(1);
    }

    @OriginalMember(owner = "client!ml", name = "RA", descriptor = "()I")
    public final int method1169() {
        if (!this.field2486) {
            this.method1156(0);
        }
        field2444++;
        return this.field2424;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BIILuha;IIZ)Z")
    private final boolean method1170(byte arg0, int arg1, int arg2, class723 arg3, int arg4, int arg5, boolean arg6) {
        field2438++;
        class437 var8 = (class437) arg3;
        class437 var9 = this.field2418.field4979;
        float var10 = var8.field6001 * var9.field5996 + var8.field6012 * var9.field5979 + var8.field5998 * var9.field5989 + var9.field5998;
        float var11 = var8.field6001 * var9.field5980 + var8.field6012 * var9.field6009 + var8.field5998 * var9.field5993 + var9.field6012;
        class130.field1770 = var8.field6007 * var9.field6000 + var8.field5993 * var9.field6008 + var8.field5989 * var9.field6007;
        class346.field4406 = var8.field6000 * var9.field5996 + var8.field5996 * var9.field5989 + var8.field5980 * var9.field5979;
        class336.field4309 = var8.field6008 * var9.field6000 + var8.field6009 * var9.field6008 + var8.field5979 * var9.field6007;
        class69.field981 = var8.field6007 * var9.field5980 + var8.field5993 * var9.field6009 + var8.field5989 * var9.field5993;
        class139.field1908 = var8.field6000 * var9.field6000 + var8.field5996 * var9.field6007 + var8.field5980 * var9.field6008;
        class512.field7157 = var8.field6007 * var9.field5996 + var8.field5993 * var9.field5979 + var8.field5989 * var9.field5989;
        float var12 = var8.field6001 * var9.field6000 + var8.field6012 * var9.field6008 + var8.field5998 * var9.field6007 + var9.field6001;
        class455.field6261 = var8.field6008 * var9.field5996 + var8.field6009 * var9.field5979 + var8.field5979 * var9.field5989;
        class405.field5624 = var8.field6000 * var9.field5980 + var8.field5996 * var9.field5993 + var8.field5980 * var9.field6009;
        class330.field4239 = var8.field6008 * var9.field5980 + var8.field6009 * var9.field6009 + var8.field5979 * var9.field5993;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field2418.field5023;
        int var19 = this.field2418.field5006;
        if (!this.field2486) {
            this.method1156(0);
        }
        int var20 = this.field2424 - this.field2441 >> 1;
        int var21 = this.field2496 - this.field2499 >> 1;
        int var22 = this.field2447 - this.field2427 >> 1;
        int var23 = this.field2441 + var20;
        int var24 = this.field2499 + var21;
        int var25 = this.field2427 + var22;
        int var26 = var23 - (var20 << arg2);
        int var27 = var24 - (var21 << arg2);
        int var28 = var25 - (var22 << arg2);
        int var29 = (var20 << arg2) + var23;
        int var30 = var24 + (var21 << arg2);
        int var31 = var25 + (var22 << arg2);
        class441.field6050[0] = var26;
        class460.field6319[0] = var27;
        class357.field4584[0] = var28;
        class441.field6050[1] = var29;
        class460.field6319[1] = var27;
        class357.field4584[1] = var28;
        class441.field6050[2] = var26;
        class460.field6319[2] = var30;
        class441.field6050[3] = var29;
        class357.field4584[2] = var28;
        class460.field6319[3] = var30;
        class441.field6050[4] = var26;
        class357.field4584[3] = var28;
        class460.field6319[4] = var27;
        class357.field4584[4] = var31;
        class441.field6050[5] = var29;
        class460.field6319[5] = var27;
        class441.field6050[6] = var26;
        int var32 = 58 / ((35 - arg0) / 42);
        class357.field4584[5] = var31;
        class460.field6319[6] = var30;
        class357.field4584[6] = var31;
        class441.field6050[7] = var29;
        class460.field6319[7] = var30;
        class357.field4584[7] = var31;
        for (int var33 = 0; var33 < 8; var33++) {
            float var54 = (float) class441.field6050[var33];
            float var55 = (float) class357.field4584[var33];
            float var56 = (float) class460.field6319[var33];
            float var57 = class346.field4406 * var55 + class512.field7157 * var54 + class455.field6261 * var56 + var10;
            float var58 = class139.field1908 * var55 + class336.field4309 * var56 + class130.field1770 * var54 + var12;
            float var59 = class405.field5624 * var55 + class69.field981 * var54 + class330.field4239 * var56 + var11;
            if (var58 >= (float) this.field2418.field4988) {
                if (arg1 > 0) {
                    var58 = arg1;
                }
                float var60 = (float) var18 * var57 / var58 + (float) this.field2418.field5070;
                if (var15 < var60) {
                    var15 = var60;
                }
                if (var60 < var14) {
                    var14 = var60;
                }
                float var61 = (float) var19 * var59 / var58 + (float) this.field2418.field5057;
                var13 = true;
                if (var61 < var16) {
                    var16 = var61;
                }
                if (var17 < var61) {
                    var17 = var61;
                }
            }
        }
        if (var13 && (float) arg5 > var14 && var15 > (float) arg5 && var16 < (float) arg4 && var17 > (float) arg4) {
            if (arg6) {
                return true;
            }
            if (this.field2418.field5100.length < this.field2452) {
                this.field2418.field5099 = new int[this.field2452];
                this.field2418.field5100 = new int[this.field2452];
            }
            int[] var34 = this.field2418.field5100;
            int[] var35 = this.field2418.field5099;
            for (int var36 = 0; var36 < this.field2449; var36++) {
                float var38 = (float) this.field2417[var36];
                float var39 = (float) this.field2513[var36];
                float var40 = (float) this.field2440[var36];
                float var41 = class405.field5624 * var39 + class69.field981 * var40 + class330.field4239 * var38 + var11;
                float var42 = class139.field1908 * var39 + class336.field4309 * var38 + class130.field1770 * var40 + var12;
                float var43 = class346.field4406 * var39 + class512.field7157 * var40 + class455.field6261 * var38 + var10;
                if (var42 >= (float) this.field2418.field4988) {
                    if (arg1 > 0) {
                        var42 = arg1;
                    }
                    int var44 = (int) ((float) var18 * var43 / var42 + (float) this.field2418.field5070);
                    int var45 = (int) ((float) var19 * var41 / var42 + (float) this.field2418.field5057);
                    int var46 = this.field2414[var36];
                    int var47 = this.field2414[var36 + 1];
                    for (int var48 = var46; var48 < var47; var48++) {
                        int var49 = this.field2517[var48] - 1;
                        if (var49 == -1) {
                            break;
                        }
                        var34[var49] = var44;
                        var35[var49] = var45;
                    }
                } else {
                    int var50 = this.field2414[var36];
                    int var51 = this.field2414[var36 + 1];
                    for (int var52 = var50; var52 < var51; var52++) {
                        int var53 = this.field2517[var52] - 1;
                        if (var53 == -1) {
                            break;
                        }
                        var34[this.field2517[var52] - 1] = -999999;
                    }
                }
            }
            for (int var37 = 0; var37 < this.field2446; var37++) {
                if (var34[this.field2502[var37]] != -999999 && var34[this.field2431[var37]] != -999999 && var34[this.field2409[var37]] != -999999 && this.method1115(var34[this.field2502[var37]], var34[this.field2431[var37]], var35[this.field2502[var37]], var35[this.field2409[var37]], arg5, var35[this.field2431[var37]], arg4, var34[this.field2409[var37]], (byte) -125)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lml;IIZZLml;)Lka;")
    private final class283 method1171(class178 arg0, int arg1, int arg2, boolean arg3, boolean arg4, class178 arg5) {
        if ((arg1 & 0x100) == 0) {
            arg5.field2470 = this.field2470;
        } else {
            arg5.field2470 = true;
        }
        arg5.field2524 = 0;
        arg5.field2434 = this.field2434;
        arg5.field2471 = this.field2471;
        arg5.field2428 = this.field2428;
        arg5.field2433 = this.field2433;
        field2512++;
        arg5.field2446 = this.field2446;
        arg5.field2408 = this.field2408;
        arg5.field2445 = arg1;
        arg5.field2501 = this.field2501;
        arg5.field2413 = this.field2413;
        arg5.field2452 = this.field2452;
        arg5.field2449 = this.field2449;
        boolean var7 = class311.method1818(this.field2428, arg1, false);
        boolean var8 = class644.method3732(arg1, this.field2428, true);
        boolean var9 = class175.method1102(arg1, arg2, this.field2428);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg5.field2440 = this.field2440;
            } else if (arg0.field2440 == null || this.field2434 > arg0.field2440.length) {
                arg5.field2440 = arg0.field2440 = new int[this.field2434];
            } else {
                arg5.field2440 = arg0.field2440;
            }
            if (!var8) {
                arg5.field2417 = this.field2417;
            } else if (arg0.field2417 == null || this.field2434 > arg0.field2417.length) {
                arg5.field2417 = arg0.field2417 = new int[this.field2434];
            } else {
                arg5.field2417 = arg0.field2417;
            }
            if (!var9) {
                arg5.field2513 = this.field2513;
            } else if (arg0.field2513 == null || arg0.field2513.length < this.field2434) {
                arg5.field2513 = arg0.field2513 = new int[this.field2434];
            } else {
                arg5.field2513 = arg0.field2513;
            }
            for (int var11 = 0; var11 < this.field2434; var11++) {
                if (var7) {
                    arg5.field2440[var11] = this.field2440[var11];
                }
                if (var8) {
                    arg5.field2417[var11] = this.field2417[var11];
                }
                if (var9) {
                    arg5.field2513[var11] = this.field2513[var11];
                }
            }
        } else {
            arg5.field2513 = this.field2513;
            arg5.field2440 = this.field2440;
            arg5.field2417 = this.field2417;
        }
        if (class731.method4068(this.field2428, arg2 ^ 0xF372EE90, arg1)) {
            if (arg3) {
                arg5.field2524 = (byte) (arg5.field2524 | 0x1);
            }
            arg5.field2405 = arg0.field2405;
            arg5.field2405.field4222 = this.field2405.field4222;
            arg5.field2405.field4220 = this.field2405.field4220;
        } else if (class40.method267(arg1, 0, this.field2428)) {
            arg5.field2405 = this.field2405;
        } else {
            arg5.field2405 = null;
        }
        if (class90.method546(this.field2428, 7804, arg1)) {
            if (arg0.field2477 == null || arg0.field2477.length < this.field2446) {
                arg5.field2477 = arg0.field2477 = new short[this.field2446];
            } else {
                arg5.field2477 = arg0.field2477;
            }
            for (int var12 = 0; var12 < this.field2446; var12++) {
                arg5.field2477[var12] = this.field2477[var12];
            }
        } else {
            arg5.field2477 = this.field2477;
        }
        if (class41.method285(this.field2428, (byte) 84, arg1)) {
            if (arg0.field2500 == null || this.field2446 > arg0.field2500.length) {
                arg5.field2500 = arg0.field2500 = new byte[this.field2446];
            } else {
                arg5.field2500 = arg0.field2500;
            }
            for (int var13 = 0; var13 < this.field2446; var13++) {
                arg5.field2500[var13] = this.field2500[var13];
            }
        } else {
            arg5.field2500 = this.field2500;
        }
        if (class164.method1020(-1, this.field2428, arg1)) {
            if (arg3) {
                arg5.field2524 = (byte) (arg5.field2524 | 0x2);
            }
            arg5.field2474 = arg0.field2474;
            arg5.field2474.field4222 = this.field2474.field4222;
            arg5.field2474.field4220 = this.field2474.field4220;
        } else if (class636.method3699(-1, arg1, this.field2428)) {
            arg5.field2474 = this.field2474;
        } else {
            arg5.field2474 = null;
        }
        if (class721.method4051(arg1, (byte) -90, this.field2428)) {
            if (arg0.field2478 == null || this.field2452 > arg0.field2478.length) {
                int var14 = this.field2452;
                arg5.field2423 = arg0.field2423 = new short[var14];
                arg5.field2426 = arg0.field2426 = new short[var14];
                arg5.field2478 = arg0.field2478 = new short[var14];
            } else {
                arg5.field2423 = arg0.field2423;
                arg5.field2426 = arg0.field2426;
                arg5.field2478 = arg0.field2478;
            }
            if (this.field2436 == null) {
                for (int var15 = 0; var15 < this.field2452; var15++) {
                    arg5.field2478[var15] = this.field2478[var15];
                    arg5.field2426[var15] = this.field2426[var15];
                    arg5.field2423[var15] = this.field2423[var15];
                }
            } else {
                if (arg0.field2436 == null) {
                    arg0.field2436 = new class222();
                }
                class222 var16 = arg5.field2436 = arg0.field2436;
                if (var16.field3112 == null || this.field2452 > var16.field3112.length) {
                    int var17 = this.field2452;
                    var16.field3114 = new byte[var17];
                    var16.field3111 = new short[var17];
                    var16.field3123 = new short[var17];
                    var16.field3112 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field2452; var18++) {
                    arg5.field2478[var18] = this.field2478[var18];
                    arg5.field2426[var18] = this.field2426[var18];
                    arg5.field2423[var18] = this.field2423[var18];
                    var16.field3112[var18] = this.field2436.field3112[var18];
                    var16.field3111[var18] = this.field2436.field3111[var18];
                    var16.field3123[var18] = this.field2436.field3123[var18];
                    var16.field3114[var18] = this.field2436.field3114[var18];
                }
            }
            arg5.field2411 = this.field2411;
        } else {
            arg5.field2478 = this.field2478;
            arg5.field2436 = this.field2436;
            arg5.field2426 = this.field2426;
            arg5.field2411 = this.field2411;
            arg5.field2423 = this.field2423;
        }
        if (class570.method3410(arg1, this.field2428, (byte) 123)) {
            if (arg3) {
                arg5.field2524 = (byte) (arg5.field2524 | 0x4);
            }
            arg5.field2519 = arg0.field2519;
            arg5.field2519.field4220 = this.field2519.field4220;
            arg5.field2519.field4222 = this.field2519.field4222;
        } else if (class90.method543(arg1, this.field2428, 0)) {
            arg5.field2519 = this.field2519;
        } else {
            arg5.field2519 = null;
        }
        if (class471.method2804(arg1, (byte) -97, this.field2428)) {
            if (arg0.field2483 == null || arg0.field2483.length < this.field2446) {
                int var19 = this.field2452;
                arg5.field2450 = arg0.field2450 = new float[var19];
                arg5.field2483 = arg0.field2483 = new float[var19];
            } else {
                arg5.field2483 = arg0.field2483;
                arg5.field2450 = arg0.field2450;
            }
            for (int var20 = 0; var20 < this.field2452; var20++) {
                arg5.field2483[var20] = this.field2483[var20];
                arg5.field2450[var20] = this.field2450[var20];
            }
        } else {
            arg5.field2483 = this.field2483;
            arg5.field2450 = this.field2450;
        }
        if (class424.method2582(arg1, this.field2428, arg2)) {
            if (arg3) {
                arg5.field2524 = (byte) (arg5.field2524 | 0x8);
            }
            arg5.field2469 = arg0.field2469;
            arg5.field2469.field4222 = this.field2469.field4222;
            arg5.field2469.field4220 = this.field2469.field4220;
        } else if (class190.method1262((byte) -23, this.field2428, arg1)) {
            arg5.field2469 = this.field2469;
        } else {
            arg5.field2469 = null;
        }
        if (class526.method3135((byte) -113, this.field2428, arg1)) {
            if (arg0.field2502 == null || this.field2446 > arg0.field2502.length) {
                int var21 = this.field2446;
                arg5.field2502 = arg0.field2502 = new short[var21];
                arg5.field2409 = arg0.field2409 = new short[var21];
                arg5.field2431 = arg0.field2431 = new short[var21];
            } else {
                arg5.field2409 = arg0.field2409;
                arg5.field2431 = arg0.field2431;
                arg5.field2502 = arg0.field2502;
            }
            for (int var22 = 0; var22 < this.field2446; var22++) {
                arg5.field2502[var22] = this.field2502[var22];
                arg5.field2431[var22] = this.field2431[var22];
                arg5.field2409[var22] = this.field2409[var22];
            }
        } else {
            arg5.field2502 = this.field2502;
            arg5.field2431 = this.field2431;
            arg5.field2409 = this.field2409;
        }
        if (class676.method3875(this.field2428, 99, arg1)) {
            if (arg3) {
                arg5.field2524 = (byte) (arg5.field2524 | 0x10);
            }
            arg5.field2407 = arg0.field2407;
            arg5.field2407.field3823 = this.field2407.field3823;
        } else if (class442.method2640(3, arg1, this.field2428)) {
            arg5.field2407 = this.field2407;
        } else {
            arg5.field2407 = null;
        }
        if (class54.method363((byte) 120, arg1, this.field2428)) {
            if (arg0.field2523 == null || arg0.field2523.length < this.field2446) {
                int var23 = this.field2446;
                arg5.field2523 = arg0.field2523 = new short[var23];
            } else {
                arg5.field2523 = arg0.field2523;
            }
            for (int var24 = 0; var24 < this.field2446; var24++) {
                arg5.field2523[var24] = this.field2523[var24];
            }
        } else {
            arg5.field2523 = this.field2523;
        }
        if (!class220.method1440(arg1, this.field2428, (byte) 112)) {
            arg5.field2520 = this.field2520;
        } else if (arg0.field2520 == null || arg0.field2520.length < this.field2433) {
            int var26 = this.field2433;
            arg5.field2520 = arg0.field2520 = new class37[var26];
            for (int var27 = 0; var27 < this.field2433; var27++) {
                arg5.field2520[var27] = this.field2520[var27].method260((byte) -51);
            }
        } else {
            arg5.field2520 = arg0.field2520;
            for (int var25 = 0; var25 < this.field2433; var25++) {
                arg5.field2520[var25].method261(arg2 ^ 0x7D, this.field2520[var25]);
            }
        }
        arg5.field2429 = this.field2429;
        arg5.field2435 = this.field2435;
        arg5.field2491 = this.field2491;
        arg5.field2494 = this.field2494;
        arg5.field2473 = this.field2473;
        if (this.field2486) {
            arg5.field2441 = this.field2441;
            arg5.field2424 = this.field2424;
            arg5.field2447 = this.field2447;
            arg5.field2437 = this.field2437;
            arg5.field2486 = true;
            arg5.field2427 = this.field2427;
            arg5.field2496 = this.field2496;
            arg5.field2506 = this.field2506;
            arg5.field2499 = this.field2499;
        } else {
            arg5.field2486 = false;
        }
        arg5.field2517 = this.field2517;
        arg5.field2414 = this.field2414;
        arg5.field2488 = this.field2488;
        arg5.field2516 = this.field2516;
        arg5.field2510 = this.field2510;
        arg5.field2439 = this.field2439;
        return arg5;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lep;)V")
    public class178(class371 arg0) {
        this.field2418 = arg0;
        this.field2405 = new class329(null, 5126, 3, 0);
        this.field2469 = new class329(null, 5126, 2, 0);
        this.field2519 = new class329(null, 5126, 3, 0);
        this.field2474 = new class329(null, 5121, 4, 0);
        this.field2407 = new class292();
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lep;Lkda;IIII)V")
    public class178(class371 arg0, class64 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2428 = arg5;
        this.field2445 = arg2;
        this.field2418 = arg0;
        if (class40.method267(arg2, 0, arg5)) {
            this.field2405 = new class329(null, 5126, 3, 0);
        }
        if (class190.method1262((byte) -23, arg5, arg2)) {
            this.field2469 = new class329(null, 5126, 2, 0);
        }
        if (class90.method543(arg2, arg5, 0)) {
            this.field2519 = new class329(null, 5126, 3, 0);
        }
        if (class636.method3699(-1, arg2, arg5)) {
            this.field2474 = new class329(null, 5121, 4, 0);
        }
        if (class442.method2640(3, arg2, arg5)) {
            this.field2407 = new class292();
        }
        class268 var7 = arg0.field7694;
        this.field2414 = new int[arg1.field874 + 1];
        int[] var8 = new int[arg1.field851];
        for (int var9 = 0; var9 < arg1.field851; var9++) {
            if (arg1.field858 == null || arg1.field858[var9] != 2) {
                if (arg1.field859 != null && arg1.field859[var9] != -1) {
                    class468 var173 = var7.method91(arg1.field859[var9] & 0xFFFF, -22805);
                    if (((this.field2428 & 0x40) == 0 || !var173.field6389) && var173.field6383) {
                        continue;
                    }
                }
                var8[this.field2446++] = var9;
                this.field2414[arg1.field863[var9]]++;
                this.field2414[arg1.field865[var9]]++;
                this.field2414[arg1.field852[var9]]++;
            }
        }
        this.field2501 = this.field2446;
        long[] var10 = new long[this.field2446];
        boolean var11 = (this.field2445 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field2446; var12++) {
            int var156 = var8[var12];
            class468 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field879 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field879.length; var163++) {
                    class9 var164 = arg1.field879[var163];
                    if (var164.field83 == var156) {
                        class501 var165 = class67.method435(110, var164.field86);
                        if (var165.field7002) {
                            var162 = true;
                        }
                        if (var165.field7004 != -1) {
                            class468 var166 = var7.method91(var165.field7004, -22805);
                            if (var166.field6393 == 2) {
                                this.field2470 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field2501--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field859 != null) {
                var167 = arg1.field859[var156];
                if (var167 != -1) {
                    var157 = var7.method91(var167 & 0xFFFF, -22805);
                    if ((this.field2428 & 0x40) != 0 && var157.field6389) {
                        var167 = -1;
                        var157 = null;
                    } else {
                        var160 = var157.field6386;
                        var161 = var157.field6398;
                        if (var157.field6388 != 0 || var157.field6390 != 0) {
                            this.field2413 = true;
                        }
                    }
                }
            }
            boolean var168 = arg1.field864 != null && arg1.field864[var156] != 0 || var157 != null && var157.field6393 != 0;
            if ((var11 || var168) && arg1.field860 != null) {
                var158 += arg1.field860[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = ((var160 & 0xFF) << 8) + var158;
            int var170 = (var167 & 0xFFFF << 16) + var159;
            int var171 = (var161 & 0xFF) + var169;
            int var172 = (var12 & 0xFFFF) + var170;
            var10[var12] = ((long) var171 << 32) + (long) var172;
            this.field2470 |= var168;
            this.field2413 |= var157 != null && (var157.field6388 != 0 || var157.field6390 != 0);
        }
        class13.method71(var10, var8, -1);
        this.field2473 = arg1.field861;
        this.field2440 = arg1.field876;
        this.field2513 = arg1.field884;
        this.field2449 = arg1.field874;
        this.field2434 = arg1.field866;
        this.field2417 = arg1.field887;
        class566[] var13 = new class566[this.field2449];
        this.field2435 = arg1.field857;
        this.field2439 = arg1.field848;
        if (arg1.field879 != null) {
            this.field2433 = arg1.field879.length;
            this.field2429 = new class253[this.field2433];
            this.field2520 = new class37[this.field2433];
            for (int var14 = 0; var14 < this.field2433; var14++) {
                class9 var15 = arg1.field879[var14];
                class501 var16 = class67.method435(63, var15.field86);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field2446; var18++) {
                    if (var8[var18] == var15.field83) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class673.field9471[arg1.field872[var15.field83] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field864 == null ? 0 : arg1.field864[var15.field83]) << 24;
                this.field2429[var14] = new class253(var17, arg1.field863[var15.field83], arg1.field865[var15.field83], arg1.field852[var15.field83], var16.field7009, var16.field7015, var16.field7004, var16.field7008, var16.field7007, var16.field7002, var16.field7000, var15.field87);
                this.field2520[var14] = new class37(var20);
            }
        }
        int var21 = this.field2446 * 3;
        this.field2408 = (short) arg4;
        this.field2431 = new short[this.field2446];
        this.field2409 = new short[this.field2446];
        this.field2450 = new float[var21];
        this.field2411 = new byte[var21];
        this.field2523 = new short[this.field2446];
        this.field2471 = (short) arg3;
        if (arg1.field883 != null) {
            this.field2516 = new short[this.field2446];
        }
        this.field2426 = new short[var21];
        class372.field5103 = new long[var21];
        this.field2502 = new short[this.field2446];
        this.field2423 = new short[var21];
        this.field2483 = new float[var21];
        this.field2477 = new short[this.field2446];
        this.field2517 = new short[var21];
        this.field2500 = new byte[this.field2446];
        this.field2478 = new short[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field874; var23++) {
            int var155 = this.field2414[var23];
            this.field2414[var23] = var22;
            var22 += var155;
            var13[var23] = new class566();
        }
        this.field2414[arg1.field874] = var22;
        class611 var24 = class714.method4028(var8, (byte) -37, this.field2446, arg1);
        class355[] var25 = new class355[arg1.field851];
        for (int var26 = 0; var26 < arg1.field851; var26++) {
            short var134 = arg1.field863[var26];
            short var135 = arg1.field865[var26];
            short var136 = arg1.field852[var26];
            int var137 = this.field2440[var135] - this.field2440[var134];
            int var138 = this.field2417[var135] - this.field2417[var134];
            int var139 = this.field2513[var135] - this.field2513[var134];
            int var140 = this.field2440[var136] - this.field2440[var134];
            int var141 = this.field2417[var136] - this.field2417[var134];
            int var142 = this.field2513[var136] - this.field2513[var134];
            int var143 = var138 * var142 - (var139 * var141);
            int var144 = var139 * var140 - (var137 * var142);
            int var145;
            for (var145 = var137 * var141 - (var138 * var140); var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192; var145 >>= 0x1) {
                var144 >>= 0x1;
                var143 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var144 * var144 + (var143 * var143 + (var145 * var145))));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var144 * 256 / var146;
            int var148 = var143 * 256 / var146;
            int var149 = var145 * 256 / var146;
            byte var150 = arg1.field858 == null ? 0 : arg1.field858[var26];
            if (var150 == 0) {
                class566 var152 = var13[var134];
                var152.field8046 += var149;
                var152.field8043++;
                var152.field8049 += var147;
                var152.field8044 += var148;
                class566 var153 = var13[var135];
                var153.field8049 += var147;
                var153.field8044 += var148;
                var153.field8043++;
                var153.field8046 += var149;
                class566 var154 = var13[var136];
                var154.field8043++;
                var154.field8044 += var148;
                var154.field8049 += var147;
                var154.field8046 += var149;
            } else if (var150 == 1) {
                class355 var151 = var25[var26] = new class355();
                var151.field4558 = var147;
                var151.field4562 = var148;
                var151.field4561 = var149;
            }
        }
        for (int var27 = 0; var27 < this.field2446; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field872[var43] & 0xFFFF;
            int var45;
            if (arg1.field897 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field897[var43];
            }
            int var46;
            if (arg1.field864 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field864[var43] & 0xFF;
            }
            short var47 = arg1.field859 == null ? -1 : arg1.field859[var43];
            if (var47 != -1 && (this.field2428 & 0x40) != 0) {
                class468 var48 = var7.method91(var47 & 0xFFFF, -22805);
                if (var48.field6389) {
                    var47 = -1;
                }
            }
            float var49 = 0.0F;
            float var50 = 0.0F;
            float var51 = 0.0F;
            float var52 = 0.0F;
            float var53 = 0.0F;
            float var54 = 0.0F;
            byte var55 = 0;
            byte var56 = 0;
            int var57 = 0;
            if (var47 != -1) {
                if (var45 == -1) {
                    var53 = 0.0F;
                    var52 = 1.0F;
                    var50 = 1.0F;
                    var56 = 2;
                    var55 = 1;
                    var54 = 0.0F;
                    var51 = 1.0F;
                    var49 = 0.0F;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field867[var45];
                    if (var58 == 0) {
                        short var59 = arg1.field863[var43];
                        short var60 = arg1.field865[var43];
                        short var61 = arg1.field852[var43];
                        short var62 = arg1.field847[var45];
                        short var63 = arg1.field899[var45];
                        short var64 = arg1.field898[var45];
                        float var65 = (float) arg1.field876[var62];
                        float var66 = (float) arg1.field887[var62];
                        float var67 = (float) arg1.field884[var62];
                        float var68 = (float) arg1.field876[var63] - var65;
                        float var69 = (float) arg1.field887[var63] - var66;
                        float var70 = (float) arg1.field884[var63] - var67;
                        float var71 = (float) arg1.field876[var64] - var65;
                        float var72 = (float) arg1.field887[var64] - var66;
                        float var73 = (float) arg1.field884[var64] - var67;
                        float var74 = (float) arg1.field876[var59] - var65;
                        float var75 = (float) arg1.field887[var59] - var66;
                        float var76 = (float) arg1.field884[var59] - var67;
                        float var77 = (float) arg1.field876[var60] - var65;
                        float var78 = (float) arg1.field887[var60] - var66;
                        float var79 = (float) arg1.field884[var60] - var67;
                        float var80 = (float) arg1.field876[var61] - var65;
                        float var81 = (float) arg1.field887[var61] - var66;
                        float var82 = (float) arg1.field884[var61] - var67;
                        float var83 = var69 * var73 - (var70 * var72);
                        float var84 = var70 * var71 - (var68 * var73);
                        float var85 = var68 * var72 - var69 * var71;
                        float var86 = var72 * var85 - (var73 * var84);
                        float var87 = var73 * var83 - (var71 * var85);
                        float var88 = var71 * var84 - (var72 * var83);
                        float var89 = 1.0F / (var70 * var88 + var68 * var86 + var69 * var87);
                        var51 = (var79 * var88 + var77 * var86 + var78 * var87) * var89;
                        var49 = (var76 * var88 + var74 * var86 + var75 * var87) * var89;
                        var53 = (var82 * var88 + var80 * var86 + var81 * var87) * var89;
                        float var90 = var70 * var83 - (var68 * var85);
                        float var91 = var68 * var84 - (var69 * var83);
                        float var92 = var69 * var85 - var70 * var84;
                        float var93 = 1.0F / (var73 * var91 + var71 * var92 + var72 * var90);
                        var50 = (var76 * var91 + var74 * var92 + var75 * var90) * var93;
                        var54 = (var82 * var91 + var80 * var92 + var81 * var90) * var93;
                        var52 = (var79 * var91 + var77 * var92 + var78 * var90) * var93;
                    } else {
                        short var94 = arg1.field863[var43];
                        short var95 = arg1.field865[var43];
                        short var96 = arg1.field852[var43];
                        int var97 = var24.field8694[var45];
                        int var98 = var24.field8691[var45];
                        int var99 = var24.field8689[var45];
                        float[] var100 = var24.field8695[var45];
                        byte var101 = arg1.field853[var45];
                        float var102 = (float) arg1.field886[var45] / 256.0F;
                        if (var58 == 1) {
                            float var103 = (float) arg1.field856[var45] / 1024.0F;
                            class37.method259(arg1.field887[var94], var97, arg1.field876[var94], arg1.field884[var94], var101, var98, var102, var103, var100, class455.field6267, var99, false);
                            var50 = class455.field6267[1];
                            var49 = class455.field6267[0];
                            class37.method259(arg1.field887[var95], var97, arg1.field876[var95], arg1.field884[var95], var101, var98, var102, var103, var100, class455.field6267, var99, false);
                            var51 = class455.field6267[0];
                            var52 = class455.field6267[1];
                            class37.method259(arg1.field887[var96], var97, arg1.field876[var96], arg1.field884[var96], var101, var98, var102, var103, var100, class455.field6267, var99, false);
                            var54 = class455.field6267[1];
                            var53 = class455.field6267[0];
                            float var104 = var103 / 2.0F;
                            if ((var101 & 0x1) == 0) {
                                if ((var104 < var51 - var49)) {
                                    var55 = 1;
                                    var51 -= var103;
                                } else if (var49 - var51 > var104) {
                                    var51 += var103;
                                    var55 = 2;
                                }
                                if (var104 < var53 - var49) {
                                    var53 -= var103;
                                    var56 = 1;
                                } else if (var104 < var49 - var53) {
                                    var56 = 2;
                                    var53 += var103;
                                }
                            } else {
                                if ((var104 < var54 - var50)) {
                                    var56 = 1;
                                    var54 -= var103;
                                } else if (var50 - var54 > var104) {
                                    var56 = 2;
                                    var54 += var103;
                                }
                                if (var104 < var52 - var50) {
                                    var55 = 1;
                                    var52 -= var103;
                                } else if (var50 - var52 > var104) {
                                    var55 = 2;
                                    var52 += var103;
                                }
                            }
                        } else if (var58 == 2) {
                            float var105 = (float) arg1.field868[var45] / 256.0F;
                            float var106 = (float) arg1.field880[var45] / 256.0F;
                            int var107 = arg1.field876[var95] - arg1.field876[var94];
                            int var108 = arg1.field887[var95] - arg1.field887[var94];
                            int var109 = arg1.field884[var95] - arg1.field884[var94];
                            int var110 = arg1.field876[var96] - arg1.field876[var94];
                            int var111 = arg1.field887[var96] - arg1.field887[var94];
                            int var112 = arg1.field884[var96] - arg1.field884[var94];
                            int var113 = var108 * var112 - (var109 * var111);
                            int var114 = var109 * var110 - var107 * var112;
                            int var115 = var107 * var111 - (var108 * var110);
                            float var116 = 64.0F / (float) arg1.field862[var45];
                            float var117 = 64.0F / (float) arg1.field889[var45];
                            float var118 = 64.0F / (float) arg1.field856[var45];
                            float var119 = (var100[2] * (float) var115 + var100[0] * (float) var113 + var100[1] * (float) var114) / var116;
                            float var120 = (var100[5] * (float) var115 + var100[4] * (float) var114 + var100[3] * (float) var113) / var117;
                            float var121 = (var100[8] * (float) var115 + var100[6] * (float) var113 + var100[7] * (float) var114) / var118;
                            var57 = class220.method1442((byte) -113, var121, var119, var120);
                            class566.method3390(var57, var102, var98, class455.field6267, var97, var100, var106, arg1.field884[var94], 5, var99, var101, arg1.field887[var94], arg1.field876[var94], var105);
                            var50 = class455.field6267[1];
                            var49 = class455.field6267[0];
                            class566.method3390(var57, var102, var98, class455.field6267, var97, var100, var106, arg1.field884[var95], 5, var99, var101, arg1.field887[var95], arg1.field876[var95], var105);
                            var51 = class455.field6267[0];
                            var52 = class455.field6267[1];
                            class566.method3390(var57, var102, var98, class455.field6267, var97, var100, var106, arg1.field884[var96], 5, var99, var101, arg1.field887[var96], arg1.field876[var96], var105);
                            var53 = class455.field6267[0];
                            var54 = class455.field6267[1];
                        } else if (var58 == 3) {
                            class621.method3639(class455.field6267, (byte) 20, arg1.field876[var94], var97, var98, var100, var102, arg1.field884[var94], var99, arg1.field887[var94], var101);
                            var50 = class455.field6267[1];
                            var49 = class455.field6267[0];
                            class621.method3639(class455.field6267, (byte) 20, arg1.field876[var95], var97, var98, var100, var102, arg1.field884[var95], var99, arg1.field887[var95], var101);
                            var52 = class455.field6267[1];
                            var51 = class455.field6267[0];
                            class621.method3639(class455.field6267, (byte) 59, arg1.field876[var96], var97, var98, var100, var102, arg1.field884[var96], var99, arg1.field887[var96], var101);
                            var54 = class455.field6267[1];
                            var53 = class455.field6267[0];
                            if ((var101 & 0x1) == 0) {
                                if (var51 - var49 > 0.5F) {
                                    var55 = 1;
                                    var51--;
                                } else if (var49 - var51 > 0.5F) {
                                    var51++;
                                    var55 = 2;
                                }
                                if (var53 - var49 > 0.5F) {
                                    var53--;
                                    var56 = 1;
                                } else if (var49 - var53 > 0.5F) {
                                    var53++;
                                    var56 = 2;
                                }
                            } else {
                                if (var54 - var50 > 0.5F) {
                                    var54--;
                                    var56 = 1;
                                } else if (var50 - var54 > 0.5F) {
                                    var54++;
                                    var56 = 2;
                                }
                                if (var52 - var50 > 0.5F) {
                                    var55 = 1;
                                    var52--;
                                } else if (var50 - var52 > 0.5F) {
                                    var52++;
                                    var55 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var122;
            if (arg1.field858 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field858[var43];
            }
            if (var122 == 0) {
                long var123 = (long) (var45 << 2) + ((long) (var57 << 24) + (long) var46 + ((long) (var44 << 8)) << 32);
                short var125 = arg1.field863[var43];
                short var126 = arg1.field865[var43];
                short var127 = arg1.field852[var43];
                class566 var128 = var13[var125];
                this.field2502[var27] = this.method1143((byte) 125, var128.field8044, var123, var128.field8043, var125, arg1, var50, var128.field8049, var128.field8046, var49);
                class566 var129 = var13[var126];
                this.field2431[var27] = this.method1143((byte) 111, var129.field8044, (long) var55 + var123, var129.field8043, var126, arg1, var52, var129.field8049, var129.field8046, var51);
                class566 var130 = var13[var127];
                this.field2409[var27] = this.method1143((byte) 113, var130.field8044, (long) var56 + var123, var130.field8043, var127, arg1, var54, var130.field8049, var130.field8046, var53);
            } else if (var122 == 1) {
                class355 var131 = var25[var43];
                long var132 = (long) ((var131.field4558 + 256 << 12) + (var131.field4561 + 256 << 22) + ((var45 << 2) - -(var131.field4562 <= 0 ? 2048 : 1024))) + ((long) (var57 << 24) - (-((long) (var44 << 8)) - ((long) var46)) << 32);
                this.field2502[var27] = this.method1143((byte) 107, var131.field4562, var132, 0, arg1.field863[var43], arg1, var50, var131.field4558, var131.field4561, var49);
                this.field2431[var27] = this.method1143((byte) 109, var131.field4562, (long) var55 + var132, 0, arg1.field865[var43], arg1, var52, var131.field4558, var131.field4561, var51);
                this.field2409[var27] = this.method1143((byte) 116, var131.field4562, (long) var56 + var132, 0, arg1.field852[var43], arg1, var54, var131.field4558, var131.field4561, var53);
            }
            if (arg1.field864 != null) {
                this.field2500[var27] = arg1.field864[var43];
            }
            if (arg1.field883 != null) {
                this.field2516[var27] = arg1.field883[var43];
            }
            this.field2477[var27] = arg1.field872[var43];
            this.field2523[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field2501; var30++) {
            short var42 = this.field2523[var30];
            if (var29 != var42) {
                var28++;
                var29 = var42;
            }
        }
        this.field2488 = new int[var28 + 1];
        short var31 = -10000;
        int var32 = 0;
        for (int var33 = 0; var33 < this.field2501; var33++) {
            short var41 = this.field2523[var33];
            if (var31 != var41) {
                this.field2488[var32++] = var33;
                var31 = var41;
            }
        }
        this.field2488[var32] = this.field2501;
        class372.field5103 = null;
        this.field2478 = class519.method3087(0, this.field2478, this.field2452);
        this.field2426 = class519.method3087(0, this.field2426, this.field2452);
        this.field2423 = class519.method3087(0, this.field2423, this.field2452);
        this.field2411 = class62.method400(false, this.field2411, this.field2452);
        this.field2483 = class374.method2248(this.field2452, (byte) 118, this.field2483);
        this.field2450 = class374.method2248(this.field2452, (byte) 121, this.field2450);
        if (arg1.field855 != null && class218.method1424((byte) -41, this.field2428, arg2)) {
            this.field2510 = arg1.method424(false, (byte) -118);
        }
        if (arg1.field879 != null && class310.method1813(this.field2428, 2439, arg2)) {
            this.field2491 = arg1.method411(44);
        }
        if (arg1.field878 != null && class308.method1808(-62, this.field2428, arg2)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field2446; var36++) {
                int var40 = arg1.field878[var8[var36]];
                if (var40 >= 0) {
                    if (var34 < var40) {
                        var34 = var40;
                    }
                    int var10002 = var35[var40]++;
                }
            }
            this.field2494 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field2494[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field2446; var38++) {
                int var39 = arg1.field878[var8[var38]];
                if (var39 >= 0) {
                    this.field2494[var39][var35[var39]++] = var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Luha;)V")
    public final void method1172(class723 arg0) {
        field2442++;
        class437 var2 = (class437) arg0;
        if (this.field2435 != null) {
            for (int var3 = 0; var3 < this.field2435.length; var3++) {
                class57 var4 = this.field2435[var3];
                class57 var5 = var4;
                if (var4.field806 != null) {
                    var5 = var4.field806;
                }
                var5.field795 = (int) ((float) this.field2513[var4.field800] * var2.field5996 + (float) this.field2440[var4.field800] * var2.field5989 + (float) this.field2417[var4.field800] * var2.field5979 + var2.field5998);
                var5.field788 = (int) ((float) this.field2513[var4.field800] * var2.field5980 + (float) this.field2440[var4.field800] * var2.field5993 + (float) this.field2417[var4.field800] * var2.field6009 + var2.field6012);
                var5.field792 = (int) ((float) this.field2513[var4.field800] * var2.field6000 + (float) this.field2440[var4.field800] * var2.field6007 + (float) this.field2417[var4.field800] * var2.field6008 + var2.field6001);
                var5.field796 = (int) ((float) this.field2513[var4.field786] * var2.field5996 + (float) this.field2440[var4.field786] * var2.field5989 + (float) this.field2417[var4.field786] * var2.field5979 + var2.field5998);
                var5.field799 = (int) ((float) this.field2513[var4.field786] * var2.field5980 + (float) this.field2440[var4.field786] * var2.field5993 + (float) this.field2417[var4.field786] * var2.field6009 + var2.field6012);
                var5.field805 = (int) ((float) this.field2513[var4.field786] * var2.field6000 + (float) this.field2440[var4.field786] * var2.field6007 + (float) this.field2417[var4.field786] * var2.field6008 + var2.field6001);
                var5.field794 = (int) ((float) this.field2513[var4.field790] * var2.field5996 + (float) this.field2440[var4.field790] * var2.field5989 + (float) this.field2417[var4.field790] * var2.field5979 + var2.field5998);
                var5.field797 = (int) ((float) this.field2513[var4.field790] * var2.field5980 + (float) this.field2440[var4.field790] * var2.field5993 + (float) this.field2417[var4.field790] * var2.field6009 + var2.field6012);
                var5.field803 = (int) ((float) this.field2513[var4.field790] * var2.field6000 + (float) this.field2440[var4.field790] * var2.field6007 + (float) this.field2417[var4.field790] * var2.field6008 + var2.field6001);
            }
        }
        if (this.field2439 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field2439.length; var6++) {
            class648 var7 = this.field2439[var6];
            class648 var8 = var7;
            if (var7.field9188 != null) {
                var8 = var7.field9188;
            }
            if (var7.field9191 == null) {
                var7.field9191 = var2.method859();
            } else {
                var7.field9191.method864(var2);
            }
            var8.field9185 = (int) ((float) this.field2513[var7.field9184] * var2.field5996 + (float) this.field2440[var7.field9184] * var2.field5989 + (float) this.field2417[var7.field9184] * var2.field5979 + var2.field5998);
            var8.field9186 = (int) ((float) this.field2513[var7.field9184] * var2.field5980 + (float) this.field2440[var7.field9184] * var2.field5993 + (float) this.field2417[var7.field9184] * var2.field6009 + var2.field6012);
            var8.field9190 = (int) ((float) this.field2513[var7.field9184] * var2.field6000 + (float) this.field2440[var7.field9184] * var2.field6007 + (float) this.field2417[var7.field9184] * var2.field6008 + var2.field6001);
        }
    }
}
