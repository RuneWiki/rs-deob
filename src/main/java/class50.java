import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class50 extends class454 implements class752 {

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "Z")
    private boolean field729 = false;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Lqia;")
    private class547 field732 = new class547();

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    private int field736 = 4096;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    private int field733 = 4096;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "Lsga;")
    private class583 field748 = new class583(4);

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "Z")
    private boolean field751 = false;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "Lwc;")
    private class376 field740;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "[I")
    private static int[] field731 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "[F")
    private static float[] field737 = new float[20];

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "[I")
    public static int[] field741 = new int[6];

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "[I")
    public static int[] field739 = field731;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "[F")
    private static float[] field738 = field737;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "[I")
    private static int[] field743 = field731;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "[B")
    private static byte[] field745 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "[S")
    private static short[] field742 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "[I")
    private static int[] field735 = field731;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "[I")
    private static int[] field744 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "[I")
    private static int[] field746 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Lya;")
    private class305 field730;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "Lwc;")
    private class376 field734;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "Lp;")
    private class59 field747;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "[La;")
    private class655[] field749;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method151(Canvas arg0, int arg1, int arg2) {
        class59 var4 = (class59) this.field748.method3248((long) arg0.hashCode(), 0);
        var4.method465(arg0, arg1, arg2);
        if (arg0 != null && this.field747.field827 == arg0) {
            this.method95(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class50(Canvas arg0, class96 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class10.method50("sw3d", (byte) -72)) {
                throw new RuntimeException("");
            } else {
                class133.method840(true);
                this.method410(super.field6364, 0, 0);
                class651.method3514(false, true, true);
                this.field751 = true;
                this.field740 = new class640();
                this.method77(new class640());
                this.method124(1);
                this.method112(0);
                if (arg0 != null) {
                    this.method98(arg0, arg2, arg3);
                    this.method95(arg0);
                }
            }
        } catch (Throwable var5) {
            this.method2658(-117);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method78(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()V")
    public final void method62() {
        this.method95(this.field747.field827);
    }

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method127();

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method162(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method405(class702 arg0);

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()La;")
    public final class655 method406() {
        for (int var1 = 0; var1 < this.field750; ++var1) {
            if (this.field749[var1].field9018 == Thread.currentThread()) {
                return this.field749[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
    public final void method163(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method81(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method109(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
    public final boolean method88() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()V")
    public final void method142() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lcd;I)V")
    public final void method155(class603 arg0, int arg1) {
        this.method420(arg0, false);
        this.method406().method3548(this, field735, field744, field746, field742, arg0.field8363.method2027(74));
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method407(class59 arg0);

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method408(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method128(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
    public final boolean method107() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
    public final void method97(int arg0) {
        class133.method842(124);
        this.method416(arg0);
        for (class305 var2 = (class305) this.field732.method3111(61); var2 != null; var2 = (class305) this.field732.method3116(-88)) {
            var2.method1800();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class402 method101(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class647(this, this.field730, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method120(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method104(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method160(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public final void method82(int arg0) {
        this.field749[arg0].method3539();
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public final void method112(int arg0) {
        this.field749[arg0].method3557();
    }

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method173(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lpea;Lst;)Lmk;")
    public final class344 method154(class594 arg0, class675 arg1) {
        return new class342(this, (class319) arg0, (class544) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method409(long arg0);

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()Z")
    public final boolean method57() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lmk;)V")
    public final void method111(class344 arg0) {
        class342 var2 = (class342) arg0;
        this.method417(var2.field4445.nativeid, var2.field4446.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method126();

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method139(float arg0);

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method130(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method129(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method122(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class510 {
        if (this.field747 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field747.method464(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ltba;[Lbe;Z)Lda;")
    public final class423 method156(class56 arg0, class196[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field2527;
            var5[var7] = arg1[var7].field2525;
            if (arg1[var7].field2523 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class227(this, this.field730, arg0, arg1, (class712[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class731(this, this.field730, arg0, arg1, (class712[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method410(class96 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z")
    public final boolean method73() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method118(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method131(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z")
    public final boolean method123() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
    private final boolean method411(short arg0) {
        class96 var2 = super.field6364;
        synchronized (super.field6364) {
            if (!super.field6364.method390(arg0, -9396)) {
                return false;
            } else {
                class91 var4 = super.field6364.method389(9559, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field1165 != 2) {
                        var6 = super.field6364.method395(true, 0.7F, 128, arg0, -11288, 128);
                    } else {
                        var6 = super.field6364.method397(arg0, 0.7F, 13049, 128, 128, true);
                    }
                    this.method412(arg0, var6, var4.field1151, var4.field1165, var4.field1149, var4.field1160, var4.field1163, var4.field1159, var4.field1156, var4.field1166, var4.field1148, var4.field1161, var4.field1167, var4.field1164, var4.field1158, var4.field1157, var4.field1162, var4.field1153, var4.field1168, var4.field1150, var4.field1154);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z")
    public final boolean method149() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
    public final boolean method113() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method412(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
    public final int method100(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
    public final void method169(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lcd;)V")
    public final void method102(class603 arg0) {
        if (arg0.field8363.method2027(66) != 0) {
            this.method420(arg0, false);
            this.method406().method3548(this, field735, field744, field746, field742, arg0.field8363.method2027(119));
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lbe;Z)Lac;")
    public final class712 method60(class196 arg0, boolean arg1) {
        class319 var3 = new class319(this, arg0.field2529, arg0.field2521, arg0.field2523, 0, arg0.field2527, arg0.field2527, arg0.field2525);
        var3.method1874(arg0.field2526, arg0.field2522, arg0.field2528, arg0.field2524);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lst;")
    public final class675 method148(int arg0, int arg1) {
        return new class544(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method179();

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V")
    public final void method68(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lac;")
    public final class712 method75(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class319(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method414(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()I")
    public final int method115() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method83(int arg0, class81 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method166(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ltj;Ltj;FLtj;)Ltj;")
    public final class662 method119(class662 arg0, class662 arg1, float arg2, class662 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public final void method96(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lwc;)V")
    public final void method77(class376 arg0) {
        this.field734 = arg0;
        this.method409(((class640) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
    private final Object method415() {
        return new class119(this);
    }

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method76(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lpk;)V")
    public final void method146(int arg0, class621[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field743[var3++] = arg1[var4].method3402(true);
            field743[var3++] = arg1[var4].method3403((byte) 83);
            field743[var3++] = arg1[var4].method3404(-1);
            field743[var3++] = arg1[var4].method3399((byte) -108);
            field738[var4] = arg1[var4].method3405(false);
            field743[var3++] = arg1[var4].method3401(4);
        }
        this.method422(arg0, field743, field738);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)Lza;")
    public final class702 method161(int arg0) {
        class305 var2 = new class305(this, arg0);
        this.field732.method3110(var2, 1);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method416(int arg0);

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()V")
    public final void method84() {
        if (!this.field729) {
            this.field749 = null;
            this.field747 = null;
            this.field730 = null;
            this.field740 = null;
            this.field748.method3251(false);
            for (class305 var1 = (class305) this.field732.method3111(94); var1 != null; var1 = (class305) this.field732.method3116(-58)) {
                var1.method1801();
            }
            this.field732.method3114(true);
            this.method423();
            if (this.field751) {
                class283.method1700(0, false, true);
                this.field751 = false;
            }
            this.method418();
            class133.method843(57);
            this.field729 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method64(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V")
    public final void method133(class702 arg0) {
        this.field730 = (class305) arg0;
        this.method405(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()Lwc;")
    public final class376 method94() {
        return this.field734;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method98(Canvas arg0, int arg1, int arg2) {
        class59 var4 = (class59) this.field748.method3248((long) arg0.hashCode(), 0);
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class59 var7 = new class59(this, arg0, arg1, arg2);
            this.field748.method3249((long) arg0.hashCode(), var7, (byte) -66);
        } else {
            if (var4.field828 != arg1 || var4.field830 != arg2) {
                var4.method465(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ltj;)V")
    public final void method170(class662 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()V")
    public final void method172() {
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method2658(80);
        if (this.nativeid != 0L) {
            class133.method841(0, this);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method178();

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
    public final boolean method176() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method417(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method95(Canvas arg0) {
        if (arg0 != null) {
            class59 var2 = (class59) this.field748.method3248((long) arg0.hashCode(), 0);
            this.field747 = var2;
            this.method407(var2);
        } else {
            this.field747 = null;
            this.method407((class59) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)Lpea;")
    public final class594 method174(int arg0, int arg1) {
        return this.method70(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
    private final void method418() {
        System.gc();
        System.runFinalization();
        class133.method842(6);
    }

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method99();

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()V")
    public final void method175() {
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
    public final boolean method171() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
    private final boolean method419(short arg0) {
        synchronized (this) {
            class91 var3 = super.field6364.method389(9559, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method421(arg0, var3.field1151, var3.field1165, var3.field1149, var3.field1160, var3.field1163, var3.field1159, var3.field1156, var3.field1166, var3.field1148, var3.field1161, var3.field1167, var3.field1164, var3.field1158, var3.field1157, var3.field1162, var3.field1153, var3.field1168, var3.field1150, var3.field1154);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)Ltj;")
    public final class662 method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
    public final void method124(int arg0) {
        this.field750 = arg0;
        this.field749 = new class655[this.field750];
        for (int var2 = 0; var2 < this.field750; ++var2) {
            this.field749[var2] = new class655(this, this.field733, this.field736);
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I")
    public final int method135(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method117(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method71();

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method143(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z")
    public final boolean method91() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method85(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method140(Canvas arg0) {
        if (this.field747.field827 == arg0) {
            this.method95((Canvas) null);
        }
        class59 var2 = (class59) this.field748.method3248((long) arg0.hashCode(), 0);
        if (var2 != null) {
            var2.method3426((byte) -84);
            var2.method468();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lcd;Z)V")
    private final void method420(class603 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class744 var8 = (class744) arg0.field8363.method2028(-9254); var8 != null; var8 = (class744) arg0.field8363.method2032(26764)) {
            field735[var3++] = var8.field10383;
            field735[var3++] = var8.field10388;
            field735[var3++] = var8.field10387;
            field744[var4++] = var8.field10380;
            field742[var6++] = (short) var8.field10385;
            field746[var5++] = var8.field10379;
            if (arg1) {
                field745[var7++] = var8.field10382;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
    public final void method134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method408(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()V")
    public final void method116() {
    }

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method421(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method422(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
    public final boolean method86() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lid;IIII)Lka;")
    public final class219 method150(class415 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class735(this, this.field730, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method147();

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Lwc;")
    public final class376 method114() {
        return this.field740;
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
    public final boolean method152() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
    public final void method136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method160(arg0, arg1, arg2, arg4, arg5);
        this.method160(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method128(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method128(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
    public final void method141(int[] arg0) {
        Dimension var2 = this.field747.field827.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method108();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method406().method3543(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z")
    public final boolean method66() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()V")
    public final void method93() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, int arg7, int arg8) {
        this.method413(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;")
    public final class81 method87(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class291(this, this.field730, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lac;")
    public final class712 method157(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class319(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method105(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)V")
    public final void method89(int arg0, int arg1) throws class510 {
        if (this.field747 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field747.method467(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lac;")
    public final class712 method70(int arg0, int arg1, boolean arg2) {
        return new class319(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method423();

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()Lwc;")
    public final class376 method125() {
        return new class640();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lpk;")
    public final class621 method90(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class84(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
    public final void method164(int arg0) {
        this.field733 = this.field736 = arg0;
        if (this.field750 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method124(this.field750);
            this.method112(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
    public final void method65(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Loj;")
    public final class633 method79() {
        return new class633(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method153(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method59();
}
