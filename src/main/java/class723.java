import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class723 extends class66 implements class560 {

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Z")
    private boolean field9922 = false;

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "Ljia;")
    private class645 field9924 = new class645();

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
    private int field9939 = 4096;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "I")
    private int field9937 = 4096;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "Lcja;")
    private class46 field9936 = new class46(4);

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "Z")
    private boolean field9944 = false;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "Lsk;")
    private class650 field9940;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "[I")
    private static int[] field9925 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "[I")
    private static int[] field9928 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "[I")
    public static int[] field9926 = new int[6];

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "[B")
    private static byte[] field9927 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "[I")
    public static int[] field9929 = field9925;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "[I")
    private static int[] field9931 = field9925;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "[I")
    private static int[] field9932 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "[I")
    private static int[] field9934 = field9925;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "[F")
    private static float[] field9933 = new float[20];

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "[F")
    private static float[] field9930 = field9933;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "[S")
    private static short[] field9935 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
    public int field9942;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "Lp;")
    private class232 field9941;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Lya;")
    private class59 field9923;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "Lsk;")
    private class650 field9938;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "[La;")
    private class646[] field9943;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
    public final boolean method485() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
    public final boolean method566() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method591(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()V")
    public final void method489() {
    }

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method480(float arg0);

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method550(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()Lsk;")
    public final class650 method539() {
        return this.field9938;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lgs;Z)Lnf;")
    public final class604 method498(class49 arg0, boolean arg1) {
        class569 var3 = new class569(this, arg0.field739, arg0.field743, arg0.field737, 0, arg0.field745, arg0.field745, arg0.field741);
        var3.method213(arg0.field744, arg0.field738, arg0.field740, arg0.field742);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method477(Canvas arg0, int arg1, int arg2) {
        class232 var4 = (class232) this.field9936.method337((long) arg0.hashCode(), 1);
        var4.method1574(arg0, arg1, arg2);
        if (arg0 != null && this.field9941.field3363 == arg0) {
            this.method559(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method559(Canvas arg0) {
        if (arg0 != null) {
            class232 var2 = (class232) this.field9936.method337((long) arg0.hashCode(), 1);
            this.field9941 = var2;
            this.method4005(var2);
        } else {
            this.field9941 = null;
            this.method4005((class232) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
    private final Object method4000() {
        return new class409(this);
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method511(int arg0, class514 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method4001(class437 arg0);

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method484(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method520(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method530(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()V")
    public final void method543() {
        if (!this.field9922) {
            this.field9943 = null;
            this.field9941 = null;
            this.field9923 = null;
            this.field9940 = null;
            this.field9936.method338((byte) -107);
            for (class59 var1 = (class59) this.field9924.method3589((byte) -128); var1 != null; var1 = (class59) this.field9924.method3591(0)) {
                var1.method414();
            }
            this.field9924.method3590((byte) -112);
            this.method4017();
            if (this.field9944) {
                class660.method3712((byte) -109, false, true);
                this.field9944 = false;
            }
            this.method4004();
            class86.method689((byte) -81);
            this.field9922 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method515(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method4002(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
    public final void method500(int arg0) {
        this.field9943[arg0].method3601();
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)Lza;")
    public final class437 method579(int arg0) {
        class59 var2 = new class59(this, arg0);
        this.field9924.method3594((byte) -53, var2);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method560(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class789 {
        if (this.field9941 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9941.method1572(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()V")
    public final void method541() {
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z")
    public final boolean method524() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lbq;")
    public final class307 method531(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class390(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public final void method481(int arg0) {
        class86.method688(true);
        this.method4011(arg0);
        for (class59 var2 = (class59) this.field9924.method3589((byte) -127); var2 != null; var2 = (class59) this.field9924.method3591(0)) {
            var2.method415();
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
    public final void method508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method4003(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method4003(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
    public final void method545(int arg0) {
        this.field9943[arg0].method3611();
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
    private final void method4004() {
        System.gc();
        System.runFinalization();
        class86.method688(true);
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
    public final void method573(int arg0) {
        this.field9942 = arg0;
        this.field9943 = new class646[this.field9942];
        for (int var2 = 0; var2 < this.field9942; ++var2) {
            this.field9943[var2] = new class646(this, this.field9939, this.field9937);
        }
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
    public final boolean method534() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method131(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method4005(class232 arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkc;[Lgs;Z)Lda;")
    public final class67 method476(class145 arg0, class49[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field745;
            var5[var7] = arg1[var7].field741;
            if (arg1[var7].field737 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class693(this, this.field9923, arg0, arg1, (class604[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class19(this, this.field9923, arg0, arg1, (class604[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()Lsk;")
    public final class650 method533() {
        return this.field9940;
    }

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method567(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lsk;)V")
    public final void method503(class650 arg0) {
        this.field9938 = arg0;
        this.method4014(((class294) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method552();

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z")
    public final boolean method578() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lmf;I)V")
    public final void method474(class442 arg0, int arg1) {
        this.method4016(arg0, false);
        this.method4008().method3605(this, field9931, field9928, field9932, field9935, arg0.field5985.method3848(0));
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public final void method487(int arg0) {
        this.field9939 = this.field9937 = arg0;
        if (this.field9942 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method573(this.field9942);
            this.method545(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;")
    public final class514 method517(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class51(this, this.field9923, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8) {
        this.method4012(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method490(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method547(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
    public final void method583(int[] arg0) {
        Dimension var2 = this.field9941.field3363.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method4006(class162 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V")
    public final void method475(class437 arg0) {
        this.field9923 = (class59) arg0;
        this.method4001(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method488(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method499(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public final void method473(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
    public final boolean method479() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method553();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lnf;")
    public final class604 method549(int arg0, int arg1, boolean arg2) {
        return new class569(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()V")
    public final void method581() {
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
    public final boolean method577() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldc;IIII)Lka;")
    public final class499 method505(class5 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class44(this, this.field9923, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()V")
    public final void method548() {
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
    private final boolean method4007(short arg0) {
        synchronized (this) {
            class311 var3 = super.field970.method1270(arg0, true);
            if (var3 == null) {
                return false;
            } else {
                this.method4010(arg0, var3.field4239, var3.field4242, var3.field4250, var3.field4249, var3.field4246, var3.field4248, var3.field4241, var3.field4236, var3.field4251, var3.field4243, var3.field4244, var3.field4233, var3.field4245, var3.field4235, var3.field4253, var3.field4238, var3.field4232, var3.field4234, var3.field4240);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lbq;)V")
    public final void method542(int arg0, class307[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field9934[var3++] = arg1[var4].method1962(0);
            field9934[var3++] = arg1[var4].method1961(-128);
            field9934[var3++] = arg1[var4].method1958(true);
            field9934[var3++] = arg1[var4].method1963((byte) 111);
            field9930[var4] = arg1[var4].method1966((byte) -58);
            field9934[var3++] = arg1[var4].method1965(0);
        }
        this.method4009(arg0, field9934, field9930);
    }

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method502(int arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method574(Canvas arg0, int arg1, int arg2) {
        class232 var4 = (class232) this.field9936.method337((long) arg0.hashCode(), 1);
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class232 var7 = new class232(this, arg0, arg1, arg2);
            this.field9936.method341((long) arg0.hashCode(), var7, (byte) 96);
        } else {
            if (var4.field3361 != arg1 || var4.field3362 != arg2) {
                var4.method1574(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()La;")
    public final class646 method4008() {
        for (int var1 = 0; var1 < this.field9942; ++var1) {
            if (this.field9943[var1].field8933 == Thread.currentThread()) {
                return this.field9943[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method569(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method572();

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method4009(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method594(0);
        if (this.nativeid != 0L) {
            class86.method690(this, (byte) 14);
        }
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z")
    public final boolean method584() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIZ)Lnf;")
    public final class604 method523(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class569(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method538();

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method494();

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method512(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method496();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
    public final void method501(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)Lgh;")
    public final class575 method562(int arg0, int arg1) {
        return this.method549(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method509(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method4010(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)V")
    public final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method591(arg0, arg1, arg2, arg4, arg5);
        this.method591(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method551(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method551(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method4011(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
    public final int method482(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lel;)V")
    public final void method527(class574 arg0) {
        class638 var2 = (class638) arg0;
        this.method4002(var2.field8796.nativeid, var2.field8795.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z")
    public final boolean method592() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z")
    public final boolean method595() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Laja;")
    public final class100 method586() {
        return new class100(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public final void method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method4008().method3615(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method521(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method4012(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class723(Canvas arg0, class162 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class35.method208((byte) -75, "sw3d")) {
                throw new RuntimeException("");
            } else {
                class86.method687(113);
                this.method4006(super.field970, 0, 0);
                class184.method1371(-2526, true, false);
                this.field9944 = true;
                this.field9940 = new class294();
                this.method503(new class294());
                this.method573(1);
                this.method545(0);
                if (arg0 != null) {
                    this.method574(arg0, arg2, arg3);
                    this.method559(arg0);
                }
            }
        } catch (Throwable var5) {
            this.method594(0);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method4013(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lgh;Loq;)Lel;")
    public final class574 method546(class575 arg0, class380 arg1) {
        return new class638(this, (class569) arg0, (class529) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
    public final boolean method585() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method590(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Loq;")
    public final class380 method540(int arg0, int arg1) {
        return new class529(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method4014(long arg0);

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method536(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class296 method589(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class697(this, this.field9923, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Len;)V")
    public final void method596(class339 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lnf;")
    public final class604 method587(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class569(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
    public final void method507(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()I")
    public final int method493() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method557(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
    private final boolean method4015(short arg0) {
        class162 var2 = super.field970;
        synchronized (super.field970) {
            if (!super.field970.method1274(arg0, 21532)) {
                return false;
            } else {
                class311 var4 = super.field970.method1270(arg0, true);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field4242 != 2) {
                        var6 = super.field970.method1269(0.7F, 128, true, arg0, 128, true);
                    } else {
                        var6 = super.field970.method1272(128, arg0, 0.7F, 128, (byte) 81, true);
                    }
                    this.method4013(arg0, var6, var4.field4239, var4.field4242, var4.field4250, var4.field4249, var4.field4246, var4.field4248, var4.field4241, var4.field4236, var4.field4251, var4.field4243, var4.field4244, var4.field4233, var4.field4245, var4.field4235, var4.field4253, var4.field4238, var4.field4232, var4.field4234, var4.field4240);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lmf;Z)V")
    private final void method4016(class442 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class400 var8 = (class400) arg0.field5985.method3852((byte) -117); var8 != null; var8 = (class400) arg0.field5985.method3847((byte) 27)) {
            field9931[var3++] = var8.field5516;
            field9931[var3++] = var8.field5514;
            field9931[var3++] = var8.field5509;
            field9928[var4++] = var8.field5517;
            field9935[var6++] = (short) var8.field5511;
            field9932[var5++] = var8.field5518;
            if (arg1) {
                field9927[var7++] = var8.field5513;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)V")
    public final void method561(int arg0, int arg1) throws class789 {
        if (this.field9941 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9941.method1569(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
    public final boolean method570() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Len;Len;FLen;)Len;")
    public final class339 method535(class339 arg0, class339 arg1, float arg2, class339 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method516(Canvas arg0) {
        if (this.field9941.field3363 == arg0) {
            this.method559((Canvas) null);
        }
        class232 var2 = (class232) this.field9936.method337((long) arg0.hashCode(), 1);
        if (var2 != null) {
            var2.method1207(106);
            var2.method1575();
        }
    }

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method575();

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method563();

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method551(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method497();

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method580(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method4017();

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()V")
    public final void method506() {
        this.method559(this.field9941.field3363);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public final void method486(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
    public final boolean method588() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()Lsk;")
    public final class650 method565() {
        return new class294();
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)Len;")
    public final class339 method564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public final void method514(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(II)I")
    public final int method593(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()V")
    public final void method558() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lmf;)V")
    public final void method478(class442 arg0) {
        if (arg0.field5985.method3848(0) != 0) {
            this.method4016(arg0, false);
            this.method4008().method3605(this, field9931, field9928, field9932, field9935, arg0.field5985.method3848(0));
        }
    }
}
