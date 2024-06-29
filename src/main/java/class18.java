import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class18 extends class167 implements class201 {

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Z")
    private boolean field305 = false;

    @OriginalMember(owner = "client!l", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "Lor;")
    private class594 field304 = new class594();

    @OriginalMember(owner = "client!l", name = "J", descriptor = "I")
    private int field321 = 4096;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    private int field318 = 4096;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "Lsba;")
    private class200 field319 = new class200(4);

    @OriginalMember(owner = "client!l", name = "L", descriptor = "Z")
    private boolean field323 = false;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "Lq;")
    private class393 field320;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "[I")
    private static int[] field306 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!l", name = "v", descriptor = "[S")
    private static short[] field308 = new short[8191];

    @OriginalMember(owner = "client!l", name = "w", descriptor = "[F")
    private static float[] field309 = new float[20];

    @OriginalMember(owner = "client!l", name = "z", descriptor = "[I")
    public static int[] field312 = new int[6];

    @OriginalMember(owner = "client!l", name = "u", descriptor = "[I")
    private static int[] field307 = new int[8191];

    @OriginalMember(owner = "client!l", name = "C", descriptor = "[B")
    private static byte[] field314 = new byte[8191];

    @OriginalMember(owner = "client!l", name = "x", descriptor = "[I")
    private static int[] field310 = field306;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "[I")
    public static int[] field313 = field306;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "[I")
    private static int[] field316 = new int[8191];

    @OriginalMember(owner = "client!l", name = "D", descriptor = "[I")
    private static int[] field315 = field306;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "[F")
    private static float[] field311 = field309;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    public int field325;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Lm;")
    private class176 field303;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "Lta;")
    private class196 field317;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "Lq;")
    private class393 field322;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "[Lqa;")
    private class227[] field324;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "()Lq;", line = 5)
    public final class393 method259() {
        return this.field322;
    }

    @OriginalMember(owner = "client!l", name = "fa", descriptor = "()Ljava/lang/Object;", line = 9)
    private final Object method260() {
        return new class616(this);
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "()Z", line = 12)
    public final boolean method261() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "t", descriptor = "()Z", line = 15)
    public final boolean method262() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ldd;)V", line = 18)
    public final void method264(class654 arg0) {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lwt;Z)Lf;", line = 22)
    public final class702 method265(class284 arg0, boolean arg1) {
        int[] var3 = arg0.field4538;
        byte[] var4 = arg0.field4532;
        int var5 = arg0.field4535;
        int var6 = arg0.field4537;
        class702 var7;
        if (arg1 && arg0.field4539 == null) {
            var7 = new class274(this, this.field303, var3, var4, 0, arg0.field4535, arg0.field4535, arg0.field4537);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field4539;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class620(this, this.field303, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field4538[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class620(this, this.field303, var9, 0, arg0.field4535, arg0.field4535, arg0.field4537);
                } else {
                    var7 = new class461(this, this.field303, var9, 0, arg0.field4535, arg0.field4535, arg0.field4537);
                }
            }
        }
        var7.method1085(arg0.field4533, arg0.field4540, arg0.field4534, arg0.field4536);
        return var7;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()Z", line = 96)
    public final boolean method266() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lf;Z)V", line = 99)
    public final void method158(class702 arg0, boolean arg1) {
        if (arg0 instanceof class461) {
            this.method270((class461) arg0);
        } else if (arg0 instanceof class620) {
            this.method258((class620) arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "()I", line = 110)
    public final int method267() {
        return 4;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([I)V", line = 115)
    public final void method268(int[] arg0) {
        Dimension var2 = this.field317.field3229.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "()Lq;", line = 125)
    public final class393 method272() {
        return new class94();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ltt;Z)V", line = 130)
    private final void method273(class79 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class440 var8 = (class440) arg0.field999.method1889(16705); var8 != null; var8 = (class440) arg0.field999.method1891((byte) -49)) {
            field315[var3++] = var8.field6711;
            field315[var3++] = var8.field6705;
            field315[var3++] = var8.field6710;
            field316[var4++] = var8.field6708;
            field308[var6++] = (short) var8.field6701;
            field307[var5++] = var8.field6709;
            if (arg1) {
                field314[var7++] = var8.field6706;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "A", descriptor = "(S)Z", line = 160)
    private final boolean method274(short arg0) {
        synchronized (this) {
            class258 var3 = super.field2812.method1610(18904, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method276(arg0, var3.field4131, var3.field4126, var3.field4118, var3.field4117, var3.field4136, var3.field4123, var3.field4116, var3.field4134, var3.field4120, var3.field4140, var3.field4124, var3.field4125);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 171)
    public final class37 method275(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class256(this, this.field303, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Le;)V", line = 176)
    public final void method277(class493 arg0) {
        this.field303 = (class176) arg0;
        this.method311(arg0);
    }

    @OriginalMember(owner = "client!l", name = "j", descriptor = "()V", line = 179)
    public final void method135() {
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "()V", line = 182)
    public final void method143() {
    }

    @OriginalMember(owner = "client!l", name = "y", descriptor = "()V", line = 186)
    public final void method122() throws class529 {
        if (this.field317 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field317.method1545();
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "()Z", line = 197)
    public final boolean method134() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V", line = 200)
    public final void method280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method285().method1669(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZ)Lf;", line = 206)
    public final class702 method282(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class620(this, this.field303, arg0, arg1, arg2, arg3) : new class461(this, this.field303, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!l", name = "x", descriptor = "()V", line = 214)
    public final void method132() {
        if (!this.field305) {
            this.field324 = null;
            this.field317 = null;
            this.field303 = null;
            this.field320 = null;
            this.field319.method1562((byte) -122);
            for (class176 var1 = (class176) this.field304.method3465((byte) 120); var1 != null; var1 = (class176) this.field304.method3469(0)) {
                var1.method1426();
            }
            this.field304.method3474(22090);
            this.method295();
            if (this.field323) {
                class655.method3770(true, false, 0);
                this.field323 = false;
            }
            this.method303();
            class222.method1640(17481);
            this.field305 = true;
        }
    }

    @OriginalMember(owner = "client!l", name = "D", descriptor = "()Lqa;", line = 247)
    public final class227 method285() {
        for (int var1 = 0; var1 < this.field325; ++var1) {
            if (this.field324[var1].field3648 == Thread.currentThread()) {
                return this.field324[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I", line = 259)
    public final int method286(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Luo;IIII)Lda;", line = 262)
    public final class55 method287(class534 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class537(this, this.field303, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!l", name = "u", descriptor = "()Z", line = 266)
    public final boolean method288() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "q", descriptor = "()Z", line = 269)
    public final boolean method289() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)Le;", line = 273)
    public final class493 method290(int arg0) {
        class176 var2 = new class176(this, arg0);
        this.field304.method3463((byte) -87, var2);
        return var2;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 279)
    public final void method291(Canvas arg0) {
        class196 var2 = (class196) this.field319.method1558((long) arg0.hashCode(), (byte) -93);
        Dimension var3 = arg0.getSize();
        var2.method1547(arg0, var3.width, var3.height);
        if (arg0 != null && this.field317.field3229 == arg0) {
            this.method298(arg0);
        }
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V", line = 289)
    public final void method293(int arg0) {
        this.field324[arg0].method1673();
    }

    @OriginalMember(owner = "client!l", name = "k", descriptor = "()Z", line = 292)
    public final boolean method294() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 298)
    public final void method297(Canvas arg0) {
        class196 var2 = (class196) this.field319.method1558((long) arg0.hashCode(), (byte) -93);
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class196 var5 = new class196(this, arg0);
            this.field319.method1564((long) arg0.hashCode(), var5, (byte) 86);
        }
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 318)
    public final void method298(Canvas arg0) {
        if (arg0 != null) {
            class196 var2 = (class196) this.field319.method1558((long) arg0.hashCode(), (byte) -93);
            this.field317 = var2;
            this.method269(var2);
        } else {
            this.field317 = null;
            this.method269((class196) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIII)V", line = 334)
    public final void method299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V", line = 336)
    public final void method300(boolean arg0) {
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V", line = 340)
    public final void method301(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!l", name = "WA", descriptor = "()V", line = 344)
    private final void method303() {
        System.gc();
        System.runFinalization();
        class222.method1639(0);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 349)
    public final void method103(Rectangle[] arg0, int arg1) throws class529 {
        if (this.field317 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field317.method1543(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 359)
    public final void method304(Canvas arg0) {
        if (this.field317.field3229 == arg0) {
            this.method298((Canvas) null);
        }
        class196 var2 = (class196) this.field319.method1558((long) arg0.hashCode(), (byte) -93);
        if (var2 != null) {
            var2.method707((byte) -69);
            var2.method1544();
        }
    }

    @OriginalMember(owner = "client!l", name = "A", descriptor = "()V", line = 372)
    public final void method176() {
        this.method298(this.field317.field3229);
    }

    @OriginalMember(owner = "client!l", name = "l", descriptor = "()Z", line = 375)
    public final boolean method305() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIII)Lf;", line = 381)
    public final class702 method306(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class620(this, this.field303, arg0, arg1, arg2, arg3, arg4) : new class461(this, this.field303, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class620(this, this.field303, arg0, arg1, arg2, arg3, arg4) : new class461(this, this.field303, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!l", name = "p", descriptor = "()Z", line = 416)
    public final boolean method307() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V", line = 418)
    public final void method110(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!l", name = "i", descriptor = "()V", line = 420)
    public final void method308() {
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;)V", line = 681)
    public class18(Canvas arg0, class214 arg1) {
        super(arg1);
        try {
            if (!class106.method1005("sw3d", (byte) 125)) {
                throw new RuntimeException("");
            } else {
                class222.method1641(-1);
                this.method337(super.field2812, 0, 0);
                class597.method3480(true, false, (byte) 70);
                this.field323 = true;
                this.field320 = new class94();
                this.method346(new class94());
                this.method336(1);
                this.method293(0);
                if (arg0 != null) {
                    this.method297(arg0);
                    this.method298(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILua;II)V", line = 434)
    public final void method316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class617 arg6, int arg7, int arg8) {
        this.method302(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[I[I)Lua;", line = 437)
    public final class617 method317(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class380(this, this.field303, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!l", name = "n", descriptor = "()Z", line = 441)
    public final boolean method319() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ltt;I)V", line = 444)
    public final void method320(class79 arg0, int arg1) {
        this.method273(arg0, false);
        this.method285().method1670(this, field315, field316, field307, field308, arg0.field999.method1898((byte) 124));
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I", line = 455)
    public final int method323(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!l", name = "r", descriptor = "()Z", line = 461)
    public final boolean method324() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "m", descriptor = "()Lfe;", line = 464)
    public final class530 method160() {
        return new class530(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIF)Lcp;", line = 469)
    public final class674 method325(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class85(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "C", descriptor = "()Z", line = 472)
    public final boolean method326() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[Lcp;)V", line = 476)
    public final void method327(int arg0, class674[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field310[var3++] = arg1[var4].method3857((byte) -35);
            field310[var3++] = arg1[var4].method3851((byte) 15);
            field310[var3++] = arg1[var4].method3859((byte) 117);
            field310[var3++] = arg1[var4].method3860((byte) -119);
            field311[var4] = arg1[var4].method3856((byte) -118);
            field310[var3++] = arg1[var4].method3854(-1);
        }
        this.method349(arg0, field310, field311);
    }

    @OriginalMember(owner = "client!l", name = "W", descriptor = "(S)Z", line = 502)
    private final boolean method333(short arg0) {
        class214 var2 = super.field2812;
        synchronized (super.field2812) {
            if (!super.field2812.method1608(-20340, arg0)) {
                return false;
            } else {
                class258 var4 = super.field2812.method1610(18904, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field4119) {
                        var6 = super.field2812.method1607(128, arg0, -20490, true, 128, 0.7F);
                    } else {
                        var6 = super.field2812.method1609(0.7F, true, arg0, (byte) -126, 128, 128);
                    }
                    this.method263(arg0, var4.field4131, var4.field4126, var4.field4118, var4.field4117, var4.field4136, var4.field4123, var4.field4116, var4.field4134, var4.field4120, var4.field4140, var4.field4124, var4.field4125, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V", line = 529)
    public final void method336(int arg0) {
        this.field325 = arg0;
        this.field324 = new class227[this.field325];
        for (int var2 = 0; var2 < this.field325; ++var2) {
            this.field324[var2] = new class227(this, this.field321, this.field318);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 549)
    public final void method155(int arg0) {
        class222.method1639(0);
        this.method278(arg0);
        for (class176 var2 = (class176) this.field304.method3465((byte) 102); var2 != null; var2 = (class176) this.field304.method3469(0)) {
            var2.method1427();
        }
    }

    @OriginalMember(owner = "client!l", name = "o", descriptor = "()Lq;", line = 563)
    public final class393 method339() {
        return this.field320;
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V", line = 567)
    public final void method341(int arg0) {
        this.field324[arg0].method1668();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V", line = 575)
    public final void method344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method279(arg0, arg1, arg2, arg4, arg5);
        this.method279(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method356(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method356(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFF)V", line = 580)
    public final void method144(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIII)V", line = 583)
    public final void method345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method351(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lq;)V", line = 587)
    public final void method346(class393 arg0) {
        this.field322 = arg0;
        this.method331(arg0);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lufa;[Lwt;Z)Lla;", line = 593)
    public final class418 method347(class632 arg0, class284[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field4535;
            var5[var7] = arg1[var7].field4537;
            if (arg1[var7].field4539 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class171(this, this.field303, arg0, arg1, (class702[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class280(this, this.field303, arg0, arg1, (class702[]) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(IIIIII)Ldd;", line = 632)
    public final class654 method348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V", line = 635)
    protected final synchronized void finalize() {
        this.method1349(1);
        if (this.nativeid != 0L) {
            class222.method1638(-1, this);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ldd;Ldd;FLdd;)Ldd;", line = 643)
    public final class654 method119(class654 arg0, class654 arg1, float arg2, class654 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!l", name = "s", descriptor = "()V", line = 649)
    public final void method170() {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Lf;", line = 653)
    public final class702 method350(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class620(this, this.field303, arg0, arg1) : new class461(this, this.field303, arg0, arg1);
    }

    @OriginalMember(owner = "client!l", name = "z", descriptor = "()Z", line = 661)
    public final boolean method168() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V", line = 674)
    public final void method114(boolean arg0) {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ltt;)V", line = 708)
    public final void method354(class79 arg0) {
        this.method273(arg0, false);
        this.method285().method1670(this, field315, field316, field307, field308, arg0.field999.method1898((byte) 120));
    }

    @OriginalMember(owner = "client!l", name = "B", descriptor = "()Z", line = 715)
    public final boolean method355() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "()V", line = 724)
    public final void method182() {
    }

    @OriginalMember(owner = "client!l", name = "ma", descriptor = "(Lt;)V")
    private final native void method258(class620 arg0);

    @OriginalMember(owner = "client!l", name = "xa", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method263(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!l", name = "ia", descriptor = "(Lta;)V")
    private final native void method269(class196 arg0);

    @OriginalMember(owner = "client!l", name = "q", descriptor = "(Lva;)V")
    private final native void method270(class461 arg0);

    @OriginalMember(owner = "client!l", name = "V", descriptor = "(IIII)V")
    public final native void method271(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method276(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!l", name = "qa", descriptor = "(I)V")
    private final native void method278(int arg0);

    @OriginalMember(owner = "client!l", name = "XA", descriptor = "(IIIII)V")
    public final native void method279(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "ya", descriptor = "()V")
    public final native void method136();

    @OriginalMember(owner = "client!l", name = "JA", descriptor = "()V")
    public final native void method281();

    @OriginalMember(owner = "client!l", name = "IA", descriptor = "(IIIIII[BII)V")
    public final native void method283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "GA", descriptor = "(II)V")
    public final native void method284(int arg0, int arg1);

    @OriginalMember(owner = "client!l", name = "AA", descriptor = "(III[I)V")
    public final native void method292(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!l", name = "R", descriptor = "()V")
    private final native void method295();

    @OriginalMember(owner = "client!l", name = "VA", descriptor = "(IFFFFF)V")
    public final native void method296(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "(IIIIIILua;II)V")
    private final native void method302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class617 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "DA", descriptor = "()I")
    public final native int method131();

    @OriginalMember(owner = "client!l", name = "YA", descriptor = "(IIII)V")
    public final native void method309(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "FA", descriptor = "(ILua;II)V")
    public final native void method310(int arg0, class617 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "EA", descriptor = "(Le;)V")
    private final native void method311(class493 arg0);

    @OriginalMember(owner = "client!l", name = "UA", descriptor = "(Z)V")
    public final native void method312(boolean arg0);

    @OriginalMember(owner = "client!l", name = "pa", descriptor = "(III)V")
    public final native void method313(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "L", descriptor = "()V")
    public final native void method314();

    @OriginalMember(owner = "client!l", name = "U", descriptor = "()I")
    public final native int method315();

    @OriginalMember(owner = "client!l", name = "la", descriptor = "(IIII)V")
    public final native void method318(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(IIII)[I")
    public final native int[] method146(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "O", descriptor = "(IIIIII)Z")
    public final native boolean method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "BA", descriptor = "()I")
    public final native int method322();

    @OriginalMember(owner = "client!l", name = "va", descriptor = "(I)V")
    public final native void method328(int arg0);

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIII)V")
    public final native void method329(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "MA", descriptor = "(III[I)V")
    public final native void method330(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!l", name = "NA", descriptor = "(Lq;)V")
    private final native void method331(class393 arg0);

    @OriginalMember(owner = "client!l", name = "CA", descriptor = "(IIII)V")
    public final native void method332(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "ZA", descriptor = "(Z)V")
    public final native void method334(boolean arg0);

    @OriginalMember(owner = "client!l", name = "J", descriptor = "(IIIIII)V")
    public final native void method335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "OA", descriptor = "(Lfa;II)V")
    private final native void method337(class214 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
    public final native int method338();

    @OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
    public final native int method340();

    @OriginalMember(owner = "client!l", name = "ra", descriptor = "(F)V")
    public final native void method342(float arg0);

    @OriginalMember(owner = "client!l", name = "oa", descriptor = "([I)V")
    public final native void method343(int[] arg0);

    @OriginalMember(owner = "client!l", name = "ja", descriptor = "(I)V")
    public final native void method121(int arg0);

    @OriginalMember(owner = "client!l", name = "I", descriptor = "(I[I[F)V")
    private final native void method349(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!l", name = "w", descriptor = "(IIIIII)V")
    private final native void method351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "da", descriptor = "(IIII)V")
    public final native void method352(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "v", descriptor = "()[I")
    public final native int[] method353();

    @OriginalMember(owner = "client!l", name = "m", descriptor = "(IIIII)V")
    public final native void method356(int arg0, int arg1, int arg2, int arg3, int arg4);
}
