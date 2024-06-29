import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class721 extends class66 implements class558 {

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "Z")
    private boolean field10431 = false;

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "Lef;")
    private class513 field10440 = new class513();

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    private int field10449 = 4096;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
    private int field10446 = 4096;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "Lqha;")
    private class112 field10444 = new class112(4);

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "Z")
    private boolean field10451 = false;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "Lqq;")
    private class501 field10445;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "[Ljava/lang/String;")
    private static final String[] field10454 = new String[] { method5271(method5270("M\u00125")), method5271(method5270("l\u001bs>\u0002")), method5271(method5270("H\u0015%\u0012xC\u0003']\u0015C\u001a%\u0012%")), method5271(method5270("Q\u0011':1L\u001b!\u0016\u0004G\u00042\u001a8V")), method5271(method5270("a\u0015=\u001d9VT \u00033A\u001d5\nvC\u0018#\u001b7\u0002\u0003:\u0007>\u0002\u001a<\u001d{O\u001b=\u001cvD\u001b=\u0007vW\u001a?\u0016%QT \u001c;G\u001b=\u0016vU\u0006:\u00073QT:\u0007")), method5271(method5270("Q\u0003`\u0017")), method5271(method5270("q'\u0016")), method5271(method5270("a$\u0006")) };

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "[I")
    private static int[] field10433 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "[B")
    private static byte[] field10435 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "[I")
    private static int[] field10436 = field10433;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "[I")
    public static int[] field10439 = new int[6];

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "[I")
    private static int[] field10441 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "[I")
    private static int[] field10437 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "[S")
    private static short[] field10438 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "[I")
    private static int[] field10442 = field10433;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "[I")
    public static int[] field10443 = field10433;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "[F")
    private static float[] field10448 = new float[20];

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "[F")
    private static float[] field10434 = field10448;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    public int field10453;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "Lp;")
    private class230 field10447;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "Lqq;")
    private class501 field10450;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "Lya;")
    private class59 field10432;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "[La;")
    private class644[] field10452;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public final void method498(int arg0) {
        class201.method1800(true);
        this.method5262(arg0);
        for (class59 var2 = (class59) this.field10440.method3863((byte) 64); var2 != null; var2 = (class59) this.field10440.method3862(-353)) {
            var2.method433();
        }
    }

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method5252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Lqq;")
    public final class501 method517() {
        return new class292();
    }

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method546();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method551(Canvas arg0, int arg1, int arg2) {
        class230 var4 = (class230) this.field10444.method977((long) arg0.hashCode(), 1);
        var4.method1970(arg0, arg1, arg2);
        if (arg0 != null && this.field10447.field3491 == arg0) {
            this.method508(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method468();

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method480(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method5253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method526(float arg0);

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method579((byte) -12);
        if (this.nativeid != 0L) {
            class201.method1801((byte) -58, this);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljw;I)V")
    public final void method500(class580 arg0, int arg1) {
        this.method5267(arg0, false);
        this.method5256().method4742(this, field10442, field10437, field10441, field10438, arg0.field8599.method3911((byte) 97));
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I")
    public final int method509(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method589(Canvas arg0, int arg1, int arg2) {
        class230 var4 = (class230) this.field10444.method977((long) arg0.hashCode(), 1);
        if (var4 == null) {
            try {
                Class var5 = Class.forName(field10454[2]);
                Method var6 = var5.getMethod(field10454[3], Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class230 var7 = new class230(this, arg0, arg1, arg2);
            this.field10444.method968((byte) -111, (long) arg0.hashCode(), var7);
        } else {
            if (var4.field3494 != arg1 || var4.field3492 != arg2) {
                var4.method1970(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method482(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
    public final void method519(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method558();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lfs;")
    public final class581 method534(int arg0, int arg1, boolean arg2) {
        return new class567(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method586();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)Lol;")
    public final class299 method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lrk;")
    public final class35 method486(int arg0, int arg1) {
        return new class527(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lfs;")
    public final class581 method560(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class567(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
    public final void method527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method482(arg0, arg1, arg2, arg4, arg5);
        this.method482(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method512(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method512(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method582(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljw;)V")
    public final void method590(class580 arg0) {
        if (arg0.field8599.method3911((byte) 97) != 0) {
            this.method5267(arg0, false);
            this.method5256().method4742(this, field10442, field10437, field10441, field10438, arg0.field8599.method3911((byte) 97));
        }
    }

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method543(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lol;Lol;FLol;)Lol;")
    public final class299 method485(class299 arg0, class299 arg1, float arg2, class299 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8) {
        this.method5253(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method5254(class434 arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lnq;Lrk;)Lgea;")
    public final class82 method507(class485 arg0, class35 arg1) {
        return new class637(this, (class567) arg0, (class527) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z")
    public final boolean method559() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lfs;")
    public final class581 method568(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class567(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method5255(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
    public final void method510(int arg0) {
        this.field10452[arg0].method4726();
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()V")
    public final void method473() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
    public final void method497(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method471(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method512(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "()La;")
    public final class644 method5256() {
        for (int var1 = 0; var1 < this.field10453; ++var1) {
            if (this.field10452[var1].field9343 == Thread.currentThread()) {
                return this.field10452[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lju;IIII)Lka;")
    public final class497 method552(class137 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class44(this, this.field10432, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method553();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V")
    public final void method515(class434 arg0) {
        this.field10432 = (class59) arg0;
        this.method5254(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method494();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class294 method477(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class696(this, this.field10432, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method5257(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method583();

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()V")
    public final void method574() {
    }

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
    public final boolean method566() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method5258(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
    public final boolean method542() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method5259(long arg0);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method5260(class230 arg0);

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method5261(class160 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method567(int arg0, class512 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()V")
    public final void method484() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
    public final void method539(int[] arg0) {
        Dimension var2 = this.field10447.field3491.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
    public final void method532(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method5252(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lqq;)V")
    public final void method495(class501 arg0) {
        this.field10450 = arg0;
        this.method5259(((class292) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "(I)Lza;")
    public final class434 method475(int arg0) {
        class59 var2 = new class59(this, arg0);
        this.field10440.method3868(-54, var2);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
    public final boolean method472() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()V")
    public final void method575() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;")
    public final class512 method496(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class51(this, this.field10432, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Luf;)V")
    public final void method573(int arg0, class471[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field10436[var3++] = arg1[var4].method3577(-32630);
            field10436[var3++] = arg1[var4].method3581(-80);
            field10436[var3++] = arg1[var4].method3580((byte) -120);
            field10436[var3++] = arg1[var4].method3579((byte) 126);
            field10434[var4] = arg1[var4].method3576((byte) -121);
            field10436[var3++] = arg1[var4].method3578(108);
        }
        this.method5264(arg0, field10436, field10434);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method5262(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public final void method554(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method525(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method506(int arg0);

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()Lqq;")
    public final class501 method511() {
        return this.field10445;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
    public final boolean method469() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
    private final void method5263() {
        System.gc();
        System.runFinalization();
        class201.method1800(true);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method508(Canvas arg0) {
        if (arg0 != null) {
            class230 var2 = (class230) this.field10444.method977((long) arg0.hashCode(), 1);
            this.field10447 = var2;
            this.method5260(var2);
        } else {
            this.field10447 = null;
            this.method5260((class230) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method524(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method523();

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class721(Canvas arg0, class160 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class116.method1024(field10454[5], 1)) {
                throw new RuntimeException("");
            } else {
                class201.method1798((byte) 125);
                this.method5261(super.field679, 0, 0);
                class624.method4635(false, -17200, true);
                this.field10451 = true;
                this.field10445 = new class292();
                this.method495(new class292());
                this.method536(1);
                this.method510(0);
                if (arg0 != null) {
                    this.method589(arg0, arg2, arg3);
                    this.method508(arg0);
                }
            }
        } catch (Throwable var5) {
            this.method579((byte) -20);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
    public final void method581(int arg0) {
        this.field10449 = this.field10446 = arg0;
        if (this.field10453 > 1) {
            throw new IllegalStateException(field10454[1]);
        } else {
            this.method536(this.field10453);
            this.method510(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
    public final boolean method547() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method5264(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Liga;Z)Lfs;")
    public final class581 method487(class481 arg0, boolean arg1) {
        class567 var3 = new class567(this, arg0.field6969, arg0.field6975, arg0.field6973, 0, arg0.field6970, arg0.field6970, arg0.field6977);
        var3.method990(arg0.field6971, arg0.field6976, arg0.field6974, arg0.field6972);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
    public final boolean method562() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method474(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "(I)V")
    public final void method535(int arg0) {
        this.field10452[arg0].method4741();
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Lnq;")
    public final class485 method478(int arg0, int arg1) {
        return this.method534(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lol;)V")
    public final void method555(class299 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method489(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z")
    public final boolean method503() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
    private final boolean method5265(short arg0) {
        class160 var2 = super.field679;
        synchronized (super.field679) {
            if (!super.field679.method1363(arg0, (byte) 81)) {
                return false;
            } else {
                class439 var4 = super.field679.method1366((byte) -51, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field6478 != 2) {
                        var6 = super.field679.method1364(-25656, true, arg0, 128, 128, 0.7F);
                    } else {
                        var6 = super.field679.method1365((byte) -59, 128, true, 0.7F, arg0, 128);
                    }
                    this.method5255(arg0, var6, var4.field6472, var4.field6478, var4.field6467, var4.field6461, var4.field6462, var4.field6481, var4.field6476, var4.field6480, var4.field6475, var4.field6466, var4.field6474, var4.field6471, var4.field6479, var4.field6463, var4.field6470, var4.field6469, var4.field6468, var4.field6477, var4.field6464);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z")
    public final boolean method561() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method504(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class382 {
        if (this.field10447 == null) {
            throw new IllegalStateException(field10454[0]);
        } else {
            this.field10447.method1975(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public final void method550(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method479(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()Z")
    public final boolean method576() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public final void method536(int arg0) {
        this.field10453 = arg0;
        this.field10452 = new class644[this.field10453];
        for (int var2 = 0; var2 < this.field10453; ++var2) {
            this.field10452[var2] = new class644(this, this.field10449, this.field10446);
        }
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method5266();

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method548();

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
    public final void method501() {
        this.method508(this.field10447.field3491);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public final void method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method5256().method4727(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z")
    public final boolean method502() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
    public final void method470() {
        if (!this.field10431) {
            this.field10452 = null;
            this.field10447 = null;
            this.field10432 = null;
            this.field10445 = null;
            this.field10444.method970(-115);
            for (class59 var1 = (class59) this.field10440.method3863((byte) 64); var1 != null; var1 = (class59) this.field10440.method3862(-353)) {
                var1.method434();
            }
            this.field10440.method3879(120);
            this.method5266();
            if (this.field10451) {
                class223.method1937(true, -9743, false);
                this.field10451 = false;
            }
            this.method5263();
            class201.method1799((byte) 90);
            this.field10431 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)I")
    public final int method499(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method516(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method538(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Luf;")
    public final class471 method521(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class369(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method488(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)V")
    public final void method513(int arg0, int arg1) throws class382 {
        if (this.field10447 == null) {
            throw new IllegalStateException(field10454[0]);
        } else {
            this.field10447.method1976(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljw;Z)V")
    private final void method5267(class580 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class777 var8 = (class777) arg0.field8599.method3910(0); var8 != null; var8 = (class777) arg0.field8599.method3912((byte) 9)) {
            field10442[var3++] = var8.field11286;
            field10442[var3++] = var8.field11291;
            field10442[var3++] = var8.field11290;
            field10437[var4++] = var8.field11285;
            field10438[var6++] = (short) var8.field11282;
            field10441[var5++] = var8.field11289;
            if (arg1) {
                field10435[var7++] = var8.field11280;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
    public final boolean method514() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lgea;)V")
    public final void method592(class82 arg0) {
        class637 var2 = (class637) arg0;
        this.method5257(var2.field9254.nativeid, var2.field9253.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method490(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method130(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Llq;[Liga;Z)Lda;")
    public final class67 method563(class578 arg0, class481[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field6970;
            var5[var7] = arg1[var7].field6977;
            if (arg1[var7].field6973 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException(field10454[4]);
            } else {
                return new class692(this, this.field10432, arg0, arg1, (class581[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException(field10454[4]);
        } else {
            return new class19(this, this.field10432, arg0, arg1, (class581[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
    private final boolean method5268(short arg0) {
        synchronized (this) {
            class439 var3 = super.field679.method1366((byte) -48, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method5258(arg0, var3.field6472, var3.field6478, var3.field6467, var3.field6461, var3.field6462, var3.field6481, var3.field6476, var3.field6480, var3.field6475, var3.field6466, var3.field6474, var3.field6471, var3.field6479, var3.field6463, var3.field6470, var3.field6469, var3.field6468, var3.field6477, var3.field6464);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method549(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method483(int arg0);

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Lmi;")
    public final class521 method493() {
        return new class521(0, field10454[6], 1, field10454[7], 0L);
    }

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()V")
    public final void method591() {
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
    private final Object method5269() {
        return new class406(this);
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()I")
    public final int method578() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method584(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method491(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
    public final boolean method588() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method522(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public final void method481(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()Lqq;")
    public final class501 method577() {
        return this.field10450;
    }

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method557(Canvas arg0) {
        if (this.field10447.field3491 == arg0) {
            this.method508((Canvas) null);
        }
        class230 var2 = (class230) this.field10444.method977((long) arg0.hashCode(), 1);
        if (var2 != null) {
            var2.method1824(1);
            var2.method1972();
        }
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5270(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 86);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5271(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 34;
                    break;
                case 1:
                    var10005 = 116;
                    break;
                case 2:
                    var10005 = 83;
                    break;
                case 3:
                    var10005 = 115;
                    break;
                default:
                    var10005 = 86;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
