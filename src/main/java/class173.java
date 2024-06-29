import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class173 extends class9 implements class321 {

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "Ltl;")
    private class102 field2258 = new class102();

    @OriginalMember(owner = "client!ks", name = "E", descriptor = "Lm;")
    private class187 field2263 = new class428();

    @OriginalMember(owner = "client!ks", name = "H", descriptor = "Z")
    private boolean field2266 = false;

    @OriginalMember(owner = "client!ks", name = "O", descriptor = "[Lgg;")
    private class321[] field2273 = new class321[4];

    @OriginalMember(owner = "client!ks", name = "M", descriptor = "I")
    public int field2271 = 8;

    @OriginalMember(owner = "client!ks", name = "P", descriptor = "I")
    public int field2274 = 3;

    @OriginalMember(owner = "client!ks", name = "Q", descriptor = "I")
    private int field2275 = -1;

    @OriginalMember(owner = "client!ks", name = "F", descriptor = "Leb;")
    private class395 field2264 = new class395();

    @OriginalMember(owner = "client!ks", name = "S", descriptor = "Leb;")
    private class395 field2277 = new class395();

    @OriginalMember(owner = "client!ks", name = "T", descriptor = "Leb;")
    private class395 field2278 = new class395();

    @OriginalMember(owner = "client!ks", name = "U", descriptor = "Leb;")
    private class395 field2279 = new class395();

    @OriginalMember(owner = "client!ks", name = "V", descriptor = "Leb;")
    private class395 field2280 = new class395();

    @OriginalMember(owner = "client!ks", name = "W", descriptor = "Leb;")
    private class395 field2281 = new class395();

    @OriginalMember(owner = "client!ks", name = "X", descriptor = "Leb;")
    private class395 field2282 = new class395();

    @OriginalMember(owner = "client!ks", name = "ab", descriptor = "[F")
    private float[] field2285 = new float[4];

    @OriginalMember(owner = "client!ks", name = "tb", descriptor = "F")
    private float field2304 = 1.0F;

    @OriginalMember(owner = "client!ks", name = "rb", descriptor = "I")
    public int field2302 = 0;

    @OriginalMember(owner = "client!ks", name = "Jb", descriptor = "I")
    private int field2320 = 8448;

    @OriginalMember(owner = "client!ks", name = "Mb", descriptor = "I")
    public int field2323 = -1;

    @OriginalMember(owner = "client!ks", name = "ib", descriptor = "I")
    public int field2293 = -1;

    @OriginalMember(owner = "client!ks", name = "nb", descriptor = "F")
    public float field2298 = 1.0F;

    @OriginalMember(owner = "client!ks", name = "fc", descriptor = "[F")
    private float[] field2342 = new float[4];

    @OriginalMember(owner = "client!ks", name = "yb", descriptor = "I")
    private int field2309 = 0;

    @OriginalMember(owner = "client!ks", name = "Ub", descriptor = "F")
    public float field2331 = -1.0F;

    @OriginalMember(owner = "client!ks", name = "hc", descriptor = "I")
    private int field2344 = 0;

    @OriginalMember(owner = "client!ks", name = "Lb", descriptor = "F")
    public float field2322 = 1.0F;

    @OriginalMember(owner = "client!ks", name = "bb", descriptor = "I")
    private int field2286 = -1;

    @OriginalMember(owner = "client!ks", name = "Ib", descriptor = "F")
    public float field2319 = 3584.0F;

    @OriginalMember(owner = "client!ks", name = "yc", descriptor = "F")
    public float field2361 = 3584.0F;

    @OriginalMember(owner = "client!ks", name = "ec", descriptor = "I")
    private int field2341 = 0;

    @OriginalMember(owner = "client!ks", name = "qb", descriptor = "I")
    private int field2301 = 8448;

    @OriginalMember(owner = "client!ks", name = "Zb", descriptor = "[F")
    public float[] field2336 = new float[4];

    @OriginalMember(owner = "client!ks", name = "ic", descriptor = "I")
    public int field2345 = -1;

    @OriginalMember(owner = "client!ks", name = "hb", descriptor = "I")
    public int field2292 = 512;

    @OriginalMember(owner = "client!ks", name = "fb", descriptor = "[F")
    private float[] field2290 = new float[4];

    @OriginalMember(owner = "client!ks", name = "zc", descriptor = "F")
    public float field2362 = 1.0F;

    @OriginalMember(owner = "client!ks", name = "nc", descriptor = "I")
    public int field2350 = 50;

    @OriginalMember(owner = "client!ks", name = "Ec", descriptor = "Z")
    private boolean field2367 = true;

    @OriginalMember(owner = "client!ks", name = "Gc", descriptor = "F")
    private float field2369 = 1.0F;

    @OriginalMember(owner = "client!ks", name = "Vb", descriptor = "I")
    public int field2332 = 512;

    @OriginalMember(owner = "client!ks", name = "oc", descriptor = "I")
    public int field2351 = 3584;

    @OriginalMember(owner = "client!ks", name = "Qb", descriptor = "I")
    public int field2327 = 0;

    @OriginalMember(owner = "client!ks", name = "ob", descriptor = "I")
    private int field2299 = 0;

    @OriginalMember(owner = "client!ks", name = "Fc", descriptor = "F")
    public float field2368 = -1.0F;

    @OriginalMember(owner = "client!ks", name = "eb", descriptor = "F")
    private float field2289 = 0.0F;

    @OriginalMember(owner = "client!ks", name = "Cc", descriptor = "[F")
    private float[] field2365 = new float[16];

    @OriginalMember(owner = "client!ks", name = "Xb", descriptor = "I")
    private int field2334 = 0;

    @OriginalMember(owner = "client!ks", name = "Ic", descriptor = "I")
    private int field2371 = 0;

    @OriginalMember(owner = "client!ks", name = "lc", descriptor = "I")
    private int field2348 = 0;

    @OriginalMember(owner = "client!ks", name = "xc", descriptor = "I")
    private int field2360 = -1;

    @OriginalMember(owner = "client!ks", name = "w", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2255;

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "Lic;")
    public class235 field2260;

    @OriginalMember(owner = "client!ks", name = "x", descriptor = "Ljaggl/context;")
    private context field2256;

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "Ljaggl/opengl;")
    public opengl field2253;

    @OriginalMember(owner = "client!ks", name = "lb", descriptor = "Z")
    public boolean field2296;

    @OriginalMember(owner = "client!ks", name = "Wc", descriptor = "I")
    public int field2385;

    @OriginalMember(owner = "client!ks", name = "Pc", descriptor = "Ljava/lang/String;")
    private String field2378;

    @OriginalMember(owner = "client!ks", name = "dc", descriptor = "Ljava/lang/String;")
    private String field2340;

    @OriginalMember(owner = "client!ks", name = "Hb", descriptor = "Z")
    private boolean field2318;

    @OriginalMember(owner = "client!ks", name = "Nc", descriptor = "Z")
    public boolean field2376;

    @OriginalMember(owner = "client!ks", name = "Jc", descriptor = "Z")
    public boolean field2372;

    @OriginalMember(owner = "client!ks", name = "wc", descriptor = "Z")
    public boolean field2359;

    @OriginalMember(owner = "client!ks", name = "Hc", descriptor = "Z")
    private boolean field2370;

    @OriginalMember(owner = "client!ks", name = "Ab", descriptor = "Z")
    public boolean field2311;

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "Ldk;")
    public class445 field2251;

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "Lmo;")
    private class203 field2252;

    @OriginalMember(owner = "client!ks", name = "D", descriptor = "Lof;")
    private class434 field2262;

    @OriginalMember(owner = "client!ks", name = "v", descriptor = "Lu;")
    private class193 field2254;

    @OriginalMember(owner = "client!ks", name = "y", descriptor = "[F")
    private static float[] field2257 = new float[4];

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "[I")
    private static int[] field2250 = new int[1000];

    @OriginalMember(owner = "client!ks", name = "C", descriptor = "[F")
    private static float[] field2261 = new float[4];

    @OriginalMember(owner = "client!ks", name = "A", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field2259 = Boolean.FALSE;

    @OriginalMember(owner = "client!ks", name = "kb", descriptor = "F")
    private float field2295;

    @OriginalMember(owner = "client!ks", name = "pb", descriptor = "F")
    private float field2300;

    @OriginalMember(owner = "client!ks", name = "vb", descriptor = "F")
    public float field2306;

    @OriginalMember(owner = "client!ks", name = "Nb", descriptor = "F")
    public float field2324;

    @OriginalMember(owner = "client!ks", name = "jc", descriptor = "F")
    public float field2346;

    @OriginalMember(owner = "client!ks", name = "mc", descriptor = "F")
    private float field2349;

    @OriginalMember(owner = "client!ks", name = "pc", descriptor = "F")
    public float field2352;

    @OriginalMember(owner = "client!ks", name = "qc", descriptor = "F")
    public float field2353;

    @OriginalMember(owner = "client!ks", name = "Mc", descriptor = "F")
    public float field2375;

    @OriginalMember(owner = "client!ks", name = "Oc", descriptor = "F")
    public float field2377;

    @OriginalMember(owner = "client!ks", name = "Qc", descriptor = "F")
    public float field2379;

    @OriginalMember(owner = "client!ks", name = "G", descriptor = "I")
    public int field2265;

    @OriginalMember(owner = "client!ks", name = "I", descriptor = "I")
    private int field2267;

    @OriginalMember(owner = "client!ks", name = "J", descriptor = "I")
    public int field2268;

    @OriginalMember(owner = "client!ks", name = "L", descriptor = "I")
    public int field2270;

    @OriginalMember(owner = "client!ks", name = "N", descriptor = "I")
    public int field2272;

    @OriginalMember(owner = "client!ks", name = "R", descriptor = "I")
    public int field2276;

    @OriginalMember(owner = "client!ks", name = "gb", descriptor = "I")
    public int field2291;

    @OriginalMember(owner = "client!ks", name = "jb", descriptor = "I")
    private int field2294;

    @OriginalMember(owner = "client!ks", name = "wb", descriptor = "I")
    private int field2307;

    @OriginalMember(owner = "client!ks", name = "zb", descriptor = "I")
    public int field2310;

    @OriginalMember(owner = "client!ks", name = "Pb", descriptor = "I")
    private int field2326;

    @OriginalMember(owner = "client!ks", name = "Sb", descriptor = "I")
    private int field2329;

    @OriginalMember(owner = "client!ks", name = "Tb", descriptor = "I")
    private int field2330;

    @OriginalMember(owner = "client!ks", name = "cc", descriptor = "I")
    private int field2339;

    @OriginalMember(owner = "client!ks", name = "gc", descriptor = "I")
    private int field2343;

    @OriginalMember(owner = "client!ks", name = "kc", descriptor = "I")
    private int field2347;

    @OriginalMember(owner = "client!ks", name = "Sc", descriptor = "I")
    private int field2381;

    @OriginalMember(owner = "client!ks", name = "Xc", descriptor = "I")
    public int field2386;

    @OriginalMember(owner = "client!ks", name = "Yc", descriptor = "I")
    private int field2387;

    @OriginalMember(owner = "client!ks", name = "Zc", descriptor = "I")
    private int field2388;

    @OriginalMember(owner = "client!ks", name = "Ac", descriptor = "J")
    private long field2363;

    @OriginalMember(owner = "client!ks", name = "Gb", descriptor = "Lmf;")
    private class16 field2317;

    @OriginalMember(owner = "client!ks", name = "rc", descriptor = "Lba;")
    private class280 field2354;

    @OriginalMember(owner = "client!ks", name = "K", descriptor = "Lgg;")
    private class321 field2269;

    @OriginalMember(owner = "client!ks", name = "Lc", descriptor = "Lkd;")
    private class340 field2374;

    @OriginalMember(owner = "client!ks", name = "Bb", descriptor = "Ld;")
    private class391 field2312;

    @OriginalMember(owner = "client!ks", name = "Z", descriptor = "Lad;")
    public class413 field2284;

    @OriginalMember(owner = "client!ks", name = "db", descriptor = "Lad;")
    public class413 field2288;

    @OriginalMember(owner = "client!ks", name = "Rb", descriptor = "Lad;")
    public class413 field2328;

    @OriginalMember(owner = "client!ks", name = "Wb", descriptor = "Lad;")
    public class413 field2333;

    @OriginalMember(owner = "client!ks", name = "ac", descriptor = "Lad;")
    public class413 field2337;

    @OriginalMember(owner = "client!ks", name = "bc", descriptor = "Lad;")
    public class413 field2338;

    @OriginalMember(owner = "client!ks", name = "Dc", descriptor = "Lad;")
    public class413 field2366;

    @OriginalMember(owner = "client!ks", name = "Tc", descriptor = "Lad;")
    public class413 field2382;

    @OriginalMember(owner = "client!ks", name = "vc", descriptor = "Lvr;")
    public class428 field2358;

    @OriginalMember(owner = "client!ks", name = "Bc", descriptor = "Lvr;")
    public class428 field2364;

    @OriginalMember(owner = "client!ks", name = "ub", descriptor = "Ltj;")
    public class442 field2305;

    @OriginalMember(owner = "client!ks", name = "sc", descriptor = "Lqb;")
    public class89 field2355;

    @OriginalMember(owner = "client!ks", name = "tc", descriptor = "Lqb;")
    public class89 field2356;

    @OriginalMember(owner = "client!ks", name = "uc", descriptor = "Lqb;")
    public class89 field2357;

    @OriginalMember(owner = "client!ks", name = "Y", descriptor = "Z")
    private boolean field2283;

    @OriginalMember(owner = "client!ks", name = "cb", descriptor = "Z")
    private boolean field2287;

    @OriginalMember(owner = "client!ks", name = "mb", descriptor = "Z")
    public boolean field2297;

    @OriginalMember(owner = "client!ks", name = "sb", descriptor = "Z")
    private boolean field2303;

    @OriginalMember(owner = "client!ks", name = "xb", descriptor = "Z")
    private boolean field2308;

    @OriginalMember(owner = "client!ks", name = "Cb", descriptor = "Z")
    private boolean field2313;

    @OriginalMember(owner = "client!ks", name = "Db", descriptor = "Z")
    public boolean field2314;

    @OriginalMember(owner = "client!ks", name = "Eb", descriptor = "Z")
    public boolean field2315;

    @OriginalMember(owner = "client!ks", name = "Fb", descriptor = "Z")
    private boolean field2316;

    @OriginalMember(owner = "client!ks", name = "Kb", descriptor = "Z")
    public boolean field2321;

    @OriginalMember(owner = "client!ks", name = "Ob", descriptor = "Z")
    private boolean field2325;

    @OriginalMember(owner = "client!ks", name = "Yb", descriptor = "Z")
    public boolean field2335;

    @OriginalMember(owner = "client!ks", name = "Kc", descriptor = "Z")
    private boolean field2373;

    @OriginalMember(owner = "client!ks", name = "Uc", descriptor = "Z")
    private boolean field2383;

    @OriginalMember(owner = "client!ks", name = "Vc", descriptor = "Z")
    private boolean field2384;

    @OriginalMember(owner = "client!ks", name = "Rc", descriptor = "[Lvo;")
    private class205[] field2380;

    @OriginalMember(owner = "client!ks", name = "E", descriptor = "()V")
    private final void method1126() {
        if (this.field2381 == 1) {
            return;
        }
        this.field2253.glMatrixMode(5889);
        this.field2253.glLoadIdentity();
        if (this.field2270 > 0 && this.field2272 > 0) {
            this.field2253.glOrtho(0.0D, (double) this.field2270, (double) this.field2272, 0.0D, -1.0D, 1.0D);
        }
        this.field2253.glMatrixMode(5888);
        this.field2253.glLoadIdentity();
        this.field2381 = 1;
        this.field2330 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(III)V")
    public final void method1127(int arg0, int arg1, int arg2) {
        this.field2253.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field2253.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!ks", name = "N", descriptor = "()V")
    public final void method1128() {
        if (this.field2330 == 2) {
            return;
        }
        this.method1126();
        this.method1142(false);
        this.method1132(false);
        this.method1162(false);
        this.method1189(false);
        this.method1133(-2);
        this.field2330 = 2;
    }

    @OriginalMember(owner = "client!ks", name = "O", descriptor = "()V")
    private final void method1129() {
        float[] var1 = this.field2365;
        float var2 = (float) (-this.field2302 * this.field2350) / (float) this.field2292;
        float var3 = (float) ((this.field2270 - this.field2302) * this.field2350) / (float) this.field2292;
        float var4 = (float) (this.field2350 * this.field2327) / (float) this.field2332;
        float var5 = (float) ((this.field2327 - this.field2272) * this.field2350) / (float) this.field2332;
        if (var2 == var3 || var4 == var5) {
            var1[0] = 1.0F;
            var1[1] = 0.0F;
            var1[2] = 0.0F;
            var1[3] = 0.0F;
            var1[4] = 0.0F;
            var1[5] = 1.0F;
            var1[6] = 0.0F;
            var1[7] = 0.0F;
            var1[8] = 0.0F;
            var1[9] = 0.0F;
            var1[10] = 1.0F;
            var1[11] = 0.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = 0.0F;
            var1[15] = 1.0F;
        } else {
            float var6 = (float) this.field2350 * 2.0F;
            var1[0] = var6 / (var3 - var2);
            var1[1] = 0.0F;
            var1[2] = 0.0F;
            var1[3] = 0.0F;
            var1[4] = 0.0F;
            var1[5] = var6 / (var4 - var5);
            var1[6] = 0.0F;
            var1[7] = 0.0F;
            var1[8] = (var2 + var3) / (var3 - var2);
            var1[9] = (var4 + var5) / (var4 - var5);
            var1[10] = this.field2300 = (float) (-(this.field2351 + this.field2350)) / (float) (this.field2351 - this.field2350);
            var1[11] = -1.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = this.field2349 = -((float) this.field2351 * var6) / (float) (this.field2351 - this.field2350);
            var1[15] = 0.0F;
        }
        this.method1166();
    }

    @OriginalMember(owner = "client!ks", name = "P", descriptor = "()V")
    private final void method1130() {
        this.field2253.glLoadIdentity();
        this.field2253.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field2253.glMultMatrixf(this.field2364.method2639(false), 0);
        this.method1171();
    }

    @OriginalMember(owner = "client!ks", name = "D", descriptor = "()F")
    public final float method149() {
        return this.field2377;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lgg;)V")
    public final void method1131(class321 arg0) {
        if (this.field2275 >= 3) {
            throw new RuntimeException();
        }
        if (this.field2275 >= 0) {
            this.field2273[this.field2275].method1140();
        }
        this.field2269 = this.field2273[++this.field2275] = arg0;
        this.field2269.method1149();
    }

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "()V")
    public final void method83() {
        this.field2270 = this.field2255.getWidth();
        this.field2272 = this.field2255.getHeight();
        this.field2253.glViewport(this.field2334, this.field2344, this.field2270, this.field2272);
        this.method1170();
        this.method162();
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(Z)V")
    public final void method146(boolean arg0) {
        this.field2367 = arg0;
        this.method1188();
    }

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "()Z")
    public final boolean method109() {
        return true;
    }

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "()Z")
    public final boolean method135() {
        return this.field2283;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "([Lbi;Lm;[Loo;I)V")
    public final void method147(class143[] arg0, class187 arg1, class396[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method947(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "()Z")
    public final boolean method94() {
        return true;
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(Z)V")
    public final void method1132(boolean arg0) {
        if (this.field2373 != arg0) {
            this.field2373 = arg0;
            this.method1198();
            this.field2330 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IFFFFF)V")
    public final void method133(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field2286 != arg0;
        if (var7 || this.field2331 != arg1 || this.field2368 != arg2) {
            this.field2286 = arg0;
            this.field2331 = arg1;
            this.field2368 = arg2;
            if (var7) {
                this.field2362 = (float) (this.field2286 & 0xFF0000) / 1.671168E7F;
                this.field2298 = (float) (this.field2286 & 0xFFFF) / 65535.0F;
                this.field2322 = (float) (this.field2286 & 0xFF) / 255.0F;
                this.method1154();
            }
            this.method1175();
        }
        if (this.field2290[0] == arg3 && this.field2290[1] == arg4 && this.field2290[2] == arg5) {
            return;
        }
        this.field2290[0] = arg3;
        this.field2290[1] = arg4;
        this.field2290[2] = arg5;
        this.field2285[0] = -arg3;
        this.field2285[1] = -arg4;
        this.field2285[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field2336[0] = arg3 * var8;
        this.field2336[1] = arg4 * var8;
        this.field2336[2] = arg5 * var8;
        this.field2342[0] = -this.field2336[0];
        this.field2342[1] = -this.field2336[1];
        this.field2342[2] = -this.field2336[2];
        this.method1171();
        this.field2310 = (int) (arg3 * 256.0F / arg4);
        this.field2386 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "(I)V")
    public final void method1133(int arg0) {
        this.method1200(arg0, true);
    }

    @OriginalMember(owner = "client!ks", name = "Q", descriptor = "()I")
    private final int method1134() {
        int var1 = 0;
        this.field2378 = this.field2253.glGetString(7936);
        this.field2340 = this.field2253.glGetString(7937);
        String var2 = this.field2378.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field2253.glGetString(7938);
        String[] var4 = class278.method1886(' ', -19369, var3.replace('.', ' '));
        if (var4.length >= 2) {
            try {
                int var5 = class92.method627(var4[0], (byte) 38);
                int var6 = class92.method627(var4[1], (byte) -114);
                this.field2343 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field2343 < 12) {
            var1 |= 0x2;
        }
        if (!this.field2253.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field2253.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field2253.glGetIntegerv(34018, var8, 0);
        this.field2291 = var8[0];
        this.field2253.glGetIntegerv(34929, var8, 0);
        this.field2329 = var8[0];
        this.field2253.glGetIntegerv(34930, var8, 0);
        this.field2326 = var8[0];
        if (this.field2291 < 2 || this.field2329 < 2 || this.field2326 < 2) {
            var1 |= 0x10;
        }
        this.field2303 = class341.field5017 != null && class341.field5017.startsWith("mac");
        this.field2296 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field2318 = this.field2253.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field2283 = this.field2253.isExtensionAvailable("GL_ARB_multisample");
        this.field2315 = this.field2253.isExtensionAvailable("GL_ARB_vertex_program");
        this.field2253.isExtensionAvailable("GL_ARB_fragment_program");
        this.field2253.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field2314 = this.field2253.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field2376 = this.field2253.isExtensionAvailable("GL_EXT_texture3D");
        this.field2359 = this.field2253.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field2321 = this.field2253.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field2372 = this.field2253.isExtensionAvailable("GL_ARB_texture_float");
        this.field2335 = false;
        this.field2311 = this.field2253.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIII)V")
    public final void method97(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1186();
        this.method1179(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field2253.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field2253.glBegin(1);
        this.field2253.glVertex2f(var6, var7);
        this.field2253.glVertex2f(var6, (float) arg2 + var7);
        this.field2253.glEnd();
    }

    @OriginalMember(owner = "client!ks", name = "R", descriptor = "()V")
    public final void method1135() {
        if (this.field2330 == 8) {
            return;
        }
        this.method1196();
        this.method1142(true);
        this.method1162(true);
        this.method1189(true);
        this.method1179(1);
        this.method1143(1);
        this.field2330 = 8;
    }

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "(I)V")
    public final void method138(int arg0) {
        this.method1179(0);
        this.field2253.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field2253.glClear(16384);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ld;III)V")
    public final void method1136(class391 arg0, int arg1, int arg2, int arg3) {
        this.method1163(arg0);
        arg0.method50(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(FFFF)V")
    public final void method1137(float arg0, float arg1, float arg2, float arg3) {
        field2261[0] = arg0;
        field2261[1] = arg1;
        field2261[2] = arg2;
        field2261[3] = arg3;
        this.field2253.glTexEnvfv(8960, 8705, field2261, 0);
    }

    @OriginalMember(owner = "client!ks", name = "S", descriptor = "()V")
    private final void method1138() {
        int var1;
        if (this.field2297) {
            this.field2253.glFogf(2915, 0.0F);
            this.field2253.glFogf(2916, 1.0F);
            var1 = this.field2360;
        } else {
            this.field2295 = (float) (this.field2351 - 256) - this.field2289;
            this.field2346 = this.field2295 - (float) this.field2293 * this.field2304;
            if (this.field2346 < (float) this.field2350) {
                this.field2346 = (float) this.field2350;
            }
            this.field2253.glFogf(2915, this.field2346);
            this.field2253.glFogf(2916, this.field2295);
            var1 = this.field2323;
        }
        field2261[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field2261[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field2261[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field2253.glFogfv(2918, field2261, 0);
    }

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "()Z")
    public final boolean method110() {
        return !this.field2303;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(IIII)V")
    public final void method77(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field2270) {
            arg2 = this.field2270;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field2272) {
            arg3 = this.field2272;
        }
        this.field2341 = arg0;
        this.field2309 = arg1;
        this.field2371 = arg2;
        this.field2299 = arg3;
        this.field2253.glEnable(3089);
        this.method1193();
        this.method1178();
    }

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "(Z)V")
    public final void method1139(boolean arg0) {
        if (this.field2308 != arg0) {
            this.field2308 = arg0;
            this.method1198();
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "()V")
    public final void method1140() {
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(FFF)V")
    public final void method75(float arg0, float arg1, float arg2) {
        class193.field2694 = arg0;
        class193.field2702 = arg1;
        class193.field2703 = arg2;
    }

    @OriginalMember(owner = "client!ks", name = "w", descriptor = "()V")
    public final void method119() {
    }

    @OriginalMember(owner = "client!ks", name = "H", descriptor = "()Z")
    public final boolean method159() {
        if (!this.field2254.method353(0)) {
            if (!this.field2262.method2661(this.field2254)) {
                return false;
            }
            this.field2251.method2735((byte) 119);
        }
        return true;
    }

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "(I)V")
    public final synchronized void method1141(int arg0) {
        class13 var2 = new class13(arg0);
        this.field2281.method2484(0, var2);
    }

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "(Z)V")
    public final void method1142(boolean arg0) {
        if (this.field2384 != arg0) {
            this.field2384 = arg0;
            this.method1159();
            this.field2330 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(IIII)V")
    public final void method101(int arg0, int arg1, int arg2, int arg3) {
        this.field2302 = arg0;
        this.field2327 = arg1;
        this.field2292 = arg2;
        this.field2332 = arg3;
        this.method1129();
        this.method1193();
        if (this.field2381 == 3) {
            this.method1185();
        } else if (this.field2381 == 2) {
            this.method1164();
        }
    }

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "(I)V")
    public final void method1143(int arg0) {
        if (arg0 == 0) {
            this.method1161(7681, 7681);
        } else if (arg0 == 1) {
            this.method1161(8448, 8448);
        } else if (arg0 == 2) {
            this.method1161(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!ks", name = "F", descriptor = "()I")
    public final int method153() {
        return this.field2268 + this.field2265 + this.field2267;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lhi;[Ltr;Z)Ldf;")
    public final class85 method122(class365 arg0, class144[] arg1, boolean arg2) {
        return new class174(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I[Lap;)V")
    public final void method68(int arg0, class298[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class298 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field2257[0] = (float) var4.field4337;
            field2257[1] = (float) var4.field4338;
            field2257[2] = (float) var4.field4336;
            field2257[3] = 1.0F;
            this.field2253.glLightfv(var5, 4611, field2257, 0);
            int var6 = var4.field4342;
            float var7 = var4.field4335 / 255.0F;
            field2257[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field2257[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field2257[2] = (float) (var6 & 0xFF) * var7;
            this.field2253.glLightfv(var5, 4609, field2257, 0);
            this.field2253.glLightf(var5, 4617, 1.0F / (float) (var4.field4332 * var4.field4332));
            this.field2253.glEnable(var5);
        }
        while (var3 < this.field2348) {
            this.field2253.glDisable(var3 + 16386);
            var3++;
        }
        this.field2348 = arg0;
    }

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "(II)V")
    public final synchronized void method1144(int arg0, int arg1) {
        class13 var3 = new class13(arg1);
        var3.field3907 = (long) arg0;
        this.field2279.method2484(0, var3);
    }

    @OriginalMember(owner = "client!ks", name = "k", descriptor = "(I)V")
    public final void method1145(int arg0) {
        field2261[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field2261[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field2261[2] = (float) (arg0 & 0xFF) / 255.0F;
        field2261[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field2253.glTexEnvfv(8960, 8705, field2261, 0);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(III[I)V")
    public final void method114(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field2364.field6228 + (float) arg0 * this.field2364.field6227 + (float) arg1 * this.field2364.field6229 + this.field2364.field6219;
        if ((var5 < (float) this.field2350) || (var5 > (float) this.field2351)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field2364.field6223 + (float) arg0 * this.field2364.field6218 + (float) arg1 * this.field2364.field6221 + this.field2364.field6224) * (float) this.field2292 / var5);
        int var7 = (int) (((float) arg2 * this.field2364.field6222 + (float) arg0 * this.field2364.field6226 + (float) arg1 * this.field2364.field6220 + this.field2364.field6217) * (float) this.field2332 / var5);
        if ((float) var6 >= this.field2353 && (float) var6 <= this.field2379 && (float) var7 >= this.field2352 && (float) var7 <= this.field2375) {
            arg3[0] = (int) ((float) var6 - this.field2353);
            arg3[1] = (int) ((float) var7 - this.field2352);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "()Z")
    public final boolean method78() {
        return false;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(F)V")
    public final void method1146(float arg0) {
        if (this.field2369 != arg0) {
            this.field2369 = arg0;
            if (this.field2381 == 3) {
                this.method1185();
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "()I")
    public final int method1147() {
        return this.field2272;
    }

    @OriginalMember(owner = "client!ks", name = "C", descriptor = "()Lm;")
    public final class187 method145() {
        return this.field2263;
    }

    @OriginalMember(owner = "client!ks", name = "T", descriptor = "()V")
    public final void method1148() {
        this.field2253.glPopMatrix();
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "()V")
    public final void method1149() {
    }

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "(I)V")
    public final void method1150(int arg0) {
        if (this.field2347 != arg0) {
            this.field2253.glActiveTexture(arg0 + 33984);
            this.field2347 = arg0;
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(FFF)V")
    private final void method1151(float arg0, float arg1, float arg2) {
        this.field2253.glMatrixMode(5890);
        if (this.field2287) {
            this.field2253.glLoadIdentity();
        }
        this.field2253.glTranslatef(arg0, arg1, arg2);
        this.field2253.glMatrixMode(5888);
        this.field2287 = true;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIII)[I")
    public final int[] method73(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field2253.glReadPixels(arg0, this.field2272 - arg1 - var6, arg2, 1, 32993, this.field2385, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "(II)V")
    public final void method1152(int arg0, int arg1) {
        this.field2334 = arg0;
        this.field2344 = arg1;
        this.field2253.glViewport(arg0, arg1, this.field2270, this.field2272);
        this.method1178();
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIIII)V")
    public final void method134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2253.glLineWidth((float) arg5);
        this.method137(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field2253.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ks", name = "M", descriptor = "()Z")
    public final boolean method168() {
        return this.field2254.method353(0);
    }

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "(I)V")
    public final synchronized void method1153(int arg0) {
        class13 var2 = new class13(arg0);
        this.field2282.method2484(0, var2);
    }

    @OriginalMember(owner = "client!ks", name = "U", descriptor = "()V")
    private final void method1154() {
        field2261[0] = this.field2362 * this.field2324;
        field2261[1] = this.field2324 * this.field2298;
        field2261[2] = this.field2324 * this.field2322;
        field2261[3] = 1.0F;
        this.field2253.glLightModelfv(2899, field2261, 0);
    }

    @OriginalMember(owner = "client!ks", name = "V", descriptor = "()Lgg;")
    public final class321 method1155() {
        return this.field2269;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V")
    public final void method79(boolean arg0) {
    }

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "()V")
    public final void method72() {
        this.field2252.method1394(0, false, false, (byte) -77);
        this.field2297 = false;
        this.method1138();
        this.method1159();
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "([I)V")
    public final void method76(int[] arg0) {
        arg0[0] = this.field2341;
        arg0[1] = this.field2309;
        arg0[2] = this.field2371;
        arg0[3] = this.field2299;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(IIIII)V")
    public final void method106(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
    public final void method87(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!ks", name = "k", descriptor = "()Z")
    public final boolean method86() {
        return false;
    }

    @OriginalMember(owner = "client!ks", name = "W", descriptor = "()V")
    private final void method1156() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field2256.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class418.method2587(false, 1000L);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field2317 == null || this.field2317.field1094 < arg2 || this.field2317.field1093 < arg3) {
            this.field2317 = class16.method220(6406, 6406, arg3, this, 34037, arg2, false, arg6);
            this.field2317.method599(false, false);
            var10 = this.field2317.field254;
            var11 = this.field2317.field256;
        } else {
            this.field2317.method597(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field2317.field254 / (float) this.field2317.field1093;
            var11 = (float) arg2 * this.field2317.field256 / (float) this.field2317.field1094;
        }
        this.method1128();
        this.method1160(this.field2317);
        this.method1179(arg8);
        this.field2253.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1145(arg5);
        this.method1161(34165, 34165);
        this.method1127(0, 34166, 768);
        this.method1127(2, 5890, 770);
        this.method1176(0, 34166, 770);
        this.method1176(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field2253.glBegin(7);
        this.field2253.glTexCoord2f(0.0F, 0.0F);
        this.field2253.glVertex2f(var12, var13);
        this.field2253.glTexCoord2f(0.0F, var11);
        this.field2253.glVertex2f(var12, var15);
        this.field2253.glTexCoord2f(var10, var11);
        this.field2253.glVertex2f(var14, var15);
        this.field2253.glTexCoord2f(var10, 0.0F);
        this.field2253.glVertex2f(var14, var13);
        this.field2253.glEnd();
        this.method1127(0, 5890, 768);
        this.method1127(2, 34166, 770);
        this.method1176(0, 5890, 770);
        this.method1176(2, 34166, 770);
    }

    @OriginalMember(owner = "client!ks", name = "X", descriptor = "()V")
    private final void method1157() {
        if (this.field2287) {
            this.field2253.glMatrixMode(5890);
            this.field2253.glLoadIdentity();
            this.field2253.glMatrixMode(5888);
            this.field2287 = false;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "([Lbi;Lci;Lm;[Loo;I)V")
    public final void method108(class143[] arg0, class400 arg1, class187 arg2, class396[] arg3, int arg4) {
        this.method147(arg0, arg2, arg3, arg4);
        this.method70(arg1);
    }

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "(I)V")
    public final synchronized void method1158(int arg0) {
        class13 var2 = new class13(arg0);
        this.field2279.method2484(0, var2);
    }

    @OriginalMember(owner = "client!ks", name = "Y", descriptor = "()V")
    private final void method1159() {
        if (this.field2384 && this.field2297 | this.field2293 >= 0) {
            this.field2253.glEnable(2912);
        } else {
            this.field2253.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!ks", name = "I", descriptor = "()Z")
    public final boolean method160() {
        return true;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lci;)V")
    public final void method70(class400 arg0) {
        this.field2258.method688(this, arg0);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lvo;)V")
    public final void method1160(class205 arg0) {
        class205 var2 = this.field2380[this.field2347];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field2253.glDisable(var2.field2878);
            } else {
                if (var2 == null) {
                    this.field2253.glEnable(arg0.field2878);
                } else if (arg0.field2878 != var2.field2878) {
                    this.field2253.glDisable(var2.field2878);
                    this.field2253.glEnable(arg0.field2878);
                }
                this.field2253.glBindTexture(arg0.field2878, arg0.method1409());
            }
            this.field2380[this.field2347] = arg0;
        }
        this.field2330 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)V")
    public final void method74(int arg0, int arg1, int arg2) {
        if (!this.field2297) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field2360 = arg1;
        this.field2345 = arg2;
        this.method1138();
        this.field2252.method1397(arg0, true, (byte) 69);
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(IIII)V")
    public final void method152(int arg0, int arg1, int arg2, int arg3) {
        this.field2262.method2665(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "(II)V")
    public final void method1161(int arg0, int arg1) {
        if (this.field2347 != 0) {
            this.field2253.glTexEnvi(8960, 34161, arg0);
            this.field2253.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field2320 != arg0) {
            this.field2253.glTexEnvi(8960, 34161, arg0);
            this.field2320 = arg0;
            var3 = true;
        }
        if (this.field2301 != arg1) {
            this.field2253.glTexEnvi(8960, 34162, arg1);
            this.field2301 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field2330 &= 0xFFFFFFE2;
        }
    }

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "(Z)V")
    public final void method1162(boolean arg0) {
        if (this.field2313 == arg0) {
            return;
        }
        if (arg0) {
            this.field2253.glEnable(2929);
        } else {
            this.field2253.glDisable(2929);
        }
        this.field2313 = arg0;
        this.field2330 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ld;)V")
    public final void method1163(class391 arg0) {
        if (this.field2312 != arg0 && this.field2318) {
            this.field2253.glBindBufferARB(34963, arg0.method49());
            this.field2312 = arg0;
        }
    }

    @OriginalMember(owner = "client!ks", name = "Z", descriptor = "()V")
    private final void method1164() {
        this.field2253.glMatrixMode(5889);
        this.field2253.glLoadMatrixf(this.field2365, 0);
        this.field2253.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I[BIZ)Lkd;")
    public final class340 method1165(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class340) (this.field2318 && !arg3 || this.field2370 ? new class112(this, arg0, arg1, arg2, arg3) : new class45(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)V")
    public final void method129(int arg0) {
        this.method1195();
    }

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "(IIII)V")
    public final void method170(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2341 < arg0) {
            this.field2341 = arg0;
        }
        if (this.field2371 > arg2) {
            this.field2371 = arg2;
        }
        if (this.field2309 < arg1) {
            this.field2309 = arg1;
        }
        if (this.field2299 > arg3) {
            this.field2299 = arg3;
        }
        this.field2253.glEnable(3089);
        this.method1193();
        this.method1178();
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIIILtm;II)V")
    public final void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class195 arg6, int arg7, int arg8) {
        class324 var10 = (class324) arg6;
        class16 var11 = var10.field4778;
        this.method1128();
        this.method1160(var10.field4778);
        this.method1179(arg5);
        this.method1161(7681, 8448);
        this.method1127(0, 34167, 768);
        float var12 = var11.field256 / (float) var11.field257;
        float var13 = var11.field254 / (float) var11.field255;
        this.field2253.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field2253.glBegin(1);
        this.field2253.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field2253.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field2253.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field2253.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field2253.glEnd();
        this.method1127(0, 5890, 768);
    }

    @OriginalMember(owner = "client!ks", name = "ab", descriptor = "()V")
    private final void method1166() {
        if (this.field2377 == 0.0F) {
            this.field2365[10] = this.field2300;
            this.field2365[14] = this.field2349;
        } else {
            float var1 = this.field2306 / (this.field2377 + this.field2306);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field2349 * (1.0F - var1) / this.field2377;
            this.field2365[10] = this.field2300 + var3;
            this.field2365[14] = this.field2349 * var2;
        }
        this.field2361 = (this.field2365[14] - (float) this.field2351) / this.field2365[10];
        this.field2319 = (float) this.field2351 - this.field2377;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lvr;)V")
    public final void method1167(class428 arg0) {
        this.field2253.glPushMatrix();
        this.field2253.glMultMatrixf(arg0.method2639(false), 0);
    }

    @OriginalMember(owner = "client!ks", name = "J", descriptor = "()V")
    public final void method162() {
        this.field2341 = 0;
        this.field2309 = 0;
        this.field2371 = this.field2270;
        this.field2299 = this.field2272;
        this.field2253.glDisable(3089);
        this.method1193();
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(IIIIII)V")
    public final void method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1186();
        this.method1179(arg5);
        this.field2253.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field2253.glBegin(2);
        this.field2253.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field2253.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field2253.glEnd();
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lkd;")
    public final class340 method1168(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class340) (this.field2318 && !arg2 || this.field2370 ? new class112(this, arg0, arg1, arg2) : new class45(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!ks", name = "y", descriptor = "()V")
    public final void method125() {
        this.field2262.method2660();
    }

    @OriginalMember(owner = "client!ks", name = "bb", descriptor = "()V")
    private final void method1169() {
        this.method1133(-2);
        for (int var1 = this.field2291 - 1; var1 >= 0; var1--) {
            this.method1150(var1);
            this.method1160((class205) null);
            this.field2253.glTexEnvi(8960, 8704, 34160);
        }
        this.method1161(8448, 8448);
        this.method1127(2, 34168, 770);
        this.method1157();
        this.field2339 = 1;
        this.field2253.glEnable(3042);
        this.field2253.glBlendFunc(770, 771);
        this.field2294 = 1;
        this.field2253.glEnable(3008);
        this.field2253.glAlphaFunc(516, 0.0F);
        this.field2383 = true;
        this.field2253.glColorMask(true, true, true, true);
        this.field2316 = true;
        this.method1142(true);
        this.method1132(true);
        this.method1162(true);
        this.method1189(true);
        this.method1170();
        this.field2253.setSwapInterval(0);
        this.field2253.glShadeModel(7425);
        this.field2253.glClearDepth(1.0F);
        this.field2253.glDepthFunc(515);
        this.field2253.glPolygonMode(1028, 6914);
        this.field2253.glEnable(2884);
        this.field2253.glCullFace(1029);
        this.field2253.glMatrixMode(5888);
        this.field2253.glLoadIdentity();
        this.field2253.glColorMaterial(1028, 5634);
        this.field2253.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field2253.glLightfv(var4, 4608, var2, 0);
            this.field2253.glLightf(var4, 4615, 0.0F);
            this.field2253.glLightf(var4, 4616, 0.0F);
        }
        this.field2253.glEnable(16384);
        this.field2253.glEnable(16385);
        this.field2253.glFogf(2914, 0.95F);
        this.field2253.glFogi(2917, 9729);
        this.field2253.glHint(3156, 4353);
        this.field2286 = this.field2323 = -1;
        this.method162();
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)V")
    public final void method93(int arg0, int arg1) {
        if (this.field2350 == arg0 && this.field2351 == arg1) {
            return;
        }
        this.field2350 = arg0;
        this.field2351 = arg1;
        this.method1129();
        this.method1138();
        if (this.field2381 == 3) {
            this.method1185();
        } else if (this.field2381 == 2) {
            this.method1164();
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)Lmk;")
    public final class161 method99(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!ks", name = "cb", descriptor = "()V")
    public final void method1170() {
        if (this.field2381 != 0) {
            this.field2381 = 0;
            this.field2330 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!ks", name = "db", descriptor = "()V")
    public final void method1171() {
        this.field2253.glLightfv(16384, 4611, this.field2336, 0);
        this.field2253.glLightfv(16385, 4611, this.field2342, 0);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lkd;)V")
    public final void method1172(class340 arg0) {
        if (this.field2374 != arg0 && this.field2318) {
            this.field2253.glBindBufferARB(34962, arg0.method49());
            this.field2374 = arg0;
        }
    }

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "(I)I")
    public final int method1173(int arg0) {
        if (arg0 == 5121 || arg0 == 5120) {
            return 1;
        } else if (arg0 == 5123 || arg0 == 5122) {
            return 2;
        } else if (arg0 == 5125 || arg0 == 5124 || arg0 == 5126) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ks", name = "eb", descriptor = "()Lea;")
    public final class61 method1174() {
        return this.field2354 == null ? null : this.field2354.method344(15733);
    }

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "()Lm;")
    public final class187 method84() {
        return new class428();
    }

    @OriginalMember(owner = "client!ks", name = "fb", descriptor = "()V")
    private final void method1175() {
        field2261[0] = this.field2362 * this.field2331;
        field2261[1] = this.field2331 * this.field2298;
        field2261[2] = this.field2331 * this.field2322;
        field2261[3] = 1.0F;
        this.field2253.glLightfv(16384, 4609, field2261, 0);
        field2261[0] = -this.field2368 * this.field2362;
        field2261[1] = -this.field2368 * this.field2298;
        field2261[2] = -this.field2368 * this.field2322;
        field2261[3] = 1.0F;
        this.field2253.glLightfv(16385, 4609, field2261, 0);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II[[I[[IIII)Lui;")
    public final class378 method92(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class207(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(III)V")
    public final void method1176(int arg0, int arg1, int arg2) {
        this.field2253.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field2253.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "(I)I")
    public final int method1177(int arg0) {
        if (arg0 == 0) {
            return 7681;
        } else if (arg0 == 1) {
            return 8448;
        } else if (arg0 == 2) {
            return 34165;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(Z)V")
    public final void method148(boolean arg0) {
    }

    @OriginalMember(owner = "client!ks", name = "gb", descriptor = "()V")
    private final void method1178() {
        if (this.field2341 <= this.field2371 && this.field2309 <= this.field2299) {
            this.field2253.glScissor(this.field2341 + this.field2334, this.field2344 + this.field2272 - this.field2299, this.field2371 - this.field2341, this.field2299 - this.field2309);
        } else {
            this.field2253.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(IIIII)V")
    public final void method115(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1186();
        this.method1179(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field2253.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field2253.glBegin(1);
        this.field2253.glVertex2f(var6, var7);
        this.field2253.glVertex2f((float) arg2 + var6, var7);
        this.field2253.glEnd();
    }

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "(I)V")
    public final void method1179(int arg0) {
        if (this.field2339 == arg0) {
            return;
        }
        byte var2;
        boolean var3;
        boolean var4;
        if (arg0 == 1) {
            var2 = 1;
            var3 = true;
            var4 = true;
        } else if (arg0 == 2) {
            var2 = 2;
            var3 = true;
            var4 = false;
        } else if (arg0 == 128) {
            var2 = 2;
            var3 = false;
            var4 = true;
        } else if (arg0 == 129) {
            var2 = 3;
            var3 = false;
            var4 = true;
        } else if (arg0 == 130) {
            var2 = 4;
            var3 = true;
            var4 = true;
        } else {
            var2 = 0;
            var3 = true;
            var4 = false;
        }
        if (this.field2316 != var3) {
            this.field2253.glColorMask(var3, var3, var3, true);
            this.field2316 = var3;
        }
        if (this.field2383 != var4) {
            if (var4) {
                this.field2253.glEnable(3008);
            } else {
                this.field2253.glDisable(3008);
            }
            this.field2383 = var4;
        }
        if (this.field2294 != var2) {
            if (var2 == 1) {
                this.field2253.glEnable(3042);
                this.field2253.glBlendEquation(32774);
                this.field2253.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field2253.glEnable(3042);
                this.field2253.glBlendEquation(32774);
                this.field2253.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field2253.glEnable(3042);
                this.field2253.glBlendEquation(32778);
                this.field2253.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field2253.glEnable(3042);
                this.field2253.glBlendEquation(32774);
                this.field2253.glBlendFunc(774, 1);
            } else {
                this.field2253.glDisable(3042);
            }
            this.field2294 = var2;
        }
        this.field2339 = arg0;
        this.field2330 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "(III)V")
    public final void method1180(int arg0, int arg1, int arg2) {
        this.field2253.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(F)V")
    public final void method161(float arg0) {
        if (this.field2324 != arg0) {
            this.field2324 = arg0;
            this.method1154();
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILtm;II)V")
    public final void method105(int arg0, class195 arg1, int arg2, int arg3) {
        class324 var5 = (class324) arg1;
        class16 var6 = var5.field4778;
        this.method1128();
        this.method1160(var5.field4778);
        this.method1179(1);
        this.method1161(7681, 8448);
        this.method1127(0, 34167, 768);
        float var7 = var6.field256 / (float) var6.field257;
        float var8 = var6.field254 / (float) var6.field255;
        this.field2253.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field2253.glBegin(7);
        this.field2253.glTexCoord2f((float) (this.field2341 - arg2) * var7, (float) (this.field2309 - arg3) * var8);
        this.field2253.glVertex2i(this.field2341, this.field2309);
        this.field2253.glTexCoord2f((float) (this.field2341 - arg2) * var7, (float) (this.field2299 - arg3) * var8);
        this.field2253.glVertex2i(this.field2341, this.field2299);
        this.field2253.glTexCoord2f((float) (this.field2371 - arg2) * var7, (float) (this.field2299 - arg3) * var8);
        this.field2253.glVertex2i(this.field2371, this.field2299);
        this.field2253.glTexCoord2f((float) (this.field2371 - arg2) * var7, (float) (this.field2309 - arg3) * var8);
        this.field2253.glVertex2i(this.field2371, this.field2309);
        this.field2253.glEnd();
        this.method1127(0, 5890, 768);
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)V")
    public final void method111(int arg0) {
        this.method1156();
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method157(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method143(Rectangle[] arg0, int arg1) {
        this.method158();
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I[BIZ)Ld;")
    public final class391 method1181(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class391) (this.field2318 && !arg3 || this.field2370 ? new class6(this, arg0, arg1, arg2, arg3) : new class261(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "()Z")
    public final boolean method69() {
        return this.field2252.method1396(3, (byte) -52);
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(III)V")
    public final void method154(int arg0, int arg1, int arg2) {
        this.field2297 = true;
        this.field2360 = arg1;
        this.field2345 = arg2;
        this.method1138();
        this.method1159();
        this.field2252.method1394(3, false, false, (byte) -96);
        this.field2252.method1397(arg0, true, (byte) 56);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lm;)V")
    public final void method107(class187 arg0) {
        this.field2364 = (class428) arg0;
        this.field2358.method2637((byte) 76, this.field2364);
        if (this.field2381 != 1) {
            this.method1130();
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(Lgg;)V")
    public final void method1182(class321 arg0) {
        if (this.field2275 < 0 || this.field2273[this.field2275] != arg0) {
            throw new RuntimeException();
        }
        this.field2273[this.field2275--] = null;
        arg0.method1140();
        if (this.field2275 >= 0) {
            this.field2269 = this.field2273[this.field2275];
            this.field2269.method1149();
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(FF)V")
    public final void method81(float arg0, float arg1) {
        if (this.field2306 == arg0 && this.field2377 == arg1) {
            return;
        }
        this.field2306 = arg0;
        this.field2377 = arg1;
        this.method1166();
        if (this.field2381 == 3) {
            this.method1185();
        } else if (this.field2381 == 2) {
            this.method1164();
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lbi;Lci;Lm;Loo;I)V")
    public final void method166(class143 arg0, class400 arg1, class187 arg2, class396 arg3, int arg4) {
        arg0.method947(arg2, arg3, arg4);
        this.method70(arg1);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZZ)V")
    public final void method1183(int arg0, boolean arg1, boolean arg2) {
        if (this.field2307 != arg0) {
            if (arg0 < 0) {
                this.method1157();
                this.method1160((class205) null);
                if (!this.field2297) {
                    this.field2252.method1394(0, arg1, arg2, (byte) -73);
                }
            } else {
                class89 var4 = this.field2251.method2734(arg0, (byte) 119);
                class17 var5 = this.field2260.method468((byte) -37, arg0);
                if (var5.field274 == 0 && var5.field266 == 0) {
                    this.method1157();
                } else {
                    int var6 = var5.field271 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method1151((float) (this.field2276 % var7 * var5.field274) / (float) var7, (float) (this.field2276 % var7 * var5.field266) / (float) var7, 0.0F);
                }
                if (this.field2297) {
                    this.field2252.method1394(3, arg1, arg2, (byte) -58);
                    this.method1160(var4);
                } else {
                    this.field2252.method1394(var5.field279, arg1, arg2, (byte) -104);
                    this.field2252.method1397(var5.field275, false, (byte) 78);
                    if (!this.field2252.method1395(var4, Integer.MAX_VALUE)) {
                        this.method1160(var4);
                    }
                }
            }
            this.field2307 = arg0;
        }
        this.field2330 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "(IIIIII)V")
    public final void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method1186();
        this.method1179(arg5);
        this.field2253.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field2283) {
            this.field2253.glDisable(32925);
        }
        this.field2253.glBegin(2);
        this.field2253.glVertex2f(var7, var8);
        this.field2253.glVertex2f(var7, var10);
        this.field2253.glVertex2f(var9, var10);
        this.field2253.glVertex2f(var9, var8);
        this.field2253.glEnd();
        if (this.field2283) {
            this.field2253.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "(II)V")
    public final synchronized void method1184(int arg0, int arg1) {
        class13 var3 = new class13(arg1);
        var3.field3907 = (long) arg0;
        this.field2278.method2484(0, var3);
    }

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "()I")
    public final int method91() {
        int var1 = this.field2387;
        this.field2387 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "()V")
    public final void method102() {
        if (this.field2254.method353(0)) {
            this.field2262.method2663(this.field2254);
            this.field2251.method2735((byte) 114);
        }
    }

    @OriginalMember(owner = "client!ks", name = "hb", descriptor = "()V")
    private final void method1185() {
        float var1 = (float) (-this.field2302) * this.field2369 / (float) this.field2292;
        float var2 = (float) (-this.field2327) * this.field2369 / (float) this.field2332;
        float var3 = (float) (this.field2270 - this.field2302) * this.field2369 / (float) this.field2292;
        float var4 = (float) (this.field2272 - this.field2327) * this.field2369 / (float) this.field2332;
        this.field2253.glMatrixMode(5889);
        this.field2253.glLoadIdentity();
        if (var1 != var3 && var2 != var4) {
            this.field2253.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field2350 - this.field2377), (double) ((float) this.field2351 - this.field2377));
        }
        this.field2253.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lsd;Lsd;FLsd;)Lsd;")
    public final class71 method142(class71 arg0, class71 arg1, float arg2, class71 arg3) {
        if (arg0 != null && arg1 != null && this.field2321 && this.field2311) {
            class39 var5 = null;
            class280 var6 = (class280) arg0;
            class280 var7 = (class280) arg1;
            class61 var8 = var6.method344(15733);
            class61 var9 = var7.method344(15733);
            if (var8 != null && var9 != null) {
                int var10 = var8.field812 > var9.field812 ? var8.field812 : var9.field812;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class39) {
                    class39 var11 = (class39) arg3;
                    if (var11.method345((byte) -84) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class39(this, var10);
                }
                var5.method346(arg2, var9, var8, 0);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ks", name = "ib", descriptor = "()V")
    private final void method1186() {
        if (this.field2330 == 1) {
            return;
        }
        this.method1126();
        this.method1142(false);
        this.method1132(false);
        this.method1162(false);
        this.method1189(false);
        this.method1160((class205) null);
        this.method1133(-2);
        this.method1143(0);
        this.field2330 = 1;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(FF)V")
    public final void method1187(float arg0, float arg1) {
        this.field2304 = arg0;
        this.field2289 = arg1;
        if (!this.field2297) {
            this.method1138();
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "()I")
    public final int method80() {
        return this.field2351;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II[I[I)Ltm;")
    public final class195 method71(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class324.method2124(this, arg2, arg1, (byte) -1, arg0, arg3);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Le;IIII)Lbi;")
    public final class143 method163(class100 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class413(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ks", name = "jb", descriptor = "()V")
    private final void method1188() {
        this.field2253.glDepthMask(this.field2325 && this.field2367);
    }

    @OriginalMember(owner = "client!ks", name = "v", descriptor = "()Z")
    public final boolean method117() {
        return this.field2254.method1340();
    }

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "()Z")
    public final boolean method113() {
        return false;
    }

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "(Z)V")
    public final void method1189(boolean arg0) {
        if (this.field2325 != arg0) {
            this.field2325 = arg0;
            this.method1188();
            this.field2330 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!ks", name = "kb", descriptor = "()V")
    private final void method1190() {
        if (this.field2381 != 3) {
            this.field2381 = 3;
            this.method1185();
            this.method1130();
            this.field2330 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!ks", name = "A", descriptor = "()F")
    public final float method132() {
        return this.field2306;
    }

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "()I")
    public final int method104() {
        return this.field2350;
    }

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "()V")
    public final void method131() {
        this.method1189(true);
        this.field2253.glClear(256);
    }

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "()I")
    public final int method112() {
        int var1 = this.field2388;
        this.field2388 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lsd;)V")
    public final void method118(class71 arg0) {
        this.field2354 = (class280) arg0;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIZ)Lae;")
    public final class285 method123(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class424(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ks", name = "lb", descriptor = "()V")
    private final void method1191() {
        this.field2364 = new class428();
        this.field2358 = new class428();
        this.field2380 = new class205[this.field2291];
        this.field2357 = new class89(this, 3553, 6408, 1, 1);
        this.field2355 = new class89(this, 3553, 6408, 1, 1);
        this.field2356 = new class89(this, 3553, 6408, 1, 1);
        this.field2288 = new class413(this);
        this.field2382 = new class413(this);
        this.field2366 = new class413(this);
        this.field2284 = new class413(this);
        this.field2328 = new class413(this);
        this.field2333 = new class413(this);
        this.field2338 = new class413(this);
        this.field2337 = new class413(this);
        if (this.field2311) {
            this.field2305 = new class442(this);
        }
        this.field2258.method686(this);
    }

    @OriginalMember(owner = "client!ks", name = "L", descriptor = "()Z")
    public final boolean method167() {
        return true;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "([IIIII)Lae;")
    public final class285 method98(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class424(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lpa;Lpa;Lpa;Lpa;)V")
    public final void method1192(class352 arg0, class352 arg1, class352 arg2, class352 arg3) {
        if (arg0 == null) {
            this.field2253.glDisableClientState(32884);
        } else {
            this.field2253.glEnableClientState(32884);
            arg0.method2257((byte) 100);
        }
        if (arg1 == null) {
            this.field2253.glDisableClientState(32885);
        } else {
            this.field2253.glEnableClientState(32885);
            arg1.method2254(10703);
        }
        if (arg2 == null) {
            this.field2253.glDisableClientState(32886);
        } else {
            this.field2253.glEnableClientState(32886);
            arg2.method2255((byte) -93);
        }
        if (arg3 == null) {
            this.field2253.glDisableClientState(32888);
        } else {
            this.field2253.glEnableClientState(32888);
            arg3.method2256((byte) 127);
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(II)I")
    public final int method139(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(IIIIII)Z")
    public final boolean method116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field2364.field6228 + (float) arg0 * this.field2364.field6227 + (float) arg1 * this.field2364.field6229 + this.field2364.field6219;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field2364.field6228 + (float) arg3 * this.field2364.field6227 + (float) arg4 * this.field2364.field6229 + this.field2364.field6219;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field2350) || !(var8 < (float) this.field2350)) || !(!(var7 > (float) this.field2351) || !(var8 > (float) this.field2351))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field2364.field6223 + (float) arg0 * this.field2364.field6218 + (float) arg1 * this.field2364.field6221 + this.field2364.field6224) * (float) this.field2292 / var7);
        int var10 = (int) (((float) arg5 * this.field2364.field6223 + (float) arg3 * this.field2364.field6218 + (float) arg4 * this.field2364.field6221 + this.field2364.field6224) * (float) this.field2292 / var8);
        if ((float) var9 < this.field2353 && (float) var10 < this.field2353 || (float) var9 > this.field2379 && (float) var10 > this.field2379) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field2364.field6222 + (float) arg0 * this.field2364.field6226 + (float) arg1 * this.field2364.field6220 + this.field2364.field6217) * (float) this.field2332 / var7);
            int var12 = (int) (((float) arg5 * this.field2364.field6222 + (float) arg3 * this.field2364.field6226 + (float) arg4 * this.field2364.field6220 + this.field2364.field6217) * (float) this.field2332 / var8);
            return (!((float) var11 < this.field2352) || !((float) var12 < this.field2352)) && (!((float) var11 > this.field2375) || !((float) var12 > this.field2375));
        }
    }

    @OriginalMember(owner = "client!ks", name = "mb", descriptor = "()V")
    private final void method1193() {
        this.field2353 = (float) (this.field2341 - this.field2302);
        this.field2379 = (float) (this.field2371 - this.field2302);
        this.field2352 = (float) (this.field2309 - this.field2327);
        this.field2375 = (float) (this.field2299 - this.field2327);
    }

    @OriginalMember(owner = "client!ks", name = "nb", descriptor = "()V")
    public final void method1194() {
        if (this.field2330 == 4) {
            return;
        }
        this.method1126();
        this.method1142(false);
        this.method1132(false);
        this.method1162(false);
        this.method1189(false);
        this.method1133(-2);
        this.method1179(1);
        this.method1143(1);
        this.field2330 = 4;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIII)Lsd;")
    public final class71 method82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field2321 ? new class117(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!ks", name = "K", descriptor = "()Z")
    public final boolean method165() {
        return true;
    }

    @OriginalMember(owner = "client!ks", name = "ob", descriptor = "()V")
    private final void method1195() {
        try {
            this.field2256.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!ks", name = "pb", descriptor = "()V")
    public final void method1196() {
        if (this.field2381 != 2) {
            this.field2381 = 2;
            this.method1164();
            this.method1130();
            this.field2330 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "(IIIIII)V")
    public final void method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method1186();
        this.method1179(arg5);
        this.field2253.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field2283) {
            this.field2253.glDisable(32925);
        }
        this.field2253.glBegin(7);
        this.field2253.glVertex2f(var7, var8);
        this.field2253.glVertex2f(var7, var10);
        this.field2253.glVertex2f(var9, var10);
        this.field2253.glVertex2f(var9, var8);
        this.field2253.glEnd();
        if (this.field2283) {
            this.field2253.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ltr;Z)Lae;")
    public final class285 method100(class144 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field1955 * arg0.field1952];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1953 == null) {
            for (int var8 = 0; var8 < arg0.field1955; var8++) {
                for (int var9 = 0; var9 < arg0.field1952; var9++) {
                    int var10 = arg0.field1956[arg0.field1958[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field1955; var6++) {
                for (int var7 = 0; var7 < arg0.field1952; var7++) {
                    var3[var5++] = arg0.field1953[var4] << 24 | arg0.field1956[arg0.field1958[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class285 var11 = this.method98(var3, 0, arg0.field1952, arg0.field1952, arg0.field1955);
        var11.method1867(arg0.field1951, arg0.field1957, arg0.field1959, arg0.field1954);
        return var11;
    }

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "(II)V")
    public final synchronized void method1197(int arg0, int arg1) {
        class13 var3 = new class13(arg1);
        var3.field3907 = (long) arg0;
        this.field2277.method2484(0, var3);
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "()V")
    public final void method67() {
        if (this.field2270 <= 0 && this.field2272 <= 0) {
            return;
        }
        int var1 = this.field2341;
        int var2 = this.field2371;
        int var3 = this.field2309;
        int var4 = this.field2299;
        this.method162();
        this.field2253.glReadBuffer(1028);
        this.field2253.glDrawBuffer(1029);
        this.method1170();
        this.method1142(false);
        this.method1132(false);
        this.method1162(false);
        this.method1189(false);
        this.method1160((class205) null);
        this.method1133(-2);
        this.method1143(0);
        this.method1179(0);
        this.field2253.glMatrixMode(5889);
        this.field2253.glLoadIdentity();
        this.field2253.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field2253.glMatrixMode(5888);
        this.field2253.glLoadIdentity();
        this.field2253.glRasterPos2i(0, 0);
        this.field2253.glCopyPixels(0, 0, this.field2270, this.field2272, 6144);
        this.field2253.glFlush();
        this.field2253.glReadBuffer(1029);
        this.field2253.glDrawBuffer(1029);
        this.method77(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(II)V")
    public final void method140(int arg0, int arg1) {
        if (this.field2323 == arg0 && this.field2293 == arg1) {
            return;
        }
        this.field2323 = arg0;
        this.field2293 = arg1;
        if (!this.field2297) {
            this.method1138();
            this.method1159();
        }
    }

    @OriginalMember(owner = "client!ks", name = "qb", descriptor = "()V")
    private final void method1198() {
        if (this.field2373 && !this.field2308) {
            this.field2253.glEnable(2896);
        } else {
            this.field2253.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!ks", name = "rb", descriptor = "()V")
    public final void method1199() {
        if (this.field2330 == 16) {
            return;
        }
        this.method1190();
        this.method1142(true);
        this.method1162(true);
        this.method1189(true);
        this.method1179(1);
        this.method1143(1);
        this.field2330 = 16;
    }

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "()I")
    public final int method103() {
        return 4;
    }

    @OriginalMember(owner = "client!ks", name = "G", descriptor = "()V")
    public final void method158() {
        try {
            this.field2256.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZ)V")
    public final void method1200(int arg0, boolean arg1) {
        this.method1183(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lmk;)V")
    public final void method127(class161 arg0) {
    }

    @OriginalMember(owner = "client!ks", name = "x", descriptor = "()V")
    public final void method124() {
        if (this.field2253 != null) {
            try {
                this.field2262.method2664();
            } catch (Throwable var4) {
            }
            this.field2253 = null;
        }
        if (this.field2256 != null) {
            this.method1195();
            try {
                this.field2256.destroy();
            } catch (Throwable var3) {
            }
            this.field2256 = null;
        }
        if (this.field2266) {
            class342.method2223(-10703, true, true);
            this.field2266 = false;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)I")
    public final int method85(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "(I)I")
    public final int method1201(int arg0) {
        if (arg0 == 6406 || arg0 == 6409) {
            return 1;
        } else if (arg0 == 6410 || arg0 == 34846 || arg0 == 34844) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408 || arg0 == 34847) {
            return 4;
        } else if (arg0 == 34843) {
            return 6;
        } else if (arg0 == 34842) {
            return 8;
        } else if (arg0 == 6402) {
            return 3;
        } else if (arg0 == 6401) {
            return 1;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "()Z")
    public final boolean method89() {
        return true;
    }

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "(I)V")
    public final synchronized void method144(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field2277.method2473((byte) -127)) {
            class13 var4 = (class13) this.field2277.method2476(-29642);
            field2250[var2++] = (int) var4.field3907;
            this.field2268 -= var4.field214;
            if (var2 == 1000) {
                this.field2253.glDeleteBuffersARB(var2, field2250, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field2253.glDeleteBuffersARB(var2, field2250, 0);
            var2 = 0;
        }
        while (!this.field2278.method2473((byte) -121)) {
            class13 var5 = (class13) this.field2278.method2476(-29642);
            field2250[var2++] = (int) var5.field3907;
            this.field2265 -= var5.field214;
            if (var2 == 1000) {
                this.field2253.glDeleteTextures(var2, field2250, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field2253.glDeleteTextures(var2, field2250, 0);
            var2 = 0;
        }
        while (!this.field2279.method2473((byte) -127)) {
            class13 var6 = (class13) this.field2279.method2476(-29642);
            field2250[var2++] = var6.field214;
            if (var2 == 1000) {
                this.field2253.glDeleteFramebuffersEXT(var2, field2250, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field2253.glDeleteFramebuffersEXT(var2, field2250, 0);
            var2 = 0;
        }
        while (!this.field2280.method2473((byte) -119)) {
            class13 var7 = (class13) this.field2280.method2476(-29642);
            field2250[var2++] = (int) var7.field3907;
            this.field2267 -= var7.field214;
            if (var2 == 1000) {
                this.field2253.glDeleteRenderbuffersEXT(var2, field2250, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field2253.glDeleteRenderbuffersEXT(var2, field2250, 0);
            var2 = 0;
        }
        while (!this.field2281.method2473((byte) -119)) {
            class13 var8 = (class13) this.field2281.method2476(-29642);
            field2250[var2++] = (int) var8.field3907;
            if (var2 == 1000) {
                this.field2253.glDeleteProgramsARB(var2, field2250, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field2253.glDeleteProgramsARB(var2, field2250, 0);
            boolean var9 = false;
        }
        while (!this.field2264.method2473((byte) -121)) {
            class13 var10 = (class13) this.field2264.method2476(-29642);
            this.field2253.glDeleteLists((int) var10.field3907, var10.field214);
        }
        while (!this.field2282.method2473((byte) -121)) {
            class13 var11 = (class13) this.field2282.method2476(-29642);
            this.field2253.glDeleteObjectARB(var11.field214);
        }
        while (!this.field2264.method2473((byte) -126)) {
            class13 var12 = (class13) this.field2264.method2476(-29642);
            this.field2253.glDeleteLists((int) var12.field3907, var12.field214);
        }
        if (this.method153() > 100663296 && class43.method364(-16756) > this.field2363 + 60000L) {
            System.gc();
            this.field2363 = class43.method364(-16756);
        }
        this.field2276 = var3;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lic;IILgt;)V")
    public class173(Canvas arg0, class235 arg1, int arg2, int arg3, class341 arg4) {
        this.field2255 = arg0;
        this.field2260 = arg1;
        this.field120 = arg2;
        int var6 = 0;
        while (!this.field2255.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class418.method2587(false, 1000L);
        }
        this.field2255.setIgnoreRepaint(true);
        try {
            if (field2259 == null || !field2259) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field2259 = Boolean.TRUE;
                } else {
                    class350 var7 = arg4.method2216((byte) 62, this.getClass());
                    while (var7.field5134 == 0) {
                        class418.method2587(false, 100L);
                    }
                    if (var7.field5134 == 1) {
                        field2259 = Boolean.TRUE;
                    }
                }
            }
            if (field2259 == null || !field2259) {
                throw new RuntimeException("");
            }
            this.field2256 = new context();
            if (!this.field2256.choosePixelFormat(this.field2255, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field2256.createContext()) {
                this.method1156();
                this.field2253 = this.field2256.getGL();
                int var8 = this.method1134();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field2385 = this.field2296 ? 33639 : 5121;
                String var9 = this.field2378.toLowerCase();
                String var10 = this.field2340.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class278.method1886(' ', -19369, var10.replace('/', ' '));
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        try {
                            if (var16.length() > 0) {
                                if (var16.charAt(0) == 'x' && var16.length() >= 3 && class74.method526(var16.substring(1, 3), (byte) 18)) {
                                    var16 = var16.substring(1);
                                    var13 = true;
                                }
                                if (var16.equals("hd")) {
                                    var12 = true;
                                } else {
                                    if (var16.startsWith("hd")) {
                                        var16 = var16.substring(2);
                                        var12 = true;
                                    }
                                    if (var16.length() >= 4 && class74.method526(var16.substring(0, 4), (byte) -107)) {
                                        var11 = class92.method627(var16.substring(0, 4), (byte) 98);
                                        break;
                                    }
                                }
                            }
                        } catch (Exception var25) {
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field2318 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field2376 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field2372 = false;
                    }
                    this.field2359 &= this.field2253.isExtensionAvailable("GL_ARB_half_float_pixel");
                    this.field2370 = this.field2318;
                }
                if (var9.contains("intel")) {
                    this.field2311 = false;
                }
                if (this.field2318) {
                    try {
                        int[] var18 = new int[1];
                        this.field2253.glGenBuffersARB(1, var18, 0);
                    } catch (Throwable var23) {
                        throw new RuntimeException("", var23);
                    }
                }
                this.method1131(this);
                this.method83();
                this.method1191();
                new class293(this);
                this.field2251 = new class445(this, this.field2260);
                class375.method2374(-1, true, true);
                this.field2266 = true;
                this.field2252 = new class203(this);
                this.field2262 = new class434(this);
                this.field2254 = new class193(this);
                this.method1169();
                this.field2253.glClear(16640);
                int var20 = 0;
                while (true) {
                    try {
                        this.field2256.swapBuffers();
                        break;
                    } catch (Exception var24) {
                        if (var20++ > 5) {
                            throw new RuntimeException("");
                        }
                        class418.method2587(false, 100L);
                    }
                }
                this.field2253.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var26) {
            var26.printStackTrace();
            this.method124();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var26);
        }
    }
}
