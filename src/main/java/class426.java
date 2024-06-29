import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class426 extends class570 implements class2 {

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "Z")
    private boolean field5598 = false;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "Lfca;")
    private class661 field5596 = new class661();

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
    private int field5612 = 4096;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
    private int field5610 = 4096;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "Lrda;")
    private class467 field5611 = new class467(4);

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "Z")
    private boolean field5617 = false;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "Loha;")
    private class465 field5613;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "[I")
    private static int[] field5597 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "[F")
    private static float[] field5602 = new float[20];

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "[I")
    private static int[] field5600 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "[B")
    private static byte[] field5603 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "[I")
    private static int[] field5599 = field5597;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "[I")
    public static int[] field5605 = field5597;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "[I")
    private static int[] field5601 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "[I")
    private static int[] field5606 = field5597;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "[F")
    private static float[] field5608 = field5602;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "[I")
    public static int[] field5604 = new int[6];

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "[S")
    private static short[] field5607 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
    public int field5615;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "Lp;")
    private class112 field5614;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "Loha;")
    private class465 field5609;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Lya;")
    private class79 field5595;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "[La;")
    private class175[] field5616;

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V", line = 3)
    protected final synchronized void finalize() {
        this.method3072(5);
        if (this.nativeid != 0L) {
            class18.method80(-1, this);
        }
    }

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Loha;", line = 11)
    public final class465 method994() {
        return new class142();
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z", line = 14)
    public final boolean method914() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Loha;", line = 20)
    public final class465 method880() {
        return this.field5609;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Lfga;", line = 25)
    public final class291 method927() {
        return new class291(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z", line = 28)
    public final boolean method992() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 31)
    public final void method888(Canvas arg0) {
        if (arg0 != null) {
            class112 var2 = (class112) this.field5611.method2616((long) arg0.hashCode(), (byte) -92);
            this.field5614 = var2;
            this.method2468(var2);
        } else {
            this.field5614 = null;
            this.method2468((class112) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Loha;)V", line = 46)
    public final void method991(class465 arg0) {
        this.field5609 = arg0;
        this.method2462(((class142) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 51)
    public final void method972(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V", line = 56)
    public final void method942(int[] arg0) {
        Dimension var2 = this.field5614.field1490.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lsu;IIII)Lka;", line = 62)
    public final class299 method930(class615 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class260(this, this.field5595, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)Ltea;", line = 65)
    public final class589 method956(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 71)
    public final void method889(Canvas arg0, int arg1, int arg2) {
        class112 var4 = (class112) this.field5611.method2616((long) arg0.hashCode(), (byte) 123);
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class112 var7 = new class112(this, arg0, arg1, arg2);
            this.field5611.method2619(var7, (long) arg0.hashCode(), -1);
        } else {
            if (var4.field1492 != arg1 || var4.field1493 != arg2) {
                var4.method655(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z", line = 96)
    private final boolean method2456(short arg0) {
        class284 var2 = super.field7199;
        synchronized (super.field7199) {
            if (!super.field7199.method1733(-1852, arg0)) {
                return false;
            } else {
                class191 var4 = super.field7199.method1732((byte) -114, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field2682 != 2) {
                        var6 = super.field7199.method1737(arg0, 128, 0.7F, true, 128, (byte) 45);
                    } else {
                        var6 = super.field7199.method1734(-25886, true, 128, 128, arg0, 0.7F);
                    }
                    this.method2465(arg0, var6, var4.field2681, var4.field2682, var4.field2678, var4.field2680, var4.field2664, var4.field2673, var4.field2672, var4.field2661, var4.field2662, var4.field2665, var4.field2679, var4.field2670, var4.field2674, var4.field2660, var4.field2663, var4.field2671, var4.field2668, var4.field2676, var4.field2677);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 121)
    public final void method892(int arg0) {
        this.field5610 = this.field5612 = arg0;
        if (this.field5615 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method939(this.field5615);
            this.method995(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()V", line = 128)
    public final void method970() {
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()V", line = 131)
    public final void method919() {
        if (!this.field5598) {
            this.field5616 = null;
            this.field5614 = null;
            this.field5595 = null;
            this.field5613 = null;
            this.field5611.method2617(28812);
            for (class79 var1 = (class79) this.field5596.method3591(0); var1 != null; var1 = (class79) this.field5596.method3600((byte) 81)) {
                var1.method494();
            }
            this.field5596.method3594(123);
            this.method2461();
            if (this.field5617) {
                class497.method2760(true, true, false);
                this.field5617 = false;
            }
            this.method2460();
            class18.method82((byte) 115);
            this.field5598 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()V", line = 167)
    public final void method909() {
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()V", line = 170)
    public final void method891() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V", line = 173)
    public final void method964(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class596 arg6, int arg7, int arg8) {
        this.method2453(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V", line = 177)
    public final void method939(int arg0) {
        this.field5615 = arg0;
        this.field5616 = new class175[this.field5615];
        for (int var2 = 0; var2 < this.field5615; ++var2) {
            this.field5616[var2] = new class175(this, this.field5610, this.field5612);
        }
    }

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z", line = 190)
    public final boolean method903() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lvi;Z)Lpu;", line = 197)
    public final class772 method977(class388 arg0, boolean arg1) {
        class326 var3 = new class326(this, arg0.field4951, arg0.field4949, arg0.field4947, 0, arg0.field4950, arg0.field4950, arg0.field4946);
        var3.method626(arg0.field4948, arg0.field4945, arg0.field4953, arg0.field4952);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lwq;)V", line = 203)
    public final void method912(class705 arg0) {
        if (arg0.field9317.method1145(62) != 0) {
            this.method2469(arg0, false);
            this.method2466().method1109(this, field5606, field5600, field5601, field5607, arg0.field9317.method1145(-53));
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V", line = 210)
    public final void method898(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()Loha;", line = 213)
    public final class465 method948() {
        return this.field5613;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lod;Lic;)Lmd;", line = 216)
    public final class649 method878(class539 arg0, class537 arg1) {
        return new class613(this, (class326) arg0, (class626) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()V", line = 219)
    public final void method999() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 222)
    public final class358 method890(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class531(this, this.field5595, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V", line = 226)
    public final void method935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2466().method1101(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "(I)V", line = 230)
    public final void method982(int arg0) {
        this.field5616[arg0].method1111();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lgu;", line = 235)
    public final class757 method913(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class655(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 240)
    public final void method931(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class15 {
        if (this.field5614 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field5614.method657(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z", line = 250)
    public final boolean method965() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V", line = 253)
    public final void method959(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V", line = 257)
    public final void method929(class270 arg0) {
        this.field5595 = (class79) arg0;
        this.method2454(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z", line = 261)
    public final boolean method926() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V", line = 264)
    private final void method2460() {
        System.gc();
        System.runFinalization();
        class18.method83(8797);
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)Lza;", line = 273)
    public final class270 method975(int arg0) {
        class79 var2 = new class79(this, arg0);
        this.field5596.method3593(var2, 15);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z", line = 280)
    public final boolean method993() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z", line = 283)
    public final boolean method906() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 287)
    public final void method989(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z", line = 293)
    public final boolean method960() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;", line = 296)
    private final Object method2464() {
        return new class328(this);
    }

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()La;", line = 302)
    public final class175 method2466() {
        for (int var1 = 0; var1 < this.field5615; ++var1) {
            if (this.field5616[var1].field2298 == Thread.currentThread()) {
                return this.field5616[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lne;[Lvi;Z)Lda;", line = 315)
    public final class420 method1002(class166 arg0, class388[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field4950;
            var5[var7] = arg1[var7].field4946;
            if (arg1[var7].field4947 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class605(this, this.field5595, arg0, arg1, (class772[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class758(this, this.field5595, arg0, arg1, (class772[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z", line = 354)
    public final boolean method953() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 359)
    public final void method881(Canvas arg0, int arg1, int arg2) {
        class112 var4 = (class112) this.field5611.method2616((long) arg0.hashCode(), (byte) -112);
        var4.method655(arg0, arg1, arg2);
        if (arg0 != null && this.field5614.field1490 == arg0) {
            this.method888(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 366)
    public final void method979(Canvas arg0) {
        if (this.field5614.field1490 == arg0) {
            this.method888((Canvas) null);
        }
        class112 var2 = (class112) this.field5611.method2616((long) arg0.hashCode(), (byte) 43);
        if (var2 != null) {
            var2.method1946(-10364);
            var2.method654();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lmd;)V", line = 380)
    public final void method905(class649 arg0) {
        class613 var2 = (class613) arg0;
        this.method2455(var2.field7734.nativeid, var2.field7733.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 383)
    public final void method984(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V", line = 390)
    public final void method973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2463(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;", line = 393)
    public final class596 method947(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class293(this, this.field5595, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ltea;)V", line = 395)
    public final void method910(class589 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)Lic;", line = 398)
    public final class537 method938(int arg0, int arg1) {
        return new class626(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lgu;)V", line = 402)
    public final void method908(int arg0, class757[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field5599[var3++] = arg1[var4].method4121((byte) -124);
            field5599[var3++] = arg1[var4].method4117(true);
            field5599[var3++] = arg1[var4].method4123(22290);
            field5599[var3++] = arg1[var4].method4122(-117);
            field5608[var4] = arg1[var4].method4120(-127);
            field5599[var3++] = arg1[var4].method4124(false);
        }
        this.method2457(arg0, field5599, field5608);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z", line = 420)
    public final boolean method879() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I", line = 425)
    public final int method886(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)Lod;", line = 428)
    public final class539 method1001(int arg0, int arg1) {
        return this.method990(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lwq;I)V", line = 437)
    public final void method980(class705 arg0, int arg1) {
        this.method2469(arg0, false);
        this.method2466().method1109(this, field5606, field5600, field5601, field5607, arg0.field9317.method1145(-74));
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z", line = 442)
    public final boolean method899() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "(I)V", line = 446)
    public final void method995(int arg0) {
        this.field5616[arg0].method1117();
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I", line = 451)
    public final int method941(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z", line = 458)
    public final boolean method917() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V", line = 461)
    public class426(Canvas arg0, class284 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class382.method2194("sw3d", 31749)) {
                throw new RuntimeException("");
            } else {
                class18.method81((byte) 25);
                this.method2470(super.field7199, 0, 0);
                class385.method2206(1708, true, false);
                this.field5617 = true;
                this.field5613 = new class142();
                this.method991(new class142());
                this.method939(1);
                this.method995(0);
                if (arg0 != null) {
                    this.method889(arg0, arg2, arg3);
                    this.method888(arg0);
                }
            }
        } catch (Throwable var5) {
            this.method3072(5);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V", line = 489)
    public final void method963(int arg0) {
        class18.method83(8797);
        this.method2458(arg0);
        for (class79 var2 = (class79) this.field5596.method3591(0); var2 != null; var2 = (class79) this.field5596.method3600((byte) 46)) {
            var2.method493();
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V", line = 502)
    public final void method911(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method896(arg0, arg1, arg2, arg4, arg5);
        this.method896(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method936(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method936(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ltea;Ltea;FLtea;)Ltea;", line = 508)
    public final class589 method920(class589 arg0, class589 arg1, float arg2, class589 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z", line = 512)
    private final boolean method2467(short arg0) {
        synchronized (this) {
            class191 var3 = super.field7199.method1732((byte) -58, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method2459(arg0, var3.field2681, var3.field2682, var3.field2678, var3.field2680, var3.field2664, var3.field2673, var3.field2672, var3.field2661, var3.field2662, var3.field2665, var3.field2679, var3.field2670, var3.field2674, var3.field2660, var3.field2663, var3.field2671, var3.field2668, var3.field2676, var3.field2677);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V", line = 522)
    public final void method983(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()V", line = 524)
    public final void method943() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lpu;", line = 540)
    public final class772 method955(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class326(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lpu;", line = 543)
    public final class772 method990(int arg0, int arg1, boolean arg2) {
        return new class326(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()V", line = 554)
    public final void method962() {
        this.method888(this.field5614.field1490);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lwq;Z)V", line = 574)
    private final void method2469(class705 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class165 var8 = (class165) arg0.field9317.method1146((byte) -128); var8 != null; var8 = (class165) arg0.field9317.method1140((byte) 81)) {
            field5606[var3++] = var8.field2187;
            field5606[var3++] = var8.field2190;
            field5606[var3++] = var8.field2185;
            field5600[var4++] = var8.field2191;
            field5607[var6++] = (short) var8.field2186;
            field5601[var5++] = var8.field2192;
            if (arg1) {
                field5603[var7++] = var8.field2183;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)V", line = 619)
    public final void method925(int arg0, int arg1) throws class15 {
        if (this.field5614 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field5614.method658(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lpu;", line = 629)
    public final class772 method885(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class326(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V", line = 634)
    public final void method934(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()I", line = 639)
    public final int method893() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()Z", line = 653)
    public final boolean method900() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 656)
    public final void method932(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class596 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method988(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method2453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class596 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method5(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method2454(class270 arg0);

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method954(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method987(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method951();

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method2455(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method883(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method2457(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method976(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method940(int arg0, class596 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method924(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method2458(int arg0);

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method971(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method915(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method884(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method950();

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method969(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method967(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method896(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method2459(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method997(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method901(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method949();

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method2461();

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method985();

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method946(float arg0);

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method2462(long arg0);

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method2463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method998(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method937();

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method2465(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method952(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method928(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method968(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method978(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method981();

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method916();

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method957();

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method921(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method2468(class112 arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method894(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method918();

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method936(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method944(int arg0);

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method923(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method2470(class284 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method907(int arg0);
}
