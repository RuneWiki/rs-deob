import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class473 extends class18 implements class65 {

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "Z")
    private boolean field6927 = false;

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "Ltf;")
    private class524 field6925 = new class524();

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    private int field6938 = 4096;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
    private int field6937 = 4096;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "Ldfa;")
    private class477 field6939 = new class477(4);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "Z")
    private boolean field6944 = false;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "Lqa;")
    private class104 field6942;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field6946 = new String[] { method3659(method3658("U[)")), method3659(method3658("EX9")), method3659(method3658("Uj\u0012\u0018\tb+\u000f\u0006\u0003ub\u001a\u000fFwg\f\u001e\u00076|\u0015\u0002\u000e6e\u0013\u0018K{d\u0012\u0019Fpd\u0012\u0002Fce\u0010\u0013\u0015e+\u000f\u0019\u000bsd\u0012\u0013Fay\u0015\u0002\u0003e+\u0015\u0002")), method3659(method3658("ym\u001a")), method3659(method3658("|j\n\u0017Hw|\bX%we\n\u0017\u0015")), method3659(method3658("en\b?\u0001xd\u000e\u00134s{\u001d\u001f\bb")), method3659(method3658("e|O\u0012")), method3659(method3658("Xd\\;2")) };

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "[I")
    private static int[] field6924 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "[B")
    private static byte[] field6929 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "[I")
    private static int[] field6932 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "[I")
    private static int[] field6931 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "[I")
    public static int[] field6928 = field6924;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "[I")
    private static int[] field6926 = field6924;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "[S")
    private static short[] field6933 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "[F")
    private static float[] field6930 = new float[20];

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "[F")
    private static float[] field6934 = field6930;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "[I")
    private static int[] field6936 = field6924;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "[I")
    public static int[] field6935 = new int[6];

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public int field6945;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "Lqa;")
    private class104 field6941;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "Lya;")
    private class770 field6923;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Lp;")
    private class780 field6940;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "[La;")
    private class695[] field6943;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
    public final boolean method137() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method124(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method208(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Ltb;")
    public final class392 method180(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class600(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method233(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method148(Canvas arg0, int arg1, int arg2) {
        class780 var4 = (class780) this.field6939.method3693(false, (long) arg0.hashCode());
        if (var4 == null) {
            try {
                Class var5 = Class.forName(field6946[4]);
                Method var6 = var5.getMethod(field6946[5], Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class780 var7 = new class780(this, arg0, arg1, arg2);
            this.field6939.method3691(var7, (long) arg0.hashCode(), -1);
        } else {
            if (var4.field11116 != arg1 || var4.field11115 != arg2) {
                var4.method5616(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()V")
    public final void method167() {
        if (!this.field6927) {
            this.field6943 = null;
            this.field6940 = null;
            this.field6923 = null;
            this.field6942 = null;
            this.field6939.method3690((byte) 127);
            for (class770 var1 = (class770) this.field6925.method3977((byte) -90); var1 != null; var1 = (class770) this.field6925.method3987(0)) {
                var1.method5554();
            }
            this.field6925.method3982(-121);
            this.method3651();
            if (this.field6944) {
                class485.method3742(false, true, -18448);
                this.field6944 = false;
            }
            this.method3655();
            class579.method4298((byte) 112);
            this.field6927 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()V")
    public final void method138() {
    }

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method3640(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)Lza;")
    public final class348 method214(int arg0) {
        class770 var2 = new class770(this, arg0);
        this.field6925.method3984(var2, 0);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lta;")
    public final class330 method142(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class557(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method122();

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method174(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method120(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
    public final void method160(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class685 arg6, int arg7, int arg8) {
        this.method3654(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method195();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkia;I)V")
    public final void method193(class788 arg0, int arg1) {
        this.method3642(arg0, false);
        this.method3641().method4987(this, field6926, field6931, field6932, field6933, arg0.field11376.method3085(31131));
    }

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "()La;")
    public final class695 method3641() {
        for (int var1 = 0; var1 < this.field6945; ++var1) {
            if (this.field6943[var1].field9733 == Thread.currentThread()) {
                return this.field6943[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()V")
    public final void method123() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lrha;IIII)Lka;")
    public final class761 method197(class60 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class163(this, this.field6923, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method213(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method187();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method168(Canvas arg0, int arg1, int arg2) {
        class780 var4 = (class780) this.field6939.method3693(false, (long) arg0.hashCode());
        var4.method5616(arg0, arg1, arg2);
        if (arg0 != null && this.field6940.field11119 == arg0) {
            this.method156(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()Lcba;")
    public final class254 method210() {
        return new class254(0, field6946[1], 1, field6946[0], 0L);
    }

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method143(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method127(float arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkia;Z)V")
    private final void method3642(class788 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class123 var8 = (class123) arg0.field11376.method3091((byte) 70); var8 != null; var8 = (class123) arg0.field11376.method3086((byte) 126)) {
            field6926[var3++] = var8.field1550;
            field6926[var3++] = var8.field1551;
            field6926[var3++] = var8.field1557;
            field6931[var4++] = var8.field1547;
            field6933[var6++] = (short) var8.field1549;
            field6932[var5++] = var8.field1558;
            if (arg1) {
                field6929[var7++] = var8.field1556;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z")
    public final boolean method158() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V")
    public final void method207(class348 arg0) {
        this.field6923 = (class770) arg0;
        this.method3657(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method239(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lbha;Lkb;)Ltha;")
    public final class296 method134(class545 arg0, class102 arg1) {
        return new class64(this, (class600) arg0, (class661) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method153(int arg0, class685 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method223(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method3643(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method3644(long arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lta;)V")
    public final void method189(int arg0, class330[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field6936[var3++] = arg1[var4].method2595((byte) 87);
            field6936[var3++] = arg1[var4].method2590((byte) 104);
            field6936[var3++] = arg1[var4].method2592(true);
            field6936[var3++] = arg1[var4].method2594((byte) 21);
            field6934[var4] = arg1[var4].method2597(2);
            field6936[var3++] = arg1[var4].method2591(11062);
        }
        this.method3643(arg0, field6936, field6934);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lqa;)V")
    public final void method204(class104 arg0) {
        this.field6941 = arg0;
        this.method3644(((class729) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method235(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method3645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public final void method151(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
    private final boolean method3646(short arg0) {
        class673 var2 = super.field237;
        synchronized (super.field237) {
            if (!super.field237.method4504(arg0, -31410)) {
                return false;
            } else {
                class684 var4 = super.field237.method4500(-23641, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field9584 != 2) {
                        var6 = super.field237.method4502(0.7F, 128, -122, 128, arg0, true);
                    } else {
                        var6 = super.field237.method4499(128, 128, -7994, true, 0.7F, arg0);
                    }
                    this.method3640(arg0, var6, var4.field9596, var4.field9584, var4.field9605, var4.field9600, var4.field9588, var4.field9599, var4.field9589, var4.field9602, var4.field9598, var4.field9592, var4.field9583, var4.field9586, var4.field9587, var4.field9601, var4.field9590, var4.field9597, var4.field9585, var4.field9582, var4.field9593);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
    private final Object method3647() {
        return new class68(this);
    }

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method232(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()Lqa;")
    public final class104 method221() {
        return new class729();
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z")
    public final boolean method140() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()I")
    public final int method198() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method3648(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method229(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method141(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I")
    public final int method226(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
    public final void method130(int arg0) {
        this.field6943[arg0].method5003();
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
    public final boolean method166() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()V")
    public final void method234() {
        this.method156(this.field6940.field11119);
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()V")
    public final void method238() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public final void method178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3641().method5007(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method240();

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method169();

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public final void method218(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method119(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method227(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class685 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z")
    public final boolean method133() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Lqa;")
    public final class104 method129() {
        return this.field6941;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ltha;)V")
    public final void method165(class296 arg0) {
        class64 var2 = (class64) arg0;
        this.method3652(var2.field973.nativeid, var2.field974.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method3649(class673 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
    public final void method199(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
    private final boolean method3650(short arg0) {
        synchronized (this) {
            class684 var3 = super.field237.method4500(-23641, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method3648(arg0, var3.field9596, var3.field9584, var3.field9605, var3.field9600, var3.field9588, var3.field9599, var3.field9589, var3.field9602, var3.field9598, var3.field9592, var3.field9583, var3.field9586, var3.field9587, var3.field9601, var3.field9590, var3.field9597, var3.field9585, var3.field9582, var3.field9593);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method171(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method139();

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z")
    public final boolean method172() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method690(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
    public final int method194(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z")
    public final boolean method217() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class751 method206(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class310(this, this.field6923, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)Lkb;")
    public final class102 method191(int arg0, int arg1) {
        return new class661(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method243(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public final void method146(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method3651();

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
    public final boolean method202() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method220(Canvas arg0) {
        if (this.field6940.field11119 == arg0) {
            this.method156((Canvas) null);
        }
        class780 var2 = (class780) this.field6939.method3693(false, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method4294(0);
            var2.method5612();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
    public final boolean method164() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lcd;[Lcu;Z)Lda;")
    public final class216 method145(class161 arg0, class66[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field981;
            var5[var7] = arg1[var7].field977;
            if (arg1[var7].field976 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException(field6946[2]);
            } else {
                return new class666(this, this.field6923, arg0, arg1, (class392[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException(field6946[2]);
        } else {
            return new class519(this, this.field6923, arg0, arg1, (class392[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
    public final void method170(int[] arg0) {
        Dimension var2 = this.field6940.field11119.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method3652(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method149(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z")
    public final boolean method186() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkia;)V")
    public final void method126(class788 arg0) {
        if (arg0.field11376.method3085(31131) != 0) {
            this.method3642(arg0, false);
            this.method3641().method4987(this, field6926, field6931, field6932, field6933, arg0.field11376.method3085(31131));
        }
    }

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method150(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()V")
    public final void method163() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lsn;)V")
    public final void method228(class369 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method213(arg0, arg1, arg2, arg4, arg5);
        this.method213(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method124(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method124(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)Lsn;")
    public final class369 method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Ltb;")
    public final class392 method196(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class600(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
    public final boolean method215() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method3653(class780 arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;")
    public final class685 method236(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class636(this, this.field6923, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Ltb;")
    public final class392 method222(int arg0, int arg1, boolean arg2) {
        return new class600(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()V")
    public final void method135() {
    }

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method230(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
    public final void method154(int arg0) {
        this.field6938 = this.field6937 = arg0;
        if (this.field6945 > 1) {
            throw new IllegalStateException(field6946[7]);
        } else {
            this.method203(this.field6945);
            this.method205(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method184();

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method3654(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class685 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method225();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lcu;Z)Ltb;")
    public final class392 method231(class66 arg0, boolean arg1) {
        class600 var3 = new class600(this, arg0.field979, arg0.field982, arg0.field976, 0, arg0.field981, arg0.field981, arg0.field977);
        var3.method1379(arg0.field984, arg0.field983, arg0.field978, arg0.field980);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lsn;Lsn;FLsn;)Lsn;")
    public final class369 method155(class369 arg0, class369 arg1, float arg2, class369 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z")
    public final boolean method181() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)V")
    public final void method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3645(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(II)Lbha;")
    public final class545 method179(int arg0, int arg1) {
        return this.method222(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method156(Canvas arg0) {
        if (arg0 != null) {
            class780 var2 = (class780) this.field6939.method3693(false, (long) arg0.hashCode());
            this.field6940 = var2;
            this.method3653(var2);
        } else {
            this.field6940 = null;
            this.method3653((class780) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
    private final void method3655() {
        System.gc();
        System.runFinalization();
        class579.method4300((byte) -105);
    }

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public final void method205(int arg0) {
        this.field6943[arg0].method4997();
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Lqa;")
    public final class104 method136() {
        return this.field6942;
    }

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
    public final boolean method125() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)V")
    public final void method132(int arg0, int arg1) throws class142 {
        if (this.field6940 == null) {
            throw new IllegalStateException(field6946[3]);
        } else {
            this.field6940.method5613(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method3656(int arg0);

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method157();

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V")
    public final void method175(int arg0) {
        class579.method4300((byte) -105);
        this.method3656(arg0);
        for (class770 var2 = (class770) this.field6925.method3977((byte) -82); var2 != null; var2 = (class770) this.field6925.method3987(0)) {
            var2.method5553();
        }
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method177((byte) -87);
        if (this.nativeid != 0L) {
            class579.method4297(this, -75);
        }
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()Z")
    public final boolean method216() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class473(Canvas arg0, class673 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class743.method5382(field6946[6], true)) {
                throw new RuntimeException("");
            } else {
                class579.method4299(0);
                this.method3649(super.field237, 0, 0);
                class445.method3458(true, (byte) 22, false);
                this.field6944 = true;
                this.field6942 = new class729();
                this.method204(new class729());
                this.method203(1);
                this.method205(0);
                if (arg0 != null) {
                    this.method148(arg0, arg2, arg3);
                    this.method156(arg0);
                }
            }
        } catch (Throwable var5) {
            this.method177((byte) -87);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method209(int arg0);

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method3657(class348 arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public final void method203(int arg0) {
        this.field6945 = arg0;
        this.field6943 = new class695[this.field6945];
        for (int var2 = 0; var2 < this.field6945; ++var2) {
            this.field6943[var2] = new class695(this, this.field6938, this.field6937);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method224(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class142 {
        if (this.field6940 == null) {
            throw new IllegalStateException(field6946[3]);
        } else {
            this.field6940.method5618(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3658(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 102);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3659(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 22;
                    break;
                case 1:
                    var10005 = 11;
                    break;
                case 2:
                    var10005 = 124;
                    break;
                case 3:
                    var10005 = 118;
                    break;
                default:
                    var10005 = 102;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
