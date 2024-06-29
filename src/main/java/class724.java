import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class724 extends class65 implements class559 {

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "Z")
    private boolean field10076 = false;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Ltm;")
    private class412 field10077 = new class412();

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "I")
    private int field10084 = 4096;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "I")
    private int field10094 = 4096;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "Lee;")
    private class706 field10091 = new class706(4);

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "Z")
    private boolean field10095 = false;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "Luu;")
    private class303 field10085;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "[I")
    private static int[] field10078 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "[I")
    public static int[] field10079 = new int[6];

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "[I")
    private static int[] field10080 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "[B")
    private static byte[] field10081 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "[I")
    private static int[] field10088 = field10078;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "[I")
    private static int[] field10089 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "[S")
    private static short[] field10087 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "[I")
    private static int[] field10092 = field10078;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "[F")
    private static float[] field10082 = new float[20];

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "[F")
    private static float[] field10083 = field10082;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "[I")
    public static int[] field10090 = field10078;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "I")
    public int field10097;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "Lp;")
    private class231 field10093;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "Luu;")
    private class303 field10086;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Lya;")
    private class58 field10075;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "[La;")
    private class646[] field10096;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
    public final void method568() {
    }

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method456(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)V")
    public final void method559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method4035(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method4030(class437 arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
    public final void method541(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method4031(int arg0);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)Lbfa;")
    public final class390 method528(int arg0, int arg1) {
        return this.method508(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method556(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldn;Ldn;FLdn;)Ldn;")
    public final class544 method497(class544 arg0, class544 arg1, float arg2, class544 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lbfa;Ltq;)Lvv;")
    public final class345 method566(class390 arg0, class656 arg1) {
        return new class638(this, (class568) arg0, (class529) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
    public final void method512(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
    public final boolean method542() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public final void method493(int arg0) {
        this.field10096[arg0].method3594();
    }

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method552(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
    private final void method4032() {
        System.gc();
        System.runFinalization();
        class552.method3123((byte) -43);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method448(Canvas arg0, int arg1, int arg2) {
        class231 var4 = (class231) this.field10091.method3953((long) arg0.hashCode(), 14);
        var4.method1515(arg0, arg1, arg2);
        if (arg0 != null && this.field10093.field3149 == arg0) {
            this.method460(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()V")
    public final void method511() {
        this.method460(this.field10093.field3149);
    }

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method543();

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method4033(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
    public final int method498(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method533(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
    public final boolean method560() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
    public final boolean method513() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method457();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lef;)V")
    public final void method524(class515 arg0) {
        if (arg0.field7049.method634((byte) 101) != 0) {
            this.method4036(arg0, false);
            this.method4037().method3611(this, field10092, field10080, field10089, field10087, arg0.field7049.method634((byte) 104));
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
    public final void method561(int[] arg0) {
        Dimension var2 = this.field10093.field3149.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method4034(long arg0);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Luu;")
    public final class303 method472() {
        return new class294();
    }

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method494(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
    public final boolean method534() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method555();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;")
    public final class514 method523(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class50(this, this.field10075, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method151(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method453();

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
    public final boolean method519() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method557(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()I")
    public final int method451() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method474(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lgfa;IIII)Lka;")
    public final class500 method510(class782 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class43(this, this.field10075, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method4035(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method455(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)I")
    public final int method517(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method483();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lef;Z)V")
    private final void method4036(class515 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class468 var8 = (class468) arg0.field7049.method638(-116); var8 != null; var8 = (class468) arg0.field7049.method635(false)) {
            field10092[var3++] = var8.field6493;
            field10092[var3++] = var8.field6486;
            field10092[var3++] = var8.field6488;
            field10080[var4++] = var8.field6497;
            field10087[var6++] = (short) var8.field6496;
            field10089[var5++] = var8.field6487;
            if (arg1) {
                field10081[var7++] = var8.field6492;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public final void method516(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public final void method531(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class296 method547(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class698(this, this.field10075, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
    public final void method546(int arg0) {
        class552.method3123((byte) -43);
        this.method4031(arg0);
        for (class58 var2 = (class58) this.field10077.method2551((byte) -108); var2 != null; var2 = (class58) this.field10077.method2542(-116)) {
            var2.method410();
        }
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()Z")
    public final boolean method485() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method481(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V")
    public final void method449(class437 arg0) {
        this.field10075 = (class58) arg0;
        this.method4030(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method490();

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()La;")
    public final class646 method4037() {
        for (int var1 = 0; var1 < this.field10097; ++var1) {
            if (this.field10096[var1].field8972 == Thread.currentThread()) {
                return this.field10096[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method492(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Lcja;")
    public final class45 method558() {
        return new class45(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method476(Canvas arg0) {
        if (this.field10093.field3149 == arg0) {
            this.method460((Canvas) null);
        }
        class231 var2 = (class231) this.field10091.method3953((long) arg0.hashCode(), 14);
        if (var2 != null) {
            var2.method792((byte) -114);
            var2.method1513();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public final void method459(int arg0) {
        this.field10094 = this.field10084 = arg0;
        if (this.field10097 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method554(this.field10097);
            this.method469(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lvr;")
    public final class147 method562(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class568(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method488(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method521(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method567();

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
    public final void method538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method488(arg0, arg1, arg2, arg4, arg5);
        this.method488(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method520(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method520(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method447(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method515(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method518(int arg0, class514 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method4038();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8) {
        this.method4033(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method487(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class566 {
        if (this.field10093 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field10093.method1512(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method4039(class231 arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Luu;")
    public final class303 method450() {
        return this.field10085;
    }

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method4040(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z")
    public final boolean method461() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)Lza;")
    public final class437 method482(int arg0) {
        class58 var2 = new class58(this, arg0);
        this.field10077.method2545(-126, var2);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lef;I)V")
    public final void method532(class515 arg0, int arg1) {
        this.method4036(arg0, false);
        this.method4037().method3611(this, field10092, field10080, field10089, field10087, arg0.field7049.method634((byte) 125));
    }

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method4041(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldn;)V")
    public final void method473(class544 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)V")
    public final void method504(int arg0, int arg1) throws class566 {
        if (this.field10093 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field10093.method1510(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method539();

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method452(float arg0);

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
    private final Object method4042() {
        return new class409(this);
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
    public final void method506(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)Ldn;")
    public final class544 method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
    public final void method554(int arg0) {
        this.field10097 = arg0;
        this.field10096 = new class646[this.field10097];
        for (int var2 = 0; var2 < this.field10097; ++var2) {
            this.field10096[var2] = new class646(this, this.field10094, this.field10084);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Leia;[Leu;Z)Lda;")
    public final class66 method545(class255 arg0, class508[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field7017;
            var5[var7] = arg1[var7].field7014;
            if (arg1[var7].field7019 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class694(this, this.field10075, arg0, arg1, (class147[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class19(this, this.field10075, arg0, arg1, (class147[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method480(Canvas arg0, int arg1, int arg2) {
        class231 var4 = (class231) this.field10091.method3953((long) arg0.hashCode(), 14);
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class231 var7 = new class231(this, arg0, arg1, arg2);
            this.field10091.method3962((long) arg0.hashCode(), var7, -117);
        } else {
            if (var4.field3151 != arg1 || var4.field3148 != arg2) {
                var4.method1515(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
    public final boolean method491() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z")
    public final boolean method501() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()V")
    public final void method500() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lvr;")
    public final class147 method544(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class568(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method540(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method551(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()V")
    public final void method468() {
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public final void method469(int arg0) {
        this.field10096[arg0].method3593();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lvv;)V")
    public final void method549(class345 arg0) {
        class638 var2 = (class638) arg0;
        this.method4044(var2.field8875.nativeid, var2.field8873.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
    public final boolean method484() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method527(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class724(Canvas arg0, class161 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class295.method1877(77, "sw3d")) {
                throw new RuntimeException("");
            } else {
                class552.method3122((byte) 87);
                this.method4047(super.field912, 0, 0);
                class679.method3753(true, false, true);
                this.field10095 = true;
                this.field10085 = new class294();
                this.method526(new class294());
                this.method554(1);
                this.method469(0);
                if (arg0 != null) {
                    this.method480(arg0, arg2, arg3);
                    this.method460(arg0);
                }
            }
        } catch (Throwable var5) {
            this.method470((byte) -110);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
    private final boolean method4043(short arg0) {
        class161 var2 = super.field912;
        synchronized (super.field912) {
            if (!super.field912.method1173(true, arg0)) {
                return false;
            } else {
                class662 var4 = super.field912.method1174(arg0, true);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field9135 != 2) {
                        var6 = super.field912.method1177(128, true, 128, 0.7F, arg0, (byte) -101);
                    } else {
                        var6 = super.field912.method1178(128, arg0, -107, 0.7F, 128, true);
                    }
                    this.method4046(arg0, var6, var4.field9137, var4.field9135, var4.field9140, var4.field9149, var4.field9154, var4.field9143, var4.field9146, var4.field9133, var4.field9152, var4.field9157, var4.field9142, var4.field9150, var4.field9139, var4.field9155, var4.field9147, var4.field9153, var4.field9158, var4.field9138, var4.field9141);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
    public final boolean method522() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()V")
    public final void method465() {
        if (!this.field10076) {
            this.field10096 = null;
            this.field10093 = null;
            this.field10075 = null;
            this.field10085 = null;
            this.field10091.method3959(0);
            for (class58 var1 = (class58) this.field10077.method2551((byte) -108); var1 != null; var1 = (class58) this.field10077.method2542(-128)) {
                var1.method411();
            }
            this.field10077.method2549(-98);
            this.method4038();
            if (this.field10095) {
                class182.method1269(true, -11692, false);
                this.field10095 = false;
            }
            this.method4032();
            class552.method3119(0);
            this.field10076 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method4044(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()V")
    public final void method503() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Luca;)V")
    public final void method486(int arg0, class540[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field10088[var3++] = arg1[var4].method3085(24859);
            field10088[var3++] = arg1[var4].method3082(-52);
            field10088[var3++] = arg1[var4].method3084((byte) -16);
            field10088[var3++] = arg1[var4].method3081(7036);
            field10083[var4] = arg1[var4].method3083((byte) -41);
            field10088[var3++] = arg1[var4].method3080((byte) -104);
        }
        this.method4040(arg0, field10088, field10083);
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()Z")
    public final boolean method478() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method466(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)Ltq;")
    public final class656 method536(int arg0, int arg1) {
        return new class529(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public final void method564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method4037().method3600(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method520(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method550(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()V")
    public final void method529() {
    }

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method458(int arg0);

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Luu;")
    public final class303 method565() {
        return this.field10086;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Leu;Z)Lvr;")
    public final class147 method477(class508 arg0, boolean arg1) {
        class568 var3 = new class568(this, arg0.field7013, arg0.field7018, arg0.field7019, 0, arg0.field7017, arg0.field7017, arg0.field7014);
        var3.method1112(arg0.field7020, arg0.field7016, arg0.field7015, arg0.field7021);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method470((byte) -76);
        if (this.nativeid != 0L) {
            class552.method3121(this, (byte) 20);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Luu;)V")
    public final void method526(class303 arg0) {
        this.field10086 = arg0;
        this.method4034(((class294) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
    private final boolean method4045(short arg0) {
        synchronized (this) {
            class662 var3 = super.field912.method1174(arg0, true);
            if (var3 == null) {
                return false;
            } else {
                this.method4041(arg0, var3.field9137, var3.field9135, var3.field9140, var3.field9149, var3.field9154, var3.field9143, var3.field9146, var3.field9133, var3.field9152, var3.field9157, var3.field9142, var3.field9150, var3.field9139, var3.field9155, var3.field9147, var3.field9153, var3.field9158, var3.field9138, var3.field9141);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method496();

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z")
    public final boolean method535() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method4046(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method460(Canvas arg0) {
        if (arg0 != null) {
            class231 var2 = (class231) this.field10091.method3953((long) arg0.hashCode(), 14);
            this.field10093 = var2;
            this.method4039(var2);
        } else {
            this.field10093 = null;
            this.method4039((class231) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lvr;")
    public final class147 method508(int arg0, int arg1, boolean arg2) {
        return new class568(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method4047(class161 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Luca;")
    public final class540 method530(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class456(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
