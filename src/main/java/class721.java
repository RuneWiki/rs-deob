import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class721 extends class66 implements class558 {

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "Z")
    private boolean field9791 = false;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "Lqw;")
    private class84 field9792 = new class84();

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    private int field9794 = 4096;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
    private int field9797 = 4096;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "Ltca;")
    private class184 field9799 = new class184(4);

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "Z")
    private boolean field9803 = false;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "Lal;")
    private class109 field9798;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "[I")
    private static int[] field9795 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "[F")
    private static float[] field9804 = new float[20];

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "[I")
    private static int[] field9808 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "[S")
    private static short[] field9809 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "[I")
    private static int[] field9810 = field9795;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "[I")
    public static int[] field9807 = field9795;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "[B")
    private static byte[] field9805 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "[I")
    private static int[] field9811 = field9795;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "[I")
    public static int[] field9806 = new int[6];

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "[I")
    private static int[] field9812 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "[F")
    private static float[] field9813 = field9804;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
    public int field9802;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "Lal;")
    private class109 field9800;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "Lp;")
    private class231 field9796;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "Lya;")
    private class59 field9793;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "[La;")
    private class644[] field9801;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method492(Canvas arg0, int arg1, int arg2) {
        class231 var4 = (class231) this.field9799.method1248(121, (long) arg0.hashCode());
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class231 var7 = new class231(this, arg0, arg1, arg2);
            this.field9799.method1247(4070, (long) arg0.hashCode(), var7);
        } else {
            if (var4.field2966 != arg1 || var4.field2965 != arg2) {
                var4.method1460(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public final void method486(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method532();

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method493(int arg0);

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method3976(class434 arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method521(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class283 {
        if (this.field9796 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9796.method1453(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lcj;Lcj;FLcj;)Lcj;")
    public final class720 method531(class720 arg0, class720 arg1, float arg2, class720 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method105(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lgl;IIII)Lka;")
    public final class497 method484(class625 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class44(this, this.field9793, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)Lio;")
    public final class461 method498(int arg0, int arg1) {
        return this.method488(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
    private final void method3977() {
        System.gc();
        System.runFinalization();
        class766.method4212(-14);
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
    public final void method533(int arg0) {
        class766.method4212(115);
        this.method3990(arg0);
        for (class59 var2 = (class59) this.field9792.method679((byte) -86); var2 != null; var2 = (class59) this.field9792.method681(-93)) {
            var2.method371();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public final void method470(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "()La;")
    public final class644 method3978() {
        for (int var1 = 0; var1 < this.field9802; ++var1) {
            if (this.field9801[var1].field8666 == Thread.currentThread()) {
                return this.field9801[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)V")
    public final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method474(arg0, arg1, arg2, arg4, arg5);
        this.method474(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method451(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method451(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method494();

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method445();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
    public final void method549(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z")
    public final boolean method459() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public final void method513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3978().method3567(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()V")
    public final void method535() {
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
    public final boolean method455() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
    public final boolean method503() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public final void method442(int arg0) {
        this.field9794 = this.field9797 = arg0;
        if (this.field9802 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method495(this.field9802);
            this.method505(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method530(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Lal;")
    public final class109 method444() {
        return this.field9800;
    }

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method3979(long arg0);

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z")
    public final boolean method480() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
    public final boolean method448() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method449(int arg0, class512 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z")
    public final boolean method450() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public final void method505(int arg0) {
        this.field9801[arg0].method3553();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ltv;)V")
    public final void method534(class586 arg0) {
        if (arg0.field7972.method1828((byte) 38) != 0) {
            this.method3980(arg0, false);
            this.method3978().method3545(this, field9811, field9812, field9808, field9809, arg0.field7972.method1828((byte) 38));
        }
    }

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method555(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method439(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ltv;Z)V")
    private final void method3980(class586 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class126 var8 = (class126) arg0.field7972.method1831(true); var8 != null; var8 = (class126) arg0.field7972.method1829(109)) {
            field9811[var3++] = var8.field1725;
            field9811[var3++] = var8.field1729;
            field9811[var3++] = var8.field1730;
            field9812[var4++] = var8.field1727;
            field9809[var6++] = (short) var8.field1733;
            field9808[var5++] = var8.field1726;
            if (arg1) {
                field9805[var7++] = var8.field1723;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class295 method516(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class695(this, this.field9793, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lal;)V")
    public final void method509(class109 arg0) {
        this.field9800 = arg0;
        this.method3979(((class293) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I")
    public final int method520(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method496();

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()V")
    public final void method527() {
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()V")
    public final void method476() {
        if (!this.field9791) {
            this.field9801 = null;
            this.field9796 = null;
            this.field9793 = null;
            this.field9798 = null;
            this.field9799.method1244(30407);
            for (class59 var1 = (class59) this.field9792.method679((byte) -86); var1 != null; var1 = (class59) this.field9792.method681(-52)) {
                var1.method370();
            }
            this.field9792.method690(20134);
            this.method3989();
            if (this.field9803) {
                class186.method1251(false, true, (byte) -81);
                this.field9803 = false;
            }
            this.method3977();
            class766.method4214(0);
            this.field9791 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method474(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lvf;Z)Lhh;")
    public final class140 method466(class162 arg0, boolean arg1) {
        class567 var3 = new class567(this, arg0.field2160, arg0.field2154, arg0.field2157, 0, arg0.field2156, arg0.field2156, arg0.field2155);
        var3.method347(arg0.field2159, arg0.field2161, arg0.field2158, arg0.field2162);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method3981(class161 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
    public final boolean method510() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
    private final boolean method3982(short arg0) {
        class161 var2 = super.field913;
        synchronized (super.field913) {
            if (!super.field913.method1112(29302, arg0)) {
                return false;
            } else {
                class577 var4 = super.field913.method1114(arg0, -120);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field7860 != 2) {
                        var6 = super.field913.method1113(-95, 128, 128, true, arg0, 0.7F);
                    } else {
                        var6 = super.field913.method1111(32, 0.7F, 128, arg0, 128, true);
                    }
                    this.method3993(arg0, var6, var4.field7854, var4.field7860, var4.field7855, var4.field7867, var4.field7876, var4.field7853, var4.field7865, var4.field7857, var4.field7861, var4.field7852, var4.field7868, var4.field7863, var4.field7870, var4.field7873, var4.field7858, var4.field7874, var4.field7872, var4.field7859, var4.field7869);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
    public final void method537(int arg0) {
        this.field9801[arg0].method3561();
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()V")
    public final void method511() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V")
    public final void method501(class434 arg0) {
        this.field9793 = (class59) arg0;
        this.method3976(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z")
    public final boolean method479() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method491(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
    public final void method528(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
    public final boolean method472() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method453(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()Ldca;")
    public final class189 method542() {
        return new class189(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
    public final void method485(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method540(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lrr;")
    public final class381 method437(int arg0, int arg1) {
        return new class527(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method3983(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
    public final boolean method538() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method3984(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method3985(class231 arg0);

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method552(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method499(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method465(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method546(Canvas arg0, int arg1, int arg2) {
        class231 var4 = (class231) this.field9799.method1248(112, (long) arg0.hashCode());
        var4.method1460(arg0, arg1, arg2);
        if (arg0 != null && this.field9796.field2964 == arg0) {
            this.method556(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
    private final boolean method3986(short arg0) {
        synchronized (this) {
            class577 var3 = super.field913.method1114(arg0, -37);
            if (var3 == null) {
                return false;
            } else {
                this.method3988(arg0, var3.field7854, var3.field7860, var3.field7855, var3.field7867, var3.field7876, var3.field7853, var3.field7865, var3.field7857, var3.field7861, var3.field7852, var3.field7868, var3.field7863, var3.field7870, var3.field7873, var3.field7858, var3.field7874, var3.field7872, var3.field7859, var3.field7869);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method547();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Luaa;")
    public final class127 method551(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class679(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method507();

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method3987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method3988(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lhh;")
    public final class140 method462(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class567(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lhg;)V")
    public final void method554(class718 arg0) {
        class636 var2 = (class636) arg0;
        this.method3984(var2.field8582.nativeid, var2.field8580.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;")
    public final class512 method504(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class51(this, this.field9793, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8) {
        this.method3987(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method469();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Leb;[Lvf;Z)Lda;")
    public final class67 method502(class651 arg0, class162[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field2156;
            var5[var7] = arg1[var7].field2155;
            if (arg1[var7].field2157 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class691(this, this.field9793, arg0, arg1, (class140[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class19(this, this.field9793, arg0, arg1, (class140[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method436(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method467(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method3989();

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method550(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method500();

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method518(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method3990(int arg0);

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Lal;")
    public final class109 method541() {
        return new class293();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method543(Canvas arg0) {
        if (this.field9796.field2964 == arg0) {
            this.method556((Canvas) null);
        }
        class231 var2 = (class231) this.field9799.method1248(108, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method1102((byte) 77);
            var2.method1459();
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method556(Canvas arg0) {
        if (arg0 != null) {
            class231 var2 = (class231) this.field9799.method1248(122, (long) arg0.hashCode());
            this.field9796 = var2;
            this.method3985(var2);
        } else {
            this.field9796 = null;
            this.method3985((class231) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method3991(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()V")
    public final void method482() {
    }

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method477(int arg0);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public final void method495(int arg0) {
        this.field9802 = arg0;
        this.field9801 = new class644[this.field9802];
        for (int var2 = 0; var2 < this.field9802; ++var2) {
            this.field9801[var2] = new class644(this, this.field9794, this.field9797);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lcj;)V")
    public final void method440(class720 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
    private final Object method3992() {
        return new class407(this);
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
    public final boolean method458() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method451(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lhh;")
    public final class140 method488(int arg0, int arg1, boolean arg2) {
        return new class567(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ltv;I)V")
    public final void method524(class586 arg0, int arg1) {
        this.method3980(arg0, false);
        this.method3978().method3545(this, field9811, field9812, field9808, field9809, arg0.field7972.method1828((byte) 38));
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
    public final void method447(int[] arg0) {
        Dimension var2 = this.field9796.field2964.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method464((byte) -128);
        if (this.nativeid != 0L) {
            class766.method4210((byte) -4, this);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Luaa;)V")
    public final void method481(int arg0, class127[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field9810[var3++] = arg1[var4].method899(true);
            field9810[var3++] = arg1[var4].method904(-118);
            field9810[var3++] = arg1[var4].method901((byte) -115);
            field9810[var3++] = arg1[var4].method903((byte) -123);
            field9813[var4] = arg1[var4].method902(0);
            field9810[var3++] = arg1[var4].method898(-90);
        }
        this.method3983(arg0, field9810, field9813);
    }

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method508(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method456(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)Lcj;")
    public final class720 method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method497(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lhh;")
    public final class140 method454(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class567(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)I")
    public final int method473(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method468(float arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
    public final void method487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3991(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)Lza;")
    public final class434 method478(int arg0) {
        class59 var2 = new class59(this, arg0);
        this.field9792.method689(var2, 0);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class721(Canvas arg0, class161 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class289.method1854((byte) -121, "sw3d")) {
                throw new RuntimeException("");
            } else {
                class766.method4211((byte) 111);
                this.method3981(super.field913, 0, 0);
                class96.method761(true, true, false);
                this.field9803 = true;
                this.field9798 = new class293();
                this.method509(new class293());
                this.method495(1);
                this.method505(0);
                if (arg0 != null) {
                    this.method492(arg0, arg2, arg3);
                    this.method556(arg0);
                }
            }
        } catch (Throwable var5) {
            this.method464((byte) -102);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()V")
    public final void method490() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()V")
    public final void method514() {
        this.method556(this.field9796.field2964);
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()Z")
    public final boolean method460() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z")
    public final boolean method536() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method3993(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method525(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)V")
    public final void method471(int arg0, int arg1) throws class283 {
        if (this.field9796 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9796.method1458(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()I")
    public final int method489() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()Lal;")
    public final class109 method475() {
        return this.field9798;
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lio;Lrr;)Lhg;")
    public final class718 method461(class461 arg0, class381 arg1) {
        return new class636(this, (class567) arg0, (class527) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method526();
}
