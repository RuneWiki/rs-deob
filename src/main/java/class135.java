import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class135 extends class382 {

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    private int field2260 = 0;

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "Z")
    public boolean field2276 = false;

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "Z")
    private boolean field2288 = false;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "Loi;")
    public class53 field2274;

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "J")
    private long field2283;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "Lfi;")
    public class393 field2281;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "Leq;")
    public class143 field2261;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "Ltn;")
    public class60 field2287;

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "I")
    public static int field2275 = 0;

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "I")
    public static int field2279 = -1;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public int field2255;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    private int field2256;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    private int field2257;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    private int field2258;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    private int field2259;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    private int field2263;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    private int field2264;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public int field2265;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    private int field2266;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    private int field2268;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public int field2269;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    private int field2270;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
    private int field2272;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
    private int field2277;

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "I")
    private int field2278;

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
    private int field2280;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
    private int field2282;

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
    private int field2284;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    public int field2285;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    private int field2286;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "Lwu;")
    public static class253 field2271;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(JI)V")
    public final void method1026(long arg0, int arg1) {
        field2262++;
        if (arg1 < 26) {
            method1027(22);
        }
        for (class240 var4 = (class240) this.field2287.method533((byte) -123); var4 != null; var4 = (class240) this.field2287.method536(108)) {
            var4.method1575(arg0);
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
    public static void method1027(int arg0) {
        if (arg0 == 0) {
            field2271 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V")
    public final void method1028(byte arg0) {
        this.field2264 = this.field2281.field5988;
        this.field2259 = this.field2281.field5993;
        this.field2258 = this.field2281.field6003;
        this.field2270 = this.field2281.field5994;
        this.field2286 = this.field2281.field6002;
        this.field2284 = this.field2281.field5990;
        this.field2282 = this.field2281.field6005;
        this.field2278 = this.field2281.field5999;
        if (arg0 != -56) {
            this.method1026(-58L, -52);
        }
        field2267++;
        this.field2268 = this.field2281.field5997;
        if (this.field2282 == this.field2264 && this.field2282 == this.field2258 && this.field2278 == this.field2268 && this.field2284 == this.field2278 && this.field2286 == this.field2270 && this.field2270 == this.field2259) {
            this.field2288 = true;
            return;
        }
        this.field2288 = false;
        int var2 = (this.field2282 + this.field2264 + this.field2258) / 3;
        int var3 = (this.field2278 + this.field2268 + this.field2284) / 3;
        int var4 = (this.field2286 + this.field2270 + this.field2259) / 3;
        if (this.field2255 == var2 && this.field2269 == var3 && this.field2285 == var4) {
            return;
        }
        this.field2269 = var3;
        this.field2255 = var2;
        this.field2285 = var4;
        int var5 = this.field2282 - this.field2264;
        int var6 = this.field2278 - this.field2268;
        int var7 = this.field2270 - this.field2286;
        int var8 = this.field2258 - this.field2264;
        int var9 = this.field2284 - this.field2268;
        int var10 = this.field2259 - this.field2286;
        this.field2256 = var5 * var9 - (var6 * var8);
        this.field2257 = var7 * var8 - (var5 * var10);
        this.field2277 = var6 * var10 - (var7 * var9);
        while (this.field2277 > 32767 || this.field2257 > 32767 || this.field2256 > 32767 || this.field2277 < -32767 || this.field2257 < -32767 || this.field2256 < -32767) {
            this.field2277 >>= 0x1;
            this.field2256 >>= 0x1;
            this.field2257 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field2277 * this.field2277 + this.field2257 * this.field2257 + this.field2256 * this.field2256));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field2256 = this.field2256 * 32767 / var11;
        this.field2277 = this.field2277 * 32767 / var11;
        this.field2257 = this.field2257 * 32767 / var11;
        if (this.field2261.field2415 <= 0 && this.field2261.field2384 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field2256, (double) this.field2277) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field2257, Math.sqrt((double) (this.field2277 * this.field2277 + this.field2256 * this.field2256))) * 2607.5945876176133D);
        this.field2272 = this.field2261.field2415 - this.field2261.field2363;
        this.field2263 = this.field2261.field2363 + var12 - (this.field2272 >> 1);
        this.field2280 = this.field2261.field2384 - this.field2261.field2374;
        this.field2266 = var13 + this.field2261.field2374 - (this.field2280 >> 1);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZILza;J)V")
    public final void method1029(int arg0, boolean arg1, int arg2, class288 arg3, long arg4) {
        if (this.field2276) {
            arg1 = false;
        } else if (class5.field96 < this.field2261.field2366) {
            arg1 = false;
        } else if (class103.field1952[class5.field96] < class273.field4149) {
            arg1 = false;
        } else if (this.field2288) {
            arg1 = false;
        } else if (this.field2261.field2405 != -1) {
            int var7 = (int) (arg4 - this.field2283);
            if (this.field2261.field2377 || var7 <= this.field2261.field2405) {
                var7 %= this.field2261.field2405;
            } else {
                arg1 = false;
            }
            if (!this.field2261.field2379 && this.field2261.field2425 > var7) {
                arg1 = false;
            }
            if (this.field2261.field2379 && var7 >= this.field2261.field2425) {
                arg1 = false;
            }
        }
        if (arg2 != 1) {
            this.method1026(32L, -111);
        }
        field2273++;
        if (arg1) {
            this.field2260 += (int) ((double) arg0 * ((double) this.field2261.field2391 + Math.random() * (double) (this.field2261.field2370 - this.field2261.field2391)));
            if (this.field2260 > 63) {
                int var8 = this.field2260 >> 6;
                this.field2260 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field2261.field2415 <= 0 && this.field2261.field2384 <= 0) {
                        var10 = this.field2257;
                        var11 = this.field2277;
                        var12 = this.field2256;
                    } else {
                        int var13 = this.field2263 + ((int) (Math.random() * (double) this.field2272));
                        int var14 = var13 & 0x3FFF;
                        int var15 = class407.field6169[var14];
                        int var16 = class407.field6168[var14];
                        int var17 = this.field2266 + ((int) ((double) this.field2280 * Math.random()));
                        int var18 = var17 & 0x1FFF;
                        int var19 = class407.field6169[var18];
                        int var20 = class407.field6168[var18];
                        byte var21 = 15;
                        var10 = (var20 << 0) * -1;
                        var11 = var16 * var19 >> var21;
                        var12 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if ((var22 + var23) > 65535) {
                        var23 = 65535 - var23;
                        var22 = 65535 - var22;
                    }
                    int var24 = 65535 - var22 - var23;
                    int var25 = (int) ((long) this.field2258 * (long) var24 + (long) this.field2282 * (long) var23 + (long) this.field2264 * (long) var22 >> 16);
                    int var26 = (int) ((long) this.field2268 * (long) var22 + ((long) this.field2278 * (long) var23 + ((long) this.field2284 * (long) var24)) >> 16);
                    int var27 = (int) ((long) this.field2259 * (long) var24 + (long) this.field2286 * (long) var22 + (long) this.field2270 * (long) var23 >> 16);
                    int var28 = this.field2261.field2385 + ((int) (Math.random() * (double) (this.field2261.field2397 - this.field2261.field2385)));
                    int var29 = (int) (Math.random() * (double) (this.field2261.field2364 - this.field2261.field2367)) + this.field2261.field2367;
                    int var30 = this.field2261.field2375 + ((int) ((double) (this.field2261.field2358 - this.field2261.field2375) * Math.random()));
                    int var33;
                    if (this.field2261.field2420) {
                        double var31 = Math.random();
                        var33 = (int) ((double) this.field2261.field2411 + Math.random() * (double) this.field2261.field2421) << 24 | (int) ((double) this.field2261.field2386 * var31 + (double) this.field2261.field2362) | (int) ((double) this.field2261.field2403 * var31 + (double) this.field2261.field2365) << 8 | (int) ((double) this.field2261.field2387 * var31 + (double) this.field2261.field2396) << 16;
                    } else {
                        var33 = (int) ((double) this.field2261.field2411 + (double) this.field2261.field2421 * Math.random()) << 24 | (int) ((double) this.field2261.field2396 + (double) this.field2261.field2387 * Math.random()) << 16 | (int) (Math.random() * (double) this.field2261.field2403 + (double) this.field2261.field2365) << 8 | (int) (Math.random() * (double) this.field2261.field2386 + (double) this.field2261.field2362);
                    }
                    int var34 = this.field2261.field2428;
                    if (!arg3.method280() && !this.field2261.field2402) {
                        var34 = -1;
                    }
                    if (class329.field4997 == class145.field2442) {
                        new class240(this, var25, var26, var27, var11, var10, var12, var28, var29, var33, var30, var34, this.field2261.field2407, this.field2261.field2419);
                    } else {
                        class240 var35 = class491.field7196[class145.field2442];
                        class145.field2442 = class145.field2442 + 1 & 0x3FF;
                        var35.method1572(this, var25, var26, var27, var11, var10, var12, var28, var29, var33, var30, var34, this.field2261.field2407, this.field2261.field2419);
                    }
                }
            }
        }
        this.field2265 = 0;
        for (class240 var37 = (class240) this.field2287.method533((byte) -81); var37 != null; var37 = (class240) this.field2287.method536(-43)) {
            var37.method1576(arg4, arg0);
            this.field2265++;
        }
        class274.field4163 += this.field2265;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lza;Lfi;Loi;J)V")
    public class135(class288 arg0, class393 arg1, class53 arg2, long arg3) {
        this.field2274 = arg2;
        this.field2283 = arg3;
        this.field2281 = arg1;
        this.field2261 = this.field2281.method2444((byte) 71);
        if (!arg0.method280() && this.field2261.field2369 != -1) {
            this.field2261 = class220.method1470(-23658, this.field2261.field2369);
        }
        this.field2287 = new class60();
        this.field2260 = (int) ((double) this.field2260 + Math.random() * 64.0D);
        this.method1028((byte) -56);
    }
}
