import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class199 extends class290 implements class130 {

    @OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "Z")
    private boolean field2832 = false;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Lam;")
    private class455 field2819 = new class455();

    @OriginalMember(owner = "client!w", name = "H", descriptor = "I")
    private int field2834 = 4096;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    private int field2838 = 4096;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "Lqi;")
    private class406 field2836 = new class406(4);

    @OriginalMember(owner = "client!w", name = "N", descriptor = "Z")
    private boolean field2840 = false;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "Lc;")
    private class125 field2837;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "[I")
    private static int[] field2820 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!w", name = "x", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field2824 = Boolean.FALSE;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "[F")
    private static float[] field2828 = new float[20];

    @OriginalMember(owner = "client!w", name = "A", descriptor = "[F")
    private static float[] field2827 = field2828;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "[I")
    private static int[] field2825 = field2820;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "[S")
    private static short[] field2822 = new short[8191];

    @OriginalMember(owner = "client!w", name = "z", descriptor = "[I")
    private static int[] field2826 = new int[8191];

    @OriginalMember(owner = "client!w", name = "C", descriptor = "[I")
    public static int[] field2829 = field2820;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "[I")
    private static int[] field2833 = new int[8191];

    @OriginalMember(owner = "client!w", name = "E", descriptor = "[B")
    private static byte[] field2831 = new byte[8191];

    @OriginalMember(owner = "client!w", name = "D", descriptor = "[I")
    public static int[] field2830 = new int[6];

    @OriginalMember(owner = "client!w", name = "w", descriptor = "[I")
    private static int[] field2823 = field2820;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "I")
    private int field2841;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Lg;")
    private class109 field2821;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "Lb;")
    private class223 field2835;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "[Lk;")
    private class404[] field2839;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "(IIIIII)V")
    private final native void method1252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lud;)V")
    public final void method311(class27 arg0) {
    }

    @OriginalMember(owner = "client!w", name = "m", descriptor = "()V")
    public final void method377() {
        if (this.field2835 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field2835.method1377();
        }
    }

    @OriginalMember(owner = "client!w", name = "SA", descriptor = "(Lc;)V")
    public final native void method367(class125 arg0);

    @OriginalMember(owner = "client!w", name = "x", descriptor = "()Z")
    public final boolean method284() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method1801(0);
        if (this.nativeid != 0L) {
            class512.method3054(-117, this);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public final void method335(int arg0) {
        class512.method3053(0);
        this.method1266(arg0);
        for (class109 var2 = (class109) this.field2819.method2655(15152); var2 != null; var2 = (class109) this.field2819.method2660((byte) 67)) {
            var2.method751();
        }
    }

    @OriginalMember(owner = "client!w", name = "s", descriptor = "(IIII)V")
    public final native void method355(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)I")
    public final int method324(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ldd;Z)Lo;")
    public final class24 method312(class506 arg0, boolean arg1) {
        int[] var3 = arg0.field7496;
        byte[] var4 = arg0.field7490;
        int var5 = arg0.field7495;
        int var6 = arg0.field7489;
        class24 var7;
        if (arg1 && arg0.field7493 == null) {
            var7 = new class299(this, this.field2821, var3, var4, 0, arg0.field7495, arg0.field7495, arg0.field7489);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field7493;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class416(this, this.field2821, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field7496[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class416(this, this.field2821, var9, 0, arg0.field7495, arg0.field7495, arg0.field7489);
                } else {
                    var7 = new class203(this, this.field2821, var9, 0, arg0.field7495, arg0.field7495, arg0.field7489);
                }
            }
        }
        var7.method152(arg0.field7497, arg0.field7492, arg0.field7491, arg0.field7494);
        return var7;
    }

    @OriginalMember(owner = "client!w", name = "o", descriptor = "()Z")
    public final boolean method369() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "()V")
    public final void method303() {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIILta;II)V")
    public final void method330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class145 arg6, int arg7, int arg8) {
        this.method1254(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lsj;)V")
    public final void method359(class324 arg0) {
        this.method1267(arg0, false);
        this.method1263().method2394(this, field2823, field2826, field2833, field2822, arg0.field4726.method105((byte) 92));
    }

    @OriginalMember(owner = "client!w", name = "i", descriptor = "()Z")
    public final boolean method317() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIII)Lo;")
    public final class24 method344(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class416(this, this.field2821, arg0, arg1, arg2, arg3, arg4) : new class203(this, this.field2821, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class416(this, this.field2821, arg0, arg1, arg2, arg3, arg4) : new class203(this, this.field2821, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "()Z")
    public final boolean method364() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
    public final void method306(int arg0) {
        this.field2841 = arg0;
        this.field2839 = new class404[this.field2841];
        for (int var2 = 0; var2 < this.field2841; ++var2) {
            this.field2839[var2] = new class404(this, this.field2834, this.field2838);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II[I[I)Lta;")
    public final class145 method332(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class349(this, this.field2821, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!w", name = "j", descriptor = "()Z")
    public final boolean method339() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "GA", descriptor = "(IIII)V")
    public final native void method390(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method334(Canvas arg0) {
        class223 var2 = (class223) this.field2836.method2405((long) arg0.hashCode(), -63);
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class223 var5 = new class223(this, arg0);
            this.field2836.method2413((long) arg0.hashCode(), var5, -1);
        }
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(Lb;)V")
    private final native void method1253(class223 arg0);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II[[I[[IIII)Lya;")
    public final class38 method314(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class159(this, this.field2821, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method370(Canvas arg0) {
        if (this.field2835.field3210 == arg0) {
            this.method285((Canvas) null);
        }
        class223 var2 = (class223) this.field2836.method2405((long) arg0.hashCode(), -109);
        if (var2 != null) {
            var2.method2891(97);
            var2.method1374();
        }
    }

    @OriginalMember(owner = "client!w", name = "v", descriptor = "()Z")
    public final boolean method326() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "IA", descriptor = "(IIIII)V")
    public final native void method376(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "NA", descriptor = "(IIIIIILta;II)V")
    private final native void method1254(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class145 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "ma", descriptor = "(IIIII)V")
    public final native void method387(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "h", descriptor = "()Lc;")
    public final class125 method368() {
        return this.field2837;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Le;Lsj;Lc;Lwp;I)V")
    public final void method345(class377 arg0, class324 arg1, class125 arg2, class122 arg3, int arg4) {
        this.method1267(arg1, true);
        if (arg3 == null) {
            this.method1263().method2387(this, arg0, arg2, (int[]) null, arg4, field2823, field2826, field2833, field2822, field2831, arg1.field4726.method105((byte) 96), field2829);
        } else {
            field2830[5] = 0;
            this.method1263().method2387(this, arg0, arg2, field2830, arg4, field2823, field2826, field2833, field2822, field2831, arg1.field4726.method105((byte) 120), field2829);
            arg3.field1675 = field2830[0];
            arg3.field1671 = field2830[1];
            arg3.field1673 = field2830[2];
            arg3.field1674 = field2830[3];
            arg3.field1676 = field2830[4];
            arg3.field1672 = field2830[5] != 0;
        }
        class352 var6 = (class352) arg0;
        var6.method2088(0, arg2);
    }

    @OriginalMember(owner = "client!w", name = "ya", descriptor = "(I)V")
    public final native void method286(int arg0);

    @OriginalMember(owner = "client!w", name = "l", descriptor = "()Z")
    public final boolean method362() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "z", descriptor = "()Z")
    public final boolean method323() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method1255(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lul;[Ldd;Z)Lla;")
    public final class319 method313(class411 arg0, class506[] arg1, boolean arg2) {
        return arg2 ? new class72(this, this.field2821, arg0, arg1, (class24[]) null) : new class281(this, this.field2821, arg0, arg1, (class24[]) null);
    }

    @OriginalMember(owner = "client!w", name = "h", descriptor = "(I)Ln;")
    public final class15 method379(int arg0) {
        class109 var2 = new class109(this, arg0);
        this.field2819.method2657(8492, var2);
        return var2;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()Z")
    public final boolean method337() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
    public final void method385(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "QA", descriptor = "(Ln;)V")
    private final native void method1256(class15 arg0);

    @OriginalMember(owner = "client!w", name = "ba", descriptor = "(IIII)V")
    public final native void method301(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(Z)V")
    public final void method349(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
    public final void method389(int arg0) {
        this.field2839[arg0].method2382();
    }

    @OriginalMember(owner = "client!w", name = "w", descriptor = "()Lc;")
    public final class125 method358() {
        return new class166();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIF)Lls;")
    public final class95 method380(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class274(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!w", name = "A", descriptor = "()V")
    public final void method374() {
    }

    @OriginalMember(owner = "client!w", name = "y", descriptor = "()Z")
    public final boolean method308() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "JA", descriptor = "(F)V")
    public final native void method299(float arg0);

    @OriginalMember(owner = "client!w", name = "WA", descriptor = "(I[I[F)V")
    private final native void method1257(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()Z")
    public final boolean method363() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "k", descriptor = "()Z")
    public final boolean method322() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V")
    public final void method331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1263().method2395(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!w", name = "AA", descriptor = "()I")
    public final native int method309();

    @OriginalMember(owner = "client!w", name = "OA", descriptor = "()I")
    public final native int method392();

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ln;)V")
    public final void method356(class15 arg0) {
        this.field2821 = (class109) arg0;
        this.method1256(arg0);
    }

    @OriginalMember(owner = "client!w", name = "VA", descriptor = "(IIIIII)Z")
    public final native boolean method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(FFF)V")
    public final void method294(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
    public final void method353(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "(III)V")
    public final native void method318(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!w", name = "MA", descriptor = "([I)V")
    public final native void method343(int[] arg0);

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method285(Canvas arg0) {
        if (arg0 != null) {
            class223 var2 = (class223) this.field2836.method2405((long) arg0.hashCode(), -59);
            this.field2835 = var2;
            this.method1253(var2);
        } else {
            this.field2835 = null;
            this.method1253((class223) null);
        }
    }

    @OriginalMember(owner = "client!w", name = "K", descriptor = "(IIIIII[BII)V")
    public final native void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "va", descriptor = "()V")
    public final native void method295();

    @OriginalMember(owner = "client!w", name = "HA", descriptor = "(IIII)V")
    public final native void method346(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "pa", descriptor = "()I")
    public final native int method304();

    @OriginalMember(owner = "client!w", name = "sa", descriptor = "(IIII)[I")
    public final native int[] method321(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "t", descriptor = "(I)V")
    public final native void method347(int arg0);

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(IIIIII)Lud;")
    public final class27 method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lud;Lud;FLud;)Lud;")
    public final class27 method351(class27 arg0, class27 arg1, float arg2, class27 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!w", name = "T", descriptor = "()F")
    public final native float method386();

    @OriginalMember(owner = "client!w", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method1258(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
    public final void method297(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "ua", descriptor = "()V")
    private final native void method1259();

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I[Lls;)V")
    public final void method352(int arg0, class95[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field2825[var3++] = arg1[var4].method672((byte) -41);
            field2825[var3++] = arg1[var4].method669((byte) -93);
            field2825[var3++] = arg1[var4].method673(10518);
            field2825[var3++] = arg1[var4].method675((byte) 55);
            field2827[var4] = arg1[var4].method676(false);
            field2825[var3++] = arg1[var4].method671(0);
        }
        this.method1257(arg0, field2825, field2827);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;Lnt;)V")
    public class199(int arg0, Canvas arg1, class16 arg2, class151 arg3) {
        super(arg0, arg2);
        try {
            if (!field2824) {
                if (arg3 != null) {
                    arg3.method965(this.getClass(), (byte) 96);
                    field2824 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("sw3d");
                    field2824 = Boolean.TRUE;
                }
            }
            if (!field2824) {
                throw new RuntimeException("");
            } else {
                this.method1265(super.field4246, 0, 0);
                class108.method737(true, false, (byte) 76);
                this.field2840 = true;
                this.field2837 = new class166();
                this.method367(new class166());
                this.method306(1);
                this.method375(0);
                if (arg1 != null) {
                    this.method334(arg1);
                    this.method285(arg1);
                }
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!w", name = "ZA", descriptor = "(IIIII)V")
    public final native void method328(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "d", descriptor = "()V")
    public final void method341() {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lld;IIII)Le;")
    public final class377 method293(class117 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class352(this, this.field2821, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Le;Lsj;Lc;[Lwp;I)V")
    public final void method310(class377[] arg0, class324 arg1, class125 arg2, class122[] arg3, int arg4) {
        this.method1267(arg1, true);
        if (arg3 == null) {
            this.method1263().method2388(this, arg0, arg2, (int[]) null, arg4, field2823, field2826, field2833, field2822, field2831, arg1.field4726.method105((byte) 108), field2829);
        } else {
            class122 var6 = arg3[0];
            field2830[5] = 0;
            this.method1263().method2388(this, arg0, arg2, field2830, arg4, field2823, field2826, field2833, field2822, field2831, arg1.field4726.method105((byte) 82), field2829);
            var6.field1675 = field2830[0];
            var6.field1671 = field2830[1];
            var6.field1673 = field2830[2];
            var6.field1674 = field2830[3];
            var6.field1676 = field2830[4];
            var6.field1672 = field2830[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class352 var9 = (class352) arg0[var8];
                var9.method2088(var7, arg2);
                if (var9.field5056 != null) {
                    var7 += var9.field5056.length * 9;
                }
                if (var9.field5058 != null) {
                    var7 += var9.field5058.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "u", descriptor = "()Z")
    public final boolean method327() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(FF)V")
    public final native void method365(float arg0, float arg1);

    @OriginalMember(owner = "client!w", name = "r", descriptor = "()I")
    public final native int method357();

    @OriginalMember(owner = "client!w", name = "R", descriptor = "()V")
    private final void method1260() {
        System.gc();
        System.runFinalization();
        class512.method3053(0);
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "()V")
    public final void method342() {
        if (!this.field2832) {
            this.field2839 = null;
            this.field2835 = null;
            this.field2821 = null;
            this.field2837 = null;
            this.field2836.method2408(98);
            for (class109 var1 = (class109) this.field2819.method2655(15152); var1 != null; var1 = (class109) this.field2819.method2660((byte) 67)) {
                var1.method749();
            }
            this.field2819.method2656(107);
            this.method1259();
            if (this.field2840) {
                class311.method1887(true, false, 0);
                this.field2840 = false;
            }
            this.method1260();
            class512.method3052(16028);
            this.field2832 = true;
        }
    }

    @OriginalMember(owner = "client!w", name = "B", descriptor = "()V")
    public final void method354() {
    }

    @OriginalMember(owner = "client!w", name = "X", descriptor = "(S)Z")
    private final boolean method1261(short arg0) {
        synchronized (this) {
            class222 var3 = super.field4246.method83(arg0, 123);
            if (var3 == null) {
                return false;
            } else {
                this.method1255(arg0, var3.field3201, var3.field3191, var3.field3189, var3.field3199, var3.field3190, var3.field3192, var3.field3207, var3.field3197, var3.field3204, var3.field3203, var3.field3196, var3.field3187);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "qa", descriptor = "()Ljava/lang/Object;")
    private final Object method1262() {
        return new class253(this);
    }

    @OriginalMember(owner = "client!w", name = "ra", descriptor = "(ILta;II)V")
    public final native void method300(int arg0, class145 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Le;Lc;[Lwp;I)V")
    public final void method298(class377[] arg0, class125 arg1, class122[] arg2, int arg3) {
        if (arg2 == null) {
            this.method1263().method2396(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class122 var5 = arg2[0];
            field2830[5] = 0;
            this.method1263().method2396(this, arg0, arg1, field2830, -1, arg3);
            var5.field1675 = field2830[0];
            var5.field1671 = field2830[1];
            var5.field1673 = field2830[2];
            var5.field1674 = field2830[3];
            var5.field1676 = field2830[4];
            var5.field1672 = field2830[5] != 0;
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(II)V")
    public final native void method348(int arg0, int arg1);

    @OriginalMember(owner = "client!w", name = "s", descriptor = "()Z")
    public final boolean method360() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "C", descriptor = "()Lk;")
    public final class404 method1263() {
        for (int var1 = 0; var1 < this.field2841; ++var1) {
            if (this.field2839[var1].field5729 == Thread.currentThread()) {
                return this.field2839[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!w", name = "t", descriptor = "()Z")
    public final boolean method372() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(IIIIII)V")
    public final void method340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1252(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method373(Rectangle[] arg0, int arg1) {
        if (this.field2835 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field2835.method1371(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IIIIII)V")
    public final void method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method387(arg0, arg1, arg2, arg4, arg5);
        this.method387(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method376(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method376(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!w", name = "aa", descriptor = "()F")
    public final native float method388();

    @OriginalMember(owner = "client!w", name = "m", descriptor = "(S)Z")
    private final boolean method1264(short arg0) {
        class16 var2 = super.field4246;
        synchronized (super.field4246) {
            if (!super.field4246.method82(arg0, -18226)) {
                return false;
            } else {
                class222 var4 = super.field4246.method83(arg0, 123);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field3199 && var4.field3189) {
                        var6 = super.field4246.method81((byte) 106, 128, arg0, 0.7F, true, 128);
                    } else {
                        var6 = super.field4246.method79(true, 128, arg0, 128, 0.7F, -20550);
                    }
                    this.method1258(arg0, var4.field3201, var4.field3191, var4.field3189, var4.field3199, var4.field3190, var4.field3192, var4.field3207, var4.field3197, var4.field3204, var4.field3203, var4.field3196, var4.field3187, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "W", descriptor = "(Ll;II)V")
    private final native void method1265(class16 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!w", name = "u", descriptor = "(I)V")
    private final native void method1266(int arg0);

    @OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V")
    public final void method375(int arg0) {
        this.field2839[arg0].method2384();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIZ)Lo;")
    public final class24 method307(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class416(this, this.field2821, arg0, arg1, arg2, arg3) : new class203(this, this.field2821, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lsj;Z)V")
    private final void method1267(class324 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class517 var8 = (class517) arg0.field4726.method109(-14019); var8 != null; var8 = (class517) arg0.field4726.method107((byte) -128)) {
            field2823[var3++] = var8.field7605;
            field2823[var3++] = var8.field7616;
            field2823[var3++] = var8.field7615;
            field2826[var4++] = var8.field7606;
            field2822[var6++] = (short) var8.field7607;
            field2833[var5++] = var8.field7610;
            if (arg1) {
                field2831[var7++] = var8.field7612;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "B", descriptor = "(IFFFFF)V")
    public final native void method361(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!w", name = "P", descriptor = "(IIIIII)V")
    public final native void method325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IIII)V")
    public final void method366(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!w", name = "q", descriptor = "()I")
    public final int method371() {
        return 4;
    }

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "()I")
    public final native int method378();

    @OriginalMember(owner = "client!w", name = "g", descriptor = "()V")
    public final void method292() {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I")
    public final int method302(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)V")
    public final native void method333(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method289(Canvas arg0) {
        class223 var2 = (class223) this.field2836.method2405((long) arg0.hashCode(), -59);
        Dimension var3 = arg0.getSize();
        var2.method1373(arg0, var3.width, var3.height);
        if (arg0 != null && this.field2835.field3210 == arg0) {
            this.method285(arg0);
        }
    }

    @OriginalMember(owner = "client!w", name = "v", descriptor = "(III[I)V")
    public final native void method305(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!w", name = "p", descriptor = "()V")
    public final native void method540();

    @OriginalMember(owner = "client!w", name = "n", descriptor = "()V")
    public final native void method320();
}
