import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class261 extends class98 implements class52 {

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Z")
    private boolean field3754 = false;

    @OriginalMember(owner = "client!l", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "Lau;")
    private class692 field3755 = new class692();

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    private int field3761 = 4096;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    private int field3762 = 4096;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "Lmo;")
    private class482 field3760 = new class482(4);

    @OriginalMember(owner = "client!l", name = "P", descriptor = "Z")
    private boolean field3773 = false;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "Lq;")
    private class152 field3767;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "[I")
    private static int[] field3753 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!l", name = "y", descriptor = "[I")
    private static int[] field3757 = new int[8191];

    @OriginalMember(owner = "client!l", name = "G", descriptor = "[B")
    private static byte[] field3764 = new byte[8191];

    @OriginalMember(owner = "client!l", name = "H", descriptor = "[I")
    public static int[] field3765 = field3753;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "[I")
    public static int[] field3759 = new int[6];

    @OriginalMember(owner = "client!l", name = "K", descriptor = "[I")
    private static int[] field3768 = field3753;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "[I")
    private static int[] field3766 = new int[8191];

    @OriginalMember(owner = "client!l", name = "z", descriptor = "[I")
    private static int[] field3758 = field3753;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "[S")
    private static short[] field3770 = new short[8191];

    @OriginalMember(owner = "client!l", name = "N", descriptor = "[F")
    private static float[] field3771 = new float[20];

    @OriginalMember(owner = "client!l", name = "F", descriptor = "[F")
    private static float[] field3763 = field3771;

    @OriginalMember(owner = "client!l", name = "O", descriptor = "I")
    public int field3772;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "Lq;")
    private class152 field3756;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Lm;")
    private class496 field3752;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "Lta;")
    private class593 field3769;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "[Lqa;")
    private class663[] field3774;

    @OriginalMember(owner = "client!l", name = "va", descriptor = "(I)V")
    public final native void method781(int arg0);

    @OriginalMember(owner = "client!l", name = "J", descriptor = "(IIIIII)V")
    public final native void method824(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
    public final int method738(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!l", name = "OA", descriptor = "(Lfa;II)V")
    private final native void method1651(class615 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "JA", descriptor = "()V")
    public final native void method805();

    @OriginalMember(owner = "client!l", name = "z", descriptor = "()Z")
    public final boolean method816() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "L", descriptor = "()V")
    public final native void method821();

    @OriginalMember(owner = "client!l", name = "FA", descriptor = "(ILua;II)V")
    public final native void method780(int arg0, class591 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIII)Lf;")
    public final class257 method806(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class602(this, this.field3752, arg0, arg1, arg2, arg3, arg4) : new class523(this, this.field3752, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class602(this, this.field3752, arg0, arg1, arg2, arg3, arg4) : new class523(this, this.field3752, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!l", name = "IA", descriptor = "(IIIIII[BII)V")
    public final native void method789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "R", descriptor = "()V")
    private final native void method1652();

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public final void method751(int arg0) {
        this.field3772 = arg0;
        this.field3774 = new class663[this.field3772];
        for (int var2 = 0; var2 < this.field3772; ++var2) {
            this.field3774[var2] = new class663(this, this.field3761, this.field3762);
        }
    }

    @OriginalMember(owner = "client!l", name = "v", descriptor = "()[I")
    public final native int[] method826();

    @OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
    public final void method807(int arg0) {
        this.field3774[arg0].method3729();
    }

    @OriginalMember(owner = "client!l", name = "la", descriptor = "(IIII)V")
    public final native void method819(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "qa", descriptor = "(I)V")
    private final native void method1653(int arg0);

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method803(Canvas arg0) {
        if (this.field3769.field8606 == arg0) {
            this.method758((Canvas) null);
        }
        class593 var2 = (class593) this.field3760.method2818(-22803, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2549((byte) 106);
            var2.method3398();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lll;[Lfda;Z)Lla;")
    public final class395 method804(class490 arg0, class628[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field8936;
            var5[var7] = arg1[var7].field8940;
            if (arg1[var7].field8934 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class267(this, this.field3752, arg0, arg1, (class257[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class120(this, this.field3752, arg0, arg1, (class257[]) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "A", descriptor = "()V")
    public final void method102() {
    }

    @OriginalMember(owner = "client!l", name = "MA", descriptor = "(III[I)V")
    public final native void method787(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!l", name = "D", descriptor = "()Lqa;")
    public final class663 method1654() {
        for (int var1 = 0; var1 < this.field3772; ++var1) {
            if (this.field3774[var1].field9315 == Thread.currentThread()) {
                return this.field3774[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!l", name = "k", descriptor = "()Lq;")
    public final class152 method777() {
        return this.field3767;
    }

    @OriginalMember(owner = "client!l", name = "m", descriptor = "()Lsr;")
    public final class568 method77() {
        return new class568(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
    public final void method774(int arg0) {
        this.field3774[arg0].method3733();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lpa;Lpa;FLpa;)Lpa;")
    public final class587 method83(class587 arg0, class587 arg1, float arg2, class587 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V")
    public final void method743(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1654().method3736(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method1655(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
    public final native int method796();

    @OriginalMember(owner = "client!l", name = "ia", descriptor = "(Lta;)V")
    private final native void method1656(class593 arg0);

    @OriginalMember(owner = "client!l", name = "UA", descriptor = "(Z)V")
    public final native void method411(boolean arg0);

    @OriginalMember(owner = "client!l", name = "f", descriptor = "()Z")
    public final boolean method757() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)Le;")
    public final class698 method783(int arg0) {
        class496 var2 = new class496(this, arg0);
        this.field3755.method3904(var2, 0);
        return var2;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public final class682 method768(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class378(this, this.field3752, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "DA", descriptor = "()I")
    public final native int method144();

    @OriginalMember(owner = "client!l", name = "w", descriptor = "(IIIIII)V")
    private final native void method1657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "pa", descriptor = "(III)V")
    public final native void method763(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "GA", descriptor = "(II)V")
    public final native void method765(int arg0, int arg1);

    @OriginalMember(owner = "client!l", name = "xa", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method1658(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!l", name = "ma", descriptor = "(Lt;)V")
    private final native void method1659(class602 arg0);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lcr;IIII)Lda;")
    public final class397 method795(class163 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class147(this, this.field3752, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!l", name = "t", descriptor = "()Z")
    public final boolean method801() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([I)V")
    public final void method769(int[] arg0) {
        Dimension var2 = this.field3769.field8606.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
    public final void method97(boolean arg0) {
    }

    @OriginalMember(owner = "client!l", name = "q", descriptor = "(Lva;)V")
    private final native void method1660(class523 arg0);

    @OriginalMember(owner = "client!l", name = "u", descriptor = "()I")
    public final int method802() {
        return 4;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method758(Canvas arg0) {
        if (arg0 != null) {
            class593 var2 = (class593) this.field3760.method2818(-22803, (long) arg0.hashCode());
            this.field3769 = var2;
            this.method1656(var2);
        } else {
            this.field3769 = null;
            this.method1656((class593) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "w", descriptor = "()Lq;")
    public final class152 method812() {
        return new class361();
    }

    @OriginalMember(owner = "client!l", name = "o", descriptor = "()Z")
    public final boolean method786() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "()V")
    public final void method137() {
    }

    @OriginalMember(owner = "client!l", name = "NA", descriptor = "(Lq;)V")
    private final native void method1661(class152 arg0);

    @OriginalMember(owner = "client!l", name = "ya", descriptor = "()V")
    public final native void method138();

    @OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method753(1);
        if (this.nativeid != 0L) {
            class388.method2372(this, 0);
        }
    }

    @OriginalMember(owner = "client!l", name = "EA", descriptor = "(Le;)V")
    private final native void method1662(class698 arg0);

    @OriginalMember(owner = "client!l", name = "oa", descriptor = "([I)V")
    public final native void method764(int[] arg0);

    @OriginalMember(owner = "client!l", name = "s", descriptor = "()Z")
    public final boolean method798() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "l", descriptor = "()Z")
    public final boolean method778() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(IIII)[I")
    public final native int[] method133(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "q", descriptor = "()V")
    public final void method87() throws class300 {
        if (this.field3769 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field3769.method3393();
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIII)V")
    public final void method791(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method741(arg0, arg1, arg2, arg4, arg5);
        this.method741(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method817(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method817(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "n", descriptor = "()Z")
    public final boolean method785() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "W", descriptor = "(S)Z")
    private final boolean method1663(short arg0) {
        class615 var2 = super.field1459;
        synchronized (super.field1459) {
            if (!super.field1459.method2363((byte) -127, arg0)) {
                return false;
            } else {
                class377 var4 = super.field1459.method2359(-123, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field5225) {
                        var6 = super.field1459.method2360(128, true, arg0, (byte) 118, 0.7F, 128);
                    } else {
                        var6 = super.field1459.method2365(128, arg0, true, -91, 0.7F, 128);
                    }
                    this.method1658(arg0, var4.field5227, var4.field5233, var4.field5219, var4.field5232, var4.field5218, var4.field5220, var4.field5224, var4.field5217, var4.field5223, var4.field5236, var4.field5234, var4.field5221, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lf;Z)V")
    public final void method68(class257 arg0, boolean arg1) {
        if (arg0 instanceof class523) {
            this.method1660((class523) arg0);
        } else if (arg0 instanceof class602) {
            this.method1659((class602) arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "ja", descriptor = "(I)V")
    public final native void method118(int arg0);

    @OriginalMember(owner = "client!l", name = "XA", descriptor = "(IIIII)V")
    public final native void method741(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Le;)V")
    public final void method822(class698 arg0) {
        this.field3752 = (class496) arg0;
        this.method1662(arg0);
    }

    @OriginalMember(owner = "client!l", name = "I", descriptor = "(I[I[F)V")
    private final native void method1664(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!l", name = "B", descriptor = "()Z")
    public final boolean method95() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "BA", descriptor = "()I")
    public final native int method820();

    @OriginalMember(owner = "client!l", name = "WA", descriptor = "()V")
    private final void method1665() {
        System.gc();
        System.runFinalization();
        class388.method2370(-111);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()Z")
    public final boolean method739() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "YA", descriptor = "(IIII)V")
    public final native void method809(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V")
    public final void method782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1657(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lq;)V")
    public final void method755(class152 arg0) {
        this.field3756 = arg0;
        this.method1661(arg0);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[I[I)Lua;")
    public final class591 method748(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class649(this, this.field3752, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!l", name = "m", descriptor = "(IIIII)V")
    public final native void method817(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "AA", descriptor = "(III[I)V")
    public final native void method810(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!l", name = "U", descriptor = "()I")
    public final native int method746();

    @OriginalMember(owner = "client!l", name = "j", descriptor = "()V")
    public final void method776() {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lqg;I)V")
    public final void method799(class272 arg0, int arg1) {
        this.method1666(arg0, false);
        this.method1654().method3734(this, field3768, field3766, field3757, field3770, arg0.field3898.method267((byte) 124));
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "()Lq;")
    public final class152 method740() {
        return this.field3756;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lqg;Z)V")
    private final void method1666(class272 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class193 var8 = (class193) arg0.field3898.method266(114); var8 != null; var8 = (class193) arg0.field3898.method265((byte) -39)) {
            field3768[var3++] = var8.field2998;
            field3768[var3++] = var8.field2994;
            field3768[var3++] = var8.field2992;
            field3766[var4++] = var8.field2996;
            field3770[var6++] = (short) var8.field2995;
            field3757[var5++] = var8.field2987;
            if (arg1) {
                field3764[var7++] = var8.field2991;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "O", descriptor = "(IIIIII)Z")
    public final native boolean method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Lf;")
    public final class257 method825(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class602(this, this.field3752, arg0, arg1) : new class523(this, this.field3752, arg0, arg1);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
    public final native int method775();

    @OriginalMember(owner = "client!l", name = "i", descriptor = "()Z")
    public final boolean method100() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(IIIIII)Lpa;")
    public final class587 method797(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILua;II)V")
    public final void method779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class591 arg6, int arg7, int arg8) {
        this.method1669(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lpa;)V")
    public final void method744(class587 arg0) {
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIII)V")
    public final native void method747(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "fa", descriptor = "()Ljava/lang/Object;")
    private final Object method1667() {
        return new class214(this);
    }

    @OriginalMember(owner = "client!l", name = "y", descriptor = "()Z")
    public final boolean method814() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "C", descriptor = "()V")
    public final void method67() {
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public final void method752(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
    public final void method793(boolean arg0) {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method811(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method808(Canvas arg0) {
        class593 var2 = (class593) this.field3760.method2818(-22803, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method3395(arg0, var3.width, var3.height);
        if (arg0 != null && this.field3769.field8606 == arg0) {
            this.method758(arg0);
        }
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "()Z")
    public final boolean method767() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class257 method749(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class602(this, this.field3752, arg0, arg1, arg2, arg3) : new class523(this, this.field3752, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!l", name = "A", descriptor = "(S)Z")
    private final boolean method1668(short arg0) {
        synchronized (this) {
            class377 var3 = super.field1459.method2359(-128, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method1655(arg0, var3.field5227, var3.field5233, var3.field5219, var3.field5232, var3.field5218, var3.field5220, var3.field5224, var3.field5217, var3.field5223, var3.field5236, var3.field5234, var3.field5221);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "()Z")
    public final boolean method766() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "(IIIIIILua;II)V")
    private final native void method1669(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class591 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method93(Rectangle[] arg0, int arg1) throws class300 {
        if (this.field3769 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field3769.method3396(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lqg;)V")
    public final void method737(class272 arg0) {
        this.method1666(arg0, false);
        this.method1654().method3734(this, field3768, field3766, field3757, field3770, arg0.field3898.method267((byte) 122));
    }

    @OriginalMember(owner = "client!l", name = "x", descriptor = "()V")
    public final void method88() {
        this.method758(this.field3769.field8606);
    }

    @OriginalMember(owner = "client!l", name = "ZA", descriptor = "(Z)V")
    public final native void method770(boolean arg0);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[Lam;)V")
    public final void method823(int arg0, class289[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field3758[var3++] = arg1[var4].method1776((byte) -116);
            field3758[var3++] = arg1[var4].method1775((byte) 77);
            field3758[var3++] = arg1[var4].method1771(true);
            field3758[var3++] = arg1[var4].method1772(true);
            field3763[var4] = arg1[var4].method1777(-4);
            field3758[var3++] = arg1[var4].method1774(33);
        }
        this.method1664(arg0, field3758, field3763);
    }

    @OriginalMember(owner = "client!l", name = "V", descriptor = "(IIII)V")
    public final native void method818(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;)V")
    public class261(Canvas arg0, class615 arg1) {
        super(arg1);
        try {
            if (!class331.method1968("sw3d", (byte) 104)) {
                throw new RuntimeException("");
            } else {
                class388.method2371(0);
                this.method1651(super.field1459, 0, 0);
                class12.method62(true, false, (byte) 120);
                this.field3773 = true;
                this.field3767 = new class361();
                this.method755(new class361());
                this.method751(1);
                this.method807(0);
                if (arg0 != null) {
                    this.method800(arg0);
                    this.method758(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "CA", descriptor = "(IIII)V")
    public final native void method760(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "r", descriptor = "()V")
    public final void method128() {
    }

    @OriginalMember(owner = "client!l", name = "da", descriptor = "(IIII)V")
    public final native void method771(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIF)Lam;")
    public final class289 method784(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class318(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "()Z")
    public final boolean method742() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "p", descriptor = "()V")
    public final void method105() {
        if (!this.field3754) {
            this.field3774 = null;
            this.field3769 = null;
            this.field3752 = null;
            this.field3767 = null;
            this.field3760.method2821(1);
            for (class496 var1 = (class496) this.field3755.method3905(-114); var1 != null; var1 = (class496) this.field3755.method3899(0)) {
                var1.method2976();
            }
            this.field3755.method3896(3);
            this.method1652();
            if (this.field3773) {
                class487.method2849(34037, false, true);
                this.field3773 = false;
            }
            this.method1665();
            class388.method2373(-117);
            this.field3754 = true;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method800(Canvas arg0) {
        class593 var2 = (class593) this.field3760.method2818(-22803, (long) arg0.hashCode());
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class593 var5 = new class593(this, arg0);
            this.field3760.method2816(var5, (long) arg0.hashCode(), false);
        }
    }

    @OriginalMember(owner = "client!l", name = "ra", descriptor = "(F)V")
    public final native void method794(float arg0);

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(I)V")
    public final void method147(int arg0) {
        class388.method2370(-84);
        this.method1653(arg0);
        for (class496 var2 = (class496) this.field3755.method3905(-109); var2 != null; var2 = (class496) this.field3755.method3899(0)) {
            var2.method2977();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFF)V")
    public final void method80(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!l", name = "VA", descriptor = "(IFFFFF)V")
    public final native void method756(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lfda;Z)Lf;")
    public final class257 method772(class628 arg0, boolean arg1) {
        int[] var3 = arg0.field8938;
        byte[] var4 = arg0.field8939;
        int var5 = arg0.field8936;
        int var6 = arg0.field8940;
        class257 var7;
        if (arg1 && arg0.field8934 == null) {
            var7 = new class601(this, this.field3752, var3, var4, 0, arg0.field8936, arg0.field8936, arg0.field8940);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field8934;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class602(this, this.field3752, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field8938[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class602(this, this.field3752, var9, 0, arg0.field8936, arg0.field8936, arg0.field8940);
                } else {
                    var7 = new class523(this, this.field3752, var9, 0, arg0.field8936, arg0.field8936, arg0.field8940);
                }
            }
        }
        var7.method7(arg0.field8933, arg0.field8935, arg0.field8932, arg0.field8937);
        return var7;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I")
    public final int method754(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
    public final void method108(int arg0, int arg1, int arg2, int arg3) {
    }
}
