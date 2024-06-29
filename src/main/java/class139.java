import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class139 extends class231 {

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "Z")
    public boolean field2269 = false;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public int field2273 = 0;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "Lie;")
    private class169 field2268 = new class169();

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    private int field2284 = 0;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "Lbb;")
    public class49 field2287 = new class49();

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    private int field2297 = 0;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "Z")
    private boolean field2304 = false;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    private int field2289;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    private int field2293;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "[Ldi;")
    public class38[] field2275;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "J")
    private long field2270;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field2267 = 0;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field2266 = 0;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public static int field2276 = 0;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "Z")
    private static boolean field2282 = false;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    public static int field2283 = 0;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "Lrk;")
    public static class25 field2274 = new class25(8);

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    private static int field2286 = 0;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "[Z")
    private static boolean[] field2294 = new boolean[8];

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "[Z")
    private static boolean[] field2285 = new boolean[8];

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    public static int field2298 = 2;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public int field2288;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    public int field2290;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public int field2291;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    public int field2292;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public int field2295;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public int field2296;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    public int field2299;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
    public int field2300;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
    public int field2301;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
    public int field2302;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "I")
    public int field2303;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "J")
    private long field2279;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "J")
    public long field2280;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "Lie;")
    private static class169 field2278;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "[Ldi;")
    public static class38[] field2277;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()V")
    public final void method1019() {
        this.field2304 = true;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "()I")
    public final int method1020() {
        if (this.field2299 == this.field2292 && this.field2303 == this.field2291) {
            return 92;
        }
        int var1 = this.field2299 << 7;
        int var2 = (this.field2292 << 7) + 128;
        int var3 = this.field2303 << 7;
        int var4 = (this.field2291 << 7) + 128;
        int var5 = this.field2288 - var1;
        int var6 = var2 - this.field2288;
        if (var5 > var6) {
            int var7 = this.field2301 - var3;
            int var8 = var4 - this.field2301;
            return var7 > var8 ? (int) (Math.sqrt((double) (var5 * var5 + var7 * var7)) + 0.99D) : (int) (Math.sqrt((double) (var5 * var5 + var8 * var8)) + 0.99D);
        } else {
            int var9 = this.field2301 - var3;
            int var10 = var4 - this.field2301;
            return var9 > var10 ? (int) (Math.sqrt((double) (var6 * var6 + var9 * var9)) + 0.99D) : (int) (Math.sqrt((double) (var6 * var6 + var10 * var10)) + 0.99D);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Laj;)V")
    public static final void method1021(class151 arg0) {
        field2276 = 0;
        field2283 = 0;
        field2278 = new class169();
        field2277 = new class38[1024];
        class268.method1884(false, arg0);
        class88.method614((byte) 18, arg0);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(J)Z")
    private final boolean method1022(long arg0) {
        long var3;
        if (this.field2270 > this.field2279) {
            var3 = this.field2270;
        } else {
            var3 = this.field2279;
        }
        int var5 = (int) (this.field2280 - var3);
        if (var5 > 750) {
            this.method1025();
            return false;
        }
        if (this.field2279 > 0L) {
            this.field2299 = this.field2288 - (this.field2289 << 6) >> 7;
            this.field2292 = ((this.field2289 << 6) + this.field2288 >> 7) - 1;
            this.field2303 = this.field2301 - (this.field2293 << 6) >> 7;
            this.field2291 = ((this.field2293 << 6) + this.field2301 >> 7) - 1;
            this.field2290 = this.field2295;
            if (this.field2296 < 3) {
                this.field2302 = class245.field4123[this.field2296 + 1][this.field2299][this.field2303] + class245.field4123[this.field2296 + 1][this.field2292][this.field2303] + class245.field4123[this.field2296 + 1][this.field2299][this.field2291] + class245.field4123[this.field2296 + 1][this.field2292][this.field2291] >> 2;
            } else {
                this.field2302 = this.field2290 - 1024;
            }
            int var6 = class128.field2133[this.field2300];
            int var7 = class128.field2130[this.field2300];
            this.method1023(var6, var7);
            if (this.field2304) {
                class223 var8 = (class223) this.field2268.method1265(8211);
                while (true) {
                    if (var8 == null) {
                        this.field2304 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field3767.field266; var9++) {
                        var8.method1585(this.field2280, var7, 1, var6, 0, true);
                    }
                    var8 = (class223) this.field2268.method1266(8226);
                }
            }
            int var10 = (int) (arg0 - this.field2280);
            for (class223 var11 = (class223) this.field2268.method1265(8211); var11 != null; var11 = (class223) this.field2268.method1266(8226)) {
                var11.method1585(arg0, var7, var10, var6, 0, var5 < 10);
            }
        }
        this.field2280 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)V")
    private final void method1023(int arg0, int arg1) {
        for (class264 var3 = (class264) this.field2287.method309(0); var3 != null; var3 = (class264) this.field2287.method312((byte) 58)) {
            var3.field4416 = this.field2288 + var3.field4407;
            var3.field4410 = this.field2295 + var3.field4404;
            var3.field4414 = this.field2301 + var3.field4409;
            if (this.field2300 == 0) {
                var3.field4415 = var3.field4403.field2626.field4803;
                var3.field4401 = var3.field4403.field2626.field4804;
            } else {
                int var4 = var3.field4403.field2626.field4803;
                int var5 = var3.field4403.field2626.field4804;
                var3.field4415 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field4401 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(J)V")
    public static final void method1024(long arg0) {
        field2267 = field2272;
        field2266 = 0;
        field2272 = 0;
        long var2 = class188.method1355(-102);
        for (class139 var4 = (class139) field2278.method1265(8211); var4 != null; var4 = (class139) field2278.method1266(8226)) {
            if (var4.method1022(arg0)) {
                field2266++;
            }
        }
        if (field2282 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field2278.method1267(11704) + ", running: " + field2266 + ". Particles: " + field2272 + ". Time taken: " + (class188.method1355(93) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "()V")
    public final void method1025() {
        this.field2269 = true;
        for (class264 var1 = (class264) this.field2287.method309(0); var1 != null; var1 = (class264) this.field2287.method312((byte) -104)) {
            if (var1.field4403.field2626.field4802 == 1) {
                var1.method1174(-25741);
            }
        }
        this.field2275 = new class38[8192];
        this.field2273 = 0;
        this.field2268 = new class169();
        this.field2284 = 0;
        this.field2287 = new class49();
        this.field2297 = 0;
        this.method1663(-101);
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "()V")
    public static void method1026() {
        field2278 = null;
        field2277 = null;
        field2274 = null;
        field2285 = null;
        field2294 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([Lvb;[Lrm;Z[I[I[I)V")
    public final void method1027(class193[] arg0, class162[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field2269) {
            this.method1030(arg0, arg2, arg3, arg4, arg5);
            this.method1034(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)V")
    public static final void method1028(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "()V")
    public static final void method1029() {
        field2274 = new class25(8);
        field2286 = 0;
        for (class139 var0 = (class139) field2278.method1265(8211); var0 != null; var0 = (class139) field2278.method1266(8226)) {
            var0.method1025();
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([Lvb;Z[I[I[I)V")
    private final void method1030(class193[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2285[var6] = false;
        }
        label82: for (class223 var7 = (class223) this.field2268.method1265(8211); var7 != null; var7 = (class223) this.field2268.method1266(8226)) {
            if (arg0 != null) {
                for (int var12 = 0; var12 < arg0.length; var12++) {
                    if (arg0[var12] == var7.field3750) {
                        field2285[var12] = true;
                        var7.field3742 = false;
                        continue label82;
                    }
                }
            }
            if (!arg1) {
                if (var7.field3735 == 0) {
                    var7.method1663(-126);
                    this.field2284--;
                } else {
                    var7.field3742 = true;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var8 = 0; var8 < arg0.length && this.field2284 != 8; var8++) {
            if (!field2285[var8]) {
                class223 var9 = new class223(arg0[var8], this, this.field2280);
                this.field2268.method1263(var9, 352);
                this.field2284++;
                field2285[var8] = true;
            }
        }
        for (class223 var10 = (class223) this.field2268.method1265(8211); var10 != null; var10 = (class223) this.field2268.method1266(8226)) {
            for (int var11 = 0; var11 < arg0.length; var11++) {
                if (field2285[var11] && arg0[var11] == var10.field3750) {
                    var10.method1584(arg3[var10.field3750.field3109], arg4[var10.field3750.field3106], arg2[var10.field3750.field3106], arg3[var10.field3750.field3107], arg2[var10.field3750.field3109], arg4[var10.field3750.field3109], arg4[var10.field3750.field3107], arg2[var10.field3750.field3107], arg3[var10.field3750.field3106], (byte) -51);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V")
    public static final void method1031(int arg0) {
        field2298 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V")
    public final void method1032(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1033(arg0, arg1, class118.field1987 + arg2, class28.field481 + arg3, class84.field1398 + arg4);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(IIIII)V")
    public final void method1033(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2269) {
            return;
        }
        if (this.field2300 != arg0) {
            for (class223 var6 = (class223) this.field2268.method1265(8211); var6 != null; var6 = (class223) this.field2268.method1266(8226)) {
                var6.field3756 = true;
            }
        }
        this.field2279 = this.field2280;
        this.field2300 = arg0;
        this.field2296 = arg1;
        this.field2288 = arg2;
        this.field2295 = arg3;
        this.field2301 = arg4;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([Lrm;Z[I[I[I)V")
    private final void method1034(class162[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2294[var6] = false;
        }
        label91: for (class264 var7 = (class264) this.field2287.method309(0); var7 != null; var7 = (class264) this.field2287.method312((byte) -68)) {
            if (arg0 != null) {
                for (int var12 = 0; var12 < arg0.length; var12++) {
                    if (arg0[var12] == var7.field4403) {
                        field2294[var12] = true;
                        continue label91;
                    }
                }
            }
            if (!arg1) {
                var7.method993(32);
                this.field2297--;
                if (var7.method1178(-76)) {
                    var7.method1174(-25741);
                    field2286--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var8 = 0; var8 < arg0.length && this.field2297 != 8; var8++) {
            if (!field2294[var8]) {
                class264 var9 = null;
                if (arg0[var8].field2626.field4802 == 1 && field2286 < 32) {
                    var9 = new class264(arg0[var8], this);
                    field2274.method160(var9, 1, (long) arg0[var8].field2626.field4819);
                    field2286++;
                }
                if (var9 == null) {
                    var9 = new class264(arg0[var8], this);
                }
                this.field2287.method311(106, var9);
                this.field2297++;
                field2294[var8] = true;
            }
        }
        for (class264 var10 = (class264) this.field2287.method309(0); var10 != null; var10 = (class264) this.field2287.method312((byte) 73)) {
            for (int var11 = 0; var11 < arg0.length; var11++) {
                if (field2294[var11] && arg0[var11] == var10.field4403) {
                    var10.method1872(-4903, arg2[var10.field4403.field2623], arg3[var10.field4403.field2623], arg4[var10.field4403.field2623]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "()I")
    public static final int method1035() {
        return field2298;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(III)V")
    public class139(int arg0, int arg1, int arg2) {
        this.field2289 = arg1;
        this.field2293 = arg2;
        this.field2275 = new class38[8192];
        this.field2270 = (long) arg0;
        this.field2304 = true;
        field2278.method1263(this, 352);
    }

    static {
        new class249(131056);
    }
}
