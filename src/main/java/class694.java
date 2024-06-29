import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class694 extends class60 implements class533 {

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "Z")
    private boolean field9685 = false;

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "Lkba;")
    private class108 field9686 = new class108();

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
    private int field9698 = 4096;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
    private int field9699 = 4096;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "Lwr;")
    private class459 field9702 = new class459(4);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "Z")
    private boolean field9705 = false;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "Lhba;")
    private class10 field9701;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "[I")
    private static int[] field9684 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "[I")
    private static int[] field9688 = field9684;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "[B")
    private static byte[] field9687 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "[I")
    private static int[] field9696 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "[I")
    public static int[] field9693 = field9684;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "[F")
    private static float[] field9689 = new float[20];

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "[S")
    private static short[] field9692 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "[I")
    public static int[] field9700 = new int[6];

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "[F")
    private static float[] field9695 = field9689;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "[I")
    private static int[] field9691 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "[I")
    private static int[] field9690 = field9684;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "I")
    public int field9703;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "Lhba;")
    private class10 field9697;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "Lp;")
    private class220 field9694;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "Lya;")
    private class53 field9683;

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "[La;")
    private class618[] field9704;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method386(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method417();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public final void method345(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method398(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()Z")
    public final boolean method381() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
    public final void method458() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lcba;")
    public final class551 method374(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class527(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lcba;)V")
    public final void method449(int arg0, class551[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field9690[var3++] = arg1[var4].method3130(7019);
            field9690[var3++] = arg1[var4].method3137((byte) 115);
            field9690[var3++] = arg1[var4].method3136(28699);
            field9690[var3++] = arg1[var4].method3133(126);
            field9695[var4] = arg1[var4].method3131(false);
            field9690[var3++] = arg1[var4].method3135((byte) -78);
        }
        this.method3920(arg0, field9690, field9695);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
    public final void method369(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method402(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;")
    public final class487 method382(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class47(this, this.field9683, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
    public final boolean method375() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class694(Canvas arg0, class152 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class492.method2758("sw3d", (byte) -36)) {
                throw new RuntimeException("");
            } else {
                class280.method1681(-374);
                this.method3906(super.field636, 0, 0);
                class278.method1660(8, false, true);
                this.field9705 = true;
                this.field9701 = new class279();
                this.method367(new class279());
                this.method395(1);
                this.method431(0);
                if (arg0 != null) {
                    this.method340(arg0, arg2, arg3);
                    this.method353(arg0);
                }
            }
        } catch (Throwable var5) {
            this.method342(-1);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lku;")
    public final class379 method343(int arg0, int arg1) {
        return new class502(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lpf;Z)V")
    private final void method3904(class583 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class295 var8 = (class295) arg0.field8165.method1887((byte) 71); var8 != null; var8 = (class295) arg0.field8165.method1881(101)) {
            field9688[var3++] = var8.field3964;
            field9688[var3++] = var8.field3965;
            field9688[var3++] = var8.field3963;
            field9691[var4++] = var8.field3966;
            field9692[var6++] = (short) var8.field3968;
            field9696[var5++] = var8.field3967;
            if (arg1) {
                field9687[var7++] = var8.field3973;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method429(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class353 {
        if (this.field9694 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9694.method1245(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()Leca;")
    public final class758 method418() {
        return new class758(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method3905(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method3906(class152 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method426(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method3907(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)I")
    public final int method389(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Lhba;")
    public final class10 method410() {
        return this.field9701;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ltw;Z)Lufa;")
    public final class680 method366(class204 arg0, boolean arg1) {
        class542 var3 = new class542(this, arg0.field2417, arg0.field2416, arg0.field2422, 0, arg0.field2421, arg0.field2421, arg0.field2419);
        var3.method670(arg0.field2424, arg0.field2420, arg0.field2418, arg0.field2423);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method3908(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method370();

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
    public final void method412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3908(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lufa;")
    public final class680 method414(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class542(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method356();

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method451(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method406();

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
    public final boolean method392() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lhba;)V")
    public final void method367(class10 arg0) {
        this.field9697 = arg0;
        this.method3917(((class279) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lpf;)V")
    public final void method452(class583 arg0) {
        if (arg0.field8165.method1882(true) != 0) {
            this.method3904(arg0, false);
            this.method3918().method3490(this, field9688, field9691, field9696, field9692, arg0.field8165.method1882(true));
        }
    }

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method3909();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldi;Ldi;FLdi;)Ldi;")
    public final class128 method378(class128 arg0, class128 arg1, float arg2, class128 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z")
    public final boolean method450() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method347(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method349(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)Lza;")
    public final class416 method371(int arg0) {
        class53 var2 = new class53(this, arg0);
        this.field9686.method725(var2, -20911);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method453();

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
    public final void method390(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()V")
    public final void method439() {
    }

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method380(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()V")
    public final void method383() {
        if (!this.field9685) {
            this.field9704 = null;
            this.field9694 = null;
            this.field9683 = null;
            this.field9701 = null;
            this.field9702.method2556(-116);
            for (class53 var1 = (class53) this.field9686.method724(32); var1 != null; var1 = (class53) this.field9686.method723(88)) {
                var1.method309();
            }
            this.field9686.method728((byte) 47);
            this.method3909();
            if (this.field9705) {
                class360.method2067(true, 43, false);
                this.field9705 = false;
            }
            this.method3921();
            class280.method1679(-55);
            this.field9685 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lmv;[Ltw;Z)Lda;")
    public final class61 method425(class377 arg0, class204[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field2421;
            var5[var7] = arg1[var7].field2419;
            if (arg1[var7].field2422 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class664(this, this.field9683, arg0, arg1, (class680[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class17(this, this.field9683, arg0, arg1, (class680[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method353(Canvas arg0) {
        if (arg0 != null) {
            class220 var2 = (class220) this.field9702.method2552((long) arg0.hashCode(), -1);
            this.field9694 = var2;
            this.method3913(var2);
        } else {
            this.field9694 = null;
            this.method3913((class220) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method348(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
    private final boolean method3910(short arg0) {
        class152 var2 = super.field636;
        synchronized (super.field636) {
            if (!super.field636.method922(-126, arg0)) {
                return false;
            } else {
                class335 var4 = super.field636.method925(arg0, -28755);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field4520 != 2) {
                        var6 = super.field636.method923(arg0, (byte) -126, 128, 0.7F, true, 128);
                    } else {
                        var6 = super.field636.method927(121, 128, arg0, 0.7F, true, 128);
                    }
                    this.method3907(arg0, var6, var4.field4535, var4.field4520, var4.field4522, var4.field4518, var4.field4539, var4.field4524, var4.field4534, var4.field4533, var4.field4525, var4.field4542, var4.field4527, var4.field4537, var4.field4529, var4.field4528, var4.field4521, var4.field4536, var4.field4519, var4.field4526, var4.field4523);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method400();

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method436(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
    public final boolean method376() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public final void method384(int arg0) {
        this.field9704[arg0].method3486();
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
    public final boolean method435() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()V")
    public final void method388() {
        this.method353(this.field9694.field2841);
    }

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()I")
    public final int method455() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method358(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
    public final void method408(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)Lci;")
    public final class451 method440(int arg0, int arg1) {
        return this.method338(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
    private final boolean method3911(short arg0) {
        synchronized (this) {
            class335 var3 = super.field636.method925(arg0, -28755);
            if (var3 == null) {
                return false;
            } else {
                this.method3905(arg0, var3.field4535, var3.field4520, var3.field4522, var3.field4518, var3.field4539, var3.field4524, var3.field4534, var3.field4533, var3.field4525, var3.field4542, var3.field4527, var3.field4537, var3.field4529, var3.field4528, var3.field4521, var3.field4536, var3.field4519, var3.field4526, var3.field4523);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
    public final void method416(int arg0) {
        this.field9699 = this.field9698 = arg0;
        if (this.field9703 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method395(this.field9703);
            this.method431(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method3912(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class281 method344(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class668(this, this.field9683, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method3913(class220 arg0);

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method421(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method422(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method427(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lpf;I)V")
    public final void method397(class583 arg0, int arg1) {
        this.method3904(arg0, false);
        this.method3918().method3490(this, field9688, field9691, field9696, field9692, arg0.field8165.method1882(true));
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z")
    public final boolean method457() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method3914(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class487 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method438(int arg0);

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method442(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method3915(class416 arg0);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Lhba;")
    public final class10 method454() {
        return new class279();
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method342(-1);
        if (this.nativeid != 0L) {
            class280.method1680(false, this);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lufa;")
    public final class680 method338(int arg0, int arg1, boolean arg2) {
        return new class542(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method415();

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method459();

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class487 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
    public final boolean method456() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
    public final void method420(int[] arg0) {
        Dimension var2 = this.field9694.field2841.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method365(int arg0, class487 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
    public final void method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method347(arg0, arg1, arg2, arg4, arg5);
        this.method347(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method386(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method386(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V")
    public final void method432(class416 arg0) {
        this.field9683 = (class53) arg0;
        this.method3915(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method3916(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
    public final void method395(int arg0) {
        this.field9703 = arg0;
        this.field9704 = new class618[this.field9703];
        for (int var2 = 0; var2 < this.field9703; ++var2) {
            this.field9704[var2] = new class618(this, this.field9699, this.field9698);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)V")
    public final void method373(int arg0, int arg1) throws class353 {
        if (this.field9694 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9694.method1250(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method399(Canvas arg0) {
        if (this.field9694.field2841 == arg0) {
            this.method353((Canvas) null);
        }
        class220 var2 = (class220) this.field9702.method2552((long) arg0.hashCode(), -1);
        if (var2 != null) {
            var2.method315(115);
            var2.method1252();
        }
    }

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method460(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public final void method352(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z")
    public final boolean method377() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method3917(long arg0);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()V")
    public final void method362() {
    }

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method350(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z")
    public final boolean method404() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method434(float arg0);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)Ldi;")
    public final class128 method424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()La;")
    public final class618 method3918() {
        for (int var1 = 0; var1 < this.field9703; ++var1) {
            if (this.field9704[var1].field8662 == Thread.currentThread()) {
                return this.field9704[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
    public final boolean method346() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method385(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "(I)V")
    public final void method431(int arg0) {
        this.field9704[arg0].method3489();
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method73(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Lhba;")
    public final class10 method357() {
        return this.field9697;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Llv;IIII)Lka;")
    public final class472 method407(class446 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class40(this, this.field9683, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lci;Lku;)Lqp;")
    public final class657 method443(class451 arg0, class379 arg1) {
        return new class612(this, (class542) arg0, (class502) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
    private final Object method3919() {
        return new class390(this);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldi;)V")
    public final void method387(class128 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()Z")
    public final boolean method419() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lqp;)V")
    public final void method339(class657 arg0) {
        class612 var2 = (class612) arg0;
        this.method3916(var2.field8593.nativeid, var2.field8594.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method3920(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method354(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method340(Canvas arg0, int arg1, int arg2) {
        class220 var4 = (class220) this.field9702.method2552((long) arg0.hashCode(), -1);
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class220 var7 = new class220(this, arg0, arg1, arg2);
            this.field9702.method2558(var7, (long) arg0.hashCode(), -1);
        } else {
            if (var4.field2840 != arg1 || var4.field2843 != arg2) {
                var4.method1251(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()V")
    public final void method448() {
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method394(Canvas arg0, int arg1, int arg2) {
        class220 var4 = (class220) this.field9702.method2552((long) arg0.hashCode(), -1);
        var4.method1251(arg0, arg1, arg2);
        if (arg0 != null && this.field9694.field2841 == arg0) {
            this.method353(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
    public final boolean method423() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method433(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class487 arg6, int arg7, int arg8) {
        this.method3914(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)I")
    public final int method396(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3918().method3483(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lufa;")
    public final class680 method379(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class542(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method428(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method446();

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V")
    public final void method430(int arg0) {
        class280.method1682(0);
        this.method3912(arg0);
        for (class53 var2 = (class53) this.field9686.method724(32); var2 != null; var2 = (class53) this.field9686.method723(97)) {
            var2.method310();
        }
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()V")
    public final void method441() {
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
    private final void method3921() {
        System.gc();
        System.runFinalization();
        class280.method1682(0);
    }
}
