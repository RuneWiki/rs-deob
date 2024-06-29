import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class171 extends class566 implements class249 {

    @OriginalMember(owner = "client!l", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "Z")
    private boolean field2232 = false;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Lae;")
    private class40 field2220 = new class40();

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    private int field2234 = 4096;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    private int field2233 = 4096;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "Lil;")
    private class68 field2235 = new class68(4);

    @OriginalMember(owner = "client!l", name = "I", descriptor = "Z")
    private boolean field2239 = false;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "Lq;")
    private class491 field2237;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "[I")
    private static int[] field2219 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!l", name = "r", descriptor = "[S")
    private static short[] field2222 = new short[8191];

    @OriginalMember(owner = "client!l", name = "u", descriptor = "[B")
    private static byte[] field2225 = new byte[8191];

    @OriginalMember(owner = "client!l", name = "s", descriptor = "[I")
    public static int[] field2223 = field2219;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "[I")
    public static int[] field2224 = new int[6];

    @OriginalMember(owner = "client!l", name = "x", descriptor = "[I")
    private static int[] field2228 = new int[8191];

    @OriginalMember(owner = "client!l", name = "w", descriptor = "[F")
    private static float[] field2227 = new float[20];

    @OriginalMember(owner = "client!l", name = "v", descriptor = "[F")
    private static float[] field2226 = field2227;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "[I")
    private static int[] field2230 = field2219;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "[I")
    private static int[] field2231 = new int[8191];

    @OriginalMember(owner = "client!l", name = "y", descriptor = "[I")
    private static int[] field2229 = field2219;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "I")
    public int field2240;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Lm;")
    private class108 field2221;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "Lta;")
    private class457 field2236;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "Lq;")
    private class491 field2238;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "[Lqa;")
    private class176[] field2241;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V", line = 4)
    public final void method973(int arg0) {
        this.field2241[arg0].method1116();
    }

    @OriginalMember(owner = "client!l", name = "n", descriptor = "()Z", line = 8)
    public final boolean method975() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lf;Z)V", line = 11)
    public final void method976(class536 arg0, boolean arg1) {
        if (arg0 instanceof class643) {
            this.method1081((class643) arg0);
        } else if (arg0 instanceof class522) {
            this.method992((class522) arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(IIIIII)V", line = 23)
    public final void method978(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1084(arg0, arg1, arg2, arg4, arg5);
        this.method1084(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1002(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method1002(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "A", descriptor = "(S)Z", line = 29)
    private final boolean method979(short arg0) {
        synchronized (this) {
            class13 var3 = super.field7898.method2486(arg0, (byte) 86);
            if (var3 == null) {
                return false;
            } else {
                this.method1066(arg0, var3.field242, var3.field231, var3.field230, var3.field246, var3.field249, var3.field239, var3.field228, var3.field234, var3.field247, var3.field226, var3.field238, var3.field243);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljt;)V", line = 39)
    public final void method980(class533 arg0) {
    }

    @OriginalMember(owner = "client!l", name = "j", descriptor = "()V", line = 43)
    public final void method983() {
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "()Z", line = 47)
    public final boolean method985() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "D", descriptor = "()Lqa;", line = 52)
    public final class176 method986() {
        for (int var1 = 0; var1 < this.field2240; ++var1) {
            if (this.field2241[var1].field2279 == Thread.currentThread()) {
                return this.field2241[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 65)
    public final void method987(Rectangle[] arg0, int arg1) throws class180 {
        if (this.field2236 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field2236.method2440(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!l", name = "u", descriptor = "()V", line = 75)
    public final void method988() throws class180 {
        if (this.field2236 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field2236.method2441();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lsa;[Laga;Z)Lla;", line = 86)
    public final class413 method989(class595 arg0, class661[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field9351;
            var5[var7] = arg1[var7].field9353;
            if (arg1[var7].field9355 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class675(this, this.field2221, arg0, arg1, (class536[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class315(this, this.field2221, arg0, arg1, (class536[]) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(IIIIII)Ljt;", line = 123)
    public final class533 method990(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lir;)V", line = 128)
    public final void method993(class27 arg0) {
        this.method1056(arg0, false);
        this.method986().method1111(this, field2230, field2231, field2228, field2222, arg0.field399.method849(-14300));
    }

    @OriginalMember(owner = "client!l", name = "p", descriptor = "()Lq;", line = 133)
    public final class491 method995() {
        return this.field2237;
    }

    @OriginalMember(owner = "client!l", name = "l", descriptor = "()Z", line = 136)
    public final boolean method996() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "()I", line = 139)
    public final int method997() {
        return 4;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I", line = 143)
    public final int method998(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lir;I)V", line = 149)
    public final void method999(class27 arg0, int arg1) {
        this.method1056(arg0, false);
        this.method986().method1111(this, field2230, field2231, field2228, field2222, arg0.field399.method849(-14300));
    }

    @OriginalMember(owner = "client!l", name = "y", descriptor = "()Loa;", line = 154)
    public final class226 method1001() {
        return new class226(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;)V", line = 159)
    public class171(Canvas arg0, class526 arg1) {
        super(arg1);
        try {
            if (!class496.method2671("sw3d", -126)) {
                throw new RuntimeException("");
            } else {
                class499.method2691((byte) -75);
                this.method1059(super.field7898, 0, 0);
                class48.method305(false, true, (byte) 88);
                this.field2239 = true;
                this.field2237 = new class282();
                this.method1058(new class282());
                this.method1063(1);
                this.method1040(0);
                if (arg0 != null) {
                    this.method1073(arg0);
                    this.method1086(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "w", descriptor = "()V", line = 184)
    public final void method1003() {
    }

    @OriginalMember(owner = "client!l", name = "k", descriptor = "()V", line = 186)
    public final void method1004() {
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V", line = 189)
    public final void method1005(boolean arg0) {
    }

    @OriginalMember(owner = "client!l", name = "z", descriptor = "()Z", line = 192)
    public final boolean method1006() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILua;II)V", line = 195)
    public final void method1007(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class600 arg6, int arg7, int arg8) {
        this.method1009(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 198)
    public final class272 method1008(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class216(this, this.field2221, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "o", descriptor = "()Z", line = 204)
    public final boolean method1011() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "WA", descriptor = "()V", line = 209)
    private final void method1013() {
        System.gc();
        System.runFinalization();
        class499.method2692(-5175);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFF)V", line = 215)
    public final void method1014(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)Le;", line = 219)
    public final class385 method1015(int arg0) {
        class108 var2 = new class108(this, arg0);
        this.field2220.method239(var2, (byte) 93);
        return var2;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I", line = 227)
    public final int method1018(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Leg;IIII)Lda;", line = 231)
    public final class474 method1019(class47 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class609(this, this.field2221, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 234)
    public final void method1020(Canvas arg0) {
        if (this.field2236.field5833 == arg0) {
            this.method1086((Canvas) null);
        }
        class457 var2 = (class457) this.field2235.method399(-32748, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method1871(-125);
            var2.method2438();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V", line = 247)
    public final void method1021(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method986().method1103(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "x", descriptor = "()Z", line = 252)
    public final boolean method1023() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[Lgga;)V", line = 256)
    public final void method1024(int arg0, class332[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field2229[var3++] = arg1[var4].method1886(true);
            field2229[var3++] = arg1[var4].method1888(-105);
            field2229[var3++] = arg1[var4].method1885((byte) 119);
            field2229[var3++] = arg1[var4].method1883((byte) -89);
            field2226[var4] = arg1[var4].method1882(100);
            field2229[var3++] = arg1[var4].method1881(60);
        }
        this.method981(arg0, field2229, field2226);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIII)Lf;", line = 275)
    public final class536 method1025(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class522(this, this.field2221, arg0, arg1, arg2, arg3, arg4) : new class643(this, this.field2221, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class522(this, this.field2221, arg0, arg1, arg2, arg3, arg4) : new class643(this, this.field2221, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!l", name = "m", descriptor = "()Z", line = 310)
    public final boolean method1026() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "()Z", line = 313)
    public final boolean method1027() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([I)V", line = 322)
    public final void method1030(int[] arg0) {
        Dimension var2 = this.field2236.field5833.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!l", name = "i", descriptor = "()Z", line = 328)
    public final boolean method1032() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "t", descriptor = "()Lq;", line = 331)
    public final class491 method1033() {
        return this.field2238;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIF)Lgga;", line = 337)
    public final class332 method1035(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class1(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V", line = 341)
    public final void method1038(boolean arg0) {
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V", line = 345)
    public final void method1040(int arg0) {
        this.field2241[arg0].method1109();
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V", line = 348)
    public final void method1041(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIII)V", line = 354)
    public final void method1044(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "()Z", line = 359)
    public final boolean method1047() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "r", descriptor = "()Z", line = 365)
    public final boolean method1049() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "W", descriptor = "(S)Z", line = 368)
    private final boolean method1050(short arg0) {
        class526 var2 = super.field7898;
        synchronized (super.field7898) {
            if (!super.field7898.method2480(false, arg0)) {
                return false;
            } else {
                class13 var4 = super.field7898.method2486(arg0, (byte) 86);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field244) {
                        var6 = super.field7898.method2481(arg0, 0.7F, true, 128, -5969, 128);
                    } else {
                        var6 = super.field7898.method2488(0.7F, 128, (byte) 111, true, 128, arg0);
                    }
                    this.method1010(arg0, var4.field242, var4.field231, var4.field230, var4.field246, var4.field249, var4.field239, var4.field228, var4.field234, var4.field247, var4.field226, var4.field238, var4.field243, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 392)
    public final void method1051(int arg0) {
        class499.method2692(-5175);
        this.method1042(arg0);
        for (class108 var2 = (class108) this.field2220.method237(88); var2 != null; var2 = (class108) this.field2220.method245((byte) 43)) {
            var2.method608();
        }
    }

    @OriginalMember(owner = "client!l", name = "s", descriptor = "()V", line = 404)
    public final void method1052() {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZ)Lf;", line = 407)
    public final class536 method1053(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class522(this, this.field2221, arg0, arg1, arg2, arg3) : new class643(this, this.field2221, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lir;Z)V", line = 420)
    private final void method1056(class27 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class26 var8 = (class26) arg0.field399.method846(-19895); var8 != null; var8 = (class26) arg0.field399.method852(83)) {
            field2230[var3++] = var8.field393;
            field2230[var3++] = var8.field390;
            field2230[var3++] = var8.field388;
            field2231[var4++] = var8.field386;
            field2222[var6++] = (short) var8.field398;
            field2228[var5++] = var8.field385;
            if (arg1) {
                field2225[var7++] = var8.field391;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lq;)V", line = 452)
    public final void method1058(class491 arg0) {
        this.field2238 = arg0;
        this.method1079(arg0);
    }

    @OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V", line = 460)
    protected final synchronized void finalize() {
        this.method3119(1);
        if (this.nativeid != 0L) {
            class499.method2689(this, (byte) 97);
        }
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V", line = 467)
    public final void method1063(int arg0) {
        this.field2240 = arg0;
        this.field2241 = new class176[this.field2240];
        for (int var2 = 0; var2 < this.field2240; ++var2) {
            this.field2241[var2] = new class176(this, this.field2233, this.field2234);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljt;Ljt;FLjt;)Ljt;", line = 480)
    public final class533 method1064(class533 arg0, class533 arg1, float arg2, class533 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V", line = 483)
    public final void method1065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1088(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "()Z", line = 487)
    public final boolean method1067() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 491)
    public final void method1068(Canvas arg0) {
        class457 var2 = (class457) this.field2235.method399(-32748, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method2444(arg0, var3.width, var3.height);
        if (arg0 != null && this.field2236.field5833 == arg0) {
            this.method1086(arg0);
        }
    }

    @OriginalMember(owner = "client!l", name = "A", descriptor = "()V", line = 501)
    public final void method1069() {
        if (!this.field2232) {
            this.field2241 = null;
            this.field2236 = null;
            this.field2221 = null;
            this.field2237 = null;
            this.field2235.method398(true);
            for (class108 var1 = (class108) this.field2220.method237(116); var1 != null; var1 = (class108) this.field2220.method245((byte) 27)) {
                var1.method610();
            }
            this.field2220.method247(2);
            this.method1043();
            if (this.field2239) {
                class326.method1865(false, false, true);
                this.field2239 = false;
            }
            this.method1013();
            class499.method2690(0);
            this.field2232 = true;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Lf;", line = 533)
    public final class536 method1071(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class522(this, this.field2221, arg0, arg1) : new class643(this, this.field2221, arg0, arg1);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Laga;Z)Lf;", line = 540)
    public final class536 method1072(class661 arg0, boolean arg1) {
        int[] var3 = arg0.field9358;
        byte[] var4 = arg0.field9352;
        int var5 = arg0.field9351;
        int var6 = arg0.field9353;
        class536 var7;
        if (arg1 && arg0.field9355 == null) {
            var7 = new class94(this, this.field2221, var3, var4, 0, arg0.field9351, arg0.field9351, arg0.field9353);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field9355;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class522(this, this.field2221, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field9358[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class522(this, this.field2221, var9, 0, arg0.field9351, arg0.field9351, arg0.field9353);
                } else {
                    var7 = new class643(this, this.field2221, var9, 0, arg0.field9351, arg0.field9351, arg0.field9353);
                }
            }
        }
        var7.method161(arg0.field9354, arg0.field9356, arg0.field9350, arg0.field9357);
        return var7;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 615)
    public final void method1073(Canvas arg0) {
        class457 var2 = (class457) this.field2235.method399(-32748, (long) arg0.hashCode());
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class457 var5 = new class457(this, arg0);
            this.field2235.method402(var5, (byte) -71, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!l", name = "B", descriptor = "()Z", line = 641)
    public final boolean method1076() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "fa", descriptor = "()Ljava/lang/Object;", line = 644)
    private final Object method1077() {
        return new class501(this);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V", line = 646)
    public final void method1078(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[I[I)Lua;", line = 650)
    public final class600 method1080(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class399(this, this.field2221, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!l", name = "q", descriptor = "()V", line = 659)
    public final void method1082() {
        this.method1086(this.field2236.field5833);
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "()Z", line = 668)
    public final boolean method1085() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 682)
    public final void method1086(Canvas arg0) {
        if (arg0 != null) {
            class457 var2 = (class457) this.field2235.method399(-32748, (long) arg0.hashCode());
            this.field2236 = var2;
            this.method1061(var2);
        } else {
            this.field2236 = null;
            this.method1061((class457) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "C", descriptor = "()Lq;", line = 698)
    public final class491 method1087() {
        return new class282();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()V", line = 713)
    public final void method1089() {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Le;)V", line = 725)
    public final void method1091(class385 arg0) {
        this.field2221 = (class108) arg0;
        this.method977(arg0);
    }

    @OriginalMember(owner = "client!l", name = "BA", descriptor = "()I")
    public final native int method974();

    @OriginalMember(owner = "client!l", name = "EA", descriptor = "(Le;)V")
    private final native void method977(class385 arg0);

    @OriginalMember(owner = "client!l", name = "I", descriptor = "(I[I[F)V")
    private final native void method981(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!l", name = "O", descriptor = "(IIIIII)Z")
    public final native boolean method982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "YA", descriptor = "(IIII)V")
    public final native void method984(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "MA", descriptor = "(III[I)V")
    public final native void method991(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!l", name = "ma", descriptor = "(Lt;)V")
    private final native void method992(class522 arg0);

    @OriginalMember(owner = "client!l", name = "VA", descriptor = "(IFFFFF)V")
    public final native void method994(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!l", name = "CA", descriptor = "(IIII)V")
    public final native void method1000(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "m", descriptor = "(IIIII)V")
    public final native void method1002(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "(IIIIIILua;II)V")
    private final native void method1009(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class600 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "xa", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method1010(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!l", name = "FA", descriptor = "(ILua;II)V")
    public final native void method1012(int arg0, class600 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "v", descriptor = "()[I")
    public final native int[] method1016();

    @OriginalMember(owner = "client!l", name = "JA", descriptor = "()V")
    public final native void method1017();

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIII)V")
    public final native void method1022(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "ja", descriptor = "(I)V")
    public final native void method1028(int arg0);

    @OriginalMember(owner = "client!l", name = "va", descriptor = "(I)V")
    public final native void method1029(int arg0);

    @OriginalMember(owner = "client!l", name = "UA", descriptor = "(Z)V")
    public final native void method548(boolean arg0);

    @OriginalMember(owner = "client!l", name = "ya", descriptor = "()V")
    public final native void method1031();

    @OriginalMember(owner = "client!l", name = "ZA", descriptor = "(Z)V")
    public final native void method1034(boolean arg0);

    @OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
    public final native int method1036();

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(IIII)[I")
    public final native int[] method1037(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "L", descriptor = "()V")
    public final native void method1039();

    @OriginalMember(owner = "client!l", name = "qa", descriptor = "(I)V")
    private final native void method1042(int arg0);

    @OriginalMember(owner = "client!l", name = "R", descriptor = "()V")
    private final native void method1043();

    @OriginalMember(owner = "client!l", name = "DA", descriptor = "()I")
    public final native int method1045();

    @OriginalMember(owner = "client!l", name = "AA", descriptor = "(III[I)V")
    public final native void method1046(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!l", name = "la", descriptor = "(IIII)V")
    public final native void method1048(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "ra", descriptor = "(F)V")
    public final native void method1054(float arg0);

    @OriginalMember(owner = "client!l", name = "U", descriptor = "()I")
    public final native int method1055();

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
    public final native int method1057();

    @OriginalMember(owner = "client!l", name = "OA", descriptor = "(Lfa;II)V")
    private final native void method1059(class526 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "oa", descriptor = "([I)V")
    public final native void method1060(int[] arg0);

    @OriginalMember(owner = "client!l", name = "ia", descriptor = "(Lta;)V")
    private final native void method1061(class457 arg0);

    @OriginalMember(owner = "client!l", name = "GA", descriptor = "(II)V")
    public final native void method1062(int arg0, int arg1);

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method1066(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!l", name = "V", descriptor = "(IIII)V")
    public final native void method1070(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "IA", descriptor = "(IIIIII[BII)V")
    public final native void method1074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "pa", descriptor = "(III)V")
    public final native void method1075(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "NA", descriptor = "(Lq;)V")
    private final native void method1079(class491 arg0);

    @OriginalMember(owner = "client!l", name = "q", descriptor = "(Lva;)V")
    private final native void method1081(class643 arg0);

    @OriginalMember(owner = "client!l", name = "da", descriptor = "(IIII)V")
    public final native void method1083(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "XA", descriptor = "(IIIII)V")
    public final native void method1084(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "w", descriptor = "(IIIIII)V")
    private final native void method1088(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "J", descriptor = "(IIIIII)V")
    public final native void method1090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
