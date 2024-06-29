import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class172 extends class564 implements class251 {

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Z")
    private boolean field1914 = false;

    @OriginalMember(owner = "client!l", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "Lgk;")
    private class616 field1915 = new class616();

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    private int field1920 = 4096;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    private int field1925 = 4096;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "Lwa;")
    private class661 field1918 = new class661(4);

    @OriginalMember(owner = "client!l", name = "M", descriptor = "Z")
    private boolean field1935 = false;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "Lq;")
    private class490 field1930;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "[I")
    private static int[] field1917 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!l", name = "y", descriptor = "[I")
    public static int[] field1922 = new int[6];

    @OriginalMember(owner = "client!l", name = "C", descriptor = "[B")
    private static byte[] field1926 = new byte[8191];

    @OriginalMember(owner = "client!l", name = "z", descriptor = "[I")
    private static int[] field1923 = field1917;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "[S")
    private static short[] field1931 = new short[8191];

    @OriginalMember(owner = "client!l", name = "G", descriptor = "[F")
    private static float[] field1929 = new float[20];

    @OriginalMember(owner = "client!l", name = "J", descriptor = "[I")
    private static int[] field1932 = new int[8191];

    @OriginalMember(owner = "client!l", name = "D", descriptor = "[I")
    private static int[] field1927 = new int[8191];

    @OriginalMember(owner = "client!l", name = "F", descriptor = "[I")
    private static int[] field1928 = field1917;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "[I")
    public static int[] field1933 = field1917;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "[F")
    private static float[] field1921 = field1929;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    public int field1936;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Lm;")
    private class109 field1916;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Lta;")
    private class456 field1919;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "Lq;")
    private class490 field1924;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "[Lqa;")
    private class177[] field1934;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "()Lqa;", line = 5)
    public final class177 method935() {
        for (int var1 = 0; var1 < this.field1936; ++var1) {
            if (this.field1934[var1].field1980 == Thread.currentThread()) {
                return this.field1934[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!l", name = "y", descriptor = "()Z", line = 23)
    public final boolean method939() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[I[I)Lua;", line = 26)
    public final class598 method940(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class399(this, this.field1916, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!l", name = "i", descriptor = "(I)V", line = 31)
    public final void method942(int arg0) {
        this.field1934[arg0].method1080();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lqw;Z)V", line = 38)
    private final void method945(class332 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class119 var8 = (class119) arg0.field4171.method398(false); var8 != null; var8 = (class119) arg0.field4171.method396((byte) -37)) {
            field1923[var3++] = var8.field1337;
            field1923[var3++] = var8.field1328;
            field1923[var3++] = var8.field1335;
            field1932[var4++] = var8.field1330;
            field1931[var6++] = (short) var8.field1331;
            field1927[var5++] = var8.field1333;
            if (arg1) {
                field1926[var7++] = var8.field1325;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "t", descriptor = "()Z", line = 68)
    public final boolean method946() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Llj;)V", line = 70)
    public final void method947(class60 arg0) {
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V", line = 74)
    public final void method948(int arg0) {
        class402.method2262(29025);
        this.method964(arg0);
        for (class109 var2 = (class109) this.field1915.method3434((byte) 2); var2 != null; var2 = (class109) this.field1915.method3430(true)) {
            var2.method589();
        }
    }

    @OriginalMember(owner = "client!l", name = "o", descriptor = "()Lq;", line = 90)
    public final class490 method950() {
        return this.field1930;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZ)Lf;", line = 93)
    public final class534 method951(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class520(this, this.field1916, arg0, arg1, arg2, arg3) : new class641(this, this.field1916, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!l", name = "i", descriptor = "()I", line = 101)
    public final int method953() {
        return 4;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V", line = 103)
    public final void method954(boolean arg0) {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 108)
    public final void method956(Canvas arg0) {
        class456 var2 = (class456) this.field1918.method3669((long) arg0.hashCode(), -1);
        Dimension var3 = arg0.getSize();
        var2.method2618(arg0, var3.width, var3.height);
        if (arg0 != null && this.field1919.field6495 == arg0) {
            this.method988(arg0);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V", line = 117)
    public final void method957(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1028(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 121)
    public final void method958(Rectangle[] arg0, int arg1) throws class20 {
        if (this.field1919 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field1919.method2623(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V", line = 132)
    protected final synchronized void finalize() {
        this.method3203(5);
        if (this.nativeid != 0L) {
            class402.method2265(-58, this);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Llj;Llj;FLlj;)Llj;", line = 138)
    public final class60 method959(class60 arg0, class60 arg1, float arg2, class60 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!l", name = "n", descriptor = "()Z", line = 141)
    public final boolean method960() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(IIIIII)Llj;", line = 144)
    public final class60 method961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!l", name = "j", descriptor = "()Z", line = 150)
    public final boolean method965() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "u", descriptor = "()V", line = 153)
    public final void method967() {
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 157)
    public final void method968(Canvas arg0) {
        class456 var2 = (class456) this.field1918.method3669((long) arg0.hashCode(), -1);
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class456 var5 = new class456(this, arg0);
            this.field1918.method3671(false, var5, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!l", name = "q", descriptor = "()Z", line = 179)
    public final boolean method972() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I", line = 183)
    public final int method973(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!l", name = "A", descriptor = "()V", line = 189)
    public final void method974() {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFF)V", line = 191)
    public final void method975(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V", line = 193)
    public final void method976(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "()Z", line = 196)
    public final boolean method977() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V", line = 200)
    public final void method978(int arg0) {
        this.field1936 = arg0;
        this.field1934 = new class177[this.field1936];
        for (int var2 = 0; var2 < this.field1936; ++var2) {
            this.field1934[var2] = new class177(this, this.field1925, this.field1920);
        }
    }

    @OriginalMember(owner = "client!l", name = "l", descriptor = "()V", line = 213)
    public final void method979() throws class20 {
        if (this.field1919 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field1919.method2616();
        }
    }

    @OriginalMember(owner = "client!l", name = "s", descriptor = "()Lq;", line = 227)
    public final class490 method983() {
        return this.field1924;
    }

    @OriginalMember(owner = "client!l", name = "W", descriptor = "(S)Z", line = 230)
    private final boolean method984(short arg0) {
        class524 var2 = super.field8050;
        synchronized (super.field8050) {
            if (!super.field8050.method144(8649, arg0)) {
                return false;
            } else {
                class295 var4 = super.field8050.method140(arg0, 862);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field3666) {
                        var6 = super.field8050.method145(128, true, 0.7F, -18551, 128, arg0);
                    } else {
                        var6 = super.field8050.method141(true, arg0, 128, 0.7F, 16944, 128);
                    }
                    this.method986(arg0, var4.field3671, var4.field3667, var4.field3665, var4.field3674, var4.field3670, var4.field3673, var4.field3681, var4.field3669, var4.field3683, var4.field3682, var4.field3687, var4.field3678, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "fa", descriptor = "()Ljava/lang/Object;", line = 254)
    private final Object method985() {
        return new class500(this);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 259)
    public final void method988(Canvas arg0) {
        if (arg0 != null) {
            class456 var2 = (class456) this.field1918.method3669((long) arg0.hashCode(), -1);
            this.field1919 = var2;
            this.method1024(var2);
        } else {
            this.field1919 = null;
            this.method1024((class456) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lf;Z)V", line = 276)
    public final void method990(class534 arg0, boolean arg1) {
        if (arg0 instanceof class641) {
            this.method943((class641) arg0);
        } else if (arg0 instanceof class520) {
            this.method995((class520) arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V", line = 287)
    public final void method991(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lq;)V", line = 290)
    public final void method992(class490 arg0) {
        this.field1924 = arg0;
        this.method1003(arg0);
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 294)
    public final void method993(Canvas arg0) {
        if (this.field1919.field6495 == arg0) {
            this.method988((Canvas) null);
        }
        class456 var2 = (class456) this.field1918.method3669((long) arg0.hashCode(), -1);
        if (var2 != null) {
            var2.method1922(104);
            var2.method2621();
        }
    }

    @OriginalMember(owner = "client!l", name = "B", descriptor = "()Z", line = 308)
    public final boolean method994() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([I)V", line = 314)
    public final void method996(int[] arg0) {
        Dimension var2 = this.field1919.field6495.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;)V", line = 405)
    public class172(Canvas arg0, class524 arg1) {
        super(arg1);
        try {
            if (!class166.method908("sw3d", (byte) 102)) {
                throw new RuntimeException("");
            } else {
                class402.method2261((byte) -12);
                this.method1040(super.field8050, 0, 0);
                class370.method2159(-89, true, false);
                this.field1935 = true;
                this.field1930 = new class284();
                this.method992(new class284());
                this.method978(1);
                this.method1018(0);
                if (arg0 != null) {
                    this.method968(arg0);
                    this.method988(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lho;[Lqo;Z)Lla;", line = 324)
    public final class413 method998(class463 arg0, class550[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field7873;
            var5[var7] = arg1[var7].field7872;
            if (arg1[var7].field7868 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class675(this, this.field1916, arg0, arg1, (class534[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class317(this, this.field1916, arg0, arg1, (class534[]) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(IIIIII)V", line = 361)
    public final void method999(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1007(arg0, arg1, arg2, arg4, arg5);
        this.method1007(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1030(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method1030(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "()V", line = 366)
    public final void method1000() {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 369)
    public final class274 method1001(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class218(this, this.field1916, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I", line = 374)
    public final int method1004(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!l", name = "r", descriptor = "()Z", line = 377)
    public final boolean method1005() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "m", descriptor = "()Z", line = 383)
    public final boolean method1008() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIF)Leq;", line = 389)
    public final class670 method1010(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class136(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "()V", line = 391)
    public final void method1011() {
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(I)Le;", line = 396)
    public final class385 method1012(int arg0) {
        class109 var2 = new class109(this, arg0);
        this.field1915.method3425(var2, false);
        return var2;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIII)V", line = 401)
    public final void method1013(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V", line = 431)
    public final void method1015(boolean arg0) {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIII)Lf;", line = 437)
    public final class534 method1017(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class520(this, this.field1916, arg0, arg1, arg2, arg3, arg4) : new class641(this, this.field1916, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class520(this, this.field1916, arg0, arg1, arg2, arg3, arg4) : new class641(this, this.field1916, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V", line = 472)
    public final void method1018(int arg0) {
        this.field1934[arg0].method1073();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[Leq;)V", line = 477)
    public final void method1020(int arg0, class670[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field1928[var3++] = arg1[var4].method3711(1795643394);
            field1928[var3++] = arg1[var4].method3703((byte) -29);
            field1928[var3++] = arg1[var4].method3706((byte) -36);
            field1928[var3++] = arg1[var4].method3708((byte) 83);
            field1921[var4] = arg1[var4].method3704((byte) -94);
            field1928[var3++] = arg1[var4].method3710(false);
        }
        this.method989(arg0, field1928, field1921);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILua;II)V", line = 497)
    public final void method1023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class598 arg6, int arg7, int arg8) {
        this.method987(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Lf;", line = 501)
    public final class534 method1025(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class520(this, this.field1916, arg0, arg1) : new class641(this, this.field1916, arg0, arg1);
    }

    @OriginalMember(owner = "client!l", name = "A", descriptor = "(S)Z", line = 507)
    private final boolean method1026(short arg0) {
        synchronized (this) {
            class295 var3 = super.field8050.method140(arg0, 862);
            if (var3 == null) {
                return false;
            } else {
                this.method980(arg0, var3.field3671, var3.field3667, var3.field3665, var3.field3674, var3.field3670, var3.field3673, var3.field3681, var3.field3669, var3.field3683, var3.field3682, var3.field3687, var3.field3678);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()V", line = 520)
    public final void method1029() {
        if (!this.field1914) {
            this.field1934 = null;
            this.field1919 = null;
            this.field1916 = null;
            this.field1930 = null;
            this.field1918.method3667(5488);
            for (class109 var1 = (class109) this.field1915.method3434((byte) 2); var1 != null; var1 = (class109) this.field1915.method3430(true)) {
                var1.method590();
            }
            this.field1915.method3438(16);
            this.method962();
            if (this.field1935) {
                class694.method3817(true, false, (byte) 43);
                this.field1935 = false;
            }
            this.method1034();
            class402.method2264(-1);
            this.field1914 = true;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lqw;)V", line = 554)
    public final void method1033(class332 arg0) {
        this.method945(arg0, false);
        this.method935().method1074(this, field1923, field1932, field1927, field1931, arg0.field4171.method397(true));
    }

    @OriginalMember(owner = "client!l", name = "WA", descriptor = "()V", line = 558)
    private final void method1034() {
        System.gc();
        System.runFinalization();
        class402.method2262(29025);
    }

    @OriginalMember(owner = "client!l", name = "w", descriptor = "()Lq;", line = 563)
    public final class490 method1035() {
        return new class284();
    }

    @OriginalMember(owner = "client!l", name = "p", descriptor = "()Laj;", line = 568)
    public final class286 method1037() {
        return new class286(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!l", name = "k", descriptor = "()Z", line = 571)
    public final boolean method1038() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lqo;Z)Lf;", line = 577)
    public final class534 method1041(class550 arg0, boolean arg1) {
        int[] var3 = arg0.field7871;
        byte[] var4 = arg0.field7869;
        int var5 = arg0.field7873;
        int var6 = arg0.field7872;
        class534 var7;
        if (arg1 && arg0.field7868 == null) {
            var7 = new class95(this, this.field1916, var3, var4, 0, arg0.field7873, arg0.field7873, arg0.field7872);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field7868;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class520(this, this.field1916, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field7871[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class520(this, this.field1916, var9, 0, arg0.field7873, arg0.field7873, arg0.field7872);
                } else {
                    var7 = new class641(this, this.field1916, var9, 0, arg0.field7873, arg0.field7873, arg0.field7872);
                }
            }
        }
        var7.method313(arg0.field7870, arg0.field7867, arg0.field7875, arg0.field7874);
        return var7;
    }

    @OriginalMember(owner = "client!l", name = "z", descriptor = "()Z", line = 651)
    public final boolean method1042() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Le;)V", line = 654)
    public final void method1043(class385 arg0) {
        this.field1916 = (class109) arg0;
        this.method1014(arg0);
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "()Z", line = 658)
    public final boolean method1044() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "()V", line = 661)
    public final void method1045() {
        this.method988(this.field1919.field6495);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V", line = 664)
    public final void method1046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method935().method1082(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lqw;I)V", line = 681)
    public final void method1048(class332 arg0, int arg1) {
        this.method945(arg0, false);
        this.method935().method1074(this, field1923, field1932, field1927, field1931, arg0.field4171.method397(true));
    }

    @OriginalMember(owner = "client!l", name = "x", descriptor = "()V", line = 685)
    public final void method1049() {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lef;IIII)Lda;", line = 689)
    public final class473 method1051(class581 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class606(this, this.field1916, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "()Z", line = 706)
    public final boolean method1052() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "C", descriptor = "()Z", line = 728)
    public final boolean method1053() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "CA", descriptor = "(IIII)V")
    public final native void method936(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "pa", descriptor = "(III)V")
    public final native void method937(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "v", descriptor = "()[I")
    public final native int[] method938();

    @OriginalMember(owner = "client!l", name = "V", descriptor = "(IIII)V")
    public final native void method941(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "q", descriptor = "(Lva;)V")
    private final native void method943(class641 arg0);

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(IIII)[I")
    public final native int[] method944(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "ra", descriptor = "(F)V")
    public final native void method949(float arg0);

    @OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
    public final native int method952();

    @OriginalMember(owner = "client!l", name = "ZA", descriptor = "(Z)V")
    public final native void method955(boolean arg0);

    @OriginalMember(owner = "client!l", name = "R", descriptor = "()V")
    private final native void method962();

    @OriginalMember(owner = "client!l", name = "oa", descriptor = "([I)V")
    public final native void method963(int[] arg0);

    @OriginalMember(owner = "client!l", name = "qa", descriptor = "(I)V")
    private final native void method964(int arg0);

    @OriginalMember(owner = "client!l", name = "BA", descriptor = "()I")
    public final native int method966();

    @OriginalMember(owner = "client!l", name = "ya", descriptor = "()V")
    public final native void method969();

    @OriginalMember(owner = "client!l", name = "MA", descriptor = "(III[I)V")
    public final native void method970(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!l", name = "U", descriptor = "()I")
    public final native int method971();

    @OriginalMember(owner = "client!l", name = "UA", descriptor = "(Z)V")
    public final native void method484(boolean arg0);

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method980(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
    public final native int method981();

    @OriginalMember(owner = "client!l", name = "da", descriptor = "(IIII)V")
    public final native void method982(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "xa", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method986(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "(IIIIIILua;II)V")
    private final native void method987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class598 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "I", descriptor = "(I[I[F)V")
    private final native void method989(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!l", name = "ma", descriptor = "(Lt;)V")
    private final native void method995(class520 arg0);

    @OriginalMember(owner = "client!l", name = "la", descriptor = "(IIII)V")
    public final native void method997(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "ja", descriptor = "(I)V")
    public final native void method1002(int arg0);

    @OriginalMember(owner = "client!l", name = "NA", descriptor = "(Lq;)V")
    private final native void method1003(class490 arg0);

    @OriginalMember(owner = "client!l", name = "O", descriptor = "(IIIIII)Z")
    public final native boolean method1006(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "XA", descriptor = "(IIIII)V")
    public final native void method1007(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIII)V")
    public final native void method1009(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "EA", descriptor = "(Le;)V")
    private final native void method1014(class385 arg0);

    @OriginalMember(owner = "client!l", name = "GA", descriptor = "(II)V")
    public final native void method1016(int arg0, int arg1);

    @OriginalMember(owner = "client!l", name = "AA", descriptor = "(III[I)V")
    public final native void method1019(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!l", name = "DA", descriptor = "()I")
    public final native int method1021();

    @OriginalMember(owner = "client!l", name = "J", descriptor = "(IIIIII)V")
    public final native void method1022(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "ia", descriptor = "(Lta;)V")
    private final native void method1024(class456 arg0);

    @OriginalMember(owner = "client!l", name = "va", descriptor = "(I)V")
    public final native void method1027(int arg0);

    @OriginalMember(owner = "client!l", name = "w", descriptor = "(IIIIII)V")
    private final native void method1028(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "m", descriptor = "(IIIII)V")
    public final native void method1030(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "YA", descriptor = "(IIII)V")
    public final native void method1031(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "VA", descriptor = "(IFFFFF)V")
    public final native void method1032(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!l", name = "FA", descriptor = "(ILua;II)V")
    public final native void method1036(int arg0, class598 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "IA", descriptor = "(IIIIII[BII)V")
    public final native void method1039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "OA", descriptor = "(Lfa;II)V")
    private final native void method1040(class524 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "L", descriptor = "()V")
    public final native void method1047();

    @OriginalMember(owner = "client!l", name = "JA", descriptor = "()V")
    public final native void method1050();
}
