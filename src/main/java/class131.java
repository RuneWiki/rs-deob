import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class131 extends class11 implements class240 {

    @OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "Lfr;")
    private class497 field1936 = new class497();

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "I")
    private int field1947 = 4096;

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "I")
    private int field1950 = 4096;

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "Lmt;")
    private class517 field1948 = new class517(4);

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "Z")
    private boolean field1955 = false;

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "Lc;")
    private class511 field1952;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "[I")
    private static int[] field1934 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "[F")
    private static float[] field1937 = new float[20];

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "[I")
    private static int[] field1941 = new int[8191];

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "[I")
    public static int[] field1940 = new int[6];

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "[I")
    private static int[] field1939 = field1934;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "[S")
    private static short[] field1942 = new short[8191];

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field1943 = Boolean.FALSE;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "[I")
    public static int[] field1938 = field1934;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "[I")
    private static int[] field1944 = new int[8191];

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "[B")
    private static byte[] field1951 = new byte[8191];

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "[F")
    private static float[] field1946 = field1937;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "[I")
    private static int[] field1945 = field1934;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "I")
    private int field1953;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "Lna;")
    private class253 field1935;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "Lza;")
    private class296 field1949;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "[Ln;")
    private class392[] field1954;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "()Z")
    public final boolean method138() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "OA", descriptor = "(IIII)V")
    public final native void method84(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public final void method96(int arg0) {
        this.field1954[arg0].method2345();
    }

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "(Lu;)V")
    private final native void method956(class346 arg0);

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "()Z")
    public final boolean method118() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ldu;[Lul;Z)Lla;")
    public final class307 method61(class443 arg0, class319[] arg1, boolean arg2) {
        return arg2 ? new class162(this, this.field1935, arg0, arg1, (class127[]) null) : new class472(this, this.field1935, arg0, arg1, (class127[]) null);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lu;)V")
    public final void method137(class346 arg0) {
        this.field1935 = (class253) arg0;
        this.method956(arg0);
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
    public final void method71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method960(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lio;IIII)Lt;")
    public final class398 method150(class118 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class353(this, this.field1935, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method957(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "(IIII)[I")
    public final native int[] method102(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "(IFFFFF)V")
    public final native void method122(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "()Z")
    public final boolean method95() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "UA", descriptor = "(III)V")
    public final native void method141(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "ma", descriptor = "(I)V")
    private final native void method958(int arg0);

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "()Z")
    public final boolean method125() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Ll;")
    public final class127 method153(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class205(this, this.field1935, arg0, arg1, arg2, arg3) : new class144(this, this.field1935, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qa", name = "JA", descriptor = "(IIIIII)Z")
    public final native boolean method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method81(Canvas arg0) {
        if (this.field1949.field4424 == arg0) {
            this.method108((Canvas) null);
        }
        class296 var2 = (class296) this.field1948.method3059(112, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method876((byte) -96);
            var2.method1842();
        }
    }

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "()V")
    public final native void method62();

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
    public final void method144(int arg0) {
        this.field1953 = arg0;
        this.field1954 = new class392[this.field1953];
        for (int var2 = 0; var2 < this.field1953; ++var2) {
            this.field1954[var2] = new class392(this, this.field1947, this.field1950);
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
    public final void method130(boolean arg0) {
    }

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "()V")
    public final void method74() {
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lma;")
    public final class249 method78(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class447(this, this.field1935, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lpv;)V")
    public final void method105(class46 arg0) {
        this.method962(arg0, false);
        this.method966().method2350(this, field1939, field1941, field1944, field1942, arg0.field596.method783(-27084));
    }

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "(IIII)V")
    public final native void method140(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "(IIIIIILma;II)V")
    private final native void method959(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class249 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
    public final void method63(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "()V")
    public final void method88() {
    }

    @OriginalMember(owner = "client!qa", name = "TA", descriptor = "(IIIII)V")
    public final native void method91(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method147(Rectangle[] arg0, int arg1) {
        if (this.field1949 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field1949.method1839(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
    public final int method120(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method129(Canvas arg0) {
        class296 var2 = (class296) this.field1948.method3059(117, (long) arg0.hashCode());
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class296 var5 = new class296(this, arg0);
            this.field1948.method3055(0, (long) arg0.hashCode(), var5);
        }
    }

    @OriginalMember(owner = "client!qa", name = "RA", descriptor = "(IIIIII)V")
    private final native void method960(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "(I)V")
    public final native void method85(int arg0);

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method471();
    }

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "()F")
    public final native float method157();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method108(Canvas arg0) {
        if (arg0 != null) {
            class296 var2 = (class296) this.field1948.method3059(46, (long) arg0.hashCode());
            this.field1949 = var2;
            this.method965(var2);
        } else {
            this.field1949 = null;
            this.method965((class296) null);
        }
    }

    @OriginalMember(owner = "client!qa", name = "FA", descriptor = "()V")
    private final native void method961();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lt;Lpv;Lc;Lqb;I)V")
    public final void method73(class398 arg0, class46 arg1, class511 arg2, class518 arg3, int arg4) {
        this.method962(arg1, true);
        if (arg3 == null) {
            this.method966().method2352(this, arg0, arg2, (int[]) null, arg4, field1939, field1941, field1944, field1942, field1951, arg1.field596.method783(-27084), field1938);
        } else {
            field1940[5] = 0;
            this.method966().method2352(this, arg0, arg2, field1940, arg4, field1939, field1941, field1944, field1942, field1951, arg1.field596.method783(-27084), field1938);
            arg3.field7597 = field1940[0];
            arg3.field7601 = field1940[1];
            arg3.field7596 = field1940[2];
            arg3.field7599 = field1940[3];
            arg3.field7598 = field1940[4];
            arg3.field7600 = field1940[5] != 0;
        }
        class353 var6 = (class353) arg0;
        var6.method2134(0, arg2);
    }

    @OriginalMember(owner = "client!qa", name = "da", descriptor = "([I)V")
    public final native void method109(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lwr;")
    public final class531 method136(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class314(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lpv;Z)V")
    private final void method962(class46 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class342 var8 = (class342) arg0.field596.method785((byte) 96); var8 != null; var8 = (class342) arg0.field596.method788(-27735)) {
            field1939[var3++] = var8.field5264;
            field1939[var3++] = var8.field5255;
            field1939[var3++] = var8.field5257;
            field1941[var4++] = var8.field5260;
            field1942[var6++] = (short) var8.field5266;
            field1944[var5++] = var8.field5251;
            if (arg1) {
                field1951[var7++] = var8.field5265;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)Lqs;")
    public final class50 method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
    public final boolean method146() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)I")
    public final int method160(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!qa", name = "NA", descriptor = "(IIIII)V")
    public final native void method131(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "(S)Z")
    private final boolean method963(short arg0) {
        synchronized (this) {
            class161 var3 = super.field101.method1480(arg0, 14270);
            if (var3 == null) {
                return false;
            } else {
                this.method964(arg0, var3.field2419, var3.field2404, var3.field2407, var3.field2405, var3.field2422, var3.field2410, var3.field2403, var3.field2412, var3.field2409, var3.field2425, var3.field2415, var3.field2402);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "aa", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method964(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()V")
    public final void method64() {
    }

    @OriginalMember(owner = "client!qa", name = "PA", descriptor = "(Lza;)V")
    private final native void method965(class296 arg0);

    @OriginalMember(owner = "client!qa", name = "DA", descriptor = "(IIIIII[BII)V")
    public final native void method68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
    public final boolean method97() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "()V")
    public final void method86() {
    }

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "(III[I)V")
    public final native void method92(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "ca", descriptor = "(ILma;II)V")
    public final native void method132(int arg0, class249 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)Lu;")
    public final class346 method151(int arg0) {
        class253 var2 = new class253(this, arg0);
        this.field1936.method2958(var2, (byte) 76);
        return var2;
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "()Lc;")
    public final class511 method66() {
        return this.field1952;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Ll;")
    public final class127 method103(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class205(this, this.field1935, arg0, arg1, arg2, arg3, arg4) : new class144(this, this.field1935, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class205(this, this.field1935, arg0, arg1, arg2, arg3, arg4) : new class144(this, this.field1935, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "(IIII)V")
    public final native void method59(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "()I")
    public final int method72() {
        return 4;
    }

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
    public final boolean method87() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
    public final void method56() {
    }

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "()Ln;")
    public final class392 method966() {
        for (int var1 = 0; var1 < this.field1953; ++var1) {
            if (this.field1954[var1].field5889 == Thread.currentThread()) {
                return this.field1954[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "YA", descriptor = "()I")
    public final native int method128();

    @OriginalMember(owner = "client!qa", name = "IA", descriptor = "()I")
    public final native int method80();

    @OriginalMember(owner = "client!qa", name = "ZA", descriptor = "()I")
    public final native int method110();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V")
    public final void method69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method60(arg0, arg1, arg2, arg4, arg5);
        this.method60(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method91(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method91(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
    public final void method145(int arg0) {
        this.field1954[arg0].method2358();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public final void method83(int arg0) {
        class371.method2211((byte) -63);
        this.method958(arg0);
        for (class253 var2 = (class253) this.field1936.method2957(-107); var2 != null; var2 = (class253) this.field1936.method2947(82)) {
            var2.method1509();
        }
    }

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "(Lga;II)V")
    private final native void method967(class243 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "sa", descriptor = "(S)Z")
    private final boolean method968(short arg0) {
        class243 var2 = super.field101;
        synchronized (super.field101) {
            if (!super.field101.method1482((byte) 123, arg0)) {
                return false;
            } else {
                class161 var4 = super.field101.method1480(arg0, 14270);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field2405 && var4.field2407) {
                        var6 = super.field101.method1484(91, true, 128, 0.7F, arg0, 128);
                    } else {
                        var6 = super.field101.method1481(true, 0.7F, 28907, arg0, 128, 128);
                    }
                    this.method957(arg0, var4.field2419, var4.field2404, var4.field2407, var4.field2405, var4.field2422, var4.field2410, var4.field2403, var4.field2412, var4.field2409, var4.field2425, var4.field2415, var4.field2402, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "MA", descriptor = "(I)V")
    public final native void method143(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lul;Z)Ll;")
    public final class127 method98(class319 arg0, boolean arg1) {
        int[] var3 = arg0.field4923;
        byte[] var4 = arg0.field4921;
        int var5 = arg0.field4922;
        int var6 = arg0.field4920;
        class127 var7;
        if (arg1 && arg0.field4917 == null) {
            var7 = new class67(this, this.field1935, var3, var4, 0, arg0.field4922, arg0.field4922, arg0.field4920);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field4917;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class205(this, this.field1935, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field4923[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class205(this, this.field1935, var9, 0, arg0.field4922, arg0.field4922, arg0.field4920);
                } else {
                    var7 = new class144(this, this.field1935, var9, 0, arg0.field4922, arg0.field4922, arg0.field4920);
                }
            }
        }
        var7.method464(arg0.field4918, arg0.field4925, arg0.field4919, arg0.field4924);
        return var7;
    }

    @OriginalMember(owner = "client!qa", name = "fa", descriptor = "(IIII)V")
    public final native void method159(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()Z")
    public final boolean method126() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z")
    public final boolean method112() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "()Z")
    public final boolean method113() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "EA", descriptor = "()V")
    public final native void method471();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
    public final void method116(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
    public final native void method60(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "za", descriptor = "(I[I[F)V")
    private final native void method969(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lwr;)V")
    public final void method114(int arg0, class531[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field1945[var3++] = arg1[var4].method3157(110);
            field1945[var3++] = arg1[var4].method3154(false);
            field1945[var3++] = arg1[var4].method3150((byte) 107);
            field1945[var3++] = arg1[var4].method3156(81);
            field1946[var4] = arg1[var4].method3151((byte) -28);
            field1945[var3++] = arg1[var4].method3152(7);
        }
        this.method969(arg0, field1945, field1946);
    }

    @OriginalMember(owner = "client!qa", name = "ea", descriptor = "(Lc;)V")
    public final native void method55(class511 arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILma;II)V")
    public final void method142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class249 arg6, int arg7, int arg8) {
        this.method959(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public final void method57(boolean arg0) {
    }

    @OriginalMember(owner = "client!qa", name = "AA", descriptor = "(IIII)V")
    public final native void method104(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(FF)V")
    public final native void method154(float arg0, float arg1);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()Z")
    public final boolean method65() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "ha", descriptor = "()V")
    private final void method970() {
        System.gc();
        System.runFinalization();
        class371.method2211((byte) -63);
    }

    @OriginalMember(owner = "client!qa", name = "xa", descriptor = "()F")
    public final native float method82();

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
    public final boolean method156() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "()Lc;")
    public final class511 method75() {
        return new class198();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lt;Lpv;Lc;[Lqb;I)V")
    public final void method119(class398[] arg0, class46 arg1, class511 arg2, class518[] arg3, int arg4) {
        this.method962(arg1, true);
        if (arg3 == null) {
            this.method966().method2348(this, arg0, arg2, (int[]) null, arg4, field1939, field1941, field1944, field1942, field1951, arg1.field596.method783(-27084), field1938);
        } else {
            class518 var6 = arg3[0];
            field1940[5] = 0;
            this.method966().method2348(this, arg0, arg2, field1940, arg4, field1939, field1941, field1944, field1942, field1951, arg1.field596.method783(-27084), field1938);
            var6.field7597 = field1940[0];
            var6.field7601 = field1940[1];
            var6.field7596 = field1940[2];
            var6.field7599 = field1940[3];
            var6.field7598 = field1940[4];
            var6.field7600 = field1940[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class353 var9 = (class353) arg0[var8];
                var9.method2134(var7, arg2);
                if (var9.field5429 != null) {
                    var7 += var9.field5429.length * 9;
                }
                if (var9.field5428 != null) {
                    var7 += var9.field5428.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "(IIIIII)V")
    public final native void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()I")
    public final native int method100();

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "()V")
    public final void method161() {
        if (this.field1949 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field1949.method1846();
        }
    }

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "()I")
    public final native int method115();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "()V")
    public final native void method94();

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lga;Lec;)V")
    public class131(int arg0, Canvas arg1, class243 arg2, class109 arg3) {
        super(arg0, arg2);
        try {
            if (!field1943) {
                if (arg3 != null) {
                    arg3.method841((byte) 47, this.getClass());
                    field1943 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("sw3d");
                    field1943 = Boolean.TRUE;
                }
            }
            if (!field1943) {
                throw new RuntimeException("");
            } else {
                this.method967(super.field101, 0, 0);
                class68.method478(true, 0, false);
                this.field1955 = true;
                this.field1952 = new class198();
                this.method55(new class198());
                this.method144(1);
                this.method145(0);
                if (arg1 != null) {
                    this.method129(arg1);
                    this.method108(arg1);
                }
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lqs;)V")
    public final void method148(class50 arg0) {
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
    public final void method58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method966().method2354(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "(F)V")
    public final native void method90(float arg0);

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
    public final boolean method124() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "ia", descriptor = "(II)V")
    public final native void method155(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "()Z")
    public final boolean method77() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "()Z")
    public final boolean method152() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "()V")
    public final void method139() {
        this.field1954 = null;
        this.field1949 = null;
        this.field1935 = null;
        this.field1952 = null;
        this.field1948.method3056(true);
        for (class253 var1 = (class253) this.field1936.method2957(125); var1 != null; var1 = (class253) this.field1936.method2947(-95)) {
            var1.method1510();
        }
        this.field1936.method2955(2131289328);
        this.method970();
        this.method961();
        if (this.field1955) {
            class303.method1889(false, true, (byte) 107);
            this.field1955 = false;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method99(Canvas arg0) {
        class296 var2 = (class296) this.field1948.method3059(121, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method1840(arg0, var3.width, var3.height);
        if (arg0 != null && this.field1949.field4424 == arg0) {
            this.method108(arg0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
    public final void method134(boolean arg0) {
    }

    @OriginalMember(owner = "client!qa", name = "SA", descriptor = "()Ljava/lang/Object;")
    private final Object method971() {
        return new class186();
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
    public final void method149(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lqs;Lqs;FLqs;)Lqs;")
    public final class50 method117(class50 arg0, class50 arg1, float arg2, class50 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lt;Lc;[Lqb;I)V")
    public final void method135(class398[] arg0, class511 arg1, class518[] arg2, int arg3) {
        if (arg2 == null) {
            this.method966().method2347(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class518 var5 = arg2[0];
            field1940[5] = 0;
            this.method966().method2347(this, arg0, arg1, field1940, -1, arg3);
            var5.field7597 = field1940[0];
            var5.field7601 = field1940[1];
            var5.field7596 = field1940[2];
            var5.field7599 = field1940[3];
            var5.field7598 = field1940[4];
            var5.field7600 = field1940[5] != 0;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lta;")
    public final class337 method70(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class91(this, this.field1935, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}
