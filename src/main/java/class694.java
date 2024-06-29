import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class694 extends class59 implements class532 {

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "Z")
    private boolean field9379 = false;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "Luh;")
    private class168 field9378 = new class168();

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
    private int field9382 = 4096;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    private int field9383 = 4096;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "Leq;")
    private class213 field9381 = new class213(4);

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "Z")
    private boolean field9397 = false;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "Lbca;")
    private class661 field9386;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "[I")
    private static int[] field9377 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "[F")
    private static float[] field9384 = new float[20];

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "[I")
    public static int[] field9387 = new int[6];

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "[I")
    private static int[] field9385 = field9377;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "[B")
    private static byte[] field9389 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "[I")
    private static int[] field9390 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "[F")
    private static float[] field9393 = field9384;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "[I")
    private static int[] field9394 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "[I")
    private static int[] field9391 = field9377;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "[I")
    public static int[] field9395 = field9377;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "[S")
    private static short[] field9388 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    public int field9396;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "Lp;")
    private class220 field9392;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "Lya;")
    private class52 field9376;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "Lbca;")
    private class661 field9380;

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "[La;")
    private class619[] field9398;

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method3877(class152 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
    public final void method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method226(arg0, arg1, arg2, arg4, arg5);
        this.method226(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method338(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method338(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method3878(long arg0);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)Lwh;")
    public final class149 method253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V")
    public final void method270(class415 arg0) {
        this.field9376 = (class52) arg0;
        this.method3890(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method129(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method271(int arg0, class487 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()V")
    public final void method337() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method344(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class721 {
        if (this.field9392 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9392.method1568(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z")
    public final boolean method364() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lmda;I)V")
    public final void method295(class266 arg0, int arg1) {
        this.method3885(arg0, false);
        this.method3882().method3531(this, field9391, field9390, field9394, field9388, arg0.field3774.method3042(0));
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()V")
    public final void method307() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lrh;Z)Lmi;")
    public final class496 method356(class267 arg0, boolean arg1) {
        class541 var3 = new class541(this, arg0.field3779, arg0.field3781, arg0.field3777, 0, arg0.field3784, arg0.field3784, arg0.field3778);
        var3.method1615(arg0.field3785, arg0.field3782, arg0.field3780, arg0.field3783);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method195(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
    public final void method257() {
    }

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method3879(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
    public final void method227(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method289(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
    private final void method3880() {
        System.gc();
        System.runFinalization();
        class305.method1998((byte) -33);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method235(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
    public final void method244(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Loea;[Lrh;Z)Lda;")
    public final class60 method216(class597 arg0, class267[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field3784;
            var5[var7] = arg1[var7].field3778;
            if (arg1[var7].field3777 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class664(this, this.field9376, arg0, arg1, (class496[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class17(this, this.field9376, arg0, arg1, (class496[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method3881(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z")
    public final boolean method193() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()La;")
    public final class619 method3882() {
        for (int var1 = 0; var1 < this.field9396; ++var1) {
            if (this.field9398[var1].field8434 == Thread.currentThread()) {
                return this.field9398[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method3883(class220 arg0);

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Lbca;")
    public final class661 method322() {
        return this.field9386;
    }

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
    private final boolean method3884(short arg0) {
        class152 var2 = super.field1170;
        synchronized (super.field1170) {
            if (!super.field1170.method1181(-7953, arg0)) {
                return false;
            } else {
                class739 var4 = super.field1170.method1180(arg0, -6662);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field9942 != 2) {
                        var6 = super.field1170.method1182(true, arg0, 0.7F, 128, 128, -128);
                    } else {
                        var6 = super.field1170.method1183(-21540, 128, 0.7F, arg0, true, 128);
                    }
                    this.method3886(arg0, var6, var4.field9950, var4.field9942, var4.field9955, var4.field9944, var4.field9948, var4.field9941, var4.field9943, var4.field9958, var4.field9940, var4.field9953, var4.field9951, var4.field9946, var4.field9954, var4.field9959, var4.field9957, var4.field9947, var4.field9960, var4.field9949, var4.field9945);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lmda;Z)V")
    private final void method3885(class266 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class441 var8 = (class441) arg0.field3774.method3050(8); var8 != null; var8 = (class441) arg0.field3774.method3048((byte) -79)) {
            field9391[var3++] = var8.field6271;
            field9391[var3++] = var8.field6276;
            field9391[var3++] = var8.field6269;
            field9390[var4++] = var8.field6270;
            field9388[var6++] = (short) var8.field6272;
            field9394[var5++] = var8.field6273;
            if (arg1) {
                field9389[var7++] = var8.field6275;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public final void method249(int arg0) {
        this.field9398[arg0].method3527();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
    public final void method269(int[] arg0) {
        Dimension var2 = this.field9392.field3172.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method3886(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method179(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)Lza;")
    public final class415 method261(int arg0) {
        class52 var2 = new class52(this, arg0);
        this.field9378.method1273(var2, -20180);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public final void method221(int arg0) {
        this.field9383 = this.field9382 = arg0;
        if (this.field9396 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method352(this.field9396);
            this.method249(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I")
    public final int method343(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method228(float arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method245(Canvas arg0) {
        if (this.field9392.field3172 == arg0) {
            this.method341((Canvas) null);
        }
        class220 var2 = (class220) this.field9381.method1465((long) arg0.hashCode(), -6008);
        if (var2 != null) {
            var2.method2314((byte) 110);
            var2.method1570();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class487 arg6, int arg7, int arg8) {
        this.method3892(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method614((byte) -45);
        if (this.nativeid != 0L) {
            class305.method1997(0, this);
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method3887(int arg0);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method323();

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method3888(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lmda;)V")
    public final void method208(class266 arg0) {
        if (arg0.field3774.method3042(0) != 0) {
            this.method3885(arg0, false);
            this.method3882().method3531(this, field9391, field9390, field9394, field9388, arg0.field3774.method3042(0));
        }
    }

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()I")
    public final int method318() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()V")
    public final void method251() {
        if (!this.field9379) {
            this.field9398 = null;
            this.field9392 = null;
            this.field9376 = null;
            this.field9386 = null;
            this.field9381.method1466(0);
            for (class52 var1 = (class52) this.field9378.method1269(4); var1 != null; var1 = (class52) this.field9378.method1264((byte) 36)) {
                var1.method595();
            }
            this.field9378.method1270(117);
            this.method3891();
            if (this.field9397) {
                class365.method2326(true, -110, false);
                this.field9397 = false;
            }
            this.method3880();
            class305.method1996(-108);
            this.field9379 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method280(Canvas arg0, int arg1, int arg2) {
        class220 var4 = (class220) this.field9381.method1465((long) arg0.hashCode(), -6008);
        var4.method1569(arg0, arg1, arg2);
        if (arg0 != null && this.field9392.field3172 == arg0) {
            this.method341(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
    private final boolean method3889(short arg0) {
        synchronized (this) {
            class739 var3 = super.field1170.method1180(arg0, -6662);
            if (var3 == null) {
                return false;
            } else {
                this.method3879(arg0, var3.field9950, var3.field9942, var3.field9955, var3.field9944, var3.field9948, var3.field9941, var3.field9943, var3.field9958, var3.field9940, var3.field9953, var3.field9951, var3.field9946, var3.field9954, var3.field9959, var3.field9957, var3.field9947, var3.field9960, var3.field9949, var3.field9945);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z")
    public final boolean method328() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lmi;")
    public final class496 method311(int arg0, int arg1, boolean arg2) {
        return new class541(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method324();

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method315();

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method349(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method303(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public final void method233(int arg0) {
        class305.method1998((byte) -71);
        this.method3887(arg0);
        for (class52 var2 = (class52) this.field9378.method1269(4); var2 != null; var2 = (class52) this.field9378.method1264((byte) 40)) {
            var2.method597();
        }
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(II)I")
    public final int method219(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method277(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method339();

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method332();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3882().method3519(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method220(int arg0);

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z")
    public final boolean method247() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method267(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lbh;IIII)Lka;")
    public final class472 method174(class37 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class40(this, this.field9376, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Lfia;")
    public final class575 method298() {
        return new class575(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method301(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIZ)Lmi;")
    public final class496 method231(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class541(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public final void method352(int arg0) {
        this.field9396 = arg0;
        this.field9398 = new class619[this.field9396];
        for (int var2 = 0; var2 < this.field9396; ++var2) {
            this.field9398[var2] = new class619(this, this.field9383, this.field9382);
        }
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method333(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method3890(class415 arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method259(Canvas arg0, int arg1, int arg2) {
        class220 var4 = (class220) this.field9381.method1465((long) arg0.hashCode(), -6008);
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class220 var7 = new class220(this, arg0, arg1, arg2);
            this.field9381.method1468((byte) 36, (long) arg0.hashCode(), var7);
        } else {
            if (var4.field3170 != arg1 || var4.field3173 != arg2) {
                var4.method1569(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lwh;Lwh;FLwh;)Lwh;")
    public final class149 method340(class149 arg0, class149 arg1, float arg2, class149 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method206(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z")
    public final boolean method272() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)V")
    public final void method348(int arg0, int arg1) throws class721 {
        if (this.field9392 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9392.method1567(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)Lhe;")
    public final class372 method353(int arg0, int arg1) {
        return this.method311(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lab;)V")
    public final void method329(int arg0, class669[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field9385[var3++] = arg1[var4].method3759(-1);
            field9385[var3++] = arg1[var4].method3757(123);
            field9385[var3++] = arg1[var4].method3752((byte) 103);
            field9385[var3++] = arg1[var4].method3758(-1);
            field9393[var4] = arg1[var4].method3756(-65);
            field9385[var3++] = arg1[var4].method3755(-1);
        }
        this.method3894(arg0, field9385, field9393);
    }

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method248(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method359(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
    public final void method325(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lab;")
    public final class669 method183(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class208(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method341(Canvas arg0) {
        if (arg0 != null) {
            class220 var2 = (class220) this.field9381.method1465((long) arg0.hashCode(), -6008);
            this.field9392 = var2;
            this.method3883(var2);
        } else {
            this.field9392 = null;
            this.method3883((class220) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
    public final boolean method263() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lwh;)V")
    public final void method177(class149 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Lbca;")
    public final class661 method290() {
        return new class279();
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
    public final void method312(int arg0) {
        this.field9398[arg0].method3533();
    }

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method196(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()V")
    public final void method355() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public final void method350(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class694(Canvas arg0, class152 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class98.method915(-30282, "sw3d")) {
                throw new RuntimeException("");
            } else {
                class305.method1999((byte) -128);
                this.method3877(super.field1170, 0, 0);
                class78.method721(false, true, (byte) 23);
                this.field9397 = true;
                this.field9386 = new class279();
                this.method210(new class279());
                this.method352(1);
                this.method249(0);
                if (arg0 != null) {
                    this.method259(arg0, arg2, arg3);
                    this.method341(arg0);
                }
            }
        } catch (Throwable var5) {
            this.method614((byte) 124);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method3891();

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method338(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
    public final boolean method238() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method226(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method188();

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method218(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lhe;Lvm;)Lis;")
    public final class503 method319(class372 arg0, class686 arg1) {
        return new class611(this, (class541) arg0, (class502) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lis;)V")
    public final void method302(class503 arg0) {
        class611 var2 = (class611) arg0;
        this.method3888(var2.field8364.nativeid, var2.field8365.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method299(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;")
    public final class487 method268(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class46(this, this.field9376, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Lbca;")
    public final class661 method320() {
        return this.field9380;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)V")
    public final void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3881(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method3892(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class487 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method306(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lvm;")
    public final class686 method273(int arg0, int arg1) {
        return new class502(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
    public final boolean method327() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method172(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lmi;")
    public final class496 method281(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class541(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method305();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public final void method330(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method285();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
    public final boolean method204() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
    private final Object method3893() {
        return new class388(this);
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()Z")
    public final boolean method199() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class487 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lbca;)V")
    public final void method210(class661 arg0) {
        this.field9380 = arg0;
        this.method3878(((class279) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()V")
    public final void method213() {
        this.method341(this.field9392.field3172);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class281 method262(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class668(this, this.field9376, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method186();

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method3894(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method279(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
    public final boolean method310() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()V")
    public final void method252() {
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z")
    public final boolean method291() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
    public final boolean method361() {
        return false;
    }
}
