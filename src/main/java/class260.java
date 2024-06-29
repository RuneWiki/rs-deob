import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class260 extends class98 implements class52 {

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Z")
    private boolean field3362 = false;

    @OriginalMember(owner = "client!l", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Ldc;")
    private class302 field3368 = new class302();

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    private int field3376 = 4096;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    private int field3379 = 4096;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "Lefa;")
    private class322 field3377 = new class322(4);

    @OriginalMember(owner = "client!l", name = "M", descriptor = "Z")
    private boolean field3384 = false;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "Lq;")
    private class151 field3378;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "[I")
    private static int[] field3363 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!l", name = "r", descriptor = "[F")
    private static float[] field3364 = new float[20];

    @OriginalMember(owner = "client!l", name = "s", descriptor = "[S")
    private static short[] field3365 = new short[8191];

    @OriginalMember(owner = "client!l", name = "w", descriptor = "[I")
    private static int[] field3369 = field3363;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "[I")
    private static int[] field3366 = field3363;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "[B")
    private static byte[] field3373 = new byte[8191];

    @OriginalMember(owner = "client!l", name = "B", descriptor = "[I")
    private static int[] field3374 = new int[8191];

    @OriginalMember(owner = "client!l", name = "C", descriptor = "[F")
    private static float[] field3375 = field3364;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "[I")
    public static int[] field3367 = field3363;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "[I")
    public static int[] field3370 = new int[6];

    @OriginalMember(owner = "client!l", name = "y", descriptor = "[I")
    private static int[] field3371 = new int[8191];

    @OriginalMember(owner = "client!l", name = "L", descriptor = "I")
    public int field3383;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "Lq;")
    private class151 field3380;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "Lm;")
    private class494 field3372;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "Lta;")
    private class593 field3381;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "[Lqa;")
    private class663[] field3382;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V", line = 4)
    public final void method640(int arg0) {
        this.field3382[arg0].method3727();
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "()Z", line = 9)
    public final boolean method649() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V", line = 11)
    public final void method713(boolean arg0) {
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "()Z", line = 14)
    public final boolean method624() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lfo;[Lut;Z)Lla;", line = 18)
    public final class393 method684(class606 arg0, class616[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field8869;
            var5[var7] = arg1[var7].field8868;
            if (arg1[var7].field8875 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class266(this, this.field3372, arg0, arg1, (class256[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class120(this, this.field3372, arg0, arg1, (class256[]) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "D", descriptor = "()Lqa;", line = 58)
    public final class663 method1547() {
        for (int var1 = 0; var1 < this.field3383; ++var1) {
            if (this.field3382[var1].field9435 == Thread.currentThread()) {
                return this.field3382[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIII)Lf;", line = 71)
    public final class256 method704(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class602(this, this.field3372, arg0, arg1, arg2, arg3, arg4) : new class521(this, this.field3372, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class602(this, this.field3372, arg0, arg1, arg2, arg3, arg4) : new class521(this, this.field3372, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V", line = 108)
    protected final synchronized void finalize() {
        this.method623((byte) 10);
        if (this.nativeid != 0L) {
            class493.method2818(false, this);
        }
    }

    @OriginalMember(owner = "client!l", name = "WA", descriptor = "()V", line = 114)
    private final void method1548() {
        System.gc();
        System.runFinalization();
        class493.method2820(false);
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 119)
    public final void method672(Canvas arg0) {
        if (this.field3381.field8604 == arg0) {
            this.method709((Canvas) null);
        }
        class593 var2 = (class593) this.field3377.method2002((byte) -115, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2360((byte) 66);
            var2.method3375();
        }
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "()Z", line = 132)
    public final boolean method650() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V", line = 135)
    public final void method670(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!l", name = "y", descriptor = "()Z", line = 140)
    public final boolean method686() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "o", descriptor = "()Z", line = 143)
    public final boolean method663() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(IIIIII)V", line = 146)
    public final void method633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method691(arg0, arg1, arg2, arg4, arg5);
        this.method691(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method635(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method635(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "()Z", line = 152)
    public final boolean method630() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lq;)V", line = 158)
    public final void method616(class151 arg0) {
        this.field3380 = arg0;
        this.method1554(arg0);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lrs;)V", line = 161)
    public final void method611(class649 arg0) {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lf;Z)V", line = 164)
    public final void method673(class256 arg0, boolean arg1) {
        if (arg0 instanceof class521) {
            this.method1549((class521) arg0);
        } else if (arg0 instanceof class602) {
            this.method1557((class602) arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "q", descriptor = "()Z", line = 180)
    public final boolean method671() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Luo;Z)V", line = 185)
    private final void method1551(class620 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class169 var8 = (class169) arg0.field8978.method2621(0); var8 != null; var8 = (class169) arg0.field8978.method2620(107)) {
            field3366[var3++] = var8.field2395;
            field3366[var3++] = var8.field2386;
            field3366[var3++] = var8.field2393;
            field3371[var4++] = var8.field2384;
            field3365[var6++] = (short) var8.field2392;
            field3374[var5++] = var8.field2391;
            if (arg1) {
                field3373[var7++] = var8.field2382;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "B", descriptor = "()Z", line = 218)
    public final boolean method705() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[I[I)Lua;", line = 221)
    public final class591 method617(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class650(this, this.field3372, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Luo;)V", line = 224)
    public final void method679(class620 arg0) {
        this.method1551(arg0, false);
        this.method1547().method3730(this, field3366, field3371, field3374, field3365, arg0.field8978.method2627(-1));
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;)V", line = 315)
    public class260(Canvas arg0, class615 arg1) {
        super(arg1);
        try {
            if (!class436.method2588("sw3d", (byte) 91)) {
                throw new RuntimeException("");
            } else {
                class493.method2822(-116);
                this.method1552(super.field1491, 0, 0);
                class530.method3075(true, (byte) -119, false);
                this.field3384 = true;
                this.field3378 = new class359();
                this.method616(new class359());
                this.method626(1);
                this.method665(0);
                if (arg0 != null) {
                    this.method613(arg0);
                    this.method709(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFF)V", line = 230)
    public final void method619(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!l", name = "l", descriptor = "()V", line = 233)
    public final void method656() {
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V", line = 236)
    public final void method639(int arg0) {
        class493.method2820(false);
        this.method1558(arg0);
        for (class494 var2 = (class494) this.field3368.method1904(false); var2 != null; var2 = (class494) this.field3368.method1901(100)) {
            var2.method2824();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lak;IIII)Lda;", line = 249)
    public final class395 method651(class677 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class146(this, this.field3372, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 253)
    public final void method613(Canvas arg0) {
        class593 var2 = (class593) this.field3377.method2002((byte) -117, (long) arg0.hashCode());
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class593 var5 = new class593(this, arg0);
            this.field3377.method2001(91, var5, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V", line = 274)
    public final void method626(int arg0) {
        this.field3383 = arg0;
        this.field3382 = new class663[this.field3383];
        for (int var2 = 0; var2 < this.field3383; ++var2) {
            this.field3382[var2] = new class663(this, this.field3379, this.field3376);
        }
    }

    @OriginalMember(owner = "client!l", name = "m", descriptor = "()Lq;", line = 287)
    public final class151 method658() {
        return this.field3380;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILua;II)V", line = 296)
    public final void method643(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class591 arg6, int arg7, int arg8) {
        this.method1553(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!l", name = "s", descriptor = "()V", line = 300)
    public final void method676() {
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 304)
    public final void method641(Canvas arg0) {
        class593 var2 = (class593) this.field3377.method2002((byte) -114, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method3379(arg0, var3.width, var3.height);
        if (arg0 != null && this.field3381.field8604 == arg0) {
            this.method709(arg0);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIF)Ltg;", line = 345)
    public final class334 method687(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class166(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "k", descriptor = "()V", line = 348)
    public final void method655() throws class232 {
        if (this.field3381 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field3381.method3373();
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIII)Lrs;", line = 358)
    public final class649 method614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!l", name = "w", descriptor = "()Lpg;", line = 363)
    public final class658 method683() {
        return new class658(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V", line = 368)
    public final void method609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1556(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "t", descriptor = "()V", line = 370)
    public final void method681() {
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIZ)Lf;", line = 374)
    public final class256 method688(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class602(this, this.field3372, arg0, arg1, arg2, arg3) : new class521(this, this.field3372, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()Z", line = 382)
    public final boolean method618() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lut;Z)Lf;", line = 388)
    public final class256 method660(class616 arg0, boolean arg1) {
        int[] var3 = arg0.field8873;
        byte[] var4 = arg0.field8871;
        int var5 = arg0.field8869;
        int var6 = arg0.field8868;
        class256 var7;
        if (arg1 && arg0.field8875 == null) {
            var7 = new class601(this, this.field3372, var3, var4, 0, arg0.field8869, arg0.field8869, arg0.field8868);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field8875;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class602(this, this.field3372, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field8873[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class602(this, this.field3372, var9, 0, arg0.field8869, arg0.field8869, arg0.field8868);
                } else {
                    var7 = new class521(this, this.field3372, var9, 0, arg0.field8869, arg0.field8869, arg0.field8868);
                }
            }
        }
        var7.method58(arg0.field8870, arg0.field8874, arg0.field8872, arg0.field8867);
        return var7;
    }

    @OriginalMember(owner = "client!l", name = "A", descriptor = "()V", line = 463)
    public final void method697() {
        if (!this.field3362) {
            this.field3382 = null;
            this.field3381 = null;
            this.field3372 = null;
            this.field3378 = null;
            this.field3377.method1995((byte) -123);
            for (class494 var1 = (class494) this.field3368.method1904(false); var1 != null; var1 = (class494) this.field3368.method1901(117)) {
                var1.method2823();
            }
            this.field3368.method1905(0);
            this.method1559();
            if (this.field3384) {
                class541.method3181((byte) 126, false, true);
                this.field3384 = false;
            }
            this.method1548();
            class493.method2821(126);
            this.field3362 = true;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V", line = 496)
    public final void method612(boolean arg0) {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lrs;Lrs;FLrs;)Lrs;", line = 499)
    public final class649 method707(class649 arg0, class649 arg1, float arg2, class649 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "()V", line = 504)
    public final void method642() {
    }

    @OriginalMember(owner = "client!l", name = "p", descriptor = "()I", line = 507)
    public final int method669() {
        return 4;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 510)
    public final void method709(Canvas arg0) {
        if (arg0 != null) {
            class593 var2 = (class593) this.field3377.method2002((byte) -112, (long) arg0.hashCode());
            this.field3381 = var2;
            this.method1550(var2);
        } else {
            this.field3381 = null;
            this.method1550((class593) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V", line = 528)
    public final void method703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1547().method3728(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "u", descriptor = "()Lq;", line = 534)
    public final class151 method682() {
        return this.field3378;
    }

    @OriginalMember(owner = "client!l", name = "A", descriptor = "(S)Z", line = 538)
    private final boolean method1560(short arg0) {
        synchronized (this) {
            class457 var3 = super.field1491.method955(-1330, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method1563(arg0, var3.field6603, var3.field6611, var3.field6602, var3.field6612, var3.field6590, var3.field6601, var3.field6607, var3.field6600, var3.field6597, var3.field6591, var3.field6588, var3.field6598);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "fa", descriptor = "()Ljava/lang/Object;", line = 549)
    private final Object method1561() {
        return new class214(this);
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(II)I", line = 559)
    public final int method706(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "()Z", line = 566)
    public final boolean method645() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 569)
    public final class682 method677(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class376(this, this.field3372, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "r", descriptor = "()Z", line = 572)
    public final boolean method674() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "i", descriptor = "()V", line = 574)
    public final void method653() {
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V", line = 580)
    public final void method665(int arg0) {
        this.field3382[arg0].method3722();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([I)V", line = 584)
    public final void method610(int[] arg0) {
        Dimension var2 = this.field3381.field8604.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!l", name = "n", descriptor = "()V", line = 589)
    public final void method662() {
        this.method709(this.field3381.field8604);
    }

    @OriginalMember(owner = "client!l", name = "z", descriptor = "()Z", line = 601)
    public final boolean method694() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIII)V", line = 605)
    public final void method634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Le;)V", line = 608)
    public final void method648(class698 arg0) {
        this.field3372 = (class494) arg0;
        this.method1555(arg0);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 614)
    public final void method689(Rectangle[] arg0, int arg1) throws class232 {
        if (this.field3381 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field3381.method3372(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[Ltg;)V", line = 625)
    public final void method696(int arg0, class334[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field3369[var3++] = arg1[var4].method2050((byte) -94);
            field3369[var3++] = arg1[var4].method2045(0);
            field3369[var3++] = arg1[var4].method2046(true);
            field3369[var3++] = arg1[var4].method2051(-520326527);
            field3375[var4] = arg1[var4].method2053((byte) 107);
            field3369[var3++] = arg1[var4].method2049(0);
        }
        this.method1562(arg0, field3369, field3375);
    }

    @OriginalMember(owner = "client!l", name = "C", descriptor = "()Lq;", line = 643)
    public final class151 method717() {
        return new class359();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Lf;", line = 649)
    public final class256 method631(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class602(this, this.field3372, arg0, arg1) : new class521(this, this.field3372, arg0, arg1);
    }

    @OriginalMember(owner = "client!l", name = "x", descriptor = "()Z", line = 655)
    public final boolean method685() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V", line = 659)
    public final void method690(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I", line = 678)
    public final int method661(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!l", name = "j", descriptor = "()Z", line = 686)
    public final boolean method654() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "W", descriptor = "(S)Z", line = 692)
    private final boolean method1565(short arg0) {
        class615 var2 = super.field1491;
        synchronized (super.field1491) {
            if (!super.field1491.method956(arg0, 15925)) {
                return false;
            } else {
                class457 var4 = super.field1491.method955(-1330, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field6594) {
                        var6 = super.field1491.method958(0.7F, 128, -17786, true, 128, arg0);
                    } else {
                        var6 = super.field1491.method957(128, -2226, 128, true, 0.7F, arg0);
                    }
                    this.method1564(arg0, var4.field6603, var4.field6611, var4.field6602, var4.field6612, var4.field6590, var4.field6601, var4.field6607, var4.field6600, var4.field6597, var4.field6591, var4.field6588, var4.field6598, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Luo;I)V", line = 722)
    public final void method708(class620 arg0, int arg1) {
        this.method1551(arg0, false);
        this.method1547().method3730(this, field3366, field3371, field3374, field3365, arg0.field8978.method2627(-59));
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)Le;", line = 727)
    public final class698 method622(int arg0) {
        class494 var2 = new class494(this, arg0);
        this.field3368.method1909(var2, (byte) -81);
        return var2;
    }

    @OriginalMember(owner = "client!l", name = "pa", descriptor = "(III)V")
    public final native void method718(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "va", descriptor = "(I)V")
    public final native void method659(int arg0);

    @OriginalMember(owner = "client!l", name = "L", descriptor = "()V")
    public final native void method647();

    @OriginalMember(owner = "client!l", name = "O", descriptor = "(IIIIII)Z")
    public final native boolean method637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "V", descriptor = "(IIII)V")
    public final native void method692(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
    public final native int method627();

    @OriginalMember(owner = "client!l", name = "J", descriptor = "(IIIIII)V")
    public final native void method700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "ZA", descriptor = "(Z)V")
    public final native void method636(boolean arg0);

    @OriginalMember(owner = "client!l", name = "ja", descriptor = "(I)V")
    public final native void method646(int arg0);

    @OriginalMember(owner = "client!l", name = "q", descriptor = "(Lva;)V")
    private final native void method1549(class521 arg0);

    @OriginalMember(owner = "client!l", name = "ia", descriptor = "(Lta;)V")
    private final native void method1550(class593 arg0);

    @OriginalMember(owner = "client!l", name = "BA", descriptor = "()I")
    public final native int method668();

    @OriginalMember(owner = "client!l", name = "m", descriptor = "(IIIII)V")
    public final native void method635(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "OA", descriptor = "(Lfa;II)V")
    private final native void method1552(class615 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "(IIIIIILua;II)V")
    private final native void method1553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class591 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "NA", descriptor = "(Lq;)V")
    private final native void method1554(class151 arg0);

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
    public final native int method615();

    @OriginalMember(owner = "client!l", name = "EA", descriptor = "(Le;)V")
    private final native void method1555(class698 arg0);

    @OriginalMember(owner = "client!l", name = "w", descriptor = "(IIIIII)V")
    private final native void method1556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "AA", descriptor = "(III[I)V")
    public final native void method629(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!l", name = "ma", descriptor = "(Lt;)V")
    private final native void method1557(class602 arg0);

    @OriginalMember(owner = "client!l", name = "JA", descriptor = "()V")
    public final native void method699();

    @OriginalMember(owner = "client!l", name = "qa", descriptor = "(I)V")
    private final native void method1558(int arg0);

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIII)V")
    public final native void method621(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "DA", descriptor = "()I")
    public final native int method666();

    @OriginalMember(owner = "client!l", name = "XA", descriptor = "(IIIII)V")
    public final native void method691(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "IA", descriptor = "(IIIIII[BII)V")
    public final native void method716(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "R", descriptor = "()V")
    private final native void method1559();

    @OriginalMember(owner = "client!l", name = "GA", descriptor = "(II)V")
    public final native void method675(int arg0, int arg1);

    @OriginalMember(owner = "client!l", name = "I", descriptor = "(I[I[F)V")
    private final native void method1562(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(IIII)[I")
    public final native int[] method702(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "la", descriptor = "(IIII)V")
    public final native void method667(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "da", descriptor = "(IIII)V")
    public final native void method652(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "YA", descriptor = "(IIII)V")
    public final native void method657(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "FA", descriptor = "(ILua;II)V")
    public final native void method715(int arg0, class591 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method1563(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!l", name = "xa", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method1564(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!l", name = "VA", descriptor = "(IFFFFF)V")
    public final native void method607(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!l", name = "oa", descriptor = "([I)V")
    public final native void method628(int[] arg0);

    @OriginalMember(owner = "client!l", name = "v", descriptor = "()[I")
    public final native int[] method625();

    @OriginalMember(owner = "client!l", name = "CA", descriptor = "(IIII)V")
    public final native void method680(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "UA", descriptor = "(Z)V")
    public final native void method306(boolean arg0);

    @OriginalMember(owner = "client!l", name = "U", descriptor = "()I")
    public final native int method608();

    @OriginalMember(owner = "client!l", name = "MA", descriptor = "(III[I)V")
    public final native void method620(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!l", name = "ra", descriptor = "(F)V")
    public final native void method711(float arg0);

    @OriginalMember(owner = "client!l", name = "ya", descriptor = "()V")
    public final native void method638();
}
