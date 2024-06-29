import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class722 extends class65 implements class557 {

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "Z")
    private boolean field9998 = false;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "Lok;")
    private class266 field9989 = new class266();

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
    private int field10000 = 4096;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "I")
    private int field10004 = 4096;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "Ljo;")
    private class353 field10002 = new class353(4);

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "Z")
    private boolean field10007 = false;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "Lqja;")
    private class326 field10003;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "[I")
    private static int[] field9988 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "[I")
    public static int[] field9991 = field9988;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "[I")
    private static int[] field9993 = field9988;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "[B")
    private static byte[] field9996 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "[S")
    private static short[] field9994 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "[F")
    private static float[] field9992 = new float[20];

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "[I")
    private static int[] field9999 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "[F")
    private static float[] field9997 = field9992;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "[I")
    private static int[] field9995 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "[I")
    private static int[] field10005 = field9988;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "[I")
    public static int[] field9990 = new int[6];

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "I")
    public int field10008;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "Lp;")
    private class230 field10001;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "Lqja;")
    private class326 field10006;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "Lya;")
    private class59 field9987;

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "[La;")
    private class644[] field10009;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public final void method466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method4044().method3680(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()Lqja;", line = 7)
    public final class326 method514() {
        return this.field10003;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Ljd;", line = 11)
    public final class241 method536(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class566(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lpt;)V", line = 17)
    public final void method528(class555 arg0) {
        class636 var2 = (class636) arg0;
        this.method4050(var2.field8934.nativeid, var2.field8933.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 21)
    public final void method493(Canvas arg0) {
        if (this.field10001.field3501 == arg0) {
            this.method537((Canvas) null);
        }
        class230 var2 = (class230) this.field10002.method2242((long) arg0.hashCode(), -1);
        if (var2 != null) {
            var2.method3387((byte) -109);
            var2.method1557();
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 35)
    public final void method454(int arg0) {
        class196.method1358(true);
        this.method4056(arg0);
        for (class59 var2 = (class59) this.field9989.method1731((byte) -109); var2 != null; var2 = (class59) this.field9989.method1724(0)) {
            var2.method401();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z", line = 48)
    public final boolean method431() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z", line = 51)
    public final boolean method534() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z", line = 57)
    public final boolean method477() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lqja;)V", line = 61)
    public final void method550(class326 arg0) {
        this.field10006 = arg0;
        this.method4051(((class292) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z", line = 66)
    private final boolean method4041(short arg0) {
        synchronized (this) {
            class467 var3 = super.field774.method1208((byte) 47, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method4043(arg0, var3.field6571, var3.field6581, var3.field6567, var3.field6562, var3.field6561, var3.field6574, var3.field6582, var3.field6579, var3.field6577, var3.field6569, var3.field6570, var3.field6563, var3.field6575, var3.field6572, var3.field6566, var3.field6565, var3.field6568, var3.field6580, var3.field6557);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z", line = 80)
    public final boolean method451() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V", line = 83)
    public final void method497(int arg0) {
        this.field10008 = arg0;
        this.field10009 = new class644[this.field10008];
        for (int var2 = 0; var2 < this.field10008; ++var2) {
            this.field10009[var2] = new class644(this, this.field10000, this.field10004);
        }
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V", line = 97)
    public final void method524(int arg0) {
        this.field10000 = this.field10004 = arg0;
        if (this.field10008 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method497(this.field10008);
            this.method519(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)I", line = 106)
    public final int method512(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lqm;", line = 112)
    public final class154 method439(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class582(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()La;", line = 120)
    public final class644 method4044() {
        for (int var1 = 0; var1 < this.field10008; ++var1) {
            if (this.field10009[var1].field9005 == Thread.currentThread()) {
                return this.field10009[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()Lcq;", line = 132)
    public final class491 method553() {
        return new class491(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()Lqja;", line = 136)
    public final class326 method505() {
        return new class292();
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 139)
    public final void method471(int arg0) {
        this.field10009[arg0].method3673();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Ljd;", line = 142)
    public final class241 method517(int arg0, int arg1, boolean arg2) {
        return new class566(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lus;Z)Ljd;", line = 146)
    public final class241 method551(class1 arg0, boolean arg1) {
        class566 var3 = new class566(this, arg0.field6, arg0.field3, arg0.field2, 0, arg0.field4, arg0.field4, arg0.field7);
        var3.method1506(arg0.field1, arg0.field5, arg0.field8, arg0.field9);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)Lza;", line = 152)
    public final class434 method444(int arg0) {
        class59 var2 = new class59(this, arg0);
        this.field9989.method1727(var2, (byte) 107);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I", line = 157)
    public final int method542(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkd;Z)V", line = 162)
    private final void method4045(class296 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class354 var8 = (class354) arg0.field4304.method4281(0); var8 != null; var8 = (class354) arg0.field4304.method4280((byte) 47)) {
            field9993[var3++] = var8.field4979;
            field9993[var3++] = var8.field4976;
            field9993[var3++] = var8.field4986;
            field9995[var4++] = var8.field4988;
            field9994[var6++] = (short) var8.field4987;
            field9999[var5++] = var8.field4985;
            if (arg1) {
                field9996[var7++] = var8.field4984;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkd;)V", line = 194)
    public final void method504(class296 arg0) {
        if (arg0.field4304.method4282(4873) != 0) {
            this.method4045(arg0, false);
            this.method4044().method3682(this, field9993, field9995, field9999, field9994, arg0.field4304.method4282(4873));
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z", line = 201)
    public final boolean method441() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z", line = 204)
    public final boolean method494() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z", line = 208)
    private final boolean method4047(short arg0) {
        class160 var2 = super.field774;
        synchronized (super.field774) {
            if (!super.field774.method1212(106, arg0)) {
                return false;
            } else {
                class467 var4 = super.field774.method1208((byte) 47, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field6581 != 2) {
                        var6 = super.field774.method1211((byte) 22, 128, 128, true, arg0, 0.7F);
                    } else {
                        var6 = super.field774.method1207((byte) -35, true, arg0, 128, 128, 0.7F);
                    }
                    this.method4053(arg0, var6, var4.field6571, var4.field6581, var4.field6567, var4.field6562, var4.field6561, var4.field6574, var4.field6582, var4.field6579, var4.field6577, var4.field6569, var4.field6570, var4.field6563, var4.field6575, var4.field6572, var4.field6566, var4.field6565, var4.field6568, var4.field6580, var4.field6557);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 232)
    public final void method498(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class736 {
        if (this.field10001 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field10001.method1562(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V", line = 243)
    private final void method4048() {
        System.gc();
        System.runFinalization();
        class196.method1358(true);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lqaa;Lqaa;FLqaa;)Lqaa;", line = 248)
    public final class29 method470(class29 arg0, class29 arg1, float arg2, class29 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V", line = 252)
    public final void method549(int[] arg0) {
        Dimension var2 = this.field10001.field3501.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()V", line = 257)
    public final void method468() {
        this.method537(this.field10001.field3501);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 260)
    public final void method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()V", line = 264)
    public final void method484() {
        if (!this.field9998) {
            this.field10009 = null;
            this.field10001 = null;
            this.field9987 = null;
            this.field10003 = null;
            this.field10002.method2240(104);
            for (class59 var1 = (class59) this.field9989.method1731((byte) -128); var1 != null; var1 = (class59) this.field9989.method1724(0)) {
                var1.method400();
            }
            this.field9989.method1729((byte) -105);
            this.method4040();
            if (this.field10007) {
                class467.method2791(true, false, (byte) -104);
                this.field10007 = false;
            }
            this.method4048();
            class196.method1356(-95);
            this.field9998 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()Z", line = 295)
    public final boolean method462() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V", line = 297)
    public final void method499(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V", line = 301)
    public final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class511 arg6, int arg7, int arg8) {
        this.method4046(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()V", line = 303)
    public final void method506() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkfa;Lts;)Lpt;", line = 306)
    public final class555 method443(class627 arg0, class560 arg1) {
        return new class636(this, (class566) arg0, (class526) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldba;IIII)Lka;", line = 309)
    public final class496 method480(class100 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class44(this, this.field9987, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V", line = 312)
    protected final synchronized void finalize() {
        this.method533(43);
        if (this.nativeid != 0L) {
            class196.method1359(this, (byte) 90);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 318)
    public final void method537(Canvas arg0) {
        if (arg0 != null) {
            class230 var2 = (class230) this.field10002.method2242((long) arg0.hashCode(), -1);
            this.field10001 = var2;
            this.method4042(var2);
        } else {
            this.field10001 = null;
            this.method4042((class230) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lqaa;)V", line = 333)
    public final void method464(class29 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V", line = 336)
    public final void method463(int arg0, int arg1) throws class736 {
        if (this.field10001 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field10001.method1559(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;", line = 346)
    public final class511 method552(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class51(this, this.field9987, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()Z", line = 350)
    public final boolean method452() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()V", line = 352)
    public final void method546() {
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z", line = 357)
    public final boolean method483() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lie;[Lus;Z)Lda;", line = 362)
    public final class66 method437(class6 arg0, class1[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field4;
            var5[var7] = arg1[var7].field7;
            if (arg1[var7].field2 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class692(this, this.field9987, arg0, arg1, (class241[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class19(this, this.field9987, arg0, arg1, (class241[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()V", line = 399)
    public final void method486() {
    }

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()I", line = 402)
    public final int method535() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 405)
    public final class294 method488(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class696(this, this.field9987, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V", line = 407)
    public final void method527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V", line = 410)
    public final void method487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method4049(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Ljd;", line = 414)
    public final class241 method479(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class566(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V", line = 419)
    public final void method519(int arg0) {
        this.field10009[arg0].method3676();
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 424)
    public final void method507(Canvas arg0, int arg1, int arg2) {
        class230 var4 = (class230) this.field10002.method2242((long) arg0.hashCode(), -1);
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class230 var7 = new class230(this, arg0, arg1, arg2);
            this.field10002.method2241(113, (long) arg0.hashCode(), var7);
        } else {
            if (var4.field3505 != arg1 || var4.field3502 != arg2) {
                var4.method1563(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Lqja;", line = 448)
    public final class326 method440() {
        return this.field10006;
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V", line = 451)
    public final void method525(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V", line = 453)
    public final void method448(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V", line = 458)
    public final void method554(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkd;I)V", line = 466)
    public final void method541(class296 arg0, int arg1) {
        this.method4045(arg0, false);
        this.method4044().method3682(this, field9993, field9995, field9999, field9994, arg0.field4304.method4282(4873));
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V", line = 513)
    public class722(Canvas arg0, class160 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class581.method3402("sw3d", (byte) -18)) {
                throw new RuntimeException("");
            } else {
                class196.method1355((byte) -122);
                this.method4054(super.field774, 0, 0);
                class486.method2895(true, false, (byte) 121);
                this.field10007 = true;
                this.field10003 = new class292();
                this.method550(new class292());
                this.method497(1);
                this.method519(0);
                if (arg0 != null) {
                    this.method507(arg0, arg2, arg3);
                    this.method537(arg0);
                }
            }
        } catch (Throwable var5) {
            this.method533(43);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V", line = 476)
    public final void method501(class434 arg0) {
        this.field9987 = (class59) arg0;
        this.method4055(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 482)
    public final void method475(Canvas arg0, int arg1, int arg2) {
        class230 var4 = (class230) this.field10002.method2242((long) arg0.hashCode(), -1);
        var4.method1563(arg0, arg1, arg2);
        if (arg0 != null && this.field10001.field3501 == arg0) {
            this.method537(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 490)
    public final void method459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class511 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 497)
    public final void method473(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z", line = 501)
    public final boolean method455() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()V", line = 504)
    public final void method447() {
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()V", line = 509)
    public final void method548() {
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Lkfa;", line = 551)
    public final class627 method481(int arg0, int arg1) {
        return this.method517(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V", line = 554)
    public final void method520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method529(arg0, arg1, arg2, arg4, arg5);
        this.method529(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method478(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method478(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lqm;)V", line = 561)
    public final void method461(int arg0, class154[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field10005[var3++] = arg1[var4].method1059(-6131);
            field10005[var3++] = arg1[var4].method1055((byte) -71);
            field10005[var3++] = arg1[var4].method1058(123);
            field10005[var3++] = arg1[var4].method1051((byte) 23);
            field9997[var4] = arg1[var4].method1057(false);
            field10005[var3++] = arg1[var4].method1052(false);
        }
        this.method4052(arg0, field10005, field9997);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z", line = 579)
    public final boolean method432() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)Lts;", line = 587)
    public final class560 method532(int arg0, int arg1) {
        return new class526(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z", line = 590)
    public final boolean method516() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;", line = 600)
    private final Object method4057() {
        return new class406(this);
    }

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z", line = 625)
    public final boolean method492() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)Lqaa;", line = 638)
    public final class29 method521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method513();

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method4040();

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method434(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method4042(class230 arg0);

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method489();

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method467(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method453(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method4043(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method211(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method4046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class511 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method544(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method515(float arg0);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method530(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method469(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method4049(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method523(int arg0);

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method526(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method4050(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method4051(long arg0);

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method4052(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method485(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method442(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method474(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method4053(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method476();

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method529(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method500(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method538();

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method502(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method433();

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method4054(class160 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method478(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method510();

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method4055(class434 arg0);

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method503(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method450(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method435(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method4056(int arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method460(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method511();

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method490(int arg0, class511 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method457();

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method509(int arg0);

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method449(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method518();
}
