import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class52 extends class473 implements class784 {

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "Z")
    private boolean field624 = false;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "Lv;")
    private class165 field626 = new class165();

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
    private int field629 = 4096;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "I")
    private int field627 = 4096;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "Llk;")
    private class638 field632 = new class638(4);

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "Z")
    private boolean field633 = false;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "Loo;")
    private class12 field631;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "[I")
    private static int[] field613 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "[I")
    private static int[] field617 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "[I")
    public static int[] field614 = field613;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "[S")
    private static short[] field619 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "[I")
    public static int[] field615 = new int[6];

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "[F")
    private static float[] field622 = new float[20];

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "[I")
    private static int[] field623 = field613;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "[F")
    private static float[] field621 = field622;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "[I")
    private static int[] field625 = field613;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "[I")
    private static int[] field618 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "[B")
    private static byte[] field620 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "Loo;")
    private class12 field628;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "Lya;")
    private class317 field616;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "Lp;")
    private class63 field630;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "[La;")
    private class682[] field634;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method196(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method251(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
    private final boolean method435(short arg0) {
        class101 var2 = super.field6556;
        synchronized (super.field6556) {
            if (!super.field6556.method583(12101, arg0)) {
                return false;
            } else {
                class744 var4 = super.field6556.method581(-21732, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field10258 != 2) {
                        var6 = super.field6556.method578(128, true, arg0, 0.7F, true, 128);
                    } else {
                        var6 = super.field6556.method579(arg0, 0.7F, true, 5084, 128, 128);
                    }
                    this.method445(arg0, var6, var4.field10266, var4.field10258, var4.field10273, var4.field10257, var4.field10267, var4.field10265, var4.field10269, var4.field10262, var4.field10259, var4.field10268, var4.field10264, var4.field10249, var4.field10263, var4.field10253, var4.field10255, var4.field10270, var4.field10252, var4.field10261, var4.field10256);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method436(long arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method155(Canvas arg0) {
        if (arg0 != null) {
            class63 var2 = (class63) this.field632.method3669(false, (long) arg0.hashCode());
            this.field630 = var2;
            this.method444(var2);
        } else {
            this.field630 = null;
            this.method444((class63) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
    public final void method239(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method202(float arg0);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method241();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lho;")
    public final class318 method228(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class331(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method230(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Loo;)V")
    public final void method194(class12 arg0) {
        this.field628 = arg0;
        this.method436(((class667) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()Loo;")
    public final class12 method159() {
        return new class667();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lsca;)V")
    public final void method163(int arg0, class251[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field623[var3++] = arg1[var4].method1683(10918);
            field623[var3++] = arg1[var4].method1687(1110);
            field623[var3++] = arg1[var4].method1686(false);
            field623[var3++] = arg1[var4].method1685(82);
            field621[var4] = arg1[var4].method1688(89);
            field623[var3++] = arg1[var4].method1684(-1);
        }
        this.method453(arg0, field623, field621);
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()Z")
    public final boolean method206() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()Loo;")
    public final class12 method153() {
        return this.field631;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)V")
    public final void method157(int arg0, int arg1) throws class357 {
        if (this.field630 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field630.method502(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
    public final int method198(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()V")
    public final void method205() {
        if (!this.field624) {
            this.field634 = null;
            this.field630 = null;
            this.field616 = null;
            this.field631 = null;
            this.field632.method3672(0);
            for (class317 var1 = (class317) this.field626.method1041(1048832); var1 != null; var1 = (class317) this.field626.method1033(-1)) {
                var1.method2021();
            }
            this.field626.method1046((byte) -64);
            this.method440();
            if (this.field633) {
                class153.method1003(false, -2, true);
                this.field633 = false;
            }
            this.method441();
            class398.method2449((byte) 118);
            this.field624 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class418 method204(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class674(this, this.field616, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method207(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method438(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method211(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method440();

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
    public final void method185(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()V")
    public final void method167() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
    public final void method218(int[] arg0) {
        Dimension var2 = this.field630.field705.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
    private final void method441() {
        System.gc();
        System.runFinalization();
        class398.method2446(-67);
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
    private final Object method442() {
        return new class125(this);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Lrb;")
    public final class260 method172() {
        return new class260(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V")
    public final void method165(class731 arg0) {
        this.field616 = (class317) arg0;
        this.method452(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lsca;")
    public final class251 method138(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class566(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method243(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method152(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method245(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public final void method203(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method255(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()V")
    public final void method184() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lok;)V")
    public final void method173(class255 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method168(Canvas arg0) {
        if (this.field630.field705 == arg0) {
            this.method155((Canvas) null);
        }
        class63 var2 = (class63) this.field632.method3669(false, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method527(-11229);
            var2.method499();
        }
    }

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method443(class101 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lhda;)V")
    public final void method253(class714 arg0) {
        if (arg0.field9929.method1789((byte) -92) != 0) {
            this.method447(arg0, false);
            this.method451().method3872(this, field625, field618, field617, field619, arg0.field9929.method1789((byte) -77));
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
    public final boolean method222() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method214();

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method226();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lmia;)V")
    public final void method229(class684 arg0) {
        class355 var2 = (class355) arg0;
        this.method438(var2.field5130.nativeid, var2.field5131.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method238();

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method176(int arg0, class87 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
    public final void method170(int arg0) {
        this.field634[arg0].method3896();
    }

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method154(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method190(Canvas arg0, int arg1, int arg2) {
        class63 var4 = (class63) this.field632.method3669(false, (long) arg0.hashCode());
        var4.method501(arg0, arg1, arg2);
        if (arg0 != null && this.field630.field705 == arg0) {
            this.method155(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()V")
    public final void method210() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method221(Canvas arg0, int arg1, int arg2) {
        class63 var4 = (class63) this.field632.method3669(false, (long) arg0.hashCode());
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class63 var7 = new class63(this, arg0, arg1, arg2);
            this.field632.method3666((byte) 65, (long) arg0.hashCode(), var7);
        } else {
            if (var4.field708 != arg1 || var4.field706 != arg2) {
                var4.method501(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)Lok;")
    public final class255 method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method254(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class357 {
        if (this.field630 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field630.method498(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
    public final boolean method199() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method444(class63 arg0);

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method445(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
    public final boolean method200() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z")
    public final boolean method156() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method446(int arg0);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
    public final void method195(int arg0) {
        this.field635 = arg0;
        this.field634 = new class682[this.field635];
        for (int var2 = 0; var2 < this.field635; ++var2) {
            this.field634[var2] = new class682(this, this.field629, this.field627);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lhw;[Lfm;Z)Lda;")
    public final class442 method179(class300 arg0, class279[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field4014;
            var5[var7] = arg1[var7].field4008;
            if (arg1[var7].field4009 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class239(this, this.field616, arg0, arg1, (class318[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class763(this, this.field616, arg0, arg1, (class318[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public final void method237(int arg0) {
        this.field634[arg0].method3877();
    }

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method160(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
    public final boolean method201() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lhda;I)V")
    public final void method134(class714 arg0, int arg1) {
        this.method447(arg0, false);
        this.method451().method3872(this, field625, field618, field617, field619, arg0.field9929.method1789((byte) 103));
    }

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method146(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method208();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lhda;Z)V")
    private final void method447(class714 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class216 var8 = (class216) arg0.field9929.method1786(2); var8 != null; var8 = (class216) arg0.field9929.method1787(57)) {
            field625[var3++] = var8.field2979;
            field625[var3++] = var8.field2982;
            field625[var3++] = var8.field2978;
            field618[var4++] = var8.field2983;
            field619[var6++] = (short) var8.field2976;
            field617[var5++] = var8.field2975;
            if (arg1) {
                field620[var7++] = var8.field2977;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public final void method197(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method217(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method181();

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method448(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
    private final boolean method449(short arg0) {
        synchronized (this) {
            class744 var3 = super.field6556.method581(-21732, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method448(arg0, var3.field10266, var3.field10258, var3.field10273, var3.field10257, var3.field10267, var3.field10265, var3.field10269, var3.field10262, var3.field10259, var3.field10268, var3.field10264, var3.field10249, var3.field10263, var3.field10253, var3.field10255, var3.field10270, var3.field10252, var3.field10261, var3.field10256);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
    public final boolean method162() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()V")
    public final void method227() {
        this.method155(this.field630.field705);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
    public final void method186(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method140(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()I")
    public final int method143() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lho;")
    public final class318 method183(int arg0, int arg1, boolean arg2) {
        return new class331(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method148(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lcn;")
    public final class621 method236(int arg0, int arg1) {
        return this.method183(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class52(Canvas arg0, class101 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class161.method1027(74, "sw3d")) {
                throw new RuntimeException("");
            } else {
                class398.method2448(-122);
                this.method443(super.field6556, 0, 0);
                class691.method3920(true, false, -94557789);
                this.field633 = true;
                this.field631 = new class667();
                this.method194(new class667());
                this.method195(1);
                this.method170(0);
                if (arg0 != null) {
                    this.method221(arg0, arg2, arg3);
                    this.method155(arg0);
                }
            }
        } catch (Throwable var5) {
            this.method2821((byte) 83);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method450(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lao;IIII)Lka;")
    public final class231 method231(class534 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class767(this, this.field616, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
    public final void method171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method152(arg0, arg1, arg2, arg4, arg5);
        this.method152(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method207(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method207(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method177();

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method2821((byte) 107);
        if (this.nativeid != 0L) {
            class398.method2447(true, this);
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
    public final boolean method175() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()V")
    public final void method250() {
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public final void method232(int arg0) {
        class398.method2446(-91);
        this.method446(arg0);
        for (class317 var2 = (class317) this.field626.method1041(1048832); var2 != null; var2 = (class317) this.field626.method1033(-1)) {
            var2.method2020();
        }
    }

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method252(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I")
    public final int method188(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V")
    public final void method180(int arg0) {
        this.field629 = this.field627 = arg0;
        if (this.field635 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method195(this.field635);
            this.method170(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
    public final boolean method147() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
    public final boolean method223() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()La;")
    public final class682 method451() {
        for (int var1 = 0; var1 < this.field635; ++var1) {
            if (this.field634[var1].field9556 == Thread.currentThread()) {
                return this.field634[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z")
    public final boolean method161() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;")
    public final class87 method248(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class303(this, this.field616, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method142(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)Lza;")
    public final class731 method178(int arg0) {
        class317 var2 = new class317(this, arg0);
        this.field626.method1039(var2, 0);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lcn;Lrca;)Lmia;")
    public final class684 method247(class621 arg0, class36 arg1) {
        return new class355(this, (class331) arg0, (class569) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public final void method141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method451().method3876(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lok;Lok;FLok;)Lok;")
    public final class255 method209(class255 arg0, class255 arg1, float arg2, class255 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
    public final void method139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method437(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method244();

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()V")
    public final void method145() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8) {
        this.method439(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lfm;Z)Lho;")
    public final class318 method192(class279 arg0, boolean arg1) {
        class331 var3 = new class331(this, arg0.field4012, arg0.field4010, arg0.field4009, 0, arg0.field4014, arg0.field4014, arg0.field4008);
        var3.method741(arg0.field4016, arg0.field4011, arg0.field4013, arg0.field4015);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lho;")
    public final class318 method182(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class331(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method452(class731 arg0);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()Loo;")
    public final class12 method187() {
        return this.field628;
    }

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method225(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method242(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)Lrca;")
    public final class36 method246(int arg0, int arg1) {
        return new class569(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method235(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z")
    public final boolean method193() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method166(int arg0);

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
    public final boolean method135() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method136();

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method453(int arg0, int[] arg1, float[] arg2);
}
