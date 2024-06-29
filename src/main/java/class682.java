import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class682 extends class689 implements class89 {

    @OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "Z")
    private boolean field9683 = false;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "Lrh;")
    private class59 field9684 = new class59();

    @OriginalMember(owner = "client!da", name = "M", descriptor = "I")
    private int field9699 = 4096;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    private int field9698 = 4096;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "Lnj;")
    private class436 field9701 = new class436(4);

    @OriginalMember(owner = "client!da", name = "P", descriptor = "Z")
    private boolean field9702 = false;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "Lq;")
    private class111 field9697;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "[I")
    private static int[] field9685 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!da", name = "y", descriptor = "[F")
    private static float[] field9686 = new float[20];

    @OriginalMember(owner = "client!da", name = "D", descriptor = "[B")
    private static byte[] field9690 = new byte[8191];

    @OriginalMember(owner = "client!da", name = "A", descriptor = "[S")
    private static short[] field9688 = new short[8191];

    @OriginalMember(owner = "client!da", name = "B", descriptor = "[I")
    private static int[] field9689 = field9685;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "[I")
    private static int[] field9687 = new int[8191];

    @OriginalMember(owner = "client!da", name = "H", descriptor = "[F")
    private static float[] field9694 = field9686;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "[I")
    public static int[] field9693 = new int[6];

    @OriginalMember(owner = "client!da", name = "I", descriptor = "[I")
    private static int[] field9695 = new int[8191];

    @OriginalMember(owner = "client!da", name = "F", descriptor = "[I")
    public static int[] field9692 = field9685;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "[I")
    private static int[] field9691 = field9685;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
    private int field9703;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "Lq;")
    private class111 field9696;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "Lv;")
    private class13 field9700;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "La;")
    private class405 field9682;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "[Lt;")
    private class135[] field9704;

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V")
    public class682(Canvas arg0, class479 arg1) {
        super(arg1);
        try {
            if (!class552.method3093("sw3d", 0)) {
                throw new RuntimeException("");
            } else {
                class146.method993(-118);
                this.method3765(super.field9731, 0, 0);
                class397.method2352(true, 126, false);
                this.field9702 = true;
                this.field9697 = new class337();
                this.method1887(new class337());
                this.method1793(1);
                this.method1797(0);
                if (arg0 != null) {
                    this.method1907(arg0);
                    this.method1786(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1786(Canvas arg0) {
        if (arg0 != null) {
            class13 var2 = (class13) this.field9701.method2506(42, (long) arg0.hashCode());
            this.field9700 = var2;
            this.method3773(var2);
        } else {
            this.field9700 = null;
            this.method3773((class13) null);
        }
    }

    @OriginalMember(owner = "client!da", name = "v", descriptor = "()I")
    public final native int method1950();

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()V")
    public final void method827() {
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()V")
    public final void method821() {
    }

    @OriginalMember(owner = "client!da", name = "FA", descriptor = "(IIIIII)Z")
    public final native boolean method1932(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lhj;)V")
    public final void method2016(int arg0, class329[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field9691[var3++] = arg1[var4].method2112(0);
            field9691[var3++] = arg1[var4].method2115((byte) -63);
            field9691[var3++] = arg1[var4].method2114((byte) -114);
            field9691[var3++] = arg1[var4].method2110(true);
            field9694[var4] = arg1[var4].method2113((byte) 55);
            field9691[var3++] = arg1[var4].method2109(14463);
        }
        this.method3772(arg0, field9691, field9694);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lob;)V")
    public final void method1961(class309 arg0) {
        this.method3778(arg0, false);
        this.method3767().method886(this, field9689, field9687, field9695, field9688, arg0.field4141.method387((byte) 96));
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(IIIIII)V")
    public final void method1975(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1879(arg0, arg1, arg2, arg4, arg5);
        this.method1879(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1876(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method1876(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "i", descriptor = "()V")
    public final void method801() {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILfa;II)V")
    public final void method2000(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class185 arg6, int arg7, int arg8) {
        this.method3762(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!da", name = "ra", descriptor = "(IIIIIILfa;II)V")
    private final native void method3762(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class185 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!da", name = "L", descriptor = "(ILfa;II)V")
    public final native void method1956(int arg0, class185 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "g", descriptor = "()Z")
    public final boolean method1899() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Li;)V")
    public final void method1877(class173 arg0) {
        this.field9682 = (class405) arg0;
        this.method3766(arg0);
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    private final native void method3763(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public final class176 method1787(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class148(this, this.field9682, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lme;Z)Lxa;")
    public final class424 method1951(class366 arg0, boolean arg1) {
        int[] var3 = arg0.field5248;
        byte[] var4 = arg0.field5256;
        int var5 = arg0.field5252;
        int var6 = arg0.field5253;
        class424 var7;
        if (arg1 && arg0.field5255 == null) {
            var7 = new class555(this, this.field9682, var3, var4, 0, arg0.field5252, arg0.field5252, arg0.field5253);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field5255;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class391(this, this.field9682, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field5248[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class391(this, this.field9682, var9, 0, arg0.field5252, arg0.field5252, arg0.field5253);
                } else {
                    var7 = new class215(this, this.field9682, var9, 0, arg0.field5252, arg0.field5252, arg0.field5253);
                }
            }
        }
        var7.method1155(arg0.field5250, arg0.field5251, arg0.field5254, arg0.field5249);
        return var7;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(IIIII)V")
    public final native void method1879(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "D", descriptor = "(I)V")
    public final native void method806(int arg0);

    @OriginalMember(owner = "client!da", name = "w", descriptor = "()Z")
    public final boolean method1791() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "IA", descriptor = "()I")
    public final native int method1924();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)V")
    public final void method2010(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3777(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V")
    public final void method1800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3767().method877(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!da", name = "j", descriptor = "()Z")
    public final boolean method1992() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "KA", descriptor = "(IIII)[I")
    public final native int[] method797(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public final void method1794(int arg0) {
        this.field9704[arg0].method889();
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "()Z")
    public final boolean method1930() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1790(Canvas arg0) {
        class13 var2 = (class13) this.field9701.method2506(121, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method73(arg0, var3.width, var3.height);
        if (arg0 != null && this.field9700.field119 == arg0) {
            this.method1786(arg0);
        }
    }

    @OriginalMember(owner = "client!da", name = "na", descriptor = "(III[I)V")
    public final native void method1891(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method3764(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!da", name = "e", descriptor = "()Z")
    public final boolean method1989() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I")
    public final int method2007(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!da", name = "C", descriptor = "()V")
    public final void method1929() {
    }

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "(Le;II)V")
    private final native void method3765(class479 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()Z")
    public final boolean method1942() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Li;)V")
    private final native void method3766(class173 arg0);

    @OriginalMember(owner = "client!da", name = "x", descriptor = "()Z")
    public final boolean method1945() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "ma", descriptor = "(IIIIII[BII)V")
    public final native void method2006(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!da", name = "E", descriptor = "()Lt;")
    public final class135 method3767() {
        for (int var1 = 0; var1 < this.field9703; ++var1) {
            if (this.field9704[var1].field1706 == Thread.currentThread()) {
                return this.field9704[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(FFF)V")
    public final void method851(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!da", name = "YA", descriptor = "(IFFFFF)V")
    public final native void method1991(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(Z)V")
    public final void method1798(boolean arg0) {
    }

    @OriginalMember(owner = "client!da", name = "t", descriptor = "()Z")
    public final boolean method842() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIII)Lxa;")
    public final class424 method1894(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class391(this, this.field9682, arg0, arg1, arg2, arg3, arg4) : new class215(this, this.field9682, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class391(this, this.field9682, arg0, arg1, arg2, arg3, arg4) : new class215(this, this.field9682, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lba;Lq;[Lqn;I)V")
    public final void method1799(class629[] arg0, class111 arg1, class455[] arg2, int arg3) {
        if (arg2 == null) {
            this.method3767().method884(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class455 var5 = arg2[0];
            field9693[5] = 0;
            this.method3767().method884(this, arg0, arg1, field9693, -1, arg3);
            var5.field6204 = field9693[0];
            var5.field6203 = field9693[1];
            var5.field6206 = field9693[2];
            var5.field6201 = field9693[3];
            var5.field6205 = field9693[4];
            var5.field6202 = field9693[5] != 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "X", descriptor = "(III)V")
    public final native void method2001(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "s", descriptor = "()V")
    private final void method3768() {
        System.gc();
        System.runFinalization();
        class146.method990(false);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I)Lfa;")
    public final class185 method1982(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class434(this, this.field9682, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!da", name = "HA", descriptor = "()Ljava/lang/Object;")
    private final Object method3769() {
        return new class183(this);
    }

    @OriginalMember(owner = "client!da", name = "k", descriptor = "()V")
    public final native void method1953();

    @OriginalMember(owner = "client!da", name = "D", descriptor = "()Z")
    public final boolean method1901() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "qa", descriptor = "(S)Z")
    private final boolean method3770(short arg0) {
        synchronized (this) {
            class568 var3 = super.field9731.method1728(-114, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method3764(arg0, var3.field7869, var3.field7863, var3.field7864, var3.field7857, var3.field7865, var3.field7855, var3.field7859, var3.field7870, var3.field7858, var3.field7862, var3.field7854, var3.field7861);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIF)Lhj;")
    public final class329 method1940(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class486(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "H", descriptor = "(Z)V")
    public final native void method80(boolean arg0);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1907(Canvas arg0) {
        class13 var2 = (class13) this.field9701.method2506(117, (long) arg0.hashCode());
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class13 var5 = new class13(this, arg0);
            this.field9701.method2504((long) arg0.hashCode(), -102, var5);
        }
    }

    @OriginalMember(owner = "client!da", name = "U", descriptor = "()I")
    public final native int method1990();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Laq;Laq;FLaq;)Laq;")
    public final class108 method796(class108 arg0, class108 arg1, float arg2, class108 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method803(Rectangle[] arg0, int arg1) throws class352 {
        if (this.field9700 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9700.method79(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!da", name = "F", descriptor = "()V")
    public final native void method1984();

    @OriginalMember(owner = "client!da", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method3771(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I[I[F)V")
    private final native void method3772(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "(IIII)V")
    public final native void method1970(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "m", descriptor = "(IIII)V")
    public final native void method1875(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "ca", descriptor = "(IIII)V")
    public final native void method1908(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Laq;)V")
    public final void method1952(class108 arg0) {
    }

    @OriginalMember(owner = "client!da", name = "u", descriptor = "()Z")
    public final boolean method811() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "r", descriptor = "()Z")
    public final boolean method1933() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "LA", descriptor = "(IIII)V")
    public final native void method1888(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "P", descriptor = "(Lv;)V")
    private final native void method3773(class13 arg0);

    @OriginalMember(owner = "client!da", name = "sa", descriptor = "(II)V")
    public final native void method1885(int arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "o", descriptor = "(Lq;)V")
    private final native void method3774(class111 arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lba;Lob;Lq;[Lqn;I)V")
    public final void method1796(class629[] arg0, class309 arg1, class111 arg2, class455[] arg3, int arg4) {
        this.method3778(arg1, true);
        if (arg3 == null) {
            this.method3767().method883(this, arg0, arg2, (int[]) null, arg4, field9689, field9687, field9695, field9688, field9690, arg1.field4141.method387((byte) 120), field9692);
        } else {
            class455 var6 = arg3[0];
            field9693[5] = 0;
            this.method3767().method883(this, arg0, arg2, field9693, arg4, field9689, field9687, field9695, field9688, field9690, arg1.field4141.method387((byte) 84), field9692);
            var6.field6204 = field9693[0];
            var6.field6203 = field9693[1];
            var6.field6206 = field9693[2];
            var6.field6201 = field9693[3];
            var6.field6205 = field9693[4];
            var6.field6202 = field9693[5] != 0;
        }
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                class206 var8 = (class206) arg0[var7];
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(Z)V")
    public final void method778(boolean arg0) {
    }

    @OriginalMember(owner = "client!da", name = "m", descriptor = "()V")
    public final void method843() {
        if (!this.field9683) {
            this.field9704 = null;
            this.field9700 = null;
            this.field9682 = null;
            this.field9697 = null;
            this.field9701.method2510(-1);
            for (class405 var1 = (class405) this.field9684.method374((byte) 80); var1 != null; var1 = (class405) this.field9684.method372(-20740)) {
                var1.method2377();
            }
            this.field9684.method365(-1);
            this.method3775();
            if (this.field9702) {
                class238.method1469(-3, false, true);
                this.field9702 = false;
            }
            this.method3768();
            class146.method992(0);
            this.field9683 = true;
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()I")
    public final int method1962() {
        return 4;
    }

    @OriginalMember(owner = "client!da", name = "B", descriptor = "()Z")
    public final boolean method1988() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIZ)Lxa;")
    public final class424 method1939(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class391(this, this.field9682, arg0, arg1, arg2, arg3) : new class215(this, this.field9682, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lba;Lob;Lq;Lqn;I)V")
    public final void method1892(class629 arg0, class309 arg1, class111 arg2, class455 arg3, int arg4) {
        this.method3778(arg1, true);
        if (arg3 == null) {
            this.method3767().method888(this, arg0, arg2, (int[]) null, arg4, field9689, field9687, field9695, field9688, field9690, arg1.field4141.method387((byte) 83), field9692);
        } else {
            field9693[5] = 0;
            this.method3767().method888(this, arg0, arg2, field9693, arg4, field9689, field9687, field9695, field9688, field9690, arg1.field4141.method387((byte) 100), field9692);
            arg3.field6204 = field9693[0];
            arg3.field6203 = field9693[1];
            arg3.field6206 = field9693[2];
            arg3.field6201 = field9693[3];
            arg3.field6205 = field9693[4];
            arg3.field6202 = field9693[5] != 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
    public final void method785(int arg0) {
        class146.method990(false);
        this.method3763(arg0);
        for (class405 var2 = (class405) this.field9684.method374((byte) 103); var2 != null; var2 = (class405) this.field9684.method372(-20740)) {
            var2.method2378();
        }
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "()V")
    private final native void method3775();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;)V")
    public final void method1887(class111 arg0) {
        this.field9696 = arg0;
        this.method3774(arg0);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1792(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!da", name = "A", descriptor = "()V")
    public final void method839() {
    }

    @OriginalMember(owner = "client!da", name = "JA", descriptor = "(I)V")
    public final native void method1905(int arg0);

    @OriginalMember(owner = "client!da", name = "aa", descriptor = "()I")
    public final native int method1889();

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(S)Z")
    private final boolean method3776(short arg0) {
        class479 var2 = super.field9731;
        synchronized (super.field9731) {
            if (!super.field9731.method1732(arg0, 57)) {
                return false;
            } else {
                class568 var4 = super.field9731.method1728(-100, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field7868) {
                        var6 = super.field9731.method1731(true, 0.7F, 26409, 128, 128, arg0);
                    } else {
                        var6 = super.field9731.method1734(true, 128, 0.7F, 128, arg0, true);
                    }
                    this.method3771(arg0, var4.field7869, var4.field7863, var4.field7864, var4.field7857, var4.field7865, var4.field7855, var4.field7859, var4.field7870, var4.field7858, var4.field7862, var4.field7854, var4.field7861, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(IIIIII)Laq;")
    public final class108 method1954(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!da", name = "ya", descriptor = "(IIIII)V")
    public final native void method1876(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lil;[Lme;Z)Lta;")
    public final class301 method2020(class598 arg0, class366[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field5252;
            var5[var7] = arg1[var7].field5253;
            if (arg1[var7].field5255 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class601(this, this.field9682, arg0, arg1, (class424[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class271(this, this.field9682, arg0, arg1, (class424[]) null);
        }
    }

    @OriginalMember(owner = "client!da", name = "n", descriptor = "()Z")
    public final boolean method1976() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
    public final void method1797(int arg0) {
        this.field9704[arg0].method885();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
    public final void method834(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!da", name = "q", descriptor = "()Z")
    public final boolean method1903() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()Lru;")
    public final class276 method794() {
        return new class276(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!da", name = "z", descriptor = "()Lq;")
    public final class111 method1922() {
        return new class337();
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(I)V")
    public final void method1793(int arg0) {
        this.field9703 = arg0;
        this.field9704 = new class135[this.field9703];
        for (int var2 = 0; var2 < this.field9703; ++var2) {
            this.field9704[var2] = new class135(this, this.field9698, this.field9699);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
    public final int method1987(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method3813(false);
        if (this.nativeid != 0L) {
            class146.method989((byte) 89, this);
        }
    }

    @OriginalMember(owner = "client!da", name = "C", descriptor = "(IIIIII)V")
    public final native void method1926(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lrf;IIII)Lba;")
    public final class629 method1784(class238 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class206(this, this.field9682, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!da", name = "ka", descriptor = "(FF)V")
    public final native void method1957(float arg0, float arg1);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1938(Canvas arg0) {
        if (this.field9700.field119 == arg0) {
            this.method1786((Canvas) null);
        }
        class13 var2 = (class13) this.field9701.method2506(117, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method175(30604);
            var2.method75();
        }
    }

    @OriginalMember(owner = "client!da", name = "A", descriptor = "([I)V")
    public final native void method1910(int[] arg0);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)V")
    public final void method1897(boolean arg0) {
    }

    @OriginalMember(owner = "client!da", name = "BA", descriptor = "(IIIIII)V")
    private final native void method3777(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!da", name = "y", descriptor = "()Z")
    public final boolean method1973() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lob;Z)V")
    private final void method3778(class309 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class220 var8 = (class220) arg0.field4141.method384(-113); var8 != null; var8 = (class220) arg0.field4141.method388(4096)) {
            field9689[var3++] = var8.field2856;
            field9689[var3++] = var8.field2863;
            field9689[var3++] = var8.field2858;
            field9687[var4++] = var8.field2859;
            field9688[var6++] = (short) var8.field2864;
            field9695[var5++] = var8.field2860;
            if (arg1) {
                field9690[var7++] = var8.field2862;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "SA", descriptor = "()I")
    public final native int method791();

    @OriginalMember(owner = "client!da", name = "f", descriptor = "()Lq;")
    public final class111 method1972() {
        return this.field9697;
    }

    @OriginalMember(owner = "client!da", name = "AA", descriptor = "(IIII)V")
    public final native void method1878(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "o", descriptor = "()V")
    public final void method805() throws class352 {
        if (this.field9700 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9700.method78();
        }
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)Li;")
    public final class173 method1918(int arg0) {
        class405 var2 = new class405(this, arg0);
        this.field9684.method378(var2, 31316);
        return var2;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public final void method1983(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!da", name = "p", descriptor = "()V")
    public final void method829() {
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(IIIII)V")
    public final native void method2008(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "ha", descriptor = "(F)V")
    public final native void method1986(float arg0);
}
