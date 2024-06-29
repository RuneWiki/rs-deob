import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class406 extends class545 implements class2 {

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "Z")
    private boolean field5634 = false;

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "Lfha;")
    private class522 field5626 = new class522();

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
    private int field5639 = 4096;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    private int field5644 = 4096;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "Lgca;")
    private class209 field5641 = new class209(4);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "Z")
    private boolean field5647 = false;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "Luha;")
    private class723 field5643;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "[I")
    private static int[] field5625 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "[I")
    private static int[] field5627 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "[I")
    public static int[] field5633 = field5625;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "[I")
    private static int[] field5628 = field5625;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "[I")
    private static int[] field5631 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "[B")
    private static byte[] field5635 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "[I")
    public static int[] field5629 = new int[6];

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "[S")
    private static short[] field5637 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "[F")
    private static float[] field5638 = new float[20];

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "[I")
    private static int[] field5636 = field5625;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "[F")
    private static float[] field5632 = field5638;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "I")
    public int field5645;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "Lp;")
    private class106 field5640;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "Luha;")
    private class723 field5642;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "Lya;")
    private class74 field5630;

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "[La;")
    private class166[] field5646;

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method2081(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V")
    public final void method2071(int arg0) {
        this.field5646[arg0].method1031();
    }

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method2186(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method2211(Canvas arg0) {
        if (this.field5640.field1543 == arg0) {
            this.method2095((Canvas) null);
        }
        class106 var2 = (class106) this.field5641.method1381(true, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method3065(-17363);
            var2.method725();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public final void method559(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I")
    public final int method2101(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
    private final Object method2464() {
        return new class309(this);
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
    public final void method2178(int arg0) {
        this.field5646[arg0].method1047();
    }

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method2151(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public final void method2098(int arg0) {
        this.field5644 = this.field5639 = arg0;
        if (this.field5645 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method2147(this.field5645);
            this.method2071(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method2224(Canvas arg0, int arg1, int arg2) {
        class106 var4 = (class106) this.field5641.method1381(true, (long) arg0.hashCode());
        var4.method723(arg0, arg1, arg2);
        if (arg0 != null && this.field5640.field1543 == arg0) {
            this.method2095(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()Z")
    public final boolean method2100() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method622(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class425 {
        if (this.field5640 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field5640.method721(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method2160();

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public final void method2073(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method2201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)V")
    public final void method632(int arg0, int arg1) throws class425 {
        if (this.field5640 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field5640.method720(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
    private final boolean method2465(short arg0) {
        class268 var2 = super.field7694;
        synchronized (super.field7694) {
            if (!super.field7694.method86((byte) 117, arg0)) {
                return false;
            } else {
                class468 var4 = super.field7694.method91(arg0, -22805);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field6393 != 2) {
                        var6 = super.field7694.method87(true, 128, 0.7F, 128, true, arg0);
                    } else {
                        var6 = super.field7694.method89(0.7F, true, true, 128, arg0, 128);
                    }
                    this.method2477(arg0, var6, var4.field6394, var4.field6393, var4.field6386, var4.field6398, var4.field6392, var4.field6391, var4.field6381, var4.field6399, var4.field6388, var4.field6390, var4.field6389, var4.field6383, var4.field6385, var4.field6387, var4.field6380, var4.field6397, var4.field6379, var4.field6400, var4.field6384);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()La;")
    public final class166 method2466() {
        for (int var1 = 0; var1 < this.field5645; ++var1) {
            if (this.field5646[var1].field2266 == Thread.currentThread()) {
                return this.field5646[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)Lcd;")
    public final class22 method2134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
    public final void method2147(int arg0) {
        this.field5645 = arg0;
        this.field5646 = new class166[this.field5645];
        for (int var2 = 0; var2 < this.field5645; ++var2) {
            this.field5646[var2] = new class166(this, this.field5644, this.field5639);
        }
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "(I)Lza;")
    public final class256 method2226(int arg0) {
        class74 var2 = new class74(this, arg0);
        this.field5626.method3116(29066, var2);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
    public final boolean method2086() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z")
    public final boolean method2162() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method2467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class571 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()V")
    public final void method617() {
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Lgba;")
    public final class702 method568() {
        return new class702(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method2468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
    public final void method570(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lcd;)V")
    public final void method2136(class22 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method2131(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method2137(Canvas arg0, int arg1, int arg2) {
        class106 var4 = (class106) this.field5641.method1381(true, (long) arg0.hashCode());
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class106 var7 = new class106(this, arg0, arg1, arg2);
            this.field5641.method1387(var7, (long) arg0.hashCode(), (byte) -125);
        } else {
            if (var4.field1540 != arg1 || var4.field1542 != arg2) {
                var4.method723(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method2469(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lev;I)V")
    public final void method2112(class347 arg0, int arg1) {
        this.method2480(arg0, false);
        this.method2466().method1026(this, field5628, field5627, field5631, field5637, arg0.field4410.method2960(0));
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method2221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class571 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
    private final boolean method2470(short arg0) {
        synchronized (this) {
            class468 var3 = super.field7694.method91(arg0, -22805);
            if (var3 == null) {
                return false;
            } else {
                this.method2479(arg0, var3.field6394, var3.field6393, var3.field6386, var3.field6398, var3.field6392, var3.field6391, var3.field6381, var3.field6399, var3.field6388, var3.field6390, var3.field6389, var3.field6383, var3.field6385, var3.field6387, var3.field6380, var3.field6397, var3.field6379, var3.field6400, var3.field6384);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)Lmp;")
    public final class315 method628(int arg0, int arg1) {
        return new class601(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method2191(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lcw;")
    public final class21 method2113(int arg0, int arg1, boolean arg2) {
        return new class307(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lhs;Lmp;)Lcha;")
    public final class279 method584(class358 arg0, class315 arg1) {
        return new class588(this, (class307) arg0, (class601) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class406(Canvas arg0, class268 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class389.method2365("sw3d", (byte) -109)) {
                throw new RuntimeException("");
            } else {
                class301.method1764((byte) 45);
                this.method2475(super.field7694, 0, 0);
                class594.method3523(false, (byte) -127, true);
                this.field5647 = true;
                this.field5643 = new class135();
                this.method2068(new class135());
                this.method2147(1);
                this.method2071(0);
                if (arg0 != null) {
                    this.method2137(arg0, arg2, arg3);
                    this.method2095(arg0);
                }
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lcw;")
    public final class21 method2119(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class307(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method614(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()V")
    public final void method589() {
    }

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method2069(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
    public final boolean method2174() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()Z")
    public final boolean method569() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method2471();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;")
    public final class571 method2092(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class277(this, this.field5630, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method2223();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkda;IIII)Lka;")
    public final class283 method2222(class64 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class246(this, this.field5630, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method572(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
    public final boolean method2214() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
    public final boolean method2140() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
    public final boolean method2170() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method2179();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class339 method2213(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class508(this, this.field5630, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
    public final boolean method2079() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method2090(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method2093(int arg0, class571 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method2091(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method2195(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
    public final void method2149(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
    public final int method2105(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method2472(class256 arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lkb;")
    public final class757 method2225(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class465(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public final void method639(int arg0) {
        class301.method1767(0);
        this.method2473(arg0);
        for (class74 var2 = (class74) this.field5626.method3118((byte) 73); var2 != null; var2 = (class74) this.field5626.method3111(117)) {
            var2.method463();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public final void method2188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2466().method1055(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method3(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z")
    public final boolean method608() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
    public final boolean method2180() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
    public final void method625() {
    }

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method610();

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method2115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method2095(Canvas arg0) {
        if (arg0 != null) {
            class106 var2 = (class106) this.field5641.method1381(true, (long) arg0.hashCode());
            this.field5640 = var2;
            this.method2476(var2);
        } else {
            this.field5640 = null;
            this.method2476((class106) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Lhs;")
    public final class358 method600(int arg0, int arg1) {
        return this.method2113(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method2148(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method563(int arg0);

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Luha;")
    public final class723 method2087() {
        return this.field5643;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method2473(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Loq;[Ltba;Z)Lda;")
    public final class400 method2085(class742 arg0, class320[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field4122;
            var5[var7] = arg1[var7].field4121;
            if (arg1[var7].field4124 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class580(this, this.field5630, arg0, arg1, (class21[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class727(this, this.field5630, arg0, arg1, (class21[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lcw;")
    public final class21 method2070(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class307(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method2474(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method2200();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method2110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method2143(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method2072(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class571 arg6, int arg7, int arg8) {
        this.method2467(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method590(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()Luha;")
    public final class723 method2135() {
        return this.field5642;
    }

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method2163(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method593();

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()I")
    public final int method2124() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method2173(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ltba;Z)Lcw;")
    public final class21 method2126(class320 arg0, boolean arg1) {
        class307 var3 = new class307(this, arg0.field4128, arg0.field4125, arg0.field4124, 0, arg0.field4122, arg0.field4122, arg0.field4121);
        var3.method106(arg0.field4127, arg0.field4123, arg0.field4126, arg0.field4120);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
    public final boolean method2157() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method3253(-6102);
        if (this.nativeid != 0L) {
            class301.method1765(this, 0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method2475(class268 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method2476(class106 arg0);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method2156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Luha;")
    public final class723 method2141() {
        return new class135();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Luha;)V")
    public final void method2068(class723 arg0) {
        this.field5642 = arg0;
        this.method2481(((class135) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
    public final void method2127(int[] arg0) {
        Dimension var2 = this.field5640.field1543.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method2477(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
    private final void method2478() {
        System.gc();
        System.runFinalization();
        class301.method1767(0);
    }

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method2198();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lkb;)V")
    public final void method2106(int arg0, class757[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field5636[var3++] = arg1[var4].method4203(20918);
            field5636[var3++] = arg1[var4].method4212(-54);
            field5636[var3++] = arg1[var4].method4205((byte) 8);
            field5636[var3++] = arg1[var4].method4206((byte) 109);
            field5632[var4] = arg1[var4].method4211((byte) 81);
            field5636[var3++] = arg1[var4].method4209((byte) -66);
        }
        this.method2474(arg0, field5636, field5632);
    }

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()V")
    public final void method556() {
    }

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method2097(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method2479(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lcd;Lcd;FLcd;)Lcd;")
    public final class22 method631(class22 arg0, class22 arg1, float arg2, class22 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method2104(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lev;Z)V")
    private final void method2480(class347 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class387 var8 = (class387) arg0.field4410.method2963(-86); var8 != null; var8 = (class387) arg0.field4410.method2958((byte) 122)) {
            field5628[var3++] = var8.field5402;
            field5628[var3++] = var8.field5411;
            field5628[var3++] = var8.field5404;
            field5627[var4++] = var8.field5407;
            field5637[var6++] = (short) var8.field5401;
            field5631[var5++] = var8.field5406;
            if (arg1) {
                field5635[var7++] = var8.field5408;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method2132(float arg0);

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()V")
    public final void method587() {
        if (!this.field5634) {
            this.field5646 = null;
            this.field5640 = null;
            this.field5630 = null;
            this.field5643 = null;
            this.field5641.method1385((byte) -97);
            for (class74 var1 = (class74) this.field5626.method3118((byte) 73); var1 != null; var1 = (class74) this.field5626.method3111(125)) {
                var1.method464();
            }
            this.field5626.method3122(0);
            this.method2471();
            if (this.field5647) {
                class729.method4066(true, false, -2679);
                this.field5647 = false;
            }
            this.method2478();
            class301.method1766(89);
            this.field5634 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method2161(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public final void method574(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method2123(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
    public final void method2166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2173(arg0, arg1, arg2, arg4, arg5);
        this.method2173(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method2191(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method2191(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
    public final void method2168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2468(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method2481(long arg0);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()V")
    public final void method635() {
        this.method2095(this.field5640.field1543);
    }

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method2189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lev;)V")
    public final void method2122(class347 arg0) {
        if (arg0.field4410.method2960(0) != 0) {
            this.method2480(arg0, false);
            this.method2466().method1026(this, field5628, field5627, field5631, field5637, arg0.field4410.method2960(0));
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lcha;)V")
    public final void method595(class279 arg0) {
        class588 var2 = (class588) arg0;
        this.method2469(var2.field8440.nativeid, var2.field8439.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method2194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z")
    public final boolean method2099() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V")
    public final void method2177(class256 arg0) {
        this.field5630 = (class74) arg0;
        this.method2472(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method2107();

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method2230();

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()V")
    public final void method2203() {
    }
}
