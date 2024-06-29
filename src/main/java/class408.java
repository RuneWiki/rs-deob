import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class408 extends class548 implements class2 {

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "Z")
    private boolean field5808 = false;

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "Lmba;")
    private class646 field5803 = new class646();

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
    private int field5815 = 4096;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
    private int field5819 = 4096;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "Lbaa;")
    private class130 field5816 = new class130(4);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "Z")
    private boolean field5824 = false;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "Lih;")
    private class744 field5817;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "[I")
    private static int[] field5804 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "[B")
    private static byte[] field5805 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "[F")
    private static float[] field5812 = new float[20];

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "[F")
    private static float[] field5809 = field5812;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "[I")
    public static int[] field5811 = field5804;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "[I")
    private static int[] field5814 = field5804;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "[S")
    private static short[] field5807 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "[I")
    private static int[] field5810 = field5804;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "[I")
    private static int[] field5813 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "[I")
    private static int[] field5806 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "[I")
    public static int[] field5820 = new int[6];

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "I")
    public int field5823;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "Lp;")
    private class107 field5818;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "Lih;")
    private class744 field5821;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "Lya;")
    private class74 field5802;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "[La;")
    private class167[] field5822;

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V", line = 3)
    public class408(Canvas arg0, class270 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class715.method4015("sw3d", -1)) {
                throw new RuntimeException("");
            } else {
                class556.method3278(6287);
                this.method2552(super.field7623, 0, 0);
                class612.method3470(true, false, (byte) -55);
                this.field5824 = true;
                this.field5817 = new class136();
                this.method1444(new class136());
                this.method1521(1);
                this.method1540(0);
                if (arg0 != null) {
                    this.method1535(arg0, arg2, arg3);
                    this.method1451(arg0);
                }
            }
        } catch (Throwable var5) {
            this.method3248((byte) -88);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z", line = 35)
    public final boolean method1419() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z", line = 40)
    public final boolean method1387() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 43)
    public final class341 method1542(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class511(this, this.field5802, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 47)
    public final void method282(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class692 {
        if (this.field5818 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field5818.method696(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V", line = 57)
    public final void method1545(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lfd;", line = 60)
    public final class298 method1549(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class309(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 64)
    public final void method1533(Canvas arg0, int arg1, int arg2) {
        class107 var4 = (class107) this.field5816.method812(123, (long) arg0.hashCode());
        var4.method698(arg0, arg1, arg2);
        if (arg0 != null && this.field5818.field1434 == arg0) {
            this.method1451(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()V", line = 70)
    public final void method281() {
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()V", line = 74)
    public final void method315() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Loia;Z)Lfd;", line = 78)
    public final class298 method1496(class52 arg0, boolean arg1) {
        class309 var3 = new class309(this, arg0.field760, arg0.field763, arg0.field759, 0, arg0.field767, arg0.field767, arg0.field766);
        var3.method1953(arg0.field765, arg0.field761, arg0.field762, arg0.field764);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;", line = 85)
    public final class573 method1461(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class278(this, this.field5802, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 89)
    public final void method272(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V", line = 91)
    public final void method284(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Lih;", line = 99)
    public final class744 method1404() {
        return this.field5817;
    }

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()La;", line = 104)
    public final class167 method2547() {
        for (int var1 = 0; var1 < this.field5823; ++var1) {
            if (this.field5822[var1].field2328 == Thread.currentThread()) {
                return this.field5822[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 117)
    public final void method1522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class573 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()Lih;", line = 120)
    public final class744 method1495() {
        return new class136();
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()Ler;", line = 127)
    public final class299 method263() {
        return new class299(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z", line = 130)
    public final boolean method283() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Lih;", line = 133)
    public final class744 method1385() {
        return this.field5821;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)Lza;", line = 137)
    public final class257 method1539(int arg0) {
        class74 var2 = new class74(this, arg0);
        this.field5803.method3610(9289, var2);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Ltj;", line = 142)
    public final class687 method1476(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class522(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 144)
    public final void method1423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V", line = 147)
    public final void method1492(int arg0) {
        this.field5822[arg0].method1055();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lik;I)V", line = 150)
    public final void method1479(class100 arg0, int arg1) {
        this.method2550(arg0, false);
        this.method2547().method1065(this, field5810, field5813, field5806, field5807, arg0.field1384.method3028(false));
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Lpw;", line = 159)
    public final class106 method299(int arg0, int arg1) {
        return this.method1471(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lpw;Llh;)Ldi;", line = 162)
    public final class5 method311(class106 arg0, class208 arg1) {
        return new class590(this, (class309) arg0, (class603) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V", line = 165)
    protected final synchronized void finalize() {
        this.method3248((byte) -88);
        if (this.nativeid != 0L) {
            class556.method3276((byte) -10, this);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 174)
    public final void method1535(Canvas arg0, int arg1, int arg2) {
        class107 var4 = (class107) this.field5816.method812(126, (long) arg0.hashCode());
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class107 var7 = new class107(this, arg0, arg1, arg2);
            this.field5816.method820((long) arg0.hashCode(), (byte) -42, var7);
        } else {
            if (var4.field1437 != arg1 || var4.field1436 != arg2) {
                var4.method698(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 198)
    public final void method1540(int arg0) {
        this.field5822[arg0].method1045();
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 201)
    public final void method310(int arg0) {
        class556.method3277(-1);
        this.method2555(arg0);
        for (class74 var2 = (class74) this.field5803.method3618(-114); var2 != null; var2 = (class74) this.field5803.method3619(0)) {
            var2.method564();
        }
    }

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z", line = 216)
    private final boolean method2549(short arg0) {
        class270 var2 = super.field7623;
        synchronized (super.field7623) {
            if (!super.field7623.method517(arg0, true)) {
                return false;
            } else {
                class239 var4 = super.field7623.method521(arg0, 106);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field3557 != 2) {
                        var6 = super.field7623.method519(-6839, arg0, 0.7F, 128, 128, true);
                    } else {
                        var6 = super.field7623.method520(128, (byte) 122, 128, true, arg0, 0.7F);
                    }
                    this.method2548(arg0, var6, var4.field3566, var4.field3557, var4.field3561, var4.field3567, var4.field3565, var4.field3556, var4.field3570, var4.field3578, var4.field3579, var4.field3573, var4.field3562, var4.field3560, var4.field3577, var4.field3569, var4.field3576, var4.field3575, var4.field3572, var4.field3571, var4.field3564);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z", line = 240)
    public final boolean method289() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V", line = 245)
    public final void method1483(int[] arg0) {
        Dimension var2 = this.field5818.field1434.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V", line = 250)
    public final void method306(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lfd;", line = 253)
    public final class298 method1514(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class309(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)Llh;", line = 257)
    public final class208 method317(int arg0, int arg1) {
        return new class603(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V", line = 260)
    public final void method1470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class573 arg6, int arg7, int arg8) {
        this.method2558(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z", line = 263)
    public final boolean method1490() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lhe;Lhe;FLhe;)Lhe;", line = 266)
    public final class577 method260(class577 arg0, class577 arg1, float arg2, class577 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 269)
    public final void method1510(Canvas arg0) {
        if (this.field5818.field1434 == arg0) {
            this.method1451((Canvas) null);
        }
        class107 var2 = (class107) this.field5816.method812(124, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method549(6410);
            var2.method691();
        }
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()V", line = 283)
    public final void method1513() {
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z", line = 287)
    public final boolean method1447() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lik;Z)V", line = 291)
    private final void method2550(class100 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class421 var8 = (class421) arg0.field1384.method3030((byte) 124); var8 != null; var8 = (class421) arg0.field1384.method3029(true)) {
            field5810[var3++] = var8.field5919;
            field5810[var3++] = var8.field5926;
            field5810[var3++] = var8.field5922;
            field5813[var4++] = var8.field5921;
            field5807[var6++] = (short) var8.field5924;
            field5806[var5++] = var8.field5920;
            if (arg1) {
                field5805[var7++] = var8.field5923;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V", line = 321)
    public final void method1523(class257 arg0) {
        this.field5802 = (class74) arg0;
        this.method2544(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lik;)V", line = 326)
    public final void method1413(class100 arg0) {
        if (arg0.field1384.method3028(false) != 0) {
            this.method2550(arg0, false);
            this.method2547().method1065(this, field5810, field5813, field5806, field5807, arg0.field1384.method3028(false));
        }
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V", line = 335)
    public final void method1398(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()Z", line = 338)
    public final boolean method1446() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lfd;", line = 343)
    public final class298 method1471(int arg0, int arg1, boolean arg2) {
        return new class309(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V", line = 346)
    public final void method1521(int arg0) {
        this.field5823 = arg0;
        this.field5822 = new class167[this.field5823];
        for (int var2 = 0; var2 < this.field5823; ++var2) {
            this.field5822[var2] = new class167(this, this.field5819, this.field5815);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldi;)V", line = 360)
    public final void method325(class5 arg0) {
        class590 var2 = (class590) arg0;
        this.method2554(var2.field8030.nativeid, var2.field8031.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()V", line = 364)
    public final void method290() {
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()V", line = 366)
    public final void method278() {
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z", line = 372)
    public final boolean method1441() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I", line = 377)
    public final int method1484(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V", line = 382)
    public final void method1462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()I", line = 386)
    public final int method1481() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z", line = 389)
    public final boolean method1395() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z", line = 392)
    public final boolean method1430() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lej;[Loia;Z)Lda;", line = 402)
    public final class402 method1392(class179 arg0, class52[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field767;
            var5[var7] = arg1[var7].field766;
            if (arg1[var7].field759 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class582(this, this.field5802, arg0, arg1, (class298[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class730(this, this.field5802, arg0, arg1, (class298[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;", line = 440)
    private final Object method2553() {
        return new class311(this);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z", line = 444)
    public final boolean method1472() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)Lhe;", line = 450)
    public final class577 method1547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z", line = 456)
    public final boolean method1469() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)I", line = 462)
    public final int method1390(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()V", line = 466)
    public final void method302() {
        this.method1451(this.field5818.field1434);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 470)
    public final void method1445(int arg0) {
        this.field5819 = this.field5815 = arg0;
        if (this.field5823 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method1521(this.field5823);
            this.method1540(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)V", line = 479)
    public final void method262(int arg0, int arg1) throws class692 {
        if (this.field5818 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field5818.method695(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()V", line = 493)
    public final void method312() {
        if (!this.field5808) {
            this.field5822 = null;
            this.field5818 = null;
            this.field5802 = null;
            this.field5817 = null;
            this.field5816.method819(23738);
            for (class74 var1 = (class74) this.field5803.method3618(118); var1 != null; var1 = (class74) this.field5803.method3619(0)) {
                var1.method562();
            }
            this.field5803.method3615((byte) -104);
            this.method2546();
            if (this.field5824) {
                class394.method2462(115, false, true);
                this.field5824 = false;
            }
            this.method2557();
            class556.method3279(false);
            this.field5808 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lih;)V", line = 526)
    public final void method1444(class744 arg0) {
        this.field5821 = arg0;
        this.method2545(((class136) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)V", line = 532)
    public final void method1534(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1487(arg0, arg1, arg2, arg4, arg5);
        this.method1487(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1427(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method1427(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z", line = 538)
    private final boolean method2556(short arg0) {
        synchronized (this) {
            class239 var3 = super.field7623.method521(arg0, 118);
            if (var3 == null) {
                return false;
            } else {
                this.method2543(arg0, var3.field3566, var3.field3557, var3.field3561, var3.field3567, var3.field3565, var3.field3556, var3.field3570, var3.field3578, var3.field3579, var3.field3573, var3.field3562, var3.field3560, var3.field3577, var3.field3569, var3.field3576, var3.field3575, var3.field3572, var3.field3571, var3.field3564);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Ltj;)V", line = 555)
    public final void method1532(int arg0, class687[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field5814[var3++] = arg1[var4].method3873((byte) -7);
            field5814[var3++] = arg1[var4].method3867(false);
            field5814[var3++] = arg1[var4].method3870(84);
            field5814[var3++] = arg1[var4].method3866((byte) -43);
            field5809[var4] = arg1[var4].method3871(16043);
            field5814[var3++] = arg1[var4].method3868(6);
        }
        this.method2541(arg0, field5814, field5809);
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z", line = 576)
    public final boolean method1389() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V", line = 583)
    public final void method1434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2542(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lhe;)V", line = 585)
    public final void method1391(class577 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V", line = 590)
    private final void method2557() {
        System.gc();
        System.runFinalization();
        class556.method3277(-1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 600)
    public final void method1451(Canvas arg0) {
        if (arg0 != null) {
            class107 var2 = (class107) this.field5816.method812(124, (long) arg0.hashCode());
            this.field5818 = var2;
            this.method2551(var2);
        } else {
            this.field5818 = null;
            this.method2551((class107) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V", line = 635)
    public final void method1442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2547().method1074(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lvo;IIII)Lka;", line = 641)
    public final class284 method1463(class133 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class247(this, this.field5802, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method2541(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method1509();

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method1504();

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method1548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method2542(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method2543(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method346();

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method2544(class257 arg0);

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method2545(long arg0);

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method1449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method1487(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method1427(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method2546();

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method1411(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method1439(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method1399(int arg0);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method12(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method1488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method2548(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method1437();

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method1424(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method1531();

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method1474(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method1501(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method1407();

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method1454(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method273(int arg0);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method1402(int arg0, class573 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method2551(class107 arg0);

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method1457(float arg0);

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method2552(class270 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method1421(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method1412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method1529(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method1482();

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method1426();

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method1486(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method2554(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method1511(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method277();

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method2555(int arg0);

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method1415(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method308(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method1498(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method1544(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method1475(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method268(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method2558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class573 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method264(int arg0, int arg1);
}
