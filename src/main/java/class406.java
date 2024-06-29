import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class406 extends class543 implements class2 {

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Z")
    private boolean field5777 = false;

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Lmr;")
    private class611 field5775 = new class611();

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
    private int field5789 = 4096;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
    private int field5791 = 4096;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "Lqp;")
    private class715 field5792 = new class715(4);

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "Z")
    private boolean field5797 = false;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "Lsk;")
    private class121 field5790;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "[I")
    private static int[] field5776 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "[I")
    private static int[] field5779 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "[S")
    private static short[] field5782 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "[F")
    private static float[] field5785 = new float[20];

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "[F")
    private static float[] field5780 = field5785;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "[I")
    private static int[] field5786 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "[B")
    private static byte[] field5787 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "[I")
    private static int[] field5781 = field5776;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "[I")
    public static int[] field5788 = new int[6];

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "[I")
    public static int[] field5783 = field5776;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "[I")
    private static int[] field5784 = field5776;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
    public int field5796;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "Lp;")
    private class104 field5794;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "Lsk;")
    private class121 field5793;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Lya;")
    private class74 field5778;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "[La;")
    private class164[] field5795;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V", line = 3)
    public final void method222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V", line = 6)
    protected final synchronized void finalize() {
        this.method3266(1);
        if (this.nativeid != 0L) {
            class260.method1726(this, false);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V", line = 13)
    public final void method1250(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z", line = 16)
    public final boolean method211() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V", line = 20)
    private final void method2465() {
        System.gc();
        System.runFinalization();
        class260.method1725(-89);
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()V", line = 24)
    public final void method250() {
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V", line = 34)
    public final void method251(int arg0) {
        this.field5795[arg0].method1169();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)Lza;", line = 38)
    public final class254 method205(int arg0) {
        class74 var2 = new class74(this, arg0);
        this.field5775.method3559(var2, (byte) 12);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)V", line = 44)
    public final void method1257(int arg0, int arg1) throws class360 {
        if (this.field5794 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field5794.method764(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 56)
    public final void method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class569 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z", line = 59)
    public final boolean method207() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Lsk;", line = 63)
    public final class121 method304() {
        return this.field5793;
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()Lfc;", line = 66)
    public final class729 method1229() {
        return new class729(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lss;)V", line = 68)
    public final void method353(class506 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z", line = 71)
    public final boolean method217() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V", line = 75)
    public final void method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method357(arg0, arg1, arg2, arg4, arg5);
        this.method357(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method268(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method268(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z", line = 81)
    public final boolean method412() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z", line = 86)
    public final boolean method292() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z", line = 89)
    public final boolean method296() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I", line = 93)
    public final int method300(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V", line = 102)
    public class406(Canvas arg0, class267 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class151.method1095("sw3d", 3)) {
                throw new RuntimeException("");
            } else {
                class260.method1727((byte) -52);
                this.method2477(super.field7881, 0, 0);
                class705.method3955(false, true, -1);
                this.field5797 = true;
                this.field5790 = new class134();
                this.method364(new class134());
                this.method340(1);
                this.method383(0);
                if (arg0 != null) {
                    this.method318(arg0, arg2, arg3);
                    this.method378(arg0);
                }
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V", line = 130)
    public final void method390(int[] arg0) {
        Dimension var2 = this.field5794.field1466.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V", line = 137)
    public final void method379(int arg0) {
        this.field5791 = this.field5789 = arg0;
        if (this.field5796 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method340(this.field5796);
            this.method383(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I", line = 145)
    public final int method374(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z", line = 150)
    public final boolean method395() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Ltd;", line = 154)
    public final class515 method339(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class307(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()V", line = 156)
    public final void method1227() {
    }

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()V", line = 158)
    public final void method1222() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 162)
    public final void method318(Canvas arg0, int arg1, int arg2) {
        class104 var4 = (class104) this.field5792.method4020((long) arg0.hashCode(), (byte) -97);
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class104 var7 = new class104(this, arg0, arg1, arg2);
            this.field5792.method4022(var7, 107, (long) arg0.hashCode());
        } else {
            if (var4.field1468 != arg1 || var4.field1467 != arg2) {
                var4.method767(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 186)
    public final void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()V", line = 190)
    public final void method1244() {
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z", line = 194)
    public final boolean method343() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 198)
    public final void method239(Canvas arg0) {
        if (this.field5794.field1466 == arg0) {
            this.method378((Canvas) null);
        }
        class104 var2 = (class104) this.field5792.method4020((long) arg0.hashCode(), (byte) -98);
        if (var2 != null) {
            var2.method2656((byte) 118);
            var2.method769();
        }
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z", line = 211)
    public final boolean method1234() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z", line = 215)
    private final boolean method2471(short arg0) {
        class267 var2 = super.field7881;
        synchronized (super.field7881) {
            if (!super.field7881.method963((byte) 41, arg0)) {
                return false;
            } else {
                class679 var4 = super.field7881.method962(arg0, 2904);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field9632 != 2) {
                        var6 = super.field7881.method964(-71, true, 128, arg0, 128, 0.7F);
                    } else {
                        var6 = super.field7881.method966(128, false, 0.7F, 128, true, arg0);
                    }
                    this.method2468(arg0, var6, var4.field9631, var4.field9632, var4.field9648, var4.field9646, var4.field9645, var4.field9636, var4.field9637, var4.field9651, var4.field9638, var4.field9640, var4.field9639, var4.field9652, var4.field9630, var4.field9641, var4.field9635, var4.field9634, var4.field9642, var4.field9644, var4.field9649);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z", line = 241)
    public final boolean method1242() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()V", line = 246)
    public final void method1232() {
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)Lup;", line = 249)
    public final class239 method1253(int arg0, int arg1) {
        return this.method377(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lwh;)V", line = 253)
    public final void method277(int arg0, class40[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field5781[var3++] = arg1[var4].method422((byte) -60);
            field5781[var3++] = arg1[var4].method421(110);
            field5781[var3++] = arg1[var4].method427(-1);
            field5781[var3++] = arg1[var4].method425((byte) 90);
            field5780[var4] = arg1[var4].method429(-1);
            field5781[var3++] = arg1[var4].method420(-1);
        }
        this.method2482(arg0, field5781, field5780);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z", line = 272)
    private final boolean method2474(short arg0) {
        synchronized (this) {
            class679 var3 = super.field7881.method962(arg0, 2904);
            if (var3 == null) {
                return false;
            } else {
                this.method2470(arg0, var3.field9631, var3.field9632, var3.field9648, var3.field9646, var3.field9645, var3.field9636, var3.field9637, var3.field9651, var3.field9638, var3.field9640, var3.field9639, var3.field9652, var3.field9630, var3.field9641, var3.field9635, var3.field9634, var3.field9642, var3.field9644, var3.field9649);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z", line = 284)
    public final boolean method407() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 288)
    public final void method314(Canvas arg0, int arg1, int arg2) {
        class104 var4 = (class104) this.field5792.method4020((long) arg0.hashCode(), (byte) -67);
        var4.method767(arg0, arg1, arg2);
        if (arg0 != null && this.field5794.field1466 == arg0) {
            this.method378(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 296)
    public final void method274(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "(I)V", line = 299)
    public final void method279(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()Lsk;", line = 309)
    public final class121 method348() {
        return new class134();
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()Lsk;", line = 312)
    public final class121 method342() {
        return this.field5790;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V", line = 316)
    public final void method393(class254 arg0) {
        this.field5778 = (class74) arg0;
        this.method2479(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()V", line = 322)
    public final void method1224() {
        this.method378(this.field5794.field1466);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lup;Lrga;)Ldv;", line = 325)
    public final class86 method1231(class239 arg0, class290 arg1) {
        return new class586(this, (class307) arg0, (class599) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 328)
    public final void method260(int arg0) {
        class260.method1725(-69);
        this.method2469(arg0);
        for (class74 var2 = (class74) this.field5775.method3565(-115); var2 != null; var2 = (class74) this.field5775.method3561((byte) 89)) {
            var2.method632();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 342)
    public final void method1225(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class360 {
        if (this.field5794 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field5794.method768(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Ltd;", line = 352)
    public final class515 method377(int arg0, int arg1, boolean arg2) {
        return new class307(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;", line = 355)
    public final class569 method219(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class276(this, this.field5778, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lsk;)V", line = 358)
    public final void method364(class121 arg0) {
        this.field5793 = arg0;
        this.method2472(((class134) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()I", line = 363)
    public final int method270() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lfu;IIII)Lka;", line = 366)
    public final class282 method404(class637 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class244(this, this.field5778, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lrga;", line = 371)
    public final class290 method1255(int arg0, int arg1) {
        return new class599(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V", line = 374)
    public final void method229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2480().method1174(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Leea;)V", line = 379)
    public final void method214(class458 arg0) {
        if (arg0.field6514.method2713(0) != 0) {
            this.method2478(arg0, false);
            this.method2480().method1178(this, field5784, field5786, field5779, field5782, arg0.field6514.method2713(0));
        }
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z", line = 390)
    public final boolean method255() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 393)
    public final class339 method311(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class508(this, this.field5778, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lss;Lss;FLss;)Lss;", line = 397)
    public final class506 method1251(class506 arg0, class506 arg1, float arg2, class506 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldv;)V", line = 402)
    public final void method1239(class86 arg0) {
        class586 var2 = (class586) arg0;
        this.method2476(var2.field8357.nativeid, var2.field8358.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z", line = 406)
    public final boolean method365() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lqt;[Lffa;Z)Lda;", line = 411)
    public final class400 method322(class502 arg0, class676[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field9614;
            var5[var7] = arg1[var7].field9618;
            if (arg1[var7].field9616 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class578(this, this.field5778, arg0, arg1, (class515[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class725(this, this.field5778, arg0, arg1, (class515[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lwh;", line = 449)
    public final class40 method309(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class660(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Leea;Z)V", line = 453)
    private final void method2478(class458 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class95 var8 = (class95) arg0.field6514.method2717(0); var8 != null; var8 = (class95) arg0.field6514.method2714(4120)) {
            field5784[var3++] = var8.field1377;
            field5784[var3++] = var8.field1374;
            field5784[var3++] = var8.field1378;
            field5786[var4++] = var8.field1375;
            field5782[var6++] = (short) var8.field1376;
            field5779[var5++] = var8.field1381;
            if (arg1) {
                field5787[var7++] = var8.field1373;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Ltd;", line = 485)
    public final class515 method359(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class307(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lffa;Z)Ltd;", line = 490)
    public final class515 method202(class676 arg0, boolean arg1) {
        class307 var3 = new class307(this, arg0.field9615, arg0.field9612, arg0.field9616, 0, arg0.field9614, arg0.field9614, arg0.field9618);
        var3.method783(arg0.field9613, arg0.field9610, arg0.field9617, arg0.field9611);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 495)
    public final void method383(int arg0) {
        this.field5795[arg0].method1161();
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V", line = 498)
    public final void method1230(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V", line = 500)
    public final void method1246(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()V", line = 503)
    public final void method195() {
        if (!this.field5777) {
            this.field5795 = null;
            this.field5794 = null;
            this.field5778 = null;
            this.field5790 = null;
            this.field5792.method4013(-3);
            for (class74 var1 = (class74) this.field5775.method3565(-56); var1 != null; var1 = (class74) this.field5775.method3561((byte) 74)) {
                var1.method634();
            }
            this.field5775.method3553(0);
            this.method2473();
            if (this.field5797) {
                class512.method3110(false, false, true);
                this.field5797 = false;
            }
            this.method2465();
            class260.method1724(-14594);
            this.field5777 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 533)
    public final void method378(Canvas arg0) {
        if (arg0 != null) {
            class104 var2 = (class104) this.field5792.method4020((long) arg0.hashCode(), (byte) -125);
            this.field5794 = var2;
            this.method2466(var2);
        } else {
            this.field5794 = null;
            this.method2466((class104) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Leea;I)V", line = 548)
    public final void method216(class458 arg0, int arg1) {
        this.method2478(arg0, false);
        this.method2480().method1178(this, field5784, field5786, field5779, field5782, arg0.field6514.method2713(0));
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)V", line = 553)
    public final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2475(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V", line = 556)
    public final void method340(int arg0) {
        this.field5796 = arg0;
        this.field5795 = new class164[this.field5796];
        for (int var2 = 0; var2 < this.field5796; ++var2) {
            this.field5795[var2] = new class164(this, this.field5791, this.field5789);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V", line = 578)
    public final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class569 arg6, int arg7, int arg8) {
        this.method2467(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()La;", line = 583)
    public final class164 method2480() {
        for (int var1 = 0; var1 < this.field5796; ++var1) {
            if (this.field5795[var1].field2333 == Thread.currentThread()) {
                return this.field5795[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;", line = 599)
    private final Object method2481() {
        return new class309(this);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)Lss;", line = 608)
    public final class506 method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method328();

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method281(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method335(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method387();

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method2466(class104 arg0);

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method268(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method293(int arg0, class569 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method375(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method332();

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method235(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method2467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class569 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method2468(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method358(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method2469(int arg0);

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method2470(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method331();

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method297(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method199(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method2472(long arg0);

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method1254(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method2473();

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method1226(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method388(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method398(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method2475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method209(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method1240(int arg0);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method2476(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method330(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method2477(class267 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method247();

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method1237();

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method363(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method206(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method1235();

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method2479(class254 arg0);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method9(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method369(int arg0);

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method271(float arg0);

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method227();

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method1249(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method204();

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method402(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method357(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method2482(int arg0, int[] arg1, float[] arg2);
}
