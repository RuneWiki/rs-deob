import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class452 extends class291 {

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "Z")
    public boolean field6316 = false;

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "I")
    private int field6322 = 0;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "Z")
    private boolean field6306 = false;

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "Llm;")
    public class351 field6320;

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "J")
    private long field6321;

    @OriginalMember(owner = "client!tq", name = "J", descriptor = "Lck;")
    public class462 field6334;

    @OriginalMember(owner = "client!tq", name = "z", descriptor = "Lui;")
    public class155 field6324;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "Ldv;")
    public class477 field6317;

    @OriginalMember(owner = "client!tq", name = "C", descriptor = "[I")
    public static int[] field6327 = new int[1];

    @OriginalMember(owner = "client!tq", name = "K", descriptor = "[I")
    public static int[] field6335 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
    private int field6307;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
    private int field6309;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
    private int field6310;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
    private int field6311;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    private int field6312;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
    private int field6313;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
    private int field6314;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    private int field6315;

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "I")
    private int field6318;

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
    public int field6319;

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "I")
    private int field6323;

    @OriginalMember(owner = "client!tq", name = "A", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!tq", name = "B", descriptor = "I")
    private int field6326;

    @OriginalMember(owner = "client!tq", name = "D", descriptor = "I")
    private int field6328;

    @OriginalMember(owner = "client!tq", name = "E", descriptor = "I")
    private int field6329;

    @OriginalMember(owner = "client!tq", name = "F", descriptor = "I")
    public int field6330;

    @OriginalMember(owner = "client!tq", name = "G", descriptor = "I")
    public int field6331;

    @OriginalMember(owner = "client!tq", name = "H", descriptor = "I")
    private int field6332;

    @OriginalMember(owner = "client!tq", name = "I", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!tq", name = "L", descriptor = "I")
    private int field6336;

    @OriginalMember(owner = "client!tq", name = "M", descriptor = "I")
    public int field6337;

    @OriginalMember(owner = "client!tq", name = "N", descriptor = "I")
    private int field6338;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(JZILza;Z)V", line = 4)
    public final void method2640(long arg0, boolean arg1, int arg2, class290 arg3, boolean arg4) {
        field6325++;
        if (this.field6316) {
            arg4 = false;
        } else if (class450.field6300 < this.field6324.field2247) {
            arg4 = false;
        } else if (class17.field212[class450.field6300] < class255.field3771) {
            arg4 = false;
        } else if (this.field6306) {
            arg4 = false;
        } else if (this.field6324.field2250 != -1) {
            int var7 = (int) (arg0 - this.field6321);
            if (this.field6324.field2252 || var7 <= this.field6324.field2250) {
                var7 %= this.field6324.field2250;
            } else {
                arg4 = false;
            }
            if (!this.field6324.field2289 && this.field6324.field2291 > var7) {
                arg4 = false;
            }
            if (this.field6324.field2289 && var7 >= this.field6324.field2291) {
                arg4 = false;
            }
        }
        if (arg4) {
            this.field6322 += (int) (((double) this.field6324.field2305 + Math.random() * (double) (this.field6324.field2300 - this.field6324.field2305)) * (double) arg2);
            if (this.field6322 > 63) {
                int var8 = this.field6322 >> 6;
                this.field6322 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field6324.field2281 <= 0 && this.field6324.field2262 <= 0) {
                        var10 = this.field6338;
                        var11 = this.field6312;
                        var12 = this.field6332;
                    } else {
                        int var13 = this.field6329 + ((int) ((double) this.field6336 * Math.random()));
                        int var14 = var13 & 0x3FFF;
                        int var15 = class95.field1242[var14];
                        int var16 = class95.field1241[var14];
                        int var17 = (int) ((double) this.field6318 * Math.random()) + this.field6315;
                        int var18 = var17 & 0x1FFF;
                        int var19 = class95.field1242[var18];
                        int var20 = class95.field1241[var18];
                        byte var21 = 15;
                        var12 = (var20 << 0) * -1;
                        var11 = var16 * var19 >> var21;
                        var10 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if (var22 + var23 > 65535) {
                        var22 = 65535 - var22;
                        var23 = 65535 - var23;
                    }
                    int var24 = 65535 - var22 - var23;
                    int var25 = (int) ((long) this.field6307 * (long) var24 + ((long) this.field6314 * (long) var22 + ((long) this.field6328 * (long) var23)) >> 16);
                    int var26 = (int) ((long) this.field6323 * (long) var22 + (long) this.field6310 * (long) var24 + (long) this.field6309 * (long) var23 >> 16);
                    int var27 = (int) ((long) this.field6311 * (long) var23 + (long) this.field6326 * (long) var22 + (long) this.field6313 * (long) var24 >> 16);
                    int var28 = (int) ((double) (this.field6324.field2296 - this.field6324.field2245) * Math.random()) + this.field6324.field2245;
                    int var29 = (int) (Math.random() * (double) (this.field6324.field2241 - this.field6324.field2270)) + this.field6324.field2270;
                    int var30 = this.field6324.field2246 + ((int) ((double) (this.field6324.field2299 - this.field6324.field2246) * Math.random()));
                    int var31;
                    if (this.field6324.field2293) {
                        double var32 = Math.random();
                        var31 = (int) ((double) this.field6324.field2274 * var32 + (double) this.field6324.field2275) | (int) ((double) this.field6324.field2256 * var32 + (double) this.field6324.field2263) << 8 | (int) ((double) this.field6324.field2271 * var32 + (double) this.field6324.field2255) << 16 | (int) ((double) this.field6324.field2294 + (double) this.field6324.field2258 * Math.random()) << 24;
                    } else {
                        var31 = (int) (Math.random() * (double) this.field6324.field2258 + (double) this.field6324.field2294) << 24 | (int) ((double) this.field6324.field2274 * Math.random() + (double) this.field6324.field2275) | (int) (Math.random() * (double) this.field6324.field2271 + (double) this.field6324.field2255) << 16 | (int) (Math.random() * (double) this.field6324.field2256 + (double) this.field6324.field2263) << 8;
                    }
                    int var34 = this.field6324.field2238;
                    if (!arg3.method362() && !this.field6324.field2277) {
                        var34 = -1;
                    }
                    if (class428.field6027 == class145.field1913) {
                        new class115(this, var25, var26, var27, var11, var12, var10, var28, var29, var31, var30, var34, this.field6324.field2243, this.field6324.field2266);
                    } else {
                        class115 var35 = class105.field1390[class428.field6027];
                        class428.field6027 = class428.field6027 + 1 & 0x3FF;
                        var35.method773(this, var25, var26, var27, var11, var12, var10, var28, var29, var31, var30, var34, this.field6324.field2243, this.field6324.field2266);
                    }
                }
            }
        }
        this.field6337 = 0;
        for (class115 var37 = (class115) this.field6317.method2748(2); var37 != null; var37 = (class115) this.field6317.method2751(-16195)) {
            var37.method772(arg0, arg2);
            this.field6337++;
        }
        if (!arg1) {
            this.field6310 = -74;
        }
        class369.field5271 += this.field6337;
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)V", line = 169)
    public static void method2641(byte arg0) {
        field6327 = null;
        int var1 = -54 / ((arg0 + 23) / 48);
        field6335 = null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(JI)V", line = 181)
    public final void method2642(long arg0, int arg1) {
        if (arg1 >= -27) {
            method2641((byte) -78);
        }
        field6333++;
        for (class115 var4 = (class115) this.field6317.method2748(2); var4 != null; var4 = (class115) this.field6317.method2751(-16195)) {
            var4.method774(arg0);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V", line = 212)
    public final void method2643(int arg0) {
        this.field6323 = this.field6334.field6467;
        this.field6314 = this.field6334.field6454;
        this.field6309 = this.field6334.field6455;
        this.field6326 = this.field6334.field6453;
        this.field6313 = this.field6334.field6466;
        this.field6328 = this.field6334.field6463;
        this.field6307 = this.field6334.field6456;
        field6308++;
        this.field6311 = this.field6334.field6469;
        this.field6310 = this.field6334.field6459;
        if (this.field6328 == this.field6314 && this.field6328 == this.field6307 && this.field6323 == this.field6309 && this.field6310 == this.field6309 && this.field6326 == this.field6311 && this.field6313 == this.field6311) {
            this.field6306 = true;
            return;
        }
        this.field6306 = false;
        int var2 = (this.field6328 + this.field6314 + this.field6307) / 3;
        int var3 = (this.field6323 + this.field6310 + this.field6309) / 3;
        int var4 = (this.field6326 + this.field6313 + this.field6311) / 3;
        if (arg0 != 65535 || this.field6330 == var2 && this.field6331 == var3 && this.field6319 == var4) {
            return;
        }
        this.field6319 = var4;
        this.field6331 = var3;
        this.field6330 = var2;
        int var5 = this.field6328 - this.field6314;
        int var6 = this.field6309 - this.field6323;
        int var7 = this.field6311 - this.field6326;
        int var8 = this.field6307 - this.field6314;
        int var9 = this.field6310 - this.field6323;
        int var10 = this.field6313 - this.field6326;
        this.field6312 = var6 * var10 - (var7 * var9);
        this.field6332 = var7 * var8 - var5 * var10;
        for (this.field6338 = var5 * var9 - (var6 * var8); this.field6312 > 32767 || this.field6332 > 32767 || this.field6338 > 32767 || this.field6312 < -32767 || this.field6332 < -32767 || this.field6338 < -32767; this.field6338 >>= 0x1) {
            this.field6312 >>= 0x1;
            this.field6332 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field6338 * this.field6338 + this.field6332 * this.field6332 + this.field6312 * this.field6312));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field6332 = this.field6332 * 32767 / var11;
        this.field6312 = this.field6312 * 32767 / var11;
        this.field6338 = this.field6338 * 32767 / var11;
        if (this.field6324.field2281 <= 0 && this.field6324.field2262 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field6338, (double) this.field6312) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field6332, Math.sqrt((double) (this.field6338 * this.field6338 + this.field6312 * this.field6312))) * 2607.5945876176133D);
        this.field6336 = this.field6324.field2281 - this.field6324.field2248;
        this.field6329 = var12 + this.field6324.field2248 - (this.field6336 >> 1);
        this.field6318 = this.field6324.field2262 - this.field6324.field2287;
        this.field6315 = this.field6324.field2287 + var13 - (this.field6318 >> 1);
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lza;Lck;Llm;J)V", line = 332)
    public class452(class290 arg0, class462 arg1, class351 arg2, long arg3) {
        this.field6320 = arg2;
        this.field6321 = arg3;
        this.field6334 = arg1;
        this.field6324 = this.field6334.method2688(83);
        if (!arg0.method362() && this.field6324.field2268 != -1) {
            this.field6324 = class324.method1956(true, this.field6324.field2268);
        }
        this.field6317 = new class477();
        this.field6322 = (int) ((double) this.field6322 + Math.random() * 64.0D);
        this.method2643(65535);
    }
}
