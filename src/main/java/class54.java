import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class54 extends class605 implements class137 {

    @OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "Z")
    private boolean field600 = false;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "Leea;")
    private class114 field598 = new class114();

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    private int field611 = 4096;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "I")
    private int field617 = 4096;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "Lsd;")
    private class80 field615 = new class80(4);

    @OriginalMember(owner = "client!da", name = "K", descriptor = "Z")
    private boolean field619 = false;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "Lq;")
    private class364 field613;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "[I")
    private static int[] field601 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!da", name = "u", descriptor = "[I")
    private static int[] field603 = field601;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "[I")
    public static int[] field602 = field601;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "[I")
    private static int[] field608 = new int[8191];

    @OriginalMember(owner = "client!da", name = "x", descriptor = "[B")
    private static byte[] field606 = new byte[8191];

    @OriginalMember(owner = "client!da", name = "w", descriptor = "[I")
    private static int[] field605 = field601;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "[S")
    private static short[] field607 = new short[8191];

    @OriginalMember(owner = "client!da", name = "v", descriptor = "[F")
    private static float[] field604 = new float[20];

    @OriginalMember(owner = "client!da", name = "F", descriptor = "[I")
    public static int[] field614 = new int[6];

    @OriginalMember(owner = "client!da", name = "D", descriptor = "[I")
    private static int[] field612 = new int[8191];

    @OriginalMember(owner = "client!da", name = "A", descriptor = "[F")
    private static float[] field609 = field604;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    private int field618;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "Lq;")
    private class364 field616;

    @OriginalMember(owner = "client!da", name = "B", descriptor = "Lv;")
    private class503 field610;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "La;")
    private class537 field599;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "[Lt;")
    private class583[] field620;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I")
    public final int method293(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!da", name = "FA", descriptor = "(IIIIII)Z")
    public final native boolean method295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
    public final void method296(int arg0) {
        this.field620[arg0].method3392();
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "()Z")
    public final boolean method297() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method298(Canvas arg0) {
        class503 var2 = (class503) this.field615.method524((byte) 109, (long) arg0.hashCode());
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class503 var5 = new class503(this, arg0);
            this.field615.method520((byte) -71, var5, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(IIIIII)V")
    public final void method299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method306(arg0, arg1, arg2, arg4, arg5);
        this.method306(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method384(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method384(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
    public final int method300(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I)Lfa;")
    public final class199 method301(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class653(this, this.field599, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!da", name = "ka", descriptor = "(FF)V")
    public final native void method302(float arg0, float arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILfa;II)V")
    public final void method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class199 arg6, int arg7, int arg8) {
        this.method321(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public final class132 method304(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class47(this, this.field599, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!da", name = "U", descriptor = "()I")
    public final native int method305();

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(IIIII)V")
    public final native void method306(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lba;Lbe;Lq;Lsda;I)V")
    public final void method307(class327 arg0, class33 arg1, class364 arg2, class219 arg3, int arg4) {
        this.method386(arg1, true);
        if (arg3 == null) {
            this.method339().method3394(this, arg0, arg2, (int[]) null, arg4, field603, field612, field608, field607, field606, arg1.field378.method1488(false), field602);
        } else {
            field614[5] = 0;
            this.method339().method3394(this, arg0, arg2, field614, arg4, field603, field612, field608, field607, field606, arg1.field378.method1488(false), field602);
            arg3.field3001 = field614[0];
            arg3.field3002 = field614[1];
            arg3.field2998 = field614[2];
            arg3.field3003 = field614[3];
            arg3.field2999 = field614[4];
            arg3.field3000 = field614[5] != 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)Ldw;")
    public final class622 method308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!da", name = "m", descriptor = "(IIII)V")
    public final native void method309(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "YA", descriptor = "(IFFFFF)V")
    public final native void method310(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "(Le;II)V")
    private final native void method311(class462 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "L", descriptor = "(ILfa;II)V")
    public final native void method312(int arg0, class199 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "()V")
    private final native void method313();

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Li;)V")
    public final void method314(class35 arg0) {
        this.field599 = (class537) arg0;
        this.method318(arg0);
    }

    @OriginalMember(owner = "client!da", name = "ha", descriptor = "(F)V")
    public final native void method315(float arg0);

    @OriginalMember(owner = "client!da", name = "P", descriptor = "(Lv;)V")
    private final native void method316(class503 arg0);

    @OriginalMember(owner = "client!da", name = "g", descriptor = "()V")
    public final void method317() {
    }

    @OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method3522(16384);
        if (this.nativeid != 0L) {
            class284.method1838(this, -55);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Li;)V")
    private final native void method318(class35 arg0);

    @OriginalMember(owner = "client!da", name = "LA", descriptor = "(IIII)V")
    public final native void method319(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IIIIII)V")
    public final void method320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method397(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "ra", descriptor = "(IIIIIILfa;II)V")
    private final native void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class199 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!da", name = "x", descriptor = "()Z")
    public final boolean method322() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
    public final void method323(boolean arg0) {
    }

    @OriginalMember(owner = "client!da", name = "C", descriptor = "()I")
    public final int method324() {
        return 4;
    }

    @OriginalMember(owner = "client!da", name = "j", descriptor = "()Z")
    public final boolean method325() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lor;IIII)Lba;")
    public final class327 method326(class557 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class470(this, this.field599, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(IIIII)V")
    public final native void method327(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lba;Lbe;Lq;[Lsda;I)V")
    public final void method328(class327[] arg0, class33 arg1, class364 arg2, class219[] arg3, int arg4) {
        this.method386(arg1, true);
        if (arg3 == null) {
            this.method339().method3390(this, arg0, arg2, (int[]) null, arg4, field603, field612, field608, field607, field606, arg1.field378.method1488(false), field602);
        } else {
            class219 var6 = arg3[0];
            field614[5] = 0;
            this.method339().method3390(this, arg0, arg2, field614, arg4, field603, field612, field608, field607, field606, arg1.field378.method1488(false), field602);
            var6.field3001 = field614[0];
            var6.field3002 = field614[1];
            var6.field2998 = field614[2];
            var6.field3003 = field614[3];
            var6.field2999 = field614[4];
            var6.field3000 = field614[5] != 0;
        }
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                class470 var8 = (class470) arg0[var7];
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lcq;[Laf;Z)Lta;")
    public final class181 method329(class402 arg0, class372[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field5688;
            var5[var7] = arg1[var7].field5692;
            if (arg1[var7].field5684 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class282(this, this.field599, arg0, arg1, (class433[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class12(this, this.field599, arg0, arg1, (class433[]) null);
        }
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "()Lnl;")
    public final class479 method330() {
        return new class479(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!da", name = "r", descriptor = "()Z")
    public final boolean method331() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
    public final void method332(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "(IIII)V")
    public final native void method333(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "D", descriptor = "()Z")
    public final boolean method334() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "A", descriptor = "()Z")
    public final boolean method335() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "o", descriptor = "(Lq;)V")
    private final native void method336(class364 arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()Lq;")
    public final class364 method337() {
        return new class532();
    }

    @OriginalMember(owner = "client!da", name = "q", descriptor = "()V")
    public final void method338() throws class27 {
        if (this.field610 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field610.method2999();
        }
    }

    @OriginalMember(owner = "client!da", name = "E", descriptor = "()Lt;")
    public final class583 method339() {
        for (int var1 = 0; var1 < this.field618; ++var1) {
            if (this.field620[var1].field8390 == Thread.currentThread()) {
                return this.field620[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Loj;)V")
    public final void method340(int arg0, class321[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field605[var3++] = arg1[var4].method2093((byte) 60);
            field605[var3++] = arg1[var4].method2097((byte) -97);
            field605[var3++] = arg1[var4].method2095(true);
            field605[var3++] = arg1[var4].method2094(0);
            field609[var4] = arg1[var4].method2091(-918913433);
            field605[var3++] = arg1[var4].method2098((byte) 89);
        }
        this.method376(arg0, field605, field609);
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "()Z")
    public final boolean method341() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "p", descriptor = "()Lq;")
    public final class364 method342() {
        return this.field613;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIII)Lxa;")
    public final class433 method343(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class419(this, this.field599, arg0, arg1, arg2, arg3, arg4) : new class235(this, this.field599, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class419(this, this.field599, arg0, arg1, arg2, arg3, arg4) : new class235(this, this.field599, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!da", name = "H", descriptor = "(Z)V")
    public final native void method70(boolean arg0);

    @OriginalMember(owner = "client!da", name = "D", descriptor = "(I)V")
    public final native void method344(int arg0);

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
    public final void method345(int arg0) {
        this.field620[arg0].method3387();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIF)Loj;")
    public final class321 method346(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class515(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method347(Canvas arg0) {
        class503 var2 = (class503) this.field615.method524((byte) 114, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method2998(arg0, var3.width, var3.height);
        if (arg0 != null && this.field610.field7294 == arg0) {
            this.method361(arg0);
        }
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(I)V")
    public final void method348(int arg0) {
        this.field618 = arg0;
        this.field620 = new class583[this.field618];
        for (int var2 = 0; var2 < this.field618; ++var2) {
            this.field620[var2] = new class583(this, this.field611, this.field617);
        }
    }

    @OriginalMember(owner = "client!da", name = "m", descriptor = "()V")
    public final void method349() {
    }

    @OriginalMember(owner = "client!da", name = "t", descriptor = "()V")
    public final void method350() {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V")
    public final void method351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method339().method3381(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!da", name = "X", descriptor = "(III)V")
    public final native void method352(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "qa", descriptor = "(S)Z")
    private final boolean method353(short arg0) {
        synchronized (this) {
            class614 var3 = super.field8852.method438(55, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method391(arg0, var3.field8926, var3.field8939, var3.field8938, var3.field8928, var3.field8948, var3.field8927, var3.field8933, var3.field8935, var3.field8934, var3.field8930, var3.field8932, var3.field8947);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "z", descriptor = "()V")
    public final void method354() {
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(I)Li;")
    public final class35 method355(int arg0) {
        class537 var2 = new class537(this, arg0);
        this.field598.method706(var2, true);
        return var2;
    }

    @OriginalMember(owner = "client!da", name = "i", descriptor = "()Z")
    public final boolean method356() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method357(Canvas arg0) {
        if (this.field610.field7294 == arg0) {
            this.method361((Canvas) null);
        }
        class503 var2 = (class503) this.field615.method524((byte) 105, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2108(true);
            var2.method2996();
        }
    }

    @OriginalMember(owner = "client!da", name = "s", descriptor = "()V")
    private final void method358() {
        System.gc();
        System.runFinalization();
        class284.method1836(0);
    }

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()Z")
    public final boolean method359() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    private final native void method360(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method361(Canvas arg0) {
        if (arg0 != null) {
            class503 var2 = (class503) this.field615.method524((byte) 97, (long) arg0.hashCode());
            this.field610 = var2;
            this.method316(var2);
        } else {
            this.field610 = null;
            this.method316((class503) null);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()V")
    public final void method362() {
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()Z")
    public final boolean method363() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "na", descriptor = "(III[I)V")
    public final native void method364(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!da", name = "AA", descriptor = "(IIII)V")
    public final native void method365(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "HA", descriptor = "()Ljava/lang/Object;")
    private final Object method366() {
        return new class312(this);
    }

    @OriginalMember(owner = "client!da", name = "o", descriptor = "()V")
    public final void method367() {
        if (!this.field600) {
            this.field620 = null;
            this.field610 = null;
            this.field599 = null;
            this.field613 = null;
            this.field615.method528(-519011192);
            for (class537 var1 = (class537) this.field598.method719(false); var1 != null; var1 = (class537) this.field598.method716(14)) {
                var1.method3131();
            }
            this.field598.method718(-116);
            this.method313();
            if (this.field619) {
                class98.method614(1, true, false);
                this.field619 = false;
            }
            this.method358();
            class284.method1837(-16497);
            this.field600 = true;
        }
    }

    @OriginalMember(owner = "client!da", name = "ca", descriptor = "(IIII)V")
    public final native void method368(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "IA", descriptor = "()I")
    public final native int method369();

    @OriginalMember(owner = "client!da", name = "w", descriptor = "()Z")
    public final boolean method370() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ldw;Ldw;FLdw;)Ldw;")
    public final class622 method371(class622 arg0, class622 arg1, float arg2, class622 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!da", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method372(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!da", name = "k", descriptor = "()V")
    public final native void method373();

    @OriginalMember(owner = "client!da", name = "aa", descriptor = "()I")
    public final native int method374();

    @OriginalMember(owner = "client!da", name = "SA", descriptor = "()I")
    public final native int method375();

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I[I[F)V")
    private final native void method376(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(S)Z")
    private final boolean method377(short arg0) {
        class462 var2 = super.field8852;
        synchronized (super.field8852) {
            if (!super.field8852.method436(arg0, -5686)) {
                return false;
            } else {
                class614 var4 = super.field8852.method438(110, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field8943) {
                        var6 = super.field8852.method432(128, 0.7F, arg0, 128, -18170, true);
                    } else {
                        var6 = super.field8852.method433(99, true, 128, arg0, 128, 0.7F);
                    }
                    this.method372(arg0, var4.field8926, var4.field8939, var4.field8938, var4.field8928, var4.field8948, var4.field8927, var4.field8933, var4.field8935, var4.field8934, var4.field8930, var4.field8932, var4.field8947, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)V")
    public final void method378(boolean arg0) {
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()V")
    public final void method379() {
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
    public final void method380(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!da", name = "v", descriptor = "()I")
    public final native int method381();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;)V")
    public final void method382(class364 arg0) {
        this.field616 = arg0;
        this.method336(arg0);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method383(Rectangle[] arg0, int arg1) throws class27 {
        if (this.field610 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field610.method3001(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!da", name = "ya", descriptor = "(IIIII)V")
    public final native void method384(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lba;Lq;[Lsda;I)V")
    public final void method385(class327[] arg0, class364 arg1, class219[] arg2, int arg3) {
        if (arg2 == null) {
            this.method339().method3393(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class219 var5 = arg2[0];
            field614[5] = 0;
            this.method339().method3393(this, arg0, arg1, field614, -1, arg3);
            var5.field3001 = field614[0];
            var5.field3002 = field614[1];
            var5.field2998 = field614[2];
            var5.field3003 = field614[3];
            var5.field2999 = field614[4];
            var5.field3000 = field614[5] != 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lbe;Z)V")
    private final void method386(class33 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class251 var8 = (class251) arg0.field378.method1484((byte) 108); var8 != null; var8 = (class251) arg0.field378.method1487(4)) {
            field603[var3++] = var8.field3569;
            field603[var3++] = var8.field3568;
            field603[var3++] = var8.field3559;
            field612[var4++] = var8.field3560;
            field607[var6++] = (short) var8.field3562;
            field608[var5++] = var8.field3556;
            if (arg1) {
                field606[var7++] = var8.field3561;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(FFF)V")
    public final void method387(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Laf;Z)Lxa;")
    public final class433 method388(class372 arg0, boolean arg1) {
        int[] var3 = arg0.field5691;
        byte[] var4 = arg0.field5685;
        int var5 = arg0.field5688;
        int var6 = arg0.field5692;
        class433 var7;
        if (arg1 && arg0.field5684 == null) {
            var7 = new class389(this, this.field599, var3, var4, 0, arg0.field5688, arg0.field5688, arg0.field5692);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field5684;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class419(this, this.field599, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field5691[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class419(this, this.field599, var9, 0, arg0.field5688, arg0.field5688, arg0.field5692);
                } else {
                    var7 = new class235(this, this.field599, var9, 0, arg0.field5688, arg0.field5688, arg0.field5692);
                }
            }
        }
        var7.method1580(arg0.field5686, arg0.field5687, arg0.field5690, arg0.field5689);
        return var7;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIZ)Lxa;")
    public final class433 method389(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class419(this, this.field599, arg0, arg1, arg2, arg3) : new class235(this, this.field599, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!da", name = "n", descriptor = "()Z")
    public final boolean method390() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method391(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ldw;)V")
    public final void method392(class622 arg0) {
    }

    @OriginalMember(owner = "client!da", name = "sa", descriptor = "(II)V")
    public final native void method393(int arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "C", descriptor = "(IIIIII)V")
    public final native void method394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!da", name = "y", descriptor = "()Z")
    public final boolean method395() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lbe;)V")
    public final void method396(class33 arg0) {
        this.method386(arg0, false);
        this.method339().method3386(this, field603, field612, field608, field607, arg0.field378.method1488(false));
    }

    @OriginalMember(owner = "client!da", name = "BA", descriptor = "(IIIIII)V")
    private final native void method397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!da", name = "u", descriptor = "()Z")
    public final boolean method398() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "B", descriptor = "()Z")
    public final boolean method399() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public final void method400(int arg0) {
        class284.method1836(0);
        this.method360(arg0);
        for (class537 var2 = (class537) this.field598.method719(false); var2 != null; var2 = (class537) this.field598.method716(14)) {
            var2.method3133();
        }
    }

    @OriginalMember(owner = "client!da", name = "ma", descriptor = "(IIIIII[BII)V")
    public final native void method401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(Z)V")
    public final void method402(boolean arg0) {
    }

    @OriginalMember(owner = "client!da", name = "A", descriptor = "([I)V")
    public final native void method403(int[] arg0);

    @OriginalMember(owner = "client!da", name = "F", descriptor = "()V")
    public final native void method404();

    @OriginalMember(owner = "client!da", name = "KA", descriptor = "(IIII)[I")
    public final native int[] method405(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "JA", descriptor = "(I)V")
    public final native void method406(int arg0);

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V")
    public class54(Canvas arg0, class462 arg1) {
        super(arg1);
        try {
            if (!class636.method3630(107, "sw3d")) {
                throw new RuntimeException("");
            } else {
                class284.method1839(114);
                this.method311(super.field8852, 0, 0);
                class27.method157(true, false, (byte) 2);
                this.field619 = true;
                this.field613 = new class532();
                this.method382(new class532());
                this.method348(1);
                this.method345(0);
                if (arg0 != null) {
                    this.method298(arg0);
                    this.method361(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }
}
