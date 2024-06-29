import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class128 extends class4 {

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "Z")
    private boolean field2404 = false;

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
    private int field2409 = 0;

    @OriginalMember(owner = "client!oa", name = "wb", descriptor = "I")
    private int field2436 = 0;

    @OriginalMember(owner = "client!oa", name = "ab", descriptor = "I")
    public int field2414;

    @OriginalMember(owner = "client!oa", name = "fb", descriptor = "I")
    public int field2419;

    @OriginalMember(owner = "client!oa", name = "rb", descriptor = "I")
    private int field2431;

    @OriginalMember(owner = "client!oa", name = "mb", descriptor = "I")
    public int field2426;

    @OriginalMember(owner = "client!oa", name = "pb", descriptor = "I")
    private int field2429;

    @OriginalMember(owner = "client!oa", name = "xb", descriptor = "I")
    public int field2437;

    @OriginalMember(owner = "client!oa", name = "Bb", descriptor = "I")
    private int field2441;

    @OriginalMember(owner = "client!oa", name = "cb", descriptor = "I")
    private int field2416;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    private int field2405;

    @OriginalMember(owner = "client!oa", name = "db", descriptor = "I")
    public int field2417;

    @OriginalMember(owner = "client!oa", name = "nb", descriptor = "I")
    private int field2427;

    @OriginalMember(owner = "client!oa", name = "Eb", descriptor = "Ldg;")
    private class37 field2444;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "Lkb;")
    public static class93 field2406 = class76.method390("Lade Benutzeroberfl-=che )2 ", 0);

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
    public static int field2401 = 50;

    @OriginalMember(owner = "client!oa", name = "sb", descriptor = "[I")
    public static int[] field2432 = new int[field2401];

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "[I")
    public static int[] field2412 = new int[field2401];

    @OriginalMember(owner = "client!oa", name = "ub", descriptor = "Lkb;")
    public static class93 field2434 = class76.method390(" zuerst von Ihrer Freunde)2Liste(Q", 0);

    @OriginalMember(owner = "client!oa", name = "qb", descriptor = "Lkb;")
    public static class93 field2430 = class76.method390("<br>", 0);

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "[I")
    public static int[] field2410 = new int[field2401];

    @OriginalMember(owner = "client!oa", name = "gb", descriptor = "[I")
    public static int[] field2420 = new int[field2401];

    @OriginalMember(owner = "client!oa", name = "tb", descriptor = "[Lkb;")
    public static class93[] field2433 = new class93[field2401];

    @OriginalMember(owner = "client!oa", name = "lb", descriptor = "[I")
    public static int[] field2425 = new int[field2401];

    @OriginalMember(owner = "client!oa", name = "ob", descriptor = "[I")
    public static int[] field2428 = new int[field2401];

    @OriginalMember(owner = "client!oa", name = "Db", descriptor = "[I")
    public static int[] field2443 = new int[field2401];

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "D")
    private double field2402;

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "D")
    private double field2407;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "D")
    private double field2408;

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "D")
    private double field2413;

    @OriginalMember(owner = "client!oa", name = "hb", descriptor = "D")
    public double field2421;

    @OriginalMember(owner = "client!oa", name = "kb", descriptor = "D")
    public double field2424;

    @OriginalMember(owner = "client!oa", name = "Ab", descriptor = "D")
    public double field2440;

    @OriginalMember(owner = "client!oa", name = "Cb", descriptor = "D")
    private double field2442;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!oa", name = "bb", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!oa", name = "eb", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!oa", name = "ib", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!oa", name = "jb", descriptor = "I")
    private int field2423;

    @OriginalMember(owner = "client!oa", name = "vb", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!oa", name = "yb", descriptor = "I")
    public int field2438;

    @OriginalMember(owner = "client!oa", name = "zb", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)Lfd;")
    public final class52 method21(boolean arg0) {
        field2411++;
        class55 var2 = class176.method1163(this.field2405, -104);
        class52 var3 = var2.method298(arg0, this.field2409);
        if (var3 == null) {
            return null;
        } else {
            var3.method276(this.field2423);
            return var3;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
    public static final int method725(int arg0, int arg1) {
        field2403++;
        int var2 = arg0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 = arg0 + 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V")
    public final void method726(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2418++;
        if (!this.field2404) {
            double var6 = (double) (arg4 - this.field2416);
            double var8 = (double) (arg3 - this.field2431);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2424 = (double) this.field2429 * var6 / var10 + (double) this.field2416;
            this.field2440 = this.field2441;
            this.field2421 = (double) this.field2429 * var8 / var10 + (double) this.field2431;
        }
        double var12 = (double) (this.field2437 + 1 - arg1);
        this.field2407 = ((double) arg4 - this.field2424) / var12;
        this.field2402 = ((double) arg3 - this.field2421) / var12;
        if (arg2 != -1) {
            this.method726(113, 116, -64, -24, 19);
        }
        this.field2413 = Math.sqrt(this.field2407 * this.field2407 + this.field2402 * this.field2402);
        if (!this.field2404) {
            this.field2442 = -this.field2413 * Math.tan((double) this.field2427 * 0.02454369D);
        }
        this.field2408 = ((double) arg0 - this.field2440 - this.field2442 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([BLge;II)V")
    public static final void method727(byte[] arg0, class61 arg1, int arg2, int arg3) {
        field2415++;
        class155 var4 = new class155();
        var4.field3047 = arg3;
        var4.field3053 = arg1;
        var4.field718 = arg2;
        var4.field3045 = arg0;
        class122 var5 = class182.field3590;
        synchronized (class182.field3590) {
            class182.field3590.method691(var4, (byte) 51);
        }
        class24.method137((byte) -62);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public static void method728(int arg0) {
        field2412 = null;
        field2420 = null;
        field2443 = null;
        field2430 = null;
        field2434 = null;
        field2432 = null;
        field2406 = null;
        if (arg0 != 8) {
            field2425 = null;
        }
        field2410 = null;
        field2433 = null;
        field2428 = null;
        field2425 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)V")
    public final void method729(byte arg0, int arg1) {
        this.field2424 += (double) arg1 * this.field2407;
        field2422++;
        this.field2404 = true;
        this.field2421 += (double) arg1 * this.field2402;
        this.field2440 += this.field2408 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field2442;
        this.field2442 += (double) arg1 * this.field2408;
        this.field2438 = (int) (Math.atan2(this.field2407, this.field2402) * 325.949D) + 1024 & 0x7FF;
        this.field2423 = (int) (Math.atan2(this.field2442, this.field2413) * 325.949D) & 0x7FF;
        if (this.field2444 != null) {
            this.field2436 += arg1;
            label30: while (true) {
                do {
                    do {
                        if (this.field2436 <= this.field2444.field615[this.field2409]) {
                            break label30;
                        }
                        this.field2436 -= this.field2444.field615[this.field2409];
                        this.field2409++;
                    } while (this.field2444.field616.length > this.field2409);
                    this.field2409 -= this.field2444.field609;
                } while (this.field2409 >= 0 && this.field2444.field616.length > this.field2409);
                this.field2409 = 0;
            }
        }
        if (arg0 != -123) {
            method730(null, true);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lrd;Z)Lcf;")
    public static final class27 method730(class158 arg0, boolean arg1) {
        int var2 = arg0.method1054(128);
        int var3 = arg0.method1054(128);
        if (!arg1) {
            return null;
        }
        Class var4 = class205.method1333(1, var3);
        field2439++;
        try {
            class27 var5 = (class27) var4.getDeclaredConstructor().newInstance();
            if (var5 != null) {
                var5.field444 = var2;
                var5.field426 = arg0.method1054(128);
                int var6 = arg0.method1054(128);
                for (int var7 = 0; var7 < var6; var7++) {
                    int var8 = arg0.method1054(128);
                    var5.method15((byte) 119, var8, arg0);
                }
            }
            var5.method154((byte) 87);
            return var5;
        } catch (IllegalAccessException var9) {
            throw new RuntimeException();
        } catch (InstantiationException var10) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIII)V")
    public static final void method731(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg0; var5 <= arg0 + arg3; var5++) {
            for (int var6 = arg4; var6 <= arg1 + arg4; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class197.field3841[0][var6][var5] = 127;
                    if (arg4 == var6 && var6 > 0) {
                        class151.field2935[0][var6][var5] = class151.field2935[0][var6 - 1][var5];
                    }
                    if (arg1 + arg4 == var6 && var6 < 103) {
                        class151.field2935[0][var6][var5] = class151.field2935[0][var6 + 1][var5];
                    }
                    if (arg0 == var5 && var5 > 0) {
                        class151.field2935[0][var6][var5] = class151.field2935[0][var6][var5 - 1];
                    }
                    if (arg0 + arg3 == var5 && var5 < 103) {
                        class151.field2935[0][var6][var5] = class151.field2935[0][var6][var5 + 1];
                    }
                }
            }
        }
        field2435++;
        if (arg2 != -7503) {
            field2410 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2414 = arg5;
        this.field2419 = arg9;
        this.field2431 = arg3;
        this.field2426 = arg1;
        this.field2404 = false;
        this.field2429 = arg8;
        this.field2437 = arg6;
        this.field2441 = arg4;
        this.field2416 = arg2;
        this.field2405 = arg0;
        this.field2417 = arg10;
        this.field2427 = arg7;
        int var12 = class176.method1163(this.field2405, -54).field907;
        if (var12 == -1) {
            this.field2444 = null;
        } else {
            this.field2444 = class39.method213(-10639, var12);
        }
    }
}
